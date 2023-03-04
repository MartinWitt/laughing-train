# dubbo-samples 
 
# Bad smells
I found 1703 bad smells with 382 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 701 | false |
| UtilityClassWithoutPrivateConstructor | 365 | true |
| IOResource | 198 | false |
| ThrowablePrintStackTrace | 97 | false |
| RedundantFieldInitialization | 72 | false |
| IgnoreResultOfCall | 36 | false |
| EmptyMethod | 25 | false |
| DynamicRegexReplaceableByCompiledPattern | 19 | false |
| MissortedModifiers | 17 | false |
| BusyWait | 17 | false |
| UNUSED_IMPORT | 16 | false |
| InfiniteLoopStatement | 16 | false |
| ReturnNull | 14 | false |
| CommentedOutCode | 12 | false |
| DataFlowIssue | 11 | false |
| BoundedWildcard | 11 | false |
| OptionalGetWithoutIsPresent | 11 | false |
| MarkedForRemoval | 6 | false |
| StringBufferReplaceableByString | 6 | false |
| UnusedAssignment | 6 | false |
| RedundantArrayCreation | 5 | true |
| DefaultAnnotationParam | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| UnnecessaryModifier | 3 | true |
| TrivialStringConcatenation | 3 | false |
| CodeBlock2Expr | 3 | true |
| StaticCallOnSubclass | 2 | false |
| InstanceofIncompatibleInterface | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| ImplicitArrayToString | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| Convert2Lambda | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| FieldMayBeStatic | 1 | false |
| UnnecessarySemicolon | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| EmptyFinallyBlock | 1 | false |
| RegExpSimplifiable | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| NestedAssignment | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| ThreadStartInConstruction | 1 | false |
| ConstantValue | 1 | false |
## RuleId[ruleID=IOResource]
### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-consul/src/main/java/org/apache/dubbo/samples/consul/ConsulConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-consul/src/main/java/org/apache/dubbo/samples/consul/ConsulProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();
        System.out.println("dubbo service started");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-consumer2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/serialization/dubbo-samples-serialization/dubbo-samples-serialization-java/src/main/java/org/apache/dubbo/samples/serialization/DubboProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/serialization/dubbo-samples-serialization/dubbo-samples-serialization-java/src/main/java/org/apache/dubbo/samples/serialization/DubboConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) {
        AnnotationConfigApplicationContext consumerContext = new AnnotationConfigApplicationContext();
        consumerContext.register(ConsumerConfiguration.class);
        consumerContext.refresh();
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/FooProviderBootstrap.java`
#### Snippet
```java
        initFlowRule();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ProviderConfiguration.class);
        context.refresh();
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-provider2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-test-10704/src/main/java/org/apache/dubbo/samples/local/LocalDemo.java`
#### Snippet
```java
    public static void main(String[] args) throws InterruptedException {
        new EmbeddedZooKeeper(2181, true).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo.xml");
        context.start();
        System.out.println("dubbo service started");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboOrderServiceStarter.java`
#### Snippet
```java
         *  3. Order service is ready . Waiting for buyers to order
         */
        ClassPathXmlApplicationContext orderContext = new ClassPathXmlApplicationContext("spring/dubbo-order-service.xml");
        orderContext.getBean("service");

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboAccountServiceStarter.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext accountContext = new ClassPathXmlApplicationContext("spring/dubbo-account-service.xml");
        accountContext.getBean("service");
        JdbcTemplate accountJdbcTemplate = (JdbcTemplate) accountContext.getBean("jdbcTemplate");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboBusinessTester.java`
#### Snippet
```java
         *  4. The whole e-commerce platform is ready , The buyer(U100001) create an order on the sku(C00321) , the count is 2
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-business.xml");
        final BusinessService business = (BusinessService) context.getBean("business");
        business.purchase("U100001", "C00321", 2, false);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboStorageServiceStarter.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext storageContext = new ClassPathXmlApplicationContext("spring/dubbo-storage-service.xml");
        storageContext.getBean("service");
        JdbcTemplate storageJdbcTemplate = (JdbcTemplate) storageContext.getBean("jdbcTemplate");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-rocketmq/src/main/java/org/apache/dubbo/samples/rocketmq/RocketmqProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/rocketmq-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-rocketmq/src/main/java/org/apache/dubbo/samples/rocketmq/RocketmqConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/rocketmq-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/MetricsProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-consumer2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/MetricsConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        GreetingsService greetingsService = (GreetingsService) context.getBean("greetingsService");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
public class AlwaysApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        GreetingsService greetingsService = (GreetingsService) context.getBean("greetingsService");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/version-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-version/src/main/java/org/apache/dubbo/samples/version/VersionConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/version-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/version-provider2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-consumer2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericImplConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/generic-impl-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-type/src/main/java/org/apache/dubbo/samples/generic/GenericProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/generic-type-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-type/src/main/java/org/apache/dubbo/samples/generic/GenericConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/generic-type-consumer.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) {
        AnnotationConfigApplicationContext consumerContext = new AnnotationConfigApplicationContext();
        consumerContext.register(ConsumerConfiguration.class);
        consumerContext.refresh();
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/FooProviderBootstrap.java`
#### Snippet
```java
        initFlowRule();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ProviderConfiguration.class);
        context.refresh();
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-provider2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/serialization/dubbo-samples-prefer-serialization/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-provider2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/serialization/dubbo-samples-prefer-serialization/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-provider/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallProvider.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
//        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/generic-provider.xml");
        context.start();
        System.out.println("dubbo service started");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/MetricsConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/MetricsProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/StartProviderAndConsumer.java`
#### Snippet
```java

    private static void startConsumer() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/StartProviderAndConsumer.java`
#### Snippet
```java

    private static void startProvider() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-switch-serialization-thread/src/main/java/org/apache/dubbo/samples/serialization/change/thread/SerializationSwitchThreadProvider.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/serialization-switch-thread-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-switch-serialization-thread/src/main/java/org/apache/dubbo/samples/serialization/change/thread/SerializationSwitchThreadConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/serialization-switch-thread-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/simplified-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/simplified-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/simplified-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/simplified-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/simplified-consumer.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterProvider.java`
#### Snippet
```java
        try {
            ZKTools.generateDubboProperties();
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
            context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        initProperties();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/simplified-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-sc/dubbo-sc-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        UserService userService = context.getBean("userService", UserService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-middle/src/main/java/org/apache/dubbo/samples/chain/MiddleEndProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/BackendProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/provider/ProviderStarter.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/metadata-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/metadata-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-consumer2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/merge-provider2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/BasicProvider.java`
#### Snippet
```java
        Thread.sleep(2000);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/configcenter-provider.xml");
        context.registerShutdownHook();
        context.start();
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/configcenter-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-apollo/src/main/java/org/apache/dubbo/samples/configcenter/ApolloProvider.java`
#### Snippet
```java
        //ApolloUtil.importConfigs();
        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/configcenter-provider.xml"});
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-apollo/src/main/java/org/apache/dubbo/samples/configcenter/ApolloConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/configcenter-consumer.xml"});
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/AnnotationProvider.java`
#### Snippet
```java
        ZKTools.generateDubboProperties();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/AnnotationConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/BasicProvider.java`
#### Snippet
```java
        ZKTools.generateDubboProperties();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/configcenter-provider.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/AnnotationConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/configcenter-consumer.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/AnnotationProvider.java`
#### Snippet
```java
        ZKTools.generateDubboProperties();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/Provider.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo service started");
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-provider/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo service started");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-registry/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo service started");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-registry/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/BasicProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/configcenter-provider.xml");
        context.registerShutdownHook();
        context.start();
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/configcenter-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/util/NacosUtils.java`
#### Snippet
```java
        File file = new File(NacosUtils.class.getClassLoader().getResource("config-center.properties").getFile());
        try (FileReader reader = new FileReader(file)) {
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-provider/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("=============== dubbo service started ===============");
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-zookeeper/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-kubernetes/dubbo-samples-apiserver-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-kubernetes/dubbo-samples-apiserver-provider/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo service started");
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-zookeeper/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-default-config/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2182, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-default-config/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/CommonMultiRegistryProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2182, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/common-multi-registry-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryProvider.java`
#### Snippet
```java
//        new EmbeddedZooKeeper(2182, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/multi-registry-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/CommonMultiRegistryConsumer.java`
#### Snippet
```java
public class CommonMultiRegistryConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/common-multi-registry-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/multi-registry-consumer1.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProviderOtherPort.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider-20881.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider-20880.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-provider-instance/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/validation-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/validation-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/async-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/async-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-compatible/src/main/java/org/apache/dubbo/samples/compat/Consumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-compat-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-compatible/src/main/java/org/apache/dubbo/samples/compat/Provider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-compat-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-echo/src/main/java/org/apache/dubbo/samples/echo/EchoProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/echo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-echo/src/main/java/org/apache/dubbo/samples/echo/EchoConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/echo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/version-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-version/src/main/java/org/apache/dubbo/samples/version/VersionConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/version-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/version-provider2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/BasicMonitor.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-monitor.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/BasicProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/metadata-consumer.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/metadata-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/serialization/dubbo-samples-protobuf/protobuf-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/RestProvider.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/rest-provider.xml"});
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/RestConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/rest-consumer.xml"});
        context.start();
        AnotherUserRestService userService = (AnotherUserRestService) context.getBean("anotherUserRestService");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-webservice/dubbo-samples-webservice-provider/src/main/java/org/apache/dubbo/samples/webservice/provider/WebserviceProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-samples-webservice-provider.xml");
        context.registerShutdownHook();
        context.start();
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-webservice/dubbo-samples-webservice-consumer/src/main/java/org/apache/dubbo/samples/webservice/consumer/WebserviceConsumer.java`
#### Snippet
```java
public class WebserviceConsumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-samples-webservice-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/SpiCompatibleProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/SpiCompatibleConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-environment-keys/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
        System.setProperty("dubbo.env.keys", "DUBBO_KEY1, DUBBO_KEY2");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-environment-keys/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/dubbo-demo-servicediscovery-xml/servicediscovery-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/dubbo-demo-servicediscovery-xml/servicediscovery-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-http/src/main/java/org/apache/dubbo/samples/http/HttpProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/http-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-http/src/main/java/org/apache/dubbo/samples/http/HttpConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/http-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-impl/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/ThriftProvider.java`
#### Snippet
```java
public class ThriftProvider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/thrift-provider.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `3-extensions/serialization/dubbo-samples-protobuf/protobuf-consumer/src/main/java/org/apache/dubbo/demo/consumer/ConsumerApplication.java`
#### Snippet
```java
public class ConsumerApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-provider1/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-provider2/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-zipkin/src/main/java/org/apache/dubbo/samples/service/hello/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/hello-service.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-zipkin/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/client.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-zipkin/src/main/java/org/apache/dubbo/samples/service/greeting/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/greeting-service.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-spring-hystrix/src/main/java/org/apache/dubbo/samples/annotation/AnnotationProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-spring-hystrix/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/BasicProvider2.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider2.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        GreetingService greetingService = context.getBean("greetingService", GreetingService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-consumer-old/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/async-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/async-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/async-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/async-consumer.xml");
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/AnnotationProviderBootstrap.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumerBootstrap.java`
#### Snippet
```java

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-context/src/main/java/org/apache/dubbo/samples/context/ContextProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-context-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-context/src/main/java/org/apache/dubbo/samples/context/ContextConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-context-consumer.xml");
        context.start();
        ContextService contextService = context.getBean("contextService", ContextService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/MockProvider.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/mock-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/AsyncProvider.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/async-provider.xml"});
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/MockConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/mock-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/AsyncConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/async-consumer.xml"});
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/async-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/async-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/EmbeddedAsyncProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/embedded-async-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/GroupConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/group-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/GroupProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/group-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-local/src/main/java/org/apache/dubbo/samples/local/LocalDemo.java`
#### Snippet
```java
    public static void main(String[] args) throws InterruptedException {
        new EmbeddedZooKeeper(2181, true).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo.xml");
        context.start();
        System.out.println("dubbo service started");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-direct/src/main/java/org/apache/dubbo/samples/direct/DirectConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-direct-consumer.xml");
        context.start();
        DirectService directService = (DirectService) context.getBean("directService");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/CallbackProvider.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/callback-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-direct/src/main/java/org/apache/dubbo/samples/direct/DirectProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-direct-provider.xml");
        context.start();
        System.out.println("dubbo service started");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/CallbackConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/callback-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/AttachmentConsumer.java`
#### Snippet
```java

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/attachment-consumer.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/AttachmentProvider.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/attachment-provider.xml");
        context.start();

```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/RpcContextProvider2.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-rpccontext-provider2.xml");
        context.start();
        System.out.println("Rpc context provider2 started");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/RpcContextConsumer.java`
#### Snippet
```java
public class RpcContextConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-rpccontext-consumer.xml");
        context.start();
        RpcContextService1 rpcContextService1 = context.getBean("consumerService", RpcContextService1.class);
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/RpcContextProvider1.java`
#### Snippet
```java
public class RpcContextProvider1 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-rpccontext-provider1.xml");
        context.start();
        System.out.println("Rpc context provider1 started");
```

### IOResource
'ClassPathXmlApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-provider2/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();

```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/integration/swagger/DubboSwaggerService.java`
#### Snippet
```java
    @GET
    @Path("swagger")
    public Response getListingJson(@Context Application app, @Context ServletConfig sc,
                                   @Context HttpHeaders headers, @Context UriInfo uriInfo) throws JsonProcessingException;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `2-advanced/dubbo-samples-context/src/main/java/org/apache/dubbo/samples/context/api/ContextService.java`
#### Snippet
```java

public interface ContextService {
    public String sayHello(String name);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/api/GroupService.java`
#### Snippet
```java
public interface GroupService {

    public String sayHello(String name);
}

```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `clientName` may be 'static'
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/pojo/TriPojoClient.java`
#### Snippet
```java

    private final PojoGreeter delegate;
    private final String clientName = "tri-pojo";

    public TriPojoClient() {
```

## RuleId[ruleID=MarkedForRemoval]
### MarkedForRemoval
'suspend()' is deprecated and marked for removal
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/RateLimiterAction.java`
#### Snippet
```java

    public void suspendRateLimiter() {
        rateThread.suspend();
    }

```

### MarkedForRemoval
'resume()' is deprecated and marked for removal
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/RateLimiterAction.java`
#### Snippet
```java

    public void resumeRateLimiterr() {
        rateThread.resume();

    }
```

### MarkedForRemoval
'resume()' is deprecated and marked for removal
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java

    public void resumeCircuitBreakerMethod() {
        circuitBreakerMethodThread.resume();

    }
```

### MarkedForRemoval
'suspend()' is deprecated and marked for removal
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java

    public void suspendCircuitBreaker() {
        circuitBreakerThread.suspend();
    }

```

### MarkedForRemoval
'suspend()' is deprecated and marked for removal
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java

    public void suspendCircuitBreakerMethod() {
        circuitBreakerMethodThread.suspend();
    }

```

### MarkedForRemoval
'resume()' is deprecated and marked for removal
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java

    public void resumeCircuitBreaker() {
        circuitBreakerThread.resume();

    }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `FakeMain` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-consumer/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java
package org.apache.dubbo.samples;

public class FakeMain {
    public static void main(String[] args) {

```

### UtilityClassWithoutPrivateConstructor
Class `ProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-spring-boot/dubbo-samples-spring-boot-provider/src/main/java/org/apache/dubbo/springboot/demo/provider/ProviderApplication.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `ExtensibilityRouterProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-extensibility/dubbo-samples-extensibility-router-provider/src/main/java/org/apache/dubbo/samples/extensibility/router/provider/ExtensibilityRouterProviderApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ExtensibilityRouterProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExtensibilityRouterProviderApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `ApplicationB1` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-rpc-advanced/dubbo-samples-rpc-advanced-app-b-v1/src/main/java/org/apache/dubbo/samples/b1/ApplicationB1.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ApplicationB1 {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-notify/dubbo-samples-notify-provider/src/main/java/org/apache/dubbo/samples/notify/provider/ProviderApplication.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) {
        new EmbeddedZooKeeper(2181, false).start();
```

### UtilityClassWithoutPrivateConstructor
Class `DevelopApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-develop/dubbo-samples-develop-provider/src/main/java/org/apache/dubbo/samples/develop/DevelopApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class DevelopApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-spring-boot3-tracing/dubbo-samples-spring-boot3-tracing-provider/src/main/java/org/apache/dubbo/springboot/demo/provider/ProviderApplication.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `DetailApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-detail-v1/src/main/java/org/apache/dubbo/samples/detail/DetailApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class DetailApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-autowire/dubbo-samples-autowire-provider/src/main/java/org/apache/dubbo/samples/autowire/provider/ProviderBootstrap.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class ProviderBootstrap {

    public static void main(String[] args) throws InterruptedException {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-rpc-basic/dubbo-samples-rpc-basic-consumer/src/main/java/org/apache/dubbo/samples/consumer/ConsumerApplication.java`
#### Snippet
```java

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsulConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-consul/src/main/java/org/apache/dubbo/samples/consul/ConsulConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsulConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsulProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-consul/src/main/java/org/apache/dubbo/samples/consul/ConsulProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ConsulProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeConsumer2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeConsumer2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeConsumer` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `FakeMain` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-test-11137/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java
package org.apache.dubbo.samples;

public class FakeMain {
    public static void main(String[] args) {

```

### UtilityClassWithoutPrivateConstructor
Class `DubboProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-serialization/dubbo-samples-serialization-java/src/main/java/org/apache/dubbo/samples/serialization/DubboProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class DubboProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `DubboConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-serialization/dubbo-samples-serialization-java/src/main/java/org/apache/dubbo/samples/serialization/DubboConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `App` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-interface/src/main/java/org/apache/dubbo/samples/App.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class App {
    public static void main(String[] args) throws InterruptedException {
        App1.main(args);
```

### UtilityClassWithoutPrivateConstructor
Class `FooConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java
 * </pre>
 */
public class FooConsumerBootstrap {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `App5` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-interface/src/main/java/org/apache/dubbo/samples/App5.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App5 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App3` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-interface/src/main/java/org/apache/dubbo/samples/App3.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App3 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-interface/src/main/java/org/apache/dubbo/samples/App2.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App2 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App6` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-interface/src/main/java/org/apache/dubbo/samples/App6.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App6 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App1` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-interface/src/main/java/org/apache/dubbo/samples/App1.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App1 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `FooProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/FooProviderBootstrap.java`
#### Snippet
```java
 * </pre>
 */
public class FooProviderBootstrap {

    private static final String INTERFACE_RES_KEY = FooService.class.getName();
```

### UtilityClassWithoutPrivateConstructor
Class `App4` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-interface/src/main/java/org/apache/dubbo/samples/App4.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App4 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-port-unification-netty3/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {


```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-test-11557/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
import org.apache.dubbo.samples.api.GreetingsService;

public class Application {
    private static final String ZOOKEEPER_HOST = System.getProperty("zookeeper.address", "127.0.0.1");
    private static final String ZOOKEEPER_PORT = System.getProperty("zookeeper.port", "2181");
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-empty-protection/src/main/java/org/apache/dubbo/samples/Main.java`
#### Snippet
```java
package org.apache.dubbo.samples;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
```

### UtilityClassWithoutPrivateConstructor
Class `MergeProvider2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MergeProvider2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `LocalDemo` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-test-10704/src/main/java/org/apache/dubbo/samples/local/LocalDemo.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class LocalDemo {

    public static void main(String[] args) throws InterruptedException {
```

### UtilityClassWithoutPrivateConstructor
Class `FakeMain` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-test-11159/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java
package org.apache.dubbo.samples;

public class FakeMain {
    public static void main(String[] args) {

```

### UtilityClassWithoutPrivateConstructor
Class `TestServers` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/TestServers.java`
#### Snippet
```java
 * for Integration testing
 */
public class TestServers {

    public static void main(String[] args) throws IOException, InterruptedException {
```

### UtilityClassWithoutPrivateConstructor
Class `TriSampleConstants` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/util/TriSampleConstants.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.RegistryConstants.REGISTER_MODE_KEY;

public class TriSampleConstants {

    // macos 11 later the 50051 is occupied by system (pid=1!!!)
```

### UtilityClassWithoutPrivateConstructor
Class `GenericServer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/generic/GenericServer.java`
#### Snippet
```java
import java.io.IOException;

public class GenericServer {
    public static void main(String[] args) throws IOException {
        TriPojoServer server = new TriPojoServer(TriSampleConstants.SERVER_PORT);
```

### UtilityClassWithoutPrivateConstructor
Class `TriOpClient` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/client/TriOpClient.java`
#### Snippet
```java
import java.io.IOException;

public class TriOpClient {

    public static void main(String[] args) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `TriOpServer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/server/TriOpServer.java`
#### Snippet
```java
import java.io.IOException;

public class TriOpServer {
    public static void main(String[] args) throws IOException {
        TriStubServer triStubServer = new TriStubServer(TriSampleConstants.SERVER_PORT);
```

### UtilityClassWithoutPrivateConstructor
Class `ApiMigrationTriProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationTriProvider.java`
#### Snippet
```java
import org.apache.dubbo.sample.tri.util.TriSampleConstants;

class ApiMigrationTriProvider {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ApiMigrationDubboProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationDubboProvider.java`
#### Snippet
```java
import org.apache.dubbo.sample.tri.util.TriSampleConstants;

class ApiMigrationDubboProvider {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ApiMigrationBothProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationBothProvider.java`
#### Snippet
```java
import org.apache.dubbo.sample.tri.util.TriSampleConstants;

public class ApiMigrationBothProvider {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `DubboOrderServiceStarter` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboOrderServiceStarter.java`
#### Snippet
```java
 * The type Dubbo order service starter.
 */
public class DubboOrderServiceStarter {
    /**
     * The entry point of application.
```

### UtilityClassWithoutPrivateConstructor
Class `DubboAccountServiceStarter` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboAccountServiceStarter.java`
#### Snippet
```java
 * The type Dubbo account service starter.
 */
public class DubboAccountServiceStarter {
    /**
     * 2. Account service is ready. A buyer register an account: U100001 on my e-commerce platform
```

### UtilityClassWithoutPrivateConstructor
Class `DubboBusinessTester` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboBusinessTester.java`
#### Snippet
```java
 * The type Dubbo business tester.
 */
public class DubboBusinessTester {
    /**
     * The entry point of application.
```

### UtilityClassWithoutPrivateConstructor
Class `DubboStorageServiceStarter` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboStorageServiceStarter.java`
#### Snippet
```java
 * The type Dubbo storage service starter.
 */
public class DubboStorageServiceStarter {
    /**
     * 1. Storage service is ready . A seller add 100 storage to a sku: C00321
```

### UtilityClassWithoutPrivateConstructor
Class `ReactorServer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-triple-reactor/src/main/java/org/apache/dubbo/samples/triple/reactor/ReactorServer.java`
#### Snippet
```java
import org.apache.dubbo.samples.triple.reactor.util.EmbeddedZooKeeper;

public class ReactorServer {

    private static final int PORT = 50052;
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerApp` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-protostuff/dubbo-samples-protostuff-consumer/src/main/java/org/dubbo/samples/protostuff/consumer/ConsumerApp.java`
#### Snippet
```java

@SpringBootApplication
public class ConsumerApp {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-router-chain-switch/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {


```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerApplication` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-notify/dubbo-samples-notify-consumer/src/main/java/org/apache/dubbo/samples/notify/consumer/ConsumerApplication.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `CacheProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-provider/src/main/java/org/apache/dubbo/samples/cache/CacheProvider.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class CacheProvider {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `StubProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-stub/dubbo-samples-stub-provider/src/main/java/org/apache/dubbo/samples/stub/provider/StubProvider.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class StubProvider {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StubProvider.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `App1` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-instance/src/main/java/org/apache/dubbo/samples/App1.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `App3` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-instance/src/main/java/org/apache/dubbo/samples/App3.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `App6` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-instance/src/main/java/org/apache/dubbo/samples/App6.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `App5` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-instance/src/main/java/org/apache/dubbo/samples/App5.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `RocketmqProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-rocketmq/src/main/java/org/apache/dubbo/samples/rocketmq/RocketmqProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class RocketmqProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `RocketmqConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-rocketmq/src/main/java/org/apache/dubbo/samples/rocketmq/RocketmqConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RocketmqConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `App4` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-instance/src/main/java/org/apache/dubbo/samples/App4.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `App2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-instance/src/main/java/org/apache/dubbo/samples/App2.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-autowire/dubbo-samples-autowire-consumer/src/main/java/org/apache/dubbo/samples/autowire/consumer/ConsumerBootstrap.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class ConsumerBootstrap {

    private static Logger logger = LoggerFactory.getLogger(ConsumerBootstrap.class);
```

### UtilityClassWithoutPrivateConstructor
Class `UserApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-user/src/main/java/org/apache/dubbo/samples/user/UserApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-metrics-spring-boot/src/main/java/org/apache/dubbo/samples/metrics/springboot/provider/MetricsProvider.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class MetricsProvider {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/MetricsProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MetricsProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ApplicationB2` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-rpc-advanced/dubbo-samples-rpc-advanced-app-b-v2/src/main/java/org/apache/dubbo/samples/b2/ApplicationB2.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ApplicationB2 {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeConsumer` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeConsumer2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeConsumer2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-empty-protection-nacos/src/main/java/org/apache/dubbo/samples/Main.java`
#### Snippet
```java
package org.apache.dubbo.samples;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/MetricsConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MetricsConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `HibernateProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-hibernate/dubbo-samples-spring-boot-hibernate-provider/src/main/java/org/apache/dubbo/springboot/hibernate/samples/HibernateProviderApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class HibernateProviderApplication {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) throws InterruptedException {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `AlwaysApplication` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AlwaysApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-tracing/dubbo-samples-tracing-provider/src/main/java/org/apache/dubbo/springboot/demo/provider/ProviderApplication.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) {
        new EmbeddedZooKeeper(2181, false).start();
```

### UtilityClassWithoutPrivateConstructor
Class `App` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos/src/main/java/org/apache/dubbo/samples/App.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class App {
    public static void main(String[] args) throws InterruptedException {
        App1.main(args);
```

### UtilityClassWithoutPrivateConstructor
Class `App3` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos/src/main/java/org/apache/dubbo/samples/App3.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App3 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App1` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos/src/main/java/org/apache/dubbo/samples/App1.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App1 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App6` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos/src/main/java/org/apache/dubbo/samples/App6.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App6 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App5` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos/src/main/java/org/apache/dubbo/samples/App5.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App5 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App4` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos/src/main/java/org/apache/dubbo/samples/App4.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App4 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `MergeProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MergeProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ApplicationC` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-rpc-advanced/dubbo-samples-rpc-advanced-app-c/src/main/java/org/apache/dubbo/samples/c/ApplicationC.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ApplicationC {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `App2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos/src/main/java/org/apache/dubbo/samples/App2.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App2 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App3` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-interface/src/main/java/org/apache/dubbo/samples/App3.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `App5` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-interface/src/main/java/org/apache/dubbo/samples/App5.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `App4` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-interface/src/main/java/org/apache/dubbo/samples/App4.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `ApplicationA` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-rpc-advanced/dubbo-samples-rpc-advanced-app-a/src/main/java/org/apache/dubbo/samples/a/ApplicationA.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ApplicationA {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `App2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-interface/src/main/java/org/apache/dubbo/samples/App2.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `FakeMain` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-consumer/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java
package org.apache.dubbo.samples;

public class FakeMain {
    public static void main(String[] args) {

```

### UtilityClassWithoutPrivateConstructor
Class `DetailApplicationGray` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-detail-gray/src/main/java/org/apache/dubbo/samples/detail/DetailApplicationGray.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class DetailApplicationGray {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `App1` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-interface/src/main/java/org/apache/dubbo/samples/App1.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerApplication` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-spring-boot/dubbo-samples-spring-boot-consumer/src/main/java/org/apache/dubbo/springboot/demo/consumer/ConsumerApplication.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class ConsumerApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-sentinel/dubbo-samples-sentinel-provider/src/main/java/org/apache/dubbo/samples/provider/ProviderApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `VersionProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class VersionProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `VersionConsumer` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-version/src/main/java/org/apache/dubbo/samples/version/VersionConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VersionConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `App6` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator-interface/src/main/java/org/apache/dubbo/samples/App6.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-spring-boot-tracing-skywalking/dubbo-samples-spring-boot-tracing-skwalking-provider/src/main/java/org/apache/dubbo/springboot/skywalking/demo/provider/ProviderApplication.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `VersionProvider2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider2.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class VersionProvider2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ExtensibilityFilterProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-extensibility/dubbo-samples-extensibility-filter-provider/src/main/java/org/apache/dubbo/samples/extensibility/filter/provider/ExtensibilityFilterProviderApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ExtensibilityFilterProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExtensibilityFilterProviderApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `App3` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator/src/main/java/org/apache/dubbo/samples/App3.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `App6` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator/src/main/java/org/apache/dubbo/samples/App6.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `App2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator/src/main/java/org/apache/dubbo/samples/App2.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `FakeMain` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-test-11096/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java
package org.apache.dubbo.samples;

public class FakeMain {
    public static void main(String[] args) {

```

### UtilityClassWithoutPrivateConstructor
Class `App1` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator/src/main/java/org/apache/dubbo/samples/App1.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `ExtensibilityRouterConsumerApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-extensibility/dubbo-samples-extensibility-router-consumer/src/main/java/org/apache/dubbo/samples/extensibility/router/consumer/ExtensibilityRouterConsumerApplication.java`
#### Snippet
```java

@SpringBootApplication
public class ExtensibilityRouterConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExtensibilityRouterConsumerApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `App5` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator/src/main/java/org/apache/dubbo/samples/App5.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `App4` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-curator/src/main/java/org/apache/dubbo/samples/App4.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(MetadataConstants.METADATA_PUBLISH_DELAY_KEY, "10");
```

### UtilityClassWithoutPrivateConstructor
Class `MergeProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MergeProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-rpc-basic/dubbo-samples-rpc-basic-provider/src/main/java/org/apache/dubbo/samples/provider/ProviderApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-port-unification/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    private static String zookeeperHost = System
            .getProperty("zookeeper.address", "127.0.0.1");
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-port-unification/src/main/java/org/apache/dubbo/samples/consumer/Application.java`
#### Snippet
```java
import java.util.HashMap;

public class Application {
    private static String zookeeperHost = System
            .getProperty("zookeeper.address", "127.0.0.1");
```

### UtilityClassWithoutPrivateConstructor
Class `MergeConsumer2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeConsumer2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeConsumer` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `GenericImplConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericImplConsumer.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class GenericImplConsumer {

    private static HelloService helloService;
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerApplication` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-sentinel/dubbo-samples-sentinel-consumer/src/main/java/org/apache/dubbo/samples/consumer/ConsumerApplication.java`
#### Snippet
```java

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `DubboProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicInteger;

public class DubboProvider {
    private static final String FASTJSON_SERIALIZATION = "fastjson";
    private static final String PROTOSTUFF_SERIALIZATION = "protostuff";
```

### UtilityClassWithoutPrivateConstructor
Class `OrderApplicationV1` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-order-v1/src/main/java/org/apache/dubbo/samples/order/OrderApplicationV1.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class OrderApplicationV1 {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Provider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-serialize-check/src/main/java/org/apache/dubbo/samples/Provider.java`
#### Snippet
```java
import io.dubbo.test.DemoService2Impl;

public class Provider {
    public static void main(String[] args) {
        ServiceConfig<DemoService1> serviceConfig1 = new ServiceConfig<>();
```

### UtilityClassWithoutPrivateConstructor
Class `GenericProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-type/src/main/java/org/apache/dubbo/samples/generic/GenericProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class GenericProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `GenericConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-type/src/main/java/org/apache/dubbo/samples/generic/GenericConsumer.java`
#### Snippet
```java
import java.util.Map;

public class GenericConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ExtensibilityFilterConsumerApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-extensibility/dubbo-samples-extensibility-filter-consumer/src/main/java/org/apache/dubbo/samples/extensibility/filter/consumer/ExtensibilityFilterConsumerApplication.java`
#### Snippet
```java

@SpringBootApplication
public class ExtensibilityFilterConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExtensibilityFilterConsumerApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `CacheConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-consumer/src/main/java/org/apache/dubbo/samples/cache/CacheConsumer.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo
public class CacheConsumer {
    public static void main(String[] args) {
        SpringApplication.run(CacheConsumer.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `OrderApplicationV2` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-order-v2/src/main/java/org/apache/dubbo/samples/order/OrderApplicationV2.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class OrderApplicationV2 {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-test-11558/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
import org.apache.dubbo.samples.api.GreetingsService;

public class Application {
    private static final String ZOOKEEPER_HOST = System.getProperty("zookeeper.address", "127.0.0.1");
    private static final String ZOOKEEPER_PORT = System.getProperty("zookeeper.port", "2181");
```

### UtilityClassWithoutPrivateConstructor
Class `CommentApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-comment-v1/src/main/java/org/apache/dubbo/samples/comment/CommentApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class CommentApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `FooConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java
 * </pre>
 */
public class FooConsumerBootstrap {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `FooProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/FooProviderBootstrap.java`
#### Snippet
```java
 * </pre>
 */
public class FooProviderBootstrap {

    private static final String INTERFACE_RES_KEY = FooService.class.getName();
```

### UtilityClassWithoutPrivateConstructor
Class `GenericImplProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-provider/src/main/java/org/apache/dubbo/samples/generic/call/GenericImplProvider.java`
#### Snippet
```java


public class GenericImplProvider {
    private static String zookeeperAddress = "zookeeper://" + System.getProperty("zookeeper.address", "127.0.0.1") + ":2181";

```

### UtilityClassWithoutPrivateConstructor
Class `FrontEndApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/FrontEndApplication.java`
#### Snippet
```java

@SpringBootApplication
public class FrontEndApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `App` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-instance/src/main/java/org/apache/dubbo/samples/App.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class App {
    public static void main(String[] args) throws InterruptedException {
        App1.main(args);
```

### UtilityClassWithoutPrivateConstructor
Class `App1` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-instance/src/main/java/org/apache/dubbo/samples/App1.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App1 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App6` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-instance/src/main/java/org/apache/dubbo/samples/App6.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App6 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-instance/src/main/java/org/apache/dubbo/samples/App2.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App2 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App3` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-instance/src/main/java/org/apache/dubbo/samples/App3.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App3 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `App5` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-instance/src/main/java/org/apache/dubbo/samples/App5.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App5 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `MergeProvider2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MergeProvider2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MybatisProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-mybatis/dubbo-samples-spring-boot-mybatis-provider/src/main/java/org/apache/dubbo/springboot/mybatis/samples/MybatisProviderApplication.java`
#### Snippet
```java
@EnableDubbo
@MapperScan("org.apache.dubbo.springboot.mybatis.samples.dao")
public class MybatisProviderApplication {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `CommentApplication2` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-comment-v2/src/main/java/org/apache/dubbo/samples/comment/CommentApplication2.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class CommentApplication2 {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `DubboProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-prefer-serialization/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
import java.util.concurrent.locks.LockSupport;

public class DubboProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `OrderApplicationGray` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-order-gray/src/main/java/org/apache/dubbo/samples/order/OrderApplicationGray.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class OrderApplicationGray {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeProvider2` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MergeProvider2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `DubboConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-prefer-serialization/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `App4` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-registry-test-nacos-instance/src/main/java/org/apache/dubbo/samples/App4.java`
#### Snippet
```java
import org.apache.dubbo.samples.impl.DemoService3Impl;

public class App4 {
    public static void main(String[] args) {
        FrameworkModel frameworkModel = new FrameworkModel();
```

### UtilityClassWithoutPrivateConstructor
Class `UserApplicationGray` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-user-gray/src/main/java/org/apache/dubbo/samples/user/UserApplicationGray.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class UserApplicationGray {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `GenericCallProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-provider/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class GenericCallProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderApp` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-protostuff/dubbo-samples-protostuff-provider/src/main/java/org/dubbo/samples/protostuff/provider/ProviderApp.java`
#### Snippet
```java

@SpringBootApplication
public class ProviderApp {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerApplication` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/ConsumerApplication.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ApplicationD` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-rpc-advanced/dubbo-samples-rpc-advanced-app-d/src/main/java/org/apache/dubbo/samples/d/ApplicationD.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class ApplicationD {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `DetailApplication2` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-detail-v2/src/main/java/org/apache/dubbo/samples/detail/DetailApplication2.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class DetailApplication2 {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MergeProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `FakeMain` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-test-9806/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java
package org.apache.dubbo.samples;

public class FakeMain {
    public static void main(String[] args) {

```

### UtilityClassWithoutPrivateConstructor
Class `CommentApplicationGray` has only 'static' members, and lacks a 'private' constructor
in `10-task/dubbo-samples-shop/dubbo-samples-shop-comment-gray/src/main/java/org/apache/dubbo/samples/comment/CommentApplicationGray.java`
#### Snippet
```java
@EnableDubbo
@SpringBootApplication
public class CommentApplicationGray {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/MetricsConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MetricsConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/MetricsProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MetricsProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `StartProviderAndConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/StartProviderAndConsumer.java`
#### Snippet
```java


public class StartProviderAndConsumer {
    public static void main(String[] args) {
        new EmbeddedZooKeeper(2181, false).start();
```

### UtilityClassWithoutPrivateConstructor
Class `GenericCallConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class GenericCallConsumer {

    private static GenericService genericService;
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSwitchThreadProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-switch-serialization-thread/src/main/java/org/apache/dubbo/samples/serialization/change/thread/SerializationSwitchThreadProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class SerializationSwitchThreadProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-api/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java
import org.apache.dubbo.samples.api.GreetingsService;

public class Application {
    private static final String ZOOKEEPER_HOST = System.getProperty("zookeeper.address", "127.0.0.1");
    private static final String ZOOKEEPER_PORT = System.getProperty("zookeeper.port", "2181");
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSwitchThreadConsumer` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-switch-serialization-thread/src/main/java/org/apache/dubbo/samples/serialization/change/thread/SerializationSwitchThreadConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SerializationSwitchThreadConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-api/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
import org.apache.dubbo.samples.api.GreetingsService;

public class Application {
    private static final String ZOOKEEPER_HOST = System.getProperty("zookeeper.address", "127.0.0.1");
    private static final String ZOOKEEPER_PORT = System.getProperty("zookeeper.port", "2181");
```

### UtilityClassWithoutPrivateConstructor
Class `AlwaysApplication` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-api/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
import org.apache.dubbo.samples.api.GreetingsService;

public class AlwaysApplication {
    private static final String ZOOKEEPER_HOST = System.getProperty("zookeeper.address", "127.0.0.1");
    private static final String ZOOKEEPER_PORT = System.getProperty("zookeeper.port", "2181");
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `DubboProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicInteger;

public class DubboProvider {
    private static final String FASTJSON_SERIALIZATION = "fastjson";
    private static final String JAVA_SERIALIZATION = "java";
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `UpgradeUtil` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/UpgradeUtil.java`
#### Snippet
```java
import org.apache.dubbo.rpc.model.ApplicationModel;

public class UpgradeUtil {
    private static final String DUBBO_SERVICEDISCOVERY_MIGRATION = "DUBBO_SERVICEDISCOVERY_MIGRATION";

```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `NoSimpleRegistryProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.RELEASE_KEY;

public class NoSimpleRegistryProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `NoSimpleRegistryConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.RELEASE_KEY;

public class NoSimpleRegistryConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `RouteGuideUtil` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/impl/routeguide/RouteGuideUtil.java`
#### Snippet
```java
 * Common utilities for the RouteGuide demo.
 */
public class RouteGuideUtil {
    private static final double COORD_FACTOR = 1e7;

```

### UtilityClassWithoutPrivateConstructor
Class `ZkUtil` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/ZkUtil.java`
#### Snippet
```java


public class ZkUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `ZkUtil` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/ZkUtil.java`
#### Snippet
```java


public class ZkUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `ZkUtil` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/ZkUtil.java`
#### Snippet
```java


public class ZkUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleRegistryXmlConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.RELEASE_KEY;

public class SimpleRegistryXmlConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleRegistryXmlProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.RELEASE_KEY;

public class SimpleRegistryXmlProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
import org.apache.zookeeper.CreateMode;

public class ZKTools {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
import java.util.logging.Logger;

public class BasicConsumer {

    private static DubboRouteGuideGrpc.IRouteGuide routeGuide;
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleRegistryAnnotationProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.RELEASE_KEY;

public class SimpleRegistryAnnotationProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZkUtil` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/ZkUtil.java`
#### Snippet
```java


public class ZkUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataConfigcenterConsumer` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterConsumer.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class MetadataConfigcenterConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleRegistryPropertiesConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.RELEASE_KEY;

public class SimpleRegistryPropertiesConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleRegistryAnnotationConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.RELEASE_KEY;

public class SimpleRegistryAnnotationConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataConfigcenterProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterProvider.java`
#### Snippet
```java
import static org.apache.dubbo.samples.metadatareport.configcenter.ZKTools.VERSION300;

public class MetadataConfigcenterProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleRegistryPropertiesProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
 * set -Dzookeeper.address=127.0.0.1 before run
 */
public class SimpleRegistryPropertiesProvider {

    private static final String ZOOKEEPER_ADDRESS = "zookeeper.address";
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-sc/dubbo-sc-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `MiddleEndProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-middle/src/main/java/org/apache/dubbo/samples/chain/MiddleEndProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MiddleEndProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BackendProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/BackendProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BackendProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerStarter` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/consumer/ConsumerStarter.java`
#### Snippet
```java
import org.apache.dubbo.sample.protobuf.GoogleProtobufService;

public class ConsumerStarter {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");

```

### UtilityClassWithoutPrivateConstructor
Class `ProviderStarter` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/provider/ProviderStarter.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ProviderStarter {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.PATH_SEPARATOR;

public class ZKTools {
    public static final String GLOBAL_DUBBO_PROPERTIES_PATH = "/dubbo/config/dubbo/dubbo.properties";
    public static final String CONSUMER_DUBBO_PROPERTIES_PATH = "/dubbo/config/metadatareport-configcenter-consumer/dubbo.properties";
```

### UtilityClassWithoutPrivateConstructor
Class `FrontendConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.TAG_KEY;

public class FrontendConsumer {

    private static ExecutorService executorService = Executors.newFixedThreadPool(3);
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataLocalXmlConsumer` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MetadataLocalXmlConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZkUtil` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/ZkUtil.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.PATH_SEPARATOR;

public class ZkUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataLocalXmlProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MetadataLocalXmlProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZkUtil` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/utils/ZkUtil.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.PATH_SEPARATOR;

public class ZkUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `MergeConsumer2` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeConsumer2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MergeProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeProvider2` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MergeProvider2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/sc-call-dubbo/sc-dubbo-consumer/src/main/java/org/apache/dubbo/samples/microservices/sc/Application.java`
#### Snippet
```java
@EnableDiscoveryClient
@EnableFeignClients()
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/sc-call-dubbo/sc-dubbo-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    private static String consulAddress = System.getProperty("consul.address", "127.0.0.1");

```

### UtilityClassWithoutPrivateConstructor
Class `Consumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/client/Consumer.java`
#### Snippet
```java
import org.apache.dubbo.samples.api.GreetingsService;

public class Consumer {
    private static ConfigCenterConfig configCenter = new ConfigCenterConfig();
    private static ApplicationConfig applicationConfig = new ApplicationConfig("api-dubbo-consumer");
```

### UtilityClassWithoutPrivateConstructor
Class `Provider1` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/server/Provider1.java`
#### Snippet
```java
import java.util.Map;

public class Provider1 {

    private static ConfigCenterConfig configCenter = new ConfigCenterConfig();
```

### UtilityClassWithoutPrivateConstructor
Class `GenericClient` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
import java.util.Map;

public class GenericClient {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");

```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Provider2` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/server/Provider2.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Provider2 {
    private static ConfigCenterConfig configCenter = new ConfigCenterConfig();
    private static ApplicationConfig application = new ApplicationConfig("api-dubbo-provider-2");
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ApolloProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-apollo/src/main/java/org/apache/dubbo/samples/configcenter/ApolloProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ApolloProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools2` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/ZKTools2.java`
#### Snippet
```java
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZKTools2 {
    private static CuratorFramework client;
    private static String zookeeperHost1 = System.getProperty("zookeeper.address.1", "127.0.0.1");
```

### UtilityClassWithoutPrivateConstructor
Class `ApolloConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-apollo/src/main/java/org/apache/dubbo/samples/configcenter/ApolloConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApolloConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZKTools {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/AnnotationProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class AnnotationProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/ZKTools.java`
#### Snippet
```java
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZKTools {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/AnnotationConsumer.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class AnnotationConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZKTools {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `ApolloUtil` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-apollo/src/main/java/org/apache/dubbo/samples/configcenter/ApolloUtil.java`
#### Snippet
```java
import java.util.Map;

public class ApolloUtil {

    private static final Logger logger = LoggerFactory.getLogger(ApolloUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/AnnotationConsumer.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class AnnotationConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/AnnotationProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class AnnotationProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/ZKTools.java`
#### Snippet
```java
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZKTools {
    private static CuratorFramework client;
    private static String configCenterHost = System.getProperty("config-center.address", "127.0.0.1");
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/ZKTools.java`
#### Snippet
```java
 *
 */
public class ZKTools {
    private static CuratorFramework client;

```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/provider/AnnotationProvider.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.externalconfiguration.service")
public class AnnotationProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Provider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/Provider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Provider {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/consumer/AnnotationConsumer.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.externalconfiguration.consumer")
public class AnnotationConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class ConsumerBootstrap {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ProviderBootstrap {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-provider/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ProviderBootstrap {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class ConsumerBootstrap {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-registry/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ProviderBootstrap {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
import static org.apache.dubbo.rpc.Constants.FORCE_USE_TAG;

public class BasicConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-registry/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class ConsumerBootstrap {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `NacosUtils` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
import java.util.Properties;

public class NacosUtils {
    private static String YAML = "dubbo-routers-tag.yml";
    private static String serverAddr = System.getProperty("nacos.address", "localhost");
```

### UtilityClassWithoutPrivateConstructor
Class `NacosUtils` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
import java.util.Properties;

public class NacosUtils {
    private static String serverAddr = System.getProperty("nacos.address", "localhost");
    private static String DATAID = "org.apache.dubbo.samples.governance.api.DemoService::.configurators";
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {
    static {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `NacosUtils` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/util/NacosUtils.java`
#### Snippet
```java
import java.util.Properties;

public class NacosUtils {
    public static void main(String[] args) throws Throwable {
        writeDubboProperties();
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicInteger;

public class ConsumerBootstrap {

    public static void main(String[] args) throws InterruptedException {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-provider/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ProviderBootstrap {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProviderBootstrap.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-zookeeper/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ProviderBootstrap {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `NacosUtils` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
import java.util.Properties;

public class NacosUtils {
    public static void main(String[] args) throws Throwable {
        writeAppRule();
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-kubernetes/dubbo-samples-apiserver-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class ConsumerBootstrap {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-kubernetes/dubbo-samples-apiserver-provider/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ProviderBootstrap {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-zookeeper/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class ConsumerBootstrap {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MultiRegistryProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-default-config/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryProvider.java`
#### Snippet
```java


public class MultiRegistryProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MultiRegistryConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-default-config/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java


public class MultiRegistryConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `CommonMultiRegistryProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/CommonMultiRegistryProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class CommonMultiRegistryProvider {
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
```

### UtilityClassWithoutPrivateConstructor
Class `MultiRegistryProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryProvider.java`
#### Snippet
```java


public class MultiRegistryProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `CommonMultiRegistryConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/CommonMultiRegistryConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommonMultiRegistryConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/common-multi-registry-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `MultiRegistryConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java


public class MultiRegistryConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-provider/src/main/java/org/apache/dubbo/samples/microservices/sc/Application.java`
#### Snippet
```java
@EnableDiscoveryClient
@EnableFeignClients()
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProviderOtherPort` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProviderOtherPort.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProviderOtherPort {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SslBasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-ssl/dubbo-samples-ssl-consumer/src/main/java/org/apache/dubbo/samples/basic/SslBasicConsumer.java`
#### Snippet
```java
import org.apache.dubbo.samples.basic.api.DemoService;

public class SslBasicConsumer {

    private static final String ROOT_DIR = System.getProperty("user.dir");
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
import static org.apache.dubbo.rpc.Constants.FORCE_USE_TAG;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `RuleUtil` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
import java.io.InputStream;

public class RuleUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `UpgradeUtil` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/UpgradeUtil.java`
#### Snippet
```java
import org.apache.dubbo.rpc.model.ApplicationModel;

public class UpgradeUtil {
    private static final String DUBBO_SERVICEDISCOVERY_MIGRATION = "DUBBO_SERVICEDISCOVERY_MIGRATION";

```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-provider-instance/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `ValidationProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ValidationProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SslBasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-ssl/dubbo-samples-grpc-ssl-consumer/src/main/java/org/apache/dubbo/samples/basic/SslBasicConsumer.java`
#### Snippet
```java
import static io.grpc.examples.helloworld.DubboGreeterGrpc.IGreeter;

public class SslBasicConsumer {

    private static final String ROOT_DIR = System.getProperty("user.dir");
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZKTools {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `ValidationConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationConsumer.java`
#### Snippet
```java
import java.util.Date;

public class ValidationConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class AsyncProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java
import java.util.concurrent.CompletableFuture;

public class AsyncConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Consumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-compatible/src/main/java/org/apache/dubbo/samples/compat/Consumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Provider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-compatible/src/main/java/org/apache/dubbo/samples/compat/Provider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Provider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `EchoProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-echo/src/main/java/org/apache/dubbo/samples/echo/EchoProvider.java`
#### Snippet
```java


public class EchoProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `EchoConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-echo/src/main/java/org/apache/dubbo/samples/echo/EchoConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EchoConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `VersionProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class VersionProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `VersionConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-version/src/main/java/org/apache/dubbo/samples/version/VersionConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VersionConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `VersionProvider2` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider2.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class VersionProvider2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicMonitor` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/BasicMonitor.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicMonitor {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataLocalAnnotationConsumer` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationConsumer.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class MetadataLocalAnnotationConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZkUtil` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/ZkUtil.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.PATH_SEPARATOR;

public class ZkUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataLocalPropertiesConsumer` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MetadataLocalPropertiesConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataLocalAnnotationProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MetadataLocalAnnotationProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZkUtil` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/ZkUtil.java`
#### Snippet
```java
import static org.apache.dubbo.common.constants.CommonConstants.PATH_SEPARATOR;

public class ZkUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataLocalPropertiesProvider` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class MetadataLocalPropertiesProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-sc/dubbo-sc-provider/src/main/java/org/apache/dubbo/samples/microservices/sc/Application.java`
#### Snippet
```java
@EnableDiscoveryClient
@EnableFeignClients()
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-protobuf/protobuf-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `RestProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/RestProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class RestProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `RestConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/RestConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `NonDubboRestConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/NonDubboRestConsumer.java`
#### Snippet
```java
import javax.ws.rs.core.Response;

public class NonDubboRestConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `WebserviceProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-webservice/dubbo-samples-webservice-provider/src/main/java/org/apache/dubbo/samples/webservice/provider/WebserviceProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class WebserviceProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `WebserviceConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-webservice/dubbo-samples-webservice-consumer/src/main/java/org/apache/dubbo/samples/webservice/consumer/WebserviceConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebserviceConsumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-samples-webservice-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `SpiCompatibleProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/SpiCompatibleProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class SpiCompatibleProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SpiCompatibleConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/SpiCompatibleConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpiCompatibleConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ZKTools` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZKTools {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-environment-keys/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-environment-keys/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-demo-servicediscovery-xml/servicediscovery-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-demo-servicediscovery-xml/servicediscovery-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SslBasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-ssl/dubbo-samples-grpc-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/SslBasicProvider.java`
#### Snippet
```java
import static io.grpc.examples.helloworld.DubboGreeterGrpc.IGreeter;

public class SslBasicProvider {

    private static final String ROOT_DIR = System.getProperty("user.dir");
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `HttpProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-http/src/main/java/org/apache/dubbo/samples/http/HttpProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class HttpProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `HttpConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-http/src/main/java/org/apache/dubbo/samples/http/HttpConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HttpConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ThriftConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-impl/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/ThriftConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThriftConsumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/thrift-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `ThriftProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-impl/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/ThriftProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ThriftProvider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/thrift-provider.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `Resilience4jAnnotationProvider` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Resilience4jAnnotationProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Resilience4jAnnotationConsumer` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationConsumer.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class Resilience4jAnnotationConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ConsumerApplication` has only 'static' members, and lacks a 'private' constructor
in `3-extensions/serialization/dubbo-samples-protobuf/protobuf-consumer/src/main/java/org/apache/dubbo/demo/consumer/ConsumerApplication.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-provider1/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `UpgradeUtil` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-consumer/src/main/java/org/apache/dubbo/demo/consumer/UpgradeUtil.java`
#### Snippet
```java
import org.apache.dubbo.rpc.model.ApplicationModel;

public class UpgradeUtil {
    private static final String DUBBO_SERVICEDISCOVERY_MIGRATION = "DUBBO_SERVICEDISCOVERY_MIGRATION";

```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-provider2/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-zipkin/src/main/java/org/apache/dubbo/samples/service/hello/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/hello-service.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `SslBasicProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-ssl/dubbo-samples-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/SslBasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class SslBasicProvider {

    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-zipkin/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java
import java.util.concurrent.Future;

public class Application {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-zipkin/src/main/java/org/apache/dubbo/samples/service/greeting/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/greeting-service.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-spring-hystrix/src/main/java/org/apache/dubbo/samples/annotation/AnnotationProvider.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class AnnotationProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-spring-hystrix/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumer.java`
#### Snippet
```java
import org.springframework.context.annotation.PropertySource;

public class AnnotationConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicProvider2` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/BasicProvider2.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class BasicProvider2 {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicConsumer` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderApplication` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-spring-boot-hystrix/src/main/java/org/apache/dubbo/spring/boot/provider/ProviderApplication.java`
#### Snippet
```java
@EnableHystrix
@EnableDubbo(scanBasePackages = {"org.apache.dubbo.spring.boot.provider.impl"})
public class ProviderApplication {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `RuleUtil` has only 'static' members, and lacks a 'private' constructor
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
import java.io.InputStream;

public class RuleUtil {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-consumer-old/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class AsyncProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class AsyncConsumer {
    private static Logger logger = LoggerFactory.getLogger(AsyncConsumer.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ApiProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-migration/dubbo-samples-migration-provider/src/main/java/org/apache/dubbo/migration/provider/ApiProvider.java`
#### Snippet
```java
import org.apache.dubbo.migration.api.GreeterService;

public class ApiProvider {
    public static void main(String[] args) throws InterruptedException {
        String curProtocol = System.getProperty("dubbo.current.protocol", CommonConstants.DUBBO);
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class AsyncProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java
import java.util.concurrent.CompletableFuture;

public class AsyncConsumer {

    private static final byte SIGNAL = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationProviderBootstrap` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/AnnotationProviderBootstrap.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class AnnotationProviderBootstrap {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `DubboApplication` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-docker/src/main/java/org/apache/dubbo/samples/docker/DubboApplication.java`
#### Snippet
```java
@SpringBootApplication
@ImportResource("classpath:dubbo-docker-provider.xml")
public class DubboApplication {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationConsumerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumerBootstrap.java`
#### Snippet
```java
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConsumerBootstrap {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-rest-withtoken/dubbo-samples-rest-withtoken-provider/src/main/java/org/apache/dubbo/rest/withtoken/provider/Application.java`
#### Snippet
```java
@SpringBootApplication
@EnableDubbo(scanBasePackages = {"org.apache.dubbo.rest.withtoken.provider.service.impl"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `ContextProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-context/src/main/java/org/apache/dubbo/samples/context/ContextProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ContextProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `ContextConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-context/src/main/java/org/apache/dubbo/samples/context/ContextConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MockProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/MockProvider.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MockProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/AsyncProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class AsyncProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Configurator` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/zk/Configurator.java`
#### Snippet
```java
import static org.apache.curator.framework.CuratorFrameworkFactory.newClient;

public class Configurator {
    private static CuratorFramework client;

```

### UtilityClassWithoutPrivateConstructor
Class `MockConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/MockConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MockConsumer {
    private static Logger logger = LoggerFactory.getLogger(MockConsumer.class);

```

### UtilityClassWithoutPrivateConstructor
Class `AsyncConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/AsyncConsumer.java`
#### Snippet
```java
 * CallbackConsumer
 */
public class AsyncConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class AsyncProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AsyncConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `EmbeddedAsyncProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/EmbeddedAsyncProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class EmbeddedAsyncProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `GroupConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/GroupConsumer.java`
#### Snippet
```java


public class GroupConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `GroupProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/GroupProvider.java`
#### Snippet
```java


public class GroupProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `LocalDemo` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-local/src/main/java/org/apache/dubbo/samples/local/LocalDemo.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class LocalDemo {

    public static void main(String[] args) throws InterruptedException {
```

### UtilityClassWithoutPrivateConstructor
Class `DirectConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-direct/src/main/java/org/apache/dubbo/samples/direct/DirectConsumer.java`
#### Snippet
```java


public class DirectConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `CallbackProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/CallbackProvider.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class CallbackProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `DirectProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-direct/src/main/java/org/apache/dubbo/samples/direct/DirectProvider.java`
#### Snippet
```java


public class DirectProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `CallbackConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/CallbackConsumer.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallbackConsumer {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AttachmentConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/AttachmentConsumer.java`
#### Snippet
```java


public class AttachmentConsumer {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `AttachmentProvider` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/AttachmentProvider.java`
#### Snippet
```java


public class AttachmentProvider {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `RpcContextProvider2` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/RpcContextProvider2.java`
#### Snippet
```java


public class RpcContextProvider2 {
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
```

### UtilityClassWithoutPrivateConstructor
Class `RpcContextConsumer` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/RpcContextConsumer.java`
#### Snippet
```java


public class RpcContextConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-rpccontext-consumer.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `RpcContextProvider1` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/RpcContextProvider1.java`
#### Snippet
```java


public class RpcContextProvider1 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-rpccontext-provider1.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `RpcContextUtils` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/utils/RpcContextUtils.java`
#### Snippet
```java
import org.apache.dubbo.common.constants.CommonConstants;

public class RpcContextUtils {
    public static String dubbo_protocol = CommonConstants.DUBBO;

```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-provider2/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
```

### UtilityClassWithoutPrivateConstructor
Class `Application` has only 'static' members, and lacks a 'private' constructor
in `99-integration/dubbo-samples-isolation-executor/src/main/java/org/apache/dubbo/samples/Application.java`
#### Snippet
```java
package org.apache.dubbo.samples;

public class Application {
    public static void main(String[] args) {
    }
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `startAsync()` declared in class 'org.apache.dubbo.rpc.RpcContext' but referenced via subclass 'org.apache.dubbo.rpc.RpcServiceContext'
in `99-integration/dubbo-samples-test-10704/src/main/java/org/apache/dubbo/samples/local/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHelloAsync(String name) {
        AsyncContext asyncContext = RpcServiceContext.startAsync();
        new Thread(() -> {
            asyncContext.signalContextSwitch();
```

### StaticCallOnSubclass
Static method `startAsync()` declared in class 'org.apache.dubbo.rpc.RpcContext' but referenced via subclass 'org.apache.dubbo.rpc.RpcServiceContext'
in `2-advanced/dubbo-samples-local/src/main/java/org/apache/dubbo/samples/local/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHelloAsync(String name) {
        AsyncContext asyncContext = RpcServiceContext.startAsync();
        new Thread(() -> {
            asyncContext.signalContextSwitch();
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-interface/src/main/java/org/apache/dubbo/samples/tengine/DemoService.java`
#### Snippet
```java
import java.util.Map;

public interface DemoService {;

    /**
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `longValue` may produce `NullPointerException`
in `2-advanced/dubbo-samples-seata/dubbo-samples-seata-order/src/main/java/org/apache/dubbo/samples/seata/OrderServiceImpl.java`
#### Snippet
```java
        }, keyHolder);

        order.id = keyHolder.getKey().longValue();

        LOGGER.info("Order Service End ... Created " + order);
```

### DataFlowIssue
Argument `MyEnvironmentPostProcessor.class.getResourceAsStream("/yourconfigcenter/dubbo-properties-in-configce...` might be null
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/spring/MyEnvironmentPostProcessor.java`
#### Snippet
```java
        try {
            Map<String, Object> dubboProperties = new HashMap<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(MyEnvironmentPostProcessor.class.getResourceAsStream("/yourconfigcenter/dubbo-properties-in-configcenter.properties")));
            dubboProperties.put("dubbo.properties", reader.lines().collect(Collectors.joining("\n")));
            MapPropertySource dubboPropertySource = new MapPropertySource("dubbo.properties", dubboProperties);
```

### DataFlowIssue
Argument `MyEnvironmentPostProcessor.class.getResourceAsStream("/yourconfigcenter/dubbo-properties-in-configce...` might be null
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/spring/MyEnvironmentPostProcessor.java`
#### Snippet
```java
            String appName = application.getMainApplicationClass().getSimpleName();
            if (appName.contains("consumer")) {
                appReader = new BufferedReader(new InputStreamReader(MyEnvironmentPostProcessor.class.getResourceAsStream("/yourconfigcenter/dubbo-properties-in-configcenter-consumer.properties")));
                appDubboProperties.put("configcenter-annotation-consumer.dubbo.properties", appReader.lines().collect(Collectors.joining("\n")));
                MapPropertySource appDubboPropertySource = new MapPropertySource("configcenter-annotation-consumer.dubbo.properties", appDubboProperties);
```

### DataFlowIssue
Argument `MyEnvironmentPostProcessor.class.getResourceAsStream("/yourconfigcenter/dubbo-properties-in-configce...` might be null
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/spring/MyEnvironmentPostProcessor.java`
#### Snippet
```java
                environment.getPropertySources().addLast(appDubboPropertySource);
            } else {
                appReader = new BufferedReader(new InputStreamReader(MyEnvironmentPostProcessor.class.getResourceAsStream("/yourconfigcenter/dubbo-properties-in-configcenter-provider.properties")));
                appDubboProperties.put("configcenter-annotation-provider.dubbo.properties", appReader.lines().collect(Collectors.joining("\n")));
                MapPropertySource appDubboPropertySource = new MapPropertySource("configcenter-annotation-provider.dubbo.properties", appDubboProperties);
```

### DataFlowIssue
Argument `is` might be null
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
    public static void writeAppRule() throws Throwable {
        try (InputStream is = NacosUtils.class.getClassLoader().getResourceAsStream(YAML)) {
            String content = IOUtils.toString(is);
            if (configService.publishConfig(DATAID, GROUP, content)) {
                System.out.println("write " + DATAID + ":" + GROUP + " successfully.");
```

### DataFlowIssue
Argument `is` might be null
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
    public static void writeAppRule() throws Throwable {
        try (InputStream is = NacosUtils.class.getClassLoader().getResourceAsStream("dubbo-override.yml")) {
            String content = IOUtils.toString(is);
            if (configService.publishConfig(DATAID, GROUP, content)) {
                System.out.println("write " + DATAID + ":" + GROUP + " successfully.");
```

### DataFlowIssue
Method invocation `getFile` may produce `NullPointerException`
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/util/NacosUtils.java`
#### Snippet
```java

        StringBuilder content = new StringBuilder();
        File file = new File(NacosUtils.class.getClassLoader().getResource("config-center.properties").getFile());
        try (FileReader reader = new FileReader(file)) {
            BufferedReader br = new BufferedReader(reader);
```

### DataFlowIssue
Argument `is` might be null
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java

        try (InputStream is = NacosUtils.class.getClassLoader().getResourceAsStream("dubbo-routers-condition.yml")) {
            String content = IOUtils.toString(is);
            if (configService.publishConfig(dataId, group, content)) {
                System.out.println("write " + dataId + ":" + group + " successfully.");
```

### DataFlowIssue
Argument `yamlStream` might be null
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
                client.create().creatingParentsIfNeeded().forPath(path);
            }
            setData(path, streamToString(yamlStream));
        } catch (Exception e) {
            e.printStackTrace();
```

### DataFlowIssue
The call to 'delete' always fails as an argument is out of bounds
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationConsumer.java`
#### Snippet
```java
        // Delete Error
        try {
            validationService.delete(0, "abc");
        } catch (ValidationException e) {
            System.err.println("Validation Delete ERROR");
```

### DataFlowIssue
Argument `yamlStream` might be null
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
                client.create().creatingParentsIfNeeded().forPath(path);
            }
            setData(path, streamToString(yamlStream));
        } catch (Exception e) {
            e.printStackTrace();
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `invoked` from instance context
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/spi/CompatibleFilter.java`
#### Snippet
```java
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("Filter executed!!");
        invoked = true;
        return invoker.invoke(invocation);
    }
```

## RuleId[ruleID=EmptyFinallyBlock]
### EmptyFinallyBlock
Empty `finally` block
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
                streamClient.warning("routeChat can not finish within 1 minutes");
            }
        } finally {
            //
        }
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/TriStubClient.java`
#### Snippet
```java
        final TriStubClient consumer = new TriStubClient();
        consumer.unary();
//        consumer.stream();
//        consumer.serverStream();
        System.in.read();
```

### CommentedOutCode
Commented out code (4 lines)
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java


//                cat(context);
//        dog(context);
//                tiger(context);
```

### CommentedOutCode
Commented out code (2 lines)
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
//        new EmbeddedZooKeeper(2181, false).start();
//        new EmbeddedZooKeeper(2182, false).start();

```

### CommentedOutCode
Commented out code (10 lines)
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/multi-registry-consumer.xml");
//        context.start();
//
```

### CommentedOutCode
Commented out code (2 lines)
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/impl/facade/AnnotationDrivenUserRestServiceImpl.java`
#### Snippet
```java
    public User getUser(@PathParam("id") Long id/*, @Context HttpServletRequest request*/) {
        // test context injection
//        System.out.println("Client address from @Context injection: " + (request != null ? request.getRemoteAddr() : ""));
//        System.out.println("Client address from RpcContext: " + RpcContext.getContext().getRemoteAddressString());
        return userService.getUser(id);
```

### CommentedOutCode
Commented out code (2 lines)
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/provider/impl/AnnotationServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
//        System.out.println("async provider received: " + name);
//        return "annotation: hello, " + name;
        return "Hello, " + name + "! this is annotation.";
```

### CommentedOutCode
Commented out code (15 lines)
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/provider/Resilience4jBootProviderApplication.java`
#### Snippet
```java
    }

//    @Bean
//    public HealthIndicator backendA(CircuitBreakerRegistry circuitBreakerRegistry){
//        return new CircuitBreakerHealthIndicator(circuitBreakerRegistry.circuitBreaker("backendA"));
```

### CommentedOutCode
Commented out code (4 lines)
in `2-advanced/dubbo-samples-cloud-native/dubbo-demo-servicediscovery-xml/servicediscovery-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
//        try {
//            Thread.sleep(100000);
//        } catch (Exception e) {
```

### CommentedOutCode
Commented out code (11 lines)
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationProvider.java`
#### Snippet
```java
//    @EnableAspectJAutoProxy
    static public class ProviderConfiguration {
//        @Bean
//        public ProviderConfig providerConfig() {
//            ProviderConfig providerConfig = new ProviderConfig();
```

### CommentedOutCode
Commented out code (2 lines)
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/impl/AnnotationServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
//        System.out.println("async provider received: " + name);
//        return "annotation: hello, " + name;
        return "Hello, " + name + "! this is annotation.";
```

### CommentedOutCode
Commented out code (4 lines)
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationConsumer.java`
#### Snippet
```java
    static public class ConsumerConfiguration {

//        @Bean
//        public HystrixCommandAspect hystrixCommandAspect() {
//            return new HystrixCommandAspect();
```

### CommentedOutCode
Commented out code (9 lines)
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/AsyncConsumer.java`
#### Snippet
```java
        final AsyncService asyncService = (AsyncService) context.getBean("asyncService");

//        asyncService.sayHello("world");
//        CompletableFuture<String> helloFuture = RpcContext.getContext().getCompletableFuture();
//        helloFuture.whenComplete((retValue, exception) -> {
```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `2-advanced/dubbo-samples-seata/dubbo-samples-seata-storage/src/main/java/org/apache/dubbo/samples/seata/StorageServiceImpl.java`
#### Snippet
```java

        jdbcTemplate.update("update storage_tbl set count = count - ? where commodity_code = ?",
                new Object[]{count, commodityCode});
        LOGGER.info("Storage Service End ... ");

```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/service/impl/StorageServiceImpl.java`
#### Snippet
```java

        jdbcTemplate.update("update storage_tbl set count = count - ? where commodity_code = ?",
                new Object[]{count, commodityCode});
        LOGGER.info("Storage Service End ... ");

```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/service/impl/AccountServiceImpl.java`
#### Snippet
```java
        LOGGER.info("Deducting balance SQL: update account_tbl set money = money - {} where user_id = {}", money, userId);

        jdbcTemplate.update("update account_tbl set money = money - ? where user_id = ?", new Object[]{money, userId});
        LOGGER.info("Account Service End ... ");
    }
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `2-advanced/dubbo-samples-seata/dubbo-samples-seata-account/src/main/java/org/apache/dubbo/samples/seata/AccountServiceImpl.java`
#### Snippet
```java
        LOGGER.info("Deducting balance SQL: update account_tbl set money = money - {} where user_id = {}", money, userId);

        jdbcTemplate.update("update account_tbl set money = money - ? where user_id = ?", new Object[]{money, userId});
        LOGGER.info("Account Service End ... ");
    }
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/provider/Resilience4jBootProviderApplication.java`
#### Snippet
```java

    public static void main(String[] args) throws IOException {
        SpringApplication application = new SpringApplication(new Class<?>[] { Resilience4jBootProviderApplication.class });
        application.setAdditionalProfiles("provider");
        application.run(args);
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/api/ValidationParameter.java`
#### Snippet
```java

    @NotNull(groups = ValidationService.Save.class) // disallow null when save, but allow null when update, that is: not update
    @Pattern(regexp = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")
    private String email;

```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder s` can be replaced with 'String'
in `10-task/dubbo-samples-develop/dubbo-samples-develop-provider/src/main/java/org/apache/dubbo/samples/develop/DevelopProviderServiceV2.java`
#### Snippet
```java
    public String invoke(String param) {
        // Do something
        StringBuilder s = new StringBuilder();
        s.append("ServiceV2 param:").append(param);
        return s.toString();
```

### StringBufferReplaceableByString
`StringBuilder s` can be replaced with 'String'
in `10-task/dubbo-samples-develop/dubbo-samples-develop-provider/src/main/java/org/apache/dubbo/samples/develop/DevelopProviderServiceV1.java`
#### Snippet
```java
    @Override
    public String invoke(String param) {
        StringBuilder s = new StringBuilder();
        s.append("ServiceV1 param:").append(param);
        return s.toString();
```

### StringBufferReplaceableByString
`StringBuilder s` can be replaced with 'String'
in `10-task/dubbo-samples-develop/dubbo-samples-develop-provider/src/main/java/org/apache/dubbo/samples/develop/AsyncServiceImpl.java`
#### Snippet
```java
                long time = ThreadLocalRandom.current().nextLong(1000);
                Thread.sleep(time);
                StringBuilder s = new StringBuilder();
                s.append("AsyncService asyncInvoke param:").append(param).append(",sleep:").append(time);
                return s.toString();
```

### StringBufferReplaceableByString
`StringBuilder s` can be replaced with 'String'
in `10-task/dubbo-samples-develop/dubbo-samples-develop-provider/src/main/java/org/apache/dubbo/samples/develop/AsyncServiceImpl.java`
#### Snippet
```java
            long time = ThreadLocalRandom.current().nextLong(1000);
            Thread.sleep(time);
            StringBuilder s = new StringBuilder();
            s.append("AsyncService invoke param:").append(param).append(",sleep:").append(time);
            return s.toString();
```

### StringBufferReplaceableByString
`StringBuilder s` can be replaced with 'String'
in `10-task/dubbo-samples-develop/dubbo-samples-develop-provider/src/main/java/org/apache/dubbo/samples/develop/ContextServiceImpl.java`
#### Snippet
```java
        //往客户端传递参数
        RpcContext.getServerContext().setAttachment("serverKey","serverValue");
        StringBuilder s = new StringBuilder();
        s.append("ContextService param:").append(param);
        return s.toString();
```

### StringBufferReplaceableByString
`StringBuilder stringBuilder` can be replaced with 'String'
in `10-task/dubbo-samples-rpc-advanced/dubbo-samples-rpc-advanced-app-b-v2/src/main/java/org/apache/dubbo/samples/b2/ServiceBImpl.java`
#### Snippet
```java
            Thread.currentThread().interrupt();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ").append(name).append(". ")
                .append("I am App B from ").append(localHost).append(".\n");
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                e.printStackTrace();
            } catch (CircuitBreakerOpenException t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
            } catch (Throwable t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                System.err.println("== " + l + ":" + i + " " + t.toString());
            } catch (Throwable t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                e.printStackTrace();
            } catch (CircuitBreakerOpenException t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
            } catch (Throwable t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                System.err.println("== " + l + ":" + i + " " + t.toString());
            } catch (Throwable t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
            }
        }
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java

    public static void generateAppLevelOverride(int weight1, int weight2) {
        String str = "" +
                "# Execute on governance-appoverride-provider.\n" +
                "# This will take effect on all services in governance-appoverride-provider.\n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java

    public static void generateServiceLevelOverride(long timeout) {
        String str = "" +
                "# All Consumers that consume the service org.apache.dubbo.samples.governance.api.DemoService will increase the timeout value to 6000\n" +
                "---\n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java

    public static void generateApplicationLevelOverride(long timeout) {
        String str = "" +
                "# All Consumers that consume the service org.apache.dubbo.samples.governance.api.DemoService will increase the timeout value to 6000\n" +
                "---\n" +
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super T`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/util/StreamObserverAdapter.java`
#### Snippet
```java
    private final io.grpc.stub.StreamObserver<T> delegate;

    public StreamObserverAdapter(io.grpc.stub.StreamObserver<T> delegate) {
        this.delegate = delegate;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/util/GrpcStreamObserverAdapter.java`
#### Snippet
```java
    private final org.apache.dubbo.common.stream.StreamObserver<T> delegate;

    public GrpcStreamObserverAdapter(org.apache.dubbo.common.stream.StreamObserver<T> delegate) {
        this.delegate = delegate;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/util/EchoStreamObserver.java`
#### Snippet
```java
    private final StreamObserver<R> responseObserver;

    public EchoStreamObserver(Function<T, R> echoFunc, StreamObserver<R> responseObserver) {
        this.echoFunc = echoFunc;
        this.responseObserver = responseObserver;
```

### BoundedWildcard
Can generalize to `? extends R`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/util/EchoStreamObserver.java`
#### Snippet
```java
    private final StreamObserver<R> responseObserver;

    public EchoStreamObserver(Function<T, R> echoFunc, StreamObserver<R> responseObserver) {
        this.echoFunc = echoFunc;
        this.responseObserver = responseObserver;
```

### BoundedWildcard
Can generalize to `? super R`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/util/EchoStreamObserver.java`
#### Snippet
```java
    private final StreamObserver<R> responseObserver;

    public EchoStreamObserver(Function<T, R> echoFunc, StreamObserver<R> responseObserver) {
        this.echoFunc = echoFunc;
        this.responseObserver = responseObserver;
```

### BoundedWildcard
Can generalize to `? super String`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/pojo/PojoGreeterImpl.java`
#### Snippet
```java

    @Override
    public StreamObserver<String> greetStreamError(StreamObserver<String> response) {
        response.onError(new Throwable("ServerStream error"));
        return new EchoStreamObserver<>(str -> "hello," + str, response);
```

### BoundedWildcard
Can generalize to `? super String`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/pojo/PojoGreeterImpl.java`
#### Snippet
```java

    @Override
    public StreamObserver<String> greetStream(StreamObserver<String> response) {
        return new StreamObserver<String>() {
            @Override
```

### BoundedWildcard
Can generalize to `? super String`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/pojo/PojoGreeterImpl.java`
#### Snippet
```java

    @Override
    public void greetServerStream(String request, StreamObserver<String> response) {
        for (int i = 0; i < 10; i++) {
            response.onNext("hello," + request);
```

### BoundedWildcard
Can generalize to `? super String`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/IGreeterImpl.java`
#### Snippet
```java

    @Override
    public StreamObserver<String> sayHelloStream(StreamObserver<String> response) {
        return new EchoStreamObserver<>(str -> "hello," + str, response);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/IGreeterImpl.java`
#### Snippet
```java

    @Override
    public StreamObserver<String> sayHelloStreamError(StreamObserver<String> response) {
        response.onError(new Throwable("ServerStream error"));
        return new EchoStreamObserver<>(str -> "hello," + str, response);
```

### BoundedWildcard
Can generalize to `? super String`
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/IGreeterImpl.java`
#### Snippet
```java

    @Override
    public void sayHelloServerStream(String request, StreamObserver<String> response) {
        for (int i = 0; i < 10; i++) {
            response.onNext("hello," + request);
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
    @EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.simplified.annotation.impl")
    @PropertySource("classpath:/spring/dubbo-provider.properties")
    static public class ProviderConfiguration {
        @Value("zookeeper://${zookeeper.address:127.0.0.1}:${zookeeper.port:2181}")
        private String zookeeperAddress;
```

### MissortedModifiers
Missorted modifiers `static public`
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterConsumer.java`
#### Snippet
```java
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = {"org.apache.dubbo.samples.metadatareport.configcenter.action"})
    static public class ConsumerConfiguration {

    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = {"org.apache.dubbo.samples.simplified.annotation.action"})
    static public class ConsumerConfiguration {
        @Value("zookeeper://${zookeeper.address:127.0.0.1}:${zookeeper.port:2181}")
        private String zookeeperAddress;
```

### MissortedModifiers
Missorted modifiers `static public`
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterProvider.java`
#### Snippet
```java
    @EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.metadatareport.configcenter.impl")
    @PropertySource("classpath:/spring/dubbo-provider.properties")
    static public class ProviderConfiguration {
        @Bean
        public ProviderConfig providerConfig() {
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/AnnotationProvider.java`
#### Snippet
```java
    @EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.configcenter.annotation.impl")
    @PropertySource("classpath:/spring/dubbo-provider.properties")
    static public class ProviderConfiguration {
        @Bean
        public ProviderConfig providerConfig() {
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/AnnotationConsumer.java`
#### Snippet
```java
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = {"org.apache.dubbo.samples.configcenter.annotation.action"})
    static public class ConsumerConfiguration {

    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/AnnotationConsumer.java`
#### Snippet
```java
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = {"org.apache.dubbo.samples.configcenter.multiregistries.action"})
    static public class ConsumerConfiguration {

    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/AnnotationProvider.java`
#### Snippet
```java
    @EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.configcenter.multiregistries.impl")
    @PropertySource("classpath:/spring/dubbo-provider.properties")
    static public class ProviderConfiguration {
        @Bean
        public ProviderConfig providerConfig() {
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/provider/AnnotationProvider.java`
#### Snippet
```java

    @Configuration
    static public class ProviderConfiguration {

        /**
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/consumer/AnnotationConsumer.java`
#### Snippet
```java

    @Configuration
    static public class ConsumerConfiguration {

        /**
```

### MissortedModifiers
Missorted modifiers `static public`
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationConsumer.java`
#### Snippet
```java
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = {"org.apache.dubbo.samples.metadatareport.local.annotation.action"})
    static public class ConsumerConfiguration {
        @Value("zookeeper://${zookeeper.address:127.0.0.1}:2181")
        private String zookeeperAddress;
```

### MissortedModifiers
Missorted modifiers `static public`
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationProvider.java`
#### Snippet
```java
    @EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.metadatareport.local.annotation.impl")
    @PropertySource("classpath:/spring/dubbo-provider.properties")
    static public class ProviderConfiguration {
        @Value("zookeeper://${zookeeper.address:127.0.0.1}:2181")
        private String zookeeperAddress;
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/RestProvider.java`
#### Snippet
```java
    @Configuration
    @EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.rest.impl.facade")
    static public class ProviderConfiguration {

    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationProvider.java`
#### Snippet
```java
    @PropertySource("classpath:/spring/dubbo-provider.properties")
//    @EnableAspectJAutoProxy
    static public class ProviderConfiguration {
//        @Bean
//        public ProviderConfig providerConfig() {
```

### MissortedModifiers
Missorted modifiers `static public`
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationConsumer.java`
#### Snippet
```java
    @ComponentScan(value = {"org.apache.dubbo.samples.resilience4j.action"})
    @EnableAspectJAutoProxy
    static public class ConsumerConfiguration {

//        @Bean
```

### MissortedModifiers
Missorted modifiers `static public`
in `4-governance/dubbo-samples-spring-hystrix/src/main/java/org/apache/dubbo/samples/annotation/AnnotationProvider.java`
#### Snippet
```java
    @PropertySource("classpath:/spring/hystrix-dubbo-provider.properties")
    @EnableAspectJAutoProxy
    static public class ProviderConfiguration {
        @Bean
        public ProviderConfig providerConfig() {
```

### MissortedModifiers
Missorted modifiers `static public`
in `4-governance/dubbo-samples-spring-hystrix/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumer.java`
#### Snippet
```java
    @ComponentScan(value = {"org.apache.dubbo.samples.annotation.action"})
    @EnableAspectJAutoProxy
    static public class ConsumerConfiguration {

        @Bean
```

## RuleId[ruleID=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `Map`
in `99-integration/dubbo-samples-serialize-check/src/main/java/io/dubbo/test/DemoService2Impl.java`
#### Snippet
```java
    @Override
    public void sendNotSerializable(NotSerializable notSerializable) {
        if (notSerializable instanceof Map) {
            throw new IllegalArgumentException();
        }
```

### InstanceofIncompatibleInterface
'instanceof' incompatible interface `Map`
in `99-integration/dubbo-samples-serialize-check/src/main/java/org/apache/dubbo/samples/DemoService1Impl.java`
#### Snippet
```java
    @Override
    public void sendNotSerializable(NotSerializable notSerializable) {
        if (notSerializable instanceof Map) {
            throw new IllegalArgumentException();
        }
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Math.pow()` is ignored
in `10-task/dubbo-samples-shop/dubbo-samples-shop-detail-v1/src/main/java/org/apache/dubbo/samples/detail/DetailServiceImpl.java`
#### Snippet
```java
            // Do something that consumes resources
            for (int i = 0; i < 500; i++) {
                Math.pow(ThreadLocalRandom.current().nextDouble(10), ThreadLocalRandom.current().nextDouble(5));
            }
            Thread.sleep(ThreadLocalRandom.current().nextInt(50));
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/pojo/TriPojoServer.java`
#### Snippet
```java
        server.initialize();
        server.start();
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/TriStubServer.java`
#### Snippet
```java
        server.start();
        System.out.println("Dubbo triple stub server started, port=" + TriSampleConstants.SERVER_PORT);
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/manual/TriManualServer.java`
#### Snippet
```java
        server.initialize();
        server.start();
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/pojo/TriPojoClient.java`
#### Snippet
```java
        consumer.greetStream();
        consumer.greetServerStream();
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/generic/GenericServer.java`
#### Snippet
```java
        server.initialize();
        server.start();
        System.in.read();
    }
}
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/TriStubClient.java`
#### Snippet
```java
//        consumer.stream();
//        consumer.serverStream();
        System.in.read();
    }
}
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/client/TriOpClient.java`
#### Snippet
```java
        consumer.stream();
        consumer.serverStream();
        System.in.read();
    }
}
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/manual/TriManualClient.java`
#### Snippet
```java
        consumer.stream();
        consumer.serverStream();
        System.in.read();
    }
}
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/generic/GenericClient.java`
#### Snippet
```java
        LOGGER.info("dubbo triple generic consumer started");
        consumer.greetUnary();
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/server/TriOpServer.java`
#### Snippet
```java
        triStubServer.initialize();
        triStubServer.start();
        System.in.read();
    }
}
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/metadata/TriMetadataClient.java`
#### Snippet
```java
        consumer.stream();
        consumer.serverStream();
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/metadata/TriMetadataServer.java`
#### Snippet
```java
        server.initialize();
        server.start();
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/server/GrpcClient.java`
#### Snippet
```java
        client.stream();
        client.serverStream();
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/client/GrpcServer.java`
#### Snippet
```java
        server.initialize();
        server.start();
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-triple-reactor/src/main/java/org/apache/dubbo/samples/triple/reactor/ReactorConsumer.java`
#### Snippet
```java
        reactorConsumer.consumeManyToOne();
        reactorConsumer.consumeManyToMany();
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `Math.pow()` is ignored
in `10-task/dubbo-samples-shop/dubbo-samples-shop-user/src/main/java/org/apache/dubbo/samples/user/UserServiceImpl.java`
#### Snippet
```java
        // Do something that consumes resources
        for (int i = 0; i < 100; i++) {
            Math.pow(ThreadLocalRandom.current().nextDouble(10), ThreadLocalRandom.current().nextDouble(5));
        }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java
        String message = greetingsService.sayHi("dubbo");
        System.out.println("Receive result ======> " + message);
        System.in.read();
        System.exit(0);
    }
```

### IgnoreResultOfCall
Result of `Math.pow()` is ignored
in `10-task/dubbo-samples-shop/dubbo-samples-shop-detail-gray/src/main/java/org/apache/dubbo/samples/detail/DetailServiceImplGray.java`
#### Snippet
```java
            // Do something that consumes resources
            for (int i = 0; i < 500; i++) {
                Math.pow(ThreadLocalRandom.current().nextDouble(10), ThreadLocalRandom.current().nextDouble(5));
            }
            Thread.sleep(ThreadLocalRandom.current().nextInt(50));
```

### IgnoreResultOfCall
Result of `Math.pow()` is ignored
in `10-task/dubbo-samples-shop/dubbo-samples-shop-user-gray/src/main/java/org/apache/dubbo/samples/user/UserServiceImplGray.java`
#### Snippet
```java
        // Do something that consumes resources
        for (int i = 0; i < 100; i++) {
            Math.pow(ThreadLocalRandom.current().nextDouble(10), ThreadLocalRandom.current().nextDouble(5));
        }

```

### IgnoreResultOfCall
Result of `Math.pow()` is ignored
in `10-task/dubbo-samples-shop/dubbo-samples-shop-detail-v2/src/main/java/org/apache/dubbo/samples/detail/DetailServiceImpl2.java`
#### Snippet
```java
            // Do something that consumes resources
            for (int i = 0; i < 500; i++) {
                Math.pow(ThreadLocalRandom.current().nextDouble(10), ThreadLocalRandom.current().nextDouble(5));
            }
            Thread.sleep(ThreadLocalRandom.current().nextInt(50));
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `1-basic/dubbo-samples-api/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java
        String message = service.sayHi("dubbo");
        System.out.println("Receive result ======> " + message);
        System.in.read();
        System.exit(0);
    }
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        }
        System.out.println("-------- End stream call test -------- \n");
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
        configuratorsApp();

        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/server/Provider1.java`
#### Snippet
```java
        service.export();
        System.out.println("dubbo service started");
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
        initClient();
        generateRule();
        System.in.read();
        deleteRule();
    }
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
    private static String streamToString(InputStream stream) throws IOException {
        byte[] bytes = new byte[stream.available()];
        stream.read(bytes);
        return new String(bytes);
    }
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/RestConsumer.java`
#### Snippet
```java
        RpcContext.getContext().setAttachment("clientImpl", "dubbo");
        System.out.println("SUCCESS: got user " + userService.getUser(1L));
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `2-advanced/dubbo-samples-environment-keys/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java

        System.out.println("dubbo service started");
        System.in.read();
    }

```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        System.out.println("-------- End simple unary call test -------- \n\n\n");

        System.in.read();
    }
}
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        System.out.println("-------- End simple unary call test -------- \n\n\n");

        System.in.read();
    }
}
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `3-extensions/serialization/dubbo-samples-protobuf/protobuf-consumer/src/main/java/org/apache/dubbo/demo/consumer/ConsumerApplication.java`
#### Snippet
```java
        HelloReply reply = demoService.sayHello(request);
        System.out.println("result: " + reply.getMessage());
        System.in.read();
    }
}
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
        initClient();
        generateRule();
        System.in.read();
        deleteRule();
    }
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
    private static String streamToString(InputStream stream) throws IOException {
        byte[] bytes = new byte[stream.available()];
        stream.read(bytes);
        return new String(bytes);
    }
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/MockProvider.java`
#### Snippet
```java
        System.out.println("dubbo service started");
        // press any key to exit
        System.in.read();
    }
}
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/AsyncConsumer.java`
#### Snippet
```java
        helloFuture.get();

        System.in.read();
    }

```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/impl/routeguide/RouteGuideUtil.java`
#### Snippet
```java
        InputStream input = file.openStream();
        try {
            Reader reader = new InputStreamReader(input, Charset.forName("UTF-8"));
            try {
                FeatureDatabase.Builder database = FeatureDatabase.newBuilder();
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            System.out.println("get key = " + key + ", value = " + value);
            if (key.equals("args")) {
                params = URLEncodedUtils.parse((String)value, Charset.forName("UTF-8"));
            } else if (key.equals("method")) {
                method = (String)value;
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-provider/src/main/java/org/apache/dubbo/samples/develop/ContextServiceImpl.java`
#### Snippet
```java
        //ServerAttachment接收客户端传递过来的 参数
        Map<String, Object> serverAttachments = RpcContext.getServerAttachment().getObjectAttachments();
        System.out.println("ContextService serverAttachments:" + JSON.toJSONString(serverAttachments));
        //往客户端传递参数
        RpcContext.getServerContext().setAttachment("serverKey","serverValue");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-spring-boot3-tracing/dubbo-samples-spring-boot3-tracing-provider/src/main/java/org/apache/dubbo/springboot/demo/provider/ProviderApplication.java`
#### Snippet
```java
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("dubbo service started");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-rpc-basic/dubbo-samples-rpc-basic-consumer/src/main/java/org/apache/dubbo/samples/consumer/ConsumerApplication.java`
#### Snippet
```java
        public void run(String... args) throws Exception {
            // will print "hello, dubbo"
            System.out.println("Dubbo Remote Return ======> " + demoService.sayHello("dubbo"));
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-consul/src/main/java/org/apache/dubbo/samples/consul/ConsulConsumer.java`
#### Snippet
```java
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("consul");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-consul/src/main/java/org/apache/dubbo/samples/consul/ConsulProvider.java`
#### Snippet
```java
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java

        MergeService mergeService = (MergeService) context.getBean("mergeService");
        System.out.println(mergeService.mergeResult());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java

        MergeService mergeService = (MergeService) context.getBean("mergeService");
        System.out.println(mergeService.mergeResult());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-serialization/dubbo-samples-serialization-java/src/main/java/org/apache/dubbo/samples/serialization/DubboProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        System.out.println("Java serialization is unsafe. Dubbo Team do not recommend anyone to use it." +
                "If you still want to use it, please follow [JEP 290](https://openjdk.java.net/jeps/290)" +
                "to set serialization filter to prevent deserialization leak.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-serialization/dubbo-samples-serialization-java/src/main/java/org/apache/dubbo/samples/serialization/DubboProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-serialization/dubbo-samples-serialization-java/src/main/java/org/apache/dubbo/samples/serialization/DubboConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-registry-test-nacos-interface/src/main/java/org/apache/dubbo/samples/App.java`
#### Snippet
```java
        App6.main(args);

        System.out.println("All apps started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-serialization/dubbo-samples-serialization-java/src/main/java/org/apache/dubbo/samples/serialization/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java
            try {
                String message = service.sayHello("dubbo");
                System.out.println("Success: " + message);
            } catch (RuntimeException ex) {
                if (ex.getMessage().contains("SentinelBlockException: FlowException")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java
            } catch (RuntimeException ex) {
                if (ex.getMessage().contains("SentinelBlockException: FlowException")) {
                    System.out.println("Blocked");
                }
                else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/FooProviderBootstrap.java`
#### Snippet
```java
        context.refresh();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-port-unification-netty3/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
                .start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-empty-protection/src/main/java/org/apache/dubbo/samples/Main.java`
#### Snippet
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-test-10704/src/main/java/org/apache/dubbo/samples/local/LocalDemo.java`
#### Snippet
```java
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo.xml");
        context.start();
        System.out.println("dubbo service started");

        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-test-10704/src/main/java/org/apache/dubbo/samples/local/LocalDemo.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world");
        System.out.println(hello);
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-test-10704/src/main/java/org/apache/dubbo/samples/local/impl/DemoServiceImpl.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/TriStubServer.java`
#### Snippet
```java
        server.initialize();
        server.start();
        System.out.println("Dubbo triple stub server started, port=" + TriSampleConstants.SERVER_PORT);
        System.in.read();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/pojo/PojoGreeterImpl.java`
#### Snippet
```java
    @Override
    public String methodParamIsNull(String request) {
        System.out.println("methodParamIsNull request:" + request);
        assert request == null;
        return "ok";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationTriConsumer.java`
#### Snippet
```java

    public void sayTriHelloUnary(String protocol) {
        System.out.println(triDelegate.sayHello("unary" + "--" + protocol));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationTriConsumer.java`
#### Snippet
```java
    public static void main(String[] args) {
        final ApiMigrationTriConsumer consumer = new ApiMigrationTriConsumer();
        System.out.println("demo-migration-both-consumer started");
        consumer.sayTriHelloUnary(CommonConstants.TRIPLE);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationDubboConsumer.java`
#### Snippet
```java

    public void sayHelloUnary(String protocol) {
        System.out.println(delegate.sayHello("unary" + "--" + protocol));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationDubboConsumer.java`
#### Snippet
```java
    public static void main(String[] args) {
        final ApiMigrationDubboConsumer consumer = new ApiMigrationDubboConsumer();
        System.out.println("demo-migration-dubbo-consumer dubbo started");
        consumer.sayHelloUnary(CommonConstants.DUBBO_PROTOCOL);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationBothConsumer.java`
#### Snippet
```java
    public static void main(String[] args) {
        final ApiMigrationBothConsumer consumer = new ApiMigrationBothConsumer();
        System.out.println("demo-migration-both-consumer started");
        consumer.sayHelloUnary(CommonConstants.DUBBO_PROTOCOL);
        consumer.sayTriHelloUnary(CommonConstants.TRIPLE);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationBothConsumer.java`
#### Snippet
```java

    public void sayHelloUnary(String protocol) {
        System.out.println(dubboDelegate.sayHello("unary" + "--" + protocol));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/ApiMigrationBothConsumer.java`
#### Snippet
```java

    public void sayTriHelloUnary(String protocol) {
        System.out.println(triDelegate.sayHello("unary" + "--" + protocol));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/IGreeterImpl.java`
#### Snippet
```java
    @Override
    public void sayHelloResponseVoid(String request) {
        System.out.println("call void response");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/IGreeterImpl.java`
#### Snippet
```java
    @Override
    public String sayHelloWithAttachment(String request) {
        System.out.println(RpcContext.getServerAttachment().getObjectAttachments());
        RpcContext.getServerContext().setAttachment("str", "str")
                .setAttachment("integer", 1)
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/migration/IGreeterImpl.java`
#### Snippet
```java
    @Override
    public String sayHelloRequestVoid() {
        System.out.println("call void request");
        return "hello!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboOrderServiceStarter.java`
#### Snippet
```java
        orderContext.getBean("service");

        System.out.println("order service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboAccountServiceStarter.java`
#### Snippet
```java
        accountJdbcTemplate.update("insert into account_tbl(user_id, money) values ('U100001', 999)");

        System.out.println("account service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-transaction/src/main/java/org/apache/dubbo/samples/starter/DubboStorageServiceStarter.java`
#### Snippet
```java
        storageJdbcTemplate.update("insert into storage_tbl(commodity_code, count) values ('C00321', 100)");

        System.out.println("storage service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/GreeterImpl.java`
#### Snippet
```java
            long nextDiff = onNextEnd - start;
            long sleepDiff = sleepEnd - onNextEnd;
            System.out.println("onNext diff:" + nextDiff + " sleep diff:" + sleepDiff);
        }
        replyStream.onCompleted();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-router-chain-switch/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
        }

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-notify/dubbo-samples-notify-consumer/src/main/java/org/apache/dubbo/samples/notify/consumer/NotifyImpl.java`
#### Snippet
```java
    @Override
    public void onInvoke(int id) {
        System.out.println("onInvoke: " + id);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-notify/dubbo-samples-notify-consumer/src/main/java/org/apache/dubbo/samples/notify/consumer/NotifyImpl.java`
#### Snippet
```java
    public void onThrow(Throwable ex, int id) {
        ret.put(id, ex);
        System.out.println("onThrow: " + ex);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-notify/dubbo-samples-notify-consumer/src/main/java/org/apache/dubbo/samples/notify/consumer/NotifyImpl.java`
#### Snippet
```java
    public void onReturn(String name, int id) {
        ret.put(id, name);
        System.out.println("onReturn: " + name);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-notify/dubbo-samples-notify-consumer/src/main/java/org/apache/dubbo/samples/notify/consumer/Task.java`
#### Snippet
```java
        }

        System.out.println("result: " + notify.ret.get(id));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-stub/dubbo-samples-stub-provider/src/main/java/org/apache/dubbo/samples/stub/provider/StubProvider.java`
#### Snippet
```java
        SpringApplication.run(StubProvider.class, args);

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rocketmq/src/main/java/org/apache/dubbo/samples/rocketmq/RocketmqProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rocketmq/src/main/java/org/apache/dubbo/samples/rocketmq/impl/DemoServiceImpl.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
            ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rocketmq/src/main/java/org/apache/dubbo/samples/rocketmq/RocketmqConsumer.java`
#### Snippet
```java
        DemoService demoService = (DemoService) context.getBean("demoService");
        String result = demoService.sayHello("world");
        System.out.println(result);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics-spring-boot/src/main/java/org/apache/dubbo/samples/metrics/springboot/provider/MetricsProvider.java`
#### Snippet
```java
        System.setProperty("spring.profiles.active", "provider");
        SpringApplication.run(MetricsProvider.class, args);
        System.out.println("dubbo service started");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/MetricsProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java

        MergeService mergeService = (MergeService) context.getBean("mergeService");
        System.out.println(mergeService.mergeResult());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java

        MergeService mergeService = (MergeService) context.getBean("mergeService");
        System.out.println(mergeService.mergeResult());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-shop/dubbo-samples-shop-user/src/main/java/org/apache/dubbo/samples/user/UserServiceImpl.java`
#### Snippet
```java
    @Override
    public User getInfo(String username) {
        System.out.println("Received getInfo request......");
        try {
            if (++count % 3 != 0) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-empty-protection-nacos/src/main/java/org/apache/dubbo/samples/Main.java`
#### Snippet
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/MetricsConsumer.java`
#### Snippet
```java
                Thread.sleep(3000);
                Result hello = demoService.sayHello("world");
                System.out.println(hello.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-hibernate/dubbo-samples-spring-boot-hibernate-provider/src/main/java/org/apache/dubbo/springboot/hibernate/samples/HibernateProviderApplication.java`
#### Snippet
```java
        new EmbeddedZooKeeper(2181, false).start();
        SpringApplication.run(HibernateProviderApplication.class, args);
        System.out.println("dubbo service started");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        // to hang up main thread
        new CountDownLatch(1).await();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java

        String message = greetingsService.sayHi("dubbo");
        System.out.println("Receive result ======> " + message);
        System.in.read();
        System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
            try {
                String message = greetingsService.sayHi("dubbo");
                System.out.println(new Date() + " Receive result ======> " + message);
                Thread.sleep(1000);
            } catch (Throwable t) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-tracing/dubbo-samples-tracing-provider/src/main/java/org/apache/dubbo/springboot/demo/provider/ProviderApplication.java`
#### Snippet
```java

        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("dubbo service started");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-registry-test-nacos/src/main/java/org/apache/dubbo/samples/App.java`
#### Snippet
```java
        App6.main(args);

        System.out.println("All apps started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-version/src/main/java/org/apache/dubbo/samples/version/VersionConsumer.java`
#### Snippet
```java
        for (int i = 0; i < 10000; i++) {
            String hello = versionService.sayHello("world");
            System.out.println(hello);
            Thread.sleep(2000);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-spring-boot-tracing-skywalking/dubbo-samples-spring-boot-tracing-skwalking-provider/src/main/java/org/apache/dubbo/springboot/skywalking/demo/provider/ProviderApplication.java`
#### Snippet
```java
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("dubbo service started");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider2.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-spring-boot/dubbo-samples-spring-boot-consumer/src/main/java/org/apache/dubbo/springboot/demo/consumer/Task.java`
#### Snippet
```java
    public void run(String... args) throws Exception {
        String result = demoService.sayHello("world");
        System.out.println("Receive result ======> " + result);

        new Thread(()-> {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-spring-boot/dubbo-samples-spring-boot-consumer/src/main/java/org/apache/dubbo/springboot/demo/consumer/Task.java`
#### Snippet
```java
                try {
                    Thread.sleep(1000);
                    System.out.println(new Date() + " Receive result ======> " + demoService.sayHello("world"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-extensibility/dubbo-samples-extensibility-router-consumer/src/main/java/org/apache/dubbo/samples/extensibility/router/consumer/ExtensibilityRouterConsumerTask.java`
#### Snippet
```java
    @Override
    public void run(String... args) {
        System.out.println("Dubbo Remote Return ======> " + this.extensibilityRouterService.sayHello("dubbo"));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-hibernate/dubbo-samples-spring-boot-hibernate-consumer/src/main/java/org/apache/dubbo/springboot/hibernate/samples/HibernateConsumerApplication.java`
#### Snippet
```java
        HibernateConsumerApplication application = context.getBean(HibernateConsumerApplication.class);
        List<User> userList = application.findAll();
        System.out.println("result: " + userList);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-port-unification/src/main/java/org/apache/dubbo/samples/provider/Application.java`
#### Snippet
```java
        service.export();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-port-unification/src/main/java/org/apache/dubbo/samples/consumer/Application.java`
#### Snippet
```java
            GreetingService service = reference.get();
            String message = service.sayHi(this.protocol);
            System.out.println(message);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java

        MergeService mergeService = (MergeService) context.getBean("mergeService");
        System.out.println(mergeService.mergeResult());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericImplConsumer.java`
#### Snippet
```java
        CompletableFuture<String> future = helloService.sayHelloAsync("world");
        future.whenComplete((v, t) -> {
            System.out.println(v);
            latch.countDown();
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-nacos-merge/dubbo-samples-nacos-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java

        MergeService mergeService = (MergeService) context.getBean("mergeService");
        System.out.println(mergeService.mergeResult());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericImplConsumer.java`
#### Snippet
```java
        try {
            String syncCallResult = helloService.sayHello("world");
            System.out.println(syncCallResult);
        } catch (Exception e) {
            e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "1.0.0");
        System.out.println("1.0.0 service exported");

        // protocol config set serialization as protostuff, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "2.0.0");
        System.out.println("2.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "3.0.0");
        System.out.println("3.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as protostuff
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "4.0.0");
        System.out.println("4.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                PROTOSTUFF_SERIALIZATION,
                "5.0.0");
        System.out.println("5.0.0 service exported");

        // protocol config set serialization as protostuff, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "6.0.0");
        System.out.println("6.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as protostuff
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                FASTJSON_SERIALIZATION,
                "7.0.0");
        System.out.println("7.0.0 service exported");

        // protocol config set serialization as protostuff, prefer serialization is set as fastjson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "8.0.0");
        System.out.println("8.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "9.0.0");
        System.out.println("9.0.0 service exported");

        // protocol config set serialization as fastjson, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                PROTOSTUFF_SERIALIZATION,
                "10.0.0");
        System.out.println("10.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as fastjson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "11.0.0");
        System.out.println("11.0.0 service exported");

        // protocol config set serialization as gson, prefer serialization is set as fastjson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "12.0.0");
        System.out.println("12.0.0 service exported");

        // protocol config set serialization as gson, prefer serialization is set as fastjson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                PROTOSTUFF_SERIALIZATION,
                "13.0.0");
        System.out.println("13.0.0 service exported");

        // protocol config set serialization as gson, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                PROTOSTUFF_SERIALIZATION,
                "14.0.0");
        System.out.println("14.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as gson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                PROTOSTUFF_SERIALIZATION,
                "15.0.0");
        System.out.println("15.0.0 service exported");

        // protocol config set serialization as fst, prefer serialization is set as gson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                PROTOSTUFF_SERIALIZATION,
                "16.0.0");
        System.out.println("16.0.0 service exported");

        System.out.println("dubbo service started");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
        System.out.println("16.0.0 service exported");

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-type/src/main/java/org/apache/dubbo/samples/generic/GenericProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-type/src/main/java/org/apache/dubbo/samples/generic/GenericConsumer.java`
#### Snippet
```java
        User user = userService.get(params);

        System.out.println(user);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-extensibility/dubbo-samples-extensibility-filter-consumer/src/main/java/org/apache/dubbo/samples/extensibility/filter/consumer/ExtensibilityFilterConsumerTask.java`
#### Snippet
```java
    @Override
    public void run(String... args) {
        System.out.println("Dubbo Remote Return ======> " + this.extensibilityFilterService.sayHello("dubbo"));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java
            try {
                String message = service.sayHello("dubbo");
                System.out.println("Success: " + message);
            } catch (RuntimeException ex) {
                if (ex.getMessage().contains("SentinelBlockException: FlowException")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java
            } catch (RuntimeException ex) {
                if (ex.getMessage().contains("SentinelBlockException: FlowException")) {
                    System.out.println("Blocked");
                }
                else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/FooProviderBootstrap.java`
#### Snippet
```java
        context.refresh();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-consumer/src/main/java/org/apache/dubbo/samples/cache/Task.java`
#### Snippet
```java
    @Override
    public void run(String... args) {
        System.out.println("ready to run task");
        String fix = null;
        cacheService.findCache("0");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-consumer/src/main/java/org/apache/dubbo/samples/cache/Task.java`
#### Snippet
```java
            String result = cacheService.findCache("0");
            if (fix == null || fix.equals(result)) {
                System.out.println("OK: " + result);
            } else {
                System.err.println("ERROR: " + result);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-consumer/src/main/java/org/apache/dubbo/samples/cache/Task.java`
#### Snippet
```java
                System.out.println("OK: " + result);
            } else {
                System.err.println("ERROR: " + result);
            }
            fix = result;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-consumer/src/main/java/org/apache/dubbo/samples/cache/Task.java`
#### Snippet
```java
                String result = cacheService.findCache(String.valueOf(n));
                if (pre != null && !pre.equals(result)) {
                    System.err.println("ERROR: " + result);
                }
                pre = result;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-consumer/src/main/java/org/apache/dubbo/samples/cache/Task.java`
#### Snippet
```java
        String result = cacheService.findCache("0");
        if (fix != null && !fix.equals(result)) {
            System.out.println("OK: " + result);
        } else {
            System.err.println("ERROR: " + result);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-consumer/src/main/java/org/apache/dubbo/samples/cache/Task.java`
#### Snippet
```java
            System.out.println("OK: " + result);
        } else {
            System.err.println("ERROR: " + result);
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-provider/src/main/java/org/apache/dubbo/samples/generic/call/GenericImplProvider.java`
#### Snippet
```java
        service.export();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-provider/src/main/java/org/apache/dubbo/samples/generic/call/impl/GenericImplOfHelloService.java`
#### Snippet
```java
    public Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
        if (method.equals("sayHello")) {
            System.out.print("executing sayHello.");
            throw new RuntimeException("sayHello: throws exception");
        } else if (method.equals("sayHelloAsync")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-provider/src/main/java/org/apache/dubbo/samples/generic/call/impl/GenericImplOfHelloService.java`
#### Snippet
```java
            throw new RuntimeException("sayHello: throws exception");
        } else if (method.equals("sayHelloAsync")) {
            System.out.print("executing sayHelloAsync.");
            return CompletableFuture.completedFuture("sayHelloAsync: hello " + args[0]);
        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-mybatis/dubbo-samples-spring-boot-mybatis-consumer/src/main/java/org/apache/dubbo/springboot/mybatis/samples/MybatisConsumerApplication.java`
#### Snippet
```java
        MybatisConsumerApplication application = context.getBean(MybatisConsumerApplication.class);
        User user = application.findByUserId(1L);
        System.out.println("result: " + user);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-registry-test-nacos-instance/src/main/java/org/apache/dubbo/samples/App.java`
#### Snippet
```java
        App6.main(args);

        System.out.println("All apps started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-mybatis/dubbo-samples-spring-boot-mybatis-provider/src/main/java/org/apache/dubbo/springboot/mybatis/samples/MybatisProviderApplication.java`
#### Snippet
```java
        SpringApplication.run(MybatisProviderApplication.class, args);

        System.out.println("dubbo service started");

    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-prefer-serialization/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        System.out.println("Java serialization is unsafe. Dubbo Team do not recommend anyone to use it." +
                "If you still want to use it, please follow [JEP 290](https://openjdk.java.net/jeps/290)" +
                "to set serialization filter to prevent deserialization leak.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-prefer-serialization/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        LockSupport.park();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-prefer-serialization/src/main/java/org/apache/dubbo/samples/prefer/serialization/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-group/dubbo-samples-sd-group-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-prefer-serialization/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-provider/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallProvider.java`
#### Snippet
```java
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/generic-provider.xml");
        context.start();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protostuff/dubbo-samples-protostuff-provider/src/main/java/org/dubbo/samples/protostuff/provider/ProviderApp.java`
#### Snippet
```java
        new SpringApplicationBuilder(ProviderApp.class).web(WebApplicationType.NONE).run(args);

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/DemoTask.java`
#### Snippet
```java
    public void run(String... args) throws Exception {
        //调用DevelopService的group1分组实现
        System.out.println("Dubbo Remote Return ======> " + developService.invoke("1"));
        //调用DevelopService的另一个实现
        System.out.println("Dubbo Remote Return ======> " + developServiceV2.invoke("2"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/DemoTask.java`
#### Snippet
```java
        System.out.println("Dubbo Remote Return ======> " + developService.invoke("1"));
        //调用DevelopService的另一个实现
        System.out.println("Dubbo Remote Return ======> " + developServiceV2.invoke("2"));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/ContextTask.java`
#### Snippet
```java
        //接收传递回来参数
        Map<String, Object> clientAttachment = RpcContext.getServerContext().getObjectAttachments();
        System.out.println("ContextTask clientAttachment:" + JSON.toJSONString(clientAttachment));
        System.out.println("ContextService Return : " + res);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/ContextTask.java`
#### Snippet
```java
        Map<String, Object> clientAttachment = RpcContext.getServerContext().getObjectAttachments();
        System.out.println("ContextTask clientAttachment:" + JSON.toJSONString(clientAttachment));
        System.out.println("ContextService Return : " + res);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sd-merge/dubbo-samples-sd-merge-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/GenericTask.java`
#### Snippet
```java
        //传入需要调用的方法，参数类型列表，参数列表
        Object result = genericService.$invoke("invoke", new String[]{"java.lang.String"}, new Object[]{"g1"});
        System.out.println("GenericTask Response: " + JSON.toJSONString(result));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/AsyncTask.java`
#### Snippet
```java
                t.printStackTrace();
            } else {
                System.out.println("AsyncTask Response-1: " + v);
            }
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/AsyncTask.java`
#### Snippet
```java
                t.printStackTrace();
            } else {
                System.out.println("AsyncTask Response-2: " + v);
            }
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/AsyncTask.java`
#### Snippet
```java
                t.printStackTrace();
            } else {
                System.out.println("AsyncTask Response-3: " + v);
            }
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/AsyncTask.java`
#### Snippet
```java
        });

        System.out.println("AsyncTask Executed before response return.");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/MetricsConsumer.java`
#### Snippet
```java
                Thread.sleep(3000);
                Result hello = demoService.sayHello("world");
                System.out.println(hello.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/MetricsProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/StartProviderAndConsumer.java`
#### Snippet
```java
                Thread.sleep(3000);
                Result hello = demoService.sayHello("world");
                System.out.println(hello.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/StartProviderAndConsumer.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
    }
}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        CountDownLatch latch = new CountDownLatch(1);
        future.whenComplete((value, t) -> {
            System.err.println("invokeAsyncSayHello(whenComplete): " + value);
            latch.countDown();
        });
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        CompletableFuture<String> future = RpcContext.getContext().getCompletableFuture();
        future.whenComplete((value, t) -> {
            System.err.println("invokeSayHello(whenComplete): " + value);
            latch.countDown();
        });
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        });

        System.err.println("invokeSayHello(return): " + result);
        latch.await();
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java

        future.whenComplete((value, t) -> {
            System.err.println("asyncInvokeSayHelloAsyncComplex(whenComplete): " + value);
            latch.countDown();
        });
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        CountDownLatch latch = new CountDownLatch(1);
        future.whenComplete((value, t) -> {
            System.err.println("invokeAsyncSayHelloAsync(whenComplete): " + value);
            latch.countDown();
        });
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        CompletableFuture<String> future = RpcContext.getContext().getCompletableFuture();
        future.whenComplete((value, t) -> {
            System.err.println("invokeSayHelloAsyncGenericComplex(whenComplete): " + value);
            latch.countDown();
        });
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        });

        System.err.println("invokeSayHelloAsyncGenericComplex(return): " + result);
        latch.await();
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java

        future.whenComplete((value, t) -> {
            System.err.println("asyncInvokeSayHelloAsyncGenericComplex(whenComplete): " + value);
            latch.countDown();
        });
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        CompletableFuture<String> future = RpcContext.getContext().getCompletableFuture();
        future.whenComplete((value, t) -> {
            System.err.println("invokeSayHelloAsyncComplex(whenComplete): " + value);
            latch.countDown();
        });
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        });

        System.err.println("invokeSayHelloAsync(return): " + result);
        latch.await();
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        CompletableFuture<String> future = RpcContext.getContext().getCompletableFuture();
        future.whenComplete((value, t) -> {
            System.err.println("invokeSayHelloAsync(whenComplete): " + value);
            latch.countDown();
        });
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericCallConsumer.java`
#### Snippet
```java
        });

        System.err.println("invokeSayHelloAsync(return): " + result);
        latch.await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-switch-serialization-thread/src/main/java/org/apache/dubbo/samples/serialization/change/thread/SerializationSwitchThreadProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-api/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java
        GreetingsService service = reference.get();
        String message = service.sayHi("dubbo");
        System.out.println("Receive result ======> " + message);
        System.in.read();
        System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-switch-serialization-thread/src/main/java/org/apache/dubbo/samples/serialization/change/thread/SerializationSwitchThreadConsumer.java`
#### Snippet
```java

        DemoService demoService = context.getBean("demoService", DemoService.class);
        System.out.println(demoService.sayHello("Dubbo"));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-switch-serialization-thread/src/main/java/org/apache/dubbo/samples/serialization/change/thread/impl/DemoServiceImpl.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-api/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
            try {
                String message = service.sayHi("dubbo");
                System.out.println(new Date() + " Receive result ======> " + message);
                Thread.sleep(1000);
            } catch (Throwable t) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "1.0.0");
        System.out.println("1.0.0 service exported");

        // protocol config set serialization as java, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "2.0.0");
        System.out.println("2.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "3.0.0");
        System.out.println("3.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as java
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "4.0.0");
        System.out.println("4.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                JAVA_SERIALIZATION,
                "5.0.0");
        System.out.println("5.0.0 service exported");

        // protocol config set serialization as java, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "6.0.0");
        System.out.println("6.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as java
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                FASTJSON_SERIALIZATION,
                "7.0.0");
        System.out.println("7.0.0 service exported");

        // protocol config set serialization as java, prefer serialization is set as fastjson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "8.0.0");
        System.out.println("8.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "9.0.0");
        System.out.println("9.0.0 service exported");

        // protocol config set serialization as fastjson, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                JAVA_SERIALIZATION,
                "10.0.0");
        System.out.println("10.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as fastjson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "11.0.0");
        System.out.println("11.0.0 service exported");

        // protocol config set serialization as gson, prefer serialization is set as fastjson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                null,
                "12.0.0");
        System.out.println("12.0.0 service exported");

        // protocol config set serialization as gson, prefer serialization is set as fastjson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                JAVA_SERIALIZATION,
                "13.0.0");
        System.out.println("13.0.0 service exported");

        // protocol config set serialization as gson, prefer serialization is set as null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                JAVA_SERIALIZATION,
                "14.0.0");
        System.out.println("14.0.0 service exported");

        // protocol config set serialization as null, prefer serialization is set as gson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                JAVA_SERIALIZATION,
                "15.0.0");
        System.out.println("15.0.0 service exported");

        // protocol config set serialization as fst, prefer serialization is set as gson
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
                JAVA_SERIALIZATION,
                "16.0.0");
        System.out.println("16.0.0 service exported");

        System.out.println("dubbo service started");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-provider/src/main/java/org/apache/dubbo/samples/prefer/serialization/DubboProvider.java`
#### Snippet
```java
        System.out.println("16.0.0 service exported");

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress() +
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/impl/DemoService2Impl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress() +
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext
                .getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/impl/helloworld/GrpcGreeterImpl.java`
#### Snippet
```java
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println("Executing thread is " + Thread.currentThread().getName());
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(reply);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        printServiceData();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
    private static void printServiceData() {
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("providers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("contains 'executes':" + urls.get(0).contains("executes"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("providers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("contains 'executes':" + urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("contains 'executes':" + urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("contains 'executes':" + urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        System.out.println("contains 'executes':" + urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryProvider.java`
#### Snippet
```java
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java

        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
    private static void printServiceData() {
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("consumers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("consumers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'actives':" + urls.get(0).contains("actives"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'actives':" + urls.get(0).contains("actives"));
        System.out.println("contains 'timeout':" + urls.get(0).contains("timeout"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'actives':" + urls.get(0).contains("actives"));
        System.out.println("contains 'timeout':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'actives':" + urls.get(0).contains("actives"));
        System.out.println("contains 'timeout':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        System.out.println("contains 'actives':" + urls.get(0).contains("actives"));
        System.out.println("contains 'timeout':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        System.out.println("contains 'timeout':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/NoSimpleRegistryConsumer.java`
#### Snippet
```java
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/comtomize/MyClientStreamInterceptor.java`
#### Snippet
```java
        public void sendMessage(ReqT reqMessage) {
            // add your logic here
            System.out.println("Sending request msg to server: " + reqMessage);
            super.sendMessage(reqMessage);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/comtomize/MyClientStreamInterceptor.java`
#### Snippet
```java
        public void onMessage(RespT respMessage) {
            // add your logic here
            System.out.println("Received msg from server: " + respMessage);
            super.onMessage(respMessage);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/comtomize/MyServerStreamInterceptor.java`
#### Snippet
```java
        public void request(int numMessages) {
            // add your logic here
            System.out.println("Requesting " + numMessages + " more messages from client.");
            super.request(numMessages);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/comtomize/MyServerStreamInterceptor.java`
#### Snippet
```java
        public void onComplete() {
            // add your logic here
            System.out.println("Completed, all requests finished.");
            super.onComplete();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/comtomize/MyServerStreamInterceptor.java`
#### Snippet
```java
        public void onMessage(ReqT message) {
            // add your logic here
            System.out.println("Received request message from client: " + message);
            super.onMessage(message);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/comtomize/MyServerStreamInterceptor.java`
#### Snippet
```java
        public void sendMessage(RespT message) {
            // add you logic here
            System.out.println("Sending response message back to client: " + message);
            super.sendMessage(message);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java

        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
    private static void printServiceData() {
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("consumers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("consumers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlConsumer.java`
#### Snippet
```java
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/impl/AnnotationServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("async provider received: " + name);
        return "annotation: hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
    private static void printServiceData() {
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("providers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("providers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/SimpleRegistryXmlProvider.java`
#### Snippet
```java
        printServiceData();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        DubboGreeterGrpc.IGreeter greeter = (DubboGreeterGrpc.IGreeter) context.getBean("greeter");

        System.out.println("-------- Start simple unary call test -------- ");
        HelloReply reply = greeter.sayHello(HelloRequest.newBuilder().setName("world!").build());
        System.out.println("Result: " + reply.getMessage());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        System.out.println("-------- Start simple unary call test -------- ");
        HelloReply reply = greeter.sayHello(HelloRequest.newBuilder().setName("world!").build());
        System.out.println("Result: " + reply.getMessage());
        System.out.println("-------- End simple unary call test -------- \n\n\n");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        HelloReply reply = greeter.sayHello(HelloRequest.newBuilder().setName("world!").build());
        System.out.println("Result: " + reply.getMessage());
        System.out.println("-------- End simple unary call test -------- \n\n\n");

        /**
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        DubboRouteGuideGrpc.IRouteGuide routeGuide = (DubboRouteGuideGrpc.IRouteGuide) context.getBean("routeguide");
        RouteGuideClient streamClient = new RouteGuideClient(routeGuide);
        System.out.println("-------- Start stream call test -------- ");
        try {
            List<Feature> features;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
            //
        }
        System.out.println("-------- End stream call test -------- \n");
        System.in.read();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
                "...\n";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
                "...\n";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
                "...";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        printServiceData();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
    private static void printServiceData() {
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("providers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("providers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationProvider.java`
#### Snippet
```java
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterConsumer.java`
#### Snippet
```java
    private static void printServiceData() throws Exception {
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZKTools.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.1", "d-test",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterConsumer.java`
#### Snippet
```java
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZKTools.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.1", "d-test",
                CommonConstants.CONSUMER_SIDE, "metadatareport-configcenter-consumer"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterConsumer.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZKTools.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.1", "d-test",
                CommonConstants.CONSUMER_SIDE, "metadatareport-configcenter-consumer"));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterConsumer.java`
#### Snippet
```java
        System.out.println(ZKTools.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.1", "d-test",
                CommonConstants.CONSUMER_SIDE, "metadatareport-configcenter-consumer"));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterConsumer.java`
#### Snippet
```java
        AnnotationAction annotationAction = context.getBean("annotationAction", AnnotationAction.class);
        String hello = annotationAction.doSayHello("world");
        System.out.println("result: " + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java

        String hello = annotationAction.doSayHello("world");
        System.out.println("result :" + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
    private static void printServiceData() {
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("consumers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java

        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
    private static void printServiceData() {
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("consumers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("consumers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesConsumer.java`
#### Snippet
```java
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("consumers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'retries':" + !urls.get(0).contains("retries"));
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'owner':" + !urls.get(0).contains("owner"));
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'actives':" + !urls.get(0).contains("actives"));
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        System.out.println("not contains 'timeout':" + !urls.get(0).contains("timeout"));
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        System.out.println("contains 'application':" + urls.get(0).contains("application"));
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        System.out.println("contains 'version':" + urls.get(0).contains("version"));
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/SimpleRegistryAnnotationConsumer.java`
#### Snippet
```java
        System.out.println("contains 'group':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/impl/AnnotationServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("received: " + name);
        return "annotation: hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterProvider.java`
#### Snippet
```java
    private static void printServiceData() throws Exception {
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZKTools.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.1", "d-test",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterProvider.java`
#### Snippet
```java
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZKTools.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.1", "d-test",
                CommonConstants.PROVIDER_SIDE, "metadatareport-configcenter-provider"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterProvider.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZKTools.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.1", "d-test",
                CommonConstants.PROVIDER_SIDE, "metadatareport-configcenter-provider"));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterProvider.java`
#### Snippet
```java
        System.out.println(ZKTools.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.1", "d-test",
                CommonConstants.PROVIDER_SIDE, "metadatareport-configcenter-provider"));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/MetadataConfigcenterProvider.java`
#### Snippet
```java
            printServiceData();

            System.out.println("dubbo service started");
            new CountDownLatch(1).await();
        } finally {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        printServiceData();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
    private static void printServiceData() {
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("providers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        List<String> urls = ZkUtil.getChildren(ZkUtil.toUrlPath("providers"));
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        urls.stream().map(URL::decode).forEach(System.out::println);
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        System.out.println("not contains 'executes':" + !urls.get(0).contains("executes"));
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        System.out.println("contains 'retries':" + urls.get(0).contains("retries"));
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        System.out.println("contains 'owner':" + urls.get(0).contains("owner"));
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        System.out.println("contains 'timeout(default)':" + urls.get(0).contains("timeout"));
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        System.out.println("contains 'version(default)':" + urls.get(0).contains("version"));
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/SimpleRegistryPropertiesProvider.java`
#### Snippet
```java
        System.out.println("contains 'group(default)':" + urls.get(0).contains("group"));
        System.out.println("contains 'specVersion(default)':" + urls.get(0).contains(RELEASE_KEY));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-sc/dubbo-sc-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
        UserService userService = context.getBean("userService", UserService.class);
        User user = userService.getUser(1L);
        System.out.println("result: " + user);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-middle/src/main/java/org/apache/dubbo/samples/chain/MiddleEndProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
        String str = "---\n" + "force: false\n" + "runtime: true\n" + "enabled: true\n" + "priority: 1\n" + "key: governance-tagrouter-provider\n" + "tags:\n" + "  - name: tag1\n" + "    addresses: [\"30.5.121.131:20880\"]\n" + "  - name: tag2\n" + "    addresses: [\"30.5.121.131:20881\"]\n" + "...";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-middle/src/main/java/org/apache/dubbo/samples/chain/impl/AmericanServiceImpl.java`
#### Snippet
```java
            e.printStackTrace();
        }
        System.out.println(catService.getName());
        return "I can eat Cat!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-middle/src/main/java/org/apache/dubbo/samples/chain/impl/AmericanServiceImpl.java`
#### Snippet
```java
    @Override
    public String watch() {
        System.out.println(lionService.getName());
        return "I want to see Lion!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/BackendProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
        String str = "---\n" + "configVersion: v2.7\n" + "scope: application\n" + "key: concurrency-middle\n" + "enabled: true\n" + "configs:\n" + "- addresses: [\"0.0.0.0\"]\n" + "  side: consumer\n" + "  parameters:\n" + "    timeout: 5000\n" + "- addresses: [\"0.0.0.0:20881\"]\n" + "  side: provider\n" + "  parameters:\n" + "    timeout: 4000";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
        String str = "---\n" + "force: false\n" + "runtime: true\n" + "enabled: true\n" + "priority: 1\n" + "key: governance-tagrouter-provider\n" + "tags:\n" + "  - name: tag1\n" + "    addresses: [\"30.5.121.131:20880\"]\n" + "  - name: tag2\n" + "    addresses: [\"30.5.121.131:20881\"]\n" + "...";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/CatServiceImpl.java`
#### Snippet
```java
    @Override
    public String cat() {
        System.out.println("Meow Meow!");
        return "Meow Meow!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/CatServiceImpl.java`
#### Snippet
```java
    @Override
    public String getName() {
        System.out.println("I am a Cat!");
        return "I am a Cat!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/LionServiceImpl.java`
#### Snippet
```java
    @Override
    public String lion() {
        System.out.println("Lion Lion!");
        return "Lion Lion!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/LionServiceImpl.java`
#### Snippet
```java
    @Override
    public String getName() {
        System.out.println("I am a Lion!");
        return "I am a Lion!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/TigerServiceImpl.java`
#### Snippet
```java
    @Override
    public String tiger() {
        System.out.println("Tiger Tiger!");
        return "Tiger Tiger!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/TigerServiceImpl.java`
#### Snippet
```java
    @Override
    public String getName() {
        System.out.println("I am a Tiger!");
        return "I am a Tiger!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/DogServiceImpl.java`
#### Snippet
```java
            e.printStackTrace();
        }
        System.out.println("I am a Dog!");
        return "I am a Dog!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/DogServiceImpl.java`
#### Snippet
```java
            e.printStackTrace();
        }
        System.out.println("Woof Woof!");
        return "Woof Woof!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-middle/src/main/java/org/apache/dubbo/samples/chain/impl/ChineseServiceImpl.java`
#### Snippet
```java
    @Override
    public String eat() {
        System.out.println(dogService.getName());
        return "I can eat Dog!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-middle/src/main/java/org/apache/dubbo/samples/chain/impl/ChineseServiceImpl.java`
#### Snippet
```java
    @Override
    public String watch() {
        System.out.println(tigerService.getName());
        return "I want to see Tiger!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/provider/ProviderStarter.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/consumer/ConsumerStarter.java`
#### Snippet
```java
                .build();
        GoogleProtobufBasic.GooglePBResponseType responseType = service.callGoogleProtobuf(requestType);
        System.out.println(responseType.getString());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
        String str = "dubbo.consumer.timeout=6666";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
        }

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
                "dubbo.protocol.threads=100";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                    RpcContext.getContext().setAttachment(TAG_KEY, "tag1");
                    ChineseService chineseService = (ChineseService) context.getBean("chineseService");
                    System.out.println(chineseService.eat());
                    Thread.sleep(interval);
                } catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
            while (true) {
                LionService lionService = (LionService) context.getBean("lionService");
                System.out.println(lionService.lion());
                Thread.sleep(interval);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
            while (true) {
                CatService catService = (CatService) context.getBean("catService");
                System.out.println(catService.cat());
                Thread.sleep(interval);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                    RpcContext.getContext().setAttachment(TAG_KEY, "tag1");
                    AmericanService americanService = (AmericanService) context.getBean("americanService");
                    System.out.println(americanService.eat());
                    Thread.sleep(interval);
                } catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                    RpcContext.getContext().setAttachment(TAG_KEY, "tag1");
                    DogService dogService = (DogService) context.getBean("dogService");
                    System.out.println(dogService.dog());
                    Thread.sleep(interval);
                } catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
            while (true) {
                TigerService tigerService = (TigerService) context.getBean("tigerService");
                System.out.println(tigerService.tiger());
                Thread.sleep(interval);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlConsumer.java`
#### Snippet
```java
        printServiceData();

        System.out.println(demoService.sayHello("world"));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlConsumer.java`
#### Snippet
```java
    private static void printServiceData() throws Exception {
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo3", DemoService.class.getName(), CommonConstants.CONSUMER_SIDE,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlConsumer.java`
#### Snippet
```java
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo3", DemoService.class.getName(), CommonConstants.CONSUMER_SIDE,
                "metadatareport-local-xml-consumer2"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlConsumer.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo3", DemoService.class.getName(), CommonConstants.CONSUMER_SIDE,
                "metadatareport-local-xml-consumer2"));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlConsumer.java`
#### Snippet
```java
        System.out.println(ZkUtil.getMetadata("/dubbo3", DemoService.class.getName(), CommonConstants.CONSUMER_SIDE,
                "metadatareport-local-xml-consumer2"));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlProvider.java`
#### Snippet
```java
    private static void printServiceData() throws Exception {
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo3", DemoService.class.getName(), CommonConstants.PROVIDER_SIDE,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlProvider.java`
#### Snippet
```java
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo3", DemoService.class.getName(), CommonConstants.PROVIDER_SIDE,
                "metadatareport-local-xml-provider2"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlProvider.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo3", DemoService.class.getName(), CommonConstants.PROVIDER_SIDE,
                "metadatareport-local-xml-provider2"));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlProvider.java`
#### Snippet
```java
        System.out.println(ZkUtil.getMetadata("/dubbo3", DemoService.class.getName(), CommonConstants.PROVIDER_SIDE,
                "metadatareport-local-xml-provider2"));
        System.out.println("*********************************************************");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/MetadataLocalXmlProvider.java`
#### Snippet
```java
        printServiceData();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer2.java`
#### Snippet
```java

        MergeService mergeService = (MergeService) context.getBean("mergeService");
        System.out.println(mergeService.mergeResult());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-provider1/src/main/java/org/apache/dubbo/samples/merge/MergeProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-consumer/src/main/java/org/apache/dubbo/samples/merge/MergeConsumer.java`
#### Snippet
```java

        MergeService mergeService = (MergeService) context.getBean("mergeService");
        System.out.println(mergeService.mergeResult());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-merge/dubbo-samples-merge-provider2/src/main/java/org/apache/dubbo/samples/merge/MergeProvider2.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/sc-call-dubbo/sc-dubbo-consumer/src/main/java/org/apache/dubbo/samples/microservices/sc/controller/TestController.java`
#### Snippet
```java
    public String doRestAliveUsingEurekaAndRibbon() {
        String url = "http://dubbo-provider-for-sc/users/1";
        System.out.println("url: " + url);
        return restTemplate.getForObject(url, String.class);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/sc-call-dubbo/sc-dubbo-consumer/src/main/java/org/apache/dubbo/samples/microservices/sc/Application.java`
#### Snippet
```java
        SpringApplication.run(Application.class, args);

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/sc-call-dubbo/sc-dubbo-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
                .start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/client/Consumer.java`
#### Snippet
```java
        GreetingsService greetingsService = reference.get();
        String message = greetingsService.sayHi("dubbo");
        System.out.println(message);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/server/Provider1.java`
#### Snippet
```java
        service.setRef(new GreetingsServiceImpl());
        service.export();
        System.out.println("dubbo service started");
        System.in.read();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
    private static void printServiceData() throws Exception {
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        String serviceMetaData = ZkUtil.getMetadata("/dubbo", GoogleProtobufService.class.getName(), CommonConstants
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        String serviceMetaData = ZkUtil.getMetadata("/dubbo", GoogleProtobufService.class.getName(), CommonConstants
                        .PROVIDER_SIDE,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
                "protobuf-demo");
        FullServiceDefinition serviceDefinition = new Gson().fromJson(serviceMetaData, FullServiceDefinition.class);
        System.out.println("service interface: " + GoogleProtobufService.class.getName());
        for (MethodDefinition methodDefinition : serviceDefinition.getMethods()) {
            System.out.println("method name: " + methodDefinition.getName());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
        System.out.println("service interface: " + GoogleProtobufService.class.getName());
        for (MethodDefinition methodDefinition : serviceDefinition.getMethods()) {
            System.out.println("method name: " + methodDefinition.getName());
            for (String parameterType : methodDefinition.getParameterTypes()) {
                TypeDefinition typeDefinition = serviceDefinition.getTypes().stream().filter(TD -> TD.getType().equals
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
                TypeDefinition typeDefinition = serviceDefinition.getTypes().stream().filter(TD -> TD.getType().equals
                        (parameterType)).findAny().get();
                System.out.println("parameter: " + new Gson().toJson(typeDefinition));
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
            }
        }
        System.out.println();
        System.out.println("*********************************************************");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
        }
        System.out.println();
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
                        "org.apache.dubbo.sample.protobuf.GoogleProtobufBasic$GooglePBRequestType"},
                new Object[]{requestString});
        System.out.println(new Gson().toJson(result));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/server/Provider2.java`
#### Snippet
```java
        demoService.export();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/BasicConsumer.java`
#### Snippet
```java
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " +
                name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-apollo/src/main/java/org/apache/dubbo/samples/configcenter/ApolloProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/ZKTools2.java`
#### Snippet
```java
        String str = "dubbo.registry.address=zookeeper://" + zookeeperHost2 + ":" + zookeeperPort2;

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-apollo/src/main/java/org/apache/dubbo/samples/configcenter/ApolloConsumer.java`
#### Snippet
```java

        String hello = demoService.sayHello("world");
        System.out.println(hello);

    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-apollo/src/main/java/org/apache/dubbo/samples/configcenter/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
                "dubbo.reference.org.apache.dubbo.samples.configcenter.api.DemoService.timeout=9999";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
                "dubbo.registry.simplified=true\n";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/AnnotationProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/impl/AnnotationServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("provider received: " + name);
        return "annotation: hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/ZKTools.java`
#### Snippet
```java
        String str = "dubbo.consumer.timeout=6666";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/ZKTools.java`
#### Snippet
```java
                "dubbo.provider.timeout=5000";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/ZKTools.java`
#### Snippet
```java
                "dubbo.protocol.threads=100";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/AnnotationConsumer.java`
#### Snippet
```java
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
        String hello = annotationAction.doSayHello("world");
        System.out.println("result :" + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
                "dubbo.protocols.dubbo2.port=20992";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/AnnotationConsumer.java`
#### Snippet
```java
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
        String hello = annotationAction.doSayHello("world");
        System.out.println("result: " + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/BasicConsumer.java`
#### Snippet
```java

        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/impl/AnnotationServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("provider received: " + name);
        return "annotation: hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/AnnotationProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/ZKTools.java`
#### Snippet
```java
                "dubbo.registries.registry2.address=zookeeper://" + zookeeperHost2 + ":" + zookeeperPort2;

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/service/AnnotationServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("async provider received: " + name);
        return "annotation: hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/ZKTools.java`
#### Snippet
```java
        String str = "";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/provider/AnnotationProvider.java`
#### Snippet
```java

        SpringApplication.run(AnnotationProvider.class, args);
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/Provider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/consumer/AnnotationConsumer.java`
#### Snippet
```java

        String result = action.doSayHello("world");
        System.out.println("result: " + result);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
        String hello = greetingServiceConsumer.doSayHello("nacos");
        System.out.println("result: " + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/impl/AnnotatedGreetingService1.java`
#### Snippet
```java
    @Override
    public List<String> sayHelloList(String name) {
        System.out.println("greeting service received: " + name);
        List<String> result = new ArrayList<>();
        result.add("hello, " + name + " from group 1");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
            try {
                String hello = greetingServiceConsumer.doSayHello("xDS Consumer");
                System.out.println("result: " + hello);
                Thread.sleep(100);
            } catch (Throwable t) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/impl/AnnotatedGreetingService1.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("greeting service received: " + name);
        return "hello, " + name + " from group 1";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-provider/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/impl/AnnotatedGreetingService2.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("greeting service received: " + name);
        return "hello, " + name + " from group 2";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-group/src/main/java/org/apache/dubbo/samples/impl/AnnotatedGreetingService2.java`
#### Snippet
```java
    @Override
    public List<String> sayHelloList(String name) {
        System.out.println("greeting service received: " + name);
        List<String> result = new ArrayList<>();
        result.add("hello, " + name + " from group 2");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world", 5000);
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-registry/src/main/java/org/apache/dubbo/samples/impl/AnnotatedGreetingService.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("greeting service received: " + name);
        return "hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-registry/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-provider/src/main/java/org/apache/dubbo/samples/impl/AnnotatedGreetingService.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("greeting service received: " + name);
        return "hello, " + name + "! from host: " + NetUtils.getLocalHost();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl2.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " +
                name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
        RpcContext.getContext().setAttachment(TAG_KEY, "tag1");
        String hello = demoService.sayHello("world");
        System.out.println(hello);

        RpcContext.getContext().setAttachment(FORCE_USE_TAG, "true");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
        RpcContext.getContext().setAttachment(TAG_KEY, "tag2");
        String hello2 = demoService2.sayHello("world again");
        System.out.println(hello2);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-registry/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
        String hello = greetingServiceConsumer.doSayHello("nacos");
        System.out.println("result: " + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
            String content = IOUtils.toString(is);
            if (configService.publishConfig(DATAID, GROUP, content)) {
                System.out.println("write " + DATAID + ":" + GROUP + " successfully.");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
    public static void clearAppRule() throws Throwable {
        if (configService.removeConfig(DATAID, GROUP)) {
            System.out.println("remove " + DATAID + ":" + GROUP + " successfully.");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
    public static void clearAppRule() throws Throwable {
        if (configService.removeConfig(DATAID, GROUP)) {
            System.out.println("remove " + DATAID + ":" + GROUP + " successfully.");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
            String content = IOUtils.toString(is);
            if (configService.publishConfig(DATAID, GROUP, content)) {
                System.out.println("write " + DATAID + ":" + GROUP + " successfully.");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/BasicConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("nacos");
        System.out.println("result: " + hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

        String hello = demoService.sayHello("world");
        System.out.println("result: " + hello);

        String hello2 = demoService2.sayHello("world again");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

        String hello2 = demoService2.sayHello("world again");
        System.out.println("result: " + hello2);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " +
                name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl2.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " +
                name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/util/NacosUtils.java`
#### Snippet
```java

        if (configService.publishConfig(dataId, group, content.toString())) {
            System.out.println("write " + dataId + ":" + group + " successfully.");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        AtomicInteger count = new AtomicInteger(0);

        System.out.println("==================== dubbo unary invoke loop started ====================");
        do {
            Thread.sleep(5000);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
            Thread.sleep(5000);
            greetingServiceConsumer.doSayHello("service mesh");
            System.out.println("==================== dubbo unary invoke " + count.get() + " end ====================");
            count.getAndIncrement();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        while (count.get() != 20);

        System.out.println("==================== dubbo start bi streaming ====================");
        greetingServiceConsumer.doBISayHello("service mesh");
        System.out.println("==================== dubbo bi stream done ====================");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        System.out.println("==================== dubbo start bi streaming ====================");
        greetingServiceConsumer.doBISayHello("service mesh");
        System.out.println("==================== dubbo bi stream done ====================");

        System.out.println("==================== dubbo start server streaming ====================");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        System.out.println("==================== dubbo bi stream done ====================");

        System.out.println("==================== dubbo start server streaming ====================");
        greetingServiceConsumer.getHelloFromServer();
        System.out.println("==================== dubbo server stream done ====================");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        System.out.println("==================== dubbo start server streaming ====================");
        greetingServiceConsumer.getHelloFromServer();
        System.out.println("==================== dubbo server stream done ====================");

        CountDownLatch countDownLatch = new CountDownLatch(1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-provider/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("=============== dubbo service started ===============");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-zookeeper/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-conditionrouter/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
            String content = IOUtils.toString(is);
            if (configService.publishConfig(dataId, group, content)) {
                System.out.println("write " + dataId + ":" + group + " successfully.");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-zookeeper/src/main/java/org/apache/dubbo/samples/impl/AnnotatedGreetingService.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("greeting service received: " + name);
        return "hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-kubernetes/dubbo-samples-apiserver-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
        String hello = greetingServiceConsumer.doSayHello("Kubernetes Api Server");
        System.out.println("result: " + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-kubernetes/dubbo-samples-apiserver-provider/src/main/java/org/apache/dubbo/samples/ProviderBootstrap.java`
#### Snippet
```java
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-zookeeper/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
        String hello = greetingServiceConsumer.doSayHello("zookeeper");
        System.out.println("result: " + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-kubernetes/dubbo-samples-apiserver-provider/src/main/java/org/apache/dubbo/samples/impl/AnnotatedGreetingService.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("greeting service received: " + name);
        return "hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-default-config/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-default-config/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java
        HelloService helloServiceFormBeijing = (HelloService) context.getBean("helloServiceFormBeijing");

        System.out.println(demoServiceFormBeijing.get("service form beijing registry"));
        System.out.println(helloServiceFormShanghai.sayHello("service form shanghai registry"));
        System.out.println(helloServiceFormBeijing.sayHello("service form beijing registry"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-default-config/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java

        System.out.println(demoServiceFormBeijing.get("service form beijing registry"));
        System.out.println(helloServiceFormShanghai.sayHello("service form shanghai registry"));
        System.out.println(helloServiceFormBeijing.sayHello("service form beijing registry"));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-default-config/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java
        System.out.println(demoServiceFormBeijing.get("service form beijing registry"));
        System.out.println(helloServiceFormShanghai.sayHello("service form shanghai registry"));
        System.out.println(helloServiceFormBeijing.sayHello("service form beijing registry"));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/CommonMultiRegistryProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/CommonMultiRegistryConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean(DemoService.class);
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(demoService.get("service form default registry"));
        System.out.println(helloService.sayHello("service form shanghai registry"));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/CommonMultiRegistryConsumer.java`
#### Snippet
```java
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(demoService.get("service form default registry"));
        System.out.println(helloService.sayHello("service form shanghai registry"));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean(DemoService.class);
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(demoService.get("service form default registry"));
        System.out.println(helloService.sayHello("service form shanghai registry"));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/MultiRegistryConsumer.java`
#### Snippet
```java
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(demoService.get("service form default registry"));
        System.out.println(helloService.sayHello("service form shanghai registry"));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-provider/src/main/java/org/apache/dubbo/samples/microservices/sc/Application.java`
#### Snippet
```java
        SpringApplication.run(Application.class, args);

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-provider/src/main/java/org/apache/dubbo/samples/microservices/sc/controller/TestController.java`
#### Snippet
```java
    public String doRestAliveUsingEurekaAndRibbon() {
        String url = "http://dubbo-provider-demo/users/1";
        System.out.println("url: "+url);
        return restTemplate.getForObject(url, String.class);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProviderOtherPort.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-ssl/dubbo-samples-ssl-consumer/src/main/java/org/apache/dubbo/samples/basic/SslBasicConsumer.java`
#### Snippet
```java
        if (args.length > 0) {
            if (args.length != 1 && args.length != 3) {
                System.out.println(
                        "USAGE: BasicConsumer [trustCertCollectionFilePath [certChainFilePath privateKeyFilePath]]\n " +
                                "Specify 'certChainFilePath' and 'privateKeyFilePath' only if you need Mutual TLS.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-ssl/dubbo-samples-ssl-consumer/src/main/java/org/apache/dubbo/samples/basic/SslBasicConsumer.java`
#### Snippet
```java
        DemoService service = bootstrap.getCache().get(reference);
        String message = service.sayHello("dubbo");
        System.out.println(message);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl2.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " +
                name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
        RpcContext.getContext().setAttachment(TAG_KEY, "tag1");
        String hello = demoService.sayHello("world");
        System.out.println(hello);

        RpcContext.getContext().setAttachment(FORCE_USE_TAG, "true");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
        RpcContext.getContext().setAttachment(TAG_KEY, "tag2");
        String hello2 = demoService2.sayHello("world again");
        System.out.println(hello2);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world", 500);
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-provider-instance/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-ssl/dubbo-samples-grpc-ssl-consumer/src/main/java/org/apache/dubbo/samples/basic/SslBasicConsumer.java`
#### Snippet
```java
        if (args.length > 0) {
            if (args.length != 1 && args.length != 3) {
                System.out.println(
                        "USAGE: BasicConsumer [trustCertCollectionFilePath [certChainFilePath privateKeyFilePath]]\n " +
                                "Specify 'certChainFilePath' and 'privateKeyFilePath' only if you need Mutual TLS.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-ssl/dubbo-samples-grpc-ssl-consumer/src/main/java/org/apache/dubbo/samples/basic/SslBasicConsumer.java`
#### Snippet
```java
        IGreeter service = bootstrap.getCache().get(reference);
        HelloReply helloReply = service.sayHello(HelloRequest.newBuilder().setName("dubbo").build());
        System.out.println(helloReply.getMessage());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
                "...\n";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
                "...\n";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationConsumer.java`
#### Snippet
```java
        parameter.setExpiryDate(new Date(System.currentTimeMillis() + 1000000));
        validationService.save(parameter);
        System.out.println("Validation Save OK");

        // Save Error
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationConsumer.java`
#### Snippet
```java
            validationService.save(parameter);
        } catch (ValidationException e) {
            System.err.println("Validation Save ERROR");
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationConsumer.java`
#### Snippet
```java
        // Delete OK
        validationService.delete(2, "abc");
        System.out.println("Validation Delete OK");

        // Delete Error
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationConsumer.java`
#### Snippet
```java
            validationService.delete(0, "abc");
        } catch (ValidationException e) {
            System.err.println("Validation Delete ERROR");
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/impl/AsyncServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("async provider received: " + name);
        return "hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-compatible/src/main/java/org/apache/dubbo/samples/basic/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java
        helloFuture.whenComplete((retValue, exception) -> {
            if (exception == null) {
                System.out.println("return value: " + retValue);
            } else {
                exception.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java

        CompletableFuture<String> f = RpcContext.getContext().asyncCall(() -> asyncService.sayHello("async call request"));
        System.out.println("async call returned: " + f.get());


```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-compatible/src/main/java/org/apache/dubbo/samples/compat/Consumer.java`
#### Snippet
```java
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
        User user = demoService.getUser(1);
        System.out.println(user);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-compatible/src/main/java/org/apache/dubbo/samples/compat/Consumer.java`
#### Snippet
```java
        System.out.println(hello);
        User user = demoService.getUser(1);
        System.out.println(user);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-compatible/src/main/java/org/apache/dubbo/samples/compat/Provider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
    public Map<String, Object>  dubbo2Http(Map<String, Object> context) {
        for (Map.Entry<String, Object> entry : context.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
        String testValue = (String)context.get("test");
        if (testValue != null) {
            System.out.println("test value: " + testValue);
            ret = new HashMap<String, Object>();
            if (testValue.equals("null")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            ret = new HashMap<String, Object>();
            if (testValue.equals("null")) {
                System.out.println("dubbo test: null");
                return null;
            } else if (testValue.equals("body empty")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
                return null;
            } else if (testValue.equals("body empty")) {
                System.out.println("dubbo test: body empty");
                ret.put("status", "302");
            } else if (testValue.equals("status empty")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
                ret.put("status", "302");
            } else if (testValue.equals("status empty")) {
                System.out.println("dubbo test: status empty");
                ret.put("body", "dubbo failed");
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
                ret.put("body", "dubbo failed");
            } else {
                System.out.println("dubbo test: unkown test");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("get key = " + key + ", value = " + value);
            if (key.equals("args")) {
                params = URLEncodedUtils.parse((String)value, Charset.forName("UTF-8"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            uriBuilder.addParameters(params);

            System.out.println("get to: " + uriBuilder.build().toString());

            HttpRequestBase request = null;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java

            for (Map.Entry<String, String> entry : headers.entrySet()) {
                System.out.println("header key = " + entry.getKey() + ", value = " + entry.getValue());
                if (entry.getKey().equalsIgnoreCase("content-length")) {
                    System.out.println("skip content-length");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
                System.out.println("header key = " + entry.getKey() + ", value = " + entry.getValue());
                if (entry.getKey().equalsIgnoreCase("content-length")) {
                    System.out.println("skip content-length");
                    continue;
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            result.put("body", responseBody);

            System.out.println("body byte");

            Header[] responseHeaders = response.getAllHeaders();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            Header[] responseHeaders = response.getAllHeaders();
            for (Header h : responseHeaders) {
                System.out.println("header key = " + h.getName() + ", value = " + h.getValue());
                result.put(h.getName(), h.getValue());
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            }
        }catch (Exception e){
            System.out.println("error: " + e.getCause().getMessage());
            e.printStackTrace();
            result.put("status", "502");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
    public Map<String, Object> tengineDubbo(Map<String, Object> context) {
        for (Map.Entry<String, Object> entry : context.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
    public Map<String, Object> tengineTest(Map<String, Object> context) {
        for (Map.Entry<String, Object> entry : context.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
        String testValue = (String)context.get("test");
        if (testValue != null) {
            System.out.println("test value: " + testValue);
            ret = new HashMap<String, Object>();
            if (testValue.equals("null")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            ret = new HashMap<String, Object>();
            if (testValue.equals("null")) {
                System.out.println("dubbo test: null");
                return null;
            } else if (testValue.equals("body empty")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
                return null;
            } else if (testValue.equals("body empty")) {
                System.out.println("dubbo test: body empty");
                ret.put("status", "302");
            } else if (testValue.equals("status empty")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
                ret.put("status", "302");
            } else if (testValue.equals("status empty")) {
                System.out.println("dubbo test: status empty");
                ret.put("body", "dubbo failed");
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
                ret.put("body", "dubbo failed");
            } else {
                System.out.println("dubbo test: unkown test");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-echo/src/main/java/org/apache/dubbo/samples/echo/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " +
                name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-echo/src/main/java/org/apache/dubbo/samples/echo/EchoProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-echo/src/main/java/org/apache/dubbo/samples/echo/EchoConsumer.java`
#### Snippet
```java
        EchoService echoService = (EchoService) demoService;
        String status = (String) echoService.$echo("OK");
        System.out.println("echo result: " + status);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-version/src/main/java/org/apache/dubbo/samples/version/VersionConsumer.java`
#### Snippet
```java
        for (int i = 0; i < 10000; i++) {
            String hello = versionService.sayHello("world");
            System.out.println(hello);
            Thread.sleep(2000);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-version/src/main/java/org/apache/dubbo/samples/version/VersionProvider2.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/BasicMonitor.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/BasicConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-monitor/src/main/java/org/apache/dubbo/samples/monitor/impl/DemoServiceImpl.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
        UserService userService = context.getBean("userService", UserService.class);
        User user = userService.getUser(1L);
        System.out.println("result: " + user);

        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world");
        System.out.println("result: " + hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/impl/AnnotationServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("received: " + name);
        return "annotation: hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationConsumer.java`
#### Snippet
```java
    private static void printServiceData() throws Exception {
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.8", "d-test",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationConsumer.java`
#### Snippet
```java
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.8", "d-test",
                CommonConstants.CONSUMER_SIDE, "metadatareport-local-annotation-consumer"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationConsumer.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.8", "d-test",
                CommonConstants.CONSUMER_SIDE, "metadatareport-local-annotation-consumer"));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationConsumer.java`
#### Snippet
```java
        System.out.println(ZkUtil.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.8", "d-test",
                CommonConstants.CONSUMER_SIDE, "metadatareport-local-annotation-consumer"));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationConsumer.java`
#### Snippet
```java
        AnnotationAction annotationAction = context.getBean("annotationAction", AnnotationAction.class);
        String hello = annotationAction.doSayHello("world");
        System.out.println("result :" + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesConsumer.java`
#### Snippet
```java

        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesConsumer.java`
#### Snippet
```java
    private static void printServiceData() throws Exception {
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", DemoService.class.getName(), CommonConstants.CONSUMER_SIDE,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesConsumer.java`
#### Snippet
```java
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", DemoService.class.getName(), CommonConstants.CONSUMER_SIDE,
                "metadatareport-local-properties-consumer"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesConsumer.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", DemoService.class.getName(), CommonConstants.CONSUMER_SIDE,
                "metadatareport-local-properties-consumer"));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesConsumer.java`
#### Snippet
```java
        System.out.println(ZkUtil.getMetadata("/dubbo", DemoService.class.getName(), CommonConstants.CONSUMER_SIDE,
                "metadatareport-local-properties-consumer"));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationProvider.java`
#### Snippet
```java
    private static void printServiceData() throws Exception {
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.8", "d-test",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationProvider.java`
#### Snippet
```java
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.8", "d-test",
                CommonConstants.PROVIDER_SIDE, "metadatareport-local-annotaion-provider"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationProvider.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.8", "d-test",
                CommonConstants.PROVIDER_SIDE, "metadatareport-local-annotaion-provider"));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationProvider.java`
#### Snippet
```java
        System.out.println(ZkUtil.getMetadata("/dubbo", AnnotationService.class.getName(), "1.1.8", "d-test",
                CommonConstants.PROVIDER_SIDE, "metadatareport-local-annotaion-provider"));
        System.out.println("*********************************************************");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/MetadataLocalAnnotationProvider.java`
#### Snippet
```java
        printServiceData();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesProvider.java`
#### Snippet
```java
    private static void printServiceData() throws Exception {
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", DemoService.class.getName(), CommonConstants.PROVIDER_SIDE,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesProvider.java`
#### Snippet
```java
        Thread.sleep(3000);
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", DemoService.class.getName(), CommonConstants.PROVIDER_SIDE,
                "metadatareport-local-properties-provider2"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesProvider.java`
#### Snippet
```java
        System.out.println("*********************************************************");
        System.out.println("service metadata:");
        System.out.println(ZkUtil.getMetadata("/dubbo", DemoService.class.getName(), CommonConstants.PROVIDER_SIDE,
                "metadatareport-local-properties-provider2"));
        System.out.println("*********************************************************");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesProvider.java`
#### Snippet
```java
        System.out.println(ZkUtil.getMetadata("/dubbo", DemoService.class.getName(), CommonConstants.PROVIDER_SIDE,
                "metadatareport-local-properties-provider2"));
        System.out.println("*********************************************************");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/MetadataLocalPropertiesProvider.java`
#### Snippet
```java
        printServiceData();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-sc/dubbo-sc-provider/src/main/java/org/apache/dubbo/samples/microservices/sc/Application.java`
#### Snippet
```java
        SpringApplication.run(Application.class, args);

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf/protobuf-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/RestProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-sc/dubbo-sc-provider/src/main/java/org/apache/dubbo/samples/microservices/sc/controller/TestController.java`
#### Snippet
```java
    public String doRestAliveUsingEurekaAndRibbon() {
        String url = "http://dubbo-provider-demo/users/1";
        System.out.println("url: "+url);
        return restTemplate.getForObject(url, String.class);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/RestConsumer.java`
#### Snippet
```java

        User user = new User(1L, "larrypage");
        System.out.println("SUCCESS: registered user with id " + userService.registerUser(user).getId());

        RpcContext.getContext().setAttachment("clientName", "demo");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/RestConsumer.java`
#### Snippet
```java
        RpcContext.getContext().setAttachment("clientName", "demo");
        RpcContext.getContext().setAttachment("clientImpl", "dubbo");
        System.out.println("SUCCESS: got user " + userService.getUser(1L));
        System.in.read();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/ClientTraceFilter.java`
#### Snippet
```java
    public void filter(ClientRequestContext clientRequestContext, ClientResponseContext clientResponseContext) throws
        IOException {
        System.out.println("Client response filter invoked");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/ClientTraceFilter.java`
#### Snippet
```java

    public void filter(ClientRequestContext requestContext) throws IOException {
        System.out.println("Client request filter invoked");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/DynamicTraceInterceptor.java`
#### Snippet
```java
    @Override
    public Object aroundReadFrom(ReaderInterceptorContext readerInterceptorContext) throws IOException, WebApplicationException {
        System.out.println("Dynamic reader interceptor invoked");
        return readerInterceptorContext.proceed();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/DynamicTraceInterceptor.java`
#### Snippet
```java
    @Override
    public void aroundWriteTo(WriterInterceptorContext writerInterceptorContext) throws IOException, WebApplicationException {
        System.out.println("Dynamic writer interceptor invoked");
        writerInterceptorContext.proceed();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/TraceInterceptor.java`
#### Snippet
```java
    @Override
    public void aroundWriteTo(WriterInterceptorContext writerInterceptorContext) throws IOException, WebApplicationException {
        System.out.println("Writer interceptor invoked");
        writerInterceptorContext.proceed();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/TraceInterceptor.java`
#### Snippet
```java
    @Override
    public Object aroundReadFrom(ReaderInterceptorContext readerInterceptorContext) throws IOException, WebApplicationException {
        System.out.println("Reader interceptor invoked");
        return readerInterceptorContext.proceed();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/TraceFilter.java`
#### Snippet
```java
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("Request filter invoked: " + requestContext.getUriInfo().getAbsolutePath());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/TraceFilter.java`
#### Snippet
```java

        IOException {
        System.out.println("Response filter invoked.");

    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/impl/facade/AnotherUserRestServiceImpl.java`
#### Snippet
```java
    @Override
    public User getUser(Long id) {
        System.out.println("Client name is " + RpcContext.getContext().getAttachment("clientName"));
        System.out.println("Client impl is " + RpcContext.getContext().getAttachment("clientImpl"));
        return userService.getUser(id);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/impl/facade/UserRestServiceImpl.java`
#### Snippet
```java
        // test context injection
//        System.out.println("Client address from @Context injection: " + (request != null ? request.getRemoteAddr() : ""));
        System.out.println("Client address from RpcContext: " + RpcContext.getContext().getRemoteAddressString());
        if (RpcContext.getContext().getRequest(HttpServletRequest.class) != null) {
            System.out.println("Client IP address from RpcContext: " + RpcContext.getContext().getRequest(HttpServletRequest.class).getRemoteAddr());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/impl/facade/UserRestServiceImpl.java`
#### Snippet
```java
        System.out.println("Client address from RpcContext: " + RpcContext.getContext().getRemoteAddressString());
        if (RpcContext.getContext().getRequest(HttpServletRequest.class) != null) {
            System.out.println("Client IP address from RpcContext: " + RpcContext.getContext().getRequest(HttpServletRequest.class).getRemoteAddr());
        }
        if (RpcContext.getContext().getResponse(HttpServletResponse.class) != null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/impl/facade/AnotherUserRestServiceImpl.java`
#### Snippet
```java
    public User getUser(Long id) {
        System.out.println("Client name is " + RpcContext.getContext().getAttachment("clientName"));
        System.out.println("Client impl is " + RpcContext.getContext().getAttachment("clientImpl"));
        return userService.getUser(id);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/impl/facade/UserRestServiceImpl.java`
#### Snippet
```java
        }
        if (RpcContext.getContext().getResponse(HttpServletResponse.class) != null) {
            System.out.println("Response object from RpcContext: " + RpcContext.getContext().getResponse(HttpServletResponse.class));
        }
        return userService.getUser(id);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/LogFilter.java`
#### Snippet
```java
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println(invocation.getMethodName() + "is invoked");
        return invoker.invoke(invocation);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/CustomExceptionMapper.java`
#### Snippet
```java

    public Response toResponse(NotFoundException e) {
        System.out.println("Exception mapper successfully got an exception: " + e + ":" + e.getMessage());
        System.out.println("Client IP is " + RpcContext.getContext().getRemoteAddressString());
        return Response.status(Response.Status.NOT_FOUND).entity("Oops! the requested resource is not found!").type("text/plain").build();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/api/extension/CustomExceptionMapper.java`
#### Snippet
```java
    public Response toResponse(NotFoundException e) {
        System.out.println("Exception mapper successfully got an exception: " + e + ":" + e.getMessage());
        System.out.println("Client IP is " + RpcContext.getContext().getRemoteAddressString());
        return Response.status(Response.Status.NOT_FOUND).entity("Oops! the requested resource is not found!").type("text/plain").build();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/NonDubboRestConsumer.java`
#### Snippet
```java

    private static void getUser(String url) {
        System.out.println("Getting user via " + url);
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/NonDubboRestConsumer.java`
#### Snippet
```java
                throw new RuntimeException("Failed with HTTP error code : " + response.getStatus());
            }
            System.out.println("Successfully got result: " + response.readEntity(String.class));
        } finally {
            response.close();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/NonDubboRestConsumer.java`
#### Snippet
```java

    private static void registerUser(String url, MediaType mediaType) {
        System.out.println("Registering user via " + url);
        User user = new User(1L, "larrypage");
        Client client = ClientBuilder.newClient();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/NonDubboRestConsumer.java`
#### Snippet
```java
                throw new RuntimeException("Failed with HTTP error code : " + response.getStatus());
            }
            System.out.println("Successfully got result: " + response.readEntity(String.class));
        } finally {
            response.close();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-webservice/dubbo-samples-webservice-provider/src/main/java/org/apache/dubbo/samples/webservice/provider/WebserviceProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-webservice/dubbo-samples-webservice-consumer/src/main/java/org/apache/dubbo/samples/webservice/consumer/WebserviceConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String result = demoService.hello("world");
        System.out.println(result);

    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/SpiCompatibleProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/SpiCompatibleConsumer.java`
#### Snippet
```java

        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/spi/CompatibleFilter.java`
#### Snippet
```java
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("Filter executed!!");
        invoked = true;
        return invoker.invoke(invocation);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/impl/DemoServiceImpl.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
                "...";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl2.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

        String hello = demoService.sayHello("world");
        System.out.println(hello);

        String hello2 = demoService2.sayHello("world again");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java

        String hello2 = demoService2.sayHello("world again");
        System.out.println(hello2);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " +
                name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/RateLimiterAction.java`
#### Snippet
```java
                    try {
                        Thread.sleep(40);
                        System.out.println(rateLimiterService.say("rateK" + (i++), "rateV" + i));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/RateLimiterAction.java`
#### Snippet
```java
                        e.printStackTrace();
                    } catch (Exception e) {
                        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<< " + e.getMessage() + " >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-environment-keys/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        System.in.read();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-environment-keys/src/main/java/org/apache/dubbo/samples/basic/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-environment-keys/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/spi/CompatibleRegistry.java`
#### Snippet
```java
    @Override
    public void subscribe(URL url, NotifyListener notifyListener) {
        System.out.println("Subscribing url from Compatible Registry......");
        delegate.subscribe(url, new NotifyListener.ReverseCompatibleNotifyListener(notifyListener));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/spi/CompatibleRegistry.java`
#### Snippet
```java
    @Override
    public void register(URL url) {
        System.out.println("Registering url to Compatible Registry......");
        delegate.register(url);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/spi/CompatibleRegistry.java`
#### Snippet
```java
    @Override
    public void unsubscribe(URL url, NotifyListener notifyListener) {
        System.out.println("Unsubscribing url from Compatible Registry......");
        delegate.subscribe(url, new NotifyListener.ReverseCompatibleNotifyListener(notifyListener));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/spi/CompatibleRegistry.java`
#### Snippet
```java
    @Override
    public void unregister(URL url) {
        System.out.println("Unregistering url from Compatible Registry......");
        delegate.unregister(url);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java

    private void doSayCircuitBreakerMethod(String tag, String name, int c, int l) {
        System.out.println("--------------------- start to run circuitBreak: " + tag + name + "---------------------");
        for (int i = 0; i < c; i++) {
            try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
            try {
                Thread.sleep(20);
                System.out.print(System.currentTimeMillis() + " - ");
                System.out.println(circuitBreakMethodWrapper.say(tag + "-" + name + "=" + l + ":" + i));
            } catch (InterruptedException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                Thread.sleep(20);
                System.out.print(System.currentTimeMillis() + " - ");
                System.out.println(circuitBreakMethodWrapper.say(tag + "-" + name + "=" + l + ":" + i));
            } catch (InterruptedException e) {
                e.printStackTrace();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                e.printStackTrace();
            } catch (CircuitBreakerOpenException t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
            } catch (Throwable t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                System.err.println("== " + l + ":" + i + " " + t.toString());
            } catch (Throwable t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java

    private void doSayCircuitBreaker(String tag, String name, int c, int l) {
        System.out.println("--------------------- start to run circuitBreak: " + tag + name + "---------------------");
        for (int i = 0; i < c; i++) {
            try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
            try {
                Thread.sleep(20);
                System.out.print(System.currentTimeMillis() + " - ");
                System.out.println(circuitBreakTypeWrapper.say(tag + "-" + name + "=" + l + ":" + i));
            } catch (InterruptedException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                Thread.sleep(20);
                System.out.print(System.currentTimeMillis() + " - ");
                System.out.println(circuitBreakTypeWrapper.say(tag + "-" + name + "=" + l + ":" + i));
            } catch (InterruptedException e) {
                e.printStackTrace();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                e.printStackTrace();
            } catch (CircuitBreakerOpenException t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
            } catch (Throwable t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                System.err.println("== " + l + ":" + i + " " + t.toString());
            } catch (Throwable t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-ssl/dubbo-samples-grpc-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/impl/helloworld/GrpcGreeterImpl.java`
#### Snippet
```java
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println("Executing thread is " + Thread.currentThread().getName());
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(reply);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-demo-servicediscovery-xml/servicediscovery-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java


        System.out.println("result: " + hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-demo-servicediscovery-xml/servicediscovery-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-ssl/dubbo-samples-grpc-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/SslBasicProvider.java`
#### Snippet
```java
        if (args.length > 0) {
            if (args.length < 2 || args.length > 3) {
                System.out.println(
                        "USAGE: BasicProvider certChainFilePath privateKeyFilePath " +
                                "[trustCertCollectionFilePath]\n Specify 'trustCertCollectionFilePath' only if you want " +
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-ssl/dubbo-samples-grpc-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/SslBasicProvider.java`
#### Snippet
```java
        bootstrap.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
         * greeter sample
         */
        System.out.println("-------- Start simple unary call test -------- ");
        RxDubboGreeterGrpc.IRxGreeter greeter = (RxDubboGreeterGrpc.IRxGreeter) context.getBean("greeter");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        greeter
            .sayHello(HelloRequest.newBuilder().setName("world!").build())
            .subscribe(reply -> System.out.println("Result: " + reply));

        System.out.println("-------- End simple unary call test -------- \n\n\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
            .subscribe(reply -> System.out.println("Result: " + reply));

        System.out.println("-------- End simple unary call test -------- \n\n\n");

        System.in.read();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-http/src/main/java/org/apache/dubbo/samples/http/HttpProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-http/src/main/java/org/apache/dubbo/samples/http/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
         * greeter sample
         */
        System.out.println("-------- Start simple unary call test -------- ");
        ReactorDubboGreeterGrpc.IReactorGreeter greeter = (ReactorDubboGreeterGrpc.IReactorGreeter) context.getBean("greeter");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
        greeter
            .sayHello(HelloRequest.newBuilder().setName("world!").build())
            .subscribe(reply -> System.out.println("Result: " + reply));

        System.out.println("-------- End simple unary call test -------- \n\n\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
            .subscribe(reply -> System.out.println("Result: " + reply));

        System.out.println("-------- End simple unary call test -------- \n\n\n");

        System.in.read();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-http/src/main/java/org/apache/dubbo/samples/http/HttpConsumer.java`
#### Snippet
```java
        DemoService demoService = (DemoService) context.getBean("demoService");
        String result = demoService.sayHello("world");
        System.out.println(result);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-impl/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/ThriftConsumer.java`
#### Snippet
```java
        for (int i = 0; i < 10; i++) {
            RpcContext.getContext().setAttachment("parm", "hehe" + i);
            System.out.println(demo.echoI32(i + 1));
            System.out.println(demo.echoBool(true));
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-impl/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/ThriftConsumer.java`
#### Snippet
```java
            RpcContext.getContext().setAttachment("parm", "hehe" + i);
            System.out.println(demo.echoI32(i + 1));
            System.out.println(demo.echoBool(true));
        }
        context.close();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-impl/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/ThriftProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-impl/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/DemoServiceImpl.java`
#### Snippet
```java
        Map<String, String> attachments = RpcContext.getContext().getAttachments();
        String parm = (String) attachments.get("parm");
        System.out.println("parm：" + parm);
        return arg;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/Resilience4jAnnotationConsumer.java`
#### Snippet
```java
        AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
        String hello = annotationAction.doSayHello("world");
        System.out.println("result :" + hello);
//        annotationAction.sayCircuitBreaker("circuitBreaker");
        annotationAction.sayRateLimiter("rateLimiter", "Just Happy!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/serialization/dubbo-samples-protobuf/protobuf-consumer/src/main/java/org/apache/dubbo/demo/consumer/ConsumerApplication.java`
#### Snippet
```java
        HelloRequest request = HelloRequest.newBuilder().setName("Hello").build();
        HelloReply reply = demoService.sayHello(request);
        System.out.println("result: " + reply.getMessage());
        System.in.read();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/filter/Resilience4jRateLimiterFilter.java`
#### Snippet
```java
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        try {
            System.out.println("**************** Enter RateLimiter ****************");
            RateLimiter.waitForPermission(rateLimiter);
            return invoker.invoke(invocation);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/filter/Resilience4jRateLimiterFilter.java`
#### Snippet
```java
            return invoker.invoke(invocation);
        } catch (RequestNotPermitted rnp) {
            System.err.println("---------------- Rate Limiter! Try it later! ----------------");
            throw rnp;
        } catch (Throwable throwable) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/filter/Resilience4jRateLimiterFilter.java`
#### Snippet
```java
            throw rnp;
        } catch (Throwable throwable) {
            System.err.println("........" + throwable.getMessage());
            throw throwable;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/impl/helloworld/GrpcGreeterImpl.java`
#### Snippet
```java
    @Override
    public Mono<HelloReply> sayHello(Mono<HelloRequest> request) {
        System.out.println("Executing thread is " + Thread.currentThread().getName());
        return request
                .map(HelloRequest::getName)
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/impl/helloworld/GrpcGreeterImpl.java`
#### Snippet
```java
                .map(name -> {
                    String greeting = "Hello " + name;
                    System.out.println("Returning " + greeting);
                    return greeting;
                })
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/filter/Resilience4jCircuitBreakerFilter.java`
#### Snippet
```java

    private void doCircuitBreakerOpenException(Throwable throwable, long count, long breakCount) {
        System.err.println("---------------------------- Open CircuitBreaker! Try it later! ----------------------------" + breakCount + " / " + count);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/filter/Resilience4jCircuitBreakerFilter.java`
#### Snippet
```java
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("**************** Enter CircuitBreaker ****************");
        long countLong = count.incrementAndGet();
        long start = 0;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/action/AnnotationAction.java`
#### Snippet
```java
                    try {
                        Thread.sleep(40);
                        System.out.println(rateLimiterService.say(name + (i++), value + i));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/action/AnnotationAction.java`
#### Snippet
```java
                        e.printStackTrace();
                    } catch (Exception e) {
                        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<< " + e.getMessage() + " >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/action/AnnotationAction.java`
#### Snippet
```java

    private void doSayCircuitBreaker(String tag, String name, int c, int l) {
        System.out.println("--------------------- start to run circuitBreak: " + tag + name + "---------------------");
        for (int i = 0; i < c; i++) {
            try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/action/AnnotationAction.java`
#### Snippet
```java
            try {
                Thread.sleep(20);
                System.out.print(System.currentTimeMillis() + " - ");
                System.out.println(circuitBreakerService.say(tag + "-" + name + "=" + l + ":" + i));
            } catch (InterruptedException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/action/AnnotationAction.java`
#### Snippet
```java
                Thread.sleep(20);
                System.out.print(System.currentTimeMillis() + " - ");
                System.out.println(circuitBreakerService.say(tag + "-" + name + "=" + l + ":" + i));
            } catch (InterruptedException e) {
                e.printStackTrace();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/action/AnnotationAction.java`
#### Snippet
```java
                e.printStackTrace();
            } catch (Throwable t) {
                System.err.println("==" + t.getMessage());
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/impl/helloworld/GrpcGreeterImpl.java`
#### Snippet
```java
    @Override
    public Single<HelloReply> sayHello(Single<HelloRequest> request) {
        System.out.println("Executing thread is " + Thread.currentThread().getName());
        return request
                .map(HelloRequest::getName)
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/impl/helloworld/GrpcGreeterImpl.java`
#### Snippet
```java
                .map(name -> {
                    String greeting = "Hello " + name;
                    System.out.println("Returning " + greeting);
                    return greeting;
                })
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-provider1/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
    private static void call(ClassPathXmlApplicationContext context) {
        DemoService demoServiceFromNormal = context.getBean("demoServiceFromNormal", DemoService.class);
        System.out.println("result: " + demoServiceFromNormal.sayHello("name"));
        DemoService demoServiceFromService = context.getBean("demoServiceFromService", DemoService.class);
        System.out.println("result: " + demoServiceFromService.sayHello("name"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
        System.out.println("result: " + demoServiceFromNormal.sayHello("name"));
        DemoService demoServiceFromService = context.getBean("demoServiceFromService", DemoService.class);
        System.out.println("result: " + demoServiceFromService.sayHello("name"));
        DemoService demoServiceFromDual = context.getBean("demoServiceFromDual", DemoService.class);
        System.out.println("result: " + demoServiceFromDual.sayHello("name"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
        System.out.println("result: " + demoServiceFromService.sayHello("name"));
        DemoService demoServiceFromDual = context.getBean("demoServiceFromDual", DemoService.class);
        System.out.println("result: " + demoServiceFromDual.sayHello("name"));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-provider2/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-ssl/dubbo-samples-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-zipkin/src/main/java/org/apache/dubbo/samples/service/hello/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-ssl/dubbo-samples-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/SslBasicProvider.java`
#### Snippet
```java
        if (args.length > 0) {
            if (args.length < 2 || args.length > 3) {
                System.out.println(
                        "USAGE: BasicProvider certChainFilePath privateKeyFilePath " +
                                "[trustCertCollectionFilePath]\n Specify 'trustCertCollectionFilePath' only if you want " +
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-ssl/dubbo-samples-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/SslBasicProvider.java`
#### Snippet
```java
        bootstrap.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-zipkin/src/main/java/org/apache/dubbo/samples/client/Application.java`
#### Snippet
```java
        Future<?> future = RpcContext.getContext().getFuture();

        System.out.println(future.get());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-zipkin/src/main/java/org/apache/dubbo/samples/service/greeting/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-spring-hystrix/src/main/java/org/apache/dubbo/samples/annotation/AnnotationProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-spring-hystrix/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumer.java`
#### Snippet
```java
        AnnotationAction annotationAction = context.getBean("annotationAction", AnnotationAction.class);
        String hello = annotationAction.doSayHello("world");
        System.out.println("result :" + hello);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/BasicProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/BasicProvider2.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-spring-boot-hystrix/src/main/java/org/apache/dubbo/spring/boot/consumer/ConsumerApplication.java`
#### Snippet
```java

        String result = application.doSayHello("world");
        System.out.println("result: " + result);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/BasicConsumer.java`
#### Snippet
```java
        for (int index = 0; index < 100; index++) {
            String result = demoService.sayHello("java");
            System.out.println(result);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-spring-boot-hystrix/src/main/java/org/apache/dubbo/spring/boot/provider/ProviderApplication.java`
#### Snippet
```java
        SpringApplication.run(ProviderApplication.class, args);

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-provider/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-consumer/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
        GreetingService greetingService = context.getBean("greetingService", GreetingService.class);
        String hello = greetingService.hello();
        System.out.println("result from application-level address: " + hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/servicediscovery-transfer/servicediscovery-transfer-consumer-old/src/main/java/org/apache/dubbo/demo/consumer/Application.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world");
        System.out.println("result from interface-level address: " + hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/filter/LegacyBlockFilter.java`
#### Snippet
```java

        if (result.hasException()) {
            System.out.println("LegacyBlockFilter: This will only happen when the real exception returns: " + result.getException());
            logger.warn("This will only happen when the real exception returns", result.getException());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java
        CountDownLatch latch = new CountDownLatch(1);
        future.whenComplete((v, t) -> {
            System.out.println((String) RpcContext.getServerContext().getAttachment("server-key1"));
            if (t != null) {
                logger.warn("Exception: ", t);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/filter/LegacyListenableFilter.java`
#### Snippet
```java
        @Override
        public void onResponse(Result appResponse, Invoker<?> invoker, Invocation invocation) {
            System.out.println("Callback received in ListenableFilter.onResponse .");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-migration/dubbo-samples-migration-provider/src/main/java/org/apache/dubbo/migration/provider/ApiProvider.java`
#### Snippet
```java
                .start();
        
        System.out.println("dubbo service started.");
        bootstrap.await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-rest-withtoken/dubbo-samples-rest-withtoken-consumer/src/main/java/org/apache/dubbo/rest/withtoken/consumer/Application.java`
#### Snippet
```java
        Application application = context.getBean(Application.class);
        String result = application.doSayHello("world");
        System.out.println("result: " + result);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java

        CompletableFuture<String> future = greetingService.greeting("async call request", SIGNAL);
        System.out.println("async call returned: " + future.get());

        System.out.println(greetingService.greeting("normal sync call request"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java
        System.out.println("async call returned: " + future.get());

        System.out.println(greetingService.greeting("normal sync call request"));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/AnnotationProviderBootstrap.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started.");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/impl/GreetingsServiceImpl.java`
#### Snippet
```java
    @Override
    public String greeting(String name) {
        System.out.println("provider received: " + name);
        try {
            Thread.sleep(50);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/impl/GreetingsServiceImpl.java`
#### Snippet
```java
            e.printStackTrace();
        }
        System.out.println("provider returned.");
        return replyGreeting(name);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/impl/AnnotationGreetingServiceImpl.java`
#### Snippet
```java

    public String replyGreeting(String name) {
        System.out.println("provider received invoke of replyGreeting: " + name);
        sleepWhile();
        return "Annotation, fine " + name;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/impl/AnnotationGreetingServiceImpl.java`
#### Snippet
```java
    @Override
    public String greeting(String name) {
        System.out.println("provider received invoke of greeting: " + name);
        sleepWhile();
        return "Annotation, greeting " + name;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-docker/src/main/java/org/apache/dubbo/samples/docker/DubboApplication.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(DubboApplication.class).web(false).run(args);
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/impl/AnnotationHelloServiceImpl.java`
#### Snippet
```java

    public String sayGoodbye(String name) {
        System.out.println("provider received invoke of sayGoodbye: " + name);
        sleepWhile();
        return "Goodbye, " + name;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/impl/AnnotationHelloServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("provider received invoke of sayHello: " + name);
        sleepWhile();
        return "Annotation, hello " + name;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/impl/NotifyImpl.java`
#### Snippet
```java
    @Override
    public void oninvoke(String request) {
        System.out.println("oninvoke - request: " + request);
        invokes.add(request);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/impl/NotifyImpl.java`
#### Snippet
```java
    @Override
    public void onthrow(Throwable ex, String request) {
        System.out.println("onthrow - request: " + request + ", exception: " + ex);
        exceptions.put(request, ex);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/impl/NotifyImpl.java`
#### Snippet
```java
    @Override
    public void onreturn(String response, String request) {
        System.out.println("onreturn - req: " + request + ", res: " + response);
        returns.put(request, response);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumerBootstrap.java`
#### Snippet
```java
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");

        System.out.println("hello : " + annotationAction.doSayHello("world"));
        System.out.println("goodbye : " + annotationAction.doSayGoodbye("world"));
        System.out.println("greeting : " + annotationAction.doGreeting("world"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumerBootstrap.java`
#### Snippet
```java

        System.out.println("hello : " + annotationAction.doSayHello("world"));
        System.out.println("goodbye : " + annotationAction.doSayGoodbye("world"));
        System.out.println("greeting : " + annotationAction.doGreeting("world"));
        System.out.println("reply : " + annotationAction.replyGreeting("world"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumerBootstrap.java`
#### Snippet
```java
        System.out.println("hello : " + annotationAction.doSayHello("world"));
        System.out.println("goodbye : " + annotationAction.doSayGoodbye("world"));
        System.out.println("greeting : " + annotationAction.doGreeting("world"));
        System.out.println("reply : " + annotationAction.replyGreeting("world"));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/AnnotationConsumerBootstrap.java`
#### Snippet
```java
        System.out.println("goodbye : " + annotationAction.doSayGoodbye("world"));
        System.out.println("greeting : " + annotationAction.doGreeting("world"));
        System.out.println("reply : " + annotationAction.replyGreeting("world"));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-context/src/main/java/org/apache/dubbo/samples/context/ContextProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-context/src/main/java/org/apache/dubbo/samples/context/ContextConsumer.java`
#### Snippet
```java

        String hello = contextService.sayHello("world");
        System.out.println("result: " + hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/MockProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        // press any key to exit
        System.in.read();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/AsyncProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/zk/Configurator.java`
#### Snippet
```java
                + "...\n";

        System.out.println(str);

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/impl/AsyncServiceImpl.java`
#### Snippet
```java
    @Override
    public String sayHello(String name) {
        System.out.println("async provider received: " + name);
        return "hello, " + name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/filter/OnErrorThrowableAsyncFilter.java`
#### Snippet
```java
    @Override
    public void onError(Throwable t, Invoker<?> invoker, Invocation invocation) {
        System.out.println("OnErrorThrowableAsyncFilter onError executed: " + t.getMessage());
        if (invocation != null) {
            throw new RuntimeException("Exception from onError");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/filter/OnResponseThrowableAsyncFilter.java`
#### Snippet
```java
    @Override
    public void onError(Throwable t, Invoker<?> invoker, Invocation invocation) {
        System.out.println("OnResponseThrowableAsyncFilter onError executed: " + t.getMessage());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/filter/OnResponseThrowableAsyncFilter.java`
#### Snippet
```java
    @Override
    public void onResponse(Result appResponse, Invoker<?> invoker, Invocation invocation) {
        System.out.println("onResponse received value : " + appResponse.getValue());
        if (invocation != null) {
            throw new RuntimeException("Exception from onResponse");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/filter/ProviderErrorAsyncFilter.java`
#### Snippet
```java
    @Override
    public void onError(Throwable t, Invoker<?> invoker, Invocation invocation) {
        System.out.println("ProviderErrorAsyncFilter onError executed: " + t.getMessage());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/filter/NormalAsyncFilter.java`
#### Snippet
```java
    @Override
    public void onError(Throwable t, Invoker<?> invoker, Invocation invocation) {
        System.out.println("NormalAsyncFilter onError executed: " + t.getMessage());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/filter/NormalAsyncFilter.java`
#### Snippet
```java
    @Override
    public void onResponse(Result appResponse, Invoker<?> invoker, Invocation invocation) {
        System.out.println("normal async received result: " + appResponse.getValue());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/filter/ThrowableAsyncFilter.java`
#### Snippet
```java
    @Override
    public void onError(Throwable t, Invoker<?> invoker, Invocation invocation) {
        System.out.println("ThrowableAsyncFilter onError executed: " + t.getMessage());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/filter/NormalSyncFilter.java`
#### Snippet
```java
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Result result = invoker.invoke(invocation);
        System.out.println("Normal sync filter, the value may be null: " + result.getValue());
        return result;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/AsyncProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java
        AsyncService asyncService = context.getBean("asyncService", AsyncService.class);

        System.out.println(asyncService.sayHello("async call request"));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/EmbeddedAsyncProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/GroupConsumer.java`
#### Snippet
```java

        String resultGroupA = groupAService.sayHello("world");
        System.out.println(resultGroupA);

        String resultGroupB = groupBService.sayHello("world");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/GroupConsumer.java`
#### Snippet
```java

        String resultGroupB = groupBService.sayHello("world");
        System.out.println(resultGroupB);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/impl/GroupBServiceImpl.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress() + "in groupB");
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress() + " in group B";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/impl/GroupAServiceImpl.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress() + "in groupA");
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress() + " in group A";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/GroupProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-local/src/main/java/org/apache/dubbo/samples/local/LocalDemo.java`
#### Snippet
```java
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo.xml");
        context.start();
        System.out.println("dubbo service started");

        DemoService demoService = context.getBean("demoService", DemoService.class);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-local/src/main/java/org/apache/dubbo/samples/local/LocalDemo.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String hello = demoService.sayHello("world");
        System.out.println(hello);
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-local/src/main/java/org/apache/dubbo/samples/local/impl/DemoServiceImpl.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-direct/src/main/java/org/apache/dubbo/samples/direct/impl/DirectServiceImpl.java`
#### Snippet
```java

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " +
                name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-direct/src/main/java/org/apache/dubbo/samples/direct/DirectConsumer.java`
#### Snippet
```java
        DirectService directService = (DirectService) context.getBean("directService");
        String hello = directService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/CallbackProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-direct/src/main/java/org/apache/dubbo/samples/direct/DirectProvider.java`
#### Snippet
```java
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-direct-provider.xml");
        context.start();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/CallbackConsumer.java`
#### Snippet
```java

        CallbackService callbackService = context.getBean("callbackService", CallbackService.class);
        callbackService.addListener("foo.bar", msg -> System.out.println("callback:" + msg));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/AttachmentConsumer.java`
#### Snippet
```java

        String hello = attachmentService.sayHello("world");
        System.out.println(hello);

        // attachment only affective once
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/AttachmentConsumer.java`
#### Snippet
```java
        // attachment only affective once
        hello = attachmentService.sayHello("world");
        System.out.println(hello);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/impl/AttachmentImpl.java`
#### Snippet
```java
        // the attachment will be remove after this
        String index = (String) context.getAttachment("index");
        System.out.println("receive attachment index: " + index);

        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/impl/AttachmentImpl.java`
#### Snippet
```java
        System.out.println("receive attachment index: " + index);

        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
                ", request from consumer: " + context.getRemoteAddress());
        return "Hello " + name + ", response from provider: " + context.getLocalAddress() +
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/AttachmentProvider.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started.");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/RpcContextProvider2.java`
#### Snippet
```java
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-rpccontext-provider2.xml");
        context.start();
        System.out.println("Rpc context provider2 started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/RpcContextProvider1.java`
#### Snippet
```java
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-rpccontext-provider1.xml");
        context.start();
        System.out.println("Rpc context provider1 started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-cloud-native/dubbo-call-scdubbo/dubbo-scdubbo-provider2/src/main/java/org/apache/dubbo/demo/provider/Application.java`
#### Snippet
```java
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/impl/RpcContextImpl1.java`
#### Snippet
```java
        Service1DTO service1DTO = new Service1DTO();
        String consumerReq = RpcContext.getServerAttachment().getAttachment(RpcContextUtils.consumer_req_key);
        System.out.println("get request from consumer："+ consumerReq);
        ReferenceConfig<RpcContextService2> ref = new ReferenceConfig<>();
        ref.setInterface(RpcContextService2.class);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/impl/RpcContextImpl1.java`
#### Snippet
```java
        Service2DTO service2DTO = greeterSayHi.sayHi();
        String provider2Res = (String)RpcContext.getClientResponseContext().getObjectAttachment(RpcContextUtils.provider2_res_key);
        System.out.println("get response from provider2："+ provider2Res);
        RpcContext.getServerResponseContext().setObjectAttachment(RpcContextUtils.provider1_res_key, RpcContextUtils.provider1_res_key);
        service1DTO.setConsumerReq(consumerReq);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/impl/RpcContextImpl2.java`
#### Snippet
```java
        Service2DTO service2DTO = new Service2DTO();
        String consumerReq = RpcContext.getServerAttachment().getAttachment(RpcContextUtils.consumer_req_key);
        System.out.println("get request from consumer："+ consumerReq);
        String provider1Req =  (String) RpcContext.getServerAttachment().getObjectAttachment(RpcContextUtils.provider1_req_key);
        System.out.println("get request from provider1："+ provider1Req);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/impl/RpcContextImpl2.java`
#### Snippet
```java
        System.out.println("get request from consumer："+ consumerReq);
        String provider1Req =  (String) RpcContext.getServerAttachment().getObjectAttachment(RpcContextUtils.provider1_req_key);
        System.out.println("get request from provider1："+ provider1Req);
        RpcContext.getServerResponseContext().setAttachment(RpcContextUtils.provider2_res_key, RpcContextUtils.provider2_res_key);
        service2DTO.setConsumerReq(consumerReq);
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `3-extensions/serialization/dubbo-samples-protostuff/dubbo-samples-protostuff-provider/src/main/java/org/dubbo/samples/protostuff/provider/service/UserService.java`
#### Snippet
```java
import java.util.UUID;

@DubboService(protocol = "dubbo", dynamic = true)
public class UserService implements IUserService {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/action/AnnotationAction.java`
#### Snippet
```java
public class AnnotationAction {

    @DubboReference(version = "1.1.8", group = "d-test", owner = "vvvanno", retries = 4, actives = 6, timeout = 4500, init = true)
    private AnnotationService annotationService;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/action/AnnotationAction.java`
#### Snippet
```java
public class AnnotationAction {

    @DubboReference(version = "1.1.1", group = "d-test", init = true)
    private AnnotationService annotationService;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/AnnotationConsumer.java`
#### Snippet
```java

    @Configuration
    @EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.configcenter.annotation.action", multipleConfig = true)
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = {"org.apache.dubbo.samples.configcenter.annotation.action"})
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/action/AnnotationAction.java`
#### Snippet
```java
public class AnnotationAction {

    @DubboReference(version = "1.1.8", group = "d-test", init = true)
    private AnnotationService annotationService;

```

## RuleId[ruleID=ImplicitArrayToString]
### ImplicitArrayToString
Call to 'toString()' on array
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String stringArray(String[] bytes) {
        return bytes.toString();
    }
}
```

### ImplicitArrayToString
Call to 'toString()' on array
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/impl/DemoServiceImpl.java`
#### Snippet
```java
    @Override
    public String stringArray(String[] bytes) {
        return bytes.toString();
    }
}
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/filter/LegacyListenableFilter.java`
#### Snippet
```java

    public LegacyListenableFilter() {
        super.listener = new CallbackListener();
    }

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
    private static void removeInterfaceData(Class interfaceClazz) {
        try {
            client.delete().forPath("/dubbo/" + interfaceClazz.getName().replaceAll("\\.", "/"));
        } catch (Exception e) {
            e.printStackTrace();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/ZKTools2.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/ZKTools2.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/ZKTools.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
            return path;
        }
        return path.replace("/dubbo/config/", "").replaceAll("/", ".");
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `99-integration/dubbo-samples-mybatis/dubbo-samples-spring-boot-mybatis-api/src/main/java/org/apache/dubbo/springboot/mybatis/samples/User.java`
#### Snippet
```java

@Data
public class User implements java.io.Serializable {
    private long id;
    private String name;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `99-integration/dubbo-samples-hibernate/dubbo-samples-spring-boot-hibernate-api/src/main/java/org/apache/dubbo/springboot/hibernate/samples/User.java`
#### Snippet
```java

@Data
public class User implements java.io.Serializable {
    private Long id;
    private String name;
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.math.BigInteger;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-detail-gray/src/main/java/org/apache/dubbo/samples/detail/DetailServiceImplGray.java`
#### Snippet
```java
import org.apache.dubbo.samples.Item;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

```

### UNUSED_IMPORT
Unused import `import org.apache.dubbo.rpc.RpcContext;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-detail-v1/src/main/java/org/apache/dubbo/samples/detail/DetailServiceImpl.java`
#### Snippet
```java
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.samples.CommentService;
import org.apache.dubbo.samples.DetailService;
```

### UNUSED_IMPORT
Unused import `import org.apache.dubbo.rpc.RpcContext;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-detail-v2/src/main/java/org/apache/dubbo/samples/detail/DetailServiceImpl2.java`
#### Snippet
```java
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.samples.CommentService;
import org.apache.dubbo.samples.DetailService;
```

### UNUSED_IMPORT
Unused import `import org.springframework.stereotype.Component;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/BenchmarkClient.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
```

### UNUSED_IMPORT
Unused import `import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/FrontEndApplication.java`
#### Snippet
```java
package org.apache.dubbo.samples.frontend;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.boot.SpringApplication;
```

### UNUSED_IMPORT
Unused import `import org.apache.dubbo.config.annotation.DubboService;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/ShopServiceImpl.java`
#### Snippet
```java

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.samples.DetailService;
```

### UNUSED_IMPORT
Unused import `import org.apache.dubbo.rpc.RpcContext;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/ShopServiceImpl.java`
#### Snippet
```java
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.samples.DetailService;
import org.apache.dubbo.samples.Item;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.ThreadLocalRandom;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-order-gray/src/main/java/org/apache/dubbo/samples/order/OrderServiceImplGray.java`
#### Snippet
```java
import org.apache.dubbo.samples.OrderService;

import java.util.concurrent.ThreadLocalRandom;

@DubboService
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.ThreadLocalRandom;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-order-v1/src/main/java/org/apache/dubbo/samples/order/OrderServiceImpl.java`
#### Snippet
```java
import org.apache.dubbo.samples.OrderService;

import java.util.concurrent.ThreadLocalRandom;

@DubboService
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.ThreadLocalRandom;`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-order-v2/src/main/java/org/apache/dubbo/samples/order/OrderServiceImpl2.java`
#### Snippet
```java
import org.apache.dubbo.samples.OrderService;

import java.util.concurrent.ThreadLocalRandom;

@DubboService
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.CountDownLatch;`
in `2-advanced/dubbo-samples-autowire/dubbo-samples-autowire-provider/src/main/java/org/apache/dubbo/samples/autowire/provider/ProviderBootstrap.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
```

### UNUSED_IMPORT
Unused import `import org.springframework.context.support.ClassPathXmlApplicationContext;`
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-provider/src/main/java/org/apache/dubbo/samples/cache/CacheProvider.java`
#### Snippet
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.CountDownLatch;`
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-provider/src/main/java/org/apache/dubbo/samples/cache/CacheProvider.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
```

### UNUSED_IMPORT
Unused import `import org.springframework.stereotype.Component;`
in `2-advanced/dubbo-samples-notify/dubbo-samples-notify-consumer/src/main/java/org/apache/dubbo/samples/notify/consumer/Task.java`
#### Snippet
```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// @Component
```

### UNUSED_IMPORT
Unused import `import org.apache.dubbo.config.annotation.Method;`
in `2-advanced/dubbo-samples-notify/dubbo-samples-notify-provider/src/main/java/org/apache/dubbo/samples/notify/provider/DemoServiceImpl.java`
#### Snippet
```java

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.samples.notify.DemoService;

```

### UNUSED_IMPORT
Unused import `import javax.annotation.PreDestroy;`
in `4-governance/dubbo-samples-tracing/dubbo-samples-tracing-consumer/src/main/java/org/apache/dubbo/springboot/demo/consumer/ObservationConfiguration.java`
#### Snippet
```java

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collections;

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-configcenter/src/main/java/org/apache/dubbo/samples/configcenter/util/NacosUtils.java`
#### Snippet
```java
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("dubbo.registry.address=")) {
                    line = "dubbo.registry.address=nacos://" + serverAddr + ":8848?username=nacos&password=nacos";
```

## RuleId[ruleID=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/MetricsConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);

        while (true) {
            try {
                Thread.sleep(3000);
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
        GreetingsService greetingsService = (GreetingsService) context.getBean("greetingsService");

        while (true) {
            try {
                String message = greetingsService.sayHi("dubbo");
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/BenchmarkClient.java`
#### Snippet
```java
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                while (true) {
                    try {
                        List<String> names = Arrays.asList("John", "Mike", "Kevin", "Grace", "Mark");
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/BenchmarkClient.java`
#### Snippet
```java
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                while (true) {
                    try {
                        List<String> names = Arrays.asList("John", "Mike", "Kevin", "Grace", "Mark");
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/BenchmarkClient.java`
#### Snippet
```java
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                while (true) {
                    try {
                        long sku = ThreadLocalRandom.current().nextLong();
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/BenchmarkClient.java`
#### Snippet
```java
        for (int i = 0; i < 50; i++) {
            executorService.submit(() -> {
                while (true) {
                    try {
                        long sku = ThreadLocalRandom.current().nextLong();
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/MetricsConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);

        while (true) {
            try {
                Thread.sleep(3000);
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/StartProviderAndConsumer.java`
#### Snippet
```java
        DemoService demoService = context.getBean("demoService", DemoService.class);

        while (true) {
            try {
                Thread.sleep(3000);
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `1-basic/dubbo-samples-api/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java

        GreetingsService service = reference.get();
        while (true) {
            try {
                String message = service.sayHi("dubbo");
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
    public static void chinese(ClassPathXmlApplicationContext context) {
        executorService.submit(() -> {
            while (true) {
                try {
                    RpcContext.getContext().setAttachment(TAG_KEY, "tag1");
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
    public static void lion(ClassPathXmlApplicationContext context) {
        executorService.submit(() -> {
            while (true) {
                LionService lionService = (LionService) context.getBean("lionService");
                System.out.println(lionService.lion());
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
    public static void cat(ClassPathXmlApplicationContext context) {
        executorService.submit(() -> {
            while (true) {
                CatService catService = (CatService) context.getBean("catService");
                System.out.println(catService.cat());
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
    public static void american(ClassPathXmlApplicationContext context) {
        executorService.submit(() -> {
            while (true) {
                try {
                    RpcContext.getContext().setAttachment(TAG_KEY, "tag1");
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
    public static void dog(ClassPathXmlApplicationContext context) {
        executorService.submit(() -> {
            while (true) {
                try {
                    RpcContext.getContext().setAttachment(TAG_KEY, "tag1");
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
    public static void tiger(ClassPathXmlApplicationContext context) {
        executorService.submit(() -> {
            while (true) {
                TigerService tigerService = (TigerService) context.getBean("tigerService");
                System.out.println(tigerService.tiger());
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        context.start();
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
        while (true) {
            try {
                String hello = greetingServiceConsumer.doSayHello("xDS Consumer");
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java
                }
                else {
                    ex.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/util/StdoutStreamObserver.java`
#### Snippet
```java
    public void onError(Throwable throwable) {
        LOGGER.error("{} stream onError", name, throwable);
        throwable.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/pojo/PojoGreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/GreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                streamObserver.onError(new IllegalStateException("Stream err"));
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/GreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                replyStream.onError(new IllegalStateException("Stream err"));
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/GreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                replyStream.onError(new IllegalStateException("Stream err"));
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/GreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                replyStream.onError(new IllegalStateException("Stream err"));
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/GreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/client/GrpcGreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/client/GrpcGreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                streamObserver.onError(new IllegalStateException("Stream err"));
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/client/GrpcGreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/MetricsConsumer.java`
#### Snippet
```java
                System.out.println(hello.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
                Thread.sleep(1000);
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-spring-boot/dubbo-samples-spring-boot-consumer/src/main/java/org/apache/dubbo/springboot/demo/consumer/Task.java`
#### Snippet
```java
                    System.out.println(new Date() + " Receive result ======> " + demoService.sayHello("world"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-consumer/src/main/java/org/apache/dubbo/samples/generic/call/GenericImplConsumer.java`
#### Snippet
```java
            System.out.println(syncCallResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/FooConsumerBootstrap.java`
#### Snippet
```java
                }
                else {
                    ex.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-provider/src/main/java/org/apache/dubbo/samples/generic/call/impl/HelloServiceImpl.java`
#### Snippet
```java
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            future.complete(person);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-provider/src/main/java/org/apache/dubbo/samples/generic/call/impl/HelloServiceImpl.java`
#### Snippet
```java
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            future.complete(genericType);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-provider/src/main/java/org/apache/dubbo/samples/generic/call/impl/HelloServiceImpl.java`
#### Snippet
```java
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            future.complete("sayHelloAsync: " + name);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/AsyncTask.java`
#### Snippet
```java
        future1.whenComplete((v, t) -> {
            if (t != null) {
                t.printStackTrace();
            } else {
                System.out.println("AsyncTask Response-1: " + v);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/AsyncTask.java`
#### Snippet
```java
        future2.whenComplete((v, t) -> {
            if (t != null) {
                t.printStackTrace();
            } else {
                System.out.println("AsyncTask Response-2: " + v);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/AsyncTask.java`
#### Snippet
```java
        future3.whenComplete((v, t) -> {
            if (t != null) {
                t.printStackTrace();
            } else {
                System.out.println("AsyncTask Response-3: " + v);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/MetricsConsumer.java`
#### Snippet
```java
                System.out.println(hello.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/StartProviderAndConsumer.java`
#### Snippet
```java
                System.out.println(hello.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-api/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
                Thread.sleep(1000);
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/ZkUtil.java`
#### Snippet
```java
            return client.getChildren().forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/ZkUtil.java`
#### Snippet
```java
            return client.getChildren().forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/ZkUtil.java`
#### Snippet
```java
            return client.getChildren().forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/BasicConsumer.java`
#### Snippet
```java
                features = RouteGuideUtil.parseFeatures(RouteGuideUtil.getDefaultFeaturesFile());
            } catch (IOException ex) {
                ex.printStackTrace();
                return;
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/ZkUtil.java`
#### Snippet
```java
            return client.getChildren().forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-middle/src/main/java/org/apache/dubbo/samples/chain/impl/AmericanServiceImpl.java`
#### Snippet
```java
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(catService.getName());
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/DogServiceImpl.java`
#### Snippet
```java
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am a Dog!");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-backend/src/main/java/org/apache/dubbo/samples/chain/impl/DogServiceImpl.java`
#### Snippet
```java
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Woof Woof!");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
            client.delete().forPath("/dubbo/" + interfaceClazz.getName().replaceAll("\\.", "/"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/ZKTools.java`
#### Snippet
```java
            client.delete().forPath(getParent(CONSUMER_DUBBO_PROPERTIES_PATH));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                    Thread.sleep(interval);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                    Thread.sleep(interval);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                    Thread.sleep(interval);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-api/src/main/java/org/apache/dubbo/samples/ZKTools2.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-multi-registries/src/main/java/org/apache/dubbo/samples/configcenter/multiregistries/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/spring/MyEnvironmentPostProcessor.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
                Thread.sleep(100);
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl.java`
#### Snippet
```java
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-tagrouter/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
            configService = NacosFactory.createConfigService(properties);
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-nacos/dubbo-samples-nacos-override/src/main/java/org/apache/dubbo/samples/governance/util/NacosUtils.java`
#### Snippet
```java
            configService = NacosFactory.createConfigService(properties);
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/util/StdoutStreamObserver.java`
#### Snippet
```java
    public void onError(Throwable throwable) {
        LOGGER.error("{} stream onError", name, throwable);
        throwable.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
            setData(path, streamToString(yamlStream));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/impl/DemoServiceImpl.java`
#### Snippet
```java
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-provider/src/main/java/org/apache/dubbo/samples/impl/GreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                replyStream.onError(new IllegalStateException("Stream err"));
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-provider/src/main/java/org/apache/dubbo/samples/impl/GreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                replyStream.onError(new IllegalStateException("Stream err"));
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-provider/src/main/java/org/apache/dubbo/samples/impl/GreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                streamObserver.onError(new IllegalStateException("Stream err"));
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-provider/src/main/java/org/apache/dubbo/samples/impl/GreeterImpl.java`
#### Snippet
```java
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                replyStream.onError(new IllegalStateException("Stream err"));
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationConsumer.java`
#### Snippet
```java
        } catch (ValidationException e) {
            System.err.println("Validation Save ERROR");
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/ValidationConsumer.java`
#### Snippet
```java
        } catch (ValidationException e) {
            System.err.println("Validation Delete ERROR");
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/AsyncConsumer.java`
#### Snippet
```java
                System.out.println("return value: " + retValue);
            } else {
                exception.printStackTrace();
            }
        });
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
        }catch (Exception e){
            System.out.println("error: " + e.getCause().getMessage());
            e.printStackTrace();
            result.put("status", "502");
            result.put("body", e.getCause().getMessage().getBytes());
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/ZkUtil.java`
#### Snippet
```java
            client.delete().forPath("/dubbo/config/dubbo/dubbo.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/ZkUtil.java`
#### Snippet
```java
            client.delete().forPath("/dubbo/config/dubbo/dubbo.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-configconditionrouter/src/main/java/org/apache/dubbo/samples/governance/ZKTools.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/RateLimiterAction.java`
#### Snippet
```java
                        System.out.println(rateLimiterService.say("rateK" + (i++), "rateV" + i));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<< " + e.getMessage() + " >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                System.out.println(circuitBreakMethodWrapper.say(tag + "-" + name + "=" + l + ":" + i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (CircuitBreakerOpenException t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
                System.out.println(circuitBreakTypeWrapper.say(tag + "-" + name + "=" + l + ":" + i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (CircuitBreakerOpenException t) {
                System.err.println("== " + l + ":" + i + " " + t.toString());
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/action/AnnotationAction.java`
#### Snippet
```java
                        System.out.println(rateLimiterService.say(name + (i++), value + i));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<< " + e.getMessage() + " >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/action/AnnotationAction.java`
#### Snippet
```java
                System.out.println(circuitBreakerService.say(tag + "-" + name + "=" + l + ":" + i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Throwable t) {
                System.err.println("==" + t.getMessage());
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `4-governance/dubbo-samples-meshrule-router/src/main/java/org/apache/dubbo/samples/governance/RuleUtil.java`
#### Snippet
```java
            setData(path, streamToString(yamlStream));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/impl/AsyncServiceImpl.java`
#### Snippet
```java
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "async response from provider.";
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/impl/GreetingsServiceImpl.java`
#### Snippet
```java
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("provider returned.");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/impl/AnnotationGreetingServiceImpl.java`
#### Snippet
```java
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/impl/AnnotationHelloServiceImpl.java`
#### Snippet
```java
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/action/AnnotationAction.java`
#### Snippet
```java
            return greetingService.greeting(name);
        } catch (Exception e) {
            e.printStackTrace();
            return "Throw Exception";
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/action/AnnotationAction.java`
#### Snippet
```java
            return helloService.sayGoodbye(name);
        } catch (Exception e) {
            e.printStackTrace();
            return "Throw Exception";
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/action/AnnotationAction.java`
#### Snippet
```java
            return helloService.sayHello(name);
        } catch (Exception e) {
            e.printStackTrace();
            return "Throw Exception";
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/action/AnnotationAction.java`
#### Snippet
```java
            return greetingService.replyGreeting(name);
        } catch (Exception e) {
            e.printStackTrace();
            return "Throw Exception";
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/impl/DemoServiceImpl.java`
#### Snippet
```java
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + name;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/zk/Configurator.java`
#### Snippet
```java
            setData(path, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/impl/AsyncServiceImpl.java`
#### Snippet
```java
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timed value";
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/impl/AsyncServiceImpl.java`
#### Snippet
```java
                logger.info("  embedded call result is " + embeddedCallResult);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            asyncContext.write("Hello " + name + ", "
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/impl/CallbackServiceImpl.java`
#### Snippet
```java
                    Thread.sleep(5000); // timely trigger change event
                } catch (Throwable t1) {
                    t1.printStackTrace();
                }
            }
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/client/GrpcGreeterImpl.java`
#### Snippet
```java
            StreamObserver<GreeterReply> responseObserver) {
        Context.current().addListener(
                context -> {
                    cancelResultMap.put("cancelBiStream2", true);
                }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/interop/client/GrpcGreeterImpl.java`
#### Snippet
```java
                                   StreamObserver<GreeterReply> responseObserver) {
        Context.current().addListener(
                context -> {
                    cancelResultMap.put("cancelServerStream", true);
                }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `10-task/dubbo-samples-develop/dubbo-samples-develop-consumer/src/main/java/org/apache/dubbo/samples/develop/AsyncTask.java`
#### Snippet
```java
        //consumer异步调用
        CompletableFuture<String> future3 =  CompletableFuture.supplyAsync(() -> {
            return asyncService.invoke("invoke call request3");
        });
        future3.whenComplete((v, t) -> {
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java


    private Thread circuitBreakerThread = new Thread(new Runnable() {
        @Override
        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/CircuitBreakerAction.java`
#### Snippet
```java
    });

    private Thread circuitBreakerMethodThread = new Thread(new Runnable() {
        @Override
        public void run() {
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-api/src/main/java/org/apache/dubbo/samples/chain/ZKTools.java`
#### Snippet
```java
    }

    private void onlineOffline() {

    }
```

### EmptyMethod
All implementations of this method are empty
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/api/ValidationService.java`
#### Snippet
```java
public interface ValidationService {

    void save(ValidationParameter parameter);

    void update(ValidationParameter parameter);
```

### EmptyMethod
All implementations of this method are empty
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/api/ValidationService.java`
#### Snippet
```java
    void save(ValidationParameter parameter);

    void update(ValidationParameter parameter);

    void delete(@Min(1) long id, @NotNull @Size(min = 2, max = 16) @Pattern(regexp = "^[a-zA-Z]+$") String operator);
```

### EmptyMethod
All implementations of this method are empty
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/api/ValidationService.java`
#### Snippet
```java
    void update(ValidationParameter parameter);

    void delete(@Min(1) long id, @NotNull @Size(min = 2, max = 16) @Pattern(regexp = "^[a-zA-Z]+$") String operator);

    /**
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // alas, we cannot check 'arg' because it's a primitive and you chose the non-beans generator.
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // alas, we cannot check 'arg' because it's a primitive and you chose the non-beans generator.
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // alas, we cannot check 'arg' because it's a primitive and you chose the non-beans generator.
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // alas, we cannot check 'arg' because it's a primitive and you chose the non-beans generator.
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // alas, we cannot check 'arg' because it's a primitive and you chose the non-beans generator.
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // alas, we cannot check 'arg' because it's a primitive and you chose the non-beans generator.
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
```

### EmptyMethod
The method is empty
in `3-extensions/protocol/dubbo-samples-thrift/dubbo-samples-thrift-api/src/main/java/org/apache/dubbo/samples/rpc/nativethrift/api/DemoService.java`
#### Snippet
```java
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
```

### EmptyMethod
All implementations of this method are empty
in `4-governance/dubbo-samples-ssl/dubbo-samples-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/api/DemoService.java`
#### Snippet
```java
    String sayHello(String name);

    void testVoid();

}
```

### EmptyMethod
The method is empty
in `99-integration/dubbo-samples-isolation-executor/src/main/java/org/apache/dubbo/samples/Application.java`
#### Snippet
```java

public class Application {
    public static void main(String[] args) {
    }
}
```

### EmptyMethod
The method is empty
in `99-integration/dubbo-samples-prefer-serialization-test/dubbo-samples-prefer-serialization-test-consumer/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java

public class FakeMain {
    public static void main(String[] args) {

    }
```

### EmptyMethod
The method is empty
in `99-integration/dubbo-samples-prefer-serialization-test-31x/dubbo-samples-prefer-serialization-test-31x-consumer/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java

public class FakeMain {
    public static void main(String[] args) {

    }
```

### EmptyMethod
The method is empty
in `99-integration/dubbo-samples-test-11096/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java

public class FakeMain {
    public static void main(String[] args) {

    }
```

### EmptyMethod
The method is empty
in `99-integration/dubbo-samples-test-11137/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java

public class FakeMain {
    public static void main(String[] args) {

    }
```

### EmptyMethod
The method is empty
in `99-integration/dubbo-samples-test-11159/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java

public class FakeMain {
    public static void main(String[] args) {

    }
```

### EmptyMethod
The method is empty
in `99-integration/dubbo-samples-test-9806/src/main/java/org/apache/dubbo/samples/FakeMain.java`
#### Snippet
```java

public class FakeMain {
    public static void main(String[] args) {

    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-notify/dubbo-samples-notify-provider/src/main/java/org/apache/dubbo/samples/notify/provider/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-autowire/dubbo-samples-autowire-provider/src/main/java/org/apache/dubbo/samples/autowire/provider/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-port-unification-netty3/src/main/java/org/apache/dubbo/samples/zookeeper/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/serialization/dubbo-samples-serialization/dubbo-samples-serialization-java/src/main/java/org/apache/dubbo/samples/serialization/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-empty-protection/src/main/java/org/apache/dubbo/samples/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-test-10704/src/main/java/org/apache/dubbo/samples/local/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/util/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/GreeterImpl.java`
#### Snippet
```java
    public StreamObserver<GreeterRequest> greetStream(StreamObserver<GreeterReply> replyStream) {
        return new StreamObserver<GreeterRequest>() {
            int n = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-router-chain-switch/src/main/java/org/apache/dubbo/samples/zookeeper/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-triple-reactor/src/main/java/org/apache/dubbo/samples/triple/reactor/util/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-cache/dubbo-samples-cache-provider/src/main/java/org/apache/dubbo/samples/cache/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-hibernate/dubbo-samples-spring-boot-hibernate-provider/src/main/java/org/apache/dubbo/springboot/hibernate/samples/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `4-governance/dubbo-samples-tracing/dubbo-samples-tracing-provider/src/main/java/org/apache/dubbo/springboot/demo/provider/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-type/src/main/java/org/apache/dubbo/samples/generic/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-impl/dubbo-samples-generic-impl-provider/src/main/java/org/apache/dubbo/samples/generic/call/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-mybatis/dubbo-samples-spring-boot-mybatis-provider/src/main/java/org/apache/dubbo/springboot/mybatis/samples/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/serialization/dubbo-samples-prefer-serialization/src/main/java/org/apache/dubbo/samples/prefer/serialization/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-generic/dubbo-samples-generic-call/dubbo-samples-generic-call-provider/src/main/java/org/apache/dubbo/samples/generic/call/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-switch-serialization-thread/src/main/java/org/apache/dubbo/samples/serialization/change/thread/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-nosimple/src/main/java/org/apache/dubbo/samples/simplified/registry/nosimple/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-xml/src/main/java/org/apache/dubbo/samples/simplified/registry/xml/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-properties/src/main/java/org/apache/dubbo/samples/simplified/registry/properties/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/registry/dubbo-samples-simplified-registry/dubbo-samples-simplified-registry-annotation/src/main/java/org/apache/dubbo/samples/simplified/annotation/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-configcenter/src/main/java/org/apache/dubbo/samples/metadatareport/configcenter/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-xml/src/main/java/org/apache/dubbo/samples/metadatareport/local/xml/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/provider/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/configcenter/dubbo-samples-configcenter-xml/src/main/java/org/apache/dubbo/samples/configcenter/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/configcenter/dubbo-samples-configcenter-apollo/src/main/java/org/apache/dubbo/samples/configcenter/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/configcenter/dubbo-samples-configcenter-annotation/src/main/java/org/apache/dubbo/samples/configcenter/annotation/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/configcenter/dubbo-samples-configcenter-multiprotocol/src/main/java/org/apache/dubbo/samples/configcenter/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/configcenter/dubbo-samples-configcenter-externalconfiguration/src/main/java/org/apache/dubbo/samples/externalconfiguration/provider/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/registry/dubbo-samples-default-config/src/main/java/org/apache/dubbo/samples/multi/registry/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/registry/dubbo-samples-multi-registry/src/main/java/org/apache/dubbo/samples/multi/registry/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `4-governance/dubbo-samples-tagrouter/src/main/java/org/apache/dubbo/samples/governance/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-provider/src/main/java/org/apache/dubbo/samples/impl/GreeterImpl.java`
#### Snippet
```java
    public StreamObserver<GreeterRequest> greetStream(StreamObserver<GreeterReply> replyStream) {
        return new StreamObserver<GreeterRequest>() {
            int n = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-validation/src/main/java/org/apache/dubbo/samples/validation/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-compatible/src/main/java/org/apache/dubbo/samples/compat/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-async/dubbo-samples-async-simple/src/main/java/org/apache/dubbo/samples/async/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-echo/src/main/java/org/apache/dubbo/samples/echo/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-annotation/src/main/java/org/apache/dubbo/samples/metadatareport/local/annotation/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-rest/src/main/java/org/apache/dubbo/samples/rest/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `99-integration/dubbo-samples-metadata-report/dubbo-samples-metadata-report-local-properties/src/main/java/org/apache/dubbo/samples/metadatareport/local/properties/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/spi/CompatibleFilter.java`
#### Snippet
```java
@Activate(group = {"provider", "consumer"})
public class CompatibleFilter implements Filter {
    public static boolean invoked = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-environment-keys/src/main/java/org/apache/dubbo/samples/basic/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-ssl/dubbo-samples-grpc-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-rxjava/src/main/java/org/apache/dubbo/samples/basic/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-reactor/src/main/java/org/apache/dubbo/samples/basic/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `4-governance/dubbo-samples-spring-hystrix/src/main/java/org/apache/dubbo/samples/annotation/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `4-governance/dubbo-samples-ssl/dubbo-samples-ssl-provider/src/main/java/org/apache/dubbo/samples/basic/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `4-governance/dubbo-samples-spring-boot-hystrix/src/main/java/org/apache/dubbo/spring/boot/provider/EmbeddedZooKeeper.java`
#### Snippet
```java
	 * Lifecycle phase. Default is 0.
	 */
	private int phase = 0;

	/**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-async/dubbo-samples-async-original-future/src/main/java/org/apache/dubbo/samples/async/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-migration/dubbo-samples-migration-provider/src/main/java/org/apache/dubbo/migration/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `1-basic/dubbo-samples-annotation/src/main/java/org/apache/dubbo/samples/annotation/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-async/dubbo-samples-async-generated-future/src/main/java/org/apache/dubbo/samples/async/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-context/src/main/java/org/apache/dubbo/samples/context/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-mock/src/main/java/org/apache/dubbo/samples/mock/zk/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-async/dubbo-samples-async-provider/src/main/java/org/apache/dubbo/samples/async/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-group/src/main/java/org/apache/dubbo/samples/group/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-scala/src/main/scala/org/apache/dubbo/samples/scala/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-local/src/main/java/org/apache/dubbo/samples/local/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-attachment/src/main/java/org/apache/dubbo/samples/attachment/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/EmbeddedZooKeeper.java`
#### Snippet
```java
     * Lifecycle phase. Default is 0.
     */
    private int phase = 0;

    /**
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `10-task/dubbo-samples-develop/dubbo-samples-develop-provider/src/main/java/org/apache/dubbo/samples/develop/AsyncServiceImpl.java`
#### Snippet
```java
                Thread.currentThread().interrupt();
            }
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `10-task/dubbo-samples-develop/dubbo-samples-develop-provider/src/main/java/org/apache/dubbo/samples/develop/AsyncServiceImpl.java`
#### Snippet
```java
            Thread.currentThread().interrupt();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `99-integration/dubbo-samples-test-10704/src/main/java/org/apache/dubbo/samples/local/impl/DemoServiceImpl.java`
#### Snippet
```java
            asyncContext.write(sayHello(name));
        }).start();
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-order-v1/src/main/java/org/apache/dubbo/samples/order/OrderServiceImpl.java`
#### Snippet
```java
    public OrderDetail submitOrder(Order order) {
        // Do something that consumes resources
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `2-advanced/dubbo-samples-stub/dubbo-samples-stub-interface/src/main/java/org/apache/dubbo/samples/stub/DemoServiceStub.java`
#### Snippet
```java
        } catch (Exception e) {
            logger.warn("fail to execute service", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `10-task/dubbo-samples-shop/dubbo-samples-shop-frontend/src/main/java/org/apache/dubbo/samples/frontend/pages/WebController.java`
#### Snippet
```java
            return shopService.getUserInfo(username);
        } catch (Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            if (testValue.equals("null")) {
                System.out.println("dubbo test: null");
                return null;
            } else if (testValue.equals("body empty")) {
                System.out.println("dubbo test: body empty");
```

### ReturnNull
Return of `null`
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            if (testValue.equals("null")) {
                System.out.println("dubbo test: null");
                return null;
            } else if (testValue.equals("body empty")) {
                System.out.println("dubbo test: body empty");
```

### ReturnNull
Return of `null`
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `2-advanced/dubbo-samples-spi-compatible/src/main/java/org/apache/dubbo/samples/basic/spi/MyInvoker.java`
#### Snippet
```java
    @Override
    public Class<T> getInterface() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-implement/src/main/java/org/apache/dubbo/sample/protobuf/serialization/utils/ProtobufUtils.java`
#### Snippet
```java
    public <T> T deserializeWithProtobuf(InputStream is, Class<T> clazz) throws InvalidProtocolBufferException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (!(MessageLite.class.isAssignableFrom(clazz))) {
            return null;
        }
        Parser<?> parser = getParser(clazz);
```

### ReturnNull
Return of `null`
in `2-advanced/dubbo-samples-local/src/main/java/org/apache/dubbo/samples/local/impl/DemoServiceImpl.java`
#### Snippet
```java
            asyncContext.write(sayHello(name));
        }).start();
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/impl/PenetrateAttachmentSelectorImpl1.java`
#### Snippet
```java
    @Override
    public Map<String, Object> selectReverse(Invocation invocation, RpcContextAttachment clientResponse, RpcContextAttachment serverResponse) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `2-advanced/dubbo-samples-rpccontext/src/main/java/org/apache/dubbo/samples/rpccontext/impl/PenetrateAttachmentSelectorImpl1.java`
#### Snippet
```java
    @Override
    public Map<String, Object> select(Invocation invocation, RpcContextAttachment clientAttachment, RpcContextAttachment serverAttachment) {
        return null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `consumerConfig` is redundant
in `99-integration/dubbo-samples-sentinel-compact/src/main/java/org/apache/samples/sentinel/consumer/ConsumerConfiguration.java`
#### Snippet
```java
    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        // Uncomment below line if you don't want to enable Sentinel for Dubbo service consumers.
        // consumerConfig.setFilter("-sentinel.dubbo.consumer.filter");
```

### UnnecessaryLocalVariable
Local variable `consumerConfig` is redundant
in `99-integration/dubbo-samples-sentinel-dubbo3/src/main/java/org/apache/samples/sentinel/consumer/ConsumerConfiguration.java`
#### Snippet
```java
    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        // Uncomment below line if you don't want to enable Sentinel for Dubbo service consumers.
        // consumerConfig.setFilter("-sentinel.dubbo.consumer.filter");
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `3-extensions/protocol/dubbo-samples-grpc/dubbo-samples-original/src/main/java/org/apache/dubbo/samples/basic/impl/routeguide/RouteGuideImpl.java`
#### Snippet
```java

                // Respond with all previous notes at this location.
                for (RouteNote prevNote : notes.toArray(new RouteNote[0])) {
                    responseObserver.onNext(prevNote);
                }
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `4-governance/dubbo-samples-metrics/src/main/java/org/apache/dubbo/samples/metrics/MetricsConsumer.java`
#### Snippet
```java
        while (true) {
            try {
                Thread.sleep(3000);
                Result hello = demoService.sayHello("world");
                System.out.println(hello.getMsg());
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `1-basic/dubbo-samples-spring-xml/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
                String message = greetingsService.sayHi("dubbo");
                System.out.println(new Date() + " Receive result ======> " + message);
                Thread.sleep(1000);
            } catch (Throwable t) {
                t.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `1-basic/dubbo-samples-spring-boot/dubbo-samples-spring-boot-consumer/src/main/java/org/apache/dubbo/springboot/demo/consumer/Task.java`
#### Snippet
```java
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println(new Date() + " Receive result ======> " + demoService.sayHello("world"));
                } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/MetricsConsumer.java`
#### Snippet
```java
        while (true) {
            try {
                Thread.sleep(3000);
                Result hello = demoService.sayHello("world");
                System.out.println(hello.getMsg());
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `4-governance/dubbo-samples-metrics-prometheus/src/main/java/org/apache/dubbo/samples/metrics/prometheus/StartProviderAndConsumer.java`
#### Snippet
```java
        while (true) {
            try {
                Thread.sleep(3000);
                Result hello = demoService.sayHello("world");
                System.out.println(hello.getMsg());
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `1-basic/dubbo-samples-api/src/main/java/org/apache/dubbo/samples/client/AlwaysApplication.java`
#### Snippet
```java
                String message = service.sayHi("dubbo");
                System.out.println(new Date() + " Receive result ======> " + message);
                Thread.sleep(1000);
            } catch (Throwable t) {
                t.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                    ChineseService chineseService = (ChineseService) context.getBean("chineseService");
                    System.out.println(chineseService.eat());
                    Thread.sleep(interval);
                } catch (Exception e) {
                    e.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                LionService lionService = (LionService) context.getBean("lionService");
                System.out.println(lionService.lion());
                Thread.sleep(interval);
            }
        });
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                CatService catService = (CatService) context.getBean("catService");
                System.out.println(catService.cat());
                Thread.sleep(interval);
            }
        });
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                    AmericanService americanService = (AmericanService) context.getBean("americanService");
                    System.out.println(americanService.eat());
                    Thread.sleep(interval);
                } catch (Exception e) {
                    e.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                    DogService dogService = (DogService) context.getBean("dogService");
                    System.out.println(dogService.dog());
                    Thread.sleep(interval);
                } catch (Exception e) {
                    e.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `2-advanced/dubbo-samples-chain/dubbo-samples-chain-front/src/main/java/org/apache/dubbo/samples/chain/FrontendConsumer.java`
#### Snippet
```java
                TigerService tigerService = (TigerService) context.getBean("tigerService");
                System.out.println(tigerService.tiger());
                Thread.sleep(interval);
            }
        });
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `3-extensions/registry/dubbo-samples-xds/dubbo-samples-xds-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
                String hello = greetingServiceConsumer.doSayHello("xDS Consumer");
                System.out.println("result: " + hello);
                Thread.sleep(100);
            } catch (Throwable t) {
                t.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `3-extensions/registry/dubbo-samples-mesh-k8s/dubbo-samples-mesh-consumer/src/main/java/org/apache/dubbo/samples/ConsumerBootstrap.java`
#### Snippet
```java
        System.out.println("==================== dubbo unary invoke loop started ====================");
        do {
            Thread.sleep(5000);
            greetingServiceConsumer.doSayHello("service mesh");
            System.out.println("==================== dubbo unary invoke " + count.get() + " end ====================");
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-springboot2/src/main/java/org/apache/dubbo/samples/resilience4jboot2/consumer/action/RateLimiterAction.java`
#### Snippet
```java
                while (true) {
                    try {
                        Thread.sleep(40);
                        System.out.println(rateLimiterService.say("rateK" + (i++), "rateV" + i));
                    } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `3-extensions/protocol/dubbo-samples-resilience4j/dubbo-samples-resilience4j-filter/src/main/java/org/apache/dubbo/samples/resilience4j/action/AnnotationAction.java`
#### Snippet
```java
                while (true) {
                    try {
                        Thread.sleep(40);
                        System.out.println(rateLimiterService.say(name + (i++), value + i));
                    } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/impl/CallbackServiceImpl.java`
#### Snippet
```java
                        }
                    }
                    Thread.sleep(5000); // timely trigger change event
                } catch (Throwable t1) {
                    t1.printStackTrace();
```

## RuleId[ruleID=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `2-advanced/dubbo-samples-callback/src/main/java/org/apache/dubbo/samples/callback/impl/CallbackServiceImpl.java`
#### Snippet
```java
        });
        t.setDaemon(true);
        t.start();
    }

```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `sleepEnd` initializer `0` is redundant
in `3-extensions/protocol/dubbo-samples-triple/src/main/java/org/apache/dubbo/sample/tri/stub/GreeterImpl.java`
#### Snippet
```java
                    .build());
            long onNextEnd = System.currentTimeMillis();
            long sleepEnd = 0;
            try {
                Thread.sleep(1000);
```

### UnusedAssignment
Variable `ret` initializer `null` is redundant
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
        String destUrl = "http://127.0.0.1:9280";

        Map<String, Object> ret = null;
        String testValue = (String)context.get("test");
        if (testValue != null) {
```

### UnusedAssignment
Variable `client` initializer `null` is redundant
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
        Map<String, Object> result = new HashMap<String, Object>();

        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;
        try{
```

### UnusedAssignment
Variable `response` initializer `null` is redundant
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java

        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;
        try{
            client = HttpClients.createDefault();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
            System.out.println("get to: " + uriBuilder.build().toString());

            HttpRequestBase request = null;

            if (method.equals("GET")) {
```

### UnusedAssignment
Variable `ret` initializer `null` is redundant
in `2-advanced/dubbo-samples-tengine/dubbo-samples-tengine-provider/src/main/java/org/apache/dubbo/samples/tengine/provider/DemoServiceImpl.java`
#### Snippet
```java
        }

        Map<String, Object> ret = null;
        String testValue = (String)context.get("test");
        if (testValue != null) {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `invocation` is always 'null'
in `2-advanced/dubbo-samples-async/dubbo-samples-async-onerror/src/main/java/org/apache/dubbo/samples/governance/filter/ThrowableAsyncFilter.java`
#### Snippet
```java
            throw new RuntimeException("exception before invoke()");
        }
        return invoker.invoke(invocation);
    }

```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/UpgradeUtil.java`
#### Snippet
```java

        String RULE_KEY = ApplicationModel.getName() + ".migration";
        DynamicConfiguration configuration = ApplicationModel.getEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, content);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/UpgradeUtil.java`
#### Snippet
```java

        String RULE_KEY = ApplicationModel.getName() + ".migration";
        DynamicConfiguration configuration = ApplicationModel.getEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, content);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `4-governance/dubbo-samples-applevel-override/src/main/java/org/apache/dubbo/samples/governance/UpgradeUtil.java`
#### Snippet
```java

        String RULE_KEY = ApplicationModel.getName() + ".migration";
        DynamicConfiguration configuration = ApplicationModel.getEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, content);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `3-extensions/serialization/dubbo-samples-protobuf-json/protobuf-json-serialization-demo/src/main/java/org/apache/dubbo/sample/protobuf/genericCall/GenericClient.java`
#### Snippet
```java
            for (String parameterType : methodDefinition.getParameterTypes()) {
                TypeDefinition typeDefinition = serviceDefinition.getTypes().stream().filter(TD -> TD.getType().equals
                        (parameterType)).findAny().get();
                System.out.println("parameter: " + new Gson().toJson(typeDefinition));
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/UpgradeUtil.java`
#### Snippet
```java

        String RULE_KEY = ApplicationModel.getName() + ".migration";
        DynamicConfiguration configuration = ApplicationModel.getEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, content);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/UpgradeUtil.java`
#### Snippet
```java

        String RULE_KEY = ApplicationModel.getName() + ".migration";
        DynamicConfiguration configuration = ApplicationModel.getEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, content);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `4-governance/dubbo-samples-servicelevel-override/src/main/java/org/apache/dubbo/samples/governance/UpgradeUtil.java`
#### Snippet
```java

        String RULE_KEY = ApplicationModel.getName() + ".migration";
        DynamicConfiguration configuration = ApplicationModel.getEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, content);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-consumer/src/main/java/org/apache/dubbo/demo/consumer/UpgradeUtil.java`
#### Snippet
```java

        String RULE_KEY = ApplicationModel.getName() + ".migration";
        DynamicConfiguration configuration = ApplicationModel.getEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, content);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-consumer/src/main/java/org/apache/dubbo/demo/consumer/UpgradeUtil.java`
#### Snippet
```java
    public static void clearRule(ApplicationModel applicationModel) {
        String RULE_KEY = applicationModel.getApplicationName() + ".migration";
        DynamicConfiguration configuration = applicationModel.getModelEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, "");
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-consumer/src/main/java/org/apache/dubbo/demo/consumer/UpgradeUtil.java`
#### Snippet
```java

        String RULE_KEY = ApplicationModel.getName() + ".migration";
        DynamicConfiguration configuration = ApplicationModel.getEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, content);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `2-advanced/dubbo-samples-cloud-native/dubbo-servicediscovery-migration/dubbo-servicediscovery-migration-consumer/src/main/java/org/apache/dubbo/demo/consumer/UpgradeUtil.java`
#### Snippet
```java

        String RULE_KEY = ApplicationModel.getName() + ".migration";
        DynamicConfiguration configuration = ApplicationModel.getEnvironment().getDynamicConfiguration().get();
        configuration.publishConfig(RULE_KEY, DUBBO_SERVICEDISCOVERY_MIGRATION, content);
    }
```

