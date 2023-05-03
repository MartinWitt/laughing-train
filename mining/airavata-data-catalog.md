# airavata-data-catalog 
 
# Bad smells
I found 73 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 30 | false |
| SpringJavaAutowiredFieldsWarningInspection | 15 | false |
| TrivialIf | 8 | false |
| DataFlowIssue | 3 | false |
| DefaultAnnotationParam | 2 | false |
| JavadocReference | 2 | false |
| RedundantCast | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| UnusedAssignment | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| UnnecessarySemicolon | 1 | false |
| CommentedOutCode | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| DuplicatedCode | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| StringConcatenationInsideStringBufferAppend | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
        logger.debug("Metadata schema query final sql: {}", finalSql);

        List<DataProductEntity> dataProductEntities = entityManager.createNativeQuery(finalSql, DataProductEntity.class)
                .getResultList();

        List<DataProduct> dataProducts = new ArrayList<>();
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.airavata.datacatalog.api.DataProduct`
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/mapper/DataProductMapper.java`
#### Snippet
```java
 * Map to/from
 * {@link org.apache.airavata.datacatalog.api.model.DataProductEntity}
 * <-> {@link org.apache.airavata.datacatalog.api.DataProduct}
 */
@Component
```

### JavadocReference
Cannot resolve symbol `Permission`
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * for each data product. The view should contain the following columns:
     * data_product_id, user_id, and permission_id where the permission_id
     * should be a number as defined in the {@link Permission} enum.
     *
     * @return
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

## RuleId[id=DataFlowIssue]
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `typeFactory.builder()` to `Builder` is redundant
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
            @Override
            public RelDataType getRowType(RelDataTypeFactory typeFactory) {
                Builder builder = (Builder) typeFactory.builder();
                return builder
                        .add("data_product_id", SqlTypeName.INTEGER)
```

### RedundantCast
Casting `typeFactory.builder()` to `Builder` is redundant
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
                @Override
                public RelDataType getRowType(RelDataTypeFactory typeFactory) {
                    Builder builder = (Builder) typeFactory.builder();

                    // Add all of the common fields
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param sqlNode` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/MetadataSchemaQueryWriter.java`
#### Snippet
```java
     * Rewrite the query as needed to filter against metadata schema fields.
     * 
     * @param sqlNode
     * @param metadataSchemas
     * @param tableAliases
```

### JavadocDeclaration
`@param metadataSchemas` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/MetadataSchemaQueryWriter.java`
#### Snippet
```java
     * 
     * @param sqlNode
     * @param metadataSchemas
     * @param tableAliases
     * @return
```

### JavadocDeclaration
`@param tableAliases` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/MetadataSchemaQueryWriter.java`
#### Snippet
```java
     * @param sqlNode
     * @param metadataSchemas
     * @param tableAliases
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/MetadataSchemaQueryWriter.java`
#### Snippet
```java
     * @param metadataSchemas
     * @param tableAliases
     * @return
     */
    String rewriteQuery(SqlNode sqlNode, Collection<MetadataSchemaEntity> metadataSchemas,
```

### JavadocDeclaration
`@return` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * should be a number as defined in the {@link Permission} enum.
     *
     * @return
     */
    String getDataProductSharingView();
```

### JavadocDeclaration
`@param userInfo` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * Grant permission to the user for the given data product.
     *
     * @param userInfo
     * @param dataProduct
     * @param permission
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param userInfo
     * @param dataProduct
     * @param permission
     */
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param userInfo
     * @param dataProduct
     * @param permission
     */
    void grantPermissionToUser(UserInfo userInfo, DataProduct dataProduct, Permission permission);
```

### JavadocDeclaration
`@param userInfo` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * Revoke permission from the user for the given data product.
     *
     * @param userInfo
     * @param dataProduct
     * @param permission
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param userInfo
     * @param dataProduct
     * @param permission
     */
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param userInfo
     * @param dataProduct
     * @param permission
     */
    void revokePermissionFromUser(UserInfo userInfo, DataProduct dataProduct, Permission permission);
```

### JavadocDeclaration
`@param userInfo` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * permission.
     *
     * @param userInfo
     * @param dataProduct
     * @param permission
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param userInfo
     * @param dataProduct
     * @param permission
     * @return
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param userInfo
     * @param dataProduct
     * @param permission
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param dataProduct
     * @param permission
     * @return
     */
    boolean userHasAccess(UserInfo userInfo, DataProduct dataProduct, Permission permission);
```

### JavadocDeclaration
`@param userInfo` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * Get or create a {@link UserEntity}.
     *
     * @param userInfo
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param userInfo
     * @return
     */
    UserEntity resolveUser(UserInfo userInfo);
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * provided in the API request.
     *
     * @param dataProduct
     * @param permission
     * @return
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param dataProduct
     * @param permission
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param dataProduct
     * @param permission
     * @return
     */
    boolean hasPublicAccess(DataProduct dataProduct, Permission permission);
```

### JavadocDeclaration
`@param groupInfo` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * Grant permission to the group for the given data product.
     *
     * @param groupInfo
     * @param dataProduct
     * @param permission
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param groupInfo
     * @param dataProduct
     * @param permission
     */
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param groupInfo
     * @param dataProduct
     * @param permission
     */
    void grantPermissionToGroup(GroupInfo groupInfo, DataProduct dataProduct, Permission permission);
```

### JavadocDeclaration
`@param groupInfo` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * Revoke permission from the group for the given data product.
     *
     * @param groupInfo
     * @param dataProduct
     * @param permission
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param groupInfo
     * @param dataProduct
     * @param permission
     */
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param groupInfo
     * @param dataProduct
     * @param permission
     */
    void revokePermissionFromGroup(GroupInfo groupInfo, DataProduct dataProduct, Permission permission);
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * Revoke public access from the given data product.
     *
     * @param dataProduct
     * @param permission
     */
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param dataProduct
     * @param permission
     */
    void revokePublicAccess(DataProduct dataProduct, Permission permission);
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * Grant public access to the given data product.
     *
     * @param dataProduct
     * @param permission
     */
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param dataProduct
     * @param permission
     */
    void grantPublicAccess(DataProduct dataProduct, Permission permission);
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
                        sql.append(metadataSchemaField.getJsonPath());
                        sql.append(" ");
                        switch (call.getOperator().kind) {
                            case EQUALS:
                                sql.append(" == ");
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
            MetadataSchemaField field1Exists = client.getMetadataSchemaField(field1.getSchemaName(),
                    field1.getFieldName());
            if (field1Exists == null) {
                field1 = client.createMetadataSchemaField(field1);
                System.out.println(MessageFormat.format("Created metadata schema field [{0}] in schema [{1}]",
                        field1.getFieldName(), field1.getSchemaName()));
            } else {
                field1 = field1Exists;
                System.out.println(MessageFormat.format("Found metadata schema field [{0}] in schema [{1}]",
                        field1.getFieldName(), field1.getSchemaName()));
            }
```

## RuleId[id=SpringJavaAutowiredFieldsWarningInspection]
### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/mapper/MetadataSchemaFieldMapper.java`
#### Snippet
```java
public class MetadataSchemaFieldMapper {

    @Autowired
    MetadataSchemaRepository metadataSchemaRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/mapper/DataProductMapper.java`
#### Snippet
```java
public class DataProductMapper {

    @Autowired
    DataProductRepository dataProductRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/mapper/DataProductMapper.java`
#### Snippet
```java
    DataProductRepository dataProductRepository;

    @Autowired
    MetadataSchemaRepository metadataSchemaRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/service/DataCatalogAPIService.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(DataCatalogAPIService.class);

    @Autowired
    DataCatalogService dataCatalogService;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java

    // Mappers
    @Autowired
    DataProductMapper dataProductMapper;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    MetadataSchemaMapper metadataSchemaMapper;

    @Autowired
    MetadataSchemaFieldMapper metadataSchemaFieldMapper;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    DataProductRepository dataProductRepository;

    @Autowired
    MetadataSchemaRepository metadataSchemaRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java

    // Repositories
    @Autowired
    DataProductRepository dataProductRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    MetadataSchemaFieldMapper metadataSchemaFieldMapper;

    @Autowired
    MetadataSchemaQueryExecutor metadataSchemaQueryExecutor;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    MetadataSchemaRepository metadataSchemaRepository;

    @Autowired
    MetadataSchemaFieldRepository metadataSchemaFieldRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    DataProductMapper dataProductMapper;

    @Autowired
    MetadataSchemaMapper metadataSchemaMapper;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
    EntityManager entityManager;

    @Autowired
    DataProductMapper dataProductMapper;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
    MetadataSchemaRepository metadataSchemaRepository;

    @Autowired
    MetadataSchemaQueryWriter metadataSchemaQueryWriter;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
    MetadataSchemaQueryWriter metadataSchemaQueryWriter;

    @Autowired
    EntityManager entityManager;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(MetadataSchemaQueryExecutorImpl.class);

    @Autowired
    MetadataSchemaRepository metadataSchemaRepository;

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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/MetadataSchemaFieldEntity.java`
#### Snippet
```java
        MetadataSchemaFieldEntity other = (MetadataSchemaFieldEntity) obj;
        if (metadataSchemaFieldId == null) {
            if (other.metadataSchemaFieldId != null)
                return false;
        } else if (!metadataSchemaFieldId.equals(other.metadataSchemaFieldId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/MetadataSchemaFieldEntity.java`
#### Snippet
```java
            if (other.metadataSchemaFieldId != null)
                return false;
        } else if (!metadataSchemaFieldId.equals(other.metadataSchemaFieldId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/DataProductEntity.java`
#### Snippet
```java
        DataProductEntity other = (DataProductEntity) obj;
        if (dataProductId == null) {
            if (other.dataProductId != null)
                return false;
        } else if (!dataProductId.equals(other.dataProductId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/DataProductEntity.java`
#### Snippet
```java
            if (other.dataProductId != null)
                return false;
        } else if (!dataProductId.equals(other.dataProductId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/MetadataSchemaEntity.java`
#### Snippet
```java
        MetadataSchemaEntity other = (MetadataSchemaEntity) obj;
        if (metadataSchemaId == null) {
            if (other.metadataSchemaId != null)
                return false;
        } else if (!metadataSchemaId.equals(other.metadataSchemaId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/MetadataSchemaEntity.java`
#### Snippet
```java
            if (other.metadataSchemaId != null)
                return false;
        } else if (!metadataSchemaId.equals(other.metadataSchemaId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/UserEntity.java`
#### Snippet
```java
        UserEntity other = (UserEntity) obj;
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/model/UserEntity.java`
#### Snippet
```java
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        return true;
```

