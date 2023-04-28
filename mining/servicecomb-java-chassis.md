# servicecomb-java-chassis 
 
# Bad smells
I found 1432 bad smells with 223 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 325 | false |
| BoundedWildcard | 172 | false |
| UtilityClassWithoutPrivateConstructor | 157 | true |
| AssignmentToMethodParameter | 99 | false |
| RedundantFieldInitialization | 52 | false |
| NonProtectedConstructorInAbstractClass | 40 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 37 | false |
| DataFlowIssue | 37 | false |
| ClassCanBeRecord | 29 | false |
| MissingSerialAnnotation | 28 | false |
| PatternVariableCanBeUsed | 27 | false |
| UnnecessaryFullyQualifiedName | 27 | false |
| RedundantSuppression | 26 | false |
| EnhancedSwitchMigration | 25 | false |
| ZeroLengthArrayInitialization | 24 | false |
| RedundantClassCall | 23 | false |
| IfStatementWithIdenticalBranches | 22 | false |
| UnusedAssignment | 17 | false |
| PublicFieldAccessedInSynchronizedContext | 17 | false |
| TextBlockMigration | 16 | false |
| SizeReplaceableByIsEmpty | 15 | true |
| ConstantValue | 15 | false |
| DynamicRegexReplaceableByCompiledPattern | 15 | false |
| StringConcatenationInsideStringBufferAppend | 14 | false |
| RedundantMethodOverride | 11 | false |
| EmptyMethod | 11 | false |
| SimplifyStreamApiCallChains | 11 | false |
| AssignmentToStaticFieldFromInstanceMethod | 9 | false |
| IgnoreResultOfCall | 8 | false |
| CharsetObjectCanBeUsed | 8 | false |
| NestedAssignment | 7 | false |
| UnnecessaryLocalVariable | 7 | true |
| StaticCallOnSubclass | 6 | false |
| SynchronizeOnThis | 6 | false |
| StringBufferReplaceableByString | 5 | false |
| StringEqualsEmptyString | 5 | false |
| NullableProblems | 4 | false |
| ReplaceAssignmentWithOperatorAssignment | 4 | false |
| DuplicateThrows | 4 | false |
| UnnecessaryQualifierForThis | 3 | false |
| UnnecessaryReturn | 3 | true |
| NonSynchronizedMethodOverridesSynchronizedMethod | 3 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| UnstableApiUsage | 3 | false |
| CommentedOutCode | 2 | false |
| RegExpRedundantEscape | 2 | false |
| ObsoleteCollection | 2 | false |
| ClassNameSameAsAncestorName | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| SlowListContainsAll | 2 | false |
| MethodOverridesStaticMethod | 2 | false |
| RedundantLengthCheck | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| Java9CollectionFactory | 2 | false |
| UnnecessaryContinue | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| RegExpSimplifiable | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| RedundantImplements | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| CallToStringConcatCanBeReplacedByOperator | 1 | false |
| FuseStreamOperations | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| IOResource | 1 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| FieldMayBeStatic | 1 | false |
| UnnecessarySemicolon | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| Convert2MethodRef | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
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

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `fillProperties()` declared in class 'org.springframework.core.io.support.PropertiesLoaderUtils' but referenced via subclass 'org.apache.servicecomb.foundation.common.config.impl.PaaSPropertiesLoaderUtils'
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/impl/PaaSPropertiesLoaderUtils.java`
#### Snippet
```java
  public static void fillAllProperties(Properties prop, List<Resource> resList) throws IOException {
    for (Resource res : resList) {
      PaaSPropertiesLoaderUtils.fillProperties(prop, res);
    }
  }
```

### StaticCallOnSubclass
Static method `isSuccess()` declared in class 'org.apache.servicecomb.foundation.common.http.HttpStatus' but referenced via subclass 'org.apache.servicecomb.swagger.invocation.context.HttpStatus'
in `swagger/swagger-invocation/invocation-springmvc/src/main/java/org/apache/servicecomb/swagger/invocation/springmvc/response/SpringmvcProducerResponseMapper.java`
#### Snippet
```java

    Response cseResponse = null;
    if (HttpStatus.isSuccess(responseStatus)) {
      cseResponse = realMapper.mapResponse(responseStatus, springmvcResponse.getBody());
    } else {
```

### StaticCallOnSubclass
Static method `isSuccess()` declared in class 'org.apache.servicecomb.foundation.common.http.HttpStatus' but referenced via subclass 'org.apache.servicecomb.swagger.invocation.context.HttpStatus'
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/ProtoMethod.java`
#### Snippet
```java
    }

    if (HttpStatus.isSuccess(statusCode)) {
      return responses.get(Status.OK.getStatusCode());
    }
```

### StaticCallOnSubclass
Static method `isSuccess()` declared in class 'org.apache.servicecomb.foundation.common.http.HttpStatus' but referenced via subclass 'org.apache.servicecomb.swagger.invocation.context.HttpStatus'
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/http/DefaultHttpClientFilter.java`
#### Snippet
```java
              responseEx.getStatusType().getReasonPhrase(),
              responseEx.getHeader(HttpHeaders.CONTENT_TYPE));
      if (HttpStatus.isSuccess(responseEx.getStatus())) {
        return Response.createConsumerFail(
            new InvocationException(400, responseEx.getStatusType().getReasonPhrase(),
```

### StaticCallOnSubclass
Static method `isSuccess()` declared in class 'org.apache.servicecomb.foundation.common.http.HttpStatus' but referenced via subclass 'org.apache.servicecomb.swagger.invocation.context.HttpStatus'
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/response/ResponsesMeta.java`
#### Snippet
```java
    JavaType responseType = responseMap.get(statusCode);
    if (responseType == null) {
      if (HttpStatus.isSuccess(statusCode)) {
        return responseMap.get(Status.OK.getStatusCode());
      }
```

### StaticCallOnSubclass
Static method `isSuccess()` declared in class 'org.apache.servicecomb.foundation.common.http.HttpStatus' but referenced via subclass 'org.apache.servicecomb.swagger.invocation.context.HttpStatus'
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/Response.java`
#### Snippet
```java

  public boolean isSucceed() {
    return HttpStatus.isSuccess(status);
  }

```

## RuleId[id=RedundantClassCall]
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
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/archaius/sources/AbstractConfigLoader.java`
#### Snippet
```java

    if (objOrder != null) {
      if (Integer.class.isInstance(objOrder)) {
        configModel.setOrder((int) objOrder);
      } else {
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
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncRequestCallback.java`
#### Snippet
```java
    }

    if (!CseHttpEntity.class.isInstance(requestBody)) {
      return;
    }
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
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/ServletUtils.java`
#### Snippet
```java
    if (servlets != null) {
      for (ServletRegistration servletRegistration : servlets) {
        if (!Dynamic.class.isInstance(servletRegistration)) {
          continue;
        }
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

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `executableValidator` from instance context
in `swagger/swagger-invocation/invocation-validator/src/main/java/org/apache/servicecomb/swagger/invocation/validator/ParameterValidator.java`
#### Snippet
```java
                .messageInterpolator(messageInterpolator())
                .buildValidatorFactory();
        executableValidator = factory.getValidator().forExecutables();
      }
      Set<ConstraintViolation<Object>> violations =
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `INSTANCE` from instance context
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
    eventBus.register(this);

    INSTANCE = this;

    producerProviderManager = new ProducerProviderManager(this);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EventManager.eventBus` from instance context
in `core/src/main/java/org/apache/servicecomb/core/bootstrap/SCBEngineForTest.java`
#### Snippet
```java
    ReflectUtils.setField(SCBEngine.class, null, "INSTANCE", null);

    EventManager.eventBus = new SimpleEventBus();
  }
}
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `processor` from instance context
in `core/src/main/java/org/apache/servicecomb/core/exception/Exceptions.java`
#### Snippet
```java
  public void setProcessor(List<ExceptionProcessor> processors) {
    // never be null, "orElse" just to avoid compile warning
    processor = processors.stream()
        .min(Comparator.comparingInt(ExceptionProcessor::getOrder))
        .orElse(new DefaultExceptionProcessor());
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `pullInstanceTaskOnceInProgress` from instance context
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterDiscovery.java`
#### Snippet
```java
        pullAllInstance();
      } finally {
        pullInstanceTaskOnceInProgress = false;
      }
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `pullInstanceTaskOnceInProgress` from instance context
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterDiscovery.java`
#### Snippet
```java
      return;
    }
    pullInstanceTaskOnceInProgress = true;
    startTask(new PullInstanceOnceTask());
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `QueryCodecsUtils.queryCodecs` from instance context
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/query/QueryCodecsUtils.java`
#### Snippet
```java

  public QueryCodecsUtils(QueryCodecs queryCodecs) {
    QueryCodecsUtils.queryCodecs = queryCodecs;
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `allHeader` from instance context
in `handlers/handler-router/src/main/java/org/apache/servicecomb/router/custom/RouterInvokeFilter.java`
#### Snippet
```java
              .getStringProperty(SERVICECOMB_ROUTER_HEADER, null);
          if (!addAllHeaders(temHeader.get())) {
            allHeader = new ArrayList<>();
          }
        });
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `allHeader` from instance context
in `handlers/handler-router/src/main/java/org/apache/servicecomb/router/custom/RouterInvokeFilter.java`
#### Snippet
```java
    try {
      if (CollectionUtils.isEmpty(allHeader)) {
        allHeader = Arrays.asList(str.split(","));
      }
    } catch (Exception e) {
```

## RuleId[id=RegExpRedundantEscape]
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

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java

  public static String escapePackageName(String name) {
    return name.replaceAll("[\\-\\:]", "_");
  }

```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/discovery/DiscoveryContext.java`
#### Snippet
```java
  // first try self zone, after other filter(Isolation Filter), no instances are available
  // then try other zone
  private final Stack<DiscoveryTreeNode> rerunStack = new Stack<>();

  private DiscoveryTreeNode currentNode;
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/discovery/DiscoveryContext.java`
#### Snippet
```java
  // first try self zone, after other filter(Isolation Filter), no instances are available
  // then try other zone
  private final Stack<DiscoveryTreeNode> rerunStack = new Stack<>();

  private DiscoveryTreeNode currentNode;
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

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `OutputStreamToWriteStream` on 'this' is unnecessary in this context
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/OutputStreamToWriteStream.java`
#### Snippet
```java
        outputStream.write(buffer.getBytes());

        synchronized (OutputStreamToWriteStream.this) {
          currentBufferCount--;
          Runnable action = (currentBufferCount == 0 && closedDeferred != null) ? closedDeferred : this::checkDrained;
```

### UnnecessaryQualifierForThis
Qualifier `URLMappedEdgeDispatcher` on 'this' is unnecessary in this context
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/URLMappedEdgeDispatcher.java`
#### Snippet
```java
    String pattern = DynamicPropertyFactory.getInstance().getStringProperty(KEY_PATTERN, PATTERN_ANY).get();
    router.routeWithRegex(pattern).failureHandler(this::onFailure)
        .handler((PlatformHandler) URLMappedEdgeDispatcher.this::preCheck)
        .handler(createBodyHandler())
        .handler(this::onRequest);
```

### UnnecessaryQualifierForThis
Qualifier `AbstractTask` on 'this' is unnecessary in this context
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/task/AbstractTask.java`
#### Snippet
```java
  protected AbstractTask(String taskName) {
    initTaskPool(taskName);
    Runtime.getRuntime().addShutdownHook(new Thread(AbstractTask.this::stop, taskName + "-shutdown-hook"));
  }

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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`violations.size() > 0` can be replaced with '!violations.isEmpty()'
in `swagger/swagger-invocation/invocation-validator/src/main/java/org/apache/servicecomb/swagger/invocation/validator/ParameterValidator.java`
#### Snippet
```java
              args,
              Default.class);
      if (violations.size() > 0) {
        LOGGER.warn("Parameter validation failed : " + violations);
        throw new ConstraintViolationException(violations);
```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/FrameworkVersions.java`
#### Snippet
```java
    StringBuffer sb = new StringBuffer();
    frameworkVersions.forEach(version -> version.loadVersion().forEach((key, value) -> sb.append(key).append(":").append(value).append(";")));
    if (sb.length() > 0) {
      sb.setLength(sb.length() - 1);
    }
```

### SizeReplaceableByIsEmpty
`violations.size() > 0` can be replaced with '!violations.isEmpty()'
in `core/src/main/java/org/apache/servicecomb/core/filter/impl/ParameterValidatorFilter.java`
#### Snippet
```java
  public CompletableFuture<Response> onFilter(Invocation invocation, FilterNode nextNode) {
    Set<ConstraintViolation<Object>> violations = doValidate(invocation);
    if (violations.size() > 0) {
      LOGGER.error("Parameter validation failed : " + violations);
      return AsyncUtils.completeExceptionally(new ConstraintViolationException(violations));
```

### SizeReplaceableByIsEmpty
`path.length() > 0` can be replaced with '!path.isEmpty()'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/OperationLocator.java`
#### Snippet
```java
  // Path: /a/b/c -> /a/b/c/
  static String getStandardPath(String path) {
    if (path.length() > 0 && !path.endsWith(SLASH)) {
      path += SLASH;
    }
```

### SizeReplaceableByIsEmpty
`pathPattern.length() > 0` can be replaced with '!pathPattern.isEmpty()'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
      }
    }
    if (pathPattern.length() > 0
        && pathPattern.charAt(pathPattern.length() - 1) != '/') {
      pathPattern.append('/');
```

### SizeReplaceableByIsEmpty
`tmpPath.length() != 0` can be replaced with '!tmpPath.isEmpty()'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/URLPathBuilder.java`
#### Snippet
```java
      char currentChar = rawPath.charAt(idx);
      if (currentChar == '{') {
        if (tmpPath.length() != 0) {
          this.pathParamWriterList.add(new StaticUrlParamWriter(tmpPath.toString()));
          tmpPath.setLength(0);
```

### SizeReplaceableByIsEmpty
`tmpPath.length() == 0` can be replaced with 'tmpPath.isEmpty()'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/URLPathBuilder.java`
#### Snippet
```java
        }
      } else if (currentChar == '}') {
        if (tmpPath.length() == 0) {
          continue;
        }
```

### SizeReplaceableByIsEmpty
`tmpPath.length() != 0` can be replaced with '!tmpPath.isEmpty()'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/URLPathBuilder.java`
#### Snippet
```java
      }
    }
    if (tmpPath.length() != 0) {
      this.pathParamWriterList.add(new StaticUrlParamWriter(tmpPath.toString()));
    }
```

### SizeReplaceableByIsEmpty
`caches.size() == 0` can be replaced with 'caches.isEmpty()'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/AggregateMicroserviceCache.java`
#### Snippet
```java

  private void refreshStatus() {
    if (caches.size() == 0) {
      status = MicroserviceCacheStatus.SERVICE_NOT_FOUND;
    } else {
```

### SizeReplaceableByIsEmpty
`requestParam.getHeaders().size() > 0` can be replaced with '!requestParam.getHeaders().isEmpty()'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RestClientUtil.java`
#### Snippet
```java
        httpClientRequest.headers().addAll(headers);

        if (requestParam.getHeaders() != null && requestParam.getHeaders().size() > 0) {
          headers.putAll(requestParam.getHeaders());
          for (Map.Entry<String, String> header : requestParam.getHeaders().entrySet()) {
```

### SizeReplaceableByIsEmpty
`requestParam.getCookies().size() > 0` can be replaced with '!requestParam.getCookies().isEmpty()'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RestClientUtil.java`
#### Snippet
```java

        // cookies header
        if (requestParam.getCookies() != null && requestParam.getCookies().size() > 0) {
          StringBuilder stringBuilder = new StringBuilder();
          for (Map.Entry<String, String> cookie : requestParam.getCookies().entrySet()) {
```

### SizeReplaceableByIsEmpty
`localConfig.size() > 0` can be replaced with '!localConfig.isEmpty()'
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigUtil.java`
#### Snippet
```java
    MicroserviceConfigLoader loader = new MicroserviceConfigLoader();
    loader.loadAndSort();
    if (localConfig.size() > 0) {
      ConfigModel model = new ConfigModel();
      model.setConfig(localConfig);
```

### SizeReplaceableByIsEmpty
`stats.size() > 0` can be replaced with '!stats.isEmpty()'
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/WeightedResponseTimeRuleExt.java`
#### Snippet
```java
    List<Double> stats = calculateTotalWeights(servers);

    if (stats.size() > 0) {
      double finalTotal = stats.get(stats.size() - 1);
      List<Double> weights = new ArrayList<>(servers.size());
```

### SizeReplaceableByIsEmpty
`stats.getServerStats().size() > 0` can be replaced with '!stats.getServerStats().isEmpty()'
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/SessionStickinessRule.java`
#### Snippet
```java
    LoadBalancerStats stats = loadBalancer.getLoadBalancerStats();

    if (stats != null && stats.getServerStats() != null && stats.getServerStats().size() > 0) {
      ServerStats serverStats = stats.getSingleServerStat(lastServer);
      int successiveFailedCount = serverStats.getSuccessiveConnectionFailureCount();
```

### SizeReplaceableByIsEmpty
`tmpSb.length() != 0` can be replaced with '!tmpSb.isEmpty()'
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
          interfaceNode.getName());
    }
    if (tmpSb.length() != 0) {
      sb.append(tmpSb);
    }
```

## RuleId[id=StringBufferReplaceableByString]
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
  protected void schedule(Runnable runnable) {
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

## RuleId[id=TextBlockMigration]
### TextBlockMigration
Concatenation can be replaced with text block
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGeneratorUtils.java`
#### Snippet
```java
    }

    String msg = String.format("parameter name is not present, method=%s:%s\n"
            + "solution:\n"
            + "  change pom.xml, add compiler argument: -parameters, for example:\n"
```

### TextBlockMigration
Concatenation can be replaced with text block
in `core/src/main/java/org/apache/servicecomb/core/executor/GroupExecutor.java`
#### Snippet
```java
  public void initConfig() {
    if (LOG_PRINTED.compareAndSet(false, true)) {
      LOGGER.info("thread pool rules:\n"
          + "1.use core threads.\n"
          + "2.if all core threads are busy, then create new thread.\n"
```

### TextBlockMigration
Concatenation can be replaced with text block
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/MicroserviceRegisterTask.java`
#### Snippet
```java
      LOGGER.warn(
          "service center schema and local schema both are different:"
              + "\n service center schema:\n[{}\n local schema:\n[{}]",
          scSchemaContent,
          localSchemaContent);
```

### TextBlockMigration
Concatenation can be replaced with text block
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/MicroserviceRegisterTask.java`
#### Snippet
```java
      if (ServiceRegistryConfig.INSTANCE.isIgnoreSwaggerDifference()) {
        LOGGER.warn(
            "service center schema and local schema both are different:\n service center "
                + "schema:\n[{}]\n local schema:\n[{}]\nYou have configured to ignore difference "
                + "check. It's recommended to increment microservice version before deploying when "
```

### TextBlockMigration
Concatenation can be replaced with text block
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/diagnosis/instance/InstanceCacheChecker.java`
#### Snippet
```java
    String remote = Json.encode(remoteInstances);
    if (local.equals(remote)) {
      LOGGER.info("instance cache match. appId={}, microservice={}.\n"
              + "current cache: {}\n",
          microserviceVersions.getAppId(),
```

### TextBlockMigration
Concatenation can be replaced with text block
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/diagnosis/instance/InstanceCacheChecker.java`
#### Snippet
```java
    }

    LOGGER.error("instance cache not match. appId={}, microservice={}.\n"
            + "local cache: {}\n"
            + "remote cache: {}",
```

### TextBlockMigration
Concatenation can be replaced with text block
in `providers/provider-pojo/src/main/java/org/apache/servicecomb/provider/pojo/reference/PojoReferenceMeta.java`
#### Snippet
```java
      throw new ServiceCombException(
          String.format(
              "microserviceName=%s, schemaid=%s, \n"
                  + "do not support implicit interface anymore, \n"
                  + "because that caused problems:\n"
```

### TextBlockMigration
Concatenation can be replaced with text block
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/SlowInvocationLogger.java`
#### Snippet
```java
    InvocationStageTrace stageTrace = invocation.getInvocationStageTrace();
    invocation.getTraceIdLogger().warn(LOGGER, ""
            + "slow({} ms) invocation, {}:\n"
            + "  http method: {}\n"
            + "  url        : {}\n"
```

### TextBlockMigration
Concatenation can be replaced with text block
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/SlowInvocationLogger.java`
#### Snippet
```java
    InvocationStageTrace stageTrace = invocation.getInvocationStageTrace();
    invocation.getTraceIdLogger().warn(LOGGER, ""
            + "slow({} ms) invocation, {}:\n"
            + "  http method: {}\n"
            + "  url        : {}\n"
```

### TextBlockMigration
Concatenation can be replaced with text block
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/SlowInvocationLogger.java`
#### Snippet
```java
    InvocationStageTrace stageTrace = invocation.getInvocationStageTrace();
    invocation.getTraceIdLogger().warn(LOGGER, ""
            + "slow({} ms) invocation, {}:\n"
            + "  http method: {}\n"
            + "  url        : {}\n"
```

### TextBlockMigration
Concatenation can be replaced with text block
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
    }
    sb.append(""
        + "edge:\n"
        + " simple:\n"
        + "  status      tps      latency            ")
```

### TextBlockMigration
Concatenation can be replaced with text block
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
  //details
  private static final String PRODUCER_DETAILS_FORMAT = ""
      + "        prepare: %-18s queue       : %-18s filtersReq : %-18s handlersReq: %s\n"
      + "        execute: %-18s handlersResp: %-18s filtersResp: %-18s sendResp   : %s\n";

```

### TextBlockMigration
Concatenation can be replaced with text block
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
    }
    sb.append(""
        + "producer:\n"
        + " simple:\n"
        + "  status      tps      latency            ")
```

### TextBlockMigration
Concatenation can be replaced with text block
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java

  private static final String EDGE_DETAILS_FORMAT = ""
      + "        prepare     : %-18s queue       : %-18s sFiltersReq : %-18s handlersReq : %s\n"
      + "        cFiltersReq : %-18s sendReq     : %-18s getConnect  : %-18s writeBuf    : %s\n"
      + "        waitResp    : %-18s wakeConsumer: %-18s cFiltersResp: %-18s handlersResp: %s\n"
```

### TextBlockMigration
Concatenation can be replaced with text block
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java

  private static final String CONSUMER_DETAILS_FORMAT = ""
      + "        prepare     : %-18s handlersReq : %-18s cFiltersReq: %-18s sendReq     : %s\n"
      + "        getConnect  : %-18s writeBuf    : %-18s waitResp   : %-18s wakeConsumer: %s\n"
      + "        cFiltersResp: %-18s handlersResp: %s\n";
```

### TextBlockMigration
Concatenation can be replaced with text block
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/DefaultLogPublisher.java`
#### Snippet
```java
    }
    sb.append(""
        + "consumer:\n"
        + " simple:\n"
        + "  status      tps      latency            ")
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/AsyncUtils.java`
#### Snippet
```java
  }

  public static <T> CompletableFuture<T> tryCatchSupplier(Supplier<T> supplier) {
    try {
      T value = supplier.get();
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/AsyncUtils.java`
#### Snippet
```java
  }

  public static <T> CompletableFuture<T> tryCatchSupplierFuture(Supplier<CompletableFuture<T>> supplier) {
    try {
      return supplier.get();
```

### BoundedWildcard
Can generalize to `? extends T`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/BeanUtils.java`
#### Snippet
```java
  }

  public static <T extends SPIOrder & SPIEnabled> void addBeans(Class<T> cls, List<T> exists) {
    if (context == null) {
      return;
```

### BoundedWildcard
Can generalize to `? super Path`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/ResourceUtil.java`
#### Snippet
```java
  }

  private static void collectResourcesFromPath(Path path, Predicate<Path> filter, Collection<URI> resources)
      throws IOException {
    try (Stream<Path> dirContentTraversalStream = Files.walk(path)) {
```

### BoundedWildcard
Can generalize to `? super URI`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/ResourceUtil.java`
#### Snippet
```java
  }

  private static void collectResourcesFromPath(Path path, Predicate<Path> filter, Collection<URI> resources)
      throws IOException {
    try (Stream<Path> dirContentTraversalStream = Files.walk(path)) {
```

### BoundedWildcard
Can generalize to `? extends Resource`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/impl/PaaSPropertiesLoaderUtils.java`
#### Snippet
```java
  }

  public static void fillAllProperties(Properties prop, List<Resource> resList) throws IOException {
    for (Resource res : resList) {
      PaaSPropertiesLoaderUtils.fillProperties(prop, res);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/concurrency/SuppressedRunnableWrapper.java`
#### Snippet
```java
  }

  public SuppressedRunnableWrapper(Runnable runnable, Consumer<Throwable> errorHandler) {
    this.target = runnable;
    this.errorHandler = errorHandler;
```

### BoundedWildcard
Can generalize to `? extends Resource`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/PaaSResourceUtils.java`
#### Snippet
```java
   * 此时，还分多个，是不合适的
   */
  public static void sortResources(List<Resource> resList, String suffix) {
    resList.sort((o1, o2) -> {
      try {
```

### BoundedWildcard
Can generalize to `? super String`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/config/AbstractPropertiesLoader.java`
#### Snippet
```java
  }

  private void loadPropertiesFromExtendedClass(Configuration configuration, Map<String, String> propertiesMap) {
    String extendedPropertyClass = readPropertiesExtendedClass(configuration);

```

### BoundedWildcard
Can generalize to `? super String`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/config/AbstractPropertiesLoader.java`
#### Snippet
```java
  }

  private void loadPropertiesFromExtendedClass(Configuration configuration, Map<String, String> propertiesMap) {
    String extendedPropertyClass = readPropertiesExtendedClass(configuration);

```

### BoundedWildcard
Can generalize to `? super String`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/config/AbstractPropertiesLoader.java`
#### Snippet
```java
  protected abstract String readPropertiesExtendedClass(Configuration configuration);

  private void loadPropertiesFromConfigMap(Configuration configuration, Map<String, String> propertiesMap) {
    propertiesMap.putAll(readProperties(configuration));
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/config/AbstractPropertiesLoader.java`
#### Snippet
```java
  protected abstract String readPropertiesExtendedClass(Configuration configuration);

  private void loadPropertiesFromConfigMap(Configuration configuration, Map<String, String> propertiesMap) {
    propertiesMap.putAll(readProperties(configuration));
  }
```

### BoundedWildcard
Can generalize to `? extends MicroserviceInstance`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
  }

  private MergedInstances mergeInstances(List<MicroserviceInstance> pulledInstances,
      Collection<MicroserviceInstance> inUseInstances) {
    MergedInstances mergedInstances = new MergedInstances();
```

### BoundedWildcard
Can generalize to `? extends MicroserviceInstance`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java

  private MergedInstances mergeInstances(List<MicroserviceInstance> pulledInstances,
      Collection<MicroserviceInstance> inUseInstances) {
    MergedInstances mergedInstances = new MergedInstances();
    pulledInstances.stream().forEach(mergedInstances::addInstance);
```

### BoundedWildcard
Can generalize to `? extends MicroserviceVersion`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersionRule.java`
#### Snippet
```java
  }

  private MicroserviceVersionRuleData createDataByOtherRule(Map<String, MicroserviceVersion> allVersions,
      Collection<MicroserviceInstance> allInstances) {
    MicroserviceVersionRuleData data = new MicroserviceVersionRuleData();
```

### BoundedWildcard
Can generalize to `? extends MicroserviceInstance`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersionRule.java`
#### Snippet
```java

  private MicroserviceVersionRuleData createDataByOtherRule(Map<String, MicroserviceVersion> allVersions,
      Collection<MicroserviceInstance> allInstances) {
    MicroserviceVersionRuleData data = new MicroserviceVersionRuleData();

```

### BoundedWildcard
Can generalize to `? extends MicroserviceVersion`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersionRule.java`
#### Snippet
```java
  }

  private MicroserviceVersion findLatest(Map<String, MicroserviceVersion> allVersions,
      Collection<MicroserviceInstance> allInstances) {
    if (allInstances.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends MicroserviceInstance`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersionRule.java`
#### Snippet
```java

  private MicroserviceVersion findLatest(Map<String, MicroserviceVersion> allVersions,
      Collection<MicroserviceInstance> allInstances) {
    if (allInstances.isEmpty()) {
      return allVersions.isEmpty() ? null : allVersions.values().stream()
```

### BoundedWildcard
Can generalize to `? extends AuthHeaderProvider`
in `dynamic-config/config-cc/src/main/java/org/apache/servicecomb/config/ConfigCenterConfigurationSourceImpl.java`
#### Snippet
```java
  }

  private static RequestAuthHeaderProvider getRequestAuthHeaderProvider(List<AuthHeaderProvider> authHeaderProviders) {
    return signRequest -> {
      Map<String, String> headers = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/ModelResolverExt.java`
#### Snippet
```java

  @VisibleForTesting
  protected void setType(JavaType type, Map<String, Object> vendorExtensions) {
    if (SwaggerGeneratorFeature.isLocalExtJavaClassInVendor()) {
      vendorExtensions.put(SwaggerConst.EXT_JAVA_CLASS, type.toCanonical());
```

### BoundedWildcard
Can generalize to `? extends Model`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java
  }

  private static boolean modelNotDuplicate(Swagger swagger, Entry<String, Model> entry) {
    if (null == swagger.getDefinitions()) {
      swagger.addDefinition(entry.getKey(), entry.getValue());
```

### BoundedWildcard
Can generalize to `? extends List`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGeneratorUtils.java`
#### Snippet
```java

  public static List<Annotation> collectParameterAnnotations(Annotation[] parameterAnnotations,
      Map<String, List<Annotation>> methodAnnotationMap, String parameterName) {
    List<Annotation> methodAnnotations = methodAnnotationMap.remove(parameterName);
    if (methodAnnotations == null) {
```

### BoundedWildcard
Can generalize to `? extends Annotation`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGeneratorUtils.java`
#### Snippet
```java
  }

  public static Type collectGenericType(List<Annotation> annotations, Type defaultType) {
    Type genericType = null;
    for (Annotation annotation : annotations) {
```

### BoundedWildcard
Can generalize to `? extends Annotation`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGeneratorUtils.java`
#### Snippet
```java
  }

  public static HttpParameterType collectHttpParameterType(List<Annotation> annotations, Type genericType) {
    // use the last available type
    for (int idx = annotations.size() - 1; idx >= 0; idx--) {
```

### BoundedWildcard
Can generalize to `? extends ParameterGenerator`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/pojo/PojoOperationGenerator.java`
#### Snippet
```java
  }

  private void wrapParametersToBody(List<ParameterGenerator> bodyFields) {
    String simpleRef = MethodUtils.findSwaggerMethodName(method) + "Body";

```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
  }

  private void addSecurityDefinition(Map<String, SecuritySchemeDefinition> definitionMap,
      String key, SecuritySchemeDefinition definition) {
    if (StringUtils.isEmpty(key) || definition == null) {
```

### BoundedWildcard
Can generalize to `? super SecuritySchemeDefinition`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
  }

  private void addSecurityDefinition(Map<String, SecuritySchemeDefinition> definitionMap,
      String key, SecuritySchemeDefinition definition) {
    if (StringUtils.isEmpty(key) || definition == null) {
```

### BoundedWildcard
Can generalize to `? extends Model`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/AnnotationUtils.java`
#### Snippet
```java
  }

  public static void appendDefinition(Swagger swagger, Map<String, Model> newDefinitions) {
    if (newDefinitions.isEmpty()) {
      return;
```

### BoundedWildcard
Can generalize to `? extends ResponseHeaderConfig`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/AnnotationUtils.java`
#### Snippet
```java

  private static Map<String, Property> generateResponseHeader(Swagger swagger,
      List<ResponseHeaderConfig> responseHeaders) {
    Map<String, Property> headers = new HashMap<>();
    for (ResponseHeaderConfig config : responseHeaders) {
```

### BoundedWildcard
Can generalize to `? extends MatchOperator`
in `governance/src/main/java/org/apache/servicecomb/governance/marker/RequestProcessor.java`
#### Snippet
```java
  private ApplicationContext applicationContext;

  public RequestProcessor(Map<String, MatchOperator> operatorMap) {
    this.operatorMap = operatorMap;
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractOperationGenerator.java`
#### Snippet
```java
  }

  private void addMethodAnnotationByParameterName(Map<String, List<Annotation>> methodAnnotations, String name,
                                                  Annotation annotation) {
    if (StringUtils.isEmpty(name)) {
```

### BoundedWildcard
Can generalize to `? super K`
in `governance/src/main/java/org/apache/servicecomb/governance/service/GovernanceCacheImpl.java`
#### Snippet
```java
  private final Cache<K, V> cache;

  public GovernanceCacheImpl(Cache<K, V> cache) {
    this.cache = cache;
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `governance/src/main/java/org/apache/servicecomb/governance/processor/injection/Fault.java`
#### Snippet
```java

public interface Fault {
  static <T> CheckedFunction0<T> decorateCheckedSupplier(Fault fault, CheckedFunction0<T> supplier) {
    return () -> {
      if (fault.injectFault()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java

  private void getProperties(PropertySource<?> propertySource,
      Set<String> allKeys) {
    if (propertySource instanceof CompositePropertySource) {
      // recursively get EnumerablePropertySource
```

### BoundedWildcard
Can generalize to `? extends Filter`
in `core/src/main/java/org/apache/servicecomb/core/filter/FilterChainsManager.java`
#### Snippet
```java

  @Autowired
  public FilterChainsManager addFilters(List<Filter> filters) {
    for (Filter filter : filters) {
      if (filter.isEnabledForInvocationType(InvocationType.CONSUMER)) {
```

### BoundedWildcard
Can generalize to `? extends Filter`
in `core/src/main/java/org/apache/servicecomb/core/filter/FilterNode.java`
#### Snippet
```java
  }

  public static FilterNode buildChain(List<Filter> filters) {
    List<FilterNode> filterNodes = filters.stream()
        .map(FilterNode::new).toList();
```

### BoundedWildcard
Can generalize to `? super T`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/AbstractRouterDistributor.java`
#### Snippet
```java

  @Override
  public void init(Function<T, E> getIns,
      Function<E, String> getVersion,
      Function<E, String> getServerName,
```

### BoundedWildcard
Can generalize to `? extends E`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/AbstractRouterDistributor.java`
#### Snippet
```java

  @Override
  public void init(Function<T, E> getIns,
      Function<E, String> getVersion,
      Function<E, String> getServerName,
```

### BoundedWildcard
Can generalize to `? super E`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/AbstractRouterDistributor.java`
#### Snippet
```java
  @Override
  public void init(Function<T, E> getIns,
      Function<E, String> getVersion,
      Function<E, String> getServerName,
      Function<E, Map<String, String>> getProperties) {
```

### BoundedWildcard
Can generalize to `? super E`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/AbstractRouterDistributor.java`
#### Snippet
```java
  public void init(Function<T, E> getIns,
      Function<E, String> getVersion,
      Function<E, String> getServerName,
      Function<E, Map<String, String>> getProperties) {
    this.getIns = getIns;
```

### BoundedWildcard
Can generalize to `? super E`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/AbstractRouterDistributor.java`
#### Snippet
```java
      Function<E, String> getVersion,
      Function<E, String> getServerName,
      Function<E, Map<String, String>> getProperties) {
    this.getIns = getIns;
    this.getVersion = getVersion;
```

### BoundedWildcard
Can generalize to `? extends Map`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/AbstractRouterDistributor.java`
#### Snippet
```java
      Function<E, String> getVersion,
      Function<E, String> getServerName,
      Function<E, Map<String, String>> getProperties) {
    this.getIns = getIns;
    this.getVersion = getVersion;
```

### BoundedWildcard
Can generalize to `? extends T`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/AbstractRouterDistributor.java`
#### Snippet
```java
   */
  private Map<TagItem, List<T>> getDistributList(String serviceName,
      List<T> list,
      PolicyRuleItem invokeRule) {
    String latestV = routerRuleCache.getServiceInfoCacheMap().get(serviceName).getLatestVersionTag()
```

### BoundedWildcard
Can generalize to `? extends T`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/AbstractRouterDistributor.java`
#### Snippet
```java
  }

  public List<T> getLatestVersionList(List<T> list, String targetServiceName) {
    String latestV = routerRuleCache.getServiceInfoCacheMap().get(targetServiceName)
        .getLatestVersionTag().getVersion();
```

### BoundedWildcard
Can generalize to `? extends T`
in `governance/src/main/java/org/apache/servicecomb/router/distribute/AbstractRouterDistributor.java`
#### Snippet
```java


  public void initLatestVersion(String serviceName, List<T> list) {
    String latestVersion = null;
    for (T server : list) {
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
   */
  private void getProperties(ConfigurableEnvironment environment, PropertySource<?> propertySource,
      Map<String, Object> configFromSpringBoot) {
    if (propertySource instanceof CompositePropertySource) {
      // recursively get EnumerablePropertySource
```

### BoundedWildcard
Can generalize to `? extends BootListener`
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
  }

  public void addBootListeners(Collection<BootListener> bootListeners) {
    this.bootListeners.addAll(bootListeners);
  }
```

### BoundedWildcard
Can generalize to `? extends ProducerMeta`
in `core/src/main/java/org/apache/servicecomb/core/provider/producer/ProducerProviderManager.java`
#### Snippet
```java
  }

  private void registerProducerMetas(List<ProducerMeta> producerMetas) {
    for (ProducerMeta producerMeta : producerMetas) {
      registerSchema(producerMeta.getSchemaId(), producerMeta.getSchemaInterface(), producerMeta.getInstance());
```

### BoundedWildcard
Can generalize to `? extends Endpoint`
in `core/src/main/java/org/apache/servicecomb/core/filter/impl/SimpleLoadBalanceFilter.java`
#### Snippet
```java
    }

    private Endpoint chooseEndpoint(Invocation invocation, String key, List<Endpoint> endpoints) {
      AtomicInteger index = indexMap.computeIfAbsent(key, name -> {
        LOGGER.info("Create loadBalancer for {}.", name);
```

### BoundedWildcard
Can generalize to `? extends MicroserviceInstance`
in `core/src/main/java/org/apache/servicecomb/core/registry/discovery/OperationInstancesDiscoveryFilter.java`
#### Snippet
```java

  protected List<MicroserviceVersion> sortedMicroserviceVersion(Invocation invocation,
      Map<String, MicroserviceInstance> instances) {
    OperationMeta latestOperationMeta = invocation.getOperationMeta();
    MicroserviceMeta latestMicroserviceMeta = latestOperationMeta.getSchemaMeta().getMicroserviceMeta();
```

### BoundedWildcard
Can generalize to `? extends Transport`
in `core/src/main/java/org/apache/servicecomb/core/transport/TransportManager.java`
#### Snippet
```java
  }

  protected void checkTransportGroup(List<Transport> group) {
    // order value must be different, otherwise, maybe will choose a random transport
    Map<Integer, Transport> orderMap = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Transport`
in `core/src/main/java/org/apache/servicecomb/core/transport/TransportManager.java`
#### Snippet
```java
  }

  public void addTransportsBeforeInit(List<Transport> transports) {
    this.transports.addAll(transports);
  }
```

### BoundedWildcard
Can generalize to `? extends Transport`
in `core/src/main/java/org/apache/servicecomb/core/transport/TransportManager.java`
#### Snippet
```java
  }

  protected Transport chooseOneTransport(List<Transport> group) {
    group.sort(Comparator.comparingInt(Transport::getOrder));

```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/org/apache/servicecomb/core/governance/ServiceCombConfigurationEventAdapter.java`
#### Snippet
```java
  }

  private void addMap(Set<String> keys, Map<String, Object> changed) {
    if (changed != null) {
      keys.addAll(changed.keySet());
```

### BoundedWildcard
Can generalize to `? extends MicroserviceInstance`
in `service-registry/registry-schema-discovery/src/main/java/org/apache/servicecomb/schemadiscovery/SchemaDiscovery.java`
#### Snippet
```java

  @Override
  public String getSchema(String microserviceId, Collection<MicroserviceInstance> instances, String schemaId) {
    if (instances == null || instances.isEmpty()) {
      return null;
```

### BoundedWildcard
Can generalize to `? super T`
in `foundations/foundation-spi/src/main/java/org/apache/servicecomb/foundation/common/utils/SPIServiceUtils.java`
#### Snippet
```java
  }

  public static <T> Collection<T> getPriorityHighestServices(Function<T, String> keyFunc, Class<T> serviceType) {
    List<T> services = getOrLoadSortedService(serviceType);
    if (services.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/StandardHttpServletRequestEx.java`
#### Snippet
```java
  }

  private void mergeParameterMaptoListMap(Map<String, List<String>> listMap) {
    for (Entry<String, String[]> entry : super.getParameterMap().entrySet()) {
      List<String> values = listMap.computeIfAbsent(entry.getKey(), k -> new ArrayList<>());
```

### BoundedWildcard
Can generalize to `? extends CLIENT_POOL`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/client/ClientPoolManager.java`
#### Snippet
```java
  private final AtomicInteger reactiveNextIndex = new AtomicInteger();

  public ClientPoolManager(Vertx vertx, ClientPoolFactory<CLIENT_POOL> factory) {
    this.vertx = vertx;
    this.factory = factory;
```

### BoundedWildcard
Can generalize to `? extends TcpData`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/client/tcp/TcpClientConnection.java`
#### Snippet
```java
  }

  private void onLoginResponse(AsyncResult<TcpData> asyncResult) {
    if (asyncResult.failed()) {
      LOGGER.error("login failed, address {}", socketAddress.toString(), asyncResult.cause());
```

### BoundedWildcard
Can generalize to `? super InetSocketAddress`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/server/TcpServer.java`
#### Snippet
```java
  }

  public void init(Vertx vertx, String sslKey, AsyncResultCallback<InetSocketAddress> callback) {
    NetServer netServer;
    if (endpointObject.isSslEnabled()) {
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/PumpCommon.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  public CompletableFuture<Void> pump(Context context, ReadStream<Buffer> readStream, WriteStream<Buffer> writeStream,
      Handler<Throwable> throwableHandler) {
    CompletableFuture<Void> readFuture = new CompletableFuture<>();

```

### BoundedWildcard
Can generalize to `? super Buffer`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
  }

  public <T> CompletableFuture<T> saveAs(Function<Buffer, T> converter) {
    CompletableFuture<T> future = new CompletableFuture<>();
    Buffer buffer = Buffer.buffer();
```

### BoundedWildcard
Can generalize to `? extends T`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
  }

  public <T> CompletableFuture<T> saveAs(Function<Buffer, T> converter) {
    CompletableFuture<T> future = new CompletableFuture<>();
    Buffer buffer = Buffer.buffer();
```

### BoundedWildcard
Can generalize to `? extends AsyncFile`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
  }

  protected void onFileOpened(File file, AsyncResult<AsyncFile> ar, CompletableFuture<File> future) {
    if (ar.failed()) {
      future.completeExceptionally(ar.cause());
```

### BoundedWildcard
Can generalize to `? super File`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
  }

  protected void onFileOpened(File file, AsyncResult<AsyncFile> ar, CompletableFuture<File> future) {
    if (ar.failed()) {
      future.completeExceptionally(ar.cause());
```

### BoundedWildcard
Can generalize to `? extends ReadResult`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/InputStreamToReadStream.java`
#### Snippet
```java
  }

  private synchronized void afterReadInEventloop(AsyncResult<ReadResult> ar) {
    if (ar.failed()) {
      handleException(ar.cause());
```

### BoundedWildcard
Can generalize to `? super ReadResult`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/InputStreamToReadStream.java`
#### Snippet
```java
  }

  private synchronized void readInWorker(Promise<ReadResult> future) {
    try {
      ReadResult readResult = new ReadResult();
```

### BoundedWildcard
Can generalize to `? extends AuthHeaderProvider`
in `dynamic-config/config-kie/src/main/java/org/apache/servicecomb/config/kie/KieConfigurationSourceImpl.java`
#### Snippet
```java
  }

  private static RequestAuthHeaderProvider getRequestAuthHeaderProvider(List<AuthHeaderProvider> authHeaderProviders) {
    return signRequest -> {
      Map<String, String> headers = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends MicroserviceInstance`
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterDiscovery.java`
#### Snippet
```java
  }

  private static String instanceToString(List<MicroserviceInstance> instances) {
    if (instances == null) {
      return "";
```

### BoundedWildcard
Can generalize to `? extends MicroserviceInstance`
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterDiscovery.java`
#### Snippet
```java
  }

  private void setMicroserviceInfo(List<MicroserviceInstance> instances) {
    instances.forEach(instance -> {
      Microservice microservice = microserviceCache
```

### BoundedWildcard
Can generalize to `? extends SchemaInfo`
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterRegistration.java`
#### Snippet
```java
  }

  public ServiceCenterRegistration setSchemaInfos(List<SchemaInfo> schemaInfos) {
    this.schemaInfos = schemaInfos;
    return this;
```

### BoundedWildcard
Can generalize to `? extends HttpClientFilter`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/filter/HttpClientFilterBeforeSendRequestExecutor.java`
#### Snippet
```java
  private final CompletableFuture<Void> future = new CompletableFuture<>();

  public HttpClientFilterBeforeSendRequestExecutor(List<HttpClientFilter> httpClientFilters, Invocation invocation,
      HttpServletRequestEx requestEx) {
    this.httpClientFilters = httpClientFilters;
```

### BoundedWildcard
Can generalize to `? extends HttpServerFilter`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/filter/HttpServerFilterBeforeSendResponseExecutor.java`
#### Snippet
```java
  private final CompletableFuture<Void> future = new CompletableFuture<>();

  public HttpServerFilterBeforeSendResponseExecutor(List<HttpServerFilter> httpServerFilters, Invocation invocation,
      HttpServletResponseEx responseEx) {
    this.httpServerFilters = httpServerFilters;
```

### BoundedWildcard
Can generalize to `? extends ProduceProcessor`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/produce/ProduceProcessorManager.java`
#### Snippet
```java

  private static ProduceProcessor cloneNewProduceProcessor(Class<?> serialViewClass,
      Map<String, ProduceProcessor> produceViewMap) {
    ProduceProcessor newInstance;
    try {
```

### BoundedWildcard
Can generalize to `? extends RestOperationMeta`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/ServicePathManager.java`
#### Snippet
```java
  }

  private void addProducerPaths(String urlPrefix, Collection<RestOperationMeta> restOperationMetas) {
    for (RestOperationMeta swaggerRestOperation : restOperationMetas) {
      RestOperationMeta producerRestOperation = swaggerRestOperation;
```

### BoundedWildcard
Can generalize to `? extends OperationGroup`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/OperationLocator.java`
#### Snippet
```java

  protected RestOperationMeta locateStaticPathOperation(String path, String httpMethod,
      Map<String, OperationGroup> staticPathOperations) {
    OperationGroup group = staticPathOperations.get(path);
    if (group == null) {
```

### BoundedWildcard
Can generalize to `? extends RestOperationMeta`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/OperationLocator.java`
#### Snippet
```java
  }

  protected RestOperationMeta locateDynamicPathOperation(String path, Collection<RestOperationMeta> resourceList,
      String httpMethod) {
    for (RestOperationMeta resource : resourceList) {
```

### BoundedWildcard
Can generalize to `? extends RestOperationMeta`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/MicroservicePaths.java`
#### Snippet
```java
  }

  protected void printPath(Collection<RestOperationMeta> operations) {
    for (RestOperationMeta operation : operations) {
      SwaggerProducerOperation producerOperation = operation.getOperationMeta().getSwaggerProducerOperation();
```

### BoundedWildcard
Can generalize to `? extends Entry`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/RestClientRequestImpl.java`
#### Snippet
```java
  }

  private void attachFile(String boundary, Iterator<Entry<String, Part>> uploadsIterator) {
    if (!uploadsIterator.hasNext()) {
      writeBuffer(boundaryEndInfo(boundary)).onSuccess(v -> request.end()).onFailure(e -> asyncResp.consumerFail(e));
```

### BoundedWildcard
Can generalize to `? super String`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
  // 则addressId取值为456
  // 即后面的总是覆盖前面的
  public String match(String path, Map<String, String> varValues) {
    Matcher matcher = pattern.matcher(path);
    if (!matcher.matches()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
  // 则addressId取值为456
  // 即后面的总是覆盖前面的
  public String match(String path, Map<String, String> varValues) {
    Matcher matcher = pattern.matcher(path);
    if (!matcher.matches()) {
```

### BoundedWildcard
Can generalize to `? extends BasePath`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/ServiceCenterRegistration.java`
#### Snippet
```java

  @Override
  public void addBasePath(Collection<BasePath> basePaths) {
    RegistryUtils.executeOnEachServiceRegistry(sr -> sr.getMicroservice().getPaths().addAll(basePaths));
  }
```

### BoundedWildcard
Can generalize to `? extends RestParam`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/URLPathBuilder.java`
#### Snippet
```java
  }

  private void initQueryWriterList(Map<String, RestParam> paramMap) {
    for (RestParam param : paramMap.values()) {
      if (!QueryProcessorCreator.PARAMTYPE.equals(param.getParamProcessor().getProcessorType())) {
```

### BoundedWildcard
Can generalize to `? extends RestParam`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/URLPathBuilder.java`
#### Snippet
```java
  }

  private void initPathWriterList(String rawPath, Map<String, RestParam> paramMap) {
    // 去掉末尾'/'
    if (rawPath.endsWith(SLASH)) {
```

### BoundedWildcard
Can generalize to `? super ServiceRegistry`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/RegistryUtils.java`
#### Snippet
```java
  }

  public static void executeOnEachServiceRegistry(Consumer<ServiceRegistry> action) {
    if (null != getServiceRegistry()) {
      action.accept(getServiceRegistry());
```

### BoundedWildcard
Can generalize to `? super ServiceRegistry`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/RegistryUtils.java`
#### Snippet
```java
  }

  public static <T> T getResultFromFirstValidServiceRegistry(Function<ServiceRegistry, T> action) {
    Holder<T> resultHolder = new Holder<>();
    executeOnEachServiceRegistry(sr -> {
```

### BoundedWildcard
Can generalize to `? extends ServiceCenterClient`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/TokenCacheManager.java`
#### Snippet
```java
  }

  public void setServiceCenterClients(Map<String, ServiceCenterClient> serviceCenterClients) {
    this.serviceCenterClients = serviceCenterClients;
  }
```

### BoundedWildcard
Can generalize to `? extends List`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/MicroserviceRegisterTask.java`
#### Snippet
```java
  }

  private Map<String, GetSchemaResponse> convertScSchemaMap(Holder<List<GetSchemaResponse>> scSchemaHolder) {
    Map<String, GetSchemaResponse> scSchemaMap = new HashMap<>();
    List<GetSchemaResponse> scSchemaList = scSchemaHolder.getValue();
```

### BoundedWildcard
Can generalize to `? extends GetSchemaResponse`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/MicroserviceRegisterTask.java`
#### Snippet
```java
   * or not exist in sc.
   */
  private boolean registerSchema(Map<String, GetSchemaResponse> scSchemaMap,
      Entry<String, String> localSchemaEntry) {
    GetSchemaResponse scSchema = scSchemaMap.get(localSchemaEntry.getKey());
```

### BoundedWildcard
Can generalize to `? super ServiceRegistry`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/config/ServiceRegistryConfig.java`
#### Snippet
```java

  public ServiceRegistryConfig setServiceRegistryClientConstructor(
      Function<ServiceRegistry, ServiceRegistryClient> serviceRegistryClientConstructor) {
    this.serviceRegistryClientConstructor = serviceRegistryClientConstructor;
    return this;
```

### BoundedWildcard
Can generalize to `? extends ServiceRegistryClient`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/config/ServiceRegistryConfig.java`
#### Snippet
```java

  public ServiceRegistryConfig setServiceRegistryClientConstructor(
      Function<ServiceRegistry, ServiceRegistryClient> serviceRegistryClientConstructor) {
    this.serviceRegistryClientConstructor = serviceRegistryClientConstructor;
    return this;
```

### BoundedWildcard
Can generalize to `? extends ServiceRegistry`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/AggregateMicroserviceCache.java`
#### Snippet
```java
  private final Object refreshLock = new Object();

  public AggregateMicroserviceCache(MicroserviceCacheKey key, Collection<ServiceRegistry> serviceRegistries) {
    this.key = key;
    this.serviceRegistries = serviceRegistries;
```

### BoundedWildcard
Can generalize to `? extends CacheEndpoint`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/refresh/ClassificationAddress.java`
#### Snippet
```java
  }

  private DataCenterInfo findRegion(List<CacheEndpoint> CacheEndpoints) {
    for (CacheEndpoint cacheEndpoint : CacheEndpoints) {
      boolean isMatch = cacheEndpoint.getEndpoint().contains(this.defaultIpPort.get(0).getHostOrIp());
```

### BoundedWildcard
Can generalize to `? super List`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/RefreshableServiceRegistryCache.java`
#### Snippet
```java
  @Override
  public ServiceRegistryCache setCacheRefreshedWatcher(
      Consumer<List<MicroserviceCache>> cacheRefreshedWatcher) {
    this.cacheRefreshedWatcher = cacheRefreshedWatcher;
    return this;
```

### BoundedWildcard
Can generalize to `? super Void`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/WebsocketClientUtil.java`
#### Snippet
```java
  }

  public void open(IpPort ipPort, String url, Handler<Void> onOpen, Handler<Void> onClose,
      Handler<Buffer> onMessage, Handler<Throwable> onException,
      Handler<Throwable> onConnectFailed) {
```

### BoundedWildcard
Can generalize to `? super Buffer`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/WebsocketClientUtil.java`
#### Snippet
```java

  public void open(IpPort ipPort, String url, Handler<Void> onOpen, Handler<Void> onClose,
      Handler<Buffer> onMessage, Handler<Throwable> onException,
      Handler<Throwable> onConnectFailed) {
    HttpClientWithContext vertxHttpClient = websocketClientPool.getClient();
```

### BoundedWildcard
Can generalize to `? super Type`
in `swagger/swagger-generator/generator-spring-data/src/main/java/org/apache/servicecomb/swagger/generator/springdata/SpringDataConcreteTypeRegister.java`
#### Snippet
```java
public class SpringDataConcreteTypeRegister implements ConcreteTypeRegister {
  @Override
  public void register(Set<Type> types) {
    types.add(Page.class);
    types.add(Pageable.class);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/WebsocketClientUtil.java`
#### Snippet
```java

  public void open(IpPort ipPort, String url, Handler<Void> onOpen, Handler<Void> onClose,
      Handler<Buffer> onMessage, Handler<Throwable> onException,
      Handler<Throwable> onConnectFailed) {
    HttpClientWithContext vertxHttpClient = websocketClientPool.getClient();
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/WebsocketClientUtil.java`
#### Snippet
```java
  public void open(IpPort ipPort, String url, Handler<Void> onOpen, Handler<Void> onClose,
      Handler<Buffer> onMessage, Handler<Throwable> onException,
      Handler<Throwable> onConnectFailed) {
    HttpClientWithContext vertxHttpClient = websocketClientPool.getClient();
    vertxHttpClient.runOnContext(client -> {
```

### BoundedWildcard
Can generalize to `? super List`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/AggregateServiceRegistryCache.java`
#### Snippet
```java

  @Override
  public ServiceRegistryCache setCacheRefreshedWatcher(Consumer<List<MicroserviceCache>> cacheRefreshedWatcher) {
    this.cacheRefreshedWatcher = cacheRefreshedWatcher;
    return this;
```

### BoundedWildcard
Can generalize to `? super String`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigMapping.java`
#### Snippet
```java
  }

  private static void putConfigsToRetMap(Map<String, Object> retMap, Map.Entry<String, Object> entry,
      Object configValue) {
    if (configValue != null) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/DynamicPropertiesImpl.java`
#### Snippet
```java

  @Override
  public boolean getBooleanProperty(String propertyName, Consumer<Boolean> consumer, boolean defaultValue) {
    DynamicBooleanProperty prop = propertyFactoryInstance().getBooleanProperty(propertyName, defaultValue);
    prop.addCallback(() -> consumer.accept(prop.get()));
```

### BoundedWildcard
Can generalize to `? super String`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/DynamicPropertiesImpl.java`
#### Snippet
```java

  @Override
  public String getStringProperty(String propertyName, Consumer<String> consumer, String defaultValue) {
    DynamicStringProperty prop = propertyFactoryInstance().getStringProperty(propertyName, defaultValue);
    prop.addCallback(() -> consumer.accept(prop.get()));
```

### BoundedWildcard
Can generalize to `? super RestResponse`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RestClientUtil.java`
#### Snippet
```java
  }

  public void httpDo(long timeout, RequestContext requestContext, Handler<RestResponse> responseHandler) {
    HttpClientWithContext vertxHttpClient = httpClientPool.getClient();
    vertxHttpClient.runOnContext(httpClient -> {
```

### BoundedWildcard
Can generalize to `? extends T`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/PriorityProperty.java`
#### Snippet
```java
  private T finalValue;

  public PriorityProperty(PriorityPropertyType<T> propertyType) {
    this.propertyType = propertyType;
    this.joinedPriorityKeys = Arrays.toString(propertyType.getPriorityKeys());
```

### BoundedWildcard
Can generalize to `? extends ServiceCombServer`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/RoundRobinRuleExt.java`
#### Snippet
```java

  @Override
  public ServiceCombServer choose(List<ServiceCombServer> servers, Invocation invocation) {
    if (servers.isEmpty()) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends ServiceCombServer`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/RandomRuleExt.java`
#### Snippet
```java
public class RandomRuleExt implements RuleExt {
  @Override
  public ServiceCombServer choose(List<ServiceCombServer> servers, Invocation invocation) {
    if (servers.isEmpty()) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends ExtensionsFactory`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/ExtensionsManager.java`
#### Snippet
```java
  private final List<ExtensionsFactory> extensionsFactories;

  public ExtensionsManager(List<ExtensionsFactory> extensionsFactories) {
    this.extensionsFactories = extensionsFactories;
  }
```

### BoundedWildcard
Can generalize to `? extends ServiceCombServer`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/WeightedResponseTimeRuleExt.java`
#### Snippet
```java
  }

  private List<Double> doCalculateTotalWeights(List<ServiceCombServer> servers) {
    List<Double> stats = new ArrayList<>(servers.size() + 1);
    double totalWeights = 0;
```

### BoundedWildcard
Can generalize to `? extends ProducerResponseMapper`
in `swagger/swagger-invocation/invocation-springmvc/src/main/java/org/apache/servicecomb/swagger/invocation/springmvc/response/SpringmvcProducerResponseMapperFactory.java`
#### Snippet
```java

  @Override
  public ProducerResponseMapper createResponseMapper(ResponseMapperFactorys<ProducerResponseMapper> factorys,
      Type producerType) {
    Type realProducerType = ((ParameterizedType) producerType).getActualTypeArguments()[0];
```

### BoundedWildcard
Can generalize to `? extends ServiceCombServer`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/filterext/ZoneAwareDiscoveryFilter.java`
#### Snippet
```java

  @Override
  public List<ServiceCombServer> getFilteredListOfServers(List<ServiceCombServer> servers,
      Invocation invocation) {
    MicroserviceInstance myself = RegistrationManager.INSTANCE.getMicroserviceInstance();
```

### BoundedWildcard
Can generalize to `? extends ConsumerResponseMapper`
in `swagger/swagger-invocation/invocation-springmvc/src/main/java/org/apache/servicecomb/swagger/invocation/springmvc/response/SpringmvcConsumerResponseMapperFactory.java`
#### Snippet
```java

  @Override
  public ConsumerResponseMapper createResponseMapper(ResponseMapperFactorys<ConsumerResponseMapper> factorys,
      Type consumerType) {
    Type realConsumerType = ((ParameterizedType) consumerType).getActualTypeArguments()[0];
```

### BoundedWildcard
Can generalize to `? extends MonitorDataProvider`
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/DataFactory.java`
#### Snippet
```java
  }

  public void setMonitorDataProviders(List<MonitorDataProvider> dataProviders) {
    this.dataProviders = dataProviders;
  }
```

### BoundedWildcard
Can generalize to `? extends AuthHeaderProvider`
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/DefaultMonitorDataPublisher.java`
#### Snippet
```java
  }

  private static RequestAuthHeaderProvider getRequestAuthHeaderProvider(List<AuthHeaderProvider> authHeaderProviders) {
    return signRequest -> {
      Map<String, String> headers = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends BasePath`
in `service-registry/registry-lightweight/src/main/java/org/apache/servicecomb/registry/lightweight/AbstractLightweightRegistration.java`
#### Snippet
```java

  @Override
  public void addBasePath(Collection<BasePath> basePaths) {
    self.getMicroservice().getPaths().addAll(basePaths);
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MetricsMonitorDataProvider.java`
#### Snippet
```java
  }

  private void extractEdgeInfo(DefaultPublishModel model, Map<String, InterfaceInfo> combinedResults) {
    OperationPerfGroups edgePerf = model.getEdge().getOperationPerfGroups();
    if (edgePerf == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MetricsMonitorDataProvider.java`
#### Snippet
```java
  }

  private void extractProviderInfo(DefaultPublishModel model, Map<String, InterfaceInfo> combinedResults) {
    OperationPerfGroups producerPerf = model.getProducer().getOperationPerfGroups();
    if (producerPerf == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MetricsMonitorDataProvider.java`
#### Snippet
```java
  }

  private void extractConsumerInfo(DefaultPublishModel model, Map<String, InterfaceInfo> combinedResults) {
    OperationPerfGroups consumerPerf = model.getConsumer().getOperationPerfGroups();
    if (consumerPerf == null) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObjectFactory.java`
#### Snippet
```java
  }

  public <T> ConfigObject<T> create(Class<T> cls, Map<String, Object> parameters) {
    try {
      return create(cls.getDeclaredConstructor().newInstance(), parameters);
```

### BoundedWildcard
Can generalize to `? super Measurement`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/meter/LatencyDistributionMeter.java`
#### Snippet
```java

  @Override
  public void calcMeasurements(List<Measurement> measurements, long msNow, long secondInterval) {
    latencyScopeMeters.forEach(latencyScopeMeter -> measurements.add(latencyScopeMeter.createMeasurement(msNow)));
  }
```

### BoundedWildcard
Can generalize to `? super Measurement`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/meter/SimpleTimer.java`
#### Snippet
```java

  @Override
  public void calcMeasurements(List<Measurement> measurements, long msNow, long secondInterval) {
    long currentCount = count.longValue();
    long currentTotalTime = totalTime.longValue();
```

### BoundedWildcard
Can generalize to `? extends Tag`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/publish/spectator/DefaultTagFinder.java`
#### Snippet
```java

  @Override
  public Tag find(Iterable<Tag> tags) {
    for (Tag tag : tags) {
      if (tag.key().equals(tagKey)) {
```

### BoundedWildcard
Can generalize to `? extends Meter`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/publish/spectator/MeasurementTree.java`
#### Snippet
```java
  //   value: id tag keys
  // only id name exists in groupConfig will accept, others will be ignored
  public void from(Iterator<Meter> meters, MeasurementGroupConfig groupConfig) {
    meters.forEachRemaining(meter -> {
      Iterable<Measurement> measurements = meter.measure();
```

### BoundedWildcard
Can generalize to `? super Promise`
in `foundations/foundation-test-scaffolding/src/main/java/io/vertx/core/impl/SyncContext.java`
#### Snippet
```java
  }

  private static <T> Future<T> syncExecuteBlocking(Handler<Promise<T>> blockingCodeHandler) {
    Promise<T> res = Promise.promise();

```

### BoundedWildcard
Can generalize to `? super Promise`
in `foundations/foundation-test-scaffolding/src/main/java/io/vertx/core/impl/SyncContext.java`
#### Snippet
```java
  }

  public static <T> void syncExecuteBlocking(Handler<Promise<T>> blockingCodeHandler,
      Handler<AsyncResult<T>> asyncResultHandler) {
    Promise<T> res = Promise.promise();
```

### BoundedWildcard
Can generalize to `? super String`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/inject/PlaceholderResolver.java`
#### Snippet
```java
  // resolve placeholder and execute cartesian product
  @SuppressWarnings("unchecked")
  private void resolve(Row row, List<String> resolvedRows) {
    List<StringBuilder> stringBuilders = new ArrayList<>();
    for (int idx = 0; idx < row.cartesianProductCount; idx++) {
```

### BoundedWildcard
Can generalize to `? super Row`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/inject/PlaceholderResolver.java`
#### Snippet
```java

  private void replaceToRows(String str, Map<String, Object> parameters, List<String> remainRows,
      List<Row> finalRows) {
    Row row = parseToRow(str, parameters);
    if (row.varCount == 0 && row.cartesianProductCount == 1) {
```

### BoundedWildcard
Can generalize to `? super ResponseWrapper`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
  // temporary copy from syncHandler
  // we will use swagger invocation to replace restClientUtil later.
  private Handler<RestResponse> syncHandlerEx(CountDownLatch countDownLatch, Holder<ResponseWrapper> holder) {
    return restResponse -> {
      RequestContext requestContext = restResponse.getRequestContext();
```

### BoundedWildcard
Can generalize to `? super Void`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java

  public void watch(String selfMicroserviceId, AsyncResultCallback<MicroserviceInstanceChangedEvent> callback,
      AsyncResultCallback<Void> onOpen, AsyncResultCallback<Void> onClose) {
    Boolean alreadyWatch = watchServices.get(selfMicroserviceId);
    if (alreadyWatch == null) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
  @VisibleForTesting
  @SuppressWarnings("unchecked")
  public <T> Handler<RestResponse> syncHandler(CountDownLatch countDownLatch, Class<T> cls,
                                                Holder<T> holder) {
    return restResponse -> {
```

### BoundedWildcard
Can generalize to `? super T`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  public <T> Handler<RestResponse> syncHandler(CountDownLatch countDownLatch, Class<T> cls,
                                                Holder<T> holder) {
    return restResponse -> {
      RequestContext requestContext = restResponse.getRequestContext();
```

### BoundedWildcard
Can generalize to `? extends Parameter`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java
  }

  private void createWrapArgs(String wrapName, List<Parameter> parameters) {
    Map<String, Object> properties = new LinkedHashMap<>();
    for (Parameter parameter : parameters) {
```

### BoundedWildcard
Can generalize to `? super PRIMITIVE_ARRAY`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/RepeatedPrimitiveWriteSchemas.java`
#### Snippet
```java

    public PrimitiveArraySchema(Field protoField, PropertyDescriptor propertyDescriptor,
        AbstractPrimitiveWriters<PRIMITIVE_ARRAY, PRIMITIVE_WRAPPER> writers) {
      super(protoField, propertyDescriptor, writers);
      this.getter = propertyDescriptor.getGetter();
```

### BoundedWildcard
Can generalize to `? extends Number`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumNotPackedWriteSchemas.java`
#### Snippet
```java
    }

    private void writeIntCollection(OutputEx output, Collection<Number> collection) throws IOException {
      for (Number element : collection) {
        if (element == null) {
```

### BoundedWildcard
Can generalize to `? extends Enum`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumNotPackedWriteSchemas.java`
#### Snippet
```java
    }

    private void writeEnumCollection(OutputEx output, Collection<Enum<?>> collection) throws IOException {
      for (Enum<?> element : collection) {
        if (element == null) {
```

### BoundedWildcard
Can generalize to `? extends Enum`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumPackedWriteSchemas.java`
#### Snippet
```java
    }

    private void writeEnumCollection(OutputEx output, Collection<Enum<?>> collection) throws IOException {
      for (Enum<?> element : collection) {
        if (element == null) {
```

### BoundedWildcard
Can generalize to `? extends Number`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumPackedWriteSchemas.java`
#### Snippet
```java
    }

    private void writeIntCollection(OutputEx output, Collection<Number> collection) throws IOException {
      for (Number element : collection) {
        if (element == null) {
```

### BoundedWildcard
Can generalize to `? extends BasePath`
in `service-registry/registry-local/src/main/java/org/apache/servicecomb/localregistry/LocalRegistration.java`
#### Snippet
```java

  @Override
  public void addBasePath(Collection<BasePath> basePaths) {
    localRegistrationStore.getSelfMicroservice().getPaths().addAll(basePaths);
  }
```

### BoundedWildcard
Can generalize to `? extends Map`
in `service-registry/registry-local/src/main/java/org/apache/servicecomb/localregistry/RegistryBean.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static List<Instance> validInstances(List<Map<String, Object>> instancesConfig) {
    if (instancesConfig == null) {
      return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends ServiceCombServer`
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/DarklaunchServerListFilter.java`
#### Snippet
```java
  }

  private void divideServerGroup(List<ServiceCombServer> serverList, DarklaunchRule rule,
      List<ServiceCombServer> defaultGroup) {
    for (ServiceCombServer server : serverList) {
```

### BoundedWildcard
Can generalize to `? super ServiceCombServer`
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/DarklaunchServerListFilter.java`
#### Snippet
```java

  private void divideServerGroup(List<ServiceCombServer> serverList, DarklaunchRule rule,
      List<ServiceCombServer> defaultGroup) {
    for (ServiceCombServer server : serverList) {
      boolean hasGroup = false;
```

### BoundedWildcard
Can generalize to `? extends RegistryBean`
in `service-registry/registry-local/src/main/java/org/apache/servicecomb/localregistry/LocalRegistryStore.java`
#### Snippet
```java
  }

  private void initRegistryFromBeans(List<RegistryBean> beans) {
    beans.forEach((bean -> {
      Microservice microservice = new Microservice();
```

### BoundedWildcard
Can generalize to `? extends VertxRestAccessLogItemMeta`
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/parser/impl/VertxRestAccessLogPatternParser.java`
#### Snippet
```java
   * </ol>
   */
  public static void sortAccessLogItemMeta(List<VertxRestAccessLogItemMeta> accessLogItemMetaList) {
    accessLogItemMetaList.sort(accessLogItemMetaComparator);
  }
```

### BoundedWildcard
Can generalize to `? extends AccessLogItemLocation`
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/parser/impl/VertxRestAccessLogPatternParser.java`
#### Snippet
```java

  private List<AccessLogItem<RoutingContext>> convertToItemList(String rawPattern,
      List<AccessLogItemLocation> locationList) {
    List<AccessLogItem<RoutingContext>> itemList = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? super Measurement`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/os/CpuMeter.java`
#### Snippet
```java
  }

  public void calcMeasurements(List<Measurement> measurements, long msNow) {
    update();
    measurements.add(new Measurement(allCpuUsage.getId(), msNow, allCpuUsage.getUsage()));
```

### BoundedWildcard
Can generalize to `? super Measurement`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/os/net/InterfaceUsage.java`
#### Snippet
```java
  }

  public void calcMeasurements(List<Measurement> measurements, long msNow) {
    netStats.forEach(netStat -> measurements.add(new Measurement(netStat.getId(), msNow, netStat.getRate())));
  }
```

### BoundedWildcard
Can generalize to `? super Measurement`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/vertx/ServerEndpointMeter.java`
#### Snippet
```java

  @Override
  public void calcMeasurements(List<Measurement> measurements, long msNow, double secondInterval) {
    super.calcMeasurements(measurements, msNow, secondInterval);

```

### BoundedWildcard
Can generalize to `? extends Type`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/SchemaManager.java`
#### Snippet
```java
  }

  private JavaType getParameterType(Map<String, Type> types, String perameterName) {

    if (types.get(perameterName) != null) {
```

### BoundedWildcard
Can generalize to `? super Measurement`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/vertx/HttpClientEndpointMeter.java`
#### Snippet
```java

  @Override
  public void calcMeasurements(List<Measurement> measurements, long msNow, double secondInterval) {
    super.calcMeasurements(measurements, msNow, secondInterval);

```

### BoundedWildcard
Can generalize to `? super Measurement`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/vertx/EndpointMeter.java`
#### Snippet
```java
  }

  public void calcMeasurements(List<Measurement> measurements, long msNow, double secondInterval) {
    long connectCount = metric.getConnectCount();
    long disconnectCount = metric.getDisconnectCount();
```

### BoundedWildcard
Can generalize to `? super String`
in `metrics/metrics-core/src/main/java/com/netflix/spectator/api/patterns/ThreadPoolMonitorPublishModelFactory.java`
#### Snippet
```java

  public ThreadPoolMonitorPublishModelFactory(MeasurementTree tree,
      Map<String, ThreadPoolPublishModel> threadPools) {
    this.tree = tree;
    this.threadPools = threadPools;
```

### BoundedWildcard
Can generalize to `? extends List`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public CommonToHttpServletRequest(Map<String, String> pathParams, Map<String, List<String>> queryParams,
      Map<String, List<String>> httpHeaders, Object bodyObject, boolean isFormData, List<String> fileKeys) {
    setAttribute(RestConst.PATH_PARAMETERS, pathParams);
```

### BoundedWildcard
Can generalize to `? super Part`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
  }

  private void filePartListWithForm(List<Part> partList, Map<String, Object> form) {
    for (String key : fileKeys) {
      Object value = form.get(key);
```

### BoundedWildcard
Can generalize to `? super String`
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/EdgeAddHeaderClientFilter.java`
#### Snippet
```java
  }

  public void addHeaders(Invocation invocation, BiConsumer<String, String> headerAdder) {
    if (!invocation.isEdge()) {
      return;
```

### BoundedWildcard
Can generalize to `? super String`
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/EdgeAddHeaderClientFilter.java`
#### Snippet
```java
  }

  public void addHeaders(Invocation invocation, BiConsumer<String, String> headerAdder) {
    if (!invocation.isEdge()) {
      return;
```

### BoundedWildcard
Can generalize to `? extends URLMappedConfigurationItem`
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/URLMappedConfigurationLoader.java`
#### Snippet
```java
  }

  private static void logConfigurations(Map<String, URLMappedConfigurationItem> configurations) {
    configurations.forEach((key, item) -> LOG.info("config item: key=" + key + ";pattern=" + item.getStringPattern()
        + ";service=" + item.getMicroserviceName() + ";versionRule=" + item.getVersionRule()));
```

### BoundedWildcard
Can generalize to `? extends io.swagger.models.parameters.Parameter`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/engine/SwaggerProducerOperation.java`
#### Snippet
```java

  private static io.swagger.models.parameters.Parameter findParameterByName(
      List<io.swagger.models.parameters.Parameter> swaggerParameters, String name) {
    for (io.swagger.models.parameters.Parameter p : swaggerParameters) {
      if (p.getName().equals(name)) {
```

### BoundedWildcard
Can generalize to `? extends ConsumerResponseMapper`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/response/consumer/CompletableFutureConsumerResponseMapperFactory.java`
#### Snippet
```java

  @Override
  public ConsumerResponseMapper createResponseMapper(ResponseMapperFactorys<ConsumerResponseMapper> factorys,
      Type consumerType) {
    Type realConsumerType = ((ParameterizedType) consumerType).getActualTypeArguments()[0];
```

### BoundedWildcard
Can generalize to `? extends ConsumerResponseMapper`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/response/consumer/OptionalConsumerResponseMapperFactory.java`
#### Snippet
```java

  @Override
  public ConsumerResponseMapper createResponseMapper(ResponseMapperFactorys<ConsumerResponseMapper> factorys,
      Type consumerType) {
    Type realConsumerType = ((ParameterizedType) consumerType).getActualTypeArguments()[0];
```

### BoundedWildcard
Can generalize to `? extends ProducerResponseMapper`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/response/producer/CompletableFutureProducerResponseMapperFactory.java`
#### Snippet
```java

  @Override
  public ProducerResponseMapper createResponseMapper(ResponseMapperFactorys<ProducerResponseMapper> factorys,
      Type producerType) {
    Type realProducerType = ((ParameterizedType) producerType).getActualTypeArguments()[0];
```

### BoundedWildcard
Can generalize to `? extends ProducerResponseMapper`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/response/producer/OptionalProducerResponseMapperFactory.java`
#### Snippet
```java

  @Override
  public ProducerResponseMapper createResponseMapper(ResponseMapperFactorys<ProducerResponseMapper> factorys,
      Type producerType) {
    Type realProducerType = ((ParameterizedType) producerType).getActualTypeArguments()[0];
```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/consumer/ConsumerArgumentSame.java`
#### Snippet
```java
  @Override
  public void invocationArgumentToSwaggerArguments(SwaggerInvocation swaggerInvocation,
      Map<String, Object> swaggerArguments,
      Map<String, Object> invocationArguments) {
    swaggerArguments.put(swaggerArgumentName, invocationArguments.get(invocationArgumentName));
```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/producer/AbstractProducerContextArgMapper.java`
#### Snippet
```java
  @Override
  public void swaggerArgumentToInvocationArguments(SwaggerInvocation invocation,
      Map<String, Object> swaggerArguments, Map<String, Object> invocationArguments) {
    Object producerArg = createContextArg(invocation);
    invocationArguments.put(this.invocationArgumentName, producerArg);
```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/consumer/ConsumerArgumentToBodyField.java`
#### Snippet
```java
  @Override
  public void invocationArgumentToSwaggerArguments(SwaggerInvocation swaggerInvocation,
      Map<String, Object> swaggerArguments,
      Map<String, Object> invocationArguments) {
    Object consumerArgument = invocationArguments.get(invocationArgumentName);
```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/producer/ProducerArgumentSame.java`
#### Snippet
```java
  @Override
  public void swaggerArgumentToInvocationArguments(SwaggerInvocation invocation,
      Map<String, Object> swaggerArguments, Map<String, Object> invocationArguments) {
    invocationArguments.put(invocationArgumentName, swaggerArguments.get(swaggerArgumentName));
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/producer/SwaggerBodyFieldToProducerArgument.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  public void swaggerArgumentToInvocationArguments(SwaggerInvocation invocation,
      Map<String, Object> swaggerArguments, Map<String, Object> invocationArguments) {
    Map<String, Object> body = (Map<String, Object>) swaggerArguments.get(swaggerArgumentName);
    invocationArguments.put(invocationArgumentName, mapper.convertValue(body.get(parameterName), producerParamType));
```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/consumer/ConsumerBeanParamMapper.java`
#### Snippet
```java
  @Override
  public void invocationArgumentToSwaggerArguments(SwaggerInvocation swaggerInvocation,
      Map<String, Object> swaggerArguments,
      Map<String, Object> invocationArguments) {
    Object consumerArgument = invocationArguments.get(invocationArgumentName);
```

### BoundedWildcard
Can generalize to `? extends ArgumentMapper`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/consumer/ArgumentsMapperCommon.java`
#### Snippet
```java
  private final List<ArgumentMapper> mappers;

  public ArgumentsMapperCommon(List<ArgumentMapper> mappers) {
    this.mappers = mappers;
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/producer/ProducerBeanParamMapper.java`
#### Snippet
```java
  @Override
  public void swaggerArgumentToInvocationArguments(SwaggerInvocation invocation,
      Map<String, Object> swaggerArguments, Map<String, Object> invocationArguments) {
    try {
      Object paramInstance = producerParamType.getDeclaredConstructor().newInstance();
```

### BoundedWildcard
Can generalize to `? extends ArgumentMapper`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/producer/ProducerArgumentsMapper.java`
#### Snippet
```java
  private final List<ArgumentMapper> producerArgMapperList;

  public ProducerArgumentsMapper(List<ArgumentMapper> producerArgMapperList) {
    this.producerArgMapperList = producerArgMapperList;
  }
```

### BoundedWildcard
Can generalize to `? extends ConfigurationItem`
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/provider/AccessController.java`
#### Snippet
```java
  }

  private boolean matchFound(Microservice microservice, Map<String, ConfigurationItem> ruleList) {
    boolean matched = false;
    for (ConfigurationItem item : ruleList.values()) {
```

### BoundedWildcard
Can generalize to `? extends ConfigurationItem`
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/provider/AccessController.java`
#### Snippet
```java
  }

  private void logConfigurations(Map<String, ConfigurationItem> configurations, boolean isWhite) {
    configurations.forEach((key, item) -> LOG.info((isWhite ? "White list " : "Black list ") + "config item: key=" + key
            + ";category=" + item.category
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractObjectManager` has no concrete subclass
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/AbstractObjectManager.java`
#### Snippet
```java
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractObjectManager<KEY_OWNER, KEY, VALUE> {
  protected Map<KEY, VALUE> objMap = new ConcurrentHashMap<>();

```

## RuleId[id=NullableProblems]
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
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.springframework.lang.Nullable'
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseResponseEntityResponseExtractor.java`
#### Snippet
```java

public class CseResponseEntityResponseExtractor<T> implements ResponseExtractor<ResponseEntity<T>> {
  @Nullable
  private final CseHttpMessageConverterExtractor<T> delegate;

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

## RuleId[id=IgnoreResultOfCall]
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
Result of `Matcher.matches()` is ignored
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseUriTemplateHandler.java`
#### Snippet
```java

    Matcher matcher = URI_PATTERN.matcher(uriTemplate);
    matcher.matches(); // should always be true
    String scheme = matcher.group(2);
    String host = matcher.group(6);
```

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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `HttpStatusManager` is the same as one of its superclass' names
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/context/HttpStatusManager.java`
#### Snippet
```java
package org.apache.servicecomb.swagger.invocation.context;

public class HttpStatusManager extends org.apache.servicecomb.foundation.common.http.HttpStatusManager {
}

```

### ClassNameSameAsAncestorName
Class name `HttpStatus` is the same as one of its superclass' names
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/context/HttpStatus.java`
#### Snippet
```java
package org.apache.servicecomb.swagger.invocation.context;

public class HttpStatus extends org.apache.servicecomb.foundation.common.http.HttpStatus {
  public HttpStatus(int statusCode, String reasonPhrase) {
    super(statusCode, reasonPhrase);
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `get()` only delegates to its super method
in `governance/src/main/java/org/apache/servicecomb/governance/handler/DisposableMap.java`
#### Snippet
```java

  @Override
  public Disposable<V> get(Object key) {
    return super.get(key);
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
Method `hasExpired()` only delegates to its super method
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/invocation/AbstractInvocationMeter.java`
#### Snippet
```java

  @Override
  public boolean hasExpired() {
    return super.hasExpired();
  }
```

### RedundantMethodOverride
Method `start()` only delegates to its super method
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/EdgeRestServerVerticle.java`
#### Snippet
```java
public class EdgeRestServerVerticle extends RestServerVerticle {
  @Override
  public void start() throws Exception {
    super.start();
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

### RedundantMethodOverride
Method `enabled()` is identical to its super method
in `handlers/handler-router/src/main/java/org/apache/servicecomb/router/custom/RouterInvokeFilter.java`
#### Snippet
```java

  @Override
  public boolean enabled() {
    return true;
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
    }

    if (size == 1) {
      buffer[offset] = (byte) value;
    } else {
```

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
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/UInt32WriteSchemas.java`
#### Snippet
```java
    }

    if (Integer.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new UInt32Schema<>(protoField, propertyDescriptor);
    }
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
'if' statement can be collapsed
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/SFixed32WriteSchemas.java`
#### Snippet
```java
    }

    if (Integer.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
      return new SFixed32Schema<>(protoField, propertyDescriptor);
    }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/archaius/sources/MicroserviceConfigLoader.java`
#### Snippet
```java
          System.getProperty(DEFAULT_FILE_NAME) == null ? DEFAULT_CONFIG_FILE_NAME
              : System.getProperty(DEFAULT_FILE_NAME);
      super.load(configFileFromClasspath);
      loadAdditionalConfig();

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/HighwayServerVerticle.java`
#### Snippet
```java
  public void start(Promise<Void> startPromise) throws Exception {
    try {
      super.start();
      startListen(startPromise);
    } catch (Throwable e) {
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

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`url = url + "?withSchema=1"` could be simplified to 'url += "?withSchema=1"'
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterClient.java`
#### Snippet
```java
    String url = "/registry/microservices/" + serviceId + "/schemas";
    if (withContent) {
      url = url + "?withSchema=1";
    }

```

### ReplaceAssignmentWithOperatorAssignment
`totalLength = totalLength + headerLength` could be simplified to 'totalLength += headerLength'
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/HighwayOutputStream.java`
#### Snippet
```java
    if (headerBytes != null) {
      headerLength = headerBytes.length;
      totalLength = totalLength + headerLength;
    }

```

### ReplaceAssignmentWithOperatorAssignment
`totalLength = totalLength + bodyBytes.length` could be simplified to 'totalLength += bodyBytes.length'
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/HighwayOutputStream.java`
#### Snippet
```java

    if (bodyBytes != null) {
      totalLength = totalLength + bodyBytes.length;
    }

```

### ReplaceAssignmentWithOperatorAssignment
`rate = rate - Integer.parseInt(item.getPolicyCondition().expected())` could be simplified to 'rate -= Integer.parseInt(item.getPolicyCondition().expected())'
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/DarklaunchServerListFilter.java`
#### Snippet
```java
          return item.getServers();
        }
        rate = rate - Integer.parseInt(item.getPolicyCondition().expected());
      }
    }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/servicecomb/core/Invocation.java`
#### Snippet
```java
      args[i] = this.invocationArguments.get(method.getParameters()[i].getName());
    }
    return producerArguments = args;
  }

```

### NestedAssignment
Result of assignment expression used
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java
    }
    int result = tmp & 0x7f;
    if ((tmp = buffer[offset++]) >= 0) {
      result |= tmp << 7;
    } else {
```

### NestedAssignment
Result of assignment expression used
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java
    } else {
      result |= (tmp & 0x7f) << 7;
      if ((tmp = buffer[offset++]) >= 0) {
        result |= tmp << 14;
      } else {
```

### NestedAssignment
Result of assignment expression used
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java
      } else {
        result |= (tmp & 0x7f) << 14;
        if ((tmp = buffer[offset++]) >= 0) {
          result |= tmp << 21;
        } else {
```

### NestedAssignment
Result of assignment expression used
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java
        } else {
          result |= (tmp & 0x7f) << 21;
          result |= (tmp = buffer[offset++]) << 28;
          if (tmp < 0) {
            // Discard upper 32 bits.
```

### NestedAssignment
Result of assignment expression used
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      lastBuffer.buffer[lastBuffer.offset++] = (byte) tag;
    } else {
      tail = lastBuffer = writeRawVarInt32(tag, this, tail);
    }

```

### NestedAssignment
Result of assignment expression used
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/oper/LikeCondition.java`
#### Snippet
```java
        regExp.append(Pattern.quote(new String(cs, lastPos, i - lastPos)));
        regExp.append(".");
        lastPos = i = 1;
      }
    }
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `objMap` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/AbstractObjectManager.java`
#### Snippet
```java

public abstract class AbstractObjectManager<KEY_OWNER, KEY, VALUE> {
  protected Map<KEY, VALUE> objMap = new ConcurrentHashMap<>();

  protected final Object lockObj = new Object();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `registerErrorFmt` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/RegisterManager.java`
#### Snippet
```java
  private final String name;

  private String registerErrorFmt = "Not allow register repeat data, name=%s, key=%s";

  private final Map<KEY, VALUE> objMap = new ConcurrentHashMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `port` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/IpPort.java`
#### Snippet
```java
  private String hostOrIp;

  private int port;

  private volatile InetSocketAddress socketAddress;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `hostOrIp` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/IpPort.java`
#### Snippet
```java

public class IpPort {
  private String hostOrIp;

  private int port;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lambda` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/event/SimpleSubscriber.java`
#### Snippet
```java

  // generated from method
  private Consumer<Object> lambda;

  private Consumer<Object> dispatcher;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `versions` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java

  // key is service id
  Map<String, MicroserviceVersion> versions = new ConcurrentHashMapEx<>();

  // key is version rule
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `versionRules` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java

  // key is version rule
  Map<String, MicroserviceVersionRule> versionRules = new ConcurrentHashMapEx<>();

  // process pulled instances and create versionRule must be protected by lock
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `instances` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
  //  pulledInstances means all instance
  //  instances means available instance
  Collection<MicroserviceInstance> instances;

  // key is service id
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `revision` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java

  // revision and pulledInstances directly equals to SC's response
  protected String revision = null;

  private List<MicroserviceInstance> pulledInstances;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `priorityPropertyManager` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
  private ExecutorManager executorManager = new ExecutorManager();

  private PriorityPropertyManager priorityPropertyManager;

  protected List<BootUpInformationCollector> bootUpInformationCollectors = SPIServiceUtils
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `consumerProviderManager` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
  private ProducerProviderManager producerProviderManager;

  private ConsumerProviderManager consumerProviderManager = new ConsumerProviderManager();

  private MicroserviceMeta producerMicroserviceMeta;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `transportManager` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
  private MicroserviceMeta producerMicroserviceMeta;

  private TransportManager transportManager = new TransportManager();

  private final List<BootListener> bootListeners = new ArrayList<>(
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producerProviderManager` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
  private FilterChainsManager filterChainsManager;

  private ProducerProviderManager producerProviderManager;

  private ConsumerProviderManager consumerProviderManager = new ConsumerProviderManager();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `filterChainsManager` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
  private ApplicationContext applicationContext;

  private FilterChainsManager filterChainsManager;

  private ProducerProviderManager producerProviderManager;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `shutdownHook` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
  private final VendorExtensions vendorExtensions = new VendorExtensions();

  private Thread shutdownHook;

  protected SCBEngine() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `producerMicroserviceMeta` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
  private ConsumerProviderManager consumerProviderManager = new ConsumerProviderManager();

  private MicroserviceMeta producerMicroserviceMeta;

  private TransportManager transportManager = new TransportManager();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxBuffers` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/OutputStreamToWriteStream.java`
#### Snippet
```java
  // must >= SMALLEST_MAX_BUFFERS
  // if < SMALLEST_MAX_BUFFERS, then maxBuffers will be SMALLEST_MAX_BUFFERS
  private int maxBuffers = DEFAULT_MAX_BUFFERS;

  // if currentBufferCount <= drainMark, will invoke drainHandler to resume readStream
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentBufferCount` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/OutputStreamToWriteStream.java`
#### Snippet
```java
  private final Queue<Buffer> buffers = new ConcurrentLinkedQueue<>();

  private int currentBufferCount;

  // just indicate if buffers is full, not control add logic
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `exceptionHandler` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/OutputStreamToWriteStream.java`
#### Snippet
```java
  private final boolean autoCloseOutputStream;

  private Handler<Throwable> exceptionHandler;

  // resume readStream
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `drainMark` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/OutputStreamToWriteStream.java`
#### Snippet
```java

  // if currentBufferCount <= drainMark, will invoke drainHandler to resume readStream
  private int drainMark = maxBuffers / 2;

  public OutputStreamToWriteStream(Context context, OutputStream outputStream,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `vertxMetrics` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/metrics/DefaultVertxMetricsFactory.java`
#### Snippet
```java
 */
public class DefaultVertxMetricsFactory implements VertxMetricsFactory {
  private DefaultVertxMetrics vertxMetrics;

  public DefaultVertxMetrics getVertxMetrics() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `closed` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/InputStreamToReadStream.java`
#### Snippet
```java
  private final InputStream inputStream;

  private boolean closed;

  private boolean paused;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `exceptionHandler` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/InputStreamToReadStream.java`
#### Snippet
```java
  private int readBufferSize = DEFAULT_READ_BUFFER_SIZE;

  private Handler<Throwable> exceptionHandler = this::unhandledException;

  private Handler<Buffer> dataHandler;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `endHandler` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/InputStreamToReadStream.java`
#### Snippet
```java
  private Handler<Buffer> dataHandler;

  private Handler<Void> endHandler;

  private final boolean autoCloseInputStream;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myselfServiceId` is accessed in both synchronized and unsynchronized contexts
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterDiscovery.java`
#### Snippet
```java
  private final EventBus eventBus;

  private String myselfServiceId;

  private final Map<SubscriptionKey, SubscriptionValue> instancesCache = new ConcurrentHashMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `instances` is accessed in both synchronized and unsynchronized contexts
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/AggregateMicroserviceCache.java`
#### Snippet
```java
  private MicroserviceCacheStatus status = MicroserviceCacheStatus.INIT;

  private List<MicroserviceInstance> instances = new ArrayList<>();

  Collection<ServiceRegistry> serviceRegistries;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `revisionId` is accessed in both synchronized and unsynchronized contexts
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/AggregateMicroserviceCache.java`
#### Snippet
```java
  AtomicLong revisionCounter = new AtomicLong();

  private String revisionId = revisionCounter.toString();

  private MicroserviceCacheStatus status = MicroserviceCacheStatus.INIT;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `status` is accessed in both synchronized and unsynchronized contexts
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/AggregateMicroserviceCache.java`
#### Snippet
```java
  private String revisionId = revisionCounter.toString();

  private MicroserviceCacheStatus status = MicroserviceCacheStatus.INIT;

  private List<MicroserviceInstance> instances = new ArrayList<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `instances` is accessed in both synchronized and unsynchronized contexts
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/RefreshableMicroserviceCache.java`
#### Snippet
```java
  MicroserviceCacheKey key;

  List<MicroserviceInstance> instances = Collections.unmodifiableList(new ArrayList<>());

  Microservice consumerService;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `key` is accessed in both synchronized and unsynchronized contexts
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/RefreshableMicroserviceCache.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(RefreshableMicroserviceCache.class);

  MicroserviceCacheKey key;

  List<MicroserviceInstance> instances = Collections.unmodifiableList(new ArrayList<>());
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `revisionId` is accessed in both synchronized and unsynchronized contexts
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/RefreshableMicroserviceCache.java`
#### Snippet
```java
  Microservice consumerService;

  String revisionId;

  ServiceRegistryClient srClient;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `finalValue` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/PriorityProperty.java`
#### Snippet
```java
  private final DynamicProperty[] properties;

  private T finalValue;

  public PriorityProperty(PriorityPropertyType<T> propertyType) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `globalRegistry` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/MetricsBootstrap.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(MetricsBootstrap.class);

  private GlobalRegistry globalRegistry;

  private EventBus eventBus;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eventBus` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/MetricsBootstrap.java`
#### Snippet
```java
  private GlobalRegistry globalRegistry;

  private EventBus eventBus;

  private final MetricsBootstrapConfig config = new MetricsBootstrapConfig();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `defaultRegistry` is accessed in both synchronized and unsynchronized contexts
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/registry/GlobalRegistry.java`
#### Snippet
```java
  private final List<Registry> registries = new CopyOnWriteArrayList<>();

  private Registry defaultRegistry;

  public GlobalRegistry() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `consumerMeta` is accessed in both synchronized and unsynchronized contexts
in `providers/provider-pojo/src/main/java/org/apache/servicecomb/provider/pojo/PojoConsumerMetaRefresher.java`
#### Snippet
```java
  // for highway, codec meta is relate to target instance
  //  to avoid limit producer to only allow append parameter
  protected PojoConsumerMeta consumerMeta;

  public PojoConsumerMetaRefresher(String microserviceName, String schemaId, Class<?> consumerIntf) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `token` is accessed in both synchronized and unsynchronized contexts
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/consumer/ConsumerTokenManager.java`
#### Snippet
```java
  private final Object lock = new Object();

  private RSAAuthenticationToken token;

  public String getToken() {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `core/src/main/java/org/apache/servicecomb/core/ConsumerProvider.java`
#### Snippet
```java
  String getName();

  void init();
}

```

### EmptyMethod
The method is empty
in `core/src/main/java/org/apache/servicecomb/core/definition/ServiceRegistryListener.java`
#### Snippet
```java
  @SubscriberOrder(-1000)
  @Subscribe
  public void onDestroyMicroservice(DestroyMicroserviceEvent event) {

  }
```

### EmptyMethod
Method only calls its super
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/EdgeRestServerVerticle.java`
#### Snippet
```java
public class EdgeRestServerVerticle extends RestServerVerticle {
  @Override
  public void start() throws Exception {
    super.start();
  }
```

### EmptyMethod
Method only calls its super
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/archaius/scheduler/NeverStartPollingScheduler.java`
#### Snippet
```java
public class NeverStartPollingScheduler extends AbstractPollingScheduler {
  @Override
  protected void schedule(Runnable runnable) {
    return;
  }
```

### EmptyMethod
Method only calls its super
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/archaius/scheduler/NeverStartPollingScheduler.java`
#### Snippet
```java

  @Override
  public void stop() {
    return;
  }
```

### EmptyMethod
The method is empty
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/KeyStoreUtil.java`
#### Snippet
```java
  }

  private static void ignore() {
  }
}
```

### EmptyMethod
The method is empty
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLOption.java`
#### Snippet
```java
  }

  private void ignore() {
  }

```

### EmptyMethod
The method is empty
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/TrustManagerExt.java`
#### Snippet
```java
  }

  private static void ignore() {
  }
}
```

### EmptyMethod
Method only calls its super
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/invocation/AbstractInvocationMeter.java`
#### Snippet
```java

  @Override
  public boolean hasExpired() {
    return super.hasExpired();
  }
```

### EmptyMethod
The method is empty
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/invocation/AbstractInvocationMeters.java`
#### Snippet
```java
  protected abstract AbstractInvocationMeter createMeter(Id id);

  public void onInvocationStart(InvocationStartEvent event) {
  }

```

### EmptyMethod
All implementations of this method are empty
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/ServiceRegistryClient.java`
#### Snippet
```java

public interface ServiceRegistryClient {
  void init();

  /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/base/DynamicEnum.java`
#### Snippet
```java

  @JsonIgnore
  private boolean dynamic = false;

  public DynamicEnum(T value) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/KeyPairUtils.java`
#### Snippet
```java
  private static final Base64.Decoder decoder = Base64.getDecoder();

  private static KeyFactory kf = null;

  static {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
  private long lastPullTime = 0;

  private boolean waitingDelete = false;

  private final VendorExtensions vendorExtensions = new VendorExtensions();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
  private final Object lock = new Object();

  private long lastPullTime = 0;

  private boolean waitingDelete = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java

  // revision and pulledInstances directly equals to SC's response
  protected String revision = null;

  private List<MicroserviceInstance> pulledInstances;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `governance/src/main/java/org/apache/servicecomb/router/model/PolicyRuleItem.java`
#### Snippet
```java
  private Integer total;

  private boolean weightLess = false;

  public PolicyRuleItem() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `governance/src/main/java/org/apache/servicecomb/governance/policy/FaultInjectionPolicy.java`
#### Snippet
```java
  private int errorCode = 500;

  private boolean forceClosed = false;

  private String fallbackType = FaultInjectionConst.FALLBACK_THROWEXCEPTION;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `governance/src/main/java/org/apache/servicecomb/governance/policy/AbstractPolicy.java`
#### Snippet
```java

public abstract class AbstractPolicy extends Configurable implements Comparable<AbstractPolicy> {
  protected int order = 0;

  @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `governance/src/main/java/org/apache/servicecomb/governance/policy/CircuitBreakerPolicy.java`
#### Snippet
```java

  //force open this circuit breaker. This parameter is not used by circuit breaker directly
  private boolean forceOpen = false;

  public CircuitBreakerPolicy() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `governance/src/main/java/org/apache/servicecomb/governance/policy/CircuitBreakerPolicy.java`
#### Snippet
```java

  //force close this circuit breaker. This parameter is not used by circuit breaker directly
  private boolean forceClosed = false;

  //force open this circuit breaker. This parameter is not used by circuit breaker directly
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `governance/src/main/java/org/apache/servicecomb/governance/policy/RetryPolicy.java`
#### Snippet
```java

  // if throw an MaxRetriesExceededException if retry condition is based on result
  private boolean failAfterMaxAttempts = false;

  // if retry on the same instance. This property is not directly used in
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `governance/src/main/java/org/apache/servicecomb/governance/policy/RetryPolicy.java`
#### Snippet
```java
  // if retry on the same instance. This property is not directly used in
  // RetryHandler, but used for loadbalancers
  private int retryOnSame = 0;

  public List<String> getRetryOnResponseStatus() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/servicecomb/core/executor/LinkedBlockingQueueEx.java`
#### Snippet
```java
  private static final long serialVersionUID = -1L;

  private transient volatile ThreadPoolExecutorEx owner = null;

  public LinkedBlockingQueueEx(int capacity) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `service-registry/registry-schema-discovery/src/main/java/org/apache/servicecomb/schemadiscovery/SchemaDiscovery.java`
#### Snippet
```java
  public static final String NAME = "schema discovery";

  private SchemaDiscoveryService schemaDiscoveryService = null;

  @Override
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `transports/transport-rest/transport-rest-vertx/src/main/java/org/apache/servicecomb/transport/rest/vertx/RestBodyHandler.java`
#### Snippet
```java
    boolean ended;

    long uploadSize = 0L;

    final boolean isMultipart;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/client/tcp/TcpClientConnection.java`
#### Snippet
```java
  private final InetSocketAddress socketAddress;

  private boolean localSupportLogin = false;

  private final boolean remoteSupportLogin;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `handlers/handler-flowcontrol-qps/src/main/java/org/apache/servicecomb/qps/strategy/LeakyBucketStrategy.java`
#### Snippet
```java
  private volatile long lastTime;

  private long remainder = 0;

  private static final String STRATEGY_NAME = "LeakyBucket";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterDiscovery.java`
#### Snippet
```java
  private long pollInterval = 15000;

  private boolean started = false;

  private final Object lock = new Object();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterDiscovery.java`
#### Snippet
```java
  private static final String ALL_VERSION = "0+";

  private static volatile boolean pullInstanceTaskOnceInProgress = false;

  public static class SubscriptionKey {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterWatch.java`
#### Snippet
```java
  private String serviceId;

  private int continuousError = 0;

  private final AtomicBoolean reconnecting = new AtomicBoolean(false);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/AbstractParamProcessor.java`
#### Snippet
```java
  protected Object defaultValue;

  protected boolean required = false;

  public Object getDefaultValue() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/OperationLocator.java`
#### Snippet
```java
  protected Map<String, String> pathVarMap = new HashMap<>();

  protected boolean resourceFound = false;

  public RestOperationMeta getOperation() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java

  // 带正则表达式的group数
  protected int groupWithRegExpCount = 0;

  protected final Pattern pattern;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/ServiceCenterTaskMonitor.java`
#### Snippet
```java
  private static final long MAX_TIME_TAKEN = 3000;

  private long beginTime = 0;

  private long lastEndTime = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/ServiceCenterTaskMonitor.java`
#### Snippet
```java
  private long beginTime = 0;

  private long lastEndTime = 0;

  private int interval = -1;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/ServiceCenterTask.java`
#### Snippet
```java
  private final MicroserviceServiceCenterTask microserviceServiceCenterTask;

  private boolean registerInstanceSuccess = false;

  private final ServiceCenterTaskMonitor serviceCenterTaskMonitor = new ServiceCenterTaskMonitor();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/IpPortManager.java`
#### Snippet
```java
  private final ArrayList<IpPort> defaultIpPort;

  private boolean autoDiscoveryInited = false;

  private final ServiceRegistryAddressManager addressManger;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RequestContext.java`
#### Snippet
```java
  private RequestParam params;

  private int retryTimes = 0;

  public IpPort getIpPort() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RequestParam.java`
#### Snippet
```java
  private Map<String, Object> formFields;

  private byte[] body = null;

  private Map<String, String> headers;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/RemoteServiceRegistry.java`
#### Snippet
```java
    taskPool = new ScheduledThreadPoolExecutor(3,
        new ThreadFactory() {
          private int taskId = 0;

          @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/RefreshableServiceRegistryCache.java`
#### Snippet
```java
  ServiceRegistryClient srClient;

  boolean emptyInstanceProtectionEnabled = false;

  Consumer<List<MicroserviceCache>> cacheRefreshedWatcher;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/LoadBalanceFilter.java`
#### Snippet
```java
  private final ExtensionsManager extensionsManager;

  private String strategy = null;

  @VisibleForTesting
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/DataFactory.java`
#### Snippet
```java
  private MonitorDataPublisher publisher;

  private ScheduledExecutorService executorService = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/SessionStickinessRule.java`
#### Snippet
```java
  private final RuleExt triggerRule;

  private volatile ServiceCombServer lastServer = null;

  private long lastAccessedTime = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/DataFactory.java`
#### Snippet
```java
  private static final int CORE_SIZE = 1;

  private boolean hasStart = false;

  @Inject
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/SessionStickinessRule.java`
#### Snippet
```java
  private long lastAccessedTime = 0;

  private volatile boolean errorThresholdMet = false;

  private static final int MILLI_COUNT_IN_SECOND = 1000;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/SessionStickinessRule.java`
#### Snippet
```java
  private volatile ServiceCombServer lastServer = null;

  private long lastAccessedTime = 0;

  private volatile boolean errorThresholdMet = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/data/CPUMonitorCalc.java`
#### Snippet
```java
  private long preTime = System.nanoTime();

  private long preUsedTime = 0;

  private CPUMonitorCalc() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MetricsMonitorDataProvider.java`
#### Snippet
```java
  public static final String NAME_CONSUMER = "Consumer.";

  private volatile List<Meter> meters = null;

  public MetricsMonitorDataProvider() {
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/meter/LatencyScopeMeter.java`
#### Snippet
```java
  private final LongAdder times = new LongAdder();

  private long lastTimes = 0L;

  private final long nanoMin;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/meter/SimpleTimer.java`
#### Snippet
```java
  private long lastCount = 0;

  private long lastTotalTime = 0;

  public SimpleTimer(Id id) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/meter/SimpleTimer.java`
#### Snippet
```java
  private final AtomicDouble max = new AtomicDouble();

  private long lastCount = 0;

  private long lastTotalTime = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/inject/PlaceholderResolver.java`
#### Snippet
```java
    int cartesianProductCount = 1;

    int varCount = 0;
  }

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `spring-boot/spring-boot-starters/java-chassis-spring-boot-starter-servlet/src/main/java/org/apache/servicecomb/springboot/starter/servlet/RestServletInitializer.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(RestServletInitializer.class);

  private AbstractConfigurableWebServerFactory factory = null;

  @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java
  private final byte[] buffer;

  private int offset, limit, lastTag = 0;

  private int packedLimit = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java
  private int offset, limit, lastTag = 0;

  private int packedLimit = 0;

  private ArrayBuilders arrayBuilders;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/MessageReadSchema.java`
#### Snippet
```java
  Map<String, Type> argumentsTypes;

  private boolean argumentsRoot = false;

  @SuppressWarnings("unchecked")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/EdgeAddHeaderClientFilter.java`
#### Snippet
```java
  private List<String> publicHeaders = new ArrayList<>();

  private boolean enabled = false;

  public EdgeAddHeaderClientFilter() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/http/RestClientInvocation.java`
#### Snippet
```java
  private final Handler<Throwable> throwableHandler = this::fail;

  private boolean alreadyFailed = false;

  public RestClientInvocation(HttpClientWithContext httpClientWithContext, List<HttpClientFilter> httpClientFilters) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/consumer/ConsumerArgumentsMapperCreator.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerArgumentsMapperCreator.class);

  private int unknownConsumerParams = 0;

  public ConsumerArgumentsMapperCreator(SerializationConfig serializationConfig,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/AbstractAddressManager.java`
#### Snippet
```java
  private List<String> addresses = new ArrayList<>();

  private int index = 0;

  private String projectName;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/AbstractAddressManager.java`
#### Snippet
```java
  private final List<String> defaultAddress = new ArrayList<>();

  private boolean addressAutoRefreshed = false;

  private final Object lock = new Object();
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `EnvironmentAware`
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
 *  Users need to use the same key as what is in config file to override.
 */
public class ConfigurationSpringInitializer extends PropertySourcesPlaceholderConfigurer implements EnvironmentAware {
  private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationSpringInitializer.class);

```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `RuntimeExceptionWithoutStackTrace` does not end with 'Exception'
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/exception/RuntimeExceptionWithoutStackTrace.java`
#### Snippet
```java
package org.apache.servicecomb.foundation.test.scaffolding.exception;

public class RuntimeExceptionWithoutStackTrace extends RuntimeException {
  private static final long serialVersionUID = -1L;

```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `handlers/handler-tracing-zipkin/src/main/java/org/apache/servicecomb/tracing/zipkin/TracingConfiguration.java`
#### Snippet
```java
            .trim()
            .replaceAll("/+$", "")
            .concat(path));
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

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/event/SimpleSubscriber.java`
#### Snippet
```java

  private void syncDispatch(Object event) {
    synchronized (this) {
      lambda.accept(event);
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `core/src/main/java/org/apache/servicecomb/core/definition/MicroserviceVersionsMeta.java`
#### Snippet
```java
  public MicroserviceConfig getMicroserviceConfig() {
    if (microserviceConfig == null) {
      synchronized (this) {
        if (microserviceConfig == null) {
          this.microserviceConfig = scbEngine.getPriorityPropertyManager()
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/OutputStreamToWriteStream.java`
#### Snippet
```java
        outputStream.write(buffer.getBytes());

        synchronized (OutputStreamToWriteStream.this) {
          currentBufferCount--;
          Runnable action = (currentBufferCount == 0 && closedDeferred != null) ? closedDeferred : this::checkDrained;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `providers/provider-pojo/src/main/java/org/apache/servicecomb/provider/pojo/PojoConsumerMetaRefresher.java`
#### Snippet
```java
  private void ensureMetaAvailable() {
    if (isNeedRefresh()) {
      synchronized (this) {
        if (isNeedRefresh()) {
          this.consumerMeta = refreshMeta();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
    Boolean alreadyWatch = watchServices.get(selfMicroserviceId);
    if (alreadyWatch == null) {
      synchronized (ServiceRegistryClientImpl.class) {
        alreadyWatch = watchServices.get(selfMicroserviceId);
        if (alreadyWatch == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/AbstractAddressManager.java`
#### Snippet
```java

  private String getCurrentAddress(List<String> addresses) {
    synchronized (this) {
      this.index++;
      if (this.index >= addresses.size()) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/KeyStoreUtil.java`
#### Snippet
```java
      is = new FileInputStream(crlfile);
      Collection c = cf.generateCRLs(is);
      return (CRL[]) c.toArray(new CRL[0]);
    } catch (CertificateException e) {
      throw new IllegalArgumentException("bad cert file.");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLManager.java`
#### Snippet
```java
    try {
      String keyStoreName = custom.getFullPath(option.getKeyStore());
      char[] keyStoreValue = option.getKeyStoreValue() == null ? new char[0] :
          custom.decode(option.getKeyStoreValue().toCharArray());
      KeyStore keyStore =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLManager.java`
#### Snippet
```java

      String trustStoreName = custom.getFullPath(option.getTrustStore());
      char[] trustStoreValue = option.getTrustStoreValue() == null ? new char[0] :
          custom.decode(option.getTrustStoreValue().toCharArray());
      KeyStore trustStore =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/PaaSResourceUtils.java`
#### Snippet
```java
      return resourcePatternResolver.getResources(locationPattern);
    } catch (IOException e) {
      return new Resource[0];
    }
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/parameter/EnumPostProcessor.java`
#### Snippet
```java
  private void processParameterDescription(ParameterGenerator parameterGenerator) {
    JavaType genericType = parameterGenerator.getGenericType();
    Annotation[] annotations = parameterGenerator.getAnnotations().toArray(new Annotation[0]);
    String description = generateDescription(genericType, annotations);
    if (description != null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGeneratorUtils.java`
#### Snippet
```java
      Collections.addAll(annotations, propertyDefinition.getSetter().getAnnotated().getAnnotations());
    }
    return annotations.toArray(new Annotation[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGeneratorUtils.java`
#### Snippet
```java

    List<Module> modules = SPIServiceUtils.getOrLoadSortedService(Module.class);
    Json.mapper().registerModules(modules.toArray(new Module[0]));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
            .forEach(configModel -> values.putAll(YAMLUtil.retrieveItems("", configModel.getConfig())));

        propertyNames = values.keySet().toArray(new String[0]);
      }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/StandardHttpServletRequestEx.java`
#### Snippet
```java
    Map<String, String[]> arrayMap = new HashMap<>();
    for (Entry<String, List<String>> entry : listMap.entrySet()) {
      arrayMap.put(entry.getKey(), entry.getValue().toArray(new String[0]));
    }
    return arrayMap;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/VertxServerRequestToHttpServletRequest.java`
#### Snippet
```java

    List<String> paramList = this.vertxRequest.params().getAll(name);
    return paramList.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/VertxServerRequestToHttpServletRequest.java`
#### Snippet
```java
      MultiMap map = this.vertxRequest.params();
      for (String name : map.names()) {
        paramMap.put(name, map.getAll(name).toArray(new String[0]));
      }
      parameterMap = paramMap;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/RestObjectMapperFactory.java`
#### Snippet
```java
    // because we need to sort modules, so that customers can override our default module
    List<Module> modules = SPIServiceUtils.getOrLoadSortedService(Module.class);
    mapper.registerModules(modules.toArray(new Module[0]));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/query/QueryCodecWithDelimiter.java`
#### Snippet
```java
  public Object decode(QueryProcessor processor, HttpServletRequest request) {
    Object value = processor.getAndCheckParameter(request);
    value = value != null ? value.toString().split(splitDelimiter, -1) : new String[0];
    return processor.convertValue(value);
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `swagger/swagger-generator/generator-spring-data/src/main/java/org/apache/servicecomb/swagger/generator/springdata/SpringDataModule.java`
#### Snippet
```java
      }
      SortMixin result = new SortMixin();
      result.setProperties(properties.toArray(new String[0]));
      return result;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObjectFactory.java`
#### Snippet
```java
    }

    return finalKeys.toArray(new String[0]);
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/HighwayOutputStream.java`
#### Snippet
```java
  public void write(RootSerializer headerSerializer, Object header, RootSerializer bodySerializer, Object body)
      throws Exception {
    byte[] headerBytes = new byte[0];
    byte[] bodyBytes = new byte[0];

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/HighwayOutputStream.java`
#### Snippet
```java
      throws Exception {
    byte[] headerBytes = new byte[0];
    byte[] bodyBytes = new byte[0];

    if (headerSerializer != null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
    List<String> queryValues = queryParams.get(name);
    if (queryValues == null || queryValues.isEmpty()) {
      return new String[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
    }

    return queryValues.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
    List<String> strCookies = httpHeaders.get(HttpHeaders.COOKIE);
    if (strCookies == null) {
      return new Cookie[] {};
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
    }

    return result.toArray(new Cookie[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/converter/impl/part/PartListToPartArrayConverter.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    List<Part> partList = (List<Part>) value;
    return partList.toArray(new Part[0]);
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/RestServletInjector.java`
#### Snippet
```java
  private String[] splitUrlPattern(String urlPattern) {
    if (StringUtils.isEmpty(urlPattern)) {
      return new String[] {};
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/ServletUtils.java`
#### Snippet
```java
    List<ServletRegistration> servlets = findServletRegistrations(servletContext, servletCls);
    if (servlets.isEmpty()) {
      return new String[] {};
    }

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

## RuleId[id=UnusedAssignment]
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
Variable `required` initializer `false` is redundant
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/AbstractParamProcessor.java`
#### Snippet
```java
  protected Object defaultValue;

  protected boolean required = false;

  public Object getDefaultValue() {
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

### UnusedAssignment
Variable `executorService` initializer `null` is redundant
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/DataFactory.java`
#### Snippet
```java
  private MonitorDataPublisher publisher;

  private ScheduledExecutorService executorService = null;


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
Variable `fileKeys` initializer `new ArrayList<>()` is redundant
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java

  //contains all the file key in the parts
  private List<String> fileKeys = new ArrayList<>();

  // gen by httpHeaders
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
Variable `fieldValue` initializer `null` is redundant
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/provider/AccessController.java`
#### Snippet
```java

  private boolean matchMicroserviceField(Microservice microservice, ConfigurationItem item) {
    Object fieldValue = null;
    try {
      fieldValue = new PropertyDescriptor(item.propertyName, Microservice.class).getReadMethod().invoke(microservice);
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
Condition `beanCls == null` is always `false`
in `providers/provider-pojo/src/main/java/org/apache/servicecomb/provider/pojo/schema/PojoProducers.java`
#### Snippet
```java
    // 所以，需要先取出原class，再取标注
    Class<?> beanCls = BeanUtils.getImplClassFromBean(bean);
    if (beanCls == null) {
      return;
    }
```

### ConstantValue
Condition `instance == null` is always `false`
in `providers/provider-pojo/src/main/java/org/apache/servicecomb/provider/pojo/instance/SpringInstanceFactory.java`
#### Snippet
```java
  public Object create(String beanId) {
    Object instance = BeanUtils.getBean(beanId);
    if (instance == null) {
      throw new Error("Fail to find bean:" + beanId);
    }
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
Condition `beanCls == null` is always `false`
in `providers/provider-rest-common/src/main/java/org/apache/servicecomb/provider/rest/common/RestProducers.java`
#### Snippet
```java
    // 所以，需要先取出原class，再取标注
    Class<?> beanCls = BeanUtils.getImplClassFromBean(bean);
    if (beanCls == null) {
      return;
    }
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `isType()` tries to override a static method of a superclass
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/property/ShortProperty.java`
#### Snippet
```java
  }

  public static boolean isType(String type, String format) {
    return TYPE.equals(type) && FORMAT.equals(format);
  }
```

### MethodOverridesStaticMethod
Method `isType()` tries to override a static method of a superclass
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/property/ByteProperty.java`
#### Snippet
```java
  }

  public static boolean isType(String type, String format) {
    return TYPE.equals(type) && FORMAT.equals(format);
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

## RuleId[id=IOResource]
### IOResource
'GroupExecutor' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core/src/main/java/org/apache/servicecomb/core/bootstrap/SCBEngineForTest.java`
#### Snippet
```java
public class SCBEngineForTest extends SCBEngine {
  public SCBEngineForTest() {
    getExecutorManager().registerExecutor(EXECUTOR_GROUP_THREADPOOL, new GroupExecutor().init());

    List<Filter> filters = Arrays.asList(
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

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `loaded` may be 'static'
in `huawei-cloud/servicestage/src/main/java/org/apache/servicecomb/huaweicloud/servicestage/AKSKAuthHeaderProvider.java`
#### Snippet
```java
  private boolean enabled;

  private final boolean loaded = false;

  public AKSKAuthHeaderProvider() {
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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ClientAuth` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/ClientAuth.java`
#### Snippet
```java
package org.apache.servicecomb.foundation.ssl;

public final class ClientAuth {
  public static final String REQUIRED = "REQUIRED";

```

### UtilityClassWithoutPrivateConstructor
Class `ClassLoaderScopeContext` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/ClassLoaderScopeContext.java`
#### Snippet
```java
*
*/
public class ClassLoaderScopeContext {

  private static final Map<String, String> CLASS_LOADER_SCOPE_CONTEXT = new HashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `IOUtils` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/IOUtils.java`
#### Snippet
```java
import org.apache.commons.lang3.StringUtils;

public class IOUtils {
  @SuppressWarnings("deprecation")
  public static void closeQuietly(final Closeable closeable) {
```

### UtilityClassWithoutPrivateConstructor
Class `MimeTypesUtils` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/MimeTypesUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class MimeTypesUtils {
  private static final Pattern COMMA_SPLITTER = Pattern.compile(" *, *");

```

### UtilityClassWithoutPrivateConstructor
Class `KeyPairUtils` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/KeyPairUtils.java`
#### Snippet
```java
import com.netflix.config.DynamicPropertyFactory;

public class KeyPairUtils {

  private static final Logger LOGGER = LoggerFactory.getLogger(KeyPairUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `GenericsUtils` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/GenericsUtils.java`
#### Snippet
```java
import java.lang.reflect.Type;

public final class GenericsUtils {
  /**
   * check if XXX.class is generic type. see TestGenericsUtils for details meaning.
```

### UtilityClassWithoutPrivateConstructor
Class `TypesUtil` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/TypesUtil.java`
#### Snippet
```java
 * common utils to convert java types.
 */
public class TypesUtil {
  private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_WRAPPER = new HashMap<>();

```

### UtilityClassWithoutPrivateConstructor
Class `Encryptions` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/encrypt/Encryptions.java`
#### Snippet
```java
import com.google.common.annotations.VisibleForTesting;

public class Encryptions {
  private static Encryption encryption = SPIServiceUtils.getPriorityHighestService(Encryption.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ServiceCenterEventBus` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/event/ServiceCenterEventBus.java`
#### Snippet
```java
import com.google.common.eventbus.EventBus;

public final class ServiceCenterEventBus {
  private static final EventBus eventBus = new SimpleEventBus();

```

### UtilityClassWithoutPrivateConstructor
Class `FrameworkVersions` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/registry/FrameworkVersions.java`
#### Snippet
```java
import org.apache.servicecomb.registry.api.Versions;

public class FrameworkVersions {
  private static final ServiceLoader<Versions> frameworkVersions = ServiceLoader.load(Versions.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ServiceRegistryCommonConfig` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/config/ServiceRegistryCommonConfig.java`
#### Snippet
```java
import com.netflix.config.DynamicPropertyFactory;

public class ServiceRegistryCommonConfig {
  private static final String REGISTRY_EMPTY_PROTECTION = "servicecomb.service.registry.instance.empty.protection";

```

### UtilityClassWithoutPrivateConstructor
Class `MicroserviceInstanceCache` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/cache/MicroserviceInstanceCache.java`
#### Snippet
```java
 *
 */
public class MicroserviceInstanceCache {

  private static final Logger logger = LoggerFactory.getLogger(MicroserviceInstanceCache.class);
```

### UtilityClassWithoutPrivateConstructor
Class `VersionUtils` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/version/VersionUtils.java`
#### Snippet
```java
import org.apache.servicecomb.foundation.common.concurrent.ConcurrentHashMapEx;

public final class VersionUtils {
  private static final Map<String, Version> versionCache = new ConcurrentHashMapEx<>();

```

### UtilityClassWithoutPrivateConstructor
Class `VersionRuleUtils` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/version/VersionRuleUtils.java`
#### Snippet
```java
import org.apache.servicecomb.foundation.common.concurrent.ConcurrentHashMapEx;

public final class VersionRuleUtils {
  private static final List<VersionRuleParser> parsers = new ArrayList<>();

```

### UtilityClassWithoutPrivateConstructor
Class `TransportUtils` has only 'static' members, and lacks a 'private' constructor
in `dynamic-config/config-cc/src/main/java/org/apache/servicecomb/config/TransportUtils.java`
#### Snippet
```java
import org.apache.servicecomb.http.client.common.HttpConfiguration.SSLProperties;

public class TransportUtils {
  public static SSLProperties createSSLProperties(boolean sslEnabled, Configuration configuration, String tag) {
    SSLProperties sslProperties = new SSLProperties();
```

### UtilityClassWithoutPrivateConstructor
Class `MethodUtils` has only 'static' members, and lacks a 'private' constructor
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/utils/MethodUtils.java`
#### Snippet
```java
import io.swagger.annotations.ApiOperation;

public class MethodUtils {
  /**
   * Get the methods of <code>cls</code> which are valid for generating Swagger schema.
```

### UtilityClassWithoutPrivateConstructor
Class `VersionCompareUtil` has only 'static' members, and lacks a 'private' constructor
in `governance/src/main/java/org/apache/servicecomb/router/util/VersionCompareUtil.java`
#### Snippet
```java
import org.apache.servicecomb.foundation.common.Version;

public class VersionCompareUtil {
  public static int compareVersion(String version1, String version2) {
    return new Version(version1).compareTo(new Version(version2));
```

### UtilityClassWithoutPrivateConstructor
Class `GovernanceEventManager` has only 'static' members, and lacks a 'private' constructor
in `governance/src/main/java/org/apache/servicecomb/governance/event/GovernanceEventManager.java`
#### Snippet
```java
import com.google.common.eventbus.EventBus;

public class GovernanceEventManager {
  private static final EventBus eventBus = new EventBus();

```

### UtilityClassWithoutPrivateConstructor
Class `GovernanceUtils` has only 'static' members, and lacks a 'private' constructor
in `governance/src/main/java/org/apache/servicecomb/governance/utils/GovernanceUtils.java`
#### Snippet
```java
package org.apache.servicecomb.governance.utils;

public final class GovernanceUtils {
  public static final String DIGIT_REGEX = "-{0,1}[0-9]{1,10}";

```

### UtilityClassWithoutPrivateConstructor
Class `FaultInjectionConst` has only 'static' members, and lacks a 'private' constructor
in `governance/src/main/java/org/apache/servicecomb/governance/processor/injection/FaultInjectionConst.java`
#### Snippet
```java
 * Handles the all constant values for fault injection.
 */
public class FaultInjectionConst {

  public static final int FAULT_INJECTION_DEFAULT_VALUE = -1;
```

### UtilityClassWithoutPrivateConstructor
Class `SCBBootstrap` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/servicecomb/core/bootstrap/SCBBootstrap.java`
#### Snippet
```java
import org.apache.servicecomb.registry.RegistrationManager;

public class SCBBootstrap {
  public static SCBEngine createSCBEngineForTest() {
    RegistrationManager.INSTANCE.init();
```

### UtilityClassWithoutPrivateConstructor
Class `GovernanceConfiguration` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/servicecomb/core/governance/GovernanceConfiguration.java`
#### Snippet
```java
import com.netflix.config.DynamicPropertyFactory;

public class GovernanceConfiguration {
  public static final String ROOT = "servicecomb.loadbalance.";

```

### UtilityClassWithoutPrivateConstructor
Class `MatchType` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/servicecomb/core/governance/MatchType.java`
#### Snippet
```java
import org.apache.servicecomb.governance.marker.GovernanceRequestExtractor;

public final class MatchType {
  private static class GovernanceRequestExtractorImpl implements GovernanceRequestExtractor {
    private final Invocation invocation;
```

### UtilityClassWithoutPrivateConstructor
Class `EndpointCacheUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/servicecomb/core/invocation/endpoint/EndpointCacheUtils.java`
#### Snippet
```java
import com.google.common.cache.LoadingCache;

public final class EndpointCacheUtils {
  private static final LoadingCache<String, Endpoint> CACHE = CacheBuilder.newBuilder()
      .maximumSize(10000)
```

### UtilityClassWithoutPrivateConstructor
Class `Const` has only 'static' members, and lacks a 'private' constructor
in `service-registry/registry-schema-discovery/src/main/java/org/apache/servicecomb/schemadiscovery/Const.java`
#### Snippet
```java
package org.apache.servicecomb.schemadiscovery;

public class Const {
  public static final int SCHEMA_DISCOVERY_ORDER = 200;

```

### UtilityClassWithoutPrivateConstructor
Class `VertxConst` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/VertxConst.java`
#### Snippet
```java
package org.apache.servicecomb.foundation.vertx;

public final class VertxConst {
  public static final String PROXY_PRE_NAME = "servicecomb.proxy.";

```

### UtilityClassWithoutPrivateConstructor
Class `SharedVertxFactory` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/SharedVertxFactory.java`
#### Snippet
```java
import io.vertx.core.shareddata.Shareable;

public class SharedVertxFactory {
  static class SharedVertxInfo implements Shareable {
    public VertxOptions vertxOptions = new VertxOptions();
```

### UtilityClassWithoutPrivateConstructor
Class `AddressResolverConfig` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/AddressResolverConfig.java`
#### Snippet
```java
import io.vertx.core.dns.AddressResolverOptions;

public class AddressResolverConfig {

  private static final Logger LOGGER = LoggerFactory.getLogger(AddressResolverConfig.class);
```

### UtilityClassWithoutPrivateConstructor
Class `HttpClients` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/client/http/HttpClients.java`
#### Snippet
```java
 *  load and manages a set of HttpClient at boot up.
 */
public class HttpClients {
  private static final Logger LOGGER = LoggerFactory.getLogger(HttpClients.class);

```

### UtilityClassWithoutPrivateConstructor
Class `TransportUtils` has only 'static' members, and lacks a 'private' constructor
in `dynamic-config/config-kie/src/main/java/org/apache/servicecomb/config/kie/TransportUtils.java`
#### Snippet
```java
import org.apache.servicecomb.http.client.common.HttpConfiguration.SSLProperties;

public class TransportUtils {
  public static SSLProperties createSSLProperties(boolean sslEnabled, Configuration configuration, String tag) {
    SSLProperties sslProperties = new SSLProperties();
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigConstants` has only 'static' members, and lacks a 'private' constructor
in `clients/config-kie-client/src/main/java/org/apache/servicecomb/config/kie/client/model/ConfigConstants.java`
#### Snippet
```java


public class ConfigConstants {

  public static final String LABEL_ENV = "environment";
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigurationsRequestFactory` has only 'static' members, and lacks a 'private' constructor
in `clients/config-kie-client/src/main/java/org/apache/servicecomb/config/kie/client/model/ConfigurationsRequestFactory.java`
#### Snippet
```java
import org.apache.servicecomb.http.client.common.HttpUtils;

public class ConfigurationsRequestFactory {
  private static final String KEY_APP = "app";

```

### UtilityClassWithoutPrivateConstructor
Class `Deployment` has only 'static' members, and lacks a 'private' constructor
in `deployment/src/main/java/org/apache/servicecomb/deployment/Deployment.java`
#### Snippet
```java
import org.apache.servicecomb.foundation.common.utils.SPIServiceUtils;

public class Deployment {
  private static final List<DeploymentProvider> providerList = SPIServiceUtils.getSortedService(DeploymentProvider.class);

```

### UtilityClassWithoutPrivateConstructor
Class `InvokerUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/servicecomb/core/provider/consumer/InvokerUtils.java`
#### Snippet
```java
import io.vertx.core.Context;

public final class InvokerUtils {
  private static final Logger LOGGER = LoggerFactory.getLogger(InvokerUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `RestObjectMapperFactory` has only 'static' members, and lacks a 'private' constructor
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/RestObjectMapperFactory.java`
#### Snippet
```java
 * Manage RestObjectMapper instances. Give users an option to specify custom mappers.
 */
public class RestObjectMapperFactory {
  private static AbstractRestObjectMapper defaultMapper = new RestObjectMapper();

```

### UtilityClassWithoutPrivateConstructor
Class `QueryCodecsUtils` has only 'static' members, and lacks a 'private' constructor
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/query/QueryCodecsUtils.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class QueryCodecsUtils {
  // create a default instance, so that more friendly to UT
  private static QueryCodecs queryCodecs = QueryCodecs.createForTest();
```

### UtilityClassWithoutPrivateConstructor
Class `REGISTRY_API` has only 'static' members, and lacks a 'private' constructor
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/api/Const.java`
#### Snippet
```java
  }

  public static final class REGISTRY_API {
    public static final String DOMAIN_NAME = ServiceRegistryConfig.INSTANCE.getDomainName();

```

### UtilityClassWithoutPrivateConstructor
Class `ConfigCenterConfigurationSourceLoader` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/spi/ConfigCenterConfigurationSourceLoader.java`
#### Snippet
```java
import org.apache.servicecomb.foundation.common.utils.SPIServiceUtils;

public class ConfigCenterConfigurationSourceLoader {
  private static final List<ConfigCenterConfigurationSource> configCenterConfigurationSources =
      SPIServiceUtils.getSortedService(ConfigCenterConfigurationSource.class);
```

### UtilityClassWithoutPrivateConstructor
Class `BootStrapProperties` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/BootStrapProperties.java`
#### Snippet
```java
 * through property files or environment variables.
 */
public class BootStrapProperties {
  // start of : service definition keys
  // service definition keys of old version
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigSourceMaker` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/archaius/sources/ConfigSourceMaker.java`
#### Snippet
```java
package org.apache.servicecomb.config.archaius.sources;

public class ConfigSourceMaker {

  public static MicroserviceConfigurationSource yamlConfigSource() {
```

### UtilityClassWithoutPrivateConstructor
Class `TransportUtils` has only 'static' members, and lacks a 'private' constructor
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/TransportUtils.java`
#### Snippet
```java
import org.apache.servicecomb.http.client.common.HttpConfiguration.SSLProperties;

public class TransportUtils {
  public static SSLProperties createSSLProperties(boolean sslEnabled, Configuration configuration, String tag) {
    SSLProperties sslProperties = new SSLProperties();
```

### UtilityClassWithoutPrivateConstructor
Class `MonitorConstant` has only 'static' members, and lacks a 'private' constructor
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/data/MonitorConstant.java`
#### Snippet
```java
import com.netflix.config.DynamicStringProperty;

public class MonitorConstant {
  public static final String DOMAIN_NAME = getDomainName();

```

### UtilityClassWithoutPrivateConstructor
Class `FaultInjectionConfig` has only 'static' members, and lacks a 'private' constructor
in `handlers/handler-fault-injection/src/main/java/org/apache/servicecomb/faultinjection/FaultInjectionConfig.java`
#### Snippet
```java
 * center.
 */
public final class FaultInjectionConfig {

  private static final Logger LOGGER = LoggerFactory.getLogger(FaultInjectionConfig.class);
```

### UtilityClassWithoutPrivateConstructor
Class `FaultInjectionConst` has only 'static' members, and lacks a 'private' constructor
in `handlers/handler-fault-injection/src/main/java/org/apache/servicecomb/faultinjection/FaultInjectionConst.java`
#### Snippet
```java
 * Handles the all constant values for fault injection.
 */
public class FaultInjectionConst {

  public static final int FAULT_INJECTION_DEFAULT_VALUE = -1;
```

### UtilityClassWithoutPrivateConstructor
Class `ProtobufManager` has only 'static' members, and lacks a 'private' constructor
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/definition/ProtobufManager.java`
#### Snippet
```java
import com.google.common.annotations.VisibleForTesting;

public final class ProtobufManager {
  public static final String EXT_ID = "protobuf";

```

### UtilityClassWithoutPrivateConstructor
Class `FieldTypeUtils` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/io/protostuff/runtime/FieldTypeUtils.java`
#### Snippet
```java
import io.protostuff.compiler.model.ScalarFieldType;

public final class FieldTypeUtils {
  public static FieldType convert(io.protostuff.compiler.model.FieldType fieldType) {
    if (fieldType.isEnum()) {
```

### UtilityClassWithoutPrivateConstructor
Class `FloatWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/FloatWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class FloatWriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (float.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed64WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/Fixed64WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed64WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (long.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt32WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/SInt32WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt32WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (int.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `StringWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/StringWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class StringWriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (char.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt64WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/UInt64WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt64WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (long.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `Int64WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/Int64WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int64WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (long.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt64WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/SInt64WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt64WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (long.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed64WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/SFixed64WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed64WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (long.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `DoubleWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/DoubleWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class DoubleWriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (double.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed32WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/Fixed32WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed32WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (int.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt32WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/UInt32WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt32WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (int.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `BytesWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/BytesWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BytesWriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (byte[].class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `BoolWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/BoolWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BoolWriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (boolean.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `EnumWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/EnumWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class EnumWriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (propertyDescriptor.getJavaType().isEnumType()) {
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed32WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/SFixed32WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed32WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (int.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `Int32WriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/scalar/Int32WriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public final class Int32WriteSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    if (int.class.equals(propertyDescriptor.getJavaType().getRawClass())) {
```

### UtilityClassWithoutPrivateConstructor
Class `RepeatedPrimitiveWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/RepeatedPrimitiveWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class RepeatedPrimitiveWriteSchemas {
  public static <T, PRIMITIVE_ARRAY, PRIMITIVE_WRAPPER> FieldSchema<T> create(Field protoField,
      PropertyDescriptor propertyDescriptor,
```

### UtilityClassWithoutPrivateConstructor
Class `AnyRepeatedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/AnyRepeatedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class AnyRepeatedWriteSchemas {
  private static class AnyWriters<T> extends AbstractWriters<T> {
    public AnyWriters(Field protoField, FieldSchema<T> anySchema) {
```

### UtilityClassWithoutPrivateConstructor
Class `StringsRepeatedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/StringsRepeatedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class StringsRepeatedWriteSchemas {
  private static class StringWriters extends AbstractWriters<String> {
    public StringWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `BytesRepeatedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/BytesRepeatedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BytesRepeatedWriteSchemas {
  private static class BytesWriters extends AbstractWriters<byte[]> {
    public BytesWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyWrapperRepeatedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/PropertyWrapperRepeatedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class PropertyWrapperRepeatedWriteSchemas {
  private static class PropertyWrapperWriters extends AbstractWriters<Object> {
    public PropertyWrapperWriters(Field protoField, SchemaWriter<Object> elementSchema, Class<Object[]> arrayClass) {
```

### UtilityClassWithoutPrivateConstructor
Class `RepeatedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/RepeatedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class RepeatedWriteSchemas {
  public static <T, ELE_TYPE> FieldSchema<T> create(Field protoField,
      PropertyDescriptor propertyDescriptor,
```

### UtilityClassWithoutPrivateConstructor
Class `Int32PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/Int32PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int32PackedWriteSchemas {
  private static class Int32PackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public Int32PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `MessagesRepeatedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/MessagesRepeatedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class MessagesRepeatedWriteSchemas {
  private static class MessageWriters extends AbstractWriters<Object> {
    @SuppressWarnings("unchecked")
```

### UtilityClassWithoutPrivateConstructor
Class `SInt32PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/SInt32PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt32PackedWriteSchemas {
  private static class SInt32PackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public SInt32PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed32NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/Fixed32NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed32NotPackedWriteSchemas {
  private static class Fixed32NotPackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public Fixed32NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed32PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/Fixed32PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed32PackedWriteSchemas {
  private static class Fixed32PackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public Fixed32PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Int32NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/Int32NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int32NotPackedWriteSchemas {
  private static class Int32NotPackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public Int32NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt32NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/UInt32NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt32NotPackedWriteSchemas {
  private static class UInt32NotPackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public UInt32NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt32NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/SInt32NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt32NotPackedWriteSchemas {
  private static class SInt32NotPackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public SInt32NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `BoolNotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/bools/BoolNotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BoolNotPackedWriteSchemas {
  private static class BoolNotPackedWriters extends AbstractPrimitiveWriters<boolean[], Boolean> {
    public BoolNotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed32NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/SFixed32NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed32NotPackedWriteSchemas {
  private static class SFixed32NotPackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public SFixed32NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed64NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/SFixed64NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed64NotPackedWriteSchemas {
  private static class SFixed64NotPackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public SFixed64NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt32PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/UInt32PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt32PackedWriteSchemas {
  private static class UInt32PackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public UInt32PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed32PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/ints/SFixed32PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed32PackedWriteSchemas {
  private static class SFixed32PackedWriters extends AbstractPrimitiveWriters<int[], Integer> {
    public SFixed32PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed64NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/Fixed64NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed64NotPackedWriteSchemas {
  private static class Fixed64NotPackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public Fixed64NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `BoolPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/bools/BoolPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BoolPackedWriteSchemas {
  private static class BoolPackedWriters extends AbstractPrimitiveWriters<boolean[], Boolean> {
    public BoolPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt64NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/SInt64NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt64NotPackedWriteSchemas {
  private static class SInt64NotPackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public SInt64NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Int64PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/Int64PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int64PackedWriteSchemas {
  private static class Int64PackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public Int64PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt64NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/UInt64NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt64NotPackedWriteSchemas {
  private static class UInt64NotPackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public UInt64NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `EnumNotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumNotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class EnumNotPackedWriteSchemas {
  private static class EnumNotPackedWriters extends AbstractWriters<Enum<?>> {
    private final EnumMeta enumMeta;
```

### UtilityClassWithoutPrivateConstructor
Class `EnumPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/enums/EnumPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class EnumPackedWriteSchemas {
  private static class EnumsPackedWriters extends AbstractWriters<Enum<?>> {
    private final EnumMeta enumMeta;
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed64PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/SFixed64PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed64PackedWriteSchemas {
  private static class SFixed64PackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public SFixed64PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt64PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/UInt64PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt64PackedWriteSchemas {
  private static class UInt64PackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public UInt64PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `FloatNotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/floats/FloatNotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class FloatNotPackedWriteSchemas {
  private static class FloatNotPackedWriters extends AbstractPrimitiveWriters<float[], Float> {
    public FloatNotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed64PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/Fixed64PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed64PackedWriteSchemas {
  private static class Fixed64PackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public Fixed64PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Int64NotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/Int64NotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int64NotPackedWriteSchemas {
  private static class Int64NotPackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public Int64NotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `DoubleNotPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/doubles/DoubleNotPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class DoubleNotPackedWriteSchemas {
  private static class DoubleNotPackedWriters extends AbstractPrimitiveWriters<double[], Double> {
    public DoubleNotPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `DoublePackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/doubles/DoublePackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class DoublePackedWriteSchemas {
  private static class DoublePackedWriters extends AbstractPrimitiveWriters<double[], Double> {
    public DoublePackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt64PackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/longs/SInt64PackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt64PackedWriteSchemas {
  private static class SInt64PackedWriters extends AbstractPrimitiveWriters<long[], Long> {
    public SInt64PackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt32ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/SInt32ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt32ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed64ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/Fixed64ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed64ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `FloatPackedWriteSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/floats/FloatPackedWriteSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class FloatPackedWriteSchemas {
  private static class FloatPackedWriters extends AbstractPrimitiveWriters<float[], Float> {
    public FloatPackedWriters(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `EnumsReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/EnumsReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class EnumsReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed32ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/SFixed32ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed32ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `BoolReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/BoolReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BoolReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `BytesReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/BytesReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BytesReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `DoubleReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/DoubleReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class DoubleReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `UInt64ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/UInt64ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt64ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed64ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/SFixed64ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed64ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `Int32ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/Int32ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int32ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed32ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/Fixed32ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed32ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `UInt32ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/UInt32ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt32ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `SInt64ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/SInt64ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt64ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `Int64ReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/Int64ReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int64ReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `StringReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/StringReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class StringReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `BytesRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/BytesRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BytesRepeatedReadSchemas {
  private static class BytesReaders extends AbstractReaders<byte[]> {
    public BytesReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `AnyRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/AnyRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class AnyRepeatedReadSchemas {
  private static class MessageReaders extends AbstractReaders<Object> {
    public MessageReaders(Field protoField, AnyEntrySchema anyEntrySchema) {
```

### UtilityClassWithoutPrivateConstructor
Class `FloatReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/FloatReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class FloatReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    JavaType javaType = propertyDescriptor.getJavaType();
```

### UtilityClassWithoutPrivateConstructor
Class `StringRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/StringRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class StringRepeatedReadSchemas {
  private static class StringReaders extends AbstractReaders<String> {
    public StringReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `MessageRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/MessageRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class MessageRepeatedReadSchemas {
  private static class MessageReaders extends AbstractReaders<Object> {
    public MessageReaders(Field protoField, SchemaReader<Object> elementSchema) {
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyWrapperRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/PropertyWrapperRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class PropertyWrapperRepeatedReadSchemas {
  private static class PropertyWrapperReaders extends AbstractReaders<Object> {
    public PropertyWrapperReaders(Field protoField, SchemaReader<Object> elementSchema) {
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed32NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/Fixed32NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed32NotPackedReadSchemas {
  private static class NotPackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public NotPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt32NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/UInt32NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt32NotPackedReadSchemas {
  private static class UInt32NotPackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public UInt32NotPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Int32PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/Int32PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int32PackedReadSchemas {
  private static class Int32PackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public Int32PackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt32PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/UInt32PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt32PackedReadSchemas {
  private static class UInt32PackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public UInt32PackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed32PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/Fixed32PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed32PackedReadSchemas {
  private static class Fixed32PackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public Fixed32PackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Int32NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/Int32NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int32NotPackedReadSchemas {
  private static class Int32NotPackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public Int32NotPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `RepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/RepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class RepeatedReadSchemas {
  public static <T, ELE_TYPE> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor,
      AbstractReaders<ELE_TYPE> readers) {
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed32NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/SFixed32NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed32NotPackedReadSchemas {
  private static class NotPackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public NotPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed32PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/SFixed32PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed32PackedReadSchemas {
  private static class SFixed32PackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public SFixed32PackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt32PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/SInt32PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt32PackedReadSchemas {
  private static class SInt32PackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public SInt32PackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt32NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/impl/SInt32NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt32NotPackedReadSchemas {
  private static class SInt32NotPackedReaders extends AbstractPrimitiveReaders<int[], Integer> {
    public SInt32NotPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `BoolPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/bools/impl/BoolPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BoolPackedReadSchemas {
  private static class BoolPackedReaders extends AbstractPrimitiveReaders<boolean[], Boolean> {
    public BoolPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `IntRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/ints/IntRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class IntRepeatedReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor,
      AbstractPrimitiveReaders<int[], Integer> readers) {
```

### UtilityClassWithoutPrivateConstructor
Class `BoolNotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/bools/impl/BoolNotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BoolNotPackedReadSchemas {
  private static class BoolNotPackedReaders extends AbstractPrimitiveReaders<boolean[], Boolean> {
    public BoolNotPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `EnumNotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/enums/EnumNotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class EnumNotPackedReadSchemas {
  private static class EnumNotPackedReaders extends AbstractReaders<Enum<?>> {
    private final EnumMeta enumMeta;
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed64NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/SFixed64NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed64NotPackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt64NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/SInt64NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt64NotPackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `EnumPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/enums/EnumPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class EnumPackedReadSchemas {
  private static class EnumPackedReaders extends AbstractReaders<Enum<?>> {
    private final EnumMeta enumMeta;
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed64NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/Fixed64NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed64NotPackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SFixed64PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/SFixed64PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SFixed64PackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `BoolRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/bools/BoolRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class BoolRepeatedReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor,
      AbstractPrimitiveReaders<boolean[], Boolean> readers) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt64NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/UInt64NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt64NotPackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `SInt64PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/SInt64PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class SInt64PackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Fixed64PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/Fixed64PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Fixed64PackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `UInt64PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/UInt64PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class UInt64PackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `LongRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/LongRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class LongRepeatedReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor,
      AbstractPrimitiveReaders<long[], Long> readers) {
```

### UtilityClassWithoutPrivateConstructor
Class `Int64NotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/Int64NotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int64NotPackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `FloatPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/floats/impl/FloatPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class FloatPackedReadSchemas {
  private static class FloatPackedReaders extends AbstractPrimitiveReaders<float[], Float> {
    public FloatPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `FloatNotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/floats/impl/FloatNotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class FloatNotPackedReadSchemas {
  private static class FloatNotPackedReaders extends AbstractPrimitiveReaders<float[], Float> {
    public FloatNotPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `DoubleNotPackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/doubles/impl/DoubleNotPackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class DoubleNotPackedReadSchemas {
  private static class NotPackedReaders extends AbstractPrimitiveReaders<double[], Double> {
    public NotPackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `Int64PackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/longs/impl/Int64PackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class Int64PackedReadSchemas {
  private static class Readers extends AbstractPrimitiveReaders<long[], Long> {
    public Readers(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `DoublePackedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/doubles/impl/DoublePackedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class DoublePackedReadSchemas {
  private static class DoublePackedReaders extends AbstractPrimitiveReaders<double[], Double> {
    public DoublePackedReaders(Field protoField) {
```

### UtilityClassWithoutPrivateConstructor
Class `FloatRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/floats/FloatRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class FloatRepeatedReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor,
      AbstractPrimitiveReaders<float[], Float> readers) {
```

### UtilityClassWithoutPrivateConstructor
Class `DoubleRepeatedReadSchemas` has only 'static' members, and lacks a 'private' constructor
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/impl/doubles/DoubleRepeatedReadSchemas.java`
#### Snippet
```java
import io.protostuff.runtime.FieldSchema;

public class DoubleRepeatedReadSchemas {
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor,
      AbstractPrimitiveReaders<double[], Double> readers) {
```

### UtilityClassWithoutPrivateConstructor
Class `Const` has only 'static' members, and lacks a 'private' constructor
in `service-registry/registry-local/src/main/java/org/apache/servicecomb/localregistry/Const.java`
#### Snippet
```java
package org.apache.servicecomb.localregistry;

public class Const {
  public static final String LOCAL_ENABLED = "servicecomb.local.registry.enabled";

```

### UtilityClassWithoutPrivateConstructor
Class `ConditionFactory` has only 'static' members, and lacks a 'private' constructor
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/oper/ConditionFactory.java`
#### Snippet
```java
import org.apache.servicecomb.darklaunch.DarklaunchRule;

public class ConditionFactory {
  public static final String OP_AND = "&&";

```

### UtilityClassWithoutPrivateConstructor
Class `URLMappedConfigurationLoader` has only 'static' members, and lacks a 'private' constructor
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/URLMappedConfigurationLoader.java`
#### Snippet
```java
import com.netflix.config.DynamicPropertyFactory;

public class URLMappedConfigurationLoader {
  private static final Logger LOG = LoggerFactory.getLogger(URLMappedConfigurationLoader.class);

```

### UtilityClassWithoutPrivateConstructor
Class `HttpUtils` has only 'static' members, and lacks a 'private' constructor
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/HttpUtils.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.ObjectMapper;

public final class HttpUtils {
  private static final String ALGORITHM_HMACSHA256 = "HmacSHA256";

```

### UtilityClassWithoutPrivateConstructor
Class `ServletUtils` has only 'static' members, and lacks a 'private' constructor
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/ServletUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class ServletUtils {
  private static final Logger LOGGER = LoggerFactory.getLogger(ServletUtils.class);

```

## RuleId[id=DataFlowIssue]
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
Method invocation `setAccessible` may produce `NullPointerException`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/ReflectUtils.java`
#### Snippet
```java
    Field field = ReflectionUtils.findField(cls, fieldName);
    try {
      field.setAccessible(true);
      field.set(instance, value);
    } catch (Exception e) {
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
  public static void testException(String expectMsg, Class<?> cls, String... methods) {
    Throwable exception = getException(cls, methods);
    Assertions.assertEquals(expectMsg, exception.getMessage());
  }
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
Unboxing of `ReflectionUtils.invokeMethod(getOrder, service)` may produce `NullPointerException`
in `foundations/foundation-spi/src/main/java/org/apache/servicecomb/foundation/common/utils/SPIServiceUtils.java`
#### Snippet
```java
      Method getOrder = ReflectionUtils.findMethod(service.getClass(), "getOrder");
      if (getOrder != null) {
        serviceOrder = (int) ReflectionUtils.invokeMethod(getOrder, service);
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
Argument `properties` might be null
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/parser/YamlParser.java`
#### Snippet
```java
    yamlFactory.setResources(new ByteArrayResource(content.getBytes(StandardCharsets.UTF_8)));
    Properties properties = yamlFactory.getObject();
    return Parser.propertiesToMap(properties, prefix, addPrefix);
  }
}
```

### DataFlowIssue
Method invocation `invoke` may produce `NullPointerException`
in `providers/provider-pojo/src/main/java/org/apache/servicecomb/provider/pojo/DefaultMethodMeta.java`
#### Snippet
```java
  protected MethodHandle createForJava11(Object proxy, Method method) throws Exception {
    Lookup lookup = MethodHandles.lookup();
    Lookup privateLookup = (Lookup) privateLookupIn.invoke(null, method.getDeclaringClass(), lookup);
    return privateLookup
        .unreflectSpecial(method, method.getDeclaringClass())
```

### DataFlowIssue
Method invocation `setAccessible` may produce `NullPointerException`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java

  static {
    FIELD_INSTANCE.setAccessible(true);
    FIELD_CUSTOM_CONFIGURATION_INSTALLED.setAccessible(true);
    FIELD_CONFIG.setAccessible(true);
```

### DataFlowIssue
Method invocation `setAccessible` may produce `NullPointerException`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
  static {
    FIELD_INSTANCE.setAccessible(true);
    FIELD_CUSTOM_CONFIGURATION_INSTALLED.setAccessible(true);
    FIELD_CONFIG.setAccessible(true);
    FIELD_INITIALIZED_WITH_DEFAULT_CONFIG.setAccessible(true);
```

### DataFlowIssue
Method invocation `setAccessible` may produce `NullPointerException`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
    FIELD_INSTANCE.setAccessible(true);
    FIELD_CUSTOM_CONFIGURATION_INSTALLED.setAccessible(true);
    FIELD_CONFIG.setAccessible(true);
    FIELD_INITIALIZED_WITH_DEFAULT_CONFIG.setAccessible(true);
    FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL.setAccessible(true);
```

### DataFlowIssue
Method invocation `setAccessible` may produce `NullPointerException`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
    FIELD_CUSTOM_CONFIGURATION_INSTALLED.setAccessible(true);
    FIELD_CONFIG.setAccessible(true);
    FIELD_INITIALIZED_WITH_DEFAULT_CONFIG.setAccessible(true);
    FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL.setAccessible(true);
    FIELD_DYNAMIC_PROPERTY_ALL_PROPS.setAccessible(true);
```

### DataFlowIssue
Method invocation `setAccessible` may produce `NullPointerException`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
    FIELD_CONFIG.setAccessible(true);
    FIELD_INITIALIZED_WITH_DEFAULT_CONFIG.setAccessible(true);
    FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL.setAccessible(true);
    FIELD_DYNAMIC_PROPERTY_ALL_PROPS.setAccessible(true);
  }
```

### DataFlowIssue
Method invocation `setAccessible` may produce `NullPointerException`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
    FIELD_INITIALIZED_WITH_DEFAULT_CONFIG.setAccessible(true);
    FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL.setAccessible(true);
    FIELD_DYNAMIC_PROPERTY_ALL_PROPS.setAccessible(true);
  }

```

### DataFlowIssue
Argument `FIELD_INSTANCE` might be null
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  public static void resetConfig() {
    ReflectionUtils.setField(FIELD_INSTANCE, null, null);
    ReflectionUtils.setField(FIELD_CUSTOM_CONFIGURATION_INSTALLED, null, false);
    ReflectionUtils.setField(FIELD_CONFIG, null, null);
```

### DataFlowIssue
Argument `FIELD_CUSTOM_CONFIGURATION_INSTALLED` might be null
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
  public static void resetConfig() {
    ReflectionUtils.setField(FIELD_INSTANCE, null, null);
    ReflectionUtils.setField(FIELD_CUSTOM_CONFIGURATION_INSTALLED, null, false);
    ReflectionUtils.setField(FIELD_CONFIG, null, null);
    ReflectionUtils.setField(FIELD_INITIALIZED_WITH_DEFAULT_CONFIG, null, false);
```

### DataFlowIssue
Argument `FIELD_CONFIG` might be null
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
    ReflectionUtils.setField(FIELD_INSTANCE, null, null);
    ReflectionUtils.setField(FIELD_CUSTOM_CONFIGURATION_INSTALLED, null, false);
    ReflectionUtils.setField(FIELD_CONFIG, null, null);
    ReflectionUtils.setField(FIELD_INITIALIZED_WITH_DEFAULT_CONFIG, null, false);
    ReflectionUtils.setField(FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL, null, null);
```

### DataFlowIssue
Argument `FIELD_INITIALIZED_WITH_DEFAULT_CONFIG` might be null
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
    ReflectionUtils.setField(FIELD_CUSTOM_CONFIGURATION_INSTALLED, null, false);
    ReflectionUtils.setField(FIELD_CONFIG, null, null);
    ReflectionUtils.setField(FIELD_INITIALIZED_WITH_DEFAULT_CONFIG, null, false);
    ReflectionUtils.setField(FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL, null, null);
    ((ConcurrentHashMap<String, DynamicProperty>) ReflectionUtils.getField(FIELD_DYNAMIC_PROPERTY_ALL_PROPS, null))
```

### DataFlowIssue
Argument `FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL` might be null
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
    ReflectionUtils.setField(FIELD_CONFIG, null, null);
    ReflectionUtils.setField(FIELD_INITIALIZED_WITH_DEFAULT_CONFIG, null, false);
    ReflectionUtils.setField(FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL, null, null);
    ((ConcurrentHashMap<String, DynamicProperty>) ReflectionUtils.getField(FIELD_DYNAMIC_PROPERTY_ALL_PROPS, null))
        .clear();
```

### DataFlowIssue
Argument `FIELD_DYNAMIC_PROPERTY_ALL_PROPS` might be null
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
    ReflectionUtils.setField(FIELD_INITIALIZED_WITH_DEFAULT_CONFIG, null, false);
    ReflectionUtils.setField(FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL, null, null);
    ((ConcurrentHashMap<String, DynamicProperty>) ReflectionUtils.getField(FIELD_DYNAMIC_PROPERTY_ALL_PROPS, null))
        .clear();
  }
```

### DataFlowIssue
Method invocation `clear` may produce `NullPointerException`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/config/ArchaiusUtils.java`
#### Snippet
```java
    ReflectionUtils.setField(FIELD_DYNAMIC_PROPERTY_SUPPORTIMPL, null, null);
    ((ConcurrentHashMap<String, DynamicProperty>) ReflectionUtils.getField(FIELD_DYNAMIC_PROPERTY_ALL_PROPS, null))
        .clear();
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
Method invocation `name` may produce `NullPointerException`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncClientHttpRequest.java`
#### Snippet
```java
  public ListenableFuture<ClientHttpResponse> executeAsync() {
    this.setPath(findUriPath(this.getURI()));
    this.setRequestMeta(createRequestMeta(this.getMethod().name(), this.getURI()));
    QueryStringDecoder queryStringDecoder = new QueryStringDecoder(this.getURI().getRawSchemeSpecificPart());
    this.setQueryParams(queryStringDecoder.parameters());
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

## RuleId[id=SimplifyStreamApiCallChains]
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
Can be replaced with 'java.util.ArrayList' constructor
in `service-registry/registry-local/src/main/java/org/apache/servicecomb/localregistry/LocalRegistryStore.java`
#### Snippet
```java

  public List<Microservice> getAllMicroservices() {
    return microserviceMap.values().stream().collect(Collectors.toList());
  }

```

## RuleId[id=MissingSerialAnnotation]
### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/log/AbstractMarker.java`
#### Snippet
```java

public abstract class AbstractMarker implements Marker {
  private static final long serialVersionUID = -1L;

  @Override
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
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/json/PartModule.java`
#### Snippet
```java

public class PartModule extends SimpleModule implements SPIOrder {
  private static final long serialVersionUID = 4201325332650814739L;

  public PartModule() {
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
in `core/src/main/java/org/apache/servicecomb/core/tracing/ScbMarker.java`
#### Snippet
```java

public class ScbMarker extends AbstractMarker {
  private static final long serialVersionUID = -1L;

  private static final String MARKER_NAME = "SERVICECOMB_MARKER";
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
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/exception/OperationException.java`
#### Snippet
```java
public class OperationException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public OperationException() {
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
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/ClientException.java`
#### Snippet
```java
public class ClientException extends Exception {

  private static final long serialVersionUID = 4579811019552389524L;

  public ClientException(String message) {
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
in `service-registry/registry-lightweight/src/main/java/org/apache/servicecomb/registry/lightweight/RegisterException.java`
#### Snippet
```java

public class RegisterException extends RuntimeException {
  private static final long serialVersionUID = 4130899909889771251L;

  public RegisterException(String message) {
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
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/MessageObjectMapper.java`
#### Snippet
```java

public class MessageObjectMapper extends ObjectMapper {
  private static final long serialVersionUID = 189026839992490564L;

  public MessageObjectMapper() {
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

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `convertValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/FormProcessorCreator.java`
#### Snippet
```java
    }

    public Object convertValue(Converter converter, Object value) {
      if (value == null || converter == null) {
        return value;
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/main/java/org/apache/servicecomb/core/filter/InvocationFilterChains.java`
#### Snippet
```java
      List<Filter> serviceFilters = filters.entrySet().stream()
          .filter(e -> e.getValue().isEnabledForMicroservice(microserviceName))
          .map(e -> e.getValue())
          .collect(Collectors.toList());
      serviceFilters.sort(Comparator.comparingInt(a -> a.getOrder(invocationType, microserviceName)));
```

## RuleId[id=PatternVariableCanBeUsed]
### PatternVariableCanBeUsed
Variable 'strValue' can be replaced with pattern variable
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/CertificateUtil.java`
#### Snippet
```java
            if (key instanceof Integer && value instanceof String) {
              int intKey = (Integer) key;
              String strValue = (String) value;
              if (intKey == SUBALTNAME_DNSNAME || intKey == SUBALTNAME_IPADDRESS) {
                names.add(strValue);
```

### PatternVariableCanBeUsed
Variable 'formParameter' can be replaced with pattern variable
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java
    }

    FormParameter formParameter = (FormParameter) parameter;
    if (FileProperty.isType(formParameter.getType(), formParameter.getFormat())) {
      return true;
```

### PatternVariableCanBeUsed
Variable 'tagItem' can be replaced with pattern variable
in `governance/src/main/java/org/apache/servicecomb/router/model/TagItem.java`
#### Snippet
```java
      return false;
    }
    TagItem tagItem = (TagItem) o;
    return Objects.equals(getVersion(), tagItem.getVersion()) &&
        Objects.equals(getParam(), tagItem.getParam());
```

### PatternVariableCanBeUsed
Variable 'compositePropertySource' can be replaced with pattern variable
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java
    if (propertySource instanceof CompositePropertySource) {
      // recursively get EnumerablePropertySource
      CompositePropertySource compositePropertySource = (CompositePropertySource) propertySource;
      compositePropertySource.getPropertySources().forEach(ps -> getProperties(ps, allKeys));
      return;
```

### PatternVariableCanBeUsed
Variable 'enumerablePropertySource' can be replaced with pattern variable
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java
    }
    if (propertySource instanceof EnumerablePropertySource) {
      EnumerablePropertySource<?> enumerablePropertySource = (EnumerablePropertySource<?>) propertySource;
      Collections.addAll(allKeys, enumerablePropertySource.getPropertyNames());
      return;
```

### PatternVariableCanBeUsed
Variable 'configurableEnvironment' can be replaced with pattern variable
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java
    }

    ConfigurableEnvironment configurableEnvironment = (ConfigurableEnvironment) environment;

    for (PropertySource<?> propertySource : configurableEnvironment.getPropertySources()) {
```

### PatternVariableCanBeUsed
Variable 'ce' can be replaced with pattern variable
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
      return;
    }
    ConfigurableEnvironment ce = (ConfigurableEnvironment) environment;
    if (configCenterConfigurationSource == null) {
      return;
```

### PatternVariableCanBeUsed
Variable 'compositePropertySource' can be replaced with pattern variable
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
    if (propertySource instanceof CompositePropertySource) {
      // recursively get EnumerablePropertySource
      CompositePropertySource compositePropertySource = (CompositePropertySource) propertySource;
      compositePropertySource.getPropertySources().forEach(ps -> getProperties(environment, ps, configFromSpringBoot));
      return;
```

### PatternVariableCanBeUsed
Variable 'enumerablePropertySource' can be replaced with pattern variable
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
    }
    if (propertySource instanceof EnumerablePropertySource) {
      EnumerablePropertySource<?> enumerablePropertySource = (EnumerablePropertySource<?>) propertySource;
      for (String propertyName : enumerablePropertySource.getPropertyNames()) {
        try {
```

### PatternVariableCanBeUsed
Variable 'configurableEnvironment' can be replaced with pattern variable
in `core/src/main/java/org/apache/servicecomb/core/ConfigurationSpringInitializer.java`
#### Snippet
```java
    }

    ConfigurableEnvironment configurableEnvironment = (ConfigurableEnvironment) environment;

    if (ignoreResolveFailure()) {
```

### PatternVariableCanBeUsed
Variable 'queue' can be replaced with pattern variable
in `core/src/main/java/org/apache/servicecomb/core/executor/ThreadPoolExecutorEx.java`
#### Snippet
```java
    } catch (RejectedExecutionException e) {
      if (getQueue() instanceof LinkedBlockingQueueEx) {
        final LinkedBlockingQueueEx queue = (LinkedBlockingQueueEx) getQueue();
        if (!queue.force(command)) {
          throw new RejectedExecutionException("thread pool queue is full");
```

### PatternVariableCanBeUsed
Variable 'invocationException' can be replaced with pattern variable
in `core/src/main/java/org/apache/servicecomb/core/governance/ServiceCombCircuitBreakerExtension.java`
#### Snippet
```java
  public boolean isFailedResult(Throwable e) {
    if (e instanceof InvocationException) {
      InvocationException invocationException = (InvocationException) e;
      if (invocationException.getStatusCode() == Status.SERVICE_UNAVAILABLE.getStatusCode() ||
          invocationException.getStatusCode() == Status.BAD_GATEWAY.getStatusCode() ||
```

### PatternVariableCanBeUsed
Variable 'resp' can be replaced with pattern variable
in `core/src/main/java/org/apache/servicecomb/core/governance/ServiceCombCircuitBreakerExtension.java`
#### Snippet
```java
      return null;
    }
    Response resp = (Response) result;
    if (resp.isFailed()) {
      if (resp.getResult() instanceof InvocationException) {
```

### PatternVariableCanBeUsed
Variable 'invocationException' can be replaced with pattern variable
in `core/src/main/java/org/apache/servicecomb/core/governance/ServiceCombRetryExtension.java`
#### Snippet
```java
  public boolean isFailedResult(Throwable e) {
    if (e instanceof InvocationException) {
      InvocationException invocationException = (InvocationException) e;
      if (invocationException.getStatusCode() == Status.SERVICE_UNAVAILABLE.getStatusCode() ||
          invocationException.getStatusCode() == Status.BAD_GATEWAY.getStatusCode() ||
```

### PatternVariableCanBeUsed
Variable 'resp' can be replaced with pattern variable
in `core/src/main/java/org/apache/servicecomb/core/governance/ServiceCombRetryExtension.java`
#### Snippet
```java
      return null;
    }
    Response resp = (Response) result;
    if (resp.isFailed()) {
      if (resp.getResult() instanceof InvocationException) {
```

### PatternVariableCanBeUsed
Variable 'contextInternal' can be replaced with pattern variable
in `transports/transport-rest/transport-rest-vertx/src/main/java/org/apache/servicecomb/transport/rest/vertx/RestBodyHandler.java`
#### Snippet
```java
      }
      if (context instanceof RoutingContextInternal) {
        RoutingContextInternal contextInternal = (RoutingContextInternal) context;
        contextInternal.setBody(body);
      }
```

### PatternVariableCanBeUsed
Variable 'invocationException' can be replaced with pattern variable
in `transports/transport-rest/transport-rest-vertx/src/main/java/org/apache/servicecomb/transport/rest/vertx/VertxRestDispatcher.java`
#### Snippet
```java
  private void sendExceptionByRoutingContext(RoutingContext context, Throwable e) {
    if (e instanceof InvocationException) {
      InvocationException invocationException = (InvocationException) e;
      context.response().putHeader(HttpHeaders.CONTENT_TYPE, MediaType.WILDCARD)
          .setStatusCode(invocationException.getStatusCode()).setStatusMessage(invocationException.getReasonPhrase())
```

### PatternVariableCanBeUsed
Variable 'exception' can be replaced with pattern variable
in `transports/transport-rest/transport-rest-vertx/src/main/java/org/apache/servicecomb/transport/rest/vertx/RestServerVerticle.java`
#### Snippet
```java
          if (ctx.failure() instanceof InvocationException) {
            // ServiceComb defined exception
            InvocationException exception = (InvocationException) ctx.failure();
            response.setStatusCode(exception.getStatusCode());
            response.setStatusMessage(exception.getReasonPhrase());
```

### PatternVariableCanBeUsed
Variable 'contextInternal' can be replaced with pattern variable
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/VertxServerRequestToHttpServletRequest.java`
#### Snippet
```java
    super.setBodyBuffer(bodyBuffer);
    if (context instanceof RoutingContextInternal) {
      RoutingContextInternal contextInternal = (RoutingContextInternal) context;
      contextInternal.setBody(bodyBuffer);
    }
```

### PatternVariableCanBeUsed
Variable 'bodyParameter' can be replaced with pattern variable
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestOperationMeta.java`
#### Snippet
```java
      return type;
    }
    final BodyParameter bodyParameter = (BodyParameter) parameter;
    if (!(bodyParameter.getSchema() instanceof ModelImpl)) {
      return type;
```

### PatternVariableCanBeUsed
Variable 'configuration' can be replaced with pattern variable
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigUtil.java`
#### Snippet
```java
  public static Object getProperty(Object config, String key) {
    if (config instanceof Configuration) {
      Configuration configuration = (Configuration) config;
      return configuration.getProperty(key);
    }
```

### PatternVariableCanBeUsed
Variable 'modelImpl' can be replaced with pattern variable
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/ModelAdapter.java`
#### Snippet
```java
  public boolean isJavaLangObject() {
    if (model instanceof ModelImpl) {
      ModelImpl modelImpl = (ModelImpl) model;
      return Objects.equals(ObjectProperty.TYPE, modelImpl.getType())
          && modelImpl.getProperties() == null
```

### PatternVariableCanBeUsed
Variable 'modelImpl' can be replaced with pattern variable
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/BodyParameterAdapter.java`
#### Snippet
```java
  public boolean isJavaLangObject() {
    if (model instanceof ModelImpl) {
      ModelImpl modelImpl = (ModelImpl) model;
      return (ObjectProperty.TYPE.equals(modelImpl.getType())
          && modelImpl.getProperties() == null
```

### PatternVariableCanBeUsed
Variable 'model' can be replaced with pattern variable
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java
  private boolean isDownload(Operation operation) {
    if (operation.getResponses().get("200").getResponseSchema() instanceof ModelImpl) {
      ModelImpl model = (ModelImpl) operation.getResponses().get("200").getResponseSchema();
      if ("file".equals(model.getType())) {
        return true;
```

### PatternVariableCanBeUsed
Variable 'exception' can be replaced with pattern variable
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/AbstractEdgeDispatcher.java`
#### Snippet
```java

    if (context.failure() instanceof InvocationException) {
      InvocationException exception = (InvocationException) context.failure();
      response.setStatusCode(exception.getStatusCode());
      response.setStatusMessage(exception.getReasonPhrase());
```

### PatternVariableCanBeUsed
Variable 'serializableParameter' can be replaced with pattern variable
in `swagger/swagger-generator/generator-jaxrs/src/main/java/org/apache/servicecomb/swagger/generator/jaxrs/JaxrsOperationGenerator.java`
#### Snippet
```java
    }

    AbstractSerializableParameter<?> serializableParameter = (AbstractSerializableParameter<?>) parameter;
    if (serializableParameter.getDefault() == null && !parameter.getRequired()) {
      serializableParameter.setDefaultValue(String.valueOf(Defaults.defaultValue(type.getRawClass())));
```

### PatternVariableCanBeUsed
Variable 'token' can be replaced with pattern variable
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/RSAAuthenticationToken.java`
#### Snippet
```java
      return false;
    }
    RSAAuthenticationToken token = (RSAAuthenticationToken) obj;
    if (!token.plainToken().equals(this.plainToken())) {
      return false;
```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/BufferInputStream.java`
#### Snippet
```java

  @Override
  public void reset() throws IOException {
    byteBuf.resetReaderIndex();
  }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseClientHttpResponse.java`
#### Snippet
```java

    @Override
    public void reset() throws IOException {
    }
  };
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseClientHttpResponse.java`
#### Snippet
```java

    @Override
    public void mark(int readlimit) {
    }

```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getEntityClass()` during object construction
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java
    representer.getPropertyUtils().setSkipMissingProperties(true);
    GovernanceEventManager.register(this);
    entityClass = getEntityClass();
  }

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'faultResponse' in a Serializable class
in `governance/src/main/java/org/apache/servicecomb/governance/processor/injection/FaultInjectionException.java`
#### Snippet
```java
  private static final long serialVersionUID = 1675558351029273343L;

  private final FaultResponse faultResponse;

  public FaultInjectionException(FaultResponse faultResponse) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'errorData' in a Serializable class
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/InvocationException.java`
#### Snippet
```java
  private final StatusType status;

  private final Object errorData;

  public InvocationException(StatusType status, Object errorData) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'servletRestServer' in a Serializable class
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/RestServlet.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(RestServlet.class);

  private final ServletRestDispatcher servletRestServer = new ServletRestDispatcher();

  @Override
```

## RuleId[id=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `governance/src/main/java/org/apache/servicecomb/governance/marker/operator/CompareOperator.java`
#### Snippet
```java
      throw new IllegalArgsOperatorException("operator " + charStr + numStr + " is illegal.");
    }
    switch (charStr) {
      case ">":
        return target > result;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractOperationGenerator.java`
#### Snippet
```java

  protected Parameter createParameter(HttpParameterType httpParameterType) {
    switch (httpParameterType) {
      case PATH:
        return new PathParameter();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `core/src/main/java/org/apache/servicecomb/core/BootListener.java`
#### Snippet
```java

  default void onBootEvent(BootEvent event) {
    switch (event.eventType) {
      case BEFORE_FILTER:
        onBeforeFilter(event);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `core/src/main/java/org/apache/servicecomb/core/SCBEngine.java`
#### Snippet
```java
    for (; ; ) {
      SCBStatus currentStatus = getStatus();
      switch (currentStatus) {
        case DOWN:
        case FAILED:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/server/TcpParser.java`
#### Snippet
```java

  protected void onParse(Buffer buffer) {
    switch (status) {
      case TCP_HEADER:
        ByteBuf buf = buffer.getByteBuf();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `handlers/handler-flowcontrol-qps/src/main/java/org/apache/servicecomb/qps/strategy/DefaultStrategyFactory.java`
#### Snippet
```java

  public AbstractQpsStrategy createStrategy(String strategyName) {
    switch (strategyName) {
      case "TokenBucket":
        return new TokenBucketStrategy();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `clients/config-kie-client/src/main/java/org/apache/servicecomb/config/kie/client/KieClient.java`
#### Snippet
```java
    Map<String, Object> kvMap = new HashMap<>();
    try {
      switch (valueType) {
        case yml:
        case yaml:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
    for (int i = braceIndex + 1; i < pathLength; i++) {
      final char c = path.charAt(i);
      switch (c) {
        case '{':
          throw new Exception("A variable must not contain an extra '{' in \""
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
    for (int i = 0; i < pathLength; i++) {
      final char c = path.charAt(i);
      switch (c) {
        case '{':
          i = processGroup(path, i, pathPattern);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/MicroserviceWatchTask.java`
#### Snippet
```java

  private void onMicroserviceInstanceChanged(MicroserviceInstanceChangedEvent changedEvent) {
    switch (changedEvent.getAction()) {
      case CREATE:
        LOGGER.info("microservice {}/{}/{} REGISTERED an instance {}, {}.",
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/RegistryUtils.java`
#### Snippet
```java
  public static MicroserviceInstances convertCacheToMicroserviceInstances(MicroserviceCache microserviceCache) {
    MicroserviceInstances microserviceInstances = new MicroserviceInstances();
    switch (microserviceCache.getStatus()) {
      case SERVICE_NOT_FOUND:
        microserviceInstances.setMicroserviceNotExist(true);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/parser/Parser.java`
#### Snippet
```java

  static Parser findParser(String contentType) {
    switch (contentType) {
      case CONTENT_TYPE_YAML:
        return yamlParser;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObjectFactory.java`
#### Snippet
```java

    Class<?> fieldCls = field.getType();
    switch (fieldCls.getName()) {
      case "int":
        return createIntProperty(field, keys, 0);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/HighwayServerConnection.java`
#### Snippet
```java
    }

    switch (requestHeader.getMsgType()) {
      case MsgType.REQUEST:
        onRequest(msgId, requestHeader, bodyBuffer);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
            try {
              mInstances.setRevision(response.getHeader("X-Resource-Revision"));
              switch (response.statusCode()) {
                case 304:
                  mInstances.setNeedRefresh(false);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `foundations/foundation-protobuf/src/main/java/io/protostuff/runtime/FieldTypeUtils.java`
#### Snippet
```java

    if (fieldType.isScalar()) {
      switch ((ScalarFieldType) fieldType) {
        case INT32:
          return FieldType.INT32;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java
   */
  public boolean skipField(final int tag) throws IOException {
    switch (getTagWireType(tag)) {
      case WIRETYPE_VARINT:
        readInt32();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java
  private String findBaseType(String swaggerType, String swaggerFmt) {
    String key = swaggerType + ":" + swaggerFmt;
    switch (key) {
      case "boolean:null":
        return "bool";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/SerializerSchemaManager.java`
#### Snippet
```java
    }

    switch ((ScalarFieldType) protoField.getType()) {
      case INT32:
        return Int32WriteSchemas.create(protoField, propertyDescriptor);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/SerializerSchemaManager.java`
#### Snippet
```java

    if (protoField.getType().isScalar()) {
      switch ((ScalarFieldType) protoField.getType()) {
        case INT32:
          return packed ? Int32PackedWriteSchemas.create(protoField, propertyDescriptor) :
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/DeserializerSchemaManager.java`
#### Snippet
```java
    }

    switch ((ScalarFieldType) protoField.getType()) {
      case INT32:
        return Int32ReadSchemas.create(protoField, propertyDescriptor);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/DeserializerSchemaManager.java`
#### Snippet
```java

    if (protoField.getType().isScalar()) {
      switch ((ScalarFieldType) protoField.getType()) {
        case INT32:
          return packed ? Int32PackedReadSchemas.create(protoField, propertyDescriptor) :
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/oper/ConditionFactory.java`
#### Snippet
```java

  private static Condition buildCondition(int index, String key, String value) {
    switch (index) {
      case 0:
        return new GreaterOrEqualCondition(key, value);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/element/impl/RequestProtocolAccessItem.java`
#### Snippet
```java

  private String getStringVersion(HttpVersion version) {
    switch (version) {
      case HTTP_2:
        return "HTTP/2.0";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/HttpRequest.java`
#### Snippet
```java
    HttpUriRequest httpUriRequest = null;

    switch (method) {
      case GET: {
        httpUriRequest = new HttpGet(url);
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
      switch (c) {
        case '{':
          i = processGroup(path, i, pathPattern);
          groupCount++;
          break;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/oper/LikeCondition.java`
#### Snippet
```java
        regExp.append(Pattern.quote(new String(cs, lastPos, i - lastPos)));
        regExp.append(".");
        lastPos = i = 1;
      }
    }
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/diagnosis/instance/InstanceCacheChecker.java`
#### Snippet
```java
  private final AppManager appManager;

  private final Set<Status> statuses = new HashSet<>();

  private final InstanceCacheSummary instanceCacheSummary = new InstanceCacheSummary();
```

## RuleId[id=Java9CollectionFactory]
### Java9CollectionFactory
Can be replaced with 'Map.of()' call
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/TokenAuthHeaderProvider.java`
#### Snippet
```java
    HashMap<String, String> header = new HashMap<>();
    header.put("Authorization", "Bearer " + token);
    return Collections.unmodifiableMap(header);
  }
}
```

### Java9CollectionFactory
Can be replaced with 'List.copyOf()' call
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/RefreshableMicroserviceCache.java`
#### Snippet
```java
          mergedInstance.getEndpoints());
    }
    instances = Collections.unmodifiableList(new ArrayList<>(mergedInstances));
    revisionId = rev;
  }
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/OperationLocator.java`
#### Snippet
```java
      String remainPath = resource.getAbsolutePathRegExp().match(path, pathVarMap);
      // 刚好匹配，不多也不少
      if ("".equals(remainPath)) {
        resourceFound = true;
        if (checkHttpMethod(resource, httpMethod)) {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestOperationMeta.java`
#### Snippet
```java

  protected PathRegExp createPathRegExp(String path) {
    if (path == null || path.equals("")) {
      throw new Error("null rest url is not supported");
    }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/MicroserviceRegisterTask.java`
#### Snippet
```java
          localSchemaContent);
      String diffStringLocal = StringUtils.difference(scSchemaContent, localSchemaContent);
      if (diffStringLocal.equals("")) {
        LOGGER.warn("Some APIs are deleted in local schema which are present in service center schema \n");
      } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tracing/tracing-zipkin/src/main/java/org/apache/servicecomb/tracing/zipkin/ZipkinSpanAspect.java`
#### Snippet
```java
    Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
    LOG.debug("Generating zipkin span for method {}", method.toString());
    if ("".equals(spanName)) {
      spanName = method.getName();
    }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tracing/tracing-zipkin/src/main/java/org/apache/servicecomb/tracing/zipkin/ZipkinSpanAspect.java`
#### Snippet
```java
      spanName = method.getName();
    }
    if ("".equals(callPath)) {
      callPath = method.toString();
    }
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `objMap` accessed in synchronized context
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/AbstractObjectManager.java`
#### Snippet
```java
    if (value == null) {
      synchronized (lockObj) {
        value = objMap.get(key);
        if (value == null) {
          value = create(keyOwner);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `objMap` accessed in synchronized context
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/AbstractObjectManager.java`
#### Snippet
```java
            return null;
          }
          objMap.put(key, value);
        }
      }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `versions` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
  public <T extends MicroserviceVersion> T getVersion(String serviceId) {
    synchronized (lock) {
      return (T) versions.get(serviceId);
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `versions` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
  public void destroy() {
    synchronized (lock) {
      for (MicroserviceVersion microserviceVersion : versions.values()) {
        microserviceVersion.destroy();
      }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `versions` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
  public Map<String, MicroserviceVersion> getVersions() {
    synchronized (lock) {
      return versions;
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instances` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
  private void setInstances(List<MicroserviceInstance> pulledInstances, String rev) {
    synchronized (lock) {
      MergedInstances mergedInstances = mergeInstances(pulledInstances, instances);
      instances = mergedInstances.instanceIdMap.values();
      // clear cache
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instances` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
    synchronized (lock) {
      MergedInstances mergedInstances = mergeInstances(pulledInstances, instances);
      instances = mergedInstances.instanceIdMap.values();
      // clear cache
      versions.forEach((key, value) -> value.setInstances(new ArrayList<>()));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `versions` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
      instances = mergedInstances.instanceIdMap.values();
      // clear cache
      versions.forEach((key, value) -> value.setInstances(new ArrayList<>()));
      for (Entry<String, List<MicroserviceInstance>> entry : mergedInstances.microserviceIdMap.entrySet()) {
        // always update microservice versions, because we allow microservice info override, like schema info
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `versions` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
        MicroserviceVersion newVersion = createMicroserviceVersion(entry.getKey(), entry.getValue());
        newVersion.setInstances(entry.getValue());
        versions.put(entry.getKey(), newVersion);
      }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `versionRules` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
      }

      for (MicroserviceVersionRule microserviceVersionRule : versionRules.values()) {
        microserviceVersionRule.update(versions, instances);
      }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `versions` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java

      for (MicroserviceVersionRule microserviceVersionRule : versionRules.values()) {
        microserviceVersionRule.update(versions, instances);
      }
      revision = rev;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instances` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java

      for (MicroserviceVersionRule microserviceVersionRule : versionRules.values()) {
        microserviceVersionRule.update(versions, instances);
      }
      revision = rev;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `revision` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
        microserviceVersionRule.update(versions, instances);
      }
      revision = rev;
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `versionRules` accessed in synchronized context
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersions.java`
#### Snippet
```java
    if (microserviceVersionRule == null) {
      synchronized (lock) {
        microserviceVersionRule = versionRules.computeIfAbsent(versionRule, this::createAndInitMicroserviceVersionRule);
      }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `microserviceConfig` accessed in synchronized context
in `core/src/main/java/org/apache/servicecomb/core/definition/MicroserviceVersionsMeta.java`
#### Snippet
```java
    if (microserviceConfig == null) {
      synchronized (this) {
        if (microserviceConfig == null) {
          this.microserviceConfig = scbEngine.getPriorityPropertyManager()
              .createConfigObject(MicroserviceConfig.class, "service", microserviceName);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.microserviceConfig` accessed in synchronized context
in `core/src/main/java/org/apache/servicecomb/core/definition/MicroserviceVersionsMeta.java`
#### Snippet
```java
      synchronized (this) {
        if (microserviceConfig == null) {
          this.microserviceConfig = scbEngine.getPriorityPropertyManager()
              .createConfigObject(MicroserviceConfig.class, "service", microserviceName);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.consumerMeta` accessed in synchronized context
in `providers/provider-pojo/src/main/java/org/apache/servicecomb/provider/pojo/PojoConsumerMetaRefresher.java`
#### Snippet
```java
      synchronized (this) {
        if (isNeedRefresh()) {
          this.consumerMeta = refreshMeta();
        }
      }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/definition/OperationProtobuf.java`
#### Snippet
```java

@SuppressWarnings("rawtypes")
public class OperationProtobuf {
  private RequestRootSerializer requestRootSerializer;

```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/servicecomb/core/invocation/InvocationTimeoutBootListener.java`
#### Snippet
```java

@SuppressWarnings({"UnstableApiUsage", "unused"})
public class InvocationTimeoutBootListener {
  private static final Logger LOGGER = LoggerFactory.getLogger(InvocationTimeoutBootListener.class);

```

### RedundantSuppression
Redundant suppression
in `dynamic-config/config-nacos/src/main/java/org/apache/servicecomb/config/nacos/client/NacosClient.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    void refreshConfig() {
      Properties properties = new Properties();
      properties.put("serverAddr", NacosConfig.INSTANCE.getServerAddr());
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/IOUtils.java`
#### Snippet
```java
public class IOUtils {
  @SuppressWarnings("deprecation")
  public static void closeQuietly(final Closeable closeable) {
    org.apache.commons.io.IOUtils.closeQuietly(closeable);
  }
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/LambdaMetafactoryUtils.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static Getter<Object, Object> createObjectGetter(Method getMethod) {
    return createLambda(getMethod, Getter.class);
  }
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConcurrentMapConfigurationExt.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class ConcurrentMapConfigurationExt extends ConcurrentMapConfiguration {
  public ConcurrentMapConfigurationExt() {
    super();
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/DynamicConfigurationExt.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class DynamicConfigurationExt extends DynamicConfiguration {
  public DynamicConfigurationExt(PolledConfigurationSource source, AbstractPollingScheduler scheduler) {
    super();
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/DynamicWatchedConfigurationExt.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class DynamicWatchedConfigurationExt extends ConcurrentMapConfiguration implements WatchedUpdateListener {

  private final boolean ignoreDeletesFromSource;
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/RootDeserializer.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public T deserialize(byte[] bytes) throws IOException {
    InputEx input = new ByteArrayInputEx(bytes);
    T instance = schema.newMessage();
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/AbstractPrimitiveReaders.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractPrimitiveReaders(Field protoField) {
    super(protoField);
  }
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/AbstractReaders.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractReaders(Field protoField) {
    this(protoField, null);
  }
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/AbstractPrimitiveWriters.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractPrimitiveWriters(Field protoField) {
    super(protoField);

```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/AbstractWriters.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractWriters(Field protoField) {
    this(protoField, null);
  }
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/RepeatedWriteSchemas.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public DynamicSchema(Field protoField, PropertyDescriptor propertyDescriptor,
        AbstractWriters<ELE_TYPE> writers) {
      super(protoField, propertyDescriptor.getJavaType());
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/RepeatedWriteSchemas.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public final void writeTo(OutputEx output, Object value) throws IOException {
      writers.dynamicWriteTo(output, value);
    }
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/AnyRepeatedWriteSchemas.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor,
      FieldSchema<T> anySchema) {
    return RepeatedWriteSchemas.create(protoField, propertyDescriptor, new AnyWriters<>(protoField, anySchema));
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/BytesRepeatedWriteSchemas.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    return RepeatedWriteSchemas.create(protoField, propertyDescriptor, new BytesWriters(protoField));
  }
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/MessagesRepeatedWriteSchemas.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor,
      SchemaWriter<Object> elementSchema) {
    return RepeatedWriteSchemas.create(protoField, propertyDescriptor, new MessageWriters(protoField, elementSchema));
```

### RedundantSuppression
Redundant suppression
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/impl/StringsRepeatedWriteSchemas.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static <T> FieldSchema<T> create(Field protoField, PropertyDescriptor propertyDescriptor) {
    return RepeatedWriteSchemas.create(protoField, propertyDescriptor, new StringWriters(protoField));
  }
```

### RedundantSuppression
Redundant suppression
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/consumer/ConsumerTokenManager.java`
#### Snippet
```java
    }

    @SuppressWarnings("deprecation")
    String randomCode = org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(128);
    long generateTime = System.currentTimeMillis();
    try {
```

### RedundantSuppression
Redundant suppression
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public CommonToHttpServletRequest(Map<String, String> pathParams, Map<String, List<String>> queryParams,
      Map<String, List<String>> httpHeaders, Object bodyObject, boolean isFormData) {
    this(pathParams, queryParams, httpHeaders, bodyObject, isFormData, null);
```

### RedundantSuppression
Redundant suppression
in `service-registry/registry-lightweight/src/main/java/org/apache/servicecomb/registry/lightweight/AbstractLightweightDiscovery.java`
#### Snippet
```java

@SuppressWarnings("UnstableApiUsage")
public abstract class AbstractLightweightDiscovery implements Discovery, InitializingBean {
  protected EventBus eventBus;

```

### RedundantSuppression
Redundant suppression
in `service-registry/registry-lightweight/src/main/java/org/apache/servicecomb/registry/lightweight/AbstractLightweightRegistration.java`
#### Snippet
```java

@SuppressWarnings("UnstableApiUsage")
public abstract class AbstractLightweightRegistration implements Registration {
  private static final Logger LOGGER = LoggerFactory.getLogger(AbstractLightweightRegistration.class);

```

### RedundantSuppression
Redundant suppression
in `service-registry/registry-zero-config/src/main/java/org/apache/servicecomb/zeroconfig/multicast/Multicast.java`
#### Snippet
```java

  @SuppressWarnings("UnstableApiUsage")
  private InetSocketAddress initBindAddress(Config config) {
    HostAndPort hostAndPort = HostAndPort.fromString(config.getMulticastAddress());
    return new InetSocketAddress(hostAndPort.getHost(), hostAndPort.getPort());
```

### RedundantSuppression
Redundant suppression
in `service-registry/registry-zero-config/src/main/java/org/apache/servicecomb/zeroconfig/multicast/MulticastRegistration.java`
#### Snippet
```java

@SuppressWarnings("UnstableApiUsage")
public class MulticastRegistration extends AbstractZeroConfigRegistration implements InitializingBean {
  private static final String NAME = "zero-config-multicast";

```

### RedundantSuppression
Redundant suppression
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractSwaggerGenerator.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractSwaggerGenerator(Class<?> cls) {
    this.swagger = new Swagger();
    this.cls = cls;
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `QueryCodecsUtils` has only 'static' members, and a 'public' constructor
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/query/QueryCodecsUtils.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class QueryCodecsUtils {
  // create a default instance, so that more friendly to UT
  private static QueryCodecs queryCodecs = QueryCodecs.createForTest();
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
in `huawei-cloud/servicestage/src/main/java/org/apache/servicecomb/huaweicloud/servicestage/AKSKAuthHeaderProvider.java`
#### Snippet
```java
    }
    try {
      return URLEncoder.encode(project, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      return project;
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
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/HttpUtils.java`
#### Snippet
```java
      return "";
    }
    return URLEncoder.encode(value, "UTF-8");
  }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/TrustManagerExt.java`
#### Snippet
```java
        char[] buffer = new char[WHITE_SIZE];
        int len = reader.read(buffer);
        String[] cns = new String(buffer, 0, len).split("\\s+");
        X509Certificate owner = CertificateUtil.findOwner(chain);
        Set<String> certCN = CertificateUtil.getCN(owner);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `governance/src/main/java/org/apache/servicecomb/governance/policy/AbstractPolicy.java`
#### Snippet
```java
      return defaultValue;
    }
    if (time.matches(GovernanceUtils.DIGIT_REGEX)) {
      if (Long.parseLong(time) < 0) {
        throw new RuntimeException("The value of time should not be less than 0.");
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `governance/src/main/java/org/apache/servicecomb/governance/policy/CircuitBreakerPolicy.java`
#### Snippet
```java
      return DEFAULT_SLIDING_WINDOW_SIZE;
    }
    if (slidingWindowSize.matches(GovernanceUtils.DIGIT_REGEX)) {
      if (Long.parseLong(slidingWindowSize) < 0) {
        throw new RuntimeException("The value should be more than 0.");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/servicecomb/core/governance/MatchType.java`
#### Snippet
```java
  private static String concatAbsolutePath(String basePath, String operationPath) {
    return ("/" + nonNullify(basePath) + "/" + nonNullify(operationPath))
        .replaceAll("/{2,}", "/");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `handlers/handler-tracing-zipkin/src/main/java/org/apache/servicecomb/tracing/zipkin/TracingConfiguration.java`
#### Snippet
```java
                DEFAULT_TRACING_COLLECTOR_ADDRESS)
            .trim()
            .replaceAll("/+$", "")
            .concat(path));
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestOperationMeta.java`
#### Snippet
```java
  private String concatPath(String basePath, String operationPath) {
    return ("/" + nonNullify(basePath) + "/" + nonNullify(operationPath) + "/")
        .replaceAll("/{2,}", "/");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MetricsMonitorDataProvider.java`
#### Snippet
```java
          interfaceInfo.setTotal(
              doubleToInt(interfaceInfo.getTotal() + 10 * stageTotal.getTps()));
          if (perfGroup.getStatus().matches(CODE_SUCCESS)) {
            interfaceInfo.setQps(stageTotal.getTps());
            interfaceInfo.setLatency(doubleToInt(stageTotal.calcMsLatency()));
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MetricsMonitorDataProvider.java`
#### Snippet
```java
          interfaceInfo.setTotal(
              doubleToInt(interfaceInfo.getTotal() + 10 * stageTotal.getTps()));
          if (perfGroup.getStatus().matches(CODE_SUCCESS)) {
            interfaceInfo.setQps(stageTotal.getTps());
            interfaceInfo.setLatency(doubleToInt(stageTotal.calcMsLatency()));
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MetricsMonitorDataProvider.java`
#### Snippet
```java
          interfaceInfo.setTotal(
              doubleToInt(interfaceInfo.getTotal() + 10 * stageTotal.getTps()));
          if (perfGroup.getStatus().matches(CODE_SUCCESS)) {
            interfaceInfo.setQps(stageTotal.getTps());
            interfaceInfo.setLatency(doubleToInt(stageTotal.calcMsLatency()));
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/meter/LatencyDistributionConfig.java`
#### Snippet
```java
    }
    config = config.trim() + "," + Long.MAX_VALUE;
    String[] array = config.split("\\s*,+\\s*");
    try {
      for (int idx = 0; idx < array.length - 1; idx++) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java

  public static String escapePackageName(String name) {
    return name.replaceAll("[\\-\\:]", "_");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java

  public static String escapeMessageName(String name) {
    return name.replaceAll("\\.", "_");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/element/impl/ConfigurableDatetimeAccessItem.java`
#### Snippet
```java

  private String[] splitConfig(String config) {
    return config.split("\\|{1}?", -1);
  }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/os/net/InterfaceUsage.java`
#### Snippet
```java

  public void update(String interfaceData, long secondInterval) {
    String[] netInfo = interfaceData.trim().split("\\s+");
    netStats.forEach(netStat -> netStat.update(netInfo, secondInterval));
  }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/os/cpu/CpuUtils.java`
#### Snippet
```java

  public static String[] readAndSplitFirstLine(File file) throws IOException {
    return Files.asCharSource(file, StandardCharsets.UTF_8).readFirstLine().trim().split("\\s+");
  }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.aop.framework` is unnecessary and can be removed
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/BeanUtils.java`
#### Snippet
```java
   * @param bean the instance to get implemented class from
   * @return the implemented class (if the checked class is proxied, return the ultimate target class)
   * @see org.springframework.aop.framework.AopProxyUtils#ultimateTargetClass
   */
  public static Class<?> getImplClassFromBean(Object bean) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.core.io.support` is unnecessary, and can be replaced with an import
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/impl/PaaSPropertiesLoaderUtils.java`
#### Snippet
```java


public class PaaSPropertiesLoaderUtils extends org.springframework.core.io.support.PropertiesLoaderUtils {

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.util` is unnecessary, and can be replaced with an import
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/PaaSResourceUtils.java`
#### Snippet
```java


public class PaaSResourceUtils extends org.springframework.util.ResourceUtils {
  public static final String PROPERTIES_SUFFIX = ".properties";

```

### UnnecessaryFullyQualifiedName
Qualifier `io.swagger.annotations` is unnecessary and can be removed
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
  }

  private Scheme convertScheme(io.swagger.annotations.SwaggerDefinition.Scheme annotationScheme) {
    if (SwaggerDefinition.Scheme.DEFAULT.equals(annotationScheme)) {
      return Scheme.HTTP;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.servicecomb.foundation.vertx.http` is unnecessary and can be removed
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/ReadStreamPart.java`
#### Snippet
```java
 * extend from AbstractPart just because want to make it be Part type,
 * so that can be sent by
 * {@link org.apache.servicecomb.foundation.vertx.http.VertxServerResponseToHttpServletResponse#sendPart(Part) VertxServerResponseToHttpServletResponse.sendPart}
 */
public class ReadStreamPart extends AbstractPart {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.servicecomb.serviceregistry` is unnecessary and can be removed
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/ServiceRegistry.java`
#### Snippet
```java
   * <p>
   *    if connect to normal ServiceCenter, same with the method
   *    {@linkplain org.apache.servicecomb.serviceregistry.ServiceRegistry#getRemoteMicroservice(String)}  }
   *    if connect to ServiceCenter Aggregator, not only contain the target ServiceCenter but also other ServiceCenter clusters
   * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.servicecomb.serviceregistry.client` is unnecessary and can be removed
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/ServiceRegistryClient.java`
#### Snippet
```java
   * <p>
   *    if connect to normal ServiceCenter, same with the method
   *    {@linkplain org.apache.servicecomb.serviceregistry.client.ServiceRegistryClient#getSchema(String, String)}
   *    if connect to ServiceCenter Aggregator, not only contain the target ServiceCenter but also other ServiceCenter clusters
   * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.servicecomb.serviceregistry.client` is unnecessary and can be removed
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/ServiceRegistryClient.java`
#### Snippet
```java
   * <p>
   *    if connect to normal ServiceCenter, same with the method
   *    {@linkplain org.apache.servicecomb.serviceregistry.client.ServiceRegistryClient#getMicroservice(String)}
   *    if connect to ServiceCenter Aggregator, not only contain the target ServiceCenter but also other ServiceCenter clusters
   * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.web.util` is unnecessary, and can be replaced with an import
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseUriTemplateHandler.java`
#### Snippet
```java
@SuppressWarnings("deprecation")
// TODO : upgrade to spring 5 will having warning's , we'll fix it later
public class CseUriTemplateHandler extends org.springframework.web.util.DefaultUriTemplateHandler {
  private static final String SCHEME_PATTERN = "([^:/?#]+):";

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.http.client` is unnecessary, and can be replaced with an import
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncClientHttpRequestFactory.java`
#### Snippet
```java
public class CseAsyncClientHttpRequestFactory implements org.springframework.http.client.AsyncClientHttpRequestFactory {
  @Override
  public org.springframework.http.client.AsyncClientHttpRequest createAsyncRequest(URI uri, HttpMethod httpMethod) {
    return new CseAsyncClientHttpRequest(uri, httpMethod);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.http.client` is unnecessary, and can be replaced with an import
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncClientHttpRequestFactory.java`
#### Snippet
```java
@SuppressWarnings("deprecation")
// TODO : upgrade to spring 5 will having warning's , we'll fix it later
public class CseAsyncClientHttpRequestFactory implements org.springframework.http.client.AsyncClientHttpRequestFactory {
  @Override
  public org.springframework.http.client.AsyncClientHttpRequest createAsyncRequest(URI uri, HttpMethod httpMethod) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.web.client` is unnecessary, and can be replaced with an import
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncRestTemplate.java`
#### Snippet
```java

  @Override
  protected <T> org.springframework.web.client.AsyncRequestCallback httpEntityCallback(HttpEntity<T> requestBody,
      Type responseType) {
    return new CseAsyncRequestCallback<>(requestBody);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.web.client` is unnecessary, and can be replaced with an import
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncRestTemplate.java`
#### Snippet
```java
// AsyncRestTemplate is deprecated by spring 5, using RPC with CompletableFuture instead.
// Keep this function is only for compatibility, and maybe removed in future.
public class CseAsyncRestTemplate extends org.springframework.web.client.AsyncRestTemplate {
  public CseAsyncRestTemplate() {
    super(createSimpleClientHttpRequestFactory(), createRestTemplate());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.web.client` is unnecessary, and can be replaced with an import
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncRestTemplate.java`
#### Snippet
```java

  @Override
  protected <T> org.springframework.web.client.AsyncRequestCallback httpEntityCallback(HttpEntity<T> requestBody) {
    return new CseAsyncRequestCallback<>(requestBody);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.http.client` is unnecessary, and can be replaced with an import
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncRequestCallback.java`
#### Snippet
```java
  @SuppressWarnings("deprecation")
// TODO : upgrade to spring 5 will having warning's , we'll fix it later
  public void doWithRequest(org.springframework.http.client.AsyncClientHttpRequest request) {
    CseAsyncClientHttpRequest cseAsyncClientHttpRequest = (CseAsyncClientHttpRequest) request;
    if (requestBody != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.web.client` is unnecessary, and can be replaced with an import
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncRequestCallback.java`
#### Snippet
```java
@SuppressWarnings("deprecation")
// TODO : upgrade to spring 5 will having warning's , we'll fix it later
public class CseAsyncRequestCallback<T> implements org.springframework.web.client.AsyncRequestCallback {
  private final HttpEntity<T> requestBody;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.http.client` is unnecessary, and can be replaced with an import
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncClientHttpRequest.java`
#### Snippet
```java
// TODO : upgrade to spring 5 will having warning's , we'll fix it later
public class CseAsyncClientHttpRequest extends CseClientHttpRequest implements
    org.springframework.http.client.AsyncClientHttpRequest {

  CseAsyncClientHttpRequest() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.netflix.spectator.servo` is unnecessary, and can be replaced with an import
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/DefaultRegistryInitializer.java`
#### Snippet
```java

    System.setProperty(SERVO_POLLERS, String.valueOf(config.getMsPollInterval()));
    registry = new com.netflix.spectator.servo.ServoRegistry();
    globalRegistry.add(registry);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.netflix.spectator.servo` is unnecessary, and can be replaced with an import
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/DefaultRegistryInitializer.java`
#### Snippet
```java

  @SuppressWarnings("deprecation")
  private com.netflix.spectator.servo.ServoRegistry registry;

  // create registry before init meters
```

### UnnecessaryFullyQualifiedName
Qualifier `io.swagger.models.parameters` is unnecessary, and can be replaced with an import
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/engine/SwaggerProducerOperation.java`
#### Snippet
```java
  }

  private static io.swagger.models.parameters.Parameter findParameterByName(
      List<io.swagger.models.parameters.Parameter> swaggerParameters, String name) {
    for (io.swagger.models.parameters.Parameter p : swaggerParameters) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.swagger.models.parameters` is unnecessary, and can be replaced with an import
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/engine/SwaggerProducerOperation.java`
#### Snippet
```java

  private static io.swagger.models.parameters.Parameter findParameterByName(
      List<io.swagger.models.parameters.Parameter> swaggerParameters, String name) {
    for (io.swagger.models.parameters.Parameter p : swaggerParameters) {
      if (p.getName().equals(name)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.swagger.models.parameters` is unnecessary, and can be replaced with an import
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/engine/SwaggerProducerOperation.java`
#### Snippet
```java
  private static io.swagger.models.parameters.Parameter findParameterByName(
      List<io.swagger.models.parameters.Parameter> swaggerParameters, String name) {
    for (io.swagger.models.parameters.Parameter p : swaggerParameters) {
      if (p.getName().equals(name)) {
        return p;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.servicecomb.core` is unnecessary and can be removed
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/http/RestClientInvocation.java`
#### Snippet
```java
      this.clientRequest = clientRequest;

      clientRequest.putHeader(org.apache.servicecomb.core.Const.TARGET_MICROSERVICE, invocation.getMicroserviceName());
      RestClientRequestImpl restClientRequest =
          new RestClientRequestImpl(clientRequest, httpClientWithContext.context(), asyncResp, throwableHandler);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.servicecomb.core` is unnecessary and can be removed
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/http/RestClientInvocation.java`
#### Snippet
```java

  private static final String[] INTERNAL_HEADERS = new String[] {
      org.apache.servicecomb.core.Const.CSE_CONTEXT,
      org.apache.servicecomb.core.Const.TARGET_MICROSERVICE
  };
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.servicecomb.core` is unnecessary and can be removed
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/http/RestClientInvocation.java`
#### Snippet
```java
  private static final String[] INTERNAL_HEADERS = new String[] {
      org.apache.servicecomb.core.Const.CSE_CONTEXT,
      org.apache.servicecomb.core.Const.TARGET_MICROSERVICE
  };

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.servicecomb.core` is unnecessary, and can be replaced with an import
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/ServletRestTransport.java`
#### Snippet
```java
  @Override
  public String getName() {
    return org.apache.servicecomb.core.Const.RESTFUL;
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.lang3` is unnecessary, and can be replaced with an import
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/consumer/ConsumerTokenManager.java`
#### Snippet
```java

    @SuppressWarnings("deprecation")
    String randomCode = org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(128);
    long generateTime = System.currentTimeMillis();
    try {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DynamicEnum()` of an abstract class should not be declared 'public'
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/base/DynamicEnum.java`
#### Snippet
```java
  private boolean dynamic = false;

  public DynamicEnum(T value) {
    this.value = value;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractRestObjectMapper()` of an abstract class should not be declared 'public'
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/AbstractRestObjectMapper.java`
#### Snippet
```java
  }

  public AbstractRestObjectMapper(RestObjectMapper src) {
    super(src);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractRestObjectMapper()` of an abstract class should not be declared 'public'
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/AbstractRestObjectMapper.java`
#### Snippet
```java
  private static final long serialVersionUID = 189026839992490564L;

  public AbstractRestObjectMapper() {
    super();
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLoader()` of an abstract class should not be declared 'public'
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/config/impl/AbstractLoader.java`
#### Snippet
```java
  protected List<String> locationPatternList;

  public AbstractLoader(List<String> locationPatternList) {
    this.locationPatternList = locationPatternList;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `VersionRule()` of an abstract class should not be declared 'public'
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/version/VersionRule.java`
#### Snippet
```java
  private final String versionRule;

  public VersionRule(String versionRule) {
    this.versionRule = versionRule;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBaseIntegerProperty()` of an abstract class should not be declared 'public'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/property/AbstractBaseIntegerProperty.java`
#### Snippet
```java
  protected List<T> enumNames;

  public AbstractBaseIntegerProperty(String format) {
    super(format);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSwaggerGenerator()` of an abstract class should not be declared 'public'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractSwaggerGenerator.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractSwaggerGenerator(Class<?> cls) {
    this.swagger = new Swagger();
    this.cls = cls;
```

### NonProtectedConstructorInAbstractClass
Constructor `RestSwaggerGenerator()` of an abstract class should not be declared 'public'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/rest/RestSwaggerGenerator.java`
#### Snippet
```java

public abstract class RestSwaggerGenerator extends AbstractSwaggerGenerator {
  public RestSwaggerGenerator(Class<?> cls) {
    super(cls);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `RestOperationGenerator()` of an abstract class should not be declared 'public'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/rest/RestOperationGenerator.java`
#### Snippet
```java

public abstract class RestOperationGenerator extends AbstractOperationGenerator {
  public RestOperationGenerator(AbstractSwaggerGenerator swaggerGenerator, Method method) {
    super(swaggerGenerator, method);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractOperationGenerator()` of an abstract class should not be declared 'public'
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractOperationGenerator.java`
#### Snippet
```java
  private static final List<String> NOT_NULL_ANNOTATIONS = Arrays.asList("NotBlank", "NotEmpty");

  public AbstractOperationGenerator(AbstractSwaggerGenerator swaggerGenerator, Method method) {
    this.swaggerGenerator = swaggerGenerator;
    this.swagger = swaggerGenerator.getSwagger();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFault()` of an abstract class should not be declared 'public'
in `governance/src/main/java/org/apache/servicecomb/governance/processor/injection/AbstractFault.java`
#### Snippet
```java
  protected FaultInjectionPolicy policy;

  public AbstractFault(String key, FaultInjectionPolicy policy) {
    this.key = key;
    this.policy = policy;
```

### NonProtectedConstructorInAbstractClass
Constructor `ThirdServiceRegister()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/servicecomb/core/registry/ThirdServiceRegister.java`
#### Snippet
```java
  protected final Map<String, Class<?>> schemaByIdMap = new HashMap<>();

  public ThirdServiceRegister(String microserviceName) {
    this.microserviceName = microserviceName;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ProducerInvocationFlow()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/servicecomb/core/invocation/ProducerInvocationFlow.java`
#### Snippet
```java
  }

  public ProducerInvocationFlow(InvocationCreator invocationCreator,
      HttpServletRequestEx requestEx, HttpServletResponseEx responseEx) {
    this.invocationCreator = invocationCreator;
```

### NonProtectedConstructorInAbstractClass
Constructor `ProducerInvocationFlow()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/servicecomb/core/invocation/ProducerInvocationFlow.java`
#### Snippet
```java
  protected final HttpServletResponseEx responseEx;

  public ProducerInvocationFlow(InvocationCreator invocationCreator) {
    this(invocationCreator, null, null);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTcpClientPoolFactory()` of an abstract class should not be declared 'public'
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/client/tcp/AbstractTcpClientPoolFactory.java`
#### Snippet
```java
  protected TcpClientConfig sslClientConfig;

  public AbstractTcpClientPoolFactory(TcpClientConfig normalClientConfig, TcpClientConfig sslClientConfig) {
    this.normalClientConfig = normalClientConfig;
    this.sslClientConfig = sslClientConfig;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTcpClientConnectionPool()` of an abstract class should not be declared 'public'
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/client/tcp/AbstractTcpClientConnectionPool.java`
#### Snippet
```java
  protected Map<String, T> tcpClientMap = new ConcurrentHashMapEx<>();

  public AbstractTcpClientConnectionPool(Context context,
      NetClientWrapper netClientWrapper) {
    this.context = context;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractParamProcessor()` of an abstract class should not be declared 'public'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/AbstractParamProcessor.java`
#### Snippet
```java
  }

  public AbstractParamProcessor(String paramPath, JavaType targetType, Object defaultValue, boolean required) {
    this.paramPath = paramPath;
    this.targetType = targetType;
```

### NonProtectedConstructorInAbstractClass
Constructor `RestProducerInvocationCreator()` of an abstract class should not be declared 'public'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/RestProducerInvocationCreator.java`
#### Snippet
```java
  protected ProduceProcessor produceProcessor;

  public RestProducerInvocationCreator(MicroserviceMeta microserviceMeta, Endpoint endpoint,
      @Nonnull HttpServletRequestEx requestEx, @Nonnull HttpServletResponseEx responseEx) {
    this.microserviceMeta = microserviceMeta;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractQueryCodec()` of an abstract class should not be declared 'public'
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/query/AbstractQueryCodec.java`
#### Snippet
```java
  private final String codecName;

  public AbstractQueryCodec(String codecName) {
    this.codecName = codecName;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTask()` of an abstract class should not be declared 'public'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/AbstractTask.java`
#### Snippet
```java
  protected Microservice microservice;

  public AbstractTask(EventBus eventBus, ServiceRegistryClient srClient, Microservice microservice) {
    this.eventBus = eventBus;
    this.srClient = srClient;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractRegisterTask()` of an abstract class should not be declared 'public'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/task/AbstractRegisterTask.java`
#### Snippet
```java
  protected boolean registered;

  public AbstractRegisterTask(EventBus eventBus, ServiceRegistryClient srClient, Microservice microservice) {
    super(eventBus, srClient, microservice);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractServiceRegistry()` of an abstract class should not be declared 'public'
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/AbstractServiceRegistry.java`
#### Snippet
```java
  private String name;

  public AbstractServiceRegistry(EventBus eventBus, ServiceRegistryConfig serviceRegistryConfig,
      Configuration configuration) {
    setName(serviceRegistryConfig.getRegistryName());
```

### NonProtectedConstructorInAbstractClass
Constructor `ThirdServiceWithInvokerRegister()` of an abstract class should not be declared 'public'
in `providers/provider-pojo/src/main/java/org/apache/servicecomb/provider/pojo/registry/ThirdServiceWithInvokerRegister.java`
#### Snippet
```java
 */
public abstract class ThirdServiceWithInvokerRegister extends ThirdServiceRegister implements BeanFactoryPostProcessor {
  public ThirdServiceWithInvokerRegister(String microserviceName) {
    super(microserviceName);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `FieldSchema()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/io/protostuff/runtime/FieldSchema.java`
#### Snippet
```java
  protected final boolean primitive;

  public FieldSchema(Field protoField, JavaType javaType) {
    this.protoField = protoField;
    this.name = protoField.getName();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPrimitiveWriters()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/AbstractPrimitiveWriters.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractPrimitiveWriters(Field protoField) {
    super(protoField);

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWriters()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/AbstractWriters.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractWriters(Field protoField) {
    this(protoField, null);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWriters()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/AbstractWriters.java`
#### Snippet
```java
  }

  public AbstractWriters(Field protoField, Class<T[]> arrayClass) {
    this.protoField = protoField;
    int wireType = ProtoUtils.isPacked(protoField) && protoField.isRepeated() ? WireFormat.WIRETYPE_LENGTH_DELIMITED
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractIntSchema()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/AbstractScalarReadSchemas.java`
#### Snippet
```java
    protected final Setter<T, Object> setter;

    public AbstractIntSchema(Field protoField, PropertyDescriptor propertyDescriptor) {
      super(protoField, propertyDescriptor.getJavaType());
      this.setter = propertyDescriptor.getSetter();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLongSchema()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/AbstractScalarReadSchemas.java`
#### Snippet
```java
    protected final Setter<T, Object> setter;

    public AbstractLongSchema(Field protoField, PropertyDescriptor propertyDescriptor) {
      super(protoField, propertyDescriptor.getJavaType());
      this.setter = propertyDescriptor.getSetter();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPrimitiveReaders()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/AbstractPrimitiveReaders.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractPrimitiveReaders(Field protoField) {
    super(protoField);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractReaders()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/AbstractReaders.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AbstractReaders(Field protoField) {
    this(protoField, null);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractReaders()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/AbstractReaders.java`
#### Snippet
```java
  }

  public AbstractReaders(Field protoField, Class<T[]> arrayClass) {
    this.protoField = protoField;
    this.fieldNumber = protoField.getTag();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractCondition()` of an abstract class should not be declared 'public'
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/oper/AbstractCondition.java`
#### Snippet
```java
  private SupportedType type = SupportedType.UNKNOWN;

  public AbstractCondition(String key, String expected) {
    assertValueNotNull(key, expected);
    this.key = key;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractCpuUsage()` of an abstract class should not be declared 'public'
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/os/cpu/AbstractCpuUsage.java`
#### Snippet
```java
  }

  public AbstractCpuUsage(Id id) {
    this.id = id;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `SchemaManager()` of an abstract class should not be declared 'public'
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/SchemaManager.java`
#### Snippet
```java
  protected final Map<String, SchemaEx<?>> canonicalSchemas = new ConcurrentHashMapEx<>();

  public SchemaManager(ProtoMapper protoMapper) {
    this.protoMapper = protoMapper;
    this.proto = protoMapper.getProto();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractInvocationMeters()` of an abstract class should not be declared 'public'
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/invocation/AbstractInvocationMeters.java`
#### Snippet
```java
  private int maxKeyLen = 64;

  public AbstractInvocationMeters(Registry registry) {
    this.registry = registry;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMeasurementNodeLogPublisher()` of an abstract class should not be declared 'public'
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/AbstractMeasurementNodeLogPublisher.java`
#### Snippet
```java
  private final boolean exists;

  public AbstractMeasurementNodeLogPublisher(MeasurementTree tree, StringBuilder sb, String... childNames) {
    this.sb = sb;
    measurementNode = tree.findChild(childNames);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractInvocationMeter()` of an abstract class should not be declared 'public'
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/invocation/AbstractInvocationMeter.java`
#### Snippet
```java
  private final LatencyDistributionMeter latencyDistributionMeter;

  public AbstractInvocationMeter(Id id) {
    this.id = id;
    latencyDistributionMeter = createLatencyDistribution(MeterInvocationConst.TAG_LATENCY_DISTRIBUTION);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractArgumentsMapperCreator()` of an abstract class should not be declared 'public'
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/AbstractArgumentsMapperCreator.java`
#### Snippet
```java
  protected Set<String> processedSwaggerParamters;

  public AbstractArgumentsMapperCreator(SerializationConfig serializationConfig,
      Map<Class<?>, ContextArgumentMapperFactory> contextFactorys, Class<?> providerClass,
      Method providerMethod, SwaggerOperation swaggerOperation) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractProducerContextArgMapper()` of an abstract class should not be declared 'public'
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/producer/AbstractProducerContextArgMapper.java`
#### Snippet
```java
  protected String swaggerArgumentName;

  public AbstractProducerContextArgMapper(String invocationArgumentName, String swaggerArgumentName) {
    this.invocationArgumentName = invocationArgumentName;
    this.swaggerArgumentName = swaggerArgumentName;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `path`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/config/ConfigurePropertyUtils.java`
#### Snippet
```java
    if (StringUtils.isNotEmpty(prefix)) {
      if (!path.startsWith(prefix)) {
        path = prefix + path;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `strVersionRule`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/version/VersionRuleUtils.java`
#### Snippet
```java

  public static VersionRule create(String strVersionRule) {
    strVersionRule = strVersionRule.trim();
    for (VersionRuleParser parser : parsers) {
      VersionRule versionRule = parser.parse(strVersionRule);
```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/discovery/DiscoveryTree.java`
#### Snippet
```java
        DiscoveryTreeNode rerunNode = context.popRerunFilter();
        if (rerunNode != null) {
          parent = rerunNode;
          idx = parent.level();
          continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/discovery/DiscoveryTree.java`
#### Snippet
```java
      }

      parent = child;
      idx++;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `allInstances`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersionRule.java`
#### Snippet
```java
  public void update(Map<String, MicroserviceVersion> allVersions, Collection<MicroserviceInstance> allInstances) {
    if (allInstances == null) {
      allInstances = Collections.emptyList();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `genericResponseType`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/response/DefaultResponseTypeProcessor.java`
#### Snippet
```java
      Type genericResponseType) {
    if (extractActualType) {
      genericResponseType = ((ParameterizedType) genericResponseType).getActualTypeArguments()[0];
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGeneratorUtils.java`
#### Snippet
```java
  public static <SWAGGER_PARAMETER, ANNOTATION> ParameterProcessor<SWAGGER_PARAMETER, ANNOTATION> findParameterProcessors(
      Type type) {
    type = TypeFactory.defaultInstance().constructType(type);
    return (ParameterProcessor<SWAGGER_PARAMETER, ANNOTATION>) parameterProcessors.get(type);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `basePath`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractSwaggerGenerator.java`
#### Snippet
```java
  @Override
  public void setBasePath(String basePath) {
    basePath = new PlaceholderResolver().replaceFirst(basePath);
    swagger.setBasePath(basePath);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `governance/src/main/java/org/apache/servicecomb/router/model/HeaderRule.java`
#### Snippet
```java
    }
    if (caseInsensitive) {
      str = str.toLowerCase();
      exact = exact == null ? null : exact.toLowerCase();
      regex = regex == null ? null : regex.toLowerCase();
```

### AssignmentToMethodParameter
Assignment to method parameter `format`
in `inspector/src/main/java/org/apache/servicecomb/inspector/internal/InspectorImpl.java`
#### Snippet
```java

    if (format == null) {
      format = SchemaFormat.SWAGGER;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `format`
in `inspector/src/main/java/org/apache/servicecomb/inspector/internal/InspectorImpl.java`
#### Snippet
```java
  public Response downloadSchemas(@QueryParam("format") SchemaFormat format) {
    if (format == null) {
      format = SchemaFormat.SWAGGER;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractOperationGenerator.java`
#### Snippet
```java
  @Override
  public void setPath(String path) {
    path = new PlaceholderResolver().replaceFirst(path);
    if (!path.startsWith("/")) {
      path = "/" + path;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractOperationGenerator.java`
#### Snippet
```java
    path = new PlaceholderResolver().replaceFirst(path);
    if (!path.startsWith("/")) {
      path = "/" + path;
    }
    this.path = path;
```

### AssignmentToMethodParameter
Assignment to method parameter `throwableToSearchIn`
in `governance/src/main/java/org/apache/servicecomb/governance/handler/ext/FailurePredictor.java`
#### Snippet
```java
        }
      }
      throwableToSearchIn = throwableToSearchIn.getCause();
    }
    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `transport`
in `core/src/main/java/org/apache/servicecomb/core/provider/consumer/MicroserviceReferenceConfig.java`
#### Snippet
```java
  public ReferenceConfig createReferenceConfig(String transport, OperationMeta operationMeta) {
    if (transport == null) {
      transport = operationMeta.getConfig().getTransport();
    }
    final ReferenceConfig referenceConfig = new ReferenceConfig(transport, versionRule);
```

### AssignmentToMethodParameter
Assignment to method parameter `transport`
in `core/src/main/java/org/apache/servicecomb/core/definition/OperationConfig.java`
#### Snippet
```java
  public void setTransport(String transport) {
    if (transport == null) {
      transport = Const.ANY_TRANSPORT;
    }
    this.transport = transport;
```

### AssignmentToMethodParameter
Assignment to method parameter `throwable`
in `core/src/main/java/org/apache/servicecomb/core/invocation/ProducerInvocationFlow.java`
#### Snippet
```java
    }

    throwable = Exceptions.unwrap(throwable);
    if (requestEx == null) {
      logException(invocation, throwable);
```

### AssignmentToMethodParameter
Assignment to method parameter `addressWithoutSchema`
in `core/src/main/java/org/apache/servicecomb/core/transport/AbstractTransport.java`
#### Snippet
```java
    int idx = addressWithoutSchema.indexOf('?');
    if (idx == -1) {
      addressWithoutSchema += "?";
    } else {
      addressWithoutSchema += "&";
```

### AssignmentToMethodParameter
Assignment to method parameter `addressWithoutSchema`
in `core/src/main/java/org/apache/servicecomb/core/transport/AbstractTransport.java`
#### Snippet
```java
      addressWithoutSchema += "?";
    } else {
      addressWithoutSchema += "&";
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `addressWithoutSchema`
in `core/src/main/java/org/apache/servicecomb/core/transport/AbstractTransport.java`
#### Snippet
```java
    String encodedQuery = URLEncodedUtils.format(pairs.entrySet().stream().map(entry -> new BasicNameValuePair(entry.getKey(), entry.getValue())).collect(Collectors.toList()), StandardCharsets.UTF_8.name());

    addressWithoutSchema += encodedQuery;

    return addressWithoutSchema;
```

### AssignmentToMethodParameter
Assignment to method parameter `addressWithoutSchema`
in `core/src/main/java/org/apache/servicecomb/core/transport/AbstractTransport.java`
#### Snippet
```java
  protected void setListenAddressWithoutSchema(String addressWithoutSchema,
      Map<String, String> pairs) {
    addressWithoutSchema = genAddressWithoutSchema(addressWithoutSchema, pairs);

    this.endpoint = new Endpoint(this, NetUtils.getRealListenAddress(getName(), addressWithoutSchema));
```

### AssignmentToMethodParameter
Assignment to method parameter `configSource`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/AddressResolverConfig.java`
#### Snippet
```java

  private static int getPositiveIntProperty(Configuration configSource, int defaultValue, String... keys) {
    configSource = guardConfigSource(configSource);
    if (configSource == null) {
      return defaultValue;
```

### AssignmentToMethodParameter
Assignment to method parameter `configSource`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/AddressResolverConfig.java`
#### Snippet
```java
  private static boolean getBooleanProperty(Configuration configSource, boolean defaultValue,
      String... keys) {
    configSource = guardConfigSource(configSource);
    if (configSource == null) {
      return defaultValue;
```

### AssignmentToMethodParameter
Assignment to method parameter `configSource`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/AddressResolverConfig.java`
#### Snippet
```java
  private static List<String> getStringListProperty(Configuration configSource,
      List<String> defaultValue, String... keys) {
    configSource = guardConfigSource(configSource);
    if (configSource == null) {
      return defaultValue;
```

### AssignmentToMethodParameter
Assignment to method parameter `configSource`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/AddressResolverConfig.java`
#### Snippet
```java
  private static Configuration guardConfigSource(Configuration configSource) {
    if (configSource == null && DynamicPropertyFactory.getBackingConfigurationSource() != null) {
      configSource = (Configuration) DynamicPropertyFactory.getBackingConfigurationSource();
    }
    return configSource;
```

### AssignmentToMethodParameter
Assignment to method parameter `vertxOptions`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/VertxUtils.java`
#### Snippet
```java
  public static Vertx init(String name, VertxOptions vertxOptions) {
    if (vertxOptions == null) {
      vertxOptions = new VertxOptions();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/stream/BufferInputStream.java`
#### Snippet
```java
    int avail = available();
    if (len > avail) {
      len = avail;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `strategyName`
in `handlers/handler-flowcontrol-qps/src/main/java/org/apache/servicecomb/qps/QpsControllerManager.java`
#### Snippet
```java
      String strategyName) {
    if (StringUtils.isEmpty(strategyName)) {
      strategyName = "FixedWindow";
    }
    AbstractQpsStrategy strategy = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `genericParamType`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/FormProcessorCreator.java`
#### Snippet
```java
    private void initRepeatedConverter(Type genericParamType) {
      if (genericParamType instanceof JavaType) {
        genericParamType = Types.newParameterizedType(((JavaType) genericParamType).getRawClass(),
            ((JavaType) genericParamType).getContentType());
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `genericParamType`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/FormProcessorCreator.java`
#### Snippet
```java
    private void initNormalConverter(Type genericParamType) {
      if (genericParamType instanceof JavaType) {
        genericParamType = ((JavaType) genericParamType).getRawClass();
      }
      converter = partToTargetConverters.get(genericParamType);
```

### AssignmentToMethodParameter
Assignment to method parameter `headers`
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterRawClient.java`
#### Snippet
```java
    String formatUrl = addressManager.formatUrl(url, absoluteUrl, address);
    if (headers == null) {
      headers = new HashMap<>();
    }
    headers.put(HEADER_TENANT_NAME, tenantName);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/resource/StaticResourceHandler.java`
#### Snippet
```java

  public Response handle(String path) {
    path = URI.create(webRoot + path).normalize().getPath();
    if (!path.startsWith(webRoot)) {
      // maybe request of attack, just return 404
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/OperationLocator.java`
#### Snippet
```java
  static String getStandardPath(String path) {
    if (path.length() > 0 && !path.endsWith(SLASH)) {
      path += SLASH;
    }
    return path;
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
  private int processLineBreak(int state) {
    if (state == NAME_READ) {
      state = NAME_READ_READY;
    } else if (state == REGEXP_READ) {
      state = REGEXP_READ_READY;
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
      state = NAME_READ_READY;
    } else if (state == REGEXP_READ) {
      state = REGEXP_READ_READY;
    }
    return state;
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
    }
    if (state == NAME_READ || state == NAME_READ_READY) {
      state = REGEXP_READ_START;
    }
    return state;
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
      final StringBuilder regExp, int state, int i, final char c) throws Exception {
    if (state == NAME_READ_START) {
      state = NAME_READ;
      varName.append(c);
    } else if (state == NAME_READ) {
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
      varName.append(c);
    } else if (state == REGEXP_READ_START) {
      state = REGEXP_READ;
      regExp.append(c);
    } else if (state == REGEXP_READ) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestOperationMeta.java`
#### Snippet
```java
    final Property additionalProperties = ((ModelImpl) bodyParameter.getSchema()).getAdditionalProperties();
    if (additionalProperties instanceof StringProperty) {
      type = RestObjectMapperFactory.getRestObjectMapper().getTypeFactory()
          .constructMapType(Map.class, String.class, String.class);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `rawPath`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/URLPathBuilder.java`
#### Snippet
```java
    // 去掉末尾'/'
    if (rawPath.endsWith(SLASH)) {
      rawPath = rawPath.substring(0, rawPath.length() - 1);
    }
    // 首部加上'/'
```

### AssignmentToMethodParameter
Assignment to method parameter `rawPath`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/URLPathBuilder.java`
#### Snippet
```java
    // 首部加上'/'
    if (!rawPath.startsWith(SLASH)) {
      rawPath = SLASH + rawPath;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `eventBus`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/ServiceRegistryFactory.java`
#### Snippet
```java
      Configuration configuration) {
    if (null == eventBus) {
      eventBus = new SimpleEventBus();
    }
    return new RemoteServiceRegistry(eventBus, serviceRegistryConfig, configuration);
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/YAMLUtil.java`
#### Snippet
```java
    Map<String, Object> result = new LinkedHashMap<>();
    if (!prefix.isEmpty()) {
      prefix += ".";
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/filter/PriorityInstancePropertyDiscoveryFilter.java`
#### Snippet
```java
      propertyKey = key;
      if (Objects.isNull(value)) {
        value = StringUtils.EMPTY;
      }
      if (value.length() > MAX_LENGTH) {
```

### AssignmentToMethodParameter
Assignment to method parameter `defaultValue`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObjectFactory.java`
#### Snippet
```java
    if (injectProperty != null) {
      if (!injectProperty.defaultValue().isEmpty()) {
        defaultValue = Integer.parseInt(injectProperty.defaultValue());
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `defaultValue`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObjectFactory.java`
#### Snippet
```java
    if (injectProperty != null) {
      if (!injectProperty.defaultValue().isEmpty()) {
        defaultValue = Boolean.parseBoolean(injectProperty.defaultValue());
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `defaultValue`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObjectFactory.java`
#### Snippet
```java
    if (injectProperty != null) {
      if (!injectProperty.defaultValue().isEmpty()) {
        defaultValue = Long.parseLong(injectProperty.defaultValue());
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `defaultValue`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObjectFactory.java`
#### Snippet
```java
    if (injectProperty != null) {
      if (!injectProperty.defaultValue().isEmpty()) {
        defaultValue = Double.parseDouble(injectProperty.defaultValue());
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `defaultValue`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObjectFactory.java`
#### Snippet
```java
    if (injectProperty != null) {
      if (!injectProperty.defaultValue().isEmpty()) {
        defaultValue = Float.parseFloat(injectProperty.defaultValue());
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/meter/LatencyDistributionConfig.java`
#### Snippet
```java
      return;
    }
    config = config.trim() + "," + Long.MAX_VALUE;
    String[] array = config.split("\\s*,+\\s*");
    try {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ByteArrayInputEx.java`
#### Snippet
```java

    if (value == null) {
      value = schema.newMessage();
    }
    schema.mergeFrom(this, value);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    }

    buffer[offset++] = (byte) (value & 0xFF);
    buffer[offset++] = (byte) (value >> 8 & 0xFF);
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java

    buffer[offset++] = (byte) (value & 0xFF);
    buffer[offset++] = (byte) (value >> 8 & 0xFF);
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
    buffer[offset] = (byte) (value >> 24 & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    buffer[offset++] = (byte) (value & 0xFF);
    buffer[offset++] = (byte) (value >> 8 & 0xFF);
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
    buffer[offset] = (byte) (value >> 24 & 0xFF);

```

### AssignmentToMethodParameter
Assignment to method parameter `lb`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java

    if (lb.offset + size > lb.buffer.length) {
      lb = new LinkedBuffer(session.nextBufferSize, lb);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      buffer[offset] = (byte) value;
    } else {
      for (int i = 0, last = size - 1; i < last; i++, value >>>= 7) {
        buffer[offset++] = (byte) ((value & 0x7F) | 0x80);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
        return;
      } else {
        buf[offset++] = (byte) ((value & 0x7F) | 0x80);
        value >>>= 7;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      } else {
        buf[offset++] = (byte) ((value & 0x7F) | 0x80);
        value >>>= 7;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `lb`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java

    if (lb.offset + totalSize > lb.buffer.length) {
      lb = new LinkedBuffer(session.nextBufferSize, lb);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `tag`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      buffer[offset++] = (byte) tag;
    } else {
      for (int i = 0, last = tagSize - 1; i < last; i++, tag >>>= 7) {
        buffer[offset++] = (byte) ((tag & 0x7F) | 0x80);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `lb`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java

    if (lb.offset + totalSize > lb.buffer.length) {
      lb = new LinkedBuffer(session.nextBufferSize, lb);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `tag`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      buffer[offset++] = (byte) tag;
    } else {
      for (int i = 0, last = tagSize - 1; i < last; i++, tag >>>= 7) {
        buffer[offset++] = (byte) ((tag & 0x7F) | 0x80);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      buffer[offset] = (byte) value;
    } else {
      for (int i = 0, last = size - 1; i < last; i++, value >>>= 7) {
        buffer[offset++] = (byte) (((int) value & 0x7F) | 0x80);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      buffer[offset] = (byte) value;
    } else {
      for (int i = 0, last = size - 1; i < last; i++, value >>>= 7) {
        buffer[offset++] = (byte) (((int) value & 0x7F) | 0x80);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `lb`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    }

    lb = writeTagAndRawVarInt32(tag, tagSize, valueLen, session, lb);

    session.size += valueLen;
```

### AssignmentToMethodParameter
Assignment to method parameter `lb`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java

      // grow
      lb = new LinkedBuffer(session.nextBufferSize, lb);

      final int leftover = valueLen - available;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    }

    buffer[offset++] = (byte) (value & 0xFF);
    buffer[offset++] = (byte) (value >> 8 & 0xFF);
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java

    buffer[offset++] = (byte) (value & 0xFF);
    buffer[offset++] = (byte) (value >> 8 & 0xFF);
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
    buffer[offset++] = (byte) (value >> 24 & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    buffer[offset++] = (byte) (value & 0xFF);
    buffer[offset++] = (byte) (value >> 8 & 0xFF);
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
    buffer[offset++] = (byte) (value >> 24 & 0xFF);
    buffer[offset++] = (byte) (value >> 32 & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    buffer[offset++] = (byte) (value >> 8 & 0xFF);
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
    buffer[offset++] = (byte) (value >> 24 & 0xFF);
    buffer[offset++] = (byte) (value >> 32 & 0xFF);
    buffer[offset++] = (byte) (value >> 40 & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    buffer[offset++] = (byte) (value >> 16 & 0xFF);
    buffer[offset++] = (byte) (value >> 24 & 0xFF);
    buffer[offset++] = (byte) (value >> 32 & 0xFF);
    buffer[offset++] = (byte) (value >> 40 & 0xFF);
    buffer[offset++] = (byte) (value >> 48 & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    buffer[offset++] = (byte) (value >> 24 & 0xFF);
    buffer[offset++] = (byte) (value >> 32 & 0xFF);
    buffer[offset++] = (byte) (value >> 40 & 0xFF);
    buffer[offset++] = (byte) (value >> 48 & 0xFF);
    buffer[offset] = (byte) (value >> 56 & 0xFF);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
    buffer[offset++] = (byte) (value >> 32 & 0xFF);
    buffer[offset++] = (byte) (value >> 40 & 0xFF);
    buffer[offset++] = (byte) (value >> 48 & 0xFF);
    buffer[offset] = (byte) (value >> 56 & 0xFF);

```

### AssignmentToMethodParameter
Assignment to method parameter `lb`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java

    if (lb.offset + totalSize > lb.buffer.length) {
      lb = new LinkedBuffer(session.nextBufferSize, lb);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `tag`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      buffer[offset++] = (byte) tag;
    } else {
      for (int i = 0, last = tagSize - 1; i < last; i++, tag >>>= 7) {
        buffer[offset++] = (byte) ((tag & 0x7F) | 0x80);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `lb`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java

    if (lb.offset + totalSize > lb.buffer.length) {
      lb = new LinkedBuffer(session.nextBufferSize, lb);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `tag`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      buffer[offset++] = (byte) tag;
    } else {
      for (int i = 0, last = tagSize - 1; i < last; i++, tag >>>= 7) {
        buffer[offset++] = (byte) ((tag & 0x7F) | 0x80);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/ProtobufOutputEx.java`
#### Snippet
```java
      buffer[offset] = (byte) value;
    } else {
      for (int i = 0, last = size - 1; i < last; i++, value >>>= 7) {
        buffer[offset++] = (byte) ((value & 0x7F) | 0x80);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `arrayClass`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/repeated/AbstractWriters.java`
#### Snippet
```java

    if (arrayClass == null) {
      arrayClass = getFieldArgument(this.getClass(), "arrayWriter");
    }
    this.arrayClass = arrayClass;
```

### AssignmentToMethodParameter
Assignment to method parameter `arrayClass`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/AbstractReaders.java`
#### Snippet
```java

    if (arrayClass == null) {
      arrayClass = getFieldArgument(this.getClass(), "arrayClass");
    }
    this.arrayClass = arrayClass;
```

### AssignmentToMethodParameter
Assignment to method parameter `javaType`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/MessageReadSchema.java`
#### Snippet
```java
    this.javaType = javaType;
    if (javaType.isJavaLangObject() || Map.class.isAssignableFrom(javaType.getRawClass())) {
      javaType = ProtoConst.MAP_TYPE;
    }
    this.instantiator = RuntimeEnv.newInstantiator((Class<T>) javaType.getRawClass());
```

### AssignmentToMethodParameter
Assignment to method parameter `javaType`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/DeserializerSchemaManager.java`
#### Snippet
```java
      Field protoField = message.getField(1);
      if (javaType.isJavaLangObject()) {
        javaType =
            protoField.isRepeated() && !protoField.isMap() ? ProtoConst.LIST_TYPE
                : ProtoConst.MAP_TYPE;
```

### AssignmentToMethodParameter
Assignment to method parameter `javaType`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/DeserializerSchemaManager.java`
#### Snippet
```java

      if (javaType.isPrimitive()) {
        javaType = TypeFactory.defaultInstance()
            .constructParametricType(PropertyWrapper.class, TypesUtil.primitiveJavaTypeToWrapper(javaType));
      } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `javaType`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/DeserializerSchemaManager.java`
#### Snippet
```java
            .constructParametricType(PropertyWrapper.class, TypesUtil.primitiveJavaTypeToWrapper(javaType));
      } else {
        javaType = TypeFactory.defaultInstance().constructParametricType(PropertyWrapper.class, javaType);
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `javaType`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/DeserializerSchemaManager.java`
#### Snippet
```java

    if (javaType.isJavaLangObject()) {
      javaType = ProtoConst.MAP_TYPE;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/oper/ConditionFactory.java`
#### Snippet
```java

  private static Condition buildCondition(int index, String key, String value, boolean caseInsensitive) {
    value = caseInsensitive ? value.toLowerCase() : value;
    Condition condition = buildCondition(index, key, value);
    if (caseInsensitive) {
```

### AssignmentToMethodParameter
Assignment to method parameter `actual`
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/oper/CaseInsensitiveCondition.java`
#### Snippet
```java
      return;
    }
    actual = actual.toString().toLowerCase();
    condition.setActual(key, actual);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/os/net/InterfaceUsage.java`
#### Snippet
```java
  public InterfaceUsage(Id id, String name) {
    this.name = name;
    id = id.withTag(INTERFACE, name);
    init(id);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/meter/vertx/EndpointMeter.java`
#### Snippet
```java

  public EndpointMeter(Id id, DefaultEndpointMetric metric) {
    id = id.withTag(ADDRESS, metric.getAddress());
    this.id = id;
    idConnect = id.withTag(STATISTIC, CONNECT_COUNT);
```

### AssignmentToMethodParameter
Assignment to method parameter `swagger`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/engine/SwaggerEnvironment.java`
#### Snippet
```java
  private Swagger checkAndGenerateSwagger(Class<?> swaggerClass, Swagger swagger) {
    if (swagger == null) {
      swagger = SwaggerGenerator.generate(swaggerClass);
    }
    return swagger;
```

### AssignmentToMethodParameter
Assignment to method parameter `swagger`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/engine/SwaggerEnvironment.java`
#### Snippet
```java
    Class<?> producerCls = targetSwaggerClass(producerInstance, schemaInterface);

    swagger = checkAndGenerateSwagger(producerCls, swagger);

    Map<Class<?>, ContextArgumentMapperFactory> contextFactories = SPIServiceUtils
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/Response.java`
#### Snippet
```java
    Response response = Response.status(status);
    if (response.isFailed()) {
      result = ExceptionFactory.create(status, result);
    }
    return response.entity(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/ExceptionFactory.java`
#### Snippet
```java
  private static InvocationException convertException(int statusCode, String reasonPhrase, Throwable e,
                                                      String errorMsg) {
    e = unwrap(e);

    if (e instanceof InvocationException) {
```

### AssignmentToMethodParameter
Assignment to method parameter `throwable`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/ExceptionFactory.java`
#### Snippet
```java
  public static <T extends Throwable> T unwrap(Throwable throwable) {
    if (throwable instanceof InvocationTargetException) {
      throwable = ((InvocationTargetException) throwable).getTargetException();
    }
    if (throwable instanceof CompletionException) {
```

### AssignmentToMethodParameter
Assignment to method parameter `throwable`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/ExceptionFactory.java`
#### Snippet
```java
    }
    if (throwable instanceof CompletionException) {
      throwable = throwable.getCause();
    }
    if (throwable instanceof ExecutionException) {
```

### AssignmentToMethodParameter
Assignment to method parameter `throwable`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/ExceptionFactory.java`
#### Snippet
```java
    }
    if (throwable instanceof ExecutionException) {
      throwable = throwable.getCause();
    }
    return (T) throwable;
```

### AssignmentToMethodParameter
Assignment to method parameter `throwable`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/ExceptionFactory.java`
#### Snippet
```java

  public static Throwable unwrapIncludeInvocationException(Throwable throwable) {
    throwable = unwrap(throwable);
    if (throwable instanceof InvocationException) {
      throwable = throwable.getCause();
```

### AssignmentToMethodParameter
Assignment to method parameter `throwable`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/ExceptionFactory.java`
#### Snippet
```java
    throwable = unwrap(throwable);
    if (throwable instanceof InvocationException) {
      throwable = throwable.getCause();
    }
    return throwable;
```

### AssignmentToMethodParameter
Assignment to method parameter `headers`
in `handlers/handler-router/src/main/java/org/apache/servicecomb/router/custom/RouterServerListFilter.java`
#### Snippet
```java
    for (RouterHeaderFilterExt filterExt : filters) {
      if (filterExt.enabled()) {
        headers = filterExt.doFilter(headers);
      }
    }
```

## RuleId[id=UnnecessaryContinue]
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

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/TrustAllManager.java`
#### Snippet
```java
  @Override
  public X509Certificate[] getAcceptedIssuers() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLCustom.java`
#### Snippet
```java

  public String getHost() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/SSLOptionFactory.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/KeyStoreUtil.java`
#### Snippet
```java
      char[] storeValue) {
    if (storeName == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-ssl/src/main/java/org/apache/servicecomb/foundation/ssl/KeyStoreUtil.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/AbstractObjectManager.java`
#### Snippet
```java
          if (value == null) {
            // 创建失败，下次重新创建
            return null;
          }
          objMap.put(key, value);
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/URIEndpointObject.java`
#### Snippet
```java
    // it's impossible that values is not null and size is 0
    if (values == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/base/DynamicEnumCache.java`
#### Snippet
```java
  public T fromValue(Object value) {
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/base/DynamicEnumCache.java`
#### Snippet
```java
    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
      LOGGER.error("failed to create enum, class={}, value={}.", cls.getName(), value);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/http/HttpUtils.java`
#### Snippet
```java
  public static String parseParamFromHeaderValue(String headerValue, String paramName) {
    if (StringUtils.isEmpty(headerValue)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/http/HttpUtils.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/http/HttpUtils.java`
#### Snippet
```java
  public static String getCharsetFromContentType(String contentType) {
    if (contentType == null) {
      return null;
    }
    int start = contentType.indexOf("charset=");
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/http/HttpUtils.java`
#### Snippet
```java
    int start = contentType.indexOf("charset=");
    if (start < 0) {
      return null;
    }
    String encoding = contentType.substring(start + 8);
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/http/HttpUtils.java`
#### Snippet
```java
  public static String uriDecodePath(String path) {
    if (path == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/NetUtils.java`
#### Snippet
```java
  public static IpPort parseIpPortFromURI(String uriAddress) {
    if (uriAddress == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/NetUtils.java`
#### Snippet
```java
      return parseIpPort(new URI(uriAddress));
    } catch (URISyntaxException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/NetUtils.java`
#### Snippet
```java
  public static String getRealListenAddress(String schema, String address) {
    if (address == null) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/NetUtils.java`
#### Snippet
```java
    } catch (URISyntaxException e) {
      LOGGER.error("address {} is not valid.", address);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/NetUtils.java`
#### Snippet
```java
  public static IpPort parseIpPort(String address) {
    if (address == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/net/NetUtils.java`
#### Snippet
```java
  public static IpPort parseIpPort(String scheme, String authority) {
    if (authority == null) {
      return null;
    }
    return parseIpPort(URI.create(scheme + "://" + authority));
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/JvmUtils.java`
#### Snippet
```java
    if (StringUtils.isEmpty(mainClass)) {
      LOGGER.info("Can't found main class by stackTrace.");
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/JvmUtils.java`
#### Snippet
```java
    } catch (Throwable e) {
      LOGGER.warn("\"{}\" is not a valid class.", mainClass, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/JvmUtils.java`
#### Snippet
```java
    if (StringUtils.isEmpty(mainClass)) {
      LOGGER.info("Can't found main class by manifest.");
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/JvmUtils.java`
#### Snippet
```java
    } catch (Throwable e) {
      LOGGER.warn("\"{}\" is not a valid class.", mainClass, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/JvmUtils.java`
#### Snippet
```java
    } catch (Throwable e) {
      LOGGER.warn("Failed to read Main-Class from \"{}\".", manifestUri, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/BeanUtils.java`
#### Snippet
```java
    if (context == null) {
      // for some test case
      return null;
    }
    return context.getBean(type);
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/LambdaMetafactoryUtils.java`
#### Snippet
```java
    if (Modifier.isNative(instanceMethod.getModifiers())) {
      // fix "Failed to create lambda from public final native java.lang.Class java.lang.Object.getClass()"
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/LambdaMetafactoryUtils.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/PartUtils.java`
#### Snippet
```java
  public static Part getSinglePart(String name, Object value) {
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/ReflectUtils.java`
#### Snippet
```java
        return classLoader.loadClass(clsName);
      } catch (ClassNotFoundException e1) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/ReflectUtils.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/RestObjectMapper.java`
#### Snippet
```java
    // not necessary and will cause some trouble in some user applications that depend on this)
    if (fromValue == null) {
      return null;
    } else {
      Class<?> targetType = toValueType.getRawClass();
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/encrypt/Encryptions.java`
#### Snippet
```java
  public static String decode(String encrypted, String tags) {
    if (encrypted == null) {
      return null;
    }
    char[] result = decode(encrypted.toCharArray(), tags);
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/encrypt/Encryptions.java`
#### Snippet
```java
    char[] result = decode(encrypted.toCharArray(), tags);
    if (result == null) {
      return null;
    }
    return new String(result);
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/encrypt/Encryptions.java`
#### Snippet
```java
  public static String encode(String plain, String tags) {
    if (plain == null) {
      return null;
    }
    char[] result = encode(plain.toCharArray(), tags);
```

### ReturnNull
Return of `null`
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/encrypt/Encryptions.java`
#### Snippet
```java
    char[] result = encode(plain.toCharArray(), tags);
    if (result == null) {
      return null;
    }
    return new String(result);
```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/Discovery.java`
#### Snippet
```java
   */
  default MicroserviceInstances findServiceInstances(String appId, String serviceName, String versionRule) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/DiscoveryManager.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/DiscoveryManager.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/DiscoveryManager.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/cache/MicroserviceInstanceCache.java`
#### Snippet
```java
      logger.error("get microservice instance from cache failed, {}, {}", String.format("%s@%s", serviceId, instanceId),
          e.getMessage());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/cache/MicroserviceInstanceCache.java`
#### Snippet
```java
    } catch (ExecutionException | UncheckedExecutionException e) {
      logger.error("get microservice from cache failed, {}, {}", serviceId, e.getMessage());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/version/VersionRuleLatestParser.java`
#### Snippet
```java
  public VersionRule parse(String strVersionRule) {
    if (!DefinitionConst.VERSION_RULE_LATEST.equals(strVersionRule)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/version/VersionRuleRangeParser.java`
#### Snippet
```java
    int pos = strVersionRule.indexOf('-');
    if (pos <= 0 || pos == strVersionRule.length() - 1) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/version/VersionRuleStartFromParser.java`
#### Snippet
```java
    int pos = strVersionRule.indexOf('+');
    if (pos <= 0 || pos != strVersionRule.length() - 1) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/discovery/DiscoveryContext.java`
#### Snippet
```java
  public DiscoveryTreeNode popRerunFilter() {
    if (rerunStack.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/swagger/SwaggerLoader.java`
#### Snippet
```java
    URL url = JvmUtils.findClassLoader().getResource(path);
    if (url == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/swagger/SwaggerLoader.java`
#### Snippet
```java
        schemaId);

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
      if (ipPort == null) {
        LOGGER.warn("address {} not valid.", address);
        return null;
      }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/RegistrationManager.java`
#### Snippet
```java
    } catch (URISyntaxException e) {
      LOGGER.warn("address {} not valid.", address);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `service-registry/registry-zero-config/src/main/java/org/apache/servicecomb/zeroconfig/multicast/MulticastServer.java`
#### Snippet
```java
      return multicast.recv();
    } catch (SocketTimeoutException ignore) {
      return null;
    } catch (Exception e) {
      LOGGER.error("failed to receive or decode message.", e);
```

### ReturnNull
Return of `null`
in `service-registry/registry-zero-config/src/main/java/org/apache/servicecomb/zeroconfig/multicast/MulticastServer.java`
#### Snippet
```java
    } catch (Exception e) {
      LOGGER.error("failed to receive or decode message.", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `dynamic-config/config-cc/src/main/java/org/apache/servicecomb/config/collect/ConfigCenterDefaultDeploymentProvider.java`
#### Snippet
```java
  public SystemBootstrapInfo getSystemBootStrapInfo(String systemKey) {
    if (!systemKey.equals(SYSTEM_KEY_CONFIG_CENTER)) {
      return null;
    }
    List<String> ccAddresses = ConfigUtil
```

### ReturnNull
Return of `null`
in `dynamic-config/config-cc/src/main/java/org/apache/servicecomb/config/collect/ConfigCenterDefaultDeploymentProvider.java`
#### Snippet
```java
        .parseArrayValue(configuration.getString("servicecomb.config.client.serverUri"));
    if (ccAddresses.isEmpty()) {
      return null;
    }
    SystemBootstrapInfo cc = new SystemBootstrapInfo();
```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/SwaggerEnum.java`
#### Snippet
```java
  private <T extends Annotation> T findAnnotation(Annotation[] annotations, Class<T> cls) {
    if (annotations == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/consumer/MicroserviceVersionRule.java`
#### Snippet
```java
      Collection<MicroserviceInstance> allInstances) {
    if (allInstances.isEmpty()) {
      return allVersions.isEmpty() ? null : allVersions.values().stream()
          .max(Comparator.comparing(MicroserviceVersion::getVersion))
          .get();
```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/ParameterProcessor.java`
#### Snippet
```java

  default Type getGenericType(ANNOTATION parameterAnnotation) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/ModelResolverExt.java`
#### Snippet
```java
    // property is not a model
    if (propertyCreatorMap.containsKey(type.getRawClass())) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/extend/ModelResolverExt.java`
#### Snippet
```java
    Model model = super.resolve(type, context, next);
    if (model == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/model/HttpParameterType.java`
#### Snippet
```java
  public static HttpParameterType parse(String value) {
    if (StringUtils.isEmpty(value)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/parameter/ApiParamProcessor.java`
#### Snippet
```java
  @Override
  public HttpParameterType getHttpParameterType(ApiParam parameterAnnotation) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/response/DefaultResponseTypeProcessor.java`
#### Snippet
```java
    Type responseType = extractResponseType(swaggerGenerator, operationGenerator, genericResponseType);
    if (responseType == null || ReflectionUtils.isVoid(responseType)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/response/DefaultResponseTypeProcessor.java`
#### Snippet
```java
  public Type getProcessType() {
    // not care for this.
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java
  public static Map<String, Property> getBodyProperties(Swagger swagger, Parameter parameter) {
    if (!(parameter instanceof BodyParameter)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java
    Info info = swagger.getInfo();
    if (info == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java
    String name = getInterfaceName(info.getVendorExtensions());
    if (StringUtils.isEmpty(name)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java
  public static <T> T getVendorExtension(Map<String, Object> vendorExtensions, String key) {
    if (vendorExtensions == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java

    if (!(model instanceof RefModel)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/SwaggerUtils.java`
#### Snippet
```java
    String simpleRef = ((RefModel) model).getSimpleRef();
    Model targetModel = swagger.getDefinitions().get(simpleRef);
    return targetModel instanceof ModelImpl ? (ModelImpl) targetModel : null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/unittest/UnitTestSwaggerUtils.java`
#### Snippet
```java
    // 不允许成功
    Assertions.assertEquals("not allowed run to here", "run to here");
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/parameter/EnumPostProcessor.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/parameter/JsonViewProcessor.java`
#### Snippet
```java
  @Override
  public HttpParameterType getHttpParameterType(Annotation parameterAnnotation) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/parameter/JsonViewProcessor.java`
#### Snippet
```java
  @Override
  public String getParameterName(Annotation parameterAnnotation) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/parameter/ApiImplicitParamProcessor.java`
#### Snippet
```java
    if (ReflectionUtils.isVoid(dataTypeClass)) {
      if (StringUtils.isEmpty(apiImplicitParam.dataType())) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/parameter/PartProcessor.java`
#### Snippet
```java
  @Override
  public String getParameterName(Annotation parameterAnnotation) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/SwaggerGeneratorUtils.java`
#### Snippet
```java
    ParameterProcessor<Parameter, Annotation> processor = findParameterProcessors(type);
    if (processor == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/parameter/PartArrayProcessor.java`
#### Snippet
```java
  @Override
  public String getParameterName(Annotation parameterAnnotation) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/parameter/RawJsonRequestBodyProcessor.java`
#### Snippet
```java
      return rawJsonRequestBody.name();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-springmvc/src/main/java/org/apache/servicecomb/swagger/generator/springmvc/processor/annotation/RequestBodyAnnotationProcessor.java`
#### Snippet
```java
  @Override
  public String getParameterName(RequestBody parameterAnnotation) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-springmvc/src/main/java/org/apache/servicecomb/swagger/generator/springmvc/processor/annotation/RequestAttributeAnnotationProcessor.java`
#### Snippet
```java
  @Override
  protected String pureReadDefaultValue(RequestAttribute requestAttribute) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-springmvc/src/main/java/org/apache/servicecomb/swagger/generator/springmvc/processor/annotation/RequestPartAnnotationProcessor.java`
#### Snippet
```java
  @Override
  protected String pureReadDefaultValue(RequestPart requestPart) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
        && definition.getTokenUrl() == null
        && definition.getScopes() == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
        .forEach(annotation -> addSecurityDefinition(definitionMap, annotation.key(), convertBasicAuth(annotation)));

    return definitionMap.isEmpty() ? null : definitionMap;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
  private Info convertInfo(io.swagger.annotations.Info infoAnnotation) {
    if (infoAnnotation == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java

  private String emptyAsNull(@Nonnull String value) {
    return value.isEmpty() ? null : value;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java

    if (StringUtils.isEmpty(externalDocs.getUrl()) && StringUtils.isEmpty(externalDocs.getDescription())) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
  private List<Tag> convertTags(io.swagger.annotations.Tag[] tagArray) {
    if (tagArray == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
        .map(this::convertTag)
        .collect(Collectors.toList());
    return tags.isEmpty() ? null : tags;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
  private SecuritySchemeDefinition convertApiKey(io.swagger.annotations.ApiKeyAuthDefinition annotation) {
    if (StringUtils.isEmpty(annotation.name())) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java

    if (StringUtils.isEmpty(license.getName()) && StringUtils.isEmpty(license.getUrl())) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
  private List<Scheme> convertSchemes(SwaggerDefinition.Scheme[] schemeArray) {
    if (schemeArray == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
        StringUtils.isEmpty(contact.getUrl()) &&
        StringUtils.isEmpty(contact.getEmail())) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/SwaggerDefinitionProcessor.java`
#### Snippet
```java
  private SecuritySchemeDefinition convertBasicAuth(io.swagger.annotations.BasicAuthDefinition annotation) {
    if (annotation.description().isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/AnnotationUtils.java`
#### Snippet
```java
  public static ResponseHeaderConfig convert(ResponseHeader responseHeader) {
    if (StringUtils.isEmpty(responseHeader.name())) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/processor/annotation/AnnotationUtils.java`
#### Snippet
```java
    Class<?> responseClass = config.getResponseClass();
    if (responseClass == null || ReflectionUtils.isVoid(responseClass)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/router/match/RouterRuleMatcher.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/MatchersManager.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/marker/RequestProcessor.java`
#### Snippet
```java
      return (CustomMatch) extractObject;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/handler/AbstractGovernanceHandler.java`
#### Snippet
```java
    POLICY policy = matchPolicy(requestExtractor);
    if (policy == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/handler/AbstractGovernanceHandler.java`
#### Snippet
```java
    String key = createKey(requestExtractor, policy);
    if (key == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-core/src/main/java/org/apache/servicecomb/swagger/generator/core/AbstractOperationGenerator.java`
#### Snippet
```java
            .getType();
    if (ReflectionUtils.isVoid(responseType)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/handler/IdentifierRateLimitingHandler.java`
#### Snippet
```java
        StringUtils.isEmpty(requestExtractor.header(policy.getIdentifier()))) {
      LOGGER.info("identifier rate limiting is not properly configured, identifier is empty.");
      return null;
    }
    return this.rateLimitProperties.getConfigKey()
```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/handler/InstanceBulkheadHandler.java`
#### Snippet
```java
        requestExtractor.instanceId())) {
      LOGGER.info("Instance bulkhead is not properly configured, service id or instance id is empty.");
      return null;
    }
    return matchersManager.match(requestExtractor, bulkheadProperties.getParsedEntity());
```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/handler/InstanceIsolationHandler.java`
#### Snippet
```java
        requestExtractor.instanceId())) {
      LOGGER.debug("Isolation is not properly configured, service id or instance id is empty.");
      return null;
    }
    return matchersManager.match(requestExtractor, instanceIsolationProperties.getParsedEntity());
```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/service/GovernanceCacheImpl.java`
#### Snippet
```java
    } catch (Exception exception) {
      LOG.warn("Failed to get a value from Cache", exception);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/processor/injection/Fault.java`
#### Snippet
```java
              FaultResponse.createFail(fault.getPolicy().getErrorCode(), AbortFault.ABORTED_ERROR_MSG));
        } else {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java
  protected T parseEntityItem(String key, String value) {
    if (StringUtils.isEmpty(value)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java
      if (!result.isValid()) {
        LOGGER.warn("Entity configuration is not valid and ignored. Key [{}], value [{}]", key, value);
        return null;
      }
      if (!servicesMatch(result.getServices())) {
```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java
      if (!servicesMatch(result.getServices())) {
        LOGGER.info("Configuration belongs to other service is ignored. Key [{}]", key);
        return null;
      }
      return result;
```

### ReturnNull
Return of `null`
in `governance/src/main/java/org/apache/servicecomb/governance/properties/GovernanceProperties.java`
#### Snippet
```java
      LOGGER.error("governance config yaml is illegal : {}", e.getMessage());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/bootup/FilterChainCollector.java`
#### Snippet
```java
  @Override
  public String collect() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/executor/ExecutorManager.java`
#### Snippet
```java
    String id = DynamicPropertyFactory.getInstance().getStringProperty(configKey, null).get();
    if (id == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/registry/discovery/EndpointDiscoveryFilter.java`
#### Snippet
```java
    if (transport == null) {
      LOGGER.info("not deployed transport {}, ignore {}.", transportName, endpoint);
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/definition/MicroserviceMeta.java`
#### Snippet
```java
    List<SchemaMeta> schemaList = intfSchemaMetas.get(schemaIntf);
    if (schemaList == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/Invocation.java`
#### Snippet
```java
  public String getTransportName() {
    if (endpoint == null || endpoint.getTransport() == null) {
      return null;
    }
    return endpoint.getTransport().getName();
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/governance/ServiceCombCircuitBreakerExtension.java`
#### Snippet
```java
  protected String extractStatusCode(Object result) {
    if (!(result instanceof Response)) {
      return null;
    }
    Response resp = (Response) result;
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/governance/MatchType.java`
#### Snippet
```java
        }
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/governance/MatchType.java`
#### Snippet
```java
        return invocation.getMicroserviceName();
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/governance/MatchType.java`
#### Snippet
```java
      }

      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/governance/ServiceCombRetryExtension.java`
#### Snippet
```java
  protected String extractStatusCode(Object result) {
    if (!(result instanceof Response)) {
      return null;
    }
    Response resp = (Response) result;
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/invocation/endpoint/EndpointUtils.java`
#### Snippet
```java
    String path = builder.getPath();
    if (path == null) {
      return null;
    }
    if (path.startsWith("/")) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/servicecomb/core/transport/AbstractTransport.java`
#### Snippet
```java
  public Object parseAddress(String address) {
    if (address == null) {
      return null;
    }
    return new URIEndpointObject(address);
```

### ReturnNull
Return of `null`
in `service-registry/registry-schema-discovery/src/main/java/org/apache/servicecomb/schemadiscovery/SchemaDiscovery.java`
#### Snippet
```java
  @Override
  public Microservice getMicroservice(String microserviceId) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-schema-discovery/src/main/java/org/apache/servicecomb/schemadiscovery/SchemaDiscovery.java`
#### Snippet
```java
  public String getSchema(String microserviceId, Collection<MicroserviceInstance> instances, String schemaId) {
    if (instances == null || instances.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `service-registry/registry-schema-discovery/src/main/java/org/apache/servicecomb/schemadiscovery/SchemaDiscovery.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-schema-discovery/src/main/java/org/apache/servicecomb/schemadiscovery/SchemaDiscovery.java`
#### Snippet
```java
  @Override
  public List<Microservice> getAllMicroservices() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-schema-discovery/src/main/java/org/apache/servicecomb/schemadiscovery/SchemaDiscovery.java`
#### Snippet
```java
  @Override
  public MicroserviceInstance getMicroserviceInstance(String serviceId, String instanceId) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-spi/src/main/java/org/apache/servicecomb/foundation/common/utils/SPIServiceUtils.java`
#### Snippet
```java
    if (services.isEmpty()) {
      LOGGER.info("Can not find SPI service for {}", serviceType.getName());
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-spi/src/main/java/org/apache/servicecomb/foundation/common/utils/SPIServiceUtils.java`
#### Snippet
```java
    if (services.isEmpty()) {
      LOGGER.info("Can not find SPI service for {}", serviceType.getName());
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-spi/src/main/java/org/apache/servicecomb/foundation/common/utils/SPIServiceUtils.java`
#### Snippet
```java
    if (services.isEmpty()) {
      LOGGER.info("Can not find SPI service for {}", serviceType.getName());
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/EmptyAsyncContext.java`
#### Snippet
```java
  @Override
  public ServletRequest getRequest() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/EmptyAsyncContext.java`
#### Snippet
```java
  @Override
  public <T extends AsyncListener> T createListener(Class<T> clazz) throws ServletException {
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/EmptyAsyncContext.java`
#### Snippet
```java
  @Override
  public ServletResponse getResponse() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/StandardHttpServletRequestEx.java`
#### Snippet
```java
  public String getParameter(String name) {
    String[] values = getParameterMap().get(name);
    return values == null ? null : values[0];
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/VertxServerRequestToHttpServletRequest.java`
#### Snippet
```java
    }
    if (context.body().buffer() == null) {
      return null;
    }
    inputStream = new BufferInputStream(context.body().buffer().getByteBuf());
```

### ReturnNull
Return of `null`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/VertxServerRequestToHttpServletRequest.java`
#### Snippet
```java
    if (parameterMap != null) {
      String[] values = parameterMap.get(name);
      return values == null ? null : values[0];
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/http/VertxServerRequestToHttpServletRequest.java`
#### Snippet
```java
    if (!upload.isPresent()) {
      LOGGER.debug("No such file with name: {}.", name);
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/client/http/HttpClients.java`
#### Snippet
```java
    if (poolManager == null) {
      LOGGER.error("client name [{}] not exists, should only happen in tests.", clientName);
      return null;
    }
    return poolManager.findClientPool(sync, targetContext);
```

### ReturnNull
Return of `null`
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/client/tcp/TcpClientConnection.java`
#### Snippet
```java

  protected TcpOutputStream createLogin() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `dynamic-config/config-kie/src/main/java/org/apache/servicecomb/config/kie/collect/KieCenterDefaultDeploymentProvider.java`
#### Snippet
```java
  public SystemBootstrapInfo getSystemBootStrapInfo(String systemKey) {
    if (!systemKey.equals(SYSTEM_KEY_KIE_CENTER)) {
      return null;
    }
    List<String> kieAddresses = ConfigUtil
```

### ReturnNull
Return of `null`
in `dynamic-config/config-kie/src/main/java/org/apache/servicecomb/config/kie/collect/KieCenterDefaultDeploymentProvider.java`
#### Snippet
```java
        .parseArrayValue(configuration.getString("servicecomb.kie.serverUri"));
    if (kieAddresses.isEmpty()) {
      return null;
    }
    SystemBootstrapInfo kie = new SystemBootstrapInfo();
```

### ReturnNull
Return of `null`
in `handlers/handler-flowcontrol-qps/src/main/java/org/apache/servicecomb/qps/strategy/DefaultStrategyFactory.java`
#### Snippet
```java
        return new FixedWindowStrategy();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `deployment/src/main/java/org/apache/servicecomb/deployment/Deployment.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `handlers/handler-flowcontrol-qps/src/main/java/org/apache/servicecomb/qps/QpsControllerManager.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `dynamic-config/config-nacos/src/main/java/org/apache/servicecomb/config/nacos/client/NacosClient.java`
#### Snippet
```java
              @Override
              public Executor getExecutor() {
                return null;
              }
            });
```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/RestProducerInvocationFlow.java`
#### Snippet
```java

    flushResponse("UNKNOWN_OPERATION");
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/PathProcessorCreator.java`
#### Snippet
```java
      Map<String, String> pathVarMap = (Map<String, String>) request.getAttribute(RestConst.PATH_PARAMETERS);
      if (pathVarMap == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/PathProcessorCreator.java`
#### Snippet
```java
      String value = pathVarMap.get(paramPath);
      if (value == null) {
        return null;
      }
      return convertValue(StringUtils.uriDecode(value, StandardCharsets.UTF_8), targetType);
```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/ParamValueProcessor.java`
#### Snippet
```java

  default Class<?> getSerialViewClass() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/QueryProcessorCreator.java`
#### Snippet
```java
      }

      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/HeaderProcessorCreator.java`
#### Snippet
```java
        if (headerValues == null) {
          //Even if the paramPath does not exist, headerValues won't be null at now
          return null;
        }
        return convertValue(Collections.list(headerValues), targetType);
```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/query/QueryCodecJson.java`
#### Snippet
```java
    Object value = processor.getAndCheckParameter(request);
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/produce/ProduceProcessor.java`
#### Snippet
```java
  default Buffer encodeResponse(Object result) throws Exception {
    if (null == result) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/produce/ProduceProcessor.java`
#### Snippet
```java
  default Object decodeResponse(Buffer buffer, JavaType type) throws Exception {
    if (buffer.length() == 0) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/query/QueryCodecWithDelimiter.java`
#### Snippet
```java
    }

    return hasValue ? QueryCodec.encodeValue(joiner.toString()) : null;
  }

```

### ReturnNull
Return of `null`
in `clients/service-center-client/src/main/java/org/apache/servicecomb/service/center/client/ServiceCenterClient.java`
#### Snippet
```java
          .getMessage()
          + "; content = " + response.getContent());
      return null;
    } catch (IOException e) {
      throw new OperationException(
```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/BodyProcessorCreator.java`
#### Snippet
```java
      InputStream inputStream = request.getInputStream();
      if (inputStream == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/BodyProcessorCreator.java`
#### Snippet
```java
      InputStream inputStream = request.getInputStream();
      if (inputStream == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/param/BodyProcessorCreator.java`
#### Snippet
```java
        if (!isRequired && e.getMessage().contains("No content to map due to end-of-input")) {
          LOGGER.info("Empty content and required is false, taken as null");
          return null;
        }
        throw e;
```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/filter/inner/ClientRestArgsFilter.java`
#### Snippet
```java
  @Override
  public Response afterReceiveResponse(Invocation invocation, HttpServletResponseEx responseEx) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/filter/inner/ServerRestArgsFilter.java`
#### Snippet
```java
    Map<String, Object> swaggerArguments = RestCodec.restToArgs(requestEx, restOperationMeta);
    invocation.setSwaggerArguments(swaggerArguments);
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/codec/produce/ProduceProcessorManager.java`
#### Snippet
```java
    Map<String, ProduceProcessor> viewMap = findValue(acceptType);
    if (CollectionUtils.isEmpty(viewMap)) {
      return null;
    }
    if (serialViewClass == null) {
```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/resource/ClassPathStaticResourceHandler.java`
#### Snippet
```java
    URL url = this.getClass().getClassLoader().getResource(path);
    if (url == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/OperationLocator.java`
#### Snippet
```java
    OperationGroup group = staticPathOperations.get(path);
    if (group == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/locator/OperationLocator.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestParam.java`
#### Snippet
```java
    Object value = args.get(paramName);
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/path/PathRegExp.java`
#### Snippet
```java
    Matcher matcher = pattern.matcher(path);
    if (!matcher.matches()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestOperationMeta.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-rest/src/main/java/org/apache/servicecomb/common/rest/definition/RestOperationMeta.java`
#### Snippet
```java
    } catch (Exception e) {
      LOGGER.error(e.getMessage());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/RegistryUtils.java`
#### Snippet
```java
        return microserviceInstances;
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/RegistryUtils.java`
#### Snippet
```java
    );
    return MicroserviceCacheStatus.SERVICE_NOT_FOUND.equals(serviceCache.getStatus()) ?
        null : serviceCache.getInstances();
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/TokenCacheManager.java`
#### Snippet
```java
    public String getToken() {
      if (!enabled()) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/auth/TokenCacheManager.java`
#### Snippet
```java
      } catch (Exception e) {
        LOGGER.error("failed to create token", e);
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/RegistryHttpClientOptionsSPI.java`
#### Snippet
```java
  @Override
  public ConcurrentCompositeConfiguration getConfigReader() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/collect/ServiceCenterDefaultDeploymentProvider.java`
#### Snippet
```java
  public SystemBootstrapInfo getSystemBootStrapInfo(String systemKey) {
    if (!systemKey.equals(SYSTEM_KEY_SERVICE_CENTER)) {
      return null;
    }
    SystemBootstrapInfo sc = new SystemBootstrapInfo();
```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/refresh/ClassificationAddress.java`
#### Snippet
```java
    } else {
      if (kieCaches.getInstanceMap().size() <= 0) {
        return null;
      }
      cacheEndpoints = kieCaches.getOrCreateTransportMap().get(defaultTransport);
```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/refresh/ClassificationAddress.java`
#### Snippet
```java
    MicroserviceInstance myself = RegistrationManager.INSTANCE.getMicroserviceInstance();
    if (myself.getDataCenterInfo() == null) {
      return null;
    }
    return myself.getDataCenterInfo();
```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/AbstractServiceRegistry.java`
#### Snippet
```java
    MicroserviceInstances instances = findServiceInstances(appId, serviceName, versionRule);
    if (instances == null || instances.isMicroserviceNotExist()) {
      return null;
    }
    return instances.getInstancesResponse().getInstances();
```

### ReturnNull
Return of `null`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/BootStrapProperties.java`
#### Snippet
```java

    if (null == descriptionArray || descriptionArray.length < 1) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/PriorityProperty.java`
#### Snippet
```java

    if (Objects.equals(lastValue, value)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/RoundRobinRuleExt.java`
#### Snippet
```java
  public ServiceCombServer choose(List<ServiceCombServer> servers, Invocation invocation) {
    if (servers.isEmpty()) {
      return null;
    }
    int index = Math.abs(counter.getAndIncrement()) % servers.size();
```

### ReturnNull
Return of `null`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/ExtensionsFactory.java`
#### Snippet
```java

  default RuleExt createLoadBalancerRule(String ruleName) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/ExtensionsFactory.java`
#### Snippet
```java

  default ServerListFilterExt createServerListFilter(String key, String value, Object... args) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/RandomRuleExt.java`
#### Snippet
```java
  public ServiceCombServer choose(List<ServiceCombServer> servers, Invocation invocation) {
    if (servers.isEmpty()) {
      return null;
    }
    int index = Math.abs(ThreadLocalRandom.current().nextInt()) % servers.size();
```

### ReturnNull
Return of `null`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigUtil.java`
#### Snippet
```java
    if (ConfigurationManager.isConfigurationInstalled()) {
      LOGGER.warn("Configuration installed by others, will ignore this configuration.");
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigUtil.java`
#### Snippet
```java
    if (null == configCenterConfigurationSource) {
      LOGGER.info("none of config center source enabled.");
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigUtil.java`
#### Snippet
```java
      return configuration.getProperty(key);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/LoadBalancer.java`
#### Snippet
```java
    ServiceCombServer server = rule.choose(servers, invocation);
    if (null == server) {
      return null;
    }
    return server;
```

### ReturnNull
Return of `null`
in `handlers/handler-loadbalance/src/main/java/org/apache/servicecomb/loadbalance/filter/ServerDiscoveryFilter.java`
#### Snippet
```java
    if (transport == null) {
      LOGGER.info("not deployed transport {}, ignore {}.", transportName, endpoint);
      return null;
    }
    Invocation invocation = context.getInputParameters();
```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-springmvc/src/main/java/org/apache/servicecomb/swagger/invocation/converter/PartListToMultipartListConverter.java`
#### Snippet
```java
  public Object convert(Object value) {
    if (value == null) {
      return null;
    }
    @SuppressWarnings("unchecked")
```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-springmvc/src/main/java/org/apache/servicecomb/swagger/invocation/converter/PartToMultipartConverter.java`
#### Snippet
```java
  public Object convert(Object value) {
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-springmvc/src/main/java/org/apache/servicecomb/swagger/invocation/converter/PartListToMultipartArrayConverter.java`
#### Snippet
```java
  public Object convert(Object value) {
    if (value == null) {
      return null;
    }
    @SuppressWarnings("unchecked")
```

### ReturnNull
Return of `null`
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MonitorDefaultDeploymentProvider.java`
#### Snippet
```java
  public SystemBootstrapInfo getSystemBootStrapInfo(String systemKey) {
    if (!systemKey.equals(MonitorConstant.SYSTEM_KEY_DASHBOARD_SERVICE)) {
      return null;
    }
    List<String> msAddresses = ConfigUtil.parseArrayValue(configuration.getString(MonitorConstant.MONITOR_URI));
```

### ReturnNull
Return of `null`
in `huawei-cloud/dashboard/src/main/java/org/apache/servicecomb/huaweicloud/dashboard/monitor/MonitorDefaultDeploymentProvider.java`
#### Snippet
```java
    List<String> msAddresses = ConfigUtil.parseArrayValue(configuration.getString(MonitorConstant.MONITOR_URI));
    if (msAddresses.isEmpty()) {
      return null;
    }
    SystemBootstrapInfo ms = new SystemBootstrapInfo();
```

### ReturnNull
Return of `null`
in `service-registry/registry-lightweight/src/main/java/org/apache/servicecomb/registry/lightweight/store/Store.java`
#### Snippet
```java
    MicroserviceStore microserviceStore = findMicroserviceStore(serviceId);
    if (microserviceStore == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/publish/spectator/DefaultTagFinder.java`
#### Snippet
```java
    }

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/registry/GlobalRegistry.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/publish/spectator/MeasurementNode.java`
#### Snippet
```java
  public MeasurementNode findChild(String childName) {
    if (children == null) {
      return null;
    }
    return children.get(childName);
```

### ReturnNull
Return of `null`
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/publish/spectator/MeasurementNode.java`
#### Snippet
```java
    for (String childName : childNames) {
      if (node == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/time/MockClock.java`
#### Snippet
```java
  @Override
  public Instant instant() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/time/MockClock.java`
#### Snippet
```java
  @Override
  public ZoneId getZone() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-test-scaffolding/src/main/java/org/apache/servicecomb/foundation/test/scaffolding/time/MockClock.java`
#### Snippet
```java
  @Override
  public Clock withZone(ZoneId zone) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/HighwayProducerInvocationFlow.java`
#### Snippet
```java
  protected Invocation sendCreateInvocationException(Throwable throwable) {
    logException(throwable);
    return null;
  }

```

### ReturnNull
Return of `null`
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/HighwayServerConnection.java`
#### Snippet
```java

      netSocket.close();
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/ModelAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SerializableParameterAdapter.java`
#### Snippet
```java
  @Override
  public Property getMapItem() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/ModelAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SerializableParameterAdapter.java`
#### Snippet
```java
  @Override
  public String getRefType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/ModelAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SerializableParameterAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/ModelAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/ModelAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/message/Headers.java`
#### Snippet
```java
  public Object getFirst(String name) {
    if (headerMap == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/message/Headers.java`
#### Snippet
```java
    List<Object> values = headerMap.get(name);
    if (values == null || values.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `transports/transport-highway/src/main/java/org/apache/servicecomb/transport/highway/message/Headers.java`
#### Snippet
```java
  public List<Object> getHeader(String name) {
    if (headerMap == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/PropertyAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/PropertyAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/PropertyAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
      LOGGER.error("query servicecenter version info failed.", e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
    MicroserviceInstances instances = findServiceInstances(consumerId, appId, serviceName, versionRule, null);
    if (instances == null) {
      return null;
    }
    return instances.getInstancesResponse().getInstances();
```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
      LOGGER.error("query microservice instances {} failed", providerId, e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
      LOGGER.error("register microservice instance {} failed", instance.getServiceId(), e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
          e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/BodyParameterAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
      LOGGER.error("query microservice {} failed", microserviceId, e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
          e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/BodyParameterAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
          e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/BodyParameterAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
      }
      if (microserviceInstances.getInstancesResponse() == null) {
        return null; // error
      }
      List<MicroserviceInstance> list = microserviceInstances.getInstancesResponse().getInstances();
```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/BodyParameterAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
          e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/BodyParameterAdapter.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
        return holder.value.getInstance();
      }
      return null;
    } catch (Exception e) {
      LOGGER.error("get instance from sc failed");
```

### ReturnNull
Return of `null`
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/client/http/ServiceRegistryClientImpl.java`
#### Snippet
```java
    } catch (Exception e) {
      LOGGER.error("get instance from sc failed");
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/definition/HighwayJsonUtils.java`
#### Snippet
```java
  public static <T> T convertValue(Object fromValue, JavaType toValueType) {
    if (fromValue == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/definition/ResponseRootDeserializer.java`
#### Snippet
```java
    if (empty) {
      rootDeserializer.deserialize(bytes); // read buffers if possible.
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/SchemaReader.java`
#### Snippet
```java
   */
  default T newMessage() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/io/protostuff/runtime/ArrayFieldMapEx.java`
#### Snippet
```java
  @Override
  public FieldSchema<T> getFieldByNumber(int n) {
    return n < fieldsByNumber.length ? fieldsByNumber[n] : null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/bean/BeanDescriptor.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/bean/BeanDescriptor.java`
#### Snippet
```java
    }

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/ProtoMapper.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/any/AnyEntrySchema.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java
      return enumName;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-protobuf/src/main/java/org/apache/servicecomb/codec/protobuf/internal/converter/SwaggerToProtoGenerator.java`
#### Snippet
```java
        throw new IllegalStateException("not support swagger type: " + swaggerType);
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/serializer/SerializerSchemaManager.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportWrite(protoField, propertyDescriptor.getJavaType().getRawClass());
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/SInt32ReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/Fixed64ReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/EnumsReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/SFixed32ReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/BoolReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/BytesReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/DoubleReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/UInt64ReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/SFixed64ReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/Int32ReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/Fixed32ReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/UInt32ReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/SInt64ReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/StringReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/scalar/FloatReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/repeated/RepeatedReadSchemas.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportMerge(protoField, javaType);
    return null;
  }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/deserializer/DeserializerSchemaManager.java`
#### Snippet
```java
    }
    ProtoUtils.throwNotSupportMerge(protoField, propertyDescriptor.getJavaType());
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseRequestCallback.java`
#### Snippet
```java
      //    .postForObject("/testListObjectParam", request, List.class);
      // will using server schema type to deserialize
      return null;
    }
    // code: MyObject response = .postForObject("/testListObjectParam", request, MyObject.class);
```

### ReturnNull
Return of `null`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/async/CseAsyncClientHttpRequest.java`
#### Snippet
```java
  @Override
  public OutputStream getBody() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/DarklaunchRule.java`
#### Snippet
```java
  public static DarklaunchRule parse(String ruleStr) {
    if (StringUtils.isEmpty(ruleStr)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/DarklaunchRule.java`
#### Snippet
```java
      LOG.warn("Invalid configuration: rule={},message={}", ruleStr, e.getMessage());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `huawei-cloud/darklaunch/src/main/java/org/apache/servicecomb/darklaunch/DarklaunchServerListFilter.java`
#### Snippet
```java
      return item.getServers();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `service-registry/registry-local/src/main/java/org/apache/servicecomb/localregistry/LocalRegistryStore.java`
#### Snippet
```java
    Microservice microservice = microserviceMap.get(microserviceId);
    if (microservice == null) {
      return null;
    }
    return microserviceMap.get(microserviceId).getSchemaMap().get(schemaId);
```

### ReturnNull
Return of `null`
in `service-registry/registry-local/src/main/java/org/apache/servicecomb/localregistry/LocalRegistryStore.java`
#### Snippet
```java
    Map<String, MicroserviceInstance> microserviceInstance = microserviceInstanceMap.get(serviceId);
    if (microserviceInstance == null) {
      return null;
    }
    return microserviceInstanceMap.get(serviceId).get(instanceId);
```

### ReturnNull
Return of `null`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CseClientHttpRequest.java`
#### Snippet
```java
  @Override
  public OutputStream getBody() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/element/impl/InvocationContextAccessItem.java`
#### Snippet
```java
    Map<String, Object> data = accessLogEvent.getRoutingContext().data();
    if (null == data || null == data.get(RestConst.REST_INVOCATION_CONTEXT)) {
      return null;
    }
    return ((Invocation) data.get(RestConst.REST_INVOCATION_CONTEXT)).getContext(varName);
```

### ReturnNull
Return of `null`
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/parser/impl/VertxRestAccessLogPatternParser.java`
#### Snippet
```java
    public String getPrefix() {
      if (null == accessLogItemMeta) {
        return null;
      }
      return accessLogItemMeta.getPrefix();
```

### ReturnNull
Return of `null`
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/parser/impl/VertxRestAccessLogPatternParser.java`
#### Snippet
```java
    public String getSuffix() {
      if (null == accessLogItemMeta) {
        return null;
      }
      return accessLogItemMeta.getSuffix();
```

### ReturnNull
Return of `null`
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/parser/impl/VertxRestAccessLogPatternParser.java`
#### Snippet
```java
    if (null == accessLogItemLocation.getSuffix()) {
      // simple AccessLogItem
      return null;
    }

```

### ReturnNull
Return of `null`
in `foundations/foundation-protobuf/src/main/java/org/apache/servicecomb/foundation/protobuf/internal/schema/SchemaManager.java`
#### Snippet
```java

    ProtoUtils.throwNotSupportWrite(protoField, propertyDescriptor.getJavaType().getRawClass());
    return null;
  }

```

### ReturnNull
Return of `null`
in `metrics/metrics-core/src/main/java/org/apache/servicecomb/metrics/core/publish/PublishModelFactory.java`
#### Snippet
```java
    MeasurementNode node = tree.findChild(MeterInvocationConst.INVOCATION_NAME, invocationTypeName);
    if (node == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
  @Override
  public ServletInputStream getInputStream() throws IOException {
    return null;
  }

```

### ReturnNull
Return of `null`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
    Object value = form.get(name);
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
      Collection<?> collection = (Collection<?>) value;
      if (collection.isEmpty()) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
    List<String> queryValues = queryParams.get(name);
    if (queryValues == null || queryValues.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `providers/provider-springmvc/src/main/java/org/apache/servicecomb/provider/springmvc/reference/CommonToHttpServletRequest.java`
#### Snippet
```java
    List<String> headerValues = httpHeaders.get(name);
    if (headerValues == null || headerValues.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/RestClientDecoder.java`
#### Snippet
```java
    String contentType = response.getHeader(HttpHeaders.CONTENT_TYPE);
    if (contentType == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/HttpTransportHttpClientOptionsSPI.java`
#### Snippet
```java
  @Override
  public String getProxyPassword() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/HttpTransportHttpClientOptionsSPI.java`
#### Snippet
```java
  @Override
  public String getProxyHost() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/HttpTransportHttpClientOptionsSPI.java`
#### Snippet
```java
  @Override
  public String getProxyUsername() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/HttpTransportHttpClientOptionsSPI.java`
#### Snippet
```java
  @Override
  public ConcurrentCompositeConfiguration getConfigReader() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-client/src/main/java/org/apache/servicecomb/transport/rest/client/http/DefaultHttpClientFilter.java`
#### Snippet
```java
    String contentType = responseEx.getHeader(HttpHeaders.CONTENT_TYPE);
    if (contentType == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/EdgeAddHeaderClientFilter.java`
#### Snippet
```java
  @Override
  public Response afterReceiveResponse(Invocation invocation, HttpServletResponseEx responseEx) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `providers/provider-rest-common/src/main/java/org/apache/servicecomb/provider/rest/common/RestProducerProvider.java`
#### Snippet
```java
    // for some UT case, there is no spring context
    if (BeanUtils.getContext() == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/URLMappedEdgeDispatcher.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/engine/SwaggerConsumer.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `edge/edge-core/src/main/java/org/apache/servicecomb/edge/core/CommonHttpEdgeDispatcher.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `providers/provider-rest-common/src/main/java/org/apache/servicecomb/provider/rest/common/InvocationToHttpServletRequest.java`
#### Snippet
```java
  @Override
  public String getCharacterEncoding() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `providers/provider-rest-common/src/main/java/org/apache/servicecomb/provider/rest/common/InvocationToHttpServletRequest.java`
#### Snippet
```java
  @Override
  public String getContentType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `providers/provider-rest-common/src/main/java/org/apache/servicecomb/provider/rest/common/InvocationToHttpServletRequest.java`
#### Snippet
```java
    RestParam param = swaggerOperation.getParamByName(name);
    if (param == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `providers/provider-rest-common/src/main/java/org/apache/servicecomb/provider/rest/common/InvocationToHttpServletRequest.java`
#### Snippet
```java
    RestParam param = swaggerOperation.getParamByName(name);
    if (param == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `providers/provider-rest-common/src/main/java/org/apache/servicecomb/provider/rest/common/InvocationToHttpServletRequest.java`
#### Snippet
```java
    Object value = param.getValue(invocation.getSwaggerArguments());
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/context/ContextUtils.java`
#### Snippet
```java
    }

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/Response.java`
#### Snippet
```java
  public List<String> getHeaders(String name) {
    if (headers == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/Response.java`
#### Snippet
```java
  public String getHeader(String name) {
    if (headers == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/AbstractArgumentsMapperCreator.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/arguments/AbstractArgumentsMapperCreator.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/converter/impl/part/PartListToPartArrayConverter.java`
#### Snippet
```java
  public Object convert(Object value) {
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/exception/DefaultExceptionToProducerResponseConverter.java`
#### Snippet
```java
  public Class<Throwable> getExceptionClass() {
    // default logic, not bind to special class
    return null;
  }

```

### ReturnNull
Return of `null`
in `swagger/swagger-invocation/invocation-core/src/main/java/org/apache/servicecomb/swagger/invocation/generator/ScbResponseProcessor.java`
#### Snippet
```java
  public Type extractResponseType(SwaggerGenerator swaggerGenerator, OperationGenerator operationGenerator,
      Type genericResponseType) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `swagger/swagger-generator/generator-jaxrs/src/main/java/org/apache/servicecomb/swagger/generator/jaxrs/processor/response/JaxrsResponseProcessor.java`
#### Snippet
```java
  @Override
  public Type extractResponseType(Type genericResponseType) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/HttpResponse.java`
#### Snippet
```java
  public String getHeader(String key) {
    if (headers == null) {
      return null;
    }
    for (Header header : headers) {
```

### ReturnNull
Return of `null`
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/HttpResponse.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/URLEndPoint.java`
#### Snippet
```java
    List<String> values = querys.get(key);
    if (values == null) {
      return null;
    }
    return values.get(0);
```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/RestServletInjector.java`
#### Snippet
```java
    if (urlPatterns.length == 0) {
      LOGGER.warn("urlPattern is empty, ignore register {}.", SERVLET_NAME);
      return null;
    }

```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/RestServletInjector.java`
#### Snippet
```java
    if (!ServletUtils.canPublishEndpoint(listenAddress)) {
      LOGGER.warn("ignore register {}.", SERVLET_NAME);
      return null;
    }

```

### ReturnNull
Return of `null`
in `handlers/handler-router/src/main/java/org/apache/servicecomb/router/custom/RouterInvokeFilter.java`
#### Snippet
```java
      HttpServletRequestEx httpServletRequestEx) {
    if (!StringUtils.isEmpty(invocation.getContext(RouterServerListFilter.ROUTER_HEADER))) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `handlers/handler-router/src/main/java/org/apache/servicecomb/router/custom/RouterInvokeFilter.java`
#### Snippet
```java

    if (!isHaveHeadersRule()) {
      return null;
    }
    if (loadHeaders()) {
```

### ReturnNull
Return of `null`
in `handlers/handler-router/src/main/java/org/apache/servicecomb/router/custom/RouterInvokeFilter.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/ServletUtils.java`
#### Snippet
```java
    String[] urlPatterns = collectUrlPatterns(servletContext, servletCls);
    if (urlPatterns.length == 0) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `transports/transport-rest/transport-rest-servlet/src/main/java/org/apache/servicecomb/transport/rest/servlet/ServletUtils.java`
#### Snippet
```java
      Class<?> servletCls) {
    if (servletContext == null) {
      return null;
    }
    return servletContext.getServletRegistrations()
```

### ReturnNull
Return of `null`
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/HttpTransportImpl.java`
#### Snippet
```java
  private static SignRequest createSignRequest() {
    // Now the implementations do not process SignRequest, so return null. Maybe future will use it.
    return null;
  }

```

### ReturnNull
Return of `null`
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/RSAAuthenticationToken.java`
#### Snippet
```java
    String[] tokenArr = token.split("@");
    if (tokenArr.length != 5) {
      return null;
    }
    return new RSAAuthenticationToken(tokenArr[0], tokenArr[1],
```

### ReturnNull
Return of `null`
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/consumer/ConsumerTokenManager.java`
#### Snippet
```java
    if (instanceId == null || serviceId == null) {
      LOGGER.error("service not ready when create token.");
      return null;
    }

```

### ReturnNull
Return of `null`
in `handlers/handler-publickey-auth/src/main/java/org/apache/servicecomb/authentication/consumer/ConsumerTokenManager.java`
#### Snippet
```java
    } catch (Exception e) {
      LOGGER.error("create token error", e);
      return null;
    }
    return token.format();
```

### ReturnNull
Return of `null`
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/AbstractAddressManager.java`
#### Snippet
```java
      return new URI(uri);
    } catch (URISyntaxException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `clients/http-client-common/src/main/java/org/apache/servicecomb/http/client/common/AbstractAddressManager.java`
#### Snippet
```java
  private String getInitAddress() {
    if (addresses.isEmpty()) {
      return null;
    }
    return getCurrentAddress(addresses);
```

## RuleId[id=UnnecessaryLocalVariable]
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
Local variable `config` is redundant
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigUtil.java`
#### Snippet
```java
    }

    ConcurrentCompositeConfiguration config = ConfigUtil.createLocalConfig(loader.getConfigModels());
    return config;
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

## RuleId[id=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `foundations/foundation-common/src/main/java/org/apache/servicecomb/foundation/common/utils/KeyPairEntry.java`
#### Snippet
```java
import java.security.PublicKey;

public final class KeyPairEntry {

  private final PrivateKey privateKey;
```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/event/CreateMicroserviceEvent.java`
#### Snippet
```java
import org.apache.servicecomb.registry.consumer.MicroserviceVersions;

public class CreateMicroserviceEvent {
  private final MicroserviceVersions microserviceVersions;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/event/DestroyMicroserviceEvent.java`
#### Snippet
```java
import org.apache.servicecomb.registry.consumer.MicroserviceVersions;

public class DestroyMicroserviceEvent {
  private final MicroserviceVersions microserviceVersions;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/event/CreateMicroserviceVersionEvent.java`
#### Snippet
```java
import org.apache.servicecomb.registry.consumer.MicroserviceVersion;

public class CreateMicroserviceVersionEvent {
  private final MicroserviceVersion microserviceVersion;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/event/MicroserviceInstanceRegisteredEvent.java`
#### Snippet
```java
 * when registration is ready, should post this event.
 */
public class MicroserviceInstanceRegisteredEvent {
  private final String registrationName;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/api/event/DestroyMicroserviceVersionEvent.java`
#### Snippet
```java
import org.apache.servicecomb.registry.consumer.MicroserviceVersion;

public class DestroyMicroserviceVersionEvent {
  private final MicroserviceVersion microserviceVersion;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-registry/src/main/java/org/apache/servicecomb/registry/cache/CacheEndpoint.java`
#### Snippet
```java
import org.apache.servicecomb.registry.api.registry.MicroserviceInstance;

public class CacheEndpoint {
  // 所属的服务实例
  private final MicroserviceInstance instance;
```

### ClassCanBeRecord
Class can be a record
in `governance/src/main/java/org/apache/servicecomb/governance/event/GovernanceConfigurationChangedEvent.java`
#### Snippet
```java
import java.util.Set;

public class GovernanceConfigurationChangedEvent {
  private final Set<String> changedConfigurations;

```

### ClassCanBeRecord
Class can be a record
in `governance/src/main/java/org/apache/servicecomb/governance/processor/loadbanlance/LoadBalanceImpl.java`
#### Snippet
```java
package org.apache.servicecomb.governance.processor.loadbanlance;

public class LoadBalanceImpl implements LoadBalance {
  private final String rule;

```

### ClassCanBeRecord
Class can be a record
in `core/src/main/java/org/apache/servicecomb/core/governance/MatchType.java`
#### Snippet
```java

public final class MatchType {
  private static class GovernanceRequestExtractorImpl implements GovernanceRequestExtractor {
    private final Invocation invocation;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/client/http/HttpClientWithContext.java`
#### Snippet
```java
import io.vertx.core.http.HttpClient;

public class HttpClientWithContext {
  public interface RunHandler {
    void run(HttpClient httpClient);
```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/metrics/DefaultHttpServerMetrics.java`
#### Snippet
```java
 * important: not singleton, every HttpServer instance relate to an HttpServerMetrics instance
 */
public class DefaultHttpServerMetrics implements
    HttpServerMetrics<DefaultRequestMetric, Object, DefaultTcpSocketMetric> {
  private final DefaultServerEndpointMetric endpointMetric;
```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/metrics/DefaultClientMetrics.java`
#### Snippet
```java
import io.vertx.core.spi.observability.HttpResponse;

public class DefaultClientMetrics implements
    ClientMetrics<DefaultRequestMetric, DefaultClientTaskMetric, HttpRequest, HttpResponse> {
  private final DefaultClientEndpointMetric clientEndpointMetric;
```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-vertx/src/main/java/org/apache/servicecomb/foundation/vertx/metrics/DefaultTcpServerMetrics.java`
#### Snippet
```java
 * important: not singleton, every NetServer instance relate to a TcpServerMetrics instance
 */
public class DefaultTcpServerMetrics implements TCPMetrics<DefaultTcpSocketMetric> {
  private final DefaultServerEndpointMetric endpointMetric;

```

### ClassCanBeRecord
Class can be a record
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/event/ExceptionEvent.java`
#### Snippet
```java
package org.apache.servicecomb.serviceregistry.event;

public class ExceptionEvent {
  private final Throwable throwable;

```

### ClassCanBeRecord
Class can be a record
in `service-registry/registry-service-center/src/main/java/org/apache/servicecomb/serviceregistry/registry/cache/MicroserviceCacheRefreshedEvent.java`
#### Snippet
```java
import java.util.List;

public class MicroserviceCacheRefreshedEvent {
  private final List<MicroserviceCache> microserviceCaches;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/event/RefreshGovernanceConfigurationEvent.java`
#### Snippet
```java
import com.netflix.config.WatchedUpdateResult;

public class RefreshGovernanceConfigurationEvent {
  private final WatchedUpdateResult event;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/event/DynamicConfigurationChangedEvent.java`
#### Snippet
```java
import com.netflix.config.WatchedUpdateResult;

public class DynamicConfigurationChangedEvent {
  private final WatchedUpdateResult event;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/archaius/sources/MicroserviceConfigurationSource.java`
#### Snippet
```java
import com.netflix.config.PolledConfigurationSource;

public class MicroserviceConfigurationSource implements PolledConfigurationSource {
  private final List<ConfigModel> configModels;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/PriorityPropertyType.java`
#### Snippet
```java
import java.util.Objects;

public class PriorityPropertyType<T> {
  private final Type type;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObject.java`
#### Snippet
```java
import java.util.List;

public class ConfigObject<T> {
  private final T instance;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/ConfigUtil.java`
#### Snippet
```java
  }

  private static class ServiceCombPropertyUpdateListener implements WatchedUpdateListener {

    private final ConcurrentMapConfiguration injectConfig;
```

### ClassCanBeRecord
Class can be a record
in `service-registry/registry-lightweight/src/main/java/org/apache/servicecomb/registry/lightweight/SchemaChangedEvent.java`
#### Snippet
```java
import org.apache.servicecomb.registry.api.registry.Microservice;

public class SchemaChangedEvent {
  private final Microservice microservice;

```

### ClassCanBeRecord
Class can be a record
in `service-registry/registry-lightweight/src/main/java/org/apache/servicecomb/registry/lightweight/RegisterInstanceEvent.java`
#### Snippet
```java
 * currently, only "zero config" need this
 */
public class RegisterInstanceEvent {
  private final Microservice microservice;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-config/src/main/java/org/apache/servicecomb/config/priority/ConfigObjectFactory.java`
#### Snippet
```java
 * so this wrapper mechanism will not throw exception even can not find value by placeholder
 */
public class ConfigObjectFactory {
  private final PriorityPropertyFactory propertyFactory;

```

### ClassCanBeRecord
Class can be a record
in `foundations/foundation-metrics/src/main/java/org/apache/servicecomb/foundation/metrics/meter/LatencyScopeConfig.java`
#### Snippet
```java
package org.apache.servicecomb.foundation.metrics.meter;

public class LatencyScopeConfig {
  // [min, max)
  // even max equals Long.MAX_VALUE, still not include it
```

### ClassCanBeRecord
Class can be a record
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/element/impl/ResponseHeaderAccessItem.java`
#### Snippet
```java
import io.vertx.ext.web.RoutingContext;

public class ResponseHeaderAccessItem implements AccessLogItem<RoutingContext> {

  public static final String RESULT_NOT_FOUND = "-";
```

### ClassCanBeRecord
Class can be a record
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/element/impl/CookieAccessItem.java`
#### Snippet
```java
import io.vertx.ext.web.RoutingContext;

public class CookieAccessItem implements AccessLogItem<RoutingContext> {

  public static final String RESULT_NOT_FOUND = "-";
```

### ClassCanBeRecord
Class can be a record
in `common/common-access-log/src/main/java/org/apache/servicecomb/common/accessLog/core/element/impl/RequestHeaderAccessItem.java`
#### Snippet
```java
import io.vertx.ext.web.RoutingContext;

public class RequestHeaderAccessItem implements AccessLogItem<RoutingContext> {
  public static final String RESULT_NOT_FOUND = "-";

```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
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

