# airavata-data-catalog 
 
# Bad smells
I found 116 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 33 | false |
| TrivialIf | 22 | false |
| SpringJavaAutowiredFieldsWarningInspection | 19 | false |
| SpringJavaInjectionPointsAutowiringInspection | 9 | false |
| SpringComponentScan | 8 | false |
| JavadocReference | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| DataFlowIssue | 3 | false |
| RedundantCast | 3 | false |
| DefaultAnnotationParam | 2 | false |
| UnusedAssignment | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| UnnecessarySemicolon | 1 | false |
| CommentedOutCode | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| DuplicatedCode | 1 | false |
| SpringBootApplicationSetup | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/DataProductEntity.java`
#### Snippet
```java
    private Long dataProductId;

    @ManyToOne(optional = true)
    @JoinColumn(name = "parent_data_product_id", referencedColumnName = "data_product_id", nullable = true)
    private DataProductEntity parentDataProductEntity;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/DataProductEntity.java`
#### Snippet
```java

    @ManyToOne(optional = true)
    @JoinColumn(name = "parent_data_product_id", referencedColumnName = "data_product_id", nullable = true)
    private DataProductEntity parentDataProductEntity;

```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
        logger.debug("Metadata schema query final sql: {}", finalSql);

        List<DataProductEntity> dataProductEntities = entityManager.createNativeQuery(finalSql, DataProductEntity.class)
                .getResultList();

        List<DataProduct> dataProducts = new ArrayList<>();
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.airavata.datacatalog.api.UserInfo`
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/mapper/UserInfoMapper.java`
#### Snippet
```java
/**
 * Map from {@link org.apache.airavata.datacatalog.api.model.UserEntity} to
 * {@link org.apache.airavata.datacatalog.api.UserInfo}. For the reverse, see
 * {@link org.apache.airavata.datacatalog.api.sharing.SharingManager#resolveUser(UserInfo)}
 */
```

### JavadocReference
Cannot resolve symbol `UserInfo`
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/mapper/UserInfoMapper.java`
#### Snippet
```java
 * Map from {@link org.apache.airavata.datacatalog.api.model.UserEntity} to
 * {@link org.apache.airavata.datacatalog.api.UserInfo}. For the reverse, see
 * {@link org.apache.airavata.datacatalog.api.sharing.SharingManager#resolveUser(UserInfo)}
 */
@Component
```

### JavadocReference
Cannot resolve symbol `Permission`
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * for each data product. The view should contain the following columns:
     * data_product_id, user_id, and permission_id where the permission_id
     * should be a number as defined in the {@link Permission} enum.
     *
     * @return
```

### JavadocReference
Cannot resolve symbol `org.apache.airavata.datacatalog.api.DataProduct`
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/mapper/DataProductMapper.java`
#### Snippet
```java
 * Map to/from
 * {@link org.apache.airavata.datacatalog.api.model.DataProductEntity}
 * <-> {@link org.apache.airavata.datacatalog.api.DataProduct}
 */
@Component
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
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
        if (sqlNode instanceof SqlSelect) {
            sb.append(" SELECT * FROM ");
            sb.append(((SqlSelect) sqlNode).getFrom().toSqlString(PostgresqlSqlDialect.DEFAULT));
            if (((SqlSelect) sqlNode).getWhere() != null) {
                sb.append(" WHERE ");
```

### DataFlowIssue
Method invocation `getOperator` may produce `NullPointerException`
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
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
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java

            private void visitSelect(SqlSelect selectNode) {
                selectNode.getFrom().accept(new SqlShuttle() {
                    @Override
                    public SqlNode visit(SqlCall call) {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `Class.forName(...)` to `Class` is redundant
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
            @Value("${sharing.manager.class.name:org.apache.airavata.datacatalog.api.sharing.SimpleSharingManagerImpl}") String sharingManagerClassName) {
        try {
            Class<?> sharingManagerClass = (Class<?>) Class.forName(sharingManagerClassName);
            Constructor<?> constructor = sharingManagerClass.getConstructor();
            try {
```

### RedundantCast
Casting `typeFactory.builder()` to `Builder` is redundant
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
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
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
                @Override
                public RelDataType getRowType(RelDataTypeFactory typeFactory) {
                    Builder builder = (Builder) typeFactory.builder();

                    // Add all of the common fields
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param userEntity` tag description is missing
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/MetadataSchemaQueryWriter.java`
#### Snippet
```java
     * Rewrite the query as needed to filter against metadata schema fields.
     * 
     * @param userEntity
     *
     * @param sqlNode
```

### JavadocDeclaration
`@param sqlNode` tag description is missing
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/MetadataSchemaQueryWriter.java`
#### Snippet
```java
     * @param userEntity
     *
     * @param sqlNode
     * @param metadataSchemas
     * @param tableAliases
```

### JavadocDeclaration
`@param metadataSchemas` tag description is missing
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/MetadataSchemaQueryWriter.java`
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
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/MetadataSchemaQueryWriter.java`
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
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/MetadataSchemaQueryWriter.java`
#### Snippet
```java
     * @param metadataSchemas
     * @param tableAliases
     * @return
     */
    String rewriteQuery(UserEntity userEntity, SqlNode sqlNode, Collection<MetadataSchemaEntity> metadataSchemas,
```

### JavadocDeclaration
`@param tenantId` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * initialization).
     *
     * @param tenantId
     * @throws SharingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param tenantId
     * @throws SharingException
     */
    void initialize(String tenantId) throws SharingException;
```

### JavadocDeclaration
`@param userInfo` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param dataProduct
     * @param permission
     * @return
     */
    boolean userHasAccess(UserInfo userInfo, DataProduct dataProduct, Permission permission) throws SharingException;
```

### JavadocDeclaration
`@return` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * should be a number as defined in the {@link Permission} enum.
     *
     * @return
     */
    String getDataProductSharingView();
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param dataProduct
     * @param permission
     */
    void revokePublicAccess(DataProduct dataProduct, Permission permission) throws SharingException;
```

### JavadocDeclaration
`@param userInfo` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param userInfo
     * @param dataProduct
     * @param permission
     */
    void revokePermissionFromUser(UserInfo userInfo, DataProduct dataProduct, Permission permission)
```

### JavadocDeclaration
`@param userInfo` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param userInfo
     * @return
     */
    UserEntity resolveUser(UserInfo userInfo) throws SharingException;
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param dataProduct
     * @param permission
     */
    void grantPublicAccess(DataProduct dataProduct, Permission permission) throws SharingException;
```

### JavadocDeclaration
`@param userInfo` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param userInfo
     * @param dataProduct
     * @param permission
     * @param sharedByUser optional (nullable), the user who is granting the
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param userInfo
     * @param dataProduct
     * @param permission
     * @param sharedByUser optional (nullable), the user who is granting the
     *                     permission
```

### JavadocDeclaration
`@param dataProduct` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param dataProduct
     * @param permission
     * @return
     */
    boolean hasPublicAccess(DataProduct dataProduct, Permission permission) throws SharingException;
```

### JavadocDeclaration
`@param groupInfo` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param groupInfo
     * @param dataProduct
     * @param permission
     */
    void revokePermissionFromGroup(GroupInfo groupInfo, DataProduct dataProduct, Permission permission)
```

### JavadocDeclaration
`@param groupInfo` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     *
     * @param groupInfo
     * @param dataProduct
     * @param permission
     * @param sharedByUser optional (nullable), the user who is granting the
```

### JavadocDeclaration
`@param permission` tag description is missing
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/sharing/SharingManager.java`
#### Snippet
```java
     * @param groupInfo
     * @param dataProduct
     * @param permission
     * @param sharedByUser optional (nullable), the user who is granting the
     *                     permission
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

## RuleId[id=SpringComponentScan]
### SpringComponentScan
Cannot resolve package custos
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "org.apache.airavata.datacatalog.api", "org.apache.custos.sharing.core" })
@SpringBootApplication
@EnableJpaRepositories({ "org.apache.custos.sharing.core.persistance.repository",
```

### SpringComponentScan
Cannot resolve package sharing
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "org.apache.airavata.datacatalog.api", "org.apache.custos.sharing.core" })
@SpringBootApplication
@EnableJpaRepositories({ "org.apache.custos.sharing.core.persistance.repository",
```

### SpringComponentScan
Cannot resolve package core
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "org.apache.airavata.datacatalog.api", "org.apache.custos.sharing.core" })
@SpringBootApplication
@EnableJpaRepositories({ "org.apache.custos.sharing.core.persistance.repository",
```

### SpringComponentScan
Cannot resolve package custos
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
@ComponentScan(basePackages = { "org.apache.airavata.datacatalog.api", "org.apache.custos.sharing.core" })
@SpringBootApplication
@EnableJpaRepositories({ "org.apache.custos.sharing.core.persistance.repository",
        "org.apache.airavata.datacatalog.api.repository" })
@EnableJpaAuditing
```

### SpringComponentScan
Cannot resolve package sharing
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
@ComponentScan(basePackages = { "org.apache.airavata.datacatalog.api", "org.apache.custos.sharing.core" })
@SpringBootApplication
@EnableJpaRepositories({ "org.apache.custos.sharing.core.persistance.repository",
        "org.apache.airavata.datacatalog.api.repository" })
@EnableJpaAuditing
```

### SpringComponentScan
Cannot resolve package core
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
@ComponentScan(basePackages = { "org.apache.airavata.datacatalog.api", "org.apache.custos.sharing.core" })
@SpringBootApplication
@EnableJpaRepositories({ "org.apache.custos.sharing.core.persistance.repository",
        "org.apache.airavata.datacatalog.api.repository" })
@EnableJpaAuditing
```

### SpringComponentScan
Cannot resolve package persistance
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
@ComponentScan(basePackages = { "org.apache.airavata.datacatalog.api", "org.apache.custos.sharing.core" })
@SpringBootApplication
@EnableJpaRepositories({ "org.apache.custos.sharing.core.persistance.repository",
        "org.apache.airavata.datacatalog.api.repository" })
@EnableJpaAuditing
```

### SpringComponentScan
Cannot resolve package repository
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
@ComponentScan(basePackages = { "org.apache.airavata.datacatalog.api", "org.apache.custos.sharing.core" })
@SpringBootApplication
@EnableJpaRepositories({ "org.apache.custos.sharing.core.persistance.repository",
        "org.apache.airavata.datacatalog.api.repository" })
@EnableJpaAuditing
```

## RuleId[id=SpringJavaInjectionPointsAutowiringInspection]
### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
    private SimpleUserSharingRepository simpleUserSharingRepository;

    @Autowired
    private SimpleGroupSharingRepository simpleGroupSharingRepository;

```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
    private SimplePublicSharingRepository simplePublicSharingRepository;

    @Autowired
    private SimpleTenantRepository simpleTenantRepository;

```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
    private DataProductRepository dataProductRepository;

    @Autowired
    private SimpleUserSharingRepository simpleUserSharingRepository;

```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
    private UserRepository userRepository;

    @Autowired
    private DataProductRepository dataProductRepository;

```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
public class SimpleSharingManagerImpl implements SharingManager {

    @Autowired
    private TenantRepository tenantRepository;

```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
    private TenantRepository tenantRepository;

    @Autowired
    private UserRepository userRepository;

```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
    private SimpleGroupSharingRepository simpleGroupSharingRepository;

    @Autowired
    private SimplePublicSharingRepository simplePublicSharingRepository;

```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
    private SimpleUserRepository simpleUserRepository;

    @Autowired
    private SimpleGroupRepository simpleGroupRepository;

```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
    private SimpleTenantRepository simpleTenantRepository;

    @Autowired
    private SimpleUserRepository simpleUserRepository;

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
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
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/mapper/MetadataSchemaFieldMapper.java`
#### Snippet
```java
public class MetadataSchemaFieldMapper {

    @Autowired
    MetadataSchemaRepository metadataSchemaRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    MetadataSchemaFieldMapper metadataSchemaFieldMapper;

    @Autowired
    MetadataSchemaQueryExecutor metadataSchemaQueryExecutor;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    MetadataSchemaRepository metadataSchemaRepository;

    @Autowired
    MetadataSchemaFieldRepository metadataSchemaFieldRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    MetadataSchemaQueryExecutor metadataSchemaQueryExecutor;

    @Autowired
    SharingManager sharingManager;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java

    // Repositories
    @Autowired
    DataProductRepository dataProductRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    MetadataSchemaMapper metadataSchemaMapper;

    @Autowired
    MetadataSchemaFieldMapper metadataSchemaFieldMapper;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    DataProductMapper dataProductMapper;

    @Autowired
    MetadataSchemaMapper metadataSchemaMapper;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java

    // Mappers
    @Autowired
    DataProductMapper dataProductMapper;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/impl/DataCatalogServiceImpl.java`
#### Snippet
```java
    DataProductRepository dataProductRepository;

    @Autowired
    MetadataSchemaRepository metadataSchemaRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/mapper/DataProductMapper.java`
#### Snippet
```java
public class DataProductMapper {

    @Autowired
    DataProductRepository dataProductRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/mapper/DataProductMapper.java`
#### Snippet
```java
    MetadataSchemaRepository metadataSchemaRepository;

    @Autowired
    UserInfoMapper userInfoMapper;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/mapper/DataProductMapper.java`
#### Snippet
```java
    DataProductRepository dataProductRepository;

    @Autowired
    MetadataSchemaRepository metadataSchemaRepository;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
public class PostgresqlMetadataSchemaQueryWriterImpl implements MetadataSchemaQueryWriter {

    @Autowired
    SharingManager sharingManager;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/DataCatalogAPIService.java`
#### Snippet
```java
    DataCatalogService dataCatalogService;

    @Autowired
    SharingManager sharingManager;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/service/DataCatalogAPIService.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(DataCatalogAPIService.class);

    @Autowired
    DataCatalogService dataCatalogService;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
    EntityManager entityManager;

    @Autowired
    DataProductMapper dataProductMapper;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
    MetadataSchemaQueryWriter metadataSchemaQueryWriter;

    @Autowired
    EntityManager entityManager;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
    MetadataSchemaRepository metadataSchemaRepository;

    @Autowired
    MetadataSchemaQueryWriter metadataSchemaQueryWriter;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(MetadataSchemaQueryExecutorImpl.class);

    @Autowired
    MetadataSchemaRepository metadataSchemaRepository;

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `validator` is redundant
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/MetadataSchemaQueryExecutorImpl.java`
#### Snippet
```java
                planner.getTypeFactory(), connectionConfig);

        SqlValidator validator = SqlValidatorUtil.newValidator(SqlStdOperatorTable.instance(),
                catalogReader, planner.getTypeFactory(),
                config.getSqlValidatorConfig().withIdentifierExpansion(false));
```

### UnnecessaryLocalVariable
Local variable `dataProductEntity` is redundant
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
        Optional<DataProductEntity> maybeDataProduct = dataProductRepository
                .findByExternalId(dataProduct.getDataProductId());
        DataProductEntity dataProductEntity = maybeDataProduct.orElseThrow(() -> {
            return new SharingException("No data product exists with id " + dataProduct.getDataProductId());
        });
```

### UnnecessaryLocalVariable
Local variable `simpleUser` is redundant
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
                .findByExternalIdAndSimpleTenant(userInfo.getUserId(), tenant);

        SimpleUserEntity simpleUser = maybeSimpleUser.orElseGet(() -> {
            UserEntity newUser = new UserEntity();
            newUser.setExternalId(userInfo.getUserId());
```

### UnnecessaryLocalVariable
Local variable `simpleGroup` is redundant
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/sharing/SimpleSharingManagerImpl.java`
#### Snippet
```java
        Optional<SimpleGroupEntity> maybeSimpleGroup = simpleGroupRepository
                .findByExternalIdAndSimpleTenant(groupInfo.getGroupId(), tenant);
        SimpleGroupEntity simpleGroup = maybeSimpleGroup.orElseGet(() -> {
            SimpleGroupEntity newGroup = new SimpleGroupEntity();
            newGroup.setExternalId(groupInfo.getGroupId());
```

## RuleId[id=SpringBootApplicationSetup]
### SpringBootApplicationSetup
Redundant declaration: @SpringBootApplication already applies given @ComponentScan
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "org.apache.airavata.datacatalog.api", "org.apache.custos.sharing.core" })
@SpringBootApplication
@EnableJpaRepositories({ "org.apache.custos.sharing.core.persistance.repository",
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `metadataSchema` initializer `null` is redundant
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
        MetadataSchemaFieldEntity resolveMetadataSchemaField(SqlIdentifier sqlIdentifier) {

            MetadataSchemaEntity metadataSchema = null;
            String fieldName = null;
            if (sqlIdentifier.names.size() == 2) {
```

### UnusedAssignment
Variable `fieldName` initializer `null` is redundant
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
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
in `data-catalog-api/server/service/src/main/java/org/apache/airavata/datacatalog/api/query/impl/PostgresqlMetadataSchemaQueryWriterImpl.java`
#### Snippet
```java
        sb.append(Permission.READ_METADATA.getNumber());
        sb.append(") ");
        sb.append("where ms_.metadata_schema_id = " + metadataSchemaEntity.getMetadataSchemaId());
        sb.append(")");
        return sb.toString();
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/MetadataSchemaFieldEntity.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/MetadataSchemaEntity.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/MetadataSchemaFieldEntity.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/MetadataSchemaEntity.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/DataProductEntity.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/DataProductEntity.java`
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
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimplePublicSharingEntity.java`
#### Snippet
```java
        SimplePublicSharingEntity other = (SimplePublicSharingEntity) obj;
        if (sharingId == null) {
            if (other.sharingId != null)
                return false;
        } else if (!sharingId.equals(other.sharingId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimplePublicSharingEntity.java`
#### Snippet
```java
            if (other.sharingId != null)
                return false;
        } else if (!sharingId.equals(other.sharingId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleTenantEntity.java`
#### Snippet
```java
        SimpleTenantEntity other = (SimpleTenantEntity) obj;
        if (simpleTenantId == null) {
            if (other.simpleTenantId != null)
                return false;
        } else if (!simpleTenantId.equals(other.simpleTenantId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleTenantEntity.java`
#### Snippet
```java
            if (other.simpleTenantId != null)
                return false;
        } else if (!simpleTenantId.equals(other.simpleTenantId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleGroupSharingEntity.java`
#### Snippet
```java
        SimpleGroupSharingEntity other = (SimpleGroupSharingEntity) obj;
        if (sharingId == null) {
            if (other.sharingId != null)
                return false;
        } else if (!sharingId.equals(other.sharingId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleGroupSharingEntity.java`
#### Snippet
```java
            if (other.sharingId != null)
                return false;
        } else if (!sharingId.equals(other.sharingId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleUserEntity.java`
#### Snippet
```java
        SimpleUserEntity other = (SimpleUserEntity) obj;
        if (simpleUserId == null) {
            if (other.simpleUserId != null)
                return false;
        } else if (!simpleUserId.equals(other.simpleUserId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleUserEntity.java`
#### Snippet
```java
            if (other.simpleUserId != null)
                return false;
        } else if (!simpleUserId.equals(other.simpleUserId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleGroupEntity.java`
#### Snippet
```java
        SimpleGroupEntity other = (SimpleGroupEntity) obj;
        if (simpleGroupId == null) {
            if (other.simpleGroupId != null)
                return false;
        } else if (!simpleGroupId.equals(other.simpleGroupId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleGroupEntity.java`
#### Snippet
```java
            if (other.simpleGroupId != null)
                return false;
        } else if (!simpleGroupId.equals(other.simpleGroupId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleUserSharingEntity.java`
#### Snippet
```java
        SimpleUserSharingEntity other = (SimpleUserSharingEntity) obj;
        if (sharingId == null) {
            if (other.sharingId != null)
                return false;
        } else if (!sharingId.equals(other.sharingId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/simple-sharing/src/main/java/org/apache/airavata/datacatalog/api/model/sharing/simple/SimpleUserSharingEntity.java`
#### Snippet
```java
            if (other.sharingId != null)
                return false;
        } else if (!sharingId.equals(other.sharingId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/TenantEntity.java`
#### Snippet
```java
        TenantEntity other = (TenantEntity) obj;
        if (tenantId == null) {
            if (other.tenantId != null)
                return false;
        } else if (!tenantId.equals(other.tenantId))
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/TenantEntity.java`
#### Snippet
```java
            if (other.tenantId != null)
                return false;
        } else if (!tenantId.equals(other.tenantId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/UserEntity.java`
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
in `data-catalog-api/server/core/src/main/java/org/apache/airavata/datacatalog/api/model/UserEntity.java`
#### Snippet
```java
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        return true;
```

