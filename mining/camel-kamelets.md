# camel-kamelets 
 
# Bad smells
I found 52 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 8 | false |
| UnnecessaryLocalVariable | 6 | true |
| RedundantFieldInitialization | 5 | false |
| RegExpDuplicateCharacterInClass | 4 | false |
| SimplifyStreamApiCallChains | 4 | false |
| SystemOutErr | 3 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| DataFlowIssue | 2 | false |
| UNUSED_IMPORT | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| UnnecessaryModifier | 1 | true |
| GroovyUnusedAssignment | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| BoundedWildcard | 1 | false |
| UnusedAssignment | 1 | false |
| StringEqualsEmptyString | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| UnnecessaryBoxing | 1 | false |
## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
                builder.append(dep + System.lineSeparator());
            }
            System.out.println(entry.getKey());
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println(builder.toString());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
            }
            System.out.println(entry.getKey());
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println(builder.toString());
            builder.append(System.lineSeparator());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
            System.out.println(entry.getKey());
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println(builder.toString());
            builder.append(System.lineSeparator());
        }
```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/serialization/InflightAvroSchemaResolver.java`
#### Snippet
```java
    public FormatSchema resolve(Exchange exchange) {
        String schemaJson = (String) exchange.getProperty("schema");
        Boolean validate = Boolean.valueOf((String) exchange.getProperty("validate"));
        Schema raw = new Schema.Parser().setValidate(validate).parse(schemaJson);
        AvroSchema schema = new AvroSchema(raw);
```

## RuleId[ruleID=UnnecessaryModifier]
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

## RuleId[ruleID=RegExpDuplicateCharacterInClass]
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

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/TimestampRouter.java`
#### Snippet
```java
            String updatedTopic;

            if (ObjectHelper.isNotEmpty(topicName)) {
                replace1 = TOPIC.matcher(topicFormat).replaceAll(Matcher.quoteReplacement(topicName));
                updatedTopic = TIMESTAMP.matcher(replace1).replaceAll(Matcher.quoteReplacement(formattedTimestamp));
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/MessageTimestampRouter.java`
#### Snippet
```java
            String updatedTopic;

            if (ObjectHelper.isNotEmpty(topicName)) {
                replace1 = TOPIC.matcher(topicFormat).replaceAll(Matcher.quoteReplacement(topicName));
                updatedTopic = TIMESTAMP.matcher(replace1).replaceAll(Matcher.quoteReplacement(formattedTimestamp));
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.kamelets.utils.format.spi.annotations` is unnecessary and can be removed
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DefaultDataTypeRegistry.java`
#### Snippet
```java
/**
 * Default data type registry able to resolve data types converters in the project. Data types may be defined at the component level
 * via {@link org.apache.camel.kamelets.utils.format.spi.annotations.DataType} annotations. Also, users can add data types directly
 * to the Camel context or manually to the registry.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/mongodb/SslAwareMongoClient.java`
#### Snippet
```java
                            }
                            try {
                                sc.init(null, trustAllCerts, new java.security.SecureRandom());
                            } catch (KeyManagementException e) {
                                throw new RuntimeException("Error instantiating trust all SSL context.", e);
```

## RuleId[ruleID=DataFlowIssue]
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

## RuleId[ruleID=UNUSED_IMPORT]
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

## RuleId[ruleID=SimplifyStreamApiCallChains]
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
                .filter(x -> x.getValue().getMetadata().getAnnotations().get(KameletAnnotationsNames.KAMELET_ANNOTATION_GROUP).contains(group))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return collect;
```

## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `script/version/UpdateDepsVersionKamelets.groovy`
#### Snippet
```java
            }
            Files.copy(Paths.get(kameletFile + ".bak"), Paths.get(directoryName + kameletFile), StandardCopyOption.REPLACE_EXISTING)
            boolean deleted = new File(kameletFile + ".bak").delete()
        }
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/DataTypeProcessor.java`
#### Snippet
```java
    private String format;

    private boolean ignoreMissingDataType = false;

    private DataTypeConverter converter;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/serialization/kafka/KafkaHeaderDeserializer.java`
#### Snippet
```java
public class KafkaHeaderDeserializer implements Processor {

    boolean enabled = false;

    private final SimpleTypeConverter defaultTypeConverter = new SimpleTypeConverter(true, KafkaHeaderDeserializer::convert);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/mongodb/SslAwareMongoClient.java`
#### Snippet
```java
        }
    });
    private String hosts = null;
    private String username = null;
    private String password = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/mongodb/SslAwareMongoClient.java`
#### Snippet
```java
    });
    private String hosts = null;
    private String username = null;
    private String password = null;
    private boolean ssl = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/mongodb/SslAwareMongoClient.java`
#### Snippet
```java
    private String hosts = null;
    private String username = null;
    private String password = null;
    private boolean ssl = true;

```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
        int index = fileName.lastIndexOf(KAMELETS_FILE_SUFFIX);
        if (index > 0) {
            fileName = fileName.substring(0, index);
        }
        return fileName.substring(9);
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
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

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-19-11-28-32.303.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
            return kamelet.getSpec().getTemplate();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
            return kamelet.getSpec().getDependencies();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
            return kamelet.getSpec().getDefinition();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
            return kamelet.getSpec().getDefinition().getRequired();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `library/camel-kamelets-catalog/src/main/java/org/apache/camel/kamelets/catalog/KameletsCatalog.java`
#### Snippet
```java
            if (c.name.equals(prefix)) return c.scheme;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/MaskField.java`
#### Snippet
```java
    private Object masked(Object value, String replacement) {
        if (value == null) {
            return null;
        }
        return replacement == null ? maskWithNullValue(value) : maskWithCustomReplacement(value, replacement);
```

### ReturnNull
Return of `null`
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/serialization/kafka/KafkaHeaderDeserializer.java`
#### Snippet
```java
    private static Object convert(Class<?> type, Exchange exchange, Object value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/mongodb/SslAwareMongoClient.java`
#### Snippet
```java
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/AnnotationDataTypeLoader.java`
#### Snippet
```java
                        }
                        line = line.trim();
                        if (line.startsWith("#") || line.length() == 0) {
                            continue;
                        }
```

## RuleId[ruleID=UnnecessaryLocalVariable]
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

    public List<Kamelet> getKameletsByGroups(String group) {
        List<Kamelet> collect = kameletModels.entrySet().stream()
                .filter(x -> x.getValue().getMetadata().getAnnotations().get(KameletAnnotationsNames.KAMELET_ANNOTATION_GROUP).contains(group))
                .map(Map.Entry::getValue)
```

### UnnecessaryLocalVariable
Local variable `schema` is redundant
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/serialization/InflightProtobufSchemaResolver.java`
#### Snippet
```java
        String schemaStr = (String) exchange.getProperty("schema");
        try {
            ProtobufSchema schema = ProtobufSchemaLoader.std.parse(schemaStr);
            return schema;
        } catch(IOException e) {
```

### UnnecessaryLocalVariable
Local variable `schema` is redundant
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/serialization/InflightAvroSchemaResolver.java`
#### Snippet
```java
        Boolean validate = Boolean.valueOf((String) exchange.getProperty("validate"));
        Schema raw = new Schema.Parser().setValidate(validate).parse(schemaJson);
        AvroSchema schema = new AvroSchema(raw);
        return schema;
    }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/AnnotationDataTypeLoader.java`
#### Snippet
```java
            LOG.trace("Found data type packages to scan: {}", String.join(", ", packages));
        }
        Set<Class<?>> scannedClasses = resolver.findAnnotated(DataType.class, packages.toArray(new String[]{}));
        if (!scannedClasses.isEmpty()) {
            LOG.debug("Found {} packages with {} @DataType classes to load", packages.size(), scannedClasses.size());
```

## RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/format/AnnotationDataTypeLoader.java`
#### Snippet
```java
    }

    protected void findPackages(Set<String> packages, ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources(META_INF_SERVICES);
        while (resources.hasMoreElements()) {
```

## RuleId[ruleID=UnusedAssignment]
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

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/mongodb/SslAwareMongoClient.java`
#### Snippet
```java
            String credentials = username == null ? "" : username;

            if (!credentials.equals("")) {
                credentials += password == null ? "@" : ":" + password + "@";
            }
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
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

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `library/camel-kamelets-utils/src/main/java/org/apache/camel/kamelets/utils/transform/MessageTimestampRouter.java`
#### Snippet
```java
            timestamp = timestampKeyFmt.parse((String) rawTimestamp).getTime();
        } else {
            timestamp = Long.valueOf((String) rawTimestamp);
        }
        if (ObjectHelper.isNotEmpty(timestamp)) {
```

