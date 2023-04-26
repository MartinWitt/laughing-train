# airavata-data-catalog 
 
# Bad smells
I found 44 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 20 | false |
| ReturnNull | 4 | false |
| DataFlowIssue | 3 | false |
| DefaultAnnotationParam | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| EnhancedSwitchMigration | 2 | false |
| BoundedWildcard | 2 | false |
| UnusedAssignment | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySemicolon | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| CommentedOutCode | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
                    .build();
            DataProduct result = client.createDataProduct(dataProduct);
            System.out.println(MessageFormat.format("Created data product with id [{0}]", result.getDataProductId()));

            DataProduct updatedDataProduct = result.toBuilder().setName("updated name").build();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            DataProduct updatedDataProduct = result.toBuilder().setName("updated name").build();
            result = client.updateDataProduct(updatedDataProduct);
            System.out.println(MessageFormat.format("Updated data product with id [{0}] to have name [{1}]",
                    result.getDataProductId(), result.getName()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java

            DataProduct retrievedDataProduct = client.getDataProduct(result.getDataProductId());
            System.out.println(MessageFormat.format("Retrieved data product with id [{0}] to have name [{1}]",
                    retrievedDataProduct.getDataProductId(), retrievedDataProduct.getName()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
                    .build();
            DataProduct result2 = client.createDataProduct(dataProduct2);
            System.out.println(
                    MessageFormat.format("Created second data product [{0}]", result2));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java

            client.deleteDataProduct(result2.getDataProductId());
            System.out.println(
                    MessageFormat.format("Deleted data product with id [{0}]", result2.getDataProductId()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
                metadataSchema = MetadataSchema.newBuilder().setSchemaName("my_schema").build();
                metadataSchema = client.createMetadataSchema(metadataSchema);
                System.out.println(
                        MessageFormat.format("Created metadata schema with name [{0}]",
                                metadataSchema.getSchemaName()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
                                metadataSchema.getSchemaName()));
            } else {
                System.out.println(
                        MessageFormat.format("Found metadata schema with name [{0}]",
                                metadataSchema.getSchemaName()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            if (field1Exists == null) {
                field1 = client.createMetadataSchemaField(field1);
                System.out.println(MessageFormat.format("Created metadata schema field [{0}] in schema [{1}]",
                        field1.getFieldName(), field1.getSchemaName()));
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            } else {
                field1 = field1Exists;
                System.out.println(MessageFormat.format("Found metadata schema field [{0}] in schema [{1}]",
                        field1.getFieldName(), field1.getSchemaName()));
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            if (field2Exists == null) {
                field2 = client.createMetadataSchemaField(field2);
                System.out.println(MessageFormat.format("Created metadata schema field [{0}] in schema [{1}]",
                        field2.getFieldName(), field2.getSchemaName()));
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            } else {
                field2 = field2Exists;
                System.out.println(MessageFormat.format("Found metadata schema field [{0}] in schema [{1}]",
                        field2.getFieldName(), field2.getSchemaName()));
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            if (field3Exists == null) {
                field3 = client.createMetadataSchemaField(field3);
                System.out.println(MessageFormat.format("Created metadata schema field [{0}] in schema [{1}]",
                        field3.getFieldName(), field3.getSchemaName()));
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            } else {
                field3 = field3Exists;
                System.out.println(MessageFormat.format("Found metadata schema field [{0}] in schema [{1}]",
                        field3.getFieldName(), field3.getSchemaName()));
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java

            List<MetadataSchemaField> fields = client.getMetadataSchemaFields(metadataSchema.getSchemaName());
            System.out.println(MessageFormat.format("Found {0} fields for schema {1}", fields.size(),
                    metadataSchema.getSchemaName()));
            for (MetadataSchemaField field : fields) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
                    metadataSchema.getSchemaName()));
            for (MetadataSchemaField field : fields) {
                System.out.println(MessageFormat.format("-> field {0}", field.getFieldName()));
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java

            result = client.addDataProductToMetadataSchema(result.getDataProductId(), metadataSchema.getSchemaName());
            System.out.println(MessageFormat.format("Added data product [{0}] to metadata schema [{1}]",
                    result.getDataProductId(), metadataSchema.getSchemaName()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            result = client.removeDataProductFromMetadataSchema(result.getDataProductId(),
                    metadataSchema.getSchemaName());
            System.out.println(MessageFormat.format("Removed data product [{0}] from metadata schema [{1}]",
                    result.getDataProductId(), metadataSchema.getSchemaName()));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
                    .build();
            DataProduct result3 = client.createDataProduct(dataProduct3);
            System.out.println(
                    MessageFormat.format("Created third data product [{0}], supporting schemas [{1}]",
                            result3.getDataProductId(), result3.getMetadataSchemasList()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
                    select * from my_schema where field3 = 'bar'
                     """);
            System.out.println(searchResults);

            searchResults = client.searchDataProducts("""
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            // select * from my_schema where not (field1 < 5 or field3 = 'bar')
            // """);
            System.out.println(searchResults);
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/DataProductEntity.java`
#### Snippet
```java
    private Long dataProductId;

    @ManyToOne(optional = true)
    @JoinColumn(name = "parent_data_product_id", referencedColumnName = "data_product_id", nullable = true)
    private DataProductEntity parentDataProductEntity;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/DataProductEntity.java`
#### Snippet
```java

    @ManyToOne(optional = true)
    @JoinColumn(name = "parent_data_product_id", referencedColumnName = "data_product_id", nullable = true)
    private DataProductEntity parentDataProductEntity;

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DataCatalogApiServiceApplication` has only 'static' members, and lacks a 'private' constructor
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java

@SpringBootApplication
public class DataCatalogApiServiceApplication {

    public static void main(String[] args) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `accept` may produce `NullPointerException`
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
        SqlSelect selectNode = (SqlSelect) validatedSqlNode;
        Map<String, String> tableAliases = new HashMap<>();
        selectNode.getFrom().accept(new SqlShuttle() {

            @Override
```

### DataFlowIssue
Method invocation `toSqlString` may produce `NullPointerException`
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
        sb.append(writeCommonTableExpressions(metadataSchemas));
        sb.append(" SELECT * FROM ");
        sb.append(((SqlSelect) sqlNode).getFrom().toSqlString(PostgresqlSqlDialect.DEFAULT));
        sb.append(" WHERE ");
        sb.append(rewriteWhereClauseFilters(sqlNode, metadataSchemas, tableAliases));
```

### DataFlowIssue
Method invocation `getOperator` may produce `NullPointerException`
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
                currentOperator = this.binaryLogicalOperatorNodes.peek();
                this.sql.append(" ) ");
                this.sql.append(currentOperator.getOperator().toString());
                this.sql.append(" ");
            }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;;

public class DataCatalogAPIClient {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.airavata.datacatalog.api.model` is unnecessary and can be removed
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/mapper/DataProductMapper.java`
#### Snippet
```java
/**
 * Map to/from
 * {@link org.apache.airavata.datacatalog.api.model.DataProductEntity}
 * <-> {@link org.apache.airavata.datacatalog.api.DataProduct}
 */
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
                    and external_id = 'fff'
                    """);
            // searchResults = client.searchDataProducts("""
            // select * from my_schema where not (field1 < 5 or field3 = 'bar')
            // """);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
        } catch (StatusRuntimeException e) {
            if (e.getStatus() == Status.NOT_FOUND) {
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
        } catch (StatusRuntimeException e) {
            if (e.getStatus() == Status.NOT_FOUND) {
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
            }
            // If none matched, must not be a metadata schema field
            return null;
        }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-26-12-50-22.682.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
    public String rewriteQuery(SqlNode sqlNode, Collection<MetadataSchemaEntity> metadataSchemas,
            Map<String, String> tableAliases) {
        StringBuilder sb = new StringBuilder();

        sb.append(writeCommonTableExpressions(metadataSchemas));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
    String writeCommonTableExpression(MetadataSchemaEntity metadataSchemaEntity) {

        StringBuilder sb = new StringBuilder();
        sb.append(metadataSchemaEntity.getSchemaName());
        sb.append(" AS (");
```

## RuleId[id=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
    private SqlTypeName getSqlTypeName(FieldValueType fieldValueType) {

        switch (fieldValueType) {
            case BOOLEAN:
                return SqlTypeName.BOOLEAN;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
                        sql.append(metadataSchemaField.getJsonPath());
                        sql.append(" ");
                        switch (call.getOperator().kind) {
                            case EQUALS:
                                sql.append(" == ");
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `validator` is redundant
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
                planner.getTypeFactory(), connectionConfig);

        SqlValidator validator = SqlValidatorUtil.newValidator(SqlStdOperatorTable.instance(),
                catalogReader, planner.getTypeFactory(),
                config.getSqlValidatorConfig().withIdentifierExpansion(false));
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends MetadataSchemaEntity`
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
        Deque<SqlCall> binaryLogicalOperatorNodes = new ArrayDeque<>();

        MetadataSchemaFieldFilterRewriter(Collection<MetadataSchemaEntity> metadataSchemas,
                Map<String, String> tableAliases) {
            this.metadataSchemas = metadataSchemas;
```

### BoundedWildcard
Can generalize to `? extends MetadataSchemaEntity`
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
    }

    String writeCommonTableExpressions(Collection<MetadataSchemaEntity> metadataSchemas) {
        StringBuilder sb = new StringBuilder();
        List<String> commonTableExpressions = new ArrayList<>();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `metadataSchema` initializer `null` is redundant
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
        MetadataSchemaFieldEntity resolveMetadataSchemaField(SqlIdentifier sqlIdentifier) {

            MetadataSchemaEntity metadataSchema = null;
            String fieldName = null;
            if (sqlIdentifier.names.size() == 2) {
```

### UnusedAssignment
Variable `fieldName` initializer `null` is redundant
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java

            MetadataSchemaEntity metadataSchema = null;
            String fieldName = null;
            if (sqlIdentifier.names.size() == 2) {
                String tableName = sqlIdentifier.names.get(0);
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
        sb.append("inner join data_product_metadata_schema dpms_ on dpms_.data_product_id = dp_.data_product_id ");
        sb.append("inner join metadata_schema ms_ on ms_.metadata_schema_id = dpms_.metadata_schema_id ");
        sb.append("where ms_.metadata_schema_id = " + metadataSchemaEntity.getMetadataSchemaId());
        sb.append(")");
        return sb.toString();
```

