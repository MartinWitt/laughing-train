# commons-dbcp 
 
# Bad smells
I found 503 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 184 | false |
| DeprecatedIsStillUsed | 51 | false |
| UnnecessaryFullyQualifiedName | 51 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 45 | false |
| RedundantSuppression | 42 | false |
| BoundedWildcard | 16 | false |
| SystemOutErr | 14 | false |
| UnusedAssignment | 14 | false |
| MagicConstant | 13 | false |
| ProtectedMemberInFinalClass | 10 | true |
| StringBufferReplaceableByString | 9 | false |
| SynchronizeOnThis | 6 | false |
| DataFlowIssue | 5 | false |
| ThrowablePrintStackTrace | 5 | false |
| UtilityClassWithoutPrivateConstructor | 4 | true |
| UnnecessarySuperQualifier | 4 | false |
| ConstantValue | 4 | false |
| CommentedOutCode | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| UseOfPropertiesAsHashtable | 3 | false |
| Finalize | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| RedundantClassCall | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| FinalStaticMethod | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
| CopyConstructorMissesField | 1 | false |
## RuleId[id=Finalize]
### Finalize
'finalize()' should not be overridden
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java

    @Override
    protected void finalize() throws Throwable {
        // This is required because of statement pooling. The poolable
        // statements will always be strongly held by the statement pool. If the
```

### Finalize
'finalize()' should not be overridden
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     */
    @Override
    protected void finalize() throws Throwable {
        // Closing the Connection ensures that if anyone tries to use it,
        // an error will occur.
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
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

        if (defaultTransactionIsolation != UNKNOWN_TRANSACTIONISOLATION) {
            con.setTransactionIsolation(defaultTransactionIsolation);
        }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/dbcp2/Constants.java`
#### Snippet
```java
 * @since 2.0
 */
public class Constants {

    public static final String JMX_CONNECTION_POOL_BASE_EXT = ",connectionpool=";
```

### UtilityClassWithoutPrivateConstructor
Class `DriverFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/dbcp2/DriverFactory.java`
#### Snippet
```java
 * @since 2.7.0
 */
final class DriverFactory {

    static Driver createDriver(final BasicDataSource basicDataSource) throws SQLException {
```

### UtilityClassWithoutPrivateConstructor
Class `ConnectionFactoryFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/dbcp2/ConnectionFactoryFactory.java`
#### Snippet
```java
 * @since 2.7.0
 */
final class ConnectionFactoryFactory {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Jdbc41Bridge` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/dbcp2/Jdbc41Bridge.java`
#### Snippet
```java
 * @since 2.6.0
 */
public class Jdbc41Bridge {

    /**
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
    public void setDisconnectionSqlCodes(final Collection<String> disconnectionSqlCodes) {
//        if (disconnectionSqlCodes != null && !disconnectionSqlCodes.isEmpty()) {
//            HashSet<String> newVal = null;
//            for (final String s : disconnectionSqlCodes) {
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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'logWriter' in a Serializable class
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /** Log stream */
    private PrintWriter logWriter;

    /** Instance key */
```

## RuleId[id=ProtectedMemberInFinalClass]
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
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
    }

    protected void handleException(final SQLException e) throws SQLException {
        if (statement instanceof DelegatingStatement) {
            ((DelegatingStatement) statement).handleException(e);
```

## RuleId[id=StringBufferReplaceableByString]
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
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
    @Override
    public synchronized String toString() {
        final StringBuilder builder = new StringBuilder(super.toString());
        builder.append("[cpds=");
        builder.append(cpds);
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

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
    @Override
    public synchronized String toString() {
        final StringBuilder builder = new StringBuilder(super.toString());
        builder.append("[connection=");
        builder.append(connection);
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

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `fatalSqlExceptionThrown |= isFatalException(e)`
in `src/main/java/org/apache/commons/dbcp2/PoolableConnection.java`
#### Snippet
```java
    @Override
    protected void handleException(final SQLException e) throws SQLException {
        fatalSqlExceptionThrown |= isFatalException(e);
        super.handleException(e);
    }
```

## RuleId[id=UnnecessaryToStringCall]
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
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
    private void validatePropertyNames(final Reference ref, final Name name, final List<String> warnMessages,
        final List<String> infoMessages) {
        final String nameString = name != null ? "Name = " + name.toString() + " " : "";
        if (NUPROP_WARNTEXT != null && !NUPROP_WARNTEXT.isEmpty()) {
            NUPROP_WARNTEXT.forEach((propertyName, value) -> {
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super PStmtKey`
in `src/main/java/org/apache/commons/dbcp2/PoolableCallableStatement.java`
#### Snippet
```java
     */
    public PoolableCallableStatement(final CallableStatement callableStatement, final PStmtKey key,
            final KeyedObjectPool<PStmtKey, DelegatingPreparedStatement> pool,
            final DelegatingConnection<Connection> connection) {
        super(connection, callableStatement);
```

### BoundedWildcard
Can generalize to `? super DelegatingPreparedStatement`
in `src/main/java/org/apache/commons/dbcp2/PoolableCallableStatement.java`
#### Snippet
```java
     */
    public PoolableCallableStatement(final CallableStatement callableStatement, final PStmtKey key,
            final KeyedObjectPool<PStmtKey, DelegatingPreparedStatement> pool,
            final DelegatingConnection<Connection> connection) {
        super(connection, callableStatement);
```

### BoundedWildcard
Can generalize to `? super AbandonedConfig`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    }

    private <T> void setAbandoned(final BiConsumer<AbandonedConfig, T> consumer, final T object) {
        if (abandonedConfig == null) {
            abandonedConfig = new AbandonedConfig();
```

### BoundedWildcard
Can generalize to `? super GenericObjectPool`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    }

    private <T> void setConnectionPool(final BiConsumer<GenericObjectPool<PoolableConnection>, T> consumer, final T object) {
        if (connectionPool != null) {
            consumer.accept(connectionPool, object);
```

### BoundedWildcard
Can generalize to `? super Exception`
in `src/main/java/org/apache/commons/dbcp2/Utils.java`
#### Snippet
```java
     * @since 2.10.0
     */
    public static void close(AutoCloseable autoCloseable, final Consumer<Exception> exceptionHandler) {
        if (autoCloseable != null) {
            try {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
    }

    private static void acceptBoolean(final Properties properties, final String name, final Consumer<Boolean> consumer) {
        accept(properties, name, Boolean::parseBoolean, consumer);
    }
```

### BoundedWildcard
Can generalize to `? super Duration`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
    }

    private static void acceptDurationOfSeconds(final Properties properties, final String name, final Consumer<Duration> consumer) {
        accept(properties, name, s -> Duration.ofSeconds(Long.parseLong(s)), consumer);
    }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
    }

    private static void acceptInt(final Properties properties, final String name, final Consumer<Integer> consumer) {
        accept(properties, name, Integer::parseInt, consumer);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
     *            container for info messages
     */
    private void validatePropertyNames(final Reference ref, final Name name, final List<String> warnMessages,
        final List<String> infoMessages) {
        final String nameString = name != null ? "Name = " + name.toString() + " " : "";
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
     */
    private void validatePropertyNames(final Reference ref, final Name name, final List<String> warnMessages,
        final List<String> infoMessages) {
        final String nameString = name != null ? "Name = " + name.toString() + " " : "";
        if (NUPROP_WARNTEXT != null && !NUPROP_WARNTEXT.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super Duration`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
    }

    private static void acceptDurationOfMillis(final Properties properties, final String name, final Consumer<Duration> consumer) {
        accept(properties, name, s -> Duration.ofMillis(Long.parseLong(s)), consumer);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
    }

    private static <V> void accept(final Properties properties, final String name, final Function<String, V> parser, final Consumer<V> consumer) {
        getOptional(properties, name).ifPresent(v -> consumer.accept(parser.apply(v)));
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
    }

    private static <V> void accept(final Properties properties, final String name, final Function<String, V> parser, final Consumer<V> consumer) {
        getOptional(properties, name).ifPresent(v -> consumer.accept(parser.apply(v)));
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
    }

    private static <V> void accept(final Properties properties, final String name, final Function<String, V> parser, final Consumer<V> consumer) {
        getOptional(properties, name).ifPresent(v -> consumer.accept(parser.apply(v)));
    }
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
    }

    private <K, V> Map<K, V> replaceAll(final Map<K, V> currentMap, final Map<K, V> newMap) {
        if (currentMap == null) {
            return new HashMap<>(newMap);
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
    }

    private <K, V> Map<K, V> replaceAll(final Map<K, V> currentMap, final Map<K, V> newMap) {
        if (currentMap == null) {
            return new HashMap<>(newMap);
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    protected static void validateConnectionFactory(final PoolableConnectionFactory connectionFactory) throws SQLException {
        PoolableConnection conn = null;
        PooledObject<PoolableConnection> p = null;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public void invalidateConnection(final Connection connection) throws IllegalStateException {
        if (connection == null) {
            return;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public Statement createStatement() throws SQLException {
        checkOpen();
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public Statement createStatement(final int resultSetType, final int resultSetConcurrency) throws SQLException {
        checkOpen();
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public Statement createStatement(final int resultSetType, final int resultSetConcurrency,
        final int resultSetHoldability) throws SQLException {
        checkOpen();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public final Connection getInnermostDelegateInternal() {
        Connection conn = connection;
        while (conn instanceof DelegatingConnection) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public boolean innermostDelegateEquals(final Connection c) {
        final Connection innerCon = getInnermostDelegateInternal();
        if (innerCon == null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public CallableStatement prepareCall(final String sql) throws SQLException {
        checkOpen();
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public CallableStatement prepareCall(final String sql, final int resultSetType, final int resultSetConcurrency)
        throws SQLException {
        checkOpen();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public CallableStatement prepareCall(final String sql, final int resultSetType, final int resultSetConcurrency,
        final int resultSetHoldability) throws SQLException {
        checkOpen();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public PreparedStatement prepareStatement(final String sql) throws SQLException {
        checkOpen();
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public PreparedStatement prepareStatement(final String sql, final int autoGeneratedKeys) throws SQLException {
        checkOpen();
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public PreparedStatement prepareStatement(final String sql, final int resultSetType, final int resultSetConcurrency)
        throws SQLException {
        checkOpen();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public PreparedStatement prepareStatement(final String sql, final int resultSetType, final int resultSetConcurrency,
        final int resultSetHoldability) throws SQLException {
        checkOpen();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public PreparedStatement prepareStatement(final String sql, final int[] columnIndexes) throws SQLException {
        checkOpen();
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public PreparedStatement prepareStatement(final String sql, final String[] columnNames) throws SQLException {
        checkOpen();
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public synchronized String toString() {
        String str = null;

```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingPreparedStatement.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public synchronized String toString() {
        final Statement statement = getDelegate();
        return statement == null ? "NULL" : statement.toString();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public ResultSet getInnermostDelegate() {
        ResultSet r = resultSet;
        while (r instanceof DelegatingResultSet) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public ResultSet executeQuery(final String sql) throws SQLException {
        checkOpen();
        setLastUsedInParent();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        checkOpen();
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public Statement getInnermostDelegate() {
        Statement s = statement;
        while (s instanceof DelegatingStatement) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller is responsible for closing the resource.
    @Override
    public ResultSet getResultSet() throws SQLException {
        checkOpen();
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public PooledObject<DelegatingPreparedStatement> makeObject(final PStmtKey key) throws SQLException {
        if (null == key) {
            throw new IllegalArgumentException("Prepared statement key is null or invalid.");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java
    public void passivateObject(final PStmtKey key, final PooledObject<DelegatingPreparedStatement> pooledObject)
            throws SQLException {
        @SuppressWarnings("resource")
        final DelegatingPreparedStatement dps = pooledObject.getObject();
        dps.clearParameters();
        dps.passivate();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/PoolingDriver.java`
#### Snippet
```java
     */
    public synchronized void closePool(final String name) throws SQLException {
        @SuppressWarnings("resource")
        final ObjectPool<? extends Connection> pool = pools.get(name);
        if (pool != null) {
            pools.remove(name);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public PooledObject<DelegatingPreparedStatement> makeObject(final PStmtKey key) throws SQLException {
        if (null == key) {
            throw new IllegalArgumentException("Prepared statement key is null or invalid.");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
    public void passivateObject(final PStmtKey key, final PooledObject<DelegatingPreparedStatement> pooledObject)
            throws SQLException {
        @SuppressWarnings("resource")
        final DelegatingPreparedStatement dps = pooledObject.getObject();
        dps.clearParameters();
        dps.passivate();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getRawConnection() does not allocate
    CallableStatement prepareCall(final String sql) throws SQLException {
        if (pStmtPool == null) {
            return getRawConnection().prepareCall(sql);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getRawConnection() does not allocate
    CallableStatement prepareCall(final String sql, final int resultSetType, final int resultSetConcurrency)
            throws SQLException {
        if (pStmtPool == null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getRawConnection() does not allocate
    CallableStatement prepareCall(final String sql, final int resultSetType, final int resultSetConcurrency,
            final int resultSetHoldability) throws SQLException {
        if (pStmtPool == null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getRawConnection() does not allocate
    PreparedStatement prepareStatement(final String sql) throws SQLException {
        if (pStmtPool == null) {
            return getRawConnection().prepareStatement(sql);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getRawConnection() does not allocate
    PreparedStatement prepareStatement(final String sql, final int autoGeneratedKeys) throws SQLException {
        if (pStmtPool == null) {
            return getRawConnection().prepareStatement(sql, autoGeneratedKeys);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // getRawConnection() does not allocate
    PreparedStatement prepareStatement(final String sql, final int resultSetType, final int resultSetConcurrency)
            throws SQLException {
        if (pStmtPool == null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java

    @SuppressWarnings("resource") // getRawConnection() does not allocate
    PreparedStatement prepareStatement(final String sql, final int resultSetType, final int resultSetConcurrency,
            final int resultSetHoldability) throws SQLException {
        if (pStmtPool == null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java

    @SuppressWarnings("resource") // getRawConnection() does not allocate
    PreparedStatement prepareStatement(final String sql, final int[] columnIndexes) throws SQLException {
        if (pStmtPool == null) {
            return getRawConnection().prepareStatement(sql, columnIndexes);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java

    @SuppressWarnings("resource") // getRawConnection() does not allocate
    PreparedStatement prepareStatement(final String sql, final String[] columnNames) throws SQLException {
        if (pStmtPool == null) {
            return getRawConnection().prepareStatement(sql, columnNames);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSourceFactory.java`
#### Snippet
```java
            // Bullet-proof to avoid anything else but problems from InstanceKeyDataSource#close().
            if (entry != null) {
                @SuppressWarnings("resource")
                final InstanceKeyDataSource value = entry.getValue();
                Utils.close(value, exceptionList::add);
            }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public int getNumActive(final String userName) {
        final ObjectPool<PooledConnectionAndInfo> pool = getPool(getPoolKey(userName));
        return pool == null ? 0 : pool.getNumActive();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public int getNumIdle(final String userName) {
        final ObjectPool<PooledConnectionAndInfo> pool = getPool(getPoolKey(userName));
        return pool == null ? 0 : pool.getNumIdle();
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/managed/ManagedConnection.java`
#### Snippet
```java

            // return current connection to the pool
            @SuppressWarnings("resource")
            final C connection = getDelegateInternal();
            setDelegate(null);
            if (connection != null && transactionContext.getSharedConnection() != connection) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbcp2/managed/PoolableManagedConnectionFactory.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Connection is released elsewhere.
    @Override
    public synchronized PooledObject<PoolableConnection> makeObject() throws SQLException {
        Connection conn = getConnectionFactory().createConnection();
        if (conn == null) {
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
                pool.returnObject(pci);
            } catch (final Exception e) {
                System.err.println("CLOSING DOWN CONNECTION AS IT COULD " + "NOT BE RETURNED TO THE POOL");
                pc.removeConnectionEventListener(this);
                try {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
                    doDestroyObject(pci);
                } catch (final Exception e2) {
                    System.err.println("EXCEPTION WHILE DESTROYING OBJECT " + pci);
                    e2.printStackTrace();
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
        final PooledConnection pc = (PooledConnection) event.getSource();
        if (null != event.getSQLException()) {
            System.err.println("CLOSING DOWN CONNECTION DUE TO INTERNAL ERROR (" + event.getSQLException() + ")");
        }
        pc.removeConnectionEventListener(this);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
            pool.invalidateObject(pci);
        } catch (final Exception e) {
            System.err.println("EXCEPTION WHILE DESTROYING OBJECT " + pci);
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
        final PooledConnection pc = (PooledConnection) event.getSource();
        if (null != event.getSQLException()) {
            System.err.println("CLOSING DOWN CONNECTION DUE TO INTERNAL ERROR (" + event.getSQLException() + ")");
        }
        pc.removeConnectionEventListener(this);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
            pool.invalidateObject(info.getUserPassKey(), info);
        } catch (final Exception e) {
            System.err.println("EXCEPTION WHILE DESTROYING OBJECT " + info);
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
                pool.returnObject(pci.getUserPassKey(), pci);
            } catch (final Exception e) {
                System.err.println("CLOSING DOWN CONNECTION AS IT COULD " + "NOT BE RETURNED TO THE POOL");
                pc.removeConnectionEventListener(this);
                try {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
                    pool.invalidateObject(pci.getUserPassKey(), pci);
                } catch (final Exception e3) {
                    System.err.println("EXCEPTION WHILE DESTROYING OBJECT " + pci);
                    e3.printStackTrace();
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/managed/DataSourceXAConnectionFactory.java`
#### Snippet
```java
                pc.close();
            } catch (final SQLException e) {
                System.err.println("Failed to close XAConnection");
                e.printStackTrace();
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    private volatile PrintWriter logWriter = new PrintWriter(
            new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

    private AbandonedConfig abandonedConfig;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
    public PrintWriter getLogWriter() {
        if (logWriter == null) {
            logWriter = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        }
        return logWriter;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
                    level = Integer.parseInt(value);
                } catch (final NumberFormatException e) {
                    System.err.println("Could not parse defaultTransactionIsolation: " + value);
                    System.err.println("WARNING: defaultTransactionIsolation not set");
                    System.err.println("using default value of database driver");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
                } catch (final NumberFormatException e) {
                    System.err.println("Could not parse defaultTransactionIsolation: " + value);
                    System.err.println("WARNING: defaultTransactionIsolation not set");
                    System.err.println("using default value of database driver");
                    level = PoolableConnectionFactory.UNKNOWN_TRANSACTION_ISOLATION;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
                    System.err.println("Could not parse defaultTransactionIsolation: " + value);
                    System.err.println("WARNING: defaultTransactionIsolation not set");
                    System.err.println("using default value of database driver");
                    level = PoolableConnectionFactory.UNKNOWN_TRANSACTION_ISOLATION;
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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
    public Connection getInnermostDelegate() {
        if (isAccessToUnderlyingConnectionAllowed()) {
            return super.getInnermostDelegateInternal();
        }
        return null;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java
            if (getDelegateInternal() != null) {
                super.close();
                super.setDelegate(null);
            }
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/dbcp2/PoolableConnection.java`
#### Snippet
```java
        }

        super.closeInternal();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/dbcp2/managed/ManagedConnection.java`
#### Snippet
```java
    public Connection getInnermostDelegate() {
        if (isAccessToUnderlyingConnectionAllowed()) {
            return super.getInnermostDelegateInternal();
        }
        return null;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
     * @throws SQLException
     *             if the connection could not be created.
     * @see org.apache.commons.pool2.KeyedPooledObjectFactory#makeObject(Object)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
/**
 * <p>
 * An adapter for JDBC drivers that do not include an implementation of {@link javax.sql.ConnectionPoolDataSource}, but
 * still include a {@link java.sql.DriverManager} implementation. {@code ConnectionPoolDataSource}s are not used
 * within general applications. They are used by {@code DataSource} implementations that pool
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
 * <p>
 * An adapter for JDBC drivers that do not include an implementation of {@link javax.sql.ConnectionPoolDataSource}, but
 * still include a {@link java.sql.DriverManager} implementation. {@code ConnectionPoolDataSource}s are not used
 * within general applications. They are used by {@code DataSource} implementations that pool
 * {@code Connection}s, such as {@link org.apache.commons.dbcp2.datasources.SharedPoolDataSource}. A J2EE container
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/dbcp2/DelegatingPreparedStatement.java`
#### Snippet
```java

    @Override
    public void setURL(final int parameterIndex, final java.net.URL x) throws SQLException {
        checkOpen();
        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/dbcp2/DelegatingPreparedStatement.java`
#### Snippet
```java

    @Override
    public java.sql.ParameterMetaData getParameterMetaData() throws SQLException {
        checkOpen();
        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
    /**
     * If pooling of {@code CallableStatement}s is turned on in the {@link DriverAdapterCPDS}, a pooled object may
     * be returned, otherwise delegate to the wrapped JDBC 1.x {@link java.sql.Connection}.
     *
     * @param sql
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
    /**
     * If pooling of {@code CallableStatement}s is turned on in the {@link DriverAdapterCPDS}, a pooled object may
     * be returned, otherwise delegate to the wrapped JDBC 1.x {@link java.sql.Connection}.
     *
     * @param sql
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
    /**
     * If pooling of {@code CallableStatement}s is turned on in the {@link DriverAdapterCPDS}, a pooled object may
     * be returned, otherwise delegate to the wrapped JDBC 1.x {@link java.sql.Connection}.
     *
     * @param sql
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
    /**
     * If pooling of {@code PreparedStatement}s is turned on in the {@link DriverAdapterCPDS}, a pooled object may
     * be returned, otherwise delegate to the wrapped JDBC 1.x {@link java.sql.Connection}.
     *
     * @param sql
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
    /**
     * If pooling of {@code PreparedStatement}s is turned on in the {@link DriverAdapterCPDS}, a pooled object may
     * be returned, otherwise delegate to the wrapped JDBC 1.x {@link java.sql.Connection}.
     *
     * @throws SQLException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbcp2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/PoolingDriver.java`
#### Snippet
```java

        /**
         * @see org.apache.commons.dbcp2.DelegatingConnection#getInnermostDelegate()
         */
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbcp2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/PoolingDriver.java`
#### Snippet
```java

        /**
         * @see org.apache.commons.dbcp2.DelegatingConnection#getDelegate()
         */
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/managed/XAConnectionFactory.java`
#### Snippet
```java
public interface XAConnectionFactory extends ConnectionFactory {
    /**
     * Create a new {@link java.sql.Connection} in an implementation specific fashion.
     * <p>
     * An implementation can assume that the caller of this will wrap the connection in a proxy that protects access to
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/managed/XAConnectionFactory.java`
#### Snippet
```java
     * </p>
     *
     * @return a new {@link java.sql.Connection}
     * @throws java.sql.SQLException
     *             if a database error occurs creating the connection
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/managed/XAConnectionFactory.java`
#### Snippet
```java
     *
     * @return a new {@link java.sql.Connection}
     * @throws java.sql.SQLException
     *             if a database error occurs creating the connection
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/ConnectionFactory.java`
#### Snippet
```java

/**
 * Abstract factory interface for creating {@link java.sql.Connection}s.
 *
 * @since 2.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/ConnectionFactory.java`
#### Snippet
```java
public interface ConnectionFactory {
    /**
     * Create a new {@link java.sql.Connection} in an implementation specific fashion.
     *
     * @return a new {@link java.sql.Connection}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/ConnectionFactory.java`
#### Snippet
```java
     * Create a new {@link java.sql.Connection} in an implementation specific fashion.
     *
     * @return a new {@link java.sql.Connection}
     * @throws SQLException
     *             if a database error occurs creating the connection
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java

    /**
     * Returns a {@link java.sql.Connection} from my pool, according to the contract specified by
     * {@link ObjectPool#borrowObject}.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbcp2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java

        /**
         * @see org.apache.commons.dbcp2.DelegatingConnection#getDelegate()
         */
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbcp2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java

        /**
         * @see org.apache.commons.dbcp2.DelegatingConnection#getInnermostDelegate()
         */
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnBorrow()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param testOnBorrow
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getTestOnBorrow()} for each per user pool.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param softMinEvictableIdleTimeMillis
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     * @deprecated Use {@link #setDefaultSoftMinEvictableIdle(Duration)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestWhileIdle()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param testWhileIdle
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getTestWhileIdle()} for each per user pool.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnBorrow()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getTestOnBorrow()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getTestOnBorrow()} for each per user pool.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    protected ConnectionPoolDataSource testCPDS(final String userName, final String userPassword)
            throws javax.naming.NamingException, SQLException {
        // The source of physical db connections
        ConnectionPoolDataSource cpds = this.dataSource;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnCreate()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param testOnCreate
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getTestOnCreate()} for each per user pool.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
                throw new SQLException(
                        "Given password did not match password used" + " to create the PooledConnection.", ex);
            } catch (final javax.naming.NamingException ne) {
                throw new SQLException("NamingException encountered connecting to database", ne);
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     * @deprecated Use {@link #getDefaultSoftMinEvictableIdleDuration()}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnReturn()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param testOnReturn
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getTestOnReturn()} for each per user pool.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestWhileIdle()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getTestWhileIdle()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getTestWhileIdle()} for each per user pool.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     * @since 2.10.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnCreate()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getTestOnCreate()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getTestOnCreate()} for each per user pool.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Sets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     *
     * @param defaultSoftMinEvictableIdleDuration
     *            The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *            GenericObjectPool#getSoftMinEvictableIdleTimeMillis()} for each per user pool.
     * @since 2.10.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java

    /**
     * Gets the default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     * GenericObjectPool#getTestOnReturn()} for each per user pool.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2.impl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * GenericObjectPool#getTestOnReturn()} for each per user pool.
     *
     * @return The default value for {@link org.apache.commons.pool2.impl.GenericObjectPool
     *         GenericObjectPool#getTestOnReturn()} for each per user pool.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java

    @Override
    public java.net.URL getURL(final String columnName) throws SQLException {
        try {
            return resultSet.getURL(columnName);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java

    @Override
    public java.net.URL getURL(final int columnIndex) throws SQLException {
        try {
            return resultSet.getURL(columnIndex);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     * Clears pool(s) maintained by this data source.
     *
     * @see org.apache.commons.pool2.ObjectPool#clear()
     * @since 2.3.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.pool2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     * Closes pool(s) maintained by this data source.
     *
     * @see org.apache.commons.pool2.ObjectPool#close()
     */
    @Override
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
                } catch (final Exception e2) {
                    System.err.println("EXCEPTION WHILE DESTROYING OBJECT " + pci);
                    e2.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
        } catch (final Exception e) {
            System.err.println("EXCEPTION WHILE DESTROYING OBJECT " + pci);
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
        } catch (final Exception e) {
            System.err.println("EXCEPTION WHILE DESTROYING OBJECT " + info);
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/datasources/KeyedCPDSConnectionFactory.java`
#### Snippet
```java
                } catch (final Exception e3) {
                    System.err.println("EXCEPTION WHILE DESTROYING OBJECT " + pci);
                    e3.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbcp2/managed/DataSourceXAConnectionFactory.java`
#### Snippet
```java
            } catch (final SQLException e) {
                System.err.println("Failed to close XAConnection");
                e.printStackTrace();
            }
        }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `InstanceKeyDataSource()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/dbcp2/datasources/InstanceKeyDataSource.java`
#### Snippet
```java
     * Default no-arg constructor for Serialization.
     */
    public InstanceKeyDataSource() {
    }

```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `pool` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java
    private int maxTotal = GenericKeyedObjectPoolConfig.DEFAULT_MAX_TOTAL;

    private transient KeyedObjectPool<UserPassKey, PooledConnectionAndInfo> pool;
    private transient KeyedCPDSConnectionFactory factory;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `factory` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java

    private transient KeyedObjectPool<UserPassKey, PooledConnectionAndInfo> pool;
    private transient KeyedCPDSConnectionFactory factory;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxConnDuration` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
    private ObjectPool<PooledConnectionAndInfo> pool;
    private UserPassKey userPassKey;
    private Duration maxConnDuration = Duration.ofMillis(-1);

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `userPassKey` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
    private final boolean rollbackAfterValidation;
    private ObjectPool<PooledConnectionAndInfo> pool;
    private UserPassKey userPassKey;
    private Duration maxConnDuration = Duration.ofMillis(-1);

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pool` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
    private final Duration validationQueryTimeoutDuration;
    private final boolean rollbackAfterValidation;
    private ObjectPool<PooledConnectionAndInfo> pool;
    private UserPassKey userPassKey;
    private Duration maxConnDuration = Duration.ofMillis(-1);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `durationBetweenEvictionRuns` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
    private boolean poolPreparedStatements;
    private int maxIdle = 10;
    private Duration durationBetweenEvictionRuns = BaseObjectPoolConfig.DEFAULT_TIME_BETWEEN_EVICTION_RUNS;
    private int numTestsPerEvictionRun = -1;
    private Duration minEvictableIdleDuration = BaseObjectPoolConfig.DEFAULT_MIN_EVICTABLE_IDLE_DURATION;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connectionString` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java

    /** Connection string */
    private String connectionString;

    /** User name */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxIdle` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
    // PreparedStatement pool properties
    private boolean poolPreparedStatements;
    private int maxIdle = 10;
    private Duration durationBetweenEvictionRuns = BaseObjectPoolConfig.DEFAULT_TIME_BETWEEN_EVICTION_RUNS;
    private int numTestsPerEvictionRun = -1;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxPreparedStatements` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
    private Duration minEvictableIdleDuration = BaseObjectPoolConfig.DEFAULT_MIN_EVICTABLE_IDLE_DURATION;

    private int maxPreparedStatements = -1;

    /** Whether or not getConnection has been called */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `poolPreparedStatements` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java

    // PreparedStatement pool properties
    private boolean poolPreparedStatements;
    private int maxIdle = 10;
    private Duration durationBetweenEvictionRuns = BaseObjectPoolConfig.DEFAULT_TIME_BETWEEN_EVICTION_RUNS;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `loginTimeout` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java

    /** Login TimeOut in seconds */
    private int loginTimeout;

    /** Log stream. NOT USED */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `minEvictableIdleDuration` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
    private Duration durationBetweenEvictionRuns = BaseObjectPoolConfig.DEFAULT_TIME_BETWEEN_EVICTION_RUNS;
    private int numTestsPerEvictionRun = -1;
    private Duration minEvictableIdleDuration = BaseObjectPoolConfig.DEFAULT_MIN_EVICTABLE_IDLE_DURATION;

    private int maxPreparedStatements = -1;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `description` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java

    /** Description */
    private String description;

    /** Connection string */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `numTestsPerEvictionRun` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java
    private int maxIdle = 10;
    private Duration durationBetweenEvictionRuns = BaseObjectPoolConfig.DEFAULT_TIME_BETWEEN_EVICTION_RUNS;
    private int numTestsPerEvictionRun = -1;
    private Duration minEvictableIdleDuration = BaseObjectPoolConfig.DEFAULT_MIN_EVICTABLE_IDLE_DURATION;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `driver` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java

    /** Driver class name */
    private String driver;

    /** Login TimeOut in seconds */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connectionProperties` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/DriverAdapterCPDS.java`
#### Snippet
```java

    /** Connection properties passed to JDBC Driver */
    private Properties connectionProperties;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `statement` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java

    /** My delegate. */
    private Statement statement;

    /** The connection that created me. **/
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pStmtPool` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java

    /** Pool of {@link PreparedStatement}s. and {@link CallableStatement}s */
    private KeyedObjectPool<PStmtKey, DelegatingPreparedStatement> pStmtPool;

    private boolean clearStatementPoolOnReturn;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `transactionRegistry` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/managed/BasicManagedDataSource.java`
#### Snippet
```java

    /** Transaction Registry */
    private TransactionRegistry transactionRegistry;

    /** Transaction Manager */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `xaDataSourceInstance` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/managed/BasicManagedDataSource.java`
#### Snippet
```java

    /** XA data source instance */
    private XADataSource xaDataSourceInstance;

    /** Transaction Synchronization Registry */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `xaDataSource` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/managed/BasicManagedDataSource.java`
#### Snippet
```java

    /** XA data source class name */
    private String xaDataSource;

    /** XA data source instance */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `testWhileIdle` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * validate, it will be dropped from the pool.
     */
    private boolean testWhileIdle;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lifo` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * instance pool in the order that they are returned to the pool.
     */
    private boolean lifo = BaseObjectPoolConfig.DEFAULT_LIFO;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `registeredJmxObjectName` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * Actual name under which this component has been registered.
     */
    private ObjectNameWrapper registeredJmxObjectName;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `testOnReturn` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * The indication of whether objects will be validated before being returned to the pool.
     */
    private boolean testOnReturn;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `poolPreparedStatements` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * and CallableStatements are pooled.
     */
    private boolean poolPreparedStatements;

    private boolean clearStatementPoolOnReturn;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `minIdle` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * {@link #durationBetweenEvictionRuns} has a positive value.
     */
    private int minIdle = GenericObjectPoolConfig.DEFAULT_MIN_IDLE;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `testOnCreate` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * fails to validate, the borrow operation that triggered the creation will fail.
     */
    private boolean testOnCreate;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxWaitDuration` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * connection to be returned before throwing an exception, or <= 0 to wait indefinitely.
     */
    private Duration maxWaitDuration = BaseObjectPoolConfig.DEFAULT_MAX_WAIT;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `evictionPolicyClassName` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    private Duration softMinEvictableIdleDuration = BaseObjectPoolConfig.DEFAULT_SOFT_MIN_EVICTABLE_IDLE_DURATION;

    private String evictionPolicyClassName = BaseObjectPoolConfig.DEFAULT_EVICTION_POLICY_CLASS_NAME;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxOpenPreparedStatements` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * </p>
     */
    private int maxOpenPreparedStatements = GenericKeyedObjectPoolConfig.DEFAULT_MAX_TOTAL;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxIdle` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * starting point.
     */
    private int maxIdle = GenericObjectPoolConfig.DEFAULT_MAX_IDLE;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `minEvictableIdleDuration` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * object evictor (if any).
     */
    private Duration minEvictableIdleDuration = BaseObjectPoolConfig.DEFAULT_MIN_EVICTABLE_IDLE_DURATION;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `numTestsPerEvictionRun` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * The number of objects to examine during each run of the idle object evictor thread (if any).
     */
    private int numTestsPerEvictionRun = BaseObjectPoolConfig.DEFAULT_NUM_TESTS_PER_EVICTION_RUN;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `softMinEvictableIdleDuration` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * {@link #getSoftMinEvictableIdleDuration()}.
     */
    private Duration softMinEvictableIdleDuration = BaseObjectPoolConfig.DEFAULT_SOFT_MIN_EVICTABLE_IDLE_DURATION;

    private String evictionPolicyClassName = BaseObjectPoolConfig.DEFAULT_EVICTION_POLICY_CLASS_NAME;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxTotal` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * no limit.
     */
    private int maxTotal = GenericObjectPoolConfig.DEFAULT_MAX_TOTAL;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `durationBetweenEvictionRuns` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * object evictor thread will be run.
     */
    private Duration durationBetweenEvictionRuns = BaseObjectPoolConfig.DEFAULT_TIME_BETWEEN_EVICTION_RUNS;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `testOnBorrow` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     * validate, it will be dropped from the pool, and we will attempt to borrow another.
     */
    private boolean testOnBorrow = true;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pStmtPool` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java

    /** My pool of {@link PreparedStatement}s. */
    private KeyedObjectPool<PStmtKey, DelegatingPreparedStatement> pStmtPool;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logicalConnection` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * The JDBC database logical connection.
     */
    private Connection logicalConnection;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `closed` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * Flag set to true, once {@link #close()} is called.
     */
    private boolean closed;

    /** My pool of {@link PreparedStatement}s. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connection` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
     * The JDBC database connection that represents the physical db connection.
     */
    private Connection connection;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connection` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java

    /** The Connection that created me, if any. **/
    private Connection connection;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `statement` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java

    /** The Statement that created me, if any. **/
    private Statement statement;

    /** The Connection that created me, if any. **/
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `managers` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
     * Map to keep track of Pools for a given user.
     */
    private transient Map<PoolKey, PooledConnectionManager> managers = createMap();

    /**
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/dbcp2/ConnectionFactoryFactory.java`
#### Snippet
```java
        final String user = basicDataSource.getUsername();
        if (user != null) {
            connectionProperties.put(Constants.KEY_USER, user);
        } else {
            basicDataSource.log(String.format("DBCP DataSource configured without a '%s'", Constants.KEY_USER));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/dbcp2/ConnectionFactoryFactory.java`
#### Snippet
```java
        final String pwd = basicDataSource.getPassword();
        if (pwd != null) {
            connectionProperties.put(Constants.KEY_PASSWORD, pwd);
        } else {
            basicDataSource.log(String.format("DBCP DataSource configured without a '%s'", Constants.KEY_PASSWORD));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    public void addConnectionProperty(final String name, final String value) {
        connectionProperties.put(name, value);
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

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `timeoutDuration`
in `src/main/java/org/apache/commons/dbcp2/PoolableConnection.java`
#### Snippet
```java
        if (sql == null || sql.isEmpty()) {
            if (timeoutDuration.isNegative()) {
                timeoutDuration = Duration.ZERO;
            }
            if (!isValid(timeoutDuration)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `map`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
    <K, V> Map<K, V> put(Map<K, V> map, final K key, final V value) {
        if (map == null) {
            map = createMap();
        }
        map.put(key, value);
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `SQLExceptionList` does not end with 'Exception'
in `src/main/java/org/apache/commons/dbcp2/SQLExceptionList.java`
#### Snippet
```java
 * @since 2.7.0
 */
public class SQLExceptionList extends SQLException {

    private static final long serialVersionUID = 1L;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-26-14-39-31.788.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/ObjectNameWrapper.java`
#### Snippet
```java

    public static ObjectName unwrap(final ObjectNameWrapper wrapper) {
        return wrapper == null ? null : wrapper.unwrap();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/ObjectNameWrapper.java`
#### Snippet
```java
            // ignore - JMX not available
            log.debug("Failed to get platform MBeanServer", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e); // Does not return
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e); // Does not return
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e); // Does not return
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
            return getDelegateInternal();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e); // Does not return
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
            return super.getInnermostDelegateInternal();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/ConnectionImpl.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
    @Deprecated
    public Integer getDefaultQueryTimeout() {
        return defaultQueryTimeoutDuration == null ? null : (int) defaultQueryTimeoutDuration.getSeconds();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
            conn = ((DelegatingConnection<?>) conn).getDelegateInternal();
            if (this == conn) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingConnection.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingDatabaseMetaData.java`
#### Snippet
```java
            m = ((DelegatingDatabaseMetaData) m).getDelegate();
            if (this == m) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolableConnectionFactory.java`
#### Snippet
```java
    @Deprecated
    public Integer getDefaultQueryTimeoutSeconds() {
        return defaultQueryTimeoutDuration == null ? null : (int) defaultQueryTimeoutDuration.getSeconds();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolingDriver.java`
#### Snippet
```java
                return super.getInnermostDelegate();
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolingDriver.java`
#### Snippet
```java
                return super.getDelegate();
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolingDriver.java`
#### Snippet
```java
                final Connection conn = pool.borrowObject();
                if (conn == null) {
                    return null;
                }
                return new PoolGuardConnectionWrapper(pool, conn);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolingDriver.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DataSourceMXBean.java`
#### Snippet
```java
     */
    default String getDefaultSchema() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
            s = ((DelegatingStatement) s).getDelegate();
            if (this == s) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/managed/TransactionRegistry.java`
#### Snippet
```java
            // was there a transaction?
            if (transaction == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java
            final C conn = pool.borrowObject();
            if (conn == null) {
                return null;
            }
            return new PoolGuardConnectionWrapper<>(conn);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java
        @Override
        public D getDelegate() {
            return isAccessToUnderlyingConnectionAllowed() ? super.getDelegate() : null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolingDataSource.java`
#### Snippet
```java
        @Override
        public Connection getInnermostDelegate() {
            return isAccessToUnderlyingConnectionAllowed() ? super.getInnermostDelegate() : null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/Jdbc41Bridge.java`
#### Snippet
```java
        } catch (final AbstractMethodError e) {
            // do nothing
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/Jdbc41Bridge.java`
#### Snippet
```java
        } catch (final AbstractMethodError e) {
            // do nothing
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/managed/ManagedConnection.java`
#### Snippet
```java
            return super.getInnermostDelegateInternal();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/managed/ManagedConnection.java`
#### Snippet
```java
            return getDelegateInternal();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java
            return getSchema();
        } catch (final SQLException ignored) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PoolingConnection.java`
#### Snippet
```java
            return getCatalog();
        } catch (final SQLException ignored) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PStmtKey.java`
#### Snippet
```java

    private String[] clone(final String[] array) {
        return array == null ? null : array.clone();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/PStmtKey.java`
#### Snippet
```java

    private int[] clone(final int[] array) {
        return array == null ? null : array.clone();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
    @Deprecated
    public Integer getDefaultQueryTimeout() {
        return defaultQueryTimeoutDuration == null ? null : (int) defaultQueryTimeoutDuration.getSeconds();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
     */
    public PrintWriter getAbandonedLogWriter() {
        return abandonedConfig == null ? null : abandonedConfig.getLogWriter();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingCallableStatement.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/Utils.java`
#### Snippet
```java
     */
    public static String toString(final char[] value) {
        return value == null ? null : String.valueOf(value);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/Utils.java`
#### Snippet
```java
     */
    public static char[] clone(final char[] value) {
        return value == null ? null : value.clone();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/Utils.java`
#### Snippet
```java
     */
    public static char[] toCharArray(final String value) {
        return value != null ? value.toCharArray() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
    private String getSchemaOrNull() {
        try {
            return connection == null ? null : Jdbc41Bridge.getSchema(connection);
        } catch (final SQLException e) {
            return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
            return connection == null ? null : Jdbc41Bridge.getSchema(connection);
        } catch (final SQLException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
    private String getCatalogOrNull() {
        try {
            return connection == null ? null : connection.getCatalog();
        } catch (final SQLException e) {
            return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/cpdsadapter/PooledConnectionImpl.java`
#### Snippet
```java
            return connection == null ? null : connection.getCatalog();
        } catch (final SQLException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
        // that specify a class name of "javax.sql.DataSource"
        if (obj == null || !(obj instanceof Reference)) {
            return null;
        }
        final Reference ref = (Reference) obj;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java
        final Reference ref = (Reference) obj;
        if (!"javax.sql.DataSource".equals(ref.getClassName())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
    public static ResultSet wrapResultSet(final Connection connection, final ResultSet resultSet) {
        if (null == resultSet) {
            return null;
        }
        return new DelegatingResultSet(connection, resultSet);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
    public static ResultSet wrapResultSet(final Statement statement, final ResultSet resultSet) {
        if (null == resultSet) {
            return null;
        }
        return new DelegatingResultSet(statement, resultSet);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
            r = ((DelegatingResultSet) r).getDelegate();
            if (this == r) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/DelegatingResultSet.java`
#### Snippet
```java
        } catch (final SQLException e) {
            handleException(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java

    private Duration toDurationOrNull(final Long millis) {
        return millis == null ? null : Duration.ofMillis(millis);
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
    private ObjectPool<PooledConnectionAndInfo> getPool(final PoolKey poolKey) {
        final CPDSConnectionFactory mgr = (CPDSConnectionFactory) managers.get(poolKey);
        return mgr == null ? null : mgr.getPool();
    }

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `src/main/java/org/apache/commons/dbcp2/BasicDataSourceFactory.java`
#### Snippet
```java

        getOptional(properties, PROP_DEFAULT_TRANSACTION_ISOLATION).ifPresent(value -> {
            value = value.toUpperCase(Locale.ROOT);
            int level = PoolableConnectionFactory.UNKNOWN_TRANSACTION_ISOLATION;
            if ("NONE".equals(value)) {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/dbcp2/datasources/SharedPoolDataSource.java`
#### Snippet
```java
            throws SQLException {

        synchronized (this) {
            if (pool == null) {
                try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/dbcp2/datasources/CPDSConnectionFactory.java`
#### Snippet
```java
    @Override
    public void closePool(final String userName) throws SQLException {
        synchronized (this) {
            if (userName == null || !userName.equals(this.userPassKey.getUserName())) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/dbcp2/managed/TransactionRegistry.java`
#### Snippet
```java

        // register the context (or create a new one)
        synchronized (this) {
            return caches.computeIfAbsent(transaction, k -> new TransactionContext(this, k, transactionSynchronizationRegistry));
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/dbcp2/BasicDataSource.java`
#### Snippet
```java
            return dataSource;
        }
        synchronized (this) {
            if (dataSource != null) {
                return dataSource;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
        ObjectPool<PooledConnectionAndInfo> pool;
        PooledConnectionManager manager;
        synchronized (this) {
            manager = managers.get(key);
            if (manager == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
            // New password works, so kill the old pool, create a new one, and borrow
            manager.closePool(userName);
            synchronized (this) {
                managers.remove(key);
            }
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

## RuleId[id=UnusedAssignment]
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
Variable `info` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbcp2/datasources/PerUserPoolDataSource.java`
#### Snippet
```java
        }

        PooledConnectionAndInfo info = null;
        try {
            info = pool.borrowObject();
```

## RuleId[id=ConstantValue]
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

