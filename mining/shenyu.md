# shenyu 
 
# Bad smells
I found 49 bad smells with 49 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 49 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-admin/src/main/java/org/apache/shenyu/admin/exception/ExceptionHandlers.java`
#### Snippet
```java
v.getPropertyPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-admin/src/test/java/org/apache/shenyu/admin/utils/HttpUtilsTest.java`
#### Snippet
```java
builder.build().url().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-admin/src/test/java/org/apache/shenyu/admin/utils/HttpUtilsTest.java`
#### Snippet
```java
builder.build().url().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-admin/src/test/java/org/apache/shenyu/admin/utils/HttpUtilsTest.java`
#### Snippet
```java
builder.build().url().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-admin/src/test/java/org/apache/shenyu/admin/utils/HttpUtilsTest.java`
#### Snippet
```java
builder.build().url().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-admin/src/test/java/org/apache/shenyu/admin/utils/HttpUtilsTest.java`
#### Snippet
```java
builder.build().url().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-integrated-test/shenyu-integrated-test-combination/src/test/java/org/apache/shenyu/integrated/test/combination/SharedThreadPoolTest.java`
#### Snippet
```java
response.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-integrated-test/shenyu-integrated-test-grpc/src/test/java/org/apache/shenyu/integrated/test/grpc/GrpcPluginSharedThreadPoolTest.java`
#### Snippet
```java
response.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-integrated-test/shenyu-integrated-test-grpc/src/test/java/org/apache/shenyu/integrated/test/grpc/GrpcPluginTest.java`
#### Snippet
```java
response.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/fallback/FallbackHandler.java`
#### Snippet
```java
request.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-httpclient/src/test/java/org/apache/shenyu/plugin/httpclient/NettyHttpClientPluginTest.java`
#### Snippet
```java
HttpHeaderNames.CONNECTION.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-httpclient/src/test/java/org/apache/shenyu/plugin/httpclient/NettyHttpClientPluginTest.java`
#### Snippet
```java
HttpHeaderValues.KEEP_ALIVE.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/AbstractLoggingPlugin.java`
#### Snippet
```java
request.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/test/java/org/apache/shenyu/plugin/logging/common/body/LoggingServerHttpResponseTest.java`
#### Snippet
```java
serverHttpRequest.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-console/src/main/java/org/apache/shenyu/plugin/logging/console/LoggingConsolePlugin.java`
#### Snippet
```java
request.getMethod().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-console/src/main/java/org/apache/shenyu/plugin/logging/console/LoggingConsolePlugin.java`
#### Snippet
```java
request.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-console/src/main/java/org/apache/shenyu/plugin/logging/console/LoggingConsolePlugin.java`
#### Snippet
```java
logInfo.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-metrics/src/test/java/org/apache/shenyu/plugin/metrics/prometheus/PrometheusMetricsRegisterTest.java`
#### Snippet
```java
map.get(name).describe().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/MockPlugin.java`
#### Snippet
```java
serverHttpRequest.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-param-mapping/src/main/java/org/apache/shenyu/plugin/param/mapping/ParamMappingPlugin.java`
#### Snippet
```java
MediaType.APPLICATION_JSON.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-param-mapping/src/main/java/org/apache/shenyu/plugin/param/mapping/ParamMappingPlugin.java`
#### Snippet
```java
MediaType.APPLICATION_FORM_URLENCODED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-param-mapping/src/test/java/org/apache/shenyu/plugin/param/mapping/ParamMappingPluginTest.java`
#### Snippet
```java
MediaType.APPLICATION_JSON.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-param-mapping/src/test/java/org/apache/shenyu/plugin/param/mapping/ParamMappingPluginTest.java`
#### Snippet
```java
MediaType.APPLICATION_FORM_URLENCODED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-resilience4j/src/test/java/org/apache/shenyu/plugin/resilience4j/executor/CombinedExecutorTest.java`
#### Snippet
```java
exchange.getResponse().getHeaders().getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-response/src/main/java/org/apache/shenyu/plugin/response/strategy/WebClientMessageWriter.java`
#### Snippet
```java
clientResponse.headers().contentType().get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-sentinel/src/test/java/org/apache/shenyu/plugin/sentinel/fallback/SentinelFallbackHandlerTest.java`
#### Snippet
```java
Objects.requireNonNull(exchange.getResponse().getHeaders().getLocation()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-sign/src/test/java/org/apache/shenyu/plugin/sign/extractor/DefaultExtractorTest.java`
#### Snippet
```java
extractor.extract(httpRequest).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-sign/src/test/java/org/apache/shenyu/plugin/sign/extractor/DefaultExtractorTest.java`
#### Snippet
```java
extractor.extract(httpRequest).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-uri/src/test/java/org/apache/shenyu/plugin/uri/URIPluginTest.java`
#### Snippet
```java
exchange.getAttributes().get(Constants.HTTP_URI).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-uri/src/test/java/org/apache/shenyu/plugin/uri/URIPluginTest.java`
#### Snippet
```java
exchange.getAttributes().get(Constants.HTTP_URI).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-uri/src/test/java/org/apache/shenyu/plugin/uri/URIPluginTest.java`
#### Snippet
```java
exchange.getAttributes().get(Constants.HTTP_URI).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-uri/src/test/java/org/apache/shenyu/plugin/uri/URIPluginTest.java`
#### Snippet
```java
exchange.getAttributes().get(Constants.HTTP_URI).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-plugin/shenyu-plugin-uri/src/test/java/org/apache/shenyu/plugin/uri/URIPluginTest.java`
#### Snippet
```java
exchange.getAttributes().get(Constants.HTTP_URI).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/client/ShenyuWebsocketClient.java`
#### Snippet
```java
this.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/client/ShenyuWebsocketClient.java`
#### Snippet
```java
this.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/client/ShenyuWebsocketClient.java`
#### Snippet
```java
this.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/client/EtcdClient.java`
#### Snippet
```java
o.getKey().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/client/EtcdClient.java`
#### Snippet
```java
kv.getKey().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
fallback.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
fallbackFactory.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-param-mapping/src/main/java/org/apache/shenyu/springboot/starter/plugin/param/mapping/ParamMappingPluginConfiguration.java`
#### Snippet
```java
MediaType.APPLICATION_JSON.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-param-mapping/src/main/java/org/apache/shenyu/springboot/starter/plugin/param/mapping/ParamMappingPluginConfiguration.java`
#### Snippet
```java
MediaType.APPLICATION_FORM_URLENCODED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-http/src/test/java/org/apache/shenyu/springboot/starter/sync/data/http/HttpClientPluginConfigurationTest.java`
#### Snippet
```java
ContentType.APPLICATION_JSON.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-http/src/test/java/org/apache/shenyu/springboot/starter/sync/data/http/HttpClientPluginConfigurationTest.java`
#### Snippet
```java
ContentType.APPLICATION_JSON.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-http/src/test/java/org/apache/shenyu/springboot/starter/sync/data/http/HttpClientPluginConfigurationTest.java`
#### Snippet
```java
ContentType.APPLICATION_JSON.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-sync-data-center/shenyu-sync-data-http/src/test/java/org/apache/shenyu/sync/data/http/AccessTokenManagerTest.java`
#### Snippet
```java
ContentType.APPLICATION_JSON.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-sync-data-center/shenyu-sync-data-http/src/test/java/org/apache/shenyu/sync/data/http/HttpSyncDataServiceTest.java`
#### Snippet
```java
ContentType.APPLICATION_JSON.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-sync-data-center/shenyu-sync-data-http/src/test/java/org/apache/shenyu/sync/data/http/HttpSyncDataServiceTest.java`
#### Snippet
```java
ContentType.APPLICATION_JSON.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shenyu324286584908632242110841896378910441544/shenyu-sync-data-center/shenyu-sync-data-http/src/test/java/org/apache/shenyu/sync/data/http/HttpSyncDataServiceTest.java`
#### Snippet
```java
ContentType.APPLICATION_JSON.toString()
```

