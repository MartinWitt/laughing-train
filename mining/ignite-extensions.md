# ignite-extensions 
 
# Bad smells
I found 1366 bad smells with 74 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringXmlModelInspection | 585 | false |
| JavadocReference | 434 | false |
| UnnecessaryModifier | 66 | true |
| UNCHECKED_WARNING | 49 | false |
| FieldMayBeFinal | 44 | false |
| Deprecation | 24 | false |
| DuplicatedCode | 22 | false |
| SpringBootApplicationYaml | 20 | false |
| JavadocDeclaration | 13 | false |
| ConstantValue | 12 | false |
| DataFlowIssue | 10 | false |
| EqualsBetweenInconvertibleTypes | 10 | false |
| CStyleArrayDeclaration | 7 | false |
| JavadocLinkAsPlainText | 7 | false |
| IgnoreResultOfCall | 6 | false |
| FieldCanBeLocal | 5 | false |
| DeprecatedIsStillUsed | 4 | false |
| RegExpSimplifiable | 4 | false |
| RegExpRedundantNestedCharacterClass | 4 | false |
| UnusedAssignment | 4 | false |
| UnnecessaryToStringCall | 3 | true |
| SortedCollectionWithNonComparableKeys | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| IOStreamConstructor | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| TrivialIf | 2 | false |
| MalformedFormatString | 2 | false |
| NonAtomicOperationOnVolatileField | 2 | false |
| UnstableApiUsage | 2 | false |
| RedundantLengthCheck | 1 | false |
| RegExpRedundantEscape | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| MismatchedJavadocCode | 1 | false |
| UnnecessaryReturn | 1 | true |
| NonStrictComparisonCanBeEquality | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| RedundantMethodOverride | 1 | false |
| RedundantCast | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| RedundantFileCreation | 1 | false |
| UseBulkOperation | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyArgument.java`
#### Snippet
```java
     *      object creation.
     */
    public Object getTarget();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyArgument.java`
#### Snippet
```java
     * @return Method parameters.
     */
    public Object[] getMethodParameters();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyArgument.java`
#### Snippet
```java
     * @return Method parameter types.
     */
    public Class<?>[] getMethodParameterTypes();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyArgument.java`
#### Snippet
```java
     * @return Method name.
     */
    public String getMethodName();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyArgument.java`
#### Snippet
```java
     * @return Class to which method belongs.
     */
    public Class<?> getMethodClass();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyInterceptor.java`
#### Snippet
```java
     * @throws IgniteCheckedException Thrown in case of any errors.
     */
    public boolean isGridify(Annotation gridify, GridifyArgument arg) throws IgniteCheckedException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/s3/encrypt/EncryptionService.java`
#### Snippet
```java
     * @throws IllegalArgumentException If the parameter data is null.
     */
    public byte[] decrypt(byte[] data);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/s3/encrypt/EncryptionService.java`
#### Snippet
```java
     * EncryptionService#decrypt(byte[])} are used.
     */
    public void init();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/s3/encrypt/EncryptionService.java`
#### Snippet
```java
     * @throws IllegalArgumentException If the parameter data is null.
     */
    public byte[] encrypt(byte[] data);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpiMBean.java`
#### Snippet
```java
     */
    @MXBeanDescription("S3 access key.")
    public String getAccessKey();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpiMBean.java`
#### Snippet
```java
     */
    @MXBeanDescription("S3 bucket endpoint.")
    public String getBucketEndpoint();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpiMBean.java`
#### Snippet
```java
     */
    @MXBeanDescription("S3 server-side encryption algorithm.")
    public String getSSEAlgorithm();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpiMBean.java`
#### Snippet
```java
     */
    @MXBeanDescription("HTTP proxy host.")
    public String getProxyHost();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpiMBean.java`
#### Snippet
```java
     */
    @MXBeanDescription("HTTP proxy port.")
    public int getProxyPort();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpiMBean.java`
#### Snippet
```java
     */
    @MXBeanDescription("S3 bucket name.")
    public String getBucketName();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpiMBean.java`
#### Snippet
```java
     */
    @MXBeanDescription("HTTP proxy user name.")
    public String getProxyUsername();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/examples/src/main/java/org/apache/ignite/springdata/examples/PersonRepository.java`
#### Snippet
```java
     * @return Person that satisfy the query.
     */
    public Cache.Entry<Long, Person> findTopByLastNameLike(String name);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/examples/src/main/java/org/apache/ignite/springdata/examples/PersonRepository.java`
#### Snippet
```java
     */
    @Query("SELECT id FROM Person WHERE orgId > ?")
    public List<Long> selectId(long orgId, Pageable pageable);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/examples/src/main/java/org/apache/ignite/springdata/examples/PersonRepository.java`
#### Snippet
```java
     * @return A list of Persons with the given first name.
     */
    public List<Person> findByFirstName(String name);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @return <tt>false</tt> if there was no matching key.
     */
    public boolean remove(K key);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * with the specified key and a value was set.
     */
    public V getAndPutIfAbsent(K key, V val);

    /** Removes all of the mappings from this cache. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @param map Mappings to be stored in this cache.
     */
    public void putAll(Map<? extends K, ? extends V> map);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java

    /** Removes all of the mappings from this cache. */
    public void removeAll();

    /** @return Cache instance to which the current proxy delegates operations. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java

    /** @return Cache with read-through write-through behavior disabled. */
    public IgniteCacheProxy<K, V> withSkipStore();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @return the element, or null, if it does not exist.
     */
    public V get(K key);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java

    /** @return The name of the cache. */
    public String getName();

    /** @return Cache with read-through write-through behavior disabled. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java

    /** Clears the contents of the cache. */
    public void clear();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @return <tt>true</tt> if this map contains a mapping for the specified key.
     */
    public boolean containsKey(K key);

    /** @return The name of the cache. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @return A map of entries that were found for the given keys.
     */
    public Map<K, V> getAll(Set<? extends K> keys);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @param val value to be associated with the specified key.
     */
    public void put(K key, V val);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @return The number of all entries cached across all nodes.
     */
    public int size(CachePeekMode... peekModes);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @return Query result cursor.
     */
    public <R> QueryCursor<R> query(Query<R> qry);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @param keys The keys to remove.
     */
    public void removeAll(Set<? extends K> keys);

    /** Clears the contents of the cache. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java

    /** @return Cache instance to which the current proxy delegates operations. */
    public Object delegate();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java
     * @return Cache instance with the specified expiry policy set.
     */
    public IgniteCacheProxy<K, V> withExpiryPolicy(ExpiryPolicy expirePlc);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteProxy.java`
#### Snippet
```java
     * @return Cache proxy that provides access to cache with specified name or {@code null} if it doesn't exist.
     */
    public <K, V> IgniteCacheProxy<K, V> cache(String name);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteProxy.java`
#### Snippet
```java
     * @return Cache proxy that provides access to cache with given name.
     */
    public <K, V> IgniteCacheProxy<K, V> getOrCreateCache(String name);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteProxy.java`
#### Snippet
```java
     * @return Ignite proxy instance.
     */
    public static IgniteProxy of(Object connObj) {
        if (connObj instanceof Ignite)
            return new IgniteNodeProxy((Ignite)connObj);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * @return Saved entities.
     */
    public <S extends V> Iterable<S> save(Map<K, S> entities, @Nullable ExpiryPolicy expiryPlc);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * @return Saved entities.
     */
    public <S extends V> Iterable<S> save(Map<K, S> entities);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * @return Saved entity.
     */
    public <S extends V> S save(K key, S entity);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * @return the Ignite Cache bound to the repository
     */
    public IgniteCache<K, V> cache();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * @return Saved entity.
     */
    public <S extends V> S save(K key, S entity, @Nullable ExpiryPolicy expiryPlc);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * @param ids List of ids to delete.
     */
    public void deleteAllById(Iterable<? extends K> ids);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * @return the Ignite instance bound to the repository
     */
    public Ignite ignite();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     * Returns the query string.
     */
    public String getQueryString();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     * @return whether the underlying query has at least one named parameter.
     */
    public boolean hasNamedParameter();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     * Returns whether the query is using a constructor expression.
     */
    public boolean hasConstructorExpression();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     * Returns whether the query uses the default projection, i.e. returns the main alias defined for the query.
     */
    public boolean isDefaultProjection();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     * @return a {@literal DeclaredQuery} instance even for a {@literal null} or empty argument.
     */
    public static DeclaredQuery of(@Nullable String qry) {
        return StringUtils.isEmpty(qry) ? EmptyDeclaredQuery.EMPTY_QUERY : new StringQuery(qry);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     * @return a new {@literal DeclaredQuery} instance.
     */
    public DeclaredQuery deriveCountQuery(@Nullable String cntQry, @Nullable String cntQryProjection);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     */
    @Nullable
    public String getAlias();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     * Returns the {@link StringQuery.ParameterBinding}s registered.
     */
    public List<StringQuery.ParameterBinding> getParameterBindings();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     * @return whether paging is implemented in the query itself, e.g. using SpEL expressions.
     */
    public default boolean usesPaging() {
        return false;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/DeclaredQuery.java`
#### Snippet
```java
     * @return Whether the query uses JDBC style parameters.
     */
    public boolean usesJdbcStyleParameters();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/internal/transactions/proxy/TransactionProxy.java`
#### Snippet
```java
     *      because transaction is already finishing up committing or rolling back.
     */
    public boolean setRollbackOnly();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/internal/transactions/proxy/TransactionProxy.java`
#### Snippet
```java
public interface TransactionProxy extends AutoCloseable {
    /** Commits this transaction. */
    public void commit();

    /** Rolls back this transaction. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/internal/transactions/proxy/TransactionProxy.java`
#### Snippet
```java

    /** Rolls back this transaction. */
    public void rollback();

    /** Ends the transaction. Transaction will be rolled back if it has not been committed. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/internal/transactions/proxy/TransactionProxy.java`
#### Snippet
```java

    /** Ends the transaction. Transaction will be rolled back if it has not been committed. */
    @Override public void close();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/internal/transactions/proxy/TransactionProxyFactory.java`
#### Snippet
```java
public interface TransactionProxyFactory {
    /** Starts transaction with specified concurrency, isolation and timeout. */
    public TransactionProxy txStart(TransactionConcurrency concurrency, TransactionIsolation isolation, long timeout);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateKeyTransformer.java`
#### Snippet
```java
     * @return Transformed key.
     */
    public Object transform(Object key);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateExceptionConverter.java`
#### Snippet
```java
     * @return Converted exception.
     */
    public RuntimeException convert(Exception e);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/geospatial-ext/geospatial/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GeoSpatialIndex.java`
#### Snippet
```java
     * @return Cursor of found index rows.
     */
    public GridCursor<IndexRow> findFirstOrLast(int segment, boolean firstOrLast);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/geospatial-ext/geospatial/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GeoSpatialIndex.java`
#### Snippet
```java
     * @return total count of index rows.
     */
    public long totalCount() throws IgniteCheckedException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/geospatial-ext/geospatial/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GeoSpatialIndex.java`
#### Snippet
```java
     * @return Cursor of found index rows.
     */
    public GridCursor<IndexRow> findByGeometry(int segment, TableFilter filter, Geometry intersection);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `modules/geospatial-ext/geospatial/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GeoSpatialIndex.java`
#### Snippet
```java
     * @return Cursor of found index rows.
     */
    public GridCursor<IndexRow> find(int segment, TableFilter filter);

    /**
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyUtils.java`
#### Snippet
```java
     */
    public static boolean isMethodParameterTypeAnnotated(Annotation[] anns) {
        if (anns != null && anns.length > 0) {
            for (Annotation ann : anns) {
                if (ann.annotationType().equals(GridifyInput.class))
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.EnumMap' to 'java.util.Map\>\>'
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/QueryHandler.java`
#### Snippet
```java
    /** Parsed reads: queryType -> queryNodeId -> queryId -> reads. */
    private final Map<GridCacheQueryType, Map<UUID, Map<Long, long[]>>> readsById =
        new EnumMap<>(GridCacheQueryType.class);

    /** Structure to store top of slow SQL queries: queryType -> duration -> query. */
```

### UNCHECKED_WARNING
Unchecked call to 'EnumMap(Class)' as a member of raw type 'java.util.EnumMap'
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/QueryHandler.java`
#### Snippet
```java
    /** Parsed reads: queryType -> queryNodeId -> queryId -> reads. */
    private final Map<GridCacheQueryType, Map<UUID, Map<Long, long[]>>> readsById =
        new EnumMap<>(GridCacheQueryType.class);

    /** Structure to store top of slow SQL queries: queryType -> duration -> query. */
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.EnumMap' to 'java.util.Map\>'
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/QueryHandler.java`
#### Snippet
```java
    /**  Queries results: queryType -> queryText -> aggregatedInfo. */
    private final Map<GridCacheQueryType, Map<String, AggregatedQueryInfo>> aggrQuery =
        new EnumMap<>(GridCacheQueryType.class);

    /** Parsed reads: queryType -> queryNodeId -> queryId -> reads. */
```

### UNCHECKED_WARNING
Unchecked call to 'EnumMap(Class)' as a member of raw type 'java.util.EnumMap'
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/QueryHandler.java`
#### Snippet
```java
    /**  Queries results: queryType -> queryText -> aggregatedInfo. */
    private final Map<GridCacheQueryType, Map<String, AggregatedQueryInfo>> aggrQuery =
        new EnumMap<>(GridCacheQueryType.class);

    /** Parsed reads: queryType -> queryNodeId -> queryId -> reads. */
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.EnumMap' to 'java.util.Map\>'
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/QueryHandler.java`
#### Snippet
```java
    /** Structure to store top of slow SQL queries: queryType -> duration -> query. */
    private final Map<GridCacheQueryType, OrderedFixedSizeStructure<Long, Query>> topSlow =
        new EnumMap<>(GridCacheQueryType.class);

    /** {@inheritDoc} */
```

### UNCHECKED_WARNING
Unchecked call to 'EnumMap(Class)' as a member of raw type 'java.util.EnumMap'
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/QueryHandler.java`
#### Snippet
```java
    /** Structure to store top of slow SQL queries: queryType -> duration -> query. */
    private final Map<GridCacheQueryType, OrderedFixedSizeStructure<Long, Query>> topSlow =
        new EnumMap<>(GridCacheQueryType.class);

    /** {@inheritDoc} */
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.EnumMap' to 'java.util.Map\>'
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/CacheOperationsHandler.java`
#### Snippet
```java
            for (int cache : cacheIds) {
                res.computeIfAbsent(node, uuid -> new HashMap<>())
                    .computeIfAbsent(cache, id -> new EnumMap<>(OperationType.class))
                    .computeIfAbsent(type, op -> new HashMap<>())
                    .computeIfAbsent(aggrTime, time -> new IntWrapper())
```

### UNCHECKED_WARNING
Unchecked call to 'EnumMap(Class)' as a member of raw type 'java.util.EnumMap'
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/handlers/CacheOperationsHandler.java`
#### Snippet
```java
            for (int cache : cacheIds) {
                res.computeIfAbsent(node, uuid -> new HashMap<>())
                    .computeIfAbsent(cache, id -> new EnumMap<>(OperationType.class))
                    .computeIfAbsent(type, op -> new HashMap<>())
                    .computeIfAbsent(aggrTime, time -> new IntWrapper())
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.ignite.cdc.kafka.KafkaToIgniteClientCdcStreamer' to 'T'
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteLoader.java`
#### Snippet
```java

        if (ignCfg.isEmpty())
            return (T)new KafkaToIgniteClientCdcStreamer(clientCfg.iterator().next(), kafkaProps, k2iCfg.iterator().next());
        else
            return (T)new KafkaToIgniteCdcStreamer(ignCfg.iterator().next(), kafkaProps, k2iCfg.iterator().next());
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.ignite.cdc.kafka.KafkaToIgniteCdcStreamer' to 'T'
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteLoader.java`
#### Snippet
```java
            return (T)new KafkaToIgniteClientCdcStreamer(clientCfg.iterator().next(), kafkaProps, k2iCfg.iterator().next());
        else
            return (T)new KafkaToIgniteCdcStreamer(ignCfg.iterator().next(), kafkaProps, k2iCfg.iterator().next());
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'apply(Iterable)' as a member of raw type 'org.apache.ignite.cdc.AbstractCdcEventsApplier'
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
        }

        applier.apply(F.iterator(recs, this::deserialize, true, this::filterAndPossiblyUpdateMetadata));

        cnsmr.commitSync(Duration.ofMillis(kafkaReqTimeout));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class\>'
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSinkTask.java`
#### Snippet
```java
                try {
                    Class<? extends StreamSingleTupleExtractor> clazz =
                        (Class<? extends StreamSingleTupleExtractor<SinkRecord, Object, Object>>)
                            Class.forName(transformerCls);

                    extractor = clazz.newInstance();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class\>'
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSourceTask.java`
#### Snippet
```java
                    try {
                        Class<? extends IgnitePredicate<CacheEvent>> clazz =
                            (Class<? extends IgnitePredicate<CacheEvent>>)Class.forName(filterCls);

                        filter = clazz.newInstance();
```

### UNCHECKED_WARNING
Unchecked call to 'isAnnotationPresent(Class)' as a member of raw type 'java.lang.Class'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySpringPointcut.java`
#### Snippet
```java
        // Warning suppression is due to Spring...
        @Override public boolean matches(Method method, Class cls) {
            return cls.isAnnotationPresent(GridifySetToValue.class) || method.isAnnotationPresent(GridifySetToValue.class);
        }
    };
```

### UNCHECKED_WARNING
Unchecked call to 'isAnnotationPresent(Class)' as a member of raw type 'java.lang.Class'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySpringPointcut.java`
#### Snippet
```java
        // Warning suppression is due to Spring...
        @Override public boolean matches(Method method, Class cls) {
            return cls.isAnnotationPresent(GridifySetToSet.class) || method.isAnnotationPresent(GridifySetToSet.class);
        }
    };
```

### UNCHECKED_WARNING
Unchecked call to 'isAnnotationPresent(Class)' as a member of raw type 'java.lang.Class'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySpringPointcut.java`
#### Snippet
```java
        // Warning suppression is due to Spring...
        @Override public boolean matches(Method method, Class cls) {
            return cls.isAnnotationPresent(Gridify.class) || method.isAnnotationPresent(Gridify.class);
        }
    };
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/ApplicationMaster.java`
#### Snippet
```java
                        ctx.setTokens(allTokens.duplicate());

                    Map<String, String> env = new HashMap<>(ctx.getEnvironment());

                    Map<String, String> systemEnv = System.getenv();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public void destroy() throws Exception {
        Set<IgniteProxy> proxies = new HashSet<>(igniteProxies.values());

        Exception destroyE = null;
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public void destroy() throws Exception {
        Set<IgniteProxy> proxies = new HashSet<>(igniteProxies.values());

        Exception destroyE = null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/SpringCache.java`
#### Snippet
```java
                ", key=" + key + ", val=" + val + ", requiredType=" + type + ']');

        return (T)val;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/SpringCache.java`
#### Snippet
```java
        }

        return (T)unwrapNull(val);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Iterable\>' to 'java.util.Set'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteRepositoryImpl.java`
#### Snippet
```java
    @Override public void deleteAllById(Iterable<? extends K> ids) {
        if (ids instanceof Set) {
            cache.removeAll((Set<K>)ids);
            return;
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Iterable\>' to 'java.util.Collection'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteRepositoryImpl.java`
#### Snippet
```java

        if (ids instanceof Collection) {
            cache.removeAll(new HashSet<>((Collection<K>)ids));
            return;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'getOrDefault(Object, V)' as a member of raw type 'java.util.Map'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateRegionFactory.java`
#### Snippet
```java
        this.options = options;

        String accessType = cfgValues.getOrDefault(
            DFLT_ACCESS_TYPE_PROPERTY, NONSTRICT_READ_WRITE.name()).toString();

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateRegionFactory.java`
#### Snippet
```java
        dfltAccessType = AccessType.valueOf(accessType);

        accessStgyFactory.start(cfgValues);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.ThreadLocal' to 'java.lang.ThreadLocal'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateNonStrictAccessStrategy.java`
#### Snippet
```java
        super(ignite, cache, eConverter);

        this.writeCtx = (ThreadLocal<WriteContext>)writeCtx;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.ThreadLocal' to 'java.lang.ThreadLocal'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateReadWriteAccessStrategy.java`
#### Snippet
```java
        super(ignite, cache, eConverter);

        this.txCtx = (ThreadLocal<TxContext>)txCtx;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public void clearAll(Set keys) throws IgniteCheckedException {
        delegate.get().clearAll((Set<?>)transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public IgniteInternalFuture<Boolean> containsKeysAsync(Collection keys) {
        return delegate.get().containsKeysAsync(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    @Override public Collection<CacheEntry<Object, Object>> getEntries(
        @Nullable Collection keys) throws IgniteCheckedException {
        return delegate.get().getEntries(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public IgniteInternalFuture<?> clearAllAsync(Set keys) {
        return delegate.get().clearAllAsync((Set<?>)transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public void unlockAll(@Nullable Collection keys) throws IgniteCheckedException {
        delegate.get().unlockAll(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public IgniteInternalFuture<Map<Object, Object>> getAllAsync(@Nullable Collection keys) {
        return delegate.get().getAllAsync(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public void evictAll(@Nullable Collection keys) {
        delegate.get().evictAll(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public boolean containsKeys(Collection keys) {
        return delegate.get().containsKey(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public IgniteInternalFuture<Boolean> lockAllAsync(@Nullable Collection keys, long timeout) {
        return delegate.get().lockAllAsync(transform(keys), timeout);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public Map getAll(@Nullable Collection keys) throws IgniteCheckedException {
        return delegate.get().getAll(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public boolean lockAll(@Nullable Collection keys, long timeout) throws IgniteCheckedException {
        return delegate.get().lockAll(transform(keys), timeout);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
        @Nullable Collection keys
    ) {
        return delegate.get().getEntriesAsync(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public IgniteInternalFuture<?> putAllAsync(@Nullable Map m) {
        return delegate.get().putAllAsync(transform(m));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public void clearLocallyAll(Set keys, boolean srv, boolean near, boolean readers) {
        delegate.get().clearLocallyAll((Set<?>)transform(keys), srv, near, readers);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public Map invokeAll(Set keys, EntryProcessor entryProcessor, Object... args) throws IgniteCheckedException {
        return delegate.get().invokeAll((Set<?>)transform(keys), entryProcessor, args);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public void putAll(@Nullable Map m) throws IgniteCheckedException {
        delegate.get().putAll(transform(m));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public Map getAllOutTx(Set keys) throws IgniteCheckedException {
        return delegate.get().getAllOutTx((Set<?>)transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public IgniteInternalFuture<?> removeAllAsync(@Nullable Collection keys) {
        return delegate.get().removeAllAsync(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public IgniteInternalFuture<Map<Object, Object>> getAllOutTxAsync(Set keys) {
        return delegate.get().getAllOutTxAsync((Set<?>)transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public void removeAll(@Nullable Collection keys) throws IgniteCheckedException {
        delegate.get().removeAll(transform(keys));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override public IgniteInternalFuture<Map> invokeAllAsync(Set keys, EntryProcessor entryProcessor, Object... args) {
        return delegate.get().invokeAllAsync((Set<?>)transform(keys), entryProcessor, args);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.h2.mvstore.rtree.MVRTreeMap\[\]' to 'org.h2.mvstore.rtree.MVRTreeMap\[\]'
in `modules/geospatial-ext/geospatial/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GeoSpatialIndexImpl.java`
#### Snippet
```java
        store = MVStore.open(null);

        segments = new MVRTreeMap[def.segmentsCnt()];

        for (int i = 0; i < def.segmentsCnt(); i++)
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `IgniteDataStreamer`
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java
/**
 * Server that subscribes to topic messages from Pub/Sub and streams its to key-value pairs into
 * {@link IgniteDataStreamer} instance, using Google Cloud Pub/Sub sdk as a Pub/Sub client.
 * <p>
 * You must also provide a {@link StreamSingleTupleExtractor} or a {@link StreamMultipleTupleExtractor} to extract
```

### JavadocReference
Cannot resolve symbol `StreamSingleTupleExtractor`
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java
 * {@link IgniteDataStreamer} instance, using Google Cloud Pub/Sub sdk as a Pub/Sub client.
 * <p>
 * You must also provide a {@link StreamSingleTupleExtractor} or a {@link StreamMultipleTupleExtractor} to extract
 * cache tuples out of the incoming message.
 * <p>
```

### JavadocReference
Cannot resolve symbol `StreamMultipleTupleExtractor`
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java
 * {@link IgniteDataStreamer} instance, using Google Cloud Pub/Sub sdk as a Pub/Sub client.
 * <p>
 * You must also provide a {@link StreamSingleTupleExtractor} or a {@link StreamMultipleTupleExtractor} to extract
 * cache tuples out of the incoming message.
 * <p>
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java
     * Starts streamer.
     *
     * @throws IgniteException If failed.
     */
    public void start() {
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java
         * @param returnImmediately
         * @param maxMessages
         * @throws IgniteException
         */
        public ConsumerTask(
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder`
in `modules/gce-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/gce/TcpDiscoveryGoogleStorageIpFinder.java`
#### Snippet
```java
 * <p>
 * Note that storing data in Google Cloud Storage service will result in charges to your Google Cloud Platform account.
 * Choose another implementation of {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder} for local
 * or home network tests.
 * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder`
in `modules/gce-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/gce/TcpDiscoveryGoogleStorageIpFinder.java`
#### Snippet
```java
 * or home network tests.
 * <p>
 * Note that this finder is shared by default (see {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder#isShared()}.
 */
public class TcpDiscoveryGoogleStorageIpFinder extends TcpDiscoveryIpFinderAdapter {
```

### JavadocReference
Cannot resolve symbol `isShared()`
in `modules/gce-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/gce/TcpDiscoveryGoogleStorageIpFinder.java`
#### Snippet
```java
 * or home network tests.
 * <p>
 * Note that this finder is shared by default (see {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder#isShared()}.
 */
public class TcpDiscoveryGoogleStorageIpFinder extends TcpDiscoveryIpFinderAdapter {
```

### JavadocReference
Cannot resolve symbol `IgniteSpiException`
in `modules/gce-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/gce/TcpDiscoveryGoogleStorageIpFinder.java`
#### Snippet
```java
     * @param key Bucket key.
     * @return Node address.
     * @throws IgniteSpiException In case of error.
     */
    private InetSocketAddress addrFromString(String key) throws IgniteSpiException {
```

### JavadocReference
Cannot resolve symbol `IgniteSpiException`
in `modules/gce-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/gce/TcpDiscoveryGoogleStorageIpFinder.java`
#### Snippet
```java
     * Google Cloud Storage initialization.
     *
     * @throws IgniteSpiException In case of error.
     */
    private void init() throws IgniteSpiException {
```

### JavadocReference
Cannot resolve symbol `Message`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/MessageTransformer.java`
#### Snippet
```java

/**
 * Implement this interface to transform from a {@link Message} to a set of cache entries in the form of a {@link Map}.
 *
 * @param <T> The type of JMS Message.
```

### JavadocReference
Cannot resolve symbol `CdcMain`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/IgniteToIgniteCdcStreamer.java`
#### Snippet
```java
 * Configuration of {@link CacheVersionConflictResolverImpl} can be found in {@link KafkaToIgniteCdcStreamer} documentation.
 *
 * @see CdcMain
 * @see CacheVersionConflictResolverImpl
 */
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/CdcEventsIgniteApplier.java`
#### Snippet
```java

/**
 * Contains logic to process {@link CdcEvent} and apply them to the destination cluster.
 *
 * @see IgniteInternalCache#putAllConflict(Map)
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/CdcEventsIgniteApplier.java`
#### Snippet
```java
 * Contains logic to process {@link CdcEvent} and apply them to the destination cluster.
 *
 * @see IgniteInternalCache#putAllConflict(Map)
 * @see IgniteInternalCache#removeAllConflict(Map)
 */
```

### JavadocReference
Cannot resolve symbol `putAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/CdcEventsIgniteApplier.java`
#### Snippet
```java
 * Contains logic to process {@link CdcEvent} and apply them to the destination cluster.
 *
 * @see IgniteInternalCache#putAllConflict(Map)
 * @see IgniteInternalCache#removeAllConflict(Map)
 */
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/CdcEventsIgniteApplier.java`
#### Snippet
```java
 *
 * @see IgniteInternalCache#putAllConflict(Map)
 * @see IgniteInternalCache#removeAllConflict(Map)
 */
public class CdcEventsIgniteApplier extends AbstractCdcEventsApplier<KeyCacheObject, GridCacheDrInfo> {
```

### JavadocReference
Cannot resolve symbol `removeAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/CdcEventsIgniteApplier.java`
#### Snippet
```java
 *
 * @see IgniteInternalCache#putAllConflict(Map)
 * @see IgniteInternalCache#removeAllConflict(Map)
 */
public class CdcEventsIgniteApplier extends AbstractCdcEventsApplier<KeyCacheObject, GridCacheDrInfo> {
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/thin/CdcEventsIgniteClientApplier.java`
#### Snippet
```java

/**
 * Contains logic to process {@link CdcEvent} and apply them to the destination cluster by thin client.
 *
 * @see TcpClientCache#putAllConflict(Map)
```

### JavadocReference
Cannot resolve symbol `TcpClientCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/thin/CdcEventsIgniteClientApplier.java`
#### Snippet
```java
 * Contains logic to process {@link CdcEvent} and apply them to the destination cluster by thin client.
 *
 * @see TcpClientCache#putAllConflict(Map)
 * @see TcpClientCache#removeAllConflict(Map)
 */
```

### JavadocReference
Cannot resolve symbol `putAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/thin/CdcEventsIgniteClientApplier.java`
#### Snippet
```java
 * Contains logic to process {@link CdcEvent} and apply them to the destination cluster by thin client.
 *
 * @see TcpClientCache#putAllConflict(Map)
 * @see TcpClientCache#removeAllConflict(Map)
 */
```

### JavadocReference
Cannot resolve symbol `TcpClientCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/thin/CdcEventsIgniteClientApplier.java`
#### Snippet
```java
 *
 * @see TcpClientCache#putAllConflict(Map)
 * @see TcpClientCache#removeAllConflict(Map)
 */
public class CdcEventsIgniteClientApplier extends AbstractCdcEventsApplier<Object, T3<Object, GridCacheVersion, Long>> {
```

### JavadocReference
Cannot resolve symbol `removeAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/thin/CdcEventsIgniteClientApplier.java`
#### Snippet
```java
 *
 * @see TcpClientCache#putAllConflict(Map)
 * @see TcpClientCache#removeAllConflict(Map)
 */
public class CdcEventsIgniteClientApplier extends AbstractCdcEventsApplier<Object, T3<Object, GridCacheVersion, Long>> {
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/thin/IgniteToIgniteClientCdcStreamer.java`
#### Snippet
```java
 * Configuration of {@link CacheVersionConflictResolverImpl} can be found in {@link KafkaToIgniteCdcStreamer} documentation.
 *
 * @see IgniteClient
 * @see CdcMain
 * @see CacheVersionConflictResolverImpl
```

### JavadocReference
Cannot resolve symbol `CdcMain`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/thin/IgniteToIgniteClientCdcStreamer.java`
#### Snippet
```java
 *
 * @see IgniteClient
 * @see CdcMain
 * @see CacheVersionConflictResolverImpl
 */
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/AbstractCdcEventsApplier.java`
#### Snippet
```java

/**
 * Contains logic to process {@link CdcEvent} and apply them to the cluster.
 */
public abstract class AbstractCdcEventsApplier<K, V> {
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/AbstractCdcEventsApplier.java`
#### Snippet
```java
     * @param applyRmv Apply remove batch flag supplier.
     * @return Number of applied events.
     * @throws IgniteCheckedException In case of error.
     */
    private int applyIf(
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/AbstractCdcEventsApplier.java`
#### Snippet
```java
     * @param evts Events to process.
     * @return Number of applied events.
     * @throws IgniteCheckedException If failed.
     */
    public int apply(Iterable<CdcEvent> evts) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerConfiguration.java`
#### Snippet
```java
     * Maximum batch size to apply to Ignite.
     *
     * @see IgniteInternalCache#putAllConflict(Map)
     * @see IgniteInternalCache#removeAllConflict(Map)
     */
```

### JavadocReference
Cannot resolve symbol `putAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerConfiguration.java`
#### Snippet
```java
     * Maximum batch size to apply to Ignite.
     *
     * @see IgniteInternalCache#putAllConflict(Map)
     * @see IgniteInternalCache#removeAllConflict(Map)
     */
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerConfiguration.java`
#### Snippet
```java
     *
     * @see IgniteInternalCache#putAllConflict(Map)
     * @see IgniteInternalCache#removeAllConflict(Map)
     */
    private int maxBatchSize = DFLT_MAX_BATCH_SIZE;
```

### JavadocReference
Cannot resolve symbol `removeAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerConfiguration.java`
#### Snippet
```java
     *
     * @see IgniteInternalCache#putAllConflict(Map)
     * @see IgniteInternalCache#removeAllConflict(Map)
     */
    private int maxBatchSize = DFLT_MAX_BATCH_SIZE;
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteClientCdcStreamer.java`
#### Snippet
```java
 * This application is counterpart of {@link IgniteToKafkaCdcStreamer} Change Data Capture consumer.
 * Application runs several {@link KafkaToIgniteCdcStreamerApplier} thread to read Kafka topic partitions
 * and apply {@link CdcEvent} to Ignite through thin client.
 * <p>
 * In case of any error during read applier just fail. Fail of any applier will lead to the fail of whole application.
```

### JavadocReference
Cannot resolve symbol `CdcMain`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteClientCdcStreamer.java`
#### Snippet
```java
 * Please, see {@link CacheConflictResolutionManagerImpl} for additional information.
 *
 * @see CdcMain
 * @see IgniteToKafkaCdcStreamer
 * @see CdcEvent
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteClientCdcStreamer.java`
#### Snippet
```java
 * @see CdcMain
 * @see IgniteToKafkaCdcStreamer
 * @see CdcEvent
 * @see IgniteClient
 * @see KafkaToIgniteCdcStreamerApplier
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteClientCdcStreamer.java`
#### Snippet
```java
 * @see IgniteToKafkaCdcStreamer
 * @see CdcEvent
 * @see IgniteClient
 * @see KafkaToIgniteCdcStreamerApplier
 * @see CacheConflictResolutionManagerImpl
```

### JavadocReference
Cannot resolve symbol `CacheVersionConflictResolver`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheVersionConflictResolverCachePluginProvider.java`
#### Snippet
```java
 * @see CacheConflictResolutionManagerImpl
 * @see CacheVersionConflictResolverImpl
 * @see CacheVersionConflictResolver
 */
public class CacheVersionConflictResolverCachePluginProvider<K, V, C extends CachePluginConfiguration<K, V>>
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteLoader.java`
#### Snippet
```java
     * @param <T> Streamer type.
     * @return {@code KafkaToIgniteCdcStreamer} instance.
     * @throws IgniteCheckedException If failed.
     */
    public static <T extends AbstractKafkaToIgniteCdcStreamer> T loadKafkaToIgniteStreamer(String springXmlPath)
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamer.java`
#### Snippet
```java
 * This application is counterpart of {@link IgniteToKafkaCdcStreamer} Change Data Capture consumer.
 * Application runs several {@link KafkaToIgniteCdcStreamerApplier} thread to read Kafka topic partitions
 * and apply {@link CdcEvent} to Ignite through client node.
 * <p>
 * In case of any error during read applier just fail. Fail of any applier will lead to the fail of whole application.
```

### JavadocReference
Cannot resolve symbol `CdcMain`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamer.java`
#### Snippet
```java
 * Please, see {@link CacheConflictResolutionManagerImpl} for additional information.
 *
 * @see CdcMain
 * @see IgniteToKafkaCdcStreamer
 * @see CdcEvent
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamer.java`
#### Snippet
```java
 * @see CdcMain
 * @see IgniteToKafkaCdcStreamer
 * @see CdcEvent
 * @see KafkaToIgniteCdcStreamerApplier
 * @see CacheConflictResolutionManagerImpl
```

### JavadocReference
Cannot resolve symbol `CacheVersionConflictResolver`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheConflictResolutionManagerImpl.java`
#### Snippet
```java
 *
 * @see CacheVersionConflictResolverImpl
 * @see CacheVersionConflictResolver
 */
public class CacheConflictResolutionManagerImpl<K, V> implements CacheConflictResolutionManager<K, V> {
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/AbstractKafkaToIgniteCdcStreamer.java`
#### Snippet
```java
 * This application is counterpart of {@link IgniteToKafkaCdcStreamer} Change Data Capture consumer.
 * Application runs several {@link KafkaToIgniteCdcStreamerApplier} thread to read Kafka topic partitions
 * and apply {@link CdcEvent} to Ignite. There are two implementations:
 * <ul>
 *     <li>{@link KafkaToIgniteCdcStreamer} to apply through client node.</li>
```

### JavadocReference
Cannot resolve symbol `CdcMain`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/AbstractKafkaToIgniteCdcStreamer.java`
#### Snippet
```java
 * Each applier receive even number of kafka topic partition to read.
 *
 * @see CdcMain
 * @see IgniteToKafkaCdcStreamer
 * @see CdcEvent
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/AbstractKafkaToIgniteCdcStreamer.java`
#### Snippet
```java
 * @see CdcMain
 * @see IgniteToKafkaCdcStreamer
 * @see CdcEvent
 * @see KafkaToIgniteCdcStreamer
 * @see KafkaToIgniteClientCdcStreamer
```

### JavadocReference
Cannot resolve symbol `IgniteDataStreamer`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

/**
 * Streamer that consumes from a JMS destination and feeds key-value pairs into an {@link IgniteDataStreamer} instance.
 * <p>
 * This Streamer uses purely JMS semantics and it is not coupled with any JMS implementation. It uses {@link
```

### JavadocReference
Cannot resolve symbol `MessageListener`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
 * <p>
 * This Streamer uses purely JMS semantics and it is not coupled with any JMS implementation. It uses {@link
 * MessageListener} to receive messages. You must provide your broker's {@link javax.jms.ConnectionFactory} when
 * creating a {@link JmsStreamer}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `javax.jms.ConnectionFactory`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
 * <p>
 * This Streamer uses purely JMS semantics and it is not coupled with any JMS implementation. It uses {@link
 * MessageListener} to receive messages. You must provide your broker's {@link javax.jms.ConnectionFactory} when
 * creating a {@link JmsStreamer}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `Session`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
 *     <li>For topics, it supports durable subscriptions.</li>
 *     <li>Concurrent consumers are supported via the <tt>threads</tt> parameter. When consuming from queues,
 *     this component will start as many {@link Session} objects with separate {@link MessageListener} instances each,
 *     therefore achieving <i>native</i> concurrency (in terms of the JMS standard).<br>
 *     When consuming from topics, obviously we cannot start multiple threads as that would lead us to consume
```

### JavadocReference
Cannot resolve symbol `MessageListener`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
 *     <li>For topics, it supports durable subscriptions.</li>
 *     <li>Concurrent consumers are supported via the <tt>threads</tt> parameter. When consuming from queues,
 *     this component will start as many {@link Session} objects with separate {@link MessageListener} instances each,
 *     therefore achieving <i>native</i> concurrency (in terms of the JMS standard).<br>
 *     When consuming from topics, obviously we cannot start multiple threads as that would lead us to consume
```

### JavadocReference
Cannot resolve symbol `Session`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
 *     Batches are committed when the <tt>batchClosureMillis</tt> time has elapsed, or when a Session has received
 *     at least <tt>batchClosureSize</tt> messages. Time-based closure fires with the specified frequency and applies to
 *     all {@link Session}s in parallel. Size-based closure applies individually to each <tt>Session</tt> (as transactions
 *     are <tt>Session-bound</tt> in JMS, so it will fire when that {@link Session} has processed that many messages.
 *     Both options are compatible with each other, or you can disable either (see setter documentation),
```

### JavadocReference
Cannot resolve symbol `Session`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
 *     at least <tt>batchClosureSize</tt> messages. Time-based closure fires with the specified frequency and applies to
 *     all {@link Session}s in parallel. Size-based closure applies individually to each <tt>Session</tt> (as transactions
 *     are <tt>Session-bound</tt> in JMS, so it will fire when that {@link Session} has processed that many messages.
 *     Both options are compatible with each other, or you can disable either (see setter documentation),
 *     but not both.</li>
```

### JavadocReference
Cannot resolve symbol `Destination`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
 *     Both options are compatible with each other, or you can disable either (see setter documentation),
 *     but not both.</li>
 *     <li>Can specify the destination with implementation-specific {@link Destination} objects or with names.</li>
 * </ul>

```

### JavadocReference
Cannot resolve symbol `Message`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

    /**
     * <i>Compulsory.</i> The {@link MessageTransformer} that converts an incoming JMS {@link Message} (or subclass)
     * into one or multiple cache entries.
     *
```

### JavadocReference
Cannot resolve symbol `javax.jms.Session`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
    /**
     * Number of threads to concurrently consume JMS messages. When working with queues, we will start as many {@link
     * javax.jms.Session} objects as indicated by this field, i.e. you will get native concurrency. On the other hand,
     * when consuming from a topic, for obvious reason we will only start 1 message consumer but we will distribute the
     * processing of received messages to as many concurrent threads as indicated.
```

### JavadocReference
Cannot resolve symbol `ConnectionFactory`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

    /**
     * Sets the JMS {@link ConnectionFactory}.
     *
     * @param connectionFactory JMS {@link ConnectionFactory} for this streamer to use.
```

### JavadocReference
Cannot resolve symbol `ConnectionFactory`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
     * Sets the JMS {@link ConnectionFactory}.
     *
     * @param connectionFactory JMS {@link ConnectionFactory} for this streamer to use.
     */
    public void setConnectionFactory(ConnectionFactory connectionFactory) {
```

### JavadocReference
Cannot resolve symbol `ExceptionListener`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
    private Set<IgniteJmsMessageListener> listeners = Collections.newSetFromMap(new ConcurrentHashMap<IgniteJmsMessageListener, Boolean>());

    /** The Jms {@link ExceptionListener} to use. */
    private ExceptionListener exceptionListener;

```

### JavadocReference
Cannot resolve symbol `ConnectionFactory`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
    private MessageTransformer<T, K, V> transformer;

    /** The JMS {@link ConnectionFactory} to use. */
    private ConnectionFactory connectionFactory;

```

### JavadocReference
Cannot resolve symbol `Queue`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
     * can be an interface or the implementation class specific to the broker.
     *
     * @param destinationType The class representing the destination type. Suggested values: {@link Queue} or {@link
     * Topic}. <i>Compulsory</i> if using {@link #destinationName}.
     * @see Queue
```

### JavadocReference
Cannot resolve symbol `Topic`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
     *
     * @param destinationType The class representing the destination type. Suggested values: {@link Queue} or {@link
     * Topic}. <i>Compulsory</i> if using {@link #destinationName}.
     * @see Queue
     * @see Topic
```

### JavadocReference
Cannot resolve symbol `Queue`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
     * @param destinationType The class representing the destination type. Suggested values: {@link Queue} or {@link
     * Topic}. <i>Compulsory</i> if using {@link #destinationName}.
     * @see Queue
     * @see Topic
     */
```

### JavadocReference
Cannot resolve symbol `Topic`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
     * Topic}. <i>Compulsory</i> if using {@link #destinationName}.
     * @see Queue
     * @see Topic
     */
    public void setDestinationType(Class<? extends Destination> destinationType) {
```

### JavadocReference
Cannot resolve symbol `javax.jms.Session`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
    /**
     * Sets the number of threads to concurrently consume JMS messages. <p> When working with queues, we will start as
     * many {@link javax.jms.Session} objects as indicated by this field, i.e. you will get native concurrency. <p> On
     * the other hand, when consuming from a topic, for obvious reason we will only start 1 message consumer but we will
     * distribute the processing of received messages to as many concurrent threads as indicated.
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
     * Starts streamer.
     *
     * @throws IgniteException If failed.
     */
    public void start() throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `Message`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

    /**
     * <i>Compulsory.</i> The message transformer that converts an incoming JMS {@link Message} (or subclass) into one
     * or multiple cache entries.
     */
```

### JavadocReference
Cannot resolve symbol `Connection`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

    /**
     * Sets the client ID of the JMS {@link Connection}.
     *
     * @param clientId Client ID in case we're using durable subscribers. Default: none.
```

### JavadocReference
Cannot resolve symbol `Destination`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

    /**
     * Sets the JMS {@link Destination} explicitly. Takes precedence over destinationName if both are set.
     *
     * @param destination JMS {@link Destination} if setting it explicitly.
```

### JavadocReference
Cannot resolve symbol `Destination`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
     * Sets the JMS {@link Destination} explicitly. Takes precedence over destinationName if both are set.
     *
     * @param destination JMS {@link Destination} if setting it explicitly.
     */
    public void setDestination(Destination destination) {
```

### JavadocReference
Cannot resolve symbol `Destination`
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
    private String clientId;

    /** The JMS {@link Destination}; takes precedence over destinationName if both are set. */
    private Destination destination;

```

### JavadocReference
Cannot resolve symbol `CacheVersionConflictResolver`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheVersionConflictResolverPluginProvider.java`
#### Snippet
```java
 *
 * @see CacheVersionConflictResolverImpl
 * @see CacheVersionConflictResolver
 */
public class CacheVersionConflictResolverPluginProvider<C extends PluginConfiguration> implements PluginProvider<C> {
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * Applier polls messages from each consumer in round-robin fashion.
 * <p>
 * Messages applied to Ignite using {@link IgniteInternalCache#putAllConflict(Map)}, {@link IgniteInternalCache#removeAllConflict(Map)}
 * these methods allows to provide {@link GridCacheVersion} of the entry to the Ignite so in case update conflicts they can be resolved
 * by the {@link CacheVersionConflictResolver}.
```

### JavadocReference
Cannot resolve symbol `putAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * Applier polls messages from each consumer in round-robin fashion.
 * <p>
 * Messages applied to Ignite using {@link IgniteInternalCache#putAllConflict(Map)}, {@link IgniteInternalCache#removeAllConflict(Map)}
 * these methods allows to provide {@link GridCacheVersion} of the entry to the Ignite so in case update conflicts they can be resolved
 * by the {@link CacheVersionConflictResolver}.
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * Applier polls messages from each consumer in round-robin fashion.
 * <p>
 * Messages applied to Ignite using {@link IgniteInternalCache#putAllConflict(Map)}, {@link IgniteInternalCache#removeAllConflict(Map)}
 * these methods allows to provide {@link GridCacheVersion} of the entry to the Ignite so in case update conflicts they can be resolved
 * by the {@link CacheVersionConflictResolver}.
```

### JavadocReference
Cannot resolve symbol `removeAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * Applier polls messages from each consumer in round-robin fashion.
 * <p>
 * Messages applied to Ignite using {@link IgniteInternalCache#putAllConflict(Map)}, {@link IgniteInternalCache#removeAllConflict(Map)}
 * these methods allows to provide {@link GridCacheVersion} of the entry to the Ignite so in case update conflicts they can be resolved
 * by the {@link CacheVersionConflictResolver}.
```

### JavadocReference
Cannot resolve symbol `GridCacheVersion`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * <p>
 * Messages applied to Ignite using {@link IgniteInternalCache#putAllConflict(Map)}, {@link IgniteInternalCache#removeAllConflict(Map)}
 * these methods allows to provide {@link GridCacheVersion} of the entry to the Ignite so in case update conflicts they can be resolved
 * by the {@link CacheVersionConflictResolver}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `CacheVersionConflictResolver`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * Messages applied to Ignite using {@link IgniteInternalCache#putAllConflict(Map)}, {@link IgniteInternalCache#removeAllConflict(Map)}
 * these methods allows to provide {@link GridCacheVersion} of the entry to the Ignite so in case update conflicts they can be resolved
 * by the {@link CacheVersionConflictResolver}.
 * <p>
 * In case of any error during read applier just fail.
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * @see KafkaToIgniteCdcStreamer
 * @see IgniteToKafkaCdcStreamer
 * @see IgniteInternalCache#putAllConflict(Map)
 * @see IgniteInternalCache#removeAllConflict(Map)
 * @see CacheVersionConflictResolver
```

### JavadocReference
Cannot resolve symbol `putAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * @see KafkaToIgniteCdcStreamer
 * @see IgniteToKafkaCdcStreamer
 * @see IgniteInternalCache#putAllConflict(Map)
 * @see IgniteInternalCache#removeAllConflict(Map)
 * @see CacheVersionConflictResolver
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * @see IgniteToKafkaCdcStreamer
 * @see IgniteInternalCache#putAllConflict(Map)
 * @see IgniteInternalCache#removeAllConflict(Map)
 * @see CacheVersionConflictResolver
 * @see GridCacheVersion
```

### JavadocReference
Cannot resolve symbol `removeAllConflict(Map)`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * @see IgniteToKafkaCdcStreamer
 * @see IgniteInternalCache#putAllConflict(Map)
 * @see IgniteInternalCache#removeAllConflict(Map)
 * @see CacheVersionConflictResolver
 * @see GridCacheVersion
```

### JavadocReference
Cannot resolve symbol `CacheVersionConflictResolver`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * @see IgniteInternalCache#putAllConflict(Map)
 * @see IgniteInternalCache#removeAllConflict(Map)
 * @see CacheVersionConflictResolver
 * @see GridCacheVersion
 * @see CdcEvent
```

### JavadocReference
Cannot resolve symbol `GridCacheVersion`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * @see IgniteInternalCache#removeAllConflict(Map)
 * @see CacheVersionConflictResolver
 * @see GridCacheVersion
 * @see CdcEvent
 * @see CacheEntryVersion
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * @see CacheVersionConflictResolver
 * @see GridCacheVersion
 * @see CdcEvent
 * @see CacheEntryVersion
 */
```

### JavadocReference
Cannot resolve symbol `CacheEntryVersion`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java
 * @see GridCacheVersion
 * @see CdcEvent
 * @see CacheEntryVersion
 */
class KafkaToIgniteCdcStreamerApplier implements Runnable, AutoCloseable {
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteCdcStreamerApplier.java`
#### Snippet
```java

    /**
     * Filter out {@link CdcEvent} records.
     * Updates metadata in case update metadata marker found.
     * @param rec Record to filter.
```

### JavadocReference
Cannot resolve symbol `GridCacheVersionedEntryEx`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheVersionConflictResolverImpl.java`
#### Snippet
```java
 * The following steps performed:
 * <ul>
 *     <li>If entry is freshly created then new version used - {@link GridCacheVersionedEntryEx#isStartVersion()}.</li>
 *     <li>If change made in this cluster then new version used - {@link GridCacheVersionedEntryEx#dataCenterId()}.</li>
 *     <li>If cluster of new entry equal to cluster of old entry
```

### JavadocReference
Cannot resolve symbol `isStartVersion()`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheVersionConflictResolverImpl.java`
#### Snippet
```java
 * The following steps performed:
 * <ul>
 *     <li>If entry is freshly created then new version used - {@link GridCacheVersionedEntryEx#isStartVersion()}.</li>
 *     <li>If change made in this cluster then new version used - {@link GridCacheVersionedEntryEx#dataCenterId()}.</li>
 *     <li>If cluster of new entry equal to cluster of old entry
```

### JavadocReference
Cannot resolve symbol `GridCacheVersionedEntryEx`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheVersionConflictResolverImpl.java`
#### Snippet
```java
 * <ul>
 *     <li>If entry is freshly created then new version used - {@link GridCacheVersionedEntryEx#isStartVersion()}.</li>
 *     <li>If change made in this cluster then new version used - {@link GridCacheVersionedEntryEx#dataCenterId()}.</li>
 *     <li>If cluster of new entry equal to cluster of old entry
 *     then entry with the greater {@link GridCacheVersionedEntryEx#order()} used.</li>
```

### JavadocReference
Cannot resolve symbol `dataCenterId()`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheVersionConflictResolverImpl.java`
#### Snippet
```java
 * <ul>
 *     <li>If entry is freshly created then new version used - {@link GridCacheVersionedEntryEx#isStartVersion()}.</li>
 *     <li>If change made in this cluster then new version used - {@link GridCacheVersionedEntryEx#dataCenterId()}.</li>
 *     <li>If cluster of new entry equal to cluster of old entry
 *     then entry with the greater {@link GridCacheVersionedEntryEx#order()} used.</li>
```

### JavadocReference
Cannot resolve symbol `GridCacheVersionedEntryEx`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheVersionConflictResolverImpl.java`
#### Snippet
```java
 *     <li>If change made in this cluster then new version used - {@link GridCacheVersionedEntryEx#dataCenterId()}.</li>
 *     <li>If cluster of new entry equal to cluster of old entry
 *     then entry with the greater {@link GridCacheVersionedEntryEx#order()} used.</li>
 *     <li>If {@link #conflictResolveField} provided and field of new entry greater then new version used.</li>
 *     <li>If {@link #conflictResolveField} provided and field of old entry greater then old version used.</li>
```

### JavadocReference
Cannot resolve symbol `order()`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheVersionConflictResolverImpl.java`
#### Snippet
```java
 *     <li>If change made in this cluster then new version used - {@link GridCacheVersionedEntryEx#dataCenterId()}.</li>
 *     <li>If cluster of new entry equal to cluster of old entry
 *     then entry with the greater {@link GridCacheVersionedEntryEx#order()} used.</li>
 *     <li>If {@link #conflictResolveField} provided and field of new entry greater then new version used.</li>
 *     <li>If {@link #conflictResolveField} provided and field of old entry greater then old version used.</li>
```

### JavadocReference
Cannot resolve symbol `CdcEvent`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/IgniteToKafkaCdcStreamer.java`
#### Snippet
```java
/**
 * Change Data Consumer that streams all data changes to Kafka topic.
 * {@link CdcEvent} spread across Kafka topic partitions with {@code {ignite_partition} % {kafka_topic_count}} formula.
 * Consumer will just fail in case of any error during write. Fail of consumer will lead to the fail of {@code ignite-cdc} application.
 * It expected that {@code ignite-cdc} will be configured for automatic restarts with the OS tool to failover temporary errors
```

### JavadocReference
Cannot resolve symbol `CdcMain`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/IgniteToKafkaCdcStreamer.java`
#### Snippet
```java
 * Configuration of {@link CacheVersionConflictResolverImpl} can be found in {@link KafkaToIgniteCdcStreamer} documentation.
 *
 * @see CdcMain
 * @see KafkaToIgniteCdcStreamer
 * @see KafkaToIgniteClientCdcStreamer
```

### JavadocReference
Symbol `IgniteSourceTask.CacheEvt` is inaccessible from here
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSourceConstants.java`
#### Snippet
```java
    public static final String CACHE_NAME = "cacheName";

    /** Events to be listened to. Names corresponds to {@link IgniteSourceTask.CacheEvt}. */
    public static final String CACHE_EVENTS = "cacheEvts";

```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/storm-ext/src/main/java/org/apache/ignite/stream/storm/StormStreamer.java`
#### Snippet
```java
     * Stops streamer.
     *
     * @throws IgniteException If failed.
     */
    public void stop() throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/storm-ext/src/main/java/org/apache/ignite/stream/storm/StormStreamer.java`
#### Snippet
```java
     * Starts streamer.
     *
     * @throws IgniteException If failed.
     */
    @SuppressWarnings("unchecked")
```

### JavadocReference
Cannot resolve symbol `JdkMarshaller`
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/serialization/CacheEventDeserializer.java`
#### Snippet
```java

/**
 * Deserializer based on {@link JdkMarshaller}.
 */
public class CacheEventDeserializer implements Deserializer<CacheEvent> {
```

### JavadocReference
Cannot resolve symbol `CacheEvent`
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/serialization/CacheEventConverter.java`
#### Snippet
```java

/**
 * {@link CacheEvent} converter for Connect API.
 */
public class CacheEventConverter implements Converter {
```

### JavadocReference
Cannot resolve symbol `JdkMarshaller`
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/serialization/CacheEventSerializer.java`
#### Snippet
```java

/**
 * Serializer based on {@link JdkMarshaller}.
 */
public class CacheEventSerializer implements Serializer<CacheEvent> {
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTaskAdapter`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyNodeFilter.java`
#### Snippet
```java
    /**
     * Convenience adapter for tasks that work with {@link Gridify} annotation
     * for grid-enabling methods. It enhances the regular {@link org.apache.ignite.compute.ComputeTaskAdapter}
     * by enforcing the argument type of {@link GridifyArgument}. All tasks
     * that work with {@link Gridify} annotation receive an argument of this type.
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTaskAdapter`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyNodeFilter.java`
#### Snippet
```java
     * that work with {@link Gridify} annotation receive an argument of this type.
     * <p>
     * Please refer to {@link org.apache.ignite.compute.ComputeTaskAdapter} documentation for more information
     * on additional functionality this adapter provides.
     * @param <R> Return value of the task (see {@link org.apache.ignite.compute.ComputeTask#reduce(List)} method).
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTask`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyNodeFilter.java`
#### Snippet
```java
     * Please refer to {@link org.apache.ignite.compute.ComputeTaskAdapter} documentation for more information
     * on additional functionality this adapter provides.
     * @param <R> Return value of the task (see {@link org.apache.ignite.compute.ComputeTask#reduce(List)} method).
     */
    abstract class GridifyTaskAdapter<R> extends ComputeTaskAdapter<GridifyArgument, R> {
```

### JavadocReference
Cannot resolve symbol `reduce(List)`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyNodeFilter.java`
#### Snippet
```java
     * Please refer to {@link org.apache.ignite.compute.ComputeTaskAdapter} documentation for more information
     * on additional functionality this adapter provides.
     * @param <R> Return value of the task (see {@link org.apache.ignite.compute.ComputeTask#reduce(List)} method).
     */
    abstract class GridifyTaskAdapter<R> extends ComputeTaskAdapter<GridifyArgument, R> {
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/KafkaStreamer.java`
#### Snippet
```java
     * Starts streamer.
     *
     * @throws IgniteException If failed.
     */
    public void start() {
```

### JavadocReference
Cannot resolve symbol `IgniteDataStreamer`
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/KafkaStreamer.java`
#### Snippet
```java
/**
 * Server that subscribes to topic messages from Kafka broker and streams its to key-value pairs into
 * {@link IgniteDataStreamer} instance.
 * <p>
 * Uses Kafka's High Level Consumer API to read messages from Kafka.
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyInterceptor.java`
#### Snippet
```java
     * @param arg Gridify argument.
     * @return {@code True} if method should be grid-enabled, {@code false} otherwise.
     * @throws IgniteCheckedException Thrown in case of any errors.
     */
    public boolean isGridify(Annotation gridify, GridifyArgument arg) throws IgniteCheckedException;
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTaskAdapter`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyTaskAdapter.java`
#### Snippet
```java
/**
 * Convenience adapter for tasks that work with {@link Gridify} annotation
 * for grid-enabling methods. It enhances the regular {@link org.apache.ignite.compute.ComputeTaskAdapter}
 * by enforcing the argument type of {@link GridifyArgument}. All tasks
 * that work with {@link Gridify} annotation receive an argument of this type.
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTaskSplitAdapter`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyTaskSplitAdapter.java`
#### Snippet
```java
/**
 * Convenience adapter for tasks that work with {@link Gridify} annotation
 * for grid-enabling methods. It enhances the regular {@link org.apache.ignite.compute.ComputeTaskSplitAdapter}
 * by enforcing the argument type of {@link GridifyArgument}. All tasks
 * that work with {@link Gridify} annotation receive an argument of this type.
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTaskSplitAdapter`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyTaskSplitAdapter.java`
#### Snippet
```java
 * that work with {@link Gridify} annotation receive an argument of this type.
 * <p>
 * Please refer to {@link org.apache.ignite.compute.ComputeTaskSplitAdapter} documentation for more information
 * on additional functionality this adapter provides.
 * @param <R> Return value of the task (see {@link org.apache.ignite.compute.ComputeTask#reduce(List)} method).
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTask`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyTaskSplitAdapter.java`
#### Snippet
```java
 * Please refer to {@link org.apache.ignite.compute.ComputeTaskSplitAdapter} documentation for more information
 * on additional functionality this adapter provides.
 * @param <R> Return value of the task (see {@link org.apache.ignite.compute.ComputeTask#reduce(List)} method).
 */
public abstract class GridifyTaskSplitAdapter<R> extends ComputeTaskSplitAdapter<GridifyArgument, R> {
```

### JavadocReference
Cannot resolve symbol `reduce(List)`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyTaskSplitAdapter.java`
#### Snippet
```java
 * Please refer to {@link org.apache.ignite.compute.ComputeTaskSplitAdapter} documentation for more information
 * on additional functionality this adapter provides.
 * @param <R> Return value of the task (see {@link org.apache.ignite.compute.ComputeTask#reduce(List)} method).
 */
public abstract class GridifyTaskSplitAdapter<R> extends ComputeTaskSplitAdapter<GridifyArgument, R> {
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTaskAdapter`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyTaskAdapter.java`
#### Snippet
```java
 * that work with {@link Gridify} annotation receive an argument of this type.
 * <p>
 * Please refer to {@link org.apache.ignite.compute.ComputeTaskAdapter} documentation for more information
 * on additional functionality this adapter provides.
 * @param <R> Return value of the task (see {@link org.apache.ignite.compute.ComputeTask#reduce(List)} method).
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTask`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyTaskAdapter.java`
#### Snippet
```java
 * Please refer to {@link org.apache.ignite.compute.ComputeTaskAdapter} documentation for more information
 * on additional functionality this adapter provides.
 * @param <R> Return value of the task (see {@link org.apache.ignite.compute.ComputeTask#reduce(List)} method).
 */
public abstract class GridifyTaskAdapter<R> extends ComputeTaskAdapter<GridifyArgument, R> {
```

### JavadocReference
Cannot resolve symbol `reduce(List)`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifyTaskAdapter.java`
#### Snippet
```java
 * Please refer to {@link org.apache.ignite.compute.ComputeTaskAdapter} documentation for more information
 * on additional functionality this adapter provides.
 * @param <R> Return value of the task (see {@link org.apache.ignite.compute.ComputeTask#reduce(List)} method).
 */
public abstract class GridifyTaskAdapter<R> extends ComputeTaskAdapter<GridifyArgument, R> {
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTask`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/Gridify.java`
#### Snippet
```java
 * initialization. In either case, Ignite must be able to serialize the state passed to remote node.
 * <p>
 * Refer to {@link org.apache.ignite.compute.ComputeTask} documentation for more information on how a task
 * can be split into multiple sub-jobs.
 * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.Ignition`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/Gridify.java`
#### Snippet
```java
    /**
     * @return Name of the Ignite instance to use. By default, no-name default Ignite instance is used.
     * Refer to {@link org.apache.ignite.Ignition} for information about named Ignite instances.
     */
    String igniteInstanceName() default "";
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.Ignition`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/Gridify.java`
#### Snippet
```java
    /**
     * @return Name of the grid to use. By default, no-name default grid is used.
     * Refer to {@link org.apache.ignite.Ignition} for information about named grids.
     * @deprecated Use {@link #igniteInstanceName()}. Nonempty {@link #igniteInstanceName()} takes precedence.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.Ignition`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifySetToSet.java`
#### Snippet
```java
    /**
     * @return Name of the grid to use. By default, no-name default grid is used.
     * Refer to {@link org.apache.ignite.Ignition} for information about named grids.
     *
     * @deprecated Use {@link #igniteInstanceName()}. Nonempty {@link #igniteInstanceName()} takes precedence.
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTask`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifySetToSet.java`
#### Snippet
```java
 * annotation is to provide very simple and easy to use ForkJoin gridification
 * for some often used use cases. Note that in a standard {@code Gridify} annotation
 * the user has to write {@link org.apache.ignite.compute.ComputeTask} to provide ForkJoin behavior.
 * In a proposed design - the ForkJoin will be achieved <b>automatically</b>.
 * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.Ignition`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifySetToSet.java`
#### Snippet
```java
    /**
     * @return Name of the Ignite instance to use. By default, no-name default Ignite instance is used.
     * Refer to {@link org.apache.ignite.Ignition} for information about named Ignite instances.
     */
    String igniteInstanceName() default "";
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToSetAbstractAspect.java`
#### Snippet
```java
     *
     * @param mtd Grid-enabled method.
     * @throws IgniteCheckedException If method signature invalid..
     */
    protected void checkMethodSignature(Method mtd) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToSetAbstractAspect.java`
#### Snippet
```java
     * @param arg Gridify argument.
     * @param ann Annotation
     * @throws IgniteCheckedException If split is not allowed with current parameters.
     */
    protected void checkIsSplitToJobsAllowed(GridifyRangeArgument arg, GridifySetToSet ann) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.IgniteCompute`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToSetAbstractAspect.java`
#### Snippet
```java
     * Execute method on grid.
     *
     * @param compute {@link org.apache.ignite.IgniteCompute} instance.
     * @param cls Joint point signature class.
     * @param arg GridifyArgument with all method signature parameters.
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToSetAbstractAspect.java`
#### Snippet
```java
     * @param timeout Execution timeout.
     * @return Result.
     * @throws IgniteCheckedException If execution failed.
     */
    protected Object execute(IgniteCompute compute, Class<?> cls, GridifyRangeArgument arg,
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.IgniteCompute`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToValueAbstractAspect.java`
#### Snippet
```java
     *
     * @param mtd Method.
     * @param compute {@link org.apache.ignite.IgniteCompute} instance.
     * @param cls Joint point signature class.
     * @param arg GridifyArgument with all method signature parameters.
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToValueAbstractAspect.java`
#### Snippet
```java
     * @param timeout Execution timeout.
     * @return Result.
     * @throws IgniteCheckedException If execution failed.
     */
    protected Object execute(Method mtd, IgniteCompute compute, Class<?> cls, GridifyRangeArgument arg,
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToValueAbstractAspect.java`
#### Snippet
```java
     *
     * @param mtd Grid-enabled method.
     * @throws IgniteCheckedException If method signature invalid.
     */
    protected void checkMethodSignature(Method mtd) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToValueAbstractAspect.java`
#### Snippet
```java
     * @param taskRes Result of last task execution.
     * @return New gridify argument or {@code null} if calculation finished.
     * @throws IgniteCheckedException In case of error.
     */
    private GridifyRangeArgument createGridifyArgument(GridifyRangeArgument arg, Collection<?> taskRes)
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToValueAbstractAspect.java`
#### Snippet
```java
     * @param arg Gridify argument.
     * @param ann Annotation
     * @throws IgniteCheckedException If split is not allowed with current parameters.
     */
    protected void checkIsSplitToJobsAllowed(GridifyRangeArgument arg, GridifySetToValue ann) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeJobAdapter`
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyJobAdapter.java`
#### Snippet
```java
/**
 * Convenience adapter for custom {@code gridify} jobs. In addition to
 * functionality provided in {@link org.apache.ignite.compute.ComputeJobAdapter} adapter, this adapter
 * provides default implementation of {@link #execute()} method,
 * which reflectively executes grid-enabled method based on information provided
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeJobAdapter`
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyJobAdapter.java`
#### Snippet
```java
 * remote jobs. In many cases, remote jobs will not require {@link org.apache.ignite.compute.gridify.GridifyArgument}
 * as they will execute their code without reflection, hence the regular
 * {@link org.apache.ignite.compute.ComputeJobAdapter} should be used.
 * <p>
 * See {@link org.apache.ignite.compute.gridify.Gridify} documentation for more information about execution of
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyArgumentBuilder.java`
#### Snippet
```java
     * @param input Input collection..
     * @return Argument for task.
     * @throws IgniteCheckedException In case of error.
     */
    public GridifyRangeArgument createTaskArgument(GridifyRangeArgument arg, Collection<?> input) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyArgumentBuilder.java`
#### Snippet
```java
     * @param input Input collection used in job.
     * @return Argument for job.
     * @throws IgniteException In case of error.
     */
    public GridifyArgument createJobArgument(GridifyRangeArgument arg, Collection<?> input) throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/elb/TcpDiscoveryElbIpFinder.java`
#### Snippet
```java
 *
 * <p>
 * Choose another implementation of {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder}
 * for local or home network tests.</p>
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/elb/TcpDiscoveryAlbIpFinder.java`
#### Snippet
```java
 *
 * <p>
 * Choose another implementation of {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder} for local
 * or home network tests.</p>
 *
```

### JavadocReference
Cannot resolve symbol `IgniteDataStreamer`
in `modules/flink-ext/src/main/java/org/apache/ignite/sink/flink/IgniteSink.java`
#### Snippet
```java
    /**
     * Transfers data into grid. It is called when new data
     * arrives to the sink, and forwards it to {@link IgniteDataStreamer}.
     *
     * @param in IN.
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/flink-ext/src/main/java/org/apache/ignite/sink/flink/IgniteSink.java`
#### Snippet
```java
     * Stops streamer.
     *
     * @throws IgniteException If failed.
     */
    @Override public void close() {
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/flink-ext/src/main/java/org/apache/ignite/sink/flink/IgniteSink.java`
#### Snippet
```java
     * Starts streamer.
     *
     * @throws IgniteException If failed.
     */
    @Override public void open(Configuration parameter) {
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-data-ext/examples/src/main/java/org/apache/ignite/springdata/examples/SpringApplicationConfiguration.java`
#### Snippet
```java
 * required to initialize {@link IgniteRepositoryFactoryBean} with one of the following:
 * <ul>
 * <li>{@link Ignite} instance bean</li>
 * <li>{@link IgniteConfiguration} bean</li>
 * <li>A path to Ignite's Spring XML configuration named "igniteSpringCfgPath"</li>
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-data-ext/examples/src/main/java/org/apache/ignite/springdata/examples/SpringApplicationConfiguration.java`
#### Snippet
```java
 * <ul>
 * <li>{@link Ignite} instance bean</li>
 * <li>{@link IgniteConfiguration} bean</li>
 * <li>A path to Ignite's Spring XML configuration named "igniteSpringCfgPath"</li>
 * <ul/>
```

### JavadocReference
Cannot resolve symbol `Binarylizable`
in `modules/spring-data-ext/examples/src/main/java/org/apache/ignite/springdata/examples/model/Address.java`
#### Snippet
```java
 * Employee address.
 * <p>
 * This class implements {@link Binarylizable} only for example purposes,
 * in order to show how to customize serialization and deserialization of
 * binary objects.
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.IgniteSpiException`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/s3/TcpDiscoveryS3IpFinder.java`
#### Snippet
```java
     * Amazon s3 client initialization.
     *
     * @throws org.apache.ignite.spi.IgniteSpiException In case of error.
     */
    private void initClient() throws IgniteSpiException {
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/s3/TcpDiscoveryS3IpFinder.java`
#### Snippet
```java
 * <p>
 * Note that storing data in AWS S3 service will result in charges to your AWS account. Choose another implementation of
 * {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder} for local or home network tests.
 * <p>
 * Note that this finder is shared by default (see {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder#isShared()}.
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/s3/TcpDiscoveryS3IpFinder.java`
#### Snippet
```java
 * {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder} for local or home network tests.
 * <p>
 * Note that this finder is shared by default (see {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder#isShared()}.
 */
public class TcpDiscoveryS3IpFinder extends TcpDiscoveryIpFinderAdapter {
```

### JavadocReference
Cannot resolve symbol `isShared()`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/s3/TcpDiscoveryS3IpFinder.java`
#### Snippet
```java
 * {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder} for local or home network tests.
 * <p>
 * Note that this finder is shared by default (see {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder#isShared()}.
 */
public class TcpDiscoveryS3IpFinder extends TcpDiscoveryIpFinderAdapter {
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteClientProxy.java`
#### Snippet
```java
/** Implementation of {@link IgniteProxy} that provides access to Ignite cluster through {@link IgniteClient} instance. */
public class IgniteClientProxy implements IgniteProxy {
    /** {@link IgniteClient} instance to which operations are delegated.  */
    protected final IgniteClient cli;

```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteClientProxy.java`
#### Snippet
```java
import org.apache.ignite.client.IgniteClient;

/** Implementation of {@link IgniteProxy} that provides access to Ignite cluster through {@link IgniteClient} instance. */
public class IgniteClientProxy implements IgniteProxy {
    /** {@link IgniteClient} instance to which operations are delegated.  */
```

### JavadocReference
Cannot resolve symbol `IgniteDataStreamer`
in `modules/twitter-ext/src/main/java/org/apache/ignite/stream/twitter/TwitterStreamer.java`
#### Snippet
```java
/**
 * Streamer that consumes from a Twitter Streaming API and feeds transformed key-value pairs,
 * by default <tweetId, text>, into an {@link IgniteDataStreamer} instance.
 * <p>
 * This streamer uses https://dev.twitter.com/streaming API and supports Public API, User Streams,
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteNodeProxy.java`
#### Snippet
```java
import org.apache.ignite.IgniteCache;

/** Implementation of {@link IgniteProxy} that provides access to Ignite cluster through {@link Ignite} instance. */
public class IgniteNodeProxy implements IgniteProxy {
    /** {@link Ignite} instance to which operations are delegated. */
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteNodeProxy.java`
#### Snippet
```java
/** Implementation of {@link IgniteProxy} that provides access to Ignite cluster through {@link Ignite} instance. */
public class IgniteNodeProxy implements IgniteProxy {
    /** {@link Ignite} instance to which operations are delegated. */
    protected final Ignite ignite;

```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteNodeProxy.java`
#### Snippet
```java
    }

    /** @return {@link Ignite} instance to which operations are delegated. */
    public Ignite delegate() {
        return ignite;
```

### JavadocReference
Cannot resolve symbol `ClientCache`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteCacheProxy.java`
#### Snippet
```java

    /**
     * Determines if the {@link ClientCache} contains an entry for the specified key.
     *
     * @param key key whose presence in this cache is to be tested.
```

### JavadocReference
Cannot resolve symbol `ClientCache`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteClientCacheProxy.java`
#### Snippet
```java
/** Implementation of {@link IgniteCacheProxy} that provides access to Ignite cache through {@link ClientCache} instance. */
public class IgniteClientCacheProxy<K, V> implements IgniteCacheProxy<K, V> {
    /** {@link ClientCache} instance to which operations are delegated. */
    private final ClientCache<K, V> cache;

```

### JavadocReference
Cannot resolve symbol `ClientCache`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteClientCacheProxy.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

/** Implementation of {@link IgniteCacheProxy} that provides access to Ignite cache through {@link ClientCache} instance. */
public class IgniteClientCacheProxy<K, V> implements IgniteCacheProxy<K, V> {
    /** {@link ClientCache} instance to which operations are delegated. */
```

### JavadocReference
Cannot resolve symbol `IgniteCache`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteNodeCacheProxy.java`
#### Snippet
```java
    }

    /** @return {@link IgniteCache} instance to which operations are delegated. */
    @Override public IgniteCache<K, V> delegate() {
        return cache;
```

### JavadocReference
Cannot resolve symbol `IgniteCache`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteNodeCacheProxy.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

/** Implementation of {@link IgniteCacheProxy} that provides access to Ignite cache through {@link IgniteCache} instance. */
public class IgniteNodeCacheProxy<K, V> implements IgniteCacheProxy<K, V> {
    /** {@link IgniteCache} instance to which operations are delegated. */
```

### JavadocReference
Cannot resolve symbol `IgniteCache`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteNodeCacheProxy.java`
#### Snippet
```java
/** Implementation of {@link IgniteCacheProxy} that provides access to Ignite cache through {@link IgniteCache} instance. */
public class IgniteNodeCacheProxy<K, V> implements IgniteCacheProxy<K, V> {
    /** {@link IgniteCache} instance to which operations are delegated. */
    private final IgniteCache<K, V> cache;

```

### JavadocReference
Cannot resolve symbol `TcpDiscoverySpi`
in `modules/cloud-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/cloud/TcpDiscoveryCloudIpFinder.java`
#### Snippet
```java
 * The finder forms nodes addresses, that possibly running Ignite, by getting private and public IPs of all
 * VMs in a cloud and adding a port number to them.
 * The port is either the one that is set with {@link TcpDiscoverySpi#setLocalPort(int)} or
 * {@link TcpDiscoverySpi#DFLT_PORT}.
 * Make sure that all VMs start Ignite instances on the same port, otherwise they will not be able to discover each
```

### JavadocReference
Cannot resolve symbol `setLocalPort(int)`
in `modules/cloud-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/cloud/TcpDiscoveryCloudIpFinder.java`
#### Snippet
```java
 * The finder forms nodes addresses, that possibly running Ignite, by getting private and public IPs of all
 * VMs in a cloud and adding a port number to them.
 * The port is either the one that is set with {@link TcpDiscoverySpi#setLocalPort(int)} or
 * {@link TcpDiscoverySpi#DFLT_PORT}.
 * Make sure that all VMs start Ignite instances on the same port, otherwise they will not be able to discover each
```

### JavadocReference
Cannot resolve symbol `TcpDiscoverySpi`
in `modules/cloud-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/cloud/TcpDiscoveryCloudIpFinder.java`
#### Snippet
```java
 * VMs in a cloud and adding a port number to them.
 * The port is either the one that is set with {@link TcpDiscoverySpi#setLocalPort(int)} or
 * {@link TcpDiscoverySpi#DFLT_PORT}.
 * Make sure that all VMs start Ignite instances on the same port, otherwise they will not be able to discover each
 * other using this IP finder.
```

### JavadocReference
Cannot resolve symbol `DFLT_PORT`
in `modules/cloud-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/cloud/TcpDiscoveryCloudIpFinder.java`
#### Snippet
```java
 * VMs in a cloud and adding a port number to them.
 * The port is either the one that is set with {@link TcpDiscoverySpi#setLocalPort(int)} or
 * {@link TcpDiscoverySpi#DFLT_PORT}.
 * Make sure that all VMs start Ignite instances on the same port, otherwise they will not be able to discover each
 * other using this IP finder.
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder`
in `modules/cloud-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/cloud/TcpDiscoveryCloudIpFinder.java`
#### Snippet
```java
 * <p>
 * Note, this finder is only workable when it used directly by cloud VM.
 * Choose another implementation of {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder} for local
 * or home network tests.
 * </p>
```

### JavadocReference
Cannot resolve symbol `IgniteSpiException`
in `modules/cloud-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/cloud/TcpDiscoveryCloudIpFinder.java`
#### Snippet
```java
     *
     * @return Credential in {@code String} representation.
     * @throws IgniteSpiException In case of error.
     */
    private String getCredentialFromFile() throws IgniteSpiException {
```

### JavadocReference
Cannot resolve symbol `Credentials`
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/utils/IgniteYarnUtils.java`
#### Snippet
```java

    /**
     * Creates a ByteBuffer with serialized {@link Credentials}.
     *
     * @param creds The credentials.
```

### JavadocReference
Cannot resolve symbol `CrudRepository`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * Saves all given keys and entities combinations with expiry policy
     * </p>
     * It's suggested to use this method instead of default {@link CrudRepository#save(Object)} that generates IDs
     * (keys) that are not unique cluster wide.
     *
```

### JavadocReference
Cannot resolve symbol `save(Object)`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * Saves all given keys and entities combinations with expiry policy
     * </p>
     * It's suggested to use this method instead of default {@link CrudRepository#save(Object)} that generates IDs
     * (keys) that are not unique cluster wide.
     *
```

### JavadocReference
Cannot resolve symbol `CrudRepository`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * Saves all given keys and entities combinations.
     * </p>
     * It's suggested to use this method instead of default {@link CrudRepository#save(Object)} that generates IDs
     * (keys) that are not unique cluster wide.
     *
```

### JavadocReference
Cannot resolve symbol `save(Object)`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * Saves all given keys and entities combinations.
     * </p>
     * It's suggested to use this method instead of default {@link CrudRepository#save(Object)} that generates IDs
     * (keys) that are not unique cluster wide.
     *
```

### JavadocReference
Cannot resolve symbol `CrudRepository`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java

/**
 * Apache Ignite repository that extends basic capabilities of {@link CrudRepository}.
 *
 * @param <V> the cache value type
```

### JavadocReference
Cannot resolve symbol `CrudRepository`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * Saves a given entity using provided key.
     * </p>
     * It's suggested to use this method instead of default {@link CrudRepository#save(Object)} that generates IDs
     * (keys) that are not unique cluster wide.
     *
```

### JavadocReference
Cannot resolve symbol `save(Object)`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * Saves a given entity using provided key.
     * </p>
     * It's suggested to use this method instead of default {@link CrudRepository#save(Object)} that generates IDs
     * (keys) that are not unique cluster wide.
     *
```

### JavadocReference
Cannot resolve symbol `CrudRepository`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * Saves a given entity using provided key with expiry policy
     * </p>
     * It's suggested to use this method instead of default {@link CrudRepository#save(Object)} that generates IDs
     * (keys) that are not unique cluster wide.
     *
```

### JavadocReference
Cannot resolve symbol `save(Object)`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/IgniteRepository.java`
#### Snippet
```java
     * Saves a given entity using provided key with expiry policy
     * </p>
     * It's suggested to use this method instead of default {@link CrudRepository#save(Object)} that generates IDs
     * (keys) that are not unique cluster wide.
     *
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpi.java`
#### Snippet
```java
     * @param key Key name to read data from.
     * @return Checkpoint data object.
     * @throws IgniteCheckedException Thrown if an error occurs while unmarshalling.
     * @throws AmazonClientException If an error occurs while querying Amazon S3.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.IgniteSpiThread`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpi.java`
#### Snippet
```java

    /**
     * Implementation of {@link org.apache.ignite.spi.IgniteSpiThread} that takes care about outdated S3 data.
     * Every checkpoint has expiration date after which it makes no sense to
     * keep it. This worker periodically cleans S3 bucket according to checkpoints
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpi.java`
#### Snippet
```java
     *
     * @param data Checkpoint data.
     * @throws IgniteCheckedException Thrown if an error occurs while marshalling.
     * @throws AmazonClientException If an error occurs while querying Amazon S3.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.checkpoint.CheckpointSpi`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpi.java`
#### Snippet
```java
 * <p>
 * Note that storing data in AWS S3 service will result in charges to your AWS account.
 * Choose another implementation of {@link org.apache.ignite.spi.checkpoint.CheckpointSpi} for local or
 * home network tests.
 * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.checkpoint.CheckpointSpi`
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpi.java`
#### Snippet
```java
 * <br>
 * For information about Spring framework visit <a href="http://www.springframework.org/">www.springframework.org</a>
 * @see org.apache.ignite.spi.checkpoint.CheckpointSpi
 */
@IgniteSpiMultipleInstancesSupport(true)
```

### JavadocReference
Cannot resolve symbol `RepositoryMetadata`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/ExpressionBasedStringQuery.java`
#### Snippet
```java
     *
     * @param qry      the original query. Must not be {@literal null}.
     * @param metadata the {@link RepositoryMetadata} for the given entity. Must not be {@literal null}.
     * @param parser   Parser for resolving SpEL expressions. Must not be {@literal null}.
     * @return A query supporting SpEL expressions.
```

### JavadocReference
Cannot resolve symbol `EntityMetadata`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/ExpressionBasedStringQuery.java`
#### Snippet
```java

    /**
     * Creates a new instance for the given query and {@link EntityMetadata}.
     *
     * @param qry      must not be {@literal null} or empty.
```

### JavadocReference
Cannot resolve symbol `RepositoryMetadata`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/ExpressionBasedStringQuery.java`
#### Snippet
```java
    /**
     * @param qry,     the query expression potentially containing a SpEL expression. Must not be {@literal null}.}
     * @param metadata the {@link RepositoryMetadata} for the given entity. Must not be {@literal null}.
     * @param parser   Must not be {@literal null}.
     * @return rendered query
```

### JavadocReference
Cannot resolve symbol `RepositoryBeanDefinitionRegistrarSupport`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/IgniteRepositoriesRegistar.java`
#### Snippet
```java

/**
 * Apache Ignite specific implementation of {@link RepositoryBeanDefinitionRegistrarSupport}.
 */
public class IgniteRepositoriesRegistar extends RepositoryBeanDefinitionRegistrarSupport {
```

### JavadocReference
Cannot resolve symbol `RepositoryConfigurationExtension`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/IgniteRepositoryConfigurationExtension.java`
#### Snippet
```java

/**
 * Apache Ignite specific implementation of {@link RepositoryConfigurationExtension}.
 */
public class IgniteRepositoryConfigurationExtension extends RepositoryConfigurationExtensionSupport {
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/RepositoryConfig.java`
#### Snippet
```java

    /**
     * Name of the Spring Bean that must provide {@link IgniteConfiguration} or {@link ClientConfiguration} that is used
     * for instantination of Ignite node or Ignite thin client respectively for accessing the Ignite cluster.
     *
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/RepositoryConfig.java`
#### Snippet
```java

    /**
     * Name of the Spring Bean that must provide {@link IgniteConfiguration} or {@link ClientConfiguration} that is used
     * for instantination of Ignite node or Ignite thin client respectively for accessing the Ignite cluster.
     *
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/RepositoryConfig.java`
#### Snippet
```java

    /**
     * Name of the Spring Bean that must provide {@link Ignite} or {@link IgniteClient} instance for accessing the
     * Ignite cluster.
     *
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/RepositoryConfig.java`
#### Snippet
```java

    /**
     * Name of the Spring Bean that must provide {@link Ignite} or {@link IgniteClient} instance for accessing the
     * Ignite cluster.
     *
```

### JavadocReference
Cannot resolve symbol `QueryLookupStrategy`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/EnableIgniteRepositories.java`
#### Snippet
```java

    /**
     * Returns the key of the {@link QueryLookupStrategy} to be used for lookup queries for query methods. Defaults to
     * {@link Key#CREATE_IF_NOT_FOUND}.
     *
```

### JavadocReference
Cannot resolve symbol `Key`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/EnableIgniteRepositories.java`
#### Snippet
```java
    /**
     * Returns the key of the {@link QueryLookupStrategy} to be used for lookup queries for query methods. Defaults to
     * {@link Key#CREATE_IF_NOT_FOUND}.
     *
     * @return Key of the {@link QueryLookupStrategy} to be used for lookup queries for query methods.
```

### JavadocReference
Cannot resolve symbol `CREATE_IF_NOT_FOUND`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/EnableIgniteRepositories.java`
#### Snippet
```java
    /**
     * Returns the key of the {@link QueryLookupStrategy} to be used for lookup queries for query methods. Defaults to
     * {@link Key#CREATE_IF_NOT_FOUND}.
     *
     * @return Key of the {@link QueryLookupStrategy} to be used for lookup queries for query methods.
```

### JavadocReference
Cannot resolve symbol `QueryLookupStrategy`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/EnableIgniteRepositories.java`
#### Snippet
```java
     * {@link Key#CREATE_IF_NOT_FOUND}.
     *
     * @return Key of the {@link QueryLookupStrategy} to be used for lookup queries for query methods.
     */
    Key queryLookupStrategy() default Key.CREATE_IF_NOT_FOUND;
```

### JavadocReference
Cannot resolve symbol `FactoryBean`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/EnableIgniteRepositories.java`
#### Snippet
```java

    /**
     * Returns the {@link FactoryBean} class to be used for each repository instance. Defaults to {@link
     * IgniteRepositoryFactoryBean}.
     *
```

### JavadocReference
Cannot resolve symbol `FactoryBean`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/EnableIgniteRepositories.java`
#### Snippet
```java
     * IgniteRepositoryFactoryBean}.
     *
     * @return {@link FactoryBean} class to be used for each repository instance.
     */
    Class<?> repositoryFactoryBeanClass() default IgniteRepositoryFactoryBean.class;
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/Query.java`
#### Snippet
```java
    /**
     * Whether annotated repository method must use TextQuery search. Note that text queries are not supported if
     * {@link IgniteClient} is used for accessing the Ignite cluster, use {@link Ignite} node instance instead.
     *
     * @see RepositoryConfig#igniteInstance()
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/config/Query.java`
#### Snippet
```java
    /**
     * Whether annotated repository method must use TextQuery search. Note that text queries are not supported if
     * {@link IgniteClient} is used for accessing the Ignite cluster, use {@link Ignite} node instance instead.
     *
     * @see RepositoryConfig#igniteInstance()
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteRepositoryFactoryBean.java`
#### Snippet
```java
 * parameters below in your Spring application configuration in order to get an access to Apache Ignite cluster:
 * <ul>
 * <li>{@link Ignite} instance bean</li>
 * <li>{@link IgniteConfiguration} bean</li>
 * <li>A path to Ignite's Spring XML configuration named "igniteSpringCfgPath" by default</li>
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteRepositoryFactoryBean.java`
#### Snippet
```java
 * <ul>
 * <li>{@link Ignite} instance bean</li>
 * <li>{@link IgniteConfiguration} bean</li>
 * <li>A path to Ignite's Spring XML configuration named "igniteSpringCfgPath" by default</li>
 * <ul/>
```

### JavadocReference
Cannot resolve symbol `PartTree`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteQueryGenerator.java`
#### Snippet
```java

    /**
     * @param qryPartTree {@link PartTree} query representation.
     * @return Whether the specified {@link PartTree} contains query part which string representation depends on
     * query arguments.
```

### JavadocReference
Cannot resolve symbol `PartTree`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteQueryGenerator.java`
#### Snippet
```java
    /**
     * @param qryPartTree {@link PartTree} query representation.
     * @return Whether the specified {@link PartTree} contains query part which string representation depends on
     * query arguments.
     */
```

### JavadocReference
Cannot resolve symbol `Transaction`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/internal/transactions/proxy/IgniteTransactionProxy.java`
#### Snippet
```java

/**
 * Represents {@link TransactionProxy} implementation that uses {@link Transaction} to perform transaction
 * operations.
 */
```

### JavadocReference
Cannot resolve symbol `IgniteProxy`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java

/**
 * Represents factory for obtaining instances of {@link IgniteProxy} that provide client-independent connection to the
 * Ignite cluster.
 */
```

### JavadocReference
Cannot resolve symbol `BeansException`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java
         * Get bean.
         * @return Bean.
         * @throws BeansException If bean was not found.
         */
        Object get() throws BeansException;
```

### JavadocReference
Cannot resolve symbol `BeansException`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java
        /**
         * Get bean.
         * @return Bean or null if {@link BeansException} was thrown.
         */
        default Object getBean() {
```

### JavadocReference
Cannot resolve symbol `IgniteProxy`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java

    /**
     * Creates {@link IgniteProxy} to be used for providing access to the Ignite cluster for specified repository.
     *
     * @param repoInterface {@link Class} instance of the repository interface.
```

### JavadocReference
Cannot resolve symbol `IgniteProxy`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java
     *
     * @param repoInterface {@link Class} instance of the repository interface.
     * @return Instance of {@link IgniteProxy} associated with specified repository.
     *
     * @see RepositoryConfig
```

### JavadocReference
Cannot resolve symbol `IgniteProxy`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java

    /**
     * @param repoInterface The repository interface class for which {@link IgniteProxy} will be created.
     * @return {@link IgniteProxy} instance.
     */
```

### JavadocReference
Cannot resolve symbol `IgniteProxy`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java
    /**
     * @param repoInterface The repository interface class for which {@link IgniteProxy} will be created.
     * @return {@link IgniteProxy} instance.
     */
    public IgniteProxy igniteProxy(Class<?> repoInterface) {
```

### JavadocReference
Cannot resolve symbol `ClientTransaction`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/internal/transactions/proxy/ClientTransactionProxy.java`
#### Snippet
```java

/**
 * Represents {@link TransactionProxy} implementation that uses {@link ClientTransaction} to perform transaction
 * operations.
 */
```

### JavadocReference
Cannot resolve symbol `JdbcTemplate`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/cache/store/spring/CacheSpringStoreSessionListener.java`
#### Snippet
```java
 * cache transaction, this listener is no-op.
 * <p>
 * Store implementation can use any Spring APIs like {@link JdbcTemplate}
 * and others. The listener will guarantee that if there is an
 * ongoing cache transaction, all store operations within this
```

### JavadocReference
Cannot resolve symbol `PlatformTransactionManager`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/cache/store/spring/CacheSpringStoreSessionListener.java`
#### Snippet
```java
 * <p>
 * {@link org.apache.ignite.cache.store.spring.CacheSpringStoreSessionListener} requires that either
 * {@link #setTransactionManager(PlatformTransactionManager) transaction manager}
 * or {@link #setDataSource(DataSource) data source} is configured. If non of them is
 * provided, exception is thrown. Is both are provided, data source will be
```

### JavadocReference
Cannot resolve symbol `TransactionStatus`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/cache/store/spring/CacheSpringStoreSessionListener.java`
#### Snippet
```java
 * ignored.
 * <p>
 * If there is a transaction, a {@link TransactionStatus} object will be saved
 * as a store session {@link CacheStoreSession#attachment() attachment}. It
 * can be used to acquire current DB transaction status.
```

### JavadocReference
Cannot resolve symbol `CacheStoreSession`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/cache/store/spring/CacheSpringStoreSessionListener.java`
#### Snippet
```java
 * <p>
 * If there is a transaction, a {@link TransactionStatus} object will be saved
 * as a store session {@link CacheStoreSession#attachment() attachment}. It
 * can be used to acquire current DB transaction status.
 */
```

### JavadocReference
Cannot resolve symbol `attachment()`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/cache/store/spring/CacheSpringStoreSessionListener.java`
#### Snippet
```java
 * <p>
 * If there is a transaction, a {@link TransactionStatus} object will be saved
 * as a store session {@link CacheStoreSession#attachment() attachment}. It
 * can be used to acquire current DB transaction status.
 */
```

### JavadocReference
Cannot resolve symbol `org.springframework.transaction.support.ResourceHolder`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/transactions/spring/IgniteTransactionHolder.java`
#### Snippet
```java

/**
 * A {@link org.springframework.transaction.support.ResourceHolder} for the Ignite {@link Transaction} to
 * associate the transaction with a Spring transaction manager.
 */
```

### JavadocReference
Cannot resolve symbol `Transaction`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/transactions/spring/IgniteTransactionHolder.java`
#### Snippet
```java

/**
 * A {@link org.springframework.transaction.support.ResourceHolder} for the Ignite {@link Transaction} to
 * associate the transaction with a Spring transaction manager.
 */
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/transactions/spring/IgniteClientSpringTransactionManager.java`
#### Snippet
```java
 * Represents {@link AbstractSpringTransactionManager} implementation that uses thin client to access the cluster and
 * manage transactions. It requires thin client instance to be set before manager use
 * (see {@link #setClientInstance(IgniteClient)}).
 *
 * You can provide ignite client instance to a Spring configuration XML file, like below:
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/transactions/spring/SpringTransactionManager.java`
#### Snippet
```java
 * &lt;/beans&gt;
 * </pre>
 * Or you can provide a {@link IgniteConfiguration} bean, like below:
 * <pre name="code" class="xml">
 * &lt;beans xmlns="http://www.springframework.org/schema/beans"
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/transactions/spring/SpringTransactionManager.java`
#### Snippet
```java
 *
 * If neither {@link #setConfigurationPath(String) configurationPath},
 * {@link #setConfiguration(IgniteConfiguration) configuration}, nor
 * {@link #setIgniteInstanceName(String) igniteInstanceName} are provided, transaction manager
 * will try to use default Grid instance (the one with the {@code null}
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/IgniteClientSpringCacheManager.java`
#### Snippet
```java
/**
 * Represents implementation of {@link AbstractCacheManager} that uses thin client to connect to an Ignite cluster
 * and obtain an Ignite cache instance. It requires {@link IgniteClient} instance or {@link ClientConfiguration} to be
 * set before manager use (see {@link #setClientInstance(IgniteClient),
 * {@link #setClientConfiguration(ClientConfiguration)}}).
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/IgniteClientSpringCacheManager.java`
#### Snippet
```java
/**
 * Represents implementation of {@link AbstractCacheManager} that uses thin client to connect to an Ignite cluster
 * and obtain an Ignite cache instance. It requires {@link IgniteClient} instance or {@link ClientConfiguration} to be
 * set before manager use (see {@link #setClientInstance(IgniteClient),
 * {@link #setClientConfiguration(ClientConfiguration)}}).
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/IgniteClientSpringCacheManager.java`
#### Snippet
```java
 * Represents implementation of {@link AbstractCacheManager} that uses thin client to connect to an Ignite cluster
 * and obtain an Ignite cache instance. It requires {@link IgniteClient} instance or {@link ClientConfiguration} to be
 * set before manager use (see {@link #setClientInstance(IgniteClient),
 * {@link #setClientConfiguration(ClientConfiguration)}}).
 *
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/IgniteClientSpringCacheManager.java`
#### Snippet
```java
 * and obtain an Ignite cache instance. It requires {@link IgniteClient} instance or {@link ClientConfiguration} to be
 * set before manager use (see {@link #setClientInstance(IgniteClient),
 * {@link #setClientConfiguration(ClientConfiguration)}}).
 *
 * Note that current manager implementation can be used only with Ignite since 2.11.0 version.
```

### JavadocReference
Cannot resolve symbol `Cacheable`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/IgniteClientSpringCacheManager.java`
#### Snippet
```java
 * For Ignite versions earlier than 2.11.0 use an {@link SpringCacheManager}.
 *
 * Note that Spring Cache synchronous mode ({@link Cacheable#sync}) is not supported by the current manager
 * implementation. Instead, use an {@link SpringCacheManager} that uses an Ignite thick client to connect to Ignite cluster.
 *
```

### JavadocReference
Cannot resolve symbol `sync`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/IgniteClientSpringCacheManager.java`
#### Snippet
```java
 * For Ignite versions earlier than 2.11.0 use an {@link SpringCacheManager}.
 *
 * Note that Spring Cache synchronous mode ({@link Cacheable#sync}) is not supported by the current manager
 * implementation. Instead, use an {@link SpringCacheManager} that uses an Ignite thick client to connect to Ignite cluster.
 *
```

### JavadocReference
Cannot resolve symbol `IgniteSshHelper`
in `modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/IgniteSshHelperImpl.java`
#### Snippet
```java

/**
 * Implementation of {@link IgniteSshHelper}.
 */
public class IgniteSshHelperImpl implements IgniteSshHelper {
```

### JavadocReference
Cannot resolve symbol `CacheManager`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/AbstractCacheManager.java`
#### Snippet
```java

/**
 * Represents abstract {@link CacheManager} implementation that hand over responsibility to create new cache instances
 * and synchronization objects for cache value computations to its inheritors.
 */
```

### JavadocReference
Cannot resolve symbol `BeanFactory`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteConfigurer.java`
#### Snippet
```java

/**
 * Instance of this interface available in {@link BeanFactory} will be used to customize empty
 * {@link IgniteConfiguration} during Ignite node start. If you want to set custom SPI instances or
 * similar hardcoded values you should do it in the implementation of this interface.
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteConfigurer.java`
#### Snippet
```java
/**
 * Instance of this interface available in {@link BeanFactory} will be used to customize empty
 * {@link IgniteConfiguration} during Ignite node start. If you want to set custom SPI instances or
 * similar hardcoded values you should do it in the implementation of this interface.
 *
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteConfigurer.java`
#### Snippet
```java
 * similar hardcoded values you should do it in the implementation of this interface.
 *
 * @see IgniteConfiguration
 * @see IgniteAutoConfiguration
 */
```

### JavadocReference
Cannot resolve symbol `ZK_CONNECT_STRING`
in `modules/zookeeper-ip-finder-ext/examples/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/ZookeeperIpFinderExample.java`
#### Snippet
```java
 * <ol>
 *  <li>Start Apache ZooKeeper. See <a href="https://zookeeper.apache.org">Apache ZooKeeper</a>.</li>
 *  <li>Make sure that the Apache ZooKeeper connection string is correct. See {@link ZK_CONNECT_STRING}.</li>
 *  <li>Start example using {@link ZookeeperIpFinderExample}.</li>
 * </ol>
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/SpringCacheManager.java`
#### Snippet
```java
 * &lt;/beans&gt;
 * </pre>
 * Or you can provide a {@link IgniteConfiguration} bean, like below:
 * <pre name="code" class="xml">
 * &lt;beans xmlns="http://www.springframework.org/schema/beans"
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/SpringCacheManager.java`
#### Snippet
```java
 * <p>
 * If neither {@link #setConfigurationPath(String) configurationPath},
 * {@link #setConfiguration(IgniteConfiguration) configuration}, nor
 * {@link #setIgniteInstanceName(String) igniteInstanceName} are provided, cache manager
 * will try to use default Grid instance (the one with the {@code null}
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteRepositoryImpl.java`
#### Snippet
```java
@Conditional(ConditionFalse.class)
public class IgniteRepositoryImpl<V, K extends Serializable> implements IgniteRepository<V, K> {
    /** Error message indicating that operation is supported only if {@link Ignite} instance is used to access the cluster. */
    private static final String UNSUPPORTED_ERR_MSG = "Current operation is supported only if Ignite node instance is" +
        " used to access the Ignite cluster. See " + RepositoryConfig.class.getName() + "#igniteInstance.";
```

### JavadocReference
Cannot resolve symbol `EnableAutoConfiguration`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteRepositoryAutoConfiguration.java`
#### Snippet
```java

/**
 * {@link EnableAutoConfiguration Auto-configuration} for Ignite Spring Data's Repositories.
 * <p>
 * Activates when there is a bean of type {@link org.apache.ignite.Ignite} configured in the
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.Ignite`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteRepositoryAutoConfiguration.java`
#### Snippet
```java
 * {@link EnableAutoConfiguration Auto-configuration} for Ignite Spring Data's Repositories.
 * <p>
 * Activates when there is a bean of type {@link org.apache.ignite.Ignite} configured in the
 * context, the Ignite Spring Data {@link IgniteRepository} type is on the classpath,
 * and there is no other, existing {@link IgniteRepository} configured.
```

### JavadocReference
Cannot resolve symbol `IgniteRepository`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteRepositoryAutoConfiguration.java`
#### Snippet
```java
 * <p>
 * Activates when there is a bean of type {@link org.apache.ignite.Ignite} configured in the
 * context, the Ignite Spring Data {@link IgniteRepository} type is on the classpath,
 * and there is no other, existing {@link IgniteRepository} configured.
 * <p>
```

### JavadocReference
Cannot resolve symbol `IgniteRepository`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteRepositoryAutoConfiguration.java`
#### Snippet
```java
 * Activates when there is a bean of type {@link org.apache.ignite.Ignite} configured in the
 * context, the Ignite Spring Data {@link IgniteRepository} type is on the classpath,
 * and there is no other, existing {@link IgniteRepository} configured.
 * <p>
 * Once in effect, the auto-configuration is the equivalent of enabling Ignite repositories
```

### JavadocReference
Cannot resolve symbol `EnableIgniteRepositories`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteRepositoryAutoConfiguration.java`
#### Snippet
```java
 * <p>
 * Once in effect, the auto-configuration is the equivalent of enabling Ignite repositories
 * using the {@link EnableIgniteRepositories @EnableIgniteRepositories} annotation.
 * <p>
 * This configuration class will activate <em>after</em> the Ignite node auto-configuration.
```

### JavadocReference
Cannot resolve symbol `ImportBeanDefinitionRegistrar`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/data/IgniteRepositoriesAutoConfigurationRegistrar.java`
#### Snippet
```java

/**
 * {@link ImportBeanDefinitionRegistrar} used to auto-configure Ignite Spring Data Repositories.
 */
public class IgniteRepositoriesAutoConfigurationRegistrar extends AbstractRepositoryConfigurationSourceSupport {
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteAutoConfiguration.java`
#### Snippet
```java
 * Initialization of the node will be the following:
 * <ul>
 *   <li>If {@link IgniteConfiguration} bean exists in {@link BeanFactory} it will be used for the node start.</li>
 *   <li>If {@link IgniteConfiguration} bean doesn't exists following rules are applied:
 *     <ol>
```

### JavadocReference
Cannot resolve symbol `BeanFactory`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteAutoConfiguration.java`
#### Snippet
```java
 * Initialization of the node will be the following:
 * <ul>
 *   <li>If {@link IgniteConfiguration} bean exists in {@link BeanFactory} it will be used for the node start.</li>
 *   <li>If {@link IgniteConfiguration} bean doesn't exists following rules are applied:
 *     <ol>
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteAutoConfiguration.java`
#### Snippet
```java
 * <ul>
 *   <li>If {@link IgniteConfiguration} bean exists in {@link BeanFactory} it will be used for the node start.</li>
 *   <li>If {@link IgniteConfiguration} bean doesn't exists following rules are applied:
 *     <ol>
 *       <li>If bean of the type {@link IgniteConfigurer} exists in {@link BeanFactory}
```

### JavadocReference
Cannot resolve symbol `BeanFactory`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteAutoConfiguration.java`
#### Snippet
```java
 *   <li>If {@link IgniteConfiguration} bean doesn't exists following rules are applied:
 *     <ol>
 *       <li>If bean of the type {@link IgniteConfigurer} exists in {@link BeanFactory}
 *         it will be used to customize empty {@link IgniteConfiguration} instance.
 *         If you want to set custom SPI instances or similar hardcoded values.
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteAutoConfiguration.java`
#### Snippet
```java
 *     <ol>
 *       <li>If bean of the type {@link IgniteConfigurer} exists in {@link BeanFactory}
 *         it will be used to customize empty {@link IgniteConfiguration} instance.
 *         If you want to set custom SPI instances or similar hardcoded values.
 *         You should do it in custom {@link IgniteConfigurer}.</li>
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteAutoConfiguration.java`
#### Snippet
```java
 *
 * @see IgniteConfigurer
 * @see IgniteConfiguration
 * @see Ignite
 */
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteAutoConfiguration.java`
#### Snippet
```java
 * @see IgniteConfigurer
 * @see IgniteConfiguration
 * @see Ignite
 */
@Configuration
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteAutoConfiguration.java`
#### Snippet
```java

    /**
     * Starts an {@link Ignite} node.
     *
     * @param cfg Configuration.
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/spring-boot-autoconfigure-ext/spring-boot-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteAutoConfiguration.java`
#### Snippet
```java

    /**
     * Provides an instance of {@link IgniteConfiguration} customized with the {@link IgniteConfigurer}.
     *
     * @param configurer Configurer.
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/spring-tx-ext/examples/src/main/java/org/apache/ignite/examples/ExampleNodeStartup.java`
#### Snippet
```java
     *
     * @param args Command line arguments, none required.
     * @throws IgniteException If failed.
     */
    public static void main(String[] args) throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `IgniteDataStreamer`
in `modules/rocketmq-ext/src/main/java/org/apache/ignite/stream/rocketmq/RocketMQStreamer.java`
#### Snippet
```java

/**
 * Streamer that subscribes to a RocketMQ topic amd feeds messages into {@link IgniteDataStreamer} instance.
 */
public class RocketMQStreamer<K, V> extends StreamAdapter<List<MessageExt>, K, V> implements MessageListenerConcurrently {
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/rocketmq-ext/src/main/java/org/apache/ignite/stream/rocketmq/RocketMQStreamer.java`
#### Snippet
```java
     * Starts streamer.
     *
     * @throws IgniteException If failed.
     */
    public void start() {
```

### JavadocReference
Cannot resolve symbol `MessageListenerConcurrently`
in `modules/rocketmq-ext/src/main/java/org/apache/ignite/stream/rocketmq/RocketMQStreamer.java`
#### Snippet
```java

    /**
     * Implements {@link MessageListenerConcurrently#consumeMessage(List, ConsumeConcurrentlyContext)} to receive
     * messages.
     *
```

### JavadocReference
Cannot resolve symbol `consumeMessage(List, ConsumeConcurrentlyContext)`
in `modules/rocketmq-ext/src/main/java/org/apache/ignite/stream/rocketmq/RocketMQStreamer.java`
#### Snippet
```java

    /**
     * Implements {@link MessageListenerConcurrently#consumeMessage(List, ConsumeConcurrentlyContext)} to receive
     * messages.
     *
```

### JavadocReference
Cannot resolve symbol `ConsumeConcurrentlyContext`
in `modules/rocketmq-ext/src/main/java/org/apache/ignite/stream/rocketmq/RocketMQStreamer.java`
#### Snippet
```java

    /**
     * Implements {@link MessageListenerConcurrently#consumeMessage(List, ConsumeConcurrentlyContext)} to receive
     * messages.
     *
```

### JavadocReference
Cannot resolve symbol `Type`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java

        /**
         * Creates a new {@link LikeParameterBinding} for the parameter with the given position and {@link Type}.
         *
         * @param position   position of the parameter in the query.
```

### JavadocReference
Cannot resolve symbol `Type`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java

        /**
         * Creates a new {@link LikeParameterBinding} for the parameter with the given name and {@link Type} and
         * parameter binding input.
         *
```

### JavadocReference
Cannot resolve symbol `Type`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java

        /**
         * Creates a new {@link LikeParameterBinding} for the parameter with the given position and {@link Type}.
         *
         * @param position position of the parameter in the query.
```

### JavadocReference
Cannot resolve symbol `Type`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java

        /**
         * Creates a new {@link LikeParameterBinding} for the parameter with the given name and {@link Type}.
         *
         * @param name must not be {@literal null} or empty.
```

### JavadocReference
Cannot resolve symbol `Type`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java

        /**
         * Returns the {@link Type} of the binding.
         *
         * @return the type
```

### JavadocReference
Cannot resolve symbol `Type`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java

        /**
         * Extracts the like {@link Type} from the given JPA like expression.
         *
         * @param expression must not be {@literal null} or empty.
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/spring-tx-ext/examples/src/main/java/org/apache/ignite/examples/util/DbH2ServerStartup.java`
#### Snippet
```java
     *
     * @param args Command line arguments, none required.
     * @throws IgniteException If start H2 database TCP server failed.
     */
    public static void main(String[] args) throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.binary.Binarylizable`
in `modules/spring-tx-ext/examples/src/main/java/org/apache/ignite/examples/model/Address.java`
#### Snippet
```java
 * Employee address.
 * <p>
 * This class implements {@link org.apache.ignite.binary.Binarylizable} only for example purposes,
 * in order to show how to customize serialization and deserialization of
 * binary objects.
```

### JavadocReference
Cannot resolve symbol `ServiceDiscoveryBuilder`
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java
    private static final String SERVICE_NAME = "ignite";

    /** Default URI Spec to use with the {@link ServiceDiscoveryBuilder}. */
    private static final UriSpec URI_SPEC = new UriSpec("{address}:{port}");

```

### JavadocReference
Cannot resolve symbol `CuratorFramework`
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java

    /**
     * @param zkConnectionString ZooKeeper connection string in case a {@link CuratorFramework} is not being set
     * explicitly.
     * @return {@code this} for chaining.
```

### JavadocReference
Cannot resolve symbol `RetryPolicy`
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java

    /**
     * @param retryPolicy {@link RetryPolicy} to use in case a ZK Connection String is being injected, or if using a
     * system property.
     * @return {@code this} for chaining.
```

### JavadocReference
Cannot resolve symbol `ServiceDiscovery`
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java
 * This TCP Discovery IP Finder uses Apache ZooKeeper (ZK) to locate peer nodes when bootstrapping in order to join
 * the cluster. It uses the Apache Curator library to interact with ZooKeeper in a simple manner. Specifically,
 * it uses the {@link ServiceDiscovery} recipe, which makes use of ephemeral nodes in ZK to register services.
 *
 * <p>
```

### JavadocReference
Cannot resolve symbol `CuratorFramework`
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java
 * There are several ways to instantiate the TcpDiscoveryZookeeperIpFinder:
 * <li>
 *     <ul>By providing an instance of {@link CuratorFramework} directly, in which case no ZK Connection String
 *     is required.</ul>
 *     <ul>By providing a ZK Connection String through {@link #setZkConnectionString(String)}, and optionally
```

### JavadocReference
Cannot resolve symbol `RetryPolicy`
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java
 *     is required.</ul>
 *     <ul>By providing a ZK Connection String through {@link #setZkConnectionString(String)}, and optionally
 *     a {@link RetryPolicy} through the setter. If the latter is not provided, a default
 *     {@link ExponentialBackoffRetry} policy is used, with a base sleep time of 1000ms and 10 retries.</ul>
 *     <ul>By providing a ZK Connection String through system property {@link #PROP_ZK_CONNECTION_STRING}. If this
```

### JavadocReference
Cannot resolve symbol `ExponentialBackoffRetry`
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java
 *     <ul>By providing a ZK Connection String through {@link #setZkConnectionString(String)}, and optionally
 *     a {@link RetryPolicy} through the setter. If the latter is not provided, a default
 *     {@link ExponentialBackoffRetry} policy is used, with a base sleep time of 1000ms and 10 retries.</ul>
 *     <ul>By providing a ZK Connection String through system property {@link #PROP_ZK_CONNECTION_STRING}. If this
 *     property is set, it overrides the ZK Connection String passed in as a property, but it does not override
```

### JavadocReference
Cannot resolve symbol `CuratorFramework`
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java
 *     <ul>By providing a ZK Connection String through system property {@link #PROP_ZK_CONNECTION_STRING}. If this
 *     property is set, it overrides the ZK Connection String passed in as a property, but it does not override
 *     the {@link CuratorFramework} if provided.</ul>
 * </li>
 *
```

### JavadocReference
Cannot resolve symbol `CuratorFramework`
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java

    /**
     * @param curator A {@link CuratorFramework} instance to use. It can already be in <tt>STARTED</tt> state.
     * @return {@code this} for chaining.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.internal.processors.query.h2.H2DatabaseType`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteRepositoryQuery.java`
#### Snippet
```java
     * When select fields by query H2 returns Timestamp for types java.util.Date and java.qryStr.Timestamp
     *
     * @see org.apache.ignite.internal.processors.query.h2.H2DatabaseType map.put(Timestamp.class, TIMESTAMP)
     * map.put(java.util.Date.class, TIMESTAMP) map.put(java.qryStr.Date.class, DATE)
     */
```

### JavadocReference
Cannot resolve symbol `TextQuery`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteRepositoryQuery.java`
#### Snippet
```java
 * </pre>
 * </li>
 * <li> Supports SpEL expressions into Text queries ({@link TextQuery}). Examples:
 * <pre>
 * {@code @Query}(textQuery = true, value = "email: #{#email}")
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/spring-tx-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/store/spring/CacheSpringStoreExample.java`
#### Snippet
```java
     *
     * @param args Command line arguments, none required.
     * @throws IgniteException If example execution failed.
     */
    public static void main(String[] args) throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/spring-tx-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/store/spring/CacheSpringPersonStore.java`
#### Snippet
```java
     * Constructor.
     *
     * @throws IgniteException If failed.
     */
    public CacheSpringPersonStore() throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `CacheStore`
in `modules/spring-tx-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/store/spring/CacheSpringPersonStore.java`
#### Snippet
```java

/**
 * Example of {@link CacheStore} implementation that uses JDBC
 * transaction with cache transactions and maps {@link Long} to {@link Person}.
 */
```

### JavadocReference
Cannot resolve symbol `TimestampsRegion`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteTimestampsRegion.java`
#### Snippet
```java

/**
 * Implementation of {@link TimestampsRegion}. This region is automatically created when query
 * caching is enabled and it holds most recent updates timestamps to queryable tables.
 * Name of timestamps region is {@link RegionFactory#DEFAULT_UPDATE_TIMESTAMPS_REGION_UNQUALIFIED_NAME}.
```

### JavadocReference
Cannot resolve symbol `RegionFactory`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteTimestampsRegion.java`
#### Snippet
```java
 * Implementation of {@link TimestampsRegion}. This region is automatically created when query
 * caching is enabled and it holds most recent updates timestamps to queryable tables.
 * Name of timestamps region is {@link RegionFactory#DEFAULT_UPDATE_TIMESTAMPS_REGION_UNQUALIFIED_NAME}.
 */
public class IgniteTimestampsRegion extends IgniteGeneralDataRegion implements TimestampsRegion {
```

### JavadocReference
Cannot resolve symbol `DEFAULT_UPDATE_TIMESTAMPS_REGION_UNQUALIFIED_NAME`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteTimestampsRegion.java`
#### Snippet
```java
 * Implementation of {@link TimestampsRegion}. This region is automatically created when query
 * caching is enabled and it holds most recent updates timestamps to queryable tables.
 * Name of timestamps region is {@link RegionFactory#DEFAULT_UPDATE_TIMESTAMPS_REGION_UNQUALIFIED_NAME}.
 */
public class IgniteTimestampsRegion extends IgniteGeneralDataRegion implements TimestampsRegion {
```

### JavadocReference
Cannot resolve symbol `IgniteInterruptedCheckedException`
in `modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
     * @throws JSchException In case of SSH error.
     * @throws IOException If IO error occurs.
     * @throws IgniteInterruptedCheckedException If thread was interrupted while waiting.
     */
    private void shell(Session ses, String cmd, String regexp)
```

### JavadocReference
Cannot resolve symbol `IgniteInterruptedCheckedException`
in `modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
     * @throws JSchException In case of SSH error.
     * @throws IOException If IO error occurs.
     * @throws IgniteInterruptedCheckedException If thread was interrupted while waiting.
     */
    private void shell(Session ses, String cmd) throws JSchException, IOException, IgniteInterruptedCheckedException {
```

### JavadocReference
Cannot resolve symbol `CacheConfiguration`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStoreFactory.java`
#### Snippet
```java
 * {@link Factory} implementation for {@link CacheHibernateBlobStore}.
 *
 * Use this factory to pass {@link CacheHibernateBlobStore} to {@link CacheConfiguration}.
 *
 * <h2 class="header">Java Example</h2>
```

### JavadocReference
Cannot resolve symbol `SessionFactory`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStoreFactory.java`
#### Snippet
```java
     * @param sesFactory Session factory.
     * @return {@code This} for chaining.
     * @see CacheHibernateBlobStore#setSessionFactory(SessionFactory)
     */
    public CacheHibernateBlobStoreFactory<K, V> setSessionFactory(SessionFactory sesFactory) {
```

### JavadocReference
Cannot resolve symbol `SessionFactory`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStoreFactory.java`
#### Snippet
```java
     * @param sesFactory Session factory bean name.
     * @return {@code This} for chaining.
     * @see CacheHibernateBlobStore#setSessionFactory(SessionFactory)
     */
    public CacheHibernateBlobStoreFactory<K, V> setSessionFactoryBean(String sesFactory) {
```

### JavadocReference
Cannot resolve symbol `CacheStoreSession`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateStoreSessionListener.java`
#### Snippet
```java
 * <p>
 * The Hibernate session is saved as a store session
 * {@link CacheStoreSession#attachment() attachment}.
 * The listener guarantees that the session will be
 * available for any store operation. If there is an
```

### JavadocReference
Cannot resolve symbol `attachment()`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateStoreSessionListener.java`
#### Snippet
```java
 * <p>
 * The Hibernate session is saved as a store session
 * {@link CacheStoreSession#attachment() attachment}.
 * The listener guarantees that the session will be
 * available for any store operation. If there is an
```

### JavadocReference
Cannot resolve symbol `CacheStore`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateStoreSessionListener.java`
#### Snippet
```java
 * transaction will share a DB transaction.
 * <p>
 * As an example, here is how the {@link CacheStore#write(javax.cache.Cache.Entry)}
 * method can be implemented if {@link CacheHibernateStoreSessionListener}
 * is configured:
```

### JavadocReference
Cannot resolve symbol `write(javax.cache.Cache.Entry)`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateStoreSessionListener.java`
#### Snippet
```java
 * transaction will share a DB transaction.
 * <p>
 * As an example, here is how the {@link CacheStore#write(javax.cache.Cache.Entry)}
 * method can be implemented if {@link CacheHibernateStoreSessionListener}
 * is configured:
```

### JavadocReference
Cannot resolve symbol `SessionFactory`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateStoreSessionListener.java`
#### Snippet
```java
 * <p>
 * {@link CacheHibernateStoreSessionListener} requires that either
 * {@link #setSessionFactory(SessionFactory)} session factory}
 * or {@link #setHibernateConfigurationPath(String) Hibernate configuration file}
 * is provided. If non of them is set, exception is thrown. Is both are provided,
```

### JavadocReference
Cannot resolve symbol `Region`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateRegion.java`
#### Snippet
```java

/**
 * Implementation of {@link Region}. This interface defines base contract for all L2 cache regions.
 */
public abstract class HibernateRegion extends AbstractRegion implements ExtendedStatisticsSupport {
```

### JavadocReference
Cannot resolve symbol `QueryResultsRegion`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteQueryResultsRegion.java`
#### Snippet
```java

/**
 * Implementation of {@link QueryResultsRegion}. This region is used to store query results.
 * <p>
 * Query results caching can be enabled in the Hibernate configuration file:
```

### JavadocReference
Cannot resolve symbol `Query`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteQueryResultsRegion.java`
#### Snippet
```java
 * </pre>
 * By default queries are not cached even after enabling query caching, to enable results caching for a particular
 * query, call {@link Query#setCacheable(boolean)}:
 * <pre name="code" class="java">
 *     Session ses = getSession();
```

### JavadocReference
Cannot resolve symbol `setCacheable(boolean)`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteQueryResultsRegion.java`
#### Snippet
```java
 * </pre>
 * By default queries are not cached even after enabling query caching, to enable results caching for a particular
 * query, call {@link Query#setCacheable(boolean)}:
 * <pre name="code" class="java">
 *     Session ses = getSession();
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateTransactionalAccessStrategy.java`
#### Snippet
```java
 * <p>
 * It is supposed that this strategy is used in JTA environment and Hibernate and
 * {@link IgniteInternalCache} corresponding to the L2 cache region are configured to use the same transaction manager.
 * <p>
 * Configuration of L2 cache and per-entity cache access strategy can be set in the
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateAccessStrategyAdapter.java`
#### Snippet
```java
     *
     * @param cache Cache.
     * @throws IgniteCheckedException If failed.
     */
    public static void evictAll(IgniteInternalCache<Object, Object> cache) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateRegionFactory.java`
#### Snippet
```java
 * org.apache.ignite.hibernate.ignite_instance_name=&lt;Ignite instance name&gt;
 * </pre>
 * Each Hibernate cache region must be associated with some {@link IgniteInternalCache}, by default it is assumed that
 * for each cache region there is a {@link IgniteInternalCache} with the same name. Also it is possible to define
 * region to cache mapping using properties with prefix {@code org.apache.ignite.hibernate.region_cache}.
```

### JavadocReference
Cannot resolve symbol `IgniteInternalCache`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateRegionFactory.java`
#### Snippet
```java
 * </pre>
 * Each Hibernate cache region must be associated with some {@link IgniteInternalCache}, by default it is assumed that
 * for each cache region there is a {@link IgniteInternalCache} with the same name. Also it is possible to define
 * region to cache mapping using properties with prefix {@code org.apache.ignite.hibernate.region_cache}.
 * For example if for region with name "region1" cache with name "cache1" should be used then following
```

### JavadocReference
Cannot resolve symbol `IgniteSpiException`
in `modules/azure-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/azure/TcpDiscoveryAzureBlobStoreIpFinder.java`
#### Snippet
```java
    /**
     * Initialize the IP finder
     * @throws IgniteSpiException
     */
    private void init() throws IgniteSpiException {
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder`
in `modules/azure-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/azure/TcpDiscoveryAzureBlobStoreIpFinder.java`
#### Snippet
```java
 * <p>
 * Note that storing data in Azure Blob Storage service will result in charges to your Azure account.
 * Choose another implementation of {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder} for local
 * or home network tests.
 * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder`
in `modules/azure-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/azure/TcpDiscoveryAzureBlobStoreIpFinder.java`
#### Snippet
```java
 * or home network tests.
 * <p>
 * Note that this finder is shared by default (see {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder#isShared()}.
 */
public class TcpDiscoveryAzureBlobStoreIpFinder extends TcpDiscoveryIpFinderAdapter {
```

### JavadocReference
Cannot resolve symbol `isShared()`
in `modules/azure-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/azure/TcpDiscoveryAzureBlobStoreIpFinder.java`
#### Snippet
```java
 * or home network tests.
 * <p>
 * Note that this finder is shared by default (see {@link org.apache.ignite.spi.discovery.tcp.ipfinder.TcpDiscoveryIpFinder#isShared()}.
 */
public class TcpDiscoveryAzureBlobStoreIpFinder extends TcpDiscoveryIpFinderAdapter {
```

### JavadocReference
Cannot resolve symbol `IgniteSpiException`
in `modules/azure-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/azure/TcpDiscoveryAzureBlobStoreIpFinder.java`
#### Snippet
```java
     * @param key Bucket key.
     * @return Node address.
     * @throws IgniteSpiException In case of error.
     */
    private InetSocketAddress addrFromString(String key) throws IgniteSpiException {
```

### JavadocReference
Cannot resolve symbol `CollectionDataAccess`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteCollectionDataAccess.java`
#### Snippet
```java

/**
 * Implementation of {@link CollectionDataAccess} contract for managing transactional and concurrent
 * L2 cache access to cached collection data.
 */
```

### JavadocReference
Cannot resolve symbol `DirectAccessRegion`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteGeneralDataRegion.java`
#### Snippet
```java

/**
 * Implementation of {@link DirectAccessRegion}. This interface defines common contract for {@link QueryResultsRegion}
 * and {@link TimestampsRegion}.
 */
```

### JavadocReference
Cannot resolve symbol `QueryResultsRegion`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteGeneralDataRegion.java`
#### Snippet
```java

/**
 * Implementation of {@link DirectAccessRegion}. This interface defines common contract for {@link QueryResultsRegion}
 * and {@link TimestampsRegion}.
 */
```

### JavadocReference
Cannot resolve symbol `TimestampsRegion`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteGeneralDataRegion.java`
#### Snippet
```java
/**
 * Implementation of {@link DirectAccessRegion}. This interface defines common contract for {@link QueryResultsRegion}
 * and {@link TimestampsRegion}.
 */
public class IgniteGeneralDataRegion extends HibernateRegion implements DirectAccessRegion {
```

### JavadocReference
Cannot resolve symbol `DefaultCacheKeysFactory`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateKeyWrapper.java`
#### Snippet
```java
     * @param tenantIdentifier Tenant ID.
     * @return Cache key.
     * @see DefaultCacheKeysFactory#staticCreateCollectionKey(Object, CollectionPersister, SessionFactoryImplementor, String)
     */
    static Object staticCreateCollectionKey(Object id,
```

### JavadocReference
Cannot resolve symbol `staticCreateCollectionKey(Object, CollectionPersister, SessionFactoryImplementor, String)`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateKeyWrapper.java`
#### Snippet
```java
     * @param tenantIdentifier Tenant ID.
     * @return Cache key.
     * @see DefaultCacheKeysFactory#staticCreateCollectionKey(Object, CollectionPersister, SessionFactoryImplementor, String)
     */
    static Object staticCreateCollectionKey(Object id,
```

### JavadocReference
Cannot resolve symbol `CollectionPersister`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateKeyWrapper.java`
#### Snippet
```java
     * @param tenantIdentifier Tenant ID.
     * @return Cache key.
     * @see DefaultCacheKeysFactory#staticCreateCollectionKey(Object, CollectionPersister, SessionFactoryImplementor, String)
     */
    static Object staticCreateCollectionKey(Object id,
```

### JavadocReference
Cannot resolve symbol `SessionFactoryImplementor`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateKeyWrapper.java`
#### Snippet
```java
     * @param tenantIdentifier Tenant ID.
     * @return Cache key.
     * @see DefaultCacheKeysFactory#staticCreateCollectionKey(Object, CollectionPersister, SessionFactoryImplementor, String)
     */
    static Object staticCreateCollectionKey(Object id,
```

### JavadocReference
Cannot resolve symbol `DefaultCacheKeysFactory`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateKeyWrapper.java`
#### Snippet
```java
     * @param tenantIdentifier Tenant ID.
     * @return Cache key.
     * @see DefaultCacheKeysFactory#staticCreateEntityKey(Object, EntityPersister, SessionFactoryImplementor, String)
     */
    public static Object staticCreateEntityKey(Object id, EntityPersister persister, String tenantIdentifier) {
```

### JavadocReference
Cannot resolve symbol `staticCreateEntityKey(Object, EntityPersister, SessionFactoryImplementor, String)`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateKeyWrapper.java`
#### Snippet
```java
     * @param tenantIdentifier Tenant ID.
     * @return Cache key.
     * @see DefaultCacheKeysFactory#staticCreateEntityKey(Object, EntityPersister, SessionFactoryImplementor, String)
     */
    public static Object staticCreateEntityKey(Object id, EntityPersister persister, String tenantIdentifier) {
```

### JavadocReference
Cannot resolve symbol `EntityPersister`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateKeyWrapper.java`
#### Snippet
```java
     * @param tenantIdentifier Tenant ID.
     * @return Cache key.
     * @see DefaultCacheKeysFactory#staticCreateEntityKey(Object, EntityPersister, SessionFactoryImplementor, String)
     */
    public static Object staticCreateEntityKey(Object id, EntityPersister persister, String tenantIdentifier) {
```

### JavadocReference
Cannot resolve symbol `SessionFactoryImplementor`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateKeyWrapper.java`
#### Snippet
```java
     * @param tenantIdentifier Tenant ID.
     * @return Cache key.
     * @see DefaultCacheKeysFactory#staticCreateEntityKey(Object, EntityPersister, SessionFactoryImplementor, String)
     */
    public static Object staticCreateEntityKey(Object id, EntityPersister persister, String tenantIdentifier) {
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateNonStrictAccessStrategy.java`
#### Snippet
```java
         *
         * @param cache Cache.
         * @throws IgniteCheckedException If failed.
         */
        void updateCache(HibernateCacheProxy cache) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `BeanFactory`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientConfigurer.java`
#### Snippet
```java

/**
 * Instance of this interface available in {@link BeanFactory} will be used to customize empty
 * {@link ClientConfiguration} during Ignite client start. If you want to set custom property instances or
 * similar hardcoded values you should do it in the implementation of this interface.
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientConfigurer.java`
#### Snippet
```java
/**
 * Instance of this interface available in {@link BeanFactory} will be used to customize empty
 * {@link ClientConfiguration} during Ignite client start. If you want to set custom property instances or
 * similar hardcoded values you should do it in the implementation of this interface.
 *
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientConfigurer.java`
#### Snippet
```java
 * similar hardcoded values you should do it in the implementation of this interface.
 *
 * @see ClientConfiguration
 * @see IgniteClientAutoConfiguration
 */
```

### JavadocReference
Cannot resolve symbol `CacheStore`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStore.java`
#### Snippet
```java

/**
 * {@link CacheStore} implementation backed by Hibernate. This implementation
 * stores objects in underlying database in {@code BLOB} format.
 * <h2 class="header">Configuration</h2>
```

### JavadocReference
Cannot resolve symbol `SessionFactory`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStore.java`
#### Snippet
```java
 * stores objects in underlying database in {@code BLOB} format.
 * <h2 class="header">Configuration</h2>
 * Either {@link #setSessionFactory(SessionFactory)} or
 * {@link #setHibernateConfigurationPath(String)} or
 * {@link #setHibernateProperties(Properties)} should be set.
```

### JavadocReference
Cannot resolve symbol `CacheConfiguration`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStore.java`
#### Snippet
```java
 * {@code GridCacheHibernateStoreEntry.hbm.xml} is included automatically.
 * <p>
 * Use {@link CacheHibernateBlobStoreFactory} factory to pass {@link CacheHibernateBlobStore} to {@link CacheConfiguration}.
 */
public class CacheHibernateBlobStore<K, V> extends CacheStoreAdapter<K, V> {
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStore.java`
#### Snippet
```java
     * @param obj Object to convert to byte array.
     * @return Byte array.
     * @throws IgniteCheckedException If failed to convert.
     */
    protected byte[] toBytes(Object obj) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStore.java`
#### Snippet
```java
     * @param <X> Result object type.
     * @return Deserialized object.
     * @throws IgniteCheckedException If failed.
     */
    protected <X> X fromBytes(byte[] bytes) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStore.java`
#### Snippet
```java
     * Initializes store.
     *
     * @throws IgniteException If failed to initialize.
     */
    private void init() throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `EnableAutoConfiguration`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientRepositoryAutoConfiguration.java`
#### Snippet
```java

/**
 * {@link EnableAutoConfiguration Auto-configuration} for Ignite Spring Data's Repositories.
 * <p>
 * Activates when there is a bean of type {@link IgniteClient} configured in the
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientRepositoryAutoConfiguration.java`
#### Snippet
```java
 * {@link EnableAutoConfiguration Auto-configuration} for Ignite Spring Data's Repositories.
 * <p>
 * Activates when there is a bean of type {@link IgniteClient} configured in the
 * context, the Ignite Spring Data {@link IgniteRepository} type is on the classpath,
 * and there is no other, existing {@link IgniteRepository} configured.
```

### JavadocReference
Cannot resolve symbol `IgniteRepository`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientRepositoryAutoConfiguration.java`
#### Snippet
```java
 * <p>
 * Activates when there is a bean of type {@link IgniteClient} configured in the
 * context, the Ignite Spring Data {@link IgniteRepository} type is on the classpath,
 * and there is no other, existing {@link IgniteRepository} configured.
 * <p>
```

### JavadocReference
Cannot resolve symbol `IgniteRepository`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientRepositoryAutoConfiguration.java`
#### Snippet
```java
 * Activates when there is a bean of type {@link IgniteClient} configured in the
 * context, the Ignite Spring Data {@link IgniteRepository} type is on the classpath,
 * and there is no other, existing {@link IgniteRepository} configured.
 * <p>
 * Once in effect, the auto-configuration is the equivalent of enabling Ignite repositories
```

### JavadocReference
Cannot resolve symbol `EnableIgniteRepositories`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientRepositoryAutoConfiguration.java`
#### Snippet
```java
 * <p>
 * Once in effect, the auto-configuration is the equivalent of enabling Ignite repositories
 * using the {@link EnableIgniteRepositories @EnableIgniteRepositories} annotation.
 * <p>
 * This configuration class will activate <em>after</em> the Ignite client auto-configuration.
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientAutoConfiguration.java`
#### Snippet
```java

    /**
     * Provides an instance of {@link ClientConfiguration} customized with the {@link IgniteClientConfigurer}.
     *
     * @param configurer Configurer.
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientAutoConfiguration.java`
#### Snippet
```java
 * Initialization of the node will be the following:
 * <ul>
 *   <li>If {@link ClientConfiguration} bean exists in {@link BeanFactory} it will be used for the node start.</li>
 *   <li>If {@link ClientConfiguration} bean doesn't exists following rules are applied:
 *     <ol>
```

### JavadocReference
Cannot resolve symbol `BeanFactory`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientAutoConfiguration.java`
#### Snippet
```java
 * Initialization of the node will be the following:
 * <ul>
 *   <li>If {@link ClientConfiguration} bean exists in {@link BeanFactory} it will be used for the node start.</li>
 *   <li>If {@link ClientConfiguration} bean doesn't exists following rules are applied:
 *     <ol>
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientAutoConfiguration.java`
#### Snippet
```java
 * <ul>
 *   <li>If {@link ClientConfiguration} bean exists in {@link BeanFactory} it will be used for the node start.</li>
 *   <li>If {@link ClientConfiguration} bean doesn't exists following rules are applied:
 *     <ol>
 *       <li>If bean of the type {@link IgniteClientConfigurer} exists in {@link BeanFactory}
```

### JavadocReference
Cannot resolve symbol `BeanFactory`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientAutoConfiguration.java`
#### Snippet
```java
 *   <li>If {@link ClientConfiguration} bean doesn't exists following rules are applied:
 *     <ol>
 *       <li>If bean of the type {@link IgniteClientConfigurer} exists in {@link BeanFactory}
 *         it will be used to customize empty {@link ClientConfiguration} instance.
 *         If you want to set custom SPI instances or similar hardcoded values.
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientAutoConfiguration.java`
#### Snippet
```java
 *     <ol>
 *       <li>If bean of the type {@link IgniteClientConfigurer} exists in {@link BeanFactory}
 *         it will be used to customize empty {@link ClientConfiguration} instance.
 *         If you want to set custom SPI instances or similar hardcoded values.
 *         You should do it in custom {@link IgniteClientConfigurer}.</li>
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientAutoConfiguration.java`
#### Snippet
```java
 * </pre>
 *
 * @see IgniteClient
 * @see ClientConfiguration
 */
```

### JavadocReference
Cannot resolve symbol `ClientConfiguration`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientAutoConfiguration.java`
#### Snippet
```java
 *
 * @see IgniteClient
 * @see ClientConfiguration
 */
@Configuration
```

### JavadocReference
Cannot resolve symbol `IgniteClient`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/IgniteClientAutoConfiguration.java`
#### Snippet
```java

    /**
     * Starts an {@link IgniteClient}.
     *
     * @param cfg Configuration.
```

### JavadocReference
Cannot resolve symbol `ImportBeanDefinitionRegistrar`
in `modules/spring-boot-thin-client-autoconfigure-ext/spring-boot-thin-client-autoconfigure/src/main/java/org/apache/ignite/springframework/boot/autoconfigure/data/IgniteRepositoriesAutoConfigurationRegistrar.java`
#### Snippet
```java

/**
 * {@link ImportBeanDefinitionRegistrar} used to auto-configure Ignite Spring Data Repositories.
 */
public class IgniteRepositoriesAutoConfigurationRegistrar extends AbstractRepositoryConfigurationSourceSupport {
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteOsgiUtils.java`
#### Snippet
```java

    /**
     * Returns a {@link Map} of {@link Ignite} instances and the classloaders of the {@link Bundle}s they were
     * started from.
     *
```

### JavadocReference
Cannot resolve symbol `Bundle`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteOsgiUtils.java`
#### Snippet
```java

    /**
     * Returns a {@link Map} of {@link Ignite} instances and the classloaders of the {@link Bundle}s they were
     * started from.
     *
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
     * Starts the streamer.
     *
     * @throws IgniteException In cases when failed to start the streamer.
     */
    public void start() throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `Processor`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java

    /**
     * Gets the {@link Processor} used to generate the response.
     *
     * @return The {@link Processor}.
```

### JavadocReference
Cannot resolve symbol `Processor`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
     * Gets the {@link Processor} used to generate the response.
     *
     * @return The {@link Processor}.
     */
    public Processor getResponseProcessor() {
```

### JavadocReference
Cannot resolve symbol `CamelContext`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java

    /**
     * Gets the underlying {@link CamelContext}, whether created automatically by Ignite or the context specified by the
     * user.
     *
```

### JavadocReference
Cannot resolve symbol `StreamSingleTupleExtractor`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
 *
 * The only mandatory properties are {@link #endpointUri} and the appropriate stream tuple extractor (either {@link
 * StreamSingleTupleExtractor} or {@link StreamMultipleTupleExtractor}.
 *
 * The user can also provide a custom {@link CamelContext} in case they want to attach custom components, a {@link
```

### JavadocReference
Cannot resolve symbol `StreamMultipleTupleExtractor`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
 *
 * The only mandatory properties are {@link #endpointUri} and the appropriate stream tuple extractor (either {@link
 * StreamSingleTupleExtractor} or {@link StreamMultipleTupleExtractor}.
 *
 * The user can also provide a custom {@link CamelContext} in case they want to attach custom components, a {@link
```

### JavadocReference
Cannot resolve symbol `CamelContext`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
 * StreamSingleTupleExtractor} or {@link StreamMultipleTupleExtractor}.
 *
 * The user can also provide a custom {@link CamelContext} in case they want to attach custom components, a {@link
 * org.apache.camel.component.properties.PropertiesComponent}, set tracers, management strategies, etc.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.component.properties.PropertiesComponent`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
 *
 * The user can also provide a custom {@link CamelContext} in case they want to attach custom components, a {@link
 * org.apache.camel.component.properties.PropertiesComponent}, set tracers, management strategies, etc.
 *
 * @see <a href="http://camel.apache.org">Apache Camel</a>
```

### JavadocReference
Cannot resolve symbol `Processor`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
    private Consumer consumer;

    /** A {@link Processor} to generate the response. */
    private Processor resProc;

```

### JavadocReference
Cannot resolve symbol `Processor`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java

    /**
     * Sets the {@link Processor} used to generate the response.
     *
     * @param resProc The {@link Processor}.
```

### JavadocReference
Cannot resolve symbol `Processor`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
     * Sets the {@link Processor} used to generate the response.
     *
     * @param resProc The {@link Processor}.
     */
    public void setResponseProcessor(Processor resProc) {
```

### JavadocReference
Cannot resolve symbol `CamelContext`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java

    /**
     * Explicitly sets the {@link CamelContext} to use.
     *
     * Doing so gives the user the opportunity to attach custom components, a {@link
```

### JavadocReference
Cannot resolve symbol `org.apache.camel.component.properties.PropertiesComponent`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
     *
     * Doing so gives the user the opportunity to attach custom components, a {@link
     * org.apache.camel.component.properties.PropertiesComponent}, set tracers, management strategies, etc.
     *
     * @param camelCtx The Camel Context to use. In most cases, an instance of {@link DefaultCamelContext}.
```

### JavadocReference
Cannot resolve symbol `DefaultCamelContext`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
     * org.apache.camel.component.properties.PropertiesComponent}, set tracers, management strategies, etc.
     *
     * @param camelCtx The Camel Context to use. In most cases, an instance of {@link DefaultCamelContext}.
     */
    public void setCamelContext(CamelContext camelCtx) {
```

### JavadocReference
Cannot resolve symbol `Exchange`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java

    /**
     * Processes the incoming {@link Exchange} and adds the tuple(s) to the underlying streamer.
     *
     * @param exchange The Camel Exchange.
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/camel-ext/src/main/java/org/apache/ignite/stream/camel/CamelStreamer.java`
#### Snippet
```java
     * Stops the streamer.
     *
     * @throws IgniteException In cases if failed to stop the streamer.
     */
    public void stop() throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `Bundle`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/classloaders/ContainerSweepClassLoader.java`
#### Snippet
```java
    /**
     * Runs the same logic to find the class as {@link BundleDelegatingClassLoader}, but if not found, sweeps the
     * OSGi container to locate the first {@link Bundle} that can load the class, and uses it to do so.
     *
     * @param name The classname.
```

### JavadocReference
Cannot resolve symbol `Bundle`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/classloaders/ContainerSweepClassLoader.java`
#### Snippet
```java

    /**
     * Sweeps the OSGi container to find the first {@link Bundle} that can load the class.
     *
     * @param name The classname.
```

### JavadocReference
Cannot resolve symbol `Bundle`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/classloaders/ContainerSweepClassLoader.java`
#### Snippet
```java

    /**
     * Constructor with a {@link Bundle} and another {@link ClassLoader} to check.
     *
     * @param bundle The bundle.
```

### JavadocReference
Cannot resolve symbol `Bundle`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/classloaders/ContainerSweepClassLoader.java`
#### Snippet
```java

    /**
     * Constructor with a {@link Bundle} only.
     *
     * @param bundle The bundle.
```

### JavadocReference
Cannot resolve symbol `Bundle`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/classloaders/ContainerSweepClassLoader.java`
#### Snippet
```java

/**
 * A {@link ClassLoader} implementation that first attempts to load the class from the associated {@link Bundle}. As
 * a fallback, it sweeps the entire OSGi container to find the requested class, returning the first hit.
 * <p>
```

### JavadocReference
Cannot resolve symbol `Bundle`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/classloaders/BundleDelegatingClassLoader.java`
#### Snippet
```java

    /**
     * Returns the {@link Bundle} to which this ClassLoader is associated.
     *
     * @return The Bundle.
```

### JavadocReference
Cannot resolve symbol `BundleActivator`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteAbstractOsgiContextActivator.java`
#### Snippet
```java

/**
 * This {@link BundleActivator} starts Apache Ignite inside the OSGi container when the bundle is started.
 * <p>
 * Create an implementation of this class and set the {@code Bundle-Activator} OSGi Manifest header to the FQN of
```

### JavadocReference
Cannot resolve symbol `IgniteConfiguration`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteAbstractOsgiContextActivator.java`
#### Snippet
```java
 * your class.
 * <p>
 * You must provide the {@link IgniteConfiguration} to start by implementing the {@link #igniteConfiguration()}
 * abstract method. The return value of this method cannot be {@code null}. For example, if your implementation is
 * called {@code org.myorg.osgi.IgniteActivator}, your bundle must provide the following header:
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteAbstractOsgiContextActivator.java`
#### Snippet
```java
 * <p>
 * This activator also exports the Ignite instance as an OSGi service, with the property {@code ignite.name} set
 * to the value of {@link Ignite#name()}, if and only if the name is not null.
 * <p>
 * Currently, Ignite only allows a single instance per container. We may remove this limitation if enough demand
```

### JavadocReference
Cannot resolve symbol `name()`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteAbstractOsgiContextActivator.java`
#### Snippet
```java
 * <p>
 * This activator also exports the Ignite instance as an OSGi service, with the property {@code ignite.name} set
 * to the value of {@link Ignite#name()}, if and only if the name is not null.
 * <p>
 * Currently, Ignite only allows a single instance per container. We may remove this limitation if enough demand
```

### JavadocReference
Cannot resolve symbol `BundleContext`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteAbstractOsgiContextActivator.java`
#### Snippet
```java
     * The default implementation is empty. Override it to introduce custom logic.
     *
     * @param ctx The {@link BundleContext}.
     */
    protected void onBeforeStart(BundleContext ctx) {
```

### JavadocReference
Cannot resolve symbol `BundleContext`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteAbstractOsgiContextActivator.java`
#### Snippet
```java
     * The default implementation is empty. Override it to introduce custom logic.
     *
     * @param ctx The {@link BundleContext}.
     */
    protected void onBeforeStop(BundleContext ctx) {
```

### JavadocReference
Cannot resolve symbol `BundleContext`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteAbstractOsgiContextActivator.java`
#### Snippet
```java
     * The default implementation is empty. Override it to introduce custom logic.
     *
     * @param ctx The {@link BundleContext}.
     * @param t Throwable in case an error occurred when starting. {@code null} otherwise.
     */
```

### JavadocReference
Cannot resolve symbol `BundleContext`
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteAbstractOsgiContextActivator.java`
#### Snippet
```java
     * The default implementation is empty. Override it to introduce custom logic.
     *
     * @param ctx The {@link BundleContext}.
     * @param t Throwable in case an error occurred when stopping. {@code null} otherwise.
     */
```

### JavadocReference
Cannot resolve symbol `IgniteCheckedException`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateReadWriteAccessStrategy.java`
#### Snippet
```java
    /**
     * @param key Key.
     * @throws IgniteCheckedException If failed.
     */
    private void lockKey(Object key) throws IgniteCheckedException {
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/SpringSessionIgnite.java`
#### Snippet
```java

/**
 * Qualifier annotation for a {@link Ignite} to be injected in
 * {@link IgniteIndexedSessionRepository}.
 *
```

### JavadocReference
Cannot resolve symbol `SessionRepositoryFilter`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/EnableIgniteHttpSession.java`
#### Snippet
```java
/**
 * Add this annotation to an {@code @Configuration} class to expose the
 * {@link SessionRepositoryFilter} as a bean named {@code springSessionRepositoryFilter}
 * and backed by Ignite. In order to leverage the annotation, a single {@link Ignite} must
 * be provided. For example:
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/EnableIgniteHttpSession.java`
#### Snippet
```java
 * Add this annotation to an {@code @Configuration} class to expose the
 * {@link SessionRepositoryFilter} as a bean named {@code springSessionRepositoryFilter}
 * and backed by Ignite. In order to leverage the annotation, a single {@link Ignite} must
 * be provided. For example:
 *
```

### JavadocReference
Cannot resolve symbol `SaveMode`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/EnableIgniteHttpSession.java`
#### Snippet
```java

    /**
     * Save mode for the session. The default is {@link SaveMode#ON_SET_ATTRIBUTE}, which
     * only saves changes made to session.
     * @return the save mode
```

### JavadocReference
Cannot resolve symbol `ON_SET_ATTRIBUTE`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/EnableIgniteHttpSession.java`
#### Snippet
```java

    /**
     * Save mode for the session. The default is {@link SaveMode#ON_SET_ATTRIBUTE}, which
     * only saves changes made to session.
     * @return the save mode
```

### JavadocReference
Cannot resolve symbol `SessionRepository`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/EnableIgniteHttpSession.java`
#### Snippet
```java
    /**
     * Flush mode for the Ignite sessions. The default is {@code ON_SAVE} which only
     * updates the backing Ignite when {@link SessionRepository#save(Session)} is invoked.
     * In a web environment this happens just before the HTTP response is committed.
     * <p>
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/ExampleNodeStartup.java`
#### Snippet
```java
     *
     * @param args Command line arguments, none required.
     * @throws IgniteException If failed.
     */
    public static void main(String[] args) throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `save(Session)`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/EnableIgniteHttpSession.java`
#### Snippet
```java
    /**
     * Flush mode for the Ignite sessions. The default is {@code ON_SAVE} which only
     * updates the backing Ignite when {@link SessionRepository#save(Session)} is invoked.
     * In a web environment this happens just before the HTTP response is committed.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Session`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/EnableIgniteHttpSession.java`
#### Snippet
```java
    /**
     * Flush mode for the Ignite sessions. The default is {@code ON_SAVE} which only
     * updates the backing Ignite when {@link SessionRepository#save(Session)} is invoked.
     * In a web environment this happens just before the HTTP response is committed.
     * <p>
```

### JavadocReference
Cannot resolve symbol `FlushMode`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/EnableIgniteHttpSession.java`
#### Snippet
```java
     * Setting the value to {@code IMMEDIATE} will ensure that any updates to the
     * Session are immediately written to the Ignite instance.
     * @return the {@link FlushMode} to use
     */
    FlushMode flushMode() default FlushMode.ON_SAVE;
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/util/DbH2ServerStartup.java`
#### Snippet
```java
     *
     * @param args Command line arguments, none required.
     * @throws IgniteException If start H2 database TCP server failed.
     */
    public static void main(String[] args) throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `SessionRepositoryFilter`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteHttpSessionConfiguration.java`
#### Snippet
```java

/**
 * Exposes the {@link SessionRepositoryFilter} as a bean named
 * {@code springSessionRepositoryFilter}. In order to use this a single {@link Ignite}
 * must be exposed as a Bean.
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteHttpSessionConfiguration.java`
#### Snippet
```java
/**
 * Exposes the {@link SessionRepositoryFilter} as a bean named
 * {@code springSessionRepositoryFilter}. In order to use this a single {@link Ignite}
 * must be exposed as a Bean.
 */
```

### JavadocReference
Cannot resolve symbol `Binarylizable`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/model/Address.java`
#### Snippet
```java
 * Employee address.
 * <p>
 * This class implements {@link Binarylizable} only for example purposes,
 * in order to show how to customize serialization and deserialization of
 * binary objects.
```

### JavadocReference
Cannot resolve symbol `CacheStore`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/store/hibernate/CacheHibernatePersonStore.java`
#### Snippet
```java

/**
 * Example of {@link CacheStore} implementation that uses Hibernate
 * and deals with maps {@link UUID} to {@link Person}.
 */
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/store/hibernate/CacheHibernateStoreExample.java`
#### Snippet
```java
     *
     * @param args Command line arguments, none required.
     * @throws IgniteException If example execution failed.
     */
    public static void main(String[] args) throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `SessionFactory`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/hibernate/HibernateL2CacheExample.java`
#### Snippet
```java

    /**
     * Creates a new Hibernate {@link SessionFactory} using a programmatic
     * configuration.
     *
```

### JavadocReference
Cannot resolve symbol `SessionFactory`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/hibernate/HibernateL2CacheExample.java`
#### Snippet
```java
     *
     * @param hibernateCfg Hibernate configuration file.
     * @return New Hibernate {@link SessionFactory}.
     */
    private static SessionFactory createHibernateSessionFactory(URL hibernateCfg) {
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/hibernate/HibernateL2CacheExample.java`
#### Snippet
```java
     *
     * @param args Command line arguments, none required.
     * @throws IgniteException If example execution failed.
     */
    public static void main(String[] args) throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `AccessType`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/hibernate/HibernateL2CacheExample.java`
#### Snippet
```java
 * data from L2 cache.
 * <p>
 * Note: this example uses {@link AccessType#READ_ONLY} L2 cache access type, but you
 * can experiment with other access types by modifying the Hibernate configuration file
 * {@code IGNITE_HOME/examples/config/hibernate/example-hibernate-L2-cache.xml}, used by the example.
```

### JavadocReference
Cannot resolve symbol `READ_ONLY`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/hibernate/HibernateL2CacheExample.java`
#### Snippet
```java
 * data from L2 cache.
 * <p>
 * Note: this example uses {@link AccessType#READ_ONLY} L2 cache access type, but you
 * can experiment with other access types by modifying the Hibernate configuration file
 * {@code IGNITE_HOME/examples/config/hibernate/example-hibernate-L2-cache.xml}, used by the example.
```

### JavadocReference
Cannot resolve symbol `SessionFactory`
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/hibernate/HibernateL2CacheExample.java`
#### Snippet
```java
     * Prints Hibernate L2 cache statistics to standard output.
     *
     * @param sesFactory Hibernate {@link SessionFactory}, for which to print
     *                   statistics.
     */
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java
     * Starts streamer.
     *
     * @throws IgniteException If failed.
     */
    public void start() throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `MqttCallback`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Empty implementation of {@link MqttCallback#deliveryComplete(IMqttDeliveryToken)}.
     *
     * Not required by the streamer as it doesn't produce messages.
```

### JavadocReference
Cannot resolve symbol `deliveryComplete(IMqttDeliveryToken)`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Empty implementation of {@link MqttCallback#deliveryComplete(IMqttDeliveryToken)}.
     *
     * Not required by the streamer as it doesn't produce messages.
```

### JavadocReference
Cannot resolve symbol `IMqttDeliveryToken`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Empty implementation of {@link MqttCallback#deliveryComplete(IMqttDeliveryToken)}.
     *
     * Not required by the streamer as it doesn't produce messages.
```

### JavadocReference
Cannot resolve symbol `IgniteException`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java
     * Stops streamer.
     *
     * @throws IgniteException If failed.
     */
    public void stop() throws IgniteException {
```

### JavadocReference
Cannot resolve symbol `MqttCallback`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Implements the {@link MqttCallback#connectionLost(Throwable)} callback method for the MQTT client to inform the
     * streamer that the connection has been lost.
     *
```

### JavadocReference
Cannot resolve symbol `connectionLost(Throwable)`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Implements the {@link MqttCallback#connectionLost(Throwable)} callback method for the MQTT client to inform the
     * streamer that the connection has been lost.
     *
```

### JavadocReference
Cannot resolve symbol `MqttClient`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Returns whether this streamer is connected by delegating to the underlying {@link MqttClient#isConnected()}
     *
     * @return {@code true} if connected; {@code false} if not.
```

### JavadocReference
Cannot resolve symbol `isConnected()`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Returns whether this streamer is connected by delegating to the underlying {@link MqttClient#isConnected()}
     *
     * @return {@code true} if connected; {@code false} if not.
```

### JavadocReference
Cannot resolve symbol `MqttClient`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java
     *
     * @return {@code true} if connected; {@code false} if not.
     * @see MqttClient#isConnected()
     */
    public boolean isConnected() {
```

### JavadocReference
Cannot resolve symbol `isConnected()`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java
     *
     * @return {@code true} if connected; {@code false} if not.
     * @see MqttClient#isConnected()
     */
    public boolean isConnected() {
```

### JavadocReference
Cannot resolve symbol `IgniteDataStreamer`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

/**
 * Streamer that consumes from a MQTT topic and feeds key-value pairs into an {@link IgniteDataStreamer} instance,
 * using Eclipse Paho as an MQTT client.
 * <p>
```

### JavadocReference
Cannot resolve symbol `StreamSingleTupleExtractor`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java
 * using Eclipse Paho as an MQTT client.
 * <p>
 * You must also provide a {@link StreamSingleTupleExtractor} or a {@link StreamMultipleTupleExtractor} to extract
 * cache tuples out of the incoming message.
 * <p>
```

### JavadocReference
Cannot resolve symbol `StreamMultipleTupleExtractor`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java
 * using Eclipse Paho as an MQTT client.
 * <p>
 * You must also provide a {@link StreamSingleTupleExtractor} or a {@link StreamMultipleTupleExtractor} to extract
 * cache tuples out of the incoming message.
 * <p>
```

### JavadocReference
Cannot resolve symbol `MqttConnectOptions`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java
 *     <li>Subscribing to a single topic or multiple topics at once.</li>
 *     <li>Specifying the subscriber's QoS for a single topic or for multiple topics.</li>
 *     <li>Allows setting {@link MqttConnectOptions} to support features like last will testament, persistent
 *         sessions, etc.</li>
 *     <li>Specifying the client ID. A random one will be generated and maintained throughout reconnections if the user
```

### JavadocReference
Cannot resolve symbol `MqttConnectOptions`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java
 *
 * Note: features like durable subscriptions, last will testament, etc. can be configured via the
 * {@link #setConnectOptions(MqttConnectOptions)} setter.
 *
 * @see <a href="https://github.com/rholder/guava-retrying">guava-retrying library</a>
```

### JavadocReference
Cannot resolve symbol `MqttCallback`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Implements the {@link MqttCallback#messageArrived(String, MqttMessage)} to receive an MQTT message.
     *
     * {@inheritDoc}
```

### JavadocReference
Cannot resolve symbol `messageArrived(String, MqttMessage)`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Implements the {@link MqttCallback#messageArrived(String, MqttMessage)} to receive an MQTT message.
     *
     * {@inheritDoc}
```

### JavadocReference
Cannot resolve symbol `MqttMessage`
in `modules/mqtt-ext/src/main/java/org/apache/ignite/stream/mqtt/MqttStreamer.java`
#### Snippet
```java

    /**
     * Implements the {@link MqttCallback#messageArrived(String, MqttMessage)} to receive an MQTT message.
     *
     * {@inheritDoc}
```

### JavadocReference
Cannot resolve symbol `FlushMode`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java

    /**
     * Sets the flush mode. Default flush mode is {@link FlushMode#ON_SAVE}.
     * @param flushMode the new flush mode
     */
```

### JavadocReference
Cannot resolve symbol `ON_SAVE`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java

    /**
     * Sets the flush mode. Default flush mode is {@link FlushMode#ON_SAVE}.
     * @param flushMode the new flush mode
     */
```

### JavadocReference
Cannot resolve symbol `MapSession`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
    /**
     * If non-null, this value is used to override
     * {@link MapSession#setMaxInactiveInterval(Duration)}.
     */
    private Integer defaultMaxInactiveInterval;
```

### JavadocReference
Cannot resolve symbol `setMaxInactiveInterval(Duration)`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
    /**
     * If non-null, this value is used to override
     * {@link MapSession#setMaxInactiveInterval(Duration)}.
     */
    private Integer defaultMaxInactiveInterval;
```

### JavadocReference
Cannot resolve symbol `ApplicationEventPublisher`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java

    /**
     * Sets the {@link ApplicationEventPublisher} that is used to publish
     * {@link AbstractSessionEvent session events}. The default is to not publish session
     * events.
```

### JavadocReference
Cannot resolve symbol `AbstractSessionEvent`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
    /**
     * Sets the {@link ApplicationEventPublisher} that is used to publish
     * {@link AbstractSessionEvent session events}. The default is to not publish session
     * events.
     * @param applicationEventPublisher the {@link ApplicationEventPublisher} that is used
```

### JavadocReference
Cannot resolve symbol `ApplicationEventPublisher`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
     * {@link AbstractSessionEvent session events}. The default is to not publish session
     * events.
     * @param applicationEventPublisher the {@link ApplicationEventPublisher} that is used
     * to publish session events. Cannot be null.
     */
```

### JavadocReference
Cannot resolve symbol `org.springframework.session.SessionRepository`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java

/**
 * A {@link org.springframework.session.SessionRepository} implementation that stores
 * sessions in Apache Ignite distributed {@link IgniteCache}.
 *
```

### JavadocReference
Cannot resolve symbol `IgniteCache`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
/**
 * A {@link org.springframework.session.SessionRepository} implementation that stores
 * sessions in Apache Ignite distributed {@link IgniteCache}.
 *
 * <p>
```

### JavadocReference
Cannot resolve symbol `IgniteCache`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
 * In order to support finding sessions by principal name using
 * {@link #findByIndexNameAndIndexValue(String, String)} method, custom configuration of
 * {@link IgniteCache} supplied to this implementation is required.
 *
 * This implementation listens for events on the Ignite-backed SessionRepository and
```

### JavadocReference
Cannot resolve symbol `ApplicationEventPublisher`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
 * This implementation listens for events on the Ignite-backed SessionRepository and
 * translates those events into the corresponding Spring Session events. Publish the
 * Spring Session events with the given {@link ApplicationEventPublisher}.
 *
 * <ul>
```

### JavadocReference
Cannot resolve symbol `SessionCreatedEvent`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
 *
 * <ul>
 * <li>entryAdded - {@link SessionCreatedEvent}</li>
 * <li>entryEvicted - {@link SessionExpiredEvent}</li>
 * <li>entryRemoved - {@link SessionDeletedEvent}</li>
```

### JavadocReference
Cannot resolve symbol `SessionExpiredEvent`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
 * <ul>
 * <li>entryAdded - {@link SessionCreatedEvent}</li>
 * <li>entryEvicted - {@link SessionExpiredEvent}</li>
 * <li>entryRemoved - {@link SessionDeletedEvent}</li>
 * </ul>
```

### JavadocReference
Cannot resolve symbol `SessionDeletedEvent`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
 * <li>entryAdded - {@link SessionCreatedEvent}</li>
 * <li>entryEvicted - {@link SessionExpiredEvent}</li>
 * <li>entryRemoved - {@link SessionDeletedEvent}</li>
 * </ul>
 *
```

### JavadocReference
Cannot resolve symbol `Ignite`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
    /**
     * Create a new {@link IgniteIndexedSessionRepository} instance.
     * @param ignite the {@link Ignite} instance to use for managing sessions
     */
    public IgniteIndexedSessionRepository(Ignite ignite) {
```

### JavadocReference
Cannot resolve symbol `Session`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java

    /**
     * A custom implementation of {@link Session} that uses a {@link MapSession} as the
     * basis for its mapping. It keeps track if changes have been made since last save.
     */
```

### JavadocReference
Cannot resolve symbol `MapSession`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java

    /**
     * A custom implementation of {@link Session} that uses a {@link MapSession} as the
     * basis for its mapping. It keeps track if changes have been made since last save.
     */
```

### JavadocReference
Cannot resolve symbol `IndexResolver`
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java

    /**
     * Set the {@link IndexResolver} to use.
     * @param indexResolver the index resolver
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.compute.ComputeTask`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifySetToValue.java`
#### Snippet
```java
 * addition is to provide very simple and easy to use real ForkJoin gridification
 * for some often used use cases. Note that in a standard {@code Gridify} annotation
 * the user has to write {@link org.apache.ignite.compute.ComputeTask} to provide ForkJoin behavior.
 * In a proposed design - the ForkJoin will be achieved automatically.
 * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.Ignition`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifySetToValue.java`
#### Snippet
```java
    /**
     * @return Name of the grid to use. By default, no-name default grid is used.
     * Refer to {@link org.apache.ignite.Ignition} for information about named grids.
     * @deprecated Use {@link #igniteInstanceName()}. Nonempty {@link #igniteInstanceName()} takes precedence.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.ignite.Ignition`
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifySetToValue.java`
#### Snippet
```java
    /**
     * @return Name of the Ignite instance to use. By default, no-name default Ignite instance is used.
     * Refer to {@link org.apache.ignite.Ignition} for information about named Ignite instances.
     */
    String igniteInstanceName() default "";
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `args` might be null
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/PerformanceStatisticsPrinter.java`
#### Snippet
```java
        Parameters params = new Parameters();

        Iterator<String> iter = Arrays.asList(args).iterator();

        params.statFileOrDir = iter.next();
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/PerformanceStatisticsPrinter.java`
#### Snippet
```java
                    A.ensure(opType != null, "Unknown operation type [op=" + op + ']');

                    params.ops.set(opType.id());
                }
            }
```

### DataFlowIssue
Dereference of `null` will produce `NullPointerException`
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/resource/IgniteProvider.java`
#### Snippet
```java

        if (code != 200)
            throw null;

        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
```

### DataFlowIssue
Argument `GridifyUtils.parameterToCollection(element)` might be null
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToSetAbstractAspect.java`
#### Snippet
```java

        for (Object element : taskRes)
            res.addAll(GridifyUtils.parameterToCollection(element));

        return GridifyUtils.collectionToParameter(cls, res);
```

### DataFlowIssue
Argument `res` might be null
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToValueAbstractAspect.java`
#### Snippet
```java

            if (taskArg == null)
                return result(res);
            else if (taskArg.getInputSize() != UNKNOWN_SIZE && taskArg.getInputSize() <= threshold) {
                // Note, that we can't cancel by timeout locally started method.
```

### DataFlowIssue
Condition `e.getTargetException() instanceof IgniteException` is redundant and can be replaced with a null check
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyJobAdapter.java`
#### Snippet
```java
        }
        catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof IgniteException)
                throw (IgniteException)e.getTargetException();

```

### DataFlowIssue
Method invocation `host` may produce `NullPointerException`
in `modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
        }
        catch (IgniteInterruptedCheckedException e) {
            return new ClusterStartNodeResultImpl(spec.host(), false, e.getMessage());
        }
        catch (Exception e) {
```

### DataFlowIssue
Method invocation `xid` may produce `NullPointerException`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStore.java`
#### Snippet
```java

                    if (log.isDebugEnabled())
                        log.debug("Transaction ended [xid=" + tx.xid() + ", commit=" + commit + ']');
                }
                catch (HibernateException e) {
```

### DataFlowIssue
Method invocation `xid` may produce `NullPointerException`
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStore.java`
#### Snippet
```java
                }
                catch (HibernateException e) {
                    throw new CacheWriterException("Failed to end transaction [xid=" + tx.xid() +
                        ", commit=" + commit + ']', e);
                }
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/IgniteZeroMqStreamer.java`
#### Snippet
```java
        this.addr = addr;
        this.topic = topic;
        this.socketType = socketType.getType();
    }

```

## RuleId[id=SortedCollectionWithNonComparableKeys]
### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteRepositoryImpl.java`
#### Snippet
```java
            return cache.getAll(new HashSet<>((Collection<K>)ids)).values();

        TreeSet<K> keys = new TreeSet<>();

        for (K id : ids)
```

### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteRepositoryImpl.java`
#### Snippet
```java
        }

        TreeSet<K> keys = new TreeSet<>();

        for (K id : ids)
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `topics`
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSourceTask.java`
#### Snippet
```java

    /** Topic. */
    private static String topics[];

    /** Offset. */
```

### CStyleArrayDeclaration
C-style array declaration of local variable `tokens`
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/IgniteYarnClient.java`
#### Snippet
```java
            log.info("Found RM principal: " + tokRenewer);

            final Token<?> tokens[] = fs.addDelegationTokens(tokRenewer, creds);

            if (tokens != null)
```

### CStyleArrayDeclaration
C-style array declaration of parameter `args`
in `modules/spark-ext/examples/src/main/java/org/apache/ignite/examples/spark/JavaIgniteDataFrameExample.java`
#### Snippet
```java

    /** @param args Command line arguments. */
    public static void main(String args[]) {

        setupServerAndData();
```

### CStyleArrayDeclaration
C-style array declaration of parameter `args`
in `modules/spark-ext/examples/src/main/java/org/apache/ignite/examples/spark/SharedRDDExample.java`
#### Snippet
```java
     * @param args Command line arguments, none required.
     */
    public static void main(String args[]) {
        // Spark Configuration.
        SparkConf sparkConf = new SparkConf()
```

### CStyleArrayDeclaration
C-style array declaration of parameter `args`
in `modules/spark-ext/examples/src/main/java/org/apache/ignite/examples/spark/JavaIgniteDataFrameWriteExample.java`
#### Snippet
```java

    /** @param args Command line arguments. */
    public static void main(String args[]) {
        //Starting Ignite.
        Ignite ignite = Ignition.start(CONFIG);
```

### CStyleArrayDeclaration
C-style array declaration of parameter `args`
in `modules/spark-ext/examples/src/main/java/org/apache/ignite/examples/spark/JavaIgniteCatalogExample.java`
#### Snippet
```java

    /** @param args Command line arguments. */
    public static void main(String args[]) throws AnalysisException {

        setupServerAndData();
```

### CStyleArrayDeclaration
C-style array declaration of parameter `args`
in `modules/spark-ext/examples/src/main/java/org/apache/ignite/examples/spark/JavaIgniteDataFrameJoinExample.java`
#### Snippet
```java

    /** @param args Command line arguments. */
    public static void main(String args[]) {

        setupServerAndData();
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'gridName' is still used
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/Gridify.java`
#### Snippet
```java
     */
    @Deprecated
    String gridName() default "";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'gridName' is still used
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifySetToSet.java`
#### Snippet
```java
     */
    @Deprecated
    String gridName() default "";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getContainers' is still used
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/ApplicationMaster.java`
#### Snippet
```java
     */
    @Deprecated
    public Map<ContainerId, IgniteContainer> getContainers() {
        return containers;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'gridName' is still used
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/GridifySetToValue.java`
#### Snippet
```java
     */
    @Deprecated
    String gridName() default "";

    /**
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\#` in RegExp
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java
    /** */
    private static final Pattern NAMED_PARAMETER = Pattern.compile(
        COLON_NO_DOUBLE_COLON + IDENTIFIER + "|\\#" + IDENTIFIER, CASE_INSENSITIVE);

    /** */
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/IgniteScheduler.java`
#### Snippet
```java
            + "./*/bin/ignite.sh "
            + cfgName
            + " -J-Xmx" + String.valueOf((int)igniteTask.mem() + "m")
            + " -J-Xms" + String.valueOf((int)igniteTask.mem()) + "m");

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/IgniteScheduler.java`
#### Snippet
```java
            + cfgName
            + " -J-Xmx" + String.valueOf((int)igniteTask.mem() + "m")
            + " -J-Xms" + String.valueOf((int)igniteTask.mem()) + "m");

        return Protos.TaskInfo.newBuilder()
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                            http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                            http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
                            http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve property 'joinTimeout'
in `modules/yarn-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
                </property>

                <property name="joinTimeout" value="60000"/>
            </bean>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve property 'peerClassLoadingEnabled'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>

        <!-- Enable task execution events for examples. -->
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java

        <!-- Enable task execution events for examples. -->
        <property name="includeEventTypes">
            <list>
                <!--Task execution events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_STARTED'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FINISHED'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FAILED'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_TIMEDOUT'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_SESSION_ATTR_SET'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_REDUCED'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_READ'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_REMOVED'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve property 'igniteInstanceName'
in `modules/spring-data-ext/examples/src/main/resources/example-spring-data.xml`
#### Snippet
```java

    <bean parent="ignite.cfg">
        <property name="igniteInstanceName" value="springDataNode" />

        <property name="cacheConfiguration">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/spring-data-ext/examples/src/main/resources/example-spring-data.xml`
#### Snippet
```java
        <property name="igniteInstanceName" value="springDataNode" />

        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
                        Ignite provides several options for automatic discovery that can be used
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/spring-data-ext/examples/src/main/resources/example-spring-data.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <!--
                        Apache Ignite uses an IgniteRepository extension which inherits from Spring Data's CrudRepository.
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/spring-data-ext/examples/src/main/resources/example-spring-data.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <!--
                        Apache Ignite uses an IgniteRepository extension which inherits from Spring Data's CrudRepository.
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/spring-data-ext/examples/src/main/resources/example-spring-data.xml`
#### Snippet
```java
                        maps the PersonRepository to an Ignite's cache named "PersonCache".
                    -->
                    <property name="name" value="PersonCache"/>
                    <property name="indexedTypes">
                        <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'indexedTypes'
in `modules/spring-data-ext/examples/src/main/resources/example-spring-data.xml`
#### Snippet
```java
                    -->
                    <property name="name" value="PersonCache"/>
                    <property name="indexedTypes">
                        <list>
                            <value>java.lang.Long</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'multicast'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryMulticastIpFinder'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/geospatial-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
                                <!-- In distributed environment, replace with actual host IP address. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve property 'peerClassLoadingEnabled'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>

        <!-- Enable task execution events for examples. -->
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java

        <!-- Enable task execution events for examples. -->
        <property name="includeEventTypes">
            <list>
                <!--Task execution events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_STARTED'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FINISHED'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FAILED'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_TIMEDOUT'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_SESSION_ATTR_SET'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_REDUCED'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_READ'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_REMOVED'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
                        Ignite provides several options for automatic discovery that can be used
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'multicast'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryMulticastIpFinder'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/spring-data-ext/examples/src/main/resources/example-default.xml`
#### Snippet
```java
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
                                <!-- In distributed environment, replace with actual host IP address. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="cacheConfiguration">
            <!-- SharedRDD cache example configuration (Atomic mode). -->
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="cacheConfiguration">
            <!-- SharedRDD cache example configuration (Atomic mode). -->
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="cacheConfiguration">
            <!-- SharedRDD cache example configuration (Atomic mode). -->
            <bean class="org.apache.ignite.configuration.CacheConfiguration">
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <!-- SharedRDD cache example configuration (Atomic mode). -->
            <bean class="org.apache.ignite.configuration.CacheConfiguration">
                <!-- Set a cache name. -->
                <property name="name" value="sharedRDD"/>
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <!-- SharedRDD cache example configuration (Atomic mode). -->
            <bean class="org.apache.ignite.configuration.CacheConfiguration">
                <!-- Set a cache name. -->
                <property name="name" value="sharedRDD"/>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.configuration.CacheConfiguration">
                <!-- Set a cache name. -->
                <property name="name" value="sharedRDD"/>
                <!-- Set a cache mode. -->
                <property name="cacheMode" value="PARTITIONED"/>
```

### SpringXmlModelInspection
Cannot resolve property 'cacheMode'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                <property name="name" value="sharedRDD"/>
                <!-- Set a cache mode. -->
                <property name="cacheMode" value="PARTITIONED"/>
                <!-- Index Integer pairs used in the example. -->
                <property name="indexedTypes">
```

### SpringXmlModelInspection
Cannot resolve property 'indexedTypes'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                <property name="cacheMode" value="PARTITIONED"/>
                <!-- Index Integer pairs used in the example. -->
                <property name="indexedTypes">
                    <list>
                        <value>java.lang.Integer</value>
```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                </property>
                <!-- Set atomicity mode. -->
                <property name="atomicityMode" value="ATOMIC"/>
                <!-- Configure a number of backups. -->
                <property name="backups" value="1"/>
```

### SpringXmlModelInspection
Cannot resolve property 'backups'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                <property name="atomicityMode" value="ATOMIC"/>
                <!-- Configure a number of backups. -->
                <property name="backups" value="1"/>
            </bean>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
                        Ignite provides several options for automatic discovery that can be used
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'multicast'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryMulticastIpFinder'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/spark-ext/examples/src/main/resources/config/spark/example-shared-rdd.xml`
#### Snippet
```java
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
                                <!-- In distributed environment, replace with actual host IP address. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                            http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                            http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
                            http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
    <bean class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder"/>
                </property>

```

### SpringXmlModelInspection
Cannot resolve property 'joinTimeout'
in `modules/mesos-ext/src/main/resources/ignite-default-config.xml`
#### Snippet
```java
                </property>

                <property name="joinTimeout" value="60000"/>
            </bean>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve property 'peerClassLoadingEnabled'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>

        <!-- Enable task execution events for examples. -->
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java

        <!-- Enable task execution events for examples. -->
        <property name="includeEventTypes">
            <list>
                <!--Task execution events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_STARTED'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FINISHED'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FAILED'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_TIMEDOUT'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_SESSION_ATTR_SET'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_REDUCED'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_READ'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_REMOVED'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
                        Ignite provides several options for automatic discovery that can be used
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'multicast'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryMulticastIpFinder'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/hibernate-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
                                <!-- In distributed environment, replace with actual host IP address. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `config/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ignite'
in `config/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `config/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `config/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve property 'clientMode'
in `config/example-ignite.xml`
#### Snippet
```java
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>

        <!-- Cache accessed from IgniteSink. -->
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `config/example-ignite.xml`
#### Snippet
```java

        <!-- Cache accessed from IgniteSink. -->
        <property name="cacheConfiguration">
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ignite'
in `config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `config/example-ignite.xml`
#### Snippet
```java
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
                </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `config/example-ignite.xml`
#### Snippet
```java
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
                </bean>
            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `config/example-ignite.xml`
#### Snippet
```java

        <!-- Enable cache events. -->
        <property name="includeEventTypes">
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ignite'
in `config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'ignite'
in `config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_READ'
in `config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ignite'
in `config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_REMOVED'
in `config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `config/example-ignite.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'ignite'
in `config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `config/example-ignite.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ignite'
in `config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `config/example-ignite.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500..47509</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve property 'clientMode'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>

        <!-- Cache accessed from IgniteSink. -->
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java

        <!-- Cache accessed from IgniteSink. -->
        <property name="cacheConfiguration">
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
                </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
                </bean>
            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java

        <!-- Enable cache events. -->
        <property name="includeEventTypes">
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_READ'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_REMOVED'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/flink-ext/config/example-ignite.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500..47509</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable peer class loading for remote events. -->
        <property name="peerClassLoadingEnabled" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable peer class loading for remote events. -->
        <property name="peerClassLoadingEnabled" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve property 'peerClassLoadingEnabled'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable peer class loading for remote events. -->
        <property name="peerClassLoadingEnabled" value="false"/>
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve property 'clientMode'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <property name="peerClassLoadingEnabled" value="false"/>
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>

        <!-- Cache accessed from IgniteSink. -->
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Cache accessed from IgniteSink. -->
        <property name="cacheConfiguration">
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                    <property name="atomicityMode" value="ATOMIC"/>

                    <property name="name" value="testCache"/>
                </bean>
            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Enable cache events. -->
        <property name="includeEventTypes">
            <list>
                <!-- Cache events. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events. -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events. -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events. -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/kafka-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500..47509</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve property 'clientMode'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>

        <!-- Cache accessed from IgniteSink. -->
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Cache accessed from IgniteSink. -->
        <property name="cacheConfiguration">
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                    <property name="atomicityMode" value="ATOMIC"/>

                    <property name="name" value="testCache"/>
                </bean>
            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Enable cache events. -->
        <property name="includeEventTypes">
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/flume-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="localHost" value="127.0.0.1"/>

```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="localHost" value="127.0.0.1"/>

```

### SpringXmlModelInspection
Cannot resolve property 'localHost'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="localHost" value="127.0.0.1"/>

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500</value>
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        </property>

        <property name="cacheConfiguration">
            <array>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <array>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <array>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
```

### SpringXmlModelInspection
Cannot resolve property 'backups'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
            <array>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
                    <property name="name" value="cache1" />
```

### SpringXmlModelInspection
Cannot resolve property 'sqlSchema'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
                    <property name="name" value="cache1" />
                </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
                    <property name="name" value="cache1" />
                </bean>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
                    <property name="name" value="cache1" />
                </bean>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
                    <property name="name" value="cache1" />
                </bean>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
```

### SpringXmlModelInspection
Cannot resolve property 'backups'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
                </bean>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
                    <property name="name" value="cache2" />
```

### SpringXmlModelInspection
Cannot resolve property 'sqlSchema'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
                    <property name="name" value="cache2" />
                </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/spark-ext/spark/src/test/resources/ignite-spark-config.xml`
#### Snippet
```java
                    <property name="backups" value="1" />
                    <property name="sqlSchema" value="PUBLIC" />
                    <property name="name" value="cache2" />
                </bean>
            </array>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve property 'peerClassLoadingEnabled'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>

        <!-- Enable task execution events for examples. -->
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java

        <!-- Enable task execution events for examples. -->
        <property name="includeEventTypes">
            <list>
                <!--Task execution events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_STARTED'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FINISHED'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FAILED'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve property 'clientMode'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>

        <!-- Cache accessed from IgniteSink. -->
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_TIMEDOUT'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Cache accessed from IgniteSink. -->
        <property name="cacheConfiguration">
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_SESSION_ATTR_SET'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_REDUCED'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_READ'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_REMOVED'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
                        Ignite provides several options for automatic discovery that can be used
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'multicast'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                    <property name="atomicityMode" value="ATOMIC"/>

                    <property name="name" value="testCache"/>
                </bean>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryMulticastIpFinder'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Enable cache events. -->
        <property name="includeEventTypes">
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/spark-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
                                <!-- In distributed environment, replace with actual host IP address. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/storm-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable peer class loading for remote events. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable peer class loading for remote events. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve property 'peerClassLoadingEnabled'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable peer class loading for remote events. -->
        <property name="peerClassLoadingEnabled" value="true"/>
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve property 'clientMode'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <property name="peerClassLoadingEnabled" value="true"/>
        <!-- Enable client mode. -->
        <property name="clientMode" value="true"/>

        <!-- Cache accessed from IgniteSink. -->
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Cache accessed from IgniteSink. -->
        <property name="cacheConfiguration">
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>

                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                    <property name="atomicityMode" value="ATOMIC"/>

                    <property name="name" value="testCache"/>
                </bean>
            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Enable cache events. -->
        <property name="includeEventTypes">
            <list>
                <!-- Cache events. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events. -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events. -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events. -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/pub-sub-ext/src/test/resources/example-ignite.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>
```

### SpringXmlModelInspection
Cannot resolve property 'clientMode'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Enable client mode. -->
        <property name="clientMode" value="false"/>

        <!-- Cache accessed from IgniteSink. -->
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java

        <!-- Cache accessed from IgniteSink. -->
        <property name="cacheConfiguration">
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
                <!-- Partitioned cache example configuration with configurations adjusted to server nodes'. -->
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
                </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="name" value="testCache"/>
                </bean>
            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java

        <!-- Enable cache events. -->
        <property name="includeEventTypes">
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <list>
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_READ'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
                <!-- Cache events (only EVT_CACHE_OBJECT_PUT for tests). -->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_REMOVED'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>

            </list>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/pub-sub-ext/config/example-ignite.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500..47509</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
          class="org.apache.ignite.cache.store.hibernate.CacheHibernateStoreFactorySelfTest$DummySessionFactory"/>

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="igniteInstanceName" value="ignite1"/>

```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
          class="org.apache.ignite.cache.store.hibernate.CacheHibernateStoreFactorySelfTest$DummySessionFactory"/>

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="igniteInstanceName" value="ignite1"/>

```

### SpringXmlModelInspection
Cannot resolve property 'igniteInstanceName'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="igniteInstanceName" value="ignite1"/>

        <property name="cacheConfiguration">
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
        <property name="igniteInstanceName" value="ignite1"/>

        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
                    <property name="cacheStoreFactory">
```

### SpringXmlModelInspection
Cannot resolve property 'backups'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
                    <property name="cacheStoreFactory">
                        <bean class="org.apache.ignite.cache.store.hibernate.CacheHibernateBlobStoreFactory">
```

### SpringXmlModelInspection
Cannot resolve property 'cacheStoreFactory'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
                    <property name="cacheStoreFactory">
                        <bean class="org.apache.ignite.cache.store.hibernate.CacheHibernateBlobStoreFactory">
                            <property name="sessionFactoryBean" value = "simpleSessionFactory1"/>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache1.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500..47509</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util.xsd">
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>
```

### SpringXmlModelInspection
Cannot resolve property 'peerClassLoadingEnabled'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
    <bean abstract="true" id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <!-- Set to true to enable distributed class loading for examples, default is false. -->
        <property name="peerClassLoadingEnabled" value="true"/>

        <!-- Enable task execution events for examples. -->
```

### SpringXmlModelInspection
Cannot resolve property 'includeEventTypes'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java

        <!-- Enable task execution events for examples. -->
        <property name="includeEventTypes">
            <list>
                <!--Task execution events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_STARTED'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
            <list>
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FINISHED'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Task execution events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_FAILED'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_STARTED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_TIMEDOUT'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FINISHED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_SESSION_ATTR_SET'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_FAILED"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_TASK_REDUCED'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_TIMEDOUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_SESSION_ATTR_SET"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_TASK_REDUCED"/>

                <!--Cache events-->
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_PUT'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java

                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_READ'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <!--Cache events-->
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'events'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'EventType'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class 'EVT_CACHE_OBJECT_REMOVED'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_PUT"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_READ"/>
                <util:constant static-field="org.apache.ignite.events.EventType.EVT_CACHE_OBJECT_REMOVED"/>
            </list>
        </property>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <!--
                        Ignite provides several options for automatic discovery that can be used
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'multicast'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryMulticastIpFinder'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!-- Uncomment static IP finder to enable static-based discovery of initial nodes. -->
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/spring-tx-ext/examples/config/example-default.xml`
#### Snippet
```java
                    <!--<bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">-->
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder">
                        <property name="addresses">
                            <list>
                                <!-- In distributed environment, replace with actual host IP address. -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="failureHandler">
            <bean class="org.apache.ignite.failure.NoOpFailureHandler"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="failureHandler">
            <bean class="org.apache.ignite.failure.NoOpFailureHandler"/>
```

### SpringXmlModelInspection
Cannot resolve property 'failureHandler'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="failureHandler">
            <bean class="org.apache.ignite.failure.NoOpFailureHandler"/>
        </property>
```

### SpringXmlModelInspection
Cannot resolve class or package 'failure'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="failureHandler">
            <bean class="org.apache.ignite.failure.NoOpFailureHandler"/>
        </property>

```

### SpringXmlModelInspection
Cannot resolve class 'NoOpFailureHandler'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="failureHandler">
            <bean class="org.apache.ignite.failure.NoOpFailureHandler"/>
        </property>

```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        </property>

        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
                    <property name="cacheStoreFactory">
```

### SpringXmlModelInspection
Cannot resolve property 'backups'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
                    <property name="cacheStoreFactory">
                        <bean class="org.apache.ignite.cache.store.hibernate.CacheHibernateBlobStoreFactory">
```

### SpringXmlModelInspection
Cannot resolve property 'cacheStoreFactory'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
                    <property name="cacheStoreFactory">
                        <bean class="org.apache.ignite.cache.store.hibernate.CacheHibernateBlobStoreFactory">
                            <property name="sessionFactoryBean" value = "simpleSessionFactory1"/>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/hibernate-ext/hibernate/src/test/config/factory-incorrect-store-cache.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500..47509</value>
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
          class="org.apache.ignite.cache.store.hibernate.CacheHibernateStoreFactorySelfTest$DummySessionFactoryExt"/>

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="cacheConfiguration">
            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'IgniteConfiguration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
          class="org.apache.ignite.cache.store.hibernate.CacheHibernateStoreFactorySelfTest$DummySessionFactoryExt"/>

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="cacheConfiguration">
            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'cacheConfiguration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java

    <bean id="ignite.cfg" class="org.apache.ignite.configuration.IgniteConfiguration">
        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
```

### SpringXmlModelInspection
Cannot resolve class or package 'configuration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
```

### SpringXmlModelInspection
Cannot resolve class 'CacheConfiguration'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
        <property name="cacheConfiguration">
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
```

### SpringXmlModelInspection
Cannot resolve property 'name'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
            <list>
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
```

### SpringXmlModelInspection
Cannot resolve property 'atomicityMode'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
                <bean class="org.apache.ignite.configuration.CacheConfiguration">
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
                    <property name="cacheStoreFactory">
```

### SpringXmlModelInspection
Cannot resolve property 'backups'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
                    <property name="name" value="test"/>
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
                    <property name="cacheStoreFactory">
                        <bean class="org.apache.ignite.cache.store.hibernate.CacheHibernateBlobStoreFactory">
```

### SpringXmlModelInspection
Cannot resolve property 'cacheStoreFactory'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
                    <property name="atomicityMode" value="ATOMIC"/>
                    <property name="backups" value="1"/>
                    <property name="cacheStoreFactory">
                        <bean class="org.apache.ignite.cache.store.hibernate.CacheHibernateBlobStoreFactory">
                            <property name="sessionFactoryBean" value = "simpleSessionFactory"/>
```

### SpringXmlModelInspection
Cannot resolve property 'discoverySpi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java

        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoverySpi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
        <!-- Explicitly configure TCP discovery SPI to provide list of initial nodes. -->
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
```

### SpringXmlModelInspection
Cannot resolve property 'ipFinder'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
        <property name="discoverySpi">
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
```

### SpringXmlModelInspection
Cannot resolve class or package 'spi'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'discovery'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'tcp'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ipfinder'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class or package 'vm'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve class 'TcpDiscoveryVmIpFinder'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
            <bean class="org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi">
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
```

### SpringXmlModelInspection
Cannot resolve property 'addresses'
in `modules/hibernate-ext/hibernate/src/test/config/factory-cache.xml`
#### Snippet
```java
                <property name="ipFinder">
                    <bean class="org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder">
                        <property name="addresses">
                            <list>
                                <value>127.0.0.1:47500..47509</value>
```

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite-client.addresses'
in `modules/spring-boot-thin-client-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java

ignite-client:
  addresses: 127.0.0.1:10800
  timeout: 10000
  tcpNoDelay: false
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite-client.timeout'
in `modules/spring-boot-thin-client-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
ignite-client:
  addresses: 127.0.0.1:10800
  timeout: 10000
  tcpNoDelay: false

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite-client.tcpNoDelay'
in `modules/spring-boot-thin-client-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
  addresses: 127.0.0.1:10800
  timeout: 10000
  tcpNoDelay: false

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.igniteInstanceName'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java

ignite:
  igniteInstanceName: properties-instance-name
  communicationSpi:
    localPort: 5555
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.communicationSpi.localPort'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
  igniteInstanceName: properties-instance-name
  communicationSpi:
    localPort: 5555
  dataStorageConfiguration:
    defaultDataRegionConfiguration:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.dataStorageConfiguration.defaultDataRegionConfiguration.initialSize'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
  dataStorageConfiguration:
    defaultDataRegionConfiguration:
      initialSize: 10485760 #10MB
    dataRegionConfigurations:
      - name: my-dataregion
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.dataStorageConfiguration.dataRegionConfigurations'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
    defaultDataRegionConfiguration:
      initialSize: 10485760 #10MB
    dataRegionConfigurations:
      - name: my-dataregion
        initialSize: 104857600 #100MB
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.dataStorageConfiguration.dataRegionConfigurations\[0\].name'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
      initialSize: 10485760 #10MB
    dataRegionConfigurations:
      - name: my-dataregion
        initialSize: 104857600 #100MB
  cacheConfiguration:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.dataStorageConfiguration.dataRegionConfigurations\[0\].initialSize'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
    dataRegionConfigurations:
      - name: my-dataregion
        initialSize: 104857600 #100MB
  cacheConfiguration:
    - name: accounts
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
      - name: my-dataregion
        initialSize: 104857600 #100MB
  cacheConfiguration:
    - name: accounts
      queryEntities:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[0\].name'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
        initialSize: 104857600 #100MB
  cacheConfiguration:
    - name: accounts
      queryEntities:
      - tableName: ACCOUNTS
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[0\].queryEntities'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
  cacheConfiguration:
    - name: accounts
      queryEntities:
      - tableName: ACCOUNTS
        keyFieldName: ID
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[0\].queryEntities\[0\].tableName'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
    - name: accounts
      queryEntities:
      - tableName: ACCOUNTS
        keyFieldName: ID
        keyType: java.lang.Long
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[0\].queryEntities\[0\].keyFieldName'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
      queryEntities:
      - tableName: ACCOUNTS
        keyFieldName: ID
        keyType: java.lang.Long
        valueType: java.lang.Object
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[0\].queryEntities\[0\].keyType'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
      - tableName: ACCOUNTS
        keyFieldName: ID
        keyType: java.lang.Long
        valueType: java.lang.Object
        fields:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[0\].queryEntities\[0\].valueType'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
        keyFieldName: ID
        keyType: java.lang.Long
        valueType: java.lang.Object
        fields:
          ID: java.lang.Long
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[0\].queryEntities\[0\].fields.ID'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
        valueType: java.lang.Object
        fields:
          ID: java.lang.Long
          amount: java.lang.Double
          updateDate: java.util.Date
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[0\].queryEntities\[0\].fields.amount'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
        fields:
          ID: java.lang.Long
          amount: java.lang.Double
          updateDate: java.util.Date
    - name: my-cache2
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[0\].queryEntities\[0\].fields.updateDate'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
          ID: java.lang.Long
          amount: java.lang.Double
          updateDate: java.util.Date
    - name: my-cache2

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'ignite.cacheConfiguration\[1\].name'
in `modules/spring-boot-autoconfigure-ext/examples/src/main/resources/application.yml`
#### Snippet
```java
          amount: java.lang.Double
          updateDate: java.util.Date
    - name: my-cache2


```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `type` in enum 'ZeroMqTypeSocket'
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/ZeroMqTypeSocket.java`
#### Snippet
```java

    /** Socket type. */
    private int type;

    /**
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteRepositoryQuery.java`
#### Snippet
```java
            int pageSize = -1;

            switch (qry.options()) {
                case PAGINATION:
                    pageSize = ((Pageable)parameters[parameters.length - 1]).getPageSize();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifySetToSetAbstractAspect.java`
#### Snippet
```java
Class<?>[] paramTypes = mtd.getParameterTypes();

        Collection<Integer> allowedParamIdxs = new LinkedList<>();

        for (int i = 0; i < paramTypes.length; i++) {
            Class<?> paramType = paramTypes[i];

            if (GridifyUtils.isMethodParameterTypeAllowed(paramType))
                allowedParamIdxs.add(i);
        }

        if (allowedParamIdxs.isEmpty()) {
            throw new IgniteCheckedException("Invalid method signature. Failed to get valid method parameter types " +
                "[mtdName=" + mtd.getName() + ", allowedTypes=" + GridifyUtils.getAllowedMethodParameterTypes() + ']');
        }

        List<Integer> annParamIdxs = new LinkedList<>();

        for (int i = 0; i < paramTypes.length; i++) {
            Class<?> paramType = paramTypes[i];

            if (GridifyUtils.isMethodParameterTypeAnnotated(paramType.getDeclaredAnnotations()))
                annParamIdxs.add(i);
        }

        if (annParamIdxs.size() > 1) {
            throw new IgniteCheckedException("Invalid method signature. Only one method parameter can may annotated with @" +
                GridifyInput.class.getSimpleName() +
                "[mtdName=" + mtd.getName() + ", allowedTypes=" + GridifyUtils.getAllowedMethodParameterTypes() +
                ", annParamIdxs=" + annParamIdxs + ']');
        }

        if (allowedParamIdxs.size() > 1 && annParamIdxs.isEmpty()) {
            throw new IgniteCheckedException("Invalid method signature. Method parameter must be annotated with @" +
                GridifyInput.class.getSimpleName() +
                "[mtdName=" + mtd.getName() + ", allowedTypes=" + GridifyUtils.getAllowedMethodParameterTypes() +
                ", allowedParamIdxs=" + allowedParamIdxs + ']');
        }

        if (!annParamIdxs.isEmpty() && !allowedParamIdxs.contains(annParamIdxs.get(0))) {
            throw new IgniteCheckedException("Invalid method signature. Invalid annotated parameter " +
                "[mtdName=" + mtd.getName() + ", allowedTypes=" + GridifyUtils.getAllowedMethodParameterTypes() +
                ", allowedParamIdxs=" + allowedParamIdxs + ", annParamIdxs=" + annParamIdxs + ']');
        }
```

### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifyAspectJAspect.java`
#### Snippet
```java
        Gridify ann = mtd.getAnnotation(Gridify.class);

        assert ann != null : "Intercepted method does not have gridify annotation.";

        // Since annotations in Java don't allow 'null' as default value
        // we have accept an empty string and convert it here.
        // NOTE: there's unintended behavior when user specifies an empty
        // string as intended Ignite instance name.
        // NOTE: the 'ann.igniteInstanceName() == null' check is added to mitigate
        // annotation bugs in some scripting languages (e.g. Groovy).
        String igniteInstanceName = F.isEmpty(ann.igniteInstanceName()) ? ann.gridName() : ann.igniteInstanceName();

        if (F.isEmpty(igniteInstanceName))
            igniteInstanceName = null;

        if (G.state(igniteInstanceName) != STARTED)
            throw new IgniteCheckedException("Grid is not locally started: " + igniteInstanceName);
```

### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifyAspectJAspect.java`
#### Snippet
```java
        if (!ann.interceptor().equals(GridifyInterceptor.class)) {
            // Check interceptor first.
            if (!ann.interceptor().newInstance().isGridify(ann, arg))
                return joinPnt.proceed();
        }

        if (!ann.taskClass().equals(GridifyDefaultTask.class) && !ann.taskName().isEmpty()) {
            throw new IgniteCheckedException("Gridify annotation must specify either Gridify.taskName() or " +
                "Gridify.taskClass(), but not both: " + ann);
        }
```

### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifyAspectJAspect.java`
#### Snippet
```java
        catch (Exception e) {
            for (Class<?> ex : ((MethodSignature)joinPnt.getSignature()).getMethod().getExceptionTypes()) {
                // Descend all levels down.
                Throwable cause = e.getCause();

                while (cause != null) {
                    if (ex.isAssignableFrom(cause.getClass()))
                        throw cause;

                    cause = cause.getCause();
                }

                if (ex.isAssignableFrom(e.getClass()))
                    throw e;
            }

            throw new GridifyRuntimeException("Undeclared exception thrown: " + e.getMessage(), e);
        }
```

### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifySetToSetAspectJAspect.java`
#### Snippet
```java
        GridifySetToSet ann = mtd.getAnnotation(GridifySetToSet.class);

        assert ann != null : "Intercepted method does not have gridify annotation.";

        // Since annotations in Java don't allow 'null' as default value
        // we have accept an empty string and convert it here.
        // NOTE: there's unintended behavior when user specifies an empty
        // string as intended Ignite instance name.
        // NOTE: the 'ann.igniteInstanceName() == null' check is added to mitigate
        // annotation bugs in some scripting languages (e.g. Groovy).
        String igniteInstanceName = F.isEmpty(ann.igniteInstanceName()) ? ann.gridName() : ann.igniteInstanceName();

        if (F.isEmpty(igniteInstanceName))
            igniteInstanceName = null;

        if (G.state(igniteInstanceName) != STARTED)
            throw new IgniteCheckedException("Grid is not locally started: " + igniteInstanceName);

        GridifyNodeFilter nodeFilter = null;

        if (!ann.nodeFilter().equals(GridifyNodeFilter.class))
            nodeFilter = ann.nodeFilter().newInstance();
```

### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifySetToSetAspectJAspect.java`
#### Snippet
```java
        checkMethodSignature(mtd);

        GridifyArgumentBuilder argBuilder = new GridifyArgumentBuilder();

        // Creates task argument.
        GridifyRangeArgument arg = argBuilder.createTaskArgument(
            mtd.getDeclaringClass(),
            mtd.getName(),
            mtd.getReturnType(),
            mtd.getParameterTypes(),
            mtd.getParameterAnnotations(),
            joinPnt.getArgs(),
            joinPnt.getTarget());

        if (!ann.interceptor().equals(GridifyInterceptor.class)) {
            // Check interceptor first.
            if (!ann.interceptor().newInstance().isGridify(ann, arg))
                return joinPnt.proceed();
        }

        // Proceed locally for negative threshold parameter.
        if (ann.threshold() < 0)
            return joinPnt.proceed();

        // Analyse where to execute method (remotely or locally).
        if (arg.getInputSize() != UNKNOWN_SIZE && arg.getInputSize() <= ann.threshold())
            return joinPnt.proceed();

        // Check is split to jobs allowed for input method argument with declared splitSize.
        checkIsSplitToJobsAllowed(arg, ann);
```

### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifySetToValueAspectJAspect.java`
#### Snippet
```java
        GridifySetToValue ann = mtd.getAnnotation(GridifySetToValue.class);

        assert ann != null : "Intercepted method does not have gridify annotation.";

        // Since annotations in Java don't allow 'null' as default value
        // we have accept an empty string and convert it here.
        // NOTE: there's unintended behavior when user specifies an empty
        // string as intended Igninte instance name.
        // NOTE: the 'ann.igniteInstanceName() == null' check is added to mitigate
        // annotation bugs in some scripting languages (e.g. Groovy).
        String igniteInstanceName = F.isEmpty(ann.igniteInstanceName()) ? ann.gridName() : ann.igniteInstanceName();

        if (F.isEmpty(igniteInstanceName))
            igniteInstanceName = null;

        if (G.state(igniteInstanceName) != STARTED)
            throw new IgniteCheckedException("Grid is not locally started: " + igniteInstanceName);

        GridifyNodeFilter nodeFilter = null;

        if (!ann.nodeFilter().equals(GridifyNodeFilter.class))
            nodeFilter = ann.nodeFilter().newInstance();
```

### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySetToSetSpringAspect.java`
#### Snippet
```java
        GridifyArgumentBuilder argBuilder = new GridifyArgumentBuilder();

        // Creates task argument.
        GridifyRangeArgument arg = argBuilder.createTaskArgument(
            mtd.getDeclaringClass(),
            mtd.getName(),
            mtd.getReturnType(),
            mtd.getParameterTypes(),
            mtd.getParameterAnnotations(),
            invoc.getArguments(),
            invoc.getThis());

        if (!ann.interceptor().equals(GridifyInterceptor.class)) {
            // Check interceptor first.
            if (!ann.interceptor().newInstance().isGridify(ann, arg))
                return invoc.proceed();
        }

        // Proceed locally for negative threshold parameter.
        if (ann.threshold() < 0)
            return invoc.proceed();

        // Analyse where to execute method (remotely or locally).
        if (arg.getInputSize() != UNKNOWN_SIZE && arg.getInputSize() <= ann.threshold())
            return invoc.proceed();

        // Check is split to jobs allowed for input method argument with declared splitSize.
        checkIsSplitToJobsAllowed(arg, ann);
```

### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySetToSetSpringAspect.java`
#### Snippet
```java
        catch (Exception e) {
            for (Class<?> ex : invoc.getMethod().getExceptionTypes()) {
                // Descend all levels down.
                Throwable cause = e.getCause();

                while (cause != null) {
                    if (ex.isAssignableFrom(cause.getClass()))
                        throw cause;

                    cause = cause.getCause();
                }

                if (ex.isAssignableFrom(e.getClass()))
                    throw e;
            }

            throw new GridifyRuntimeException("Undeclared exception thrown: " + e.getMessage(), e);
        }
```

### DuplicatedCode
Duplicated code
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyArgumentBuilder.java`
#### Snippet
```java
        Object[] mtdArgs = new Object[arg.getMethodParameters().length];

        System.arraycopy(arg.getMethodParameters(), 0, mtdArgs, 0, arg.getMethodParameters().length);

        res.setMethodParameters(mtdArgs);

        assert arg.getParamIndex() != -1;

        Class<?> paramCls = arg.getMethodParameterTypes()[arg.getParamIndex()];

        assert paramCls != null;

        Object paramValue = GridifyUtils.collectionToParameter(paramCls, input);
```

### DuplicatedCode
Duplicated code
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/s3/encrypt/AsymmetricKeyEncryptionService.java`
#### Snippet
```java
        if (data == null)
            throw new IgniteException("Parameter data cannot be null");

        if (encCipher == null)
            throw new IgniteException("The init() method was not called.");

        try {
            return encCipher.doFinal(data);
        }
        catch (IllegalBlockSizeException | BadPaddingException e) {
            throw new IgniteException(e);
        }
```

### DuplicatedCode
Duplicated code
in `modules/azure-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/azure/TcpDiscoveryAzureBlobStoreIpFinder.java`
#### Snippet
```java
        String[] res = key.split("#");

        if (res.length != 2)
            throw new IgniteSpiException("Invalid address string: " + key);

        int port;

        try {
            port = Integer.parseInt(res[1]);
        }
        catch (NumberFormatException ignored) {
            throw new IgniteSpiException("Invalid port number: " + res[1]);
        }

        return new InetSocketAddress(res[0], port);
```

### DuplicatedCode
Duplicated code
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/ExamplesUtils.java`
#### Snippet
```java
        if (res == null || res.isEmpty())
            System.out.println("Query result set is empty.");
        else {
            for (Object row : res) {
                if (row instanceof List) {
                    System.out.print("(");

                    List<?> l = (List)row;

                    for (int i = 0; i < l.size(); i++) {
                        Object o = l.get(i);

                        if (o instanceof Double || o instanceof Float)
                            System.out.printf("%.2f", o);
                        else
                            System.out.print(l.get(i));

                        if (i + 1 != l.size())
                            System.out.print(',');
                    }

                    System.out.println(')');
                }
                else
                    System.out.println("  " + row);
            }
        }
```

### DuplicatedCode
Duplicated code
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/store/hibernate/CacheHibernateStoreExample.java`
#### Snippet
```java
        try (Transaction tx = Ignition.ignite().transactions().txStart()) {
            Person val = cache.get(id);

            System.out.println("Read value: " + val);

            val = cache.getAndPut(id, new Person(id, "Isaac", "Newton"));

            System.out.println("Overwrote old value: " + val);

            val = cache.get(id);

            System.out.println("Read value: " + val);

            tx.commit();
        }

        System.out.println("Read value after commit: " + cache.get(id));
```

### DuplicatedCode
Duplicated code
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/util/DbH2ServerStartup.java`
#### Snippet
```java
        try {
            // Start H2 database TCP server in order to access sample in-memory database from other processes.
            Server.createTcpServer("-tcpDaemon").start();

            populateDatabase();

            // Try to connect to database TCP server.
            JdbcConnectionPool dataSrc = JdbcConnectionPool.create("jdbc:h2:tcp://localhost/mem:ExampleDb", "sa", "");

            // Create Person table in database.
            RunScript.execute(dataSrc.getConnection(), new StringReader(CREATE_PERSON_TABLE));

            // Populates Person table with sample data in database.
            RunScript.execute(dataSrc.getConnection(), new StringReader(POPULATE_PERSON_TABLE));
        }
        catch (SQLException e) {
            throw new IgniteException("Failed to start database TCP server", e);
        }

        try {
            do {
                System.out.println("Type 'q' and press 'Enter' to stop H2 TCP server...");
            }
            while ('q' != System.in.read());
        }
        catch (IOException ignored) {
            // No-op.
        }
```

### DuplicatedCode
Duplicated code
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/KafkaStreamer.java`
#### Snippet
```java
        for (ConsumerTask task : consumerTasks)
            task.stop();

        if (executor != null) {
            executor.shutdown();

            try {
                if (!executor.awaitTermination(5000, TimeUnit.MILLISECONDS))
                    if (log.isDebugEnabled())
                        log.debug("Timed out waiting for consumer threads to shut down, exiting uncleanly.");
            }
            catch (InterruptedException ignored) {
                if (log.isDebugEnabled())
                    log.debug("Interrupted during shutdown, exiting uncleanly.");
            }
        }
```

### DuplicatedCode
Duplicated code
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSinkConnector.java`
#### Snippet
```java
        List<Map<String, String>> taskConfigs = new ArrayList<>();
        Map<String, String> taskProps = new HashMap<>();

        taskProps.putAll(configProps);

        for (int i = 0; i < maxTasks; i++)
            taskConfigs.add(taskProps);

        return taskConfigs;
```

### DuplicatedCode
Duplicated code
in `modules/spark-ext/examples/src/main/java/org/apache/ignite/examples/spark/JavaIgniteCatalogExample.java`
#### Snippet
```java
        Ignite ignite = Ignition.start(CONFIG);

        //Creating cache.
        CacheConfiguration<?, ?> ccfg = new CacheConfiguration<>(CACHE_NAME).setSqlSchema("PUBLIC");

        IgniteCache<?, ?> cache = ignite.getOrCreateCache(ccfg);

        //Create tables.
        cache.query(new SqlFieldsQuery(
                "CREATE TABLE city (id LONG PRIMARY KEY, name VARCHAR) WITH \"template=replicated\"")).getAll();
```

### DuplicatedCode
Duplicated code
in `modules/spark-ext/examples/src/main/java/org/apache/ignite/examples/spark/JavaIgniteCatalogExample.java`
#### Snippet
```java
        cache.query(new SqlFieldsQuery("CREATE INDEX on Person (city_id)")).getAll();

        //Inserting some data into table.
        SqlFieldsQuery qry = new SqlFieldsQuery("INSERT INTO city (id, name) VALUES (?, ?)");

        cache.query(qry.setArgs(1L, "Forest Hill")).getAll();
        cache.query(qry.setArgs(2L, "Denver")).getAll();
        cache.query(qry.setArgs(3L, "St. Petersburg")).getAll();

        qry = new SqlFieldsQuery("INSERT INTO person (id, name, city_id) values (?, ?, ?)");

        cache.query(qry.setArgs(1L, "John Doe", 3L)).getAll();
        cache.query(qry.setArgs(2L, "Jane Roe", 2L)).getAll();
        cache.query(qry.setArgs(3L, "Mary Major", 1L)).getAll();
        cache.query(qry.setArgs(4L, "Richard Miles", 2L)).getAll();
```

### DuplicatedCode
Duplicated code
in `modules/spark-ext/examples/src/main/java/org/apache/ignite/examples/spark/JavaIgniteDataFrameJoinExample.java`
#### Snippet
```java
        Dataset<Row> persons = spark.read()
                .format(IgniteDataFrameSettings.FORMAT_IGNITE())
                .option(IgniteDataFrameSettings.OPTION_TABLE(), "person")
                .option(IgniteDataFrameSettings.OPTION_CONFIG_FILE(), CONFIG)
                .load();

        persons.printSchema();
        persons.show();

        Dataset<Row> cities = spark.read()
                .format(IgniteDataFrameSettings.FORMAT_IGNITE())
                .option(IgniteDataFrameSettings.OPTION_TABLE(), "city")
                .option(IgniteDataFrameSettings.OPTION_CONFIG_FILE(), CONFIG)
                .load();

        cities.printSchema();
        cities.show();
```

### DuplicatedCode
Duplicated code
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/SpringCacheManager.java`
#### Snippet
```java
            try {
                if (cfgPath != null) {
                    ignite = IgniteSpring.start(cfgPath, springCtx);
                }
                else if (cfg != null)
                    ignite = IgniteSpring.start(cfg, springCtx);
                else {
                    ignite = Ignition.ignite(igniteInstanceName);

                    externalIgniteInstance = true;
                }
            }
            catch (IgniteCheckedException e) {
                throw U.convertException(e);
            }
```

### DuplicatedCode
Duplicated code
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/ClusterProperties.java`
#### Snippet
```java
        envs.put(IGNITE_CLUSTER_NAME, toEnvVal(clusterName));

        envs.put(IGNITE_RUN_CPU_PER_NODE, toEnvVal(cpuPerNode));
        envs.put(IGNITE_MEMORY_PER_NODE, toEnvVal(memPerNode));
        envs.put(IGNITE_MEMORY_OVERHEAD_PER_NODE, toEnvVal(memOverHeadPerNode));
        envs.put(IGNITE_NODE_COUNT, toEnvVal(nodeCnt));

        envs.put(IGNITE_URL, toEnvVal(igniteUrl));
        envs.put(IGNITE_PATH, toEnvVal(ignitePath));
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\P{Z}&&\\P{Cc}&&\\P{Cf}&&\\P{P}]` can be simplified to '\\P{Z}\&\&\\P{Cc}\&\&\\P{Cf}\&\&\\P{P}'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java
     * Cc Control Cf Format P Punctuation
     */
    private static final String IDENTIFIER = "[._[\\P{Z}&&\\P{Cc}&&\\P{Cf}&&\\P{P}]]+";

    /**
```

### RegExpSimplifiable
`[\P{Z}&&\P{Cc}&&\P{Cf}&&\P{P}]` can be simplified to '\\P{Z}\&\&\\P{Cc}\&\&\\P{Cf}\&\&\\P{P}'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java

    /** */
    private static final String JOIN = "join\\s+(fetch\\s+)?" + IDENTIFIER + "\\s+(as\\s+)?" + IDENTIFIER_GROUP;

    /** */
```

### RegExpSimplifiable
`[\P{Z}&&\P{Cc}&&\P{Cf}&&\P{P}]` can be simplified to '\\P{Z}\&\&\\P{Cc}\&\&\\P{Cf}\&\&\\P{P}'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java
    /** */
    private static final Pattern NAMED_PARAMETER = Pattern.compile(
        COLON_NO_DOUBLE_COLON + IDENTIFIER + "|\\#" + IDENTIFIER, CASE_INSENSITIVE);

    /** */
```

### RegExpSimplifiable
`[\P{Z}&&\P{Cc}&&\P{Cf}&&\P{P}]` can be simplified to '\\P{Z}\&\&\\P{Cc}\&\&\\P{Cf}\&\&\\P{P}'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java
    /** */
    private static final Pattern NAMED_PARAMETER = Pattern.compile(
        COLON_NO_DOUBLE_COLON + IDENTIFIER + "|\\#" + IDENTIFIER, CASE_INSENSITIVE);

    /** */
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return set but the return type is map
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/MessageTransformer.java`
#### Snippet
```java
     *
     * @param message The message received from the JMS broker.
     * @return Set of cache entries to add to the cache. It could be empty or null if the message should be skipped.
     */
    @Nullable Map<K, V> apply(T message);
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/PerformanceStatisticsReportBuilder.java`
#### Snippet
```java
                        entryDestination.getParentFile().mkdirs();

                        try (OutputStream out = new FileOutputStream(entryDestination)) {
                            IOUtils.copy(zip, out);
                        }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/ClusterProperties.java`
#### Snippet
```java
                props = new Properties();

                props.load(new FileInputStream(config));
            }

```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSourceConnector.java`
#### Snippet
```java
        Map<String, String> taskProps = new HashMap<>();

        taskProps.putAll(configProps);

        for (int i = 0; i < maxTasks; i++)
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSinkConnector.java`
#### Snippet
```java
        Map<String, String> taskProps = new HashMap<>();

        taskProps.putAll(configProps);

        for (int i = 0; i < maxTasks; i++)
```

## RuleId[id=Deprecation]
### Deprecation
'com.google.api.client.googleapis.auth.oauth2.GoogleCredential' is deprecated
in `modules/gce-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/gce/TcpDiscoveryGoogleStorageIpFinder.java`
#### Snippet
```java
                }

                GoogleCredential cred;

                try {
```

### Deprecation
'com.google.api.client.googleapis.auth.oauth2.GoogleCredential' is deprecated
in `modules/gce-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/gce/TcpDiscoveryGoogleStorageIpFinder.java`
#### Snippet
```java

                try {
                    cred = new GoogleCredential.Builder().setTransport(httpTransport)
                        .setJsonFactory(JacksonFactory.getDefaultInstance()).setServiceAccountId(srvcAccountId)
                        .setServiceAccountPrivateKeyFromP12File(new File(srvcAccountP12FilePath))
```

### Deprecation
'newInstance()' is deprecated
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSinkTask.java`
#### Snippet
```java
                            Class.forName(transformerCls);

                    extractor = clazz.newInstance();
                }
                catch (Exception e) {
```

### Deprecation
'newInstance()' is deprecated
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSourceTask.java`
#### Snippet
```java
                            (Class<? extends IgnitePredicate<CacheEvent>>)Class.forName(filterCls);

                        filter = clazz.newInstance();
                    }
                    catch (Exception e) {
```

### Deprecation
'gridName' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySpringAspect.java`
#### Snippet
```java
        // NOTE: the 'ann.igniteInstanceName() == null' check is added to mitigate
        // annotation bugs in some scripting languages (e.g. Groovy).
        String igniteInstanceName = F.isEmpty(ann.igniteInstanceName()) ? ann.gridName() : ann.igniteInstanceName();

        if (F.isEmpty(igniteInstanceName))
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySpringAspect.java`
#### Snippet
```java
        if (!ann.interceptor().equals(GridifyInterceptor.class)) {
            // Check interceptor first.
            if (!ann.interceptor().newInstance().isGridify(ann, arg))
                return invoc.proceed();
        }
```

### Deprecation
'gridName' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySetToSetSpringAspect.java`
#### Snippet
```java
        // NOTE: the 'ann.igniteInstanceName() == null' check is added to mitigate
        // annotation bugs in some scripting languages (e.g. Groovy).
        String igniteInstanceName = F.isEmpty(ann.igniteInstanceName()) ? ann.gridName() : ann.igniteInstanceName();

        if (F.isEmpty(igniteInstanceName))
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySetToSetSpringAspect.java`
#### Snippet
```java

        if (!ann.nodeFilter().equals(GridifyNodeFilter.class))
            nodeFilter = ann.nodeFilter().newInstance();

        GridifyArgumentBuilder argBuilder = new GridifyArgumentBuilder();
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySetToSetSpringAspect.java`
#### Snippet
```java
        if (!ann.interceptor().equals(GridifyInterceptor.class)) {
            // Check interceptor first.
            if (!ann.interceptor().newInstance().isGridify(ann, arg))
                return invoc.proceed();
        }
```

### Deprecation
'gridName' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySetToValueSpringAspect.java`
#### Snippet
```java
        // NOTE: the 'ann.igniteInstanceName() == null' check is added to mitigate
        // annotation bugs in some scripting languages (e.g. Groovy).
        String igniteInstanceName = F.isEmpty(ann.igniteInstanceName()) ? ann.gridName() : ann.igniteInstanceName();

        if (F.isEmpty(igniteInstanceName))
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySetToValueSpringAspect.java`
#### Snippet
```java

        if (!ann.nodeFilter().equals(GridifyNodeFilter.class))
            nodeFilter = ann.nodeFilter().newInstance();

        GridifyArgumentBuilder argBuilder = new GridifyArgumentBuilder();
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySetToValueSpringAspect.java`
#### Snippet
```java
        if (!ann.interceptor().equals(GridifyInterceptor.class)) {
            // Check interceptor first.
            if (!ann.interceptor().newInstance().isGridify(ann, arg))
                return invoc.proceed();
        }
```

### Deprecation
'gridName' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifySetToValueAspectJAspect.java`
#### Snippet
```java
        // NOTE: the 'ann.igniteInstanceName() == null' check is added to mitigate
        // annotation bugs in some scripting languages (e.g. Groovy).
        String igniteInstanceName = F.isEmpty(ann.igniteInstanceName()) ? ann.gridName() : ann.igniteInstanceName();

        if (F.isEmpty(igniteInstanceName))
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifySetToValueAspectJAspect.java`
#### Snippet
```java

        if (!ann.nodeFilter().equals(GridifyNodeFilter.class))
            nodeFilter = ann.nodeFilter().newInstance();

        // Check is method allowed for gridify.
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifySetToValueAspectJAspect.java`
#### Snippet
```java
        if (!ann.interceptor().equals(GridifyInterceptor.class)) {
            // Check interceptor first.
            if (!ann.interceptor().newInstance().isGridify(ann, arg))
                return joinPnt.proceed();
        }
```

### Deprecation
'gridName' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifySetToSetAspectJAspect.java`
#### Snippet
```java
        // NOTE: the 'ann.igniteInstanceName() == null' check is added to mitigate
        // annotation bugs in some scripting languages (e.g. Groovy).
        String igniteInstanceName = F.isEmpty(ann.igniteInstanceName()) ? ann.gridName() : ann.igniteInstanceName();

        if (F.isEmpty(igniteInstanceName))
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifySetToSetAspectJAspect.java`
#### Snippet
```java

        if (!ann.nodeFilter().equals(GridifyNodeFilter.class))
            nodeFilter = ann.nodeFilter().newInstance();

        // Check method return type.
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifySetToSetAspectJAspect.java`
#### Snippet
```java
        if (!ann.interceptor().equals(GridifyInterceptor.class)) {
            // Check interceptor first.
            if (!ann.interceptor().newInstance().isGridify(ann, arg))
                return joinPnt.proceed();
        }
```

### Deprecation
'isAccessible()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyJobAdapter.java`
#### Snippet
```java
            // Attempt to soften access control in case we grid-enabling
            // non-accessible method. Subject to security manager setting.
            if (!mtd.isAccessible())
                try {
                    mtd.setAccessible(true);
```

### Deprecation
'gridName' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifyAspectJAspect.java`
#### Snippet
```java
        // NOTE: the 'ann.igniteInstanceName() == null' check is added to mitigate
        // annotation bugs in some scripting languages (e.g. Groovy).
        String igniteInstanceName = F.isEmpty(ann.igniteInstanceName()) ? ann.gridName() : ann.igniteInstanceName();

        if (F.isEmpty(igniteInstanceName))
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifyAspectJAspect.java`
#### Snippet
```java
        if (!ann.interceptor().equals(GridifyInterceptor.class)) {
            // Check interceptor first.
            if (!ann.interceptor().newInstance().isGridify(ann, arg))
                return joinPnt.proceed();
        }
```

### Deprecation
'newInstance()' is deprecated
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyUtils.java`
#### Snippet
```java
        else if (Collection.class.isAssignableFrom(paramCls)) {
            try {
                Collection col = (Collection)paramCls.newInstance();

                for (Object dataObj : data) {
```

### Deprecation
'closeQuietly(java.io.InputStream)' is deprecated
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/ApplicationMaster.java`
#### Snippet
```java
            IOUtils.copy(input, outputStream);

            IOUtils.closeQuietly(input);

            IOUtils.closeQuietly(outputStream);
```

### Deprecation
'newInstance()' is deprecated
in `modules/flume-ext/src/main/java/org/apache/ignite/stream/flume/IgniteSink.java`
#### Snippet
```java
                    (Class<? extends EventTransformer<Event, Object, Object>>)Class.forName(eventTransformerCls);

                eventTransformer = clazz.newInstance();
            }
        }
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
                        // batch completion may be handled by timer only
                        if (batchClosureSize <= 0)
                            return;

                        else if (counter.incrementAndGet() >= batchClosureSize) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java
            switch (type) {
                case STARTING_WITH:
                    return String.format("%s%%", value.toString());
                case ENDING_WITH:
                    return String.format("%%%s", value.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java
                    return String.format("%s%%", value.toString());
                case ENDING_WITH:
                    return String.format("%%%s", value.toString());
                case CONTAINING:
                    return String.format("%%%s%%", value.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java
                    return String.format("%%%s", value.toString());
                case CONTAINING:
                    return String.format("%%%s%%", value.toString());
                case LIKE:
                default:
```

## RuleId[id=RegExpRedundantNestedCharacterClass]
### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java
     * Cc Control Cf Format P Punctuation
     */
    private static final String IDENTIFIER = "[._[\\P{Z}&&\\P{Cc}&&\\P{Cf}&&\\P{P}]]+";

    /**
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java

    /** */
    private static final String JOIN = "join\\s+(fetch\\s+)?" + IDENTIFIER + "\\s+(as\\s+)?" + IDENTIFIER_GROUP;

    /** */
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java
    /** */
    private static final Pattern NAMED_PARAMETER = Pattern.compile(
        COLON_NO_DOUBLE_COLON + IDENTIFIER + "|\\#" + IDENTIFIER, CASE_INSENSITIVE);

    /** */
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java
    /** */
    private static final Pattern NAMED_PARAMETER = Pattern.compile(
        COLON_NO_DOUBLE_COLON + IDENTIFIER + "|\\#" + IDENTIFIER, CASE_INSENSITIVE);

    /** */
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ConsumerTask` may be 'static'
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java

    /** Polling task. */
    class ConsumerTask implements Callable<Void> {
        /** Pub/Sub consumer */
        private final SubscriberStub subscriberStub;
```

### InnerClassMayBeStatic
Inner class `IgniteInstanceDetails` may be 'static'
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java
     */
    @JsonRootName("ignite_instance_details")
    private class IgniteInstanceDetails {

    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `modules/geospatial-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/SpatialQueryExample.java`
#### Snippet
```java
 * This examples shows the usage of geospatial queries and indexes in Apache Ignite.
 * For more information please refer to the following technical documentation:
 * http://apacheignite.readme.io/docs/geospatial-queries
 */
public class SpatialQueryExample {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `modules/twitter-ext/src/main/java/org/apache/ignite/stream/twitter/TwitterStreamer.java`
#### Snippet
```java
    private int threadsCount = 1;

    /** Twitter Streaming API params. See https://dev.twitter.com/streaming/overview/request-parameters */
    private Map<String, String> apiParams;

```

### JavadocLinkAsPlainText
Link specified as plain text
in `modules/twitter-ext/src/main/java/org/apache/ignite/stream/twitter/TwitterStreamer.java`
#### Snippet
```java
 * by default <tweetId, text>, into an {@link IgniteDataStreamer} instance.
 * <p>
 * This streamer uses https://dev.twitter.com/streaming API and supports Public API, User Streams,
 * Site Streams and Firehose.
 * <p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `modules/twitter-ext/src/main/java/org/apache/ignite/stream/twitter/TwitterStreamer.java`
#### Snippet
```java
 * <ul>
 *     <li>Supports OAuth1 authentication scheme.
 *     <br/> BasicAuth not supported by Streaming API https://dev.twitter.com/streaming/overview/connecting</li>
 *     <li>Provide all params in apiParams map. https://dev.twitter.com/streaming/overview/request-parameters</li>
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `modules/twitter-ext/src/main/java/org/apache/ignite/stream/twitter/TwitterStreamer.java`
#### Snippet
```java
 *     <li>Supports OAuth1 authentication scheme.
 *     <br/> BasicAuth not supported by Streaming API https://dev.twitter.com/streaming/overview/connecting</li>
 *     <li>Provide all params in apiParams map. https://dev.twitter.com/streaming/overview/request-parameters</li>
 * </ul>
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/QueryUtils.java`
#### Snippet
```java

    /**
     * Used Regex/Unicode categories (see http://www.unicode.org/reports/tr18/#General_Category_Property): Z Separator
     * Cc Control Cf Format P Punctuation
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/IgniteZeroMqStreamer.java`
#### Snippet
```java

/**
 * This streamer uses https://github.com/zeromq/jeromq/.
 * Implements socket types listed {@link ZeroMqTypeSocket}.
 */
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheVersionConflictResolverCachePluginProvider.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Nullable @Override public <T> T createComponent(Class<T> cls) {
        if (cls.equals(CacheConflictResolutionManager.class))
            return (T)new CacheConflictResolutionManagerImpl<>(conflictResolveField, clusterId);

```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

            // build the JMS objects
            if (destinationType == Queue.class) {
                initializeJmsObjectsForQueue();
            }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>' and 'Class'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySpringAspect.java`
#### Snippet
```java
        }

        if (!ann.taskClass().equals(GridifyDefaultTask.class) && !ann.taskName().isEmpty())
            throw new IgniteCheckedException("Gridify annotation must specify either Gridify.taskName() or " +
                "Gridify.taskClass(), but not both: " + ann);
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>' and 'Class'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/spring/GridifySpringAspect.java`
#### Snippet
```java
            Ignite ignite = G.ignite(igniteInstanceName);

            if (!ann.taskClass().equals(GridifyDefaultTask.class))
                return ignite.compute().withTimeout(ann.timeout()).execute(
                    (Class<? extends ComputeTask<GridifyArgument, Object>>)ann.taskClass(), arg);
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>' and 'Class'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifyAspectJAspect.java`
#### Snippet
```java
        }

        if (!ann.taskClass().equals(GridifyDefaultTask.class) && !ann.taskName().isEmpty()) {
            throw new IgniteCheckedException("Gridify annotation must specify either Gridify.taskName() or " +
                "Gridify.taskClass(), but not both: " + ann);
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class\>' and 'Class'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/aspectj/GridifyAspectJAspect.java`
#### Snippet
```java

            // If task class was specified.
            if (!ann.taskClass().equals(GridifyDefaultTask.class)) {
                return ignite.compute().withTimeout(ann.timeout()).execute(
                    (Class<? extends ComputeTask<GridifyArgument, Object>>)ann.taskClass(), arg);
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteQueryGenerator.java`
#### Snippet
```java
            Class<?> tp = types[i];

            if (tp == Sort.class || tp == Pageable.class)
                throw new AssertionError("Sort and Pageable parameters are allowed only in the last position");
        }
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteQueryGenerator.java`
#### Snippet
```java
            Class<?> tp = types[i];

            if (tp == Sort.class || tp == Pageable.class)
                throw new AssertionError("Sort and Pageable parameters are allowed only in the last position");
        }
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteRepositoryQuery.java`
#### Snippet
```java
        Class<?> returnType = mtd.getReturnType();

        if (returnType == Slice.class) {
            if (isFieldQry) {
                if (hasAssignableGenericReturnTypeFrom(ArrayList.class, mtd))
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteRepositoryQuery.java`
#### Snippet
```java
            return ReturnStrategy.SLICE_OF_VALUES;
        }
        else if (returnType == Page.class)
            return ReturnStrategy.PAGE_OF_VALUES;
        else if (returnType == Stream.class)
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `modules/geospatial-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/SpatialQueryExample.java`
#### Snippet
```java
        /** Coordinates. */
        @QuerySqlField(index = true)
        private Geometry coords;

        /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/conflictresolve/CacheConflictResolutionManagerImpl.java`
#### Snippet
```java

    /** Grid cache context. */
    private GridCacheContext<K, V> cctx;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteRepositoryQuery.java`
#### Snippet
```java

    /** The return query method */
    private final QueryMethod qMethod;

    /** The return domain class of QueryMethod */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `modules/azure-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/azure/TcpDiscoveryAzureBlobStoreIpFinder.java`
#### Snippet
```java

    /** Blob service client */
    private BlobServiceClient blobServiceClient;

    /** Blob container client */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/IgniteZeroMqStreamer.java`
#### Snippet
```java

    /** Maximum time to wait. */
    private long timeout = 5_000;

    /**
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSourceTask.java`
#### Snippet
```java
            if (affinity.isPrimary(ignite.cluster().localNode(), evt.key())) {
                // Process this event. Ignored on backups.
                if (filter != null && filter.apply(evt))
                    return false;

```

### TrivialIf
`if` statement can be simplified
in `modules/cloud-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/cloud/TcpDiscoveryCloudIpFinder.java`
#### Snippet
```java
                                    return false;

                                if (zones != null && zone != null && !zones.contains(zone))
                                    return false;

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/PerformanceStatisticsReportBuilder.java`
#### Snippet
```java
        }

        jsonFile.delete();
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/PerformanceStatisticsReportBuilder.java`
#### Snippet
```java

                    if (entry.isDirectory())
                        entryDestination.mkdirs();
                    else {
                        entryDestination.getParentFile().mkdirs();
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/PerformanceStatisticsReportBuilder.java`
#### Snippet
```java
                        entryDestination.mkdirs();
                    else {
                        entryDestination.getParentFile().mkdirs();

                        try (OutputStream out = new FileOutputStream(entryDestination)) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/resource/IgniteProvider.java`
#### Snippet
```java

        if (!file.exists())
            file.mkdirs();

        if (!file.exists())
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/IgniteProvider.java`
#### Snippet
```java

        if (!file.exists())
            file.mkdirs();

        if (!file.exists())
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/store/hibernate/CacheHibernateBlobStore.java`
#### Snippet
```java
        try {
            // Read a single byte to force actual content access by JVM.
            cfgStream.read();

            return true;
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/PerformanceStatisticsReportBuilder.java`
#### Snippet
```java
        }

        A.ensure(args.length <= 1, "Too much arguments [args=" + Arrays.toString(args) + ']');

        String filesDir = args[0];
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/resource/IgniteProvider.java`
#### Snippet
```java
            throw null;

        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        return rd.lines().collect(Collectors.joining());
    }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `clear()` is identical to its super method
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteGeneralDataRegion.java`
#### Snippet
```java

    /** {@inheritDoc} */
    @Override public void clear() {
        try {
            cache.clear();
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Argument type 'Object' does not match the type of the format specifier '%.2f'
in `modules/spring-tx-ext/examples/src/main/java/org/apache/ignite/examples/ExamplesUtils.java`
#### Snippet
```java

                        if (o instanceof Double || o instanceof Float)
                            System.out.printf("%.2f", o);
                        else
                            System.out.print(l.get(i));
```

### MalformedFormatString
Argument type 'Object' does not match the type of the format specifier '%.2f'
in `modules/hibernate-ext/examples/src/main/java/org/apache/ignite/examples/ExamplesUtils.java`
#### Snippet
```java

                        if (o instanceof Double || o instanceof Float)
                            System.out.printf("%.2f", o);
                        else
                            System.out.print(l.get(i));
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `() -> {...}` to `Factory`> is redundant
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
        this.listenerConfiguration = new CacheEntryListenerConfiguration<String, IgniteSession>() {
            @Override public Factory<CacheEntryListener<? super String, ? super IgniteSession>> getCacheEntryListenerFactory() {
                return (Factory<CacheEntryListener<? super String, ? super IgniteSession>>)() -> IgniteIndexedSessionRepository.this;
            }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param subscriberStubSettings` tag description is missing
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java

        /**
         * @param subscriberStubSettings
         * @param subscriptionName
         * @param returnImmediately
```

### JavadocDeclaration
`@param subscriptionName` tag description is missing
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java
        /**
         * @param subscriberStubSettings
         * @param subscriptionName
         * @param returnImmediately
         * @param maxMessages
```

### JavadocDeclaration
`@param returnImmediately` tag description is missing
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java
         * @param subscriberStubSettings
         * @param subscriptionName
         * @param returnImmediately
         * @param maxMessages
         * @throws IgniteException
```

### JavadocDeclaration
`@param maxMessages` tag description is missing
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java
         * @param subscriptionName
         * @param returnImmediately
         * @param maxMessages
         * @throws IgniteException
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `modules/pub-sub-ext/src/main/java/org/apache/ignite/stream/pubsub/PubSubStreamer.java`
#### Snippet
```java
         * @param returnImmediately
         * @param maxMessages
         * @throws IgniteException
         */
        public ConsumerTask(
```

### JavadocDeclaration
`@throws` tag description is missing
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/utils/IgniteYarnUtils.java`
#### Snippet
```java
     * @param creds The credentials.
     * @return The ByteBuffer with the credentials.
     * @throws IOException
     */
    public static ByteBuffer createTokenBuffer(Credentials creds) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/IgniteYarnClient.java`
#### Snippet
```java
     * @param fileSystem Hdfs file system.
     * @return Hdfs path to ignite node.
     * @throws Exception
     */
    private static Path getIgnite(ClusterProperties props, FileSystem fileSystem) throws Exception {
```

### JavadocDeclaration
`@throws` tag description is missing
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/ApplicationMaster.java`
#### Snippet
```java

    /**
     * @throws IOException
     */
    public void init() throws IOException {
```

### JavadocDeclaration
Wrong tag `ignitelink`
in `modules/spring-tx-ext/spring-tx/src/main/java/org/apache/ignite/transactions/spring/SpringTransactionManager.java`
#### Snippet
```java
 * </pre>
 * This can be used, for example, when you are running your application
 * in a J2EE Web container and use {@ignitelink org.apache.ignite.startup.servlet.ServletContextListenerStartup}
 * for node startup.
 *
```

### JavadocDeclaration
Wrong tag `ignitelink`
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/SpringCacheManager.java`
#### Snippet
```java
 * </pre>
 * This can be used, for example, when you are running your application
 * in a J2EE Web container and use {@ignitelink org.apache.ignite.startup.servlet.ServletContextListenerStartup}
 * for node startup.
 * <p>
```

### JavadocDeclaration
`@throws` tag description is missing
in `modules/azure-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/azure/TcpDiscoveryAzureBlobStoreIpFinder.java`
#### Snippet
```java
    /**
     * Initialize the IP finder
     * @throws IgniteSpiException
     */
    private void init() throws IgniteSpiException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/classloaders/ContainerSweepClassLoader.java`
#### Snippet
```java
     * @param resolve Whether to resolve the class or not.
     * @return The loaded class.
     * @throws ClassNotFoundException
     */
    @Override protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteAbstractOsgiContextActivator.java`
#### Snippet
```java
     *
     * @param ctx Bundle context.
     * @throws Exception
     */
    @Override public final void start(BundleContext ctx) throws Exception {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `coords` may be 'final'
in `modules/geospatial-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/SpatialQueryExample.java`
#### Snippet
```java
        /** Coordinates. */
        @QuerySqlField(index = true)
        private Geometry coords;

        /**
```

### FieldMayBeFinal
Field `igniteDir` may be 'final'
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/resource/ResourceHandler.java`
#### Snippet
```java

    /** */
    private String igniteDir;

    /**
```

### FieldMayBeFinal
Field `cfgPath` may be 'final'
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/resource/ResourceHandler.java`
#### Snippet
```java

    /** */
    private String cfgPath;

    /** */
```

### FieldMayBeFinal
Field `libsDir` may be 'final'
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/resource/ResourceHandler.java`
#### Snippet
```java

    /** */
    private String libsDir;

    /** */
```

### FieldMayBeFinal
Field `downloadFolder` may be 'final'
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/resource/IgniteProvider.java`
#### Snippet
```java

    /** */
    private String downloadFolder;

    /**
```

### FieldMayBeFinal
Field `tasks` may be 'final'
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/IgniteScheduler.java`
#### Snippet
```java

    /** Task on host. */
    private Map<String, IgniteTask> tasks = new HashMap<>();

    /** Cluster resources. */
```

### FieldMayBeFinal
Field `taskIdGenerator` may be 'final'
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/IgniteScheduler.java`
#### Snippet
```java

    /** ID generator. */
    private AtomicInteger taskIdGenerator = new AtomicInteger();

    /** Task on host. */
```

### FieldMayBeFinal
Field `resourceProvider` may be 'final'
in `modules/mesos-ext/src/main/java/org/apache/ignite/mesos/IgniteScheduler.java`
#### Snippet
```java

    /** Resource provider. */
    private ResourceProvider resourceProvider;

    /**
```

### FieldMayBeFinal
Field `listeners` may be 'final'
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

    /** Message listeners. */
    private Set<IgniteJmsMessageListener> listeners = Collections.newSetFromMap(new ConcurrentHashMap<IgniteJmsMessageListener, Boolean>());

    /** The Jms {@link ExceptionListener} to use. */
```

### FieldMayBeFinal
Field `executor` may be 'final'
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

        /** */
        private Executor executor;

        /** */
```

### FieldMayBeFinal
Field `session` may be 'final'
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java
    private class IgniteJmsMessageListener implements MessageListener {
        /** */
        private Session session;

        /** */
```

### FieldMayBeFinal
Field `consumers` may be 'final'
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

    /** Message consumers. */
    private Set<MessageConsumer> consumers = Collections.newSetFromMap(new ConcurrentHashMap<MessageConsumer, Boolean>());

    /** Message listeners. */
```

### FieldMayBeFinal
Field `counter` may be 'final'
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

        /** */
        private AtomicInteger counter = new AtomicInteger(0);

        /** */
```

### FieldMayBeFinal
Field `sessions` may be 'final'
in `modules/jms11-ext/src/main/java/org/apache/ignite/stream/jms11/JmsStreamer.java`
#### Snippet
```java

    /** Stores the current JMS Sessions. */
    private Set<Session> sessions = Collections.newSetFromMap(new ConcurrentHashMap<Session, Boolean>());

    /** Message consumers. */
```

### FieldMayBeFinal
Field `evtBuf` may be 'final'
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSourceTask.java`
#### Snippet
```java

    /** Event buffer. */
    private static BlockingQueue<CacheEvent> evtBuf = new LinkedBlockingQueue<>(evtBufSize);

    /** Max number of events taken from the buffer at once. */
```

### FieldMayBeFinal
Field `locLsnr` may be 'final'
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/connect/IgniteSourceTask.java`
#### Snippet
```java

    /** Local listener. */
    private static TaskLocalListener locLsnr = new TaskLocalListener();

    /** User-defined filter. */
```

### FieldMayBeFinal
Field `threshold` may be 'final'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifyDefaultRangeTask.java`
#### Snippet
```java

    /** */
    private int threshold;

    /** */
```

### FieldMayBeFinal
Field `splitSize` may be 'final'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifyDefaultRangeTask.java`
#### Snippet
```java

    /** */
    private int splitSize;

    /** */
```

### FieldMayBeFinal
Field `limitedSplit` may be 'final'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifyDefaultRangeTask.java`
#### Snippet
```java

    /** */
    private boolean limitedSplit;

    /**
```

### FieldMayBeFinal
Field `nodeFilter` may be 'final'
in `modules/aop-ext/src/main/java/org/apache/ignite/compute/gridify/aop/GridifyDefaultRangeTask.java`
#### Snippet
```java

    /** */
    private GridifyNodeFilter nodeFilter;

    /** */
```

### FieldMayBeFinal
Field `key` may be 'final'
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3TimeData.java`
#### Snippet
```java

    /** Key of checkpoint. */
    private String key;

    /**
```

### FieldMayBeFinal
Field `col` may be 'final'
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyUtils.java`
#### Snippet
```java

        /** */
        private Collection<T> col;

        /** */
```

### FieldMayBeFinal
Field `col` may be 'final'
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyUtils.java`
#### Snippet
```java

        /** */
        private Collection<T> col;

        /** */
```

### FieldMayBeFinal
Field `evtBuf` may be 'final'
in `modules/flink-ext/src/main/java/org/apache/ignite/source/flink/IgniteSource.java`
#### Snippet
```java

    /** Event buffer. */
    private BlockingQueue<CacheEvent> evtBuf = new LinkedBlockingQueue<>();

    /** Remote Listener id. */
```

### FieldMayBeFinal
Field `oAuthSettings` may be 'final'
in `modules/twitter-ext/src/main/java/org/apache/ignite/stream/twitter/TwitterStreamer.java`
#### Snippet
```java

    /** OAuth params holder */
    private OAuthSettings oAuthSettings;

    /** shared variable to communicate/signal that streamer is already running or can be started */
```

### FieldMayBeFinal
Field `map` may be 'final'
in `modules/aws-ext/src/main/java/org/apache/ignite/spi/checkpoint/s3/S3CheckpointSpi.java`
#### Snippet
```java
    private class S3TimeoutWorker extends IgniteSpiThread {
        /** List of data with access and expiration date. */
        private Map<String, S3TimeData> map = new HashMap<>();

        /**
```

### FieldMayBeFinal
Field `fs` may be 'final'
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/IgniteProvider.java`
#### Snippet
```java

    /** */
    private FileSystem fs;

    /**
```

### FieldMayBeFinal
Field `props` may be 'final'
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/IgniteProvider.java`
#### Snippet
```java

    /** */
    private ClusterProperties props;

    /** */
```

### FieldMayBeFinal
Field `locks` may be 'final'
in `modules/spring-cache-ext/src/main/java/org/apache/ignite/cache/spring/SpringCacheManager.java`
#### Snippet
```java

    /** Locks for value loading to support sync option. */
    private ConcurrentHashMap<Integer, IgniteLock> locks = new ConcurrentHashMap<>();

    /** Flag that indicates whether external Ignite instance is configured. */
```

### FieldMayBeFinal
Field `ourInstances` may be 'final'
in `modules/zookeeper-ip-finder-ext/zookeeper-ip-finder/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/zk/TcpDiscoveryZookeeperIpFinder.java`
#### Snippet
```java

    /** Map of the {#link ServiceInstance}s we have registered. */
    private Map<InetSocketAddress, ServiceInstance<IgniteInstanceDetails>> ourInstances = new ConcurrentHashMap<>();

    /** Constructor. */
```

### FieldMayBeFinal
Field `jdbcTemplate` may be 'final'
in `modules/spring-tx-ext/examples/src/main/java/org/apache/ignite/examples/datagrid/store/spring/CacheSpringPersonStore.java`
#### Snippet
```java

    /** Spring JDBC template. */
    private JdbcTemplate jdbcTemplate;

    /**
```

### FieldMayBeFinal
Field `domainDataRegion` may be 'final'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteCachedDomainDataAccess.java`
#### Snippet
```java

    /** */
    private DomainDataRegion domainDataRegion;

    /**
```

### FieldMayBeFinal
Field `stgyFactory` may be 'final'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/IgniteDomainDataRegion.java`
#### Snippet
```java

    /** Strategy factory. */
    private HibernateAccessStrategyFactory stgyFactory;

    /**
```

### FieldMayBeFinal
Field `locked` may be 'final'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateNonStrictAccessStrategy.java`
#### Snippet
```java
        /** */
        @GridToStringInclude
        private Set<Object> locked = new GridLeanSet<>();

        /**
```

### FieldMayBeFinal
Field `osgi` may be 'final'
in `modules/osgi-ext/osgi/src/main/java/org/apache/ignite/osgi/IgniteOsgiUtils.java`
#### Snippet
```java
public class IgniteOsgiUtils {
    /** Whether we are running in an OSGi container. */
    private static boolean osgi = FrameworkUtil.getBundle(IgniteOsgiUtils.class) != null;

    /** Maps Ignite instances to the ClassLoaders of the bundles they were started from. */
```

### FieldMayBeFinal
Field `locked` may be 'final'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateReadWriteAccessStrategy.java`
#### Snippet
```java
    private static class TxContext {
        /** */
        private Set<Object> locked = new GridLeanSet<>();

        /**
```

### FieldMayBeFinal
Field `type` may be 'final'
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/ZeroMqTypeSocket.java`
#### Snippet
```java

    /** Socket type. */
    private int type;

    /**
```

### FieldMayBeFinal
Field `ioThreads` may be 'final'
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/IgniteZeroMqStreamer.java`
#### Snippet
```java

    /** ZeroMQ context threads. */
    private int ioThreads;

    /** ZeroMQ socket type. */
```

### FieldMayBeFinal
Field `addr` may be 'final'
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/IgniteZeroMqStreamer.java`
#### Snippet
```java

    /** ZeroMQ socket address. */
    private String addr;

    /** ZeroMQ topic name. */
```

### FieldMayBeFinal
Field `socketType` may be 'final'
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/IgniteZeroMqStreamer.java`
#### Snippet
```java

    /** ZeroMQ socket type. */
    private int socketType;

    /** ZeroMQ socket address. */
```

### FieldMayBeFinal
Field `timeout` may be 'final'
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/IgniteZeroMqStreamer.java`
#### Snippet
```java

    /** Maximum time to wait. */
    private long timeout = 5_000;

    /**
```

### FieldMayBeFinal
Field `topic` may be 'final'
in `modules/zeromq-ext/src/main/java/org/apache/ignite/stream/zeromq/IgniteZeroMqStreamer.java`
#### Snippet
```java

    /** ZeroMQ topic name. */
    private byte[] topic;

    /** Maximum time to wait. */
```

### FieldMayBeFinal
Field `cacheName` may be 'final'
in `modules/hibernate-ext/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateCacheProxy.java`
#### Snippet
```java

    /** */
    private String cacheName;

    /**
```

### FieldMayBeFinal
Field `delta` may be 'final'
in `modules/spring-session-ext/src/main/java/org/apache/ignite/spring/sessions/IgniteIndexedSessionRepository.java`
#### Snippet
```java
        /** */
        @GridDirectTransient
        private Map<String, Object> delta = new HashMap<>();

        /** */
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `seenBlobNames` are updated, but never queried
in `modules/azure-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/azure/TcpDiscoveryAzureBlobStoreIpFinder.java`
#### Snippet
```java

        Collection<InetSocketAddress> addrs = new ArrayList<>();
        Set<String> seenBlobNames = new HashSet<>();

        for (BlobItem blobItem : blobContainerClient.listBlobs()) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `val` is redundant
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/util/Utils.java`
#### Snippet
```java
                ps.print('0');

                int val = c;

                ps.print(HC[val >> 4]);
```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `modules/performance-statistics-ext/src/main/java/org/apache/ignite/internal/performancestatistics/PerformanceStatisticsPrinter.java`
#### Snippet
```java
        if (outFile != null) {
            try {
                ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(new File(outFile), true)));
            }
            catch (IOException e) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `fileStatuses` initializer `null` is redundant
in `modules/yarn-ext/src/main/java/org/apache/ignite/yarn/IgniteProvider.java`
#### Snippet
```java
     */
    private Path findIgnite(FileSystem fs, String folder, String curVer) {
        FileStatus[] fileStatuses = null;

        try {
```

### UnusedAssignment
Variable `cWrapperTransformFunction` initializer `null` is redundant
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/IgniteRepositoryQuery.java`
#### Snippet
```java
            FieldsQueryCursor<?> fieldQryCur = (FieldsQueryCursor<?>)qryCursor;

            Function<List<?>, ?> cWrapperTransformFunction = null;

            if (type.equals(returnClass))
```

### UnusedAssignment
Variable `ch` initializer `null` is redundant
in `modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
    private void shell(Session ses, String cmd, String regexp)
        throws JSchException, IOException, IgniteInterruptedCheckedException {
        ChannelShell ch = null;

        GridTimeoutObject to = null;
```

### UnusedAssignment
Variable `ch` initializer `null` is redundant
in `modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
     */
    private String exec(Session ses, final String cmd, String encoding) throws JSchException, IOException {
        ChannelExec ch = null;

        try {
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyUtils.java`
#### Snippet
```java

                for (Object dataObj : data) {
                    col.add(dataObj);
                }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `data instanceof TypeMapping` is always `false`
in `modules/cdc-ext/src/main/java/org/apache/ignite/cdc/kafka/KafkaToIgniteMetadataUpdater.java`
#### Snippet
```java
                if (data instanceof BinaryMetadata)
                    registerBinaryMeta(ctx, log, (BinaryMetadata)data);
                else if (data instanceof TypeMapping)
                    registerMapping(ctx, log, (TypeMapping)data);
                else
```

### ConstantValue
Condition `consumer != null` is always `true`
in `modules/kafka-ext/src/main/java/org/apache/ignite/stream/kafka/KafkaStreamer.java`
#### Snippet
```java
            stopped = true;

            if (consumer != null)
                consumer.wakeup();
        }
```

### ConstantValue
Condition `ctor.newInstance() != null` is always `true` when reached
in `modules/aop-ext/src/main/java/org/apache/ignite/internal/util/gridify/GridifyUtils.java`
#### Snippet
```java
            for (Constructor ctor : ctors) {
                try {
                    if (ctor.getParameterTypes().length == 0 && ctor.newInstance() != null)
                        return true;
                }
```

### ConstantValue
Condition `connObj instanceof IgniteConfiguration` is always `false`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteProxy.java`
#### Snippet
```java
        if (connObj instanceof Ignite)
            return new IgniteNodeProxy((Ignite)connObj);
        else if (connObj instanceof IgniteConfiguration) {
            try {
                return new IgniteNodeProxy(Ignition.ignite(((IgniteConfiguration)connObj).getIgniteInstanceName()));
```

### ConstantValue
Condition `connObj instanceof String` is always `false`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteProxy.java`
#### Snippet
```java
            return new ClosableIgniteNodeProxy(Ignition.start((IgniteConfiguration)connObj));
        }
        else if (connObj instanceof String)
            return new ClosableIgniteNodeProxy(Ignition.start((String)connObj));
        else if (connObj instanceof IgniteClient)
```

### ConstantValue
Condition `connObj instanceof IgniteClient` is always `false`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteProxy.java`
#### Snippet
```java
        else if (connObj instanceof String)
            return new ClosableIgniteNodeProxy(Ignition.start((String)connObj));
        else if (connObj instanceof IgniteClient)
            return new IgniteClientProxy((IgniteClient)connObj);
        else if (connObj instanceof ClientConfiguration)
```

### ConstantValue
Condition `connObj instanceof ClientConfiguration` is always `false`
in `modules/spring-data-commons/src/main/java/org/apache/ignite/springdata/proxy/IgniteProxy.java`
#### Snippet
```java
        else if (connObj instanceof IgniteClient)
            return new IgniteClientProxy((IgniteClient)connObj);
        else if (connObj instanceof ClientConfiguration)
            return new ClosableIgniteClientProxy(Ignition.startClient((ClientConfiguration)connObj));

```

### ConstantValue
Condition `destroyE != null` is always `false`
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/support/IgniteProxyFactory.java`
#### Snippet
```java
        }

        if (destroyE != null)
            throw destroyE;
    }
```

### ConstantValue
Condition `ses != null` is always `false`
in `modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
        }
        finally {
            if (ses != null && ses.isConnected())
                ses.disconnect();
        }
```

### ConstantValue
Condition `ses != null && ses.isConnected()` is always `false`
in `modules/ssh-ext/src/main/java/org/apache/ignite/internal/util/nodestart/StartNodeCallableImpl.java`
#### Snippet
```java
        }
        finally {
            if (ses != null && ses.isConnected())
                ses.disconnect();
        }
```

### ConstantValue
Condition `row != null` is always `true`
in `modules/geospatial-ext/geospatial/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GeoSpatialIndexImpl.java`
#### Snippet
```java
            CacheDataRow cacheRow = row.cacheDataRow();

            assert row != null;

            if (cacheRow.expireTime() != 0 && cacheRow.expireTime() <= time)
```

### ConstantValue
Condition `oldRow != null` is always `true`
in `modules/geospatial-ext/geospatial/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GeoSpatialIndexImpl.java`
#### Snippet
```java
        rowCnt--;

        return oldRow != null;
    }

```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `rowCnt`
in `modules/geospatial-ext/geospatial/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GeoSpatialIndexImpl.java`
#### Snippet
```java

        if (old == null)
            rowCnt++; // No replace.

        return old != null;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `rowCnt`
in `modules/geospatial-ext/geospatial/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GeoSpatialIndexImpl.java`
#### Snippet
```java
            throw DbException.throwInternalError("row not found");

        rowCnt--;

        return oldRow != null;
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.Files' is marked unstable with @Beta
in `modules/cloud-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/cloud/TcpDiscoveryCloudIpFinder.java`
#### Snippet
```java
    private String getCredentialFromFile() throws IgniteSpiException {
        try {
            String fileContents = Files.toString(new File(credentialPath), Charsets.UTF_8);

            if (provider.equals("google-compute-engine")) {
```

### UnstableApiUsage
'toString(java.io.File, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Files' marked with @Beta
in `modules/cloud-ext/src/main/java/org/apache/ignite/spi/discovery/tcp/ipfinder/cloud/TcpDiscoveryCloudIpFinder.java`
#### Snippet
```java
    private String getCredentialFromFile() throws IgniteSpiException {
        try {
            String fileContents = Files.toString(new File(credentialPath), Charsets.UTF_8);

            if (provider.equals("google-compute-engine")) {
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `modules/spring-data-ext/spring-data/src/main/java/org/apache/ignite/springdata/repository/query/StringQuery.java`
#### Snippet
```java

            // named parameter and the parameter name
            builder.append("%?(" + QueryUtils.COLON_NO_DOUBLE_COLON + QueryUtils.IDENTIFIER_GROUP + ")%?");

            builder.append(")");
```

