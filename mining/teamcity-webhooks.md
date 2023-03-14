# teamcity-webhooks 
 
# Bad smells
I found 20 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 14 | false |
| ReturnNull | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| MissingDeprecatedAnnotation | 1 | false |
| BoundedWildcard | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/WebhooksEventListener.java`
#### Snippet
```java
        String password = project.getParametersProvider().get("teamcity.internal.webhooks.password");

        if (username.isEmpty() || password == null) return null;

        return new SimpleCredentials(username, password);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `EventNames` has only 'static' members, and lacks a 'private' constructor
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/WebhooksManager.java`
#### Snippet
```java
public class WebhooksManager {

    public static final class EventNames {
        public static final String AGENT_REGISTRED = "AGENT_REGISTRED";
        public static final String AGENT_UNREGISTERED = "AGENT_UNREGISTERED";
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventDispatcher.java`
#### Snippet
```java
 */
@Component
public class AsyncEventDispatcher {

    private final jetbrains.buildServer.serverSide.impl.events.async.AsyncEventDispatcher myDelegate;
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends AsyncEvent`
in `webhooks-server/src/main/java/jetbrains/buildServer/webhook/async/AsyncEventListener.java`
#### Snippet
```java
    void handle(AsyncEvent event);

    default void handle(List<AsyncEvent> events) {
        for (AsyncEvent event : events) {
            handle(event);
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

