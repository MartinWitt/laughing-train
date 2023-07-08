# camel-spring-boot-examples 
 
# Bad smells
I found 602 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBootApplicationProperties | 327 | false |
| SpringBootApplicationYaml | 192 | false |
| JavadocReference | 33 | false |
| SpringXmlModelInspection | 13 | false |
| FieldMayBeFinal | 6 | false |
| UnparsedCustomBeanInspection | 3 | false |
| DuplicatedCode | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| TrivialStringConcatenation | 3 | false |
| DuplicatedBeanNamesInspection | 3 | false |
| UNCHECKED_WARNING | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| CommentedOutCode | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| DataFlowIssue | 1 | false |
| SpringBeanConstructorArgInspection | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| Deprecation | 1 | false |
| DanglingJavadoc | 1 | false |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `twitter-salesforce/src/main/java/org/apache/camel/example/mention/TwitterSalesforceRoute.java`
#### Snippet
```java

                Object contactObject = contact.newInstance();
                Method setLastName = contact.getMethod("setLastName", String.class);
                Method setTwitterScreenName__c = contact.getMethod("setTwitterScreenName__c", String.class);
                setLastName.invoke(contactObject, name);
```

### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `twitter-salesforce/src/main/java/org/apache/camel/example/mention/TwitterSalesforceRoute.java`
#### Snippet
```java
                Object contactObject = contact.newInstance();
                Method setLastName = contact.getMethod("setLastName", String.class);
                Method setTwitterScreenName__c = contact.getMethod("setTwitterScreenName__c", String.class);
                setLastName.invoke(contactObject, name);
                setTwitterScreenName__c.invoke(contactObject, screenName);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ProducerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/participants/RoutingParticipant.java`
#### Snippet
```java

    /**
     * The {@link ProducerTemplate} to send subscriber messages to the dynamic
     * router control channel.
     */
```

### JavadocReference
Cannot resolve symbol `DynamicRouterControlMessage`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/participants/RoutingParticipant.java`
#### Snippet
```java

    /**
     * Create a {@link DynamicRouterControlMessage} based on parameters from the
     * implementing class.
     *
```

### JavadocReference
Cannot resolve symbol `DynamicRouterControlMessage`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/participants/RoutingParticipant.java`
#### Snippet
```java
     * implementing class.
     *
     * @return the {@link DynamicRouterControlMessage}
     */
    protected DynamicRouterControlMessage createSubscribeMessage() {
```

### JavadocReference
Cannot resolve symbol `Predicate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/participants/RoutingParticipant.java`
#### Snippet
```java

    /**
     * The implementation's rule as a {@link Predicate}.
     * @return the {@link Predicate} rule
     */
```

### JavadocReference
Cannot resolve symbol `Predicate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/participants/RoutingParticipant.java`
#### Snippet
```java
    /**
     * The implementation's rule as a {@link Predicate}.
     * @return the {@link Predicate} rule
     */
    protected Predicate getPredicate() {
```

### JavadocReference
Cannot resolve symbol `Predicate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/participants/RoutingParticipant.java`
#### Snippet
```java

    /**
     * The {@link Predicate} by which exchanges are evaluated for suitability for
     * a routing participant.
     */
```

### JavadocReference
Cannot resolve symbol `Predicate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/participants/PredicateConstants.java`
#### Snippet
```java

/**
 * Provides various {@link Predicate}s that routing participants can send to the
 * dynamic router as rules to determine exchange suitability.
 */
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * a multiple of 4.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * a multiple of 3.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `DynamicRouterConstants`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * {@link ExampleConfig#getExpectedFirstMatchMessageCount()}.
     *
     * @see DynamicRouterConstants#MODE_ALL_MATCH
     * @see DynamicRouterConstants#MODE_FIRST_MATCH
     * @see DynamicRouterConfiguration#getRecipientMode()
```

### JavadocReference
Cannot resolve symbol `MODE_ALL_MATCH`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * {@link ExampleConfig#getExpectedFirstMatchMessageCount()}.
     *
     * @see DynamicRouterConstants#MODE_ALL_MATCH
     * @see DynamicRouterConstants#MODE_FIRST_MATCH
     * @see DynamicRouterConfiguration#getRecipientMode()
```

### JavadocReference
Cannot resolve symbol `DynamicRouterConstants`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     *
     * @see DynamicRouterConstants#MODE_ALL_MATCH
     * @see DynamicRouterConstants#MODE_FIRST_MATCH
     * @see DynamicRouterConfiguration#getRecipientMode()
     * @see ExampleConfig#getRecipientMode()
```

### JavadocReference
Cannot resolve symbol `MODE_FIRST_MATCH`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     *
     * @see DynamicRouterConstants#MODE_ALL_MATCH
     * @see DynamicRouterConstants#MODE_FIRST_MATCH
     * @see DynamicRouterConfiguration#getRecipientMode()
     * @see ExampleConfig#getRecipientMode()
```

### JavadocReference
Cannot resolve symbol `DynamicRouterConfiguration`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * @see DynamicRouterConstants#MODE_ALL_MATCH
     * @see DynamicRouterConstants#MODE_FIRST_MATCH
     * @see DynamicRouterConfiguration#getRecipientMode()
     * @see ExampleConfig#getRecipientMode()
     * @see ExampleConfig#getExpectedAllMatchMessageCount()
```

### JavadocReference
Cannot resolve symbol `getRecipientMode()`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * @see DynamicRouterConstants#MODE_ALL_MATCH
     * @see DynamicRouterConstants#MODE_FIRST_MATCH
     * @see DynamicRouterConfiguration#getRecipientMode()
     * @see ExampleConfig#getRecipientMode()
     * @see ExampleConfig#getExpectedAllMatchMessageCount()
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * a multiple of 5.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * a multiple of 7.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * a prime.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * a multiple of 6.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * an odd number.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * a multiple of 9.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * an even number.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * a multiple of 8.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `ConsumerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/config/DynamicRouterComponentConfig.java`
#### Snippet
```java
     * a multiple of 10.
     *
     * @param subscriberTemplate the {@link ConsumerTemplate} for subscribing to messages that match
     * @param resultsService     the service that handles the results of message processing
     * @return the configured {@link RoutingParticipant}
```

### JavadocReference
Cannot resolve symbol `saySomething()`
in `endpointdsl/src/main/java/sample/camel/MyBean.java`
#### Snippet
```java

/**
 * A bean that returns a message when you call the {@link #saySomething()} method.
 * <p/>
 * Uses <tt>@Component("myBean")</tt> to register this bean with the name <tt>myBean</tt>
```

### JavadocReference
Cannot resolve symbol `RouteBuilder`
in `routetemplate/src/main/java/sample/camel/MyRouteTemplates.java`
#### Snippet
```java

/**
 * Route templates using {@link RouteBuilder} which allows
 * us to define a number of templates (parameterized routes)
 * which we can create routes from.
```

### JavadocReference
Cannot resolve symbol `ProducerTemplate`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/service/NumbersService.java`
#### Snippet
```java

    /**
     * The {@link ProducerTemplate} to start the messages on the route.
     */
    @Produce(property = "startUri")
```

### JavadocReference
Cannot resolve symbol `StopWatch`
in `dynamic-router-eip/src/main/java/org/apache/camel/example/springboot/numbers/service/ResultsService.java`
#### Snippet
```java
     * Get a message that contains the statistics of the messaging.
     *
     * @param watch a {@link StopWatch} that was started at the beginning of messaging
     * @return a message that contains the statistics of the messaging
     */
```

### JavadocReference
Cannot resolve symbol `saySomething()`
in `spring-boot/src/main/java/sample/camel/MyBean.java`
#### Snippet
```java

/**
 * A bean that returns a message when you call the {@link #saySomething()} method.
 * <p/>
 * Uses <tt>@Component("myBean")</tt> to register this bean with the name <tt>myBean</tt>
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.health.HealthCheck`
in `health-checks/src/main/java/sample/camel/MonkeyHealthCheck.java`
#### Snippet
```java
 * A chaos monkey health check that reports UP or DOWN in a chaotic way.
 *
 * This is a custom implementation of a Camel {@link org.apache.camel.health.HealthCheck}
 * which is automatic discovered if bound in the {@link org.apache.camel.spi.Registry} and
 * used as part of Camel's health-check system.
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.spi.Registry`
in `health-checks/src/main/java/sample/camel/MonkeyHealthCheck.java`
#### Snippet
```java
 *
 * This is a custom implementation of a Camel {@link org.apache.camel.health.HealthCheck}
 * which is automatic discovered if bound in the {@link org.apache.camel.spi.Registry} and
 * used as part of Camel's health-check system.
 */
```

### JavadocReference
Cannot resolve symbol `Consume`
in `pojo/src/main/java/sample/camel/NumberPojo.java`
#### Snippet
```java

/**
 * A POJO that listen to messages from the seda:numbers endpoint via {@link Consume}
 * and then via {@link MagicNumber} and {@link Produce} sends a message that will
 * be printed in the console.
```

### JavadocReference
Cannot resolve symbol `Produce`
in `pojo/src/main/java/sample/camel/NumberPojo.java`
#### Snippet
```java
/**
 * A POJO that listen to messages from the seda:numbers endpoint via {@link Consume}
 * and then via {@link MagicNumber} and {@link Produce} sends a message that will
 * be printed in the console.
 */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getDisplayName` may produce `NullPointerException`
in `jira/src/main/java/org/apache/camel/example/jira/NewCommentsRoute.java`
#### Snippet
```java
                .process(exchange -> {
                    Comment comment = (Comment) exchange.getIn().getBody();
                    LOG.info("new jira comment id: {} - by: {}: {}", comment.getId(), comment.getAuthor().getDisplayName(),
                            comment.getBody());
                })
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `observation/loggingtracer/src/main/java/sample/observation/logging/LoggingSpanHandler.java`
#### Snippet
```java
                + " parentId=" + span.parentId()
                + " operation=" + span.name()
                + " tags=" + span.tags().entrySet().stream().map(Object::toString).collect(Collectors.toList())
                + " logs=[" + span.annotations().stream().map(Map.Entry::getValue).collect(Collectors.toList())
                + "]");
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `observation/loggingtracer/src/main/java/sample/observation/logging/LoggingSpanHandler.java`
#### Snippet
```java
                + " operation=" + span.name()
                + " tags=" + span.tags().entrySet().stream().map(Object::toString).collect(Collectors.toList())
                + " logs=[" + span.annotations().stream().map(Map.Entry::getValue).collect(Collectors.toList())
                + "]");
        return true;
```

## RuleId[id=SpringBootApplicationProperties]
### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `pojo/src/main/resources/application.properties`
#### Snippet
```java

# give Camel a name
camel.springboot.name = PojoExample

# keep camel running
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `pojo/src/main/resources/application.properties`
#### Snippet
```java

# keep camel running
camel.springboot.main-run-controller = true

# automatic shutdown after 60 seconds
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.duration-max-seconds'
in `pojo/src/main/resources/application.properties`
#### Snippet
```java

# automatic shutdown after 60 seconds
camel.springboot.duration-max-seconds = 60

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `artemis/src/main/resources/application.properties`
#### Snippet
```java

#You can use this property to override the default autowired broker-url
camel.springboot.main-run-controller = true
#spring.artemis.mode=native
spring.artemis.mode=embedded
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.artemis.mode'
in `artemis/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller = true
#spring.artemis.mode=native
spring.artemis.mode=embedded
spring.artemis.host=localhost
spring.artemis.port=61616
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.artemis.host'
in `artemis/src/main/resources/application.properties`
#### Snippet
```java
#spring.artemis.mode=native
spring.artemis.mode=embedded
spring.artemis.host=localhost
spring.artemis.port=61616
spring.artemis.user=test
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.artemis.port'
in `artemis/src/main/resources/application.properties`
#### Snippet
```java
spring.artemis.mode=embedded
spring.artemis.host=localhost
spring.artemis.port=61616
spring.artemis.user=test
spring.artemis.password=test
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.artemis.user'
in `artemis/src/main/resources/application.properties`
#### Snippet
```java
spring.artemis.host=localhost
spring.artemis.port=61616
spring.artemis.user=test
spring.artemis.password=test
spring.artemis.embedded.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.artemis.password'
in `artemis/src/main/resources/application.properties`
#### Snippet
```java
spring.artemis.port=61616
spring.artemis.user=test
spring.artemis.password=test
spring.artemis.embedded.enabled=true
spring.artemis.embedded.queue=SCIENCEQUEUE
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.artemis.embedded.enabled'
in `artemis/src/main/resources/application.properties`
#### Snippet
```java
spring.artemis.user=test
spring.artemis.password=test
spring.artemis.embedded.enabled=true
spring.artemis.embedded.queue=SCIENCEQUEUE
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.artemis.embedded.queue'
in `artemis/src/main/resources/application.properties`
#### Snippet
```java
spring.artemis.password=test
spring.artemis.embedded.enabled=true
spring.artemis.embedded.queue=SCIENCEQUEUE
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jira.verification-code'
in `jira/src/main/resources/application.properties`
#### Snippet
```java
# follow the tutorial on https://developer.atlassian.com/cloud/jira/platform/jira-rest-api-oauth-authentication/
# to create the required fields
camel.component.jira.verification-code=test
camel.component.jira.consumer-key=test
camel.component.jira.access-token=test
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jira.consumer-key'
in `jira/src/main/resources/application.properties`
#### Snippet
```java
# to create the required fields
camel.component.jira.verification-code=test
camel.component.jira.consumer-key=test
camel.component.jira.access-token=test
camel.component.jira.private-key=test
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jira.access-token'
in `jira/src/main/resources/application.properties`
#### Snippet
```java
camel.component.jira.verification-code=test
camel.component.jira.consumer-key=test
camel.component.jira.access-token=test
camel.component.jira.private-key=test
camel.component.jira.jira-url=https\://test.com
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jira.private-key'
in `jira/src/main/resources/application.properties`
#### Snippet
```java
camel.component.jira.consumer-key=test
camel.component.jira.access-token=test
camel.component.jira.private-key=test
camel.component.jira.jira-url=https\://test.com

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.jira.jira-url'
in `jira/src/main/resources/application.properties`
#### Snippet
```java
camel.component.jira.access-token=test
camel.component.jira.private-key=test
camel.component.jira.jira-url=https\://test.com

# example specific properties
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'example.jira.project-key'
in `jira/src/main/resources/application.properties`
#### Snippet
```java

# example specific properties
example.jira.project-key=COM
example.jira.issue-type=Bug
example.jira.upload-directory=/tmp
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'example.jira.issue-type'
in `jira/src/main/resources/application.properties`
#### Snippet
```java
# example specific properties
example.jira.project-key=COM
example.jira.issue-type=Bug
example.jira.upload-directory=/tmp
example.jira.upload-file-name=my_file.png
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'example.jira.upload-directory'
in `jira/src/main/resources/application.properties`
#### Snippet
```java
example.jira.project-key=COM
example.jira.issue-type=Bug
example.jira.upload-directory=/tmp
example.jira.upload-file-name=my_file.png
example.jira.issue-attach=COM-79
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'example.jira.upload-file-name'
in `jira/src/main/resources/application.properties`
#### Snippet
```java
example.jira.issue-type=Bug
example.jira.upload-directory=/tmp
example.jira.upload-file-name=my_file.png
example.jira.issue-attach=COM-79

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'example.jira.issue-attach'
in `jira/src/main/resources/application.properties`
#### Snippet
```java
example.jira.upload-directory=/tmp
example.jira.upload-file-name=my_file.png
example.jira.issue-attach=COM-79

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.cluster.kubernetes.enabled'
in `master/src/main/resources/application-openshift.properties`
#### Snippet
```java


camel.cluster.kubernetes.enabled = true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `endpointdsl/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = MyCamel

# what to say
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'greeting'
in `endpointdsl/src/main/resources/application.properties`
#### Snippet
```java

# what to say
greeting = Hello World

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.cluster.file.enabled'
in `master/src/main/resources/application-file.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

camel.cluster.file.enabled = true
camel.cluster.file.id = ${node.id}
camel.cluster.file.root = ${java.io.tmpdir}
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.cluster.file.id'
in `master/src/main/resources/application-file.properties`
#### Snippet
```java

camel.cluster.file.enabled = true
camel.cluster.file.id = ${node.id}
camel.cluster.file.root = ${java.io.tmpdir}

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.cluster.file.root'
in `master/src/main/resources/application-file.properties`
#### Snippet
```java
camel.cluster.file.enabled = true
camel.cluster.file.id = ${node.id}
camel.cluster.file.root = ${java.io.tmpdir}

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.profiles.active'
in `master/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

spring.profiles.active = ${sbProfile}

debug = false
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'debug'
in `master/src/main/resources/application.properties`
#### Snippet
```java
spring.profiles.active = ${sbProfile}

debug = false

logging.level.org.springframework = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.springframework'
in `master/src/main/resources/application.properties`
#### Snippet
```java
debug = false

logging.level.org.springframework = INFO
logging.level.io.atomix = DEBUG
logging.level.org.apache.camel.cluster = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.io.atomix'
in `master/src/main/resources/application.properties`
#### Snippet
```java

logging.level.org.springframework = INFO
logging.level.io.atomix = DEBUG
logging.level.org.apache.camel.cluster = DEBUG
logging.level.org.apache.camel.impl.cluster = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.cluster'
in `master/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.springframework = INFO
logging.level.io.atomix = DEBUG
logging.level.org.apache.camel.cluster = DEBUG
logging.level.org.apache.camel.impl.cluster = DEBUG
logging.level.org.apache.camel.component.atomix = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.impl.cluster'
in `master/src/main/resources/application.properties`
#### Snippet
```java
logging.level.io.atomix = DEBUG
logging.level.org.apache.camel.cluster = DEBUG
logging.level.org.apache.camel.impl.cluster = DEBUG
logging.level.org.apache.camel.component.atomix = DEBUG
logging.level.org.apache.camel.component.master = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.component.atomix'
in `master/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.cluster = DEBUG
logging.level.org.apache.camel.impl.cluster = DEBUG
logging.level.org.apache.camel.component.atomix = DEBUG
logging.level.org.apache.camel.component.master = DEBUG
logging.level.org.apache.camel.examples.cluster = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.component.master'
in `master/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.impl.cluster = DEBUG
logging.level.org.apache.camel.component.atomix = DEBUG
logging.level.org.apache.camel.component.master = DEBUG
logging.level.org.apache.camel.examples.cluster = DEBUG

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.examples.cluster'
in `master/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.component.atomix = DEBUG
logging.level.org.apache.camel.component.master = DEBUG
logging.level.org.apache.camel.examples.cluster = DEBUG

management.endpoints.enabled-by-default = false
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.enabled-by-default'
in `master/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.examples.cluster = DEBUG

management.endpoints.enabled-by-default = false
management.endpoints.jmx.enabled = false
management.endpoint.health.enabled = true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.jmx.enabled'
in `master/src/main/resources/application.properties`
#### Snippet
```java

management.endpoints.enabled-by-default = false
management.endpoints.jmx.enabled = false
management.endpoint.health.enabled = true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.enabled'
in `master/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.enabled-by-default = false
management.endpoints.jmx.enabled = false
management.endpoint.health.enabled = true

management.server.port = -1
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.server.port'
in `master/src/main/resources/application.properties`
#### Snippet
```java
management.endpoint.health.enabled = true

management.server.port = -1

node.id = ${random.uuid}
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'node.namespace'
in `master/src/main/resources/application.properties`
#### Snippet
```java

node.id = ${random.uuid}
node.namespace = camel-master

camel.springboot.name = SampleClusteredRouteController
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `master/src/main/resources/application.properties`
#### Snippet
```java
node.namespace = camel-master

camel.springboot.name = SampleClusteredRouteController
camel.springboot.main-run-controller = true
camel.springboot.jmx-enabled = false
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `master/src/main/resources/application.properties`
#### Snippet
```java

camel.springboot.name = SampleClusteredRouteController
camel.springboot.main-run-controller = true
camel.springboot.jmx-enabled = false

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.jmx-enabled'
in `master/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.name = SampleClusteredRouteController
camel.springboot.main-run-controller = true
camel.springboot.jmx-enabled = false

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `rest-openapi/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = MyCamel

# to reconfigure the camel servlet context-path mapping to use /api/* instead of /camel/*
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.servlet.mapping.context-path'
in `rest-openapi/src/main/resources/application.properties`
#### Snippet
```java

# to reconfigure the camel servlet context-path mapping to use /api/* instead of /camel/*
camel.servlet.mapping.context-path=/api/*

# rest can also be configured here instead in the CamelRouter class
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.metrics.enable.all'
in `rest-openapi/src/main/resources/application.properties`
#### Snippet
```java

# enable metrics
management.metrics.enable.all=false
management.metrics.enable.jvm=false
management.metrics.enable.http=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.metrics.enable.jvm'
in `rest-openapi/src/main/resources/application.properties`
#### Snippet
```java
# enable metrics
management.metrics.enable.all=false
management.metrics.enable.jvm=false
management.metrics.enable.http=true
management.endpoints.web.exposure.include=mappings,metrics,shutdown,prometheus
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.metrics.enable.http'
in `rest-openapi/src/main/resources/application.properties`
#### Snippet
```java
management.metrics.enable.all=false
management.metrics.enable.jvm=false
management.metrics.enable.http=true
management.endpoints.web.exposure.include=mappings,metrics,shutdown,prometheus

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `rest-openapi/src/main/resources/application.properties`
#### Snippet
```java
management.metrics.enable.jvm=false
management.metrics.enable.http=true
management.endpoints.web.exposure.include=mappings,metrics,shutdown,prometheus

# camel metrics can be configured
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.metrics.uriTagEnabled'
in `rest-openapi/src/main/resources/application.properties`
#### Snippet
```java

# camel metrics can be configured
camel.metrics.uriTagEnabled = true
# the uri tag is by default static (/users/{id}), you can turn on dynamic that uses the actual value (users/1, users/2 etc)
# beware if you have a lot of dynamic uris then this can lead to too many tags issue in prometheus
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `opentelemetry/TripBooking/src/main/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.use-mdc-logging'
in `opentelemetry/TripBooking/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.micrometer.enabled'
in `opentelemetry/TripBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.metrics.metric-registry'
in `opentelemetry/TripBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.metrics.enable-message-history'
in `opentelemetry/TripBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.metrics.enabled'
in `opentelemetry/TripBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=TripBooking
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `opentelemetry/TripBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=TripBooking
server.port=8080
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.application.name'
in `opentelemetry/TripBooking/src/main/resources/application.properties`
#### Snippet
```java
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=TripBooking
server.port=8080
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `opentelemetry/TripBooking/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=*
spring.application.name=TripBooking
server.port=8080
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.artemis.mode'
in `widget-gadget/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

spring.artemis.mode=native
AMQP_REMOTE_URI=amqp://localhost:5672
AMQP_SERVICE_USERNAME=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'AMQP_REMOTE_URI'
in `widget-gadget/src/main/resources/application.properties`
#### Snippet
```java

spring.artemis.mode=native
AMQP_REMOTE_URI=amqp://localhost:5672
AMQP_SERVICE_USERNAME=admin
AMQP_SERVICE_PASSWORD=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'AMQP_SERVICE_USERNAME'
in `widget-gadget/src/main/resources/application.properties`
#### Snippet
```java
spring.artemis.mode=native
AMQP_REMOTE_URI=amqp://localhost:5672
AMQP_SERVICE_USERNAME=admin
AMQP_SERVICE_PASSWORD=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `quartz/src/main/resources/application.properties`
#### Snippet
```java

# give Camel a name
camel.springboot.name = Quartz-to-Log

# keep camel running
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `quartz/src/main/resources/application.properties`
#### Snippet
```java

# keep camel running
camel.springboot.main-run-controller = true

# automatic shutdown after 60 seconds
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.duration-max-seconds'
in `quartz/src/main/resources/application.properties`
#### Snippet
```java

# automatic shutdown after 60 seconds
camel.springboot.duration-max-seconds = 60

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'AMQP_SERVICE_PASSWORD'
in `widget-gadget/src/main/resources/application.properties`
#### Snippet
```java
AMQP_REMOTE_URI=amqp://localhost:5672
AMQP_SERVICE_USERNAME=admin
AMQP_SERVICE_PASSWORD=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `resilience4j/client/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

server.port=8080

# configure resilience4j
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.resilience4j.minimum-number-of-calls'
in `resilience4j/client/src/main/resources/application.properties`
#### Snippet
```java
# when we have more than 5 requests per 10 seconds that 50%+ fails
# then open circuit and call fallback immediately
camel.resilience4j.minimum-number-of-calls=5
camel.resilience4j.sliding-window-size=10
camel.resilience4j.sliding-window-type=TIME_BASED
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.resilience4j.sliding-window-size'
in `resilience4j/client/src/main/resources/application.properties`
#### Snippet
```java
# then open circuit and call fallback immediately
camel.resilience4j.minimum-number-of-calls=5
camel.resilience4j.sliding-window-size=10
camel.resilience4j.sliding-window-type=TIME_BASED
camel.resilience4j.failure-rate-threshold=50
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.resilience4j.sliding-window-type'
in `resilience4j/client/src/main/resources/application.properties`
#### Snippet
```java
camel.resilience4j.minimum-number-of-calls=5
camel.resilience4j.sliding-window-size=10
camel.resilience4j.sliding-window-type=TIME_BASED
camel.resilience4j.failure-rate-threshold=50
# stay in open for 20s before switching back to half-open
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.resilience4j.failure-rate-threshold'
in `resilience4j/client/src/main/resources/application.properties`
#### Snippet
```java
camel.resilience4j.sliding-window-size=10
camel.resilience4j.sliding-window-type=TIME_BASED
camel.resilience4j.failure-rate-threshold=50
# stay in open for 20s before switching back to half-open
camel.resilience4j.wait-duration-in-open-state=20
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.resilience4j.wait-duration-in-open-state'
in `resilience4j/client/src/main/resources/application.properties`
#### Snippet
```java
camel.resilience4j.failure-rate-threshold=50
# stay in open for 20s before switching back to half-open
camel.resilience4j.wait-duration-in-open-state=20

# resilience4j logging
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'serverUrl'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

serverUrl=http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3
serverUser=admin
serverPassword=Admin123
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'serverUser'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java

serverUrl=http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3
serverUser=admin
serverPassword=Admin123

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'serverPassword'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java
serverUrl=http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3
serverUser=admin
serverPassword=Admin123

fhirVersion=DSTU3
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'fhirVersion'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java
serverPassword=Admin123

fhirVersion=DSTU3

input=target/work/fhir/input
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'input'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java
fhirVersion=DSTU3

input=target/work/fhir/input

# the name of Camel
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = MyCamel

server.port=0
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.name = MyCamel

server.port=0

# to automatic shutdown the JVM after a period of time
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java

# expose actuator endpoint via HTTP
management.endpoints.web.exposure.include=info,health

# show verbose health details (/actuator/health) so you can see Camel information also
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.show-details'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java

# show verbose health details (/actuator/health) so you can see Camel information also
management.endpoint.health.show-details=always

# to turn off Camel info in (/actuator/info)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.info.camel.enabled'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java

# to turn off Camel info in (/actuator/info)
management.info.camel.enabled=true
management.info.camel.verbose=true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.info.camel.verbose'
in `fhir-auth-tx/src/main/resources/application.properties`
#### Snippet
```java
# to turn off Camel info in (/actuator/info)
management.info.camel.enabled=true
management.info.camel.verbose=true


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `amqp/src/main/resources/application.properties`
#### Snippet
```java
#You can use this property to override the default autowired broker-url

camel.springboot.main-run-controller = true
AMQP_REMOTE_URI=amqp://localhost:5672
AMQP_HOST=localhost
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'AMQP_REMOTE_URI'
in `amqp/src/main/resources/application.properties`
#### Snippet
```java

camel.springboot.main-run-controller = true
AMQP_REMOTE_URI=amqp://localhost:5672
AMQP_HOST=localhost
AMQP_SERVICE_PORT=5672
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'AMQP_HOST'
in `amqp/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller = true
AMQP_REMOTE_URI=amqp://localhost:5672
AMQP_HOST=localhost
AMQP_SERVICE_PORT=5672
AMQP_SERVICE_USERNAME=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'AMQP_SERVICE_PORT'
in `amqp/src/main/resources/application.properties`
#### Snippet
```java
AMQP_REMOTE_URI=amqp://localhost:5672
AMQP_HOST=localhost
AMQP_SERVICE_PORT=5672
AMQP_SERVICE_USERNAME=admin
AMQP_SERVICE_PASSWORD=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'AMQP_SERVICE_USERNAME'
in `amqp/src/main/resources/application.properties`
#### Snippet
```java
AMQP_HOST=localhost
AMQP_SERVICE_PORT=5672
AMQP_SERVICE_USERNAME=admin
AMQP_SERVICE_PASSWORD=admin

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'AMQP_SERVICE_PASSWORD'
in `amqp/src/main/resources/application.properties`
#### Snippet
```java
AMQP_SERVICE_PORT=5672
AMQP_SERVICE_USERNAME=admin
AMQP_SERVICE_PASSWORD=admin

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.vault.aws.accessKey'
in `aws-secrets-manager/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

camel.vault.aws.accessKey=<accessKey>
camel.vault.aws.secretKey=<secretKey>
camel.vault.aws.region=<region>
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.vault.aws.secretKey'
in `aws-secrets-manager/src/main/resources/application.properties`
#### Snippet
```java

camel.vault.aws.accessKey=<accessKey>
camel.vault.aws.secretKey=<secretKey>
camel.vault.aws.region=<region>
camel.springboot.main-run-controller=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.vault.aws.region'
in `aws-secrets-manager/src/main/resources/application.properties`
#### Snippet
```java
camel.vault.aws.accessKey=<accessKey>
camel.vault.aws.secretKey=<secretKey>
camel.vault.aws.region=<region>
camel.springboot.main-run-controller=true
logging.config=classpath:logback.xml
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `aws-secrets-manager/src/main/resources/application.properties`
#### Snippet
```java
camel.vault.aws.secretKey=<secretKey>
camel.vault.aws.region=<region>
camel.springboot.main-run-controller=true
logging.config=classpath:logback.xml
stock=AMZN
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.config'
in `aws-secrets-manager/src/main/resources/application.properties`
#### Snippet
```java
camel.vault.aws.region=<region>
camel.springboot.main-run-controller=true
logging.config=classpath:logback.xml
stock=AMZN

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'stock'
in `aws-secrets-manager/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller=true
logging.config=classpath:logback.xml
stock=AMZN


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `opentelemetry/HotelBooking/src/main/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.use-mdc-logging'
in `opentelemetry/HotelBooking/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.micrometer.enabled'
in `opentelemetry/HotelBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.metrics.metric-registry'
in `opentelemetry/HotelBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.metrics.enable-message-history'
in `opentelemetry/HotelBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.metrics.enabled'
in `opentelemetry/HotelBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=HotelBooking
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `opentelemetry/HotelBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=HotelBooking
server.port=8083
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.application.name'
in `opentelemetry/HotelBooking/src/main/resources/application.properties`
#### Snippet
```java
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=HotelBooking
server.port=8083
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `opentelemetry/HotelBooking/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=*
spring.application.name=HotelBooking
server.port=8083
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `xml/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = SampleCamel

# to automatic shutdown the JVM after a period of time
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'greeting'
in `xml/src/main/resources/application.properties`
#### Snippet
```java

# what to say
greeting = Hello World

# how often to trigger the timer
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'timer.period'
in `xml/src/main/resources/application.properties`
#### Snippet
```java

# how often to trigger the timer
timer.period = 2000

# expose actuator endpoint via HTTP
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `xml/src/main/resources/application.properties`
#### Snippet
```java

# expose actuator endpoint via HTTP
management.endpoints.web.exposure.include=camelroutes
# turn on actuator health check
management.endpoint.health.enabled = true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.enabled'
in `xml/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=camelroutes
# turn on actuator health check
management.endpoint.health.enabled = true

# to configure logging levels
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `rabbitmq/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = RabbitCamel

# to automatic shutdown the JVM after a period of time
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.host'
in `rabbitmq/src/main/resources/application.properties`
#### Snippet
```java

# configure connection to the rabbit mq broker using spring rabbitmq style
spring.rabbitmq.host = 127.0.0.1
spring.rabbitmq.port = 5672
spring.rabbitmq.username = guest
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.port'
in `rabbitmq/src/main/resources/application.properties`
#### Snippet
```java
# configure connection to the rabbit mq broker using spring rabbitmq style
spring.rabbitmq.host = 127.0.0.1
spring.rabbitmq.port = 5672
spring.rabbitmq.username = guest
spring.rabbitmq.password = guest
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.username'
in `rabbitmq/src/main/resources/application.properties`
#### Snippet
```java
spring.rabbitmq.host = 127.0.0.1
spring.rabbitmq.port = 5672
spring.rabbitmq.username = guest
spring.rabbitmq.password = guest

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.password'
in `rabbitmq/src/main/resources/application.properties`
#### Snippet
```java
spring.rabbitmq.port = 5672
spring.rabbitmq.username = guest
spring.rabbitmq.password = guest

# turn on auto declare so the exchange, queues are automatic created if not already present in rabbitmq broker
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.spring-rabbitmq.auto-declare'
in `rabbitmq/src/main/resources/application.properties`
#### Snippet
```java

# turn on auto declare so the exchange, queues are automatic created if not already present in rabbitmq broker
camel.component.spring-rabbitmq.auto-declare = true

# to configure logging levels
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `arangodb/src/main/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
camel.springboot.name=ArangoDB
camel.springboot.main-run-controller=true
camel.component.arangodb.documentCollection=foo
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `arangodb/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------
camel.springboot.name=ArangoDB
camel.springboot.main-run-controller=true
camel.component.arangodb.documentCollection=foo
camel.component.arangodb.user=root
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.arangodb.documentCollection'
in `arangodb/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.name=ArangoDB
camel.springboot.main-run-controller=true
camel.component.arangodb.documentCollection=foo
camel.component.arangodb.user=root
camel.component.arangodb.password=openSesame
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.arangodb.user'
in `arangodb/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller=true
camel.component.arangodb.documentCollection=foo
camel.component.arangodb.user=root
camel.component.arangodb.password=openSesame

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.arangodb.password'
in `arangodb/src/main/resources/application.properties`
#### Snippet
```java
camel.component.arangodb.documentCollection=foo
camel.component.arangodb.user=root
camel.component.arangodb.password=openSesame


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `route-reload/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = ReloadCamel

# turn on route reloading on file changes
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.routes-reload-enabled'
in `route-reload/src/main/resources/application.properties`
#### Snippet
```java

# turn on route reloading on file changes
camel.springboot.routes-reload-enabled = true
# the base directory to watch
camel.springboot.routes-reload-directory = src/main/resources/camel
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.routes-reload-directory'
in `route-reload/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.routes-reload-enabled = true
# the base directory to watch
camel.springboot.routes-reload-directory = src/main/resources/camel
# pattern(s) for files to watch
camel.springboot.routes-reload-pattern = *.xml
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.routes-reload-pattern'
in `route-reload/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.routes-reload-directory = src/main/resources/camel
# pattern(s) for files to watch
camel.springboot.routes-reload-pattern = *.xml


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `type-converter/src/main/resources/application.properties`
#### Snippet
```java
# the name of Camel
camel.springboot.name = CamelCustomConverterExample

# required for generated Type Converter Loader - Camel 3.x way
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.load-type-converters'
in `type-converter/src/main/resources/application.properties`
#### Snippet
```java

# required for generated Type Converter Loader - Camel 3.x way
camel.springboot.load-type-converters=true

# to configure logging levels
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.springframework'
in `type-converter/src/main/resources/application.properties`
#### Snippet
```java

# to configure logging levels
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.spring.boot'
in `type-converter/src/main/resources/application.properties`
#### Snippet
```java
# to configure logging levels
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.impl'
in `type-converter/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
logging.level.sample.camel = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel'
in `type-converter/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
logging.level.sample.camel = INFO
#logging.level.sample.camel = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.sample.camel'
in `type-converter/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
logging.level.sample.camel = INFO
#logging.level.sample.camel = DEBUG

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `observation/service2/src/main/resources/application.properties`
#### Snippet
```java
# the name of Camel
camel.springboot.name=Service2
camel.springboot.main-run-controller=true

spring.application.name=${camel.springboot.name}
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.tracing.sampling.probability'
in `observation/service2/src/main/resources/application.properties`
#### Snippet
```java

spring.application.name=${camel.springboot.name}
management.tracing.sampling.probability=1.0
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=7654
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `observation/service2/src/main/resources/application.properties`
#### Snippet
```java
spring.application.name=${camel.springboot.name}
management.tracing.sampling.probability=1.0
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=7654
logging.pattern.level=%5p [${spring.application.name:},%X{traceId:-},%X{spanId:-}]
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `observation/service2/src/main/resources/application.properties`
#### Snippet
```java
management.tracing.sampling.probability=1.0
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=7654
logging.pattern.level=%5p [${spring.application.name:},%X{traceId:-},%X{spanId:-}]

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.pattern.level'
in `observation/service2/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=7654
logging.pattern.level=%5p [${spring.application.name:},%X{traceId:-},%X{spanId:-}]


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `infinispan/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

camel.springboot.name=Infinispan
camel.springboot.main-run-controller=true
infinispan.host=localhost
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `infinispan/src/main/resources/application.properties`
#### Snippet
```java

camel.springboot.name=Infinispan
camel.springboot.main-run-controller=true
infinispan.host=localhost
infinispan.port=11222
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'infinispan.host'
in `infinispan/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.name=Infinispan
camel.springboot.main-run-controller=true
infinispan.host=localhost
infinispan.port=11222
infinispan.username=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'infinispan.port'
in `infinispan/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller=true
infinispan.host=localhost
infinispan.port=11222
infinispan.username=admin
infinispan.password=password
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'infinispan.username'
in `infinispan/src/main/resources/application.properties`
#### Snippet
```java
infinispan.host=localhost
infinispan.port=11222
infinispan.username=admin
infinispan.password=password
infinispan.server-name=infinispan
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'infinispan.password'
in `infinispan/src/main/resources/application.properties`
#### Snippet
```java
infinispan.port=11222
infinispan.username=admin
infinispan.password=password
infinispan.server-name=infinispan

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'infinispan.server-name'
in `infinispan/src/main/resources/application.properties`
#### Snippet
```java
infinispan.username=admin
infinispan.password=password
infinispan.server-name=infinispan


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `observation/service1/src/main/resources/application.properties`
#### Snippet
```java
# the name of Camel
camel.springboot.name=Service1
camel.springboot.main-run-controller=true

spring.application.name=${camel.springboot.name}
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.tracing.sampling.probability'
in `observation/service1/src/main/resources/application.properties`
#### Snippet
```java

spring.application.name=${camel.springboot.name}
management.tracing.sampling.probability=1.0
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=6543
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `observation/service1/src/main/resources/application.properties`
#### Snippet
```java
spring.application.name=${camel.springboot.name}
management.tracing.sampling.probability=1.0
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=6543
logging.pattern.level=%5p [${spring.application.name:},%X{traceId:-},%X{spanId:-}]
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `observation/service1/src/main/resources/application.properties`
#### Snippet
```java
management.tracing.sampling.probability=1.0
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=6543
logging.pattern.level=%5p [${spring.application.name:},%X{traceId:-},%X{spanId:-}]

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.pattern.level'
in `observation/service1/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=6543
logging.pattern.level=%5p [${spring.application.name:},%X{traceId:-},%X{spanId:-}]

# the port number the service will use for accepting incoming HTTP requests
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'service1.port'
in `observation/service1/src/main/resources/application.properties`
#### Snippet
```java

# the port number the service will use for accepting incoming HTTP requests
service1.port=6060
service2.port=7070

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'service2.port'
in `observation/service1/src/main/resources/application.properties`
#### Snippet
```java
# the port number the service will use for accepting incoming HTTP requests
service1.port=6060
service2.port=7070


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `opentelemetry/CarBooking/src/main/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.use-mdc-logging'
in `opentelemetry/CarBooking/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.micrometer.enabled'
in `opentelemetry/CarBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.metrics.metric-registry'
in `opentelemetry/CarBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.metrics.enable-message-history'
in `opentelemetry/CarBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.metrics.enabled'
in `opentelemetry/CarBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=CarBooking
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `opentelemetry/CarBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=CarBooking
server.port=8081
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.application.name'
in `opentelemetry/CarBooking/src/main/resources/application.properties`
#### Snippet
```java
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=CarBooking
server.port=8081
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `opentelemetry/CarBooking/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=*
spring.application.name=CarBooking
server.port=8081
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'debug'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

debug = false

logging.level.org.springframework = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.springframework'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java
debug = false

logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.spring.boot'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java

logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.health'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
logging.level.sample.camel = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.impl.health'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
logging.level.sample.camel = DEBUG

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.sample.camel'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
logging.level.sample.camel = DEBUG

# enable the shutdown endpoint
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.shutdown.enabled'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java

# enable the shutdown endpoint
management.endpoint.shutdown.enabled=true

# expose actuator endpoint via HTTP
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java

# expose actuator endpoint via HTTP
management.endpoints.web.exposure.include=mappings,metrics,shutdown

camel.springboot.name = MyCamel
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=mappings,metrics,shutdown

camel.springboot.name = MyCamel

# properties used in the route
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'metricsPeriod'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java

# properties used in the route
metricsPeriod = 2s
shutdownTime = 10s

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shutdownTime'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java
# properties used in the route
metricsPeriod = 2s
shutdownTime = 10s

# enable supervised route controller which will startup routes in safe manner
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.route-controller-supervise-enabled'
in `actuator-http-metrics/src/main/resources/application.properties`
#### Snippet
```java

# enable supervised route controller which will startup routes in safe manner
camel.springboot.route-controller-supervise-enabled = true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'timer.period'
in `xml-import/src/main/resources/application.properties`
#### Snippet
```java

# how often to trigger the timer
timer.period = 2000

# expose actuator endpoint via HTTP
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `xml-import/src/main/resources/application.properties`
#### Snippet
```java

# expose actuator endpoint via HTTP
management.endpoints.web.exposure.include=camelroutes
# turn on actuator health check
management.endpoint.health.enabled = true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.enabled'
in `xml-import/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=camelroutes
# turn on actuator health check
management.endpoint.health.enabled = true

# to configure logging levels
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'environment'
in `strimzi/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

environment=kubernetes

camel.component.kafka.brokers=my-cluster-kafka-bootstrap:9093
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.brokers'
in `strimzi/src/main/resources/application.properties`
#### Snippet
```java
environment=kubernetes

camel.component.kafka.brokers=my-cluster-kafka-bootstrap:9093
camel.component.kafka.ssl-truststore-location=/deployments/config/truststore.jks
camel.component.kafka.ssl-truststore-password=123456
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.ssl-truststore-location'
in `strimzi/src/main/resources/application.properties`
#### Snippet
```java

camel.component.kafka.brokers=my-cluster-kafka-bootstrap:9093
camel.component.kafka.ssl-truststore-location=/deployments/config/truststore.jks
camel.component.kafka.ssl-truststore-password=123456
camel.component.kafka.security-protocol=SSL
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.ssl-truststore-password'
in `strimzi/src/main/resources/application.properties`
#### Snippet
```java
camel.component.kafka.brokers=my-cluster-kafka-bootstrap:9093
camel.component.kafka.ssl-truststore-location=/deployments/config/truststore.jks
camel.component.kafka.ssl-truststore-password=123456
camel.component.kafka.security-protocol=SSL
camel.component.kafka.ssl-endpoint-algorithm=HTTPS
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.security-protocol'
in `strimzi/src/main/resources/application.properties`
#### Snippet
```java
camel.component.kafka.ssl-truststore-location=/deployments/config/truststore.jks
camel.component.kafka.ssl-truststore-password=123456
camel.component.kafka.security-protocol=SSL
camel.component.kafka.ssl-endpoint-algorithm=HTTPS

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.ssl-endpoint-algorithm'
in `strimzi/src/main/resources/application.properties`
#### Snippet
```java
camel.component.kafka.ssl-truststore-password=123456
camel.component.kafka.security-protocol=SSL
camel.component.kafka.ssl-endpoint-algorithm=HTTPS

kafka.producer.topic=TestLog
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'kafka.producer.topic'
in `strimzi/src/main/resources/application.properties`
#### Snippet
```java
camel.component.kafka.ssl-endpoint-algorithm=HTTPS

kafka.producer.topic=TestLog
kafka.consumer.topic=TestLog
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'kafka.consumer.topic'
in `strimzi/src/main/resources/application.properties`
#### Snippet
```java

kafka.producer.topic=TestLog
kafka.consumer.topic=TestLog
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'environment'
in `strimzi/src/main/resources/application-local.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

environment=local

camel.component.kafka.brokers=KAFKA_BOOTSTRAP_ROUTE_URL
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.brokers'
in `strimzi/src/main/resources/application-local.properties`
#### Snippet
```java
environment=local

camel.component.kafka.brokers=KAFKA_BOOTSTRAP_ROUTE_URL
camel.component.kafka.ssl-truststore-location=truststore.jks
camel.component.kafka.ssl-truststore-password=123456
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.ssl-truststore-location'
in `strimzi/src/main/resources/application-local.properties`
#### Snippet
```java

camel.component.kafka.brokers=KAFKA_BOOTSTRAP_ROUTE_URL
camel.component.kafka.ssl-truststore-location=truststore.jks
camel.component.kafka.ssl-truststore-password=123456
camel.component.kafka.security-protocol=SSL
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.ssl-truststore-password'
in `strimzi/src/main/resources/application-local.properties`
#### Snippet
```java
camel.component.kafka.brokers=KAFKA_BOOTSTRAP_ROUTE_URL
camel.component.kafka.ssl-truststore-location=truststore.jks
camel.component.kafka.ssl-truststore-password=123456
camel.component.kafka.security-protocol=SSL
camel.component.kafka.ssl-endpoint-algorithm=HTTPS
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.security-protocol'
in `strimzi/src/main/resources/application-local.properties`
#### Snippet
```java
camel.component.kafka.ssl-truststore-location=truststore.jks
camel.component.kafka.ssl-truststore-password=123456
camel.component.kafka.security-protocol=SSL
camel.component.kafka.ssl-endpoint-algorithm=HTTPS

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.kafka.ssl-endpoint-algorithm'
in `strimzi/src/main/resources/application-local.properties`
#### Snippet
```java
camel.component.kafka.ssl-truststore-password=123456
camel.component.kafka.security-protocol=SSL
camel.component.kafka.ssl-endpoint-algorithm=HTTPS

kafka.producer.topic=TestLog
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'kafka.producer.topic'
in `strimzi/src/main/resources/application-local.properties`
#### Snippet
```java
camel.component.kafka.ssl-endpoint-algorithm=HTTPS

kafka.producer.topic=TestLog
kafka.consumer.topic=TestLog

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'kafka.consumer.topic'
in `strimzi/src/main/resources/application-local.properties`
#### Snippet
```java

kafka.producer.topic=TestLog
kafka.consumer.topic=TestLog

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `resilience4j/service1/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name=Service1
camel.springboot.main-run-controller=true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `resilience4j/service1/src/main/resources/application.properties`
#### Snippet
```java
# the name of Camel
camel.springboot.name=Service1
camel.springboot.main-run-controller=true

# the port number the service will use for accepting incoming HTTP requests
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'service1.port'
in `resilience4j/service1/src/main/resources/application.properties`
#### Snippet
```java

# the port number the service will use for accepting incoming HTTP requests
service1.port=9090
service2.port=7070

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'service2.port'
in `resilience4j/service1/src/main/resources/application.properties`
#### Snippet
```java
# the port number the service will use for accepting incoming HTTP requests
service1.port=9090
service2.port=7070


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `load-balancer-eip/src/main/resources/application.properties`
#### Snippet
```java
# the name of Camel
camel.springboot.name = CamelLoadBalancerExample

# to configure logging levels
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.springframework'
in `load-balancer-eip/src/main/resources/application.properties`
#### Snippet
```java

# to configure logging levels
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.spring.boot'
in `load-balancer-eip/src/main/resources/application.properties`
#### Snippet
```java
# to configure logging levels
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.impl'
in `load-balancer-eip/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
logging.level.sample.camel = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel'
in `load-balancer-eip/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
logging.level.sample.camel = INFO
#logging.level.sample.camel = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.sample.camel'
in `load-balancer-eip/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
logging.level.sample.camel = INFO
#logging.level.sample.camel = DEBUG

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `validator/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = SampleCamel

# properties used in the Camel route and beans
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `platform-http/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = MyCamel

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'timer.period'
in `validator/src/main/resources/application.properties`
#### Snippet
```java

# how often to trigger the timer
timer.period = 2000

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'producer.topic'
in `kafka-offsetrepository/src/main/resources/application.properties`
#### Snippet
```java

# Producer properties
producer.topic=my-topic


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `splitter-eip/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = CamelSpringBootSplitter

# required for generated Type Converter Loader - Camel 3.x way
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'consumer.topic'
in `kafka-offsetrepository/src/main/resources/application.properties`
#### Snippet
```java

# Consumer properties 
consumer.topic=my-topic
consumer.group=kafkaGroup
consumer.maxPollRecords=5000
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'consumer.group'
in `kafka-offsetrepository/src/main/resources/application.properties`
#### Snippet
```java
# Consumer properties 
consumer.topic=my-topic
consumer.group=kafkaGroup
consumer.maxPollRecords=5000

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.load-type-converters'
in `splitter-eip/src/main/resources/application.properties`
#### Snippet
```java

# required for generated Type Converter Loader - Camel 3.x way
camel.springboot.load-type-converters=true

# to configure logging levels
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'consumer.maxPollRecords'
in `kafka-offsetrepository/src/main/resources/application.properties`
#### Snippet
```java
consumer.topic=my-topic
consumer.group=kafkaGroup
consumer.maxPollRecords=5000

partitionValue=0
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.springframework'
in `splitter-eip/src/main/resources/application.properties`
#### Snippet
```java

# to configure logging levels
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'partitionValue'
in `kafka-offsetrepository/src/main/resources/application.properties`
#### Snippet
```java
consumer.maxPollRecords=5000

partitionValue=0
period=1000

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'period'
in `kafka-offsetrepository/src/main/resources/application.properties`
#### Snippet
```java

partitionValue=0
period=1000

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.spring.boot'
in `splitter-eip/src/main/resources/application.properties`
#### Snippet
```java
# to configure logging levels
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.impl'
in `splitter-eip/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
logging.level.sample.camel = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel'
in `splitter-eip/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
logging.level.sample.camel = INFO
#logging.level.sample.camel = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.sample.camel'
in `splitter-eip/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel = INFO
logging.level.sample.camel = INFO
#logging.level.sample.camel = DEBUG

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'info.build.name'
in `metrics/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

info.build.name=Example of sending camel metrics to Graphite
camel.springboot.name=camel-example-spring-boot-metrics

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `metrics/src/main/resources/application.properties`
#### Snippet
```java

info.build.name=Example of sending camel metrics to Graphite
camel.springboot.name=camel-example-spring-boot-metrics

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `opentelemetry/FlightBooking/src/main/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.use-mdc-logging'
in `opentelemetry/FlightBooking/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'serverUrl'
in `fhir/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

serverUrl=http://localhost:8081/hapi-fhir-jpaserver/fhir

fhirVersion=DSTU3
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'fhirVersion'
in `fhir/src/main/resources/application.properties`
#### Snippet
```java
serverUrl=http://localhost:8081/hapi-fhir-jpaserver/fhir

fhirVersion=DSTU3

input=target/work/fhir/input
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'input'
in `fhir/src/main/resources/application.properties`
#### Snippet
```java
fhirVersion=DSTU3

input=target/work/fhir/input

# the name of Camel
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `fhir/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = MyCamel

# to automatic shutdown the JVM after a period of time
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.micrometer.enabled'
in `opentelemetry/FlightBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller=true
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `fhir/src/main/resources/application.properties`
#### Snippet
```java

# expose actuator endpoint via HTTP
management.endpoints.web.exposure.include=info,health

# show verbose health details (/actuator/health) so you can see Camel information also
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.metrics.metric-registry'
in `opentelemetry/FlightBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.use-mdc-logging = true
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.show-details'
in `fhir/src/main/resources/application.properties`
#### Snippet
```java

# show verbose health details (/actuator/health) so you can see Camel information also
management.endpoint.health.show-details=always

# to turn off Camel info in (/actuator/info)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.metrics.enable-message-history'
in `opentelemetry/FlightBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.component.micrometer.enabled=true
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.info.camel.enabled'
in `fhir/src/main/resources/application.properties`
#### Snippet
```java

# to turn off Camel info in (/actuator/info)
management.info.camel.enabled=false

# to configure logging levels
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.metrics.enabled'
in `opentelemetry/FlightBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.component.metrics.metric-registry=prometheusMeterRegistry
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=FlightBooking
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `opentelemetry/FlightBooking/src/main/resources/application.properties`
#### Snippet
```java
camel.metrics.enable-message-history=true
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=FlightBooking
server.port=8082
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.application.name'
in `opentelemetry/FlightBooking/src/main/resources/application.properties`
#### Snippet
```java
management.endpoint.metrics.enabled=true
management.endpoints.web.exposure.include=*
spring.application.name=FlightBooking
server.port=8082
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `opentelemetry/FlightBooking/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=*
spring.application.name=FlightBooking
server.port=8082
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.aws2-s3.accessKey'
in `aws2-s3/src/main/resources/application.properties`
#### Snippet
```java
## limitations under the License.
## ---------------------------------------------------------------------------
camel.component.aws2-s3.accessKey=xxxx
camel.component.aws2-s3.secretKey=yyyy
camel.component.aws2-s3.region=region
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.aws2-s3.secretKey'
in `aws2-s3/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------
camel.component.aws2-s3.accessKey=xxxx
camel.component.aws2-s3.secretKey=yyyy
camel.component.aws2-s3.region=region
camel.springboot.main-run-controller=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.aws2-s3.region'
in `aws2-s3/src/main/resources/application.properties`
#### Snippet
```java
camel.component.aws2-s3.accessKey=xxxx
camel.component.aws2-s3.secretKey=yyyy
camel.component.aws2-s3.region=region
camel.springboot.main-run-controller=true
logging.config=classpath:logback.xml
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `aws2-s3/src/main/resources/application.properties`
#### Snippet
```java
camel.component.aws2-s3.secretKey=yyyy
camel.component.aws2-s3.region=region
camel.springboot.main-run-controller=true
logging.config=classpath:logback.xml
bucketName=camel-kafka-connector
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.config'
in `aws2-s3/src/main/resources/application.properties`
#### Snippet
```java
camel.component.aws2-s3.region=region
camel.springboot.main-run-controller=true
logging.config=classpath:logback.xml
bucketName=camel-kafka-connector

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'bucketName'
in `aws2-s3/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller=true
logging.config=classpath:logback.xml
bucketName=camel-kafka-connector


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `spring-boot/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = MyCamel

# what to say
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'greeting'
in `spring-boot/src/main/resources/application.properties`
#### Snippet
```java

# what to say
greeting = Hello World

# how often to trigger the timer (millis)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'myPeriod'
in `spring-boot/src/main/resources/application.properties`
#### Snippet
```java

# how often to trigger the timer (millis)
myPeriod = 2000

# expose actuator endpoint via HTTP
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.show-details'
in `spring-boot/src/main/resources/application.properties`
#### Snippet
```java

# show verbose health details (/actuator/health) so you can see Camel information also
management.endpoint.health.show-details=always

# to turn off Camel info in (/actuator/info)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'debug'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

debug = false

logging.level.org.springframework = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.springframework'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
debug = false

logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.spring.boot'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java

logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel.impl.engine.DefaultSupervisingRouteController = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.impl'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel.impl.engine.DefaultSupervisingRouteController = DEBUG
logging.level.org.apache.camel.util.backoff = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.impl.engine.DefaultSupervisingRouteController'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel.impl.engine.DefaultSupervisingRouteController = DEBUG
logging.level.org.apache.camel.util.backoff = DEBUG
logging.level.sample.camel = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.util.backoff'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.impl = INFO
logging.level.org.apache.camel.impl.engine.DefaultSupervisingRouteController = DEBUG
logging.level.org.apache.camel.util.backoff = DEBUG
logging.level.sample.camel = DEBUG

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.sample.camel'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.impl.engine.DefaultSupervisingRouteController = DEBUG
logging.level.org.apache.camel.util.backoff = DEBUG
logging.level.sample.camel = DEBUG

# expose actuator endpoint via HTTP
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java

# expose actuator endpoint via HTTP
management.endpoints.web.exposure.include=info,health
management.endpoint.health.enabled = true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.enabled'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
# expose actuator endpoint via HTTP
management.endpoints.web.exposure.include=info,health
management.endpoint.health.enabled = true

# show verbose health details (/actuator/health) so you can see Camel information also
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.show-details'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java

# show verbose health details (/actuator/health) so you can see Camel information also
management.endpoint.health.show-details=always

# to turn off Camel info in (/actuator/info)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.info.camel.enabled'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java

# to turn off Camel info in (/actuator/info)
management.info.camel.enabled=true
management.info.camel.verbose=true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.info.camel.verbose'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
# to turn off Camel info in (/actuator/info)
management.info.camel.enabled=true
management.info.camel.verbose=true

# the name of Camel
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = SampleSupervisingRouteController

# route controller configuration
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.routeControllerSuperviseEnabled'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java

# route controller configuration
camel.springboot.routeControllerSuperviseEnabled = true
camel.springboot.routeControllerInitialDelay = 5000
camel.springboot.routeControllerBackoffDelay = 5000
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.routeControllerInitialDelay'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
# route controller configuration
camel.springboot.routeControllerSuperviseEnabled = true
camel.springboot.routeControllerInitialDelay = 5000
camel.springboot.routeControllerBackoffDelay = 5000
camel.springboot.routeControllerBackoffMaxAttempts = 10
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.routeControllerBackoffDelay'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.routeControllerSuperviseEnabled = true
camel.springboot.routeControllerInitialDelay = 5000
camel.springboot.routeControllerBackoffDelay = 5000
camel.springboot.routeControllerBackoffMaxAttempts = 10

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.routeControllerBackoffMaxAttempts'
in `supervising-route-controller/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.routeControllerInitialDelay = 5000
camel.springboot.routeControllerBackoffDelay = 5000
camel.springboot.routeControllerBackoffMaxAttempts = 10

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'debug'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

debug = false

logging.level.org.springframework = INFO
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.springframework'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
debug = false

logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.spring.boot'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java

logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.health'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
logging.level.sample.camel = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.eclipse.paho.mqttv5.client.internal'
in `paho-mqtt5-shared-subscriptions/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

logging.level.org.eclipse.paho.mqttv5.client.internal=WARN

broker.url=tcp://broker.emqx.io:1883
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.impl.health'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
logging.level.sample.camel = DEBUG

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.sample.camel'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
logging.level.sample.camel = DEBUG

# expose actuator endpoint via HTTP
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'broker.url'
in `paho-mqtt5-shared-subscriptions/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.eclipse.paho.mqttv5.client.internal=WARN

broker.url=tcp://broker.emqx.io:1883

consumer.topic=$share/gr1/topic
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java

# expose actuator endpoint via HTTP
management.endpoints.web.exposure.include=health
# expose liveness/readiness probes
management.health.probes.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'consumer.topic'
in `paho-mqtt5-shared-subscriptions/src/main/resources/application.properties`
#### Snippet
```java
broker.url=tcp://broker.emqx.io:1883

consumer.topic=$share/gr1/topic

producer.topic=topic
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.health.probes.enabled'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=health
# expose liveness/readiness probes
management.health.probes.enabled=true
management.health.livenessState.enabled=true
management.health.readinessState.enabled=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'producer.topic'
in `paho-mqtt5-shared-subscriptions/src/main/resources/application.properties`
#### Snippet
```java
consumer.topic=$share/gr1/topic

producer.topic=topic

producer.period=1000
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.health.livenessState.enabled'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
# expose liveness/readiness probes
management.health.probes.enabled=true
management.health.livenessState.enabled=true
management.health.readinessState.enabled=true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'producer.period'
in `paho-mqtt5-shared-subscriptions/src/main/resources/application.properties`
#### Snippet
```java
producer.topic=topic

producer.period=1000

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.health.readinessState.enabled'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
management.health.probes.enabled=true
management.health.livenessState.enabled=true
management.health.readinessState.enabled=true

# show verbose health details (/actuator/health) so you can see Camel information also
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.show-details'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java

# show verbose health details (/actuator/health) so you can see Camel information also
management.endpoint.health.show-details=always

camel.springboot.name = MyCamel
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
management.endpoint.health.show-details=always

camel.springboot.name = MyCamel

# enable JMX which allows to also control health check
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.jmx-enabled'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java

# enable JMX which allows to also control health check
camel.springboot.jmx-enabled = true

# properties used in the route
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'myPeriod'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java

# properties used in the route
myPeriod = 10s

# enable supervised route controller which will startup routes in safe manner
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.route-controller-supervise-enabled'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java

# enable supervised route controller which will startup routes in safe manner
camel.springboot.route-controller-supervise-enabled = true

# attempt up till 10 times to start a route (and exhaust if still failing)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.route-controller-back-off-max-attempts'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
# when a route is exhausted then its taken out as being supervised and
# will not take part of health-check either (UNKNOWN state)
camel.springboot.route-controller-back-off-max-attempts = 10
# when starting a route (and restarts) fails all attempts
# then we can control whether the route should be influence the health-check
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.health.enabled'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java
# enable health check (is automatic enabled if discovered on classpath)
# global flag to enable/disable
camel.health.enabled = true

# level of details exposed by camel-health check (full, default, or oneline)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.health.exposure-level'
in `health-checks/src/main/resources/application.properties`
#### Snippet
```java

# level of details exposed by camel-health check (full, default, or oneline)
camel.health.exposure-level = default

# find grained routes configuration per route (support wildcards)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `twitter-salesforce/src/main/resources/application.properties`
#### Snippet
```java

## name of CamelContext
camel.springboot.name=mention

## This uses the Twitter 'cameltweet' account for testing purposes.
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.twitter-timeline.consumer-key'
in `twitter-salesforce/src/main/resources/application.properties`
#### Snippet
```java
## do NOT use this twitter account in your applications!

camel.component.twitter-timeline.consumer-key=NMqaca1bzXsOcZhP2XlwA
camel.component.twitter-timeline.consumer-secret=VxNQiRLwwKVD0K9mmfxlTTbVdgRpriORypnUbHhxeQw
camel.component.twitter-timeline.access-token=26693234-W0YjxL9cMJrC0VZZ4xdgFMymxIQ10LeL1K8YlbBY
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.twitter-timeline.consumer-secret'
in `twitter-salesforce/src/main/resources/application.properties`
#### Snippet
```java

camel.component.twitter-timeline.consumer-key=NMqaca1bzXsOcZhP2XlwA
camel.component.twitter-timeline.consumer-secret=VxNQiRLwwKVD0K9mmfxlTTbVdgRpriORypnUbHhxeQw
camel.component.twitter-timeline.access-token=26693234-W0YjxL9cMJrC0VZZ4xdgFMymxIQ10LeL1K8YlbBY
camel.component.twitter-timeline.access-token-secret=BZD51BgzbOdFstWZYsqB5p5dbuuDV12vrOdatzhY4E
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.twitter-timeline.access-token'
in `twitter-salesforce/src/main/resources/application.properties`
#### Snippet
```java
camel.component.twitter-timeline.consumer-key=NMqaca1bzXsOcZhP2XlwA
camel.component.twitter-timeline.consumer-secret=VxNQiRLwwKVD0K9mmfxlTTbVdgRpriORypnUbHhxeQw
camel.component.twitter-timeline.access-token=26693234-W0YjxL9cMJrC0VZZ4xdgFMymxIQ10LeL1K8YlbBY
camel.component.twitter-timeline.access-token-secret=BZD51BgzbOdFstWZYsqB5p5dbuuDV12vrOdatzhY4E

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.twitter-timeline.access-token-secret'
in `twitter-salesforce/src/main/resources/application.properties`
#### Snippet
```java
camel.component.twitter-timeline.consumer-secret=VxNQiRLwwKVD0K9mmfxlTTbVdgRpriORypnUbHhxeQw
camel.component.twitter-timeline.access-token=26693234-W0YjxL9cMJrC0VZZ4xdgFMymxIQ10LeL1K8YlbBY
camel.component.twitter-timeline.access-token-secret=BZD51BgzbOdFstWZYsqB5p5dbuuDV12vrOdatzhY4E

## This uses Camel test Salesforce developer account please use your own account in your applications
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.salesforce.clientId'
in `twitter-salesforce/src/main/resources/application.properties`
#### Snippet
```java

## Consumer Key of the connected application
camel.component.salesforce.clientId=3MVG9szVa2RxsqBZXHfqsW3hf9HQp_N6qdSmpjKMzSJaEL4UP161JlDkE32EigL82ra_jM1WuQgF4rYDgzL3u
## Consumer Secret of the connected application
camel.component.salesforce.clientSecret=1039611643161946846
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.salesforce.clientSecret'
in `twitter-salesforce/src/main/resources/application.properties`
#### Snippet
```java
camel.component.salesforce.clientId=3MVG9szVa2RxsqBZXHfqsW3hf9HQp_N6qdSmpjKMzSJaEL4UP161JlDkE32EigL82ra_jM1WuQgF4rYDgzL3u
## Consumer Secret of the connected application
camel.component.salesforce.clientSecret=1039611643161946846
## refresh_token from OAuth flow
#camel.component.salesforce.refreshToken=5Aep861HDR3iASSXIX6hI7M1qMWSCs1Ym57WUH1ftjE7RvnM7MvnAXx9EZaw_HIoNCKktNsuhx.xwjLThofuJH4
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `observation/client/src/main/resources/application.properties`
#### Snippet
```java
# the name of Camel
camel.springboot.name=Client
camel.springboot.main-run-controller=true

spring.application.name=${camel.springboot.name}
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.tracing.sampling.probability'
in `observation/client/src/main/resources/application.properties`
#### Snippet
```java

spring.application.name=${camel.springboot.name}
management.tracing.sampling.probability=1.0
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=5432
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `observation/client/src/main/resources/application.properties`
#### Snippet
```java
spring.application.name=${camel.springboot.name}
management.tracing.sampling.probability=1.0
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=5432
logging.pattern.level=%5p [${spring.application.name:},%X{traceId:-},%X{spanId:-}]
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `observation/client/src/main/resources/application.properties`
#### Snippet
```java
management.tracing.sampling.probability=1.0
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=5432
logging.pattern.level=%5p [${spring.application.name:},%X{traceId:-},%X{spanId:-}]

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.pattern.level'
in `observation/client/src/main/resources/application.properties`
#### Snippet
```java
management.endpoints.web.exposure.include=health,metrics,prometheus
server.port=5432
logging.pattern.level=%5p [${spring.application.name:},%X{traceId:-},%X{spanId:-}]

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `mail-ms-exchange-oauth2/src/main/resources/application.properties`
#### Snippet
```java
#

camel.springboot.name: CamelMailExchangeOAuth2

# Keep the application running
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `mail-ms-exchange-oauth2/src/main/resources/application.properties`
#### Snippet
```java

# Keep the application running
camel.springboot.main-run-controller: true


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'exchange.tenantId'
in `mail-ms-exchange-oauth2/src/main/resources/application.properties`
#### Snippet
```java

# Azure Active Directory tenant ID
exchange.tenantId=<FILL-ME>

# Azure Active Directory client credentials
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'exchange.clientId'
in `mail-ms-exchange-oauth2/src/main/resources/application.properties`
#### Snippet
```java

# Azure Active Directory client credentials
exchange.clientId=<FILL-ME>

# Azure Active Directory client secret
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'exchange.clientSecret'
in `mail-ms-exchange-oauth2/src/main/resources/application.properties`
#### Snippet
```java

# Azure Active Directory client secret
exchange.clientSecret=<FILL-ME>

# Microsoft Exchange Username. Must be an email.
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'exchange.user'
in `mail-ms-exchange-oauth2/src/main/resources/application.properties`
#### Snippet
```java

# Microsoft Exchange Username. Must be an email.
exchange.user=<FILL-ME>

# Milliseconds between two poll.
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'exchange.pollInterval'
in `mail-ms-exchange-oauth2/src/main/resources/application.properties`
#### Snippet
```java

# Milliseconds between two poll.
exchange.pollInterval=60000

# Enable javax.mail verbose output
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'exchange.debug'
in `mail-ms-exchange-oauth2/src/main/resources/application.properties`
#### Snippet
```java

# Enable javax.mail verbose output
exchange.debug=false

# Delete message after consuming it
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'exchange.delete'
in `mail-ms-exchange-oauth2/src/main/resources/application.properties`
#### Snippet
```java

# Delete message after consuming it
exchange.delete=false

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'kafka.bootstrap.url'
in `kafka-avro/src/main/resources/application.properties`
#### Snippet
```java
## Modify value of kafka.host and kafka.port before running application

kafka.bootstrap.url=localhost:9092,localhost:9093,localhost:9094

# Producer properties
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'producer.topic'
in `kafka-avro/src/main/resources/application.properties`
#### Snippet
```java

# Producer properties
producer.topic=employees-avro


```

### SpringBootApplicationProperties
Cannot resolve configuration property 'consumer.topic'
in `kafka-avro/src/main/resources/application.properties`
#### Snippet
```java

# Consumer properties 
consumer.topic=employees-avro
consumer.group=kafkaGroup
consumer.maxPollRecords=5000
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'consumer.group'
in `kafka-avro/src/main/resources/application.properties`
#### Snippet
```java
# Consumer properties 
consumer.topic=employees-avro
consumer.group=kafkaGroup
consumer.maxPollRecords=5000

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'consumer.maxPollRecords'
in `kafka-avro/src/main/resources/application.properties`
#### Snippet
```java
consumer.topic=employees-avro
consumer.group=kafkaGroup
consumer.maxPollRecords=5000

partitionValue=0
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'partitionValue'
in `kafka-avro/src/main/resources/application.properties`
#### Snippet
```java
consumer.maxPollRecords=5000

partitionValue=0
period=1000

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'period'
in `kafka-avro/src/main/resources/application.properties`
#### Snippet
```java

partitionValue=0
period=1000

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.springframework'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java
## ---------------------------------------------------------------------------

logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.spring.boot'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java

logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.health'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.springframework = INFO
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
logging.level.sample.camel = DEBUG
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.org.apache.camel.impl.health'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.spring.boot = INFO
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
logging.level.sample.camel = DEBUG

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'logging.level.sample.camel'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java
logging.level.org.apache.camel.health = DEBUG
logging.level.org.apache.camel.impl.health = DEBUG
logging.level.sample.camel = DEBUG

camel.springboot.name = MyCamelNative
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java
logging.level.sample.camel = DEBUG

camel.springboot.name = MyCamelNative

camel.springboot.main-run-controller: true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.name = MyCamelNative

camel.springboot.main-run-controller: true

camel.springboot.routes-include-pattern: file:${user.dir}/routes/*.yaml,file:${user.dir}/routes/*.xml
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.routes-include-pattern'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java
camel.springboot.main-run-controller: true

camel.springboot.routes-include-pattern: file:${user.dir}/routes/*.yaml,file:${user.dir}/routes/*.xml

# what to say
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'greeting'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java

# what to say
greeting: Hello World

# how often to trigger the timer (millis)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'myPeriod'
in `aot-basic/src/main/resources/application.properties`
#### Snippet
```java

# how often to trigger the timer (millis)
myPeriod: 2000
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.telegram.authorization-token'
in `webhook/src/main/resources/application.properties`
#### Snippet
```java

# Put here the authorization token for the telegram bot
camel.component.telegram.authorization-token=<put-your-token-here>

# Put here the external URL as returned by the tunnel provider (e.g. loca.lt or Ngrok)
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.component.webhook.webhook-external-url'
in `webhook/src/main/resources/application.properties`
#### Snippet
```java

# Put here the external URL as returned by the tunnel provider (e.g. loca.lt or Ngrok)
camel.component.webhook.webhook-external-url=https://xx-replace-me.loca.lt

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.springboot.name'
in `rest-openapi-springdoc/src/main/resources/application.properties`
#### Snippet
```java

# the name of Camel
camel.springboot.name = MyCamel

# to reconfigure the camel servlet context-path mapping to use /api/* instead of /camel/*
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'camel.servlet.mapping.context-path'
in `rest-openapi-springdoc/src/main/resources/application.properties`
#### Snippet
```java

# to reconfigure the camel servlet context-path mapping to use /api/* instead of /camel/*
camel.servlet.mapping.context-path=/api/*

# rest can also be configured here instead in the CamelRouter class
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `amqp/src/main/java/sample/camel/SampleAutowiredAmqpRoute.java`
#### Snippet
```java
            .to("amqp:queue:SCIENCEQUEUE");

        /*from("timer:bar")
            .setBody(constant("Hello from Camel"))
            .to("amqp:queue:SCIENCEQUEUE");*/
```

### CommentedOutCode
Commented out code (6 lines)
in `kafka-avro/src/main/java/org/apache/camel/example/kafka/avro/KafkaAvroMessageProcessor.java`
#### Snippet
```java
    public void process(Exchange exc) throws Exception {
        //un-comment this after build
       /* Employee emp = Employee.newBuilder()
        .setFirstName("kakarla")
        .setLastName("Ranjith")
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `flights` may be 'final'
in `opentelemetry/FlightBooking/src/main/java/com/example/demo/AvailableFlights.java`
#### Snippet
```java

public class AvailableFlights {
    private List<String> flights =  Arrays.asList(
        "American Airlines",
        "Delta Air Lines",
```

### FieldMayBeFinal
Field `topic` may be 'final'
in `paho-mqtt5-shared-subscriptions/src/main/java/org/apache/camel/example/spring/boot/paho/mqtt5/Application.java`
#### Snippet
```java
public class Application {

    private String topic = "$share/numbers/topic";

    public static void main(String[] args) {
```

### FieldMayBeFinal
Field `hotels` may be 'final'
in `opentelemetry/HotelBooking/src/main/java/com/example/demo/AvailableHotels.java`
#### Snippet
```java

public class AvailableHotels {
    private List<String> hotels =  Arrays.asList(
            "Four Seasons",
            "Sheraton",
```

### FieldMayBeFinal
Field `todos` may be 'final'
in `platform-http/src/main/java/org/apache/camel/example/springboot/TodoServiceImpl.java`
#### Snippet
```java
public class TodoServiceImpl implements TodoService {

	private Map<Long, Todo> todos = new ConcurrentHashMap<>();
	private AtomicLong counter = new AtomicLong(1);

```

### FieldMayBeFinal
Field `counter` may be 'final'
in `platform-http/src/main/java/org/apache/camel/example/springboot/TodoServiceImpl.java`
#### Snippet
```java

	private Map<Long, Todo> todos = new ConcurrentHashMap<>();
	private AtomicLong counter = new AtomicLong(1);

	@Override
```

### FieldMayBeFinal
Field `cars` may be 'final'
in `opentelemetry/CarBooking/src/main/java/com/example/demo/AvailableCars.java`
#### Snippet
```java

public class AvailableCars {
    private List<String> cars =  Arrays.asList(
            "Toyota Corolla",
            "Honda Civic",
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'component'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java

    <!-- START SNIPPET: e2 -->
    <bean class="org.apache.camel.component.kafka.KafkaComponent" id="kafka">
        <property name="configuration">
            <bean class="org.apache.camel.component.kafka.KafkaConfiguration">
```

### SpringXmlModelInspection
Cannot resolve class or package 'kafka'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java

    <!-- START SNIPPET: e2 -->
    <bean class="org.apache.camel.component.kafka.KafkaComponent" id="kafka">
        <property name="configuration">
            <bean class="org.apache.camel.component.kafka.KafkaConfiguration">
```

### SpringXmlModelInspection
Cannot resolve class 'KafkaComponent'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java

    <!-- START SNIPPET: e2 -->
    <bean class="org.apache.camel.component.kafka.KafkaComponent" id="kafka">
        <property name="configuration">
            <bean class="org.apache.camel.component.kafka.KafkaConfiguration">
```

### SpringXmlModelInspection
Cannot resolve property 'configuration'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
    <!-- START SNIPPET: e2 -->
    <bean class="org.apache.camel.component.kafka.KafkaComponent" id="kafka">
        <property name="configuration">
            <bean class="org.apache.camel.component.kafka.KafkaConfiguration">
                <property name="brokers" value="${kafka.bootstrap.url}"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'component'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
    <bean class="org.apache.camel.component.kafka.KafkaComponent" id="kafka">
        <property name="configuration">
            <bean class="org.apache.camel.component.kafka.KafkaConfiguration">
                <property name="brokers" value="${kafka.bootstrap.url}"/>
            </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'kafka'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
    <bean class="org.apache.camel.component.kafka.KafkaComponent" id="kafka">
        <property name="configuration">
            <bean class="org.apache.camel.component.kafka.KafkaConfiguration">
                <property name="brokers" value="${kafka.bootstrap.url}"/>
            </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'KafkaConfiguration'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
    <bean class="org.apache.camel.component.kafka.KafkaComponent" id="kafka">
        <property name="configuration">
            <bean class="org.apache.camel.component.kafka.KafkaConfiguration">
                <property name="brokers" value="${kafka.bootstrap.url}"/>
            </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'brokers'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
        <property name="configuration">
            <bean class="org.apache.camel.component.kafka.KafkaConfiguration">
                <property name="brokers" value="${kafka.bootstrap.url}"/>
            </bean>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
        <constructor-arg type="java.lang.String" value="${fileOffsetrepoPath}"/>
    </bean>
    <bean class="org.apache.camel.impl.engine.FileStateRepository"
          factory-method="fileStateRepository" id="offsetRepo" init-method="doStart">
        <constructor-arg ref="filerepo"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'engine'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
        <constructor-arg type="java.lang.String" value="${fileOffsetrepoPath}"/>
    </bean>
    <bean class="org.apache.camel.impl.engine.FileStateRepository"
          factory-method="fileStateRepository" id="offsetRepo" init-method="doStart">
        <constructor-arg ref="filerepo"/>
```

### SpringXmlModelInspection
Cannot resolve class 'FileStateRepository'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
        <constructor-arg type="java.lang.String" value="${fileOffsetrepoPath}"/>
    </bean>
    <bean class="org.apache.camel.impl.engine.FileStateRepository"
          factory-method="fileStateRepository" id="offsetRepo" init-method="doStart">
        <constructor-arg ref="filerepo"/>
```

### SpringXmlModelInspection
Cannot resolve method 'fileStateRepository'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
    </bean>
    <bean class="org.apache.camel.impl.engine.FileStateRepository"
          factory-method="fileStateRepository" id="offsetRepo" init-method="doStart">
        <constructor-arg ref="filerepo"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve method 'doStart'
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
    </bean>
    <bean class="org.apache.camel.impl.engine.FileStateRepository"
          factory-method="fileStateRepository" id="offsetRepo" init-method="doStart">
        <constructor-arg ref="filerepo"/>
    </bean>
```

## RuleId[id=UnparsedCustomBeanInspection]
### UnparsedCustomBeanInspection
Unsupported tag 'camelContext' for namespace '', please file issue (Help\|Submit a Bug Report...)
in `xml-import/src/main/resources/my-camel.xml`
#### Snippet
```java

  <!-- embed Camel with routes -->
  <camelContext id="SampleCamel" xmlns="http://camel.apache.org/schema/spring">

    <route id="hello">
```

### UnparsedCustomBeanInspection
Unsupported tag 'camelContext' for namespace '', please file issue (Help\|Submit a Bug Report...)
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java

    <!-- START SNIPPET: e3 -->
    <camelContext id="camel" xmlns="http://camel.apache.org/schema/spring">
        <route id="consumer-route1">
            <from id="kafka-consumer-1"
```

### UnparsedCustomBeanInspection
Unsupported tag 'camelContext' for namespace '', please file issue (Help\|Submit a Bug Report...)
in `kafka-avro/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
    <!-- END SNIPPET: e2 -->
    <!-- START SNIPPET: e3 -->
    <camelContext id="camel" xmlns="http://camel.apache.org/schema/spring">
        <propertyPlaceholder id="placeholder"
			location="classpath:application.properties" />
```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching factory method found in class
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
    </bean>
    <bean class="org.apache.camel.impl.engine.FileStateRepository"
          factory-method="fileStateRepository" id="offsetRepo" init-method="doStart">
        <constructor-arg ref="filerepo"/>
    </bean>
```

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `routetemplate-xml/src/main/resources/application.yaml`
#### Snippet
```java
camel:
  springboot:
    name: MyCamel
    routes-include-pattern: classpath:templates/*.xml,classpath:builders/*.xml

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.routes-include-pattern'
in `routetemplate-xml/src/main/resources/application.yaml`
#### Snippet
```java
  springboot:
    name: MyCamel
    routes-include-pattern: classpath:templates/*.xml,classpath:builders/*.xml

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'examples.basic.camel-to-reactor'
in `reactive-streams/src/main/resources/application.yml`
#### Snippet
```java
examples:
  basic:
    camel-to-reactor: true
    reactor-to-camel: true
    camel-to-reactor-in-out: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'examples.basic.reactor-to-camel'
in `reactive-streams/src/main/resources/application.yml`
#### Snippet
```java
  basic:
    camel-to-reactor: true
    reactor-to-camel: true
    camel-to-reactor-in-out: true
    reactor-to-camel-in-out: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'examples.basic.camel-to-reactor-in-out'
in `reactive-streams/src/main/resources/application.yml`
#### Snippet
```java
    camel-to-reactor: true
    reactor-to-camel: true
    camel-to-reactor-in-out: true
    reactor-to-camel-in-out: true
  client-api:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'examples.basic.reactor-to-camel-in-out'
in `reactive-streams/src/main/resources/application.yml`
#### Snippet
```java
    reactor-to-camel: true
    camel-to-reactor-in-out: true
    reactor-to-camel-in-out: true
  client-api:
    rest: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'examples.client-api.rest'
in `reactive-streams/src/main/resources/application.yml`
#### Snippet
```java
    reactor-to-camel-in-out: true
  client-api:
    rest: true
    workflow: true
  others:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'examples.client-api.workflow'
in `reactive-streams/src/main/resources/application.yml`
#### Snippet
```java
  client-api:
    rest: true
    workflow: true
  others:
    rest: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'examples.others.rest'
in `reactive-streams/src/main/resources/application.yml`
#### Snippet
```java
    workflow: true
  others:
    rest: true


```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.mode'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
spring:
  artemis:
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.broker-url'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
  artemis:
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.user'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
    pool.enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.password'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
    pool.enabled: true
camel:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.pool.enabled'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    user: admin
    password: admin
    pool.enabled: true
camel:
  servlet:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.servlet.mapping.enabled'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
  servlet:
    mapping:
      enabled: true
      context-path: /api/*
  component:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.servlet.mapping.context-path'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    mapping:
      enabled: true
      context-path: /api/*
  component:
    jms:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.jms.test-connection-on-startup'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
  component:
    jms:
      test-connection-on-startup: true
      concurrent-consumers: 5
  lra:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.jms.concurrent-consumers'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    jms:
      test-connection-on-startup: true
      concurrent-consumers: 5
  lra:
    enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.enabled'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
      concurrent-consumers: 5
  lra:
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.coordinator-url'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
  lra:
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
  service:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.local-participant-url'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
  service:
    lra.enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.service.lra.enabled'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    local-participant-url: http://localhost:${server.port}/api
  service:
    lra.enabled: true
  springboot:
    main-run-controller: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    lra.enabled: true
  springboot:
    main-run-controller: true
    name: Camel-saga
example.services:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
  springboot:
    main-run-controller: true
    name: Camel-saga
example.services:
  train: saga-train-service
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'example.services.train'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    name: Camel-saga
example.services:
  train: saga-train-service
  flight: saga-flight-service
logging:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'example.services.flight'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
example.services:
  train: saga-train-service
  flight: saga-flight-service
logging:
  level:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
logging:
  level:
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
  level:
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.processor.errorhandler.DefaultErrorHandler'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.component.jms.EndpointMessageListener'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.component.jms.reply.QueueReplyManager'
in `saga/saga-app/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF


```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.azure-eventhubs.blob-account-name'
in `azure/camel-example-spring-boot-azure-eventhubs/src/main/resources/application.yml`
#### Snippet
```java
        # connectionstring for eventhubs instance, with ;EntityPath=<eventhub-name> in the end
      connection-string: [EVENT_HUBS_CONNECTION_STRING];EntityPath=[EVENT_HUB_NAME]
      blob-account-name: [STORAGE_ACCOUNT_NAME]
      blob-access-key: [STORAGE_ACCOUNT_ACCESS_KEY]
      blob-container-name: [STORAGE_CONTAINER_NAME]
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.azure-eventhubs.blob-access-key'
in `azure/camel-example-spring-boot-azure-eventhubs/src/main/resources/application.yml`
#### Snippet
```java
      connection-string: [EVENT_HUBS_CONNECTION_STRING];EntityPath=[EVENT_HUB_NAME]
      blob-account-name: [STORAGE_ACCOUNT_NAME]
      blob-access-key: [STORAGE_ACCOUNT_ACCESS_KEY]
      blob-container-name: [STORAGE_CONTAINER_NAME]

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.azure-eventhubs.blob-container-name'
in `azure/camel-example-spring-boot-azure-eventhubs/src/main/resources/application.yml`
#### Snippet
```java
      blob-account-name: [STORAGE_ACCOUNT_NAME]
      blob-access-key: [STORAGE_ACCOUNT_ACCESS_KEY]
      blob-container-name: [STORAGE_CONTAINER_NAME]

namespaceName: [EVENT_HUBS_NAMESPACE]
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'namespaceName'
in `azure/camel-example-spring-boot-azure-eventhubs/src/main/resources/application.yml`
#### Snippet
```java
      blob-container-name: [STORAGE_CONTAINER_NAME]

namespaceName: [EVENT_HUBS_NAMESPACE]
eventhubsName: [EVENT_HUB_NAME]

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'eventhubsName'
in `azure/camel-example-spring-boot-azure-eventhubs/src/main/resources/application.yml`
#### Snippet
```java

namespaceName: [EVENT_HUBS_NAMESPACE]
eventhubsName: [EVENT_HUB_NAME]

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `routes-configuration/src/main/resources/application.yaml`
#### Snippet
```java
camel:
  springboot:
    name: MyCamel

    # keep Camel running
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `routes-configuration/src/main/resources/application.yaml`
#### Snippet
```java

    # keep Camel running
    main-run-controller: true

    # verbose summary so you can see the pairing of routes and routes configurations
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.startup-summary-level'
in `routes-configuration/src/main/resources/application.yaml`
#### Snippet
```java

    # verbose summary so you can see the pairing of routes and routes configurations
    startup-summary-level: verbose

    # dump routes as XML (routes are coded in different DSLs but can be dumped as XML)
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.dump-routes'
in `routes-configuration/src/main/resources/application.yaml`
#### Snippet
```java

    # dump routes as XML (routes are coded in different DSLs but can be dumped as XML)
    dump-routes: true

    # which directory(s) to scan for routes/route-configurations which can be xml, yaml or java files
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.routes-include-pattern'
in `routes-configuration/src/main/resources/application.yaml`
#### Snippet
```java

    # which directory(s) to scan for routes/route-configurations which can be xml, yaml or java files
    routes-include-pattern: classpath:myroutes/*,classpath:myerror/*,classpath:myinterceptor/*

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.profiles.active'
in `routetemplate/src/main/resources/application.yaml`
#### Snippet
```java
spring:
  profiles:
    active: xml

camel:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `routetemplate/src/main/resources/application.yaml`
#### Snippet
```java
camel:
  springboot:
    name: MyCamel

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.routes-include-pattern'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
camel:
  springboot:
    routes-include-pattern: classpath:mycamel/*.xml
  route-template:
    config:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.route-template.config.-0.template-id'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
  route-template:
    config:
      -0.template-id: myXmlTemplate
      -0.route-id: first
      -0.name: one
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.route-template.config.-0.route-id'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
    config:
      -0.template-id: myXmlTemplate
      -0.route-id: first
      -0.name: one
      -0.greeting: Hello
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.route-template.config.-0.name'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
      -0.template-id: myXmlTemplate
      -0.route-id: first
      -0.name: one
      -0.greeting: Hello
      -1.template-id: myXmlTemplate
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.route-template.config.-0.greeting'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
      -0.route-id: first
      -0.name: one
      -0.greeting: Hello
      -1.template-id: myXmlTemplate
      -1.route-id: second
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.route-template.config.-1.template-id'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
      -0.name: one
      -0.greeting: Hello
      -1.template-id: myXmlTemplate
      -1.route-id: second
      -1.name: deux
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.route-template.config.-1.route-id'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
      -0.greeting: Hello
      -1.template-id: myXmlTemplate
      -1.route-id: second
      -1.name: deux
      -1.greeting: Bonjour
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.route-template.config.-1.name'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
      -1.template-id: myXmlTemplate
      -1.route-id: second
      -1.name: deux
      -1.greeting: Bonjour
      -1.my-period: 5s
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.route-template.config.-1.greeting'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
      -1.route-id: second
      -1.name: deux
      -1.greeting: Bonjour
      -1.my-period: 5s

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.route-template.config.-1.my-period'
in `routetemplate/src/main/resources/application-xml.yaml`
#### Snippet
```java
      -1.name: deux
      -1.greeting: Bonjour
      -1.my-period: 5s

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.mode'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
spring:
  artemis:
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.broker-url'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
  artemis:
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.user'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
    pool.enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.password'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
    pool.enabled: true
camel:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.pool.enabled'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    user: admin
    password: admin
    pool.enabled: true
camel:
  servlet:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.servlet.mapping.enabled'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
  servlet:
    mapping:
      enabled: true
      context-path: /api/*
  component:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.servlet.mapping.context-path'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    mapping:
      enabled: true
      context-path: /api/*
  component:
    jms:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.jms.test-connection-on-startup'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
  component:
    jms:
      test-connection-on-startup: true
      concurrent-consumers: 5
  lra:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.jms.concurrent-consumers'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    jms:
      test-connection-on-startup: true
      concurrent-consumers: 5
  lra:
    enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.enabled'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
      concurrent-consumers: 5
  lra:
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.coordinator-url'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
  lra:
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
  service:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.local-participant-url'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
  service:
    lra.enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.service.lra.enabled'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    local-participant-url: http://localhost:${server.port}/api
  service:
    lra.enabled: true
  springboot:
    main-run-controller: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    lra.enabled: true
  springboot:
    main-run-controller: true
    name: Camel-train
example.services:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
  springboot:
    main-run-controller: true
    name: Camel-train
example.services:
  train: saga-train-service
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'example.services.train'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    name: Camel-train
example.services:
  train: saga-train-service
  payment: saga-payment-service
logging:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'example.services.payment'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
example.services:
  train: saga-train-service
  payment: saga-payment-service
logging:
  level:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
logging:
  level:
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
  level:
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.processor.errorhandler.DefaultErrorHandler'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.component.jms.EndpointMessageListener'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.component.jms.reply.QueueReplyManager'
in `saga/saga-train-service/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF


```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
camel:
  springboot:
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.jmx-enabled'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
  springboot:
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
  spring-boot:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.shutdown-timeout'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
  spring-boot:
    example:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.routing-channel'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
    example:
      dynamic-router-eip:
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.subscribe-uri'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
      dynamic-router-eip:
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.receiver-scheme'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: firstMatch
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.start-uri'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: firstMatch
        send-message-count: 1000000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.recipient-mode'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: firstMatch
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.send-message-count'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
        start-uri: direct:start
        recipient-mode: firstMatch
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
        expected-all-match-message-count: 2507465
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.expected-first-match-message-count'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
        recipient-mode: firstMatch
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
        expected-all-match-message-count: 2507465
  component:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.expected-all-match-message-count'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
        expected-all-match-message-count: 2507465
  component:
    dynamic-router:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.dynamic-router.lazy-start-producer'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
  component:
    dynamic-router:
      lazy-start-producer: true
      bridge-error-handler: true
  cloud:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.dynamic-router.bridge-error-handler'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
    dynamic-router:
      lazy-start-producer: true
      bridge-error-handler: true
  cloud:
    enabled: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.cloud.enabled'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
      bridge-error-handler: true
  cloud:
    enabled: false
logging:
  level:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
logging:
  level:
    root: WARN
    org.apache.camel.example.springboot: INFO
spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.example.springboot'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
  level:
    root: WARN
    org.apache.camel.example.springboot: INFO
spring:
  profiles:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.profiles.active'
in `dynamic-router-eip/src/main/resources/application.yml`
#### Snippet
```java
spring:
  profiles:
    active: default

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.mode'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
spring:
  artemis:
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.broker-url'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
  artemis:
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.user'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
    pool.enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.password'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
    pool.enabled: true
camel:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.pool.enabled'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    user: admin
    password: admin
    pool.enabled: true
camel:
  servlet:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.servlet.mapping.enabled'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
  servlet:
    mapping:
      enabled: true
      context-path: /api/*
  component:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.servlet.mapping.context-path'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    mapping:
      enabled: true
      context-path: /api/*
  component:
    jms:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.jms.test-connection-on-startup'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
  component:
    jms:
      test-connection-on-startup: true
      concurrent-consumers: 5
  lra:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.jms.concurrent-consumers'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    jms:
      test-connection-on-startup: true
      concurrent-consumers: 5
  lra:
    enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.enabled'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
      concurrent-consumers: 5
  lra:
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.coordinator-url'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
  lra:
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
  service:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.local-participant-url'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
  service:
    lra.enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.service.lra.enabled'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    local-participant-url: http://localhost:${server.port}/api
  service:
    lra.enabled: true
  springboot:
    main-run-controller: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    lra.enabled: true
  springboot:
    main-run-controller: true
    name: Camel-payment
example.services:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
  springboot:
    main-run-controller: true
    name: Camel-payment
example.services:
  payment: saga-payment-service
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'example.services.payment'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    name: Camel-payment
example.services:
  payment: saga-payment-service
logging:
  level:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
logging:
  level:
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
  level:
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.processor.errorhandler.DefaultErrorHandler'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.component.jms.EndpointMessageListener'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.component.jms.reply.QueueReplyManager'
in `saga/saga-payment-service/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF


```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.output.ansi.enabled'
in `azure/camel-example-spring-boot-azure-servicebus/src/main/resources/application.yml`
#### Snippet
```java
  output:
    ansi:
      enabled: ALWAYS
camel:
  component:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.azure-servicebus.connection-string'
in `azure/camel-example-spring-boot-azure-servicebus/src/main/resources/application.yml`
#### Snippet
```java
  component:
    azure-servicebus:
        connection-string: [SERVICEBUS_CONNECTION_STRING]
        service-bus-type: queue

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.azure-servicebus.service-bus-type'
in `azure/camel-example-spring-boot-azure-servicebus/src/main/resources/application.yml`
#### Snippet
```java
    azure-servicebus:
        connection-string: [SERVICEBUS_CONNECTION_STRING]
        service-bus-type: queue

queueName: [SERVICEBUS_QUEUE_NAME]
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'queueName'
in `azure/camel-example-spring-boot-azure-servicebus/src/main/resources/application.yml`
#### Snippet
```java
        service-bus-type: queue

queueName: [SERVICEBUS_QUEUE_NAME]

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `kamelet-chucknorris/src/main/resources/application.yaml`
#### Snippet
```java
camel:
  springboot:
    name: ChuckCamel
    # keep the application running
    main-run-controller: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `kamelet-chucknorris/src/main/resources/application.yaml`
#### Snippet
```java
    name: ChuckCamel
    # keep the application running
    main-run-controller: true

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.mode'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
spring:
  artemis:
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.broker-url'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
  artemis:
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.user'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    mode: native
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
    pool.enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.password'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    broker-url: tcp://localhost:61616
    user: admin
    password: admin
    pool.enabled: true
camel:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.artemis.pool.enabled'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    user: admin
    password: admin
    pool.enabled: true
camel:
  servlet:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.servlet.mapping.enabled'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
  servlet:
    mapping:
      enabled: true
      context-path: /api/*
  component:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.servlet.mapping.context-path'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    mapping:
      enabled: true
      context-path: /api/*
  component:
    jms:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.jms.test-connection-on-startup'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
  component:
    jms:
      test-connection-on-startup: true
      concurrent-consumers: 5
  lra:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.jms.concurrent-consumers'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    jms:
      test-connection-on-startup: true
      concurrent-consumers: 5
  lra:
    enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.enabled'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
      concurrent-consumers: 5
  lra:
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.coordinator-url'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
  lra:
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
  service:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.lra.local-participant-url'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    enabled: true
    coordinator-url: http://localhost:8080
    local-participant-url: http://localhost:${server.port}/api
  service:
    lra.enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.service.lra.enabled'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    local-participant-url: http://localhost:${server.port}/api
  service:
    lra.enabled: true
  springboot:
    main-run-controller: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.main-run-controller'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    lra.enabled: true
  springboot:
    main-run-controller: true
    name: Camel-flight
example.services:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
  springboot:
    main-run-controller: true
    name: Camel-flight
example.services:
  flight: saga-flight-service
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'example.services.flight'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    name: Camel-flight
example.services:
  flight: saga-flight-service
  payment: saga-payment-service
logging:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'example.services.payment'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
example.services:
  flight: saga-flight-service
  payment: saga-payment-service
logging:
  level:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
logging:
  level:
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
  level:
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.processor.errorhandler.DefaultErrorHandler'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    root: INFO
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.component.jms.EndpointMessageListener'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.camel: INFO
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.component.jms.reply.QueueReplyManager'
in `saga/saga-flight-service/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.camel.processor.errorhandler.DefaultErrorHandler: OFF
    org.apache.camel.component.jms.EndpointMessageListener: OFF
    org.apache.camel.component.jms.reply.QueueReplyManager: OFF


```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
camel:
  springboot:
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.jmx-enabled'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
  springboot:
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
  spring-boot:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.shutdown-timeout'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
  spring-boot:
    example:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.routing-channel'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
    example:
      dynamic-router-eip:
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.subscribe-uri'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
      dynamic-router-eip:
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.receiver-scheme'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: firstMatch
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.start-uri'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: firstMatch
        send-message-count: 10000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
camel:
  springboot:
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.recipient-mode'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: firstMatch
        send-message-count: 10000
        expected-first-match-message-count: 1000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.jmx-enabled'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
  springboot:
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
  spring-boot:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.shutdown-timeout'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
  spring-boot:
    example:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.send-message-count'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
        start-uri: direct:start
        recipient-mode: firstMatch
        send-message-count: 10000
        expected-first-match-message-count: 1000
        expected-all-match-message-count: 500000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.routing-channel'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
    example:
      dynamic-router-eip:
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.expected-first-match-message-count'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
        recipient-mode: firstMatch
        send-message-count: 10000
        expected-first-match-message-count: 1000
        expected-all-match-message-count: 500000
  component:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.subscribe-uri'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
      dynamic-router-eip:
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.expected-all-match-message-count'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
        send-message-count: 10000
        expected-first-match-message-count: 1000
        expected-all-match-message-count: 500000
  component:
    dynamic-router:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.receiver-scheme'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: allMatch
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.dynamic-router.lazy-start-producer'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
  component:
    dynamic-router:
      lazy-start-producer: true
      bridge-error-handler: true
  cloud:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.start-uri'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: allMatch
        send-message-count: 1000000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.recipient-mode'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: allMatch
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.dynamic-router.bridge-error-handler'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
    dynamic-router:
      lazy-start-producer: true
      bridge-error-handler: true
  cloud:
    enabled: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.send-message-count'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
        start-uri: direct:start
        recipient-mode: allMatch
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
        expected-all-match-message-count: 2507465
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.cloud.enabled'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
      bridge-error-handler: true
  cloud:
    enabled: false
logging:
  level:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.expected-first-match-message-count'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
        recipient-mode: allMatch
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
        expected-all-match-message-count: 2507465
  component:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
logging:
  level:
    root: WARN
    org.apache.camel.example.springboot: INFO
spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.expected-all-match-message-count'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
        expected-all-match-message-count: 2507465
  component:
    dynamic-router:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.name'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
camel:
  springboot:
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.example.springboot'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
  level:
    root: WARN
    org.apache.camel.example.springboot: INFO
spring:
  main:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.dynamic-router.lazy-start-producer'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
  component:
    dynamic-router:
      lazy-start-producer: true
      bridge-error-handler: true
  cloud:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.main.banner-mode'
in `dynamic-router-eip/src/test/resources/application-test-less.yml`
#### Snippet
```java
spring:
  main:
    banner-mode: off

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.jmx-enabled'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
  springboot:
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
  spring-boot:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.dynamic-router.bridge-error-handler'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
    dynamic-router:
      lazy-start-producer: true
      bridge-error-handler: true
  cloud:
    enabled: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.cloud.enabled'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
      bridge-error-handler: true
  cloud:
    enabled: false
logging:
  level:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.springboot.shutdown-timeout'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
    name: CamelSpringBootDynamicRouterExample
    jmx-enabled: false
    shutdown-timeout: 30
  spring-boot:
    example:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
logging:
  level:
    root: WARN
    org.apache.camel.example.springboot: INFO
spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.routing-channel'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
    example:
      dynamic-router-eip:
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.example.springboot'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
  level:
    root: WARN
    org.apache.camel.example.springboot: INFO
spring:
  main:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.main.banner-mode'
in `dynamic-router-eip/src/test/resources/application-test-all.yml`
#### Snippet
```java
spring:
  main:
    banner-mode: off

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.subscribe-uri'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
      dynamic-router-eip:
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.receiver-scheme'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
        routing-channel: numbers
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: firstMatch
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.start-uri'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
        subscribe-uri: dynamic-router:control
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: firstMatch
        send-message-count: 1000000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.recipient-mode'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
        receiver-scheme: direct
        start-uri: direct:start
        recipient-mode: firstMatch
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.send-message-count'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
        start-uri: direct:start
        recipient-mode: firstMatch
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
        expected-all-match-message-count: 2507465
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.expected-first-match-message-count'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
        recipient-mode: firstMatch
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
        expected-all-match-message-count: 2507465
  component:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.spring-boot.example.dynamic-router-eip.expected-all-match-message-count'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
        send-message-count: 1000000
        expected-first-match-message-count: 1000000
        expected-all-match-message-count: 2507465
  component:
    dynamic-router:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.dynamic-router.lazy-start-producer'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
  component:
    dynamic-router:
      lazy-start-producer: true
      bridge-error-handler: true
  cloud:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.component.dynamic-router.bridge-error-handler'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
    dynamic-router:
      lazy-start-producer: true
      bridge-error-handler: true
  cloud:
    enabled: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'camel.cloud.enabled'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
      bridge-error-handler: true
  cloud:
    enabled: false
logging:
  level:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
logging:
  level:
    root: WARN
    org.apache.camel.example.springboot: INFO
spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.camel.example.springboot'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
  level:
    root: WARN
    org.apache.camel.example.springboot: INFO
spring:
  main:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.main.banner-mode'
in `dynamic-router-eip/src/test/resources/application-test-first.yml`
#### Snippet
```java
spring:
  main:
    banner-mode: off

```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `kafka-avro/src/main/java/org/apache/camel/example/kafka/avro/CustomKafkaAvroDeserializer.java`
#### Snippet
```java
        LOG.info("ENTER CustomKafkaAvroDeserializer  : configure method ");
        LOG.info("ENTER CustomKafkaAvroDeserializer  : SCHEMA_REGISTRY_URL " + SCHEMA_REGISTRY_URL);

        try {

            final List<String> schemas = Collections.singletonList(SCHEMA_REGISTRY_URL);
            this.schemaRegistry = new CachedSchemaRegistryClient(schemas, Integer.MAX_VALUE);
            this.useSpecificAvroReader = true;

        } catch (ConfigException e) {
            e.printStackTrace();
            throw new org.apache.kafka.common.config.ConfigException(e.getMessage());
        }
```

### DuplicatedCode
Duplicated code
in `rest-openapi-springdoc/src/main/java/org/apache/camel/example/springboot/CamelRouter.java`
#### Snippet
```java
restConfiguration()
            .component("servlet")
            .bindingMode(RestBindingMode.json)
            .dataFormatProperty("prettyPrint", "true")
            .enableCORS(true)
            .port(env.getProperty("server.port", "8080"))
            .contextPath(contextPath.substring(0, contextPath.length() - 2))
            // turn on openapi api-doc
            .apiContextPath("/api-doc")
            .apiProperty("api.title", "User API")
            .apiProperty("api.version", "1.0.0");

        rest("/users").description("User REST service")
            .consumes("application/json")
            .produces("application/json")

            .get().description("Find all users").outType(User[].class)
                .responseMessage().code(200).message("All users successfully returned").endResponseMessage()
                .to("bean:userService?method=findUsers")
        
            .get("/{id}").description("Find user by ID")
                .outType(User.class)
                .param().name("id").type(path).description("The ID of the user").dataType("integer").endParam()
                .responseMessage().code(200).message("User successfully returned").endResponseMessage()
                .to("bean:userService?method=findUser(${header.id})")

            .put("/{id}").description("Update a user").type(User.class)
                .param().name("id").type(path).description("The ID of the user to update").dataType("integer").endParam()    
                .param().name("body").type(body).description("The user to update").endParam()
                .responseMessage().code(204).message("User successfully updated").endResponseMessage()
                .to("direct:update-user");
        
        from("direct:update-user")
            .to("bean:userService?method=updateUser")
            .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(204))
            .setBody(constant(""));
```

### DuplicatedCode
Duplicated code
in `type-converter/src/main/java/sample/camel/CustomGeneratedConverter.java`
#### Snippet
```java
		TypeConverter converter = exchange.getContext().getTypeConverter();

		String s = converter.convertTo(String.class, data);

		final String[] splitData = s.split(" ");
		final String firstName = splitData[0];
		final String lastName = splitData[1];
		int age = Integer.parseInt(splitData[2]);

		return new Person(firstName, lastName, age);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `reactive-streams/src/main/java/org/apache/camel/example/reactive/streams/BasicCamelToReactorInOutExample.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("UserInfo{");
            sb.append("id=").append(id);
            sb.append(", name='").append(name).append('\'');
```

## RuleId[id=Deprecation]
### Deprecation
'newInstance()' is deprecated
in `twitter-salesforce/src/main/java/org/apache/camel/example/mention/TwitterSalesforceRoute.java`
#### Snippet
```java
                }

                Object contactObject = contact.newInstance();
                Method setLastName = contact.getMethod("setLastName", String.class);
                Method setTwitterScreenName__c = contact.getMethod("setTwitterScreenName__c", String.class);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `jsonResult` is redundant
in `opentelemetry/FlightBooking/src/main/java/com/example/demo/AvailableFlights.java`
#### Snippet
```java
    public String getAvailableFlight(){
        int index = (new Random()).nextInt(flights.size());
        String jsonResult= "{"+
                " \"bookingId\": "+(new Random()).nextInt(1000)+"," +
                " \"flight\": \""+flights.get(index)+" "+((new Random()).nextInt(10000))+"\"," +
```

### UnnecessaryLocalVariable
Local variable `jsonResult` is redundant
in `opentelemetry/HotelBooking/src/main/java/com/example/demo/AvailableHotels.java`
#### Snippet
```java
    public String getAvailableHotel(){
        int index = (new Random()).nextInt(hotels.size());
        String jsonResult= "{"+
                " \"bookingId\": "+(new Random()).nextInt(1000)+"," +
                " \"hotel\": \""+hotels.get(index)+"\"," +
```

### UnnecessaryLocalVariable
Local variable `jsonResult` is redundant
in `opentelemetry/CarBooking/src/main/java/com/example/demo/AvailableCars.java`
#### Snippet
```java
    public String getAvailableCar(){
        int index = (new Random()).nextInt(cars.size());
        String jsonResult= "{"+
                " \"bookingId\": "+(new Random()).nextInt(1000)+"," +
                " \"car\": \""+cars.get(index)+"\"," +
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `resilience4j/client2/src/main/java/sample/camel/CounterBean.java`
#### Snippet
```java

    public String someMethod(String body) {
        return "" + ++counter;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `resilience4j/client/src/main/java/sample/camel/CounterBean.java`
#### Snippet
```java

    public String someMethod(String body) {
        return "" + ++counter;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `observation/client/src/main/java/sample/camel/CounterBean.java`
#### Snippet
```java

	public String someMethod(String body) {
		return "" + ++counter;
	}

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `reactive-streams/src/main/java/org/apache/camel/example/reactive/streams/ClientAPIWorkflowExample.java`
#### Snippet
```java
        public void setup() {

            /**
             * This workflow reads all files from the directory named "input",
             * marshals them using the Camel marshalling features (simulation)
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Routes` may be 'static'
in `webhook/src/main/java/org/apache/camel/example/webhook/Application.java`
#### Snippet
```java

    @Component
    public class Routes extends RouteBuilder {
        @Override
        public void configure() {
```

### InnerClassMayBeStatic
Inner class `InfinispanConfiguration` may be 'static'
in `infinispan/src/main/java/org/apache/camel/example/springboot/infinispan/Application.java`
#### Snippet
```java
    @Configuration
    @ConfigurationProperties(prefix = "infinispan")
    public class InfinispanConfiguration {

        private String host;
```

## RuleId[id=DuplicatedBeanNamesInspection]
### DuplicatedBeanNamesInspection
Bean name duplicated
in `xml-import/src/main/resources/my-camel.xml`
#### Snippet
```java

  <!-- embed Camel with routes -->
  <camelContext id="SampleCamel" xmlns="http://camel.apache.org/schema/spring">

    <route id="hello">
```

### DuplicatedBeanNamesInspection
Bean name duplicated
in `kafka-offsetrepository/src/main/resources/spring/camel-context.xml`
#### Snippet
```java

    <!-- START SNIPPET: e3 -->
    <camelContext id="camel" xmlns="http://camel.apache.org/schema/spring">
        <route id="consumer-route1">
            <from id="kafka-consumer-1"
```

### DuplicatedBeanNamesInspection
Bean name duplicated
in `kafka-avro/src/main/resources/spring/camel-context.xml`
#### Snippet
```java
    <!-- END SNIPPET: e2 -->
    <!-- START SNIPPET: e3 -->
    <camelContext id="camel" xmlns="http://camel.apache.org/schema/spring">
        <propertyPlaceholder id="placeholder"
			location="classpath:application.properties" />
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `contact` initializer `null` is redundant
in `twitter-salesforce/src/main/java/org/apache/camel/example/mention/TwitterSalesforceRoute.java`
#### Snippet
```java
                String name = user.getName();
                String screenName = user.getScreenName();
                Class contact = null;
                if (Class.forName("org.apache.camel.salesforce.dto.Contact") != null) {
                    contact = Class.forName("org.apache.camel.salesforce.dto.Contact");
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `Class.forName("org.apache.camel.salesforce.dto.Contact") != null` is always `true`
in `twitter-salesforce/src/main/java/org/apache/camel/example/mention/TwitterSalesforceRoute.java`
#### Snippet
```java
                String screenName = user.getScreenName();
                Class contact = null;
                if (Class.forName("org.apache.camel.salesforce.dto.Contact") != null) {
                    contact = Class.forName("org.apache.camel.salesforce.dto.Contact");
                } else {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `kafka-avro/src/main/java/org/apache/camel/example/kafka/avro/CustomKafkaAvroSerializer.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(CustomKafkaAvroSerializer.class);
    private static final String SCHEMA_REGISTRY_URL = "http://localhost:8081";
    private boolean useSpecificAvroReader = true;
    private boolean isKey;

```

