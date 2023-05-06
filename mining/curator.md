# curator 
 
# Bad smells
I found 641 bad smells with 199 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 196 | true |
| JavadocReference | 182 | false |
| Deprecation | 64 | false |
| JavadocDeclaration | 25 | false |
| RedundantTypeArguments | 22 | false |
| NullableProblems | 20 | false |
| DataFlowIssue | 14 | false |
| ConstantValue | 14 | false |
| UNUSED_IMPORT | 13 | false |
| DeprecatedIsStillUsed | 12 | false |
| JavadocLinkAsPlainText | 11 | false |
| IgnoreResultOfCall | 8 | false |
| FieldMayBeFinal | 8 | false |
| RedundantStringFormatCall | 7 | false |
| UnusedAssignment | 6 | false |
| DuplicatedCode | 5 | false |
| DanglingJavadoc | 4 | false |
| CStyleArrayDeclaration | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| CharsetObjectCanBeUsed | 3 | false |
| EmptyStatementBody | 2 | false |
| DuplicateExpressions | 2 | false |
| AutoCloseableResource | 2 | false |
| BusyWait | 2 | false |
| UnstableApiUsage | 2 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| UNCHECKED_WARNING | 1 | false |
| UnnecessarySemicolon | 1 | false |
| ObviousNullCheck | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| MismatchedJavadocCode | 1 | false |
| TrivialIf | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| CopyConstructorMissesField | 1 | false |
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

## RuleId[id=UnnecessaryModifier]
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
    public void     registerService(ServiceInstance<T> service) throws Exception;

    /**
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
    public void start() throws Exception;

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
    public Collection<ServiceInstance<T>>  queryForInstances(String name) throws Exception;

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
     * @param unit time unit
     */
    public void     addTrace(String name, long time, TimeUnit unit);

    /**
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
     * @return strategy
     */
    public ProviderStrategy<T>      getProviderStrategy();
}

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
     * @return this
     */
    public ServiceCacheBuilder<T> executorService(ExecutorService executorService);
}

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
     * Stop the client
     */
    public void     close();

    /**
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
in `curator-framework/src/main/java/org/apache/curator/framework/api/CompressionProvider.java`
#### Snippet
```java
    public byte[]       compress(String path, byte[] data) throws Exception;

    public byte[]       decompress(String path, byte[] compressedData) throws Exception;
}

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
    public ACLCreateModeBackgroundPathAndBytesable<String>    withProtection();
}

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
    public SyncBuilder sync();

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
    public T inBackground(Object context);

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
    public T inBackground(BackgroundCallback callback);

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
    public GetConfigBuilder getConfig();

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
     * @return builder object
     */
    public DeleteBuilder delete();

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
    public Listenable<UnhandledErrorListener> getUnhandledErrorListenable();

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
    public SetDataBuilder setData();

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
    public Listenable<ConnectionStateListener> getConnectionStateListenable();

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
    public GetChildrenBuilder getChildren();

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
    public RemoveWatchesType remove(Watcher watcher);
    
    /**
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
     * @return any WatchedEvent
     */
    public WatchedEvent getWatchedEvent();
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
     * @return any stat
     */
    public Stat getStat();

    /**
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
     * @param executor executor to run listener in
     */
    public void     addListener(T listener, Executor executor);

    /**
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
    public byte[]   getData() throws Exception;

    /**
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
     * @throws Exception ZK errors, connection interruptions
     */
    public void acquire() throws Exception;

    /**
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
     * @param items the items
     */
    public void         putMultiCompleted(MultiItem<T> items);
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
   * this occurs, you can expect {@link #notLeader()} to also be called.
   */
  public void isLeader();

  /**
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
     * @return version/value
     */
    public VersionedValue<byte[]> getVersionedValue();

    /**
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
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/shared/SharedCountListener.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public void         countHasChanged(SharedCountReader sharedCount, int newCount) throws Exception;
}

```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.atomic.AtomicReferenceFieldUpdater' to 'java.util.concurrent.atomic.AtomicReferenceFieldUpdater\>'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java
    private static final AtomicReferenceFieldUpdater<TreeNode, ChildData> childDataUpdater = AtomicReferenceFieldUpdater.newUpdater(TreeNode.class, ChildData.class, "childData");

    private static final AtomicReferenceFieldUpdater<TreeNode, ConcurrentMap<String, TreeNode>> childrenUpdater = (AtomicReferenceFieldUpdater)AtomicReferenceFieldUpdater.newUpdater(TreeNode.class, ConcurrentMap.class, "children");

    final class TreeNode implements Watcher, BackgroundCallback
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `KeeperException.SessionExpiredException`
in `curator-client/src/main/java/org/apache/curator/SessionFailRetryLoop.java`
#### Snippet
```java

        /**
         * If the session fails, throw {@link KeeperException.SessionExpiredException} when
         * {@link SessionFailRetryLoop#shouldContinue()} is called
         */
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/utils/ZookeeperFactory.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     * @param zkClientConfig ZooKeeper client config
```

### JavadocReference
Cannot resolve symbol `ZooKeeper(String, int, Watcher, long, byte[], boolean)`
in `curator-client/src/main/java/org/apache/curator/utils/ZookeeperFactory.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     * @param zkClientConfig ZooKeeper client config
```

### JavadocReference
Cannot resolve symbol `Watcher`
in `curator-client/src/main/java/org/apache/curator/utils/ZookeeperFactory.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     * @param zkClientConfig ZooKeeper client config
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/utils/ZookeeperFactory.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     * @return the instance
```

### JavadocReference
Cannot resolve symbol `ZooKeeper(String, int, Watcher, long, byte[], boolean)`
in `curator-client/src/main/java/org/apache/curator/utils/ZookeeperFactory.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     * @return the instance
```

### JavadocReference
Cannot resolve symbol `Watcher`
in `curator-client/src/main/java/org/apache/curator/utils/ZookeeperFactory.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     * @return the instance
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java

    /**
     * Every time a new {@link ZooKeeper} instance is allocated, the "instance index"
     * is incremented.
     *
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java

    /**
     * @param zookeeperFactory factory for creating {@link ZooKeeper} instances
     * @param ensembleProvider the ensemble provider
     * @param sessionTimeoutMs session timeout
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     * @since 4.0.2
```

### JavadocReference
Cannot resolve symbol `ZooKeeper(String, int, Watcher, long, byte[], boolean)`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     * @since 4.0.2
```

### JavadocReference
Cannot resolve symbol `Watcher`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     * @since 4.0.2
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java

    /**
     * @param zookeeperFactory factory for creating {@link ZooKeeper} instances
     * @param ensembleProvider the ensemble provider
     * @param sessionTimeoutMs session timeout
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     */
```

### JavadocReference
Cannot resolve symbol `ZooKeeper(String, int, Watcher, long, byte[], boolean)`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     */
```

### JavadocReference
Cannot resolve symbol `Watcher`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java
     * @param canBeReadOnly if true, allow ZooKeeper client to enter
     *                      read only mode in case of a network partition. See
     *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
     *                      for details
     */
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java

    /**
     * Return the most recent value of {@link ZooKeeper#getSessionTimeout()} or 0
     *
     * @return session timeout or 0
```

### JavadocReference
Cannot resolve symbol `getSessionTimeout()`
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java

    /**
     * Return the most recent value of {@link ZooKeeper#getSessionTimeout()} or 0
     *
     * @return session timeout or 0
```

### JavadocReference
Cannot resolve symbol `ZooDefs.Ids`
in `curator-client/src/main/java/org/apache/curator/utils/InternalACLProvider.java`
#### Snippet
```java
{
    /**
     * Return the ACL list to use by default (usually {@link ZooDefs.Ids#OPEN_ACL_UNSAFE}).
     *
     * @return default ACL list
```

### JavadocReference
Cannot resolve symbol `OPEN_ACL_UNSAFE`
in `curator-client/src/main/java/org/apache/curator/utils/InternalACLProvider.java`
#### Snippet
```java
{
    /**
     * Return the ACL list to use by default (usually {@link ZooDefs.Ids#OPEN_ACL_UNSAFE}).
     *
     * @return default ACL list
```

### JavadocReference
Cannot resolve symbol `name`
in `curator-client/src/main/java/org/apache/curator/drivers/AdvancedTracerDriver.java`
#### Snippet
```java
     * Add to a named counter
     *
     * @param name name of the counter
     * @param increment amount to increment
     */
```

### JavadocReference
Cannot resolve symbol `increment`
in `curator-client/src/main/java/org/apache/curator/drivers/AdvancedTracerDriver.java`
#### Snippet
```java
     *
     * @param name name of the counter
     * @param increment amount to increment
     */
    public abstract void     addEvent(EventTrace trace);
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java

    /**
     * Return true if this ensemble provider supports {@link ZooKeeper#updateServerList(String)}
     *
     * @return true/false
```

### JavadocReference
Cannot resolve symbol `updateServerList(String)`
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java

    /**
     * Return true if this ensemble provider supports {@link ZooKeeper#updateServerList(String)}
     *
     * @return true/false
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java
     * time it needs to create a ZooKeeper instance
     * 
     * @return connection string (per {@link ZooKeeper#ZooKeeper(String, int, Watcher)} etc.)
     */
    public String       getConnectionString();
```

### JavadocReference
Cannot resolve symbol `ZooKeeper(String, int, Watcher)`
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java
     * time it needs to create a ZooKeeper instance
     * 
     * @return connection string (per {@link ZooKeeper#ZooKeeper(String, int, Watcher)} etc.)
     */
    public String       getConnectionString();
```

### JavadocReference
Cannot resolve symbol `Watcher`
in `curator-client/src/main/java/org/apache/curator/ensemble/EnsembleProvider.java`
#### Snippet
```java
     * time it needs to create a ZooKeeper instance
     * 
     * @return connection string (per {@link ZooKeeper#ZooKeeper(String, int, Watcher)} etc.)
     */
    public String       getConnectionString();
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/ensemble/fixed/FixedEnsembleProvider.java`
#### Snippet
```java
     *
     * @param connectionString connection string
     * @param updateServerListEnabled if true, allow Curator to call {@link ZooKeeper#updateServerList(String)}
     */
    public FixedEnsembleProvider(String connectionString, boolean updateServerListEnabled)
```

### JavadocReference
Cannot resolve symbol `updateServerList(String)`
in `curator-client/src/main/java/org/apache/curator/ensemble/fixed/FixedEnsembleProvider.java`
#### Snippet
```java
     *
     * @param connectionString connection string
     * @param updateServerListEnabled if true, allow Curator to call {@link ZooKeeper#updateServerList(String)}
     */
    public FixedEnsembleProvider(String connectionString, boolean updateServerListEnabled)
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param makeLastNode if true, all nodes are created. If false, only the parent nodes are created
     * @param aclProvider  if not null, the ACL provider to use when creating parent nodes
     * @param asContainers if true, nodes are created as {@link CreateMode#CONTAINER}
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param makeLastNode if true, all nodes are created. If false, only the parent nodes are created
     * @param aclProvider  if not null, the ACL provider to use when creating parent nodes
     * @param asContainers if true, nodes are created as {@link CreateMode#CONTAINER}
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param asContainers if true, nodes are created as {@link CreateMode#CONTAINER}
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
     */
    public static void mkdirs(ZooKeeper zookeeper, String path, boolean makeLastNode, InternalACLProvider aclProvider, boolean asContainers) throws InterruptedException, KeeperException
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @return sorted list of children
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException zookeeper errors
     */
    public static List<String> getSortedChildren(ZooKeeper zookeeper, String path) throws InterruptedException, KeeperException
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param makeLastNode if true, all nodes are created. If false, only the parent nodes are created
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
     */
    public static void mkdirs(ZooKeeper zookeeper, String path, boolean makeLastNode) throws InterruptedException, KeeperException
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param path      path to ensure
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
     */
    public static void mkdirs(ZooKeeper zookeeper, String path) throws InterruptedException, KeeperException
```

### JavadocReference
Cannot resolve symbol `KeeperException`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param deleteSelf flag that indicates that the node should also get deleted
     * @throws InterruptedException
     * @throws KeeperException
     */
    public static void deleteChildren(ZooKeeper zookeeper, String path, boolean deleteSelf) throws InterruptedException, KeeperException
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java

    /**
     * @return {@link CreateMode#CONTAINER} if the ZK JAR supports it. Otherwise {@link CreateMode#PERSISTENT}
     */
    public static CreateMode getContainerCreateMode()
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java

    /**
     * @return {@link CreateMode#CONTAINER} if the ZK JAR supports it. Otherwise {@link CreateMode#PERSISTENT}
     */
    public static CreateMode getContainerCreateMode()
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java

    /**
     * @return {@link CreateMode#CONTAINER} if the ZK JAR supports it. Otherwise {@link CreateMode#PERSISTENT}
     */
    public static CreateMode getContainerCreateMode()
```

### JavadocReference
Cannot resolve symbol `PERSISTENT`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java

    /**
     * @return {@link CreateMode#CONTAINER} if the ZK JAR supports it. Otherwise {@link CreateMode#PERSISTENT}
     */
    public static CreateMode getContainerCreateMode()
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException`
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param aclProvider  if not null, the ACL provider to use when creating parent nodes
     * @throws InterruptedException                 thread interruption
     * @throws org.apache.zookeeper.KeeperException Zookeeper errors
     */
    public static void mkdirs(ZooKeeper zookeeper, String path, boolean makeLastNode, InternalACLProvider aclProvider) throws InterruptedException, KeeperException
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-client/src/main/java/org/apache/curator/utils/EnsurePath.java`
#### Snippet
```java
 * </p>
 * <p>
 * The first time it is used, a synchronized call to {@link ZKPaths#mkdirs(ZooKeeper, String)} is made to
 * ensure that the entire path has been created (with an empty byte array if needed). Subsequent
 * calls with the instance are un-synchronized NOPs.
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-test/src/main/java/org/apache/curator/test/KillSession.java`
#### Snippet
```java
     * @param maxMs max time ms to wait for kill
     * @throws Exception errors
     * @deprecated use {@link #kill(ZooKeeper)} instead
     */
    public static void     kill(ZooKeeper client, String connectString, int maxMs) throws Exception
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-test/src/main/java/org/apache/curator/test/KillSession.java`
#### Snippet
```java
     * @param connectString server connection string
     * @throws Exception errors
     * @deprecated use {@link #kill(ZooKeeper)} instead
     */
    public static void     kill(ZooKeeper client, String connectString) throws Exception
```

### JavadocReference
Cannot resolve symbol `ZooDefs.Ids`
in `curator-framework/src/main/java/org/apache/curator/framework/api/ACLable.java`
#### Snippet
```java
{
    /**
     * Set an ACL list (default is {@link ZooDefs.Ids#OPEN_ACL_UNSAFE})
     *
     * @param aclList the ACL list to use
```

### JavadocReference
Cannot resolve symbol `OPEN_ACL_UNSAFE`
in `curator-framework/src/main/java/org/apache/curator/framework/api/ACLable.java`
#### Snippet
```java
{
    /**
     * Set an ACL list (default is {@link ZooDefs.Ids#OPEN_ACL_UNSAFE})
     *
     * @param aclList the ACL list to use
```

### JavadocReference
Cannot resolve symbol `notifyAll()`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFramework.java`
#### Snippet
```java

    /**
     * Calls {@link #notifyAll()} on the given object after first synchronizing on it. This is
     * done from the {@link #runSafe(Runnable)} thread.
     *
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateProtectACLCreateModePathAndBytesable.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateProtectACLCreateModePathAndBytesable.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/ExistsBuilder.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-framework/src/main/java/org/apache/curator/framework/api/ExistsBuilder.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilder.java`
#### Snippet
```java
{
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_WITH_TTL`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilder.java`
#### Snippet
```java
{
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_SEQUENTIAL_WITH_TTL`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeACLable.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeACLable.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `ZooDefs.Ids`
in `curator-framework/src/main/java/org/apache/curator/framework/api/ACLProvider.java`
#### Snippet
```java
{
    /**
     * Return the ACL list to use by default (usually {@link ZooDefs.Ids#OPEN_ACL_UNSAFE}).
     *
     * @return default ACL list
```

### JavadocReference
Cannot resolve symbol `OPEN_ACL_UNSAFE`
in `curator-framework/src/main/java/org/apache/curator/framework/api/ACLProvider.java`
#### Snippet
```java
{
    /**
     * Return the ACL list to use by default (usually {@link ZooDefs.Ids#OPEN_ACL_UNSAFE}).
     *
     * @return default ACL list
```

### JavadocReference
Symbol `PROTECTED_PREFIX` is inaccessible from here
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java
     *     The name of the node that is created is prefixed with a 40 characters string that is the concatenation of
     *     <ul>
     *         <li>{@value ProtectedUtils#PROTECTED_PREFIX}
     *         <li>Canonical text representation of a random generated UUID as produced by {@link UUID#toString()}
     *         <li>{@value ProtectedUtils#PROTECTED_SEPARATOR}
```

### JavadocReference
Symbol `PROTECTED_SEPARATOR` is inaccessible from here
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java
     *         <li>{@value ProtectedUtils#PROTECTED_PREFIX}
     *         <li>Canonical text representation of a random generated UUID as produced by {@link UUID#toString()}
     *         <li>{@value ProtectedUtils#PROTECTED_SEPARATOR}
     *     </ul>
     *     If node creation fails the normal retry mechanism will occur. On the retry, the parent path is first searched
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilder2.java`
#### Snippet
```java
{
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_WITH_TTL`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilder2.java`
#### Snippet
```java
{
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilder2.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_SEQUENTIAL_WITH_TTL`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilder2.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `Watcher`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorWatcher.java`
#### Snippet
```java

/**
 * A version of {@link Watcher} that can throw an exception
 */
public interface CuratorWatcher
```

### JavadocReference
Cannot resolve symbol `Watcher`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorWatcher.java`
#### Snippet
```java
{
    /**
     * Same as {@link Watcher#process(WatchedEvent)}. If an exception
     * is thrown, Curator will log it
     *
```

### JavadocReference
Cannot resolve symbol `process(WatchedEvent)`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorWatcher.java`
#### Snippet
```java
{
    /**
     * Same as {@link Watcher#process(WatchedEvent)}. If an exception
     * is thrown, Curator will log it
     *
```

### JavadocReference
Cannot resolve symbol `WatchedEvent`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorWatcher.java`
#### Snippet
```java
{
    /**
     * Same as {@link Watcher#process(WatchedEvent)}. If an exception
     * is thrown, Curator will log it
     *
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateModable.java`
#### Snippet
```java
{
    /**
     * Set a create mode - the default is {@link CreateMode#PERSISTENT}
     *
     * @param mode new create mode
```

### JavadocReference
Cannot resolve symbol `PERSISTENT`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateModable.java`
#### Snippet
```java
{
    /**
     * Set a create mode - the default is {@link CreateMode#PERSISTENT}
     *
     * @param mode new create mode
```

### JavadocReference
Cannot resolve symbol `ZooDefs.Ids`
in `curator-framework/src/main/java/org/apache/curator/framework/api/ParentACLable.java`
#### Snippet
```java

    /**
     * Set an ACL list (default is {@link ZooDefs.Ids#OPEN_ACL_UNSAFE}).
     *
     * If applyToParents is true, then the aclList is applied to the created parents.
```

### JavadocReference
Cannot resolve symbol `OPEN_ACL_UNSAFE`
in `curator-framework/src/main/java/org/apache/curator/framework/api/ParentACLable.java`
#### Snippet
```java

    /**
     * Set an ACL list (default is {@link ZooDefs.Ids#OPEN_ACL_UNSAFE}).
     *
     * If applyToParents is true, then the aclList is applied to the created parents.
```

### JavadocReference
Cannot resolve symbol `Watcher`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEventType.java`
#### Snippet
```java

    /**
     * Corresponds to {@link Watchable#usingWatcher(Watcher)} or {@link Watchable#watched()}
     */
    WATCHED,
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.AddWatchMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/AddWatchBuilder.java`
#### Snippet
```java
{
    /**
     * The mode to use. By default, {@link org.apache.zookeeper.AddWatchMode#PERSISTENT_RECURSIVE} is used
     *
     * @param mode mode to use
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_RECURSIVE`
in `curator-framework/src/main/java/org/apache/curator/framework/api/AddWatchBuilder.java`
#### Snippet
```java
{
    /**
     * The mode to use. By default, {@link org.apache.zookeeper.AddWatchMode#PERSISTENT_RECURSIVE} is used
     *
     * @param mode mode to use
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        /**
         * By default, Curator uses {@link CreateBuilder#creatingParentContainersIfNeeded()}
         * if the ZK JAR supports {@link CreateMode#CONTAINER}. Call this method to turn off this behavior.
         *
         * @return this
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
        /**
         * By default, Curator uses {@link CreateBuilder#creatingParentContainersIfNeeded()}
         * if the ZK JAR supports {@link CreateMode#CONTAINER}. Call this method to turn off this behavior.
         *
         * @return this
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
         * @param canBeReadOnly if true, allow ZooKeeper client to enter
         *                      read only mode in case of a network partition. See
         *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
         *                      for details
         * @return this
```

### JavadocReference
Cannot resolve symbol `ZooKeeper(String, int, Watcher, long, byte[], boolean)`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
         * @param canBeReadOnly if true, allow ZooKeeper client to enter
         *                      read only mode in case of a network partition. See
         *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
         *                      for details
         * @return this
```

### JavadocReference
Cannot resolve symbol `Watcher`
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorFrameworkFactory.java`
#### Snippet
```java
         * @param canBeReadOnly if true, allow ZooKeeper client to enter
         *                      read only mode in case of a network partition. See
         *                      {@link ZooKeeper#ZooKeeper(String, int, Watcher, long, byte[], boolean)}
         *                      for details
         * @return this
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/TransactionCreateBuilder.java`
#### Snippet
```java
{
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_WITH_TTL`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/TransactionCreateBuilder.java`
#### Snippet
```java
{
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/TransactionCreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_SEQUENTIAL_WITH_TTL`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/TransactionCreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeStatACLable.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeStatACLable.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `ZooKeeper`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransaction.java`
#### Snippet
```java
/**
 * <p>
 *     Transactional/atomic operations. See {@link ZooKeeper#multi(Iterable)} for
 *     details on ZooKeeper transactions.
 * </p>
```

### JavadocReference
Cannot resolve symbol `multi(Iterable)`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransaction.java`
#### Snippet
```java
/**
 * <p>
 *     Transactional/atomic operations. See {@link ZooKeeper#multi(Iterable)} for
 *     details on ZooKeeper transactions.
 * </p>
```

### JavadocReference
Cannot resolve symbol `OpResult.ErrorResult`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransactionResult.java`
#### Snippet
```java

    /**
     * Returns the operation generated error or <code>0</code> i.e. {@link OpResult.ErrorResult#getErr()}
     *
     * @return error or 0
```

### JavadocReference
Cannot resolve symbol `getErr()`
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransactionResult.java`
#### Snippet
```java

    /**
     * Returns the operation generated error or <code>0</code> i.e. {@link OpResult.ErrorResult#getErr()}
     *
     * @return error or 0
```

### JavadocReference
Cannot resolve symbol `Watcher.Event.KeeperState`
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionState.java`
#### Snippet
```java
     *     action. In Curator, this is complicated by the fact that Curator internally manages the ZooKeeper
     *     connection. Curator will set the LOST state when any of the following occurs:
     *     a) ZooKeeper returns a {@link Watcher.Event.KeeperState#Expired} or {@link KeeperException.Code#SESSIONEXPIRED};
     *     b) Curator closes the internally managed ZooKeeper instance; c) The session timeout
     *     elapses during a network partition.
```

### JavadocReference
Cannot resolve symbol `Expired`
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionState.java`
#### Snippet
```java
     *     action. In Curator, this is complicated by the fact that Curator internally manages the ZooKeeper
     *     connection. Curator will set the LOST state when any of the following occurs:
     *     a) ZooKeeper returns a {@link Watcher.Event.KeeperState#Expired} or {@link KeeperException.Code#SESSIONEXPIRED};
     *     b) Curator closes the internally managed ZooKeeper instance; c) The session timeout
     *     elapses during a network partition.
```

### JavadocReference
Cannot resolve symbol `KeeperException.Code`
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionState.java`
#### Snippet
```java
     *     action. In Curator, this is complicated by the fact that Curator internally manages the ZooKeeper
     *     connection. Curator will set the LOST state when any of the following occurs:
     *     a) ZooKeeper returns a {@link Watcher.Event.KeeperState#Expired} or {@link KeeperException.Code#SESSIONEXPIRED};
     *     b) Curator closes the internally managed ZooKeeper instance; c) The session timeout
     *     elapses during a network partition.
```

### JavadocReference
Cannot resolve symbol `SESSIONEXPIRED`
in `curator-framework/src/main/java/org/apache/curator/framework/state/ConnectionState.java`
#### Snippet
```java
     *     action. In Curator, this is complicated by the fact that Curator internally manages the ZooKeeper
     *     connection. Curator will set the LOST state when any of the following occurs:
     *     a) ZooKeeper returns a {@link Watcher.Event.KeeperState#Expired} or {@link KeeperException.Code#SESSIONEXPIRED};
     *     b) Curator closes the internally managed ZooKeeper instance; c) The session timeout
     *     elapses during a network partition.
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.ZooKeeper`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java`
#### Snippet
```java

        /**
         * By default, TreeCache creates {@link org.apache.zookeeper.ZooKeeper} watches for every created path.
         * Change this behavior with this method.
         * @param disableZkWatches true to disable zk watches
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentTtlNode.java`
#### Snippet
```java
/**
 * <p>
 *     Manages a {@link PersistentNode} that uses {@link CreateMode#CONTAINER}. Asynchronously
 *     it creates or updates a child on the persistent node that is marked with a provided TTL.
 * </p>
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentTtlNode.java`
#### Snippet
```java
/**
 * <p>
 *     Manages a {@link PersistentNode} that uses {@link CreateMode#CONTAINER}. Asynchronously
 *     it creates or updates a child on the persistent node that is marked with a provided TTL.
 * </p>
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedPriorityQueue.java`
#### Snippet
```java
     * Add an item into the queue. Adding is done in the background - thus, this method will
     * return quickly.<br><br>
     * NOTE: if an upper bound was set via {@link QueueBuilder#maxItems}, this method will
     * block until there is available space in the queue.
     *
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedPriorityQueue.java`
#### Snippet
```java
    /**
     * Same as {@link #putMulti(MultiItem, int)} but allows a maximum wait time if an upper bound was set
     * via {@link QueueBuilder#maxItems}.
     *
     * @param items items to add
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedPriorityQueue.java`
#### Snippet
```java
     * Add a set of items with the same priority into the queue. Adding is done in the background - thus, this method will
     * return quickly.<br><br>
     * NOTE: if an upper bound was set via {@link QueueBuilder#maxItems}, this method will
     * block until there is available space in the queue.
     *
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedPriorityQueue.java`
#### Snippet
```java
    /**
     * Same as {@link #put(Object, int)} but allows a maximum wait time if an upper bound was set
     * via {@link QueueBuilder#maxItems}.
     *
     * @param item item to add
```

### JavadocReference
Cannot resolve symbol `directExectutor()`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueBuilder.java`
#### Snippet
```java

    /**
     * Change the executor used. The default is {@link MoreExecutors#directExectutor()}
     *
     * @param executor new executor to use
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedIdQueue.java`
#### Snippet
```java
    /**
     * Same as {@link #put(Object, String)} but allows a maximum wait time if an upper bound was set
     * via {@link QueueBuilder#maxItems}.
     *
     * @param item item
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedIdQueue.java`
#### Snippet
```java
    /**
     * Put an item into the queue with the given Id<br><br>
     * NOTE: if an upper bound was set via {@link QueueBuilder#maxItems}, this method will
     * block until there is available space in the queue.
     *
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedDelayQueue.java`
#### Snippet
```java
     * Add a set of items with the same priority into the queue. Adding is done in the background - thus, this method will
     * return quickly.<br><br>
     * NOTE: if an upper bound was set via {@link QueueBuilder#maxItems}, this method will
     * block until there is available space in the queue.
     *
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedDelayQueue.java`
#### Snippet
```java
    /**
     * Same as {@link #put(Object, long)} but allows a maximum wait time if an upper bound was set
     * via {@link QueueBuilder#maxItems}.
     *
     * @param item item to add
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedDelayQueue.java`
#### Snippet
```java
     * Add an item into the queue. Adding is done in the background - thus, this method will
     * return quickly.<br><br>
     * NOTE: if an upper bound was set via {@link QueueBuilder#maxItems}, this method will
     * block until there is available space in the queue.
     *
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedDelayQueue.java`
#### Snippet
```java
    /**
     * Same as {@link #putMulti(MultiItem, long)} but allows a maximum wait time if an upper bound was set
     * via {@link QueueBuilder#maxItems}.
     *
     * @param items items to add
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
    /**
     * Same as {@link #putMulti(MultiItem)} but allows a maximum wait time if an upper bound was set
     * via {@link QueueBuilder#maxItems}.
     *
     * @param items items to add
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
     * Add a set of items into the queue. Adding is done in the background - thus, this method will
     * return quickly.<br><br>
     * NOTE: if an upper bound was set via {@link QueueBuilder#maxItems}, this method will
     * block until there is available space in the queue.
     *
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
     * Add an item into the queue. Adding is done in the background - thus, this method will
     * return quickly.<br><br>
     * NOTE: if an upper bound was set via {@link QueueBuilder#maxItems}, this method will
     * block until there is available space in the queue.
     *
```

### JavadocReference
Symbol `maxItems` is inaccessible from here
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
    /**
     * Same as {@link #put(Object)} but allows a maximum wait time if an upper bound was set
     * via {@link QueueBuilder#maxItems}.
     *
     * @param item item to add
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncGetDataBuilder.java`
#### Snippet
```java
     * @param stat the stat to have filled in
     * @see #decompressed()
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException.Code`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
    /**
     * Return the ZooKeeper result code. If the method was successful,
     * {@link org.apache.zookeeper.KeeperException.Code#OK} is returned. If there was a general
     * exception {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR} is returned.
     *
```

### JavadocReference
Cannot resolve symbol `OK`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
    /**
     * Return the ZooKeeper result code. If the method was successful,
     * {@link org.apache.zookeeper.KeeperException.Code#OK} is returned. If there was a general
     * exception {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR} is returned.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException.Code`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
     * Return the ZooKeeper result code. If the method was successful,
     * {@link org.apache.zookeeper.KeeperException.Code#OK} is returned. If there was a general
     * exception {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR} is returned.
     *
     * @return result code
```

### JavadocReference
Cannot resolve symbol `SYSTEMERROR`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
     * Return the ZooKeeper result code. If the method was successful,
     * {@link org.apache.zookeeper.KeeperException.Code#OK} is returned. If there was a general
     * exception {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR} is returned.
     *
     * @return result code
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java

    /**
     * If there was a general exception (but <strong>not</strong> a {@link org.apache.zookeeper.KeeperException})
     * a {@link java.lang.RuntimeException} is thrown that wraps the exception. Otherwise, the method returns
     * without any action being performed.
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException.Code`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
 *     All three possible results from a ZooKeeper method are encapsulated in this object. If the ZooKeeper
 *     method succeeds, the internal value will be set. If there was a standard ZooKeeper error code
 *     ({@link org.apache.zookeeper.KeeperException.Code#NODEEXISTS}, etc.), that code is set and the
 *     value is null. If there was a general exception, that exception is set, the value will be null
 *     and the code will be {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR}.
```

### JavadocReference
Cannot resolve symbol `NODEEXISTS`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
 *     All three possible results from a ZooKeeper method are encapsulated in this object. If the ZooKeeper
 *     method succeeds, the internal value will be set. If there was a standard ZooKeeper error code
 *     ({@link org.apache.zookeeper.KeeperException.Code#NODEEXISTS}, etc.), that code is set and the
 *     value is null. If there was a general exception, that exception is set, the value will be null
 *     and the code will be {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR}.
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException.Code`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
 *     ({@link org.apache.zookeeper.KeeperException.Code#NODEEXISTS}, etc.), that code is set and the
 *     value is null. If there was a general exception, that exception is set, the value will be null
 *     and the code will be {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR}.
 * </p>
 * @param <T> value type
```

### JavadocReference
Cannot resolve symbol `SYSTEMERROR`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
 *     ({@link org.apache.zookeeper.KeeperException.Code#NODEEXISTS}, etc.), that code is set and the
 *     value is null. If there was a general exception, that exception is set, the value will be null
 *     and the code will be {@link org.apache.zookeeper.KeeperException.Code#SYSTEMERROR}.
 * </p>
 * @param <T> value type
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java

    /**
     * If there was a general exception or a {@link org.apache.zookeeper.KeeperException}
     * a {@link java.lang.RuntimeException} is thrown that wraps the exception. Otherwise, the method returns
     * without any action being performed.
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
{
    /**
     * Specify a mode for the create. The default is {@link org.apache.zookeeper.CreateMode#PERSISTENT}
     *
     * @param createMode mode
```

### JavadocReference
Cannot resolve symbol `PERSISTENT`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
{
    /**
     * Specify a mode for the create. The default is {@link org.apache.zookeeper.CreateMode#PERSISTENT}
     *
     * @param createMode mode
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
     * @param aclList the ACL list to use
     * @param compressed true to compress
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #compressed()
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.ZooDefs.Ids`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java

    /**
     * Set an ACL list (default is {@link org.apache.zookeeper.ZooDefs.Ids#OPEN_ACL_UNSAFE})
     *
     * @param aclList the ACL list to use
```

### JavadocReference
Cannot resolve symbol `OPEN_ACL_UNSAFE`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java

    /**
     * Set an ACL list (default is {@link org.apache.zookeeper.ZooDefs.Ids#OPEN_ACL_UNSAFE})
     *
     * @param aclList the ACL list to use
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java

    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_WITH_TTL`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java

    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_SEQUENTIAL_WITH_TTL`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncTransactionCreateBuilder.java`
#### Snippet
```java
     * @param aclList the ACL list to use
     * @param compressed true to compress
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #compressed()
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.AddWatchMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncWatchBuilder.java`
#### Snippet
```java
{
    /**
     * The mode to use. By default, {@link org.apache.zookeeper.AddWatchMode#PERSISTENT_RECURSIVE} is used
     *
     * @param mode mode
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_RECURSIVE`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncWatchBuilder.java`
#### Snippet
```java
{
    /**
     * The mode to use. By default, {@link org.apache.zookeeper.AddWatchMode#PERSISTENT_RECURSIVE} is used
     *
     * @param mode mode
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException.NoNodeException`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/RemoveWatcherOption.java`
#### Snippet
```java

    /**
     * Prevents the reporting of {@link org.apache.zookeeper.KeeperException.NoNodeException}s.
     * If the watcher doesn't exist the remove method will appear to succeed.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncSetACLBuilder.java`
#### Snippet
```java
     * @param aclList ACLs to set
     * @param version "a" version
     * @see org.apache.zookeeper.data.Stat#getAversion()
     * @return this
     */
```

### JavadocReference
Cannot resolve symbol `getAversion()`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncSetACLBuilder.java`
#### Snippet
```java
     * @param aclList ACLs to set
     * @param version "a" version
     * @see org.apache.zookeeper.data.Stat#getAversion()
     * @return this
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/CreateOption.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link org.apache.zookeeper.CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `CONTAINER`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/CreateOption.java`
#### Snippet
```java

    /**
     * Causes any parent nodes to get created using {@link org.apache.zookeeper.CreateMode#CONTAINER} if they haven't already been.
     * IMPORTANT NOTE: container creation is a new feature in recent versions of ZooKeeper.
     * If the ZooKeeper version you're using does not support containers, the parent nodes
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withACL(java.util.List)
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @return this
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param setDataVersion the setData matching version or -1
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @see #withTtl(long)
     * @see #withSetDataVersion(long)
```

### JavadocReference
Cannot resolve symbol `withSetDataVersion(long)`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @see #withTtl(long)
     * @see #withSetDataVersion(long)
     * @return this
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param stat the stat to have filled in
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param createMode mode to use
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @return this
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.ZooDefs.Ids`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java

    /**
     * Set an ACL list (default is {@link org.apache.zookeeper.ZooDefs.Ids#OPEN_ACL_UNSAFE})
     *
     * @param aclList the ACL list to use
```

### JavadocReference
Cannot resolve symbol `OPEN_ACL_UNSAFE`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java

    /**
     * Set an ACL list (default is {@link org.apache.zookeeper.ZooDefs.Ids#OPEN_ACL_UNSAFE})
     *
     * @param aclList the ACL list to use
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java

    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_WITH_TTL`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java

    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_SEQUENTIAL_WITH_TTL`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @param ttl the ttl or 0
     * @see #withOptions(java.util.Set)
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java
     * @see #withMode(org.apache.zookeeper.CreateMode)
     * @see #withACL(java.util.List)
     * @see #storingStatIn(org.apache.zookeeper.data.Stat)
     * @see #withTtl(long)
     * @return this
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java

    /**
     * Use the given create mode. The default is {@link org.apache.zookeeper.CreateMode#PERSISTENT}
     *
     * @param createMode mode to use
```

### JavadocReference
Cannot resolve symbol `PERSISTENT`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncCreateBuilder.java`
#### Snippet
```java

    /**
     * Use the given create mode. The default is {@link org.apache.zookeeper.CreateMode#PERSISTENT}
     *
     * @param createMode mode to use
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException.NoNodeException`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/DeleteOption.java`
#### Snippet
```java
{
    /**
     * Prevents the reporting of {@link org.apache.zookeeper.KeeperException.NoNodeException}s.
     * If the ZNode doesn't exist the delete method will appear to succeed.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param fromConfig the config version to use
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, long)
     * @see #withJoiningAndLeaving(java.util.List, java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/AsyncReconfigBuilder.java`
#### Snippet
```java
     * @param fromConfig the config version to use
     * @see #withNewMembers(java.util.List, long)
     * @see #withNewMembers(java.util.List, org.apache.zookeeper.data.Stat)
     * @return this
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException.NoNodeException`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
     *
     * <p>
     * Note: if the any of the nodes in the path do not exist yet, {@link org.apache.zookeeper.KeeperException.NoNodeException}
     * is <strong>NOT</strong> set. Instead the stage is completed with an empty map.
     * </p>
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException.NoNodeException`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
     *
     * <p>
     * Note: if the any of the nodes in the path do not exist yet, {@link org.apache.zookeeper.KeeperException.NoNodeException}
     * is <strong>NOT</strong> set. Instead the stage is completed with an empty map.
     * </p>
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.KeeperException.NoNodeException`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModeledOptions.java`
#### Snippet
```java
    /**
     * Causes {@link ModeledFramework#children()} and {@link ModeledFramework#childrenAsZNodes()}
     * to ignore {@link org.apache.zookeeper.KeeperException.NoNodeException} and merely return
     * an empty list
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpecBuilder.java`
#### Snippet
```java

    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_WITH_TTL`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpecBuilder.java`
#### Snippet
```java

    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.CreateMode`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpecBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `PERSISTENT_SEQUENTIAL_WITH_TTL`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/ModelSpecBuilder.java`
#### Snippet
```java
    /**
     * Specify a TTL when mode is {@link org.apache.zookeeper.CreateMode#PERSISTENT_WITH_TTL} or
     * {@link org.apache.zookeeper.CreateMode#PERSISTENT_SEQUENTIAL_WITH_TTL}. If
     * the znode has not been modified within the given TTL, it will be deleted once it has no
     * children. The TTL unit is milliseconds and must be greater than 0 and less than or equal to
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/CachedModeledFramework.java`
#### Snippet
```java

    /**
     * Same as {@link #read(org.apache.zookeeper.data.Stat)} except that if the cache does not have a value
     * for this path a direct query is made.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/cached/ModeledCacheListener.java`
#### Snippet
```java
    /**
     * Returns a version of this listener that only begins calling
     * {@link #accept(org.apache.curator.x.async.modeled.cached.ModeledCacheListener.Type, org.apache.curator.x.async.modeled.ZPath, org.apache.zookeeper.data.Stat, Object)}
     * once {@link #initialized()} has been called. i.e. changes that occur as the cache is initializing are not sent
     * to the listener
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/versioned/VersionedModeledFramework.java`
#### Snippet
```java

    /**
     * @see org.apache.curator.x.async.modeled.ModeledFramework#read(org.apache.zookeeper.data.Stat)
     */
    AsyncStage<Versioned<T>> read(Stat storingStatIn);
```

### JavadocReference
Cannot resolve symbol `org.apache.zookeeper.data.Stat`
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/versioned/VersionedModeledFramework.java`
#### Snippet
```java

    /**
     * @see org.apache.curator.x.async.modeled.ModeledFramework#set(Object, org.apache.zookeeper.data.Stat)
     */
    AsyncStage<String> set(Versioned<T> model, Stat storingStatIn);
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java

        /**
         * Same as {@link CreateMode#EPHEMERAL_SEQUENTIAL}
         */
        EPHEMERAL_SEQUENTIAL()
```

### JavadocReference
Cannot resolve symbol `EPHEMERAL_SEQUENTIAL`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java

        /**
         * Same as {@link CreateMode#EPHEMERAL_SEQUENTIAL}
         */
        EPHEMERAL_SEQUENTIAL()
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java

        /**
         * Same as {@link CreateMode#EPHEMERAL_SEQUENTIAL} with protection
         */
        PROTECTED_EPHEMERAL_SEQUENTIAL()
```

### JavadocReference
Cannot resolve symbol `EPHEMERAL_SEQUENTIAL`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java

        /**
         * Same as {@link CreateMode#EPHEMERAL_SEQUENTIAL} with protection
         */
        PROTECTED_EPHEMERAL_SEQUENTIAL()
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java

        /**
         * Same as {@link CreateMode#EPHEMERAL} with protection
         */
        PROTECTED_EPHEMERAL()
```

### JavadocReference
Cannot resolve symbol `EPHEMERAL`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java

        /**
         * Same as {@link CreateMode#EPHEMERAL} with protection
         */
        PROTECTED_EPHEMERAL()
```

### JavadocReference
Cannot resolve symbol `CreateMode`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java
    {
        /**
         * Same as {@link CreateMode#EPHEMERAL}
         */
        EPHEMERAL()
```

### JavadocReference
Cannot resolve symbol `EPHEMERAL`
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java
    {
        /**
         * Same as {@link CreateMode#EPHEMERAL}
         */
        EPHEMERAL()
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
Condition `exception instanceof KeeperException.SessionExpiredException` is redundant and can be replaced with a null check
in `curator-client/src/main/java/org/apache/curator/SessionFailedRetryPolicy.java`
#### Snippet
```java
    public boolean allowRetry(Throwable exception)
    {
        if ( exception instanceof KeeperException.SessionExpiredException )
        {
            return false;
```

### DataFlowIssue
Condition `exception instanceof KeeperException` is redundant and can be replaced with a null check
in `curator-client/src/main/java/org/apache/curator/RetryPolicy.java`
#### Snippet
```java
    default boolean allowRetry(Throwable exception)
    {
        if ( exception instanceof KeeperException)
        {
            final int rc = ((KeeperException) exception).code().intValue();
```

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
Condition `e instanceof KeeperException` is redundant and can be replaced with a null check
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
        }

        if ( !Boolean.getBoolean(DebugUtils.PROPERTY_DONT_LOG_CONNECTION_ISSUES) || !(e instanceof KeeperException) )
        {
            if ( e instanceof KeeperException.ConnectionLossException )
```

### DataFlowIssue
Condition `e instanceof KeeperException.ConnectionLossException` is redundant and can be replaced with a null check
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
        if ( !Boolean.getBoolean(DebugUtils.PROPERTY_DONT_LOG_CONNECTION_ISSUES) || !(e instanceof KeeperException) )
        {
            if ( e instanceof KeeperException.ConnectionLossException )
            {
                if ( LOG_ALL_CONNECTION_ISSUES_AS_ERROR_LEVEL || logAsErrorConnectionErrors.compareAndSet(true, false) )
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
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java
    public SchemaSet(List<Schema> schemas, boolean useDefaultSchema)
    {
        schemas = Preconditions.checkNotNull(schemas, "schemas cannot be null");

        this.useDefaultSchema = useDefaultSchema;
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `curator-framework/src/main/java/org/apache/curator/framework/imps/RemoveWatchesBuilderImpl.java`
#### Snippet
```java
                                    throw e;
                                }
                                else if (e instanceof KeeperException.NoWatcherException && quietly)
                                {
                                    // ignore
```

### EmptyStatementBody
`while` statement has empty body
in `curator-framework/src/main/java/org/apache/curator/framework/imps/GzipCompressionProvider.java`
#### Snippet
```java
    private static void skipZeroTerminatedString(ByteBuffer gzippedData)
    {
        while (gzippedData.get() != 0) {
            // loop
        }
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

## RuleId[id=DeprecatedIsStillUsed]
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
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceCacheBuilder.java`
#### Snippet
```java
     */
    @Deprecated
    public ServiceCacheBuilder<T> threadFactory(ThreadFactory threadFactory);

    /**
```

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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderLatch.java`
#### Snippet
```java
            client.getConnectionStateListenable().removeListener(listener);

            switch ( closeMode )
            {
            case NOTIFY_LEADER:
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
                System.out.print("> ");

                String      line = in.readLine();
                if ( line == null )
                {
                    break;
                }

                String      command = line.trim();
                String[]    parts = command.split("\\s");
                if ( parts.length == 0 )
                {
                    continue;
                }
                String      operation = parts[0];
                String      args[] = Arrays.copyOfRange(parts, 1, parts.length);
```

### DuplicatedCode
Duplicated code
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
        return new ACLPathAndBytesable<String>()
        {
            @Override
            public PathAndBytesable<String> withACL(List<ACL> aclList)
            {
                return CreateBuilderImpl.this.withACL(aclList);
            }

            @Override
            public PathAndBytesable<String> withACL(List<ACL> aclList, boolean applyToParents)
            {
                return CreateBuilderImpl.this.withACL(aclList, applyToParents);
            }

            @Override
            public String forPath(String path, byte[] data) throws Exception
            {
                return CreateBuilderImpl.this.forPath(path, data);
            }

            @Override
            public String forPath(String path) throws Exception
            {
                return CreateBuilderImpl.this.forPath(path);
            }
        };
```

### DuplicatedCode
Duplicated code
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
        BackgroundOperation<PathAndBytes> operation = new BackgroundOperation<PathAndBytes>()
        {
            @Override
            public void performBackgroundOperation(OperationAndData<PathAndBytes> op) throws Exception
            {
                try
                {
                    client.getZooKeeper().getData(path, false, dataCallback, backgrounding.getContext());
                }
                catch ( KeeperException e )
                {
                    // ignore
                    client.logError("Unexpected exception in async idempotent check for, ignoring: " + path, e);
                }
            }
        };
        client.queueOperation(new OperationAndData<>(operation, null, null, null, null, null));
```

### DuplicatedCode
Duplicated code
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/CachedAtomicInteger.java`
#### Snippet
```java
        if ( currentValue == null )
        {
            currentValue = number.add(cacheFactor);
            if ( !currentValue.succeeded() )
            {
                currentValue = null;
                result.succeeded = false;
                return result;
            }
            currentIndex = 0;
        }

        result.succeeded = true;
        result.preValue = currentValue.preValue() + currentIndex;
        result.postValue = result.preValue + 1;

        if ( ++currentIndex >= cacheFactor )
        {
            currentValue = null;
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/LockInternals.java`
#### Snippet
```java
            List<String> sortedList = Lists.newArrayList(children);
            Collections.sort
            (
                sortedList,
                new Comparator<String>()
                {
                    @Override
                    public int compare(String lhs, String rhs)
                    {
                        return sorter.fixForSorting(lhs, lockName).compareTo(sorter.fixForSorting(rhs, lockName));
                    }
                }
            );
            return sortedList;
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

## RuleId[id=Deprecation]
### Deprecation
'newSetFromMap(java.util.Map)' is deprecated
in `curator-client/src/main/java/org/apache/curator/SessionFailRetryLoop.java`
#### Snippet
```java
    };

    private static final Set<Thread>        failedSessionThreads = Sets.newSetFromMap(Maps.<Thread, Boolean>newConcurrentMap());

    public static class SessionFailedException extends Exception
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `curator-client/src/main/java/org/apache/curator/utils/ExceptionAccumulator.java`
#### Snippet
```java
        if ( mainEx != null )
        {
            Throwables.propagate(mainEx);
        }
    }
```

### Deprecation
'newSetFromMap(java.util.Map)' is deprecated
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceDiscoveryImpl.java`
#### Snippet
```java
    private final ConcurrentMap<String, Entry<T>> services = Maps.newConcurrentMap();
    private final Collection<ServiceCache<T>> caches = Sets.newSetFromMap(Maps.<ServiceCache<T>, Boolean>newConcurrentMap());
    private final Collection<ServiceProvider<T>> providers = Sets.newSetFromMap(Maps.<ServiceProvider<T>, Boolean>newConcurrentMap());
    private final boolean watchInstances;
    private final ConnectionStateListener connectionStateListener = new ConnectionStateListener()
```

### Deprecation
'threadFactory(java.util.concurrent.ThreadFactory)' is deprecated
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceDiscoveryImpl.java`
#### Snippet
```java
        return new ServiceProviderBuilderImpl<T>(this)
            .providerStrategy(new RoundRobinStrategy<T>())
            .threadFactory(ThreadUtils.newThreadFactory("ServiceProvider"));
    }

```

### Deprecation
'newSetFromMap(java.util.Map)' is deprecated
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceDiscoveryImpl.java`
#### Snippet
```java
    private final InstanceSerializer<T> serializer;
    private final ConcurrentMap<String, Entry<T>> services = Maps.newConcurrentMap();
    private final Collection<ServiceCache<T>> caches = Sets.newSetFromMap(Maps.<ServiceCache<T>, Boolean>newConcurrentMap());
    private final Collection<ServiceProvider<T>> providers = Sets.newSetFromMap(Maps.<ServiceProvider<T>, Boolean>newConcurrentMap());
    private final boolean watchInstances;
```

### Deprecation
'newSetFromMap(java.util.Map)' is deprecated
in `curator-client/src/main/java/org/apache/curator/utils/CloseableExecutorService.java`
#### Snippet
```java
{
    private final Logger log = LoggerFactory.getLogger(CloseableExecutorService.class);
    private final Set<Future<?>> futures = Sets.newSetFromMap(Maps.<Future<?>, Boolean>newConcurrentMap());
    private final ExecutorService executorService;
    private final boolean shutdownOnClose;
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `curator-client/src/main/java/org/apache/curator/utils/ThreadUtils.java`
#### Snippet
```java
            {
                log.error("Unexpected exception in thread: " + t, e);
                Throwables.propagate(e);
            }
        };
```

### Deprecation
'getConnectString()' is deprecated
in `curator-test/src/main/java/org/apache/curator/test/TestingCluster.java`
#### Snippet
```java
                str.append(",");
            }
            str.append(spec.getConnectString());
        }
        return str.toString();
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `curator-test/src/main/java/org/apache/curator/test/QuorumConfigBuilder.java`
#### Snippet
```java
        catch ( IOException e )
        {
            Throwables.propagate(e);
        }
        this.fakeConfigFile = fakeConfigFile;
```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
        client.start();

        TreeCache cache = TreeCache.newBuilder(client, "/").setCacheData(false).build();
        cache.getListenable().addListener((c, event) -> {
            if ( event.getData() != null )
```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
        client.start();

        TreeCache cache = TreeCache.newBuilder(client, "/").setCacheData(false).build();
        cache.getListenable().addListener((c, event) -> {
            if ( event.getData() != null )
```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/EnsureContainers.java`
#### Snippet
```java

/**
 * Similar to {@link org.apache.curator.utils.EnsurePath} but creates containers.
 *
 */
```

### Deprecation
'org.apache.curator.framework.api.transaction.CuratorTransaction' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/CuratorTempFramework.java`
#### Snippet
```java
     * @throws Exception errors
     */
    public CuratorTransaction inTransaction() throws Exception;

    /**
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
    }

    private static void processCommands(CuratorFramework client, PathChildrenCache cache) throws Exception
    {
        // More scaffolding that does a simple command line processor
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
    }

    private static void list(PathChildrenCache cache)
    {
        if ( cache.getCurrentData().size() == 0 )
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
        TestingServer       server = new TestingServer();
        CuratorFramework    client = null;
        PathChildrenCache   cache = null;
        try
        {
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java

            // in this example we will cache data. Notice that this is optional.
            cache = new PathChildrenCache(client, PATH, true);
            cache.start();

```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-examples/src/main/java/cache/PathCacheExample.java`
#### Snippet
```java
    }

    private static void addListener(PathChildrenCache cache)
    {
        // a PathChildrenCacheListener is optional. Here, it's used just to log changes
```

### Deprecation
'watches()' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEventType.java`
#### Snippet
```java

    /**
     * Corresponds to {@link CuratorFramework#watches()} ()}
     */
    REMOVE_WATCHES,
```

### Deprecation
'sync(java.lang.String, java.lang.Object)' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEventType.java`
#### Snippet
```java

    /**
     * Corresponds to {@link CuratorFramework#sync(String, Object)}
     */
    SYNC,
```

### Deprecation
'watches()' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/api/CuratorEventType.java`
#### Snippet
```java

    /**
     * Corresponds to {@link CuratorFramework#watches()}
     */
    ADD_WATCH
```

### Deprecation
'org.apache.curator.framework.api.transaction.CuratorTransaction' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransactionFinal.java`
#### Snippet
```java
 * Adds commit to the transaction interface
 */
public interface CuratorTransactionFinal extends CuratorTransaction
{
    /**
```

### Deprecation
'org.apache.curator.framework.api.transaction.CuratorTransaction' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransactionResult.java`
#### Snippet
```java

    /**
     * Returns the operation generated stat or <code>null</code>. i.e. {@link CuratorTransaction#setData()}
     * generates a stat object.
     *
```

### Deprecation
'org.apache.curator.framework.api.transaction.CuratorTransaction' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/api/transaction/CuratorTransactionResult.java`
#### Snippet
```java

    /**
     * Returns the operation generated path or <code>null</code>. i.e. {@link CuratorTransaction#create()}
     * using an EPHEMERAL mode generates the created path plus its sequence number.
     *
```

### Deprecation
Overrides deprecated method in 'org.apache.curator.framework.imps.CuratorFrameworkImpl'
in `curator-framework/src/main/java/org/apache/curator/framework/imps/WatcherRemovalFacade.java`
#### Snippet
```java

    @Override
    public CuratorFramework nonNamespaceView()
    {
        return client.nonNamespaceView();
```

### Deprecation
'nonNamespaceView()' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/WatcherRemovalFacade.java`
#### Snippet
```java
    public CuratorFramework nonNamespaceView()
    {
        return client.nonNamespaceView();
    }

```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/WatcherRemovalFacade.java`
#### Snippet
```java

    @Override
    public EnsurePath newNamespaceAwareEnsurePath(String path)
    {
        return client.newNamespaceAwareEnsurePath(path);
```

### Deprecation
'watches()' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/FailedRemoveWatchManager.java`
#### Snippet
```java
        if(details.watcher == null)
        {
            client.watches().removeAll().guaranteed().inBackground().forPath(details.path);
        }
        else
```

### Deprecation
'watches()' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/FailedRemoveWatchManager.java`
#### Snippet
```java
        else
        {
            client.watches().remove(details.watcher).guaranteed().inBackground().forPath(details.path);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/Backgrounding.java`
#### Snippet
```java
            else
            {
                Throwables.propagate(e);
            }
        }
```

### Deprecation
Overrides deprecated method in 'org.apache.curator.framework.imps.CuratorFrameworkImpl'
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceFacade.java`
#### Snippet
```java

    @Override
    public CuratorFramework nonNamespaceView()
    {
        return usingNamespace(null);
```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceFacade.java`
#### Snippet
```java

    @Override
    public EnsurePath newNamespaceAwareEnsurePath(String path)
    {
        return namespace.newNamespaceAwareEnsurePath(path);
```

### Deprecation
'org.apache.curator.framework.api.transaction.CuratorTransaction' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorTempFrameworkImpl.java`
#### Snippet
```java

    @Override
    public CuratorTransaction inTransaction() throws Exception
    {
        openConnectionIfNeeded();
```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceImpl.java`
#### Snippet
```java
    }

    EnsurePath newNamespaceAwareEnsurePath(String path)
    {
        return new EnsurePath(fixForNamespace(path, false), client.getAclProvider());
```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceImpl.java`
#### Snippet
```java
    EnsurePath newNamespaceAwareEnsurePath(String path)
    {
        return new EnsurePath(fixForNamespace(path, false), client.getAclProvider());
    }
}
```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java

    @Override
    public EnsurePath newNamespaceAwareEnsurePath(String path)
    {
        return namespace.newNamespaceAwareEnsurePath(path);
```

### Deprecation
'org.apache.curator.framework.api.transaction.CuratorTransaction' is deprecated
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java

    @Override
    public CuratorTransaction inTransaction()
    {
        checkState();
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/EventOperation.java`
#### Snippet
```java
class EventOperation implements Operation
{
    private final PathChildrenCache cache;
    private final PathChildrenCacheEvent event;

```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/EventOperation.java`
#### Snippet
```java
    private final PathChildrenCacheEvent event;

    EventOperation(PathChildrenCache cache, PathChildrenCacheEvent event)
    {
        this.cache = cache;
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/GetDataOperation.java`
#### Snippet
```java
    private final String fullPath;

    GetDataOperation(PathChildrenCache cache, String fullPath)
    {
        this.cache = cache;
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/GetDataOperation.java`
#### Snippet
```java
class GetDataOperation implements Operation
{
    private final PathChildrenCache cache;
    private final String fullPath;

```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilder.java`
#### Snippet
```java
     * with CuratorCache. IMPORTANT: the connection state methods in the listener will never be called as CuratorCache
     * does not register the listener with the connection state listener container. Also note that CuratorCache
     * behaves differently than {@link org.apache.curator.framework.recipes.cache.TreeCache} so
     * things such as event ordering will likely be different.
     *
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCacheListenerBuilder.java`
#### Snippet
```java
     * with CuratorCache. IMPORTANT: the connection state methods in the listener will never be called as CuratorCache
     * does not register the listener with the connection state listener container. Also note that CuratorCache
     * behaves differently than {@link org.apache.curator.framework.recipes.cache.PathChildrenCache} so
     * things such as event ordering will likely be different.
     *
```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/CuratorCache.java`
#### Snippet
```java
     * Start a Curator Cache Bridge builder. A Curator Cache Bridge is
     * a facade that uses {@link org.apache.curator.framework.recipes.cache.CuratorCache} if
     * persistent watches are available or {@link org.apache.curator.framework.recipes.cache.TreeCache}
     * otherwise (i.e. if you are using ZooKeeper 3.5.x).
     *
```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheListener.java`
#### Snippet
```java

/**
 * Listener for {@link TreeCache} changes
 */
public interface TreeCacheListener
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCacheEvent.java`
#### Snippet
```java

        /**
         * Posted when {@link PathChildrenCache#start(PathChildrenCache.StartMode)} is called
         * with {@link PathChildrenCache.StartMode#POST_INITIALIZED_EVENT}. This
         * event signals that the initial cache has been populated.
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCacheEvent.java`
#### Snippet
```java

        /**
         * Posted when {@link PathChildrenCache#start(PathChildrenCache.StartMode)} is called
         * with {@link PathChildrenCache.StartMode#POST_INITIALIZED_EVENT}. This
         * event signals that the initial cache has been populated.
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCacheEvent.java`
#### Snippet
```java
        /**
         * Posted when {@link PathChildrenCache#start(PathChildrenCache.StartMode)} is called
         * with {@link PathChildrenCache.StartMode#POST_INITIALIZED_EVENT}. This
         * event signals that the initial cache has been populated.
         */
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/RefreshOperation.java`
#### Snippet
```java
{
    private final PathChildrenCache cache;
    private final PathChildrenCache.RefreshMode mode;

    RefreshOperation(PathChildrenCache cache, PathChildrenCache.RefreshMode mode)
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/RefreshOperation.java`
#### Snippet
```java
class RefreshOperation implements Operation
{
    private final PathChildrenCache cache;
    private final PathChildrenCache.RefreshMode mode;

```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/RefreshOperation.java`
#### Snippet
```java
    private final PathChildrenCache.RefreshMode mode;

    RefreshOperation(PathChildrenCache cache, PathChildrenCache.RefreshMode mode)
    {
        this.cache = cache;
```

### Deprecation
'org.apache.curator.framework.recipes.cache.PathChildrenCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/RefreshOperation.java`
#### Snippet
```java
    private final PathChildrenCache.RefreshMode mode;

    RefreshOperation(PathChildrenCache cache, PathChildrenCache.RefreshMode mode)
    {
        this.cache = cache;
```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheIterator.java`
#### Snippet
```java
        TreeCache.TreeNode node;

        Current(Iterator<TreeCache.TreeNode> iterator)
        {
            this.iterator = iterator;
```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheIterator.java`
#### Snippet
```java
    private static class Current
    {
        final Iterator<TreeCache.TreeNode> iterator;
        TreeCache.TreeNode node;

```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheIterator.java`
#### Snippet
```java
    public boolean hasNext()
    {
        return (current != null) && TreeCache.isLive(current.node.childData);
    }

```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheIterator.java`
#### Snippet
```java
        {
            setNext();
        } while ( (current != null) && !TreeCache.isLive(current.node.childData) );

        return result;
```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheIterator.java`
#### Snippet
```java
    }

    TreeCacheIterator(TreeCache.TreeNode root)
    {
        current = new Current(Iterators.forArray(root));
```

### Deprecation
'org.apache.curator.framework.recipes.cache.TreeCache' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheIterator.java`
#### Snippet
```java
    {
        final Iterator<TreeCache.TreeNode> iterator;
        TreeCache.TreeNode node;

        Current(Iterator<TreeCache.TreeNode> iterator)
```

### Deprecation
'org.apache.curator.framework.recipes.locks.InterProcessSemaphore' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/Lease.java`
#### Snippet
```java

/**
 * Represents an acquired lease from an {@link InterProcessSemaphore}. It is the client's responsibility
 * to close this lease when it is no longer needed so that other blocked clients can use it. If the
 * client crashes (or its session expires, etc.) the lease will automatically be closed.
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/GroupMember.java`
#### Snippet
```java
        {
            ThreadUtils.checkInterrupted(e);
            Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/GroupMember.java`
#### Snippet
```java
        {
            ThreadUtils.checkInterrupted(e);
            Throwables.propagate(e);
        }
    }
```

### Deprecation
'newSetFromMap(java.util.Map)' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSharder.java`
#### Snippet
```java
    private final QueueSharderPolicies      policies;
    private final ConcurrentMap<String, T>  queues = Maps.newConcurrentMap();
    private final Set<String>               preferredQueues = Sets.newSetFromMap(Maps.<String, Boolean>newConcurrentMap());
    private final AtomicReference<State>    state = new AtomicReference<State>(State.LATENT);
    private final LeaderLatch               leaderLatch;
```

### Deprecation
'inTransaction()' is deprecated
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
            if ( requeue )
            {
                client.inTransaction()
                    .delete().forPath(itemPath)
                    .and()
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `curator-x-async/src/main/java/org/apache/curator/x/async/migrations/MigrationManager.java`
#### Snippet
```java
                if ( e != null )
                {
                    Throwables.propagate(e);
                }
                return v;
```

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `curator-examples/src/main/java/framework/CrudExamples.java`
#### Snippet
```java
    public static List<String> watchedGetChildren(CuratorFramework client, String path) throws Exception
    {
        /**
         * Get children and set a watcher on the node. The watcher notification will come through the
         * CuratorListener (see setDataAsync() above).
```

### DanglingJavadoc
Dangling Javadoc comment
in `curator-examples/src/main/java/framework/CrudExamples.java`
#### Snippet
```java
    public static List<String> watchedGetChildren(CuratorFramework client, String path, Watcher watcher) throws Exception
    {
        /**
         * Get children and set the given watcher on the node.
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/Locker.java`
#### Snippet
```java

    @Override
    /**
     * Relase the lock if it has been acquired. Can be safely called multiple times.
     * Only the first call will unlock.
```

### DanglingJavadoc
Dangling Javadoc comment
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/watch/PersistentWatcher.java`
#### Snippet
```java
 */

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceInstance.java`
#### Snippet
```java
    public String buildUriSpec()
    {
        return buildUriSpec(Maps.<String, Object>newHashMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/UriSpec.java`
#### Snippet
```java
    public String   build()
    {
        return build(null, Maps.<String, Object>newHashMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/UriSpec.java`
#### Snippet
```java
    public String   build(ServiceInstance<?> serviceInstance)
    {
        return build(serviceInstance, Maps.<String, Object>newHashMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-client/src/main/java/org/apache/curator/SessionFailRetryLoop.java`
#### Snippet
```java
    };

    private static final Set<Thread>        failedSessionThreads = Sets.newSetFromMap(Maps.<Thread, Boolean>newConcurrentMap());

    public static class SessionFailedException extends Exception
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceDiscoveryImpl.java`
#### Snippet
```java
    private final ConcurrentMap<String, Entry<T>> services = Maps.newConcurrentMap();
    private final Collection<ServiceCache<T>> caches = Sets.newSetFromMap(Maps.<ServiceCache<T>, Boolean>newConcurrentMap());
    private final Collection<ServiceProvider<T>> providers = Sets.newSetFromMap(Maps.<ServiceProvider<T>, Boolean>newConcurrentMap());
    private final boolean watchInstances;
    private final ConnectionStateListener connectionStateListener = new ConnectionStateListener()
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceDiscoveryImpl.java`
#### Snippet
```java
    private final InstanceSerializer<T> serializer;
    private final ConcurrentMap<String, Entry<T>> services = Maps.newConcurrentMap();
    private final Collection<ServiceCache<T>> caches = Sets.newSetFromMap(Maps.<ServiceCache<T>, Boolean>newConcurrentMap());
    private final Collection<ServiceProvider<T>> providers = Sets.newSetFromMap(Maps.<ServiceProvider<T>, Boolean>newConcurrentMap());
    private final boolean watchInstances;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-client/src/main/java/org/apache/curator/utils/CloseableExecutorService.java`
#### Snippet
```java
{
    private final Logger log = LoggerFactory.getLogger(CloseableExecutorService.class);
    private final Set<Future<?>> futures = Sets.newSetFromMap(Maps.<Future<?>, Boolean>newConcurrentMap());
    private final ExecutorService executorService;
    private final boolean shutdownOnClose;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-test/src/main/java/org/apache/curator/test/InstanceSpec.java`
#### Snippet
```java
        this.tickTime = (tickTime > 0 ? tickTime : -1); // -1 to set default value
        this.maxClientCnxns = (maxClientCnxns >= 0 ? maxClientCnxns : -1); // -1 to set default value
        this.customProperties = customProperties != null ? Collections.<String,Object>unmodifiableMap(customProperties) : Collections.<String,Object>emptyMap();
        this.hostname = hostname == null ? localhost : hostname;
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-test/src/main/java/org/apache/curator/test/InstanceSpec.java`
#### Snippet
```java
        this.tickTime = (tickTime > 0 ? tickTime : -1); // -1 to set default value
        this.maxClientCnxns = (maxClientCnxns >= 0 ? maxClientCnxns : -1); // -1 to set default value
        this.customProperties = customProperties != null ? Collections.<String,Object>unmodifiableMap(customProperties) : Collections.<String,Object>emptyMap();
        this.hostname = hostname == null ? localhost : hostname;
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-framework/src/main/java/org/apache/curator/framework/imps/TransactionOpImpl.java`
#### Snippet
```java
    {
        ExtractingCuratorOp op = new ExtractingCuratorOp();
        return new CreateBuilderImpl(client).<CuratorOp>asTransactionCreateBuilder(op, op.getRecord());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-framework/src/main/java/org/apache/curator/framework/imps/TransactionOpImpl.java`
#### Snippet
```java
    {
        ExtractingCuratorOp op = new ExtractingCuratorOp();
        return new DeleteBuilderImpl(client).<CuratorOp>asTransactionDeleteBuilder(op, op.getRecord());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-framework/src/main/java/org/apache/curator/framework/imps/TransactionOpImpl.java`
#### Snippet
```java
    {
        ExtractingCuratorOp op = new ExtractingCuratorOp();
        return new SetDataBuilderImpl(client).<CuratorOp>asTransactionSetDataBuilder(op, op.getRecord());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-framework/src/main/java/org/apache/curator/framework/imps/TransactionOpImpl.java`
#### Snippet
```java
    {
        ExtractingCuratorOp op = new ExtractingCuratorOp();
        return CuratorTransactionImpl.<CuratorOp>makeTransactionCheckBuilder(client, op, op.getRecord());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorMultiTransactionImpl.java`
#### Snippet
```java
    public List<CuratorTransactionResult> forOperations(CuratorOp... operations) throws Exception
    {
        List<CuratorOp> ops = (operations != null) ? Arrays.asList(operations) : Lists.<CuratorOp>newArrayList();
        return forOperations(ops);
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java
    public static SchemaSet getDefaultSchemaSet()
    {
        return new SchemaSet(Collections.<Schema>emptyList(), true)
        {
            @Override
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java

    private static final Schema nullSchema = new Schema("__null__", null, "", "Null schema", new DefaultSchemaValidator(), Schema.Allowance.CAN, Schema.Allowance.CAN, Schema.Allowance.CAN, true, ImmutableMap.<String, String>of());
    private static final Schema defaultSchema = new Schema("__default__", null, "", "Default schema", new DefaultSchemaValidator(), Schema.Allowance.CAN, Schema.Allowance.CAN, Schema.Allowance.CAN, true, ImmutableMap.<String, String>of());
    private final boolean useDefaultSchema;

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java
        .build(cacheLoader);

    private static final Schema nullSchema = new Schema("__null__", null, "", "Null schema", new DefaultSchemaValidator(), Schema.Allowance.CAN, Schema.Allowance.CAN, Schema.Allowance.CAN, true, ImmutableMap.<String, String>of());
    private static final Schema defaultSchema = new Schema("__default__", null, "", "Default schema", new DefaultSchemaValidator(), Schema.Allowance.CAN, Schema.Allowance.CAN, Schema.Allowance.CAN, true, ImmutableMap.<String, String>of());
    private final boolean useDefaultSchema;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
    private final ConcurrentMap<String, ChildData> currentData = Maps.newConcurrentMap();
    private final AtomicReference<Map<String, ChildData>> initialSet = new AtomicReference<Map<String, ChildData>>();
    private final Set<Operation> operationsQuantizer = Sets.newSetFromMap(Maps.<Operation, Boolean>newConcurrentMap());
    private final AtomicReference<State> state = new AtomicReference<State>(State.LATENT);
    private final EnsureContainers ensureContainers;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
    public List<ChildData> getCurrentData()
    {
        return ImmutableList.copyOf(Sets.<ChildData>newTreeSet(currentData.values()));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/PathChildrenCache.java`
#### Snippet
```java
            case POST_INITIALIZED_EVENT:
            {
                initialSet.set(Maps.<String, ChildData>newConcurrentMap());
                offerOperation(new RefreshOperation(this, RefreshMode.POST_INITIALIZED));
                break;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/ChildrenCache.java`
#### Snippet
```java
    private final WatcherRemoveCuratorFramework client;
    private final String path;
    private final AtomicReference<Data> children = new AtomicReference<Data>(new Data(Lists.<String>newArrayList(), 0));
    private final AtomicBoolean isClosed = new AtomicBoolean(false);

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/QueueSharder.java`
#### Snippet
```java
    private final QueueSharderPolicies      policies;
    private final ConcurrentMap<String, T>  queues = Maps.newConcurrentMap();
    private final Set<String>               preferredQueues = Sets.newSetFromMap(Maps.<String, Boolean>newConcurrentMap());
    private final AtomicReference<State>    state = new AtomicReference<State>(State.LATENT);
    private final LeaderLatch               leaderLatch;
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-client/src/main/java/org/apache/curator/utils/CloseableExecutorService.java`
#### Snippet
```java

        @Override
        public Void get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException
        {
            return null;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public Future<?> submit(Runnable task)
    {
        return delegate.submit(task);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Callable<T> task)
    {
        return delegate.submit(task);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public void execute(Runnable command)
    {
        delegate.execute(command);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Runnable task, T result)
    {
        return delegate.submit(task, result);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException
    {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException
    {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit)
            throws InterruptedException
    {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException
    {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException
    {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
            throws InterruptedException
    {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-test/src/main/java/org/apache/curator/test/DelegatingExecutorService.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks)
            throws InterruptedException, ExecutionException
    {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-framework/src/main/java/org/apache/curator/framework/imps/OperationAndData.java`
#### Snippet
```java

    @Override
    public int compareTo(Delayed o)
    {
        if ( o == this )
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceFacadeCache.java`
#### Snippet
```java
    {
        @Override
        public NamespaceFacade load(String namespace) throws Exception
        {
            return new NamespaceFacade(client, namespace);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `curator-framework/src/main/java/org/apache/curator/framework/imps/NamespaceFacadeCache.java`
#### Snippet
```java
    {
        @Override
        public NamespaceFacade load(String namespace) throws Exception
        {
            return new NamespaceFacade(client, namespace);
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java
    {
        @Override
        public Schema load(String path) throws Exception
        {
            for ( Schema schema : regexSchemas )
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `curator-framework/src/main/java/org/apache/curator/framework/schema/SchemaSet.java`
#### Snippet
```java
    {
        @Override
        public Schema load(String path) throws Exception
        {
            for ( Schema schema : regexSchemas )
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/ChildData.java`
#### Snippet
```java
     */
    @Override
    public int compareTo(ChildData rhs)
    {
        if ( this == rhs )
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java

            @Override
            public void execute(Runnable command)
            {
                try
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/leader/LeaderSelector.java`
#### Snippet
```java

            @Override
            public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException
            {
                throw new UnsupportedOperationException();
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceInstanceBuilder.java`
#### Snippet
```java

    /**
     * based on http://pastebin.com/5X073pUc
     * <p>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-client/src/main/java/org/apache/curator/connection/ThreadLocalRetryLoop.java`
#### Snippet
```java
 * <p>
 *     Retry loops can easily end up getting nested which can cause exponential calls of the retry policy
 *     (see https://issues.apache.org/jira/browse/CURATOR-559). This utility works around that by using
 *     an internal ThreadLocal to hold a retry loop. E.g. if the retry loop fails anywhere in the chain
 *     of nested calls it will fail for the rest of the nested calls instead.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-client/src/main/java/org/apache/curator/utils/PathUtils.java`
#### Snippet
```java
 * This class is copied from Apache ZooKeeper.
 * The original class is not exported by ZooKeeper bundle and thus it can't be used in OSGi.
 * See issue: https://issues.apache.org/jira/browse/ZOOKEEPER-1627
 * A temporary workaround till the issue is resolved is to keep a copy of this class locally.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateProtectACLCreateModePathAndBytesable.java`
#### Snippet
```java
    /**
     * <p>
     *     Hat-tip to https://github.com/sbridges for pointing this out
     * </p>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeACLable.java`
#### Snippet
```java
    /**
     * <p>
     *     Hat-tip to https://github.com/sbridges for pointing this out
     * </p>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBuilderMain.java`
#### Snippet
```java
    /**
     * <p>
     *     Hat-tip to https://github.com/sbridges for pointing this out
     * </p>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-framework/src/main/java/org/apache/curator/framework/api/ProtectACLCreateModePathAndBytesable.java`
#### Snippet
```java
    /**
     * <p>
     *     Hat-tip to https://github.com/sbridges for pointing this out
     * </p>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-framework/src/main/java/org/apache/curator/framework/api/CreateBackgroundModeStatACLable.java`
#### Snippet
```java
    /**
     * <p>
     *     Hat-tip to https://github.com/sbridges for pointing this out
     * </p>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentNode.java`
#### Snippet
```java
 * </p>
 * <p>
 * Thanks to bbeck (https://github.com/bbeck) for the initial coding and design
 * </p>
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-x-async/src/main/java/org/apache/curator/x/async/api/CreateOption.java`
#### Snippet
```java
    /**
     * <p>
     *     Hat-tip to https://github.com/sbridges for pointing this out
     * </p>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/nodes/PersistentEphemeralNode.java`
#### Snippet
```java
 * </p>
 * <p>
 * Thanks to bbeck (https://github.com/bbeck) for the initial coding and design
 * </p>
 *
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
              return false;
            }
            if (!path.equals(other.path))
            {
              return false;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `curator-client/src/main/java/org/apache/curator/CuratorZookeeperClient.java`
#### Snippet
```java
            try
            {
                latch.await(timeoutMs, TimeUnit.MILLISECONDS);
            }
            finally
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `curator-examples/src/main/java/locking/LockingExample.java`
#### Snippet
```java

            service.shutdown();
            service.awaitTermination(10, TimeUnit.MINUTES);
        }
        finally
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
        try
        {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch ( InterruptedException ignore )
```

### IgnoreResultOfCall
Result of `BlockingQueue.offer()` is ignored
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
            if ( backgroundOperations.remove(operation) )   // due to the internals of DelayQueue, operation must be removed/re-added so that re-sorting occurs
            {
                backgroundOperations.offer(operation);
            }
        }
```

### IgnoreResultOfCall
Result of `BlockingQueue.offer()` is ignored
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
        if ( getState() == CuratorFrameworkState.STARTED )
        {
            backgroundOperations.offer(operationAndData);
            return true;
        }
```

### IgnoreResultOfCall
Result of `BlockingQueue.offer()` is ignored
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
                        log.debug("Retrying operation");
                    }
                    backgroundOperations.offer(operationAndData);
                    break;
                }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
                try
                {
                    executorService.awaitTermination(maxCloseWaitMs, TimeUnit.MILLISECONDS);
                }
                catch ( InterruptedException e )
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/SimpleDistributedQueue.java`
#### Snippet
```java
                    return null;
                }
                latch.await(thisWaitMs, TimeUnit.MILLISECONDS);
            }
            else
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
        try
        {
            return id.getBytes("UTF-8");
        }
        catch ( UnsupportedEncodingException e )
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'TreeCache' used without 'try'-with-resources statement
in `curator-examples/src/main/java/cache/TreeCacheExample.java`
#### Snippet
```java
        client.start();

        TreeCache cache = TreeCache.newBuilder(client, "/").setCacheData(false).build();
        cache.getListenable().addListener((c, event) -> {
            if ( event.getData() != null )
```

### AutoCloseableResource
'CuratorFramework' used without 'try'-with-resources statement
in `curator-examples/src/main/java/pubsub/SubPubTest.java`
#### Snippet
```java
    public void start()
    {
        client.unwrap().start();

        Publisher publisher = new Publisher(client);
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param path       path of the node to delete
     * @param deleteSelf flag that indicates that the node should also get deleted
     * @throws InterruptedException
     * @throws KeeperException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-client/src/main/java/org/apache/curator/utils/ZKPaths.java`
#### Snippet
```java
     * @param deleteSelf flag that indicates that the node should also get deleted
     * @throws InterruptedException
     * @throws KeeperException
     */
    public static void deleteChildren(ZooKeeper zookeeper, String path, boolean deleteSelf) throws InterruptedException, KeeperException
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-test/src/main/java/org/apache/curator/test/TestingServer.java`
#### Snippet
```java
     * thrown.
     *
     * @throws Exception
     */
    public void restart() throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-test/src/main/java/org/apache/curator/test/TestingServer.java`
#### Snippet
```java
     * Start the server
     *
     * @throws Exception
     */
    public void start() throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/ConfigureEnsembleable.java`
#### Snippet
```java
     * Sets the configuration version to use.
     * @param config The version of the configuration.
     * @throws Exception
     */
    Ensembleable<byte[]> fromConfig(long config) throws Exception;
```

### JavadocDeclaration
`@return` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesLocal.java`
#### Snippet
```java
     * Specify if the client should just remove client side watches if a connection to ZK
     * is not available. Note that the standard Curator retry loop will not be used in t
     * @return
     */
    public BackgroundPathableQuietlyable<Void> locally();
```

### JavadocDeclaration
`@return` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/ChildrenDeletable.java`
#### Snippet
```java
     *     Will also delete children if they exist.
     * </p>
     * @return
     */
    public BackgroundVersionable deletingChildrenIfNeeded();
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/AsyncReconfigurable.java`
#### Snippet
```java
     * Sets the configuration version to use.
     * @param config The version of the configuration.
     * @throws Exception
     */
    void fromConfig(long config) throws Exception;
```

### JavadocDeclaration
Tag `return` is not allowed here
in `curator-framework/src/main/java/org/apache/curator/framework/api/GuaranteeableDeletable.java`
#### Snippet
```java
 * </p>
 *  
 * @return this
 */
public interface GuaranteeableDeletable extends Guaranteeable<ChildrenDeletable>, BackgroundVersionable
```

### JavadocDeclaration
`@return` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesBuilder.java`
#### Snippet
```java
    /**
     * Specify that all watches should be removed
     * @return
     */
    public RemoveWatchesType removeAll();
```

### JavadocDeclaration
`@param watcher` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesBuilder.java`
#### Snippet
```java
    /**
     * Specify the watcher to be removed
     * @param watcher
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesBuilder.java`
#### Snippet
```java
     * Specify the watcher to be removed
     * @param watcher
     * @return
     */
    public RemoveWatchesType remove(CuratorWatcher watcher);
```

### JavadocDeclaration
`@param watcher` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesBuilder.java`
#### Snippet
```java
    /**
     * Specify the watcher to be removed
     * @param watcher
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesBuilder.java`
#### Snippet
```java
     * Specify the watcher to be removed
     * @param watcher
     * @return
     */
    public RemoveWatchesType remove(Watcher watcher);
```

### JavadocDeclaration
`@param watcherType` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesType.java`
#### Snippet
```java
    /**
     * Specify the type of watcher to be removed.
     * @param watcherType
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `curator-framework/src/main/java/org/apache/curator/framework/api/RemoveWatchesType.java`
#### Snippet
```java
     * Specify the type of watcher to be removed.
     * @param watcherType
     * @return
     */
    public RemoveWatchesLocal ofType(WatcherType watcherType);
```

### JavadocDeclaration
Javadoc pointing to itself
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCacheEvent.java`
#### Snippet
```java
         * On startup, the cache synchronizes its internal
         * state with the server, publishing a series of {@link #NODE_ADDED} events as new nodes are discovered.  Once
         * the cachehas been fully synchronized, this {@link #INITIALIZED} this event is published.  All events
         * published after this event represent actual server-side mutations.
         * </p><p>
```

### JavadocDeclaration
Exception is not declared to be thrown by method getNodeName
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/locks/Lease.java`
#### Snippet
```java
     *
     * @return data
     * @throws Exception errors
     */
    public String getNodeName();
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedPriorityQueue.java`
#### Snippet
```java
     * @param unit wait unit
     * @return true if items was added, false if timed out
     * @throws Exception
     */
    public boolean      putMulti(MultiItem<T> items, int priority, int maxWait, TimeUnit unit) throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedPriorityQueue.java`
#### Snippet
```java
     * @param unit wait unit
     * @return true if items was added, false if timed out
     * @throws Exception
     */
    public boolean     put(T item, int priority, int maxWait, TimeUnit unit) throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedIdQueue.java`
#### Snippet
```java
     * @param unit wait unit
     * @return true if items was added, false if timed out
     * @throws Exception
     */
    public boolean put(T item, String itemId, int maxWait, TimeUnit unit) throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedDelayQueue.java`
#### Snippet
```java
     * @param unit wait unit
     * @return true if items was added, false if timed out
     * @throws Exception
     */
    public boolean      put(T item, long delayUntilEpoch, int maxWait, TimeUnit unit) throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedDelayQueue.java`
#### Snippet
```java
     * @param unit wait unit
     * @return true if items was added, false if timed out
     * @throws Exception
     */
    public boolean      putMulti(MultiItem<T> items, long delayUntilEpoch, int maxWait, TimeUnit unit) throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
     * @param unit wait unit
     * @return true if items was added, false if timed out
     * @throws Exception
     */
    public boolean     putMulti(MultiItem<T> items, int maxWait, TimeUnit unit) throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/queue/DistributedQueue.java`
#### Snippet
```java
     * @param unit wait unit
     * @return true if items was added, false if timed out
     * @throws Exception
     */
    public boolean     put(T item, int maxWait, TimeUnit unit) throws Exception
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `payloadClass` may be 'final'
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/ServiceDiscoveryBuilder.java`
#### Snippet
```java
    private InstanceSerializer<T> serializer;
    private ServiceInstance<T> thisInstance;
    private Class<T> payloadClass;
    private boolean watchInstances = false;

```

### FieldMayBeFinal
Field `discovery` may be 'final'
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceProviderBuilderImpl.java`
#### Snippet
```java
class ServiceProviderBuilderImpl<T> implements ServiceProviderBuilder<T>
{
    private ServiceDiscoveryImpl<T> discovery;
    private String serviceName;
    private ProviderStrategy<T> providerStrategy;
```

### FieldMayBeFinal
Field `filters` may be 'final'
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceProviderBuilderImpl.java`
#### Snippet
```java
    private ThreadFactory threadFactory;
    private ExecutorService executorService;
    private List<InstanceFilter<T>> filters = Lists.newArrayList();
    private DownInstancePolicy downInstancePolicy = new DownInstancePolicy();

```

### FieldMayBeFinal
Field `discovery` may be 'final'
in `curator-x-discovery/src/main/java/org/apache/curator/x/discovery/details/ServiceCacheBuilderImpl.java`
#### Snippet
```java
class ServiceCacheBuilderImpl<T> implements ServiceCacheBuilder<T>
{
    private ServiceDiscoveryImpl<T> discovery;
    private String name;
    private ThreadFactory threadFactory;
```

### FieldMayBeFinal
Field `sessionId` may be 'final'
in `curator-client/src/main/java/org/apache/curator/drivers/OperationTrace.java`
#### Snippet
```java
    private String path;
    private boolean withWatcher;
    private long sessionId;
    private Stat stat;

```

### FieldMayBeFinal
Field `client` may be 'final'
in `curator-framework/src/main/java/org/apache/curator/framework/imps/RemoveWatchesBuilderImpl.java`
#### Snippet
```java
public class RemoveWatchesBuilderImpl implements RemoveWatchesBuilder, RemoveWatchesType, RemoveWatchesLocal, BackgroundOperation<String>, ErrorListenerPathable<Void>
{
    private CuratorFrameworkImpl client;
    private Watcher watcher;
    private CuratorWatcher curatorWatcher;
```

### FieldMayBeFinal
Field `bytes` may be 'final'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicLong.java`
#### Snippet
```java
    private class AtomicLong implements AtomicValue<Long>
    {
        private AtomicValue<byte[]> bytes;

        private AtomicLong(AtomicValue<byte[]> bytes)
```

### FieldMayBeFinal
Field `bytes` may be 'final'
in `curator-recipes/src/main/java/org/apache/curator/framework/recipes/atomic/DistributedAtomicInteger.java`
#### Snippet
```java
    private class AtomicInteger implements AtomicValue<Integer>
    {
        private AtomicValue<byte[]> bytes;

        private AtomicInteger(AtomicValue<byte[]> bytes)
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

## RuleId[id=BusyWait]
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

### UnusedAssignment
Variable `createdPath` initializer `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
                {
                    debugForceFindProtectedNode = false;
                    String createdPath = null;
                    try
                    {
```

### UnusedAssignment
Variable `foundNode` initializer `null` is redundant
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
                    public String call() throws Exception
                    {
                        String foundNode = null;
                        try
                        {
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `exception` is always 'null'
in `curator-client/src/main/java/org/apache/curator/SessionFailedRetryPolicy.java`
#### Snippet
```java
        else
        {
            return delegatePolicy.allowRetry(exception);
        }
    }
```

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
Condition `e instanceof KeeperException.NoWatcherException` is always `true`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/RemoveWatchesBuilderImpl.java`
#### Snippet
```java
                                    throw e;
                                }
                                else if (e instanceof KeeperException.NoWatcherException && quietly)
                                {
                                    // ignore
```

### ConstantValue
Condition `e instanceof KeeperException` is always `true`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/Backgrounding.java`
#### Snippet
```java
                                {
                                    ThreadUtils.checkInterrupted(e);
                                    if ( e instanceof KeeperException )
                                    {
                                        client.validateConnection(client.codeToState(((KeeperException)e).code()));
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
Value `e` is always 'null'
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CuratorFrameworkImpl.java`
#### Snippet
```java
            else
            {
                log.error(reason, e);
            }
        }
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
Condition `e instanceof KeeperException.ConnectionLossException` is always `true`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
        {
            ThreadUtils.checkInterrupted(e);
            if ( ( e instanceof KeeperException.ConnectionLossException ||
                !( e instanceof KeeperException )) && protectedMode.doProtected() )
            {
```

### ConstantValue
Condition `e instanceof KeeperException.ConnectionLossException || !( e instanceof KeeperExcept...` is always `true`
in `curator-framework/src/main/java/org/apache/curator/framework/imps/CreateBuilderImpl.java`
#### Snippet
```java
        {
            ThreadUtils.checkInterrupted(e);
            if ( ( e instanceof KeeperException.ConnectionLossException ||
                !( e instanceof KeeperException )) && protectedMode.doProtected() )
            {
                /*
```

### ConstantValue
Condition `ex instanceof KeeperException` is always `true`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncResult.java`
#### Snippet
```java
            if ( ex != null )
            {
                if ( ex instanceof KeeperException )
                {
                    return new AsyncResultImpl<T>(((KeeperException)ex).code());
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

### ConstantValue
Condition `Throwables.getRootCause(e) instanceof KeeperException.NoNodeException` is always `true`
in `curator-x-async/src/main/java/org/apache/curator/x/async/AsyncWrappers.java`
#### Snippet
```java
            if ( e != null )
            {
                if ( Throwables.getRootCause(e) instanceof KeeperException.NoNodeException )
                {
                    future.complete(Maps.newHashMap());
```

### ConstantValue
Condition `Throwables.getRootCause(e) instanceof KeeperException.NoNodeException` is always `true` when reached
in `curator-x-async/src/main/java/org/apache/curator/x/async/modeled/details/ModeledFrameworkImpl.java`
#### Snippet
```java
            if ( e != null )
            {
                if ( modeledOptions.contains(ModeledOptions.ignoreMissingNodesForChildren) && (Throwables.getRootCause(e) instanceof KeeperException.NoNodeException) )
                {
                    modelStage.complete(Collections.emptyList());
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

