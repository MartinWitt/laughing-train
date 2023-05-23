# camel-spring-boot 
 
# Bad smells
I found 967 bad smells with 13 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 537 | false |
| FieldMayBeFinal | 102 | false |
| SwitchStatementWithTooFewBranches | 95 | false |
| JavadocLinkAsPlainText | 42 | false |
| DuplicatedCode | 41 | false |
| JavadocReference | 24 | false |
| SpringBootApplicationProperties | 24 | false |
| UNUSED_IMPORT | 15 | false |
| RedundantEscapeInRegexReplacement | 14 | false |
| SimplifyStreamApiCallChains | 8 | false |
| UnnecessaryLocalVariable | 7 | true |
| IgnoreResultOfCall | 6 | false |
| OptionalUsedAsFieldOrParameterType | 6 | false |
| InnerClassMayBeStatic | 5 | true |
| UNCHECKED_WARNING | 4 | false |
| RegExpRedundantEscape | 3 | false |
| UnparsedCustomBeanInspection | 3 | false |
| StringBufferReplaceableByString | 3 | false |
| FieldCanBeLocal | 3 | false |
| AutoCloseableResource | 3 | false |
| CaughtExceptionImmediatelyRethrown | 3 | false |
| RedundantExplicitClose | 3 | false |
| ConstantValue | 3 | false |
| UnnecessarySemicolon | 1 | false |
| RegExpSimplifiable | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| Deprecation | 1 | false |
| TrivialStringConcatenation | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| RegExpRepeatedSpace | 1 | false |
| TrivialIf | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| UnusedAssignment | 1 | false |
| MethodNameSameAsClassName | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'. Reason: 'clazz' has raw type, so result of newInstance is erased
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptEncryptedPropertiesUtils.java`
#### Snippet
```java
        try {
            final Class clazz = Thread.currentThread().getContextClassLoader().loadClass(className);
            return (T) clazz.newInstance();
        } catch (Exception e) {
            throw new EncryptionInitializationException(e);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelAutoConfiguration.java`
#### Snippet
```java
                                                               RoutesCollector routesCollector) {
        Collection<CamelContextConfiguration> configurations = applicationContext.getBeansOfType(CamelContextConfiguration.class).values();
        return new CamelSpringBootApplicationListener(applicationContext, new ArrayList(configurations), config, routesCollector);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelAutoConfiguration.java`
#### Snippet
```java
                                                               RoutesCollector routesCollector) {
        Collection<CamelContextConfiguration> configurations = applicationContext.getBeansOfType(CamelContextConfiguration.class).values();
        return new CamelSpringBootApplicationListener(applicationContext, new ArrayList(configurations), config, routesCollector);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java

            if (route.getProperties() != null) {
                this.properties = new HashMap<>(route.getProperties());
            } else {
                this.properties = Collections.emptyMap();
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `BeansException`
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/EncryptablePropertySourcesPlaceholderConfigurer.java`
#### Snippet
```java
     * @param beanFactory the bean factory to process.
     * @param propertyResolver used to resolve the properties
     * @throws BeansException If an error occurs.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.main.RoutesCollector`
in `dsl-starter/camel-endpointdsl-starter/src/main/java/org/apache/camel/spring/boot/endpointdsl/EndpointDslRouteCollector.java`
#### Snippet
```java

/**
 * Enhanced {@link org.apache.camel.main.RoutesCollector} that supports Endpoint DSL with the
 * lambda style {@link LambdaEndpointRouteBuilder}.
 */
```

### JavadocReference
Cannot resolve symbol `LambdaEndpointRouteBuilder`
in `dsl-starter/camel-endpointdsl-starter/src/main/java/org/apache/camel/spring/boot/endpointdsl/EndpointDslRouteCollector.java`
#### Snippet
```java
/**
 * Enhanced {@link org.apache.camel.main.RoutesCollector} that supports Endpoint DSL with the
 * lambda style {@link LambdaEndpointRouteBuilder}.
 */
public class EndpointDslRouteCollector extends DefaultRoutesCollector {
```

### JavadocReference
Cannot resolve symbol `ComponentCustomizer`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheConfigurationCustomizer.java`
#### Snippet
```java

/**
 * A simple implementation of {@link ComponentCustomizer} that auto discovers a
 * {@link org.ehcache.config.CacheConfiguration} instance and bind it to the
 * {@link EhcacheComponent} component.
```

### JavadocReference
Cannot resolve symbol `org.ehcache.config.CacheConfiguration`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheConfigurationCustomizer.java`
#### Snippet
```java
/**
 * A simple implementation of {@link ComponentCustomizer} that auto discovers a
 * {@link org.ehcache.config.CacheConfiguration} instance and bind it to the
 * {@link EhcacheComponent} component.
 *
```

### JavadocReference
Cannot resolve symbol `EhcacheComponent`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheConfigurationCustomizer.java`
#### Snippet
```java
 * A simple implementation of {@link ComponentCustomizer} that auto discovers a
 * {@link org.ehcache.config.CacheConfiguration} instance and bind it to the
 * {@link EhcacheComponent} component.
 *
 * This customizer can be disabled/enabled with different strategies:
```

### JavadocReference
Cannot resolve symbol `ComponentCustomizer`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheManagerCustomizer.java`
#### Snippet
```java

/**
 * A simple implementation of {@link ComponentCustomizer} that auto discovers a
 * {@link CacheManager} instance and bind it to the {@link EhcacheComponent}
 * component.
```

### JavadocReference
Cannot resolve symbol `CacheManager`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheManagerCustomizer.java`
#### Snippet
```java
/**
 * A simple implementation of {@link ComponentCustomizer} that auto discovers a
 * {@link CacheManager} instance and bind it to the {@link EhcacheComponent}
 * component.
 *
```

### JavadocReference
Cannot resolve symbol `EhcacheComponent`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheManagerCustomizer.java`
#### Snippet
```java
/**
 * A simple implementation of {@link ComponentCustomizer} that auto discovers a
 * {@link CacheManager} instance and bind it to the {@link EhcacheComponent}
 * component.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.CamelContext`
in `core/camel-spring-boot-xml/src/main/java/org/apache/camel/spring/boot/xml/SpringBootXmlCamelContextConfigurer.java`
#### Snippet
```java

/**
 * Used to merge Camel Spring Boot configuration with {@link org.apache.camel.CamelContext} that
 * has been created from XML files. This allows to configure your Camel applications with Spring Boot
 * configuration for both Java and XML Camel routes in similar way.
```

### JavadocReference
Cannot resolve symbol `RuntimeProvider`
in `catalog/camel-catalog-provider-springboot/src/main/java/org/apache/camel/springboot/catalog/SpringBootRuntimeProvider.java`
#### Snippet
```java

/**
 * A Spring Boot based {@link RuntimeProvider} which only includes the supported Camel components, data formats, and languages
 * which can be installed in Spring Boot using the starter dependencies.
 */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
     * Execute goal.
     *
     * @throws MojoExecutionException execution of the main class or one of the
     *                                                        threads it generated failed.
     * @throws MojoFailureException   something bad happened...
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
     * @throws MojoExecutionException execution of the main class or one of the
     *                                                        threads it generated failed.
     * @throws MojoFailureException   something bad happened...
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.CamelContext`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/SpringBootCamelContext.java`
#### Snippet
```java

/**
 * The {@link org.apache.camel.CamelContext} created by Spring Boot.
 */
public class SpringBootCamelContext extends SpringCamelContext {
```

### JavadocReference
Cannot resolve symbol `CamelContext`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelContextConfiguration.java`
#### Snippet
```java

/**
 * Callback that allows custom logic during starting up {@link CamelContext} and just after
 * {@link CamelContext} has been fully started.
 */
```

### JavadocReference
Cannot resolve symbol `CamelContext`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelContextConfiguration.java`
#### Snippet
```java
/**
 * Callback that allows custom logic during starting up {@link CamelContext} and just after
 * {@link CamelContext} has been fully started.
 */
public interface CamelContextConfiguration {
```

### JavadocReference
Cannot resolve symbol `CamelContext`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelContextConfiguration.java`
#### Snippet
```java

    /**
     * Called during Spring Boot is starting up and is starting up {@link CamelContext}.
     */
    void beforeApplicationStart(CamelContext camelContext);
```

### JavadocReference
Cannot resolve symbol `CamelContext`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelContextConfiguration.java`
#### Snippet
```java

    /**
     * Called after Spring Boot and {@link CamelContext} has just been started up.
     * This means there Camel routes may already be active and have started processing incoming messages.
     */
```

### JavadocReference
Cannot resolve symbol `ApplicationContext`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/util/HierarchicalPropertiesEvaluator.java`
#### Snippet
```java
     * Determine the value of the "enabled" flag for a hierarchy of properties.
     *
     * @param applicationContext the spring {@link ApplicationContext}
     * @param prefixes an ordered list of prefixed (less restrictive to more restrictive)
     * @return the value of the key `enabled` for most restrictive prefix
```

### JavadocReference
Cannot resolve symbol `PropertyBindingSupport`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/util/CamelPropertiesHelper.java`
#### Snippet
```java
     * Sets the properties on the target bean.
     * <p/>
     * This method uses {@link PropertyBindingSupport} and therefore offers its capabilities such as:
     * <ul>
     *     <li>property placeholders - Keys and values using Camels property placeholder will be resolved</li>
```

### JavadocReference
Cannot resolve symbol `InfoContributor`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/info/CamelInfoContributor.java`
#### Snippet
```java

/**
 * Camel {@link InfoContributor}
 */
public class CamelInfoContributor implements InfoContributor {
```

### JavadocReference
Cannot resolve symbol `HealthIndicator`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthCheckIndicator.java`
#### Snippet
```java

/**
 * Camel {@link HealthIndicator}.
 */
public class CamelHealthCheckIndicator extends AbstractHealthIndicator {
```

### JavadocReference
Cannot resolve symbol `HealthCheck.Result`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthHelper.java`
#### Snippet
```java

    /**
     * Propagates details from the Camel Health {@link HealthCheck.Result} to the Spring Boot {@link Health.Builder}.
     *
     * @param builder       The health check response builder
```

### JavadocReference
Cannot resolve symbol `Health.Builder`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthHelper.java`
#### Snippet
```java

    /**
     * Propagates details from the Camel Health {@link HealthCheck.Result} to the Spring Boot {@link Health.Builder}.
     *
     * @param builder       The health check response builder
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `components-starter/camel-undertow-spring-security-starter/src/main/java/org/apache/camel/undertow/spring/boot/UndertowSpringSecurityCustomizer.java`
#### Snippet
```java

    private enum ProviderType {
        keycloak;
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Switch label `"org.springframework.data.redis.core.RedisTemplate"` is unreachable
in `components-starter/camel-spring-redis-starter/src/main/java/org/apache/camel/component/redis/springboot/RedisComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.springframework.data.redis.core.RedisTemplate": return applicationContext.getBean(ref, org.springframework.data.redis.core.RedisTemplate.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.msk.MSK2Configuration"` is unreachable
in `components-starter/camel-aws2-msk-starter/src/main/java/org/apache/camel/component/aws2/msk/springboot/MSK2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.msk.MSK2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.msk.MSK2Configuration.class);
            case "software.amazon.awssdk.services.kafka.KafkaClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.kafka.KafkaClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.kafka.KafkaClient"` is unreachable
in `components-starter/camel-aws2-msk-starter/src/main/java/org/apache/camel/component/aws2/msk/springboot/MSK2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.msk.MSK2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.msk.MSK2Configuration.class);
            case "software.amazon.awssdk.services.kafka.KafkaClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.kafka.KafkaClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpRegistry"` is unreachable
in `components-starter/camel-servlet-starter/src/main/java/org/apache/camel/component/servlet/springboot/ServletComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.http.common.HttpRegistry": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpRegistry.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpBinding"` is unreachable
in `components-starter/camel-servlet-starter/src/main/java/org/apache/camel/component/servlet/springboot/ServletComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.http.common.HttpRegistry": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpRegistry.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.web3j.Web3jConfiguration"` is unreachable
in `components-starter/camel-web3j-starter/src/main/java/org/apache/camel/component/web3j/springboot/Web3jComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.web3j.Web3jConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.web3j.Web3jConfiguration.class);
            case "java.math.BigInteger": return applicationContext.getBean(ref, java.math.BigInteger.class);
            case "org.web3j.protocol.Web3j": return applicationContext.getBean(ref, org.web3j.protocol.Web3j.class);
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.s3.S3Client"` is unreachable
in `components-starter/camel-aws2-s3-starter/src/main/java/org/apache/camel/component/aws2/s3/springboot/AWS2S3ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.s3.S3Client": return applicationContext.getBean(ref, software.amazon.awssdk.services.s3.S3Client.class);
            case "software.amazon.awssdk.services.s3.presigner.S3Presigner": return applicationContext.getBean(ref, software.amazon.awssdk.services.s3.presigner.S3Presigner.class);
            case "org.apache.camel.component.aws2.s3.AWS2S3Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.s3.AWS2S3Configuration.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpConfiguration"` is unreachable
in `components-starter/camel-servlet-starter/src/main/java/org/apache/camel/component/servlet/springboot/ServletComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.http.common.HttpRegistry": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpRegistry.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-servlet-starter/src/main/java/org/apache/camel/component/servlet/springboot/ServletComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.s3.presigner.S3Presigner"` is unreachable
in `components-starter/camel-aws2-s3-starter/src/main/java/org/apache/camel/component/aws2/s3/springboot/AWS2S3ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.s3.S3Client": return applicationContext.getBean(ref, software.amazon.awssdk.services.s3.S3Client.class);
            case "software.amazon.awssdk.services.s3.presigner.S3Presigner": return applicationContext.getBean(ref, software.amazon.awssdk.services.s3.presigner.S3Presigner.class);
            case "org.apache.camel.component.aws2.s3.AWS2S3Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.s3.AWS2S3Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.s3.AWS2S3Configuration"` is unreachable
in `components-starter/camel-aws2-s3-starter/src/main/java/org/apache/camel/component/aws2/s3/springboot/AWS2S3ComponentConverter.java`
#### Snippet
```java
            case "software.amazon.awssdk.services.s3.S3Client": return applicationContext.getBean(ref, software.amazon.awssdk.services.s3.S3Client.class);
            case "software.amazon.awssdk.services.s3.presigner.S3Presigner": return applicationContext.getBean(ref, software.amazon.awssdk.services.s3.presigner.S3Presigner.class);
            case "org.apache.camel.component.aws2.s3.AWS2S3Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.s3.AWS2S3Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"java.math.BigInteger"` is unreachable
in `components-starter/camel-web3j-starter/src/main/java/org/apache/camel/component/web3j/springboot/Web3jComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.web3j.Web3jConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.web3j.Web3jConfiguration.class);
            case "java.math.BigInteger": return applicationContext.getBean(ref, java.math.BigInteger.class);
            case "org.web3j.protocol.Web3j": return applicationContext.getBean(ref, org.web3j.protocol.Web3j.class);
        }
```

### DataFlowIssue
Switch label `"org.web3j.protocol.Web3j"` is unreachable
in `components-starter/camel-web3j-starter/src/main/java/org/apache/camel/component/web3j/springboot/Web3jComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.web3j.Web3jConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.web3j.Web3jConfiguration.class);
            case "java.math.BigInteger": return applicationContext.getBean(ref, java.math.BigInteger.class);
            case "org.web3j.protocol.Web3j": return applicationContext.getBean(ref, org.web3j.protocol.Web3j.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.twilio.TwilioConfiguration"` is unreachable
in `components-starter/camel-twilio-starter/src/main/java/org/apache/camel/component/twilio/springboot/TwilioComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.twilio.TwilioConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.twilio.TwilioConfiguration.class);
            case "com.twilio.http.TwilioRestClient": return applicationContext.getBean(ref, com.twilio.http.TwilioRestClient.class);
        }
```

### DataFlowIssue
Switch label `"com.twilio.http.TwilioRestClient"` is unreachable
in `components-starter/camel-twilio-starter/src/main/java/org/apache/camel/component/twilio/springboot/TwilioComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.twilio.TwilioConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.twilio.TwilioConfiguration.class);
            case "com.twilio.http.TwilioRestClient": return applicationContext.getBean(ref, com.twilio.http.TwilioRestClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpRegistry"` is unreachable
in `components-starter/camel-atmosphere-websocket-starter/src/main/java/org/apache/camel/component/atmosphere/websocket/springboot/WebsocketComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.http.common.HttpRegistry": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpRegistry.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpBinding"` is unreachable
in `components-starter/camel-atmosphere-websocket-starter/src/main/java/org/apache/camel/component/atmosphere/websocket/springboot/WebsocketComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.http.common.HttpRegistry": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpRegistry.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpConfiguration"` is unreachable
in `components-starter/camel-atmosphere-websocket-starter/src/main/java/org/apache/camel/component/atmosphere/websocket/springboot/WebsocketComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.http.common.HttpRegistry": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpRegistry.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-atmosphere-websocket-starter/src/main/java/org/apache/camel/component/atmosphere/websocket/springboot/WebsocketComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.olingo4.Olingo4Configuration"` is unreachable
in `components-starter/camel-olingo4-starter/src/main/java/org/apache/camel/component/olingo4/springboot/Olingo4ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.olingo4.Olingo4Configuration": return applicationContext.getBean(ref, org.apache.camel.component.olingo4.Olingo4Configuration.class);
            case "org.apache.http.HttpHost": return applicationContext.getBean(ref, org.apache.http.HttpHost.class);
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
```

### DataFlowIssue
Switch label `"org.apache.http.HttpHost"` is unreachable
in `components-starter/camel-olingo4-starter/src/main/java/org/apache/camel/component/olingo4/springboot/Olingo4ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.olingo4.Olingo4Configuration": return applicationContext.getBean(ref, org.apache.camel.component.olingo4.Olingo4Configuration.class);
            case "org.apache.http.HttpHost": return applicationContext.getBean(ref, org.apache.http.HttpHost.class);
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
            case "org.apache.http.impl.client.HttpClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.client.HttpClientBuilder.class);
```

### DataFlowIssue
Switch label `"org.apache.http.impl.nio.client.HttpAsyncClientBuilder"` is unreachable
in `components-starter/camel-olingo4-starter/src/main/java/org/apache/camel/component/olingo4/springboot/Olingo4ComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.olingo4.Olingo4Configuration": return applicationContext.getBean(ref, org.apache.camel.component.olingo4.Olingo4Configuration.class);
            case "org.apache.http.HttpHost": return applicationContext.getBean(ref, org.apache.http.HttpHost.class);
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
            case "org.apache.http.impl.client.HttpClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.client.HttpClientBuilder.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.http.impl.client.HttpClientBuilder"` is unreachable
in `components-starter/camel-olingo4-starter/src/main/java/org/apache/camel/component/olingo4/springboot/Olingo4ComponentConverter.java`
#### Snippet
```java
            case "org.apache.http.HttpHost": return applicationContext.getBean(ref, org.apache.http.HttpHost.class);
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
            case "org.apache.http.impl.client.HttpClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.client.HttpClientBuilder.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-olingo4-starter/src/main/java/org/apache/camel/component/olingo4/springboot/Olingo4ComponentConverter.java`
#### Snippet
```java
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
            case "org.apache.http.impl.client.HttpClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.client.HttpClientBuilder.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.influxdb.InfluxDB"` is unreachable
in `components-starter/camel-influxdb-starter/src/main/java/org/apache/camel/component/influxdb/springboot/InfluxDbComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.influxdb.InfluxDB": return applicationContext.getBean(ref, org.influxdb.InfluxDB.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws.secretsmanager.SecretsManagerConfiguration"` is unreachable
in `components-starter/camel-aws-secrets-manager-starter/src/main/java/org/apache/camel/component/aws/secretsmanager/springboot/SecretsManagerComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws.secretsmanager.SecretsManagerConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.aws.secretsmanager.SecretsManagerConfiguration.class);
            case "software.amazon.awssdk.services.secretsmanager.SecretsManagerClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.secretsmanager.SecretsManagerClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.secretsmanager.SecretsManagerClient"` is unreachable
in `components-starter/camel-aws-secrets-manager-starter/src/main/java/org/apache/camel/component/aws/secretsmanager/springboot/SecretsManagerComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws.secretsmanager.SecretsManagerConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.aws.secretsmanager.SecretsManagerConfiguration.class);
            case "software.amazon.awssdk.services.secretsmanager.SecretsManagerClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.secretsmanager.SecretsManagerClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"java.security.KeyStore"` is unreachable
in `components-starter/camel-crypto-starter/src/main/java/org/apache/camel/component/crypto/springboot/DigitalSignatureComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "java.security.KeyStore": return applicationContext.getBean(ref, java.security.KeyStore.class);
            case "java.security.PrivateKey": return applicationContext.getBean(ref, java.security.PrivateKey.class);
            case "java.security.cert.Certificate": return applicationContext.getBean(ref, java.security.cert.Certificate.class);
```

### DataFlowIssue
Switch label `"java.security.PrivateKey"` is unreachable
in `components-starter/camel-crypto-starter/src/main/java/org/apache/camel/component/crypto/springboot/DigitalSignatureComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "java.security.KeyStore": return applicationContext.getBean(ref, java.security.KeyStore.class);
            case "java.security.PrivateKey": return applicationContext.getBean(ref, java.security.PrivateKey.class);
            case "java.security.cert.Certificate": return applicationContext.getBean(ref, java.security.cert.Certificate.class);
            case "org.apache.camel.component.crypto.DigitalSignatureConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.crypto.DigitalSignatureConfiguration.class);
```

### DataFlowIssue
Switch label `"java.security.cert.Certificate"` is unreachable
in `components-starter/camel-crypto-starter/src/main/java/org/apache/camel/component/crypto/springboot/DigitalSignatureComponentConverter.java`
#### Snippet
```java
            case "java.security.KeyStore": return applicationContext.getBean(ref, java.security.KeyStore.class);
            case "java.security.PrivateKey": return applicationContext.getBean(ref, java.security.PrivateKey.class);
            case "java.security.cert.Certificate": return applicationContext.getBean(ref, java.security.cert.Certificate.class);
            case "org.apache.camel.component.crypto.DigitalSignatureConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.crypto.DigitalSignatureConfiguration.class);
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.crypto.DigitalSignatureConfiguration"` is unreachable
in `components-starter/camel-crypto-starter/src/main/java/org/apache/camel/component/crypto/springboot/DigitalSignatureComponentConverter.java`
#### Snippet
```java
            case "java.security.PrivateKey": return applicationContext.getBean(ref, java.security.PrivateKey.class);
            case "java.security.cert.Certificate": return applicationContext.getBean(ref, java.security.cert.Certificate.class);
            case "org.apache.camel.component.crypto.DigitalSignatureConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.crypto.DigitalSignatureConfiguration.class);
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
            case "java.security.PublicKey": return applicationContext.getBean(ref, java.security.PublicKey.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.KeyStoreParameters"` is unreachable
in `components-starter/camel-crypto-starter/src/main/java/org/apache/camel/component/crypto/springboot/DigitalSignatureComponentConverter.java`
#### Snippet
```java
            case "java.security.cert.Certificate": return applicationContext.getBean(ref, java.security.cert.Certificate.class);
            case "org.apache.camel.component.crypto.DigitalSignatureConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.crypto.DigitalSignatureConfiguration.class);
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
            case "java.security.PublicKey": return applicationContext.getBean(ref, java.security.PublicKey.class);
            case "java.security.SecureRandom": return applicationContext.getBean(ref, java.security.SecureRandom.class);
```

### DataFlowIssue
Switch label `"java.security.PublicKey"` is unreachable
in `components-starter/camel-crypto-starter/src/main/java/org/apache/camel/component/crypto/springboot/DigitalSignatureComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.crypto.DigitalSignatureConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.crypto.DigitalSignatureConfiguration.class);
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
            case "java.security.PublicKey": return applicationContext.getBean(ref, java.security.PublicKey.class);
            case "java.security.SecureRandom": return applicationContext.getBean(ref, java.security.SecureRandom.class);
        }
```

### DataFlowIssue
Switch label `"java.security.SecureRandom"` is unreachable
in `components-starter/camel-crypto-starter/src/main/java/org/apache/camel/component/crypto/springboot/DigitalSignatureComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
            case "java.security.PublicKey": return applicationContext.getBean(ref, java.security.PublicKey.class);
            case "java.security.SecureRandom": return applicationContext.getBean(ref, java.security.SecureRandom.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.zookeepermaster.ContainerIdFactory"` is unreachable
in `components-starter/camel-zookeeper-master-starter/src/main/java/org/apache/camel/component/zookeepermaster/springboot/MasterComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.zookeepermaster.ContainerIdFactory": return applicationContext.getBean(ref, org.apache.camel.component.zookeepermaster.ContainerIdFactory.class);
            case "org.apache.curator.framework.CuratorFramework": return applicationContext.getBean(ref, org.apache.curator.framework.CuratorFramework.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.curator.framework.CuratorFramework"` is unreachable
in `components-starter/camel-zookeeper-master-starter/src/main/java/org/apache/camel/component/zookeepermaster/springboot/MasterComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.zookeepermaster.ContainerIdFactory": return applicationContext.getBean(ref, org.apache.camel.component.zookeepermaster.ContainerIdFactory.class);
            case "org.apache.curator.framework.CuratorFramework": return applicationContext.getBean(ref, org.apache.curator.framework.CuratorFramework.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"jakarta.jms.ConnectionFactory"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.springframework.core.task.TaskExecutor": return applicationContext.getBean(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
```

### DataFlowIssue
Switch label `"org.springframework.core.task.TaskExecutor"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.springframework.core.task.TaskExecutor": return applicationContext.getBean(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jms.JmsConfiguration"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.springframework.core.task.TaskExecutor": return applicationContext.getBean(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
```

### DataFlowIssue
Switch label `"org.springframework.jms.support.destination.DestinationResolver"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "org.springframework.core.task.TaskExecutor": return applicationContext.getBean(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
```

### DataFlowIssue
Switch label `"org.springframework.util.ErrorHandler"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
```

### DataFlowIssue
Switch label `"jakarta.jms.ExceptionListener"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
```

### DataFlowIssue
Switch label `"org.springframework.jms.support.converter.MessageConverter"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jms.MessageCreatedStrategy"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jms.MessageListenerContainerFactory"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jms.QueueBrowseStrategy"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
        }
```

### DataFlowIssue
Switch label `"org.springframework.transaction.PlatformTransactionManager"` is unreachable
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.influxdb.client.InfluxDBClient"` is unreachable
in `components-starter/camel-influxdb2-starter/src/main/java/org/apache/camel/component/influxdb2/springboot/InfluxDb2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.influxdb.client.InfluxDBClient": return applicationContext.getBean(ref, com.influxdb.client.InfluxDBClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.eks.EKS2Configuration"` is unreachable
in `components-starter/camel-aws2-eks-starter/src/main/java/org/apache/camel/component/aws2/eks/springboot/EKS2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.eks.EKS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.eks.EKS2Configuration.class);
            case "software.amazon.awssdk.services.eks.EksClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.eks.EksClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.eks.EksClient"` is unreachable
in `components-starter/camel-aws2-eks-starter/src/main/java/org/apache/camel/component/aws2/eks/springboot/EKS2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.eks.EKS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.eks.EKS2Configuration.class);
            case "software.amazon.awssdk.services.eks.EksClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.eks.EksClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.lucene.analysis.Analyzer"` is unreachable
in `components-starter/camel-lucene-starter/src/main/java/org/apache/camel/component/lucene/springboot/LuceneComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.lucene.analysis.Analyzer": return applicationContext.getBean(ref, org.apache.lucene.analysis.Analyzer.class);
            case "org.apache.camel.component.lucene.LuceneConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.lucene.LuceneConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.lucene.LuceneConfiguration"` is unreachable
in `components-starter/camel-lucene-starter/src/main/java/org/apache/camel/component/lucene/springboot/LuceneComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.lucene.analysis.Analyzer": return applicationContext.getBean(ref, org.apache.lucene.analysis.Analyzer.class);
            case "org.apache.camel.component.lucene.LuceneConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.lucene.LuceneConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.ibatis.session.SqlSessionFactory"` is unreachable
in `components-starter/camel-mybatis-starter/src/main/java/org/apache/camel/component/mybatis/springboot/MyBatisComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ibatis.session.SqlSessionFactory": return applicationContext.getBean(ref, org.apache.ibatis.session.SqlSessionFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.ibatis.session.SqlSessionFactory"` is unreachable
in `components-starter/camel-mybatis-starter/src/main/java/org/apache/camel/component/mybatis/springboot/MyBatisBeanComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ibatis.session.SqlSessionFactory": return applicationContext.getBean(ref, org.apache.ibatis.session.SqlSessionFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.as2.AS2Configuration"` is unreachable
in `components-starter/camel-as2-starter/src/main/java/org/apache/camel/component/as2/springboot/AS2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.as2.AS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.as2.AS2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.avro.Protocol"` is unreachable
in `components-starter/camel-avro-rpc-starter/src/main/java/org/apache/camel/component/avro/springboot/AvroComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.avro.Protocol": return applicationContext.getBean(ref, org.apache.avro.Protocol.class);
            case "org.apache.camel.component.avro.AvroConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.avro.AvroConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.avro.AvroConfiguration"` is unreachable
in `components-starter/camel-avro-rpc-starter/src/main/java/org/apache/camel/component/avro/springboot/AvroComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.avro.Protocol": return applicationContext.getBean(ref, org.apache.avro.Protocol.class);
            case "org.apache.camel.component.avro.AvroConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.avro.AvroConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.knative.KnativeConfiguration"` is unreachable
in `components-starter/camel-knative-starter/src/main/java/org/apache/camel/component/knative/springboot/KnativeComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.knative.KnativeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.knative.KnativeConfiguration.class);
            case "org.apache.camel.component.knative.spi.KnativeConsumerFactory": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeConsumerFactory.class);
            case "org.apache.camel.component.knative.spi.KnativeEnvironment": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeEnvironment.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.knative.spi.KnativeConsumerFactory"` is unreachable
in `components-starter/camel-knative-starter/src/main/java/org/apache/camel/component/knative/springboot/KnativeComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.knative.KnativeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.knative.KnativeConfiguration.class);
            case "org.apache.camel.component.knative.spi.KnativeConsumerFactory": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeConsumerFactory.class);
            case "org.apache.camel.component.knative.spi.KnativeEnvironment": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeEnvironment.class);
            case "org.apache.camel.component.knative.spi.KnativeProducerFactory": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeProducerFactory.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.knative.spi.KnativeEnvironment"` is unreachable
in `components-starter/camel-knative-starter/src/main/java/org/apache/camel/component/knative/springboot/KnativeComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.knative.KnativeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.knative.KnativeConfiguration.class);
            case "org.apache.camel.component.knative.spi.KnativeConsumerFactory": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeConsumerFactory.class);
            case "org.apache.camel.component.knative.spi.KnativeEnvironment": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeEnvironment.class);
            case "org.apache.camel.component.knative.spi.KnativeProducerFactory": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeProducerFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.knative.spi.KnativeProducerFactory"` is unreachable
in `components-starter/camel-knative-starter/src/main/java/org/apache/camel/component/knative/springboot/KnativeComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.knative.spi.KnativeConsumerFactory": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeConsumerFactory.class);
            case "org.apache.camel.component.knative.spi.KnativeEnvironment": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeEnvironment.class);
            case "org.apache.camel.component.knative.spi.KnativeProducerFactory": return applicationContext.getBean(ref, org.apache.camel.component.knative.spi.KnativeProducerFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.iec60870.client.ClientOptions"` is unreachable
in `components-starter/camel-iec60870-starter/src/main/java/org/apache/camel/component/iec60870/client/springboot/ClientComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.iec60870.client.ClientOptions": return applicationContext.getBean(ref, org.apache.camel.component.iec60870.client.ClientOptions.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.iec60870.server.ServerOptions"` is unreachable
in `components-starter/camel-iec60870-starter/src/main/java/org/apache/camel/component/iec60870/server/springboot/ServerComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.iec60870.server.ServerOptions": return applicationContext.getBean(ref, org.apache.camel.component.iec60870.server.ServerOptions.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.hisp.dhis.integration.sdk.api.Dhis2Client"` is unreachable
in `components-starter/camel-dhis2-starter/src/main/java/org/apache/camel/component/dhis2/springboot/Dhis2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.hisp.dhis.integration.sdk.api.Dhis2Client": return applicationContext.getBean(ref, org.hisp.dhis.integration.sdk.api.Dhis2Client.class);
            case "org.apache.camel.component.dhis2.Dhis2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.dhis2.Dhis2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.dhis2.Dhis2Configuration"` is unreachable
in `components-starter/camel-dhis2-starter/src/main/java/org/apache/camel/component/dhis2/springboot/Dhis2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.hisp.dhis.integration.sdk.api.Dhis2Client": return applicationContext.getBean(ref, org.hisp.dhis.integration.sdk.api.Dhis2Client.class);
            case "org.apache.camel.component.dhis2.Dhis2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.dhis2.Dhis2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration"` is unreachable
in `components-starter/camel-google-sheets-starter/src/main/java/org/apache/camel/component/google/sheets/stream/springboot/GoogleSheetsStreamComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration.class);
            case "org.apache.camel.component.google.sheets.GoogleSheetsClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.sheets.GoogleSheetsClientFactory"` is unreachable
in `components-starter/camel-google-sheets-starter/src/main/java/org/apache/camel/component/google/sheets/stream/springboot/GoogleSheetsStreamComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration.class);
            case "org.apache.camel.component.google.sheets.GoogleSheetsClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.sheets.GoogleSheetsConfiguration"` is unreachable
in `components-starter/camel-google-sheets-starter/src/main/java/org/apache/camel/component/google/sheets/springboot/GoogleSheetsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.sheets.GoogleSheetsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.sheets.GoogleSheetsConfiguration.class);
            case "org.apache.camel.component.google.sheets.GoogleSheetsClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.sheets.GoogleSheetsClientFactory"` is unreachable
in `components-starter/camel-google-sheets-starter/src/main/java/org/apache/camel/component/google/sheets/springboot/GoogleSheetsComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.sheets.GoogleSheetsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.sheets.GoogleSheetsConfiguration.class);
            case "org.apache.camel.component.google.sheets.GoogleSheetsClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"jakarta.jms.ConnectionFactory"` is unreachable
in `components-starter/camel-sjms-starter/src/main/java/org/apache/camel/component/sjms/springboot/SjmsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.apache.camel.component.sjms.jms.DestinationCreationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.sjms.jms.DestinationCreationStrategy"` is unreachable
in `components-starter/camel-sjms-starter/src/main/java/org/apache/camel/component/sjms/springboot/SjmsComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.apache.camel.component.sjms.jms.DestinationCreationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
```

### DataFlowIssue
Switch label `"jakarta.jms.ExceptionListener"` is unreachable
in `components-starter/camel-sjms-starter/src/main/java/org/apache/camel/component/sjms/springboot/SjmsComponentConverter.java`
#### Snippet
```java
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.apache.camel.component.sjms.jms.DestinationCreationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
            case "org.apache.camel.component.sjms.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy"` is unreachable
in `components-starter/camel-sjms-starter/src/main/java/org/apache/camel/component/sjms/springboot/SjmsComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.sjms.jms.DestinationCreationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
            case "org.apache.camel.component.sjms.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.sjms.jms.MessageCreatedStrategy"` is unreachable
in `components-starter/camel-sjms-starter/src/main/java/org/apache/camel/component/sjms/springboot/SjmsComponentConverter.java`
#### Snippet
```java
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
            case "org.apache.camel.component.sjms.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-sjms-starter/src/main/java/org/apache/camel/component/sjms/springboot/SjmsComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
            case "org.apache.camel.component.sjms.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.ExchangeFormatter"` is unreachable
in `components-starter/camel-dataset-starter/src/main/java/org/apache/camel/component/dataset/springboot/DataSetComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.ExchangeFormatter": return applicationContext.getBean(ref, org.apache.camel.spi.ExchangeFormatter.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.ExchangeFormatter"` is unreachable
in `components-starter/camel-dataset-starter/src/main/java/org/apache/camel/component/dataset/springboot/DataSetTestComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.ExchangeFormatter": return applicationContext.getBean(ref, org.apache.camel.spi.ExchangeFormatter.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"jakarta.jms.ConnectionFactory"` is unreachable
in `components-starter/camel-sjms2-starter/src/main/java/org/apache/camel/component/sjms2/springboot/Sjms2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.apache.camel.component.sjms.jms.DestinationCreationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.sjms.jms.DestinationCreationStrategy"` is unreachable
in `components-starter/camel-sjms2-starter/src/main/java/org/apache/camel/component/sjms2/springboot/Sjms2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.apache.camel.component.sjms.jms.DestinationCreationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
```

### DataFlowIssue
Switch label `"jakarta.jms.ExceptionListener"` is unreachable
in `components-starter/camel-sjms2-starter/src/main/java/org/apache/camel/component/sjms2/springboot/Sjms2ComponentConverter.java`
#### Snippet
```java
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.apache.camel.component.sjms.jms.DestinationCreationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
            case "org.apache.camel.component.sjms.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy"` is unreachable
in `components-starter/camel-sjms2-starter/src/main/java/org/apache/camel/component/sjms2/springboot/Sjms2ComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.sjms.jms.DestinationCreationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
            case "org.apache.camel.component.sjms.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.sjms.jms.MessageCreatedStrategy"` is unreachable
in `components-starter/camel-sjms2-starter/src/main/java/org/apache/camel/component/sjms2/springboot/Sjms2ComponentConverter.java`
#### Snippet
```java
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
            case "org.apache.camel.component.sjms.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-sjms2-starter/src/main/java/org/apache/camel/component/sjms2/springboot/Sjms2ComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
            case "org.apache.camel.component.sjms.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.sns.SnsClient"` is unreachable
in `components-starter/camel-aws2-sns-starter/src/main/java/org/apache/camel/component/aws2/sns/springboot/Sns2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.sns.SnsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.sns.SnsClient.class);
            case "org.apache.camel.component.aws2.sns.Sns2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.sns.Sns2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.sns.Sns2Configuration"` is unreachable
in `components-starter/camel-aws2-sns-starter/src/main/java/org/apache/camel/component/aws2/sns/springboot/Sns2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.sns.SnsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.sns.SnsClient.class);
            case "org.apache.camel.component.aws2.sns.Sns2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.sns.Sns2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.bazaarvoice.jolt.Transform"` is unreachable
in `components-starter/camel-jolt-starter/src/main/java/org/apache/camel/component/jolt/springboot/JoltComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.bazaarvoice.jolt.Transform": return applicationContext.getBean(ref, com.bazaarvoice.jolt.Transform.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.zendesk.ZendeskConfiguration"` is unreachable
in `components-starter/camel-zendesk-starter/src/main/java/org/apache/camel/component/zendesk/springboot/ZendeskComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.zendesk.ZendeskConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.zendesk.ZendeskConfiguration.class);
            case "org.zendesk.client.v2.Zendesk": return applicationContext.getBean(ref, org.zendesk.client.v2.Zendesk.class);
        }
```

### DataFlowIssue
Switch label `"org.zendesk.client.v2.Zendesk"` is unreachable
in `components-starter/camel-zendesk-starter/src/main/java/org/apache/camel/component/zendesk/springboot/ZendeskComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.zendesk.ZendeskConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.zendesk.ZendeskConfiguration.class);
            case "org.zendesk.client.v2.Zendesk": return applicationContext.getBean(ref, org.zendesk.client.v2.Zendesk.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.ssh.SshConfiguration"` is unreachable
in `components-starter/camel-ssh-starter/src/main/java/org/apache/camel/component/ssh/springboot/SshComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.ssh.SshConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.ssh.SshConfiguration.class);
            case "org.apache.sshd.common.keyprovider.KeyPairProvider": return applicationContext.getBean(ref, org.apache.sshd.common.keyprovider.KeyPairProvider.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.sshd.common.keyprovider.KeyPairProvider"` is unreachable
in `components-starter/camel-ssh-starter/src/main/java/org/apache/camel/component/ssh/springboot/SshComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.ssh.SshConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.ssh.SshConfiguration.class);
            case "org.apache.sshd.common.keyprovider.KeyPairProvider": return applicationContext.getBean(ref, org.apache.sshd.common.keyprovider.KeyPairProvider.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.mail.JavaMailSender"` is unreachable
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/component/mail/springboot/MailComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.mail.JavaMailSender": return applicationContext.getBean(ref, org.apache.camel.component.mail.JavaMailSender.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class);
```

### DataFlowIssue
Switch label `"java.util.Properties"` is unreachable
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/component/mail/springboot/MailComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.mail.JavaMailSender": return applicationContext.getBean(ref, org.apache.camel.component.mail.JavaMailSender.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class);
            case "org.apache.camel.component.mail.MailAuthenticator": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailAuthenticator.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver"` is unreachable
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/component/mail/springboot/MailComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.mail.JavaMailSender": return applicationContext.getBean(ref, org.apache.camel.component.mail.JavaMailSender.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class);
            case "org.apache.camel.component.mail.MailAuthenticator": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailAuthenticator.class);
            case "org.apache.camel.component.mail.MailConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailConfiguration.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.mail.MailAuthenticator"` is unreachable
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/component/mail/springboot/MailComponentConverter.java`
#### Snippet
```java
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class);
            case "org.apache.camel.component.mail.MailAuthenticator": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailAuthenticator.class);
            case "org.apache.camel.component.mail.MailConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailConfiguration.class);
            case "org.apache.camel.component.mail.ContentTypeResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.ContentTypeResolver.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.mail.MailConfiguration"` is unreachable
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/component/mail/springboot/MailComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class);
            case "org.apache.camel.component.mail.MailAuthenticator": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailAuthenticator.class);
            case "org.apache.camel.component.mail.MailConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailConfiguration.class);
            case "org.apache.camel.component.mail.ContentTypeResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.ContentTypeResolver.class);
            case "jakarta.mail.Session": return applicationContext.getBean(ref, jakarta.mail.Session.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.mail.ContentTypeResolver"` is unreachable
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/component/mail/springboot/MailComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.mail.MailAuthenticator": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailAuthenticator.class);
            case "org.apache.camel.component.mail.MailConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailConfiguration.class);
            case "org.apache.camel.component.mail.ContentTypeResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.ContentTypeResolver.class);
            case "jakarta.mail.Session": return applicationContext.getBean(ref, jakarta.mail.Session.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"jakarta.mail.Session"` is unreachable
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/component/mail/springboot/MailComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.mail.MailConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mail.MailConfiguration.class);
            case "org.apache.camel.component.mail.ContentTypeResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.ContentTypeResolver.class);
            case "jakarta.mail.Session": return applicationContext.getBean(ref, jakarta.mail.Session.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/component/mail/springboot/MailComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.mail.ContentTypeResolver": return applicationContext.getBean(ref, org.apache.camel.component.mail.ContentTypeResolver.class);
            case "jakarta.mail.Session": return applicationContext.getBean(ref, jakarta.mail.Session.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/component/mail/springboot/MailComponentConverter.java`
#### Snippet
```java
            case "jakarta.mail.Session": return applicationContext.getBean(ref, jakarta.mail.Session.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.google.common.eventbus.EventBus"` is unreachable
in `components-starter/camel-guava-eventbus-starter/src/main/java/org/apache/camel/component/guava/eventbus/springboot/GuavaEventBusComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.google.common.eventbus.EventBus": return applicationContext.getBean(ref, com.google.common.eventbus.EventBus.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.iam.IAM2Configuration"` is unreachable
in `components-starter/camel-aws2-iam-starter/src/main/java/org/apache/camel/component/aws2/iam/springboot/IAM2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.iam.IAM2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.iam.IAM2Configuration.class);
            case "software.amazon.awssdk.services.iam.IamClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.iam.IamClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.iam.IamClient"` is unreachable
in `components-starter/camel-aws2-iam-starter/src/main/java/org/apache/camel/component/aws2/iam/springboot/IAM2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.iam.IAM2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.iam.IAM2Configuration.class);
            case "software.amazon.awssdk.services.iam.IamClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.iam.IamClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.azure.core.amqp.AmqpRetryOptions"` is unreachable
in `components-starter/camel-azure-eventhubs-starter/src/main/java/org/apache/camel/component/azure/eventhubs/springboot/EventHubsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.azure.core.amqp.AmqpRetryOptions": return applicationContext.getBean(ref, com.azure.core.amqp.AmqpRetryOptions.class);
            case "org.apache.camel.component.azure.eventhubs.EventHubsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.eventhubs.EventHubsConfiguration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.azure.eventhubs.EventHubsConfiguration"` is unreachable
in `components-starter/camel-azure-eventhubs-starter/src/main/java/org/apache/camel/component/azure/eventhubs/springboot/EventHubsComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "com.azure.core.amqp.AmqpRetryOptions": return applicationContext.getBean(ref, com.azure.core.amqp.AmqpRetryOptions.class);
            case "org.apache.camel.component.azure.eventhubs.EventHubsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.eventhubs.EventHubsConfiguration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "com.azure.messaging.eventhubs.CheckpointStore": return applicationContext.getBean(ref, com.azure.messaging.eventhubs.CheckpointStore.class);
```

### DataFlowIssue
Switch label `"com.azure.storage.common.StorageSharedKeyCredential"` is unreachable
in `components-starter/camel-azure-eventhubs-starter/src/main/java/org/apache/camel/component/azure/eventhubs/springboot/EventHubsComponentConverter.java`
#### Snippet
```java
            case "com.azure.core.amqp.AmqpRetryOptions": return applicationContext.getBean(ref, com.azure.core.amqp.AmqpRetryOptions.class);
            case "org.apache.camel.component.azure.eventhubs.EventHubsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.eventhubs.EventHubsConfiguration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "com.azure.messaging.eventhubs.CheckpointStore": return applicationContext.getBean(ref, com.azure.messaging.eventhubs.CheckpointStore.class);
            case "com.azure.messaging.eventhubs.EventHubProducerAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class);
```

### DataFlowIssue
Switch label `"com.azure.messaging.eventhubs.CheckpointStore"` is unreachable
in `components-starter/camel-azure-eventhubs-starter/src/main/java/org/apache/camel/component/azure/eventhubs/springboot/EventHubsComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.azure.eventhubs.EventHubsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.eventhubs.EventHubsConfiguration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "com.azure.messaging.eventhubs.CheckpointStore": return applicationContext.getBean(ref, com.azure.messaging.eventhubs.CheckpointStore.class);
            case "com.azure.messaging.eventhubs.EventHubProducerAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class);
            case "com.azure.core.credential.TokenCredential": return applicationContext.getBean(ref, com.azure.core.credential.TokenCredential.class);
```

### DataFlowIssue
Switch label `"com.azure.messaging.eventhubs.EventHubProducerAsyncClient"` is unreachable
in `components-starter/camel-azure-eventhubs-starter/src/main/java/org/apache/camel/component/azure/eventhubs/springboot/EventHubsComponentConverter.java`
#### Snippet
```java
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "com.azure.messaging.eventhubs.CheckpointStore": return applicationContext.getBean(ref, com.azure.messaging.eventhubs.CheckpointStore.class);
            case "com.azure.messaging.eventhubs.EventHubProducerAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class);
            case "com.azure.core.credential.TokenCredential": return applicationContext.getBean(ref, com.azure.core.credential.TokenCredential.class);
        }
```

### DataFlowIssue
Switch label `"com.azure.core.credential.TokenCredential"` is unreachable
in `components-starter/camel-azure-eventhubs-starter/src/main/java/org/apache/camel/component/azure/eventhubs/springboot/EventHubsComponentConverter.java`
#### Snippet
```java
            case "com.azure.messaging.eventhubs.CheckpointStore": return applicationContext.getBean(ref, com.azure.messaging.eventhubs.CheckpointStore.class);
            case "com.azure.messaging.eventhubs.EventHubProducerAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class);
            case "com.azure.core.credential.TokenCredential": return applicationContext.getBean(ref, com.azure.core.credential.TokenCredential.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-cxf-rest-starter/src/main/java/org/apache/camel/component/cxf/jaxrs/springboot/CxfRsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"javax.sql.DataSource"` is unreachable
in `components-starter/camel-jdbc-starter/src/main/java/org/apache/camel/component/jdbc/springboot/JdbcComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.sql.DataSource": return applicationContext.getBean(ref, javax.sql.DataSource.class);
            case "org.apache.camel.component.jdbc.ConnectionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jdbc.ConnectionStrategy.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jdbc.ConnectionStrategy"` is unreachable
in `components-starter/camel-jdbc-starter/src/main/java/org/apache/camel/component/jdbc/springboot/JdbcComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "javax.sql.DataSource": return applicationContext.getBean(ref, javax.sql.DataSource.class);
            case "org.apache.camel.component.jdbc.ConnectionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jdbc.ConnectionStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"javax.sql.DataSource"` is unreachable
in `components-starter/camel-spring-jdbc-starter/src/main/java/org/apache/camel/component/spring/jdbc/springboot/SpringJdbcComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.sql.DataSource": return applicationContext.getBean(ref, javax.sql.DataSource.class);
            case "org.apache.camel.component.jdbc.ConnectionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jdbc.ConnectionStrategy.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jdbc.ConnectionStrategy"` is unreachable
in `components-starter/camel-spring-jdbc-starter/src/main/java/org/apache/camel/component/spring/jdbc/springboot/SpringJdbcComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "javax.sql.DataSource": return applicationContext.getBean(ref, javax.sql.DataSource.class);
            case "org.apache.camel.component.jdbc.ConnectionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jdbc.ConnectionStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration"` is unreachable
in `components-starter/camel-azure-cosmosdb-starter/src/main/java/org/apache/camel/component/azure/cosmosdb/springboot/CosmosDbComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration.class);
            case "com.azure.cosmos.CosmosAsyncClient": return applicationContext.getBean(ref, com.azure.cosmos.CosmosAsyncClient.class);
            case "com.azure.cosmos.models.ThroughputProperties": return applicationContext.getBean(ref, com.azure.cosmos.models.ThroughputProperties.class);
```

### DataFlowIssue
Switch label `"com.azure.cosmos.CosmosAsyncClient"` is unreachable
in `components-starter/camel-azure-cosmosdb-starter/src/main/java/org/apache/camel/component/azure/cosmosdb/springboot/CosmosDbComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration.class);
            case "com.azure.cosmos.CosmosAsyncClient": return applicationContext.getBean(ref, com.azure.cosmos.CosmosAsyncClient.class);
            case "com.azure.cosmos.models.ThroughputProperties": return applicationContext.getBean(ref, com.azure.cosmos.models.ThroughputProperties.class);
            case "com.azure.cosmos.models.ChangeFeedProcessorOptions": return applicationContext.getBean(ref, com.azure.cosmos.models.ChangeFeedProcessorOptions.class);
```

### DataFlowIssue
Switch label `"com.azure.cosmos.models.ThroughputProperties"` is unreachable
in `components-starter/camel-azure-cosmosdb-starter/src/main/java/org/apache/camel/component/azure/cosmosdb/springboot/CosmosDbComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration.class);
            case "com.azure.cosmos.CosmosAsyncClient": return applicationContext.getBean(ref, com.azure.cosmos.CosmosAsyncClient.class);
            case "com.azure.cosmos.models.ThroughputProperties": return applicationContext.getBean(ref, com.azure.cosmos.models.ThroughputProperties.class);
            case "com.azure.cosmos.models.ChangeFeedProcessorOptions": return applicationContext.getBean(ref, com.azure.cosmos.models.ChangeFeedProcessorOptions.class);
            case "com.azure.cosmos.models.CosmosQueryRequestOptions": return applicationContext.getBean(ref, com.azure.cosmos.models.CosmosQueryRequestOptions.class);
```

### DataFlowIssue
Switch label `"com.azure.cosmos.models.ChangeFeedProcessorOptions"` is unreachable
in `components-starter/camel-azure-cosmosdb-starter/src/main/java/org/apache/camel/component/azure/cosmosdb/springboot/CosmosDbComponentConverter.java`
#### Snippet
```java
            case "com.azure.cosmos.CosmosAsyncClient": return applicationContext.getBean(ref, com.azure.cosmos.CosmosAsyncClient.class);
            case "com.azure.cosmos.models.ThroughputProperties": return applicationContext.getBean(ref, com.azure.cosmos.models.ThroughputProperties.class);
            case "com.azure.cosmos.models.ChangeFeedProcessorOptions": return applicationContext.getBean(ref, com.azure.cosmos.models.ChangeFeedProcessorOptions.class);
            case "com.azure.cosmos.models.CosmosQueryRequestOptions": return applicationContext.getBean(ref, com.azure.cosmos.models.CosmosQueryRequestOptions.class);
        }
```

### DataFlowIssue
Switch label `"com.azure.cosmos.models.CosmosQueryRequestOptions"` is unreachable
in `components-starter/camel-azure-cosmosdb-starter/src/main/java/org/apache/camel/component/azure/cosmosdb/springboot/CosmosDbComponentConverter.java`
#### Snippet
```java
            case "com.azure.cosmos.models.ThroughputProperties": return applicationContext.getBean(ref, com.azure.cosmos.models.ThroughputProperties.class);
            case "com.azure.cosmos.models.ChangeFeedProcessorOptions": return applicationContext.getBean(ref, com.azure.cosmos.models.ChangeFeedProcessorOptions.class);
            case "com.azure.cosmos.models.CosmosQueryRequestOptions": return applicationContext.getBean(ref, com.azure.cosmos.models.CosmosQueryRequestOptions.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.facebook.config.FacebookConfiguration"` is unreachable
in `components-starter/camel-facebook-starter/src/main/java/org/apache/camel/component/facebook/springboot/FacebookComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.facebook.config.FacebookConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.facebook.config.FacebookConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.drive.GoogleDriveConfiguration"` is unreachable
in `components-starter/camel-google-drive-starter/src/main/java/org/apache/camel/component/google/drive/springboot/GoogleDriveComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.drive.GoogleDriveConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.drive.GoogleDriveConfiguration.class);
            case "org.apache.camel.component.google.drive.GoogleDriveClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.drive.GoogleDriveClientFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.drive.GoogleDriveClientFactory"` is unreachable
in `components-starter/camel-google-drive-starter/src/main/java/org/apache/camel/component/google/drive/springboot/GoogleDriveComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.drive.GoogleDriveConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.drive.GoogleDriveConfiguration.class);
            case "org.apache.camel.component.google.drive.GoogleDriveClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.drive.GoogleDriveClientFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.jgroups.JChannel"` is unreachable
in `components-starter/camel-jgroups-starter/src/main/java/org/apache/camel/component/jgroups/springboot/JGroupsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.jgroups.JChannel": return applicationContext.getBean(ref, org.jgroups.JChannel.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.ExchangeFormatter"` is unreachable
in `components-starter/camel-mock-starter/src/main/java/org/apache/camel/component/mock/springboot/MockComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.ExchangeFormatter": return applicationContext.getBean(ref, org.apache.camel.spi.ExchangeFormatter.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.ExchangeFormatter"` is unreachable
in `components-starter/camel-log-starter/src/main/java/org/apache/camel/component/log/springboot/LogComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.ExchangeFormatter": return applicationContext.getBean(ref, org.apache.camel.spi.ExchangeFormatter.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"net.sf.saxon.Configuration"` is unreachable
in `components-starter/camel-xslt-saxon-starter/src/main/java/org/apache/camel/component/xslt/saxon/springboot/XsltSaxonComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "net.sf.saxon.Configuration": return applicationContext.getBean(ref, net.sf.saxon.Configuration.class);
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy"` is unreachable
in `components-starter/camel-xslt-saxon-starter/src/main/java/org/apache/camel/component/xslt/saxon/springboot/XsltSaxonComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "net.sf.saxon.Configuration": return applicationContext.getBean(ref, net.sf.saxon.Configuration.class);
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
```

### DataFlowIssue
Switch label `"javax.xml.transform.URIResolver"` is unreachable
in `components-starter/camel-xslt-saxon-starter/src/main/java/org/apache/camel/component/xslt/saxon/springboot/XsltSaxonComponentConverter.java`
#### Snippet
```java
            case "net.sf.saxon.Configuration": return applicationContext.getBean(ref, net.sf.saxon.Configuration.class);
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xslt.XsltUriResolverFactory"` is unreachable
in `components-starter/camel-xslt-saxon-starter/src/main/java/org/apache/camel/component/xslt/saxon/springboot/XsltSaxonComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jooq.JooqConfiguration"` is unreachable
in `components-starter/camel-jooq-starter/src/main/java/org/apache/camel/component/jooq/springboot/JooqComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.jooq.JooqConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jooq.JooqConfiguration.class);
            case "org.jooq.Configuration": return applicationContext.getBean(ref, org.jooq.Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.jooq.Configuration"` is unreachable
in `components-starter/camel-jooq-starter/src/main/java/org/apache/camel/component/jooq/springboot/JooqComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.jooq.JooqConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jooq.JooqConfiguration.class);
            case "org.jooq.Configuration": return applicationContext.getBean(ref, org.jooq.Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.springframework.batch.core.launch.JobLauncher"` is unreachable
in `components-starter/camel-spring-batch-starter/src/main/java/org/apache/camel/component/spring/batch/springboot/SpringBatchComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.springframework.batch.core.launch.JobLauncher": return applicationContext.getBean(ref, org.springframework.batch.core.launch.JobLauncher.class);
            case "org.springframework.batch.core.configuration.JobRegistry": return applicationContext.getBean(ref, org.springframework.batch.core.configuration.JobRegistry.class);
        }
```

### DataFlowIssue
Switch label `"org.springframework.batch.core.configuration.JobRegistry"` is unreachable
in `components-starter/camel-spring-batch-starter/src/main/java/org/apache/camel/component/spring/batch/springboot/SpringBatchComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.springframework.batch.core.launch.JobLauncher": return applicationContext.getBean(ref, org.springframework.batch.core.launch.JobLauncher.class);
            case "org.springframework.batch.core.configuration.JobRegistry": return applicationContext.getBean(ref, org.springframework.batch.core.configuration.JobRegistry.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"jakarta.validation.ConstraintValidatorFactory"` is unreachable
in `components-starter/camel-bean-validator-starter/src/main/java/org/apache/camel/component/bean/validator/springboot/BeanValidatorComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "jakarta.validation.ConstraintValidatorFactory": return applicationContext.getBean(ref, jakarta.validation.ConstraintValidatorFactory.class);
            case "jakarta.validation.MessageInterpolator": return applicationContext.getBean(ref, jakarta.validation.MessageInterpolator.class);
            case "jakarta.validation.TraversableResolver": return applicationContext.getBean(ref, jakarta.validation.TraversableResolver.class);
```

### DataFlowIssue
Switch label `"jakarta.validation.MessageInterpolator"` is unreachable
in `components-starter/camel-bean-validator-starter/src/main/java/org/apache/camel/component/bean/validator/springboot/BeanValidatorComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "jakarta.validation.ConstraintValidatorFactory": return applicationContext.getBean(ref, jakarta.validation.ConstraintValidatorFactory.class);
            case "jakarta.validation.MessageInterpolator": return applicationContext.getBean(ref, jakarta.validation.MessageInterpolator.class);
            case "jakarta.validation.TraversableResolver": return applicationContext.getBean(ref, jakarta.validation.TraversableResolver.class);
            case "jakarta.validation.ValidationProviderResolver": return applicationContext.getBean(ref, jakarta.validation.ValidationProviderResolver.class);
```

### DataFlowIssue
Switch label `"jakarta.validation.TraversableResolver"` is unreachable
in `components-starter/camel-bean-validator-starter/src/main/java/org/apache/camel/component/bean/validator/springboot/BeanValidatorComponentConverter.java`
#### Snippet
```java
            case "jakarta.validation.ConstraintValidatorFactory": return applicationContext.getBean(ref, jakarta.validation.ConstraintValidatorFactory.class);
            case "jakarta.validation.MessageInterpolator": return applicationContext.getBean(ref, jakarta.validation.MessageInterpolator.class);
            case "jakarta.validation.TraversableResolver": return applicationContext.getBean(ref, jakarta.validation.TraversableResolver.class);
            case "jakarta.validation.ValidationProviderResolver": return applicationContext.getBean(ref, jakarta.validation.ValidationProviderResolver.class);
            case "jakarta.validation.ValidatorFactory": return applicationContext.getBean(ref, jakarta.validation.ValidatorFactory.class);
```

### DataFlowIssue
Switch label `"jakarta.validation.ValidationProviderResolver"` is unreachable
in `components-starter/camel-bean-validator-starter/src/main/java/org/apache/camel/component/bean/validator/springboot/BeanValidatorComponentConverter.java`
#### Snippet
```java
            case "jakarta.validation.MessageInterpolator": return applicationContext.getBean(ref, jakarta.validation.MessageInterpolator.class);
            case "jakarta.validation.TraversableResolver": return applicationContext.getBean(ref, jakarta.validation.TraversableResolver.class);
            case "jakarta.validation.ValidationProviderResolver": return applicationContext.getBean(ref, jakarta.validation.ValidationProviderResolver.class);
            case "jakarta.validation.ValidatorFactory": return applicationContext.getBean(ref, jakarta.validation.ValidatorFactory.class);
        }
```

### DataFlowIssue
Switch label `"jakarta.validation.ValidatorFactory"` is unreachable
in `components-starter/camel-bean-validator-starter/src/main/java/org/apache/camel/component/bean/validator/springboot/BeanValidatorComponentConverter.java`
#### Snippet
```java
            case "jakarta.validation.TraversableResolver": return applicationContext.getBean(ref, jakarta.validation.TraversableResolver.class);
            case "jakarta.validation.ValidationProviderResolver": return applicationContext.getBean(ref, jakarta.validation.ValidationProviderResolver.class);
            case "jakarta.validation.ValidatorFactory": return applicationContext.getBean(ref, jakarta.validation.ValidatorFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.seda.BlockingQueueFactory"` is unreachable
in `components-starter/camel-stub-starter/src/main/java/org/apache/camel/component/stub/springboot/StubComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.seda.BlockingQueueFactory": return applicationContext.getBean(ref, org.apache.camel.component.seda.BlockingQueueFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.cometd.bayeux.server.SecurityPolicy"` is unreachable
in `components-starter/camel-cometd-starter/src/main/java/org/apache/camel/component/cometd/springboot/CometdComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.cometd.bayeux.server.SecurityPolicy": return applicationContext.getBean(ref, org.cometd.bayeux.server.SecurityPolicy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-cometd-starter/src/main/java/org/apache/camel/component/cometd/springboot/CometdComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.cometd.bayeux.server.SecurityPolicy": return applicationContext.getBean(ref, org.cometd.bayeux.server.SecurityPolicy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.disruptor.DisruptorWaitStrategy"` is unreachable
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/springboot/DisruptorComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.disruptor.DisruptorWaitStrategy": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorWaitStrategy.class);
            case "org.apache.camel.component.disruptor.DisruptorProducerType": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorProducerType.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.disruptor.DisruptorProducerType"` is unreachable
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/springboot/DisruptorComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.disruptor.DisruptorWaitStrategy": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorWaitStrategy.class);
            case "org.apache.camel.component.disruptor.DisruptorProducerType": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorProducerType.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.disruptor.DisruptorWaitStrategy"` is unreachable
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/vm/springboot/DisruptorVmComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.disruptor.DisruptorWaitStrategy": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorWaitStrategy.class);
            case "org.apache.camel.component.disruptor.DisruptorProducerType": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorProducerType.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.disruptor.DisruptorProducerType"` is unreachable
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/vm/springboot/DisruptorVmComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.disruptor.DisruptorWaitStrategy": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorWaitStrategy.class);
            case "org.apache.camel.component.disruptor.DisruptorProducerType": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorProducerType.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.olingo2.Olingo2Configuration"` is unreachable
in `components-starter/camel-olingo2-starter/src/main/java/org/apache/camel/component/olingo2/springboot/Olingo2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.olingo2.Olingo2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.olingo2.Olingo2Configuration.class);
            case "org.apache.olingo.odata2.api.ep.EntityProviderReadProperties": return applicationContext.getBean(ref, org.apache.olingo.odata2.api.ep.EntityProviderReadProperties.class);
            case "org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties": return applicationContext.getBean(ref, org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class);
```

### DataFlowIssue
Switch label `"org.apache.olingo.odata2.api.ep.EntityProviderReadProperties"` is unreachable
in `components-starter/camel-olingo2-starter/src/main/java/org/apache/camel/component/olingo2/springboot/Olingo2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.olingo2.Olingo2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.olingo2.Olingo2Configuration.class);
            case "org.apache.olingo.odata2.api.ep.EntityProviderReadProperties": return applicationContext.getBean(ref, org.apache.olingo.odata2.api.ep.EntityProviderReadProperties.class);
            case "org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties": return applicationContext.getBean(ref, org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class);
            case "org.apache.http.HttpHost": return applicationContext.getBean(ref, org.apache.http.HttpHost.class);
```

### DataFlowIssue
Switch label `"org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties"` is unreachable
in `components-starter/camel-olingo2-starter/src/main/java/org/apache/camel/component/olingo2/springboot/Olingo2ComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.olingo2.Olingo2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.olingo2.Olingo2Configuration.class);
            case "org.apache.olingo.odata2.api.ep.EntityProviderReadProperties": return applicationContext.getBean(ref, org.apache.olingo.odata2.api.ep.EntityProviderReadProperties.class);
            case "org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties": return applicationContext.getBean(ref, org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class);
            case "org.apache.http.HttpHost": return applicationContext.getBean(ref, org.apache.http.HttpHost.class);
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
```

### DataFlowIssue
Switch label `"org.apache.http.HttpHost"` is unreachable
in `components-starter/camel-olingo2-starter/src/main/java/org/apache/camel/component/olingo2/springboot/Olingo2ComponentConverter.java`
#### Snippet
```java
            case "org.apache.olingo.odata2.api.ep.EntityProviderReadProperties": return applicationContext.getBean(ref, org.apache.olingo.odata2.api.ep.EntityProviderReadProperties.class);
            case "org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties": return applicationContext.getBean(ref, org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class);
            case "org.apache.http.HttpHost": return applicationContext.getBean(ref, org.apache.http.HttpHost.class);
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
            case "org.apache.http.impl.client.HttpClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.client.HttpClientBuilder.class);
```

### DataFlowIssue
Switch label `"org.apache.http.impl.nio.client.HttpAsyncClientBuilder"` is unreachable
in `components-starter/camel-olingo2-starter/src/main/java/org/apache/camel/component/olingo2/springboot/Olingo2ComponentConverter.java`
#### Snippet
```java
            case "org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties": return applicationContext.getBean(ref, org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class);
            case "org.apache.http.HttpHost": return applicationContext.getBean(ref, org.apache.http.HttpHost.class);
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
            case "org.apache.http.impl.client.HttpClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.client.HttpClientBuilder.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.http.impl.client.HttpClientBuilder"` is unreachable
in `components-starter/camel-olingo2-starter/src/main/java/org/apache/camel/component/olingo2/springboot/Olingo2ComponentConverter.java`
#### Snippet
```java
            case "org.apache.http.HttpHost": return applicationContext.getBean(ref, org.apache.http.HttpHost.class);
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
            case "org.apache.http.impl.client.HttpClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.client.HttpClientBuilder.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-olingo2-starter/src/main/java/org/apache/camel/component/olingo2/springboot/Olingo2ComponentConverter.java`
#### Snippet
```java
            case "org.apache.http.impl.nio.client.HttpAsyncClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
            case "org.apache.http.impl.client.HttpClientBuilder": return applicationContext.getBean(ref, org.apache.http.impl.client.HttpClientBuilder.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.jgroups.raft.RaftHandle"` is unreachable
in `components-starter/camel-jgroups-raft-starter/src/main/java/org/apache/camel/component/jgroups/raft/springboot/JGroupsRaftComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.jgroups.raft.RaftHandle": return applicationContext.getBean(ref, org.jgroups.raft.RaftHandle.class);
            case "org.jgroups.protocols.raft.StateMachine": return applicationContext.getBean(ref, org.jgroups.protocols.raft.StateMachine.class);
        }
```

### DataFlowIssue
Switch label `"org.jgroups.protocols.raft.StateMachine"` is unreachable
in `components-starter/camel-jgroups-raft-starter/src/main/java/org/apache/camel/component/jgroups/raft/springboot/JGroupsRaftComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.jgroups.raft.RaftHandle": return applicationContext.getBean(ref, org.jgroups.raft.RaftHandle.class);
            case "org.jgroups.protocols.raft.StateMachine": return applicationContext.getBean(ref, org.jgroups.protocols.raft.StateMachine.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.vertx.core.Vertx"` is unreachable
in `components-starter/camel-vertx-http-starter/src/main/java/org/apache/camel/component/vertx/http/springboot/VertxHttpComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.vertx.core.Vertx": return applicationContext.getBean(ref, io.vertx.core.Vertx.class);
            case "org.apache.camel.component.vertx.http.VertxHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.vertx.http.VertxHttpBinding.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.vertx.http.VertxHttpBinding"` is unreachable
in `components-starter/camel-vertx-http-starter/src/main/java/org/apache/camel/component/vertx/http/springboot/VertxHttpComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "io.vertx.core.Vertx": return applicationContext.getBean(ref, io.vertx.core.Vertx.class);
            case "org.apache.camel.component.vertx.http.VertxHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.vertx.http.VertxHttpBinding.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
            case "io.vertx.ext.web.client.WebClientOptions": return applicationContext.getBean(ref, io.vertx.ext.web.client.WebClientOptions.class);
```

### DataFlowIssue
Switch label `"io.vertx.core.VertxOptions"` is unreachable
in `components-starter/camel-vertx-http-starter/src/main/java/org/apache/camel/component/vertx/http/springboot/VertxHttpComponentConverter.java`
#### Snippet
```java
            case "io.vertx.core.Vertx": return applicationContext.getBean(ref, io.vertx.core.Vertx.class);
            case "org.apache.camel.component.vertx.http.VertxHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.vertx.http.VertxHttpBinding.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
            case "io.vertx.ext.web.client.WebClientOptions": return applicationContext.getBean(ref, io.vertx.ext.web.client.WebClientOptions.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"io.vertx.ext.web.client.WebClientOptions"` is unreachable
in `components-starter/camel-vertx-http-starter/src/main/java/org/apache/camel/component/vertx/http/springboot/VertxHttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.vertx.http.VertxHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.vertx.http.VertxHttpBinding.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
            case "io.vertx.ext.web.client.WebClientOptions": return applicationContext.getBean(ref, io.vertx.ext.web.client.WebClientOptions.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-vertx-http-starter/src/main/java/org/apache/camel/component/vertx/http/springboot/VertxHttpComponentConverter.java`
#### Snippet
```java
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
            case "io.vertx.ext.web.client.WebClientOptions": return applicationContext.getBean(ref, io.vertx.ext.web.client.WebClientOptions.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-vertx-http-starter/src/main/java/org/apache/camel/component/vertx/http/springboot/VertxHttpComponentConverter.java`
#### Snippet
```java
            case "io.vertx.ext.web.client.WebClientOptions": return applicationContext.getBean(ref, io.vertx.ext.web.client.WebClientOptions.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"java.time.Duration"` is unreachable
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/ConsulComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.orbitz.consul.Consul": return applicationContext.getBean(ref, com.orbitz.consul.Consul.class);
            case "org.apache.camel.component.consul.ConsulConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.consul.ConsulConfiguration.class);
```

### DataFlowIssue
Switch label `"com.orbitz.consul.Consul"` is unreachable
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/ConsulComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.orbitz.consul.Consul": return applicationContext.getBean(ref, com.orbitz.consul.Consul.class);
            case "org.apache.camel.component.consul.ConsulConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.consul.ConsulConfiguration.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.consul.ConsulConfiguration"` is unreachable
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/ConsulComponentConverter.java`
#### Snippet
```java
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.orbitz.consul.Consul": return applicationContext.getBean(ref, com.orbitz.consul.Consul.class);
            case "org.apache.camel.component.consul.ConsulConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.consul.ConsulConfiguration.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "java.math.BigInteger": return applicationContext.getBean(ref, java.math.BigInteger.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/ConsulComponentConverter.java`
#### Snippet
```java
            case "com.orbitz.consul.Consul": return applicationContext.getBean(ref, com.orbitz.consul.Consul.class);
            case "org.apache.camel.component.consul.ConsulConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.consul.ConsulConfiguration.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "java.math.BigInteger": return applicationContext.getBean(ref, java.math.BigInteger.class);
        }
```

### DataFlowIssue
Switch label `"java.math.BigInteger"` is unreachable
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/ConsulComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.consul.ConsulConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.consul.ConsulConfiguration.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "java.math.BigInteger": return applicationContext.getBean(ref, java.math.BigInteger.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.cloudtrail.CloudTrailClient"` is unreachable
in `components-starter/camel-aws-cloudtrail-starter/src/main/java/org/apache/camel/component/aws/cloudtrail/springboot/CloudtrailComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.cloudtrail.CloudTrailClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.cloudtrail.CloudTrailClient.class);
            case "org.apache.camel.component.aws.cloudtrail.CloudtrailConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.aws.cloudtrail.CloudtrailConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws.cloudtrail.CloudtrailConfiguration"` is unreachable
in `components-starter/camel-aws-cloudtrail-starter/src/main/java/org/apache/camel/component/aws/cloudtrail/springboot/CloudtrailComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.cloudtrail.CloudTrailClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.cloudtrail.CloudTrailClient.class);
            case "org.apache.camel.component.aws.cloudtrail.CloudtrailConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.aws.cloudtrail.CloudtrailConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.azure.core.amqp.AmqpRetryOptions"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.azure.core.amqp.AmqpRetryOptions": return applicationContext.getBean(ref, com.azure.core.amqp.AmqpRetryOptions.class);
            case "com.azure.core.util.ClientOptions": return applicationContext.getBean(ref, com.azure.core.util.ClientOptions.class);
            case "org.apache.camel.component.azure.servicebus.ServiceBusConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.servicebus.ServiceBusConfiguration.class);
```

### DataFlowIssue
Switch label `"com.azure.core.util.ClientOptions"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "com.azure.core.amqp.AmqpRetryOptions": return applicationContext.getBean(ref, com.azure.core.amqp.AmqpRetryOptions.class);
            case "com.azure.core.util.ClientOptions": return applicationContext.getBean(ref, com.azure.core.util.ClientOptions.class);
            case "org.apache.camel.component.azure.servicebus.ServiceBusConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.servicebus.ServiceBusConfiguration.class);
            case "com.azure.core.amqp.ProxyOptions": return applicationContext.getBean(ref, com.azure.core.amqp.ProxyOptions.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.azure.servicebus.ServiceBusConfiguration"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
            case "com.azure.core.amqp.AmqpRetryOptions": return applicationContext.getBean(ref, com.azure.core.amqp.AmqpRetryOptions.class);
            case "com.azure.core.util.ClientOptions": return applicationContext.getBean(ref, com.azure.core.util.ClientOptions.class);
            case "org.apache.camel.component.azure.servicebus.ServiceBusConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.servicebus.ServiceBusConfiguration.class);
            case "com.azure.core.amqp.ProxyOptions": return applicationContext.getBean(ref, com.azure.core.amqp.ProxyOptions.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
```

### DataFlowIssue
Switch label `"com.azure.core.amqp.ProxyOptions"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
            case "com.azure.core.util.ClientOptions": return applicationContext.getBean(ref, com.azure.core.util.ClientOptions.class);
            case "org.apache.camel.component.azure.servicebus.ServiceBusConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.servicebus.ServiceBusConfiguration.class);
            case "com.azure.core.amqp.ProxyOptions": return applicationContext.getBean(ref, com.azure.core.amqp.ProxyOptions.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient.class);
```

### DataFlowIssue
Switch label `"java.time.Duration"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.azure.servicebus.ServiceBusConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.servicebus.ServiceBusConfiguration.class);
            case "com.azure.core.amqp.ProxyOptions": return applicationContext.getBean(ref, com.azure.core.amqp.ProxyOptions.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient.class);
            case "java.time.OffsetDateTime": return applicationContext.getBean(ref, java.time.OffsetDateTime.class);
```

### DataFlowIssue
Switch label `"com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
            case "com.azure.core.amqp.ProxyOptions": return applicationContext.getBean(ref, com.azure.core.amqp.ProxyOptions.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient.class);
            case "java.time.OffsetDateTime": return applicationContext.getBean(ref, java.time.OffsetDateTime.class);
            case "com.azure.messaging.servicebus.ServiceBusSenderAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusSenderAsyncClient.class);
```

### DataFlowIssue
Switch label `"java.time.OffsetDateTime"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient.class);
            case "java.time.OffsetDateTime": return applicationContext.getBean(ref, java.time.OffsetDateTime.class);
            case "com.azure.messaging.servicebus.ServiceBusSenderAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusSenderAsyncClient.class);
            case "com.azure.messaging.servicebus.ServiceBusTransactionContext": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusTransactionContext.class);
```

### DataFlowIssue
Switch label `"com.azure.messaging.servicebus.ServiceBusSenderAsyncClient"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
            case "com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient.class);
            case "java.time.OffsetDateTime": return applicationContext.getBean(ref, java.time.OffsetDateTime.class);
            case "com.azure.messaging.servicebus.ServiceBusSenderAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusSenderAsyncClient.class);
            case "com.azure.messaging.servicebus.ServiceBusTransactionContext": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusTransactionContext.class);
            case "com.azure.core.credential.TokenCredential": return applicationContext.getBean(ref, com.azure.core.credential.TokenCredential.class);
```

### DataFlowIssue
Switch label `"com.azure.messaging.servicebus.ServiceBusTransactionContext"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
            case "java.time.OffsetDateTime": return applicationContext.getBean(ref, java.time.OffsetDateTime.class);
            case "com.azure.messaging.servicebus.ServiceBusSenderAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusSenderAsyncClient.class);
            case "com.azure.messaging.servicebus.ServiceBusTransactionContext": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusTransactionContext.class);
            case "com.azure.core.credential.TokenCredential": return applicationContext.getBean(ref, com.azure.core.credential.TokenCredential.class);
        }
```

### DataFlowIssue
Switch label `"com.azure.core.credential.TokenCredential"` is unreachable
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConverter.java`
#### Snippet
```java
            case "com.azure.messaging.servicebus.ServiceBusSenderAsyncClient": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusSenderAsyncClient.class);
            case "com.azure.messaging.servicebus.ServiceBusTransactionContext": return applicationContext.getBean(ref, com.azure.messaging.servicebus.ServiceBusTransactionContext.class);
            case "com.azure.core.credential.TokenCredential": return applicationContext.getBean(ref, com.azure.core.credential.TokenCredential.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.springframework.amqp.core.AmqpAdmin"` is unreachable
in `components-starter/camel-spring-rabbitmq-starter/src/main/java/org/apache/camel/component/springrabbit/springboot/SpringRabbitMQComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.springframework.amqp.core.AmqpAdmin": return applicationContext.getBean(ref, org.springframework.amqp.core.AmqpAdmin.class);
            case "org.springframework.amqp.rabbit.connection.ConnectionFactory": return applicationContext.getBean(ref, org.springframework.amqp.rabbit.connection.ConnectionFactory.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
```

### DataFlowIssue
Switch label `"org.springframework.amqp.rabbit.connection.ConnectionFactory"` is unreachable
in `components-starter/camel-spring-rabbitmq-starter/src/main/java/org/apache/camel/component/springrabbit/springboot/SpringRabbitMQComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.springframework.amqp.core.AmqpAdmin": return applicationContext.getBean(ref, org.springframework.amqp.core.AmqpAdmin.class);
            case "org.springframework.amqp.rabbit.connection.ConnectionFactory": return applicationContext.getBean(ref, org.springframework.amqp.rabbit.connection.ConnectionFactory.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "org.apache.camel.component.springrabbit.ListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.springrabbit.ListenerContainerFactory.class);
```

### DataFlowIssue
Switch label `"org.springframework.util.ErrorHandler"` is unreachable
in `components-starter/camel-spring-rabbitmq-starter/src/main/java/org/apache/camel/component/springrabbit/springboot/SpringRabbitMQComponentConverter.java`
#### Snippet
```java
            case "org.springframework.amqp.core.AmqpAdmin": return applicationContext.getBean(ref, org.springframework.amqp.core.AmqpAdmin.class);
            case "org.springframework.amqp.rabbit.connection.ConnectionFactory": return applicationContext.getBean(ref, org.springframework.amqp.rabbit.connection.ConnectionFactory.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "org.apache.camel.component.springrabbit.ListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.springrabbit.ListenerContainerFactory.class);
            case "org.springframework.retry.interceptor.RetryOperationsInterceptor": return applicationContext.getBean(ref, org.springframework.retry.interceptor.RetryOperationsInterceptor.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.springrabbit.ListenerContainerFactory"` is unreachable
in `components-starter/camel-spring-rabbitmq-starter/src/main/java/org/apache/camel/component/springrabbit/springboot/SpringRabbitMQComponentConverter.java`
#### Snippet
```java
            case "org.springframework.amqp.rabbit.connection.ConnectionFactory": return applicationContext.getBean(ref, org.springframework.amqp.rabbit.connection.ConnectionFactory.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "org.apache.camel.component.springrabbit.ListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.springrabbit.ListenerContainerFactory.class);
            case "org.springframework.retry.interceptor.RetryOperationsInterceptor": return applicationContext.getBean(ref, org.springframework.retry.interceptor.RetryOperationsInterceptor.class);
            case "org.springframework.amqp.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.amqp.support.converter.MessageConverter.class);
```

### DataFlowIssue
Switch label `"org.springframework.retry.interceptor.RetryOperationsInterceptor"` is unreachable
in `components-starter/camel-spring-rabbitmq-starter/src/main/java/org/apache/camel/component/springrabbit/springboot/SpringRabbitMQComponentConverter.java`
#### Snippet
```java
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "org.apache.camel.component.springrabbit.ListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.springrabbit.ListenerContainerFactory.class);
            case "org.springframework.retry.interceptor.RetryOperationsInterceptor": return applicationContext.getBean(ref, org.springframework.retry.interceptor.RetryOperationsInterceptor.class);
            case "org.springframework.amqp.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.amqp.support.converter.MessageConverter.class);
            case "org.apache.camel.component.springrabbit.MessagePropertiesConverter": return applicationContext.getBean(ref, org.apache.camel.component.springrabbit.MessagePropertiesConverter.class);
```

### DataFlowIssue
Switch label `"org.springframework.amqp.support.converter.MessageConverter"` is unreachable
in `components-starter/camel-spring-rabbitmq-starter/src/main/java/org/apache/camel/component/springrabbit/springboot/SpringRabbitMQComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.springrabbit.ListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.springrabbit.ListenerContainerFactory.class);
            case "org.springframework.retry.interceptor.RetryOperationsInterceptor": return applicationContext.getBean(ref, org.springframework.retry.interceptor.RetryOperationsInterceptor.class);
            case "org.springframework.amqp.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.amqp.support.converter.MessageConverter.class);
            case "org.apache.camel.component.springrabbit.MessagePropertiesConverter": return applicationContext.getBean(ref, org.apache.camel.component.springrabbit.MessagePropertiesConverter.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.springrabbit.MessagePropertiesConverter"` is unreachable
in `components-starter/camel-spring-rabbitmq-starter/src/main/java/org/apache/camel/component/springrabbit/springboot/SpringRabbitMQComponentConverter.java`
#### Snippet
```java
            case "org.springframework.retry.interceptor.RetryOperationsInterceptor": return applicationContext.getBean(ref, org.springframework.retry.interceptor.RetryOperationsInterceptor.class);
            case "org.springframework.amqp.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.amqp.support.converter.MessageConverter.class);
            case "org.apache.camel.component.springrabbit.MessagePropertiesConverter": return applicationContext.getBean(ref, org.apache.camel.component.springrabbit.MessagePropertiesConverter.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-spring-rabbitmq-starter/src/main/java/org/apache/camel/component/springrabbit/springboot/SpringRabbitMQComponentConverter.java`
#### Snippet
```java
            case "org.springframework.amqp.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.amqp.support.converter.MessageConverter.class);
            case "org.apache.camel.component.springrabbit.MessagePropertiesConverter": return applicationContext.getBean(ref, org.apache.camel.component.springrabbit.MessagePropertiesConverter.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy"` is unreachable
in `components-starter/camel-xslt-starter/src/main/java/org/apache/camel/component/xslt/springboot/XsltComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
```

### DataFlowIssue
Switch label `"javax.xml.transform.URIResolver"` is unreachable
in `components-starter/camel-xslt-starter/src/main/java/org/apache/camel/component/xslt/springboot/XsltComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xslt.XsltUriResolverFactory"` is unreachable
in `components-starter/camel-xslt-starter/src/main/java/org/apache/camel/component/xslt/springboot/XsltComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"javax.xml.crypto.KeySelector"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlVerifierComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.xml.crypto.KeySelector": return applicationContext.getBean(ref, javax.xml.crypto.KeySelector.class);
            case "org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignature2Message": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlVerifierComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "javax.xml.crypto.KeySelector": return applicationContext.getBean(ref, javax.xml.crypto.KeySelector.class);
            case "org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignature2Message": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xmlsecurity.api.XmlSignature2Message"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlVerifierComponentConverter.java`
#### Snippet
```java
            case "javax.xml.crypto.KeySelector": return applicationContext.getBean(ref, javax.xml.crypto.KeySelector.class);
            case "org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignature2Message": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class);
            case "javax.xml.crypto.URIDereferencer": return applicationContext.getBean(ref, javax.xml.crypto.URIDereferencer.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlVerifierComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignature2Message": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class);
            case "javax.xml.crypto.URIDereferencer": return applicationContext.getBean(ref, javax.xml.crypto.URIDereferencer.class);
            case "org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration.class);
```

### DataFlowIssue
Switch label `"javax.xml.crypto.URIDereferencer"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlVerifierComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.xmlsecurity.api.XmlSignature2Message": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class);
            case "javax.xml.crypto.URIDereferencer": return applicationContext.getBean(ref, javax.xml.crypto.URIDereferencer.class);
            case "org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlVerifierComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class);
            case "javax.xml.crypto.URIDereferencer": return applicationContext.getBean(ref, javax.xml.crypto.URIDereferencer.class);
            case "org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"javax.xml.crypto.AlgorithmMethod"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.xml.crypto.AlgorithmMethod": return applicationContext.getBean(ref, javax.xml.crypto.AlgorithmMethod.class);
            case "org.apache.camel.component.xmlsecurity.api.KeyAccessor": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.KeyAccessor.class);
            case "javax.xml.crypto.dsig.spec.XPathFilterParameterSpec": return applicationContext.getBean(ref, javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xmlsecurity.api.KeyAccessor"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "javax.xml.crypto.AlgorithmMethod": return applicationContext.getBean(ref, javax.xml.crypto.AlgorithmMethod.class);
            case "org.apache.camel.component.xmlsecurity.api.KeyAccessor": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.KeyAccessor.class);
            case "javax.xml.crypto.dsig.spec.XPathFilterParameterSpec": return applicationContext.getBean(ref, javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class);
```

### DataFlowIssue
Switch label `"javax.xml.crypto.dsig.spec.XPathFilterParameterSpec"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConverter.java`
#### Snippet
```java
            case "javax.xml.crypto.AlgorithmMethod": return applicationContext.getBean(ref, javax.xml.crypto.AlgorithmMethod.class);
            case "org.apache.camel.component.xmlsecurity.api.KeyAccessor": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.KeyAccessor.class);
            case "javax.xml.crypto.dsig.spec.XPathFilterParameterSpec": return applicationContext.getBean(ref, javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class);
            case "org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.xmlsecurity.api.KeyAccessor": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.KeyAccessor.class);
            case "javax.xml.crypto.dsig.spec.XPathFilterParameterSpec": return applicationContext.getBean(ref, javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class);
            case "org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class);
            case "javax.xml.crypto.URIDereferencer": return applicationContext.getBean(ref, javax.xml.crypto.URIDereferencer.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConverter.java`
#### Snippet
```java
            case "javax.xml.crypto.dsig.spec.XPathFilterParameterSpec": return applicationContext.getBean(ref, javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class);
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class);
            case "org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class);
            case "javax.xml.crypto.URIDereferencer": return applicationContext.getBean(ref, javax.xml.crypto.URIDereferencer.class);
        }
```

### DataFlowIssue
Switch label `"javax.xml.crypto.URIDereferencer"` is unreachable
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class);
            case "org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class);
            case "javax.xml.crypto.URIDereferencer": return applicationContext.getBean(ref, javax.xml.crypto.URIDereferencer.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration"` is unreachable
in `components-starter/camel-infinispan-embedded-starter/src/main/java/org/apache/camel/component/infinispan/embedded/springboot/InfinispanEmbeddedComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration.class);
            case "org.apache.camel.component.infinispan.InfinispanQueryBuilder": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
            case "org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.infinispan.InfinispanQueryBuilder"` is unreachable
in `components-starter/camel-infinispan-embedded-starter/src/main/java/org/apache/camel/component/infinispan/embedded/springboot/InfinispanEmbeddedComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration.class);
            case "org.apache.camel.component.infinispan.InfinispanQueryBuilder": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
            case "org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener.class);
            case "org.infinispan.manager.EmbeddedCacheManager": return applicationContext.getBean(ref, org.infinispan.manager.EmbeddedCacheManager.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener"` is unreachable
in `components-starter/camel-infinispan-embedded-starter/src/main/java/org/apache/camel/component/infinispan/embedded/springboot/InfinispanEmbeddedComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration.class);
            case "org.apache.camel.component.infinispan.InfinispanQueryBuilder": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
            case "org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener.class);
            case "org.infinispan.manager.EmbeddedCacheManager": return applicationContext.getBean(ref, org.infinispan.manager.EmbeddedCacheManager.class);
            case "org.infinispan.configuration.cache.Configuration": return applicationContext.getBean(ref, org.infinispan.configuration.cache.Configuration.class);
```

### DataFlowIssue
Switch label `"org.infinispan.manager.EmbeddedCacheManager"` is unreachable
in `components-starter/camel-infinispan-embedded-starter/src/main/java/org/apache/camel/component/infinispan/embedded/springboot/InfinispanEmbeddedComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.infinispan.InfinispanQueryBuilder": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
            case "org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener.class);
            case "org.infinispan.manager.EmbeddedCacheManager": return applicationContext.getBean(ref, org.infinispan.manager.EmbeddedCacheManager.class);
            case "org.infinispan.configuration.cache.Configuration": return applicationContext.getBean(ref, org.infinispan.configuration.cache.Configuration.class);
            case "java.util.function.BiFunction": return applicationContext.getBean(ref, java.util.function.BiFunction.class);
```

### DataFlowIssue
Switch label `"org.infinispan.configuration.cache.Configuration"` is unreachable
in `components-starter/camel-infinispan-embedded-starter/src/main/java/org/apache/camel/component/infinispan/embedded/springboot/InfinispanEmbeddedComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener.class);
            case "org.infinispan.manager.EmbeddedCacheManager": return applicationContext.getBean(ref, org.infinispan.manager.EmbeddedCacheManager.class);
            case "org.infinispan.configuration.cache.Configuration": return applicationContext.getBean(ref, org.infinispan.configuration.cache.Configuration.class);
            case "java.util.function.BiFunction": return applicationContext.getBean(ref, java.util.function.BiFunction.class);
        }
```

### DataFlowIssue
Switch label `"java.util.function.BiFunction"` is unreachable
in `components-starter/camel-infinispan-embedded-starter/src/main/java/org/apache/camel/component/infinispan/embedded/springboot/InfinispanEmbeddedComponentConverter.java`
#### Snippet
```java
            case "org.infinispan.manager.EmbeddedCacheManager": return applicationContext.getBean(ref, org.infinispan.manager.EmbeddedCacheManager.class);
            case "org.infinispan.configuration.cache.Configuration": return applicationContext.getBean(ref, org.infinispan.configuration.cache.Configuration.class);
            case "java.util.function.BiFunction": return applicationContext.getBean(ref, java.util.function.BiFunction.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.ecs.ECS2Configuration"` is unreachable
in `components-starter/camel-aws2-ecs-starter/src/main/java/org/apache/camel/component/aws2/ecs/springboot/ECS2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.ecs.ECS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ecs.ECS2Configuration.class);
            case "software.amazon.awssdk.services.ecs.EcsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.ecs.EcsClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.ecs.EcsClient"` is unreachable
in `components-starter/camel-aws2-ecs-starter/src/main/java/org/apache/camel/component/aws2/ecs/springboot/ECS2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.ecs.ECS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ecs.ECS2Configuration.class);
            case "software.amazon.awssdk.services.ecs.EcsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.ecs.EcsClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.docker.DockerConfiguration"` is unreachable
in `components-starter/camel-docker-starter/src/main/java/org/apache/camel/component/docker/springboot/DockerComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.docker.DockerConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.docker.DockerConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.corda.CordaConfiguration"` is unreachable
in `components-starter/camel-corda-starter/src/main/java/org/apache/camel/component/corda/springboot/CordaComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.corda.CordaConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.corda.CordaConfiguration.class);
            case "net.corda.core.node.services.vault.PageSpecification": return applicationContext.getBean(ref, net.corda.core.node.services.vault.PageSpecification.class);
            case "net.corda.core.node.services.vault.QueryCriteria": return applicationContext.getBean(ref, net.corda.core.node.services.vault.QueryCriteria.class);
```

### DataFlowIssue
Switch label `"net.corda.core.node.services.vault.PageSpecification"` is unreachable
in `components-starter/camel-corda-starter/src/main/java/org/apache/camel/component/corda/springboot/CordaComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.corda.CordaConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.corda.CordaConfiguration.class);
            case "net.corda.core.node.services.vault.PageSpecification": return applicationContext.getBean(ref, net.corda.core.node.services.vault.PageSpecification.class);
            case "net.corda.core.node.services.vault.QueryCriteria": return applicationContext.getBean(ref, net.corda.core.node.services.vault.QueryCriteria.class);
        }
```

### DataFlowIssue
Switch label `"net.corda.core.node.services.vault.QueryCriteria"` is unreachable
in `components-starter/camel-corda-starter/src/main/java/org/apache/camel/component/corda/springboot/CordaComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.corda.CordaConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.corda.CordaConfiguration.class);
            case "net.corda.core.node.services.vault.PageSpecification": return applicationContext.getBean(ref, net.corda.core.node.services.vault.PageSpecification.class);
            case "net.corda.core.node.services.vault.QueryCriteria": return applicationContext.getBean(ref, net.corda.core.node.services.vault.QueryCriteria.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.grape.PatchesRepository"` is unreachable
in `components-starter/camel-grape-starter/src/main/java/org/apache/camel/component/grape/springboot/GrapeComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.grape.PatchesRepository": return applicationContext.getBean(ref, org.apache.camel.component.grape.PatchesRepository.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.braintree.BraintreeConfiguration"` is unreachable
in `components-starter/camel-braintree-starter/src/main/java/org/apache/camel/component/braintree/springboot/BraintreeComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.braintree.BraintreeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.braintree.BraintreeConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.elasticsearch.client.RestClient"` is unreachable
in `components-starter/camel-elasticsearch-starter/src/main/java/org/apache/camel/component/es/springboot/ElasticsearchComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.elasticsearch.client.RestClient": return applicationContext.getBean(ref, org.elasticsearch.client.RestClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.schibsted.spt.data.jslt.filters.JsonFilter"` is unreachable
in `components-starter/camel-jslt-starter/src/main/java/org/apache/camel/component/jslt/springboot/JsltComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.schibsted.spt.data.jslt.filters.JsonFilter": return applicationContext.getBean(ref, com.schibsted.spt.data.jslt.filters.JsonFilter.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.platform.http.spi.PlatformHttpEngine"` is unreachable
in `components-starter/camel-platform-http-starter/src/main/java/org/apache/camel/component/platform/http/springboot/PlatformHttpComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.platform.http.spi.PlatformHttpEngine": return applicationContext.getBean(ref, org.apache.camel.component.platform.http.spi.PlatformHttpEngine.class);
        }
        return null;
```

### DataFlowIssue
Argument `consumerPath` might be null
in `components-starter/camel-platform-http-starter/src/main/java/org/apache/camel/component/platform/http/springboot/SpringBootPlatformHttpBinding.java`
#### Snippet
```java
                consumerPath = consumerPath.substring(1);
            }
            if (useRestMatching(consumerPath)) {
                HttpHelper.evalPlaceholders(message.getHeaders(), path, consumerPath);
            }
```

### DataFlowIssue
Switch label `"org.ehcache.CacheManager"` is unreachable
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/EhcacheComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.ehcache.CacheManager": return applicationContext.getBean(ref, org.ehcache.CacheManager.class);
            case "org.ehcache.config.Configuration": return applicationContext.getBean(ref, org.ehcache.config.Configuration.class);
            case "org.ehcache.config.CacheConfiguration": return applicationContext.getBean(ref, org.ehcache.config.CacheConfiguration.class);
```

### DataFlowIssue
Switch label `"org.ehcache.config.Configuration"` is unreachable
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/EhcacheComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.ehcache.CacheManager": return applicationContext.getBean(ref, org.ehcache.CacheManager.class);
            case "org.ehcache.config.Configuration": return applicationContext.getBean(ref, org.ehcache.config.Configuration.class);
            case "org.ehcache.config.CacheConfiguration": return applicationContext.getBean(ref, org.ehcache.config.CacheConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.ehcache.config.CacheConfiguration"` is unreachable
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/EhcacheComponentConverter.java`
#### Snippet
```java
            case "org.ehcache.CacheManager": return applicationContext.getBean(ref, org.ehcache.CacheManager.class);
            case "org.ehcache.config.Configuration": return applicationContext.getBean(ref, org.ehcache.config.Configuration.class);
            case "org.ehcache.config.CacheConfiguration": return applicationContext.getBean(ref, org.ehcache.config.CacheConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.cluster.CamelClusterService"` is unreachable
in `components-starter/camel-master-starter/src/main/java/org/apache/camel/component/master/springboot/MasterComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.cluster.CamelClusterService": return applicationContext.getBean(ref, org.apache.camel.cluster.CamelClusterService.class);
            case "org.apache.camel.cluster.CamelClusterService.Selector": return applicationContext.getBean(ref, org.apache.camel.cluster.CamelClusterService.Selector.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.cluster.CamelClusterService.Selector"` is unreachable
in `components-starter/camel-master-starter/src/main/java/org/apache/camel/component/master/springboot/MasterComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.cluster.CamelClusterService": return applicationContext.getBean(ref, org.apache.camel.cluster.CamelClusterService.class);
            case "org.apache.camel.cluster.CamelClusterService.Selector": return applicationContext.getBean(ref, org.apache.camel.cluster.CamelClusterService.Selector.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.BeanScope"` is unreachable
in `components-starter/camel-bean-starter/src/main/java/org/apache/camel/component/bean/springboot/BeanComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.BeanScope": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.BeanScope.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.BeanScope"` is unreachable
in `components-starter/camel-bean-starter/src/main/java/org/apache/camel/component/beanclass/springboot/ClassComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.BeanScope": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.BeanScope.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration"` is unreachable
in `components-starter/camel-azure-storage-datalake-starter/src/main/java/org/apache/camel/component/azure/storage/datalake/springboot/DataLakeComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration.class);
            case "com.azure.storage.file.datalake.DataLakeServiceClient": return applicationContext.getBean(ref, com.azure.storage.file.datalake.DataLakeServiceClient.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
```

### DataFlowIssue
Switch label `"com.azure.storage.file.datalake.DataLakeServiceClient"` is unreachable
in `components-starter/camel-azure-storage-datalake-starter/src/main/java/org/apache/camel/component/azure/storage/datalake/springboot/DataLakeComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration.class);
            case "com.azure.storage.file.datalake.DataLakeServiceClient": return applicationContext.getBean(ref, com.azure.storage.file.datalake.DataLakeServiceClient.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
```

### DataFlowIssue
Switch label `"com.azure.storage.common.StorageSharedKeyCredential"` is unreachable
in `components-starter/camel-azure-storage-datalake-starter/src/main/java/org/apache/camel/component/azure/storage/datalake/springboot/DataLakeComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration.class);
            case "com.azure.storage.file.datalake.DataLakeServiceClient": return applicationContext.getBean(ref, com.azure.storage.file.datalake.DataLakeServiceClient.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.identity.ClientSecretCredential": return applicationContext.getBean(ref, com.azure.identity.ClientSecretCredential.class);
```

### DataFlowIssue
Switch label `"java.time.Duration"` is unreachable
in `components-starter/camel-azure-storage-datalake-starter/src/main/java/org/apache/camel/component/azure/storage/datalake/springboot/DataLakeComponentConverter.java`
#### Snippet
```java
            case "com.azure.storage.file.datalake.DataLakeServiceClient": return applicationContext.getBean(ref, com.azure.storage.file.datalake.DataLakeServiceClient.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.identity.ClientSecretCredential": return applicationContext.getBean(ref, com.azure.identity.ClientSecretCredential.class);
            case "com.azure.core.credential.AzureSasCredential": return applicationContext.getBean(ref, com.azure.core.credential.AzureSasCredential.class);
```

### DataFlowIssue
Switch label `"com.azure.identity.ClientSecretCredential"` is unreachable
in `components-starter/camel-azure-storage-datalake-starter/src/main/java/org/apache/camel/component/azure/storage/datalake/springboot/DataLakeComponentConverter.java`
#### Snippet
```java
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.identity.ClientSecretCredential": return applicationContext.getBean(ref, com.azure.identity.ClientSecretCredential.class);
            case "com.azure.core.credential.AzureSasCredential": return applicationContext.getBean(ref, com.azure.core.credential.AzureSasCredential.class);
        }
```

### DataFlowIssue
Switch label `"com.azure.core.credential.AzureSasCredential"` is unreachable
in `components-starter/camel-azure-storage-datalake-starter/src/main/java/org/apache/camel/component/azure/storage/datalake/springboot/DataLakeComponentConverter.java`
#### Snippet
```java
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.identity.ClientSecretCredential": return applicationContext.getBean(ref, com.azure.identity.ClientSecretCredential.class);
            case "com.azure.core.credential.AzureSasCredential": return applicationContext.getBean(ref, com.azure.core.credential.AzureSasCredential.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.sts.STS2Configuration"` is unreachable
in `components-starter/camel-aws2-sts-starter/src/main/java/org/apache/camel/component/aws2/sts/springboot/STS2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.sts.STS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.sts.STS2Configuration.class);
            case "software.amazon.awssdk.services.sts.StsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.sts.StsClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.sts.StsClient"` is unreachable
in `components-starter/camel-aws2-sts-starter/src/main/java/org/apache/camel/component/aws2/sts/springboot/STS2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.sts.STS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.sts.STS2Configuration.class);
            case "software.amazon.awssdk.services.sts.StsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.sts.StsClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration"` is unreachable
in `components-starter/camel-reactive-streams-starter/src/main/java/org/apache/camel/component/reactive/streams/springboot/ReactiveStreamsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-cxf-soap-starter/src/main/java/org/apache/camel/component/cxf/jaxws/springboot/CxfComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.webhook.WebhookConfiguration"` is unreachable
in `components-starter/camel-webhook-starter/src/main/java/org/apache/camel/component/webhook/springboot/WebhookComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.webhook.WebhookConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.webhook.WebhookConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.lambda.Lambda2Configuration"` is unreachable
in `components-starter/camel-aws2-lambda-starter/src/main/java/org/apache/camel/component/aws2/lambda/springboot/Lambda2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.lambda.Lambda2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.lambda.Lambda2Configuration.class);
            case "software.amazon.awssdk.services.lambda.LambdaClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.lambda.LambdaClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.lambda.LambdaClient"` is unreachable
in `components-starter/camel-aws2-lambda-starter/src/main/java/org/apache/camel/component/aws2/lambda/springboot/Lambda2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.lambda.Lambda2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.lambda.Lambda2Configuration.class);
            case "software.amazon.awssdk.services.lambda.LambdaClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.lambda.LambdaClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.kinesis.KinesisClient"` is unreachable
in `components-starter/camel-aws2-kinesis-starter/src/main/java/org/apache/camel/component/aws2/kinesis/springboot/Kinesis2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.kinesis.KinesisClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.kinesis.KinesisClient.class);
            case "org.apache.camel.component.aws2.kinesis.Kinesis2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.kinesis.Kinesis2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.kinesis.Kinesis2Configuration"` is unreachable
in `components-starter/camel-aws2-kinesis-starter/src/main/java/org/apache/camel/component/aws2/kinesis/springboot/Kinesis2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.kinesis.KinesisClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.kinesis.KinesisClient.class);
            case "org.apache.camel.component.aws2.kinesis.Kinesis2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.kinesis.Kinesis2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.firehose.FirehoseClient"` is unreachable
in `components-starter/camel-aws2-kinesis-starter/src/main/java/org/apache/camel/component/aws2/firehose/springboot/KinesisFirehose2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.firehose.FirehoseClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.firehose.FirehoseClient.class);
            case "org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration"` is unreachable
in `components-starter/camel-aws2-kinesis-starter/src/main/java/org/apache/camel/component/aws2/firehose/springboot/KinesisFirehose2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.firehose.FirehoseClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.firehose.FirehoseClient.class);
            case "org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jira.JiraConfiguration"` is unreachable
in `components-starter/camel-jira-starter/src/main/java/org/apache/camel/component/jira/springboot/JiraComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.jira.JiraConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jira.JiraConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.arangodb.ArangoDbConfiguration"` is unreachable
in `components-starter/camel-arangodb-starter/src/main/java/org/apache/camel/component/arangodb/springboot/ArangoDbComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.arangodb.ArangoDbConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.arangodb.ArangoDbConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.box.BoxConfiguration"` is unreachable
in `components-starter/camel-box-starter/src/main/java/org/apache/camel/component/box/springboot/BoxComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.box.BoxConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.box.BoxConfiguration.class);
            case "com.box.sdk.IAccessTokenCache": return applicationContext.getBean(ref, com.box.sdk.IAccessTokenCache.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"com.box.sdk.IAccessTokenCache"` is unreachable
in `components-starter/camel-box-starter/src/main/java/org/apache/camel/component/box/springboot/BoxComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.box.BoxConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.box.BoxConfiguration.class);
            case "com.box.sdk.IAccessTokenCache": return applicationContext.getBean(ref, com.box.sdk.IAccessTokenCache.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-box-starter/src/main/java/org/apache/camel/component/box/springboot/BoxComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.box.BoxConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.box.BoxConfiguration.class);
            case "com.box.sdk.IAccessTokenCache": return applicationContext.getBean(ref, com.box.sdk.IAccessTokenCache.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.atlasmap.api.AtlasContextFactory"` is unreachable
in `components-starter/camel-atlasmap-starter/src/main/java/org/apache/camel/component/atlasmap/springboot/AtlasMapComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.atlasmap.api.AtlasContextFactory": return applicationContext.getBean(ref, io.atlasmap.api.AtlasContextFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.micrometer.core.instrument.MeterRegistry"` is unreachable
in `components-starter/camel-micrometer-starter/src/main/java/org/apache/camel/component/micrometer/springboot/MicrometerComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.micrometer.core.instrument.MeterRegistry": return applicationContext.getBean(ref, io.micrometer.core.instrument.MeterRegistry.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.seda.BlockingQueueFactory"` is unreachable
in `components-starter/camel-seda-starter/src/main/java/org/apache/camel/component/seda/springboot/SedaComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.seda.BlockingQueueFactory": return applicationContext.getBean(ref, org.apache.camel.component.seda.BlockingQueueFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.validator.ValidatorResourceResolverFactory"` is unreachable
in `components-starter/camel-validator-starter/src/main/java/org/apache/camel/component/validator/springboot/ValidatorComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.validator.ValidatorResourceResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.validator.ValidatorResourceResolverFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"java.net.http.HttpClient"` is unreachable
in `components-starter/camel-telegram-starter/src/main/java/org/apache/camel/component/telegram/springboot/TelegramComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "java.net.http.HttpClient": return applicationContext.getBean(ref, java.net.http.HttpClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"jakarta.jms.ConnectionFactory"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.springframework.core.task.TaskExecutor": return applicationContext.getBean(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
```

### DataFlowIssue
Switch label `"org.springframework.core.task.TaskExecutor"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.springframework.core.task.TaskExecutor": return applicationContext.getBean(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jms.JmsConfiguration"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.springframework.core.task.TaskExecutor": return applicationContext.getBean(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
```

### DataFlowIssue
Switch label `"org.springframework.jms.support.destination.DestinationResolver"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "org.springframework.core.task.TaskExecutor": return applicationContext.getBean(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
```

### DataFlowIssue
Switch label `"org.springframework.util.ErrorHandler"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
```

### DataFlowIssue
Switch label `"jakarta.jms.ExceptionListener"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
```

### DataFlowIssue
Switch label `"org.springframework.jms.support.converter.MessageConverter"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jms.MessageCreatedStrategy"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jms.MessageListenerContainerFactory"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jms.QueueBrowseStrategy"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
        }
```

### DataFlowIssue
Switch label `"org.springframework.transaction.PlatformTransactionManager"` is unreachable
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.eclipse.jetty.util.thread.ThreadPool"` is unreachable
in `components-starter/camel-jetty-starter/src/main/java/org/apache/camel/component/jetty11/springboot/JettyHttpComponentConverter11.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.eclipse.jetty.util.thread.ThreadPool": return applicationContext.getBean(ref, org.eclipse.jetty.util.thread.ThreadPool.class);
            case "org.eclipse.jetty.server.handler.ErrorHandler": return applicationContext.getBean(ref, org.eclipse.jetty.server.handler.ErrorHandler.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
```

### DataFlowIssue
Switch label `"org.eclipse.jetty.server.handler.ErrorHandler"` is unreachable
in `components-starter/camel-jetty-starter/src/main/java/org/apache/camel/component/jetty11/springboot/JettyHttpComponentConverter11.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.eclipse.jetty.util.thread.ThreadPool": return applicationContext.getBean(ref, org.eclipse.jetty.util.thread.ThreadPool.class);
            case "org.eclipse.jetty.server.handler.ErrorHandler": return applicationContext.getBean(ref, org.eclipse.jetty.server.handler.ErrorHandler.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpBinding"` is unreachable
in `components-starter/camel-jetty-starter/src/main/java/org/apache/camel/component/jetty11/springboot/JettyHttpComponentConverter11.java`
#### Snippet
```java
            case "org.eclipse.jetty.util.thread.ThreadPool": return applicationContext.getBean(ref, org.eclipse.jetty.util.thread.ThreadPool.class);
            case "org.eclipse.jetty.server.handler.ErrorHandler": return applicationContext.getBean(ref, org.eclipse.jetty.server.handler.ErrorHandler.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.eclipse.jetty.jmx.MBeanContainer": return applicationContext.getBean(ref, org.eclipse.jetty.jmx.MBeanContainer.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpConfiguration"` is unreachable
in `components-starter/camel-jetty-starter/src/main/java/org/apache/camel/component/jetty11/springboot/JettyHttpComponentConverter11.java`
#### Snippet
```java
            case "org.eclipse.jetty.server.handler.ErrorHandler": return applicationContext.getBean(ref, org.eclipse.jetty.server.handler.ErrorHandler.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.eclipse.jetty.jmx.MBeanContainer": return applicationContext.getBean(ref, org.eclipse.jetty.jmx.MBeanContainer.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.eclipse.jetty.jmx.MBeanContainer"` is unreachable
in `components-starter/camel-jetty-starter/src/main/java/org/apache/camel/component/jetty11/springboot/JettyHttpComponentConverter11.java`
#### Snippet
```java
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.eclipse.jetty.jmx.MBeanContainer": return applicationContext.getBean(ref, org.eclipse.jetty.jmx.MBeanContainer.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-jetty-starter/src/main/java/org/apache/camel/component/jetty11/springboot/JettyHttpComponentConverter11.java`
#### Snippet
```java
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.eclipse.jetty.jmx.MBeanContainer": return applicationContext.getBean(ref, org.eclipse.jetty.jmx.MBeanContainer.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-jetty-starter/src/main/java/org/apache/camel/component/jetty11/springboot/JettyHttpComponentConverter11.java`
#### Snippet
```java
            case "org.eclipse.jetty.jmx.MBeanContainer": return applicationContext.getBean(ref, org.eclipse.jetty.jmx.MBeanContainer.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.smpp.SmppConfiguration"` is unreachable
in `components-starter/camel-smpp-starter/src/main/java/org/apache/camel/component/smpp/springboot/SmppComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.smpp.SmppConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.smpp.SmppConfiguration.class);
            case "org.jsmpp.session.SessionStateListener": return applicationContext.getBean(ref, org.jsmpp.session.SessionStateListener.class);
        }
```

### DataFlowIssue
Switch label `"org.jsmpp.session.SessionStateListener"` is unreachable
in `components-starter/camel-smpp-starter/src/main/java/org/apache/camel/component/smpp/springboot/SmppComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.smpp.SmppConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.smpp.SmppConfiguration.class);
            case "org.jsmpp.session.SessionStateListener": return applicationContext.getBean(ref, org.jsmpp.session.SessionStateListener.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-nats-starter/src/main/java/org/apache/camel/component/nats/springboot/NatsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.hc.client5.http.cookie.CookieStore"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.hc.client5.http.cookie.CookieStore": return applicationContext.getBean(ref, org.apache.hc.client5.http.cookie.CookieStore.class);
            case "org.apache.hc.client5.http.io.HttpClientConnectionManager": return applicationContext.getBean(ref, org.apache.hc.client5.http.io.HttpClientConnectionManager.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
```

### DataFlowIssue
Switch label `"org.apache.hc.client5.http.io.HttpClientConnectionManager"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.hc.client5.http.cookie.CookieStore": return applicationContext.getBean(ref, org.apache.hc.client5.http.cookie.CookieStore.class);
            case "org.apache.hc.client5.http.io.HttpClientConnectionManager": return applicationContext.getBean(ref, org.apache.hc.client5.http.io.HttpClientConnectionManager.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.component.http.HttpClientConfigurer": return applicationContext.getBean(ref, org.apache.camel.component.http.HttpClientConfigurer.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpBinding"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.hc.client5.http.cookie.CookieStore": return applicationContext.getBean(ref, org.apache.hc.client5.http.cookie.CookieStore.class);
            case "org.apache.hc.client5.http.io.HttpClientConnectionManager": return applicationContext.getBean(ref, org.apache.hc.client5.http.io.HttpClientConnectionManager.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.component.http.HttpClientConfigurer": return applicationContext.getBean(ref, org.apache.camel.component.http.HttpClientConfigurer.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.http.HttpClientConfigurer"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.hc.client5.http.io.HttpClientConnectionManager": return applicationContext.getBean(ref, org.apache.hc.client5.http.io.HttpClientConnectionManager.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.component.http.HttpClientConfigurer": return applicationContext.getBean(ref, org.apache.camel.component.http.HttpClientConfigurer.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.hc.core5.http.protocol.HttpContext": return applicationContext.getBean(ref, org.apache.hc.core5.http.protocol.HttpContext.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.http.common.HttpConfiguration"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.component.http.HttpClientConfigurer": return applicationContext.getBean(ref, org.apache.camel.component.http.HttpClientConfigurer.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.hc.core5.http.protocol.HttpContext": return applicationContext.getBean(ref, org.apache.hc.core5.http.protocol.HttpContext.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.hc.core5.http.protocol.HttpContext"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.http.HttpClientConfigurer": return applicationContext.getBean(ref, org.apache.camel.component.http.HttpClientConfigurer.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.hc.core5.http.protocol.HttpContext": return applicationContext.getBean(ref, org.apache.hc.core5.http.protocol.HttpContext.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.hc.core5.http.protocol.HttpContext": return applicationContext.getBean(ref, org.apache.hc.core5.http.protocol.HttpContext.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.hc.core5.http.protocol.HttpContext": return applicationContext.getBean(ref, org.apache.hc.core5.http.protocol.HttpContext.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
            case "org.apache.hc.core5.util.Timeout": return applicationContext.getBean(ref, org.apache.hc.core5.util.Timeout.class);
```

### DataFlowIssue
Switch label `"javax.net.ssl.HostnameVerifier"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
            case "org.apache.hc.core5.util.Timeout": return applicationContext.getBean(ref, org.apache.hc.core5.util.Timeout.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.hc.core5.util.Timeout"` is unreachable
in `components-starter/camel-http-starter/src/main/java/org/apache/camel/component/http/springboot/HttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
            case "org.apache.hc.core5.util.Timeout": return applicationContext.getBean(ref, org.apache.hc.core5.util.Timeout.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.mina.MinaConfiguration"` is unreachable
in `components-starter/camel-mina-starter/src/main/java/org/apache/camel/component/mina/springboot/MinaComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.mina.MinaConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mina.MinaConfiguration.class);
            case "org.apache.mina.filter.codec.ProtocolCodecFactory": return applicationContext.getBean(ref, org.apache.mina.filter.codec.ProtocolCodecFactory.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.mina.filter.codec.ProtocolCodecFactory"` is unreachable
in `components-starter/camel-mina-starter/src/main/java/org/apache/camel/component/mina/springboot/MinaComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.mina.MinaConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mina.MinaConfiguration.class);
            case "org.apache.mina.filter.codec.ProtocolCodecFactory": return applicationContext.getBean(ref, org.apache.mina.filter.codec.ProtocolCodecFactory.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-mina-starter/src/main/java/org/apache/camel/component/mina/springboot/MinaComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.mina.MinaConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mina.MinaConfiguration.class);
            case "org.apache.mina.filter.codec.ProtocolCodecFactory": return applicationContext.getBean(ref, org.apache.mina.filter.codec.ProtocolCodecFactory.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.etcd3.Etcd3Configuration"` is unreachable
in `components-starter/camel-etcd3-starter/src/main/java/org/apache/camel/component/etcd3/springboot/Etcd3ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.etcd3.Etcd3Configuration": return applicationContext.getBean(ref, org.apache.camel.component.etcd3.Etcd3Configuration.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "io.netty.handler.ssl.SslContext": return applicationContext.getBean(ref, io.netty.handler.ssl.SslContext.class);
```

### DataFlowIssue
Switch label `"java.time.Duration"` is unreachable
in `components-starter/camel-etcd3-starter/src/main/java/org/apache/camel/component/etcd3/springboot/Etcd3ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.etcd3.Etcd3Configuration": return applicationContext.getBean(ref, org.apache.camel.component.etcd3.Etcd3Configuration.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "io.netty.handler.ssl.SslContext": return applicationContext.getBean(ref, io.netty.handler.ssl.SslContext.class);
        }
```

### DataFlowIssue
Switch label `"io.netty.handler.ssl.SslContext"` is unreachable
in `components-starter/camel-etcd3-starter/src/main/java/org/apache/camel/component/etcd3/springboot/Etcd3ComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.etcd3.Etcd3Configuration": return applicationContext.getBean(ref, org.apache.camel.component.etcd3.Etcd3Configuration.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "io.netty.handler.ssl.SslContext": return applicationContext.getBean(ref, io.netty.handler.ssl.SslContext.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration"` is unreachable
in `components-starter/camel-debezium-sqlserver-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumSqlserverComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.github.mustachejava.MustacheFactory"` is unreachable
in `components-starter/camel-mustache-starter/src/main/java/org/apache/camel/component/mustache/springboot/MustacheComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.github.mustachejava.MustacheFactory": return applicationContext.getBean(ref, com.github.mustachejava.MustacheFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.dynamodb.DynamoDbClient"` is unreachable
in `components-starter/camel-aws2-ddb-starter/src/main/java/org/apache/camel/component/aws2/ddb/springboot/Ddb2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.dynamodb.DynamoDbClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.dynamodb.DynamoDbClient.class);
            case "org.apache.camel.component.aws2.ddb.Ddb2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ddb.Ddb2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.ddb.Ddb2Configuration"` is unreachable
in `components-starter/camel-aws2-ddb-starter/src/main/java/org/apache/camel/component/aws2/ddb/springboot/Ddb2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.dynamodb.DynamoDbClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.dynamodb.DynamoDbClient.class);
            case "org.apache.camel.component.aws2.ddb.Ddb2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ddb.Ddb2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient"` is unreachable
in `components-starter/camel-aws2-ddb-starter/src/main/java/org/apache/camel/component/aws2/ddbstream/springboot/Ddb2StreamComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient.class);
            case "org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration"` is unreachable
in `components-starter/camel-aws2-ddb-starter/src/main/java/org/apache/camel/component/aws2/ddbstream/springboot/Ddb2StreamComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient.class);
            case "org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.NettyConfiguration"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.netty.NettyConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyConfiguration.class);
            case "io.netty.channel.EventLoopGroup": return applicationContext.getBean(ref, io.netty.channel.EventLoopGroup.class);
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
```

### DataFlowIssue
Switch label `"io.netty.channel.EventLoopGroup"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.netty.NettyConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyConfiguration.class);
            case "io.netty.channel.EventLoopGroup": return applicationContext.getBean(ref, io.netty.channel.EventLoopGroup.class);
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
```

### DataFlowIssue
Switch label `"io.netty.util.concurrent.EventExecutorGroup"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.NettyConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyConfiguration.class);
            case "io.netty.channel.EventLoopGroup": return applicationContext.getBean(ref, io.netty.channel.EventLoopGroup.class);
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.NettyServerBootstrapFactory"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "io.netty.channel.EventLoopGroup": return applicationContext.getBean(ref, io.netty.channel.EventLoopGroup.class);
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.ServerInitializerFactory"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.ClientInitializerFactory"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.NettyCamelStateCorrelationManager"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"io.netty.channel.group.ChannelGroup"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.component.netty.http.NettyHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpBinding.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.component.netty.http.NettyHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpBinding.class);
            case "org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.http.NettyHttpBinding"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.component.netty.http.NettyHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpBinding.class);
            case "org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.component.netty.http.NettyHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpBinding.class);
            case "org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "io.netty.handler.ssl.SslHandler": return applicationContext.getBean(ref, io.netty.handler.ssl.SslHandler.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.http.NettyHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpBinding.class);
            case "org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "io.netty.handler.ssl.SslHandler": return applicationContext.getBean(ref, io.netty.handler.ssl.SslHandler.class);
        }
```

### DataFlowIssue
Switch label `"io.netty.handler.ssl.SslHandler"` is unreachable
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "io.netty.handler.ssl.SslHandler": return applicationContext.getBean(ref, io.netty.handler.ssl.SslHandler.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.splunk.SplunkConfigurationFactory"` is unreachable
in `components-starter/camel-splunk-starter/src/main/java/org/apache/camel/component/splunk/springboot/SplunkComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.splunk.SplunkConfigurationFactory": return applicationContext.getBean(ref, org.apache.camel.component.splunk.SplunkConfigurationFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-lumberjack-starter/src/main/java/org/apache/camel/component/lumberjack/springboot/LumberjackComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.undertow.UndertowHostOptions"` is unreachable
in `components-starter/camel-undertow-starter/src/main/java/org/apache/camel/component/undertow/springboot/UndertowComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.undertow.UndertowHostOptions": return applicationContext.getBean(ref, org.apache.camel.component.undertow.UndertowHostOptions.class);
            case "org.apache.camel.component.undertow.UndertowHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.undertow.UndertowHttpBinding.class);
            case "org.apache.camel.component.undertow.spi.UndertowSecurityProvider": return applicationContext.getBean(ref, org.apache.camel.component.undertow.spi.UndertowSecurityProvider.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.undertow.UndertowHttpBinding"` is unreachable
in `components-starter/camel-undertow-starter/src/main/java/org/apache/camel/component/undertow/springboot/UndertowComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.undertow.UndertowHostOptions": return applicationContext.getBean(ref, org.apache.camel.component.undertow.UndertowHostOptions.class);
            case "org.apache.camel.component.undertow.UndertowHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.undertow.UndertowHttpBinding.class);
            case "org.apache.camel.component.undertow.spi.UndertowSecurityProvider": return applicationContext.getBean(ref, org.apache.camel.component.undertow.spi.UndertowSecurityProvider.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.undertow.spi.UndertowSecurityProvider"` is unreachable
in `components-starter/camel-undertow-starter/src/main/java/org/apache/camel/component/undertow/springboot/UndertowComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.undertow.UndertowHostOptions": return applicationContext.getBean(ref, org.apache.camel.component.undertow.UndertowHostOptions.class);
            case "org.apache.camel.component.undertow.UndertowHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.undertow.UndertowHttpBinding.class);
            case "org.apache.camel.component.undertow.spi.UndertowSecurityProvider": return applicationContext.getBean(ref, org.apache.camel.component.undertow.spi.UndertowSecurityProvider.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-undertow-starter/src/main/java/org/apache/camel/component/undertow/springboot/UndertowComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.undertow.UndertowHttpBinding": return applicationContext.getBean(ref, org.apache.camel.component.undertow.UndertowHttpBinding.class);
            case "org.apache.camel.component.undertow.spi.UndertowSecurityProvider": return applicationContext.getBean(ref, org.apache.camel.component.undertow.spi.UndertowSecurityProvider.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"freemarker.template.Configuration"` is unreachable
in `components-starter/camel-freemarker-starter/src/main/java/org/apache/camel/component/freemarker/springboot/FreemarkerComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "freemarker.template.Configuration": return applicationContext.getBean(ref, freemarker.template.Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.kafka.KafkaConfiguration"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.kafka.KafkaConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.kafka.KafkaConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.kafka.KafkaConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.kafka.KafkaConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer.class);
            case "org.apache.camel.spi.StateRepository": return applicationContext.getBean(ref, org.apache.camel.spi.StateRepository.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.kafka.KafkaConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.kafka.KafkaConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer.class);
            case "org.apache.camel.spi.StateRepository": return applicationContext.getBean(ref, org.apache.camel.spi.StateRepository.class);
            case "org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory": return applicationContext.getBean(ref, org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.StateRepository"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer.class);
            case "org.apache.camel.spi.StateRepository": return applicationContext.getBean(ref, org.apache.camel.spi.StateRepository.class);
            case "org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory": return applicationContext.getBean(ref, org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory.class);
            case "org.apache.camel.component.kafka.PollExceptionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.kafka.PollExceptionStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer.class);
            case "org.apache.camel.spi.StateRepository": return applicationContext.getBean(ref, org.apache.camel.spi.StateRepository.class);
            case "org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory": return applicationContext.getBean(ref, org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory.class);
            case "org.apache.camel.component.kafka.PollExceptionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.kafka.PollExceptionStrategy.class);
            case "org.apache.camel.component.kafka.serde.KafkaHeaderSerializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderSerializer.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.kafka.PollExceptionStrategy"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.spi.StateRepository": return applicationContext.getBean(ref, org.apache.camel.spi.StateRepository.class);
            case "org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory": return applicationContext.getBean(ref, org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory.class);
            case "org.apache.camel.component.kafka.PollExceptionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.kafka.PollExceptionStrategy.class);
            case "org.apache.camel.component.kafka.serde.KafkaHeaderSerializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderSerializer.class);
            case "java.util.concurrent.ExecutorService": return applicationContext.getBean(ref, java.util.concurrent.ExecutorService.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.kafka.serde.KafkaHeaderSerializer"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory": return applicationContext.getBean(ref, org.apache.camel.component.kafka.consumer.KafkaManualCommitFactory.class);
            case "org.apache.camel.component.kafka.PollExceptionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.kafka.PollExceptionStrategy.class);
            case "org.apache.camel.component.kafka.serde.KafkaHeaderSerializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderSerializer.class);
            case "java.util.concurrent.ExecutorService": return applicationContext.getBean(ref, java.util.concurrent.ExecutorService.class);
            case "org.apache.camel.component.kafka.KafkaClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.kafka.KafkaClientFactory.class);
```

### DataFlowIssue
Switch label `"java.util.concurrent.ExecutorService"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.kafka.PollExceptionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.kafka.PollExceptionStrategy.class);
            case "org.apache.camel.component.kafka.serde.KafkaHeaderSerializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderSerializer.class);
            case "java.util.concurrent.ExecutorService": return applicationContext.getBean(ref, java.util.concurrent.ExecutorService.class);
            case "org.apache.camel.component.kafka.KafkaClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.kafka.KafkaClientFactory.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.kafka.KafkaClientFactory"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.kafka.serde.KafkaHeaderSerializer": return applicationContext.getBean(ref, org.apache.camel.component.kafka.serde.KafkaHeaderSerializer.class);
            case "java.util.concurrent.ExecutorService": return applicationContext.getBean(ref, java.util.concurrent.ExecutorService.class);
            case "org.apache.camel.component.kafka.KafkaClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.kafka.KafkaClientFactory.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConverter.java`
#### Snippet
```java
            case "java.util.concurrent.ExecutorService": return applicationContext.getBean(ref, java.util.concurrent.ExecutorService.class);
            case "org.apache.camel.component.kafka.KafkaClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.kafka.KafkaClientFactory.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory"` is unreachable
in `components-starter/camel-google-bigquery-starter/src/main/java/org/apache/camel/component/google/bigquery/sql/springboot/GoogleBigQuerySQLComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory"` is unreachable
in `components-starter/camel-google-bigquery-starter/src/main/java/org/apache/camel/component/google/bigquery/springboot/GoogleBigQueryComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.debezium.configuration.OracleConnectorEmbeddedDebeziumConfiguration"` is unreachable
in `components-starter/camel-debezium-oracle-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumOracleComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.OracleConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.OracleConnectorEmbeddedDebeziumConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.vertx.core.Vertx"` is unreachable
in `components-starter/camel-vertx-starter/src/main/java/org/apache/camel/component/vertx/springboot/VertxComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.vertx.core.Vertx": return applicationContext.getBean(ref, io.vertx.core.Vertx.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
            case "io.vertx.core.impl.VertxBuilder": return applicationContext.getBean(ref, io.vertx.core.impl.VertxBuilder.class);
```

### DataFlowIssue
Switch label `"io.vertx.core.VertxOptions"` is unreachable
in `components-starter/camel-vertx-starter/src/main/java/org/apache/camel/component/vertx/springboot/VertxComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "io.vertx.core.Vertx": return applicationContext.getBean(ref, io.vertx.core.Vertx.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
            case "io.vertx.core.impl.VertxBuilder": return applicationContext.getBean(ref, io.vertx.core.impl.VertxBuilder.class);
        }
```

### DataFlowIssue
Switch label `"io.vertx.core.impl.VertxBuilder"` is unreachable
in `components-starter/camel-vertx-starter/src/main/java/org/apache/camel/component/vertx/springboot/VertxComponentConverter.java`
#### Snippet
```java
            case "io.vertx.core.Vertx": return applicationContext.getBean(ref, io.vertx.core.Vertx.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
            case "io.vertx.core.impl.VertxBuilder": return applicationContext.getBean(ref, io.vertx.core.impl.VertxBuilder.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.pubnub.PubNubConfiguration"` is unreachable
in `components-starter/camel-pubnub-starter/src/main/java/org/apache/camel/component/pubnub/springboot/PubNubComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.pubnub.PubNubConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.pubnub.PubNubConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"javax.cache.configuration.Configuration"` is unreachable
in `components-starter/camel-jcache-starter/src/main/java/org/apache/camel/component/jcache/springboot/JCacheComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.cache.configuration.Configuration": return applicationContext.getBean(ref, javax.cache.configuration.Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"ca.uhn.fhir.rest.client.api.IGenericClient"` is unreachable
in `components-starter/camel-fhir-starter/src/main/java/org/apache/camel/component/fhir/springboot/FhirComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "ca.uhn.fhir.rest.client.api.IGenericClient": return applicationContext.getBean(ref, ca.uhn.fhir.rest.client.api.IGenericClient.class);
            case "ca.uhn.fhir.rest.client.api.IRestfulClientFactory": return applicationContext.getBean(ref, ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class);
            case "org.apache.camel.component.fhir.FhirConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.fhir.FhirConfiguration.class);
```

### DataFlowIssue
Switch label `"ca.uhn.fhir.rest.client.api.IRestfulClientFactory"` is unreachable
in `components-starter/camel-fhir-starter/src/main/java/org/apache/camel/component/fhir/springboot/FhirComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "ca.uhn.fhir.rest.client.api.IGenericClient": return applicationContext.getBean(ref, ca.uhn.fhir.rest.client.api.IGenericClient.class);
            case "ca.uhn.fhir.rest.client.api.IRestfulClientFactory": return applicationContext.getBean(ref, ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class);
            case "org.apache.camel.component.fhir.FhirConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.fhir.FhirConfiguration.class);
            case "ca.uhn.fhir.context.FhirContext": return applicationContext.getBean(ref, ca.uhn.fhir.context.FhirContext.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.fhir.FhirConfiguration"` is unreachable
in `components-starter/camel-fhir-starter/src/main/java/org/apache/camel/component/fhir/springboot/FhirComponentConverter.java`
#### Snippet
```java
            case "ca.uhn.fhir.rest.client.api.IGenericClient": return applicationContext.getBean(ref, ca.uhn.fhir.rest.client.api.IGenericClient.class);
            case "ca.uhn.fhir.rest.client.api.IRestfulClientFactory": return applicationContext.getBean(ref, ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class);
            case "org.apache.camel.component.fhir.FhirConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.fhir.FhirConfiguration.class);
            case "ca.uhn.fhir.context.FhirContext": return applicationContext.getBean(ref, ca.uhn.fhir.context.FhirContext.class);
        }
```

### DataFlowIssue
Switch label `"ca.uhn.fhir.context.FhirContext"` is unreachable
in `components-starter/camel-fhir-starter/src/main/java/org/apache/camel/component/fhir/springboot/FhirComponentConverter.java`
#### Snippet
```java
            case "ca.uhn.fhir.rest.client.api.IRestfulClientFactory": return applicationContext.getBean(ref, ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class);
            case "org.apache.camel.component.fhir.FhirConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.fhir.FhirConfiguration.class);
            case "ca.uhn.fhir.context.FhirContext": return applicationContext.getBean(ref, ca.uhn.fhir.context.FhirContext.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.servicenow.ServiceNowConfiguration"` is unreachable
in `components-starter/camel-servicenow-starter/src/main/java/org/apache/camel/component/servicenow/springboot/ServiceNowComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.servicenow.ServiceNowConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.servicenow.ServiceNowConfiguration.class);
            case "org.apache.cxf.transports.http.configuration.HTTPClientPolicy": return applicationContext.getBean(ref, org.apache.cxf.transports.http.configuration.HTTPClientPolicy.class);
            case "com.fasterxml.jackson.databind.ObjectMapper": return applicationContext.getBean(ref, com.fasterxml.jackson.databind.ObjectMapper.class);
```

### DataFlowIssue
Switch label `"org.apache.cxf.transports.http.configuration.HTTPClientPolicy"` is unreachable
in `components-starter/camel-servicenow-starter/src/main/java/org/apache/camel/component/servicenow/springboot/ServiceNowComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.servicenow.ServiceNowConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.servicenow.ServiceNowConfiguration.class);
            case "org.apache.cxf.transports.http.configuration.HTTPClientPolicy": return applicationContext.getBean(ref, org.apache.cxf.transports.http.configuration.HTTPClientPolicy.class);
            case "com.fasterxml.jackson.databind.ObjectMapper": return applicationContext.getBean(ref, com.fasterxml.jackson.databind.ObjectMapper.class);
            case "org.apache.cxf.configuration.security.ProxyAuthorizationPolicy": return applicationContext.getBean(ref, org.apache.cxf.configuration.security.ProxyAuthorizationPolicy.class);
```

### DataFlowIssue
Switch label `"com.fasterxml.jackson.databind.ObjectMapper"` is unreachable
in `components-starter/camel-servicenow-starter/src/main/java/org/apache/camel/component/servicenow/springboot/ServiceNowComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.servicenow.ServiceNowConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.servicenow.ServiceNowConfiguration.class);
            case "org.apache.cxf.transports.http.configuration.HTTPClientPolicy": return applicationContext.getBean(ref, org.apache.cxf.transports.http.configuration.HTTPClientPolicy.class);
            case "com.fasterxml.jackson.databind.ObjectMapper": return applicationContext.getBean(ref, com.fasterxml.jackson.databind.ObjectMapper.class);
            case "org.apache.cxf.configuration.security.ProxyAuthorizationPolicy": return applicationContext.getBean(ref, org.apache.cxf.configuration.security.ProxyAuthorizationPolicy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.cxf.configuration.security.ProxyAuthorizationPolicy"` is unreachable
in `components-starter/camel-servicenow-starter/src/main/java/org/apache/camel/component/servicenow/springboot/ServiceNowComponentConverter.java`
#### Snippet
```java
            case "org.apache.cxf.transports.http.configuration.HTTPClientPolicy": return applicationContext.getBean(ref, org.apache.cxf.transports.http.configuration.HTTPClientPolicy.class);
            case "com.fasterxml.jackson.databind.ObjectMapper": return applicationContext.getBean(ref, com.fasterxml.jackson.databind.ObjectMapper.class);
            case "org.apache.cxf.configuration.security.ProxyAuthorizationPolicy": return applicationContext.getBean(ref, org.apache.cxf.configuration.security.ProxyAuthorizationPolicy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-servicenow-starter/src/main/java/org/apache/camel/component/servicenow/springboot/ServiceNowComponentConverter.java`
#### Snippet
```java
            case "com.fasterxml.jackson.databind.ObjectMapper": return applicationContext.getBean(ref, com.fasterxml.jackson.databind.ObjectMapper.class);
            case "org.apache.cxf.configuration.security.ProxyAuthorizationPolicy": return applicationContext.getBean(ref, org.apache.cxf.configuration.security.ProxyAuthorizationPolicy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.quartz.Scheduler"` is unreachable
in `components-starter/camel-quartz-starter/src/main/java/org/apache/camel/component/quartz/springboot/QuartzComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.quartz.Scheduler": return applicationContext.getBean(ref, org.quartz.Scheduler.class);
            case "org.quartz.SchedulerFactory": return applicationContext.getBean(ref, org.quartz.SchedulerFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.quartz.SchedulerFactory"` is unreachable
in `components-starter/camel-quartz-starter/src/main/java/org/apache/camel/component/quartz/springboot/QuartzComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.quartz.Scheduler": return applicationContext.getBean(ref, org.quartz.Scheduler.class);
            case "org.quartz.SchedulerFactory": return applicationContext.getBean(ref, org.quartz.SchedulerFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/openshift/builds/springboot/OpenshiftBuildsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/openshift/build_configs/springboot/OpenshiftBuildConfigsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/hpa/springboot/KubernetesHPAComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/openshift/deploymentconfigs/springboot/OpenshiftDeploymentConfigsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/job/springboot/KubernetesJobComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/pods/springboot/KubernetesPodsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/events/springboot/KubernetesEventsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/nodes/springboot/KubernetesNodesComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/secrets/springboot/KubernetesSecretsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/services/springboot/KubernetesServicesComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/namespaces/springboot/KubernetesNamespacesComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/config_maps/springboot/KubernetesConfigMapsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/deployments/springboot/KubernetesDeploymentsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/customresources/springboot/KubernetesCustomResourcesComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/service_accounts/springboot/KubernetesServiceAccountsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/resources_quota/springboot/KubernetesResourcesQuotaComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/persistent_volumes/springboot/KubernetesPersistentVolumesComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/replication_controllers/springboot/KubernetesReplicationControllersComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.fabric8.kubernetes.client.KubernetesClient"` is unreachable
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/persistent_volumes_claims/springboot/KubernetesPersistentVolumesClaimsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.kms.KMS2Configuration"` is unreachable
in `components-starter/camel-aws2-kms-starter/src/main/java/org/apache/camel/component/aws2/kms/springboot/KMS2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.kms.KMS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.kms.KMS2Configuration.class);
            case "software.amazon.awssdk.services.kms.KmsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.kms.KmsClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.kms.KmsClient"` is unreachable
in `components-starter/camel-aws2-kms-starter/src/main/java/org/apache/camel/component/aws2/kms/springboot/KMS2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.kms.KMS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.kms.KMS2Configuration.class);
            case "software.amazon.awssdk.services.kms.KmsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.kms.KmsClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.ibm.as400.access.AS400ConnectionPool"` is unreachable
in `components-starter/camel-jt400-starter/src/main/java/org/apache/camel/component/jt400/springboot/Jt400ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.ibm.as400.access.AS400ConnectionPool": return applicationContext.getBean(ref, com.ibm.as400.access.AS400ConnectionPool.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration"` is unreachable
in `components-starter/camel-debezium-mysql-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumMySqlComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"net.sf.saxon.Configuration"` is unreachable
in `components-starter/camel-saxon-starter/src/main/java/org/apache/camel/component/xquery/springboot/XQueryComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "net.sf.saxon.Configuration": return applicationContext.getBean(ref, net.sf.saxon.Configuration.class);
            case "net.sf.saxon.lib.ModuleURIResolver": return applicationContext.getBean(ref, net.sf.saxon.lib.ModuleURIResolver.class);
        }
```

### DataFlowIssue
Switch label `"net.sf.saxon.lib.ModuleURIResolver"` is unreachable
in `components-starter/camel-saxon-starter/src/main/java/org/apache/camel/component/xquery/springboot/XQueryComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "net.sf.saxon.Configuration": return applicationContext.getBean(ref, net.sf.saxon.Configuration.class);
            case "net.sf.saxon.lib.ModuleURIResolver": return applicationContext.getBean(ref, net.sf.saxon.lib.ModuleURIResolver.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.velocity.app.VelocityEngine"` is unreachable
in `components-starter/camel-velocity-starter/src/main/java/org/apache/camel/component/velocity/springboot/VelocityComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.velocity.app.VelocityEngine": return applicationContext.getBean(ref, org.apache.velocity.app.VelocityEngine.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.wordpress.WordpressConfiguration"` is unreachable
in `components-starter/camel-wordpress-starter/src/main/java/org/apache/camel/component/wordpress/springboot/WordpressComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.wordpress.WordpressConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.wordpress.WordpressConfiguration.class);
            case "org.apache.camel.component.wordpress.api.model.SearchCriteria": return applicationContext.getBean(ref, org.apache.camel.component.wordpress.api.model.SearchCriteria.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.wordpress.api.model.SearchCriteria"` is unreachable
in `components-starter/camel-wordpress-starter/src/main/java/org/apache/camel/component/wordpress/springboot/WordpressComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.wordpress.WordpressConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.wordpress.WordpressConfiguration.class);
            case "org.apache.camel.component.wordpress.api.model.SearchCriteria": return applicationContext.getBean(ref, org.apache.camel.component.wordpress.api.model.SearchCriteria.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/map/springboot/HazelcastMapComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/set/springboot/HazelcastSetComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/list/springboot/HazelcastListComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/seda/springboot/HazelcastSedaComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/queue/springboot/HazelcastQueueComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/topic/springboot/HazelcastTopicComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/instance/springboot/HazelcastInstanceComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/multimap/springboot/HazelcastMultimapComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/ringbuffer/springboot/HazelcastRingbufferComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/atomicnumber/springboot/HazelcastAtomicnumberComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.hazelcast.core.HazelcastInstance"` is unreachable
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/replicatedmap/springboot/HazelcastReplicatedmapComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.methvin.watcher.hashing.FileHasher"` is unreachable
in `components-starter/camel-file-watch-starter/src/main/java/org/apache/camel/component/file/watch/springboot/FileWatchComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.methvin.watcher.hashing.FileHasher": return applicationContext.getBean(ref, io.methvin.watcher.hashing.FileHasher.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.mail.GoogleMailClientFactory"` is unreachable
in `components-starter/camel-google-mail-starter/src/main/java/org/apache/camel/component/google/mail/stream/springboot/GoogleMailStreamComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.mail.GoogleMailClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.mail.GoogleMailClientFactory.class);
            case "org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration"` is unreachable
in `components-starter/camel-google-mail-starter/src/main/java/org/apache/camel/component/google/mail/stream/springboot/GoogleMailStreamComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.mail.GoogleMailClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.mail.GoogleMailClientFactory.class);
            case "org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.mail.GoogleMailConfiguration"` is unreachable
in `components-starter/camel-google-mail-starter/src/main/java/org/apache/camel/component/google/mail/springboot/GoogleMailComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.mail.GoogleMailConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.mail.GoogleMailConfiguration.class);
            case "org.apache.camel.component.google.mail.GoogleMailClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.mail.GoogleMailClientFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.mail.GoogleMailClientFactory"` is unreachable
in `components-starter/camel-google-mail-starter/src/main/java/org/apache/camel/component/google/mail/springboot/GoogleMailComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.mail.GoogleMailConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.mail.GoogleMailConfiguration.class);
            case "org.apache.camel.component.google.mail.GoogleMailClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.mail.GoogleMailClientFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.google.maps.GeoApiContext"` is unreachable
in `components-starter/camel-geocoder-starter/src/main/java/org/apache/camel/component/geocoder/springboot/GeoCoderComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.google.maps.GeoApiContext": return applicationContext.getBean(ref, com.google.maps.GeoApiContext.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration"` is unreachable
in `components-starter/camel-debezium-mongodb-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumMongodbComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.pulsar.PulsarConfiguration"` is unreachable
in `components-starter/camel-pulsar-starter/src/main/java/org/apache/camel/component/pulsar/springboot/PulsarComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.pulsar.PulsarConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.PulsarConfiguration.class);
            case "org.apache.pulsar.client.api.RedeliveryBackoff": return applicationContext.getBean(ref, org.apache.pulsar.client.api.RedeliveryBackoff.class);
            case "org.apache.camel.component.pulsar.PulsarMessageReceiptFactory": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.PulsarMessageReceiptFactory.class);
```

### DataFlowIssue
Switch label `"org.apache.pulsar.client.api.RedeliveryBackoff"` is unreachable
in `components-starter/camel-pulsar-starter/src/main/java/org/apache/camel/component/pulsar/springboot/PulsarComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.pulsar.PulsarConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.PulsarConfiguration.class);
            case "org.apache.pulsar.client.api.RedeliveryBackoff": return applicationContext.getBean(ref, org.apache.pulsar.client.api.RedeliveryBackoff.class);
            case "org.apache.camel.component.pulsar.PulsarMessageReceiptFactory": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.PulsarMessageReceiptFactory.class);
            case "org.apache.pulsar.client.api.BatcherBuilder": return applicationContext.getBean(ref, org.apache.pulsar.client.api.BatcherBuilder.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.pulsar.PulsarMessageReceiptFactory"` is unreachable
in `components-starter/camel-pulsar-starter/src/main/java/org/apache/camel/component/pulsar/springboot/PulsarComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.pulsar.PulsarConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.PulsarConfiguration.class);
            case "org.apache.pulsar.client.api.RedeliveryBackoff": return applicationContext.getBean(ref, org.apache.pulsar.client.api.RedeliveryBackoff.class);
            case "org.apache.camel.component.pulsar.PulsarMessageReceiptFactory": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.PulsarMessageReceiptFactory.class);
            case "org.apache.pulsar.client.api.BatcherBuilder": return applicationContext.getBean(ref, org.apache.pulsar.client.api.BatcherBuilder.class);
            case "org.apache.pulsar.client.api.MessageRouter": return applicationContext.getBean(ref, org.apache.pulsar.client.api.MessageRouter.class);
```

### DataFlowIssue
Switch label `"org.apache.pulsar.client.api.BatcherBuilder"` is unreachable
in `components-starter/camel-pulsar-starter/src/main/java/org/apache/camel/component/pulsar/springboot/PulsarComponentConverter.java`
#### Snippet
```java
            case "org.apache.pulsar.client.api.RedeliveryBackoff": return applicationContext.getBean(ref, org.apache.pulsar.client.api.RedeliveryBackoff.class);
            case "org.apache.camel.component.pulsar.PulsarMessageReceiptFactory": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.PulsarMessageReceiptFactory.class);
            case "org.apache.pulsar.client.api.BatcherBuilder": return applicationContext.getBean(ref, org.apache.pulsar.client.api.BatcherBuilder.class);
            case "org.apache.pulsar.client.api.MessageRouter": return applicationContext.getBean(ref, org.apache.pulsar.client.api.MessageRouter.class);
            case "org.apache.camel.component.pulsar.utils.AutoConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.utils.AutoConfiguration.class);
```

### DataFlowIssue
Switch label `"org.apache.pulsar.client.api.MessageRouter"` is unreachable
in `components-starter/camel-pulsar-starter/src/main/java/org/apache/camel/component/pulsar/springboot/PulsarComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.pulsar.PulsarMessageReceiptFactory": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.PulsarMessageReceiptFactory.class);
            case "org.apache.pulsar.client.api.BatcherBuilder": return applicationContext.getBean(ref, org.apache.pulsar.client.api.BatcherBuilder.class);
            case "org.apache.pulsar.client.api.MessageRouter": return applicationContext.getBean(ref, org.apache.pulsar.client.api.MessageRouter.class);
            case "org.apache.camel.component.pulsar.utils.AutoConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.utils.AutoConfiguration.class);
            case "org.apache.pulsar.client.api.PulsarClient": return applicationContext.getBean(ref, org.apache.pulsar.client.api.PulsarClient.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.pulsar.utils.AutoConfiguration"` is unreachable
in `components-starter/camel-pulsar-starter/src/main/java/org/apache/camel/component/pulsar/springboot/PulsarComponentConverter.java`
#### Snippet
```java
            case "org.apache.pulsar.client.api.BatcherBuilder": return applicationContext.getBean(ref, org.apache.pulsar.client.api.BatcherBuilder.class);
            case "org.apache.pulsar.client.api.MessageRouter": return applicationContext.getBean(ref, org.apache.pulsar.client.api.MessageRouter.class);
            case "org.apache.camel.component.pulsar.utils.AutoConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.utils.AutoConfiguration.class);
            case "org.apache.pulsar.client.api.PulsarClient": return applicationContext.getBean(ref, org.apache.pulsar.client.api.PulsarClient.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.pulsar.client.api.PulsarClient"` is unreachable
in `components-starter/camel-pulsar-starter/src/main/java/org/apache/camel/component/pulsar/springboot/PulsarComponentConverter.java`
#### Snippet
```java
            case "org.apache.pulsar.client.api.MessageRouter": return applicationContext.getBean(ref, org.apache.pulsar.client.api.MessageRouter.class);
            case "org.apache.camel.component.pulsar.utils.AutoConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.pulsar.utils.AutoConfiguration.class);
            case "org.apache.pulsar.client.api.PulsarClient": return applicationContext.getBean(ref, org.apache.pulsar.client.api.PulsarClient.class);
        }
        return null;
```

### DataFlowIssue
Argument `isNotice` might be null
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
        try (InputStream isNotice = getClass().getResourceAsStream("/spring-boot-starter-NOTICE.txt");
             InputStream isLicense = getClass().getResourceAsStream("/spring-boot-starter-LICENSE.txt")) {
            notice = IOUtils.toString(isNotice, StandardCharsets.UTF_8);
            license = IOUtils.toString(isLicense, StandardCharsets.UTF_8);
        }
```

### DataFlowIssue
Argument `isLicense` might be null
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
             InputStream isLicense = getClass().getResourceAsStream("/spring-boot-starter-LICENSE.txt")) {
            notice = IOUtils.toString(isNotice, StandardCharsets.UTF_8);
            license = IOUtils.toString(isLicense, StandardCharsets.UTF_8);
        }

```

### DataFlowIssue
Switch label `"java.util.Properties"` is unreachable
in `components-starter/camel-stomp-starter/src/main/java/org/apache/camel/component/stomp/springboot/StompComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "org.apache.camel.component.stomp.StompConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.stomp.StompConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.stomp.StompConfiguration"` is unreachable
in `components-starter/camel-stomp-starter/src/main/java/org/apache/camel/component/stomp/springboot/StompComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "org.apache.camel.component.stomp.StompConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.stomp.StompConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.HeaderFilterStrategy"` is unreachable
in `components-starter/camel-stomp-starter/src/main/java/org/apache/camel/component/stomp/springboot/StompComponentConverter.java`
#### Snippet
```java
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "org.apache.camel.component.stomp.StompConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.stomp.StompConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-stomp-starter/src/main/java/org/apache/camel/component/stomp/springboot/StompComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.stomp.StompConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.stomp.StompConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration"` is unreachable
in `components-starter/camel-infinispan-starter/src/main/java/org/apache/camel/component/infinispan/remote/springboot/InfinispanRemoteComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration.class);
            case "org.apache.camel.component.infinispan.InfinispanQueryBuilder": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
            case "org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.infinispan.InfinispanQueryBuilder"` is unreachable
in `components-starter/camel-infinispan-starter/src/main/java/org/apache/camel/component/infinispan/remote/springboot/InfinispanRemoteComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration.class);
            case "org.apache.camel.component.infinispan.InfinispanQueryBuilder": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
            case "org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener.class);
            case "org.infinispan.client.hotrod.RemoteCacheManager": return applicationContext.getBean(ref, org.infinispan.client.hotrod.RemoteCacheManager.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener"` is unreachable
in `components-starter/camel-infinispan-starter/src/main/java/org/apache/camel/component/infinispan/remote/springboot/InfinispanRemoteComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration.class);
            case "org.apache.camel.component.infinispan.InfinispanQueryBuilder": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
            case "org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener.class);
            case "org.infinispan.client.hotrod.RemoteCacheManager": return applicationContext.getBean(ref, org.infinispan.client.hotrod.RemoteCacheManager.class);
            case "org.infinispan.client.hotrod.configuration.Configuration": return applicationContext.getBean(ref, org.infinispan.client.hotrod.configuration.Configuration.class);
```

### DataFlowIssue
Switch label `"org.infinispan.client.hotrod.RemoteCacheManager"` is unreachable
in `components-starter/camel-infinispan-starter/src/main/java/org/apache/camel/component/infinispan/remote/springboot/InfinispanRemoteComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.infinispan.InfinispanQueryBuilder": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
            case "org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener.class);
            case "org.infinispan.client.hotrod.RemoteCacheManager": return applicationContext.getBean(ref, org.infinispan.client.hotrod.RemoteCacheManager.class);
            case "org.infinispan.client.hotrod.configuration.Configuration": return applicationContext.getBean(ref, org.infinispan.client.hotrod.configuration.Configuration.class);
            case "java.util.function.BiFunction": return applicationContext.getBean(ref, java.util.function.BiFunction.class);
```

### DataFlowIssue
Switch label `"org.infinispan.client.hotrod.configuration.Configuration"` is unreachable
in `components-starter/camel-infinispan-starter/src/main/java/org/apache/camel/component/infinispan/remote/springboot/InfinispanRemoteComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener": return applicationContext.getBean(ref, org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener.class);
            case "org.infinispan.client.hotrod.RemoteCacheManager": return applicationContext.getBean(ref, org.infinispan.client.hotrod.RemoteCacheManager.class);
            case "org.infinispan.client.hotrod.configuration.Configuration": return applicationContext.getBean(ref, org.infinispan.client.hotrod.configuration.Configuration.class);
            case "java.util.function.BiFunction": return applicationContext.getBean(ref, java.util.function.BiFunction.class);
        }
```

### DataFlowIssue
Switch label `"java.util.function.BiFunction"` is unreachable
in `components-starter/camel-infinispan-starter/src/main/java/org/apache/camel/component/infinispan/remote/springboot/InfinispanRemoteComponentConverter.java`
#### Snippet
```java
            case "org.infinispan.client.hotrod.RemoteCacheManager": return applicationContext.getBean(ref, org.infinispan.client.hotrod.RemoteCacheManager.class);
            case "org.infinispan.client.hotrod.configuration.Configuration": return applicationContext.getBean(ref, org.infinispan.client.hotrod.configuration.Configuration.class);
            case "java.util.function.BiFunction": return applicationContext.getBean(ref, java.util.function.BiFunction.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"javax.security.auth.login.Configuration"` is unreachable
in `components-starter/camel-hdfs-starter/src/main/java/org/apache/camel/component/hdfs/springboot/HdfsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.security.auth.login.Configuration": return applicationContext.getBean(ref, javax.security.auth.login.Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.ses.SesClient"` is unreachable
in `components-starter/camel-aws2-ses-starter/src/main/java/org/apache/camel/component/aws2/ses/springboot/Ses2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.ses.SesClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.ses.SesClient.class);
            case "org.apache.camel.component.aws2.ses.Ses2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ses.Ses2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.ses.Ses2Configuration"` is unreachable
in `components-starter/camel-aws2-ses-starter/src/main/java/org/apache/camel/component/aws2/ses/springboot/Ses2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.ses.SesClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.ses.SesClient.class);
            case "org.apache.camel.component.aws2.ses.Ses2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ses.Ses2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"net.sf.saxon.Configuration"` is unreachable
in `components-starter/camel-xj-starter/src/main/java/org/apache/camel/component/xj/springboot/XJComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "net.sf.saxon.Configuration": return applicationContext.getBean(ref, net.sf.saxon.Configuration.class);
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy"` is unreachable
in `components-starter/camel-xj-starter/src/main/java/org/apache/camel/component/xj/springboot/XJComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "net.sf.saxon.Configuration": return applicationContext.getBean(ref, net.sf.saxon.Configuration.class);
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
```

### DataFlowIssue
Switch label `"javax.xml.transform.URIResolver"` is unreachable
in `components-starter/camel-xj-starter/src/main/java/org/apache/camel/component/xj/springboot/XJComponentConverter.java`
#### Snippet
```java
            case "net.sf.saxon.Configuration": return applicationContext.getBean(ref, net.sf.saxon.Configuration.class);
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.xslt.XsltUriResolverFactory"` is unreachable
in `components-starter/camel-xj-starter/src/main/java/org/apache/camel/component/xj/springboot/XJComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.azure.storage.blob.BlobConfiguration"` is unreachable
in `components-starter/camel-azure-storage-blob-starter/src/main/java/org/apache/camel/component/azure/storage/blob/springboot/BlobComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.azure.storage.blob.BlobConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.storage.blob.BlobConfiguration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "com.azure.storage.blob.BlobServiceClient": return applicationContext.getBean(ref, com.azure.storage.blob.BlobServiceClient.class);
```

### DataFlowIssue
Switch label `"com.azure.storage.common.StorageSharedKeyCredential"` is unreachable
in `components-starter/camel-azure-storage-blob-starter/src/main/java/org/apache/camel/component/azure/storage/blob/springboot/BlobComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.azure.storage.blob.BlobConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.storage.blob.BlobConfiguration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "com.azure.storage.blob.BlobServiceClient": return applicationContext.getBean(ref, com.azure.storage.blob.BlobServiceClient.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
```

### DataFlowIssue
Switch label `"com.azure.storage.blob.BlobServiceClient"` is unreachable
in `components-starter/camel-azure-storage-blob-starter/src/main/java/org/apache/camel/component/azure/storage/blob/springboot/BlobComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.azure.storage.blob.BlobConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.storage.blob.BlobConfiguration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "com.azure.storage.blob.BlobServiceClient": return applicationContext.getBean(ref, com.azure.storage.blob.BlobServiceClient.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.core.util.Context": return applicationContext.getBean(ref, com.azure.core.util.Context.class);
```

### DataFlowIssue
Switch label `"java.time.Duration"` is unreachable
in `components-starter/camel-azure-storage-blob-starter/src/main/java/org/apache/camel/component/azure/storage/blob/springboot/BlobComponentConverter.java`
#### Snippet
```java
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
            case "com.azure.storage.blob.BlobServiceClient": return applicationContext.getBean(ref, com.azure.storage.blob.BlobServiceClient.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.core.util.Context": return applicationContext.getBean(ref, com.azure.core.util.Context.class);
            case "java.time.OffsetDateTime": return applicationContext.getBean(ref, java.time.OffsetDateTime.class);
```

### DataFlowIssue
Switch label `"com.azure.core.util.Context"` is unreachable
in `components-starter/camel-azure-storage-blob-starter/src/main/java/org/apache/camel/component/azure/storage/blob/springboot/BlobComponentConverter.java`
#### Snippet
```java
            case "com.azure.storage.blob.BlobServiceClient": return applicationContext.getBean(ref, com.azure.storage.blob.BlobServiceClient.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.core.util.Context": return applicationContext.getBean(ref, com.azure.core.util.Context.class);
            case "java.time.OffsetDateTime": return applicationContext.getBean(ref, java.time.OffsetDateTime.class);
        }
```

### DataFlowIssue
Switch label `"java.time.OffsetDateTime"` is unreachable
in `components-starter/camel-azure-storage-blob-starter/src/main/java/org/apache/camel/component/azure/storage/blob/springboot/BlobComponentConverter.java`
#### Snippet
```java
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.core.util.Context": return applicationContext.getBean(ref, com.azure.core.util.Context.class);
            case "java.time.OffsetDateTime": return applicationContext.getBean(ref, java.time.OffsetDateTime.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.minio.MinioConfiguration"` is unreachable
in `components-starter/camel-minio-starter/src/main/java/org/apache/camel/component/minio/springboot/MinioComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.minio.MinioConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.minio.MinioConfiguration.class);
            case "okhttp3.OkHttpClient": return applicationContext.getBean(ref, okhttp3.OkHttpClient.class);
            case "io.minio.MinioClient": return applicationContext.getBean(ref, io.minio.MinioClient.class);
```

### DataFlowIssue
Switch label `"okhttp3.OkHttpClient"` is unreachable
in `components-starter/camel-minio-starter/src/main/java/org/apache/camel/component/minio/springboot/MinioComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.minio.MinioConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.minio.MinioConfiguration.class);
            case "okhttp3.OkHttpClient": return applicationContext.getBean(ref, okhttp3.OkHttpClient.class);
            case "io.minio.MinioClient": return applicationContext.getBean(ref, io.minio.MinioClient.class);
            case "io.minio.ServerSideEncryption": return applicationContext.getBean(ref, io.minio.ServerSideEncryption.class);
```

### DataFlowIssue
Switch label `"io.minio.MinioClient"` is unreachable
in `components-starter/camel-minio-starter/src/main/java/org/apache/camel/component/minio/springboot/MinioComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.minio.MinioConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.minio.MinioConfiguration.class);
            case "okhttp3.OkHttpClient": return applicationContext.getBean(ref, okhttp3.OkHttpClient.class);
            case "io.minio.MinioClient": return applicationContext.getBean(ref, io.minio.MinioClient.class);
            case "io.minio.ServerSideEncryption": return applicationContext.getBean(ref, io.minio.ServerSideEncryption.class);
            case "io.minio.ServerSideEncryptionCustomerKey": return applicationContext.getBean(ref, io.minio.ServerSideEncryptionCustomerKey.class);
```

### DataFlowIssue
Switch label `"io.minio.ServerSideEncryption"` is unreachable
in `components-starter/camel-minio-starter/src/main/java/org/apache/camel/component/minio/springboot/MinioComponentConverter.java`
#### Snippet
```java
            case "okhttp3.OkHttpClient": return applicationContext.getBean(ref, okhttp3.OkHttpClient.class);
            case "io.minio.MinioClient": return applicationContext.getBean(ref, io.minio.MinioClient.class);
            case "io.minio.ServerSideEncryption": return applicationContext.getBean(ref, io.minio.ServerSideEncryption.class);
            case "io.minio.ServerSideEncryptionCustomerKey": return applicationContext.getBean(ref, io.minio.ServerSideEncryptionCustomerKey.class);
            case "java.time.ZonedDateTime": return applicationContext.getBean(ref, java.time.ZonedDateTime.class);
```

### DataFlowIssue
Switch label `"io.minio.ServerSideEncryptionCustomerKey"` is unreachable
in `components-starter/camel-minio-starter/src/main/java/org/apache/camel/component/minio/springboot/MinioComponentConverter.java`
#### Snippet
```java
            case "io.minio.MinioClient": return applicationContext.getBean(ref, io.minio.MinioClient.class);
            case "io.minio.ServerSideEncryption": return applicationContext.getBean(ref, io.minio.ServerSideEncryption.class);
            case "io.minio.ServerSideEncryptionCustomerKey": return applicationContext.getBean(ref, io.minio.ServerSideEncryptionCustomerKey.class);
            case "java.time.ZonedDateTime": return applicationContext.getBean(ref, java.time.ZonedDateTime.class);
        }
```

### DataFlowIssue
Switch label `"java.time.ZonedDateTime"` is unreachable
in `components-starter/camel-minio-starter/src/main/java/org/apache/camel/component/minio/springboot/MinioComponentConverter.java`
#### Snippet
```java
            case "io.minio.ServerSideEncryption": return applicationContext.getBean(ref, io.minio.ServerSideEncryption.class);
            case "io.minio.ServerSideEncryptionCustomerKey": return applicationContext.getBean(ref, io.minio.ServerSideEncryptionCustomerKey.class);
            case "java.time.ZonedDateTime": return applicationContext.getBean(ref, java.time.ZonedDateTime.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.ignite.Ignite"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/set/springboot/IgniteSetComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.ignite.configuration.IgniteConfiguration"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/set/springboot/IgniteSetComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.cloudwatch.CloudWatchClient"` is unreachable
in `components-starter/camel-aws2-cw-starter/src/main/java/org/apache/camel/component/aws2/cw/springboot/Cw2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.cloudwatch.CloudWatchClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.cloudwatch.CloudWatchClient.class);
            case "org.apache.camel.component.aws2.cw.Cw2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.cw.Cw2Configuration.class);
            case "java.time.Instant": return applicationContext.getBean(ref, java.time.Instant.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.cw.Cw2Configuration"` is unreachable
in `components-starter/camel-aws2-cw-starter/src/main/java/org/apache/camel/component/aws2/cw/springboot/Cw2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.cloudwatch.CloudWatchClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.cloudwatch.CloudWatchClient.class);
            case "org.apache.camel.component.aws2.cw.Cw2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.cw.Cw2Configuration.class);
            case "java.time.Instant": return applicationContext.getBean(ref, java.time.Instant.class);
        }
```

### DataFlowIssue
Switch label `"java.time.Instant"` is unreachable
in `components-starter/camel-aws2-cw-starter/src/main/java/org/apache/camel/component/aws2/cw/springboot/Cw2ComponentConverter.java`
#### Snippet
```java
            case "software.amazon.awssdk.services.cloudwatch.CloudWatchClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.cloudwatch.CloudWatchClient.class);
            case "org.apache.camel.component.aws2.cw.Cw2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.cw.Cw2Configuration.class);
            case "java.time.Instant": return applicationContext.getBean(ref, java.time.Instant.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.ignite.Ignite"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/cache/springboot/IgniteCacheComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.ignite.configuration.IgniteConfiguration"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/cache/springboot/IgniteCacheComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.ignite.Ignite"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/idgen/springboot/IgniteIdGenComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.ignite.configuration.IgniteConfiguration"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/idgen/springboot/IgniteIdGenComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.ignite.Ignite"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/queue/springboot/IgniteQueueComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.ignite.configuration.IgniteConfiguration"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/queue/springboot/IgniteQueueComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.ignite.Ignite"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/events/springboot/IgniteEventsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.ignite.configuration.IgniteConfiguration"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/events/springboot/IgniteEventsComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.ignite.Ignite"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/compute/springboot/IgniteComputeComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.ignite.configuration.IgniteConfiguration"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/compute/springboot/IgniteComputeComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.ignite.Ignite"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/messaging/springboot/IgniteMessagingComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.ignite.configuration.IgniteConfiguration"` is unreachable
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/messaging/springboot/IgniteMessagingComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.mapstruct.MapStructMapperFinder"` is unreachable
in `components-starter/camel-mapstruct-starter/src/main/java/org/apache/camel/component/mapstruct/springboot/MapstructComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.mapstruct.MapStructMapperFinder": return applicationContext.getBean(ref, org.apache.camel.component.mapstruct.MapStructMapperFinder.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.mongodb.client.MongoClient"` is unreachable
in `components-starter/camel-mongodb-starter/src/main/java/org/apache/camel/component/mongodb/springboot/MongoDbComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.mongodb.client.MongoClient": return applicationContext.getBean(ref, com.mongodb.client.MongoClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.athena.AthenaClient"` is unreachable
in `components-starter/camel-aws2-athena-starter/src/main/java/org/apache/camel/component/aws2/athena/springboot/Athena2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.athena.AthenaClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.athena.AthenaClient.class);
            case "org.apache.camel.component.aws2.athena.Athena2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.athena.Athena2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.athena.Athena2Configuration"` is unreachable
in `components-starter/camel-aws2-athena-starter/src/main/java/org/apache/camel/component/aws2/athena/springboot/Athena2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.athena.AthenaClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.athena.AthenaClient.class);
            case "org.apache.camel.component.aws2.athena.Athena2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.athena.Athena2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.NettyConfiguration"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.netty.NettyConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyConfiguration.class);
            case "io.netty.channel.EventLoopGroup": return applicationContext.getBean(ref, io.netty.channel.EventLoopGroup.class);
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
```

### DataFlowIssue
Switch label `"io.netty.channel.EventLoopGroup"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.netty.NettyConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyConfiguration.class);
            case "io.netty.channel.EventLoopGroup": return applicationContext.getBean(ref, io.netty.channel.EventLoopGroup.class);
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
```

### DataFlowIssue
Switch label `"io.netty.util.concurrent.EventExecutorGroup"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.NettyConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyConfiguration.class);
            case "io.netty.channel.EventLoopGroup": return applicationContext.getBean(ref, io.netty.channel.EventLoopGroup.class);
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.NettyServerBootstrapFactory"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
            case "io.netty.channel.EventLoopGroup": return applicationContext.getBean(ref, io.netty.channel.EventLoopGroup.class);
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.ServerInitializerFactory"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
            case "io.netty.util.concurrent.EventExecutorGroup": return applicationContext.getBean(ref, io.netty.util.concurrent.EventExecutorGroup.class);
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.ClientInitializerFactory"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.netty.NettyCamelStateCorrelationManager"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.ServerInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"io.netty.channel.group.ChannelGroup"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.ClientInitializerFactory": return applicationContext.getBean(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "io.netty.handler.ssl.SslHandler": return applicationContext.getBean(ref, io.netty.handler.ssl.SslHandler.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return applicationContext.getBean(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "io.netty.handler.ssl.SslHandler": return applicationContext.getBean(ref, io.netty.handler.ssl.SslHandler.class);
        }
```

### DataFlowIssue
Switch label `"io.netty.handler.ssl.SslHandler"` is unreachable
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConverter.java`
#### Snippet
```java
            case "io.netty.channel.group.ChannelGroup": return applicationContext.getBean(ref, io.netty.channel.group.ChannelGroup.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "io.netty.handler.ssl.SslHandler": return applicationContext.getBean(ref, io.netty.handler.ssl.SslHandler.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration"` is unreachable
in `components-starter/camel-google-storage-starter/src/main/java/org/apache/camel/component/google/storage/springboot/GoogleCloudStorageComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration.class);
            case "com.google.cloud.storage.StorageClass": return applicationContext.getBean(ref, com.google.cloud.storage.StorageClass.class);
            case "com.google.cloud.storage.Storage": return applicationContext.getBean(ref, com.google.cloud.storage.Storage.class);
```

### DataFlowIssue
Switch label `"com.google.cloud.storage.StorageClass"` is unreachable
in `components-starter/camel-google-storage-starter/src/main/java/org/apache/camel/component/google/storage/springboot/GoogleCloudStorageComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration.class);
            case "com.google.cloud.storage.StorageClass": return applicationContext.getBean(ref, com.google.cloud.storage.StorageClass.class);
            case "com.google.cloud.storage.Storage": return applicationContext.getBean(ref, com.google.cloud.storage.Storage.class);
        }
```

### DataFlowIssue
Switch label `"com.google.cloud.storage.Storage"` is unreachable
in `components-starter/camel-google-storage-starter/src/main/java/org/apache/camel/component/google/storage/springboot/GoogleCloudStorageComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration.class);
            case "com.google.cloud.storage.StorageClass": return applicationContext.getBean(ref, com.google.cloud.storage.StorageClass.class);
            case "com.google.cloud.storage.Storage": return applicationContext.getBean(ref, com.google.cloud.storage.Storage.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.spi.RouteTemplateLoaderListener"` is unreachable
in `components-starter/camel-kamelet-starter/src/main/java/org/apache/camel/component/kamelet/springboot/KameletComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.RouteTemplateLoaderListener": return applicationContext.getBean(ref, org.apache.camel.spi.RouteTemplateLoaderListener.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.zookeeper.ZooKeeperConfiguration"` is unreachable
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/ZooKeeperComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.zookeeper.ZooKeeperConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.zookeeper.ZooKeeperConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.cloud.ServiceRegistry"` is unreachable
in `components-starter/camel-service-starter/src/main/java/org/apache/camel/component/service/springboot/ServiceComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.cloud.ServiceRegistry": return applicationContext.getBean(ref, org.apache.camel.cloud.ServiceRegistry.class);
            case "org.apache.camel.cloud.ServiceRegistry.Selector": return applicationContext.getBean(ref, org.apache.camel.cloud.ServiceRegistry.Selector.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.cloud.ServiceRegistry.Selector"` is unreachable
in `components-starter/camel-service-starter/src/main/java/org/apache/camel/component/service/springboot/ServiceComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.cloud.ServiceRegistry": return applicationContext.getBean(ref, org.apache.camel.cloud.ServiceRegistry.class);
            case "org.apache.camel.cloud.ServiceRegistry.Selector": return applicationContext.getBean(ref, org.apache.camel.cloud.ServiceRegistry.Selector.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.ec2.Ec2Client"` is unreachable
in `components-starter/camel-aws2-ec2-starter/src/main/java/org/apache/camel/component/aws2/ec2/springboot/AWS2EC2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.ec2.Ec2Client": return applicationContext.getBean(ref, software.amazon.awssdk.services.ec2.Ec2Client.class);
            case "org.apache.camel.component.aws2.ec2.AWS2EC2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ec2.AWS2EC2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.ec2.AWS2EC2Configuration"` is unreachable
in `components-starter/camel-aws2-ec2-starter/src/main/java/org/apache/camel/component/aws2/ec2/springboot/AWS2EC2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.ec2.Ec2Client": return applicationContext.getBean(ref, software.amazon.awssdk.services.ec2.Ec2Client.class);
            case "org.apache.camel.component.aws2.ec2.AWS2EC2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.ec2.AWS2EC2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.salesforce.SalesforceHttpClient"` is unreachable
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.salesforce.SalesforceHttpClient": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceHttpClient.class);
            case "com.fasterxml.jackson.databind.ObjectMapper": return applicationContext.getBean(ref, com.fasterxml.jackson.databind.ObjectMapper.class);
            case "org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class);
```

### DataFlowIssue
Switch label `"com.fasterxml.jackson.databind.ObjectMapper"` is unreachable
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.salesforce.SalesforceHttpClient": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceHttpClient.class);
            case "com.fasterxml.jackson.databind.ObjectMapper": return applicationContext.getBean(ref, com.fasterxml.jackson.databind.ObjectMapper.class);
            case "org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class);
            case "org.apache.camel.component.salesforce.SalesforceEndpointConfig": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceEndpointConfig.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata"` is unreachable
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.salesforce.SalesforceHttpClient": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceHttpClient.class);
            case "com.fasterxml.jackson.databind.ObjectMapper": return applicationContext.getBean(ref, com.fasterxml.jackson.databind.ObjectMapper.class);
            case "org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class);
            case "org.apache.camel.component.salesforce.SalesforceEndpointConfig": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceEndpointConfig.class);
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.salesforce.SalesforceEndpointConfig"` is unreachable
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConverter.java`
#### Snippet
```java
            case "com.fasterxml.jackson.databind.ObjectMapper": return applicationContext.getBean(ref, com.fasterxml.jackson.databind.ObjectMapper.class);
            case "org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class);
            case "org.apache.camel.component.salesforce.SalesforceEndpointConfig": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceEndpointConfig.class);
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
            case "org.apache.camel.component.salesforce.SalesforceLoginConfig": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceLoginConfig.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.KeyStoreParameters"` is unreachable
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class);
            case "org.apache.camel.component.salesforce.SalesforceEndpointConfig": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceEndpointConfig.class);
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
            case "org.apache.camel.component.salesforce.SalesforceLoginConfig": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceLoginConfig.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.salesforce.SalesforceLoginConfig"` is unreachable
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.salesforce.SalesforceEndpointConfig": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceEndpointConfig.class);
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
            case "org.apache.camel.component.salesforce.SalesforceLoginConfig": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceLoginConfig.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.support.jsse.KeyStoreParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.KeyStoreParameters.class);
            case "org.apache.camel.component.salesforce.SalesforceLoginConfig": return applicationContext.getBean(ref, org.apache.camel.component.salesforce.SalesforceLoginConfig.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"quickfix.LogFactory"` is unreachable
in `components-starter/camel-quickfix-starter/src/main/java/org/apache/camel/component/quickfixj/springboot/QuickfixjComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "quickfix.LogFactory": return applicationContext.getBean(ref, quickfix.LogFactory.class);
            case "quickfix.MessageFactory": return applicationContext.getBean(ref, quickfix.MessageFactory.class);
            case "quickfix.MessageStoreFactory": return applicationContext.getBean(ref, quickfix.MessageStoreFactory.class);
```

### DataFlowIssue
Switch label `"quickfix.MessageFactory"` is unreachable
in `components-starter/camel-quickfix-starter/src/main/java/org/apache/camel/component/quickfixj/springboot/QuickfixjComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "quickfix.LogFactory": return applicationContext.getBean(ref, quickfix.LogFactory.class);
            case "quickfix.MessageFactory": return applicationContext.getBean(ref, quickfix.MessageFactory.class);
            case "quickfix.MessageStoreFactory": return applicationContext.getBean(ref, quickfix.MessageStoreFactory.class);
        }
```

### DataFlowIssue
Switch label `"quickfix.MessageStoreFactory"` is unreachable
in `components-starter/camel-quickfix-starter/src/main/java/org/apache/camel/component/quickfixj/springboot/QuickfixjComponentConverter.java`
#### Snippet
```java
            case "quickfix.LogFactory": return applicationContext.getBean(ref, quickfix.LogFactory.class);
            case "quickfix.MessageFactory": return applicationContext.getBean(ref, quickfix.MessageFactory.class);
            case "quickfix.MessageStoreFactory": return applicationContext.getBean(ref, quickfix.MessageStoreFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.paho.PahoConfiguration"` is unreachable
in `components-starter/camel-paho-starter/src/main/java/org/apache/camel/component/paho/springboot/PahoComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.paho.PahoConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.paho.PahoConfiguration.class);
            case "org.eclipse.paho.client.mqttv3.MqttClient": return applicationContext.getBean(ref, org.eclipse.paho.client.mqttv3.MqttClient.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
```

### DataFlowIssue
Switch label `"org.eclipse.paho.client.mqttv3.MqttClient"` is unreachable
in `components-starter/camel-paho-starter/src/main/java/org/apache/camel/component/paho/springboot/PahoComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.paho.PahoConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.paho.PahoConfiguration.class);
            case "org.eclipse.paho.client.mqttv3.MqttClient": return applicationContext.getBean(ref, org.eclipse.paho.client.mqttv3.MqttClient.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "javax.net.SocketFactory": return applicationContext.getBean(ref, javax.net.SocketFactory.class);
```

### DataFlowIssue
Switch label `"java.util.Properties"` is unreachable
in `components-starter/camel-paho-starter/src/main/java/org/apache/camel/component/paho/springboot/PahoComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.paho.PahoConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.paho.PahoConfiguration.class);
            case "org.eclipse.paho.client.mqttv3.MqttClient": return applicationContext.getBean(ref, org.eclipse.paho.client.mqttv3.MqttClient.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "javax.net.SocketFactory": return applicationContext.getBean(ref, javax.net.SocketFactory.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
```

### DataFlowIssue
Switch label `"javax.net.SocketFactory"` is unreachable
in `components-starter/camel-paho-starter/src/main/java/org/apache/camel/component/paho/springboot/PahoComponentConverter.java`
#### Snippet
```java
            case "org.eclipse.paho.client.mqttv3.MqttClient": return applicationContext.getBean(ref, org.eclipse.paho.client.mqttv3.MqttClient.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "javax.net.SocketFactory": return applicationContext.getBean(ref, javax.net.SocketFactory.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
        }
```

### DataFlowIssue
Switch label `"javax.net.ssl.HostnameVerifier"` is unreachable
in `components-starter/camel-paho-starter/src/main/java/org/apache/camel/component/paho/springboot/PahoComponentConverter.java`
#### Snippet
```java
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "javax.net.SocketFactory": return applicationContext.getBean(ref, javax.net.SocketFactory.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.translate.Translate2Configuration"` is unreachable
in `components-starter/camel-aws2-translate-starter/src/main/java/org/apache/camel/component/aws2/translate/springboot/Translate2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.translate.Translate2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.translate.Translate2Configuration.class);
            case "software.amazon.awssdk.services.translate.TranslateClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.translate.TranslateClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.translate.TranslateClient"` is unreachable
in `components-starter/camel-aws2-translate-starter/src/main/java/org/apache/camel/component/aws2/translate/springboot/Translate2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.translate.Translate2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.translate.Translate2Configuration.class);
            case "software.amazon.awssdk.services.translate.TranslateClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.translate.TranslateClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.sqs.SqsClient"` is unreachable
in `components-starter/camel-aws2-sqs-starter/src/main/java/org/apache/camel/component/aws2/sqs/springboot/Sqs2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.sqs.SqsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.sqs.SqsClient.class);
            case "org.apache.camel.component.aws2.sqs.Sqs2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.sqs.Sqs2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.sqs.Sqs2Configuration"` is unreachable
in `components-starter/camel-aws2-sqs-starter/src/main/java/org/apache/camel/component/aws2/sqs/springboot/Sqs2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.sqs.SqsClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.sqs.SqsClient.class);
            case "org.apache.camel.component.aws2.sqs.Sqs2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.sqs.Sqs2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration"` is unreachable
in `components-starter/camel-debezium-postgres-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumPostgresComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"javax.sql.DataSource"` is unreachable
in `components-starter/camel-sql-starter/src/main/java/org/apache/camel/component/sql/stored/springboot/SqlStoredComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.sql.DataSource": return applicationContext.getBean(ref, javax.sql.DataSource.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"javax.sql.DataSource"` is unreachable
in `components-starter/camel-sql-starter/src/main/java/org/apache/camel/component/sql/springboot/SqlComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.sql.DataSource": return applicationContext.getBean(ref, javax.sql.DataSource.class);
            case "org.apache.camel.component.sql.RowMapperFactory": return applicationContext.getBean(ref, org.apache.camel.component.sql.RowMapperFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.sql.RowMapperFactory"` is unreachable
in `components-starter/camel-sql-starter/src/main/java/org/apache/camel/component/sql/springboot/SqlComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "javax.sql.DataSource": return applicationContext.getBean(ref, javax.sql.DataSource.class);
            case "org.apache.camel.component.sql.RowMapperFactory": return applicationContext.getBean(ref, org.apache.camel.component.sql.RowMapperFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration"` is unreachable
in `components-starter/camel-paho-mqtt5-starter/src/main/java/org/apache/camel/component/paho/mqtt5/springboot/PahoMqtt5ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration": return applicationContext.getBean(ref, org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration.class);
            case "org.eclipse.paho.mqttv5.common.packet.MqttProperties": return applicationContext.getBean(ref, org.eclipse.paho.mqttv5.common.packet.MqttProperties.class);
            case "org.eclipse.paho.mqttv5.client.MqttClient": return applicationContext.getBean(ref, org.eclipse.paho.mqttv5.client.MqttClient.class);
```

### DataFlowIssue
Switch label `"org.eclipse.paho.mqttv5.common.packet.MqttProperties"` is unreachable
in `components-starter/camel-paho-mqtt5-starter/src/main/java/org/apache/camel/component/paho/mqtt5/springboot/PahoMqtt5ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration": return applicationContext.getBean(ref, org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration.class);
            case "org.eclipse.paho.mqttv5.common.packet.MqttProperties": return applicationContext.getBean(ref, org.eclipse.paho.mqttv5.common.packet.MqttProperties.class);
            case "org.eclipse.paho.mqttv5.client.MqttClient": return applicationContext.getBean(ref, org.eclipse.paho.mqttv5.client.MqttClient.class);
            case "javax.net.SocketFactory": return applicationContext.getBean(ref, javax.net.SocketFactory.class);
```

### DataFlowIssue
Switch label `"org.eclipse.paho.mqttv5.client.MqttClient"` is unreachable
in `components-starter/camel-paho-mqtt5-starter/src/main/java/org/apache/camel/component/paho/mqtt5/springboot/PahoMqtt5ComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration": return applicationContext.getBean(ref, org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration.class);
            case "org.eclipse.paho.mqttv5.common.packet.MqttProperties": return applicationContext.getBean(ref, org.eclipse.paho.mqttv5.common.packet.MqttProperties.class);
            case "org.eclipse.paho.mqttv5.client.MqttClient": return applicationContext.getBean(ref, org.eclipse.paho.mqttv5.client.MqttClient.class);
            case "javax.net.SocketFactory": return applicationContext.getBean(ref, javax.net.SocketFactory.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
```

### DataFlowIssue
Switch label `"javax.net.SocketFactory"` is unreachable
in `components-starter/camel-paho-mqtt5-starter/src/main/java/org/apache/camel/component/paho/mqtt5/springboot/PahoMqtt5ComponentConverter.java`
#### Snippet
```java
            case "org.eclipse.paho.mqttv5.common.packet.MqttProperties": return applicationContext.getBean(ref, org.eclipse.paho.mqttv5.common.packet.MqttProperties.class);
            case "org.eclipse.paho.mqttv5.client.MqttClient": return applicationContext.getBean(ref, org.eclipse.paho.mqttv5.client.MqttClient.class);
            case "javax.net.SocketFactory": return applicationContext.getBean(ref, javax.net.SocketFactory.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
```

### DataFlowIssue
Switch label `"java.util.Properties"` is unreachable
in `components-starter/camel-paho-mqtt5-starter/src/main/java/org/apache/camel/component/paho/mqtt5/springboot/PahoMqtt5ComponentConverter.java`
#### Snippet
```java
            case "org.eclipse.paho.mqttv5.client.MqttClient": return applicationContext.getBean(ref, org.eclipse.paho.mqttv5.client.MqttClient.class);
            case "javax.net.SocketFactory": return applicationContext.getBean(ref, javax.net.SocketFactory.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
        }
```

### DataFlowIssue
Switch label `"javax.net.ssl.HostnameVerifier"` is unreachable
in `components-starter/camel-paho-mqtt5-starter/src/main/java/org/apache/camel/component/paho/mqtt5/springboot/PahoMqtt5ComponentConverter.java`
#### Snippet
```java
            case "javax.net.SocketFactory": return applicationContext.getBean(ref, javax.net.SocketFactory.class);
            case "java.util.Properties": return applicationContext.getBean(ref, java.util.Properties.class);
            case "javax.net.ssl.HostnameVerifier": return applicationContext.getBean(ref, javax.net.ssl.HostnameVerifier.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.stitch.StitchConfiguration"` is unreachable
in `components-starter/camel-stitch-starter/src/main/java/org/apache/camel/component/stitch/springboot/StitchComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.stitch.StitchConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.stitch.StitchConfiguration.class);
            case "org.apache.camel.component.stitch.client.models.StitchSchema": return applicationContext.getBean(ref, org.apache.camel.component.stitch.client.models.StitchSchema.class);
            case "reactor.netty.resources.ConnectionProvider": return applicationContext.getBean(ref, reactor.netty.resources.ConnectionProvider.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.stitch.client.models.StitchSchema"` is unreachable
in `components-starter/camel-stitch-starter/src/main/java/org/apache/camel/component/stitch/springboot/StitchComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.stitch.StitchConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.stitch.StitchConfiguration.class);
            case "org.apache.camel.component.stitch.client.models.StitchSchema": return applicationContext.getBean(ref, org.apache.camel.component.stitch.client.models.StitchSchema.class);
            case "reactor.netty.resources.ConnectionProvider": return applicationContext.getBean(ref, reactor.netty.resources.ConnectionProvider.class);
            case "reactor.netty.http.client.HttpClient": return applicationContext.getBean(ref, reactor.netty.http.client.HttpClient.class);
```

### DataFlowIssue
Switch label `"reactor.netty.resources.ConnectionProvider"` is unreachable
in `components-starter/camel-stitch-starter/src/main/java/org/apache/camel/component/stitch/springboot/StitchComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.stitch.StitchConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.stitch.StitchConfiguration.class);
            case "org.apache.camel.component.stitch.client.models.StitchSchema": return applicationContext.getBean(ref, org.apache.camel.component.stitch.client.models.StitchSchema.class);
            case "reactor.netty.resources.ConnectionProvider": return applicationContext.getBean(ref, reactor.netty.resources.ConnectionProvider.class);
            case "reactor.netty.http.client.HttpClient": return applicationContext.getBean(ref, reactor.netty.http.client.HttpClient.class);
            case "org.apache.camel.component.stitch.client.StitchClient": return applicationContext.getBean(ref, org.apache.camel.component.stitch.client.StitchClient.class);
```

### DataFlowIssue
Switch label `"reactor.netty.http.client.HttpClient"` is unreachable
in `components-starter/camel-stitch-starter/src/main/java/org/apache/camel/component/stitch/springboot/StitchComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.stitch.client.models.StitchSchema": return applicationContext.getBean(ref, org.apache.camel.component.stitch.client.models.StitchSchema.class);
            case "reactor.netty.resources.ConnectionProvider": return applicationContext.getBean(ref, reactor.netty.resources.ConnectionProvider.class);
            case "reactor.netty.http.client.HttpClient": return applicationContext.getBean(ref, reactor.netty.http.client.HttpClient.class);
            case "org.apache.camel.component.stitch.client.StitchClient": return applicationContext.getBean(ref, org.apache.camel.component.stitch.client.StitchClient.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.stitch.client.StitchClient"` is unreachable
in `components-starter/camel-stitch-starter/src/main/java/org/apache/camel/component/stitch/springboot/StitchComponentConverter.java`
#### Snippet
```java
            case "reactor.netty.resources.ConnectionProvider": return applicationContext.getBean(ref, reactor.netty.resources.ConnectionProvider.class);
            case "reactor.netty.http.client.HttpClient": return applicationContext.getBean(ref, reactor.netty.http.client.HttpClient.class);
            case "org.apache.camel.component.stitch.client.StitchClient": return applicationContext.getBean(ref, org.apache.camel.component.stitch.client.StitchClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"jakarta.persistence.EntityManagerFactory"` is unreachable
in `components-starter/camel-jpa-starter/src/main/java/org/apache/camel/component/jpa/springboot/JpaComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "jakarta.persistence.EntityManagerFactory": return applicationContext.getBean(ref, jakarta.persistence.EntityManagerFactory.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
            case "org.apache.camel.component.jpa.TransactionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jpa.TransactionStrategy.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.mllp.MllpConfiguration"` is unreachable
in `components-starter/camel-mllp-starter/src/main/java/org/apache/camel/component/mllp/springboot/MllpComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.mllp.MllpConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mllp.MllpConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.springframework.transaction.PlatformTransactionManager"` is unreachable
in `components-starter/camel-jpa-starter/src/main/java/org/apache/camel/component/jpa/springboot/JpaComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "jakarta.persistence.EntityManagerFactory": return applicationContext.getBean(ref, jakarta.persistence.EntityManagerFactory.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
            case "org.apache.camel.component.jpa.TransactionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jpa.TransactionStrategy.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.jpa.TransactionStrategy"` is unreachable
in `components-starter/camel-jpa-starter/src/main/java/org/apache/camel/component/jpa/springboot/JpaComponentConverter.java`
#### Snippet
```java
            case "jakarta.persistence.EntityManagerFactory": return applicationContext.getBean(ref, jakarta.persistence.EntityManagerFactory.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
            case "org.apache.camel.component.jpa.TransactionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jpa.TransactionStrategy.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"io.vertx.ext.web.Router"` is unreachable
in `components-starter/camel-vertx-websocket-starter/src/main/java/org/apache/camel/component/vertx/websocket/springboot/VertxWebsocketComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.vertx.ext.web.Router": return applicationContext.getBean(ref, io.vertx.ext.web.Router.class);
            case "io.vertx.core.Vertx": return applicationContext.getBean(ref, io.vertx.core.Vertx.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
```

### DataFlowIssue
Switch label `"io.vertx.core.Vertx"` is unreachable
in `components-starter/camel-vertx-websocket-starter/src/main/java/org/apache/camel/component/vertx/websocket/springboot/VertxWebsocketComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "io.vertx.ext.web.Router": return applicationContext.getBean(ref, io.vertx.ext.web.Router.class);
            case "io.vertx.core.Vertx": return applicationContext.getBean(ref, io.vertx.core.Vertx.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
        }
```

### DataFlowIssue
Switch label `"io.vertx.core.VertxOptions"` is unreachable
in `components-starter/camel-vertx-websocket-starter/src/main/java/org/apache/camel/component/vertx/websocket/springboot/VertxWebsocketComponentConverter.java`
#### Snippet
```java
            case "io.vertx.ext.web.Router": return applicationContext.getBean(ref, io.vertx.ext.web.Router.class);
            case "io.vertx.core.Vertx": return applicationContext.getBean(ref, io.vertx.core.Vertx.class);
            case "io.vertx.core.VertxOptions": return applicationContext.getBean(ref, io.vertx.core.VertxOptions.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration"` is unreachable
in `components-starter/camel-robotframework-starter/src/main/java/org/apache/camel/component/robotframework/springboot/RobotFrameworkComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.codahale.metrics.MetricRegistry"` is unreachable
in `components-starter/camel-metrics-starter/src/main/java/org/apache/camel/component/metrics/springboot/MetricsComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.codahale.metrics.MetricRegistry": return applicationContext.getBean(ref, com.codahale.metrics.MetricRegistry.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.support.jsse.SSLContextParameters"` is unreachable
in `components-starter/camel-rest-openapi-starter/src/main/java/org/apache/camel/component/rest/openapi/springboot/RestOpenApiComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.github.benmanes.caffeine.cache.CacheLoader"` is unreachable
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/load/springboot/CaffeineLoadCacheComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.github.benmanes.caffeine.cache.CacheLoader": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.CacheLoader.class);
            case "org.apache.camel.component.caffeine.CaffeineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.caffeine.CaffeineConfiguration.class);
            case "com.github.benmanes.caffeine.cache.RemovalListener": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.RemovalListener.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.caffeine.CaffeineConfiguration"` is unreachable
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/load/springboot/CaffeineLoadCacheComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "com.github.benmanes.caffeine.cache.CacheLoader": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.CacheLoader.class);
            case "org.apache.camel.component.caffeine.CaffeineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.caffeine.CaffeineConfiguration.class);
            case "com.github.benmanes.caffeine.cache.RemovalListener": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.RemovalListener.class);
            case "com.github.benmanes.caffeine.cache.stats.StatsCounter": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.stats.StatsCounter.class);
```

### DataFlowIssue
Switch label `"com.github.benmanes.caffeine.cache.RemovalListener"` is unreachable
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/load/springboot/CaffeineLoadCacheComponentConverter.java`
#### Snippet
```java
            case "com.github.benmanes.caffeine.cache.CacheLoader": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.CacheLoader.class);
            case "org.apache.camel.component.caffeine.CaffeineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.caffeine.CaffeineConfiguration.class);
            case "com.github.benmanes.caffeine.cache.RemovalListener": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.RemovalListener.class);
            case "com.github.benmanes.caffeine.cache.stats.StatsCounter": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.stats.StatsCounter.class);
        }
```

### DataFlowIssue
Switch label `"com.github.benmanes.caffeine.cache.stats.StatsCounter"` is unreachable
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/load/springboot/CaffeineLoadCacheComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.caffeine.CaffeineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.caffeine.CaffeineConfiguration.class);
            case "com.github.benmanes.caffeine.cache.RemovalListener": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.RemovalListener.class);
            case "com.github.benmanes.caffeine.cache.stats.StatsCounter": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.stats.StatsCounter.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"com.github.benmanes.caffeine.cache.CacheLoader"` is unreachable
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/cache/springboot/CaffeineCacheComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.github.benmanes.caffeine.cache.CacheLoader": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.CacheLoader.class);
            case "org.apache.camel.component.caffeine.CaffeineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.caffeine.CaffeineConfiguration.class);
            case "com.github.benmanes.caffeine.cache.RemovalListener": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.RemovalListener.class);
```

### DataFlowIssue
Switch label `"org.apache.camel.component.caffeine.CaffeineConfiguration"` is unreachable
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/cache/springboot/CaffeineCacheComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "com.github.benmanes.caffeine.cache.CacheLoader": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.CacheLoader.class);
            case "org.apache.camel.component.caffeine.CaffeineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.caffeine.CaffeineConfiguration.class);
            case "com.github.benmanes.caffeine.cache.RemovalListener": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.RemovalListener.class);
            case "com.github.benmanes.caffeine.cache.stats.StatsCounter": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.stats.StatsCounter.class);
```

### DataFlowIssue
Switch label `"com.github.benmanes.caffeine.cache.RemovalListener"` is unreachable
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/cache/springboot/CaffeineCacheComponentConverter.java`
#### Snippet
```java
            case "com.github.benmanes.caffeine.cache.CacheLoader": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.CacheLoader.class);
            case "org.apache.camel.component.caffeine.CaffeineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.caffeine.CaffeineConfiguration.class);
            case "com.github.benmanes.caffeine.cache.RemovalListener": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.RemovalListener.class);
            case "com.github.benmanes.caffeine.cache.stats.StatsCounter": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.stats.StatsCounter.class);
        }
```

### DataFlowIssue
Switch label `"com.github.benmanes.caffeine.cache.stats.StatsCounter"` is unreachable
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/cache/springboot/CaffeineCacheComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.caffeine.CaffeineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.caffeine.CaffeineConfiguration.class);
            case "com.github.benmanes.caffeine.cache.RemovalListener": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.RemovalListener.class);
            case "com.github.benmanes.caffeine.cache.stats.StatsCounter": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.stats.StatsCounter.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration"` is unreachable
in `components-starter/camel-google-calendar-starter/src/main/java/org/apache/camel/component/google/calendar/stream/springboot/GoogleCalendarStreamComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration.class);
            case "org.apache.camel.component.google.calendar.GoogleCalendarClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.calendar.GoogleCalendarClientFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.calendar.GoogleCalendarClientFactory"` is unreachable
in `components-starter/camel-google-calendar-starter/src/main/java/org/apache/camel/component/google/calendar/stream/springboot/GoogleCalendarStreamComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration.class);
            case "org.apache.camel.component.google.calendar.GoogleCalendarClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.calendar.GoogleCalendarClientFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.mq.MqClient"` is unreachable
in `components-starter/camel-aws2-mq-starter/src/main/java/org/apache/camel/component/aws2/mq/springboot/MQ2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.mq.MqClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.mq.MqClient.class);
            case "org.apache.camel.component.aws2.mq.MQ2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.mq.MQ2Configuration.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.mq.MQ2Configuration"` is unreachable
in `components-starter/camel-aws2-mq-starter/src/main/java/org/apache/camel/component/aws2/mq/springboot/MQ2ComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "software.amazon.awssdk.services.mq.MqClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.mq.MqClient.class);
            case "org.apache.camel.component.aws2.mq.MQ2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.mq.MQ2Configuration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.calendar.GoogleCalendarConfiguration"` is unreachable
in `components-starter/camel-google-calendar-starter/src/main/java/org/apache/camel/component/google/calendar/springboot/GoogleCalendarComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.calendar.GoogleCalendarConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.calendar.GoogleCalendarConfiguration.class);
            case "org.apache.camel.component.google.calendar.GoogleCalendarClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.calendar.GoogleCalendarClientFactory.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.google.calendar.GoogleCalendarClientFactory"` is unreachable
in `components-starter/camel-google-calendar-starter/src/main/java/org/apache/camel/component/google/calendar/springboot/GoogleCalendarComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.calendar.GoogleCalendarConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.google.calendar.GoogleCalendarConfiguration.class);
            case "org.apache.camel.component.google.calendar.GoogleCalendarClientFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.calendar.GoogleCalendarClientFactory.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.debezium.configuration.Db2ConnectorEmbeddedDebeziumConfiguration"` is unreachable
in `components-starter/camel-debezium-db2-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumDb2ComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.Db2ConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.Db2ConnectorEmbeddedDebeziumConfiguration.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.flink.DataSetCallback"` is unreachable
in `components-starter/camel-flink-starter/src/main/java/org/apache/camel/component/flink/springboot/FlinkComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.flink.DataSetCallback": return applicationContext.getBean(ref, org.apache.camel.component.flink.DataSetCallback.class);
            case "org.apache.flink.streaming.api.datastream.DataStream": return applicationContext.getBean(ref, org.apache.flink.streaming.api.datastream.DataStream.class);
            case "org.apache.camel.component.flink.DataStreamCallback": return applicationContext.getBean(ref, org.apache.camel.component.flink.DataStreamCallback.class);
```

### DataFlowIssue
Switch label `"org.apache.flink.streaming.api.datastream.DataStream"` is unreachable
in `components-starter/camel-flink-starter/src/main/java/org/apache/camel/component/flink/springboot/FlinkComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.flink.DataSetCallback": return applicationContext.getBean(ref, org.apache.camel.component.flink.DataSetCallback.class);
            case "org.apache.flink.streaming.api.datastream.DataStream": return applicationContext.getBean(ref, org.apache.flink.streaming.api.datastream.DataStream.class);
            case "org.apache.camel.component.flink.DataStreamCallback": return applicationContext.getBean(ref, org.apache.camel.component.flink.DataStreamCallback.class);
        }
```

### DataFlowIssue
Switch label `"org.apache.camel.component.flink.DataStreamCallback"` is unreachable
in `components-starter/camel-flink-starter/src/main/java/org/apache/camel/component/flink/springboot/FlinkComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.flink.DataSetCallback": return applicationContext.getBean(ref, org.apache.camel.component.flink.DataSetCallback.class);
            case "org.apache.flink.streaming.api.datastream.DataStream": return applicationContext.getBean(ref, org.apache.flink.streaming.api.datastream.DataStream.class);
            case "org.apache.camel.component.flink.DataStreamCallback": return applicationContext.getBean(ref, org.apache.camel.component.flink.DataStreamCallback.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration"` is unreachable
in `components-starter/camel-aws2-eventbridge-starter/src/main/java/org/apache/camel/component/aws2/eventbridge/springboot/EventbridgeComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration.class);
            case "software.amazon.awssdk.services.eventbridge.EventBridgeClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.eventbridge.EventBridgeClient.class);
        }
```

### DataFlowIssue
Switch label `"software.amazon.awssdk.services.eventbridge.EventBridgeClient"` is unreachable
in `components-starter/camel-aws2-eventbridge-starter/src/main/java/org/apache/camel/component/aws2/eventbridge/springboot/EventbridgeComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration.class);
            case "software.amazon.awssdk.services.eventbridge.EventBridgeClient": return applicationContext.getBean(ref, software.amazon.awssdk.services.eventbridge.EventBridgeClient.class);
        }
        return null;
```

### DataFlowIssue
Switch label `"org.apache.camel.component.azure.storage.queue.QueueConfiguration"` is unreachable
in `components-starter/camel-azure-storage-queue-starter/src/main/java/org/apache/camel/component/azure/storage/queue/springboot/QueueComponentConverter.java`
#### Snippet
```java
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.azure.storage.queue.QueueConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.storage.queue.QueueConfiguration.class);
            case "com.azure.storage.queue.QueueServiceClient": return applicationContext.getBean(ref, com.azure.storage.queue.QueueServiceClient.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
```

### DataFlowIssue
Switch label `"com.azure.storage.queue.QueueServiceClient"` is unreachable
in `components-starter/camel-azure-storage-queue-starter/src/main/java/org/apache/camel/component/azure/storage/queue/springboot/QueueComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.azure.storage.queue.QueueConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.storage.queue.QueueConfiguration.class);
            case "com.azure.storage.queue.QueueServiceClient": return applicationContext.getBean(ref, com.azure.storage.queue.QueueServiceClient.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
```

### DataFlowIssue
Switch label `"java.time.Duration"` is unreachable
in `components-starter/camel-azure-storage-queue-starter/src/main/java/org/apache/camel/component/azure/storage/queue/springboot/QueueComponentConverter.java`
#### Snippet
```java
            case "org.apache.camel.component.azure.storage.queue.QueueConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.azure.storage.queue.QueueConfiguration.class);
            case "com.azure.storage.queue.QueueServiceClient": return applicationContext.getBean(ref, com.azure.storage.queue.QueueServiceClient.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
        }
```

### DataFlowIssue
Switch label `"com.azure.storage.common.StorageSharedKeyCredential"` is unreachable
in `components-starter/camel-azure-storage-queue-starter/src/main/java/org/apache/camel/component/azure/storage/queue/springboot/QueueComponentConverter.java`
#### Snippet
```java
            case "com.azure.storage.queue.QueueServiceClient": return applicationContext.getBean(ref, com.azure.storage.queue.QueueServiceClient.class);
            case "java.time.Duration": return applicationContext.getBean(ref, java.time.Duration.class);
            case "com.azure.storage.common.StorageSharedKeyCredential": return applicationContext.getBean(ref, com.azure.storage.common.StorageSharedKeyCredential.class);
        }
        return null;
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                    sourceCode = sourceCode.substring(0, idx);
                    List<String> lines = Stream.of(sourceCode.split("\n")).map(String::trim).map(s -> s.startsWith("*") ? s.substring(1) : s).map(String::trim)
                            .filter(s -> !s.isEmpty()).collect(Collectors.toList());
                    int lastLine = 0;
                    while (lastLine < lines.size()) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                        .extendSuperType(clazz.getGenericSuperclass() != null ? new GenericType(clazz.getGenericSuperclass()).toString() : null);

                List<java.lang.reflect.Method> publicMethods = Stream.of(clazz.getDeclaredMethods()).filter(m -> Modifier.isPublic(m.getModifiers())).collect(Collectors.toList());
                List<java.lang.reflect.Method> allSetters = publicMethods.stream().filter(m -> m.getReturnType() == void.class || m.getReturnType() == clazz)
                        .filter(m -> m.getParameterCount() == 1).filter(m -> m.getName().matches("set[A-Z][a-zA-Z0-9]*")).collect(Collectors.toList());
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                List<java.lang.reflect.Method> publicMethods = Stream.of(clazz.getDeclaredMethods()).filter(m -> Modifier.isPublic(m.getModifiers())).collect(Collectors.toList());
                List<java.lang.reflect.Method> allSetters = publicMethods.stream().filter(m -> m.getReturnType() == void.class || m.getReturnType() == clazz)
                        .filter(m -> m.getParameterCount() == 1).filter(m -> m.getName().matches("set[A-Z][a-zA-Z0-9]*")).collect(Collectors.toList());
                List<java.lang.reflect.Method> allGetters = publicMethods.stream().filter(m -> m.getReturnType() != void.class).filter(m -> m.getParameterCount() == 0)
                        .filter(m -> m.getName().matches("(get|is)[A-Z][a-zA-Z0-9]*")).collect(Collectors.toList());
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                        .filter(m -> m.getParameterCount() == 1).filter(m -> m.getName().matches("set[A-Z][a-zA-Z0-9]*")).collect(Collectors.toList());
                List<java.lang.reflect.Method> allGetters = publicMethods.stream().filter(m -> m.getReturnType() != void.class).filter(m -> m.getParameterCount() == 0)
                        .filter(m -> m.getName().matches("(get|is)[A-Z][a-zA-Z0-9]*")).collect(Collectors.toList());
                allSetters.stream()
                        .sorted(Comparator.<java.lang.reflect.Method>comparingInt(m -> getSetterPosition(sourceCode, m))
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                            boolean isBoolean;
                            java.lang.reflect.Field field = Stream.of(clazz.getDeclaredFields()).filter(f -> f.getName().equals(fn)).findAny().orElse(null);
                            List<java.lang.reflect.Method> setters = allSetters.stream().filter(m -> m.getName().equals("set" + StringUtils.capitalize(fn))).collect(Collectors.toList());
                            List<java.lang.reflect.Method> getters = allGetters.stream()
                                    .filter(m -> m.getName().equals("get" + StringUtils.capitalize(fn)) || m.getName().equals("is" + StringUtils.capitalize(fn))).collect(Collectors.toList());
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                            List<java.lang.reflect.Method> setters = allSetters.stream().filter(m -> m.getName().equals("set" + StringUtils.capitalize(fn))).collect(Collectors.toList());
                            List<java.lang.reflect.Method> getters = allGetters.stream()
                                    .filter(m -> m.getName().equals("get" + StringUtils.capitalize(fn)) || m.getName().equals("is" + StringUtils.capitalize(fn))).collect(Collectors.toList());
                            java.lang.reflect.Method mutator;
                            java.lang.reflect.Method accessor;
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudServiceFilterAutoConfiguration.java`
#### Snippet
```java

        configurationProperties.getServiceFilter().getConfigurations().entrySet().stream()
            .forEach(entry -> registerBean(factory, entry.getKey(), entry.getValue()));
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudServiceDiscoveryAutoConfiguration.java`
#### Snippet
```java

        configurationProperties.getServiceDiscovery().getConfigurations().entrySet().stream()
            .forEach(entry -> registerBean(factory, entry.getKey(), entry.getValue()));
    }

```

## RuleId[id=SpringBootApplicationProperties]
### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-sql-starter/src/test/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

spring.main.banner-mode=off

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-dns-starter/src/test/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

spring.main.banner-mode=off

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-rest-starter/src/test/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
spring.main.banner-mode=off

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-consul-starter/src/test/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
spring.main.banner-mode=off

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-ehcache-starter/src/test/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

spring.main.banner-mode = off

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-undertow-starter/src/test/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
spring.main.banner-mode = off
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.component.telegram'
in `components-starter/camel-telegram-starter/src/test/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.component.telegram: DEBUG

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-zookeeper-starter/src/test/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
spring.main.banner-mode=off

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-openapi-java-starter/src/test/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
spring.main.banner-mode=off

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-reactive-streams-starter/src/test/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------## Licensed to the Apache Software Foundation (ASF) under one or more## contributor license agreements.  See the NOTICE file distributed with## this work for additional information regarding copyright ownership.## The ASF licenses this file to You under the Apache License, Version 2.0## (the "License"); you may not use this file except in compliance with## the License.  You may obtain a copy of the License at####      http://www.apache.org/licenses/LICENSE-2.0#### Unless required by applicable law or agreed to in writing, software## distributed under the License is distributed on an "AS IS" BASIS,## WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.## See the License for the specific language governing permissions and## limitations under the License.## ---------------------------------------------------------------------------spring.main.banner-mode = off
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `components-starter/camel-jasypt-starter/src/test/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

spring.main.banner-mode = off
# unencryped properties

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'unencrypted.property'
in `components-starter/camel-jasypt-starter/src/test/resources/application.properties`
#### Snippet
```java
# unencryped properties

unencrypted.property = unEncrYpteD

# encrypted properties
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'encrypted.password'
in `components-starter/camel-jasypt-starter/src/test/resources/application.properties`
#### Snippet
```java

# encrypted properties
encrypted.password = ENC(ngTGZvEjfnNnKMTrbRCR3tHEnFShMGdBSgfW5K9mlg23u+ygbtNCgJGmDriQBVcB)


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jasypt.algorithm'
in `components-starter/camel-jasypt-starter/src/test/resources/application.properties`
#### Snippet
```java

camel.component.jasypt.enabled = true
camel.component.jasypt.algorithm= PBEWITHHMACSHA256ANDAES_256
camel.component.jasypt.password = sys:JASYPT_ENCRYPTION_PASSWORD
camel.component.jasypt.iv-generator-class-name = org.jasypt.iv.RandomIvGenerator
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jasypt.password'
in `components-starter/camel-jasypt-starter/src/test/resources/application.properties`
#### Snippet
```java
camel.component.jasypt.enabled = true
camel.component.jasypt.algorithm= PBEWITHHMACSHA256ANDAES_256
camel.component.jasypt.password = sys:JASYPT_ENCRYPTION_PASSWORD
camel.component.jasypt.iv-generator-class-name = org.jasypt.iv.RandomIvGenerator
camel.component.jasypt.salt-generator-class-name = org.jasypt.salt.RandomSaltGenerator
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jasypt.iv-generator-class-name'
in `components-starter/camel-jasypt-starter/src/test/resources/application.properties`
#### Snippet
```java
camel.component.jasypt.algorithm= PBEWITHHMACSHA256ANDAES_256
camel.component.jasypt.password = sys:JASYPT_ENCRYPTION_PASSWORD
camel.component.jasypt.iv-generator-class-name = org.jasypt.iv.RandomIvGenerator
camel.component.jasypt.salt-generator-class-name = org.jasypt.salt.RandomSaltGenerator
camel.component.jasypt.provider-name = SunJCE
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jasypt.salt-generator-class-name'
in `components-starter/camel-jasypt-starter/src/test/resources/application.properties`
#### Snippet
```java
camel.component.jasypt.password = sys:JASYPT_ENCRYPTION_PASSWORD
camel.component.jasypt.iv-generator-class-name = org.jasypt.iv.RandomIvGenerator
camel.component.jasypt.salt-generator-class-name = org.jasypt.salt.RandomSaltGenerator
camel.component.jasypt.provider-name = SunJCE

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jasypt.provider-name'
in `components-starter/camel-jasypt-starter/src/test/resources/application.properties`
#### Snippet
```java
camel.component.jasypt.iv-generator-class-name = org.jasypt.iv.RandomIvGenerator
camel.component.jasypt.salt-generator-class-name = org.jasypt.salt.RandomSaltGenerator
camel.component.jasypt.provider-name = SunJCE

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `core/camel-spring-boot/src/test/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

spring.main.banner-mode=off

from=direct:test
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'from'
in `core/camel-spring-boot/src/test/resources/application.properties`
#### Snippet
```java
spring.main.banner-mode=off

from=direct:test
to=mock:test

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'to'
in `core/camel-spring-boot/src/test/resources/application.properties`
#### Snippet
```java

from=direct:test
to=mock:test

#logging.level.org.apache.camel=DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `core/camel-spring-boot-xml/src/test/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

spring.main.banner-mode=off

from=direct:test
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'from'
in `core/camel-spring-boot-xml/src/test/resources/application.properties`
#### Snippet
```java
spring.main.banner-mode=off

from=direct:test
to=mock:test

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'to'
in `core/camel-spring-boot-xml/src/test/resources/application.properties`
#### Snippet
```java

from=direct:test
to=mock:test

#logging.level.org.apache.camel=DEBUG
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
                    dependencies.appendChild(dependency);

                    String[] comps = dep.split("\\:");
                    String groupIdStr = comps[0];
                    String artifactIdStr = comps[1];
```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

            for (String lib : libsToRemove) {
                String groupIdStr = lib.split("\\:")[0];
                String artifactIdStr = lib.split("\\:")[1];

```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
            for (String lib : libsToRemove) {
                String groupIdStr = lib.split("\\:")[0];
                String artifactIdStr = lib.split("\\:")[1];

                Element exclusion = pom.createElement("exclusion");
```

## RuleId[id=UnparsedCustomBeanInspection]
### UnparsedCustomBeanInspection
Unsupported tag 'camelContext' for namespace 'http://camel.apache.org/schema/spring', please file issue (Help\|Submit a Bug Report...)
in `core/camel-spring-boot-xml/src/test/resources/test-camel-context.xml`
#### Snippet
```java

    <!-- Camel Route -->
    <camelContext xmlns="http://camel.apache.org/schema/spring">
        <route id="xml">
            <from uri="timer://foo?period=1000"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'camelContext' for namespace 'http://camel.apache.org/schema/spring', please file issue (Help\|Submit a Bug Report...)
in `core/camel-spring-boot-xml/src/test/resources/externalCamelContext.xml`
#### Snippet
```java


  <camelContext id="xmlCamelContext" xmlns="http://camel.apache.org/schema/spring">
    <template id="xmlProducerTemplate"/>
    <consumerTemplate id="xmlConsumerTemplate"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'camelContext' for namespace 'http://camel.apache.org/schema/spring', please file issue (Help\|Submit a Bug Report...)
in `core/camel-spring-boot-xml/src/test/resources/mixed-camel-context.xml`
#### Snippet
```java

    <!-- Camel Route -->
    <camelContext id="camel-spring-xml" xmlns="http://camel.apache.org/schema/spring">
    </camelContext>

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-spring-redis-starter/src/main/java/org/apache/camel/component/redis/springboot/RedisComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.springframework.data.redis.core.RedisTemplate": return applicationContext.getBean(ref, org.springframework.data.redis.core.RedisTemplate.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-influxdb-starter/src/main/java/org/apache/camel/component/influxdb/springboot/InfluxDbComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.influxdb.InfluxDB": return applicationContext.getBean(ref, org.influxdb.InfluxDB.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-influxdb2-starter/src/main/java/org/apache/camel/component/influxdb2/springboot/InfluxDb2ComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.influxdb.client.InfluxDBClient": return applicationContext.getBean(ref, com.influxdb.client.InfluxDBClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-mybatis-starter/src/main/java/org/apache/camel/component/mybatis/springboot/MyBatisComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ibatis.session.SqlSessionFactory": return applicationContext.getBean(ref, org.apache.ibatis.session.SqlSessionFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-mybatis-starter/src/main/java/org/apache/camel/component/mybatis/springboot/MyBatisBeanComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.ibatis.session.SqlSessionFactory": return applicationContext.getBean(ref, org.apache.ibatis.session.SqlSessionFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-as2-starter/src/main/java/org/apache/camel/component/as2/springboot/AS2ComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.as2.AS2Configuration": return applicationContext.getBean(ref, org.apache.camel.component.as2.AS2Configuration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-iec60870-starter/src/main/java/org/apache/camel/component/iec60870/client/springboot/ClientComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.iec60870.client.ClientOptions": return applicationContext.getBean(ref, org.apache.camel.component.iec60870.client.ClientOptions.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-iec60870-starter/src/main/java/org/apache/camel/component/iec60870/server/springboot/ServerComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.iec60870.server.ServerOptions": return applicationContext.getBean(ref, org.apache.camel.component.iec60870.server.ServerOptions.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-dataset-starter/src/main/java/org/apache/camel/component/dataset/springboot/DataSetComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.ExchangeFormatter": return applicationContext.getBean(ref, org.apache.camel.spi.ExchangeFormatter.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-dataset-starter/src/main/java/org/apache/camel/component/dataset/springboot/DataSetTestComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.ExchangeFormatter": return applicationContext.getBean(ref, org.apache.camel.spi.ExchangeFormatter.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-jolt-starter/src/main/java/org/apache/camel/component/jolt/springboot/JoltComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.bazaarvoice.jolt.Transform": return applicationContext.getBean(ref, com.bazaarvoice.jolt.Transform.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-guava-eventbus-starter/src/main/java/org/apache/camel/component/guava/eventbus/springboot/GuavaEventBusComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.google.common.eventbus.EventBus": return applicationContext.getBean(ref, com.google.common.eventbus.EventBus.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-cxf-rest-starter/src/main/java/org/apache/camel/component/cxf/jaxrs/springboot/CxfRsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-facebook-starter/src/main/java/org/apache/camel/component/facebook/springboot/FacebookComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.facebook.config.FacebookConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.facebook.config.FacebookConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-jgroups-starter/src/main/java/org/apache/camel/component/jgroups/springboot/JGroupsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.jgroups.JChannel": return applicationContext.getBean(ref, org.jgroups.JChannel.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-mock-starter/src/main/java/org/apache/camel/component/mock/springboot/MockComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.ExchangeFormatter": return applicationContext.getBean(ref, org.apache.camel.spi.ExchangeFormatter.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-log-starter/src/main/java/org/apache/camel/component/log/springboot/LogComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.ExchangeFormatter": return applicationContext.getBean(ref, org.apache.camel.spi.ExchangeFormatter.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-stub-starter/src/main/java/org/apache/camel/component/stub/springboot/StubComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.seda.BlockingQueueFactory": return applicationContext.getBean(ref, org.apache.camel.component.seda.BlockingQueueFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-docker-starter/src/main/java/org/apache/camel/component/docker/springboot/DockerComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.docker.DockerConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.docker.DockerConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-grape-starter/src/main/java/org/apache/camel/component/grape/springboot/GrapeComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.grape.PatchesRepository": return applicationContext.getBean(ref, org.apache.camel.component.grape.PatchesRepository.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-braintree-starter/src/main/java/org/apache/camel/component/braintree/springboot/BraintreeComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.braintree.BraintreeConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.braintree.BraintreeConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-elasticsearch-starter/src/main/java/org/apache/camel/component/es/springboot/ElasticsearchComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.elasticsearch.client.RestClient": return applicationContext.getBean(ref, org.elasticsearch.client.RestClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-jslt-starter/src/main/java/org/apache/camel/component/jslt/springboot/JsltComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.schibsted.spt.data.jslt.filters.JsonFilter": return applicationContext.getBean(ref, com.schibsted.spt.data.jslt.filters.JsonFilter.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-platform-http-starter/src/main/java/org/apache/camel/component/platform/http/springboot/PlatformHttpComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.platform.http.spi.PlatformHttpEngine": return applicationContext.getBean(ref, org.apache.camel.component.platform.http.spi.PlatformHttpEngine.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-bean-starter/src/main/java/org/apache/camel/component/bean/springboot/BeanComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.BeanScope": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.BeanScope.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-bean-starter/src/main/java/org/apache/camel/component/beanclass/springboot/ClassComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.BeanScope": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.BeanScope.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-reactive-streams-starter/src/main/java/org/apache/camel/component/reactive/streams/springboot/ReactiveStreamsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-cxf-soap-starter/src/main/java/org/apache/camel/component/cxf/jaxws/springboot/CxfComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-webhook-starter/src/main/java/org/apache/camel/component/webhook/springboot/WebhookComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.webhook.WebhookConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.webhook.WebhookConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-jira-starter/src/main/java/org/apache/camel/component/jira/springboot/JiraComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.jira.JiraConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jira.JiraConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-arangodb-starter/src/main/java/org/apache/camel/component/arangodb/springboot/ArangoDbComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.arangodb.ArangoDbConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.arangodb.ArangoDbConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-atlasmap-starter/src/main/java/org/apache/camel/component/atlasmap/springboot/AtlasMapComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.atlasmap.api.AtlasContextFactory": return applicationContext.getBean(ref, io.atlasmap.api.AtlasContextFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-micrometer-starter/src/main/java/org/apache/camel/component/micrometer/springboot/MicrometerComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.micrometer.core.instrument.MeterRegistry": return applicationContext.getBean(ref, io.micrometer.core.instrument.MeterRegistry.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-seda-starter/src/main/java/org/apache/camel/component/seda/springboot/SedaComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.seda.BlockingQueueFactory": return applicationContext.getBean(ref, org.apache.camel.component.seda.BlockingQueueFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-validator-starter/src/main/java/org/apache/camel/component/validator/springboot/ValidatorComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.validator.ValidatorResourceResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.validator.ValidatorResourceResolverFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-telegram-starter/src/main/java/org/apache/camel/component/telegram/springboot/TelegramComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "java.net.http.HttpClient": return applicationContext.getBean(ref, java.net.http.HttpClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-nats-starter/src/main/java/org/apache/camel/component/nats/springboot/NatsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-debezium-sqlserver-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumSqlserverComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-mustache-starter/src/main/java/org/apache/camel/component/mustache/springboot/MustacheComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.github.mustachejava.MustacheFactory": return applicationContext.getBean(ref, com.github.mustachejava.MustacheFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-splunk-starter/src/main/java/org/apache/camel/component/splunk/springboot/SplunkComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.splunk.SplunkConfigurationFactory": return applicationContext.getBean(ref, org.apache.camel.component.splunk.SplunkConfigurationFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-lumberjack-starter/src/main/java/org/apache/camel/component/lumberjack/springboot/LumberjackComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-freemarker-starter/src/main/java/org/apache/camel/component/freemarker/springboot/FreemarkerComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "freemarker.template.Configuration": return applicationContext.getBean(ref, freemarker.template.Configuration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-google-bigquery-starter/src/main/java/org/apache/camel/component/google/bigquery/sql/springboot/GoogleBigQuerySQLComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-google-bigquery-starter/src/main/java/org/apache/camel/component/google/bigquery/springboot/GoogleBigQueryComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory": return applicationContext.getBean(ref, org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-debezium-oracle-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumOracleComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.OracleConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.OracleConnectorEmbeddedDebeziumConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-pubnub-starter/src/main/java/org/apache/camel/component/pubnub/springboot/PubNubComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.pubnub.PubNubConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.pubnub.PubNubConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-jcache-starter/src/main/java/org/apache/camel/component/jcache/springboot/JCacheComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.cache.configuration.Configuration": return applicationContext.getBean(ref, javax.cache.configuration.Configuration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/openshift/builds/springboot/OpenshiftBuildsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/openshift/build_configs/springboot/OpenshiftBuildConfigsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/hpa/springboot/KubernetesHPAComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/openshift/deploymentconfigs/springboot/OpenshiftDeploymentConfigsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/job/springboot/KubernetesJobComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/pods/springboot/KubernetesPodsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/events/springboot/KubernetesEventsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/nodes/springboot/KubernetesNodesComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/secrets/springboot/KubernetesSecretsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/services/springboot/KubernetesServicesComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/namespaces/springboot/KubernetesNamespacesComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/deployments/springboot/KubernetesDeploymentsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/config_maps/springboot/KubernetesConfigMapsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/customresources/springboot/KubernetesCustomResourcesComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/service_accounts/springboot/KubernetesServiceAccountsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/resources_quota/springboot/KubernetesResourcesQuotaComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/persistent_volumes/springboot/KubernetesPersistentVolumesComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/replication_controllers/springboot/KubernetesReplicationControllersComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/persistent_volumes_claims/springboot/KubernetesPersistentVolumesClaimsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.fabric8.kubernetes.client.KubernetesClient": return applicationContext.getBean(ref, io.fabric8.kubernetes.client.KubernetesClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-jt400-starter/src/main/java/org/apache/camel/component/jt400/springboot/Jt400ComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.ibm.as400.access.AS400ConnectionPool": return applicationContext.getBean(ref, com.ibm.as400.access.AS400ConnectionPool.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-debezium-mysql-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumMySqlComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-velocity-starter/src/main/java/org/apache/camel/component/velocity/springboot/VelocityComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.velocity.app.VelocityEngine": return applicationContext.getBean(ref, org.apache.velocity.app.VelocityEngine.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/map/springboot/HazelcastMapComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/set/springboot/HazelcastSetComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/list/springboot/HazelcastListComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/seda/springboot/HazelcastSedaComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/queue/springboot/HazelcastQueueComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/topic/springboot/HazelcastTopicComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/instance/springboot/HazelcastInstanceComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/multimap/springboot/HazelcastMultimapComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/ringbuffer/springboot/HazelcastRingbufferComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/atomicnumber/springboot/HazelcastAtomicnumberComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hazelcast-starter/src/main/java/org/apache/camel/component/hazelcast/replicatedmap/springboot/HazelcastReplicatedmapComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.hazelcast.core.HazelcastInstance": return applicationContext.getBean(ref, com.hazelcast.core.HazelcastInstance.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-file-watch-starter/src/main/java/org/apache/camel/component/file/watch/springboot/FileWatchComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "io.methvin.watcher.hashing.FileHasher": return applicationContext.getBean(ref, io.methvin.watcher.hashing.FileHasher.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-geocoder-starter/src/main/java/org/apache/camel/component/geocoder/springboot/GeoCoderComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.google.maps.GeoApiContext": return applicationContext.getBean(ref, com.google.maps.GeoApiContext.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-debezium-mongodb-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumMongodbComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-hdfs-starter/src/main/java/org/apache/camel/component/hdfs/springboot/HdfsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.security.auth.login.Configuration": return applicationContext.getBean(ref, javax.security.auth.login.Configuration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-mapstruct-starter/src/main/java/org/apache/camel/component/mapstruct/springboot/MapstructComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.mapstruct.MapStructMapperFinder": return applicationContext.getBean(ref, org.apache.camel.component.mapstruct.MapStructMapperFinder.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-mongodb-starter/src/main/java/org/apache/camel/component/mongodb/springboot/MongoDbComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.mongodb.client.MongoClient": return applicationContext.getBean(ref, com.mongodb.client.MongoClient.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-kamelet-starter/src/main/java/org/apache/camel/component/kamelet/springboot/KameletComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.spi.RouteTemplateLoaderListener": return applicationContext.getBean(ref, org.apache.camel.spi.RouteTemplateLoaderListener.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/ZooKeeperComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.zookeeper.ZooKeeperConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.zookeeper.ZooKeeperConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-debezium-postgres-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumPostgresComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-sql-starter/src/main/java/org/apache/camel/component/sql/stored/springboot/SqlStoredComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "javax.sql.DataSource": return applicationContext.getBean(ref, javax.sql.DataSource.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-mllp-starter/src/main/java/org/apache/camel/component/mllp/springboot/MllpComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.mllp.MllpConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.mllp.MllpConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-robotframework-starter/src/main/java/org/apache/camel/component/robotframework/springboot/RobotFrameworkComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-metrics-starter/src/main/java/org/apache/camel/component/metrics/springboot/MetricsComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "com.codahale.metrics.MetricRegistry": return applicationContext.getBean(ref, com.codahale.metrics.MetricRegistry.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-rest-openapi-starter/src/main/java/org/apache/camel/component/rest/openapi/springboot/RestOpenApiComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.support.jsse.SSLContextParameters": return applicationContext.getBean(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
        }
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components-starter/camel-debezium-db2-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumDb2ComponentConverter.java`
#### Snippet
```java
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.debezium.configuration.Db2ConnectorEmbeddedDebeziumConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.debezium.configuration.Db2ConnectorEmbeddedDebeziumConfiguration.class);
        }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, jakarta.jms.ConnectionFactory.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.core.task.TaskExecutor.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.jms.JmsConfiguration.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.jms.support.destination.DestinationResolver.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.util.ErrorHandler.class));
        answer.add(new ConvertiblePair(String.class, jakarta.jms.ExceptionListener.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.jms.support.converter.MessageConverter.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.jms.MessageCreatedStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.jms.MessageListenerContainerFactory.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.jms.QueueBrowseStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.spi.HeaderFilterStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.transaction.PlatformTransactionManager.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConverter.java`
#### Snippet
```java
switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.springframework.core.task.TaskExecutor": return applicationContext.getBean(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return applicationContext.getBean(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return applicationContext.getBean(ref, org.springframework.util.ErrorHandler.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return applicationContext.getBean(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return applicationContext.getBean(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.springframework.transaction.PlatformTransactionManager": return applicationContext.getBean(ref, org.springframework.transaction.PlatformTransactionManager.class);
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-atmosphere-websocket-starter/src/main/java/org/apache/camel/component/atmosphere/websocket/springboot/WebsocketComponentConverter.java`
#### Snippet
```java
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, org.apache.camel.http.common.HttpRegistry.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.http.common.HttpBinding.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.http.common.HttpConfiguration.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.spi.HeaderFilterStrategy.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-atmosphere-websocket-starter/src/main/java/org/apache/camel/component/atmosphere/websocket/springboot/WebsocketComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.http.common.HttpRegistry": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpRegistry.class);
            case "org.apache.camel.http.common.HttpBinding": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpBinding.class);
            case "org.apache.camel.http.common.HttpConfiguration": return applicationContext.getBean(ref, org.apache.camel.http.common.HttpConfiguration.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/cache/springboot/CaffeineCacheComponentConverter.java`
#### Snippet
```java
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, com.github.benmanes.caffeine.cache.CacheLoader.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.caffeine.CaffeineConfiguration.class));
        answer.add(new ConvertiblePair(String.class, com.github.benmanes.caffeine.cache.RemovalListener.class));
        answer.add(new ConvertiblePair(String.class, com.github.benmanes.caffeine.cache.stats.StatsCounter.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/cache/springboot/CaffeineCacheComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "com.github.benmanes.caffeine.cache.CacheLoader": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.CacheLoader.class);
            case "org.apache.camel.component.caffeine.CaffeineConfiguration": return applicationContext.getBean(ref, org.apache.camel.component.caffeine.CaffeineConfiguration.class);
            case "com.github.benmanes.caffeine.cache.RemovalListener": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.RemovalListener.class);
            case "com.github.benmanes.caffeine.cache.stats.StatsCounter": return applicationContext.getBean(ref, com.github.benmanes.caffeine.cache.stats.StatsCounter.class);
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceDiscoveryAutoConfiguration.java`
#### Snippet
```java
                BeanIntrospection bi = PluginHelper.getBeanIntrospection(camelContext);
                try {
                    bi.getProperties(entry.getValue(), parameters, null, false);
                    CamelPropertiesHelper.setCamelProperties(camelContext, factory, parameters, false);

                    beanFactory.registerSingleton(entry.getKey(), factory.newInstance(camelContext));
                } catch (Exception e) {
                    throw new BeanCreationException(entry.getKey(), e.getMessage(), e);
                }
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/springboot/DisruptorComponentConverter.java`
#### Snippet
```java
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.disruptor.DisruptorWaitStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.disruptor.DisruptorProducerType.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/springboot/DisruptorComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.camel.component.disruptor.DisruptorWaitStrategy": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorWaitStrategy.class);
            case "org.apache.camel.component.disruptor.DisruptorProducerType": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.disruptor.DisruptorProducerType.class);
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/cache/springboot/IgniteCacheComponentConverter.java`
#### Snippet
```java
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, org.apache.ignite.Ignite.class));
        answer.add(new ConvertiblePair(String.class, org.apache.ignite.configuration.IgniteConfiguration.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-ignite-starter/src/main/java/org/apache/camel/component/ignite/cache/springboot/IgniteCacheComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "org.apache.ignite.Ignite": return applicationContext.getBean(ref, org.apache.ignite.Ignite.class);
            case "org.apache.ignite.configuration.IgniteConfiguration": return applicationContext.getBean(ref, org.apache.ignite.configuration.IgniteConfiguration.class);
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-jdbc-starter/src/main/java/org/apache/camel/component/jdbc/springboot/JdbcComponentConverter.java`
#### Snippet
```java
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, javax.sql.DataSource.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.jdbc.ConnectionStrategy.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-jdbc-starter/src/main/java/org/apache/camel/component/jdbc/springboot/JdbcComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "javax.sql.DataSource": return applicationContext.getBean(ref, javax.sql.DataSource.class);
            case "org.apache.camel.component.jdbc.ConnectionStrategy": return applicationContext.getBean(ref, org.apache.camel.component.jdbc.ConnectionStrategy.class);
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConverter.java`
#### Snippet
```java
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.NettyConfiguration.class));
        answer.add(new ConvertiblePair(String.class, io.netty.channel.EventLoopGroup.class));
        answer.add(new ConvertiblePair(String.class, io.netty.util.concurrent.EventExecutorGroup.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.NettyServerBootstrapFactory.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.ServerInitializerFactory.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.ClientInitializerFactory.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class));
        answer.add(new ConvertiblePair(String.class, io.netty.channel.group.ChannelGroup.class));
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-olingo2-starter/src/main/java/org/apache/camel/component/olingo2/springboot/Olingo2ComponentConverter.java`
#### Snippet
```java
        answer.add(new ConvertiblePair(String.class, org.apache.http.HttpHost.class));
        answer.add(new ConvertiblePair(String.class, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class));
        answer.add(new ConvertiblePair(String.class, org.apache.http.impl.client.HttpClientBuilder.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.support.jsse.SSLContextParameters.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-sjms-starter/src/main/java/org/apache/camel/component/sjms/springboot/SjmsComponentConverter.java`
#### Snippet
```java
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, jakarta.jms.ConnectionFactory.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class));
        answer.add(new ConvertiblePair(String.class, jakarta.jms.ExceptionListener.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.spi.HeaderFilterStrategy.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-sjms-starter/src/main/java/org/apache/camel/component/sjms/springboot/SjmsComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "jakarta.jms.ConnectionFactory": return applicationContext.getBean(ref, jakarta.jms.ConnectionFactory.class);
            case "org.apache.camel.component.sjms.jms.DestinationCreationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
            case "jakarta.jms.ExceptionListener": return applicationContext.getBean(ref, jakarta.jms.ExceptionListener.class);
            case "org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
            case "org.apache.camel.component.sjms.jms.MessageCreatedStrategy": return applicationContext.getBean(ref, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return applicationContext.getBean(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-xj-starter/src/main/java/org/apache/camel/component/xj/springboot/XJComponentConverter.java`
#### Snippet
```java
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, net.sf.saxon.Configuration.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class));
        answer.add(new ConvertiblePair(String.class, javax.xml.transform.URIResolver.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.xslt.XsltUriResolverFactory.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-xslt-starter/src/main/java/org/apache/camel/component/xslt/springboot/XsltComponentConverter.java`
#### Snippet
```java
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class));
        answer.add(new ConvertiblePair(String.class, javax.xml.transform.URIResolver.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.xslt.XsltUriResolverFactory.class));
        return answer;
```

### DuplicatedCode
Duplicated code
in `components-starter/camel-xj-starter/src/main/java/org/apache/camel/component/xj/springboot/XJComponentConverter.java`
#### Snippet
```java
        switch (targetType.getName()) {
            case "net.sf.saxon.Configuration": return applicationContext.getBean(ref, net.sf.saxon.Configuration.class);
            case "org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy": return applicationContext.getBean(ref, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class);
            case "javax.xml.transform.URIResolver": return applicationContext.getBean(ref, javax.xml.transform.URIResolver.class);
            case "org.apache.camel.component.xslt.XsltUriResolverFactory": return applicationContext.getBean(ref, org.apache.camel.component.xslt.XsltUriResolverFactory.class);
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        Files.list(startersDir.toPath())
                .filter(Files::isDirectory)
                // must have a pom.xml to be active
                .filter(d -> {
                    File pom = new File(d.toFile(), "pom.xml");
                    return pom.isFile() && pom.exists();
                })
                .map(dir -> {
                    Dependency dep = new Dependency();
                    dep.setGroupId("org.apache.camel.springboot");
                    dep.setArtifactId(dir.getFileName().toString());
                    dep.setVersion("${project.version}");
                    return dep;
                })
                .forEach(outDependencies::add);

        // include core starters
        Dependency dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java
dep.setVersion("${project.version}");
        outDependencies.add(dep);

        // include dsl starters
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-cli-connector-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-componentdsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-dsl-modeline-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-endpointdsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-groovy-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-java-joor-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-js-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-jsh-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-kotlin-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-xml-io-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-xml-jaxb-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-yaml-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);

        outDependencies.sort(Comparator.comparing(d -> (d.getGroupId() + ":" + d.getArtifactId())));
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
dep.setArtifactId("camel-cli-connector-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-componentdsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-dsl-modeline-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-endpointdsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-groovy-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-java-joor-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-js-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-jsh-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-kotlin-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-xml-io-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-xml-jaxb-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);
        dep = new Dependency();
        dep.setGroupId("org.apache.camel.springboot");
        dep.setArtifactId("camel-yaml-dsl-starter");
        dep.setVersion("${project.version}");
        outDependencies.add(dep);

        outDependencies.sort(Comparator.comparing(d -> (d.getGroupId() + ":" + d.getArtifactId())));
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.TRUE);
        dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        DocumentBuilder builder = dbf.newDocumentBuilder();
        Document pom = builder.parse(sourcePom);

        XPath xpath = XPathFactory.newInstance().newXPath();

        XPathExpression parentVersion = xpath.compile("/project/parent/version");
        setActualVersion(pom, parentVersion);

        XPathExpression projectVersion = xpath.compile("/project/version");
        setActualVersion(pom, projectVersion);

        return pom;
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        XPathExpression xpath = XPathFactory.newInstance().newXPath().compile("//text()[normalize-space(.) = '']");
        NodeList emptyNodes = (NodeList) xpath.evaluate(pom, XPathConstants.NODESET);

        // Remove empty text nodes
        for (int i = 0; i < emptyNodes.getLength(); i++) {
            Node emptyNode = emptyNodes.item(i);
            emptyNode.getParentNode().removeChild(emptyNode);
        }
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.TRUE);
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        DOMSource source = new DOMSource(pom);
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        boolean write = true;

        if (file.exists()) {
            try (FileReader fr = new FileReader(file)) {
                String oldContent = IOUtils.toString(fr);
                if (!content.equals(oldContent)) {
                    getLog().info("File: " + file.getAbsolutePath() + " is updated");
                    fr.close();
                } else {
                    getLog().info("File " + file.getAbsolutePath() + " is not changed");
                    write = false;
                }
            }
        } else {
            File parent = file.getParentFile();
            parent.mkdirs();
        }

        if (write) {
            try (FileWriter fw = new FileWriter(file)) {
                IOUtils.write(content, fw);
            }
        }
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr = xpath.compile("/project/dependencyManagement/dependencies");

        NodeList nodes = (NodeList) expr.evaluate(pom, XPathConstants.NODESET);
        if (nodes.getLength() == 0) {
            throw new IllegalStateException("No dependencies found in the dependencyManagement section of the current pom");
        }

        Node dependenciesSection = nodes.item(0);
        // cleanup the dependency management section
        while (dependenciesSection.hasChildNodes()) {
            Node child = dependenciesSection.getFirstChild();
            dependenciesSection.removeChild(child);
        }

        for (Dependency dep : dependencies) {

            if ("target".equals(dep.getArtifactId())) {
                // skip invalid artifact that somehow gets included
                continue;
            }

            Element dependencyEl = pom.createElement("dependency");

            Element groupIdEl = pom.createElement("groupId");
            groupIdEl.setTextContent(dep.getGroupId());
            dependencyEl.appendChild(groupIdEl);

            Element artifactIdEl = pom.createElement("artifactId");
            artifactIdEl.setTextContent(dep.getArtifactId());
            dependencyEl.appendChild(artifactIdEl);

            Element versionEl = pom.createElement("version");
            versionEl.setTextContent(dep.getVersion());
            dependencyEl.appendChild(versionEl);

            if (!"jar".equals(dep.getType())) {
                Element typeEl = pom.createElement("type");
                typeEl.setTextContent(dep.getType());
                dependencyEl.appendChild(typeEl);
            }

            if (dep.getClassifier() != null) {
                Element classifierEl = pom.createElement("classifier");
                classifierEl.setTextContent(dep.getClassifier());
                dependencyEl.appendChild(classifierEl);
            }

            if (dep.getScope() != null && !"compile".equals(dep.getScope())) {
                Element scopeEl = pom.createElement("scope");
                scopeEl.setTextContent(dep.getScope());
                dependencyEl.appendChild(scopeEl);
            }

            if (dep.getExclusions() != null && !dep.getExclusions().isEmpty()) {

                Element exclsEl = pom.createElement("exclusions");

                for (Exclusion e : dep.getExclusions()) {
                    Element exclEl = pom.createElement("exclusion");

                    Element groupIdExEl = pom.createElement("groupId");
                    groupIdExEl.setTextContent(e.getGroupId());
                    exclEl.appendChild(groupIdExEl);

                    Element artifactIdExEl = pom.createElement("artifactId");
                    artifactIdExEl.setTextContent(e.getArtifactId());
                    exclEl.appendChild(artifactIdExEl);

                    exclsEl.appendChild(exclEl);
                }

                dependencyEl.appendChild(exclsEl);
            }


            dependenciesSection.appendChild(dependencyEl);
        }
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            if (!Strings.isNullOrEmpty(option.getDescription())) {
                prop.getField().getJavaDoc().setFullText(option.getDescription());
            }
            if (!isBlank(option.getDefaultValue())) {
                if ("java.lang.String".equals(type)) {
                    prop.getField().setStringInitializer(option.getDefaultValue().toString());
                } else if ("long".equals(type) || "java.lang.Long".equals(type)) {
                    // the value should be a Long number
                    String value = option.getDefaultValue() + "L";
                    prop.getField().setLiteralInitializer(value);
                } else if ("integer".equals(option.getType()) || "java.lang.Integer".equals(option.getJavaType())
                        || "boolean".equals(option.getType()) || "java.lang.Boolean".equals(option.getJavaType())) {
                    prop.getField().setLiteralInitializer(option.getDefaultValue().toString());
                } else if (!isBlank(option.getEnums())) {
                    String enumShortName = type.substring(type.lastIndexOf(".") + 1);
                    prop.getField().setLiteralInitializer(enumShortName + "." + option.getDefaultValue());
                    commonClass.addImport(model.getJavaType());
                }
            }
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                } else if ("integer".equals(option.getType()) || "java.lang.Integer".equals(option.getJavaType())
                        || "boolean".equals(option.getType()) || "java.lang.Boolean".equals(option.getJavaType())) {
                    prop.getField().setLiteralInitializer(option.getDefaultValue().toString());
                } else if (!isBlank(option.getEnums())) {
                    String enumShortName = type.substring(type.lastIndexOf(".") + 1);
                    prop.getField().setLiteralInitializer(enumShortName + "." + option.getDefaultValue());
                    javaClass.addImport(model.getJavaType());
                }
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                List<String> aliases = compModels.stream().map(ComponentModel::getScheme).sorted().collect(Collectors.toList());

                // use springboot as sub package name so the code is not in normal
                // package so the Spring Boot JARs can be optional at runtime
                int pos = model.getJavaType().lastIndexOf(".");
                String pkg = model.getJavaType().substring(0, pos) + ".springboot";

                String overrideComponentName = null;
                if (aliases.size() > 1) {
                    // determine component name when there are multiple ones
                    overrideComponentName = model.getArtifactId().replace("camel-", "");
                }
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            Property prop = javaClass.addProperty(type, option.getName());
            if (option.isDeprecated()) {
                prop.getField().addAnnotation(Deprecated.class);
                prop.getAccessor().addAnnotation(Deprecated.class);
                prop.getMutator().addAnnotation(Deprecated.class);
                // DeprecatedConfigurationProperty must be on getter when deprecated
                prop.getAccessor().addAnnotation(DeprecatedConfigurationProperty.class);
            }
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        if (option.getJavaType().startsWith("java.util.Map") || option.getJavaType().startsWith("java.util.List") || option.getJavaType().startsWith("java.util.Set")) {
            return false;
        }
        // enums are not complex
        if (option.getEnums() != null && !option.getEnums().isEmpty()) {
            return false;
        }
        // all the object types are complex
        return "object".equals(option.getType());
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            boolean complex = isComplexType(option) && isBlank(option.getEnums());
            if (complex) {
                // force to use a string type
                type = "java.lang.String";
            }

            Property prop = javaClass.addProperty(type, option.getName());
            if (option.isDeprecated()) {
                prop.getField().addAnnotation(Deprecated.class);
                prop.getAccessor().addAnnotation(Deprecated.class);
                prop.getMutator().addAnnotation(Deprecated.class);
                // DeprecatedConfigurationProperty must be on getter when
                // deprecated
                prop.getAccessor().addAnnotation(DeprecatedConfigurationProperty.class);
            }
            if (!Strings.isNullOrEmpty(option.getDescription())) {
                String desc = option.getDescription();
                if (complex) {
                    if (!desc.endsWith(".")) {
                        desc = desc + ".";
                    }
                    desc = desc + " The option is a " + option.getJavaType() + " type.";
                }
                prop.getField().getJavaDoc().setFullText(desc);
            }
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        javaClass.addImport(model.getJavaType());

        javaClass.addField().setPrivate().setName("applicationContext").setType(ApplicationContext.class).addAnnotation(Autowired.class);
        javaClass.addField().setPrivate().setFinal(true).setName("camelContext").setType(loadClass("org.apache.camel.CamelContext"));
        javaClass.addField().setPrivate().setName("configuration").setType(configClass).addAnnotation(Autowired.class);

        Method ctr = javaClass.addMethod().setConstructor(true).setPublic().setName(name).addParameter("org.apache.camel.CamelContext", "camelContext");
        ctr.setBody("this.camelContext = camelContext;\n");
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        String body = createConverterPairBody(model);
        javaClass.addMethod().setName("getConvertibleTypes").setPublic().setReturnType("Set<ConvertiblePair>")
                .setBody(body);
        body = createConvertBody(model);
        javaClass.addMethod().setName("convert").setPublic().setReturnType("Object")
                .addParameter("Object", "source")
                .addParameter("TypeDescriptor", "sourceType")
                .addParameter("TypeDescriptor", "targetType")
                .setBody(body);
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("if (source == null) {\n");
        sb.append("    return null;\n");
        sb.append("}\n");
        sb.append("String ref = source.toString();\n");
        sb.append("if (!ref.startsWith(\"#\")) {\n");
        sb.append("    return null;\n");
        sb.append("}\n");
        sb.append("ref = ref.startsWith(\"#bean:\") ? ref.substring(6) : ref.substring(1);\n");
        sb.append("switch (targetType.getName()) {\n");
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("Set<ConvertiblePair> answer = new LinkedHashSet<>();\n");
        // we need complex types only which unique types only
        Stream<String> s = model.getOptions().stream().filter(this::isComplexType).map(SpringBootAutoConfigurationMojo::getJavaType).distinct();
        s.forEach(type -> {
            sb.append("answer.add(new ConvertiblePair(String.class, ");
            sb.append(type);
            sb.append(".class));\n");
        });
        sb.append("return answer;\n");
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        final String dataformatName = camelCaseToDash(overrideName != null ? overrideName : model.getName()).toLowerCase(Locale.US);
        final Class<?> configClass = generateDummyClass(packageName + "." + configurationName);
        final JavaClass javaClass = new JavaClass(getProjectClassLoader());

        javaClass.setPackage(packageName);
        javaClass.setName(name);
        javaClass.getJavaDoc().setFullText("Generated by camel-package-maven-plugin - do not edit this file!");
        javaClass.addAnnotation(Configuration.class).setLiteralValue("proxyBeanMethods", "false");
        javaClass.addAnnotation(AutoConfigureAfter.class).setLiteralValue("CamelAutoConfiguration.class");
        javaClass.addAnnotation(Conditional.class).setLiteralValue("ConditionalOnCamelContextAndAutoConfigurationBeans.class");
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        JavaClass javaClass = new JavaClass(getProjectClassLoader());
        javaClass.setPackage(packageName);
        javaClass.setName(name);
        javaClass.getJavaDoc().setFullText("Generated by camel-package-maven-plugin - do not edit this file!");
        javaClass.addImport("java.util.LinkedHashSet");
        javaClass.addImport("java.util.Set");
        javaClass.addImport("org.apache.camel.CamelContext");
        javaClass.addImport("org.springframework.core.convert.TypeDescriptor");
        javaClass.addImport("org.springframework.core.convert.converter.GenericConverter");

        javaClass.implementInterface("org.springframework.core.convert.converter.GenericConverter");
        javaClass.addField().setPrivate().setFinal(true).setName("camelContext").setType(loadClass("org.apache.camel.CamelContext"));
```

### DuplicatedCode
Duplicated code
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/StarterGeneratorMojo.java`
#### Snippet
```java
        Path parent = new File(startersDir, "pom.xml").toPath();
        List<String> lines = Files.readAllLines(parent);
        int modulesStart = -1, modulesEnd = -1;
        for (int i = 0; i < lines.size(); i++) {
            String s = lines.get(i);
            if (s.contains("<modules>"))
                modulesStart = i + 1;
            else if (s.contains("</modules>"))
                modulesEnd = i;
        }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[-]` can be simplified to '-'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
 */
public final class TimePatternConverter {
    private static final Pattern NUMBERS_ONLY_STRING_PATTERN = Pattern.compile("^[-]?(\\d)+$", Pattern.CASE_INSENSITIVE);
    private static final Pattern HOUR_REGEX_PATTERN = Pattern.compile("((\\d)*(\\d))h(our(s)?)?", Pattern.CASE_INSENSITIVE);
    private static final Pattern MINUTES_REGEX_PATTERN
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
        cfg.setTemplateLoader(new URLTemplateLoader() {
            @Override
            protected URL getURL(String name) {
                return SpringBootStarterMojo.class.getResource("/" + name);
            }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java

    private static String createLanguageBody(String shortJavaType, String name) {
        return new StringBuilder()
                .append("return new LanguageCustomizer() {\n")
                .append("    @Override\n")
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java

    private static String createComponentBody(String shortJavaType, String name) {
        return new StringBuilder()
                .append("return new ComponentCustomizer() {\n")
                .append("    @Override\n")
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java

    private static String createDataFormatBody(String shortJavaType, String name) {
        return new StringBuilder()
                .append("return new DataFormatCustomizer() {\n")
                .append("    @Override\n")
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        Set<String> deps = new TreeSet<>();
        deps.addAll(csvToSet(properties.getProperty(getMainDepArtifactId())));


```

## RuleId[id=Deprecation]
### Deprecation
'newInstance()' is deprecated
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptEncryptedPropertiesUtils.java`
#### Snippet
```java
        try {
            final Class clazz = Thread.currentThread().getContextClassLoader().loadClass(className);
            return (T) clazz.newInstance();
        } catch (Exception e) {
            throw new EncryptionInitializationException(e);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        method.addAnnotation(ConditionalOnClass.class).setLiteralValue("value", "CamelContext.class");
        method.addAnnotation(ConditionalOnMissingBean.class);
        method.setBody("" + "Map<String, Object> properties = new HashMap<>();\n" + "PluginHelper.getBeanIntrospection(camelContext).getProperties(config, properties, null, false);\n"
                + "// These options is configured specially further below, so remove them first\n" + "properties.remove(\"enableCors\");\n"
                + "properties.remove(\"apiProperty\");\n" + "properties.remove(\"componentProperty\");\n" + "properties.remove(\"consumerProperty\");\n"
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '?'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n").replaceFirst("\\?><!--", "\\?>\n<!--");

        writeIfChanged(content, destination);
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        writeSourceIfChanged(commonClass, packageName.replaceAll("\\.", "\\/") + "/" + commonName + ".java", true);

        Class commonClazz = generateDummyClass(commonClass.getCanonicalName());
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            method.setBody("this.enabled = enabled;");

            String fileName = packageName.replaceAll("\\.", "\\/") + "/" + configName + ".java";
            writeSourceIfChanged(configClass, fileName, true);
        }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        method.addAnnotation(Bean.class);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                + "    definition.setCorsHeaders(target);\n" + "}\n" + "return definition;");

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
        writeComponentSpringFactorySource(packageName, name);
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);

```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + className + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthHelper.java`
#### Snippet
```java
                    } else {
                        // Filter health check metadata to have a less verbose output
                        if (!metaKeys.contains(key)) {
                            data.put(key, value.toString());
                        }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `CustomizerProperties` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/ComponentConfigurationPropertiesCommon.java`
#### Snippet
```java
    // ********************************

    public class CustomizerProperties {
        /**
         * Global option to enable/disable component customizers, default is true.
```

### InnerClassMayBeStatic
Inner class `CustomizerProperties` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/LanguageConfigurationPropertiesCommon.java`
#### Snippet
```java
    // ********************************

    public class CustomizerProperties {
        /**
         * Global option to enable/disable language customizers, default is true.
```

### InnerClassMayBeStatic
Inner class `CustomizerProperties` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/DataFormatConfigurationPropertiesCommon.java`
#### Snippet
```java
    // ********************************

    public class CustomizerProperties {
        /**
         * Global option to enable/disable dataformat customizers, default is true.
```

### InnerClassMayBeStatic
Inner class `ServiceCall` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
    // *****************************************

    public class ServiceCall {

        /**
```

### InnerClassMayBeStatic
Inner class `CamelHealthCheckIndicatorInitializer` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthCheckAutoConfiguration.java`
#### Snippet
```java
    @ConditionalOnClass({CamelContext.class})
    @ConditionalOnMissingBean(CamelHealthCheckIndicator.class)
    protected class CamelHealthCheckIndicatorInitializer {

        @Bean(name = "camelHealth")
```

## RuleId[id=RegExpRepeatedSpace]
### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                        lastLine++;
                    }
                    sourceCode = lines.subList(0, lastLine).stream().map(s -> s.replaceAll("  ", " ")).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.joining(" "));
                    return sourceCode;
                }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-olingo4-starter/src/main/java/org/apache/camel/component/olingo4/springboot/Olingo4ComponentConfiguration.java`
#### Snippet
```java
    /**
     * Target OData service base URI, e.g.
     * http://services.odata.org/OData/OData.svc
     */
    private String serviceUri;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-dhis2-starter/src/main/java/org/apache/camel/component/dhis2/springboot/Dhis2ComponentConfiguration.java`
#### Snippet
```java
    private Boolean enabled;
    /**
     * DHIS2 server base API URL (e.g., https://play.dhis2.org/2.39.1.1/api)
     */
    private String baseApiUrl;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-google-sheets-starter/src/main/java/org/apache/camel/component/google/sheets/stream/springboot/GoogleSheetsStreamComponentConfiguration.java`
#### Snippet
```java
     * Specifies the level of permissions you want a sheets application to have
     * to a user account. See
     * https://developers.google.com/identity/protocols/googlescopes for more
     * info.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-azure-eventhubs-starter/src/main/java/org/apache/camel/component/azure/eventhubs/springboot/EventHubsComponentConfiguration.java`
#### Snippet
```java
     * information to connection to your EventHub. To learn on how to generate
     * the connection string, take a look at this documentation:
     * https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-get-connection-string
     */
    private String connectionString;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-azure-cosmosdb-starter/src/main/java/org/apache/camel/component/azure/cosmosdb/springboot/CosmosDbComponentConfiguration.java`
#### Snippet
```java
     * SESSION and EVENTUAL. Refer to consistency level documentation for
     * additional details:
     * https://docs.microsoft.com/en-us/azure/cosmos-db/consistency-levels
     */
    private ConsistencyLevel consistencyLevel = ConsistencyLevel.SESSION;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-azure-cosmosdb-starter/src/main/java/org/apache/camel/component/azure/cosmosdb/springboot/CosmosDbComponentConfiguration.java`
#### Snippet
```java
     * An SQL query to execute on a given resources. To learn more about Cosmos
     * SQL API, check this link {link
     * https://docs.microsoft.com/en-us/azure/cosmos-db/sql-query-getting-started}
     */
    private String query;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-google-drive-starter/src/main/java/org/apache/camel/component/google/drive/springboot/GoogleDriveComponentConfiguration.java`
#### Snippet
```java
    /**
     * Specifies the level of permissions you want a drive application to have
     * to a user account. See https://developers.google.com/drive/web/scopes for
     * more info.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-facebook-starter/src/main/java/org/apache/camel/component/facebook/springboot/FacebookComponentConfiguration.java`
#### Snippet
```java
    /**
     * Default OAuth permissions. Comma separated permission names. See
     * https://developers.facebook.com/docs/reference/login/#permissions for the
     * detail
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-olingo2-starter/src/main/java/org/apache/camel/component/olingo2/springboot/Olingo2ComponentConfiguration.java`
#### Snippet
```java
    /**
     * Target OData service base URI, e.g.
     * http://services.odata.org/OData/OData.svc
     */
    private String serviceUri;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlVerifierComponentConfiguration.java`
#### Snippet
```java
     * This interface allows the application to check the XML signature before
     * the validation is executed. This step is recommended in
     * http://www.w3.org/TR/xmldsig-bestpractices/#check-what-is-signed. The
     * option is a
     * org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker type.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlVerifierComponentConfiguration.java`
#### Snippet
```java
    /**
     * Indicator whether the XML signature elements (elements with local name
     * Signature and namesapce http://www.w3.org/2000/09/xmldsig#) shall be
     * removed from the document set to the output message. Normally, this is
     * only necessary, if the XML signature is enveloped. The default value is
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlVerifierComponentConfiguration.java`
#### Snippet
```java
     * following rules apply: In the enveloped XML signature case (there is a
     * reference with URI= and transform
     * http://www.w3.org/2000/09/xmldsig#enveloped-signature), the incoming XML
     * document without the Signature element is set to the output message body.
     * In the non-enveloped XML signature case, the message body is determined
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConfiguration.java`
#### Snippet
```java
     * calculated. By default, C14n is added and in the case of enveloped
     * signature (see option parentLocalName) also
     * http://www.w3.org/2000/09/xmldsig#enveloped-signature is added at
     * position 0 of the list. Use methods in XmlSignatureHelper to create the
     * transform methods.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConfiguration.java`
#### Snippet
```java
    /**
     * Signature algorithm. Default value is
     * http://www.w3.org/2000/09/xmldsig#rsa-sha1.
     */
    private String signatureAlgorithm = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConfiguration.java`
#### Snippet
```java
     * for calculating the digest of the input message. If this digest algorithm
     * is not specified then the digest algorithm is calculated from the
     * signature algorithm. Example: http://www.w3.org/2001/04/xmlenc#sha256
     */
    private String digestAlgorithm;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConfiguration.java`
#### Snippet
```java
    /**
     * Namespace prefix for the XML signature namespace
     * http://www.w3.org/2000/09/xmldsig#. Default value is ds. If null or an
     * empty value is set then no prefix is used for the XML signature
     * namespace. See best practice
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/component/xmlsecurity/springboot/XmlSignerComponentConfiguration.java`
#### Snippet
```java
     * empty value is set then no prefix is used for the XML signature
     * namespace. See best practice
     * http://www.w3.org/TR/xmldsig-bestpractices/#signing-xml-
     * without-namespaces
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-jira-starter/src/main/java/org/apache/camel/component/jira/springboot/JiraComponentConfiguration.java`
#### Snippet
```java
    private Integer delay = 6000;
    /**
     * The Jira server url, example: http://my_jira.com:8081
     */
    private String jiraUrl;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-undertow-spring-security-starter/src/main/java/org/apache/camel/undertow/spring/boot/providers/KeycloakProviderConfiguration.java`
#### Snippet
```java

    /**
     * Url to keycloak server which will be used in spring security configuration. (Example "http://localhost:8080")
     */
    private String url;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-debezium-sqlserver-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumSqlserverComponentConfiguration.java`
#### Snippet
```java
     * KafkaOffsetBackingStore), the properties have to be prefixed with
     * additionalProperties.. E.g:
     * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro
     */
    private Map<String, Object> additionalProperties;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConfiguration.java`
#### Snippet
```java
     * platforms. You need to add the netty JAR for the host operating system
     * you are using. See more details at:
     * http://netty.io/wiki/native-transports.html
     */
    private Boolean nativeTransport = false;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConfiguration.java`
#### Snippet
```java
     * Kafka properties that are not reflected yet in Camel configurations), the
     * properties have to be prefixed with additionalProperties.. E.g:
     * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro
     */
    private Map<String, Object> additionalProperties;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConfiguration.java`
#### Snippet
```java
     * The Simple Authentication and Security Layer (SASL) Mechanism used. For
     * the valid values see
     * http://www.iana.org/assignments/sasl-mechanisms/sasl-mechanisms.xhtml
     */
    private String saslMechanism = "GSSAPI";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-servicenow-starter/src/main/java/org/apache/camel/component/servicenow/springboot/ServiceNowComponentConfiguration.java`
#### Snippet
```java
    /**
     * To configure security using SSLContextParameters. See
     * http://camel.apache.org/camel-configuration-utilities.html. The option is
     * a org.apache.camel.support.jsse.SSLContextParameters type.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-servicenow-starter/src/main/java/org/apache/camel/component/servicenow/springboot/ServiceNowComponentConfiguration.java`
#### Snippet
```java
    /**
     * The ServiceNow release to target, default to Helsinki See
     * https://docs.servicenow.com
     */
    private ServiceNowRelease release = ServiceNowRelease.HELSINKI;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-debezium-oracle-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumOracleComponentConfiguration.java`
#### Snippet
```java
     * KafkaOffsetBackingStore), the properties have to be prefixed with
     * additionalProperties.. E.g:
     * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro
     */
    private Map<String, Object> additionalProperties;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-debezium-mysql-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumMySqlComponentConfiguration.java`
#### Snippet
```java
     * KafkaOffsetBackingStore), the properties have to be prefixed with
     * additionalProperties.. E.g:
     * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro
     */
    private Map<String, Object> additionalProperties;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-wordpress-starter/src/main/java/org/apache/camel/component/wordpress/springboot/WordpressComponentConfiguration.java`
#### Snippet
```java
    private SearchCriteria searchCriteria;
    /**
     * The Wordpress API URL from your site, e.g. http://myblog.com/wp-json/
     */
    private String url;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-debezium-mongodb-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumMongodbComponentConfiguration.java`
#### Snippet
```java
     * KafkaOffsetBackingStore), the properties have to be prefixed with
     * additionalProperties.. E.g:
     * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro
     */
    private Map<String, Object> additionalProperties;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-lra-starter/src/main/java/org/apache/camel/service/lra/springboot/LraServiceConfiguration.java`
#### Snippet
```java

    /**
     * The local URL where the coordinator should send callbacks to (e.g. http://my-host-name:8080)
     */
    private String localParticipantUrl;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-lra-starter/src/main/java/org/apache/camel/service/lra/springboot/LraServiceConfiguration.java`
#### Snippet
```java

    /**
     * The base URL of the LRA coordinator service (e.g. http://lra-host:8080)
     */
    private String coordinatorUrl;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConfiguration.java`
#### Snippet
```java
     * platforms. You need to add the netty JAR for the host operating system
     * you are using. See more details at:
     * http://netty.io/wiki/native-transports.html
     */
    private Boolean nativeTransport = false;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConfiguration.java`
#### Snippet
```java
     * to setup a web application and configure a callback URL to receive the
     * refresh token, or configure using the builtin callback at
     * https://login.salesforce.com/services/oauth2/success or
     * https://test.salesforce.com/services/oauth2/success and then retrive the
     * refresh_token from the URL at the end of the flow. Note that in
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConfiguration.java`
#### Snippet
```java
     * refresh token, or configure using the builtin callback at
     * https://login.salesforce.com/services/oauth2/success or
     * https://test.salesforce.com/services/oauth2/success and then retrive the
     * refresh_token from the URL at the end of the flow. Note that in
     * development organizations Salesforce allows hosting the callback web
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConfiguration.java`
#### Snippet
```java
    /**
     * URL of the Salesforce instance used for authentication, by default set to
     * https://login.salesforce.com
     */
    private String loginUrl = "https://login.salesforce.com";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-debezium-postgres-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumPostgresComponentConfiguration.java`
#### Snippet
```java
     * KafkaOffsetBackingStore), the properties have to be prefixed with
     * additionalProperties.. E.g:
     * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro
     */
    private Map<String, Object> additionalProperties;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-rest-openapi-starter/src/main/java/org/apache/camel/component/rest/openapi/springboot/RestOpenApiComponentConfiguration.java`
#### Snippet
```java
     * component and endpoint of this Component should contain the scheme,
     * hostname and optionally the port in the URI syntax (i.e.
     * https://api.example.com:8080). Can be overridden in endpoint
     * configuration.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-rest-openapi-starter/src/main/java/org/apache/camel/component/rest/openapi/springboot/RestOpenApiComponentConfiguration.java`
#### Snippet
```java
    /**
     * Scheme hostname and port to direct the HTTP requests to in the form of
     * https://hostname:port. Can be configured at the endpoint, component or in
     * the corresponding REST configuration in the Camel Context. If you give
     * this component a name (e.g. petstore) that REST configuration is
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-google-calendar-starter/src/main/java/org/apache/camel/component/google/calendar/stream/springboot/GoogleCalendarStreamComponentConfiguration.java`
#### Snippet
```java
    /**
     * Specifies the level of permissions you want a calendar application to
     * have to a user account. See https://developers.google.com/calendar/auth
     * for more info.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-google-calendar-starter/src/main/java/org/apache/camel/component/google/calendar/stream/springboot/GoogleCalendarStreamComponentConfiguration.java`
#### Snippet
```java
    private List<String> scopes;
    /**
     * Sync events, see https://developers.google.com/calendar/v3/sync Note: not
     * compatible with: 'query' and 'considerLastUpdate' parameters
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-google-calendar-starter/src/main/java/org/apache/camel/component/google/calendar/springboot/GoogleCalendarComponentConfiguration.java`
#### Snippet
```java
     * Specifies the level of permissions you want a calendar application to
     * have to a user account. You can separate multiple scopes by comma. See
     * https://developers.google.com/google-apps/calendar/auth for more info.
     */
    private List<String> scopes;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `components-starter/camel-debezium-db2-starter/src/main/java/org/apache/camel/component/debezium/springboot/DebeziumDb2ComponentConfiguration.java`
#### Snippet
```java
     * KafkaOffsetBackingStore), the properties have to be prefixed with
     * additionalProperties.. E.g:
     * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro
     */
    private Map<String, Object> additionalProperties;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `components-starter/camel-platform-http-starter/src/main/java/org/apache/camel/component/platform/http/springboot/CamelRequestHandlerMapping.java`
#### Snippet
```java
public class CamelRequestHandlerMapping extends RequestMappingHandlerMapping implements PlatformHttpListener {

    private final PlatformHttpComponent component;
    private final PlatformHttpEngine engine;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `components-starter/camel-platform-http-starter/src/main/java/org/apache/camel/component/platform/http/springboot/CamelRequestHandlerMapping.java`
#### Snippet
```java

    private final PlatformHttpComponent component;
    private final PlatformHttpEngine engine;

    public CamelRequestHandlerMapping(PlatformHttpComponent component, PlatformHttpEngine engine) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthCheckIndicator.java`
#### Snippet
```java
public class CamelHealthCheckIndicator extends AbstractHealthIndicator {

    private final ApplicationContext applicationContext;
    private final CamelContext camelContext;

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        if ("netty-http".equals(model.getScheme())) {
            String name = option.getName();
            if (name.equals("textline") || name.equals("delimiter") || name.equals("autoAppendDelimiter") || name.equals("decoderMaxLineLength") || name.equals("encoding")
                    || name.equals("allowDefaultCodec") || name.equals("udpConnectionlessSending") || name.equals("networkInterface") || name.equals("clientMode")
                    || name.equals("reconnect") || name.equals("reconnectInterval") || name.equals("useByteBuf") || name.equals("udpByteArrayCodec") || name.equals("broadcast")) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java
        } else {
            File parent = file.getParentFile();
            parent.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java
        DOMSource source = new DOMSource(pom);

        targetPom.getParentFile().mkdirs();

        String content;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        File outDir = new File(baseDir, "src/main/resources/META-INF");
        outDir.mkdirs();
        File outFile = new File(outDir, "spring.provides");

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        DOMSource source = new DOMSource(pom);

        targetPom.getParentFile().mkdirs();

        String content;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        } else {
            File parent = file.getParentFile();
            parent.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
            // Create the structure
            File parent = file.getParentFile();
            parent.mkdirs();
        }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'servlet'
in `components-starter/camel-micrometer-starter/src/main/java/org/apache/camel/component/micrometer/springboot/MicrometerTagsAutoConfiguration.java`
#### Snippet
```java
     */
    @Bean
    WebMvcTagsProvider webMvcTagsProvider(Optional<CamelServlet> servlet, CamelMetricsConfiguration configuration) {
        return new DefaultWebMvcTagsProvider() {
            @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeout'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void stopRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit, Optional<Boolean> abortAfterTimeout) {
        try {
            if (timeout.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeUnit'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void stopRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit, Optional<Boolean> abortAfterTimeout) {
        try {
            if (timeout.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'abortAfterTimeout'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void stopRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit, Optional<Boolean> abortAfterTimeout) {
        try {
            if (timeout.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeout'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void suspendRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit) {
        try {
            if (timeout.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeUnit'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void suspendRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit) {
        try {
            if (timeout.isPresent()) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/StarterGeneratorMojo.java`
#### Snippet
```java
        }
        Files.write(new File(directory, "pom.xml").toPath(),
                Files.lines(sourcePom.toPath())
                        .map(s -> s.replaceAll("%NAME%", name))
                        .collect(Collectors.toList()));
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java
        List<Dependency> outDependencies = new ArrayList<>();

        Files.list(startersDir.toPath())
                .filter(Files::isDirectory)
                // must have a pom.xml to be active
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        }

        Files.list(startersDir.toPath())
                .filter(Files::isDirectory)
                // must have a pom.xml to be active
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.camel.component.ehcache.springboot.EhcacheComponentAutoConfiguration;`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheManagerCustomizer.java`
#### Snippet
```java
import org.apache.camel.Ordered;
import org.apache.camel.component.ehcache.EhcacheComponent;
import org.apache.camel.component.ehcache.springboot.EhcacheComponentAutoConfiguration;
import org.apache.camel.spi.ComponentCustomizer;
import org.apache.camel.spi.HasId;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.jms.*;`
in `components-starter/camel-jms-starter/src/main/java/org/apache/camel/component/jms/springboot/JmsComponentConfiguration.java`
#### Snippet
```java
import jakarta.jms.ExceptionListener;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.jms.*;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spring.boot.actuate.endpoint.CamelRouteControllerEndpoint;`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/console/CamelDevConsoleAutoConfiguration.java`
#### Snippet
```java
import org.apache.camel.CamelContext;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.spring.boot.actuate.endpoint.CamelRouteControllerEndpoint;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpoint;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
```

### UNUSED_IMPORT
Unused import `import java.util.TreeMap;`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthHelper.java`
#### Snippet
```java
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

final class CamelHealthHelper {
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudServiceDiscovery.java`
#### Snippet
```java

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.camel.cloud.ServiceDefinition;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Paths;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.*;
```

### UNUSED_IMPORT
Unused import `import java.io.FileInputStream;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
```

### UNUSED_IMPORT
Unused import `import java.io.FileReader;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
```

### UNUSED_IMPORT
Unused import `import java.nio.charset.StandardCharsets;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.camel.maven.packaging.MvelHelper;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.springboot.maven.model.SpringBootAutoConfigureOptionModel;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java

import org.apache.camel.maven.packaging.MvelHelper;
import org.apache.camel.springboot.maven.model.SpringBootAutoConfigureOptionModel;
import org.apache.camel.springboot.maven.model.SpringBootModel;
import org.apache.camel.tooling.util.Strings;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.springboot.maven.model.SpringBootModel;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import org.apache.camel.maven.packaging.MvelHelper;
import org.apache.camel.springboot.maven.model.SpringBootAutoConfigureOptionModel;
import org.apache.camel.springboot.maven.model.SpringBootModel;
import org.apache.camel.tooling.util.Strings;
import org.apache.camel.util.json.DeserializationException;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `stringEncryptor` may be 'final'
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptSpringEncryptedPropertiesParser.java`
#### Snippet
```java
    private PropertyResolver propertyResolver;

    private StringEncryptor stringEncryptor;

    @Autowired
```

### FieldMayBeFinal
Field `propertyResolver` may be 'final'
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptSpringEncryptedPropertiesParser.java`
#### Snippet
```java
public class JasyptSpringEncryptedPropertiesParser extends DefaultPropertiesParser {

    private PropertyResolver propertyResolver;

    private StringEncryptor stringEncryptor;
```

### FieldMayBeFinal
Field `stringEncryptor` may be 'final'
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/EncryptablePropertySourcesPlaceholderConfigurer.java`
#### Snippet
```java
     * The encryptor.
     */
    private StringEncryptor stringEncryptor;

    /**
```

### FieldMayBeFinal
Field `checkTtl` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * The time (in seconds) to live for TTL checks. Default is 1 minute.
     */
    private int checkTtl = 60;

    /**
```

### FieldMayBeFinal
Field `blockSeconds` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * The time (in seconds) to wait for a watch event, default 10 seconds
     */
    private Integer blockSeconds = 10;

    /**
```

### FieldMayBeFinal
Field `firstIndex` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * The first index for watch for, default 0
     */
    private BigInteger firstIndex = BigInteger.valueOf(0L);

    /**
```

### FieldMayBeFinal
Field `rootPath` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * 
     */
    private String rootPath = "/camel";

    // 
```

### FieldMayBeFinal
Field `consistencyMode` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * The consistencyMode used for queries, default ConsistencyMode.DEFAULT
     */
    private ConsistencyMode consistencyMode = ConsistencyMode.DEFAULT;

    /**
```

### FieldMayBeFinal
Field `sessionRefreshInterval` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * 
     */
    private int sessionRefreshInterval = 5;

    /**
```

### FieldMayBeFinal
Field `deregisterAfter` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * shutdown. Default is 1 hour.
     */
    private int deregisterAfter = 3600;

    //
```

### FieldMayBeFinal
Field `sessionTtl` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * 
     */
    private int sessionTtl = 60;

    /**
```

### FieldMayBeFinal
Field `checkInterval` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * is TTL or how often the check should run. Default is 5 seconds.
     */
    private int checkInterval = 5;

    /**
```

### FieldMayBeFinal
Field `overrideServiceHost` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * Should we override the service host if given ?
     */
    private boolean overrideServiceHost = true;

    /**
```

### FieldMayBeFinal
Field `deregisterServicesOnStop` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * stop?
     */
    private boolean deregisterServicesOnStop = true;

    /**
```

### FieldMayBeFinal
Field `pingInstance` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * Consul instance
     */
    private boolean pingInstance = true;

    /**
```

### FieldMayBeFinal
Field `sessionLockDelay` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java
     * 
     */
    private int sessionLockDelay = 5;

    /**
```

### FieldMayBeFinal
Field `rootPath` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cluster/ConsulClusterServiceConfiguration.java`
#### Snippet
```java
     * Consul root path
     */
    private String rootPath = "/camel";

    // 
```

### FieldMayBeFinal
Field `sessionTtl` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cluster/ConsulClusterServiceConfiguration.java`
#### Snippet
```java
     * The value of TTL
     */
    private int sessionTtl = 60;

    /**
```

### FieldMayBeFinal
Field `consistencyMode` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cluster/ConsulClusterServiceConfiguration.java`
#### Snippet
```java
     * The consistencyMode used for queries, default ConsistencyMode.DEFAULT
     */
    private ConsistencyMode consistencyMode = ConsistencyMode.DEFAULT;

    /**
```

### FieldMayBeFinal
Field `firstIndex` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cluster/ConsulClusterServiceConfiguration.java`
#### Snippet
```java
     * The first index for watch for, default 0
     */
    private BigInteger firstIndex = BigInteger.valueOf(0L);

    /**
```

### FieldMayBeFinal
Field `pingInstance` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cluster/ConsulClusterServiceConfiguration.java`
#### Snippet
```java
     * Consul instance
     */
    private boolean pingInstance = true;

    /**
```

### FieldMayBeFinal
Field `sessionRefreshInterval` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cluster/ConsulClusterServiceConfiguration.java`
#### Snippet
```java
     * The value of wait attribute
     */
    private int sessionRefreshInterval = 5;

    /**
```

### FieldMayBeFinal
Field `sessionLockDelay` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cluster/ConsulClusterServiceConfiguration.java`
#### Snippet
```java
     * The value for lockDelay
     */
    private int sessionLockDelay = 5;

    /**
```

### FieldMayBeFinal
Field `blockSeconds` may be 'final'
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cluster/ConsulClusterServiceConfiguration.java`
#### Snippet
```java
     * The time (in seconds) to wait for a watch event, default 10 seconds
     */
    private Integer blockSeconds = 10;

    /**
```

### FieldMayBeFinal
Field `configurations` may be 'final'
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/model/cloud/springboot/ConsulServiceCallServiceDiscoveryConfigurationProperties.java`
#### Snippet
```java
     * Define additional configuration definitions
     */
    private Map<String, ConsulServiceCallServiceDiscoveryConfigurationCommon> configurations = new HashMap<>();

    public Map<String, ConsulServiceCallServiceDiscoveryConfigurationCommon> getConfigurations() {
```

### FieldMayBeFinal
Field `configurations` may be 'final'
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/model/cloud/springboot/DnsServiceCallServiceDiscoveryConfigurationProperties.java`
#### Snippet
```java
     * Define additional configuration definitions
     */
    private Map<String, DnsServiceCallServiceDiscoveryConfigurationCommon> configurations = new HashMap<>();

    public Map<String, DnsServiceCallServiceDiscoveryConfigurationCommon> getConfigurations() {
```

### FieldMayBeFinal
Field `configurations` may be 'final'
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/model/cloud/springboot/KubernetesServiceCallServiceDiscoveryConfigurationProperties.java`
#### Snippet
```java
     * Define additional configuration definitions
     */
    private Map<String, KubernetesServiceCallServiceDiscoveryConfigurationCommon> configurations = new HashMap<>();

    public Map<String, KubernetesServiceCallServiceDiscoveryConfigurationCommon> getConfigurations() {
```

### FieldMayBeFinal
Field `configurations` may be 'final'
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/model/springboot/Resilience4jConfigurationDefinitionProperties.java`
#### Snippet
```java
     * Define additional configuration definitions
     */
    private Map<String, Resilience4jConfigurationDefinitionCommon> configurations = new HashMap<>();

    public Map<String, Resilience4jConfigurationDefinitionCommon> getConfigurations() {
```

### FieldMayBeFinal
Field `maxCloseWait` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Time to wait during close to join background threads.
     */
    private long maxCloseWait = 1000;
    
    /**
```

### FieldMayBeFinal
Field `connectionTimeout` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Connection timeout.
     */
    private long connectionTimeout = 15000;

    /**
```

### FieldMayBeFinal
Field `maxCloseWaitUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit maxCloseWaitUnit = TimeUnit.MILLISECONDS;
    
    /**
```

### FieldMayBeFinal
Field `reconnectBaseSleepTimeUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit reconnectBaseSleepTimeUnit = TimeUnit.MILLISECONDS;

    /**
```

### FieldMayBeFinal
Field `sessionTimeoutUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit sessionTimeoutUnit =  TimeUnit.MILLISECONDS;

    /**
```

### FieldMayBeFinal
Field `maxCloseWaitUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit maxCloseWaitUnit = TimeUnit.MILLISECONDS;
    
    /**
```

### FieldMayBeFinal
Field `sessionTimeout` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Session timeout.
     */
    private long sessionTimeout = 60000;

    /**
```

### FieldMayBeFinal
Field `deregisterServicesOnStop` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Default is true.
     */
    private boolean deregisterServicesOnStop = true;

    /**
```

### FieldMayBeFinal
Field `reconnectMaxRetries` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Max number of times to retry.
     */
    private int reconnectMaxRetries = 3;

    /**
```

### FieldMayBeFinal
Field `sessionTimeout` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Session timeout.
     */
    private long sessionTimeout = 60000;

    /**
```

### FieldMayBeFinal
Field `reconnectMaxSleepTimeUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit reconnectMaxSleepTimeUnit = TimeUnit.MILLISECONDS;
    
    /**
```

### FieldMayBeFinal
Field `connectionTimeoutUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit connectionTimeoutUnit = TimeUnit.MILLISECONDS;
    
    /**
```

### FieldMayBeFinal
Field `reconnectMaxSleepTime` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Default is Integer.MAX_VALUE.
     */
    private long reconnectMaxSleepTime = Integer.MAX_VALUE;
    
    /**
```

### FieldMayBeFinal
Field `reconnectBaseSleepTimeUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit reconnectBaseSleepTimeUnit = TimeUnit.MILLISECONDS;

    /**
```

### FieldMayBeFinal
Field `connectionTimeoutUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit connectionTimeoutUnit = TimeUnit.MILLISECONDS;
    
    /**
```

### FieldMayBeFinal
Field `reconnectMaxSleepTimeUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit reconnectMaxSleepTimeUnit = TimeUnit.MILLISECONDS;
    
    /**
```

### FieldMayBeFinal
Field `overrideServiceHost` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Default is true.
     */
    private boolean overrideServiceHost = true;

    /**
```

### FieldMayBeFinal
Field `connectionTimeout` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Connection timeout.
     */
    private long connectionTimeout = 15000;

    /**
```

### FieldMayBeFinal
Field `sessionTimeoutUnit` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Default is TimeUnit.MILLISECONDS.
     */
    private TimeUnit sessionTimeoutUnit =  TimeUnit.MILLISECONDS;

    /**
```

### FieldMayBeFinal
Field `reconnectMaxSleepTime` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Default is Integer.MAX_VALUE.
     */
    private long reconnectMaxSleepTime = Integer.MAX_VALUE;
    
    /**
```

### FieldMayBeFinal
Field `reconnectMaxRetries` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Max number of times to retry.
     */
    private int reconnectMaxRetries = 3;

    /**
```

### FieldMayBeFinal
Field `maxCloseWait` may be 'final'
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java
     * Time to wait during close to join background threads.
     */
    private long maxCloseWait = 1000;
    
    /**
```

### FieldMayBeFinal
Field `customizer` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/ComponentConfigurationPropertiesCommon.java`
#### Snippet
```java

    @NestedConfigurationProperty
    private CustomizerProperties customizer = new CustomizerProperties();

    public boolean isEnabled() {
```

### FieldMayBeFinal
Field `customizer` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/LanguageConfigurationPropertiesCommon.java`
#### Snippet
```java

    @NestedConfigurationProperty
    private CustomizerProperties customizer = new CustomizerProperties();

    public boolean isEnabled() {
```

### FieldMayBeFinal
Field `customizer` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/DataFormatConfigurationPropertiesCommon.java`
#### Snippet
```java

    @NestedConfigurationProperty
    private CustomizerProperties customizer = new CustomizerProperties();

    public boolean isEnabled() {
```

### FieldMayBeFinal
Field `startupRecorderMaxDepth` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * The default is -1.
     */
    private int startupRecorderMaxDepth = -1;

    /**
```

### FieldMayBeFinal
Field `autoStartup` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Default is true to always start up.
     */
    private boolean autoStartup = true;

    /**
```

### FieldMayBeFinal
Field `routesIncludePattern` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * whose name contains foo use: &#42;&#42;/*foo*.
     */
    private String routesIncludePattern = "classpath:camel/*,classpath:camel-template/*,classpath:camel-rest/*";

    /**
```

### FieldMayBeFinal
Field `routesCollectorEnabled` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * The routes collector is default enabled.
     */
    private boolean routesCollectorEnabled = true;

    /**
```

### FieldMayBeFinal
Field `shutdownNowOnTimeout` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * keep running and is halted abruptly when CamelContext has been shutdown.
     */
    private boolean shutdownNowOnTimeout = true;

    /**
```

### FieldMayBeFinal
Field `startupRecorderProfile` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * The default is default.
     */
    private String startupRecorderProfile = "default";

    /**
```

### FieldMayBeFinal
Field `routesReloadPattern` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Multiple patterns can be specified separated by comma.
     */
    private String routesReloadPattern = "camel/*";

    /**
```

### FieldMayBeFinal
Field `consumerTemplateCacheSize` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Consumer template endpoints cache size.
     */
    private int consumerTemplateCacheSize = 1000;

    /**
```

### FieldMayBeFinal
Field `loadTypeConverters` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * type converter classes.
     */
    private boolean loadTypeConverters = true;

    /**
```

### FieldMayBeFinal
Field `routesReloadDirectory` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * src/main/resources to scan for Camel routes in XML or YAML files.
     */
    private String routesReloadDirectory = "src/main/resources";

    /**
```

### FieldMayBeFinal
Field `exchangeFactory` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * default is prototype mode.
     */
    private String exchangeFactory = "default";

    /**
```

### FieldMayBeFinal
Field `jmxManagementStatisticsLevel` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * The default value is Default.
     */
    private ManagementStatisticsLevel jmxManagementStatisticsLevel = ManagementStatisticsLevel.Default;

    /**
```

### FieldMayBeFinal
Field `allowAddingNewRoutes` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * As this affects the entire JVM where Camel JARs are on the classpath.
     */
    private boolean allowAddingNewRoutes = true;

    /**
```

### FieldMayBeFinal
Field `streamCachingRemoveSpoolDirectoryWhenStopping` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * This option is default true.
     */
    private boolean streamCachingRemoveSpoolDirectoryWhenStopping = true;

    /**
```

### FieldMayBeFinal
Field `streamCachingEnabled` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Default is true.
     */
    private boolean streamCachingEnabled = true;

    /**
```

### FieldMayBeFinal
Field `jmxEnabled` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Enable JMX in your Camel application.
     */
    private boolean jmxEnabled = true;

    /**
```

### FieldMayBeFinal
Field `messageHistory` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Default is true.
     */
    private boolean messageHistory = true;

    /**
```

### FieldMayBeFinal
Field `producerTemplateCacheSize` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Producer template endpoints cache size.
     */
    private int producerTemplateCacheSize = 1000;

    /**
```

### FieldMayBeFinal
Field `exchangeFactoryCapacity` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * The capacity the pool (for each consumer) uses for storing exchanges. The default capacity is 100.
     */
    private int exchangeFactoryCapacity = 100;

    /**
```

### FieldMayBeFinal
Field `shutdownTimeout` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Timeout in seconds to graceful shutdown Camel.
     */
    private int shutdownTimeout = 300;

    /**
```

### FieldMayBeFinal
Field `caseInsensitiveHeaders` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Default is true.
     */
    private boolean caseInsensitiveHeaders = true;

    /**
```

### FieldMayBeFinal
Field `durationMaxAction` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * triggered.
     */
    private String durationMaxAction = "shutdown";

    /**
```

### FieldMayBeFinal
Field `jmxManagementMBeansLevel` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * The default value is Default.
     */
    private ManagementMBeansLevel jmxManagementMBeansLevel = ManagementMBeansLevel.Default;

    /**
```

### FieldMayBeFinal
Field `uuidGenerator` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * (turned off for exchanges - only intended for performance profiling)
     */
    private String uuidGenerator = "default";

    /**
```

### FieldMayBeFinal
Field `shutdownRoutesInReverseOrder` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Sets whether routes should be shutdown in reverse or the same order as they where started.
     */
    private boolean shutdownRoutesInReverseOrder = true;

    /**
```

### FieldMayBeFinal
Field `jmxManagementNamePattern` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * The default pattern is #name#
     */
    private String jmxManagementNamePattern = "#name#";

    /**
```

### FieldMayBeFinal
Field `routesReloadRemoveAllRoutes` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * routes are continued to run.
     */
    private boolean routesReloadRemoveAllRoutes = true;

    /**
```

### FieldMayBeFinal
Field `shutdownLogInflightExchangesOnTimeout` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * This requires to enable the option inflightRepositoryExchangeEnabled.
     */
    private boolean shutdownLogInflightExchangesOnTimeout = true;

    /**
```

### FieldMayBeFinal
Field `beanPostProcessorEnabled` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * The default value is true (enabled).
     */
    private boolean beanPostProcessorEnabled = true;

    /**
```

### FieldMayBeFinal
Field `autowiredEnabled` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Default is true.
     */
    private boolean autowiredEnabled = true;

    /**
```

### FieldMayBeFinal
Field `startupSummaryLevel` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/CamelConfigurationProperties.java`
#### Snippet
```java
     * Controls the level of information logged during startup (and shutdown) of CamelContext.
     */
    private StartupSummaryLevel startupSummaryLevel = StartupSummaryLevel.Default;

    /**
```

### FieldMayBeFinal
Field `delegate` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudServiceDiscovery.java`
#### Snippet
```java

public class CamelCloudServiceDiscovery implements ServiceDiscovery {
    private ServiceDiscovery delegate;

    public CamelCloudServiceDiscovery(List<ServiceDiscovery> serviceDiscoveryList) {
```

### FieldMayBeFinal
Field `serviceFilter` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
    private LoadBalancer loadBalancer = new LoadBalancer();
    private ServiceDiscovery serviceDiscovery = new ServiceDiscovery();
    private ServiceFilter serviceFilter = new ServiceFilter();
    private ServiceChooser serviceChooser = new ServiceChooser();
    private ServiceRegistry serviceRegistry = new ServiceRegistry();
```

### FieldMayBeFinal
Field `configurations` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
         * Configure the service filtering rules.
         */
        private Map<String, ServiceFilterConfiguration> configurations = new HashMap<>();

        public boolean isEnabled() {
```

### FieldMayBeFinal
Field `configurations` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
         * Configure the service discovery rules.
         */
        private Map<String, ServiceDiscoveryConfiguration> configurations = new HashMap<>();

        public boolean isEnabled() {
```

### FieldMayBeFinal
Field `serviceDiscovery` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
    private ServiceCall serviceCall = new ServiceCall();
    private LoadBalancer loadBalancer = new LoadBalancer();
    private ServiceDiscovery serviceDiscovery = new ServiceDiscovery();
    private ServiceFilter serviceFilter = new ServiceFilter();
    private ServiceChooser serviceChooser = new ServiceChooser();
```

### FieldMayBeFinal
Field `serviceDefinitions` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
         * Configure static service discovery with distinct id, host, port, and metadata properties.
         */
        private Map<String, List<ServiceDefinitionConfiguration>> serviceDefinitions = new HashMap<>();

        public Map<String, List<String>> getServices() {
```

### FieldMayBeFinal
Field `serviceRegistry` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
    private ServiceFilter serviceFilter = new ServiceFilter();
    private ServiceChooser serviceChooser = new ServiceChooser();
    private ServiceRegistry serviceRegistry = new ServiceRegistry();

    public boolean isEnabled() {
```

### FieldMayBeFinal
Field `loadBalancer` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
    private boolean enabled = true;
    private ServiceCall serviceCall = new ServiceCall();
    private LoadBalancer loadBalancer = new LoadBalancer();
    private ServiceDiscovery serviceDiscovery = new ServiceDiscovery();
    private ServiceFilter serviceFilter = new ServiceFilter();
```

### FieldMayBeFinal
Field `serviceCall` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
     */
    private boolean enabled = true;
    private ServiceCall serviceCall = new ServiceCall();
    private LoadBalancer loadBalancer = new LoadBalancer();
    private ServiceDiscovery serviceDiscovery = new ServiceDiscovery();
```

### FieldMayBeFinal
Field `services` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
         * Configure static service discovery using simple host:port strings.
         */
        private Map<String, List<String>> services = new HashMap<>();

        /**
```

### FieldMayBeFinal
Field `blacklist` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
         * Configure service filter blacklists.
         */
        private Map<String, List<String>> blacklist = new HashMap<>();

        public Map<String, List<String>> getBlacklist() {
```

### FieldMayBeFinal
Field `serviceChooser` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
    private ServiceDiscovery serviceDiscovery = new ServiceDiscovery();
    private ServiceFilter serviceFilter = new ServiceFilter();
    private ServiceChooser serviceChooser = new ServiceChooser();
    private ServiceRegistry serviceRegistry = new ServiceRegistry();

```

### FieldMayBeFinal
Field `camelContext` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRouteControllerEndpoint.java`
#### Snippet
```java
public class CamelRouteControllerEndpoint {

    private CamelContext camelContext;

    public CamelRouteControllerEndpoint(CamelContext camelContext) {
```

### FieldMayBeFinal
Field `camelContext` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/console/CamelDevConsoleEndpoint.java`
#### Snippet
```java
public class CamelDevConsoleEndpoint {

    private CamelContext camelContext;

    public CamelDevConsoleEndpoint(CamelContext camelContext) {
```

### FieldMayBeFinal
Field `filters` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/ClusteredRouteControllerAutoConfiguration.java`
#### Snippet
```java

    @Autowired(required = false)
    private List<ClusteredRouteFilter> filters = Collections.emptyList();

    @Bean
```

### FieldMayBeFinal
Field `managedCamelContext` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java

    private CamelContext camelContext;
    private ManagedCamelContext managedCamelContext;
    private CamelRoutesEndpointProperties properties;

```

### FieldMayBeFinal
Field `properties` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    private CamelContext camelContext;
    private ManagedCamelContext managedCamelContext;
    private CamelRoutesEndpointProperties properties;

    public CamelRoutesEndpoint(CamelContext camelContext, CamelRoutesEndpointProperties properties) {
```

### FieldMayBeFinal
Field `camelContext` may be 'final'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
public class CamelRoutesEndpoint {

    private CamelContext camelContext;
    private ManagedCamelContext managedCamelContext;
    private CamelRoutesEndpointProperties properties;
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/StarterGeneratorMojo.java`
#### Snippet
```java
        try {
            doExecute();
        } catch (MojoExecutionException | MojoFailureException e) {
            throw e;
        } catch (Exception e) {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `ex` is immediately rethrown
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
            writePom(pom);

        } catch (MojoFailureException ex) {
            throw ex;
        } catch (MojoExecutionException ex) {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `ex` is immediately rethrown
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        } catch (MojoFailureException ex) {
            throw ex;
        } catch (MojoExecutionException ex) {
            throw ex;
        } catch (Exception ex) {
```

## RuleId[id=RedundantExplicitClose]
### RedundantExplicitClose
Redundant 'close()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java
                if (!content.equals(oldContent)) {
                    getLog().info("File: " + file.getAbsolutePath() + " is updated");
                    fr.close();
                } else {
                    getLog().info("File " + file.getAbsolutePath() + " is not changed");
```

### RedundantExplicitClose
Redundant 'close()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
                if (!content.equals(oldContent)) {
                    getLog().info("File: " + file.getAbsolutePath() + " is updated");
                    fr.close();
                } else {
                    getLog().info("File " + file.getAbsolutePath() + " is not changed");
```

### RedundantExplicitClose
Redundant 'close()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
                if (!content.equals(oldContent)) {
                    getLog().debug("Writing new file " + file.getAbsolutePath());
                    fr.close();
                } else {
                    getLog().debug("File " + file.getAbsolutePath() + " has been left unchanged");
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `servlet` is redundant
in `components-starter/camel-servlet-starter/src/main/java/org/apache/camel/component/servlet/springboot/ServletMappingAutoConfiguration.java`
#### Snippet
```java
    @Bean
    CamelHttpTransportServlet camelHttpTransportServlet() {
        CamelHttpTransportServlet servlet = new CamelHttpTransportServlet();
        return servlet;
    }
```

### UnnecessaryLocalVariable
Local variable `ivGenerator` is redundant
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptEncryptedPropertiesUtils.java`
#### Snippet
```java
            return isIVNeeded(algorithm) ? new RandomIvGenerator() : new NoIvGenerator();
        }
        IvGenerator ivGenerator = loadClass(ivGeneratorClassName);
        return ivGenerator;
    }
```

### UnnecessaryLocalVariable
Local variable `answer` is redundant
in `components-starter/camel-platform-http-starter/src/main/java/org/apache/camel/component/platform/http/springboot/SpringBootPlatformHttpAutoConfiguration.java`
#### Snippet
```java
    public CamelRequestHandlerMapping platformHttpEngineRequestMapping(PlatformHttpEngine engine) {
        PlatformHttpComponent component = camelContext.getComponent("platform-http", PlatformHttpComponent.class);
        CamelRequestHandlerMapping answer = new CamelRequestHandlerMapping(component, engine);
        return answer;
    }
```

### UnnecessaryLocalVariable
Local variable `info` is redundant
in `components-starter/camel-platform-http-starter/src/main/java/org/apache/camel/component/platform/http/springboot/CamelRequestHandlerMapping.java`
#### Snippet
```java
        }

        RequestMappingInfo info = RequestMappingInfo
                .paths(model.getUri())
                .methods(methods.toArray(new RequestMethod[0]))
```

### UnnecessaryLocalVariable
Local variable `componentId` is redundant
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
    private String getComponentId() {
        String componentName = getMainDepArtifactId();
        String componentId = componentName.replace("camel-", "");
        return componentId;
    }
```

### UnnecessaryLocalVariable
Local variable `template` is redundant
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        cfg.setDefaultEncoding("UTF-8");
        Template template = cfg.getTemplate(name);
        return template;
    }
```

### UnnecessaryLocalVariable
Local variable `pom` is redundant
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document pom = builder.parse(bin);
        return pom;
    }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/TypeConversionConfiguration.java`
#### Snippet
```java
    @Bean
    SpringTypeConverter springTypeConverter(CamelContext camelContext, ConversionService[] conversionServices) {
        SpringTypeConverter springTypeConverter = new SpringTypeConverter(asList(conversionServices));
        camelContext.getTypeConverterRegistry().addFallbackTypeConverter(springTypeConverter, true);
        return springTypeConverter;
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `ProviderType.values()`, unclear if a varargs or non-varargs call is desired
in `components-starter/camel-undertow-spring-security-starter/src/main/java/org/apache/camel/undertow/spring/boot/UndertowSpringSecurityCustomizer.java`
#### Snippet
```java

            if (definedProviders.isEmpty()) {
                throw new IllegalArgumentException(String.format("Properties camel.component.undertow.spring.security.provider.* are not defined. Allowed providers are (%s)", ProviderType.values()));
            }
            if (definedProviders.size() > 1) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `hit` initializer `false` is redundant
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/util/CamelPropertiesHelper.java`
#### Snippet
```java
            Object value = entry.getValue();
            String stringValue = value != null ? value.toString() : null;
            boolean hit = false;
            try {
                hit = PropertyBindingSupport.build()
```

## RuleId[id=MethodNameSameAsClassName]
### MethodNameSameAsClassName
Method name `JasyptEncryptedPropertiesAutoconfiguration` is the same as its class name
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptEncryptedPropertiesAutoconfiguration.java`
#### Snippet
```java

    @Bean
    public JasyptEncryptedPropertiesConfiguration JasyptEncryptedPropertiesAutoconfiguration(final ConfigurableEnvironment environment) {
        JasyptEncryptedPropertiesConfiguration config = new JasyptEncryptedPropertiesConfiguration();
        final BindHandler handler = new IgnoreErrorsBindHandler(BindHandler.DEFAULT);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `saltGenerator != null` is always `true`
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptEncryptedPropertiesAutoconfiguration.java`
#### Snippet
```java
        String saltGeneratorClassName = configuration.getSaltGeneratorClassName();
        SaltGenerator saltGenerator = loadClass(saltGeneratorClassName);
        if (saltGenerator != null) {
            return saltGenerator;
        }
```

### ConstantValue
Condition `definedProviders.size() > 1` is always `false`
in `components-starter/camel-undertow-spring-security-starter/src/main/java/org/apache/camel/undertow/spring/boot/UndertowSpringSecurityCustomizer.java`
#### Snippet
```java
                throw new IllegalArgumentException(String.format("Properties camel.component.undertow.spring.security.provider.* are not defined. Allowed providers are (%s)", ProviderType.values()));
            }
            if (definedProviders.size() > 1) {
                throw new IllegalArgumentException(String.format("Two or more providers are defined (%s)", definedProviders));
            }
```

### ConstantValue
Condition `deps.size() > 0` is always `true`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
            Node dependencies = ((NodeList) xpath.compile("/project/dependencies").evaluate(pom, XPathConstants.NODESET)).item(0);

            if (deps.size() > 0) {
                dependencies.appendChild(pom.createComment(GENERATED_SECTION_START));
                for (String dep : deps) {
```

