# spring-cloud-stream-binder-dapr 
 
# Bad smells
I found 42 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBootApplicationYaml | 25 | false |
| JavadocReference | 7 | false |
| FieldMayBeFinal | 4 | false |
| UNCHECKED_WARNING | 2 | false |
| UnnecessaryLocalVariable | 1 | true |
| UNUSED_IMPORT | 1 | false |
| IntegerDivisionInFloatingPointContext | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.function.definition'
in `samples/migration-kafka-to-dapr/src/main/resources/application.yml`
#### Snippet
```java
    stream:
      function:
        definition: calculateAverage;receive;sendTestData
      bindings:
        calculateAverage-out-0:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.bindings.calculateAverage-out-0.destination'
in `samples/migration-kafka-to-dapr/src/main/resources/application.yml`
#### Snippet
```java
      bindings:
        calculateAverage-out-0:
          destination: average
        receive-in-0:
          destination: average
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.bindings.receive-in-0.destination'
in `samples/migration-kafka-to-dapr/src/main/resources/application.yml`
#### Snippet
```java
          destination: average
        receive-in-0:
          destination: average
        calculateAverage-in-0:
          destination: sensor
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.bindings.calculateAverage-in-0.destination'
in `samples/migration-kafka-to-dapr/src/main/resources/application.yml`
#### Snippet
```java
          destination: average
        calculateAverage-in-0:
          destination: sensor
        sendTestData-out-0:
          destination: sensor
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.bindings.sendTestData-out-0.destination'
in `samples/migration-kafka-to-dapr/src/main/resources/application.yml`
#### Snippet
```java
          destination: sensor
        sendTestData-out-0:
          destination: sensor
  profiles:
    active: @profileActive@
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.profiles.active'
in `samples/migration-kafka-to-dapr/src/main/resources/application.yml`
#### Snippet
```java
          destination: sensor
  profiles:
    active: @profileActive@
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.function.definition'
in `samples/azure-container-app-dapr/src/main/resources/application.yaml`
#### Snippet
```java
    stream:
      function:
        definition: supply;consume
      bindings:
        supply-out-0:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.bindings.supply-out-0.destination'
in `samples/azure-container-app-dapr/src/main/resources/application.yaml`
#### Snippet
```java
      bindings:
        supply-out-0:
          destination: <AZURE_EVENTHUB_NAME>
        consume-in-0:
          destination: <AZURE_EVENTHUB_NAME>
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.bindings.consume-in-0.destination'
in `samples/azure-container-app-dapr/src/main/resources/application.yaml`
#### Snippet
```java
          destination: <AZURE_EVENTHUB_NAME>
        consume-in-0:
          destination: <AZURE_EVENTHUB_NAME>
      dapr:
        bindings:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.dapr.bindings.supply-out-0.producer.pubsubName'
in `samples/azure-container-app-dapr/src/main/resources/application.yaml`
#### Snippet
```java
          supply-out-0:
            producer:
              pubsubName: eventhubs-pubsub
          consume-in-0:
            consumer:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.dapr.bindings.consume-in-0.consumer.pubsubName'
in `samples/azure-container-app-dapr/src/main/resources/application.yaml`
#### Snippet
```java
          consume-in-0:
            consumer:
              pubsubName: eventhubs-pubsub
grpc:
  server:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.dapr.bindings.calculateAverage-out-0.producer.pubsubName'
in `samples/migration-kafka-to-dapr/src/main/resources/application-dapr.yml`
#### Snippet
```java
          calculateAverage-out-0:
            producer:
              pubsubName: pubsub
          receive-in-0:
            consumer:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.dapr.bindings.receive-in-0.consumer.pubsubName'
in `samples/migration-kafka-to-dapr/src/main/resources/application-dapr.yml`
#### Snippet
```java
          receive-in-0:
            consumer:
              pubsubName: pubsub
          sendTestData-out-0:
            producer:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.dapr.bindings.sendTestData-out-0.producer.pubsubName'
in `samples/migration-kafka-to-dapr/src/main/resources/application-dapr.yml`
#### Snippet
```java
          sendTestData-out-0:
            producer:
              pubsubName: pubsub
          calculateAverage-in-0:
            consumer:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.dapr.bindings.calculateAverage-in-0.consumer.pubsubName'
in `samples/migration-kafka-to-dapr/src/main/resources/application-dapr.yml`
#### Snippet
```java
          calculateAverage-in-0:
            consumer:
              pubsubName: pubsub
grpc:
  server:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'grpc.server.port'
in `samples/migration-kafka-to-dapr/src/main/resources/application-dapr.yml`
#### Snippet
```java
grpc:
  server:
    port: 9091
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.kafka.binder.brokers'
in `samples/migration-kafka-to-dapr/src/main/resources/application-kafka.yml`
#### Snippet
```java
      kafka:
        binder:
          brokers: ${EVENTHUBS_NAMESPACE_NAME}.servicebus.windows.net:9093
  kafka:
    security:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.kafka.security.protocol'
in `samples/migration-kafka-to-dapr/src/main/resources/application-kafka.yml`
#### Snippet
```java
  kafka:
    security:
      protocol: SASL_SSL
    properties:
      sasl:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.kafka.properties.sasl.mechanism'
in `samples/migration-kafka-to-dapr/src/main/resources/application-kafka.yml`
#### Snippet
```java
    properties:
      sasl:
        mechanism: PLAIN
        jaas:
          config: org.apache.kafka.common.security.plain.PlainLoginModule required username="$ConnectionString" password="${CONNECTION_STRING}";
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.kafka.properties.sasl.jaas.config'
in `samples/migration-kafka-to-dapr/src/main/resources/application-kafka.yml`
#### Snippet
```java
        mechanism: PLAIN
        jaas:
          config: org.apache.kafka.common.security.plain.PlainLoginModule required username="$ConnectionString" password="${CONNECTION_STRING}";

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.function.definition'
in `samples/local-dapr/src/main/resources/application.yaml`
#### Snippet
```java
    stream:
      function:
        definition: supply;consume
      bindings:
        supply-out-0:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.bindings.supply-out-0.destination'
in `samples/local-dapr/src/main/resources/application.yaml`
#### Snippet
```java
      bindings:
        supply-out-0:
          destination: <AZURE_EVENTHUB_NAME>
        consume-in-0:
          destination: <AZURE_EVENTHUB_NAME>
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.bindings.consume-in-0.destination'
in `samples/local-dapr/src/main/resources/application.yaml`
#### Snippet
```java
          destination: <AZURE_EVENTHUB_NAME>
        consume-in-0:
          destination: <AZURE_EVENTHUB_NAME>
      dapr:
        bindings:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.dapr.bindings.supply-out-0.producer.pubsubName'
in `samples/local-dapr/src/main/resources/application.yaml`
#### Snippet
```java
          supply-out-0:
            producer:
              pubsubName: eventhubs-pubsub
          consume-in-0:
            consumer:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.stream.dapr.bindings.consume-in-0.consumer.pubsubName'
in `samples/local-dapr/src/main/resources/application.yaml`
#### Snippet
```java
          consume-in-0:
            consumer:
              pubsubName: eventhubs-pubsub

```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/messaging/DaprMessageConverter.java`
#### Snippet
```java
	@Override
	public DaprProtos.PublishEventRequest.Builder fromMessage(Message<?> message) {
		Map<String, Object> copyHeaders = new HashMap(message.getHeaders());
		DaprProtos.PublishEventRequest.Builder builder = DaprProtos.PublishEventRequest.newBuilder();
		DaprMessage daprMessage = new DaprMessage((byte[]) message.getPayload(), message.getHeaders());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/messaging/DaprMessageConverter.java`
#### Snippet
```java
		PropertyMapper propertyMapper = PropertyMapper.get().alwaysApplyingWhenNonNull();
		propertyMapper.from((String) copyHeaders.remove(DaprHeaders.CONTENT_TYPE)).to(builder::setDataContentType);
		propertyMapper.from((Map<String, String>) copyHeaders.remove(DaprHeaders.SPECIFIED_BROKER_METADATA)).to(builder::putAllMetadata);
		SUPPORT_MESSAGE_HEADERS.forEach(key ->
				propertyMapper.from(copyHeaders.remove(key)).to(value -> builder.putMetadata(key, value.toString()))
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Message`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/messaging/DaprMessage.java`
#### Snippet
```java

/**
 * Encapsulates {@link Message} payload and headers for serialization.
 */
public class DaprMessage implements Serializable {
```

### JavadocReference
Cannot resolve symbol `Message`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/messaging/DaprConverter.java`
#### Snippet
```java

/**
 * A converter to turn a {@link Message} from serialized form to a typed Object and vice versa.
 *
 * @param <I> The Dapr message type when sending to the broker using Dapr SDK.
```

### JavadocReference
Cannot resolve symbol `Message`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/messaging/DaprConverter.java`
#### Snippet
```java

	/**
	 * Create a {@link Message} whose payload is the result of converting the given
	 * payload Object to serialized form.
	 * @param daprMessage the Object to convert
```

### JavadocReference
Cannot resolve symbol `Message`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/messaging/DaprConverter.java`
#### Snippet
```java

	/**
	 * Convert a {@link Message} from a serialized form to a typed Object.
	 *
	 * @param message the input message
```

### JavadocReference
Cannot resolve symbol `org.springframework.cloud.stream.binder.Binder`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/DaprMessageChannelBinder.java`
#### Snippet
```java

/**
 * A {@link org.springframework.cloud.stream.binder.Binder} implementation backed by Dapr.
 */
public class DaprMessageChannelBinder extends
```

### JavadocReference
Cannot resolve symbol `Message`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/messaging/DaprMessageConverter.java`
#### Snippet
```java

/**
 * A converter to turn a {@link Message} to {@link DaprProtos.PublishEventRequest.Builder}.
 * and turn a {@link DaprAppCallbackProtos.TopicEventRequest} to {@link Message}.
 */
```

### JavadocReference
Cannot resolve symbol `Message`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/messaging/DaprMessageConverter.java`
#### Snippet
```java
/**
 * A converter to turn a {@link Message} to {@link DaprProtos.PublishEventRequest.Builder}.
 * and turn a {@link DaprAppCallbackProtos.TopicEventRequest} to {@link Message}.
 */
public class DaprMessageConverter implements DaprConverter<DaprProtos.PublishEventRequest.Builder,
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `channel` is redundant
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/config/DaprBinderConfiguration.java`
#### Snippet
```java
	@ConditionalOnMissingBean
	public ManagedChannel managedChannel(ManagedChannelBuilder managedChannelBuilder) {
		ManagedChannel channel = managedChannelBuilder.build();
		return channel;
	}
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import reactor.core.publisher.Sinks;`
in `samples/azure-container-app-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/sample/DaprSampleApplication.java`
#### Snippet
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Sinks;

import org.springframework.boot.SpringApplication;
```

## RuleId[id=IntegerDivisionInFloatingPointContext]
### IntegerDivisionInFloatingPointContext
`(accumulator.getTotalValue()) / accumulator.getCount()`: integer division in floating-point context
in `samples/migration-kafka-to-dapr/src/main/java/com.azure.spring.cloud.stream.binder.dapr.sample/SensorAverageProcessorApplication.java`
#### Snippet
```java
				.reduce(new Accumulator(0, 0),
						(a, d) -> new Accumulator(a.getCount() + 1, a.getTotalValue() + d.getTemperature()))
				.map(accumulator -> new Average(group.key(), (accumulator.getTotalValue()) / accumulator.getCount()));
	}

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `integrationConsumer` may be 'final'
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/impl/DaprMessageConsumer.java`
#### Snippet
```java
	private final String topic;
	private final String pubsubName;
	private Consumer<DaprAppCallbackProtos.TopicEventRequest> integrationConsumer;
	public DaprMessageConsumer(String pubsubName, String topic, Consumer<DaprAppCallbackProtos.TopicEventRequest> integrationConsumer) {
		this.pubsubName = pubsubName;
```

### FieldMayBeFinal
Field `random` may be 'final'
in `samples/migration-kafka-to-dapr/src/main/java/com.azure.spring.cloud.stream.binder.dapr.sample/SensorAverageProcessorApplication.java`
#### Snippet
```java

		private AtomicBoolean semaphore = new AtomicBoolean(true);
		private Random random = new Random();
		private int[] ids = new int[]{100100, 100200, 100300};

```

### FieldMayBeFinal
Field `semaphore` may be 'final'
in `samples/migration-kafka-to-dapr/src/main/java/com.azure.spring.cloud.stream.binder.dapr.sample/SensorAverageProcessorApplication.java`
#### Snippet
```java
	static class TestSource {

		private AtomicBoolean semaphore = new AtomicBoolean(true);
		private Random random = new Random();
		private int[] ids = new int[]{100100, 100200, 100300};
```

### FieldMayBeFinal
Field `ids` may be 'final'
in `samples/migration-kafka-to-dapr/src/main/java/com.azure.spring.cloud.stream.binder.dapr.sample/SensorAverageProcessorApplication.java`
#### Snippet
```java
		private AtomicBoolean semaphore = new AtomicBoolean(true);
		private Random random = new Random();
		private int[] ids = new int[]{100100, 100200, 100300};

		@Bean
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/impl/DaprMessageProducer.java`
#### Snippet
```java
 */
public class DaprMessageProducer extends MessageProducerSupport {
	private final DaprGrpcService daprGrpcService;
	private final DaprMessageConverter daprMessageConverter;
	public DaprMessageProducer(DaprGrpcService daprGrpcService,
```

