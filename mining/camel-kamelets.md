# camel-kamelets 
 
# Bad smells
I found 43 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 8 | false |
| SimplifyStreamApiCallChains | 5 | false |
| RegExpDuplicateCharacterInClass | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| DataFlowIssue | 3 | false |
| DuplicatedCode | 3 | false |
| UNCHECKED_WARNING | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| UNUSED_IMPORT | 2 | false |
| FieldMayBeFinal | 2 | false |
| UnnecessaryModifier | 1 | true |
| DuplicateBranchesInSwitch | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| UnusedAssignment | 1 | false |
| FieldCanBeLocal | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/model/KameletPrefixSchemeEnum.java`
#### Snippet
```java
    public final String scheme;

    private KameletPrefixSchemeEnum(String name, String scheme) {
        this.name = name;
        this.scheme = scheme;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `library/kamelets-maven-plugin/src/main/java/org/apache/camel/kamelets/maven/plugin/ValidateKameletsMojo.java`
#### Snippet
```java
                names) {
            Map<String, Object> kd = catalog.getKameletTemplate(name);
            Map<String,Object> f = (Map) kd.get("from");
            Map<String,Object> p = (Map) f.get("parameters");
            List<String> deps = catalog.getKameletDependencies(name).stream()
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `library/kamelets-maven-plugin/src/main/java/org/apache/camel/kamelets/maven/plugin/ValidateKameletsMojo.java`
#### Snippet
```java
            Map<String, Object> kd = catalog.getKameletTemplate(name);
            Map<String,Object> f = (Map) kd.get("from");
            Map<String,Object> p = (Map) f.get("parameters");
            List<String> deps = catalog.getKameletDependencies(name).stream()
                    .filter(Predicate.not(bannedDepsList::contains))
```

## RuleId[id=RegExpDuplicateCharacterInClass]
### RegExpDuplicateCharacterInClass
Duplicate character 't' inside character class
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/TimestampRouter.java`
#### Snippet
```java
        final Pattern TOPIC = Pattern.compile("$[topic]", Pattern.LITERAL);

        final Pattern TIMESTAMP = Pattern.compile("$[timestamp]", Pattern.LITERAL);

        final SimpleDateFormat fmt = new SimpleDateFormat(timestampFormat);
```

### RegExpDuplicateCharacterInClass
Duplicate character 'm' inside character class
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/TimestampRouter.java`
#### Snippet
```java
        final Pattern TOPIC = Pattern.compile("$[topic]", Pattern.LITERAL);

        final Pattern TIMESTAMP = Pattern.compile("$[timestamp]", Pattern.LITERAL);

        final SimpleDateFormat fmt = new SimpleDateFormat(timestampFormat);
```

### RegExpDuplicateCharacterInClass
Duplicate character 't' inside character class
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/MessageTimestampRouter.java`
#### Snippet
```java
        final Pattern TOPIC = Pattern.compile("$[topic]", Pattern.LITERAL);

        final Pattern TIMESTAMP = Pattern.compile("$[timestamp]", Pattern.LITERAL);

        final SimpleDateFormat fmt = new SimpleDateFormat(timestampFormat);
```

### RegExpDuplicateCharacterInClass
Duplicate character 'm' inside character class
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/MessageTimestampRouter.java`
#### Snippet
```java
        final Pattern TOPIC = Pattern.compile("$[topic]", Pattern.LITERAL);

        final Pattern TIMESTAMP = Pattern.compile("$[timestamp]", Pattern.LITERAL);

        final SimpleDateFormat fmt = new SimpleDateFormat(timestampFormat);
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DataTypeProcessor.java`
#### Snippet
```java
        dataTypeConverter.ifPresent(converter -> converter.convert(exchange));

        if (!dataTypeConverter.isPresent()) {
            LOG.debug("Unable to find data type for scheme {} and format name {}", scheme, format);

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DefaultDataTypeRegistry.java`
#### Snippet
```java

        Optional<DataTypeConverter> dataTypeConverter = getDataTypeConverter(scheme, name);
        if (!dataTypeConverter.isPresent()) {
            dataTypeConverter = getDataTypeConverter(DataType.DEFAULT_SCHEME, name);
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `converter instanceof CamelContextAware` is redundant and can be replaced with a null check
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DefaultDataTypeRegistry.java`
#### Snippet
```java
        // if applicable set Camel context on all loaded data type converters
        dataTypeConverters.values().forEach(converters -> converters.forEach(converter -> {
            if (converter instanceof CamelContextAware && ((CamelContextAware) converter).getCamelContext() == null) {
                CamelContextAware.trySetCamelContext(converter, camelContext);
            }
```

### DataFlowIssue
Casting `rawTimestamp` to `Long` will produce `ClassCastException` for any non-null value
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/TimestampRouter.java`
#### Snippet
```java
            timestamp = ((Instant) rawTimestamp).toEpochMilli();
        } else {
            timestamp = (Long) rawTimestamp;
        }
        if (ObjectHelper.isNotEmpty(timestamp)) {
```

### DataFlowIssue
Argument `rawTimestamp` might be null
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/MessageTimestampRouter.java`
#### Snippet
```java
            timestamp = timestampKeyFmt.parse((String) rawTimestamp).getTime();
        } else {
            timestamp = Long.valueOf((String) rawTimestamp);
        }
        if (ObjectHelper.isNotEmpty(timestamp)) {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.core.type.TypeReference;`
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/HoistField.java`
#### Snippet
```java
package org.apache.camel.kamelets.utils.transform;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/MessageTimestampRouter.java`
#### Snippet
```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `library/kamelets-maven-plugin/src/main/java/org/apache/camel/kamelets/maven/plugin/ValidateKameletsMojo.java`
#### Snippet
```java
            List<String> deps = catalog.getKameletDependencies(name).stream()
                    .filter(Predicate.not(bannedDepsList::contains))
                    .collect(Collectors.toList());
            String cleanName;
            if (!deps.isEmpty()) {
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
        List<Kamelet> collect = kameletModels.entrySet().stream()
                .filter(x -> x.getValue().getMetadata().getLabels().get(KameletLabelNames.KAMELET_LABEL_TYPE).contains(type))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return collect;
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
        List<Kamelet> collect = kameletModels.entrySet().stream()
                .filter(x -> x.getValue().getMetadata().getAnnotations().get(KameletAnnotationsNames.KAMELET_ANNOTATION_NAMESPACE).contains(namespace))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return collect;
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
        List<Kamelet> collect = kameletModels.entrySet().stream()
                .filter(x -> x.getValue().getMetadata().getAnnotations().get(KameletAnnotationsNames.KAMELET_ANNOTATION_PROVIDER).equalsIgnoreCase(provider))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        if (!collect.isEmpty()) {
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
        List<Kamelet> collect = kameletModels.entrySet().stream()
                .filter(x -> x.getValue().getMetadata().getAnnotations().get(KameletAnnotationsNames.KAMELET_ANNOTATION_GROUP).contains(group))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return collect;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/spi/DataTypeRegistry.java`
#### Snippet
```java
     *
     * @param name the data type converter name.
     * @return
     */
    default Optional<DataTypeConverter> lookup(String name) {
```

### JavadocDeclaration
`@param scheme` tag description is missing
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DefaultDataTypeRegistry.java`
#### Snippet
```java
    /**
     * Retrieve list of data types defined on the component level for given scheme.
     * @param scheme
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DefaultDataTypeRegistry.java`
#### Snippet
```java
     * Retrieve list of data types defined on the component level for given scheme.
     * @param scheme
     * @return
     */
    private List<DataTypeConverter> getComponentDataTypeConverters(String scheme) {
```

### JavadocDeclaration
`@param scheme` tag description is missing
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DefaultDataTypeRegistry.java`
#### Snippet
```java
     * Retrieve data type converter for given scheme and format name. First checks for matching bean in Camel registry then
     * tries to get from local cache or perform lazy lookup.
     * @param scheme
     * @param name
     * @return
```

### JavadocDeclaration
`@param name` tag description is missing
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DefaultDataTypeRegistry.java`
#### Snippet
```java
     * tries to get from local cache or perform lazy lookup.
     * @param scheme
     * @param name
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DefaultDataTypeRegistry.java`
#### Snippet
```java
     * @param scheme
     * @param name
     * @return
     */
    private Optional<DataTypeConverter> getDataTypeConverter(String scheme, String name) {
```

### JavadocDeclaration
`@param entry` tag description is missing
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/serialization/kafka/KafkaHeaderDeserializer.java`
#### Snippet
```java
    /**
     * Exclude special Kafka headers from auto deserialization.
     * @param entry
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/serialization/kafka/KafkaHeaderDeserializer.java`
#### Snippet
```java
     * Exclude special Kafka headers from auto deserialization.
     * @param entry
     * @return
     */
    private boolean shouldDeserialize(Map.Entry<String, Object> entry) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `type` may be 'final'
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/model/KameletTypeEnum.java`
#### Snippet
```java
    ACTION("action");

    private String type;

    KameletTypeEnum(String type) {
```

### FieldMayBeFinal
Field `failOnError` may be 'final'
in `library/kamelets-maven-plugin/src/main/java/org/apache/camel/kamelets/maven/plugin/ValidateKameletsMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "kamelets.failOnError", defaultValue = "true")
    private boolean failOnError = true;

    @Override
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/InsertField.java`
#### Snippet
```java
                break;
            case OBJECT:
                ((ObjectNode) body).put(field, value);
                break;
            default:
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `type` in enum 'KameletTypeEnum'
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/model/KameletTypeEnum.java`
#### Snippet
```java
    ACTION("action");

    private String type;

    KameletTypeEnum(String type) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/MaskField.java`
#### Snippet
```java
        ObjectMapper mapper = new ObjectMapper();
        List<String> splittedFields = new ArrayList<>();
        JsonNode jsonNodeBody = ex.getMessage().getBody(JsonNode.class);
        Map<Object, Object> body = mapper.convertValue(jsonNodeBody, new TypeReference<Map<Object, Object>>(){});
        if (ObjectHelper.isNotEmpty(fields)) {
            splittedFields = Arrays.stream(fields.split(",")).collect(Collectors.toList());
        }
```

### DuplicatedCode
Duplicated code
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/kafka/ValueToKey.java`
#### Snippet
```java
        Map<Object, Object> body = mapper.convertValue(jsonNodeBody, new TypeReference<Map<Object, Object>>(){});
        if (ObjectHelper.isNotEmpty(fields)) {
            splittedFields = Arrays.stream(fields.split(",")).collect(Collectors.toList());
        }
        Map<Object, Object> key = new HashMap<>();
```

### DuplicatedCode
Duplicated code
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/MessageTimestampRouter.java`
#### Snippet
```java
        if (ObjectHelper.isNotEmpty(timestamp)) {
            final String formattedTimestamp = fmt.format(new Date(timestamp));
            String replace1;
            String updatedTopic;

            if (ObjectHelper.isNotEmpty(topicName)) {
                replace1 = TOPIC.matcher(topicFormat).replaceAll(Matcher.quoteReplacement(topicName));
                updatedTopic = TIMESTAMP.matcher(replace1).replaceAll(Matcher.quoteReplacement(formattedTimestamp));
            } else {
                replace1 = TOPIC.matcher(topicFormat).replaceAll(Matcher.quoteReplacement(""));
                updatedTopic = TIMESTAMP.matcher(replace1).replaceAll(Matcher.quoteReplacement(formattedTimestamp));
            }
            ex.getMessage().setHeader(KafkaConstants.OVERRIDE_TOPIC, updatedTopic);
        }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `collect` is redundant
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java

    public List<Kamelet> getKameletsByType(String type) {
        List<Kamelet> collect = kameletModels.entrySet().stream()
                .filter(x -> x.getValue().getMetadata().getLabels().get(KameletLabelNames.KAMELET_LABEL_TYPE).contains(type))
                .map(Map.Entry::getValue)
```

### UnnecessaryLocalVariable
Local variable `collect` is redundant
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java

    public List<Kamelet> getKameletsByName(String name) {
        List<Kamelet> collect = kameletModels.entrySet().stream()
                .filter(x -> x.getKey().contains(name))
                .map(Map.Entry::getValue)
```

### UnnecessaryLocalVariable
Local variable `collect` is redundant
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java

    public List<Kamelet> getKameletsByNamespace(String namespace) {
        List<Kamelet> collect = kameletModels.entrySet().stream()
                .filter(x -> x.getValue().getMetadata().getAnnotations().get(KameletAnnotationsNames.KAMELET_ANNOTATION_NAMESPACE).contains(namespace))
                .map(Map.Entry::getValue)
```

### UnnecessaryLocalVariable
Local variable `collect` is redundant
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java

    public List<Kamelet> getKameletsByGroups(String group) {
        List<Kamelet> collect = kameletModels.entrySet().stream()
                .filter(x -> x.getValue().getMetadata().getAnnotations().get(KameletAnnotationsNames.KAMELET_ANNOTATION_GROUP).contains(group))
                .map(Map.Entry::getValue)
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
            System.out.println(entry.getKey());
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println(builder.toString());
            builder.append(System.lineSeparator());
        }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `sc` initializer `null` is redundant
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/mongodb/SslAwareMongoClient.java`
#### Snippet
```java
                        if (!sslValidationEnabled) {
                            builder.invalidHostNameAllowed(true);
                            SSLContext sc = null;
                            try {
                                sc = SSLContext.getInstance("SSL");
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `library/kamelets-maven-plugin/src/main/java/org/apache/camel/kamelets/maven/plugin/ValidateKameletsMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "kamelets.failOnError", defaultValue = "true")
    private boolean failOnError = true;

    @Override
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
            StringBuilder builder = new StringBuilder();
            for (String dep : entry.getValue().getSpec().getDependencies()) {
                builder.append(dep + System.lineSeparator());
            }
            System.out.println(entry.getKey());
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/converter/utils/PojoHelper.java`
#### Snippet
```java
            return false;
        }
        if (isString(type)) {
            return false;
        }
```

