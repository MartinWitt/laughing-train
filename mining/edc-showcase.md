# edc-showcase 
 
# Bad smells
I found 21 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 17 | false |
| UNUSED_IMPORT | 2 | false |
| CommentedOutCode | 1 | false |
| RedundantSemicolon | 1 | false |
## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `extensions/identity-hub-verifier/src/main/java/org/eclipse/dataspaceconnector/iam/did/credentials/IdentityHubCredentialsVerifier.java`
#### Snippet
```java
import org.eclipse.dataspaceconnector.spi.result.Result;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `extensions/identity-hub-verifier/src/main/java/org/eclipse/dataspaceconnector/iam/did/credentials/IdentityHubCredentialsVerifier.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (18 lines)
in `extensions/identity-hub-verifier/src/main/java/org/eclipse/dataspaceconnector/iam/did/credentials/IdentityHubCredentialsVerifier.java`
#### Snippet
```java
    public Result<Map<String, String>> verifyCredentials(String hubBaseUrl, PublicKeyWrapper othersPublicKey) {

//        monitor.debug("Step 2: Starting credential verification against hub URL " + hubBaseUrl);
//
//        var query = ObjectQuery.Builder.newInstance().context("ION Demo").type("RegistrationCredentials").build();
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `didUrl == null` is always `true`
in `extensions/identity-hub-verifier/src/main/java/org/eclipse/dataspaceconnector/iam/did/credentials/DemoCredentialsVerifierExtension.java`
#### Snippet
```java

        var didUrl = context.getSetting(DID_URL_SETTING, null);
        if (didUrl == null) {
            throw new EdcException(format("The DID Url setting '(%s)' was null!", DID_URL_SETTING));
        }
```

### ConstantValue
Value `monitor` is always 'null'
in `extensions/federated-catalog-api/src/main/java/org/eclipse/dataspaceconnector/demo/edc_demo/api/FederatedCatalogApiExtension.java`
#### Snippet
```java
        var monitor = context.getMonitor();

        var controller = new FederatedCatalogApiController(monitor, catalogQueryEngine);
        webService.registerResource("data", controller);

```

### ConstantValue
Value `result` is always 'null'
in `extensions/federated-catalog-api/src/main/java/org/eclipse/dataspaceconnector/demo/edc_demo/api/FederatedCatalogApiController.java`
#### Snippet
```java
        var result = queryResponse.getOffers();

        return Response.ok(result).build();
    }
}
```

### ConstantValue
Value `commit` is always 'null'
in `extensions/dataseeding/hub/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/IdentityHubDataseedingExtension.java`
#### Snippet
```java
                Map.of("region", "eu", "created", Instant.now().toEpochMilli());
        var commit = Commit.Builder.newInstance().type("RegistrationCredentials").context("ION Demo").iss(context.getConnectorId()).sub("test").objectId(objectId).payload(payload).build();
        hubStore.write(commit);


```

### ConstantValue
Value `cdef` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java
                .selectorExpression(AssetSelectorExpression.Builder.newInstance().whenEquals(Asset.PROPERTY_ID, asset.getId()).build())
                .build();
        contractDefinitionStore.save(cdef);
    }

```

### ConstantValue
Value `asset1` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `dataAddress1` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `asset2` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `dataAddress2` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `asset3` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `dataAddress3` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `asset4` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `dataAddress4` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `asset5` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `dataAddress5` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java


        return List.of(new AssetEntry(asset1, dataAddress1), new AssetEntry(asset2, dataAddress2), new AssetEntry(asset3, dataAddress3), new AssetEntry(asset4, dataAddress4), new AssetEntry(asset5, dataAddress5));
    }
}
```

### ConstantValue
Value `nodesFile` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java

        var nodesFile = context.getSetting(NODES_FILE_SETTING, "nodes.json");
        monitor.info("Using FCC Node directory file " + nodesFile);

        //generate+save assets
```

### ConstantValue
Value `nodesFile` is always 'null'
in `extensions/dataseeding/catalog/src/main/java/org/eclipse/dataspaceconnector/dataseeding/catalog/CatalogDataseedingExtension.java`
#### Snippet
```java

        // populate node directory
        var nodes = readNodesFromJson(nodesFile);
        nodes.forEach(nodeDirectory::insert);

```

## RuleId[ruleID=RedundantSemicolon]
### RedundantSemicolon
Redundant semicolon
in `extensions/transfer-azure-s3/build.gradle.kts`
#### Snippet
```java
val rsApi: String by project
val group = "org.eclipse.dataspaceconnector"
val storageBlobVersion: String by project;


```

