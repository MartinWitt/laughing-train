# camel-k-runtime 
 
# Bad smells
I found 123 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CdiInjectionPointsInspection | 31 | false |
| BlockingMethodInNonBlockingContext | 29 | false |
| JavadocReference | 15 | false |
| UNUSED_IMPORT | 10 | false |
| DuplicateBranchesInSwitch | 9 | false |
| MismatchedCollectionQueryUpdate | 5 | false |
| ConstantValue | 5 | false |
| UNCHECKED_WARNING | 3 | false |
| AutoCloseableResource | 3 | false |
| DuplicatedCode | 2 | false |
| TrivialStringConcatenation | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| UnnecessarySemicolon | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| Deprecation | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.Set'
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    private void processLanguages(org.apache.camel.catalog.CamelCatalog catalog, Map<String, CamelArtifact> artifacts) {
        final Set<String> elements = new TreeSet<>(catalog.findLanguageNames());

        if (languagesExclusionList != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.Set'
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    private void processDataFormats(org.apache.camel.catalog.CamelCatalog catalog, Map<String, CamelArtifact> artifacts) {
        final Set<String> elements = new TreeSet<>(catalog.findDataFormatNames());

        if (dataformatsExclusionList != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.Set'
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    private void processComponents(org.apache.camel.catalog.CamelCatalog catalog, Map<String, CamelArtifact> artifacts) {
        final Set<String> elements = new TreeSet<>(catalog.findComponentNames());

        if (componentsExclusionList != null) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Jsonb' used without 'try'-with-resources statement
in `itests/camel-k-itests-knative-env-from-properties/src/main/java/org/apache/camel/k/quarkus/it/KnativeEnvFromPropertiesApplication.java`
#### Snippet
```java
                .filter(entry -> Objects.equals(Knative.EndpointKind.source, entry.getEndpointKind()))
                .findFirst()
                .map(def -> JsonbBuilder.create().toJson(def))
                .orElseThrow(IllegalArgumentException::new);
    }
```

### AutoCloseableResource
'Runtime' used without 'try'-with-resources statement
in `support/camel-k-itests-support/camel-k-itests-loader-inspector/src/main/java/org/apache/camel/k/loader/support/LoaderSupport.java`
#### Snippet
```java

    public static JsonObject inspectSource(CamelContext context, String location, byte[] code) throws Exception {
        final Runtime runtime = Runtime.on(context);
        final RoutesLoader loader = context.adapt(ExtendedCamelContext.class).getRoutesLoader();
        final Collection<RoutesBuilder> builders = loader.findRoutesBuilders(ResourceHelper.fromBytes(location, code));
```

### AutoCloseableResource
'Jsonb' used without 'try'-with-resources statement
in `itests/camel-k-itests-knative-env-from-registry/src/main/java/org/apache/camel/k/quarkus/it/KnativeEnvFromRegistryApplication.java`
#### Snippet
```java
                .filter(entry -> Objects.equals(Knative.EndpointKind.source, entry.getEndpointKind()))
                .findFirst()
                .map(def -> JsonbBuilder.create().toJson(def))
                .orElseThrow(IllegalArgumentException::new);
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.camel.spi.PropertiesComponent`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Sets a special list of properties that take precedence and will use first, if a property exist.
     *
     * @see org.apache.camel.spi.PropertiesComponent#setOverrideProperties(Properties)
     * @param key the mapping's key
     * @param value the mapping's value
```

### JavadocReference
Cannot resolve symbol `setOverrideProperties(Properties)`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Sets a special list of properties that take precedence and will use first, if a property exist.
     *
     * @see org.apache.camel.spi.PropertiesComponent#setOverrideProperties(Properties)
     * @param key the mapping's key
     * @param value the mapping's value
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.spi.PropertiesComponent`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Sets a special list of properties that take precedence and will use first, if a property exist.
     *
     * @see org.apache.camel.spi.PropertiesComponent#setOverrideProperties(Properties)
     * @param builder the builder which will create the routes
     */
```

### JavadocReference
Cannot resolve symbol `setOverrideProperties(Properties)`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Sets a special list of properties that take precedence and will use first, if a property exist.
     *
     * @see org.apache.camel.spi.PropertiesComponent#setOverrideProperties(Properties)
     * @param builder the builder which will create the routes
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.spi.PropertiesComponent`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Sets a special list of properties that take precedence and will use first, if a property exist.
     *
     * @see org.apache.camel.spi.PropertiesComponent#setOverrideProperties(Properties)
     * @param properties the properties to set
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.k.SourceLoader.Interceptor`
in `camel-k-core/api/src/main/java/org/apache/camel/k/SourceDefinition.java`
#### Snippet
```java

    /**
     * The {@link org.apache.camel.k.SourceLoader.Interceptor} that should be applied.
     */
    public void setInterceptors(List<String> interceptors) {
```

### JavadocReference
Cannot resolve symbol `SourceLoader`
in `camel-k-core/api/src/main/java/org/apache/camel/k/SourceDefinition.java`
#### Snippet
```java

    /**
     * The {@link SourceLoader} that should be used to load the content of the source.
     */
    public void setLoader(String loader) {
```

### JavadocReference
Cannot resolve symbol `setOverrideProperties(Properties)`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Sets a special list of properties that take precedence and will use first, if a property exist.
     *
     * @see org.apache.camel.spi.PropertiesComponent#setOverrideProperties(Properties)
     * @param properties the properties to set
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.spi.PropertiesComponent`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Sets a special list of properties that take precedence and will use first, if a property exist.
     *
     * @see org.apache.camel.spi.PropertiesComponent#setOverrideProperties(Properties)
     * @param properties the properties to set
     */
```

### JavadocReference
Cannot resolve symbol `setOverrideProperties(Properties)`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Sets a special list of properties that take precedence and will use first, if a property exist.
     *
     * @see org.apache.camel.spi.PropertiesComponent#setOverrideProperties(Properties)
     * @param properties the properties to set
     */
```

### JavadocReference
Cannot resolve symbol `HasCamelContext`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Returns the camel context adapting it to the specialized type.
     *
     * @see HasCamelContext#getCamelContext()
     * @see CamelContext#adapt(Class)
     *
```

### JavadocReference
Cannot resolve symbol `getCamelContext()`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     * Returns the camel context adapting it to the specialized type.
     *
     * @see HasCamelContext#getCamelContext()
     * @see CamelContext#adapt(Class)
     *
```

### JavadocReference
Cannot resolve symbol `CamelContext`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     *
     * @see HasCamelContext#getCamelContext()
     * @see CamelContext#adapt(Class)
     *
     * @return the camel context.
```

### JavadocReference
Cannot resolve symbol `adapt(Class)`
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
     *
     * @see HasCamelContext#getCamelContext()
     * @see CamelContext#adapt(Class)
     *
     * @return the camel context.
```

### JavadocReference
Cannot resolve symbol `CamelContext`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/Sources.java`
#### Snippet
```java
             * Read the content of the source as {@link InputStream}.
             *
             * @param ctx the {@link CamelContext}
             * @return the {@link InputStream} representing the source content
             */
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'event instanceof CamelEvent.ExchangeCompletedEvent' covered by subsequent condition 'event instanceof CamelEvent.ExchangeFailedEvent'
in `camel-k-cron/impl/src/main/java/org/apache/camel/k/cron/CronSourceLoaderInterceptor.java`
#### Snippet
```java
        @Override
        public boolean isEnabled(CamelEvent event) {
            return event instanceof CamelEvent.ExchangeCompletedEvent || event instanceof CamelEvent.ExchangeFailedEvent;
        }
    }
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RuntimeSupport.java`
#### Snippet
```java

        if  (ObjectHelper.isNotEmpty(customizerIDs)) {
            for (String customizerId : customizerIDs.split(",", -1)) {
                customizers.add(customizerId);
            }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `support/camel-k-catalog-model/src/main/java/org/apache/camel/k/catalog/model/Artifact.java`
#### Snippet
```java
@JsonPropertyOrder({"groupId", "artifactId", "version"})
public interface Artifact extends Comparable<Artifact> {
    String getGroupId();;
    String getArtifactId();
    Optional<String> getVersion();
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
package org.apache.camel.k;

import java.util.Map;

import org.apache.camel.CamelContext;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.k.SourceDefinition;`
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.SourceDefinition;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
package org.apache.camel.k.listener;

import java.util.Map;

import org.apache.camel.CamelContext;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.k.listener.SourcesConfigurer;`
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.listener.SourcesConfigurer;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
package org.apache.camel.k.cron;

import java.util.Map;

import org.apache.camel.CamelContext;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.k.cron.CronSourceLoaderInterceptor;`
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.cron.CronSourceLoaderInterceptor;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
package org.apache.camel.k.knative.customizer;

import java.util.Map;

import org.apache.camel.CamelContext;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer;`
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
package org.apache.camel.k.webhook;

import java.util.Map;

import org.apache.camel.CamelContext;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.k.webhook.WebhookContextCustomizer;`
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.webhook.WebhookContextCustomizer;

/**
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'configMapName' is still used
in `camel-k-master/impl/src/main/java/org/apache/camel/k/master/MasterContextCustomizer.java`
#### Snippet
```java
public class MasterContextCustomizer implements ContextCustomizer {
    @Deprecated
    private String configMapName;
    private String kubernetesResourceName;
    private LeaseResourceType leaseResourceType;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `languagesExclusionList` are queried, but never updated
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    @Parameter(property = "languages.exclusion.list")
    private Set<String> languagesExclusionList;

    @Parameter(property = "dsls.exclusion.list")
```

### MismatchedCollectionQueryUpdate
Contents of collection `capabilitiesExclusionList` are queried, but never updated
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    @Parameter(property = "capabilities.exclusion.list")
    private Set<String> capabilitiesExclusionList;

    // ********************
```

### MismatchedCollectionQueryUpdate
Contents of collection `componentsExclusionList` are queried, but never updated
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    @Parameter(property = "components.exclusion.list")
    private Set<String> componentsExclusionList;

    @Parameter(property = "dataformats.exclusion.list")
```

### MismatchedCollectionQueryUpdate
Contents of collection `dslsExclusionList` are queried, but never updated
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    @Parameter(property = "dsls.exclusion.list")
    private Set<String> dslsExclusionList;

    @Parameter(property = "capabilities.exclusion.list")
```

### MismatchedCollectionQueryUpdate
Contents of collection `dataformatsExclusionList` are queried, but never updated
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    @Parameter(property = "dataformats.exclusion.list")
    private Set<String> dataformatsExclusionList;

    @Parameter(property = "languages.exclusion.list")
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Interceptors": return java.lang.String.class;
        case "propertynames":
        case "PropertyNames": return java.lang.String.class;
        default: return null;
        }
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Interceptors": return java.util.List.class;
        case "language":
        case "Language": return java.lang.String.class;
        case "loader":
        case "Loader": return java.lang.String.class;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "ApiVersion": return java.lang.String.class;
        case "kind":
        case "Kind": return java.lang.String.class;
        case "name":
        case "Name": return java.lang.String.class;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "Kind": return java.lang.String.class;
        case "name":
        case "Name": return java.lang.String.class;
        case "type":
        case "Type": return org.apache.camel.component.knative.spi.Knative.Type.class;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Language": return java.lang.String.class;
        case "loader":
        case "Loader": return java.lang.String.class;
        case "location":
        case "Location": return java.lang.String.class;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Loader": return java.lang.String.class;
        case "location":
        case "Location": return java.lang.String.class;
        case "name":
        case "Name": return java.lang.String.class;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Location": return java.lang.String.class;
        case "name":
        case "Name": return java.lang.String.class;
        case "propertynames":
        case "PropertyNames": return java.util.List.class;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Name": return java.lang.String.class;
        case "propertynames":
        case "PropertyNames": return java.util.List.class;
        case "type":
        case "Type": return org.apache.camel.k.SourceType.class;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
        case "Runtime": return org.apache.camel.k.Runtime.class;
        case "timeruri":
        case "TimerUri": return java.lang.String.class;
        default: return null;
        }
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `camel-k-resume-kafka/impl/src/main/java/org/apache/camel/k/resume/kafka/KafkaResumeFactory.java`
#### Snippet
```java
                .build();

        switch (name) {
            case "org.apache.camel.processor.resume.kafka.SingleNodeKafkaResumeStrategy": {
                return new SingleNodeKafkaResumeStrategy(resumeStrategyConfiguration);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `itests/camel-k-itests-knative-consumer/src/main/java/org/apache/camel/k/quarkus/it/KnativeConsumerApplication.java`
#### Snippet
```java
        var component = context.getComponent("knative", KnativeComponent.class);
        var builder = Json.createObjectBuilder();

        if (component.getProducerFactory() != null) {
             builder.add("producer-factory", component.getProducerFactory().getClass().getName());
        }
        if (component.getConsumerFactory() != null) {
            builder.add("consumer-factory", component.getConsumerFactory().getClass().getName());
        }

        return builder.build();
```

### DuplicatedCode
Duplicated code
in `itests/camel-k-itests-knative-source-groovy/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
        List<RouteDefinition> definitions = context.adapt(ModelCamelContext.class).getRouteDefinitions();

        return Json.createArrayBuilder(
            definitions.stream()
                .map(d -> !d.getOutputs().isEmpty() ? d.getOutputs().get(d.getOutputs().size() -1 ) : null)
                .filter(Objects::nonNull)
                .filter(ToDefinition.class::isInstance)
                .map(ToDefinition.class::cast)
                .map(SendDefinition::getEndpointUri)
                .collect(Collectors.toList())
        ).build();
```

## RuleId[id=Deprecation]
### Deprecation
'instance(java.lang.Class, java.lang.annotation.Annotation...)' is deprecated
in `camel-k-runtime/runtime/src/main/java/org/apache/camel/k/quarkus/ApplicationRecorder.java`
#### Snippet
```java

    public void publishRuntime(RuntimeValue<CamelMain> main, BeanContainer container) {
        container.instance(ApplicationProducers.class).setRuntime(new Application.Runtime(main.getValue()));
    }

```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-loader-polyglot/src/main/java/org/apache/camel/k/itests/polyglot/quarkus/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;

    @POST
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-loader-js/src/main/java/org/apache/camel/k/loader/js/quarkus/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;

    @POST
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-producer/src/main/java/org/apache/camel/k/quarkus/it/KnativeProducerApplication.java`
#### Snippet
```java
public class KnativeProducerApplication {
    @Inject
    CamelContext context;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-consumer/src/main/java/org/apache/camel/k/quarkus/it/KnativeConsumerApplication.java`
#### Snippet
```java
public class KnativeConsumerApplication {
    @Inject
    CamelContext context;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-kamelet/src/main/java/org/apache/camel/k/quarkus/it/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;
    @Inject
    FluentProducerTemplate template;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-kamelet/src/main/java/org/apache/camel/k/quarkus/it/Application.java`
#### Snippet
```java
    CamelContext context;
    @Inject
    FluentProducerTemplate template;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative/src/main/java/org/apache/camel/k/quarkus/it/KnativeApplication.java`
#### Snippet
```java
public class KnativeApplication {
    @Inject
    CamelContext context;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-source-groovy/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
public class KnativeSourceApplication {
    @Inject
    CamelContext context;

    private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-source-js/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
public class KnativeSourceApplication {
    @Inject
    CamelContext context;

    private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-source-java/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
public class KnativeSourceApplication {
    @Inject
    CamelContext context;

    private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-source-yaml/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
public class KnativeSourceApplication {
    @Inject
    CamelContext context;

    private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-sinkbinding/src/main/java/org/apache/camel/k/quarkus/it/KnativeSinkBindingApplication.java`
#### Snippet
```java
public class KnativeSinkBindingApplication {
    @Inject
    CamelContext context;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `support/camel-k-itests-support/camel-k-itests-runtime-inspector/src/main/java/org/apache/camel/k/runtime/support/RuntimeInspector.java`
#### Snippet
```java
public class RuntimeInspector {
    @Inject
    CamelContext camelContext;
    @Inject
    Config config;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `support/camel-k-itests-support/camel-k-itests-runtime-inspector/src/main/java/org/apache/camel/k/runtime/support/RuntimeInspector.java`
#### Snippet
```java
    CamelContext camelContext;
    @Inject
    Config config;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-core/src/main/java/org/apache/camel/k/core/quarkus/deployment/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext camelContext;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-webhook/src/main/java/org/apache/camel/k/quarkus/it/webhook/Application.java`
#### Snippet
```java
    CamelContext context;
    @Inject
    CamelRuntime runtime;

    private Map<WebhookAction, AtomicInteger> registerCounters;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-webhook/src/main/java/org/apache/camel/k/quarkus/it/webhook/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;
    @Inject
    CamelRuntime runtime;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-env-from-properties/src/main/java/org/apache/camel/k/quarkus/it/KnativeEnvFromPropertiesApplication.java`
#### Snippet
```java
public class KnativeEnvFromPropertiesApplication {
    @Inject
    CamelContext context;
    @Inject
    FluentProducerTemplate template;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-env-from-properties/src/main/java/org/apache/camel/k/quarkus/it/KnativeEnvFromPropertiesApplication.java`
#### Snippet
```java
    CamelContext context;
    @Inject
    FluentProducerTemplate template;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-loader-jsh/src/main/java/org/apache/camel/k/loader/jsh/quarkus/it/JshApplication.java`
#### Snippet
```java
public class JshApplication {
    @Inject
    CamelContext context;

    @POST
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-loader-kotlin/src/main/java/org/apache/camel/k/loader/kotlin/quarkus/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;

    @POST
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-cron/src/main/java/org/apache/camel/k/quarkus/cron/deployment/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;
    @Inject
    Runtime runtime;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-runtime/src/main/java/org/apache/camel/k/quarkus/it/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext camelContext;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-loader-java/src/main/java/org/apache/camel/k/loader/jsh/quarkus/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;

    @POST
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-loader-groovy/src/main/java/org/apache/camel/k/loader/yaml/quarkus/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;

    @POST
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-source-xml/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
public class KnativeSourceApplication {
    @Inject
    CamelContext context;

    private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-loader-xml/src/main/java/org/apache/camel/k/loader/xml/quarkus/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;

    @POST
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-loader-yaml/src/main/java/org/apache/camel/k/loader/yaml/quarkus/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;

    @POST
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-master/src/main/java/org/apache/camel/k/quarkus/master/Application.java`
#### Snippet
```java
public class Application {
    @Inject
    CamelContext context;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-env-from-registry/src/main/java/org/apache/camel/k/quarkus/it/KnativeEnvFromRegistryApplication.java`
#### Snippet
```java
    CamelContext context;
    @Inject
    FluentProducerTemplate template;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `itests/camel-k-itests-knative-env-from-registry/src/main/java/org/apache/camel/k/quarkus/it/KnativeEnvFromRegistryApplication.java`
#### Snippet
```java
public class KnativeEnvFromRegistryApplication {
    @Inject
    CamelContext context;
    @Inject
    FluentProducerTemplate template;
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `itests/camel-k-itests-cron/src/main/java/org/apache/camel/k/quarkus/cron/deployment/Application.java`
#### Snippet
```java
    @Produces(MediaType.TEXT_PLAIN)
    public String load() throws Exception {
        final String code = ""
            + "\n- from:"
            + "\n    uri: \"timer:tick?period=1&delay=60000\""
```

### TrivialStringConcatenation
Empty string used in concatenation
in `itests/camel-k-itests-cron/src/main/java/org/apache/camel/k/quarkus/cron/deployment/Application.java`
#### Snippet
```java
    @Produces(MediaType.TEXT_PLAIN)
    public String stopped()  {
        return "" + stopped.get();
    }
}
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java
                        new CamelScheme.Builder()
                            .id(scheme)
                            .http(KNOWN_HTTP_URIS.contains(scheme))
                            .passive(KNOWN_PASSIVE_URIS.contains(scheme))
                            .build());
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java
                            .id(scheme)
                            .http(KNOWN_HTTP_URIS.contains(scheme))
                            .passive(KNOWN_PASSIVE_URIS.contains(scheme))
                            .build());
                });
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RuntimeSupport.java`
#### Snippet
```java
        if  (ObjectHelper.isNotEmpty(customizerIDs)) {
            for (String customizerId : customizerIDs.split(",", -1)) {
                customizers.add(customizerId);
            }
        }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `ids` is always 'null'
in `itests/camel-k-itests-kamelet/src/main/java/org/apache/camel/k/quarkus/it/Application.java`
#### Snippet
```java

        return Json.createObjectBuilder()
            .add("templates", Json.createArrayBuilder(ids))
            .build();
    }
```

### ConstantValue
Value `inputFile` is always 'null'
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateRestXML.java`
#### Snippet
```java
    public void execute() throws MojoExecutionException {
        if (inputFile == null) {
            throw new MojoExecutionException("Missing input file: " + inputFile);
        }

```

### ConstantValue
Condition `customizer == null` is always `true`
in `itests/camel-k-itests-knative-sinkbinding/src/main/java/org/apache/camel/k/quarkus/it/KnativeSinkBindingApplication.java`
#### Snippet
```java
    public JsonObject sinkbindingCustomizer() {
        var customizer = context.getRegistry().lookupByNameAndType("sinkbinding", KnativeSinkBindingContextCustomizer.class);
        if (customizer == null) {
            return Json.createObjectBuilder().build();
        }
```

### ConstantValue
Condition `resource == null` is always `true`
in `itests/camel-k-itests-knative-sinkbinding/src/main/java/org/apache/camel/k/quarkus/it/KnativeSinkBindingApplication.java`
#### Snippet
```java
    public JsonObject resource(@PathParam("name") String name) {
        var resource = context.getRegistry().lookupByNameAndType(name, KnativeResource.class);
        if (resource == null) {
            return Json.createObjectBuilder().build();
        }
```

### ConstantValue
Value `event` is always 'null'
in `camel-k-cron/impl/src/main/java/org/apache/camel/k/cron/CronSourceLoaderInterceptor.java`
#### Snippet
```java
        @Override
        public boolean isEnabled(CamelEvent event) {
            return event instanceof CamelEvent.ExchangeCompletedEvent || event instanceof CamelEvent.ExchangeFailedEvent;
        }
    }
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `itests/camel-k-itests-knative-source-groovy/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
    @Produces(MediaType.TEXT_PLAIN)
    public void toUpper(String data) throws InterruptedException {
        queue.put(data.toUpperCase(Locale.US));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `itests/camel-k-itests-knative-source-js/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
    @Produces(MediaType.TEXT_PLAIN)
    public void toUpper(String data) throws InterruptedException {
        queue.put(data.toUpperCase(Locale.US));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `itests/camel-k-itests-knative-source-java/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
    @Produces(MediaType.TEXT_PLAIN)
    public void toUpper(String data) throws InterruptedException {
        queue.put(data.toUpperCase(Locale.US));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateDependencyListMojo.java`
#### Snippet
```java
        try {
            if (Files.notExists(output.getParent())) {
                Files.createDirectories(output.getParent());
            }
        } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateDependencyListMojo.java`
#### Snippet
```java
        }

        try (Writer writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8)) {
            List<Map<String, String>> deps = project.getArtifacts().stream()
                .filter(this::isCompileOrRuntime)
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateDependencyListMojo.java`
#### Snippet
```java
                Path checksumFile = Paths.get(location + "." + checksumType);
                if (Files.exists(checksumFile)) {
                    checksum = checksumType + ":" + Files.readString(checksumFile, StandardCharsets.UTF_8);
                    break;
                }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateDependencyListMojo.java`
#### Snippet
```java

            if (checksum == null) {
                try (InputStream is = Files.newInputStream(artifact.getFile().toPath())) {
                    checksum = "sha1:" + sha1Hex(is);
                }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/support/MavenSupport.java`
#### Snippet
```java

        byte[] buffer = new byte[1024];
        for (int read = is.read(buffer, 0, 1024); read > -1; read = is.read(buffer, 0, 1024)) {
            digest.update(buffer, 0, read);
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/support/MavenSupport.java`
#### Snippet
```java

        byte[] buffer = new byte[1024];
        for (int read = is.read(buffer, 0, 1024); read > -1; read = is.read(buffer, 0, 1024)) {
            digest.update(buffer, 0, read);
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/support/MavenSupport.java`
#### Snippet
```java
            if (is != null) {
                Properties p = new Properties();
                p.load(is);
                version = p.getProperty("version", "");
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/support/MavenSupport.java`
#### Snippet
```java
        try (InputStream is = clazz.getResourceAsStream("/app.properties")) {
            Properties p = new Properties();
            p.load(is);
            return p.getProperty( property );
        } catch (Exception ignored) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateRestXML.java`
#### Snippet
```java

                if (output.getParent() != null && Files.notExists(output.getParent())) {
                    Files.createDirectories(output.getParent());
                }
                if (Files.exists(output)) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateRestXML.java`
#### Snippet
```java
                }
                if (Files.exists(output)) {
                    Files.delete(output);
                }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateRestXML.java`
#### Snippet
```java
                }

                writer = Files.newBufferedWriter(output);
            } else {
                writer = new PrintWriter(System.out);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateRestXML.java`
#### Snippet
```java

            try (writer) {
                writer.write(dsl);
            }
        } catch (Exception e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `itests/camel-k-itests-knative-source-yaml/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
    @Produces(MediaType.TEXT_PLAIN)
    public void toUpper(String data) throws InterruptedException {
        queue.put(data.toUpperCase(Locale.US));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `itests/camel-k-itests-knative-source-xml/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
    @Produces(MediaType.TEXT_PLAIN)
    public void toUpper(String data) throws InterruptedException {
        queue.put(data.toUpperCase(Locale.US));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java
        try {
            if (Files.notExists(output.getParent())) {
                Files.createDirectories(output.getParent());
            }
            if (Files.exists(output)) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java
            }
            if (Files.exists(output)) {
                Files.delete(output);
            }
        } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java
            //   artifacts:
            //
            try (Writer writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8)) {

                YAMLFactory factory = new YAMLFactory()
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

                // write license header
                writer.write(
                    GenerateSupport.getResourceAsString("/catalog-license.txt")
                );
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/devmode/HotDeploymentProcessor.java`
#### Snippet
```java
            if (Files.exists(root)) {
                try {
                    Files.walkFileTree(root, visitor);
                } catch (IOException e) {
                    throw new RuntimeException(e);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RuntimeSupport.java`
#### Snippet
```java
        if (Files.exists(root)) {
            try {
                Files.walkFileTree(root, visitor);
            } catch (IOException e) {
                throw new RuntimeException(e);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RuntimeSupport.java`
#### Snippet
```java
            is = RuntimeSupport.class.getResourceAsStream("/META-INF/maven/org.apache.camel.k/camel-k-runtime-core/pom.properties");
            if (is != null) {
                p.load(is);
                version = p.getProperty("version", "");
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RuntimeSupport.java`
#### Snippet
```java

                if (file.toFile().getAbsolutePath().endsWith(".properties")) {
                    try (Reader reader = Files.newBufferedReader(file)) {
                        Properties p = new Properties();
                        p.load(reader);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RuntimeSupport.java`
#### Snippet
```java
                    try (Reader reader = Files.newBufferedReader(file)) {
                        Properties p = new Properties();
                        p.load(reader);
                        p.forEach((key, value) -> properties.put(String.valueOf(key), String.valueOf(value)));
                    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RuntimeSupport.java`
#### Snippet
```java
                        properties.put(
                                file.getFileName().toString(),
                                Files.readString(file, StandardCharsets.UTF_8));
                    } catch (MalformedInputException mie){
                        // Just skip if it is not a UTF-8 encoded file (ie a binary)
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RuntimeSupport.java`
#### Snippet
```java

            if (Files.exists(confPath) && !Files.isDirectory(confPath)) {
                try (Reader reader = Files.newBufferedReader(confPath)) {
                    Properties p = new Properties();
                    p.load(reader);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RuntimeSupport.java`
#### Snippet
```java
                try (Reader reader = Files.newBufferedReader(confPath)) {
                    Properties p = new Properties();
                    p.load(reader);
                    p.forEach((key, value) -> properties.put(String.valueOf(key), String.valueOf(value)));
                }
```

