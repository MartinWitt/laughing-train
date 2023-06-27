# keyple-service-java-lib 
 
# Bad smells
I found 92 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 36 | false |
| Deprecation | 35 | false |
| DataFlowIssue | 5 | false |
| UNCHECKED_WARNING | 3 | false |
| BusyWait | 3 | false |
| LoopStatementsThatDontLoop | 2 | false |
| UnstableApiUsage | 2 | false |
| UnnecessaryModifier | 1 | true |
| JavadocReference | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.keyple.core.common.KeyplePluginExtension' to 'T'
in `src/main/java/org/eclipse/keyple/core/service/AbstractPluginAdapter.java`
#### Snippet
```java
  public final <T extends KeyplePluginExtension> T getExtension(Class<T> pluginExtensionClass) {
    checkStatus();
    return (T) pluginExtension;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.keyple.core.distributed.local.spi.LocalServiceSpi' to 'T'
in `src/main/java/org/eclipse/keyple/core/service/DistributedLocalServiceAdapter.java`
#### Snippet
```java
      Class<T> distributedLocalServiceExtensionClass) {
    checkStatus();
    return (T) localServiceSpi;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.keyple.core.common.KeypleReaderExtension' to 'T'
in `src/main/java/org/eclipse/keyple/core/service/AbstractReaderAdapter.java`
#### Snippet
```java
  public final <T extends KeypleReaderExtension> T getExtension(Class<T> readerExtensionClass) {
    checkStatus();
    return (T) readerExtension;
  }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `waitForCardPresent()`
in `src/main/java/org/eclipse/keyple/core/service/CardInsertionPassiveMonitoringJobAdapter.java`
#### Snippet
```java
/**
 * Detect the card insertion thanks to the method {@link
 * WaitForCardInsertionBlockingSpi#waitForCardPresent()}.
 *
 * <p>This method is invoked in another thread.
```

## RuleId[id=LoopStatementsThatDontLoop]
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

## RuleId[id=DataFlowIssue]
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
Method invocation `waitForCardRemovalDuringProcessing` may produce `NullPointerException`
in `src/main/java/org/eclipse/keyple/core/service/CardRemovalPassiveMonitoringJobAdapter.java`
#### Snippet
```java
                readerSpi.waitForCardRemoval();
              } else {
                readerProcessingSpi.waitForCardRemovalDuringProcessing();
              }
            } catch (ReaderIOException e) {
```

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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/org/eclipse/keyple/core/service/WaitForStartDetectStateAdapter.java`
#### Snippet
```java
     * Process InternalEvent
     */
    switch (event) {
      case START_DETECT:
        switchState(MonitoringState.WAIT_FOR_CARD_INSERTION);
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

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'org.eclipse.keyple.core.service.ReaderEvent'
in `src/main/java/org/eclipse/keyple/core/service/ReaderEventAdapter.java`
#### Snippet
```java

  @Override
  public String getPluginName() {
    return pluginName;
  }
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ReaderEventAdapter.java`
#### Snippet
```java

/**
 * Implementation of {@link ReaderEvent}.
 *
 * @since 2.0.0
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ReaderEventAdapter.java`
#### Snippet
```java
 * @since 2.0.0
 */
final class ReaderEventAdapter implements ReaderEvent {

  private final String pluginName;
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/LocalPoolPluginAdapter.java`
#### Snippet
```java
   */
  @Override
  public Reader allocateReader(String readerGroupReference) {

    checkStatus();
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/AbstractPluginAdapter.java`
#### Snippet
```java
   * @since 2.0.0
   */
  final Map<String, Reader> getReadersMap() {
    return readers;
  }
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/AbstractPluginAdapter.java`
#### Snippet
```java
    this.pluginName = pluginName;
    this.pluginExtension = pluginExtension;
    this.readers = new ConcurrentHashMap<String, Reader>();
  }

```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/AbstractPluginAdapter.java`
#### Snippet
```java
  private final KeyplePluginExtension pluginExtension;
  private boolean isRegistered;
  private final Map<String, Reader> readers;

  /**
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/AbstractPluginAdapter.java`
#### Snippet
```java
   */
  @Override
  public final Reader getReader(String name) {
    checkStatus();
    return readers.get(name);
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/AbstractPluginAdapter.java`
#### Snippet
```java
   */
  @Override
  public final Set<Reader> getReaders() {
    checkStatus();
    return new HashSet<Reader>(readers.values());
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/AbstractPluginAdapter.java`
#### Snippet
```java
  public final Set<Reader> getReaders() {
    checkStatus();
    return new HashSet<Reader>(readers.values());
  }

```

### Deprecation
'org.eclipse.keyple.core.service.ObservableReader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java

/**
 * Implementation for {@link ObservableReader}, {@link WaitForCardInsertionAutonomousReaderApi} and
 * {@link WaitForCardRemovalAutonomousReaderApi}.
 *
```

### Deprecation
'org.eclipse.keyple.core.service.ObservableReader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
 */
class ObservableLocalReaderAdapter extends LocalReaderAdapter
    implements ObservableReader,
        WaitForCardInsertionAutonomousReaderApi,
        WaitForCardRemovalAutonomousReaderApi {
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java

  /**
   * Notifies all registered observers with the provided {@link ReaderEvent}.
   *
   * <p>This method never throws an exception. Any errors at runtime are notified to the application
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
   * @since 2.0.0
   */
  final void notifyObservers(final ReaderEvent event) {

    if (logger.isDebugEnabled()) {
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
   * @param event The event.
   */
  private void notifyObserver(CardReaderObserverSpi observer, ReaderEvent event) {
    try {
      observer.onReaderEvent(event);
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
   * This method is invoked by the card insertion monitoring process when a card is inserted.
   *
   * <p>It will return a {@link ReaderEvent} or null:
   *
   * <ul>
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
   *
   * <p>The selection data and the responses to the optional requests that may be present in the
   * card selection scenario are embedded into the {@link ReaderEvent} as a list of {@link
   * CardSelectionResponseApi}.
   *
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalReaderAdapter.java`
#### Snippet
```java
   * @since 2.0.0
   */
  final ReaderEvent processCardInserted() {

    // RL-DET-INSNOTIF.1
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/Plugin.java`
#### Snippet
```java
   * @since 2.0.0
   */
  Reader getReader(String name);
}

```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/Plugin.java`
#### Snippet
```java
   * @since 2.0.0
   */
  Set<Reader> getReaders();

  /**
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/RemotePoolPluginAdapter.java`
#### Snippet
```java
   */
  @Override
  public Reader allocateReader(String readerGroupReference) {

    checkStatus();
```

### Deprecation
'org.eclipse.keyple.core.service.ObservableReader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemoteReaderAdapter.java`
#### Snippet
```java
 * @since 2.0.0
 */
final class ObservableRemoteReaderAdapter extends RemoteReaderAdapter implements ObservableReader {

  private static final Logger logger = LoggerFactory.getLogger(ObservableRemoteReaderAdapter.class);
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemoteReaderAdapter.java`
#### Snippet
```java

  /**
   * Notifies asynchronously all registered observers with the provided {@link ReaderEvent}.
   *
   * @param event The reader event.
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableRemoteReaderAdapter.java`
#### Snippet
```java
   * @since 2.0.0
   */
  void notifyObservers(final ReaderEvent event) {

    if (logger.isDebugEnabled()) {
```

### Deprecation
'org.eclipse.keyple.core.service.ConfigurableReader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/LocalConfigurableReaderAdapter.java`
#### Snippet
```java
 */
final class LocalConfigurableReaderAdapter extends LocalReaderAdapter
    implements ConfigurableReader {

  /**
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/CardInsertionActiveMonitoringJobAdapter.java`
#### Snippet
```java
  private final long cycleDurationMillis;
  private final boolean monitorInsertion;
  private final Reader reader;
  private final AtomicBoolean loop = new AtomicBoolean();

```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/PoolPlugin.java`
#### Snippet
```java
   * @since 2.0.0
   */
  Reader allocateReader(String readerGroupReference);

  /**
```

### Deprecation
'org.eclipse.keyple.core.service.ConfigurableReader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalConfigurableReaderAdapter.java`
#### Snippet
```java
 */
final class ObservableLocalConfigurableReaderAdapter extends ObservableLocalReaderAdapter
    implements ConfigurableReader {

  /**
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/WaitForCardInsertionStateAdapter.java`
#### Snippet
```java
      case CARD_INSERTED:
        // process default selection if any, return an event, can be null
        ReaderEvent cardEvent = this.getReader().processCardInserted();
        if (cardEvent != null) {
          // switch internal state
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/AbstractReaderAdapter.java`
#### Snippet
```java
 * @since 2.0.0
 */
abstract class AbstractReaderAdapter implements Reader, ProxyReaderApi {

  private static final Logger logger = LoggerFactory.getLogger(AbstractReaderAdapter.class);
```

### Deprecation
Overrides deprecated method in 'org.eclipse.keyple.core.service.Reader'
in `src/main/java/org/eclipse/keyple/core/service/AbstractReaderAdapter.java`
#### Snippet
```java
   * @since 2.0.0
   */
  public final <T extends KeypleReaderExtension> T getExtension(Class<T> readerExtensionClass) {
    checkStatus();
    return (T) readerExtension;
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalPluginAdapter.java`
#### Snippet
```java
       * readers list
       */
      final Set<Reader> readers = getReaders();
      for (Reader reader : readers) {
        if (!actualNativeReaderNames.contains(reader.getName())) {
```

### Deprecation
'org.eclipse.keyple.core.service.Reader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/ObservableLocalPluginAdapter.java`
#### Snippet
```java
       */
      final Set<Reader> readers = getReaders();
      for (Reader reader : readers) {
        if (!actualNativeReaderNames.contains(reader.getName())) {
          changedReaderNames.add(reader.getName());
```

### Deprecation
'org.eclipse.keyple.core.service.ReaderEvent' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/RemotePluginAdapter.java`
#### Snippet
```java

    // Extract the event.
    ReaderEvent readerEvent;
    try {
      JsonObject json = JsonUtil.getParser().fromJson(jsonData, JsonObject.class);
```

### Deprecation
'org.eclipse.keyple.core.service.ObservableReader' is deprecated
in `src/main/java/org/eclipse/keyple/core/service/RemotePluginAdapter.java`
#### Snippet
```java
    // Get the target reader.
    CardReader reader = getReader(readerEvent.getReaderName());
    if (!(reader instanceof ObservableReader)) {
      throw new IllegalArgumentException(
          String.format(
```

## RuleId[id=BusyWait]
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
in `src/main/java/org/eclipse/keyple/core/service/LocalPoolPluginAdapter.java`
#### Snippet
```java
  @Override
  public SmartCard getSelectedSmartCard(CardReader reader) {
    Assert.getInstance().notNull(reader, "reader");
    PoolReaderSpi poolReaderSpi =
        (PoolReaderSpi) getReaderExtension(KeypleReaderExtension.class, reader.getName());
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
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/RemoteReaderAdapter.java`
#### Snippet
```java
          executeReaderServiceRemotely(input, remoteReaderSpi, getName(), getPluginName(), logger);

      Assert.getInstance().notNull(output, OUTPUT);

      isLegacyMode = output.has(JsonProperty.RESULT.name());
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/RemoteReaderAdapter.java`
#### Snippet
```java
          executeReaderServiceRemotely(input, remoteReaderSpi, getName(), getPluginName(), logger);

      Assert.getInstance().notNull(output, OUTPUT);

      isLegacyMode = output.has(JsonProperty.RESULT.name());
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/RemoteReaderAdapter.java`
#### Snippet
```java
          executeReaderServiceRemotely(input, remoteReaderSpi, getName(), getPluginName(), logger);

      Assert.getInstance().notNull(output, OUTPUT);

      isLegacyMode = output.has(JsonProperty.RESULT.name());
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
in `src/main/java/org/eclipse/keyple/core/service/RemotePoolPluginAdapter.java`
#### Snippet
```java
  @Override
  public SmartCard getSelectedSmartCard(CardReader reader) {
    Assert.getInstance().notNull(reader, "reader");
    RemoteReaderAdapter remoteReader = (RemoteReaderAdapter) getReader(reader.getName());
    return remoteReader != null ? remoteReader.getSelectedSmartCard() : null;
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
  public int prepareSelection(CardSelection cardSelection) {

    Assert.getInstance().notNull(cardSelection, "cardSelection");

    /* keep the selection request */
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/CardSelectionManagerAdapter.java`
#### Snippet
```java

    Assert.getInstance()
        .isInRange(
            cardSelectionResponses.size(), 1, cardSelections.size(), "cardSelectionResponses");

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
in `src/main/java/org/eclipse/keyple/core/service/SmartCardServiceAdapter.java`
#### Snippet
```java

    Assert.getInstance()
        .notNull(
            distributedLocalServiceExtensionFactory, "distributedLocalServiceExtensionFactory");

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
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/core/service/AbstractReaderAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .notNull(cardRequest, "cardRequest")
        .notNull(channelControl, "channelControl");

    CardResponseApi cardResponse = null;
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
in `src/main/java/org/eclipse/keyple/core/service/RemotePluginAdapter.java`
#### Snippet
```java
      logger.debug("Plugin '{}' receives a reader event : {}", getName(), jsonData);
    }
    Assert.getInstance().notEmpty(jsonData, "jsonData");

    // Extract the event.
```

