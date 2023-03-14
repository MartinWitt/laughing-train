# curator 
 
# Bad smells
I found 1261 bad smells with 250 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 236 | false |
| UnnecessaryModifier | 196 | true |
| BoundedWildcard | 175 | false |
| RedundantFieldInitialization | 92 | false |
| SystemOutErr | 66 | false |
| ReturnNull | 63 | false |
| AssignmentToMethodParameter | 59 | false |
| Convert2Lambda | 48 | false |
| SynchronizeOnThis | 32 | false |
| SizeReplaceableByIsEmpty | 28 | true |
| RedundantImplements | 24 | false |
| UtilityClassWithoutPrivateConstructor | 21 | true |
| ThrowablePrintStackTrace | 20 | false |
| UNUSED_IMPORT | 19 | false |
| UnnecessarySuperQualifier | 12 | false |
| DeprecatedIsStillUsed | 12 | false |
| DataFlowIssue | 10 | false |
| RedundantSuppression | 10 | false |
| EnumSwitchStatementWhichMissesCases | 9 | false |
| Convert2MethodRef | 9 | false |
| PublicFieldAccessedInSynchronizedContext | 9 | false |
| StaticPseudoFunctionalStyleMethod | 7 | false |
| RedundantStringFormatCall | 7 | false |
| ZeroLengthArrayInitialization | 7 | false |
| MissingDeprecatedAnnotation | 7 | false |
| Anonymous2MethodRef | 6 | false |
| MissortedModifiers | 5 | false |
| InstanceofCatchParameter | 5 | false |
| ConstantValue | 5 | false |
| UnnecessaryQualifierForThis | 4 | false |
| EmptyMethod | 4 | false |
| UnusedAssignment | 4 | false |
| CStyleArrayDeclaration | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| CharsetObjectCanBeUsed | 3 | false |
| SamePackageImport | 3 | false |
| DuplicateExpressions | 2 | false |
| NestedAssignment | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| JavaReflectionMemberAccess | 2 | false |
| ObviousNullCheck | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| BusyWait | 2 | false |
| UnstableApiUsage | 2 | false |
| WhileCanBeForeach | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| RedundantMethodOverride | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| CodeBlock2Expr | 1 | true |
| MismatchedCollectionQueryUpdate | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| DoubleBraceInitialization | 1 | false |
| IOResource | 1 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| FieldMayBeStatic | 1 | false |
| UnnecessarySemicolon | 1 | false |
| MismatchedJavadocCode | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| CopyConstructorMissesField | 1 | false |
| TestCaseWithNoTestMethods | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch ( code ) { case AUTHFAILED: case NOAUTH: { return...` statement on enum type 'org.apache.zookeeper.KeeperException.Code' misses cases: 'SYSTEMERROR', 'RUNTIMEINCONSISTENCY', ...
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
    Watcher.Event.KeeperState codeToState(KeeperException.Code code)
    {
        switch ( code )
        {
        case AUTHFAILED:
        case NOAUTH:
        {
            return Watcher.Event.KeeperState.AuthFailed;
        }

        case CONNECTIONLOSS:
        case OPERATIONTIMEOUT:
        {
            return Watcher.Event.KeeperState.Disconnected;
        }

        case SESSIONEXPIRED:
        {
            return Watcher.Event.KeeperState.Expired;
        }

        case OK:
        case SESSIONMOVED:
        {
            return Watcher.Event.KeeperState.SyncConnected;
        }
        }
        return Watcher.Event.KeeperState.fromInt(-1);
    }
```

### EnumSwitchStatementWhichMissesCases
`switch ( event.getType() ) { case CHILD_ADDED: case CHILD_UPDATED: {...` statement on enum type 'org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent.Type' misses cases: 'CONNECTION_SUSPENDED', ...
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceCacheImpl.java`
#### Snippet
```java
    {
        boolean notifyListeners = false;
        switch ( event.getType() )
        {
        case CHILD_ADDED:
        case CHILD_UPDATED:
        {
            addInstance(event.getData());
            notifyListeners = true;
            break;
        }

        case CHILD_REMOVED:
        {
            instances.remove(instanceIdFromData(event.getData()));
            notifyListeners = true;
            break;
        }
        }

        if ( notifyListeners && (initializedLatch.getCount() == 0) )
```

### EnumSwitchStatementWhichMissesCases
`switch ( event.getType() ) { case CHILD_ADDED: ...` statement on enum type 'org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent.Type' misses cases: 'CONNECTION_SUSPENDED', ...
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
            public void childEvent(CuratorFramework client, PathChildrenCacheEvent event) throws Exception
            {
                switch ( event.getType() )
                {
                    case CHILD_ADDED:
                    {
                        System.out.println("Node added: " + ZKPaths.getNodeFromPath(event.getData().getPath()));
                        break;
                    }

                    case CHILD_UPDATED:
                    {
                        System.out.println("Node changed: " + ZKPaths.getNodeFromPath(event.getData().getPath()));
                        break;
                    }

                    case CHILD_REMOVED:
                    {
                        System.out.println("Node removed: " + ZKPaths.getNodeFromPath(event.getData().getPath()));
                        break;
                    }
                }
            }
        };
```

### EnumSwitchStatementWhichMissesCases
`switch ( event.getType() ) { case NODE_ADDED: { list...` statement on enum type 'org.apache.curator.framework.recipes.cache.TreeCacheEvent.Type' misses cases: 'CONNECTION_SUSPENDED', ...
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CompatibleCuratorCacheBridge.java`
#### Snippet
```java
    public void childEvent(CuratorFramework client, TreeCacheEvent event) throws Exception
    {
        switch ( event.getType() )
        {
            case NODE_ADDED:
            {
                listenerManager.forEach(listener -> listener.event(NODE_CREATED, null, event.getData()));
                break;
            }

            case NODE_REMOVED:
            {
                listenerManager.forEach(listener -> listener.event(NODE_DELETED, event.getData(), null));
                break;
            }

            case NODE_UPDATED:
            {
                listenerManager.forEach(listener -> listener.event(NODE_CHANGED, event.getOldData(), event.getData()));
                break;
            }

            case INITIALIZED:
            {
                listenerManager.forEach(CuratorCacheListener::initialized);
                break;
            }
        }
    }
}
```

### EnumSwitchStatementWhichMissesCases
`switch ( event.getType() ) { case GET_DATA: { if ( e...` statement on enum type 'org.apache.curator.framework.api.CuratorEventType' misses cases: 'CREATE', 'DELETE', 'SET_DATA', 'CHILDREN', ...
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/NodeCache.java`
#### Snippet
```java
    private void processBackgroundResult(CuratorEvent event) throws Exception
    {
        switch ( event.getType() )
        {
            case GET_DATA:
            {
                if ( event.getResultCode() == KeeperException.Code.OK.intValue() )
                {
                    ChildData childData = new ChildData(path, event.getStat(), event.getData());
                    setNewData(childData);
                }
                break;
            }

            case EXISTS:
            {
                if ( event.getResultCode() == KeeperException.Code.NONODE.intValue() )
                {
                    setNewData(null);
                }
                else if ( event.getResultCode() == KeeperException.Code.OK.intValue() )
                {
                    if ( dataIsCompressed )
                    {
                        client.getData().decompressed().usingWatcher(watcher).inBackground(backgroundCallback).forPath(path);
                    }
                    else
                    {
                        client.getData().usingWatcher(watcher).inBackground(backgroundCallback).forPath(path);
                    }
                }
                break;
            }
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch ( event.getType() ) { case NodeDataChanged: case NodeCreated: ...` statement on enum type 'org.apache.zookeeper.Watcher.Event.EventType' misses cases: 'None', 'NodeChildrenChanged', ...
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheImpl.java`
#### Snippet
```java
        // NOTE: Persistent/Recursive watchers never trigger NodeChildrenChanged

        switch ( event.getType() )
        {
        case NodeDataChanged:
        case NodeCreated:
        {
            nodeChanged(event.getPath());
            break;
        }

        case NodeDeleted:
        {
            removeStorage(event.getPath());
            break;
        }
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch ( event.getType() ) { case NodeCreated: P...` statement on enum type 'org.apache.zookeeper.Watcher.Event.EventType' misses cases: 'None', 'DataWatchRemoved', ...
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
            try
            {
                switch ( event.getType() )
                {
                case NodeCreated:
                    Preconditions.checkState(parent == null, "unexpected NodeCreated on non-root node");
                    wasCreated();
                    break;
                case NodeChildrenChanged:
                    refreshChildren();
                    break;
                case NodeDataChanged:
                    refreshData();
                    break;
                case NodeDeleted:
                    wasDeleted();
                    break;
                }
            }
            catch ( Exception e )
```

### EnumSwitchStatementWhichMissesCases
`switch ( newState ) { case SUSPENDED: publishEvent(TreeCacheEvent.Type.C...` statement on enum type 'org.apache.curator.framework.state.ConnectionState' misses case 'READ_ONLY'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
    private void handleStateChange(ConnectionState newState)
    {
        switch ( newState )
        {
        case SUSPENDED:
            publishEvent(TreeCacheEvent.Type.CONNECTION_SUSPENDED);
            break;

        case LOST:
            isInitialized.set(false);
            publishEvent(TreeCacheEvent.Type.CONNECTION_LOST);
            break;

        case CONNECTED:
            try
            {
                root.wasCreated();
            }
            catch ( Exception e )
            {
                ThreadUtils.checkInterrupted(e);
                handleException(e);
            }
            break;

        case RECONNECTED:
            try
            {
                root.wasReconnected();
                publishEvent(TreeCacheEvent.Type.CONNECTION_RECONNECTED);
            }
            catch ( Exception e )
            {
                ThreadUtils.checkInterrupted(e);
                handleException(e);
            }
            break;
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch ( newState ) { case SUSPENDED: { offerOperation(new Event...` statement on enum type 'org.apache.curator.framework.state.ConnectionState' misses case 'READ_ONLY'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
    private void handleStateChange(ConnectionState newState)
    {
        switch ( newState )
        {
        case SUSPENDED:
        {
            offerOperation(new EventOperation(this, new PathChildrenCacheEvent(PathChildrenCacheEvent.Type.CONNECTION_SUSPENDED, null)));
            break;
        }

        case LOST:
        {
            offerOperation(new EventOperation(this, new PathChildrenCacheEvent(PathChildrenCacheEvent.Type.CONNECTION_LOST, null)));
            break;
        }

        case CONNECTED:
        case RECONNECTED:
        {
            try
            {
                offerOperation(new RefreshOperation(this, RefreshMode.FORCE_GET_DATA_AND_STAT));
                offerOperation(new EventOperation(this, new PathChildrenCacheEvent(PathChildrenCacheEvent.Type.CONNECTION_RECONNECTED, null)));
            }
            catch ( Exception e )
            {
                ThreadUtils.checkInterrupted(e);
                handleException(e);
            }
            break;
        }
        }
    }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/RetrySleeper.java`
#### Snippet
```java
     * @throws InterruptedException if the sleep is interrupted
     */
    public void     sleepFor(long time, TimeUnit unit) throws InterruptedException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/utils/ZookeeperFactory.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public default ZooKeeper newZooKeeper(String connectString, int sessionTimeout, Watcher watcher, boolean canBeReadOnly, ZKClientConfig zkClientConfig) throws Exception {
		if (zkClientConfig == null) {
			return newZooKeeper(connectString, sessionTimeout, watcher, canBeReadOnly);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/utils/ZookeeperFactory.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public ZooKeeper        newZooKeeper(String connectString, int sessionTimeout, Watcher watcher, boolean canBeReadOnly) throws Exception;
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/utils/InternalACLProvider.java`
#### Snippet
```java
     * @return default ACL list
     */
    public List<ACL> getDefaultAcl();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/utils/InternalACLProvider.java`
#### Snippet
```java
     * @return ACL list
     */
    public List<ACL>        getAclForPath(String path);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/drivers/TracerDriver.java`
#### Snippet
```java
     * @param increment amount to increment
     */
    public void     addCount(String name, int increment);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/drivers/TracerDriver.java`
#### Snippet
```java
     * @param unit time unit
     */
    public void     addTrace(String name, long time, TimeUnit unit);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java
     * @return true/false
     */
    public boolean updateServerListEnabled();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java
     * @return connection string (per {@link ZooKeeper#ZooKeeper(String, int, Watcher)} etc.)
     */
    public String       getConnectionString();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java
     * @throws IOException errors
     */
    public void         close() throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void         start() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java
     * @param connectionString the new connection string
     */
    public void setConnectionString(String connectionString);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorTempFramework.java`
#### Snippet
```java
     * Stop the client
     */
    public void     close();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorTempFramework.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public TempGetDataBuilder getData() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorTempFramework.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public CuratorTransaction inTransaction() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CompressionProvider.java`
#### Snippet
```java
    public byte[]       compress(String path, byte[] data) throws Exception;

    public byte[]       decompress(String path, byte[] compressedData) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CompressionProvider.java`
#### Snippet
```java
public interface CompressionProvider
{
    public byte[]       compress(String path, byte[] data) throws Exception;

    public byte[]       decompress(String path, byte[] compressedData) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesLocal.java`
#### Snippet
```java
     * @return
     */
    public BackgroundPathableQuietlyable<Void> locally();
    
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/BackgroundCallback.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void processResult(CuratorFramework client, CuratorEvent event) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateProtectACLCreateModePathAndBytesable.java`
#### Snippet
```java
     * @return this
     */
    public ProtectACLCreateModePathAndBytesable<String> creatingParentContainersIfNeeded();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateProtectACLCreateModePathAndBytesable.java`
#### Snippet
```java
     * @return this
     */
    public ProtectACLCreateModePathAndBytesable<String> creatingParentsIfNeeded();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateProtectACLCreateModePathAndBytesable.java`
#### Snippet
```java
     * @return this
     */
    public ACLCreateModeBackgroundPathAndBytesable<String>    withProtection();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     */
    @Deprecated
    public CuratorFramework nonNamespaceView();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return listenable
     */
    public Listenable<ConnectionStateListener> getConnectionStateListenable();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     */
    @Deprecated
    public EnsurePath newNamespaceAwareEnsurePath(String path);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return listenable
     */
    public Listenable<UnhandledErrorListener> getUnhandledErrorListenable();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean isStarted();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public CreateBuilder create();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return listenable
     */
    public Listenable<CuratorListener> getCuratorListenable();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public GetDataBuilder getData();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return facade
     */
    public CuratorFramework usingNamespace(String newNamespace);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public ReconfigBuilder reconfig();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void createContainers(String path) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @deprecated use {@link #transaction()} instead
     */
    public CuratorTransaction inTransaction();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return operation builder
     */
    public TransactionOp transactionOp();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public SetACLBuilder setACL();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return error policy
     */
    public ConnectionStateErrorPolicy getConnectionStateErrorPolicy();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @throws InterruptedException If interrupted while waiting
     */
    public boolean blockUntilConnected(int maxWaitTime, TimeUnit units) throws InterruptedException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public GetChildrenBuilder getChildren();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public GetConfigBuilder getConfig();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public SetDataBuilder setData();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * Start the client. Most mutator methods will not work until the client is started
     */
    public void start();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public SyncBuilder sync();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return client
     */
    public CuratorZookeeperClient getZookeeperClient();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     */
    @Deprecated
    public void sync(String path, Object backgroundContextObject);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public GetACLBuilder getACL();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return the current config
     */
    public QuorumVerifier getCurrentConfig();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return state
     */
    public CuratorFrameworkState getState();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return facade
     */
    public WatcherRemoveCuratorFramework newWatcherRemoveCuratorFramework();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public ExistsBuilder checkExists();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @deprecated use {@link #watchers()} in ZooKeeper 3.6+
     */
    public RemoveWatchesBuilder watches();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * Stop the client
     */
    public void close();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public DeleteBuilder delete();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     */
    @Deprecated
    public void clearWatcherReferences(Watcher watcher);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return namespace
     */
    public String getNamespace();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @throws InterruptedException If interrupted while waiting
     */
    public void blockUntilConnected() throws InterruptedException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @return builder object
     */
    public CuratorMultiTransaction transaction();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @throws IllegalStateException ZooKeeper JAR is 3.5 or below
     */
    public WatchesBuilder watchers();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Backgroundable.java`
#### Snippet
```java
     * @return this
     */
    public T inBackground(BackgroundCallback callback, Object context);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Backgroundable.java`
#### Snippet
```java
     * @return this
     */
    public T inBackground(BackgroundCallback callback, Object context, Executor executor);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Backgroundable.java`
#### Snippet
```java
     * @return this
     */
    public T inBackground();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Backgroundable.java`
#### Snippet
```java
     * @return this
     */
    public T inBackground(BackgroundCallback callback);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Backgroundable.java`
#### Snippet
```java
     * @return this
     */
    public T inBackground(BackgroundCallback callback, Executor executor);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Backgroundable.java`
#### Snippet
```java
     * @return this
     */
    public T inBackground(Object context);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Pathable.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public T       forPath(String path) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Compressible.java`
#### Snippet
```java
     * @return this
     */
    public T compressed();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Guaranteeable.java`
#### Snippet
```java
     * @return this
     */
    public T guaranteed();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/ChildrenDeletable.java`
#### Snippet
```java
     * @return
     */
    public BackgroundVersionable deletingChildrenIfNeeded();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/UnhandledErrorListener.java`
#### Snippet
```java
     * @param e exception
     */
    public void     unhandledError(String message, Throwable e);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/ACLProvider.java`
#### Snippet
```java
     * @return ACL list
     */
    public List<ACL>        getAclForPath(String path);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/ACLProvider.java`
#### Snippet
```java
     * @return default ACL list
     */
    public List<ACL>        getDefaultAcl();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java
     * @return this
     */
    public ProtectACLCreateModeStatPathAndBytesable<String> creatingParentsIfNeeded();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeACLable.java`
#### Snippet
```java
     * @return this
     */
    public ACLPathAndBytesable<String>              withProtectedEphemeralSequential();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java
     * @return this
     */
    public ProtectACLCreateModeStatPathAndBytesable<String> creatingParentContainersIfNeeded();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeACLable.java`
#### Snippet
```java
     * @return this
     */
    public ACLCreateModePathAndBytesable<String> creatingParentContainersIfNeeded();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java
     */
    @Deprecated
    public ACLPathAndBytesable<String>              withProtectedEphemeralSequential();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeACLable.java`
#### Snippet
```java
     * @return this
     */
    public ACLCreateModePathAndBytesable<String>    creatingParentsIfNeeded();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java
     * @return this
     */
    public ACLCreateModeStatBackgroundPathAndBytesable<String>    withProtection();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Decompressible.java`
#### Snippet
```java
     * @return this
     */
    public T        decompressed();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesBuilder.java`
#### Snippet
```java
     * @return
     */
    public RemoveWatchesType remove(CuratorWatcher watcher);
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesBuilder.java`
#### Snippet
```java
     * @return
     */
    public RemoveWatchesType removeAll();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesBuilder.java`
#### Snippet
```java
     * @return
     */
    public RemoveWatchesType remove(Watcher watcher);
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/PathAndBytesable.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public T        forPath(String path) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/PathAndBytesable.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public T        forPath(String path, byte[] data) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateModable.java`
#### Snippet
```java
     * @return this
     */
    public T withMode(CreateMode mode);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Idempotentable.java`
#### Snippet
```java
     * @return this:
     */
    public T idempotent();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Versionable.java`
#### Snippet
```java
     * @return this
     */
    public T     withVersion(int version);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorWatcher.java`
#### Snippet
```java
     * @throws Exception any exceptions to log
     */
    public void process(WatchedEvent event) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorListener.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public void         eventReceived(CuratorFramework client, CuratorEvent event) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesType.java`
#### Snippet
```java
     * @return
     */
    public RemoveWatchesLocal ofType(WatcherType watcherType);
    
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return any children
     */
    public List<String> getChildren();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return any stat
     */
    public Stat getStat();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return any data
     */
    public byte[] getData();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return event type
     */
    public CuratorEventType getType();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return "rc" from async callbacks
     */
    public int getResultCode();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return any operation results or null
     */
    public List<CuratorTransactionResult> getOpResults();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return the context object passed to {@link Backgroundable#inBackground(Object)}
     */
    public Object getContext();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return any ACL list or null
     */
    public List<ACL> getACLList();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return any name
     */
    public String getName();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return the path
     */
    public String getPath();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java
     * @return any WatchedEvent
     */
    public WatchedEvent getWatchedEvent();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Quietly.java`
#### Snippet
```java
public interface Quietly<T>
{
    public T quietly();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/ProtectACLCreateModePathAndBytesable.java`
#### Snippet
```java
     * @return this
     */
    public ACLCreateModeBackgroundPathAndBytesable<String>    withProtection();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeStatACLable.java`
#### Snippet
```java
     * @return this
     */
    public ACLCreateModePathAndBytesable<String>    creatingParentsIfNeeded();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeStatACLable.java`
#### Snippet
```java
     * @return this
     */
    public ACLCreateModePathAndBytesable<String> creatingParentContainersIfNeeded();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeStatACLable.java`
#### Snippet
```java
     * @return this
     */
    public ACLPathAndBytesable<String>              withProtectedEphemeralSequential();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/Statable.java`
#### Snippet
```java
     * @return this
     */
    public T storingStatIn(Stat stat);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransactionBridge.java`
#### Snippet
```java
     * @return transaction continuation
     */
    public CuratorTransactionFinal and();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransactionFinal.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public Collection<CuratorTransactionResult> commit() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransaction.java`
#### Snippet
```java
     * @return builder object
     */
    public TransactionCreateBuilder<CuratorTransactionBridge> create();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransaction.java`
#### Snippet
```java
     * @return builder object
     */
    public TransactionCheckBuilder<CuratorTransactionBridge> check();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransaction.java`
#### Snippet
```java
     * @return builder object
     */
    public TransactionSetDataBuilder<CuratorTransactionBridge> setData();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransaction.java`
#### Snippet
```java
     * @return builder object
     */
    public TransactionDeleteBuilder<CuratorTransactionBridge> delete();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/imps/FailedOperationManager.java`
#### Snippet
```java
    interface FailedOperationManagerListener<T>
    {
       public void pathAddedForGuaranteedOperation(T detail);
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/imps/BackgroundOperation.java`
#### Snippet
```java
interface BackgroundOperation<T>
{
    public void performBackgroundOperation(OperationAndData<T> data) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/listen/Listenable.java`
#### Snippet
```java
     * @param listener listener to remove
     */
    public void     removeListener(T listener);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/listen/Listenable.java`
#### Snippet
```java
     * @param listener listener to add
     */
    public void     addListener(T listener);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-framework/src/main/java/org/apache/curator/framework/listen/Listenable.java`
#### Snippet
```java
     * @param executor executor to run listener in
     */
    public void     addListener(T listener, Executor executor);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-client/src/main/java/org/apache/curator/utils/EnsurePath.java`
#### Snippet
```java
    interface Helper
    {
        public void ensure(CuratorZookeeperClient client, String path, final boolean makeLastNode) throws Exception;
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ProviderStrategy.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public ServiceInstance<T>       getInstance(InstanceProvider<T> instanceProvider) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/LocalIpFilter.java`
#### Snippet
```java
public interface LocalIpFilter
{
    public boolean      use(NetworkInterface networkInterface, InetAddress address) throws SocketException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceCache.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void start() throws Exception;

    CountDownLatch startImmediate() throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceCache.java`
#### Snippet
```java
     * @return the list
     */
    public List<ServiceInstance<T>> getInstances();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceProvider.java`
#### Snippet
```java
     * @param instance instance that had an error
     */
    public void noteError(ServiceInstance<T> instance);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceProvider.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public ServiceInstance<T> getInstance() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceProvider.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public void start() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceProvider.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public Collection<ServiceInstance<T>> getAllInstances() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscovery.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void start() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscovery.java`
#### Snippet
```java
     * @return the builder
     */
    public ServiceProviderBuilder<T> serviceProviderBuilder();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscovery.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public ServiceInstance<T> queryForInstance(String name, String id) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscovery.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void     updateService(ServiceInstance<T> service) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscovery.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void     unregisterService(ServiceInstance<T> service) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscovery.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public Collection<String> queryForNames() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscovery.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public Collection<ServiceInstance<T>>  queryForInstances(String name) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscovery.java`
#### Snippet
```java
     * @return new cache builder
     */
    public ServiceCacheBuilder<T> serviceCacheBuilder();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscovery.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void     registerService(ServiceInstance<T> service) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceCacheBuilder.java`
#### Snippet
```java
     * @return service cache
     */
    public ServiceCache<T> build();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceCacheBuilder.java`
#### Snippet
```java
     */
    @Deprecated
    public ServiceCacheBuilder<T> threadFactory(ThreadFactory threadFactory);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceCacheBuilder.java`
#### Snippet
```java
     * @return this
     */
    public ServiceCacheBuilder<T> name(String name);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceCacheBuilder.java`
#### Snippet
```java
     * @return this
     */
    public ServiceCacheBuilder<T> executorService(ExecutorService executorService);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/InstanceProvider.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public List<ServiceInstance<T>>      getInstances() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceCacheListener.java`
#### Snippet
```java
     * Called when the cache has changed (instances added/deleted, etc.)
     */
    public void cacheChanged();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/InstanceSerializer.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public ServiceInstance<T> deserialize(byte[] bytes) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/InstanceSerializer.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public byte[]             serialize(ServiceInstance<T> instance) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/DiscoveryContext.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public void                     marshallJson(ObjectNode node, String fieldName, T payload) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/DiscoveryContext.java`
#### Snippet
```java
     * @return number of milliseconds
     */
    public int                      getInstanceRefreshMs();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/DiscoveryContext.java`
#### Snippet
```java
     * @return strategy
     */
    public ProviderStrategy<T>      getProviderStrategy();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/DiscoveryContext.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public T                        unMarshallJson(JsonNode node) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/DiscoveryContext.java`
#### Snippet
```java
     * @return service
     */
    public ServiceDiscovery<T>      getServiceDiscovery();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/NodeCacheListener.java`
#### Snippet
```java
     * Called when a change has occurred
     */
    public void     nodeChanged() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/Operation.java`
#### Snippet
```java
interface Operation
{
    public void     invoke() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheListener.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void childEvent(CuratorFramework client, TreeCacheEvent event) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCacheListener.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void     childEvent(CuratorFramework client, PathChildrenCacheEvent event) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/RevocationListener.java`
#### Snippet
```java
     * @param forLock the lock that should release
     */
    public void         revocationRequested(T forLock);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternalsDriver.java`
#### Snippet
```java
public interface LockInternalsDriver extends LockInternalsSorter
{
    public PredicateResults getsTheLock(CuratorFramework client, List<String> children, String sequenceNodeName, int maxLeases) throws Exception;

    public String createsTheLock(CuratorFramework client,  String path, byte[] lockNodeBytes) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternalsDriver.java`
#### Snippet
```java
    public PredicateResults getsTheLock(CuratorFramework client, List<String> children, String sequenceNodeName, int maxLeases) throws Exception;

    public String createsTheLock(CuratorFramework client,  String path, byte[] lockNodeBytes) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/Lease.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public String getNodeName();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/Lease.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public byte[]   getData() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/Lease.java`
#### Snippet
```java
     */
    @Override
    public void close() throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternalsSorter.java`
#### Snippet
```java
public interface LockInternalsSorter
{
    public String           fixForSorting(String str, String lockName);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/Revocable.java`
#### Snippet
```java
     * @param listener the listener
     */
    public void     makeRevocable(RevocationListener<T> listener);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/Revocable.java`
#### Snippet
```java
     * @param executor executor for the listener
     */
    public void     makeRevocable(RevocationListener<T> listener, Executor executor);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessLock.java`
#### Snippet
```java
     * @throws Exception ZK errors, interruptions
     */
    public void release() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessLock.java`
#### Snippet
```java
     * @throws Exception ZK errors, connection interruptions
     */
    public boolean acquire(long time, TimeUnit unit) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessLock.java`
#### Snippet
```java
     * @throws Exception ZK errors, connection interruptions
     */
    public void acquire() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/MultiItem.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public T    nextItem() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueAllocator.java`
#### Snippet
```java
public interface QueueAllocator<U, T extends QueueBase<U>>
{
    public T    allocateQueue(CuratorFramework client, String queuePath);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSerializer.java`
#### Snippet
```java
     * @return item
     */
    public T            deserialize(byte[] bytes);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSerializer.java`
#### Snippet
```java
     * @return byte representation
     */
    public byte[]       serialize(T item);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueConsumer.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public void         consumeMessage(T message) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueuePutListener.java`
#### Snippet
```java
     * @param item the item
     */
    public void         putCompleted(T item);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueuePutListener.java`
#### Snippet
```java
     * @param items the items
     */
    public void         putMultiCompleted(MultiItem<T> items);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/MakeValue.java`
#### Snippet
```java
interface MakeValue
{
    public byte[]       makeFrom(byte[] previous);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicNumber.java`
#### Snippet
```java
     * @throws Exception ZooKeeper errors
     */
    public AtomicValue<T> trySet(T newValue) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicNumber.java`
#### Snippet
```java
     * @throws Exception ZooKeeper errors
     */
    public AtomicValue<T> compareAndSet(T expectedValue, T newValue) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicNumber.java`
#### Snippet
```java
     * @throws Exception ZooKeeper errors
     */
    public void forceSet(T newValue) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicNumber.java`
#### Snippet
```java
     * @throws Exception ZooKeeper errors
     */
    public boolean initialize(T value) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicNumber.java`
#### Snippet
```java
     * @throws Exception ZooKeeper errors
     */
    public AtomicValue<T> increment() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicNumber.java`
#### Snippet
```java
     * @throws Exception ZooKeeper errors
     */
    public AtomicValue<T> subtract(T delta) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicNumber.java`
#### Snippet
```java
     * @throws Exception ZooKeeper errors
     */
    public AtomicValue<T> get() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicNumber.java`
#### Snippet
```java
     * @throws Exception ZooKeeper errors
     */
    public AtomicValue<T> add(T delta) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicNumber.java`
#### Snippet
```java
     * @throws Exception ZooKeeper errors
     */
    public AtomicValue<T> decrement() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/AtomicValue.java`
#### Snippet
```java
     * @return true/false
     */
    public boolean      succeeded();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/AtomicValue.java`
#### Snippet
```java
     * @return stats
     */
    public AtomicStats  getStats();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/AtomicValue.java`
#### Snippet
```java
     * @return post-operation value
     */
    public T            postValue();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/AtomicValue.java`
#### Snippet
```java
     * @return pre-operation value
     */
    public T            preValue();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelectorListener.java`
#### Snippet
```java
     * @throws Exception any errors
     */
    public void         takeLeadership(CuratorFramework client) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatchListener.java`
#### Snippet
```java
   * this occurs, you can expect {@link #isLeader()} to also be called.
   */
  public void notLeader();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatchListener.java`
#### Snippet
```java
   * this occurs, you can expect {@link #notLeader()} to also be called.
   */
  public void isLeader();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedValueListener.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void valueHasChanged(SharedValueReader sharedValue, byte[] newValue) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedCountReader.java`
#### Snippet
```java
     * @return count
     */
    public int      getCount();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedCountReader.java`
#### Snippet
```java
     * @return count and version
     */
    public VersionedValue<Integer> getVersionedValue();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedValueReader.java`
#### Snippet
```java
     * @return listenable
     */
    public Listenable<SharedValueListener> getListenable();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedValueReader.java`
#### Snippet
```java
     * @return count
     */
    public byte[]   getValue();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedValueReader.java`
#### Snippet
```java
     * @return version/value
     */
    public VersionedValue<byte[]> getVersionedValue();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedCountListener.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void         countHasChanged(SharedCountReader sharedCount, int newCount) throws Exception;
}

```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
        {
            Iterator<String> iter = participantNodes.iterator();
            while ( iter.hasNext() )
            {
                result = participantForPath(client, iter.next(), true);
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `chars`
in `curator-client/src/main/java/org/apache/curator/utils/PathUtils.java`
#### Snippet
```java
        String reason = null;
        char lastc = '/';
        char chars[] = path.toCharArray();
        char c;
        for (int i = 1; i < chars.length; lastc = chars[i], i++) {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `args`
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
                }
                String      operation = parts[0];
                String      args[] = Arrays.copyOfRange(parts, 1, parts.length);

                if ( operation.equalsIgnoreCase("help") || operation.equalsIgnoreCase("?") )
```

### CStyleArrayDeclaration
C-style array declaration of local variable `args`
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
                }
                String      operation = parts[0];
                String      args[] = Arrays.copyOfRange(parts, 1, parts.length);

                if ( operation.equalsIgnoreCase("help") || operation.equalsIgnoreCase("?") )
```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/FilteredInstanceProvider.java`
#### Snippet
```java
    public List<ServiceInstance<T>> getInstances() throws Exception
    {
        Iterable<ServiceInstance<T>> filtered = Iterables.filter(instanceProvider.getInstances(), predicates);
        return ImmutableList.copyOf(filtered);
    }
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java

        final String    serviceName = args[0];
        ExampleServer   server = Iterables.find
        (
            servers,
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessReadWriteLock.java`
#### Snippet
```java
        final public Collection<String> getParticipantNodes() throws Exception
        {
            return ImmutableList.copyOf(Iterables.filter(super.getParticipantNodes(), new Predicate<String>() {
                @Override
                public boolean apply(String node) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
    {
        List<String>        names = getSortedChildren(client, basePath, lockName, sorter);
        Iterable<String>    transformed = Iterables.transform
            (
                names,
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
    private List<String> filterAndSortChildren(List<String> children)
    {
        Iterable<String> filtered = Iterables.filter
        (
            children,
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
    {
        final String protectedPrefix = ProtectedUtils.getProtectedPrefix(protectedId);
        String foundNode = Iterables.find
            (
                children,
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `curator-test/src/main/java/org/apache/curator/test/TestingCluster.java`
#### Snippet
```java
    public Collection<InstanceSpec> getInstances()
    {
        Iterable<InstanceSpec> transformed = Iterables.transform
            (
                servers,
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `CuratorFrameworkImpl` on 'this' is unnecessary in this context
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
            listeners.forEach(listener ->
            {
                CuratorEvent event = new CuratorEventImpl(CuratorFrameworkImpl.this, CuratorEventType.CLOSING, 0, null, null, null, null, null, null, null, null, null);
                try
                {
```

### UnnecessaryQualifierForThis
Qualifier `CuratorFrameworkImpl` on 'this' is unnecessary in this context
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
                try
                {
                    listener.eventReceived(CuratorFrameworkImpl.this, event);
                }
                catch ( Exception e )
```

### UnnecessaryQualifierForThis
Qualifier `CuratorFrameworkImpl` on 'this' is unnecessary in this context
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
            {
                OperationTrace trace = client.startAdvancedTracer("EventListener");
                listener.eventReceived(CuratorFrameworkImpl.this, curatorEvent);
                trace.commit();
            }
```

### UnnecessaryQualifierForThis
Qualifier `SharedValue` on 'this' is unnecessary in this context
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedValue.java`
#### Snippet
```java
            try
            {
                listener.valueHasChanged(SharedValue.this, localValue);
            }
            catch ( Exception e )
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `curator-client/src/main/java/org/apache/curator/utils/PathUtils.java`
#### Snippet
```java
            throw new IllegalArgumentException("Path cannot be null");
        }
        if (path.length() == 0) {
            throw new IllegalArgumentException("Path length must be > 0");
        }
```

### SizeReplaceableByIsEmpty
`parent.length() > 0` can be replaced with '!parent.isEmpty()'
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
    {
        // Add parent piece, with no trailing slash.
        if ( (parent != null) && (parent.length() > 0) )
        {
            if ( parent.charAt(0) != PATH_SEPARATOR_CHAR )
```

### SizeReplaceableByIsEmpty
`child.length() == 0` can be replaced with 'child.isEmpty()'
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
        }

        if ( (child == null) || (child.length() == 0) ||
                (child.length() == 1 && child.charAt(0) == PATH_SEPARATOR_CHAR) )
        {
```

### SizeReplaceableByIsEmpty
`connectionString.trim().length() > 0` can be replaced with '!connectionString.trim().isEmpty()'
in `curator-framework/src/main/java/org/apache/curator/framework/imps/EnsembleTracker.java`
#### Snippet
```java
            QuorumMaj newConfig = new QuorumMaj(properties);
            String connectionString = configToConnectionString(newConfig);
            if (connectionString.trim().length() > 0)
            {
                currentConfig.set(newConfig);
```

### SizeReplaceableByIsEmpty
`localEntries.size() > 0` can be replaced with '!localEntries.isEmpty()'
in `curator-framework/src/main/java/org/apache/curator/framework/imps/WatcherRemovalManager.java`
#### Snippet
```java
    {
        List<NamespaceWatcher> localEntries = Lists.newArrayList(entries);
        while ( localEntries.size() > 0 )
        {
            NamespaceWatcher watcher = localEntries.remove(0);
```

### SizeReplaceableByIsEmpty
`reason.length() == 0` can be replaced with 'reason.isEmpty()'
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
    void logError(String reason, final Throwable e)
    {
        if ( (reason == null) || (reason.length() == 0) )
        {
            reason = "n/a";
```

### SizeReplaceableByIsEmpty
`opResults.size() > 0` can be replaced with '!opResults.isEmpty()'
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTransactionImpl.java`
#### Snippet
```java
    {
        List<OpResult> opResults = client.getZooKeeper().multi(transaction);
        if ( opResults.size() > 0 )
        {
            OpResult firstResult = opResults.get(0);
```

### SizeReplaceableByIsEmpty
`schemas.size() > 0` can be replaced with '!schemas.isEmpty()'
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java
    public Schema getSchema(String path)
    {
        if ( schemas.size() > 0 )
        {
            Schema schema = pathToSchemas.get(path);
```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
    {
        Map<String, byte[]> nodes = Maps.newHashMap();
        if ( children.size() == 0 )
        {
            future.complete(nodes);
```

### SizeReplaceableByIsEmpty
`aclList.size() > 0` can be replaced with '!aclList.isEmpty()'
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelSpecImpl.java`
#### Snippet
```java
        if ( acl != null )
        {
            List<ACL> localAclList = (aclList.size() > 0) ? aclList : ZooDefs.Ids.OPEN_ACL_UNSAFE;
            if ( !acl.equals(localAclList) )
            {
```

### SizeReplaceableByIsEmpty
`ips.size() > 0` can be replaced with '!ips.isEmpty()'
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceInstance.java`
#### Snippet
```java
        String                  address = null;
        Collection<InetAddress> ips = ServiceInstanceBuilder.getAllLocalIPs();
        if ( ips.size() > 0 )
        {
            address = ips.iterator().next().getHostAddress();   // default to the first address
```

### SizeReplaceableByIsEmpty
`toBeApplied.size() == 0` can be replaced with 'toBeApplied.isEmpty()'
in `curator-x-async/src/main/java/org/apache/curator/x/async/migrations/MigrationManager.java`
#### Snippet
```java
        }

        if ( toBeApplied.size() == 0 )
        {
            return CompletableFuture.completedFuture(null);
```

### SizeReplaceableByIsEmpty
`instances.size() == 0` can be replaced with 'instances.isEmpty()'
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/strategies/RandomStrategy.java`
#### Snippet
```java
    {
        List<ServiceInstance<T>>    instances = instanceProvider.getInstances();
        if ( instances.size() == 0 )
        {
            return null;
```

### SizeReplaceableByIsEmpty
`instances.size() == 0` can be replaced with 'instances.isEmpty()'
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/strategies/RoundRobinStrategy.java`
#### Snippet
```java
    {
        List<ServiceInstance<T>>    instances = instanceProvider.getInstances();
        if ( instances.size() == 0 )
        {
            return null;
```

### SizeReplaceableByIsEmpty
`aclList.size() > 0` can be replaced with '!aclList.isEmpty()'
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
    private List<ACL> fixAclList(List<ACL> aclList)
    {
        return (aclList.size() > 0) ? aclList : null;   // workaround for old, bad design. empty list not accepted
    }
}
```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
    {
        List<ZNode<T>> nodes = Lists.newArrayList();
        if ( children.size() == 0 )
        {
            modelStage.complete(nodes);
```

### SizeReplaceableByIsEmpty
`cache.getCurrentData().size() == 0` can be replaced with 'cache.getCurrentData().isEmpty()'
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
    private static void list(PathChildrenCache cache)
    {
        if ( cache.getCurrentData().size() == 0 )
        {
            System.out.println("* empty *");
```

### SizeReplaceableByIsEmpty
`stack.size() > 0` can be replaced with '!stack.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheIterator.java`
#### Snippet
```java
                break;
            }
            else if ( stack.size() > 0 )
            {
                current = stack.pop();
```

### SizeReplaceableByIsEmpty
`errorListeners.size() == 0` can be replaced with 'errorListeners.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
    private void handleException(final Throwable e)
    {
        if ( errorListeners.size() == 0 )
        {
            LOG.error("", e);
```

### SizeReplaceableByIsEmpty
`threadData.size() > 0` can be replaced with '!threadData.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessMutex.java`
#### Snippet
```java
    public boolean isAcquiredInThisProcess()
    {
        return (threadData.size() > 0);
    }

```

### SizeReplaceableByIsEmpty
`uninitializedChildren.size() != 0` can be replaced with '!uninitializedChildren.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
                }
            );
        return (uninitializedChildren.size() != 0);
    }

```

### SizeReplaceableByIsEmpty
`id.length() > 0` can be replaced with '!id.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedIdQueue.java`
#### Snippet
```java
    private boolean isValidId(String id)
    {
        return (id != null) && (id.length() > 0);
    }

```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSharder.java`
#### Snippet
```java
        }

        if ( children.size() == 0 )
        {
            addNewQueueIfNeeded(null);
```

### SizeReplaceableByIsEmpty
`localPreferredQueues.size() > 0` can be replaced with '!localPreferredQueues.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSharder.java`
#### Snippet
```java

        List<String>    localPreferredQueues = Lists.newArrayList(preferredQueues);
        if ( localPreferredQueues.size() > 0 )
        {
            String key = localPreferredQueues.get(
```

### SizeReplaceableByIsEmpty
`participantNodes.size() > 0` can be replaced with '!participantNodes.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
        Participant result = null;

        if ( participantNodes.size() > 0 )
        {
            Iterator<String> iter = participantNodes.iterator();
```

### SizeReplaceableByIsEmpty
`id.length() > 0` can be replaced with '!id.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
            protected byte[] getLockNodeBytes()
            {
                return (id.length() > 0) ? getIdBytes(id) : null;
            }
        };
```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
            }
            children = filterAndSortChildren(children);
            if ( (children == null) || (children.size() == 0) )
            {
                break;
```

### SizeReplaceableByIsEmpty
`children.size() > 0` can be replaced with '!children.isEmpty()'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
                    sortChildren(children); // makes sure items are processed in the correct order

                    if ( children.size() > 0 )
                    {
                        maxWaitMs = getDelay(children.get(0));
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `(i + 1 == chars.length) || chars[i+1] == '/'`
in `curator-client/src/main/java/org/apache/curator/utils/PathUtils.java`
#### Snippet
```java
            } else if (c == '.' && lastc == '.') {
                if (chars[i-2] == '/' &&
                        ((i + 1 == chars.length)
                                || chars[i+1] == '/')) {
                    reason = "relative paths not allowed @" + i;
                    break;
```

### DuplicateExpressions
Multiple occurrences of `(i + 1 == chars.length) || chars[i+1] == '/'`
in `curator-client/src/main/java/org/apache/curator/utils/PathUtils.java`
#### Snippet
```java
            } else if (c == '.') {
                if (chars[i-1] == '/' &&
                        ((i + 1 == chars.length)
                                || chars[i+1] == '/')) {
                    reason = "relative paths not allowed @" + i;
                    break;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AdvancedTracerDriver` has no concrete subclass
in `curator-client/src/main/java/org/apache/curator/drivers/AdvancedTracerDriver.java`
#### Snippet
```java
 *  Expose more metrics for the operations and events
 */
public abstract class AdvancedTracerDriver implements TracerDriver
{
    /**
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends TracerDriver`
in `curator-client/src/main/java/org/apache/curator/RetryLoopImpl.java`
#### Snippet
```java
    private static final RetrySleeper sleeper = (time, unit) -> unit.sleep(time);

    RetryLoopImpl(RetryPolicy retryPolicy, AtomicReference<TracerDriver> tracer)
    {
        this.retryPolicy = retryPolicy;
```

### BoundedWildcard
Can generalize to `? extends RetryLoop`
in `curator-client/src/main/java/org/apache/curator/connection/ThreadLocalRetryLoop.java`
#### Snippet
```java
     * @return retry loop to use
     */
    public RetryLoop getRetryLoop(Supplier<RetryLoop> newRetryLoopSupplier)
    {
        Entry entry = threadLocal.get();
```

### BoundedWildcard
Can generalize to `? extends TracerDriver`
in `curator-client/src/main/java/org/apache/curator/ConnectionState.java`
#### Snippet
```java
    private volatile long connectionStartMs = 0;

    ConnectionState(ZookeeperFactory zookeeperFactory, EnsembleProvider ensembleProvider, int sessionTimeoutMs, Watcher parentWatcher, AtomicReference<TracerDriver> tracer, boolean canBeReadOnly)
    {
        this.ensembleProvider = ensembleProvider;
```

### BoundedWildcard
Can generalize to `? extends AuthInfo`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
         * @return this
         */
        public Builder authorization(List<AuthInfo> authInfos)
        {
            this.authInfos = ImmutableList.copyOf(authInfos);
```

### BoundedWildcard
Can generalize to `? extends PathAndBytes`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
    }

    private void backgroundCheckIdempotent(final CuratorFrameworkImpl client, final OperationAndData<PathAndBytes> mainOperationAndData, final String path, final Backgrounding backgrounding)
    {
        final AsyncCallback.DataCallback dataCallback = new AsyncCallback.DataCallback()
```

### BoundedWildcard
Can generalize to `? extends OpResult`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTransactionImpl.java`
#### Snippet
```java
    }

    static List<CuratorTransactionResult> wrapResults(CuratorFrameworkImpl client, List<OpResult> resultList, CuratorMultiTransactionRecord transaction)
    {
        ImmutableList.Builder<CuratorTransactionResult> builder = ImmutableList.builder();
```

### BoundedWildcard
Can generalize to `? extends CuratorOp`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorMultiTransactionImpl.java`
#### Snippet
```java

    @Override
    public List<CuratorTransactionResult> forOperations(List<CuratorOp> operations) throws Exception
    {
        operations = Preconditions.checkNotNull(operations, "operations cannot be null");
```

### BoundedWildcard
Can generalize to `? extends CuratorMultiTransactionRecord`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorMultiTransactionImpl.java`
#### Snippet
```java

    @Override
    public void performBackgroundOperation(final OperationAndData<CuratorMultiTransactionRecord> operationAndData) throws Exception
    {
        try
```

### BoundedWildcard
Can generalize to `? super K`
in `curator-framework/src/main/java/org/apache/curator/framework/listen/MappingListenerManager.java`
#### Snippet
```java
    }

    MappingListenerManager(Function<K, V> mapper)
    {
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends V`
in `curator-framework/src/main/java/org/apache/curator/framework/listen/MappingListenerManager.java`
#### Snippet
```java
    }

    MappingListenerManager(Function<K, V> mapper)
    {
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? super V`
in `curator-framework/src/main/java/org/apache/curator/framework/listen/MappingListenerManager.java`
#### Snippet
```java

    @Override
    public void forEach(Consumer<V> function)
    {
        for ( ListenerEntry<V> entry : listeners.values() )
```

### BoundedWildcard
Can generalize to `? super T`
in `curator-framework/src/main/java/org/apache/curator/framework/listen/StandardListenerManager.java`
#### Snippet
```java
    }

    private StandardListenerManager(ListenerManager<T, T> container)
    {
        this.container = container;
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
     * @return completion stage that resolves to a result
     */
    static <T> CompletionStage<AsyncResult<T>> of(AsyncStage<T> stage)
    {
        return stage.handle((value, ex) -> {
```

### BoundedWildcard
Can generalize to `? super Schema`
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSetLoader.java`
#### Snippet
```java
    }

    private void readNode(ImmutableList.Builder<Schema> builder, JsonNode node, SchemaValidatorMapper schemaValidatorMapper)
    {
        String name = getText(node, "name", null);
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
    }

    private static void lockIf(CompletableFuture<Boolean> future, InterProcessLock lock, long timeout, TimeUnit unit)
    {
        try
```

### BoundedWildcard
Can generalize to `? super Map`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
    }

    private static void completeChildren(AsyncCuratorFramework client, CompletableFuture<Map<String, byte[]>> future, String parentPath, List<String> children, boolean isCompressed)
    {
        Map<String, byte[]> nodes = Maps.newHashMap();
```

### BoundedWildcard
Can generalize to `? super CuratorEvent`
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/BackgroundProcs.java`
#### Snippet
```java
    static final BackgroundProc<List<CuratorTransactionResult>> opResultsProc = makeProc(CuratorEvent::getOpResults);

    static <T> BackgroundProc<T> makeProc(Function<CuratorEvent, T> proc)
    {
        return (event, future) -> {
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/BackgroundProcs.java`
#### Snippet
```java
    static final BackgroundProc<List<CuratorTransactionResult>> opResultsProc = makeProc(CuratorEvent::getOpResults);

    static <T> BackgroundProc<T> makeProc(Function<CuratorEvent, T> proc)
    {
        return (event, future) -> {
```

### BoundedWildcard
Can generalize to `? extends ZNode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ZNode.java`
#### Snippet
```java
     * @return stage of a model
     */
    static <T> CompletionStage<T> model(AsyncStage<ZNode<T>> from)
    {
        return from.thenApply(ZNode::model);
```

### BoundedWildcard
Can generalize to `? extends List`>
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ZNode.java`
#### Snippet
```java
     * @return stage of models
     */
    static <T> CompletionStage<List<T>> models(AsyncStage<List<ZNode<T>>> from)
    {
        return from.thenApply(nodes -> nodes.stream().map(ZNode::model).collect(Collectors.toList()));
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec4.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4> TypedModelSpec4<M, P1, P2, P3, P4> from(ModelSpecBuilder<M> builder, TypedZPath4<P1, P2, P3, P4> path)
    {
        return (p1, p2, p3, p4) -> builder.withPath(path.resolved(p1, p2, p3, p4)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec4.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4> TypedModelSpec4<M, P1, P2, P3, P4> from(ModelSpecBuilder<M> builder, TypedZPath4<P1, P2, P3, P4> path)
    {
        return (p1, p2, p3, p4) -> builder.withPath(path.resolved(p1, p2, p3, p4)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec4.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4> TypedModelSpec4<M, P1, P2, P3, P4> from(ModelSpecBuilder<M> builder, TypedZPath4<P1, P2, P3, P4> path)
    {
        return (p1, p2, p3, p4) -> builder.withPath(path.resolved(p1, p2, p3, p4)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec4.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4> TypedModelSpec4<M, P1, P2, P3, P4> from(ModelSpecBuilder<M> builder, TypedZPath4<P1, P2, P3, P4> path)
    {
        return (p1, p2, p3, p4) -> builder.withPath(path.resolved(p1, p2, p3, p4)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework2.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2> TypedModeledFramework2<M, P1, P2> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec2<M, P1, P2> modelSpec)
    {
        return (client, p1, p2) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework2.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2> TypedModeledFramework2<M, P1, P2> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec2<M, P1, P2> modelSpec)
    {
        return (client, p1, p2) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec7.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> from(ModelSpecBuilder<M> builder, TypedZPath7<P1, P2, P3, P4, P5, P6, P7> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec7.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> from(ModelSpecBuilder<M> builder, TypedZPath7<P1, P2, P3, P4, P5, P6, P7> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec7.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> from(ModelSpecBuilder<M> builder, TypedZPath7<P1, P2, P3, P4, P5, P6, P7> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec7.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> from(ModelSpecBuilder<M> builder, TypedZPath7<P1, P2, P3, P4, P5, P6, P7> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec7.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> from(ModelSpecBuilder<M> builder, TypedZPath7<P1, P2, P3, P4, P5, P6, P7> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec7.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> from(ModelSpecBuilder<M> builder, TypedZPath7<P1, P2, P3, P4, P5, P6, P7> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P7`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec7.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> from(ModelSpecBuilder<M> builder, TypedZPath7<P1, P2, P3, P4, P5, P6, P7> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework5.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5> TypedModeledFramework5<M, P1, P2, P3, P4, P5> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec5<M, P1, P2, P3, P4, P5> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework5.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5> TypedModeledFramework5<M, P1, P2, P3, P4, P5> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec5<M, P1, P2, P3, P4, P5> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework5.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5> TypedModeledFramework5<M, P1, P2, P3, P4, P5> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec5<M, P1, P2, P3, P4, P5> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework5.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5> TypedModeledFramework5<M, P1, P2, P3, P4, P5> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec5<M, P1, P2, P3, P4, P5> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework5.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5> TypedModeledFramework5<M, P1, P2, P3, P4, P5> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec5<M, P1, P2, P3, P4, P5> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1> TypedModeledFramework<M, P1> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec<M, P1> modelSpec)
    {
        return (client, p1) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec3.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3> TypedModelSpec3<M, P1, P2, P3> from(ModelSpecBuilder<M> builder, TypedZPath3<P1, P2, P3> path)
    {
        return (p1, p2, p3) -> builder.withPath(path.resolved(p1, p2, p3)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec3.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3> TypedModelSpec3<M, P1, P2, P3> from(ModelSpecBuilder<M> builder, TypedZPath3<P1, P2, P3> path)
    {
        return (p1, p2, p3) -> builder.withPath(path.resolved(p1, p2, p3)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec3.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3> TypedModelSpec3<M, P1, P2, P3> from(ModelSpecBuilder<M> builder, TypedZPath3<P1, P2, P3> path)
    {
        return (p1, p2, p3) -> builder.withPath(path.resolved(p1, p2, p3)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec6.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> from(ModelSpecBuilder<M> builder, TypedZPath6<P1, P2, P3, P4, P5, P6> path)
    {
        return (p1, p2, p3, p4, p5, p6) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec6.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> from(ModelSpecBuilder<M> builder, TypedZPath6<P1, P2, P3, P4, P5, P6> path)
    {
        return (p1, p2, p3, p4, p5, p6) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec6.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> from(ModelSpecBuilder<M> builder, TypedZPath6<P1, P2, P3, P4, P5, P6> path)
    {
        return (p1, p2, p3, p4, p5, p6) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec6.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> from(ModelSpecBuilder<M> builder, TypedZPath6<P1, P2, P3, P4, P5, P6> path)
    {
        return (p1, p2, p3, p4, p5, p6) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec6.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> from(ModelSpecBuilder<M> builder, TypedZPath6<P1, P2, P3, P4, P5, P6> path)
    {
        return (p1, p2, p3, p4, p5, p6) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec6.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> from(ModelSpecBuilder<M> builder, TypedZPath6<P1, P2, P3, P4, P5, P6> path)
    {
        return (p1, p2, p3, p4, p5, p6) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P7`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P8`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P9`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P10`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModelSpecBuilder<M> builder, TypedZPath10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec2.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2> TypedModelSpec2<M, P1, P2> from(ModelSpecBuilder<M> builder, TypedZPath2<P1, P2> path)
    {
        return (p1, p2) -> builder.withPath(path.resolved(p1, p2)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec2.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2> TypedModelSpec2<M, P1, P2> from(ModelSpecBuilder<M> builder, TypedZPath2<P1, P2> path)
    {
        return (p1, p2) -> builder.withPath(path.resolved(p1, p2)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework4.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4> TypedModeledFramework4<M, P1, P2, P3, P4> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec4<M, P1, P2, P3, P4> modelSpec)
    {
        return (client, p1, p2, p3, p4) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework4.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4> TypedModeledFramework4<M, P1, P2, P3, P4> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec4<M, P1, P2, P3, P4> modelSpec)
    {
        return (client, p1, p2, p3, p4) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework4.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4> TypedModeledFramework4<M, P1, P2, P3, P4> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec4<M, P1, P2, P3, P4> modelSpec)
    {
        return (client, p1, p2, p3, p4) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework4.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4> TypedModeledFramework4<M, P1, P2, P3, P4> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec4<M, P1, P2, P3, P4> modelSpec)
    {
        return (client, p1, p2, p3, p4) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1> TypedModelSpec<M, P1> from(ModelSpecBuilder<M> builder, TypedZPath<P1> path)
    {
        return p1 -> builder.withPath(path.resolved(p1)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework8.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModeledFramework8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework8.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModeledFramework8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework8.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModeledFramework8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework8.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModeledFramework8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework8.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModeledFramework8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework8.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModeledFramework8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P7`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework8.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModeledFramework8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P8`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework8.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModeledFramework8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework7.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModeledFramework7<M, P1, P2, P3, P4, P5, P6, P7> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework7.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModeledFramework7<M, P1, P2, P3, P4, P5, P6, P7> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework7.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModeledFramework7<M, P1, P2, P3, P4, P5, P6, P7> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework7.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModeledFramework7<M, P1, P2, P3, P4, P5, P6, P7> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework7.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModeledFramework7<M, P1, P2, P3, P4, P5, P6, P7> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework7.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModeledFramework7<M, P1, P2, P3, P4, P5, P6, P7> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P7`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework7.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7> TypedModeledFramework7<M, P1, P2, P3, P4, P5, P6, P7> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec7<M, P1, P2, P3, P4, P5, P6, P7> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework3.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3> TypedModeledFramework3<M, P1, P2, P3> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec3<M, P1, P2, P3> modelSpec)
    {
        return (client, p1, p2, p3) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework3.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3> TypedModeledFramework3<M, P1, P2, P3> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec3<M, P1, P2, P3> modelSpec)
    {
        return (client, p1, p2, p3) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework3.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3> TypedModeledFramework3<M, P1, P2, P3> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec3<M, P1, P2, P3> modelSpec)
    {
        return (client, p1, p2, p3) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModelSpecBuilder<M> builder, TypedZPath9<P1, P2, P3, P4, P5, P6, P7, P8, P9> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModelSpecBuilder<M> builder, TypedZPath9<P1, P2, P3, P4, P5, P6, P7, P8, P9> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModelSpecBuilder<M> builder, TypedZPath9<P1, P2, P3, P4, P5, P6, P7, P8, P9> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModelSpecBuilder<M> builder, TypedZPath9<P1, P2, P3, P4, P5, P6, P7, P8, P9> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModelSpecBuilder<M> builder, TypedZPath9<P1, P2, P3, P4, P5, P6, P7, P8, P9> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModelSpecBuilder<M> builder, TypedZPath9<P1, P2, P3, P4, P5, P6, P7, P8, P9> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P7`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModelSpecBuilder<M> builder, TypedZPath9<P1, P2, P3, P4, P5, P6, P7, P8, P9> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P8`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModelSpecBuilder<M> builder, TypedZPath9<P1, P2, P3, P4, P5, P6, P7, P8, P9> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P9`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModelSpecBuilder<M> builder, TypedZPath9<P1, P2, P3, P4, P5, P6, P7, P8, P9> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec5.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5> TypedModelSpec5<M, P1, P2, P3, P4, P5> from(ModelSpecBuilder<M> builder, TypedZPath5<P1, P2, P3, P4, P5> path)
    {
        return (p1, p2, p3, p4, p5) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec5.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5> TypedModelSpec5<M, P1, P2, P3, P4, P5> from(ModelSpecBuilder<M> builder, TypedZPath5<P1, P2, P3, P4, P5> path)
    {
        return (p1, p2, p3, p4, p5) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec5.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5> TypedModelSpec5<M, P1, P2, P3, P4, P5> from(ModelSpecBuilder<M> builder, TypedZPath5<P1, P2, P3, P4, P5> path)
    {
        return (p1, p2, p3, p4, p5) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec5.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5> TypedModelSpec5<M, P1, P2, P3, P4, P5> from(ModelSpecBuilder<M> builder, TypedZPath5<P1, P2, P3, P4, P5> path)
    {
        return (p1, p2, p3, p4, p5) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec5.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5> TypedModelSpec5<M, P1, P2, P3, P4, P5> from(ModelSpecBuilder<M> builder, TypedZPath5<P1, P2, P3, P4, P5> path)
    {
        return (p1, p2, p3, p4, p5) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework6.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModeledFramework6<M, P1, P2, P3, P4, P5, P6> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework6.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModeledFramework6<M, P1, P2, P3, P4, P5, P6> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework6.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModeledFramework6<M, P1, P2, P3, P4, P5, P6> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework6.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModeledFramework6<M, P1, P2, P3, P4, P5, P6> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework6.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModeledFramework6<M, P1, P2, P3, P4, P5, P6> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework6.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6> TypedModeledFramework6<M, P1, P2, P3, P4, P5, P6> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec6<M, P1, P2, P3, P4, P5, P6> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6)).build();
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec8.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModelSpecBuilder<M> builder, TypedZPath8<P1, P2, P3, P4, P5, P6, P7, P8> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec8.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModelSpecBuilder<M> builder, TypedZPath8<P1, P2, P3, P4, P5, P6, P7, P8> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec8.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModelSpecBuilder<M> builder, TypedZPath8<P1, P2, P3, P4, P5, P6, P7, P8> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec8.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModelSpecBuilder<M> builder, TypedZPath8<P1, P2, P3, P4, P5, P6, P7, P8> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec8.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModelSpecBuilder<M> builder, TypedZPath8<P1, P2, P3, P4, P5, P6, P7, P8> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec8.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModelSpecBuilder<M> builder, TypedZPath8<P1, P2, P3, P4, P5, P6, P7, P8> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P7`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec8.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModelSpecBuilder<M> builder, TypedZPath8<P1, P2, P3, P4, P5, P6, P7, P8> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? super P8`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec8.java`
#### Snippet
```java
     * @return new TypedModelSpec
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8> TypedModelSpec8<M, P1, P2, P3, P4, P5, P6, P7, P8> from(ModelSpecBuilder<M> builder, TypedZPath8<P1, P2, P3, P4, P5, P6, P7, P8> path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8) -> builder.withPath(path.resolved(p1, p2, p3, p4, p5, p6, p7, p8)).build();
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/VersionedModeledFrameworkImpl.java`
#### Snippet
```java

    @Override
    public CuratorOp updateOp(Versioned<T> model)
    {
        return client.updateOp(model.model(), model.version());
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/VersionedModeledFrameworkImpl.java`
#### Snippet
```java

    @Override
    public AsyncStage<String> set(Versioned<T> model, Stat storingStatIn)
    {
        return client.set(model.model(), storingStatIn, model.version());
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/VersionedModeledFrameworkImpl.java`
#### Snippet
```java

    @Override
    public AsyncStage<String> set(Versioned<T> model)
    {
        return client.set(model.model(), model.version());
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/VersionedModeledFrameworkImpl.java`
#### Snippet
```java

    @Override
    public AsyncStage<Stat> update(Versioned<T> model)
    {
        return client.update(model.model(), model.version());
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P7`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P8`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P9`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? super P10`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> TypedModeledFramework10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec10<M, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).build();
```

### BoundedWildcard
Can generalize to `? extends Migration`
in `curator-x-async/src/main/java/org/apache/curator/x/async/migrations/MigrationSet.java`
#### Snippet
```java
    List<Migration> migrations();

    static MigrationSet build(String id, List<Migration> migrations)
    {
        Objects.requireNonNull(id, "id cannot be null");
```

### BoundedWildcard
Can generalize to `? super P1`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModeledFramework9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P2`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModeledFramework9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P3`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModeledFramework9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P4`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModeledFramework9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P5`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModeledFramework9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P6`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModeledFramework9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P7`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModeledFramework9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P8`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModeledFramework9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super P9`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java
     * @return new TypedModeledFramework
     */
    static <M, P1, P2, P3, P4, P5, P6, P7, P8, P9> TypedModeledFramework9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> from(ModeledFrameworkBuilder<M> frameworkBuilder, TypedModelSpec9<M, P1, P2, P3, P4, P5, P6, P7, P8, P9> modelSpec)
    {
        return (client, p1, p2, p3, p4, p5, p6, p7, p8, p9) -> frameworkBuilder.withClient(client).withModelSpec(modelSpec.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9)).build();
```

### BoundedWildcard
Can generalize to `? super ZNode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/CachedModeledFrameworkImpl.java`
#### Snippet
```java
    }

    private <U> AsyncStage<U> internalRead(Function<ZNode<T>, U> resolver, Supplier<AsyncStage<U>> elseProc)
    {
        ZPath path = client.modelSpec().path();
```

### BoundedWildcard
Can generalize to `? extends AsyncStage`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/CachedModeledFrameworkImpl.java`
#### Snippet
```java
    }

    private <U> AsyncStage<U> internalRead(Function<ZNode<T>, U> resolver, Supplier<AsyncStage<U>> elseProc)
    {
        ZPath path = client.modelSpec().path();
```

### BoundedWildcard
Can generalize to `? extends Migration`
in `curator-x-async/src/main/java/org/apache/curator/x/async/migrations/MigrationManager.java`
#### Snippet
```java
    volatile AtomicInteger debugCount = null;

    private CompletionStage<Void> applyMetaDataAfterEnsure(List<Migration> toBeApplied, String thisMetaDataPath)
    {
        if ( debugCount != null )
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/JsonInstanceSerializer.java`
#### Snippet
```java

    @Override
    public byte[] serialize(ServiceInstance<T> instance) throws Exception
    {
        if ( compatibleSerializationMode )
```

### BoundedWildcard
Can generalize to `? super List`>
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
    }

    private void completeChildrenAsZNodes(ModelStage<List<ZNode<T>>> modelStage, List<ZPath> children)
    {
        List<ZNode<T>> nodes = Lists.newArrayList();
```

### BoundedWildcard
Can generalize to `? extends ZPath`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
    }

    private void completeChildrenAsZNodes(ModelStage<List<ZNode<T>>> modelStage, List<ZPath> children)
    {
        List<ZNode<T>> nodes = Lists.newArrayList();
```

### BoundedWildcard
Can generalize to `? super ZNode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
    }

    private <U> ModelStage<U> internalRead(Function<ZNode<T>, U> resolver, Stat storingStatIn)
    {
        Stat stat = (storingStatIn != null) ? storingStatIn : new Stat();
```

### BoundedWildcard
Can generalize to `? extends U`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
    }

    private <U> ModelStage<U> internalRead(Function<ZNode<T>, U> resolver, Stat storingStatIn)
    {
        Stat stat = (storingStatIn != null) ? storingStatIn : new Stat();
```

### BoundedWildcard
Can generalize to `? extends WatchedEvent`
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
    }

    private static void handleWatchedStage(CompletionStage<WatchedEvent> watchedStage)
    {
        // async handling of Watchers is complicated because watchers can trigger multiple times
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/entity/JsonServiceInstanceMarshaller.java`
#### Snippet
```java
    }

    static<T> ServiceInstance<T> readInstance(JsonNode node, DiscoveryContext<T> context) throws Exception
    {
        ServiceInstanceBuilder<T> builder = ServiceInstance.builder();
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/entity/JsonServiceInstanceMarshaller.java`
#### Snippet
```java
    }

    static<T> ObjectNode writeInstance(ObjectMapper mapper, ServiceInstance<T> instance, DiscoveryContext<T> context)
    {
        ObjectNode  node = mapper.createObjectNode();
```

### BoundedWildcard
Can generalize to `? super T`
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/entity/JsonServiceInstanceMarshaller.java`
#### Snippet
```java
    }

    static<T> ObjectNode writeInstance(ObjectMapper mapper, ServiceInstance<T> instance, DiscoveryContext<T> context)
    {
        ObjectNode  node = mapper.createObjectNode();
```

### BoundedWildcard
Can generalize to `? super Group`
in `curator-examples/src/main/java/pubsub/Subscriber.java`
#### Snippet
```java
    }

    private <T extends Message> CachedModeledFramework<T> startSubscriber(TypedModeledFramework2<T, Group, Priority> typedClient, Group group, Priority priority)
    {
        CachedModeledFramework<T> resolved = typedClient.resolved(client, group, priority).cached();
```

### BoundedWildcard
Can generalize to `? super Priority`
in `curator-examples/src/main/java/pubsub/Subscriber.java`
#### Snippet
```java
    }

    private <T extends Message> CachedModeledFramework<T> startSubscriber(TypedModeledFramework2<T, Group, Priority> typedClient, Group group, Priority priority)
    {
        CachedModeledFramework<T> resolved = typedClient.resolved(client, group, priority).cached();
```

### BoundedWildcard
Can generalize to `? super PersonModel`
in `curator-examples/src/main/java/modeled/ModeledCuratorExamplesAlt.java`
#### Snippet
```java
    }

    public static void readPerson(PersonModelSpec modelSpec, ContainerType containerType, PersonId id, Consumer<PersonModel> receiver)
    {
        ModeledFramework<PersonModel> resolved = modelSpec.resolved(containerType, id);
```

### BoundedWildcard
Can generalize to `? extends PersonModel`
in `curator-examples/src/main/java/modeled/ModeledCuratorExamples.java`
#### Snippet
```java
    }

    public static void readPerson(ModeledFramework<PersonModel> modeled, String id, Consumer<PersonModel> receiver)
    {
        // read the person with the given ID and asynchronously call the receiver after it is read
```

### BoundedWildcard
Can generalize to `? super PersonModel`
in `curator-examples/src/main/java/modeled/ModeledCuratorExamples.java`
#### Snippet
```java
    }

    public static void readPerson(ModeledFramework<PersonModel> modeled, String id, Consumer<PersonModel> receiver)
    {
        // read the person with the given ID and asynchronously call the receiver after it is read
```

### BoundedWildcard
Can generalize to `? extends Instance`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
     * @param instances instances to publish
     */
    public void publishInstances(List<Instance> instances)
    {
        List<CuratorOp> operations = instances.stream()
```

### BoundedWildcard
Can generalize to `? super Group`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
    }

    private <T extends Message> void publishMessage(TypedModeledFramework2<T, Group, Priority> typedClient, Group group, T message)
    {
        ModeledFramework<T> resolvedClient = typedClient.resolved(client, group, message.getPriority());
```

### BoundedWildcard
Can generalize to `? super Priority`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
    }

    private <T extends Message> void publishMessage(TypedModeledFramework2<T, Group, Priority> typedClient, Group group, T message)
    {
        ModeledFramework<T> resolvedClient = typedClient.resolved(client, group, message.getPriority());
```

### BoundedWildcard
Can generalize to `? super T`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
    }

    private <T extends Message> void publishMessages(TypedModeledFramework2<T, Group, Priority> typedClient, Group group, List<T> messages)
    {
        List<CuratorOp> operations = messages.stream()
```

### BoundedWildcard
Can generalize to `? super Group`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
    }

    private <T extends Message> void publishMessages(TypedModeledFramework2<T, Group, Priority> typedClient, Group group, List<T> messages)
    {
        List<CuratorOp> operations = messages.stream()
```

### BoundedWildcard
Can generalize to `? super Priority`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
    }

    private <T extends Message> void publishMessages(TypedModeledFramework2<T, Group, Priority> typedClient, Group group, List<T> messages)
    {
        List<CuratorOp> operations = messages.stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
    }

    private <T extends Message> void publishMessages(TypedModeledFramework2<T, Group, Priority> typedClient, Group group, List<T> messages)
    {
        List<CuratorOp> operations = messages.stream()
```

### BoundedWildcard
Can generalize to `? super String`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ZPathImpl.java`
#### Snippet
```java
    }

    private String buildFullPath(UnaryOperator<String> filter)
    {
        boolean addSeparator = false;
```

### BoundedWildcard
Can generalize to `? super ChildData`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilderImpl.java`
#### Snippet
```java

    @Override
    public CuratorCacheListenerBuilder forCreates(Consumer<ChildData> listener)
    {
        listeners.add((type, oldNode, node) -> {
```

### BoundedWildcard
Can generalize to `? super ChildData`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilderImpl.java`
#### Snippet
```java

    @Override
    public CuratorCacheListenerBuilder forDeletes(Consumer<ChildData> listener)
    {
        listeners.add((type, oldNode, node) -> {
```

### BoundedWildcard
Can generalize to `? extends ExampleServer`
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
    }

    private static void deleteInstance(String[] args, String command, List<ExampleServer> servers)
    {
        // simulate a random instance going down
```

### BoundedWildcard
Can generalize to `? super String`
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
    }

    private static void listRandomInstance(String[] args, ServiceDiscovery<InstanceDetails> serviceDiscovery, Map<String, ServiceProvider<InstanceDetails>> providers, String command) throws Exception
    {
        // this shows how to use a ServiceProvider
```

### BoundedWildcard
Can generalize to `? extends InstanceDetails`
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
    }

    private static void outputInstance(ServiceInstance<InstanceDetails> instance)
    {
        System.out.println("\t" + instance.getPayload().getDescription() + ": " + instance.buildUriSpec());
```

### BoundedWildcard
Can generalize to `? super ExampleServer`
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
    }

    private static void addInstance(String[] args, CuratorFramework client, String command, List<ExampleServer> servers) throws Exception
    {
        // simulate a new instance coming up
```

### BoundedWildcard
Can generalize to `? super InterProcessMutex`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessMutex.java`
#### Snippet
```java

    @Override
    public void makeRevocable(final RevocationListener<InterProcessMutex> listener, Executor executor)
    {
        internals.makeRevocable(new RevocationSpec(executor, new Runnable()
```

### BoundedWildcard
Can generalize to `? extends Lease`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphore.java`
#### Snippet
```java
     * @param leases leases to close
     */
    public void     returnAll(Collection<Lease> leases)
    {
        for ( Lease l : leases )
```

### BoundedWildcard
Can generalize to `? super Lease`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
    volatile CountDownLatch debugWaitLatch = null;

    private InternalAcquireResult internalAcquire1Lease(ImmutableList.Builder<Lease> builder, long startMs, boolean hasWait, long waitMs) throws Exception
    {
        if ( client.getState() != CuratorFrameworkState.STARTED )
```

### BoundedWildcard
Can generalize to `? extends Lease`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
     * @param leases leases to close
     */
    public void returnAll(Collection<Lease> leases)
    {
        for ( Lease l : leases )
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/ItemSerializer.java`
#### Snippet
```java
    private static final int    INITIAL_BUFFER_SIZE = 0x1000;

    static<T> MultiItem<T>  deserialize(byte[] bytes, QueueSerializer<T> serializer) throws Exception
    {
        DataInputStream     in = new DataInputStream(new ByteArrayInputStream(bytes));
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/ItemSerializer.java`
#### Snippet
```java
    }

    static<T> byte[]        serialize(MultiItem<T> items, QueueSerializer<T> serializer) throws Exception
    {
        ByteArrayOutputStream       bytes = new ByteArrayOutputStream(INITIAL_BUFFER_SIZE);
```

### BoundedWildcard
Can generalize to `? super T`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/ItemSerializer.java`
#### Snippet
```java
    }

    static<T> byte[]        serialize(MultiItem<T> items, QueueSerializer<T> serializer) throws Exception
    {
        ByteArrayOutputStream       bytes = new ByteArrayOutputStream(INITIAL_BUFFER_SIZE);
```

### BoundedWildcard
Can generalize to `? extends T`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSharder.java`
#### Snippet
```java
     * @param policies sharding policies
     */
    public QueueSharder(CuratorFramework client, QueueAllocator<U, T> queueAllocator, String queuePath, String leaderPath, QueueSharderPolicies policies)
    {
        this.client = client;
```

### BoundedWildcard
Can generalize to `? super T`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
        (
            CuratorFramework client,
            QueueConsumer<T> consumer,
            QueueSerializer<T> serializer,
            String queuePath,
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/entity/JsonServiceInstanceMarshaller.java`
#### Snippet
```java
public class JsonServiceInstanceMarshaller<T> implements MessageBodyReader<ServiceInstance<T>>, MessageBodyWriter<ServiceInstance<T>>
{
    private final static ObjectMapper mapper = new ObjectMapper();

    private final DiscoveryContext<T> context;
```

### MissortedModifiers
Missorted modifiers `final static`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/AfterConnectionEstablished.java`
#### Snippet
```java
public class AfterConnectionEstablished
{
    private final static Logger log = LoggerFactory.getLogger(AfterConnectionEstablished.class);

    /**
```

### MissortedModifiers
Missorted modifiers `static private`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/StandardLockInternalsDriver.java`
#### Snippet
```java
public class StandardLockInternalsDriver implements LockInternalsDriver
{
    static private final Logger log = LoggerFactory.getLogger(StandardLockInternalsDriver.class);

    @Override
```

### MissortedModifiers
Missorted modifiers `final protected`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessReadWriteLock.java`
#### Snippet
```java

        @Override
        final protected byte[] getLockNodeBytes()
        {
            return lockData;
```

### MissortedModifiers
Missorted modifiers `final public`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessReadWriteLock.java`
#### Snippet
```java

        @Override
        final public Collection<String> getParticipantNodes() throws Exception
        {
            return ImmutableList.copyOf(Iterables.filter(super.getParticipantNodes(), new Predicate<String>() {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getsTheLock()` only delegates to its super method
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessReadWriteLock.java`
#### Snippet
```java
            super(client, basePath, WRITE_LOCK_NAME, lockData, 1, new SortingLockInternalsDriver() {
                @Override
                public PredicateResults getsTheLock(
                    CuratorFramework client,
                    List<String> children,
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
baseSleepTimeMs \* Math.max(1, random.nextInt(1 \<\< (retryCount + 1))): integer multiplication implicitly cast to long
in `curator-client/src/main/java/org/apache/curator/retry/ExponentialBackoffRetry.java`
#### Snippet
```java
    {
        // copied from Hadoop's RetryPolicies.java
        long sleepMs = baseSleepTimeMs * Math.max(1, random.nextInt(1 << (retryCount + 1)));
        if ( sleepMs > maxSleepMs )
        {
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
        joinPath(path, parent, firstChild);

        if ( restChildren == null )
        {
            return path.toString();
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public CompletableFuture<Void> acceptEitherAsync(CompletionStage<? extends U> other, Consumer<? super U> action)
        {
            return super.acceptEitherAsync(other, action, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public <U1> CompletableFuture<U1> thenApplyAsync(Function<? super U, ? extends U1> fn)
        {
            return super.thenApplyAsync(fn, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public CompletableFuture<Void> runAfterEitherAsync(CompletionStage<?> other, Runnable action)
        {
            return super.runAfterEitherAsync(other, action, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public <U1> CompletableFuture<Void> thenAcceptBothAsync(CompletionStage<? extends U1> other, BiConsumer<? super U, ? super U1> action)
        {
            return super.thenAcceptBothAsync(other, action, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public CompletableFuture<Void> runAfterBothAsync(CompletionStage<?> other, Runnable action)
        {
            return super.runAfterBothAsync(other, action, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public <U1> CompletableFuture<U1> thenComposeAsync(Function<? super U, ? extends CompletionStage<U1>> fn)
        {
            return super.thenComposeAsync(fn, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public CompletableFuture<Void> thenAcceptAsync(Consumer<? super U> action)
        {
            return super.thenAcceptAsync(action, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public <U1> CompletableFuture<U1> handleAsync(BiFunction<? super U, Throwable, ? extends U1> fn)
        {
            return super.handleAsync(fn, executor);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public <U1, V> CompletableFuture<V> thenCombineAsync(CompletionStage<? extends U1> other, BiFunction<? super U, ? super U1, ? extends V> fn)
        {
            return super.thenCombineAsync(other, fn, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public <U1> CompletableFuture<U1> applyToEitherAsync(CompletionStage<? extends U> other, Function<? super U, U1> fn)
        {
            return super.applyToEitherAsync(other, fn, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public CompletableFuture<U> whenCompleteAsync(BiConsumer<? super U, ? super Throwable> action)
        {
            return super.whenCompleteAsync(action, executor);
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelStage.java`
#### Snippet
```java
        public CompletableFuture<Void> thenRunAsync(Runnable action)
        {
            return super.thenRunAsync(action, executor);
        }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.curator.framework.CuratorFrameworkFactory;`
in `curator-examples/src/main/java/framework/TransactionExamples.java`
#### Snippet
```java

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.api.transaction.CuratorOp;
import org.apache.curator.framework.api.transaction.CuratorTransactionResult;
```

### UNUSED_IMPORT
Unused import `import org.apache.curator.retry.RetryOneTime;`
in `curator-examples/src/main/java/framework/TransactionExamples.java`
#### Snippet
```java
import org.apache.curator.framework.api.transaction.CuratorOp;
import org.apache.curator.framework.api.transaction.CuratorTransactionResult;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.test.TestingServer;
import java.util.Collection;
```

### UNUSED_IMPORT
Unused import `import org.apache.curator.test.TestingServer;`
in `curator-examples/src/main/java/framework/TransactionExamples.java`
#### Snippet
```java
import org.apache.curator.framework.api.transaction.CuratorTransactionResult;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.test.TestingServer;
import java.util.Collection;

```

### UNUSED_IMPORT
Unused import `import org.apache.zookeeper.Watcher;`
in `curator-framework/src/main/java/org/apache/curator/framework/WatcherRemoveCuratorFramework.java`
#### Snippet
```java
package org.apache.curator.framework;

import org.apache.zookeeper.Watcher;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.zookeeper.OpResult;`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEvent.java`
#### Snippet
```java

import org.apache.curator.framework.api.transaction.CuratorTransactionResult;
import org.apache.zookeeper.OpResult;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.data.ACL;
```

### UNUSED_IMPORT
Unused import `import org.apache.curator.framework.state.ConnectionState;`
in `curator-framework/src/main/java/org/apache/curator/framework/api/UnhandledErrorListener.java`
#### Snippet
```java
package org.apache.curator.framework.api;

import org.apache.curator.framework.state.ConnectionState;
import org.apache.curator.framework.state.ConnectionStateListener;

```

### UNUSED_IMPORT
Unused import `import org.apache.curator.framework.state.ConnectionStateListener;`
in `curator-framework/src/main/java/org/apache/curator/framework/api/UnhandledErrorListener.java`
#### Snippet
```java

import org.apache.curator.framework.state.ConnectionState;
import org.apache.curator.framework.state.ConnectionStateListener;

public interface UnhandledErrorListener
```

### UNUSED_IMPORT
Unused import `import com.google.common.util.concurrent.ThreadFactoryBuilder;`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTempFrameworkImpl.java`
#### Snippet
```java

import com.google.common.annotations.VisibleForTesting;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.curator.utils.CloseableUtils;
import org.apache.curator.framework.CuratorFrameworkFactory;
```

### UNUSED_IMPORT
Unused import `import org.apache.curator.framework.CuratorFramework;`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceImpl.java`
#### Snippet
```java
import org.apache.curator.CuratorZookeeperClient;
import org.apache.curator.RetryLoop;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.utils.EnsurePath;
import org.apache.curator.utils.PathUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.zookeeper.ZooDefs;`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceImpl.java`
#### Snippet
```java
import org.apache.curator.utils.ThreadUtils;
import org.apache.curator.utils.ZKPaths;
import org.apache.zookeeper.ZooDefs;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
```

### UNUSED_IMPORT
Unused import `import org.apache.curator.framework.api.BackgroundCallback;`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetACLBuilderImpl.java`
#### Snippet
```java
import org.apache.curator.drivers.OperationTrace;
import org.apache.curator.framework.api.*;
import org.apache.curator.framework.api.BackgroundCallback;
import org.apache.curator.framework.api.CuratorEventType;
import org.apache.curator.framework.api.CuratorEvent;
```

### UNUSED_IMPORT
Unused import `import org.apache.curator.framework.api.CuratorEventType;`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetACLBuilderImpl.java`
#### Snippet
```java
import org.apache.curator.framework.api.*;
import org.apache.curator.framework.api.BackgroundCallback;
import org.apache.curator.framework.api.CuratorEventType;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.framework.api.SetACLBuilder;
```

### UNUSED_IMPORT
Unused import `import org.apache.curator.framework.api.CuratorEvent;`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetACLBuilderImpl.java`
#### Snippet
```java
import org.apache.curator.framework.api.BackgroundCallback;
import org.apache.curator.framework.api.CuratorEventType;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.framework.api.SetACLBuilder;
import org.apache.zookeeper.AsyncCallback;
```

### UNUSED_IMPORT
Unused import `import org.apache.curator.framework.api.SetACLBuilder;`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetACLBuilderImpl.java`
#### Snippet
```java
import org.apache.curator.framework.api.CuratorEventType;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.framework.api.SetACLBuilder;
import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.data.ACL;
```

### UNUSED_IMPORT
Unused import `import org.apache.zookeeper.ZooDefs;`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.Op;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.data.Stat;
import java.util.Arrays;
```

### UNUSED_IMPORT
Unused import `import org.apache.zookeeper.Watcher;`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/WatcherRemovalFacade.java`
#### Snippet
```java
import org.apache.curator.framework.state.ConnectionStateListener;
import org.apache.curator.utils.EnsurePath;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.server.quorum.flexible.QuorumVerifier;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.atomic.AtomicBoolean;`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentNode.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
```

### UNUSED_IMPORT
Unused import `import org.apache.zookeeper.server.quorum.QuorumPeerConfig;`
in `curator-test/src/main/java/org/apache/curator/test/TestingZooKeeperServer.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicReference;

import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

### UNUSED_IMPORT
Unused import `import org.apache.curator.x.discovery.ServiceType;`
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/DiscoveryResource.java`
#### Snippet
```java
import org.apache.curator.utils.ThreadUtils;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.ServiceType;
import org.apache.curator.x.discovery.details.InstanceProvider;
import org.apache.curator.x.discovery.server.entity.ServiceInstances;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreakingConnectionStateListener.java`
#### Snippet
```java
            {
                log.info("Circuit is opening. State: {} post-retryCount: {}", newState, circuitBreaker.getRetryCount());
                circuitLastState = circuitInitialState = newState;
                circuitLostHasBeenSent = (newState == ConnectionState.LOST);
            }
```

### NestedAssignment
Result of assignment expression used
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreakingConnectionStateListener.java`
#### Snippet
```java
            log.debug("Circuit is open. State changed to LOST. Sending to listener.");
            circuitLostHasBeenSent = true;
            circuitLastState = circuitInitialState = ConnectionState.LOST;
            callListener(ConnectionState.LOST);
        }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
            e.printStackTrace();
        });
        client.getConnectionStateListenable().addListener((c, newState) -> {
            System.out.println("state=" + newState);
        });
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `servers` are queried, but never updated
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        printHelp();

        List<ExampleServer> servers = Lists.newArrayList();
        try
        {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `client` is accessed in both synchronized and unsynchronized contexts
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTempFrameworkImpl.java`
#### Snippet
```java

    // guarded by sync
    private CuratorFrameworkImpl                    client;

    // guarded by sync
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isSet` is accessed in both synchronized and unsynchronized contexts
in `curator-client/src/main/java/org/apache/curator/utils/EnsurePath.java`
#### Snippet
```java
    private class InitialHelper implements Helper
    {
        private boolean isSet = false;  // guarded by synchronization

        @Override
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `curator-test/src/main/java/org/apache/curator/test/ZooKeeperServerEmbeddedAdapter.java`
#### Snippet
```java
        try {
            final Properties properties = configBuilder.buildProperties();
            properties.put("admin.enableServer", "false");

            final Path dataDir = Paths.get(properties.getProperty("dataDir"));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `curator-test/src/main/java/org/apache/curator/test/QuorumConfigBuilder.java`
#### Snippet
```java
        Map<String,Object> customProperties = spec.getCustomProperties();
        if (customProperties != null) {
            properties.putAll(customProperties);
        }

```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void         start() throws Exception;

    /**
```

### EmptyMethod
All implementations of this method are empty
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     */
    @Deprecated
    public void clearWatcherReferences(Watcher watcher);

    /**
```

### EmptyMethod
Method only calls its super
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessReadWriteLock.java`
#### Snippet
```java

        @Override
        protected String getLockPath()
        {
            return super.getLockPath();
```

### EmptyMethod
All implementations of this method are empty
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueuePutListener.java`
#### Snippet
```java
     * @param items the items
     */
    public void         putMultiCompleted(MultiItem<T> items);
}

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-client/src/main/java/org/apache/curator/Helper.java`
#### Snippet
```java
    static class Data
    {
        volatile ZooKeeper zooKeeperHandle = null;
        volatile String connectionString = null;
    }
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-client/src/main/java/org/apache/curator/Helper.java`
#### Snippet
```java
    {
        volatile ZooKeeper zooKeeperHandle = null;
        volatile String connectionString = null;
    }

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-client/src/main/java/org/apache/curator/RetryLoopImpl.java`
#### Snippet
```java
{
    private boolean isDone = false;
    private int retryCount = 0;

    private final Logger log = LoggerFactory.getLogger(getClass());
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-client/src/main/java/org/apache/curator/RetryLoopImpl.java`
#### Snippet
```java
class RetryLoopImpl extends RetryLoop
{
    private boolean isDone = false;
    private int retryCount = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-client/src/main/java/org/apache/curator/utils/ExceptionAccumulator.java`
#### Snippet
```java
public class ExceptionAccumulator
{
    private volatile Throwable mainEx = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-client/src/main/java/org/apache/curator/ConnectionState.java`
#### Snippet
```java
    private final Queue<Watcher> parentWatchers = new ConcurrentLinkedQueue<Watcher>();
    private final AtomicLong instanceIndex = new AtomicLong();
    private volatile long connectionStartMs = 0;

    ConnectionState(ZookeeperFactory zookeeperFactory, EnsembleProvider ensembleProvider, int sessionTimeoutMs, Watcher parentWatcher, AtomicReference<TracerDriver> tracer, boolean canBeReadOnly)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        private int maxCloseWaitMs = DEFAULT_CLOSE_WAIT_MS;
        private RetryPolicy retryPolicy;
        private ThreadFactory threadFactory = null;
        private String namespace;
        private List<AuthInfo> authInfos = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        private ZookeeperFactory zookeeperFactory = DEFAULT_ZOOKEEPER_FACTORY;
        private ACLProvider aclProvider = DEFAULT_ACL_PROVIDER;
        private boolean canBeReadOnly = false;
        private boolean useContainerParentsIfAvailable = true;
        private ConnectionStateErrorPolicy connectionStateErrorPolicy = new StandardConnectionStateErrorPolicy();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        private ThreadFactory threadFactory = null;
        private String namespace;
        private List<AuthInfo> authInfos = null;
        private byte[] defaultData = LOCAL_ADDRESS;
        private CompressionProvider compressionProvider = DEFAULT_COMPRESSION_PROVIDER;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        private SchemaSet schemaSet = SchemaSet.getDefaultSchemaSet();
        private int waitForShutdownTimeoutMs = 0;
        private Executor runSafeService = null;
        private ConnectionStateListenerManagerFactory connectionStateListenerManagerFactory = ConnectionStateListenerManagerFactory.standard;
        private int simulatedSessionExpirationPercent = 100;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        private ConnectionStateErrorPolicy connectionStateErrorPolicy = new StandardConnectionStateErrorPolicy();
        private SchemaSet schemaSet = SchemaSet.getDefaultSchemaSet();
        private int waitForShutdownTimeoutMs = 0;
        private Executor runSafeService = null;
        private ConnectionStateListenerManagerFactory connectionStateListenerManagerFactory = ConnectionStateListenerManagerFactory.standard;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/ProtectedMode.java`
#### Snippet
```java
    private final Logger log = LoggerFactory.getLogger(getClass());
    private volatile String protectedId = null;
    private volatile long sessionId = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/ProtectedMode.java`
#### Snippet
```java
{
    private final Logger log = LoggerFactory.getLogger(getClass());
    private volatile String protectedId = null;
    private volatile long sessionId = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/FailedOperationManager.java`
#### Snippet
```java
    
    @VisibleForTesting
    volatile FailedOperationManagerListener<T> debugListener = null;
    
    interface FailedOperationManagerListener<T>
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
    volatile DebugBackgroundListener debugListener = null;
    @VisibleForTesting
    public volatile UnhandledErrorListener debugUnhandledErrorListener = null;

    private final AtomicReference<CuratorFrameworkState> state;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
    }

    volatile DebugBackgroundListener debugListener = null;
    @VisibleForTesting
    public volatile UnhandledErrorListener debugUnhandledErrorListener = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/DeleteBuilderImpl.java`
#### Snippet
```java

    @VisibleForTesting
    boolean failNextDeleteForTesting = false;
    @VisibleForTesting
    boolean failBeforeNextDeleteForTesting = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/DeleteBuilderImpl.java`
#### Snippet
```java
    boolean failNextDeleteForTesting = false;
    @VisibleForTesting
    boolean failBeforeNextDeleteForTesting = false;

    DeleteBuilderImpl(CuratorFrameworkImpl client)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
    boolean failNextSetForTesting = false;
    @VisibleForTesting
    boolean failBeforeNextSetForTesting = false;
    @VisibleForTesting
    boolean failNextIdempotentCheckForTesting = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
    boolean failBeforeNextSetForTesting = false;
    @VisibleForTesting
    boolean failNextIdempotentCheckForTesting = false;

    SetDataBuilderImpl(CuratorFrameworkImpl client)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java

    @VisibleForTesting
    boolean failNextSetForTesting = false;
    @VisibleForTesting
    boolean failBeforeNextSetForTesting = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
    private int                             version;
    private boolean                         compress;
    private boolean                         idempotent = false;

    @VisibleForTesting
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTransactionImpl.java`
#### Snippet
```java
    private final CuratorMultiTransactionRecord transaction;

    private boolean isCommitted = false;

    CuratorTransactionImpl(CuratorFrameworkImpl client)
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreaker.java`
#### Snippet
```java

    private boolean isOpen = false;
    private int retryCount = 0;
    private long startNanos = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreaker.java`
#### Snippet
```java
    private final ScheduledExecutorService service;

    private boolean isOpen = false;
    private int retryCount = 0;
    private long startNanos = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreaker.java`
#### Snippet
```java
    private boolean isOpen = false;
    private int retryCount = 0;
    private long startNanos = 0;

    static CircuitBreaker build(RetryPolicy retryPolicy)
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateManager.java`
#### Snippet
```java
    private ConnectionState currentConnectionState;

    private volatile long startOfSuspendedEpoch = 0;

    private volatile long lastExpiredInstanceIndex = -1;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncGetDataBuilderImpl.java`
#### Snippet
```java
    private final Filters filters;
    private final WatchMode watchMode;
    private boolean decompressed = false;
    private Stat stat = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncGetDataBuilderImpl.java`
#### Snippet
```java
    private final WatchMode watchMode;
    private boolean decompressed = false;
    private Stat stat = null;

    AsyncGetDataBuilderImpl(CuratorFrameworkImpl client, Filters filters, WatchMode watchMode)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncGetChildrenBuilderImpl.java`
#### Snippet
```java
    private final Filters filters;
    private final WatchMode watchMode;
    private Stat stat = null;

    AsyncGetChildrenBuilderImpl(CuratorFrameworkImpl client, Filters filters, WatchMode watchMode)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncGetConfigBuilderImpl.java`
#### Snippet
```java
    private final Filters filters;
    private final WatchMode watchMode;
    private Stat stat = null;

    AsyncGetConfigBuilderImpl(CuratorFrameworkImpl client, Filters filters, WatchMode watchMode)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncSetDataBuilderImpl.java`
#### Snippet
```java
    private final CuratorFrameworkImpl client;
    private final Filters filters;
    private boolean compressed = false;
    private int version = -1;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-client/src/main/java/org/apache/curator/utils/EnsurePath.java`
#### Snippet
```java
    private class InitialHelper implements Helper
    {
        private boolean isSet = false;  // guarded by synchronization

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncRemoveWatchesBuilderImpl.java`
#### Snippet
```java
    private Watcher.WatcherType watcherType = Watcher.WatcherType.Any;
    private Set<RemoveWatcherOption> options = Collections.emptySet();
    private Watcher watcher = null;
    private CuratorWatcher curatorWatcher = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncRemoveWatchesBuilderImpl.java`
#### Snippet
```java
    private Set<RemoveWatcherOption> options = Collections.emptySet();
    private Watcher watcher = null;
    private CuratorWatcher curatorWatcher = null;

    AsyncRemoveWatchesBuilderImpl(CuratorFrameworkImpl client, Filters filters)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncSetACLBuilderImpl.java`
#### Snippet
```java
    private final Filters filters;
    private int version = -1;
    private List<ACL> aclList = null;

    AsyncSetACLBuilderImpl(CuratorFrameworkImpl client, Filters filters)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncTransactionOpImpl.java`
#### Snippet
```java
        return new AsyncTransactionCreateBuilder()
        {
            private List<ACL> aclList = null;
            private CreateMode createMode = CreateMode.PERSISTENT;
            private boolean compressed = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncTransactionOpImpl.java`
#### Snippet
```java
        {
            private int version = -1;
            private boolean compressed = false;

            @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncTransactionOpImpl.java`
#### Snippet
```java
            private List<ACL> aclList = null;
            private CreateMode createMode = CreateMode.PERSISTENT;
            private boolean compressed = false;
            private long ttl = -1;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncCuratorFrameworkImpl.java`
#### Snippet
```java
        return new AsyncGetACLBuilder()
        {
            private Stat stat = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncCreateBuilderImpl.java`
#### Snippet
```java
    private final Filters filters;
    private CreateMode createMode = CreateMode.PERSISTENT;
    private List<ACL> aclList = null;
    private Set<CreateOption> options = Collections.emptySet();
    private Stat stat = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncCreateBuilderImpl.java`
#### Snippet
```java
    private List<ACL> aclList = null;
    private Set<CreateOption> options = Collections.emptySet();
    private Stat stat = null;
    private long ttl = -1;
    private int setDataVersion = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncReconfigBuilderImpl.java`
#### Snippet
```java
    private Stat stat = null;
    private long fromConfig = -1;
    private List<String> newMembers = null;
    private List<String> joining = null;
    private List<String> leaving = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncReconfigBuilderImpl.java`
#### Snippet
```java
    private List<String> newMembers = null;
    private List<String> joining = null;
    private List<String> leaving = null;

    AsyncReconfigBuilderImpl(CuratorFrameworkImpl client, Filters filters)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncReconfigBuilderImpl.java`
#### Snippet
```java
    private final CuratorFrameworkImpl client;
    private final Filters filters;
    private Stat stat = null;
    private long fromConfig = -1;
    private List<String> newMembers = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncReconfigBuilderImpl.java`
#### Snippet
```java
    private long fromConfig = -1;
    private List<String> newMembers = null;
    private List<String> joining = null;
    private List<String> leaving = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/ModeledCacheListener.java`
#### Snippet
```java
        return new ModeledCacheListener<T>()
        {
            private volatile boolean isInitialized = false;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModelSpecImpl.java`
#### Snippet
```java
    private final Set<DeleteOption> deleteOptions;
    private final long ttl;
    private volatile Schema schema = null;

    public ModelSpecImpl(ZPath path, ModelSerializer<T> serializer, CreateMode createMode, List<ACL> aclList, Set<CreateOption> createOptions, Set<DeleteOption> deleteOptions, long ttl)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscoveryBuilder.java`
#### Snippet
```java
    private ServiceInstance<T> thisInstance;
    private Class<T> payloadClass;
    private boolean watchInstances = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/Latch.java`
#### Snippet
```java
class Latch
{
    private volatile boolean        laden = false;

    synchronized void        set()
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/migrations/MigrationManager.java`
#### Snippet
```java

    @VisibleForTesting
    volatile AtomicInteger debugCount = null;

    private CompletionStage<Void> applyMetaDataAfterEnsure(List<Migration> toBeApplied, String thisMetaDataPath)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceCacheImpl.java`
#### Snippet
```java
    @VisibleForTesting
    volatile CountDownLatch debugStartLatch = null;
    volatile CountDownLatch debugStartWaitLatch = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceCacheImpl.java`
#### Snippet
```java

    @VisibleForTesting
    volatile CountDownLatch debugStartLatch = null;
    volatile CountDownLatch debugStartWaitLatch = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ZPathImpl.java`
#### Snippet
```java
    private final boolean isResolved;
    private volatile String fullPath = null;
    private volatile ZPath parent = null;
    private volatile Pattern schema = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ZPathImpl.java`
#### Snippet
```java
    private final List<String> nodes;
    private final boolean isResolved;
    private volatile String fullPath = null;
    private volatile ZPath parent = null;
    private volatile Pattern schema = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ZPathImpl.java`
#### Snippet
```java
    private volatile String fullPath = null;
    private volatile ZPath parent = null;
    private volatile Pattern schema = null;

    public static ZPath parse(String fullPath, UnaryOperator<String> nameFilter)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheBridgeBuilderImpl.java`
#### Snippet
```java
    private CuratorCache.Options[] options;
    private boolean cacheData = true;
    private ExecutorService executorService = null;
    private final boolean forceTreeCache = Boolean.getBoolean("curator-cache-bridge-force-tree-cache");

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilderImpl.java`
#### Snippet
```java
{
    private final List<CuratorCacheListener> listeners = new ArrayList<>();
    private boolean afterInitializedOnly = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
        private int maxDepth = Integer.MAX_VALUE;
        private boolean createParentNodes = false;
        private boolean disableZkWatches = false;
        private TreeCacheSelector selector = new DefaultTreeCacheSelector();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
        private boolean cacheData = true;
        private boolean dataIsCompressed = false;
        private ExecutorService executorService = null;
        private int maxDepth = Integer.MAX_VALUE;
        private boolean createParentNodes = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
        private ExecutorService executorService = null;
        private int maxDepth = Integer.MAX_VALUE;
        private boolean createParentNodes = false;
        private boolean disableZkWatches = false;
        private TreeCacheSelector selector = new DefaultTreeCacheSelector();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
        private final String path;
        private boolean cacheData = true;
        private boolean dataIsCompressed = false;
        private ExecutorService executorService = null;
        private int maxDepth = Integer.MAX_VALUE;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
    }

    static volatile CountDownLatch debugAcquireLatch = null;
    static volatile CountDownLatch debugFailedGetChildrenLatch = null;
    volatile CountDownLatch debugWaitLatch = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java

    static volatile CountDownLatch debugAcquireLatch = null;
    static volatile CountDownLatch debugFailedGetChildrenLatch = null;
    volatile CountDownLatch debugWaitLatch = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
    static volatile CountDownLatch debugAcquireLatch = null;
    static volatile CountDownLatch debugFailedGetChildrenLatch = null;
    volatile CountDownLatch debugWaitLatch = null;

    private InternalAcquireResult internalAcquire1Lease(ImmutableList.Builder<Lease> builder, long startMs, boolean hasWait, long waitMs) throws Exception
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentNode.java`
#### Snippet
```java

    @VisibleForTesting
    volatile CountDownLatch debugCreateNodeLatch = null;

    private enum State
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/MutableAtomicValue.java`
#### Snippet
```java
    T preValue;
    T postValue;
    boolean succeeded = false;
    AtomicStats stats = new AtomicStats();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/CachedAtomicInteger.java`
#### Snippet
```java
    private final int                       cacheFactor;

    private AtomicValue<Integer>       currentValue = null;
    private int                        currentIndex = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/CachedAtomicInteger.java`
#### Snippet
```java

    private AtomicValue<Integer>       currentValue = null;
    private int                        currentIndex = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/AtomicStats.java`
#### Snippet
```java
{
    private int     optimisticTries = 0;
    private int     promotedLockTries = 0;
    private long    optimisticTimeMs = 0;
    private long    promotedTimeMs = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/AtomicStats.java`
#### Snippet
```java
    private int     promotedLockTries = 0;
    private long    optimisticTimeMs = 0;
    private long    promotedTimeMs = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/AtomicStats.java`
#### Snippet
```java
    private int     optimisticTries = 0;
    private int     promotedLockTries = 0;
    private long    optimisticTimeMs = 0;
    private long    promotedTimeMs = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/AtomicStats.java`
#### Snippet
```java
public class AtomicStats
{
    private int     optimisticTries = 0;
    private int     promotedLockTries = 0;
    private long    optimisticTimeMs = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/CachedAtomicLong.java`
#### Snippet
```java

    private AtomicValue<Long>          currentValue = null;
    private int                        currentIndex = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/CachedAtomicLong.java`
#### Snippet
```java
    private final long                  cacheFactor;

    private AtomicValue<Long>          currentValue = null;
    private int                        currentIndex = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java

    @VisibleForTesting
    volatile CountDownLatch debugCheckLeaderShipLatch = null;

    private void checkLeadership(List<String> children) throws Exception
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java

    @VisibleForTesting
    volatile CountDownLatch debugResetWaitBeforeNodeDeleteLatch = null;

    @VisibleForTesting
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java

    @VisibleForTesting
    volatile CountDownLatch debugResetWaitLatch = null;

    @VisibleForTesting
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
    @VisibleForTesting
    volatile CountDownLatch debugLeadershipLatch = null;
    volatile CountDownLatch debugLeadershipWaitLatch = null;

    private enum State
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
        {
            private volatile boolean isShutdown = false;
            private volatile boolean isTerminated = false;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
    // guarded by synchronization
    private Future<?> ourTask = null;
    private Thread ourThread = null;

    private volatile boolean hasLeadership;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java

    @VisibleForTesting
    volatile AtomicInteger failedMutexReleaseCount = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
        return new AbstractExecutorService()
        {
            private volatile boolean isShutdown = false;
            private volatile boolean isTerminated = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java

    // guarded by synchronization
    private Future<?> ourTask = null;
    private Thread ourThread = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java

    @VisibleForTesting
    volatile CountDownLatch debugLeadershipLatch = null;
    volatile CountDownLatch debugLeadershipWaitLatch = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-test/src/main/java/org/apache/curator/test/ExecuteCalledWatchingExecutorService.java`
#### Snippet
```java
public class ExecuteCalledWatchingExecutorService extends DelegatingExecutorService
{
    boolean executeCalled = false;

    public ExecuteCalledWatchingExecutorService(ExecutorService delegate)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
    boolean failNextCreateForTesting = false;
    @VisibleForTesting
    boolean failBeforeNextCreateForTesting = false;
    @VisibleForTesting
    boolean failNextIdempotentCheckForTesting = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
    private boolean setDataIfExists;
    private int setDataIfExistsVersion = -1;
    private boolean idempotent = false;
    private ACLing acling;
    private Stat storingStat;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java

    @VisibleForTesting
    boolean failNextCreateForTesting = false;
    @VisibleForTesting
    boolean failBeforeNextCreateForTesting = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
    boolean failBeforeNextCreateForTesting = false;
    @VisibleForTesting
    boolean failNextIdempotentCheckForTesting = false;

    CreateBuilderImpl(CuratorFrameworkImpl client)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java

    @VisibleForTesting
    volatile boolean debugForceFindProtectedNode = false;

    private void pathInBackground(final String path, final byte[] data, final String givenPath)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `curator-test/src/main/java/org/apache/curator/test/TestingQuorumPeerMain.java`
#### Snippet
```java
{
    private static final Logger log = LoggerFactory.getLogger(TestingQuorumPeerMain.class);
    private volatile boolean isClosed = false;

    @Override
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `BackgroundPathAndBytesable`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeACLable.java`
#### Snippet
```java

public interface CreateBackgroundModeACLable extends
    BackgroundPathAndBytesable<String>,
    CreateModable<ACLBackgroundPathAndBytesable<String>>,
    ACLCreateModeBackgroundPathAndBytesable<String>
```

### RedundantImplements
Redundant interface declaration `BackgroundPathAndBytesable`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java

public interface CreateBuilderMain extends
    BackgroundPathAndBytesable<String>,
    CreateModable<ACLBackgroundPathAndBytesable<String>>,
    ACLCreateModeBackgroundPathAndBytesable<String>,
```

### RedundantImplements
Redundant interface declaration `CreateModable`>
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeACLable.java`
#### Snippet
```java
public interface CreateBackgroundModeACLable extends
    BackgroundPathAndBytesable<String>,
    CreateModable<ACLBackgroundPathAndBytesable<String>>,
    ACLCreateModeBackgroundPathAndBytesable<String>
{
```

### RedundantImplements
Redundant interface declaration `CreateModable`>
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java
public interface CreateBuilderMain extends
    BackgroundPathAndBytesable<String>,
    CreateModable<ACLBackgroundPathAndBytesable<String>>,
    ACLCreateModeBackgroundPathAndBytesable<String>,
    Compressible<CreateBackgroundModeStatACLable>,
```

### RedundantImplements
Redundant interface declaration `BackgroundPathAndBytesable`
in `curator-framework/src/main/java/org/apache/curator/framework/api/ACLCreateModeBackgroundPathAndBytesable.java`
#### Snippet
```java
public interface ACLCreateModeBackgroundPathAndBytesable<T> extends
    ACLBackgroundPathAndBytesable<T>,
    BackgroundPathAndBytesable<T>,
    CreateModable<ACLBackgroundPathAndBytesable<T>>
{
```

### RedundantImplements
Redundant interface declaration `Pathable`
in `curator-framework/src/main/java/org/apache/curator/framework/api/TempGetDataBuilder.java`
#### Snippet
```java
    StatPathable<byte[]>,
    Decompressible<StatPathable<byte[]>>,
    Pathable<byte[]>
{
}
```

### RedundantImplements
Redundant interface declaration `BackgroundPathAndBytesable`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeStatACLable.java`
#### Snippet
```java

public interface CreateBackgroundModeStatACLable extends
    BackgroundPathAndBytesable<String>,
    CreateModable<ACLBackgroundPathAndBytesable<String>>,
    ACLCreateModeBackgroundPathAndBytesable<String>,
```

### RedundantImplements
Redundant interface declaration `CreateModable`>
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeStatACLable.java`
#### Snippet
```java
public interface CreateBackgroundModeStatACLable extends
    BackgroundPathAndBytesable<String>,
    CreateModable<ACLBackgroundPathAndBytesable<String>>,
    ACLCreateModeBackgroundPathAndBytesable<String>,
    Statable<CreateBackgroundModeACLable>
```

### RedundantImplements
Redundant interface declaration `PathAndBytesable`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/TransactionSetDataBuilder.java`
#### Snippet
```java

public interface TransactionSetDataBuilder<T> extends
    PathAndBytesable<T>,
    Versionable<PathAndBytesable<T>>,
    VersionPathAndBytesable<T>,
```

### RedundantImplements
Redundant interface declaration `Versionable`>
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/TransactionSetDataBuilder.java`
#### Snippet
```java
public interface TransactionSetDataBuilder<T> extends
    PathAndBytesable<T>,
    Versionable<PathAndBytesable<T>>,
    VersionPathAndBytesable<T>,
    Compressible<VersionPathAndBytesable<T>>
```

### RedundantImplements
Redundant interface declaration `PathAndBytesable`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/TransactionCreateBuilder2.java`
#### Snippet
```java

public interface TransactionCreateBuilder2<T> extends
    PathAndBytesable<T>,
    CreateModable<ACLPathAndBytesable<T>>,
    ACLPathAndBytesable<T>,
```

### RedundantImplements
Redundant interface declaration `CreateModable`>
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/TransactionCreateBuilder2.java`
#### Snippet
```java
public interface TransactionCreateBuilder2<T> extends
    PathAndBytesable<T>,
    CreateModable<ACLPathAndBytesable<T>>,
    ACLPathAndBytesable<T>,
    ACLCreateModePathAndBytesable<T>,
```

### RedundantImplements
Redundant interface declaration `ACLPathAndBytesable`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/TransactionCreateBuilder2.java`
#### Snippet
```java
    PathAndBytesable<T>,
    CreateModable<ACLPathAndBytesable<T>>,
    ACLPathAndBytesable<T>,
    ACLCreateModePathAndBytesable<T>,
    Compressible<ACLCreateModePathAndBytesable<T>>
```

### RedundantImplements
Redundant interface declaration `RemoveWatchesLocal`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/RemoveWatchesBuilderImpl.java`
#### Snippet
```java


public class RemoveWatchesBuilderImpl implements RemoveWatchesBuilder, RemoveWatchesType, RemoveWatchesLocal, BackgroundOperation<String>, ErrorListenerPathable<Void>
{
    private CuratorFrameworkImpl client;
```

### RedundantImplements
Redundant interface declaration `Pathable`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/AddWatchBuilderImpl.java`
#### Snippet
```java
import java.util.concurrent.Executor;

public class AddWatchBuilderImpl implements AddWatchBuilder, Pathable<Void>, BackgroundOperation<String>
{
    private final CuratorFrameworkImpl client;
```

### RedundantImplements
Redundant interface declaration `CuratorTransaction`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTransactionImpl.java`
#### Snippet
```java

@SuppressWarnings("deprecation")
class CuratorTransactionImpl implements CuratorTransaction, CuratorTransactionBridge, CuratorTransactionFinal
{
    private final CuratorFrameworkImpl client;
```

### RedundantImplements
Redundant interface declaration `CuratorMultiTransactionMain`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorMultiTransactionImpl.java`
#### Snippet
```java
public class CuratorMultiTransactionImpl implements
    CuratorMultiTransaction,
    CuratorMultiTransactionMain,
    BackgroundOperation<CuratorMultiTransactionRecord>,
    ErrorListenerMultiTransactionMain
```

### RedundantImplements
Redundant interface declaration `WatchableBase`>>
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncWatchBuilderImpl.java`
#### Snippet
```java
import static org.apache.curator.x.async.details.BackgroundProcs.safeCall;

class AsyncWatchBuilderImpl implements AsyncWatchBuilder, AsyncWatchBuilder2, WatchableBase<AsyncPathable<AsyncStage<Void>>>, AsyncPathable<AsyncStage<Void>>
{
    private final CuratorFrameworkImpl client;
```

### RedundantImplements
Redundant interface declaration `AsyncPathable`>
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncWatchBuilderImpl.java`
#### Snippet
```java
import static org.apache.curator.x.async.details.BackgroundProcs.safeCall;

class AsyncWatchBuilderImpl implements AsyncWatchBuilder, AsyncWatchBuilder2, WatchableBase<AsyncPathable<AsyncStage<Void>>>, AsyncPathable<AsyncStage<Void>>
{
    private final CuratorFrameworkImpl client;
```

### RedundantImplements
Redundant interface declaration `ContextResolver`>>
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/contexts/MapDiscoveryContext.java`
#### Snippet
```java
 */
@Provider
public class MapDiscoveryContext extends GenericDiscoveryContext<Map<String, String>> implements ContextResolver<DiscoveryContext<Map<String, String>>>
{
    public MapDiscoveryContext(ServiceDiscovery<Map<String, String>> serviceDiscovery, ProviderStrategy<Map<String, String>> providerStrategy, int instanceRefreshMs)
```

### RedundantImplements
Redundant interface declaration `CuratorCache`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheImpl.java`
#### Snippet
```java
import static org.apache.zookeeper.KeeperException.Code.OK;

class CuratorCacheImpl implements CuratorCache, CuratorCacheBridge
{
    private final Logger log = LoggerFactory.getLogger(getClass());
```

### RedundantImplements
Redundant interface declaration `Closeable`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedPriorityQueue.java`
#### Snippet
```java
 * item is added to/removed from the queue, every watcher must re-get all the nodes</p>
 */
public class DistributedPriorityQueue<T> implements Closeable, QueueBase<T>
{
    private final DistributedQueue<T>      queue;
```

### RedundantImplements
Redundant interface declaration `Closeable`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedDelayQueue.java`
#### Snippet
```java
 * </p>
 */
public class DistributedDelayQueue<T> implements Closeable, QueueBase<T>
{
    private final DistributedQueue<T>      queue;
```

### RedundantImplements
Redundant interface declaration `Listenable`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedCount.java`
#### Snippet
```java
 * value of the shared integer (considering ZK's normal consistency guarantees).
 */
public class SharedCount implements Closeable, SharedCountReader, Listenable<SharedCountListener>
{
    private final Map<SharedCountListener, SharedValueListener> listeners = Maps.newConcurrentMap();
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-14-18-31-18.604.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `SchemaViolation` does not end with 'Exception'
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaViolation.java`
#### Snippet
```java
 * Thrown by the various <code>validation</code> methods in a Schema
 */
public class SchemaViolation extends RuntimeException
{
    private final Schema schema;
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/RemoveWatchesBuilderImpl.java`
#### Snippet
```java
                                    throw e;
                                }
                                else if (e instanceof KeeperException.NoWatcherException && quietly)
                                {
                                    // ignore
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/Backgrounding.java`
#### Snippet
```java
                                {
                                    ThreadUtils.checkInterrupted(e);
                                    if ( e instanceof KeeperException )
                                    {
                                        client.validateConnection(client.codeToState(((KeeperException)e).code()));
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/DeleteBuilderImpl.java`
#### Snippet
```java
            ThreadUtils.checkInterrupted(e);
            //Only retry a guaranteed delete if it's a retryable error
            if ( (client.getZookeeperClient().getRetryPolicy().allowRetry(e) || (e instanceof InterruptedException)) && guaranteed )
            {
                client.getFailedDeleteManager().addFailedOperation(unfixedPath);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
        {
            ThreadUtils.checkInterrupted(e);
            if ( ( e instanceof KeeperException.ConnectionLossException ||
                !( e instanceof KeeperException )) && protectedMode.doProtected() )
            {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
            ThreadUtils.checkInterrupted(e);
            if ( ( e instanceof KeeperException.ConnectionLossException ||
                !( e instanceof KeeperException )) && protectedMode.doProtected() )
            {
                /*
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `curator-examples/src/main/java/cache/CuratorCacheExample.java`
#### Snippet
```java
                    // or for all events. Here, we'll use the builder to log individual cache actions
                    CuratorCacheListener listener = CuratorCacheListener.builder()
                        .forCreates(node -> System.out.println(String.format("Node created: [%s]", node)))
                        .forChanges((oldNode, node) -> System.out.println(String.format("Node changed. Old: [%s] New: [%s]", oldNode, node)))
                        .forDeletes(oldNode -> System.out.println(String.format("Node deleted. Old value: [%s]", oldNode)))
```

### RedundantStringFormatCall
Redundant call to `format()`
in `curator-examples/src/main/java/cache/CuratorCacheExample.java`
#### Snippet
```java
                    CuratorCacheListener listener = CuratorCacheListener.builder()
                        .forCreates(node -> System.out.println(String.format("Node created: [%s]", node)))
                        .forChanges((oldNode, node) -> System.out.println(String.format("Node changed. Old: [%s] New: [%s]", oldNode, node)))
                        .forDeletes(oldNode -> System.out.println(String.format("Node deleted. Old value: [%s]", oldNode)))
                        .forInitialized(() -> System.out.println("Cache initialized"))
```

### RedundantStringFormatCall
Redundant call to `format()`
in `curator-examples/src/main/java/cache/CuratorCacheExample.java`
#### Snippet
```java
                        .forCreates(node -> System.out.println(String.format("Node created: [%s]", node)))
                        .forChanges((oldNode, node) -> System.out.println(String.format("Node changed. Old: [%s] New: [%s]", oldNode, node)))
                        .forDeletes(oldNode -> System.out.println(String.format("Node deleted. Old value: [%s]", oldNode)))
                        .forInitialized(() -> System.out.println("Cache initialized"))
                        .build();
```

### RedundantStringFormatCall
Redundant call to `format()`
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
    private <T> ModeledCacheListener<T> generalListener()
    {
        return (type, path, stat, model) -> System.out.println(String.format("Subscribed %s @ %s", model.getClass().getSimpleName(), path));
    }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
                    .mapToObj(__ -> new Instance(nextId(), random(InstanceType.values()), random(hostnames), random(ports)))
                    .collect(Collectors.toList());
                System.out.println(String.format("Publishing %d instances", instances.size()));
                publisher.publishInstances(instances);
                break;
```

### RedundantStringFormatCall
Redundant call to `format()`
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
                    .mapToObj(__ -> new LocationAvailable(nextId(), random(Priority.values()), random(locations), random(durations)))
                    .collect(Collectors.toList());
                System.out.println(String.format("Publishing %d locationsAvailable", locationsAvailable.size()));
                publisher.publishLocationsAvailable(random(groups), locationsAvailable);
                break;
```

### RedundantStringFormatCall
Redundant call to `format()`
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
                    .mapToObj(__ -> new UserCreated(nextId(), random(Priority.values()), random(locations), random(positions)))
                    .collect(Collectors.toList());
                System.out.println(String.format("Publishing %d usersCreated", usersCreated.size()));
                publisher.publishUsersCreated(random(groups), usersCreated);
                break;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
                        acl = ZooDefs.Ids.OPEN_ACL_UNSAFE;
                    }
                    zookeeper.create(subPath, new byte[0], acl, getCreateMode(asContainers));
                }
                catch ( KeeperException.NodeExistsException e )
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
            // ignore
        }
        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java

        byte[] builderDefaultData = builder.getDefaultData();
        defaultData = (builderDefaultData != null) ? Arrays.copyOf(builderDefaultData, builderDefaultData.length) : new byte[0];
        authInfos = buildAuths(builder);

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GzipCompressionProvider.java`
#### Snippet
```java
            // Allocating a new array instead of creating a static constant because clients may somehow depend on the
            // identity of the returned arrays
            return new byte[0];
        }
        ByteBuffer gzippedData = ByteBuffer.wrap(gzippedDataBytes);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `curator-framework/src/main/java/org/apache/curator/framework/imps/ReconfigBuilderImpl.java`
#### Snippet
```java
        {
            client.processBackgroundOperation(new OperationAndData<>(this, null, backgrounding.getCallback(), null, backgrounding.getContext(), null), null);
            return new byte[0];
        }
        else
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
        final long      startMillis = System.currentTimeMillis();
        final Long      millisToWait = (unit != null) ? unit.toMillis(time) : null;
        final byte[]    localLockNodeBytes = (revocable.get() != null) ? new byte[0] : lockNodeBytes;
        int             retryCount = 0;

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `curator-test/src/main/java/org/apache/curator/test/QuorumConfigBuilder.java`
#### Snippet
```java
    public QuorumConfigBuilder(Collection<InstanceSpec> specs)
    {
        this(specs.toArray(new InstanceSpec[0]));
    }

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-client/src/main/java/org/apache/curator/HandleHolder.java`
#### Snippet
```java
            ZooKeeper getZooKeeper() throws Exception
            {
                synchronized(this)
                {
                    if ( data.zooKeeperHandle == null )
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateManager.java`
#### Snippet
```java
        log.info("State change: " + state);

        notifyAll();

        while ( !eventQueue.offer(state) )
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateManager.java`
#### Snippet
```java
                else if ( sessionExpirationPercent > 0 )
                {
                    synchronized(this)
                    {
                        checkSessionExpiration();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateManager.java`
#### Snippet
```java
                }

                synchronized(this)
                {
                    if ( (currentConnectionState == ConnectionState.LOST) && client.getZookeeperClient().isConnected() )
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateManager.java`
#### Snippet
```java
                }

                wait(waitTime);
            }
            else
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateManager.java`
#### Snippet
```java
            else
            {
                wait();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/Latch.java`
#### Snippet
```java
        while ( !laden )
        {
            wait();
        }
        laden = false;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/Latch.java`
#### Snippet
```java
    {
        laden = true;
        notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
            try
            {
                synchronized(this)
                {
                    for(;;)
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
                                debugWaitLatch.countDown();
                            }
                            wait(thisWaitMs);
                        }
                        else
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
                                debugWaitLatch.countDown();
                            }
                            wait();
                        }
                    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
                    String  previousSequencePath = basePath + "/" + predicateResults.getPathToWatch();

                    synchronized(this)
                    {
                        try
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
                                }

                                wait(millisToWait);
                            }
                            else
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
                            else
                            {
                                wait();
                            }
                        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
    {
        this.maxLeases = maxLeases;
        notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/ChildrenCache.java`
#### Snippet
```java
    private synchronized void notifyFromCallback()
    {
        notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/ChildrenCache.java`
#### Snippet
```java
                    break;
                }
                wait(thisWaitMs);
            }
            else
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/ChildrenCache.java`
#### Snippet
```java
            else
            {
                wait();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedBarrier.java`
#### Snippet
```java
                    break;
                }
                wait(thisWaitMs);
            }
            else
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedBarrier.java`
#### Snippet
```java
            else
            {
                wait();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java
        }

        notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java
        long waitNanos = TimeUnit.NANOSECONDS.convert(timeout, unit);

        synchronized(this)
        {
            while ( true )
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java
    public void await() throws InterruptedException, EOFException
    {
        synchronized(this)
        {
            while ( (state.get() == State.STARTED) && !hasLeadership.get() )
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java
            while ( (state.get() == State.STARTED) && !hasLeadership.get() )
            {
                wait();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
                    else
                    {
                        wait(thisWaitMs);
                    }
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
                else
                {
                    wait();
                }
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
                else
                {
                    wait(thisWaitMs);
                }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
            else
            {
                wait();
            }
        } while ( false );
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
            connectionLost.set(event.getState() != Event.KeeperState.SyncConnected);
            client.runSafe(() -> {
                synchronized(DistributedDoubleBarrier.this) {
                    hasBeenNotified.set(true);
                    DistributedDoubleBarrier.this.notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
                synchronized(DistributedDoubleBarrier.this) {
                    hasBeenNotified.set(true);
                    DistributedDoubleBarrier.this.notifyAll();
                }
            });
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-test/src/main/java/org/apache/curator/test/TestingZooKeeperMain.java`
#### Snippet
```java
        public void noteStartup()
        {
            synchronized (this) {
                isRunning.set(true);
                this.notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `curator-test/src/main/java/org/apache/curator/test/TestingZooKeeperMain.java`
#### Snippet
```java
            synchronized (this) {
                isRunning.set(true);
                this.notifyAll();
            }
        }
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `curator-test/src/main/java/org/apache/curator/test/QuorumConfigBuilder.java`
#### Snippet
```java
    {
        Properties properties = buildConfigProperties(instanceIndex, instancePort);
        QuorumPeerConfig config = new QuorumPeerConfig()
        {
            {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `doCommit` initializer `false` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/Watching.java`
#### Snippet
```java
    void commitWatcher(int rc, boolean isExists)
    {
        boolean doCommit = false;
        if ( isExists )
        {
```

### UnusedAssignment
Variable `localResultStat` initializer `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
                    }

                    Stat localResultStat = null;
                    try
                    {
```

### UnusedAssignment
Variable `lease` initializer `null` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
        }

        Lease lease = null;
        boolean success = false;

```

### UnusedAssignment
Variable `succeeded` initializer `false` is redundant
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/MutableAtomicValue.java`
#### Snippet
```java
    T preValue;
    T postValue;
    boolean succeeded = false;
    AtomicStats stats = new AtomicStats();

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `c > '\u0000'` is always `true`
in `curator-client/src/main/java/org/apache/curator/utils/PathUtils.java`
#### Snippet
```java
                    break;
                }
            } else if (c > '\u0000' && c < '\u001f'
                    || c > '\u007f' && c < '\u009F'
                    || c > '\ud800' && c < '\uf8ff'
```

### ConstantValue
Condition is always false
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
            logError("Background exception was not retry-able or retry gave up", e);
        }
        while ( false );
    }

```

### ConstantValue
Condition is always false
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
            processEvent(event);
        }
        while ( false );

        if ( doQueueOperation )
```

### ConstantValue
Condition `children == null` is always `false`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
            }
            children = filterAndSortChildren(children);
            if ( (children == null) || (children.size() == 0) )
            {
                break;
```

### ConstantValue
Condition is always false
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
                wait();
            }
        } while ( false );

        return result;
```

## RuleId[id=IOResource]
### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/ItemSerializer.java`
#### Snippet
```java
    static<T> MultiItem<T>  deserialize(byte[] bytes, QueueSerializer<T> serializer) throws Exception
    {
        DataInputStream     in = new DataInputStream(new ByteArrayInputStream(bytes));
        int                 version = in.readInt();
        if ( version != VERSION )
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `servers` is always empty
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        finally
        {
            for ( ExampleServer server : servers )
            {
                CloseableUtils.closeQuietly(server);
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `PREFIX` may be 'static'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/SimpleDistributedQueue.java`
#### Snippet
```java
    private final EnsureContainers ensureContainers;

    private final String PREFIX = "qn-";

    /**
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Compatibility` has only 'static' members, and lacks a 'private' constructor
in `curator-client/src/main/java/org/apache/curator/utils/Compatibility.java`
#### Snippet
```java
 * Utils to help with ZK version compatibility
 */
public class Compatibility
{
    private static final Logger log = LoggerFactory.getLogger(Compatibility.class);
```

### UtilityClassWithoutPrivateConstructor
Class `CloseableUtils` has only 'static' members, and lacks a 'private' constructor
in `curator-client/src/main/java/org/apache/curator/utils/CloseableUtils.java`
#### Snippet
```java
 * This class adds back functionality that was removed in Guava v16.0.
 */
public class CloseableUtils
{
    private static final Logger log = LoggerFactory.getLogger(CloseableUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `PathUtils` has only 'static' members, and lacks a 'private' constructor
in `curator-client/src/main/java/org/apache/curator/utils/PathUtils.java`
#### Snippet
```java
 * A temporary workaround till the issue is resolved is to keep a copy of this class locally.
 */
public class PathUtils {

    /** validate the provided znode path string
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadUtils` has only 'static' members, and lacks a 'private' constructor
in `curator-client/src/main/java/org/apache/curator/utils/ThreadUtils.java`
#### Snippet
```java
import java.util.concurrent.ThreadFactory;

public class ThreadUtils
{
    private static final Logger log = LoggerFactory.getLogger(ThreadUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `IdempotentUtils` has only 'static' members, and lacks a 'private' constructor
in `curator-framework/src/main/java/org/apache/curator/framework/imps/IdempotentUtils.java`
#### Snippet
```java
 * Utilties Class for idempotent operations. 
 */
class IdempotentUtils
{

```

### UtilityClassWithoutPrivateConstructor
Class `BackgroundProcs` has only 'static' members, and lacks a 'private' constructor
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/BackgroundProcs.java`
#### Snippet
```java
import java.util.function.Function;

class BackgroundProcs
{
    static final BackgroundProc<String> nameProc = makeProc(CuratorEvent::getName);
```

### UtilityClassWithoutPrivateConstructor
Class `TreeCacheExample` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
import java.io.InputStreamReader;

public class TreeCacheExample
{
    public static void main(String[] args) throws Exception
```

### UtilityClassWithoutPrivateConstructor
Class `AsyncExamples` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
 * Examples using the asynchronous DSL
 */
public class AsyncExamples
{
    public static AsyncCuratorFramework wrap(CuratorFramework client)
```

### UtilityClassWithoutPrivateConstructor
Class `CuratorCacheExample` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/cache/CuratorCacheExample.java`
#### Snippet
```java
 * to standard out. A loop of random changes is run to exercise the cache.
 */
public class CuratorCacheExample
{
    private static final String PATH = "/example/cache";
```

### UtilityClassWithoutPrivateConstructor
Class `LeaderSelectorExample` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/leader/LeaderSelectorExample.java`
#### Snippet
```java
import java.util.List;

public class LeaderSelectorExample
{
    private static final int        CLIENT_QTY = 10;
```

### UtilityClassWithoutPrivateConstructor
Class `PathCacheExample` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
 * cache of these changes and outputs when updates occurs.
 */
public class PathCacheExample
{
    private static final String     PATH = "/example/cache";
```

### UtilityClassWithoutPrivateConstructor
Class `LockingExample` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/locking/LockingExample.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

public class LockingExample
{
    private static final int        QTY = 5;
```

### UtilityClassWithoutPrivateConstructor
Class `ModeledCuratorExamplesAlt` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/modeled/ModeledCuratorExamplesAlt.java`
#### Snippet
```java
import java.util.function.Consumer;

public class ModeledCuratorExamplesAlt
{
    public static void createOrUpdate(PersonModelSpec modelSpec, PersonModel model)
```

### UtilityClassWithoutPrivateConstructor
Class `ModeledCuratorExamples` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/modeled/ModeledCuratorExamples.java`
#### Snippet
```java
import java.util.function.Consumer;

public class ModeledCuratorExamples
{
    public static ModeledFramework<PersonModel> wrap(AsyncCuratorFramework client)
```

### UtilityClassWithoutPrivateConstructor
Class `CreateClientExamples` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/framework/CreateClientExamples.java`
#### Snippet
```java
import org.apache.curator.retry.ExponentialBackoffRetry;

public class CreateClientExamples
{
    public static CuratorFramework createSimple(String connectionString)
```

### UtilityClassWithoutPrivateConstructor
Class `TransactionExamples` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/framework/TransactionExamples.java`
#### Snippet
```java
import java.util.Collection;

public class TransactionExamples
{
    public static Collection<CuratorTransactionResult>      transaction(CuratorFramework client) throws Exception
```

### UtilityClassWithoutPrivateConstructor
Class `CrudExamples` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/framework/CrudExamples.java`
#### Snippet
```java
import java.util.List;

public class CrudExamples
{
    public static void      create(CuratorFramework client, String path, byte[] payload) throws Exception
```

### UtilityClassWithoutPrivateConstructor
Class `DiscoveryExample` has only 'static' members, and lacks a 'private' constructor
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
import java.util.Map;

public class DiscoveryExample
{
    private static final String     PATH = "/discovery/example";
```

### UtilityClassWithoutPrivateConstructor
Class `KillSession` has only 'static' members, and lacks a 'private' constructor
in `curator-test/src/main/java/org/apache/curator/test/KillSession.java`
#### Snippet
```java
 * </p>
 */
public class KillSession
{
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Compatibility` has only 'static' members, and lacks a 'private' constructor
in `curator-test/src/main/java/org/apache/curator/test/Compatibility.java`
#### Snippet
```java

@SuppressWarnings({"unchecked", "rawtypes"})
public class Compatibility
{
    private static final Method closeAllWithReasonMethod;
```

### UtilityClassWithoutPrivateConstructor
Class `DirectoryUtils` has only 'static' members, and lacks a 'private' constructor
in `curator-test/src/main/java/org/apache/curator/test/DirectoryUtils.java`
#### Snippet
```java
// NOTE: removed the line of code documented: Symbolic links will have different canonical and absolute paths
// Update May 28, 2017 - change exception into logs
public class DirectoryUtils
{
    private static final Logger log = LoggerFactory.getLogger(DirectoryUtils.class);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedValue.java`
#### Snippet
```java
            }
        }
    };

    private final ConnectionStateListener connectionStateListener = new ConnectionStateListener()
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java
        }

        retryPolicy = Preconditions.checkNotNull(retryPolicy, "retryPolicy cannot be null");
        ensembleProvider = Preconditions.checkNotNull(ensembleProvider, "ensembleProvider cannot be null");

```

### DataFlowIssue
Variable is already assigned to this value
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java

        retryPolicy = Preconditions.checkNotNull(retryPolicy, "retryPolicy cannot be null");
        ensembleProvider = Preconditions.checkNotNull(ensembleProvider, "ensembleProvider cannot be null");

        this.connectionTimeoutMs = connectionTimeoutMs;
```

### DataFlowIssue
Variable is already assigned to this value
in `curator-framework/src/main/java/org/apache/curator/framework/imps/WatcherRemovalManager.java`
#### Snippet
```java
    void add(NamespaceWatcher watcher)
    {
        watcher = Preconditions.checkNotNull(watcher, "watcher cannot be null");
        entries.add(watcher);
    }
```

### DataFlowIssue
Argument `code` might be null
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
            }

            validateConnection(codeToState(code));
            logError("Background operation retry gave up", e);
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorMultiTransactionImpl.java`
#### Snippet
```java
    public List<CuratorTransactionResult> forOperations(List<CuratorOp> operations) throws Exception
    {
        operations = Preconditions.checkNotNull(operations, "operations cannot be null");
        Preconditions.checkArgument(!operations.isEmpty(), "operations list cannot be empty");

```

### DataFlowIssue
Variable is already assigned to this value
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java
    public SchemaSet(List<Schema> schemas, boolean useDefaultSchema)
    {
        schemas = Preconditions.checkNotNull(schemas, "schemas cannot be null");

        this.useDefaultSchema = useDefaultSchema;
```

### DataFlowIssue
Method reference invocation `ServiceInstance::isEnabled` may produce `NullPointerException`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceProviderImpl.java`
#### Snippet
```java
        ArrayList<InstanceFilter<T>> localFilters = Lists.newArrayList(filters);
        localFilters.add(downInstanceManager);
        localFilters.add(ServiceInstance::isEnabled);
        instanceProvider = new FilteredInstanceProvider<>(cache, localFilters);
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ZPathImpl.java`
#### Snippet
```java
    public static ZPath from(ZPath base, List<String> names)
    {
        names = Objects.requireNonNull(names, "names cannot be null");
        names.forEach(ZPathImpl::validate);
        ImmutableList.Builder<String> builder = ImmutableList.builder();
```

### DataFlowIssue
Variable is already assigned to this value
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
    {
        Preconditions.checkState(state.compareAndSet(State.LATENT, State.STARTED), "already started");
        mode = Preconditions.checkNotNull(mode, "mode cannot be null");

        client.getConnectionStateListenable().addListener(connectionStateListener);
```

### DataFlowIssue
Variable is already assigned to this value
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentNode.java`
#### Snippet
```java
    public void setData(byte[] data) throws Exception
    {
        data = Preconditions.checkNotNull(data, "data cannot be null");
        Preconditions.checkState(nodePath.get() != null, "initial create has not been processed. Call waitForInitialCreate() to ensure.");
        Preconditions.checkState(!parentCreationFailure, "Failed to create parent nodes.");
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'newNamespaceAwareEnsurePath' is still used
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     */
    @Deprecated
    public EnsurePath newNamespaceAwareEnsurePath(String path);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getAuthValue' is still used
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java

        @Deprecated
        public byte[] getAuthValue()
        {
            int qty = (authInfos != null) ? authInfos.size() : 0;
```

### DeprecatedIsStillUsed
Deprecated member 'getAuthScheme' is still used
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java

        @Deprecated
        public String getAuthScheme()
        {
            int qty = (authInfos != null) ? authInfos.size() : 0;
```

### DeprecatedIsStillUsed
Deprecated member 'CuratorTransaction' is still used
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransaction.java`
#### Snippet
```java
 * @deprecated Use {@link CuratorFramework#transaction()}
 */
public interface CuratorTransaction
{
    /**
```

### DeprecatedIsStillUsed
Deprecated member 'nonNamespaceView' is still used
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
    @Override
    @Deprecated
    public CuratorFramework nonNamespaceView()
    {
        return usingNamespace(null);
```

### DeprecatedIsStillUsed
Deprecated member 'EnsurePath' is still used
in `curator-client/src/main/java/org/apache/curator/utils/EnsurePath.java`
#### Snippet
```java
 */
@Deprecated
public class EnsurePath
{
    private final String path;
```

### DeprecatedIsStillUsed
Deprecated member 'threadFactory' is still used
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceProviderBuilder.java`
#### Snippet
```java
     */
    @Deprecated
    ServiceProviderBuilder<T> threadFactory(ThreadFactory threadFactory);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'threadFactory' is still used
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceCacheBuilder.java`
#### Snippet
```java
     */
    @Deprecated
    public ServiceCacheBuilder<T> threadFactory(ThreadFactory threadFactory);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'NodeCache' is still used
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/NodeCache.java`
#### Snippet
```java
 */
@Deprecated
public class NodeCache implements Closeable
{
    private final Logger log = LoggerFactory.getLogger(getClass());
```

### DeprecatedIsStillUsed
Deprecated member 'trySetCount' is still used
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedCount.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean  trySetCount(int newCount) throws Exception
    {
        return sharedValue.trySetValue(toBytes(newCount));
```

### DeprecatedIsStillUsed
Deprecated member 'Mode' is still used
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java
     */
    @Deprecated
    public enum Mode
    {
        /**
```

### DeprecatedIsStillUsed
Deprecated member 'PersistentEphemeralNode' is still used
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java
 */
@Deprecated
public class PersistentEphemeralNode extends PersistentNode
{
    /**
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath6.java`
#### Snippet
```java
    static <T1, T2, T3, T4, T5, T6> TypedZPath6<T1, T2, T3, T4, T5, T6> from(ZPath path)
    {
        return (p1, p2, p3, p4, p5, p6) -> path.resolved(p1, p2, p3, p4, p5, p6);
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath9.java`
#### Snippet
```java
    static <T1, T2, T3, T4, T5, T6, T7, T8, T9> TypedZPath9<T1, T2, T3, T4, T5, T6, T7, T8, T9> from(ZPath path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath4.java`
#### Snippet
```java
    static <T1, T2, T3, T4> TypedZPath4<T1, T2, T3, T4> from(ZPath path)
    {
        return (p1, p2, p3, p4) -> path.resolved(p1, p2, p3, p4);
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath10.java`
#### Snippet
```java
    static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TypedZPath10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> from(ZPath path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) -> path.resolved(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath7.java`
#### Snippet
```java
    static <T1, T2, T3, T4, T5, T6, T7> TypedZPath7<T1, T2, T3, T4, T5, T6, T7> from(ZPath path)
    {
        return (p1, p2, p3, p4, p5, p6, p7) -> path.resolved(p1, p2, p3, p4, p5, p6, p7);
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath3.java`
#### Snippet
```java
    static <T1, T2, T3> TypedZPath3<T1, T2, T3> from(ZPath path)
    {
        return (p1, p2, p3) -> path.resolved(p1, p2, p3);
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath5.java`
#### Snippet
```java
    static <T1, T2, T3, T4, T5> TypedZPath5<T1, T2, T3, T4, T5> from(ZPath path)
    {
        return (p1, p2, p3, p4, p5) -> path.resolved(p1, p2, p3, p4, p5);
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath2.java`
#### Snippet
```java
    static <T1, T2> TypedZPath2<T1, T2> from(ZPath path)
    {
        return (p1, p2) -> path.resolved(p1, p2);
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath8.java`
#### Snippet
```java
    static <T1, T2, T3, T4, T5, T6, T7, T8> TypedZPath8<T1, T2, T3, T4, T5, T6, T7, T8> from(ZPath path)
    {
        return (p1, p2, p3, p4, p5, p6, p7, p8) -> path.resolved(p1, p2, p3, p4, p5, p6, p7, p8);
    }
}
```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'closeAll' with specified argument types
in `curator-test/src/main/java/org/apache/curator/test/Compatibility.java`
#### Snippet
```java
            try
            {
                localCloseAllMethod = ServerCnxnFactory.class.getDeclaredMethod("closeAll");
                localCloseMethod = ServerCnxn.class.getDeclaredMethod("close");

```

### JavaReflectionMemberAccess
Cannot resolve method 'close' with specified argument types
in `curator-test/src/main/java/org/apache/curator/test/Compatibility.java`
#### Snippet
```java
            {
                localCloseAllMethod = ServerCnxnFactory.class.getDeclaredMethod("closeAll");
                localCloseMethod = ServerCnxn.class.getDeclaredMethod("close");

                localCloseAllMethod.setAccessible(true);
```

## RuleId[id=ObviousNullCheck]
### ObviousNullCheck
Redundant null-check: a value of primitive type 'long' is never null
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/UriSpec.java`
#### Snippet
```java
            localVariables.put(FIELD_PORT, nullCheck(serviceInstance.getPort()));
            localVariables.put(FIELD_SSL_PORT, nullCheck(serviceInstance.getSslPort()));
            localVariables.put(FIELD_REGISTRATION_TIME_UTC, nullCheck(serviceInstance.getRegistrationTimeUTC()));
            localVariables.put(FIELD_SERVICE_TYPE, (serviceInstance.getServiceType() != null) ? serviceInstance.getServiceType().name().toLowerCase() : "");
            if ( serviceInstance.getSslPort() != null )
```

### ObviousNullCheck
Redundant null-check: concatenation is never null
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ZPathImpl.java`
#### Snippet
```java
            return;
        }
        PathUtils.validatePath(PATH_SEPARATOR + nodeName);
    }

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'schema' in a Serializable class
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaViolation.java`
#### Snippet
```java
public class SchemaViolation extends RuntimeException
{
    private final Schema schema;
    private final String violation;
    private final ViolatorData violatorData;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'violatorData' in a Serializable class
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaViolation.java`
#### Snippet
```java
    private final Schema schema;
    private final String violation;
    private final ViolatorData violatorData;

    /**
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return array but the return type is list
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     *
     * @param path the path
     * @return an array of parts
     */
    public static List<String> split(String path)
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ZPathImpl.java`
#### Snippet
```java
        if ( !isResolved)
        {
            throw new IllegalStateException("This ZPath has not been resolved: " + toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSharder.java`
#### Snippet
```java
        if ( newQueuePath == null )
        {
            newQueuePath = ZKPaths.makePath(queuePath, QUEUE_PREFIX + UUID.randomUUID().toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicValue.java`
#### Snippet
```java
        }
        str.append(']');
        return new RuntimeException(String.format("Corrupted data for node \"%s\": %s", path, str.toString()));
    }

```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `debugFailedGetChildrenLatch` accessed in synchronized context
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
                        catch ( Exception e )
                        {
                            if ( debugFailedGetChildrenLatch != null )
                            {
                                debugFailedGetChildrenLatch.countDown();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `debugFailedGetChildrenLatch` accessed in synchronized context
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
                            if ( debugFailedGetChildrenLatch != null )
                            {
                                debugFailedGetChildrenLatch.countDown();
                            }
                            throw e;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `debugWaitLatch` accessed in synchronized context
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
                                return InternalAcquireResult.RETURN_NULL;
                            }
                            if ( debugWaitLatch != null )
                            {
                                debugWaitLatch.countDown();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `debugWaitLatch` accessed in synchronized context
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
                            if ( debugWaitLatch != null )
                            {
                                debugWaitLatch.countDown();
                            }
                            wait(thisWaitMs);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `debugWaitLatch` accessed in synchronized context
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
                        else
                        {
                            if ( debugWaitLatch != null )
                            {
                                debugWaitLatch.countDown();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `debugWaitLatch` accessed in synchronized context
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
                            if ( debugWaitLatch != null )
                            {
                                debugWaitLatch.countDown();
                            }
                            wait();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `executeCalled` accessed in synchronized context
in `curator-test/src/main/java/org/apache/curator/test/ExecuteCalledWatchingExecutorService.java`
#### Snippet
```java
    public synchronized boolean isExecuteCalled()
    {
        return executeCalled;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.executeCalled` accessed in synchronized context
in `curator-test/src/main/java/org/apache/curator/test/ExecuteCalledWatchingExecutorService.java`
#### Snippet
```java
    public synchronized void setExecuteCalled(boolean executeCalled)
    {
        this.executeCalled = executeCalled;
    }
}
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `executeCalled` accessed in synchronized context
in `curator-test/src/main/java/org/apache/curator/test/ExecuteCalledWatchingExecutorService.java`
#### Snippet
```java
    public synchronized void execute(Runnable command)
    {
        executeCalled = true;
        super.execute(command);
    }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `curator-client/src/main/java/org/apache/curator/ConnectionState.java`
#### Snippet
```java

    @SuppressWarnings({"ThrowableResultOfMethodCallIgnored"})
    private void queueBackgroundException(Exception e)
    {
        while ( backgroundExceptions.size() >= MAX_BACKGROUND_EXCEPTIONS )
```

### RedundantSuppression
Redundant suppression
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java

    @SuppressWarnings({"ThrowableResultOfMethodCallIgnored"})
    private <DATA_TYPE> boolean checkBackgroundRetry(OperationAndData<DATA_TYPE> operationAndData, CuratorEvent event)
    {
        boolean doRetry = false;
```

### RedundantSuppression
Redundant suppression
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetACLBuilderImpl.java`
#### Snippet
```java
                    @SuppressWarnings({"unchecked"})
                    @Override
                    public void processResult(int rc, String path, Object ctx, Stat stat)
                    {
                        trace.setReturnCode(rc).setPath(path).setStat(stat).commit();
```

### RedundantSuppression
Redundant suppression
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
                    @SuppressWarnings({"unchecked"})
                    @Override
                    public void processResult(int rc, String path, Object ctx, Stat stat)
                    {
                        trace.setReturnCode(rc).setRequestBytesLength(data).setPath(path).setStat(stat).commit();
```

### RedundantSuppression
Redundant suppression
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
    @Deprecated
    @SuppressWarnings("deprecation")
    public PathChildrenCache(CuratorFramework client, String path, PathChildrenCacheMode mode)
    {
        this(client, path, mode != PathChildrenCacheMode.CACHE_PATHS_ONLY, false, new CloseableExecutorService(Executors.newSingleThreadExecutor(defaultThreadFactorySupplier.get()), true));
```

### RedundantSuppression
Redundant suppression
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
    @Deprecated
    @SuppressWarnings("deprecation")
    public PathChildrenCache(CuratorFramework client, String path, PathChildrenCacheMode mode, ThreadFactory threadFactory)
    {
        this(client, path, mode != PathChildrenCacheMode.CACHE_PATHS_ONLY, false, new CloseableExecutorService(Executors.newSingleThreadExecutor(threadFactory), true));
```

### RedundantSuppression
Redundant suppression
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java
     */
    @SuppressWarnings("deprecation")
    public PersistentEphemeralNode(CuratorFramework client, Mode mode, String basePath, byte[] initData)
    {
        super(client, mode.getCreateMode(false), mode.isProtected(), basePath, initData);
```

### RedundantSuppression
Redundant suppression
in `curator-test/src/main/java/org/apache/curator/test/Timing.java`
#### Snippet
```java
     */
    @SuppressWarnings("PointlessArithmeticExpression")
    public Timing forWaiting()
    {
        return multiple(waitingMultiple);
```

### RedundantSuppression
Redundant suppression
in `curator-test/src/main/java/org/apache/curator/test/compatibility/Timing2.java`
#### Snippet
```java
     */
    @SuppressWarnings("PointlessArithmeticExpression")
    public Timing2 forWaiting()
    {
        return multiple(waitingMultiple);
```

### RedundantSuppression
Redundant suppression
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/DiscoveryResource.java`
#### Snippet
```java
            if ( instance != null )
            {
                //noinspection unchecked
                context.getServiceDiscovery().unregisterService(instance);
            }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
        CuratorFramework client = CreateClientExamples.createSimple("127.0.0.1:2181");
        client.getUnhandledErrorListenable().addListener((message, e) -> {
            System.err.println("error=" + message);
            e.printStackTrace();
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
        });
        client.getConnectionStateListenable().addListener((c, newState) -> {
            System.out.println("state=" + newState);
        });
        client.start();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
            if ( event.getData() != null )
            {
                System.out.println("type=" + event.getType() + " path=" + event.getData().getPath());
            }
            else
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
            else
            {
                System.out.println("type=" + event.getType());
            }
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
        // thenAccept() handles normal watcher triggering.
        watchedStage.thenAccept(event -> {
            System.out.println(event.getType());
            System.out.println(event);
            // etc.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
        watchedStage.thenAccept(event -> {
            System.out.println(event.getType());
            System.out.println(event);
            // etc.
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
            else
            {
                System.out.println("Created node name is: " + name);
            }
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
                // the EventType is a node event
                async.with(WatchMode.successOnly).watched().checkExists().forPath(path).event().thenAccept(event -> {
                    System.out.println(event.getType());
                    System.out.println(event);
                });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
                async.with(WatchMode.successOnly).watched().checkExists().forPath(path).event().thenAccept(event -> {
                    System.out.println(event.getType());
                    System.out.println(event);
                });
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/CuratorCacheExample.java`
#### Snippet
```java
                    // or for all events. Here, we'll use the builder to log individual cache actions
                    CuratorCacheListener listener = CuratorCacheListener.builder()
                        .forCreates(node -> System.out.println(String.format("Node created: [%s]", node)))
                        .forChanges((oldNode, node) -> System.out.println(String.format("Node changed. Old: [%s] New: [%s]", oldNode, node)))
                        .forDeletes(oldNode -> System.out.println(String.format("Node deleted. Old value: [%s]", oldNode)))
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/CuratorCacheExample.java`
#### Snippet
```java
                    CuratorCacheListener listener = CuratorCacheListener.builder()
                        .forCreates(node -> System.out.println(String.format("Node created: [%s]", node)))
                        .forChanges((oldNode, node) -> System.out.println(String.format("Node changed. Old: [%s] New: [%s]", oldNode, node)))
                        .forDeletes(oldNode -> System.out.println(String.format("Node deleted. Old value: [%s]", oldNode)))
                        .forInitialized(() -> System.out.println("Cache initialized"))
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/CuratorCacheExample.java`
#### Snippet
```java
                        .forCreates(node -> System.out.println(String.format("Node created: [%s]", node)))
                        .forChanges((oldNode, node) -> System.out.println(String.format("Node changed. Old: [%s] New: [%s]", oldNode, node)))
                        .forDeletes(oldNode -> System.out.println(String.format("Node deleted. Old value: [%s]", oldNode)))
                        .forInitialized(() -> System.out.println("Cache initialized"))
                        .build();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/CuratorCacheExample.java`
#### Snippet
```java
                        .forChanges((oldNode, node) -> System.out.println(String.format("Node changed. Old: [%s] New: [%s]", oldNode, node)))
                        .forDeletes(oldNode -> System.out.println(String.format("Node deleted. Old value: [%s]", oldNode)))
                        .forInitialized(() -> System.out.println("Cache initialized"))
                        .build();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/leader/ExampleClient.java`
#### Snippet
```java
        final int         waitSeconds = (int)(5 * Math.random()) + 1;

        System.out.println(name + " is now the leader. Waiting " + waitSeconds + " seconds...");
        System.out.println(name + " has been leader " + leaderCount.getAndIncrement() + " time(s) before.");
        try
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/leader/ExampleClient.java`
#### Snippet
```java

        System.out.println(name + " is now the leader. Waiting " + waitSeconds + " seconds...");
        System.out.println(name + " has been leader " + leaderCount.getAndIncrement() + " time(s) before.");
        try
        {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/leader/ExampleClient.java`
#### Snippet
```java
        catch ( InterruptedException e )
        {
            System.err.println(name + " was interrupted.");
            Thread.currentThread().interrupt();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/leader/ExampleClient.java`
#### Snippet
```java
        finally
        {
            System.out.println(name + " relinquishing leadership.\n");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/leader/LeaderSelectorExample.java`
#### Snippet
```java
        // all of the useful sample code is in ExampleClient.java

        System.out.println("Create " + CLIENT_QTY + " clients, have each negotiate for leadership and then wait a random number of seconds before letting another leader election occur.");
        System.out.println("Notice that leader election is fair: all clients will become leader and will do so the same number of times.");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/leader/LeaderSelectorExample.java`
#### Snippet
```java

        System.out.println("Create " + CLIENT_QTY + " clients, have each negotiate for leadership and then wait a random number of seconds before letting another leader election occur.");
        System.out.println("Notice that leader election is fair: all clients will become leader and will do so the same number of times.");

        List<CuratorFramework>  clients = Lists.newArrayList();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/leader/LeaderSelectorExample.java`
#### Snippet
```java
            }

            System.out.println("Press enter/return to quit\n");
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/leader/LeaderSelectorExample.java`
#### Snippet
```java
        finally
        {
            System.out.println("Shutting down...");

            for ( ExampleClient exampleClient : examples )
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/locking/ExampleClientThatLocks.java`
#### Snippet
```java
        try
        {
            System.out.println(clientName + " has the lock");
            resource.use();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/locking/ExampleClientThatLocks.java`
#### Snippet
```java
        finally
        {
            System.out.println(clientName + " releasing the lock");
            lock.release(); // always release the lock in a finally block
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        if ( args.length != 1 )
        {
            System.err.println("syntax error (expected remove <path>): " + command);
            return;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        if ( name.contains("/") )
        {
            System.err.println("Invalid node name" + name);
            return;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        if ( args.length != 2 )
        {
            System.err.println("syntax error (expected set <path> <value>): " + command);
            return;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        if ( name.contains("/") )
        {
            System.err.println("Invalid node name" + name);
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
            while ( !done )
            {
                System.out.print("> ");

                String      line = in.readLine();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
    private static void printHelp()
    {
        System.out.println("An example of using PathChildrenCache. This example is driven by entering commands at the prompt:\n");
        System.out.println("set <name> <value>: Adds or updates a node with the given name");
        System.out.println("remove <name>: Deletes the node with the given name");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
    {
        System.out.println("An example of using PathChildrenCache. This example is driven by entering commands at the prompt:\n");
        System.out.println("set <name> <value>: Adds or updates a node with the given name");
        System.out.println("remove <name>: Deletes the node with the given name");
        System.out.println("list: List the nodes/values in the cache");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        System.out.println("An example of using PathChildrenCache. This example is driven by entering commands at the prompt:\n");
        System.out.println("set <name> <value>: Adds or updates a node with the given name");
        System.out.println("remove <name>: Deletes the node with the given name");
        System.out.println("list: List the nodes/values in the cache");
        System.out.println("quit: Quit the example");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        System.out.println("set <name> <value>: Adds or updates a node with the given name");
        System.out.println("remove <name>: Deletes the node with the given name");
        System.out.println("list: List the nodes/values in the cache");
        System.out.println("quit: Quit the example");
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        System.out.println("remove <name>: Deletes the node with the given name");
        System.out.println("list: List the nodes/values in the cache");
        System.out.println("quit: Quit the example");
        System.out.println();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        System.out.println("list: List the nodes/values in the cache");
        System.out.println("quit: Quit the example");
        System.out.println();
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        if ( cache.getCurrentData().size() == 0 )
        {
            System.out.println("* empty *");
        }
        else
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
            for ( ChildData data : cache.getCurrentData() )
            {
                System.out.println(data.getPath() + " = " + new String(data.getData()));
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
                    case CHILD_ADDED:
                    {
                        System.out.println("Node added: " + ZKPaths.getNodeFromPath(event.getData().getPath()));
                        break;
                    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
                    case CHILD_UPDATED:
                    {
                        System.out.println("Node changed: " + ZKPaths.getNodeFromPath(event.getData().getPath()));
                        break;
                    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
                    case CHILD_REMOVED:
                    {
                        System.out.println("Node removed: " + ZKPaths.getNodeFromPath(event.getData().getPath()));
                        break;
                    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
    private <T> ModeledCacheListener<T> generalListener()
    {
        return (type, path, stat, model) -> System.out.println(String.format("Subscribed %s @ %s", model.getClass().getSimpleName(), path));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
            {
                Instance instance = new Instance(nextId(), random(InstanceType.values()), random(hostnames), random(ports));
                System.out.println("Publishing 1 instance");
                publisher.publishInstance(instance);
                break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
                    .mapToObj(__ -> new Instance(nextId(), random(InstanceType.values()), random(hostnames), random(ports)))
                    .collect(Collectors.toList());
                System.out.println(String.format("Publishing %d instances", instances.size()));
                publisher.publishInstances(instances);
                break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
            {
                LocationAvailable locationAvailable = new LocationAvailable(nextId(), random(Priority.values()), random(locations), random(durations));
                System.out.println("Publishing 1 locationAvailable");
                publisher.publishLocationAvailable(random(groups), locationAvailable);
                break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
                    .mapToObj(__ -> new LocationAvailable(nextId(), random(Priority.values()), random(locations), random(durations)))
                    .collect(Collectors.toList());
                System.out.println(String.format("Publishing %d locationsAvailable", locationsAvailable.size()));
                publisher.publishLocationsAvailable(random(groups), locationsAvailable);
                break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
            {
                UserCreated userCreated = new UserCreated(nextId(), random(Priority.values()), random(locations), random(positions));
                System.out.println("Publishing 1 userCreated");
                publisher.publishUserCreated(random(groups), userCreated);
                break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
                    .mapToObj(__ -> new UserCreated(nextId(), random(Priority.values()), random(locations), random(positions)))
                    .collect(Collectors.toList());
                System.out.println(String.format("Publishing %d usersCreated", usersCreated.size()));
                publisher.publishUsersCreated(random(groups), usersCreated);
                break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/framework/TransactionExamples.java`
#### Snippet
```java
        for ( CuratorTransactionResult result : results )
        {
            System.out.println(result.getForPath() + " - " + result.getType());
        }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        if ( args.length != 1 )
        {
            System.err.println("syntax error (expected delete <name>): " + command);
            return;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        if ( server == null )
        {
            System.err.println("No servers found named: " + serviceName);
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        servers.remove(server);
        CloseableUtils.closeQuietly(server);
        System.out.println("Removed a random instance of: " + serviceName);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        if ( args.length != 1 )
        {
            System.err.println("syntax error (expected random <name>): " + command);
            return;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        if ( instance == null )
        {
            System.err.println("No instances named: " + serviceName);
        }
        else
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
    private static void outputInstance(ServiceInstance<InstanceDetails> instance)
    {
        System.out.println("\t" + instance.getPayload().getDescription() + ": " + instance.buildUriSpec());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        {
            Collection<String>  serviceNames = serviceDiscovery.queryForNames();
            System.out.println(serviceNames.size() + " type(s)");
            for ( String serviceName : serviceNames )
            {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
            {
                Collection<ServiceInstance<InstanceDetails>> instances = serviceDiscovery.queryForInstances(serviceName);
                System.out.println(serviceName);
                for ( ServiceInstance<InstanceDetails> instance : instances )
                {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        catch ( KeeperException.NoNodeException e )
        {
            System.err.println("There are no registered instances.");
        }
        finally
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
            while ( !done )
            {
                System.out.print("> ");

                String      line = in.readLine();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
    private static void printHelp()
    {
        System.out.println("An example of using the ServiceDiscovery APIs. This example is driven by entering commands at the prompt:\n");
        System.out.println("add <name> <description>: Adds a mock service with the given name and description");
        System.out.println("delete <name>: Deletes one of the mock services with the given name");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
    {
        System.out.println("An example of using the ServiceDiscovery APIs. This example is driven by entering commands at the prompt:\n");
        System.out.println("add <name> <description>: Adds a mock service with the given name and description");
        System.out.println("delete <name>: Deletes one of the mock services with the given name");
        System.out.println("list: Lists all the currently registered services");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        System.out.println("An example of using the ServiceDiscovery APIs. This example is driven by entering commands at the prompt:\n");
        System.out.println("add <name> <description>: Adds a mock service with the given name and description");
        System.out.println("delete <name>: Deletes one of the mock services with the given name");
        System.out.println("list: Lists all the currently registered services");
        System.out.println("random <name>: Lists a random instance of the service with the given name");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        System.out.println("add <name> <description>: Adds a mock service with the given name and description");
        System.out.println("delete <name>: Deletes one of the mock services with the given name");
        System.out.println("list: Lists all the currently registered services");
        System.out.println("random <name>: Lists a random instance of the service with the given name");
        System.out.println("quit: Quit the example");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        System.out.println("delete <name>: Deletes one of the mock services with the given name");
        System.out.println("list: Lists all the currently registered services");
        System.out.println("random <name>: Lists a random instance of the service with the given name");
        System.out.println("quit: Quit the example");
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        System.out.println("list: Lists all the currently registered services");
        System.out.println("random <name>: Lists a random instance of the service with the given name");
        System.out.println("quit: Quit the example");
        System.out.println();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        System.out.println("random <name>: Lists a random instance of the service with the given name");
        System.out.println("quit: Quit the example");
        System.out.println();
    }
}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        if ( args.length < 2 )
        {
            System.err.println("syntax error (expected add <name> <description>): " + command);
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        server.start();

        System.out.println(serviceName + " added");
    }

```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `curator-client/src/main/java/org/apache/curator/drivers/OperationTrace.java`
#### Snippet
```java

      try {
        this.setRequestBytesLength(data.getBytes("UTF-8").length);
      } catch (UnsupportedEncodingException e) {
        // Ignore the exception.
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
        {
            byte[] bytes = client.getData().forPath(path);
            String thisId = new String(bytes, "UTF-8");
            return new Participant(thisId, markAsLeader);
        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
        try
        {
            return id.getBytes("UTF-8");
        }
        catch ( UnsupportedEncodingException e )
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @deprecated use {@link #watchers()} in ZooKeeper 3.6+
     */
    public RemoveWatchesBuilder watches();

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java
     * @deprecated use {@link #transaction()} instead
     */
    public CuratorTransaction inTransaction();

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransaction.java`
#### Snippet
```java
 * @deprecated Use {@link CuratorFramework#transaction()}
 */
public interface CuratorTransaction
{
    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaViolation.java`
#### Snippet
```java
     * @deprecated use {@link #SchemaViolation(Schema, ViolatorData, String)} instance
     */
    public SchemaViolation(String violation)
    {
        super(String.format("Schema violation: %s", violation));
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaViolation.java`
#### Snippet
```java
     * @deprecated use {@link #SchemaViolation(Schema, ViolatorData, String)} instance
     */
    public SchemaViolation(Schema schema, String violation)
    {
        super(String.format("Schema violation: %s for schema: %s", violation, schema));
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `curator-test/src/main/java/org/apache/curator/test/KillSession.java`
#### Snippet
```java
     * @deprecated use {@link #kill(ZooKeeper)} instead
     */
    public static void     kill(ZooKeeper client, String connectString) throws Exception
    {
        kill(client);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `curator-test/src/main/java/org/apache/curator/test/KillSession.java`
#### Snippet
```java
     * @deprecated use {@link #kill(ZooKeeper)} instead
     */
    public static void     kill(ZooKeeper client, String connectString, int maxMs) throws Exception
    {
        kill(client);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java

                String      command = line.trim();
                String[]    parts = command.split("\\s");
                if ( parts.length == 0 )
                {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java

                String      command = line.trim();
                String[]    parts = command.split("\\s");
                if ( parts.length == 0 )
                {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `curator-client/src/main/java/org/apache/curator/RetryLoop.java`
#### Snippet
```java
 * <p>
 *     Note: this an {@code abstract class} instead of an {@code interface} for historical reasons. It was originally a class
 *     and if it becomes an interface we risk {@link java.lang.IncompatibleClassChangeError}s with clients.
 * </p>
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `curator-client/src/main/java/org/apache/curator/utils/ExceptionAccumulator.java`
#### Snippet
```java
    /**
     * Add an exception into the accumulated exceptions. Note:
     * if the exception is {@link java.lang.InterruptedException}
     * then <code>Thread.currentThread().interrupt()</code> is called.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param makeLastNode if true, all nodes are created. If false, only the parent nodes are created
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
     */
    public static void mkdirs(ZooKeeper zookeeper, String path, boolean makeLastNode) throws InterruptedException, KeeperException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @return sorted list of children
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException zookeeper errors
     */
    public static List<String> getSortedChildren(ZooKeeper zookeeper, String path) throws InterruptedException, KeeperException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param aclProvider  if not null, the ACL provider to use when creating parent nodes
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
     */
    public static void mkdirs(ZooKeeper zookeeper, String path, boolean makeLastNode, InternalACLProvider aclProvider) throws InterruptedException, KeeperException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param path      path to ensure
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
     */
    public static void mkdirs(ZooKeeper zookeeper, String path) throws InterruptedException, KeeperException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param asContainers if true, nodes are created as {@link CreateMode#CONTAINER}
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
     */
    public static void mkdirs(ZooKeeper zookeeper, String path, boolean makeLastNode, InternalACLProvider aclProvider, boolean asContainers) throws InterruptedException, KeeperException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.api` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/api/Guaranteeable.java`
#### Snippet
```java
     * response can be successfully returned to the client.
     * 
     * @see org.apache.curator.framework.api.GuaranteeableDeletable 
     *  
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/api/AddWatchBuilder.java`
#### Snippet
```java
{
    /**
     * The mode to use. By default, {@link org.apache.zookeeper.AddWatchMode#PERSISTENT_RECURSIVE} is used
     *
     * @param mode mode to use
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.state` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        /**
         * Sets the connection state listener manager factory. For example,
         * you can set {@link org.apache.curator.framework.state.ConnectionStateListenerManagerFactory#circuitBreaking(org.apache.curator.RetryPolicy)}
         *
         * @param connectionStateListenerManagerFactory manager factory to use
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        /**
         * Sets the connection state listener manager factory. For example,
         * you can set {@link org.apache.curator.framework.state.ConnectionStateListenerManagerFactory#circuitBreaking(org.apache.curator.RetryPolicy)}
         *
         * @param connectionStateListenerManagerFactory manager factory to use
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        /**
         * Add connection authorization. The supplied authInfos are appended to those added via call to
         * {@link #authorization(java.lang.String, byte[])} for backward compatibility.
         * <p/>
         * Subsequent calls to this method overwrite the prior calls.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
         * and other blocking calls that might normally block ZooKeeper's event thread.
         * By default, an executor is allocated internally using the provided (or default)
         * {@link #threadFactory(java.util.concurrent.ThreadFactory)}. Use this method
         * to set a custom executor.
         *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.imps` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/imps/ProtectedMode.java`
#### Snippet
```java

/**
 * manage the protected mode state for {@link org.apache.curator.framework.imps.CreateBuilderImpl}
 */
class ProtectedMode
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.state` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateListenerManagerFactory.java`
#### Snippet
```java

    /**
     * Listeners set in this manager receive circuit breaking behavior using {@link org.apache.curator.framework.state.CircuitBreakingConnectionStateListener}
     * as a master listener that proxies to any listener registered by client code (unless the listener returns true
     * for {@link ConnectionStateListener#doNotProxy()}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.state` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateListenerManagerFactory.java`
#### Snippet
```java

    /**
     * Listeners set in this manager receive circuit breaking behavior using {@link org.apache.curator.framework.state.CircuitBreakingConnectionStateListener}
     * as a master listener that proxies to any listener registered by client code (unless the listener returns true
     * for {@link ConnectionStateListener#doNotProxy()}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.state` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreakingConnectionStateListener.java`
#### Snippet
```java
 * <p>
 *     This noisy herding can be avoided by using the circuit breaking listener. When it
 *     receives {@link org.apache.curator.framework.state.ConnectionState#SUSPENDED}, the circuit
 *     becomes "open" (based on the provided {@link org.apache.curator.RetryPolicy}) and will ignore
 *     future connection state changes until RetryPolicy timeout has elapsed. Note: however, if the connection
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreakingConnectionStateListener.java`
#### Snippet
```java
 *     This noisy herding can be avoided by using the circuit breaking listener. When it
 *     receives {@link org.apache.curator.framework.state.ConnectionState#SUSPENDED}, the circuit
 *     becomes "open" (based on the provided {@link org.apache.curator.RetryPolicy}) and will ignore
 *     future connection state changes until RetryPolicy timeout has elapsed. Note: however, if the connection
 *     goes from {@link org.apache.curator.framework.state.ConnectionState#SUSPENDED} to
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.state` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreakingConnectionStateListener.java`
#### Snippet
```java
 *     becomes "open" (based on the provided {@link org.apache.curator.RetryPolicy}) and will ignore
 *     future connection state changes until RetryPolicy timeout has elapsed. Note: however, if the connection
 *     goes from {@link org.apache.curator.framework.state.ConnectionState#SUSPENDED} to
 *     {@link org.apache.curator.framework.state.ConnectionState#LOST} the first LOST state <i>is</i> sent.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.state` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreakingConnectionStateListener.java`
#### Snippet
```java
 *     future connection state changes until RetryPolicy timeout has elapsed. Note: however, if the connection
 *     goes from {@link org.apache.curator.framework.state.ConnectionState#SUSPENDED} to
 *     {@link org.apache.curator.framework.state.ConnectionState#LOST} the first LOST state <i>is</i> sent.
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.state` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreakingConnectionStateListener.java`
#### Snippet
```java
 *
 * <p>
 *     <strong>NOTE:</strong> You should not use this listener directly. Instead, set {@link org.apache.curator.framework.state.ConnectionStateListenerManagerFactory#circuitBreaking(org.apache.curator.RetryPolicy)}
 *     in the {@link org.apache.curator.framework.CuratorFrameworkFactory.Builder#connectionStateListenerManagerFactory(ConnectionStateListenerManagerFactory)}.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator` is unnecessary and can be removed
in `curator-framework/src/main/java/org/apache/curator/framework/state/CircuitBreakingConnectionStateListener.java`
#### Snippet
```java
 *
 * <p>
 *     <strong>NOTE:</strong> You should not use this listener directly. Instead, set {@link org.apache.curator.framework.state.ConnectionStateListenerManagerFactory#circuitBreaking(org.apache.curator.RetryPolicy)}
 *     in the {@link org.apache.curator.framework.CuratorFrameworkFactory.Builder#connectionStateListenerManagerFactory(ConnectionStateListenerManagerFactory)}.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncStage.java`
#### Snippet
```java

/**
 * A {@link java.util.concurrent.CompletionStage} that is the result of most operations.
 */
public interface AsyncStage<T> extends CompletionStage<T>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/WatchMode.java`
#### Snippet
```java
     * The {@link java.util.concurrent.CompletionStage}&lt;org.apache.zookeeper.WatchedEvent&gt; will
     * complete for both successful trigger and connection exceptions. Connection exceptions are
     * of type: {@link org.apache.curator.x.async.AsyncEventException}. Note: this is the default
     * watch mode.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/WatchMode.java`
#### Snippet
```java
     * The {@link java.util.concurrent.CompletionStage}&lt;org.apache.zookeeper.WatchedEvent&gt; will only
     * completeExceptionally. Successful trigger is ignored. Connection exceptions are
     * of type: {@link org.apache.curator.x.async.AsyncEventException}.
     */
    stateChangeOnly,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncGetDataBuilder.java`
#### Snippet
```java
     * @param stat the stat to have filled in
     * @see #decompressed()
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
     * @param aclList the ACL list to use
     * @param compressed true to compress
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #compressed()
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
     * @param compressed true to compress
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #compressed()
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
     * @param aclList the ACL list to use
     * @param compressed true to compress
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #compressed()
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
     * @param compressed true to compress
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #compressed()
     * @see #withTtl(long)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
{
    /**
     * Specify a mode for the create. The default is {@link org.apache.zookeeper.CreateMode#PERSISTENT}
     *
     * @param createMode mode
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java

    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncCuratorFramework.java`
#### Snippet
```java

    /**
     * Returns the client that was originally passed to {@link #wrap(org.apache.curator.framework.CuratorFramework)}
     *
     * @return original client
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncCuratorFramework.java`
#### Snippet
```java
     * @param resultFilter filter to use or <code>null</code>
     * @param watcherFilter filter to use or <code>null</code>
     * @see #with(java.util.function.UnaryOperator, java.util.function.UnaryOperator)
     * @see #with(org.apache.curator.framework.api.UnhandledErrorListener)
     * @return facade
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncCuratorFramework.java`
#### Snippet
```java
     * @param resultFilter filter to use or <code>null</code>
     * @param watcherFilter filter to use or <code>null</code>
     * @see #with(java.util.function.UnaryOperator, java.util.function.UnaryOperator)
     * @see #with(org.apache.curator.framework.api.UnhandledErrorListener)
     * @return facade
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.api` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncCuratorFramework.java`
#### Snippet
```java
     * @param watcherFilter filter to use or <code>null</code>
     * @see #with(java.util.function.UnaryOperator, java.util.function.UnaryOperator)
     * @see #with(org.apache.curator.framework.api.UnhandledErrorListener)
     * @return facade
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncCuratorFramework.java`
#### Snippet
```java
     * @param watcherFilter filter to use or <code>null</code>
     * @see #with(WatchMode)
     * @see #with(java.util.function.UnaryOperator, java.util.function.UnaryOperator)
     * @see #with(org.apache.curator.framework.api.UnhandledErrorListener)
     * @return facade
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncCuratorFramework.java`
#### Snippet
```java
     * @param watcherFilter filter to use or <code>null</code>
     * @see #with(WatchMode)
     * @see #with(java.util.function.UnaryOperator, java.util.function.UnaryOperator)
     * @see #with(org.apache.curator.framework.api.UnhandledErrorListener)
     * @return facade
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.api` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncCuratorFramework.java`
#### Snippet
```java
     * @see #with(WatchMode)
     * @see #with(java.util.function.UnaryOperator, java.util.function.UnaryOperator)
     * @see #with(org.apache.curator.framework.api.UnhandledErrorListener)
     * @return facade
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncDeleteBuilder.java`
#### Snippet
```java
     * @param options set of deletion options
     * @param version version to use
     * @see #withOptions(java.util.Set)
     * @see #withVersion(int)
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncSetACLBuilder.java`
#### Snippet
```java
     * @param aclList ACLs to set
     * @param version "a" version
     * @see org.apache.zookeeper.data.Stat#getAversion()
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param options options
     * @param aclList the ACL list to use
     * @see #withOptions(java.util.Set)
     * @see #withACL(java.util.List)
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param aclList the ACL list to use
     * @see #withOptions(java.util.Set)
     * @see #withACL(java.util.List)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param createMode mode to use
     * @param aclList the ACL list to use
     * @see #withACL(java.util.List)
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param aclList the ACL list to use
     * @see #withACL(java.util.List)
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withACL(java.util.List)
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java

    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param stat the stat to have filled in
     * @param ttl the ttl or 0
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param ttl the ttl or 0
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @see #withTtl(long)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @see #withTtl(long)
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param aclList the ACL list to use
     * @param stat the stat to have filled in
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param stat the stat to have filled in
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java

    /**
     * Use the given create mode. The default is {@link org.apache.zookeeper.CreateMode#PERSISTENT}
     *
     * @param createMode mode to use
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param ttl the ttl or 0
     * @param setDataVersion the setData matching version or -1
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param setDataVersion the setData matching version or -1
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @see #withTtl(long)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @see #withTtl(long)
     * @see #withSetDataVersion(long)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param options options
     * @param createMode mode to use
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param createMode mode to use
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.api` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
    /**
     * Specify the setData expected matching version when using option
     * {@link org.apache.curator.x.async.api.CreateOption#setDataIfExists}. By default -1 is used.
     *
     * @param version setData expected matching version
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java

    /**
     * If there was a general exception or a {@link org.apache.zookeeper.KeeperException}
     * a {@link java.lang.RuntimeException} is thrown that wraps the exception. Otherwise, the method returns
     * without any action being performed.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
    /**
     * If there was a general exception or a {@link org.apache.zookeeper.KeeperException}
     * a {@link java.lang.RuntimeException} is thrown that wraps the exception. Otherwise, the method returns
     * without any action being performed.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java

    /**
     * If there was a general exception (but <strong>not</strong> a {@link org.apache.zookeeper.KeeperException})
     * a {@link java.lang.RuntimeException} is thrown that wraps the exception. Otherwise, the method returns
     * without any action being performed.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
    /**
     * If there was a general exception (but <strong>not</strong> a {@link org.apache.zookeeper.KeeperException})
     * a {@link java.lang.RuntimeException} is thrown that wraps the exception. Otherwise, the method returns
     * without any action being performed.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
    /**
     * Return the ZooKeeper result code. If the method was successful,
     * {@link org.apache.zookeeper.KeeperException.Code#OK} is returned. If there was a general
     * exception {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR} is returned.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
     * Return the ZooKeeper result code. If the method was successful,
     * {@link org.apache.zookeeper.KeeperException.Code#OK} is returned. If there was a general
     * exception {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR} is returned.
     *
     * @return result code
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
 * <p>
 *     Utility that combines the value, the ZooKeeper result code and the exception in one object
 *     allowing you to not worry about exceptional completions. i.e. the {@link java.util.concurrent.CompletionStage}
 *     returned by {@link org.apache.curator.x.async.AsyncResult#of(AsyncStage)} always completes successfully with an
 *     {@link org.apache.curator.x.async.AsyncResult} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
 *     Utility that combines the value, the ZooKeeper result code and the exception in one object
 *     allowing you to not worry about exceptional completions. i.e. the {@link java.util.concurrent.CompletionStage}
 *     returned by {@link org.apache.curator.x.async.AsyncResult#of(AsyncStage)} always completes successfully with an
 *     {@link org.apache.curator.x.async.AsyncResult} object.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
 *     allowing you to not worry about exceptional completions. i.e. the {@link java.util.concurrent.CompletionStage}
 *     returned by {@link org.apache.curator.x.async.AsyncResult#of(AsyncStage)} always completes successfully with an
 *     {@link org.apache.curator.x.async.AsyncResult} object.
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
 *     All three possible results from a ZooKeeper method are encapsulated in this object. If the ZooKeeper
 *     method succeeds, the internal value will be set. If there was a standard ZooKeeper error code
 *     ({@link org.apache.zookeeper.KeeperException.Code#NODEEXISTS}, etc.), that code is set and the
 *     value is null. If there was a general exception, that exception is set, the value will be null
 *     and the code will be {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
 *     ({@link org.apache.zookeeper.KeeperException.Code#NODEEXISTS}, etc.), that code is set and the
 *     value is null. If there was a general exception, that exception is set, the value will be null
 *     and the code will be {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR}.
 * </p>
 * @param <T> value type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncWatchBuilder.java`
#### Snippet
```java
{
    /**
     * The mode to use. By default, {@link org.apache.zookeeper.AddWatchMode#PERSISTENT_RECURSIVE} is used
     *
     * @param mode mode
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java

    /**
     * Same as {@link #withNewMembers(java.util.List)} but allows a stat to hold the stat info from "/zookeeper/config"
     *
     * @param servers The servers joining.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param servers The servers joining.
     * @param stat stat to hold the stat value
     * @see #withNewMembers(java.util.List)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java

    /**
     * Same as {@link #withJoiningAndLeaving(java.util.List, java.util.List)} with stat and config version
     *
     * @param joining The servers joining
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java

    /**
     * Same as {@link #withJoiningAndLeaving(java.util.List, java.util.List)} with stat and config version
     *
     * @param joining The servers joining
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param stat stat to hold the stat value
     * @param fromConfig the config version to use
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, long)
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param stat stat to hold the stat value
     * @param fromConfig the config version to use
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, long)
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param fromConfig the config version to use
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, long)
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param fromConfig the config version to use
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, long)
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param fromConfig the config version to use
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, long)
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java

    /**
     * Same as {@link #withNewMembers(java.util.List)} with stat and config version
     *
     * @param servers The servers joining.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param stat stat to hold the stat value
     * @param fromConfig the config version to use
     * @see #withNewMembers(java.util.List, long)
     * @see #withNewMembers(java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param fromConfig the config version to use
     * @see #withNewMembers(java.util.List, long)
     * @see #withNewMembers(java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param fromConfig the config version to use
     * @see #withNewMembers(java.util.List, long)
     * @see #withNewMembers(java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param leaving The servers leaving
     * @param fromConfig the config version to use
     * @see #withJoiningAndLeaving(java.util.List, java.util.List)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param leaving The servers leaving
     * @param fromConfig the config version to use
     * @see #withJoiningAndLeaving(java.util.List, java.util.List)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java

    /**
     * Same as {@link #withNewMembers(java.util.List)} but allows specified the configuration version to use.
     * By default the configuration version is -1.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param servers The new server list
     * @param fromConfig the config version to use
     * @see #withNewMembers(java.util.List)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java

    /**
     * Same as {@link #withJoiningAndLeaving(java.util.List, java.util.List)}
     * but allows a stat to hold the stat info from "/zookeeper/config"
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java

    /**
     * Same as {@link #withJoiningAndLeaving(java.util.List, java.util.List)}
     * but allows a stat to hold the stat info from "/zookeeper/config"
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param leaving The servers leaving
     * @param stat stat to hold the stat value
     * @see #withJoiningAndLeaving(java.util.List, java.util.List)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param leaving The servers leaving
     * @param stat stat to hold the stat value
     * @see #withJoiningAndLeaving(java.util.List, java.util.List)
     * @return this
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
     *
     * <p>
     * Note: if the any of the nodes in the path do not exist yet, {@link org.apache.zookeeper.KeeperException.NoNodeException}
     * is <strong>NOT</strong> set. Instead the stage is completed with an empty map.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
     *
     * @param lock lock to release
     * @param ignoreNoLockExceptions if true {@link java.lang.IllegalStateException} is ignored
     */
    public static void release(InterProcessLock lock, boolean ignoreNoLockExceptions)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
     *
     * <p>
     * Note: if the any of the nodes in the path do not exist yet, {@link org.apache.zookeeper.KeeperException.NoNodeException}
     * is <strong>NOT</strong> set. Instead the stage is completed with an empty map.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFrameworkBuilder.java`
#### Snippet
```java
    /**
     * Add watchers as appropriate to the Modeled Curator's ZNode using
     * {@link org.apache.curator.x.async.WatchMode#stateChangeAndSuccess}
     *
     * @return this for chaining
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * @param storingStatIn the stat for the new ZNode is stored here
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<String> set(T model, Stat storingStatIn, int version);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * <p>
     *     The replacement is the <code>toString()</code> value of child or,
     *     if it implements {@link org.apache.curator.x.async.modeled.NodeName},
     *     the value of <code>nodeName()</code>.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     *
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<Stat> checkExists();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * <p>
     *     The replacement is the <code>toString()</code> value of child or,
     *     if it implements {@link org.apache.curator.x.async.modeled.NodeName},
     *     the value of <code>nodeName()</code>.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * @param model model to write
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<Stat> update(T model);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * @param model model to write
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<String> set(T model);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java

    /**
     * Returns the client that was originally passed to {@link #wrap(org.apache.curator.x.async.AsyncCuratorFramework, ModelSpec)} or
     * the builder.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     *
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<T> read();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     *
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<ZNode<T>> readAsZNode();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
    /**
     * Create operation instance that can be passed among other operations to
     * {@link #inTransaction(java.util.List)} to be executed as a single transaction.
     *
     * @param model the model
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
    /**
     * Start a new ModeledFrameworkBuilder. A client and model must be provided prior to the instance
     * being built via {@link org.apache.curator.x.async.modeled.ModeledFrameworkBuilder#withClient(org.apache.curator.x.async.AsyncCuratorFramework)}
     * and {@link org.apache.curator.x.async.modeled.ModeledFrameworkBuilder#withModelSpec(ModelSpec)}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
    /**
     * Start a new ModeledFrameworkBuilder. A client and model must be provided prior to the instance
     * being built via {@link org.apache.curator.x.async.modeled.ModeledFrameworkBuilder#withClient(org.apache.curator.x.async.AsyncCuratorFramework)}
     * and {@link org.apache.curator.x.async.modeled.ModeledFrameworkBuilder#withModelSpec(ModelSpec)}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * Start a new ModeledFrameworkBuilder. A client and model must be provided prior to the instance
     * being built via {@link org.apache.curator.x.async.modeled.ModeledFrameworkBuilder#withClient(org.apache.curator.x.async.AsyncCuratorFramework)}
     * and {@link org.apache.curator.x.async.modeled.ModeledFrameworkBuilder#withModelSpec(ModelSpec)}
     *
     * @return builder
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * @param version update version to use
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<Void> delete(int version);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * @param version update version to use
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<Stat> update(T model, int version);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.cached` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     *     Use an internally created cache as a front for this modeled instance. All read APIs use the internal
     *     cache. i.e. read calls always use the cache instead of making direct queries. Note: you must call
     *     {@link org.apache.curator.x.async.modeled.cached.CachedModeledFramework#start()} and
     *     {@link org.apache.curator.x.async.modeled.cached.CachedModeledFramework#close()} to start/stop
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.cached` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     *     cache. i.e. read calls always use the cache instead of making direct queries. Note: you must call
     *     {@link org.apache.curator.x.async.modeled.cached.CachedModeledFramework#start()} and
     *     {@link org.apache.curator.x.async.modeled.cached.CachedModeledFramework#close()} to start/stop
     * </p>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * <p>
     *     Note: this method internally allocates an Executor for the cache and read methods. Use
     *     {@link #cached(java.util.concurrent.ExecutorService)} if you'd like to provide your own executor service.
     * </p>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     *
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<List<ZPath>> children();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
    /**
     * Delete operation instance that can be passed among other operations to
     * {@link #inTransaction(java.util.List)} to be executed as a single transaction.
     *
     * @param version delete version to use
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
    /**
     * Create operation instance that can be passed among other operations to
     * {@link #inTransaction(java.util.List)} to be executed as a single transaction. Note:
     * due to ZooKeeper transaction limits, this is a _not_ a "set or update" operation but only
     * a create operation and will generate an error if the node already exists.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * @param storingStatIn the stat for the new ZNode is stored here
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<T> read(Stat storingStatIn);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * @param storingStatIn the stat for the new ZNode is stored here
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<String> set(T model, Stat storingStatIn);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
    /**
     * Check exists operation instance that can be passed among other operations to
     * {@link #inTransaction(java.util.List)} to be executed as a single transaction.
     *
     * @return operation
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     *
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<List<ZNode<T>>> childrenAsZNodes();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
    /**
     * Delete operation instance that can be passed among other operations to
     * {@link #inTransaction(java.util.List)} to be executed as a single transaction.
     *
     * @return operation
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
    /**
     * Check exists operation instance that can be passed among other operations to
     * {@link #inTransaction(java.util.List)} to be executed as a single transaction.
     *
     * @param version version to use
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
    /**
     * Update operation instance that can be passed among other operations to
     * {@link #inTransaction(java.util.List)} to be executed as a single transaction.
     *
     * @param model the model
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     *
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<Void> delete();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledFramework.java`
#### Snippet
```java
     * @param version if data is being set instead of creating the node, the data version to use
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<String> set(T model, int version);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpecBuilder.java`
#### Snippet
```java

    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpecBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpec.java`
#### Snippet
```java
     * <p>
     *     The replacement is the <code>toString()</code> value of child or,
     *     if it implements {@link org.apache.curator.x.async.modeled.NodeName},
     *     the value of <code>nodeName()</code>.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpec.java`
#### Snippet
```java
     * <p>
     *     Return a new CuratorModel instance with all the same options but using a resolved
     *     path by calling {@link org.apache.curator.x.async.modeled.ZPath#resolved(Object...)}
     *     using the given parameters
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpec.java`
#### Snippet
```java
     * <p>
     *     The replacement is the <code>toString()</code> value of the parameter object or,
     *     if the object implements {@link org.apache.curator.x.async.modeled.NodeName},
     *     the value of <code>nodeName()</code>.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpec.java`
#### Snippet
```java
     * <p>
     *     The replacement is the <code>toString()</code> value of child or,
     *     if it implements {@link org.apache.curator.x.async.modeled.NodeName},
     *     the value of <code>nodeName()</code>.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpec.java`
#### Snippet
```java
     * <p>
     *     Return a new CuratorModel instance with all the same options but using a resolved
     *     path by calling {@link org.apache.curator.x.async.modeled.ZPath#resolved(java.util.List)}
     *     using the given parameters
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpec.java`
#### Snippet
```java
     * <p>
     *     Return a new CuratorModel instance with all the same options but using a resolved
     *     path by calling {@link org.apache.curator.x.async.modeled.ZPath#resolved(java.util.List)}
     *     using the given parameters
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpec.java`
#### Snippet
```java
     * <p>
     *     The replacement is the <code>toString()</code> value of the parameter object or,
     *     if the object implements {@link org.apache.curator.x.async.modeled.NodeName},
     *     the value of <code>nodeName()</code>.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath6.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedZPath}, but with 6 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath6.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath6.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec4.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModelSpec}, but with 4 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath9.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath9.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath9.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedZPath}, but with 9 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework2.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModeledFramework}, but with 2 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath4.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedZPath}, but with 4 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath4.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath4.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec7.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModelSpec}, but with 7 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath10.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath10.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath10.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedZPath}, but with 10 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath7.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath7.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath7.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedZPath}, but with 7 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework0.java`
#### Snippet
```java
    /**
     * Return a new TypedModeledFramework using the given modeled framework builder and typed model spec.
     * When {@link #resolved(org.apache.curator.x.async.AsyncCuratorFramework)} is called the actual ModeledFramework is generated with the
     * resolved model spec
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework0.java`
#### Snippet
```java
    /**
     * Return a new TypedModeledFramework using the given modeled framework builder, model spec builder and a path with ids.
     * When {@link #resolved(org.apache.curator.x.async.AsyncCuratorFramework)} is called the actual ModeledFramework is generated with the
     * resolved model spec and resolved path
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath3.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath3.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath3.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedZPath}, but with 3 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ZPath.java`
#### Snippet
```java
     * <p>
     *     The replacement is the <code>toString()</code> value of the parameter object or,
     *     if the object implements {@link org.apache.curator.x.async.modeled.NodeName},
     *     the value of <code>nodeName()</code>.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ZPath.java`
#### Snippet
```java
     * <p>
     *     The replacement is the <code>toString()</code> value of the parameter object or,
     *     if the object implements {@link org.apache.curator.x.async.modeled.NodeName},
     *     the value of <code>nodeName()</code>.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ZPath.java`
#### Snippet
```java
     * <p>
     *     The replacement is the <code>toString()</code> value of child or,
     *     if it implements {@link org.apache.curator.x.async.modeled.NodeName},
     *     the value of <code>nodeName()</code>.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework5.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModeledFramework}, but with 5 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath0.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath0.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath5.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath5.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath5.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedZPath}, but with 5 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath2.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedZPath}, but with 2 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath2.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath2.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec3.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModelSpec}, but with 3 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec6.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModelSpec}, but with 6 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec10.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModelSpec}, but with 10 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec2.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModelSpec}, but with 2 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework4.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModeledFramework}, but with 4 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework8.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModeledFramework}, but with 8 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework7.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModeledFramework}, but with 7 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework3.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModeledFramework}, but with 3 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec9.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModelSpec}, but with 9 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath8.java`
#### Snippet
```java

    /**
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath8.java`
#### Snippet
```java
     * Return a TypedZPath using {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     *
     * @param pathWithIds path to pass to {@link org.apache.curator.x.async.modeled.ZPath#parseWithIds}
     * @return TypedZPath
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedZPath8.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedZPath}, but with 8 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/ModeledCache.java`
#### Snippet
```java
     * Return the modeled current data for the given path. There are no guarantees of accuracy. This is
     * merely the most recent view of the data. If there is no node at the given path,
     * {@link java.util.Optional#empty()} is returned.
     *
     * @param path path to the node to check
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/CachedModeledFramework.java`
#### Snippet
```java
     *
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<T> readThrough();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/CachedModeledFramework.java`
#### Snippet
```java

    /**
     * Same as {@link org.apache.curator.x.async.modeled.ModeledFramework#childrenAsZNodes()}
     * but always reads from cache - i.e. no additional queries to ZooKeeper are made
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/CachedModeledFramework.java`
#### Snippet
```java
     *
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<ZNode<T>> readThroughAsZNode();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/CachedModeledFramework.java`
#### Snippet
```java

    /**
     * Same as {@link #read(org.apache.zookeeper.data.Stat)} except that if the cache does not have a value
     * for this path a direct query is made.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/CachedModeledFramework.java`
#### Snippet
```java
     * @param storingStatIn the stat for the new ZNode is stored here
     * @return AsyncStage
     * @see org.apache.curator.x.async.AsyncStage
     */
    AsyncStage<T> readThrough(Stat storingStatIn);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.cached` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/ModeledCacheListener.java`
#### Snippet
```java
    /**
     * Returns a version of this listener that only begins calling
     * {@link #accept(org.apache.curator.x.async.modeled.cached.ModeledCacheListener.Type, org.apache.curator.x.async.modeled.ZPath, org.apache.zookeeper.data.Stat, Object)}
     * once {@link #initialized()} has been called. i.e. changes that occur as the cache is initializing are not sent
     * to the listener
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/ModeledCacheListener.java`
#### Snippet
```java
    /**
     * Returns a version of this listener that only begins calling
     * {@link #accept(org.apache.curator.x.async.modeled.cached.ModeledCacheListener.Type, org.apache.curator.x.async.modeled.ZPath, org.apache.zookeeper.data.Stat, Object)}
     * once {@link #initialized()} has been called. i.e. changes that occur as the cache is initializing are not sent
     * to the listener
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/ModeledCacheListener.java`
#### Snippet
```java
    /**
     * Returns a version of this listener that only begins calling
     * {@link #accept(org.apache.curator.x.async.modeled.cached.ModeledCacheListener.Type, org.apache.curator.x.async.modeled.ZPath, org.apache.zookeeper.data.Stat, Object)}
     * once {@link #initialized()} has been called. i.e. changes that occur as the cache is initializing are not sent
     * to the listener
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec5.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModelSpec}, but with 5 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework6.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModeledFramework}, but with 6 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModelSpec8.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModelSpec}, but with 8 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/versioned/VersionedModeledFramework.java`
#### Snippet
```java

    /**
     * @see org.apache.curator.x.async.modeled.ModeledFramework#set(Object, org.apache.zookeeper.data.Stat)
     */
    AsyncStage<String> set(Versioned<T> model, Stat storingStatIn);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.data` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/versioned/VersionedModeledFramework.java`
#### Snippet
```java

    /**
     * @see org.apache.curator.x.async.modeled.ModeledFramework#read(org.apache.zookeeper.data.Stat)
     */
    AsyncStage<Versioned<T>> read(Stat storingStatIn);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework10.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModeledFramework}, but with 10 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.modeled.typed` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/typed/TypedModeledFramework9.java`
#### Snippet
```java

/**
 * Same as {@link org.apache.curator.x.async.modeled.typed.TypedModeledFramework}, but with 9 parameters
 */
@FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.async.migrations` is unnecessary and can be removed
in `curator-x-async/src/main/java/org/apache/curator/x/async/migrations/MigrationManager.java`
#### Snippet
```java
     * @param set the set
     * @return completion stage. If there is a migration-specific error, the stage will be completed
     * exceptionally with {@link org.apache.curator.x.async.migrations.MigrationException}.
     */
    public CompletionStage<Void> migrate(MigrationSet set)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.discovery` is unnecessary and can be removed
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/JsonInstanceSerializer.java`
#### Snippet
```java

    /**
     * CURATOR-275 introduced a new field into {@link org.apache.curator.x.discovery.ServiceInstance}. This caused a potential
     * {@link com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException} in older clients that
     * read newly serialized ServiceInstances. If you are susceptible to this you should set the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.discovery.details` is unnecessary and can be removed
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/JsonInstanceSerializer.java`
#### Snippet
```java
     * {@link com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException} in older clients that
     * read newly serialized ServiceInstances. If you are susceptible to this you should set the
     * serializer to be an instance of {@link org.apache.curator.x.discovery.details.JsonInstanceSerializer}
     * with <code>compatibleSerializationMode</code> set to true. IMPORTANT: when this is done, the new <code>enabled</code>
     * field of ServiceInstance is <strong>not</strong> serialized. If however you <em>do</em> want
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.x.discovery` is unnecessary and can be removed
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/JsonInstanceSerializer.java`
#### Snippet
```java

    /**
     * CURATOR-275 introduced a new field into {@link org.apache.curator.x.discovery.ServiceInstance}. This caused a potential
     * {@link com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException} in older clients that
     * read newly serialized ServiceInstances. Therefore the default behavior of JsonInstanceSerializer
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheEvent.java`
#### Snippet
```java

    /**
     * @return the node's old data when the type is {@link org.apache.curator.framework.recipes.cache.TreeCacheEvent.Type#NODE_UPDATED}
     */
    public ChildData getOldData()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilder.java`
#### Snippet
```java

    /**
     * Bridge listener. You can reuse old-style {@link org.apache.curator.framework.recipes.cache.NodeCacheListener}s
     * with CuratorCache.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilder.java`
#### Snippet
```java

    /**
     * Bridge listener. You can reuse old-style {@link org.apache.curator.framework.recipes.cache.PathChildrenCacheListener}s
     * with CuratorCache. IMPORTANT: the connection state methods in the listener will never be called as CuratorCache
     * does not register the listener with the connection state listener container. Also note that CuratorCache
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilder.java`
#### Snippet
```java
     * with CuratorCache. IMPORTANT: the connection state methods in the listener will never be called as CuratorCache
     * does not register the listener with the connection state listener container. Also note that CuratorCache
     * behaves differently than {@link org.apache.curator.framework.recipes.cache.PathChildrenCache} so
     * things such as event ordering will likely be different.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilder.java`
#### Snippet
```java

    /**
     * Bridge listener. You can reuse old-style {@link org.apache.curator.framework.recipes.cache.TreeCacheListener}s
     * with CuratorCache. IMPORTANT: the connection state methods in the listener will never be called as CuratorCache
     * does not register the listener with the connection state listener container. Also note that CuratorCache
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilder.java`
#### Snippet
```java
     * with CuratorCache. IMPORTANT: the connection state methods in the listener will never be called as CuratorCache
     * does not register the listener with the connection state listener container. Also note that CuratorCache
     * behaves differently than {@link org.apache.curator.framework.recipes.cache.TreeCache} so
     * things such as event ordering will likely be different.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCache.java`
#### Snippet
```java
    /**
     * Start a Curator Cache Bridge builder. A Curator Cache Bridge is
     * a facade that uses {@link org.apache.curator.framework.recipes.cache.CuratorCache} if
     * persistent watches are available or {@link org.apache.curator.framework.recipes.cache.TreeCache}
     * otherwise (i.e. if you are using ZooKeeper 3.5.x).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCache.java`
#### Snippet
```java
     * Start a Curator Cache Bridge builder. A Curator Cache Bridge is
     * a facade that uses {@link org.apache.curator.framework.recipes.cache.CuratorCache} if
     * persistent watches are available or {@link org.apache.curator.framework.recipes.cache.TreeCache}
     * otherwise (i.e. if you are using ZooKeeper 3.5.x).
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/NodeCache.java`
#### Snippet
```java
 * when updating data to avoid overwriting another process' change.</p>
 *
 * @deprecated replace by {@link org.apache.curator.framework.recipes.cache.CuratorCache}
 */
@Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheBridge.java`
#### Snippet
```java
{
    /**
     * Returns true if the underlying cache is {@link org.apache.curator.framework.recipes.cache.CuratorCache} (i.e. ZooKeeper 3.6+).
     * Otherwise it is {@link org.apache.curator.framework.recipes.cache.TreeCache} (i.e. ZooKeeper 3.5.x)
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheBridge.java`
#### Snippet
```java
    /**
     * Returns true if the underlying cache is {@link org.apache.curator.framework.recipes.cache.CuratorCache} (i.e. ZooKeeper 3.6+).
     * Otherwise it is {@link org.apache.curator.framework.recipes.cache.TreeCache} (i.e. ZooKeeper 3.5.x)
     *
     * @return true/false
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheBridge.java`
#### Snippet
```java

/**
 * A facade that uses {@link org.apache.curator.framework.recipes.cache.CuratorCache} if
 * persistent watches are available or a {@link org.apache.curator.framework.recipes.cache.TreeCache}
 * otherwise
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheBridge.java`
#### Snippet
```java
/**
 * A facade that uses {@link org.apache.curator.framework.recipes.cache.CuratorCache} if
 * persistent watches are available or a {@link org.apache.curator.framework.recipes.cache.TreeCache}
 * otherwise
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheBridgeBuilder.java`
#### Snippet
```java

    /**
     * If the old {@link org.apache.curator.framework.recipes.cache.TreeCache} is used by the bridge
     * (i.e. you are using ZooKeeper 3.5.x) then this executor service is passed to {@link org.apache.curator.framework.recipes.cache.TreeCache.Builder#setExecutor(java.util.concurrent.ExecutorService)}.
     * For {@link org.apache.curator.framework.recipes.cache.CuratorCache} this is not used and will be ignored (a warning will be logged).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheBridgeBuilder.java`
#### Snippet
```java
    /**
     * If the old {@link org.apache.curator.framework.recipes.cache.TreeCache} is used by the bridge
     * (i.e. you are using ZooKeeper 3.5.x) then this executor service is passed to {@link org.apache.curator.framework.recipes.cache.TreeCache.Builder#setExecutor(java.util.concurrent.ExecutorService)}.
     * For {@link org.apache.curator.framework.recipes.cache.CuratorCache} this is not used and will be ignored (a warning will be logged).
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheBridgeBuilder.java`
#### Snippet
```java
    /**
     * If the old {@link org.apache.curator.framework.recipes.cache.TreeCache} is used by the bridge
     * (i.e. you are using ZooKeeper 3.5.x) then this executor service is passed to {@link org.apache.curator.framework.recipes.cache.TreeCache.Builder#setExecutor(java.util.concurrent.ExecutorService)}.
     * For {@link org.apache.curator.framework.recipes.cache.CuratorCache} this is not used and will be ignored (a warning will be logged).
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheBridgeBuilder.java`
#### Snippet
```java
     * If the old {@link org.apache.curator.framework.recipes.cache.TreeCache} is used by the bridge
     * (i.e. you are using ZooKeeper 3.5.x) then this executor service is passed to {@link org.apache.curator.framework.recipes.cache.TreeCache.Builder#setExecutor(java.util.concurrent.ExecutorService)}.
     * For {@link org.apache.curator.framework.recipes.cache.CuratorCache} this is not used and will be ignored (a warning will be logged).
     *
     * @param executorService executor to use for ZooKeeper 3.5.x
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.locks` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreMutex.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * <p>NOTE: Unlike other implementations of {@link org.apache.curator.framework.recipes.locks.InterProcessLock#release()},
     * this method will NOT throw an exception if it is called on a different thread than the one which acquired the lock.</p>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
 * when updating data to avoid overwriting another process' change.</p>
 *
 * @deprecated replace by {@link org.apache.curator.framework.recipes.cache.CuratorCache}
 */
@Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.curator.framework.recipes.cache` is unnecessary and can be removed
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
 * when updating data to avoid overwriting another process' change.</p>
 *
 * @deprecated replace by {@link org.apache.curator.framework.recipes.cache.CuratorCache}
 */
@Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-test/src/main/java/org/apache/curator/test/compatibility/Timing2.java`
#### Snippet
```java
     *
     * @param semaphore the semaphore
     * @return result of {@link java.util.concurrent.Semaphore#tryAcquire()}
     */
    public boolean acquireSemaphore(Semaphore semaphore)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-test/src/main/java/org/apache/curator/test/compatibility/Timing2.java`
#### Snippet
```java
     *
     * @param latch latch to wait on
     * @return result of {@link java.util.concurrent.CountDownLatch#await(long, java.util.concurrent.TimeUnit)}
     */
    public boolean awaitLatch(CountDownLatch latch)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-test/src/main/java/org/apache/curator/test/compatibility/Timing2.java`
#### Snippet
```java
     *
     * @param latch latch to wait on
     * @return result of {@link java.util.concurrent.CountDownLatch#await(long, java.util.concurrent.TimeUnit)}
     */
    public boolean awaitLatch(CountDownLatch latch)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-test/src/main/java/org/apache/curator/test/compatibility/Timing2.java`
#### Snippet
```java
     * @param semaphore the semaphore
     * @param n         number of permits to acquire
     * @return result of {@link java.util.concurrent.Semaphore#tryAcquire(int, long, java.util.concurrent.TimeUnit)}
     */
    public boolean acquireSemaphore(Semaphore semaphore, int n)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `curator-test/src/main/java/org/apache/curator/test/compatibility/Timing2.java`
#### Snippet
```java
     * @param semaphore the semaphore
     * @param n         number of permits to acquire
     * @return result of {@link java.util.concurrent.Semaphore#tryAcquire(int, long, java.util.concurrent.TimeUnit)}
     */
    public boolean acquireSemaphore(Semaphore semaphore, int n)
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
        client.getUnhandledErrorListenable().addListener((message, e) -> {
            System.err.println("error=" + message);
            e.printStackTrace();
        });
        client.getConnectionStateListenable().addListener((c, newState) -> {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
        watchedStage.exceptionally(exception -> {
            AsyncEventException asyncEx = (AsyncEventException)exception;
            asyncEx.printStackTrace();    // handle the error as needed
            handleWatchedStage(asyncEx.reset());
            return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
            {
                // there was a problem creating the node
                exception.printStackTrace();
            }
            else
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
            {
                // there was a problem
                exception.printStackTrace();
            }
            else
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
            {
                // there was a problem creating the node
                exception.printStackTrace();
            }
            else
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-examples/src/main/java/locking/LockingExample.java`
#### Snippet
```java
                        catch ( Exception e )
                        {
                            e.printStackTrace();
                            // log or do something
                        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-examples/src/main/java/modeled/ModeledCuratorExamplesAlt.java`
#### Snippet
```java
            if ( exception != null )
            {
                exception.printStackTrace();    // handle the error
            }
            else
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-examples/src/main/java/modeled/ModeledCuratorExamples.java`
#### Snippet
```java
            if ( exception != null )
            {
                exception.printStackTrace();    // handle the error
            }
            else
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
        catch ( Exception e )
        {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/WatchersDebug.java`
#### Snippet
```java
        catch ( NoSuchMethodException e )
        {
            e.printStackTrace();
        }
        getDataWatches = localGetDataWatches;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/BaseClassForTests.java`
#### Snippet
```java
        catch ( Exception e )
        {
            e.printStackTrace();
        }
        INTERNAL_PROPERTY_DONT_LOG_CONNECTION_ISSUES = logConnectionIssues;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/BaseClassForTests.java`
#### Snippet
```java
        catch ( Exception e )
        {
            e.printStackTrace();
        }
        INTERNAL_PROPERTY_REMOVE_WATCHERS_IN_FOREGROUND = s;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/BaseClassForTests.java`
#### Snippet
```java
        catch ( Exception e )
        {
            e.printStackTrace();
        }
        INTERNAL_PROPERTY_VALIDATE_NAMESPACE_WATCHER_MAP_EMPTY = s;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/BaseClassForTests.java`
#### Snippet
```java
            catch ( IOException e )
            {
                e.printStackTrace();
            }
            finally
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/TestingQuorumPeerMain.java`
#### Snippet
```java
        catch ( Exception e )
        {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/ServerHelper.java`
#### Snippet
```java
        catch ( Exception e )
        {
            e.printStackTrace();
            throw new Error(e);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/ServerHelper.java`
#### Snippet
```java
        catch ( Exception e )
        {
            e.printStackTrace();
            throw new Error(e);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/TestingZooKeeperMain.java`
#### Snippet
```java
        catch ( Exception e )
        {
            e.printStackTrace();    // just ignore - this class is only for testing
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/TestingZooKeeperMain.java`
#### Snippet
```java
        catch ( Throwable e )
        {
            e.printStackTrace();    // just ignore - this class is only for testing
        }
        finally
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `curator-test/src/main/java/org/apache/curator/test/TestingZooKeeperMain.java`
#### Snippet
```java
        catch ( Throwable e )
        {
            e.printStackTrace();    // just ignore - this class is only for testing
        }
        finally
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.apache.curator.drivers.TracerDriver;`
in `curator-client/src/main/java/org/apache/curator/drivers/OperationTrace.java`
#### Snippet
```java
package org.apache.curator.drivers;

import org.apache.curator.drivers.TracerDriver;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;
```

### SamePackageImport
Unnecessary import from the same package `import org.apache.curator.framework.recipes.cache.ChildData;`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/NodeCacheListenerWrapper.java`
#### Snippet
```java
package org.apache.curator.framework.recipes.cache;

import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;

```

### SamePackageImport
Unnecessary import from the same package `import org.apache.curator.framework.recipes.cache.NodeCacheListener;`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/NodeCacheListenerWrapper.java`
#### Snippet
```java

import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;

class NodeCacheListenerWrapper implements CuratorCacheListener
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DiscoveryResource()` of an abstract class should not be declared 'public'
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/DiscoveryResource.java`
#### Snippet
```java
    private final DiscoveryContext<T> context;

    public DiscoveryResource(DiscoveryContext<T> context)
    {
        this.context = context;
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTempFrameworkImpl.java`
#### Snippet
```java
            cleanup = Executors.newScheduledThreadPool(1, threadFactory);

            Runnable        command = new Runnable()
            {
                @Override
                public void run()
```

### Anonymous2MethodRef
Anonymous new Callable\>() can be replaced with method reference
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTransactionImpl.java`
#### Snippet
```java
            (
                client.getZookeeperClient(),
                new Callable<List<OpResult>>()
                {
                    @Override
                    public List<OpResult> call() throws Exception
```

### Anonymous2MethodRef
Anonymous new Function() can be replaced with method reference
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java

        this.useDefaultSchema = useDefaultSchema;
        this.schemas = Maps.uniqueIndex(schemas, new Function<Schema, String>()
        {
            @Override
            public String apply(Schema schema)
```

### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/InstanceCleanup.java`
#### Snippet
```java
        service.scheduleWithFixedDelay
        (
            new Runnable()
            {
                @Override
                public void run()
```

### Anonymous2MethodRef
Anonymous new LockInternalsSorter() can be replaced with method reference
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java
    private static final String LOCK_NAME = "latch-";

    private static final LockInternalsSorter sorter = new LockInternalsSorter()
    {
        @Override
        public String fixForSorting(String str, String lockName)
```

### Anonymous2MethodRef
Anonymous new Function() can be replaced with method reference
in `curator-test/src/main/java/org/apache/curator/test/TestingCluster.java`
#### Snippet
```java
            (
                servers,
                new Function<TestingZooKeeperServer, InstanceSpec>()
                {
                    @Override
                    public InstanceSpec apply(TestingZooKeeperServer server)
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Thread.UncaughtExceptionHandler() can be replaced with lambda
in `curator-client/src/main/java/org/apache/curator/utils/ThreadUtils.java`
#### Snippet
```java
    public static ThreadFactory newGenericThreadFactory(String processName)
    {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = new Thread.UncaughtExceptionHandler()
        {
            @Override
            public void uncaughtException(Thread t, Throwable e)
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/TempGetDataBuilderImpl.java`
#### Snippet
```java
        (
            client.getZookeeperClient(),
            new Callable<byte[]>()
            {
                @Override
                public byte[] call() throws Exception
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransactionResult.java`
#### Snippet
```java
    public static Predicate<CuratorTransactionResult> ofTypeAndPath(final OperationType type, final String forPath)
    {
        return new Predicate<CuratorTransactionResult>()
        {
            @Override
            public boolean apply(CuratorTransactionResult result)
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetConfigBuilderImpl.java`
#### Snippet
```java
            (
                client.getZookeeperClient(),
                new Callable<byte[]>()
                {
                    @Override
                    public byte[] call() throws Exception
```

### Convert2Lambda
Anonymous new Callable\>() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetChildrenBuilderImpl.java`
#### Snippet
```java
        (
            client.getZookeeperClient(),
            new Callable<List<String>>()
            {
                @Override
                public List<String> call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/RemoveWatchesBuilderImpl.java`
#### Snippet
```java
            final NamespaceWatcher finalNamespaceWatcher = namespaceWatcher;
            RetryLoop.callWithRetry(client.getZookeeperClient(),
                    new Callable<Void>()
                    {
                        @Override
                        public Void call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetDataBuilderImpl.java`
#### Snippet
```java
        (
            client.getZookeeperClient(),
            new Callable<byte[]>()
            {
                @Override
                public byte[] call() throws Exception
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/Backgrounding.java`
#### Snippet
```java
                executor.execute
                    (
                        new Runnable()
                        {
                            @Override
                            public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTempFrameworkImpl.java`
#### Snippet
```java
            cleanup = Executors.newScheduledThreadPool(1, threadFactory);

            Runnable        command = new Runnable()
            {
                @Override
                public void run()
```

### Convert2Lambda
Anonymous new Callable\>() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetACLBuilderImpl.java`
#### Snippet
```java
        (
            client.getZookeeperClient(),
            new Callable<List<ACL>>()
            {
                @Override
                public List<ACL> call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java

            executorService = Executors.newSingleThreadScheduledExecutor(threadFactory);
            executorService.submit(new Callable<Object>()
            {
                @Override
                public Object call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetACLBuilderImpl.java`
#### Snippet
```java
        (
            client.getZookeeperClient(),
            new Callable<Stat>()
            {
                @Override
                public Stat call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/ExistsBuilderImpl.java`
#### Snippet
```java
                (
                    client.getZookeeperClient(),
                    new Callable<Void>()
                    {
                        @Override
                        public Void call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/ExistsBuilderImpl.java`
#### Snippet
```java
        (
            client.getZookeeperClient(),
            new Callable<Stat>()
            {
                @Override
                public Stat call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/DeleteBuilderImpl.java`
#### Snippet
```java
                (
                    client.getZookeeperClient(),
                    new Callable<Void>()
                    {
                        @Override
                        public Void call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
        (
            client.getZookeeperClient(),
            new Callable<Stat>()
            {
                @Override
                public Stat call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceImpl.java`
#### Snippet
```java
                (
                    zookeeperClient,
                    new Callable<Object>()
                    {
                        @Override
                        public Object call() throws Exception
```

### Convert2Lambda
Anonymous new Callable\>() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTransactionImpl.java`
#### Snippet
```java
            (
                client.getZookeeperClient(),
                new Callable<List<OpResult>>()
                {
                    @Override
                    public List<OpResult> call() throws Exception
```

### Convert2Lambda
Anonymous new Callable\>() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorMultiTransactionImpl.java`
#### Snippet
```java
        (
            client.getZookeeperClient(),
            new Callable<List<OpResult>>()
            {
                @Override
                public List<OpResult> call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateManager.java`
#### Snippet
```java
        service.submit
            (
                new Callable<Object>()
                {
                    @Override
                    public Object call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/ReconfigBuilderImpl.java`
#### Snippet
```java
            (
                client.getZookeeperClient(),
                new Callable<byte[]>()
                {
                    @Override
                    public byte[] call() throws Exception
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java

        this.useDefaultSchema = useDefaultSchema;
        this.schemas = Maps.uniqueIndex(schemas, new Function<Schema, String>()
        {
            @Override
            public String apply(Schema schema)
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-client/src/main/java/org/apache/curator/utils/EnsurePath.java`
#### Snippet
```java
                    (
                        client,
                        new Callable<Object>()
                        {
                            @Override
                            public Object call() throws Exception
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/rest/InstanceCleanup.java`
#### Snippet
```java
        service.scheduleWithFixedDelay
        (
            new Runnable()
            {
                @Override
                public void run()
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-examples/src/main/java/locking/LockingExample.java`
#### Snippet
```java
            {
                final int       index = i;
                Callable<Void>  task = new Callable<Void>()
                {
                    @Override
                    public Void call() throws Exception
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/AfterConnectionEstablished.java`
#### Snippet
```java
        //Block until connected
        final ExecutorService executor = ThreadUtils.newSingleThreadExecutor(ThreadUtils.getProcessName(runAfterConnection.getClass()));
        Runnable internalCall = new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `curator-examples/src/main/java/discovery/DiscoveryExample.java`
#### Snippet
```java
        (
            servers,
            new Predicate<ExampleServer>()
            {
                @Override
                public boolean apply(ExampleServer server)
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
        {
            LOG.debug("publishEvent: {}", event);
            executorService.submit(new Runnable()
            {
                @Override
                public void run()
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessReadWriteLock.java`
#### Snippet
```java
        final public Collection<String> getParticipantNodes() throws Exception
        {
            return ImmutableList.copyOf(Iterables.filter(super.getParticipantNodes(), new Predicate<String>() {
                @Override
                public boolean apply(String node) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessMutex.java`
#### Snippet
```java
    public void makeRevocable(final RevocationListener<InterProcessMutex> listener, Executor executor)
    {
        internals.makeRevocable(new RevocationSpec(executor, new Runnable()
            {
                @Override
                public void run()
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentTtlNode.java`
#### Snippet
```java
        node.start();

        Runnable touchTask = new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
        (
            sortedList,
            new Comparator<String>()
            {
                @Override
                public int compare(String lhs, String rhs)
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
            (
                sortedList,
                new Comparator<String>()
                {
                    @Override
                    public int compare(String lhs, String rhs)
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
            (
                names,
                new Function<String, String>()
                {
                    @Override
                    public String apply(String name)
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
            (
                localInitialSet,
                new Predicate<ChildData>()
                {
                    @Override
                    public boolean apply(ChildData input)
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
            submitToExecutor
            (
                new Runnable()
                {
                    @Override
                    public void run()
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedIdQueue.java`
#### Snippet
```java
        (
            children,
            new Comparator<String>()
            {
                @Override
                public int compare(String o1, String o2)
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSharder.java`
#### Snippet
```java
        service.submit
        (
            new Callable<Void>()
            {
                @Override
                public Void call() throws Exception
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedDelayQueue.java`
#### Snippet
```java
                (
                    children,
                    new Comparator<String>()
                    {
                        @Override
                        public int compare(String o1, String o2)
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java
        Preconditions.checkState(state.compareAndSet(State.LATENT, State.STARTED), "Cannot be started more than once");

        startTask.set(AfterConnectionEstablished.execute(client, new Runnable()
        {
            @Override
            public void run()
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
        if ( ourTask == null && (state.get() == State.STARTED) )
        {
            ourTask = executorService.submit(new Callable<Void>()
            {
                @Override
                public Void call() throws Exception
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/barriers/DistributedDoubleBarrier.java`
#### Snippet
```java
        (
            children,
            new Predicate<String>()
            {
                @Override
                public boolean apply(String name)
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
            executor.execute
            (
                new Runnable()
                {
                    @Override
                    public void run()
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
            service.submit
                (
                    new Callable<Object>()
                    {
                        @Override
                        public Object call()
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
            (
                client.getZookeeperClient(),
                new Callable<String>()
                {
                    @Override
                    public String call() throws Exception
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
            (
                client.getZookeeperClient(),
                new Callable<String>()
                {
                    @Override
                    public String call() throws Exception
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
            (
                children,
                new Predicate<String>()
                {
                    @Override
                    public boolean apply(String node)
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `curator-test/src/main/java/org/apache/curator/test/TestingCluster.java`
#### Snippet
```java
            (
                servers,
                new Function<TestingZooKeeperServer, InstanceSpec>()
                {
                    @Override
                    public InstanceSpec apply(TestingZooKeeperServer server)
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `maxRetries`
in `curator-client/src/main/java/org/apache/curator/retry/ExponentialBackoffRetry.java`
#### Snippet
```java
        {
            log.warn(String.format("maxRetries too large (%d). Pinning to %d", maxRetries, MAX_RETRIES_LIMIT));
            maxRetries = MAX_RETRIES_LIMIT;
        }
        return maxRetries;
```

### AssignmentToMethodParameter
Assignment to method parameter `retryPolicy`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java
        }

        retryPolicy = Preconditions.checkNotNull(retryPolicy, "retryPolicy cannot be null");
        ensembleProvider = Preconditions.checkNotNull(ensembleProvider, "ensembleProvider cannot be null");

```

### AssignmentToMethodParameter
Assignment to method parameter `ensembleProvider`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java

        retryPolicy = Preconditions.checkNotNull(retryPolicy, "retryPolicy cannot be null");
        ensembleProvider = Preconditions.checkNotNull(ensembleProvider, "ensembleProvider cannot be null");

        this.connectionTimeoutMs = connectionTimeoutMs;
```

### AssignmentToMethodParameter
Assignment to method parameter `watcher`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/WatcherRemovalManager.java`
#### Snippet
```java
    void add(NamespaceWatcher watcher)
    {
        watcher = Preconditions.checkNotNull(watcher, "watcher cannot be null");
        entries.add(watcher);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `foundNode`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/ProtectedMode.java`
#### Snippet
```java
                    log.info("Deleted old session's found node: {}", foundNode);
                    client.getFailedDeleteManager().executeGuaranteedOperationInBackground(foundNode);
                    foundNode = null;
                }
                this.sessionId = clientSessionId;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetChildrenBuilderImpl.java`
#### Snippet
```java
        client.getSchemaSet().getSchema(path).validateWatch(path, watching.isWatched() || watching.hasWatcher());

        path = client.fixForNamespace(path);

        List<String>        children = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `strings`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetChildrenBuilderImpl.java`
#### Snippet
```java
                    if ( strings == null )
                    {
                        strings = Lists.newArrayList();
                    }
                    CuratorEventImpl event = new CuratorEventImpl(client, CuratorEventType.CHILDREN, rc, path, null, o, stat, null, strings, null, null, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetDataBuilderImpl.java`
#### Snippet
```java
        client.getSchemaSet().getSchema(path).validateWatch(path, watching.isWatched() || watching.hasWatcher());

        path = client.fixForNamespace(path);

        byte[]      responseData = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetDataBuilderImpl.java`
#### Snippet
```java
                        try
                        {
                            data = client.getCompressionProvider().decompress(path, data);
                        }
                        catch ( Exception e )
```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetDataBuilderImpl.java`
#### Snippet
```java
                            ThreadUtils.checkInterrupted(e);
                            log.error("Decompressing for path: " + path, e);
                            rc = KeeperException.Code.DATAINCONSISTENCY.intValue();
                        }
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `rhs`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/Backgrounding.java`
#### Snippet
```java
        if ( rhs == null )
        {
            rhs = new Backgrounding();
        }
        this.inBackground = rhs.inBackground;
```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/FindAndDeleteProtectedNodeInBackground.java`
#### Snippet
```java
                if ( debugInsertError.compareAndSet(true, false) )
                {
                    rc = KeeperException.Code.CONNECTIONLOSS.intValue();
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/FindAndDeleteProtectedNodeInBackground.java`
#### Snippet
```java
                            ThreadUtils.checkInterrupted(e);
                            log.error("Could not start guaranteed delete for node: " + node);
                            rc = KeeperException.Code.CONNECTIONLOSS.intValue();
                        }
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetACLBuilderImpl.java`
#### Snippet
```java
    public List<ACL> forPath(String path) throws Exception
    {
        path = client.fixForNamespace(path);

        List<ACL>       result = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `reason`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
        if ( (reason == null) || (reason.length() == 0) )
        {
            reason = "n/a";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
        checkState();

        path = fixForNamespace(path);

        internalSync(this, path, context);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/ExistsBuilderImpl.java`
#### Snippet
```java
    public Stat forPath(String path) throws Exception
    {
        path = client.fixForNamespace(path);

        client.getSchemaSet().getSchema(path).validateWatch(path, watching.isWatched() || watching.hasWatcher());
```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/DeleteBuilderImpl.java`
#### Snippet
```java
                            {
                                failNextDeleteForTesting = false;
                                rc = KeeperException.Code.CONNECTIONLOSS.intValue();
                            }
                            if ( (rc == KeeperException.Code.NOTEMPTY.intValue()) && deletingChildrenIfNeeded )
```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/DeleteBuilderImpl.java`
#### Snippet
```java
                                if ( (rc == KeeperException.Code.NONODE.intValue()) && quietly )
                                {
                                    rc = KeeperException.Code.OK.intValue();
                                }
                                CuratorEvent event = new CuratorEventImpl(client, CuratorEventType.DELETE, rc, path, null, ctx, null, null, null, null, null, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/DeleteBuilderImpl.java`
#### Snippet
```java

        final String unfixedPath = path;
        path = client.fixForNamespace(path);

        if ( backgrounding.inBackground() )
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
        if ( compress )
        {
            data = client.getCompressionProvider().compress(path, data);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
        }

        path = client.fixForNamespace(path);

        Stat        resultStat = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
                        {
                            failNextIdempotentCheckForTesting = false;
                            rc = KeeperException.Code.CONNECTIONLOSS.intValue();
                        }
                        else if ( !idempotentSetMatches(stat.getVersion(), mainOperationAndData.getData().getData(), data) )
```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
                        else if ( !idempotentSetMatches(stat.getVersion(), mainOperationAndData.getData().getData(), data) )
                        {
                            rc = KeeperException.Code.BADVERSION.intValue();
                        }
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
                        {
                            failNextSetForTesting = false;
                            rc = KeeperException.Code.CONNECTIONLOSS.intValue();
                        }

```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/SetDataBuilderImpl.java`
#### Snippet
```java
                if ( compress )
                {
                    data = client.getCompressionProvider().compress(path, data);
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceImpl.java`
#### Snippet
```java
            if ( !namespacePath.equals("/") && path.startsWith(namespacePath) )
            {
                path = (path.length() > namespacePath.length()) ? path.substring(namespacePath.length()) : "/";
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `operations`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorMultiTransactionImpl.java`
#### Snippet
```java
    public List<CuratorTransactionResult> forOperations(List<CuratorOp> operations) throws Exception
    {
        operations = Preconditions.checkNotNull(operations, "operations cannot be null");
        Preconditions.checkArgument(!operations.isEmpty(), "operations list cannot be empty");

```

### AssignmentToMethodParameter
Assignment to method parameter `threadFactory`
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateManager.java`
#### Snippet
```java
        if ( threadFactory == null )
        {
            threadFactory = ThreadUtils.newThreadFactory("ConnectionStateManager");
        }
        service = Executors.newSingleThreadExecutor(threadFactory);
```

### AssignmentToMethodParameter
Assignment to method parameter `schemas`
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java
    public SchemaSet(List<Schema> schemas, boolean useDefaultSchema)
    {
        schemas = Preconditions.checkNotNull(schemas, "schemas cannot be null");

        this.useDefaultSchema = useDefaultSchema;
```

### AssignmentToMethodParameter
Assignment to method parameter `event`
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/InternalCallback.java`
#### Snippet
```java
    public void processResult(CuratorFramework client, CuratorEvent event) throws Exception
    {
        event = (resultFilter != null) ? resultFilter.apply(event) : event;
        resultFunction.apply(event, this);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `modelSpec`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledCacheImpl.java`
#### Snippet
```java
        if ( !modelSpec.path().isResolved() && !modelSpec.path().isRoot() && modelSpec.path().parent().isResolved() )
        {
            modelSpec = modelSpec.parent(); // i.e. the last item is a parameter
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceInstance.java`
#### Snippet
```java
    public ServiceInstance(String name, String id, String address, Integer port, Integer sslPort, T payload, long registrationTimeUTC, ServiceType serviceType, UriSpec uriSpec, boolean enabled)
    {
        name = Preconditions.checkNotNull(name, "name cannot be null");
        id = Preconditions.checkNotNull(id, "id cannot be null");

```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceInstance.java`
#### Snippet
```java
    {
        name = Preconditions.checkNotNull(name, "name cannot be null");
        id = Preconditions.checkNotNull(id, "id cannot be null");

        this.serviceType = serviceType;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/OldServiceInstance.java`
#### Snippet
```java
    OldServiceInstance(String name, String id, String address, Integer port, Integer sslPort, T payload, long registrationTimeUTC, ServiceType serviceType, UriSpec uriSpec)
    {
        name = Preconditions.checkNotNull(name, "name cannot be null");
        id = Preconditions.checkNotNull(id, "id cannot be null");

```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/OldServiceInstance.java`
#### Snippet
```java
    {
        name = Preconditions.checkNotNull(name, "name cannot be null");
        id = Preconditions.checkNotNull(id, "id cannot be null");

        this.serviceType = serviceType;
```

### AssignmentToMethodParameter
Assignment to method parameter `modeledOptions`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
        Objects.requireNonNull(client, "client cannot be null");
        Objects.requireNonNull(model, "model cannot be null");
        modeledOptions = ImmutableSet.copyOf(Objects.requireNonNull(modeledOptions, "modeledOptions cannot be null"));

        watchMode = (watchMode != null) ? watchMode : WatchMode.stateChangeAndSuccess;
```

### AssignmentToMethodParameter
Assignment to method parameter `watchMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
        modeledOptions = ImmutableSet.copyOf(Objects.requireNonNull(modeledOptions, "modeledOptions cannot be null"));

        watchMode = (watchMode != null) ? watchMode : WatchMode.stateChangeAndSuccess;

        AsyncCuratorFrameworkDsl dslClient = client.with(watchMode, unhandledErrorListener, resultFilter, watcherFilter);
```

### AssignmentToMethodParameter
Assignment to method parameter `names`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ZPathImpl.java`
#### Snippet
```java
    public static ZPath from(ZPath base, List<String> names)
    {
        names = Objects.requireNonNull(names, "names cannot be null");
        names.forEach(ZPathImpl::validate);
        ImmutableList.Builder<String> builder = ImmutableList.builder();
```

### AssignmentToMethodParameter
Assignment to method parameter `payload`
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/contexts/GenericDiscoveryContext.java`
#### Snippet
```java
        {
            //noinspection unchecked
            payload = (T)payloadType.getRawType().newInstance();
        }
        
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessReadWriteLock.java`
#### Snippet
```java
        public final String fixForSorting(String str, String lockName)
        {
            str = super.fixForSorting(str, READ_LOCK_NAME);
            str = super.fixForSorting(str, WRITE_LOCK_NAME);
            return str;
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessReadWriteLock.java`
#### Snippet
```java
        {
            str = super.fixForSorting(str, READ_LOCK_NAME);
            str = super.fixForSorting(str, WRITE_LOCK_NAME);
            return str;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `qty`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphore.java`
#### Snippet
```java
        try
        {
            while ( qty-- > 0 )
            {
                long        elapsedMs = System.currentTimeMillis() - startMs;
```

### AssignmentToMethodParameter
Assignment to method parameter `qty`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphore.java`
#### Snippet
```java
        try
        {
            while ( qty-- > 0 )
            {
                String      path = internals.attemptLock(-1, null, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `qty`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
        try
        {
            while ( qty-- > 0 )
            {
                int retryCount = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
    {
        this.client = client.newWatcherRemoveCuratorFramework();
        path = PathUtils.validatePath(path);
        lock = new InterProcessMutex(client, ZKPaths.makePath(path, LOCK_PARENT));
        this.maxLeases = (count != null) ? count.getCount() : maxLeases;
```

### AssignmentToMethodParameter
Assignment to method parameter `millisToWait`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
                            if ( millisToWait != null )
                            {
                                millisToWait -= (System.currentTimeMillis() - startMillis);
                                startMillis = System.currentTimeMillis();
                                if ( millisToWait <= 0 )
```

### AssignmentToMethodParameter
Assignment to method parameter `startMillis`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
                            {
                                millisToWait -= (System.currentTimeMillis() - startMillis);
                                startMillis = System.currentTimeMillis();
                                if ( millisToWait <= 0 )
                                {
```

### AssignmentToMethodParameter
Assignment to method parameter `mode`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
    {
        Preconditions.checkState(state.compareAndSet(State.LATENT, State.STARTED), "already started");
        mode = Preconditions.checkNotNull(mode, "mode cannot be null");

        client.getConnectionStateListenable().addListener(connectionStateListener);
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentNode.java`
#### Snippet
```java
    public void setData(byte[] data) throws Exception
    {
        data = Preconditions.checkNotNull(data, "data cannot be null");
        Preconditions.checkState(nodePath.get() != null, "initial create has not been processed. Call waitForInitialCreate() to ensure.");
        Preconditions.checkState(!parentCreationFailure, "Failed to create parent nodes.");
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedIdQueue.java`
#### Snippet
```java
    public int remove(String id) throws Exception
    {
        id = Preconditions.checkNotNull(id, "id cannot be null");

        queue.checkState();
```

### AssignmentToMethodParameter
Assignment to method parameter `newQueuePath`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSharder.java`
#### Snippet
```java
        if ( newQueuePath == null )
        {
            newQueuePath = ZKPaths.makePath(queuePath, QUEUE_PREFIX + UUID.randomUUID().toString());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `multiItem`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
        {
            final AtomicReference<T>    ref = new AtomicReference<T>(item);
            multiItem = new MultiItem<T>()
            {
                @Override
```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
                        {
                            failNextIdempotentCheckForTesting = false;
                            rc = KeeperException.Code.CONNECTIONLOSS.intValue();
                        }
                        else if ( !IdempotentUtils.matches(0, mainOperationAndData.getData().getData(), stat.getVersion(), data) )
```

### AssignmentToMethodParameter
Assignment to method parameter `rc`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
                        else if ( !IdempotentUtils.matches(0, mainOperationAndData.getData().getData(), stat.getVersion(), data) )
                        {
                            rc = KeeperException.Code.NODEEXISTS.intValue();
                        }
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
        if ( compress )
        {
            data = client.getCompressionProvider().compress(givenPath, data);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
    private void sendBackgroundResponse(int rc, String path, Object ctx, String name, Stat stat, OperationAndData<PathAndBytes> operationAndData)
    {
        path = client.unfixForNamespace(path);
        name = client.unfixForNamespace(name);

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
    {
        path = client.unfixForNamespace(path);
        name = client.unfixForNamespace(name);

        CuratorEvent event = new CuratorEventImpl(client, CuratorEventType.CREATE, rc, path, name, ctx, stat, null, null, null, null, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
                if ( compress )
                {
                    data = client.getCompressionProvider().compress(path, data);
                }

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `curator-client/src/main/java/org/apache/curator/HandleHolder.java`
#### Snippet
```java
    ZooKeeper getZooKeeper() throws Exception
    {
        return (helper != null) ? helper.getZooKeeper() : null;
    }

```

### ReturnNull
Return of `null`
in `curator-client/src/main/java/org/apache/curator/HandleHolder.java`
#### Snippet
```java
        String helperConnectionString = (helper != null) ? helper.getConnectionString() : null;
        String ensembleProviderConnectionString = ensembleProvider.getConnectionString();
        return ((helperConnectionString != null) && !ensembleProviderConnectionString.equals(helperConnectionString)) ? ensembleProviderConnectionString : null;
    }

```

### ReturnNull
Return of `null`
in `curator-client/src/main/java/org/apache/curator/HandleHolder.java`
#### Snippet
```java
    String  getConnectionString()
    {
        return (helper != null) ? helper.getConnectionString() : null;
    }

```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
                case 0:
                {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
                {
                    byte[] bytes = authInfos.get(0).getAuth();
                    return (bytes != null) ? Arrays.copyOf(bytes, bytes.length) : null;
                }

```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
                case 0:
                {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GetConfigBuilderImpl.java`
#### Snippet
```java
        {
            client.processBackgroundOperation(new OperationAndData<Void>(this, null, backgrounding.getCallback(), null, backgrounding.getContext(), watching), null);
            return null;
        }
        else
```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/AddWatchBuilderImpl.java`
#### Snippet
```java
                    client.getZooKeeper().addWatch(fixedPath, watching.getWatcher(path), mode);
                }
                return null;
            });
        trace.setPath(fixedPath).setWithWatcher(true).commit();
```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
    WatcherRemovalManager getWatcherRemovalManager()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
                {
                    backgroundOperationsLoop();
                    return null;
                }
            });
```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
    public QuorumVerifier getCurrentConfig()
    {
        return (ensembleTracker != null) ? ensembleTracker.getCurrentConfig() : null;
    }

```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceImpl.java`
#### Snippet
```java
                        {
                            ZKPaths.mkdirs(zookeeperClient.getZooKeeper(), ZKPaths.makePath("/", namespace), true, client.getAclProvider(), true);
                            return null;
                        }
                    }
```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorMultiTransactionImpl.java`
#### Snippet
```java
        {
            client.processBackgroundOperation(new OperationAndData<>(this, record, backgrounding.getCallback(), null, backgrounding.getContext(), null), null);
            return null;
        }
        else
```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionStateManager.java`
#### Snippet
```java
                    {
                        processEvents();
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `curator-framework/src/main/java/org/apache/curator/framework/schema/Schema.java`
#### Snippet
```java
            return path;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
                    }
                }
                return null;
            });
        });
```

### ReturnNull
Return of `null`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
                completeChildren(client, future, path, children, isCompressed);
            }
            return null;
        });
        return future;
```

### ReturnNull
Return of `null`
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/InternalCallback.java`
#### Snippet
```java
    public CompletionStage<WatchedEvent> event()
    {
        return (watcher != null) ? watcher.getFuture() : null;
    }

```

### ReturnNull
Return of `null`
in `curator-client/src/main/java/org/apache/curator/utils/EnsurePath.java`
#### Snippet
```java
                                helper.set(doNothingHelper);
                                isSet = true;
                                return null;
                            }
                        }
```

### ReturnNull
Return of `null`
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncCuratorFrameworkImpl.java`
#### Snippet
```java
    private WatchMode getBuilderWatchMode()
    {
        return watched ? watchMode : null;
    }
}
```

### ReturnNull
Return of `null`
in `curator-x-async/src/main/java/org/apache/curator/x/async/details/AsyncReconfigBuilderImpl.java`
#### Snippet
```java
        return safeCall(common.internalCallback, () -> {
            builder.forEnsemble();
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/strategies/RandomStrategy.java`
#### Snippet
```java
        if ( instances.size() == 0 )
        {
            return null;
        }
        int                         thisIndex = random.nextInt(instances.size());
```

### ReturnNull
Return of `null`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/strategies/RoundRobinStrategy.java`
#### Snippet
```java
        if ( instances.size() == 0 )
        {
            return null;
        }
        int                         thisIndex = Math.abs(index.getAndIncrement());
```

### ReturnNull
Return of `null`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
                completeChildrenAsZNodes(modelStage, children);
            }
            return null;
        });
        return modelStage;
```

### ReturnNull
Return of `null`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
    private List<ACL> fixAclList(List<ACL> aclList)
    {
        return (aclList.size() > 0) ? aclList : null;   // workaround for old, bad design. empty list not accepted
    }
}
```

### ReturnNull
Return of `null`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
                }
            }
            return null;
        }));
    }
```

### ReturnNull
Return of `null`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceDiscoveryImpl.java`
#### Snippet
```java
        if ( !watchInstances )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceDiscoveryImpl.java`
#### Snippet
```java
    {
        Entry<T> entry = services.get(id);
        return (entry != null) ? entry.service : null;
    }

```

### ReturnNull
Return of `null`
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceDiscoveryImpl.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/contexts/IntegerDiscoveryContext.java`
#### Snippet
```java
            return Integer.parseInt(node.asText());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/contexts/StringDiscoveryContext.java`
#### Snippet
```java
    public String unMarshallJson(JsonNode node) throws Exception
    {
        return (node != null) ? node.asText() : null;
    }

```

### ReturnNull
Return of `null`
in `curator-examples/src/main/java/async/AsyncExamples.java`
#### Snippet
```java
            asyncEx.printStackTrace();    // handle the error as needed
            handleWatchedStage(asyncEx.reset());
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `curator-x-discovery-server/src/main/java/org/apache/curator/x/discovery/server/entity/JsonServiceInstanceMarshaller.java`
#### Snippet
```java
    {
        JsonNode intNode = node.get(fieldName);
        return (intNode != null) ? intNode.asInt() : null;
    }

```

### ReturnNull
Return of `null`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
        client.transaction().forOperations(operations).exceptionally(e -> {
            log.error("Could not publish instances: " + instances, e);
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
        resolvedClient.set(message).exceptionally(e -> {
            log.error("Could not publish message: " + message, e);
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
        resolvedClient.set(instance).exceptionally(e -> {
            log.error("Could not publish instance: " + instance, e);
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `curator-examples/src/main/java/pubsub/Publisher.java`
#### Snippet
```java
        client.transaction().forOperations(operations).exceptionally(e -> {
            log.error("Could not publish messages: " + messages, e);
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCacheEvent.java`
#### Snippet
```java
    public List<ChildData> getInitialData()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
        if ( node == null )
        {
            return null;
        }
        ChildData result = node.childData;
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
        }
        ChildData result = node.childData;
        return isLive(result) ? result : null;
    }

```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
        if ( node == null || !isLive(node.childData) )
        {
            return null;
        }
        ConcurrentMap<String, TreeNode> map = node.children;
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java

        // Double-check liveness after retrieving children.
        return isLive(node.childData) ? result : null;
    }

```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
            if (findElements.isEmpty()) {
                // Target path shorter than root path
                return null;
            }
            String nextRoot = rootElements.removeFirst();
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
            if (!nextFind.equals(nextRoot)) {
                // Initial root path does not match
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
            if ( map == null )
            {
                return null;
            }
            current = map.get(nextFind);
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
            if ( current == null )
            {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessMutex.java`
#### Snippet
```java
    {
        LockData lockData = threadData.get(Thread.currentThread());
        return lockData != null ? lockData.lockPath : null;
    }

```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessMutex.java`
#### Snippet
```java
    protected byte[] getLockNodeBytes()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphore.java`
#### Snippet
```java
                {
                    returnAll(builder.build());
                    return null;
                }
                builder.add(makeLease(path));
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphore.java`
#### Snippet
```java
    {
        String      path = internals.attemptLock(time, unit, null);
        return (path != null) ? makeLease(path) : null;
    }

```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
                        case RETURN_NULL:
                        {
                            return null;
                        }

```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/InterProcessSemaphoreV2.java`
#### Snippet
```java
    {
        Collection<Lease> leases = acquire(1, time, unit);
        return (leases != null) ? leases.iterator().next() : null;
    }

```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/ItemSerializer.java`
#### Snippet
```java
            public T nextItem()
            {
                return iterator.hasNext() ? iterator.next() : null;
            }
        };
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/SimpleDistributedQueue.java`
#### Snippet
```java
        catch ( NoSuchElementException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/SimpleDistributedQueue.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/SimpleDistributedQueue.java`
#### Snippet
```java
                if ( thisWaitMs <= 0 )
                {
                    return null;
                }
                latch.await(thisWaitMs, TimeUnit.MILLISECONDS);
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/SimpleDistributedQueue.java`
#### Snippet
```java
        catch ( NoSuchElementException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
            protected byte[] getLockNodeBytes()
            {
                return (id.length() > 0) ? getIdBytes(id) : null;
            }
        };
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java
        catch ( KeeperException.NoNodeException e )
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
                        {
                            runLoop();
                            return null;
                        }
                    }
```

### ReturnNull
Return of `null`
in `curator-test/src/main/java/org/apache/curator/test/WatchersDebug.java`
#### Snippet
```java
        if ( zooKeeper == null )
        {
            return null;
        }
        try
```

### ReturnNull
Return of `null`
in `curator-test/src/main/java/org/apache/curator/test/TestingCluster.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSharder.java`
#### Snippet
```java
                        try
                        {
                            Thread.sleep(policies.getThresholdCheckMs());
                            checkThreshold();
                        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `curator-test/src/main/java/org/apache/curator/test/TestingQuorumPeerMain.java`
#### Snippet
```java
            try
            {
                Thread.sleep(10);
            }
            catch ( InterruptedException e )
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy 7 fields
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
    }

    protected CuratorFrameworkImpl(CuratorFrameworkImpl parent)
    {
        client = parent.client;
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `curator-client/src/main/java/org/apache/curator/utils/CloseableUtils.java`
#### Snippet
```java
        {
            // Here we've instructed Guava to swallow the IOException
            Closeables.close(closeable, true);
        }
        catch ( IOException e )
```

### UnstableApiUsage
'close(java.io.Closeable, boolean)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `curator-client/src/main/java/org/apache/curator/utils/CloseableUtils.java`
#### Snippet
```java
        {
            // Here we've instructed Guava to swallow the IOException
            Closeables.close(closeable, true);
        }
        catch ( IOException e )
```

## RuleId[id=TestCaseWithNoTestMethods]
### TestCaseWithNoTestMethods
Test class `BaseClassForTests` has no tests
in `curator-test/src/main/java/org/apache/curator/test/BaseClassForTests.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicBoolean;

public class BaseClassForTests
{
    protected volatile TestingServer server;
```

