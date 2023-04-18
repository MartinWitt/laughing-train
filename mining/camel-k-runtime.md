# camel-k-runtime 
 
# Bad smells
I found 179 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 60 | false |
| BoundedWildcard | 36 | false |
| UNUSED_IMPORT | 25 | false |
| ReturnNull | 16 | false |
| DuplicateBranchesInSwitch | 9 | false |
| SamePackageImport | 5 | false |
| MismatchedCollectionQueryUpdate | 5 | false |
| CodeBlock2Expr | 4 | true |
| RedundantSuppression | 4 | false |
| ClassNameSameAsAncestorName | 2 | false |
| TrivialStringConcatenation | 2 | false |
| SystemOutErr | 1 | false |
| StaticCallOnSubclass | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| UnnecessarySemicolon | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| Convert2MethodRef | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| ConstantValue | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateRestXML.java`
#### Snippet
```java
                writer = Files.newBufferedWriter(output);
            } else {
                writer = new PrintWriter(System.out);
            }

```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `HotReplacementSetup` is the same as one of its superclass' names
in `camel-k-core/runtime/src/main/java/org/apache/camel/k/core/quarkus/devmode/HotReplacementSetup.java`
#### Snippet
```java
package org.apache.camel.k.core.quarkus.devmode;

public class HotReplacementSetup implements io.quarkus.dev.spi.HotReplacementSetup {
    @Override
    public void setupHotDeployment(io.quarkus.dev.spi.HotReplacementContext context) {
```

### ClassNameSameAsAncestorName
Class name `Runtime` is the same as one of its superclass' names
in `camel-k-runtime/runtime/src/main/java/org/apache/camel/k/quarkus/Application.java`
#### Snippet
```java
     * The camel-k runtime impl based on camel-quarkus
     */
    public static class Runtime implements org.apache.camel.k.Runtime {
        private final BaseMainSupport main;
        private final AtomicBoolean stopped;
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `toXml()` declared in class 'org.apache.camel.generator.openapi.RestDslGenerator' but referenced via subclass 'org.apache.camel.generator.openapi.RestDslXmlGenerator'
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateRestXML.java`
#### Snippet
```java

            final CamelContext context = new DefaultCamelContext();
            final String dsl = RestDslXmlGenerator.toXml(document).generate(context);

            try (writer) {
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `io.quarkus.dev.spi` is unnecessary, and can be replaced with an import
in `camel-k-core/runtime/src/main/java/org/apache/camel/k/core/quarkus/devmode/HotReplacementSetup.java`
#### Snippet
```java
public class HotReplacementSetup implements io.quarkus.dev.spi.HotReplacementSetup {
    @Override
    public void setupHotDeployment(io.quarkus.dev.spi.HotReplacementContext context) {
        //TODO: TBD
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.support.component` is unnecessary, and can be replaced with an import
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class WebhookContextCustomizerConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.component.webhook` is unnecessary, and can be replaced with an import
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action":
        case "Action": return org.apache.camel.component.webhook.WebhookAction.class;
        default: return null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.webhook` is unnecessary and can be removed
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.webhook.WebhookContextCustomizer target = (org.apache.camel.k.webhook.WebhookContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.webhook` is unnecessary and can be removed
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.webhook.WebhookContextCustomizer target = (org.apache.camel.k.webhook.WebhookContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.webhook` is unnecessary and can be removed
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.webhook.WebhookContextCustomizer target = (org.apache.camel.k.webhook.WebhookContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.webhook` is unnecessary and can be removed
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.webhook.WebhookContextCustomizer target = (org.apache.camel.k.webhook.WebhookContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.component.webhook` is unnecessary, and can be replaced with an import
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action":
        case "Action": target.setAction(property(camelContext, org.apache.camel.component.webhook.WebhookAction.class, value)); return true;
        default: return false;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.cron` is unnecessary and can be removed
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.cron.CronSourceLoaderInterceptor target = (org.apache.camel.k.cron.CronSourceLoaderInterceptor) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "overridablecomponents":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.cron` is unnecessary and can be removed
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.cron.CronSourceLoaderInterceptor target = (org.apache.camel.k.cron.CronSourceLoaderInterceptor) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "overridablecomponents":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.support.component` is unnecessary, and can be replaced with an import
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class CronSourceLoaderInterceptorConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.cron` is unnecessary and can be removed
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.cron.CronSourceLoaderInterceptor target = (org.apache.camel.k.cron.CronSourceLoaderInterceptor) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "overridablecomponents":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.cron` is unnecessary and can be removed
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.cron.CronSourceLoaderInterceptor target = (org.apache.camel.k.cron.CronSourceLoaderInterceptor) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "overridablecomponents":
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "overridablecomponents":
        case "OverridableComponents": target.setOverridableComponents(property(camelContext, java.lang.String.class, value)); return true;
        case "runtime":
        case "Runtime": target.setRuntime(property(camelContext, org.apache.camel.k.Runtime.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
        case "Runtime": target.setRuntime(property(camelContext, org.apache.camel.k.Runtime.class, value)); return true;
        case "timeruri":
        case "TimerUri": target.setTimerUri(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "overridablecomponents":
        case "OverridableComponents": return java.lang.String.class;
        case "runtime":
        case "Runtime": return org.apache.camel.k.Runtime.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
        case "Runtime": return org.apache.camel.k.Runtime.class;
        case "timeruri":
        case "TimerUri": return java.lang.String.class;
        default: return null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.listener` is unnecessary and can be removed
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.listener.SourcesConfigurer target = (org.apache.camel.k.listener.SourcesConfigurer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "sources":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.listener` is unnecessary and can be removed
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.listener.SourcesConfigurer target = (org.apache.camel.k.listener.SourcesConfigurer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "sources":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k` is unnecessary, and can be replaced with an import
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "sources":
        case "Sources": target.setSources(property(camelContext, org.apache.camel.k.SourceDefinition[].class, value)); return true;
        default: return false;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.listener` is unnecessary and can be removed
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.listener.SourcesConfigurer target = (org.apache.camel.k.listener.SourcesConfigurer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "sources":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.listener` is unnecessary and can be removed
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.listener.SourcesConfigurer target = (org.apache.camel.k.listener.SourcesConfigurer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "sources":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.support.component` is unnecessary, and can be replaced with an import
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class SourcesConfigurerConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k` is unnecessary, and can be replaced with an import
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "sources":
        case "Sources": return org.apache.camel.k.SourceDefinition[].class;
        default: return null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Content": return byte[].class;
        case "id":
        case "Id": return java.lang.String.class;
        case "interceptors":
        case "Interceptors": return java.util.List.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Id": return java.lang.String.class;
        case "interceptors":
        case "Interceptors": return java.util.List.class;
        case "language":
        case "Language": return java.lang.String.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Interceptors": return java.util.List.class;
        case "language":
        case "Language": return java.lang.String.class;
        case "loader":
        case "Loader": return java.lang.String.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Language": return java.lang.String.class;
        case "loader":
        case "Loader": return java.lang.String.class;
        case "location":
        case "Location": return java.lang.String.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Loader": return java.lang.String.class;
        case "location":
        case "Location": return java.lang.String.class;
        case "name":
        case "Name": return java.lang.String.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Location": return java.lang.String.class;
        case "name":
        case "Name": return java.lang.String.class;
        case "propertynames":
        case "PropertyNames": return java.util.List.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Name": return java.lang.String.class;
        case "propertynames":
        case "PropertyNames": return java.util.List.class;
        case "type":
        case "Type": return org.apache.camel.k.SourceType.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "PropertyNames": return java.util.List.class;
        case "type":
        case "Type": return org.apache.camel.k.SourceType.class;
        default: return null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.SourceDefinition target = (org.apache.camel.k.SourceDefinition) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "compressed":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.SourceDefinition target = (org.apache.camel.k.SourceDefinition) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "compressed":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.SourceDefinition target = (org.apache.camel.k.SourceDefinition) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "compressed":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.SourceDefinition target = (org.apache.camel.k.SourceDefinition) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "compressed":
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Content": target.setContent(property(camelContext, byte[].class, value)); return true;
        case "id":
        case "Id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "interceptors":
        case "Interceptors": target.setInterceptors(property(camelContext, java.util.List.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "interceptors":
        case "Interceptors": target.setInterceptors(property(camelContext, java.util.List.class, value)); return true;
        case "language":
        case "Language": target.setLanguage(property(camelContext, java.lang.String.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Interceptors": target.setInterceptors(property(camelContext, java.util.List.class, value)); return true;
        case "language":
        case "Language": target.setLanguage(property(camelContext, java.lang.String.class, value)); return true;
        case "loader":
        case "Loader": target.setLoader(property(camelContext, java.lang.String.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Language": target.setLanguage(property(camelContext, java.lang.String.class, value)); return true;
        case "loader":
        case "Loader": target.setLoader(property(camelContext, java.lang.String.class, value)); return true;
        case "location":
        case "Location": target.setLocation(property(camelContext, java.lang.String.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.knative.customizer` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer target = (org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Loader": target.setLoader(property(camelContext, java.lang.String.class, value)); return true;
        case "location":
        case "Location": target.setLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Location": target.setLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "propertynames":
        case "PropertyNames": target.setPropertyNames(property(camelContext, java.util.List.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.knative.customizer` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer target = (org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "propertynames":
        case "PropertyNames": target.setPropertyNames(property(camelContext, java.util.List.class, value)); return true;
        case "type":
        case "Type": target.setType(property(camelContext, org.apache.camel.k.SourceType.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "PropertyNames": target.setPropertyNames(property(camelContext, java.util.List.class, value)); return true;
        case "type":
        case "Type": target.setType(property(camelContext, org.apache.camel.k.SourceType.class, value)); return true;
        default: return false;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "ApiVersion": target.setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "kind":
        case "Kind": target.setKind(property(camelContext, java.lang.String.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.support.component` is unnecessary, and can be replaced with an import
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class SourceDefinitionConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "ApiVersion": target.setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "kind":
        case "Kind": target.setKind(property(camelContext, java.lang.String.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "Kind": target.setKind(property(camelContext, java.lang.String.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "type":
        case "Type": target.setType(property(camelContext, org.apache.camel.component.knative.spi.Knative.Type.class, value)); return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "interceptors":
        case "Interceptors": return java.lang.String.class;
        case "propertynames":
        case "PropertyNames": return java.lang.String.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.component.knative.spi` is unnecessary, and can be replaced with an import
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "type":
        case "Type": target.setType(property(camelContext, org.apache.camel.component.knative.spi.Knative.Type.class, value)); return true;
        default: return false;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "Interceptors": return java.lang.String.class;
        case "propertynames":
        case "PropertyNames": return java.lang.String.class;
        default: return null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.knative.customizer` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer target = (org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.k.knative.customizer` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer target = (org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "ApiVersion": return java.lang.String.class;
        case "kind":
        case "Kind": return java.lang.String.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "ApiVersion": return java.lang.String.class;
        case "kind":
        case "Kind": return java.lang.String.class;
        case "name":
        case "Name": return java.lang.String.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "Kind": return java.lang.String.class;
        case "name":
        case "Name": return java.lang.String.class;
        case "type":
        case "Type": return org.apache.camel.component.knative.spi.Knative.Type.class;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.component.knative.spi` is unnecessary, and can be replaced with an import
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "Name": return java.lang.String.class;
        case "type":
        case "Type": return org.apache.camel.component.knative.spi.Knative.Type.class;
        default: return null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel.support.component` is unnecessary, and can be replaced with an import
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class KnativeSinkBindingContextCustomizerConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
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
Unused import `import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;`
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spi.ConfigurerStrategy;`
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.CaseInsensitiveMap;`
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.SourceDefinition;

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
Unused import `import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;`
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spi.ConfigurerStrategy;`
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.CaseInsensitiveMap;`
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.listener.SourcesConfigurer;

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
Unused import `import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;`
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spi.ConfigurerStrategy;`
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.CaseInsensitiveMap;`
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.cron.CronSourceLoaderInterceptor;

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
Unused import `import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;`
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spi.ConfigurerStrategy;`
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.CaseInsensitiveMap;`
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer;

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
Unused import `import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;`
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spi.ConfigurerStrategy;`
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.CaseInsensitiveMap;`
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.webhook.WebhookContextCustomizer;

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

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.apache.camel.k.webhook.WebhookContextCustomizer;`
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.webhook.WebhookContextCustomizer;

/**
```

### SamePackageImport
Unnecessary import from the same package `import org.apache.camel.k.cron.CronSourceLoaderInterceptor;`
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.cron.CronSourceLoaderInterceptor;

/**
```

### SamePackageImport
Unnecessary import from the same package `import org.apache.camel.k.listener.SourcesConfigurer;`
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.listener.SourcesConfigurer;

/**
```

### SamePackageImport
Unnecessary import from the same package `import org.apache.camel.k.SourceDefinition;`
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.SourceDefinition;

/**
```

### SamePackageImport
Unnecessary import from the same package `import org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer;`
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.knative.customizer.KnativeSinkBindingContextCustomizer;

/**
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `support/camel-k-apt/src/main/java/org/apache/camel/k/tooling/apt/CamelProcessor.java`
#### Snippet
```java
            Set<? extends Element> ae = roundEnv.getElementsAnnotatedWith(annotation);
            for (Element element: ae) {
                on(element, LoaderInterceptor.class, (e, a) -> {
                    service(
                        output("META-INF/services/org/apache/camel/k/loader/interceptor/%s", a.value()),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `support/camel-k-apt/src/main/java/org/apache/camel/k/tooling/apt/CamelProcessor.java`
#### Snippet
```java
                    );
                });
                on(element, Customizer.class, (e, a) -> {
                    service(
                        output("META-INF/services/org/apache/camel/k/customizer/%s", a.value()),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `itests/camel-k-itests-core/src/main/java/org/apache/camel/k/core/quarkus/deployment/Application.java`
#### Snippet
```java
        JsonArrayBuilder builder = Json.createArrayBuilder();

        ServiceLoader.load(Runtime.Listener.class).forEach(listener -> {
            builder.add(listener.getClass().getName());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java
                builder.addJavaType(definition.getJavaType());

                definition.getSchemes().map(StringUtils::trimToNull).filter(Objects::nonNull).forEach(scheme -> {
                    builder.addScheme(
                        new CamelScheme.Builder()
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
Contents of collection `dslsExclusionList` are queried, but never updated
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    @Parameter(property = "dsls.exclusion.list")
    private Set<String> dslsExclusionList;

    @Parameter(property = "capabilities.exclusion.list")
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
Contents of collection `capabilitiesExclusionList` are queried, but never updated
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    @Parameter(property = "capabilities.exclusion.list")
    private Set<String> capabilitiesExclusionList;

    // ********************
```

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
Contents of collection `dataformatsExclusionList` are queried, but never updated
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/GenerateCatalogMojo.java`
#### Snippet
```java

    @Parameter(property = "dataformats.exclusion.list")
    private Set<String> dataformatsExclusionList;

    @Parameter(property = "languages.exclusion.list")
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `support/camel-k-itests-support/camel-k-itests-runtime-inspector/src/main/java/org/apache/camel/k/runtime/support/RuntimeInspector.java`
#### Snippet
```java

        List<String> endpoints = toDefinitions.stream()
                .map(td -> td.getEndpointUri())
                .collect(Collectors.toList());

```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `support/camel-k-test/src/main/java/org/apache/camel/k/test/CamelKTestSupport.java`
#### Snippet
```java
    public static Properties asProperties(Map<String, Object> properties) {
        Properties answer = new Properties();
        answer.putAll(properties);

        return answer;
```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-18-23-54-49.298.html`
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
in `itests/camel-k-itests-knative-source-js/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
        return Json.createArrayBuilder(
            definitions.stream()
                .map(d -> !d.getOutputs().isEmpty() ? d.getOutputs().get(d.getOutputs().size() -1 ) : null)
                .filter(Objects::nonNull)
                .filter(ToDefinition.class::isInstance)
```

### ReturnNull
Return of `null`
in `itests/camel-k-itests-knative-source-java/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
        return Json.createArrayBuilder(
            definitions.stream()
                .map(d -> !d.getOutputs().isEmpty() ? d.getOutputs().get(d.getOutputs().size() -1 ) : null)
                .filter(Objects::nonNull)
                .filter(ToDefinition.class::isInstance)
```

### ReturnNull
Return of `null`
in `itests/camel-k-itests-knative-source-xml/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
        return Json.createArrayBuilder(
            definitions.stream()
                .map(d -> !d.getOutputs().isEmpty() ? d.getOutputs().get(d.getOutputs().size() -1 ) : null)
                .filter(Objects::nonNull)
                .filter(ToDefinition.class::isInstance)
```

### ReturnNull
Return of `null`
in `itests/camel-k-itests-knative-source-groovy/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
        return Json.createArrayBuilder(
            definitions.stream()
                .map(d -> !d.getOutputs().isEmpty() ? d.getOutputs().get(d.getOutputs().size() -1 ) : null)
                .filter(Objects::nonNull)
                .filter(ToDefinition.class::isInstance)
```

### ReturnNull
Return of `null`
in `itests/camel-k-itests-knative-source-yaml/src/main/java/org/apache/camel/k/quarkus/it/knative/source/KnativeSourceApplication.java`
#### Snippet
```java
        return Json.createArrayBuilder(
            definitions.stream()
                .map(d -> !d.getOutputs().isEmpty() ? d.getOutputs().get(d.getOutputs().size() -1 ) : null)
                .filter(Objects::nonNull)
                .filter(ToDefinition.class::isInstance)
```

### ReturnNull
Return of `null`
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
        case "action":
        case "Action": return org.apache.camel.component.webhook.WebhookAction.class;
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
        case "action":
        case "Action": return target.getAction();
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
        case "timeruri":
        case "TimerUri": return target.getTimerUri();
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
        case "timeruri":
        case "TimerUri": return java.lang.String.class;
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
        case "sources":
        case "Sources": return target.getSources();
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
        case "sources":
        case "Sources": return org.apache.camel.k.SourceDefinition[].class;
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "type":
        case "Type": return org.apache.camel.k.SourceType.class;
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "type":
        case "Type": return target.getType();
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-core/api/src/generated/java/org/apache/camel/k/SourceDefinitionConfigurer.java`
#### Snippet
```java
        case "propertynames":
        case "PropertyNames": return java.lang.String.class;
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "type":
        case "Type": return target.getType();
        default: return null;
        }
    }
```

### ReturnNull
Return of `null`
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
        case "type":
        case "Type": return org.apache.camel.component.knative.spi.Knative.Type.class;
        default: return null;
        }
    }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `itests/camel-k-itests-cron/src/main/java/org/apache/camel/k/quarkus/cron/deployment/Application.java`
#### Snippet
```java
        }

        return "" + context.getRoutesSize();
    }

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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `support/camel-k-apt/src/main/java/org/apache/camel/k/tooling/apt/CamelProcessor.java`
#### Snippet
```java
    }

    private <T extends Annotation> void on(Element element, Class<T> annotationType, BiConsumer<TypeElement, T> consumer) {
        if (element instanceof TypeElement) {
            T annotation = element.getAnnotation(annotationType);
```

### BoundedWildcard
Can generalize to `? super TypeElement`
in `support/camel-k-apt/src/main/java/org/apache/camel/k/tooling/apt/CamelProcessor.java`
#### Snippet
```java
    }

    private <T extends Annotation> void on(Element element, Class<T> annotationType, BiConsumer<TypeElement, T> consumer) {
        if (element instanceof TypeElement) {
            T annotation = element.getAnnotation(annotationType);
```

### BoundedWildcard
Can generalize to `? super T`
in `support/camel-k-apt/src/main/java/org/apache/camel/k/tooling/apt/CamelProcessor.java`
#### Snippet
```java
    }

    private <T extends Annotation> void on(Element element, Class<T> annotationType, BiConsumer<TypeElement, T> consumer) {
        if (element instanceof TypeElement) {
            T annotation = element.getAnnotation(annotationType);
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-runtime/runtime/src/main/java/org/apache/camel/k/quarkus/Application.java`
#### Snippet
```java
    }

    public static <T> Optional<T> instance(Class<T> type) {
        return container()
            .map(container -> container.instance(type))
```

### BoundedWildcard
Can generalize to `? super String`
in `support/camel-k-maven-plugin/src/main/java/org/apache/camel/k/tooling/maven/support/MavenSupport.java`
#### Snippet
```java
    }

    public static void getVersion(Class<?> clazz, String path, Consumer<String> consumer) {
        consumer.accept(
            MavenSupport.getVersion(clazz, path)
```

### BoundedWildcard
Can generalize to `? super Integer`
in `support/camel-k-test/src/main/java/org/apache/camel/k/test/AvailablePortFinder.java`
#### Snippet
```java
     * Reserve a list of random and not in use network ports and place them in Map.
     */
    public static <T> Map<String, T> reserveNetworkPorts(Function<Integer, T> converter, String... names) {
        Map<String, T> reservedPorts = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? extends T`
in `support/camel-k-test/src/main/java/org/apache/camel/k/test/AvailablePortFinder.java`
#### Snippet
```java
     * Reserve a list of random and not in use network ports and place them in Map.
     */
    public static <T> Map<String, T> reserveNetworkPorts(Function<Integer, T> converter, String... names) {
        Map<String, T> reservedPorts = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? super ReflectiveClassBuildItem`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/CoreProcessor.java`
#### Snippet
```java
    @BuildStep
    void registerStreamCachingClasses(
            BuildProducer<ReflectiveClassBuildItem> reflectiveClass,
            CombinedIndexBuildItem combinedIndex) {

```

### BoundedWildcard
Can generalize to `? super ClassInfo`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
            .collect(Collectors.toList());
    }
    public static <T> Iterable<T> getAnnotated(IndexView view, DotName type, Function<ClassInfo, T> mapper) {
        return stream(getAnnotated(view, type)).map(mapper).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
            .collect(Collectors.toList());
    }
    public static <T> Iterable<T> getAnnotated(IndexView view, DotName type, Function<ClassInfo, T> mapper) {
        return stream(getAnnotated(view, type)).map(mapper).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super ClassInfo`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownSubclasses(DotName.createSimple(name));
    }
    public static <T> Stream<T> getAllKnownSubclasses(IndexView view, String name, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownSubclasses(view, name)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownSubclasses(DotName.createSimple(name));
    }
    public static <T> Stream<T> getAllKnownSubclasses(IndexView view, String name, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownSubclasses(view, name)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? super ClassInfo`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownSubclasses(type);
    }
    public static <T> Stream<T> getAllKnownSubclasses(IndexView view, DotName type, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownSubclasses(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownSubclasses(type);
    }
    public static <T> Stream<T> getAllKnownSubclasses(IndexView view, DotName type, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownSubclasses(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? super ClassInfo`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownImplementors(DotName.createSimple(type.getName()));
    }
    public static <T> Stream<T> getAllKnownImplementors(IndexView view, Class<?> type, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownImplementors(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownImplementors(DotName.createSimple(type.getName()));
    }
    public static <T> Stream<T> getAllKnownImplementors(IndexView view, Class<?> type, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownImplementors(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? super ClassInfo`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownImplementors(DotName.createSimple(name));
    }
    public static <T> Stream<T> getAllKnownImplementors(IndexView view, String name, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownImplementors(view, name)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownImplementors(DotName.createSimple(name));
    }
    public static <T> Stream<T> getAllKnownImplementors(IndexView view, String name, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownImplementors(view, name)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? super ClassInfo`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return getAnnotated(view, DotName.createSimple(name));
    }
    public static <T> Stream<T> getAnnotated(IndexView view, String name, Function<ClassInfo, T> mapper) {
        return stream(getAnnotated(view, name)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return getAnnotated(view, DotName.createSimple(name));
    }
    public static <T> Stream<T> getAnnotated(IndexView view, String name, Function<ClassInfo, T> mapper) {
        return stream(getAnnotated(view, name)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? super ClassInfo`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownSubclasses(DotName.createSimple(type.getName()));
    }
    public static <T> Stream<T> getAllKnownSubclasses(IndexView view, Class<?> type, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownSubclasses(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownSubclasses(DotName.createSimple(type.getName()));
    }
    public static <T> Stream<T> getAllKnownSubclasses(IndexView view, Class<?> type, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownSubclasses(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? super ClassInfo`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return getAnnotated(view, DotName.createSimple(type.getName()));
    }
    public static <T> Stream<T> getAnnotated(IndexView view, Class<?> type, Function<ClassInfo, T> mapper) {
        return stream(getAnnotated(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return getAnnotated(view, DotName.createSimple(type.getName()));
    }
    public static <T> Stream<T> getAnnotated(IndexView view, Class<?> type, Function<ClassInfo, T> mapper) {
        return stream(getAnnotated(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? super ClassInfo`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownImplementors(type);
    }
    public static <T> Stream<T> getAllKnownImplementors(IndexView view, DotName type, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownImplementors(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `camel-k-core/deployment/src/main/java/org/apache/camel/k/core/quarkus/deployment/support/DeploymentSupport.java`
#### Snippet
```java
        return view.getAllKnownImplementors(type);
    }
    public static <T> Stream<T> getAllKnownImplementors(IndexView view, DotName type, Function<ClassInfo, T> mapper) {
        return stream(getAllKnownImplementors(view, type)).map(mapper);
    }
```

### BoundedWildcard
Can generalize to `? super Reader`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static RoutesBuilder route(Source source, ThrowingBiConsumer<Reader, RouteBuilder, Exception> consumer) {
        return new RouteBuilder() {
            @Override
```

### BoundedWildcard
Can generalize to `? super RouteBuilder`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static RoutesBuilder route(Source source, ThrowingBiConsumer<Reader, RouteBuilder, Exception> consumer) {
        return new RouteBuilder() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static RoutesBuilder route(Source source, ThrowingBiConsumer<Reader, RouteBuilder, Exception> consumer) {
        return new RouteBuilder() {
            @Override
```

### BoundedWildcard
Can generalize to `? super RouteBuilder`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static RoutesBuilder route(ThrowingConsumer<RouteBuilder, Exception> consumer) {
        return new RouteBuilder() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static RoutesBuilder route(ThrowingConsumer<RouteBuilder, Exception> consumer) {
        return new RouteBuilder() {
            @Override
```

### BoundedWildcard
Can generalize to `? super Reader`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static EndpointRouteBuilder endpoint(Source source, ThrowingBiConsumer<Reader, EndpointRouteBuilder, Exception> consumer) {
        return new EndpointRouteBuilder() {
            @Override
```

### BoundedWildcard
Can generalize to `? super EndpointRouteBuilder`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static EndpointRouteBuilder endpoint(Source source, ThrowingBiConsumer<Reader, EndpointRouteBuilder, Exception> consumer) {
        return new EndpointRouteBuilder() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static EndpointRouteBuilder endpoint(Source source, ThrowingBiConsumer<Reader, EndpointRouteBuilder, Exception> consumer) {
        return new EndpointRouteBuilder() {
            @Override
```

### BoundedWildcard
Can generalize to `? super EndpointRouteBuilder`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static EndpointRouteBuilder endpoint(ThrowingConsumer<EndpointRouteBuilder, Exception> consumer) {
        return new EndpointRouteBuilder() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `camel-k-core/support/src/main/java/org/apache/camel/k/support/RouteBuilders.java`
#### Snippet
```java
    }

    public static EndpointRouteBuilder endpoint(ThrowingConsumer<EndpointRouteBuilder, Exception> consumer) {
        return new EndpointRouteBuilder() {
            @Override
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `entries`, unclear if a varargs or non-varargs call is desired
in `camel-k-core/api/src/main/java/org/apache/camel/k/Runtime.java`
#### Snippet
```java
    default void setProperties(String key, String value, String... entries) {
        setProperties(
            mapOf(HashMap::new, key, value, entries)
        );
    }
```

## RuleId[id=ConstantValue]
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

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `camel-k-core/support/src/generated/java/org/apache/camel/k/listener/SourcesConfigurerConfigurer.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class SourcesConfigurerConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
```

### RedundantSuppression
Redundant suppression
in `camel-k-cron/impl/src/generated/java/org/apache/camel/k/cron/CronSourceLoaderInterceptorConfigurer.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class CronSourceLoaderInterceptorConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
```

### RedundantSuppression
Redundant suppression
in `camel-k-knative/impl/src/generated/java/org/apache/camel/k/knative/customizer/KnativeSinkBindingContextCustomizerConfigurer.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class KnativeSinkBindingContextCustomizerConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
```

### RedundantSuppression
Redundant suppression
in `camel-k-webhook/impl/src/generated/java/org/apache/camel/k/webhook/WebhookContextCustomizerConfigurer.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class WebhookContextCustomizerConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
```

