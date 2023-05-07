# commons-dbcp 
 
# Bad smells
I found 415 bad smells with 13 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 273 | false |
| DeprecatedIsStillUsed | 51 | false |
| Deprecation | 14 | false |
| UnusedAssignment | 14 | false |
| MagicConstant | 13 | false |
| ProtectedMemberInFinalClass | 10 | true |
| StringBufferReplaceableByString | 7 | false |
| DataFlowIssue | 5 | false |
| JavadocDeclaration | 4 | false |
| RedundantCast | 4 | false |
| ConstantValue | 4 | false |
| CommentedOutCode | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| AutoCloseableResource | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| RedundantClassCall | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| CopyConstructorMissesField | 1 | false |
| FinalStaticMethod | 1 | false |
| RedundantTypeArguments | 1 | false |
| SuspiciousMethodCalls | 1 | false |
## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'InstanceKeyDataSource' used without 'try'-with-resources statement
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSourceFactory.java`
#### Snippet
```java
    static void removeInstance(final String key) {
        if (key != null) {
            INSTANCE_MAP.remove(key);
        }
    }
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
            statement = null;
            if (!thrownList.isEmpty()) {
                throw new SQLExceptionList(thrownList);
            }
        }
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java
        final int defaultTransactionIsolation = getDefaultTransactionIsolation();
        if (defaultTransactionIsolation != UNKNOWN_TRANSACTIONISOLATION) {
            connection.setTransactionIsolation(defaultTransactionIsolation);
        }

```

### MagicConstant
Should be one of: ResultSet.FETCH_FORWARD, ResultSet.FETCH_REVERSE, ResultSet.FETCH_UNKNOWN
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return 0;
        }
    }
```

### MagicConstant
Should be one of: ResultSet.CONCUR_READ_ONLY, ResultSet.CONCUR_UPDATABLE
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return 0;
        }
    }
```

### MagicConstant
Should be one of: ResultSet.TYPE_FORWARD_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.TYPE_SCROLL_SENSITIVE
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return 0;
        }
    }
```

### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

        if (defaultTransactionIsolation != UNKNOWN_TRANSACTIONISOLATION) {
            con.setTransactionIsolation(defaultTransactionIsolation);
        }

```

### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `src/main/java/org/apache/commons/dbcp2/PoolableConnectionFactory.java`
#### Snippet
```java
        }
        if (defaultTransactionIsolation != UNKNOWN_TRANSACTION_ISOLATION
                && pConnection.getTransactionIsolation() != defaultTransactionIsolation) {
            pConnection.setTransactionIsolation(defaultTransactionIsolation);
        }
```

### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `src/main/java/org/apache/commons/dbcp2/PoolableConnectionFactory.java`
#### Snippet
```java
        if (defaultTransactionIsolation != UNKNOWN_TRANSACTION_ISOLATION
                && pConnection.getTransactionIsolation() != defaultTransactionIsolation) {
            pConnection.setTransactionIsolation(defaultTransactionIsolation);
        }
        if (defaultReadOnly != null && pConnection.isReadOnly() != defaultReadOnly) {
```

### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return -1;
        }
    }
```

### MagicConstant
Should be one of: ResultSet.FETCH_FORWARD, ResultSet.FETCH_REVERSE, ResultSet.FETCH_UNKNOWN
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return 0;
        }
    }
```

### MagicConstant
Should be one of: ResultSet.CONCUR_READ_ONLY, ResultSet.CONCUR_UPDATABLE
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return 0;
        }
    }
```

### MagicConstant
Should be one of: ResultSet.TYPE_FORWARD_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.TYPE_SCROLL_SENSITIVE
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return 0;
        }
    }
```

### MagicConstant
Should be one of: ResultSet.HOLD_CURSORS_OVER_COMMIT, ResultSet.CLOSE_CURSORS_AT_COMMIT
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return 0;
        }
    }
```

### MagicConstant
Should be one of: DatabaseMetaData.sqlStateXOpen, DatabaseMetaData.sqlStateSQL, DatabaseMetaData.sqlStateSQL99
in `src/main/java/org/apache/commons/dbcp2/DelegatingDatabaseMetaData.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return 0;
        }
    }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'obj == null' covered by subsequent condition '!(obj instanceof Reference)'
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
        // We only know how to deal with {@code javax.naming.Reference}s
        // that specify a class name of "javax.sql.DataSource"
        if (obj == null || !(obj instanceof Reference)) {
            return null;
        }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Synchronization`
in `src/main/java/org/apache/commons/dbcp2/managed/SynchronizationAdapter.java`
#### Snippet
```java

/**
 * Implements {@link Synchronization} for subclasses.
 */
class SynchronizationAdapter implements Synchronization {
```

### JavadocReference
Cannot resolve symbol `ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolableConnection.java`
#### Snippet
```java

/**
 * A delegating connection that, rather than closing the underlying connection, returns itself to an {@link ObjectPool}
 * when closed.
 *
```

### JavadocReference
Cannot resolve symbol `ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolingDriver.java`
#### Snippet
```java

/**
 * A {@link Driver} implementation that obtains {@link Connection}s from a registered {@link ObjectPool}.
 *
 * @since 2.0
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java

    /**
     * My {@link KeyedPooledObjectFactory} method for destroying {@link PreparedStatement}s.
     *
     * @param key
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java

    /**
     * My {@link KeyedPooledObjectFactory} method for activating {@link PreparedStatement}s.
     *
     * @param pooledObject Activates the underlying object.
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java

    /**
     * My {@link KeyedPooledObjectFactory} method for passivating {@link PreparedStatement}s. Currently invokes
     * {@link PreparedStatement#clearParameters}.
     *
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java

    /**
     * My {@link KeyedPooledObjectFactory} method for validating {@link PreparedStatement}s.
     *
     * @param key
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java

    /**
     * My {@link KeyedPooledObjectFactory} method for creating {@link PreparedStatement}s.
     *
     * @param key
```

### JavadocReference
Cannot resolve symbol `ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java

/**
 * A simple {@link DataSource} implementation that obtains {@link Connection}s from the specified {@link ObjectPool}.
 *
 * @param <C>
```

### JavadocReference
Cannot resolve symbol `ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java
    /**
     * Returns a {@link java.sql.Connection} from my pool, according to the contract specified by
     * {@link ObjectPool#borrowObject}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `borrowObject`
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java
    /**
     * Returns a {@link java.sql.Connection} from my pool, according to the contract specified by
     * {@link ObjectPool#borrowObject}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     *
     * @param maxTotal
```

### JavadocReference
Cannot resolve symbol `getMaxTotal()`
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     *
     * @param maxTotal
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java
     *
     * @param maxTotal
     *            {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     */
    public void setMaxTotal(final int maxTotal) {
```

### JavadocReference
Cannot resolve symbol `getMaxTotal()`
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java
     *
     * @param maxTotal
     *            {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     */
    public void setMaxTotal(final int maxTotal) {
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     *
     * @return {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
```

### JavadocReference
Cannot resolve symbol `getMaxTotal()`
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     *
     * @return {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java
     * Gets {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     *
     * @return {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     */
    public int getMaxTotal() {
```

### JavadocReference
Cannot resolve symbol `getMaxTotal()`
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java
     * Gets {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     *
     * @return {@link GenericKeyedObjectPool#getMaxTotal()} for this pool.
     */
    public int getMaxTotal() {
```

### JavadocReference
Cannot resolve symbol `KeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolablePreparedStatement.java`
#### Snippet
```java

    /**
     * My "key" as used by {@link KeyedObjectPool}.
     */
    private final K key;
```

### JavadocReference
Cannot resolve symbol `KeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolablePreparedStatement.java`
#### Snippet
```java

    /**
     * The {@link KeyedObjectPool} from which I was obtained.
     */
    private final KeyedObjectPool<K, PoolablePreparedStatement<K>> pool;
```

### JavadocReference
Cannot resolve symbol `KeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolablePreparedStatement.java`
#### Snippet
```java
     *            my underlying {@link PreparedStatement}
     * @param key
     *            my key" as used by {@link KeyedObjectPool}
     * @param pool
     *            the {@link KeyedObjectPool} from which I was obtained.
```

### JavadocReference
Cannot resolve symbol `KeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolablePreparedStatement.java`
#### Snippet
```java
     *            my key" as used by {@link KeyedObjectPool}
     * @param pool
     *            the {@link KeyedObjectPool} from which I was obtained.
     * @param conn
     *            the {@link java.sql.Connection Connection} from which I was created
```

### JavadocReference
Cannot resolve symbol `KeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/UserPassKey.java`
#### Snippet
```java
/**
 * <p>
 * Holds a user name and password pair. Serves as a poolable object key for the {@link KeyedObjectPool} backing a
 * {@link SharedPoolDataSource}. Two instances with the same user name are considered equal. This ensures that there
 * will be only one keyed pool for each user in the pool. The password is used (along with the user name) by the
```

### JavadocReference
Cannot resolve symbol `PooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java

/**
 * A {@link PooledObjectFactory} that creates {@link org.apache.commons.dbcp2.PoolableConnection PoolableConnection}s.
 *
 * @since 2.0
```

### JavadocReference
Cannot resolve symbol `ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
     *
     * @param pool
     *            the {@link ObjectPool} in which to pool those {@link Connection}s
     */
    public void setPool(final ObjectPool<PooledConnectionAndInfo> pool) {
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java

/**
 * A {@link KeyedPooledObjectFactory} that creates {@link org.apache.commons.dbcp2.PoolableConnection
 * PoolableConnection}s.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
     * @throws SQLException
     *             if the connection could not be created.
     * @see org.apache.commons.pool2.KeyedPooledObjectFactory#makeObject(Object)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `makeObject(Object)`
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
     * @throws SQLException
     *             if the connection could not be created.
     * @see org.apache.commons.pool2.KeyedPooledObjectFactory#makeObject(Object)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMaxWaitDuration()} for the specified user's pool or
     * the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMaxWaitDuration()} for the specified user's pool or
     * the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getNumTestsPerEvictionRun()} for the specified user's
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getNumTestsPerEvictionRun()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getNumTestsPerEvictionRun()} for the specified user's
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getLifo()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getLifo()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getLifo()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getBlockWhenExhausted()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getBlockWhenExhausted()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getBlockWhenExhausted()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMaxWaitDuration()} for the specified user's pool or
     * the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMaxWaitDuration()} for the specified user's pool or
     * the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     * Closes pool(s) maintained by this data source.
     *
     * @see org.apache.commons.pool2.ObjectPool#close()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `close()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     * Closes pool(s) maintained by this data source.
     *
     * @see org.apache.commons.pool2.ObjectPool#close()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getTestWhileIdle()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getTestWhileIdle()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getTestWhileIdle()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getTestOnCreate()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getTestOnCreate()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getTestOnCreate()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getSoftMinEvictableIdleDuration()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getSoftMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getSoftMinEvictableIdleDuration()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getTestWhileIdle()} for the specified user's pool or
     * the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getTestWhileIdle()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getTestWhileIdle()} for the specified user's pool or
     * the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getSoftMinEvictableIdleDuration()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getSoftMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getSoftMinEvictableIdleDuration()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMinEvictableIdleDuration()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMinEvictableIdleDuration()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getEvictionPolicyClassName()} for the specified user's
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getEvictionPolicyClassName()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getEvictionPolicyClassName()} for the specified user's
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getSoftMinEvictableIdleDuration()} for the specified
     * user's pool.
     *
```

### JavadocReference
Cannot resolve symbol `getSoftMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getSoftMinEvictableIdleDuration()} for the specified
     * user's pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getTestOnCreate()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getTestOnCreate()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getTestOnCreate()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMaxTotal()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getMaxTotal()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMaxTotal()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMaxIdle()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getMaxIdle()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMaxIdle()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for the specified
     * user's pool.
     *
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for the specified
     * user's pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getSoftMinEvictableIdleDuration()} for the specified
     * user's pool.
     *
```

### JavadocReference
Cannot resolve symbol `getSoftMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getSoftMinEvictableIdleDuration()} for the specified
     * user's pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMaxTotal()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getMaxTotal()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMaxTotal()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMinEvictableIdleDuration()} for the specified user's
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMinEvictableIdleDuration()} for the specified user's
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMaxWaitDuration()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMaxWaitDuration()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMinEvictableIdleDuration()} for the specified user's
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMinEvictableIdleDuration()} for the specified user's
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMinIdle()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getMinIdle()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMinIdle()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMinEvictableIdleDuration()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMinEvictableIdleDuration()} for the specified
     * user's pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getTestOnReturn()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getTestOnReturn()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getTestOnReturn()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMinIdle()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getMinIdle()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getMinIdle()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for the specified
     * user's pool.
     *
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for the specified
     * user's pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getTestOnBorrow()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getTestOnBorrow()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getTestOnBorrow()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getBlockWhenExhausted()} for the specified user's pool
     * or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getBlockWhenExhausted()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getBlockWhenExhausted()} for the specified user's pool
     * or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getEvictionPolicyClassName()} for the specified user's
     * pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getEvictionPolicyClassName()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getEvictionPolicyClassName()} for the specified user's
     * pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMaxWaitDuration()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMaxWaitDuration()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getNumTestsPerEvictionRun()} for the specified user's
     * pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getNumTestsPerEvictionRun()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getNumTestsPerEvictionRun()} for the specified user's
     * pool or the default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMaxIdle()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getMaxIdle()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getMaxIdle()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getTestOnBorrow()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getTestOnBorrow()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getTestOnBorrow()} for the specified user's pool or the
     * default if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getLifo()} for the specified user's pool or the default
     * if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `getLifo()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Gets the user specific value for {@link GenericObjectPool#getLifo()} for the specified user's pool or the default
     * if no user specific value is defined.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getTestOnReturn()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `getTestOnReturn()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    /**
     * Sets a user specific value for {@link GenericObjectPool#getTestOnReturn()} for the specified user's pool.
     *
     * @param userName
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     * Clears pool(s) maintained by this data source.
     *
     * @see org.apache.commons.pool2.ObjectPool#clear()
     * @since 2.3.0
     */
```

### JavadocReference
Cannot resolve symbol `clear()`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     * Clears pool(s) maintained by this data source.
     *
     * @see org.apache.commons.pool2.ObjectPool#clear()
     * @since 2.3.0
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * Q: But {@link org.apache.commons.dbcp2.PoolingDriver PoolingDriver} and
 * {@link org.apache.commons.dbcp2.PoolingDataSource PoolingDataSource} both expect an
 * {@link org.apache.commons.pool2.ObjectPool ObjectPool} as an input. Where do I get one of those?
 * </p>
 * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * </p>
 * <p>
 * A: The {@link org.apache.commons.pool2.ObjectPool ObjectPool} interface is defined in Commons Pool. You can use one
 * of the provided implementations such as {@link org.apache.commons.pool2.impl.GenericObjectPool GenericObjectPool},
 * {@link org.apache.commons.pool2.proxy.ProxiedObjectPool ProxiedObjectPool} or
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * <p>
 * A: The {@link org.apache.commons.pool2.ObjectPool ObjectPool} interface is defined in Commons Pool. You can use one
 * of the provided implementations such as {@link org.apache.commons.pool2.impl.GenericObjectPool GenericObjectPool},
 * {@link org.apache.commons.pool2.proxy.ProxiedObjectPool ProxiedObjectPool} or
 * {@link org.apache.commons.pool2.impl.SoftReferenceObjectPool SoftReferenceObjectPool} or you can create your own.
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.proxy.ProxiedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * A: The {@link org.apache.commons.pool2.ObjectPool ObjectPool} interface is defined in Commons Pool. You can use one
 * of the provided implementations such as {@link org.apache.commons.pool2.impl.GenericObjectPool GenericObjectPool},
 * {@link org.apache.commons.pool2.proxy.ProxiedObjectPool ProxiedObjectPool} or
 * {@link org.apache.commons.pool2.impl.SoftReferenceObjectPool SoftReferenceObjectPool} or you can create your own.
 * </p>
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.SoftReferenceObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * of the provided implementations such as {@link org.apache.commons.pool2.impl.GenericObjectPool GenericObjectPool},
 * {@link org.apache.commons.pool2.proxy.ProxiedObjectPool ProxiedObjectPool} or
 * {@link org.apache.commons.pool2.impl.SoftReferenceObjectPool SoftReferenceObjectPool} or you can create your own.
 * </p>
 * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * </p>
 * <p>
 * Q: Ok, I've found an {@link org.apache.commons.pool2.ObjectPool ObjectPool} implementation that I think suits my
 * connection pooling needs. But it wants a {@link org.apache.commons.pool2.PooledObjectFactory PooledObjectFactory}.
 * What should I use for that?
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.PooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * <p>
 * Q: Ok, I've found an {@link org.apache.commons.pool2.ObjectPool ObjectPool} implementation that I think suits my
 * connection pooling needs. But it wants a {@link org.apache.commons.pool2.PooledObjectFactory PooledObjectFactory}.
 * What should I use for that?
 * </p>
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.PooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * A: The DBCP package provides a class for this purpose. It's called
 * {@link org.apache.commons.dbcp2.PoolableConnectionFactory}. It implements the factory and lifecycle methods of
 * {@link org.apache.commons.pool2.PooledObjectFactory} for {@link java.sql.Connection}s. But it doesn't create the
 * actual database {@link java.sql.Connection}s itself, it uses a {@link org.apache.commons.dbcp2.ConnectionFactory} for
 * that. The {@link org.apache.commons.dbcp2.PoolableConnectionFactory} will take {@link java.sql.Connection}s created
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * </p>
 * <p>
 * The {@link org.apache.commons.dbcp2.PoolingDataSource} uses an underlying {@link org.apache.commons.pool2.ObjectPool}
 * to create and store its {@link java.sql.Connection}.
 * </p>
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * </p>
 * <p>
 * To create a {@link org.apache.commons.pool2.ObjectPool}, you'll need a
 * {@link org.apache.commons.pool2.PooledObjectFactory} that creates the actual {@link java.sql.Connection}s. That's
 * what {@link org.apache.commons.dbcp2.PoolableConnectionFactory} is for.
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.PooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * <p>
 * To create a {@link org.apache.commons.pool2.ObjectPool}, you'll need a
 * {@link org.apache.commons.pool2.PooledObjectFactory} that creates the actual {@link java.sql.Connection}s. That's
 * what {@link org.apache.commons.dbcp2.PoolableConnectionFactory} is for.
 * </p>
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * <li>A {@link org.apache.commons.dbcp2.ConnectionFactory} from which the actual database {@link java.sql.Connection}s
 * will be obtained.</li>
 * <li>An empty and factory-less {@link org.apache.commons.pool2.ObjectPool} in which the {@link java.sql.Connection}s
 * will be stored. <br>
 * When you pass an {@link org.apache.commons.pool2.ObjectPool} into the
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * <li>An empty and factory-less {@link org.apache.commons.pool2.ObjectPool} in which the {@link java.sql.Connection}s
 * will be stored. <br>
 * When you pass an {@link org.apache.commons.pool2.ObjectPool} into the
 * {@link org.apache.commons.dbcp2.PoolableConnectionFactory}, it will automatically register itself as the
 * {@link org.apache.commons.pool2.PooledObjectFactory} for that pool.</li>
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.PooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/package-info.java`
#### Snippet
```java
 * When you pass an {@link org.apache.commons.pool2.ObjectPool} into the
 * {@link org.apache.commons.dbcp2.PoolableConnectionFactory}, it will automatically register itself as the
 * {@link org.apache.commons.pool2.PooledObjectFactory} for that pool.</li>
 * </ol>
 * <p>
```

### JavadocReference
Cannot resolve symbol `PooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/PoolableConnectionFactory.java`
#### Snippet
```java

/**
 * A {@link PooledObjectFactory} that creates {@link PoolableConnection}s.
 *
 * @since 2.0
```

### JavadocReference
Cannot resolve symbol `ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolableConnectionFactory.java`
#### Snippet
```java
    }
    /**
     * Returns the {@link ObjectPool} in which {@link Connection}s are pooled.
     *
     * @return the connection pool
```

### JavadocReference
Cannot resolve symbol `ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolableConnectionFactory.java`
#### Snippet
```java

    /**
     * Sets the {@link ObjectPool} in which to pool {@link Connection}s.
     *
     * @param pool
```

### JavadocReference
Cannot resolve symbol `ObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolableConnectionFactory.java`
#### Snippet
```java
     *
     * @param pool
     *            the {@link ObjectPool} in which to pool those {@link Connection}s
     */
    public synchronized void setPool(final ObjectPool<PoolableConnection> pool) {
```

### JavadocReference
Cannot resolve symbol `BasicDataSource`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
     * <p>
     * When a negative value is supplied,
     * {@code ceil({@link BasicDataSource#getNumIdle})/abs({@link #getNumTestsPerEvictionRun})} tests will be run.
     * I.e., when the value is <i>-n</i>, roughly one <i>n</i>th of the idle objects will be tested per run.
     * </p>
```

### JavadocReference
Cannot resolve symbol `getNumIdle`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
     * <p>
     * When a negative value is supplied,
     * {@code ceil({@link BasicDataSource#getNumIdle})/abs({@link #getNumTestsPerEvictionRun})} tests will be run.
     * I.e., when the value is <i>-n</i>, roughly one <i>n</i>th of the idle objects will be tested per run.
     * </p>
```

### JavadocReference
Cannot resolve symbol `KeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolableCallableStatement.java`
#### Snippet
```java

    /**
     * Key for this statement in the containing {@link KeyedObjectPool}.
     */
    private final PStmtKey key;
```

### JavadocReference
Cannot resolve symbol `KeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolableCallableStatement.java`
#### Snippet
```java
     *            the underlying {@link CallableStatement}
     * @param key
     *            the key for this statement in the {@link KeyedObjectPool}
     * @param pool
     *            the {@link KeyedObjectPool} from which this CallableStatement was obtained
```

### JavadocReference
Cannot resolve symbol `KeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolableCallableStatement.java`
#### Snippet
```java
     *            the key for this statement in the {@link KeyedObjectPool}
     * @param pool
     *            the {@link KeyedObjectPool} from which this CallableStatement was obtained
     * @param connection
     *            the {@link DelegatingConnection} that created this CallableStatement
```

### JavadocReference
Cannot resolve symbol `KeyedObjectPool`
in `src/main/java/org/apache/commons/dbcp2/PoolableCallableStatement.java`
#### Snippet
```java

    /**
     * The {@link KeyedObjectPool} from which this CallableStatement was obtained.
     */
    private final KeyedObjectPool<PStmtKey, DelegatingPreparedStatement> pool;
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnBorrow()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getTestOnBorrow()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getTestOnBorrow()} for each per user pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per
     *         user pool.
     * @deprecated Use {@link #getDefaultMinEvictableIdleDuration()}.
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per
     *         user pool.
     * @deprecated Use {@link #getDefaultMinEvictableIdleDuration()}.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @param maxWaitMillis
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @param maxWaitMillis
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param maxWaitMillis
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     * @since 2.9.0
     */
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param maxWaitMillis
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     * @since 2.9.0
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     *
     * @param lifo
```

### JavadocReference
Cannot resolve symbol `getLifo()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     *
     * @param lifo
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param lifo
     *            The default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     */
    public void setDefaultLifo(final boolean lifo) {
```

### JavadocReference
Cannot resolve symbol `getLifo()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param lifo
     *            The default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     */
    public void setDefaultLifo(final boolean lifo) {
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param defaultMinEvictableIdleDuration
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each
     *            per user pool.
     * @since 2.10.0
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param defaultMinEvictableIdleDuration
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each
     *            per user pool.
     * @since 2.10.0
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getEvictionPolicyClassName()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getEvictionPolicyClassName()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getEvictionPolicyClassName()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getEvictionPolicyClassName()} for each per user
     *         pool.
     */
```

### JavadocReference
Cannot resolve symbol `getEvictionPolicyClassName()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getEvictionPolicyClassName()} for each per user
     *         pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     *
     * @param minIdle
```

### JavadocReference
Cannot resolve symbol `getMinIdlePerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     *
     * @param minIdle
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param minIdle
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     */
    public void setDefaultMinIdle(final int minIdle) {
```

### JavadocReference
Cannot resolve symbol `getMinIdlePerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param minIdle
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     */
    public void setDefaultMinIdle(final int minIdle) {
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param defaultSoftMinEvictableIdleDuration
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     * @since 2.10.0
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getNumTestsPerEvictionRun()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getNumTestsPerEvictionRun()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getNumTestsPerEvictionRun()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param numTestsPerEvictionRun
     *            The default value for {@link GenericKeyedObjectPoolConfig#getNumTestsPerEvictionRun()} for each per
     *            user pool.
     */
```

### JavadocReference
Cannot resolve symbol `getNumTestsPerEvictionRun()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param numTestsPerEvictionRun
     *            The default value for {@link GenericKeyedObjectPoolConfig#getNumTestsPerEvictionRun()} for each per
     *            user pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitMillis()} for each per user pool.
     *
     * @param maxWaitMillis
```

### JavadocReference
Cannot resolve symbol `getMaxWaitMillis()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitMillis()} for each per user pool.
     *
     * @param maxWaitMillis
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param maxWaitMillis
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitMillis()} for each per user pool.
     * @deprecated Use {@link #setDefaultMaxWait(Duration)}.
     */
```

### JavadocReference
Cannot resolve symbol `getMaxWaitMillis()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param maxWaitMillis
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitMillis()} for each per user pool.
     * @deprecated Use {@link #setDefaultMaxWait(Duration)}.
     */
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     *
     * @param defaultDurationBetweenEvictionRuns The default value for
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     *
     * @param defaultDurationBetweenEvictionRuns The default value for
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param defaultDurationBetweenEvictionRuns The default value for
     *        {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     * @since 2.10.0
     */
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param defaultDurationBetweenEvictionRuns The default value for
     *        {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     * @since 2.10.0
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     * @deprecated Use {@link #getDefaultSoftMinEvictableIdleDuration()}.
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     *
     * @return The default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     *
     * @return The default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     *
     * @return The default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     * @deprecated Use {@link #getDefaultDurationBetweenEvictionRuns()}.
     */
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     *
     * @return The default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns ()} for each per user pool.
     * @deprecated Use {@link #getDefaultDurationBetweenEvictionRuns()}.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `getMaxTotalPerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     */
    public int getDefaultMaxTotal() {
```

### JavadocReference
Cannot resolve symbol `getMaxTotalPerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     */
    public int getDefaultMaxTotal() {
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestWhileIdle()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getTestWhileIdle()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getTestWhileIdle()} for each per user pool.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnCreate()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param testOnCreate
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getTestOnCreate()} for each per user pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user
```

### JavadocReference
Cannot resolve symbol `getBlockWhenExhausted()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user
     *         pool.
     */
```

### JavadocReference
Cannot resolve symbol `getBlockWhenExhausted()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user
     *         pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     * @deprecated Use {@link #getDefaultMaxWait()}.
     */
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     * @deprecated Use {@link #getDefaultMaxWait()}.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnCreate()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getTestOnCreate()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getTestOnCreate()} for each per user pool.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param softMinEvictableIdleTimeMillis
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     * @deprecated Use {@link #setDefaultSoftMinEvictableIdle(Duration)}.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `getLifo()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     */
    public boolean getDefaultLifo() {
```

### JavadocReference
Cannot resolve symbol `getLifo()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getLifo()} for each per user pool.
     */
    public boolean getDefaultLifo() {
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getEvictionPolicyClassName()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getEvictionPolicyClassName()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getEvictionPolicyClassName()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param evictionPolicyClassName
     *            The default value for {@link GenericKeyedObjectPoolConfig#getEvictionPolicyClassName()} for each per
     *            user pool.
     */
```

### JavadocReference
Cannot resolve symbol `getEvictionPolicyClassName()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param evictionPolicyClassName
     *            The default value for {@link GenericKeyedObjectPoolConfig#getEvictionPolicyClassName()} for each per
     *            user pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user pool.
     *
     * @param blockWhenExhausted
```

### JavadocReference
Cannot resolve symbol `getBlockWhenExhausted()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user pool.
     *
     * @param blockWhenExhausted
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param blockWhenExhausted
     *            The default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user
     *            pool.
     */
```

### JavadocReference
Cannot resolve symbol `getBlockWhenExhausted()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param blockWhenExhausted
     *            The default value for {@link GenericKeyedObjectPoolConfig#getBlockWhenExhausted()} for each per user
     *            pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     *
     * @param maxIdle
```

### JavadocReference
Cannot resolve symbol `getMaxIdlePerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     *
     * @param maxIdle
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param maxIdle
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     */
    public void setDefaultMaxIdle(final int maxIdle) {
```

### JavadocReference
Cannot resolve symbol `getMaxIdlePerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param maxIdle
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     */
    public void setDefaultMaxIdle(final int maxIdle) {
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestWhileIdle()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param testWhileIdle
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getTestWhileIdle()} for each per user pool.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     * @since 2.10.0
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     *
     * @param timeBetweenEvictionRunsMillis The default value for
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     *
     * @param timeBetweenEvictionRunsMillis The default value for
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param timeBetweenEvictionRunsMillis The default value for
     *        {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     * @deprecated Use {@link #setDefaultDurationBetweenEvictionRuns(Duration)}.
     */
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param timeBetweenEvictionRunsMillis The default value for
     *        {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     * @deprecated Use {@link #setDefaultDurationBetweenEvictionRuns(Duration)}.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnReturn()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getTestOnReturn()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getTestOnReturn()} for each per user pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     * @since 2.9.0
     */
```

### JavadocReference
Cannot resolve symbol `getMaxWaitDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxWaitDuration()} for each per user pool.
     * @since 2.9.0
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     *
     * @param maxTotal
```

### JavadocReference
Cannot resolve symbol `getMaxTotalPerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     *
     * @param maxTotal
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param maxTotal
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     */
    public void setDefaultMaxTotal(final int maxTotal) {
```

### JavadocReference
Cannot resolve symbol `getMaxTotalPerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param maxTotal
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMaxTotalPerKey()} for each per user pool.
     */
    public void setDefaultMaxTotal(final int maxTotal) {
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getNumTestsPerEvictionRun()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getNumTestsPerEvictionRun()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getNumTestsPerEvictionRun()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getNumTestsPerEvictionRun()} for each per user
     *         pool.
     */
```

### JavadocReference
Cannot resolve symbol `getNumTestsPerEvictionRun()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getNumTestsPerEvictionRun()} for each per user
     *         pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `getMinIdlePerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     */
    public int getDefaultMinIdle() {
```

### JavadocReference
Cannot resolve symbol `getMinIdlePerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMinIdlePerKey()} for each per user pool.
     */
    public int getDefaultMinIdle() {
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnReturn()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param testOnReturn
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getTestOnReturn()} for each per user pool.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnBorrow()} for each per user pool.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.impl.GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param testOnBorrow
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getTestOnBorrow()} for each per user pool.
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param minEvictableIdleTimeMillis
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each
     *            per user pool.
     * @deprecated Use {@link #setDefaultMinEvictableIdle(Duration)}.
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param minEvictableIdleTimeMillis
     *            The default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each
     *            per user pool.
     * @deprecated Use {@link #setDefaultMinEvictableIdle(Duration)}.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `getMaxIdlePerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     */
    public int getDefaultMaxIdle() {
```

### JavadocReference
Cannot resolve symbol `getMaxIdlePerKey()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMaxIdlePerKey()} for each per user pool.
     */
    public int getDefaultMaxIdle() {
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     *
     * @return The default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     *
     * @return The default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     *
     * @return The default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     * @since 2.10.0
     */
```

### JavadocReference
Cannot resolve symbol `getDurationBetweenEvictionRuns()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Gets the default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     *
     * @return The default value for {@link GenericObjectPool#getDurationBetweenEvictionRuns()} for each per user pool.
     * @since 2.10.0
     */
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per user
     * pool.
     *
```

### JavadocReference
Cannot resolve symbol `GenericKeyedObjectPoolConfig`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per
     *         user pool.
     * @since 2.10.0
```

### JavadocReference
Cannot resolve symbol `getMinEvictableIdleDuration()`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * pool.
     *
     * @return The default value for {@link GenericKeyedObjectPoolConfig#getMinEvictableIdleDuration()} for each per
     *         user pool.
     * @since 2.10.0
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java

    /**
     * {@link KeyedPooledObjectFactory} method for creating {@link PoolablePreparedStatement}s or
     * {@link PoolableCallableStatement}s. The {@code stmtType} field in the key determines whether a
     * PoolablePreparedStatement or PoolableCallableStatement is created.
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java

    /**
     * {@link KeyedPooledObjectFactory} method for passivating {@link PreparedStatement}s or {@link CallableStatement}s.
     * Invokes {@link PreparedStatement#clearParameters}.
     *
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java

    /**
     * {@link KeyedPooledObjectFactory} method for activating pooled statements.
     *
     * @param key
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java

    /**
     * {@link KeyedPooledObjectFactory} method for validating pooled statements. Currently always returns true.
     *
     * @param key
```

### JavadocReference
Cannot resolve symbol `KeyedPooledObjectFactory`
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java

    /**
     * {@link KeyedPooledObjectFactory} method for destroying PoolablePreparedStatements and PoolableCallableStatements.
     * Closes the underlying statement.
     *
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     *
     * @param minIdle the new value for minIdle
     * @see GenericObjectPool#setMinIdle(int)
     */
    public synchronized void setMinIdle(final int minIdle) {
```

### JavadocReference
Cannot resolve symbol `setMinIdle(int)`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     *
     * @param minIdle the new value for minIdle
     * @see GenericObjectPool#setMinIdle(int)
     */
    public synchronized void setMinIdle(final int minIdle) {
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     *
     * @return the minimum number of idle connections
     * @see GenericObjectPool#getMinIdle()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getMinIdle()`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     *
     * @return the minimum number of idle connections
     * @see GenericObjectPool#getMinIdle()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.UsageTracking`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java

    /**
     * If the connection pool implements {@link org.apache.commons.pool2.UsageTracking UsageTracking}, should the
     * connection pool record a stack trace every time a method is called on a pooled connection and retain the most
     * recent stack trace to aid debugging of abandoned connections?
```

### JavadocReference
Cannot resolve symbol `GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * This implementation configures all pool properties other than timeBetweenEvictionRunsMillis. Setting that
     * property is deferred to {@link #startPoolMaintenance()}, since setting timeBetweenEvictionRunsMillis to a
     * positive value causes {@link GenericObjectPool}'s eviction timer to be started.
     * </p>
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.pool2.UsageTracking`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java

    /**
     * If the connection pool implements {@link org.apache.commons.pool2.UsageTracking UsageTracking}, configure whether
     * the connection pool should record a stack trace every time a method is called on a pooled connection and retain
     * the most recent stack trace to aid debugging of abandoned connections.
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `src/main/java/org/apache/commons/dbcp2/AbandonedTrace.java`
#### Snippet
```java
    protected void removeThisTrace(final Object source) {
        if (source instanceof AbandonedTrace) {
            AbandonedTrace.class.cast(source).removeTrace(this);
        }
    }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `prepareStatement` may produce `NullPointerException`
in `src/main/java/org/apache/commons/dbcp2/PoolableConnection.java`
#### Snippet
```java
            // Has to be the innermost delegate else the prepared statement will
            // be closed when the pooled connection is passivated.
            validationPreparedStatement = getInnermostDelegateInternal().prepareStatement(sql);
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
                    System.err.println("WARNING: defaultTransactionIsolation not set");
                    System.err.println("using default value of database driver");
                    level = PoolableConnectionFactory.UNKNOWN_TRANSACTION_ISOLATION;
                }
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
                valid = conn.isValid((int) timeoutDuration.getSeconds());
            } catch (final SQLException e) {
                valid = false;
            } finally {
                Utils.closeQuietly((AutoCloseable) conn);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
                valid = conn.isValid((int) timeoutDuration.getSeconds());
            } catch (final SQLException e) {
                valid = false;
            } finally {
                Utils.closeQuietly((AutoCloseable) conn);
```

### DataFlowIssue
Method invocation `borrowObject` may produce `NullPointerException`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
            }
            try {
                info = pool.borrowObject();
            } catch (final Exception ex) {
                throw new SQLException("Could not retrieve connection info from pool", ex);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/dbcp2/Jdbc41Bridge.java`
#### Snippet
```java
     * @param milliseconds
     *            {@link Connection#setNetworkTimeout(Executor, int)}
     * @throws SQLException
     *             {@link Connection#setNetworkTimeout(Executor, int)}
     * @see Connection#setNetworkTimeout(Executor, int)
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * </p>
     * <ul>
     * <li>{@link #getRemoveAbandonedOnBorrow()}</li>
     * <li>{@link #getNumActive()} &gt; {@link #getMaxTotal()} - 3</li>
     * <li>{@link #getNumIdle()} &lt; 2</li>
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * underlying JDBC connections are closed. These connections do not count in {@link #getMaxTotal()} or
     * {@link #getNumActive()} after invoking this method. For example, if there are 3 connections checked out by
     * clients when {@link #restart()} is invoked, after this method is called, {@link #getNumActive()} will
     * return 0 and up to {@link #getMaxTotal()} + 3 connections may be open until the connections sourced from
     * the original pool are returned.
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * before the datasource was stopped do not count in {@link #getMaxTotal()} or {@link #getNumActive()}.
     * For example, if there are 3 connections checked out by clients when {@link #close()} is invoked and they are
     * not returned before {@link #start()} is invoked, after this method is called, {@link #getNumActive()} will
     * return 0.  These connections will be physically closed when they are returned, but they will not count against
     * the maximum allowed in the newly started datasource.
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `pgconn.pool` to `ObjectPool` is redundant
in `src/main/java/org/apache/commons/dbcp2/PoolingDriver.java`
#### Snippet
```java
        final PoolGuardConnectionWrapper pgconn = (PoolGuardConnectionWrapper) conn;
        @SuppressWarnings("unchecked")
        final ObjectPool<Connection> pool = (ObjectPool<Connection>) pgconn.pool;
        try {
            pool.invalidateObject(pgconn.getDelegateInternal());
```

### RedundantCast
Casting `this.pool` to `ObjectPool` is redundant
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java
                log.warn(Utils.getMessage("poolingDataSource.factoryConfig"));
                @SuppressWarnings("unchecked") // PCF must have a pool of PCs
                final ObjectPool<PoolableConnection> p = (ObjectPool<PoolableConnection>) this.pool;
                pcf.setPool(p);
            }
```

### RedundantCast
Casting `null` to `char[]` is redundant
in `src/main/java/org/apache/commons/dbcp2/managed/DataSourceXAConnectionFactory.java`
#### Snippet
```java
     */
    public DataSourceXAConnectionFactory(final TransactionManager transactionManager, final XADataSource xaDataSource, final TransactionSynchronizationRegistry transactionSynchronizationRegistry) {
        this(transactionManager, xaDataSource, null, (char[]) null, transactionSynchronizationRegistry);
    }

```

### RedundantCast
Casting `null` to `char[]` is redundant
in `src/main/java/org/apache/commons/dbcp2/managed/DataSourceXAConnectionFactory.java`
#### Snippet
```java
     */
    public DataSourceXAConnectionFactory(final TransactionManager transactionManager, final XADataSource xaDataSource) {
        this(transactionManager, xaDataSource, null, (char[]) null, null);
    }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'CPDSConnectionFactory' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public CPDSConnectionFactory(final ConnectionPoolDataSource cpds, final String validationQuery, final int validationQueryTimeoutSeconds,
            final boolean rollbackAfterValidation, final String userName, final String userPassword) {
        this(cpds, validationQuery, validationQueryTimeoutSeconds, rollbackAfterValidation, userName, Utils.toCharArray(userPassword));
```

### DeprecatedIsStillUsed
Deprecated member 'KeyedCPDSConnectionFactory' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public KeyedCPDSConnectionFactory(final ConnectionPoolDataSource cpds, final String validationQuery,
            final int validationQueryTimeoutSeconds, final boolean rollbackAfterValidation) {
        this(cpds, validationQuery, Duration.ofSeconds(validationQueryTimeoutSeconds), rollbackAfterValidation);
```

### DeprecatedIsStillUsed
Deprecated member 'setPerUserTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setPerUserTimeBetweenEvictionRunsMillis(final String userName, final Long value) {
        setPerUserDurationBetweenEvictionRuns(userName, toDurationOrNull(value));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getPerUserMaxWaitMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public long getPerUserMaxWaitMillis(final String userName) {
        return getPerUserMaxWaitDuration(userName).toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setPerUserSoftMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setPerUserSoftMinEvictableIdleTimeMillis(final String userName, final Long value) {
        setPerUserSoftMinEvictableIdle(userName, toDurationOrNull(value));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getPerUserSoftMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public long getPerUserSoftMinEvictableIdleTimeMillis(final String userName) {
        return getPerUserSoftMinEvictableIdleDuration(userName).toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setPerUserMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setPerUserMinEvictableIdleTimeMillis(final String userName, final Long value) {
        setPerUserMinEvictableIdle(userName, toDurationOrNull(value));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setPerUserMaxWaitMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setPerUserMaxWaitMillis(final String userName, final Long value) {
        setPerUserMaxWait(userName, toDurationOrNull(value));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getPerUserTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public long getPerUserTimeBetweenEvictionRunsMillis(final String userName) {
        return getPerUserDurationBetweenEvictionRuns(userName).toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getPerUserMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public long getPerUserMinEvictableIdleTimeMillis(final String userName) {
        return getPerUserMinEvictableIdleDuration(userName).toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DISCONNECTION_SQL_CODES' is still used
in `src/main/java/org/apache/commons/dbcp2/Utils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Set<String> DISCONNECTION_SQL_CODES;

    static final ResultSet[] EMPTY_RESULT_SET_ARRAY = {};
```

### DeprecatedIsStillUsed
Deprecated member 'PStmtKeyCPDS' is still used
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PStmtKeyCPDS.java`
#### Snippet
```java
 */
@Deprecated
public class PStmtKeyCPDS extends PStmtKey {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
     */
    @Deprecated
    public void setMinEvictableIdleTimeMillis(final int minEvictableIdleTimeMillis) {
        assertInitializationAllowed();
        this.minEvictableIdleDuration = Duration.ofMillis(minEvictableIdleTimeMillis);
```

### DeprecatedIsStillUsed
Deprecated member 'getMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
     */
    @Deprecated
    public int getMinEvictableIdleTimeMillis() {
        return (int) minEvictableIdleDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
     */
    @Deprecated
    public void setTimeBetweenEvictionRunsMillis(final long timeBetweenEvictionRunsMillis) {
        assertInitializationAllowed();
        this.durationBetweenEvictionRuns = Duration.ofMillis(timeBetweenEvictionRunsMillis);
```

### DeprecatedIsStillUsed
Deprecated member 'getTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
     */
    @Deprecated
    public long getTimeBetweenEvictionRunsMillis() {
        return durationBetweenEvictionRuns.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getBigDecimal' is still used
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
    @Override
    @Deprecated
    public BigDecimal getBigDecimal(final int parameterIndex, final int scale) throws SQLException {
        checkOpen();
        try {
```

### DeprecatedIsStillUsed
Deprecated member 'setDefaultMaxWaitMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setDefaultMaxWaitMillis(final long maxWaitMillis) {
        setDefaultMaxWait(Duration.ofMillis(maxWaitMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getDefaultMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public long getDefaultMinEvictableIdleTimeMillis() {
        return this.defaultMinEvictableIdleDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getDefaultMaxWaitMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public long getDefaultMaxWaitMillis() {
        return getDefaultMaxWait().toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setDefaultSoftMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setDefaultSoftMinEvictableIdleTimeMillis(final long softMinEvictableIdleTimeMillis) {
        assertInitializationAllowed();
        this.defaultSoftMinEvictableIdleDuration = Duration.ofMillis(softMinEvictableIdleTimeMillis);
```

### DeprecatedIsStillUsed
Deprecated member 'getDefaultSoftMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public long getDefaultSoftMinEvictableIdleTimeMillis() {
        return this.defaultSoftMinEvictableIdleDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getValidationQueryTimeout' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public int getValidationQueryTimeout() {
        return (int) validationQueryTimeoutDuration.getSeconds();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getMaxConnLifetimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public long getMaxConnLifetimeMillis() {
        return maxConnDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setMaxConnLifetimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setMaxConnLifetimeMillis(final long maxConnLifetimeMillis) {
        setMaxConnLifetime(Duration.ofMillis(maxConnLifetimeMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setDefaultMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setDefaultMinEvictableIdleTimeMillis(final long minEvictableIdleTimeMillis) {
        assertInitializationAllowed();
        this.defaultMinEvictableIdleDuration = Duration.ofMillis(minEvictableIdleTimeMillis);
```

### DeprecatedIsStillUsed
Deprecated member 'getDefaultTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public long getDefaultTimeBetweenEvictionRunsMillis() {
        return this.defaultDurationBetweenEvictionRuns.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setValidationQueryTimeout' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setValidationQueryTimeout(final int validationQueryTimeoutSeconds) {
        this.validationQueryTimeoutDuration = Duration.ofSeconds(validationQueryTimeoutSeconds);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setDefaultTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setDefaultTimeBetweenEvictionRunsMillis(final long timeBetweenEvictionRunsMillis) {
        assertInitializationAllowed();
        this.defaultDurationBetweenEvictionRuns = Duration.ofMillis(timeBetweenEvictionRunsMillis);
```

### DeprecatedIsStillUsed
Deprecated member 'setUnicodeStream' is still used
in `src/main/java/org/apache/commons/dbcp2/DelegatingPreparedStatement.java`
#### Snippet
```java
    @Deprecated
    @Override
    public void setUnicodeStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
        checkOpen();
        try {
```

### DeprecatedIsStillUsed
Deprecated member 'getLastUsed' is still used
in `src/main/java/org/apache/commons/dbcp2/AbandonedTrace.java`
#### Snippet
```java
    @Override
    @Deprecated
    public long getLastUsed() {
        return lastUsedInstant.toEpochMilli();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getBigDecimal' is still used
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
    @Deprecated
    @Override
    public BigDecimal getBigDecimal(final String columnName, final int scale) throws SQLException {
        try {
            return resultSet.getBigDecimal(columnName);
```

### DeprecatedIsStillUsed
Deprecated member 'getUnicodeStream' is still used
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
    @Deprecated
    @Override
    public InputStream getUnicodeStream(final String columnName) throws SQLException {
        try {
            return resultSet.getUnicodeStream(columnName);
```

### DeprecatedIsStillUsed
Deprecated member 'getUnicodeStream' is still used
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
    @Deprecated
    @Override
    public InputStream getUnicodeStream(final int columnIndex) throws SQLException {
        try {
            return resultSet.getUnicodeStream(columnIndex);
```

### DeprecatedIsStillUsed
Deprecated member 'getBigDecimal' is still used
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
    @Deprecated
    @Override
    public BigDecimal getBigDecimal(final int columnIndex, final int scale) throws SQLException {
        try {
            return resultSet.getBigDecimal(columnIndex);
```

### DeprecatedIsStillUsed
Deprecated member 'getDefaultQueryTimeout' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public Integer getDefaultQueryTimeout() {
        return defaultQueryTimeoutDuration == null ? null : (int) defaultQueryTimeoutDuration.getSeconds();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setMaxConnLifetimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setMaxConnLifetimeMillis(final long maxConnLifetimeMillis) {
        this.maxConnDuration = Duration.ofMillis(maxConnLifetimeMillis);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getSoftMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    @Deprecated
    @Override
    public synchronized long getSoftMinEvictableIdleTimeMillis() {
        return softMinEvictableIdleDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public synchronized void setTimeBetweenEvictionRunsMillis(final long timeBetweenEvictionRunsMillis) {
        setDurationBetweenEvictionRuns(Duration.ofMillis(timeBetweenEvictionRunsMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setSoftMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public synchronized void setSoftMinEvictableIdleTimeMillis(final long softMinEvictableIdleTimeMillis) {
        setSoftMinEvictableIdle(Duration.ofMillis(softMinEvictableIdleTimeMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setValidationQueryTimeout' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setValidationQueryTimeout(final int validationQueryTimeoutSeconds) {
        this.validationQueryTimeoutDuration = Duration.ofSeconds(validationQueryTimeoutSeconds);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getValidationQueryTimeout' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    @Deprecated
    @Override
    public int getValidationQueryTimeout() {
        return (int) validationQueryTimeoutDuration.getSeconds();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    @Deprecated
    @Override
    public synchronized long getTimeBetweenEvictionRunsMillis() {
        return this.durationBetweenEvictionRuns.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getRemoveAbandonedTimeout' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    @Deprecated
    @Override
    public int getRemoveAbandonedTimeout() {
        return (int) getRemoveAbandonedTimeoutDuration().getSeconds();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setMaxWaitMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public synchronized void setMaxWaitMillis(final long maxWaitMillis) {
        setMaxWait(Duration.ofMillis(maxWaitMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public synchronized void setMinEvictableIdleTimeMillis(final long minEvictableIdleTimeMillis) {
        setMinEvictableIdle(Duration.ofMillis(minEvictableIdleTimeMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    @Deprecated
    @Override
    public synchronized long getMinEvictableIdleTimeMillis() {
        return this.minEvictableIdleDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setRemoveAbandonedTimeout' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setRemoveAbandonedTimeout(final int removeAbandonedTimeout) {
        setAbandoned(AbandonedConfig::setRemoveAbandonedTimeout, Duration.ofSeconds(removeAbandonedTimeout));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setDefaultQueryTimeout' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @Deprecated
    public void setDefaultQueryTimeout(final Integer defaultQueryTimeoutSeconds) {
        this.defaultQueryTimeoutDuration = defaultQueryTimeoutSeconds == null ? null : Duration.ofSeconds(defaultQueryTimeoutSeconds);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getMaxWaitMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    @Deprecated
    @Override
    public synchronized long getMaxWaitMillis() {
        return this.maxWaitDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getMaxConnLifetimeMillis' is still used
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    @Override
    @Deprecated
    public long getMaxConnLifetimeMillis() {
        return maxConnDuration.toMillis();
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/org/apache/commons/dbcp2/datasources/PooledConnectionManager.java`
#### Snippet
```java
    void invalidate(PooledConnection pc) throws SQLException;

//    /**
//     * Sets the database password used when creating connections.
//     *
```

### CommentedOutCode
Commented out code (14 lines)
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    public void setConnectionInitSqls(final Collection<String> connectionInitSqls) {
//        if (connectionInitSqls != null && !connectionInitSqls.isEmpty()) {
//            ArrayList<String> newVal = null;
//            for (final String s : connectionInitSqls) {
```

### CommentedOutCode
Commented out code (14 lines)
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    public void setDisconnectionSqlCodes(final Collection<String> disconnectionSqlCodes) {
//        if (disconnectionSqlCodes != null && !disconnectionSqlCodes.isEmpty()) {
//            HashSet<String> newVal = null;
//            for (final String s : disconnectionSqlCodes) {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Objects.toString()` call
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java
    @Override
    public synchronized String toString() {
        return "PoolingConnection: " + Objects.toString(pStmtPool);
    }

```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `sqle` is immediately rethrown
in `src/main/java/org/apache/commons/dbcp2/PoolableConnection.java`
#### Snippet
```java
                throw new SQLException("validationQuery didn't return a row");
            }
        } catch (final SQLException sqle) {
            throw sqle;
        }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * @return a key to uniquely identify a prepared statement.
     */
    protected PStmtKey createKey(final String sql, final int resultSetType, final int resultSetConcurrency, final int resultSetHoldability) {
        return new PStmtKey(sql, getCatalogOrNull(), getSchemaOrNull(), resultSetType, resultSetConcurrency, resultSetHoldability);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * @return a key to uniquely identify a prepared statement.
     */
    protected PStmtKey createKey(final String sql, final int resultSetType, final int resultSetConcurrency) {
        return new PStmtKey(sql, getCatalogOrNull(), getSchemaOrNull(), resultSetType, resultSetConcurrency);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * @return a key to uniquely identify a prepared statement.
     */
    protected PStmtKey createKey(final String sql, final int autoGeneratedKeys) {
        return new PStmtKey(sql, getCatalogOrNull(), getSchemaOrNull(), autoGeneratedKeys);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * @return a key to uniquely identify a prepared statement.
     */
    protected PStmtKey createKey(final String sql, final String[] columnNames) {
        return new PStmtKey(sql, getCatalogOrNull(), getSchemaOrNull(), columnNames);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * @return a key to uniquely identify a prepared statement.
     */
    protected PStmtKey createKey(final String sql, final int[] columnIndexes) {
        return new PStmtKey(sql, getCatalogOrNull(), getSchemaOrNull(), columnIndexes);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * @since 2.4.0
     */
    protected PStmtKey createKey(final String sql, final int resultSetType, final int resultSetConcurrency, final StatementType statementType) {
        return new PStmtKey(sql, getCatalogOrNull(), getSchemaOrNull(), resultSetType, resultSetConcurrency, statementType);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * @since 2.4.0
     */
    protected PStmtKey createKey(final String sql, final int resultSetType, final int resultSetConcurrency, final int resultSetHoldability,
        final StatementType statementType) {
        return new PStmtKey(sql, getCatalogOrNull(), getSchemaOrNull(), resultSetType, resultSetConcurrency, resultSetHoldability, statementType);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * @return a {@link PStmtKey} for the given arguments.
     */
    protected PStmtKey createKey(final String sql) {
        return new PStmtKey(sql, getCatalogOrNull(), getSchemaOrNull());
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * @return a key to uniquely identify a prepared statement.
     */
    protected PStmtKey createKey(final String sql, final StatementType statementType) {
        return new PStmtKey(sql, getCatalogOrNull(), getSchemaOrNull(), statementType);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
    }

    protected void handleException(final SQLException e) throws SQLException {
        if (statement instanceof DelegatingStatement) {
            ((DelegatingStatement) statement).handleException(e);
```

## RuleId[id=Deprecation]
### Deprecation
'getTimeBetweenEvictionRunsMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java

    /**
     * See {@link BasicDataSource#getTimeBetweenEvictionRunsMillis()}.
     *
     * @return {@link BasicDataSource#getTimeBetweenEvictionRunsMillis()}.
```

### Deprecation
'getTimeBetweenEvictionRunsMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java
     * See {@link BasicDataSource#getTimeBetweenEvictionRunsMillis()}.
     *
     * @return {@link BasicDataSource#getTimeBetweenEvictionRunsMillis()}.
     */
    long getTimeBetweenEvictionRunsMillis();
```

### Deprecation
'getRemoveAbandonedTimeout()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java

    /**
     * See {@link BasicDataSource#getRemoveAbandonedTimeout()}.
     *
     * @return {@link BasicDataSource#getRemoveAbandonedTimeout()}.
```

### Deprecation
'getRemoveAbandonedTimeout()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java
     * See {@link BasicDataSource#getRemoveAbandonedTimeout()}.
     *
     * @return {@link BasicDataSource#getRemoveAbandonedTimeout()}.
     */
    int getRemoveAbandonedTimeout();
```

### Deprecation
'getMinEvictableIdleTimeMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java

    /**
     * See {@link BasicDataSource#getMinEvictableIdleTimeMillis()}.
     *
     * @return {@link BasicDataSource#getMinEvictableIdleTimeMillis()}.
```

### Deprecation
'getMinEvictableIdleTimeMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java
     * See {@link BasicDataSource#getMinEvictableIdleTimeMillis()}.
     *
     * @return {@link BasicDataSource#getMinEvictableIdleTimeMillis()}.
     */
    long getMinEvictableIdleTimeMillis();
```

### Deprecation
'getMaxWaitMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java

    /**
     * See {@link BasicDataSource#getMaxWaitMillis()}.
     *
     * @return {@link BasicDataSource#getMaxWaitMillis()}.
```

### Deprecation
'getMaxWaitMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java
     * See {@link BasicDataSource#getMaxWaitMillis()}.
     *
     * @return {@link BasicDataSource#getMaxWaitMillis()}.
     */
    long getMaxWaitMillis();
```

### Deprecation
'getValidationQueryTimeout()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java

    /**
     * See {@link BasicDataSource#getValidationQueryTimeout()}.
     *
     * @return {@link BasicDataSource#getValidationQueryTimeout()}.
```

### Deprecation
'getValidationQueryTimeout()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java
     * See {@link BasicDataSource#getValidationQueryTimeout()}.
     *
     * @return {@link BasicDataSource#getValidationQueryTimeout()}.
     */
    int getValidationQueryTimeout();
```

### Deprecation
'getSoftMinEvictableIdleTimeMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java

    /**
     * See {@link BasicDataSource#getSoftMinEvictableIdleTimeMillis()}.
     *
     * @return {@link BasicDataSource#getSoftMinEvictableIdleTimeMillis()}.
```

### Deprecation
'getSoftMinEvictableIdleTimeMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java
     * See {@link BasicDataSource#getSoftMinEvictableIdleTimeMillis()}.
     *
     * @return {@link BasicDataSource#getSoftMinEvictableIdleTimeMillis()}.
     */
    long getSoftMinEvictableIdleTimeMillis();
```

### Deprecation
'getMaxConnLifetimeMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java

    /**
     * See {@link BasicDataSource#getMaxConnLifetimeMillis()}.
     *
     * @return {@link BasicDataSource#getMaxConnLifetimeMillis()}.
```

### Deprecation
'getMaxConnLifetimeMillis()' is deprecated
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java
     * See {@link BasicDataSource#getMaxConnLifetimeMillis()}.
     *
     * @return {@link BasicDataSource#getMaxConnLifetimeMillis()}.
     */
    long getMaxConnLifetimeMillis();
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder base` can be replaced with 'String'
in `src/main/java/org/apache/commons/dbcp2/managed/PoolableManagedConnectionFactory.java`
#### Snippet
```java
            final long connIndex = getConnectionIndex().getAndIncrement();
            if (dataSourceJmxName != null) {
                final StringBuilder base = new StringBuilder(dataSourceJmxName.toString());
                base.append(Constants.JMX_CONNECTION_BASE_EXT);
                base.append(connIndex);
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `src/main/java/org/apache/commons/dbcp2/PStmtKey.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buf = new StringBuilder();
        buf.append("PStmtKey: sql=");
        buf.append(sql);
```

### StringBufferReplaceableByString
`StringBuilder stringBuilder` can be replaced with 'String'
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
            if (!(ALL_PROPERTY_NAMES.contains(propertyName) || NUPROP_WARNTEXT.containsKey(propertyName) || SILENT_PROPERTIES.contains(propertyName))) {
                final String propertyValue = Objects.toString(ra.getContent(), null);
                final StringBuilder stringBuilder = new StringBuilder(nameString);
                stringBuilder.append("Ignoring unknown property: ").append("value of \"").append(propertyValue).append("\" for \"").append(propertyName)
                    .append("\" property");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/commons/dbcp2/datasources/PoolKey.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(50);
        sb.append("PoolKey(");
        sb.append(dataSourceName);
```

### StringBufferReplaceableByString
`StringBuilder base` can be replaced with 'String'
in `src/main/java/org/apache/commons/dbcp2/PoolableConnectionFactory.java`
#### Snippet
```java
            config.setMaxTotal(maxOpenPreparedStatements);
            if (dataSourceJmxObjectName != null) {
                final StringBuilder base = new StringBuilder(dataSourceJmxObjectName.toString());
                base.append(Constants.JMX_CONNECTION_BASE_EXT);
                base.append(connIndex);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
    @Override
    public synchronized String toString() {
        final StringBuilder builder = new StringBuilder(super.toString());
        builder.append("[description=");
        builder.append(description);
```

### StringBufferReplaceableByString
`StringBuilder base` can be replaced with 'String'
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
            return;
        }
        final StringBuilder base = new StringBuilder(registeredJmxObjectName.toString());
        base.append(Constants.JMX_CONNECTION_POOL_BASE_EXT);
        config.setJmxNameBase(base.toString());
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'lastUsedInstant'
in `src/main/java/org/apache/commons/dbcp2/AbandonedTrace.java`
#### Snippet
```java
     *            AbandonedTrace parent object.
     */
    public AbandonedTrace(final AbandonedTrace parent) {
        init(parent);
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
    private void validatePropertyNames(final Reference ref, final Name name, final List<String> warnMessages,
        final List<String> infoMessages) {
        final String nameString = name != null ? "Name = " + name.toString() + " " : "";
        if (NUPROP_WARNTEXT != null && !NUPROP_WARNTEXT.isEmpty()) {
            NUPROP_WARNTEXT.forEach((propertyName, value) -> {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
    protected void checkOpen() throws SQLException {
        if (isClosed()) {
            throw new SQLException(this.getClass().getName() + " with address: \"" + this.toString() + "\" is closed.");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/dbcp2/PoolableConnectionFactory.java`
#### Snippet
```java
            connJmxName = null;
        } else {
            final String name = dataSourceJmxObjectName.toString() + Constants.JMX_CONNECTION_BASE_EXT + connIndex;
            try {
                connJmxName = new ObjectName(name);
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSourceFactory.java`
#### Snippet
```java
     *            If an I/O error occurs during the deserialization of a configuration parameter.
     */
    protected static final Object deserialize(final byte[] data) throws IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        try {
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java

    private static final Map<String, ClientInfoStatus> EMPTY_FAILED_PROPERTIES = Collections
            .<String, ClientInfoStatus>emptyMap();

    /** My delegate {@link Connection}. */
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSourceFactory.java`
#### Snippet
```java
                if (refAddr != null && refAddr.getContent() != null) {
                    // object was bound to JNDI via Referenceable API.
                    obj = INSTANCE_MAP.get(refAddr.getContent());
                } else {
                    // Tomcat JNDI creates a Reference out of server.xml
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `transaction` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/managed/TransactionRegistry.java`
#### Snippet
```java
     */
    public TransactionContext getActiveTransactionContext() throws SQLException {
        Transaction transaction = null;
        try {
            transaction = transactionManager.getTransaction();
```

### UnusedAssignment
Variable `connectionFactory` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/managed/BasicManagedDataSource.java`
#### Snippet
```java
    protected PoolableConnectionFactory createPoolableConnectionFactory(final ConnectionFactory driverConnectionFactory)
            throws SQLException {
        PoolableConnectionFactory connectionFactory = null;
        try {
            connectionFactory = new PoolableManagedConnectionFactory((XAConnectionFactory) driverConnectionFactory,
```

### UnusedAssignment
Variable `xaDataSourceClass` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/managed/BasicManagedDataSource.java`
#### Snippet
```java
        // Create the XADataSource instance using the configured class name if it has not been set
        if (xaDataSourceInstance == null) {
            Class<?> xaDataSourceClass = null;
            try {
                xaDataSourceClass = Class.forName(xaDataSource);
```

### UnusedAssignment
Variable `level` initializer `PoolableConnectionFactory.UNKNOWN_TRANSACTION_ISOLATION` is redundant
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
        getOptional(properties, PROP_DEFAULT_TRANSACTION_ISOLATION).ifPresent(value -> {
            value = value.toUpperCase(Locale.ROOT);
            int level = PoolableConnectionFactory.UNKNOWN_TRANSACTION_ISOLATION;
            if ("NONE".equals(value)) {
                level = Connection.TRANSACTION_NONE;
```

### UnusedAssignment
Variable `valid` initializer `false` is redundant
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
            return false;
        }
        boolean valid = false;
        final PooledConnection pconn = p.getObject().getPooledConnection();
        Connection conn = null;
```

### UnusedAssignment
Variable `pc` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
    public synchronized PooledObject<PooledConnectionAndInfo> makeObject() {
        try {
            PooledConnection pc = null;
            if (userPassKey.getUserName() == null) {
                pc = cpds.getPooledConnection();
```

### UnusedAssignment
Variable `valid` initializer `false` is redundant
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
            return false;
        }
        boolean valid = false;
        final PooledConnection pooledConn = pooledObject.getObject().getPooledConnection();
        Connection conn = null;
```

### UnusedAssignment
Variable `pooledConnection` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
    @Override
    public synchronized PooledObject<PooledConnectionAndInfo> makeObject(final UserPassKey userPassKey) throws SQLException {
        PooledConnection pooledConnection = null;
        final String userName = userPassKey.getUserName();
        final String password = userPassKey.getPassword();
```

### UnusedAssignment
Variable `info` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
        }

        PooledConnectionAndInfo info = null;
        try {
            info = pool.borrowObject();
```

### UnusedAssignment
Variable `pooledConnection` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
        throws SQLException {
        getConnectionCalled = true;
        PooledConnectionImpl pooledConnection = null;
        // Workaround for buggy WebLogic 5.1 class loader - ignore the exception upon first invocation.
        try {
```

### UnusedAssignment
Variable `stmtPool` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
            pooledConnection.setAccessToUnderlyingConnectionAllowed(isAccessToUnderlyingConnectionAllowed());
        }
        KeyedObjectPool<PStmtKey, DelegatingPreparedStatement> stmtPool = null;
        if (isPoolPreparedStatements()) {
            final GenericKeyedObjectPoolConfig<DelegatingPreparedStatement> config = new GenericKeyedObjectPoolConfig<>();
```

### UnusedAssignment
Variable `ctx` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
        ConnectionPoolDataSource cpds = this.dataSource;
        if (cpds == null) {
            Context ctx = null;
            if (jndiEnvironment == null) {
                ctx = new InitialContext();
```

### UnusedAssignment
Variable `connectionFactory` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    protected PoolableConnectionFactory createPoolableConnectionFactory(final ConnectionFactory driverConnectionFactory)
            throws SQLException {
        PoolableConnectionFactory connectionFactory = null;
        try {
            if (registerConnectionMBean) {
```

### UnusedAssignment
Variable `conn` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    protected static void validateConnectionFactory(final PoolableConnectionFactory connectionFactory) throws SQLException {
        PoolableConnection conn = null;
        PooledObject<PoolableConnection> p = null;
        try {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `NUPROP_WARNTEXT != null` is always `true`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
        final List<String> infoMessages) {
        final String nameString = name != null ? "Name = " + name.toString() + " " : "";
        if (NUPROP_WARNTEXT != null && !NUPROP_WARNTEXT.isEmpty()) {
            NUPROP_WARNTEXT.forEach((propertyName, value) -> {
                final RefAddr ra = ref.get(propertyName);
```

### ConstantValue
Value `properties` is always 'null'
in `src/main/java/org/apache/commons/dbcp2/Utils.java`
#### Snippet
```java
            return temp;
        }
        return properties;
    }

```

### ConstantValue
Value `info` is always 'null'
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
            info = getPooledConnectionAndInfo(userName, userPassword);
        } catch (final RuntimeException | SQLException e) {
            closeDueToException(info);
            throw e;
        } catch (final Exception e) {
```

### ConstantValue
Value `info` is always 'null'
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
                    info = getPooledConnectionAndInfo(userName, userPassword);
                } catch (final RuntimeException | SQLException e) {
                    closeDueToException(info);
                    throw e;
                } catch (final Exception e) {
```

