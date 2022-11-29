# sling-org-apache-sling-distribution-journal 
 
# Bad smells
I found 70 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 16 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 11 | false |
| ObsoleteCollection | 9 | false |
| DataFlowIssue | 6 | false |
| ReturnNull | 5 | false |
| ZeroLengthArrayInitialization | 4 | false |
| PublicFieldAccessedInSynchronizedContext | 3 | false |
| DefaultAnnotationParam | 2 | false |
| RedundantFieldInitialization | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| IOResource | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| InstanceofCatchParameter | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| WaitNotInLoop | 1 | false |
| ConstantValue | 1 | false |
## RuleId[ruleID=IOResource]
### IOResource
'QueueCacheSeeder' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/MessagingCacheCallback.java`
#### Snippet
```java
    public Closeable createConsumer(MessageHandler<PackageMessage> handler) {
        log.info("Starting consumer");
        QueueCacheSeeder seeder = new QueueCacheSeeder(messagingProvider.createSender(packageTopic)); //NOSONAR
        Closeable poller = messagingProvider.createPoller( //NOSONAR
                packageTopic,
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/DistributionPublisher.java`
#### Snippet
```java
 */
@Component(
        service = {}, 
        immediate = true,
        configurationPid = DistributionPublisher.FACTORY_PID
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/sling/distribution/journal/impl/subscriber/DistributionSubscriber.java`
#### Snippet
```java
 * {@code DistributionPublisher} agent.
 */
@Component(service = {}, immediate = true, property = {
        "announceDelay=10000" }, configurationPid = "org.apache.sling.distribution.journal.impl.subscriber.DistributionSubscriberFactory")
@Designate(ocd = SubscriberConfiguration.class, factory = true)
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/sling/distribution/journal/impl/subscriber/DistributionSubscriber.java`
#### Snippet
```java

    private static String escape(String st) {
        return Text.escapeIllegalJcrChars(st.replace("/", "_"));
    }

```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/sling/distribution/journal/bookkeeper/BookKeeper.java`
#### Snippet
```java
        } catch (Exception e2) {
            log.warn("Error sending log message", e2);
        }; 
        if (giveUp) {
            log.warn(msg, e);
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Unboxing of `queueItem.get(QueueItemFactory.RECORD_TIMESTAMP, Long.class)` may produce `NullPointerException`
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/QueueEntryFactory.java`
#### Snippet
```java

    private Calendar itemCalendar(DistributionQueueItem queueItem) {
        long recordTimestamp = queueItem.get(QueueItemFactory.RECORD_TIMESTAMP, Long.class);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(recordTimestamp);
```

### DataFlowIssue
Method invocation `putAll` may produce `NullPointerException`
in `src/main/java/org/apache/sling/distribution/journal/bookkeeper/LocalStore.java`
#### Snippet
```java

        if (store != null) {
            store.adaptTo(ModifiableValueMap.class).putAll(map);
        } else {
            serviceResolver.create(parent, storeId, map);
```

### DataFlowIssue
Argument `queueItem.get(PROPERTY_REQUEST_TYPE, String.class)` might be null
in `src/main/java/org/apache/sling/distribution/journal/impl/event/DistributionEvent.java`
#### Snippet
```java
    public static Event eventPackageDistributed(DistributionQueueItem queueItem, String agentName) {
        return buildEvent(AGENT_PACKAGE_DISTRIBUTED, KIND_AGENT, agentName,
                queueItem.get(PROPERTY_REQUEST_TYPE, String.class),
                queueItem.get(PROPERTY_REQUEST_PATHS, String[].class),
                queueItem.getPackageId());
```

### DataFlowIssue
Argument `queueItem.get(PROPERTY_REQUEST_PATHS, String[].class)` might be null
in `src/main/java/org/apache/sling/distribution/journal/impl/event/DistributionEvent.java`
#### Snippet
```java
        return buildEvent(AGENT_PACKAGE_DISTRIBUTED, KIND_AGENT, agentName,
                queueItem.get(PROPERTY_REQUEST_TYPE, String.class),
                queueItem.get(PROPERTY_REQUEST_PATHS, String[].class),
                queueItem.getPackageId());
    }
```

### DataFlowIssue
Argument `pkgInfo.get(PROPERTY_REQUEST_DEEP_PATHS, String[].class)` might be null
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/PackageMessageFactory.java`
#### Snippet
```java
        final DistributionPackageInfo pkgInfo = disPkg.getInfo();
        final List<String> paths = Arrays.asList(pkgInfo.getPaths());
        final List<String> deepPaths = Arrays.asList(pkgInfo.get(PROPERTY_REQUEST_DEEP_PATHS, String[].class));
        final String pkgId = disPkg.getId();
        PackageMessageBuilder pkgBuilder = PackageMessage.builder()
```

### DataFlowIssue
Unboxing of `pkgNode.getValueMap().get("jcr:created", Long.class)` may produce `NullPointerException`
in `src/main/java/org/apache/sling/distribution/journal/binary/jcr/PackageCleaner.java`
#### Snippet
```java
    private int cleanNode(Resource pkgNode)
            throws PersistenceException {
        long createdTime  = pkgNode.getValueMap().get("jcr:created", Long.class);
        if (createdTime < deleteOlderThanTime) {
            LOG.info("removing package={}, created={} < deleteTime={}", pkgNode.getName(), createdTime, deleteOlderThanTime);
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `src/main/java/org/apache/sling/distribution/journal/shared/JournalAvailableChecker.java`
#### Snippet
```java
        metrics.createGauge(DistributionMetricsService.BASE_COMPONENT + ".journal_available", this::isAvailable);

        Arrays.asList(config.trackedErrCodes()).stream().spliterator()
            .forEachRemaining(code -> metrics.getJournalErrorCodeCount(code));

```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `notifier` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/DistributedEventNotifierManager.java`
#### Snippet
```java
    private Configuration config;

    private PackageDistributedNotifier notifier;

    @Activate
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `reg` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/DistributedEventNotifierManager.java`
#### Snippet
```java
    private ResourceResolverFactory resolverFactory;

    private ServiceRegistration<TopologyChangeHandler> reg;

    private BundleContext context;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `context` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/DistributedEventNotifierManager.java`
#### Snippet
```java
    private ServiceRegistration<TopologyChangeHandler> reg;

    private BundleContext context;

    private Configuration config;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `backoffRetry` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/shared/JournalAvailableChecker.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(JournalAvailableChecker.class);
    
    private ExponentialBackOff backoffRetry;
    
    @Reference
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `marker` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/shared/JournalAvailableChecker.java`
#### Snippet
```java
    DistributionMetricsService metrics;
    
    JournalAvailableServiceMarker marker;

    @Activate
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `metrics` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/shared/JournalAvailableChecker.java`
#### Snippet
```java
    
    @Reference
    DistributionMetricsService metrics;
    
    JournalAvailableServiceMarker marker;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentMaxDelay` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/shared/ExponentialBackOff.java`
#### Snippet
```java
    private final AtomicBoolean isScheduled;
    
    private long currentMaxDelay;
    private long lastCheck;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastCheck` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/shared/ExponentialBackOff.java`
#### Snippet
```java
    
    private long currentMaxDelay;
    private long lastCheck;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `schedule` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/impl/subscriber/SubscriberIdle.java`
#### Snippet
```java
    private final AtomicBoolean isReady;
    private final ScheduledExecutorService executor;
    private ScheduledFuture<?> schedule;

    public SubscriberIdle(int idleMillis, int forceIdleMillies, AtomicBoolean readyHolder) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `topics` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/impl/precondition/StagingPrecondition.java`
#### Snippet
```java

    @Reference
    private Topics topics;

    private volatile PackageStatusWatcher watcher;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `messagingProvider` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/distribution/journal/impl/precondition/StagingPrecondition.java`
#### Snippet
```java

    @Reference
    private MessagingProvider messagingProvider;

    @Reference
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/DistributedEventNotifierManager.java`
#### Snippet
```java
    private synchronized void registerService() {
        if (reg == null) {
            reg = context.registerService(TopologyChangeHandler.class, notifier, new Hashtable<>());
        }
    }
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/PubQueueProviderPublisher.java`
#### Snippet
```java
                commandSender);
        this.pubQueueProvider = pubQueueProviderFactory.create(callback);
        reg = context.registerService(PubQueueProvider.class, this.pubQueueProvider, new Hashtable<>());
    }
    
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/distribution/journal/impl/subscriber/SubscriberIdleCheck.java`
#### Snippet
```java
    public SubscriberIdleCheck(BundleContext context, IdleCheck idleCheck) {
        this.idleCheck = idleCheck;
        final Dictionary<String, Object> props = new Hashtable<>();
        props.put(HealthCheck.NAME, CHECK_NAME);
        this.reg = context.registerService(HealthCheck.class, this, props);
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/distribution/journal/shared/DistributionLogEventListener.java`
#### Snippet
```java
        this.log = log;
        this.pubAgentName = pubAgentName;
        Dictionary<String, Object> eventHandlerProps = new Hashtable<>();
        eventHandlerProps.put(EventConstants.EVENT_TOPIC, TOPICS);
        reg = context.registerService(EventHandler.class, this, eventHandlerProps);
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/DistributionPublisher.java`
#### Snippet
```java
    
    private Dictionary<String, Object> createServiceProps(PublisherConfiguration config) {
        Dictionary<String, Object> props = new Hashtable<>();
        props.put("name", config.name());
        props.put("title", config.name());
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/distribution/journal/impl/discovery/DiscoveryService.java`
#### Snippet
```java
    private void startTopologyViewUpdaterTask(BundleContext context) {
        // Register periodic task to update the topology view
        Dictionary<String, Object> props = new Hashtable<>();
        props.put(PROPERTY_SCHEDULER_CONCURRENT, false);
        props.put(PROPERTY_SCHEDULER_PERIOD, 5L); // every 5 seconds
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `src/main/java/org/apache/sling/distribution/journal/shared/JMXRegistration.java`
#### Snippet
```java
    
    public static ObjectName nameOf(String type, String id) throws MalformedObjectNameException {
        Hashtable<String, String> props = new Hashtable<>();
        props.put("type", type);
        props.put("id", id);
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/distribution/journal/shared/JMXRegistration.java`
#### Snippet
```java
    
    public static ObjectName nameOf(String type, String id) throws MalformedObjectNameException {
        Hashtable<String, String> props = new Hashtable<>();
        props.put("type", type);
        props.put("id", id);
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/PubQueueProviderImpl.java`
#### Snippet
```java
    private void startCleanupTask(BundleContext context) {
        // Register periodic task to update the topology view
        Dictionary<String, Object> props = new Hashtable<>();
        props.put(PROPERTY_SCHEDULER_CONCURRENT, false);
        props.put(PROPERTY_SCHEDULER_PERIOD, 12*60*60L); // every 12 h
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/sling/distribution/journal/bookkeeper/ErrorListener.java`
#### Snippet
```java
public class ErrorListener implements ProgressTrackerListener {

    private String errorMessage = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/sling/distribution/journal/bookkeeper/BookKeeper.java`
#### Snippet
```java
    private final ImportPostProcessor importPostProcessor;
    private final InvalidationProcessor invalidationProcessor;
    private int skippedCounter = 0;

    public BookKeeper(ResourceResolverFactory resolverFactory, DistributionMetricsService distributionMetricsService,
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/DistributionPublisher.java`
#### Snippet
```java
            String msg = format("Failed to append distribution package %s to the journal", pkg);
            log.error(msg, e);
            if (e instanceof Error) {
                throw (Error) e;
            } else {
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-29-14-31-27.751.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/QueueEntryFactory.java`
#### Snippet
```java
    public DistributionQueueEntry create(DistributionQueueItem queueItem) {
        if (queueItem == null) {
            return null;
        }
        String entryId = EntryUtil.entryId(queueItem);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/PubQueue.java`
#### Snippet
```java

    private Throwable error(DistributionQueueItem queueItem) {
        return queueItem.equals(headItem) ? error : null ;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/distribution/journal/binary/jcr/JcrBinaryStore.java`
#### Snippet
```java
            }
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/MessagingCacheCallback.java`
#### Snippet
```java
        State state = view.getState(subAgentId, pubAgentName);
        if (state == null) {
            return null;
        }
        ClearCallback editableCallback = offset -> sendClearCommand(pubAgentName, new AgentId(subAgentId), offset);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/PubErrQueue.java`
#### Snippet
```java
        this.agentQueue = requireNonNull(agentQueue);
        this.errorQueue = requireNonNull(errorQueue);
        this.entryFactory = new QueueEntryFactory(queueName, queueItem -> 0, queueItem -> null);
    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`messageBuffer.size() > 0` can be replaced with '!messageBuffer.isEmpty()'
in `src/main/java/org/apache/sling/distribution/journal/impl/subscriber/DistributionSubscriber.java`
#### Snippet
```java
            return DistributionAgentState.BLOCKED;
        }
        return messageBuffer.size() > 0 ? DistributionAgentState.RUNNING : DistributionAgentState.IDLE;
    }

```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/distribution/journal/bookkeeper/AppliedEvent.java`
#### Snippet
```java
    
    Event toEvent() {
        String[] paths = pkgMsg.getPaths().toArray(new String[0]);
        Map<String, Object> props = new HashMap<>();
        props.put(DISTRIBUTION_COMPONENT_KIND, KIND_IMPORTER);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/distribution/journal/queue/QueueItemFactory.java`
#### Snippet
```java
	@Nonnull
    private static String[] toArray(List<String> paths) {
        return paths.isEmpty() ? new String[]{} : paths.toArray(new String[0]);
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/distribution/journal/queue/QueueItemFactory.java`
#### Snippet
```java
	@Nonnull
    private static String[] toArray(List<String> paths) {
        return paths.isEmpty() ? new String[]{} : paths.toArray(new String[0]);
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/distribution/journal/impl/event/DistributionEvent.java`
#### Snippet
```java
        return buildEvent(topic, kind, agentName,
                pkgMsg.getReqType().name(),
                pathsList.toArray(new String[0]),
                pkgMsg.getPkgId());
    }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/distribution/journal/bookkeeper/LocalStore.java`
#### Snippet
```java
            serviceResolver.create(parent, storeId, map);
        }
        LOG.debug(String.format("Stored data %s for storeId %s", map.toString(), storeId));
    }

```

## RuleId[ruleID=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `src/main/java/org/apache/sling/distribution/journal/shared/Delay.java`
#### Snippet
```java
        synchronized (delayer) {
            try {
                delayer.wait(delayInMs); //NOSONAR
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends PackageMessage`
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/PackageQueuedNotifier.java`
#### Snippet
```java
    }

    private void queued(FullMessage<PackageMessage> fullMessage) {
        long offset = fullMessage.getInfo().getOffset();
        PackageMessage message = fullMessage.getMessage();
```

### BoundedWildcard
Can generalize to `? super PackageMessage`
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/QueueCacheSeeder.java`
#### Snippet
```java
    private Thread seedingThread;
    
    public QueueCacheSeeder(MessageSender<PackageMessage> sender) {
        this.sender = sender;
    }
```

### BoundedWildcard
Can generalize to `? extends FullMessage`
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/PackageQueuedNotifier.java`
#### Snippet
```java

    @Override
    public void queued(List<FullMessage<PackageMessage>> fullMessages) {
        fullMessages.forEach(this::queued);
    }
```

### BoundedWildcard
Can generalize to `? extends LongStream`
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/PackageDistributedNotifier.java`
#### Snippet
```java
     * @param offsets range of offsets, from smallest offset to largest offset.
     */
    private void processOffsets(String pubAgentName, Supplier<LongStream> offsets) {
        long minOffset = offsets.get().findFirst().getAsLong();

```

### BoundedWildcard
Can generalize to `? extends PackageMessage`
in `src/main/java/org/apache/sling/distribution/journal/queue/QueueItemFactory.java`
#### Snippet
```java
    }

    public static DistributionQueueItem fromPackage(FullMessage<PackageMessage> fMessage) {
        return fromPackage(fMessage.getInfo(), fMessage.getMessage(), false);
    }
```

### BoundedWildcard
Can generalize to `? super DistributionQueueItem`
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/QueueEntryFactory.java`
#### Snippet
```java
    private final Function<DistributionQueueItem, Throwable> errorCallback;

    public QueueEntryFactory(String queueName, ToIntFunction<DistributionQueueItem> attemptsCallback, Function<DistributionQueueItem, Throwable> errorCallback) {
        this.queueName = queueName;
        this.attemptsCallback = attemptsCallback;
```

### BoundedWildcard
Can generalize to `? super DistributionQueueItem`
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/QueueEntryFactory.java`
#### Snippet
```java
    private final Function<DistributionQueueItem, Throwable> errorCallback;

    public QueueEntryFactory(String queueName, ToIntFunction<DistributionQueueItem> attemptsCallback, Function<DistributionQueueItem, Throwable> errorCallback) {
        this.queueName = queueName;
        this.attemptsCallback = attemptsCallback;
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/QueueEntryFactory.java`
#### Snippet
```java
    private final Function<DistributionQueueItem, Throwable> errorCallback;

    public QueueEntryFactory(String queueName, ToIntFunction<DistributionQueueItem> attemptsCallback, Function<DistributionQueueItem, Throwable> errorCallback) {
        this.queueName = queueName;
        this.attemptsCallback = attemptsCallback;
```

### BoundedWildcard
Can generalize to `? super PackageMessage`
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/DistributionPublisher.java`
#### Snippet
```java
    private DistributionResponse execute(ResourceResolver resourceResolver,
                                         DistributionRequest request,
                                         ToLongFunction<PackageMessage> sender)
            throws DistributionException {
        final PackageMessage pkg;
```

### BoundedWildcard
Can generalize to `? extends PackageMessage`
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/PubQueueCache.java`
#### Snippet
```java
    }

    private boolean isNotTestMessage(FullMessage<PackageMessage> message) {
        return message.getMessage().getReqType() != PackageMessage.ReqType.TEST;
    }
```

### BoundedWildcard
Can generalize to `? super PackageStatusMessage`
in `src/main/java/org/apache/sling/distribution/journal/bookkeeper/BookKeeper.java`
#### Snippet
```java
    
    public BookKeeper(ResourceResolverFactory resolverFactory, DistributionMetricsService distributionMetricsService,
        PackageHandler packageHandler, EventAdmin eventAdmin, Consumer<PackageStatusMessage> sender, Consumer<LogMessage> logSender,
        BookKeeperConfig config, ImportPostProcessor importPostProcessor, InvalidationProcessor invalidationProcessor) {
        this.packageHandler = packageHandler;
```

### BoundedWildcard
Can generalize to `? super LogMessage`
in `src/main/java/org/apache/sling/distribution/journal/bookkeeper/BookKeeper.java`
#### Snippet
```java
    
    public BookKeeper(ResourceResolverFactory resolverFactory, DistributionMetricsService distributionMetricsService,
        PackageHandler packageHandler, EventAdmin eventAdmin, Consumer<PackageStatusMessage> sender, Consumer<LogMessage> logSender,
        BookKeeperConfig config, ImportPostProcessor importPostProcessor, InvalidationProcessor invalidationProcessor) {
        this.packageHandler = packageHandler;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/sling/distribution/journal/impl/discovery/TopologyViewDiff.java`
#### Snippet
```java
    }

    private <T> Set<T> retained(Set<T> oldSet, Set<T> newSet) {
        Set<T> retained = new HashSet<>(newSet);
        retained.retainAll(oldSet);
```

### BoundedWildcard
Can generalize to `? super ClearCommand`
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/MessagingCacheCallback.java`
#### Snippet
```java
            DistributionMetricsService distributionMetricsService,
            DiscoveryService discoveryService,
            Consumer<ClearCommand> commandSender) {
        this.messagingProvider = messagingProvider;
        this.packageTopic = packageTopic;
```

### BoundedWildcard
Can generalize to `? super PackageMessage`
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/MessagingCacheCallback.java`
#### Snippet
```java

    @Override
    public Closeable createConsumer(MessageHandler<PackageMessage> handler) {
        log.info("Starting consumer");
        QueueCacheSeeder seeder = new QueueCacheSeeder(messagingProvider.createSender(packageTopic)); //NOSONAR
```

### BoundedWildcard
Can generalize to `? extends PackageMessage`
in `src/main/java/org/apache/sling/distribution/journal/impl/subscriber/DistributionSubscriber.java`
#### Snippet
```java
    }

    private void processQueueItem(FullMessage<PackageMessage> item)
            throws PersistenceException, LoginException, DistributionException, ImportPostProcessException {
        MessageInfo info = item.getInfo();
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `message == null` is always `false`
in `src/main/java/org/apache/sling/distribution/journal/queue/impl/PubQueueCache.java`
#### Snippet
```java

    private void handlePackage(final MessageInfo info, final PackageMessage message) {
        if (message == null) {
            // Special case to only update the offset
            updateMinOffset(info.getOffset());
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/PackageDistributedNotifier.java`
#### Snippet
```java
     */
    private void processOffsets(String pubAgentName, Supplier<LongStream> offsets) {
        long minOffset = offsets.get().findFirst().getAsLong();

        if (ensureEvent) {
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `src/main/java/org/apache/sling/distribution/journal/impl/publisher/PackageDistributedNotifier.java`
#### Snippet
```java
        if (ensureEvent) {
            long lastDistributedOffset = lastDistributedOffsets.computeIfAbsent(pubAgentName, this::getLastStoredDistributedOffset);
            minOffset = Math.min(offsets.get().findFirst().getAsLong(), lastDistributedOffset);
        }

```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `this.marker` accessed in synchronized context
in `src/main/java/org/apache/sling/distribution/journal/shared/JournalAvailableChecker.java`
#### Snippet
```java
        String type = (String) event.getProperty(ExceptionEventSender.KEY_TYPE);
        String msg = (String) event.getProperty(ExceptionEventSender.KEY_MESSAGE);
        if (this.marker.isRegistered()) {
            LOG.warn("Received exception event {}: {}. Journal is considered unavailable.", type, msg);
            this.marker.unRegister();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.marker` accessed in synchronized context
in `src/main/java/org/apache/sling/distribution/journal/shared/JournalAvailableChecker.java`
#### Snippet
```java
        if (this.marker.isRegistered()) {
            LOG.warn("Received exception event {}: {}. Journal is considered unavailable.", type, msg);
            this.marker.unRegister();
            this.backoffRetry.startChecks();
        } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `metrics` accessed in synchronized context
in `src/main/java/org/apache/sling/distribution/journal/shared/JournalAvailableChecker.java`
#### Snippet
```java
        String errCode = (String) event.getProperty(ExceptionEventSender.KEY_ERROR_CODE);
        if ((errCode != null) && !errCode.isEmpty()) {
            metrics.getJournalErrorCodeCount(errCode).increment();
        }
    }
```

