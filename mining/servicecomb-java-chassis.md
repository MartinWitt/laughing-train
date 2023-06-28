# servicecomb-java-chassis 
 
# Bad smells
I found 553 bad smells with 11 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 74 | false |
| SpringBootApplicationYaml | 50 | false |
| DuplicatedCode | 49 | false |
| SpringXmlModelInspection | 33 | false |
| NullableProblems | 32 | false |
| MissingSerialAnnotation | 26 | false |
| DataFlowIssue | 25 | false |
| RedundantClassCall | 22 | false |
| IfStatementWithIdenticalBranches | 22 | false |
| UnusedAssignment | 17 | false |
| FieldCanBeLocal | 16 | false |
| ConstantValue | 15 | false |
| StringConcatenationInsideStringBufferAppend | 14 | false |
| SimplifyStreamApiCallChains | 11 | false |
| ArraysAsListWithZeroOrOneArgument | 10 | false |
| TrivialStringConcatenation | 9 | false |
| JavadocReference | 9 | false |
| TrivialIf | 9 | false |
| UnparsedCustomBeanInspection | 8 | false |
| JavadocLinkAsPlainText | 8 | false |
| IgnoreResultOfCall | 8 | false |
| CharsetObjectCanBeUsed | 8 | false |
| RedundantMethodOverride | 7 | false |
| UnnecessaryLocalVariable | 7 | true |
| FieldMayBeFinal | 6 | false |
| StringBufferReplaceableByString | 5 | false |
| AutoCloseableResource | 5 | false |
| DuplicateThrows | 4 | false |
| UnnecessaryReturn | 3 | true |
| UnstableApiUsage | 3 | false |
| CommentedOutCode | 2 | false |
| RegExpRedundantEscape | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| SlowListContainsAll | 2 | false |
| StringConcatenationInLoops | 2 | false |
| RedundantLengthCheck | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| RedundantCast | 2 | false |
| UnnecessaryContinue | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| RegExpSimplifiable | 1 | false |
| Deprecation | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| RedundantTypeArguments | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| FuseStreamOperations | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| UnnecessarySemicolon | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| InstantiationOfUtilityClass | 1 | false |
## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java
    convertDefinitions();
    convertOperations();
    for (; ; ) {
      List<Runnable> oldPending = pending;
      pending = new ArrayList<>();
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/ServletUtils.java`
#### Snippet
```java
    if (servlets != null) {
      for (ServletRegistration servletRegistration : servlets) {
        if (!Dynamic.class.isInstance(servletRegistration)) {
          continue;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestParam.java`
#### Snippet
```java
    }

    if (value.getClass().isArray() || Collection.class.isInstance(value)) {
      return (String[]) paramProcessor.convertValue(value, STRING_ARRAY_TYPE);
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/ExceptionFactory.java`
#### Snippet
```java
  public static InvocationException create(StatusType status,
      Object exceptionOrErrorData) {
    if (InvocationException.class.isInstance(exceptionOrErrorData)) {
      return (InvocationException) exceptionOrErrorData;
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/PumpCommon.java`
#### Snippet
```java
    context.runOnContext(v -> readStream.resume());

    if (!AsyncCloseable.class.isInstance(writeStream)) {
      return readFuture;
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/PumpFromPart.java`
#### Snippet
```java
    CompletableFuture<ReadStream<Buffer>> future = new CompletableFuture<>();

    if (ReadStreamPart.class.isInstance(part)) {
      future.complete(((ReadStreamPart) part).getReadStream());
      return future;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/cache/VersionedCache.java`
#### Snippet
```java
    if (data == null) {
      isEmpty = this::isCommonEmpty;
    } else if (Map.class.isInstance(data)) {
      isEmpty = this::isMapEmpty;
    } else if (Collection.class.isInstance(data)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/cache/VersionedCache.java`
#### Snippet
```java
    } else if (Map.class.isInstance(data)) {
      isEmpty = this::isMapEmpty;
    } else if (Collection.class.isInstance(data)) {
      isEmpty = this::isCollectionEmpty;
    } else if (data.getClass().isArray()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/NetUtils.java`
#### Snippet
```java

      if (!isLocalAddress(localHost)) {
        if (Inet6Address.class.isInstance(localHost)) {
          hostAddressIpv6 = trimIpv6(localHost.getHostAddress());
          hostAddress = tryGetHostAddressFromNetworkInterface(false, localHost);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/impl/XmlLoaderUtils.java`
#### Snippet
```java
      Node node = from.getChildNodes().item(idx);

      if (!Element.class.isInstance(node)) {
        continue;
      }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/config/ConfigurePropertyUtils.java`
#### Snippet
```java
  public static Map<String, String> getPropertiesWithPrefix(String prefix) {
    Object config = DynamicPropertyFactory.getBackingConfigurationSource();
    if (!Configuration.class.isInstance(config)) {
      return new HashMap<>();
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
      if (socketAddress.getAddress().isAnyLocalAddress()) {
        String host = NetUtils.getHostAddress();
        if (Inet6Address.class.isInstance(socketAddress.getAddress())) {
          host = NetUtils.getIpv6HostAddress();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseRequestCallback.java`
#### Snippet
```java
    req.setResponseType(overrideResponseType());

    if (!CseHttpEntity.class.isInstance(requestBody)) {
      return;
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
    }

    if (Collection.class.isInstance(value)) {
      Collection<?> collection = (Collection<?>) value;
      if (collection.isEmpty()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
        continue;
      }
      if (Collection.class.isInstance(value)) {
        Collection<?> collection = (Collection<?>) value;
        for (Object part : collection) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/ThreadPoolMetersInitializer.java`
#### Snippet
```java
      }

      if (GroupExecutor.class.isInstance(executor)) {
        createThreadPoolMeters(entry.getKey(), (GroupExecutor) executor);
        continue;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/ThreadPoolMetersInitializer.java`
#### Snippet
```java

  protected void createThreadPoolMeters(String threadPoolName, Executor executor) {
    if (!ThreadPoolExecutor.class.isInstance(executor)) {
      return;
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/publish/spectator/TagFinder.java`
#### Snippet
```java
public interface TagFinder {
  static TagFinder build(Object obj) {
    if (String.class.isInstance(obj)) {
      return new DefaultTagFinder((String) obj);
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/publish/spectator/TagFinder.java`
#### Snippet
```java
    }

    if (TagFinder.class.isInstance(obj)) {
      return (TagFinder) obj;
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/ModelResolverExt.java`
#### Snippet
```java

    Property property = super.resolveProperty(propType, context, annotations, next);
    if (StringProperty.class.isInstance(property)) {
      if (StringPropertyConverter.isEnum((StringProperty) property)) {
        setType(propType, property.getVendorExtensions());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java
    }

    if (ArrayProperty.class.isInstance(property)) {
      return isComplexProperty(((ArrayProperty) property).getItems());
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java

      for (Parameter parameter : operation.getParameters()) {
        if (BodyParameter.class.isInstance(parameter) &&
            ((BodyParameter) parameter).getSchema() == null) {
          throw new ServiceCombException("swagger validator: body parameter schema is empty.");
```

### RedundantClassCall
Redundant call to `isInstance()`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/archaius/sources/AbstractConfigLoader.java`
#### Snippet
```java

    if (objOrder != null) {
      if (Integer.class.isInstance(objOrder)) {
        configModel.setOrder((int) objOrder);
      } else {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (5 lines)
in `core/src/main/java/org/apache/servicecomb/core/SCBApplicationListener.java`
#### Snippet
```java
      //SCBEngine init first, hence we do not need worry that when other beans need use the
      //producer microserviceMeta, the SCBEngine is not inited.
//        String serviceName = RegistryUtils.getMicroservice().getServiceName();
//        SCBEngine.getInstance().setProducerMicroserviceMeta(new MicroserviceMeta(serviceName).setConsumer(false));
//        SCBEngine.getInstance().setProducerProviderManager(applicationContext.getBean(ProducerProviderManager.class));
```

### CommentedOutCode
Commented out code (5 lines)
in `core/src/main/java/org/apache/servicecomb/core/filter/CoreFilterConfiguration.java`
#### Snippet
```java
public class CoreFilterConfiguration {
  //TODO: need remove all component scan or will cause bean conflict with load balance module
//  @Bean
//  @ConditionalOnMissingBean(name = "loadBalanceFilter")
//  public ConsumerFilter loadBalanceFilter() {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java

  public static String escapePackageName(String name) {
    return name.replaceAll("[\\-\\:]", "_");
  }

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/inject/PlaceholderResolver.java`
#### Snippet
```java
 */
public class PlaceholderResolver {
  private static final Pattern PLACEHOLDER_PATTERN = Pattern.compile("(?<escape>\\\\)?\\$\\{(?<name>[^{}]+)\\}");

  static class SplitPart {
```

## RuleId[id=UnparsedCustomBeanInspection]
### UnparsedCustomBeanInspection
Unsupported tag 'rpc-schema' for namespace 'http://www.huawei.com/schema/paas/cse/rpc', please file issue (Help\|Submit a Bug Report...)
in `demo/demo-pojo/pojo-server/src/main/resources/META-INF/spring/pojo.server.bean.xml`
#### Snippet
```java

  <bean id="hello" class="org.apache.servicecomb.demo.pojo.server.HelloImpl"></bean>
  <cse:rpc-schema schema-id="helloworld.Greeter"
    implementation="spring:hello"></cse:rpc-schema>

```

### UnparsedCustomBeanInspection
Unsupported tag 'rpc-schema' for namespace 'http://www.huawei.com/schema/paas/cse/rpc', please file issue (Help\|Submit a Bug Report...)
in `demo/demo-pojo/pojo-server/src/main/resources/META-INF/spring/pojo.server.bean.xml`
#### Snippet
```java
    implementation="spring:hello"></cse:rpc-schema>

  <cse:rpc-schema schema-id="smartcare"
    implementation="org.apache.servicecomb.demo.pojo.server.SmartCareImpl"></cse:rpc-schema>

```

### UnparsedCustomBeanInspection
Unsupported tag 'rpc-schema' for namespace 'http://www.huawei.com/schema/paas/cse/rpc', please file issue (Help\|Submit a Bug Report...)
in `demo/demo-pojo/pojo-server/src/main/resources/META-INF/spring/pojo.server.bean.xml`
#### Snippet
```java
    implementation="org.apache.servicecomb.demo.pojo.server.SmartCareImpl"></cse:rpc-schema>

  <cse:rpc-schema schema-id="SchemaInterface" schema-interface="org.apache.servicecomb.demo.pojo.server.SchemaInterface"
    implementation="org.apache.servicecomb.demo.pojo.server.SchemaInterfaceImpl"></cse:rpc-schema>
</beans>
```

### UnparsedCustomBeanInspection
Unsupported tag 'rpc-reference' for namespace 'http://www.huawei.com/schema/paas/cse/rpc', please file issue (Help\|Submit a Bug Report...)
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
		http://www.huawei.com/schema/paas/cse/rpc classpath:META-INF/spring/spring-paas-cse-rpc.xsd">

  <cse:rpc-reference id="smartcare" microservice-name="pojo"
    schema-id="smartcare" interface="org.apache.servicecomb.demo.smartcare.SmartCare"></cse:rpc-reference>

```

### UnparsedCustomBeanInspection
Unsupported tag 'rpc-reference' for namespace 'http://www.huawei.com/schema/paas/cse/rpc', please file issue (Help\|Submit a Bug Report...)
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="smartcare" interface="org.apache.servicecomb.demo.smartcare.SmartCare"></cse:rpc-reference>

  <cse:rpc-reference id="server" microservice-name="pojo"
    schema-id="server" interface="org.apache.servicecomb.demo.server.Test"></cse:rpc-reference>

```

### UnparsedCustomBeanInspection
Unsupported tag 'rpc-reference' for namespace 'http://www.huawei.com/schema/paas/cse/rpc', please file issue (Help\|Submit a Bug Report...)
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
  </bean>

  <cse:rpc-reference id="codeFirstFromXml" microservice-name="pojo"
    schema-id="org.apache.servicecomb.demo.CodeFirstPojoIntf"></cse:rpc-reference>

```

### UnparsedCustomBeanInspection
Unsupported tag 'rpc-reference' for namespace 'http://www.huawei.com/schema/paas/cse/rpc', please file issue (Help\|Submit a Bug Report...)
in `demo/demo-springmvc/springmvc-client/src/main/resources/META-INF/spring/springmvc.client.bean.xml`
#### Snippet
```java

  <context:component-scan base-package="org.apache.servicecomb.demo.springmvc.client"/>
  <cse:rpc-reference id="controller" microservice-name="springmvc"
    schema-id="controller" interface="org.apache.servicecomb.demo.controller.Controller"></cse:rpc-reference>
</beans>
```

### UnparsedCustomBeanInspection
Unsupported tag 'rpc-reference' for namespace 'http://www.huawei.com/schema/paas/cse/rpc', please file issue (Help\|Submit a Bug Report...)
in `demo/demo-spring-boot-transport/demo-spring-boot-pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
		http://www.huawei.com/schema/paas/cse/rpc classpath:META-INF/spring/spring-paas-cse-rpc.xsd">

  <cse:rpc-reference id="server" microservice-name="pojo"
    schema-id="server" interface="org.apache.servicecomb.demo.springboot.pojo.server.schema.server.Test"></cse:rpc-reference>

```

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-timeLimiter'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
servicecomb:
  matchGroup:
    demo-timeLimiter: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-governanceCache'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        - apiPath:
            prefix: "/timeLimiter"
    demo-governanceCache: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-loadbalance-random'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        - apiPath:
            prefix: "/governanceCache"
    demo-loadbalance-random: |
      matches:
        - serviceName: "loadrandom"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-loadbalance-roundRobin'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      matches:
        - serviceName: "loadrandom"
    demo-loadbalance-roundRobin: |
      matches:
        - serviceName: "loadroundRobin"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-fallback-returnNull'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      matches:
        - serviceName: "loadroundRobin"
    demo-fallback-returnNull: |
      matches:
        - serviceName: "returnNull"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-fallback-ThrowException'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      matches:
        - serviceName: "returnNull"
    demo-fallback-ThrowException: |
      matches:
        - serviceName: "ThrowException"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-faultInject-forceClosed'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      matches:
        - serviceName: "ThrowException"
    demo-faultInject-forceClosed: |
      matches:
        - serviceName: "forceClosed"
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-allOperation'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      matches:
        - serviceName: "forceClosed"
    demo-allOperation: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-rateLimiting'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        - apiPath:
            prefix: "/"
    demo-rateLimiting: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-rateLimiting-servicename'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        - apiPath:
            exact: "/hello"
    demo-rateLimiting-servicename: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.wrong-name-inogred'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
            exact: "/helloServiceName"
          serviceName: "srcService"
    wrong-name-inogred: |
      wrong: some
    demo-retry: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-retry'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
    wrong-name-inogred: |
      wrong: some
    demo-retry: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-circuitBreaker'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        - apiPath:
            exact: "/retry"
    demo-circuitBreaker: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-bulkhead'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        - apiPath:
            exact: "/circuitBreaker"
    demo-bulkhead: |
      matches:
        - name: matchPath
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-bulkhead-priority'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
            x-token:
              exact: token
    demo-bulkhead-priority: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-bulkhead-other'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        - apiPath:
          exact: "/bulkhead"
    demo-bulkhead-other: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-faultInjectDelay'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
          exact: "/bulkhead"
      services: other:1.0
    demo-faultInjectDelay: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-faultInjectAbort'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        - apiPath:
            contains: "/faultInjectDelay"
    demo-faultInjectAbort: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.matchGroup.demo-mapper'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        - apiPath:
            contains: "/faultInjectAbort"
    demo-mapper: |
      matches:
        - apiPath:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.rateLimiting.demo-rateLimiting'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
            prefix: "/mapper"
  rateLimiting:
    demo-rateLimiting: |
      rate: 1
    demo-rateLimiting-servicename: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.rateLimiting.demo-rateLimiting-servicename'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
    demo-rateLimiting: |
      rate: 1
    demo-rateLimiting-servicename: |
      rate: 1
    wrongIngored: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.rateLimiting.wrongIngored'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
    demo-rateLimiting-servicename: |
      rate: 1
    wrongIngored: |
      rate: 0
  identifierRateLimiting:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.identifierRateLimiting.demo-rateLimiting'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      rate: 0
  identifierRateLimiting:
    demo-rateLimiting: |
      rate: 1
      identifier: test
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.identifierRateLimiting.demo-rateLimiting-servicename'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      rate: 1
      identifier: test
    demo-rateLimiting-servicename: |
      rate: 1
      identifier: test
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.timeLimiter.demo-timeLimiter'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      identifier: test
  timeLimiter:
    demo-timeLimiter: |
      timeoutDuration: 2000
      cancelRunningFuture: true
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.timeLimiter.demo-timeLimiter-other'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      timeoutDuration: 2000
      cancelRunningFuture: true
    demo-timeLimiter-other: |
      timeoutDuration: 2000
      cancelRunningFuture: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.cache.demo-governanceCache'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      cancelRunningFuture: false
  cache:
    demo-governanceCache: |
      ttl: 36000000
      maximumSize: 50000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.cache.demo-governanceCache-other'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      maximumSize: 50000
      concurrencyLevel: 10
    demo-governanceCache-other: |
      ttl: 666666
      maximumSize: 50000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.retry.demo-retry'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      concurrencyLevel: 15
  retry:
    demo-retry: |
      maxAttempts: 3
    wrongIngored: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.retry.wrongIngored'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
    demo-retry: |
      maxAttempts: 3
    wrongIngored: |
      maxAttempts: -1
  circuitBreaker:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.circuitBreaker.demo-circuitBreaker'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      maxAttempts: -1
  circuitBreaker:
    demo-circuitBreaker: |
      minimumNumberOfCalls: 2
      slidingWindowSize: 2
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.circuitBreaker.wrongIngored'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      slidingWindowType: COUNT_BASED
      services: myself:1.0,other
    wrongIngored: |
      rules:
        match: demo-circuitBreaker.xx
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.bulkhead.demo-bulkhead'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      minimumNumberOfCalls: -1
  bulkhead:
    demo-bulkhead: |
      order: 1
      maxConcurrentCalls: 1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.bulkhead.demo-bulkhead-priority'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      maxWaitDuration: 3000
      services: myself:1.0
    demo-bulkhead-priority: |
      order: 0
      maxConcurrentCalls: 1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.bulkhead.demo-bulkhead-other'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      maxWaitDuration: 3000
      services: myself:1.0
    demo-bulkhead-other: |
      maxConcurrentCalls: 1
      maxWaitDuration: 3000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.bulkhead.wrongIngored'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      maxWaitDuration: 3000
      services: other:1.0
    wrongIngored: |
      rules:
        match: demo-bulkhead.xx
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.instanceIsolation.demo-allOperation'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      maxWaitDuration: -1
  instanceIsolation:
    demo-allOperation: |
      minimumNumberOfCalls: 2
      slidingWindowSize: 2
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.instanceBulkhead.demo-allOperation'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      waitDurationInOpenState: 1000
  instanceBulkhead:
    demo-allOperation: |
      maxConcurrentCalls: 2
      maxWaitDuration: 10
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.faultInjection.demo-fallback-ThrowException'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      maxWaitDuration: 10
  faultInjection:
    demo-fallback-ThrowException: |
      type: abort
      percentage: 100
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.faultInjection.demo-fallback-returnNull'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      type: abort
      percentage: 100
    demo-fallback-returnNull: |
      fallbackType: ReturnNull
      type: abort
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.faultInjection.demo-faultInject-forceClosed'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      type: abort
      percentage: 100
    demo-faultInject-forceClosed: |
      forceClosed: true
      fallbackType: ReturnNull
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.faultInjection.demo-faultInjectDelay'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      forceClosed: true
      fallbackType: ReturnNull
    demo-faultInjectDelay: |
      delayTime: 2S
      type: delay
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.faultInjection.demo-faultInjectAbort'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      type: delay
      percentage: 100
    demo-faultInjectAbort: |
      type: abort
      percentage: 50
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.faultInjection.wrongIngored'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      percentage: 50
      errorCode: 500
    wrongIngored: |
      delayTime: -1
      type: ERROR
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.faultInjection2.demo-fallback-ThrowException'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      type: ERROR
  faultInjection2:
    demo-fallback-ThrowException: |
      type: abort
      percentage: 100
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.loadbalance.demo-loadbalance-random'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      percentage: 100
  loadbalance:
    demo-loadbalance-random: |
      rule: Random
    demo-loadbalance-roundRobin: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.loadbalance.demo-loadbalance-roundRobin'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
    demo-loadbalance-random: |
      rule: Random
    demo-loadbalance-roundRobin: |
      rule: RoundRobin
  mapper:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.mapper.demo-mapper'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
      rule: RoundRobin
  mapper:
    demo-mapper: |
      target:
        host: 127.0.0.1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.mapper2.demo-mapper'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        port: 8080
  mapper2:
    demo-mapper: |
      target:
        host: 127.0.0.1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'servicecomb.routeRule.test_server1'
in `governance/src/test/resources/application.yaml`
#### Snippet
```java
        port: 9090
  routeRule:
    test_server1: |                              # 服务名
      - precedence: 1                        # 优先级，数字越大，优先级越高。
        match:                               # 请求匹配规则。0..N个，不配置表示匹配。
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java
        return "float";
      case "number:double":
        return "double";
      case "string:null":
        return "string";
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`{1}?` is redundant
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/element/impl/ConfigurableDatetimeAccessItem.java`
#### Snippet
```java

  private String[] splitConfig(String config) {
    return config.split("\\|{1}?", -1);
  }

```

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'org.apache.servicecomb.foundation.vertx.http.AbstractHttpServletResponse'
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/VertxServerResponseToHttpServletResponse.java`
#### Snippet
```java
  @Override
  @Deprecated
  public void setStatus(int sc, String sm) {
    serverResponse.setStatusCode(sc);
    serverResponse.setStatusMessage(sm);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/model/RbacTokenRequest.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("RbacTokenRequest{");
    sb.append("name='").append(name).append('\'');
    sb.append(", password='").append(password).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder permStr` can be replaced with 'String'
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/FilePerm.java`
#### Snippet
```java
   */
  public static Set<PosixFilePermission> getPosixPerm(int perm) {
    StringBuilder permStr = new StringBuilder();

    permStr.append(uCanRead(perm) ? "r" : "-");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/Microservice.java`
#### Snippet
```java

  public static String generateAbsoluteMicroserviceName(String appId, String microserviceName) {
    StringBuilder sb = new StringBuilder(appId.length() + microserviceName.length() + 1);
    sb.append(appId).append(DefinitionConst.APP_SERVICE_SEPARATOR).append(microserviceName);
    return sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/MicroserviceInstance.java`
#### Snippet
```java
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("instanceId=" + instanceId + ";");
    sb.append("serviceId=" + serviceId + ";");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/Holder.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Holder{");
    sb.append("value=").append(value);
    sb.append(", statusCode=").append(statusCode);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/VertxTLSBuilder.java`
#### Snippet
```java

    netServerOptions.setClientAuth(ClientAuth.REQUEST);
    return;
  }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/archaius/scheduler/NeverStartPollingScheduler.java`
#### Snippet
```java
  @Override
  public void stop() {
    return;
  }
}
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/archaius/scheduler/NeverStartPollingScheduler.java`
#### Snippet
```java
  @Override
  protected void schedule(Runnable runnable) {
    return;
  }

```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`feature != null ? feature.extJavaClassInVendor : true` can be simplified to 'feature==null \|\| feature.extJavaClassInVendor'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGeneratorFeature.java`
#### Snippet
```java
  public static boolean isLocalExtJavaClassInVendor() {
    SwaggerGeneratorFeature feature = featureThreadLocal.get();
    return feature != null ? feature.extJavaClassInVendor : true;
  }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/SlowInvocationLogger.java`
#### Snippet
```java
    RestOperationMeta restOperationMeta = invocation.getOperationMeta().getExtData(RestConst.SWAGGER_REST_OPERATION);
    InvocationStageTrace stageTrace = invocation.getInvocationStageTrace();
    invocation.getTraceIdLogger().warn(LOGGER, ""
            + "slow({} ms) invocation, {}:\n"
            + "  http method: {}\n"
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/SlowInvocationLogger.java`
#### Snippet
```java
    RestOperationMeta restOperationMeta = invocation.getOperationMeta().getExtData(RestConst.SWAGGER_REST_OPERATION);
    InvocationStageTrace stageTrace = invocation.getInvocationStageTrace();
    invocation.getTraceIdLogger().warn(LOGGER, ""
            + "slow({} ms) invocation, {}:\n"
            + "  http method: {}\n"
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/SlowInvocationLogger.java`
#### Snippet
```java
    RestOperationMeta restOperationMeta = invocation.getOperationMeta().getExtData(RestConst.SWAGGER_REST_OPERATION);
    InvocationStageTrace stageTrace = invocation.getInvocationStageTrace();
    invocation.getTraceIdLogger().warn(LOGGER, ""
            + "slow({} ms) invocation, {}:\n"
            + "  http method: {}\n"
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      return;
    }
    sb.append(""
        + "consumer:\n"
        + " simple:\n"
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      return;
    }
    sb.append(""
        + "edge:\n"
        + " simple:\n"
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      + "        execute: %-18s handlersResp: %-18s filtersResp: %-18s sendResp   : %s\n";

  private static final String CONSUMER_DETAILS_FORMAT = ""
      + "        prepare     : %-18s handlersReq : %-18s cFiltersReq: %-18s sendReq     : %s\n"
      + "        getConnect  : %-18s writeBuf    : %-18s waitResp   : %-18s wakeConsumer: %s\n"
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      return;
    }
    sb.append(""
        + "producer:\n"
        + " simple:\n"
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java

  //details
  private static final String PRODUCER_DETAILS_FORMAT = ""
      + "        prepare: %-18s queue       : %-18s filtersReq : %-18s handlersReq: %s\n"
      + "        execute: %-18s handlersResp: %-18s filtersResp: %-18s sendResp   : %s\n";
```

### TrivialStringConcatenation
Empty string used in concatenation
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      + "        cFiltersResp: %-18s handlersResp: %s\n";

  private static final String EDGE_DETAILS_FORMAT = ""
      + "        prepare     : %-18s queue       : %-18s sFiltersReq : %-18s handlersReq : %s\n"
      + "        cFiltersReq : %-18s sendReq     : %-18s getConnect  : %-18s writeBuf    : %s\n"
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/OutputStreamToWriteStream.java`
#### Snippet
```java
  @Override
  public synchronized Future<Void> write(Buffer data) {
    Promise<Void> result = Promise.<Void>promise();
    write(data, ar -> {
      if (ar.failed()) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/BufferInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] b, int off, int len) {
    int avail = available();
    if (len > avail) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/BufferInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] b) {
    return read(b, 0, b.length);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/BufferOutputStream.java`
#### Snippet
```java

  @Override
  public void write(byte[] b) {
    write(b, 0, b.length);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/BufferOutputStream.java`
#### Snippet
```java

  @Override
  public void write(byte[] bytes, int offset, int len) {
    byteBuf.writeBytes(bytes, offset, len);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/executor/SinglePoolBlockingExecutor.java`
#### Snippet
```java

  @Override
  public void execute(Runnable command) {
    SINGLE_POOL.execute(() -> {
      try {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/executor/VertxWorkerExecutor.java`
#### Snippet
```java

  @Override
  public void execute(Runnable command) {
    Vertx.currentContext().owner().executeBlocking(future -> command.run(),
        false,
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/executor/VertxContextExecutor.java`
#### Snippet
```java

  @Override
  public void execute(Runnable command) {
    if (context == Vertx.currentContext()) {
      command.run();
```

### NullableProblems
Primitive type members cannot be annotated
in `core/src/main/java/org/apache/servicecomb/core/filter/ConsumerFilter.java`
#### Snippet
```java

public interface ConsumerFilter extends Filter {
  @Nonnull
  @Override
  default boolean isEnabledForInvocationType(InvocationType invocationType) {
```

### NullableProblems
Primitive type members cannot be annotated
in `core/src/main/java/org/apache/servicecomb/core/filter/ProducerFilter.java`
#### Snippet
```java

public interface ProducerFilter extends Filter {
  @Nonnull
  @Override
  default boolean isEnabledForInvocationType(InvocationType invocationType) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/servicecomb/core/executor/LinkedBlockingQueueEx.java`
#### Snippet
```java

  @Override
  public boolean offer(Runnable runnable) {
    // task can come before owner available
    if (owner == null) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/servicecomb/core/executor/GroupThreadFactory.java`
#### Snippet
```java
  }

  public Thread newThread(Runnable r) {
    Thread t = new Thread(group, r,
        namePrefix + threadNumber.getAndIncrement(),
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/servicecomb/core/provider/consumer/SyncResponseExecutor.java`
#### Snippet
```java

  @Override
  public void execute(Runnable cmd) {
    this.cmd = cmd;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/servicecomb/core/executor/GroupExecutor.java`
#### Snippet
```java

  @Override
  public void execute(Runnable command) {
    long threadId = Thread.currentThread().getId();
    Executor executor = threadExecutorMap.computeIfAbsent(threadId, this::chooseExecutor);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/servicecomb/core/executor/ThreadPoolExecutorEx.java`
#### Snippet
```java

  @Override
  public void execute(Runnable command) {
    submittedCount.incrementAndGet();
    try {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/servicecomb/core/provider/consumer/InvokerUtils.java`
#### Snippet
```java

            @Override
            public Thread newThread(Runnable r) {
              Thread thread = new Thread(r, "reactive-retry-pool-thread-" + count.getAndIncrement());
              // avoid block shutdown
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `core/src/main/java/org/apache/servicecomb/core/invocation/endpoint/EndpointCacheUtils.java`
#### Snippet
```java
      .build(new CacheLoader<String, Endpoint>() {
        @Override
        public Endpoint load(String uri) {
          return EndpointCacheUtils.create(uri);
        }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `core/src/main/java/org/apache/servicecomb/core/invocation/endpoint/EndpointCacheUtils.java`
#### Snippet
```java
      .build(new CacheLoader<String, Endpoint>() {
        @Override
        public Endpoint load(String uri) {
          return EndpointCacheUtils.create(uri);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/NamedThreadFactory.java`
#### Snippet
```java
   */
  @Override
  public Thread newThread(Runnable r) {
    return new Thread(r, prefix + "-" + threadNumber.getAndIncrement());
  }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/event/SimpleEventBus.java`
#### Snippet
```java

  @Override
  public void register(Object instance) {
    subscribersMap.computeIfAbsent(instance, this::collectSubscribers);
    // even ignored cause of duplicate register
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/event/SimpleEventBus.java`
#### Snippet
```java

  @Override
  public void unregister(Object instance) {
    if (subscribersMap.remove(instance) != null) {
      subscribersCache = new ConcurrentHashMapEx<>();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `governance/src/main/java/org/apache/servicecomb/governance/handler/DisposableMap.java`
#### Snippet
```java

  @Override
  public Disposable<V> put(String key, Disposable<V> value) {
    Disposable<V> result = super.put(key, value);

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `governance/src/main/java/org/apache/servicecomb/governance/handler/DisposableMap.java`
#### Snippet
```java

  @Override
  public Disposable<V> put(String key, Disposable<V> value) {
    Disposable<V> result = super.put(key, value);

```

### NullableProblems
Primitive type members cannot be annotated
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/EdgeServerCodecFilter.java`
#### Snippet
```java
  }

  @Nonnull
  @Override
  public boolean isEnabledForInvocationType(InvocationType invocationType) {
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/TokenCacheManager.java`
#### Snippet
```java
            .build(new CacheLoader<String, String>() {
              @Override
              public String load(String key) throws Exception {
                return createHeaders();
              }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/TokenCacheManager.java`
#### Snippet
```java
            .build(new CacheLoader<String, String>() {
              @Override
              public String load(String key) throws Exception {
                return createHeaders();
              }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/TokenCacheManager.java`
#### Snippet
```java

              @Override
              public ListenableFuture<String> reload(String key, String oldValue) throws Exception {
                return Futures.submit(() -> createHeaders(), executorService);
              }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/TokenCacheManager.java`
#### Snippet
```java

              @Override
              public ListenableFuture<String> reload(String key, String oldValue) throws Exception {
                return Futures.submit(() -> createHeaders(), executorService);
              }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/TokenCacheManager.java`
#### Snippet
```java

              @Override
              public ListenableFuture<String> reload(String key, String oldValue) throws Exception {
                return Futures.submit(() -> createHeaders(), executorService);
              }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/RemoteServiceRegistry.java`
#### Snippet
```java

          @Override
          public Thread newThread(Runnable r) {
            Thread thread = new Thread(r,
                RemoteServiceRegistry.super.getName() + " Service Center Task [" + (taskId++) + "]");
```

### NullableProblems
Primitive type members cannot be annotated
in `handlers/handler-router/src/main/java/org/apache/servicecomb/router/custom/RouterAddHeaderFilter.java`
#### Snippet
```java
  }

  @Nonnull
  @Override
  public boolean isEnabledForInvocationType(InvocationType invocationType) {
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
  private final LoadingCache<String, Map<String, String>> schemaCache = CacheBuilder.newBuilder()
      .expireAfterAccess(60, TimeUnit.SECONDS).build(new CacheLoader<String, Map<String, String>>() {
        public Map<String, String> load(String key) {
          Holder<List<GetSchemaResponse>> result = getSchemas(key, true, true);
          Map<String, String> schemas = new HashMap<>();
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
  private final LoadingCache<String, Map<String, String>> schemaCache = CacheBuilder.newBuilder()
      .expireAfterAccess(60, TimeUnit.SECONDS).build(new CacheLoader<String, Map<String, String>>() {
        public Map<String, String> load(String key) {
          Holder<List<GetSchemaResponse>> result = getSchemas(key, true, true);
          Map<String, String> schemas = new HashMap<>();
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/servicecomb/core/registry/ThirdServiceRegister.java`
#### Snippet
```java
 * assume a 3rd service:
 *   1. named svc
 *   2. have 2 address: https://svc-1 and https://svc-2
 *   3. have 2 schemas: schema1 and schema2
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/servicecomb/core/registry/ThirdServiceRegister.java`
#### Snippet
```java
 * assume a 3rd service:
 *   1. named svc
 *   2. have 2 address: https://svc-1 and https://svc-2
 *   3. have 2 schemas: schema1 and schema2
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/servicecomb/core/invocation/endpoint/EndpointCacheUtils.java`
#### Snippet
```java

  /**
   * @param uri https://www.abc.com:12345
   * @return endpoint
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/servicecomb/core/invocation/endpoint/EndpointUtils.java`
#### Snippet
```java
  /**
   * <pre>
   *   http://xxx  -> rest://xxx
   *   https://xxx -> rest://xxx?sslEnabled=true
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/servicecomb/core/invocation/endpoint/EndpointUtils.java`
#### Snippet
```java
   * <pre>
   *   http://xxx  -> rest://xxx
   *   https://xxx -> rest://xxx?sslEnabled=true
   *
   *   h2c://xxx   -> rest://xxx?protocol=http2
```

### JavadocLinkAsPlainText
Link specified as plain text
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RegistryWatchHttpClientOptionsSPI.java`
#### Snippet
```java
  /**
   * getIdleTimeoutInSeconds configure watch idle timeout
   * more information see: https://github.com/apache/servicecomb-java-chassis/issues/2571
   * @return watch idle timeout in seconds
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/HttpClientRequestFactory.java`
#### Snippet
```java
/**
 * some service has special domain name rule, eg: k8s<br>
 * assume k8s domain name is https://k8s.com:1234, and clusterId is my-id<br>
 * then must send request to https://my-id.k8s.com:1234<br>
 * <br>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/HttpClientRequestFactory.java`
#### Snippet
```java
 * some service has special domain name rule, eg: k8s<br>
 * assume k8s domain name is https://k8s.com:1234, and clusterId is my-id<br>
 * then must send request to https://my-id.k8s.com:1234<br>
 * <br>
 * this interface allowed to modify host by invocation argument, eg:<br>
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/FormProcessorCreator.java`
#### Snippet
```java
    private final boolean repeatedType;

    private final Type genericParamType;

    private Converter converter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/BodyProcessorCreator.java`
#### Snippet
```java
    protected Class<?> serialViewClass;

    private final boolean isString;

    protected boolean isRequired;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transports/transport-rest/transport-rest-vertx/src/main/java/org/apache/servicecomb/transport/rest/vertx/RestServerVerticle.java`
#### Snippet
```java
  private static final String SSL_KEY = "rest.provider";

  private Endpoint endpoint;

  private URIEndpointObject endpointObject;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/server/TcpParser.java`
#### Snippet
```java

  // 仅仅是header + body，不包括headerLen本身
  private int totalLen;

  private int headerLen;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
  private final Map<String, Object> dynamicData = new ConcurrentHashMap<>();

  private ConfigCenterConfigurationSource configCenterConfigurationSource;

  public ConfigurationSpringInitializer() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/RSAAuthenticationToken.java`
#### Snippet
```java
  private final long generateTime;

  private final String randomCode;

  private final String sign;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dynamic-config/config-kie/src/main/java/org/apache/servicecomb/config/kie/KieConfigurationSourceImpl.java`
#### Snippet
```java
  private KieConfigManager kieConfigManager;

  private ConfigConverter configConverter;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/AccessLogGenerator.java`
#### Snippet
```java
  private final AccessLogItem<RoutingContext>[] accessLogItems;

  private final AccessLogPatternParser<RoutingContext> logPatternParser = new VertxRestAccessLogPatternParser();

  @SuppressWarnings("unchecked")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `handlers/handler-tracing-zipkin/src/main/java/org/apache/servicecomb/tracing/zipkin/ZipkinProviderDelegate.java`
#### Snippet
```java
  private final HttpTracing httpTracing;

  private final Extractor<Invocation> extractor;

  private final HttpServeRequestWrapper requestWrapper;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `handlers/handler-tracing-zipkin/src/main/java/org/apache/servicecomb/tracing/zipkin/ZipkinConsumerDelegate.java`
#### Snippet
```java
  private final HttpTracing httpTracing;

  private final Injector<Invocation> injector;

  private final HttpClientResponseWrapper responseWrapper;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      + "        sFiltersResp: %-18s sendResp    : %s\n";

  private LatencyDistributionConfig latencyDistributionConfig;

  /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/ServiceCenterTask.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(ServiceCenterTask.class);

  private final EventBus eventBus;

  private final int interval;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/IpPortManager.java`
#### Snippet
```java
  InstanceCacheManager instanceCacheManager;

  private final ArrayList<IpPort> defaultIpPort;

  private boolean autoDiscoveryInited = false;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/AbstractServiceRegistry.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(AbstractServiceRegistry.class);

  private final MicroserviceFactory microserviceFactory = new MicroserviceFactory();

  protected EventBus eventBus;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/RestTransportClientManager.java`
#### Snippet
```java

  // same instance in AbstractTransport. need refactor in future.
  private final Vertx transportVertx = VertxUtils.getOrCreateVertxByName("transport", null);

  private final RestTransportClient restClient;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigUtil.java`
#### Snippet
```java
  private static class ServiceCombPropertyUpdateListener implements WatchedUpdateListener {

    private final ConcurrentMapConfiguration injectConfig;

    ServiceCombPropertyUpdateListener(ConcurrentMapConfiguration injectConfig) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Collectors.toList()` is ignored
in `service-registry/registry-local/src/main/java/org/apache/servicecomb/localregistry/LocalRegistryStore.java`
#### Snippet
```java
    List<MicroserviceInstance> instances = new ArrayList<>();

    Collectors.toList();
    microserviceInstanceMap.values().forEach(
        allInstances -> allInstances.values().stream().filter(
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/ServletUtils.java`
#### Snippet
```java

    if (!dir.exists()) {
      dir.mkdirs();
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
  public CompletableFuture<File> saveToFile(String fileName) {
    File file = new File(fileName);
    file.getParentFile().mkdirs();
    OpenOptions openOptions = new OpenOptions().setCreateNew(true);
    return saveToFile(file, openOptions);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `core/src/main/java/org/apache/servicecomb/core/provider/producer/ProducerBootListener.java`
#### Snippet
```java
    }
    if (file.exists()) {
      file.delete();
    }
    try {
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `core/src/main/java/org/apache/servicecomb/core/provider/producer/ProducerBootListener.java`
#### Snippet
```java
    }
    try {
      file.createNewFile();
      FileUtils.writeStringToFile(file, content, StandardCharsets.UTF_8, false);
      file.setReadOnly();
```

### IgnoreResultOfCall
Result of `File.setReadOnly()` is ignored
in `core/src/main/java/org/apache/servicecomb/core/provider/producer/ProducerBootListener.java`
#### Snippet
```java
      file.createNewFile();
      FileUtils.writeStringToFile(file, content, StandardCharsets.UTF_8, false);
      file.setReadOnly();
    } catch (IOException e) {
      LOGGER.error("export swagger content to file failed, message: {}", e.getMessage());
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/part/FilePart.java`
#### Snippet
```java
  @Override
  public void delete() throws IOException {
    file.delete();
  }

```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/task/AbstractTask.java`
#### Snippet
```java
      running = false;
      this.taskPool.shutdown();
      this.taskPool.awaitTermination(10, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      LOGGER.warn("tasks not shutdown in time {}", e.getMessage());
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/WebsocketClientUtil.java`
#### Snippet
```java
            }
          });
          asyncResult.result().closeHandler(onClose::handle);
          asyncResult.result().pongHandler(pong -> {
            // ignore, just prevent NPE.
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `enabled()` is identical to its super method
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/DarklaunchServerListFilter.java`
#### Snippet
```java

  @Override
  public boolean enabled() {
    return true;
  }
```

### RedundantMethodOverride
Method `isGroupingFilter()` is identical to its super method
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/filter/InstancePropertyDiscoveryFilter.java`
#### Snippet
```java

  @Override
  public boolean isGroupingFilter() {
    return false;
  }
```

### RedundantMethodOverride
Method `getBody()` is identical to its super method
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncClientHttpRequest.java`
#### Snippet
```java

  @Override
  public OutputStream getBody() {
    return null;
  }
```

### RedundantMethodOverride
Method `hasExpired()` is identical to its super method
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/vertx/VertxEndpointsMeter.java`
#### Snippet
```java

  @Override
  public boolean hasExpired() {
    return false;
  }
```

### RedundantMethodOverride
Method `measure()` is identical to its super method
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/vertx/VertxEndpointsMeter.java`
#### Snippet
```java

  @Override
  public Iterable<Measurement> measure() {
    return allMeasurements;
  }
```

### RedundantMethodOverride
Method `authHeaders()` is identical to its super method
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/EmptyAuthHeaderProvider.java`
#### Snippet
```java
public class EmptyAuthHeaderProvider implements AuthHeaderProvider {
  @Override
  public Map<String, String> authHeaders() {
    return new HashMap<>(0);
  }
```

### RedundantMethodOverride
Method `beforeSendRequestAsync()` is identical to its super method
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/http/DefaultHttpClientFilter.java`
#### Snippet
```java

  @Override
  public CompletableFuture<Void> beforeSendRequestAsync(Invocation invocation, HttpServletRequestEx requestEx) {
    return CompletableFuture.completedFuture(null);
  }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
interval \* 1000: integer multiplication implicitly cast to long
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/ServiceCenterTaskMonitor.java`
#### Snippet
```java
      this.interval = interval;
    } else {
      if (this.beginTime - this.lastEndTime > interval * 1000 + MAX_TIME_TAKEN) {
        LOGGER.warn("sc task postponed for {}ms for some reason.", this.beginTime - this.lastEndTime);
      }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/FloatWriteSchemas.java`
#### Snippet
```java
    }

    if (Float.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new FloatSchema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/Fixed64WriteSchemas.java`
#### Snippet
```java
    }

    if (Long.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new Fixed64Schema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/SInt32WriteSchemas.java`
#### Snippet
```java
    }

    if (Integer.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new SInt32Schema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/StringWriteSchemas.java`
#### Snippet
```java
    }

    if (String.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new StringSchema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/UInt64WriteSchemas.java`
#### Snippet
```java
    }

    if (Long.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new UInt64Schema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/SInt64WriteSchemas.java`
#### Snippet
```java
    }

    if (Long.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new SInt64Schema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/DoubleWriteSchemas.java`
#### Snippet
```java
    }

    if (Double.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new DoubleSchema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/BoolWriteSchemas.java`
#### Snippet
```java
    }

    if (Boolean.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new BooleanSchema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/SFixed64WriteSchemas.java`
#### Snippet
```java
    }

    if (Long.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new SFixed64Schema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/UInt32WriteSchemas.java`
#### Snippet
```java
    }

    if (Integer.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new UInt32Schema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/EnumWriteSchemas.java`
#### Snippet
```java
public class EnumWriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (propertyDescriptor.getJavaType().isEnumType()) {
      return new EnumSchema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    session.size += totalSize;

    if (tagSize == 1) {
      buffer[offset++] = (byte) tag;
    } else {
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/BytesWriteSchemas.java`
#### Snippet
```java
public class BytesWriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (byte[].class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new BytesSchema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    }

    if (size == 1) {
      buffer[offset] = (byte) value;
    } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    this.size += size;

    if (size == 1) {
      buffer[offset] = (byte) value;
    } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    session.size += size;

    if (size == 1) {
      buffer[offset] = (byte) value;
    } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    session.size += totalSize;

    if (tagSize == 1) {
      buffer[offset++] = (byte) tag;
    } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    session.size += totalSize;

    if (tagSize == 1) {
      buffer[offset++] = (byte) tag;
    } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    session.size += totalSize;

    if (tagSize == 1) {
      buffer[offset++] = (byte) tag;
    } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    }

    if (size == 1) {
      buffer[offset] = (byte) value;
    } else {
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/Fixed32WriteSchemas.java`
#### Snippet
```java
    }

    if (Integer.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new Fixed32Schema<>(protoField, propertyDescriptor);
    }
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/SFixed32WriteSchemas.java`
#### Snippet
```java
    }

    if (Integer.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new SFixed32Schema<>(protoField, propertyDescriptor);
    }
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/VertxServerRequestToHttpServletRequest.java`
#### Snippet
```java
        .filter(fileUpload -> fileUpload.name().equals(name))
        .findFirst();
    if (!upload.isPresent()) {
      LOGGER.debug("No such file with name: {}.", name);
      return null;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/consumer/ConsumerAuthFilter.java`
#### Snippet
```java
  public CompletableFuture<Response> onFilter(Invocation invocation, FilterNode nextNode) {
    Optional<String> token = Optional.ofNullable(authenticationTokenManager.getToken());
    if (!token.isPresent()) {
      return CompletableFuture.failedFuture(
          new InvocationException(Status.SERVICE_UNAVAILABLE, "auth token is not properly configured yet."));
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterRegistration.java`
#### Snippet
```java

  private boolean isListEquals(List<String> one, List<String> two) {
    return one.size() == two.size() && one.containsAll(two) && two.containsAll(one);
  }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterRegistration.java`
#### Snippet
```java

  private boolean isListEquals(List<String> one, List<String> two) {
    return one.size() == two.size() && one.containsAll(two) && two.containsAll(one);
  }

```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `core/src/main/java/org/apache/servicecomb/core/filter/InvocationFilterChains.java`
#### Snippet
```java
          .filter(e -> e.getValue().isEnabledForMicroservice(microserviceName))
          .map(e -> e.getValue())
          .collect(Collectors.toList());
      serviceFilters.sort(Comparator.comparingInt(a -> a.getOrder(invocationType, microserviceName)));
      filterNode = FilterNode.buildChain(serviceFilters);
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLSocketFactoryExt.java`
#### Snippet
```java

  @Override
  public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
    return wrapSocket((SSLSocket) this.sslSocketFactory.createSocket(host, port));
  }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLSocketFactoryExt.java`
#### Snippet
```java
  @Override
  public Socket createSocket(String host, int port, InetAddress localHost,
      int localPort) throws IOException, UnknownHostException {
    return wrapSocket((SSLSocket) this.sslSocketFactory.createSocket(host,
        port,
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/SSLSocketFactoryExt.java`
#### Snippet
```java
  @Override
  public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException,
      UnknownHostException {
    return this.sslSocketFactory.createSocket(host, port, localHost, localPort);
  }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/SSLSocketFactoryExt.java`
#### Snippet
```java

  @Override
  public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
    return this.sslSocketFactory.createSocket(host, port);
  }
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      }
      header = Strings.padEnd(header, leastLatencyScopeStrLength, ' ');
      latencyDistributionHeader += header;

      String format = "%-" + (header.length() - 1) + "d ";
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java

      String format = "%-" + (header.length() - 1) + "d ";
      latencyDistributionFormat += format;
    }
  }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `required` initializer `false` is redundant
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/AbstractParamProcessor.java`
#### Snippet
```java
  protected Object defaultValue;

  protected boolean required = false;

  public Object getDefaultValue() {
```

### UnusedAssignment
Variable `value` initializer `0` is redundant
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/Version.java`
#### Snippet
```java

  private short parseNumber(String name, String allVersion, String version) {
    short value = 0;
    try {
      value = Short.parseShort(version);
```

### UnusedAssignment
Variable `properties` initializer `null` is redundant
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/spring/PaasNamespaceHandler.java`
#### Snippet
```java
  // @Override
  public void init() {
    Properties properties = null;

    try {
```

### UnusedAssignment
Variable `fieldValue` initializer `null` is redundant
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/provider/AccessController.java`
#### Snippet
```java

  private boolean matchMicroserviceField(Microservice microservice, ConfigurationItem item) {
    Object fieldValue = null;
    try {
      fieldValue = new PropertyDescriptor(item.propertyName, Microservice.class).getReadMethod().invoke(microservice);
```

### UnusedAssignment
Variable `value` initializer `0` is redundant
in `handlers/handler-fault-injection/src/main/java/org/apache/servicecomb/faultinjection/FaultInjectionUtil.java`
#### Snippet
```java
   */
  public static int getFaultInjectionConfig(Invocation invocation, String key) {
    int value = 0;
    String config;

```

### UnusedAssignment
Variable `value` initializer `0` is redundant
in `handlers/handler-fault-injection/src/main/java/org/apache/servicecomb/faultinjection/FaultInjectionUtil.java`
#### Snippet
```java
   */
  private static int getConfigValue(String config) {
    int value = 0;
    //first need to check in config center map which has high priority.
    Map<String, AtomicInteger> cfgMap = FaultInjectionUtil.getConfigCenterMap();
```

### UnusedAssignment
Variable `fileKeys` initializer `new ArrayList<>()` is redundant
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java

  //contains all the file key in the parts
  private List<String> fileKeys = new ArrayList<>();

  // gen by httpHeaders
```

### UnusedAssignment
Variable `extractObject` initializer `null` is redundant
in `governance/src/main/java/org/apache/servicecomb/governance/marker/RequestProcessor.java`
#### Snippet
```java

  private CustomMatch getBeanByHandlerName(String customMatcherHandler) {
    Object extractObject = null;
    if (applicationContext.containsBean(customMatcherHandler)) {
      extractObject = applicationContext.getBean(customMatcherHandler);
```

### UnusedAssignment
Variable `extractionHandlerClass` initializer `null` is redundant
in `governance/src/main/java/org/apache/servicecomb/governance/marker/RequestProcessor.java`
#### Snippet
```java

    LOGGER.info("{} {}", customMatcherHandler, infoMessageForCreatingClass);
    Class<?> extractionHandlerClass = null;
    try {
      extractionHandlerClass = Class.forName(customMatcherHandler);
```

### UnusedAssignment
Variable `zoneAndRegion` initializer `new HashMap<>()` is redundant
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/event/RefreshEndpointEvent.java`
#### Snippet
```java
  private static final String SAME_REGION = "sameRegion";

  private Map<String, List<String>> zoneAndRegion = new HashMap<>();

  private String name;
```

### UnusedAssignment
Variable `httpUriRequest` initializer `null` is redundant
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/HttpRequest.java`
#### Snippet
```java
  public HttpUriRequest getRealRequest() {

    HttpUriRequest httpUriRequest = null;

    switch (method) {
```

### UnusedAssignment
Variable `number` initializer `0` is redundant
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/CompatiblePathVersionMapper.java`
#### Snippet
```java
    }

    int number = 0;
    try {
      number = Integer.parseInt(pathVersion.substring(1));
```

### UnusedAssignment
Variable `configArr` initializer `null` is redundant
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/element/impl/ConfigurableDatetimeAccessItem.java`
#### Snippet
```java
   */
  public ConfigurableDatetimeAccessItem(String config) {
    String[] configArr = null;
    if (config.contains("|")) {
      configArr = splitConfig(config);
```

### UnusedAssignment
Variable `executorService` initializer `null` is redundant
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/DataFactory.java`
#### Snippet
```java
  private MonitorDataPublisher publisher;

  private ScheduledExecutorService executorService = null;


```

### UnusedAssignment
Variable `hostName` initializer `""` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/MicroserviceInstanceRegisterTask.java`
#### Snippet
```java
  protected boolean doRegister() {
    LOGGER.info("running microservice instance register task.");
    String hostName = "";
    if (serviceRegistryConfig.isPreferIpAddress()) {
      hostName = RegistrationManager.getPublishAddress();
```

### UnusedAssignment
Variable `defaultTransport` initializer `"rest"` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/refresh/ClassificationAddress.java`
#### Snippet
```java
  private static final String MONITORING_KEY = "CseMonitoring@default@@0.0.0.0+";

  private String defaultTransport = "rest";

  private final boolean isAutoRefresh;
```

### UnusedAssignment
Variable `cseResponse` initializer `null` is redundant
in `swagger/swagger-invocation/invocation-springmvc/src/main/java/org/apache/servicecomb/swagger/invocation/springmvc/response/SpringmvcProducerResponseMapper.java`
#### Snippet
```java
        springmvcResponse.getStatusCode().getReasonPhrase());

    Response cseResponse = null;
    if (HttpStatus.isSuccess(responseStatus)) {
      cseResponse = realMapper.mapResponse(responseStatus, springmvcResponse.getBody());
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestOperationMeta.java`
#### Snippet
```java
    }

    defaultProcessor = produceProcessorMap.values().stream().findFirst().get();
    produceProcessorMap.putIfAbsent(MediaType.WILDCARD, defaultProcessor);
  }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `type` is always 'null'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestOperationMeta.java`
#### Snippet
```java
    final BodyParameter bodyParameter = (BodyParameter) parameter;
    if (!(bodyParameter.getSchema() instanceof ModelImpl)) {
      return type;
    }
    final Property additionalProperties = ((ModelImpl) bodyParameter.getSchema()).getAdditionalProperties();
```

### ConstantValue
Condition `interfaces != null` is always `true`
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/TrustManagerExt.java`
#### Snippet
```java
          Enumeration<NetworkInterface> interfaces =
              NetworkInterface.getNetworkInterfaces();
          if (interfaces != null) {
            while (interfaces.hasMoreElements()) {
              NetworkInterface nif = interfaces.nextElement();
```

### ConstantValue
Condition `totalLen == 0` is always `false`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/server/TcpParser.java`
#### Snippet
```java
        }

        if (totalLen == 0) {
          onReadOnePackage(null, null);
          return;
```

### ConstantValue
Value `propertySource` is always 'null'
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
      return;
    }
    if (propertySource instanceof EnumerablePropertySource) {
      EnumerablePropertySource<?> enumerablePropertySource = (EnumerablePropertySource<?>) propertySource;
      for (String propertyName : enumerablePropertySource.getPropertyNames()) {
```

### ConstantValue
Condition `value instanceof Resource` is always `false`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/PartUtils.java`
#### Snippet
```java
    }

    if (value instanceof Resource) {
      return new ResourcePart(name, (Resource) value);
    }
```

### ConstantValue
Value `address` is always 'null'
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
  public static String getPublishAddress(String schema, String address) {
    if (address == null) {
      return address;
    }

```

### ConstantValue
Condition `ipPort == null` is always `false`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
      URI originalURI = new URI(schema + "://" + address);
      IpPort ipPort = NetUtils.parseIpPort(originalURI);
      if (ipPort == null) {
        LOGGER.warn("address {} not valid.", address);
        return null;
```

### ConstantValue
Value `propertySource` is always 'null'
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java
      return;
    }
    if (propertySource instanceof EnumerablePropertySource) {
      EnumerablePropertySource<?> enumerablePropertySource = (EnumerablePropertySource<?>) propertySource;
      Collections.addAll(allKeys, enumerablePropertySource.getPropertyNames());
```

### ConstantValue
Condition `printDetail` is always `true`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/ServerEndpointsLogPublisher.java`
#### Snippet
```java

    for (MeasurementNode address : measurementNode.getChildren().values()) {
      if (printDetail) {
        appendLine(sb, "      %-12.0f %-15.0f %-13.0f %-11.0f %-8.0f %-7.0f %-9s %-12s %s",
            address.findChild(EndpointMeter.CONNECT_COUNT).summary(),
```

### ConstantValue
Value `value` is always 'true'
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
  public void writeScalarBool(int tag, int tagSize, boolean value) {
    if (value) {
      writeBool(tag, tagSize, value);
    }
  }
```

### ConstantValue
Condition `first.getClass() == String.class` is always `false`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumNotPackedWriteSchemas.java`
#### Snippet
```java
        }

        if (first.getClass() == String.class) {
          writeStringCollection(output, (Collection<String>) (Object) collection);
          return;
```

### ConstantValue
Condition `first.getClass() == String.class` is always `false`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumPackedWriteSchemas.java`
#### Snippet
```java
        }

        if (first.getClass() == String.class) {
          writeStringCollection(output, (Collection<String>) (Object) collection);
          return;
```

### ConstantValue
Result of `apiOperation.hidden()` is always 'true'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/utils/MethodUtils.java`
#### Snippet
```java
    ApiOperation apiOperation = method.getAnnotation(ApiOperation.class);
    if (apiOperation != null && apiOperation.hidden()) {
      return apiOperation.hidden();
    }

```

### ConstantValue
Condition `genericResponseType instanceof ParameterizedType` is always `true`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/response/DefaultResponseTypeProcessor.java`
#### Snippet
```java
    //   responseRawType is ResponseEntity
    Type responseRawType = genericResponseType;
    if (genericResponseType instanceof ParameterizedType) {
      responseRawType = ((ParameterizedType) genericResponseType).getRawType();
    }
```

### ConstantValue
Result of `apiOperation.hidden()` is always 'true'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractSwaggerGenerator.java`
#### Snippet
```java
    ApiOperation apiOperation = method.getAnnotation(ApiOperation.class);
    if (apiOperation != null && apiOperation.hidden()) {
      return apiOperation.hidden();
    }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/MicroserviceInstance.java`
#### Snippet
```java
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("instanceId=" + instanceId + ";");
    sb.append("serviceId=" + serviceId + ";");
    sb.append("status=" + status + ";");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/MicroserviceInstance.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    sb.append("instanceId=" + instanceId + ";");
    sb.append("serviceId=" + serviceId + ";");
    sb.append("status=" + status + ";");
    sb.append("endpoints=" + endpoints.toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/MicroserviceInstance.java`
#### Snippet
```java
    sb.append("instanceId=" + instanceId + ";");
    sb.append("serviceId=" + serviceId + ";");
    sb.append("status=" + status + ";");
    sb.append("endpoints=" + endpoints.toString());
    return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/MicroserviceInstance.java`
#### Snippet
```java
    sb.append("serviceId=" + serviceId + ";");
    sb.append("status=" + status + ";");
    sb.append("endpoints=" + endpoints.toString());
    return sb.toString();
  }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
    registrationList.forEach(registration -> {
      if (first.getAndSet(false)) {
        result.append("App ID: " + registration.getAppId() + "\n");
        result.append("Service Name: " + registration.getMicroservice().getServiceName() + "\n");
        result.append("Version: " + registration.getMicroservice().getVersion() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
      if (first.getAndSet(false)) {
        result.append("App ID: " + registration.getAppId() + "\n");
        result.append("Service Name: " + registration.getMicroservice().getServiceName() + "\n");
        result.append("Version: " + registration.getMicroservice().getVersion() + "\n");
        result.append("Environment: " + registration.getMicroservice().getEnvironment() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
        result.append("App ID: " + registration.getAppId() + "\n");
        result.append("Service Name: " + registration.getMicroservice().getServiceName() + "\n");
        result.append("Version: " + registration.getMicroservice().getVersion() + "\n");
        result.append("Environment: " + registration.getMicroservice().getEnvironment() + "\n");
        result.append("Endpoints: " + getEndpoints(registration.getMicroserviceInstance().getEndpoints()) + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
        result.append("Service Name: " + registration.getMicroservice().getServiceName() + "\n");
        result.append("Version: " + registration.getMicroservice().getVersion() + "\n");
        result.append("Environment: " + registration.getMicroservice().getEnvironment() + "\n");
        result.append("Endpoints: " + getEndpoints(registration.getMicroserviceInstance().getEndpoints()) + "\n");
        result.append("Registration implementations:\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
        result.append("Version: " + registration.getMicroservice().getVersion() + "\n");
        result.append("Environment: " + registration.getMicroservice().getEnvironment() + "\n");
        result.append("Endpoints: " + getEndpoints(registration.getMicroserviceInstance().getEndpoints()) + "\n");
        result.append("Registration implementations:\n");
      }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
      }

      result.append("  name:" + registration.name() + "\n");
      result.append("    Service ID: " + registration.getMicroservice().getServiceId() + "\n");
      result.append("    Instance ID: " + registration.getMicroserviceInstance().getInstanceId() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java

      result.append("  name:" + registration.name() + "\n");
      result.append("    Service ID: " + registration.getMicroservice().getServiceId() + "\n");
      result.append("    Instance ID: " + registration.getMicroserviceInstance().getInstanceId() + "\n");
    });
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
      result.append("  name:" + registration.name() + "\n");
      result.append("    Service ID: " + registration.getMicroservice().getServiceId() + "\n");
      result.append("    Instance ID: " + registration.getMicroserviceInstance().getInstanceId() + "\n");
    });
    return result.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/WebsocketClientUtil.java`
#### Snippet
```java
    SignRequest signReq = new SignRequest();
    StringBuilder endpoint = new StringBuilder("https://" + ipPort.getHostOrIp());
    endpoint.append(":" + ipPort.getPort());
    endpoint.append(url);
    try {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/inject/PlaceholderResolver.java`
#### Snippet
```java

          if (part.fullName.startsWith("$")) {
            sb.append("\\" + part.fullName);
            continue;
          }
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `Collections.EMPTY_LIST` is always empty
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/log/AbstractMarker.java`
#### Snippet
```java
  @Override
  public Iterator<Marker> iterator() {
    return Collections.EMPTY_LIST.iterator();
  }

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/JvmUtils.java`
#### Snippet
```java
    String mainClass = null;
    StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
    if (stackTrace != null && stackTrace.length > 0) {
      for (StackTraceElement stackTraceElement : stackTrace) {
        if ("main".equals(stackTraceElement.getMethodName())) {
```

### RedundantLengthCheck
Redundant array length check
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/ApiOperationProcessor.java`
#### Snippet
```java

  private void convertTags(String[] tags, Operation operation) {
    if (tags == null || tags.length == 0) {
      return;
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `EnumerablePropertySource`
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java

  /**
   * Get property names from {@link EnumerablePropertySource}, and get property value from {@link ConfigurableEnvironment#getProperty(String)}
   */
  private void getProperties(ConfigurableEnvironment environment, PropertySource<?> propertySource,
```

### JavadocReference
Cannot resolve symbol `ConfigurableEnvironment`
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java

  /**
   * Get property names from {@link EnumerablePropertySource}, and get property value from {@link ConfigurableEnvironment#getProperty(String)}
   */
  private void getProperties(ConfigurableEnvironment environment, PropertySource<?> propertySource,
```

### JavadocReference
Cannot resolve symbol `getProperty(String)`
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java

  /**
   * Get property names from {@link EnumerablePropertySource}, and get property value from {@link ConfigurableEnvironment#getProperty(String)}
   */
  private void getProperties(ConfigurableEnvironment environment, PropertySource<?> propertySource,
```

### JavadocReference
Cannot resolve symbol `Conditional`
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
  /**
   * make springboot have a change to add microservice.yaml source earlier<br>
   * to affect {@link Conditional}
   * @param environment environment
   */
```

### JavadocReference
Cannot resolve symbol `PropertySource`
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java

  /**
   * Traversal all {@link PropertySource} of {@link ConfigurableEnvironment}, and try to get all properties.
   */
  private Map<String, Object> getAllProperties(Environment environment) {
```

### JavadocReference
Cannot resolve symbol `ConfigurableEnvironment`
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java

  /**
   * Traversal all {@link PropertySource} of {@link ConfigurableEnvironment}, and try to get all properties.
   */
  private Map<String, Object> getAllProperties(Environment environment) {
```

### JavadocReference
Cannot resolve symbol `org.springframework.aop.framework.AopProxyUtils`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/BeanUtils.java`
#### Snippet
```java
   * @param bean the instance to get implemented class from
   * @return the implemented class (if the checked class is proxied, return the ultimate target class)
   * @see org.springframework.aop.framework.AopProxyUtils#ultimateTargetClass
   */
  public static Class<?> getImplClassFromBean(Object bean) {
```

### JavadocReference
Cannot resolve symbol `ultimateTargetClass`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/BeanUtils.java`
#### Snippet
```java
   * @param bean the instance to get implemented class from
   * @return the implemented class (if the checked class is proxied, return the ultimate target class)
   * @see org.springframework.aop.framework.AopProxyUtils#ultimateTargetClass
   */
  public static Class<?> getImplClassFromBean(Object bean) {
```

### JavadocReference
Cannot resolve symbol `Conditional`
in `spring-boot/spring-boot-starters/java-chassis-spring-boot-starter/src/main/java/org/apache/servicecomb/springboot/starter/ConfigurationSpringBootInitializer.java`
#### Snippet
```java
/**
 * when run with springboot, add microservice.yaml to Environment earlier<br>
 * to affect {@link Conditional}<br>
 */
public class ConfigurationSpringBootInitializer implements EnvironmentPostProcessor {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/KeyPairUtils.java`
#### Snippet
```java

  private static final String KEY_GENERATOR_ALGORITHM = DynamicPropertyFactory.getInstance()
      .getStringProperty("servicecomb.publicKey.accessControl.keyGeneratorAlgorithm", "RSA").get();;

  private static final String SIGN_ALG = DynamicPropertyFactory.getInstance()
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getAccessURL` may produce `NullPointerException`
in `dynamic-config/config-cc/src/main/java/org/apache/servicecomb/config/ConfigCenterConfig.java`
#### Snippet
```java
  public List<String> getServerUri() {
    return Deployment.getSystemBootStrapInfo(ConfigCenterDefaultDeploymentProvider.SYSTEM_KEY_CONFIG_CENTER)
        .getAccessURL();
  }

```

### DataFlowIssue
Method invocation `getAccessURL` may produce `NullPointerException`
in `dynamic-config/config-cc/src/main/java/org/apache/servicecomb/config/ConfigCenterConfigurationSourceImpl.java`
#### Snippet
```java
    return new ConfigCenterAddressManager(ConfigCenterConfig.INSTANCE.getDomainName(),
        Deployment
            .getSystemBootStrapInfo(ConfigCenterDefaultDeploymentProvider.SYSTEM_KEY_CONFIG_CENTER).getAccessURL(),
        EventManager.getEventBus());
  }
```

### DataFlowIssue
Method invocation `getName` will produce `NullPointerException`
in `core/src/main/java/org/apache/servicecomb/core/filter/impl/JacksonPropertyNodeNameProvider.java`
#### Snippet
```java
    }

    return property.getName();
  }

```

### DataFlowIssue
Method invocation `getName` will produce `NullPointerException`
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
    }

    LOGGER.debug("a none EnumerablePropertySource is ignored, propertySourceName = [{}]", propertySource.getName());
  }

```

### DataFlowIssue
Method invocation `getActuator` may produce `NullPointerException`
in `core/src/main/java/org/apache/servicecomb/core/provider/consumer/InvokerUtils.java`
#### Snippet
```java
    // governance implementations.
    RetryHandler retryHandler = BeanUtils.getBean(RetryHandler.class);
    Retry retry = retryHandler.getActuator(request);
    if (retry != null) {
      dcs.withRetry(retry, getOrCreateRetryPool());
```

### DataFlowIssue
Argument `fileName` might be null
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/http/HttpUtils.java`
#### Snippet
```java
    fileName = StringUtils.isEmpty(fileName) ? "default" : fileName;
    fileName = uriDecodePath(fileName);
    return new File(fileName).getName();
  }

```

### DataFlowIssue
Method invocation `getReturnType` may produce `NullPointerException`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/LambdaMetafactoryUtils.java`
#### Snippet
```java
      MethodHandle methodHandle = LOOKUP.unreflect(instanceMethod);

      MethodType intfMethodType = MethodType.methodType(intfMethod.getReturnType(), intfMethod.getParameterTypes());

      // the return type of fluent setter is object instead of void, but we can assume the return type is void. it doesn't matter
```

### DataFlowIssue
Method invocation `getReturnType` may produce `NullPointerException`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/LambdaMetafactoryUtils.java`
#### Snippet
```java
      MethodHandle methodHandle = LOOKUP.unreflect(instanceMethod);

      MethodType intfMethodType = MethodType.methodType(intfMethod.getReturnType(), intfMethod.getParameterTypes());
      MethodType instanceMethodType = MethodType
          .methodType(instanceMethod.getReturnType(), instanceMethod.getParameterTypes());
```

### DataFlowIssue
Method invocation `format` may produce `NullPointerException`
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/consumer/ConsumerTokenManager.java`
#### Snippet
```java
      return null;
    }
    return token.format();
  }

```

### DataFlowIssue
Argument `restControllerCls` might be null
in `providers/provider-rest-common/src/main/java/org/apache/servicecomb/provider/rest/common/RestProducers.java`
#### Snippet
```java
    }

    if (scanRestController && beanCls.getAnnotation(restControllerCls) != null) {
      ProducerMeta producerMeta = new ProducerMeta(beanCls.getName(), bean);
      producerMetaList.add(producerMeta);
```

### DataFlowIssue
Method invocation `ping` may produce `NullPointerException`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
      inUseInstances.stream().forEach(instance -> {
        if (!mergedInstances.instanceIdMap.containsKey(instance.getInstanceId())) {
          if (ping.ping(instance)) {
            mergedInstances.addInstance(instance);
          }
```

### DataFlowIssue
Condition `CseHttpEntity.class.isInstance(requestBody)` is redundant and can be replaced with a null check
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncRequestCallback.java`
#### Snippet
```java
    }

    if (!CseHttpEntity.class.isInstance(requestBody)) {
      return;
    }
```

### DataFlowIssue
Method invocation `getName` will produce `NullPointerException`
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java

    LOGGER.debug("None EnumerablePropertySource ignored in {}, propertySourceName = [{}]", this.getClass().getName(),
        propertySource.getName());
  }

```

### DataFlowIssue
Method invocation `getHost` may produce `NullPointerException`
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/AbstractAddressManager.java`
#### Snippet
```java
    URI ipPort = parseIpPortFromURI(address);
    try (Socket s = new Socket()) {
      s.connect(new InetSocketAddress(ipPort.getHost(), ipPort.getPort()), 3000);
      return true;
    } catch (IOException e) {
```

### DataFlowIssue
Method invocation `createLoadBalancerRule` may produce `NullPointerException`
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/CommonHttpEdgeDispatcher.java`
#### Snippet
```java

  private LoadBalancer createLoadBalancer(String microserviceName) {
    RuleExt rule = BeanUtils.getBean(ExtensionsManager.class).createLoadBalancerRule(microserviceName);
    return new LoadBalancer(rule, microserviceName);
  }
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/parser/impl/VertxRestAccessLogPatternParser.java`
#### Snippet
```java

    return rawPattern.substring(
        accessLogItemLocation.prefixIndex + accessLogItemLocation.getPrefix().length(),
        accessLogItemLocation.suffixIndex);
  }
```

### DataFlowIssue
Method invocation `trim` may produce `NullPointerException`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/os/cpu/CpuUtils.java`
#### Snippet
```java

  public static String[] readAndSplitFirstLine(File file) throws IOException {
    return Files.asCharSource(file, StandardCharsets.UTF_8).readFirstLine().trim().split("\\s+");
  }

```

### DataFlowIssue
Dereference of `fieldSchema` may produce `NullPointerException`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/PropertyWrapperRepeatedWriteSchemas.java`
#### Snippet
```java
        for (Object element : array) {
          if (element != null) {
            output.writeObject(tag, tagSize, element, fieldSchema::writeTo);
            continue;
          }
```

### DataFlowIssue
Dereference of `fieldSchema` may produce `NullPointerException`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/PropertyWrapperRepeatedWriteSchemas.java`
#### Snippet
```java
        for (Object element : collection) {
          if (element != null) {
            output.writeObject(tag, tagSize, element, fieldSchema::writeTo);
            continue;
          }
```

### DataFlowIssue
Casting `Arrays.asList(...).toArray()` to `String[]` will produce `ClassCastException` for any non-null value
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RequestParam.java`
#### Snippet
```java
      queryParams.put(key, new String[] {value});
    } else {
      queryParams.put(key, (String[]) Arrays.asList(queryParams.get(key), value).toArray());
    }
    return this;
```

### DataFlowIssue
Method invocation `getFilteredListOfServers` may produce `NullPointerException`
in `handlers/handler-router/src/main/java/org/apache/servicecomb/router/custom/RouterServerListFilter.java`
#### Snippet
```java
    headers = filterHeaders(headers);
    return routerFilter
        .getFilteredListOfServers(list, targetServiceName, headers,
            routerDistributor);
  }
```

### DataFlowIssue
Method invocation `entrySet` may produce `NullPointerException`
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/RestClientEncoder.java`
#### Snippet
```java

      StringBuilder builder = new StringBuilder();
      for (Entry<String, String> entry : cookieMap.entrySet()) {
        builder.append(entry.getKey())
            .append('=')
```

### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/unittest/UnitTestSwaggerUtils.java`
#### Snippet
```java
  public static void testException(String expectMsgLevel1, String expectMsgLevel2, Class<?> cls, String... methods) {
    Throwable exception = getException(cls, methods);
    Assertions.assertEquals(expectMsgLevel1, exception.getMessage());
    Assertions.assertEquals(expectMsgLevel2, exception.getCause().getMessage());
  }
```

### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/unittest/UnitTestSwaggerUtils.java`
#### Snippet
```java
      String... methods) {
    Throwable exception = getException(cls, methods);
    Assertions.assertEquals(expectMsgLevel1, exception.getMessage());
    Assertions.assertEquals(expectMsgLevel2, exception.getCause().getMessage());
    Assertions.assertEquals(expectMsgLevel3, exception.getCause().getCause().getMessage());
```

### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/unittest/UnitTestSwaggerUtils.java`
#### Snippet
```java
  public static void testException(String expectMsg, Class<?> cls, String... methods) {
    Throwable exception = getException(cls, methods);
    Assertions.assertEquals(expectMsg, exception.getMessage());
  }
}
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `service-registry/registry-local/src/main/java/org/apache/servicecomb/localregistry/LocalRegistryStore.java`
#### Snippet
```java

  public List<Microservice> getAllMicroservices() {
    return microserviceMap.values().stream().collect(Collectors.toList());
  }

```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `clients/config-kie-client/src/main/java/org/apache/servicecomb/config/kie/client/KieClient.java`
#### Snippet
```java
        .filter(doc -> doc.getStatus() == null || ConfigConstants.STATUS_ENABLED.equalsIgnoreCase(doc.getStatus()))
        .map(this::processValueType)
        .collect(Collectors.toList())
        .forEach(resultMap::putAll);
    return resultMap;
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `core/src/main/java/org/apache/servicecomb/core/filter/InvocationFilterChains.java`
#### Snippet
```java
      List<Filter> serviceFilters = filters.entrySet().stream()
          .filter(e -> e.getValue().isEnabledForMicroservice(microserviceName))
          .map(e -> e.getValue())
          .collect(Collectors.toList());
      serviceFilters.sort(Comparator.comparingInt(a -> a.getOrder(invocationType, microserviceName)));
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `core/src/main/java/org/apache/servicecomb/core/definition/MicroserviceMeta.java`
#### Snippet
```java

    schemaMeta.getOperations().values().stream()
        .forEach(operationMeta -> operationMetas.put(operationMeta.getMicroserviceQualifiedName(), operationMeta));

    return schemaMeta;
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
      Collection<MicroserviceInstance> inUseInstances) {
    MergedInstances mergedInstances = new MergedInstances();
    pulledInstances.stream().forEach(mergedInstances::addInstance);
    MicroserviceInstancePing ping = SPIServiceUtils.getPriorityHighestService(MicroserviceInstancePing.class);

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
        .isEmptyInstanceProtectionEnabled()) {

      inUseInstances.stream().forEach(instance -> {
        if (!mergedInstances.instanceIdMap.containsKey(instance.getInstanceId())) {
          if (ping.ping(instance)) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `governance/src/main/java/org/apache/servicecomb/router/model/ServiceInfoCache.java`
#### Snippet
```java
      policyRuleItem.setTotal(rule.stream().mapToInt(RouteItem::getWeight).sum());
    }
    rule.stream().forEach(RouteItem::addCurrentWeight);
    int maxIndex = 0, maxWeight = -1;
    for (int i = 0; i < rule.size(); i++) {
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/publish/spectator/MeasurementGroupConfig.java`
#### Snippet
```java
        Arrays
            .asList(tagNameOrFinders)
            .stream()
            .map(TagFinder::build)
            .collect(Collectors.toList()));
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
          Map<String, String> schemas = new HashMap<>();
          if (result.getStatusCode() == Status.OK.getStatusCode()) {
            result.value.stream().forEach(r -> schemas.put(r.getSchemaId(), r.getSchema()));
          }
          return schemas;
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractOperationGenerator.java`
#### Snippet
```java
    if (parameter instanceof AbstractSerializableParameter) {
      io.swagger.util.ParameterProcessor.applyAnnotations(swagger, parameter, type, annotations);
      annotations.stream().forEach(annotation -> {
        if (NOT_NULL_ANNOTATIONS.contains(annotation.annotationType().getSimpleName())){
          parameter.setRequired(true);
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractOperationGenerator.java`
#### Snippet
```java
    for (Annotation annotation : Arrays.stream(method.getAnnotations())
            .sorted(Comparator.comparing(a -> a.annotationType().getName()))
            .collect(Collectors.toList())
    ) {
      MethodAnnotationProcessor<Annotation> processor = findMethodAnnotationProcessor(annotation.annotationType());
```

## RuleId[id=MissingSerialAnnotation]
### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/exception/OperationException.java`
#### Snippet
```java
public class OperationException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public OperationException() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/exception/RuntimeExceptionWithoutStackTrace.java`
#### Snippet
```java

public class RuntimeExceptionWithoutStackTrace extends RuntimeException {
  private static final long serialVersionUID = -1L;

  public RuntimeExceptionWithoutStackTrace() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/RestServlet.java`
#### Snippet
```java
 */
public class RestServlet extends HttpServlet {
  private static final long serialVersionUID = 5797523329773923112L;

  private static final Logger LOGGER = LoggerFactory.getLogger(RestServlet.class);
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestOperationComparator.java`
#### Snippet
```java
public class RestOperationComparator implements Serializable, Comparator<RestOperationMeta> {

  private static final long serialVersionUID = -2364909265520813678L;

  @Override
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `swagger/swagger-generator/generator-spring-data/src/main/java/org/apache/servicecomb/swagger/generator/springdata/SpringDataModule.java`
#### Snippet
```java

public class SpringDataModule extends SimpleModule implements SPIOrder {
  private static final long serialVersionUID = 1L;

  @JsonDeserialize(as = PageImpl.class)
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `clients/config-common/src/main/java/org/apache/servicecomb/config/common/exception/OperationException.java`
#### Snippet
```java

public class OperationException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public OperationException(String message) {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/producer/codec/ArgWrapperJavaType.java`
#### Snippet
```java

public class ArgWrapperJavaType extends SimpleType {
  private static final long serialVersionUID = 964882360361204479L;

  static class ArgInfo {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/InvocationException.java`
#### Snippet
```java
 */
public class InvocationException extends RuntimeException {
  private static final long serialVersionUID = 8027482777502649656L;

  /**
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `core/src/main/java/org/apache/servicecomb/core/executor/LinkedBlockingQueueEx.java`
#### Snippet
```java

public class LinkedBlockingQueueEx extends LinkedBlockingQueue<Runnable> {
  private static final long serialVersionUID = -1L;

  private transient volatile ThreadPoolExecutorEx owner = null;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `core/src/main/java/org/apache/servicecomb/core/exception/CseException.java`
#### Snippet
```java
public class CseException extends RuntimeException {

  private static final long serialVersionUID = 8027482777502649656L;

  private final String code;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `service-registry/registry-lightweight/src/main/java/org/apache/servicecomb/registry/lightweight/RegisterException.java`
#### Snippet
```java

public class RegisterException extends RuntimeException {
  private static final long serialVersionUID = 4130899909889771251L;

  public RegisterException(String message) {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/AbstractRestObjectMapper.java`
#### Snippet
```java

public abstract class AbstractRestObjectMapper extends ObjectMapper {
  private static final long serialVersionUID = 189026839992490564L;

  public AbstractRestObjectMapper() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/RestObjectMapper.java`
#### Snippet
```java
  }

  private static final long serialVersionUID = -8158869347066287575L;

  private static final JavaType STRING_JAVA_TYPE = TypeFactory.defaultInstance().constructType(String.class);
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/json/PartModule.java`
#### Snippet
```java

public class PartModule extends SimpleModule implements SPIOrder {
  private static final long serialVersionUID = 4201325332650814739L;

  public PartModule() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/json/JavaxServletPartSerializer.java`
#### Snippet
```java
// 什么情况下用？
public class JavaxServletPartSerializer extends StdSerializer<Part> {
  private static final long serialVersionUID = 348443113789878443L;

  public JavaxServletPartSerializer() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/exceptions/ServiceCombException.java`
#### Snippet
```java

public class ServiceCombException extends RuntimeException {
  private static final long serialVersionUID = -1085233183289520695L;

  public ServiceCombException(String cause, Throwable throwable) {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/concurrent/ConcurrentHashMapEx.java`
#### Snippet
```java

public class ConcurrentHashMapEx<K, V> extends ConcurrentHashMap<K, V> {
  private static final long serialVersionUID = -7753722464102569902L;

  public ConcurrentHashMapEx() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `governance/src/main/java/org/apache/servicecomb/router/exception/RouterIllegalParamException.java`
#### Snippet
```java
public class RouterIllegalParamException extends RuntimeException {

  private static final long serialVersionUID = 4359709211352400087L;

  public RouterIllegalParamException(String message) {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `governance/src/main/java/org/apache/servicecomb/governance/marker/operator/RawOperator.java`
#### Snippet
```java

public class RawOperator extends HashMap<String, String> {
  private static final long serialVersionUID = 659728839992490564L;
}

```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `governance/src/main/java/org/apache/servicecomb/governance/handler/DisposableMap.java`
#### Snippet
```java
 */
public class DisposableMap<V> extends ConcurrentHashMap<String, Disposable<V>> {
  private static final long serialVersionUID = 7249069246763182397L;

  public interface RemoveListener {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `governance/src/main/java/org/apache/servicecomb/governance/exception/IllegalArgsOperatorException.java`
#### Snippet
```java

public class IllegalArgsOperatorException extends RuntimeException {
  private static final long serialVersionUID = 793575987576638624L;

  public IllegalArgsOperatorException(String message) {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `governance/src/main/java/org/apache/servicecomb/governance/processor/injection/FaultInjectionException.java`
#### Snippet
```java

public class FaultInjectionException extends RuntimeException {
  private static final long serialVersionUID = 1675558351029273343L;

  private final FaultResponse faultResponse;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/MessageObjectMapper.java`
#### Snippet
```java

public class MessageObjectMapper extends ObjectMapper {
  private static final long serialVersionUID = 189026839992490564L;

  public MessageObjectMapper() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/ClientException.java`
#### Snippet
```java
public class ClientException extends Exception {

  private static final long serialVersionUID = 4579811019552389524L;

  public ClientException(String message) {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/module/EnumModuleExt.java`
#### Snippet
```java

public class EnumModuleExt extends SimpleModule {
  private static final long serialVersionUID = 2934449381601447264L;

  public EnumModuleExt() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/introspector/JsonPropertyIntrospector.java`
#### Snippet
```java

public class JsonPropertyIntrospector extends SwaggerAnnotationIntrospector {
  private static final long serialVersionUID = 4157263023893695762L;

  @SuppressWarnings("deprecation")
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/MessageWriteSchema.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private <T> void writeDynamicPojo(OutputEx output, Object dynamicValue) throws IOException {
    FieldMapEx<T> fieldMapEx = (FieldMapEx<T>) this.pojoFieldMaps
        .computeIfAbsent(dynamicValue.getClass(), this::createPojoFields);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getStage' is still used
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/MicroserviceInstance.java`
#### Snippet
```java

  @Deprecated
  public String getStage() {
    return stage;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'setStage' is still used
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/MicroserviceInstance.java`
#### Snippet
```java

  @Deprecated
  public void setStage(String stage) {
    this.stage = stage;
  }
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.PojoClient">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `demo/demo-pojo/pojo-server/src/main/resources/META-INF/spring/pojo.server.bean.xml`
#### Snippet
```java
		http://www.huawei.com/schema/paas/cse/rpc classpath:META-INF/spring/spring-paas-cse-rpc.xsd">

  <bean id="hello" class="org.apache.servicecomb.demo.pojo.server.HelloImpl"></bean>
  <cse:rpc-schema schema-id="helloworld.Greeter"
    implementation="spring:hello"></cse:rpc-schema>
```

### SpringXmlModelInspection
Cannot resolve class or package 'servicecomb'
in `demo/demo-pojo/pojo-server/src/main/resources/META-INF/spring/pojo.server.bean.xml`
#### Snippet
```java
		http://www.huawei.com/schema/paas/cse/rpc classpath:META-INF/spring/spring-paas-cse-rpc.xsd">

  <bean id="hello" class="org.apache.servicecomb.demo.pojo.server.HelloImpl"></bean>
  <cse:rpc-schema schema-id="helloworld.Greeter"
    implementation="spring:hello"></cse:rpc-schema>
```

### SpringXmlModelInspection
Cannot resolve class or package 'demo'
in `demo/demo-pojo/pojo-server/src/main/resources/META-INF/spring/pojo.server.bean.xml`
#### Snippet
```java
		http://www.huawei.com/schema/paas/cse/rpc classpath:META-INF/spring/spring-paas-cse-rpc.xsd">

  <bean id="hello" class="org.apache.servicecomb.demo.pojo.server.HelloImpl"></bean>
  <cse:rpc-schema schema-id="helloworld.Greeter"
    implementation="spring:hello"></cse:rpc-schema>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pojo'
in `demo/demo-pojo/pojo-server/src/main/resources/META-INF/spring/pojo.server.bean.xml`
#### Snippet
```java
		http://www.huawei.com/schema/paas/cse/rpc classpath:META-INF/spring/spring-paas-cse-rpc.xsd">

  <bean id="hello" class="org.apache.servicecomb.demo.pojo.server.HelloImpl"></bean>
  <cse:rpc-schema schema-id="helloworld.Greeter"
    implementation="spring:hello"></cse:rpc-schema>
```

### SpringXmlModelInspection
Cannot resolve class or package 'server'
in `demo/demo-pojo/pojo-server/src/main/resources/META-INF/spring/pojo.server.bean.xml`
#### Snippet
```java
		http://www.huawei.com/schema/paas/cse/rpc classpath:META-INF/spring/spring-paas-cse-rpc.xsd">

  <bean id="hello" class="org.apache.servicecomb.demo.pojo.server.HelloImpl"></bean>
  <cse:rpc-schema schema-id="helloworld.Greeter"
    implementation="spring:hello"></cse:rpc-schema>
```

### SpringXmlModelInspection
Cannot resolve class 'HelloImpl'
in `demo/demo-pojo/pojo-server/src/main/resources/META-INF/spring/pojo.server.bean.xml`
#### Snippet
```java
		http://www.huawei.com/schema/paas/cse/rpc classpath:META-INF/spring/spring-paas-cse-rpc.xsd">

  <bean id="hello" class="org.apache.servicecomb.demo.pojo.server.HelloImpl"></bean>
  <cse:rpc-schema schema-id="helloworld.Greeter"
    implementation="spring:hello"></cse:rpc-schema>
```

### SpringXmlModelInspection
Cannot resolve class or package 'servicecomb'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.PojoClient">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'demo'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.PojoClient">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pojo'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.PojoClient">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.PojoClient">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'PojoClient'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.PojoClient">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'testFromXml'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java

  <bean class="org.apache.servicecomb.demo.pojo.client.PojoClient">
    <property name="testFromXml" ref="server"></property>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="org.apache.servicecomb.demo.CodeFirstPojoIntf"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.BeanRpcTest" init-method="init">
  </bean>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'servicecomb'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="org.apache.servicecomb.demo.CodeFirstPojoIntf"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.BeanRpcTest" init-method="init">
  </bean>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'demo'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="org.apache.servicecomb.demo.CodeFirstPojoIntf"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.BeanRpcTest" init-method="init">
  </bean>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pojo'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="org.apache.servicecomb.demo.CodeFirstPojoIntf"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.BeanRpcTest" init-method="init">
  </bean>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="org.apache.servicecomb.demo.CodeFirstPojoIntf"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.BeanRpcTest" init-method="init">
  </bean>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class 'BeanRpcTest'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="org.apache.servicecomb.demo.CodeFirstPojoIntf"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.BeanRpcTest" init-method="init">
  </bean>
</beans>
```

### SpringXmlModelInspection
Cannot resolve method 'init'
in `demo/demo-pojo/pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="org.apache.servicecomb.demo.CodeFirstPojoIntf"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.pojo.client.BeanRpcTest" init-method="init">
  </bean>
</beans>
```

### SpringXmlModelInspection
Cannot resolve package apache
in `demo/demo-springmvc/springmvc-client/src/main/resources/META-INF/spring/springmvc.client.bean.xml`
#### Snippet
```java
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">

  <context:component-scan base-package="org.apache.servicecomb.demo.springmvc.client"/>
  <cse:rpc-reference id="controller" microservice-name="springmvc"
    schema-id="controller" interface="org.apache.servicecomb.demo.controller.Controller"></cse:rpc-reference>
```

### SpringXmlModelInspection
Cannot resolve package servicecomb
in `demo/demo-springmvc/springmvc-client/src/main/resources/META-INF/spring/springmvc.client.bean.xml`
#### Snippet
```java
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">

  <context:component-scan base-package="org.apache.servicecomb.demo.springmvc.client"/>
  <cse:rpc-reference id="controller" microservice-name="springmvc"
    schema-id="controller" interface="org.apache.servicecomb.demo.controller.Controller"></cse:rpc-reference>
```

### SpringXmlModelInspection
Cannot resolve package demo
in `demo/demo-springmvc/springmvc-client/src/main/resources/META-INF/spring/springmvc.client.bean.xml`
#### Snippet
```java
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">

  <context:component-scan base-package="org.apache.servicecomb.demo.springmvc.client"/>
  <cse:rpc-reference id="controller" microservice-name="springmvc"
    schema-id="controller" interface="org.apache.servicecomb.demo.controller.Controller"></cse:rpc-reference>
```

### SpringXmlModelInspection
Cannot resolve package springmvc
in `demo/demo-springmvc/springmvc-client/src/main/resources/META-INF/spring/springmvc.client.bean.xml`
#### Snippet
```java
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">

  <context:component-scan base-package="org.apache.servicecomb.demo.springmvc.client"/>
  <cse:rpc-reference id="controller" microservice-name="springmvc"
    schema-id="controller" interface="org.apache.servicecomb.demo.controller.Controller"></cse:rpc-reference>
```

### SpringXmlModelInspection
Cannot resolve package client
in `demo/demo-springmvc/springmvc-client/src/main/resources/META-INF/spring/springmvc.client.bean.xml`
#### Snippet
```java
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">

  <context:component-scan base-package="org.apache.servicecomb.demo.springmvc.client"/>
  <cse:rpc-reference id="controller" microservice-name="springmvc"
    schema-id="controller" interface="org.apache.servicecomb.demo.controller.Controller"></cse:rpc-reference>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `demo/demo-spring-boot-transport/demo-spring-boot-pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.springboot.pojo.server.schema.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.springboot.pojo.client.PojoClientTest">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'servicecomb'
in `demo/demo-spring-boot-transport/demo-spring-boot-pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.springboot.pojo.server.schema.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.springboot.pojo.client.PojoClientTest">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'demo'
in `demo/demo-spring-boot-transport/demo-spring-boot-pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.springboot.pojo.server.schema.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.springboot.pojo.client.PojoClientTest">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'springboot'
in `demo/demo-spring-boot-transport/demo-spring-boot-pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.springboot.pojo.server.schema.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.springboot.pojo.client.PojoClientTest">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'pojo'
in `demo/demo-spring-boot-transport/demo-spring-boot-pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.springboot.pojo.server.schema.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.springboot.pojo.client.PojoClientTest">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'client'
in `demo/demo-spring-boot-transport/demo-spring-boot-pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.springboot.pojo.server.schema.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.springboot.pojo.client.PojoClientTest">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'PojoClientTest'
in `demo/demo-spring-boot-transport/demo-spring-boot-pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java
    schema-id="server" interface="org.apache.servicecomb.demo.springboot.pojo.server.schema.server.Test"></cse:rpc-reference>

  <bean class="org.apache.servicecomb.demo.springboot.pojo.client.PojoClientTest">
    <property name="testFromXml" ref="server"></property>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'testFromXml'
in `demo/demo-spring-boot-transport/demo-spring-boot-pojo-client/src/main/resources/META-INF/spring/pojo.client.bean.xml`
#### Snippet
```java

  <bean class="org.apache.servicecomb.demo.springboot.pojo.client.PojoClientTest">
    <property name="testFromXml" ref="server"></property>
  </bean>
</beans>
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `clients/config-common/src/main/java/org/apache/servicecomb/config/common/ConfigConverter.java`
#### Snippet
```java
    if (properties == null) {
      return Collections.emptyMap();
    }
    Map<String, Object> result = new HashMap<>();
    Enumeration<String> keys = (Enumeration<String>) properties.propertyNames();
    while (keys.hasMoreElements()) {
      String key = keys.nextElement();
      Object value = properties.getProperty(key);
      result.put(key, value);
    }
    return result;
```

### DuplicatedCode
Duplicated code
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/URLEndPoint.java`
#### Snippet
```java
    final Map<String, List<String>> queryPairs = new LinkedHashMap<>();
    List<NameValuePair> pairs = URLEncodedUtils.parse(uri, StandardCharsets.UTF_8);
    for (NameValuePair pair : pairs) {
      List<String> list = queryPairs.computeIfAbsent(pair.getName(), name -> new ArrayList<>());
      list.add(pair.getValue());
    }
    return queryPairs;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/servicecomb/core/governance/ServiceCombCircuitBreakerExtension.java`
#### Snippet
```java
    if (!(result instanceof Response)) {
      return null;
    }
    Response resp = (Response) result;
    if (resp.isFailed()) {
      if (resp.getResult() instanceof InvocationException) {
        InvocationException e = resp.getResult();
        return String.valueOf(e.getStatusCode());
      }
    }
    return String.valueOf(resp.getStatusCode());
```

### DuplicatedCode
Duplicated code
in `dynamic-config/config-apollo/src/main/java/org/apache/servicecomb/config/archaius/sources/ApolloConfigurationSourceImpl.java`
#### Snippet
```java
      if (config == null || config.isEmpty()) {
        return;
      }
      Map<String, Object> configuration = ConfigMapping.getConvertedMap(config);
      if (CREATE.equals(action)) {
        valueCache.putAll(configuration);

        updateConfiguration(createIncremental(ImmutableMap.copyOf(configuration),
            null,
            null));
      } else if (SET.equals(action)) {
        valueCache.putAll(configuration);

        updateConfiguration(createIncremental(null,
            ImmutableMap.copyOf(configuration),
            null));
      } else if (DELETE.equals(action)) {
        configuration.keySet().forEach(valueCache::remove);
        updateConfiguration(createIncremental(null,
            null,
            ImmutableMap.copyOf(configuration)));
      } else {
        LOGGER.error("action: {} is invalid.", action.name());
        return;
      }
      LOGGER.warn("Config value cache changed: action:{}; item:{}", action.name(), configuration.keySet());
```

### DuplicatedCode
Duplicated code
in `dynamic-config/config-apollo/src/main/java/org/apache/servicecomb/config/client/ApolloClient.java`
#### Snippet
```java
      Map<String, Object> itemsCreated = new HashMap<>();
      Map<String, Object> itemsDeleted = new HashMap<>();
      Map<String, Object> itemsModified = new HashMap<>();
      if (before == null || before.isEmpty()) {
        updateHandler.handle(CREATE, after);
        return;
      }
      if (after == null || after.isEmpty()) {
        updateHandler.handle(DELETE, before);
        return;
      }
      after.forEach((itemKey, itemValue) -> {
        if (!before.containsKey(itemKey)) {
          itemsCreated.put(itemKey, itemValue);
        } else if (!itemValue.equals(before.get(itemKey))) {
          itemsModified.put(itemKey, itemValue);
        }
      });
      for (String itemKey : before.keySet()) {
        if (!after.containsKey(itemKey)) {
          itemsDeleted.put(itemKey, "");
        }
      }
      updateHandler.handle(CREATE, itemsCreated);
      updateHandler.handle(SET, itemsModified);
      updateHandler.handle(DELETE, itemsDeleted);
```

### DuplicatedCode
Duplicated code
in `dynamic-config/config-cc/src/main/java/org/apache/servicecomb/config/ConfigCenterConfig.java`
#### Snippet
```java
    Object property = finalConfig.getProperty(FILE_SOURCE);
    if (property instanceof String) {
      return new ArrayList<>(Arrays.asList(((String) property).split(",")));
    }
    if (property instanceof List) {
      return (List<String>) property;
    }
    return Collections.EMPTY_LIST;
```

### DuplicatedCode
Duplicated code
in `dynamic-config/config-cc/src/main/java/org/apache/servicecomb/config/ConfigCenterConfigurationSourceImpl.java`
#### Snippet
```java
    LOGGER.info("configuration changed keys, added=[{}], updated=[{}], deleted=[{}]",
        result.getAdded() == null ? "" : result.getAdded().keySet(),
        result.getChanged() == null ? "" : result.getChanged().keySet(),
        result.getDeleted() == null ? "" : result.getDeleted().keySet());
    for (WatchedUpdateListener l : listeners) {
      try {
        l.updateConfiguration(result);
      } catch (Throwable ex) {
        LOGGER.error("Error in invoking WatchedUpdateListener", ex);
      }
    }
```

### DuplicatedCode
Duplicated code
in `dynamic-config/config-cc/src/main/java/org/apache/servicecomb/config/TransportUtils.java`
#### Snippet
```java
SSLProperties sslProperties = new SSLProperties();
    sslProperties.setEnabled(sslEnabled);

    if (!sslEnabled) {
      return sslProperties;
    }

    SSLOption option = new SSLOption();
    option.setEngine(getStringProperty(configuration,
        DEFAULT_OPTION.getEngine(),
        "ssl." + tag + ".engine",
        "ssl.engine"));
    option.setProtocols(
        getStringProperty(configuration,
            DEFAULT_OPTION.getProtocols(),
            "ssl." + tag + ".protocols",
            "ssl.protocols"));
    option.setCiphers(
        getStringProperty(configuration, DEFAULT_OPTION.getCiphers(), "ssl." + tag + ".ciphers", "ssl.ciphers"));
    option.setAuthPeer(
        getBooleanProperty(configuration, DEFAULT_OPTION.isAuthPeer(), "ssl." + tag + ".authPeer", "ssl.authPeer"));
    option.setCheckCNHost(
        getBooleanProperty(configuration,
            DEFAULT_OPTION.isCheckCNHost(),
            "ssl." + tag + ".checkCN.host",
            "ssl.checkCN.host"));
    option.setCheckCNWhite(
        getBooleanProperty(configuration,
            DEFAULT_OPTION.isCheckCNWhite(),
            "ssl." + tag + ".checkCN.white",
            "ssl.checkCN.white"));
    option.setCheckCNWhiteFile(getStringProperty(configuration,
        DEFAULT_OPTION.getCiphers(),
        "ssl." + tag + ".checkCN.white.file",
        "ssl.checkCN.white.file"));
    option.setAllowRenegociate(getBooleanProperty(configuration,
        DEFAULT_OPTION.isAllowRenegociate(),
        "ssl." + tag + ".allowRenegociate",
        "ssl.allowRenegociate"));
    option.setStorePath(
        getStringProperty(configuration,
            DEFAULT_OPTION.getStorePath(),
            "ssl." + tag + ".storePath",
            "ssl.storePath"));
    option.setClientAuth(
        getStringProperty(configuration,
            DEFAULT_OPTION.getClientAuth(),
            "ssl." + tag + ".clientAuth",
            "ssl.clientAuth"));
    option.setTrustStore(
        getStringProperty(configuration,
            DEFAULT_OPTION.getTrustStore(),
            "ssl." + tag + ".trustStore",
            "ssl.trustStore"));
    option.setTrustStoreType(getStringProperty(configuration,
        DEFAULT_OPTION.getTrustStoreType(),
        "ssl." + tag + ".trustStoreType",
        "ssl.trustStoreType"));
    option.setTrustStoreValue(getStringProperty(configuration,
        DEFAULT_OPTION.getTrustStoreValue(),
        "ssl." + tag + ".trustStoreValue",
        "ssl.trustStoreValue"));
    option.setKeyStore(
        getStringProperty(configuration, DEFAULT_OPTION.getKeyStore(), "ssl." + tag + ".keyStore", "ssl.keyStore"));
    option.setKeyStoreType(
        getStringProperty(configuration,
            DEFAULT_OPTION.getKeyStoreType(),
            "ssl." + tag + ".keyStoreType",
            "ssl.keyStoreType"));
    option.setKeyStoreValue(getStringProperty(configuration,
        DEFAULT_OPTION.getKeyStoreValue(),
        "ssl." + tag + ".keyStoreValue",
        "ssl.keyStoreValue"));
    option.setCrl(getStringProperty(configuration, DEFAULT_OPTION.getCrl(), "ssl." + tag + ".crl", "ssl.crl"));
    option.setSslCustomClass(
        getStringProperty(configuration, null, "ssl." + tag + ".sslCustomClass", "ssl.sslCustomClass"));

    sslProperties.setSslOption(option);
    sslProperties.setSslCustom(SSLCustom.createSSLCustom(option.getSslCustomClass()));
    return sslProperties;
```

### DuplicatedCode
Duplicated code
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/RBACBootStrapService.java`
#### Snippet
```java
SSLOption option = new SSLOption();
    option.setEngine(getStringProperty(environment,
        DEFAULT_OPTION.getEngine(),
        "ssl." + tag + ".engine",
        "ssl.engine"));
    option.setProtocols(
        getStringProperty(environment,
            DEFAULT_OPTION.getProtocols(),
            "ssl." + tag + ".protocols",
            "ssl.protocols"));
    option.setCiphers(
        getStringProperty(environment, DEFAULT_OPTION.getCiphers(), "ssl." + tag + ".ciphers", "ssl.ciphers"));
    option.setAuthPeer(
        getBooleanProperty(environment, DEFAULT_OPTION.isAuthPeer(), "ssl." + tag + ".authPeer", "ssl.authPeer"));
    option.setCheckCNHost(
        getBooleanProperty(environment,
            DEFAULT_OPTION.isCheckCNHost(),
            "ssl." + tag + ".checkCN.host",
            "ssl.checkCN.host"));
    option.setCheckCNWhite(
        getBooleanProperty(environment,
            DEFAULT_OPTION.isCheckCNWhite(),
            "ssl." + tag + ".checkCN.white",
            "ssl.checkCN.white"));
    option.setCheckCNWhiteFile(getStringProperty(environment,
        DEFAULT_OPTION.getCiphers(),
        "ssl." + tag + ".checkCN.white.file",
        "ssl.checkCN.white.file"));
    option.setAllowRenegociate(getBooleanProperty(environment,
        DEFAULT_OPTION.isAllowRenegociate(),
        "ssl." + tag + ".allowRenegociate",
        "ssl.allowRenegociate"));
    option.setStorePath(
        getStringProperty(environment,
            DEFAULT_OPTION.getStorePath(),
            "ssl." + tag + ".storePath",
            "ssl.storePath"));
    option.setClientAuth(
        getStringProperty(environment,
            DEFAULT_OPTION.getClientAuth(),
            "ssl." + tag + ".clientAuth",
            "ssl.clientAuth"));
    option.setTrustStore(
        getStringProperty(environment,
            DEFAULT_OPTION.getTrustStore(),
            "ssl." + tag + ".trustStore",
            "ssl.trustStore"));
    option.setTrustStoreType(getStringProperty(environment,
        DEFAULT_OPTION.getTrustStoreType(),
        "ssl." + tag + ".trustStoreType",
        "ssl.trustStoreType"));
    option.setTrustStoreValue(getStringProperty(environment,
        DEFAULT_OPTION.getTrustStoreValue(),
        "ssl." + tag + ".trustStoreValue",
        "ssl.trustStoreValue"));
    option.setKeyStore(
        getStringProperty(environment, DEFAULT_OPTION.getKeyStore(), "ssl." + tag + ".keyStore", "ssl.keyStore"));
    option.setKeyStoreType(
        getStringProperty(environment,
            DEFAULT_OPTION.getKeyStoreType(),
            "ssl." + tag + ".keyStoreType",
            "ssl.keyStoreType"));
    option.setKeyStoreValue(getStringProperty(environment,
        DEFAULT_OPTION.getKeyStoreValue(),
        "ssl." + tag + ".keyStoreValue",
        "ssl.keyStoreValue"));
    option.setCrl(getStringProperty(environment, DEFAULT_OPTION.getCrl(), "ssl." + tag + ".crl", "ssl.crl"));
    option.setSslCustomClass(
        getStringProperty(environment, null, "ssl." + tag + ".sslCustomClass", "ssl.sslCustomClass"));

    sslProperties.setSslOption(option);
    sslProperties.setSslCustom(SSLCustom.createSSLCustom(option.getSslCustomClass()));
    return sslProperties;
```

### DuplicatedCode
Duplicated code
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/CommonHttpEdgeDispatcher.java`
#### Snippet
```java
    ConcurrentCompositeConfiguration config = (ConcurrentCompositeConfiguration) DynamicPropertyFactory
        .getBackingConfigurationSource();
    configurations = URLMappedConfigurationLoader.loadConfigurations(config, KEY_MAPPING_PREFIX);
    config.addConfigurationListener(event -> {
      if (event.getPropertyName().startsWith(KEY_MAPPING_PREFIX)) {
        LOG.info("Map rule have been changed. Reload configurations. Event=" + event.getType());
        configurations = URLMappedConfigurationLoader.loadConfigurations(config, KEY_MAPPING_PREFIX);
      }
    });
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigMapping.java`
#### Snippet
```java
    if (configMap == null) {
      return new LinkedHashMap<>();
    }
    Map<String, Object> retMap = new LinkedHashMap<>();
    configMap.entrySet().forEach(entry -> putConfigsToRetMap(retMap, entry, config.getProperty(entry.getKey())));
    return retMap;
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/YAMLUtil.java`
#### Snippet
```java
    Map<String, Object> configurations = new LinkedHashMap<>();
    safeParser().loadAll(input).forEach(data -> {
      if (data instanceof Map && isValidMap((Map<Object, Object>) data)) {
        configurations.putAll(retrieveItems("", (Map<String, Object>) data));
      } else {
        throw new IllegalArgumentException("input cannot be convert to map");
      }
    });
    return configurations;
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java
    final byte[] buffer = this.buffer;
    int offset = this.offset;

    final byte b1 = buffer[offset++];
    final byte b2 = buffer[offset++];
    final byte b3 = buffer[offset++];
    final byte b4 = buffer[offset++];
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    if (lb.offset + size > lb.buffer.length) {
      lb = new LinkedBuffer(session.nextBufferSize, lb);
    }

    final byte[] buffer = lb.buffer;
    int offset = lb.offset;
    lb.offset += size;
    session.size += size;
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    if (size == 1) {
      buffer[offset] = (byte) value;
    } else {
      for (int i = 0, last = size - 1; i < last; i++, value >>>= 7) {
        buffer[offset++] = (byte) ((value & 0x7F) | 0x80);
      }

      buffer[offset] = (byte) value;
    }

    return lb;
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    final int totalSize = tagSize + size;

    if (lb.offset + totalSize > lb.buffer.length) {
      lb = new LinkedBuffer(session.nextBufferSize, lb);
    }

    final byte[] buffer = lb.buffer;
    int offset = lb.offset;
    lb.offset += totalSize;
    session.size += totalSize;

    if (tagSize == 1) {
      buffer[offset++] = (byte) tag;
    } else {
      for (int i = 0, last = tagSize - 1; i < last; i++, tag >>>= 7) {
        buffer[offset++] = (byte) ((tag & 0x7F) | 0x80);
      }

      buffer[offset++] = (byte) tag;
    }
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    if (size == 1) {
      buffer[offset] = (byte) value;
    } else {
      for (int i = 0, last = size - 1; i < last; i++, value >>>= 7) {
        buffer[offset++] = (byte) (((int) value & 0x7F) | 0x80);
      }

      buffer[offset] = (byte) value;
    }
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    if (buffer.length - offset < LITTLE_ENDIAN_32_SIZE) {
      throw new IllegalArgumentException("buffer capacity not enough.");
    }

    buffer[offset++] = (byte) (value & 0xFF);
    buffer[offset++] = (byte) (value >> 8 & 0xFF);
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    buffer[offset++] = (byte) (value >> 24 & 0xFF);
    buffer[offset++] = (byte) (value >> 32 & 0xFF);
    buffer[offset++] = (byte) (value >> 40 & 0xFF);
    buffer[offset++] = (byte) (value >> 48 & 0xFF);
    buffer[offset] = (byte) (value >> 56 & 0xFF);
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    if (tail.offset + size > tail.buffer.length) {
      tail = new LinkedBuffer(this.nextBufferSize, tail);
    }

    final byte[] buffer = tail.buffer;
    int offset = tail.offset;
    tail.offset += size;
    this.size += size;
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    final int size = LITTLE_ENDIAN_32_SIZE;

    if (tail.offset + size > tail.buffer.length) {
      tail = new LinkedBuffer(this.nextBufferSize, tail);
    }

    final byte[] buffer = tail.buffer;
    int offset = tail.offset;
    tail.offset += size;
    this.size += size;

    buffer[offset++] = (byte) (value & 0xFF);
    buffer[offset++] = (byte) (value >> 8 & 0xFF);
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/SchemaManager.java`
#### Snippet
```java
    SchemaEx<T> schema = findSchema(cacheKey);
    if (schema != null) {
      return schema;
    }

    schema = newMessageSchema(message, types);
    canonicalSchemas.put(cacheKey, schema);

    schema.init();
    return schema;
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/enums/EnumNotPackedReadSchemas.java`
#### Snippet
```java
          Enum<?> enumValue = enumMeta.getEnumByValue(value);
          if (enumValue == null) {
            throw new IllegalStateException(
                String.format("invalid enum value %d for %s, proto field=%s:%s",
                    value,
                    javaType.getRawClass().getName(),
                    ((Type) protoField.getParent()).getCanonicalName(),
                    protoField.getName()));
          }

          collection.add(enumValue);

          int fieldNumber = input.readFieldNumber();
          if (fieldNumber != this.fieldNumber) {
            return fieldNumber;
          }
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/bools/BoolPackedWriteSchemas.java`
#### Snippet
```java
      arrayWriter = (o, value) ->
          o.writeObject(tag, tagSize, value, (output, array) -> {
            for (Boolean element : array) {
              if (element != null) {
                output.writePackedBool(element);
                continue;
              }

              ProtoUtils.throwNotSupportNullElement(protoField);
            }
          });
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/doubles/DoublePackedWriteSchemas.java`
#### Snippet
```java
      arrayWriter = (o, value) ->
          o.writeObject(tag, tagSize, value, (output, array) -> {
            for (Double element : array) {
              if (element != null) {
                output.writePackedDouble(element);
                continue;
              }

              ProtoUtils.throwNotSupportNullElement(protoField);
            }
          });
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumNotPackedWriteSchemas.java`
#### Snippet
```java
        for (Enum<?> element : array) {
          if (element == null) {
            ProtoUtils.throwNotSupportNullElement(protoField);
            return;
          }

          String name = element.name();
          Integer enumValue = enumMeta.getValueByName(name);
          if (enumValue == null) {
            throw new IllegalStateException(
                String.format("invalid enum name %s for proto %s, field=%s:%s",
                    name,
                    protoField.getTypeName(),
                    ((Type) protoField.getParent()).getCanonicalName(),
                    protoField.getName()));
          }

          output.writeEnum(tag, tagSize, enumValue);
        }
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumNotPackedWriteSchemas.java`
#### Snippet
```java
        Object first = collection.iterator().next();
        if (first.getClass().isEnum()) {
          writeEnumCollection(output, collection);
          return;
        }

        if (first.getClass() == String.class) {
          writeStringCollection(output, (Collection<String>) (Object) collection);
          return;
        }

        writeIntCollection(output, (Collection<Number>) (Object) collection);
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumNotPackedWriteSchemas.java`
#### Snippet
```java
        for (String element : array) {
          if (element == null) {
            ProtoUtils.throwNotSupportNullElement(protoField);
            return;
          }

          Integer enumValue = enumMeta.getValueByName(element);
          if (enumValue == null) {
            throw new IllegalStateException(
                String.format("invalid enum name %s for proto %s, field=%s:%s",
                    element,
                    protoField.getTypeName(),
                    ((Type) protoField.getParent()).getCanonicalName(),
                    protoField.getName()));
          }

          output.writeEnum(tag, tagSize, enumValue);
        }
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumPackedWriteSchemas.java`
#### Snippet
```java
        for (Enum<?> element : array) {
          if (element == null) {
            ProtoUtils.throwNotSupportNullElement(protoField);
            return;
          }

          String name = element.name();
          Integer enumValue = enumMeta.getValueByName(name);
          if (enumValue == null) {
            throw new IllegalStateException(
                String.format("invalid enum name %s for proto %s, field=%s:%s",
                    name,
                    protoField.getTypeName(),
                    ((Type) protoField.getParent()).getCanonicalName(),
                    protoField.getName()));
          }

          output.writePackedEnum(enumValue);
        }
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumPackedWriteSchemas.java`
#### Snippet
```java
        for (String element : array) {
          if (element == null) {
            ProtoUtils.throwNotSupportNullElement(protoField);
            return;
          }

          Integer enumValue = enumMeta.getValueByName(element);
          if (enumValue == null) {
            throw new IllegalStateException(
                String.format("invalid enum name %s for proto %s, field=%s:%s",
                    element,
                    protoField.getTypeName(),
                    ((Type) protoField.getParent()).getCanonicalName(),
                    protoField.getName()));
          }

          output.writePackedEnum(enumValue);
        }
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/floats/FloatPackedWriteSchemas.java`
#### Snippet
```java
      arrayWriter = (o, value) ->
          o.writeObject(tag, tagSize, value, (output, array) -> {
            for (Float element : array) {
              if (element != null) {
                output.writePackedFloat(element);
                continue;
              }

              ProtoUtils.throwNotSupportNullElement(protoField);
            }
          });
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/Fixed64PackedWriteSchemas.java`
#### Snippet
```java
      arrayWriter = (o, value) ->
          o.writeObject(tag, tagSize, value, (output, array) -> {
            for (Long element : array) {
              if (element != null) {
                output.writePackedFixed64(element);
                continue;
              }

              ProtoUtils.throwNotSupportNullElement(protoField);
            }
          });
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/Int64PackedWriteSchemas.java`
#### Snippet
```java
      arrayWriter = (o, value) ->
          o.writeObject(tag, tagSize, value, (output, array) -> {
            for (Long element : array) {
              if (element != null) {
                output.writePackedInt64(element);
                continue;
              }

              ProtoUtils.throwNotSupportNullElement(protoField);
            }
          });
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/SFixed64PackedWriteSchemas.java`
#### Snippet
```java
      arrayWriter = (o, value) ->
          o.writeObject(tag, tagSize, value, (output, array) -> {
            for (Long element : array) {
              if (element != null) {
                output.writePackedSFixed64(element);
                continue;
              }

              ProtoUtils.throwNotSupportNullElement(protoField);
            }
          });
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/SInt64PackedWriteSchemas.java`
#### Snippet
```java
      arrayWriter = (o, value) ->
          o.writeObject(tag, tagSize, value, (output, array) -> {
            for (Long element : array) {
              if (element != null) {
                output.writePackedSInt64(element);
                continue;
              }

              ProtoUtils.throwNotSupportNullElement(protoField);
            }
          });
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/UInt64PackedWriteSchemas.java`
#### Snippet
```java
      arrayWriter = (o, value) ->
          o.writeObject(tag, tagSize, value, (output, array) -> {
            for (Long element : array) {
              if (element != null) {
                output.writePackedUInt64(element);
                continue;
              }

              ProtoUtils.throwNotSupportNullElement(protoField);
            }
          });
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLManager.java`
#### Snippet
```java
    if (option.isAuthPeer() || ClientAuth.REQUIRED.equals(option.getClientAuth())) {
      engine.setNeedClientAuth(true);
      return;
    }
    if (ClientAuth.NONE.equals(option.getClientAuth())) {
      engine.setNeedClientAuth(false);
      engine.setWantClientAuth(false);
      return;
    }
    engine.setWantClientAuth(true);
```

### DuplicatedCode
Duplicated code
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/TrustManagerExt.java`
#### Snippet
```java
    if (!option.isAuthPeer()) {
      return;
    }

    String ip = null;
    if (socket != null && socket.isConnected()
        && socket instanceof SSLSocket) {
      InetAddress inetAddress = socket.getInetAddress();
      if (inetAddress != null) {
        ip = inetAddress.getHostAddress();
      }
    }
    checkTrustedCustom(chain, ip);
```

### DuplicatedCode
Duplicated code
in `governance/src/main/java/org/apache/servicecomb/governance/handler/CircuitBreakerHandler.java`
#### Snippet
```java
    CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
        .failureRateThreshold(policy.getFailureRateThreshold())
        .slowCallRateThreshold(policy.getSlowCallRateThreshold())
        .waitDurationInOpenState(Duration.parse(policy.getWaitDurationInOpenState()))
        .slowCallDurationThreshold(Duration.parse(policy.getSlowCallDurationThreshold()))
        .permittedNumberOfCallsInHalfOpenState(policy.getPermittedNumberOfCallsInHalfOpenState())
        .minimumNumberOfCalls(policy.getMinimumNumberOfCalls())
        .slidingWindowType(policy.getSlidingWindowTypeEnum())
        .slidingWindowSize(Integer.parseInt(policy.getSlidingWindowSize()))
        .recordException(circuitBreakerExtension::isFailedResult)
        .recordResult(r -> circuitBreakerExtension.isFailedResult(policy.getRecordFailureStatus(), r))
        .build();
    CircuitBreakerRegistry circuitBreakerRegistry = CircuitBreakerRegistry.of(circuitBreakerConfig);
```

### DuplicatedCode
Duplicated code
in `governance/src/main/java/org/apache/servicecomb/governance/handler/IdentifierRateLimitingHandler.java`
#### Snippet
```java
    LOGGER.info("applying new policy {} for {}", key, policy.toString());

    RateLimiterConfig config = RateLimiterConfig.custom()
        .limitForPeriod(policy.getRate())
        .limitRefreshPeriod(Duration.parse(policy.getLimitRefreshPeriod()))
        .timeoutDuration(Duration.parse(policy.getTimeoutDuration()))
        .build();
    RateLimiterRegistry rateLimiterRegistry = RateLimiterRegistry.of(config);
    if (meterRegistry != null) {
      TaggedRateLimiterMetrics
          .ofRateLimiterRegistry(RateLimiterMetricNames.custom()
                  .availablePermissionsMetricName(
                      this.rateLimitProperties.getConfigKey() + ".available.permissions")
                  .waitingThreadsMetricName(this.rateLimitProperties.getConfigKey() + ".waiting.threads")
                  .build(),
              rateLimiterRegistry)
          .bindTo(meterRegistry);
    }
    return new DisposableRateLimiter(key, rateLimiterRegistry.rateLimiter(key), rateLimiterRegistry);
```

### DuplicatedCode
Duplicated code
in `handlers/handler-governance/src/main/java/org/apache/servicecomb/handler/governance/ConsumerInstanceBulkheadFilter.java`
#### Snippet
```java
    Supplier<CompletionStage<Response>> next = createBusinessCompletionStageSupplier(invocation, nextNode);
    DecorateCompletionStage<Response> dcs = Decorators.ofCompletionStage(next);
    GovernanceRequestExtractor request = MatchType.createGovHttpRequest(invocation);

    addBulkhead(dcs, request);

    CompletableFuture<Response> future = new CompletableFuture<>();
```

### DuplicatedCode
Duplicated code
in `handlers/handler-governance/src/main/java/org/apache/servicecomb/handler/governance/ConsumerInstanceIsolationFilter.java`
#### Snippet
```java
    Supplier<CompletionStage<Response>> next = createBusinessCompletionStageSupplier(invocation, nextNode);
    DecorateCompletionStage<Response> dcs = Decorators.ofCompletionStage(next);
    GovernanceRequestExtractor request = MatchType.createGovHttpRequest(invocation);

    addCircuitBreaker(dcs, request);

    CompletableFuture<Response> future = new CompletableFuture<>();
```

### DuplicatedCode
Duplicated code
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MetricsMonitorDataProvider.java`
#### Snippet
```java
    for (Map<String, OperationPerfGroup> statusMap : producerPerf.getGroups().values()) {
      for (OperationPerfGroup perfGroup : statusMap.values()) {
        for (int i = 0; i < perfGroup.getOperationPerfs().size(); i++) {
          OperationPerf operationPerf = perfGroup.getOperationPerfs().get(i);
          PerfInfo stageTotal = operationPerf.findStage(MeterInvocationConst.STAGE_TOTAL);
          String name = NAME_PROVIDER + operationPerf.getOperation();
          InterfaceInfo interfaceInfo = combinedResults.computeIfAbsent(name,
              k -> {
                InterfaceInfo obj = new InterfaceInfo();
                obj.setName(name);
                return obj;
              });
          // dashboard calculates the latest 10 seconds, different with metrics cycle.
          interfaceInfo.setTotal(
              doubleToInt(interfaceInfo.getTotal() + 10 * stageTotal.getTps()));
          if (perfGroup.getStatus().matches(CODE_SUCCESS)) {
            interfaceInfo.setQps(stageTotal.getTps());
            interfaceInfo.setLatency(doubleToInt(stageTotal.calcMsLatency()));
          } else {
            interfaceInfo.setFailure(
                doubleToInt(interfaceInfo.getTotal() + stageTotal.getMsTotalTime() * stageTotal.getTps()));
            if (perfGroup.getStatus().equals(CODE_TIMEOUT)) {
              interfaceInfo.setCountTimeout(
                  doubleToInt(interfaceInfo.getCountTimeout() + stageTotal.getMsTotalTime() * stageTotal.getTps()));
            }
          }
        }
      }
    }
```

### DuplicatedCode
Duplicated code
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/invocation/ConsumerInvocationMeter.java`
#### Snippet
```java
    super.calcMeasurements(measurements, msNow, secondInterval);

    clientFiltersRequestTimer.calcMeasurements(measurements, msNow, secondInterval);
    consumerSendRequestTimer.calcMeasurements(measurements, msNow, secondInterval);
    consumerGetConnectionTimer.calcMeasurements(measurements, msNow, secondInterval);
    consumerWriteToBufTimer.calcMeasurements(measurements, msNow, secondInterval);
    consumerWaitResponseTimer.calcMeasurements(measurements, msNow, secondInterval);
```

### DuplicatedCode
Duplicated code
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      PerfInfo stageTotal = operationPerf.findStage(MeterInvocationConst.STAGE_TOTAL);
      if (Double.compare(0D, stageTotal.getTps()) == 0) {
        continue;
      }
      prepare = operationPerf.findStage(MeterInvocationConst.STAGE_PREPARE);
      queue = operationPerf.findStage(MeterInvocationConst.STAGE_EXECUTOR_QUEUE);
      filtersReq = operationPerf.findStage(MeterInvocationConst.STAGE_SERVER_FILTERS_REQUEST);
      handlersReq = operationPerf.findStage(MeterInvocationConst.STAGE_HANDLERS_REQUEST);
```

### DuplicatedCode
Duplicated code
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      handlersReq = operationPerf.findStage(MeterInvocationConst.STAGE_HANDLERS_REQUEST);
      clientFiltersReq = operationPerf.findStage(MeterInvocationConst.STAGE_CLIENT_FILTERS_REQUEST);
      sendReq = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_SEND_REQUEST);
      getConnect = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_GET_CONNECTION);
      writeBuf = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_WRITE_TO_BUF);
      waitResp = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_WAIT_RESPONSE);
      wakeConsumer = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_WAKE_CONSUMER);
      clientFiltersResp = operationPerf.findStage(MeterInvocationConst.STAGE_CLIENT_FILTERS_RESPONSE);
      handlersResp = operationPerf.findStage(MeterInvocationConst.STAGE_HANDLERS_RESPONSE);
```

### DuplicatedCode
Duplicated code
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
      clientFiltersReq = operationPerf.findStage(MeterInvocationConst.STAGE_CLIENT_FILTERS_REQUEST);
      sendReq = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_SEND_REQUEST);
      getConnect = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_GET_CONNECTION);
      writeBuf = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_WRITE_TO_BUF);
      waitResp = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_WAIT_RESPONSE);
      wakeConsumer = operationPerf.findStage(MeterInvocationConst.STAGE_CONSUMER_WAKE_CONSUMER);
      clientFiltersResp = operationPerf.findStage(MeterInvocationConst.STAGE_CLIENT_FILTERS_RESPONSE);
      handlersResp = operationPerf.findStage(MeterInvocationConst.STAGE_HANDLERS_RESPONSE);
```

### DuplicatedCode
Duplicated code
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RestClientUtil.java`
#### Snippet
```java
    endpoint.append(url);
    try {
      signReq.setEndpoint(new URI(endpoint.toString()));
    } catch (URISyntaxException e) {
      LOGGER.error("set uri failed, uri is {}, message: {}", endpoint, e.getMessage());
    }
    signReq.setContent((requestParam.getBody() != null && requestParam.getBody().length > 0)
        ? new ByteArrayInputStream(requestParam.getBody())
        : null);
    signReq.setHeaders(headers);
    signReq.setHttpMethod(method);
    signReq.setQueryParams(requestParam.getQueryParamsMap());
    return signReq;
```

### DuplicatedCode
Duplicated code
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractSwaggerGenerator.java`
#### Snippet
```java
    int modifiers = method.getModifiers();
    if (Modifier.isStatic(modifiers)) {
      return true;
    }
    // skip bridge method
    if (method.isBridge()) {
      return true;
    }

    ApiOperation apiOperation = method.getAnnotation(ApiOperation.class);
    if (apiOperation != null && apiOperation.hidden()) {
      return apiOperation.hidden();
    }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigMapping.java`
#### Snippet
```java
    }
    Map<String, Object> retMap = new LinkedHashMap<>();
    retMap.putAll(oldMap);
    configMap.entrySet().forEach(entry -> putConfigsToRetMap(retMap, entry, oldMap.get(entry.getKey())));
    return retMap;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/LoadBalancer.java`
#### Snippet
```java
    }
    ServiceCombServer server = rule.choose(servers, invocation);
    if (null == server) {
      return null;
    }
```

### TrivialIf
`if` statement can be simplified
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/VertxTLSBuilder.java`
#### Snippet
```java
    buildTCPSSLOptions(sslOption, sslCustom, clientOptionsBase);

    if (sslOption.isAuthPeer()) {
      clientOptionsBase.setTrustAll(false);
    } else {
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/org/apache/servicecomb/core/exception/DefaultExceptionProcessor.java`
#### Snippet
```java
  @Override
  public boolean isIgnoreLog(@Nonnull Invocation invocation, @Nonnull InvocationException exception) {
    if (!isPrintRateLimit() && exception.getStatusCode() == TOO_MANY_REQUESTS.getStatusCode()) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `governance/src/main/java/org/apache/servicecomb/governance/marker/TrafficMarker.java`
#### Snippet
```java
  @Override
  public boolean isValid() {
    if (matches == null || matches.isEmpty()) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/definition/ResponseRootDeserializer.java`
#### Snippet
```java

    if (invocationTimeType.getRawClass().isAssignableFrom(obj.getClass())) {
      if (invocationTimeType.getContentType() == null) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java

  public static boolean isValidEnum(String name) {
    if (name.contains(".") || name.contains("-")) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java
    if (operation.getResponses().get("200").getResponseSchema() instanceof ModelImpl) {
      ModelImpl model = (ModelImpl) operation.getResponses().get("200").getResponseSchema();
      if ("file".equals(model.getType())) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/property/AbstractBaseIntegerProperty.java`
#### Snippet
```java
    AbstractBaseIntegerProperty<T> other = (AbstractBaseIntegerProperty<T>) obj;
    if (defaultValue == null) {
      if (other.defaultValue != null) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/property/AbstractBaseIntegerProperty.java`
#### Snippet
```java
        return false;
      }
    } else if (!defaultValue.equals(other.defaultValue)) {
      return false;
    }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/refresh/ClassificationAddress.java`
#### Snippet
```java
      maxRetryTimes = cacheEndpoints.size();
    } else {
      if (kieCaches.getInstanceMap().size() <= 0) {
        return null;
      }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterClient.java`
#### Snippet
```java
      headers.put("X-ConsumerId", consumerId);
      HttpResponse response = httpClient
          .getHttpRequest("/registry/instances?appId=" + URLEncoder.encode(appId, "UTF-8")
                  + "&serviceName=" + HttpUtils.encodeURLParam(serviceName)
                  + "&version=" + HttpUtils.encodeURLParam(versionRule)
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/query/QueryCodec.java`
#### Snippet
```java
public interface QueryCodec extends Ordered {
  static String encodeValue(@Nonnull Object value) throws UnsupportedEncodingException {
    return URLEncoder.encode(value.toString(), StandardCharsets.UTF_8.name());
  }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/RestClientRequestImpl.java`
#### Snippet
```java
        if (entry.getValue() != null) {
          String value = RestObjectMapperFactory.getRestObjectMapper().convertToString(entry.getValue());
          value = URLEncoder.encode(value, StandardCharsets.UTF_8.name());
          output.write(value.getBytes(StandardCharsets.UTF_8));
        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/HttpUtils.java`
#### Snippet
```java
      return "";
    }
    return URLEncoder.encode(value, "UTF-8");
  }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RequestParam.java`
#### Snippet
```java
        for (String val : query.getValue()) {
          stringBuilder.append("&")
              .append(URLEncoder.encode(query.getKey(), "UTF-8"));

          if (val != null && !val.isEmpty()) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RequestParam.java`
#### Snippet
```java
          if (val != null && !val.isEmpty()) {
            stringBuilder.append("=")
                .append(URLEncoder.encode(val, "UTF-8"));
          }
        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/RestClientEncoder.java`
#### Snippet
```java

        String value = QueryCodec.convertToString(entry.getValue());
        String encodedValue = URLEncoder.encode(value, StandardCharsets.UTF_8.name());
        writeCharSequence(byteBuf, encodedValue);

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `huawei-cloud/servicestage/src/main/java/org/apache/servicecomb/huaweicloud/servicestage/AKSKAuthHeaderProvider.java`
#### Snippet
```java
    }
    try {
      return URLEncoder.encode(project, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      return project;
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'SSLSocket' used without 'try'-with-resources statement
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLManager.java`
#### Snippet
```java
    option.setCiphers(sslOption.getCiphers());
    SSLCustom custom = SSLCustom.defaultSSLCustom();
    SSLSocket socket = createSSLSocket(option, custom);
    return socket.getEnabledCipherSuites();
  }
```

### AutoCloseableResource
'ValidatorFactory' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/servicecomb/core/filter/impl/ParameterValidatorFilter.java`
#### Snippet
```java
  @Override
  public void afterPropertiesSet() {
    validator = createValidatorFactory()
        .getValidator().forExecutables();
  }
```

### AutoCloseableResource
'GroupExecutor' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/servicecomb/core/bootstrap/SCBEngineForTest.java`
#### Snippet
```java
public class SCBEngineForTest extends SCBEngine {
  public SCBEngineForTest() {
    getExecutorManager().registerExecutor(EXECUTOR_GROUP_THREADPOOL, new GroupExecutor().init());

    List<Filter> filters = Arrays.asList(
```

### AutoCloseableResource
'Tracing' used without 'try'-with-resources statement
in `handlers/handler-tracing-zipkin/src/main/java/org/apache/servicecomb/tracing/zipkin/ZipkinTracingFilter.java`
#### Snippet
```java

    Span span = tracing.createSpan(invocation);
    try (SpanInScope scope = tracing.tracer().tracer().withSpanInScope(span)) {
      return nextNode.onFilter(invocation)
          .whenComplete((response, exception) -> tracing.onResponse(span, response, Exceptions.unwrap(exception)));
```

### AutoCloseableResource
'ValidatorFactory' used without 'try'-with-resources statement
in `swagger/swagger-invocation/invocation-validator/src/main/java/org/apache/servicecomb/swagger/invocation/validator/ParameterValidator.java`
#### Snippet
```java
                .parameterNameProvider(new DefaultParameterNameProvider())
                .messageInterpolator(messageInterpolator())
                .buildValidatorFactory();
        executableValidator = factory.getValidator().forExecutables();
      }
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `this.getExtData(...)` to `SwaggerProducerOperation` is redundant
in `core/src/main/java/org/apache/servicecomb/core/definition/OperationMeta.java`
#### Snippet
```java

  public SwaggerProducerOperation getSwaggerProducerOperation() {
    return (SwaggerProducerOperation) this.getExtData(Const.PRODUCER_OPERATION);
  }

```

### RedundantCast
Casting `bodyObject` to `Map` is redundant
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
    this.fileKeys = fileKeys;
    if (isFormData) {
      setAttribute(RestConst.FORM_PARAMETERS, (Map<String, Object>) bodyObject);
    } else {
      setAttribute(RestConst.BODY_PARAMETER, bodyObject);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterOperation.java`
#### Snippet
```java
   * Get schemas list of service
   *
   * @throws OperationException
   */
   List<SchemaInfo> getServiceSchemasList(String serviceId, boolean withContent);
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterOperation.java`
#### Snippet
```java
   * Delete a microservice instance
   *
   * @throws OperationException
   */
  void deleteMicroserviceInstance(String serviceId, String instanceId);
```

### JavadocDeclaration
`@param heartbeatsRequest` tag description is missing
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterOperation.java`
#### Snippet
```java
   * Batch send heartbeats to service-center
   *
   * @param heartbeatsRequest
   * @return
   * @throws OperationException
```

### JavadocDeclaration
Tag `return` is not allowed here
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterOperation.java`
#### Snippet
```java
   *
   * @param heartbeatsRequest
   * @return
   * @throws OperationException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterOperation.java`
#### Snippet
```java
   * @param heartbeatsRequest
   * @return
   * @throws OperationException
   */
  void sendHeartBeats(HeartbeatsRequest heartbeatsRequest);
```

### JavadocDeclaration
`@param serviceId` tag description is missing
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterClient.java`
#### Snippet
```java
   * Get one schema context of service
   *
   * @param serviceId
   * @param schemaId
   * @return
```

### JavadocDeclaration
`@param schemaId` tag description is missing
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterClient.java`
#### Snippet
```java
   *
   * @param serviceId
   * @param schemaId
   * @return
   * @throws OperationException
```

### JavadocDeclaration
`@return` tag description is missing
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterClient.java`
#### Snippet
```java
   * @param serviceId
   * @param schemaId
   * @return
   * @throws OperationException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterClient.java`
#### Snippet
```java
   * @param schemaId
   * @return
   * @throws OperationException
   */
  public String getServiceSchemaContext(String serviceId, String schemaId) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/BodyProcessorCreator.java`
#### Snippet
```java
     * @param arg body param object
     * @return the deserialized body buffer
     * @throws IOException
     */
    private Buffer createBodyBuffer(String contentType, Object arg) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/context/ContextUtils.java`
#### Snippet
```java
   *
   * @param future must be InvocationContextCompletableFuture, that is returned from consumer api
   * @return
   */
  public static InvocationContext getFromCompletableFuture(CompletableFuture<?> future) {
```

### JavadocDeclaration
`@param providerParamIdx` tag description is missing
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/AbstractArgumentsMapperCreator.java`
#### Snippet
```java
  /**
   *
   * @param providerParamIdx
   * @param providerParameter processing provider parameter
   */
```

### JavadocDeclaration
`@param providerParamIdx` tag description is missing
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/AbstractArgumentsMapperCreator.java`
#### Snippet
```java
  /**
   *
   * @param providerParamIdx
   * @param providerParameter processing provider parameter
   * @param parameterName
```

### JavadocDeclaration
`@param parameterName` tag description is missing
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/AbstractArgumentsMapperCreator.java`
#### Snippet
```java
   * @param providerParamIdx
   * @param providerParameter processing provider parameter
   * @param parameterName
   * @return true means processed
   */
```

### JavadocDeclaration
`@param file` tag description is missing
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
  /**
   *
   * @param file
   * @param openOptions
   * @return future of save to file, future complete means write to file finished
```

### JavadocDeclaration
`@param openOptions` tag description is missing
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
   *
   * @param file
   * @param openOptions
   * @return future of save to file, future complete means write to file finished
   */
```

### JavadocDeclaration
`@param fileName` tag description is missing
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
  /**
   *
   * @param fileName
   * @return future of save to file, future complete means write to file finished
   */
```

### JavadocDeclaration
`@param writeStream` tag description is missing
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
  /**
   *
   * @param writeStream
   * @return future of save action<br>
   *
```

### JavadocDeclaration
`@param context` tag description is missing
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/PumpCommon.java`
#### Snippet
```java
  /**
   *
   * @param context
   * @param readStream
   * @param writeStream
```

### JavadocDeclaration
`@param readStream` tag description is missing
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/PumpCommon.java`
#### Snippet
```java
   *
   * @param context
   * @param readStream
   * @param writeStream
   * @return future of save action<br>
```

### JavadocDeclaration
`@param writeStream` tag description is missing
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/PumpCommon.java`
#### Snippet
```java
   * @param context
   * @param readStream
   * @param writeStream
   * @return future of save action<br>
   * <p>important:
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
   * @param microserviceName hortName, or appId:shortName when invoke cross app
   * @param versionRule if is empty, then use configuration value
   * @return
   */
  public MicroserviceReferenceConfig createMicroserviceReferenceConfig(String microserviceName, String versionRule) {
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
   * for normal consumers
   * @param microserviceName shortName, or appId:shortName when invoke cross app
   * @return
   */
  public MicroserviceReferenceConfig createMicroserviceReferenceConfig(String microserviceName) {
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
   * @param microserviceName hortName, or appId:shortName when invoke cross app
   * @param versionRule if is empty, then use configuration value
   * @return
   */
  public CompletableFuture<MicroserviceReferenceConfig> createMicroserviceReferenceConfigAsync(String microserviceName,
```

### JavadocDeclaration
Tag `param` is not allowed here
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/base/DynamicEnumCache.java`
#### Snippet
```java
  /**
   *
   * @param cls
   */
  private final Constructor<T> constructor;
```

### JavadocDeclaration
`@param eventClass` tag description is missing
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/event/SimpleEventBus.java`
#### Snippet
```java
   * subscribersMap almost stable<br>
   * so we not care for performance of collectSubscriberForEvent
   * @param eventClass
   */
  private List<SimpleSubscriber> collectSubscriberForEvent(Class<?> eventClass) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/KeyPairUtils.java`
#### Snippet
```java
   * @param content original content
   * @return verify result
   * @throws NoSuchAlgorithmException
   * @throws InvalidKeySpecException
   * @throws InvalidKeyException
```

### JavadocDeclaration
`@throws` tag description is missing
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/KeyPairUtils.java`
#### Snippet
```java
   * @return verify result
   * @throws NoSuchAlgorithmException
   * @throws InvalidKeySpecException
   * @throws InvalidKeyException
   * @throws SignatureException
```

### JavadocDeclaration
`@throws` tag description is missing
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/KeyPairUtils.java`
#### Snippet
```java
   * @throws NoSuchAlgorithmException
   * @throws InvalidKeySpecException
   * @throws InvalidKeyException
   * @throws SignatureException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/KeyPairUtils.java`
#### Snippet
```java
   * @throws InvalidKeySpecException
   * @throws InvalidKeyException
   * @throws SignatureException
   */
  public static boolean verify(String publicKey, String sign, String content)
```

### JavadocDeclaration
`@param key` tag description is missing
in `handlers/handler-fault-injection/src/main/java/org/apache/servicecomb/faultinjection/FaultInjectionUtil.java`
#### Snippet
```java
  /**
   * Sets the value for given config parameter.
   * @param key
   * @param value
   */
```

### JavadocDeclaration
`@param value` tag description is missing
in `handlers/handler-fault-injection/src/main/java/org/apache/servicecomb/faultinjection/FaultInjectionUtil.java`
#### Snippet
```java
   * Sets the value for given config parameter.
   * @param key
   * @param value
   */
  public static void setConfigCenterValue(String key, AtomicInteger value) {
```

### JavadocDeclaration
`@param instance` tag description is missing
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceInstancePing.java`
#### Snippet
```java
  /**
   * check if this instance if valid to use
   * @param instance
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceInstancePing.java`
#### Snippet
```java
   * check if this instance if valid to use
   * @param instance
   * @return
   */
  boolean ping(MicroserviceInstance instance);
```

### JavadocDeclaration
Wrong tag `Author`
in `governance/src/main/java/org/apache/servicecomb/router/model/RouteItem.java`
#### Snippet
```java

/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
```

### JavadocDeclaration
Wrong tag `Date`
in `governance/src/main/java/org/apache/servicecomb/router/model/RouteItem.java`
#### Snippet
```java
/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
public class RouteItem implements Comparable<RouteItem> {
```

### JavadocDeclaration
Wrong tag `Author`
in `governance/src/main/java/org/apache/servicecomb/router/model/Matcher.java`
#### Snippet
```java

/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
```

### JavadocDeclaration
Wrong tag `Date`
in `governance/src/main/java/org/apache/servicecomb/router/model/Matcher.java`
#### Snippet
```java
/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
public class Matcher {
```

### JavadocDeclaration
Wrong tag `Author`
in `governance/src/main/java/org/apache/servicecomb/router/exception/RouterIllegalParamException.java`
#### Snippet
```java

/**
 * @Author GuoYl123
 * @Date 2019/11/4
 **/
```

### JavadocDeclaration
Wrong tag `Date`
in `governance/src/main/java/org/apache/servicecomb/router/exception/RouterIllegalParamException.java`
#### Snippet
```java
/**
 * @Author GuoYl123
 * @Date 2019/11/4
 **/
public class RouterIllegalParamException extends RuntimeException {
```

### JavadocDeclaration
Wrong tag `Author`
in `governance/src/main/java/org/apache/servicecomb/router/model/ServiceInfoCache.java`
#### Snippet
```java

/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
```

### JavadocDeclaration
Wrong tag `Date`
in `governance/src/main/java/org/apache/servicecomb/router/model/ServiceInfoCache.java`
#### Snippet
```java
/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
public class ServiceInfoCache {
```

### JavadocDeclaration
Wrong tag `Author`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/RouterDistributor.java`
#### Snippet
```java

/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
```

### JavadocDeclaration
Wrong tag `Date`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/RouterDistributor.java`
#### Snippet
```java
/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
public interface RouterDistributor<INSTANCE> {
```

### JavadocDeclaration
Wrong tag `Author`
in `governance/src/main/java/org/apache/servicecomb/router/model/PolicyRuleItem.java`
#### Snippet
```java

/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
```

### JavadocDeclaration
Wrong tag `Date`
in `governance/src/main/java/org/apache/servicecomb/router/model/PolicyRuleItem.java`
#### Snippet
```java
/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
public class PolicyRuleItem implements Comparable<PolicyRuleItem> {
```

### JavadocDeclaration
`@param latestVersionTag` tag description is missing
in `governance/src/main/java/org/apache/servicecomb/router/model/PolicyRuleItem.java`
#### Snippet
```java
   * if weight is less than 100, fill with minimum version
   *
   * @param latestVersionTag
   */
  public void check(TagItem latestVersionTag) {
```

### JavadocDeclaration
Wrong tag `Author`
in `governance/src/main/java/org/apache/servicecomb/router/model/HeaderRule.java`
#### Snippet
```java

/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
```

### JavadocDeclaration
Wrong tag `Date`
in `governance/src/main/java/org/apache/servicecomb/router/model/HeaderRule.java`
#### Snippet
```java
/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
public class HeaderRule {
```

### JavadocDeclaration
`@param item` tag description is missing
in `governance/src/main/java/org/apache/servicecomb/router/model/TagItem.java`
#### Snippet
```java
   * return match num
   *
   * @param item
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `governance/src/main/java/org/apache/servicecomb/router/model/TagItem.java`
#### Snippet
```java
   *
   * @param item
   * @return
   */
  public int matchNum(TagItem item) {
```

### JavadocDeclaration
Wrong tag `Author`
in `governance/src/main/java/org/apache/servicecomb/router/model/TagItem.java`
#### Snippet
```java

/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
```

### JavadocDeclaration
Wrong tag `Date`
in `governance/src/main/java/org/apache/servicecomb/router/model/TagItem.java`
#### Snippet
```java
/**
 * @Author GuoYl123
 * @Date 2019/10/17
 **/
public class TagItem {
```

### JavadocDeclaration
`@param targetStr` tag description is missing
in `governance/src/main/java/org/apache/servicecomb/governance/marker/operator/CompareOperator.java`
#### Snippet
```java
   * 支持 > < = >= <= ! 后面加数字
   *
   * @param targetStr
   * @param patternStr
   * @return
```

### JavadocDeclaration
`@param patternStr` tag description is missing
in `governance/src/main/java/org/apache/servicecomb/governance/marker/operator/CompareOperator.java`
#### Snippet
```java
   *
   * @param targetStr
   * @param patternStr
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `governance/src/main/java/org/apache/servicecomb/governance/marker/operator/CompareOperator.java`
#### Snippet
```java
   * @param targetStr
   * @param patternStr
   * @return
   */
  @Override
```

### JavadocDeclaration
Wrong tag `created`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/InputEx.java`
#### Snippet
```java
 *
 * @author David Yu
 * @created Nov 9, 2009
 */
public interface InputEx {
```

### JavadocDeclaration
Wrong tag `created`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/SchemaEx.java`
#### Snippet
```java
 *
 * @author David Yu
 * @created Nov 9, 2009
 */
public interface SchemaEx<T> extends SchemaWriter<T>, SchemaReader<T> {
```

### JavadocDeclaration
Wrong tag `created`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/OutputEx.java`
#### Snippet
```java
 *
 * @author David Yu
 * @created Nov 9, 2009
 */
public interface OutputEx {
```

### JavadocDeclaration
`@param output` tag description is missing
in `foundations/foundation-protobuf/src/main/java/io/protostuff/runtime/FieldSchema.java`
#### Snippet
```java
   * write from map
   *
   * @param output
   * @param value field value, will not be null
   * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `foundations/foundation-protobuf/src/main/java/io/protostuff/runtime/FieldSchema.java`
#### Snippet
```java
   * @param output
   * @param value field value, will not be null
   * @throws IOException
   */
  public void writeTo(OutputEx output, Object value) throws IOException {
```

### JavadocDeclaration
`@param protoField` tag description is missing
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/ProtoUtils.java`
#### Snippet
```java
  /**
   * all supported type, default to packed
   * @param protoField
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/ProtoUtils.java`
#### Snippet
```java
   * all supported type, default to packed
   * @param protoField
   * @return
   */
  public static boolean isSupportPacked(Field protoField) {
```

### JavadocDeclaration
Wrong tag `created`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java
 *
 * @author David Yu
 * @created Jun 22, 2010
 */
public final class ByteArrayInputEx implements InputEx {
```

### JavadocDeclaration
`@param output` tag description is missing
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/any/AnyEntrySchema.java`
#### Snippet
```java
   * so message will be serialized with json schema
   * </pre>
   * @param output
   * @param value
   * @throws IOException
```

### JavadocDeclaration
`@param value` tag description is missing
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/any/AnyEntrySchema.java`
#### Snippet
```java
   * </pre>
   * @param output
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/any/AnyEntrySchema.java`
#### Snippet
```java
   * @param output
   * @param value
   * @throws IOException
   */
  @Override
```

### JavadocDeclaration
`@param protoField` tag description is missing
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/SchemaManager.java`
#### Snippet
```java
  /**
   *
   * @param protoField
   * @param propertyDescriptor provide getter/setter/javaType
   * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/SchemaManager.java`
#### Snippet
```java
   * @param protoField
   * @param propertyDescriptor provide getter/setter/javaType
   * @return
   */
  protected abstract <T> FieldSchema<T> createScalarField(Field protoField, PropertyDescriptor propertyDescriptor);
```

### JavadocDeclaration
Wrong tag `created`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
 *
 * @author David Yu
 * @created May 18, 2010
 */
public final class ProtobufOutputEx extends WriteSession implements OutputEx {
```

### JavadocDeclaration
`@param swaggerGenerator` tag description is missing
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/ResponseTypeProcessor.java`
#### Snippet
```java
  /**
   *
   * @param swaggerGenerator
   * @param operationGenerator
   * @param genericResponseType
```

### JavadocDeclaration
`@param operationGenerator` tag description is missing
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/ResponseTypeProcessor.java`
#### Snippet
```java
   *
   * @param swaggerGenerator
   * @param operationGenerator
   * @param genericResponseType
   * @return if genericResponseType is CompletableFuture&lt;String&gt;, then return String
```

### JavadocDeclaration
`@param genericResponseType` tag description is missing
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/ResponseTypeProcessor.java`
#### Snippet
```java
   * @param swaggerGenerator
   * @param operationGenerator
   * @param genericResponseType
   * @return if genericResponseType is CompletableFuture&lt;String&gt;, then return String
   */
```

### JavadocDeclaration
`@param basePath` tag description is missing
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGenerator.java`
#### Snippet
```java
  /**
   * support placeholder
   * @param basePath
   */
  void setBasePath(String basePath);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `timeoutExceptionConverter` may be 'final'
in `core/src/main/java/org/apache/servicecomb/core/exception/converter/ServiceCombExceptionConverter.java`
#### Snippet
```java
  public static final int ORDER = Byte.MAX_VALUE;

  private TimeoutExceptionConverter timeoutExceptionConverter = new TimeoutExceptionConverter();

  @Override
```

### FieldMayBeFinal
Field `retryExtension` may be 'final'
in `core/src/main/java/org/apache/servicecomb/core/governance/ServiceCombInstanceIsolationExtension.java`
#### Snippet
```java

public class ServiceCombInstanceIsolationExtension extends AbstractInstanceIsolationExtension {
  private ServiceCombRetryExtension retryExtension = new ServiceCombRetryExtension();

  @Override
```

### FieldMayBeFinal
Field `allInterfaceAddresses` may be 'final'
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/NetUtils.java`
#### Snippet
```java

  // key is network interface name and type
  private static Map<String, InetAddress> allInterfaceAddresses = new HashMap<>();

  private static String hostName;
```

### FieldMayBeFinal
Field `authenticationTokenManager` may be 'final'
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/consumer/ConsumerAuthFilter.java`
#### Snippet
```java

public class ConsumerAuthFilter implements ConsumerFilter {
  private ConsumerTokenManager authenticationTokenManager = new ConsumerTokenManager();

  @Override
```

### FieldMayBeFinal
Field `matchersService` may be 'final'
in `governance/src/main/java/org/apache/servicecomb/governance/MatchersManager.java`
#### Snippet
```java

public class MatchersManager {
  private MatchersService matchersService;

  public MatchersManager(MatchersService matchersService) {
```

### FieldMayBeFinal
Field `projectName` may be 'final'
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/AbstractAddressManager.java`
#### Snippet
```java
  private int index = 0;

  private String projectName;

  // if address in same zone will be true; others will be false.
```

## RuleId[id=InstantiationOfUtilityClass]
### InstantiationOfUtilityClass
Instantiation of utility class `QueryCodecsUtils`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/CommonRestConfiguration.java`
#### Snippet
```java
  @Bean
  public QueryCodecsUtils queryCodecsUtils(QueryCodecs queryCodecs) {
    return new QueryCodecsUtils(queryCodecs);
  }

```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `service-registry/registry-schema-discovery/src/main/java/org/apache/servicecomb/schemadiscovery/SchemaDiscovery.java`
#### Snippet
```java
        } catch (Exception e) {
          LOGGER.warn("failed query schema from endpoint {}, msg {}", endpoint, e.getMessage());
          continue;
        }
      }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `core/src/main/java/org/apache/servicecomb/core/transport/TransportManager.java`
#### Snippet
```java
          RegistrationManager.INSTANCE.addEndpoint(endpoint.getEndpoint());
        }
        continue;
      }
    }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `requestEx`
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/RestAsyncListener.java`
#### Snippet
```java
    // Waiting till executing in executor done. This operation may block container pool and make timeout requests in executor's
    // queue getting executed, and will cause bad performance. So default timeout is setting to -1 to disable timeout.
    synchronized (requestEx) {
      ServletResponse response = event.getAsyncContext().getResponse();
      if (!response.isCommitted()) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `parent`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/discovery/AbstractDiscoveryFilter.java`
#### Snippet
```java
  public DiscoveryTreeNode discovery(DiscoveryContext context, DiscoveryTreeNode parent) {
    if (!parent.childrenInited()) {
      synchronized (parent) {
        if (!parent.childrenInited()) {
          init(context, parent);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `api` is redundant
in `dynamic-config/config-apollo/src/main/java/org/apache/servicecomb/config/client/ApolloClient.java`
#### Snippet
```java

    private String composeAPI() {
      String api = serviceUri + "/openapi/v1/envs/" + env +
          "/apps/" + serviceName +
          "/clusters/" + clusters +
```

### UnnecessaryLocalVariable
Local variable `custom` is redundant
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLCustom.java`
#### Snippet
```java

  public static SSLCustom defaultSSLCustom() {
    final SSLCustom custom = new SSLCustom() {
      @Override
      public char[] decode(char[] encrypted) {
```

### UnnecessaryLocalVariable
Local variable `tmpSocketAddress` is redundant
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/IpPort.java`
#### Snippet
```java
      synchronized (lock) {
        if (socketAddress == null) {
          InetSocketAddress tmpSocketAddress = new InetSocketAddress(hostOrIp, port);
          socketAddress = tmpSocketAddress;
        }
```

### UnnecessaryLocalVariable
Local variable `cseCallback` is redundant
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseRestTemplate.java`
#### Snippet
```java
  public <T> RequestCallback httpEntityCallback(Object requestBody, Type responseType) {
    RequestCallback callback = super.httpEntityCallback(requestBody, responseType);
    CseRequestCallback cseCallback = new CseRequestCallback(requestBody, callback, responseType);
    return cseCallback;
  }
```

### UnnecessaryLocalVariable
Local variable `cseCallback` is redundant
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseRestTemplate.java`
#### Snippet
```java
  public <T> RequestCallback httpEntityCallback(Object requestBody) {
    RequestCallback callback = super.httpEntityCallback(requestBody);
    CseRequestCallback cseCallback = new CseRequestCallback(requestBody, callback, null);
    return cseCallback;
  }
```

### UnnecessaryLocalVariable
Local variable `loadBalance` is redundant
in `governance/src/main/java/org/apache/servicecomb/governance/processor/loadbanlance/LoadBalance.java`
#### Snippet
```java

  static LoadBalance getLoadBalance(String key, LoadBalancerPolicy policy) {
    LoadBalance loadBalance = new LoadBalanceImpl(policy.getRule());
    return loadBalance;
  }
```

### UnnecessaryLocalVariable
Local variable `config` is redundant
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigUtil.java`
#### Snippet
```java
    }

    ConcurrentCompositeConfiguration config = ConfigUtil.createLocalConfig(loader.getConfigModels());
    return config;
  }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/src/main/java/org/apache/servicecomb/core/bootstrap/SCBEngineForTest.java`
#### Snippet
```java
    getExecutorManager().registerExecutor(EXECUTOR_GROUP_THREADPOOL, new GroupExecutor().init());

    List<Filter> filters = Arrays.asList(
        new EmptyFilter()
    );
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/PaaSResourceUtils.java`
#### Snippet
```java

  public static Properties loadMergedProperties(String locationPattern) throws Exception {
    PropertiesLoader loader = new PropertiesLoader(Arrays.asList(locationPattern));
    return loader.load();
  }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/PaaSResourceUtils.java`
#### Snippet
```java
    for (String locationPattern : locationPatterns) {
      Resource[] resArr = getResources(locationPattern);
      ret.addAll(Arrays.asList(resArr));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncRestTemplate.java`
#### Snippet
```java
  public CseAsyncRestTemplate() {
    super(createSimpleClientHttpRequestFactory(), createRestTemplate());
    setMessageConverters(Arrays.asList(new CseHttpMessageConverter()));
    setAsyncRequestFactory(new CseAsyncClientHttpRequestFactory());
    setUriTemplateHandler(new CseUriTemplateHandler());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseRestTemplate.java`
#### Snippet
```java
public class CseRestTemplate extends AcceptableRestTemplate {
  public CseRestTemplate() {
    setMessageConverters(Arrays.asList(new CseHttpMessageConverter()));
    setRequestFactory(new CseClientHttpRequestFactory());
    setUriTemplateHandler(new CseUriTemplateHandler());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
  @Override
  public void setHeader(String name, String value) {
    httpHeaders.put(name, Arrays.asList(value));
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/MessageWriteSchema.java`
#### Snippet
```java
    FieldSchema<T> fieldSchema = protoMapper.getSerializerSchemaManager()
        .createSchemaField(protoField, propertyDescriptor);
    return FieldMapEx.createFieldMap(Arrays.asList(fieldSchema));
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/collect/ServiceCenterDefaultDeploymentProvider.java`
#### Snippet
```java
    List<String> urls = ConfigUtil.parseArrayValue(configuration.getString("servicecomb.service.registry.address"));
    if (urls.isEmpty()) {
      urls = Arrays.asList("http://127.0.0.1:30100");
    }
    sc.setAccessURL(urls);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractSwaggerGenerator.java`
#### Snippet
```java
    List<String> produces = swagger.getProduces();
    if (produces == null || produces.isEmpty()) {
      produces = Arrays.asList(MediaType.APPLICATION_JSON);
      swagger.setProduces(produces);
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractSwaggerGenerator.java`
#### Snippet
```java
    List<String> consumes = swagger.getConsumes();
    if (consumes == null || consumes.isEmpty()) {
      consumes = Arrays.asList(MediaType.APPLICATION_JSON);
      swagger.setConsumes(consumes);
    }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/swagger/SwaggerLoader.java`
#### Snippet
```java
  // result length is 64
  public static String calcSchemaSummary(String schemaContent) {
    return Hashing.sha256().newHasher().putString(schemaContent, Charsets.UTF_8).hash().toString();
  }

```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/swagger/SwaggerLoader.java`
#### Snippet
```java
  // result length is 64
  public static String calcSchemaSummary(String schemaContent) {
    return Hashing.sha256().newHasher().putString(schemaContent, Charsets.UTF_8).hash().toString();
  }

```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/swagger/SwaggerLoader.java`
#### Snippet
```java
  // result length is 64
  public static String calcSchemaSummary(String schemaContent) {
    return Hashing.sha256().newHasher().putString(schemaContent, Charsets.UTF_8).hash().toString();
  }

```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'requestEx' to 'StandardHttpServletRequestEx'
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/ServletRestDispatcher.java`
#### Snippet
```java
    HttpServletResponseEx responseEx = new StandardHttpServletResponseEx(response);

    ((StandardHttpServletRequestEx) requestEx).setCacheRequest(true);
    InvocationCreator creator = new RestServletProducerInvocationCreator(microserviceMeta, transport.getEndpoint(),
        requestEx, responseEx);
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'String'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/QueryProcessorCreator.java`
#### Snippet
```java
      Object value = request.getParameter(paramPath);
      // make some old systems happy
      if (emptyAsNull && StringUtils.isEmpty((String) value)) {
        value = null;
      }
```

