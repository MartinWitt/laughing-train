# keyple-service-java-lib 
 
# Bad smells
I found 70 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 33 | false |
| ReturnNull | 9 | false |
| DataFlowIssue | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| BusyWait | 3 | false |
| BoundedWildcard | 3 | false |
| LoopStatementsThatDontLoop | 2 | false |
| RedundantFieldInitialization | 2 | false |
| UnstableApiUsage | 2 | false |
| WhileLoopSpinsOnField | 1 | false |
| UnnecessaryModifier | 1 | true |
| UnnecessaryFullyQualifiedName | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| CatchMayIgnoreException | 1 | false |
| MismatchedJavadocCode | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| ReplaceCallWithBinaryOperator | 1 | false |
## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalPluginAdapter.java`
#### Snippet
```java
    public void run() {
      try {
        while (running) {
          /* retrieves the current readers names list */
          Set<String> actualNativeReaderNames = observablePluginSpi.searchAvailableReaderNames();
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/eclipse/keyple/core/service/PluginEvent.java`
#### Snippet
```java
   * @since 2.0.0
   */
  public enum Type {

    /**
```

## RuleId[id=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`while` statement does not loop
in `src/main/java/org/eclipse/keyple/core/service/CardRemovalPassiveMonitoringJobAdapter.java`
#### Snippet
```java
      public void run() {
        try {
          while (!Thread.currentThread().isInterrupted()) {
            try {
              if (readerSpi != null) {
```

### LoopStatementsThatDontLoop
`while` statement does not loop
in `src/main/java/org/eclipse/keyple/core/service/CardInsertionPassiveMonitoringJobAdapter.java`
#### Snippet
```java
      public void run() {
        try {
          while (!Thread.currentThread().isInterrupted()) {
            try {
              readerSpi.waitForCardInsertion();
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/eclipse/keyple/core/service/SmartCardServiceAdapter.java`
#### Snippet
```java
   */
  private int compareVersions(String providedVersion, String localVersion) {
    String[] providedVersions = providedVersion.split("[.]");
    String[] localVersions = localVersion.split("[.]");
    if (providedVersions.length != localVersions.length) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/eclipse/keyple/core/service/SmartCardServiceAdapter.java`
#### Snippet
```java
  private int compareVersions(String providedVersion, String localVersion) {
    String[] providedVersions = providedVersion.split("[.]");
    String[] localVersions = localVersion.split("[.]");
    if (providedVersions.length != localVersions.length) {
      throw new IllegalStateException(
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/eclipse/keyple/core/service/RemotePoolPluginAdapter.java`
#### Snippet
```java
    params.addProperty(
        JsonProperty.READER_NAME.getKey(),
        reader.getName().replace(REMOTE_READER_NAME_SUFFIX, "")); // NOSONAR

    input.add(JsonProperty.PARAMETERS.getKey(), params);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.calypsonet.terminal.card` is unnecessary and can be removed
in `src/main/java/org/eclipse/keyple/core/service/CardSelectionResponseAdapter.java`
#### Snippet
```java
  /**
   * Builds a card selection response including the selection status and a {@link CardResponseApi}
   * (list of {@link org.calypsonet.terminal.card.ApduResponseApi}).
   *
   * @param powerOnData The card power-on data, null if the power-on data is not available.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `observer` might be null
in `src/main/java/org/eclipse/keyple/core/service/ObservationManagerAdapter.java`
#### Snippet
```java
          observer != null ? observer.getClass().getSimpleName() : null);
    }
    Assert.getInstance().notNull(observer, "observer");
    if (exceptionHandler == null) {
      throw new IllegalStateException("No exception handler defined.");
```

### DataFlowIssue
Argument `reader` might be null
in `src/main/java/org/eclipse/keyple/core/service/LocalPoolPluginAdapter.java`
#### Snippet
```java
          reader != null ? reader.getName() : null);
    }
    Assert.getInstance().notNull(reader, "reader");

    try {
```

### DataFlowIssue
Method invocation `waitForCardRemovalDuringProcessing` may produce `NullPointerException`
in `src/main/java/org/eclipse/keyple/core/service/CardRemovalPassiveMonitoringJobAdapter.java`
#### Snippet
```java
                readerSpi.waitForCardRemoval();
              } else {
                readerProcessingSpi.waitForCardRemovalDuringProcessing();
              }
              monitoringState.onEvent(ObservableLocalReaderAdapter.InternalEvent.CARD_REMOVED);
```

### DataFlowIssue
Argument `remoteReaderSpi` might be null
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemotePluginAdapter.java`
#### Snippet
```java
          remoteReaderSpi != null ? remoteReaderSpi.getName() : null);
    }
    Assert.getInstance().notNull(remoteReaderSpi, "remoteReaderSpi");

    // Create the reader.
```

### DataFlowIssue
Argument `reader` might be null
in `src/main/java/org/eclipse/keyple/core/service/RemotePoolPluginAdapter.java`
#### Snippet
```java
          reader != null ? reader.getName() : null);
    }
    Assert.getInstance().notNull(reader, "reader");

    // Build the input JSON data.
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ConfigurableReader' is still used
in `src/main/java/org/eclipse/keyple/core/service/ConfigurableReader.java`
#### Snippet
```java
 */
@Deprecated
public interface ConfigurableReader extends Reader, ConfigurableCardReader {}

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/eclipse/keyple/core/service/CardRemovalActiveMonitoringJobAdapter.java`
#### Snippet
```java

    return new Runnable() {
      long retries = 0;

      /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/eclipse/keyple/core/service/CardInsertionActiveMonitoringJobAdapter.java`
#### Snippet
```java
  Runnable getMonitoringJob(final AbstractObservableStateAdapter monitoringState) {
    return new Runnable() {
      long retries = 0;

      /**
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/org/eclipse/keyple/core/service/LocalReaderAdapter.java`
#### Snippet
```java
      try {
        readerSpi.closePhysicalChannel();
      } catch (ReaderIOException e) {
      }
    }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/org/eclipse/keyple/core/service/PoolPlugin.java`
#### Snippet
```java
   * (for example, containing a SAM with identical key sets).
   *
   * @return a list of String
   * @since 2.0.0
   */
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/core/service/RemoteReaderAdapter.java`
#### Snippet
```java
    } catch (Exception e) {
      throwRuntimeException(e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/core/service/SmartCardServiceAdapter.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/core/service/SmartCardServiceAdapter.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
              getName());
        }
        return null;
      }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java

    // no event returned
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/core/service/DistributedLocalServiceAdapter.java`
#### Snippet
```java
        }
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/core/service/DistributedLocalServiceAdapter.java`
#### Snippet
```java
        }
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/core/service/RemotePoolPluginAdapter.java`
#### Snippet
```java
    } catch (Exception e) {
      throwRuntimeException(e);
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/core/service/DistributedUtilAdapter.java`
#### Snippet
```java
  private static JsonObject getJsonObject(String outputJson) throws Exception { // NOSONAR
    if (outputJson == null || outputJson.isEmpty()) {
      return null;
    }
    JsonObject output = JsonUtil.getParser().fromJson(outputJson, JsonObject.class);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`protocolAssociations.size() == 0` can be replaced with 'protocolAssociations.isEmpty()'
in `src/main/java/org/eclipse/keyple/core/service/LocalReaderAdapter.java`
#### Snippet
```java
    currentLogicalProtocolName = null;
    currentPhysicalProtocolName = null;
    if (protocolAssociations.size() == 0) {
      useDefaultProtocol = true;
    } else {
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalPluginAdapter.java`
#### Snippet
```java
          }
          /* sleep for a while. */
          Thread.sleep(monitoringCycleDuration);
        }
      } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/eclipse/keyple/core/service/CardRemovalActiveMonitoringJobAdapter.java`
#### Snippet
```java
            try {
              // wait a bit
              Thread.sleep(cycleDurationMillis);
            } catch (InterruptedException ignored) {
              // Restore interrupted state...
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/eclipse/keyple/core/service/CardInsertionActiveMonitoringJobAdapter.java`
#### Snippet
```java
            try {
              // wait a bit
              Thread.sleep(cycleDurationMillis);
            } catch (InterruptedException ignored) {
              // Restore interrupted state...
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends CardSelectionResponseApi`
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
   * @return True if a card has matched, false if not.
   */
  private boolean hasACardMatched(List<CardSelectionResponseApi> cardSelectionResponses) {
    for (CardSelectionResponseApi cardSelectionResponse : cardSelectionResponses) {
      if (cardSelectionResponse != null && cardSelectionResponse.hasMatched()) {
```

### BoundedWildcard
Can generalize to `? extends CardSelectionRequestSpi`
in `src/main/java/org/eclipse/keyple/core/service/LocalReaderAdapter.java`
#### Snippet
```java
  @Override
  final List<CardSelectionResponseApi> processCardSelectionRequests(
      List<CardSelectionRequestSpi> cardSelectionRequests,
      MultiSelectionProcessing multiSelectionProcessing,
      ChannelControl channelControl)
```

### BoundedWildcard
Can generalize to `? extends CardSelectionResponseApi`
in `src/main/java/org/eclipse/keyple/core/service/CardSelectionManagerAdapter.java`
#### Snippet
```java
   */
  private CardSelectionResult processCardSelectionResponses(
      List<CardSelectionResponseApi> cardSelectionResponses) {

    Assert.getInstance().notEmpty(cardSelectionResponses, "cardSelectionResponses");
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
in `src/main/java/org/eclipse/keyple/core/service/ObservationManagerAdapter.java`
#### Snippet
```java
          observer != null ? observer.getClass().getSimpleName() : null);
    }
    Assert.getInstance().notNull(observer, "observer");
    if (exceptionHandler == null) {
      throw new IllegalStateException("No exception handler defined.");
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservationManagerAdapter.java`
#### Snippet
```java
   */
  void setObservationExceptionHandler(S exceptionHandler) {
    Assert.getInstance().notNull(exceptionHandler, "exceptionHandler");
    this.exceptionHandler = exceptionHandler;
  }
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/CardSelectionScenarioAdapter.java`
#### Snippet
```java
        .notEmpty(cardSelectionRequests, "cardSelectionRequests")
        .notNull(multiSelectionProcessing, "multiSelectionProcessing")
        .notNull(channelControl, "channelControl");

    this.cardSelectionRequests = cardSelectionRequests;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalPluginAdapter.java`
#### Snippet
```java
  @Override
  public void removeObserver(PluginObserverSpi observer) {
    Assert.getInstance().notNull(observer, "observer");
    if (getObservationManager().getObservers().contains(observer)) {
      super.removeObserver(observer);
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/LocalPoolPluginAdapter.java`
#### Snippet
```java
          readerGroupReference);
    }
    Assert.getInstance().notEmpty(readerGroupReference, "readerGroupReference");

    ReaderSpi readerSpi;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/LocalPoolPluginAdapter.java`
#### Snippet
```java
          reader != null ? reader.getName() : null);
    }
    Assert.getInstance().notNull(reader, "reader");

    try {
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/RemoteReaderAdapter.java`
#### Snippet
```java
          executeReaderServiceRemotely(input, remoteReaderSpi, getName(), getPluginName(), logger);

      Assert.getInstance().notNull(output, OUTPUT);

      return output.get(JsonProperty.RESULT.getKey()).getAsBoolean();
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/RemoteReaderAdapter.java`
#### Snippet
```java
          executeReaderServiceRemotely(input, remoteReaderSpi, getName(), getPluginName(), logger);

      Assert.getInstance().notNull(output, OUTPUT);

      return JsonUtil.getParser()
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/RemoteReaderAdapter.java`
#### Snippet
```java
          executeReaderServiceRemotely(input, remoteReaderSpi, getName(), getPluginName(), logger);

      Assert.getInstance().notNull(output, OUTPUT);

      return JsonUtil.getParser()
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/AbstractObservableLocalPluginAdapter.java`
#### Snippet
```java
  @Override
  public void removeObserver(PluginObserverSpi observer) {
    Assert.getInstance().notNull(observer, "observer");
    if (observationManager.getObservers().contains(observer)) {
      observationManager.removeObserver(observer);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/SmartCardServiceAdapter.java`
#### Snippet
```java
  public Plugin registerPlugin(KeyplePluginExtensionFactory pluginFactory) {

    Assert.getInstance().notNull(pluginFactory, "pluginFactory");

    AbstractPluginAdapter plugin = null;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/SmartCardServiceAdapter.java`
#### Snippet
```java

    Assert.getInstance()
        .notNull(
            distributedLocalServiceExtensionFactory, "distributedLocalServiceExtensionFactory");

```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/SmartCardServiceAdapter.java`
#### Snippet
```java
        "Registering a new distributed local service to the service : {}",
        distributedLocalServiceName);
    Assert.getInstance().notEmpty(distributedLocalServiceName, "distributedLocalServiceName");
    if (isDistributedLocalServiceRegistered(distributedLocalServiceName)) {
      throw new IllegalStateException(
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/SmartCardServiceAdapter.java`
#### Snippet
```java
  private void checkPluginRegistration(String pluginName) {
    logger.info("Registering a new Plugin to the service : {}", pluginName);
    Assert.getInstance().notEmpty(pluginName, "pluginName");
    if (plugins.containsKey(pluginName)) {
      throw new IllegalStateException(
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemoteReaderAdapter.java`
#### Snippet
```java
          detectionMode);
    }
    Assert.getInstance().notNull(detectionMode, "detectionMode");

    // Build the input JSON data.
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemoteReaderAdapter.java`
#### Snippet
```java
  @Override
  public void removeObserver(CardReaderObserverSpi observer) {
    Assert.getInstance().notNull(observer, "observer");
    if (observationManager.getObservers().contains(observer)) {
      observationManager.removeObserver(observer);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
          detectionMode);
    }
    Assert.getInstance().notNull(detectionMode, "detectionMode");
    this.detectionMode = detectionMode;
    stateService.onEvent(InternalEvent.START_DETECT);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
  @Override
  public final void removeObserver(CardReaderObserverSpi observer) {
    Assert.getInstance().notNull(observer, "observer");
    if (observationManager.getObservers().contains(observer)) {
      observationManager.removeObserver(observer);
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/RemotePluginAdapter.java`
#### Snippet
```java
      logger.debug("Plugin '{}' receives a reader event : {}", getName(), jsonData);
    }
    Assert.getInstance().notEmpty(jsonData, "jsonData");

    // Extract the event.
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemotePluginAdapter.java`
#### Snippet
```java
  @Override
  public void removeObserver(PluginObserverSpi observer) {
    Assert.getInstance().notNull(observer, "observer");
    if (observationManager.getObservers().contains(observer)) {
      observationManager.removeObserver(observer);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemotePluginAdapter.java`
#### Snippet
```java
          remoteReaderSpi != null ? remoteReaderSpi.getName() : null);
    }
    Assert.getInstance().notNull(remoteReaderSpi, "remoteReaderSpi");

    // Create the reader.
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemotePluginAdapter.java`
#### Snippet
```java
      logger.debug("Plugin '{}' unregisters the reader '{}'.", getName(), remoteReaderName);
    }
    Assert.getInstance().notEmpty(remoteReaderName, "remoteReaderName");

    CardReader reader = getReader(remoteReaderName);
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemotePluginAdapter.java`
#### Snippet
```java
      logger.debug("Plugin '{}' receives a plugin event : {}", getName(), jsonData);
    }
    Assert.getInstance().notEmpty(jsonData, "jsonData");

    // Extract the event.
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/LocalReaderAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .notEmpty(readerProtocol, "readerProtocol")
        .notEmpty(applicationProtocol, "applicationProtocol");
    if (!((ConfigurableReaderSpi) readerSpi).isProtocolSupported(readerProtocol)) {
      throw new ReaderProtocolNotSupportedException(readerProtocol);
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/LocalReaderAdapter.java`
#### Snippet
```java
    // RL-CL-PROTOCOL.1
    checkStatus();
    Assert.getInstance().notEmpty(readerProtocol, "readerProtocol");
    protocolAssociations.remove(readerProtocol);
    if (!((ConfigurableReaderSpi) readerSpi).isProtocolSupported(readerProtocol)) {
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/LocalReaderAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .notNull(cardSelector.getAid(), "aid")
        .isInRange(cardSelector.getAid().length, 0, 16, "aid");

    if (readerSpi instanceof AutonomousSelectionReaderSpi) {
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/RemotePoolPluginAdapter.java`
#### Snippet
```java
          readerGroupReference);
    }
    Assert.getInstance().notEmpty(readerGroupReference, "readerGroupReference");

    // Build the input JSON data.
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/RemotePoolPluginAdapter.java`
#### Snippet
```java
          reader != null ? reader.getName() : null);
    }
    Assert.getInstance().notNull(reader, "reader");

    // Build the input JSON data.
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/CardSelectionManagerAdapter.java`
#### Snippet
```java
        .notNull(observableCardReader, "observableCardReader")
        .notNull(detectionMode, "detectionMode")
        .notNull(notificationMode, "notificationMode");

    CardSelectionScenarioAdapter cardSelectionScenario =
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/CardSelectionManagerAdapter.java`
#### Snippet
```java
  public CardSelectionResult processCardSelectionScenario(CardReader reader) {

    Assert.getInstance().notNull(reader, "reader");

    // Communicate with the card to make the actual selection
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/CardSelectionManagerAdapter.java`
#### Snippet
```java

    Assert.getInstance()
        .notNull(scheduledCardSelectionsResponse, "scheduledCardSelectionsResponse");

    return processCardSelectionResponses(
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/CardSelectionManagerAdapter.java`
#### Snippet
```java
  public int prepareSelection(CardSelection cardSelection) {

    Assert.getInstance().notNull(cardSelection, "cardSelection");

    /* keep the selection request */
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/AbstractReaderAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .notNull(cardRequest, "cardRequest")
        .notNull(channelControl, "channelControl");

    CardResponseApi cardResponse = null;
```

