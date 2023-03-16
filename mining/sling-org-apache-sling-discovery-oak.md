# sling-org-apache-sling-discovery-oak 
 
# Bad smells
I found 92 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantArrayCreation | 10 | true |
| ConstantValue | 10 | false |
| SizeReplaceableByIsEmpty | 9 | true |
| StringConcatenationInsideStringBufferAppend | 8 | false |
| DataFlowIssue | 4 | false |
| MissortedModifiers | 4 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| RedundantFieldInitialization | 4 | false |
| ReturnNull | 4 | false |
| FinalPrivateMethod | 3 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| Convert2Lambda | 2 | false |
| UnnecessaryContinue | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ZeroLengthArrayInitialization | 2 | false |
| SynchronizeOnThis | 2 | false |
| UnusedAssignment | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryModifier | 1 | true |
| CommentedOutCode | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| BoundedWildcard | 1 | false |
| StringEqualsEmptyString | 1 | false |
| PublicFieldAccessedInSynchronizedContext | 1 | false |
| IgnoreResultOfCall | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| Anonymous2MethodRef | 1 | false |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UseCompareMethod | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[urls.size()\]'
in `src/main/java/org/apache/sling/discovery/oak/Config.java`
#### Snippet
```java
            }
            if (urls.size() > 0) {
                this.topologyConnectorUrls = urls.toArray(new URL[urls.size()]);
                logger.debug("configure: number of topologyConnectorUrls='{}''",
                        urls.size());
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `src/main/java/org/apache/sling/discovery/oak/JoinerDelay.java`
#### Snippet
```java
    private static final String NAME = JoinerDelay.class.getCanonicalName();

    private static enum Phase {
        IDLE,
        DELAYING,
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `keySet` may produce `NullPointerException`
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java
            // if we're not already at the batch limit, check syncTokens too
            if (!mightHaveMore) {
                for (String slingId : syncTokenMap.keySet()) {
                    try {
                        UUID.fromString(slingId);
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `src/main/java/org/apache/sling/discovery/oak/pinger/OakViewChecker.java`
#### Snippet
```java
            final ModifiableValueMap resourceMap = resource.adaptTo(ModifiableValueMap.class);

            resourceMap.put(PROPERTY_ID_RUNTIME, runtimeId);
            // SLING-4765 : store more infos to be able to be more verbose on duplicate slingId/ghost detection
            String slingHomePath = "n/a";
```

### DataFlowIssue
Method invocation `keySet` may produce `NullPointerException`
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java

            final ModifiableValueMap myInstanceMap = myInstance.adaptTo(ModifiableValueMap.class);
            final Set<String> keys = new HashSet<String>(myInstanceMap.keySet());
            for (final String key : keys) {
                if (newProps.containsKey(key)) {
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/org/apache/sling/discovery/oak/cluster/ClusterReader.java`
#### Snippet
```java
        //    on OakViewChecker.activate (or when isolated) - and this activate *can* happen after properties
        //    or announcements have been written - those end up below /var/discovery/oak/clusterInstances/<slingId>/
        String result = resourceMap.get("leaderElectionId", String.class);

        // SLING-6924 : return null case 2 (if leaderElectionId is indeed null, that is)
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (15 lines)
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
            pw.println("<td>"+topologyConnectorClient.getLastRequestEncoding()+"</td>");
            pw.println("<td>"+topologyConnectorClient.getLastResponseEncoding()+"</td>");
            // //TODO fallback urls are not yet implemented!
            // String fallbackConnectorUrls;
            // List<String> urls = topologyConnectorClient
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/pinger/OakViewChecker.java`
#### Snippet
```java

            logger.info("resetLeaderElectionId: storing my runtimeId: {}, endpoints: {}, sling home path: {}, new leaderElectionId: {}, created at: {}",
                    new Object[]{runtimeId, endpointsAsString, slingHomePath, newLeaderElectionId, leaderElectionCreatedAt});
            resourceResolver.commit();
        } catch (LoginException e) {
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
                ObjectName firstName = names.iterator().next();
                final Object value = jmxServer.invoke(firstName, TIME_DIFF_METHOD_NAME, new Object[0], new String[0]);
                logger.debug("{} returns {}", new Object[] { firstName, TIME_DIFF_METHOD_NAME, value });
                resultLog.debug("{} returns {}", firstName, TIME_DIFF_METHOD_NAME, value);
                if (value != null && (value instanceof Long)) {
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
        } catch (final Exception e) {
            logger.warn("execute: {}, JMX method {} invocation failed: {}",
                    new Object[] { DOCUMENT_NODE_STORE_MBEAN, TIME_DIFF_METHOD_NAME, e });
            resultLog.healthCheckError("{}, JMX method {} invocation failed: {}", DOCUMENT_NODE_STORE_MBEAN, TIME_DIFF_METHOD_NAME,
                    e);
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
                            "execute: clocks between local instance (slingId: {}) and remote instance (slingId: {}) out of sync by {}ms"
                                    + "ms which is equal or higher than the high-water mark of {}ms.",
                            new Object[] { slingId, peerSlingId, diffMillis, INTER_CLUSTER_HIGH_WATER_MARK });
                    resultLog.critical(
                            "Clocks heavily out of sync between local instance (slingId: {}) and remote instance (slingId: {}): "
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
                            "Clocks heavily out of sync between local instance (slingId: {}) and remote instance (slingId: {}): "
                                    + "by {}ms which is equal or larger than high-water mark of {}ms",
                            new Object[] { slingId, peerSlingId, diffMillis, INTER_CLUSTER_HIGH_WATER_MARK });
                } else if (Math.abs(diffMillis) >= INTER_CLUSTER_LOW_WATER_MARK) {
                    logger.warn(
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
                            "execute: clocks out of sync between local instance (slingId: {}) and remote instance (slingId: {}) by {}ms "
                                    + "ms which is equal or higher than the low-water mark of {}ms.",
                            new Object[] { slingId, peerSlingId, diffMillis, INTER_CLUSTER_HIGH_WATER_MARK });
                    resultLog.warn(
                            "Clocks noticeably out of sync between local instance (slingId: {}) and remote instance (slingId: {}): "
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
                            "Clocks noticeably out of sync between local instance (slingId: {}) and remote instance (slingId: {}): "
                            + "by {}ms which is equal or larger than low-water mark of {}ms",
                            new Object[] { slingId, peerSlingId, diffMillis, INTER_CLUSTER_HIGH_WATER_MARK });
                } else {
                    logger.debug(
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
                            "execute: clocks in sync between local instance (slingId: {}) and remote instance (slingId: {}). "
                            + "diff is {}ms which is within low-water mark of {}ms.",
                            new Object[] { slingId, peerSlingId, diffMillis, INTER_CLUSTER_HIGH_WATER_MARK });
                    resultLog.info(
                            "Clocks in sync between local instance (slingId: {}) and remote instance (slingId: {}): "
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
                            "Clocks in sync between local instance (slingId: {}) and remote instance (slingId: {}): "
                            + "diff is {}ms which is within low-water mark of {}ms",
                            new Object[] { slingId, peerSlingId, diffMillis, INTER_CLUSTER_HIGH_WATER_MARK });
                }
            }
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
            logger.debug("doUpdateProperties: too early to update the properties. "
                            + "resourceResolverFactory ({}), config ({}) or slingId ({}) not yet set.",
                    new Object[]{rrf, c, sid});
            return;
        } else {
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/sling/discovery/oak/JoinerDelay.java`
#### Snippet
```java

    // called within synchronized(this)
    private final void markDelaying() {
        absoluteTimeout = new Date(System.currentTimeMillis() + timeoutMs);
        phase = Phase.DELAYING;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/sling/discovery/oak/JoinerDelay.java`
#### Snippet
```java
    }

    private final void assertCorrectThreadPool() {
        if (!Thread.currentThread().getName().contains("sling-discovery")) {
            logger.warn("assertCorrectThreadPool : not running as part of 'discovery' thread pool."
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/sling/discovery/oak/JoinerDelay.java`
#### Snippet
```java

    // might be called within or without synchronzied(this), so we do it ourselves
    private final void markDone() {
        synchronized(this) {
            if (absoluteTimeout == null && phase == Phase.DONE) {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`names.size() == 0` can be replaced with 'names.isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
            Set<ObjectName> names = jmxServer.queryNames(n, null);

            if (names.size() == 0) {
                resultLog.info("Intra-cluster test n/a (No DocumentNodeStore MBean found)");
            } else {
```

### SizeReplaceableByIsEmpty
`anUrlStr.length() > 0` can be replaced with '!anUrlStr.isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/Config.java`
#### Snippet
```java
                String anUrlStr = topologyConnectorUrlsStr[i];
                try {
                    if (anUrlStr != null && anUrlStr.length() > 0) {
                        URL url = new URL(anUrlStr);
                        logger.debug("configure: a topologyConnectorbUrl='{}'",
```

### SizeReplaceableByIsEmpty
`urls.size() > 0` can be replaced with '!urls.isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/Config.java`
#### Snippet
```java
                }
            }
            if (urls.size() > 0) {
                this.topologyConnectorUrls = urls.toArray(new URL[urls.size()]);
                logger.debug("configure: number of topologyConnectorUrls='{}''",
```

### SizeReplaceableByIsEmpty
`clusterViewId.length() == 0` can be replaced with 'clusterViewId.isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
        logger.trace("asClusterView: start");
        String clusterViewId = descriptor.getViewId();
        if (clusterViewId == null || clusterViewId.length() == 0) {
            logger.trace("asClusterView: no clusterId provided by discovery-lite descriptor - reading from repo.");
            clusterViewId = readOrDefineClusterId(resourceResolver);
```

### SizeReplaceableByIsEmpty
`clusterId.length() > 0` can be replaced with '!clusterId.isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
            Object clusterIdObj = props.get(PROPERTY_CLUSTER_ID);
            String clusterId = (clusterIdObj == null) ? null : String.valueOf(clusterIdObj);
            if (clusterId != null && clusterId.length() > 0) {
                logger.trace("readOrDefineClusterId: read clusterId from repo as {}", clusterId);
                return clusterId;
```

### SizeReplaceableByIsEmpty
`incomingConnections.size() > 0` can be replaced with '!incomingConnections.isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java

        final Collection<CachedAnnouncement> incomingConnections = announcementRegistry.listLocalIncomingAnnouncements();
        if ( incomingConnections.size() > 0 ) {
            pw.println("Incoming topology connectors");
            pw.println("---------------------------------------");
```

### SizeReplaceableByIsEmpty
`outgoingConnections.size() > 0` can be replaced with '!outgoingConnections.isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java

        final Collection<TopologyConnectorClientInformation> outgoingConnections = connectorRegistry.listOutgoingConnectors();
        if ( outgoingConnections.size() > 0 ) {
            pw.println("Outgoing topology connectors");
            pw.println("---------------------------------------");
```

### SizeReplaceableByIsEmpty
`topologyLog.size() > 0` can be replaced with '!topologyLog.isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
        }

        if ( topologyLog.size() > 0 ) {
            pw.println("Topology Change History");
            pw.println("---------------------------------------");
```

### SizeReplaceableByIsEmpty
`propertyChangeLog.size() > 0` can be replaced with '!propertyChangeLog.isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
        }

        if ( propertyChangeLog.size() > 0 ) {
            pw.println("Property Change History");
            pw.println("---------------------------------------");
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
            }

            addEventLog(event.getType(), "details: "+sb.toString());
        } else if (event.getType() == Type.TOPOLOGY_INIT) {
            this.currentView = event.getNewView();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends InstanceInfo`
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
    }

    private List<Integer> leaderElectionSort(Map<Integer, InstanceInfo> resultingInstances) {
        final Map<Integer, String> leaderElectionIds = new HashMap<>();
        for (InstanceInfo i : resultingInstances.values()) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java

    /** default minimal cleanup delay at 13h, to intraday load balance */
    final static long MIN_CLEANUP_DELAY_MILLIS = 46800000;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java
public class SlingIdCleanupTask implements TopologyEventListener, Runnable {

    final static String SLINGID_CLEANUP_ENABLED_SYSTEM_PROPERTY_NAME = "org.apache.sling.discovery.oak.slingidcleanup.enabled";

    /** default minimal cleanup delay at 13h, to intraday load balance */
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
public class OakDiscoveryService extends BaseDiscoveryService {

    private final static Logger logger = LoggerFactory.getLogger(OakDiscoveryService.class);

    @Reference
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
     * Internal class caching some provider infos like service id and ranking.
     */
    private final static class ProviderInfo implements Comparable<ProviderInfo> {

        public final PropertyProvider provider;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
        final PrintWriter pw = res.getWriter();

        if (pathInfo.equals("")) {
            if ( this.currentView != null ) {
                renderOverview(pw,  currentView);
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `activated` accessed in synchronized context
in `src/main/java/org/apache/sling/discovery/oak/pinger/OakViewChecker.java`
#### Snippet
```java
        logger.debug("discoveryLiteCheck: start. [for slingId="+slingId+"]");
        synchronized(lock) {
            if (!activated) {
                // SLING:2895: avoid checks if not activated
                logger.debug("discoveryLiteCheck: not activated yet");
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `UUID.fromString()` is ignored
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java
                for (String slingId : syncTokenMap.keySet()) {
                    try {
                        UUID.fromString(slingId);
                    } catch (Exception e) {
                        // not a uuid
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'value != null' covered by subsequent condition 'value instanceof Long'
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
                logger.debug("{} returns {}", new Object[] { firstName, TIME_DIFF_METHOD_NAME, value });
                resultLog.debug("{} returns {}", firstName, TIME_DIFF_METHOD_NAME, value);
                if (value != null && (value instanceof Long)) {
                    Long diffMillis = (Long) value;
                    if (Math.abs(diffMillis) >= INTRA_CLUSTER_HIGH_WATER_MARK) {
```

### ConditionCoveredByFurtherCondition
Condition 'sr == null' covered by subsequent condition '!(sr instanceof Integer)'
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
            this.propertyProperties = serviceProps.get(PropertyProvider.PROPERTY_PROPERTIES);
            final Object sr = serviceProps.get(Constants.SERVICE_RANKING);
            if (sr == null || !(sr instanceof Integer)) {
                this.ranking = 0;
            } else {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java

        /**
         * @see java.lang.Comparable#compareTo(java.lang.Object)
         */
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java

        /**
         * @see java.lang.Comparable#compareTo(java.lang.Object)
         */
        @Override
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
            }
            // If ranks are equal, then sort by service id in descending order.
            return (this.serviceId < o.serviceId) ? 1 : -1;
        }

```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`this.discoveryResourcePath = this.discoveryResourcePath + "/"` could be simplified to 'this.discoveryResourcePath += "/"'
in `src/main/java/org/apache/sling/discovery/oak/Config.java`
#### Snippet
```java
            this.discoveryResourcePath = this.discoveryResourcePath.substring(0, this.discoveryResourcePath.length() - 1);
        }
        this.discoveryResourcePath = this.discoveryResourcePath + "/";
        if (this.discoveryResourcePath == null || this.discoveryResourcePath.length() <= 1) {
            // if the path is empty, or /, then use the default
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `src/main/java/org/apache/sling/discovery/oak/pinger/OakViewChecker.java`
#### Snippet
```java
            final long interval = config.getDiscoveryLiteCheckInterval();
            logger.info("initialize: starting periodic discoveryLiteCheck job for "+slingId+" with interval "+interval+" sec.");
            periodicCheckViewJob = new PeriodicBackgroundJob(interval, NAME+".discoveryLiteCheck", new Runnable() {

                @Override
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `discoveryService` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/discovery/oak/pinger/OakViewChecker.java`
#### Snippet
```java
    private Config config;

    private OakDiscoveryService discoveryService;

    protected PeriodicBackgroundJob periodicCheckViewJob;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `absoluteTimeout` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/discovery/oak/JoinerDelay.java`
#### Snippet
```java

    private Phase phase = Phase.IDLE;
    private Date absoluteTimeout;

    private final LogSilencer logSilencer = new LogSilencer(logger);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `providerInfos` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
     * All property providers.
     */
    private List<ProviderInfo> providerInfos = new ArrayList<ProviderInfo>();

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `discoveryLiteHistory` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
    private TopologyView currentView;

    private List<String> discoveryLiteHistory = new LinkedList<String>();

    /**
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `src/main/java/org/apache/sling/discovery/oak/pinger/OakViewChecker.java`
#### Snippet
```java
            final long interval = config.getDiscoveryLiteCheckInterval();
            logger.info("initialize: starting periodic discoveryLiteCheck job for "+slingId+" with interval "+interval+" sec.");
            periodicCheckViewJob = new PeriodicBackgroundJob(interval, NAME+".discoveryLiteCheck", new Runnable() {

                @Override
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
            };
        } else {
            comparator = new Comparator<Integer>() {
    
                @Override
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
    @Deactivate
    @Override
    public void deactivate() {
        super.deactivate();
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java
     * volatile flag to fast stop any ongoing deletion upon a change in the topology
     */
    private volatile boolean hasTopology = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
     * events to discovery awares before activate is done
     **/
    private volatile boolean activated = false;

    @Reference
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java

    /** timeout (in millis since 1970) while partially started instances are suppressed */
    private long partialStartupSuppressingTimeout = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
     * to the discoveryLiteHistory - in order to de-duplicate as we go
     */
    private DiscoveryLiteDescriptor lastDiscoveryLiteDescriptor = null;

    @Override
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
                if (newProps.containsKey(key)) {
                    // perfect
                    continue;
                } else if (key.indexOf(":") != -1) {
                    // ignore
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
                } else if (key.indexOf(":") != -1) {
                    // ignore
                    continue;
                } else {
                    // remove
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/discovery/oak/pinger/OakViewChecker.java`
#### Snippet
```java
        if (resourceResolverFactory == null) {
            logger.error("getResourceResolver: resourceResolverFactory is null!");
            return null;
        }
        return resourceResolverFactory.getServiceResourceResolver(null);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
    public String getSlingId() {
    	if (settingsService==null) {
    		return null;
    	}
        return settingsService.getSlingId();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/discovery/oak/cluster/ClusterReader.java`
#### Snippet
```java
        if (myClusterNode == null) {
            // SLING-6924 : return null case 1
            return null;
        }
        ValueMap resourceMap = myClusterNode.adaptTo(ValueMap.class);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
            return foundInstances.iterator().next();
        } else {
            return null;
        }
    }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-16-05-18-27.816.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `newLeaderElectionId` is redundant
in `src/main/java/org/apache/sling/discovery/oak/pinger/OakViewChecker.java`
#### Snippet
```java
        String prefix = String.valueOf(config.getLeaderElectionPrefix());

        final String newLeaderElectionId = prefix + "_"
                + currentTimeMillisStr + "_" + slingId;
        return newLeaderElectionId;
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/org/apache/sling/discovery/oak/cluster/ClusterReader.java`
#### Snippet
```java
        //    on OakViewChecker.activate (or when isolated) - and this activate *can* happen after properties
        //    or announcements have been written - those end up below /var/discovery/oak/clusterInstances/<slingId>/
        String result = resourceMap.get("leaderElectionId", String.class);

        // SLING-6924 : return null case 2 (if leaderElectionId is indeed null, that is)
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
            } else {
                ObjectName firstName = names.iterator().next();
                final Object value = jmxServer.invoke(firstName, TIME_DIFF_METHOD_NAME, new Object[0], new String[0]);
                logger.debug("{} returns {}", new Object[] { firstName, TIME_DIFF_METHOD_NAME, value });
                resultLog.debug("{} returns {}", firstName, TIME_DIFF_METHOD_NAME, value);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java
            } else {
                ObjectName firstName = names.iterator().next();
                final Object value = jmxServer.invoke(firstName, TIME_DIFF_METHOD_NAME, new Object[0], new String[0]);
                logger.debug("{} returns {}", new Object[] { firstName, TIME_DIFF_METHOD_NAME, value });
                resultLog.debug("{} returns {}", firstName, TIME_DIFF_METHOD_NAME, value);
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/sling/discovery/oak/JoinerDelay.java`
#### Snippet
```java
        // here we can be in any phase (IDLE, DELAYING, DONE)
        final boolean isPhaseDone;
        synchronized(this) {
            if (phase == Phase.IDLE) {
                if (joinerConditionApplies(view)) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/sling/discovery/oak/JoinerDelay.java`
#### Snippet
```java
    // might be called within or without synchronzied(this), so we do it ourselves
    private final void markDone() {
        synchronized(this) {
            if (absoluteTimeout == null && phase == Phase.DONE) {
                logger.warn("markDone : already marked done: absoluteTimeout = {}, phase = {}",
```

## RuleId[id=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
                    } else {
                        // inverted order comparison:
                        return Long.valueOf(prefix1).compareTo(prefix0);
                    }
                }
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `this.topologyConnectorWhitelist`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/sling/discovery/oak/Config.java`
#### Snippet
```java
        }
        this.topologyConnectorWhitelist = config.topologyConnectorWhitelist();
        logger.debug("configure: topologyConnectorWhitelist='{}'", this.topologyConnectorWhitelist);

        this.discoveryResourcePath = config.discoveryResourcePath();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `descriptor` initializer `null` is redundant
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
        ResourceResolver resourceResolver = null;
        try {
            DiscoveryLiteDescriptor descriptor = null;
            try{
                resourceResolver = getResourceResolver();
```

### UnusedAssignment
Variable `resourceResolver` initializer `null` is redundant
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
     */
    private synchronized void updateDiscoveryLiteHistory() {
        ResourceResolver resourceResolver = null;
        try{
            resourceResolver = getResourceResolver();
```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`key.indexOf(":") != -1` can be replaced with 'key.contains(":")'
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
                    // perfect
                    continue;
                } else if (key.indexOf(":") != -1) {
                    // ignore
                    continue;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `absoluteTimeout` is always 'null'
in `src/main/java/org/apache/sling/discovery/oak/JoinerDelay.java`
#### Snippet
```java
            if (absoluteTimeout == null && phase == Phase.DONE) {
                logger.warn("markDone : already marked done: absoluteTimeout = {}, phase = {}",
                        absoluteTimeout, phase);
            }
            absoluteTimeout = null;
```

### ConstantValue
Value `announcementRegistry` is always 'null'
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java

        if (announcementRegistry == null) {
            logger.warn("execute: no announcementRegistry ({}) set", announcementRegistry);
            resultLog.warn("Cannot determine topology clocks since no announcementRegistry ({}) set", announcementRegistry);
        } else {
```

### ConstantValue
Condition `this.discoveryResourcePath == null` is always `false`
in `src/main/java/org/apache/sling/discovery/oak/Config.java`
#### Snippet
```java
        }
        this.discoveryResourcePath = this.discoveryResourcePath + "/";
        if (this.discoveryResourcePath == null || this.discoveryResourcePath.length() <= 1) {
            // if the path is empty, or /, then use the default
            this.discoveryResourcePath = DEFAULT_DISCOVERY_RESOURCE_PATH;
```

### ConstantValue
Condition `viewStateManagerLock != null` is always `true`
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
            activated = false;
        } finally {
            if (viewStateManagerLock != null) {
                viewStateManagerLock.unlock();
            }
```

### ConstantValue
Condition `viewStateManagerLock != null` is always `true`
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
            }
        } finally {
            if (viewStateManagerLock != null) {
                viewStateManagerLock.unlock();
            }
```

### ConstantValue
Condition `viewStateManagerLock != null` is always `true`
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
            }
        } finally {
            if (viewStateManagerLock != null) {
                viewStateManagerLock.unlock();
            }
```

### ConstantValue
Condition `viewStateManagerLock != null` is always `true`
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
            }
        } finally {
            if (viewStateManagerLock != null) {
                viewStateManagerLock.unlock();
            }
```

### ConstantValue
Condition `viewStateManagerLock != null` is always `true`
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
            viewStateManager.bind(changePropagationListener);
        } finally {
            if (viewStateManagerLock != null) {
                viewStateManagerLock.unlock();
            }
```

### ConstantValue
Value `suppressionEnabled` is always 'false'
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
                // retry with a fresh idmap
                idMapService.clearCache();
                readResult = reader.readInstance(id, suppressionEnabled, seqNum);
                instanceInfo = readResult.getInstanceInfo();
            }
```

### ConstantValue
Value `odd` is always 'true'
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
        ClusterView myCluster = topology.getLocalInstance().getClusterView();
        boolean odd = true;
        renderCluster(pw, myCluster, myCluster, odd, topology.isCurrent());

        for (Iterator<ClusterView> it = clusters.iterator(); it.hasNext();) {
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
                    // perfect
                } else {
                    sb.append("(" + oldKey + " changed from "
                            + oldProps.get(oldKey) + " to "
                            + newProps.get(oldKey) + ")");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
                newKeys.remove(oldKey);
            } else {
                sb.append("(" + oldKey + " was removed)");
            }
            it.remove();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
        for (Iterator<String> it = newKeys.iterator(); it.hasNext();) {
            String newKey = it.next();
            sb.append("(" + newKey + " was added)");
        }

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
                            + " in oldview.. event="
                            + event);
                    sb.append("did not find instance in old view: " + newInstanceDescription.getSlingId() + ".");
                    continue;
                }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
                        sb.append(", ");
                    }
                    sb.append("on instance "
                            + newInstanceDescription.getSlingId() + (newInstanceDescription.isLeader() ? " [isLeader]" : "")
                            + ": " + diff + ". ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
                            details.append(", ");
                        }
                        details.append(newInstance.getSlingId() + " joined");
                    }
                }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
                            details.append(", ");
                        }
                        details.append(oldInstance.getSlingId() + " left");
                    }
                }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
                                details.append(", ");
                            }
                            details.append("[isLeader: "+leader.getSlingId()+"]");
                        }
                    }
```

