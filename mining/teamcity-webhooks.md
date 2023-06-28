# teamcity-webhooks 
 
# Bad smells
I found 32 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 14 | false |
| SpringJavaInjectionPointsAutowiringInspection | 5 | false |
| Deprecation | 3 | false |
| FieldMayBeFinal | 3 | false |
| NonFinalFieldInEnum | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
| JavadocReference | 1 | false |
| JavadocDeclaration | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
## RuleId[id=SpringJavaInjectionPointsAutowiringInspection]
### SpringJavaInjectionPointsAutowiringInspection
Could not autowire. No beans of 'RestApiFacade' type found.
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/RestApiProducer.java`
#### Snippet
```java
    private final RestApiFacade restApiFacade;

    public RestApiProducer(RestApiFacade restApiFacade) {
        this.restApiFacade = restApiFacade;
    }
```

### SpringJavaInjectionPointsAutowiringInspection
Could not autowire. No beans of 'SBuildServer' type found.
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/WebhooksEventListener.java`
#### Snippet
```java

    public WebhooksEventListener(WebhookDataProducer jsonProducer,
                                 SBuildServer buildServer,
                                 SSLTrustStoreProvider sslTrustStoreProvider,
                                 HTTPRequestBuilder.RequestHandler requestHandler) {
```

### SpringJavaInjectionPointsAutowiringInspection
Could not autowire. No beans of 'SSLTrustStoreProvider' type found.
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/WebhooksEventListener.java`
#### Snippet
```java
    public WebhooksEventListener(WebhookDataProducer jsonProducer,
                                 SBuildServer buildServer,
                                 SSLTrustStoreProvider sslTrustStoreProvider,
                                 HTTPRequestBuilder.RequestHandler requestHandler) {
        this.jsonProducer = jsonProducer;
```

### SpringJavaInjectionPointsAutowiringInspection
Could not autowire. No beans of 'RequestHandler' type found.
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/WebhooksEventListener.java`
#### Snippet
```java
                                 SBuildServer buildServer,
                                 SSLTrustStoreProvider sslTrustStoreProvider,
                                 HTTPRequestBuilder.RequestHandler requestHandler) {
        this.jsonProducer = jsonProducer;
        this.buildServer = buildServer;
```

### SpringJavaInjectionPointsAutowiringInspection
Could not autowire. No beans of 'PluginLifecycleEventDispatcher' type found.
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/WebhooksManager.java`
#### Snippet
```java
    }

    public WebhooksManager(PluginLifecycleEventDispatcher dispatcher,
                           AsyncEventDispatcher asyncEventDispatcher,
                           WebhooksEventListener eventListener) {
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `events` in enum 'EventType'
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/RestApiProducer.java`
#### Snippet
```java

        private String restApiUrl;
        private List<String> events;

        EventType(List<String> events, String restApiUrl) {
```

### NonFinalFieldInEnum
Non-final field `restApiUrl` in enum 'EventType'
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/RestApiProducer.java`
#### Snippet
```java
        BUILD(Arrays.asList(BUILD_STARTED, BUILD_FINISHED, BUILD_INTERRUPTED, CHANGES_LOADED, BUILD_TYPE_ADDED_TO_QUEUE, BUILD_REMOVED_FROM_QUEUE, BUILD_PROBLEMS_CHANGED), "/app/rest/builds/promotionId:");

        private String restApiUrl;
        private List<String> events;

```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `webhooks-server/src/main/resources/META-INF/build-server-plugin-teamcity-webhook.xml`
#### Snippet
```java
                        http://www.springframework.org/schema/context
                        http://www.springframework.org/schema/context/spring-context-3.0.xsd"
       default-autowire="constructor">
    <context:component-scan base-package="jetbrains.buildServer.webhook"/>
</beans>
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `jetbrains.buildServer.serverSide.impl.events.async.AsyncEventDispatcher`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
 * Allows to publish simple events to all subscribed listeners asynchronously
 * with keeping order of execution events per {@link AsyncEventListener#getSyncKey()}
 * @deprecated since 2022.10, use {@link jetbrains.buildServer.serverSide.impl.events.async.AsyncEventDispatcher} from teamcity core
 */
@Component
```

## RuleId[id=Deprecation]
### Deprecation
'jetbrains.buildServer.webhook.async.AsyncEventDispatcher' is deprecated
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventListener.java`
#### Snippet
```java
    /**
     * Overriding this method allows to define a list of listeners for which order of handling events is important
     * @return key witch will be used for synchronization ordering events during the processing in {@link AsyncEventDispatcher}
     */
    default Object getSyncKey() {
```

### Deprecation
'jetbrains.buildServer.webhook.async.AsyncEventDispatcher' is deprecated
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/WebhooksManager.java`
#### Snippet
```java

    public WebhooksManager(PluginLifecycleEventDispatcher dispatcher,
                           AsyncEventDispatcher asyncEventDispatcher,
                           WebhooksEventListener eventListener) {

```

### Deprecation
'jetbrains.buildServer.webhook.async.AsyncEventDispatcher' is deprecated
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/events/AsyncEvent.java`
#### Snippet
```java

/**
 * Simple event used by {@link jetbrains.buildServer.webhook.async.AsyncEventDispatcher}
 * to allows listeners {@link jetbrains.buildServer.webhook.async.AsyncEventListener} handle it asynchronously
 */
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import static jetbrains.buildServer.webhook.WebhooksManager.EventNames.BUILD_INTERRUPTED;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/RestApiProducer.java`
#### Snippet
```java
import static java.lang.String.format;
import static jetbrains.buildServer.webhook.WebhooksManager.EventNames.*;
import static jetbrains.buildServer.webhook.WebhooksManager.EventNames.BUILD_INTERRUPTED;

/**
```

### UNUSED_IMPORT
Unused import `import com.intellij.openapi.diagnostic.Logger;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
package jetbrains.buildServer.webhook.async;

import com.intellij.openapi.diagnostic.Logger;
import jetbrains.buildServer.messages.XStreamHolder;
import jetbrains.buildServer.serverSide.BuildServerAdapter;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.messages.XStreamHolder;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java

import com.intellij.openapi.diagnostic.Logger;
import jetbrains.buildServer.messages.XStreamHolder;
import jetbrains.buildServer.serverSide.BuildServerAdapter;
import jetbrains.buildServer.serverSide.BuildServerListener;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.BuildServerAdapter;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import com.intellij.openapi.diagnostic.Logger;
import jetbrains.buildServer.messages.XStreamHolder;
import jetbrains.buildServer.serverSide.BuildServerAdapter;
import jetbrains.buildServer.serverSide.BuildServerListener;
import jetbrains.buildServer.serverSide.ServerPaths;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.BuildServerListener;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import jetbrains.buildServer.messages.XStreamHolder;
import jetbrains.buildServer.serverSide.BuildServerAdapter;
import jetbrains.buildServer.serverSide.BuildServerListener;
import jetbrains.buildServer.serverSide.ServerPaths;
import jetbrains.buildServer.serverSide.impl.events.async.AsyncEvent;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.ServerPaths;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import jetbrains.buildServer.serverSide.BuildServerAdapter;
import jetbrains.buildServer.serverSide.BuildServerListener;
import jetbrains.buildServer.serverSide.ServerPaths;
import jetbrains.buildServer.serverSide.impl.events.async.AsyncEvent;
import jetbrains.buildServer.util.EventDispatcher;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.util.EventDispatcher;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import jetbrains.buildServer.serverSide.ServerPaths;
import jetbrains.buildServer.serverSide.impl.events.async.AsyncEvent;
import jetbrains.buildServer.util.EventDispatcher;
import jetbrains.buildServer.xstream.XStreamFile;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.xstream.XStreamFile;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import jetbrains.buildServer.serverSide.impl.events.async.AsyncEvent;
import jetbrains.buildServer.util.EventDispatcher;
import jetbrains.buildServer.xstream.XStreamFile;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Qualifier;
```

### UNUSED_IMPORT
Unused import `import java.io.*;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Files;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Path;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Paths;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.*;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

```

### UNUSED_IMPORT
Unused import `import static java.lang.String.format;`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
import java.util.stream.Collectors;

import static java.lang.String.format;

/**
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/WebhookDataProducer.java`
#### Snippet
```java
     * @param event event triggered webhook sending
     * @param fields list of required fields in webhook
     * @return
     */
    String getJson(AsyncEvent event, String fields);
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java

            @Override
            public boolean equals(Object obj) {
                return listener.equals(obj);
            }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'AsyncEventDispatcher' is still used
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
 */
@Component
public class AsyncEventDispatcher {

    private final jetbrains.buildServer.serverSide.impl.events.async.AsyncEventDispatcher myDelegate;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `events` may be 'final'
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/RestApiProducer.java`
#### Snippet
```java

        private String restApiUrl;
        private List<String> events;

        EventType(List<String> events, String restApiUrl) {
```

### FieldMayBeFinal
Field `restApiUrl` may be 'final'
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/RestApiProducer.java`
#### Snippet
```java
        BUILD(Arrays.asList(BUILD_STARTED, BUILD_FINISHED, BUILD_INTERRUPTED, CHANGES_LOADED, BUILD_TYPE_ADDED_TO_QUEUE, BUILD_REMOVED_FROM_QUEUE, BUILD_PROBLEMS_CHANGED), "/app/rest/builds/promotionId:");

        private String restApiUrl;
        private List<String> events;

```

### FieldMayBeFinal
Field `lastErrorCodeMap` may be 'final'
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/WebhooksEventListener.java`
#### Snippet
```java

    private static final Logger LOG = Logger.getInstance(WebhooksEventListener.class.getName());
    private ConcurrentHashMap<String, String> lastErrorCodeMap = new ConcurrentHashMap<>();

    private final WebhookDataProducer jsonProducer;
```

