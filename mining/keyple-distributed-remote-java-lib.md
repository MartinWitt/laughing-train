# keyple-distributed-remote-java-lib 
 
# Bad smells
I found 22 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 15 | false |
| ReturnNull | 4 | false |
| UnstableApiUsage | 2 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/distributed/ObservableRemotePluginClientAdapter.java`
#### Snippet
```java
  @Override
  public ExecutorService getExecutorService() {
    return null; // Not applicable
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/distributed/ObservableRemotePluginServerAdapter.java`
#### Snippet
```java
  public String executeRemotely(String jsonData) {
    // NOP. Invoked only once during the plugin registration process.
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/distributed/RemoteReaderServerAdapter.java`
#### Snippet
```java
    return inputDataJson != null
        ? JsonUtil.getParser().fromJson(inputDataJson, inputDataClass)
        : null;
  }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/distributed/RemoteReaderServerAdapter.java`
#### Snippet
```java
      }
    }
    return null;
  }

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
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePoolPluginClientFactoryBuilder.java`
#### Snippet
```java
    @Override
    public BuilderStep withSyncNode(SyncEndpointClientSpi endpoint) {
      Assert.getInstance().notNull(endpoint, "endpoint");
      this.syncEndpoint = endpoint;
      return this;
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePoolPluginClientFactoryBuilder.java`
#### Snippet
```java
      Assert.getInstance()
          .notNull(endpoint, "endpoint")
          .greaterOrEqual(timeoutSeconds, 1, "timeoutSeconds");
      this.asyncEndpoint = endpoint;
      this.asyncNodeClientTimeoutSeconds = timeoutSeconds;
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePoolPluginClientFactoryBuilder.java`
#### Snippet
```java

    private Builder(String remotePluginName) {
      Assert.getInstance().notEmpty(remotePluginName, "remotePluginName");
      this.remotePluginName = remotePluginName;
    }
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginServerFactoryBuilder.java`
#### Snippet
```java

    public Builder(String remotePluginName) {
      Assert.getInstance().notEmpty(remotePluginName, "remotePluginName");
      this.remotePluginName = remotePluginName;
      this.executorService = null;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginServerFactoryBuilder.java`
#### Snippet
```java
    @Override
    public BuilderStep withAsyncNode(AsyncEndpointServerSpi endpoint) {
      Assert.getInstance().notNull(endpoint, "endpoint");
      this.asyncEndpoint = endpoint;
      return this;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginServerFactoryBuilder.java`
#### Snippet
```java
      Assert.getInstance()
          .notEmpty(remotePluginName, "remotePluginName")
          .notNull(executorService, "executorService");
      this.remotePluginName = remotePluginName;
      this.executorService = executorService;
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginClientFactoryBuilder.java`
#### Snippet
```java
    @Override
    public SyncNodeReaderStep withPluginLongPollingStrategy(int requestTimeoutMillis) {
      Assert.getInstance().greaterOrEqual(requestTimeoutMillis, 1, "requestTimeoutMillis");
      this.syncPluginObservationStrategy =
          new ServerPushEventStrategyAdapter(Type.LONG_POLLING, requestTimeoutMillis);
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginClientFactoryBuilder.java`
#### Snippet
```java
    @Override
    public BuilderStep withReaderLongPollingStrategy(int requestTimeoutMillis) {
      Assert.getInstance().greaterOrEqual(requestTimeoutMillis, 1, "requestTimeoutMillis");
      this.syncReaderObservationStrategy =
          new ServerPushEventStrategyAdapter(Type.LONG_POLLING, requestTimeoutMillis);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginClientFactoryBuilder.java`
#### Snippet
```java
    @Override
    public SyncNodePluginStep withSyncNode(SyncEndpointClientSpi endpoint) {
      Assert.getInstance().notNull(endpoint, "endpoint");
      this.syncEndpoint = endpoint;
      return this;
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginClientFactoryBuilder.java`
#### Snippet
```java
      Assert.getInstance()
          .notNull(endpoint, "endpoint")
          .greaterOrEqual(timeoutSeconds, 1, "timeoutSeconds");
      this.asyncEndpoint = endpoint;
      this.asyncNodeClientTimeoutSeconds = timeoutSeconds;
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginClientFactoryBuilder.java`
#### Snippet
```java
    @Override
    public BuilderStep withReaderPollingStrategy(int requestFrequencyMillis) {
      Assert.getInstance().greaterOrEqual(requestFrequencyMillis, 1, "requestFrequencyMillis");
      this.syncReaderObservationStrategy =
          new ServerPushEventStrategyAdapter(Type.POLLING, requestFrequencyMillis);
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginClientFactoryBuilder.java`
#### Snippet
```java

    private Builder(String remotePluginName) {
      Assert.getInstance().notEmpty(remotePluginName, "remotePluginName");
      this.remotePluginName = remotePluginName;
      this.isPluginObservationEnabled = true;
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemotePluginClientFactoryBuilder.java`
#### Snippet
```java
    @Override
    public SyncNodeReaderStep withPluginPollingStrategy(int requestFrequencyMillis) {
      Assert.getInstance().greaterOrEqual(requestFrequencyMillis, 1, "requestFrequencyMillis");
      this.syncPluginObservationStrategy =
          new ServerPushEventStrategyAdapter(Type.POLLING, requestFrequencyMillis);
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/ObservableRemotePluginServerAdapter.java`
#### Snippet
```java
  public void endRemoteService(String remoteReaderName, Object outputData) {

    Assert.getInstance().notEmpty(remoteReaderName, "remoteReaderName");

    // Clean the readers map.
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/RemoteReaderServerAdapter.java`
#### Snippet
```java
  @Override
  public <T> T getInputData(Class<T> inputDataClass) {
    Assert.getInstance().notNull(inputDataClass, "inputDataClass");
    return inputDataJson != null
        ? JsonUtil.getParser().fromJson(inputDataJson, inputDataClass)
```

