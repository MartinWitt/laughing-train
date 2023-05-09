# sling-org-apache-sling-discovery-oak 
 
# Bad smells
I found 51 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 10 | false |
| FieldMayBeFinal | 7 | false |
| StringConcatenationInsideStringBufferAppend | 5 | false |
| EmptyStatementBody | 4 | false |
| FinalPrivateMethod | 3 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| JavadocReference | 2 | false |
| JavadocDeclaration | 2 | false |
| UnnecessaryContinue | 2 | false |
| DuplicatedCode | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| UnusedAssignment | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryModifier | 1 | true |
| ComparatorMethodParameterNotUsed | 1 | false |
| CommentedOutCode | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| JavadocLinkAsPlainText | 1 | false |
| IgnoreResultOfCall | 1 | false |
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `PersistenceException`
in `src/main/java/org/apache/sling/discovery/oak/cluster/ClusterReader.java`
#### Snippet
```java
     * @return the instance if it is has all required data stored (which does not
     * necessarily mean it has completely started - syncToken is not checked at this stage yet)
     * @throws PersistenceException 
     */
    public InstanceReadResult readInstance(int clusterNodeId, boolean failOnMissingSyncToken, long seqNum) throws PersistenceException {
```

### JavadocReference
Cannot resolve symbol `PersistenceException`
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
     * @return the clusterId to be used - either the one read or defined
     * at /var/discovery/oak - or the slingId in case of non-fixable exceptions
     * @throws PersistenceException when /var/discovery/oak could not be
     * accessed or auto-created
     */
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java
        }
        final TopologyView newView = event.getNewView();
        if (event.getType() == Type.PROPERTIES_CHANGED) {
            // ignore those
        } else if (newView == null) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/sling/discovery/oak/pinger/OakViewChecker.java`
#### Snippet
```java
    @Override
    protected void updateProperties() {
        if (discoveryService == null) {
            // SLING-6065: it's legitimate that updateProperties()
            // (which comes from BaseViewChecker.issueHeartbeat())
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
            String oldKey = it.next();
            if (newKeys.contains(oldKey)) {
                if (oldProps.get(oldKey).equals(newProps.get(oldKey))) {
                    // perfect
                } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/sling/discovery/oak/cluster/OakClusterViewService.java`
#### Snippet
```java
        }

        if (suppressionEnabled && myInstance.isSyncTokenNewerOrEqual(lowestSeqNum)) {
            // that means that the local instance did store a synctoken ever
            // so it did successfully once go through the syncTokenService
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/discovery/oak/cluster/ClusterReader.java`
#### Snippet
```java
     * @return the instance if it is has all required data stored (which does not
     * necessarily mean it has completely started - syncToken is not checked at this stage yet)
     * @throws PersistenceException 
     */
    public InstanceReadResult readInstance(int clusterNodeId, boolean failOnMissingSyncToken, long seqNum) throws PersistenceException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
     * for testing only
     *
     * @return
     */
    public ViewStateManager getViewStateManager() {
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `completionCount` may be 'final'
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java

    /** test counter that increments upon every batch deletion */
    private AtomicInteger completionCount = new AtomicInteger(0);

    /** test counter that keeps track of actually deleted slingIds */
```

### FieldMayBeFinal
Field `seenInstances` may be 'final'
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java
     * so not a memory issue
     */
    private Set<String> seenInstances = new CopyOnWriteArraySet<>();

    @ObjectClassDefinition(name = "Apache Sling Discovery Oak SlingId Cleanup Task", description = "This task is in charge of cleaning up old SlingIds from the repository.")
```

### FieldMayBeFinal
Field `runCount` may be 'final'
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java

    /** test counter that increments upon every scheduler invocation */
    private AtomicInteger runCount = new AtomicInteger(0);

    /** test counter that increments upon every batch deletion */
```

### FieldMayBeFinal
Field `deleteCount` may be 'final'
in `src/main/java/org/apache/sling/discovery/oak/SlingIdCleanupTask.java`
#### Snippet
```java

    /** test counter that keeps track of actually deleted slingIds */
    private AtomicInteger deleteCount = new AtomicInteger(0);

    /**
```

### FieldMayBeFinal
Field `discoveryLiteHistory` may be 'final'
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
    private TopologyView currentView;

    private List<String> discoveryLiteHistory = new LinkedList<String>();

    /**
```

### FieldMayBeFinal
Field `changePropagationListener` may be 'final'
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
    private final List<TopologyEventListener> pendingListeners = new LinkedList<TopologyEventListener>();

    private TopologyEventListener changePropagationListener = new TopologyEventListener() {

        @Override
```

### FieldMayBeFinal
Field `providerInfos` may be 'final'
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java
     * All property providers.
     */
    private List<ProviderInfo> providerInfos = new ArrayList<ProviderInfo>();

    /**
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `keys` are queried, but never updated
in `src/main/java/org/apache/sling/discovery/oak/OakDiscoveryService.java`
#### Snippet
```java

            final ModifiableValueMap myInstanceMap = myInstance.adaptTo(ModifiableValueMap.class);
            final Set<String> keys = new HashSet<String>(myInstanceMap.keySet());
            for (final String key : keys) {
                if (newProps.containsKey(key)) {
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

## RuleId[id=FinalPrivateMethod]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
            final boolean inLocalCluster = renderCluster == localCluster;
            Announcement parentAnnouncement = null;
            for (Iterator<Announcement> it2 = announcements.iterator(); it2
                    .hasNext();) {
                Announcement announcement = it2.next();
                for (Iterator<InstanceDescription> it3 = announcement
                        .listInstances().iterator(); it3.hasNext();) {
                    InstanceDescription announcedInstance = it3.next();
                    if (announcedInstance.getSlingId().equals(
                            instanceDescription.getSlingId())) {
                        parentAnnouncement = announcement;
                        break;
                    }
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
                final int statusCode = topologyConnectorClient.getStatusCode();
                final String statusDetails = topologyConnectorClient.getStatusDetails();
                final String tooltipText;
                switch(statusCode) {
                case HttpServletResponse.SC_UNAUTHORIZED:
                    tooltipText = HttpServletResponse.SC_UNAUTHORIZED +
                        ": possible setup issue of discovery.oak on target instance, or wrong URL";
                    break;
                case HttpServletResponse.SC_NOT_FOUND:
                    tooltipText = HttpServletResponse.SC_NOT_FOUND +
                        ": possible white list rejection by target instance";
                    break;
                case -1:
                    tooltipText = "-1: check error log. possible connection refused.";
                    break;
                default:
                    tooltipText = null;
                }
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

## RuleId[id=UnusedAssignment]
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
Value `odd` is always 'true'
in `src/main/java/org/apache/sling/discovery/oak/TopologyWebConsolePlugin.java`
#### Snippet
```java
        ClusterView myCluster = topology.getLocalInstance().getClusterView();
        boolean odd = true;
        renderCluster(pw, myCluster, myCluster, odd, topology.isCurrent());

        for (Iterator<ClusterView> it = clusters.iterator(); it.hasNext();) {
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
            viewStateManager.bind(changePropagationListener);
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
Value `announcementRegistry` is always 'null'
in `src/main/java/org/apache/sling/discovery/oak/SynchronizedClocksHealthCheck.java`
#### Snippet
```java

        if (announcementRegistry == null) {
            logger.warn("execute: no announcementRegistry ({}) set", announcementRegistry);
            resultLog.warn("Cannot determine topology clocks since no announcementRegistry ({}) set", announcementRegistry);
        } else {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/sling/discovery/oak/DiscoveryServiceCentralConfig.java`
#### Snippet
```java

    /**
     * URLs where to join a topology, eg http://localhost:4502/libs/sling/topology/connector
     */
    @AttributeDefinition (cardinality = 1024)
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

