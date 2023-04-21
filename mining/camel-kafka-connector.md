# camel-kafka-connector 
 
# Bad smells
I found 336 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 164 | false |
| DynamicRegexReplaceableByCompiledPattern | 32 | false |
| BoundedWildcard | 13 | false |
| DefaultAnnotationParam | 11 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 10 | false |
| AssignmentToMethodParameter | 9 | false |
| ReturnNull | 9 | false |
| ReplaceAssignmentWithOperatorAssignment | 8 | false |
| SizeReplaceableByIsEmpty | 7 | true |
| RedundantEscapeInRegexReplacement | 7 | false |
| UnnecessaryFullyQualifiedName | 7 | false |
| DataFlowIssue | 5 | false |
| UnnecessaryLocalVariable | 5 | true |
| SimplifyStreamApiCallChains | 4 | false |
| InnerClassMayBeStatic | 4 | true |
| PublicFieldAccessedInSynchronizedContext | 4 | false |
| UnusedAssignment | 4 | false |
| ConstantValue | 4 | false |
| Convert2MethodRef | 3 | false |
| IgnoreResultOfCall | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| Convert2Lambda | 3 | false |
| RegExpRedundantEscape | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| ImplicitArrayToString | 2 | false |
| SynchronizeOnThis | 2 | false |
| MethodOverridesStaticMethod | 2 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| RedundantSuppression | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| NestedAssignment | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `connectorModelInputSream` might be null
in `camel-kafka-connector-catalog/src/main/java/org/apache/camel/kafkaconnector/catalog/CamelKafkaConnectorCatalog.java`
#### Snippet
```java
        String result = null;
        try (InputStream connectorModelInputSream = CamelKafkaConnectorCatalog.class.getResourceAsStream("/" + CONNECTORS_DIR + "/" + connectorName + ".json")) {
            result = new BufferedReader(new InputStreamReader(connectorModelInputSream, StandardCharsets.UTF_8))
                .lines()
                .map(String::trim) // to change line
```

### DataFlowIssue
Argument `input` might be null
in `camel-kafka-connector-catalog/src/main/java/org/apache/camel/kafkaconnector/catalog/CamelKafkaConnectorCatalog.java`
#### Snippet
```java
    private void initCatalog() {
        try (InputStream input = CamelKafkaConnectorCatalog.class.getResourceAsStream("/" + DESCRIPTORS_DIR + "/" + CONNECTORS_PROPERTIES)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            while (reader.ready()) {
```

### DataFlowIssue
Argument `UpdateDocComponentsListMojo.class.getClassLoader().getResourceAsStream("nav.mvel")` might be null
in `tooling/camel-kafka-connector-docs-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/docs/UpdateDocComponentsListMojo.java`
#### Snippet
```java
        String changed = null;
        try {
            String template = loadText(UpdateDocComponentsListMojo.class.getClassLoader().getResourceAsStream("nav.mvel"));
            changed = (String)TemplateRuntime.eval(template, model, Collections.singletonMap("util", MvelHelper.INSTANCE));
        } catch (Exception e) {
```

### DataFlowIssue
Argument `UpdateDocComponentsListMojo.class.getClassLoader().getResourceAsStream("connectors.mvel")` might be null
in `tooling/camel-kafka-connector-docs-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/docs/UpdateDocComponentsListMojo.java`
#### Snippet
```java
        try {
            String template = null;
            template = loadText(UpdateDocComponentsListMojo.class.getClassLoader().getResourceAsStream("connectors.mvel"));
            String out = (String)TemplateRuntime.eval(template, model, Collections.singletonMap("util", MvelHelper.INSTANCE));
            return out;
```

### DataFlowIssue
Argument `KameletsCatalog.class.getResourceAsStream(pathInJar)` might be null
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
            String pathInJar = "/" + fileName;
            String kamelet = new BufferedReader(
                    new InputStreamReader(KameletsCatalog.class.getResourceAsStream(pathInJar), StandardCharsets.UTF_8))
                    .lines()
                    .collect(Collectors.joining("\n"));
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
        // exclude all components used in a kamelet
        camelComponentsUsedInKamelets.addAll(excludedComponents);
        excludedComponents = camelComponentsUsedInKamelets.stream().collect(Collectors.toList());
        if (excludedComponents == null || excludedComponents.isEmpty()) {
            filteredComponents = components;
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
        }
        if (fields.size() != 0 && fields.size() > headers.size()) {
            String fieldsWithoutCorrespondingHeaders = fields.subList(headers.size(), fields.size()).stream().collect(Collectors.joining(","));
            throw new IllegalArgumentException("There is no corresponding header(s) configured for the following field(s): " + fieldsWithoutCorrespondingHeaders);
        }
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
        }
        if (fields.size() != 0 && headers.size() > fields.size()) {
            String headersWithoutCorrespondingFields = headers.subList(fields.size(), headers.size()).stream().collect(Collectors.joining(","));
            LOG.warn("There is no corresponding header(s) for the following field(s): {} ", headersWithoutCorrespondingFields);
        }
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
        }
        if (fields.size() == 0 && headers.size() > 1) {
            LOG.warn("Fields are empty and there are more than 1 header it means whole value/key will put in the first header of this list: {} ", headers.stream().collect(Collectors.joining(",")));
        }
    }
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `typeConverter` from instance context
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/CamelTypeConverterTransform.java`
#### Snippet
```java

        // initialize type converter from camel context
        typeConverter = getCamelContext().getTypeConverter();
    }

```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `tooling/camel-kafka-connector-catalog-descriptor-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/catalog/descriptor/CollectConnectorDescriptorMojo.java`
#### Snippet
```java
            if (files != null) {
                Arrays.sort(files);
                Stream.of(files).filter(f -> f.isDirectory()).forEach(f -> getLog().info(f.getPath()));
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < files.length; i++) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
        } else {
            Set<String> filterComponentNames = new HashSet<>(Arrays.asList(filter.split(",")));
            components = cc.findComponentNames().stream().filter(componentName -> filterComponentNames.contains(componentName)).collect(Collectors.toList());
        }
        // exclude all components used in a kamelet
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
    private void validateConfig() {

        boolean validFields  = fields.stream().allMatch(nef -> nef != null);
        boolean validHeaders = headers.stream().allMatch(nef -> nef != null && !nef.trim().isEmpty());

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
                dependencies.appendChild(dependency);

                String[] comps = dep.split("\\:");
                String groupIdStr = comps[0];
                String artifactIdStr = comps[1];
```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java

        for (String dep : colonSeparatedDependeciesToExclude) {
            String[] tokens = dep.split("\\:");
            String groupIdStr = tokens[0];
            String artifactIdStr = tokens[1];
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `options` may be replaced with 'values()' iteration
in `camel-kafka-connector-catalog/src/main/java/org/apache/camel/kafkaconnector/catalog/CamelKafkaConnectorCatalog.java`
#### Snippet
```java
        JsonObject wrapper = (JsonObject)obj.get("properties");
        Set<String> options = wrapper.keySet();
        for (String string : options) {
            JsonObject object = (JsonObject)wrapper.get(string);
            CamelKafkaConnectorOptionModel singleModel = new CamelKafkaConnectorOptionModel();
```

### KeySetIterationMayUseEntrySet
Iteration over `kameletsResources.keySet()` may be replaced with 'entrySet()' iteration
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
        getLog().info("Kamelets found to be used to generate/update a kafka connector: " + kameletsResources.keySet());

        for (String kamelet : kameletsResources.keySet()) {
            executeMojo(
                    plugin(
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`csv.trim().length() == 0` can be replaced with 'csv.trim().isEmpty()'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java

    public static Set<String> csvToSet(String csv) {
        if (csv == null || csv.trim().length() == 0) {
            return new TreeSet<>();
        }
```

### SizeReplaceableByIsEmpty
`artExcl.trim().length() > 0` can be replaced with '!artExcl.trim().isEmpty()'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        String artExcl = properties.getProperty(EXCLUDE_DEPENDENCY_PROPERTY_PREFIX + getMainDepArtifactId());
        getLog().debug("Configured exclusions: " + artExcl);
        if (artExcl != null && artExcl.trim().length() > 0) {
            for (String dep : artExcl.split(",")) {
                getLog().debug("Adding configured exclusion: " + dep);
```

### SizeReplaceableByIsEmpty
`additionalProp.trim().length() > 0` can be replaced with '!additionalProp.trim().isEmpty()'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

    private void addProperties(Map<String, String> additionalProperties, String additionalProp) {
        if (additionalProp != null && additionalProp.trim().length() > 0) {
            for (String prop : additionalProp.split(",")) {
                getLog().debug("Additional property before key value split: " + prop);
```

### SizeReplaceableByIsEmpty
`additionalProp.trim().length() > 0` can be replaced with '!additionalProp.trim().isEmpty()'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

    private void addProperties(Map<String, String> additionalProperties, String additionalProp) {
        if (additionalProp != null && additionalProp.trim().length() > 0) {
            for (String prop : additionalProp.split(",")) {
                getLog().debug("Additional property before key value split: " + prop);
```

### SizeReplaceableByIsEmpty
`fields.size() != 0` can be replaced with '!fields.isEmpty()'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
            throw new IllegalArgumentException("fields configuration property cannot be null (can be an empty string if you want the whole value/key), headers configuration property cannot be null or contain empty elements.");
        }
        if (fields.size() != 0 && fields.size() > headers.size()) {
            String fieldsWithoutCorrespondingHeaders = fields.subList(headers.size(), fields.size()).stream().collect(Collectors.joining(","));
            throw new IllegalArgumentException("There is no corresponding header(s) configured for the following field(s): " + fieldsWithoutCorrespondingHeaders);
```

### SizeReplaceableByIsEmpty
`fields.size() != 0` can be replaced with '!fields.isEmpty()'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
            throw new IllegalArgumentException("There is no corresponding header(s) configured for the following field(s): " + fieldsWithoutCorrespondingHeaders);
        }
        if (fields.size() != 0 && headers.size() > fields.size()) {
            String headersWithoutCorrespondingFields = headers.subList(fields.size(), headers.size()).stream().collect(Collectors.joining(","));
            LOG.warn("There is no corresponding header(s) for the following field(s): {} ", headersWithoutCorrespondingFields);
```

### SizeReplaceableByIsEmpty
`fields.size() == 0` can be replaced with 'fields.isEmpty()'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
            LOG.warn("There is no corresponding header(s) for the following field(s): {} ", headersWithoutCorrespondingFields);
        }
        if (fields.size() == 0 && headers.size() > 1) {
            LOG.warn("Fields are empty and there are more than 1 header it means whole value/key will put in the first header of this list: {} ", headers.stream().collect(Collectors.joining(",")));
        }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
                }
            } catch (IOException ioe) {
                throw new MojoFailureException("IO error trying to read whether " + target.toString() + " contains @Generated annotation", ioe);
            }
        }
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '?'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n").replaceFirst("\\?><!--", "\\?>\n<!--");

        writeFileIfChanged(content, destination, log);
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        confMethod.setBody(confMethod.getBody() + "return conf;");

        String javaClassConnectorConfigFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorConfigName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnectorConfig, javaClassConnectorConfigFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        getDefaultConfigMethod.setBody(getDefaultConfigMethod.getBody() + "}};\n");
        getDefaultConfigMethod.addAnnotation(Override.class);
        String javaClassTaskFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassTaskName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassTask, javaClassTaskFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task.class;").addAnnotation(Override.class);

        String javaClassConnectorFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnector, javaClassConnectorFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        confMethod.setBody(confMethod.getBody() + "return conf;");

        String javaClassConnectorConfigFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorConfigName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnectorConfig, javaClassConnectorConfigFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        getSinkOrSourceKameletMethod.addAnnotation(Override.class);

        String javaClassTaskFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassTaskName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassTask, javaClassTaskFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task.class;").addAnnotation(Override.class);

        String javaClassConnectorFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnector, javaClassConnectorFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `WholeRecordValue` may be 'static'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
    }

    public class WholeRecordValue implements RecordValue {
        private Object value;
        private Schema schema;
```

### InnerClassMayBeStatic
Inner class `MapRecordValue` may be 'static'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
    }

    public class MapRecordValue implements RecordValue {

        private Map<String, Object> map;
```

### InnerClassMayBeStatic
Inner class `StructRecordValue` may be 'static'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java
    }

    public class StructRecordValue implements RecordValue {

        private Struct struct;
```

### InnerClassMayBeStatic
Inner class `CacheEntry` may be 'static'
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/SourcePojoToSchemaAndStructTransform.java`
#### Snippet
```java
    }

    public class CacheEntry {
        private AvroSchema avroSchemaWrapper;
        private ObjectWriter objectWriter;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends KameletPropertyModel`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/model/KameletModel.java`
#### Snippet
```java
    }

    public void setProperties(List<KameletPropertyModel> properties) {
        this.properties = properties;
    }
```

### BoundedWildcard
Can generalize to `? extends CamelKafkaConnectorOptionModel`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/JsonMapperKafkaConnector.java`
#### Snippet
```java
    }

    public static JsonObject asJsonObject(List<CamelKafkaConnectorOptionModel> options) {
        JsonObject json = new JsonObject();
        options.forEach(option -> json.put(option.getName(), asJsonObject(option)));
```

### BoundedWildcard
Can generalize to `? extends T`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
    }

    public static <T> Stream<T> concat(Stream<T> s1, Stream<T> s2, Stream<T> s3) {
        return Stream.concat(s1, Stream.concat(s2, s3));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
    }

    public static <T> Stream<T> concat(Stream<T> s1, Stream<T> s2, Stream<T> s3) {
        return Stream.concat(s1, Stream.concat(s2, s3));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
    }

    public static <T> Stream<T> concat(Stream<T> s1, Stream<T> s2, Stream<T> s3) {
        return Stream.concat(s1, Stream.concat(s2, s3));
    }
```

### BoundedWildcard
Can generalize to `? super CamelKafkaConnectorOptionModel`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

    private void addConnectorOptions(String sanitizedName, ConnectorType ct, JavaClass javaClass, Method confMethod, String propertyQualifier, String firstNamespace,
                                     String secondNamespace, BaseOptionModel baseOptionModel, List<CamelKafkaConnectorOptionModel> listOptions) {
        String propertyName = baseOptionModel.getName();

```

### BoundedWildcard
Can generalize to `? super String`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
    }

    private void addProperties(Map<String, String> additionalProperties, String additionalProp) {
        if (additionalProp != null && additionalProp.trim().length() > 0) {
            for (String prop : additionalProp.split(",")) {
```

### BoundedWildcard
Can generalize to `? super String`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
    }

    private void addProperties(Map<String, String> additionalProperties, String additionalProp) {
        if (additionalProp != null && additionalProp.trim().length() > 0) {
            for (String prop : additionalProp.split(",")) {
```

### BoundedWildcard
Can generalize to `? super CamelKafkaConnectorOptionModel`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

    private void addConnectorOptions(String sanitizedName, ConnectorType ct, JavaClass javaClass, Method confMethod, String propertyQualifier, KameletPropertyModel kameletProperty,
                                     List<CamelKafkaConnectorOptionModel> listOptions, Set<String> kameletRequiredProperties) {
        String propertyName = kameletProperty.getName();

```

### BoundedWildcard
Can generalize to `? super String`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
    }

    private void addProperties(Map<String, String> additionalProperties, String additionalProp) {
        if (additionalProp != null && additionalProp.trim().length() > 0) {
            for (String prop : additionalProp.split(",")) {
```

### BoundedWildcard
Can generalize to `? super String`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
    }

    private void addProperties(Map<String, String> additionalProperties, String additionalProp) {
        if (additionalProp != null && additionalProp.trim().length() > 0) {
            for (String prop : additionalProp.split(",")) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/AbstractCamelKafkaConnectorMojo.java`
#### Snippet
```java
    }

    protected static <T> Supplier<T> cache(Supplier<T> supplier) {
        return new Supplier<T>() {
            T value;
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSinkTask.java`
#### Snippet
```java
    }

    private static void mapHeader(Header header, String prefix, Map<String, Object> destination) {
        final String key = StringHelper.after(header.key(), prefix, header.key());
        final Schema schema = header.schema();
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `this.producerTemplate` accessed in synchronized context
in `core/src/main/java/org/apache/camel/kafkaconnector/utils/CamelKafkaConnectMain.java`
#### Snippet
```java
        if (this.producerTemplate == null) {
            synchronized (this) {
                if (this.producerTemplate == null) {
                    this.producerTemplate = getCamelContext().createProducerTemplate();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.producerTemplate` accessed in synchronized context
in `core/src/main/java/org/apache/camel/kafkaconnector/utils/CamelKafkaConnectMain.java`
#### Snippet
```java
            synchronized (this) {
                if (this.producerTemplate == null) {
                    this.producerTemplate = getCamelContext().createProducerTemplate();
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.consumerTemplate` accessed in synchronized context
in `core/src/main/java/org/apache/camel/kafkaconnector/utils/CamelKafkaConnectMain.java`
#### Snippet
```java
        if (this.consumerTemplate == null) {
            synchronized (this) {
                if (this.consumerTemplate == null) {
                    this.consumerTemplate = getCamelContext().createConsumerTemplate();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.consumerTemplate` accessed in synchronized context
in `core/src/main/java/org/apache/camel/kafkaconnector/utils/CamelKafkaConnectMain.java`
#### Snippet
```java
            synchronized (this) {
                if (this.consumerTemplate == null) {
                    this.consumerTemplate = getCamelContext().createConsumerTemplate();
                }
            }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `connectors/camel-syslog-kafka-connector/src/generated/java/org/apache/camel/kafkaconnector/syslog/converters/CamelStreamCacheConverterLoader.java`
#### Snippet
```java
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class CamelStreamCacheConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-kafka-connector-catalog-descriptor-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/catalog/descriptor/CollectConnectorDescriptorMojo.java`
#### Snippet
```java
                    // Create the structure
                    File parent = file.getParentFile();
                    parent.mkdirs();
                }
                file.createNewFile();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `tooling/camel-kafka-connector-catalog-descriptor-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/catalog/descriptor/CollectConnectorDescriptorMojo.java`
#### Snippet
```java
                    parent.mkdirs();
                }
                file.createNewFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(sb.toString());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
            // Create the structure
            File parent = file.getParentFile();
            parent.mkdirs();
        }

```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletCreateMojo.java`
#### Snippet
```java
    protected String name;

    @Parameter(property = "overridePomFile", required = false, defaultValue = "false")
    protected Boolean overridePomFile;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorCreateMojo.java`
#### Snippet
```java
    protected String componentJson;

    @Parameter(property = "overridePomFile", required = false, defaultValue = "false")
    protected Boolean overridePomFile;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
     * The Exclusion List of connectors that must be skipped while deleting kafka connector.
     */
    @Parameter(defaultValue = "", readonly = true)
    private List excludedConnectorsFromDeletion = Collections.EMPTY_LIST;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
     * groupId:ArtifactId:version,groupId_2:ArtifactId_2:version_2)
     */
    @Parameter(defaultValue = "", readonly = true)
    private String additionalKameletDependencies;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
     * The Camel Component Exclusion List to select for which components must be skipped while generating kafka connector.
     */
    @Parameter(defaultValue = "", readonly = true)
    private List excludedComponents = Collections.EMPTY_LIST;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
     * The Camel Kamelets Exclusion List to select for which kamelet must be skipped while generating kafka connector.
     */
    @Parameter(defaultValue = "", readonly = true)
    private List excludedKamelets = Collections.EMPTY_LIST;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
    private static final String KAMELETS_FILE_SUFFIX = ".kamelet.yaml";

    @Parameter(property = "overridePomFile", required = false, defaultValue = "false")
    protected Boolean overridePomFile;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
     * groupId:ArtifactId:version,groupId_2:ArtifactId_2:version_2)
     */
    @Parameter(defaultValue = "", readonly = true)
    protected String additionalComponentDependencies;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
     * The Camel Component Filter to select for which components generate the corresponding camel kafka connector.
     */
    @Parameter(defaultValue = "", readonly = true)
    private String filter;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
     * groupId:ArtifactId:version,groupId_2:ArtifactId_2:version_2)
     */
    @Parameter(defaultValue = "", readonly = true)
    private String additionalDependencies;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
     * groupId:ArtifactId:version,groupId_2:ArtifactId_2:version_2)
     */
    @Parameter(defaultValue = "", readonly = true)
    private String additionalDependencies;

```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array `keyValue`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
                getLog().debug("Additional property before key value split: " + prop);
                String[] keyValue = prop.split("=");
                getLog().debug("Additional property key value: " + keyValue);
                additionalProperties.put(keyValue[0], keyValue[1]);
            }
```

### ImplicitArrayToString
Implicit call to 'toString()' on array `keyValue`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
                getLog().debug("Additional property before key value split: " + prop);
                String[] keyValue = prop.split("=");
                getLog().debug("Additional property key value: " + keyValue);
                additionalProperties.put(keyValue[0], keyValue[1]);
            }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
                        kameletModel.getDependencies().stream()
                                .filter(d -> d.startsWith("camel:"))
                                .map(d -> d.replaceFirst("camel:", ""))
                                .collect(Collectors.toSet())
                );
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java

    public static String sanitizeMavenArtifactId(String toBesanitizedArtifactId) {
        return toBesanitizedArtifactId != null ? toBesanitizedArtifactId.toLowerCase().replaceAll("[^A-Za-z0-9]", "-") : null;
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n").replaceFirst("\\?><!--", "\\?>\n<!--");

        writeFileIfChanged(content, destination, log);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n").replaceFirst("\\?><!--", "\\?>\n<!--");

        writeFileIfChanged(content, destination, log);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        String replacement = "$1_";

        String propertyPrefix = "CAMEL_" + ct + "_" + sanitizedName.replace("-", "").toUpperCase() + "_" + propertyQualifier.toUpperCase() + "_"
                                + StringUtils.capitalize(propertyName).replaceAll(regex, replacement).toUpperCase();
        String propertyValue = "camel." + firstNamespace + "." + secondNamespace + "." + baseOptionModel.getName();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        String ctCapitalizedName = StringUtils.capitalize(ct.name().toLowerCase());
        String ctLowercaseName = ct.name().toLowerCase();
        String packageName = "org.apache.camel.kafkaconnector." + RESERVED_WORDS_SUBSTITUTION_MAP.getOrDefault(sanitizedName.replace("-", ""), sanitizedName.replace("-", ""));
        Map<String, String> additionalProperties = new HashMap<>();
        Properties properties = new Properties();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        String ctCapitalizedName = StringUtils.capitalize(ct.name().toLowerCase());
        String ctLowercaseName = ct.name().toLowerCase();
        String packageName = "org.apache.camel.kafkaconnector." + RESERVED_WORDS_SUBSTITUTION_MAP.getOrDefault(sanitizedName.replace("-", ""), sanitizedName.replace("-", ""));
        Map<String, String> additionalProperties = new HashMap<>();
        Properties properties = new Properties();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

        // Camel{sanitizedName}{Sink,Source}ConnectorConfig.java
        String javaClassConnectorConfigName = "Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig";
        final JavaClass javaClassConnectorConfig = new JavaClass(getProjectClassLoader());
        javaClassConnectorConfig.setPackage(packageName);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        confMethod.setBody(confMethod.getBody() + "return conf;");

        String javaClassConnectorConfigFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorConfigName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnectorConfig, javaClassConnectorConfigFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

        // Camel{sanitizedName}{Sink,Source}Task.java
        String javaClassTaskName = "Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task";
        final JavaClass javaClassTask = new JavaClass(getProjectClassLoader());
        javaClassTask.setPackage(packageName);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        javaClassTask.addMethod().setConstructor(false).setName("getCamel" + ctCapitalizedName + "ConnectorConfig").setProtected().addParameter("Map<String, String>", "props")
            .setReturnType("Camel" + ctCapitalizedName + "ConnectorConfig")
            .setBody("return new Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig(props);").addAnnotation(Override.class);
        Method getDefaultConfigMethod = javaClassTask.addMethod().setConstructor(false).setName("getDefaultConfig").setProtected().setReturnType("Map<String, String>")
            .setBody("return new HashMap<String, String>() {{\n");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        getDefaultConfigMethod.setBody(getDefaultConfigMethod.getBody() + "}};\n");
        getDefaultConfigMethod.addAnnotation(Override.class);
        String javaClassTaskFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassTaskName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassTask, javaClassTaskFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

        // Camel{sanitizedName}{Sink,Source}Connector.java
        String javaClassConnectorName = "Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Connector";
        final JavaClass javaClassConnector = new JavaClass(getProjectClassLoader());
        javaClassConnector.setPackage(packageName);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

        javaClassConnector.addMethod().setConstructor(false).setName("config").setPublic().setReturnType("ConfigDef")
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig.conf();").addAnnotation(Override.class);
        javaClassConnector.addMethod().setConstructor(false).setName("taskClass").setPublic().setReturnType("Class<? extends Task>")
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task.class;").addAnnotation(Override.class);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig.conf();").addAnnotation(Override.class);
        javaClassConnector.addMethod().setConstructor(false).setName("taskClass").setPublic().setReturnType("Class<? extends Task>")
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task.class;").addAnnotation(Override.class);

        String javaClassConnectorFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorName + ".java";
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task.class;").addAnnotation(Override.class);

        String javaClassConnectorFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnector, javaClassConnectorFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        String ctCapitalizedName = StringUtils.capitalize(ct.name().toLowerCase());
        String ctLowercaseName = ct.name().toLowerCase();
        String packageName = "org.apache.camel.kafkaconnector." + RESERVED_WORDS_SUBSTITUTION_MAP.getOrDefault(sanitizedName.replace("-", ""), sanitizedName.replace("-", ""));
        Map<String, String> additionalProperties = new HashMap<>();
        Properties properties = new Properties();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        String ctCapitalizedName = StringUtils.capitalize(ct.name().toLowerCase());
        String ctLowercaseName = ct.name().toLowerCase();
        String packageName = "org.apache.camel.kafkaconnector." + RESERVED_WORDS_SUBSTITUTION_MAP.getOrDefault(sanitizedName.replace("-", ""), sanitizedName.replace("-", ""));
        Map<String, String> additionalProperties = new HashMap<>();
        Properties properties = new Properties();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

        // Camel{sanitizedName}{Sink,Source}ConnectorConfig.java
        String javaClassConnectorConfigName = "Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig";
        final JavaClass javaClassConnectorConfig = new JavaClass(getProjectClassLoader());
        javaClassConnectorConfig.setPackage(packageName);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        confMethod.setBody(confMethod.getBody() + "return conf;");

        String javaClassConnectorConfigFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorConfigName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnectorConfig, javaClassConnectorConfigFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

        // Camel{sanitizedName}{Sink,Source}Task.java
        String javaClassTaskName = "Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task";
        final JavaClass javaClassTask = new JavaClass(getProjectClassLoader());
        javaClassTask.setPackage(packageName);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        javaClassTask.addMethod().setConstructor(false).setName("getCamel" + ctCapitalizedName + "ConnectorConfig").setProtected().addParameter("Map<String, String>", "props")
            .setReturnType("Camel" + ctCapitalizedName + "ConnectorConfig")
            .setBody("return new Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig(props);").addAnnotation(Override.class);

        if (!additionalProperties.keySet().isEmpty()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        getSinkOrSourceKameletMethod.addAnnotation(Override.class);

        String javaClassTaskFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassTaskName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassTask, javaClassTaskFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

        // Camel{sanitizedName}{Sink,Source}Connector.java
        String javaClassConnectorName = "Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Connector";
        final JavaClass javaClassConnector = new JavaClass(getProjectClassLoader());
        javaClassConnector.setPackage(packageName);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

        javaClassConnector.addMethod().setConstructor(false).setName("config").setPublic().setReturnType("ConfigDef")
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig.conf();").addAnnotation(Override.class);
        javaClassConnector.addMethod().setConstructor(false).setName("taskClass").setPublic().setReturnType("Class<? extends Task>")
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task.class;").addAnnotation(Override.class);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig.conf();").addAnnotation(Override.class);
        javaClassConnector.addMethod().setConstructor(false).setName("taskClass").setPublic().setReturnType("Class<? extends Task>")
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task.class;").addAnnotation(Override.class);

        String javaClassConnectorFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorName + ".java";
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task.class;").addAnnotation(Override.class);

        String javaClassConnectorFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnector, javaClassConnectorFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        String replacement = "$1_";

        String propertyPrefix = "CAMEL_" + ct + "_" + sanitizedName.replace("-", "").toUpperCase() + "_" + propertyQualifier.toUpperCase() + "_"
                                + StringUtils.capitalize(propertyName).replaceAll(regex, replacement).toUpperCase();
        String propertyValue = "camel.kamelet." + name + "." + propertyName;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

        String docFieldName = propertyPrefix + "DOC";
        String docLiteralInitializer = kameletProperty.getDescription().replace("\n", " ");
        if (kameletProperty.getExample() != null) {
            docLiteralInitializer = docLiteralInitializer + " Example: " + kameletProperty.getExample().replace("\n", " ");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        String docLiteralInitializer = kameletProperty.getDescription().replace("\n", " ");
        if (kameletProperty.getExample() != null) {
            docLiteralInitializer = docLiteralInitializer + " Example: " + kameletProperty.getExample().replace("\n", " ");
        }
        javaClass.addField().setFinal(true).setPublic().setStatic(true).setName(docFieldName).setType(String.class).setStringInitializer(docLiteralInitializer);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
        Set<String> gavDeps = deps.stream().map(stringDep -> {
            if (stringDep.startsWith("mvn:")) {
                return stringDep.replaceFirst("mvn:", "");
            } else if (stringDep.startsWith("camel:")) {
                return getMainDepGroupId() + ":" + stringDep.replaceFirst(":", "-");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
                return stringDep.replaceFirst("mvn:", "");
            } else if (stringDep.startsWith("camel:")) {
                return getMainDepGroupId() + ":" + stringDep.replaceFirst(":", "-");
            } else {
                getLog().warn("Dependency " + stringDep + "is used as is. Might not be the intended behaviour!");
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/DynamicClassLoader.java`
#### Snippet
```java

    public Class defineClass(String name, byte[] data) {
        return super.defineClass(name, data, 0, data.length);
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary, and can be replaced with an import
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
            try {
                classpathElements = project.getTestClasspathElements();
            } catch (org.apache.maven.artifact.DependencyResolutionRequiredException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary, and can be replaced with an import
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
            try {
                classpathElements = project.getTestClasspathElements();
            } catch (org.apache.maven.artifact.DependencyResolutionRequiredException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/SourcePojoToSchemaAndStructTransform.java`
#### Snippet
```java
                byte[] avroDataByte = cacheEntry.getObjectWriter().writeValueAsBytes(r.value());
                Decoder decoder = DecoderFactory.get().binaryDecoder(avroDataByte, null);
                org.apache.avro.Schema avroSchema = cacheEntry.getAvroSchemaWrapper().getAvroSchema();
                DatumReader<GenericRecord> datumReader = new GenericDatumReader<>(avroSchema);
                GenericRecord genericAvroData = datumReader.read(null, decoder);
```

### UnnecessaryFullyQualifiedName
Qualifier `io.netty.buffer` is unnecessary, and can be replaced with an import
in `connectors/camel-syslog-kafka-connector/src/generated/java/org/apache/camel/kafkaconnector/syslog/converters/CamelStreamCacheConverterLoader.java`
#### Snippet
```java

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, io.netty.buffer.ByteBuf.class, org.apache.camel.StreamCache.class, false,
            (type, exchange, value) -> org.apache.camel.kafkaconnector.syslog.converters.CamelStreamCacheConverter.toByteBuf((org.apache.camel.StreamCache) value));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel` is unnecessary, and can be replaced with an import
in `connectors/camel-syslog-kafka-connector/src/generated/java/org/apache/camel/kafkaconnector/syslog/converters/CamelStreamCacheConverterLoader.java`
#### Snippet
```java

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, io.netty.buffer.ByteBuf.class, org.apache.camel.StreamCache.class, false,
            (type, exchange, value) -> org.apache.camel.kafkaconnector.syslog.converters.CamelStreamCacheConverter.toByteBuf((org.apache.camel.StreamCache) value));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.kafkaconnector.syslog.converters` is unnecessary and can be removed
in `connectors/camel-syslog-kafka-connector/src/generated/java/org/apache/camel/kafkaconnector/syslog/converters/CamelStreamCacheConverterLoader.java`
#### Snippet
```java
    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, io.netty.buffer.ByteBuf.class, org.apache.camel.StreamCache.class, false,
            (type, exchange, value) -> org.apache.camel.kafkaconnector.syslog.converters.CamelStreamCacheConverter.toByteBuf((org.apache.camel.StreamCache) value));
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel` is unnecessary, and can be replaced with an import
in `connectors/camel-syslog-kafka-connector/src/generated/java/org/apache/camel/kafkaconnector/syslog/converters/CamelStreamCacheConverterLoader.java`
#### Snippet
```java
    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, io.netty.buffer.ByteBuf.class, org.apache.camel.StreamCache.class, false,
            (type, exchange, value) -> org.apache.camel.kafkaconnector.syslog.converters.CamelStreamCacheConverter.toByteBuf((org.apache.camel.StreamCache) value));
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-cloudtrail-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awscloudtrailsource/CamelAwscloudtrailsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awscloudtrailsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-cloudwatch-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awscloudwatchsink/CamelAwscloudwatchsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awscloudwatchsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-ddb-experimental-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awsddbexperimentalsink/CamelAwsddbexperimentalsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awsddbexperimentalsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-ddb-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awsddbsink/CamelAwsddbsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awsddbsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-ddb-streams-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awsddbstreamssource/CamelAwsddbstreamssourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awsddbstreamssource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-ec2-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awsec2sink/CamelAwsec2sinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awsec2sink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-eventbridge-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awseventbridgesink/CamelAwseventbridgesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awseventbridgesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-kinesis-firehose-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awskinesisfirehosesink/CamelAwskinesisfirehosesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awskinesisfirehosesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-kinesis-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awskinesissink/CamelAwskinesissinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awskinesissink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-kinesis-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awskinesissource/CamelAwskinesissourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awskinesissource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-lambda-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awslambdasink/CamelAwslambdasinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awslambdasink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-redshift-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awsredshiftsink/CamelAwsredshiftsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awsredshiftsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-redshift-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awsredshiftsource/CamelAwsredshiftsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awsredshiftsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-s3-cdc-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awss3cdcsource/CamelAwss3cdcsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awss3cdcsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-s3-experimental-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awss3experimentalsource/CamelAwss3experimentalsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awss3experimentalsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-s3-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awss3sink/CamelAwss3sinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awss3sink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-s3-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awss3source/CamelAwss3sourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awss3source;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-s3-streaming-upload-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awss3streaminguploadsink/CamelAwss3streaminguploadsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awss3streaminguploadsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-secrets-manager-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awssecretsmanagersink/CamelAwssecretsmanagersinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awssecretsmanagersink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-ses-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awssessink/CamelAwssessinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awssessink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-sns-fifo-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awssnsfifosink/CamelAwssnsfifosinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awssnsfifosink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-sns-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awssnssink/CamelAwssnssinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awssnssink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-sqs-batch-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awssqsbatchsink/CamelAwssqsbatchsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awssqsbatchsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-sqs-fifo-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awssqsfifosink/CamelAwssqsfifosinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awssqsfifosink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-sqs-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awssqssink/CamelAwssqssinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awssqssink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-aws-sqs-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/awssqssource/CamelAwssqssourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.awssqssource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-cosmosdb-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azurecosmosdbsource/CamelAzurecosmosdbsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azurecosmosdbsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-eventhubs-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azureeventhubssink/CamelAzureeventhubssinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azureeventhubssink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-eventhubs-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azureeventhubssource/CamelAzureeventhubssourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azureeventhubssource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-functions-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azurefunctionssink/CamelAzurefunctionssinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azurefunctionssink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-servicebus-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azureservicebussink/CamelAzureservicebussinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azureservicebussink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-servicebus-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azureservicebussource/CamelAzureservicebussourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azureservicebussource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-storage-blob-cdc-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azurestorageblobcdcsource/CamelAzurestorageblobcdcsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azurestorageblobcdcsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-storage-blob-changefeed-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azurestorageblobchangefeedsource/CamelAzurestorageblobchangefeedsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azurestorageblobchangefeedsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-storage-blob-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azurestorageblobsink/CamelAzurestorageblobsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azurestorageblobsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-storage-blob-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azurestorageblobsource/CamelAzurestorageblobsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azurestorageblobsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-storage-queue-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azurestoragequeuesink/CamelAzurestoragequeuesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azurestoragequeuesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-azure-storage-queue-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/azurestoragequeuesource/CamelAzurestoragequeuesourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.azurestoragequeuesource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-beer-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/beersource/CamelBeersourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.beersource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-bitcoin-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/bitcoinsource/CamelBitcoinsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.bitcoinsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-cassandra-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/cassandrasink/CamelCassandrasinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.cassandrasink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-cassandra-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/cassandrasource/CamelCassandrasourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.cassandrasource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-ceph-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/cephsink/CamelCephsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.cephsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-ceph-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/cephsource/CamelCephsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.cephsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-chuck-norris-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/chucknorrissource/CamelChucknorrissourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.chucknorrissource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-couchbase-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/couchbasesink/CamelCouchbasesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.couchbasesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-cron-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/cronsource/CamelCronsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.cronsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-dropbox-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/dropboxsink/CamelDropboxsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.dropboxsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-dropbox-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/dropboxsource/CamelDropboxsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.dropboxsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-earthquake-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/earthquakesource/CamelEarthquakesourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.earthquakesource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-elasticsearch-index-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/elasticsearchindexsink/CamelElasticsearchindexsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.elasticsearchindexsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-elasticsearch-search-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/elasticsearchsearchsource/CamelElasticsearchsearchsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.elasticsearchsearchsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-exec-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/execsink/CamelExecsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.execsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-fhir-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/fhirsink/CamelFhirsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.fhirsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-fhir-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/fhirsource/CamelFhirsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.fhirsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-file-watch-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/filewatchsource/CamelFilewatchsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.filewatchsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-ftp-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/ftpsink/CamelFtpsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.ftpsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-ftp-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/ftpsource/CamelFtpsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.ftpsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-ftps-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/ftpssink/CamelFtpssinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.ftpssink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-ftps-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/ftpssource/CamelFtpssourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.ftpssource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-github-commit-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/githubcommitsource/CamelGithubcommitsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.githubcommitsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-github-event-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/githubeventsource/CamelGithubeventsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.githubeventsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-github-pullrequest-comment-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/githubpullrequestcommentsource/CamelGithubpullrequestcommentsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.githubpullrequestcommentsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-github-pullrequest-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/githubpullrequestsource/CamelGithubpullrequestsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.githubpullrequestsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-github-tag-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/githubtagsource/CamelGithubtagsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.githubtagsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-bigquery-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlebigquerysink/CamelGooglebigquerysinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlebigquerysink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-calendar-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlecalendarsource/CamelGooglecalendarsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlecalendarsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-functions-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlefunctionssink/CamelGooglefunctionssinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlefunctionssink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-mail-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlemailsource/CamelGooglemailsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlemailsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-pubsub-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlepubsubsink/CamelGooglepubsubsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlepubsubsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-pubsub-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlepubsubsource/CamelGooglepubsubsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlepubsubsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-sheets-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlesheetssource/CamelGooglesheetssourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlesheetssource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-storage-cdc-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlestoragecdcsource/CamelGooglestoragecdcsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlestoragecdcsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-storage-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlestoragesink/CamelGooglestoragesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlestoragesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-google-storage-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/googlestoragesource/CamelGooglestoragesourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.googlestoragesource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-http-secured-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/httpsecuredsink/CamelHttpsecuredsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.httpsecuredsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-http-secured-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/httpsecuredsource/CamelHttpsecuredsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.httpsecuredsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-http-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/httpsink/CamelHttpsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.httpsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-http-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/httpsource/CamelHttpsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.httpsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-infinispan-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/infinispansink/CamelInfinispansinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.infinispansink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-infinispan-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/infinispansource/CamelInfinispansourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.infinispansource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jira-add-comment-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jiraaddcommentsink/CamelJiraaddcommentsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jiraaddcommentsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jira-add-issue-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jiraaddissuesink/CamelJiraaddissuesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jiraaddissuesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jira-oauth-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jiraoauthsource/CamelJiraoauthsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jiraoauthsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jira-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jirasource/CamelJirasourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jirasource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jira-transition-issue-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jiratransitionissuesink/CamelJiratransitionissuesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jiratransitionissuesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jira-update-issue-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jiraupdateissuesink/CamelJiraupdateissuesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jiraupdateissuesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jms-amqp-10-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jmsamqp10sink/CamelJmsamqp10sinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jmsamqp10sink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jms-amqp-10-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jmsamqp10source/CamelJmsamqp10sourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jmsamqp10source;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jms-apache-activemq-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jmsapacheactivemqsink/CamelJmsapacheactivemqsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jmsapacheactivemqsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jms-apache-activemq-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jmsapacheactivemqsource/CamelJmsapacheactivemqsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jmsapacheactivemqsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jms-apache-artemis-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jmsapacheartemissink/CamelJmsapacheartemissinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jmsapacheartemissink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jms-apache-artemis-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jmsapacheartemissource/CamelJmsapacheartemissourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jmsapacheartemissource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jms-ibm-mq-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jmsibmmqsink/CamelJmsibmmqsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jmsibmmqsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-jms-ibm-mq-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/jmsibmmqsource/CamelJmsibmmqsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.jmsibmmqsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-kafka-not-secured-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/kafkanotsecuredsink/CamelKafkanotsecuredsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.kafkanotsecuredsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-kafka-not-secured-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/kafkanotsecuredsource/CamelKafkanotsecuredsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.kafkanotsecuredsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-kafka-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/kafkasink/CamelKafkasinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.kafkasink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-kafka-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/kafkasource/CamelKafkasourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.kafkasource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-kafka-ssl-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/kafkasslsink/CamelKafkasslsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.kafkasslsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-kafka-ssl-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/kafkasslsource/CamelKafkasslsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.kafkasslsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-kubernetes-namespaces-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/kubernetesnamespacessource/CamelKubernetesnamespacessourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.kubernetesnamespacessource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-kubernetes-nodes-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/kubernetesnodessource/CamelKubernetesnodessourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.kubernetesnodessource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-kubernetes-pods-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/kubernetespodssource/CamelKubernetespodssourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.kubernetespodssource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-log-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/logsink/CamelLogsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.logsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mail-imap-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mailimapsource/CamelMailimapsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mailimapsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mail-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mailsink/CamelMailsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mailsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mariadb-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mariadbsink/CamelMariadbsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mariadbsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mariadb-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mariadbsource/CamelMariadbsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mariadbsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-minio-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/miniosink/CamelMiniosinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.miniosink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-minio-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/miniosource/CamelMiniosourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.miniosource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mongodb-changes-stream-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mongodbchangesstreamsource/CamelMongodbchangesstreamsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mongodbchangesstreamsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mongodb-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mongodbsink/CamelMongodbsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mongodbsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mongodb-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mongodbsource/CamelMongodbsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mongodbsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mqtt-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mqttsink/CamelMqttsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mqttsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mqtt-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mqttsource/CamelMqttsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mqttsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mqtt5-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mqtt5sink/CamelMqtt5sinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mqtt5sink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mqtt5-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mqtt5source/CamelMqtt5sourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mqtt5source;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mysql-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mysqlsink/CamelMysqlsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mysqlsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-mysql-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/mysqlsource/CamelMysqlsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.mysqlsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-nats-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/natssink/CamelNatssinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.natssink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-nats-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/natssource/CamelNatssourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.natssource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-oracle-database-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/oracledatabasesink/CamelOracledatabasesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.oracledatabasesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-oracle-database-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/oracledatabasesource/CamelOracledatabasesourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.oracledatabasesource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-postgresql-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/postgresqlsink/CamelPostgresqlsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.postgresqlsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-postgresql-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/postgresqlsource/CamelPostgresqlsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.postgresqlsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-pulsar-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/pulsarsink/CamelPulsarsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.pulsarsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-pulsar-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/pulsarsource/CamelPulsarsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.pulsarsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-rabbitmq-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/rabbitmqsource/CamelRabbitmqsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.rabbitmqsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-redis-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/redissink/CamelRedissinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.redissink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-redis-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/redissource/CamelRedissourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.redissource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-rest-openapi-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/restopenapisink/CamelRestopenapisinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.restopenapisink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-salesforce-create-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/salesforcecreatesink/CamelSalesforcecreatesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.salesforcecreatesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-salesforce-delete-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/salesforcedeletesink/CamelSalesforcedeletesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.salesforcedeletesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-salesforce-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/salesforcesource/CamelSalesforcesourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.salesforcesource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-salesforce-update-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/salesforceupdatesink/CamelSalesforceupdatesinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.salesforceupdatesink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-scp-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/scpsink/CamelScpsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.scpsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-sftp-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/sftpsink/CamelSftpsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.sftpsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-sftp-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/sftpsource/CamelSftpsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.sftpsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-slack-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/slacksink/CamelSlacksinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.slacksink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-slack-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/slacksource/CamelSlacksourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.slacksource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-solr-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/solrsink/CamelSolrsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.solrsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-solr-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/solrsource/CamelSolrsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.solrsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-splunk-hec-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/splunkhecsink/CamelSplunkhecsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.splunkhecsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-splunk-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/splunksink/CamelSplunksinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.splunksink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-splunk-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/splunksource/CamelSplunksourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.splunksource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-sqlserver-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/sqlserversink/CamelSqlserversinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.sqlserversink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-sqlserver-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/sqlserversource/CamelSqlserversourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.sqlserversource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-ssh-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/sshsink/CamelSshsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.sshsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-ssh-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/sshsource/CamelSshsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.sshsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.Exchange;`
in `connectors/camel-syslog-kafka-connector/src/generated/java/org/apache/camel/kafkaconnector/syslog/converters/CamelStreamCacheConverterLoader.java`
#### Snippet
```java
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.TypeConversionException;`
in `connectors/camel-syslog-kafka-connector/src/generated/java/org/apache/camel/kafkaconnector/syslog/converters/CamelStreamCacheConverterLoader.java`
#### Snippet
```java
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.support.TypeConverterSupport;`
in `connectors/camel-syslog-kafka-connector/src/generated/java/org/apache/camel/kafkaconnector/syslog/converters/CamelStreamCacheConverterLoader.java`
#### Snippet
```java
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.DoubleMap;`
in `connectors/camel-syslog-kafka-connector/src/generated/java/org/apache/camel/kafkaconnector/syslog/converters/CamelStreamCacheConverterLoader.java`
#### Snippet
```java
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.kafkaconnector.CamelSourceConnector;`
in `connectors/camel-syslog-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/syslog/CamelSyslogSourceConnector.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.syslog;

import org.apache.camel.kafkaconnector.CamelSourceConnector;
import org.apache.camel.kafkaconnector.netty.CamelNettySourceConnector;
import org.apache.kafka.common.config.ConfigDef;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-telegram-sink-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/telegramsink/CamelTelegramsinkSinkTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.telegramsink;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-telegram-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/telegramsource/CamelTelegramsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.telegramsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-timer-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/timersource/CamelTimersourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.timersource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-twitter-directmessage-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/twitterdirectmessagesource/CamelTwitterdirectmessagesourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.twitterdirectmessagesource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-twitter-search-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/twittersearchsource/CamelTwittersearchsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.twittersearchsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-twitter-timeline-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/twittertimelinesource/CamelTwittertimelinesourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.twittertimelinesource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-webhook-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/webhooksource/CamelWebhooksourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.webhooksource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-websocket-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/websocketsource/CamelWebsocketsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.websocketsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `connectors/camel-wttrin-source-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/wttrinsource/CamelWttrinsourceSourceTask.java`
#### Snippet
```java
package org.apache.camel.kafkaconnector.wttrinsource;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`docLiteralInitializer = docLiteralInitializer + " One of:"` could be simplified to 'docLiteralInitializer += " One of:"'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        String docLiteralInitializer = baseOptionModel.getDescription();
        if (baseOptionModel.getEnums() != null && !baseOptionModel.getEnums().isEmpty()) {
            docLiteralInitializer = docLiteralInitializer + " One of:";
            String enumOptionListing = baseOptionModel.getEnums().stream().reduce("", (s, s2) -> s + " [" + s2 + "]");
            docLiteralInitializer = docLiteralInitializer + enumOptionListing;
```

### ReplaceAssignmentWithOperatorAssignment
`docLiteralInitializer = docLiteralInitializer + enumOptionListing` could be simplified to 'docLiteralInitializer += enumOptionListing'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
            docLiteralInitializer = docLiteralInitializer + " One of:";
            String enumOptionListing = baseOptionModel.getEnums().stream().reduce("", (s, s2) -> s + " [" + s2 + "]");
            docLiteralInitializer = docLiteralInitializer + enumOptionListing;
        }
        javaClass.addField().setFinal(true).setPublic().setStatic(true).setName(docFieldName).setType(String.class).setStringInitializer(docLiteralInitializer);
```

### ReplaceAssignmentWithOperatorAssignment
`defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "L"` could be simplified to 'defaultValueClassLiteralInitializer += "L"'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

                if (defaultValueClass.equals(Long.class) && !defaultValueClassLiteralInitializer.endsWith("L")) {
                    defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "L";
                }
            }
```

### ReplaceAssignmentWithOperatorAssignment
`defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "F"` could be simplified to 'defaultValueClassLiteralInitializer += "F"'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

            if (defaultValueClass.equals(Float.class)) {
                defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "F";
            }

```

### ReplaceAssignmentWithOperatorAssignment
`defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "D"` could be simplified to 'defaultValueClassLiteralInitializer += "D"'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

            if (defaultValueClass.equals(Double.class)) {
                defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "D";
            }
        }
```

### ReplaceAssignmentWithOperatorAssignment
`defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "L"` could be simplified to 'defaultValueClassLiteralInitializer += "L"'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

                if (defaultValueClass.equals(Long.class) && !defaultValueClassLiteralInitializer.endsWith("L")) {
                    defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "L";
                }
            }
```

### ReplaceAssignmentWithOperatorAssignment
`defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "F"` could be simplified to 'defaultValueClassLiteralInitializer += "F"'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

            if (defaultValueClass.equals(Float.class)) {
                defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "F";
            }

```

### ReplaceAssignmentWithOperatorAssignment
`defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "D"` could be simplified to 'defaultValueClassLiteralInitializer += "D"'
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

            if (defaultValueClass.equals(Double.class)) {
                defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "D";
            }
        }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `connectors/camel-file-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/file/transformers/FileTransforms.java`
#### Snippet
```java
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `tooling/camel-kafka-connector-catalog-descriptor-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/catalog/descriptor/CollectConnectorDescriptorMojo.java`
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
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
                    return new URL(name);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return null;
                }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `tooling/camel-kafka-connector-catalog-descriptor-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/catalog/descriptor/CollectConnectorDescriptorMojo.java`
#### Snippet
```java
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileToRead), StandardCharsets.UTF_8))) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `loggingImpl` are queried, but never updated
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
    private void fixExcludedDependencies(Document pom) throws Exception {
        // add dependencies to be excluded form camel component dependency
        Set<String> loggingImpl = new HashSet<>();

        // excluded dependencies
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `freeSlots` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
    private Exchange[] exchangesWaitingForAck;
    //the assumption is that at most 1 thread is running poll() method and at most 1 thread is running commitRecord()
    private SpscArrayQueue<Integer> freeSlots;
    private boolean mapProperties;
    private boolean mapHeaders;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `exchangesWaitingForAck` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
    private String camelMessageHeaderKey;
    private LoggingLevel loggingLevel = LoggingLevel.OFF;
    private Exchange[] exchangesWaitingForAck;
    //the assumption is that at most 1 thread is running poll() method and at most 1 thread is running commitRecord()
    private SpscArrayQueue<Integer> freeSlots;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `topics` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
    private CamelKafkaConnectMain cms;
    private PollingConsumer consumer;
    private String[] topics;
    private Long maxBatchPollSize;
    private Long maxPollDuration;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mapProperties` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
    //the assumption is that at most 1 thread is running poll() method and at most 1 thread is running commitRecord()
    private SpscArrayQueue<Integer> freeSlots;
    private boolean mapProperties;
    private boolean mapHeaders;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mapHeaders` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
    private SpscArrayQueue<Integer> freeSlots;
    private boolean mapProperties;
    private boolean mapHeaders;


```

### FieldAccessedSynchronizedAndUnsynchronized
Field `loggingLevel` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
    private Integer maxNotCommittedRecords;
    private String camelMessageHeaderKey;
    private LoggingLevel loggingLevel = LoggingLevel.OFF;
    private Exchange[] exchangesWaitingForAck;
    //the assumption is that at most 1 thread is running poll() method and at most 1 thread is running commitRecord()
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxBatchPollSize` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
    private PollingConsumer consumer;
    private String[] topics;
    private Long maxBatchPollSize;
    private Long maxPollDuration;
    private Integer maxNotCommittedRecords;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `consumer` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java

    private CamelKafkaConnectMain cms;
    private PollingConsumer consumer;
    private String[] topics;
    private Long maxBatchPollSize;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `camelMessageHeaderKey` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
    private Long maxPollDuration;
    private Integer maxNotCommittedRecords;
    private String camelMessageHeaderKey;
    private LoggingLevel loggingLevel = LoggingLevel.OFF;
    private Exchange[] exchangesWaitingForAck;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxPollDuration` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
    private String[] topics;
    private Long maxBatchPollSize;
    private Long maxPollDuration;
    private Integer maxNotCommittedRecords;
    private String camelMessageHeaderKey;
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
        switch (ct) {
            case SINK:
                filterEndpointOptions = new Predicate<BaseOptionModel>() {
                    @Override
                    public boolean test(BaseOptionModel optionModel) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
                break;
            case SOURCE:
                filterEndpointOptions = new Predicate<BaseOptionModel>() {
                    @Override
                    public boolean test(BaseOptionModel optionModel) {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/SourcePojoToSchemaAndStructTransform.java`
#### Snippet
```java
        if (r.value() != null) {
            String recordClassCanonicalName = r.value().getClass().getName();
            CacheEntry cacheEntry = avroSchemaWrapperCache.computeIfAbsent(recordClassCanonicalName, new Function<String, CacheEntry>() {
                @Override
                public CacheEntry apply(String s) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `changed`
in `tooling/camel-kafka-connector-docs-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/docs/UpdateDocComponentsListMojo.java`
#### Snippet
```java
            if (!file.exists()) {
                // include markers for new files
                changed = "// kafka-connectors list: START\n" + changed + "\n// kafka-connectors list: END\n";
                writeText(file, changed);
                return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `changed`
in `tooling/camel-kafka-connector-docs-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/docs/UpdateDocComponentsListMojo.java`
#### Snippet
```java
                // remove leading line breaks etc
                existing = existing.trim();
                changed = changed.trim();
                if (existing.equals(changed)) {
                    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
    public static void writeFileIfChanged(String newContent, File file, Log log) throws IOException {
        boolean write = true;
        file = file.getCanonicalFile();
        if (file.exists()) {
            try (FileReader fr = new FileReader(file)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `changed`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
                // remove leading line breaks etc
                existing = existing.trim();
                changed = changed.trim();
                if (existing.equals(changed)) {
                    getLog().debug("No change to the file " + file.getName());
```

### AssignmentToMethodParameter
Assignment to method parameter `changed`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
            if (!file.exists()) {
                // include markers for new files
                changed = "// kafka-connector options: START\n" + changed + "\n// kafka-connector options: END\n";
                writeText(file, changed);
                return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `changed`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
                // remove leading line breaks etc
                existing = existing.trim();
                changed = changed.trim();
                if (existing.equals(changed)) {
                    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `changed`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
            if (!file.exists()) {
                // include markers for new files
                changed = "// kafka-connector options: START\n" + changed + "\n// kafka-connector options: END\n";
                writeText(file, changed);
                return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `changed`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
                // remove leading line breaks etc
                existing = existing.trim();
                changed = changed.trim();
                if (existing.equals(changed)) {
                    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `changed`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
                // remove leading line breaks etc
                existing = existing.trim();
                changed = changed.trim();
                if (existing.equals(changed)) {
                    getLog().debug("No change to the file " + file.getName());
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-21-23-43-08.608.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `camel-kafka-connector-catalog/src/main/java/org/apache/camel/kafkaconnector/catalog/CamelKafkaConnectorCatalog.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java

    public static String sanitizeMavenArtifactId(String toBesanitizedArtifactId) {
        return toBesanitizedArtifactId != null ? toBesanitizedArtifactId.toLowerCase().replaceAll("[^A-Za-z0-9]", "-") : null;
    }
}
```

### ReturnNull
Return of `null`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
            getLog().error("Cannot create package.xml file from Template: " + packageTemplate + " with properties: " + props, e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
            getLog().error("Cannot create package.xml file from Template: " + packageTemplate + " with properties: " + props, e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/AbstractCamelKafkaConnectorMojo.java`
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
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceTask.java`
#### Snippet
```java
        }

        return records.isEmpty() ? null : records;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java

        public Object getFieldValue(String fieldName) {
            return map == null ? null : map.get(fieldName);
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/FieldsToHeadersTransform.java`
#### Snippet
```java

        public Schema getFieldSchema(String fieldName) {
            return null;
        }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `out` is redundant
in `tooling/camel-kafka-connector-docs-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/docs/UpdateDocComponentsListMojo.java`
#### Snippet
```java
            String template = null;
            template = loadText(UpdateDocComponentsListMojo.class.getClassLoader().getResourceAsStream("connectors.mvel"));
            String out = (String)TemplateRuntime.eval(template, model, Collections.singletonMap("util", MvelHelper.INSTANCE));
            return out;
        } catch (Exception e) {
```

### UnnecessaryLocalVariable
Local variable `template` is redundant
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/utils/MavenUtils.java`
#### Snippet
```java
        cfg.setDefaultEncoding("UTF-8");
        cfg.setLocalizedLookup(false);
        Template template = cfg.getTemplate(templateFile.toURI().toURL().toExternalForm());
        return template;
    }
```

### UnnecessaryLocalVariable
Local variable `text` is redundant
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java
            }

            String text = loadText(new FileInputStream(file));

            String existing = text;
```

### UnnecessaryLocalVariable
Local variable `text` is redundant
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
            }

            String text = loadText(new FileInputStream(file));

            String existing = text;
```

### UnnecessaryLocalVariable
Local variable `gavDeps` is redundant
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java
    private Set<String> getKameletDependencies(KameletModel kamelet) throws XPathExpressionException {
        Set<String> deps = new HashSet<>(kamelet.getDependencies());
        Set<String> gavDeps = deps.stream().map(stringDep -> {
            if (stringDep.startsWith("mvn:")) {
                return stringDep.replaceFirst("mvn:", "");
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `core/src/main/java/org/apache/camel/kafkaconnector/utils/CamelKafkaConnectMain.java`
#### Snippet
```java
    public ProducerTemplate getProducerTemplate() {
        if (this.producerTemplate == null) {
            synchronized (this) {
                if (this.producerTemplate == null) {
                    this.producerTemplate = getCamelContext().createProducerTemplate();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `core/src/main/java/org/apache/camel/kafkaconnector/utils/CamelKafkaConnectMain.java`
#### Snippet
```java
    public ConsumerTemplate getConsumerTemplate() {
        if (this.consumerTemplate == null) {
            synchronized (this) {
                if (this.consumerTemplate == null) {
                    this.consumerTemplate = getCamelContext().createConsumerTemplate();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `line` initializer `null` is redundant
in `tooling/camel-kafka-connector-catalog-descriptor-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/catalog/descriptor/CollectConnectorDescriptorMojo.java`
#### Snippet
```java
        if (fileToRead.exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileToRead), StandardCharsets.UTF_8))) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
```

### UnusedAssignment
Variable `changed` initializer `null` is redundant
in `tooling/camel-kafka-connector-docs-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/docs/UpdateDocComponentsListMojo.java`
#### Snippet
```java

    private boolean updateNav(File file, CamelKafkaConnectorTableModel model) throws MojoExecutionException {
        String changed = null;
        try {
            String template = loadText(UpdateDocComponentsListMojo.class.getClassLoader().getResourceAsStream("nav.mvel"));
```

### UnusedAssignment
Variable `template` initializer `null` is redundant
in `tooling/camel-kafka-connector-docs-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/docs/UpdateDocComponentsListMojo.java`
#### Snippet
```java

        try {
            String template = null;
            template = loadText(UpdateDocComponentsListMojo.class.getClassLoader().getResourceAsStream("connectors.mvel"));
            String out = (String)TemplateRuntime.eval(template, model, Collections.singletonMap("util", MvelHelper.INSTANCE));
```

### UnusedAssignment
Variable `connectSchemaAndData` initializer `null` is redundant
in `core/src/main/java/org/apache/camel/kafkaconnector/transforms/SourcePojoToSchemaAndStructTransform.java`
#### Snippet
```java
            });

            SchemaAndValue connectSchemaAndData = null;
            try {
                byte[] avroDataByte = cacheEntry.getObjectWriter().writeValueAsBytes(r.value());
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `excludedComponents == null` is always `false`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/GenerateCamelKafkaConnectorsMojo.java`
#### Snippet
```java
        camelComponentsUsedInKamelets.addAll(excludedComponents);
        excludedComponents = camelComponentsUsedInKamelets.stream().collect(Collectors.toList());
        if (excludedComponents == null || excludedComponents.isEmpty()) {
            filteredComponents = components;
        } else {
```

### ConstantValue
Condition `existing != null` is always `true`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorUpdateMojo.java`
#### Snippet
```java

            String existing = text;
            if (existing != null) {
                // remove leading line breaks etc
                existing = existing.trim();
```

### ConstantValue
Condition `existing != null` is always `true`
in `tooling/camel-kafka-connector-generator-maven-plugin/src/main/java/org/apache/camel/kafkaconnector/maven/CamelKafkaConnectorKameletUpdateMojo.java`
#### Snippet
```java

            String existing = text;
            if (existing != null) {
                // remove leading line breaks etc
                existing = existing.trim();
```

### ConstantValue
Value `CAMEL_SOURCE_POLLING_CONSUMER_BLOCK_WHEN_FULL_DEFAULT` is always 'true'
in `core/src/main/java/org/apache/camel/kafkaconnector/CamelSourceConnectorConfig.java`
#### Snippet
```java
        .define(CAMEL_SOURCE_POLLING_CONSUMER_QUEUE_SIZE_CONF, Type.LONG, CAMEL_SOURCE_POLLING_CONSUMER_QUEUE_SIZE_DEFAULT, Importance.MEDIUM, CAMEL_SOURCE_POLLING_CONSUMER_QUEUE_SIZE_DOC)
        .define(CAMEL_SOURCE_POLLING_CONSUMER_BLOCK_TIMEOUT_CONF, Type.LONG, CAMEL_SOURCE_POLLING_CONSUMER_BLOCK_TIMEOUT_DEFAULT, Importance.MEDIUM, CAMEL_SOURCE_POLLING_CONSUMER_BLOCK_TIMEOUT_DOC)
        .define(CAMEL_SOURCE_POLLING_CONSUMER_BLOCK_WHEN_FULL_CONF, Type.BOOLEAN, CAMEL_SOURCE_POLLING_CONSUMER_BLOCK_WHEN_FULL_DEFAULT, Importance.MEDIUM, CAMEL_SOURCE_POLLING_CONSUMER_BLOCK_WHEN_FULL_DOC)
        .define(CAMEL_SOURCE_MESSAGE_HEADER_KEY_CONF, Type.STRING, CAMEL_SOURCE_MESSAGE_HEADER_KEY_DEFAULT, Importance.MEDIUM, CAMEL_SOURCE_MESSAGE_HEADER_KEY_DOC)
        .define(CAMEL_SOURCE_COMPONENT_CONF, Type.STRING, CAMEL_SOURCE_COMPONENT_DEFAULT, Importance.MEDIUM, CAMEL_SOURCE_COMPONENT_DOC)
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `conf()` tries to override a static method of a superclass
in `connectors/camel-syslog-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/syslog/CamelSyslogSinkConnectorConfig.java`
#### Snippet
```java
    }

    public static ConfigDef conf() {
        return CamelNettySinkConnectorConfig.conf();
    }
```

### MethodOverridesStaticMethod
Method `conf()` tries to override a static method of a superclass
in `connectors/camel-syslog-kafka-connector/src/main/java/org/apache/camel/kafkaconnector/syslog/CamelSyslogSourceConnectorConfig.java`
#### Snippet
```java
    }

    public static ConfigDef conf() {
        return CamelNettySourceConnectorConfig.conf();
    }
```

