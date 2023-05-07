# dubbo-spi-extensions 
 
# Bad smells
I found 544 bad smells with 34 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 121 | false |
| JavadocDeclaration | 53 | false |
| UnparsedCustomBeanInspection | 42 | false |
| SpringXmlModelInspection | 42 | false |
| UNCHECKED_WARNING | 29 | false |
| DuplicatedCode | 24 | false |
| DanglingJavadoc | 22 | false |
| JavadocReference | 21 | false |
| SpringBootApplicationYaml | 18 | false |
| UnusedAssignment | 14 | false |
| ConstantValue | 14 | false |
| UnnecessaryModifier | 13 | true |
| TrivialIf | 12 | false |
| DataFlowIssue | 11 | false |
| InnerClassMayBeStatic | 10 | true |
| FieldCanBeLocal | 9 | false |
| RedundantCast | 9 | false |
| DeprecatedIsStillUsed | 8 | false |
| Deprecation | 6 | false |
| EqualsBetweenInconvertibleTypes | 5 | false |
| UnnecessarySemicolon | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| UnnecessaryLocalVariable | 4 | true |
| CommentedOutCode | 3 | false |
| IgnoreResultOfCall | 3 | false |
| IfStatementWithIdenticalBranches | 3 | false |
| TypeParameterHidesVisibleType | 3 | false |
| UnstableApiUsage | 3 | false |
| ManualMinMaxCalculation | 2 | false |
| NullableProblems | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| CatchMayIgnoreException | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| BusyWait | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| LoopStatementsThatDontLoop | 1 | false |
| RegExpSimplifiable | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| FinalStaticMethod | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| DuplicateThrows | 1 | false |
| FuseStreamOperations | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
| RedundantLengthCheck | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| AutoCloseableResource | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
            }
            message.putUserProperty(RocketMQProtocolConstant.SEND_ADDRESS, NetUtils.getLocalHost());
            Long messageTimeout = System.currentTimeMillis() + timeout;
            message.putUserProperty(CommonConstants.TIMEOUT_KEY, messageTimeout.toString());
            message.putUserProperty(RocketMQProtocolConstant.URL_STRING, getUrl().toString());
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String SEND_ADDRESS = "send_address";

    static final String URL_STRING = "url_string";

    static final InetSocketAddress LOCAL_ADDRESS = InetSocketAddress.createUnresolved(NetUtils.getLocalHost(), 9876);
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String SEND_ADDRESS = "send_address";

    static final String URL_STRING = "url_string";

    static final InetSocketAddress LOCAL_ADDRESS = InetSocketAddress.createUnresolved(NetUtils.getLocalHost(), 9876);
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String URL_STRING = "url_string";

    static final InetSocketAddress LOCAL_ADDRESS = InetSocketAddress.createUnresolved(NetUtils.getLocalHost(), 9876);
}

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String URL_STRING = "url_string";

    static final InetSocketAddress LOCAL_ADDRESS = InetSocketAddress.createUnresolved(NetUtils.getLocalHost(), 9876);
}

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";

    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";

    static final String SEND_ADDRESS = "send_address";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";

    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";

    static final String SEND_ADDRESS = "send_address";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";

    static final String SEND_ADDRESS = "send_address";

    static final String URL_STRING = "url_string";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";

    static final String SEND_ADDRESS = "send_address";

    static final String URL_STRING = "url_string";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String CONSUMER_CROUP_NAME = "dubbo-roucketmq-consumer-group";

    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";

    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java
    static final String CONSUMER_CROUP_NAME = "dubbo-roucketmq-consumer-group";

    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";

    static final String DUBBO_DEFAULT_PROTOCOL_TOPIC = "dubbo_default_protocol_topic";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java


    static final String CONSUMER_CROUP_NAME = "dubbo-roucketmq-consumer-group";

    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocolConstant.java`
#### Snippet
```java


    static final String CONSUMER_CROUP_NAME = "dubbo-roucketmq-consumer-group";

    static final String PRODUCER_CROUP_NAME = "dubbo-roucketmq-producer-group";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
    }

    private static interface BuiltinMarshaller<T> {
        Any marshal(T obj) throws IOException;

```

## RuleId[id=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`do` statement does not loop
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyCodecAdapter.java`
#### Snippet
```java
                int savedReadIndex;

                do {
                    savedReadIndex = frame.readerIndex();
                    try {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (7 lines)
in `dubbo-configcenter-extensions/dubbo-configcenter-etcd/src/main/java/org/apache/dubbo/configcenter/support/etcd/EtcdDynamicConfiguration.java`
#### Snippet
```java
    }

//    @Override
//    public String getConfigs(String key, String group, long timeout) throws IllegalStateException {
//        if (StringUtils.isEmpty(group)) {
```

### CommentedOutCode
Commented out code (5 lines)
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
        public T parse(InputStream stream) throws InvalidProtocolBufferException {
            return parser.parseDelimitedFrom(stream, globalRegistry);
//            CodedInputStream cis = CodedInputStream.newInstance(stream);
//            // Pre-create the CodedInputStream so that we can remove the size limit restriction
//            // when parsing.
```

### CommentedOutCode
Commented out code (2 lines)
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/DemoParamBean1SubBean1.java`
#### Snippet
```java

    // Circular reference for test
//    @RequestParam("====bean")
//    private DemoParamBean1 bean;

```

## RuleId[id=UnparsedCustomBeanInspection]
### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-kryo-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:application name="serialization-kryo-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
```

### UnparsedCustomBeanInspection
Unsupported tag 'reference' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
                     interface="org.apache.dubbo.test.serialization.testcase.DemoService"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-avro-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:application name="serialization-avro-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-gson-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:application name="serialization-gson-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
```

### UnparsedCustomBeanInspection
Unsupported tag 'reference' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
                     interface="org.apache.dubbo.test.serialization.testcase.DemoService"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-fst-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:application name="serialization-fst-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
```

### UnparsedCustomBeanInspection
Unsupported tag 'reference' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
                     interface="org.apache.dubbo.test.serialization.testcase.DemoService"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'reference' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
                     interface="org.apache.dubbo.test.serialization.testcase.DemoService"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-gson-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:application name="serialization-gson-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
                   serialization="gson"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-fst-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:application name="serialization-fst-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
                   serialization="fst"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-avro-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:application name="serialization-avro-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
                   serialization="avro"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-kryo-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:application name="serialization-kryo-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
                   serialization="kryo"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-fastjson-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:application name="serialization-fastjson-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
```

### UnparsedCustomBeanInspection
Unsupported tag 'reference' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
                     interface="org.apache.dubbo.test.serialization.testcase.DemoService"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-fastjson-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:application name="serialization-fastjson-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
                   serialization="fastjson"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-protobuf-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:application name="serialization-protobuf-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
```

### UnparsedCustomBeanInspection
Unsupported tag 'reference' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
                     interface="org.apache.dubbo.test.serialization.protobuf.DemoService"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-protobuf-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:application name="serialization-protobuf-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.protobuf.DemoServiceImpl"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <bean id="demoService" class="org.apache.dubbo.test.serialization.protobuf.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.protobuf.DemoService" ref="demoService"
                   serialization="protobuf"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-protostuff-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:application name="serialization-protostuff-consumer"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
```

### UnparsedCustomBeanInspection
Unsupported tag 'reference' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-consumer.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <dubbo:reference id="demoService" check="true"
                     interface="org.apache.dubbo.test.serialization.testcase.DemoService"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <context:property-placeholder/>

    <dubbo:application name="serialization-protostuff-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:application name="serialization-protostuff-provider"/>

    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://dubbo.apache.org/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
                   serialization="protostuff"/>

```

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.application.name'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
spring:
  application:
    name: dubbo-api-docs-example-provider
  profiles:
    active: dev
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.profiles.active'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
    name: dubbo-api-docs-example-provider
  profiles:
    active: dev
dubbo:
  registry:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.registry.address'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
dubbo:
  registry:
    address: zookeeper://127.0.0.1:2181
  #    group: DEFAULT_GROUP
  provider:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.provider.timeout'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
  #    group: DEFAULT_GROUP
  provider:
    timeout: 2000
    filter: metrics
    group: test
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.provider.filter'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
  provider:
    timeout: 2000
    filter: metrics
    group: test
  protocol:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.provider.group'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
    timeout: 2000
    filter: metrics
    group: test
  protocol:
    port: 20881
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.protocol.name'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
  protocol:
    port: 20881
    name: dubbo
  application:
    name: dubbo-api-docs-example-provider
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.application.name'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
    name: dubbo
  application:
    name: dubbo-api-docs-example-provider
  metadata-report:
    address: zookeeper://127.0.0.1:2181
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.metadata-report.address'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
    name: dubbo-api-docs-example-provider
  metadata-report:
    address: zookeeper://127.0.0.1:2181
  #    group: DEFAULT_GROUP
  config-center:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.config-center.address'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
  #    group: DEFAULT_GROUP
  config-center:
    address: zookeeper://127.0.0.1:2181
  #    group: DEFAULT_GROUP
  metrics:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.metrics.port'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
  #    group: DEFAULT_GROUP
  metrics:
    port: ${dubbo.protocol.port}
    protocol: dubbo
demo:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.metrics.protocol'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
  metrics:
    port: ${dubbo.protocol.port}
    protocol: dubbo
demo:
  apiversion:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'demo.apiversion.quickstart'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/resources/application.yml`
#### Snippet
```java
demo:
  apiversion:
    quickstart: v0.1

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.registry.address'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/resources/application.yml`
#### Snippet
```java
dubbo:
  registry:
    address: spring-cloud://localhost
  provider:
    timeout: 2000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.provider.timeout'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/resources/application.yml`
#### Snippet
```java
    address: spring-cloud://localhost
  provider:
    timeout: 2000
  protocol:
    port: 20882
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.protocol.port'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/resources/application.yml`
#### Snippet
```java
    timeout: 2000
  protocol:
    port: 20882
    name: dubbo
spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'dubbo.protocol.name'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/resources/application.yml`
#### Snippet
```java
  protocol:
    port: 20882
    name: dubbo
spring:
  main:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.main.allow-bean-definition-overriding'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/resources/application.yml`
#### Snippet
```java
  main:
    # Spring Boot 2.1 需要设定
    allow-bean-definition-overriding: true
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[:]` can be simplified to ':'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/ClusterRedisClient.java`
#### Snippet
```java

    private JedisCluster jedisCluster;
    private Pattern COLON_SPLIT_PATTERN = Pattern.compile("\\s*[:]+\\s*");

    public ClusterRedisClient(URL url) {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/SentinelRedisClient.java`
#### Snippet
```java
        super(url);
        String masterName = url.getParameter("master.name", "Sentinel-master");
        String address = (new StringBuilder()).append(url.getAddress()).toString();
        String[] backupAddresses = url.getParameter(RemotingConstants.BACKUP_KEY, new String[0]);
        if (backupAddresses.length == 0) {
```

## RuleId[id=Deprecation]
### Deprecation
'com.alibaba.dubbo.rpc.protocol.rmi.RmiRemoteInvocation' is deprecated
in `dubbo-rpc-extensions/dubbo-rpc-rmi/src/main/java/org/apache/dubbo/rpc/protocol/rmi/RmiProtocol.java`
#### Snippet
```java
        } else if (isRelease263OrHigher(url.getParameter(DUBBO_VERSION_KEY))) {
            rmiProxyFactoryBean.setRemoteInvocationFactory(methodInvocation -> {
                RemoteInvocation invocation = new com.alibaba.dubbo.rpc.protocol.rmi.RmiRemoteInvocation(methodInvocation);
                if (isGeneric) {
                    invocation.addAttribute(GENERIC_KEY, generic);
```

### Deprecation
'io.netty.util.internal.ConcurrentSet' is deprecated
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
        protected String path;
        protected Throwable throwable;
        protected volatile Set<String> urls = new ConcurrentSet<>();
        private ChildListener listener;

```

### Deprecation
'expire(byte\[\], int)' is deprecated
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
                            jedis.set(key, output.toByteArray());
                            if (expiry > 1000) {
                                jedis.expire(key, expiry / 1000);
                            }
                            return AsyncRpcResult.newDefaultAsyncResult(invocation);
```

### Deprecation
'version' is deprecated
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/QuickStartDemoImpl.java`
#### Snippet
```java
    }

    @ApiDoc(value = "quick start demo, request use generic.", version = "v0.1", description = "quick start demo, request use generic.", responseClassDescription = "A quick star response bean")
    @Override
    public QuickStartRespBean quickStart2(Map<String, DemoParamBean4> beanList, QuickStartRequestBase<QuickStartRequestBean, InnerClassRequestBean<DemoParamBean4>> beanParam) {
```

### Deprecation
'version' is deprecated
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/QuickStartDemoImpl.java`
#### Snippet
```java
public class QuickStartDemoImpl implements IQuickStartDemo {

    @ApiDoc(value = "quick start demo", version = "v0.1", description = "this api is a quick start demo", responseClassDescription = "A quick star response bean")
    @Override
    public QuickStartRespBean quickStart(@RequestParam(value = "strParamxxx", required = true) List<DemoParamBean4> strParam, QuickStartRequestBean beanParam) {
```

### Deprecation
'version' is deprecated
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/QuickStartDemoImpl.java`
#### Snippet
```java
    }

    @ApiDoc(value = "multiple generic demo", version = "v0.1", description = "multiple generic demo.", responseClassDescription = "A quick star response bean")
    @Override
    public QuickStartRespBean quickStart3(QuickStartRequestBean2 beanParam) {
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
        builder.addParameter(RegistryConstants.CATEGORY_KEY, "providers");
        builder.addParameter(CommonConstants.PROTOCOL_KEY, "rocketmq");
        builder.addParameter("queueId", queue + "");
        builder.addParameter("topic", serviceName.getValue());
        return builder.build();
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/option/OptionUtil.java`
#### Snippet
```java
    public static final byte[] NO_PREFIX_END = {0};

    public static final ByteSequence prefixEndOf(ByteSequence prefix) {
        byte[] endKey = prefix.getBytes().clone();
        if (prefix.size() > 0) {
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyCodecAdapter.java`
#### Snippet
```java
                    } else {
                        int size = previousData.readableBytes() + grizzlyBuffer.remaining();
                        frame = ChannelBuffers.dynamicBuffer(size > bufferSize ? size : bufferSize);
                        frame.writeBytes(previousData, previousData.readableBytes());
                        frame.writeBytes(grizzlyBuffer.toByteBuffer());
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaCodecAdapter.java`
#### Snippet
```java
                } else {
                    int size = buffer.readableBytes() + in.remaining();
                    frame = ChannelBuffers.dynamicBuffer(size > bufferSize ? size : bufferSize);
                    frame.writeBytes(buffer, buffer.readableBytes());
                    frame.writeBytes(in.buf());
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
        this.scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "dubbo-registry-nameservice");
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dubbo-cluster-extensions/dubbo-cluster-polaris-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/router/InstanceInvoker.java`
#### Snippet
```java

    @Override
    public int compareTo(Instance o) {
        return defaultInstance.compareTo(o);
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/dubbo/WhitelistHessian2FactoryInitializer.java`
#### Snippet
```java

/**
 * see https://github.com/ebourg/hessian/commit/cf851f5131707891e723f7f6a9718c2461aed826
 */
public class WhitelistHessian2FactoryInitializer extends AbstractHessian2FactoryInitializer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `dubbo-cluster-extensions/dubbo-cluster-loadbalance-peakewma/src/main/java/org/apache/dubbo/rpc/cluster/loadbalance/PeakEwmaLoadBalance.java`
#### Snippet
```java
 * <p>
 * Inspiration drawn from:
 * https://github.com/twitter/finagle/blob/1bc837c4feafc0096e43c0e98516a8e1c50c4421
 * /finagle-core/src/main/scala/com/twitter/finagle/loadbalancer/PeakEwma.scala
 */
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `dubbo-rpc-extensions/dubbo-rpc-rmi/src/main/java/org/apache/dubbo/rpc/protocol/rmi/RmiProtocol.java`
#### Snippet
```java
        final RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        final String generic = url.getParameter(GENERIC_KEY);
        final boolean isGeneric = ProtocolUtils.isGeneric(generic) || serviceType.equals(GenericService.class);
        /*
          RMI needs extra parameter since it uses customized remote invocation object
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HessianProtocol.java`
#### Snippet
```java
    protected <T> T doRefer(Class<T> serviceType, URL url) throws RpcException {
        String generic = url.getParameter(GENERIC_KEY);
        boolean isGeneric = ProtocolUtils.isGeneric(generic) || serviceType.equals(GenericService.class);
        if (isGeneric) {
            RpcContext.getContext().setAttachment(GENERIC_KEY, generic);
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `dubbo-gateway-extensions/dubbo-gateway-consumer/src/main/java/org/apache/dubbo/gateway/consumer/filter/OmnSerFilter.java`
#### Snippet
```java
        }
        Class<?>[] parameterTypes = invocation.getParameterTypes();
        boolean reqFirst = Arrays.stream(parameterTypes).noneMatch(param -> param == JavaBeanDescriptor.class);
        if (reqFirst) {
            invocation.setObjectAttachment(ORIGIN_GENERIC_PARAMETER_TYPES, getDesc(parameterTypes));
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `dubbo-gateway-extensions/dubbo-gateway-provider/src/main/java/org/apache/dubbo/gateway/provider/SnfDecodeableRpcInvocation.java`
#### Snippet
```java
            boolean isConvert = false;
            for (Class<?> clazz : pts) {
                if (clazz == JavaBeanDescriptor.class) {
                    isConvert = true;
                    break;
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `dubbo-rpc-extensions/dubbo-rpc-http/src/main/java/org/apache/dubbo/rpc/protocol/http/HttpProtocol.java`
#### Snippet
```java
    protected <T> T doRefer(final Class<T> serviceType, URL url) throws RpcException {
        final String generic = url.getParameter(GENERIC_KEY);
        final boolean isGeneric = ProtocolUtils.isGeneric(generic) || serviceType.equals(GenericService.class);
        JsonProxyFactoryBean jsonProxyFactoryBean = new JsonProxyFactoryBean();
        JsonRpcProxyFactoryBean jsonRpcProxyFactoryBean = new JsonRpcProxyFactoryBean(jsonProxyFactoryBean);
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaClient.java`
#### Snippet
```java
    private static final Map<String, SocketConnector> CONNECTORS = new ConcurrentHashMap<String, SocketConnector>();

    private String connectorKey;

    private SocketConnector connector;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java
    private int waitAddressTimeout;

    private RegistryClientConfig registryClientConfig;

    private final Map<String, Publisher> publishers = new ConcurrentHashMap<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
    private long timeoutMillis;

    private String instanceName;

    public NameServiceRegistry(URL url) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(NameServiceRegistry.class);

    private ScheduledExecutorService scheduledExecutorService;

    private Map<URL, RegistryInfoWrapper> consumerRegistryInfoWrapperMap = new ConcurrentHashMap<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
    private TopicList topicList;

    private long timeoutMillis;

    private String instanceName;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dubbo-configcenter-extensions/dubbo-configcenter-consul/src/main/java/org/apache/dubbo/configcenter/consul/ConsulDynamicConfiguration.java`
#### Snippet
```java
    private class ConsulListener implements KVCache.Listener<String, Value> {

        private KVCache kvCache;
        private final Set<ConfigurationListener> listeners = new LinkedHashSet<>();
        private final String normalizedKey;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/FileGroup.java`
#### Snippet
```java
    private final File file;
    // Scheduled executor service
    private final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3, new NamedThreadFactory("FileGroupModifiedChecker", true));
    // Reconnect the timer to check whether the connection is available at a time, and when unavailable, an infinite reconnection
    private final ScheduledFuture<?> checkModifiedFuture;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/FileExchangeGroup.java`
#### Snippet
```java
    private final File file;
    // scheduled executor service
    private final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3, new NamedThreadFactory("FileGroupModifiedChecker", true));
    // Reconnect the timer to check whether the connection is available at a time, and when unavailable, an infinite reconnection
    private final ScheduledFuture<?> checkModifiedFuture;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private List<String> tags;

    private ConsistencyMode consistencyMode;

    private String defaultZoneMetadataName;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaClient.java`
#### Snippet
```java
        });
        try {
            finish.await(getConnectTimeout(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RemotingException(this, "client(url: " + getUrl() + ") failed to connect to server " + getRemoteAddress() + " client-side timeout "
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectInput.java`
#### Snippet
```java
        int length = dis.readInt();
        byte[] bytes = new byte[length];
        dis.read(bytes, 0, length);
        return new String(bytes);
    }
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectInput.java`
#### Snippet
```java
        int length = dis.readInt();
        byte[] bytes = new byte[length];
        dis.read(bytes, 0, length);
        return bytes;
    }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
            Status status = Status.fromThrowable(e);
            // system may be recover later, current connect won't be lost
            if (OptionUtil.isHaltError(status) || OptionUtil.isNoLeaderError(status)) {
                reconnectSchedule.schedule(this::reconnect, new Random().nextInt(delayPeriod), TimeUnit.MILLISECONDS);
                return;
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java

        Invoker<T> targetInvoker;
        if (port != 0) {
            targetInvoker = address2Invoker.get(ip + ":" + port);
            if (targetInvoker != null) {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java

        Invoker<?> targetInvoker;
        if (port != 0) {
            targetInvoker = address2Invoker.get(ip + ":" + port);
            if (targetInvoker != null) {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `_deserializerMap` are updated, but never queried
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/Hessian2SerializerFactory.java`
#### Snippet
```java
public class Hessian2SerializerFactory extends SerializerFactory {
    private HashMap _serializerMap = new HashMap();
    private HashMap _deserializerMap = new HashMap();

    public Hessian2SerializerFactory() {
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `dubbo-serialization-extensions/dubbo-serialization-fastjson/src/main/java/org/apache/dubbo/common/serialize/fastjson/FastJsonObjectInput.java`
#### Snippet
```java
    }

    private String readLine() throws IOException, EOFException {
        String line = reader.readLine();
        if (line == null || line.trim().length() == 0) {
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                        ? address
                        : HTTP_KEY + address)
                .collect(toList());
        Collections.shuffle(addresses);
        return addresses.toArray(new String[0]);
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
    private static Builder getMessageBuilder(Class<?> requestType) throws Exception {
        Method method = requestType.getMethod("newBuilder");
        return (Builder) method.invoke(null, null);
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `value` initializer `null` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQExporter.java`
#### Snippet
```java
        String group = url.getParameter(GROUP_KEY, DEFAULT_PARAM_VALUE);

        String value = null;
        if (Objects.equals(url.getParameter("groupModel"), "topic")) {
            value = DEFAULT_CATEGORY + NAME_SEPARATOR + serviceInterface + NAME_SEPARATOR + version + NAME_SEPARATOR + group;
```

### UnusedAssignment
Variable `timeout` initializer `1000` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    private int calculateTimeout(Invocation invocation, String methodName) {
        Object countdown = RpcContext.getContext().get().get(CommonConstants.TIME_COUNTDOWN_KEY);
        int timeout = 1000;
        if (countdown == null) {
            timeout = (int) RpcUtils.getTimeout(getUrl(), methodName, RpcContext.getContext(), this.timeout);
```

### UnusedAssignment
Variable `service` initializer `null` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
            if (listener != null) {
                int modified = 0;
                String service = null;
                Iterator<Event> iterator = response.getEventsList().iterator();
                while (iterator.hasNext()) {
```

### UnusedAssignment
Variable `timeout` initializer `0` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyChannel.java`
#### Snippet
```java
        super.send(message, sent);

        int timeout = 0;
        try {
            GrizzlyFuture future = connection.write(message);
```

### UnusedAssignment
Variable `handle` initializer `null` is redundant
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/Java8TimeSerializer.java`
#### Snippet
```java
        }

        T handle = null;
        try {
            Constructor<T> constructor = handleType.getConstructor(Object.class);
```

### UnusedAssignment
The value `null` assigned to `json` is never used
in `dubbo-serialization-extensions/dubbo-serialization-gson/src/main/java/org/apache/dubbo/common/serialize/gson/GsonJsonObjectOutput.java`
#### Snippet
```java
        writer.println();
        writer.flush();
        json = null;
    }

```

### UnusedAssignment
Variable `gson` initializer `null` is redundant
in `dubbo-serialization-extensions/dubbo-serialization-gson/src/main/java/org/apache/dubbo/common/serialize/gson/GsonJsonObjectOutput.java`
#### Snippet
```java

    private final PrintWriter writer;
    private Gson gson = null;

    public GsonJsonObjectOutput(OutputStream out) {
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/ServiceName.java`
#### Snippet
```java

    private String toValue() {
        String value = null;
        if (Objects.equals(this.groupModel, "topic")) {
            value = category +
```

### UnusedAssignment
Variable `datas` initializer `null` is redundant
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java
    protected List<String> getUserData(String dataId, UserData userData) {

        List<String> datas = null;
        if (userData == null) {
            datas = new ArrayList<>(0);
```

### UnusedAssignment
Variable `isNotRoute` initializer `true` is redundant
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
    private MQAdminExt mqAdminExt;

    private boolean isNotRoute = true;

    private ClusterInfo clusterInfo;
```

### UnusedAssignment
Variable `exceptionInfo` initializer `String.format("query topic consume fial, topic name is %s , url is %s , cause %s", serviceName.getVa...` is redundant
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
        } catch (InterruptedException | MQBrokerException | RemotingException | MQClientException e) {
            String exceptionInfo =
                String.format("query topic consume fial, topic name is %s , url is %s , cause %s", serviceName.getValue(), url, e.getMessage());
            logger.error(exceptionInfo, e);
            throw new RuntimeException(exceptionInfo, e);
```

### UnusedAssignment
The value `null` assigned to `bytes` is never used
in `dubbo-serialization-extensions/dubbo-serialization-msgpack/src/main/java/org/apache/dubbo/common/serialize/msgpack/MsgpackObjectOutput.java`
#### Snippet
```java
        out.write(bytes);
        out.flush();
        bytes = null;
    }

```

### UnusedAssignment
Variable `requestParam` initializer `null` is redundant
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
            paramBean.setName(parameter.getName());
            paramBean.setJavaType(argClass.getCanonicalName());
            RequestParam requestParam = null;
            if (parameter.isAnnotationPresent(RequestParam.class)) {
                // Handling @RequestParam annotations on properties
```

### UnusedAssignment
Variable `rpcException` initializer `null` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java

    private RpcException getRpcException(Throwable throwable) {
        RpcException rpcException = null;
        if (throwable instanceof RpcException) {
            rpcException = (RpcException) throwable;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `invocation` is always 'null'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcResult.java`
#### Snippet
```java
                returnTypes = ((RpcInvocation) invocation).getReturnTypes();
            } else {
                returnTypes = RpcUtils.getReturnTypes(invocation);
            }
            Object value;
```

### ConstantValue
Condition `null != rpcException` is always `true`
in `dubbo-registry-extensions/dubbo-registry-polaris/src/main/java/org/apache/dubbo/registry/polaris/filter/ReportFilter.java`
#### Snippet
```java
        if (null != exception) {
            retStatus = RetStatus.RetFail;
            if (null != rpcException) {
                code = rpcException.getCode();
                if (code == RpcException.LIMIT_EXCEEDED_EXCEPTION) {
```

### ConstantValue
Condition `null != exception` is always `false`
in `dubbo-registry-extensions/dubbo-registry-polaris/src/main/java/org/apache/dubbo/registry/polaris/filter/ReportFilter.java`
#### Snippet
```java
        if (null != rpcException) {
            throw rpcException;
        } else if (null != exception) {
            throw new RpcException(exception);
        }
```

### ConstantValue
Condition `t instanceof SocketTimeoutException` is always `false` when reached
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
                    } catch (Throwable t) {
                        RpcException re = new RpcException("Failed to invoke memcached service method. interface: " + type.getName() + ", method: " + invocation.getMethodName() + ", url: " + url + ", cause: " + t.getMessage(), t);
                        if (t instanceof TimeoutException || t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof MemcachedException || t instanceof IOException) {
```

### ConstantValue
Condition `t instanceof IOException` is always `false` when reached
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
                        if (t instanceof TimeoutException || t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof MemcachedException || t instanceof IOException) {
                            re.setCode(RpcException.NETWORK_EXCEPTION);
                        }
```

### ConstantValue
Condition `t instanceof UnknownHostException` is always `false`
in `dubbo-registry-extensions/dubbo-registry-dns/src/main/java/org/apache/dubbo/registry/dns/util/DNSResolver.java`
#### Snippet
```java
            }
        } catch (Throwable t) {
            if (t instanceof UnknownHostException) {
                if (logger.isInfoEnabled()) {
                    logger.info(t.getLocalizedMessage());
```

### ConstantValue
Condition `t instanceof SocketTimeoutException` is always `false`
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
                    } catch (Throwable t) {
                        RpcException re = new RpcException("Failed to invoke redis service method. interface: " + type.getName() + ", method: " + invocation.getMethodName() + ", url: " + url + ", cause: " + t.getMessage(), t);
                        if (t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof JedisConnectionException || t instanceof IOException) {
```

### ConstantValue
Condition `t instanceof IOException` is always `false` when reached
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
                        if (t instanceof SocketTimeoutException) {
                            re.setCode(RpcException.TIMEOUT_EXCEPTION);
                        } else if (t instanceof JedisConnectionException || t instanceof IOException) {
                            re.setCode(RpcException.NETWORK_EXCEPTION);
                        } else if (t instanceof JedisDataException) {
```

### ConstantValue
Condition `Objects.isNull(serviceType)` is always `false`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/CommonTypeHandler.java`
#### Snippet
```java
            if (Objects.isNull(resultContext.getTargetType())) {
                Class<?> serviceType = Class.forName(resultContext.getServiceName());
                if (Objects.isNull(serviceType)) {
                    return null;
                }
```

### ConstantValue
Condition `tArgs == null` is always `true`
in `dubbo-rpc-extensions/dubbo-rpc-native-thrift/src/main/java/org/apache/dubbo/rpc/protocol/nativethrift/ThriftProtocol.java`
#### Snippet
```java
        }

        if (tArgs == null) {
            logger.error("Fail to create native thrift server(" + url + ") due to null args");
            throw new RpcException("Fail to create nativethrift server(" + url + ") due to null args");
```

### ConstantValue
Condition `last instanceof RemotingException` is always `true`
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/ServerPeer.java`
#### Snippet
```java
        }
        if (last != null) {
            if (last instanceof RemotingException) {
                throw (RemotingException) last;
            } else if (last instanceof RuntimeException) {
```

### ConstantValue
Condition `last instanceof RemotingException` is always `true`
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/ExchangeServerPeer.java`
#### Snippet
```java
        }
        if (last != null) {
            if (last instanceof RemotingException) {
                throw (RemotingException) last;
            } else if (last instanceof RuntimeException) {
```

### ConstantValue
Condition `apiParamsList != null` is always `true`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
                // Not a basic type, handling properties in method parameters
                List<ParamBean> apiParamsList = processField(argClass, parameterType, methodParameter);
                if (apiParamsList != null && !apiParamsList.isEmpty()) {
                    paramListItem.setParamInfo(apiParamsList);
                }
```

### ConstantValue
Value `metadata` is always 'null'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private Map<String, String> decodeMetadata(Map<String, String> metadata) {
        if (metadata == null) {
            return metadata;
        }
        Map<String, String> decoded = new HashMap<>(metadata.size());
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                                .getKvs().stream()
                                .mapToLong(keyValue -> Long.valueOf(keyValue.getValue().toString(UTF_8)))
                                .findFirst().getAsLong();
                    }, retryPolicy);
        } catch (Exception e) {
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `cost`
in `dubbo-cluster-extensions/dubbo-cluster-loadbalance-peakewma/src/main/java/org/apache/dubbo/rpc/cluster/loadbalance/PeakEwmaLoadBalance.java`
#### Snippet
```java
                cost = rtt;
            } else {
                cost = cost * w + rtt * (1.0 - w);
            }

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/ClusterRedisClient.java`
#### Snippet
```java
        String backupAddresses = url.getBackupAddress(6379);
        String[] nodes = StringUtils.isEmpty(backupAddresses) ? new String[0] : COMMA_SPLIT_PATTERN.split(backupAddresses);
        if (nodes.length > 0) {
            for (String node : nodes) {
                String[] hostAndPort = COLON_SPLIT_PATTERN.split(node);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'WatcherListener', required 'T'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/support/AbstractEtcdClient.java`
#### Snippet
```java

    @Override
    public WatcherListener getChildListener(String path, ChildListener listener) {
        ConcurrentMap<ChildListener, WatcherListener> listeners = childListeners.get(path);
        if (listeners == null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `dubbo-registry-extensions/dubbo-registry-polaris/src/main/java/org/apache/dubbo/registry/polaris/PolarisRegistry.java`
#### Snippet
```java
        }
        LOGGER.info(String.format("[POLARIS] register service to polaris: %s", url.toString()));
        Map<String, String> metadata = new HashMap<>(url.getParameters());
        metadata.put(CommonConstants.PATH_KEY, url.getPath());
        int port = url.getPort();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `dubbo-rpc-extensions/dubbo-rpc-hessian/src/main/java/org/apache/dubbo/rpc/protocol/hessian/HessianProtocolClientFilter.java`
#### Snippet
```java
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Map<String, String> attachments = new HashMap<>(RpcContext.getContext().getAttachments());
        attachments.putAll(invocation.getAttachments());
        HessianProtocolClientFilter.attachments.set(attachments);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/Hessian2SerializerFactory.java`
#### Snippet
```java

    public void addDeserializer(Class cl, Deserializer deserializer) {
        this._deserializerMap.put(cl, deserializer);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/Hessian2SerializerFactory.java`
#### Snippet
```java

    public void addSerializer(Class cl, Serializer serializer) {
        this._serializerMap.put(cl, serializer);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.protobuf.Message' to 'T'. Reason: 'builder' has raw type, so result of build is erased
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
        }
        JsonFormat.parser().merge(json, builder);
        return (T) builder.build();
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.protobuf.Message' to 'T'. Reason: 'builder' has raw type, so result of build is erased
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
            .usingTypeRegistry(typeRegistry)
            .merge(json, builder);
        return (T) builder.build();
    }

```

### UNCHECKED_WARNING
Unchecked call to 'marshal(T)' as a member of raw type 'org.apache.dubbo.common.serialize.protobuf.support.ProtobufAttachmentUtils.BuiltinMarshaller'
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
        MapValue.Attachment attachment = MapValue.Attachment.newBuilder()
            .setType(className)
            .setData(marshaller.marshal(obj))
            .build();
        return Any.pack(attachment);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/optimized/KryoObjectInput2.java`
#### Snippet
```java
    @Override
    public Map<String, Object> readAttachments() throws IOException, ClassNotFoundException {
        return readObject(HashMap.class);
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List\>' to 'java.util.List\>'
in `dubbo-cluster-extensions/dubbo-cluster-polaris-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/router/PolarisRouter.java`
#### Snippet
```java
        List<Instance> resultInstances = polarisOperator
                .route(service, invocation.getMethodName(), arguments, instances);
        return (List<Invoker<T>>) ((List<?>) resultInstances);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'setBody(List\>)' as a member of raw type 'org.apache.dubbo.apidocs.examples.params.QuickStartRequestBase'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/QuickStartDemoImpl.java`
#### Snippet
```java
    public QuickStartRequestBase quickStart4(BigDecimal number, QuickStartRequestBean2 beanParam) {
        QuickStartRequestBase response = new QuickStartRequestBase();
        response.setBody(Arrays.asList("body2-1", "body2-2"));
        response.setBody3("body3");
        response.setMethod("test");
```

### UNCHECKED_WARNING
Unchecked call to 'setBody3(E)' as a member of raw type 'org.apache.dubbo.apidocs.examples.params.QuickStartRequestBase'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/QuickStartDemoImpl.java`
#### Snippet
```java
        QuickStartRequestBase response = new QuickStartRequestBase();
        response.setBody(Arrays.asList("body2-1", "body2-2"));
        response.setBody3("body3");
        response.setMethod("test");
        return response;
```

### UNCHECKED_WARNING
Unchecked call to 'getDeclaredConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `dubbo-common-extensions/src/main/java/org/apache/dubbo/common/utils/Utils.java`
#### Snippet
```java
    public static boolean checkZeroArgConstructor(Class clazz) {
        try {
            clazz.getDeclaredConstructor();
            return true;
        } catch (NoSuchMethodException e) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `dubbo-serialization-extensions/dubbo-serialization-msgpack/src/main/java/org/apache/dubbo/common/serialize/msgpack/MsgpackObjectInput.java`
#### Snippet
```java
    public Throwable readThrowable() throws IOException, ClassNotFoundException {
        Class clazz = readObject(Class.class);
        return (Throwable) readObject(clazz);
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/DefaultUserSpecifiedServiceAddressBuilder.java`
#### Snippet
```java
    public <T> URL rebuildAddress(List<Invoker<T>> invokers, Address address, Invocation invocation, URL consumerUrl) {
        URL url = (URL) address.getUrlAddress();
        Map<String, String> parameters = new HashMap<>(url.getParameters());
        parameters.put(VERSION_KEY, consumerUrl.getVersion());
        parameters.put(GROUP_KEY, consumerUrl.getGroup());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectInput.java`
#### Snippet
```java
            result = wrapper.getData();
        } else {
            Schema schema = RuntimeSchema.getSchema(clazz);
            result = schema.newMessage();
            GraphIOUtil.mergeFrom(bytes, result, schema);
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.protostuff.Schema' to 'io.protostuff.Schema'
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectInput.java`
#### Snippet
```java
            Schema schema = RuntimeSchema.getSchema(clazz);
            result = schema.newMessage();
            GraphIOUtil.mergeFrom(bytes, result, schema);
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
            }
            List<URL> urls = new ArrayList<>();
            Set<URL> toDeleteExpireKeys = new HashSet<>(expireCache.keySet());
            Map<String, String> values = redisClient.hgetAll(key);
            if (CollectionUtils.isNotEmptyMap(values)) {
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
            }
            List<URL> urls = new ArrayList<>();
            Set<URL> toDeleteExpireKeys = new HashSet<>(expireCache.keySet());
            Map<String, String> values = redisClient.hgetAll(key);
            if (CollectionUtils.isNotEmptyMap(values)) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Collection'
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
    private void doNotify(String key) {
        for (Map.Entry<URL, Set<NotifyListener>> entry : new HashMap<>(getSubscribed()).entrySet()) {
            doNotify(Collections.singletonList(key), entry.getKey(), new HashSet<>(entry.getValue()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
    private void doNotify(String key) {
        for (Map.Entry<URL, Set<NotifyListener>> entry : new HashMap<>(getSubscribed()).entrySet()) {
            doNotify(Collections.singletonList(key), entry.getKey(), new HashSet<>(entry.getValue()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `dubbo-rpc-extensions/dubbo-rpc-native-thrift/src/main/java/org/apache/dubbo/rpc/protocol/nativethrift/ThriftProtocol.java`
#### Snippet
```java
                    TProtocol tprotocol = new TCompactProtocol(transport);
                    TMultiplexedProtocol protocol = new TMultiplexedProtocol(tprotocol, typeName);
                    thriftClient = (T) constructor.newInstance(protocol);
                    transport.open();
                    logger.info("nativethrift client opened for service(" + url + ")");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
            }
        } else {
            genericTypeAndNamesMap = Collections.EMPTY_MAP;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    public URL rebuildAddress(Address address, URL consumerUrl) {
        URL url = (URL) address.getUrlAddress();
        Map<String, String> parameters = new HashMap<>(url.getParameters());
        parameters.put(VERSION_KEY, consumerUrl.getParameter(VERSION_KEY, "0.0.0"));
        parameters.put(GROUP_KEY, consumerUrl.getParameter(GROUP_KEY));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    @Override
    public <T> void notify(List<Invoker<T>> invokers) {
        this.invokers = (List) invokers;
        // do not build cache until first Specify Invoke happened
        if (ip2Invoker != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        // do not build cache until first Specify Invoke happened
        if (ip2Invoker != null) {
            ip2Invoker = processIp((List) invokers);
            address2Invoker = processAddress((List) invokers);
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        // do not build cache until first Specify Invoke happened
        if (ip2Invoker != null) {
            ip2Invoker = processIp((List) invokers);
            address2Invoker = processAddress((List) invokers);
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        if (ip2Invoker != null) {
            ip2Invoker = processIp((List) invokers);
            address2Invoker = processAddress((List) invokers);
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        if (ip2Invoker != null) {
            ip2Invoker = processIp((List) invokers);
            address2Invoker = processAddress((List) invokers);
        }
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `RemotingException`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
     * @param message message that need send.
     * @param sent    whether to ack async-sent
     * @throws RemotingException throw RemotingException if wait until timeout or any exception thrown by method body that surrounded by try-catch.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
    /**
     * The constructor of NettyChannel.
     * It is private so NettyChannel usually create by {@link QuicNettyChannel#getOrAddChannel(Channel, URL, ChannelHandler)}
     *
     * @param channel netty channel
```

### JavadocReference
Cannot resolve symbol `ChannelHandler`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
    /**
     * The constructor of NettyChannel.
     * It is private so NettyChannel usually create by {@link QuicNettyChannel#getOrAddChannel(Channel, URL, ChannelHandler)}
     *
     * @param channel netty channel
```

### JavadocReference
Cannot resolve symbol `AbstractDynamicConfigurationFactory`
in `dubbo-configcenter-extensions/dubbo-configcenter-etcd/src/main/java/org/apache/dubbo/configcenter/support/etcd/EtcdDynamicConfigurationFactory.java`
#### Snippet
```java

/**
 * The etcd implementation of {@link AbstractDynamicConfigurationFactory}
 */
public class EtcdDynamicConfigurationFactory extends AbstractDynamicConfigurationFactory {
```

### JavadocReference
Cannot resolve symbol `org.apache.dubbo.rpc.proxy.InvokerInvocationHandler`
in `dubbo-rpc-extensions/dubbo-rpc-rmi/src/main/java/org/apache/dubbo/rpc/protocol/rmi/RmiRemoteInvocation.java`
#### Snippet
```java
     * Need to restore context on provider side (Though context will be overridden by Invocation's attachment
     * when ContextFilter gets executed, we will restore the attachment when Invocation is constructed, check more
     * from {@link org.apache.dubbo.rpc.proxy.InvokerInvocationHandler}
     */
    @SuppressWarnings("unchecked")
```

### JavadocReference
Cannot resolve symbol `DynamicConfiguration`
in `dubbo-configcenter-extensions/dubbo-configcenter-etcd/src/main/java/org/apache/dubbo/configcenter/support/etcd/EtcdDynamicConfiguration.java`
#### Snippet
```java

/**
 * The etcd implementation of {@link DynamicConfiguration}
 */
public class EtcdDynamicConfiguration implements DynamicConfiguration {
```

### JavadocReference
Cannot resolve symbol `MetadataReport`
in `dubbo-metadata-report-extensions/dubbo-metadata-report-etcd/src/main/java/org/apache/dubbo/metadata/store/etcd/EtcdMetadataReportFactory.java`
#### Snippet
```java

/**
 * MetadataReportFactory to create an Etcd based {@link MetadataReport}.
 */
public class EtcdMetadataReportFactory extends AbstractMetadataReportFactory {
```

### JavadocReference
Cannot resolve symbol `GenericService`
in `dubbo-gateway-extensions/dubbo-gateway-provider/src/main/java/org/apache/dubbo/gateway/provider/OmnipotentService.java`
#### Snippet
```java

/**
 * A more general server-side generalization service than {@link GenericService}
 * Any type of interface can be accepted
 *
```

### JavadocReference
Cannot resolve symbol `GenericException`
in `dubbo-gateway-extensions/dubbo-gateway-provider/src/main/java/org/apache/dubbo/gateway/provider/OmnipotentService.java`
#### Snippet
```java
     * @param invocation  New construction point invocation, including original service, method and other information
     * @return Custom object
     * @throws GenericException potential exception thrown from the invocation
     */
    Object $invokeOmn(Invocation invocation) throws GenericException;
```

### JavadocReference
Cannot resolve symbol `RemotingException`
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/Peer.java`
#### Snippet
```java
     * leave.
     *
     * @throws RemotingException
     */
    void leave() throws RemotingException;
```

### JavadocReference
Cannot resolve symbol `RemotingException`
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/Group.java`
#### Snippet
```java
     *
     * @param url
     * @throws RemotingException
     */
    void leave(URL url) throws RemotingException;
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulParameter.java`
#### Snippet
```java

/**
 * The enumeration for the Consul's parameters on the {@link URL}
 *
 * @see URL#getParameters()
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulParameter.java`
#### Snippet
```java
 * The enumeration for the Consul's parameters on the {@link URL}
 *
 * @see URL#getParameters()
 * @since 2.7.8
 */
```

### JavadocReference
Cannot resolve symbol `getParameters()`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulParameter.java`
#### Snippet
```java
 * The enumeration for the Consul's parameters on the {@link URL}
 *
 * @see URL#getParameters()
 * @since 2.7.8
 */
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulParameter.java`
#### Snippet
```java

    /**
     * The parameter value from the specified registry {@link URL}
     *
     * @param registryURL the specified registry {@link URL}
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulParameter.java`
#### Snippet
```java
     * The parameter value from the specified registry {@link URL}
     *
     * @param registryURL the specified registry {@link URL}
     * @return <code>defaultValue</code> if not found
     */
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulParameter.java`
#### Snippet
```java

    /**
     * The parameter value from the specified registry {@link URL}
     *
     * @param registryURL  the specified registry {@link URL}
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulParameter.java`
#### Snippet
```java
     * The parameter value from the specified registry {@link URL}
     *
     * @param registryURL  the specified registry {@link URL}
     * @param valueType    the type of parameter value
     * @param defaultValue the default value if parameter is absent
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
     * Get the {@link ConsistencyMode}
     *
     * @param registryURL the {@link URL} of registry
     * @return non-null, {@link ConsistencyMode#DEFAULT} as default
     * @sine 2.7.8
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java

    /**
     * Get the "tags" from the {@link URL} of registry
     *
     * @param registryURL the {@link URL} of registry
```

### JavadocReference
Cannot resolve symbol `URL`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
     * Get the "tags" from the {@link URL} of registry
     *
     * @param registryURL the {@link URL} of registry
     * @return non-null
     * @sine 2.7.8
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyClient.java`
#### Snippet
```java
                        .addLast("client-idle-handler", new IdleStateHandler(heartbeatInterval, 0, 0, TimeUnit.MILLISECONDS))
                        .addLast("handler", nettyClientHandler);
                    ;
                }
            }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/TestEnum.java`
#### Snippet
```java
    TEST_ENUM_1,
    TEST_ENUM_2,
    TEST_ENUM_3;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/filter/AdminMockFilter.java`
#### Snippet
```java

    private final TypeHandler typeHandler = new CommonTypeHandler();
    ;

    private static final boolean ENABLE_ADMIN_MOCK = Boolean.parseBoolean(System.getProperty(ENABLE_MOCK_KEY, Boolean.FALSE.toString()));
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/filter/AdminMockFilter.java`
#### Snippet
```java

    private static final boolean ENABLE_ADMIN_MOCK = Boolean.parseBoolean(System.getProperty(ENABLE_MOCK_KEY, Boolean.FALSE.toString()));
    ;

    private static final ProxyFactory proxyFactory = ExtensionLoader.getExtensionLoader(ProxyFactory.class).getAdaptiveExtension();
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/beans/HtmlTypeEnum.java`
#### Snippet
```java
     */
    DATETIME_SELECTOR,
    ;

}
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getRemoteAddress` may produce `NullPointerException`
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyServerHandler.java`
#### Snippet
```java

        if (logger.isInfoEnabled()) {
            logger.info("The connection of " + channel.getRemoteAddress() + " -> " + channel.getLocalAddress() + " is established.");
        }
    }
```

### DataFlowIssue
Condition `exception instanceof RpcException` is redundant and can be replaced with a null check
in `dubbo-registry-extensions/dubbo-registry-polaris/src/main/java/org/apache/dubbo/registry/polaris/filter/ReportFilter.java`
#### Snippet
```java
            exception = result.getException();
        }
        if (exception instanceof RpcException) {
            rpcException = (RpcException) exception;
        }
```

### DataFlowIssue
Condition `e instanceof RemoteAccessException` is redundant and can be replaced with a null check
in `dubbo-rpc-extensions/dubbo-rpc-rmi/src/main/java/org/apache/dubbo/rpc/protocol/rmi/RmiProtocol.java`
#### Snippet
```java
    @Override
    protected int getErrorCode(Throwable e) {
        if (e instanceof RemoteAccessException) {
            e = e.getCause();
        }
```

### DataFlowIssue
Method invocation `readableBytes` will produce `NullPointerException`
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaCodecAdapter.java`
#### Snippet
```java
                    frame = buffer;
                } else {
                    int size = buffer.readableBytes() + in.remaining();
                    frame = ChannelBuffers.dynamicBuffer(size > bufferSize ? size : bufferSize);
                    frame.writeBytes(buffer, buffer.readableBytes());
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `dubbo-gateway-extensions/dubbo-gateway-consumer/src/main/java/org/apache/dubbo/gateway/consumer/filter/OmnSerFilter.java`
#### Snippet
```java
    public static void convertParameterTypeToJavaBeanDescriptor(Invocation invocation) {
        if (!(invocation instanceof RpcInvocation)) {
            logger.warn("Non-RpcInvocation type, gateway mode does not take effect, type:" + invocation.getClass().getName());
            return;
        }
```

### DataFlowIssue
Method invocation `getUrlAddress` will produce `NullPointerException`
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/DefaultUserSpecifiedServiceAddressBuilder.java`
#### Snippet
```java
                useFixed = true;
            } else {
                if (template.getUrlAddress() == null) {
                    PathURLAddress urlAddress = new PathURLAddress(template.getProtocol(), template.getUsername(), template.getPassword(), template.getPath(), address.getIp(), address.getPort());
                    template = new ServiceConfigURL(urlAddress, template.getUrlParam(), template.getAttributes());
```

### DataFlowIssue
Condition `e instanceof Fault` is redundant and can be replaced with a null check
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    @Override
    protected int getErrorCode(Throwable e) {
        if (e instanceof Fault) {
            e = e.getCause();
        }
```

### DataFlowIssue
Method invocation `getException` may produce `NullPointerException`
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java
                }
            } catch (Throwable ex) {
                RpcException exception = getRpcException(result.getException());
                br.setExceptionMsg(exception.getMessage());
                br.setException(exception);
```

### DataFlowIssue
Condition `throwable instanceof RpcException` is redundant and can be replaced with a null check
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java
    private RpcException getRpcException(Throwable throwable) {
        RpcException rpcException = null;
        if (throwable instanceof RpcException) {
            rpcException = (RpcException) throwable;
        } else {
```

### DataFlowIssue
Method invocation `getMessage` will produce `NullPointerException`
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java
            rpcException = (RpcException) throwable;
        } else {
            rpcException = new RpcException(throwable.getMessage(), throwable);
        }
        return rpcException;
```

### DataFlowIssue
Condition `e instanceof RemoteAccessException` is redundant and can be replaced with a null check
in `dubbo-rpc-extensions/dubbo-rpc-http/src/main/java/org/apache/dubbo/rpc/protocol/http/HttpProtocol.java`
#### Snippet
```java

    protected int getErrorCode(Throwable e) {
        if (e instanceof RemoteAccessException) {
            e = e.getCause();
        }
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java


    public <T> URL buildAddress(List<Invoker<T>> invokers, Address address, URL consumerUrl) {
        if (!invokers.isEmpty()) {
            URL template = invokers.iterator().next().getUrl();
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public <T> List<Invoker<T>> route(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {

        Object addressObj = invocation.get(Address.name);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java

    @Override
    public <T> void notify(List<Invoker<T>> invokers) {
        this.invokers = (List) invokers;
        // do not build cache until first Specify Invoke happened
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'RmiRemoteInvocation' is still used
in `dubbo-rpc-extensions/dubbo-rpc-rmi/src/main/java/com/alibaba/dubbo/rpc/protocol/rmi/RmiRemoteInvocation.java`
#### Snippet
```java
 */
@Deprecated
public class RmiRemoteInvocation extends org.apache.dubbo.rpc.protocol.rmi.RmiRemoteInvocation {
    private static final long serialVersionUID = 1L;

```

### DeprecatedIsStillUsed
Deprecated member 'getInvokers' is still used
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    // For ut only
    @Deprecated
    protected BitList<Invoker<T>> getInvokers() {
        return invokers;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getAddress2Invoker' is still used
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    // For ut only
    @Deprecated
    protected Map<String, Invoker<T>> getAddress2Invoker() {
        return address2Invoker;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getIp2Invoker' is still used
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    // For ut only
    @Deprecated
    protected Map<String, Invoker<T>> getIp2Invoker() {
        return ip2Invoker;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getNewInvokerCache' is still used
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    // For ut only
    @Deprecated
    protected Map<URL, InvokerCache<Invoker<T>>> getNewInvokerCache() {
        return newInvokerCache;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getAddress2Invoker' is still used
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    // For ut only
    @Deprecated
    protected Map<String, Invoker<T>> getAddress2Invoker() {
        return address2Invoker;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getInvokers' is still used
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    // For ut only
    @Deprecated
    protected List<Invoker<T>> getInvokers() {
        return invokers;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getIp2Invoker' is still used
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    // For ut only
    @Deprecated
    protected Map<String, Invoker<T>> getIp2Invoker() {
        return ip2Invoker;
    }
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'test'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'serialization'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'test'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'testcase'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'serialization'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class 'DemoServiceImpl'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-gson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'testcase'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class 'DemoServiceImpl'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fst-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'test'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'serialization'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'testcase'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class 'DemoServiceImpl'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-avro-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'test'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'serialization'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'testcase'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class 'DemoServiceImpl'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-kryo-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'test'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'serialization'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'testcase'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class 'DemoServiceImpl'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-fastjson-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.protobuf.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.protobuf.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.protobuf.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.protobuf.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'test'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.protobuf.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.protobuf.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'serialization'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.protobuf.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.protobuf.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'protobuf'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.protobuf.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.protobuf.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class 'DemoServiceImpl'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protobuf-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.protobuf.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.protobuf.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'test'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'serialization'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class or package 'testcase'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

### SpringXmlModelInspection
Cannot resolve class 'DemoServiceImpl'
in `test/scenarios/scenarios-dubbo-serialization/dubbo-serialization-protostuff-test/src/main/resources/spring/dubbo-demo-provider.xml`
#### Snippet
```java
    <dubbo:registry address="zookeeper://${zookeeper.address:127.0.0.1}:2181"/>

    <bean id="demoService" class="org.apache.dubbo.test.serialization.testcase.DemoServiceImpl"/>

    <dubbo:service interface="org.apache.dubbo.test.serialization.testcase.DemoService" ref="demoService"
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQExporter.java`
#### Snippet
```java
        CRC32 crc32 = new CRC32();
        crc32.update(value.getBytes());
        value = value.replace(".", "-") + NAME_SEPARATOR + Long.toString(crc32.getValue());
        return value;
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/ServiceName.java`
#### Snippet
```java
        CRC32 crc32 = new CRC32();
        crc32.update(value.getBytes());
        value = value.replace(".", "-") + NAME_SEPARATOR + Long.toString(crc32.getValue());
        return value;
    }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
        Map<String, String> genericTypeAndNamesMap;
        if (parameterType instanceof ParameterizedType) {
            ParameterizedType parameterTypeImpl = (ParameterizedType) parameterType;
            Type rawType = parameterTypeImpl.getRawType();
            if (rawType instanceof Class<?>) {
                TypeVariable<? extends Class<?>>[] typeVariables = ((Class<?>) rawType).getTypeParameters();
                Type[] actualTypeArguments = parameterTypeImpl.getActualTypeArguments();
                genericTypeAndNamesMap = new HashMap<>(typeVariables.length);
                for (int i = 0; i < typeVariables.length; i++) {
                    genericTypeAndNamesMap.put(typeVariables[i].getTypeName(), actualTypeArguments[i].getTypeName());
                }
            } else {
                genericTypeAndNamesMap = Collections.emptyMap();
            }
        } else {
            genericTypeAndNamesMap = Collections.emptyMap();
        }
```

### DuplicatedCode
Duplicated code
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
            ParameterizedType parameterTypeImpl = (ParameterizedType) genericType;
            Type rawType = parameterTypeImpl.getRawType();
            if (rawType instanceof Class<?>) {
                TypeVariable<? extends Class<?>>[] typeVariables = ((Class<?>) rawType).getTypeParameters();
                Type[] actualTypeArguments = parameterTypeImpl.getActualTypeArguments();
                genericTypeAndNamesMap = new HashMap<>(typeVariables.length);
                for (int i = 0; i < typeVariables.length; i++) {
                    genericTypeAndNamesMap.put(typeVariables[i].getTypeName(), actualTypeArguments[i].getTypeName());
                }
            } else {
                genericTypeAndNamesMap = Collections.emptyMap();
            }
```

### DuplicatedCode
Duplicated code
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsAnnotationScanner.java`
#### Snippet
```java
                RequestParam requestParam = null;
                if (field.isAnnotationPresent(RequestParam.class)) {
                    // Handling @RequestParam annotations on properties
                    requestParam = field.getAnnotation(RequestParam.class);
                    paramBean.setDocName(requestParam.value());
                    paramBean.setRequired(requestParam.required());
                    paramBean.setDescription(requestParam.description());
                    paramBean.setExample(requestParam.example());
                    paramBean.setDefaultValue(requestParam.defaultValue());
                } else {
                    paramBean.setRequired(false);
                }
```

### DuplicatedCode
Duplicated code
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
                boolean isBuildClassAttribute = false;
                if (null != methodPrarmGenericTypeAndNamesMap) {
                    String subTypeGenericTypeName = methodPrarmGenericTypeAndNamesMap.get(subTypeName);
                    if (StringUtils.isNotBlank(subTypeGenericTypeName)) {
                        subTypeName = subTypeGenericTypeName;
                        isBuildClassAttribute = true;
                    }
                }

                obj = initClassTypeWithDefaultValue(makeParameterizedType(subTypeName), makeClass(subTypeName),
                    processCount, isBuildClassAttribute, methodPrarmGenericTypeAndNamesMap);
```

### DuplicatedCode
Duplicated code
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider-sca/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/SyncDemoImpl.java`
#### Snippet
```java
        BaseResponse<DemoRespBean1> response = new BaseResponse<>();
        DemoRespBean1 responseData = new DemoRespBean1();
        responseData.setCode("2222");
        responseData.setMessage("msg1");
        responseData.setMessage2("msg2");
        response.setData(responseData);
        response.setCode("1111");
        response.setMessage("msg");
        return response;
```

### DuplicatedCode
Duplicated code
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        if (invoker != null) {
            AtomicBoolean match = new AtomicBoolean(true);
            if (StringUtils.isNotEmpty(urlAddress.getProtocol())) {
                match.set(invoker.getUrl().getProtocol().equals(urlAddress.getProtocol()));
            }
            if (match.get()) {
                urlAddress.getParameters().forEach((k, v) -> {
                    if (match.get()) {
                        match.set(v.equals(invoker.getUrl().getParameter(k)));
                    }
                });
            }
            if (match.get()) {
                return invoker;
            }
        }
```

### DuplicatedCode
Duplicated code
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        if (port != 0) {
            targetInvoker = address2Invoker.get(ip + ":" + port);
            if (targetInvoker != null) {
                return targetInvoker;
            }
        } else {
            targetInvoker = ip2Invoker.get(ip);
            if (targetInvoker != null) {
                return targetInvoker;
            }
        }

        if (!address.isNeedToCreate()) {
            throwException(address);
        }
```

### DuplicatedCode
Duplicated code
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        Map<String, Invoker<T>> address2Invoker = new HashMap<>();
        for (Invoker<T> invoker : addresses) {
            address2Invoker.put(invoker.getUrl().getHost() + ":" + invoker.getUrl().getPort(), invoker);
        }
        return Collections.unmodifiableMap(address2Invoker);
```

### DuplicatedCode
Duplicated code
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
            cacheLock.lock();
            try {
                if (newInvokerCache.size() > 0) {
                    Iterator<Map.Entry<URL, InvokerCache<Invoker<T>>>> iterator = newInvokerCache.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<URL, InvokerCache<Invoker<T>>> entry = iterator.next();
                        if (System.currentTimeMillis() - entry.getValue().getLastAccess() > EXPIRE_TIME) {
                            iterator.remove();
                            entry.getValue().getInvoker().destroy();
                        } else {
                            break;
                        }
                    }
                }
            } finally {
                cacheLock.unlock();
            }
```

### DuplicatedCode
Duplicated code
in `dubbo-gateway-extensions/dubbo-gateway-provider/src/main/java/org/apache/dubbo/gateway/provider/SnfDecodeableRpcInvocation.java`
#### Snippet
```java
        this.put(SERIALIZATION_ID_KEY, serializationType);

        String dubboVersion = in.readUTF();
        request.setVersion(dubboVersion);
        setAttachment(DUBBO_VERSION_KEY, dubboVersion);

        String path = in.readUTF();
        setAttachment(PATH_KEY, path);
        String version = in.readUTF();
        setAttachment(VERSION_KEY, version);

        setMethodName(in.readUTF());

        String desc = in.readUTF();
        setParameterTypesDesc(desc);

        ClassLoader originClassLoader = Thread.currentThread().getContextClassLoader();
```

### DuplicatedCode
Duplicated code
in `dubbo-registry-extensions/dubbo-registry-etcd3/src/main/java/org/apache/dubbo/registry/etcd/EtcdRegistry.java`
#### Snippet
```java
                ConcurrentMap<NotifyListener, ChildListener> listeners =
                        Optional.ofNullable(etcdListeners.get(url))
                                .orElseGet(() -> {
                                    ConcurrentMap<NotifyListener, ChildListener> container, prev;
                                    prev = etcdListeners.putIfAbsent(url, container = new ConcurrentHashMap<>());
                                    return prev != null ? prev : container;
                                });
```

### DuplicatedCode
Duplicated code
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistry.java`
#### Snippet
```java
        if (userData == null) {
            datas = new ArrayList<>(0);
        } else {
            datas = flatUserData(userData);
        }

        StringBuilder sb = new StringBuilder();
        for (String provider : datas) {
            sb.append("  >>> ").append(provider).append("\n");
        }
```

### DuplicatedCode
Duplicated code
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistry.java`
#### Snippet
```java
        List<String> result = new ArrayList<>();
        Map<String, List<String>> zoneData = userData.getZoneData();

        for (Map.Entry<String, List<String>> entry : zoneData.entrySet()) {
            result.addAll(entry.getValue());
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                        int index = len, count = 0;
                        if (child.length() > len) {
                            for (; (index = child.indexOf(PATH_SEPARATOR, index)) != -1; ++index) {
                                if (count++ > 1) {
                                    break;
                                }
                            }
                        }
                        return count == 1;
```

### DuplicatedCode
Duplicated code
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/AbstractExchangeGroup.java`
#### Snippet
```java
        for (URL url : new ArrayList<URL>(servers.keySet())) {
            try {
                leave(url);
            } catch (Throwable t) {
                logger.error(t.getMessage(), t);
            }
        }
        for (URL url : new ArrayList<URL>(clients.keySet())) {
            try {
                disconnect(url);
            } catch (Throwable t) {
                logger.error(t.getMessage(), t);
            }
        }
```

### DuplicatedCode
Duplicated code
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/ExchangeServerPeer.java`
#### Snippet
```java
        Throwable last = null;
        try {
            super.send(message, sent);
        } catch (Throwable t) {
            last = t;
        }
        for (Client client : clients.values()) {
            try {
                client.send(message, sent);
            } catch (Throwable t) {
                last = t;
            }
        }
        if (last != null) {
            if (last instanceof RemotingException) {
                throw (RemotingException) last;
            } else if (last instanceof RuntimeException) {
                throw (RuntimeException) last;
            } else {
                throw new RuntimeException(last.getMessage(), last);
            }
        }
```

### DuplicatedCode
Duplicated code
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/FileExchangeGroup.java`
#### Snippet
```java
        try {
            String[] lines = IOUtils.readLines(file);
            for (String line : lines) {
                connect(URL.valueOf(line));
            }
        } catch (IOException e) {
            throw new RemotingException(new InetSocketAddress(NetUtils.getLocalHost(), 0), getUrl().toInetSocketAddress(), e.getMessage(), e);
        }
```

### DuplicatedCode
Duplicated code
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/FileExchangeGroup.java`
#### Snippet
```java
        try {
            String full = url.toFullString();
            String[] lines = IOUtils.readLines(file);
            for (String line : lines) {
                if (full.equals(line)) {
                    return peer;
                }
            }
            IOUtils.appendLines(file, new String[]{full});
        } catch (IOException e) {
            throw new RemotingException(new InetSocketAddress(NetUtils.getLocalHost(), 0), getUrl().toInetSocketAddress(), e.getMessage(), e);
        }
        return peer;
```

### DuplicatedCode
Duplicated code
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/FileExchangeGroup.java`
#### Snippet
```java
        super.leave(url);
        try {
            String full = url.toFullString();
            String[] lines = IOUtils.readLines(file);
            List<String> saves = new ArrayList<String>();
            for (String line : lines) {
                if (full.equals(line)) {
                    return;
                }
                saves.add(line);
            }
            IOUtils.appendLines(file, saves.toArray(new String[0]));
        } catch (IOException e) {
            throw new RemotingException(new InetSocketAddress(NetUtils.getLocalHost(), 0), getUrl().toInetSocketAddress(), e.getMessage(), e);
        }
```

### DuplicatedCode
Duplicated code
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/MulticastExchangeGroup.java`
#### Snippet
```java
        if (msg.startsWith(JOIN)) {
            String url = msg.substring(JOIN.length()).trim();
            connect(URL.valueOf(url));
        } else if (msg.startsWith(LEAVE)) {
            String url = msg.substring(LEAVE.length()).trim();
            disconnect(URL.valueOf(url));
        }
```

### DuplicatedCode
Duplicated code
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
            final int expiry = url.getParameter("expiry", 0);
            final String get = url.getParameter("get", "get");
            final String set = url.getParameter("set", Map.class.equals(type) ? "put" : "set");
            final String delete = url.getParameter("delete", Map.class.equals(type) ? "remove" : "delete");
```

### DuplicatedCode
Duplicated code
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQChannel.java`
#### Snippet
```java
            Message newMessage = MessageUtil.createReplyMessage(messageExt, buffer.array());
            newMessage.putUserProperty(RocketMQProtocolConstant.SEND_ADDRESS, RocketMQProtocolConstant.LOCAL_ADDRESS.getHostString());
            newMessage.putUserProperty(RocketMQProtocolConstant.URL_STRING, urlString);
            SendResult sendResult = defaultMQProducer.send(newMessage, 3000);
            if (logger.isDebugEnabled()) {
                logger.debug(String.format("send result is : %s", sendResult));
            }
```

### DuplicatedCode
Duplicated code
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
                RpcContext.getContext().setRemoteAddress(message.getUserProperty(RocketMQProtocolConstant.SEND_ADDRESS), 9876);

                String urlString = message.getUserProperty(RocketMQProtocolConstant.URL_STRING);
                URL url = URL.valueOf(urlString);

                RocketMQChannel channel = new RocketMQChannel();
                channel.setRemoteAddress(RpcContext.getContext().getRemoteAddress());
                channel.setUrl(url);
```

### DuplicatedCode
Duplicated code
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/KryoObjectInput.java`
#### Snippet
```java
        try {
            int len = input.readInt();
            if (len < 0) {
                return null;
            } else if (len == 0) {
                return new byte[]{};
            } else {
                return input.readBytes(len);
            }
        } catch (KryoException e) {
            throw new IOException(e);
        }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                    this.watchRequest.onNext(cancelRequest);
                }
            } catch (Exception ignored) {
                logger.warn("Failed to cancel watch for path '" + path + "'", ignored);
            }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                }
                onFailed.accept(null);
            } catch (Exception ignored) {
                logger.warn("Failed to recover from global lease expired or lease deadline exceeded. lease '" + leaseId + "'", ignored);
            }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `dubbo-rpc-extensions/dubbo-rpc-memcached/src/main/java/org/apache/dubbo/rpc/protocol/memcached/MemcachedProtocol.java`
#### Snippet
```java
            return new AbstractInvoker<T>(type, url) {
                @Override
                protected Result doInvoke(Invocation invocation) throws Throwable {
                    try {
                        Object value = null;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
            return new AbstractInvoker<T>(type, url) {
                @Override
                protected Result doInvoke(Invocation invocation) throws Throwable {
                    Jedis jedis = null;
                    try {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java
            LOGGER.info("Receive updated RPC service addresses: service[" + dataId
                    + "]\n  .Available target addresses size [" + datas.size() + "]\n"
                    + sb.toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistry.java`
#### Snippet
```java
            logger.info("Receive updated RPC service addresses: service[" + dataId
                    + "]\n  .Available target addresses size [" + datas.size() + "]\n"
                    + sb.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/QuickStartDemoImpl.java`
#### Snippet
```java
    @Override
    public QuickStartRespBean quickStart2(Map<String, DemoParamBean4> beanList, QuickStartRequestBase<QuickStartRequestBean, InnerClassRequestBean<DemoParamBean4>> beanParam) {
        return new QuickStartRespBean(200, "【" + beanParam.getMethod() + "】hello " + beanParam.getBody3() + ", " + beanParam.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/QuickStartDemoImpl.java`
#### Snippet
```java
    @Override
    public QuickStartRespBean quickStart(@RequestParam(value = "strParamxxx", required = true) List<DemoParamBean4> strParam, QuickStartRequestBean beanParam) {
        return new QuickStartRespBean(200, "hello " + beanParam.getName() + ", " + beanParam.toString());
    }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java

                List<String> children = clientWrapper.getChildren(path);
                /**
                 * caching the current service
                 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
            }

            /**
             * if children changed , we should refresh invokers
             */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
             */
            if (count == 1) {
                /**
                 * remove prefix
                 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
            lock.lock();
            try {
                /**
                 * If the collection already contains the specified service, do nothing
                 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java

            try {
                /**
                 * issue : https://github.com/apache/dubbo/issues/4115
                 *
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
            return Integer.valueOf(System.getProperty(ETCD_REQUEST_TIMEOUT_KEY));
        }
        /**
         * 10 seconds.
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                            .get(DEFAULT_REQUEST_TIMEOUT, TimeUnit.MILLISECONDS)
                            .getID();
                    /**
                     * If the keepAlive expires, the registration will be re-attempted
                     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                        try {

                            /**
                             * Is it currently reconnecting ?
                             */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                    if (e instanceof EtcdException) {
                        EtcdException error = (EtcdException) e;
                        /**
                         * ttl has expired
                         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                    }
                }).onCompleted(() -> {
                    /**
                     * deadline reached.
                     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                }).build();

        /**
         * If there is already a keepalive, cancel first
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
        cancelKeepAlive();

        /**
         * create and set new keepAlive to globalKeepAliveRef
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
            throw new IllegalStateException(e.getMessage(), e);
        } finally {
            /**
             * Cancel retry
             */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java

        try {
            /**
             * The client is processing reconnection
             */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                    try {

                        /**
                         * The client is processing reconnection,
                         * cancel remaining service registration
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
                    } catch (Exception e) {

                        /**
                         * waiting for retry again
                         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
        if (onFailed != null) {

            /**
             * The following two scenarios will cause the keep-alive failure：
             *
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufObjectOutput.java`
#### Snippet
```java
    @Override
    public void writeObject(Object obj) throws IOException {
        /**
         * Protobuf does not allow writing of non-protobuf generated messages, including null value.
         * Writing of null value from developers should be denied immediately by throwing exception.
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/CompatibleKryo.java`
#### Snippet
```java
        }

        /**
         * Kryo requires every class to provide a zero argument constructor. For any class does not match this condition, kryo have two ways:
         * 1. Use JavaSerializer,
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-rpc-extensions/dubbo-rpc-native-thrift/src/main/java/org/apache/dubbo/rpc/protocol/nativethrift/ThriftProtocol.java`
#### Snippet
```java
                if (tserver == null) {

                    /**Solve the problem of only 50 of the default number of concurrent connections*/
                    TNonblockingServerSocket.NonblockingAbstractServerSocketArgs args = new TNonblockingServerSocket.NonblockingAbstractServerSocketArgs();
                    /**1000 connections*/
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-rpc-extensions/dubbo-rpc-native-thrift/src/main/java/org/apache/dubbo/rpc/protocol/nativethrift/ThriftProtocol.java`
#### Snippet
```java
                    /**Solve the problem of only 50 of the default number of concurrent connections*/
                    TNonblockingServerSocket.NonblockingAbstractServerSocketArgs args = new TNonblockingServerSocket.NonblockingAbstractServerSocketArgs();
                    /**1000 connections*/
                    args.backlog(1000);
                    String bindIp = url.getParameter(Constants.BIND_IP_KEY, url.getHost());
```

### DanglingJavadoc
Dangling Javadoc comment
in `dubbo-rpc-extensions/dubbo-rpc-native-thrift/src/main/java/org/apache/dubbo/rpc/protocol/nativethrift/ThriftProtocol.java`
#### Snippet
```java
                    int bindPort = url.getParameter(Constants.BIND_PORT_KEY, url.getPort());
                    args.bindAddr(new InetSocketAddress(bindIp, bindPort));
                    /**timeout: 10s */
                    args.clientTimeout(10000);

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `DubboMessageListenerConcurrently` may be 'static'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
    }

    private class DubboMessageListenerConcurrently implements MessageListenerConcurrently {

        private RocketMQCountCodec rocketmqCountCodec = new RocketMQCountCodec(FrameworkModel.defaultModel());
```

### InnerClassMayBeStatic
Inner class `InnerRespBean1` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassResponseBean.java`
#### Snippet
```java
    private InnerRespBean3 innerRespBean3;

    class InnerRespBean1 {
        @ResponseProperty("InnerRespBean1#String1")
        private String string1;
```

### InnerClassMayBeStatic
Inner class `InnerRespBean3` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassResponseBean.java`
#### Snippet
```java
    }

    private class InnerRespBean3 {
        @ResponseProperty("InnerRespBean3#String3")
        private String string3;
```

### InnerClassMayBeStatic
Inner class `InnerRespBean2` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassResponseBean.java`
#### Snippet
```java
    }

    public class InnerRespBean2 {
        @ResponseProperty("InnerRespBean2#String2")
        private String string2;
```

### InnerClassMayBeStatic
Inner class `RegistryInfoWrapper` may be 'static'
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
    }

    private class RegistryInfoWrapper {

        private NotifyListener listener;
```

### InnerClassMayBeStatic
Inner class `InnerReqBean1` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassRequestBean.java`
#### Snippet
```java
    private InnerReqBean3 innerReqBean3;

    class InnerReqBean1 {
        @RequestParam("InnerReqBean1#string1")
        private String string1;
```

### InnerClassMayBeStatic
Inner class `InnerReqBean3` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassRequestBean.java`
#### Snippet
```java
    }

    private class InnerReqBean3 {
        @RequestParam("InnerReqBean3#string3")
        private String string3;
```

### InnerClassMayBeStatic
Inner class `InnerReqBean2` may be 'static'
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassRequestBean.java`
#### Snippet
```java
    }

    public class InnerReqBean2 {
        @RequestParam("InnerReqBean2#string2")
        private String string2;
```

### InnerClassMayBeStatic
Inner class `URLHashMethodNameSoapActionServiceConfiguration` may be 'static'
in `dubbo-rpc-extensions/dubbo-rpc-webservice/src/main/java/org/apache/dubbo/rpc/protocol/webservice/WebServiceProtocol.java`
#### Snippet
```java
    }

    private class URLHashMethodNameSoapActionServiceConfiguration extends AbstractServiceConfiguration {
        public String getAction(OperationInfo op, Method method) {
            String uri = op.getName().getNamespaceURI();
```

### InnerClassMayBeStatic
Inner class `InvokeResult` may be 'static'
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java


    private class InvokeResult {
        public RpcException exception;
        public List<BroadcastResult> resultList;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map\>' may not contain values of type 'RocketMQExporter'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQExporter.java`
#### Snippet
```java

    public void afterUnExport() {
        exporterMap.remove(key, this);
    }

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    @Override
    public boolean isAvailable() {
        if (!super.isAvailable()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/RetryLoops.java`
#### Snippet
```java

        boolean rethrow = true;
        if (isRetryException(e)
                && retryPolicy.shouldRetry(retriedCount++, System.currentTimeMillis() - startTimeMs, true)) {
            rethrow = false;
```

### TrivialIf
`if` statement can be simplified
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/RetryLoops.java`
#### Snippet
```java
    private boolean isRetryException(Throwable e) {
        Status status = Status.fromThrowable(e);
        if (OptionUtil.isRecoverable(status)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
        QuicNettyChannel other = (QuicNettyChannel) obj;
        if (channel == null) {
            if (other.channel != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
                return false;
            }
        } else if (!channel.equals(other.channel)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyChannel.java`
#### Snippet
```java
        GrizzlyChannel other = (GrizzlyChannel) obj;
        if (connection == null) {
            if (other.connection != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyChannel.java`
#### Snippet
```java
                return false;
            }
        } else if (!connection.equals(other.connection)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaChannel.java`
#### Snippet
```java
        MinaChannel other = (MinaChannel) obj;
        if (session == null) {
            if (other.session != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `dubbo-remoting-extensions/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaChannel.java`
#### Snippet
```java
                return false;
            }
        } else if (!session.equals(other.session)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
        }

        if (MessageLite.class.isAssignableFrom(clazz)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/ServiceName.java`
#### Snippet
```java
        }

        if (!StringUtils.isEquals(this.group, serviceName.group) &&
            !matchRange(this.group, serviceName.group)) {
            return false;
```

### TrivialIf
`if` statement can be simplified
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
     */
    public static boolean isBaseType(Object o) {
        if (o instanceof Integer ||
            o instanceof Byte ||
            o instanceof Long ||
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
                return Collections.emptyList();
            }
            if (children.size() <= 0) {
                return children;
            }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'JedisPool' used without 'try'-with-resources statement
in `dubbo-rpc-extensions/dubbo-rpc-redis/src/main/java/org/apache/dubbo/rpc/protocol/redis/RedisProtocol.java`
#### Snippet
```java
                config.setMinEvictableIdleTimeMillis(url.getParameter("min.evictable.idle.time.millis", 0));
            }
            final JedisPool jedisPool = new JedisPool(config, url.getHost(), url.getPort(DEFAULT_PORT),
                    url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT),
                    StringUtils.isBlank(url.getPassword()) ? null : url.getPassword(),
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'null != genericType' covered by subsequent condition 'genericType instanceof GenericArrayType'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
        } else if (classType.isArray()) {
            Object obj;
            if (null != genericType && genericType instanceof GenericArrayType) {
                GenericArrayType pt = (GenericArrayType) genericType;
                String subTypeName = pt.getGenericComponentType().getTypeName();
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param url` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
     *
     * @param channel netty channel
     * @param url
     * @param handler dubbo handler that contain netty handler
     */
```

### JavadocDeclaration
`@param url` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
     *
     * @param ch      netty channel
     * @param url
     * @param handler dubbo handler that contain netty's handler
     * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
     * @param url
     * @param handler dubbo handler that contain netty's handler
     * @return
     */
    static QuicNettyChannel getOrAddChannel(Channel ch, URL url, ChannelHandler handler) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyServer.java`
#### Snippet
```java
     * Init and start netty server
     *
     * @throws Throwable
     */
    @Override
```

### JavadocDeclaration
`@param methodInvocation` tag description is missing
in `dubbo-rpc-extensions/dubbo-rpc-rmi/src/main/java/com/alibaba/dubbo/rpc/protocol/rmi/RmiRemoteInvocation.java`
#### Snippet
```java
     * executed on consumer side
     *
     * @param methodInvocation
     */
    public RmiRemoteInvocation(MethodInvocation methodInvocation) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyClient.java`
#### Snippet
```java
     * Init bootstrap
     *
     * @throws Throwable
     */
    @Override
```

### JavadocDeclaration
`@param connection` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyChannel.java`
#### Snippet
```java

    /**
     * @param connection
     * @param url
     * @param handler
```

### JavadocDeclaration
`@param url` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyChannel.java`
#### Snippet
```java
    /**
     * @param connection
     * @param url
     * @param handler
     */
```

### JavadocDeclaration
`@param handler` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-grizzly/src/main/java/org/apache/dubbo/remoting/transport/grizzly/GrizzlyChannel.java`
#### Snippet
```java
     * @param connection
     * @param url
     * @param handler
     */
    private GrizzlyChannel(Connection<?> connection, URL url, ChannelHandler handler) {
```

### JavadocDeclaration
`@return` tag description is missing
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufObjectInput.java`
#### Snippet
```java
     * Avoid using readObject, always try to pass the target class type for the data you want to read.
     *
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param attachments` tag description is missing
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufJsonObjectOutput.java`
#### Snippet
```java
     * FIXME, only supports transmission of String values.
     *
     * @param attachments
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufJsonObjectOutput.java`
#### Snippet
```java
     *
     * @param attachments
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufJsonObjectInput.java`
#### Snippet
```java
     * FIXME, only supports transmission of String values.
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufJsonObjectInput.java`
#### Snippet
```java
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/GenericProtobufJsonObjectInput.java`
#### Snippet
```java
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
```

### JavadocDeclaration
Wrong tag `param:`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/ISyncDemo.java`
#### Snippet
```java
     *
     * @return java.lang.String
     * @param: param1
     */
    String demoApi3(String param1);
```

### JavadocDeclaration
Wrong tag `param:`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/ISyncDemo.java`
#### Snippet
```java
     *
     * @return java.lang.String
     * @param:
     */
    String demoApi4();
```

### JavadocDeclaration
`@param param1` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/ISyncDemo.java`
#### Snippet
```java
     * Simple test.
     *
     * @param param1
     * @param param2
     * @return org.apache.dubbo.apidocs.examples.params.DemoParamBean3
```

### JavadocDeclaration
`@param param2` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/ISyncDemo.java`
#### Snippet
```java
     *
     * @param param1
     * @param param2
     * @return org.apache.dubbo.apidocs.examples.params.DemoParamBean3
     */
```

### JavadocDeclaration
Wrong tag `param:`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/ISyncDemo.java`
#### Snippet
```java
     *
     * @return java.lang.String
     * @param: param1
     * @param: param2
     */
```

### JavadocDeclaration
Wrong tag `param:`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/ISyncDemo.java`
#### Snippet
```java
     * @return java.lang.String
     * @param: param1
     * @param: param2
     */
    String demoApi2(String param1, String param2);
```

### JavadocDeclaration
`@param param1` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/ISyncDemo.java`
#### Snippet
```java
     * request and response parameters are beans.
     *
     * @param param1
     * @param param2
     * @return org.apache.dubbo.apidocs.examples.responses.DemoRespBean1
```

### JavadocDeclaration
`@param param2` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/ISyncDemo.java`
#### Snippet
```java
     *
     * @param param1
     * @param param2
     * @return org.apache.dubbo.apidocs.examples.responses.DemoRespBean1
     */
```

### JavadocDeclaration
`@param beanParam` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IQuickStartDemo.java`
#### Snippet
```java
     * quick start demo4, response use multiple generic bean, but not set generic.
     *
     * @param beanParam
     * @return org.apache.dubbo.apidocs.examples.params.QuickStartRequestBase
     */
```

### JavadocDeclaration
`@param strParam` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IQuickStartDemo.java`
#### Snippet
```java
     * quick start demo.
     *
     * @param strParam
     * @param beanParam
     * @return org.apache.dubbo.apidocs.examples.params.QuickStartRespBean
```

### JavadocDeclaration
`@param beanParam` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IQuickStartDemo.java`
#### Snippet
```java
     *
     * @param strParam
     * @param beanParam
     * @return org.apache.dubbo.apidocs.examples.params.QuickStartRespBean
     */
```

### JavadocDeclaration
`@param testBean` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IQuickStartDemo.java`
#### Snippet
```java
     * internal class test.
     *
     * @param testBean
     * @return org.apache.dubbo.apidocs.examples.params.InnerClassResponseBean
     */
```

### JavadocDeclaration
`@param beanList` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IQuickStartDemo.java`
#### Snippet
```java
     * quick start demo2, request use generic.
     *
     * @param beanList
     * @param beanParam
     * @return org.apache.dubbo.apidocs.examples.params.QuickStartRespBean
```

### JavadocDeclaration
`@param beanParam` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IQuickStartDemo.java`
#### Snippet
```java
     *
     * @param beanList
     * @param beanParam
     * @return org.apache.dubbo.apidocs.examples.params.QuickStartRespBean
     */
```

### JavadocDeclaration
Wrong tag `param:`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IAsyncDemo.java`
#### Snippet
```java
     *
     * @return java.util.concurrent.CompletableFuture<java.util.List < java.util.List < java.lang.String>>>
     * @param:
     */
    CompletableFuture<List<List<String>>> demoApi12();
```

### JavadocDeclaration
`@param param1` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IAsyncDemo.java`
#### Snippet
```java
     * request and response parameters are beans.
     *
     * @param param1
     * @param param2
     * @return java.util.concurrent.CompletableFuture<org.apache.dubbo.apidocs.examples.responses.DemoRespBean1>
```

### JavadocDeclaration
`@param param2` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IAsyncDemo.java`
#### Snippet
```java
     *
     * @param param1
     * @param param2
     * @return java.util.concurrent.CompletableFuture<org.apache.dubbo.apidocs.examples.responses.DemoRespBean1>
     */
```

### JavadocDeclaration
`@param param1` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IAsyncDemo.java`
#### Snippet
```java
     * Simple test.
     *
     * @param param1
     * @param param2
     * @return java.util.concurrent.CompletableFuture<org.apache.dubbo.apidocs.examples.params.DemoParamBean3>
```

### JavadocDeclaration
`@param param2` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/api/IAsyncDemo.java`
#### Snippet
```java
     *
     * @param param1
     * @param param2
     * @return java.util.concurrent.CompletableFuture<org.apache.dubbo.apidocs.examples.params.DemoParamBean3>
     */
```

### JavadocDeclaration
Wrong tag `date`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassResponseBean.java`
#### Snippet
```java
 * Internal class test, response bean.
 *
 * @date 2021/2/2 16:24
 */
public class InnerClassResponseBean<T> {
```

### JavadocDeclaration
Wrong tag `date`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/QuickStartRequestBase.java`
#### Snippet
```java
 * QuickStartRequestBase.
 *
 * @date 2021/1/26 15:24
 */
public class QuickStartRequestBase<E, T> implements java.io.Serializable {
```

### JavadocDeclaration
Wrong tag `date`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-api/src/main/java/org/apache/dubbo/apidocs/examples/params/InnerClassRequestBean.java`
#### Snippet
```java
 * Internal class test, request bean.
 *
 * @date 2021/2/2 16:24
 */
public class InnerClassRequestBean<T> {
```

### JavadocDeclaration
Wrong tag `date`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/spi/DubboDocExporterListener.java`
#### Snippet
```java
 * .
 *
 * @date 2020/10/29 10:50
 */
@Activate
```

### JavadocDeclaration
Wrong tag `date`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/spi/TestConfigPostProcessor.java`
#### Snippet
```java
 * .
 *
 * @date 2021/1/12 16:51
 */
@Activate
```

### JavadocDeclaration
Wrong tag `date`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/spi/TestConfigInitializer.java`
#### Snippet
```java
 * .
 *
 * @date 2021/1/12 17:09
 */
@Activate
```

### JavadocDeclaration
Wrong tag `date`
in `dubbo-api-docs/dubbo-api-docs-examples/examples-provider/src/main/java/org/apache/dubbo/apidocs/examples/api/impl/QuickStartDemoImpl.java`
#### Snippet
```java
 * quick start demo implement.
 *
 * @date 2020/12/23 17:21
 */
@DubboService(version = "${demo.apiversion.quickstart}", group = "demoGroup")
```

### JavadocDeclaration
Wrong tag `date`
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/Constants.java`
#### Snippet
```java
 * constants.
 *
 * @date 2021/2/3 10:19
 */
public class Constants {
```

### JavadocDeclaration
`@param apiInterfaceClassName` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/providers/IDubboDocProvider.java`
#### Snippet
```java
     * Get module information according to the complete class name of Dubbo provider interface.
     *
     * @param apiInterfaceClassName
     * @return java.lang.String
     */
```

### JavadocDeclaration
`@param apiInterfaceClassNameMethodName` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/providers/IDubboDocProvider.java`
#### Snippet
```java
     * Get method parameters and return information according to the complete class name and method name of Dubbo provider interface.
     *
     * @param apiInterfaceClassNameMethodName
     * @return java.lang.String
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/beans/ParamBean.java`
#### Snippet
```java
    /**
     * If the parameter in a request bean is not a basic data type,
     * the {@link #subParams} will have a value.
     * Because the HTML form is not easy to display this parameter,
     * it will be displayed as a text area, and the JSON string of this parameter will be filled in.
```

### JavadocDeclaration
`@throws` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/Peer.java`
#### Snippet
```java
     * leave.
     *
     * @throws RemotingException
     */
    void leave() throws RemotingException;
```

### JavadocDeclaration
`@param url` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/Group.java`
#### Snippet
```java
     * leave.
     *
     * @param url
     * @throws RemotingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/Group.java`
#### Snippet
```java
     *
     * @param url
     * @throws RemotingException
     */
    void leave(URL url) throws RemotingException;
```

### JavadocDeclaration
`@param url` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/Group.java`
#### Snippet
```java
     * join.
     *
     * @param url
     */
    Peer join(URL url, ChannelHandler handler) throws RemotingException;
```

### JavadocDeclaration
`@param url` tag description is missing
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/ExchangeGroup.java`
#### Snippet
```java
     * join.
     *
     * @param url
     */
    ExchangePeer join(URL url, ExchangeHandler handler) throws RemotingException;
```

### JavadocDeclaration
`@param o` tag description is missing
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/ClassTypeUtil.java`
#### Snippet
```java
     * Check if it is a basic data type.
     *
     * @param o
     * @return boolean
     */
```

### JavadocDeclaration
Wrong tag `sine`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
     * @param registryURL the {@link URL} of registry
     * @return non-null, {@link ConsistencyMode#DEFAULT} as default
     * @sine 2.7.8
     */
    private ConsistencyMode getConsistencyMode(URL registryURL) {
```

### JavadocDeclaration
Wrong tag `sine`
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
     * @param registryURL the {@link URL} of registry
     * @return non-null
     * @sine 2.7.8
     */
    private List<String> getTags(URL registryURL) {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `rocketMQCountCodec.decode(...)` to `Object` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java

                HeapChannelBuffer heapChannelBuffer = new HeapChannelBuffer(message.getBody());
                Object object = (Object) rocketMQCountCodec.decode(channel, heapChannelBuffer);
                Response response = (Response) object;
                DefaultFuture.received(channel, response);
```

### RedundantCast
Casting `JSON.parseObject(...)` to `T` is redundant
in `dubbo-serialization-extensions/dubbo-serialization-fastjson/src/main/java/org/apache/dubbo/common/serialize/fastjson/FastJsonObjectInput.java`
#### Snippet
```java
    public <T> T readObject(Class<T> cls, Type type) throws IOException, ClassNotFoundException {
        String json = readLine();
        return (T) JSON.parseObject(json, type);
    }

```

### RedundantCast
Casting `address.getUrlAddress()` to `URL` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo3/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/DefaultUserSpecifiedServiceAddressBuilder.java`
#### Snippet
```java
    @Override
    public <T> URL rebuildAddress(List<Invoker<T>> invokers, Address address, Invocation invocation, URL consumerUrl) {
        URL url = (URL) address.getUrlAddress();
        Map<String, String> parameters = new HashMap<>(url.getParameters());
        parameters.put(VERSION_KEY, consumerUrl.getVersion());
```

### RedundantCast
Casting `invoker` to `Invoker` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        if (address.getUrlAddress() != null) {
            Invoker<?> invoker = getInvokerByURL(address);
            result.add((Invoker) invoker);
            return result;
        }
```

### RedundantCast
Casting `invoker` to `Invoker` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        if (StringUtils.isNotEmpty(address.getIp())) {
            Invoker<?> invoker = getInvokerByIp(address);
            result.add((Invoker) invoker);
            return result;
        }
```

### RedundantCast
Casting `address.getUrlAddress()` to `URL` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java

    public URL rebuildAddress(Address address, URL consumerUrl) {
        URL url = (URL) address.getUrlAddress();
        Map<String, String> parameters = new HashMap<>(url.getParameters());
        parameters.put(VERSION_KEY, consumerUrl.getParameter(VERSION_KEY, "0.0.0"));
```

### RedundantCast
Casting `invokers` to `List` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
    @Override
    public <T> void notify(List<Invoker<T>> invokers) {
        this.invokers = (List) invokers;
        // do not build cache until first Specify Invoke happened
        if (ip2Invoker != null) {
```

### RedundantCast
Casting `invokers` to `List` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        // do not build cache until first Specify Invoke happened
        if (ip2Invoker != null) {
            ip2Invoker = processIp((List) invokers);
            address2Invoker = processAddress((List) invokers);
        }
```

### RedundantCast
Casting `invokers` to `List` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-specify-address-dubbo2/src/main/java/org/apache/dubbo/rpc/cluster/specifyaddress/UserSpecifiedAddressRouter.java`
#### Snippet
```java
        if (ip2Invoker != null) {
            ip2Invoker = processIp((List) invokers);
            address2Invoker = processAddress((List) invokers);
        }
    }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `codec` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/RocketMQCountCodec.java`
#### Snippet
```java
public class RocketMQCountCodec implements Codec2 {

    private RocketMQCodec codec;

    public RocketMQCountCodec(FrameworkModel frameworkModel) {
```

### FieldMayBeFinal
Field `frameworkModel` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/RocketMQCodec.java`
#### Snippet
```java
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class<?>[0];
    private static final Logger log = LoggerFactory.getLogger(RocketMQCodec.class);
    private FrameworkModel frameworkModel;

    public RocketMQCodec(FrameworkModel frameworkModel) {
```

### FieldMayBeFinal
Field `rocketMQCountCodec` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    private final ReentrantLock destroyLock = new ReentrantLock();
    private final String version;
    private RocketMQCountCodec rocketMQCountCodec = new RocketMQCountCodec(FrameworkModel.defaultModel());
    private DefaultMQProducer defaultMQProducer;
    private String group;
```

### FieldMayBeFinal
Field `topic` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    private Channel channel = new RocketMQChannel();

    private String topic;

    private String groupModel;
```

### FieldMayBeFinal
Field `timeout` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    private String groupModel;

    private Integer timeout;

    public RocketMQInvoker(Class<T> type, URL url, RocketMQProtocolServer rocketMQProtocolServer) {
```

### FieldMayBeFinal
Field `defaultMQProducer` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    private final String version;
    private RocketMQCountCodec rocketMQCountCodec = new RocketMQCountCodec(FrameworkModel.defaultModel());
    private DefaultMQProducer defaultMQProducer;
    private String group;

```

### FieldMayBeFinal
Field `group` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    private RocketMQCountCodec rocketMQCountCodec = new RocketMQCountCodec(FrameworkModel.defaultModel());
    private DefaultMQProducer defaultMQProducer;
    private String group;

    private MessageQueue messageQueue;
```

### FieldMayBeFinal
Field `groupModel` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    private String topic;

    private String groupModel;

    private Integer timeout;
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQInvoker.java`
#### Snippet
```java
    private MessageQueue messageQueue;

    private Channel channel = new RocketMQChannel();

    private String topic;
```

### FieldMayBeFinal
Field `serializationType` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcResult.java`
#### Snippet
```java
    private Channel channel;

    private byte serializationType;

    private InputStream inputStream;
```

### FieldMayBeFinal
Field `inputStream` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcResult.java`
#### Snippet
```java
    private byte serializationType;

    private InputStream inputStream;

    private Response response;
```

### FieldMayBeFinal
Field `response` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcResult.java`
#### Snippet
```java
    private InputStream inputStream;

    private Response response;

    private Invocation invocation;
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcResult.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(DecodeableRpcResult.class);

    private Channel channel;

    private byte serializationType;
```

### FieldMayBeFinal
Field `invocation` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcResult.java`
#### Snippet
```java
    private Response response;

    private Invocation invocation;

    private volatile boolean hasDecoded;
```

### FieldMayBeFinal
Field `rocketmqCountCodec` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
    private class DubboMessageListenerConcurrently implements MessageListenerConcurrently {

        private RocketMQCountCodec rocketmqCountCodec = new RocketMQCountCodec(FrameworkModel.defaultModel());

        private DefaultMQProducer defaultMQProducer;
```

### FieldMayBeFinal
Field `request` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcInvocation.java`
#### Snippet
```java
    private byte serializationType;
    private InputStream inputStream;
    private Request request;
    private volatile boolean hasDecoded;

```

### FieldMayBeFinal
Field `serializationType` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcInvocation.java`
#### Snippet
```java
    protected final FrameworkModel frameworkModel;
    private Channel channel;
    private byte serializationType;
    private InputStream inputStream;
    private Request request;
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcInvocation.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(DecodeableRpcInvocation.class);
    protected final FrameworkModel frameworkModel;
    private Channel channel;
    private byte serializationType;
    private InputStream inputStream;
```

### FieldMayBeFinal
Field `inputStream` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/codec/DecodeableRpcInvocation.java`
#### Snippet
```java
    private Channel channel;
    private byte serializationType;
    private InputStream inputStream;
    private Request request;
    private volatile boolean hasDecoded;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/RetryLoops.java`
#### Snippet
```java
    private boolean isDone = false;
    private int retriedCount = 0;
    private Logger logger = LoggerFactory.getLogger(RetryLoops.class);

    public static <R> R invokeWithRetry(Callable<R> task, RetryPolicy retryPolicy) throws Exception {
```

### FieldMayBeFinal
Field `buffer` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyBackedChannelBuffer.java`
#### Snippet
```java
public class QuicNettyBackedChannelBuffer implements ChannelBuffer {

    private ByteBuf buffer;

    public QuicNettyBackedChannelBuffer(ByteBuf buffer) {
```

### FieldMayBeFinal
Field `rootPath` may be 'final'
in `dubbo-configcenter-extensions/dubbo-configcenter-etcd/src/main/java/org/apache/dubbo/configcenter/support/etcd/EtcdDynamicConfiguration.java`
#### Snippet
```java
     * The final root path would be: /$NAME_SPACE/config
     */
    private String rootPath;

    /**
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `dubbo-configcenter-extensions/dubbo-configcenter-etcd/src/main/java/org/apache/dubbo/configcenter/support/etcd/EtcdDynamicConfiguration.java`
#### Snippet
```java
        private StreamObserver<WatchRequest> observer;
        protected long watchId;
        private ManagedChannel channel;

        private final String key;
```

### FieldMayBeFinal
Field `listener` may be 'final'
in `dubbo-configcenter-extensions/dubbo-configcenter-etcd/src/main/java/org/apache/dubbo/configcenter/support/etcd/EtcdDynamicConfiguration.java`
#### Snippet
```java
    public class EtcdConfigWatcher implements StreamObserver<WatchResponse> {

        private ConfigurationListener listener;
        protected WatchGrpc.WatchStub watchStub;
        private StreamObserver<WatchRequest> observer;
```

### FieldMayBeFinal
Field `normalizedKey` may be 'final'
in `dubbo-configcenter-extensions/dubbo-configcenter-etcd/src/main/java/org/apache/dubbo/configcenter/support/etcd/EtcdDynamicConfiguration.java`
#### Snippet
```java
        private final String group;

        private String normalizedKey;

        public EtcdConfigWatcher(String key, String group, ConfigurationListener listener) {
```

### FieldMayBeFinal
Field `listener` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
        protected Throwable throwable;
        protected volatile Set<String> urls = new ConcurrentSet<>();
        private ChildListener listener;

        protected ReentrantLock lock = new ReentrantLock(true);
```

### FieldMayBeFinal
Field `notifyExecutor` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
    private ScheduledExecutorService reconnectSchedule;

    private ExecutorService notifyExecutor;

    private int delayPeriod;
```

### FieldMayBeFinal
Field `reconnectSchedule` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java

    private JEtcdClientWrapper clientWrapper;
    private ScheduledExecutorService reconnectSchedule;

    private ExecutorService notifyExecutor;
```

### FieldMayBeFinal
Field `clientWrapper` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
public class JEtcdClient extends AbstractEtcdClient<JEtcdClient.EtcdWatcher> {

    private JEtcdClientWrapper clientWrapper;
    private ScheduledExecutorService reconnectSchedule;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java

    private int delayPeriod;
    private Logger logger = LoggerFactory.getLogger(JEtcdClient.class);

    public JEtcdClient(URL url) {
```

### FieldMayBeFinal
Field `delayPeriod` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClient.java`
#### Snippet
```java
    private ExecutorService notifyExecutor;

    private int delayPeriod;
    private Logger logger = LoggerFactory.getLogger(JEtcdClient.class);

```

### FieldMayBeFinal
Field `jedisPool` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/MonoRedisClient.java`
#### Snippet
```java
    private static final String START_CURSOR = "0";

    private JedisPool jedisPool;

    public MonoRedisClient(URL url) {
```

### FieldMayBeFinal
Field `url` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/support/AbstractRedisClient.java`
#### Snippet
```java

public abstract class AbstractRedisClient implements RedisClient {
    private URL url;

    private JedisPoolConfig config;
```

### FieldMayBeFinal
Field `config` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/support/AbstractRedisClient.java`
#### Snippet
```java
    private URL url;

    private JedisPoolConfig config;

    public AbstractRedisClient(URL url) {
```

### FieldMayBeFinal
Field `sentinelPool` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/SentinelRedisClient.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(SentinelRedisClient.class);

    private JedisSentinelPool sentinelPool;

    public SentinelRedisClient(URL url) {
```

### FieldMayBeFinal
Field `COLON_SPLIT_PATTERN` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/ClusterRedisClient.java`
#### Snippet
```java

    private JedisCluster jedisCluster;
    private Pattern COLON_SPLIT_PATTERN = Pattern.compile("\\s*[:]+\\s*");

    public ClusterRedisClient(URL url) {
```

### FieldMayBeFinal
Field `jedisCluster` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-redis/src/main/java/org/apache/dubbo/remoting/redis/jedis/ClusterRedisClient.java`
#### Snippet
```java
    private static final int DEFAULT_MAX_ATTEMPTS = 5;

    private JedisCluster jedisCluster;
    private Pattern COLON_SPLIT_PATTERN = Pattern.compile("\\s*[:]+\\s*");

```

### FieldMayBeFinal
Field `handleType` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/serializer/java8/Java8TimeSerializer.java`
#### Snippet
```java

    // Type of handle
    private Class<T> handleType;

    private Java8TimeSerializer(Class<T> handleType) {
```

### FieldMayBeFinal
Field `completableFuture` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private long expirePeriod;

    private CompletableFuture<Client> completableFuture;

    private RetryPolicy retryPolicy;
```

### FieldMayBeFinal
Field `failed` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private RetryPolicy retryPolicy;

    private RuntimeException failed;

    private final ScheduledFuture<?> retryFuture;
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private ScheduledFuture future;
    private ScheduledExecutorService reconnectNotify;
    private AtomicReference<ManagedChannel> channel;

    private ConnectionStateListener connectionStateListener;
```

### FieldMayBeFinal
Field `reconnectNotify` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private volatile boolean connectState = false;
    private ScheduledFuture future;
    private ScheduledExecutorService reconnectNotify;
    private AtomicReference<ManagedChannel> channel;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
public class JEtcdClientWrapper {

    private Logger logger = LoggerFactory.getLogger(JEtcdClientWrapper.class);

    private final URL url;
```

### FieldMayBeFinal
Field `retryPolicy` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-etcd3/src/main/java/org/apache/dubbo/remoting/etcd/jetcd/JEtcdClientWrapper.java`
#### Snippet
```java
    private CompletableFuture<Client> completableFuture;

    private RetryPolicy retryPolicy;

    private RuntimeException failed;
```

### FieldMayBeFinal
Field `_deserializerMap` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/Hessian2SerializerFactory.java`
#### Snippet
```java
public class Hessian2SerializerFactory extends SerializerFactory {
    private HashMap _serializerMap = new HashMap();
    private HashMap _deserializerMap = new HashMap();

    public Hessian2SerializerFactory() {
```

### FieldMayBeFinal
Field `_serializerMap` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-native-hession/src/main/java/org/apache/dubbo/serialize/hessian/Hessian2SerializerFactory.java`
#### Snippet
```java

public class Hessian2SerializerFactory extends SerializerFactory {
    private HashMap _serializerMap = new HashMap();
    private HashMap _deserializerMap = new HashMap();

```

### FieldMayBeFinal
Field `originalClassName` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufWrappedException.java`
#### Snippet
```java
    private static final long serialVersionUID = -1792808536714102039L;

    private String originalClassName;
    private String originalMessage;

```

### FieldMayBeFinal
Field `originalMessage` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufWrappedException.java`
#### Snippet
```java

    private String originalClassName;
    private String originalMessage;

    public ProtobufWrappedException(ThrowableProto throwableProto) {
```

### FieldMayBeFinal
Field `globalRegistry` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
        new ConcurrentHashMap<>();

    private static volatile ExtensionRegistryLite globalRegistry =
        ExtensionRegistryLite.getEmptyRegistry();

```

### FieldMayBeFinal
Field `marshallers` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufUtils.java`
#### Snippet
```java
    /* Protobuf */

    private static ConcurrentMap<Class<? extends MessageLite>, MessageMarshaller> marshallers =
        new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `gson` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-gson/src/main/java/org/apache/dubbo/common/serialize/gson/GsonJsonObjectInput.java`
#### Snippet
```java
public class GsonJsonObjectInput implements ObjectInput {
    private final BufferedReader reader;
    private Gson gson;

    public GsonJsonObjectInput(InputStream in) {
```

### FieldMayBeFinal
Field `output` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-fst/src/main/java/org/apache/dubbo/common/serialize/fst/FstObjectOutput.java`
#### Snippet
```java
public class FstObjectOutput implements ObjectOutput {

    private FSTObjectOutput output;

    public FstObjectOutput(OutputStream outputStream) {
```

### FieldMayBeFinal
Field `marshallers` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
 */
public class ProtobufAttachmentUtils {
    private static Map<String, BuiltinMarshaller> marshallers = new HashMap<>();
    private final static String NULL_CLASS_NAME = "null";

```

### FieldMayBeFinal
Field `input` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-fst/src/main/java/org/apache/dubbo/common/serialize/fst/FstObjectInput.java`
#### Snippet
```java
public class FstObjectInput implements ObjectInput {

    private FSTObjectInput input;

    public FstObjectInput(InputStream inputStream) {
```

### FieldMayBeFinal
Field `gson` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java


    private Gson gson = new Gson();

    public SofaRegistryServiceDiscovery(ApplicationModel applicationModel, URL registryURL) {
```

### FieldMayBeFinal
Field `waitAddressTimeout` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java
    private DefaultRegistryClient registryClient;

    private int waitAddressTimeout;

    private RegistryClientConfig registryClientConfig;
```

### FieldMayBeFinal
Field `registryClientConfig` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java
    private int waitAddressTimeout;

    private RegistryClientConfig registryClientConfig;

    private final Map<String, Publisher> publishers = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `registryClient` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistryServiceDiscovery.java`
#### Snippet
```java
    private static final String DEFAULT_GROUP = "dubbo";

    private DefaultRegistryClient registryClient;

    private int waitAddressTimeout;
```

### FieldMayBeFinal
Field `registryClient` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistry.java`
#### Snippet
```java
     * Direct registry client
     */
    private RegistryClient registryClient;
    /**
     * wait address from registry
```

### FieldMayBeFinal
Field `waitAddressTimeout` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-sofa/src/main/java/org/apache/dubbo/registry/sofa/SofaRegistry.java`
#### Snippet
```java
     * wait address from registry
     */
    private int waitAddressTimeout;

    /**
```

### FieldMayBeFinal
Field `consumerRegistryInfoWrapperMap` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-nameservice/src/main/java/org/apache/dubbo/registry/nameservice/NameServiceRegistry.java`
#### Snippet
```java
    private ScheduledExecutorService scheduledExecutorService;

    private Map<URL, RegistryInfoWrapper> consumerRegistryInfoWrapperMap = new ConcurrentHashMap<>();

    private MQAdminExt mqAdminExt;
```

### FieldMayBeFinal
Field `kryoFactory` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/utils/KryoUtils.java`
#### Snippet
```java
 */
public class KryoUtils {
    private static AbstractKryoFactory kryoFactory = new ThreadLocalKryoFactory();

    public static Kryo get() {
```

### FieldMayBeFinal
Field `input` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/KryoObjectInput.java`
#### Snippet
```java

    private Kryo kryo;
    private Input input;

    public KryoObjectInput(InputStream inputStream) {
```

### FieldMayBeFinal
Field `output` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/KryoObjectOutput.java`
#### Snippet
```java
public class KryoObjectOutput implements ObjectOutput, Cleanable {

    private Output output;
    private Kryo kryo;

```

### FieldMayBeFinal
Field `output` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/optimized/KryoObjectOutput2.java`
#### Snippet
```java
public class KryoObjectOutput2 implements ObjectOutput, Cleanable {

    private Output output;
    private Kryo kryo;

```

### FieldMayBeFinal
Field `input` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/optimized/KryoObjectInput2.java`
#### Snippet
```java

    private Kryo kryo;
    private Input input;

    public KryoObjectInput2(InputStream inputStream) {
```

### FieldMayBeFinal
Field `om` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-msgpack/src/main/java/org/apache/dubbo/common/serialize/msgpack/MsgpackObjectOutput.java`
#### Snippet
```java

    private OutputStream out;
    private ObjectMapper om;

    public MsgpackObjectOutput(OutputStream out) {
```

### FieldMayBeFinal
Field `out` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-msgpack/src/main/java/org/apache/dubbo/common/serialize/msgpack/MsgpackObjectOutput.java`
#### Snippet
```java
public class MsgpackObjectOutput implements ObjectOutput {

    private OutputStream out;
    private ObjectMapper om;

```

### FieldMayBeFinal
Field `om` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-msgpack/src/main/java/org/apache/dubbo/common/serialize/msgpack/MsgpackObjectInput.java`
#### Snippet
```java
    private final InputStream in;

    private ObjectMapper om;

    public MsgpackObjectInput(InputStream in) {
```

### FieldMayBeFinal
Field `unknownTypeHandler` may be 'final'
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/CommonTypeHandler.java`
#### Snippet
```java
    private List<TypeHandler> typeHandlers;

    private UnknownTypeHandler unknownTypeHandler;

    private JsonTypeHandler jsonTypeHandler;
```

### FieldMayBeFinal
Field `typeHandlers` may be 'final'
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/CommonTypeHandler.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(CommonTypeHandler.class);

    private List<TypeHandler> typeHandlers;

    private UnknownTypeHandler unknownTypeHandler;
```

### FieldMayBeFinal
Field `jsonTypeHandler` may be 'final'
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/CommonTypeHandler.java`
#### Snippet
```java
    private UnknownTypeHandler unknownTypeHandler;

    private JsonTypeHandler jsonTypeHandler;

    public CommonTypeHandler() {
```

### FieldMayBeFinal
Field `gson` may be 'final'
in `dubbo-mock-extensions/dubbo-mock-admin/src/main/java/org/apache/dubbo/mock/handler/JsonTypeHandler.java`
#### Snippet
```java
public class JsonTypeHandler implements TypeHandler<Object> {

    private Gson gson;

    public JsonTypeHandler() {
```

### FieldMayBeFinal
Field `data` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/Wrapper.java`
#### Snippet
```java
 */
public class Wrapper<T> {
    private T data;

    Wrapper(T data) {
```

### FieldMayBeFinal
Field `dis` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectInput.java`
#### Snippet
```java
public class ProtostuffObjectInput implements ObjectInput {

    private DataInputStream dis;

    public ProtostuffObjectInput(InputStream inputStream) {
```

### FieldMayBeFinal
Field `buffer` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectOutput.java`
#### Snippet
```java
public class ProtostuffObjectOutput implements ObjectOutput {

    private LinkedBuffer buffer = LinkedBuffer.allocate();
    private DataOutputStream dos;

```

### FieldMayBeFinal
Field `dos` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-protostuff/src/main/java/org/apache/dubbo/common/serialize/protostuff/ProtostuffObjectOutput.java`
#### Snippet
```java

    private LinkedBuffer buffer = LinkedBuffer.allocate();
    private DataOutputStream dos;

    public ProtostuffObjectOutput(OutputStream outputStream) {
```

### FieldMayBeFinal
Field `doExpire` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java

    // just for unit test
    private volatile boolean doExpire = true;

    public RedisRegistry(URL url) {
```

### FieldMayBeFinal
Field `redisClient` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
    private final String root;

    private RedisClient redisClient;

    private final ConcurrentMap<String, Notifier> notifiers = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `methodMap` may be 'final'
in `dubbo-cluster-extensions/dubbo-cluster-loadbalance-peakewma/src/main/java/org/apache/dubbo/rpc/cluster/loadbalance/PeakEwmaLoadBalance.java`
#### Snippet
```java
    }

    private ConcurrentMap<RpcStatus, Metric> methodMap = new ConcurrentHashMap<>();

    protected static class Metric {
```

### FieldMayBeFinal
Field `rpcStatus` may be 'final'
in `dubbo-cluster-extensions/dubbo-cluster-loadbalance-peakewma/src/main/java/org/apache/dubbo/rpc/cluster/loadbalance/PeakEwmaLoadBalance.java`
#### Snippet
```java

        // calculate running time And active num
        private RpcStatus rpcStatus;
        private long invokeOffset;
        private long invokeElapsedOffset;
```

### FieldMayBeFinal
Field `apiModulesCache` may be 'final'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsCache.java`
#### Snippet
```java
     * module cache.
     */
    private static Map<String, ModuleCacheItem> apiModulesCache = new ConcurrentHashMap<>(16);
    /**
     * module cache.
```

### FieldMayBeFinal
Field `apiParamsAndRespCache` may be 'final'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsCache.java`
#### Snippet
```java
     * API details cache in module.
     */
    private static Map<String, ApiCacheItem> apiParamsAndRespCache = new ConcurrentHashMap<>(16);
    /**
     * API details cache in module.
```

### FieldMayBeFinal
Field `apiModulesStrCache` may be 'final'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsCache.java`
#### Snippet
```java
     * module cache.
     */
    private static Map<String, String> apiModulesStrCache = new ConcurrentHashMap<>(16);

    /**
```

### FieldMayBeFinal
Field `apiParamsAndRespStrCache` may be 'final'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/core/DubboApiDocsCache.java`
#### Snippet
```java
     * API details cache in module.
     */
    private static Map<String, String> apiParamsAndRespStrCache = new ConcurrentHashMap<>(16);

    private static List<ModuleCacheItem> allApiModuleInfo = null;
```

### FieldMayBeFinal
Field `processor` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-native-thrift/src/main/java/org/apache/dubbo/rpc/protocol/nativethrift/ThriftProtocol.java`
#### Snippet
```java

    private static final Map<String, TServer> SERVER_MAP = new HashMap<>();
    private TMultiplexedProcessor processor = new TMultiplexedProcessor();

    public ThriftProtocol() {
```

### FieldMayBeFinal
Field `typeName` may be 'final'
in `dubbo-api-docs/dubbo-api-docs-core/src/main/java/org/apache/dubbo/apidocs/utils/SimpleTypeImpl.java`
#### Snippet
```java
public class SimpleTypeImpl implements Type {

    private String typeName;

    public SimpleTypeImpl(String typeName) {
```

### FieldMayBeFinal
Field `multicastAddress` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/MulticastGroup.java`
#### Snippet
```java
    private static final String LEAVE = "leave";

    private InetAddress multicastAddress;

    private MulticastSocket multicastSocket;
```

### FieldMayBeFinal
Field `multicastSocket` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/support/MulticastGroup.java`
#### Snippet
```java
    private InetAddress multicastAddress;

    private MulticastSocket multicastSocket;

    public MulticastGroup(URL url) {
```

### FieldMayBeFinal
Field `multicastSocket` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/MulticastExchangeGroup.java`
#### Snippet
```java
    private InetAddress multicastAddress;

    private MulticastSocket multicastSocket;

    public MulticastExchangeGroup(URL url) {
```

### FieldMayBeFinal
Field `multicastAddress` may be 'final'
in `dubbo-remoting-extensions/dubbo-remoting-p2p/src/main/java/org/apache/dubbo/remoting/p2p/exchange/support/MulticastExchangeGroup.java`
#### Snippet
```java
    private static final String LEAVE = "leave";

    private InetAddress multicastAddress;

    private MulticastSocket multicastSocket;
```

### FieldMayBeFinal
Field `cors` may be 'final'
in `dubbo-rpc-extensions/dubbo-rpc-http/src/main/java/org/apache/dubbo/rpc/protocol/http/HttpProtocol.java`
#### Snippet
```java
    private class InternalHandler implements HttpHandler {

        private boolean cors;

        public InternalHandler(boolean cors) {
```

### FieldMayBeFinal
Field `encoderFactory` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-avro/src/main/java/org/apache/dubbo/common/serialize/avro/AvroObjectOutput.java`
#### Snippet
```java

public class AvroObjectOutput implements ObjectOutput {
    private static EncoderFactory encoderFactory = EncoderFactory.get();
    private BinaryEncoder encoder;

```

### FieldMayBeFinal
Field `encoder` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-avro/src/main/java/org/apache/dubbo/common/serialize/avro/AvroObjectOutput.java`
#### Snippet
```java
public class AvroObjectOutput implements ObjectOutput {
    private static EncoderFactory encoderFactory = EncoderFactory.get();
    private BinaryEncoder encoder;

    public AvroObjectOutput(OutputStream out) {
```

### FieldMayBeFinal
Field `decoderFactory` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-avro/src/main/java/org/apache/dubbo/common/serialize/avro/AvroObjectInput.java`
#### Snippet
```java

public class AvroObjectInput implements ObjectInput {
    private static DecoderFactory decoderFactory = DecoderFactory.get();
    private BinaryDecoder decoder;

```

### FieldMayBeFinal
Field `decoder` may be 'final'
in `dubbo-serialization-extensions/dubbo-serialization-avro/src/main/java/org/apache/dubbo/common/serialize/avro/AvroObjectInput.java`
#### Snippet
```java
public class AvroObjectInput implements ObjectInput {
    private static DecoderFactory decoderFactory = DecoderFactory.get();
    private BinaryDecoder decoder;

    public AvroObjectInput(InputStream in) {
```

### FieldMayBeFinal
Field `scheduler` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
        private final Map<String, ScheduledFuture> serviceHeartbeats = new ConcurrentHashMap<>();

        private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        private long checkInterval;
```

### FieldMayBeFinal
Field `instanceZone` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
     * Service instance zone.
     */
    private String instanceZone;

    /**
```

### FieldMayBeFinal
Field `tags` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private String aclToken;

    private List<String> tags;

    private ConsistencyMode consistencyMode;
```

### FieldMayBeFinal
Field `url` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private TtlScheduler ttlScheduler;
    private long checkPassInterval;
    private URL url;

    private String aclToken;
```

### FieldMayBeFinal
Field `notifiers` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private ExecutorService notifierExecutor = newCachedThreadPool(
        new NamedThreadFactory("dubbo-service-discovery-consul-notifier", true));
    private Map<String, ConsulNotifier> notifiers = new ConcurrentHashMap<>();
    private TtlScheduler ttlScheduler;
    private long checkPassInterval;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private List<String> registeringTags = new ArrayList<>();
    private String tag;
    private ConsulClient client;
    private ExecutorService notifierExecutor = newCachedThreadPool(
        new NamedThreadFactory("dubbo-service-discovery-consul-notifier", true));
```

### FieldMayBeFinal
Field `instanceGroup` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
     * Service instance group.
     */
    private String instanceGroup;

    public ConsulServiceDiscovery(ApplicationModel applicationModel, URL registryURL) {
```

### FieldMayBeFinal
Field `checkPassInterval` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private Map<String, ConsulNotifier> notifiers = new ConcurrentHashMap<>();
    private TtlScheduler ttlScheduler;
    private long checkPassInterval;
    private URL url;

```

### FieldMayBeFinal
Field `notifierExecutor` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private String tag;
    private ConsulClient client;
    private ExecutorService notifierExecutor = newCachedThreadPool(
        new NamedThreadFactory("dubbo-service-discovery-consul-notifier", true));
    private Map<String, ConsulNotifier> notifiers = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `defaultZoneMetadataName` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private ConsistencyMode consistencyMode;

    private String defaultZoneMetadataName;

    /**
```

### FieldMayBeFinal
Field `ttlScheduler` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
        new NamedThreadFactory("dubbo-service-discovery-consul-notifier", true));
    private Map<String, ConsulNotifier> notifiers = new ConcurrentHashMap<>();
    private TtlScheduler ttlScheduler;
    private long checkPassInterval;
    private URL url;
```

### FieldMayBeFinal
Field `consistencyMode` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private List<String> tags;

    private ConsistencyMode consistencyMode;

    private String defaultZoneMetadataName;
```

### FieldMayBeFinal
Field `tag` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java

    private List<String> registeringTags = new ArrayList<>();
    private String tag;
    private ConsulClient client;
    private ExecutorService notifierExecutor = newCachedThreadPool(
```

### FieldMayBeFinal
Field `registeringTags` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private static final String REGISTER_TAG = "consul_register_tag";

    private List<String> registeringTags = new ArrayList<>();
    private String tag;
    private ConsulClient client;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
        private long checkInterval;

        private ConsulClient client;

        public TtlScheduler(long checkInterval, ConsulClient client) {
```

### FieldMayBeFinal
Field `checkInterval` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
        private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        private long checkInterval;

        private ConsulClient client;
```

### FieldMayBeFinal
Field `aclToken` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscovery.java`
#### Snippet
```java
    private URL url;

    private String aclToken;

    private List<String> tags;
```

### FieldMayBeFinal
Field `ttlConsulCheckExecutor` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java`
#### Snippet
```java
            new NamedThreadFactory("dubbo-consul-notifier", true));
    private ConcurrentMap<URL, ConsulNotifier> notifiers = new ConcurrentHashMap<>();
    private ScheduledExecutorService ttlConsulCheckExecutor;
    /**
     * The ACL token
```

### FieldMayBeFinal
Field `url` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java`
#### Snippet
```java

    private class ConsulNotifier implements Runnable {
        private URL url;
        private long consulIndex;
        private boolean running;
```

### FieldMayBeFinal
Field `checkPassInterval` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java`
#### Snippet
```java

    private ConsulClient client;
    private long checkPassInterval;
    private ExecutorService notifierExecutor = newCachedThreadPool(
            new NamedThreadFactory("dubbo-consul-notifier", true));
```

### FieldMayBeFinal
Field `client` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ConsulRegistry.class);

    private ConsulClient client;
    private long checkPassInterval;
    private ExecutorService notifierExecutor = newCachedThreadPool(
```

### FieldMayBeFinal
Field `notifierExecutor` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java`
#### Snippet
```java
    private ConsulClient client;
    private long checkPassInterval;
    private ExecutorService notifierExecutor = newCachedThreadPool(
            new NamedThreadFactory("dubbo-consul-notifier", true));
    private ConcurrentMap<URL, ConsulNotifier> notifiers = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `token` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java`
#### Snippet
```java
     * The ACL token
     */
    private String token;

    private static final int CONSUL_CORE_THREAD_SIZE = 1;
```

### FieldMayBeFinal
Field `notifiers` may be 'final'
in `dubbo-registry-extensions/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java`
#### Snippet
```java
    private ExecutorService notifierExecutor = newCachedThreadPool(
            new NamedThreadFactory("dubbo-consul-notifier", true));
    private ConcurrentMap<URL, ConsulNotifier> notifiers = new ConcurrentHashMap<>();
    private ScheduledExecutorService ttlConsulCheckExecutor;
    /**
```

### FieldMayBeFinal
Field `client` may be 'final'
in `dubbo-metadata-report-extensions/dubbo-metadata-report-consul/src/main/java/org/apache/dubbo/metadata/store/consul/ConsulMetadataReport.java`
#### Snippet
```java
public class ConsulMetadataReport extends AbstractMetadataReport {

    private ConsulClient client;

    public ConsulMetadataReport(URL url) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `rocketMQProtocolServer` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
                server = serverMap.get(key);

                RocketMQProtocolServer rocketMQProtocolServer = (RocketMQProtocolServer) server;
                return rocketMQProtocolServer;
            }
```

### UnnecessaryLocalVariable
Local variable `rocketMQInvoker` is redundant
in `dubbo-rpc-extensions/dubbo-rpc-rocketmq/src/main/java/org/apache/dubbo/rpc/rocketmq/RocketMQProtocol.java`
#### Snippet
```java
        try {
            RocketMQProtocolServer rocketMQProtocolServer = this.openServer(url, CommonConstants.CONSUMER);
            RocketMQInvoker<T> rocketMQInvoker = new RocketMQInvoker<>(type, url, rocketMQProtocolServer);
            return rocketMQInvoker;
        } catch (Exception e) {
```

### UnnecessaryLocalVariable
Local variable `res` is redundant
in `dubbo-remoting-extensions/dubbo-remoting-quic/src/main/java/org/apache/dubbo/remoting/transport/quic/QuicNettyChannel.java`
#### Snippet
```java
    public InetSocketAddress getLocalAddress() {
        int port = this.getUrl().getPort();
        InetSocketAddress res = new InetSocketAddress(port);
        return res;
    }
```

### UnnecessaryLocalVariable
Local variable `tasks` is redundant
in `dubbo-cluster-extensions/dubbo-cluster-broadcast-1/src/main/java/org/apache/dubbo/rpc/cluster/support/BroadcastCluster1Invoker.java`
#### Snippet
```java

    private List<Callable<BroadcastResult>> getCallables(List<Invoker<T>> invokers, Invocation invocation) {
        List<Callable<BroadcastResult>> tasks = invokers.stream().map(it -> (Callable<BroadcastResult>) () -> {
            BroadcastResult br = new BroadcastResult(it.getUrl().getIp(), it.getUrl().getPort());
            Result result = null;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
                                logger.warn("Failed to subscribe service from redis registry. registry: " + getUrl().getAddress() + ", cause: " + t.getMessage(), t);
                                // If you only have a single redis, you need to take a rest to avoid overtaking a lot of CPU resources
                                sleep(reconnectPeriod);
                            }
                        } catch (Throwable t) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dubbo-registry-extensions/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java`
#### Snippet
```java
                        } catch (Throwable t) {
                            logger.error(t.getMessage(), t);
                            sleep(reconnectPeriod);
                        }
                    }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `dubbo-serialization-extensions/dubbo-serialization-kryo/src/main/java/org/apache/dubbo/common/serialize/kryo/utils/AbstractKryoFactory.java`
#### Snippet
```java

        kryo.addDefaultSerializer(Throwable.class, new JavaSerializer());
        kryo.register(Arrays.asList("").getClass(), new ArraysAsListSerializer());
        kryo.register(GregorianCalendar.class, new GregorianCalendarSerializer());
        kryo.register(InvocationHandler.class, new JdkProxySerializer());
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `dubbo-serialization-extensions/dubbo-serialization-protobuf/src/main/java/org/apache/dubbo/common/serialize/protobuf/support/ProtobufAttachmentUtils.java`
#### Snippet
```java
        Map<String, String> stringAttachments = map.getAttachmentsMap();
        if (stringAttachments != null) {
            stringAttachments.forEach((k, v) -> attachments.put(k, v));
        }

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'withHostAndPort(com.google.common.net.HostAndPort)' is unstable because its signature references unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `dubbo-configcenter-extensions/dubbo-configcenter-consul/src/main/java/org/apache/dubbo/configcenter/consul/ConsulDynamicConfiguration.java`
#### Snippet
```java
        int port = ConsulConstants.INVALID_PORT != url.getPort() ? url.getPort() : ConsulConstants.DEFAULT_PORT;
        Consul.Builder builder = Consul.builder()
                .withHostAndPort(HostAndPort.fromParts(host, port));
        String token = url.getParameter(ConsulConstants.TOKEN, (String) null);
        if (StringUtils.isNotEmpty(token)) {
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `dubbo-configcenter-extensions/dubbo-configcenter-consul/src/main/java/org/apache/dubbo/configcenter/consul/ConsulDynamicConfiguration.java`
#### Snippet
```java
        int port = ConsulConstants.INVALID_PORT != url.getPort() ? url.getPort() : ConsulConstants.DEFAULT_PORT;
        Consul.Builder builder = Consul.builder()
                .withHostAndPort(HostAndPort.fromParts(host, port));
        String token = url.getParameter(ConsulConstants.TOKEN, (String) null);
        if (StringUtils.isNotEmpty(token)) {
```

### UnstableApiUsage
'fromParts(java.lang.String, int)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `dubbo-configcenter-extensions/dubbo-configcenter-consul/src/main/java/org/apache/dubbo/configcenter/consul/ConsulDynamicConfiguration.java`
#### Snippet
```java
        int port = ConsulConstants.INVALID_PORT != url.getPort() ? url.getPort() : ConsulConstants.DEFAULT_PORT;
        Consul.Builder builder = Consul.builder()
                .withHostAndPort(HostAndPort.fromParts(host, port));
        String token = url.getParameter(ConsulConstants.TOKEN, (String) null);
        if (StringUtils.isNotEmpty(token)) {
```

