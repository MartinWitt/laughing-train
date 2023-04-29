# commons-dbutils 
 
# Bad smells
I found 180 bad smells with 13 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 60 | false |
| RedundantFieldInitialization | 23 | false |
| UnnecessaryBoxing | 21 | false |
| Convert2Lambda | 18 | false |
| BoundedWildcard | 13 | false |
| ReturnNull | 9 | false |
| NonProtectedConstructorInAbstractClass | 7 | true |
| AssignmentToMethodParameter | 4 | false |
| SizeReplaceableByIsEmpty | 4 | true |
| RedundantSuppression | 4 | false |
| DeprecatedIsStillUsed | 3 | false |
| UnusedAssignment | 3 | false |
| SystemOutErr | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| MagicConstant | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DataFlowIssue | 1 | false |
| RedundantClassCall | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UtilityClassWithPublicConstructor | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbutils/DbUtils.java`
#### Snippet
```java
     */
    public static void printStackTrace(final SQLException e) {
        printStackTrace(e, new PrintWriter(System.err));
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/dbutils/DbUtils.java`
#### Snippet
```java
     */
    public static void printWarnings(final Connection conn) {
        printWarnings(conn, new PrintWriter(System.err));
    }

```

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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DbUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/dbutils/DbUtils.java`
#### Snippet
```java
 * A collection of JDBC helper methods.  This class is thread safe.
 */
public final class DbUtils {

    /**
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/dbutils/GenerousBeanProcessor.java`
#### Snippet
```java

            final String generousColumnName = columnName
                    .replace("_", "")   // more idiomatic to Java
                    .replace(" ", "");  // can't have spaces in property names

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/dbutils/GenerousBeanProcessor.java`
#### Snippet
```java
            final String generousColumnName = columnName
                    .replace("_", "")   // more idiomatic to Java
                    .replace(" ", "");  // can't have spaces in property names

            for (int i = 0; i < props.length; i++) {
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/BeanListHandler.java`
#### Snippet
```java
     *
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.RowProcessor#toBeanList(ResultSet, Class)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/BeanListHandler.java`
#### Snippet
```java
 *
 * @param <T> the target bean type
 * @see org.apache.commons.dbutils.ResultSetHandler
 */
public class BeanListHandler<T> implements ResultSetHandler<List<T>> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/MapHandler.java`
#### Snippet
```java
 * safe.
 *
 * @see org.apache.commons.dbutils.ResultSetHandler
 */
public class MapHandler implements ResultSetHandler<Map<String, Object>> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/MapHandler.java`
#### Snippet
```java
     * @throws SQLException if a database access error occurs
     *
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/MapHandler.java`
#### Snippet
```java
     * @throws SQLException if a database access error occurs
     *
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils.handlers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/ColumnListHandler.java`
#### Snippet
```java
     * @throws ClassCastException if the class datatype does not match the column type
     *
     * @see org.apache.commons.dbutils.handlers.AbstractListHandler#handle(ResultSet)
     */
    // We assume that the user has picked the correct type to match the column
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils.handlers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/ArrayListHandler.java`
#### Snippet
```java
     *
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.handlers.AbstractListHandler#handle(ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils.handlers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/MapListHandler.java`
#### Snippet
```java
     * @throws SQLException if a database access error occurs
     *
     * @see org.apache.commons.dbutils.handlers.AbstractListHandler#handle(ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/BeanHandler.java`
#### Snippet
```java
     *
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/BeanHandler.java`
#### Snippet
```java
     *
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/BeanHandler.java`
#### Snippet
```java
 *
 * @param <T> the target bean type
 * @see org.apache.commons.dbutils.ResultSetHandler
 */
public class BeanHandler<T> implements ResultSetHandler<T> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryLoader.java`
#### Snippet
```java
     * invalid
     * @return Map of query names to SQL values
     * @see java.util.Properties
     */
    public synchronized Map<String, String> load(final String path) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryLoader.java`
#### Snippet
```java
     * @since 1.1
     * @return Map of query names to SQL values
     * @see java.util.Properties
     */
    protected Map<String, String> loadQueries(final String path) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/properties/DatePropertyHandler.java`
#### Snippet
```java
/**
 * {@link PropertyHandler} for date fields. Will convert {@link java.sql.Date}, {@link java.sql.Time}, and
 * {@link java.sql.Timestamp} from SQL types to java types.
 */
public class DatePropertyHandler implements PropertyHandler {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/dbutils/handlers/properties/DatePropertyHandler.java`
#### Snippet
```java
        } else
        if ("java.sql.Time".equals(targetType)) {
            value = new java.sql.Time(time);
        } else
        if ("java.sql.Timestamp".equals(targetType)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/ProxyFactory.java`
#### Snippet
```java
 * thread safe.
 *
 * @see java.lang.reflect.Proxy
 * @see java.lang.reflect.InvocationHandler
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/ProxyFactory.java`
#### Snippet
```java
 *
 * @see java.lang.reflect.Proxy
 * @see java.lang.reflect.InvocationHandler
 */
public class ProxyFactory {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
     * {@code null}.
     *
     * @see java.lang.reflect.InvocationHandler#invoke(Object, java.lang.reflect.Method, Object[])
     * @param proxy Not used; all method calls go to the internal result set
     * @param method The method to invoke on the result set
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
     * {@code null}.
     *
     * @see java.lang.reflect.InvocationHandler#invoke(Object, java.lang.reflect.Method, Object[])
     * @param proxy Not used; all method calls go to the internal result set
     * @param method The method to invoke on the result set
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils.handlers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/BeanMapHandler.java`
#### Snippet
```java
     * @throws ClassCastException if the class datatype does not match the column type
     *
     * @see org.apache.commons.dbutils.handlers.AbstractKeyedHandler#createKey(ResultSet)
     */
    // We assume that the user has picked the correct type to match the column
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/ArrayHandler.java`
#### Snippet
```java
 * thread safe.
 *
 * @see org.apache.commons.dbutils.ResultSetHandler
 */
public class ArrayHandler implements ResultSetHandler<Object[]> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/ArrayHandler.java`
#### Snippet
```java
     *
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/ArrayHandler.java`
#### Snippet
```java
     *
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/ColumnHandler.java`
#### Snippet
```java
/**
 * Interface to define how implementations can interact with column handling when constructing a bean from a
 * {@link java.sql.ResultSet}.  ColumnHandlers do the work of retrieving data correctly from the {@code ResultSet}.
 */
public interface ColumnHandler {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/wrappers/StringTrimmedResultSet.java`
#### Snippet
```java
     * returned.
     *
     * @see java.lang.reflect.InvocationHandler#invoke(Object, java.lang.reflect.Method, Object[])
     * @param proxy Not used; all method calls go to the internal result set
     * @param method The method to invoke on the result set
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/wrappers/StringTrimmedResultSet.java`
#### Snippet
```java
     * returned.
     *
     * @see java.lang.reflect.InvocationHandler#invoke(Object, java.lang.reflect.Method, Object[])
     * @param proxy Not used; all method calls go to the internal result set
     * @param method The method to invoke on the result set
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/ResultSetIterator.java`
#### Snippet
```java
    /**
     * Deletes the current row from the {@code ResultSet}.
     * @see java.util.Iterator#remove()
     * @throws RuntimeException if an SQLException occurs.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/ResultSetIterator.java`
#### Snippet
```java
     * @return An {@code Object[]} with the same number of elements as
     * columns in the {@code ResultSet}.
     * @see java.util.Iterator#next()
     * @throws RuntimeException if an SQLException occurs.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/ScalarHandler.java`
#### Snippet
```java
     * @throws ClassCastException if the class datatype does not match the column type
     *
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    // We assume that the user has picked the correct type to match the column
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/ScalarHandler.java`
#### Snippet
```java
     * @throws ClassCastException if the class datatype does not match the column type
     *
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    // We assume that the user has picked the correct type to match the column
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/ScalarHandler.java`
#### Snippet
```java
 *
 * @param <T> The type of the scalar
 * @see org.apache.commons.dbutils.ResultSetHandler
 */
public class ScalarHandler<T> implements ResultSetHandler<T> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * Convert a {@code ResultSet} into a {@code List} of JavaBeans.
     * This implementation delegates to a BeanProcessor instance.
     * @see org.apache.commons.dbutils.RowProcessor#toBeanList(java.sql.ResultSet, Class)
     * @see org.apache.commons.dbutils.BeanProcessor#toBeanList(java.sql.ResultSet, Class)
     * @param <T> The type of bean to create
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * Convert a {@code ResultSet} into a {@code List} of JavaBeans.
     * This implementation delegates to a BeanProcessor instance.
     * @see org.apache.commons.dbutils.RowProcessor#toBeanList(java.sql.ResultSet, Class)
     * @see org.apache.commons.dbutils.BeanProcessor#toBeanList(java.sql.ResultSet, Class)
     * @param <T> The type of bean to create
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * This implementation delegates to a BeanProcessor instance.
     * @see org.apache.commons.dbutils.RowProcessor#toBeanList(java.sql.ResultSet, Class)
     * @see org.apache.commons.dbutils.BeanProcessor#toBeanList(java.sql.ResultSet, Class)
     * @param <T> The type of bean to create
     * @param rs ResultSet that supplies the bean data
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * This implementation delegates to a BeanProcessor instance.
     * @see org.apache.commons.dbutils.RowProcessor#toBeanList(java.sql.ResultSet, Class)
     * @see org.apache.commons.dbutils.BeanProcessor#toBeanList(java.sql.ResultSet, Class)
     * @param <T> The type of bean to create
     * @param rs ResultSet that supplies the bean data
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * Convert a {@code ResultSet} row into a JavaBean.  This
     * implementation delegates to a BeanProcessor instance.
     * @see org.apache.commons.dbutils.RowProcessor#toBean(java.sql.ResultSet, Class)
     * @see org.apache.commons.dbutils.BeanProcessor#toBean(java.sql.ResultSet, Class)
     * @param <T> The type of bean to create
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * Convert a {@code ResultSet} row into a JavaBean.  This
     * implementation delegates to a BeanProcessor instance.
     * @see org.apache.commons.dbutils.RowProcessor#toBean(java.sql.ResultSet, Class)
     * @see org.apache.commons.dbutils.BeanProcessor#toBean(java.sql.ResultSet, Class)
     * @param <T> The type of bean to create
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * implementation delegates to a BeanProcessor instance.
     * @see org.apache.commons.dbutils.RowProcessor#toBean(java.sql.ResultSet, Class)
     * @see org.apache.commons.dbutils.BeanProcessor#toBean(java.sql.ResultSet, Class)
     * @param <T> The type of bean to create
     * @param rs ResultSet that supplies the bean data
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * implementation delegates to a BeanProcessor instance.
     * @see org.apache.commons.dbutils.RowProcessor#toBean(java.sql.ResultSet, Class)
     * @see org.apache.commons.dbutils.BeanProcessor#toBean(java.sql.ResultSet, Class)
     * @param <T> The type of bean to create
     * @param rs ResultSet that supplies the bean data
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * @return the newly created Map
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.RowProcessor#toMap(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * @return the newly created Map
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.RowProcessor#toMap(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * will be set to {@code null} if the column was SQL NULL.
     *
     * @see org.apache.commons.dbutils.RowProcessor#toArray(java.sql.ResultSet)
     * @param rs ResultSet that supplies the array data
     * @throws SQLException if a database access error occurs
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
     * will be set to {@code null} if the column was SQL NULL.
     *
     * @see org.apache.commons.dbutils.RowProcessor#toArray(java.sql.ResultSet)
     * @param rs ResultSet that supplies the array data
     * @throws SQLException if a database access error occurs
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/AbstractListHandler.java`
#### Snippet
```java
 *
 * @param <T> the target List generic type
 * @see org.apache.commons.dbutils.ResultSetHandler
 */
public abstract class AbstractListHandler<T> implements ResultSetHandler<List<T>> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/AbstractKeyedHandler.java`
#### Snippet
```java
     * @return A {@code Map}, never {@code null}.
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/AbstractKeyedHandler.java`
#### Snippet
```java
     * @return A {@code Map}, never {@code null}.
     * @throws SQLException if a database access error occurs
     * @see org.apache.commons.dbutils.ResultSetHandler#handle(java.sql.ResultSet)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/handlers/AbstractKeyedHandler.java`
#### Snippet
```java
 * @param <K> the type of keys maintained by the returned map
 * @param <V> the type of mapped values
 * @see org.apache.commons.dbutils.ResultSetHandler
 * @since 1.3
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     *
     * @param ds The {@code DataSource} to retrieve connections from.
     * @param pmdKnownBroken Some drivers don't support {@link java.sql.ParameterMetaData#getParameterType(int) };
     * if {@code pmdKnownBroken} is set to true, we won't even try it; if false, we'll try it,
     * and if it breaks, we'll remember not to use it again.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
     * @param prop   BeanUtils information.
     * @param value  The value that will be passed to the write method.
     * @return The {@link java.lang.reflect.Method} to call on {@code target} to write {@code value} or {@code null} if
     *         there is no suitable write method.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     *
     * @param ds The {@code DataSource} to retrieve connections from.
     * @param pmdKnownBroken Some drivers don't support {@link java.sql.ParameterMetaData#getParameterType(int) };
     * if {@code pmdKnownBroken} is set to true, we won't even try it; if false, we'll try it,
     * and if it breaks, we'll remember not to use it again.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     *
     * @param ds The {@code DataSource} to retrieve connections from.
     * @param pmdKnownBroken Some drivers don't support {@link java.sql.ParameterMetaData#getParameterType(int) };
     * if {@code pmdKnownBroken} is set to true, we won't even try it; if false, we'll try it,
     * and if it breaks, we'll remember not to use it again.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * Constructor for QueryRunner that controls the use of {@code ParameterMetaData}.
     *
     * @param pmdKnownBroken Some drivers don't support {@link java.sql.ParameterMetaData#getParameterType(int) };
     * if {@code pmdKnownBroken} is set to true, we won't even try it; if false, we'll try it,
     * and if it breaks, we'll remember not to use it again.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * result sets; b) invoking a stored procedure that return result
     * sets and OUT parameters.  Otherwise you may wish to use
     * {@link #query(java.sql.Connection, String, org.apache.commons.dbutils.ResultSetHandler, Object...) }
     * (if there are no OUT parameters) or
     * {@link #execute(java.sql.Connection, String, Object...) }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * result sets; b) invoking a stored procedure that return result
     * sets and OUT parameters.  Otherwise you may wish to use
     * {@link #query(java.sql.Connection, String, org.apache.commons.dbutils.ResultSetHandler, Object...) }
     * (if there are no OUT parameters) or
     * {@link #execute(java.sql.Connection, String, Object...) }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * {@link #query(java.sql.Connection, String, org.apache.commons.dbutils.ResultSetHandler, Object...) }
     * (if there are no OUT parameters) or
     * {@link #execute(java.sql.Connection, String, Object...) }
     * (if there are no result sets).
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * {@link #update(String, Object...) }.
     * If the stored procedure returns result sets, use
     * {@link #execute(String, org.apache.commons.dbutils.ResultSetHandler, Object...) }.
     * <p>
     * The {@code Connection} is retrieved from the {@code DataSource}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * that does not return any result sets.  If you are not invoking a stored
     * procedure, or the stored procedure has no OUT parameters, consider using
     * {@link #update(java.sql.Connection, String, Object...) }.
     * If the stored procedure returns result sets, use
     * {@link #execute(java.sql.Connection, String, org.apache.commons.dbutils.ResultSetHandler, Object...) }.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * {@link #update(java.sql.Connection, String, Object...) }.
     * If the stored procedure returns result sets, use
     * {@link #execute(java.sql.Connection, String, org.apache.commons.dbutils.ResultSetHandler, Object...) }.
     *
     * @param conn The connection to use to run the query.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * {@link #update(java.sql.Connection, String, Object...) }.
     * If the stored procedure returns result sets, use
     * {@link #execute(java.sql.Connection, String, org.apache.commons.dbutils.ResultSetHandler, Object...) }.
     *
     * @param conn The connection to use to run the query.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.dbutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * result sets; b) invoking a stored procedure that return result
     * sets and OUT parameters.  Otherwise you may wish to use
     * {@link #query(String, org.apache.commons.dbutils.ResultSetHandler, Object...) }
     * (if there are no OUT parameters) or
     * {@link #execute(String, Object...) }
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

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractQueryRunner()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     * Default constructor, sets pmdKnownBroken to false, ds to null and stmtConfig to null.
     */
    public AbstractQueryRunner() {
        ds = null;
        this.stmtConfig = null;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractQueryRunner()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     *            The {@code DataSource} to retrieve connections from.
     */
    public AbstractQueryRunner(final DataSource ds) {
        this.ds = ds;
        this.stmtConfig = null;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractQueryRunner()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     * @param stmtConfig The configuration to apply to statements when they are prepared.
     */
    public AbstractQueryRunner(final DataSource ds, final StatementConfiguration stmtConfig) {
        this.ds = ds;
        this.stmtConfig = stmtConfig;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractQueryRunner()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     * @param stmtConfig The configuration to apply to statements when they are prepared.
     */
    public AbstractQueryRunner(final DataSource ds, final boolean pmdKnownBroken, final StatementConfiguration stmtConfig) {
        this.pmdKnownBroken = pmdKnownBroken;
        this.ds = ds;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractQueryRunner()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     *            not to use it again.
     */
    public AbstractQueryRunner(final boolean pmdKnownBroken) {
        this.pmdKnownBroken = pmdKnownBroken;
        ds = null;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractQueryRunner()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     * @param stmtConfig The configuration to apply to statements when they are prepared.
     */
    public AbstractQueryRunner(final StatementConfiguration stmtConfig) {
        this.ds = null;
        this.stmtConfig = stmtConfig;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractQueryRunner()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     *            not to use it again.
     */
    public AbstractQueryRunner(final DataSource ds, final boolean pmdKnownBroken) {
        this.pmdKnownBroken = pmdKnownBroken;
        this.ds = ds;
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public <T> Future<T> insert(final Connection conn, final String sql, final ResultSetHandler<T> rsh) throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public Future<Integer> update(final Connection conn, final String sql, final Object... params) throws SQLException {
        return executorService.submit(new Callable<Integer>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public Future<int[]> batch(final String sql, final Object[][] params) throws SQLException {
        return executorService.submit(new Callable<int[]>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public <T> Future<T> insert(final Connection conn, final String sql, final ResultSetHandler<T> rsh, final Object... params) throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public <T> Future<T> query(final String sql, final ResultSetHandler<T> rsh, final Object... params) throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public Future<Integer> update(final Connection conn, final String sql) throws SQLException {
        return executorService.submit(new Callable<Integer>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public <T> Future<T> query(final String sql, final ResultSetHandler<T> rsh) throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public Future<Integer> update(final String sql) throws SQLException {
        return executorService.submit(new Callable<Integer>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public <T> Future<T> insert(final String sql, final ResultSetHandler<T> rsh, final Object... params) throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public <T> Future<T> insert(final String sql, final ResultSetHandler<T> rsh) throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public Future<Integer> update(final String sql, final Object... params) throws SQLException {
        return executorService.submit(new Callable<Integer>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public <T> Future<T> query(final Connection conn, final String sql, final ResultSetHandler<T> rsh) throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public Future<int[]> batch(final Connection conn, final String sql, final Object[][] params) throws SQLException {
        return executorService.submit(new Callable<int[]>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
    public <T> Future<T> query(final Connection conn, final String sql, final ResultSetHandler<T> rsh, final Object... params)
            throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public <T> Future<T> insertBatch(final Connection conn, final String sql, final ResultSetHandler<T> rsh, final Object[][] params) throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public <T> Future<T> insertBatch(final String sql, final ResultSetHandler<T> rsh, final Object[][] params) throws SQLException {
        return executorService.submit(new Callable<T>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public Future<Integer> update(final Connection conn, final String sql, final Object param) throws SQLException {
        return executorService.submit(new Callable<Integer>() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     */
    public Future<Integer> update(final String sql, final Object param) throws SQLException {
        return executorService.submit(new Callable<Integer>() {

            @Override
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/OutParameter.java`
#### Snippet
```java
    private final int sqlType;
    private final Class<T> javaType;
    private T value = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private Ref nullRef = null;
    private short nullShort = 0;
    private String nullString = null;
    private Time nullTime = null;
    private Timestamp nullTimestamp = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private double nullDouble = 0.0;
    private float nullFloat = 0.0f;
    private int nullInt = 0;
    private long nullLong = 0;
    private Object nullObject = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private InputStream nullAsciiStream = null;
    private BigDecimal nullBigDecimal = null;
    private InputStream nullBinaryStream = null;
    private Blob nullBlob = null;
    private boolean nullBoolean = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private long nullLong = 0;
    private Object nullObject = null;
    private Ref nullRef = null;
    private short nullShort = 0;
    private String nullString = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private InputStream nullBinaryStream = null;
    private Blob nullBlob = null;
    private boolean nullBoolean = false;
    private byte nullByte = 0;
    private byte[] nullBytes = null;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private Clob nullClob = null;
    private Date nullDate = null;
    private double nullDouble = 0.0;
    private float nullFloat = 0.0f;
    private int nullInt = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private int nullInt = 0;
    private long nullLong = 0;
    private Object nullObject = null;
    private Ref nullRef = null;
    private short nullShort = 0;
```

### RedundantFieldInitialization
Field initialization to `0.0f` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private Date nullDate = null;
    private double nullDouble = 0.0;
    private float nullFloat = 0.0f;
    private int nullInt = 0;
    private long nullLong = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private byte[] nullBytes = null;
    private Reader nullCharacterStream = null;
    private Clob nullClob = null;
    private Date nullDate = null;
    private double nullDouble = 0.0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private boolean nullBoolean = false;
    private byte nullByte = 0;
    private byte[] nullBytes = null;
    private Reader nullCharacterStream = null;
    private Clob nullClob = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private short nullShort = 0;
    private String nullString = null;
    private Time nullTime = null;
    private Timestamp nullTimestamp = null;
    private URL nullURL = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java

    private InputStream nullAsciiStream = null;
    private BigDecimal nullBigDecimal = null;
    private InputStream nullBinaryStream = null;
    private Blob nullBlob = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private String nullString = null;
    private Time nullTime = null;
    private Timestamp nullTimestamp = null;
    private URL nullURL = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private float nullFloat = 0.0f;
    private int nullInt = 0;
    private long nullLong = 0;
    private Object nullObject = null;
    private Ref nullRef = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private Blob nullBlob = null;
    private boolean nullBoolean = false;
    private byte nullByte = 0;
    private byte[] nullBytes = null;
    private Reader nullCharacterStream = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private BigDecimal nullBigDecimal = null;
    private InputStream nullBinaryStream = null;
    private Blob nullBlob = null;
    private boolean nullBoolean = false;
    private byte nullByte = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private Time nullTime = null;
    private Timestamp nullTimestamp = null;
    private URL nullURL = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    }

    private InputStream nullAsciiStream = null;
    private BigDecimal nullBigDecimal = null;
    private InputStream nullBinaryStream = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private Object nullObject = null;
    private Ref nullRef = null;
    private short nullShort = 0;
    private String nullString = null;
    private Time nullTime = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private byte nullByte = 0;
    private byte[] nullBytes = null;
    private Reader nullCharacterStream = null;
    private Clob nullClob = null;
    private Date nullDate = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    private Reader nullCharacterStream = null;
    private Clob nullClob = null;
    private Date nullDate = null;
    private double nullDouble = 0.0;
    private float nullFloat = 0.0f;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
     * it yet)?
     */
    private volatile boolean pmdKnownBroken = false;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/dbutils/handlers/properties/DatePropertyHandler.java`
#### Snippet
```java

        if ("java.sql.Date".equals(targetType)) {
            value = new java.sql.Date(time);
        } else
        if ("java.sql.Time".equals(targetType)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/dbutils/handlers/properties/DatePropertyHandler.java`
#### Snippet
```java
        } else
        if ("java.sql.Time".equals(targetType)) {
            value = new java.sql.Time(time);
        } else
        if ("java.sql.Timestamp".equals(targetType)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/dbutils/handlers/properties/DatePropertyHandler.java`
#### Snippet
```java
        } else
        if ("java.sql.Timestamp".equals(targetType)) {
            value = new Timestamp(time);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
            for (final PropertyHandler handler : propertyHandlers) {
                if (handler.match(firstParam, value)) {
                    value = handler.apply(firstParam, value);
                    break;
                }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-29-02-03-04.426.html`
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
in `src/main/java/org/apache/commons/dbutils/handlers/MapHandler.java`
#### Snippet
```java
    @Override
    public Map<String, Object> handle(final ResultSet rs) throws SQLException {
        return rs.next() ? this.convert.toMap(rs) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbutils/handlers/BeanHandler.java`
#### Snippet
```java
    @Override
    public T handle(final ResultSet rs) throws SQLException {
        return rs.next() ? this.convert.toBean(rs, this.type) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    public Timestamp getNullTimestamp() {
        if (this.nullTimestamp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
     */
    public Time getNullTime() {
        return this.nullTime != null ? new Time(this.nullTime.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
     */
    public Date getNullDate() {
        return this.nullDate != null ? new Date(this.nullDate.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbutils/wrappers/SqlNullCheckedResultSet.java`
#### Snippet
```java
    public byte[] getNullBytes() {
        if (this.nullBytes == null) {
            return null;
        }
        return this.nullBytes.clone();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbutils/ResultSetIterator.java`
#### Snippet
```java
        } catch (final SQLException e) {
            rethrow(e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbutils/handlers/ScalarHandler.java`
#### Snippet
```java
            return (T) rs.getObject(this.columnName);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java

        if ( !propType.isPrimitive() && retval == null ) {
            return null;
        }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`0 == columnName.length()` can be replaced with 'columnName.isEmpty()'
in `src/main/java/org/apache/commons/dbutils/GenerousBeanProcessor.java`
#### Snippet
```java
            String columnName = rsmd.getColumnLabel(col);

            if (null == columnName || 0 == columnName.length()) {
                columnName = rsmd.getColumnName(col);
            }
```

### SizeReplaceableByIsEmpty
`0 == propKey.length()` can be replaced with 'propKey.isEmpty()'
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
        for (int i = 1; i <= cols; i++) {
            String propKey = rsmd.getColumnLabel(i);
            if (null == propKey || 0 == propKey.length()) {
              propKey = rsmd.getColumnName(i);
            }
```

### SizeReplaceableByIsEmpty
`0 == propKey.length()` can be replaced with 'propKey.isEmpty()'
in `src/main/java/org/apache/commons/dbutils/BasicRowProcessor.java`
#### Snippet
```java
              propKey = rsmd.getColumnName(i);
            }
            if (null == propKey || 0 == propKey.length()) {
              // The column index can't be null
              propKey = Integer.toString(i);
```

### SizeReplaceableByIsEmpty
`0 == columnName.length()` can be replaced with 'columnName.isEmpty()'
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
        for (int col = 1; col <= cols; col++) {
            String columnName = rsmd.getColumnLabel(col);
            if (null == columnName || 0 == columnName.length()) {
              columnName = rsmd.getColumnName(col);
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/dbutils/handlers/BeanMapHandler.java`
#### Snippet
```java
     *            column with this name.
     */
    private BeanMapHandler(final Class<V> type, final RowProcessor convert,
            final int columnIndex, final String columnName) {
        this.type = type;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @throws SQLException if a database access error occurs
     */
    public <T> Future<T> query(final String sql, final ResultSetHandler<T> rsh) throws SQLException {
        return executorService.submit(new Callable<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @since 1.6
     */
    public <T> Future<T> insert(final Connection conn, final String sql, final ResultSetHandler<T> rsh) throws SQLException {
        return executorService.submit(new Callable<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @since 1.6
     */
    public <T> Future<T> insert(final String sql, final ResultSetHandler<T> rsh, final Object... params) throws SQLException {
        return executorService.submit(new Callable<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @since 1.6
     */
    public <T> Future<T> insert(final String sql, final ResultSetHandler<T> rsh) throws SQLException {
        return executorService.submit(new Callable<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @throws SQLException if a database access error occurs
     */
    public <T> Future<T> query(final Connection conn, final String sql, final ResultSetHandler<T> rsh) throws SQLException {
        return executorService.submit(new Callable<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @throws SQLException if a database access error occurs
     */
    public <T> Future<T> query(final Connection conn, final String sql, final ResultSetHandler<T> rsh, final Object... params)
            throws SQLException {
        return executorService.submit(new Callable<T>() {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @since 1.6
     */
    public <T> Future<T> insertBatch(final Connection conn, final String sql, final ResultSetHandler<T> rsh, final Object[][] params) throws SQLException {
        return executorService.submit(new Callable<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @since 1.6
     */
    public <T> Future<T> insertBatch(final String sql, final ResultSetHandler<T> rsh, final Object[][] params) throws SQLException {
        return executorService.submit(new Callable<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @since 1.6
     */
    public <T> Future<T> insert(final Connection conn, final String sql, final ResultSetHandler<T> rsh, final Object... params) throws SQLException {
        return executorService.submit(new Callable<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
     * @throws SQLException if a database access error occurs
     */
    public <T> Future<T> query(final String sql, final ResultSetHandler<T> rsh, final Object... params) throws SQLException {
        return executorService.submit(new Callable<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
         */
        public QueryCallableStatement(final Connection conn, final boolean closeConn, final PreparedStatement ps,
                final ResultSetHandler<T> rsh, final String sql, final Object... params) {
            this.sql = sql;
            this.params = params;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java
     * @throws SQLException If there are database or parameter errors.
     */
    private <T> List<T> execute(final Connection conn, final boolean closeConn, final String sql, final ResultSetHandler<T> rsh, final Object... params) throws SQLException {
        if (conn == null) {
            throw new SQLException("Null connection");
```

## RuleId[id=UnusedAssignment]
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
Variable `pmd` initializer `null` is redundant
in `src/main/java/org/apache/commons/dbutils/QueryRunner.java`
#### Snippet
```java

        PreparedStatement stmt = null;
        ParameterMetaData pmd = null;
        int[] rows = null;
        try {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
            throws SQLException {

        @SuppressWarnings("resource")
        final
        PreparedStatement ps = conn.prepareStatement(sql);
        try {
            configureStatement(ps);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbutils/AbstractQueryRunner.java`
#### Snippet
```java
            throws SQLException {

        @SuppressWarnings("resource")
        final
        PreparedStatement ps = conn.prepareStatement(sql, returnedKeys);
        try {
            configureStatement(ps);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbutils/DbUtils.java`
#### Snippet
```java

            // make Constructor accessible if it is private
            @SuppressWarnings("deprecation")
            // TODO This is deprecated in Java9 and canAccess() should be used. Adding suppression for building on
            //      later JDKs without a warning.
            final boolean isConstructorAccessible = driverConstructor.isAccessible();
            if (!isConstructorAccessible) {
                driverConstructor.setAccessible(true);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/dbutils/handlers/properties/StringEnumPropertyHandler.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Object apply(final Class<?> parameter, final Object value) {
        return Enum.valueOf(parameter.asSubclass(Enum.class), (String) value);
    }
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `DbUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/dbutils/DbUtils.java`
#### Snippet
```java
 * A collection of JDBC helper methods.  This class is thread safe.
 */
public final class DbUtils {

    /**
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/handlers/columns/FloatColumnHandler.java`
#### Snippet
```java
    @Override
    public Object apply(final ResultSet rs, final int columnIndex) throws SQLException {
        return Float.valueOf(rs.getFloat(columnIndex));
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/handlers/columns/DoubleColumnHandler.java`
#### Snippet
```java
    @Override
    public Object apply(final ResultSet rs, final int columnIndex) throws SQLException {
        return Double.valueOf(rs.getDouble(columnIndex));
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/handlers/columns/ShortColumnHandler.java`
#### Snippet
```java
    @Override
    public Object apply(final ResultSet rs, final int columnIndex) throws SQLException {
        return Short.valueOf(rs.getShort(columnIndex));
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/handlers/columns/BooleanColumnHandler.java`
#### Snippet
```java
    @Override
    public Object apply(final ResultSet rs, final int columnIndex) throws SQLException {
        return Boolean.valueOf(rs.getBoolean(columnIndex));
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/handlers/columns/ByteColumnHandler.java`
#### Snippet
```java
    @Override
    public Object apply(final ResultSet rs, final int columnIndex) throws SQLException {
        return Byte.valueOf(rs.getByte(columnIndex));
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/handlers/columns/IntegerColumnHandler.java`
#### Snippet
```java
    @Override
    public Object apply(final ResultSet rs, final int columnIndex) throws SQLException {
        return Integer.valueOf(rs.getInt(columnIndex));
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/handlers/columns/LongColumnHandler.java`
#### Snippet
```java
    @Override
    public Object apply(final ResultSet rs, final int columnIndex) throws SQLException {
        return Long.valueOf(rs.getLong(columnIndex));
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java

    static {
        primitiveDefaults.put(Integer.TYPE, Integer.valueOf(0));
        primitiveDefaults.put(Short.TYPE, Short.valueOf((short) 0));
        primitiveDefaults.put(Byte.TYPE, Byte.valueOf((byte) 0));
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
    static {
        primitiveDefaults.put(Integer.TYPE, Integer.valueOf(0));
        primitiveDefaults.put(Short.TYPE, Short.valueOf((short) 0));
        primitiveDefaults.put(Byte.TYPE, Byte.valueOf((byte) 0));
        primitiveDefaults.put(Float.TYPE, Float.valueOf(0f));
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
        primitiveDefaults.put(Integer.TYPE, Integer.valueOf(0));
        primitiveDefaults.put(Short.TYPE, Short.valueOf((short) 0));
        primitiveDefaults.put(Byte.TYPE, Byte.valueOf((byte) 0));
        primitiveDefaults.put(Float.TYPE, Float.valueOf(0f));
        primitiveDefaults.put(Double.TYPE, Double.valueOf(0d));
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
        primitiveDefaults.put(Short.TYPE, Short.valueOf((short) 0));
        primitiveDefaults.put(Byte.TYPE, Byte.valueOf((byte) 0));
        primitiveDefaults.put(Float.TYPE, Float.valueOf(0f));
        primitiveDefaults.put(Double.TYPE, Double.valueOf(0d));
        primitiveDefaults.put(Long.TYPE, Long.valueOf(0L));
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
        primitiveDefaults.put(Byte.TYPE, Byte.valueOf((byte) 0));
        primitiveDefaults.put(Float.TYPE, Float.valueOf(0f));
        primitiveDefaults.put(Double.TYPE, Double.valueOf(0d));
        primitiveDefaults.put(Long.TYPE, Long.valueOf(0L));
        primitiveDefaults.put(Boolean.TYPE, Boolean.FALSE);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
        primitiveDefaults.put(Float.TYPE, Float.valueOf(0f));
        primitiveDefaults.put(Double.TYPE, Double.valueOf(0d));
        primitiveDefaults.put(Long.TYPE, Long.valueOf(0L));
        primitiveDefaults.put(Boolean.TYPE, Boolean.FALSE);
        primitiveDefaults.put(Character.TYPE, Character.valueOf((char) 0));
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/BeanProcessor.java`
#### Snippet
```java
        primitiveDefaults.put(Long.TYPE, Long.valueOf(0L));
        primitiveDefaults.put(Boolean.TYPE, Boolean.FALSE);
        primitiveDefaults.put(Character.TYPE, Character.valueOf((char) 0));

        // Use a ServiceLoader to find implementations
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
            @Override
            public Integer call() throws Exception {
                return Integer.valueOf(queryRunner.update(conn, sql, params));
            }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
            @Override
            public Integer call() throws Exception {
                return Integer.valueOf(queryRunner.update(sql));
            }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
            @Override
            public Integer call() throws Exception {
                return Integer.valueOf(queryRunner.update(conn, sql, param));
            }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
            @Override
            public Integer call() throws Exception {
                return Integer.valueOf(queryRunner.update(sql, params));
            }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
            @Override
            public Integer call() throws Exception {
                return Integer.valueOf(queryRunner.update(sql, param));
            }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
            @Override
            public Integer call() throws Exception {
                return Integer.valueOf(queryRunner.update(conn, sql));
            }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/dbutils/AsyncQueryRunner.java`
#### Snippet
```java
            }

            return Integer.valueOf(rows);
        }

```

