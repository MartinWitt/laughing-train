# keyple-service-resource-java-lib 
 
# Bad smells
I found 27 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 17 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 4 | false |
| SuspiciousMethodCalls | 3 | false |
| UnstableApiUsage | 2 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `reader`
in `src/main/java/org/eclipse/keyple/core/service/resource/CardProfileManagerAdapter.java`
#### Snippet
```java
    for (CardResource cardResource : cardResources) {
      CardReader reader = cardResource.getReader();
      synchronized (reader) {
        ReaderManagerAdapter readerManager = service.getReaderManager(reader);
        if (readerManager != null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `reader`
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceAdapter.java`
#### Snippet
```java
    if (reader != null) {
      // The reader is registered in the service.
      synchronized (reader) {
        ReaderManagerAdapter readerManager = readerToReaderManagerMap.get(reader);
        if (readerManager != null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `reader`
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceAdapter.java`
#### Snippet
```java
        CardReader reader = plugin.getReader(readerName);
        if (reader != null) {
          synchronized (reader) {
            onReaderConnected(reader, plugin);
          }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `reader`
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceAdapter.java`
#### Snippet
```java
        if (reader != null) {
          // The reader is registered in the service.
          synchronized (reader) {
            onReaderDisconnected(reader, plugin);
          }
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.remove()'
in `src/main/java/org/eclipse/keyple/core/service/resource/ReaderManagerAdapter.java`
#### Snippet
```java
   */
  void removeCardResource(CardResource cardResource) {
    cardResources.remove(cardResource);
    if (selectedCardResource == cardResource) {
      selectedCardResource = null;
```

### SuspiciousMethodCalls
Suspicious call to 'List.remove()'
in `src/main/java/org/eclipse/keyple/core/service/resource/CardProfileManagerAdapter.java`
#### Snippet
```java
   */
  void removeCardResource(CardResource cardResource) {
    boolean isRemoved = cardResources.remove(cardResource);
    if (logger.isDebugEnabled() && isRemoved) {
      logger.debug(
```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `src/main/java/org/eclipse/keyple/core/service/resource/CardProfileManagerAdapter.java`
#### Snippet
```java
          try {
            if (readerManager.lock(cardResource, cardProfile.getCardResourceProfileExtension())) {
              int cardResourceIndex = cardResources.indexOf(cardResource);
              updateCardResourcesOrder(cardResourceIndex);
              result = cardResource;
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
in `src/main/java/org/eclipse/keyple/core/service/resource/PoolPluginsConfigurator.java`
#### Snippet
```java
     */
    public Builder addPoolPlugin(PoolPlugin poolPlugin) {
      Assert.getInstance().notNull(poolPlugin, "poolPlugin");
      if (poolPlugins.contains(poolPlugin)) {
        throw new IllegalStateException("Pool plugin already configured.");
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceProfileConfigurator.java`
#### Snippet
```java
     */
    public Builder withReaderNameRegex(String readerNameRegex) {
      Assert.getInstance().notEmpty(readerNameRegex, "readerNameRegex");
      if (this.readerNameRegex != null) {
        throw new IllegalStateException("Reader name regex has already been set.");
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceProfileConfigurator.java`
#### Snippet
```java
     */
    public Builder withPlugins(Plugin... plugins) {
      Assert.getInstance().notNull(plugins, "plugins");
      for (Plugin plugin : plugins) {
        Assert.getInstance().notNull(plugin, "plugin");
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceProfileConfigurator.java`
#### Snippet
```java
      Assert.getInstance().notNull(plugins, "plugins");
      for (Plugin plugin : plugins) {
        Assert.getInstance().notNull(plugin, "plugin");
        this.plugins.add(plugin);
      }
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceProfileConfigurator.java`
#### Snippet
```java
     */
    public Builder withReaderGroupReference(String readerGroupReference) {
      Assert.getInstance().notEmpty(readerGroupReference, "readerGroupReference");
      if (this.readerGroupReference != null) {
        throw new IllegalStateException("Reader group reference has already been set.");
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceProfileConfigurator.java`
#### Snippet
```java
      Assert.getInstance()
          .notEmpty(profileName, "profileName")
          .notNull(cardResourceProfileExtension, "cardResourceProfileExtension");
      this.profileName = profileName;
      this.cardResourceProfileExtension = cardResourceProfileExtension;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/PluginsConfigurator.java`
#### Snippet
```java
      Assert.getInstance()
          .notNull(plugin, "plugin")
          .notNull(readerConfiguratorSpi, "readerConfiguratorSpi");
      if (plugin instanceof PoolPlugin) {
        throw new IllegalArgumentException(
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/PluginsConfigurator.java`
#### Snippet
```java
     */
    public Builder withAllocationStrategy(AllocationStrategy allocationStrategy) {
      Assert.getInstance().notNull(allocationStrategy, "allocationStrategy");
      if (this.allocationStrategy != null) {
        throw new IllegalStateException("Allocation strategy already configured.");
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/PluginsConfigurator.java`
#### Snippet
```java
     */
    public Builder withUsageTimeout(int usageTimeoutMillis) {
      Assert.getInstance().greaterOrEqual(usageTimeoutMillis, 1, "usageTimeoutMillis");
      if (this.usageTimeoutMillis != null) {
        throw new IllegalStateException("Usage timeout already configured.");
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceConfiguratorAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .greaterOrEqual(cycleDurationMillis, 1, "cycleDurationMillis")
        .greaterOrEqual(timeoutMillis, 1, "timeoutMillis");
    if (isBlockingAllocationMode) {
      throw new IllegalStateException("Allocation mode already configured.");
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceConfiguratorAdapter.java`
#### Snippet
```java
      CardResourceProfileConfigurator... cardResourceProfileConfigurators) {
    Assert.getInstance()
        .notNull(cardResourceProfileConfigurators, "cardResourceProfileConfigurators");
    if (!this.cardResourceProfileConfigurators.isEmpty()) {
      throw new IllegalStateException("Card resource profiles already configured.");
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceConfiguratorAdapter.java`
#### Snippet
```java
    }
    for (CardResourceProfileConfigurator configurator : cardResourceProfileConfigurators) {
      Assert.getInstance().notNull(configurator, "cardResourceProfileConfigurator");
      this.cardResourceProfileConfigurators.add(configurator);
    }
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceConfiguratorAdapter.java`
#### Snippet
```java
  public CardResourceServiceConfigurator withPoolPlugins(
      PoolPluginsConfigurator poolPluginsConfigurator) {
    Assert.getInstance().notNull(poolPluginsConfigurator, "poolPluginsConfigurator");
    if (poolPlugins != null) {
      throw new IllegalStateException("Pool plugins already configured.");
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceConfiguratorAdapter.java`
#### Snippet
```java
  @Override
  public CardResourceServiceConfigurator withPlugins(PluginsConfigurator pluginsConfigurator) {
    Assert.getInstance().notNull(pluginsConfigurator, "pluginsConfigurator");
    if (plugins != null) {
      throw new IllegalStateException("Plugins already configured.");
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceAdapter.java`
#### Snippet
```java
      throw new IllegalStateException("The card resource service is not started.");
    }
    Assert.getInstance().notNull(cardResource, "cardResource");

    // For regular or pool plugin ?
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceAdapter.java`
#### Snippet
```java
      throw new IllegalStateException("The card resource service is not started.");
    }
    Assert.getInstance().notEmpty(cardResourceProfileName, "cardResourceProfileName");

    CardProfileManagerAdapter cardProfileManager =
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/resource/CardResourceServiceAdapter.java`
#### Snippet
```java
        cardProfileNameToCardProfileManagerMap.get(cardResourceProfileName);

    Assert.getInstance().notNull(cardProfileManager, "cardResourceProfileName");

    CardResource cardResource = cardProfileManager.getCardResource();
```

