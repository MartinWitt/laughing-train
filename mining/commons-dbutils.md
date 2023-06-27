# commons-dbutils 
 
# Bad smells
I found 20 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantTypeArguments | 8 | false |
| DeprecatedIsStillUsed | 3 | false |
| UnusedAssignment | 3 | false |
| TrivialIf | 2 | false |
| MagicConstant | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| DataFlowIssue | 1 | false |
| RedundantClassCall | 1 | false |
## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: ResultSet.FETCH_FORWARD, ResultSet.FETCH_REVERSE, ResultSet.FETCH_UNKNOWN
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
        if (stmtConfig != null) {
            if (stmtConfig.isFetchDirectionSet()) {
                stmt.setFetchDirection(stmtConfig.getFetchDirection());
            }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `method` is redundant
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
     */
    protected Method getWriteMethod(final Object target, final PropertyDescriptor prop, final Object value) {
        final Method method = prop.getWriteMethod();
        return method;
    }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getParameterType` may produce `NullPointerException`
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
                         * be null here.
                         */
                        sqlType = pmd.getParameterType(i + 1);
                    } catch (final SQLException e) {
                        pmdKnownBroken = true;
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/org/apache/commons/dbutils/handlers/properties/DatePropertyHandler.java`
#### Snippet
```java
            }
            if ("java.sql.Timestamp".equals(targetType)
                    && !Timestamp.class.isInstance(value)) {
                return true;
            }
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
        final Connection conn = this.prepareConnection();

        return this.<T>query(conn, true, sql, rsh, param);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
    @Deprecated
    public <T> T query(final Connection conn, final String sql, final Object[] params, final ResultSetHandler<T> rsh) throws SQLException {
        return this.<T>query(conn, false, sql, rsh, params);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     */
    public <T> T query(final Connection conn, final String sql, final ResultSetHandler<T> rsh) throws SQLException {
        return this.<T>query(conn, false, sql, rsh, (Object[]) null);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     */
    public <T> T query(final Connection conn, final String sql, final ResultSetHandler<T> rsh, final Object... params) throws SQLException {
        return this.<T>query(conn, false, sql, rsh, params);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
        final Connection conn = this.prepareConnection();

        return this.<T>query(conn, true, sql, rsh, (Object[]) null);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
    @Deprecated
    public <T> T query(final Connection conn, final String sql, final Object param, final ResultSetHandler<T> rsh) throws SQLException {
        return this.<T>query(conn, false, sql, rsh, param);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
        final Connection conn = this.prepareConnection();

        return this.<T>query(conn, true, sql, rsh, params);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
        final Connection conn = this.prepareConnection();

        return this.<T>query(conn, true, sql, rsh, params);
    }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ds' is still used
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     */
    @Deprecated
    protected final DataSource ds;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'AsyncQueryRunner' is still used
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    @Deprecated
    public AsyncQueryRunner(final DataSource ds, final boolean pmdKnownBroken, final ExecutorService executorService) {
        super(ds, pmdKnownBroken);
        this.executorService = executorService;
```

### DeprecatedIsStillUsed
Deprecated member 'AsyncQueryRunner' is still used
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    @Deprecated
    public AsyncQueryRunner(final boolean pmdKnownBroken, final ExecutorService executorService) {
        this(null, pmdKnownBroken, executorService);
    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `beanInfo` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
        throws SQLException {
        // Introspector caches BeanInfo classes for better performance
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(c);
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
        for (int i = 0; i < properties.length; i++) {
            final PropertyDescriptor property = properties[i];
            Object value = null;
            final Method method = property.getReadMethod();
            if (method == null) {
```

### UnusedAssignment
Variable `pmd` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java

        PreparedStatement stmt = null;
        ParameterMetaData pmd = null;
        int[] rows = null;
        try {
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/dbutils/handlers/properties/DatePropertyHandler.java`
#### Snippet
```java
                return true;
            }
            if ("java.sql.Timestamp".equals(targetType)
                    && !Timestamp.class.isInstance(value)) {
                return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
    private boolean isCompatibleType(final Object value, final Class<?> type) {
        // Do object check first, then primitives
        if (value == null || type.isInstance(value) || matchesPrimitive(type, value.getClass())) {
            return true;

```

