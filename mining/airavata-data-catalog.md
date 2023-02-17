# airavata-data-catalog 
 
# Bad smells
I found 10 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 5 | false |
| DefaultAnnotationParam | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessaryFullyQualifiedName | 1 | false |
| UnnecessarySemicolon | 1 | false |
## RuleId[ruleID=SystemOutErr]
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

## RuleId[ruleID=DefaultAnnotationParam]
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

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DataCatalogApiServiceApplication` has only 'static' members, and lacks a 'private' constructor
in `data-catalog-api/server/src/main/java/org/apache/airavata/datacatalog/api/DataCatalogApiServiceApplication.java`
#### Snippet
```java

@SpringBootApplication
public class DataCatalogApiServiceApplication {

    public static void main(String[] args) {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `data-catalog-api/client/src/main/java/org/apache/airavata/datacatalog/api/client/DataCatalogAPIClient.java`
#### Snippet
```java
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;;

public class DataCatalogAPIClient {
```

