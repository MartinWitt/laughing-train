# airavata-data-catalog 
 
# Bad smells
I found 23 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 16 | false |
| DefaultAnnotationParam | 2 | false |
| ReturnNull | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySemicolon | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
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

