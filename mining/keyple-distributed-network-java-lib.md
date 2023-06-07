# keyple-distributed-network-java-lib 
 
# Bad smells
I found 18 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 11 | false |
| Deprecation | 2 | false |
| BusyWait | 2 | false |
| UnstableApiUsage | 2 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
## RuleId[id=Deprecation]
### Deprecation
'JsonParser()' is deprecated
in `src/main/java/org/eclipse/keyple/distributed/SyncNodeServerAdapter.java`
#### Snippet
```java
  SyncNodeServerAdapter(AbstractMessageHandlerAdapter handler, int timeoutSeconds) {
    super(handler, timeoutSeconds);
    this.jsonParser = new JsonParser();
    this.sessionManagers = new ConcurrentHashMap<String, SessionManager>();
    this.pluginManagers = new ConcurrentHashMap<String, ServerPushEventManager>();
```

### Deprecation
'parse(java.lang.String)' is deprecated
in `src/main/java/org/eclipse/keyple/distributed/SyncNodeServerAdapter.java`
#### Snippet
```java
        ServerPushEventStrategyAdapter.Type type;
        try {
          body = jsonParser.parse(message.getBody()).getAsJsonObject();
          type =
              ServerPushEventStrategyAdapter.Type.valueOf(
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/eclipse/keyple/distributed/SyncNodeClientAdapter.java`
#### Snippet
```java
          checkForEvents();
          try {
            Thread.sleep(requestFrequencyMillis);
          } catch (InterruptedException e) {
            logger.error("Unexpected interruption of thread {}", getName(), e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/eclipse/keyple/distributed/SyncNodeClientAdapter.java`
#### Snippet
```java
        try {
          timer = timer1 + timer2;
          Thread.sleep(timer);
          logger.info("Retry to send request after {} seconds...", timer / 1000);
          responses = sendRequestSilently();
```

## RuleId[id=ReplaceCallWithBinaryOperator]
### ReplaceCallWithBinaryOperator
Call can be replaced with binary operator
in `build.gradle.kts`
#### Snippet
```java
            property("sonar.login", System.getenv("SONAR_LOGIN"))
            System.getenv("BRANCH_NAME")?.let {
                if (!"main".equals(it)) {
                    property("sonar.branch.name", it)
                }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'withJavadocJar()' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
    targetCompatibility = JavaVersion.toVersion(javaTargetLevel)
    println("Compiling Java $sourceCompatibility to Java $targetCompatibility.")
    withJavadocJar()
    withSourcesJar()
}
```

### UnstableApiUsage
'withSourcesJar()' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
    println("Compiling Java $sourceCompatibility to Java $targetCompatibility.")
    withJavadocJar()
    withSourcesJar()
}

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/AsyncNodeServerAdapter.java`
#### Snippet
```java
  @Override
  public void onClose(String sessionId) {
    Assert.getInstance().notEmpty(sessionId, SESSION_ID);
    SessionManager manager = sessionManagers.remove(sessionId);
    Assert.getInstance().notNull(manager, SESSION_ID);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/AsyncNodeServerAdapter.java`
#### Snippet
```java
    Assert.getInstance().notEmpty(sessionId, SESSION_ID);
    SessionManager manager = sessionManagers.remove(sessionId);
    Assert.getInstance().notNull(manager, SESSION_ID);
  }

```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/AsyncNodeServerAdapter.java`
#### Snippet
```java
  @Override
  public void onError(String sessionId, Throwable error) {
    Assert.getInstance().notEmpty(sessionId, SESSION_ID).notNull(error, "error");
    SessionManager manager = sessionManagers.get(sessionId);
    Assert.getInstance().notNull(manager, SESSION_ID);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/AsyncNodeServerAdapter.java`
#### Snippet
```java
    Assert.getInstance().notEmpty(sessionId, SESSION_ID).notNull(error, "error");
    SessionManager manager = sessionManagers.get(sessionId);
    Assert.getInstance().notNull(manager, SESSION_ID);
    manager.onError(error);
  }
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/AsyncNodeServerAdapter.java`
#### Snippet
```java
        .notEmpty(message.getSessionId(), SESSION_ID)
        .notEmpty(message.getAction(), "action")
        .notEmpty(message.getClientNodeId(), "clientNodeId");

    // Get or create a new session manager
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/AsyncNodeClientAdapter.java`
#### Snippet
```java
        .notEmpty(message.getAction(), "action")
        .notEmpty(message.getClientNodeId(), "clientNodeId")
        .notEmpty(message.getServerNodeId(), "serverNodeId");

    SessionManager manager = getManagerForEndpoint(message.getSessionId());
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/AsyncNodeClientAdapter.java`
#### Snippet
```java
  @Override
  public void onClose(String sessionId) {
    Assert.getInstance().notEmpty(sessionId, SESSION_ID);
    SessionManager manager = getManagerForEndpoint(sessionId);
    if (manager != null) {
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/AsyncNodeClientAdapter.java`
#### Snippet
```java
  @Override
  public void onOpen(String sessionId) {
    Assert.getInstance().notEmpty(sessionId, SESSION_ID);
    SessionManager manager = getManagerForEndpoint(sessionId);
    if (manager != null) {
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/AsyncNodeClientAdapter.java`
#### Snippet
```java
  @Override
  public void onError(String sessionId, Throwable error) {
    Assert.getInstance().notEmpty(sessionId, SESSION_ID).notNull(error, "error");
    SessionManager manager = getManagerForEndpoint(sessionId);
    if (manager != null) {
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/SyncNodeServerAdapter.java`
#### Snippet
```java
        .notEmpty(message.getSessionId(), "sessionId")
        .notEmpty(message.getAction(), "action")
        .notEmpty(message.getClientNodeId(), "clientNodeId");

    List<MessageDto> responses;
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/SyncNodeClientAdapter.java`
#### Snippet
```java
          .notEmpty(response.getAction(), "action")
          .notEmpty(response.getClientNodeId(), "clientNodeId")
          .notEmpty(response.getServerNodeId(), "serverNodeId");
      return response;
    } else {
```

