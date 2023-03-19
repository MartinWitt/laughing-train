# fhir-data-pipes 
 
# Bad smells
I found 204 bad smells with 33 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 25 | false |
| ReturnNull | 24 | false |
| BoundedWildcard | 17 | false |
| NullableProblems | 12 | false |
| UtilityClassWithoutPrivateConstructor | 9 | true |
| UnnecessaryToStringCall | 9 | true |
| SystemOutErr | 9 | false |
| Convert2MethodRef | 7 | false |
| RegExpRedundantEscape | 7 | false |
| SizeReplaceableByIsEmpty | 7 | true |
| DynamicRegexReplaceableByCompiledPattern | 7 | false |
| NonSerializableFieldInSerializableClass | 6 | false |
| UnusedAssignment | 6 | false |
| RedundantFieldInitialization | 5 | false |
| OptionalGetWithoutIsPresent | 5 | false |
| ConstantValue | 5 | false |
| UnnecessaryLocalVariable | 4 | true |
| SimplifyStreamApiCallChains | 3 | false |
| AbstractClassNeverImplemented | 3 | false |
| UNUSED_IMPORT | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| InnerClassMayBeStatic | 2 | true |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| ThrowablePrintStackTrace | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| Convert2Lambda | 2 | false |
| RedundantCompareToJavaTime | 1 | false |
| UnnecessarySemicolon | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| RedundantCollectionOperation | 1 | false |
| Java9CollectionFactory | 1 | false |
| PublicFieldAccessedInSynchronizedContext | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| DefaultAnnotationParam | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| NestedAssignment | 1 | false |
| DuplicateThrows | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[id=RedundantCompareToJavaTime]
### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
    }
    logger.info("Last run was at {} next run is at {}", lastRunEnd, next);
    if (next.compareTo(LocalDateTime.now()) < 0) {
      logger.info("Incremental run triggered at {}", LocalDateTime.now());
      runIncrementalPipeline();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `FhirContexts` has only 'static' members, and lacks a 'private' constructor
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/FhirContexts.java`
#### Snippet
```java
 * that implement the {@link ProfileProvider} SPI.
 */
public class FhirContexts {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `DefinitionVisitorsUtil` has only 'static' members, and lacks a 'private' constructor
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java
 * DefinitionVisitor} interface.
 */
public class DefinitionVisitorsUtil {

  private static final Pattern STRUCTURE_URL_PATTERN =
```

### UtilityClassWithoutPrivateConstructor
Class `ControlPanelApplication` has only 'static' members, and lacks a 'private' constructor
in `pipelines/controller/src/main/java/org/openmrs/analytics/ControlPanelApplication.java`
#### Snippet
```java

@SpringBootApplication
public class ControlPanelApplication {

  public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `GZipUtil` has only 'static' members, and lacks a 'private' constructor
in `pipelines/common/src/main/java/org/openmrs/analytics/GZipUtil.java`
#### Snippet
```java
import org.apache.commons.io.IOUtils;

public class GZipUtil {

  public static String decompress(byte[] theResource) {
```

### UtilityClassWithoutPrivateConstructor
Class `GenerateSchemas` has only 'static' members, and lacks a 'private' constructor
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
 * Simple utility class to generate avro schemas for a given set of resource types.
 */
public class GenerateSchemas {

  public static final String DELIMITER = ";";
```

### UtilityClassWithoutPrivateConstructor
Class `ParquetMerger` has only 'static' members, and lacks a 'private' constructor
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
 * which does deduplication of resources too.
 */
public class ParquetMerger {

  private static final Logger log = LoggerFactory.getLogger(ParquetMerger.class);
```

### UtilityClassWithoutPrivateConstructor
Class `EtlUtils` has only 'static' members, and lacks a 'private' constructor
in `pipelines/batch/src/main/java/org/openmrs/analytics/EtlUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

class EtlUtils {

  static final String METRICS_NAMESPACE = "PipelineMetrics";
```

### UtilityClassWithoutPrivateConstructor
Class `Runner` has only 'static' members, and lacks a 'private' constructor
in `pipelines/streaming/src/main/java/org/openmrs/analytics/Runner.java`
#### Snippet
```java
// the
// changes in OpenMRS to FHIR resources that are exported to GCP FHIR store.
public class Runner {

  private static final Main MAIN = new Main();
```

### UtilityClassWithoutPrivateConstructor
Class `FhirEtl` has only 'static' members, and lacks a 'private' constructor
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirEtl.java`
#### Snippet
```java
 * A Beam pipeline for reading FHIR resources from OpenMRS and pushing them into a data warehouse.
 */
public class FhirEtl {

  private static final Logger log = LoggerFactory.getLogger(FhirEtl.class);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `pipelines/streaming/src/main/java/org/openmrs/analytics/DebeziumListener.java`
#### Snippet
```java

    public DebeziumArgs() {}
    ;

    @Parameter(
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
      List<ResourceId> paths =
          getAllChildDirectories(baseDir).stream()
              .filter(dir -> dir.getFilename().startsWith(prefix))
              .collect(Collectors.toList());

```

### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java

      for (ResourceId path : paths) {
        if (!path.getFilename().startsWith(prefix + DataProperties.TIMESTAMP_PREFIX)) {
          // This is not necessarily an error; the user may want to bootstrap from an already
          // created DWH outside the control-panel framework, e.g., by running the batch pipeline
```

### DataFlowIssue
Argument `structureDefinition` might be null
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java
                  .fetchStructureDefinition(typeRef.getCode());

          T child = transform(visitor, element, structureDefinition, new ArrayDeque<>());

          choiceTypes.put(typeRef.getCode(), child);
```

### DataFlowIssue
Argument `definition` might be null
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java
        StructureDefinition definition = getDefinition(element);

        if (shouldTerminateRecursive(visitor, definition, stack)) {

          return Collections.emptyList();
```

### DataFlowIssue
Argument `definition` might be null
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java
      StructureDefinition definition = getDefinition(element);

      if (shouldTerminateRecursive(visitor, definition, stack)) {

        return Collections.emptyList();
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java
                validation.fetchStructureDefinition(type.getTargetProfile());

            return targetDefinition.getType();
          })
          .sorted()
```

### DataFlowIssue
Argument `structureDefinition` might be null
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
                  .fetchStructureDefinition(typeRef.getCode());

          T child = transform(visitor, element, structureDefinition, new ArrayDeque<>());

          choiceTypes.put(typeRef.getCode(), child);
```

### DataFlowIssue
Argument `definition` might be null
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
        StructureDefinition definition = getDefinition(element);

        if (shouldTerminateRecursive(visitor, definition, stack)) {

          return Collections.emptyList();
```

### DataFlowIssue
Argument `definition` might be null
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
      StructureDefinition definition = getDefinition(element);

      if (shouldTerminateRecursive(visitor, definition, stack)) {

        return Collections.emptyList();
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
                validation.fetchStructureDefinition(profile.getValue());

            return targetDefinition.getType();
          })
          .sorted()
```

### DataFlowIssue
Dereference of `defaultDefinitions` may produce `NullPointerException`
in `bunsen/bunsen-uscore-resources/src/main/java/com/cerner/bunsen/UsCoreProfileProvider.java`
#### Snippet
```java
    PrePopulatedValidationSupport support = new PrePopulatedValidationSupport(context);
    List<IBaseResource> defaultDefinitions = defaultSupport.fetchAllStructureDefinitions();
    for (IBaseResource definition:  defaultDefinitions) {
      support.addStructureDefinition(definition);
    }
```

### DataFlowIssue
Argument `input` might be null
in `bunsen/bunsen-uscore-resources/src/main/java/com/cerner/bunsen/UsCoreProfileProvider.java`
#### Snippet
```java
        .getClassLoader()
        .getResourceAsStream(resource)) {
      IBaseResource definition = jsonParser.parseResource(new InputStreamReader(input));
      support.addStructureDefinition(definition);
    } catch (IOException exception) {
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
                        public void processElement(ProcessContext c) {
                          KV<String, CoGbkResult> e = c.element();
                          Iterable<GenericRecord> iter1 = e.getValue().getAll(tag1);
                          Iterable<GenericRecord> iter2 = e.getValue().getAll(tag2);
                          GenericRecord lastRecord = findLastRecord(iter1, iter2, numDuplicates);
```

### DataFlowIssue
Method invocation `getAll` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
                        public void processElement(ProcessContext c) {
                          KV<String, CoGbkResult> e = c.element();
                          Iterable<GenericRecord> iter1 = e.getValue().getAll(tag1);
                          Iterable<GenericRecord> iter2 = e.getValue().getAll(tag2);
                          GenericRecord lastRecord = findLastRecord(iter1, iter2, numDuplicates);
```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
                        OutputReceiver<SearchSegmentDescriptor> r) {
                      List<String> uuids = new ArrayList<String>();
                      element.getValue().forEach(uuids::add);
                      r.output(
                          SearchSegmentDescriptor.create(
```

### DataFlowIssue
Unboxing of `element.getKey()` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
                        KV<Integer, Integer> element, PreparedStatement preparedStatement)
                        throws SQLException {
                      preparedStatement.setInt(1, element.getKey());
                      preparedStatement.setInt(2, element.getValue());
                    }
```

### DataFlowIssue
Unboxing of `element.getValue()` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
                        throws SQLException {
                      preparedStatement.setInt(1, element.getKey());
                      preparedStatement.setInt(2, element.getValue());
                    }
                  })
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
                  KV<String, CoGbkResult> element = processContext.element();
                  Iterable<HapiRowDescriptor> hapiRowDescriptorIterable =
                      element.getValue().getAll(resourceTuple);
                  Iterable<ResourceTag> resourceTagIterable =
                      element.getValue().getAll(resourceTagTuple);
```

### DataFlowIssue
Method invocation `getAll` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
                  KV<String, CoGbkResult> element = processContext.element();
                  Iterable<HapiRowDescriptor> hapiRowDescriptorIterable =
                      element.getValue().getAll(resourceTuple);
                  Iterable<ResourceTag> resourceTagIterable =
                      element.getValue().getAll(resourceTagTuple);
```

### DataFlowIssue
Method invocation `getResourceId` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
                    public void processElement(ProcessContext processContext) {
                      ResourceTag resourceTag = processContext.element();
                      processContext.output(KV.of(resourceTag.getResourceId(), resourceTag));
                    }
                  }));
```

### DataFlowIssue
Method invocation `resourceType` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
                      (JdbcIO.PreparedStatementSetter<QueryParameterDescriptor>)
                          (element, preparedStatement) -> {
                            preparedStatement.setString(1, element.resourceType());
                            preparedStatement.setInt(2, element.numBatches());
                            preparedStatement.setInt(3, element.batchId());
```

### DataFlowIssue
Method invocation `resourceType` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
                      (JdbcIO.PreparedStatementSetter<QueryParameterDescriptor>)
                          (element, preparedStatement) -> {
                            preparedStatement.setString(1, element.resourceType());
                            preparedStatement.setInt(2, element.numBatches());
                            preparedStatement.setInt(3, element.batchId());
```

### DataFlowIssue
Method invocation `resourceId` may produce `NullPointerException`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
                      HapiRowDescriptor hapiRowDescriptor = processContext.element();
                      processContext.output(
                          KV.of(hapiRowDescriptor.resourceId(), hapiRowDescriptor));
                    }
                  }));
```

### DataFlowIssue
Argument `element` might be null
in `pipelines/batch/src/main/java/org/openmrs/analytics/ConvertResourceFn.java`
#### Snippet
```java
      throws IOException, ParseException, SQLException {
    HapiRowDescriptor element = processContext.element();
    writeResource(element);
  }
}
```

### DataFlowIssue
Argument `resourceId.getFilename()` might be null
in `pipelines/common/src/main/java/org/openmrs/analytics/DwhFiles.java`
#### Snippet
```java
                  FileSystems.matchNewResource(destDwh.getRoot(), true)
                      .resolve(resourceType, StandardResolveOptions.RESOLVE_DIRECTORY)
                      .resolve(resourceId.getFilename(), StandardResolveOptions.RESOLVE_FILE);
              destResourceIdList.add(destResourceId);
            });
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
          .filter(type -> "Reference".equals(type.getCode()))
          .filter(type -> type.getTargetProfile() != null)
          .map(type -> type.getTargetProfile())
          // Note there is a difference between how `Reference` types are represented in R4 vs STU3,
          // in R4 all "target profiles" (i.e., reference's target type) are under the same `type`
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java

    // Generate a record name based on the type of references it can contain.
    String recordName = referenceTypes.stream().collect(Collectors.joining()) + "Reference";

    String fullName = basePackage + "." + recordName;
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `pipelines/common/src/main/java/org/openmrs/analytics/DwhFiles.java`
#### Snippet
```java
    List<ResourceId> destResourceIdList = new ArrayList<>();
    sourceResourceIdList.stream()
        .forEach(
            resourceId -> {
              ResourceId destResourceId =
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `pipelines/controller/src/main/java/org/openmrs/analytics/DataProperties.java`
#### Snippet
```java
    // Get hold of thrift server parquet directory from dwhRootPrefix config.
    String thriftServerParquetPathPrefix =
        dwhRootPrefix.substring(dwhRootPrefix.lastIndexOf("/") + 1, dwhRootPrefix.length());
    pipelineConfigBuilder.thriftServerParquetPath(
        thriftServerParquetPathPrefix + TIMESTAMP_PREFIX + timestampSuffix);
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3FhirConversionSupport.java`
#### Snippet
```java
      // so just use the first when converting to a map.
      return children.stream()
          .filter(property -> property.hasValues())
          .collect(
              Collectors.toMap(Property::getName,
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3FhirConversionSupport.java`
#### Snippet
```java
          .collect(
              Collectors.toMap(Property::getName,
                  property -> property.getValues(),
                  (first, second) -> first));
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4FhirConversionSupport.java`
#### Snippet
```java
      // so just use the first when converting to a map.
      return children.stream()
          .filter(property -> property.hasValues())
          .collect(
              Collectors.toMap(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4FhirConversionSupport.java`
#### Snippet
```java
          .collect(
              Collectors.toMap(
                  Property::getName, property -> property.getValues(), (first, second) -> first));
    }
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
          .filter(type -> "Reference".equals(type.getCode()))
          .filter(type -> type.getTargetProfile() != null)
          .map(type -> type.getTargetProfile())
          // Note there is a difference between how `Reference` types are represented in R4 vs STU3,
          // in R4 all "target profiles" (i.e., reference's target type) are under the same `type`
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
        .skip(1)
        .collect(Collectors.toMap(item -> item.split(DELIMITER)[0],
            item -> generateContainedUrls(item)));

    List<Schema> schemas = AvroConverter.generateSchemas(FhirContexts.forStu3(), resourceTypeUrls);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `pipelines/common/src/main/java/org/openmrs/analytics/DwhFiles.java`
#### Snippet
```java
        List<ResourceId> resourceIds =
            matchResult.metadata().stream()
                .map(metadata -> metadata.resourceId())
                .collect(Collectors.toList());
        sourceResourceIdList.addAll(resourceIds);
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java

  private static final Pattern STRUCTURE_URL_PATTERN =
      Pattern.compile("http:\\/\\/hl7.org\\/fhir(\\/.*)?\\/StructureDefinition\\/([^\\/]*)$");


```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java

  private static final Pattern STRUCTURE_URL_PATTERN =
      Pattern.compile("http:\\/\\/hl7.org\\/fhir(\\/.*)?\\/StructureDefinition\\/([^\\/]*)$");


```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java

  private static final Pattern STRUCTURE_URL_PATTERN =
      Pattern.compile("http:\\/\\/hl7.org\\/fhir(\\/.*)?\\/StructureDefinition\\/([^\\/]*)$");


```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java

  private static final Pattern STRUCTURE_URL_PATTERN =
      Pattern.compile("http:\\/\\/hl7.org\\/fhir(\\/.*)?\\/StructureDefinition\\/([^\\/]*)$");


```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java

  private static final Pattern STRUCTURE_URL_PATTERN =
      Pattern.compile("http:\\/\\/hl7.org\\/fhir(\\/.*)?\\/StructureDefinition\\/([^\\/]*)$");


```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java

  private static final Pattern STRUCTURE_URL_PATTERN =
      Pattern.compile("http:\\/\\/hl7.org\\/fhir(\\/.*)?\\/StructureDefinition\\/([^\\/]*)$");


```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java

  private static final Pattern STRUCTURE_URL_PATTERN =
      Pattern.compile("http:\\/\\/hl7.org\\/fhir(\\/.*)?\\/StructureDefinition\\/([^\\/]*)$");


```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `pipelines/batch/src/main/java/org/openmrs/analytics/ConvertResourceFn.java`
#### Snippet
```java
    this.totalGenerateTimeMillisMap = new HashMap<String, Counter>();
    this.totalPushTimeMillisMap = new HashMap<String, Counter>();
    List<String> resourceTypes = Arrays.asList(options.getResourceList().split(","));
    for (String resourceType : resourceTypes) {
      this.numFetchedResourcesMap.put(
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'fhirStoreUtil' in a Serializable class
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchSearchPageFn.java`
#### Snippet
```java
  protected FhirSearchUtil fhirSearchUtil;

  protected FhirStoreUtil fhirStoreUtil;

  protected JdbcResourceWriter jdbcWriter;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'jdbcWriter' in a Serializable class
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchSearchPageFn.java`
#### Snippet
```java
  protected FhirStoreUtil fhirStoreUtil;

  protected JdbcResourceWriter jdbcWriter;

  protected IParser parser;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parquetUtil' in a Serializable class
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchSearchPageFn.java`
#### Snippet
```java
  private final int maxPoolSize;

  @VisibleForTesting protected ParquetUtil parquetUtil;

  protected OpenmrsUtil openmrsUtil;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'fhirSearchUtil' in a Serializable class
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchSearchPageFn.java`
#### Snippet
```java
  protected OpenmrsUtil openmrsUtil;

  protected FhirSearchUtil fhirSearchUtil;

  protected FhirStoreUtil fhirStoreUtil;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'fhirContext' in a Serializable class
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchSearchPageFn.java`
#### Snippet
```java
  protected IParser parser;

  protected FhirContext fhirContext;

  private static JdbcConnectionUtil jdbcConnectionUtil = null;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'openmrsUtil' in a Serializable class
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchSearchPageFn.java`
#### Snippet
```java
  @VisibleForTesting protected ParquetUtil parquetUtil;

  protected OpenmrsUtil openmrsUtil;

  protected FhirSearchUtil fhirSearchUtil;
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`profile.length() > 0` can be replaced with '!profile.isEmpty()'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java
      String profile = matcher.group(1);

      if (profile != null && profile.length() > 0) {

        String subPackage = profile.replaceAll("/", ".");
```

### SizeReplaceableByIsEmpty
`extensionList.size() > 0` can be replaced with '!extensionList.isEmpty()'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/HapiCompositeConverter.java`
#### Snippet
```java
            .collect(Collectors.toList());

        if (extensionList.size() > 0) {
          values[valueIndex] = schemaEntry.result().fromHapi(extensionList);
        }
```

### SizeReplaceableByIsEmpty
`extensions.size() > 0` can be replaced with '!extensions.isEmpty()'
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java
    }

    if (!element.getMax().equals("1") && extensions.size() > 0) {
      // the nested extension element has max: *
      return Collections.singletonList(StructureField.extension(
```

### SizeReplaceableByIsEmpty
`containedDefinitions.size() > 0` can be replaced with '!containedDefinitions.isEmpty()'
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java

    // If there are contained definitions, create a Resource Container StructureField
    if (containedDefinitions.size() > 0) {

      StructureField<T> containedElement = transformContained(visitor,
```

### SizeReplaceableByIsEmpty
`containedDefinitions.size() > 0` can be replaced with '!containedDefinitions.isEmpty()'
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java

    // If there are contained definitions, create a Resource Container StructureField
    if (containedDefinitions.size() > 0) {

      StructureField<T> containedElement = transformContained(visitor,
```

### SizeReplaceableByIsEmpty
`extensions.size() > 0` can be replaced with '!extensions.isEmpty()'
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
    }

    if (!element.getMax().equals("1") && extensions.size() > 0) {
      // the nested extension element has max: *
      return Collections.singletonList(StructureField.extension(
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
  private static String lowercase(String string) {

    if (string.length() == 0) {

      return string;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
              new BearerTokenAuthInterceptor(credential.refreshAccessToken().getTokenValue())));
    } catch (IOException e) {
      log.error(String.format("IOException while using Google APIs: %s", e.toString()));
    } catch (URISyntaxException e) {
      log.error(String.format("URI syntax exception while using Google APIs: %s", e.toString()));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
      log.error(String.format("IOException while using Google APIs: %s", e.toString()));
    } catch (URISyntaxException e) {
      log.error(String.format("URI syntax exception while using Google APIs: %s", e.toString()));
    }
    return null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
              new BearerTokenAuthInterceptor(credential.refreshAccessToken().getTokenValue())));
    } catch (IOException e) {
      log.error("IOException while using Google APIs: {}", e.toString(), e);
    } catch (URISyntaxException e) {
      log.error("URI syntax exception while using Google APIs: {}", e.toString(), e);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
      log.error("IOException while using Google APIs: {}", e.toString(), e);
    } catch (URISyntaxException e) {
      log.error("URI syntax exception while using Google APIs: {}", e.toString(), e);
    }
    return null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
      updateFhirResource(sinkUrl, resource);
    } catch (Exception e) {
      log.error(String.format("Exception while sending to sink: %s", e.toString()));
    }
    return null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirSearchUtil.java`
#### Snippet
```java
            String.format("No _getpages parameter found in search link %s", searchLink));
      }
      return openmrsUtil.getSourceFhirUrl() + "?" + pagesParam.toString();
    } catch (URISyntaxException e) {
      throw new IllegalArgumentException(
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirSearchUtil.java`
#### Snippet
```java
            String.format(
                "While searching for resource %s with date, caught exception %s",
                resourceType, e.toString()));
        log.info("Trying without date for resource " + resourceType);
        searchBundle = makeQueryForResource(resourceType, options.getBatchSize()).execute();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pipelines/batch/src/main/java/org/openmrs/analytics/ReadJsonFilesFn.java`
#### Snippet
```java
            String.format(
                "The content of file %s is not a Bundle; type is %s.",
                file.getMetadata().toString(), resource.fhirType()));
      }
      Bundle bundle = (Bundle) resource;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pipelines/batch/src/main/java/org/openmrs/analytics/ReadJsonFilesFn.java`
#### Snippet
```java
      processBundle(bundle, resourceTypes);
    } catch (DataFormatException | ClassCastException e) {
      log.error("Cannot parse content of file " + file.getMetadata().toString() + e);
    }
  }
```

## RuleId[id=Java9CollectionFactory]
### Java9CollectionFactory
Can be replaced with 'Map.of()' call
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirEtl.java`
#### Snippet
```java
    tempMap.put("obs", "obs_datetime");
    tempMap.put("visit", "date_started");
    tableDateColumn = Collections.unmodifiableMap(tempMap);
  }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ContainerEntry` may be 'static'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/HapiContainedConverter.java`
#### Snippet
```java
   * Represents the association of a contained element to its type.
   */
  protected final class ContainerEntry {

    private final String elementType;
```

### InnerClassMayBeStatic
Inner class `MultiValuedtoHapiConverter` may be 'static'
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
      MultiValueConverter {

    private class MultiValuedtoHapiConverter implements HapiFieldSetter {

      private final BaseRuntimeElementDefinition elementDefinition;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `HapiRowDescriptor` has no concrete subclass
in `pipelines/batch/src/main/java/org/openmrs/analytics/HapiRowDescriptor.java`
#### Snippet
```java
@AutoValue
@Data
abstract class HapiRowDescriptor implements Serializable {

  private static final long serialVersionUID = 1L;
```

### AbstractClassNeverImplemented
Abstract class `QueryParameterDescriptor` has no concrete subclass
in `pipelines/batch/src/main/java/org/openmrs/analytics/QueryParameterDescriptor.java`
#### Snippet
```java
@DefaultCoder(SerializableCoder.class)
@AutoValue
abstract class QueryParameterDescriptor implements Serializable {

  static QueryParameterDescriptor create(String resourceType, int numBatches, int batchId) {
```

### AbstractClassNeverImplemented
Abstract class `SearchSegmentDescriptor` has no concrete subclass
in `pipelines/batch/src/main/java/org/openmrs/analytics/SearchSegmentDescriptor.java`
#### Snippet
```java
@DefaultCoder(SerializableCoder.class)
@AutoValue
abstract class SearchSegmentDescriptor implements Serializable {

  static SearchSegmentDescriptor create(String searchUrl, int count) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends IClientInterceptor`
in `pipelines/common/src/main/java/org/openmrs/analytics/FhirStoreUtil.java`
#### Snippet
```java

  protected IGenericClient createGenericClient(
      String sinkUrl, Collection<IClientInterceptor> interceptors) {
    IGenericClient client = clientFactory.newGenericClient(sinkUrl);

```

### BoundedWildcard
Can generalize to `? extends StructureDefinition`
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java
  private <T> StructureField<T> transformContained(DefinitionVisitor<T> visitor,
      StructureDefinition rootDefinition,
      List<StructureDefinition> containedDefinitions,
      Deque<QualifiedPath> stack,
      ElementDefinition element) {
```

### BoundedWildcard
Can generalize to `? extends ElementDefinition`
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java

  private List<ElementDefinition> getChildren(ElementDefinition parent,
      List<ElementDefinition> definitions) {

    if (parent.getContentReference() != null) {
```

### BoundedWildcard
Can generalize to `? extends ElementDefinition`
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java

  private List<ElementDefinition> getChildren(ElementDefinition parent,
      List<ElementDefinition> definitions) {

    if (parent.getContentReference() != null) {
```

### BoundedWildcard
Can generalize to `? extends StructureDefinition`
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
  private <T> StructureField<T> transformContained(DefinitionVisitor<T> visitor,
      StructureDefinition rootDefinition,
      List<StructureDefinition> containedDefinitions,
      Deque<QualifiedPath> stack,
      ElementDefinition element) {
```

### BoundedWildcard
Can generalize to `? extends GenericRecord`
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java

  private static GenericRecord findLastRecord(
      Iterable<GenericRecord> iter1, Iterable<GenericRecord> iter2, Counter numDuplicates) {
    // Note we are assuming all times have the same time-zone to avoid parsing date values.
    String lastUpdated = null;
```

### BoundedWildcard
Can generalize to `? extends GenericRecord`
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java

  private static GenericRecord findLastRecord(
      Iterable<GenericRecord> iter1, Iterable<GenericRecord> iter2, Counter numDuplicates) {
    // Note we are assuming all times have the same time-zone to avoid parsing date values.
    String lastUpdated = null;
```

### BoundedWildcard
Can generalize to `? super KV`
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
              @ProcessElement
              public void processElement(
                  @Element GenericRecord record, OutputReceiver<KV<String, GenericRecord>> out) {
                String id = record.get(ID_KEY).toString();
                if (id == null) {
```

### BoundedWildcard
Can generalize to `? super KV`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
                    @ProcessElement
                    public void processElement(
                        @Element String element, OutputReceiver<KV<String, String>> r) {
                      if (element != null) {
                        r.output(KV.of(resourceType, element));
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
                    @ProcessElement
                    public void processElement(
                        @Element KV<String, Iterable<String>> element,
                        OutputReceiver<SearchSegmentDescriptor> r) {
                      List<String> uuids = new ArrayList<String>();
```

### BoundedWildcard
Can generalize to `? super SearchSegmentDescriptor`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
                    public void processElement(
                        @Element KV<String, Iterable<String>> element,
                        OutputReceiver<SearchSegmentDescriptor> r) {
                      List<String> uuids = new ArrayList<String>();
                      element.getValue().forEach(uuids::add);
```

### BoundedWildcard
Can generalize to `? extends HapiRowDescriptor`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java

    private PCollection<HapiRowDescriptor> joinResourceTagCollections(
        PCollection<HapiRowDescriptor> hapiRowDescriptorPCollection,
        PCollection<ResourceTag> resourceTagPCollection) {
      // Step to convert HapiRowDescriptor to key value struct <ResourceId, HapiRowDescriptor>,
```

### BoundedWildcard
Can generalize to `? extends ResourceTag`
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
    private PCollection<HapiRowDescriptor> joinResourceTagCollections(
        PCollection<HapiRowDescriptor> hapiRowDescriptorPCollection,
        PCollection<ResourceTag> resourceTagPCollection) {
      // Step to convert HapiRowDescriptor to key value struct <ResourceId, HapiRowDescriptor>,
      // this will help in joining with tag PCollection.
```

### BoundedWildcard
Can generalize to `? extends Schema`
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/AvroConverter.java`
#### Snippet
```java
  private final HapiObjectConverter avroToHapiConverter;

  private AvroConverter(HapiConverter<Schema> hapiToAvroConverter,
      RuntimeResourceDefinition... resources) {

```

### BoundedWildcard
Can generalize to `? extends StructureField`>
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
  public HapiConverter<Schema> visitReference(String elementName,
      List<String> referenceTypes,
      List<StructureField<HapiConverter<Schema>>> children) {

    // Generate a record name based on the type of references it can contain.
```

### BoundedWildcard
Can generalize to `? super String`
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
  public DefinitionToAvroVisitor(FhirConversionSupport fhirSupport,
      String basePackage,
      Map<String,HapiConverter<Schema>> visitedConverters) {

    this.fhirSupport = fhirSupport;
```

### BoundedWildcard
Can generalize to `? extends ConfigFields`
in `pipelines/controller/src/main/java/org/openmrs/analytics/DataProperties.java`
#### Snippet
```java
  }

  void sortConfigList(List<ConfigFields> configFields) {
    configFields.sort(Comparator.comparing(c -> c.name));
  }
```

## RuleId[id=NullableProblems]
### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchResources.java`
#### Snippet
```java
 */
public class FetchResources
    extends PTransform<PCollection<SearchSegmentDescriptor>, PCollection<KV<String, Integer>>> {

  private static final Logger log = LoggerFactory.getLogger(FetchResources.class);
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchResources.java`
#### Snippet
```java
 */
public class FetchResources
    extends PTransform<PCollection<SearchSegmentDescriptor>, PCollection<KV<String, Integer>>> {

  private static final Logger log = LoggerFactory.getLogger(FetchResources.class);
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchPatientHistory.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class FetchPatientHistory extends PTransform<PCollection<KV<String, Integer>>, PDone> {

  private static final Logger log = LoggerFactory.getLogger(FetchPatientHistory.class);
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchPatientHistory.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class FetchPatientHistory extends PTransform<PCollection<KV<String, Integer>>, PDone> {

  private static final Logger log = LoggerFactory.getLogger(FetchPatientHistory.class);
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java

  public static class FetchUuids
      extends PTransform<PCollection<KV<Integer, Integer>>, PCollection<String>> {

    private final String tableName;
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java

  public static class FetchUuids
      extends PTransform<PCollection<KV<Integer, Integer>>, PCollection<String>> {

    private final String tableName;
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
   */
  public static class CreateSearchSegments
      extends PTransform<PCollection<String>, PCollection<SearchSegmentDescriptor>> {

    private final String baseBundleUrl;
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
   */
  public static class CreateSearchSegments
      extends PTransform<PCollection<String>, PCollection<SearchSegmentDescriptor>> {

    private final String baseBundleUrl;
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchPatients.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class FetchPatients extends PTransform<PCollection<KV<String, Integer>>, PDone> {

  private static final Logger log = LoggerFactory.getLogger(FetchPatientHistory.class);
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchPatients.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class FetchPatients extends PTransform<PCollection<KV<String, Integer>>, PDone> {

  private static final Logger log = LoggerFactory.getLogger(FetchPatientHistory.class);
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
   */
  public static class FetchRowsJdbcIo
      extends PTransform<PCollection<QueryParameterDescriptor>, PCollection<HapiRowDescriptor>> {

    private final JdbcIO.DataSourceConfiguration dataSourceConfig;
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
   */
  public static class FetchRowsJdbcIo
      extends PTransform<PCollection<QueryParameterDescriptor>, PCollection<HapiRowDescriptor>> {

    private final JdbcIO.DataSourceConfiguration dataSourceConfig;
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `PARQUET_EXTENSION` accessed in synchronized context
in `pipelines/common/src/main/java/org/openmrs/analytics/ParquetUtil.java`
#### Snippet
```java
            System.currentTimeMillis(),
            random.nextInt(1000000),
            PARQUET_EXTENSION);
    return resourceId.resolve(uniquetFileName, StandardResolveOptions.RESOLVE_FILE);
  }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java

    if (args.length < 2) {
      System.out.println("Usage: GenerateSchemas <output file> resourceTypeUrls...");
      System.out.println("Example:");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
    if (args.length < 2) {
      System.out.println("Usage: GenerateSchemas <output file> resourceTypeUrls...");
      System.out.println("Example:");

      System.out.println("  GenerateSchemas my_schemas.avsc "
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
      System.out.println("Example:");

      System.out.println("  GenerateSchemas my_schemas.avsc "
          + "http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient "
          + "http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
          + "http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition");

      System.out.println();
      System.out.println("The resulting avsc file then can be used to generate Java classes "
          + "using avro-tools, for example:");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java

      System.out.println();
      System.out.println("The resulting avsc file then can be used to generate Java classes "
          + "using avro-tools, for example:");
      System.out.println("  avro-tools compile protocol my_schemas.avsc <target_directory>");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
      System.out.println("The resulting avsc file then can be used to generate Java classes "
          + "using avro-tools, for example:");
      System.out.println("  avro-tools compile protocol my_schemas.avsc <target_directory>");

      return 1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
    if (outputFile.exists()) {

      System.out.println("File " + outputFile.getName() + " already exists.");
      return 1;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
    } catch (IOException exception) {

      System.out.println("Unable to write file " + outputFile.getPath());
      exception.printStackTrace();
      return 1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `pipelines/streaming/src/main/java/org/openmrs/analytics/Runner.java`
#### Snippet
```java
    MAIN.enableHangupSupport();
    // echo to console how to terminate
    System.out.println("\n\nThe pipeline in now running. You can press ctrl + c to stop.\n\n");
    MAIN.run();
  }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `pipelines/common/src/main/java/org/openmrs/analytics/GZipUtil.java`
#### Snippet
```java
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(theResource);
      GZIPInputStream inputStream = new GZIPInputStream(byteArrayInputStream);
      return IOUtils.toString(inputStream, "UTF-8");
    } catch (IOException exception) {
      exception.printStackTrace();
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `pipelines/controller/src/main/java/org/openmrs/analytics/ApiController.java`
#### Snippet
```java

  @PostMapping("/run")
  public String runBatch(@RequestParam(name = "isFullRun", required = true) boolean isFullRun)
      throws IOException, PropertyVetoException {
    if (pipelineManager.isRunning()) {
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
secondsToFlush \* 1000: integer multiplication implicitly cast to long
in `pipelines/common/src/main/java/org/openmrs/analytics/ParquetUtil.java`
#### Snippet
```java
          };
      this.timer = new Timer();
      timer.scheduleAtFixedRate(task, secondsToFlush * 1000, secondsToFlush * 1000);
    } else {
      timer = null;
```

### IntegerMultiplicationImplicitCastToLong
secondsToFlush \* 1000: integer multiplication implicitly cast to long
in `pipelines/common/src/main/java/org/openmrs/analytics/ParquetUtil.java`
#### Snippet
```java
          };
      this.timer = new Timer();
      timer.scheduleAtFixedRate(task, secondsToFlush * 1000, secondsToFlush * 1000);
    } else {
      timer = null;
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'var.isEmpty()' covered by subsequent condition '!var.startsWith(...)'
in `pipelines/streaming/src/main/java/org/openmrs/analytics/StatusServer.java`
#### Snippet
```java
      String var = exchange.getRequestURI().getPath().replaceFirst(PATH_PREFIX, "");
      String response = "";
      if (var.isEmpty() || !var.startsWith("/")) {
        StringBuilder builder =
            new StringBuilder(
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
      log.info(String.format("Full URL is: %s", uriBuilder.build()));

      return super.updateFhirResource(
          uri,
          resource,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
      log.info("Full URL is: {}", uriBuilder.build());

      return super.uploadBundle(
          uri,
          bundle,
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java
      if (profile != null && profile.length() > 0) {

        String subPackage = profile.replaceAll("/", ".");

        return basePackage + subPackage;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pipelines/streaming/src/main/java/org/openmrs/analytics/StatusServer.java`
#### Snippet
```java
    public void handle(HttpExchange exchange) throws IOException {
      log.info("Received request: " + exchange.getRequestURI());
      String var = exchange.getRequestURI().getPath().replaceFirst(PATH_PREFIX, "");
      String response = "";
      if (var.isEmpty() || !var.startsWith("/")) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
    String localPart = extensionUrl.substring(extensionUrl.lastIndexOf('/') + 1);

    String[] parts = localPart.split("[-|_]");

    String recordName = Arrays.stream(parts).map(part ->
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pipelines/controller/src/main/java/org/openmrs/analytics/DataProperties.java`
#### Snippet
```java
    // Using underscore for suffix as hyphens are discouraged in hive table names.
    String timestampSuffix =
        Instant.now().toString().replaceAll(":", "-").replaceAll("-", "_").replaceAll("\\.", "_");
    options.setOutputParquetPath(dwhRootPrefix + TIMESTAMP_PREFIX + timestampSuffix);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pipelines/controller/src/main/java/org/openmrs/analytics/DataProperties.java`
#### Snippet
```java
    // Using underscore for suffix as hyphens are discouraged in hive table names.
    String timestampSuffix =
        Instant.now().toString().replaceAll(":", "-").replaceAll("-", "_").replaceAll("\\.", "_");
    options.setOutputParquetPath(dwhRootPrefix + TIMESTAMP_PREFIX + timestampSuffix);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pipelines/controller/src/main/java/org/openmrs/analytics/DataProperties.java`
#### Snippet
```java
    // Using underscore for suffix as hyphens are discouraged in hive table names.
    String timestampSuffix =
        Instant.now().toString().replaceAll(":", "-").replaceAll("-", "_").replaceAll("\\.", "_");
    options.setOutputParquetPath(dwhRootPrefix + TIMESTAMP_PREFIX + timestampSuffix);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `pipelines/streaming/src/main/java/org/openmrs/analytics/FhirConverter.java`
#### Snippet
```java
    }
    final String fhirResource =
        config.getLinkTemplates().get("fhir").replace("/{uuid}", "").replaceAll("/", "");
    updateLastResourceTime(fhirResource, message);

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/FhirConversionSupport.java`
#### Snippet
```java
   * @return the resources of the specified type.
   */
  public abstract java.util.List<IBaseResource> extractEntryFromBundle(IBaseBundle bundle,
      String resourceType);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.openmrs.analytics` is unnecessary and can be removed
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
 * generic communication patterns in FhirStoreUtil.
 *
 * @see org.openmrs.analytics.FhirStoreUtil
 */
class GcpStoreUtil extends FhirStoreUtil {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.google.common.collect.ImmutableList;`
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
import com.cerner.bunsen.FhirContexts;
import com.cerner.bunsen.avro.AvroConverter;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Function;`
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.avro.Protocol;
```

### UNUSED_IMPORT
Unused import `import com.google.common.base.Preconditions;`
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/IdConverter.java`
#### Snippet
```java
package com.cerner.bunsen.definitions;

import com.google.common.base.Preconditions;
import org.hl7.fhir.instance.model.api.IIdType;
import org.hl7.fhir.instance.model.api.IPrimitiveType;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `pipelines/common/src/main/java/org/openmrs/analytics/DwhFiles.java`
#### Snippet
```java
          new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
      String line;
      while ((line = streamReader.readLine()) != null) {
        result.add(line);
      }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `pipelines/common/src/main/java/org/openmrs/analytics/GZipUtil.java`
#### Snippet
```java
      return IOUtils.toString(inputStream, "UTF-8");
    } catch (IOException exception) {
      exception.printStackTrace();
      throw new DataFormatException("Failed to decompress byte array", exception);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java

      System.out.println("Unable to write file " + outputFile.getPath());
      exception.printStackTrace();
      return 1;
    }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`propertyName = propertyName + "[x]"` could be simplified to 'propertyName += "\[x\]"'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/HapiCompositeConverter.java`
#### Snippet
```java
        if (child.isChoice()) {

          propertyName = propertyName + "[x]";
        }

```

### ReplaceAssignmentWithOperatorAssignment
`propertyName = propertyName + "[x]"` could be simplified to 'propertyName += "\[x\]"'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/HapiCompositeConverter.java`
#### Snippet
```java
      // Append the [x] suffix for choice properties.
      if (schemaEntry.isChoice()) {
        propertyName = propertyName + "[x]";
      }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `StructureDefinitions()` of an abstract class should not be declared 'public'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/StructureDefinitions.java`
#### Snippet
```java
   * @param context the FHIR context.
   */
  public StructureDefinitions(FhirContext context) {

    this.context = context;
```

### NonProtectedConstructorInAbstractClass
Constructor `PrimitiveConverter()` of an abstract class should not be declared 'public'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/PrimitiveConverter.java`
#### Snippet
```java
  private final String elementType;

  public PrimitiveConverter(String elementType) {
    this.elementType = elementType;
  }
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new JdbcIO.PreparedStatementSetter\>() can be replaced with lambda
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
              .withDataSourceConfiguration(this.dataSourceConfig)
              .withParameterSetter(
                  new JdbcIO.PreparedStatementSetter<KV<Integer, Integer>>() {

                    @Override
```

### Convert2Lambda
Anonymous new JdbcIO.RowMapper() can be replaced with lambda
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
                      this.tableName, tableId, tableId))
              .withRowMapper(
                  new JdbcIO.RowMapper<String>() {

                    @Override
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
  private static final Logger log = LoggerFactory.getLogger(GcpStoreUtil.class);

  private GoogleCredentials credential = null;

  protected GcpStoreUtil(String sinkUrl, IRestfulClientFactory clientFactory) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pipelines/common/src/main/java/org/openmrs/analytics/FhirOutputFile.java`
#### Snippet
```java

  private static class FhirOutputStream extends PositionOutputStream {
    private long position = 0;
    private final OutputStream outputStream;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `pipelines/common/src/main/java/org/openmrs/analytics/BaseArgs.java`
#### Snippet
```java
              + " reached, the content is flushed to disk. This won't be triggered if there are"
              + " less than 100 records. Use 0 to fall back to the default row-group size.")
  public int rowGroupSizeForParquetFiles = 0;
}

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchResources.java`
#### Snippet
```java
    // class is accessed by a single thread.
    // https://beam.apache.org/documentation/programming-guide/#user-code-thread-compatibility
    private Map<String, Integer> patientCount = null;

    SearchFn(FhirEtlOptions options, String stageIdentifier) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchSearchPageFn.java`
#### Snippet
```java
  protected FhirContext fhirContext;

  private static JdbcConnectionUtil jdbcConnectionUtil = null;

  // This is to enforce the Singleton pattern for JdbcConnectionUtil used by all workers running
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `input`
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/EnumConverter.java`
#### Snippet
```java
    if ("?".equals(input)) {

      input = null;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java

      // Find the actual type to use.
      parent = definitions.stream()
          .filter(definition -> definition.getPath().equals(referencedType))
          .findFirst()
```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java

      // Find the actual type to use.
      parent = definitions.stream()
          .filter(definition -> definition.getPath().equals(referencedType))
          .findFirst()
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/HapiConverter.java`
#### Snippet
```java
   */
  public String extensionUrl() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/HapiConverter.java`
#### Snippet
```java
   */
  public String getElementType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3FhirConversionSupport.java`
#### Snippet
```java
    if (children == null) {

      return null;
    } else {

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4FhirConversionSupport.java`
#### Snippet
```java
    if (children == null) {

      return null;
    } else {

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/EnumConverter.java`
#### Snippet
```java

    return "?".equals(primitive.getValueAsString())
        ? null
        : primitive.getValueAsString();
  }
```

### ReturnNull
Return of `null`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
  LocalDateTime getNextIncrementalTime() {
    if (isRunning() || lastRunEnd == null) {
      return null;
    }
    return cron.next(lastRunEnd);
```

### ReturnNull
Return of `null`
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/HapiCompositeConverter.java`
#### Snippet
```java
    @Override
    public IBase toHapi(Object input) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
      log.error(String.format("URI syntax exception while using Google APIs: %s", e.toString()));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
      log.error("URI syntax exception while using Google APIs: {}", e.toString(), e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
      log.error(String.format("Exception while sending to sink: %s", e.toString()));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java
        || element.getTypeFirstRep().getCode().equals("BackboneElement")
        || element.getTypeFirstRep().getCode().equals("Element")
        ? null
        : (StructureDefinition) validationSupport.fetchStructureDefinition(
            element.getTypeFirstRep().getCode());
```

### ReturnNull
Return of `null`
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
    List<CanonicalType> profiles = element.getTypeFirstRep().getProfile();
    if (profiles == null || profiles.isEmpty()) {
      return  null;
    }
    return profiles.get(0).getValue();
```

### ReturnNull
Return of `null`
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
        || element.getTypeFirstRep().getCode().equals("BackboneElement")
        || element.getTypeFirstRep().getCode().equals("Element")
        ? null
        : (StructureDefinition) validationSupport.fetchStructureDefinition(
            element.getTypeFirstRep().getCode());
```

### ReturnNull
Return of `null`
in `pipelines/streaming/src/main/java/org/openmrs/analytics/StatusServer.java`
#### Snippet
```java
        return statusVars.get(name);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/NoOpConverter.java`
#### Snippet
```java
  @Override
  public Object fromHapi(Object input) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/NoOpConverter.java`
#### Snippet
```java
    @Override
    public IBase toHapi(Object input) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirSearchUtil.java`
#### Snippet
```java
      log.error("Failed to search for url: " + searchUrl + " ;  " + "Exception: " + e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirSearchUtil.java`
#### Snippet
```java
      return bundle.getLink(Bundle.LINK_NEXT).getUrl();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
      return uri != null && uri.startsWith(prefix)
          ? uri.substring(uri.lastIndexOf('/') + 1)
          : null;
    }

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
    @Override
    public IBase toHapi(Object input) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
    // Ignore extension fields that don't have declared content for now.
    if (children.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirEtl.java`
#### Snippet
```java
      return pipeline;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirEtl.java`
#### Snippet
```java
      return EtlUtils.runPipelineWithTimestamp(pipeline, options);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `pipelines/common/src/main/java/org/openmrs/analytics/OpenmrsUtil.java`
#### Snippet
```java
          String.format(
              "Failed fetching FHIR %s resource with Id %s: %s", resourceType, resourceId, e));
      return null;
    }
  }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `valueDefinition` is redundant
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/LeafExtensionConverter.java`
#### Snippet
```java
  private BaseRuntimeElementDefinition fetchElementDefinitionForField(
      String valueField, RuntimeCompositeDatatypeDefinition definition) {
    BaseRuntimeElementDefinition valueDefinition = definition.getChildByName(valueField)
        .getChildByName(valueField);
    return valueDefinition;
```

### UnnecessaryLocalVariable
Local variable `items` is redundant
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3FhirConversionSupport.java`
#### Snippet
```java
    Bundle stu3Bundle = (Bundle) bundle;

    List<IBaseResource> items = stu3Bundle.getEntry().stream()
            .map(BundleEntryComponent::getResource)
            .filter(resource ->
```

### UnnecessaryLocalVariable
Local variable `items` is redundant
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4FhirConversionSupport.java`
#### Snippet
```java
    Bundle stu3Bundle = (Bundle) bundle;

    List<IBaseResource> items =
        stu3Bundle.getEntry().stream()
            .map(BundleEntryComponent::getResource)
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirSearchUtil.java`
#### Snippet
```java
    try {
      IGenericClient client = openmrsUtil.getSourceClient();
      Bundle result =
          client
              .search()
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.lang.Exception', in the throws list already.
in `pipelines/streaming/src/main/java/org/openmrs/analytics/DebeziumListener.java`
#### Snippet
```java

  @Override
  public void configure() throws IOException, Exception {
    log.info("Debezium Listener Started... ");

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `response` initializer `""` is redundant
in `pipelines/streaming/src/main/java/org/openmrs/analytics/StatusServer.java`
#### Snippet
```java
      log.info("Received request: " + exchange.getRequestURI());
      String var = exchange.getRequestURI().getPath().replaceFirst(PATH_PREFIX, "");
      String response = "";
      if (var.isEmpty() || !var.startsWith("/")) {
        StringBuilder builder =
```

### UnusedAssignment
Variable `searchBundle` initializer `null` is redundant
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirSearchUtil.java`
#### Snippet
```java
      IQuery<Bundle> searchQuery = makeQueryWithDate(resourceType, options);
      log.info(String.format("Fetching first batch of %s", resourceType));
      Bundle searchBundle = null;
      try {
        searchBundle = searchQuery.execute();
```

### UnusedAssignment
Variable `statement` initializer `null` is redundant
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcResourceWriter.java`
#### Snippet
```java
    try (Connection connection = jdbcDataSource.getConnection()) {
      String tableName = tablePrefix + resource.getResourceType().name();
      PreparedStatement statement = null;
      if (useSingleTable) {
        tableName = tablePrefix;
```

### UnusedAssignment
Variable `uuid` initializer `""` is redundant
in `pipelines/streaming/src/main/java/org/openmrs/analytics/FhirConverter.java`
#### Snippet
```java
      return;
    }
    String uuid = "";
    if (payload.get("uuid") != null) {
      uuid = payload.get("uuid").toString();
```

### UnusedAssignment
Variable `className` initializer `null` is redundant
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/StructureDefinitions.java`
#### Snippet
```java

    FhirVersionEnum versionEnum = context.getVersion().getVersion();
    String className = null;

    if (FhirVersionEnum.DSTU3.equals(versionEnum)) {
```

### UnusedAssignment
Variable `segmentMap` initializer `Maps.newHashMap()` is redundant
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirEtl.java`
#### Snippet
```java
  static void runFhirFetch(FhirEtlOptions options, FhirContext fhirContext) throws IOException {
    FhirSearchUtil fhirSearchUtil = createFhirSearchUtil(options, fhirContext);
    Map<String, List<SearchSegmentDescriptor>> segmentMap = Maps.newHashMap();
    try {
      // TODO in the activePeriod case, among patientAssociatedResources, only fetch Encounter here.
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/DefinitionVisitorsUtil.java`
#### Snippet
```java
        .map(StringUtils::capitalize)
        .reduce(String::concat)
        .get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java
          .findFirst();

      String extensionUrl = urlElement.get().getFixed().primitiveValue();

      List<StructureField<T>> childField = elementToFields(visitor, rootDefinition,
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3StructureDefinitions.java`
#### Snippet
```java

      List<StructureField<T>> childField = elementToFields(visitor, rootDefinition,
          valueElement.get(), extensionDefinitions, stack);

      T result = visitor.visitLeafExtension(sliceName,
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
          .findFirst();

      String extensionUrl = urlElement.get().getFixed().primitiveValue();

      List<StructureField<T>> childField = elementToFields(visitor, rootDefinition,
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java

      List<StructureField<T>> childField = elementToFields(visitor, rootDefinition,
          valueElement.get(), extensionDefinitions, stack);

      T result = visitor.visitLeafExtension(sliceName,
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `resources == null` is always `false`
in `pipelines/controller/src/main/java/org/openmrs/analytics/HiveTableManager.java`
#### Snippet
```java
    }
    String[] resources = resourceList.split(",");
    if (resources == null || resources.length == 0) {
      return;
    }
```

### ConstantValue
Condition `pipeline.getOptions().as(FhirEtlOptions.class) != null` is always `true`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
        DataProperties dataProperties,
        PipelineConfig pipelineConfig) {
      Preconditions.checkArgument(pipeline.getOptions().as(FhirEtlOptions.class) != null);
      this.pipeline = pipeline;
      this.manager = manager;
```

### ConstantValue
Condition `paths != null` is always `true`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
              .collect(Collectors.toList());

      Preconditions.checkState(paths != null, "Make sure DWH prefix is a valid path!");

      for (ResourceId path : paths) {
```

### ConstantValue
Condition `prefix == null` is always `false`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
    int index = dwhRootPrefix.lastIndexOf("/");
    String prefix = dwhRootPrefix.substring(index + 1);
    if (prefix == null || prefix.isBlank()) {
      String errorMessage =
          "dwhRootPrefix should be configured with a non-empty suffix string after the last"
```

### ConstantValue
Condition `pipeline.getOptions().as(FhirEtlOptions.class) != null` is always `true`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
        DataProperties dataProperties,
        PipelineConfig pipelineConfig) {
      Preconditions.checkArgument(pipeline.getOptions().as(FhirEtlOptions.class) != null);
      this.pipeline = pipeline;
      this.manager = manager;
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'hapiObject' to 'IBase'
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
          Object hapiObject = elementToHapiConverter.toHapi(value);

          fieldToSet.getMutator().addValue(parentObject, (IBase) hapiObject);
        }
      }
```

