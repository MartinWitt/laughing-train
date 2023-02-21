# parquet-mr 
 
# Bad smells
I found 1827 bad smells with 263 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MissortedModifiers | 239 | false |
| ReturnNull | 174 | false |
| RedundantFieldInitialization | 172 | false |
| UnnecessaryFullyQualifiedName | 150 | false |
| UnnecessaryModifier | 122 | true |
| BoundedWildcard | 107 | false |
| DeprecatedIsStillUsed | 48 | false |
| UNUSED_IMPORT | 45 | false |
| UtilityClassWithoutPrivateConstructor | 44 | true |
| SystemOutErr | 29 | false |
| AssignmentToMethodParameter | 29 | false |
| StringConcatenationInsideStringBufferAppend | 29 | false |
| UnusedAssignment | 28 | false |
| DataFlowIssue | 28 | false |
| NonProtectedConstructorInAbstractClass | 26 | true |
| PointlessBitwiseExpression | 25 | false |
| FinalStaticMethod | 22 | false |
| RedundantSuppression | 22 | false |
| StaticInitializerReferencesSubClass | 21 | false |
| NestedAssignment | 21 | false |
| ZeroLengthArrayInitialization | 19 | false |
| UnnecessaryLocalVariable | 17 | true |
| UnstableApiUsage | 17 | false |
| ConstantValue | 17 | false |
| UnnecessaryBoxing | 17 | false |
| InnerClassMayBeStatic | 16 | true |
| SizeReplaceableByIsEmpty | 15 | true |
| AbstractClassNeverImplemented | 14 | false |
| ReplaceAssignmentWithOperatorAssignment | 13 | false |
| LongLiteralsEndingWithLowercaseL | 12 | false |
| UnnecessaryToStringCall | 12 | true |
| FinalPrivateMethod | 11 | false |
| IgnoreResultOfCall | 10 | false |
| SetReplaceableByEnumSet | 10 | false |
| CStyleArrayDeclaration | 9 | false |
| UnnecessarySemicolon | 9 | false |
| EnumSwitchStatementWhichMissesCases | 9 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 8 | false |
| NonSerializableFieldInSerializableClass | 8 | false |
| EqualsAndHashcode | 7 | false |
| DuplicateBranchesInSwitch | 7 | false |
| StringBufferReplaceableByString | 7 | false |
| UnnecessarySuperQualifier | 7 | false |
| Anonymous2MethodRef | 7 | false |
| ClassNameSameAsAncestorName | 6 | false |
| RedundantArrayCreation | 6 | true |
| Java8MapApi | 6 | false |
| Convert2Lambda | 6 | false |
| WhileCanBeForeach | 5 | false |
| StringOperationCanBeSimplified | 5 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 5 | false |
| NonShortCircuitBoolean | 5 | false |
| ManualMinMaxCalculation | 5 | false |
| AbstractMethodCallInConstructor | 5 | false |
| KeySetIterationMayUseEntrySet | 4 | false |
| IntegerMultiplicationImplicitCastToLong | 4 | false |
| MethodOverloadsParentMethod | 4 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| WhileLoopSpinsOnField | 4 | false |
| IOResource | 4 | false |
| AssignmentToForLoopParameter | 4 | false |
| MissingDeprecatedAnnotation | 4 | false |
| CommentedOutCode | 3 | false |
| AssignmentToStaticFieldFromInstanceMethod | 3 | false |
| AccessStaticViaInstance | 3 | false |
| RedundantMethodOverride | 3 | false |
| JavaReflectionMemberAccess | 3 | false |
| CharsetObjectCanBeUsed | 3 | false |
| StaticCallOnSubclass | 3 | false |
| UnnecessaryReturn | 3 | true |
| EmptyMethod | 3 | false |
| Convert2MethodRef | 3 | false |
| EmptyStatementBody | 2 | false |
| SynchronizeOnThis | 2 | false |
| CastConflictsWithInstanceof | 2 | false |
| StaticPseudoFunctionalStyleMethod | 2 | false |
| DuplicateExpressions | 2 | false |
| DefaultAnnotationParam | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| NullArgumentToVariableArgMethod | 2 | false |
| FieldMayBeStatic | 2 | false |
| UnnecessaryContinue | 2 | false |
| EqualsWhichDoesntCheckParameterClass | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| PointlessArithmeticExpression | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| TrivialStringConcatenation | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| DuplicateThrows | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| SamePackageImport | 1 | false |
| JavaReflectionInvocation | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| PrimitiveArrayArgumentToVariableArgMethod | 1 | false |
| UseCompareMethod | 1 | false |
| PointlessBooleanExpression | 1 | true |
| StringEquality | 1 | false |
| RedundantClassCall | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| RedundantImplements | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| InstanceofCatchParameter | 1 | false |
| ArrayEquality | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| OptionalIsPresent | 1 | false |
| MismatchedJavadocCode | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[pathList.size()\]'
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
            List<String> pathList = columnKeyStruct.getPath_in_schema();
            byte[] columnKeyMetadata = columnKeyStruct.getKey_metadata();
            columnPath = ColumnPath.get(pathList.toArray(new String[pathList.size()]));
            byte[] encryptedMetadataBuffer = columnChunk.getEncrypted_column_metadata();
            column = ColumnChunkMetaData.getWithEncryptedMetadata(this, columnPath,
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/AADPrefixVerifier.java`
#### Snippet
```java
   * @throws ParquetCryptoRuntimeException Throw exception if AAD prefix is wrong.
   */
  public void verify(byte[] aadPrefix) throws ParquetCryptoRuntimeException;
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/AesMode.java`
#### Snippet
```java
  private final String cipherName;

  private AesMode(String cipherName) {
    this.cipherName = cipherName;
  }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/ModuleCipherFactory.java`
#### Snippet
```java
    private final byte value;

    private ModuleType(byte value) {
      this.value = value;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/DecryptionKeyRetriever.java`
#### Snippet
```java
   * @throws ParquetCryptoRuntimeException thrown upon key retrieval problems unrelated to access control
   */
  public byte[] getKey(byte[] keyMetaData) throws KeyAccessDeniedException, ParquetCryptoRuntimeException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyMaterialStore.java`
#### Snippet
```java
   * Remove key material from persistent store. Used in key rotation.
   */
  public void removeMaterial();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyMaterialStore.java`
#### Snippet
```java
   * @param targetKeyMaterialStore target store
   */
  public void moveMaterialTo(FileKeyMaterialStore targetKeyMaterialStore);
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyMaterialStore.java`
#### Snippet
```java
   * @return key material
   */
  public String getKeyMaterial(String keyIDInFile);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyMaterialStore.java`
#### Snippet
```java
   * @return Set of all key IDs in this store (for the given Parquet file) 
   */
  public Set<String> getKeyIDSet();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyMaterialStore.java`
#### Snippet
```java
   * @param keyMaterial key material
   */
  public void addKeyMaterial(String keyIDInFile, String keyMaterial);
  
  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyMaterialStore.java`
#### Snippet
```java
   * save material in persistent store.
   */
  public void saveMaterial();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyMaterialStore.java`
#### Snippet
```java
   * @param tempStore set true if this is a temporary store, used in key rotation
   */
  public void initialize(Path parquetFilePath, Configuration hadoopConfig, boolean tempStore);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
   * @throws KeyAccessDeniedException unauthorized to unwrap with the given master key
   */
  public byte[] unwrapKey(String wrappedKey, String masterKeyIdentifier)
      throws KeyAccessDeniedException;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
   * @throws KeyAccessDeniedException unauthorized to initialize the KMS client
   */
  public void initialize(Configuration configuration, String kmsInstanceID, String kmsInstanceURL, String accessToken) 
      throws KeyAccessDeniedException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
  public static final String KMS_INSTANCE_ID_DEFAULT = "DEFAULT";
  public static final String KMS_INSTANCE_URL_DEFAULT = "DEFAULT";
  public static final String KEY_ACCESS_TOKEN_DEFAULT = "DEFAULT";
  
  /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
  public static final String KMS_INSTANCE_ID_DEFAULT = "DEFAULT";
  public static final String KMS_INSTANCE_URL_DEFAULT = "DEFAULT";
  public static final String KEY_ACCESS_TOKEN_DEFAULT = "DEFAULT";
  
  /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
  public static final String KMS_INSTANCE_ID_DEFAULT = "DEFAULT";
  public static final String KMS_INSTANCE_URL_DEFAULT = "DEFAULT";
  public static final String KEY_ACCESS_TOKEN_DEFAULT = "DEFAULT";
  
  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
   * @throws KeyAccessDeniedException unauthorized to encrypt with the given master key
   */
  public String wrapKey(byte[] keyBytes, String masterKeyIdentifier)
      throws KeyAccessDeniedException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
  
  public static final String KMS_INSTANCE_ID_DEFAULT = "DEFAULT";
  public static final String KMS_INSTANCE_URL_DEFAULT = "DEFAULT";
  public static final String KEY_ACCESS_TOKEN_DEFAULT = "DEFAULT";
  
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
  
  public static final String KMS_INSTANCE_ID_DEFAULT = "DEFAULT";
  public static final String KMS_INSTANCE_URL_DEFAULT = "DEFAULT";
  public static final String KEY_ACCESS_TOKEN_DEFAULT = "DEFAULT";
  
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
  
  public static final String KMS_INSTANCE_ID_DEFAULT = "DEFAULT";
  public static final String KMS_INSTANCE_URL_DEFAULT = "DEFAULT";
  public static final String KEY_ACCESS_TOKEN_DEFAULT = "DEFAULT";
  
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
public interface KmsClient {
  
  public static final String KMS_INSTANCE_ID_DEFAULT = "DEFAULT";
  public static final String KMS_INSTANCE_URL_DEFAULT = "DEFAULT";
  public static final String KEY_ACCESS_TOKEN_DEFAULT = "DEFAULT";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
public interface KmsClient {
  
  public static final String KMS_INSTANCE_ID_DEFAULT = "DEFAULT";
  public static final String KMS_INSTANCE_URL_DEFAULT = "DEFAULT";
  public static final String KEY_ACCESS_TOKEN_DEFAULT = "DEFAULT";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KmsClient.java`
#### Snippet
```java
public interface KmsClient {
  
  public static final String KMS_INSTANCE_ID_DEFAULT = "DEFAULT";
  public static final String KMS_INSTANCE_URL_DEFAULT = "DEFAULT";
  public static final String KEY_ACCESS_TOKEN_DEFAULT = "DEFAULT";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ParquetOutputFormat.class);

  public static enum JobSummaryLevel {
    /**
     * Write no summary files
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnIndexValidator.java`
#### Snippet
```java
  }

  static interface StatValue extends Comparable<StatValue> {
    int compareToValue(ColumnReader reader);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
  }

  private static interface MetadataFilterVisitor<T, E extends Throwable> {
    T visit(NoFilter filter) throws E;
    T visit(SkipMetadataFilter filter) throws E;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/counters/ICounter.java`
#### Snippet
```java
public interface ICounter {
  public void increment(long val);
  public long getCount();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/counters/ICounter.java`
#### Snippet
```java
 */
public interface ICounter {
  public void increment(long val);
  public long getCount();

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/counters/CounterLoader.java`
#### Snippet
```java
 */
public interface CounterLoader {
  public ICounter getCounterByNameAndFlag(String groupName, String counterName, String counterFlag);
}

```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java

  // File creation modes
  public static enum Mode {
    CREATE,
    OVERWRITE
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * Close the related output stream and release any resources
   */
  abstract public void close();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * Close the related output stream and release any resources
   */
  abstract public void close();

  /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return approximate size of the buffered encoded binary data
   */
  abstract public long getBufferedSize();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return approximate size of the buffered encoded binary data
   */
  abstract public long getBufferedSize();

  /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return a formated string representing memory usage per column
   */
  abstract public String memUsageString();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return a formated string representing memory usage per column
   */
  abstract public String memUsageString();

  /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return the column writer for the given column
   */
  abstract public ColumnWriter getColumnWriter(ColumnDescriptor path);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return the column writer for the given column
   */
  abstract public ColumnWriter getColumnWriter(ColumnDescriptor path);

  /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * called to notify of record boundaries
   */
  abstract public void endRecord();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * called to notify of record boundaries
   */
  abstract public void endRecord();

  /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return approximate size used in memory
   */
  abstract public long getAllocatedSize();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return approximate size used in memory
   */
  abstract public long getAllocatedSize();

  /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * when we are done writing to flush to the underlying storage
   */
  abstract public void flush();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * when we are done writing to flush to the underlying storage
   */
  abstract public void flush();

  /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnReadStore.java`
#### Snippet
```java
   * @return the column reader for that descriptor
   */
  abstract public ColumnReader getColumnReader(ColumnDescriptor path);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnReadStore.java`
#### Snippet
```java
   * @return the column reader for that descriptor
   */
  abstract public ColumnReader getColumnReader(ColumnDescriptor path);

}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/column/page/DataPage.java`
#### Snippet
```java
  public abstract <T> T accept(Visitor<T> visitor);

  public static interface Visitor<T> {

    T visit(DataPageV1 dataPageV1);
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `parquet-column/src/main/java/org/apache/parquet/column/values/rle/RunLengthBitPackingHybridDecoder.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(RunLengthBitPackingHybridDecoder.class);

  private static enum MODE { RLE, PACKED }

  private final int bitWidth;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
  }

  public static interface DoublePredicateFunction {
    boolean functionToApply(double input);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
public class ColumnPredicates {

  public static interface Predicate {
    boolean apply(ColumnReader input);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
  /* provide the following to avoid boxing primitives */

  public static interface IntegerPredicateFunction {
    boolean functionToApply(int input);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
  }

  public static interface FloatPredicateFunction {
    boolean functionToApply(float input);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
  }

  public static interface BooleanPredicateFunction {
    boolean functionToApply(boolean input);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
  }

  public static interface PredicateFunction <T> {
    boolean functionToApply(T input);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
  }

  public static interface LongPredicateFunction {
    boolean functionToApply(long input);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
   * Constraint on the repetition of a field
   */
  public static enum Repetition {
    /**
     * exactly 1
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/compat/FilterCompat.java`
#### Snippet
```java
  }

  public static interface Filter {
    <R> R accept(Visitor<R> visitor);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/compat/FilterCompat.java`
#### Snippet
```java
   * per the visitor pattern.
   */
  public static interface Visitor<T> {
    T visit(FilterPredicateCompat filterPredicateCompat);
    T visit(UnboundRecordFilterCompat unboundRecordFilterCompat);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/FilterPredicate.java`
#### Snippet
```java
   * @param <R> return type of the visitor
   */
  public static interface Visitor<R> {
    <T extends Comparable<T>> R visit(Eq<T> eq);
    <T extends Comparable<T>> R visit(NotEq<T> notEq);
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/FilterPredicate.java`
#### Snippet
```java
   * @param <R> return type of the visitor
   */
  public static interface Visitor<R> {
    <T extends Comparable<T>> R visit(Eq<T> eq);
    <T extends Comparable<T>> R visit(NotEq<T> notEq);
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
    public final Class<?> javaType;

    private PrimitiveTypeName(String getMethod, Class<?> javaType) {
      this.getMethod = getMethod;
      this.javaType = javaType;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
public final class PrimitiveType extends Type {

  public static interface PrimitiveTypeNameConverter<T, E extends Exception> {

    T convertFLOAT(PrimitiveTypeName primitiveTypeName) throws E;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
   * Supported Primitive types
   */
  public static enum PrimitiveTypeName {
    INT64("getLong", Long.TYPE) {
      @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
   * A Visitor for an {@link IncrementallyUpdatedFilterPredicate}, per the visitor pattern.
   */
  public static interface Visitor {
    boolean visit(ValueInspector p);
    boolean visit(And and);
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
   * A Visitor for an {@link IncrementallyUpdatedFilterPredicate}, per the visitor pattern.
   */
  public static interface Visitor {
    boolean visit(ValueInspector p);
    boolean visit(And and);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
  }

  public static final class Or extends BinaryLogical {
    Or(IncrementallyUpdatedFilterPredicate left, IncrementallyUpdatedFilterPredicate right) {
      super(left, right);
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
  }

  public static final class Or extends BinaryLogical {
    Or(IncrementallyUpdatedFilterPredicate left, IncrementallyUpdatedFilterPredicate right) {
      super(left, right);
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java

  // base class for and / or
  static abstract class BinaryLogical implements IncrementallyUpdatedFilterPredicate {
    private final IncrementallyUpdatedFilterPredicate left;
    private final IncrementallyUpdatedFilterPredicate right;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
   * It is stateful, and needs to be rest after use.
   */
  public static abstract class ValueInspector implements IncrementallyUpdatedFilterPredicate {
    // package private constructor
    ValueInspector() { }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
   * It is stateful, and needs to be rest after use.
   */
  public static abstract class ValueInspector implements IncrementallyUpdatedFilterPredicate {
    // package private constructor
    ValueInspector() { }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
  }

  public static final class And extends BinaryLogical {
    And(IncrementallyUpdatedFilterPredicate left, IncrementallyUpdatedFilterPredicate right) {
      super(left, right);
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
  }

  public static final class And extends BinaryLogical {
    And(IncrementallyUpdatedFilterPredicate left, IncrementallyUpdatedFilterPredicate right) {
      super(left, right);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/OffsetIndex.java`
#### Snippet
```java
   * @return the index of the first row in the page
   */
  public long getFirstRowIndex(int pageIndex);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/OffsetIndex.java`
#### Snippet
```java
   * @return the offset of the page in the file
   */
  public long getOffset(int pageIndex);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/OffsetIndex.java`
#### Snippet
```java
   * @return the original ordinal of the page in the column chunk
   */
  public default int getPageOrdinal(int pageIndex) {
    return pageIndex;
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/OffsetIndex.java`
#### Snippet
```java
   * @return the calculated index of the last row of the given page
   */
  public default long getLastRowIndex(int pageIndex, long rowGroupRowCount) {
    int nextPageIndex = pageIndex + 1;
    return (nextPageIndex >= getPageCount() ? rowGroupRowCount : getFirstRowIndex(nextPageIndex)) - 1;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/OffsetIndex.java`
#### Snippet
```java
   * @return the compressed size of the page (including page header)
   */
  public int getCompressedPageSize(int pageIndex);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/OffsetIndex.java`
#### Snippet
```java
   * @return the number of pages
   */
  public int getPageCount();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndex.java`
#### Snippet
```java
   * @return the boundary order of the min/max values; used for converting to the related thrift object
   */
  public BoundaryOrder getBoundaryOrder();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndex.java`
#### Snippet
```java
   * @return the unmodifiable list of null counts; used for converting to the related thrift object
   */
  public List<Long> getNullCounts();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndex.java`
#### Snippet
```java
   * @return the list of the min values as {@link ByteBuffer}s; used for converting to the related thrift object
   */
  public List<ByteBuffer> getMinValues();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndex.java`
#### Snippet
```java
   * @return the unmodifiable list of null pages; used for converting to the related thrift object
   */
  public List<Boolean> getNullPages();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndex.java`
#### Snippet
```java
   * @return the list of the max values as {@link ByteBuffer}s; used for converting to the related thrift object
   */
  public List<ByteBuffer> getMaxValues();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-column/src/main/java/org/apache/parquet/internal/filter2/columnindex/ColumnIndexStore.java`
#### Snippet
```java
   * Exception thrown in case of an offset index is missing for any of the columns.
   */
  public static class MissingOffsetIndexException extends ParquetRuntimeException {
    public MissingOffsetIndexException(ColumnPath path) {
      super("No offset index for column " + path.toDotString() + " is available; Unable to do filtering");
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-column/src/main/java/org/apache/parquet/internal/filter2/columnindex/ColumnIndexStore.java`
#### Snippet
```java
   * Exception thrown in case of an offset index is missing for any of the columns.
   */
  public static class MissingOffsetIndexException extends ParquetRuntimeException {
    public MissingOffsetIndexException(ColumnPath path) {
      super("No offset index for column " + path.toDotString() + " is available; Unable to do filtering");
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java

  public static interface SupportsEqNotEq { } // marker for columns that can be used with eq() and notEq()
  public static interface SupportsLtGt extends SupportsEqNotEq { } // marker for columns that can be used with lt(), ltEq(), gt(), gtEq()

  public static final class IntColumn extends Column<Integer> implements SupportsLtGt {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java
  }

  public static interface SupportsEqNotEq { } // marker for columns that can be used with eq() and notEq()
  public static interface SupportsLtGt extends SupportsEqNotEq { } // marker for columns that can be used with lt(), ltEq(), gt(), gtEq()

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ConvertedField.java`
#### Snippet
```java
   * entirely.
   */
  public static final class SentinelUnion extends ConvertedFieldBase {
    private final Type type;

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ConvertedField.java`
#### Snippet
```java
   * entirely.
   */
  public static final class SentinelUnion extends ConvertedFieldBase {
    private final Type type;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ConvertedField.java`
#### Snippet
```java
   * Signals that the user explicitly requested either this field or one of its children.
   */
  public static final class Keep extends ConvertedFieldBase {
    private final Type type;

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ConvertedField.java`
#### Snippet
```java
   * Signals that the user explicitly requested either this field or one of its children.
   */
  public static final class Keep extends ConvertedFieldBase {
    private final Type type;

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ConvertedField.java`
#### Snippet
```java
  SentinelUnion asSentinelUnion();

  static abstract class ConvertedFieldBase implements ConvertedField {
    private final FieldsPath path;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ConvertedField.java`
#### Snippet
```java
   * Signals the user did not request this field nor its children.
   */
  public static final class Drop extends ConvertedFieldBase {
    public Drop(FieldsPath path) {
      super(path);
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ConvertedField.java`
#### Snippet
```java
   * Signals the user did not request this field nor its children.
   */
  public static final class Drop extends ConvertedFieldBase {
    public Drop(FieldsPath path) {
      super(path);
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftTypeID.java`
#### Snippet
```java
  }

  private ThriftTypeID(byte thriftType) {
    this(thriftType, thriftType, false, null);
  }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftTypeID.java`
#### Snippet
```java
  }

  private ThriftTypeID(byte thriftType, byte serializedThriftType, Class<? extends ThriftType> clss) {
    this(thriftType, serializedThriftType, false, clss);
  }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftTypeID.java`
#### Snippet
```java
  }

  private ThriftTypeID(byte thriftType, boolean complex, Class<? extends ThriftType> clss) {
    this(thriftType, thriftType, complex, clss);
  }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftTypeID.java`
#### Snippet
```java
  private final byte serializedThriftType;

  private ThriftTypeID(byte thriftType, Class<? extends ThriftType> clss) {
    this(thriftType, thriftType, clss);
  }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftTypeID.java`
#### Snippet
```java
  }

  private ThriftTypeID(byte thriftType, byte serializedThriftType, boolean complex, Class<? extends ThriftType> clss) {
    this.thriftType = thriftType;
    this.serializedThriftType = serializedThriftType;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftField.java`
#### Snippet
```java
    private final byte requirement;

    private Requirement(byte requirement) {
      this.requirement = requirement;
    }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftField.java`
#### Snippet
```java

public class ThriftField {
  public static enum Requirement {
    REQUIRED(TFieldRequirementType.REQUIRED),
    OPTIONAL(TFieldRequirementType.OPTIONAL),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  interface Events {

    public void start();

    public void end();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
    public void start();

    public void end();

  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/FieldProjectionFilter.java`
#### Snippet
```java
   * A filter that keeps all of the columns.
   */
  public static final FieldProjectionFilter ALL_COLUMNS = new FieldProjectionFilter() {
    @Override
    public boolean keep(FieldsPath path) {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/FieldProjectionFilter.java`
#### Snippet
```java
   * A filter that keeps all of the columns.
   */
  public static final FieldProjectionFilter ALL_COLUMNS = new FieldProjectionFilter() {
    @Override
    public boolean keep(FieldsPath path) {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/FieldProjectionFilter.java`
#### Snippet
```java
   * A filter that keeps all of the columns.
   */
  public static final FieldProjectionFilter ALL_COLUMNS = new FieldProjectionFilter() {
    @Override
    public boolean keep(FieldsPath path) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-format-structures/src/main/java/org/apache/parquet/format/BlockCipher.java`
#### Snippet
```java


  public interface Encryptor{
    /**
     * Encrypts the plaintext.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-format-structures/src/main/java/org/apache/parquet/format/BlockCipher.java`
#### Snippet
```java
     * @throws IOException - Stream I/O problems
     */
    public byte[] decrypt(InputStream from, byte[] AAD) throws IOException;
  }
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-format-structures/src/main/java/org/apache/parquet/format/BlockCipher.java`
#### Snippet
```java


  public interface Decryptor{  
    /**
     * Decrypts the ciphertext. 
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-format-structures/src/main/java/org/apache/parquet/format/BlockCipher.java`
#### Snippet
```java
     * Parquet Modular Encryption specification.
     */
    public byte[] encrypt(byte[] plaintext, byte[] AAD);
  }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-format-structures/src/main/java/org/apache/parquet/format/BlockCipher.java`
#### Snippet
```java
     * @return plaintext - starts at offset 0 of the output value, and fills up the entire byte array.
     */
    public byte[] decrypt(byte[] lengthAndCiphertext, byte[] AAD);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/FieldConsumer.java`
#### Snippet
```java
   * @throws TException if any thrift related error occurs during the reading
   */
  public void consumeField(TProtocol protocol, EventBasedThriftReader eventBasedThriftReader, short id, byte type) throws TException;

}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java
  }

  public static enum ColumnIndexUsage implements ReadConfigurator {
    WITHOUT_COLUMN_INDEX {
      @Override
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java

  interface ReadConfigurator {
    static ReadConfigurator DEFAULT = new ReadConfigurator() {
      @Override
      public <T> Builder<T> configureBuilder(Builder<T> builder) {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java
  }

  public static enum ColumnCharacteristic {
    SORTED {
      @Override
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java

  interface WriteConfigurator {
    static WriteConfigurator DEFAULT = new WriteConfigurator() {
      @Override
      public <T> org.apache.parquet.hadoop.ParquetWriter.Builder<T, ?> configureBuilder(
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/Consumers.java`
#### Snippet
```java
   * @param <T> the type of consumed objects
   */
  public static interface Consumer<T> {
    void consume(T t);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-common/src/main/java/org/apache/parquet/glob/GlobNode.java`
#### Snippet
```java
   * the requirements of its children must each be satisfied.
   */
  static class GlobNodeSequence implements GlobNode {
    private final List<GlobNode> children;

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-common/src/main/java/org/apache/parquet/glob/GlobNode.java`
#### Snippet
```java
   * and {a,b} are OneOfs.
   */
  static class OneOf implements GlobNode {
    private final List<GlobNode> children;

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `parquet-common/src/main/java/org/apache/parquet/glob/GlobNode.java`
#### Snippet
```java
   * For example, in pre{x,y{a,b}}post pre, x, y, z, b, and post are all Atoms.
   */
  static class Atom implements GlobNode {
    private final String s;

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `parquet-common/src/main/java/org/apache/parquet/glob/GlobNode.java`
#### Snippet
```java
  <R> R accept(Visitor<R> visitor);

  static interface Visitor<T> {
    T visit(Atom atom);
    T visit(OneOf oneOf);
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `parquet-common/src/main/java/org/apache/parquet/hadoop/metadata/CompressionCodecName.java`
#### Snippet
```java
  private final String extension;

  private CompressionCodecName(String hadoopCompressionCodecClass, CompressionCodec parquetCompressionCodec, String extension) {
    this.hadoopCompressionCodecClass = hadoopCompressionCodecClass;
    this.parquetCompressionCodec = parquetCompressionCodec;
```

## RuleId[ruleID=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * 1024 * 1024` can be replaced with '1024 \* 1024'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/MemoryManager.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MemoryManager.class);
  static final float DEFAULT_MEMORY_POOL_RATIO = 0.95f;
  static final long DEFAULT_MIN_MEMORY_ALLOCATION = 1 * 1024 * 1024; // 1MB
  private final float memoryPoolRatio;

```

## RuleId[ruleID=EmptyStatementBody]
### EmptyStatementBody
`for` statement has empty body
in `parquet-column/src/main/java/org/apache/parquet/column/values/deltastrings/DeltaByteArrayWriter.java`
#### Snippet
```java
    int length = previous.length < vb.length ? previous.length : vb.length;
    // find the number of matching prefix bytes between this value and the previous one
    for(i = 0; (i < length) && (previous[i] == vb[i]); i++);
    prefixLengthWriter.writeInteger(i);
    suffixWriter.writeBytes(v.slice(i, vb.length - i));
```

### EmptyStatementBody
`for` statement has empty body
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
        thriftFieldIdToParquetField[thriftType.getChildren().get(i).getFieldId()] = schema.getChild(i);
      }
      for (ThriftField field : thriftType.getChildren()) {
      }
      this.schema = schema;
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
      long[] reverseDictionary = new long[getDictionarySize()];
      ObjectIterator<Long2IntMap.Entry> entryIterator = longDictionaryContent.long2IntEntrySet().iterator();
      while (entryIterator.hasNext()) {
        Long2IntMap.Entry entry = entryIterator.next();
        reverseDictionary[entry.getIntValue()] = entry.getLongKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
      int[] reverseDictionary = new int[getDictionarySize()];
      ObjectIterator<Int2IntMap.Entry> entryIterator = intDictionaryContent.int2IntEntrySet().iterator();
      while (entryIterator.hasNext()) {
        Int2IntMap.Entry entry = entryIterator.next();
        reverseDictionary[entry.getIntValue()] = entry.getIntKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
      float[] reverseDictionary = new float[getDictionarySize()];
      ObjectIterator<Float2IntMap.Entry> entryIterator = floatDictionaryContent.float2IntEntrySet().iterator();
      while (entryIterator.hasNext()) {
        Float2IntMap.Entry entry = entryIterator.next();
        reverseDictionary[entry.getIntValue()] = entry.getFloatKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
      double[] reverseDictionary = new double[getDictionarySize()];
      ObjectIterator<Double2IntMap.Entry> entryIterator = doubleDictionaryContent.double2IntEntrySet().iterator();
      while (entryIterator.hasNext()) {
        Double2IntMap.Entry entry = entryIterator.next();
        reverseDictionary[entry.getIntValue()] = entry.getDoubleKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
      IntSet matchingIndexesForNull = new IntOpenHashSet();  // for null
      Iterator<T> it = values.iterator();
      while(it.hasNext()) {
        T value = it.next();
        if (value == null) {
```

## RuleId[ruleID=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass IntComparator from superclass PrimitiveComparator initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  };

  static final PrimitiveComparator<Integer> UNSIGNED_INT32_COMPARATOR = new IntComparator() {
    @Override
    public int compare(int i1, int i2) {
```

### StaticInitializerReferencesSubClass
Referencing subclass IntComparator from superclass PrimitiveComparator initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  }

  static final PrimitiveComparator<Integer> SIGNED_INT32_COMPARATOR = new IntComparator() {
    @Override
    public int compare(int i1, int i2) {
```

### StaticInitializerReferencesSubClass
Referencing subclass LongComparator from superclass PrimitiveComparator initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  };

  static final PrimitiveComparator<Long> UNSIGNED_INT64_COMPARATOR = new LongComparator() {
    @Override
    public int compare(long l1, long l2) {
```

### StaticInitializerReferencesSubClass
Referencing subclass BinaryComparator from superclass PrimitiveComparator initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
   * negative, 0x00 for positive values).
   */
  static final PrimitiveComparator<Binary> BINARY_AS_SIGNED_INTEGER_COMPARATOR = new BinaryComparator() {
    private static final int NEGATIVE_PADDING = 0xFF;
    private static final int POSITIVE_PADDING = 0;
```

### StaticInitializerReferencesSubClass
Referencing subclass LongComparator from superclass PrimitiveComparator initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  }

  static final PrimitiveComparator<Long> SIGNED_INT64_COMPARATOR = new LongComparator() {
    @Override
    public int compare(long l1, long l2) {
```

### StaticInitializerReferencesSubClass
Referencing subclass BinaryComparator from superclass PrimitiveComparator initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  }

  public static final PrimitiveComparator<Binary> UNSIGNED_LEXICOGRAPHICAL_BINARY_COMPARATOR = new BinaryComparator() {
    @Override
    int compareBinary(Binary b1, Binary b2) {
```

### StaticInitializerReferencesSubClass
Referencing subclass BinaryStringifierBase from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  }

  static final PrimitiveStringifier DEFAULT_STRINGIFIER = new BinaryStringifierBase("DEFAULT_STRINGIFIER") {
    private final char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

```

### StaticInitializerReferencesSubClass
Referencing subclass DateStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier TIMESTAMP_NANOS_UTC_STRINGIFIER = new DateStringifier(
    "TIMESTAMP_NANOS_UTC_STRINGIFIER", "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSSZ") {
    @Override
```

### StaticInitializerReferencesSubClass
Referencing subclass TimeStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  }

  static final PrimitiveStringifier TIME_STRINGIFIER = new TimeStringifier("TIME_STRINGIFIER", false) {
    @Override
    public String stringify(int millis) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DateStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier TIMESTAMP_MICROS_STRINGIFIER = new DateStringifier(
      "TIMESTAMP_MICROS_STRINGIFIER", "yyyy-MM-dd'T'HH:mm:ss.SSSSSS") {
    @Override
```

### StaticInitializerReferencesSubClass
Referencing subclass DateStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier TIMESTAMP_MILLIS_UTC_STRINGIFIER = new DateStringifier(
    "TIMESTAMP_MILLIS_UTC_STRINGIFIER", "yyyy-MM-dd'T'HH:mm:ss.SSSZ") {
    @Override
```

### StaticInitializerReferencesSubClass
Referencing subclass DateStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier TIMESTAMP_NANOS_STRINGIFIER = new DateStringifier(
    "TIMESTAMP_NANOS_STRINGIFIER", "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS") {
    @Override
```

### StaticInitializerReferencesSubClass
Referencing subclass TimeStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier TIME_NANOS_UTC_STRINGIFIER = new TimeStringifier("TIME_NANOS_UTC_STRINGIFIER", true) {
    @Override
    public String stringify(long nanos) {
```

### StaticInitializerReferencesSubClass
Referencing subclass TimeStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier TIME_UTC_STRINGIFIER = new TimeStringifier("TIME_UTC_STRINGIFIER", true) {
    @Override
    public String stringify(int millis) {
```

### StaticInitializerReferencesSubClass
Referencing subclass BinaryStringifierBase from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier UTF8_STRINGIFIER = new BinaryStringifierBase("UTF8_STRINGIFIER") {
    @Override
    String stringifyNotNull(Binary value) {
```

### StaticInitializerReferencesSubClass
Referencing subclass TimeStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier TIME_NANOS_STRINGIFIER = new TimeStringifier("TIME_NANOS_STRINGIFIER", false) {
    @Override
    public String stringify(long nanos) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DateStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier TIMESTAMP_MILLIS_STRINGIFIER = new DateStringifier(
      "TIMESTAMP_MILLIS_STRINGIFIER", "yyyy-MM-dd'T'HH:mm:ss.SSS") {
    @Override
```

### StaticInitializerReferencesSubClass
Referencing subclass BinaryStringifierBase from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier INTERVAL_STRINGIFIER = new BinaryStringifierBase("INTERVAL_STRINGIFIER") {
    @Override
    String stringifyNotNull(Binary value) {
```

### StaticInitializerReferencesSubClass
Referencing subclass DateStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  };

  static final PrimitiveStringifier TIMESTAMP_MICROS_UTC_STRINGIFIER = new DateStringifier(
    "TIMESTAMP_MICROS_UTC_STRINGIFIER", "yyyy-MM-dd'T'HH:mm:ss.SSSSSSZ") {
    @Override
```

### StaticInitializerReferencesSubClass
Referencing subclass DateStringifier from superclass PrimitiveStringifier initializer might lead to class loading deadlock
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  }

  static final PrimitiveStringifier DATE_STRINGIFIER = new DateStringifier("DATE_STRINGIFIER", "yyyy-MM-dd") {
    @Override
    Instant getInstant(int value) {
```

### StaticInitializerReferencesSubClass
Referencing subclass EmptyBytesInput from superclass BytesInput initializer might lead to class loading deadlock
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesInput.java`
#### Snippet
```java
abstract public class BytesInput {
  private static final Logger LOG = LoggerFactory.getLogger(BytesInput.class);
  private static final EmptyBytesInput EMPTY_BYTES_INPUT = new EmptyBytesInput();

  /**
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (15 lines)
in `parquet-column/src/main/java/org/apache/parquet/io/RecordReaderImplementation.java`
#### Snippet
```java

    // see comment for hashCode above
//    public boolean equals(Case other) {
//      if (goingUp && !other.goingUp || !goingUp && other.goingUp) {
//        return false;
```

### CommentedOutCode
Commented out code (13 lines)
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/WriteBenchmarks.java`
#### Snippet
```java

  //TODO how to handle lzo jar?
//  @Benchmark
//  public void write1MRowsDefaultBlockAndPageSizeLZO()
//          throws IOException
```

### CommentedOutCode
Commented out code (6 lines)
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/ReadBenchmarks.java`
#### Snippet
```java

  //TODO how to handle lzo jar?
//  @Benchmark
//  public void read1MRowsDefaultBlockAndPageSizeLZO(Blackhole blackhole)
//          throws IOException
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `memoryManager` from instance context
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java
    synchronized (ParquetOutputFormat.class) {
      if (memoryManager == null) {
        memoryManager = new MemoryManager(maxLoad, minAllocation);
      }
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SET_READ_LENGTH` from instance context
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftBytesWriteSupport.java`
#### Snippet
```java
      } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        LOG.warn("setReadLength should not throw an exception", e);
        SET_READ_LENGTH = null;
      }
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `conf` from instance context
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/AbstractThriftWriteSupport.java`
#### Snippet
```java
  @Override
  public WriteContext init(Configuration configuration) {
    conf = configuration;
    if (writeContext == null) {
      init(getGenericThriftClass(configuration));
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `keyToColumns`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/PropertiesDrivenCryptoFactory.java`
#### Snippet
```java
      FileKeyWrapper keyWrapper) throws ParquetCryptoRuntimeException {
    Map<ColumnPath, ColumnEncryptionProperties> encryptedColumns = new HashMap<ColumnPath, ColumnEncryptionProperties>();
    String keyToColumns[] = columnKeys.split(";");
    for (int i = 0; i < keyToColumns.length; ++i) {
      final String curKeyToColumns = keyToColumns[i].trim();
```

### CStyleArrayDeclaration
C-style array declaration of local variable `supportedTypes`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
  @Override
  public List<Expression.OpType> getSupportedExpressionTypes() {
    OpType supportedTypes [] = {
        OpType.OP_EQ,
        OpType.OP_NE,
```

### CStyleArrayDeclaration
C-style array declaration of local variable `bucketBorders`
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java
    public static void arrangeToBuckets(long[] data, int bucketCnt) {
      long bucketSize = (long) (Long.MAX_VALUE / (bucketCnt / 2.0));
      long bucketBorders[] = new long[bucketCnt - 1];
      for (int i = 0, n = bucketBorders.length; i < n; ++i) {
        bucketBorders[i] = Long.MIN_VALUE + (i + 1) * bucketSize;
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `parquet-common/src/main/java/org/apache/parquet/bytes/CapacityByteArrayOutputStream.java`
#### Snippet
```java

  @Override
  public void write(byte b[], int off, int len) {
    if ((off < 0) || (off > b.length) || (len < 0) ||
        ((off + len) - b.length > 0)) {
```

### CStyleArrayDeclaration
C-style array declaration of field `writeBuffer`
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataOutputStream.java`
#### Snippet
```java
  }

  private byte writeBuffer[] = new byte[8];

  /**
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataOutputStream.java`
#### Snippet
```java
   * @see        java.io.FilterOutputStream#out
   */
  public void write(byte b[], int off, int len) throws IOException {
    out.write(b, off, len);
  }
```

### CStyleArrayDeclaration
C-style array declaration of field `readBuffer`
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
  }

  private byte readBuffer[] = new byte[8];

  /**
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @see        java.io.FilterInputStream#in
   */
  public final void readFully(byte b[], int off, int len) throws IOException {
    if (len < 0)
      throw new IndexOutOfBoundsException();
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @see        java.io.FilterInputStream#in
   */
  public final void readFully(byte b[]) throws IOException {
    readFully(b, 0, b.length);
  }
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `columnSizes.keySet()` may be replaced with 'entrySet()' iteration
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java
        long size = 0;
        float ratio = 0;
        for (String column : columnSizes.keySet()) {
          if (column.equals(inputColumn) || column.startsWith(inputColumn + ".")) {
            size += columnSizes.get(column);
```

### KeySetIterationMayUseEntrySet
Iteration over `columnSizes.keySet()` may be replaced with 'entrySet()' iteration
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java
      }
    } else {
      for (String column : columnSizes.keySet()) {
        console.info(column + "->" + " Size In Bytes: " + columnSizes.get(column)
          + " Size In Ratio: " + columnRatio.get(column));
```

### KeySetIterationMayUseEntrySet
Iteration over `columns.keySet()` may be replaced with 'entrySet()' iteration
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowPagesCommand.java`
#### Snippet
```java
      int rowGroupNum = 0;
      while ((pageStore = reader.readNextRowGroup()) != null) {
        for (ColumnDescriptor descriptor : columns.keySet()) {
          List<String> lines = formatted.get(columnName(descriptor));
          if (lines == null) {
```

### KeySetIterationMayUseEntrySet
Iteration over `formatted.keySet()` may be replaced with 'entrySet()' iteration
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowPagesCommand.java`
#### Snippet
```java

      // TODO: Show total column size and overall size per value in the column summary line
      for (String columnName : formatted.keySet()) {
        console.info(String.format("\nColumn: %s\n%s", columnName, new TextStringBuilder(80).appendPadding(80, '-')));
        console.info(formatter.getHeader());
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `AvroJsonReader` on 'this' is unnecessary in this context
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJsonReader.java`
#### Snippet
```java
    this.model = GenericData.get();
    this.iterator = Iterators.transform(AvroJson.parser(stream),
      node -> (E) AvroJson.convertToAvro(model, node, AvroJsonReader.this.schema));
  }

```

## RuleId[ruleID=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  }

  private static final ParquetMetadata readFooter(InputFile file, ParquetReadOptions options,
      SeekableInputStream f, ParquetMetadataConverter converter) throws IOException {

```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
    STATE end() throws IOException { return error(); }

    private final STATE error() throws IOException {
      throw new IOException("The file being written is in an invalid state. Probably caused by an error thrown previously. Current state: " + this.name());
    }
```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int lexicographicCompare(byte[] array, int offset1, int length1, ByteBuffer buffer, int offset2, int length2) {
    if (array == null && buffer == null) return 0;
    if (array == null || buffer == null) return array != null ? 1 : -1;
```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int lexicographicCompare(ByteBuffer buffer1, int offset1, int length1, ByteBuffer buffer2, int offset2, int length2) {
    if (buffer1 == null && buffer2 == null) return 0;
    if (buffer1 == null || buffer2 == null) return buffer1 != null ? 1 : -1;
```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final boolean equals(byte[] array1, int offset1, int length1, ByteBuffer buf, int offset2, int length2) {
    if (array1 == null && buf == null) return true;
    if (array1 == null || buf == null) return false;
```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int lexicographicCompare(byte[] array1, int offset1, int length1, byte[] array2, int offset2, int length2) {
    if (array1 == null && array2 == null) return 0;
    if (array1 == null || array2 == null) return array1 != null ? 1 : -1;
```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final boolean equals(ByteBuffer buf1, int offset1, int length1, ByteBuffer buf2, int offset2, int length2) {
    if (buf1 == null && buf2 == null) return true;
    if (buf1 == null || buf2 == null) return false;
```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int toUnsigned(byte b) {
    return b & 0xFF;
  }
```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
   * @return
   */
  private static final boolean equals(byte[] array1, int offset1, int length1, byte[] array2, int offset2, int length2) {
    if (array1 == null && array2 == null) return true;
    if (array1 == null || array2 == null) return false;
```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int hashCode(ByteBuffer buf, int offset, int length) {
    int result = 1;
    for (int i = offset; i < offset + length; i++) {
```

### FinalPrivateMethod
'private' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
   * @return
   */
  private static final int hashCode(byte[] array, int offset, int length) {
    int result = 1;
    for (int i = offset; i < offset + length; i++) {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`columnPropertyMap.size() == 0` can be replaced with 'columnPropertyMap.isEmpty()'
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/FileEncryptionProperties.java`
#### Snippet
```java
      throw new IllegalArgumentException("Wrong footer key length " + footerKey.length);
    }
    if (null != columnPropertyMap && columnPropertyMap.size() == 0) {
      throw new IllegalArgumentException("No encrypted columns");
    }
```

### SizeReplaceableByIsEmpty
`rowGroups.size() > 0` can be replaced with '!rowGroups.isEmpty()'
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
    long preCompressedSize = 0;
    boolean firstColumnWithMetadata = true;
    if (rowGroups != null && rowGroups.size() > 0) {
      firstColumnWithMetadata = rowGroups.get(0).getColumns().get(0).isSetMeta_data();
    }
```

### SizeReplaceableByIsEmpty
`rowGroups.size() > 0` can be replaced with '!rowGroups.isEmpty()'
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
    long preCompressedSize = 0;
    boolean firstColumnWithMetadata = true;
    if (rowGroups != null && rowGroups.size() > 0) {
      firstColumnWithMetadata = rowGroups.get(0).getColumns().get(0).isSetMeta_data();
    }
```

### SizeReplaceableByIsEmpty
`prunedFields.size() > 0` can be replaced with '!prunedFields.isEmpty()'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
        List<Type> childFields = ((GroupType) field).getFields();
        List<Type> prunedFields = pruneColumnsInFields(childFields, currentPath, prunePaths);
        if (prunedFields.size() > 0) {
          prunedField = ((GroupType) field).withNewFields(prunedFields);
        }
```

### SizeReplaceableByIsEmpty
`toRead.size() > 0` can be replaced with '!toRead.isEmpty()'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
    }

    if (toRead.size() > 0) {
      // read the footers of the files that did not have a summary file
      LOG.info("reading another {} footers", toRead.size());
```

### SizeReplaceableByIsEmpty
`cols.size() > 0` can be replaced with '!cols.isEmpty()'
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnMaskingCommand.java`
#### Snippet
```java
      "Both input and output parquet file paths are required.");

    Preconditions.checkArgument(cols != null && cols.size() > 0,
      "columns cannot be null or empty");

```

### SizeReplaceableByIsEmpty
`cols.size() > 0` can be replaced with '!cols.isEmpty()'
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/PruneColumnsCommand.java`
#### Snippet
```java
      "Both input and output parquet file paths are required.");

    Preconditions.checkArgument(cols != null && cols.size() > 0,
      "columns cannot be null or empty");

```

### SizeReplaceableByIsEmpty
`columns.size() > 0` can be replaced with '!columns.isEmpty()'
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java

    // If user defined columns, only print out size for those columns
    if (columns != null && columns.size() > 0) {
      for (String inputColumn : columns) {
        long size = 0;
```

### SizeReplaceableByIsEmpty
`map.size() > 0` can be replaced with '!map.isEmpty()'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroWriteSupport.java`
#### Snippet
```java

    recordConsumer.startGroup(); // group wrapper (original type MAP)
    if (map.size() > 0) {
      recordConsumer.startField(MAP_REPEATED_NAME, 0);

```

### SizeReplaceableByIsEmpty
`collection.size() > 0` can be replaced with '!collection.isEmpty()'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroWriteSupport.java`
#### Snippet
```java
    @Override
    protected void writeCollection(GroupType type, Schema schema, Collection<?> collection) {
      if (collection.size() > 0) {
        recordConsumer.startField(LIST_REPEATED_NAME, 0);
        GroupType repeatedType = type.getType(0).asGroupType();
```

### SizeReplaceableByIsEmpty
`elementEvents.size() > 0` can be replaced with '!elementEvents.isEmpty()'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    @Override
    public void end() {
      if (elementEvents.size() > 0) {
        listEvents.addAll(elementEvents);
      } else {
```

### SizeReplaceableByIsEmpty
`filterPatterns.size() == 0` can be replaced with 'filterPatterns.isEmpty()'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/deprecated/DeprecatedFieldProjectionFilter.java`
#### Snippet
```java
  @Override
  public boolean keep(FieldsPath path) {
    if (filterPatterns.size() == 0)
      return true;

```

### SizeReplaceableByIsEmpty
`m.size() > 0` can be replaced with '!m.isEmpty()'
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/MapSummaryData.java`
#### Snippet
```java
    size.add(m.size());
    FieldSchema field = getField(schema, 0);
    if (m.size() > 0 && key == null) {
      key = new FieldSummaryData();
      key.setName(getName(field));
```

### SizeReplaceableByIsEmpty
`map.size() > 0` can be replaced with '!map.isEmpty()'
in `parquet-pig/src/main/java/org/apache/parquet/pig/TupleWriteSupport.java`
#### Snippet
```java
        Map<String, Object> map = (Map<String, Object>)t.get(i);
        recordConsumer.startGroup();
        if (map.size() > 0) {
          recordConsumer.startField(mapType.getName(), 0);
          Set<Entry<String, Object>> entrySet = map.entrySet();
```

### SizeReplaceableByIsEmpty
`pattern.length() > 0` can be replaced with '!pattern.isEmpty()'
in `parquet-common/src/main/java/org/apache/parquet/glob/GlobParser.java`
#### Snippet
```java
    }

    if (pattern.length() > 0 && pattern.charAt(pattern.length() - 1) == ',') {
      // the above loop won't handle a trailing comma
      children.add(parse(""));
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `parquet-common/src/main/java/org/apache/parquet/SemanticVersion.java`
#### Snippet
```java

    if (!matcher.matches()) {
      throw new SemanticVersionParseException("" + version + " does not match format " + FORMAT);
    }

```

## RuleId[ruleID=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static final ParquetMetadata readFooter(Configuration configuration, FileStatus file, MetadataFilter filter) throws IOException {
    return readFooter(HadoopInputFile.fromStatus(file, configuration), filter);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static final ParquetMetadata readFooter(Configuration configuration, FileStatus file) throws IOException {
    return readFooter(configuration, file, NO_FILTER);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  }

  private static final ParquetMetadata readFooter(InputFile file, ParquetReadOptions options,
      SeekableInputStream f, ParquetMetadataConverter converter) throws IOException {

```

### FinalStaticMethod
'static' method declared `final`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static final ParquetMetadata readFooter(InputFile file, MetadataFilter filter) throws IOException {
    ParquetReadOptions options;
    if (file instanceof HadoopInputFile) {
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  }

  public static final ParquetMetadata readFooter(InputFile file, ParquetReadOptions options, SeekableInputStream f) throws IOException {
    ParquetMetadataConverter converter = new ParquetMetadataConverter(options);
    return readFooter(file, options, f, converter);
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static final ParquetMetadata readFooter(Configuration configuration, Path file) throws IOException {
    return readFooter(configuration, file, NO_FILTER);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int lexicographicCompare(byte[] array, int offset1, int length1, ByteBuffer buffer, int offset2, int length2) {
    if (array == null && buffer == null) return 0;
    if (array == null || buffer == null) return array != null ? 1 : -1;
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int lexicographicCompare(ByteBuffer buffer1, int offset1, int length1, ByteBuffer buffer2, int offset2, int length2) {
    if (buffer1 == null && buffer2 == null) return 0;
    if (buffer1 == null || buffer2 == null) return buffer1 != null ? 1 : -1;
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final boolean equals(byte[] array1, int offset1, int length1, ByteBuffer buf, int offset2, int length2) {
    if (array1 == null && buf == null) return true;
    if (array1 == null || buf == null) return false;
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int lexicographicCompare(byte[] array1, int offset1, int length1, byte[] array2, int offset2, int length2) {
    if (array1 == null && array2 == null) return 0;
    if (array1 == null || array2 == null) return array1 != null ? 1 : -1;
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final boolean equals(ByteBuffer buf1, int offset1, int length1, ByteBuffer buf2, int offset2, int length2) {
    if (buf1 == null && buf2 == null) return true;
    if (buf1 == null || buf2 == null) return false;
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int toUnsigned(byte b) {
    return b & 0xFF;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
   * @return
   */
  private static final boolean equals(byte[] array1, int offset1, int length1, byte[] array2, int offset2, int length2) {
    if (array1 == null && array2 == null) return true;
    if (array1 == null || array2 == null) return false;
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static final int hashCode(ByteBuffer buf, int offset, int length) {
    int result = 1;
    for (int i = offset; i < offset + length; i++) {
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
   * @return
   */
  private static final int hashCode(byte[] array, int offset, int length) {
    int result = 1;
    for (int i = offset; i < offset + length; i++) {
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/filter/AndRecordFilter.java`
#### Snippet
```java
   * @return an unbound and filter
   */
  public static final UnboundRecordFilter and( final UnboundRecordFilter filter1, final UnboundRecordFilter filter2 ) {
    Objects.requireNonNull(filter1, "filter1 cannot be null");
    Objects.requireNonNull(filter2, "filter2 cannot be null");
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/filter/PagedRecordFilter.java`
#### Snippet
```java
   * @return a paged record filter
   */
  public static final UnboundRecordFilter page( final long startPos, final long pageSize ) {
    return new UnboundRecordFilter() {
      @Override
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/filter/OrRecordFilter.java`
#### Snippet
```java
   * @return an or record filter
   */
  public static final UnboundRecordFilter or( final UnboundRecordFilter filter1, final UnboundRecordFilter filter2 ) {
	  Objects.requireNonNull(filter1, "filter1 cannot be null");
	  Objects.requireNonNull(filter2, "filter2 cannot be null");
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/filter/NotRecordFilter.java`
#### Snippet
```java
   * @return a not record filter
   */
  public static final UnboundRecordFilter not( final UnboundRecordFilter filter) {
    Objects.requireNonNull(filter, "filter cannot be null");

```

### FinalStaticMethod
'static' method declared `final`
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnRecordFilter.java`
#### Snippet
```java
   * @return a column filter
   */
  public static final UnboundRecordFilter column(final String columnPath,
                                                 final ColumnPredicates.Predicate predicate) {
    Objects.requireNonNull(columnPath, "columnPath cannot be null");
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-common/src/main/java/org/apache/parquet/bytes/HeapByteBufferAllocator.java`
#### Snippet
```java
public class HeapByteBufferAllocator implements ByteBufferAllocator{

  public static final HeapByteBufferAllocator getInstance(){ return new HeapByteBufferAllocator();}

  public HeapByteBufferAllocator() {
```

### FinalStaticMethod
'static' method declared `final`
in `parquet-common/src/main/java/org/apache/parquet/bytes/DirectByteBufferAllocator.java`
#### Snippet
```java

public class DirectByteBufferAllocator implements ByteBufferAllocator{
  public static final DirectByteBufferAllocator getInstance(){return new DirectByteBufferAllocator();}
  public DirectByteBufferAllocator() {
    super();
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java

    byte[] nonce = new byte[AesCipher.NONCE_LENGTH];
    from.read(nonce);
    byte[] gcmTag = new byte[AesCipher.GCM_TAG_LENGTH];
    from.read(gcmTag);
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
    from.read(nonce);
    byte[] gcmTag = new byte[AesCipher.GCM_TAG_LENGTH];
    from.read(gcmTag);

    AesGcmEncryptor footerSigner =  fileDecryptor.createSignedFooterEncryptor();
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Formats.java`
#### Snippet
```java
  public static Format detectFormat(InputStream stream) throws IOException {
    byte[] first3 = new byte[3];
    stream.read(first3);
    if (Arrays.equals(first3, new byte[]{'P', 'A', 'R'})) {
      return Format.PARQUET;
```

### IgnoreResultOfCall
Result of `Column.getColumnPath()` is ignored
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/dictionarylevel/DictionaryFilter.java`
#### Snippet
```java
    T value = ltEq.getValue();

    filterColumn.getColumnPath();

    try {
```

### IgnoreResultOfCall
Result of `Column.getColumnPath()` is ignored
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/dictionarylevel/DictionaryFilter.java`
#### Snippet
```java
    T value = gtEq.getValue();

    filterColumn.getColumnPath();

    try {
```

### IgnoreResultOfCall
Result of `Page.getUncompressedSize()` is ignored
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowPagesCommand.java`
#### Snippet
```java
    private String printDictionaryPage(DictionaryPage dict) {
      // TODO: the compressed size of a dictionary page is lost in Parquet
      dict.getUncompressedSize();
      long totalSize = dict.getCompressedSize();
      int count = dict.getDictionarySize();
```

### IgnoreResultOfCall
Result of `ByteBufferInputStream.read()` is ignored
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/ByteBitPackingValuesReader.java`
#### Snippet
```java
      int avail = in.available();
      if (avail < bitWidth) {
        in.read(tempEncode, 0, avail);
        // Clear the portion of the array we didn't read into
        for (int i=avail; i<bitWidth; i++) tempEncode[i] = 0;
```

### IgnoreResultOfCall
Result of `ByteBufferInputStream.read()` is ignored
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/ByteBitPackingValuesReader.java`
#### Snippet
```java
        for (int i=avail; i<bitWidth; i++) tempEncode[i] = 0;
      } else {
        in.read(tempEncode, 0, bitWidth);
      }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
    final File file = new File(basePath + "/org/apache/parquet/column/values/bitpacking/" + className + ".java").getAbsoluteFile();
    if (!file.getParentFile().exists()) {
      file.getParentFile().mkdirs();
    }
    try (FileWriter fw = new FileWriter(file)) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
    final File file = new File(basePath + "/org/apache/parquet/column/values/bitpacking/" + className + ".java").getAbsoluteFile();
    if (!file.getParentFile().exists()) {
      file.getParentFile().mkdirs();
    }
    try (FileWriter fw = new FileWriter(file)) {
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `parquet-column/src/main/java/org/apache/parquet/schema/GroupType.java`
#### Snippet
```java
      throw new InvalidRecordException(name + " not found in " + this);
    }
    return i.intValue();
  }

```

## RuleId[ruleID=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.parquet.thrift.ThriftSchemaConverter.toStructType(java.lang.Class\>)' accessed via instance reference
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/TBaseWriteSupport.java`
#### Snippet
```java
  protected StructType getThriftStruct() {
    ThriftSchemaConverter thriftSchemaConverter = new ThriftSchemaConverter(conf);
    return thriftSchemaConverter.toStructType((Class<TBase<?, ?>>)thriftClass);
  }

```

### AccessStaticViaInstance
Static member 'org.apache.parquet.thrift.ThriftSchemaConverter.toStructType(java.lang.Class\>)' accessed via instance reference
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftBytesWriteSupport.java`
#### Snippet
```java
    }
    ThriftSchemaConverter thriftSchemaConverter = new ThriftSchemaConverter(this.configuration);
    thriftStruct = thriftSchemaConverter.toStructType(thriftClass);
    schema = thriftSchemaConverter.convert(thriftStruct);
    if (buffered) {
```

### AccessStaticViaInstance
Static member 'org.apache.parquet.thrift.ThriftSchemaConverter.toStructType(java.lang.Class\>)' accessed via instance reference
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftMetaData.java`
#### Snippet
```java
    if (thriftClass != null && TBase.class.isAssignableFrom(thriftClass)) {
      Class<? extends TBase<?, ?>> tClass = (Class<? extends TBase<?, ?>>) thriftClass;
      StructType descriptor = new ThriftSchemaConverter().toStructType(tClass);
      return new ThriftMetaData(thriftClass.getName(), descriptor);
    }
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `end()` is identical to its super method
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/convert/GroupRecordConverter.java`
#### Snippet
```java

      @Override
      public void end() {
      }
    };
```

### RedundantMethodOverride
Method `hasDictionarySupport()` is identical to its super method
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/FilteringPrimitiveConverter.java`
#### Snippet
```java
  // TODO: we should support it here. (https://issues.apache.org/jira/browse/PARQUET-36)
  @Override
  public boolean hasDictionarySupport() {
    return false;
  }
```

### RedundantMethodOverride
Method `getPageOrdinal()` is identical to its super method
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/OffsetIndexBuilder.java`
#### Snippet
```java

    @Override
    public int getPageOrdinal(int pageIndex) {
      return pageIndex;
    }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `parquet-hadoop/src/main/java/org/apache/parquet/HadoopReadOptions.java`
#### Snippet
```java
  }

  public static class Builder extends ParquetReadOptions.Builder {
    private final Configuration conf;
    private final Path filePath;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/example/ExampleParquetWriter.java`
#### Snippet
```java
  }

  public static class Builder extends ParquetWriter.Builder<Group, Builder> {
    private MessageType type = null;
    private Map<String, String> extraMetaData = new HashMap<String, String>();
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetReader.java`
#### Snippet
```java
  }

  public static class Builder<T> extends ParquetReader.Builder<T> {

    private GenericData model = null;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetWriter.java`
#### Snippet
```java
  }

  public static class Builder<T> extends ParquetWriter.Builder<T, Builder<T>> {
    private Schema schema = null;
    private GenericData model = SpecificData.get();
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoParquetWriter.java`
#### Snippet
```java
		return new ProtoWriteSupport<>(protoMessage);
	}
	public static class Builder<T> extends ParquetWriter.Builder<T, Builder<T>> {
		Class<? extends Message> protoMessage = null;

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoParquetReader.java`
#### Snippet
```java
  }

  private static class Builder<T> extends ParquetReader.Builder<T> {

    protected Builder(InputFile file) {
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
n \* length: integer multiplication implicitly cast to long
in `parquet-column/src/main/java/org/apache/parquet/column/values/plain/FixedLenByteArrayPlainValuesReader.java`
#### Snippet
```java
  public void skip(int n) {
    try {
      in.skipFully(n * length);
    } catch (IOException | RuntimeException e) {
      throw new ParquetDecodingException("could not skip bytes at offset " + in.position(), e);
```

### IntegerMultiplicationImplicitCastToLong
encodedValues.size() \* 4: integer multiplication implicitly cast to long
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
  public long getAllocatedSize() {
    // size used in memory
    return encodedValues.size() * 4 + dictionaryByteSize;
  }

```

### IntegerMultiplicationImplicitCastToLong
encodedValues.size() \* 4: integer multiplication implicitly cast to long
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
  @Override
  public long getBufferedSize() {
    return encodedValues.size() * 4;
  }

```

### IntegerMultiplicationImplicitCastToLong
input.length \* 4: integer multiplication implicitly cast to long
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/ByteBasedBitPackingEncoder.java`
#### Snippet
```java
   */
  public long getAllocatedSize() {
    return totalFullSlabSize + packed.length + input.length * 4;
  }

```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.avro.generic.IndexedRecord;`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java

import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.hadoop.mapreduce.Job;
import org.apache.parquet.hadoop.ParquetInputFormat;
```

### UNUSED_IMPORT
Unused import `import org.apache.avro.generic.IndexedRecord;`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetOutputFormat.java`
#### Snippet
```java

import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.hadoop.mapreduce.Job;
import org.apache.parquet.avro.AvroWriteSupport;
```

### UNUSED_IMPORT
Unused import `import static org.apache.parquet.benchmarks.BenchmarkUtils.deleteIfExists;`
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/PageChecksumDataGenerator.java`
#### Snippet
```java
import java.util.Random;

import static org.apache.parquet.benchmarks.BenchmarkUtils.deleteIfExists;
import static org.apache.parquet.benchmarks.BenchmarkUtils.exists;
import static org.apache.parquet.hadoop.metadata.CompressionCodecName.*;
```

### UNUSED_IMPORT
Unused import `import org.openjdk.jmh.annotations.TearDown;`
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/ReadBenchmarks.java`
#### Snippet
```java
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.infra.Blackhole;
import org.apache.parquet.example.data.Group;
```

### UNUSED_IMPORT
Unused import `import org.apache.avro.file.SeekableInput;`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.apache.avro.file.SeekableInput;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
```

### UNUSED_IMPORT
Unused import `import org.apache.hadoop.fs.FileSystem;`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java
import org.apache.avro.file.SeekableInput;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.cli.BaseCommand;
```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.cli.util.Formats;`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java
import org.apache.hadoop.fs.Path;
import org.apache.parquet.cli.BaseCommand;
import org.apache.parquet.cli.util.Formats;
import org.apache.parquet.format.converter.ParquetMetadataConverter;
import org.apache.parquet.hadoop.ParquetFileReader;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
```

### UNUSED_IMPORT
Unused import `import java.io.OutputStream;`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.nio.charset.StandardCharsets;`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import org.apache.hadoop.fs.Path;`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/SchemaCommand.java`
#### Snippet
```java
import org.apache.parquet.cli.util.Formats;
import org.apache.avro.file.SeekableInput;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.format.converter.ParquetMetadataConverter;
import org.apache.parquet.hadoop.ParquetFileReader;
```

### UNUSED_IMPORT
Unused import `import org.apache.hadoop.fs.Path;`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ToAvroCommand.java`
#### Snippet
```java
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.cli.BaseCommand;
import org.apache.parquet.cli.util.Codecs;
```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.bytes.BytesInput;`
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriter.java`
#### Snippet
```java
package org.apache.parquet.column;

import org.apache.parquet.bytes.BytesInput;
import org.apache.parquet.io.api.Binary;

```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.bytes.BytesInput;`
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriterBase.java`
#### Snippet
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.parquet.bytes.BytesInput;

/**
```

### UNUSED_IMPORT
Unused import `import java.nio.ByteBuffer;`
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/ByteBitPackingValuesReader.java`
#### Snippet
```java

import java.io.IOException;
import java.nio.ByteBuffer;

import org.apache.parquet.bytes.ByteBufferInputStream;
```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.Preconditions;`
in `parquet-column/src/main/java/org/apache/parquet/filter/AndRecordFilter.java`
#### Snippet
```java
import java.util.Objects;

import org.apache.parquet.Preconditions;
import org.apache.parquet.column.ColumnReader;

```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.Preconditions;`
in `parquet-column/src/main/java/org/apache/parquet/filter/NotRecordFilter.java`
#### Snippet
```java
import java.util.Objects;

import org.apache.parquet.Preconditions;
import org.apache.parquet.column.ColumnReader;

```

### UNUSED_IMPORT
Unused import `import java.util.function.IntConsumer;`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.filter2.predicate.Operators.SetColumnFilterPredicate;`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
import org.apache.parquet.filter2.predicate.Operators.NotIn;
import org.apache.parquet.filter2.predicate.Operators.Or;
import org.apache.parquet.filter2.predicate.Operators.SetColumnFilterPredicate;
import org.apache.parquet.filter2.predicate.Operators.UserDefined;
import org.apache.parquet.filter2.predicate.UserDefinedPredicate;
```

### UNUSED_IMPORT
Unused import `import java.util.UUID;`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.schema.LogicalTypeAnnotation.LogicalTypeAnnotationVisitor;`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
import org.apache.parquet.io.api.RecordConsumer;
import org.apache.parquet.schema.ColumnOrder.ColumnOrderName;
import org.apache.parquet.schema.LogicalTypeAnnotation.LogicalTypeAnnotationVisitor;
import org.apache.parquet.schema.LogicalTypeAnnotation.UUIDLogicalTypeAnnotation;

```

### UNUSED_IMPORT
Unused import `import org.slf4j.Logger;`
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/compat/RowGroupFilter.java`
#### Snippet
```java
import org.apache.parquet.hadoop.metadata.BlockMetaData;
import org.apache.parquet.schema.MessageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

```

### UNUSED_IMPORT
Unused import `import org.slf4j.LoggerFactory;`
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/compat/RowGroupFilter.java`
#### Snippet
```java
import org.apache.parquet.schema.MessageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.filter2.compat.RowGroupFilter;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/BloomFilterReader.java`
#### Snippet
```java

import org.apache.parquet.column.values.bloomfilter.BloomFilter;
import org.apache.parquet.filter2.compat.RowGroupFilter;
import org.apache.parquet.hadoop.metadata.BlockMetaData;
import org.apache.parquet.hadoop.metadata.ColumnChunkMetaData;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.Callable;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/UnmaterializableRecordCounter.java`
#### Snippet
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

// Essentially taken from:
```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.schema.MessageType;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/KeyValueMetadataMergeStrategy.java`
#### Snippet
```java
package org.apache.parquet.hadoop.metadata;

import org.apache.parquet.schema.MessageType;

import java.io.Serializable;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/KeyValueMetadataMergeStrategy.java`
#### Snippet
```java

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
```

### UNUSED_IMPORT
Unused import `import java.util.Map.Entry;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/KeyValueMetadataMergeStrategy.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
```

### UNUSED_IMPORT
Unused import `import java.util.Objects;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/KeyValueMetadataMergeStrategy.java`
#### Snippet
```java
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

```

### UNUSED_IMPORT
Unused import `import static java.util.Collections.unmodifiableMap;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/KeyValueMetadataMergeStrategy.java`
#### Snippet
```java
import java.util.Set;

import static java.util.Collections.unmodifiableMap;

/**
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.core.JsonGenerationException;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ParquetMetadata.java`
#### Snippet
```java
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.core.JsonParseException;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ParquetMetadata.java`
#### Snippet
```java

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.databind.JsonMappingException;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ParquetMetadata.java`
#### Snippet
```java
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
```

### UNUSED_IMPORT
Unused import `import org.apache.hadoop.mapreduce.TaskInputOutputContext;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ContextUtil.java`
#### Snippet
```java
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.TaskAttemptID;
import org.apache.hadoop.mapreduce.TaskInputOutputContext;

/*
```

### UNUSED_IMPORT
Unused import `import org.apache.hadoop.mapreduce.TaskInputOutputContext;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/counters/mapreduce/MapReduceCounterLoader.java`
#### Snippet
```java

import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.TaskInputOutputContext;
import org.apache.parquet.hadoop.util.ContextUtil;
import org.apache.parquet.hadoop.util.counters.BenchmarkCounter;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/MapConverter.java`
#### Snippet
```java
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.core.JsonGenerationException;`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/SummaryData.java`
#### Snippet
```java

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.core.JsonParseException;`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/SummaryData.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.databind.JsonMappingException;`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/SummaryData.java`
#### Snippet
```java
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
```

### UNUSED_IMPORT
Unused import `import org.apache.parquet.ParquetRuntimeException;`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
import org.apache.thrift.protocol.TType;

import org.apache.parquet.ParquetRuntimeException;
import org.apache.parquet.ShouldNeverHappenException;
import org.apache.parquet.thrift.struct.ThriftField;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayDeque;`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityChecker.java`
#### Snippet
```java


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
```

### UNUSED_IMPORT
Unused import `import java.util.Deque;`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityChecker.java`
#### Snippet
```java
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityChecker.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java
  public synchronized void reset() {
    finishCalled = false;
    bytesRead = bytesWritten = 0;
    inputBuffer.rewind();
    outputBuffer.rewind();
```

### NestedAssignment
Result of assignment expression used
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowDictionaryCommand.java`
#### Snippet
```java
      DictionaryPageReadStore dictionaryReader;
      int rowGroup = 0;
      while ((dictionaryReader = reader.getNextDictionaryReader()) != null) {
        DictionaryPage page = dictionaryReader.readDictionaryPage(descriptor);

```

### NestedAssignment
Result of assignment expression used
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowPagesCommand.java`
#### Snippet
```java
      PageReadStore pageStore;
      int rowGroupNum = 0;
      while ((pageStore = reader.readNextRowGroup()) != null) {
        for (ColumnDescriptor descriptor : columns.keySet()) {
          List<String> lines = formatted.get(columnName(descriptor));
```

### NestedAssignment
Result of assignment expression used
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowPagesCommand.java`
#### Snippet
```java
          }
          DataPage page;
          while ((page = pages.readPage()) != null) {
            lines.add(formatter.format(page));
          }
```

### NestedAssignment
Result of assignment expression used
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CheckParquet251Command.java`
#### Snippet
```java
        }
        DataPage page;
        while ((page = reader.readPage()) != null) {
          validateStatsForPage(page, reusableDict, desc);
        }
```

### NestedAssignment
Result of assignment expression used
in `parquet-column/src/main/java/org/apache/parquet/schema/MessageTypeParser.java`
#### Snippet
```java
  private static void addGroupTypeFields(String t, Tokenizer st, Types.GroupBuilder builder) {
    check(t, "{", "start of message", st);
    while (!(t = st.nextToken()).equals("}")) {
      addType(t, st, builder);
    }
```

### NestedAssignment
Result of assignment expression used
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
        int i = floorMid(lowerLeft, lowerRight);
        if (comparator.compareValueToMin(i) < 0) {
          lowerRight = upperRight = i - 1;
        } else if (comparator.compareValueToMax(i) > 0) {
          lowerLeft = upperLeft = i + 1;
```

### NestedAssignment
Result of assignment expression used
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
          lowerRight = upperRight = i - 1;
        } else if (comparator.compareValueToMax(i) > 0) {
          lowerLeft = upperLeft = i + 1;
        } else {
          lowerRight = upperLeft = i;
```

### NestedAssignment
Result of assignment expression used
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
          lowerLeft = upperLeft = i + 1;
        } else {
          lowerRight = upperLeft = i;
        }
      } while (lowerLeft != lowerRight);
```

### NestedAssignment
Result of assignment expression used
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
        int i = floorMid(lowerLeft, lowerRight);
        if (comparator.compareValueToMax(i) > 0) {
          lowerRight = upperRight = i - 1;
        } else if (comparator.compareValueToMin(i) < 0) {
          lowerLeft = upperLeft = i + 1;
```

### NestedAssignment
Result of assignment expression used
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
          lowerRight = upperRight = i - 1;
        } else if (comparator.compareValueToMin(i) < 0) {
          lowerLeft = upperLeft = i + 1;
        } else {
          lowerRight = upperLeft = i;
```

### NestedAssignment
Result of assignment expression used
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
          lowerLeft = upperLeft = i + 1;
        } else {
          lowerRight = upperLeft = i;
        }
      } while (lowerLeft != lowerRight);
```

### NestedAssignment
Result of assignment expression used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ProtocolReadToWrite.java`
#### Snippet
```java
    out.writeStructBegin(struct);
    TField field;
    while ((field = in.readFieldBegin()).type != TType.STOP) {
      out.writeFieldBegin(field);
      readOneValue(in, out, field.type);
```

### NestedAssignment
Result of assignment expression used
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
          String min, max;
          if (nullPages[i]) {
            min = max = TOSTRING_MISSING_VALUE_MARKER;
          } else {
            min = truncate(getMinValueAsString(arrayIndex));
```

### NestedAssignment
Result of assignment expression used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    boolean hasFieldsIgnored = false;
    int childFieldsPresent = 0;
    while ((field = in.readFieldBegin()).type != TType.STOP) {
      final TField currentField = field;
      ThriftField expectedField;
```

### NestedAssignment
Result of assignment expression used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
      final TField currentField = field;
      ThriftField expectedField;
      if ((expectedField = type.getChildById(field.id)) == null) {
        handleUnrecognizedField(field, type, in);
        hasFieldsIgnored |= true;
```

### NestedAssignment
Result of assignment expression used
in `parquet-common/src/main/java/org/apache/parquet/io/DelegatingSeekableInputStream.java`
#### Snippet
```java
    int bytesRead;

    while ((bytesRead = f.read(temp, 0, nextReadLength)) == temp.length) {
      buf.put(temp);
      totalBytesRead += bytesRead;
```

### NestedAssignment
Result of assignment expression used
in `parquet-common/src/main/java/org/apache/parquet/io/DelegatingSeekableInputStream.java`
#### Snippet
```java
    int bytesRead = 0;

    while (nextReadLength > 0 && (bytesRead = f.read(temp, 0, nextReadLength)) >= 0) {
      buf.put(temp, 0, bytesRead);
      nextReadLength = Math.min(buf.remaining(), temp.length);
```

### NestedAssignment
Result of assignment expression used
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    int i = 0;
    long b;
    while (((b = in.read()) & 0x80) != 0) {
      value |= (b & 0x7F) << i;
      i += 7;
```

### NestedAssignment
Result of assignment expression used
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    int i = 0;
    int b;
    while (((b = in.read()) & 0x80) != 0) {
      value |= (b & 0x7F) << i;
      i += 7;
```

### NestedAssignment
Result of assignment expression used
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
    int cur = 0;

    while ((total<n) && ((cur = (int) in.skip(n-total)) > 0)) {
      total += cur;
    }
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`currentSize = currentSize / 1000` could be simplified to 'currentSize /= 1000'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    while (currentSize >= 1000) {
      previousSize = currentSize;
      currentSize = currentSize / 1000;
      ++ count;
    }
```

### ReplaceAssignmentWithOperatorAssignment
`deltaBlockBuffer[i] = deltaBlockBuffer[i] - minDeltaInCurrentBlock` could be simplified to 'deltaBlockBuffer\[i\] -= minDeltaInCurrentBlock'
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriterForLong.java`
#### Snippet
```java
    // and all positive
    for (int i = 0; i < deltaValuesToFlush; i++) {
      deltaBlockBuffer[i] = deltaBlockBuffer[i] - minDeltaInCurrentBlock;
    }

```

### ReplaceAssignmentWithOperatorAssignment
`deltaBlockBuffer[i] = deltaBlockBuffer[i] - minDeltaInCurrentBlock` could be simplified to 'deltaBlockBuffer\[i\] -= minDeltaInCurrentBlock'
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriterForInteger.java`
#### Snippet
```java
    // and all positive
    for (int i = 0; i < deltaValuesToFlush; i++) {
      deltaBlockBuffer[i] = deltaBlockBuffer[i] - minDeltaInCurrentBlock;
    }

```

### ReplaceAssignmentWithOperatorAssignment
`mask[i] = mask[i] >>> 27` could be simplified to 'mask\[i\] \>\>\>= 27'
in `parquet-column/src/main/java/org/apache/parquet/column/values/bloomfilter/BlockSplitBloomFilter.java`
#### Snippet
```java

    for (int i = 0; i < BITS_SET_PER_BLOCK; ++i) {
      mask[i] = mask[i] >>> 27;
    }

```

### ReplaceAssignmentWithOperatorAssignment
`buffer = buffer << padding` could be simplified to 'buffer \<\<= padding'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  void finish(int numberOfBits, int buffer, OutputStream out) throws IOException {
    int padding = numberOfBits % 8 == 0 ? 0 : 8 - (numberOfBits % 8);
    buffer = buffer << padding;
    int numberOfBytes = (numberOfBits + padding) / 8;
    for (int i = (numberOfBytes - 1) * 8; i >= 0 ; i -= 8) {
```

### ReplaceAssignmentWithOperatorAssignment
`buffer = buffer << 5` could be simplified to 'buffer \<\<= 5'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void write(int val) throws IOException {
    buffer = buffer << 5;
    buffer |= val;
    ++ count;
```

### ReplaceAssignmentWithOperatorAssignment
`buffer = buffer << 6` could be simplified to 'buffer \<\<= 6'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void write(int val) throws IOException {
    buffer = buffer << 6;
    buffer |= val;
    ++ count;
```

### ReplaceAssignmentWithOperatorAssignment
`buffer = buffer << 3` could be simplified to 'buffer \<\<= 3'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void write(int val) throws IOException {
    buffer = buffer << 3;
    buffer |= val;
    ++ count;
```

### ReplaceAssignmentWithOperatorAssignment
`buffer = buffer << 1` could be simplified to 'buffer \<\<= 1'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void write(int val) throws IOException {
    buffer = buffer << 1;
    buffer |= val;
    ++ count;
```

### ReplaceAssignmentWithOperatorAssignment
`buffer = buffer << padding` could be simplified to 'buffer \<\<= padding'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  void finish(int numberOfBits, long buffer, OutputStream out) throws IOException {
    int padding = numberOfBits % 8 == 0 ? 0 : 8 - (numberOfBits % 8);
    buffer = buffer << padding;
    int numberOfBytes = (numberOfBits + padding) / 8;
    for (int i = (numberOfBytes - 1) * 8; i >= 0 ; i -= 8) {
```

### ReplaceAssignmentWithOperatorAssignment
`buffer = buffer << 4` could be simplified to 'buffer \<\<= 4'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void write(int val) throws IOException {
    buffer = buffer << 4;
    buffer |= val;
    ++ count;
```

### ReplaceAssignmentWithOperatorAssignment
`buffer = buffer << 2` could be simplified to 'buffer \<\<= 2'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void write(int val) throws IOException {
    buffer = buffer << 2;
    buffer |= val;
    ++ count;
```

### ReplaceAssignmentWithOperatorAssignment
`buffer = buffer << 7` could be simplified to 'buffer \<\<= 7'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void write(int val) throws IOException {
    buffer = buffer << 7;
    buffer |= val;
    ++ count;
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `columns` are updated, but never queried
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/BloomFilterReader.java`
#### Snippet
```java
public class BloomFilterReader {
  private final ParquetFileReader reader;
  private final Map<ColumnPath, ColumnChunkMetaData> columns;
  private final Map<ColumnPath, BloomFilter> cache = new HashMap<>();
  private Logger logger = LoggerFactory.getLogger(BloomFilterReader.class);
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `scale` is accessed in both synchronized and unsynchronized contexts
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/MemoryManager.java`
#### Snippet
```java
      new HashMap<>();
  private final Map<String, Runnable> callBacks = new HashMap<String, Runnable>();
  private double scale = 1.0;

  public MemoryManager(float ratio, long minAllocation) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `memoryManager` is accessed in both synchronized and unsynchronized contexts
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java
   * This memory manager is for all the real writers (InternalParquetRecordWriter) in one task.
   */
  private static MemoryManager memoryManager;

  public synchronized static MemoryManager getMemoryManager() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `outputBuffer` is accessed in both synchronized and unsynchronized contexts
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java

  // Buffer for compressed output. This buffer grows as necessary.
  private ByteBuffer outputBuffer = ByteBuffer.allocateDirect(0);

  // Buffer for uncompressed input. This buffer grows as necessary.
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bytesWritten` is accessed in both synchronized and unsynchronized contexts
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java

  private long bytesRead = 0L;
  private long bytesWritten = 0L;
  private boolean finishCalled = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `inputBuffer` is accessed in both synchronized and unsynchronized contexts
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java

  // Buffer for uncompressed input. This buffer grows as necessary.
  private ByteBuffer inputBuffer = ByteBuffer.allocateDirect(0);

  private long bytesRead = 0L;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bytesRead` is accessed in both synchronized and unsynchronized contexts
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java
  private ByteBuffer inputBuffer = ByteBuffer.allocateDirect(0);

  private long bytesRead = 0L;
  private long bytesWritten = 0L;
  private boolean finishCalled = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `outputBuffer` is accessed in both synchronized and unsynchronized contexts
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedDecompressor.java`
#### Snippet
```java

  // Buffer for uncompressed output. This buffer grows as necessary.
  private ByteBuffer outputBuffer = ByteBuffer.allocateDirect(0);

  // Buffer for compressed input. This buffer grows as necessary.
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `inputBuffer` is accessed in both synchronized and unsynchronized contexts
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedDecompressor.java`
#### Snippet
```java

  // Buffer for compressed input. This buffer grows as necessary.
  private ByteBuffer inputBuffer = ByteBuffer.allocateDirect(0);

  private boolean finished;
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
import org.apache.parquet.schema.PrimitiveComparator;

abstract public class Binary implements Comparable<Binary>, Serializable {

  protected boolean isBackingBytesReused;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static class ByteArraySliceBackedBinary extends Binary {
    private final byte[] value;
    private final int offset;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static class ByteArrayBackedBinary extends Binary {
    private final byte[] value;

```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  }

  private static class ByteBufferBackedBinary extends Binary {
    private ByteBuffer value;
    private transient byte[] cachedBytes;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `parquet-column/src/main/java/org/apache/parquet/column/values/bloomfilter/BlockSplitBloomFilter.java`
#### Snippet
```java
 * instruction.
 */
public class BlockSplitBloomFilter implements BloomFilter {
  // Bytes in a tiny Bloom filter block.
  private static final int BYTES_PER_BLOCK = 32;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
 * Representation of a Primitive type
 */
public final class PrimitiveType extends Type {

  public static interface PrimitiveTypeNameConverter<T, E extends Exception> {
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `parquet-column/src/main/java/org/apache/parquet/schema/GroupType.java`
#### Snippet
```java
 * Represents a group type: a list of fields
 */
public class GroupType extends Type {

  private final List<Type> fields;
```

## RuleId[ruleID=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`(int)(bytes[0] & 255) << 0` can be replaced with '(int)(bytes\[0\] \& 255)'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
           ((int)(bytes[2] & 255) << 16) +
           ((int)(bytes[1] & 255) <<  8) +
           ((int)(bytes[0] & 255) <<  0);
  }

```

### PointlessBitwiseExpression
`ch4 << 0` can be replaced with 'ch4'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    int ch2 = in.get(offset + 2) & 0xff;
    int ch1 = in.get(offset + 3) & 0xff;
    return ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
  }
  
```

### PointlessBitwiseExpression
`(long)(bytes[0] & 255) << 0` can be replaced with '(long)(bytes\[0\] \& 255)'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
           ((long)(bytes[2] & 255) << 16) +
           ((long)(bytes[1] & 255) <<  8) +
           ((long)(bytes[0] & 255) <<  0));
  }

```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    outBuffer[2] = (byte)(value >>> 16);
    outBuffer[1] = (byte)(value >>>  8);
    outBuffer[0] = (byte)(value >>>  0);
    return outBuffer;
  }
```

### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java

  public static void writeIntLittleEndianOnOneByte(OutputStream out, int v) throws IOException {
    out.write((v >>>  0) & 0xFF);
  }

```

### PointlessBitwiseExpression
`value >>> 0` can be replaced with 'value'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    outBuffer[2] = (byte)(value >>> 16);
    outBuffer[1] = (byte)(value >>>  8);
    outBuffer[0] = (byte)(value >>>  0);
    return outBuffer;
  }
```

### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java

  public static void writeIntLittleEndianOnTwoBytes(OutputStream out, int v) throws IOException {
    out.write((v >>>  0) & 0xFF);
    out.write((v >>>  8) & 0xFF);
  }
```

### PointlessBitwiseExpression
`ch1 << 0` can be replaced with 'ch1'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
        throw new EOFException();
    }
    return ((ch4 << 24) + (ch3 << 16) + (ch2 << 8) + (ch1 << 0));
  }

```

### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
  public static void writeIntLittleEndian(OutputStream out, int v) throws IOException {
    // TODO: this is duplicated code in LittleEndianDataOutputStream
    out.write((v >>>  0) & 0xFF);
    out.write((v >>>  8) & 0xFF);
    out.write((v >>> 16) & 0xFF);
```

### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    out.write((v >>> 16) & 0xFF);
    out.write((v >>> 24) & 0xFF);
    if (LOG.isDebugEnabled()) LOG.debug("write le int: " + v + " => "+ ((v >>>  0) & 0xFF) + " " + ((v >>>  8) & 0xFF) + " " + ((v >>> 16) & 0xFF) + " " + ((v >>> 24) & 0xFF));
  }

```

### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java

  public static void writeIntLittleEndianOnThreeBytes(OutputStream out, int v) throws IOException {
    out.write((v >>>  0) & 0xFF);
    out.write((v >>>  8) & 0xFF);
    out.write((v >>> 16) & 0xFF);
```

### PointlessBitwiseExpression
`ch1 << 0` can be replaced with 'ch1'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
          throw new EOFException();
      }
      return ((ch3 << 16) + (ch2 << 8) + (ch1 << 0));
  }

```

### PointlessBitwiseExpression
`ch1 << 0` can be replaced with 'ch1'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
          throw new EOFException();
      }
      return ((ch2 << 8) + (ch1 << 0));
  }

```

### PointlessBitwiseExpression
`ch4 << 0` can be replaced with 'ch4'
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    int ch2 = in[offset + 2] & 0xff;
    int ch1 = in[offset + 3] & 0xff;
    return ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
  }

```

### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataOutputStream.java`
#### Snippet
```java
    // to use Integer.reverseBytes() and then writeInt, or a ByteBuffer
    // approach
    out.write((v >>>  0) & 0xFF);
    out.write((v >>>  8) & 0xFF);
    out.write((v >>> 16) & 0xFF);
```

### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataOutputStream.java`
#### Snippet
```java
   */
  public final void writeShort(int v) throws IOException {
    out.write((v >>> 0) & 0xFF);
    out.write((v >>> 8) & 0xFF);
  }
```

### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataOutputStream.java`
#### Snippet
```java
    writeBuffer[2] = (byte)(v >>> 16);
    writeBuffer[1] = (byte)(v >>>  8);
    writeBuffer[0] = (byte)(v >>>  0);
    out.write(writeBuffer, 0, 8);
  }
```

### PointlessBitwiseExpression
`ch2 << 0` can be replaced with 'ch2'
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
    if ((ch1 | ch2) < 0)
      throw new EOFException();
    return (short)((ch1 << 8) + (ch2 << 0));
  }

```

### PointlessBitwiseExpression
`(readBuffer[0] & 255) << 0` can be replaced with '(readBuffer\[0\] \& 255)'
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
        ((readBuffer[2] & 255) << 16) +
        ((readBuffer[1] & 255) <<  8) +
        ((readBuffer[0] & 255) <<  0));
  }

```

### PointlessBitwiseExpression
`ch2 << 0` can be replaced with 'ch2'
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
    if ((ch1 | ch2) < 0)
      throw new EOFException();
    return (ch1 << 8) + (ch2 << 0);
  }

```

### PointlessBitwiseExpression
`ch4 << 0` can be replaced with 'ch4'
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
    if ((ch1 | ch2 | ch3 | ch4) < 0)
      throw new EOFException();
    return ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
  }

```

### PointlessBitwiseExpression
`buffer >>> 0` can be replaced with 'buffer'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
      out.write((int)(buffer >>> 16) & 0xFF);
      out.write((int)(buffer >>>  8) & 0xFF);
      out.write((int)(buffer >>>  0) & 0xFF);
      buffer = 0;
      count = 0;
```

### PointlessBitwiseExpression
`buffer >>> 0` can be replaced with 'buffer'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
      out.write((buffer >>> 16) & 0xFF);
      out.write((buffer >>>  8) & 0xFF);
      out.write((buffer >>>  0) & 0xFF);
      buffer = 0;
      count = 0;
```

### PointlessBitwiseExpression
`buffer >>> 0` can be replaced with 'buffer'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
      out.write((buffer >>> 16) & 0xFF);
      out.write((buffer >>>  8) & 0xFF);
      out.write((buffer >>>  0) & 0xFF);
      buffer = 0;
      count = 0;
```

### PointlessBitwiseExpression
`buffer >>> 0` can be replaced with 'buffer'
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
      out.write((int)(buffer >>> 16) & 0xFF);
      out.write((int)(buffer >>>  8) & 0xFF);
      out.write((int)(buffer >>>  0) & 0xFF);
      buffer = 0;
      count = 0;
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-21-16-07-55.897.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowFooterCommand.java`
#### Snippet
```java
  }

  private String readFooter(InputFile inputFile) throws JsonProcessingException, IOException {
    String json;
    try (ParquetFileReader reader = ParquetFileReader.open(inputFile)) {
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/DirectCodecFactory.java`
#### Snippet
```java
      CodecPool pools = codecs.get(codec);
      if(pools == null){
        synchronized(this){
          pools = codecs.get(codec);
          if(pools == null){
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java
    long minAllocation = conf.getLong(ParquetOutputFormat.MIN_MEMORY_ALLOCATION,
        MemoryManager.DEFAULT_MIN_MEMORY_ALLOCATION);
    synchronized (ParquetOutputFormat.class) {
      if (memoryManager == null) {
        memoryManager = new MemoryManager(maxLoad, minAllocation);
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof Collection' check
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Expressions.java`
#### Snippet
```java
        Preconditions.checkArgument(NUMERIC_RE.matcher(token.value).matches(),
            "Not an array index: %s", token.value);
        List<Object> list = (List<Object>) datum;
        return select(schema.getElementType(), list.get(Integer.parseInt(token.value)),
            token.children);
```

### CastConflictsWithInstanceof
Cast to 'SimpleGroup' type conflicts with preceding 'instanceof Group' check
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/SimpleGroup.java`
#### Snippet
```java
          } else if (value instanceof Group) {
            builder.append('\n');
            ((SimpleGroup) value).appendToString(builder, indent + "  ");
          } else {
            builder.append(": ").append(value.toString()).append('\n');
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `encodedWrappedDEK` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyWrapper.java`
#### Snippet
```java
    String encodedKekID = null;
    String encodedWrappedKEK = null;
    String encodedWrappedDEK = null;
    if (!doubleWrapping) {
      encodedWrappedDEK = kmsClient.wrapKey(dataKey, masterKeyID);
```

### UnusedAssignment
Variable `encodedWrappedKEK` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyWrapper.java`
#### Snippet
```java

    // Encrypt KEK with Master key
    String encodedWrappedKEK = null;
    encodedWrappedKEK = kmsClient.wrapKey(kekBytes, masterKeyID);

```

### UnusedAssignment
Variable `keyMetadataJson` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyMetadata.java`
#### Snippet
```java
  static KeyMetadata parse(byte[] keyMetadataBytes) {
    String keyMetaDataString = new String(keyMetadataBytes, StandardCharsets.UTF_8);
    Map<String, Object> keyMetadataJson = null;
    try {
      keyMetadataJson = OBJECT_MAPPER.readValue(new StringReader(keyMetaDataString),
```

### UnusedAssignment
Variable `keyWrapMap` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/LocalWrapKmsClient.java`
#### Snippet
```java

    private static LocalKeyWrap parse(String wrappedKey) {
      Map<String, String> keyWrapMap = null;
      try {
        keyWrapMap = OBJECT_MAPPER.readValue(new StringReader(wrappedKey),
```

### UnusedAssignment
Variable `keyMaterialJson` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyMaterial.java`
#### Snippet
```java
  // parses external key material
  static KeyMaterial parse(String keyMaterialString) {
    Map<String, Object> keyMaterialJson = null;
    try {
      keyMaterialJson = OBJECT_MAPPER.readValue(new StringReader(keyMaterialString),
```

### UnusedAssignment
Variable `kmsClient` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyToolkit.java`
#### Snippet
```java

    Class<?> kmsClientClass = null;
    KmsClient kmsClient = null;

    try {
```

### UnusedAssignment
Variable `column` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
          ColumnMetaData metaData = columnChunk.meta_data;
          ColumnCryptoMetaData cryptoMetaData = columnChunk.getCrypto_metadata();
          ColumnChunkMetaData column = null;
          ColumnPath columnPath = null;
          boolean lazyMetadataDecryption = false;
```

### UnusedAssignment
Variable `valueContainer` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/mapred/DeprecatedParquetInputFormat.java`
#### Snippet
```java
    private long splitLen; // for getPos()

    private Container<V> valueContainer = null;

    private boolean firstRecord = false;
```

### UnusedAssignment
Variable `statistics` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
    DictionaryPage dictionaryPage = null;
    long readValues = 0;
    Statistics statistics = null;
    ParquetMetadataConverter converter = new ParquetMetadataConverter();
    int pageOrdinal = 0;
```

### UnusedAssignment
Variable `newCodecName` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  private final byte[] pageBuffer = new byte[pageBufferSize];
  // Configurations for the new file
  private CompressionCodecName newCodecName = null;
  private List<String> pruneColumns = null;
  private Map<ColumnPath, MaskMode> maskColumns = null;
```

### UnusedAssignment
Variable `rowGroup` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  public PageReadStore readNextRowGroup() throws IOException {
    ColumnChunkPageReadStore rowGroup = null;
    try {
      rowGroup = internalReadRowGroup(currentBlock);
```

### UnusedAssignment
Variable `fileDecryptor` initializer `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  private DictionaryPageReader nextDictionaryReader = null;

  private InternalFileDecryptor fileDecryptor = null;

  /**
```

### UnusedAssignment
Variable `hasNext` initializer `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/AvroCSVReader.java`
#### Snippet
```java
  private final CSVReader reader;
  private final RecordBuilder<E> builder;
  private boolean hasNext = false;
  private String[] next = null;
  private E record = null;
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/RecordBuilder.java`
#### Snippet
```java
          }
        case UNION:
          Object value = null;
          for (Schema possible : schema.getTypes()) {
            value = makeValue(string, possible);
```

### UnusedAssignment
Variable `fallbackWriter` initializer `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/factory/DefaultV1ValuesWriterFactory.java`
#### Snippet
```java

  private ValuesWriter getFloatValuesWriter(ColumnDescriptor path) {
    ValuesWriter fallbackWriter = null;
    if (this.parquetProperties.isByteStreamSplitEnabled()) {
      fallbackWriter = new ByteStreamSplitValuesWriter.FloatByteStreamSplitValuesWriter(parquetProperties.getInitialSlabSize(), parquetProperties.getPageSizeThreshold(), parquetProperties.getAllocator());
```

### UnusedAssignment
Variable `fallbackWriter` initializer `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/factory/DefaultV1ValuesWriterFactory.java`
#### Snippet
```java

  private ValuesWriter getDoubleValuesWriter(ColumnDescriptor path) {
    ValuesWriter fallbackWriter = null;
    if (this.parquetProperties.isByteStreamSplitEnabled()) {
      fallbackWriter = new ByteStreamSplitValuesWriter.DoubleByteStreamSplitValuesWriter(parquetProperties.getInitialSlabSize(), parquetProperties.getPageSizeThreshold(), parquetProperties.getAllocator());
```

### UnusedAssignment
Variable `fallbackWriter` initializer `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/factory/DefaultV2ValuesWriterFactory.java`
#### Snippet
```java

  private ValuesWriter getFloatValuesWriter(ColumnDescriptor path) {
    ValuesWriter fallbackWriter = null;
    if (this.parquetProperties.isByteStreamSplitEnabled()) {
      fallbackWriter = new ByteStreamSplitValuesWriter.FloatByteStreamSplitValuesWriter(parquetProperties.getInitialSlabSize(), parquetProperties.getPageSizeThreshold(), parquetProperties.getAllocator());
```

### UnusedAssignment
Variable `fallbackWriter` initializer `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/factory/DefaultV2ValuesWriterFactory.java`
#### Snippet
```java

  private ValuesWriter getDoubleValuesWriter(ColumnDescriptor path) {
    ValuesWriter fallbackWriter = null;
    if (this.parquetProperties.isByteStreamSplitEnabled()) {
      fallbackWriter = new ByteStreamSplitValuesWriter.DoubleByteStreamSplitValuesWriter(parquetProperties.getInitialSlabSize(), parquetProperties.getPageSizeThreshold(), parquetProperties.getAllocator());
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/deltastrings/DeltaByteArrayWriter.java`
#### Snippet
```java
  @Override
  public void writeBytes(Binary v) {
    int i = 0;
    byte[] vb = v.getBytes();
    int length = previous.length < vb.length ? previous.length : vb.length;
```

### UnusedAssignment
Variable `doubleDictionaryContent` initializer `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainDoubleDictionary extends PlainValuesDictionary {

    private double[] doubleDictionaryContent = null;

    /**
```

### UnusedAssignment
Variable `longDictionaryContent` initializer `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainLongDictionary extends PlainValuesDictionary {

    private long[] longDictionaryContent = null;

    /**
```

### UnusedAssignment
Variable `intDictionaryContent` initializer `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainIntegerDictionary extends PlainValuesDictionary {

    private int[] intDictionaryContent = null;

    /**
```

### UnusedAssignment
Variable `binaryDictionaryContent` initializer `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainBinaryDictionary extends PlainValuesDictionary {

    private Binary[] binaryDictionaryContent = null;

    /**
```

### UnusedAssignment
Variable `floatDictionaryContent` initializer `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainFloatDictionary extends PlainValuesDictionary {

    private float[] floatDictionaryContent = null;

    /**
```

### UnusedAssignment
The value `pr1.addGroup("Name")` assigned to `name` is never used
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
      name.addGroup("Language");
    }
    name = pr1.addGroup("Name");
    name = pr1.addGroup("Name");
    {
```

### UnusedAssignment
Variable `missingRequiredFieldsInProjection` initializer `false` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
  private GroupConverter structConverter;
  private List<TProtocol> rootEvents = new ArrayList<TProtocol>();
  private boolean missingRequiredFieldsInProjection = false;
  private boolean ignoreNullElements = IGNORE_NULL_LIST_ELEMENTS_DEFAULT;

```

### UnusedAssignment
Variable `innerField` initializer `null` is redundant
in `parquet-pig/src/main/java/org/apache/parquet/pig/PigSchemaConverter.java`
#### Snippet
```java
      throw new SchemaConversionException("Invalid map Schema, schema should contain exactly one field: " + fieldSchema);
    }
    FieldSchema innerField = null;
    try {
      innerField = innerSchema.getField(0);
```

### UnusedAssignment
Variable `cur` initializer `0` is redundant
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
  public final int skipBytes(int n) throws IOException {
    int total = 0;
    int cur = 0;

    while ((total<n) && ((cur = (int) in.skip(n-total)) > 0)) {
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
      STATE endColumn() {
        return BLOCK;
      };
      STATE write() {
        return this;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parquet-column/src/main/java/org/apache/parquet/column/ValuesType.java`
#### Snippet
```java
 */
public enum ValuesType {
  REPETITION_LEVEL, DEFINITION_LEVEL, VALUES;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
    Instant getInstant(int value) {
      return Instant.ofEpochMilli(TimeUnit.DAYS.toMillis(value));
    };
  };

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BinaryTruncator.java`
#### Snippet
```java
public abstract class BinaryTruncator {
  enum Validity {
    VALID, MALFORMED, UNMAPPABLE;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java

    protected Column(ColumnPath columnPath, Class<T> columnType) {
      this.columnPath = Objects.requireNonNull(columnPath, "columnPath cannot be null");;
      this.columnType = Objects.requireNonNull(columnType, "columnType cannot be null");;
    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java
    protected Column(ColumnPath columnPath, Class<T> columnType) {
      this.columnPath = Objects.requireNonNull(columnPath, "columnPath cannot be null");;
      this.columnType = Objects.requireNonNull(columnType, "columnType cannot be null");;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
      return super.createRecordReader(inputSplit, taskAttemptContext);
    }
  };

  private ParquetInputFormat<Tuple> getParquetInputFormat() throws ParserException {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java
        return builder.useColumnIndexFilter(true);
      }
    };
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java
            .withPageRowCountLimit(100_000);
      }
    };
  }

```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ConcatenatingKeyValueMetadataMergeStrategy.java`
#### Snippet
```java
    Map<String, String> mergedKeyValues = new HashMap<String, String>();
    for (Map.Entry<String, Set<String>> entry : keyValueMetaData.entrySet()) {
      mergedKeyValues.put(entry.getKey(), entry.getValue().stream().collect(Collectors.joining(this.delimiter)));
    }
    return mergedKeyValues;
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary empty string argument
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
          add(footer);
        }
        System.out.println("");
        long t1 = System.currentTimeMillis();
        System.out.println("read all footers in " + (t1 - t0) + " ms");
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/Util.java`
#### Snippet
```java
    sb.append("\"");
    if (str.length() > len - 2) {
      sb.append(str.substring(0, len - 5)).append("...");
    } else {
      sb.append(str);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Expressions.java`
#### Snippet
```java
    Preconditions.checkState(!inDeref, "Fields after [ must end with ]");
    if (valueStart < path.length()) {
      PathExpr current = PathExpr.field(path.substring(valueStart, path.length()));
      if (last != null) {
        last.children.add(current);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `parquet-common/src/main/java/org/apache/parquet/glob/GlobParser.java`
#### Snippet
```java
      // last }, either way whatever is left (could be the entire input) is an Atom
      // in our sequence
      children.add(new Atom(pattern.substring(anchor, pattern.length())));
    }

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `parquet-common/src/main/java/org/apache/parquet/glob/GlobParser.java`
#### Snippet
```java
      // last comma, either way whatever is left (could be the entire input) is an Atom
      // in our sequence
      children.add(parse(pattern.substring(anchor, pattern.length())));
    }

```

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `union()` overloads a compatible method of a superclass, when overriding might have been intended
in `parquet-column/src/main/java/org/apache/parquet/schema/MessageType.java`
#### Snippet
```java
  }

  public MessageType union(MessageType toMerge) {
    return union(toMerge, true);
  }
```

### MethodOverloadsParentMethod
Method `union()` overloads a compatible method of a superclass, when overriding might have been intended
in `parquet-column/src/main/java/org/apache/parquet/schema/MessageType.java`
#### Snippet
```java
  }

  public MessageType union(MessageType toMerge, boolean strict) {
    return new MessageType(this.getName(), mergeFields(toMerge, strict));
  }
```

### MethodOverloadsParentMethod
Method `add()` overloads a compatible method of a superclass, when overriding might have been intended
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/StringSummaryData.java`
#### Snippet
```java
  private EnumStat values = new EnumStat();

  public void add(String s) {
    super.add(s);
    size.add(s.length());
```

### MethodOverloadsParentMethod
Method `add()` overloads a compatible method of a superclass, when overriding might have been intended
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/NumberSummaryData.java`
#### Snippet
```java
  private ValueStat value = new ValueStat();

  public void add(Number n) {
    super.add(n);
    value.add(n.doubleValue());
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/AvroCSV.java`
#### Snippet
```java
      header = new String[line.length];
      for (int i = 0; i < line.length; i += 1) {
        header[i] = "field_" + String.valueOf(i);
      }
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java
      throw new RecordException(String.format(
          "Field %s: cannot make %s value: '%s'",
          field.name(), field.schema(), String.valueOf(datum)), e);
    }
  }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
        prefix,
        prefix + " dict:" + dictionaryByteSize,
        prefix + " values:" + String.valueOf(encodedValues.size() * 4),
        prefix
        );
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/Int96Value.java`
#### Snippet
```java
  @Override
  public String toString() {
    return "Int96Value{" + String.valueOf(value) + "}";
  }
}
```

## RuleId[ruleID=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'decompress'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/DirectCodecFactory.java`
#### Snippet
```java
      tempClass = Class.forName("org.apache.hadoop.io.compress.DirectDecompressionCodec");
      tempCreateMethod = tempClass.getMethod("createDirectDecompressor");
      tempDecompressMethod = tempClass.getMethod("decompress", ByteBuffer.class, ByteBuffer.class);
    } catch (ClassNotFoundException | NoSuchMethodException e) {
      // do nothing, the class will just be assigned null
```

### JavaReflectionMemberAccess
Cannot resolve method 'invokeCleaner'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/CleanUtil.java`
#### Snippet
```java
        theUnsafe.setAccessible(true);
        unsafeLocal = theUnsafe.get(null);
        invokeCleanerMethodLocal = clazz.getMethod("invokeCleaner", ByteBuffer.class);
        invokeCleanerMethodLocal.invoke(unsafeLocal, tempBuffer);
      } catch (IllegalAccessException | IllegalArgumentException
```

### JavaReflectionMemberAccess
Cannot resolve method 'setReadLength'
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftBytesWriteSupport.java`
#### Snippet
```java
  static {
    try {
      SET_READ_LENGTH = TBinaryProtocol.class.getMethod("setReadLength", int.class);
    } catch (NoSuchMethodException e) {
      SET_READ_LENGTH = null;
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getOutputCommitter()` overrides synchronized method
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java

  @Override
  public OutputCommitter getOutputCommitter(TaskAttemptContext context)
      throws IOException {
    if (committer == null) {
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @see java.io.InputStream#reset()
   */
  public void reset() throws IOException {
    in.reset();
  }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @see java.io.InputStream#mark(int)
   */
  public void mark(int readlimit) {
    in.mark(readlimit);
  }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `parquet-common/src/main/java/org/apache/parquet/bytes/ByteBufferInputStream.java`
#### Snippet
```java
  }

  public void reset() throws IOException {
    delegate.reset();
  }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `parquet-common/src/main/java/org/apache/parquet/bytes/ByteBufferInputStream.java`
#### Snippet
```java
  }

  public void mark(int readlimit) {
    delegate.mark(readlimit);
  }
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroIndexedRecordConverter.java`
#### Snippet
```java
          @Override
          @SuppressWarnings("unchecked")
          public void add(Object value) {
            array.add(value);
          }
```

### RedundantSuppression
Redundant suppression
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java
          @Override
          @SuppressWarnings("unchecked")
          public void add(Object value) {
            container.add(value);
          }
```

### RedundantSuppression
Redundant suppression
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java
          @Override
          @SuppressWarnings("unchecked")
          public void add(Object value) {
            ElementConverter.this.element = value;
          }
```

### RedundantSuppression
Redundant suppression
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private ParentValueContainer createSetterAndContainer() {
      if (elementClass == boolean.class) {
        final BooleanArrayList list = new BooleanArrayList();
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnMaskingCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(mode != null && (mode.equals("nullify")),
      "mask mode cannot be null and can be only nullify");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(target != null,
      "A Parquet file is required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCSVCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(targets != null && targets.size() == 1,
        "CSV path is required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(targets != null && targets.size() == 1,
        "A data file is required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ParquetMetadataCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(targets != null && targets.size() >= 1,
        "A Parquet file is required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/SchemaCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(targets != null && targets.size() == 1,
        "Parquet file is required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowBloomFilterCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(file != null,
      "A Parquet file is required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowDictionaryCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(targets != null && targets.size() >= 1,
        "A Parquet file is required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowPagesCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(targets != null && targets.size() >= 1,
        "A Parquet file is required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ToAvroCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(targets != null && targets.size() == 1,
        "A data file is required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/TransCompressionCommand.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public int run() throws IOException {
    Preconditions.checkArgument(input != null && output != null,
      "Both input and output parquet file paths are required.");
```

### RedundantSuppression
Redundant suppression
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public PrimitiveStringifier stringifier() {
    LogicalTypeAnnotation logicalTypeAnnotation = getLogicalTypeAnnotation();
    return logicalTypeAnnotation == null ? PrimitiveStringifier.DEFAULT_STRINGIFIER : logicalTypeAnnotation.valueStringifier(this);
```

### RedundantSuppression
Redundant suppression
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  static <T> ReadSupport<T> getReadSupportInstance(
      Class<? extends ReadSupport<T>> readSupportClass){
    try {
```

### RedundantSuppression
Redundant suppression
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  @Override
  public void prepareToRead(@SuppressWarnings("rawtypes") RecordReader reader, PigSplit split)
      throws IOException {
    LOG.debug("LoadFunc.prepareToRead({}, {})", reader, split);
```

### RedundantSuppression
Redundant suppression
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetStorer.java`
#### Snippet
```java
  @SuppressWarnings({ "rawtypes", "unchecked" }) // that's how the base class is defined
  @Override
  public void prepareToWrite(RecordWriter recordWriter) throws IOException {
    this.recordWriter = recordWriter;
  }
```

### RedundantSuppression
Redundant suppression
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/AbstractThriftWriteSupport.java`
#### Snippet
```java

    try {
      @SuppressWarnings("unchecked")
      Class thriftClass = Class.forName(thriftClassName);
      return thriftClass;
    } catch (ClassNotFoundException e) {
```

### RedundantSuppression
Redundant suppression
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ParquetThriftInputFormat.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public ParquetThriftInputFormat() {
    this(ThriftReadSupport.class);
  }
```

### RedundantSuppression
Redundant suppression
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/pig/ParquetThriftStorer.java`
#### Snippet
```java
  @SuppressWarnings({ "rawtypes", "unchecked" }) // that's how the base class is defined
  @Override
  public void prepareToWrite(RecordWriter recordWriter) throws IOException {
    this.recordWriter = recordWriter;
  }
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'crc'
in `parquet-column/src/main/java/org/apache/parquet/column/page/Page.java`
#### Snippet
```java
  // verification. There crc value here will merely be a copy of the actual crc field read in
  // ParquetFileReader.Chunk.readAllPages()
  private OptionalInt crc = OptionalInt.empty();

  // Visible for testing
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `parquet-column/src/main/java/org/apache/parquet/column/values/plain/PlainValuesWriter.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(PlainValuesWriter.class);

  public static final Charset CHARSET = Charset.forName("UTF-8");

  private CapacityByteArrayOutputStream arrayOut;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `parquet-pig/src/main/java/org/apache/parquet/pig/TupleWriteSupport.java`
#### Snippet
```java
            bytes = ((DataByteArray)t.get(i)).get();
          } else if (pigType.type == DataType.CHARARRAY) {
            bytes = ((String)t.get(i)).getBytes("UTF-8");
          } else {
            throw new UnsupportedOperationException("can not convert from " + DataType.findTypeName(pigType.type) + " to BINARY ");
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
  /** @deprecated Use {@link StandardCharsets#UTF_8} instead */
  @Deprecated
  public static final Charset UTF8 = Charset.forName("UTF-8");

  /**
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    if (args.length != 1) {
      System.err.println("usage PrintFooter <path>");
      return;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    Path summary = new Path(fileStatus.getPath(), PARQUET_METADATA_FILE);
    if (fileStatus.isDir() && fs.exists(summary)) {
      System.out.println("reading summary file");
      FileStatus summaryStatus = fs.getFileStatus(summary);
      List<Footer> readSummaryFile = ParquetFileReader.readSummaryFile(configuration, summaryStatus);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
      List<FileStatus> statuses;
      if (fileStatus.isDir()) {
        System.out.println("listing files in " + fileStatus.getPath());
        statuses = Arrays.asList(fs.listStatus(fileStatus.getPath(), HiddenFileFilter.INSTANCE));
      } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
        statuses.add(fileStatus);
      }
      System.out.println("opening " + statuses.size() + " files");
      int i = 0;
      ExecutorService threadPool = Executors.newFixedThreadPool(5);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
        int previousPercent = 0;
        int n = 60;
        System.out.print("0% [");
        for (int j = 0; j < n; j++) {
          System.out.print(" ");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
        System.out.print("0% [");
        for (int j = 0; j < n; j++) {
          System.out.print(" ");

        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java

        }
        System.out.print("] 100%");
        for (int j = 0; j < n + 6; j++) {
          System.out.print('\b');
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
        System.out.print("] 100%");
        for (int j = 0; j < n + 6; j++) {
          System.out.print('\b');
        }
        while (!footers.isEmpty()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
          int currentPercent = (++i * n / statuses.size());
          while (currentPercent > previousPercent) {
            System.out.print("*");
            previousPercent ++;
          }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
          add(footer);
        }
        System.out.println("");
        long t1 = System.currentTimeMillis();
        System.out.println("read all footers in " + (t1 - t0) + " ms");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
        System.out.println("");
        long t1 = System.currentTimeMillis();
        System.out.println("read all footers in " + (t1 - t0) + " ms");
      } finally {
        threadPool.shutdownNow();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    for (Entry<ColumnDescriptor, ColStats> entry : entries) {
      ColStats colStats = entry.getValue();
      System.out.println(entry.getKey() +" " + percent(colStats.allStats.total, total) + "% of all space " + colStats);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    }

    System.out.println("number of blocks: " + blockCount);
    System.out.println("total data size: " + humanReadable(total) + " (raw " + humanReadable(totalUnc) + ")");
    System.out.println("total record: " + humanReadable(recordCount));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java

    System.out.println("number of blocks: " + blockCount);
    System.out.println("total data size: " + humanReadable(total) + " (raw " + humanReadable(totalUnc) + ")");
    System.out.println("total record: " + humanReadable(recordCount));
    System.out.println("average block size: " + humanReadable(total/blockCount) + " (raw " + humanReadable(totalUnc/blockCount) + ")");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    System.out.println("number of blocks: " + blockCount);
    System.out.println("total data size: " + humanReadable(total) + " (raw " + humanReadable(totalUnc) + ")");
    System.out.println("total record: " + humanReadable(recordCount));
    System.out.println("average block size: " + humanReadable(total/blockCount) + " (raw " + humanReadable(totalUnc/blockCount) + ")");
    System.out.println("average record count: " + humanReadable(recordCount/blockCount));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    System.out.println("total data size: " + humanReadable(total) + " (raw " + humanReadable(totalUnc) + ")");
    System.out.println("total record: " + humanReadable(recordCount));
    System.out.println("average block size: " + humanReadable(total/blockCount) + " (raw " + humanReadable(totalUnc/blockCount) + ")");
    System.out.println("average record count: " + humanReadable(recordCount/blockCount));
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    System.out.println("total record: " + humanReadable(recordCount));
    System.out.println("average block size: " + humanReadable(total/blockCount) + " (raw " + humanReadable(totalUnc/blockCount) + ")");
    System.out.println("average record count: " + humanReadable(recordCount/blockCount));
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java

  private static void printTotalString(String message, long total, long totalUnc) {
    System.out.println("total "+message+": " + humanReadable(total) + " (raw "+humanReadable(totalUnc)+" saved "+percentComp(totalUnc, total)+"%)");
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java
    CompatibilityReport report = new CompatibilityChecker().checkCompatibility(oldStruct, newStruct);
    if (!report.isCompatible) {
      System.err.println("schema not compatible");
      System.err.println(report.getMessages());
      System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java
    if (!report.isCompatible) {
      System.err.println("schema not compatible");
      System.err.println(report.getMessages());
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java

    if (report.hasEmptyStruct()) {
      System.err.println("schema contains empty struct");
      System.err.println(report.getMessages());
      System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java
    if (report.hasEmptyStruct()) {
      System.err.println("schema contains empty struct");
      System.err.println(report.getMessages());
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java
    }

    System.out.println("[success] schema is compatible");

  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/PageChecksumDataGenerator.java`
#### Snippet
```java
                           CompressionCodecName compression) throws IOException {
    if (exists(configuration, outFile)) {
      System.out.println("File already exists " + outFile);
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/BenchmarkUtils.java`
#### Snippet
```java
      if (fs.exists(path)) {
        if (!fs.delete(path, true)) {
          System.err.println("Couldn't delete " + path);
        }
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/BenchmarkUtils.java`
#### Snippet
```java
      }
    } catch (IOException e) {
      System.err.println("Couldn't delete " + path);
      e.printStackTrace();
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/DataGenerator.java`
#### Snippet
```java
    DataGenerator generator = new DataGenerator();
    if (args.length < 1) {
      System.err.println("Please specify a command (generate|cleanup).");
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/DataGenerator.java`
#### Snippet
```java
  {
    if (exists(configuration, outFile)) {
      System.out.println("File already exists " + outFile);
      return;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/DataGenerator.java`
#### Snippet
```java
    }

    System.out.println("Generating data @ " + outFile);

    MessageType schema = parseMessageType(
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/CleanUtil.java`
#### Snippet
```java

  private static final int majorVersion =
    Integer.parseInt(System.getProperty("java.version").split("\\D+")[0]);

  static {
```

## RuleId[ruleID=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.apache.parquet.avro.AvroWriteSupport;`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetOutputFormat.java`
#### Snippet
```java
import org.apache.avro.generic.IndexedRecord;
import org.apache.hadoop.mapreduce.Job;
import org.apache.parquet.avro.AvroWriteSupport;
import org.apache.parquet.hadoop.ParquetOutputFormat;
import org.apache.parquet.hadoop.util.ContextUtil;
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `BaseCommand()` of an abstract class should not be declared 'public'
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java
  private LocalFileSystem localFS = null;

  public BaseCommand(Logger console) {
    this.console = console;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AvroGroupConverter()` of an abstract class should not be declared 'public'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java
    protected final ParentValueContainer parent;

    public AvroGroupConverter(ParentValueContainer parent) {
      this.parent = parent;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BinaryConverter()` of an abstract class should not be declared 'public'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java
    private T[] dict = null;

    public BinaryConverter(ParentValueContainer parent) {
      super(parent);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Dictionary()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/column/Dictionary.java`
#### Snippet
```java
  private final Encoding encoding;

  public Dictionary(Encoding encoding) {
    this.encoding = encoding;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `DeltaBinaryPackingValuesWriter()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriter.java`
#### Snippet
```java

// TODO: remove this.
  public DeltaBinaryPackingValuesWriter(int slabSize, int pageSize, ByteBufferAllocator allocator) {
    this(DEFAULT_NUM_BLOCK_VALUES, DEFAULT_NUM_MINIBLOCKS, slabSize, pageSize, allocator);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `DeltaBinaryPackingValuesWriter()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriter.java`
#### Snippet
```java
  }

  public DeltaBinaryPackingValuesWriter(int blockSizeInValues, int miniBlockNum, int slabSize, int pageSize, ByteBufferAllocator allocator) {
    this.config = new DeltaBinaryPackingConfig(blockSizeInValues, miniBlockNum);
    bitWidths = new int[config.miniBlockNumInABlock];
```

### NonProtectedConstructorInAbstractClass
Constructor `ByteStreamSplitValuesWriter()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/column/values/bytestreamsplit/ByteStreamSplitValuesWriter.java`
#### Snippet
```java
  private CapacityByteArrayOutputStream[] byteStreams;

  public ByteStreamSplitValuesWriter(int elementSizeInBytes, int initialCapacity, int pageSize, ByteBufferAllocator allocator) {
    if (elementSizeInBytes <= 0) {
      throw new ParquetEncodingException(String.format("Element byte size is invalid: %d", elementSizeInBytes));
```

### NonProtectedConstructorInAbstractClass
Constructor `Type()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
   */
  @Deprecated
  public Type(String name, Repetition repetition) {
    this(name, repetition, (LogicalTypeAnnotation) null, null);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Type()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
   */
  @Deprecated
  public Type(String name, Repetition repetition, OriginalType originalType) {
    this(name, repetition, originalType, null);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `UserDefinedPredicate()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/UserDefinedPredicate.java`
#### Snippet
```java
   * constructor.
   */
  public UserDefinedPredicate() { }

  /**
```

### NonProtectedConstructorInAbstractClass
Constructor `IncrementallyUpdatedFilterPredicateBuilderBase()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicateBuilderBase.java`
#### Snippet
```java

  @Deprecated
  public IncrementallyUpdatedFilterPredicateBuilderBase() { }

  public IncrementallyUpdatedFilterPredicateBuilderBase(List<PrimitiveColumnIO> leaves) {
```

### NonProtectedConstructorInAbstractClass
Constructor `IncrementallyUpdatedFilterPredicateBuilderBase()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicateBuilderBase.java`
#### Snippet
```java
  public IncrementallyUpdatedFilterPredicateBuilderBase() { }

  public IncrementallyUpdatedFilterPredicateBuilderBase(List<PrimitiveColumnIO> leaves) {
    for (PrimitiveColumnIO leaf : leaves) {
      ColumnDescriptor descriptor = leaf.getColumnDescriptor();
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseMapBuilder()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
    private Type valueType = null;

    public BaseMapBuilder(P parent) {
      super(parent);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseListBuilder()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
    }

    public BaseListBuilder(Class<P> returnType) {
      super(returnType);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseListBuilder()` of an abstract class should not be declared 'public'
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
    private P parent;

    public BaseListBuilder(P parent) {
      super(parent);
      this.parent = parent;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractThriftWriteSupport()` of an abstract class should not be declared 'public'
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/AbstractThriftWriteSupport.java`
#### Snippet
```java
   * the configuration must contain a thriftClass setting
   */
  public AbstractThriftWriteSupport() {
  }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractThriftWriteSupport()` of an abstract class should not be declared 'public'
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/AbstractThriftWriteSupport.java`
#### Snippet
```java
   * @param thriftClass the thrift class used for writing values
   */
  public AbstractThriftWriteSupport(Class<T> thriftClass) {
    init(thriftClass);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ParquetProtocol()` of an abstract class should not be declared 'public'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetProtocol.java`
#### Snippet
```java
   * @param name a meaningful debugging name for anonymous inner classes
   */
  public ParquetProtocol(String name) {
    super(null);
    this.name = name;
```

### NonProtectedConstructorInAbstractClass
Constructor `ListWriteProtocol()` of an abstract class should not be declared 'public'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
    protected int size;

    public ListWriteProtocol(Events returnClause) {
      super(returnClause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `FieldBaseWriteProtocol()` of an abstract class should not be declared 'public'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
    private final Events returnClause;

    public FieldBaseWriteProtocol(Events returnClause) {
      this.returnClause = returnClause;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ParquetRuntimeException()` of an abstract class should not be declared 'public'
in `parquet-common/src/main/java/org/apache/parquet/ParquetRuntimeException.java`
#### Snippet
```java
  }

  public ParquetRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ParquetRuntimeException()` of an abstract class should not be declared 'public'
in `parquet-common/src/main/java/org/apache/parquet/ParquetRuntimeException.java`
#### Snippet
```java
  private static final long serialVersionUID = 1L;

  public ParquetRuntimeException() {
    super();
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ParquetRuntimeException()` of an abstract class should not be declared 'public'
in `parquet-common/src/main/java/org/apache/parquet/ParquetRuntimeException.java`
#### Snippet
```java
  }

  public ParquetRuntimeException(String message) {
    super(message);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ParquetRuntimeException()` of an abstract class should not be declared 'public'
in `parquet-common/src/main/java/org/apache/parquet/ParquetRuntimeException.java`
#### Snippet
```java
  }

  public ParquetRuntimeException(Throwable cause) {
    super(cause);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `DelegatingPositionOutputStream()` of an abstract class should not be declared 'public'
in `parquet-common/src/main/java/org/apache/parquet/io/DelegatingPositionOutputStream.java`
#### Snippet
```java
  private final OutputStream stream;

  public DelegatingPositionOutputStream(OutputStream stream) {
    this.stream = stream;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `DelegatingSeekableInputStream()` of an abstract class should not be declared 'public'
in `parquet-common/src/main/java/org/apache/parquet/io/DelegatingSeekableInputStream.java`
#### Snippet
```java
  private final InputStream stream;

  public DelegatingSeekableInputStream(InputStream stream) {
    this.stream = stream;
  }
```

## RuleId[ruleID=JavaReflectionInvocation]
### JavaReflectionInvocation
2 arguments are expected
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java

      try {
        return (Class<T>) getClassMethod.invoke(schema);
      } catch (IllegalAccessException | InvocationTargetException e) {
        return null;
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `parquet-common/src/main/java/org/apache/parquet/util/DynConstructors.java`
#### Snippet
```java
      try {
        return ctor.newInstance(args);
      } catch (InstantiationException | IllegalAccessException e) {
        throw e;
      } catch (InvocationTargetException e) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `keyIdInFile`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyWrapper.java`
#### Snippet
```java
    if (null == keyIdInFile) {
      if (isFooterKey) {
        keyIdInFile = KeyMaterial.FOOTER_KEY_ID_IN_FILE;
      } else {
        keyIdInFile = KeyMaterial.COLUMN_KEY_ID_IN_FILE_PREFIX + keyCounter;
```

### AssignmentToMethodParameter
Assignment to method parameter `keyIdInFile`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyWrapper.java`
#### Snippet
```java
        keyIdInFile = KeyMaterial.FOOTER_KEY_ID_IN_FILE;
      } else {
        keyIdInFile = KeyMaterial.COLUMN_KEY_ID_IN_FILE_PREFIX + keyCounter;
        keyCounter++;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/DirectCodecFactory.java`
#### Snippet
```java
  private ByteBuffer ensure(ByteBuffer buffer, int size) {
    if (buffer == null) {
      buffer = allocator.allocate(size);
    } else if (buffer.capacity() >= size) {
      buffer.clear();
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/DirectCodecFactory.java`
#### Snippet
```java
    } else {
      release(buffer);
      buffer = allocator.allocate(size);
    }
    return buffer;
```

### AssignmentToMethodParameter
Assignment to method parameter `columnCount`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java

      childBuilder.named(schemaElement.name);
      ++columnCount;
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `encryptionProperties`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetWriter.java`
#### Snippet
```java
    if (encryptionProperties == null) {
      String path = file == null ? null : file.getPath();
      encryptionProperties = ParquetOutputFormat.createEncryptionProperties(conf,
          path == null ? null : new Path(path), writeContext);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `originalCreatedBy`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
    this.schema = schema;
    this.newCodecName = codecName;
    originalCreatedBy = originalCreatedBy == null ? meta.getFileMetaData().getCreatedBy() : originalCreatedBy;
    extraMetaData.putAll(meta.getFileMetaData().getKeyValueMetaData());
    extraMetaData.put(ORIGINAL_CREATED_BY_KEY, originalCreatedBy);
```

### AssignmentToMethodParameter
Assignment to method parameter `encryptionProperties`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java

    if (null == encryptionProperties) {
      encryptionProperties = encryptor.getEncryptionProperties();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `outputPath`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java

    FileSystem fs = outputPath.getFileSystem(configuration);
    outputPath = outputPath.makeQualified(fs);
    ParquetMetadata metadataFooter = mergeFooters(outputPath, footers);

```

### AssignmentToMethodParameter
Assignment to method parameter `offsetIndex`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java

    if (newChunkStart != start) {
      offsetIndex = OffsetIndexBuilder.getBuilder()
        .fromOffsetIndex(offsetIndex)
        .build(newChunkStart - start);
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `parquet-column/src/main/java/org/apache/parquet/column/values/deltastrings/DeltaByteArrayWriter.java`
#### Snippet
```java
  @Override
  public String memUsageString(String prefix) {
    prefix = prefixLengthWriter.memUsageString(prefix);
    return suffixWriter.memUsageString(prefix + "  DELTA_STRINGS");
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `numBytes`
in `parquet-column/src/main/java/org/apache/parquet/column/values/bloomfilter/BlockSplitBloomFilter.java`
#### Snippet
```java
  private void initBitset(int numBytes) {
    if (numBytes < minimumBytes) {
      numBytes = minimumBytes;
    }
    // Get next power of 2 if it is not power of 2.
```

### AssignmentToMethodParameter
Assignment to method parameter `numBytes`
in `parquet-column/src/main/java/org/apache/parquet/column/values/bloomfilter/BlockSplitBloomFilter.java`
#### Snippet
```java
    // Get next power of 2 if it is not power of 2.
    if ((numBytes & (numBytes - 1)) != 0) {
      numBytes = Integer.highestOneBit(numBytes) << 1;
    }
    if (numBytes > maximumBytes || numBytes < 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `numBytes`
in `parquet-column/src/main/java/org/apache/parquet/column/values/bloomfilter/BlockSplitBloomFilter.java`
#### Snippet
```java
    }
    if (numBytes > maximumBytes || numBytes < 0) {
      numBytes = maximumBytes;
    }
    this.bitset = new byte[numBytes];
```

### AssignmentToMethodParameter
Assignment to method parameter `repetition`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
        foundNullSchema = true;
        if (Type.Repetition.REQUIRED == repetition) {
          repetition = Type.Repetition.OPTIONAL;
        }
      } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `parquet-column/src/main/java/org/apache/parquet/schema/MessageTypeParser.java`
#### Snippet
```java
  private static void addGroupTypeFields(String t, Tokenizer st, Types.GroupBuilder builder) {
    check(t, "{", "start of message", st);
    while (!(t = st.nextToken()).equals("}")) {
      addType(t, st, builder);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `columnOrder`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java

    if (columnOrder == null) {
      columnOrder = primitive == PrimitiveTypeName.INT96 || logicalTypeAnnotation instanceof LogicalTypeAnnotation.IntervalLogicalTypeAnnotation
        ? ColumnOrder.undefined()
        : ColumnOrder.typeDefined();
```

### AssignmentToMethodParameter
Assignment to method parameter `columnOrder`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java

    if (columnOrder == null) {
      columnOrder = primitive == PrimitiveTypeName.INT96 || originalType == OriginalType.INTERVAL
          ? ColumnOrder.undefined()
          : ColumnOrder.typeDefined();
```

### AssignmentToMethodParameter
Assignment to method parameter `descriptor`
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoSchemaConverter.java`
#### Snippet
```java
  private String getInnerTypeName(FieldDescriptor descriptor) {
    if (descriptor.isMapField() && parquetSpecsCompliant) {
      descriptor = descriptor.getMessageType().getFields().get(1);
    }
    if (descriptor.getJavaType() != JavaType.MESSAGE) {
```

### AssignmentToMethodParameter
Assignment to method parameter `depth`
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoSchemaConverter.java`
#### Snippet
```java
  private <T> Builder<? extends Builder<?, GroupBuilder<T>>, GroupBuilder<T>> addMessageField(FieldDescriptor descriptor, final GroupBuilder<T> builder, ImmutableSetMultimap<String, Integer> seen, int depth) {
    // Prevent recursion by terminating with optional proto bytes.
    depth += 1;
    String typeName = getInnerTypeName(descriptor);
    LOG.trace("addMessageField: {} type: {} depth: {}", descriptor.getFullName(), typeName, depth);
```

### AssignmentToMethodParameter
Assignment to method parameter `seen`
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoSchemaConverter.java`
#### Snippet
```java
    }

    seen = ImmutableSetMultimap.<String, Integer>builder().putAll(seen).put(typeName, depth).build();

    if (descriptor.isRepeated() && parquetSpecsCompliant) {
```

### AssignmentToMethodParameter
Assignment to method parameter `groupBuilder`
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoSchemaConverter.java`
#### Snippet
```java
  private <T> GroupBuilder<T> convertFields(GroupBuilder<T> groupBuilder, List<FieldDescriptor> fieldDescriptors, ImmutableSetMultimap<String, Integer> seen, int depth) {
    for (FieldDescriptor fieldDescriptor : fieldDescriptors) {
      groupBuilder = addField(fieldDescriptor, groupBuilder, seen, depth)
          .id(fieldDescriptor.getNumber())
          .named(fieldDescriptor.getName());
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    while ((value & 0xFFFFFF80) != 0L) {
      dest.putInt((value & 0x7F) | 0x80);
      value >>>= 7;
    }
    dest.putInt(value & 0x7F);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    while ((value & 0xFFFFFFFFFFFFFF80L) != 0L) {
      out.write((int)((value & 0x7F) | 0x80));
      value >>>= 7;
    }
    out.write((int)(value & 0x7F));
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
    while ((value & 0xFFFFFF80) != 0L) {
      out.write((value & 0x7F) | 0x80);
      value >>>= 7;
    }
    out.write(value & 0x7F);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `parquet-common/src/main/java/org/apache/parquet/hadoop/metadata/Canonicalizer.java`
#### Snippet
```java
    T canonical = canonicals.get(value);
    if (canonical == null) {
      value = toCanonical(value);
      T existing = canonicals.putIfAbsent(value, value);
      // putIfAbsent is atomic, making sure we always return the same canonical representation of the value
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java
  private <T> GroupBuilder<T> addToBuilder(List<TypeMapping> parquetFields, GroupBuilder<T> builder) {
    for (TypeMapping type : parquetFields) {
      builder = builder.addField(type.getParquetType());
    }
    return builder;
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  void finish(int numberOfBits, int buffer, OutputStream out) throws IOException {
    int padding = numberOfBits % 8 == 0 ? 0 : 8 - (numberOfBits % 8);
    buffer = buffer << padding;
    int numberOfBytes = (numberOfBits + padding) / 8;
    for (int i = (numberOfBytes - 1) * 8; i >= 0 ; i -= 8) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  void finish(int numberOfBits, long buffer, OutputStream out) throws IOException {
    int padding = numberOfBits % 8 == 0 ? 0 : 8 - (numberOfBits % 8);
    buffer = buffer << padding;
    int numberOfBytes = (numberOfBits + padding) / 8;
    for (int i = (numberOfBytes - 1) * 8; i >= 0 ; i -= 8) {
```

## RuleId[ruleID=PrimitiveArrayArgumentToVariableArgMethod]
### PrimitiveArrayArgumentToVariableArgMethod
Confusing primitive array argument to varargs method
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroIndexedRecordConverter.java`
#### Snippet
```java
        }
        try {
          Object fixed = fixedClassCtor.newInstance(value.getBytes());
          parent.add(fixed);
        } catch (Exception e) {
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/HadoopReadOptions.java`
#### Snippet
```java
    DecryptionPropertiesFactory cryptoFactory = DecryptionPropertiesFactory.loadFactory(hadoopConfig);
    if (null == cryptoFactory) {
      return null;
    }
    return cryptoFactory.getFileDecryptionProperties(hadoopConfig, file);
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/EncryptionPropertiesFactory.java`
#### Snippet
```java
    if (null == encryptionPropertiesFactoryClass) {
      LOG.debug("EncryptionPropertiesFactory is not configured - name not found in hadoop config");
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/DecryptionPropertiesFactory.java`
#### Snippet
```java
    if (null == decryptionPropertiesFactoryClass) {
      LOG.debug("DecryptionPropertiesFactory is not configured - name not found in hadoop config");
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/FileDecryptionProperties.java`
#### Snippet
```java
  public byte[] getColumnKey(ColumnPath path) {
    if (null == columnPropertyMap) {
      return null;
    }
    ColumnDecryptionProperties columnDecryptionProperties = columnPropertyMap.get(path);
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/FileDecryptionProperties.java`
#### Snippet
```java
    ColumnDecryptionProperties columnDecryptionProperties = columnPropertyMap.get(path);
    if (null == columnDecryptionProperties) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/InternalFileEncryptor.java`
#### Snippet
```java

  public BlockCipher.Encryptor getFooterEncryptor()  {
    if (!encryptFooter) return null;
    return getThriftModuleEncryptor(null);
  }
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/PropertiesDrivenCryptoFactory.java`
#### Snippet
```java
    if (emptyFooterKeyId && emptyColumnKeyIds && emptyUniformKeyId) {
      LOG.debug("Unencrypted file: {}", tempFilePath);
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnChunkPageReadStore.java`
#### Snippet
```java
      final DataPage compressedPage = compressedPages.poll();
      if (compressedPage == null) {
        return null;
      }
      final int currentPageIndex = pageIndex++;
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnChunkPageReadStore.java`
#### Snippet
```java
    public DictionaryPage readDictionaryPage() {
      if (compressedDictionaryPage == null) {
        return null;
      }
      try {
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/CodecFactory.java`
#### Snippet
```java
    String codecClassName = codecName.getHadoopCompressionCodecClassName();
    if (codecClassName == null) {
      return null;
    }
    CompressionCodec codec = CODEC_BY_NAME.get(codecClassName);
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/LruCache.java`
#### Snippet
```java
      // value is not current; remove it and return null
      remove(key);
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnIndexStoreImpl.java`
#### Snippet
```java
    @Override
    public ColumnIndex getColumnIndex(ColumnPath column) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnIndexStoreImpl.java`
#### Snippet
```java
    @Override
    public OffsetIndex getOffsetIndex() {
      return null;
    }
  };
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnIndexStoreImpl.java`
#### Snippet
```java
    @Override
    public ColumnIndex getColumnIndex() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/DirectCodecFactory.java`
#### Snippet
```java
      allocator.release(buffer);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java
    final String className = configuration.get(WRITE_SUPPORT_CLASS);
    if (className == null) {
      return null;
    }
    final Class<?> writeSupportClass = ConfigurationUtil.getClassFromConfig(configuration, WRITE_SUPPORT_CLASS, WriteSupport.class);
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java
    EncryptionPropertiesFactory cryptoFactory = EncryptionPropertiesFactory.loadFactory(fileHadoopConfig);
    if (null == cryptoFactory) {
      return null;
    }
    return cryptoFactory.getFileEncryptionProperties(fileHadoopConfig, tempFilePath, fileWriteContext);
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/BloomFilterReader.java`
#### Snippet
```java
        BloomFilter bloomFilter = reader.readBloomFilter(meta);
        if (bloomFilter == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/BloomFilterReader.java`
#### Snippet
```java
    }

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
  private static UnboundRecordFilter getUnboundRecordFilterInstance(Configuration configuration) {
    Class<?> clazz = ConfigurationUtil.getClassFromConfig(configuration, UNBOUND_RECORD_FILTER, UnboundRecordFilter.class);
    if (clazz == null) { return null; }

    try {
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/api/WriteSupport.java`
#### Snippet
```java
   */
  public String getName() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ConfigurationUtil.java`
#### Snippet
```java
    final String className = configuration.get(configName);
    if (className == null) {
      return null;
    }
    
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/SerializationUtil.java`
#### Snippet
```java
    String b64 = conf.get(key);
    if (b64 == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
      return new IndexReference(columnChunk.getOffset_index_offset(), columnChunk.getOffset_index_length());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
      ColumnIndex parquetColumnIndex) {
    if (!isMinMaxStatsSupported(type)) {
      return null;
    }
    return ColumnIndexBuilder.build(type,
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
        return LogicalTypeAnnotation.intType(integer.bitWidth, integer.isSigned);
      case UNKNOWN:
        return null;
      case TIMESTAMP:
        TimestampType timestamp = type.getTIMESTAMP();
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
      return new IndexReference(columnChunk.getColumn_index_offset(), columnChunk.getColumn_index_length());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
      org.apache.parquet.internal.column.columnindex.ColumnIndex columnIndex) {
    if (!isMinMaxStatsSupported(type) || columnIndex == null) {
      return null;
    }
    ColumnIndex parquetColumnIndex = new ColumnIndex(
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
  public EncodingStats convertEncodingStats(List<PageEncodingStats> stats) {
    if (stats == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
  public List<PageEncodingStats> convertEncodingStats(EncodingStats stats) {
    if (stats == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ContextUtil.java`
#### Snippet
```java
        }
      } catch (NoSuchMethodException e) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ContextUtil.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java
  public Compressor createCompressor() {
    // ZstdOutputStream calls static Zstd compressor, so no compressor is created
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java
  public Decompressor createDecompressor() {
    // ZstdInputStream calls static Zstd decompressor, so no decompressor is created
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java
  @Override
  public Class<? extends Compressor> getCompressorType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java
  @Override
  public Class<? extends Decompressor> getDecompressorType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/mapred/DeprecatedParquetInputFormat.java`
#### Snippet
```java
    List<ParquetInputSplit> splits = realInputFormat.getSplits(job, footers);
    if (splits == null) {
      return null;
    }
    InputSplit[] resultSplits = new InputSplit[splits.size()];
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetReader.java`
#### Snippet
```java
      } else {
        initReader();
        return reader == null ? null : read();
      }
    } catch (InterruptedException e) {
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
      return converter.fromParquetStatistics(createdBy, pageStatistics, type);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ColumnMasker.java`
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
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ColumnMasker.java`
#### Snippet
```java
        return org.apache.parquet.hadoop.rewrite.MaskMode.REDACT;
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  private ColumnChunkPageReadStore internalReadRowGroup(int blockIndex) throws IOException {
    if (blockIndex < 0 || blockIndex >= blocks.size()) {
      return null;
    }
    BlockMetaData block = blocks.get(blockIndex);
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  public PageReadStore readNextFilteredRowGroup() throws IOException {
    if (currentBlock == blocks.size()) {
      return null;
    }
    // Filtering not required -> fall back to the non-filtering path
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
      return readFooter(configuration, metadataFile, filter(skipRowGroups));
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  public BloomFilterReader getBloomFilterDataReader(int blockIndex) {
    if (blockIndex < 0 || blockIndex >= blocks.size()) {
      return null;
    }
    return new BloomFilterReader(this, blocks.get(blockIndex));
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java

    if (rowGroup == null) {
      return null;
    }
    this.currentRowGroup = rowGroup;
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
    IndexReference ref = column.getColumnIndexReference();
    if (ref == null) {
      return null;
    }
    f.seek(ref.getOffset());
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  public PageReadStore readFilteredRowGroup(int blockIndex) throws IOException {
    if (blockIndex < 0 || blockIndex >= blocks.size()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
    if (rowCount == 0) {
      // There are no matching rows -> returning null
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  DictionaryPage readDictionary(ColumnChunkMetaData meta) throws IOException {
    if (!meta.hasDictionaryPage()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java

    if (!pageHeader.isSetDictionary_page_header()) {
      return null; // TODO: should this complain?
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
    IndexReference ref = column.getOffsetIndexReference();
    if (ref == null) {
      return null;
    }
    f.seek(ref.getOffset());
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
    long bloomFilterOffset = meta.getBloomFilterOffset();
    if (bloomFilterOffset < 0) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
    } catch (IOException e) {
      LOG.warn("read no bloom filter");
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
    if (numBytes <= 0 || numBytes > BlockSplitBloomFilter.UPPER_BOUND_BYTES) {
      LOG.warn("the read bloom filter size is wrong, size is {}", bloomFilterHeader.getNumBytes());
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
      LOG.warn("the read bloom filter is not supported yet,  algorithm = {}, hash = {}, compression = {}",
        bloomFilterHeader.getAlgorithm(), bloomFilterHeader.getHash(), bloomFilterHeader.getCompression());
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  public DictionaryPageReader getDictionaryReader(int blockIndex) {
    if (blockIndex < 0 || blockIndex >= blocks.size()) {
      return null;
    }
    return new DictionaryPageReader(this, blocks.get(blockIndex));
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/Help.java`
#### Snippet
```java
  @Override
  public List<String> getExamples() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/Util.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/RecordBuilder.java`
#### Snippet
```java
  private static Object makeValue(String string, Schema schema) {
    if (string == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/RecordBuilder.java`
#### Snippet
```java
              return schema.getEnumSymbols().get(Integer.parseInt(string));
            } catch (IndexOutOfBoundsException ex) {
              return null;
            }
          }
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/RecordBuilder.java`
#### Snippet
```java
            }
          }
          return null;
        case NULL:
          return null;
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/RecordBuilder.java`
#### Snippet
```java
          return null;
        case NULL:
          return null;
        default:
          // FIXED, BYTES, MAP, ARRAY, RECORD are not supported
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/RecordBuilder.java`
#### Snippet
```java
      // empty string is considered null for numeric types
      if (string.isEmpty()) {
        return null;
      } else {
        throw e;
```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/dictionarylevel/DictionaryFilter.java`
#### Snippet
```java
    // the chunk may not be dictionary-encoded
    if (page == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/dictionarylevel/DictionaryFilter.java`
#### Snippet
```java
    default:
      LOG.warn("Unsupported dictionary type: {}", type);
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/AvroCSV.java`
#### Snippet
```java
  private static Schema.Type inferFieldType(String example) {
    if (example == null || example.isEmpty()) {
      return null; // not enough information
    } else if (LONG.matcher(example).matches()) {
      return Schema.Type.LONG;
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
    Iterator<Schema> iter = schemas.iterator();
    if (!iter.hasNext()) {
      return null;
    }
    Schema result = iter.next();
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
    // any other cases where the types don't match must be combined by a union
    if (left.getType() != right.getType()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
        if (left.getName() == null && right.getName() == null &&
            fieldSimilarity(left, right) < SIMILARITY_THRESH) {
          return null;
        } else if (!Objects.equal(left.getName(), right.getName())) {
          return null;
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
          return null;
        } else if (!Objects.equal(left.getName(), right.getName())) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
      case ENUM:
        if (!Objects.equal(left.getName(), right.getName())) {
          return null;
        }
        Set<String> symbols = Sets.newLinkedHashSet();
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
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
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
    Iterator<Schema> iter = schemas.iterator();
    if (!iter.hasNext()) {
      return null;
    }
    Schema result = iter.next();
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CheckParquet251Command.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

    public T nullNode(NullNode nullNode) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

    public T object(ObjectNode object, Map<String, T> fields) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

    public T bool(BooleanNode bool) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

    public T binary(BinaryNode binary) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

    public T number(NumericNode number) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

    public T text(TextNode text) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

    public T missing(MissingNode missing) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

    if (!schemas.hasNext()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java
                                     Schema schema) {
    if (datum == null) {
      return null;
    }
    switch (schema.getType()) {
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

      case NULL:
        return null;

      default:
```

### ReturnNull
Return of `null`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java

    public T array(ArrayNode array, List<T> elements) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/io/FilteredRecordReader.java`
#### Snippet
```java
    skipToMatch();
    if (recordsRead == recordCount) {
      return null;
    }
    ++ recordsRead;
```

### ReturnNull
Return of `null`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroIndexedRecordConverter.java`
#### Snippet
```java
    if (model.getConversionFor(schema.getLogicalType()) != null) {
      // use generic classes to pass data to conversions
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroIndexedRecordConverter.java`
#### Snippet
```java
      return (Class<T>) ((SpecificData) model).getClass(schema);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java
    if (conversion != null) {
      // use generic classes to pass data to conversions
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java

    } else if (model.getClass() == GenericData.class) {
      return null;

    } else {
```

### ReturnNull
Return of `null`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java
        getClassMethod = modelClass.getMethod("getClass", Schema.class);
      } catch (NoSuchMethodException e) {
        return null; // no getClass method
      }

```

### ReturnNull
Return of `null`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java
        return (Class<T>) getClassMethod.invoke(schema);
      } catch (IllegalAccessException | InvocationTargetException e) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/column/values/ValuesWriter.java`
#### Snippet
```java
   */
  public DictionaryPage toDictPageAndClose() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
        return dictPage(dictionaryEncoder);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
        return dictPage(dictionaryEncoder);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
        return dictPage(dictionaryEncoder);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
        return dictPage(dictionaryEncoder);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
        return dictPage(dictionaryEncoder);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
        return dictPage(dictionaryEncoder);
      }
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
  private LogicalType convertLogicalType(LogicalTypeAnnotation annotation) {
    if (annotation == null) {
      return null;
    }
    return annotation.accept(new LogicalTypeAnnotation.LogicalTypeAnnotationVisitor<LogicalType>() {
```

### ReturnNull
Return of `null`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
  private LogicalTypeAnnotation convertLogicalType(LogicalType logicalType) {
    if (logicalType == null) {
      return null;
    } else if (logicalType instanceof LogicalTypes.Decimal) {
      LogicalTypes.Decimal decimal = (LogicalTypes.Decimal) logicalType;
```

### ReturnNull
Return of `null`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
      return uuidType();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/BinaryStatistics.java`
#### Snippet
```java
  @Override
  public byte[] getMinBytes() {
    return min == null ? null : min.getBytes();
  }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/BinaryStatistics.java`
#### Snippet
```java
  @Override
  public byte[] getMaxBytes() {
    return max == null ? null : max.getBytes();
  }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
   */
  public OriginalType getOriginalType() {
    return logicalTypeAnnotation == null ? null : logicalTypeAnnotation.toOriginalType();
  }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
      // throw the related unsupported exception
      super.stringify(value);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
      // throw the related unsupported exception
      super.stringify(value);
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
  public static LogicalTypeAnnotation fromOriginalType(OriginalType originalType, DecimalMetadata decimalMetadata) {
    if (originalType == null) {
      return null;
    }
    switch (originalType) {
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
          return OriginalType.TIME_MICROS;
        default:
          return null;
      }
    }
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
          return isSigned ? OriginalType.INT_64 : OriginalType.UINT_64;
        default:
          return null;
      }
    }
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
    public OriginalType toOriginalType() {
      // No OriginalType for UUID
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
          return OriginalType.TIMESTAMP_MICROS;
        default:
          return null;
      }
    }
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/FilteringRecordMaterializer.java`
#### Snippet
```java

    // null - signals a skip
    return (keep) ? delegate.getCurrentRecord() : null;
  }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/DoubleColumnIndexBuilder.java`
#### Snippet
```java
  ColumnIndexBase<Double> createColumnIndex(PrimitiveType type) {
    if (invalid) {
      return null;
    }
    DoubleColumnIndex columnIndex = new DoubleColumnIndex(type);
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/FloatColumnIndexBuilder.java`
#### Snippet
```java
  ColumnIndexBase<Float> createColumnIndex(PrimitiveType type) {
    if (invalid) {
      return null;
    }
    FloatColumnIndex columnIndex = new FloatColumnIndex(type);
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
      do {
        if (lowerLeft > lowerRight) {
          return null;
        }
        int i = floorMid(lowerLeft, lowerRight);
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
      do {
        if (upperLeft > upperRight) {
          return null;
        }
        int i = ceilingMid(upperLeft, upperRight);
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
      do {
        if (lowerLeft > lowerRight) {
          return null;
        }
        int i = floorMid(lowerLeft, lowerRight);
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BoundaryOrder.java`
#### Snippet
```java
      do {
        if (upperLeft > upperRight) {
          return null;
        }
        int i = ceilingMid(upperLeft, upperRight);
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BinaryTruncator.java`
#### Snippet
```java
        newBuffer.limit(newBuffer.limit() - 1);
        if (newBuffer.remaining() == 0) {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BinaryTruncator.java`
#### Snippet
```java
        }
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BinaryTruncator.java`
#### Snippet
```java
    private byte[] incrementUtf8(byte[] array) {
      if (array == null) {
        return null;
      }
      ByteBuffer buffer = ByteBuffer.wrap(array);
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BinaryTruncator.java`
#### Snippet
```java
        array[i] = prev;
      }
      return null; // All characters are the largest possible; unable to increment
    }
  };
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/OffsetIndexBuilder.java`
#### Snippet
```java
  public OffsetIndex build(long shift) {
    if (compressedPageSizes.isEmpty()) {
      return null;
    }
    long[] offsets = this.offsets.toLongArray();
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java

    protected OriginalType getOriginalType () {
      return logicalTypeAnnotation == null ? null : logicalTypeAnnotation.toOriginalType();
    }
  }
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/filter2/columnindex/RowRanges.java`
#### Snippet
```java
        return new Range(right.from, Math.max(left.to, right.to));
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/filter2/columnindex/RowRanges.java`
#### Snippet
```java
        return new Range(left.from, Math.min(left.to, right.to));
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftReadSupport.java`
#### Snippet
```java

    if (Strings.isNullOrEmpty(deprecated) && Strings.isNullOrEmpty(strict)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftMetaData.java`
#### Snippet
```java
    final String thriftDescriptorString = extraMetaData.get(THRIFT_DESCRIPTOR);
    if (thriftClassName == null || thriftDescriptorString == null) {
      return null;
    }
    final StructType descriptor = parseDescriptor(thriftDescriptorString);
```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftMetaData.java`
#### Snippet
```java
      return new ThriftMetaData(thriftClass.getName(), descriptor);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
    public List<Long> getNullCounts() {
      if (nullCounts == null) {
        return null;
      }
      return LongLists.unmodifiable(LongArrayList.wrap(nullCounts));
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
  private ColumnIndexBase<?> build(PrimitiveType type) {
    if (nullPages.isEmpty()) {
      return null;
    }
    ColumnIndexBase<?> columnIndex = createColumnIndex(type);
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
    if (columnIndex == null) {
      // Might happen if the specialized builder discovers invalid min/max values
      return null;
    }
    columnIndex.nullPages = nullPages.toBooleanArray();
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
    ColumnIndexBase<?> columnIndex = build(type);
    if (columnIndex == null) {
      return null;
    }
    columnIndex.boundaryOrder = calculateBoundaryOrder(type.comparator());
```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
    @Override
    ColumnIndexBase<?> createColumnIndex(PrimitiveType type) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
    @Override
    public ColumnIndex build() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    @Override
    public TList readListBegin() throws TException {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    @Override
    public TMap readMapBegin() throws TException {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    @Override
    public ByteBuffer readBinary() throws TException {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    @Override
    public TField readFieldBegin() throws TException {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    @Override
    public TMessage readMessageBegin() throws TException {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    @Override
    public TSet readSetBegin() throws TException {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    @Override
    public String readString() throws TException {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    @Override
    public TStruct readStructBegin() throws TException {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/PigMetaData.java`
#### Snippet
```java
      return new PigMetaData(keyValueMetaData.get(PIG_SCHEMA));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
      LOG.warn("Interrupted", e);
      Thread.currentThread().interrupt();
      return null;
    }
    ResourceStatistics stats = new ResourceStatistics();
```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
  public List<String> getPredicateFields(String s, Job job) throws IOException {
    if(!job.getConfiguration().getBoolean(ENABLE_PREDICATE_FILTER_PUSHDOWN, DEFAULT_PREDICATE_PUSHDOWN_ENABLED)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
        return (Tuple)reader.getCurrentValue();
      } else {
        return null;
      }
    } catch (InterruptedException e) {
```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
    }
    setInput(location, job);
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java

    if (requiredFieldList == null)
      return null;

    schema = getSchemaFromRequiredFieldList(schema, requiredFieldList.getFields());
```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
      case OP_LE: return ltEq(col, value);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
        Schema innerSchema = getSchemaFromRequiredFieldList(f.schema, rf.getSubFields());
        if (innerSchema == null) {
          return null;
        } else {
          f.schema = innerSchema;
```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/MapConverter.java`
#### Snippet
```java
    public Tuple put(String key, Object value) {
      entries.add(new SimpleImmutableEntry<String, Object>(key, value));
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/StringSummaryData.java`
#### Snippet
```java
    Collection<EnumValueCount> values2 = values.getValues();
    if (values2 == null) {
      return null;
    }
    List<EnumValueCount> list = new ArrayList<EnumValueCount>(values2);
```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/TupleReadSupport.java`
#### Snippet
```java

    if(requiredFieldString == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/FieldSummaryData.java`
#### Snippet
```java

  public Long getNull() {
    return nullCount == 0 ? null : nullCount;
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/FieldSummaryData.java`
#### Snippet
```java

  public Long getError() {
    return error == 0 ? null : error;
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/FieldSummaryData.java`
#### Snippet
```java

  public Long getUnknown() {
    return unknown == 0 ? null : unknown;
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/EnumStat.java`
#### Snippet
```java

  public Collection<EnumValueCount> getValues() {
    return values == null ? null : values.values();
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/SummaryData.java`
#### Snippet
```java

  protected Schema getSchema(FieldSchema field) {
    return field == null ? null : field.schema;
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/SummaryData.java`
#### Snippet
```java

  protected String getName(FieldSchema field) {
    return field == null ? null : field.alias;
  }

```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/SummaryData.java`
#### Snippet
```java
    try {
      if (schema == null || i >= schema.size()) {
        return null;
      }
      FieldSchema field = schema.getField(i);
```

### ReturnNull
Return of `null`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java
    public ThriftField getChildById(short id) {
      if (id >= childById.length) {
        return null;
      } else {
        return childById[id];
```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/PigSchemaConverter.java`
#### Snippet
```java
  public static Schema parsePigSchema(String pigSchemaString) {
    try {
      return pigSchemaString == null ? null : Utils.getSchemaFromString(pigSchemaString);
    } catch (ParserException e) {
      throw new SchemaConversionException("could not parse Pig schema: " + pigSchemaString, e);
```

### ReturnNull
Return of `null`
in `parquet-pig/src/main/java/org/apache/parquet/pig/PigSchemaConverter.java`
#### Snippet
```java
  public static RequiredFieldList deserializeRequiredFieldList(String requiredFieldString) {
    if(requiredFieldString == null) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `parquet-common/src/main/java/org/apache/parquet/io/OutputFile.java`
#### Snippet
```java

  default String getPath() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `parquet-common/src/main/java/org/apache/parquet/util/DynMethods.java`
#### Snippet
```java
      @Override
      public <R> R invokeChecked(Object target, Object... args) throws Exception {
        return null;
      }

```

### ReturnNull
Return of `null`
in `parquet-common/src/main/java/org/apache/parquet/hadoop/metadata/CompressionCodecName.java`
#### Snippet
```java
    String codecClassName = getHadoopCompressionCodecClassName();
    if (codecClassName==null) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `parquet-common/src/main/java/org/apache/parquet/hadoop/metadata/CompressionCodecName.java`
#### Snippet
```java
      return Class.forName(codecClassName);
    } catch (ClassNotFoundException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java

          private String getTimeZone(LogicalTypeAnnotation.TimestampLogicalTypeAnnotation timestampLogicalType) {
            return timestampLogicalType.isAdjustedToUTC() ? "UTC" : null;
          }
        }).orElseThrow(() -> new IllegalArgumentException("illegal type " + type));
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `inputLength` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/AesGcmEncryptor.java`
#### Snippet
```java
    int lengthBufferLength = writeLength? SIZE_LENGTH : 0;
    byte[] cipherText = new byte[lengthBufferLength + cipherTextLength];
    int inputLength = plainTextLength;
    int inputOffset = 0;
    int outputOffset = lengthBufferLength + NONCE_LENGTH;
```

### UnnecessaryLocalVariable
Local variable `cipherTextOffset` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/AesGcmDecryptor.java`
#### Snippet
```java
  @Override
  public byte[] decrypt(byte[] lengthAndCiphertext, byte[] AAD)  {
    int cipherTextOffset = SIZE_LENGTH;
    int cipherTextLength = lengthAndCiphertext.length - SIZE_LENGTH;

```

### UnnecessaryLocalVariable
Local variable `cipherTextOffset` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/AesCtrDecryptor.java`
#### Snippet
```java
  @Override
  public byte[] decrypt(byte[] lengthAndCiphertext, byte[] AAD) {
    int cipherTextOffset = SIZE_LENGTH;
    int cipherTextLength = lengthAndCiphertext.length - SIZE_LENGTH;

```

### UnnecessaryLocalVariable
Local variable `kmsClient` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyToolkit.java`
#### Snippet
```java
        KMS_CLIENT_CACHE_PER_TOKEN.getOrCreateInternalCache(accessToken, cacheEntryLifetime);

    KmsClient kmsClient =
        kmsClientPerKmsInstanceCache.computeIfAbsent(kmsInstanceID,
            (k) -> createAndInitKmsClient(configuration, kmsInstanceID, kmsInstanceURL, accessToken));
```

### UnnecessaryLocalVariable
Local variable `writeSupportClass` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java
      return null;
    }
    final Class<?> writeSupportClass = ConfigurationUtil.getClassFromConfig(configuration, WRITE_SUPPORT_CLASS, WriteSupport.class);
    return writeSupportClass;
  }
```

### UnnecessaryLocalVariable
Local variable `newSchema` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
    List<String> currentPath = new ArrayList<>();
    List<Type> prunedFields = pruneColumnsInFields(fields, currentPath, prunePaths);
    MessageType newSchema = new MessageType(schema.getName(), prunedFields);
    return newSchema;
  }
```

### UnnecessaryLocalVariable
Local variable `avroReader` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java

      case AVRO:
        Iterable<D> avroReader = (Iterable<D>) DataFileReader.openReader(
            openSeekable(source), new GenericDatumReader<>(projection));
        return avroReader;
```

### UnnecessaryLocalVariable
Local variable `text` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java
          Preconditions.checkArgument(projection == null,
              "Cannot select columns from text files");
          Iterable text = CharStreams.readLines(new InputStreamReader(open(source)));
          return text;
        }
```

### UnnecessaryLocalVariable
Local variable `last` is redundant
in `parquet-column/src/main/java/org/apache/parquet/io/PrimitiveColumnIO.java`
#### Snippet
```java
    ColumnIO parent = getParent(r);

    PrimitiveColumnIO last = parent.getLast();
    return last;
  }
```

### UnnecessaryLocalVariable
Local variable `caseStartLevel` is redundant
in `parquet-column/src/main/java/org/apache/parquet/io/RecordReaderImplementation.java`
#### Snippet
```java
          caseLookup[currentLevel][d] = new Case[state.maxRepetitionLevel+1];
          for (int nextR = 0; nextR <= state.maxRepetitionLevel; ++ nextR) {
            int caseStartLevel = currentLevel;
            int caseDepth = Math.max(state.getDepth(d), caseStartLevel - 1);
            int caseNextLevel = Math.min(state.nextLevel[nextR], caseDepth + 1);
```

### UnnecessaryLocalVariable
Local variable `converter` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReadStoreImpl.java`
#### Snippet
```java
      currentConverter = currentConverter.asGroupConverter().getConverter(fieldIndex);
    }
    PrimitiveConverter converter = currentConverter.asPrimitiveConverter();
    return converter;
  }
```

### UnnecessaryLocalVariable
Local variable `index` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesReader.java`
#### Snippet
```java
    int valueUnpacked=i*config.miniBlockSizeInValues;
    for (int j = valuesBuffered-valueUnpacked; j < valuesBuffered; j++) {
      int index = j;
      valuesBuffer[index] += minDeltaInCurrentBlock + valuesBuffer[index - 1];
    }
```

### UnnecessaryLocalVariable
Local variable `thriftClass` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftMetaData.java`
#### Snippet
```java
  public static Class<?> getThriftClass(String thriftClassName) {
    try {
      Class<?> thriftClass = Class.forName(thriftClassName);
      return thriftClass;
    } catch (ClassNotFoundException e) {
```

### UnnecessaryLocalVariable
Local variable `matchingIndex` is redundant
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
        .forEachRemaining((int index) -> matchingIndexesGreaterThanMin.add(index));
      matchingIndexesLessThanMax.retainAll(matchingIndexesGreaterThanMin);
      IntSet matchingIndex = matchingIndexesLessThanMax;
      matchingIndex.addAll(matchingIndexesForNull);  // add the matching null pages
      return IndexIterator.filter(getPageCount(), pageIndex -> matchingIndex.contains(pageIndex));
```

### UnnecessaryLocalVariable
Local variable `field` is redundant
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/SummaryData.java`
#### Snippet
```java
        return null;
      }
      FieldSchema field = schema.getField(i);
      return field;
    } catch (FrontendException e) {
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java
    @Override
    public int hashCode() {
      int result = childById != null ? Arrays.hashCode(childById) : 0;
      return result;
    }
```

### UnnecessaryLocalVariable
Local variable `p` is redundant
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetStorer.java`
#### Snippet
```java
  private Properties getProperties() {
    UDFContext udfc = UDFContext.getUDFContext();
    Properties p =
        udfc.getUDFProperties(this.getClass(), new String[]{ signature });
    return p;
```

## RuleId[ruleID=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `parquet-common/src/main/java/org/apache/parquet/SemanticVersion.java`
#### Snippet
```java

  private static int compareIntegers(int x, int y) {
    return (x < y) ? -1 : ((x == y) ? 0 : 1);
  }

```

## RuleId[ruleID=PointlessBooleanExpression]
### PointlessBooleanExpression
`hasFieldsIgnored |= true` can be simplified to 'hasFieldsIgnored=true'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
      if ((expectedField = type.getChildById(field.id)) == null) {
        handleUnrecognizedField(field, type, in);
        hasFieldsIgnored |= true;
        continue;
      }
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.hash.HashCode' is marked unstable with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/Util.java`
#### Snippet
```java
    }

    final String asString = HashCode.fromBytes(bytes).toString();
    return "0x" + Ascii.truncate(asString, len - 2, "...");
  }
```

### UnstableApiUsage
'fromBytes(byte\[\])' is declared in unstable class 'com.google.common.hash.HashCode' marked with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/Util.java`
#### Snippet
```java
    }

    final String asString = HashCode.fromBytes(bytes).toString();
    return "0x" + Ascii.truncate(asString, len - 2, "...");
  }
```

### UnstableApiUsage
'toString()' is declared in unstable class 'com.google.common.hash.HashCode' marked with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/Util.java`
#### Snippet
```java
    }

    final String asString = HashCode.fromBytes(bytes).toString();
    return "0x" + Ascii.truncate(asString, len - 2, "...");
  }
```

### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java
    URI uri = qualifiedURI(filename);
    if (RESOURCE_URI_SCHEME.equals(uri.getScheme())) {
      return Resources.getResource(uri.getRawSchemeSpecificPart()).openStream();
    } else {
      Path filePath = new Path(uri);
```

### UnstableApiUsage
'getResource(java.lang.String)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java
    URI uri = qualifiedURI(filename);
    if (RESOURCE_URI_SCHEME.equals(uri.getScheme())) {
      return Resources.getResource(uri.getRawSchemeSpecificPart()).openStream();
    } else {
      Path filePath = new Path(uri);
```

### UnstableApiUsage
'com.google.common.io.CharStreams' is marked unstable with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java
          Preconditions.checkArgument(projection == null,
              "Cannot select columns from text files");
          Iterable text = CharStreams.readLines(new InputStreamReader(open(source)));
          return text;
        }
```

### UnstableApiUsage
'readLines(java.lang.Readable)' is declared in unstable class 'com.google.common.io.CharStreams' marked with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java
          Preconditions.checkArgument(projection == null,
              "Cannot select columns from text files");
          Iterable text = CharStreams.readLines(new InputStreamReader(open(source)));
          return text;
        }
```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ToAvroCommand.java`
#### Snippet
```java
    } finally {
      if (reader instanceof Closeable) {
        Closeables.close((Closeable) reader, threw);
      }
    }
```

### UnstableApiUsage
'close(java.io.@org.checkerframework.checker.nullness.qual.Nullable Closeable, boolean)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ToAvroCommand.java`
#### Snippet
```java
    } finally {
      if (reader instanceof Closeable) {
        Closeables.close((Closeable) reader, threw);
      }
    }
```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ScanCommand.java`
#### Snippet
```java
    } finally {
      if (reader instanceof Closeable) {
        Closeables.close((Closeable) reader, threw);
      }
    }
```

### UnstableApiUsage
'close(java.io.@org.checkerframework.checker.nullness.qual.Nullable Closeable, boolean)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ScanCommand.java`
#### Snippet
```java
    } finally {
      if (reader instanceof Closeable) {
        Closeables.close((Closeable) reader, threw);
      }
    }
```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
      return schema;
    } finally {
      Closeables.close(stream, threw);
    }
  }
```

### UnstableApiUsage
'close(java.io.@org.checkerframework.checker.nullness.qual.Nullable Closeable, boolean)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
      return schema;
    } finally {
      Closeables.close(stream, threw);
    }
  }
```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCommand.java`
#### Snippet
```java
    } finally {
      if (reader instanceof Closeable) {
        Closeables.close((Closeable) reader, threw);
      }
    }
```

### UnstableApiUsage
'close(java.io.@org.checkerframework.checker.nullness.qual.Nullable Closeable, boolean)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCommand.java`
#### Snippet
```java
    } finally {
      if (reader instanceof Closeable) {
        Closeables.close((Closeable) reader, threw);
      }
    }
```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CatCommand.java`
#### Snippet
```java
    } finally {
      if (reader instanceof Closeable) {
        Closeables.close((Closeable) reader, threw);
      }
    }
```

### UnstableApiUsage
'close(java.io.@org.checkerframework.checker.nullness.qual.Nullable Closeable, boolean)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CatCommand.java`
#### Snippet
```java
    } finally {
      if (reader instanceof Closeable) {
        Closeables.close((Closeable) reader, threw);
      }
    }
```

## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (primitive) { case BOOLEAN: case INT32: case INT64: case FLOAT: ...` statement on enum type 'org.apache.parquet.schema.PrimitiveType.PrimitiveTypeName' misses case 'INT96'
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
   */
  private static SortOrder defaultSortOrder(PrimitiveTypeName primitive) {
    switch (primitive) {
      case BOOLEAN:
      case INT32:
      case INT64:
      case FLOAT:
      case DOUBLE:
        return SortOrder.SIGNED;
      case BINARY:
      case FIXED_LEN_BYTE_ARRAY:
        return SortOrder.UNSIGNED;
    }
    return SortOrder.UNKNOWN;
  }
```

### EnumSwitchStatementWhichMissesCases
`switch (left.getType()) { case INT: if (right.getType() == Schema.Type.LONG) { ...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'RECORD', 'ENUM', 'ARRAY', 'MAP', 'UNION', ...
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java

    // handle primitive type promotion; doesn't promote integers to floats
    switch (left.getType()) {
      case INT:
        if (right.getType() == Schema.Type.LONG) {
          return right;
        }
        break;
      case LONG:
        if (right.getType() == Schema.Type.INT) {
          return left;
        }
        break;
      case FLOAT:
        if (right.getType() == Schema.Type.DOUBLE) {
          return right;
        }
        break;
      case DOUBLE:
        if (right.getType() == Schema.Type.FLOAT) {
          return left;
        }
    }

    // any other cases where the types don't match must be combined by a union
```

### EnumSwitchStatementWhichMissesCases
`switch (avroSchema.getType()) { case BOOLEAN: recordConsumer.addBoolean((Boolean) valu...` statement on enum type 'org.apache.avro.Schema.Type' misses case 'NULL'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroWriteSupport.java`
#### Snippet
```java
switch (avroSchema.getType()) {
      case BOOLEAN:
        recordConsumer.addBoolean((Boolean) value);
        break;
      case INT:
        if (value instanceof Character) {
          recordConsumer.addInteger((Character) value);
        } else {
          recordConsumer.addInteger(((Number) value).intValue());
        }
        break;
      case LONG:
        recordConsumer.addLong(((Number) value).longValue());
        break;
      case FLOAT:
        recordConsumer.addFloat(((Number) value).floatValue());
        break;
      case DOUBLE:
        recordConsumer.addDouble(((Number) value).doubleValue());
        break;
      case FIXED:
        recordConsumer.addBinary(Binary.fromReusedByteArray(((GenericFixed) value).bytes()));
        break;
      case BYTES:
        if (value instanceof byte[]) {
          recordConsumer.addBinary(Binary.fromReusedByteArray((byte[]) value));
        } else {
          recordConsumer.addBinary(Binary.fromReusedByteBuffer((ByteBuffer) value));
        }
        break;
      case STRING:
        if (type.asPrimitiveType().getLogicalTypeAnnotation() instanceof UUIDLogicalTypeAnnotation) {
          recordConsumer.addBinary(fromUUIDString(value));
        } else {
          recordConsumer.addBinary(fromAvroString(value));
        }
        break;
      case RECORD:
        writeRecord(type.asGroupType(), avroSchema, value);
        break;
      case ENUM:
        recordConsumer.addBinary(Binary.fromString(value.toString()));
        break;
      case ARRAY:
        listWriter.writeList(type.asGroupType(), avroSchema, value);
        break;
      case MAP:
        writeMap(type.asGroupType(), avroSchema, (Map<CharSequence, ?>) value);
        break;
      case UNION:
        writeUnion(type.asGroupType(), avroSchema, value);
        break;
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (schema.getType()) { case RECORD: return conversion.toRecord(fromClass.cast(datum), sc...` statement on enum type 'org.apache.avro.Schema.Type' misses cases: 'UNION', and 'NULL'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroWriteSupport.java`
#### Snippet
```java
    }
    Class<D> fromClass = conversion.getConvertedType();
    switch (schema.getType()) {
      case RECORD:  return conversion.toRecord(fromClass.cast(datum), schema, logicalType);
      case ENUM:    return conversion.toEnumSymbol(fromClass.cast(datum), schema, logicalType);
      case ARRAY:   return conversion.toArray(fromClass.cast(datum), schema, logicalType);
      case MAP:     return conversion.toMap(fromClass.cast(datum), schema, logicalType);
      case FIXED:   return conversion.toFixed(fromClass.cast(datum), schema, logicalType);
      case STRING:  return conversion.toCharSequence(fromClass.cast(datum), schema, logicalType);
      case BYTES:   return conversion.toBytes(fromClass.cast(datum), schema, logicalType);
      case INT:     return conversion.toInt(fromClass.cast(datum), schema, logicalType);
      case LONG:    return conversion.toLong(fromClass.cast(datum), schema, logicalType);
      case FLOAT:   return conversion.toFloat(fromClass.cast(datum), schema, logicalType);
      case DOUBLE:  return conversion.toDouble(fromClass.cast(datum), schema, logicalType);
      case BOOLEAN: return conversion.toBoolean(fromClass.cast(datum), schema, logicalType);
    }
    return datum;
  }
```

### EnumSwitchStatementWhichMissesCases
`switch (unit) { case MILLIS: return of(LogicalTypes.timestampMillis()); ...` statement on enum type 'org.apache.parquet.schema.LogicalTypeAnnotation.TimeUnit' misses case 'NANOS'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
      public Optional<LogicalType> visit(LogicalTypeAnnotation.TimestampLogicalTypeAnnotation timestampLogicalType) {
        LogicalTypeAnnotation.TimeUnit unit = timestampLogicalType.getUnit();
        switch (unit) {
          case MILLIS:
            return of(LogicalTypes.timestampMillis());
          case MICROS:
            return of(LogicalTypes.timestampMicros());
        }
        return empty();
      }
```

### EnumSwitchStatementWhichMissesCases
`switch (unit) { case MILLIS: return of(LogicalTypes.timeMillis()); c...` statement on enum type 'org.apache.parquet.schema.LogicalTypeAnnotation.TimeUnit' misses case 'NANOS'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
      public Optional<LogicalType> visit(LogicalTypeAnnotation.TimeLogicalTypeAnnotation timeLogicalType) {
        LogicalTypeAnnotation.TimeUnit unit = timeLogicalType.getUnit();
        switch (unit) {
          case MILLIS:
            return of(LogicalTypes.timeMillis());
          case MICROS:
            return of(LogicalTypes.timeMicros());
        }
        return empty();
      }
```

### EnumSwitchStatementWhichMissesCases
`switch (op) { case OP_EQ: return eq(col, value); case OP_NE: return notEq(col, value); ...` statement on enum type 'org.apache.pig.Expression.OpType' misses cases: 'OP_PLUS', 'OP_MINUS', 'OP_TIMES', 'OP_DIV', ...
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
  FilterPredicate op(Expression.OpType op, COL col, Const valueExpr) {
    C value = getValue(valueExpr, col.getColumnType());
    switch (op) {
      case OP_EQ: return eq(col, value);
      case OP_NE: return notEq(col, value);
      case OP_GT: return gt(col, value);
      case OP_GE: return gtEq(col, value);
      case OP_LT: return lt(col, value);
      case OP_LE: return ltEq(col, value);
    }
    return null;
  }
```

### EnumSwitchStatementWhichMissesCases
`switch (op) { case OP_AND: return and(buildFilter(lhs), buildFilter(rhs)); ...` statement on enum type 'org.apache.pig.Expression.OpType' misses cases: 'OP_PLUS', 'OP_MINUS', 'OP_TIMES', 'OP_DIV', ...
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
      Expression rhs = ((BinaryExpression) e).getRhs();

      switch (op) {
        case OP_AND:
          return and(buildFilter(lhs), buildFilter(rhs));
        case OP_OR:
          return or(buildFilter(lhs), buildFilter(rhs));
        case OP_BETWEEN:
          BetweenExpression between = (BetweenExpression) rhs;
          return and(
              buildFilter(OpType.OP_GE, (Column) lhs, (Const) between.getLower()),
              buildFilter(OpType.OP_LE, (Column) lhs, (Const) between.getUpper()));
        case OP_IN:
          FilterPredicate current = null;
          for (Object value : ((InExpression) rhs).getValues()) {
            FilterPredicate next = buildFilter(OpType.OP_EQ, (Column) lhs, (Const) value);
            if (current != null) {
              current = or(current, next);
            } else {
              current = next;
            }
          }
          return current;
      }

      if (lhs instanceof Column && rhs instanceof Const) {
```

### EnumSwitchStatementWhichMissesCases
`switch (primitiveType.getPrimitiveTypeName()) { case INT32: currentTuple.s...` statement on enum type 'org.apache.parquet.schema.PrimitiveType.PrimitiveTypeName' misses cases: 'BINARY', 'INT96', and 'FIXED_LEN_BYTE_ARRAY'
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java
          if (field.isPrimitive() && field.isRepetition(Repetition.OPTIONAL)) {
            PrimitiveType primitiveType = field.asPrimitiveType();
            switch (primitiveType.getPrimitiveTypeName()) {
            case INT32:
              currentTuple.set(i, I32_ZERO);
              break;
            case INT64:
              currentTuple.set(i, I64_ZERO);
              break;
            case FLOAT:
              currentTuple.set(i, FLOAT_ZERO);
              break;
            case DOUBLE:
              currentTuple.set(i, DOUBLE_ZERO);
              break;
            case BOOLEAN:
              currentTuple.set(i, I32_ZERO);
              break;
            }
          }
          ++ i;
```

## RuleId[ruleID=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/CSVProperties.java`
#### Snippet
```java
    private static String unescapeJava(String str) {
      // StringEscapeUtils removes the single escape character
      if (str == "\\") {
        return str;
      }
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `newInstance()` declared in class 'org.apache.avro.specific.SpecificData' but referenced via subclass 'org.apache.avro.reflect.ReflectData'
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/RecordBuilder.java`
#### Snippet
```java
  private E newRecordInstance() {
    if (recordClass != GenericData.Record.class && !recordClass.isInterface()) {
      E record = (E) ReflectData.newInstance(recordClass, schema);
      if (record != null) {
        return record;
```

### StaticCallOnSubclass
Static method `newInstance()` declared in class 'org.apache.avro.specific.SpecificData' but referenced via subclass 'org.apache.avro.reflect.ReflectData'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java
        return new HashMap<K, V>();
      } else {
        return (Map<K, V>) ReflectData.newInstance(mapClass, schema);
      }
    }
```

### StaticCallOnSubclass
Static method `newInstance()` declared in class 'org.apache.avro.specific.SpecificData' but referenced via subclass 'org.apache.avro.reflect.ReflectData'
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java
        // not need to use the data model to instantiate because it resolved
        // the class, which used the correct ClassLoader
        return (Collection<Object>) ReflectData.newInstance(containerClass, avroSchema);
      }
    }
```

## RuleId[ruleID=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
        // if the parent is a BaseGroupBuilder, add type to it
        if (BaseGroupBuilder.class.isAssignableFrom(parent.getClass())) {
          BaseGroupBuilder.class.cast(parent).addField(type);
        }
        return parent;
```

## RuleId[ruleID=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `10l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
  //    Country: 'gb'
  static {
    r1.add("DocId", 10l);
    r1.addGroup("Links")
      .append("Forward", 20l)
```

### LongLiteralsEndingWithLowercaseL
'long' literal `20l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
    r1.add("DocId", 10l);
    r1.addGroup("Links")
      .append("Forward", 20l)
      .append("Forward", 40l)
      .append("Forward", 60l);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `40l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
    r1.addGroup("Links")
      .append("Forward", 20l)
      .append("Forward", 40l)
      .append("Forward", 60l);
    Group name = r1.addGroup("Name");
```

### LongLiteralsEndingWithLowercaseL
'long' literal `60l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
      .append("Forward", 20l)
      .append("Forward", 40l)
      .append("Forward", 60l);
    Group name = r1.addGroup("Name");
    {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `20l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
  // Url: 'http://C'
  static {
    r2.add("DocId", 20l);
    r2.addGroup("Links")
      .append("Backward", 10l)
```

### LongLiteralsEndingWithLowercaseL
'long' literal `10l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
    r2.add("DocId", 20l);
    r2.addGroup("Links")
      .append("Backward", 10l)
      .append("Backward", 30l)
      .append("Forward", 80l);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `30l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
    r2.addGroup("Links")
      .append("Backward", 10l)
      .append("Backward", 30l)
      .append("Forward", 80l);
    r2.addGroup("Name")
```

### LongLiteralsEndingWithLowercaseL
'long' literal `80l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
      .append("Backward", 10l)
      .append("Backward", 30l)
      .append("Forward", 80l);
    r2.addGroup("Name")
      .append("Url", "http://C");
```

### LongLiteralsEndingWithLowercaseL
'long' literal `10l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
  //    Country: 'gb'
  static {
    pr1.add("DocId", 10l);
    Group name = pr1.addGroup("Name");
    {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `20l` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
  //Name
  static {
    pr2.add("DocId", 20l);
    pr2.addGroup("Name");
  }
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x00000000FFFFFFFFl` ends with lowercase 'l'
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java

  static final PrimitiveStringifier UNSIGNED_STRINGIFIER = new PrimitiveStringifier("UNSIGNED_STRINGIFIER") {
    private static final long INT_MASK = 0x00000000FFFFFFFFl;

    // Implemented based on com.google.common.primitives.UnsignedInts.toString(int, int)
```

### LongLiteralsEndingWithLowercaseL
'long' literal `64l` ends with lowercase 'l'
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/DataGenerator.java`
#### Snippet
```java
          .append("binary_field", randomUUID().toString())
          .append("int32_field", i)
          .append("int64_field", 64l)
          .append("boolean_field", true)
          .append("float_field", 1.0f)
```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `parquet-cli/src/main/java/org/apache/parquet/cli/Help.java`
#### Snippet
```java
        if (commander.getParameters().stream().anyMatch(p -> p.getNames().isEmpty())) {
          console.info("\nUsage: {} [general options] {} {} [command options]",
            new Object[] { programName, cmd, commander.getMainParameterDescription() });
        } else {
          console.info("\nUsage: {} [general options] {} [command options]",
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `parquet-cli/src/main/java/org/apache/parquet/cli/Help.java`
#### Snippet
```java
        } else {
          console.info("\nUsage: {} [general options] {} [command options]",
            new Object[] { programName, cmd });
        }
        console.info("\n  Description:");
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `parquet-cli/src/main/java/org/apache/parquet/cli/Help.java`
#### Snippet
```java
            } else {
              console.info("    {} {} {}",
                  new Object[] {programName, cmd, example});
            }
          }
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `parquet-cli/src/main/java/org/apache/parquet/cli/Help.java`
#### Snippet
```java
    boolean required = param.getParameter().required();
    if (!param.getParameter().hidden()) {
      console.info("  {} {}\n\t{}{}", new Object[]{
          required ? "*" : " ",
          param.getNames().trim(),
          param.getDescription(),
          formatDefault(param)});
    }
    return required;
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroIndexedRecordConverter.java`
#### Snippet
```java
        try {
          this.fixedClassCtor = 
              fixedClass.getConstructor(new Class[] { byte[].class });
        } catch (Exception e) {
          throw new RuntimeException(e);
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftBytesWriteSupport.java`
#### Snippet
```java
    if (SET_READ_LENGTH != null && protocol instanceof TBinaryProtocol) {
      try {
        SET_READ_LENGTH.invoke(protocol, new Object[]{record.getLength()});
      } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        LOG.warn("setReadLength should not throw an exception", e);
```

## RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ParquetMetadataCommand.java`
#### Snippet
```java
      new TextStringBuilder(80).appendPadding(80, '-')));

    int size = maxSize(Iterables.transform(rowGroup.getColumns(),
        new Function<ColumnChunkMetaData, String>() {
          @Override
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CheckParquet251Command.java`
#### Snippet
```java
      // get just the binary columns
      List<ColumnDescriptor> columns = Lists.newArrayList();
      Iterables.addAll(columns, Iterables.filter(
          meta.getSchema().getColumns(),
          new Predicate<ColumnDescriptor>() {
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/Statistics.java`
#### Snippet
```java
        return new BinaryStatistics();
      case INT96:
        return new BinaryStatistics();
      case FIXED_LEN_BYTE_ARRAY:
        return new BinaryStatistics();
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/Statistics.java`
#### Snippet
```java
        return new BinaryStatistics();
      case FIXED_LEN_BYTE_ARRAY:
        return new BinaryStatistics();
      default:
        throw new UnknownColumnTypeException(type);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ProtocolReadToWrite.java`
#### Snippet
```java
      break;
    case TType.VOID:
      break;
    default:
      throw new TException("Unknown type: " + type);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftSchemaConvertVisitor.java`
#### Snippet
```java
        return OPTIONAL;
      case DEFAULT:
        return OPTIONAL;
      default:
        throw new IllegalArgumentException("unknown requirement type: " + thriftField.getRequirement());
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
      break;
    case TType.VOID:
      break;
    default:
      throw new TException("Unknown type: " + type);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java
              break;
            case BOOLEAN:
              currentTuple.set(i, I32_ZERO);
              break;
            }
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java
            return primitive(FLOAT);
          case SINGLE:
            return primitive(FLOAT);
          case DOUBLE:
            return primitive(DOUBLE);
```

## RuleId[ruleID=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `valueStartBitIndex < 0 ? bitWidth - 1 + valueStartBitIndex : bitWidth - 1`
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java

    if (msbFirst) {
      valueStartBitWanted = valueStartBitIndex < 0 ? bitWidth - 1 + valueStartBitIndex : bitWidth - 1;
      valueEndBitWanted = valueEndBitIndex > 0 ? valueEndBitIndex : 0;
      byteStartBitWanted = valueStartBitIndex < 0 ? 8 : 7 - valueStartBitIndex;
```

### DuplicateExpressions
Multiple occurrences of `valueStartBitIndex < 0 ? bitWidth - 1 + valueStartBitIndex : bitWidth - 1`
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
    } else {
      valueStartBitWanted = bitWidth - 1 - (valueEndBitIndex > 0 ? valueEndBitIndex : 0);
      valueEndBitWanted = bitWidth - 1 - (valueStartBitIndex < 0 ? bitWidth - 1 + valueStartBitIndex : bitWidth - 1);
      byteStartBitWanted = 7 - (valueEndBitIndex > 0 ? 0 : -valueEndBitIndex);
      byteEndBitWanted = 7 - (valueStartBitIndex < 0 ? 8 : 7 - valueStartBitIndex);
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriterBase.java`
#### Snippet
```java
   */
  String memUsageString(String indent) {
    StringBuilder b = new StringBuilder(indent).append(path).append(" {\n");
    b.append(indent).append(" r:").append(repetitionLevelColumn.getAllocatedSize()).append(" bytes\n");
    b.append(indent).append(" d:").append(definitionLevelColumn.getAllocatedSize()).append(" bytes\n");
```

### StringBufferReplaceableByString
`StringBuilder message` can be replaced with 'String'
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/ValidTypeMap.java`
#### Snippet
```java

    if (!validTypeDescriptors.contains(primitiveType)) {
      StringBuilder message = new StringBuilder();
      message
          .append("FilterPredicate column: ")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
    @Override
    protected String typeParametersAsString() {
      StringBuilder sb = new StringBuilder();
      sb.append("(");
      sb.append(bitWidth);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
    @Override
    protected String typeParametersAsString() {
      StringBuilder sb = new StringBuilder();
      sb.append("(");
      sb.append(unit);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
    @Override
    protected String typeParametersAsString() {
      StringBuilder sb = new StringBuilder();
      sb.append("(");
      sb.append(precision);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
    @Override
    protected String typeParametersAsString() {
      StringBuilder sb = new StringBuilder();
      sb.append("(");
      sb.append(unit);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getType());
    sb.append(typeParametersAsString());
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasFieldIgnored |= readOneValue(in, elemType, buffer, expectedType)`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    boolean hasFieldIgnored = false;
    for (int i = 0; i < size; i++) {
      hasFieldIgnored |= readOneValue(in, elemType, buffer, expectedType);
    }
    return hasFieldIgnored;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasFieldIgnored |= readOneValue(in, map.keyType, buffer, mapType.getKey().getType())`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    boolean hasFieldIgnored = false;
    for (int i = 0; i < map.size; i++) {
      hasFieldIgnored |= readOneValue(in, map.keyType, buffer, mapType.getKey().getType());
      hasFieldIgnored |= readOneValue(in, map.valueType, buffer, mapType.getValue().getType());
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasFieldIgnored |= readOneValue(in, map.valueType, buffer, mapType.getValue().getType())`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    for (int i = 0; i < map.size; i++) {
      hasFieldIgnored |= readOneValue(in, map.keyType, buffer, mapType.getKey().getType());
      hasFieldIgnored |= readOneValue(in, map.valueType, buffer, mapType.getValue().getType());
    }
    in.readMapEnd();
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasFieldsIgnored |= true`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
      if ((expectedField = type.getChildById(field.id)) == null) {
        handleUnrecognizedField(field, type, in);
        hasFieldsIgnored |= true;
        continue;
      }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasFieldsIgnored |= readOneValue(in, field.type, buffer, expectedField.getType())`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
        }
      });
      hasFieldsIgnored |= readOneValue(in, field.type, buffer, expectedField.getType());
      in.readFieldEnd();
      buffer.add(FIELD_END);
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ColumnChunkMetaData.java`
#### Snippet
```java

  protected void decryptIfNeeded() {
    return;
  }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `parquet-common/src/main/java/org/apache/parquet/bytes/HeapByteBufferAllocator.java`
#### Snippet
```java

  public void release(ByteBuffer b) {
    return;
  }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `parquet-common/src/main/java/org/apache/parquet/bytes/DirectByteBufferAllocator.java`
#### Snippet
```java
  public void release(ByteBuffer b) {
    // The ByteBuffer.allocateDirect
    return;
  }

```

## RuleId[ruleID=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnDescriptor.java`
#### Snippet
```java
  @Override
  public int compareTo(ColumnDescriptor o) {
    int length = path.length < o.path.length ? path.length : o.path.length;
    for (int i = 0; i < length; i++) {
      int compareTo = path[i].compareTo(o.path[i]);
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `parquet-column/src/main/java/org/apache/parquet/column/values/deltastrings/DeltaByteArrayWriter.java`
#### Snippet
```java
    int i = 0;
    byte[] vb = v.getBytes();
    int length = previous.length < vb.length ? previous.length : vb.length;
    // find the number of matching prefix bytes between this value and the previous one
    for(i = 0; (i < length) && (previous[i] == vb[i]); i++);
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `parquet-common/src/main/java/org/apache/parquet/bytes/CapacityByteArrayOutputStream.java`
#### Snippet
```java
    if (bytesUsed == 0) {
      nextSlabSize = initialSlabSize;
    } else if (bytesUsed > maxCapacityHint / 5) {
      // to avoid an overhead of up to twice the needed size, we get linear when approaching target page size
      nextSlabSize = maxCapacityHint / 5;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
    if (msbFirst) {
      valueStartBitWanted = valueStartBitIndex < 0 ? bitWidth - 1 + valueStartBitIndex : bitWidth - 1;
      valueEndBitWanted = valueEndBitIndex > 0 ? valueEndBitIndex : 0;
      byteStartBitWanted = valueStartBitIndex < 0 ? 8 : 7 - valueStartBitIndex;
      byteEndBitWanted = valueEndBitIndex > 0 ? 0 : -valueEndBitIndex;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
      widthWanted = Math.min(7, byteStartBitWanted) - Math.min(7, byteEndBitWanted) + 1;
    } else {
      valueStartBitWanted = bitWidth - 1 - (valueEndBitIndex > 0 ? valueEndBitIndex : 0);
      valueEndBitWanted = bitWidth - 1 - (valueStartBitIndex < 0 ? bitWidth - 1 + valueStartBitIndex : bitWidth - 1);
      byteStartBitWanted = 7 - (valueEndBitIndex > 0 ? 0 : -valueEndBitIndex);
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `BaseRecordReader` has no concrete subclass
in `parquet-column/src/main/java/org/apache/parquet/io/BaseRecordReader.java`
#### Snippet
```java
 */
@Deprecated
public abstract class BaseRecordReader<T> extends RecordReader<T> {
  private static final Logger LOG = LoggerFactory.getLogger(BaseRecordReader.class);

```

### AbstractClassNeverImplemented
Abstract class `ConversionPatterns` has no concrete subclass
in `parquet-column/src/main/java/org/apache/parquet/schema/ConversionPatterns.java`
#### Snippet
```java
 * to equivalent Parquet types.
 */
public abstract class ConversionPatterns {

  static final String MAP_REPEATED_NAME = "key_value";
```

### AbstractClassNeverImplemented
Abstract class `IncrementallyUpdatedFilterPredicateBuilderBase` has no concrete subclass
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicateBuilderBase.java`
#### Snippet
```java
 * TODO: UserDefinedPredicates still autobox however
 */
public abstract class IncrementallyUpdatedFilterPredicateBuilderBase implements Visitor<IncrementallyUpdatedFilterPredicate> {
  private boolean built = false;
  private final Map<ColumnPath, List<ValueInspector>> valueInspectorsByColumn = new HashMap<>();
```

### AbstractClassNeverImplemented
Abstract class `ComplexTypeVisitor` has no concrete subclass
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java
   */
  @Deprecated
  public static abstract class ComplexTypeVisitor implements TypeVisitor {

    @Override
```

### AbstractClassNeverImplemented
Abstract class `ByteConsumer` has no concrete subclass
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class ByteConsumer extends TypedConsumer {
    protected ByteConsumer() { super(BYTE); }
    @Override
```

### AbstractClassNeverImplemented
Abstract class `DoubleConsumer` has no concrete subclass
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
abstract public class TypedConsumer {

  abstract public static class DoubleConsumer extends TypedConsumer {
    protected DoubleConsumer() { super(DOUBLE); }
    @Override
```

### AbstractClassNeverImplemented
Abstract class `SetConsumer` has no concrete subclass
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class SetConsumer extends TypedConsumer {
    protected SetConsumer() { super(SET); }
    @Override
```

### AbstractClassNeverImplemented
Abstract class `I16Consumer` has no concrete subclass
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class I16Consumer extends TypedConsumer {
    protected I16Consumer() { super(I16); }
    @Override
```

### AbstractClassNeverImplemented
Abstract class `BoolConsumer` has no concrete subclass
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class BoolConsumer extends TypedConsumer {
    protected BoolConsumer() { super(BOOL); }
    @Override
```

### AbstractClassNeverImplemented
Abstract class `MapConsumer` has no concrete subclass
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class MapConsumer extends TypedConsumer {
    protected MapConsumer() { super(MAP); }
    @Override
```

### AbstractClassNeverImplemented
Abstract class `DelegatingPositionOutputStream` has no concrete subclass
in `parquet-common/src/main/java/org/apache/parquet/io/DelegatingPositionOutputStream.java`
#### Snippet
```java
import java.io.OutputStream;

public abstract class DelegatingPositionOutputStream extends PositionOutputStream {
  private final OutputStream stream;

```

### AbstractClassNeverImplemented
Abstract class `BytePackerForLong` has no concrete subclass
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BytePackerForLong.java`
#### Snippet
```java
 * time.
 */
public abstract class BytePackerForLong {

  private final int bitWidth;
```

### AbstractClassNeverImplemented
Abstract class `IntPacker` has no concrete subclass
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/IntPacker.java`
#### Snippet
```java
 *  - bitWidth ints at a time.
 */
public abstract class IntPacker {

  private final int bitWidth;
```

### AbstractClassNeverImplemented
Abstract class `BytePacker` has no concrete subclass
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BytePacker.java`
#### Snippet
```java
 *  - bitWidth * (n/8) bytes at a time.
 */
public abstract class BytePacker {

  private final int bitWidth;
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ColumnDecryptionProperties`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/FileDecryptionProperties.java`
#### Snippet
```java
  private FileDecryptionProperties(byte[] footerKey, DecryptionKeyRetriever keyRetriever,
      boolean checkPlaintextFooterIntegrity,  byte[] aadPrefix, AADPrefixVerifier aadPrefixVerifier,
      Map<ColumnPath, ColumnDecryptionProperties> columnPropertyMap, boolean allowPlaintextFiles) {

    if ((null == footerKey) && (null == keyRetriever) && (null == columnPropertyMap)) {
```

### BoundedWildcard
Can generalize to `? extends ColumnDecryptionProperties`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/FileDecryptionProperties.java`
#### Snippet
```java
     * @return Builder
     */
    public Builder withColumnKeys(Map<ColumnPath, ColumnDecryptionProperties> columnProperties) {
      if (null == columnProperties) {
        return this;
```

### BoundedWildcard
Can generalize to `? extends ColumnEncryptionProperties`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/FileEncryptionProperties.java`
#### Snippet
```java
     * @return Builder
     */
    public Builder withEncryptedColumns(Map<ColumnPath, ColumnEncryptionProperties> encryptedColumns)  {
      if (null == encryptedColumns) {
        return this;
```

### BoundedWildcard
Can generalize to `? super String`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnConfigParser.java`
#### Snippet
```java
    private final BiConsumer<String, T> consumer;

    public ConfigHelper(String prefix, Function<String, T> function, BiConsumer<String, T> consumer) {
      this.prefix = prefix;
      this.function = function;
```

### BoundedWildcard
Can generalize to `? extends T`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnConfigParser.java`
#### Snippet
```java
    private final BiConsumer<String, T> consumer;

    public ConfigHelper(String prefix, Function<String, T> function, BiConsumer<String, T> consumer) {
      this.prefix = prefix;
      this.function = function;
```

### BoundedWildcard
Can generalize to `? super String`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnConfigParser.java`
#### Snippet
```java
    private final BiConsumer<String, T> consumer;

    public ConfigHelper(String prefix, Function<String, T> function, BiConsumer<String, T> consumer) {
      this.prefix = prefix;
      this.function = function;
```

### BoundedWildcard
Can generalize to `? super T`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnConfigParser.java`
#### Snippet
```java
    private final BiConsumer<String, T> consumer;

    public ConfigHelper(String prefix, Function<String, T> function, BiConsumer<String, T> consumer) {
      this.prefix = prefix;
      this.function = function;
```

### BoundedWildcard
Can generalize to `? extends GenericObjectPool`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/DirectCodecFactory.java`
#### Snippet
```java
    }

    private void returnToPool(Object obj, Map<Class<?>, GenericObjectPool> pools) {
      try {
        GenericObjectPool pool = pools.get(obj.getClass());
```

### BoundedWildcard
Can generalize to `? extends Encoding`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    int blocks = 0;

    public void add(long valueCount, long size, long uncSize, Collection<Encoding> encodings, Statistics colValuesStats) {
      ++blocks;
      valueCountStats.add(valueCount);
```

### BoundedWildcard
Can generalize to `? super FileStatus`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
  }

  private static void staticAddInputPathRecursively(List<FileStatus> result,
      FileSystem fs, Path path, PathFilter inputFilter)
          throws IOException {
```

### BoundedWildcard
Can generalize to `? extends Footer`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ClientSideMetadataSplitStrategy.class);

  List<ParquetInputSplit> getSplits(Configuration configuration, List<Footer> footers,
      long maxSplitSize, long minSplitSize, ReadContext readContext)
      throws IOException {
```

### BoundedWildcard
Can generalize to `? extends BlockMetaData`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
  }

  private static void checkSorted(List<BlockMetaData> rowGroupBlocks) {
    long previousOffset = 0L;
    for(BlockMetaData rowGroup: rowGroupBlocks) {
```

### BoundedWildcard
Can generalize to `? extends FileStatus`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java

  private static List<FileStatus> getAllFileRecursively(
      List<FileStatus> files, Configuration conf) throws IOException {
    List<FileStatus> result = new ArrayList<FileStatus>();
    for (FileStatus file : files) {
```

### BoundedWildcard
Can generalize to `? super ContractViolation`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnIndexValidator.java`
#### Snippet
```java
        ColumnPath columnPath,
        int pageNumber,
        List<ContractViolation> violations,
        ColumnReader columnReader,
        ByteBuffer minValue,
```

### BoundedWildcard
Can generalize to `? super T`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/api/DelegatingWriteSupport.java`
#### Snippet
```java
  private final WriteSupport<T> delegate;

  public DelegatingWriteSupport(WriteSupport<T> delegate) {
    super();
    this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends Path`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java

  // Open all input files to validate their schemas are compatible to merge
  private void openInputFiles(List<Path> inputFiles, Configuration conf) {
    Preconditions.checkArgument(inputFiles != null && !inputFiles.isEmpty(), "No input files");

```

### BoundedWildcard
Can generalize to `? extends Type`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  }

  private List<Type> pruneColumnsInFields(List<Type> fields, List<String> currentPath, Set<ColumnPath> prunePaths) {
    List<Type> prunedFields = new ArrayList<>();
    for (Type childField : fields) {
```

### BoundedWildcard
Can generalize to `? super String`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java

  // We have to rewrite getPaths because MessageType only get level 0 paths
  private void getPaths(GroupType schema, List<String> paths, String parent) {
    List<Type> fields = schema.getFields();
    String prefix = (parent == null) ? "" : parent + ".";
```

### BoundedWildcard
Can generalize to `? extends FileStatus`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static List<Footer> readAllFootersInParallel(final Configuration configuration, List<FileStatus> partFiles, final boolean skipRowGroups) throws IOException {
    List<Callable<Footer>> footers = new ArrayList<Callable<Footer>>();
    for (final FileStatus currentFile : partFiles) {
```

### BoundedWildcard
Can generalize to `? extends FileStatus`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  public static List<Footer> readAllFootersInParallelUsingSummaryFiles(
      final Configuration configuration,
      final Collection<FileStatus> partFiles,
      final boolean skipRowGroups) throws IOException {

```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
    }

    void add(ChunkDescriptor descriptor, List<ByteBuffer> buffers, SeekableInputStream f) {
       map.computeIfAbsent(descriptor, d -> new ChunkData()).buffers.addAll(buffers);
      lastDescriptor = descriptor;
```

### BoundedWildcard
Can generalize to `? extends Callable`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  }

  private static <T> List<T> runAllInParallel(int parallelism, List<Callable<T>> toRun) throws ExecutionException {
    LOG.info("Initiating action with parallelism: {}", parallelism);
    ExecutorService threadPool = Executors.newFixedThreadPool(parallelism);
```

### BoundedWildcard
Can generalize to `? extends ColumnChunkMetaData`
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/bloomfilterlevel/BloomFilterImpl.java`
#### Snippet
```java
  }

  private BloomFilterImpl(List<ColumnChunkMetaData> columnsList, BloomFilterReader bloomFilterReader) {
    for (ColumnChunkMetaData chunk : columnsList) {
      columns.put(chunk.getPath(), chunk);
```

### BoundedWildcard
Can generalize to `? extends ColumnChunkMetaData`
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/statisticslevel/StatisticsFilter.java`
#### Snippet
```java
  private final Map<ColumnPath, ColumnChunkMetaData> columns = new HashMap<ColumnPath, ColumnChunkMetaData>();

  private StatisticsFilter(List<ColumnChunkMetaData> columnsList) {
    for (ColumnChunkMetaData chunk : columnsList) {
      columns.put(chunk.getPath(), chunk);
```

### BoundedWildcard
Can generalize to `? extends BlockMetaData`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputSplit.java`
#### Snippet
```java
  }

  private static long end(List<BlockMetaData> blocks, String requestedSchema) {
    MessageType requested = MessageTypeParser.parseMessageType(requestedSchema);
    long length = 0;
```

### BoundedWildcard
Can generalize to `? extends BlockMetaData`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputSplit.java`
#### Snippet
```java
  }

  private static long[] offsets(List<BlockMetaData> blocks) {
    long[] offsets = new long[blocks.size()];
    for (int i = 0; i < offsets.length; i++) {
```

### BoundedWildcard
Can generalize to `? extends Footer`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
  }

  static GlobalMetaData getGlobalMetaData(List<Footer> footers, boolean strict) {
    GlobalMetaData fileMetaData = null;
    for (Footer footer : footers) {
```

### BoundedWildcard
Can generalize to `? extends Encoding`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
      OffsetIndexBuilder offsetIndexBuilder,
      BloomFilter bloomFilter,
      Set<Encoding> rlEncodings,
      Set<Encoding> dlEncodings,
      List<Encoding> dataEncodings,
```

### BoundedWildcard
Can generalize to `? extends Encoding`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
      BloomFilter bloomFilter,
      Set<Encoding> rlEncodings,
      Set<Encoding> dlEncodings,
      List<Encoding> dataEncodings,
      BlockCipher.Encryptor headerBlockEncryptor,
```

### BoundedWildcard
Can generalize to `? extends Footer`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
   * @return the global meta data for all the footers
   */
  static ParquetMetadata mergeFooters(Path root, List<Footer> footers, KeyValueMetadataMergeStrategy keyValueMergeStrategy) {
    String rootPath = root.toUri().getPath();
    GlobalMetaData fileMetaData = null;
```

### BoundedWildcard
Can generalize to `? extends BlockMetaData`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java

  public void appendRowGroups(SeekableInputStream file,
                              List<BlockMetaData> rowGroups,
                              boolean dropColumns) throws IOException {
    for (BlockMetaData block : rowGroups) {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java

  private static void serializeBloomFilters(
    List<Map<String, BloomFilter>> bloomFilters,
    List<BlockMetaData> blocks,
    PositionOutputStream out,
```

### BoundedWildcard
Can generalize to `? extends BlockMetaData`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
  private static void serializeBloomFilters(
    List<Map<String, BloomFilter>> bloomFilters,
    List<BlockMetaData> blocks,
    PositionOutputStream out,
    InternalFileEncryptor fileEncryptor) throws IOException {
```

### BoundedWildcard
Can generalize to `? extends Path`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
   */
  @Deprecated
  public static ParquetMetadata mergeMetadataFiles(List<Path> files, Configuration conf,
                                                   KeyValueMetadataMergeStrategy keyValueMetadataMergeStrategy) throws IOException {
    Preconditions.checkArgument(!files.isEmpty(), "Cannot merge an empty list of metadata");
```

### BoundedWildcard
Can generalize to `? extends List`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java

  private static void serializeOffsetIndexes(
      List<List<OffsetIndex>> offsetIndexes,
      List<BlockMetaData> blocks,
      PositionOutputStream out,
```

### BoundedWildcard
Can generalize to `? extends BlockMetaData`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
  private static void serializeOffsetIndexes(
      List<List<OffsetIndex>> offsetIndexes,
      List<BlockMetaData> blocks,
      PositionOutputStream out,
      InternalFileEncryptor fileEncryptor) throws IOException {
```

### BoundedWildcard
Can generalize to `? extends Schema.Field`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
  }

  private static Set<String> names(Collection<Schema.Field> fields) {
    Set<String> names = Sets.newHashSet();
    for (Schema.Field field : fields) {
```

### BoundedWildcard
Can generalize to `? extends ColumnDescriptor`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CheckParquet251Command.java`
#### Snippet
```java

  public class PageStatsValidator {
    public void validate(List<ColumnDescriptor> columns, PageReadStore store) {
      for (ColumnDescriptor desc : columns) {
        PageReader reader = store.getPageReader(desc);
```

### BoundedWildcard
Can generalize to `? extends Schema`
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java
  }

  private static Schema resolveUnion(JsonNode datum, Collection<Schema> schemas) {
    Set<Schema.Type> primitives = Sets.newHashSet();
    List<Schema> others = Lists.newArrayList();
```

### BoundedWildcard
Can generalize to `? extends T`
in `parquet-column/src/main/java/org/apache/parquet/io/EmptyRecordReader.java`
#### Snippet
```java
  private final RecordMaterializer<T> recordMaterializer;

  public EmptyRecordReader(RecordMaterializer<T> recordMaterializer) {
    this.recordMaterializer = recordMaterializer;
    this.recordConsumer = recordMaterializer.getRootConverter(); // TODO: validator(wrap(recordMaterializer), validating, root.getType());
```

### BoundedWildcard
Can generalize to `? extends ColumnIO`
in `parquet-column/src/main/java/org/apache/parquet/io/GroupColumnIO.java`
#### Snippet
```java

  @Override
  void setLevels(int r, int d, String[] fieldPath, int[] indexFieldPath, List<ColumnIO> repetition, List<ColumnIO> path) {
    super.setLevels(r, d, fieldPath, indexFieldPath, repetition, path);
    for (ColumnIO child : this.children) {
```

### BoundedWildcard
Can generalize to `? extends PathExpr`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Expressions.java`
#### Snippet
```java
  }

  private static Schema filter(Schema schema, List<PathExpr> exprs) {
    if (exprs.isEmpty()) {
      return schema;
```

### BoundedWildcard
Can generalize to `? extends PathExpr`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Expressions.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static Object select(Schema schema, Object datum, List<PathExpr> tokens) {
    if (tokens.isEmpty()) {
      return datum;
```

### BoundedWildcard
Can generalize to `? extends Number`
in `parquet-column/src/main/java/org/apache/parquet/column/EncodingStats.java`
#### Snippet
```java
  private final boolean usesV2Pages;

  private EncodingStats(Map<Encoding, Number> dictStats,
                        Map<Encoding, Number> dataStats,
                        boolean usesV2Pages) {
```

### BoundedWildcard
Can generalize to `? extends Number`
in `parquet-column/src/main/java/org/apache/parquet/column/EncodingStats.java`
#### Snippet
```java

  private EncodingStats(Map<Encoding, Number> dictStats,
                        Map<Encoding, Number> dataStats,
                        boolean usesV2Pages) {
    this.dictStats = dictStats;
```

### BoundedWildcard
Can generalize to `? extends Encoding`
in `parquet-column/src/main/java/org/apache/parquet/column/EncodingStats.java`
#### Snippet
```java
    }

    public Builder addDataEncodings(Collection<Encoding> encodings) {
      for (Encoding encoding : encodings) {
        addDataEncoding(encoding);
```

### BoundedWildcard
Can generalize to `? super T`
in `parquet-column/src/main/java/org/apache/parquet/column/MinMax.java`
#### Snippet
```java
  }

  private void getMinAndMax(PrimitiveComparator<T> comparator, Iterable<T> iterable) {
    iterable.forEach(element -> {
      if (max == null) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `parquet-column/src/main/java/org/apache/parquet/column/MinMax.java`
#### Snippet
```java
  }

  private void getMinAndMax(PrimitiveComparator<T> comparator, Iterable<T> iterable) {
    iterable.forEach(element -> {
      if (max == null) {
```

### BoundedWildcard
Can generalize to `? extends Schema.Field`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
  }

  private List<Type> convertFields(List<Schema.Field> fields, String schemaPath) {
    List<Type> types = new ArrayList<Type>();
    for (Schema.Field field : fields) {
```

### BoundedWildcard
Can generalize to `? extends Schema`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
  }

  private Type convertUnionToGroupType(String fieldName, Type.Repetition repetition, List<Schema> nonNullSchemas,
      String schemaPath) {
    List<Type> unionTypes = new ArrayList<Type>(nonNullSchemas.size());
```

### BoundedWildcard
Can generalize to `? extends Type`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
  }

  private Schema convertFields(String name, List<Type> parquetFields, Map<String, Integer> names) {
    List<Schema.Field> fields = new ArrayList<Schema.Field>();
    Integer nameCount = names.merge(name, 1, (oldValue, value) -> oldValue + 1);
```

### BoundedWildcard
Can generalize to `? extends ColumnReader`
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnRecordFilter.java`
#### Snippet
```java
      final String[] filterPath = columnPath.split("\\.");
      @Override
      public RecordFilter bind(Iterable<ColumnReader> readers) {
        for (ColumnReader reader : readers) {
          if ( Arrays.equals( reader.getDescriptor().getPath(), filterPath)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
  }

  public static Predicate applyFunctionToString(final PredicateFunction<String> fn) {
    return new Predicate() {
      @Override
```

### BoundedWildcard
Can generalize to `? super Binary`
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
  }

  public static Predicate applyFunctionToBinary (final PredicateFunction<Binary> fn) {
    return new Predicate() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends Converter`
in `parquet-column/src/main/java/org/apache/parquet/example/DummyRecordConverter.java`
#### Snippet
```java

      @Override
      public Converter convertGroupType(List<GroupType> path, GroupType groupType, final List<Converter> converters) {
        return new GroupConverter() {

```

### BoundedWildcard
Can generalize to `? extends PrimitiveColumnIO`
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicateBuilderBase.java`
#### Snippet
```java
  public IncrementallyUpdatedFilterPredicateBuilderBase() { }

  public IncrementallyUpdatedFilterPredicateBuilderBase(List<PrimitiveColumnIO> leaves) {
    for (PrimitiveColumnIO leaf : leaves) {
      ColumnDescriptor descriptor = leaf.getColumnDescriptor();
```

### BoundedWildcard
Can generalize to `? super Binary`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BinaryColumnIndexBuilder.java`
#### Snippet
```java

  @Override
  int compareMaxValues(PrimitiveComparator<Binary> comparator, int index1, int index2) {
    return comparator.compare(maxValues.get(index1), maxValues.get(index2));
  }
```

### BoundedWildcard
Can generalize to `? super Binary`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BinaryColumnIndexBuilder.java`
#### Snippet
```java

  @Override
  int compareMinValues(PrimitiveComparator<Binary> comparator, int index1, int index2) {
    return comparator.compare(minValues.get(index1), minValues.get(index2));
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/TBaseRecordConverter.java`
#### Snippet
```java
  }

  public TBaseRecordConverter(final Class<T> thriftClass, MessageType requestedParquetSchema, StructType thriftType, Configuration conf) {
    super(new ThriftReader<T>() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetReadProtocol.java`
#### Snippet
```java
  }

  public void addAll(Collection<TProtocol> events) {
    this.events.addAll(events);
  }
```

### BoundedWildcard
Can generalize to `? extends Set`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftMetaData.java`
#### Snippet
```java
   * @return the list of thrift classes used to write them
   */
  public static Set<String> getThriftClassNames(Map<String, Set<String>> fileMetadata) {
    return fileMetadata.get(THRIFT_CLASS);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `parquet-column/src/main/java/org/apache/parquet/schema/GroupType.java`
#### Snippet
```java
  }

  protected <T> List<T> convertChildren(List<GroupType> path, TypeConverter<T> converter) {
    List<T> children = new ArrayList<>(fields.size());
    for (Type field : fields) {
```

### BoundedWildcard
Can generalize to `? extends ThriftField`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/FieldsPath.java`
#### Snippet
```java
  }

  private FieldsPath(ArrayList<ThriftField> fields) {
    this.fields = fields;
  }
```

### BoundedWildcard
Can generalize to `? super ColumnIndex`
in `parquet-column/src/main/java/org/apache/parquet/internal/filter2/columnindex/ColumnIndexFilter.java`
#### Snippet
```java
  }

  private RowRanges applyPredicate(Column<?> column, Function<ColumnIndex, PrimitiveIterator.OfInt> func,
      RowRanges rangesForMissingColumns) {
    ColumnPath columnPath = column.getColumnPath();
```

### BoundedWildcard
Can generalize to `? extends PrimitiveIterator.OfInt`
in `parquet-column/src/main/java/org/apache/parquet/internal/filter2/columnindex/ColumnIndexFilter.java`
#### Snippet
```java
  }

  private RowRanges applyPredicate(Column<?> column, Function<ColumnIndex, PrimitiveIterator.OfInt> func,
      RowRanges rangesForMissingColumns) {
    ColumnPath columnPath = column.getColumnPath();
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
  abstract void addMinMax(Object min, Object max);

  private void fill(List<Boolean> nullPages, List<Long> nullCounts, List<ByteBuffer> minValues,
      List<ByteBuffer> maxValues) {
    clear();
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java

  private void fill(List<Boolean> nullPages, List<Long> nullCounts, List<ByteBuffer> minValues,
      List<ByteBuffer> maxValues) {
    clear();
    int pageCount = nullPages.size();
```

### BoundedWildcard
Can generalize to `? super Action`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
  }

  private void writeByteAction(List<Action> buffer, final byte b) {
    buffer.add(new Action() {
      @Override
```

### BoundedWildcard
Can generalize to `? super Action`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
  }

  private void writeShortAction(List<Action> buffer, final short s) {
    buffer.add(new Action() {
      @Override
```

### BoundedWildcard
Can generalize to `? super Action`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
  }

  private void writeBoolAction(List<Action> buffer, final boolean bool) {
    buffer.add(new Action() {
      @Override
```

### BoundedWildcard
Can generalize to `? super Action`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
  }

  private void writeIntAction(List<Action> buffer, final int i) {
    buffer.add(new Action() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends Action`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
  }

  private String error(String message, List<Action> buffer) {
    StringBuilder sb = new StringBuilder(message).append(": ");
    for (Action action : buffer) {
```

### BoundedWildcard
Can generalize to `? super Action`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
  }

  private void writeLongAction(List<Action> buffer, final long l) {
    buffer.add(new Action() {
      @Override
```

### BoundedWildcard
Can generalize to `? super Action`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
  }

  private void writeStringAction(List<Action> buffer, final ByteBuffer bin) {
    buffer.add(new Action() {
      @Override
```

### BoundedWildcard
Can generalize to `? super Action`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
  }

  private void writeDoubleAction(List<Action> buffer, final double d) {
    buffer.add(new Action() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/amend/ProtocolEventsAmender.java`
#### Snippet
```java
   * @throws TException
   */
  private void checkPrimitiveField(byte type, Iterator<TProtocol> eventIter) throws TException {
    acceptProtocol(eventIter.next());
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `parquet-pig/src/main/java/org/apache/parquet/pig/PigMetaData.java`
#### Snippet
```java
   * @param map where to add the key values representing this metadata
   */
  public void addToMetaData(Map<String, String> map) {
    map.put(PIG_SCHEMA, pigSchema);
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `parquet-pig/src/main/java/org/apache/parquet/pig/PigMetaData.java`
#### Snippet
```java
   * @param map where to add the key values representing this metadata
   */
  public void addToMetaData(Map<String, String> map) {
    map.put(PIG_SCHEMA, pigSchema);
  }
```

### BoundedWildcard
Can generalize to `? extends Set`
in `parquet-pig/src/main/java/org/apache/parquet/pig/PigMetaData.java`
#### Snippet
```java
   * @return the list pig schemas from the footers
   */
  public static Set<String> getPigSchemas(Map<String, Set<String>> keyValueMetaData) {
    return keyValueMetaData.get(PIG_SCHEMA);
  }
```

### BoundedWildcard
Can generalize to `? extends RequiredField`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
  }

  private Schema getSchemaFromRequiredFieldList(Schema schema, List<RequiredField> fieldList)
      throws FrontendException {
    Schema s = new Schema();
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private final List<TProtocol> parentEvents;

    public SetConverter(List<TProtocol> parentEvents, GroupType parquetSchema, ThriftField field) {
      super(parentEvents, parquetSchema, ((SetType)field.getType()).getValues());
      this.parentEvents = parentEvents;
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private ThriftTypeID type;

    public FieldPrimitiveConverter(List<TProtocol> events, ThriftField field) {
      this.events = events;
      this.type = field.getType().getType();
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private int nullElementCount;

    public ElementConverter(String listName, List<TProtocol> listEvents,
                            GroupType repeatedType, ThriftField thriftElement) {
      this.listEvents = listEvents;
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    }

    public PrimitiveFieldHandler(PrimitiveConverter delegate, final ThriftField field, List<TProtocol> events) {
      this.delegate = delegate;
      this.events = events;
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private final List<TProtocol> parentEvents;

    ListConverter(List<TProtocol> parentEvents, GroupType parquetSchema, ThriftField field) {
      super(parentEvents, parquetSchema, ((ListType)field.getType()).getValues());
      this.parentEvents = parentEvents;
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private final List<TProtocol> events;

    public FieldStringConverter(List<TProtocol> events, ThriftField field) {
      this.events = events;
    }
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private final ParquetProtocol readFieldBegin;

    public GroupFieldhandler(GroupConverter delegate, final ThriftField field, List<TProtocol> events) {
      this.delegate = delegate;
      this.events = events;
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private final ThriftField field;

    public FieldEnumConverter(List<TProtocol> events, ThriftField field) {
      this.events = events;
      this.field = field;
```

### BoundedWildcard
Can generalize to `? extends T`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
   * @param conf a Configuration
   */
  public ThriftRecordConverter(ThriftReader<T> thriftReader, String name, MessageType requestedParquetSchema, ThriftType.StructType thriftType, Configuration conf) {
    super();
    this.thriftReader = thriftReader;
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private ThriftTypeID valuesType;

    CollectionConverter(List<TProtocol> parentEvents, GroupType parquetSchema, ThriftField values) {
      this.parentEvents = parentEvents;
      if (parquetSchema.getFieldCount() != 1) {
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private final byte valueType;

    MapConverter(List<TProtocol> parentEvents, GroupType parquetSchema, ThriftField field) {
      this.parentEvents = parentEvents;
      if (parquetSchema.getFieldCount() != 1) {
```

### BoundedWildcard
Can generalize to `? super TProtocol`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
    private final List<TProtocol> events;

    private StructConverter(List<TProtocol> events, GroupType parquetSchema, ThriftField field) {
      this.events = events;
      this.name = field.getName();
```

### BoundedWildcard
Can generalize to `? extends EnumValueCount`
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/EnumStat.java`
#### Snippet
```java
  }

  public void setValues(Collection<EnumValueCount> values) {
    if (values == null) {
      this.values = null;
```

### BoundedWildcard
Can generalize to `? extends T`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/Consumers.java`
#### Snippet
```java
  private Consumer<T> consumer;

  public TBaseStructConsumer(Class<T> c, Consumer<T> consumer) {
    this.c = c;
    this.consumer = consumer;
```

### BoundedWildcard
Can generalize to `? super T`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/Consumers.java`
#### Snippet
```java
  private Consumer<T> consumer;

  public TBaseStructConsumer(Class<T> c, Consumer<T> consumer) {
    this.c = c;
    this.consumer = consumer;
```

### BoundedWildcard
Can generalize to `? super List`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/Consumers.java`
#### Snippet
```java
   * @return a ListConsumer that can be passed to the DelegatingFieldConsumer
   */
  public static <T extends TBase<T,? extends TFieldIdEnum>> ListConsumer listOf(Class<T> c, final Consumer<List<T>> consumer) {
    class ListConsumer implements Consumer<T> {
      List<T> list;
```

### BoundedWildcard
Can generalize to `? extends Type`
in `parquet-pig/src/main/java/org/apache/parquet/pig/PigSchemaConverter.java`
#### Snippet
```java
  }

  private Schema convertFields(List<Type> parquetFields) {
    List<FieldSchema> fields = new ArrayList<Schema.FieldSchema>();
    for (Type parquetType : parquetFields) {
```

### BoundedWildcard
Can generalize to `? extends E`
in `parquet-common/src/main/java/org/apache/parquet/bytes/MultiBufferInputStream.java`
#### Snippet
```java
    boolean useFirst = true;

    public ConcatIterator(Iterator<E> first, Iterator<E> second) {
      this.first = first;
      this.second = second;
```

### BoundedWildcard
Can generalize to `? extends E`
in `parquet-common/src/main/java/org/apache/parquet/bytes/MultiBufferInputStream.java`
#### Snippet
```java
    boolean useFirst = true;

    public ConcatIterator(Iterator<E> first, Iterator<E> second) {
      this.first = first;
      this.second = second;
```

### BoundedWildcard
Can generalize to `? extends C`
in `parquet-common/src/main/java/org/apache/parquet/util/DynConstructors.java`
#### Snippet
```java
    private final Class<? extends C> constructed;

    private Ctor(Constructor<C> constructor, Class<? extends C> constructed) {
      super(null, "newInstance");
      this.ctor = constructor;
```

### BoundedWildcard
Can generalize to `? extends Field`
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java
  }

  private List<TypeMapping> fromArrow(List<Field> fields) {
    List<TypeMapping> result = new ArrayList<>(fields.size());
    for (Field field : fields) {
```

### BoundedWildcard
Can generalize to `? extends TypeMapping`
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java
  }

  private List<Field> fields(List<TypeMapping> mappings) {
    List<Field> result = new ArrayList<>(mappings.size());
    for (TypeMapping typeMapping : mappings) {
```

### BoundedWildcard
Can generalize to `? extends TypeMapping`
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java
  }

  private <T> GroupBuilder<T> addToBuilder(List<TypeMapping> parquetFields, GroupBuilder<T> builder) {
    for (TypeMapping type : parquetFields) {
      builder = builder.addField(type.getParquetType());
```

### BoundedWildcard
Can generalize to `? extends Type`
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java
  }

  private List<TypeMapping> fromParquet(List<Type> fields) {
    List<TypeMapping> result = new ArrayList<>(fields.size());
    for (Type type : fields) {
```

### BoundedWildcard
Can generalize to `? extends Field`
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java
  }

  private List<TypeMapping> map(List<Field> arrowFields, List<Type> parquetFields) {
    if (arrowFields.size() != parquetFields.size()) {
      throw new IllegalArgumentException("Can not map schemas as sizes differ: " + arrowFields + " != " + parquetFields);
```

### BoundedWildcard
Can generalize to `? extends Type`
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java
  }

  private List<TypeMapping> map(List<Field> arrowFields, List<Type> parquetFields) {
    if (arrowFields.size() != parquetFields.size()) {
      throw new IllegalArgumentException("Can not map schemas as sizes differ: " + arrowFields + " != " + parquetFields);
```

### BoundedWildcard
Can generalize to `? extends BytesInput`
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesInput.java`
#### Snippet
```java
    private final long size;

    private SequenceBytesIn(List<BytesInput> inputs) {
      this.inputs = inputs;
      long total = 0;
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/HadoopFSKeyMaterialStore.java`
#### Snippet
```java
  public final static String KEY_MATERIAL_FILE_PREFIX = "_KEY_MATERIAL_FOR_";
  public static final String TEMP_FILE_PREFIX = "_TMP";
  public final static String KEY_MATERIAL_FILE_SUFFFIX = ".json";
  private static final ObjectMapper objectMapper = new ObjectMapper();

```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/HadoopFSKeyMaterialStore.java`
#### Snippet
```java

public class HadoopFSKeyMaterialStore implements FileKeyMaterialStore {
  public final static String KEY_MATERIAL_FILE_PREFIX = "_KEY_MATERIAL_FOR_";
  public static final String TEMP_FILE_PREFIX = "_TMP";
  public final static String KEY_MATERIAL_FILE_SUFFFIX = ".json";
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/CodecFactory.java`
#### Snippet
```java
   */
  @Deprecated
  public static abstract class BytesCompressor implements CompressionCodecFactory.BytesInputCompressor {
    public abstract BytesInput compress(BytesInput bytes) throws IOException;
    public abstract CompressionCodecName getCodecName();
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/CodecFactory.java`
#### Snippet
```java
   */
  @Deprecated
  public static abstract class BytesDecompressor implements CompressionCodecFactory.BytesInputDecompressor {
    public abstract BytesInput decompress(BytesInput bytes, int uncompressedSize) throws IOException;
    public abstract void decompress(ByteBuffer input, int compressedSize, ByteBuffer output, int uncompressedSize) throws IOException;
```

### MissortedModifiers
Missorted modifiers `synchronized static`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java
  private static MemoryManager memoryManager;

  public synchronized static MemoryManager getMemoryManager() {
    return memoryManager;
  }
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/api/ReadSupport.java`
#### Snippet
```java
 * @param <T> the type of the materialized record
 */
abstract public class ReadSupport<T> {

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/api/ReadSupport.java`
#### Snippet
```java
   * @return the recordMaterializer that will materialize the records
   */
  abstract public RecordMaterializer<T> prepareForRead(
          Configuration configuration,
          Map<String, String> keyValueMetaData,
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/api/WriteSupport.java`
#### Snippet
```java
 * @param <T> the type of the incoming records
 */
abstract public class WriteSupport<T> {

  /**
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java
   * @return byte size of the compressed data.
   */
  abstract protected int compress(ByteBuffer uncompressed, ByteBuffer compressed) throws IOException;

}
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java
 * the entire input in setInput and compresses it as one compressed block.
 */
abstract public class NonBlockedCompressor implements Compressor {

  // Buffer for compressed output. This buffer grows as necessary.
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java
   * @return maximum byte size of the compressed data
   */
  abstract protected int maxCompressedLength(int byteSize);

  /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java
  public final static int DEFAULT_PARQUET_COMPRESS_ZSTD_LEVEL = 3;
  public final static String PARQUET_COMPRESS_ZSTD_WORKERS = "parquet.compression.codec.zstd.workers";
  public final static int DEFAULTPARQUET_COMPRESS_ZSTD_WORKERS = 0;

  private Configuration conf;
```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java
  public final static String PARQUET_COMPRESS_ZSTD_LEVEL = "parquet.compression.codec.zstd.level";
  public final static int DEFAULT_PARQUET_COMPRESS_ZSTD_LEVEL = 3;
  public final static String PARQUET_COMPRESS_ZSTD_WORKERS = "parquet.compression.codec.zstd.workers";
  public final static int DEFAULTPARQUET_COMPRESS_ZSTD_WORKERS = 0;

```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java
  public final static boolean DEFAULT_PARQUET_COMPRESS_ZSTD_BUFFERPOOL_ENABLED = true;
  public final static String PARQUET_COMPRESS_ZSTD_LEVEL = "parquet.compression.codec.zstd.level";
  public final static int DEFAULT_PARQUET_COMPRESS_ZSTD_LEVEL = 3;
  public final static String PARQUET_COMPRESS_ZSTD_WORKERS = "parquet.compression.codec.zstd.workers";
  public final static int DEFAULTPARQUET_COMPRESS_ZSTD_WORKERS = 0;
```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java

  public final static String PARQUET_COMPRESS_ZSTD_BUFFERPOOL_ENABLED = "parquet.compression.codec.zstd.bufferPool.enabled";
  public final static boolean DEFAULT_PARQUET_COMPRESS_ZSTD_BUFFERPOOL_ENABLED = true;
  public final static String PARQUET_COMPRESS_ZSTD_LEVEL = "parquet.compression.codec.zstd.level";
  public final static int DEFAULT_PARQUET_COMPRESS_ZSTD_LEVEL = 3;
```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java
  public final static String PARQUET_COMPRESS_ZSTD_BUFFERPOOL_ENABLED = "parquet.compression.codec.zstd.bufferPool.enabled";
  public final static boolean DEFAULT_PARQUET_COMPRESS_ZSTD_BUFFERPOOL_ENABLED = true;
  public final static String PARQUET_COMPRESS_ZSTD_LEVEL = "parquet.compression.codec.zstd.level";
  public final static int DEFAULT_PARQUET_COMPRESS_ZSTD_LEVEL = 3;
  public final static String PARQUET_COMPRESS_ZSTD_WORKERS = "parquet.compression.codec.zstd.workers";
```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/ZstandardCodec.java`
#### Snippet
```java
public class ZstandardCodec implements Configurable, CompressionCodec {

  public final static String PARQUET_COMPRESS_ZSTD_BUFFERPOOL_ENABLED = "parquet.compression.codec.zstd.bufferPool.enabled";
  public final static boolean DEFAULT_PARQUET_COMPRESS_ZSTD_BUFFERPOOL_ENABLED = true;
  public final static String PARQUET_COMPRESS_ZSTD_LEVEL = "parquet.compression.codec.zstd.level";
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedDecompressor.java`
#### Snippet
```java
   * @return uncompressed data size
   */
  abstract protected int uncompress(ByteBuffer compressed, ByteBuffer uncompressed) throws IOException;

}
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedDecompressor.java`
#### Snippet
```java
   * @return uncompressed byte length of the given input
   */
  abstract protected int maxUncompressedLength(ByteBuffer compressed, int maxUncompressedLength) throws IOException;

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedDecompressor.java`
#### Snippet
```java
import java.nio.ByteBuffer;

abstract public class NonBlockedDecompressor implements Decompressor {

  // Buffer for uncompressed output. This buffer grows as necessary.
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ColumnChunkMetaData.java`
#### Snippet
```java
   * @return start of the column data offset
   */
  abstract public long getFirstDataPageOffset();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ColumnChunkMetaData.java`
#### Snippet
```java
   * @return the totalUncompressedSize
   */
  abstract public long getTotalUncompressedSize();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ColumnChunkMetaData.java`
#### Snippet
```java
   *         {@link #hasDictionaryPage()} to validate.
   */
  abstract public long getDictionaryPageOffset();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ColumnChunkMetaData.java`
#### Snippet
```java
   * @return count of values in this block of the column
   */
  abstract public long getValueCount();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ColumnChunkMetaData.java`
#### Snippet
```java
 * Column meta data for a block stored in the file footer and passed in the InputSplit
 */
abstract public class ColumnChunkMetaData {
  protected int rowGroupOrdinal = -1;

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ColumnChunkMetaData.java`
#### Snippet
```java
   * @return the stats for this column
   */
  abstract public Statistics getStatistics();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ColumnChunkMetaData.java`
#### Snippet
```java
   * @return the totalSize
   */
  abstract public long getTotalSize();

  /**
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addLong(long value) {
      parent.addLong(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addDouble(double value) {
      parent.addDouble(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addFloat(float value) {
      parent.addDouble((double) value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addFloat(float value) {
      parent.addFloat(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addInt(int value) {
      parent.addFloat((float) value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addInt(int value) {
      parent.addDouble((double) value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addLong(long value) {
      parent.addDouble((double) value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addBoolean(boolean value) {
      parent.addBoolean(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addInt(int value) {
      parent.addInt(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addInt(int value) {
      parent.addLong((long) value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

    @Override
    final public void addLong(long value) {
      parent.addFloat((float) value);
    }
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/ColumnIO.java`
#### Snippet
```java
 * a structure used to serialize deserialize records
 */
abstract public class ColumnIO {

  private final GroupColumnIO parent;
```

### MissortedModifiers
Missorted modifiers `final protected`
in `parquet-column/src/main/java/org/apache/parquet/io/BaseRecordReader.java`
#### Snippet
```java
  }

  final protected void startMessage() {
    // reset state
    endField = null;
```

### MissortedModifiers
Missorted modifiers `final protected`
in `parquet-column/src/main/java/org/apache/parquet/io/BaseRecordReader.java`
#### Snippet
```java
  }

  final protected void addPrimitiveINT32(String field, int index, int value) {
    startField(field, index);
    LOG.debug("addInteger({})", value);
```

### MissortedModifiers
Missorted modifiers `final protected`
in `parquet-column/src/main/java/org/apache/parquet/io/BaseRecordReader.java`
#### Snippet
```java
  }

  final protected void startGroup(String field, int index) {
    startField(field, index);
    LOG.debug("startGroup()");
```

### MissortedModifiers
Missorted modifiers `final protected`
in `parquet-column/src/main/java/org/apache/parquet/io/BaseRecordReader.java`
#### Snippet
```java
  }

  final protected void endMessage() {
    if (endField != null) {
      // close the previous field
```

### MissortedModifiers
Missorted modifiers `final protected`
in `parquet-column/src/main/java/org/apache/parquet/io/BaseRecordReader.java`
#### Snippet
```java
  }

  final protected int getCaseId(int state, int currentLevel, int d, int nextR) {
    return caseLookup[state].getCase(currentLevel, d, nextR).getID();
  }
```

### MissortedModifiers
Missorted modifiers `final protected`
in `parquet-column/src/main/java/org/apache/parquet/io/BaseRecordReader.java`
#### Snippet
```java
  }

  final protected void addPrimitiveBINARY(String field, int index, Binary value) {
    startField(field, index);
    LOG.debug("addBinary({})", value);
```

### MissortedModifiers
Missorted modifiers `final protected`
in `parquet-column/src/main/java/org/apache/parquet/io/BaseRecordReader.java`
#### Snippet
```java
  }

  final protected void endGroup(String field, int index) {
    if (endField != null) {
      // close the previous field
```

### MissortedModifiers
Missorted modifiers `final protected`
in `parquet-column/src/main/java/org/apache/parquet/io/BaseRecordReader.java`
#### Snippet
```java
  }

  final protected void addPrimitiveINT64(String field, int index, long value) {
    startField(field, index);
    LOG.debug("addLong({})", value);
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroIndexedRecordConverter.java`
#### Snippet
```java

    @Override
    final public void addBinary(Binary value) {
      Object enumValue = value.toStringUsingUTF8();
      if (enumClass != null) {
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroIndexedRecordConverter.java`
#### Snippet
```java

    @Override
    final public void addBinary(Binary value) {
      if (fixedClass == null) {
        parent.add(new GenericData.Fixed(avroSchema, value.getBytes()));
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroIndexedRecordConverter.java`
#### Snippet
```java
        keyConverter = new PrimitiveConverter() {
          @Override
          final public void addBinary(Binary value) {
            key = value.toStringUsingUTF8();
          }
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordMaterializer.java`
#### Snippet
```java
 * @param <T> the materialized object class
 */
abstract public class RecordMaterializer<T> {

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordMaterializer.java`
#### Snippet
```java
   * @return the root converter for this tree
   */
  abstract public GroupConverter getRootConverter();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordMaterializer.java`
#### Snippet
```java
   * @throws RecordMaterializationException to signal that a record cannot be materialized, but can be skipped
   */
  abstract public T getCurrentRecord();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/PrimitiveConverter.java`
#### Snippet
```java
 * converter for leaves of the schema
 */
abstract public class PrimitiveConverter extends Converter {

  @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * @param value a double value
   */
  abstract public void addDouble(double value);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * @param value an int value
   */
  abstract public void addInteger(int value);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * @param value a float value
   */
  abstract public void addFloat(float value);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * end of a record
   */
  abstract public void endMessage();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * @param index of the field in the group or message
   */
  abstract public void startField(String field, int index);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * @param index of the field in the group or message
   */
  abstract public void endField(String field, int index);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * start a new record
   */
  abstract public void startMessage();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * end of a group in a field
   */
  abstract public void endGroup();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * @param value a boolean value
   */
  abstract public void addBoolean(boolean value);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * start of a group in a field
   */
  abstract public void startGroup();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
 * </pre>
 */
abstract public class RecordConsumer {

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * @param value a long value
   */
  abstract public void addLong(long value);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/RecordConsumer.java`
#### Snippet
```java
   * @param value a binary value
   */
  abstract public void addBinary(Binary value);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/GroupConverter.java`
#### Snippet
```java

  /** called at the beginning of the group managed by this converter */
  abstract public void start();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/GroupConverter.java`
#### Snippet
```java
   * call at the end of the group
   */
  abstract public void end();

}
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/GroupConverter.java`
#### Snippet
```java
 * converter for group nodes
 */
abstract public class GroupConverter extends Converter {

  @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/GroupConverter.java`
#### Snippet
```java
   * @return the corresponding converter
   */
  abstract public Converter getConverter(int fieldIndex);

  /** runtime calls  **/
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * Close the related output stream and release any resources
   */
  abstract public void close();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return approximate size of the buffered encoded binary data
   */
  abstract public long getBufferedSize();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return a formated string representing memory usage per column
   */
  abstract public String memUsageString();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return the column writer for the given column
   */
  abstract public ColumnWriter getColumnWriter(ColumnDescriptor path);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * called to notify of record boundaries
   */
  abstract public void endRecord();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * @return approximate size used in memory
   */
  abstract public long getAllocatedSize();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnWriteStore.java`
#### Snippet
```java
   * when we are done writing to flush to the underlying storage
   */
  abstract public void flush();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Converter.java`
#### Snippet
```java
public abstract class Converter {

  abstract public boolean isPrimitive();

  public PrimitiveConverter asPrimitiveConverter() {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/ColumnReadStore.java`
#### Snippet
```java
   * @return the column reader for that descriptor
   */
  abstract public ColumnReader getColumnReader(ColumnDescriptor path);

}
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  abstract public void writeTo(DataOutput out) throws IOException;

  abstract public byte[] getBytes();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  public static final Binary EMPTY = fromConstantByteArray(new byte[0]);

  abstract public String toStringUsingUTF8();

  abstract public int length();
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  @Override
  @Deprecated
  abstract public int compareTo(Binary other);

  abstract int lexicographicCompare(Binary other);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
import org.apache.parquet.schema.PrimitiveComparator;

abstract public class Binary implements Comparable<Binary>, Serializable {

  protected boolean isBackingBytesReused;
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  abstract public byte[] getBytesUnsafe();

  abstract public Binary slice(int start, int length);

  abstract boolean equals(byte[] bytes, int offset, int length);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  abstract public void writeTo(OutputStream out) throws IOException;

  abstract public void writeTo(DataOutput out) throws IOException;

  abstract public byte[] getBytes();
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  abstract public int length();

  abstract public void writeTo(OutputStream out) throws IOException;

  abstract public void writeTo(DataOutput out) throws IOException;
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  abstract int lexicographicCompare(ByteBuffer other, int otherOffset, int otherLength);

  abstract public ByteBuffer toByteBuffer();

  @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
  abstract public String toStringUsingUTF8();

  abstract public int length();

  abstract public void writeTo(OutputStream out) throws IOException;
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
   * @return backing byte[] of correct size, with an offset of 0, if possible, else returns result of getBytes()
   */
  abstract public byte[] getBytesUnsafe();

  abstract public Binary slice(int start, int length);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/page/Page.java`
#### Snippet
```java
 * one page in a chunk
 */
abstract public class Page {

  private final int compressedSize;
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/page/DataPage.java`
#### Snippet
```java
 * one data page in a chunk
 */
abstract public class DataPage extends Page {

  private final int valueCount;
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/values/ValuesWriter.java`
#### Snippet
```java
  }

  abstract public String memUsageString(String prefix);

}
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/values/ValuesWriter.java`
#### Snippet
```java
   * @return the allocated size of the buffer
   */
  abstract public long getAllocatedSize();

  /**
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  }

  static abstract class IntIterator {
    abstract int nextInt();
  }
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
   * binds the lower level page decoder to the record converter materializing the records
   */
  private static abstract class Binding {

    /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/values/ValuesReader.java`
#### Snippet
```java
   * Skips the next value in the page
   */
  abstract public void skip();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/values/plain/PlainValuesReader.java`
#### Snippet
```java
 * Plain encoding for float, double, int, long
 */
abstract public class PlainValuesReader extends ValuesReader {
  private static final Logger LOG = LoggerFactory.getLogger(PlainValuesReader.class);

```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/DictionaryValuesWriter.java`
#### Snippet
```java
  }

  abstract protected void fallBackDictionaryEncodedData(ValuesWriter writer);

  @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/Statistics.java`
#### Snippet
```java
   * @return byte array corresponding to the max value
   */
  abstract public byte[] getMaxBytes();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/Statistics.java`
#### Snippet
```java
   * @param stats Statistics object to merge with
   */
  abstract protected void mergeStatisticsMinMax(Statistics stats);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/Statistics.java`
#### Snippet
```java
   * @return byte array corresponding to the min value
   */
  abstract public byte[] getMinBytes();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/Statistics.java`
#### Snippet
```java
   * @return the min value
   */
  abstract public T genericGetMin();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/Statistics.java`
#### Snippet
```java
   * @return true iff the min and max values are less than size bytes
   */
  abstract public boolean isSmallerThan(long size);

  @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/Statistics.java`
#### Snippet
```java
   * @return the max value
   */
  abstract public T genericGetMax();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/Statistics.java`
#### Snippet
```java
   */
  @Deprecated
  abstract public void setMinMaxFromBytes(byte[] minBytes, byte[] maxBytes);

  /**
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  };

  private static abstract class BinaryComparator extends PrimitiveComparator<Binary> {
    @Override
    int compareNotNulls(Binary o1, Binary o2) {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  };

  private static abstract class IntComparator extends PrimitiveComparator<Integer> {
    @Override
    int compareNotNulls(Integer o1, Integer o2) {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  };

  private static abstract class LongComparator extends PrimitiveComparator<Long> {
    @Override
    int compareNotNulls(Long o1, Long o2) {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
   * @return if this is a primitive type
   */
  abstract public boolean isPrimitive();

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
     * @return true if it is strictly more restrictive than other
     */
    abstract public boolean isMoreRestrictiveThan(Repetition other);


```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java

  @Deprecated
  abstract protected boolean typeEquals(Type other);

  @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
   * @param indent indentation level
   */
  abstract public void writeToStringBuilder(StringBuilder sb, String indent);

  /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
   * @param visitor the visitor to visit this type
   */
  abstract public void accept(TypeVisitor visitor);

  @Deprecated
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
 * repeated, required, or optional.
 */
abstract public class Type {

  /**
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java

  @Deprecated
  abstract protected int typeHashCode();

  @Deprecated
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupFactory.java`
#### Snippet
```java
package org.apache.parquet.example.data;

abstract public class GroupFactory {

  abstract public Group newGroup();
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupFactory.java`
#### Snippet
```java
abstract public class GroupFactory {

  abstract public Group newGroup();

}
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public boolean getBoolean(int fieldIndex, int index);

  abstract public Binary getBinary(int fieldIndex, int index);

  abstract public Binary getInt96(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public String getString(int fieldIndex, int index);

  abstract public int getInteger(int fieldIndex, int index);

  abstract public long getLong(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public int getFieldRepetitionCount(int fieldIndex);

  abstract public GroupValueSource getGroup(int fieldIndex, int index);

  abstract public String getString(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public Binary getBinary(int fieldIndex, int index);

  abstract public Binary getInt96(int fieldIndex, int index);

  abstract public String getValueToString(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public long getLong(int fieldIndex, int index);

  abstract public double getDouble(int fieldIndex, int index);

  abstract public float getFloat(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public float getFloat(int fieldIndex, int index);

  abstract public boolean getBoolean(int fieldIndex, int index);

  abstract public Binary getBinary(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public GroupValueSource getGroup(int fieldIndex, int index);

  abstract public String getString(int fieldIndex, int index);

  abstract public int getInteger(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public double getDouble(int fieldIndex, int index);

  abstract public float getFloat(int fieldIndex, int index);

  abstract public boolean getBoolean(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public Binary getInt96(int fieldIndex, int index);

  abstract public String getValueToString(int fieldIndex, int index);

  abstract public GroupType getType();
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public int getInteger(int fieldIndex, int index);

  abstract public long getLong(int fieldIndex, int index);

  abstract public double getDouble(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  abstract public String getValueToString(int fieldIndex, int index);

  abstract public GroupType getType();
}

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
import org.apache.parquet.schema.GroupType;

abstract public class GroupValueSource {

  public int getFieldRepetitionCount(String field) {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/GroupValueSource.java`
#### Snippet
```java
  }

  abstract public int getFieldRepetitionCount(int fieldIndex);

  abstract public GroupValueSource getGroup(int fieldIndex, int index);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  abstract public void add(int fieldIndex, float value);

  abstract public void add(int fieldIndex, double value);

  abstract public void add(int fieldIndex, Group value);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  }

  abstract public void writeValue(int field, int index, RecordConsumer recordConsumer);

}
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  abstract public void add(int fieldIndex, Binary value);

  abstract public void add(int fieldIndex, float value);

  abstract public void add(int fieldIndex, double value);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  abstract public void add(int fieldIndex, double value);

  abstract public void add(int fieldIndex, Group value);

  abstract public Group addGroup(int fieldIndex);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  abstract public void add(int fieldIndex, String value);

  abstract public void add(int fieldIndex, boolean value);

  abstract public void add(int fieldIndex, NanoTime value);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  abstract public void add(int fieldIndex, int value);

  abstract public void add(int fieldIndex, long value);

  abstract public void add(int fieldIndex, String value);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  abstract public void add(int fieldIndex, NanoTime value);

  abstract public void add(int fieldIndex, Binary value);

  abstract public void add(int fieldIndex, float value);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  abstract public void add(int fieldIndex, boolean value);

  abstract public void add(int fieldIndex, NanoTime value);

  abstract public void add(int fieldIndex, Binary value);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  abstract public void add(int fieldIndex, long value);

  abstract public void add(int fieldIndex, String value);

  abstract public void add(int fieldIndex, boolean value);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

abstract public class Group extends GroupValueSource {
  private static final Logger LOG = LoggerFactory.getLogger(Group.class);

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java

  @Override
  abstract public Group getGroup(int fieldIndex, int index);

  public Group asGroup() {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  abstract public void add(int fieldIndex, Group value);

  abstract public Group addGroup(int fieldIndex);

  @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/Group.java`
#### Snippet
```java
  }

  abstract public void add(int fieldIndex, int value);

  abstract public void add(int fieldIndex, long value);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/Primitive.java`
#### Snippet
```java
  }

  abstract public void writeValue(RecordConsumer recordConsumer);

}
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  private static final String BINARY_INVALID = "<INVALID>";

  static abstract class BinaryStringifierBase extends PrimitiveStringifier {
    private BinaryStringifierBase(String name) {
      super(name);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
        ColumnReader columnReader);

    abstract public void addValueToPrimitiveConverter(
        PrimitiveConverter primitiveConverter, ColumnReader columnReader);

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
        PrimitiveConverter primitiveConverter, ColumnReader columnReader);

    abstract public <T, E extends Exception> T convert(PrimitiveTypeNameConverter<T, E> converter) throws E;

    abstract PrimitiveComparator<?> comparator(LogicalTypeAnnotation logicalType);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
     * @param columnReader where to read from
     */
    abstract public void addValueToRecordConsumer(RecordConsumer recordConsumer,
        ColumnReader columnReader);

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
     * @return a string
     */
    abstract public String toString(ColumnReader columnReader);

    /**
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java

  // base class for and / or
  static abstract class BinaryLogical implements IncrementallyUpdatedFilterPredicate {
    private final IncrementallyUpdatedFilterPredicate left;
    private final IncrementallyUpdatedFilterPredicate right;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
   * It is stateful, and needs to be rest after use.
   */
  public static abstract class ValueInspector implements IncrementallyUpdatedFilterPredicate {
    // package private constructor
    ValueInspector() { }
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
    }

    abstract protected Type build(String name);

    /**
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java

  // base class for Eq, NotEq, Lt, Gt, LtEq, GtEq
  static abstract class ColumnFilterPredicate<T extends Comparable<T>> implements FilterPredicate, Serializable  {
    private final Column<T> column;
    private final T value;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java
  private Operators() { }

  public static abstract class Column<T extends Comparable<T>> implements Serializable {
    private final ColumnPath columnPath;
    private final Class<T> columnType;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java

  // base class for And, Or
  private static abstract class BinaryLogicalFilterPredicate implements FilterPredicate, Serializable {
    private final FilterPredicate left;
    private final FilterPredicate right;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java
   * {@link NotIn} is used to filter data that are not in the list of values.
   */
  public static abstract class SetColumnFilterPredicate<T extends Comparable<T>> implements FilterPredicate, Serializable {
    private final Column<T> column;
    private final Set<T> values;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java
  }

  public static abstract class UserDefined<T extends Comparable<T>, U extends UserDefinedPredicate<T>> implements FilterPredicate, Serializable {
    protected final Column<T> column;

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftReader.java`
#### Snippet
```java
import org.apache.thrift.protocol.TProtocol;

abstract public class ThriftReader<T> {

  public abstract T readOneRecord(TProtocol protocol) throws TException;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ConvertedField.java`
#### Snippet
```java
  SentinelUnion asSentinelUnion();

  static abstract class ConvertedFieldBase implements ConvertedField {
    private final FieldsPath path;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java
  }

  static abstract class ParentValueContainer {

    /**
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java

    @Override
    final public void addBinary(Binary binaryValue) {
      Descriptors.EnumValueDescriptor protoValue = translateEnumValue(binaryValue);
      parent.add(protoValue);
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java

    @Override
    final public void addBoolean(boolean value) {
      parent.add(value);
    }
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
    }

    abstract protected void startListWrapper();

    abstract protected void endListWrapper();
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
    abstract protected void startListWrapper();

    abstract protected void endListWrapper();

    @Override
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
public abstract class ColumnIndexBuilder {

  static abstract class ColumnIndexBase<C> implements ColumnIndex {
    /*
     * A class containing the value to be compared to the min/max values. This way we only need to do the deboxing once
```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
  private static final boolean IGNORE_NULL_LIST_ELEMENTS_DEFAULT = false;

  final static ParquetProtocol readFieldEnd = new ParquetProtocol("readFieldEnd()") {
    @Override
    public void readFieldEnd() throws TException {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/ParentValueContainer.java`
#### Snippet
```java
 * for converters to add their current value to their parent
 */
abstract public class ParentValueContainer {

  /**
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/MapConverter.java`
#### Snippet
```java

  @Override
  final public void start() {
    buffer.clear();
  }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/MapConverter.java`
#### Snippet
```java

    @Override
    final public void addBinary(Binary value) {
      currentKey = value.toStringUsingUTF8();
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/MapConverter.java`
#### Snippet
```java

    @Override
    final public void start() {
      currentKey = null;
      currentValue = null;
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addBinary(Binary value) {
      parent.add(value.toStringUsingUTF8());
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addBinary(Binary value) {
      int precision = primitiveType.asPrimitiveType().getDecimalMetadata().getPrecision();
      int scale = primitiveType.asPrimitiveType().getDecimalMetadata().getScale();
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addBoolean(boolean value) {
      parent.add(value ? 1 : 0);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void start() {
      buffer.clear();
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

  @Override
  final public void start() {
    currentTuple = TF.newTuple(schemaSize);
    if (elephantBirdCompatible) {
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addLong(long value) {
      parent.add(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addDouble(double value) {
      parent.add(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addBoolean(boolean value) {
      parent.add(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addFloat(float value) {
      parent.add(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addBinary(Binary value) {
      parent.add(new DataByteArray(value.getBytes()));
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addInt(int value) {
      parent.add(value);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

    @Override
    final public void addInt(int value) {
      parent.add(value != 0);
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java
  }

  final public Tuple getCurrentTuple() {
    return currentTuple;
  }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

    @Override
    final public void visit(DoubleType doubleType) {
      throw new IllegalArgumentException("Expected complex type");
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

    @Override
    final public void visit(I16Type i16Type) {
      throw new IllegalArgumentException("Expected complex type");
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

    @Override
    final public void visit(BoolType boolType) {
      throw new IllegalArgumentException("Expected complex type");
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

    @Override
    final public void visit(ByteType byteType) {
      throw new IllegalArgumentException("Expected complex type");
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

    @Override
    final public void visit(I64Type i64Type) {
      throw new IllegalArgumentException("Expected complex type");
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

    @Override
    final public void visit(StringType stringType) {
      throw new IllegalArgumentException("Expected complex type");
    }
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

    @Override
    final public void visit(EnumType enumType) {
      throw new IllegalArgumentException("Expected complex type");
    }
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java
   */
  @Deprecated
  public static abstract class ComplexTypeVisitor implements TypeVisitor {

    @Override
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

    @Override
    final public void visit(I32Type i32Type) {
      throw new IllegalArgumentException("Expected complex type");
    }
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
     * @throws TException if any thrift related error occurs during the reading
     */
    abstract public void consumeElement(
        TProtocol protocol, EventBasedThriftReader reader,
        byte elemType) throws TException;
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class ByteConsumer extends TypedConsumer {
    protected ByteConsumer() { super(BYTE); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
      this.consume(protocol.readString());
    }
    abstract public void consume(String value);
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
abstract public class TypedConsumer {

  abstract public static class DoubleConsumer extends TypedConsumer {
    protected DoubleConsumer() { super(DOUBLE); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
 * receive thrift events of a given type
 */
abstract public class TypedConsumer {

  abstract public static class DoubleConsumer extends TypedConsumer {
```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  final public void read(TProtocol protocol, EventBasedThriftReader reader, byte type) throws TException {
    if (this.type != type) {
      throw new TException(
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class SetConsumer extends TypedConsumer {
    protected SetConsumer() { super(SET); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
      this.consume(protocol.readBool());
    }
    abstract public void consume(boolean value);
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class I64Consumer extends TypedConsumer {
    protected I64Consumer() { super(I64); }
    final void read(TProtocol protocol, EventBasedThriftReader reader) throws TException {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
      this.consume(protocol.readDouble());
    }
    abstract public void consume(double value);
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class ListConsumer extends TypedConsumer {
    protected ListConsumer() { super(LIST); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class I16Consumer extends TypedConsumer {
    protected I16Consumer() { super(I16); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class StructConsumer extends TypedConsumer {
    protected StructConsumer() { super(STRUCT); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
      this.consume(protocol.readI64());
    }
    abstract public void consume(long value);
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class I32Consumer extends TypedConsumer {
    protected I32Consumer() { super(I32); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class StringConsumer extends TypedConsumer {
    protected StringConsumer() { super(STRING); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class BoolConsumer extends TypedConsumer {
    protected BoolConsumer() { super(BOOL); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
  }

  abstract public static class MapConsumer extends TypedConsumer {
    protected MapConsumer() { super(MAP); }
    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
     * @throws TException if any thrift related error occurs during the reading
     */
    abstract public void consumeStruct(TProtocol protocol, EventBasedThriftReader reader) throws TException;
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
      this.consume(protocol.readI16());
    }
    abstract public void consume(short value);
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
     * @throws TException if any thrift related error occurs during the reading
     */
    abstract public void consumeElement(TProtocol protocol, EventBasedThriftReader reader, byte elemType) throws TException;
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
      this.consume(protocol.readByte());
    }
    abstract public void consume(byte value);
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
     * @throws TException if any thrift related error occurs during the reading
     */
    abstract public void consumeEntry(
        TProtocol protocol, EventBasedThriftReader reader,
        byte keyType, byte valueType) throws TException;
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/TypedConsumer.java`
#### Snippet
```java
      this.consume(protocol.readI32());
    }
    abstract public void consume(int value);
  }

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java

  @State(Benchmark)
  public static abstract class BaseContext {
    private static final MessageType SCHEMA = Types.buildMessage()
        .required(INT64).named("int64_col")
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-common/src/main/java/org/apache/parquet/ParquetRuntimeException.java`
#### Snippet
```java
 * The parent class for all runtime exceptions
 */
abstract public class ParquetRuntimeException extends RuntimeException {
  private static final long serialVersionUID = 1L;

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
    abstract public void setSchema(List<SchemaElement> schema);
    abstract public void setNumRows(long numRows);
    abstract public void addRowGroup(RowGroup rowGroup);
    abstract public void addKeyValueMetaData(KeyValue kv);
    abstract public void setCreatedBy(String createdBy);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
    abstract public void setVersion(int version);
    abstract public void setSchema(List<SchemaElement> schema);
    abstract public void setNumRows(long numRows);
    abstract public void addRowGroup(RowGroup rowGroup);
    abstract public void addKeyValueMetaData(KeyValue kv);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
  public static abstract class FileMetaDataConsumer {
    abstract public void setVersion(int version);
    abstract public void setSchema(List<SchemaElement> schema);
    abstract public void setNumRows(long numRows);
    abstract public void addRowGroup(RowGroup rowGroup);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
    abstract public void setNumRows(long numRows);
    abstract public void addRowGroup(RowGroup rowGroup);
    abstract public void addKeyValueMetaData(KeyValue kv);
    abstract public void setCreatedBy(String createdBy);
    abstract public void setEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm);
```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
public class Util {

  private final static int INIT_MEM_ALLOC_ENCR_BUFFER = 100;

  public static void writeColumnIndex(ColumnIndex columnIndex, OutputStream to) throws IOException {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
    abstract public void setCreatedBy(String createdBy);
    abstract public void setEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm);
    abstract public void setFooterSigningKeyMetadata(byte[] footerSigningKeyMetadata);
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
    abstract public void addRowGroup(RowGroup rowGroup);
    abstract public void addKeyValueMetaData(KeyValue kv);
    abstract public void setCreatedBy(String createdBy);
    abstract public void setEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm);
    abstract public void setFooterSigningKeyMetadata(byte[] footerSigningKeyMetadata);
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
   *
   */
  public static abstract class FileMetaDataConsumer {
    abstract public void setVersion(int version);
    abstract public void setSchema(List<SchemaElement> schema);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
    abstract public void addKeyValueMetaData(KeyValue kv);
    abstract public void setCreatedBy(String createdBy);
    abstract public void setEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm);
    abstract public void setFooterSigningKeyMetadata(byte[] footerSigningKeyMetadata);
  }
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
   */
  public static abstract class FileMetaDataConsumer {
    abstract public void setVersion(int version);
    abstract public void setSchema(List<SchemaElement> schema);
    abstract public void setNumRows(long numRows);
```

### MissortedModifiers
Missorted modifiers `final static`
in `parquet-common/src/main/java/org/apache/parquet/glob/GlobExpander.java`
#### Snippet
```java
   * this tree.
   */
  private final static class GlobExpanderImpl implements GlobNode.Visitor<List<String>> {
    private static final GlobExpanderImpl INSTANCE = new GlobExpanderImpl();

```

### MissortedModifiers
Missorted modifiers `final public`
in `parquet-common/src/main/java/org/apache/parquet/hadoop/metadata/Canonicalizer.java`
#### Snippet
```java
   * @return the corresponding canonical value
   */
  final public T canonicalize(T value) {
    T canonical = canonicals.get(value);
    if (canonical == null) {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
   * there is no guarantee of corecteness if ints larger than the max size are written
   */
  abstract public static class BitPackingWriter {
    /**
     * will write the bits to the underlying stream aligned on the buffer size
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
     * @throws IOException if there is an exception while reading
     */
    abstract public int read() throws IOException;
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
   * to read back what has been written with the corresponding  writer
   */
  abstract public static class BitPackingReader {

    /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
     * @throws IOException if there is an exception while finishing
     */
    abstract public void finish() throws IOException;
  }

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
     * @throws IOException if there is an exception while writing
     */
    abstract public void write(int val) throws IOException;

    /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesInput.java`
#### Snippet
```java
 * if the previous has not been consumed.
 */
abstract public class BytesInput {
  private static final Logger LOG = LoggerFactory.getLogger(BytesInput.class);
  private static final EmptyBytesInput EMPTY_BYTES_INPUT = new EmptyBytesInput();
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesInput.java`
#### Snippet
```java
   * @return the size in bytes that would be written
   */
  abstract public long size();

  private static final class BAOS extends ByteArrayOutputStream {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesInput.java`
#### Snippet
```java
   * @throws IOException if there is an exception writing
   */
  abstract public void writeAllTo(OutputStream out) throws IOException;

  /**
```

## RuleId[ruleID=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java

  public void processBlocks() throws IOException {
    while (reader != null) {
      processBlocksFromReader();
      initNextReader();
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void finish() throws IOException {
    while (count != 0) {
      // downside: this aligns on whatever the buffer size is.
      write(0);
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void finish() throws IOException {
    while (count != 0) {
      write(0);
    }
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  @Override
  public void finish() throws IOException {
    while (count != 0) {
      write(0);
    }
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ColumnSizeCommand.java`
#### Snippet
```java
                  "the child columns will be printed out. If no columns are set, all " +
                  "the columns will be printed out.",
    required = false)
  List<String> columns;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java
 * Used to persist the thrift schema
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "id")
@JsonSubTypes({
    @JsonSubTypes.Type(value=ThriftType.BoolType.class, name="BOOL"),
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `parquet-common/src/main/java/org/apache/parquet/io/DelegatingSeekableInputStream.java`
#### Snippet
```java
  static int readHeapBuffer(InputStream f, ByteBuffer buf) throws IOException {
    int bytesRead = f.read(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining());
    if (bytesRead < 0) {
      // if this resulted in EOF, don't update position
      return bytesRead;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/mapred/DeprecatedParquetInputFormat.java`
#### Snippet
```java

  public List<Footer> getFooters(JobConf job) throws IOException {
    return realInputFormat.getFooters(job, asList(super.listStatus(job)));
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `parquet-column/src/main/java/org/apache/parquet/column/values/bytestreamsplit/ByteStreamSplitValuesWriter.java`
#### Snippet
```java
    @Override
    public void writeDouble(double v) {
      super.scatterBytes(BytesUtils.longToBytes(Double.doubleToLongBits(v)));
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `parquet-column/src/main/java/org/apache/parquet/column/values/bytestreamsplit/ByteStreamSplitValuesWriter.java`
#### Snippet
```java
    @Override
    public void writeFloat(float v) {
      super.scatterBytes(BytesUtils.intToBytes(Float.floatToIntBits(v)));
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/TupleSummaryData.java`
#### Snippet
```java

  public void addTuple(Schema schema, Tuple tuple) {
    super.add(tuple);
    int tupleSize = tuple.size();
    size.add(tupleSize);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/FieldSummaryData.java`
#### Snippet
```java

  public void add(Schema schema, Object o) {
    super.add(o);
    if (o == null) {
      ++nullCount;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/MapSummaryData.java`
#### Snippet
```java

  public void add(Schema schema, Map<?, ?> m) {
    super.add(m);
    size.add(m.size());
    FieldSchema field = getField(schema, 0);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/BagSummaryData.java`
#### Snippet
```java

  public void add(Schema schema, DataBag bag) {
    super.add(bag);
    size.add(bag.size());
    FieldSchema field = getField(schema, 0);
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
    java.util.Properties props = udfContext.getUDFProperties(
        this.getClass(), new String[]{signature});
    props.put(key, value);
  }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
  protected Object getFromUDFContext(String key) {
    UDFContext udfContext = UDFContext.getUDFContext();
    return udfContext.getUDFProperties(this.getClass(), new String[]{signature}).get(key);
  }

```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method and all its derivables are empty
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/convert/SimpleGroupConverter.java`
#### Snippet
```java

  @Override
  public void end() {
  }

```

### EmptyMethod
All implementations of this method are empty
in `parquet-common/src/main/java/org/apache/parquet/bytes/ByteBufferAllocator.java`
#### Snippet
```java
   * @param b a ByteBuffer
   */
  void release(ByteBuffer b);

  /**
```

### EmptyMethod
Method only calls its super
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/ColumnChunkMetaData.java`
#### Snippet
```java
  }

  protected void decryptIfNeeded() {
    return;
  }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/ParquetReadOptions.java`
#### Snippet
```java

  public static class Builder {
    protected boolean useSignedStringMinMax = false;
    protected boolean useStatsFilter = STATS_FILTERING_ENABLED_DEFAULT;
    protected boolean useDictionaryFilter = DICTIONARY_FILTERING_ENABLED_DEFAULT;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/ParquetReadOptions.java`
#### Snippet
```java
    protected boolean usePageChecksumVerification = PAGE_VERIFY_CHECKSUM_ENABLED_DEFAULT;
    protected boolean useBloomFilter = BLOOM_FILTER_ENABLED_DEFAULT;
    protected FilterCompat.Filter recordFilter = null;
    protected ParquetMetadataConverter.MetadataFilter metadataFilter = NO_FILTER;
    // the page size parameter isn't used when only using the codec factory to get decompressors
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/ParquetReadOptions.java`
#### Snippet
```java
    protected int maxAllocationSize = ALLOCATION_SIZE_DEFAULT;
    protected Map<String, String> properties = new HashMap<>();
    protected FileDecryptionProperties fileDecryptionProperties = null;

    public Builder useSignedStringMinMax(boolean useSignedStringMinMax) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/InternalFileDecryptor.java`
#### Snippet
```java
  private boolean encryptedFooter;
  private byte[] footerKeyMetaData;
  private boolean fileCryptoMetaDataProcessed = false;
  private BlockCipher.Decryptor aesGcmDecryptorWithFooterKey;
  private BlockCipher.Decryptor aesCtrDecryptorWithFooterKey;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyUnwrapper.java`
#### Snippet
```java
  private final ConcurrentMap<String,byte[]> kekPerKekID;

  private KeyToolkit.KmsClientAndDetails kmsClientAndDetails = null;
  private FileKeyMaterialStore keyMaterialStore = null;
  private boolean checkedKeyMaterialInternalStorage = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyUnwrapper.java`
#### Snippet
```java

  private KeyToolkit.KmsClientAndDetails kmsClientAndDetails = null;
  private FileKeyMaterialStore keyMaterialStore = null;
  private boolean checkedKeyMaterialInternalStorage = false;
  private final Configuration hadoopConfiguration;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/FileKeyUnwrapper.java`
#### Snippet
```java
  private KeyToolkit.KmsClientAndDetails kmsClientAndDetails = null;
  private FileKeyMaterialStore keyMaterialStore = null;
  private boolean checkedKeyMaterialInternalStorage = false;
  private final Configuration hadoopConfiguration;
  private final Path parquetFilePath;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyToolkit.java`
#### Snippet
```java
  public static final int KEK_LENGTH_DEFAULT = 128;

  private static long lastCacheCleanForKeyRotationTime = 0;
  private static Object lastCacheCleanForKeyRotationTimeLock = new Object();
  // KMS servers typically allow to run key rotation once in a few hours / a day.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/DictionaryPageReader.java`
#### Snippet
```java
  private final Map<String, ColumnChunkMetaData> columns;
  private final Map<String, Optional<DictionaryPage>> dictionaryPageCache;
  private ColumnChunkPageReadStore rowGroup = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnChunkPageReadStore.java`
#### Snippet
```java
    private final OffsetIndex offsetIndex;
    private final long rowCount;
    private int pageIndex = 0;
    
    private final BlockCipher.Decryptor blockDecryptor;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    Stats uncStats = new Stats();
    Set<Encoding> encodings = new TreeSet<Encoding>();
    Statistics colValuesStats = null;
    int blocks = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
  private static Map<ColumnDescriptor, ColStats> stats = new LinkedHashMap<ColumnDescriptor, ColStats>();
  private static int blockCount = 0;
  private static long recordCount = 0;

  private static class Stats {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java

  private static Map<ColumnDescriptor, ColStats> stats = new LinkedHashMap<ColumnDescriptor, ColStats>();
  private static int blockCount = 0;
  private static long recordCount = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    Set<Encoding> encodings = new TreeSet<Encoding>();
    Statistics colValuesStats = null;
    int blocks = 0;

    public void add(long valueCount, long size, long uncSize, Collection<Encoding> encodings, Statistics colValuesStats) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
    long total = 0;

    public void add(long  length) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
  private static class HDFSBlocks {
    BlockLocation[] hdfsBlocks;
    int currentStartHdfsBlockIndex = 0;//the hdfs block index corresponding to the start of a row group
    int currentMidPointHDFSBlockIndex = 0;// the hdfs block index corresponding to the mid-point of a row group, a split might be created only when the midpoint of the rowgroup enters a new hdfs block

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
    List<BlockMetaData> rowGroups = new ArrayList<BlockMetaData>();
    BlockLocation hdfsBlock;
    long compressedByteSize = 0L;

    public SplitInfo(BlockLocation currentBlock) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
    BlockLocation[] hdfsBlocks;
    int currentStartHdfsBlockIndex = 0;//the hdfs block index corresponding to the start of a row group
    int currentMidPointHDFSBlockIndex = 0;// the hdfs block index corresponding to the mid-point of a row group, a split might be created only when the midpoint of the rowgroup enters a new hdfs block

    private HDFSBlocks(BlockLocation[] hdfsBlocks) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/InternalParquetRecordWriter.java`
#### Snippet
```java
  private long recordCount = 0;
  private long recordCountForNextMemCheck;
  private long lastRowGroupEndPos = 0;

  private ColumnWriteStore columnStore;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/InternalParquetRecordWriter.java`
#### Snippet
```java
  private boolean closed;

  private long recordCount = 0;
  private long recordCountForNextMemCheck;
  private long lastRowGroupEndPos = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/InternalParquetRecordReader.java`
#### Snippet
```java
  private long startedAssemblingCurrentBlockAt;

  private long totalCountLoadedSoFar = 0;

  private UnmaterializableRecordCounter unmaterializableRecordCounter;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/InternalParquetRecordReader.java`
#### Snippet
```java
  private T currentValue;
  private long total;
  private long current = 0;
  private int currentBlock = -1;
  private ParquetFileReader reader;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/InternalParquetRecordReader.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(InternalParquetRecordReader.class);

  private ColumnIOFactory columnIOFactory = null;
  private final Filter filter;
  private boolean filterRecords = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java
  private long bytesRead = 0L;
  private long bytesWritten = 0L;
  private boolean finishCalled = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java

  private long bytesRead = 0L;
  private long bytesWritten = 0L;
  private boolean finishCalled = false;

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/NonBlockedCompressor.java`
#### Snippet
```java
  private ByteBuffer inputBuffer = ByteBuffer.allocateDirect(0);

  private long bytesRead = 0L;
  private long bytesWritten = 0L;
  private boolean finishCalled = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetWriter.java`
#### Snippet
```java
    private OutputFile file = null;
    private Path path = null;
    private FileEncryptionProperties encryptionProperties = null;
    private Configuration conf = new Configuration();
    private ParquetFileWriter.Mode mode;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetWriter.java`
#### Snippet
```java
   */
  public abstract static class Builder<T, SELF extends Builder<T, SELF>> {
    private OutputFile file = null;
    private Path path = null;
    private FileEncryptionProperties encryptionProperties = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetWriter.java`
#### Snippet
```java
  public abstract static class Builder<T, SELF extends Builder<T, SELF>> {
    private OutputFile file = null;
    private Path path = null;
    private FileEncryptionProperties encryptionProperties = null;
    private Configuration conf = new Configuration();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/mapred/DeprecatedParquetInputFormat.java`
#### Snippet
```java
    private Container<V> valueContainer = null;

    private boolean firstRecord = false;
    private boolean eof = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/mapred/DeprecatedParquetInputFormat.java`
#### Snippet
```java
    private long splitLen; // for getPos()

    private Container<V> valueContainer = null;

    private boolean firstRecord = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/mapred/DeprecatedParquetInputFormat.java`
#### Snippet
```java

    private boolean firstRecord = false;
    private boolean eof = false;

    public RecordReaderWrapper(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/example/ExampleParquetWriter.java`
#### Snippet
```java

  public static class Builder extends ParquetWriter.Builder<Group, Builder> {
    private MessageType type = null;
    private Map<String, String> extraMetaData = new HashMap<String, String>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetReader.java`
#### Snippet
```java
    private final InputFile file;
    private final Path path;
    private Filter filter = null;
    protected Configuration conf;
    private ParquetReadOptions.Builder optionsBuilder;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  private Queue<TransParquetFileReader> inputFiles = new LinkedList<>();
  // Schema of input files (should be the same) and to write to the output file
  private MessageType schema = null;
  // The reader for the current input file
  private TransParquetFileReader reader = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  private List<String> pruneColumns = null;
  private Map<ColumnPath, MaskMode> maskColumns = null;
  private Set<ColumnPath> encryptColumns = null;
  private boolean encryptMode = false;
  private Map<String, String> extraMetaData = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  private ParquetFileWriter writer;
  // Number of blocks written which is used to keep track of the actual row group ordinal
  private int numBlocksRewritten = 0;
  // Reader and relevant states of the in-processing input file
  private Queue<TransParquetFileReader> inputFiles = new LinkedList<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  private Map<ColumnPath, MaskMode> maskColumns = null;
  private Set<ColumnPath> encryptColumns = null;
  private boolean encryptMode = false;
  private Map<String, String> extraMetaData = new HashMap<>();
  // Writer to rewrite the input files
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  private TransParquetFileReader reader = null;
  // The metadata of current reader being processed
  private ParquetMetadata meta = null;
  // created_by information of current reader being processed
  private String originalCreatedBy = "";
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  private MessageType schema = null;
  // The reader for the current input file
  private TransParquetFileReader reader = null;
  // The metadata of current reader being processed
  private ParquetMetadata meta = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  private CompressionCodecName newCodecName = null;
  private List<String> pruneColumns = null;
  private Map<ColumnPath, MaskMode> maskColumns = null;
  private Set<ColumnPath> encryptColumns = null;
  private boolean encryptMode = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  // Configurations for the new file
  private CompressionCodecName newCodecName = null;
  private List<String> pruneColumns = null;
  private Map<ColumnPath, MaskMode> maskColumns = null;
  private Set<ColumnPath> encryptColumns = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
  private final byte[] pageBuffer = new byte[pageBufferSize];
  // Configurations for the new file
  private CompressionCodecName newCodecName = null;
  private List<String> pruneColumns = null;
  private Map<ColumnPath, MaskMode> maskColumns = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java

  private int currentBlock = 0;
  private ColumnChunkPageReadStore currentRowGroup = null;
  private DictionaryPageReader nextDictionaryReader = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  private ParquetMetadata footer;

  private int currentBlock = 0;
  private ColumnChunkPageReadStore currentRowGroup = null;
  private DictionaryPageReader nextDictionaryReader = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  private int currentBlock = 0;
  private ColumnChunkPageReadStore currentRowGroup = null;
  private DictionaryPageReader nextDictionaryReader = null;

  private InternalFileDecryptor fileDecryptor = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  private DictionaryPageReader nextDictionaryReader = null;

  private InternalFileDecryptor fileDecryptor = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/Main.java`
#### Snippet
```java
  @Parameter(names = {"-v", "--verbose", "--debug"},
      description = "Print extra debugging information")
  private boolean debug = false;

  @VisibleForTesting
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/AvroCSVReader.java`
#### Snippet
```java
  private final CSVReader reader;
  private final RecordBuilder<E> builder;
  private boolean hasNext = false;
  private String[] next = null;
  private E record = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/AvroCSVReader.java`
#### Snippet
```java
  private boolean hasNext = false;
  private String[] next = null;
  private E record = null;

  public AvroCSVReader(InputStream stream, CSVProperties props,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/AvroCSVReader.java`
#### Snippet
```java
  private final RecordBuilder<E> builder;
  private boolean hasNext = false;
  private String[] next = null;
  private E record = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/CSVProperties.java`
#### Snippet
```java
    private boolean useHeader = Boolean.valueOf(DEFAULT_HAS_HEADER);
    private int linesToSkip = DEFAULT_LINES_TO_SKIP;
    private String header = null;

    private static String unescapeJava(String str) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCSVCommand.java`
#### Snippet
```java

  @Parameter(names="--skip-lines", description="Lines to skip before CSV start")
  int linesToSkip = 0;

  @Parameter(names="--charset", description="Character set name", hidden = true)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCSVCommand.java`
#### Snippet
```java
      description="Output file path",
      required=true)
  String outputPath = null;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCSVCommand.java`
#### Snippet
```java

  @Parameter(names="--no-header", description="Don't use first line as CSV header")
  boolean noHeader = false;

  @Parameter(names="--skip-lines", description="Lines to skip before CSV start")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCSVCommand.java`
#### Snippet
```java
      description="Use Parquet format version 2",
      hidden = true)
  boolean v2 = false;

  @Parameter(names="--delimiter", description="Delimiter character")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCSVCommand.java`
#### Snippet
```java
      names={"--overwrite"},
      description="Remove any data already in the target view or dataset")
  boolean overwrite = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java
  protected final Logger console;

  private Configuration conf = null;
  private LocalFileSystem localFS = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java
          public Iterator<D> iterator() {
            return new Iterator<D>() {
              private boolean hasNext = false;
              private D next = advance();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/BaseCommand.java`
#### Snippet
```java

  private Configuration conf = null;
  private LocalFileSystem localFS = null;

  public BaseCommand(Logger console) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ToAvroCommand.java`
#### Snippet
```java
      names={"--overwrite"},
      description="Overwrite the output file if it exists")
  boolean overwrite = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ToAvroCommand.java`
#### Snippet
```java
      description="Output file path",
      required=true)
  String outputPath = null;

  @Parameter(names = {"-s", "--schema"},
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowFooterCommand.java`
#### Snippet
```java

  @Parameter(names = { "-r", "--raw" }, description = "Print the raw thrift object of the footer")
  boolean raw = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java

  // set when end is called
  private ParquetMetadata footer = null;

  private final CRC32 crc;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCommand.java`
#### Snippet
```java
      description="Use Parquet format version 2",
      hidden = true)
  boolean v2 = false;

  @Parameter(names="--row-group-size", description="Target row group size")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCommand.java`
#### Snippet
```java
      names={"--overwrite"},
      description="Overwrite the output file if it exists")
  boolean overwrite = false;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ConvertCommand.java`
#### Snippet
```java
      description="Output file path",
      required=true)
  String outputPath = null;

  @Parameter(names = {"-s", "--schema"},
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/SchemaCommand.java`
#### Snippet
```java
      description="Print a Parquet schema, without converting to Avro",
      hidden=true)
  boolean parquetSchema = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/SchemaCommand.java`
#### Snippet
```java
      names={"-o", "--output"},
      description="Output file path")
  String outputPath = null;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/SchemaCommand.java`
#### Snippet
```java
      names={"--overwrite"},
      description="Overwrite the output file if it exists")
  boolean overwrite = false;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CSVSchemaCommand.java`
#### Snippet
```java
  @Parameter(names="--minimize",
      description="Minimize schema file size by eliminating white space")
  boolean minimize=false;

  @Parameter(names="--delimiter", description="Delimiter character")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CSVSchemaCommand.java`
#### Snippet
```java

  @Parameter(names={"-o", "--output"}, description="Save schema avsc to path")
  String outputPath = null;

  @Parameter(names={"--class", "--record-name"}, required = true,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CSVSchemaCommand.java`
#### Snippet
```java
  @Parameter(names={"--class", "--record-name"}, required = true,
      description="A name or class for the result schema")
  String recordName = null;

  @Parameter(names="--minimize",
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CSVSchemaCommand.java`
#### Snippet
```java

  @Parameter(names="--skip-lines", description="Lines to skip before CSV start")
  int linesToSkip = 0;

  @Parameter(names="--charset", description="Character set name", hidden = true)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CSVSchemaCommand.java`
#### Snippet
```java

  @Parameter(names="--no-header", description="Don't use first line as CSV header")
  boolean noHeader = false;

  @Parameter(names="--skip-lines", description="Lines to skip before CSV start")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetReader.java`
#### Snippet
```java
  public static class Builder<T> extends ParquetReader.Builder<T> {

    private GenericData model = null;
    private boolean enableCompatibility = true;
    private boolean isReflect = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetWriter.java`
#### Snippet
```java

  public static class Builder<T> extends ParquetWriter.Builder<T, Builder<T>> {
    private Schema schema = null;
    private GenericData model = SpecificData.get();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroConverters.java`
#### Snippet
```java

  abstract static class BinaryConverter<T> extends AvroPrimitiveConverter {
    private T[] dict = null;

    public BinaryConverter(ParentValueContainer parent) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroReadSupport.java`
#### Snippet
```java
  }

  private GenericData model = null;

  public AvroReadSupport() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/io/FilteredRecordReader.java`
#### Snippet
```java
  private final RecordFilter recordFilter;
  private final long recordCount;
  private long recordsRead = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroIndexedRecordConverter.java`
#### Snippet
```java
    private final ParentValueContainer parent;
    private final Converter[] memberConverters;
    private Object memberValue = null;

    public AvroUnionConverter(ParentValueContainer parent, Type parquetSchema,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/io/GroupColumnIO.java`
#### Snippet
```java
  private final Map<String, ColumnIO> childrenByName = new HashMap<>();
  private final List<ColumnIO> children = new ArrayList<>();
  private int childrenSize = 0;

  GroupColumnIO(GroupType groupType, GroupColumnIO parent, int index) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/io/RecordConsumerLoggingWrapper.java`
#### Snippet
```java
    private final RecordConsumer delegate;

    int indent = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/EncodingStats.java`
#### Snippet
```java
    private final Map<Encoding, AtomicInteger> dictStats = new LinkedHashMap<>();
    private final Map<Encoding, AtomicInteger> dataStats = new LinkedHashMap<>();
    private boolean usesV2Pages = false;

    public Builder clear() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-column/src/main/java/org/apache/parquet/io/RecordReaderImplementation.java`
#### Snippet
```java
  private ColumnReader[] columnReaders;

  private boolean shouldSkipCurrentRecord = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java

  protected T currentRecord = null;
  private ParentValueContainer rootContainer = null;
  private final Converter[] converters;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java
  static final class AvroUnionConverter extends AvroConverters.AvroGroupConverter {
    private final Converter[] memberConverters;
    private Object memberValue = null;

    public AvroUnionConverter(ParentValueContainer parent, Type parquetSchema,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroRecordConverter.java`
#### Snippet
```java
  private static final String JAVA_KEY_CLASS_PROP = "java-key-class";

  protected T currentRecord = null;
  private ParentValueContainer rootContainer = null;
  private final Converter[] converters;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/io/MessageColumnIO.java`
#### Snippet
```java
  private class MessageColumnIORecordConsumer extends RecordConsumer {
    private ColumnIO currentColumnIO;
    private int currentLevel = 0;

    private class FieldsMarker {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/MinMax.java`
#### Snippet
```java
 */
public final class MinMax<T> {
  private T min = null;
  private T max = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/MinMax.java`
#### Snippet
```java
public final class MinMax<T> {
  private T min = null;
  private T max = null;

  public MinMax(PrimitiveComparator<T> comparator, Iterable<T> iterable) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriterBase.java`
#### Snippet
```java

  private Statistics<?> statistics;
  private long rowsWrittenSoFar = 0;
  private int pageRowCount;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java

  private long endOfPageValueCount;
  private long readValues = 0;
  private int pageValueCount = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  private long endOfPageValueCount;
  private long readValues = 0;
  private int pageValueCount = 0;

  private final PrimitiveConverter converter;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriterForLong.java`
#### Snippet
```java
   * cache previous written value for calculating delta
   */
  private long previousValue = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriterForLong.java`
#### Snippet
```java
   * firstValue is written to the header of the page
   */
  private long firstValue = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriterForInteger.java`
#### Snippet
```java
   * firstValue is written to the header of the page
   */
  private int firstValue = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriterForInteger.java`
#### Snippet
```java
   * cache previous written value for calculating delta
   */
  private int previousValue = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriter.java`
#### Snippet
```java
   * it will be reset after each flush
   */
  protected int deltaValuesToFlush = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/delta/DeltaBinaryPackingValuesWriter.java`
#### Snippet
```java
  protected final int[] bitWidths;

  protected int totalValueCount = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/fallback/FallbackValuesWriter.java`
#### Snippet
```java
  public final F fallBackWriter;

  private boolean fellBackAlready = false;

  /** writer currently written to */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/fallback/FallbackValuesWriter.java`
#### Snippet
```java
  private ValuesWriter currentWriter;

  private boolean initialUsedAndHadDictionary = false;

  /* size of raw data, even if dictionary is used, it will not have effect on raw data size, it is used to decide
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/fallback/FallbackValuesWriter.java`
#### Snippet
```java
   * It's also used in getBufferedSize, so the page will be written based on raw data size
   */
  private long rawDataByteSize = 0;

  /** indicates if this is the first page being processed */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainDoubleDictionary extends PlainValuesDictionary {

    private double[] doubleDictionaryContent = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainLongDictionary extends PlainValuesDictionary {

    private long[] longDictionaryContent = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainIntegerDictionary extends PlainValuesDictionary {

    private int[] intDictionaryContent = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainBinaryDictionary extends PlainValuesDictionary {

    private Binary[] binaryDictionaryContent = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/column/values/dictionary/PlainValuesDictionary.java`
#### Snippet
```java
  public static class PlainFloatDictionary extends PlainValuesDictionary {

    private float[] floatDictionaryContent = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/filter/PagedRecordFilter.java`
#### Snippet
```java
  private final long startPos;
  private final long endPos;
  private long currentPos = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-column/src/main/java/org/apache/parquet/schema/MessageTypeParser.java`
#### Snippet
```java
    private StringTokenizer st;

    private int line = 0;
    private StringBuilder currentLine = new StringBuilder();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java

    private boolean result = false;
    private boolean isKnown = false;

    // these methods signal what the value is
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicate.java`
#### Snippet
```java
    ValueInspector() { }

    private boolean result = false;
    private boolean isKnown = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicateBuilderBase.java`
#### Snippet
```java
 */
public abstract class IncrementallyUpdatedFilterPredicateBuilderBase implements Visitor<IncrementallyUpdatedFilterPredicate> {
  private boolean built = false;
  private final Map<ColumnPath, List<ValueInspector>> valueInspectorsByColumn = new HashMap<>();
  private final Map<ColumnPath, PrimitiveComparator<?>> comparatorsByColumn = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
    protected Type.Repetition repetition = null;
    protected LogicalTypeAnnotation logicalTypeAnnotation = null;
    protected Type.ID id = null;
    private boolean repetitionAlreadySet = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java

    protected Type.Repetition repetition = null;
    protected LogicalTypeAnnotation logicalTypeAnnotation = null;
    protected Type.ID id = null;
    private boolean repetitionAlreadySet = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
    protected final Class<? extends P> returnClass;

    protected Type.Repetition repetition = null;
    protected LogicalTypeAnnotation logicalTypeAnnotation = null;
    protected Type.ID id = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
  public abstract static class BaseListBuilder<P, THIS extends BaseListBuilder<P, THIS>>
      extends Builder<THIS, P> {
    private Type elementType = null;
    private P parent;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
    }

    private Type keyType = null;
    private Type valueType = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java

    private Type keyType = null;
    private Type valueType = null;

    public BaseMapBuilder(P parent) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
    protected LogicalTypeAnnotation logicalTypeAnnotation = null;
    protected Type.ID id = null;
    private boolean repetitionAlreadySet = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoParquetWriter.java`
#### Snippet
```java
	}
	public static class Builder<T> extends ParquetWriter.Builder<T, Builder<T>> {
		Class<? extends Message> protoMessage = null;

		private Builder(Path file) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoWriteSupport.java`
#### Snippet
```java
  public static final String PB_SPECS_COMPLIANT_WRITE = "parquet.proto.writeSpecsCompliant";

  private boolean writeSpecsCompliant = false;
  private RecordConsumer recordConsumer;
  private Class<? extends Message> protoMessage;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/KeepOnlyFirstPrimitiveFilter.java`
#### Snippet
```java
 */
class KeepOnlyFirstPrimitiveFilter implements FieldProjectionFilter {
  private boolean found = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
      this.elementContent = listContent.getChild(0);
      this.contentProtocol = getProtocol(values, elementContent, new Events() {
        int consumedRecords = 0;
        @Override
        public void start() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
      this.listContent = columnIO.getChild(0);
      this.contentProtocol = getProtocol(values, listContent, new Events() {
        int consumedRecords = 0;
        @Override
        public void start() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityChecker.java`
#### Snippet
```java
class CompatibilityReport {
  boolean isCompatible = true;
  boolean hasEmptyStruct = false;
  List<String> messages = new ArrayList<String>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/deprecated/PathGlobPattern.java`
#### Snippet
```java
  private static final char PATH_SEPARATOR = '/';
  private Pattern compiled;
  private boolean hasWildcard = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
  private ParquetInputFormat<Tuple> parquetInputFormat;
  private Schema schema;
  private RequiredFieldList requiredFieldList = null;
  protected String signature;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java

  private String location;
  private boolean setLocationHasBeenCalled = false;
  private RecordReader<Void, Tuple> reader;
  private ParquetInputFormat<Tuple> parquetInputFormat;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
  private GroupConverter structConverter;
  private List<TProtocol> rootEvents = new ArrayList<TProtocol>();
  private boolean missingRequiredFieldsInProjection = false;
  private boolean ignoreNullElements = IGNORE_NULL_LIST_ELEMENTS_DEFAULT;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
  abstract class CollectionConverter extends GroupConverter {

    private ElementConverter elementConverter = null;
    private final Converter child;
    private final Counter childCounter;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/deprecated/DeprecatedFieldProjectionFilter.java`
#### Snippet
```java
  private static class PathGlobPatternStatus {
    PathGlobPattern pattern;
    boolean hasMatchingPath = false;

    PathGlobPatternStatus(String pattern) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

  public static class StringType extends ThriftType {
    private boolean binary = false;

    @JsonCreator
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-common/src/main/java/org/apache/parquet/util/DynMethods.java`
#### Snippet
```java
    private final String name;
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private UnboundMethod method = null;

    public Builder(String methodName) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-common/src/main/java/org/apache/parquet/bytes/CapacityByteArrayOutputStream.java`
#### Snippet
```java
  private int currentSlabIndex;
  private int bytesAllocated = 0;
  private int bytesUsed = 0;
  private ByteBufferAllocator allocator;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-common/src/main/java/org/apache/parquet/bytes/CapacityByteArrayOutputStream.java`
#### Snippet
```java
  private ByteBuffer currentSlab;
  private int currentSlabIndex;
  private int bytesAllocated = 0;
  private int bytesUsed = 0;
  private ByteBufferAllocator allocator;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-common/src/main/java/org/apache/parquet/bytes/MultiBufferInputStream.java`
#### Snippet
```java
  private Iterator<ByteBuffer> iterator;
  private ByteBuffer current = EMPTY;
  private long position = 0;

  private long mark = -1;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-common/src/main/java/org/apache/parquet/bytes/MultiBufferInputStream.java`
#### Snippet
```java

  private long mark = -1;
  private long markLimit = 0;
  private List<ByteBuffer> markBuffers = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-common/src/main/java/org/apache/parquet/bytes/ConcatenatingByteArrayCollector.java`
#### Snippet
```java
public class ConcatenatingByteArrayCollector extends BytesInput {
  private final List<byte[]> slabs = new ArrayList<byte[]>();
  private long size = 0;

  public void collect(BytesInput bytesInput) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parquet-common/src/main/java/org/apache/parquet/util/DynConstructors.java`
#### Snippet
```java
    private final Class<?> baseClass;
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private Ctor ctor = null;
    private Map<String, Throwable> problems = new HashMap<String, Throwable>();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private final long valueCount;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  public FourBitPackingWriter(OutputStream out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  public OneBitPackingReader(InputStream in) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private OutputStream out;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  private long totalRead = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private long buffer = 0;
  private int count = 0;

  public FiveBitPackingWriter(OutputStream out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private long buffer = 0;
  private int count = 0;
  private long totalRead = 0;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  public SixBitPackingWriter(OutputStream out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private long buffer = 0;
  private int count = 0;

  public SevenBitPackingWriter(OutputStream out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  public ThreeBitPackingWriter(OutputStream out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  public FourBitPackingReader(InputStream in) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private OutputStream out;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  public OneBitPackingWriter(OutputStream out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private int count = 0;

  private long totalRead = 0;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private long buffer = 0;
  private int count = 0;
  private long totalRead = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private final long valueCount;

  private long buffer = 0;
  private int count = 0;
  private long totalRead = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private int count = 0;

  private long totalRead = 0;

  public ThreeBitPackingReader(InputStream in, long valueCount) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private long buffer = 0;
  private int count = 0;
  private long totalRead = 0;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private OutputStream out;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private long buffer = 0;
  private int count = 0;
  private long totalRead = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private final InputStream in;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  public TwoBitPackingReader(InputStream in) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private OutputStream out;

  private long buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private final InputStream in;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private final long valueCount;

  private long buffer = 0;
  private int count = 0;
  private long totalRead = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private OutputStream out;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  private long totalRead = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private final long valueCount;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private OutputStream out;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private final InputStream in;

  private int buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java
  private OutputStream out;

  private long buffer = 0;
  private int count = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BitPacking.java`
#### Snippet
```java

  private int buffer = 0;
  private int count = 0;

  public TwoBitPackingWriter(OutputStream out) {
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Writable`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputSplit.java`
#### Snippet
```java
@Private
@Deprecated
public class ParquetInputSplit extends FileSplit implements Writable {


```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `FrontendExceptionWrapper` does not end with 'Exception'
in `parquet-pig/src/main/java/org/apache/parquet/pig/PigSchemaConverter.java`
#### Snippet
```java
   * Wrap the FrontendException inside the visitor in an inner catch block, and rethrow it outside of the visitor
   */
  private static final class FrontendExceptionWrapper extends RuntimeException {
    final FrontendException frontendException;

```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
    } catch (RuntimeException e) {
      if (CorruptDeltaByteArrays.requiresSequentialReads(writerVersion, currentEncoding) &&
          e instanceof ArrayIndexOutOfBoundsException) {
        // this is probably PARQUET-246, which may happen if reading data with
        // MR because this can't be detected without reading all footers
```

## RuleId[ruleID=ArrayEquality]
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
    if (array1 == null || array2 == null) return false;
    if (length1 != length2) return false;
    if (array1 == array2 && offset1 == offset2) return true;
    for (int i = 0; i < length1; i++) {
      if (array1[i + offset1] != array2[i + offset2]) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java

  private static ColumnPath getPath(ColumnMetaData metaData) {
    String[] path = metaData.path_in_schema.toArray(new String[0]);
    return ColumnPath.get(path);
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
    String fieldName = field.getName();
    currentPath.add(fieldName);
    ColumnPath path = ColumnPath.get(currentPath.toArray(new String[0]));
    Type prunedField = null;
    if (!prunePaths.contains(path)) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/RecordBuilder.java`
#### Snippet
```java

    // initialize the index and field arrays
    fields = schema.getFields().toArray(new Schema.Field[0]);
    indexes = new int[fields.length];

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/GetClassLoader.java`
#### Snippet
```java

  public GetClassLoader(List<URL> urls) {
    this.urls = urls.toArray(new URL[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputSplit.java`
#### Snippet
```java
   */
  public ParquetInputSplit() {
        super(null, 0, 0, new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/io/PrimitiveColumnIO.java`
#### Snippet
```java
        getRepetitionLevel(),
        getDefinitionLevel());
    this.path = path.toArray(new ColumnIO[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroWriteSupport.java`
#### Snippet
```java
          // find the null element and throw a better error message
          final int idx =
              Arrays.asList(array.toArray(new Object[0])).indexOf(null);
          if (idx < 0) {
            // no element was null, throw the original exception
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/io/RecordReaderImplementation.java`
#### Snippet
```java
    this.recordMaterializer = recordMaterializer;
    this.recordRootConverter = recordMaterializer.getRootConverter(); // TODO: validator(wrap(recordMaterializer), validating, root.getType());
    PrimitiveColumnIO[] leaves = root.getLeaves().toArray(new PrimitiveColumnIO[0]);
    columnReaders = new ColumnReader[leaves.length];
    int[][] nextColumnIdxForRepLevel = new int[leaves.length][];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/io/MessageColumnIO.java`
#### Snippet
```java

  void setLevels() {
    setLevels(0, 0, new String[0], new int[0], Arrays.<ColumnIO>asList(this), Arrays.<ColumnIO>asList(this));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/io/MessageColumnIO.java`
#### Snippet
```java

  void setLevels() {
    setLevels(0, 0, new String[0], new int[0], Arrays.<ColumnIO>asList(this), Arrays.<ColumnIO>asList(this));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java

    private void readObjectNoData() throws ObjectStreamException {
      this.value = ByteBuffer.wrap(new byte[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/column/values/deltastrings/DeltaByteArrayWriter.java`
#### Snippet
```java
    prefixLengthWriter.reset();
    suffixWriter.reset();
    previous = new byte[0];
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/column/values/deltastrings/DeltaByteArrayWriter.java`
#### Snippet
```java
        new DeltaBinaryPackingValuesWriterForInteger(128, 4, initialCapacity, pageSize, allocator);
    this.suffixWriter = new DeltaLengthByteArrayValuesWriter(initialCapacity, pageSize, allocator);
    this.previous = new byte[0];
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/column/values/deltastrings/DeltaByteArrayReader.java`
#### Snippet
```java
    this.prefixLengthReader = new DeltaBinaryPackingValuesReader();
    this.suffixReader = new DeltaLengthByteArrayValuesReader();
    this.previous = Binary.fromConstantByteArray(new byte[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroSchemaConverter.java`
#### Snippet
```java
    this.writeParquetUUID = conf.getBoolean(WRITE_PARQUET_UUID, WRITE_PARQUET_UUID_DEFAULT);
    this.readInt96AsFixed = conf.getBoolean(READ_INT96_AS_FIXED, READ_INT96_AS_FIXED_DEFAULT);
    this.pathsToInt96 = new HashSet<>(Arrays.asList(conf.getStrings(WRITE_FIXED_AS_INT96, new String[0])));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/FilteringGroupConverter.java`
#### Snippet
```java
  private ValueInspector[] getValueInspectors(ColumnPath columnPath) {
    List<ValueInspector> inspectorsList = valueInspectorsByColumn.get(columnPath);
    return inspectorsList == null ? new ValueInspector[0]
        : inspectorsList.toArray(new ValueInspector[0]);
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/FilteringGroupConverter.java`
#### Snippet
```java
    List<ValueInspector> inspectorsList = valueInspectorsByColumn.get(columnPath);
    return inspectorsList == null ? new ValueInspector[0]
        : inspectorsList.toArray(new ValueInspector[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BinaryColumnIndexBuilder.java`
#### Snippet
```java
  ColumnIndexBase<Binary> createColumnIndex(PrimitiveType type) {
    BinaryColumnIndex columnIndex = new BinaryColumnIndex(type);
    columnIndex.minValues = minValues.toArray(new Binary[0]);
    columnIndex.maxValues = maxValues.toArray(new Binary[0]);
    return columnIndex;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/BinaryColumnIndexBuilder.java`
#### Snippet
```java
    BinaryColumnIndex columnIndex = new BinaryColumnIndex(type);
    columnIndex.minValues = minValues.toArray(new Binary[0]);
    columnIndex.maxValues = maxValues.toArray(new Binary[0]);
    return columnIndex;
  }
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `strings(args)`, unclear if a varargs or non-varargs call is desired
in `parquet-common/src/main/java/org/apache/parquet/Preconditions.java`
#### Snippet
```java
    if (!isValid) {
      throw new IllegalArgumentException(
          String.format(String.valueOf(message), strings(args)));
    }
  }
```

### NullArgumentToVariableArgMethod
Confusing argument `strings(args)`, unclear if a varargs or non-varargs call is desired
in `parquet-common/src/main/java/org/apache/parquet/Preconditions.java`
#### Snippet
```java
    if (!isValid) {
      throw new IllegalStateException(
          String.format(String.valueOf(message), strings(args)));
    }
  }
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriterBase.java`
#### Snippet
```java
    // If user specify the column NDV, we construct Bloom filter from it.
    if (ndv.isPresent()) {
      int optimalNumOfBits = BlockSplitBloomFilter.optimalNumOfBits(ndv.getAsLong(), fpp.getAsDouble());
      this.bloomFilter = new BlockSplitBloomFilter(optimalNumOfBits / 8, maxBloomFilterSize);
    } else {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Result of `missingStatuses.size()` is always '0'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
    Set<FileStatus> missingStatuses = new HashSet<FileStatus>();
    Map<Path, FileStatusWrapper> missingStatusesMap =
            new HashMap<Path, FileStatusWrapper>(missingStatuses.size());

    if (footersCache == null) {
```

### ConstantValue
Value `invalid` is always 'true'
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
    if (preStartIndex == 0 && startIndex != 4) {
      invalid = true;
      return invalid;
    }

```

### ConstantValue
Value `DEFAULT_IS_DICTIONARY_ENABLED` is always 'true'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetWriter.java`
#### Snippet
```java
        DEFAULT_PAGE_SIZE,
        DEFAULT_PAGE_SIZE,
        DEFAULT_IS_DICTIONARY_ENABLED,
        DEFAULT_IS_VALIDATING_ENABLED,
        DEFAULT_WRITER_VERSION,
```

### ConstantValue
Value `DEFAULT_IS_DICTIONARY_ENABLED` is always 'true'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetWriter.java`
#### Snippet
```java
  public ParquetWriter(Path file, WriteSupport<T> writeSupport, CompressionCodecName compressionCodecName, int blockSize, int pageSize) throws IOException {
    this(file, writeSupport, compressionCodecName, blockSize, pageSize,
        DEFAULT_IS_DICTIONARY_ENABLED, DEFAULT_IS_VALIDATING_ENABLED);
  }

```

### ConstantValue
Condition `colEncrSetup != null` is always `true`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java

      this.fileAAD = fileEncryptor.getFileAAD();
      if (colEncrSetup != null && colEncrSetup.isEncrypted()) {
        this.dataPageHeaderAAD = createAAD(ModuleType.DataPageHeader, blockId, columnId);
        this.dataPageAAD = createAAD(ModuleType.DataPage, blockId, columnId);
```

### ConstantValue
Condition `dictionaryPage != null` is always `false`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
      switch (pageHeader.type) {
        case DICTIONARY_PAGE:
          if (dictionaryPage != null) {
            throw new IOException("has more than one dictionary page in column chunk");
          }
```

### ConstantValue
Value `skipRowGroups` is always 'true'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
      // reading the summary file that does not contain the row groups
      LOG.info("reading summary file: {}", commonMetaDataFile);
      return readFooter(configuration, commonMetaDataFile, filter(skipRowGroups));
    } else if (fileSystem.exists(metadataFile)) {
      LOG.info("reading summary file: {}", metadataFile);
```

### ConstantValue
Value `threw` is always 'false'
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ScanCommand.java`
#### Snippet
```java
    } finally {
      if (reader instanceof Closeable) {
        Closeables.close((Closeable) reader, threw);
      }
    }
```

### ConstantValue
Condition `targets.size() > 1` is always `false`
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/SchemaCommand.java`
#### Snippet
```java
        "Parquet file is required.");

    if (targets.size() > 1) {
      Preconditions.checkArgument(outputPath == null,
          "Cannot output multiple schemas to file " + outputPath);
```

### ConstantValue
Condition `last != null` is always `true`
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Expressions.java`
#### Snippet
```java
          Preconditions.checkState(valueStart != i, "Empty reference: ''");
          PathExpr current = PathExpr.deref(path.substring(valueStart, i));
          if (last != null) {
            last.children.add(current);
          } else {
```

### ConstantValue
Condition `")".equals(t)` is always `false`
in `parquet-column/src/main/java/org/apache/parquet/schema/MessageTypeParser.java`
#### Snippet
```java
        if ("(".equals(t)) {
          while (!")".equals(t)) {
            if (!(",".equals(t) || "(".equals(t) || ")".equals(t))) {
              tokens.add(t);
            }
```

### ConstantValue
Condition `other == null` is always `false` when reached
in `parquet-column/src/main/java/org/apache/parquet/schema/Type.java`
#### Snippet
```java
  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Type) || other == null) {
      return false;
    }
```

### ConstantValue
Value `keepOneOfEachUnion` is always 'true'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftSchemaConvertVisitor.java`
#### Snippet
```java
        // the first primitive it encounters
        ConvertedField firstPrimitive = child.getType().accept(
            new ThriftSchemaConvertVisitor(new KeepOnlyFirstPrimitiveFilter(), true, keepOneOfEachUnion), childState);

        convertedChildren.add(firstPrimitive.asKeep().getType().withId(child.getFieldId()));
```

### ConstantValue
Condition `schema == null` is always `true`
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
      return;
    }
    if (schema == null && requestedSchema != null) {
      // this is only true in front-end
      schema = requestedSchema;
```

### ConstantValue
Condition `filterDescStr == null` is always `false`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/deprecated/DeprecatedFieldProjectionFilter.java`
#### Snippet
```java
    filterPatterns = new LinkedList<PathGlobPatternStatus>();

    if (filterDescStr == null || filterDescStr.isEmpty())
      return;

```

### ConstantValue
Condition `LEVEL.intValue() <= Level.INFO.intValue()` is always `true`
in `parquet-common/src/main/java/org/apache/parquet/Log.java`
#### Snippet
```java

  public static final boolean DEBUG = (LEVEL.intValue() <= Level.FINE.intValue());
  public static final boolean INFO = (LEVEL.intValue() <= Level.INFO.intValue());
  public static final boolean WARN = (LEVEL.intValue() <= Level.WARNING.intValue());
  public static final boolean ERROR = (LEVEL.intValue() <= Level.SEVERE.intValue());
```

### ConstantValue
Value `skipRowGroups` is always 'true'
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
    FileMetaData md = new FileMetaData();
    if (skipRowGroups) {
      readFileMetaData(from, new DefaultFileMetaDataConsumer(md), skipRowGroups, decryptor, AAD);
    } else {
      read(from, md, decryptor, AAD);
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
          columnList.append("[");
          for (String[] columnPath : schema.getPaths()) {
            columnList.append(ColumnPath.get(columnPath).toDotString() + "], [");
          }
          throw new ParquetCryptoRuntimeException("Encrypted column [" + entry.getKey().toDotString() +
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/ValidTypeMap.java`
#### Snippet
```java
          .append(supportedTypes);
      } else {
        message.append(" There are no supported types for columns of " + primitiveType);
      }
      throw new IllegalArgumentException(message.toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
        .append(primitive.name().toLowerCase());
    if (primitive == PrimitiveTypeName.FIXED_LEN_BYTE_ARRAY) {
      sb.append("(" + length + ")");
    }
    sb.append(" ").append(getName());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
    final String bufferDataType = useByteArray ? "byte[]" : "ByteBuffer";
    
    fw.append("    public final void unpack" + (batch * 8) + "Values(final " + bufferDataType + " in, "
        + "final int inPos, final " + variableType + "[] out, final int outPos) {\n");

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
      String maskSuffix = isLong ? "L" : "";
      for (int valueIndex = 0; valueIndex < (batch * 8); ++valueIndex) {
        fw.append("      out[" + align(valueIndex, 2) + " + outPos] =\n");

        int startIndex = valueIndex * bitWidth / 8;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java

          // Shift the wanted bits to the least significant position and mask them knowing how many bits to get.
          fw.append(" ((((" + variableType + ")" + byteAccess + ") " + shiftString +
              ") & " + shiftMask.mask + maskSuffix + ")");
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
      fw.append(" *\n");
      fw.append(" */\n");
      fw.append("public abstract class " + className + " {\n");
      fw.append("\n");
      fw.append("  private static final BytePacker" + nameSuffix + "[] packers = new BytePacker" + nameSuffix + "[" + (maxBits + 1) + "];\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
      fw.append("public abstract class " + className + " {\n");
      fw.append("\n");
      fw.append("  private static final BytePacker" + nameSuffix + "[] packers = new BytePacker" + nameSuffix + "[" + (maxBits + 1) + "];\n");
      fw.append("  static {\n");
      for (int i = 0; i <= maxBits; i++) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
      fw.append("  static {\n");
      for (int i = 0; i <= maxBits; i++) {
        fw.append("    packers[" + i + "] = new Packer" + i + "();\n");
      }
      fw.append("  }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
      fw.append("  }\n");
      fw.append("\n");
      fw.append("  public static final BytePacker" + nameSuffix + "Factory factory = new BytePacker" + nameSuffix + "Factory() {\n");
      fw.append("    public BytePacker" + nameSuffix + " newBytePacker" + nameSuffix + "(int bitWidth) {\n");
      fw.append("      return packers[bitWidth];\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
      fw.append("\n");
      fw.append("  public static final BytePacker" + nameSuffix + "Factory factory = new BytePacker" + nameSuffix + "Factory() {\n");
      fw.append("    public BytePacker" + nameSuffix + " newBytePacker" + nameSuffix + "(int bitWidth) {\n");
      fw.append("      return packers[bitWidth];\n");
      fw.append("    }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
  private static void generateClass(FileWriter fw, int bitWidth, boolean isLong, boolean msbFirst) throws IOException {
    String nameSuffix = isLong ? "ForLong" : "";
    fw.append("  private static final class Packer" + bitWidth + " extends BytePacker" + nameSuffix + " {\n");
    fw.append("\n");
    fw.append("    private Packer" + bitWidth + "() {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
    fw.append("  private static final class Packer" + bitWidth + " extends BytePacker" + nameSuffix + " {\n");
    fw.append("\n");
    fw.append("    private Packer" + bitWidth + "() {\n");
    fw.append("      super("+bitWidth+");\n");
    fw.append("    }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
    fw.append("\n");
    fw.append("    private Packer" + bitWidth + "() {\n");
    fw.append("      super("+bitWidth+");\n");
    fw.append("    }\n");
    fw.append("\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
    String maskSuffix = isLong ? "L" : "";
    String variableType = isLong ? VARIABLE_TYPE_FOR_LONG : VARIABLE_TYPE_FOR_INT;
    fw.append("    public final void pack" + (batch * 8) + "Values(final " + variableType + "[] in, final int inPos, final byte[] out, final int outPos) {\n");
    for (int byteIndex = 0; byteIndex < bitWidth * batch; ++byteIndex) {
      fw.append("      out[" + align(byteIndex, 2) + " + outPos] = (byte)((\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
    fw.append("    public final void pack" + (batch * 8) + "Values(final " + variableType + "[] in, final int inPos, final byte[] out, final int outPos) {\n");
    for (int byteIndex = 0; byteIndex < bitWidth * batch; ++byteIndex) {
      fw.append("      out[" + align(byteIndex, 2) + " + outPos] = (byte)((\n");
      int startIndex = (byteIndex * 8) / bitWidth;
      int endIndex = ((byteIndex + 1) * 8 + bitWidth - 1) / bitWidth;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
          shiftString = " <<  " + ( - shiftMask.shift);
        }
        fw.append("((in[" + align(valueIndex, 2) + " + inPos] & " + mask + maskSuffix + ")" + shiftString + ")");
      }
      fw.append(") & 255);\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
      mask |= 1;
    }
    fw.append("  private static final class Packer" + bitWidth + " extends IntPacker {\n");
    fw.append("\n");
    fw.append("    private Packer" + bitWidth + "() {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
    fw.append("  private static final class Packer" + bitWidth + " extends IntPacker {\n");
    fw.append("\n");
    fw.append("    private Packer" + bitWidth + "() {\n");
    fw.append("      super(" + bitWidth + ");\n");
    fw.append("    }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
    fw.append("\n");
    fw.append("    private Packer" + bitWidth + "() {\n");
    fw.append("      super(" + bitWidth + ");\n");
    fw.append("    }\n");
    fw.append("\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
    fw.append("    public final void pack32Values(final int[] in, final int inPos, final int[] out, final int outPos) {\n");
    for (int i = 0; i < bitWidth; ++i) {
      fw.append("      out[" + align(i, 2) + " + outPos] =\n");
      int startIndex = (i * 32) / bitWidth;
      int endIndex = ((i + 1) * 32 + bitWidth - 1) / bitWidth;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
        }
        String shiftString = getPackShiftString(bitWidth, i, startIndex, j, msbFirst);
        fw.append("((in[" + align(j, 2) + " + inPos] & " + mask + ")" + shiftString + ")");
      }
      fw.append(";\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
    if (bitWidth > 0) {
      for (int i = 0; i < 32; ++i) {
        fw.append("      out[" + align(i, 2) + " + outPos] =");
        int byteIndex = i * bitWidth / 32;
        String shiftString = getUnpackShiftString(bitWidth, i, msbFirst);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
        int byteIndex = i * bitWidth / 32;
        String shiftString = getUnpackShiftString(bitWidth, i, msbFirst);
        fw.append(" ((in[" + align(byteIndex, 2) + " + inPos] " + shiftString + ") & " + mask + ")");
        if (((i + 1) * bitWidth - 1 ) / 32 != byteIndex) {
          // reading the end of the value from next int
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
          // reading the end of the value from next int
          int bitsRead = ((i + 1) * bitWidth - 1) % 32 + 1;
          fw.append(" | ((in[" + align(byteIndex + 1, 2) + " + inPos]");
          if (msbFirst) {
            fw.append(") >>> " + align(32 - bitsRead, 2) + ")");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
          fw.append(" | ((in[" + align(byteIndex + 1, 2) + " + inPos]");
          if (msbFirst) {
            fw.append(") >>> " + align(32 - bitsRead, 2) + ")");
          } else {
            int lowerMask = 0;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
              lowerMask |= 1;
            }
            fw.append(" & " + lowerMask + ") << " + align(bitWidth - bitsRead, 2) + ")");
          }
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
      fw.append(" *\n");
      fw.append(" */\n");
      fw.append("abstract class " + className + " {\n");
      fw.append("\n");
      fw.append("  private static final IntPacker[] packers = new IntPacker[32];\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Writer.append()` call
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
      fw.append("  static {\n");
      for (int i = 0; i < 32; i++) {
        fw.append("    packers[" + i + "] = new Packer" + i + "();\n");
      }
      fw.append("  }\n");
```

## RuleId[ruleID=IOResource]
### IOResource
'ParquetRewriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ColumnMasker.java`
#### Snippet
```java
  public void processBlocks(TransParquetFileReader reader, ParquetFileWriter writer, ParquetMetadata meta,
                            MessageType schema, List<String> paths, MaskMode maskMode) throws IOException {
    ParquetRewriter rewriter = new ParquetRewriter(
            reader, writer, meta, schema, null, null,  paths, convertMaskMode(maskMode));
    rewriter.processBlocks();
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `parquet-column/src/main/java/org/apache/parquet/column/values/rle/RunLengthBitPackingHybridDecoder.java`
#### Snippet
```java
      int bytesToRead = (int)Math.ceil(currentCount * bitWidth / 8.0);
      bytesToRead = Math.min(bytesToRead, in.available());
      new DataInputStream(in).readFully(bytes, 0, bytesToRead);
      for (int valueIndex = 0, byteIndex = 0; valueIndex < currentCount; valueIndex += 8, byteIndex += bitWidth) {
        packer.unpack8Values(bytes, byteIndex, currentBuffer, valueIndex);
```

### IOResource
'CapacityByteArrayOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `parquet-column/src/main/java/org/apache/parquet/column/values/bytestreamsplit/ByteStreamSplitValuesWriter.java`
#### Snippet
```java
    final int initialCapacityPerStream = (initialCapacity + this.numStreams - 1) / this.numStreams;
    for (int i = 0; i < this.numStreams; ++i) {
      this.byteStreams[i] = new CapacityByteArrayOutputStream(
              initialCapacityPerStream, capacityPerStream, allocator);
    }
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesInput.java`
#### Snippet
```java
      LOG.debug("read all {} bytes", byteCount);
      byte[] buf = new byte[byteCount];
      new DataInputStream(in).readFully(buf);
      return buf;
    }
```

## RuleId[ruleID=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `parquet-hadoop/src/main/java/org/apache/parquet/ParquetReadOptions.java`
#### Snippet
```java
  public boolean isEnabled(String property, boolean defaultValue) {
    Optional<String> propValue = Optional.ofNullable(properties.get(property));
    return propValue.isPresent() ? Boolean.valueOf(propValue.get())
        : defaultValue;
  }
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `BUFFER_SIZE_CONFIG` may be 'static'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/SnappyCodec.java`
#### Snippet
```java
  private Configuration conf;
  // Hadoop config for how big to make intermediate buffers.
  private final String BUFFER_SIZE_CONFIG = "io.file.buffer.size";

  @Override
```

### FieldMayBeStatic
Field `COPY_BUFFER_SIZE` may be 'static'
in `parquet-common/src/main/java/org/apache/parquet/io/DelegatingSeekableInputStream.java`
#### Snippet
```java
public abstract class DelegatingSeekableInputStream extends SeekableInputStream {

  private final int COPY_BUFFER_SIZE = 8192;
  private final byte[] temp = new byte[COPY_BUFFER_SIZE];

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ModuleCipherFactory` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/ModuleCipherFactory.java`
#### Snippet
```java
import org.apache.parquet.format.BlockCipher;

public class ModuleCipherFactory {

  // Parquet Module types
```

### UtilityClassWithoutPrivateConstructor
Class `KeyToolkit` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyToolkit.java`
#### Snippet
```java
import java.util.concurrent.ConcurrentMap;

public class KeyToolkit {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `ColumnIndexFilterUtils` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnIndexFilterUtils.java`
#### Snippet
```java
 * Internal utility class to help at column index based filtering.
 */
class ColumnIndexFilterUtils {
  static class OffsetRange {
    private final long offset;
```

### UtilityClassWithoutPrivateConstructor
Class `PrintFooter` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
 * Utility to print footer information
 */
public class PrintFooter {

  public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ColumnIndexValidator` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnIndexValidator.java`
#### Snippet
```java
import org.apache.parquet.schema.PrimitiveType;

public class ColumnIndexValidator {

  public enum Contract {
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigurationUtil` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ConfigurationUtil.java`
#### Snippet
```java
import org.apache.parquet.hadoop.BadConfigurationException;

public class ConfigurationUtil {

  public static Class<?> getClassFromConfig(Configuration configuration, String configName, Class<?> assignableFrom) {
```

### UtilityClassWithoutPrivateConstructor
Class `HadoopCodecs` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/HadoopCodecs.java`
#### Snippet
```java
import org.apache.parquet.hadoop.CodecFactory;

public class HadoopCodecs {
  public static CompressionCodecFactory newFactory(int sizeHint) {
    return new CodecFactory(new Configuration(), sizeHint);
```

### UtilityClassWithoutPrivateConstructor
Class `HadoopStreams` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/HadoopStreams.java`
#### Snippet
```java
 * Convenience methods to get Parquet abstractions for Hadoop data streams.
 */
public class HadoopStreams {

  private static final Logger LOG = LoggerFactory.getLogger(HadoopStreams.class);
```

### UtilityClassWithoutPrivateConstructor
Class `BenchmarkCounter` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/counters/BenchmarkCounter.java`
#### Snippet
```java
 * Encapsulate counter operations, compatible with Hadoop1/2, mapred/mapreduce API
 */
public class BenchmarkCounter {

  private static final String ENABLE_BYTES_READ_COUNTER = "parquet.benchmark.bytes.read";
```

### UtilityClassWithoutPrivateConstructor
Class `ContextUtil` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ContextUtil.java`
#### Snippet
```java
 * MapReduce Context Objects API between hadoop-0.20 and later versions.
 */
public class ContextUtil {

  private static final boolean useV21;
```

### UtilityClassWithoutPrivateConstructor
Class `SnappyUtil` has only 'static' members, and lacks a 'private' constructor
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/SnappyUtil.java`
#### Snippet
```java
 * Utilities for SnappyCompressor and SnappyDecompressor.
 */
public class SnappyUtil {
  public static void validateBuffer(byte[] buffer, int off, int len) {
    Preconditions.checkNotNull(buffer, "buffer");
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `parquet-cli/src/main/java/org/apache/parquet/cli/Util.java`
#### Snippet
```java


public class Util {

  private static final long KB = 1024;
```

### UtilityClassWithoutPrivateConstructor
Class `Formats` has only 'static' members, and lacks a 'private' constructor
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Formats.java`
#### Snippet
```java
import java.util.Arrays;

public class Formats {
  public enum Format {
    PARQUET,
```

### UtilityClassWithoutPrivateConstructor
Class `Codecs` has only 'static' members, and lacks a 'private' constructor
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Codecs.java`
#### Snippet
```java
import java.util.Locale;

public class Codecs {
  public static CompressionCodecName parquetCodec(String codec) {
    try {
```

### UtilityClassWithoutPrivateConstructor
Class `AvroCSV` has only 'static' members, and lacks a 'private' constructor
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/AvroCSV.java`
#### Snippet
```java
import static java.lang.Math.min;

public class AvroCSV {

  private static final Pattern LONG = Pattern.compile("\\d+");
```

### UtilityClassWithoutPrivateConstructor
Class `Schemas` has only 'static' members, and lacks a 'private' constructor
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Schemas.java`
#### Snippet
```java
import java.util.Set;

public class Schemas {

  public static Schema fromAvsc(InputStream in) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `AvroJson` has only 'static' members, and lacks a 'private' constructor
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java
import java.util.Set;

public class AvroJson {

  private static final ObjectMapper MAPPER = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `CorruptDeltaByteArrays` has only 'static' members, and lacks a 'private' constructor
in `parquet-column/src/main/java/org/apache/parquet/CorruptDeltaByteArrays.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class CorruptDeltaByteArrays {
  private static final Logger LOG = LoggerFactory.getLogger(CorruptStatistics.class);

```

### UtilityClassWithoutPrivateConstructor
Class `CorruptStatistics` has only 'static' members, and lacks a 'private' constructor
in `parquet-column/src/main/java/org/apache/parquet/CorruptStatistics.java`
#### Snippet
```java
 * and thus it's statistics should be ignored / not trusted.
 */
public class CorruptStatistics {
  private static final AtomicBoolean alreadyLogged = new AtomicBoolean(false);

```

### UtilityClassWithoutPrivateConstructor
Class `Expressions` has only 'static' members, and lacks a 'private' constructor
in `parquet-cli/src/main/java/org/apache/parquet/cli/util/Expressions.java`
#### Snippet
```java


public class Expressions {
  private static final Pattern NUMERIC_RE = Pattern.compile("^\\d+$");

```

### UtilityClassWithoutPrivateConstructor
Class `TypeUtil` has only 'static' members, and lacks a 'private' constructor
in `parquet-column/src/main/java/org/apache/parquet/schema/TypeUtil.java`
#### Snippet
```java
package org.apache.parquet.schema;

public class TypeUtil {
  public static void checkValidWriteSchema(GroupType schema) {
    schema.accept(new TypeVisitor() {
```

### UtilityClassWithoutPrivateConstructor
Class `ColumnPredicates` has only 'static' members, and lacks a 'private' constructor
in `parquet-column/src/main/java/org/apache/parquet/filter/ColumnPredicates.java`
#### Snippet
```java
 * correct value from the column.
 */
public class ColumnPredicates {

  public static interface Predicate {
```

### UtilityClassWithoutPrivateConstructor
Class `Paper` has only 'static' members, and lacks a 'private' constructor
in `parquet-column/src/main/java/org/apache/parquet/example/Paper.java`
#### Snippet
```java
 * Examples from the Dremel Paper
 */
public class Paper {
  public static final MessageType schema =
      new MessageType("Document",
```

### UtilityClassWithoutPrivateConstructor
Class `FilterCompat` has only 'static' members, and lacks a 'private' constructor
in `parquet-column/src/main/java/org/apache/parquet/filter2/compat/FilterCompat.java`
#### Snippet
```java
 * codebase.
 */
public class FilterCompat {
  private static final Logger LOG = LoggerFactory.getLogger(FilterCompat.class);

```

### UtilityClassWithoutPrivateConstructor
Class `Types` has only 'static' members, and lacks a 'private' constructor
in `parquet-column/src/main/java/org/apache/parquet/schema/Types.java`
#### Snippet
```java
 * </pre>
 */
public class Types {
  private static final int NOT_SET = 0;

```

### UtilityClassWithoutPrivateConstructor
Class `JSON` has only 'static' members, and lacks a 'private' constructor
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/JSON.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.SerializationFeature;

class JSON {

  private static ObjectMapper om = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `CompatibilityRunner` has only 'static' members, and lacks a 'private' constructor
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java
 * It will fail when they are not compatible. For compatibility rules: {@link CompatibilityChecker}
 */
public class CompatibilityRunner {
  public static void main(String[] args) throws Exception {
    LinkedList<String> arguments = new LinkedList<String>(Arrays.asList(args));
```

### UtilityClassWithoutPrivateConstructor
Class `DecimalUtils` has only 'static' members, and lacks a 'private' constructor
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/DecimalUtils.java`
#### Snippet
```java
 */

public class DecimalUtils {

  public static BigDecimal binaryToDecimal(Binary value, int precision, int scale) {
```

### UtilityClassWithoutPrivateConstructor
Class `BenchmarkConstants` has only 'static' members, and lacks a 'private' constructor
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/BenchmarkConstants.java`
#### Snippet
```java
import static org.apache.parquet.hadoop.ParquetWriter.DEFAULT_PAGE_SIZE;

public class BenchmarkConstants {
  public static final int ONE_K = 1000;
  public static final int FIVE_K = 5 * ONE_K;
```

### UtilityClassWithoutPrivateConstructor
Class `BenchmarkFiles` has only 'static' members, and lacks a 'private' constructor
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/BenchmarkFiles.java`
#### Snippet
```java
import org.apache.hadoop.fs.Path;

public class BenchmarkFiles {
  public static final Configuration configuration = new Configuration();

```

### UtilityClassWithoutPrivateConstructor
Class `BenchmarkUtils` has only 'static' members, and lacks a 'private' constructor
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/BenchmarkUtils.java`
#### Snippet
```java
import org.apache.hadoop.fs.Path;

public class BenchmarkUtils {
  public static void deleteIfExists(Configuration conf, Path path) {
    try {
```

### UtilityClassWithoutPrivateConstructor
Class `TimeUnits` has only 'static' members, and lacks a 'private' constructor
in `parquet-format-structures/src/main/java/org/apache/parquet/format/LogicalTypes.java`
#### Snippet
```java
 */
public class LogicalTypes {
  public static class TimeUnits {
    public static final TimeUnit MILLIS = TimeUnit.MILLIS(new MilliSeconds());
    public static final TimeUnit MICROS = TimeUnit.MICROS(new MicroSeconds());
```

### UtilityClassWithoutPrivateConstructor
Class `LogicalTypes` has only 'static' members, and lacks a 'private' constructor
in `parquet-format-structures/src/main/java/org/apache/parquet/format/LogicalTypes.java`
#### Snippet
```java
 * Convenience instances of logical type classes.
 */
public class LogicalTypes {
  public static class TimeUnits {
    public static final TimeUnit MILLIS = TimeUnit.MILLIS(new MilliSeconds());
```

### UtilityClassWithoutPrivateConstructor
Class `Exceptions` has only 'static' members, and lacks a 'private' constructor
in `parquet-common/src/main/java/org/apache/parquet/Exceptions.java`
#### Snippet
```java
package org.apache.parquet;

public class Exceptions {
  /**
   * If the given throwable is an instance of E, throw it as an E.
```

### UtilityClassWithoutPrivateConstructor
Class `IOExceptionUtils` has only 'static' members, and lacks a 'private' constructor
in `parquet-common/src/main/java/org/apache/parquet/IOExceptionUtils.java`
#### Snippet
```java
 */
@Deprecated
public class IOExceptionUtils {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `Consumers` has only 'static' members, and lacks a 'private' constructor
in `parquet-format-structures/src/main/java/org/apache/parquet/format/event/Consumers.java`
#### Snippet
```java
 * Entry point for reading thrift in a streaming fashion
 */
public class Consumers {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
 * We use the TCompactProtocol to serialize metadata
 */
public class Util {

  private final static int INIT_MEM_ALLOC_ENCR_BUFFER = 100;
```

### UtilityClassWithoutPrivateConstructor
Class `VersionParser` has only 'static' members, and lacks a 'private' constructor
in `parquet-common/src/main/java/org/apache/parquet/VersionParser.java`
#### Snippet
```java
 * (semver and build hash may be null)
 */
public class VersionParser {
  // example: parquet-mr version 1.8.0rc2-SNAPSHOT (build ddb469afac70404ea63b72ed2f07a911a8592ff7)
  public static final String FORMAT = "(.*?)\\s+version\\s*(?:([^(]*?)\\s*(?:\\(\\s*build\\s*([^)]*?)\\s*\\))?)?";
```

### UtilityClassWithoutPrivateConstructor
Class `BytesUtils` has only 'static' members, and lacks a 'private' constructor
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesUtils.java`
#### Snippet
```java
 * utility methods to deal with bytes
 */
public class BytesUtils {
  private static final Logger LOG = LoggerFactory.getLogger(BytesUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `Generator` has only 'static' members, and lacks a 'private' constructor
in `parquet-generator/src/main/java/org/apache/parquet/filter2/Generator.java`
#### Snippet
```java
 * main class for code generation hook in build for filter2 generation
 */
public class Generator {
  public static void main(String[] args) throws Exception {
    IncrementallyUpdatedFilterPredicateGenerator.main(args);
```

### UtilityClassWithoutPrivateConstructor
Class `Generator` has only 'static' members, and lacks a 'private' constructor
in `parquet-generator/src/main/java/org/apache/parquet/version/Generator.java`
#### Snippet
```java
 * main class for code generation hook in build for version generation
 */
public class Generator {
  public static void main(String[] args) throws Exception {
    VersionGenerator.main(args);
```

### UtilityClassWithoutPrivateConstructor
Class `Generator` has only 'static' members, and lacks a 'private' constructor
in `parquet-generator/src/main/java/org/apache/parquet/encoding/Generator.java`
#### Snippet
```java
 * main class for code generation hook in build for encodings generation
 */
public class Generator {

  public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ByteBasedBitPackingGenerator` has only 'static' members, and lacks a 'private' constructor
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/ByteBasedBitPackingGenerator.java`
#### Snippet
```java
 * The result of the generation is checked in. To regenerate the code run this class and check in the result.
 */
public class ByteBasedBitPackingGenerator {

  private static final String CLASS_NAME_PREFIX_FOR_INT = "ByteBitPacking";
```

### UtilityClassWithoutPrivateConstructor
Class `IntBasedBitPackingGenerator` has only 'static' members, and lacks a 'private' constructor
in `parquet-generator/src/main/java/org/apache/parquet/encoding/bitpacking/IntBasedBitPackingGenerator.java`
#### Snippet
```java
 * Note: This is not really used for now as the hadoop API does not really let write int[]. We need to revisit this
 */
public class IntBasedBitPackingGenerator {

  private static final String CLASS_NAME_PREFIX = "LemireBitPacking";
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getFooter` may produce `NullPointerException`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
      if (footer == null) {
          // Footer was originally missing, so get it from the cache again
          footers.add(footersCache.getCurrentValue(footerEntry.getKey()).getFooter());
      } else {
          footers.add(footer);
```

### DataFlowIssue
Dereference of `rowGroups` may produce `NullPointerException`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
      firstColumnWithMetadata = rowGroups.get(0).getColumns().get(0).isSetMeta_data();
    }
    for (RowGroup rowGroup : rowGroups) {
      long totalSize = 0;
      long startIndex;
```

### DataFlowIssue
Dereference of `rowGroups` may produce `NullPointerException`
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
      firstColumnWithMetadata = rowGroups.get(0).getColumns().get(0).isSetMeta_data();
    }
    for (RowGroup rowGroup : rowGroups) {
      long startIndex;
      ColumnChunk columnChunk = rowGroup.getColumns().get(0);
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
  public ParquetFileReader(Configuration configuration, Path filePath, List<BlockMetaData> blocks,
                           List<ColumnDescriptor> columns) throws IOException {
    this(configuration, null, filePath, blocks, columns);
  }

```

### DataFlowIssue
Method invocation `merge` may produce `NullPointerException`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
      }
    }
    return new ParquetMetadata(fileMetaData.merge(keyValueMergeStrategy), blocks);
  }

```

### DataFlowIssue
Unboxing of `previousField.peek()` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java

  private void validateMissingFields(int index) {
    for (int i = previousField.peek() + 1; i < index; i++) {
      Type type = types.peek().asGroupType().getType(i);
      if (type.isRepetition(Repetition.REQUIRED)) {
```

### DataFlowIssue
Method invocation `asGroupType` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java
  private void validateMissingFields(int index) {
    for (int i = previousField.peek() + 1; i < index; i++) {
      Type type = types.peek().asGroupType().getType(i);
      if (type.isRepetition(Repetition.REQUIRED)) {
        throw new InvalidRecordException("required field is missing " + type);
```

### DataFlowIssue
Method invocation `asGroupType` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java
  public void startGroup() {
    previousField.push(-1);
    types.push(types.peek().asGroupType().getType(fields.peek()));
    delegate.startGroup();
  }
```

### DataFlowIssue
Unboxing of `fields.peek()` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java
  public void startGroup() {
    previousField.push(-1);
    types.push(types.peek().asGroupType().getType(fields.peek()));
    delegate.startGroup();
  }
```

### DataFlowIssue
Method invocation `asGroupType` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java
  public void endMessage() {
    delegate.endMessage();
    validateMissingFields(types.peek().asGroupType().getFieldCount());
    previousField.pop();
  }
```

### DataFlowIssue
Method invocation `asGroupType` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java
  public void endGroup() {
    delegate.endGroup();
    validateMissingFields(types.peek().asGroupType().getFieldCount());
    types.pop();
    previousField.pop();
```

### DataFlowIssue
Unboxing of `previousField.peek()` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java
  @Override
  public void startField(String field, int index) {
    if (index <= previousField.peek()) {
      throw new InvalidRecordException("fields must be added in order " + field + " index " + index + " is before previous field " + previousField.peek());
    }
```

### DataFlowIssue
Method invocation `asGroupType` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java

  private void validate(PrimitiveTypeName... ptypes) {
    Type currentType = types.peek().asGroupType().getType(fields.peek());
    int c = fieldValueCount.pop() + 1;
    fieldValueCount.push(c);
```

### DataFlowIssue
Unboxing of `fields.peek()` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java

  private void validate(PrimitiveTypeName... ptypes) {
    Type currentType = types.peek().asGroupType().getType(fields.peek());
    int c = fieldValueCount.pop() + 1;
    fieldValueCount.push(c);
```

### DataFlowIssue
Method invocation `asGroupType` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java

  private void validate(PrimitiveTypeName p) {
    Type currentType = types.peek().asGroupType().getType(fields.peek());
    int c = fieldValueCount.pop() + 1;
    fieldValueCount.push(c);
```

### DataFlowIssue
Unboxing of `fields.peek()` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/io/ValidatingRecordConsumer.java`
#### Snippet
```java

  private void validate(PrimitiveTypeName p) {
    Type currentType = types.peek().asGroupType().getType(fields.peek());
    int c = fieldValueCount.pop() + 1;
    fieldValueCount.push(c);
```

### DataFlowIssue
Variable is already assigned to this value
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/Operators.java`
#### Snippet
```java
      }
      int length = str.length();
      str = values.size() <= 100 ? str.delete(length - 2, length) : str.append("...");
      return str.append(")").toString();
    }
```

### DataFlowIssue
Argument `typeName` might be null
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoSchemaConverter.java`
#### Snippet
```java
    }

    seen = ImmutableSetMultimap.<String, Integer>builder().putAll(seen).put(typeName, depth).build();

    if (descriptor.isRepeated() && parquetSpecsCompliant) {
```

### DataFlowIssue
Argument `oldJsonPath` might be null
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java
    String newJsonPath = arguments.pollFirst();

    File oldJsonFile = new File(oldJsonPath);
    checkExist(oldJsonFile);
    File newJsonFile = new File(newJsonPath);
```

### DataFlowIssue
Argument `newJsonPath` might be null
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java
    File oldJsonFile = new File(oldJsonPath);
    checkExist(oldJsonFile);
    File newJsonFile = new File(newJsonPath);
    checkExist(newJsonFile);

```

### DataFlowIssue
Argument `storedPath` might be null
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java
    String className = arguments.pollFirst();
    String storedPath = arguments.pollFirst();
    File storeDir = new File(storedPath);
    ThriftType.StructType structType = ThriftSchemaConverter.toStructType((Class<? extends TBase<?, ?>>) Class.forName(className));
    ObjectMapper mapper = new ObjectMapper();
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/CompatibilityRunner.java`
#### Snippet
```java
    LinkedList<String> arguments = new LinkedList<String>(Arrays.asList(args));
    String operator = arguments.pollFirst();
    if (operator.equals("generate-json")) {
      //java CompatibilityRunner generate-json tfe_request com.twitter.logs.TfeRequestLog old_json/
      generateJson(arguments);
```

### DataFlowIssue
Dereference of `columnIndex` may produce `NullPointerException`
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
    builder.fill(nullPages, nullCounts, minValues, maxValues);
    ColumnIndexBase<?> columnIndex = builder.build(type);
    columnIndex.boundaryOrder = requireNonNull(boundaryOrder);
    return columnIndex;
  }
```

### DataFlowIssue
Argument `expectedType` might be null
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    switch (type) {
    case TType.LIST:
      hasFieldsIgnored = readOneList(in, buffer, (ListType)expectedType);
      break;
    case TType.MAP:
```

### DataFlowIssue
Argument `expectedType` might be null
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
      break;
    case TType.SET:
      hasFieldsIgnored = readOneSet(in, buffer, (SetType)expectedType);
      break;
    case TType.STRUCT:
```

### DataFlowIssue
Argument `expectedType` might be null
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
    case TType.I32:
      final int i = in.readI32();
      checkEnum(expectedType,i);
      writeIntAction(buffer, i);
      break;
```

### DataFlowIssue
Argument `schema` might be null
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java

    schema = getSchemaFromRequiredFieldList(schema, requiredFieldList.getFields());
    storeInUDFContext(PARQUET_PIG_SCHEMA, pigSchemaToString(schema));
    storeInUDFContext(PARQUET_PIG_REQUIRED_FIELDS, serializeRequiredFieldList(requiredFieldList));

```

### DataFlowIssue
Casting `o` to `OneOf` will produce `ClassCastException` for any non-null value
in `parquet-common/src/main/java/org/apache/parquet/glob/GlobNode.java`
#### Snippet
```java
    public boolean equals(Object o) {
      if (this == o) return true;
      return o != null && getClass() == o.getClass() && children.equals(((OneOf) o).children);
    }

```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'BytesDecompressor' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/CodecFactory.java`
#### Snippet
```java
   */
  @Deprecated
  public static abstract class BytesDecompressor implements CompressionCodecFactory.BytesInputDecompressor {
    public abstract BytesInput decompress(BytesInput bytes, int uncompressedSize) throws IOException;
    public abstract void decompress(ByteBuffer input, int compressedSize, ByteBuffer output, int uncompressedSize) throws IOException;
```

### DeprecatedIsStillUsed
Deprecated member 'ENABLE_JOB_SUMMARY' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String ENABLE_JOB_SUMMARY   = "parquet.enable.summary-metadata";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'getBlockSize' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java

  @Deprecated
  public static int getBlockSize(Configuration configuration) {
    return configuration.getInt(BLOCK_SIZE, DEFAULT_BLOCK_SIZE);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'getUnboundRecordFilter' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
   */
  @Deprecated
  public static Class<?> getUnboundRecordFilter(Configuration configuration) {
    return ConfigurationUtil.getClassFromConfig(configuration, UNBOUND_RECORD_FILTER, UnboundRecordFilter.class);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'getSplits' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
   */
  @Deprecated
  public List<ParquetInputSplit> getSplits(Configuration configuration, List<Footer> footers) throws IOException {
    boolean strictTypeChecking = configuration.getBoolean(STRICT_TYPE_CHECKING, true);
    final long maxSplitSize = configuration.getLong("mapred.max.split.size", Long.MAX_VALUE);
```

### DeprecatedIsStillUsed
Deprecated member 'getReadSupport' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
  @Deprecated
  @SuppressWarnings("unchecked")
  ReadSupport<T> getReadSupport(Configuration configuration){
    return getReadSupportInstance(readSupportClass == null ?
        (Class<? extends ReadSupport<T>>) getReadSupportClass(configuration) :
```

### DeprecatedIsStillUsed
Deprecated member 'getMergedKeyValueMetaData' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/api/InitContext.java`
#### Snippet
```java
   */
  @Deprecated
  public Map<String, String> getMergedKeyValueMetaData() {
    if (mergedKeyValueMetadata == null) {
      Map<String, String> mergedKeyValues = new HashMap<String, String>();
```

### DeprecatedIsStillUsed
Deprecated member 'ColumnEncryptor' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ColumnEncryptor.java`
#### Snippet
```java
 */
@Deprecated
public class ColumnEncryptor {

  private Configuration conf;
```

### DeprecatedIsStillUsed
Deprecated member 'fromParquetStatistics' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
   */
  @Deprecated
  public static org.apache.parquet.column.statistics.Statistics fromParquetStatistics
      (String createdBy, Statistics statistics, PrimitiveTypeName type) {
    return fromParquetStatisticsInternal(createdBy, statistics,
```

### DeprecatedIsStillUsed
Deprecated member 'Builder' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetReader.java`
#### Snippet
```java

    @Deprecated
    private Builder(ReadSupport<T> readSupport, Path path) {
      this.readSupport = Objects.requireNonNull(readSupport, "readSupport cannot be null");
      this.file = null;
```

### DeprecatedIsStillUsed
Deprecated member 'ColumnPruner' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ColumnPruner.java`
#### Snippet
```java

@Deprecated
public class ColumnPruner {

  private static final Logger LOG = LoggerFactory.getLogger(ColumnPruner.class);
```

### DeprecatedIsStillUsed
Deprecated member 'ColumnMasker' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/ColumnMasker.java`
#### Snippet
```java

@Deprecated
public class ColumnMasker {
  /**
   *
```

### DeprecatedIsStillUsed
Deprecated member 'readAllFootersInParallelUsingSummaryFiles' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static List<Footer> readAllFootersInParallelUsingSummaryFiles(
      final Configuration configuration,
      final Collection<FileStatus> partFiles,
```

### DeprecatedIsStillUsed
Deprecated member 'readAllFootersInParallel' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static List<Footer> readAllFootersInParallel(Configuration configuration, FileStatus fileStatus, boolean skipRowGroups) throws IOException {
    List<FileStatus> statuses = listFiles(configuration, fileStatus);
    return readAllFootersInParallel(configuration, statuses, skipRowGroups);
```

### DeprecatedIsStillUsed
Deprecated member 'readSummaryFile' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static List<Footer> readSummaryFile(Configuration configuration, FileStatus summaryStatus) throws IOException {
    final Path parent = summaryStatus.getPath().getParent();
    ParquetMetadata mergedFooters = readFooter(configuration, summaryStatus, filter(false));
```

### DeprecatedIsStillUsed
Deprecated member 'readFooters' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static List<Footer> readFooters(Configuration configuration, FileStatus pathStatus, boolean skipRowGroups) throws IOException {
    List<FileStatus> files = listFiles(configuration, pathStatus);
    return readAllFootersInParallelUsingSummaryFiles(configuration, files, skipRowGroups);
```

### DeprecatedIsStillUsed
Deprecated member 'filterRowGroups' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/compat/RowGroupFilter.java`
#### Snippet
```java
   */
  @Deprecated
  public static List<BlockMetaData> filterRowGroups(Filter filter, List<BlockMetaData> blocks, MessageType schema) {
	  Objects.requireNonNull(filter, "filter cannot be null");
    return filter.accept(new RowGroupFilter(blocks, schema));
```

### DeprecatedIsStillUsed
Deprecated member 'ParquetInputSplit' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputSplit.java`
#### Snippet
```java
   */
  @Deprecated
  public ParquetInputSplit(
      Path path,
      long start,
```

### DeprecatedIsStillUsed
Deprecated member 'ParquetInputSplit' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputSplit.java`
#### Snippet
```java
@Private
@Deprecated
public class ParquetInputSplit extends FileSplit implements Writable {


```

### DeprecatedIsStillUsed
Deprecated member 'getRowGroupOffsets' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputSplit.java`
#### Snippet
```java
   * @deprecated will be removed in 2.0.0.
   */
  public long[] getRowGroupOffsets() {
    return rowGroupOffsets;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'writeMergedMetadataFile' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
   */
  @Deprecated
  public static void writeMergedMetadataFile(List<Path> files, Path outputPath, Configuration conf) throws IOException {
    ParquetMetadata merged = mergeMetadataFiles(files, conf);
    writeMetadataFile(outputPath, merged, outputPath.getFileSystem(conf));
```

### DeprecatedIsStillUsed
Deprecated member 'writeMetadataFile' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
   */
  @Deprecated
  public static void writeMetadataFile(Configuration configuration, Path outputPath, List<Footer> footers, JobSummaryLevel level) throws IOException {
    Preconditions.checkArgument(level == JobSummaryLevel.ALL || level == JobSummaryLevel.COMMON_ONLY,
        "Unsupported level: " + level);
```

### DeprecatedIsStillUsed
Deprecated member 'writeDataPage' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
   */
  @Deprecated
  public void writeDataPage(
      int valueCount, int uncompressedPageSize,
      BytesInput bytes,
```

### DeprecatedIsStillUsed
Deprecated member 'appendFile' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
   */
  @Deprecated
  public void appendFile(Configuration conf, Path file) throws IOException {
    try (ParquetFileReader reader = ParquetFileReader.open(conf, file)) {
      reader.appendTo(this);
```

### DeprecatedIsStillUsed
Deprecated member 'appendRowGroups' is still used
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
   */
  @Deprecated
  public void appendRowGroups(FSDataInputStream file,
                              List<BlockMetaData> rowGroups,
                              boolean dropColumns) throws IOException {
```

### DeprecatedIsStillUsed
Deprecated member 'genericRecordReader' is still used
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetReader.java`
#### Snippet
```java
   */
  @Deprecated
  public static ParquetReader<GenericRecord> genericRecordReader(Path file) throws IOException {
    return new Builder<GenericRecord>(file).withDataModel(GenericData.get()).build();
  }
```

### DeprecatedIsStillUsed
Deprecated member 'fromByteArray' is still used
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
   * @deprecated Use @link{fromReusedByteArray} or @link{fromConstantByteArray} instead
   */
  public static Binary fromByteArray(final byte[] value) {
    return fromReusedByteArray(value); // Assume producer intends to reuse byte[]
  }
```

### DeprecatedIsStillUsed
Deprecated member 'getNextOffset' is still used
in `parquet-column/src/main/java/org/apache/parquet/column/values/ValuesReader.java`
#### Snippet
```java
   */
  @Deprecated
  public int getNextOffset() {
    if (nextOffset == -1) {
      throw new ParquetDecodingException("Unsupported: cannot get offset of the next section.");
```

### DeprecatedIsStillUsed
Deprecated member 'DoubleStatistics' is still used
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/DoubleStatistics.java`
#### Snippet
```java
   */
  @Deprecated
  public DoubleStatistics() {
    this(DEFAULT_FAKE_TYPE);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'ColumnWriteStoreV1' is still used
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriteStoreV1.java`
#### Snippet
```java

  @Deprecated
  public ColumnWriteStoreV1(final PageWriteStore pageWriteStore,
      final ParquetProperties props) {
    super(pageWriteStore, props);
```

### DeprecatedIsStillUsed
Deprecated member 'FloatStatistics' is still used
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/FloatStatistics.java`
#### Snippet
```java
   */
  @Deprecated
  public FloatStatistics() {
    // Creating a fake primitive type to have the proper comparator
    this(DEFAULT_FAKE_TYPE);
```

### DeprecatedIsStillUsed
Deprecated member 'BooleanStatistics' is still used
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/BooleanStatistics.java`
#### Snippet
```java
   */
  @Deprecated
  public BooleanStatistics() {
    this(DEFAULT_FAKE_TYPE);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'LongStatistics' is still used
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/LongStatistics.java`
#### Snippet
```java
   */
  @Deprecated
  public LongStatistics() {
    this(DEFAULT_FAKE_TYPE);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'DecimalMetadata' is still used
in `parquet-column/src/main/java/org/apache/parquet/schema/DecimalMetadata.java`
#### Snippet
```java
 */
@Deprecated
public class DecimalMetadata {
  private final int precision;
  private final int scale;
```

### DeprecatedIsStillUsed
Deprecated member 'initializeStats' is still used
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/BinaryStatistics.java`
#### Snippet
```java
   */
  @Deprecated
  public void initializeStats(Binary min_value, Binary max_value) {
      min = min_value.copy();
      max = max_value.copy();
```

### DeprecatedIsStillUsed
Deprecated member 'IntStatistics' is still used
in `parquet-column/src/main/java/org/apache/parquet/column/statistics/IntStatistics.java`
#### Snippet
```java
   */
  @Deprecated
  public IntStatistics() {
    this(DEFAULT_FAKE_TYPE);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'getDecimalMetadata' is still used
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveType.java`
#### Snippet
```java
   */
  @Deprecated
  public DecimalMetadata getDecimalMetadata() {
    return decimalMeta;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'ThriftWriteSupport' is still used
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftWriteSupport.java`
#### Snippet
```java
 */
@Deprecated
public class ThriftWriteSupport<T extends TBase<?,?>> extends WriteSupport<T> {
  public static final String PARQUET_THRIFT_CLASS = AbstractThriftWriteSupport.PARQUET_THRIFT_CLASS;

```

### DeprecatedIsStillUsed
Deprecated member 'THRIFT_COLUMN_FILTER_KEY' is still used
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftReadSupport.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String THRIFT_COLUMN_FILTER_KEY = "parquet.thrift.column.filter";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'TBaseRecordConverter' is still used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/TBaseRecordConverter.java`
#### Snippet
```java
   */
  @Deprecated
  public TBaseRecordConverter(final Class<T> thriftClass, MessageType requestedParquetSchema, StructType thriftType) {
    this(thriftClass, requestedParquetSchema, thriftType, null);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'ThriftParquetReader' is still used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftParquetReader.java`
#### Snippet
```java
   */
  @Deprecated
  public ThriftParquetReader(Path file, Class<T> thriftClass) throws IOException {
    super(file, new ThriftReadSupport<T>(thriftClass));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'ThriftParquetReader' is still used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftParquetReader.java`
#### Snippet
```java
   */
  @Deprecated
  public ThriftParquetReader(Path file) throws IOException {
    super(file, new ThriftReadSupport<T>());
  }
```

### DeprecatedIsStillUsed
Deprecated member 'PathGlobPattern' is still used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/deprecated/PathGlobPattern.java`
#### Snippet
```java
 */
@Deprecated
public class PathGlobPattern {
  private static final char BACKSLASH = '\\';
  private static final char PATH_SEPARATOR = '/';
```

### DeprecatedIsStillUsed
Deprecated member 'ThriftRecordConverter' is still used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
   */
  @Deprecated
  public ThriftRecordConverter(ThriftReader<T> thriftReader, String name, MessageType requestedParquetSchema, ThriftType.StructType thriftType) {
    this(thriftReader, name, requestedParquetSchema, thriftType, null);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'DeprecatedFieldProjectionFilter' is still used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/deprecated/DeprecatedFieldProjectionFilter.java`
#### Snippet
```java
 */
@Deprecated
public class DeprecatedFieldProjectionFilter implements FieldProjectionFilter {
  public static final String PATTERN_SEPARATOR = ";";
  private final List<PathGlobPatternStatus> filterPatterns;
```

### DeprecatedIsStillUsed
Deprecated member 'TypeVisitor' is still used
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java
   * @deprecated will be removed in 2.0.0; use StateVisitor instead.
   */
  public interface TypeVisitor {

    void visit(MapType mapType);
```

### DeprecatedIsStillUsed
Deprecated member 'checkNotNull' is still used
in `parquet-common/src/main/java/org/apache/parquet/Preconditions.java`
#### Snippet
```java
   */
  @Deprecated
  public static <T> T checkNotNull(T o, String name) throws NullPointerException {
    if (o == null) {
      throw new NullPointerException(name + " should not be null");
```

### DeprecatedIsStillUsed
Deprecated member 'unpack8Values' is still used
in `parquet-encoding/src/main/java/org/apache/parquet/column/values/bitpacking/BytePacker.java`
#### Snippet
```java
   */
  @Deprecated
  public void unpack8Values(final byte[] input, final int inPos, final int[] output, final int outPos) {
    unpack8Values(ByteBuffer.wrap(input), inPos, output, outPos);
  }
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/TwoLevelCacheWithExpiration.java`
#### Snippet
```java

  public void removeExpiredEntriesFromCache() {
    cache.values().removeIf(cacheEntry -> cacheEntry.isExpired());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
            }
            if (values.size() == 1) {
              return IndexIterator.filter(getPageCount(), pageIndex -> matchingIndexesForNull.contains(pageIndex));
            }
          }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `parquet-column/src/main/java/org/apache/parquet/internal/column/columnindex/ColumnIndexBuilder.java`
#### Snippet
```java
      IntSet matchingIndex = matchingIndexesLessThanMax;
      matchingIndex.addAll(matchingIndexesForNull);  // add the matching null pages
      return IndexIterator.filter(getPageCount(), pageIndex -> matchingIndex.contains(pageIndex));
    }

```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `createColumnWriter()` during object construction
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriteStoreBase.java`
#### Snippet
```java
    for (ColumnDescriptor path : schema.getColumns()) {
      PageWriter pageWriter = pageWriteStore.getPageWriter(path);
      mcolumns.put(path, createColumnWriter(path, pageWriter, null, props));
    }
    this.columns = unmodifiableMap(mcolumns);
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `createColumnWriter()` during object construction
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriteStoreBase.java`
#### Snippet
```java
      if (props.isBloomFilterEnabled(path)) {
        BloomFilterWriter bloomFilterWriter = bloomFilterWriteStore.getBloomFilterWriter(path);
        mcolumns.put(path, createColumnWriter(path, pageWriter, bloomFilterWriter, props));
      } else {
        mcolumns.put(path, createColumnWriter(path, pageWriter, null, props));
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `createColumnWriter()` during object construction
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriteStoreBase.java`
#### Snippet
```java
        mcolumns.put(path, createColumnWriter(path, pageWriter, bloomFilterWriter, props));
      } else {
        mcolumns.put(path, createColumnWriter(path, pageWriter, null, props));
      }
    }
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `createRLWriter()` during object construction
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriterBase.java`
#### Snippet
```java
    resetStatistics();

    this.repetitionLevelColumn = createRLWriter(props, path);
    this.definitionLevelColumn = createDLWriter(props, path);
    this.dataColumn = props.newValuesWriter(path);
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `createDLWriter()` during object construction
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriterBase.java`
#### Snippet
```java

    this.repetitionLevelColumn = createRLWriter(props, path);
    this.definitionLevelColumn = createDLWriter(props, path);
    this.dataColumn = props.newValuesWriter(path);

```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'cache' in a Serializable class
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyToolkit.java`
#### Snippet
```java
  private enum KEKReadCache {
    INSTANCE;
    private final TwoLevelCacheWithExpiration<byte[]> cache =
      new TwoLevelCacheWithExpiration<>();

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'cache' in a Serializable class
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyToolkit.java`
#### Snippet
```java
  private enum KEKWriteCache {
    INSTANCE;
    private final TwoLevelCacheWithExpiration<KeyEncryptionKey> cache =
      new TwoLevelCacheWithExpiration<>();

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'cache' in a Serializable class
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyToolkit.java`
#### Snippet
```java
  private enum KmsClientCache {
    INSTANCE;
    private final TwoLevelCacheWithExpiration<KmsClient> cache =
      new TwoLevelCacheWithExpiration<>();

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'schema' in a Serializable class
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/GlobalMetaData.java`
#### Snippet
```java
  private static final long serialVersionUID = 1L;

  private final MessageType schema;

  private final Map<String, Set<String>> keyValueMetaData;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'fileDecryptor' in a Serializable class
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/FileMetaData.java`
#### Snippet
```java
  private final String createdBy;
  
  private final InternalFileDecryptor fileDecryptor;

  /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'schema' in a Serializable class
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/FileMetaData.java`
#### Snippet
```java
  private static final long serialVersionUID = 1L;

  private final MessageType schema;

  private final Map<String, String> keyValueMetaData;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'descriptor' in a Serializable class
in `parquet-column/src/main/java/org/apache/parquet/column/UnknownColumnException.java`
#### Snippet
```java
  private static final long serialVersionUID = 1L;

  private final ColumnDescriptor descriptor;

  public UnknownColumnException(ColumnDescriptor descriptor) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'data' in a Serializable class
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/Summary.java`
#### Snippet
```java
  private static final class JSONTuple implements Tuple {
    private static final long serialVersionUID = 1L;
    private TupleSummaryData data;

    public JSONTuple(TupleSummaryData data) {
```

## RuleId[ruleID=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftMetaData.java`
#### Snippet
```java
  /**
   * @param fileMetadata the merged metadata from ultiple files
   * @return the list of thrift classes used to write them
   */
  public static Set<String> getThriftClassNames(Map<String, Set<String>> fileMetadata) {
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  public int compare(double d1, double d2) {
    throw new UnsupportedOperationException(
        "compare(double, double) was called on a non-double comparator: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  public int compare(boolean b1, boolean b2) {
    throw new UnsupportedOperationException(
        "compare(boolean, boolean) was called on a non-boolean comparator: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java
  public int compare(float f1, float f2) {
    throw new UnsupportedOperationException(
        "compare(float, float) was called on a non-float comparator: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java

  public int compare(long l1, long l2) {
    throw new UnsupportedOperationException("compare(long, long) was called on a non-long comparator: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveComparator.java`
#### Snippet
```java

  public int compare(int i1, int i2) {
    throw new UnsupportedOperationException("compare(int, int) was called on a non-int comparator: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/SimpleGroup.java`
#### Snippet
```java
            ((SimpleGroup) value).appendToString(builder, indent + "  ");
          } else {
            builder.append(": ").append(value.toString()).append('\n');
          }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
   */
  public String stringify(long value) {
    throw new UnsupportedOperationException("stringify(long) was called on a non-long stringifier: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  public String stringify(boolean value) {
    throw new UnsupportedOperationException(
        "stringify(boolean) was called on a non-boolean stringifier: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  public String stringify(Binary value) {
    throw new UnsupportedOperationException(
        "stringify(Binary) was called on a non-Binary stringifier: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  public String stringify(double value) {
    throw new UnsupportedOperationException(
        "stringify(double) was called on a non-double stringifier: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
  public String stringify(float value) {
    throw new UnsupportedOperationException(
        "stringify(float) was called on a non-float stringifier: " + toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parquet-column/src/main/java/org/apache/parquet/schema/PrimitiveStringifier.java`
#### Snippet
```java
   */
  public String stringify(int value) {
    throw new UnsupportedOperationException("stringify(int) was called on a non-int stringifier: " + toString());
  }

```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `columnId`
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
        }

        columnId++;
      }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/deprecated/PathGlobPattern.java`
#### Snippet
```java
      switch (c) {
        case BACKSLASH:
          if (++i >= len) {
            error("Missing escaped character", glob, i);
          }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/projection/deprecated/PathGlobPattern.java`
#### Snippet
```java
          if (i + 1 < len && glob.charAt(i + 1) == '*') {
            regex.append('.');
            i++;
            break;
          }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `c`
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java
          if(type != null) {
            final int index = i;
            converters[c++] = newConverter(field, type, new ParentValueContainer() {
              @Override
              void add(Object value) {
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `NoopDecompressor` may be 'static'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/DirectCodecFactory.java`
#### Snippet
```java
  }

  public class NoopDecompressor extends BytesDecompressor {

    @Override
```

### InnerClassMayBeStatic
Inner class `IndirectDecompressor` may be 'static'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/DirectCodecFactory.java`
#### Snippet
```java
   * based version of the decompression algorithm.
   */
  public class IndirectDecompressor extends BytesDecompressor {
    private final Decompressor decompressor;

```

### InnerClassMayBeStatic
Inner class `FileMetaDataAndRowGroupOffsetInfo` may be 'static'
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
   * A container for [[FileMetaData]] and [[RowGroup]] to ROW_INDEX offset map.
   */
  private class FileMetaDataAndRowGroupOffsetInfo {
    final FileMetaData fileMetadata;
    final Map<RowGroup, Long> rowGroupToRowIndexOffsetMap;
```

### InnerClassMayBeStatic
Inner class `PageFormatter` may be 'static'
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowPagesCommand.java`
#### Snippet
```java
  }

  private class PageFormatter implements DataPage.Visitor<String> {
    private int rowGroupNum;
    private int pageNum;
```

### InnerClassMayBeStatic
Inner class `SingletonPageReader` may be 'static'
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CheckParquet251Command.java`
#### Snippet
```java
  }

  public class SingletonPageReader implements PageReader {
    private final DictionaryPage dict;
    private final DataPage data;
```

### InnerClassMayBeStatic
Inner class `StatsValidator` may be 'static'
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CheckParquet251Command.java`
#### Snippet
```java
  }

  private class StatsValidator<T extends Comparable<T>> {
    private final boolean hasNonNull;
    private final T min;
```

### InnerClassMayBeStatic
Inner class `ColumnIOCreatorVisitor` may be 'static'
in `parquet-column/src/main/java/org/apache/parquet/io/ColumnIOFactory.java`
#### Snippet
```java
public class ColumnIOFactory {

  private class ColumnIOCreatorVisitor implements TypeVisitor {

    private MessageColumnIO columnIO;
```

### InnerClassMayBeStatic
Inner class `ProtoDoubleConverter` may be 'static'
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java
  }

  final class ProtoDoubleConverter extends PrimitiveConverter {

    final ParentValueContainer parent;
```

### InnerClassMayBeStatic
Inner class `ProtoIntConverter` may be 'static'
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java
  }

  final class ProtoIntConverter extends PrimitiveConverter {

    final ParentValueContainer parent;
```

### InnerClassMayBeStatic
Inner class `ProtoLongConverter` may be 'static'
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java
  }

  final class ProtoLongConverter extends PrimitiveConverter {

    final ParentValueContainer parent;
```

### InnerClassMayBeStatic
Inner class `ProtoBinaryConverter` may be 'static'
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java
  }

  final class ProtoBinaryConverter extends PrimitiveConverter {

    final ParentValueContainer parent;
```

### InnerClassMayBeStatic
Inner class `ProtoBooleanConverter` may be 'static'
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java


  final class ProtoBooleanConverter extends PrimitiveConverter {

    final ParentValueContainer parent;
```

### InnerClassMayBeStatic
Inner class `ProtoStringConverter` may be 'static'
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java
  }

  final class ProtoStringConverter extends PrimitiveConverter {

    final ParentValueContainer parent;
```

### InnerClassMayBeStatic
Inner class `ProtoFloatConverter` may be 'static'
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java
  }

  final class ProtoFloatConverter extends PrimitiveConverter {

    final ParentValueContainer parent;
```

### InnerClassMayBeStatic
Inner class `FieldBaseWriteProtocol` may be 'static'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  }

  abstract class FieldBaseWriteProtocol extends ParquetProtocol {
    private final Events returnClause;

```

### InnerClassMayBeStatic
Inner class `NullProtocol` may be 'static'
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
   * NullProtocol does nothing when writing to it, used for ignoring unrecognized fields.
   */
  class NullProtocol extends TProtocol {

    public NullProtocol() {
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnChunkPageWriteStore.java`
#### Snippet
```java

    // repetition and definition level encodings are used only for v1 pages and don't change
    private Set<Encoding> rlEncodings = new HashSet<Encoding>();
    private Set<Encoding> dlEncodings = new HashSet<Encoding>();
    private List<Encoding> dataEncodings = new ArrayList<Encoding>();
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnChunkPageWriteStore.java`
#### Snippet
```java
    // repetition and definition level encodings are used only for v1 pages and don't change
    private Set<Encoding> rlEncodings = new HashSet<Encoding>();
    private Set<Encoding> dlEncodings = new HashSet<Encoding>();
    private List<Encoding> dataEncodings = new ArrayList<Encoding>();

```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ColumnChunkPageWriteStore.java`
#### Snippet
```java
            String.format(
                "written %,dB for %s: %,d values, %,dB raw, %,dB comp, %d pages, encodings: %s",
                buf.size(), path, totalValueCount, uncompressedLength, compressedLength, pageCount, new HashSet<Encoding>(dataEncodings))
                + (dictionaryPage != null ? String.format(
                ", dic { %,d entries, %,dB raw, %,dB comp}",
```

### SetReplaceableByEnumSet
`TreeSet` can be replaced with 'EnumSet'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/PrintFooter.java`
#### Snippet
```java
    Stats allStats = new Stats();
    Stats uncStats = new Stats();
    Set<Encoding> encodings = new TreeSet<Encoding>();
    Statistics colValuesStats = null;
    int blocks = 0;
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetRecordReader.java`
#### Snippet
```java
    if (conf.getBoolean(ParquetInputFormat.SPLIT_FILES, true)) {
      // this is okay if not using DELTA_BYTE_ARRAY with the bug
      Set<Encoding> encodings = new HashSet<Encoding>();
      for (ColumnChunkMetaData column : block.getColumns()) {
        encodings.addAll(column.getEncodings());
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java
  // Visible for testing
  Set<org.apache.parquet.column.Encoding> fromFormatEncodings(List<Encoding> encodings) {
    Set<org.apache.parquet.column.Encoding> converted = new HashSet<org.apache.parquet.column.Encoding>();

    for (Encoding encoding : encodings) {
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/dictionarylevel/DictionaryFilter.java`
#### Snippet
```java

    // without EncodingStats, fall back to testing the encoding list
    Set<Encoding> encodings = new HashSet<Encoding>(meta.getEncodings());
    if (encodings.remove(Encoding.PLAIN_DICTIONARY)) {
      // if remove returned true, PLAIN_DICTIONARY was present, which means at
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
    state = state.startColumn();
    encodingStatsBuilder.clear();
    currentEncodings = new HashSet<Encoding>();
    currentChunkPath = ColumnPath.get(descriptor.getPath());
    currentChunkType = descriptor.getPrimitiveType();
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `parquet-column/src/main/java/org/apache/parquet/column/EncodingStats.java`
#### Snippet
```java

    // this modifies the set, so copy it
    Set<Encoding> encodings = new HashSet<>(dataStats.keySet());
    if (!encodings.remove(RLE_DICTIONARY) &&
        !encodings.remove(PLAIN_DICTIONARY)) {
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/ValidTypeMap.java`
#### Snippet
```java
    Set<PrimitiveTypeName> descriptors = classToParquetType.get(c);
    if (descriptors == null) {
      descriptors = new HashSet<>();
      classToParquetType.put(c, descriptors);
    }
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `parquet-hadoop/src/main/java/org/apache/parquet/ParquetReadOptions.java`
#### Snippet
```java
  public boolean isEnabled(String property, boolean defaultValue) {
    Optional<String> propValue = Optional.ofNullable(properties.get(property));
    return propValue.isPresent() ? Boolean.valueOf(propValue.get())
        : defaultValue;
  }
```

### UnnecessaryBoxing
Unnecessary boxing
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyMaterial.java`
#### Snippet
```java
    }
    // 2. Write isFooterKey
    keyMaterialMap.put(IS_FOOTER_KEY_FIELD, Boolean.valueOf(isFooterKey));
    if (isFooterKey) {
      // 3. For footer key, write KMS Instance ID
```

### UnnecessaryBoxing
Unnecessary boxing
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyMaterial.java`
#### Snippet
```java
    keyMaterialMap.put(WRAPPED_DEK_FIELD, encodedWrappedDEK);
    // 7. Write isDoubleWrapped
    keyMaterialMap.put(DOUBLE_WRAPPING_FIELD, Boolean.valueOf(isDoubleWrapped));
    if (isDoubleWrapped) {
      // 8. In double wrapping mode, write KEK ID
```

### UnnecessaryBoxing
Redundant boxing, `Float.parseFloat()` call can be used instead
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/UnmaterializableRecordCounter.java`
#### Snippet
```java
    String value = options.getProperty(key);
    if (value != null) {
      return Float.valueOf(value);
    } else {
      return defaultValue;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetOutputFormat.java`
#### Snippet
```java

    if (deprecatedFlag != null) {
      return Boolean.valueOf(deprecatedFlag) ? JobSummaryLevel.ALL : JobSummaryLevel.NONE;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/CSVProperties.java`
#### Snippet
```java
    private String quote = DEFAULT_QUOTE;
    private String escape = DEFAULT_ESCAPE;
    private boolean useHeader = Boolean.valueOf(DEFAULT_HAS_HEADER);
    private int linesToSkip = DEFAULT_LINES_TO_SKIP;
    private String header = null;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroReadSupport.java`
#### Snippet
```java
    GenericData model = getDataModel(configuration);
    String compatEnabled = metadata.get(AvroReadSupport.AVRO_COMPATIBILITY);
    if (compatEnabled != null && Boolean.valueOf(compatEnabled)) {
      return newCompatMaterializer(parquetSchema, avroSchema, model);
    }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
          throw new RuntimeException("Expecting 2 parameters for integer logical type, got " + params.size());
        }
        return intType(Integer.valueOf(params.get(0)), Boolean.parseBoolean(params.get(1)));
      }
    },
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
          throw new RuntimeException("Expecting 2 parameters for decimal logical type, got " + params.size());
        }
        return decimalType(Integer.valueOf(params.get(1)), Integer.valueOf(params.get(0)));
      }
    },
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `parquet-column/src/main/java/org/apache/parquet/schema/LogicalTypeAnnotation.java`
#### Snippet
```java
          throw new RuntimeException("Expecting 2 parameters for decimal logical type, got " + params.size());
        }
        return decimalType(Integer.valueOf(params.get(1)), Integer.valueOf(params.get(0)));
      }
    },
```

### UnnecessaryBoxing
Unnecessary boxing
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java
  private static final Long I64_ZERO = Long.valueOf(0);
  private static final Float FLOAT_ZERO = Float.valueOf(0);
  private static final Double DOUBLE_ZERO = Double.valueOf(0);

  @Override
```

### UnnecessaryBoxing
Unnecessary boxing
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java
  private static final Integer I32_ZERO = Integer.valueOf(0);
  private static final Long I64_ZERO = Long.valueOf(0);
  private static final Float FLOAT_ZERO = Float.valueOf(0);
  private static final Double DOUBLE_ZERO = Double.valueOf(0);

```

### UnnecessaryBoxing
Unnecessary boxing
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java

  private static final Integer I32_ZERO = Integer.valueOf(0);
  private static final Long I64_ZERO = Long.valueOf(0);
  private static final Float FLOAT_ZERO = Float.valueOf(0);
  private static final Double DOUBLE_ZERO = Double.valueOf(0);
```

### UnnecessaryBoxing
Unnecessary boxing
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/TupleConverter.java`
#### Snippet
```java
  }

  private static final Integer I32_ZERO = Integer.valueOf(0);
  private static final Long I64_ZERO = Long.valueOf(0);
  private static final Float FLOAT_ZERO = Float.valueOf(0);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `parquet-common/src/main/java/org/apache/parquet/SemanticVersion.java`
#### Snippet
```java

    try {
      major = Integer.valueOf(matcher.group(1));
      minor = Integer.valueOf(matcher.group(2));
      patch = Integer.valueOf(matcher.group(3));
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `parquet-common/src/main/java/org/apache/parquet/SemanticVersion.java`
#### Snippet
```java
    try {
      major = Integer.valueOf(matcher.group(1));
      minor = Integer.valueOf(matcher.group(2));
      patch = Integer.valueOf(matcher.group(3));
    } catch (NumberFormatException e) {
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `parquet-common/src/main/java/org/apache/parquet/SemanticVersion.java`
#### Snippet
```java
      major = Integer.valueOf(matcher.group(1));
      minor = Integer.valueOf(matcher.group(2));
      patch = Integer.valueOf(matcher.group(3));
    } catch (NumberFormatException e) {
      throw new SemanticVersionParseException(e);
```

## RuleId[ruleID=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `lastCacheCleanForKeyRotationTimeLock`
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/keytools/KeyToolkit.java`
#### Snippet
```java
    // Only once for each key rotation cycle; not for every folder
    long currentTime = System.currentTimeMillis();
    synchronized (lastCacheCleanForKeyRotationTimeLock) {
      if (currentTime - lastCacheCleanForKeyRotationTime > CACHE_CLEAN_PERIOD_FOR_KEY_ROTATION) {
        KEK_WRITE_CACHE_PER_TOKEN.clear();
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'previousReader != null' covered by subsequent condition 'previousReader instanceof RequiresPreviousReader'
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java

    if (CorruptDeltaByteArrays.requiresSequentialReads(writerVersion, dataEncoding) &&
        previousReader != null && previousReader instanceof RequiresPreviousReader) {
      // previous reader can only be set if reading sequentially
      ((RequiresPreviousReader) dataColumn).setPreviousReader(previousReader);
```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputSplit.java`
#### Snippet
```java
   * @deprecated will be removed in 2.0.0.
   */
  public long[] getRowGroupOffsets() {
    return rowGroupOffsets;
  }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java
   * @deprecated will be removed in 2.0.0; use StateVisitor instead.
   */
  public interface TypeVisitor {

    void visit(MapType mapType);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `parquet-common/src/main/java/org/apache/parquet/Ints.java`
#### Snippet
```java
   * @deprecated replaced by {@link java.lang.Math#toIntExact(long)}
   */
  public static int checkedCast(long value) {
    int valueI = (int) value;
    if (valueI != value) {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `parquet-common/src/main/java/org/apache/parquet/Log.java`
#### Snippet
```java
   * @deprecated will be removed in 2.0.0; use org.slf4j.LoggerFactory instead.
   */
  public static Log getLog(Class<?> c) {
    return new Log(c);
  }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `parquet-hadoop/src/main/java/org/apache/parquet/crypto/AesCipher.java`
#### Snippet
```java
  // Update last two bytes with new page ordinal (instead of creating new page AAD from scratch)
  public static void quickUpdatePageAAD(byte[] pageAAD, int newPageOrdinal) {
    java.util.Objects.requireNonNull(pageAAD);
    if (newPageOrdinal < 0) {
      throw new IllegalArgumentException("Wrong page ordinal: " + newPageOrdinal);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/LruCache.java`
#### Snippet
```java

  /**
   * {@link org.apache.parquet.hadoop.LruCache} expects all values to follow this
   * interface so the cache can determine 1) whether values are current (e.g.
   * the referenced data has not been modified/updated in such a way that the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/LruCache.java`
#### Snippet
```java
 * checks for "stale" entries as entries are inserted or retrieved (note
 * "staleness" is defined by the entries themselves (see
 * {@link org.apache.parquet.hadoop.LruCache.Value}).
 *
 * @param <K> The key type. Acts as the key in a {@link java.util.LinkedHashMap}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/LruCache.java`
#### Snippet
```java
 * {@link org.apache.parquet.hadoop.LruCache.Value}).
 *
 * @param <K> The key type. Acts as the key in a {@link java.util.LinkedHashMap}
 * @param <V> The value type.  Must extend {@link org.apache.parquet.hadoop.LruCache.Value}
 *           so that the "staleness" of the value can be easily determined.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/LruCache.java`
#### Snippet
```java
 *
 * @param <K> The key type. Acts as the key in a {@link java.util.LinkedHashMap}
 * @param <V> The value type.  Must extend {@link org.apache.parquet.hadoop.LruCache.Value}
 *           so that the "staleness" of the value can be easily determined.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.fs` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java

  /**
   * A simple wrapper around {@link org.apache.hadoop.fs.FileStatus} with a
   * meaningful "toString()" method
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java

  /**
   * A simple wrapper around {@link org.apache.parquet.hadoop.Footer} that also includes a
   * modification time associated with that footer.  The modification time is
   * used to determine whether the footer is still current.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io` is unnecessary, and can be replaced with an import
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/InternalParquetRecordReader.java`
#### Snippet
```java
  private long currentRowIdx = -1;
  private PrimitiveIterator.OfLong rowIdxInFileItr;
  private org.apache.parquet.io.RecordReader<T> recordReader;
  private boolean strictTypeChecking;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values.bloomfilter` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/format/converter/ParquetMetadataConverter.java`
#### Snippet
```java

  public static BloomFilterHeader toBloomFilterHeader(
    org.apache.parquet.column.values.bloomfilter.BloomFilter bloomFilter) {

    BloomFilterAlgorithm algorithm = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapred` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/util/counters/mapred/MapRedCounterAdapter.java`
#### Snippet
```java
 */
public class MapRedCounterAdapter implements ICounter {
  private org.apache.hadoop.mapred.Counters.Counter adaptee;

  public MapRedCounterAdapter(Counters.Counter adaptee) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.conf` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetWriter.java`
#### Snippet
```java
   * Create a new ParquetWriter.
   *
   * Directly instantiates a Hadoop {@link org.apache.hadoop.conf.Configuration} which reads
   * configuration from the classpath.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapred` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/CodecConfig.java`
#### Snippet
```java
/**
 * Template class and factory for accessing codec related configurations in different APIs(mapreduce or mapred),
 * use {@link #from(org.apache.hadoop.mapred.JobConf)} for mapred API,
 * use {@link #from(org.apache.hadoop.mapreduce.TaskAttemptContext)} for mapreduce API
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapreduce` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/codec/CodecConfig.java`
#### Snippet
```java
 * Template class and factory for accessing codec related configurations in different APIs(mapreduce or mapred),
 * use {@link #from(org.apache.hadoop.mapred.JobConf)} for mapred API,
 * use {@link #from(org.apache.hadoop.mapreduce.TaskAttemptContext)} for mapreduce API
 */
public abstract class CodecConfig {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapred` is unnecessary, and can be replaced with an import
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/mapred/DeprecatedParquetOutputFormat.java`
#### Snippet
```java
import org.apache.parquet.hadoop.metadata.CompressionCodecName;

public class DeprecatedParquetOutputFormat<V> extends org.apache.hadoop.mapred.FileOutputFormat<Void, V> {

  public static void setWriteSupportClass(Configuration configuration,  Class<?> writeSupportClass) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapred` is unnecessary, and can be replaced with an import
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/mapred/DeprecatedParquetInputFormat.java`
#### Snippet
```java
import org.apache.parquet.hadoop.ParquetRecordReader;

public class DeprecatedParquetInputFormat<V> extends org.apache.hadoop.mapred.FileInputFormat<Void, Container<V>> {

  protected ParquetInputFormat<V> realInputFormat = new ParquetInputFormat<V>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop.api` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/example/GroupReadSupport.java`
#### Snippet
```java
  public RecordMaterializer<Group> prepareForRead(Configuration configuration,
      Map<String, String> keyValueMetaData, MessageType fileSchema,
      org.apache.parquet.hadoop.api.ReadSupport.ReadContext readContext) {
    return new GroupRecordConverter(readContext.getRequestedSchema());
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop.api` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/example/GroupReadSupport.java`
#### Snippet
```java

  @Override
  public org.apache.parquet.hadoop.api.ReadSupport.ReadContext init(
      Configuration configuration, Map<String, String> keyValueMetaData,
      MessageType fileSchema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop.api` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/example/GroupWriteSupport.java`
#### Snippet
```java

  @Override
  public org.apache.parquet.hadoop.api.WriteSupport.WriteContext init(Configuration configuration) {
    // if present, prefer the schema passed to the constructor
    if (schema == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/EncodingList.java`
#### Snippet
```java
  public int hashCode() {
    int result = 1;
    for (org.apache.parquet.column.Encoding element : encodings)
      result = 31 * result + (element == null ? 0 : element.hashCode());
    return result;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/metadata/EncodingList.java`
#### Snippet
```java
  public boolean equals(Object obj) {
    if (obj instanceof EncodingList) {
      List<org.apache.parquet.column.Encoding> other = ((EncodingList)obj).encodings;
      final int size = other.size();
      if (size != encodings.size()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.statistics` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
                columnIndex.getNullPages().size());
      }
      org.apache.parquet.column.statistics.Statistics.Builder statsBuilder =
              org.apache.parquet.column.statistics.Statistics.getBuilderForReading(type);
      statsBuilder.withNumNulls(columnIndex.getNullCounts().get(pageIndex));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.statistics` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/rewrite/ParquetRewriter.java`
#### Snippet
```java
      }
      org.apache.parquet.column.statistics.Statistics.Builder statsBuilder =
              org.apache.parquet.column.statistics.Statistics.getBuilderForReading(type);
      statsBuilder.withNumNulls(columnIndex.getNullCounts().get(pageIndex));

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.filter2.predicate` is unnecessary and can be removed
in `parquet-hadoop/src/main/java/org/apache/parquet/filter2/statisticslevel/StatisticsFilter.java`
#### Snippet
```java

/**
 * Applies a {@link org.apache.parquet.filter2.predicate.FilterPredicate} to statistics about a group of
 * records.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-cli/src/main/java/org/apache/parquet/cli/csv/AvroCSV.java`
#### Snippet
```java
   * @param makeNullable If {@code true}, the return type will be nullable
   * @return a {@code Schema} for the given {@code Schema.Type}
   * @see Schema#create(org.apache.avro.Schema.Type)
   */
  private static Schema schema(Schema.Type type, boolean makeNullable) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapreduce` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param job a job
   * @param avroReadSchema the requested schema
   * @see #setRequestedProjection(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param job a job
   * @param avroReadSchema the requested schema
   * @see #setRequestedProjection(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param avroReadSchema the requested schema
   * @see #setRequestedProjection(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setAvroReadSchema(Job job, Schema avroReadSchema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapreduce` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param avroReadSchema the requested schema
   * @see #setRequestedProjection(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setAvroReadSchema(Job job, Schema avroReadSchema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param avroReadSchema the requested schema
   * @see #setRequestedProjection(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setAvroReadSchema(Job job, Schema avroReadSchema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapreduce` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * must be compatible with the projection. For instance, if a column is not included
   * in the projection then it must either not be included or be optional in the read
   * schema. Use {@link #setAvroReadSchema(org.apache.hadoop.mapreduce.Job,
   * org.apache.avro.Schema)} to set a read schema, if needed.
   * @param job a job
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * in the projection then it must either not be included or be optional in the read
   * schema. Use {@link #setAvroReadSchema(org.apache.hadoop.mapreduce.Job,
   * org.apache.avro.Schema)} to set a read schema, if needed.
   * @param job a job
   * @param requestedProjection the requested projection schema
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapreduce` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param job a job
   * @param requestedProjection the requested projection schema
   * @see #setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param job a job
   * @param requestedProjection the requested projection schema
   * @see #setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param requestedProjection the requested projection schema
   * @see #setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setRequestedProjection(Job job, Schema requestedProjection) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapreduce` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param requestedProjection the requested projection schema
   * @see #setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setRequestedProjection(Job job, Schema requestedProjection) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetInputFormat.java`
#### Snippet
```java
   * @param requestedProjection the requested projection schema
   * @see #setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setRequestedProjection(Job job, Schema requestedProjection) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetOutputFormat.java`
#### Snippet
```java
   * @param job a job
   * @param schema a schema for the data that will be written
   * @see org.apache.parquet.avro.AvroParquetInputFormat#setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setSchema(Job job, Schema schema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.mapreduce` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetOutputFormat.java`
#### Snippet
```java
   * @param job a job
   * @param schema a schema for the data that will be written
   * @see org.apache.parquet.avro.AvroParquetInputFormat#setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setSchema(Job job, Schema schema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroParquetOutputFormat.java`
#### Snippet
```java
   * @param job a job
   * @param schema a schema for the data that will be written
   * @see org.apache.parquet.avro.AvroParquetInputFormat#setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setSchema(Job job, Schema schema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/io/EmptyRecordReader.java`
#### Snippet
```java

  /**
   * @see org.apache.parquet.io.RecordReader#read()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroReadSupport.java`
#### Snippet
```java
   * @param configuration a configuration
   * @param requestedProjection the requested projection schema
   * @see org.apache.parquet.avro.AvroParquetInputFormat#setRequestedProjection(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setRequestedProjection(Configuration configuration, Schema requestedProjection) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroReadSupport.java`
#### Snippet
```java
   * @param configuration a configuration
   * @param requestedProjection the requested projection schema
   * @see org.apache.parquet.avro.AvroParquetInputFormat#setRequestedProjection(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setRequestedProjection(Configuration configuration, Schema requestedProjection) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroReadSupport.java`
#### Snippet
```java
   * @param configuration a configuration
   * @param avroReadSchema the read schema
   * @see org.apache.parquet.avro.AvroParquetInputFormat#setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setAvroReadSchema(Configuration configuration, Schema avroReadSchema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroReadSupport.java`
#### Snippet
```java
   * @param configuration a configuration
   * @param avroReadSchema the read schema
   * @see org.apache.parquet.avro.AvroParquetInputFormat#setAvroReadSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setAvroReadSchema(Configuration configuration, Schema avroReadSchema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroWriteSupport.java`
#### Snippet
```java
   * @param configuration a configuration
   * @param schema the write schema
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setSchema(Configuration configuration, Schema schema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `parquet-avro/src/main/java/org/apache/parquet/avro/AvroWriteSupport.java`
#### Snippet
```java
   * @param configuration a configuration
   * @param schema the write schema
   * @see org.apache.parquet.avro.AvroParquetOutputFormat#setSchema(org.apache.hadoop.mapreduce.Job, org.apache.avro.Schema)
   */
  public static void setSchema(Configuration configuration, Schema schema) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/io/RecordReaderImplementation.java`
#### Snippet
```java

  /**
   * @see org.apache.parquet.io.RecordReader#read()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
      byte[] bytes = getBytesUnsafe();
      out.writeInt(bytes.length);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `parquet-column/src/main/java/org/apache/parquet/io/api/Binary.java`
#### Snippet
```java
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
      int length = in.readInt();
      byte[] bytes = new byte[length];
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getDescriptor()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getTotalValueCount()
   */
  @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#consume()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getFloat()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getLong()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getCurrentDefinitionLevel()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getBinary()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#skip()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getCurrentRepetitionLevel()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getBoolean()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#writeCurrentValueToConverter()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getDouble()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnReaderBase.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.ColumnReader#getInteger()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/factory/ValuesWriterFactory.java`
#### Snippet
```java
/**
 * Can be overridden to allow users to manually test different strategies to create ValuesWriters.
 * To do this, the ValuesWriterFactory to be used must be passed to the {@link org.apache.parquet.column.ParquetProperties.Builder}.
 * <p>
 * Lifecycle of ValuesWriterFactories is:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/factory/ValuesWriterFactory.java`
#### Snippet
```java
 * Lifecycle of ValuesWriterFactories is:
 * <ul>
 * <li> Initialized while creating a {@link org.apache.parquet.column.ParquetProperties} using the Builder</li>
 * <li> If the factory must read Hadoop config, it needs to implement the Configurable interface.
 * In addition to that, ParquetOutputFormat needs to be updated to pass in the Hadoop config via the setConf()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/plain/BooleanPlainValuesReader.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesReader#skip()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/plain/BooleanPlainValuesReader.java`
#### Snippet
```java
   *
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesReader#readBoolean()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/plain/BooleanPlainValuesReader.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesReader#initFromPage(int, ByteBufferInputStream)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/BitPackingValuesReader.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesReader#initFromPage(int, ByteBufferInputStream)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/BitPackingValuesReader.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesReader#readInteger()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/BitPackingValuesWriter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesWriter#writeInteger(int)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/BitPackingValuesWriter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesWriter#getAllocatedSize()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/BitPackingValuesWriter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesWriter#getBufferedSize()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/BitPackingValuesWriter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesWriter#getBytes()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.column.values` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/column/values/bitpacking/BitPackingValuesWriter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.column.values.ValuesWriter#reset()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.schema` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/schema/DecimalMetadata.java`
#### Snippet
```java

/**
 * @deprecated use {@link org.apache.parquet.schema.LogicalTypeAnnotation.DecimalLogicalTypeAnnotation}
 * with proper precision and scale parameters instead
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io.api` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/convert/SimplePrimitiveConverter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.io.api.PrimitiveConverter#addBoolean(boolean)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io.api` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/convert/SimplePrimitiveConverter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.io.api.PrimitiveConverter#addInt(int)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io.api` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/convert/SimplePrimitiveConverter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.io.api.PrimitiveConverter#addDouble(double)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io.api` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/convert/SimplePrimitiveConverter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.io.api.PrimitiveConverter#addBinary(Binary)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io.api` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/convert/SimplePrimitiveConverter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.io.api.PrimitiveConverter#addLong(long)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io.api` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/example/data/simple/convert/SimplePrimitiveConverter.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.io.api.PrimitiveConverter#addFloat(float)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/ValidTypeMap.java`
#### Snippet
```java
   * in the schema of the parquet file.
   *
   * @throws java.lang.IllegalArgumentException if the types do not align
   *
   * @param foundColumn the column as declared by the user
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.filter2.predicate` is unnecessary and can be removed
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicateBuilderBase.java`
#### Snippet
```java
 * org.apache.parquet.filter2.IncrementallyUpdatedFilterPredicateGenerator
 *
 * Constructs a {@link IncrementallyUpdatedFilterPredicate} from a {@link org.apache.parquet.filter2.predicate.FilterPredicate}
 * This is how records are filtered during record assembly. The implementation is generated in order to avoid autoboxing.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftToParquetFileWriter.java`
#### Snippet
```java
   * close the file
   *
   * @see java.io.Closeable#close()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop.api` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftReadSupport.java`
#### Snippet
```java
  public RecordMaterializer<T> prepareForRead(Configuration configuration,
      Map<String, String> keyValueMetaData, MessageType fileSchema,
      org.apache.parquet.hadoop.api.ReadSupport.ReadContext readContext) {
    ThriftMetaData thriftMetaData = ThriftMetaData.fromExtraMetaData(keyValueMetaData);
    try {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop.api` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/hadoop/thrift/ThriftReadSupport.java`
#### Snippet
```java

  @Override
  public org.apache.parquet.hadoop.api.ReadSupport.ReadContext init(InitContext context) {
    final Configuration configuration = context.getConfiguration();
    final MessageType fileMessageType = context.getFileSchema();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io` is unnecessary and can be removed
in `parquet-protobuf/src/main/java/org/apache/parquet/proto/ProtoMessageConverter.java`
#### Snippet
```java
    /**
     * Translates given parquet enum value to protocol buffer enum value.
     * @throws org.apache.parquet.io.InvalidRecordException is there is no corresponding value.
     * */
    private Descriptors.EnumValueDescriptor translateEnumValue(Binary binaryValue) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeI16(short)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeSetEnd()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeMapEnd()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeMessageBegin(org.apache.thrift.protocol.TMessage)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift.protocol` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeMessageBegin(org.apache.thrift.protocol.TMessage)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeMessageEnd()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeString(java.lang.String)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeString(java.lang.String)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeDouble(double)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeListEnd()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeMapBegin(org.apache.thrift.protocol.TMap)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift.protocol` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeMapBegin(org.apache.thrift.protocol.TMap)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeListBegin(org.apache.thrift.protocol.TList)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift.protocol` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeListBegin(org.apache.thrift.protocol.TList)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeI32(int)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeStructBegin(org.apache.thrift.protocol.TStruct)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift.protocol` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeStructBegin(org.apache.thrift.protocol.TStruct)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeBinary(java.nio.ByteBuffer)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeBinary(java.nio.ByteBuffer)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeFieldStop()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeFieldBegin(org.apache.thrift.protocol.TField)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift.protocol` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeFieldBegin(org.apache.thrift.protocol.TField)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeI64(long)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeBool(boolean)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeFieldEnd()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeStructEnd()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeSetBegin(org.apache.thrift.protocol.TSet)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift.protocol` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeSetBegin(org.apache.thrift.protocol.TSet)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ParquetWriteProtocol.java`
#### Snippet
```java
  /**
   * {@inheritDoc}
   * @see org.apache.parquet.thrift.ParquetProtocol#writeByte(byte)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
   * @param in  input protocol
   * @param out output protocol
   * @throws org.apache.thrift.TException         when an error happened while writing. Those are usually not recoverable
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift.protocol` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/BufferedProtocolReadToWrite.java`
#### Snippet
```java
 * <p>
 * When there are fields in the data that are not defined in the schema, the fields will be ignored and the handler will
 * be notified through {@link FieldIgnoredHandler#handleFieldIgnored(org.apache.thrift.protocol.TField)}
 * and {@link FieldIgnoredHandler#handleRecordHasFieldIgnored()}
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `parquet-pig/src/main/java/org/apache/parquet/pig/ParquetLoader.java`
#### Snippet
```java
  protected void storeInUDFContext(String key, Object value) {
    UDFContext udfContext = UDFContext.getUDFContext();
    java.util.Properties props = udfContext.getUDFProperties(
        this.getClass(), new String[]{signature});
    props.put(key, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io.api` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
   *
   * {@inheritDoc}
   * @see org.apache.parquet.io.api.RecordMaterializer#getRootConverter()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.io.api` is unnecessary and can be removed
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
   *
   * {@inheritDoc}
   * @see org.apache.parquet.io.api.RecordMaterializer#getCurrentRecord()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/MapConverter.java`
#### Snippet
```java

    @Override
    public Set<java.util.Map.Entry<String, Object>> entrySet() {
      return entrySet;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `parquet-pig/src/main/java/org/apache/parquet/pig/convert/MapConverter.java`
#### Snippet
```java
    private Set<Entry<String, Object>> entrySet = new AbstractSet<Map.Entry<String,Object>>() {
      @Override
      public Iterator<java.util.Map.Entry<String, Object>> iterator() {
        return entries.iterator();
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop` is unnecessary and can be removed
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java
    static WriteConfigurator DEFAULT = new WriteConfigurator() {
      @Override
      public <T> org.apache.parquet.hadoop.ParquetWriter.Builder<T, ?> configureBuilder(
          org.apache.parquet.hadoop.ParquetWriter.Builder<T, ?> builder) {
        return builder;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.parquet.hadoop` is unnecessary and can be removed
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/FilteringBenchmarks.java`
#### Snippet
```java
      @Override
      public <T> org.apache.parquet.hadoop.ParquetWriter.Builder<T, ?> configureBuilder(
          org.apache.parquet.hadoop.ParquetWriter.Builder<T, ?> builder) {
        return builder;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/Ints.java`
#### Snippet
```java
   * @return an int that is == to value
   * @throws IllegalArgumentException if value can't be casted to an int
   * @deprecated replaced by {@link java.lang.Math#toIntExact(long)}
   */
  public static int checkedCast(long value) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/Closeables.java`
#### Snippet
```java

/**
 * Utility for working with {@link java.io.Closeable}ss
 * @deprecated will be removed in 2.0.0. Use Java try-with-resource instead.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/util/DynMethods.java`
#### Snippet
```java

  /**
   * Convenience wrapper class around {@link java.lang.reflect.Method}.
   *
   * Allows callers to invoke the wrapped method with all Exceptions wrapped by
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataOutputStream.java`
#### Snippet
```java
   * @exception  IOException  if an I/O error occurs.
   * @see        java.io.FilterOutputStream#out
   * @see        java.lang.Double#doubleToLongBits(double)
   */
  public final void writeDouble(double v) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataOutputStream.java`
#### Snippet
```java
   * @exception  IOException  if an I/O error occurs.
   * @see        java.io.FilterOutputStream#out
   * @see        java.lang.Float#floatToIntBits(float)
   */
  public final void writeFloat(float v) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataOutputStream.java`
#### Snippet
```java
   * @exception  IOException  if an I/O error occurs.
   * @see        java.io.FilterOutputStream#out
   * @see        java.io.OutputStream#flush()
   */
  public void flush() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
  /**
   * @throws IOException if there is an exception while resetting the underlying stream
   * @see java.io.InputStream#reset()
   */
  public void reset() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
  /**
   * @param readlimit the number of bytes the mark will be valid for
   * @see java.io.InputStream#mark(int)
   */
  public void mark(int readlimit) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @return the number of bytes skipped
   * @throws IOException if there was an exception while reading
   * @see java.io.InputStream#skip(long)
   */
  public long skip(long n) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @return the next byte in the stream as an int
   * @throws IOException if there is an exception while reading
   * @see java.io.InputStream#read()
   */
  public int read() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   *             input stream does not support reading after close, or
   *             another I/O error occurs.
   * @see        java.lang.Double#longBitsToDouble(long)
   */
  public final double readDouble() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @return the number of bytes read
   * @throws IOException if there was an exception while reading
   * @see java.io.InputStream#read(byte[])
   */
  public int read(byte[] b) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
  /**
   * @return the hash code of the wrapped input stream
   * @see java.lang.Object#hashCode()
   */
  public int hashCode() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
  /**
   * @throws IOException if there was an exception while closing the underlying stream
   * @see java.io.InputStream#close()
   */
  public void close() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @return the number of bytes available in the wrapped stream
   * @throws IOException if there was an exception while getting the number of available bytes
   * @see java.io.InputStream#available()
   */
  public int available() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   *             input stream does not support reading after close, or
   *             another I/O error occurs.
   * @see        java.lang.Float#intBitsToFloat(int)
   */
  public final float readFloat() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
  /**
   * @return true if mark is supported
   * @see java.io.InputStream#markSupported()
   */
  public boolean markSupported() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @param obj another object
   * @return true if this is equal to the object
   * @see java.lang.Object#equals(java.lang.Object)
   */
  public boolean equals(Object obj) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @param obj another object
   * @return true if this is equal to the object
   * @see java.lang.Object#equals(java.lang.Object)
   */
  public boolean equals(Object obj) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @return the number of bytes read
   * @throws IOException if there was an exception while reading
   * @see java.io.InputStream#read(byte[], int, int)
   */
  public int read(byte[] b, int off, int len) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.arrow.vector.types.pojo` is unnecessary and can be removed
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java

      @Override
      public TypeMapping visit(org.apache.arrow.vector.types.pojo.ArrowType.FixedSizeList type) {
        return createListTypeMapping(type);
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.arrow.vector.types.pojo` is unnecessary and can be removed
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java

      @Override
      public TypeMapping visit(org.apache.arrow.vector.types.pojo.ArrowType.FixedSizeList type) {
        return createListTypeMapping();
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.arrow.vector.types.pojo` is unnecessary and can be removed
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java

      @Override
      public TypeMapping visit(org.apache.arrow.vector.types.pojo.ArrowType.List type) {
        return createListTypeMapping(type);
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.arrow.vector.types.pojo` is unnecessary and can be removed
in `parquet-arrow/src/main/java/org/apache/parquet/arrow/schema/SchemaConverter.java`
#### Snippet
```java

      @Override
      public TypeMapping visit(org.apache.arrow.vector.types.pojo.ArrowType.List type) {
        return createListTypeMapping();
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary and can be removed
in `parquet-common/src/main/java/org/apache/parquet/bytes/BytesInput.java`
#### Snippet
```java

    public ByteBuffer toByteBuffer() throws IOException {
      return java.nio.ByteBuffer.wrap(in, offset, length);
    }

```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `parquet-benchmarks/src/main/java/org/apache/parquet/benchmarks/BenchmarkUtils.java`
#### Snippet
```java
    } catch (IOException e) {
      System.err.println("Couldn't delete " + path);
      e.printStackTrace();
    }
  }
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new ColumnWriterProvider() can be replaced with method reference
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriteStoreBase.java`
#### Snippet
```java
    this.rowCountForNextSizeCheck = min(props.getMinRowCountForPageSizeCheck(), props.getPageRowCountLimit());

    columnWriterProvider = new ColumnWriterProvider() {
      @Override
      public ColumnWriter getColumnWriter(ColumnDescriptor path) {
```

### Anonymous2MethodRef
Anonymous new ColumnWriterProvider() can be replaced with method reference
in `parquet-column/src/main/java/org/apache/parquet/column/impl/ColumnWriteStoreBase.java`
#### Snippet
```java
    this.rowCountForNextSizeCheck = props.getMinRowCountForPageSizeCheck();

    columnWriterProvider = new ColumnWriterProvider() {
      @Override
      public ColumnWriter getColumnWriter(ColumnDescriptor path) {
```

### Anonymous2MethodRef
Anonymous new Iterable() can be replaced with method reference
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/struct/ThriftType.java`
#### Snippet
```java

    public Iterable<EnumValue> getValues() {
      return new Iterable<EnumValue>() {
        @Override
        public Iterator<EnumValue> iterator() {
```

### Anonymous2MethodRef
Anonymous new Consumer\>() can be replaced with method reference
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
              consumer.setVersion(value);
            }
          }).onField(SCHEMA, listOf(SchemaElement.class, new Consumer<List<SchemaElement>>() {
            @Override
            public void consume(List<SchemaElement> schema) {
```

### Anonymous2MethodRef
Anonymous new Consumer() can be replaced with method reference
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
              consumer.setNumRows(value);
            }
          }).onField(KEY_VALUE_METADATA, listElementsOf(struct(KeyValue.class, new Consumer<KeyValue>() {
            @Override
            public void consume(KeyValue kv) {
```

### Anonymous2MethodRef
Anonymous new Consumer() can be replaced with method reference
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java
              consumer.setCreatedBy(value);
            }
          }).onField(ENCRYPTION_ALGORITHM, struct(EncryptionAlgorithm.class, new Consumer<EncryptionAlgorithm>() {
            @Override
            public void consume(EncryptionAlgorithm encryptionAlgorithm) {
```

### Anonymous2MethodRef
Anonymous new Consumer() can be replaced with method reference
in `parquet-format-structures/src/main/java/org/apache/parquet/format/Util.java`
#### Snippet
```java

      if (!skipRowGroups) {
        eventConsumer = eventConsumer.onField(ROW_GROUPS, listElementsOf(struct(RowGroup.class, new Consumer<RowGroup>() {
          @Override
          public void consume(RowGroup rowGroup) {
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetFileWriter.java`
#### Snippet
```java
    for (Entry<String, String> entry : toMerge.getKeyValueMetaData().entrySet()) {
      Set<String> values = newKeyValues.get(entry.getKey());
      if (values == null) {
        values = new LinkedHashSet<String>();
        newKeyValues.put(entry.getKey(), values);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ShowPagesCommand.java`
#### Snippet
```java
        for (ColumnDescriptor descriptor : columns.keySet()) {
          List<String> lines = formatted.get(columnName(descriptor));
          if (lines == null) {
            lines = Lists.newArrayList();
            formatted.put(columnName(descriptor), lines);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `parquet-column/src/main/java/org/apache/parquet/io/MessageColumnIO.java`
#### Snippet
```java
    private List<ColumnWriter> getLeafWriters(GroupColumnIO group) {
      List<ColumnWriter> writers = groupToLeafWriter.get(group);
      if (writers == null) {
        writers = new ArrayList<>();
        groupToLeafWriter.put(group, writers);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/ValidTypeMap.java`
#### Snippet
```java
  private static void add(Class<?> c, PrimitiveTypeName p) {
    Set<PrimitiveTypeName> descriptors = classToParquetType.get(c);
    if (descriptors == null) {
      descriptors = new HashSet<>();
      classToParquetType.put(c, descriptors);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `parquet-column/src/main/java/org/apache/parquet/filter2/predicate/ValidTypeMap.java`
#### Snippet
```java

    Set<Class<?>> classes = parquetTypeToClass.get(p);
    if (classes == null) {
      classes = new HashSet<>();
      parquetTypeToClass.put(p, classes);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `parquet-column/src/main/java/org/apache/parquet/filter2/recordlevel/IncrementallyUpdatedFilterPredicateBuilderBase.java`
#### Snippet
```java
  protected final void addValueInspector(ColumnPath columnPath, ValueInspector valueInspector) {
    List<ValueInspector> valueInspectors = valueInspectorsByColumn.get(columnPath);
    if (valueInspectors == null) {
      valueInspectors = new ArrayList<>();
      valueInspectorsByColumn.put(columnPath, valueInspectors);
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `parquet-hadoop/src/main/java/org/apache/parquet/hadoop/ParquetInputFormat.java`
#### Snippet
```java
    private HDFSBlocks(BlockLocation[] hdfsBlocks) {
      this.hdfsBlocks = hdfsBlocks;
      Comparator<BlockLocation> comparator = new Comparator<BlockLocation>() {
        @Override
        public int compare(BlockLocation b1, BlockLocation b2) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/ParquetMetadataCommand.java`
#### Snippet
```java

    int size = maxSize(Iterables.transform(rowGroup.getColumns(),
        new Function<ColumnChunkMetaData, String>() {
          @Override
          public String apply(@Nullable ColumnChunkMetaData input) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `parquet-cli/src/main/java/org/apache/parquet/cli/commands/CheckParquet251Command.java`
#### Snippet
```java
      Iterables.addAll(columns, Iterables.filter(
          meta.getSchema().getColumns(),
          new Predicate<ColumnDescriptor>() {
            @Override
            public boolean apply(@Nullable ColumnDescriptor input) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `parquet-cli/src/main/java/org/apache/parquet/cli/json/AvroJson.java`
#### Snippet
```java
                                   int numRecords) {
    Iterator<Schema> schemas = Iterators.transform(parser(incoming),
        new Function<JsonNode, Schema>() {
          @Override
          public Schema apply(JsonNode node) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `parquet-column/src/main/java/org/apache/parquet/io/RecordReaderImplementation.java`
#### Snippet
```java
      state.definedCases = new ArrayList<>(definedCases.values());
      state.undefinedCases = new ArrayList<>(undefinedCases.values());
      Comparator<Case> caseComparator = new Comparator<Case>() {
        @Override
        public int compare(Case o1, Case o2) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `parquet-pig/src/main/java/org/apache/parquet/pig/summary/StringSummaryData.java`
#### Snippet
```java
    }
    List<EnumValueCount> list = new ArrayList<EnumValueCount>(values2);
    Collections.sort(list, new Comparator<EnumValueCount>() {
      @Override
      public int compare(EnumValueCount o1, EnumValueCount o2) {
```

## RuleId[ruleID=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
            return true;
          } else {
            continue;// check next field
          }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `parquet-thrift/src/main/java/org/apache/parquet/thrift/ThriftRecordConverter.java`
#### Snippet
```java
          return true; // if a field is missing in requested schema and it's required
        } else {
          continue; // the missing field is not required, then continue checking next field
        }
      }
```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `parquet-format-structures/src/main/java/org/apache/parquet/format/InterningProtocol.java`
#### Snippet
```java
  }

  public boolean equals(Object obj) {
    return delegate.equals(obj);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `parquet-common/src/main/java/org/apache/parquet/bytes/LittleEndianDataInputStream.java`
#### Snippet
```java
   * @see java.lang.Object#equals(java.lang.Object)
   */
  public boolean equals(Object obj) {
    return in.equals(obj);
  }
```

