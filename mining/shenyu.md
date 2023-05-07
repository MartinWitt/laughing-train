# shenyu 
 
# Bad smells
I found 1124 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringXmlModelInspection | 284 | false |
| JavadocReference | 262 | false |
| SpringBootApplicationYaml | 218 | false |
| DuplicatedCode | 61 | false |
| UnparsedCustomBeanInspection | 35 | false |
| ConstantValue | 35 | false |
| NullableProblems | 27 | false |
| AutoCloseableResource | 25 | false |
| SpringBootApplicationProperties | 24 | false |
| DataFlowIssue | 23 | false |
| UNCHECKED_WARNING | 19 | false |
| JavadocLinkAsPlainText | 12 | false |
| WebProperties | 12 | false |
| FieldCanBeLocal | 11 | false |
| FieldMayBeFinal | 7 | false |
| Deprecation | 6 | false |
| RedundantLengthCheck | 6 | false |
| EqualsBetweenInconvertibleTypes | 4 | false |
| ExcessiveLambdaUsage | 4 | false |
| UnusedAssignment | 4 | false |
| InnerClassMayBeStatic | 3 | true |
| RedundantCast | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| UnstableApiUsage | 3 | false |
| UnnecessaryReturn | 2 | true |
| RedundantMethodOverride | 2 | false |
| UnnecessarySemicolon | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| MismatchedJavadocCode | 2 | false |
| RedundantCompareCall | 2 | false |
| ReactorZipWithMonoVoid | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| SillyAssignment | 1 | false |
| ThrowablePrintedToSystemOut | 1 | false |
| InfiniteLoopStatement | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
| WriteOnlyObject | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| RequiredBeanTypeInspection | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| ThreadRun | 1 | false |
| DanglingJavadoc | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| TrivialIf | 1 | false |
| JavadocDeclaration | 1 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
## RuleId[id=ReactorZipWithMonoVoid]
### ReactorZipWithMonoVoid
Calling zip method with Mono parameter will not have any effect
in `shenyu-plugin/shenyu-plugin-websocket/src/main/java/org/apache/shenyu/plugin/websocket/WebSocketPlugin.java`
#### Snippet
```java
                    Mono<Void> serverSessionSend = session.send(
                            webSocketSession.receive().doOnNext(WebSocketMessage::retain));
                    return Mono.zip(sessionSend, serverSessionSend).then();
                }
                
```

## RuleId[id=UnparsedCustomBeanInspection]
### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://sofastack.io/schema/sofaboot', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sofa/shenyu-examples-sofa-service/src/main/resources/invoke-server-example.xml`
#### Snippet
```java
       default-autowire="byName">

    <sofa:service ref="sofaSingleParamService" interface="org.apache.shenyu.examples.sofa.api.service.SofaSingleParamService">
        <sofa:binding.bolt/>
    </sofa:service>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://sofastack.io/schema/sofaboot', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sofa/shenyu-examples-sofa-service/src/main/resources/invoke-server-example.xml`
#### Snippet
```java
    </sofa:service>

    <sofa:service ref="sofaMultiParamService" interface="org.apache.shenyu.examples.sofa.api.service.SofaMultiParamService">
        <sofa:binding.bolt/>
    </sofa:service>
```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
       https://code.alibabatech.com/schema/dubbo/dubbo.xsd">

    <dubbo:application name="test-dubbo-service"/>
    <dubbo:registry address="${dubbo.registry.address}"/>
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:application name="test-dubbo-service"/>
    <dubbo:registry address="${dubbo.registry.address}"/>
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'protocol' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:application name="test-dubbo-service"/>
    <dubbo:registry address="${dubbo.registry.address}"/>
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
       https://code.alibabatech.com/schema/dubbo/dubbo.xsd">

    <dubbo:application name="test-dubbo-service"/>

    <dubbo:registry address="${dubbo.zk}"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:application name="test-dubbo-service"/>

    <dubbo:registry address="${dubbo.zk}"/>

    <dubbo:protocol name="dubbo" port="20888"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'protocol' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:registry address="${dubbo.zk}"/>

    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
</beans>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
       https://code.alibabatech.com/schema/dubbo/dubbo.xsd">

    <dubbo:application name="test-dubbo-service"/>
    <dubbo:registry address="${dubbo.registry.address}"/>
    <dubbo:protocol name="dubbo" port="20888"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:application name="test-dubbo-service"/>
    <dubbo:registry address="${dubbo.registry.address}"/>
    <dubbo:protocol name="dubbo" port="20888"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'protocol' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:application name="test-dubbo-service"/>
    <dubbo:registry address="${dubbo.registry.address}"/>
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
       https://code.alibabatech.com/schema/dubbo/dubbo.xsd">

    <dubbo:application name="test-dubbo-service"/>

    <dubbo:registry address="${dubbo.zk}"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:application name="test-dubbo-service"/>

    <dubbo:registry address="${dubbo.zk}"/>

    <dubbo:protocol name="dubbo" port="20888"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'protocol' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:registry address="${dubbo.zk}"/>

    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
</beans>

```

### UnparsedCustomBeanInspection
Unsupported tag 'application' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
       https://code.alibabatech.com/schema/dubbo/dubbo.xsd">

    <dubbo:application name="test-dubbo-service"/>
    <dubbo:registry address="${dubbo.registry.address}"/>
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'registry' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:application name="test-dubbo-service"/>
    <dubbo:registry address="${dubbo.registry.address}"/>
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'protocol' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:application name="test-dubbo-service"/>
    <dubbo:registry address="${dubbo.registry.address}"/>
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### UnparsedCustomBeanInspection
Unsupported tag 'service' for namespace 'http://code.alibabatech.com/schema/dubbo', please file issue (Help\|Submit a Bug Report...)
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.dialect'
in `shenyu-admin/src/main/resources/application-mysql.yml`
#### Snippet
```java
shenyu:
  database:
    dialect: mysql
    init_enable: true

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.init_enable'
in `shenyu-admin/src/main/resources/application-mysql.yml`
#### Snippet
```java
  database:
    dialect: mysql
    init_enable: true

spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.url'
in `shenyu-admin/src/main/resources/application-mysql.yml`
#### Snippet
```java
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/shenyu?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=convertToNull
    username: root
    password: xyzj1a2y3
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.username'
in `shenyu-admin/src/main/resources/application-mysql.yml`
#### Snippet
```java
  datasource:
    url: jdbc:mysql://localhost:3306/shenyu?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=convertToNull
    username: root
    password: xyzj1a2y3
    driver-class-name: com.mysql.cj.jdbc.Driver
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.password'
in `shenyu-admin/src/main/resources/application-mysql.yml`
#### Snippet
```java
    url: jdbc:mysql://localhost:3306/shenyu?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=convertToNull
    username: root
    password: xyzj1a2y3
    driver-class-name: com.mysql.cj.jdbc.Driver
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.driver-class-name'
in `shenyu-admin/src/main/resources/application-mysql.yml`
#### Snippet
```java
    username: root
    password: xyzj1a2y3
    driver-class-name: com.mysql.cj.jdbc.Driver
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.dialect'
in `shenyu-admin/src/main/resources/application-oracle.yml`
#### Snippet
```java
shenyu:
  database:
    dialect: oracle
    init_enable: true

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.init_enable'
in `shenyu-admin/src/main/resources/application-oracle.yml`
#### Snippet
```java
  database:
    dialect: oracle
    init_enable: true

spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.url'
in `shenyu-admin/src/main/resources/application-oracle.yml`
#### Snippet
```java
spring:
  datasource:
    url: jdbc:oracle:thin:@localhost:1521/shenyu
    username: root
    password: 123456
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.username'
in `shenyu-admin/src/main/resources/application-oracle.yml`
#### Snippet
```java
  datasource:
    url: jdbc:oracle:thin:@localhost:1521/shenyu
    username: root
    password: 123456
    driver-class-name: oracle.jdbc.OracleDriver
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.password'
in `shenyu-admin/src/main/resources/application-oracle.yml`
#### Snippet
```java
    url: jdbc:oracle:thin:@localhost:1521/shenyu
    username: root
    password: 123456
    driver-class-name: oracle.jdbc.OracleDriver

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.driver-class-name'
in `shenyu-admin/src/main/resources/application-oracle.yml`
#### Snippet
```java
    username: root
    password: 123456
    driver-class-name: oracle.jdbc.OracleDriver

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.dialect'
in `shenyu-admin/src/main/resources/application-h2.yml`
#### Snippet
```java
shenyu:
  database:
    dialect: h2
    init_script: "sql-script/h2/schema.sql"
    init_enable: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.init_script'
in `shenyu-admin/src/main/resources/application-h2.yml`
#### Snippet
```java
  database:
    dialect: h2
    init_script: "sql-script/h2/schema.sql"
    init_enable: true

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.init_enable'
in `shenyu-admin/src/main/resources/application-h2.yml`
#### Snippet
```java
    dialect: h2
    init_script: "sql-script/h2/schema.sql"
    init_enable: true

spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.url'
in `shenyu-admin/src/main/resources/application-h2.yml`
#### Snippet
```java
spring:
  datasource:
    url: jdbc:h2:mem:${HOME:${HOMEDRIVE}${HOMEPATH}}/shenyu;DB_CLOSE_DELAY=-1;MODE=MySQL;
    username: sa
    password: sa
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.username'
in `shenyu-admin/src/main/resources/application-h2.yml`
#### Snippet
```java
  datasource:
    url: jdbc:h2:mem:${HOME:${HOMEDRIVE}${HOMEPATH}}/shenyu;DB_CLOSE_DELAY=-1;MODE=MySQL;
    username: sa
    password: sa
    driver-class-name: org.h2.Driver
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.password'
in `shenyu-admin/src/main/resources/application-h2.yml`
#### Snippet
```java
    url: jdbc:h2:mem:${HOME:${HOMEDRIVE}${HOMEPATH}}/shenyu;DB_CLOSE_DELAY=-1;MODE=MySQL;
    username: sa
    password: sa
    driver-class-name: org.h2.Driver

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.driver-class-name'
in `shenyu-admin/src/main/resources/application-h2.yml`
#### Snippet
```java
    username: sa
    password: sa
    driver-class-name: org.h2.Driver


```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.dialect'
in `shenyu-admin/src/main/resources/application-pg.yml`
#### Snippet
```java
shenyu:
    database:
      dialect: postgresql
      init_enable: true

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.init_enable'
in `shenyu-admin/src/main/resources/application-pg.yml`
#### Snippet
```java
    database:
      dialect: postgresql
      init_enable: true

spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.url'
in `shenyu-admin/src/main/resources/application-pg.yml`
#### Snippet
```java
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/shenyu
    username: postgres
    password: 123456
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.username'
in `shenyu-admin/src/main/resources/application-pg.yml`
#### Snippet
```java
  datasource:
    url: jdbc:postgresql://localhost:5432/shenyu
    username: postgres
    password: 123456
    driver-class-name: org.postgresql.Driver
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.password'
in `shenyu-admin/src/main/resources/application-pg.yml`
#### Snippet
```java
    url: jdbc:postgresql://localhost:5432/shenyu
    username: postgres
    password: 123456
    driver-class-name: org.postgresql.Driver

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.driver-class-name'
in `shenyu-admin/src/main/resources/application-pg.yml`
#### Snippet
```java
    username: postgres
    password: 123456
    driver-class-name: org.postgresql.Driver

mybatis:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'mybatis.type-handlers-package'
in `shenyu-admin/src/main/resources/application-pg.yml`
#### Snippet
```java

mybatis:
  type-handlers-package: org.apache.shenyu.admin.mybatis.pg.handler

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'server.port'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java

server:
  port: 9095
  address: 0.0.0.0

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'server.address'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
server:
  port: 9095
  address: 0.0.0.0

spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.profiles.active'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
spring:
  profiles:
    active: h2
  thymeleaf:
    cache: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.cache'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    active: h2
  thymeleaf:
    cache: true
    encoding: utf-8
    enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.encoding'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
  thymeleaf:
    cache: true
    encoding: utf-8
    enabled: true
    prefix: classpath:/static/
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.enabled'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    cache: true
    encoding: utf-8
    enabled: true
    prefix: classpath:/static/
    suffix: .html
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.prefix'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    encoding: utf-8
    enabled: true
    prefix: classpath:/static/
    suffix: .html
  mvc:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.suffix'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    enabled: true
    prefix: classpath:/static/
    suffix: .html
  mvc:
    pathmatch:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.mvc.pathmatch.matching-strategy'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
  mvc:
    pathmatch:
      matching-strategy: ant_path_matcher
  jackson:
    time-zone: GMT+8 # GMT , Asia/Shanghai
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.jackson.time-zone'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
      matching-strategy: ant_path_matcher
  jackson:
    time-zone: GMT+8 # GMT , Asia/Shanghai

management:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'management.endpoints.web.exposure.include'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    web:
      exposure:
        include:
          - 'health'
          - 'prometheus'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'management.endpoints.enabled-by-default'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
          - 'health'
          - 'prometheus'
    enabled-by-default: true

mybatis:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'mybatis.config-location'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java

mybatis:
  config-location: classpath:/mybatis/mybatis-config.xml
  mapper-locations: classpath:/mappers/*.xml

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'mybatis.mapper-locations'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
mybatis:
  config-location: classpath:/mybatis/mybatis-config.xml
  mapper-locations: classpath:/mappers/*.xml

shenyu:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.registerType'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
shenyu:
  register:
    registerType: http #http #zookeeper #etcd #nacos #consul
    serverLists: #localhost:2181 #http://localhost:2379 #localhost:8848
    props:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.serverLists'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
  register:
    registerType: http #http #zookeeper #etcd #nacos #consul
    serverLists: #localhost:2181 #http://localhost:2379 #localhost:8848
    props:
      sessionTimeout: 5000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.sessionTimeout'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    serverLists: #localhost:2181 #http://localhost:2379 #localhost:8848
    props:
      sessionTimeout: 5000
      connectionTimeout: 2000
      checked: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.connectionTimeout'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    props:
      sessionTimeout: 5000
      connectionTimeout: 2000
      checked: true
      zombieCheckThreads: 10
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.checked'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
      sessionTimeout: 5000
      connectionTimeout: 2000
      checked: true
      zombieCheckThreads: 10
      zombieCheckTimes: 5
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.zombieCheckThreads'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
      connectionTimeout: 2000
      checked: true
      zombieCheckThreads: 10
      zombieCheckTimes: 5
      scheduledTime: 10
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.zombieCheckTimes'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
      checked: true
      zombieCheckThreads: 10
      zombieCheckTimes: 5
      scheduledTime: 10
      nacosNameSpace: ShenyuRegisterCenter
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.scheduledTime'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
      zombieCheckThreads: 10
      zombieCheckTimes: 5
      scheduledTime: 10
      nacosNameSpace: ShenyuRegisterCenter
  sync:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.nacosNameSpace'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
      zombieCheckTimes: 5
      scheduledTime: 10
      nacosNameSpace: ShenyuRegisterCenter
  sync:
    websocket:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.sync.websocket.enabled'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
  sync:
    websocket:
      enabled: true
      messageMaxSize: 10240
      allowOrigins: ws://localhost:9095;ws://localhost:9195;
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.sync.websocket.messageMaxSize'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    websocket:
      enabled: true
      messageMaxSize: 10240
      allowOrigins: ws://localhost:9095;ws://localhost:9195;
#    apollo:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.sync.websocket.allowOrigins'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
      enabled: true
      messageMaxSize: 10240
      allowOrigins: ws://localhost:9095;ws://localhost:9195;
#    apollo:
#      meta: http://localhost:8080
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.enabled'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
#      url: http://localhost:8500
  ldap:
    enabled: false
    url: ldap://xxxx:xxx
    bind-dn: cn=xxx,dc=xxx,dc=xxx
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.url'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
  ldap:
    enabled: false
    url: ldap://xxxx:xxx
    bind-dn: cn=xxx,dc=xxx,dc=xxx
    password: xxxx
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.bind-dn'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    enabled: false
    url: ldap://xxxx:xxx
    bind-dn: cn=xxx,dc=xxx,dc=xxx
    password: xxxx
    base-dn: ou=xxx,dc=xxx,dc=xxx
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.password'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    url: ldap://xxxx:xxx
    bind-dn: cn=xxx,dc=xxx,dc=xxx
    password: xxxx
    base-dn: ou=xxx,dc=xxx,dc=xxx
    object-class: person
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.base-dn'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    bind-dn: cn=xxx,dc=xxx,dc=xxx
    password: xxxx
    base-dn: ou=xxx,dc=xxx,dc=xxx
    object-class: person
    login-field: cn
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.object-class'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    password: xxxx
    base-dn: ou=xxx,dc=xxx,dc=xxx
    object-class: person
    login-field: cn
  jwt:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.login-field'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    base-dn: ou=xxx,dc=xxx,dc=xxx
    object-class: person
    login-field: cn
  jwt:
    expired-seconds: 86400000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.jwt.expired-seconds'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    login-field: cn
  jwt:
    expired-seconds: 86400000
  shiro:
    white-list:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.shiro.white-list'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    expired-seconds: 86400000
  shiro:
    white-list:
      - /
      - /favicon.*
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.swagger.enable'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
      - /csrf
  swagger:
    enable: true
  dashboard:
    core:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.dashboard.core.onlySuperAdminPermission'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
  dashboard:
    core:
      onlySuperAdminPermission:
        - system:manager:add
        - system:manager:edit
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.level.root'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
        - system:resource:deleteMenu
  level:
    root: info
    org.springframework.boot: info
    org.apache.ibatis: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.level.org.springframework.boot'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
  level:
    root: info
    org.springframework.boot: info
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.level.org.apache.ibatis'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    root: info
    org.springframework.boot: info
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.level.org.apache.shenyu.bonuspoint'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    org.springframework.boot: info
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
    org.apache.shenyu: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.level.org.apache.shenyu.lottery'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
    org.apache.shenyu: info

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.level.org.apache.shenyu'
in `shenyu-admin/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
    org.apache.shenyu: info

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'server.port'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java

server:
  port: 9195
  address: 0.0.0.0

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'server.address'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
server:
  port: 9195
  address: 0.0.0.0

spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.main.allow-bean-definition-overriding'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
spring:
  main:
    allow-bean-definition-overriding: true
  application:
    name: shenyu-bootstrap
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.application.name'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    allow-bean-definition-overriding: true
  application:
    name: shenyu-bootstrap
  codec:
    max-in-memory-size: 2MB
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.codec.max-in-memory-size'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    name: shenyu-bootstrap
  codec:
    max-in-memory-size: 2MB
  cloud:
    discovery:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.cloud.discovery.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  cloud:
    discovery:
      enabled: false
    nacos:
      discovery:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'eureka.client.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
eureka:
  client:
    enabled: false
    serviceUrl:
      defaultZone: http://localhost:8761/eureka/
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'eureka.client.serviceUrl.defaultZone'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    enabled: false
    serviceUrl:
      defaultZone: http://localhost:8761/eureka/
  instance:
    prefer-ip-address: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'eureka.instance.prefer-ip-address'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      defaultZone: http://localhost:8761/eureka/
  instance:
    prefer-ip-address: true

#  security:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'management.health.defaults.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  health:
    defaults:
      enabled: false

shenyu:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.matchCache.selector.selectorEnabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  matchCache:
    selector:
      selectorEnabled: false
      initialCapacity: 10000 # initial capacity in cache
      maximumSize: 10000 # max size in cache
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.matchCache.selector.initialCapacity'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    selector:
      selectorEnabled: false
      initialCapacity: 10000 # initial capacity in cache
      maximumSize: 10000 # max size in cache
    rule:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.matchCache.selector.maximumSize'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      selectorEnabled: false
      initialCapacity: 10000 # initial capacity in cache
      maximumSize: 10000 # max size in cache
    rule:
      initialCapacity: 10000 # initial capacity in cache
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.matchCache.rule.initialCapacity'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      maximumSize: 10000 # max size in cache
    rule:
      initialCapacity: 10000 # initial capacity in cache
      maximumSize: 65536 # max size in cache
  trie:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.matchCache.rule.maximumSize'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    rule:
      initialCapacity: 10000 # initial capacity in cache
      maximumSize: 65536 # max size in cache
  trie:
    enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.trie.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      maximumSize: 65536 # max size in cache
  trie:
    enabled: true
    childrenSize: 10000
    pathVariableSize: 1000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.trie.childrenSize'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  trie:
    enabled: true
    childrenSize: 10000
    pathVariableSize: 1000
    pathRuleCacheSize: 1000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.trie.pathVariableSize'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    enabled: true
    childrenSize: 10000
    pathVariableSize: 1000
    pathRuleCacheSize: 1000
    matchMode: antPathMatch
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.trie.pathRuleCacheSize'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    childrenSize: 10000
    pathVariableSize: 1000
    pathRuleCacheSize: 1000
    matchMode: antPathMatch
  netty:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.trie.matchMode'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    pathVariableSize: 1000
    pathRuleCacheSize: 1000
    matchMode: antPathMatch
  netty:
    http:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.webServerFactoryEnabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    http:
      # set to false, user can custom the netty tcp server config.
      webServerFactoryEnabled: true
      selectCount: 1
      workerCount: 8
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.selectCount'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      # set to false, user can custom the netty tcp server config.
      webServerFactoryEnabled: true
      selectCount: 1
      workerCount: 8
      accessLog: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.workerCount'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      webServerFactoryEnabled: true
      selectCount: 1
      workerCount: 8
      accessLog: false
      serverSocketChannel:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.accessLog'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      selectCount: 1
      workerCount: 8
      accessLog: false
      serverSocketChannel:
        soRcvBuf: 87380
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.soRcvBuf'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      accessLog: false
      serverSocketChannel:
        soRcvBuf: 87380
        soBackLog: 128
        soReuseAddr: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.soBackLog'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      serverSocketChannel:
        soRcvBuf: 87380
        soBackLog: 128
        soReuseAddr: false
        connectTimeoutMillis: 10000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.soReuseAddr'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        soRcvBuf: 87380
        soBackLog: 128
        soReuseAddr: false
        connectTimeoutMillis: 10000
        writeBufferHighWaterMark: 65536
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.connectTimeoutMillis'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        soBackLog: 128
        soReuseAddr: false
        connectTimeoutMillis: 10000
        writeBufferHighWaterMark: 65536
        writeBufferLowWaterMark: 32768
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.writeBufferHighWaterMark'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        soReuseAddr: false
        connectTimeoutMillis: 10000
        writeBufferHighWaterMark: 65536
        writeBufferLowWaterMark: 32768
        writeSpinCount: 16
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.writeBufferLowWaterMark'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        connectTimeoutMillis: 10000
        writeBufferHighWaterMark: 65536
        writeBufferLowWaterMark: 32768
        writeSpinCount: 16
        autoRead: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.writeSpinCount'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        writeBufferHighWaterMark: 65536
        writeBufferLowWaterMark: 32768
        writeSpinCount: 16
        autoRead: false
        allocType: "pooled"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.autoRead'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        writeBufferLowWaterMark: 32768
        writeSpinCount: 16
        autoRead: false
        allocType: "pooled"
        messageSizeEstimator: 8
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.allocType'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        writeSpinCount: 16
        autoRead: false
        allocType: "pooled"
        messageSizeEstimator: 8
        singleEventExecutorPerGroup: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.messageSizeEstimator'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        autoRead: false
        allocType: "pooled"
        messageSizeEstimator: 8
        singleEventExecutorPerGroup: true
      socketChannel:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.serverSocketChannel.singleEventExecutorPerGroup'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        allocType: "pooled"
        messageSizeEstimator: 8
        singleEventExecutorPerGroup: true
      socketChannel:
        soKeepAlive: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.soKeepAlive'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        singleEventExecutorPerGroup: true
      socketChannel:
        soKeepAlive: false
        soReuseAddr: false
        soLinger: -1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.soReuseAddr'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      socketChannel:
        soKeepAlive: false
        soReuseAddr: false
        soLinger: -1
        tcpNoDelay: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.soLinger'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        soKeepAlive: false
        soReuseAddr: false
        soLinger: -1
        tcpNoDelay: true
        soRcvBuf: 87380
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.tcpNoDelay'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        soReuseAddr: false
        soLinger: -1
        tcpNoDelay: true
        soRcvBuf: 87380
        soSndBuf: 16384
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.soRcvBuf'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        soLinger: -1
        tcpNoDelay: true
        soRcvBuf: 87380
        soSndBuf: 16384
        ipTos: 0
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.soSndBuf'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        tcpNoDelay: true
        soRcvBuf: 87380
        soSndBuf: 16384
        ipTos: 0
        allowHalfClosure: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.ipTos'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        soRcvBuf: 87380
        soSndBuf: 16384
        ipTos: 0
        allowHalfClosure: false
        connectTimeoutMillis: 10000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.allowHalfClosure'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        soSndBuf: 16384
        ipTos: 0
        allowHalfClosure: false
        connectTimeoutMillis: 10000
        writeBufferHighWaterMark: 65536
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.connectTimeoutMillis'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        ipTos: 0
        allowHalfClosure: false
        connectTimeoutMillis: 10000
        writeBufferHighWaterMark: 65536
        writeBufferLowWaterMark: 32768
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.writeBufferHighWaterMark'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        allowHalfClosure: false
        connectTimeoutMillis: 10000
        writeBufferHighWaterMark: 65536
        writeBufferLowWaterMark: 32768
        writeSpinCount: 16
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.writeBufferLowWaterMark'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        connectTimeoutMillis: 10000
        writeBufferHighWaterMark: 65536
        writeBufferLowWaterMark: 32768
        writeSpinCount: 16
        autoRead: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.writeSpinCount'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        writeBufferHighWaterMark: 65536
        writeBufferLowWaterMark: 32768
        writeSpinCount: 16
        autoRead: false
        allocType: "pooled"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.autoRead'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        writeBufferLowWaterMark: 32768
        writeSpinCount: 16
        autoRead: false
        allocType: "pooled"
        messageSizeEstimator: 8
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.allocType'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        writeSpinCount: 16
        autoRead: false
        allocType: "pooled"
        messageSizeEstimator: 8
        singleEventExecutorPerGroup: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.messageSizeEstimator'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        autoRead: false
        allocType: "pooled"
        messageSizeEstimator: 8
        singleEventExecutorPerGroup: true
#  httpclient:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.netty.http.socketChannel.singleEventExecutorPerGroup'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
        allocType: "pooled"
        messageSizeEstimator: 8
        singleEventExecutorPerGroup: true
#  httpclient:
#    strategy: webClient
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
#      daemon: true
  register:
    enabled: false
    registerType: zookeeper #etcd #consul
    serverLists: localhost:2181 #http://localhost:2379 #localhost:8848
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.registerType'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  register:
    enabled: false
    registerType: zookeeper #etcd #consul
    serverLists: localhost:2181 #http://localhost:2379 #localhost:8848
    props:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.serverLists'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    enabled: false
    registerType: zookeeper #etcd #consul
    serverLists: localhost:2181 #http://localhost:2379 #localhost:8848
    props:
  cross:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    registerType: zookeeper #etcd #consul
    serverLists: localhost:2181 #http://localhost:2379 #localhost:8848
    props:
  cross:
    enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.cross.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    props:
  cross:
    enabled: true
    allowedHeaders:
    allowedMethods: "*"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.cross.allowedHeaders'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  cross:
    enabled: true
    allowedHeaders:
    allowedMethods: "*"
    allowedAnyOrigin: true # the same of Access-Control-Allow-Origin: "*"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.cross.allowedMethods'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    enabled: true
    allowedHeaders:
    allowedMethods: "*"
    allowedAnyOrigin: true # the same of Access-Control-Allow-Origin: "*"
#    allowedOrigin:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.cross.allowedAnyOrigin'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    allowedHeaders:
    allowedMethods: "*"
    allowedAnyOrigin: true # the same of Access-Control-Allow-Origin: "*"
#    allowedOrigin:
      # format : schema://prefix spacer domain
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.cross.allowedExpose'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
#        - http://e.apache.org
#      originRegex: ^http(|s)://(.*\.|)abc.com$
    allowedExpose: ""
    maxAge: "18000"
    allowCredentials: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.cross.maxAge'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
#      originRegex: ^http(|s)://(.*\.|)abc.com$
    allowedExpose: ""
    maxAge: "18000"
    allowCredentials: true

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.cross.allowCredentials'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    allowedExpose: ""
    maxAge: "18000"
    allowCredentials: true

  switchConfig:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.switchConfig.local'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java

  switchConfig:
    local: true
    collapseSlashes: false
  file:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.switchConfig.collapseSlashes'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  switchConfig:
    local: true
    collapseSlashes: false
  file:
    enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.file.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    collapseSlashes: false
  file:
    enabled: true
    maxSize : 10
  sync:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.file.maxSize'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  file:
    enabled: true
    maxSize : 10
  sync:
    websocket:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.sync.websocket.urls'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  sync:
    websocket:
      urls: ws://localhost:9095/websocket
      allowOrigin: ws://localhost:9195
#    apollo:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.sync.websocket.allowOrigin'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    websocket:
      urls: ws://localhost:9095/websocket
      allowOrigin: ws://localhost:9195
#    apollo:
#      appId: shenyu
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.exclude.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
#      watchDelay: 1000
  exclude:
    enabled: false
    paths:
      - /favicon.ico
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.exclude.paths'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  exclude:
    enabled: false
    paths:
      - /favicon.ico
  fallback:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.fallback.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      - /favicon.ico
  fallback:
    enabled: false
    paths:
      - /fallback/hystrix
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.fallback.paths'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  fallback:
    enabled: false
    paths:
      - /fallback/hystrix
      - /fallback/resilience4j
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.health.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      - /fallback/sentinel
  health:
    enabled: false
    paths:
      - /actuator
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.health.paths'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  health:
    enabled: false
    paths:
      - /actuator
      - /health_check
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.extPlugin.path'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
      - /health_check
  extPlugin:
    path:
    enabled: true
    threads: 1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.extPlugin.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  extPlugin:
    path:
    enabled: true
    threads: 1
    scheduleTime: 300
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.extPlugin.threads'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    path:
    enabled: true
    threads: 1
    scheduleTime: 300
    scheduleDelay: 30
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.extPlugin.scheduleTime'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    enabled: true
    threads: 1
    scheduleTime: 300
    scheduleDelay: 30
  scheduler:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.extPlugin.scheduleDelay'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    threads: 1
    scheduleTime: 300
    scheduleDelay: 30
  scheduler:
    enabled: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.scheduler.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    scheduleDelay: 30
  scheduler:
    enabled: false
    type: fixed
    threads: 16
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.scheduler.type'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  scheduler:
    enabled: false
    type: fixed
    threads: 16
  upstreamCheck:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.scheduler.threads'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    enabled: false
    type: fixed
    threads: 16
  upstreamCheck:
    enabled: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.upstreamCheck.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    threads: 16
  upstreamCheck:
    enabled: false
    poolSize: 10
    timeout: 3000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.upstreamCheck.poolSize'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  upstreamCheck:
    enabled: false
    poolSize: 10
    timeout: 3000
    healthyThreshold: 1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.upstreamCheck.timeout'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    enabled: false
    poolSize: 10
    timeout: 3000
    healthyThreshold: 1
    unhealthyThreshold: 1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.upstreamCheck.healthyThreshold'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    poolSize: 10
    timeout: 3000
    healthyThreshold: 1
    unhealthyThreshold: 1
    interval: 5000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.upstreamCheck.unhealthyThreshold'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    timeout: 3000
    healthyThreshold: 1
    unhealthyThreshold: 1
    interval: 5000
    printEnabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.upstreamCheck.interval'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    healthyThreshold: 1
    unhealthyThreshold: 1
    interval: 5000
    printEnabled: true
    printInterval: 60000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.upstreamCheck.printEnabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    unhealthyThreshold: 1
    interval: 5000
    printEnabled: true
    printInterval: 60000
  ribbon:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.upstreamCheck.printInterval'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    interval: 5000
    printEnabled: true
    printInterval: 60000
  ribbon:
    serverListRefreshInterval: 10000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ribbon.serverListRefreshInterval'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    printInterval: 60000
  ribbon:
    serverListRefreshInterval: 10000
  metrics:
    enabled: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.metrics.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    serverListRefreshInterval: 10000
  metrics:
    enabled: false
    name : prometheus
    host: 127.0.0.1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.metrics.name'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  metrics:
    enabled: false
    name : prometheus
    host: 127.0.0.1
    port: 8090
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.metrics.host'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    enabled: false
    name : prometheus
    host: 127.0.0.1
    port: 8090
    jmxConfig:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.metrics.port'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    name : prometheus
    host: 127.0.0.1
    port: 8090
    jmxConfig:
    props:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.metrics.jmxConfig'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    host: 127.0.0.1
    port: 8090
    jmxConfig:
    props:
      jvm_enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.metrics.props.jvm_enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    jmxConfig:
    props:
      jvm_enabled: true
#  plugins:
#    rate-limiter.enabled: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.local.enabled'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
#    rate-limiter.enabled: false
  local:
    enabled: false
    sha512Key: "BA3253876AED6BC22D4A6FF53D8406C6AD864195ED144AB5C87621B6C233B548BAEAE6956DF346EC8C17F5EA10F35EE3CBC514797ED7DDD3145464E2A0BAB413"
#  sharedPool:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.local.sha512Key'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  local:
    enabled: false
    sha512Key: "BA3253876AED6BC22D4A6FF53D8406C6AD864195ED144AB5C87621B6C233B548BAEAE6956DF346EC8C17F5EA10F35EE3CBC514797ED7DDD3145464E2A0BAB413"
#  sharedPool:
#    enable: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
logging:
  level:
    root: info
    org.springframework.boot: info
    org.apache.ibatis: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.springframework.boot'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
  level:
    root: info
    org.springframework.boot: info
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.ibatis'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    root: info
    org.springframework.boot: info
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.shenyu.bonuspoint'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    org.springframework.boot: info
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
    org.apache.shenyu: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.shenyu.lottery'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
    org.apache.shenyu: info

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.shenyu'
in `shenyu-bootstrap/src/main/resources/application.yml`
#### Snippet
```java
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
    org.apache.shenyu: info

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.dialect'
in `shenyu-admin/src/test/resources/application-h2.yml`
#### Snippet
```java
shenyu:
  database:
    dialect: h2
    init_script: "sql-script/h2/schema.sql"
    init_enable: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.init_script'
in `shenyu-admin/src/test/resources/application-h2.yml`
#### Snippet
```java
  database:
    dialect: h2
    init_script: "sql-script/h2/schema.sql"
    init_enable: true

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.database.init_enable'
in `shenyu-admin/src/test/resources/application-h2.yml`
#### Snippet
```java
    dialect: h2
    init_script: "sql-script/h2/schema.sql"
    init_enable: true

spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.url'
in `shenyu-admin/src/test/resources/application-h2.yml`
#### Snippet
```java
spring:
  datasource:
    url: jdbc:h2:mem:~/shenyu;DB_CLOSE_DELAY=-1;MODE=MySQL;
    username: sa
    password: sa
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.username'
in `shenyu-admin/src/test/resources/application-h2.yml`
#### Snippet
```java
  datasource:
    url: jdbc:h2:mem:~/shenyu;DB_CLOSE_DELAY=-1;MODE=MySQL;
    username: sa
    password: sa
    driver-class-name: org.h2.Driver
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.password'
in `shenyu-admin/src/test/resources/application-h2.yml`
#### Snippet
```java
    url: jdbc:h2:mem:~/shenyu;DB_CLOSE_DELAY=-1;MODE=MySQL;
    username: sa
    password: sa
    driver-class-name: org.h2.Driver

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.datasource.driver-class-name'
in `shenyu-admin/src/test/resources/application-h2.yml`
#### Snippet
```java
    username: sa
    password: sa
    driver-class-name: org.h2.Driver


```

### SpringBootApplicationYaml
Cannot resolve configuration property 'server.port'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java

server:
  port: 9095
  address: 0.0.0.0

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'server.address'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
server:
  port: 9095
  address: 0.0.0.0

spring:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.profiles.active'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
spring:
  profiles:
    active: h2
  thymeleaf:
    cache: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.cache'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    active: h2
  thymeleaf:
    cache: true
    encoding: utf-8
    enabled: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.encoding'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
  thymeleaf:
    cache: true
    encoding: utf-8
    enabled: true
    prefix: classpath:/static/
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.enabled'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    cache: true
    encoding: utf-8
    enabled: true
    prefix: classpath:/static/
    suffix: .html
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.prefix'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    encoding: utf-8
    enabled: true
    prefix: classpath:/static/
    suffix: .html

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.thymeleaf.suffix'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    enabled: true
    prefix: classpath:/static/
    suffix: .html

mybatis:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'mybatis.config-location'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java

mybatis:
  config-location: classpath:/mybatis/mybatis-config.xml
  mapper-locations: classpath:/mappers/*.xml

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'mybatis.mapper-locations'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
mybatis:
  config-location: classpath:/mybatis/mybatis-config.xml
  mapper-locations: classpath:/mappers/*.xml

shenyu:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.registerType'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
shenyu:
  register:
    registerType: http #http #zookeeper #etcd #nacos #consul
    serverLists: #localhost:2181 #http://localhost:2379 #localhost:8848
    props:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.serverLists'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
  register:
    registerType: http #http #zookeeper #etcd #nacos #consul
    serverLists: #localhost:2181 #http://localhost:2379 #localhost:8848
    props:
      sessionTimeout: 5000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.sessionTimeout'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    serverLists: #localhost:2181 #http://localhost:2379 #localhost:8848
    props:
      sessionTimeout: 5000
      connectionTimeout: 2000
      checked: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.connectionTimeout'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    props:
      sessionTimeout: 5000
      connectionTimeout: 2000
      checked: true
      zombieCheckTimes: 5
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.checked'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
      sessionTimeout: 5000
      connectionTimeout: 2000
      checked: true
      zombieCheckTimes: 5
      scheduledTime: 10
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.zombieCheckTimes'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
      connectionTimeout: 2000
      checked: true
      zombieCheckTimes: 5
      scheduledTime: 10
      nacosNameSpace: ShenyuRegisterCenter
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.scheduledTime'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
      checked: true
      zombieCheckTimes: 5
      scheduledTime: 10
      nacosNameSpace: ShenyuRegisterCenter
  sync:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.register.props.nacosNameSpace'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
      zombieCheckTimes: 5
      scheduledTime: 10
      nacosNameSpace: ShenyuRegisterCenter
  sync:
    websocket:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.sync.websocket.enabled'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
  sync:
    websocket:
      enabled: true
#      zookeeper:
#        url: localhost:2181
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.aes.secret.key'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
  aes:
    secret:
      key: 2095132720951327
      iv: 6075877187097700
  ldap:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.aes.secret.iv'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    secret:
      key: 2095132720951327
      iv: 6075877187097700
  ldap:
    enabled: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.enabled'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
      iv: 6075877187097700
  ldap:
    enabled: false
    url: ldap://xxxx:xxx
    bind-dn: cn=xxx,dc=xxx,dc=xxx
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.url'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
  ldap:
    enabled: false
    url: ldap://xxxx:xxx
    bind-dn: cn=xxx,dc=xxx,dc=xxx
    password: xxxx
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.bind-dn'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    enabled: false
    url: ldap://xxxx:xxx
    bind-dn: cn=xxx,dc=xxx,dc=xxx
    password: xxxx
    base-dn: ou=xxx,dc=xxx,dc=xxx
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.password'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    url: ldap://xxxx:xxx
    bind-dn: cn=xxx,dc=xxx,dc=xxx
    password: xxxx
    base-dn: ou=xxx,dc=xxx,dc=xxx
    object-class: person
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.base-dn'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    bind-dn: cn=xxx,dc=xxx,dc=xxx
    password: xxxx
    base-dn: ou=xxx,dc=xxx,dc=xxx
    object-class: person
    login-field: cn
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.object-class'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    password: xxxx
    base-dn: ou=xxx,dc=xxx,dc=xxx
    object-class: person
    login-field: cn
  jwt:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.ldap.login-field'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    base-dn: ou=xxx,dc=xxx,dc=xxx
    object-class: person
    login-field: cn
  jwt:
    expired-seconds: 86400000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.jwt.expired-seconds'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    login-field: cn
  jwt:
    expired-seconds: 86400000
  shiro:
    white-list:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.shiro.white-list'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    expired-seconds: 86400000
  shiro:
    white-list:
      - /
      - /favicon.*
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'shenyu.swagger.enable'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
      - /csrf
  swagger:
    enable: true

logging:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.root'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
logging:
  level:
    root: info
    org.springframework.boot: info
    org.apache.ibatis: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.springframework.boot'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
  level:
    root: info
    org.springframework.boot: info
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.ibatis'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    root: info
    org.springframework.boot: info
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.shenyu.bonuspoint'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    org.springframework.boot: info
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
    org.apache.shenyu: info
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.shenyu.lottery'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    org.apache.ibatis: info
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
    org.apache.shenyu: info

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'logging.level.org.apache.shenyu'
in `shenyu-admin/src/test/resources/application.yml`
#### Snippet
```java
    org.apache.shenyu.bonuspoint: info
    org.apache.shenyu.lottery: info
    org.apache.shenyu: info

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/Publish.java`
#### Snippet
```java
        switch (mqttQoS.value()) {
            case 0:
                break;

            case 1:
```

## RuleId[id=Deprecation]
### Deprecation
'withPrefix(io.etcd.jetcd.ByteSequence)' is deprecated
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
        Watch.Listener listener = watch(updateHandler, deleteHandler);
        WatchOption option = WatchOption.newBuilder()
                .withPrefix(ByteSequence.from(key, UTF_8))
                .build();
        Watch.Watcher watch = client.getWatchClient().watch(ByteSequence.from(key, UTF_8), option, listener);
```

### Deprecation
'withPrefix(io.etcd.jetcd.ByteSequence)' is deprecated
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
        ByteSequence prefixByteSequence = bytesOf(prefix);
        GetOption getOption = GetOption.newBuilder()
                .withPrefix(prefixByteSequence)
                .withSortField(GetOption.SortTarget.KEY)
                .withSortOrder(GetOption.SortOrder.ASCEND)
```

### Deprecation
'withPrefix(io.etcd.jetcd.ByteSequence)' is deprecated
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/etcd/EtcdClient.java`
#### Snippet
```java
    public void deleteEtcdPathRecursive(final String path) {
        DeleteOption option = DeleteOption.newBuilder()
                .withPrefix(ByteSequence.from(path, StandardCharsets.UTF_8))
                .build();
        client.getKVClient().delete(ByteSequence.from(path, StandardCharsets.UTF_8), option);
```

### Deprecation
'withPrefix(io.etcd.jetcd.ByteSequence)' is deprecated
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/etcd/EtcdClient.java`
#### Snippet
```java
        try {
            GetOption option = GetOption.newBuilder()
                    .withPrefix(ByteSequence.from(key, StandardCharsets.UTF_8))
                    .build();
            List<KeyValue> keyValues = client.getKVClient().get(ByteSequence.from(key, StandardCharsets.UTF_8), option).get().getKvs();
```

### Deprecation
'withPrefix(io.etcd.jetcd.ByteSequence)' is deprecated
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/client/EtcdClient.java`
#### Snippet
```java
        Watch.Listener listener = watch(exitSignSupplier, storeKey, consumer);
        WatchOption option = WatchOption.newBuilder()
                .withPrefix(ByteSequence.from(key, StandardCharsets.UTF_8))
                .build();
        Watch.Watcher watch = client.getWatchClient().watch(ByteSequence.from(key, StandardCharsets.UTF_8), option, listener);
```

### Deprecation
'withPrefix(io.etcd.jetcd.ByteSequence)' is deprecated
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/client/EtcdClient.java`
#### Snippet
```java
        KV kv = client.getKVClient();
        ByteSequence storePrefix = ByteSequence.from(prefix, StandardCharsets.UTF_8);
        GetOption option = GetOption.newBuilder().withKeysOnly(true).withPrefix(storePrefix).build();
        GetResponse response = kv.get(storePrefix, option).get();
        return response.getKvs().stream()
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `shenyu-plugin/shenyu-plugin-tars/src/main/java/org/apache/shenyu/plugin/tars/cache/ApplicationConfigCache.java`
#### Snippet
```java
                return;
            default:
                return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/cache/ApplicationConfigCache.java`
#### Snippet
```java
                return;
            default:
                return;
        }
    }
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`Objects.isNull(jsonObject.get("type")) ? false : "array".equals(jsonObject.get("type").getAsString())` can be simplified to '!Objects.isNull(jsonObject.get("type")) \&\& "array".equals(jsonObject.get("type").getAsString())'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/SwaggerDocParser.java`
#### Snippet
```java
    private RefInfo getRefInfo(final JsonObject jsonObject) {
        JsonElement refElement;
        boolean isArray = Objects.isNull(jsonObject.get("type")) ? false : "array".equals(jsonObject.get("type").getAsString());
        if (isArray) {
            refElement = jsonObject.getAsJsonObject("items").get("$ref");
```

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'maskType' is assigned to itself
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/entity/CommonLoggingRuleHandle.java`
#### Snippet
```java
     */
    public void setMaskType(final String desensitizeType) {
        this.maskType = maskType;
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `shenyu-plugin/shenyu-plugin-tars/src/main/java/org/apache/shenyu/plugin/tars/cache/ApplicationConfigCache.java`
#### Snippet
```java
                @NonNull
                @Override
                public TarsInvokePrxList load(@NonNull final String key) {
                    return new TarsInvokePrxList(null, null, null);
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `shenyu-plugin/shenyu-plugin-tars/src/main/java/org/apache/shenyu/plugin/tars/cache/ApplicationConfigCache.java`
#### Snippet
```java
                @NonNull
                @Override
                public TarsInvokePrxList load(@NonNull final String key) {
                    return new TarsInvokePrxList(null, null, null);
                }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/cache/ApplicationConfigCache.java`
#### Snippet
```java
            .build(new CacheLoader<String, ServiceConfig>() {
                @Override
                public ServiceConfig load(@NonNull final String key) {
                    return new ServiceConfig();
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/cache/ApplicationConfigCache.java`
#### Snippet
```java
            .build(new CacheLoader<String, ServiceConfig>() {
                @Override
                public ServiceConfig load(@NonNull final String key) {
                    return new ServiceConfig();
                }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java

                @Override
                public List<Cookie> loadForRequest(final HttpUrl httpUrl) {
                    List<Cookie> cookies = cookieStore.get(httpUrl.host());
                    return cookies != null ? cookies : new ArrayList<>();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java

                @Override
                public List<Cookie> loadForRequest(final HttpUrl httpUrl) {
                    List<Cookie> cookies = cookieStore.get(httpUrl.host());
                    return cookies != null ? cookies : new ArrayList<>();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
            .cookieJar(new CookieJar() {
                @Override
                public void saveFromResponse(final HttpUrl httpUrl, final List<Cookie> list) {
                    cookieStore.put(httpUrl.host(), list);
                }
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
            .cookieJar(new CookieJar() {
                @Override
                public void saveFromResponse(final HttpUrl httpUrl, final List<Cookie> list) {
                    cookieStore.put(httpUrl.host(), list);
                }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DashboardUserServiceImpl.java`
#### Snippet
```java
    private final RoleMapper roleMapper;
    
    @Nullable
    private final LdapProperties ldapProperties;
    
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DashboardUserServiceImpl.java`
#### Snippet
```java
    private final LdapProperties ldapProperties;
    
    @Nullable
    private final LdapTemplate ldapTemplate;
    
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimerTaskList.java`
#### Snippet
```java
    
    @Override
    public int compareTo(final Delayed delayed) {
        boolean other = delayed instanceof TimerTaskList;
        if (other) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemorySafeLinkedBlockingQueue.java`
#### Snippet
```java

    @Override
    public boolean offer(final E e) {
        if (!hasRemainedMemory()) {
            rejector.reject(e, this);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/ShenyuThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public void execute(final Runnable command) {
        if (Objects.isNull(command)) {
            throw new NullPointerException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitedLinkedBlockingQueue.java`
#### Snippet
```java

    @Override
    public boolean offer(final E e) {
        return memoryLimiter.acquire(e) && super.offer(e);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/TaskQueue.java`
#### Snippet
```java

    @Override
    default boolean offer(final E e) {
        if (Objects.isNull(getExecutor())) {
            throw new RejectedExecutionException("The task queue does not have executor!");
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/ShenyuThreadFactory.java`
#### Snippet
```java

    @Override
    public Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(THREAD_GROUP, runnable,
                THREAD_GROUP.getName() + "-" + namePrefix + "-" + THREAD_NUMBER.getAndIncrement());
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `shenyu-protocol/shenyu-protocol-tcp/src/main/java/org/apache/shenyu/protocol/tcp/connection/ActivityConnectionObserver.java`
#### Snippet
```java

    @Override
    public void onStateChange(final Connection connection, final State newState) {
        if (newState == State.CONNECTED) {
            cache.put(connection, newState);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `shenyu-protocol/shenyu-protocol-tcp/src/main/java/org/apache/shenyu/protocol/tcp/connection/ActivityConnectionObserver.java`
#### Snippet
```java

    @Override
    public void onStateChange(final Connection connection, final State newState) {
        if (newState == State.CONNECTED) {
            cache.put(connection, newState);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-aliyun-sls/src/main/java/org/apache/shenyu/plugin/aliyun/sls/client/AliyunSlsLogCollectClient.java`
#### Snippet
```java

        @Override
        public void onFailure(final Throwable throwable) {
            if (throwable instanceof ResultFailedException) {
                Result result = ((ResultFailedException) throwable).getResult();
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/cache/ApplicationConfigCache.java`
#### Snippet
```java
                @Override
                @NonNull
                public ShenyuServiceInstanceLists load(@NonNull final String key) {
                    return new ShenyuServiceInstanceLists(key);
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/cache/ApplicationConfigCache.java`
#### Snippet
```java
                @Override
                @NonNull
                public ShenyuServiceInstanceLists load(@NonNull final String key) {
                    return new ShenyuServiceInstanceLists(key);
                }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `shenyu-plugin/shenyu-plugin-motan/src/main/java/org/apache/shenyu/plugin/motan/cache/ApplicationConfigCache.java`
#### Snippet
```java
                @Override
                @NonNull
                public RefererConfig<CommonHandler> load(@NonNull final String key) {
                    return new RefererConfig<>();
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `shenyu-plugin/shenyu-plugin-motan/src/main/java/org/apache/shenyu/plugin/motan/cache/ApplicationConfigCache.java`
#### Snippet
```java
                @Override
                @NonNull
                public RefererConfig<CommonHandler> load(@NonNull final String key) {
                    return new RefererConfig<>();
                }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-tencent-cls/src/main/java/org/apache/shenyu/plugin/tencent/cls/client/TencentClsLogCollectClient.java`
#### Snippet
```java

        @Override
        public void onFailure(final Throwable throwable) {
            if (throwable instanceof ResultFailedException) {
                Result result = ((ResultFailedException) throwable).getResult();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `shenyu-disruptor/src/main/java/org/apache/shenyu/disruptor/thread/DisruptorThreadFactory.java`
#### Snippet
```java

    @Override
    public Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(THREAD_GROUP, runnable,
                THREAD_GROUP.getName() + "-" + namePrefix + "-" + THREAD_NUMBER.getAndIncrement());
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/cache/ApplicationConfigCache.java`
#### Snippet
```java
                @Override
                @NonNull
                public ConsumerConfig<GenericService> load(@NonNull final String key) {
                    return new ConsumerConfig<>();
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/cache/ApplicationConfigCache.java`
#### Snippet
```java
                @Override
                @NonNull
                public ConsumerConfig<GenericService> load(@NonNull final String key) {
                    return new ConsumerConfig<>();
                }
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginClassLoader.java`
#### Snippet
```java
                if (!next) {
                    Annotation[] annotations = clazz.getAnnotations();
                    next = Arrays.stream(annotations).anyMatch(e -> e.annotationType().equals(Component.class)
                            || e.annotationType().equals(Service.class));
                }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginClassLoader.java`
#### Snippet
```java
                    Annotation[] annotations = clazz.getAnnotations();
                    next = Arrays.stream(annotations).anyMatch(e -> e.annotationType().equals(Component.class)
                            || e.annotationType().equals(Service.class));
                }
                if (next) {
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginLoader.java`
#### Snippet
```java
                if (!next) {
                    Annotation[] annotations = clazz.getAnnotations();
                    next = Arrays.stream(annotations).anyMatch(e -> e.annotationType().equals(Component.class)
                            || e.annotationType().equals(Service.class));
                }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginLoader.java`
#### Snippet
```java
                    Annotation[] annotations = clazz.getAnnotations();
                    next = Arrays.stream(annotations).anyMatch(e -> e.annotationType().equals(Component.class)
                            || e.annotationType().equals(Service.class));
                }
                if (next) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/WebsocketSyncDataService.java`
#### Snippet
```java

    /**
     * see https://github.com/apache/tomcat/blob/main/java/org/apache/tomcat/websocket/Constants.java#L99.
     */
    private static final String ORIGIN_HEADER_NAME = "Origin";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/dto/MockRequestRecordDTO.java`
#### Snippet
```java

    /**
     * whole url,such as curl http://domain//test1/**?param=test .
     */
    private String url;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/AbstractShenyuClientRegisterServiceImpl.java`
#### Snippet
```java
    /**
     * adjustment such as '/aa/${xxx}/cc' replace to `/aa/`**`/cc` for client simpler annotation.
     * link: https://github.com/apache/shenyu/pull/3819
     * @param path the path
     * @return the replaced path
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-common/src/main/java/org/apache/shenyu/common/cache/MemorySafeLRUMap.java`
#### Snippet
```java
 * is that it handles memory issues via {@link org.apache.shenyu.common.concurrent.MemoryLimitCalculator}.
 *
 * <p>Note: this class is not thread safe! see https://github.com/apache/shenyu/issues/3929
 */
@NotThreadSafe
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/VersionUtils.java`
#### Snippet
```java

    /**
     * checkDuplicate,this method refers to the design of dubbo,url:https://dubbo.apache.org/zh/docs/v2.7/dev/principals/dummy/ .
     * @param cls cls
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/MapUtils.java`
#### Snippet
```java

    /**
     * This is jdk8 performance bug, see: https://bugs.openjdk.java.net/browse/JDK-8161372.
     *
     * @param map source map
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-aliyun-sls/src/main/java/org/apache/shenyu/plugin/aliyun/sls/config/AliyunLogCollectConfig.java`
#### Snippet
```java
        /**
         * aliyun sls address.
         * please seee https://help.aliyun.com/document_detail/29008.htm?spm=a2c4g.11186623.0.0.cc7a3de5dJNKOe#reference-wgx-pwq-zdb
         */
        private String host;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/sampler/CountSampler.java`
#### Snippet
```java
    /**
     * gen random bitSet.
     * reference resources： http://stackoverflow.com/questions/12817946/generate-a-random-bitset-with-n-1s
     *
     * @param size        bitmap size
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/sampler/CountSampler.java`
#### Snippet
```java
/**
 * used for sample log.
 * reference resources： http://stackoverflow.com/questions/12817946/generate-a-random-bitset-with-n-1s
 */
public class CountSampler implements Sampler {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-plugin/shenyu-plugin-httpclient/src/main/java/org/apache/shenyu/plugin/httpclient/config/HttpClientProperties.java`
#### Snippet
```java

    /**
     * set to false, fix java.io.IOException: Connection reset by peer, see https://github.com/reactor/reactor-netty/issues/388.
     */
    private boolean keepAlive;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-tencent-cls/src/main/java/org/apache/shenyu/plugin/tencent/cls/config/TencentLogCollectConfig.java`
#### Snippet
```java
    /**
     * global log config.
     * please seee https://github.com/TencentCloud/tencentcloud-cls-sdk-java/blob/main/README.md#%E9%85%8D%E7%BD%AE%E5%8F%82%E6%95%B0%E8%AF%A6%E8%A7%A3
     */
    public static class TencentClsLogConfig extends GenericGlobalConfig {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-tencent-cls/src/main/java/org/apache/shenyu/plugin/tencent/cls/config/TencentLogCollectConfig.java`
#### Snippet
```java
        /**
         * Tencent cls endpoint.
         * please seee https://cloud.tencent.com/document/product/614/18940
         */
        private String endpoint;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClient.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(ZookeeperClient.class);

    private final ZookeeperConfig config;

    private final CuratorFramework client;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-zookeeper/src/main/java/org/apache/shenyu/register/client/zookeeper/ZookeeperClient.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(ZookeeperClient.class);

    private final ZookeeperConfig config;

    private final CuratorFramework client;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/register/ClientInfoRefreshedEventListener.java`
#### Snippet
```java
    private final boolean addPrefixed;

    private final boolean isFull;

    private final String contextPath;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/register/ClientInfoRefreshedEventListener.java`
#### Snippet
```java
    private final String host;

    private final String port;

    private final ShenyuClientRegisterEventPublisher publisher;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/register/ClientInfoRefreshedEventListener.java`
#### Snippet
```java
public final class ClientInfoRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    private final boolean addPrefixed;

    private final boolean isFull;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/register/ClientInfoRefreshedEventListener.java`
#### Snippet
```java
    private final RpcTypeEnum rpcTypeEnum;

    private final String ipAndPort;

    private final String host;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-register-center/shenyu-register-common/src/main/java/org/apache/shenyu/register/common/dto/MetaDataRegisterDTO.java`
#### Snippet
```java
        private boolean registerMetaData;

        private long timeMillis;

        private boolean addPrefixed;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-sync-data-center/shenyu-sync-data-zookeeper/src/main/java/org/apache/shenyu/sync/data/zookeeper/ZookeeperClient.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(ZookeeperClient.class);

    private final ZookeeperConfig config;

    private final CuratorFramework client;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-zookeeper/src/main/java/org/apache/shenyu/register/instance/zookeeper/ZookeeperClient.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(ZookeeperClient.class);

    private final ZookeeperConfig config;

    private final CuratorFramework client;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-springmvc/src/main/java/org/apache/shenyu/springboot/starter/client/springmvc/ShenyuSpringMvcClientInfoRegisterConfiguration.java`
#### Snippet
```java
    private final boolean addPrefixed;

    private final boolean isFull;

    private final String contextPath;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientMethodHandler.java`
#### Snippet
```java
public class ShenyuClientMethodHandler {

    private final ShenyuClient shenyuClient;

    private final ShenyuSdkClient shenyuHttpClient;
```

## RuleId[id=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `ioe` to 'System.err.println()' call
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
                    }
                } catch (IOException ioe) {
                    System.err.println(ioe);
                }
            }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `eventName()` is identical to its super method
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/event/plugin/BatchPluginChangedEvent.java`
#### Snippet
```java
    
    @Override
    public String eventName() {
        return "plugin";
    }
```

### RedundantMethodOverride
Method `skip()` is identical to its super method
in `shenyu-plugin/shenyu-plugin-casdoor/src/main/java/org/apache/shenyu/plugin/casdoor/CasdoorPlugin.java`
#### Snippet
```java

    @Override
    public boolean skip(final ServerWebExchange exchange) {
        return false;
    }
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/HierarchicalWheelTimer.java`
#### Snippet
```java
        @Override
        public void run() {
            while (true) {
                try {
                    timer.advanceClock(100L);
```

## RuleId[id=ExcessiveLambdaUsage]
### ExcessiveLambdaUsage
Excessive lambda usage
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
    @Override
    public String getPort() {
        final int port = Integer.parseInt(Optional.ofNullable(super.getPort()).orElseGet(() -> "-1"));
        final int mergedPort = port <= 0 ? PortUtils.findPort(getContext().getAutowireCapableBeanFactory()) : port;
        return String.valueOf(mergedPort);
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/register/ClientInfoRefreshedEventListener.java`
#### Snippet
```java
    public void onApplicationEvent(final ContextRefreshedEvent event) {

        final int port = Integer.parseInt(Optional.ofNullable(host).orElseGet(() -> "-1"));
        final int mergedPort = port <= 0 ? PortUtils.findPort(event.getApplicationContext().getAutowireCapableBeanFactory()) : port;

```

### ExcessiveLambdaUsage
Excessive lambda usage
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
    @Override
    public String getPort() {
        final int port = Integer.parseInt(Optional.ofNullable(super.getPort()).orElseGet(() -> "-1"));
        final int mergedPort = port <= 0 ? PortUtils.findPort(getContext().getAutowireCapableBeanFactory()) : port;
        return String.valueOf(mergedPort);
```

### ExcessiveLambdaUsage
Excessive lambda usage
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/init/SpringMvcClientEventListener.java`
#### Snippet
```java
    @Override
    public String getPort() {
        final int port = Integer.parseInt(Optional.ofNullable(super.getPort()).orElseGet(() -> "-1"));
        final int mergedPort = port <= 0 ? PortUtils.findPort(getContext().getAutowireCapableBeanFactory()) : port;
        return String.valueOf(mergedPort);
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `data`, unclear if a varargs or non-varargs call is desired
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/RangeDataGenerator.java`
#### Snippet
```java
                .toArray(String[]::new);

        return MockUtil.oneOf(data).toString();
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `matchNode` initializer `null` is redundant
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/trie/ShenyuTrie.java`
#### Snippet
```java
        int[] wildcard = new int[pathParts.length];
        int[] pathVariable = new int[pathParts.length];
        ShenyuTrieNode matchNode = null;
        while (startIndex < pathParts.length) {
            String pathPart = pathParts[startIndex];
```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
        public static byte[] toBytes(final InputStream input) throws IOException {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            int n = 0;
            byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];

```

### UnusedAssignment
Variable `ext` initializer `""` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java
     */
    private String buildExtParamByParentTag(final TagDO parentTagDO) {
        String ext = "";
        if (parentTagDO.getId().equals(AdminConstants.TAG_ROOT_PARENT_ID)) {
            final TagDO.TagExt parent = new TagDO.TagExt();
```

### UnusedAssignment
Variable `ctClass` initializer `null` is redundant
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        ClassPool pool = ClassGenerator.getClassPool(clazz.getClassLoader());
        synchronized (parameterClassName.intern()) {
            CtClass ctClass = null;
            try {
                ctClass = pool.getCtClass(parameterClassName);
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `beanShenyuClient` is always 'null'
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
        final Method[] methods = ReflectionUtils.getUniqueDeclaredMethods(clazz);
        for (Method method : methods) {
            handleMethod(bean, clazz, beanShenyuClient, method, superPath);
        }
    }
```

### ConstantValue
Value `t` is always 'null'
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/fallback/FallbackHandler.java`
#### Snippet
```java
        }
        if (isSameUri) {
            return withoutFallback(exchange, t);
        }
        // redirect to fallback uri.
```

### ConstantValue
Condition `throwable instanceof SentinelPlugin.SentinelFallbackException` is always `false`
in `shenyu-plugin/shenyu-plugin-sentinel/src/main/java/org/apache/shenyu/plugin/sentinel/fallback/SentinelFallbackHandler.java`
#### Snippet
```java
            exchange.getResponse().setStatusCode(HttpStatus.TOO_MANY_REQUESTS);
            error = ShenyuResultWrap.error(exchange, ShenyuResultEnum.SENTINEL_BLOCK_ERROR);
        } else if (throwable instanceof SentinelPlugin.SentinelFallbackException) {
            return exchange.getAttribute(Constants.RESPONSE_MONO);
        } else {
```

### ConstantValue
Condition `Objects.isNull(ApplicationConfigCache.getInstance().get(exist.getPath()))` is always `false` when reached
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/handler/BrpcMetaDataHandler.java`
#### Snippet
```java
        try {
            MetaData exist = META_DATA.get(metaData.getPath());
            if (Objects.isNull(exist) || Objects.isNull(ApplicationConfigCache.getInstance().get(exist.getPath()))) {
                // The first initialization
                ApplicationConfigCache.getInstance().initRef(metaData);
```

### ConstantValue
Method reference result is always 'true'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/SandboxServiceImpl.java`
#### Snippet
```java
                }
            })
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    }
```

### ConstantValue
Condition `throwable instanceof ResponseStatusException` is always `true`
in `shenyu-web/src/main/java/org/apache/shenyu/web/handler/GlobalErrorHandler.java`
#### Snippet
```java
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        String errMsg = httpStatus.getReasonPhrase();
        if (throwable instanceof ResponseStatusException) {
            httpStatus = ((ResponseStatusException) throwable).getStatus();
            if (StringUtils.hasLength(((ResponseStatusException) throwable).getReason())) {
```

### ConstantValue
Condition `Objects.isNull(ApplicationConfigCache.getInstance().get(exist.getPath()))` is always `false`
in `shenyu-plugin/shenyu-plugin-motan/src/main/java/org/apache/shenyu/plugin/motan/handler/MotanMetaDataHandler.java`
#### Snippet
```java
        try {
            MetaData exist = META_DATA.get(metaData.getPath());
            if (Objects.isNull(exist) || Objects.isNull(ApplicationConfigCache.getInstance().get(exist.getPath()))
                    || Objects.isNull(ApplicationConfigCache.getInstance().get(exist.getPath()).getRef())) {
                // The first initialization
```

### ConstantValue
Condition `Objects.isNull(reference)` is always `false`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/proxy/AlibabaDubboProxyService.java`
#### Snippet
```java
    public ResponseFuture genericInvoker(final String body, final MetaData metaData) throws ShenyuException {
        ReferenceConfig<GenericService> reference = AlibabaDubboConfigCache.getInstance().get(metaData.getPath());
        if (Objects.isNull(reference) || StringUtils.isEmpty(reference.getInterface())) {
            AlibabaDubboConfigCache.getInstance().invalidate(metaData.getPath());
            reference = AlibabaDubboConfigCache.getInstance().initRef(metaData);
```

### ConstantValue
Result of `Objects.nonNull(AlibabaDubboConfigCache.getInstance().get(metaData.getPath()))` is always 'true'
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/handler/AlibabaDubboMetaDataHandler.java`
#### Snippet
```java
    @Override
    protected boolean isInitialized(final MetaData metaData) {
        return Objects.nonNull(AlibabaDubboConfigCache.getInstance().get(metaData.getPath()));
    }

```

### ConstantValue
Condition `throwable instanceof Resilience4JPlugin.CircuitBreakerStatusCodeException` is always `false`
in `shenyu-plugin/shenyu-plugin-resilience4j/src/main/java/org/apache/shenyu/plugin/resilience4j/executor/Executor.java`
#### Snippet
```java
            exchange.getResponse().setStatusCode(HttpStatus.GATEWAY_TIMEOUT);
            error = ShenyuResultWrap.error(exchange, ShenyuResultEnum.SERVICE_TIMEOUT);
        } else if (throwable instanceof Resilience4JPlugin.CircuitBreakerStatusCodeException) {
            return Mono.error(throwable);
        } else if (throwable instanceof CallNotPermittedException) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        if (memberValue instanceof BooleanMemberValue) {
            ((BooleanMemberValue) memberValue).setValue((Boolean) value);
        } else if (memberValue instanceof ByteMemberValue) {
            ((ByteMemberValue) memberValue).setValue((Byte) value);
        } else if (memberValue instanceof CharMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        if (memberValue instanceof BooleanMemberValue) {
            ((BooleanMemberValue) memberValue).setValue((Boolean) value);
        } else if (memberValue instanceof ByteMemberValue) {
            ((ByteMemberValue) memberValue).setValue((Byte) value);
        } else if (memberValue instanceof CharMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof ByteMemberValue) {
            ((ByteMemberValue) memberValue).setValue((Byte) value);
        } else if (memberValue instanceof CharMemberValue) {
            ((CharMemberValue) memberValue).setValue((Character) value);
        } else if (memberValue instanceof ShortMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof CharMemberValue) {
            ((CharMemberValue) memberValue).setValue((Character) value);
        } else if (memberValue instanceof ShortMemberValue) {
            ((ShortMemberValue) memberValue).setValue((Short) value);
        } else if (memberValue instanceof IntegerMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof ShortMemberValue) {
            ((ShortMemberValue) memberValue).setValue((Short) value);
        } else if (memberValue instanceof IntegerMemberValue) {
            ((IntegerMemberValue) memberValue).setValue((Integer) value);
        } else if (memberValue instanceof LongMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof IntegerMemberValue) {
            ((IntegerMemberValue) memberValue).setValue((Integer) value);
        } else if (memberValue instanceof LongMemberValue) {
            ((LongMemberValue) memberValue).setValue((Long) value);
        } else if (memberValue instanceof FloatMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof LongMemberValue) {
            ((LongMemberValue) memberValue).setValue((Long) value);
        } else if (memberValue instanceof FloatMemberValue) {
            ((FloatMemberValue) memberValue).setValue((Float) value);
        } else if (memberValue instanceof DoubleMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof FloatMemberValue) {
            ((FloatMemberValue) memberValue).setValue((Float) value);
        } else if (memberValue instanceof DoubleMemberValue) {
            ((DoubleMemberValue) memberValue).setValue((Double) value);
        } else if (memberValue instanceof ClassMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof DoubleMemberValue) {
            ((DoubleMemberValue) memberValue).setValue((Double) value);
        } else if (memberValue instanceof ClassMemberValue) {
            ((ClassMemberValue) memberValue).setValue(((Class<?>) value).getName());
        } else if (memberValue instanceof StringMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof ClassMemberValue) {
            ((ClassMemberValue) memberValue).setValue(((Class<?>) value).getName());
        } else if (memberValue instanceof StringMemberValue) {
            ((StringMemberValue) memberValue).setValue((String) value);
        } else if (memberValue instanceof EnumMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof StringMemberValue) {
            ((StringMemberValue) memberValue).setValue((String) value);
        } else if (memberValue instanceof EnumMemberValue) {
            ((EnumMemberValue) memberValue).setValue(((Enum<?>) value).name());
            /* else if (memberValue instanceof AnnotationMemberValue) */
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof ByteMemberValue) {
            ((ByteMemberValue) memberValue).setValue((Byte) value);
        } else if (memberValue instanceof CharMemberValue) {
            ((CharMemberValue) memberValue).setValue((Character) value);
        } else if (memberValue instanceof ShortMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof CharMemberValue) {
            ((CharMemberValue) memberValue).setValue((Character) value);
        } else if (memberValue instanceof ShortMemberValue) {
            ((ShortMemberValue) memberValue).setValue((Short) value);
        } else if (memberValue instanceof IntegerMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof ShortMemberValue) {
            ((ShortMemberValue) memberValue).setValue((Short) value);
        } else if (memberValue instanceof IntegerMemberValue) {
            ((IntegerMemberValue) memberValue).setValue((Integer) value);
        } else if (memberValue instanceof LongMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof IntegerMemberValue) {
            ((IntegerMemberValue) memberValue).setValue((Integer) value);
        } else if (memberValue instanceof LongMemberValue) {
            ((LongMemberValue) memberValue).setValue((Long) value);
        } else if (memberValue instanceof FloatMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof LongMemberValue) {
            ((LongMemberValue) memberValue).setValue((Long) value);
        } else if (memberValue instanceof FloatMemberValue) {
            ((FloatMemberValue) memberValue).setValue((Float) value);
        } else if (memberValue instanceof DoubleMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof FloatMemberValue) {
            ((FloatMemberValue) memberValue).setValue((Float) value);
        } else if (memberValue instanceof DoubleMemberValue) {
            ((DoubleMemberValue) memberValue).setValue((Double) value);
        } else if (memberValue instanceof ClassMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof DoubleMemberValue) {
            ((DoubleMemberValue) memberValue).setValue((Double) value);
        } else if (memberValue instanceof ClassMemberValue) {
            ((ClassMemberValue) memberValue).setValue(((Class<?>) value).getName());
        } else if (memberValue instanceof StringMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof ClassMemberValue) {
            ((ClassMemberValue) memberValue).setValue(((Class<?>) value).getName());
        } else if (memberValue instanceof StringMemberValue) {
            ((StringMemberValue) memberValue).setValue((String) value);
        } else if (memberValue instanceof EnumMemberValue) {
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } else if (memberValue instanceof StringMemberValue) {
            ((StringMemberValue) memberValue).setValue((String) value);
        } else if (memberValue instanceof EnumMemberValue) {
            ((EnumMemberValue) memberValue).setValue(((Enum<?>) value).name());
            /* else if (memberValue instanceof AnnotationMemberValue) */
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
            ((EnumMemberValue) memberValue).setValue(((Enum<?>) value).name());
            /* else if (memberValue instanceof AnnotationMemberValue) */
        } else if (memberValue instanceof ArrayMemberValue) {
            CtClass arrayType = type.getComponentType();
            int len = Array.getLength(value);
```

### ConstantValue
Value `memberValue` is always 'null'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
            ((EnumMemberValue) memberValue).setValue(((Enum<?>) value).name());
            /* else if (memberValue instanceof AnnotationMemberValue) */
        } else if (memberValue instanceof ArrayMemberValue) {
            CtClass arrayType = type.getComponentType();
            int len = Array.getLength(value);
```

### ConstantValue
Result of `Objects.nonNull(ApacheDubboConfigCache.getInstance().get(metaData.getPath()))` is always 'true'
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/handler/ApacheDubboMetaDataHandler.java`
#### Snippet
```java
    @Override
    protected boolean isInitialized(final MetaData metaData) {
        return Objects.nonNull(ApacheDubboConfigCache.getInstance().get(metaData.getPath()));
    }

```

### ConstantValue
Value `exception` is always 'null'
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/proxy/ApacheDubboProxyService.java`
#### Snippet
```java
            exchange.getAttributes().put(Constants.CLIENT_RESPONSE_RESULT_TYPE, ResultEnum.SUCCESS.getName());
            return ret;
        })).onErrorMap(exception -> exception instanceof GenericException ? new ShenyuException(((GenericException) exception).getExceptionMessage()) : new ShenyuException(exception));
    }
    
```

### ConstantValue
Condition `Objects.isNull(reference)` is always `false`
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/proxy/SofaProxyService.java`
#### Snippet
```java
    public Mono<Object> genericInvoker(final String body, final MetaData metaData, final ServerWebExchange exchange) throws ShenyuException {
        ConsumerConfig<GenericService> reference = ApplicationConfigCache.getInstance().get(metaData.getPath());
        if (Objects.isNull(reference) || StringUtils.isEmpty(reference.getInterfaceId())) {
            ApplicationConfigCache.getInstance().invalidate(metaData.getPath());
            reference = ApplicationConfigCache.getInstance().initRef(metaData);
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `plugins`
in `shenyu-web/src/main/java/org/apache/shenyu/web/handler/ShenyuWebHandler.java`
#### Snippet
```java
            case SORTED:
                // copy a new one, or there will be concurrency problems
                this.plugins = sortPlugins(new ArrayList<>(this.plugins));
                break;
            default:
```

## RuleId[id=WriteOnlyObject]
### WriteOnlyObject
Write-only object
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/MqttServerConfiguration.java`
#### Snippet
```java
            setPassword(encryptPassword());
        }
        MqttContext context = new MqttContext();
        context.setPassword(getPassword());
        context.setPort(getPort());
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-desensitize-api/src/main/java/org/apache/shenyu/plugin/logging/desensitize/api/matcher/KeyWordMatch.java`
#### Snippet
```java
                sb.append(tempKeyWord);
            } else {
                sb.append("^" + tempKeyWord.substring(0, 3) + "(.*?)" + tempKeyWord.substring(tempKeyWord.length() - 3) + "$");
            }
            sb.append("||");
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shenyu.client.core.register.matcher.Matcher\>' to 'org.apache.shenyu.client.core.register.matcher.Matcher'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/register/matcher/Matcher.java`
#### Snippet
```java
    static <T> Matcher<T> not(Matcher<? super T> target) {
        Objects.requireNonNull(target);
        return (Matcher<T>) target.negate();
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'addSubscribers(ExecutorSubscriber)' as a member of raw type 'org.apache.shenyu.register.common.subsriber.AbstractQueueConsumerFactory'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/disruptor/ShenyuClientRegisterEventPublisher.java`
#### Snippet
```java
    public void start(final ShenyuClientRegisterRepository shenyuClientRegisterRepository) {
        RegisterClientExecutorFactory factory = new RegisterClientExecutorFactory();
        factory.addSubscribers(new ShenyuClientMetadataExecutorSubscriber(shenyuClientRegisterRepository));
        factory.addSubscribers(new ShenyuClientURIExecutorSubscriber(shenyuClientRegisterRepository));
        factory.addSubscribers(new ShenyuClientApiDocExecutorSubscriber(shenyuClientRegisterRepository));
```

### UNCHECKED_WARNING
Unchecked call to 'addSubscribers(ExecutorSubscriber)' as a member of raw type 'org.apache.shenyu.register.common.subsriber.AbstractQueueConsumerFactory'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/disruptor/ShenyuClientRegisterEventPublisher.java`
#### Snippet
```java
        RegisterClientExecutorFactory factory = new RegisterClientExecutorFactory();
        factory.addSubscribers(new ShenyuClientMetadataExecutorSubscriber(shenyuClientRegisterRepository));
        factory.addSubscribers(new ShenyuClientURIExecutorSubscriber(shenyuClientRegisterRepository));
        factory.addSubscribers(new ShenyuClientApiDocExecutorSubscriber(shenyuClientRegisterRepository));
        providerManage = new DisruptorProviderManage<>(factory);
```

### UNCHECKED_WARNING
Unchecked call to 'addSubscribers(ExecutorSubscriber)' as a member of raw type 'org.apache.shenyu.register.common.subsriber.AbstractQueueConsumerFactory'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/disruptor/ShenyuClientRegisterEventPublisher.java`
#### Snippet
```java
        factory.addSubscribers(new ShenyuClientMetadataExecutorSubscriber(shenyuClientRegisterRepository));
        factory.addSubscribers(new ShenyuClientURIExecutorSubscriber(shenyuClientRegisterRepository));
        factory.addSubscribers(new ShenyuClientApiDocExecutorSubscriber(shenyuClientRegisterRepository));
        providerManage = new DisruptorProviderManage<>(factory);
        providerManage.startup();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.shenyu.disruptor.DisruptorProviderManage' to 'org.apache.shenyu.disruptor.DisruptorProviderManage'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/disruptor/ShenyuClientRegisterEventPublisher.java`
#### Snippet
```java
        factory.addSubscribers(new ShenyuClientURIExecutorSubscriber(shenyuClientRegisterRepository));
        factory.addSubscribers(new ShenyuClientApiDocExecutorSubscriber(shenyuClientRegisterRepository));
        providerManage = new DisruptorProviderManage<>(factory);
        providerManage.startup();
    }
```

### UNCHECKED_WARNING
Unchecked call to 'DisruptorProviderManage(QueueConsumerFactory)' as a member of raw type 'org.apache.shenyu.disruptor.DisruptorProviderManage'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/disruptor/ShenyuClientRegisterEventPublisher.java`
#### Snippet
```java
        factory.addSubscribers(new ShenyuClientURIExecutorSubscriber(shenyuClientRegisterRepository));
        factory.addSubscribers(new ShenyuClientApiDocExecutorSubscriber(shenyuClientRegisterRepository));
        providerManage = new DisruptorProviderManage<>(factory);
        providerManage.startup();
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.IdentityHashMap'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
                Field field = clazz.getDeclaredField(props.getProperty("applicationShutdownHooksFieldName", "hooks"));
                field.setAccessible(true);
                hooks = (IdentityHashMap<Thread, Thread>) field.get(clazz);
            } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException ex) {
                LOG.error(ex.getMessage(), ex);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.ConcurrentHashMap' to 'java.util.Map'
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/spi/SharedThreadPoolFactory.java`
#### Snippet
```java
    private ThreadPoolExecutor defaultThreadPool;

    private final Map<RpcService, ThreadPoolExecutor> threadPoolMap = new ConcurrentHashMap();

    public SharedThreadPoolFactory() {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.LinkedBlockingQueue' to 'java.util.concurrent.BlockingQueue'
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/spi/SharedThreadPoolFactory.java`
#### Snippet
```java

                        threadPool = new ThreadPoolExecutor(corePoolSize, maxThreadPoolSize, (long) keepAliveTime,
                                TimeUnit.SECONDS, new LinkedBlockingQueue(maxQueueSize),
                                new NamedThreadFactory("service-biz-work"));
                        this.threadPoolMap.put(rpcService, threadPool);
```

### UNCHECKED_WARNING
Unchecked call to 'setDataList(List)' as a member of raw type 'org.apache.shenyu.admin.model.page.CommonPager'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/page/CommonPager.java`
#### Snippet
```java
            CommonPager commonPager = new CommonPager();
            commonPager.setPage(page);
            commonPager.setDataList(dataList);
            return commonPager;
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shenyu.register.common.subsriber.ExecutorTypeSubscriber\>' to 'org.apache.shenyu.register.common.subsriber.ExecutorTypeSubscriber'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/executor/RegisterServerConsumerExecutor.java`
#### Snippet
```java
            Map<DataType, ExecutorTypeSubscriber<DataTypeParent>> maps = getSubscribers()
                    .stream()
                    .map(e -> (ExecutorTypeSubscriber<DataTypeParent>) e)
                    .collect(Collectors.toMap(ExecutorTypeSubscriber::getType, Function.identity()));
            return new RegisterServerConsumerExecutor(maps);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.reflect.Type' to 'java.lang.Class'
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/handler/AbstractLogPluginDataHandler.java`
#### Snippet
```java
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        final Class<C> genericApiConfigClass = (Class<C>) actualTypeArguments[1];
        LOG.info("handler {} selector data:{}", pluginNamed(), GsonUtils.getGson().toJson(selectorData));
        String handleJson = selectorData.getHandle();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.reflect.Type' to 'java.lang.Class'
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/handler/AbstractLogPluginDataHandler.java`
#### Snippet
```java
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        final Class<T> globalLogConfigClass = (Class<T>) actualTypeArguments[0];
        LOG.info("handler {} Plugin data: {}", pluginNamed(), GsonUtils.getGson().toJson(pluginData));
        if (Objects.nonNull(pluginData) && Boolean.TRUE.equals(pluginData.getEnabled())) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.shenyu.plugin.base.utils.BeanHolder' to 'java.util.function.Supplier\>\>\>'
in `shenyu-plugin/shenyu-plugin-general-context/src/main/java/org/apache/shenyu/plugin/general/context/handler/GeneralContextPluginDataHandler.java`
#### Snippet
```java
public class GeneralContextPluginDataHandler implements PluginDataHandler {

    public static final Supplier<CommonHandleCache<String, Map<String, List<GeneralContextHandle>>>> CACHED_HANDLE = new BeanHolder(CommonHandleCache::new);

    @Override
```

### UNCHECKED_WARNING
Unchecked call to 'BeanHolder(Supplier)' as a member of raw type 'org.apache.shenyu.plugin.base.utils.BeanHolder'
in `shenyu-plugin/shenyu-plugin-general-context/src/main/java/org/apache/shenyu/plugin/general/context/handler/GeneralContextPluginDataHandler.java`
#### Snippet
```java
public class GeneralContextPluginDataHandler implements PluginDataHandler {

    public static final Supplier<CommonHandleCache<String, Map<String, List<GeneralContextHandle>>>> CACHED_HANDLE = new BeanHolder(CommonHandleCache::new);

    @Override
```

### UNCHECKED_WARNING
Unchecked method 'build(CacheLoader)' invocation
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/cache/ApacheDubboConfigCache.java`
#### Snippet
```java
    private ConsumerConfig consumerConfig;

    private final LoadingCache<String, ReferenceConfig<GenericService>> cache = CacheBuilder.newBuilder()
            .maximumSize(Constants.CACHE_MAX_COUNT)
            .removalListener((RemovalListener<Object, ReferenceConfig<GenericService>>) notification -> {
                ReferenceConfig<GenericService> config = notification.getValue();
                if (Objects.nonNull(config)) {
                    // After the configuration change, Dubbo destroys the instance, but does not empty it. If it is not handled,
                    // it will get NULL when reinitializing and cause a NULL pointer problem.
                    config.destroy();
                }
            })
            .build(new CacheLoader<String, ReferenceConfig<GenericService>>() {
                @Override
                @Nonnull
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'. Reason: 'jwt' has raw type, so result of getBody is erased
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/JwtPlugin.java`
#### Snippet
```java
                return null;
            }
            return (Map<String, Object>) jwt.getBody();
        }
        return null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/strategy/DefaultJwtConvertStrategy.java`
#### Snippet
```java
                if (entry.getValue() instanceof Map) {
                    deep.incrementAndGet();
                    return parse((Map<String, Object>) entry.getValue(), split, deep);
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/annotation/RequestHeaderParameterProcessor.java`
#### Snippet
```java
            ((Map<?, ?>) arg).forEach((key, value) -> {
                if (key instanceof String && value instanceof Collection) {
                    headers.put((String) key, (Collection) value);
                    shenyuRequest.setHeaders(headers);
                }
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = TreeCache.newBuilder(client, path).build();
        caches.put(path, cache);
        if (listeners != null && listeners.length > 0) {
            for (TreeCacheListener listener : listeners) {
                cache.getListenable().addListener(listener);
```

### RedundantLengthCheck
Redundant array length check
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-zookeeper/src/main/java/org/apache/shenyu/register/client/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = TreeCache.newBuilder(client, path).build();
        caches.put(path, cache);
        if (listeners != null && listeners.length > 0) {
            for (TreeCacheListener listener : listeners) {
                cache.getListenable().addListener(listener);
```

### RedundantLengthCheck
Redundant array length check
in `shenyu-sync-data-center/shenyu-sync-data-zookeeper/src/main/java/org/apache/shenyu/sync/data/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = TreeCache.newBuilder(client, path).build();
        caches.put(path, cache);
        if (listeners != null && listeners.length > 0) {
            for (TreeCacheListener listener : listeners) {
                cache.getListenable().addListener(listener);
```

### RedundantLengthCheck
Redundant array length check
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-zookeeper/src/main/java/org/apache/shenyu/register/instance/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = TreeCache.newBuilder(client, path).build();
        caches.put(path, cache);
        if (listeners != null && listeners.length > 0) {
            for (TreeCacheListener listener : listeners) {
                cache.getListenable().addListener(listener);
```

### RedundantLengthCheck
Redundant array length check
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
    private static boolean hasConstraintParameter(final Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (parameterAnnotations.length > 0) {
            for (Annotation[] annotations : parameterAnnotations) {
                for (Annotation annotation : annotations) {
```

### RedundantLengthCheck
Redundant array length check
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
    private static boolean hasConstraintParameter(final Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (parameterAnnotations.length > 0) {
            for (Annotation[] annotations : parameterAnnotations) {
                for (Annotation annotation : annotations) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ServiceInstance`
in `shenyu-plugin/shenyu-plugin-springcloud/src/main/java/org/apache/shenyu/plugin/springcloud/loadbalance/ShenyuSpringCloudServiceChooser.java`
#### Snippet
```java
     *
     * @param serviceId serviceId
     * @return {@linkplain ServiceInstance}
     */
    private List<ServiceInstance> getServiceInstance(final String serviceId) {
```

### JavadocReference
Cannot resolve symbol `ClientHttpRequest`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/support/CachedBodyOutputMessage.java`
#### Snippet
```java

/**
 * Implementation of {@link ClientHttpRequest} that saves body as a field.
 *
 * @see <a href="https://github.com/spring-cloud/spring-cloud-gateway/blob/master/spring-cloud-gateway-server/src/main/java/org/springframework/cloud/gateway/filter/factory/rewrite/CachedBodyOutputMessage.java">CachedBodyOutputMessage</a>
```

### JavadocReference
Cannot resolve symbol `Subscriber`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/utils/ResponseUtils.java`
#### Snippet
```java
     *
     * @param outputMessage CachedBodyOutputMessage
     * @param <T> the reified {@link Subscriber} type
     * @param throwable     Throwable
     * @return Mono.
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/AbstractShenyuPlugin.java`
#### Snippet
```java
     * this is Template Method child has Implement your own logic.
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param selector selector    {@linkplain SelectorData}
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/AbstractShenyuPlugin.java`
#### Snippet
```java
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param selector selector    {@linkplain SelectorData}
     * @param rule     rule    {@linkplain RuleData}
```

### JavadocReference
Cannot resolve symbol `org.springframework.web.util.pattern.PathPattern`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/condition/judge/PathPatternPredicateJudge.java`
#### Snippet
```java

/**
 * 1. it used {@linkplain org.springframework.web.util.pattern.PathPattern}
 * 2. not support '/api / ** /xxx'.
 * 3. better performance than {@linkplain org.springframework.util.AntPathMatcher}
```

### JavadocReference
Cannot resolve symbol `org.springframework.util.AntPathMatcher`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/condition/judge/PathPatternPredicateJudge.java`
#### Snippet
```java
 * 1. it used {@linkplain org.springframework.web.util.pattern.PathPattern}
 * 2. not support '/api / ** /xxx'.
 * 3. better performance than {@linkplain org.springframework.util.AntPathMatcher}
 * Path pattern predicate judge.
 */
```

### JavadocReference
Cannot resolve symbol `org.springframework.util.AntPathMatcher`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/trie/ShenyuTrie.java`
#### Snippet
```java
     * @param ruleData rule data
     * @param bizInfo biz info
     * @see org.springframework.util.AntPathMatcher
     * @see org.springframework.web.util.pattern.PathPattern
     */
```

### JavadocReference
Cannot resolve symbol `org.springframework.web.util.pattern.PathPattern`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/trie/ShenyuTrie.java`
#### Snippet
```java
     * @param bizInfo biz info
     * @see org.springframework.util.AntPathMatcher
     * @see org.springframework.web.util.pattern.PathPattern
     */
    public void putNode(final String uriPath, final RuleData ruleData, final Object bizInfo) {
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/condition/strategy/MatchStrategy.java`
#### Snippet
```java
     *
     * @param conditionDataList condition list.
     * @param exchange          {@linkplain ServerWebExchange}
     * @return true is match , false is not match.
     */
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-ratelimiter/src/main/java/org/apache/shenyu/plugin/ratelimiter/resolver/RateLimiterKeyResolver.java`
#### Snippet
```java
     * resolve.
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @return rate limiter key
     */
```

### JavadocReference
Cannot resolve symbol `DispatcherHandler`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-gateway/src/main/java/org/apache/shenyu/springboot/starter/gateway/ShenyuConfiguration.java`
#### Snippet
```java
     * init dispatch handler.
     *
     * @return {@link DispatcherHandler}.
     */
    @Bean("dispatcherHandler")
```

### JavadocReference
Cannot resolve symbol `MediaType`
in `shenyu-plugin/shenyu-plugin-response/src/main/java/org/apache/shenyu/plugin/response/strategy/NettyClientMessageWriter.java`
#### Snippet
```java
     * stream media type: from APPLICATION_STREAM_JSON upgrade to APPLICATION_STREAM_JSON_VALUE.
     * Both of the above have expired.
     * latest version: {@linkplain MediaType#APPLICATION_NDJSON}
     */
    private final List<MediaType> streamingMediaTypes = Arrays.asList(MediaType.TEXT_EVENT_STREAM, MediaType.APPLICATION_NDJSON);
```

### JavadocReference
Cannot resolve symbol `APPLICATION_NDJSON`
in `shenyu-plugin/shenyu-plugin-response/src/main/java/org/apache/shenyu/plugin/response/strategy/NettyClientMessageWriter.java`
#### Snippet
```java
     * stream media type: from APPLICATION_STREAM_JSON upgrade to APPLICATION_STREAM_JSON_VALUE.
     * Both of the above have expired.
     * latest version: {@linkplain MediaType#APPLICATION_NDJSON}
     */
    private final List<MediaType> streamingMediaTypes = Arrays.asList(MediaType.TEXT_EVENT_STREAM, MediaType.APPLICATION_NDJSON);
```

### JavadocReference
Cannot resolve symbol `BeanDefinition`
in `shenyu-plugin/shenyu-plugin-api/src/main/java/org/apache/shenyu/plugin/api/utils/SpringBeanUtils.java`
#### Snippet
```java
    /**
     * Exist spring bean boolean.
     * Only applies to successful beans registered by the {@linkplain #registerBean(BeanDefinition, ClassLoader)} method.
     *
     * @param className the class name
```

### JavadocReference
Cannot resolve symbol `ServletResponse`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/bean/StatelessAuthFilter.java`
#### Snippet
```java
     * add cors.
     *
     * @param response {@link ServletResponse}
     */
    private void wrapCorsResponse(final HttpServletResponse response) {
```

### JavadocReference
Cannot resolve symbol `ServletResponse`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/bean/StatelessAuthFilter.java`
#### Snippet
```java
     * union response same result form exception.
     *
     * @param response {@link ServletResponse}
     */
    private void unionFailResponse(final ServletResponse response) throws IOException {
```

### JavadocReference
Cannot resolve symbol `LifecycleBeanPostProcessor`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/config/ShiroConfiguration.java`
#### Snippet
```java
     * shiro's lifecycle in spring.
     *
     * @return {@linkplain LifecycleBeanPostProcessor}
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `DefaultWebSecurityManager`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/config/ShiroConfiguration.java`
#### Snippet
```java
     * AuthorizationAttributeSourceAdvisor.
     *
     * @param securityManager {@linkplain DefaultWebSecurityManager}
     * @return {@linkplain AuthorizationAttributeSourceAdvisor}
     */
```

### JavadocReference
Cannot resolve symbol `AuthorizationAttributeSourceAdvisor`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/config/ShiroConfiguration.java`
#### Snippet
```java
     *
     * @param securityManager {@linkplain DefaultWebSecurityManager}
     * @return {@linkplain AuthorizationAttributeSourceAdvisor}
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `DefaultWebSecurityManager`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/config/ShiroConfiguration.java`
#### Snippet
```java
     * ShiroFilterFactoryBean.
     *
     * @param securityManager {@linkplain DefaultWebSecurityManager}
     * @param shiroProperties {@linkplain ShiroProperties}
     * @return {@linkplain ShiroFilterFactoryBean}
```

### JavadocReference
Cannot resolve symbol `ShiroFilterFactoryBean`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/config/ShiroConfiguration.java`
#### Snippet
```java
     * @param securityManager {@linkplain DefaultWebSecurityManager}
     * @param shiroProperties {@linkplain ShiroProperties}
     * @return {@linkplain ShiroFilterFactoryBean}
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `DefaultWebSecurityManager`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/config/ShiroConfiguration.java`
#### Snippet
```java
     *
     * @param shiroRealm shiro's realm
     * @return {@linkplain DefaultWebSecurityManager}
     */
    @Bean("shiroSecurityManager")
```

### JavadocReference
Cannot resolve symbol `ProceedingJoinPoint`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/aspect/DataPermissionAspect.java`
#### Snippet
```java
     * Organize SQL parameters with data permissions.
     *
     * @param point {@link ProceedingJoinPoint}
     * @return args {@link List}
     */
```

### JavadocReference
Cannot resolve symbol `ProceedingJoinPoint`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/aspect/DataPermissionAspect.java`
#### Snippet
```java
     * Real method processing around.
     *
     * @param point point {@link ProceedingJoinPoint}
     * @return result {@link Object}
     */
```

### JavadocReference
Cannot resolve symbol `ProceedingJoinPoint`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/aspect/PageableAspect.java`
#### Snippet
```java
     * mapper processing around.
     *
     * @param point point {@link ProceedingJoinPoint}
     * @return result {@link Object}
     */
```

### JavadocReference
Cannot resolve symbol `ProceedingJoinPoint`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/aspect/controller/RestControllerAspect.java`
#### Snippet
```java
     * controller.
     *
     * @param point point {@link ProceedingJoinPoint}
     * @return result {@link Object}
     */
```

### JavadocReference
Cannot resolve symbol `DatabaseIdProvider`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataBaseConfiguration.java`
#### Snippet
```java
     * Database dialect configuration.
     *
     * @return {@linkplain DatabaseIdProvider}
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `LdapContextSource`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/LdapConfiguration.java`
#### Snippet
```java
     *
     * @param ldapProp the ldap configuration
     * @return LdapContextSource {@linkplain LdapContextSource}
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `LdapTemplate`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/LdapConfiguration.java`
#### Snippet
```java
     *
     * @param ldapContextSource the ldap context source
     * @return LdapTemplate {@linkplain LdapTemplate}
     */
    @Bean
```

### JavadocReference
Cannot resolve symbol `org.springframework.context.event.ContextRefreshedEvent`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/UpstreamCheckService.java`
#### Snippet
```java
     * <p>Note: This is to be compatible with older versions of clients
     * that do not register with the gateway by listening to
     * {@link org.springframework.context.event.ContextRefreshedEvent},
     * which will cause some problems,
     * check <a href="https://github.com/apache/shenyu/issues/3484">...</a> for more details.
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.collections4.map.LRUMap`
in `shenyu-common/src/main/java/org/apache/shenyu/common/cache/MemorySafeLRUMap.java`
#### Snippet
```java

/**
 * The only difference between this class and {@link org.apache.commons.collections4.map.LRUMap}
 * is that it handles memory issues via {@link org.apache.shenyu.common.concurrent.MemoryLimitCalculator}.
 *
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#method}.
     *
     * @return the RequestMethod[]
```

### JavadocReference
Cannot resolve symbol `method`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#method}.
     *
     * @return the RequestMethod[]
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#consumes}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `consumes`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#consumes}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#produces}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `produces`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#produces}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#value}, {@link ShenyuSpringCloudClient#value}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `value`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#value}, {@link ShenyuSpringCloudClient#value}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#headers}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `headers`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#headers}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#params}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `params`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#params}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#path}, {@link ShenyuSpringCloudClient#path}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `path`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#path}, {@link ShenyuSpringCloudClient#path}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `ServerHttpRequest`
in `shenyu-web/src/main/java/org/apache/shenyu/web/forward/ForwardedRemoteAddressResolver.java`
#### Snippet
```java
 * Parses the client address from the X-Forwarded-For header. If header is not present.
 * falls back to {@link RemoteAddressResolver} and
 * {@link ServerHttpRequest#getRemoteAddress()}. Use the static constructor methods which
 * meets your security requirements.
 */
```

### JavadocReference
Cannot resolve symbol `getRemoteAddress()`
in `shenyu-web/src/main/java/org/apache/shenyu/web/forward/ForwardedRemoteAddressResolver.java`
#### Snippet
```java
 * Parses the client address from the X-Forwarded-For header. If header is not present.
 * falls back to {@link RemoteAddressResolver} and
 * {@link ServerHttpRequest#getRemoteAddress()}. Use the static constructor methods which
 * meets your security requirements.
 */
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/AlibabaDubboPlugin.java`
#### Snippet
```java
     * do dubbo invoker.
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param selector selector    {@linkplain SelectorData}
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/AlibabaDubboPlugin.java`
#### Snippet
```java
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param selector selector    {@linkplain SelectorData}
     * @param rule     rule    {@linkplain RuleData}
```

### JavadocReference
Cannot resolve symbol `StandardEvaluationContext`
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/StandardExpressionGenerator.java`
#### Snippet
```java
 * Insecure support for SPEL parsed implementations.
 *
 * @see StandardEvaluationContext
 * @see SpelExpressionParser
 */
```

### JavadocReference
Cannot resolve symbol `SpelExpressionParser`
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/StandardExpressionGenerator.java`
#### Snippet
```java
 *
 * @see StandardEvaluationContext
 * @see SpelExpressionParser
 */
@Join
```

### JavadocReference
Cannot resolve symbol `SimpleEvaluationContext`
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/ExpressionGenerator.java`
#### Snippet
```java
 * The simplified version of the SEPL parsing implementation does not support write function execution.
 *
 * @see SimpleEvaluationContext
 * @see DataBindingPropertyAccessor#forReadOnlyAccess()
 */
```

### JavadocReference
Cannot resolve symbol `DataBindingPropertyAccessor`
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/ExpressionGenerator.java`
#### Snippet
```java
 *
 * @see SimpleEvaluationContext
 * @see DataBindingPropertyAccessor#forReadOnlyAccess()
 */
@Join
```

### JavadocReference
Cannot resolve symbol `forReadOnlyAccess()`
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/ExpressionGenerator.java`
#### Snippet
```java
 *
 * @see SimpleEvaluationContext
 * @see DataBindingPropertyAccessor#forReadOnlyAccess()
 */
@Join
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-dubbo-common/src/main/java/org/apache/shenyu/plugin/dubbo/common/AbstractDubboPlugin.java`
#### Snippet
```java
     * this is Template Method child has Implement your own logic.
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param selector selector    {@linkplain SelectorData}
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-dubbo-common/src/main/java/org/apache/shenyu/plugin/dubbo/common/AbstractDubboPlugin.java`
#### Snippet
```java
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param selector selector    {@linkplain SelectorData}
     * @param rule     rule    {@linkplain RuleData}
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-dubbo-common/src/main/java/org/apache/shenyu/plugin/dubbo/common/AbstractDubboPlugin.java`
#### Snippet
```java
     * do dubbo invoker.
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param selector selector    {@linkplain SelectorData}
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-dubbo-common/src/main/java/org/apache/shenyu/plugin/dubbo/common/AbstractDubboPlugin.java`
#### Snippet
```java
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param selector selector    {@linkplain SelectorData}
     * @param rule     rule    {@linkplain RuleData}
```

### JavadocReference
Cannot resolve symbol `DispatcherHandler`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-redirect/src/main/java/org/apache/shenyu/springboot/starter/plugin/redirect/RedirectPluginConfiguration.java`
#### Snippet
```java
     * Redirect plugin.
     *
     * @param dispatcherHandler {@link DispatcherHandler}
     * @return the shenyu plugin
     */
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#cache()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `cache()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#cache()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#interfaceClass()}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `interfaceClass()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#interfaceClass()}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#delay()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `delay()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#delay()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#provider()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `provider()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#provider()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#registry()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `registry()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#registry()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#module()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `module()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#module()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#application()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `application()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#application()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#loadbalance()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `loadbalance()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#loadbalance()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#protocol()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `protocol()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#protocol()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#actives()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `actives()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#actives()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#monitor()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `monitor()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#monitor()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#deprecated()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `deprecated()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#deprecated()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#group()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `group()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#group()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#register()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `register()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#register()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#timeout()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `timeout()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#timeout()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#executes()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `executes()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#executes()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#parameters()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `parameters()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#parameters()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#methods()} .
     *
     * @return the Method[]
```

### JavadocReference
Cannot resolve symbol `methods()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#methods()} .
     *
     * @return the Method[]
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#listener()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `listener()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#listener()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#export()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `export()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#export()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#path()}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `path()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#path()}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#interfaceName()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `interfaceName()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#interfaceName()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#callbacks()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `callbacks()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#callbacks()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#tag()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `tag()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#tag()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#version()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `version()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#version()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#stub()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `stub()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#stub()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#sent()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `sent()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#sent()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#validation()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `validation()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#validation()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#proxy()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `proxy()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#proxy()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#ondisconnect()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `ondisconnect()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#ondisconnect()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#local()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `local()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#local()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#onconnect()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `onconnect()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#onconnect()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#filter()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `filter()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#filter()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     *Alias for {@link Service#retries()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `retries()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     *Alias for {@link Service#retries()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#mock()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `mock()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#mock()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#connections()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `connections()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#connections()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#cluster()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `cluster()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#cluster()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#weight()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `weight()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#weight()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#accesslog()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `accesslog()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#accesslog()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#layer()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `layer()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#layer()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#owner()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `owner()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#owner()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#dynamic()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `dynamic()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#dynamic()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#token()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `token()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#token()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#async()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `async()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#async()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `Service`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#document()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `document()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuService.java`
#### Snippet
```java

    /**
     * Alias for {@link Service#document()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#stub()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `stub()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#stub()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#document()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `document()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#document()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#interfaceClass()}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `interfaceClass()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#interfaceClass()}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     *Alias for {@link DubboService#retries()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `retries()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     *Alias for {@link DubboService#retries()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#dynamic()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `dynamic()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#dynamic()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#cache()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `cache()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#cache()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#sent()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `sent()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#sent()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#loadbalance()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `loadbalance()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#loadbalance()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#export()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `export()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#export()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#delay()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `delay()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#delay()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#mock()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `mock()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#mock()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#tag()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `tag()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#tag()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#interfaceName()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `interfaceName()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#interfaceName()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#connections()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `connections()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#connections()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#proxy()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `proxy()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#proxy()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#version()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `version()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#version()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#methods()} .
     *
     * @return the Method[]
```

### JavadocReference
Cannot resolve symbol `methods()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#methods()} .
     *
     * @return the Method[]
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#register()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `register()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#register()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#registry()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `registry()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#registry()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#cluster()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `cluster()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#cluster()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#module()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `module()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#module()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#token()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `token()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#token()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#group()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `group()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#group()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#weight()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `weight()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#weight()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#async()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `async()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#async()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#executes()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `executes()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#executes()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#provider()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `provider()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#provider()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#accesslog()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `accesslog()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#accesslog()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#owner()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `owner()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#owner()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#validation()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `validation()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#validation()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#parameters()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `parameters()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#parameters()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#layer()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `layer()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#layer()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#local()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `local()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#local()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#monitor()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `monitor()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#monitor()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#filter()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `filter()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#filter()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#application()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `application()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#application()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#ondisconnect()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `ondisconnect()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#ondisconnect()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#callbacks()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `callbacks()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#callbacks()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#actives()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `actives()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#actives()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#protocol()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `protocol()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#protocol()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#listener()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `listener()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#listener()} .
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#onconnect()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `onconnect()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#onconnect()} .
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#deprecated()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `deprecated()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#deprecated()} .
     *
     * @return the boolean
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#timeout()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `timeout()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#timeout()} .
     *
     * @return the int
```

### JavadocReference
Cannot resolve symbol `DubboService`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#path()}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `path()`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/annotation/ShenyuDubboService.java`
#### Snippet
```java

    /**
     * Alias for {@link DubboService#path()}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/ApacheDubboPlugin.java`
#### Snippet
```java
     * do dubbo invoker.
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param metaData the medata
```

### JavadocReference
Cannot resolve symbol `ServerWebExchange`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/ApacheDubboPlugin.java`
#### Snippet
```java
     *
     * @param exchange exchange the current server exchange {@linkplain ServerWebExchange}
     * @param chain    chain the current chain  {@linkplain ServerWebExchange}
     * @param metaData the medata
     * @param param    the param
```

### JavadocReference
Cannot resolve symbol `org.springframework.boot.autoconfigure.security.oauth2.client.ClientsConfiguredCondition`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-oauth2/src/main/java/org/apache/shenyu/springboot/starter/plugin/oauth2/DefaultClientsConfiguredCondition.java`
#### Snippet
```java
 * if not spring oauth2's config in .yml file, use default java config, else use spring config.
 *
 * @see org.springframework.boot.autoconfigure.security.oauth2.client.ClientsConfiguredCondition
 */
public class DefaultClientsConfiguredCondition extends SpringBootCondition {
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#path}, {@link ShenyuSpringMvcClient#path}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `path`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#path}, {@link ShenyuSpringMvcClient#path}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#method}.
     *
     * @return the RequestMethod[]
```

### JavadocReference
Cannot resolve symbol `method`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#method}.
     *
     * @return the RequestMethod[]
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#consumes}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `consumes`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#consumes}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#params}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `params`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#params}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#headers}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `headers`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#headers}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#value}, {@link ShenyuSpringMvcClient#value}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `value`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#value}, {@link ShenyuSpringMvcClient#value}.
     *
     * @return the string
```

### JavadocReference
Cannot resolve symbol `RequestMapping`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#produces}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `produces`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/annotation/ShenyuRequestMapping.java`
#### Snippet
```java

    /**
     * Alias for {@link RequestMapping#produces}.
     *
     * @return the string[]
```

### JavadocReference
Cannot resolve symbol `org.springframework.context.annotation.Configuration`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/EnableShenyuClients.java`
#### Snippet
```java
 * {@link ShenyuClient} <code>@ShenyuClient</code>).
 * Configures component scanning directives for use with
 * {@link org.springframework.context.annotation.Configuration}
 * <code>@Configuration</code> classes.
 */
```

### JavadocReference
Cannot resolve symbol `RequestBody`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/annotation/RequestBodyParameterProcessor.java`
#### Snippet
```java

/**
 * {@link RequestBody} parameter processor.
 */
public class RequestBodyParameterProcessor implements AnnotatedParameterProcessor {
```

### JavadocReference
Cannot resolve symbol `RequestHeader`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/annotation/RequestHeaderParameterProcessor.java`
#### Snippet
```java

/**
 * {@link RequestHeader} parameter processor.
 */
public class RequestHeaderParameterProcessor implements AnnotatedParameterProcessor {
```

### JavadocReference
Cannot resolve symbol `RequestParam`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/annotation/RequestParamParameterProcessor.java`
#### Snippet
```java

/**
 * {@link RequestParam} parameter processor.
 */
public class RequestParamParameterProcessor implements AnnotatedParameterProcessor {
```

### JavadocReference
Cannot resolve symbol `PathVariable`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/annotation/PathVariableParameterProcessor.java`
#### Snippet
```java

/**
 * {@link PathVariable} parameter processor.
 */
public class PathVariableParameterProcessor implements AnnotatedParameterProcessor {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `shenyu-common/src/main/java/org/apache/shenyu/common/enums/RuleTrieEventEnum.java`
#### Snippet
```java
     * Shenyu Trie remove event.
     */
    REMOVE;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `shenyu-common/src/main/java/org/apache/shenyu/common/enums/PluginHandlerEventEnum.java`
#### Snippet
```java
     * plugin sorted.
     */
    SORTED;
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `addEndpoint` may produce `NullPointerException`
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/ShenyuServerEndpointerExporter.java`
#### Snippet
```java
            }

            serverContainer.addEndpoint(endpointConfig);
        } catch (DeploymentException ex) {
            throw new IllegalStateException("Failed to register ServerEndpointConfig: " + endpointConfig, ex);
```

### DataFlowIssue
Method invocation `iterator` may produce `NullPointerException`
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
        }

        return keyValues.iterator().next().getValue().toString(UTF_8);
    }

```

### DataFlowIssue
Condition `t instanceof HttpStatusCodeException` is redundant and can be replaced with a null check
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/fallback/FallbackHandler.java`
#### Snippet
```java
    default Mono<Void> fallback(ServerWebExchange exchange, URI uri, Throwable t) {
        // client HttpStatusCodeException, return the client response directly
        if (t instanceof HttpStatusCodeException || Objects.isNull(uri)) {
            return withoutFallback(exchange, t);
        } 
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/trie/ShenyuTrie.java`
#### Snippet
```java
            // synchronized list
            synchronized (ruleData.getId()) {
                ruleDataList.add(ruleData);
                ruleDataList.sort(Comparator.comparing(RuleData::getSort));
                node.getPathRuleCache().put(ruleData.getSelectorId(), ruleDataList);
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
                .post(body)
                .build();
        return client.newCall(request).execute().body().string();
    }

```

### DataFlowIssue
Method invocation `newBuilder` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
    public String get(final String url, final String userName, final String passWord) throws IOException {
        Request.Builder reqBuild = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        urlBuilder.addQueryParameter(Constants.USER_NAME, userName);
        urlBuilder.addQueryParameter(Constants.PASS_WORD, passWord);
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
        reqBuild.url(urlBuilder.build());
        Request request = reqBuild.build();
        return client.newCall(request).execute().body().string();
    }

```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
                .post(body)
                .build();
        return client.newCall(request).execute().body().string();
    }

```

### DataFlowIssue
Method invocation `newBuilder` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
    public String get(final String url, final Map<String, Object> query) throws IOException {
        Request.Builder reqBuild = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        query.forEach((K, V) -> urlBuilder.addQueryParameter(K, String.valueOf(V)));
        reqBuild.url(urlBuilder.build());
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
        reqBuild.url(urlBuilder.build());
        Request request = reqBuild.build();
        return client.newCall(request).execute().body().string();
    }

```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
            .newCall(request)
            .execute()) {
            return response.body().string();
        }
    }
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
        Request request = builder.build();
        Response response = httpClient.newCall(request).execute();
        return response.body().string();
    }

```

### DataFlowIssue
Method invocation `newBuilder` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
     */
    public static HttpUrl buildHttpUrl(final String url, final Map<String, ?> form) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        if (Objects.nonNull(form) && !form.isEmpty()) {
            for (Map.Entry<String, ?> entry : form.entrySet()) {
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
            .newCall(request)
            .execute()) {
            return response.body().string();
        }
    }
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
    public String requestFileString(final String url, final Map<String, ?> form, final Map<String, String> header,
        final List<UploadFile> files) throws IOException {
        return requestFile(url, form, header, files).body().string();
    }

```

### DataFlowIssue
Method invocation `getLoginField` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DashboardUserServiceImpl.java`
#### Snippet
```java
    private DashboardUserVO loginByLdap(final String userName, final String password) {
        Assert.notNull(ldapProperties, "ldap config is not enable");
        String searchBase = String.format("%s=%s,%s", ldapProperties.getLoginField(), LdapEncoder.nameEncode(userName), ldapProperties.getBaseDn());
        String filter = String.format("(objectClass=%s)", ldapProperties.getObjectClass());
        try {
```

### DataFlowIssue
Condition `throwable instanceof ResponseStatusException` is redundant and can be replaced with a null check
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/body/LoggingServerHttpResponse.java`
#### Snippet
```java
    public void logError(final Throwable throwable) {
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        if (throwable instanceof ResponseStatusException) {
            httpStatus = ((ResponseStatusException) throwable).getStatus();
        }
```

### DataFlowIssue
Argument `appAuthData` might be null
in `shenyu-plugin/shenyu-plugin-sign/src/main/java/org/apache/shenyu/plugin/sign/service/ComposableSignService.java`
#### Snippet
```java

        if (result.isSuccess()) {
            handleExchange(exchange, appAuthData, shenyuContext.getContextPath());
        }

```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `shenyu-plugin/shenyu-plugin-httpclient/src/main/java/org/apache/shenyu/plugin/httpclient/NettyHttpClientPlugin.java`
#### Snippet
```java
                        response.setRawStatusCode(res.status().code());
                    } else {
                        throw new IllegalStateException("Unable to set status code on response: " + res.status().code() + ", " + response.getClass());
                    }
                    response.getHeaders().putAll(headers);
```

### DataFlowIssue
Condition `exception instanceof GenericException` is redundant and can be replaced with a null check
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/proxy/ApacheDubboProxyService.java`
#### Snippet
```java
            exchange.getAttributes().put(Constants.CLIENT_RESPONSE_RESULT_TYPE, ResultEnum.SUCCESS.getName());
            return ret;
        })).onErrorMap(exception -> exception instanceof GenericException ? new ShenyuException(((GenericException) exception).getExceptionMessage()) : new ShenyuException(exception));
    }
    
```

### DataFlowIssue
Argument `values` might be null
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/support/SpringMvcContract.java`
#### Snippet
```java
        Assert.state(values != null && (values.length == 0 || values.length == 1),
                String.format("Method %s can only contain at most 1 %s field. Found: %s",
                        method.getName(), fieldName, Arrays.asList(values)));
    }

```

### DataFlowIssue
Condition `RequestMapping.class.isInstance(methodAnnotation)` is redundant and can be replaced with a null check
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/support/SpringMvcContract.java`
#### Snippet
```java
                                             final Method method, final ShenyuClientFactoryBean shenyuClientFactoryBean) {

        if (!RequestMapping.class.isInstance(methodAnnotation)
                && !methodAnnotation.annotationType().isAnnotationPresent(RequestMapping.class)) {
            return;
```

### DataFlowIssue
Method invocation `annotationType` will produce `NullPointerException`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/support/SpringMvcContract.java`
#### Snippet
```java

        if (!RequestMapping.class.isInstance(methodAnnotation)
                && !methodAnnotation.annotationType().isAnnotationPresent(RequestMapping.class)) {
            return;
        }
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with '.keySet().stream()'
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
        return map.entrySet().stream()
                .filter(e -> e.getKey().contains(prefix))
                .map(e -> getSubNodeKeyName(prefix, e.getKey(), separator))
                .distinct()
                .filter(e -> Objects.nonNull(e))
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java
        }
        List<String> subTagIds = relationMap.get(id);
        subTagIds.stream().forEach(tagId -> {
            TagDO tagDO = allData.get(tagId);
            tagDO.setExt(buildExtParamByParentTag(allData.get(id)));
```

## RuleId[id=SpringBootApplicationProperties]
### SpringBootApplicationProperties
Cannot resolve configuration property 'dubbo.registry.address'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java
# limitations under the License.

dubbo.registry.address=zookeeper://localhost:2181

# more see shenyu-register-center module
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.register-type'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java

# more see shenyu-register-center module
shenyu.register.register-type=http
shenyu.register.serverLists=http://localhost:9095
shenyu.register.props.username=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.serverLists'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java
# more see shenyu-register-center module
shenyu.register.register-type=http
shenyu.register.serverLists=http://localhost:9095
shenyu.register.props.username=admin
shenyu.register.props.password=123456
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props.username'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.register-type=http
shenyu.register.serverLists=http://localhost:9095
shenyu.register.props.username=admin
shenyu.register.props.password=123456

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props.password'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.serverLists=http://localhost:9095
shenyu.register.props.username=admin
shenyu.register.props.password=123456

# more see org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook.TakeoverOtherHooksThread.class
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props\[shutdownWaitTime\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java

# more see org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook.TakeoverOtherHooksThread.class
shenyu.register.props[shutdownWaitTime]=3000
shenyu.register.props[delayOtherHooksExecTime]=2000
shenyu.register.props[applicationShutdownHooksClassName]=java.lang.ApplicationShutdownHooks
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props\[delayOtherHooksExecTime\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java
# more see org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook.TakeoverOtherHooksThread.class
shenyu.register.props[shutdownWaitTime]=3000
shenyu.register.props[delayOtherHooksExecTime]=2000
shenyu.register.props[applicationShutdownHooksClassName]=java.lang.ApplicationShutdownHooks
shenyu.register.props[applicationShutdownHooksFieldName]=hooks
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props\[applicationShutdownHooksClassName\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.props[shutdownWaitTime]=3000
shenyu.register.props[delayOtherHooksExecTime]=2000
shenyu.register.props[applicationShutdownHooksClassName]=java.lang.ApplicationShutdownHooks
shenyu.register.props[applicationShutdownHooksFieldName]=hooks

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props\[applicationShutdownHooksFieldName\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.props[delayOtherHooksExecTime]=2000
shenyu.register.props[applicationShutdownHooksClassName]=java.lang.ApplicationShutdownHooks
shenyu.register.props[applicationShutdownHooksFieldName]=hooks

shenyu.client.dubbo.props[contextPath]=/dubbo
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.client.dubbo.props\[contextPath\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.props[applicationShutdownHooksFieldName]=hooks

shenyu.client.dubbo.props[contextPath]=/dubbo
shenyu.client.dubbo.props[appName]=alibaba-dubbo

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.client.dubbo.props\[appName\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-alibaba-dubbo/src/test/resources/application.properties`
#### Snippet
```java

shenyu.client.dubbo.props[contextPath]=/dubbo
shenyu.client.dubbo.props[appName]=alibaba-dubbo

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'dubbo.registry.address'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
# limitations under the License.

dubbo.registry.address=zookeeper://localhost:2181

# more see shenyu-register-center module
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.register-type'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java

# more see shenyu-register-center module
shenyu.register.register-type=http
shenyu.register.serverLists=http://localhost:9095
shenyu.register.props.username=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.serverLists'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
# more see shenyu-register-center module
shenyu.register.register-type=http
shenyu.register.serverLists=http://localhost:9095
shenyu.register.props.username=admin
shenyu.register.props.password=123456
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props.username'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.register-type=http
shenyu.register.serverLists=http://localhost:9095
shenyu.register.props.username=admin
shenyu.register.props.password=123456

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props.password'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.serverLists=http://localhost:9095
shenyu.register.props.username=admin
shenyu.register.props.password=123456

# more see org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook.TakeoverOtherHooksThread.class
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props\[shutdownWaitTime\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java

# more see org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook.TakeoverOtherHooksThread.class
shenyu.register.props[shutdownWaitTime]=3000
shenyu.register.props[delayOtherHooksExecTime]=2000
shenyu.register.props[applicationShutdownHooksClassName]=java.lang.ApplicationShutdownHooks
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props\[delayOtherHooksExecTime\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
# more see org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook.TakeoverOtherHooksThread.class
shenyu.register.props[shutdownWaitTime]=3000
shenyu.register.props[delayOtherHooksExecTime]=2000
shenyu.register.props[applicationShutdownHooksClassName]=java.lang.ApplicationShutdownHooks
shenyu.register.props[applicationShutdownHooksFieldName]=hooks
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props\[applicationShutdownHooksClassName\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.props[shutdownWaitTime]=3000
shenyu.register.props[delayOtherHooksExecTime]=2000
shenyu.register.props[applicationShutdownHooksClassName]=java.lang.ApplicationShutdownHooks
shenyu.register.props[applicationShutdownHooksFieldName]=hooks

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.register.props\[applicationShutdownHooksFieldName\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.props[delayOtherHooksExecTime]=2000
shenyu.register.props[applicationShutdownHooksClassName]=java.lang.ApplicationShutdownHooks
shenyu.register.props[applicationShutdownHooksFieldName]=hooks

shenyu.client.dubbo.props[contextPath]=/dubbo
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.client.dubbo.props\[contextPath\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.register.props[applicationShutdownHooksFieldName]=hooks

shenyu.client.dubbo.props[contextPath]=/dubbo
shenyu.client.dubbo.props[appName]=apache-dubbo
shenyu.client.dubbo.props[host]=localhost
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.client.dubbo.props\[appName\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java

shenyu.client.dubbo.props[contextPath]=/dubbo
shenyu.client.dubbo.props[appName]=apache-dubbo
shenyu.client.dubbo.props[host]=localhost
shenyu.client.dubbo.props[port]=20888
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.client.dubbo.props\[host\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.client.dubbo.props[contextPath]=/dubbo
shenyu.client.dubbo.props[appName]=apache-dubbo
shenyu.client.dubbo.props[host]=localhost
shenyu.client.dubbo.props[port]=20888

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'shenyu.client.dubbo.props\[port\]'
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-client/shenyu-spring-boot-starter-client-apache-dubbo/src/test/resources/application.properties`
#### Snippet
```java
shenyu.client.dubbo.props[appName]=apache-dubbo
shenyu.client.dubbo.props[host]=localhost
shenyu.client.dubbo.props[port]=20888

```

## RuleId[id=RequiredBeanTypeInspection]
### RequiredBeanTypeInspection
Cannot resolve required base class 'org.springframework.web.accept.ContentNegotiationManager'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
    <context:component-scan base-package="org.apache.shenyu.examples.springmvc.controller"/>

    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
        <mvc:message-converters register-defaults="false">
            <bean class="org.springframework.http.converter.StringHttpMessageConverter">
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboTestService'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboTestService'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboMultiParamService'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboClassTestService'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class 'DubboClassMultiParamService'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-alibaba-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboMultiParamService'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class 'DubboClassTestService'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboClassMultiParamService'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboTestService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class 'DubboMultiParamService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.2"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.2"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ApacheDubboServiceBeanListener'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'common'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ShenyuRegisterCenterConfig'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboTestService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="20888"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboMultiParamService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboClassTestService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve property 'registerType'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve property 'serverLists'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
            <props>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve property 'props'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
            <props>
                <prop key="username">admin</prop>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboClassMultiParamService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-alibaba-dubbo-service/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService" version="v0.0.1"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService" version="v0.0.1"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'common'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class 'ClientPropertiesConfig'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve property 'props'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
                <entry key="contextPath" value="/dubbo"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'http'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'HttpClientRegisterRepository'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'core'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shutdown'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ShenyuClientShutdownHook'
in `shenyu-examples/shenyu-examples-sdk/shenyu-examples-sdk-dubbo/shenyu-examples-sdk-apache-dubbo-provider/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboTestService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:protocol name="dubbo" port="${dubbo.registry.port}"/>

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboMultiParamService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java

    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class 'DubboClassTestService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboTestService" ref="dubboTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'examples'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'api'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'service'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class 'DubboClassMultiParamService'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/spring-dubbo.xml`
#### Snippet
```java
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboMultiParamService" ref="dubboMultiParamService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassTestService" ref="dubboClassTestService"/>
    <dubbo:service timeout="10000" interface="org.apache.shenyu.examples.dubbo.api.service.DubboClassMultiParamService" ref="dubboClassMultiParamService"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'dubbo'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ApacheDubboServiceBeanListener'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "apacheDubboServiceBeanListener" class="org.apache.shenyu.client.apache.dubbo.ApacheDubboServiceBeanListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'common'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ShenyuRegisterCenterConfig'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve property 'registerType'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
```

### SpringXmlModelInspection
Cannot resolve property 'serverLists'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
            <props>
```

### SpringXmlModelInspection
Cannot resolve property 'props'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
            <props>
                <prop key="username">admin</prop>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'common'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class 'ClientPropertiesConfig'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve property 'props'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
                <entry key="contextPath" value="/dubbo"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'http'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'HttpClientRegisterRepository'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'core'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shutdown'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ShenyuClientShutdownHook'
in `shenyu-examples/shenyu-examples-dubbo/shenyu-examples-apache-dubbo-service-xml/src/main/resources/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    
    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    
    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    
    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'springmvc'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    
    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'init'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    
    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class 'SpringMvcClientEventListener'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    
    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'common'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ShenyuRegisterCenterConfig'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve property 'registerType'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
```

### SpringXmlModelInspection
Cannot resolve property 'serverLists'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve property 'props'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
            <map>
                <entry key="username" value="admin"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'common'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class 'ClientPropertiesConfig'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve property 'props'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
                <entry key="contextPath" value="/mvc"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'http'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'HttpClientRegisterRepository'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'core'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shutdown'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ShenyuClientShutdownHook'
in `shenyu-examples/shenyu-examples-springmvc/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'common'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve package apache
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
		http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd">

    <context:component-scan base-package="org.apache.shenyu.examples.springmvc.controller"/>

    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
```

### SpringXmlModelInspection
Cannot resolve package shenyu
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
		http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd">

    <context:component-scan base-package="org.apache.shenyu.examples.springmvc.controller"/>

    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
```

### SpringXmlModelInspection
Cannot resolve package examples
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
		http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd">

    <context:component-scan base-package="org.apache.shenyu.examples.springmvc.controller"/>

    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
```

### SpringXmlModelInspection
Cannot resolve package springmvc
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
		http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd">

    <context:component-scan base-package="org.apache.shenyu.examples.springmvc.controller"/>

    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
```

### SpringXmlModelInspection
Cannot resolve package controller
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
		http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd">

    <context:component-scan base-package="org.apache.shenyu.examples.springmvc.controller"/>

    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
```

### SpringXmlModelInspection
Cannot resolve class or package 'springframework'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
        <mvc:message-converters register-defaults="false">
            <bean class="org.springframework.http.converter.StringHttpMessageConverter">
                <constructor-arg value="UTF-8"/>
            </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'ClientPropertiesConfig'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- ClientPropertiesConfig -->
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve property 'props'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <bean id="clientPropertiesConfig"
          class="org.apache.shenyu.register.common.config.ShenyuClientConfig.ClientPropertiesConfig">
        <property name="props">
            <map>
                <entry key="contextPath" value="/springmvc"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'common'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'config'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ShenyuRegisterCenterConfig'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'http'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
        <mvc:message-converters register-defaults="false">
            <bean class="org.springframework.http.converter.StringHttpMessageConverter">
                <constructor-arg value="UTF-8"/>
            </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'registerType'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <!-- conifig ShenyuRegisterCenterConfig according to your registerType -->
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
```

### SpringXmlModelInspection
Cannot resolve property 'serverLists'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    <bean id="shenyuRegisterCenterConfig" class="org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig">
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
            <map>
```

### SpringXmlModelInspection
Cannot resolve property 'props'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
        <property name="registerType" value="http"/>
        <property name="serverLists" value="http://localhost:9095"/>
        <property name="props">
            <map>
                <entry key="username" value="admin"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'converter'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
        <mvc:message-converters register-defaults="false">
            <bean class="org.springframework.http.converter.StringHttpMessageConverter">
                <constructor-arg value="UTF-8"/>
            </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'StringHttpMessageConverter'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
    <mvc:annotation-driven content-negotiation-manager="contentNegotiationManager">
        <mvc:message-converters register-defaults="false">
            <bean class="org.springframework.http.converter.StringHttpMessageConverter">
                <constructor-arg value="UTF-8"/>
            </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'springframework'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
                <constructor-arg value="UTF-8"/>
            </bean>
            <bean id="gsonHttpMessageConverter" class="org.springframework.http.converter.json.GsonHttpMessageConverter">
                <property name="supportedMediaTypes">
                    <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'http'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
                <constructor-arg value="UTF-8"/>
            </bean>
            <bean id="gsonHttpMessageConverter" class="org.springframework.http.converter.json.GsonHttpMessageConverter">
                <property name="supportedMediaTypes">
                    <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'converter'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
                <constructor-arg value="UTF-8"/>
            </bean>
            <bean id="gsonHttpMessageConverter" class="org.springframework.http.converter.json.GsonHttpMessageConverter">
                <property name="supportedMediaTypes">
                    <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'json'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
                <constructor-arg value="UTF-8"/>
            </bean>
            <bean id="gsonHttpMessageConverter" class="org.springframework.http.converter.json.GsonHttpMessageConverter">
                <property name="supportedMediaTypes">
                    <list>
```

### SpringXmlModelInspection
Cannot resolve class 'GsonHttpMessageConverter'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
                <constructor-arg value="UTF-8"/>
            </bean>
            <bean id="gsonHttpMessageConverter" class="org.springframework.http.converter.json.GsonHttpMessageConverter">
                <property name="supportedMediaTypes">
                    <list>
```

### SpringXmlModelInspection
Cannot resolve property 'supportedMediaTypes'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
            </bean>
            <bean id="gsonHttpMessageConverter" class="org.springframework.http.converter.json.GsonHttpMessageConverter">
                <property name="supportedMediaTypes">
                    <list>
                        <value>application/json;charset=UTF-8</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'springframework'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
    </mvc:annotation-driven>

    <bean id="contentNegotiationManager" class="org.springframework.web.accept.ContentNegotiationManagerFactoryBean">
        <property name="mediaTypes">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'web'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
    </mvc:annotation-driven>

    <bean id="contentNegotiationManager" class="org.springframework.web.accept.ContentNegotiationManagerFactoryBean">
        <property name="mediaTypes">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class or package 'accept'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
    </mvc:annotation-driven>

    <bean id="contentNegotiationManager" class="org.springframework.web.accept.ContentNegotiationManagerFactoryBean">
        <property name="mediaTypes">
            <map>
```

### SpringXmlModelInspection
Cannot resolve class 'ContentNegotiationManagerFactoryBean'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
    </mvc:annotation-driven>

    <bean id="contentNegotiationManager" class="org.springframework.web.accept.ContentNegotiationManagerFactoryBean">
        <property name="mediaTypes">
            <map>
```

### SpringXmlModelInspection
Cannot resolve property 'mediaTypes'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java

    <bean id="contentNegotiationManager" class="org.springframework.web.accept.ContentNegotiationManagerFactoryBean">
        <property name="mediaTypes">
            <map>
                <entry key="xml" value="application/xml"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'register'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'http'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'HttpClientRegisterRepository'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <!-- for other kind of register method, please use related ShenyuClientRegisterRepository -->
    <bean id="clientRegisterRepository" class="org.apache.shenyu.register.client.http.HttpClientRegisterRepository">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'springmvc'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve property 'ignoreAcceptHeader'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
            </map>
        </property>
        <property name="ignoreAcceptHeader" value="true"/>
        <property name="favorPathExtension" value="true"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'favorPathExtension'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/spring-mvc.xml`
#### Snippet
```java
        </property>
        <property name="ignoreAcceptHeader" value="true"/>
        <property name="favorPathExtension" value="true"/>
    </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'init'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class 'SpringMvcClientEventListener'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java

    <bean id="springMvcClientEventListener"
          class="org.apache.shenyu.client.springmvc.init.SpringMvcClientEventListener">
        <constructor-arg ref="clientPropertiesConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shenyu'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'core'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'shutdown'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ShenyuClientShutdownHook'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/resources/context/shenyu.xml`
#### Snippet
```java
    </bean>

    <bean id="shenyuClientShutdownHook" class="org.apache.shenyu.client.core.shutdown.ShenyuClientShutdownHook">
        <constructor-arg ref="shenyuRegisterCenterConfig"/>
        <constructor-arg ref="clientRegisterRepository"/>
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'springframework'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <listener>
        <listener-class>org.springframework.web.util.IntrospectorCleanupListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class or package 'web'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <listener>
        <listener-class>org.springframework.web.util.IntrospectorCleanupListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class or package 'util'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <listener>
        <listener-class>org.springframework.web.util.IntrospectorCleanupListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class 'IntrospectorCleanupListener'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

    <listener>
        <listener-class>org.springframework.web.util.IntrospectorCleanupListener</listener-class>
    </listener>

```

### WebProperties
Cannot resolve class or package 'springframework'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>encodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
```

### WebProperties
Cannot resolve class or package 'web'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>encodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
```

### WebProperties
Cannot resolve class or package 'filter'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>encodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
```

### WebProperties
Cannot resolve class 'CharacterEncodingFilter'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>encodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
```

### WebProperties
Cannot resolve class or package 'springframework'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>dispatcherServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
```

### WebProperties
Cannot resolve class or package 'web'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>dispatcherServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>dispatcherServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
```

### WebProperties
Cannot resolve class 'DispatcherServlet'
in `shenyu-examples/shenyu-examples-springmvc-tomcat/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>dispatcherServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataSyncConfiguration.java`
#### Snippet
```java
            int sessionTimeout = Objects.isNull(zookeeperProp.getSessionTimeout()) ? 3000 : zookeeperProp.getSessionTimeout();
            int connectionTimeout = Objects.isNull(zookeeperProp.getConnectionTimeout()) ? 3000 : zookeeperProp.getConnectionTimeout();
            ZookeeperConfig zkConfig = new ZookeeperConfig(zookeeperProp.getUrl());
            zkConfig.setSessionTimeoutMilliseconds(sessionTimeout)
                    .setConnectionTimeoutMilliseconds(connectionTimeout);
            ZookeeperClient client = new ZookeeperClient(zkConfig);
            client.start();
            return client;
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/apollo/ApolloClient.java`
#### Snippet
```java
        OpenItemDTO openItemDTO = new OpenItemDTO();
        openItemDTO.setKey(key);
        openItemDTO.setValue(value);
        openItemDTO.setComment(comment);
        openItemDTO.setDataChangeCreatedBy(DEFAULT_USER);
        openItemDTO.setDataChangeLastModifiedBy(DEFAULT_USER);
        Date now = new Date();
        openItemDTO.setDataChangeCreatedTime(now);
        openItemDTO.setDataChangeLastModifiedTime(now);

        this.apolloOpenApiClient.createOrUpdateItem(
                apolloConfig.getAppId(),
                apolloConfig.getEnv(),
                apolloConfig.getClusterName(),
                apolloConfig.getNamespace(),
                openItemDTO
        );
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/dto/DetailDTO.java`
#### Snippet
```java
            DetailDO detailDO = new DetailDO();
            detailDO.setId(this.id);
            detailDO.setFieldId(this.fieldId);
            detailDO.setExample(this.example);
            detailDO.setFieldValue(this.fieldValue);
            detailDO.setValueDesc(this.valueDesc);
            detailDO.setDateCreated(this.dateCreated);
            detailDO.setDateUpdated(this.dateUpdated);
            return detailDO;
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/vo/DetailVO.java`
#### Snippet
```java
            detailVO.setId(this.id);
            detailVO.setFieldId(this.fieldId);
            detailVO.setExample(this.example);
            detailVO.setFieldValue(this.fieldValue);
            detailVO.setValueDesc(this.valueDesc);
            detailVO.setDateCreated(this.dateCreated);
            detailVO.setDateUpdated(this.dateUpdated);
            return detailVO;
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/dto/FieldDTO.java`
#### Snippet
```java
            fieldDO.setId(this.id);
            fieldDO.setModelId(this.modelId);
            fieldDO.setSelfModelId(this.selfModelId);
            fieldDO.setName(this.name);
            fieldDO.setFieldDesc(this.fieldDesc);
            fieldDO.setRequired(this.required);
            fieldDO.setExt(this.ext);
            fieldDO.setDateCreated(this.dateCreated);
            fieldDO.setDateUpdated(this.dateUpdated);
            return fieldDO;
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/entity/ApiDO.java`
#### Snippet
```java
            apiDO.setId(id);
            apiDO.setContextPath(contextPath);
            apiDO.setApiPath(apiPath);
            apiDO.setHttpMethod(httpMethod);
            apiDO.setConsume(consume);
            apiDO.setProduce(produce);
            apiDO.setVersion(version);
            apiDO.setRpcType(rpcType);
            apiDO.setState(state);
            apiDO.setExt(ext);
            apiDO.setApiOwner(apiOwner);
            apiDO.setApiDesc(apiDesc);
            apiDO.setApiSource(apiSource);
            apiDO.setDocument(document);
            apiDO.setDocumentMd5(documentMd5);
            apiDO.setDateCreated(dateCreated);
            apiDO.setDateUpdated(dateUpdated);
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-common/src/main/java/org/apache/shenyu/register/common/dto/ApiDocRegisterDTO.java`
#### Snippet
```java
            apiDocRegisterDTO.setContextPath(contextPath);
            apiDocRegisterDTO.setApiPath(apiPath);
            apiDocRegisterDTO.setHttpMethod(httpMethod);
            apiDocRegisterDTO.setConsume(consume);
            apiDocRegisterDTO.setProduce(produce);
            apiDocRegisterDTO.setVersion(version);
            apiDocRegisterDTO.setRpcType(rpcType);
            apiDocRegisterDTO.setState(state);
            apiDocRegisterDTO.setExt(ext);
            apiDocRegisterDTO.setApiOwner(apiOwner);
            apiDocRegisterDTO.setApiDesc(apiDesc);
            apiDocRegisterDTO.setApiSource(apiSource);
            apiDocRegisterDTO.setDocument(document);
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/event/dict/DictChangedEvent.java`
#### Snippet
```java
        if (!Objects.equals(before.getType(), after.getType())) {
            builder.append(String.format("type[%s => %s] ", before.getType(), after.getType()));
        }
        if (!Objects.equals(before.getEnabled(), after.getEnabled())) {
            builder.append(String.format("enable[%s => %s] ", before.getEnabled(), after.getEnabled()));
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/event/plugin/PluginChangedEvent.java`
#### Snippet
```java
        Objects.requireNonNull(after);
        if (Objects.equals(before, after)) {
            return "it no change";
        }
        final StringBuilder builder = new StringBuilder();
        if (!Objects.equals(before.getName(), after.getName())) {
            builder.append(String.format("name[%s => %s] ", before.getName(), after.getName()));
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/event/plugin/PluginChangedEvent.java`
#### Snippet
```java
        if (!Objects.equals(before.getRole(), after.getRole())) {
            builder.append(String.format("role[%s => %s] ", before.getRole(), after.getRole()));
        }
        if (!Objects.equals(before.getEnabled(), after.getEnabled())) {
            builder.append(String.format("enable[%s => %s] ", before.getEnabled(), after.getEnabled()));
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/event/rule/RuleChangedEvent.java`
#### Snippet
```java
        if (!Objects.equals(before.getEnabled(), after.getEnabled())) {
            builder.append(String.format("enable[%s => %s] ", before.getEnabled(), after.getEnabled()));
        }
        if (!Objects.equals(before.getSort(), after.getSort())) {
            builder.append(String.format("sort[%s => %s] ", before.getSort(), after.getSort()));
        }
        if (!Objects.equals(before.getLoged(), after.getLoged())) {
            builder.append(String.format("loged[%s => %s] ", before.getLoged(), after.getLoged()));
        }
        return builder.toString();
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLUpdateInterceptor.java`
#### Snippet
```java
        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        Object parameter = args[1];
        Executor executor = (Executor) invocation.getTarget();
        for (Class<?> superClass = parameter.getClass(); superClass != Object.class; superClass = superClass.getSuperclass()) {
            Arrays.stream(superClass.getDeclaredFields())
                    .filter(f -> matchParam(parameter, f))
                    .forEach(f -> ReflectUtils.setFieldValue(parameter, f.getName(), new Timestamp(System.currentTimeMillis())));
        }
        return executor.update(ms, parameter);
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/ApiServiceImpl.java`
#### Snippet
```java
        return Optional.ofNullable(apiMapper.selectByPrimaryKey(id)).map(item -> {
            List<TagRelationDO> tagRelations = tagRelationMapper.selectByQuery(TagRelationQuery.builder().apiId(item.getId()).build());
            List<String> tagIds = tagRelations.stream().map(TagRelationDO::getTagId).collect(Collectors.toList());
            List<TagVO> tagVOS = Lists.newArrayList();
            if (CollectionUtils.isNotEmpty(tagIds)) {
                List<TagDO> tagDOS = tagMapper.selectByIds(tagIds);
                tagVOS = tagDOS.stream().map(TagVO::buildTagVO).collect(Collectors.toList());
            }
            return ApiVO.buildApiVO(item, tagVOS);
        }).orElse(null);
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/AppAuthServiceImpl.java`
#### Snippet
```java
        List<String> idList = appAuthDOList.stream().map(BaseDO::getId).collect(Collectors.toList());
        Map<String, List<AuthParamData>> paramMap = this.prepareAuthParamData(idList);
        Map<String, List<AuthPathData>> pathMap = this.prepareAuthPathData(idList);
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/publish/RuleEventPublisher.java`
#### Snippet
```java
        publish(new BatchRuleDeletedEvent(rules, SessionUtil.visitorName(), null));
        final List<RuleConditionDO> condition = ruleConditionMapper.selectByRuleIdSet(rules.stream().map(BaseDO::getId).collect(Collectors.toSet()));
        final Map<String, List<RuleConditionDO>> conditionsRuleGroup = groupBy(condition, RuleConditionDO::getRuleId);
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterDivideServiceImpl.java`
#### Snippet
```java
        List<DivideUpstream> addList = buildDivideUpstreamList(uriList);
        List<DivideUpstream> canAddList = new CopyOnWriteArrayList<>();
        boolean isEventDeleted = uriList.size() == 1 && EventType.DELETED.equals(uriList.get(0).getEventType());
        if (isEventDeleted) {
            addList.get(0).setStatus(false);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterDivideServiceImpl.java`
#### Snippet
```java
        if (CollectionUtils.isEmpty(existList)) {
            canAddList = addList;
        } else {
            List<DivideUpstream> diffList = addList.stream().filter(upstream -> !existList.contains(upstream)).collect(Collectors.toList());
            if (CollectionUtils.isNotEmpty(diffList)) {
                canAddList.addAll(diffList);
                existList.addAll(diffList);
            }
            List<DivideUpstream> diffStatusList = addList.stream().filter(upstream -> !upstream.isStatus()
                    || existList.stream().anyMatch(e -> e.equals(upstream) && e.isStatus() != upstream.isStatus())).collect(Collectors.toList());
            if (CollectionUtils.isNotEmpty(diffStatusList)) {
                canAddList.addAll(diffStatusList);
            }
        }

        if (doSubmit(selectorDO.getId(), canAddList)) {
            return null;
        }

        List<DivideUpstream> handleList;
        if (CollectionUtils.isEmpty(existList)) {
            handleList = addList;
        } else {
            List<DivideUpstream> aliveList;
            if (isEventDeleted) {
                aliveList = existList.stream().filter(e -> e.isStatus() && !e.equals(addList.get(0))).collect(Collectors.toList());
            } else {
                aliveList = addList;
            }
            handleList = divideSelectorHandleConverter.updateStatusAndFilter(existList, aliveList);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/transfer/ConditionTransfer.java`
#### Snippet
```java
        return Optional.ofNullable(selectorConditionDO)
                .map(v -> {
                    ConditionData conditionData = new ConditionData();
                    conditionData.setParamType(v.getParamType());
                    conditionData.setOperator(v.getOperator());
                    conditionData.setParamName(v.getParamName());
                    conditionData.setParamValue(v.getParamValue());
                    return conditionData;
                })
                .orElse(null);
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-brpc/src/main/java/org/apache/shenyu/client/brpc/BrpcContextRefreshedEventListener.java`
#### Snippet
```java
        if (Objects.isNull(shenyuBrpcClient)) {
            return null;
        }
        String produce = ShenyuClientConstants.MEDIA_TYPE_ALL_VALUE;
        String consume = ShenyuClientConstants.MEDIA_TYPE_ALL_VALUE;
        String[] values = new String[]{shenyuBrpcClient.value()};
        ApiHttpMethodEnum[] apiHttpMethodEnums = new ApiHttpMethodEnum[]{ApiHttpMethodEnum.NOT_HTTP};
        String version = "v0.01";
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-brpc/src/main/java/org/apache/shenyu/client/brpc/BrpcContextRefreshedEventListener.java`
#### Snippet
```java
        String[] paramNames = localVariableTableParameterNameDiscoverer.getParameterNames(method);
        List<Pair<String, String>> params = new ArrayList<>();
        if (paramNames != null && paramNames.length > 0) {
            Class<?>[] paramTypes = method.getParameterTypes();
            for (int i = 0; i < paramNames.length; i++) {
                params.add(Pair.of(paramTypes[i].getName(), paramNames[i]));
            }
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
ClassFile classFile = ctClass.getClassFile();
                classFile.setVersionToJava5();
                ctClass.addConstructor(CtNewConstructor.defaultConstructor(pool.getCtClass(parameterClassName)));
                // parameter fields
                Class<?>[] parameterTypes = method.getParameterTypes();
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                for (int i = 0; i < parameterTypes.length; i++) {
                    Class<?> type = parameterTypes[i];
                    Annotation[] annotations = parameterAnnotations[i];
                    AnnotationsAttribute attribute = new AnnotationsAttribute(classFile.getConstPool(), AnnotationsAttribute.visibleTag);
                    for (Annotation annotation : annotations) {
                        if (annotation.annotationType().isAnnotationPresent(Constraint.class)) {
                            javassist.bytecode.annotation.Annotation ja = new javassist.bytecode.annotation.Annotation(
                                    classFile.getConstPool(), pool.getCtClass(annotation.annotationType().getName()));
                            Method[] members = annotation.annotationType().getMethods();
                            for (Method member : members) {
                                if (Modifier.isPublic(member.getModifiers())
                                        && member.getParameterTypes().length == 0
                                        && member.getDeclaringClass() == annotation.annotationType()) {
                                    Object value = member.invoke(annotation);
                                    if (null != value) {
                                        MemberValue memberValue = createMemberValue(
                                                classFile.getConstPool(), pool.get(member.getReturnType().getName()), value);
                                        ja.addMemberValue(member.getName(), memberValue);
                                    }
                                }
                            }
                            attribute.addAnnotation(ja);
                        }
                    }
                    String fieldName = method.getName() + "Argument" + i;
                    CtField ctField = CtField.make("public " + type.getCanonicalName() + " " + fieldName + ";", pool.getCtClass(parameterClassName));
                    ctField.getFieldInfo().addAttribute(attribute);
                    ctClass.addField(ctField);
                }
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (parameterAnnotations.length > 0) {
            for (Annotation[] annotations : parameterAnnotations) {
                for (Annotation annotation : annotations) {
                    if (annotation.annotationType().isAnnotationPresent(Constraint.class)) {
                        return true;
                    }
                }
            }
        }
        return false;
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
MemberValue memberValue = javassist.bytecode.annotation.Annotation.createMemberValue(cp, type);
        if (memberValue instanceof BooleanMemberValue) {
            ((BooleanMemberValue) memberValue).setValue((Boolean) value);
        } else if (memberValue instanceof ByteMemberValue) {
            ((ByteMemberValue) memberValue).setValue((Byte) value);
        } else if (memberValue instanceof CharMemberValue) {
            ((CharMemberValue) memberValue).setValue((Character) value);
        } else if (memberValue instanceof ShortMemberValue) {
            ((ShortMemberValue) memberValue).setValue((Short) value);
        } else if (memberValue instanceof IntegerMemberValue) {
            ((IntegerMemberValue) memberValue).setValue((Integer) value);
        } else if (memberValue instanceof LongMemberValue) {
            ((LongMemberValue) memberValue).setValue((Long) value);
        } else if (memberValue instanceof FloatMemberValue) {
            ((FloatMemberValue) memberValue).setValue((Float) value);
        } else if (memberValue instanceof DoubleMemberValue) {
            ((DoubleMemberValue) memberValue).setValue((Double) value);
        } else if (memberValue instanceof ClassMemberValue) {
            ((ClassMemberValue) memberValue).setValue(((Class<?>) value).getName());
        } else if (memberValue instanceof StringMemberValue) {
            ((StringMemberValue) memberValue).setValue((String) value);
        } else if (memberValue instanceof EnumMemberValue) {
            ((EnumMemberValue) memberValue).setValue(((Enum<?>) value).name());
            /* else if (memberValue instanceof AnnotationMemberValue) */
        } else if (memberValue instanceof ArrayMemberValue) {
            CtClass arrayType = type.getComponentType();
            int len = Array.getLength(value);
            MemberValue[] members = new MemberValue[len];
            for (int i = 0; i < len; i++) {
                members[i] = createMemberValue(cp, arrayType, Array.get(value, i));
            }
            ((ArrayMemberValue) memberValue).setValue(members);
        }
        return memberValue;
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        Object parameterBean = getMethodParameterBean(clazz, method, arguments);
        if (parameterBean != null) {
            violations.addAll(validator.validate(parameterBean, classGroups));
        }

        for (Object arg : arguments) {
            validate(violations, arg, classGroups);
        }

        if (!violations.isEmpty()) {
            LOG.error("Failed to validate service: " + clazz.getName() + ", method: " + methodName + ", cause: " + violations);
            StringBuilder validateError = new StringBuilder();
            violations.forEach(each -> validateError.append(each.getMessage()).append(","));
            throw new ValidationException(validateError.substring(0, validateError.length() - 1));
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
            if (arg instanceof Object[]) {
                for (Object item : (Object[]) arg) {
                    validate(violations, item, groups);
                }
            } else if (arg instanceof Collection) {
                for (Object item : (Collection<?>) arg) {
                    validate(violations, item, groups);
                }
            } else if (arg instanceof Map) {
                for (Map.Entry<?, ?> entry : ((Map<?, ?>) arg).entrySet()) {
                    validate(violations, entry.getKey(), groups);
                    validate(violations, entry.getValue(), groups);
                }
            } else {
                violations.addAll(validator.validate(arg, groups));
            }
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
        RequestMapping requestMapping = AnnotatedElementUtils.findMergedAnnotation(method, RequestMapping.class);
        String produce = requestMapping.produces().length == 0 ? ShenyuClientConstants.MEDIA_TYPE_ALL_VALUE : String.join(",", requestMapping.produces());
        String consume = requestMapping.consumes().length == 0 ? ShenyuClientConstants.MEDIA_TYPE_ALL_VALUE : String.join(",", requestMapping.consumes());
        String[] values = requestMapping.value();
        RequestMethod[] requestMethods = requestMapping.method();
        if (requestMethods.length == 0) {
            requestMethods = RequestMethod.values();
        }
        List<ApiHttpMethodEnum> collect = Stream.of(requestMethods).map(item -> ApiHttpMethodEnum.of(item.name())).collect(Collectors.toList());
        ApiHttpMethodEnum[] apiHttpMethodEnums = collect.toArray(new ApiHttpMethodEnum[]{});
        String version = "v0.01";
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
        methodShenyuClient = Objects.isNull(methodShenyuClient) ? beanShenyuClient : methodShenyuClient;
        // the result of ReflectionUtils#getUniqueDeclaredMethods contains methods such as hashCode, wait, toSting
        // add Objects.nonNull(requestMapping) to make sure not register wrong method
        if (Objects.nonNull(methodShenyuClient) && Objects.nonNull(requestMapping)) {
            final MetaDataRegisterDTO metaData = buildMetaDataDTO(bean, methodShenyuClient,
                    buildApiPath(method, superPath, methodShenyuClient), clazz, method);
            getPublisher().publishEvent(metaData);
            getMetaDataMap().put(method, metaData);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
        if (StringUtils.isNotBlank(methodShenyuClient.path())) {
            return pathJoin(contextPath, superPath, methodShenyuClient.path());
        }
        final String path = getPathByMethod(method);
        if (StringUtils.isNotBlank(path)) {
            return pathJoin(contextPath, superPath, path);
        }
        return pathJoin(contextPath, superPath);
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
        if (Objects.isNull(annotation)) {
            return null;
        }
        final Object value = AnnotationUtils.getValue(annotation, "value");
        if (value instanceof String && StringUtils.isNotBlank((String) value)) {
            return (String) value;
        }
        if (value instanceof String[] && ArrayUtils.isNotEmpty((String[]) value)
                && StringUtils.isNotBlank(((String[]) value)[0])) {
            return ((String[]) value)[0];
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
        if (Objects.nonNull(beanShenyuClient) && StringUtils.isNotBlank(beanShenyuClient.path())) {
            return beanShenyuClient.path();
        }
        RequestMapping requestMapping = AnnotationUtils.findAnnotation(clazz, RequestMapping.class);
        // Only the first path is supported temporarily
        if (Objects.nonNull(requestMapping) && ArrayUtils.isNotEmpty(requestMapping.path())
                && StringUtils.isNotBlank(requestMapping.path()[0])) {
            return requestMapping.path()[0];
        }
        return "";
```

### DuplicatedCode
Duplicated code
in `shenyu-client/shenyu-client-motan/src/main/java/org/apache/shenyu/client/motan/MotanServiceEventListener.java`
#### Snippet
```java
        String desc = shenyuMotanClient.desc();
        String configRuleName = shenyuMotanClient.ruleName();
        String ruleName = ("".equals(configRuleName)) ? path : configRuleName;
        String methodName = method.getName();
        Class<?>[] parameterTypesClazz = method.getParameterTypes();
        String parameterTypes = Arrays.stream(parameterTypesClazz).map(Class::getName)
                .collect(Collectors.joining(","));
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/BrpcPlugin.java`
#### Snippet
```java
        String param = exchange.getAttribute(Constants.PARAM_TRANSFORM);
        ShenyuContext shenyuContext = exchange.getAttribute(Constants.CONTEXT);
        assert shenyuContext != null;
        MetaData metaData = exchange.getAttribute(Constants.META_DATA);
        if (!checkMetaData(metaData)) {
            assert metaData != null;
            LOG.error("path is :{}, meta data have error.... {}", shenyuContext.getPath(), metaData);
            exchange.getResponse().setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
            Object error = ShenyuResultWrap.error(exchange, ShenyuResultEnum.META_DATA_ERROR);
            return WebFluxResultUtils.result(exchange, error);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/proxy/BrpcProxyService.java`
#### Snippet
```java
        if (Objects.isNull(config)) {
            // should not execute to here
            threadPool = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                    60L, TimeUnit.SECONDS,
                    new SynchronousQueue<Runnable>(),
                    factory);
            return;
        }
        final String threadpool = Optional.ofNullable(config.getThreadpool()).orElse(Constants.CACHED);
        switch (threadpool) {
            case Constants.SHARED:
                try {
                    threadPool = SpringBeanUtils.getInstance().getBean(ShenyuThreadPoolExecutor.class);
                    return;
                } catch (NoSuchBeanDefinitionException t) {
                    throw new ShenyuException("shared thread pool is not enable, config ${shenyu.sharedPool.enable} in your xml/yml !", t);
                }
            case Constants.FIXED:
            case Constants.EAGER:
            case Constants.LIMITED:
                throw new UnsupportedOperationException();
            case Constants.CACHED:
            default:
                int corePoolSize = Optional.ofNullable(config.getCorethreads()).orElse(0);
                int maximumPoolSize = Optional.ofNullable(config.getThreads()).orElse(Integer.MAX_VALUE);
                int queueSize = Optional.ofNullable(config.getQueues()).orElse(0);
                threadPool = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, 60L, TimeUnit.SECONDS,
                        queueSize > 0 ? new LinkedBlockingQueue<>(queueSize) : new SynchronousQueue<>(), factory);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/util/ProxyInfoUtil.java`
#### Snippet
```java
        Object[] param = new Object[paramNames.length];
        for (int i = 0; i < paramNames.length; i++) {
            String paramName = paramNames[i];
            Class<?> paramType = paramTypes[i];
            if (PRIMITIVE_TYPE.containsKey(paramType.getName())) {
                param[i] = PRIMITIVE_TYPE.get(paramType.getName()).getFunc().apply(bodyMap.get(paramName));
            } else {
                param[i] = bodyMap.get(paramName);
            }
        }
        return param;
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/cache/AlibabaDubboConfigCache.java`
#### Snippet
```java
        if (Objects.isNull(applicationConfig)) {
            applicationConfig = new ApplicationConfig("shenyu_proxy");
        }
        if (needUpdateRegistryConfig(dubboRegisterConfig)) {
            RegistryConfig registryConfigTemp = new RegistryConfig();
            registryConfigTemp.setProtocol(dubboRegisterConfig.getProtocol());
            registryConfigTemp.setId("shenyu_proxy");
            registryConfigTemp.setRegister(false);
            registryConfigTemp.setAddress(dubboRegisterConfig.getRegister());
            Optional.ofNullable(dubboRegisterConfig.getGroup()).ifPresent(registryConfigTemp::setGroup);
            registryConfig = registryConfigTemp;
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/cache/AlibabaDubboConfigCache.java`
#### Snippet
```java
        reference.setCheck(false);
        reference.setLoadbalance("gray");
        
        Map<String, String> parameters = new HashMap<>(2);
        parameters.put("dispatcher", "direct");
        reference.setParameters(parameters);
        
        String rpcExt = metaData.getRpcExt();
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/cache/AlibabaDubboConfigCache.java`
#### Snippet
```java
        if (Objects.nonNull(dubboParam)) {
            if (StringUtils.isNoneBlank(dubboParam.getVersion())) {
                reference.setVersion(dubboParam.getVersion());
            }
            if (StringUtils.isNoneBlank(dubboParam.getGroup())) {
                reference.setGroup(dubboParam.getGroup());
            }
            if (StringUtils.isNoneBlank(dubboParam.getUrl())) {
                reference.setUrl(dubboParam.getUrl());
            }
            if (StringUtils.isNoneBlank(dubboParam.getCluster())) {
                reference.setCluster(dubboParam.getCluster());
            }
            // set dubbo sub protocol
            Optional.ofNullable(dubboParam.getProtocol()).ifPresent(reference::setProtocol);
            Optional.ofNullable(dubboParam.getTimeout()).ifPresent(reference::setTimeout);
            Optional.ofNullable(dubboParam.getRetries()).ifPresent(reference::setRetries);
            Optional.ofNullable(dubboParam.getSent()).ifPresent(reference::setSent);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/proxy/AlibabaDubboGrayLoadBalance.java`
#### Snippet
```java
if (CollectionUtils.isNotEmpty(dubboUpstreams)) {
            Upstream upstream = LoadBalancerFactory.selector(UpstreamCacheManager.getInstance().findUpstreamListBySelectorId(shenyuSelectorId), dubboRuleHandle.getLoadbalance(), remoteAddressIp);
            if (StringUtils.isBlank(upstream.getUrl()) && StringUtils.isBlank(upstream.getGroup()) && StringUtils.isBlank(upstream.getVersion())) {
                return ExtensionLoader.getExtensionLoader(LoadBalance.class).getExtension(dubboRuleHandle.getLoadbalance()).select(invokers, url, invocation);
            }
            // url is the first level, then is group, the version is the lowest.
            final List<Invoker<T>> invokerGrays = invokers.stream().filter(each -> {
                if (StringUtils.isNotBlank(upstream.getUrl())) {
                    URL eachUrl = each.getUrl();
                    return eachUrl.getAddress().equals(upstream.getUrl());
                }
                return true;
            }).filter(each -> {
                if (StringUtils.isNotBlank(upstream.getGroup())) {
                    final URL eachUrl = each.getUrl();
                    return upstream.getGroup().equals(eachUrl.getParameter(Constants.GROUP));
                }
                return true;
            }).filter(each -> {
                if (StringUtils.isNotBlank(upstream.getVersion())) {
                    final URL eachUrl = each.getUrl();
                    return upstream.getVersion().equals(eachUrl.getParameter(Constants.VERSION));
                }
                return true;
            }).collect(Collectors.toList());
            if (CollectionUtils.isEmpty(invokerGrays)) {
                return select(invokers, url, invocation, dubboRuleHandle.getLoadbalance());
            }
            return select(invokerGrays, url, invocation, dubboRuleHandle.getLoadbalance());
        }
        return select(invokers, url, invocation, dubboRuleHandle.getLoadbalance());
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/proxy/AlibabaDubboProxyService.java`
#### Snippet
```java
            GenericService genericService = reference.get();
            Pair<String[], Object[]> pair;
            if (StringUtils.isBlank(metaData.getParameterTypes()) || ParamCheckUtils.bodyIsEmpty(body)) {
                pair = new ImmutablePair<>(new String[]{}, new Object[]{});
            } else {
                pair = dubboParamResolveService.buildParameter(body, metaData.getParameterTypes());
            }
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-aliyun-sls/src/main/java/org/apache/shenyu/plugin/aliyun/sls/client/AliyunSlsLogCollectClient.java`
#### Snippet
```java
        final List<LogItem> logGroup = new ArrayList<>();
        LogItem logItem = new LogItem((int) (System.currentTimeMillis() / 1000));
        logItem.PushBack("level", "info");
        logItem.PushBack("name", log.getRequestUri());
        logItem.PushBack("message", GsonUtils.getGson().toJson(log));
        logGroup.add(logItem);
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/body/BodyWriter.java`
#### Snippet
```java
        try {
            isClosed.compareAndSet(false, true);
            return new String(stream.toByteArray(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            LOG.error("Write failed: ", e);
            return "Write failed: " + e.getMessage();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                LOG.error("Close stream error: ", e);
            }
            try {
                channel.close();
            } catch (IOException e) {
                LOG.error("Close channel error: ", e);
            }
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/SofaPlugin.java`
#### Snippet
```java
        String param = exchange.getAttribute(Constants.PARAM_TRANSFORM);
        ShenyuContext shenyuContext = exchange.getAttribute(Constants.CONTEXT);
        assert shenyuContext != null;
        MetaData metaData = exchange.getAttribute(Constants.META_DATA);
        if (!checkMetaData(metaData)) {
            assert metaData != null;
            LOG.error(" path is :{}, meta data have error.... {}", shenyuContext.getPath(), metaData);
            exchange.getResponse().setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
            Object error = ShenyuResultWrap.error(exchange, ShenyuResultEnum.META_DATA_ERROR);
            return WebFluxResultUtils.result(exchange, error);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/cache/ApplicationConfigCache.java`
#### Snippet
```java
        if (Objects.nonNull(threadPool)) {
            return;
        }
        switch (config.getThreadpool()) {
            case Constants.SHARED:
                try {
                    threadPool = SpringBeanUtils.getInstance().getBean(ShenyuThreadPoolExecutor.class);
                    return;
                } catch (NoSuchBeanDefinitionException t) {
                    throw new ShenyuException("shared thread pool is not enable, config ${shenyu.sharedPool.enable} in your xml/yml !", t);
                }
            case Constants.FIXED:
            case Constants.EAGER:
            case Constants.LIMITED:
                throw new UnsupportedOperationException();
            case Constants.CACHED:
                int corePoolSize = Optional.ofNullable(config.getCorethreads()).orElse(0);
                int maximumPoolSize = Optional.ofNullable(config.getThreads()).orElse(Integer.MAX_VALUE);
                int queueSize = Optional.ofNullable(config.getQueues()).orElse(0);
                threadPool = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, 60L, TimeUnit.SECONDS,
                        queueSize > 0 ? new LinkedBlockingQueue<>(queueSize) : new SynchronousQueue<>(), factory);
                return;
            default:
                return;
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-apollo/src/main/java/org/apache/shenyu/register/client/server/apollo/ApolloClientServerRegisterRepository.java`
#### Snippet
```java
        String clusterName = properties.getProperty("clusterName", ConfigConsts.CLUSTER_NAME_DEFAULT);
        String namespace = properties.getProperty("namespace", ConfigConsts.NAMESPACE_APPLICATION);
        Optional.ofNullable(appId).ifPresent(x -> System.setProperty(PROP_APP_ID, x));
        Optional.ofNullable(meta).ifPresent(x -> System.setProperty(PROP_APOLLO_META, x));
        Optional.ofNullable(clusterName).ifPresent(x -> System.setProperty(APOLLO_CLUSTER, x));
        Optional.ofNullable(namespace).ifPresent(x -> System.setProperty(APOLLO_NAMESPACE, x));
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-nacos/src/main/java/org/apache/shenyu/register/client/server/nacos/NacosClientServerRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
        // the nacos authentication password
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
        // access key for namespace
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
        // secret key for namespace
        nacosProperties.put(PropertyKeyConst.SECRET_KEY, properties.getProperty(PropertyKeyConst.SECRET_KEY, ""));
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = findFromcache(key);
        if (Objects.isNull(cache)) {
            return getDirectly(key);
        }
        ChildData data = cache.getCurrentData(key);
        if (Objects.isNull(data)) {
            return getDirectly(key);
        }
        return Objects.isNull(data.getData()) ? null : new String(data.getData(), StandardCharsets.UTF_8);
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = TreeCache.newBuilder(client, path).build();
        caches.put(path, cache);
        if (listeners != null && listeners.length > 0) {
            for (TreeCacheListener listener : listeners) {
                cache.getListenable().addListener(listener);
            }
        }
        try {
            cache.start();
        } catch (Exception e) {
            throw new ShenyuException("failed to add curator cache.", e);
        }
        return cache;
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClientServerRegisterRepository.java`
#### Snippet
```java
        Properties props = config.getProps();
        int sessionTimeout = Integer.parseInt(props.getProperty("sessionTimeout", "3000"));
        int connectionTimeout = Integer.parseInt(props.getProperty("connectionTimeout", "3000"));

        int baseSleepTime = Integer.parseInt(props.getProperty("baseSleepTime", "1000"));
        int maxRetries = Integer.parseInt(props.getProperty("maxRetries", "3"));
        int maxSleepTime = Integer.parseInt(props.getProperty("maxSleepTime", String.valueOf(Integer.MAX_VALUE)));

        ZookeeperConfig zkConfig = new ZookeeperConfig(config.getServerLists());
        zkConfig.setBaseSleepTimeMilliseconds(baseSleepTime)
                .setMaxRetries(maxRetries)
                .setMaxSleepTimeMilliseconds(maxSleepTime)
                .setSessionTimeoutMilliseconds(sessionTimeout)
                .setConnectionTimeoutMilliseconds(connectionTimeout);

        String digest = props.getProperty("digest");
        if (!StringUtils.isEmpty(digest)) {
            zkConfig.setDigest(digest);
        }

        this.client = new ZookeeperClient(zkConfig);
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-apollo/src/main/java/org/apache/shenyu/register/client/apollo/ApolloClientRegisterRepository.java`
#### Snippet
```java
        Properties properties = config.getProps();
        String appId = properties.getProperty("appId");
        String token = properties.getProperty("token");
        String env = properties.getProperty("env", "DEV");
        String clusterName = properties.getProperty("clusterName", ConfigConsts.CLUSTER_NAME_DEFAULT);
        String namespace = properties.getProperty("namespace", ConfigConsts.NAMESPACE_APPLICATION);
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-apollo/src/main/java/org/apache/shenyu/register/client/apollo/ApolloClientRegisterRepository.java`
#### Snippet
```java
        ApolloConfig apolloConfig = new ApolloConfig();
        apolloConfig.setAppId(appId);
        apolloConfig.setPortalUrl(portalUrl);
        apolloConfig.setToken(token);
        apolloConfig.setEnv(env);
        apolloConfig.setClusterName(clusterName);
        apolloConfig.setNamespace(namespace);

        this.apolloClient = new ApolloClient(apolloConfig);
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-consul/src/main/java/org/apache/shenyu/register/client/consul/ConsulClientRegisterRepository.java`
#### Snippet
```java
        String nodeName;
        String rpcType = metadata.getRpcType();
        if (Objects.equals(RpcTypeEnum.HTTP.getName(), rpcType)
                || Objects.equals(RpcTypeEnum.SPRING_CLOUD.getName(), rpcType)) {
            nodeName = String.join(SELECTOR_JOIN_RULE,
                    metadata.getContextPath(),
                    metadata.getRuleName().replace(PATH_SEPARATOR, SELECTOR_JOIN_RULE));
        } else {
            nodeName = RegisterPathConstants.buildNodeName(metadata.getServiceName(), metadata.getMethodName());
        }
        return nodeName.startsWith(PATH_SEPARATOR) ? nodeName.substring(1) : nodeName;
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-etcd/src/main/java/org/apache/shenyu/register/client/etcd/EtcdClient.java`
#### Snippet
```java
        try {
            this.globalLeaseId = client.getLeaseClient().grant(ttl).get().getID();
            client.getLeaseClient().keepAlive(globalLeaseId, new StreamObserver<LeaseKeepAliveResponse>() {
                @Override
                public void onNext(final LeaseKeepAliveResponse leaseKeepAliveResponse) {

                }

                @Override
                public void onError(final Throwable throwable) {
                    LOGGER.error("keep alive error", throwable);
                }

                @Override
                public void onCompleted() {

                }
            });
        } catch (InterruptedException | ExecutionException e) {
            LOGGER.error("initLease error.", e);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-etcd/src/main/java/org/apache/shenyu/register/client/etcd/EtcdClient.java`
#### Snippet
```java
        try {
            KV kvClient = client.getKVClient();
            kvClient.put(ByteSequence.from(key, UTF_8), ByteSequence.from(value, UTF_8),
                    PutOption.newBuilder().withLeaseId(globalLeaseId).build())
                    .get(timeout, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            LOGGER.error("putEphemeral(key:{},value:{}) error.", key, value, e);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-sync-data-center/shenyu-sync-data-consul/src/main/java/org/apache/shenyu/sync/data/consul/handler/ConsulCacheHandler.java`
#### Snippet
```java
        try {
            List<PluginData> pluginDataList = new ArrayList<>(GsonUtils.getInstance().toObjectMap(configInfo, PluginData.class).values());
            pluginDataList.forEach(pluginData -> Optional.ofNullable(pluginDataSubscriber).ifPresent(subscriber -> {
                subscriber.unSubscribe(pluginData);
                subscriber.onSubscribe(pluginData);
            }));
        } catch (JsonParseException e) {
            LOG.error("sync plugin data have error:", e);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-sync-data-center/shenyu-sync-data-consul/src/main/java/org/apache/shenyu/sync/data/consul/handler/ConsulCacheHandler.java`
#### Snippet
```java
        try {
            List<SelectorData> selectorDataList = GsonUtils.getInstance().toObjectMapList(configInfo, SelectorData.class).values().stream().flatMap(Collection::stream).collect(Collectors.toList());
            selectorDataList.forEach(selectorData -> Optional.ofNullable(pluginDataSubscriber).ifPresent(subscriber -> {
                subscriber.unSelectorSubscribe(selectorData);
                subscriber.onSelectorSubscribe(selectorData);
            }));
        } catch (JsonParseException e) {
            LOG.error("sync selector data have error:", e);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-sync-data-center/shenyu-sync-data-consul/src/main/java/org/apache/shenyu/sync/data/consul/handler/ConsulCacheHandler.java`
#### Snippet
```java
        try {
            List<RuleData> ruleDataList = GsonUtils.getInstance().toObjectMapList(configInfo, RuleData.class).values()
                    .stream().flatMap(Collection::stream)
                    .collect(Collectors.toList());
            ruleDataList.forEach(ruleData -> Optional.ofNullable(pluginDataSubscriber).ifPresent(subscriber -> {
                subscriber.unRuleSubscribe(ruleData);
                subscriber.onRuleSubscribe(ruleData);
            }));
        } catch (JsonParseException e) {
            LOG.error("sync rule data have error:", e);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-sync-data-center/shenyu-sync-data-consul/src/main/java/org/apache/shenyu/sync/data/consul/handler/ConsulCacheHandler.java`
#### Snippet
```java
        try {
            List<MetaData> metaDataList = new ArrayList<>(GsonUtils.getInstance().toObjectMap(configInfo, MetaData.class).values());
            metaDataList.forEach(metaData -> metaDataSubscribers.forEach(subscriber -> {
                subscriber.unSubscribe(metaData);
                subscriber.onSubscribe(metaData);
            }));
        } catch (JsonParseException e) {
            LOG.error("sync meta data have error:", e);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-sync-data-center/shenyu-sync-data-consul/src/main/java/org/apache/shenyu/sync/data/consul/handler/ConsulCacheHandler.java`
#### Snippet
```java
        try {
            List<AppAuthData> appAuthDataList = new ArrayList<>(GsonUtils.getInstance().toObjectMap(configInfo, AppAuthData.class).values());
            appAuthDataList.forEach(appAuthData -> authDataSubscribers.forEach(subscriber -> {
                subscriber.unSubscribe(appAuthData);
                subscriber.onSubscribe(appAuthData);
            }));
        } catch (JsonParseException e) {
            LOG.error("sync auth data have error:", e);
        }
```

### DuplicatedCode
Duplicated code
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdSyncDataService.java`
#### Snippet
```java
        SelectorData selectorData = new SelectorData();
        final String selectorId = dataPath.substring(dataPath.lastIndexOf("/") + 1);
        final String str = dataPath.substring(DefaultPathConstants.SELECTOR_PARENT.length());
        final String pluginName = str.substring(1, str.length() - selectorId.length() - 1);
        selectorData.setPluginName(pluginName);
        selectorData.setId(selectorId);
        Optional.ofNullable(pluginDataSubscriber).ifPresent(e -> e.unSelectorSubscribe(selectorData));
```

### DuplicatedCode
Duplicated code
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdSyncDataService.java`
#### Snippet
```java
        String substring = dataPath.substring(dataPath.lastIndexOf("/") + 1);
        final String str = dataPath.substring(DefaultPathConstants.RULE_PARENT.length());
        final String pluginName = str.substring(1, str.length() - substring.length() - 1);
        final List<String> list = Lists.newArrayList(Splitter.on(DefaultPathConstants.SELECTOR_JOIN_RULE).split(substring));

        RuleData ruleData = new RuleData();
        ruleData.setPluginName(pluginName);
        ruleData.setSelectorId(list.get(0));
        ruleData.setId(list.get(1));

        Optional.ofNullable(pluginDataSubscriber).ifPresent(e -> e.unRuleSubscribe(ruleData));
```

### DuplicatedCode
Duplicated code
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginClassLoader.java`
#### Snippet
```java
        if (SpringBeanUtils.getInstance().existBean(className)) {
            return SpringBeanUtils.getInstance().getBeanByClassName(className);
        }
        lock.lock();
        try {
            T inst = SpringBeanUtils.getInstance().getBeanByClassName(className);
            if (Objects.isNull(inst)) {
                Class<?> clazz = Class.forName(className, false, this);
                //Exclude ShenyuPlugin subclass and PluginDataHandler subclass
                // without adding @Component @Service annotation
                boolean next = ShenyuPlugin.class.isAssignableFrom(clazz)
                        || PluginDataHandler.class.isAssignableFrom(clazz);
                if (!next) {
                    Annotation[] annotations = clazz.getAnnotations();
                    next = Arrays.stream(annotations).anyMatch(e -> e.annotationType().equals(Component.class)
                            || e.annotationType().equals(Service.class));
                }
                if (next) {
                    GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
                    beanDefinition.setBeanClassName(className);
                    beanDefinition.setAutowireCandidate(true);
                    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
                    String beanName = SpringBeanUtils.getInstance().registerBean(beanDefinition, this);
                    inst = SpringBeanUtils.getInstance().getBeanByClassName(beanName);
                }
            }
            return inst;
        } finally {
            lock.unlock();
        }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return count but the return type is list
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mapper/PluginHandleMapper.java`
#### Snippet
```java
     *
     * @param ids a list of ids
     * @return the count of deleted
     */
    List<PluginHandleDO> selectByIdList(@Param("ids") List<String> ids);
```

### MismatchedJavadocCode
Method is specified to return count but the return type is list
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mapper/PluginHandleMapper.java`
#### Snippet
```java
     *
     * @param pluginId a list of ids
     * @return the count of deleted
     */
    List<PluginHandleDO> selectByPluginIdList(@Param("pluginIds") List<String> pluginId);
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
        return new ClassPathScanningCandidateComponentProvider(false, this.environment) {
            @Override
            protected boolean isCandidateComponent(final AnnotatedBeanDefinition beanDefinition) {
                boolean isCandidate = false;
                if (beanDefinition.getMetadata().isIndependent()) {
```

## RuleId[id=ThreadRun]
### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
                        } catch (InterruptedException ignore) {
                        }
                        hook.run();
                    }, hook.getName());
                    delayHooks.put(delayHook, delayHook);
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/dto/TagDTO.java`
#### Snippet
```java
    private static final long serialVersionUID = 1680976393721978145L;

    /**
     * primary key.
     */
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/aspect/controller/SuperAdminPasswordSafeAdvice.java`
#### Snippet
```java
        if (properties.getOnlySuperAdminPermission()
                .stream()
                .anyMatch(p -> Arrays.asList(permissions.value()).contains(p))) {
            
            final String userId = SessionUtil.visitor().getUserId();
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ShenyuRequestParameter` may be 'static'
in `shenyu-common/src/main/java/org/apache/shenyu/common/dto/convert/rule/RequestHandle.java`
#### Snippet
```java
    }

    public class ShenyuRequestParameter {

        private Map<String, String> addParameters;
```

### InnerClassMayBeStatic
Inner class `ShenyuRequestHeader` may be 'static'
in `shenyu-common/src/main/java/org/apache/shenyu/common/dto/convert/rule/RequestHandle.java`
#### Snippet
```java
    }

    public class ShenyuRequestHeader {
        /**
         * need to be appended new header value.
```

### InnerClassMayBeStatic
Inner class `ShenyuCookie` may be 'static'
in `shenyu-common/src/main/java/org/apache/shenyu/common/dto/convert/rule/RequestHandle.java`
#### Snippet
```java
    }

    public class ShenyuCookie {
        private Map<String, String> addCookies;

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `shenyu-plugin/shenyu-plugin-key-auth/src/main/java/org/apache/shenyu/plugin/key/auth/KeyAuthPlugin.java`
#### Snippet
```java
        }
        MultiValueMap<String, String> multiValueMap = exchange.getRequest().getQueryParams();
        if (StringUtils.equals(multiValueMap.getFirst(keyName), key)) {
            return true;
        }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Socket' used without 'try'-with-resources statement
in `shenyu-plugin/shenyu-plugin-mqtt/src/main/java/org/apache/shenyu/plugin/mqtt/handler/MqttPluginDataHandler.java`
#### Snippet
```java
        try {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            new Socket(address, port);
            flag = true;
        } catch (Exception ignored) {
```

### AutoCloseableResource
'ClickHouseResponse' used without 'try'-with-resources statement
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-clickhouse/src/main/java/org/apache/shenyu/plugin/logging/clickhouse/client/ClickHouseLogCollectClient.java`
#### Snippet
```java
            client = ClickHouseClient.builder().build();
            ClickHouseRequest<?> request = client.connect(endpoint).format(ClickHouseFormat.TabSeparatedWithNamesAndTypes);
            request.query(String.format(ClickHouseLoggingConstant.CREATE_DATABASE_SQL, database)).executeAndWait();
            request.query(String.format(ClickHouseLoggingConstant.CREATE_TABLE_SQL, database, config.getEngine())).executeAndWait();
            request.query(String.format(ClickHouseLoggingConstant.CREATE_DISTRIBUTED_TABLE_SQL, database, database, config.getClusterName(), database)).executeAndWait();
```

### AutoCloseableResource
'ClickHouseResponse' used without 'try'-with-resources statement
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-clickhouse/src/main/java/org/apache/shenyu/plugin/logging/clickhouse/client/ClickHouseLogCollectClient.java`
#### Snippet
```java
            ClickHouseRequest<?> request = client.connect(endpoint).format(ClickHouseFormat.TabSeparatedWithNamesAndTypes);
            request.query(String.format(ClickHouseLoggingConstant.CREATE_DATABASE_SQL, database)).executeAndWait();
            request.query(String.format(ClickHouseLoggingConstant.CREATE_TABLE_SQL, database, config.getEngine())).executeAndWait();
            request.query(String.format(ClickHouseLoggingConstant.CREATE_DISTRIBUTED_TABLE_SQL, database, database, config.getClusterName(), database)).executeAndWait();
        } catch (Exception e) {
```

### AutoCloseableResource
'ClickHouseResponse' used without 'try'-with-resources statement
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-clickhouse/src/main/java/org/apache/shenyu/plugin/logging/clickhouse/client/ClickHouseLogCollectClient.java`
#### Snippet
```java
            request.query(String.format(ClickHouseLoggingConstant.CREATE_DATABASE_SQL, database)).executeAndWait();
            request.query(String.format(ClickHouseLoggingConstant.CREATE_TABLE_SQL, database, config.getEngine())).executeAndWait();
            request.query(String.format(ClickHouseLoggingConstant.CREATE_DISTRIBUTED_TABLE_SQL, database, database, config.getClusterName(), database)).executeAndWait();
        } catch (Exception e) {
            LOG.error("inti ClickHouseLogClient error", e);
```

### AutoCloseableResource
'Watcher' used without 'try'-with-resources statement
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
        if (watchCache.containsKey(key)) {
            watchCache.get(key).close();
            watchCache.remove(key);
        }
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
                .post(body)
                .build();
        return client.newCall(request).execute().body().string();
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
        reqBuild.url(urlBuilder.build());
        Request request = reqBuild.build();
        return client.newCall(request).execute().body().string();
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
                .post(body)
                .build();
        return client.newCall(request).execute().body().string();
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
        reqBuild.url(urlBuilder.build());
        Request request = reqBuild.build();
        return client.newCall(request).execute().body().string();
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `shenyu-alert/src/main/java/org/apache/shenyu/alert/strategy/DingTalkStrategy.java`
#### Snippet
```java
                .post(body)
                .build();
        OK_HTTP_CLIENT.newCall(request).execute();
    }

```

### AutoCloseableResource
'Watcher' used without 'try'-with-resources statement
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-etcd/src/main/java/org/apache/shenyu/register/instance/etcd/EtcdClient.java`
#### Snippet
```java
        WatchOption option = WatchOption.newBuilder().isPrefix(true).build();

        client.getWatchClient().watch(bytesOf(key), option, listener);
    }

```

### AutoCloseableResource
'CloseableClient' used without 'try'-with-resources statement
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-etcd/src/main/java/org/apache/shenyu/register/instance/etcd/EtcdClient.java`
#### Snippet
```java
        try {
            this.globalLeaseId = client.getLeaseClient().grant(ttl).get().getID();
            client.getLeaseClient().keepAlive(globalLeaseId, new StreamObserver<LeaseKeepAliveResponse>() {
                @Override
                public void onNext(final LeaseKeepAliveResponse leaseKeepAliveResponse) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java

        Request request = builder.build();
        Response response = httpClient.newCall(request).execute();
        return response.body().string();
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
    public String requestFileString(final String url, final Map<String, ?> form, final Map<String, String> header,
        final List<UploadFile> files) throws IOException {
        return requestFile(url, form, header, files).body().string();
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
        Response response = httpClient
            .newCall(request)
            .execute();
        if (response.isSuccessful()) {
            ResponseBody body = response.body();
```

### AutoCloseableResource
'Page' used without 'try'-with-resources statement
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/PageService.java`
#### Snippet
```java
    default PageInfo<R> searchByPage(final PageCondition<Q> pageCondition) {
        doConditionPreProcessing(pageCondition.getCondition());
        PageHelper.startPage(pageCondition.getPageNum(), pageCondition.getPageSize());
        return new PageInfo<>(searchByCondition(pageCondition.getCondition()));
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/SandboxServiceImpl.java`
#### Snippet
```java
        Map<String, Object> reqParams = this.buildReqBizParams(proxyGatewayDTO);
        List<HttpUtils.UploadFile> files = this.uploadFiles(request);
        Response resp = HTTP_UTILS.requestCall(uriComponents.toUriString(), reqParams, header, HttpUtils.HTTPMethod.fromValue(proxyGatewayDTO.getHttpMethod()), files);
        ResponseBody body = resp.body();

```

### AutoCloseableResource
'LogCollector' used without 'try'-with-resources statement
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/handler/AbstractLogPluginDataHandler.java`
#### Snippet
```java
                // no data, init client
                this.doRefreshConfig(globalLogConfig);
                logCollector().start();
            }
            Singleton.INST.single(globalLogConfigClass, globalLogConfig);
```

### AutoCloseableResource
'ShenyuGrpcClient' used without 'try'-with-resources statement
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/cache/GrpcClientCache.java`
#### Snippet
```java
     */
    public static void initGrpcClient(final String contextPath) {
        MapUtils.computeIfAbsent(CLIENT_CACHE, contextPath, s -> GrpcClientBuilder.buildClient(contextPath));
    }
    
```

### AutoCloseableResource
'ShenyuPluginClassLoader' used without 'try'-with-resources statement
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuLoaderService.java`
#### Snippet
```java
            for (PluginJarParser.PluginJar extPath : uploadPluginJars) {
                LOG.info("shenyu extPlugin find new {} to load", extPath.getAbsolutePath());
                ShenyuPluginClassLoader extPathClassLoader = ShenyuPluginClassloaderHolder.getSingleton().createExtPathClassLoader(extPath);
                extendPlugins.addAll(extPathClassLoader.loadUploadedJarPlugins());
            }
```

### AutoCloseableResource
'CloseableClient' used without 'try'-with-resources statement
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-etcd/src/main/java/org/apache/shenyu/register/client/etcd/EtcdClient.java`
#### Snippet
```java
        try {
            this.globalLeaseId = client.getLeaseClient().grant(ttl).get().getID();
            client.getLeaseClient().keepAlive(globalLeaseId, new StreamObserver<LeaseKeepAliveResponse>() {
                @Override
                public void onNext(final LeaseKeepAliveResponse leaseKeepAliveResponse) {
```

### AutoCloseableResource
'ValidatorFactory' used without 'try'-with-resources statement
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        ValidatorFactory factory;
        if (shenyuValidation != null && shenyuValidation.length() > 0) {
            factory = Validation.byProvider((Class) ReflectUtils.forName(shenyuValidation)).configure().buildValidatorFactory();
        } else {
            factory = Validation.buildDefaultValidatorFactory();
```

### AutoCloseableResource
'ValidatorFactory' used without 'try'-with-resources statement
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
            factory = Validation.byProvider((Class) ReflectUtils.forName(shenyuValidation)).configure().buildValidatorFactory();
        } else {
            factory = Validation.buildDefaultValidatorFactory();
        }
        this.validator = factory.getValidator();
```

### AutoCloseableResource
'ValidatorFactory' used without 'try'-with-resources statement
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        ValidatorFactory factory;
        if (shenyuValidation != null && shenyuValidation.length() > 0) {
            factory = Validation.byProvider((Class) ReflectUtils.forName(shenyuValidation)).configure().buildValidatorFactory();
        } else {
            factory = Validation.buildDefaultValidatorFactory();
```

### AutoCloseableResource
'ValidatorFactory' used without 'try'-with-resources statement
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
            factory = Validation.byProvider((Class) ReflectUtils.forName(shenyuValidation)).configure().buildValidatorFactory();
        } else {
            factory = Validation.buildDefaultValidatorFactory();
        }
        this.validator = factory.getValidator();
```

## RuleId[id=RedundantCompareCall]
### RedundantCompareCall
Redundant call to `Integer.compare()`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/trie/ShenyuTrie.java`
#### Snippet
```java
                }
            }
            if (Integer.compare(i, pathParts.length - 1) == 0) {
                return node;
            }
```

### RedundantCompareCall
Redundant call to `Integer.compare()`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/trie/ShenyuTrie.java`
#### Snippet
```java
        while (startIndex < pathParts.length) {
            String pathPart = pathParts[startIndex];
            boolean endPath = Integer.compare(startIndex, pathParts.length - 1) == 0;
            if (Objects.isNull(currentNode)) {
                return null;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/BaseTrigger.java`
#### Snippet
```java
     * @param statement {@link PreparedStatement}
     * @param newRow {@link Object}
     * @throws SQLException {@link SQLException}
     */
    public static void sqlExecute(final Object[] newRow, final PreparedStatement statement) throws SQLException {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `annotation.configurator().getConstructor().newInstance()` to `ServerEndpointConfig.Configurator` is redundant
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/ShenyuServerEndpointerExporter.java`
#### Snippet
```java
        if (!configuratorClazz.equals(ServerEndpointConfig.Configurator.class)) {
            try {
                configurator = (ServerEndpointConfig.Configurator) annotation.configurator().getConstructor().newInstance();
            } catch (ReflectiveOperationException ex) {
                LOG.error("ShenyuServerEndpoint configurator init fail! Class name: {}, configurator name: {}", pojo.getName(), annotation.configurator().getName());
```

### RedundantCast
Casting `this.threadPoolMap.get(...)` to `ThreadPoolExecutor` is redundant
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/spi/SharedThreadPoolFactory.java`
#### Snippet
```java
            return this.defaultThreadPool;
        } else if (this.threadPoolMap.get(rpcService) != null) {
            return (ThreadPoolExecutor) this.threadPoolMap.get(rpcService);
        } else {
            ServiceConfig serviceConfig = rpcService.getServiceConfig();
```

### RedundantCast
Casting `this.threadPoolMap.get(...)` to `ThreadPoolExecutor` is redundant
in `shenyu-plugin/shenyu-plugin-brpc/src/main/java/org/apache/shenyu/plugin/brpc/spi/SharedThreadPoolFactory.java`
#### Snippet
```java
                    synchronized (this) {
                        if (this.threadPoolMap.get(rpcService) != null) {
                            return (ThreadPoolExecutor) this.threadPoolMap.get(rpcService);
                        }

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `tagRelationMapper` may be 'final'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagRelationServiceImpl.java`
#### Snippet
```java
public class TagRelationServiceImpl implements TagRelationService {

    private TagRelationMapper tagRelationMapper;

    public TagRelationServiceImpl(final TagRelationMapper tagRelationMapper) {
```

### FieldMayBeFinal
Field `tagMapper` may be 'final'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java
public class TagServiceImpl implements TagService {

    private TagMapper tagMapper;

    public TagServiceImpl(final TagMapper tagMapper) {
```

### FieldMayBeFinal
Field `shenyuLoaderService` may be 'final'
in `shenyu-web/src/main/java/org/apache/shenyu/web/handler/ShenyuWebHandler.java`
#### Snippet
```java
    private final List<ShenyuPlugin> sourcePlugins;

    private ShenyuLoaderService shenyuLoaderService;

    private final boolean scheduled;
```

### FieldMayBeFinal
Field `random` may be 'final'
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/spi/P2cLoadBalancer.java`
#### Snippet
```java
    private static final int PICK_TIMES = 3;

    private Random random = new Random();

    /**
```

### FieldMayBeFinal
Field `succeeded` may be 'final'
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/entity/Upstream.java`
#### Snippet
```java
    private AtomicLong inflight = new AtomicLong(1);

    private AtomicLong succeeded = new AtomicLong(0);

    private AtomicLong succeededElapsed = new AtomicLong(0);
```

### FieldMayBeFinal
Field `succeededElapsed` may be 'final'
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/entity/Upstream.java`
#### Snippet
```java
    private AtomicLong succeeded = new AtomicLong(0);

    private AtomicLong succeededElapsed = new AtomicLong(0);

    private Upstream(final Builder builder) {
```

### FieldMayBeFinal
Field `requestTemplate` may be 'final'
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientMethodHandler.java`
#### Snippet
```java
    private final ShenyuSdkClient shenyuHttpClient;

    private RequestTemplate requestTemplate;

    private final Map<Class<? extends Annotation>, AnnotatedParameterProcessor> annotatedArgumentProcessors;
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `shenyu-examples/shenyu-examples-sofa/shenyu-examples-sofa-service/src/main/resources/invoke-server-example.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
            http://sofastack.io/schema/sofaboot https://sofastack.io/schema/sofaboot.xsd"
       default-autowire="byName">

    <sofa:service ref="sofaSingleParamService" interface="org.apache.shenyu.examples.sofa.api.service.SofaSingleParamService">
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `shenyuClientRegisterService`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/subscriber/ApiDocExecutorSubscriber.java`
#### Snippet
```java
        dataList.forEach(apiDoc -> Optional.ofNullable(this.shenyuClientRegisterService.get(apiDoc.getRpcType()))
                .ifPresent(shenyuClientRegisterService -> {
                    synchronized (shenyuClientRegisterService) {
                        shenyuClientRegisterService.registerApiDoc(apiDoc);
                    }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `shenyuClientRegisterService`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/subscriber/MetadataExecutorSubscriber.java`
#### Snippet
```java
            Optional.ofNullable(this.shenyuClientRegisterService.get(meta.getRpcType()))
                    .ifPresent(shenyuClientRegisterService -> {
                        synchronized (shenyuClientRegisterService) {
                            shenyuClientRegisterService.register(meta);
                        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `apiClass`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientProxyFactory.java`
#### Snippet
```java
        }

        synchronized (apiClass) {
            Object proxy = Proxy.newProxyInstance(apiClass.getClassLoader(),
                    new Class<?>[]{apiClass},
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `menuInfo` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/vo/PermissionMenuVO.java`
#### Snippet
```java
             */
            public MenuInfo build() {
                MenuInfo menuInfo = new MenuInfo(id, name, url, component, meta, children, sort);
                return menuInfo;
            }
```

### UnnecessaryLocalVariable
Local variable `resourceDO` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/entity/ResourceDO.java`
#### Snippet
```java
        return Optional.ofNullable(createResourceDTO).map(item -> {
            Timestamp currentTime = new Timestamp(System.currentTimeMillis());
            ResourceDO resourceDO = ResourceDO.builder()
                .parentId(item.getParentId())
                .title(item.getTitle())
```

### UnnecessaryLocalVariable
Local variable `signContent` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ShenyuSignatureUtils.java`
#### Snippet
```java
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
        final String signContent = storedKeys.stream()
            .map(key -> String.join("", key, map.get(key)))
            .collect(Collectors.joining()).trim()
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `shenyu-disruptor/src/main/java/org/apache/shenyu/disruptor/thread/OrderlyExecutor.java`
#### Snippet
```java
            return Hashing
                    .sha256()
                    .newHasher()
                    .putBytes(bytes)
                    .hash().asBytes();
```

### UnstableApiUsage
'putBytes(byte\[\])' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `shenyu-disruptor/src/main/java/org/apache/shenyu/disruptor/thread/OrderlyExecutor.java`
#### Snippet
```java
                    .sha256()
                    .newHasher()
                    .putBytes(bytes)
                    .hash().asBytes();
        }
```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `shenyu-disruptor/src/main/java/org/apache/shenyu/disruptor/thread/OrderlyExecutor.java`
#### Snippet
```java
                    .newHasher()
                    .putBytes(bytes)
                    .hash().asBytes();
        }
    }
```

