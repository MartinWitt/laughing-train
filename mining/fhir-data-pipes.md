# fhir-data-pipes 
 
# Bad smells
I found 224 bad smells with 19 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 37 | false |
| NullableProblems | 23 | false |
| JavadocDeclaration | 17 | false |
| FieldMayBeFinal | 14 | false |
| DuplicatedCode | 12 | false |
| UNCHECKED_WARNING | 10 | false |
| UnnecessaryToStringCall | 10 | true |
| FieldCanBeLocal | 9 | false |
| RegExpRedundantEscape | 8 | false |
| SpringJavaAutowiredFieldsWarningInspection | 8 | false |
| SpringBootApplicationYaml | 7 | false |
| UnusedAssignment | 7 | false |
| UnnecessaryLocalVariable | 6 | true |
| ConstantValue | 6 | false |
| OptionalGetWithoutIsPresent | 5 | false |
| RedundantTypeArguments | 4 | false |
| LongLiteralsEndingWithLowercaseL | 3 | false |
| Deprecation | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| UNUSED_IMPORT | 3 | false |
| RedundantCompareToJavaTime | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| PlaceholderCountMatchesArgumentCount | 2 | false |
| RedundantCollectionOperation | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| TrivialIf | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| RedundantCast | 2 | false |
| UnnecessarySemicolon | 1 | false |
| ClassGetClass | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| DefaultAnnotationParam | 1 | false |
| AutoCloseableResource | 1 | false |
| ConfusingMainMethod | 1 | false |
| DuplicateThrows | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[id=RedundantCompareToJavaTime]
### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
      LocalDateTime next = getNextPurgeTime();
      logger.info("Last purge run was at {} next run is at {}", lastPurgeRunEnd, next);
      if (next.compareTo(LocalDateTime.now()) <= 0) {
        logger.info("Purge run triggered at {}", LocalDateTime.now());
        purgeDwhFiles();
```

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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `pipelines/controller/src/main/java/org/openmrs/analytics/DataProperties.java`
#### Snippet
```java
      String defaultVal = "null";
      for (Class c : DEFAULT_ANNOTATIONS) {
        Object def = AnnotationUtils.findAnnotation(getMethod, c);
        if (def != null) {
          defaultVal = c.getMethod("value").invoke(def).toString();
```

### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `pipelines/controller/src/main/java/org/openmrs/analytics/DataProperties.java`
#### Snippet
```java
        Object def = AnnotationUtils.findAnnotation(getMethod, c);
        if (def != null) {
          defaultVal = c.getMethod("value").invoke(def).toString();
        }
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/FhirContexts.java`
#### Snippet
```java
   * Cache of FHIR contexts.
   */
  private static final Map<FhirVersionEnum, FhirContext> FHIR_CONTEXTS = new HashMap();

  /**
```

### UNCHECKED_WARNING
Unchecked call to 'setValue(T)' as a member of raw type 'org.hl7.fhir.instance.model.api.IPrimitiveType'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/PrimitiveConverter.java`
#### Snippet
```java
   */
  public void toHapi(Object input, IPrimitiveType primitive) {
    primitive.setValue(input);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.cerner.bunsen.definitions.HapiConverter' to 'com.cerner.bunsen.definitions.HapiConverter'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/LeafExtensionConverter.java`
#### Snippet
```java
  public LeafExtensionConverter(String extensionUrl, HapiConverter valueConverter) {
    this.extensionUrl = extensionUrl;
    this.valueConverter = valueConverter;
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/FhirConversionSupport.java`
#### Snippet
```java
   * Cache of FHIR contexts.
   */
  private static final Map<FhirVersionEnum, FhirConversionSupport> FHIR_SUPPORT = new HashMap();


```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/StructureDefinitions.java`
#### Snippet
```java

    try {
      Constructor constructor = structureDefinitionsClass.getConstructor(FhirContext.class);
      return (StructureDefinitions) constructor.newInstance(context);
    } catch (Exception exception) {
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
      List list = (List) input;

      List convertedList = (List) list.stream()
          .map(item -> elementConverter.fromHapi(item))
          .collect(Collectors.toList());

      return new GenericData.Array<>(getDataType(), convertedList);
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
      List list = (List) input;

      List convertedList = (List) list.stream()
          .map(item -> elementConverter.fromHapi(item))
          .collect(Collectors.toList());

```

### UNCHECKED_WARNING
Unchecked call to 'Array(Schema, Collection)' as a member of raw type 'org.apache.avro.generic.GenericData.Array'
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
          .collect(Collectors.toList());

      return new GenericData.Array<>(getDataType(), convertedList);
    }

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

## RuleId[id=ClassGetClass]
### ClassGetClass
'getClass()' is called on Class instance
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/PipelineMetricsFactory.java`
#### Snippet
```java
        logger.warn(
            "Metrics is not supported for the pipeline runner {}",
            pipelineRunner.getClass().getSimpleName());
        return null;
    }
```

## RuleId[id=DataFlowIssue]
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

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/Stats.java`
#### Snippet
```java
    for (MetricResult<GaugeResult> gauge : metricQueryResults.getGauges()) {
      if (gauge.getName().getName().startsWith(MetricsConstants.TOTAL_NO_OF_RESOURCES)) {
        totalNoOfResources += gauge.getAttempted().getValue();
      }
    }
```

### DataFlowIssue
Unboxing of `counter.getAttempted()` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/Stats.java`
#### Snippet
```java
    for (MetricResult<Long> counter : metricQueryResults.getCounters()) {
      if (counter.getName().getName().startsWith(MetricsConstants.NUM_FETCHED_RESOURCES)) {
        totalNoOfFetchedResources += counter.getAttempted();
      }
      if (counter.getName().getName().startsWith(MetricsConstants.NUM_MAPPED_RESOURCES)) {
```

### DataFlowIssue
Unboxing of `counter.getAttempted()` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/Stats.java`
#### Snippet
```java
      }
      if (counter.getName().getName().startsWith(MetricsConstants.NUM_MAPPED_RESOURCES)) {
        totalNoOfMappedResources += counter.getAttempted();
      }
    }
```

### DataFlowIssue
Method invocation `getJobID` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/FlinkJobListener.java`
#### Snippet
```java
    logger.info(
        "Clearing the job with ID {}, jobExecutionResult={}",
        jobExecutionResult.getJobID(),
        jobExecutionResult);
    FlinkPipelineMetrics.clearJobClient();
```

### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
      List<ResourceId> paths =
          getAllChildDirectories(baseDir).stream()
              .filter(dir -> dir.getFilename().startsWith(prefix))
              .collect(Collectors.toList());

```

### DataFlowIssue
Method invocation `compareTo` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
      if (treeSet.size() < numberOfSnapshotsToReturn) {
        treeSet.add(resourceId.getFilename());
      } else if (resourceId.getFilename().compareTo(treeSet.first()) > 0) {
        treeSet.add(resourceId.getFilename());
        treeSet.pollFirst();
```

### DataFlowIssue
Method invocation `getMetricQueryResults` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
          pipelineMetricsFactory.getPipelineMetrics(
              currentPipeline.pipeline.getOptions().getRunner());
      return pipelineMetrics.getMetricQueryResults();
    }
    return null;
```

### DataFlowIssue
Argument `metricCounterResult.getAttempted()` might be null
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
              + "_"
              + metricCounterResult.getName().getName(),
          metricCounterResult.getAttempted());
    }
    for (MetricResult<GaugeResult> metricGaugeResult : metricQueryResults.getGauges()) {
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
      meterRegistry.gauge(
          metricGaugeResult.getName().getNamespace() + "_" + metricGaugeResult.getName().getName(),
          metricGaugeResult.getAttempted().getValue());
    }
  }
```

### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
      List<ResourceId> paths =
          dwhFilesManager.getAllChildDirectories(baseDir).stream()
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
Method invocation `startsWith` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
      List<ResourceId> paths =
          dwhFilesManager.getAllChildDirectories(baseDir).stream()
              .filter(dir -> dir.getFilename().startsWith(prefix + DataProperties.TIMESTAMP_PREFIX))
              .collect(Collectors.toList());

```

### DataFlowIssue
Argument `resourceId.getFilename()` might be null
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
          String resource = resourceId.getFilename();
          // Ignore if you encounter folders like incremental_run.
          if (dataProperties.getResourceList().indexOf(resourceId.getFilename()) == -1) {
            continue;
          }
```

### DataFlowIssue
Method invocation `split` may produce `NullPointerException`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
            continue;
          }
          String[] tokens = path.getFilename().split(prefix + DataProperties.TIMESTAMP_PREFIX);
          if (tokens.length > 1) {
            String timestamp = tokens[1];
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

## RuleId[id=SimplifyStreamApiCallChains]
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

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
            String thriftServerParquetPath =
                baseDir + "/" + path.getFilename() + "/" + resourceId.getFilename();
            logger.debug("thriftServerParquetPath: ", thriftServerParquetPath);
            hiveTableManager.createResourceTable(resource, timestamp, thriftServerParquetPath);
            // Create Canonical table for the latest snapshot.
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirEtl.java`
#### Snippet
```java
          // This should never happen!
          String error = "Cannot provide coder for String! " + e.getMessage();
          log.error("{} {}", error, e);
          throw new IllegalStateException(error);
        }
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

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
    String recordName = elementName + "Reference";
    // Remove extension type [x] as this creates issue while validating schema.
    recordName = recordName.replaceAll("\\[x\\]", "");

    String fullName = basePackage + "." + recordName;
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/Stats.java`
#### Snippet
```java

    Stats stats = new Stats();
    long totalNoOfResources = 0l;
    for (MetricResult<GaugeResult> gauge : metricQueryResults.getGauges()) {
      if (gauge.getName().getName().startsWith(MetricsConstants.TOTAL_NO_OF_RESOURCES)) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/Stats.java`
#### Snippet
```java
    }

    long totalNoOfFetchedResources = 0l;
    long totalNoOfMappedResources = 0l;
    for (MetricResult<Long> counter : metricQueryResults.getCounters()) {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/Stats.java`
#### Snippet
```java

    long totalNoOfFetchedResources = 0l;
    long totalNoOfMappedResources = 0l;
    for (MetricResult<Long> counter : metricQueryResults.getCounters()) {
      if (counter.getName().getName().startsWith(MetricsConstants.NUM_FETCHED_RESOURCES)) {
```

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve configuration property 'data.fhirServerUrl'
in `pipelines/controller/src/main/resources/application.yaml`
#### Snippet
```java

data:
  fhirServerUrl: "http://localhost:8092/fhir"
  dbConfig: "../../utils/hapi-postgres-config_local.json"
  dwhRootPrefix: "/tmp/controller_DWH"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'data.dbConfig'
in `pipelines/controller/src/main/resources/application.yaml`
#### Snippet
```java
data:
  fhirServerUrl: "http://localhost:8092/fhir"
  dbConfig: "../../utils/hapi-postgres-config_local.json"
  dwhRootPrefix: "/tmp/controller_DWH"
  # The schedule format is similar to Spring's CronExpression, i.e.,
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'data.dwhRootPrefix'
in `pipelines/controller/src/main/resources/application.yaml`
#### Snippet
```java
  fhirServerUrl: "http://localhost:8092/fhir"
  dbConfig: "../../utils/hapi-postgres-config_local.json"
  dwhRootPrefix: "/tmp/controller_DWH"
  # The schedule format is similar to Spring's CronExpression, i.e.,
  # "second minute hour day-of-the-month month day-of-the-week", e.g.,
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'data.incrementalSchedule'
in `pipelines/controller/src/main/resources/application.yaml`
#### Snippet
```java
  # "*/30 * * * * *" means in the middle of each minute;
  # Note a too frequent run might be too resource intensive.
  incrementalSchedule: "0 0 * * * *"
  # cron expression to trigger the purge job which handles the ttl of dwh snapshots
  purgeSchedule: "0 30 * * * *"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'data.purgeSchedule'
in `pipelines/controller/src/main/resources/application.yaml`
#### Snippet
```java
  incrementalSchedule: "0 0 * * * *"
  # cron expression to trigger the purge job which handles the ttl of dwh snapshots
  purgeSchedule: "0 30 * * * *"
  # The number of dwh snapshots to be retained when the purge job runs
  numOfDwhSnapshotsToRetain: 2
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'data.numOfDwhSnapshotsToRetain'
in `pipelines/controller/src/main/resources/application.yaml`
#### Snippet
```java
  purgeSchedule: "0 30 * * * *"
  # The number of dwh snapshots to be retained when the purge job runs
  numOfDwhSnapshotsToRetain: 2
  # Comma separated list of resources to fetch/monitor.
  resourceList: "Patient,Encounter,Observation"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'data.resourceList'
in `pipelines/controller/src/main/resources/application.yaml`
#### Snippet
```java
  numOfDwhSnapshotsToRetain: 2
  # Comma separated list of resources to fetch/monitor.
  resourceList: "Patient,Encounter,Observation"
# Enable spring boot actuator end points, use "*" to expose all endpoints, or a comma-separated
# list to expose selected ones
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `pipelines/batch/src/main/java/org/openmrs/analytics/ConvertResourceFn.java`
#### Snippet
```java
    // Only in the incremental mode we process deleted resources.
    this.processDeletedRecords = !Strings.isNullOrEmpty(options.getSince());
    List<String> resourceTypes = Arrays.asList(options.getResourceList().split(","));
    for (String resourceType : resourceTypes) {
      this.numFetchedResourcesMap.put(
```

### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
    public ResultSetToRowDescriptor(String resourceList) {
      this.numMappedResourcesMap = new HashMap<>();
      List<String> resourceTypes = Arrays.asList(resourceList.split(","));
      for (String resourceType : resourceTypes) {
        this.numMappedResourcesMap.put(
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/PipelineMetricsFactory.java`
#### Snippet
```java
  @Nullable
  public PipelineMetrics getPipelineMetrics(Class<? extends PipelineRunner> pipelineRunner) {
    switch (pipelineRunner.getSimpleName()) {
      case FLINK_RUNNER:
        return flinkPipelineMetrics;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4FhirConversionSupport.java`
#### Snippet
```java
    List<Property> children = ((Base) composite).children();

    if (children == null) {

      return null;
    } else {

      // Some FHIR resources produce duplicate properties in the children,
      // so just use the first when converting to a map.
      return children.stream()
          .filter(property -> property.hasValues())
          .collect(
              Collectors.toMap(
                  Property::getName, property -> property.getValues(), (first, second) -> first));
    }
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
    if (parent.getContentReference() != null) {

      if (!parent.getContentReference().startsWith("#")) {

        throw new IllegalStateException("Non-local references are not yet supported");
      }

      // Remove the leading hash (#) to get the referenced type.
      String referencedType = parent.getContentReference().substring(1);

      // Find the actual type to use.
      parent = definitions.stream()
          .filter(definition -> definition.getPath().equals(referencedType))
          .findFirst()
          .orElseThrow(() -> new IllegalArgumentException("Expected a reference type"));
    }

    String startsWith = parent.getId() + ".";

    return definitions.stream()
        .filter(definition -> definition.getId().startsWith(startsWith)
            && definition.getId().indexOf('.', startsWith.length()) < 0)
        .collect(Collectors.toList());
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
      if (shouldTerminateRecursive(visitor,
          new QualifiedPath(definition.getUrl(), element.getPath()),
          stack)) {

        return Collections.emptyList();

      } else {

        List<ElementDefinition> extensionDefinitions = definition.getSnapshot().getElement();

        ElementDefinition extensionRoot = extensionDefinitions.get(0);

        extensions = visitExtensionDefinition(visitor,
            rootDefinition,
            element.getSliceName(),
            stack,
            definition.getUrl(),
            extensionDefinitions,
            extensionRoot);
      }
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
    if (!element.getMax().equals("1") && extensions.size() > 0) {
      // the nested extension element has max: *
      return Collections.singletonList(StructureField.extension(
          extensions.get(0).fieldName(),
          extensions.get(0).extensionUrl(),
          extensions.get(0).isModifier(),
          visitor.visitMultiValued(extensions.get(0).fieldName(), extensions.get(0).result())));

    } else {

      return extensions;
    }
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
List<ElementDefinition> children = getChildren(extensionRoot, extensionDefinitions);

    // Extensions may contain either additional extensions or a value field, but not both.
    // So if it has a child element with a slice name, it has additional extensions.
    List<ElementDefinition> childExtensions = children.stream()
        .filter(element -> element.getSliceName() != null)
        .collect(Collectors.toList());

    if (!childExtensions.isEmpty()) {

      List<StructureField<T>> childFields = new ArrayList<>();

      for (ElementDefinition childExtension: childExtensions) {

        List<StructureField<T>> childField = extensionElementToFields(visitor,
            rootDefinition, childExtension, extensionDefinitions, stack);

        childFields.addAll(childField);
      }

      T result = visitor.visitParentExtension(sliceName,
          url,
          childFields);

      if (result == null) {
        return Collections.emptyList();
      } else {
        return Collections.singletonList(
            StructureField.extension(sliceName,
                url,
                extensionRoot.getIsModifier(),
                result));
      }

    } else {

      // The extension has no children, so produce its value.

      Optional<ElementDefinition> valueElement = children.stream()
          .filter(e -> e.getPath().contains("value"))
          .findFirst();

      // FIXME: get the extension URL.
      Optional<ElementDefinition> urlElement = children.stream()
          .filter(e -> e.getPath().endsWith("url"))
          .findFirst();

      String extensionUrl = urlElement.get().getFixed().primitiveValue();

      List<StructureField<T>> childField = elementToFields(visitor, rootDefinition,
          valueElement.get(), extensionDefinitions, stack);

      T result = visitor.visitLeafExtension(sliceName,
          extensionUrl,
          childField.iterator().next().result());

      return Collections.singletonList(
          StructureField.extension(sliceName,
              extensionUrl,
              extensionRoot.getIsModifier(),
              result));

    }
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
      Map<String, T> choiceTypes = new LinkedHashMap<>();

      for (TypeRefComponent typeRef: element.getType()) {

        if (PRIMITIVE_TYPES.contains(typeRef.getCode())) {

          T child = visitor.visitPrimitive(elementName, typeRef.getCode());
          choiceTypes.put(typeRef.getCode(), child);

        } else {

          StructureDefinition structureDefinition =
              (StructureDefinition) validationSupport
                  .fetchStructureDefinition(typeRef.getCode());

          T child = transform(visitor, element, structureDefinition, new ArrayDeque<>());

          choiceTypes.put(typeRef.getCode(), child);
        }
      }

      StructureField<T> field = new StructureField<>(elementName,
          elementName,
          null,
          false,
          true,
          visitor.visitChoice(elementName, choiceTypes));

      return Collections.singletonList(field);
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
if (!element.getMax().equals("1")) {

      if (getDefinition(element) != null) {

        // Handle defined data types.
        StructureDefinition definition = getDefinition(element);

        if (shouldTerminateRecursive(visitor, definition, stack)) {

          return Collections.emptyList();

        } else {

          T type = transform(visitor, element, definition, stack);

          return singleField(elementName,
              visitor.visitMultiValued(elementName, type));
        }

      } else {

        List<StructureField<T>> childElements = transformChildren(visitor,
            rootDefinition, definitions, stack, element);

        T result = visitor.visitComposite(elementName,
            element.getPath(),
            elementName,
            rootDefinition.getUrl(),
            childElements);

        List<StructureField<T>> composite = singleField(elementName, result);

        // Array types should produce only a single element.
        if (composite.size() != 1) {
          throw new IllegalStateException("Array type in "
              + element.getPath()
              + " must map to a single structure.");
        }

        // Wrap the item in the corresponding multi-valued type.
        return singleField(elementName,
            visitor.visitMultiValued(elementName, composite.get(0).result()));
      }

    } else if (getDefinition(element) != null) {

      // Handle defined data types.
      StructureDefinition definition = getDefinition(element);

      if (shouldTerminateRecursive(visitor, definition, stack)) {

        return Collections.emptyList();

      } else {
        T type = transform(visitor, element, definition, stack);

        return singleField(elementName(element), type);
      }

    } else {

      // Handle composite type
      List<StructureField<T>> childElements = transformChildren(visitor, rootDefinition,
          definitions, stack, element);

      T result = visitor.visitComposite(elementName,
          element.getPath(),
          elementName,
          rootDefinition.getUrl(),
          childElements);

      return singleField(elementName, result);
    }
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
    QualifiedPath qualifiedPath = new QualifiedPath(rootDefinition.getUrl(),  element.getPath());

    if (shouldTerminateRecursive(visitor, qualifiedPath, stack)) {

      return Collections.emptyList();

    } else {
      stack.push(qualifiedPath);

      // Handle composite type
      List<StructureField<T>> childElements = new ArrayList<>();

      for (ElementDefinition child: getChildren(element, definitions)) {

        List<StructureField<T>> childFields = elementToFields(visitor, rootDefinition,
            child, definitions, stack);

        childElements.addAll(childFields);
      }

      stack.pop();

      return childElements;
    }
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
    Map<String, StructureField<T>> containedElements = new LinkedHashMap<>();

    for (StructureDefinition containedDefinition: containedDefinitions) {

      ElementDefinition containedRootElement = containedDefinition.getSnapshot()
          .getElementFirstRep();

      List<ElementDefinition> childDefinitions = containedDefinition.getSnapshot().getElement();

      stack.push(new QualifiedPath(containedDefinition.getUrl(), containedRootElement.getPath()));

      List<StructureField<T>> childElements = transformChildren(visitor,
          containedDefinition,
          childDefinitions,
          stack,
          containedRootElement);

      stack.pop();

      String rootName = elementName(containedRootElement);

      T result = visitor.visitComposite(rootName,
          containedRootElement.getPath(),
          rootName,
          containedDefinition.getUrl(),
          childElements);

      containedElements.put(rootName, StructureField.property(rootName, result));
    }

    T result = visitor.visitContained(element.getPath() + ".contained",
        rootDefinition.getUrl(),
        containedElements);

    return StructureField.property("contained", result);
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
    StructureDefinition definition = (StructureDefinition) context.getValidationSupport()
        .fetchStructureDefinition(resourceTypeUrl);

    if (definition == null) {

      throw new IllegalArgumentException("Unable to find definition for " + resourceTypeUrl);
    }

    List<StructureDefinition> containedDefinitions = containedResourceTypeUrls.stream()
        .map(containedResourceTypeUrl -> {
          StructureDefinition containedDefinition = (StructureDefinition) context
              .getValidationSupport()
              .fetchStructureDefinition(containedResourceTypeUrl);

          if (containedDefinition == null) {

            throw new IllegalArgumentException("Unable to find definition for "
                + containedResourceTypeUrl);
          }

          return containedDefinition;
        })
        .collect(Collectors.toList());

    return transformRoot(visitor, definition, containedDefinitions, new ArrayDeque<>());
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
    List<ElementDefinition> definitions = definition.getSnapshot().getElement();

    ElementDefinition root = definitions.get(0);

    stack.push(new QualifiedPath(definition.getUrl(), root.getPath()));

    List<StructureField<T>> childElements = transformChildren(visitor, definition,
        definitions, stack, root);

    stack.pop();
```

### DuplicatedCode
Duplicated code
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
    ElementDefinition definitionRootElement = definition.getSnapshot().getElementFirstRep();

    List<ElementDefinition> definitions = definition.getSnapshot().getElement();

    ElementDefinition root = definitions.get(0);

    stack.push(new QualifiedPath(definition.getUrl(), definitionRootElement.getPath()));

    List<StructureField<T>> childElements = transformChildren(visitor,
        definition,
        definitions,
        stack,
        root);

    // If there are contained definitions, create a Resource Container StructureField
    if (containedDefinitions.size() > 0) {

      StructureField<T> containedElement = transformContained(visitor,
          definition,
          containedDefinitions,
          stack,
          root);

      // Replace default StructureField with constructed Resource Container StructureField
      // TODO make this future proof instead of using a hard-coded index for `contained`.
      childElements.set(5, containedElement);
    }

    stack.pop();

    String rootName = elementName(root);

    return visitor.visitComposite(rootName,
        rootName,
        rootName,
        definition.getUrl(),
        childElements);
```

## RuleId[id=Deprecation]
### Deprecation
'withRowGroupSize(int)' is deprecated
in `pipelines/common/src/main/java/org/openmrs/analytics/ParquetUtil.java`
#### Snippet
```java
    // TODO: Adjust other parquet file parameters for our needs or make them configurable.
    if (rowGroupSize > 0) {
      builder.withRowGroupSize(rowGroupSize);
    }
    ParquetWriter<GenericRecord> writer =
```

### Deprecation
'withCoder(org.apache.beam.sdk.coders.@org.checkerframework.checker.nullness.qual.UnknownKeyFor @org.checkerframework.checker.nullness.qual.NonNull @org.checkerframework.checker.initialization.qual.Initialized Coder)' is deprecated
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
                    }
                  })
              .withCoder(NullableCoder.of(StringUtf8Coder.of())));
    }
  }
```

### Deprecation
'newInstance()' is deprecated
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/FhirConversionSupport.java`
#### Snippet
```java
    try {

      return (FhirConversionSupport) fhirSupportClass.newInstance();

    } catch (Exception exception) {
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
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/FlinkJobListener.java`
#### Snippet
```java
    }

    logger.info("Submitting the job with ID toString {} ", this.toString());
    FlinkPipelineMetrics.setJobClient(jobClient);
  }
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
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirSearchUtil.java`
#### Snippet
```java
            String.format("No _getpages parameter found in search link %s", searchLink));
      }
      return openmrsUtil.getSourceFhirUrl() + "?" + pagesParam.toString();
    } catch (URISyntaxException e) {
      throw new IllegalArgumentException(
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `DwhRunDetails` may be 'static'
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java

  @Data
  public class DwhRunDetails {

    private String startTime;
```

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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `pipelines/common/src/main/java/org/openmrs/analytics/FhirStoreUtil.java`
#### Snippet
```java

  public MethodOutcome uploadResource(Resource resource) {
    Collection<IClientInterceptor> interceptors = Collections.<IClientInterceptor>emptyList();

    if (!isNullOrEmpty(sinkUsername) && !isNullOrEmpty(sinkPassword)) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `pipelines/common/src/main/java/org/openmrs/analytics/FhirStoreUtil.java`
#### Snippet
```java
    if (!isNullOrEmpty(sinkUsername) && !isNullOrEmpty(sinkPassword)) {
      interceptors =
          Collections.<IClientInterceptor>singleton(
              new BasicAuthInterceptor(sinkUsername, sinkPassword));
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `pipelines/common/src/main/java/org/openmrs/analytics/GcpStoreUtil.java`
#### Snippet
```java
          uri,
          resource,
          Collections.<IClientInterceptor>singletonList(
              new BearerTokenAuthInterceptor(credential.refreshAccessToken().getTokenValue())));
    } catch (IOException e) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
          .apply(
              String.format("GroupIntoBatches of %s", this.batchSize),
              GroupIntoBatches.<String, String>ofSize(this.batchSize))
          .apply(
              "Generate Segments",
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `pipelines/common/src/main/java/org/openmrs/analytics/FhirOutputFile.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
      outputStream.write(b, off, len);
      position += len;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `pipelines/common/src/main/java/org/openmrs/analytics/FhirOutputFile.java`
#### Snippet
```java

    @Override
    public void write(byte[] b) throws IOException {
      write(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java

  @Override
  public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
    createResourceTables();
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchResources.java`
#### Snippet
```java

  @Override
  public PCollection<KV<String, Integer>> expand(PCollection<SearchSegmentDescriptor> segments) {
    return segments.apply(ParDo.of(fetchSearchPageFn));
  }
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
Not annotated method overrides method annotated with @NonNull
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchPatients.java`
#### Snippet
```java

  @Override
  public PDone expand(PCollection<KV<String, Integer>> patientIdCounts) {
    patientIdCounts.apply(ParDo.of(fetchSearchPageFn));
    return PDone.in(patientIdCounts.getPipeline());
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
Not annotated method overrides method annotated with @NonNull
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchPatientHistory.java`
#### Snippet
```java

  @Override
  public PDone expand(PCollection<KV<String, Integer>> patientIdCounts) {
    patientIdCounts.apply(ParDo.of(fetchSearchPageFn));
    return PDone.in(patientIdCounts.getPipeline());
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java

    @Override
    public PCollection<HapiRowDescriptor> expand(
        PCollection<QueryParameterDescriptor> queryParameters) {
      PCollection<HapiRowDescriptor> hapiRowDescriptorPCollection =
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
   */
  public static class FetchRowsJdbcIo
      extends PTransform<PCollection<QueryParameterDescriptor>, PCollection<HapiRowDescriptor>> {

    private String resourceList;
```

### NullableProblems
Non-null type argument is expected
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
   */
  public static class FetchRowsJdbcIo
      extends PTransform<PCollection<QueryParameterDescriptor>, PCollection<HapiRowDescriptor>> {

    private String resourceList;
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java

    @Override
    public PCollection<String> expand(PCollection<KV<Integer, Integer>> idRanges) {
      String tableId = this.tableName + "_id";
      return idRanges.apply(
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java

    @Override
    public PCollection<SearchSegmentDescriptor> expand(PCollection<String> resourceUuids) {
      return resourceUuids
          // create KV required by GroupIntoBatches
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
Not annotated parameter overrides @NonNull parameter
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java

                    @Override
                    public String mapRow(ResultSet resultSet) throws SQLException {
                      return resultSet.getString("uuid");
                    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
                    @Override
                    public void setParameters(
                        KV<Integer, Integer> element, PreparedStatement preparedStatement)
                        throws SQLException {
                      preparedStatement.setInt(1, element.getKey());
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/AvroConverter.java`
#### Snippet
```java
   * either be a relative URL for a base resource (e.g., "Condition" or "Observation"),
   * or a URL identifying the structure definition for a given profile, such as
   * "http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient".
   *
   * @param context the FHIR context
```

### JavadocLinkAsPlainText
Link specified as plain text
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/AvroConverter.java`
#### Snippet
```java
   * either be a relative URL for a base resource (e.g. "Condition" or "Observation"),
   * or a URL identifying the structure definition for a given profile, such as
   * "http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient".
   * <p>
   * Resources that would be contained must be statically declared through this method
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `pipelines/controller/src/main/java/org/openmrs/analytics/HiveTableManager.java`
#### Snippet
```java
  private final String jdbcUrl;
  private final String user;
  private final String password;

  private static final String THRIFT_CONTAINER_PARQUET_PATH_PREFIX = "/dwh";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `pipelines/controller/src/main/java/org/openmrs/analytics/HiveTableManager.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(HiveTableManager.class.getName());
  private final String jdbcUrl;
  private final String user;
  private final String password;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java

  // TODO expose this in the web-UI
  private LastRunStatus lastRunStatus = LastRunStatus.NOT_RUN;

  private DwhRunDetails lastRunDetails;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `pipelines/batch/src/main/java/org/openmrs/analytics/FetchPatients.java`
#### Snippet
```java
  private final FetchSearchPageFn<KV<String, Integer>> fetchSearchPageFn;

  private final Schema schema;

  FetchPatients(FhirEtlOptions options, Schema schema) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static String LAST_UPDATED_KEY = "lastUpdated";
  private static String TAG_KEY = "tag";
  private static String SYSTEM_KEY = "system";
  private static String CODE_KEY = "code";

```

### FieldCanBeLocal
Field can be converted to a local variable
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static String ID_KEY = "id";
  private static String META_KEY = "meta";
  private static String LAST_UPDATED_KEY = "lastUpdated";
  private static String TAG_KEY = "tag";
  private static String SYSTEM_KEY = "system";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static String TAG_KEY = "tag";
  private static String SYSTEM_KEY = "system";
  private static String CODE_KEY = "code";

  private static PCollection<KV<String, GenericRecord>> readAndMapToId(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static String META_KEY = "meta";
  private static String LAST_UPDATED_KEY = "lastUpdated";
  private static String TAG_KEY = "tag";
  private static String SYSTEM_KEY = "system";
  private static String CODE_KEY = "code";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/converters/DefinitionToAvroVisitor.java`
#### Snippet
```java
    private class MultiValuedtoHapiConverter implements HapiFieldSetter {

      private final BaseRuntimeElementDefinition elementDefinition;

      private final HapiObjectConverter elementToHapiConverter;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `pipelines/common/src/main/java/org/openmrs/analytics/DwhFiles.java`
#### Snippet
```java
        FileSystems.matchResources(Collections.singletonList(getIncrementalRunPath()));
    MatchResult matchResult = Iterables.getOnlyElement(matches);
    if (matchResult.status() == Status.OK) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
    ResourceId endTimestampResource =
        dwhResource.resolve(DwhFiles.TIMESTAMP_FILE_END, StandardResolveOptions.RESOLVE_FILE);
    if (doesFileExist(startTimestampResource) && doesFileExist(endTimestampResource)) {
      return true;
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
  public ResponseEntity<String> runBatch(
      @RequestParam(name = "isFullRun", required = true) boolean isFullRun) {
    if (pipelineManager.isRunning()) {
      return new ResponseEntity<>("Another pipeline is running.", HttpStatus.INTERNAL_SERVER_ERROR);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ParquetWriter' used without 'try'-with-resources statement
in `pipelines/common/src/main/java/org/openmrs/analytics/ParquetUtil.java`
#### Snippet
```java
    for (Map.Entry<String, ParquetWriter<GenericRecord>> entry : writerMap.entrySet()) {
      entry.getValue().close();
      writerMap.put(entry.getKey(), null);
    }
  }
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

### ConditionCoveredByFurtherCondition
Condition 'tag != null' covered by subsequent condition 'tag instanceof Collection'
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static Boolean isRecordDeleted(GenericRecord record) {
    Object tag = ((GenericRecord) record.get(META_KEY)).get(TAG_KEY);
    if (tag != null && tag instanceof Collection) {
      Collection tagCollection = (Collection) tag;
      if (!tagCollection.isEmpty()) {
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `base` to `Base` is redundant
in `bunsen/bunsen-core-stu3/src/main/java/com/cerner/bunsen/definitions/stu3/Stu3FhirConversionSupport.java`
#### Snippet
```java
  public String fhirType(IBase base) {

    return ((Base) base).fhirType();
  }

```

### RedundantCast
Casting `base` to `Base` is redundant
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4FhirConversionSupport.java`
#### Snippet
```java
  public String fhirType(IBase base) {

    return ((Base) base).fhirType();
  }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/HiveTableManager.java`
#### Snippet
```java
   * @param resource FHIR resource type.
   * @param thriftServerParquetPath directory path having output parquet files.
   * @throws SQLException
   */
  public void createResourceCanonicalTable(String resource, String thriftServerParquetPath)
```

### JavadocDeclaration
`@throws` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/HiveTableManager.java`
#### Snippet
```java
   * @param timestamp timestamp string to be used for resource table name.
   * @param thriftServerParquetPath directory path having output parquet files.
   * @throws SQLException
   */
  public void createResourceTable(String resource, String timestamp, String thriftServerParquetPath)
```

### JavadocDeclaration
`@throws` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/HiveTableManager.java`
#### Snippet
```java
   * @param timestamp Timestamp suffix to be used in table name.
   * @param thriftServerParquetPath location of parquet files in Thrift Server
   * @throws SQLException
   */
  public void createResourceTables(
```

### JavadocDeclaration
`@throws` tag description is missing
in `pipelines/common/src/main/java/org/openmrs/analytics/DwhFiles.java`
#### Snippet
```java
   *
   * @return the set of non-empty directories
   * @throws IOException
   */
  public Set<String> findNonEmptyFhirResourceTypes() throws IOException {
```

### JavadocDeclaration
`@param resourceType` tag description is missing
in `pipelines/common/src/main/java/org/openmrs/analytics/DwhFiles.java`
#### Snippet
```java
   * destination DwhFiles under the similar directory.
   *
   * @param resourceType
   * @param destDwh
   * @throws IOException
```

### JavadocDeclaration
`@param destDwh` tag description is missing
in `pipelines/common/src/main/java/org/openmrs/analytics/DwhFiles.java`
#### Snippet
```java
   *
   * @param resourceType
   * @param destDwh
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `pipelines/common/src/main/java/org/openmrs/analytics/DwhFiles.java`
#### Snippet
```java
   * @param resourceType
   * @param destDwh
   * @throws IOException
   */
  public void copyResourcesToDwh(String resourceType, DwhFiles destDwh) throws IOException {
```

### JavadocDeclaration
`@param metricQueryResults` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/Stats.java`
#### Snippet
```java
   * as compared to the other steps.
   *
   * @param metricQueryResults
   * @return Stats
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
   *
   * @param rootDirectory which needs to be deleted
   * @throws IOException
   */
  private void deleteDirectoryAndFiles(ResourceId rootDirectory) throws IOException {
```

### JavadocDeclaration
`@param dwhRootPrefix` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
   * <baseDir></prefix> for the dwhRootPrefix
   *
   * @param dwhRootPrefix
   * @return the prefix name
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
   * @param dwhResource The DWH resource path which needs to be checked for completeness
   * @return the status of DWH completeness.
   * @throws IOException
   */
  boolean isDwhComplete(ResourceId dwhResource) throws IOException {
```

### JavadocDeclaration
`@param dwhRootPrefix` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
   * dwhRootPrefix
   *
   * @param dwhRootPrefix
   * @return the base directory name
   */
```

### JavadocDeclaration
`@param baseDir` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
   * Returns all the child directories under the given base directory which are 1-level deep.
   *
   * @param baseDir
   * @return The list of all child directories under the base directory
   * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java
   * @param baseDir
   * @return The list of all child directories under the base directory
   * @throws IOException
   */
  Set<ResourceId> getAllChildDirectories(String baseDir) throws IOException {
```

### JavadocDeclaration
`@param record` tag description is missing
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
   * same information is being reused to check if the record is deleted or not.
   *
   * @param record
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
   *
   * @param record
   * @return
   */
  private static Boolean isRecordDeleted(GenericRecord record) {
```

### JavadocDeclaration
`@return` tag description is missing
in `bunsen/bunsen-core-r4/src/main/java/com/cerner/bunsen/definitions/r4/R4StructureDefinitions.java`
#### Snippet
```java
   * `type` while in STU3 we have multiple `type` each with a single target-profile.
   *
   * @return
   */
  private String getFirstTypeProfile(ElementDefinition element) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `jdbcDataSource` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcResourceWriter.java`
#### Snippet
```java
  private IParser parser;

  private DataSource jdbcDataSource;

  JdbcResourceWriter(
```

### FieldMayBeFinal
Field `parser` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcResourceWriter.java`
#### Snippet
```java
  private final boolean useSingleTable;

  private IParser parser;

  private DataSource jdbcDataSource;
```

### FieldMayBeFinal
Field `params` may be 'final'
in `pipelines/streaming/src/main/java/org/openmrs/analytics/DebeziumListener.java`
#### Snippet
```java
  private DatabaseConfiguration databaseConfiguration;

  private DebeziumArgs params;

  public DebeziumListener(String[] args) throws IOException {
```

### FieldMayBeFinal
Field `parquetUtil` may be 'final'
in `pipelines/streaming/src/main/java/org/openmrs/analytics/DebeziumListener.java`
#### Snippet
```java
  private static class ParquetService implements Service {

    private ParquetUtil parquetUtil;

    ParquetService(ParquetUtil parquetUtil) {
```

### FieldMayBeFinal
Field `databaseConfiguration` may be 'final'
in `pipelines/streaming/src/main/java/org/openmrs/analytics/DebeziumListener.java`
#### Snippet
```java
  private static final Logger log = LoggerFactory.getLogger(DebeziumListener.class);

  private DatabaseConfiguration databaseConfiguration;

  private DebeziumArgs params;
```

### FieldMayBeFinal
Field `ID_KEY` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static final Logger log = LoggerFactory.getLogger(ParquetMerger.class);

  private static String ID_KEY = "id";
  private static String META_KEY = "meta";
  private static String LAST_UPDATED_KEY = "lastUpdated";
```

### FieldMayBeFinal
Field `SYSTEM_KEY` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static String LAST_UPDATED_KEY = "lastUpdated";
  private static String TAG_KEY = "tag";
  private static String SYSTEM_KEY = "system";
  private static String CODE_KEY = "code";

```

### FieldMayBeFinal
Field `META_KEY` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java

  private static String ID_KEY = "id";
  private static String META_KEY = "meta";
  private static String LAST_UPDATED_KEY = "lastUpdated";
  private static String TAG_KEY = "tag";
```

### FieldMayBeFinal
Field `LAST_UPDATED_KEY` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static String ID_KEY = "id";
  private static String META_KEY = "meta";
  private static String LAST_UPDATED_KEY = "lastUpdated";
  private static String TAG_KEY = "tag";
  private static String SYSTEM_KEY = "system";
```

### FieldMayBeFinal
Field `CODE_KEY` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static String TAG_KEY = "tag";
  private static String SYSTEM_KEY = "system";
  private static String CODE_KEY = "code";

  private static PCollection<KV<String, GenericRecord>> readAndMapToId(
```

### FieldMayBeFinal
Field `TAG_KEY` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/ParquetMerger.java`
#### Snippet
```java
  private static String META_KEY = "meta";
  private static String LAST_UPDATED_KEY = "lastUpdated";
  private static String TAG_KEY = "tag";
  private static String SYSTEM_KEY = "system";
  private static String CODE_KEY = "code";
```

### FieldMayBeFinal
Field `jdbcSource` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
  private static final Logger log = LoggerFactory.getLogger(JdbcFetchHapi.class);

  private DataSource jdbcSource;

  JdbcFetchHapi(DataSource jdbcSource) {
```

### FieldMayBeFinal
Field `resourceList` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchHapi.java`
#### Snippet
```java
      extends PTransform<PCollection<QueryParameterDescriptor>, PCollection<HapiRowDescriptor>> {

    private String resourceList;
    private final JdbcIO.DataSourceConfiguration dataSourceConfig;

```

### FieldMayBeFinal
Field `jdbcSource` may be 'final'
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
  private static final Logger log = LoggerFactory.getLogger(JdbcFetchOpenMrs.class);

  private DataSource jdbcSource;

  JdbcFetchOpenMrs(DataSource jdbcSource) {
```

## RuleId[id=SpringJavaAutowiredFieldsWarningInspection]
### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `pipelines/controller/src/main/java/org/openmrs/analytics/ApiController.java`
#### Snippet
```java
  private static final String SUCCESS = "SUCCESS";

  @Autowired private PipelineManager pipelineManager;

  @PostMapping("/run")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `pipelines/controller/src/main/java/org/openmrs/analytics/MainController.java`
#### Snippet
```java
  @Autowired private DataProperties dataProperties;

  @Autowired private PipelineManager pipelineManager;

  @GetMapping("/")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `pipelines/controller/src/main/java/org/openmrs/analytics/MainController.java`
#### Snippet
```java
  private static final String HTML_HELP_PAGE = "help";

  @Autowired private DataProperties dataProperties;

  @Autowired private PipelineManager pipelineManager;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `pipelines/controller/src/main/java/org/openmrs/analytics/metrics/PipelineMetricsFactory.java`
#### Snippet
```java
      LoggerFactory.getLogger(PipelineMetricsFactory.class.getName());
  private static final String FLINK_RUNNER = "FlinkRunner";
  @Autowired private FlinkPipelineMetrics flinkPipelineMetrics;

  /**
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
  @Autowired private DwhFilesManager dwhFilesManager;

  @Autowired private MeterRegistry meterRegistry;

  private PipelineThread currentPipeline;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
  @Autowired private PipelineMetricsFactory pipelineMetricsFactory;

  @Autowired private DwhFilesManager dwhFilesManager;

  @Autowired private MeterRegistry meterRegistry;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
  @Autowired private DataProperties dataProperties;

  @Autowired private PipelineMetricsFactory pipelineMetricsFactory;

  @Autowired private DwhFilesManager dwhFilesManager;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(PipelineManager.class.getName());

  @Autowired private DataProperties dataProperties;

  @Autowired private PipelineMetricsFactory pipelineMetricsFactory;
```

## RuleId[id=ConfusingMainMethod]
### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `bunsen/bunsen-avro/src/main/java/com/cerner/bunsen/avro/tools/GenerateSchemas.java`
#### Snippet
```java
   * @return the OS status code
   */
  public static int main(String[] args) {

    if (args.length < 2) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `meterRegistry` is redundant
in `pipelines/controller/src/main/java/org/openmrs/analytics/AppConfig.java`
#### Snippet
```java
  @Bean
  public MeterRegistry getMeterRegistry() {
    MeterRegistry meterRegistry = new CompositeMeterRegistry();
    return meterRegistry;
  }
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

### UnnecessaryLocalVariable
Local variable `maxId` is redundant
in `pipelines/batch/src/main/java/org/openmrs/analytics/JdbcFetchOpenMrs.java`
#### Snippet
```java
        ResultSet resultSet = statement.executeQuery(query)) {
      resultSet.first();
      int maxId = resultSet.getInt("max_id");
      return maxId;
    }
```

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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `pipelines/controller/src/main/java/org/openmrs/analytics/ApiController.java`
#### Snippet
```java
    InputStreamResource inputStreamResource = new InputStreamResource(stream);
    MultiValueMap<String, String> headers = new HttpHeaders();
    headers.put("Content-type", Arrays.asList(MediaType.TEXT_PLAIN_VALUE));
    return new ResponseEntity<>(inputStreamResource, headers, HttpStatus.OK);
  }
```

## RuleId[id=UnusedAssignment]
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
Variable `resource` initializer `null` is redundant
in `pipelines/batch/src/main/java/org/openmrs/analytics/ConvertResourceFn.java`
#### Snippet
```java
    String jsonResource = element.jsonResource();
    long startTime = System.currentTimeMillis();
    Resource resource = null;
    if (jsonResource == null || jsonResource.isBlank()) {
      // The jsonResource field will be empty in case of deleted records and are ignored during
```

### UnusedAssignment
Variable `segmentMap` initializer `Maps.newHashMap()` is redundant
in `pipelines/batch/src/main/java/org/openmrs/analytics/FhirEtl.java`
#### Snippet
```java
  private static Pipeline buildFhirSearchPipeline(FhirEtlOptions options, FhirContext fhirContext) {
    FhirSearchUtil fhirSearchUtil = createFhirSearchUtil(options, fhirContext);
    Map<String, List<SearchSegmentDescriptor>> segmentMap = Maps.newHashMap();
    try {
      // TODO in the activePeriod case, among patientAssociatedResources, only fetch Encounter here.
```

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
Variable `className` initializer `null` is redundant
in `bunsen/bunsen-core/src/main/java/com/cerner/bunsen/definitions/StructureDefinitions.java`
#### Snippet
```java

    FhirVersionEnum versionEnum = context.getVersion().getVersion();
    String className = null;

    if (FhirVersionEnum.DSTU3.equals(versionEnum)) {
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
Condition `prefix == null` is always `false`
in `pipelines/controller/src/main/java/org/openmrs/analytics/DwhFilesManager.java`
#### Snippet
```java

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
        PipelineConfig pipelineConfig,
        boolean isBatchRun) {
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
Condition `pipeline.getOptions().as(FhirEtlOptions.class) != null` is always `true`
in `pipelines/controller/src/main/java/org/openmrs/analytics/PipelineManager.java`
#### Snippet
```java
        PipelineConfig pipelineConfig,
        boolean isBatchRun) {
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

      // Sort snapshots directories.
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

