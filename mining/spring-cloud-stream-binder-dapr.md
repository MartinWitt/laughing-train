# spring-cloud-stream-binder-dapr 
 
# Bad smells
I found 14 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 4 | false |
| IgnoreResultOfCall | 3 | false |
| RedundantFieldInitialization | 2 | false |
| UnnecessaryLocalVariable | 1 | true |
| DataFlowIssue | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| UNUSED_IMPORT | 1 | false |
| CodeBlock2Expr | 1 | true |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `samples/local-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/sample/DaprSampleApplication.java`
#### Snippet
```java

	private static final Logger LOGGER = LoggerFactory.getLogger(DaprSampleApplication.class);
	private int i = 0;

	@Bean
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `samples/azure-container-app-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/sample/DaprSampleApplication.java`
#### Snippet
```java

	private static final Logger LOGGER = LoggerFactory.getLogger(DaprSampleApplication.class);
	private int i = 0;
	public static void main(String[] args) {
		SpringApplication.run(DaprSampleApplication.class, args);
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

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `setTopic` may produce `NullPointerException`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/impl/DaprMessageHandler.java`
#### Snippet
```java
	private void publishEvent(Message<?> message) {
		DaprProtos.PublishEventRequest.Builder builder = daprMessageConverter.fromMessage(message);
		builder.setTopic(topic);
		builder.setPubsubName(pubsubName);
		daprStub.publishEvent(builder.build(), createDaprStreamObserver());
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `io.grpc` is unnecessary and can be removed
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/properties/DaprBinderConfigurationProperties.java`
#### Snippet
```java
		 *  this is the compressor used by the stub to compress messages to the server.  To get
		 *  compressed responses from the server, set the appropriate {@link io.grpc.DecompressorRegistry}
		 *  on the {@link io.grpc.ManagedChannelBuilder}.
		 */
		private String compression;
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super DaprAppCallbackProtos.TopicEventRequest`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/impl/DaprMessageConsumer.java`
#### Snippet
```java
	private final String pubsubName;
	private Consumer<DaprAppCallbackProtos.TopicEventRequest> integrationConsumer;
	public DaprMessageConsumer(String pubsubName, String topic, Consumer<DaprAppCallbackProtos.TopicEventRequest> integrationConsumer) {
		this.pubsubName = pubsubName;
		this.topic = topic;
```

### BoundedWildcard
Can generalize to `? extends Sensor`
in `samples/migration-kafka-to-dapr/src/main/java/com.azure.spring.cloud.stream.binder.dapr.sample/SensorAverageProcessorApplication.java`
#### Snippet
```java
	}

	private Mono<Average> calculateAverage(GroupedFlux<Integer, Sensor> group) {
		return group
				.reduce(new Accumulator(0, 0),
```

### BoundedWildcard
Can generalize to `? extends ManagedChannelBuilderCustomizer`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/config/DaprBinderConfiguration.java`
#### Snippet
```java
	@ConditionalOnMissingBean
	public ManagedChannelBuilder managedChannelBuilder(DaprBinderConfigurationProperties daprBinderProperties,
			ObjectProvider<ManagedChannelBuilderCustomizer> managedChannelBuilderCustomizers) {
		ManagedChannelBuilder builder = ManagedChannelBuilder.forAddress(daprBinderProperties.getDaprIp(), daprBinderProperties.getDaprPort());
		DaprBinderConfigurationProperties.ManagedChannel managedChannelProperties = daprBinderProperties.getManagedChannel();
```

### BoundedWildcard
Can generalize to `? extends DaprStubCustomizer`
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/config/DaprBinderConfiguration.java`
#### Snippet
```java
	public DaprGrpc.DaprStub daprStub(ManagedChannel channel,
			DaprBinderConfigurationProperties daprBinderProperties,
			ObjectProvider<DaprStubCustomizer> daprStubCustomizers) {
		DaprGrpc.DaprStub daprStub = DaprGrpc.newStub(channel);
		DaprBinderConfigurationProperties.DaprStub daprStubProperties = daprBinderProperties.getDaprStub();
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `samples/local-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/sample/DaprSampleApplication.java`
#### Snippet
```java
	@Bean
	public Consumer<Message<String>> consume() {
		return message -> {
			LOGGER.info("Message received : {}", message.getPayload());
		};
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `AbstractStub.withMaxInboundMessageSize()` is ignored
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/config/DaprBinderConfiguration.java`
#### Snippet
```java
		PropertyMapper propertyMapper = PropertyMapper.get();
		PropertyMapper.Source<DaprBinderConfigurationProperties.DaprStub> from = propertyMapper.from(daprStubProperties);
		from.as(DaprBinderConfigurationProperties.DaprStub::getMaxInboundMessageSize).whenNonNull().to(daprStub::withMaxInboundMessageSize);
		from.as(DaprBinderConfigurationProperties.DaprStub::getMaxOutboundMessageSize).whenNonNull().to(daprStub::withMaxOutboundMessageSize);
		from.as(DaprBinderConfigurationProperties.DaprStub::getCompression).whenNonNull().to(daprStub::withCompression);
```

### IgnoreResultOfCall
Result of `AbstractStub.withMaxOutboundMessageSize()` is ignored
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/config/DaprBinderConfiguration.java`
#### Snippet
```java
		PropertyMapper.Source<DaprBinderConfigurationProperties.DaprStub> from = propertyMapper.from(daprStubProperties);
		from.as(DaprBinderConfigurationProperties.DaprStub::getMaxInboundMessageSize).whenNonNull().to(daprStub::withMaxInboundMessageSize);
		from.as(DaprBinderConfigurationProperties.DaprStub::getMaxOutboundMessageSize).whenNonNull().to(daprStub::withMaxOutboundMessageSize);
		from.as(DaprBinderConfigurationProperties.DaprStub::getCompression).whenNonNull().to(daprStub::withCompression);
		daprStubCustomizers.stream().forEach(daprStubCustomizer -> daprStubCustomizer.customize(daprStub));
```

### IgnoreResultOfCall
Result of `AbstractStub.withCompression()` is ignored
in `spring-cloud-stream-binder-dapr/src/main/java/com/azure/spring/cloud/stream/binder/dapr/config/DaprBinderConfiguration.java`
#### Snippet
```java
		from.as(DaprBinderConfigurationProperties.DaprStub::getMaxInboundMessageSize).whenNonNull().to(daprStub::withMaxInboundMessageSize);
		from.as(DaprBinderConfigurationProperties.DaprStub::getMaxOutboundMessageSize).whenNonNull().to(daprStub::withMaxOutboundMessageSize);
		from.as(DaprBinderConfigurationProperties.DaprStub::getCompression).whenNonNull().to(daprStub::withCompression);
		daprStubCustomizers.stream().forEach(daprStubCustomizer -> daprStubCustomizer.customize(daprStub));
		return daprStub;
```

