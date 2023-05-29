# keyple-distributed-local-java-lib 
 
# Bad smells
I found 13 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 8 | false |
| FieldMayBeFinal | 2 | false |
| UnstableApiUsage | 2 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `sessionId` may be 'final'
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceServerAdapter.java`
#### Snippet
```java

    private String clientNodeId;
    private String sessionId;

    private ClientInfo(String clientNodeId, String sessionId) {
```

### FieldMayBeFinal
Field `clientNodeId` may be 'final'
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceServerAdapter.java`
#### Snippet
```java
  private static class ClientInfo {

    private String clientNodeId;
    private String sessionId;

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
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceClientAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .notEmpty(serviceId, "serviceId")
        .notEmpty(localReaderName, "localReaderName");

    // Generate a new session ID.
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceClientFactoryBuilder.java`
#### Snippet
```java
    @Override
    public BuilderStep withSyncNode(SyncEndpointClientSpi endpoint) {
      Assert.getInstance().notNull(endpoint, "endpoint");
      this.syncEndpoint = endpoint;
      return this;
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceClientFactoryBuilder.java`
#### Snippet
```java

    private Builder(String localServiceName) {
      Assert.getInstance().notEmpty(localServiceName, "localServiceName");
      this.localServiceName = localServiceName;
    }
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceClientFactoryBuilder.java`
#### Snippet
```java
      Assert.getInstance()
          .notNull(endpoint, "endpoint")
          .greaterOrEqual(timeoutSeconds, 1, "timeoutSeconds");
      this.asyncEndpoint = endpoint;
      this.timeoutSeconds = timeoutSeconds;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceServerFactoryBuilder.java`
#### Snippet
```java
    @Override
    public BuilderStep withPoolPlugins(String... poolPluginNames) {
      Assert.getInstance().notNull(poolPluginNames, "poolPluginNames");
      for (String poolPluginName : poolPluginNames) {
        Assert.getInstance().notEmpty(poolPluginName, "poolPluginName");
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceServerFactoryBuilder.java`
#### Snippet
```java
      Assert.getInstance().notNull(poolPluginNames, "poolPluginNames");
      for (String poolPluginName : poolPluginNames) {
        Assert.getInstance().notEmpty(poolPluginName, "poolPluginName");
      }
      this.poolPluginNames = poolPluginNames;
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceServerFactoryBuilder.java`
#### Snippet
```java

    private Builder(String localServiceName) {
      Assert.getInstance().notEmpty(localServiceName, "localServiceName");
      this.localServiceName = localServiceName;
    }
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/distributed/LocalServiceServerFactoryBuilder.java`
#### Snippet
```java
    @Override
    public BuilderStep withAsyncNode(AsyncEndpointServerSpi endpoint) {
      Assert.getInstance().notNull(endpoint, "endpoint");
      this.asyncEndpoint = endpoint;
      return this;
```

