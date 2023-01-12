# airavata-mft 
 
# Bad smells
I found 358 bad smells with 133 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 85 | true |
| UnnecessaryFullyQualifiedName | 35 | false |
| UNUSED_IMPORT | 33 | false |
| UnstableApiUsage | 29 | false |
| SystemOutErr | 28 | false |
| CodeBlock2Expr | 20 | true |
| UtilityClassWithoutPrivateConstructor | 16 | true |
| RedundantFieldInitialization | 16 | false |
| CommentedOutCode | 9 | false |
| TrivialStringConcatenation | 7 | false |
| UnnecessaryToStringCall | 7 | true |
| OptionalGetWithoutIsPresent | 6 | false |
| UnnecessarySemicolon | 5 | false |
| SwitchStatementWithConfusingDeclaration | 5 | false |
| UnusedAssignment | 5 | false |
| ConstantValue | 4 | false |
| CStyleArrayDeclaration | 3 | false |
| DuplicateExpressions | 3 | false |
| BoundedWildcard | 3 | false |
| MissortedModifiers | 3 | false |
| IgnoreResultOfCall | 3 | false |
| DataFlowIssue | 2 | false |
| OptionalContainsCollection | 2 | false |
| EmptyFinallyBlock | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| ReturnNull | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| StringBufferReplaceableByStringBuilder | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| FieldMayBeStatic | 1 | false |
| LoopStatementsThatDontLoop | 1 | false |
| EmptyStatementBody | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| StringEqualsEmptyString | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| NestedAssignment | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| EmptyMethod | 1 | false |
| BusyWait | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public Optional<BoxStorage> getBoxStorage(BoxStorageGetRequest request) throws Exception;
    public BoxStorage createBoxStorage(BoxStorageCreateRequest request) throws Exception;
    public boolean updateBoxStorage(BoxStorageUpdateRequest request) throws Exception;
    public boolean deleteBoxStorage(BoxStorageDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public SecretForStorage registerSecretForStorage(SecretForStorage request) throws Exception;
    public boolean deleteSecretForStorage(SecretForStorageDeleteRequest request) throws Exception;
    public StorageListResponse searchStorages(StorageSearchRequest request) throws Exception;
    public StorageListResponse listStorage(StorageListRequest request) throws Exception;
    public SCPStorageListResponse listSCPStorage(SCPStorageListRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java

    public S3StorageListResponse listS3Storage(S3StorageListRequest request) throws Exception;
    public Optional<S3Storage> getS3Storage(S3StorageGetRequest request) throws Exception;
    public S3Storage createS3Storage(S3StorageCreateRequest request) throws Exception;
    public boolean updateS3Storage(S3StorageUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public StorageListResponse searchStorages(StorageSearchRequest request) throws Exception;
    public StorageListResponse listStorage(StorageListRequest request) throws Exception;
    public SCPStorageListResponse listSCPStorage(SCPStorageListRequest request) throws Exception;
    public Optional<SCPStorage> getSCPStorage(SCPStorageGetRequest request) throws Exception;
    public SCPStorage createSCPStorage(SCPStorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public GCSStorageListResponse listGCSStorage(GCSStorageListRequest request) throws Exception;
    public Optional<GCSStorage> getGCSStorage(GCSStorageGetRequest request) throws Exception;
    public GCSStorage createGCSStorage(GCSStorageCreateRequest request) throws Exception;
    public boolean updateGCSStorage(GCSStorageUpdateRequest request) throws Exception;
    public boolean deleteGCSStorage(GCSStorageDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public boolean deleteDropboxStorage(DropboxStorageDeleteRequest request) throws Exception;

    public FTPStorageListResponse listFTPStorage(FTPStorageListRequest request) throws Exception;
    Optional<FTPStorage> getFTPStorage(FTPStorageGetRequest request) throws Exception;
    FTPStorage createFTPStorage(FTPStorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public void destroy();
    public SecretForStorage getSecretForStorage(SecretForStorageGetRequest request) throws Exception;
    public SecretForStorage registerSecretForStorage(SecretForStorage request) throws Exception;
    public boolean deleteSecretForStorage(SecretForStorageDeleteRequest request) throws Exception;
    public StorageListResponse searchStorages(StorageSearchRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public Optional<DropboxStorage> getDropboxStorage(DropboxStorageGetRequest request) throws Exception;
    public DropboxStorage createDropboxStorage(DropboxStorageCreateRequest request) throws Exception;
    public boolean updateDropboxStorage(DropboxStorageUpdateRequest request) throws Exception;
    public boolean deleteDropboxStorage(DropboxStorageDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public Optional<LocalStorage> getLocalStorage(LocalStorageGetRequest request) throws Exception;
    public LocalStorage createLocalStorage(LocalStorageCreateRequest request) throws Exception;
    public boolean updateLocalStorage(LocalStorageUpdateRequest request) throws Exception;
    public boolean deleteLocalStorage(LocalStorageDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java

    public void init();
    public void destroy();
    public SecretForStorage getSecretForStorage(SecretForStorageGetRequest request) throws Exception;
    public SecretForStorage registerSecretForStorage(SecretForStorage request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public SCPStorageListResponse listSCPStorage(SCPStorageListRequest request) throws Exception;
    public Optional<SCPStorage> getSCPStorage(SCPStorageGetRequest request) throws Exception;
    public SCPStorage createSCPStorage(SCPStorageCreateRequest request) throws Exception;
    public boolean updateSCPStorage(SCPStorageUpdateRequest request) throws Exception;
    public boolean deleteSCPStorage(SCPStorageDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public AzureStorage createAzureStorage(AzureStorageCreateRequest request) throws Exception;
    public boolean updateAzureStorage(AzureStorageUpdateRequest request) throws Exception;
    public boolean deleteAzureStorage(AzureStorageDeleteRequest request) throws Exception;

    public GCSStorageListResponse listGCSStorage(GCSStorageListRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public S3StorageListResponse listS3Storage(S3StorageListRequest request) throws Exception;
    public Optional<S3Storage> getS3Storage(S3StorageGetRequest request) throws Exception;
    public S3Storage createS3Storage(S3StorageCreateRequest request) throws Exception;
    public boolean updateS3Storage(S3StorageUpdateRequest request) throws Exception;
    public boolean deleteS3Storage(S3StorageDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public boolean deleteBoxStorage(BoxStorageDeleteRequest request) throws Exception;

    public AzureStorageListResponse listAzureStorage(AzureStorageListRequest request) throws Exception;
    public Optional<AzureStorage> getAzureStorage(AzureStorageGetRequest request) throws Exception;
    public AzureStorage createAzureStorage(AzureStorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public Optional<S3Storage> getS3Storage(S3StorageGetRequest request) throws Exception;
    public S3Storage createS3Storage(S3StorageCreateRequest request) throws Exception;
    public boolean updateS3Storage(S3StorageUpdateRequest request) throws Exception;
    public boolean deleteS3Storage(S3StorageDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public Optional<GCSStorage> getGCSStorage(GCSStorageGetRequest request) throws Exception;
    public GCSStorage createGCSStorage(GCSStorageCreateRequest request) throws Exception;
    public boolean updateGCSStorage(GCSStorageUpdateRequest request) throws Exception;
    public boolean deleteGCSStorage(GCSStorageDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java

    public LocalStorageListResponse listLocalStorage(LocalStorageListRequest request) throws Exception;
    public Optional<LocalStorage> getLocalStorage(LocalStorageGetRequest request) throws Exception;
    public LocalStorage createLocalStorage(LocalStorageCreateRequest request) throws Exception;
    public boolean updateLocalStorage(LocalStorageUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
public interface ResourceBackend {

    public void init();
    public void destroy();
    public SecretForStorage getSecretForStorage(SecretForStorageGetRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public boolean deleteS3Storage(S3StorageDeleteRequest request) throws Exception;

    public BoxStorageListResponse listBoxStorage(BoxStorageListRequest request) throws Exception;
    public Optional<BoxStorage> getBoxStorage(BoxStorageGetRequest request) throws Exception;
    public BoxStorage createBoxStorage(BoxStorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public GCSStorage createGCSStorage(GCSStorageCreateRequest request) throws Exception;
    public boolean updateGCSStorage(GCSStorageUpdateRequest request) throws Exception;
    public boolean deleteGCSStorage(GCSStorageDeleteRequest request) throws Exception;

    public DropboxStorageListResponse listDropboxStorage(DropboxStorageListRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public S3Storage createS3Storage(S3StorageCreateRequest request) throws Exception;
    public boolean updateS3Storage(S3StorageUpdateRequest request) throws Exception;
    public boolean deleteS3Storage(S3StorageDeleteRequest request) throws Exception;

    public BoxStorageListResponse listBoxStorage(BoxStorageListRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public DropboxStorageListResponse listDropboxStorage(DropboxStorageListRequest request) throws Exception;
    public Optional<DropboxStorage> getDropboxStorage(DropboxStorageGetRequest request) throws Exception;
    public DropboxStorage createDropboxStorage(DropboxStorageCreateRequest request) throws Exception;
    public boolean updateDropboxStorage(DropboxStorageUpdateRequest request) throws Exception;
    public boolean deleteDropboxStorage(DropboxStorageDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public LocalStorage createLocalStorage(LocalStorageCreateRequest request) throws Exception;
    public boolean updateLocalStorage(LocalStorageUpdateRequest request) throws Exception;
    public boolean deleteLocalStorage(LocalStorageDeleteRequest request) throws Exception;

    public S3StorageListResponse listS3Storage(S3StorageListRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public Optional<SCPStorage> getSCPStorage(SCPStorageGetRequest request) throws Exception;
    public SCPStorage createSCPStorage(SCPStorageCreateRequest request) throws Exception;
    public boolean updateSCPStorage(SCPStorageUpdateRequest request) throws Exception;
    public boolean deleteSCPStorage(SCPStorageDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public DropboxStorage createDropboxStorage(DropboxStorageCreateRequest request) throws Exception;
    public boolean updateDropboxStorage(DropboxStorageUpdateRequest request) throws Exception;
    public boolean deleteDropboxStorage(DropboxStorageDeleteRequest request) throws Exception;

    public FTPStorageListResponse listFTPStorage(FTPStorageListRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public boolean deleteAzureStorage(AzureStorageDeleteRequest request) throws Exception;

    public GCSStorageListResponse listGCSStorage(GCSStorageListRequest request) throws Exception;
    public Optional<GCSStorage> getGCSStorage(GCSStorageGetRequest request) throws Exception;
    public GCSStorage createGCSStorage(GCSStorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public boolean deleteSCPStorage(SCPStorageDeleteRequest request) throws Exception;

    public LocalStorageListResponse listLocalStorage(LocalStorageListRequest request) throws Exception;
    public Optional<LocalStorage> getLocalStorage(LocalStorageGetRequest request) throws Exception;
    public LocalStorage createLocalStorage(LocalStorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public AzureStorageListResponse listAzureStorage(AzureStorageListRequest request) throws Exception;
    public Optional<AzureStorage> getAzureStorage(AzureStorageGetRequest request) throws Exception;
    public AzureStorage createAzureStorage(AzureStorageCreateRequest request) throws Exception;
    public boolean updateAzureStorage(AzureStorageUpdateRequest request) throws Exception;
    public boolean deleteAzureStorage(AzureStorageDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public void init();
    public void destroy();
    public SecretForStorage getSecretForStorage(SecretForStorageGetRequest request) throws Exception;
    public SecretForStorage registerSecretForStorage(SecretForStorage request) throws Exception;
    public boolean deleteSecretForStorage(SecretForStorageDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public SCPStorage createSCPStorage(SCPStorageCreateRequest request) throws Exception;
    public boolean updateSCPStorage(SCPStorageUpdateRequest request) throws Exception;
    public boolean deleteSCPStorage(SCPStorageDeleteRequest request) throws Exception;

    public LocalStorageListResponse listLocalStorage(LocalStorageListRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java

    public GCSStorageListResponse listGCSStorage(GCSStorageListRequest request) throws Exception;
    public Optional<GCSStorage> getGCSStorage(GCSStorageGetRequest request) throws Exception;
    public GCSStorage createGCSStorage(GCSStorageCreateRequest request) throws Exception;
    public boolean updateGCSStorage(GCSStorageUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public BoxStorageListResponse listBoxStorage(BoxStorageListRequest request) throws Exception;
    public Optional<BoxStorage> getBoxStorage(BoxStorageGetRequest request) throws Exception;
    public BoxStorage createBoxStorage(BoxStorageCreateRequest request) throws Exception;
    public boolean updateBoxStorage(BoxStorageUpdateRequest request) throws Exception;
    public boolean deleteBoxStorage(BoxStorageDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java

    public BoxStorageListResponse listBoxStorage(BoxStorageListRequest request) throws Exception;
    public Optional<BoxStorage> getBoxStorage(BoxStorageGetRequest request) throws Exception;
    public BoxStorage createBoxStorage(BoxStorageCreateRequest request) throws Exception;
    public boolean updateBoxStorage(BoxStorageUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java

    public DropboxStorageListResponse listDropboxStorage(DropboxStorageListRequest request) throws Exception;
    public Optional<DropboxStorage> getDropboxStorage(DropboxStorageGetRequest request) throws Exception;
    public DropboxStorage createDropboxStorage(DropboxStorageCreateRequest request) throws Exception;
    public boolean updateDropboxStorage(DropboxStorageUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public StorageListResponse listStorage(StorageListRequest request) throws Exception;
    public SCPStorageListResponse listSCPStorage(SCPStorageListRequest request) throws Exception;
    public Optional<SCPStorage> getSCPStorage(SCPStorageGetRequest request) throws Exception;
    public SCPStorage createSCPStorage(SCPStorageCreateRequest request) throws Exception;
    public boolean updateSCPStorage(SCPStorageUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    boolean deleteSwiftStorage(SwiftStorageDeleteRequest request) throws Exception;

    public ODataStorageListResponse listODataStorage(ODataStorageListRequest request) throws Exception;
    Optional<ODataStorage> getODataStorage(ODataStorageGetRequest request) throws Exception;
    ODataStorage createODataStorage(ODataStorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public boolean deleteSecretForStorage(SecretForStorageDeleteRequest request) throws Exception;
    public StorageListResponse searchStorages(StorageSearchRequest request) throws Exception;
    public StorageListResponse listStorage(StorageListRequest request) throws Exception;
    public SCPStorageListResponse listSCPStorage(SCPStorageListRequest request) throws Exception;
    public Optional<SCPStorage> getSCPStorage(SCPStorageGetRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public LocalStorageListResponse listLocalStorage(LocalStorageListRequest request) throws Exception;
    public Optional<LocalStorage> getLocalStorage(LocalStorageGetRequest request) throws Exception;
    public LocalStorage createLocalStorage(LocalStorageCreateRequest request) throws Exception;
    public boolean updateLocalStorage(LocalStorageUpdateRequest request) throws Exception;
    public boolean deleteLocalStorage(LocalStorageDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public SecretForStorage getSecretForStorage(SecretForStorageGetRequest request) throws Exception;
    public SecretForStorage registerSecretForStorage(SecretForStorage request) throws Exception;
    public boolean deleteSecretForStorage(SecretForStorageDeleteRequest request) throws Exception;
    public StorageListResponse searchStorages(StorageSearchRequest request) throws Exception;
    public StorageListResponse listStorage(StorageListRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public BoxStorage createBoxStorage(BoxStorageCreateRequest request) throws Exception;
    public boolean updateBoxStorage(BoxStorageUpdateRequest request) throws Exception;
    public boolean deleteBoxStorage(BoxStorageDeleteRequest request) throws Exception;

    public AzureStorageListResponse listAzureStorage(AzureStorageListRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    boolean deleteFTPStorage(FTPStorageDeleteRequest request) throws Exception;

    public SwiftStorageListResponse listSwiftStorage(SwiftStorageListRequest request) throws Exception;
    Optional<SwiftStorage> getSwiftStorage(SwiftStorageGetRequest request) throws Exception;
    SwiftStorage createSwiftStorage(SwiftStorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public boolean deleteLocalStorage(LocalStorageDeleteRequest request) throws Exception;

    public S3StorageListResponse listS3Storage(S3StorageListRequest request) throws Exception;
    public Optional<S3Storage> getS3Storage(S3StorageGetRequest request) throws Exception;
    public S3Storage createS3Storage(S3StorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public boolean deleteGCSStorage(GCSStorageDeleteRequest request) throws Exception;

    public DropboxStorageListResponse listDropboxStorage(DropboxStorageListRequest request) throws Exception;
    public Optional<DropboxStorage> getDropboxStorage(DropboxStorageGetRequest request) throws Exception;
    public DropboxStorage createDropboxStorage(DropboxStorageCreateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java
    public Optional<AzureStorage> getAzureStorage(AzureStorageGetRequest request) throws Exception;
    public AzureStorage createAzureStorage(AzureStorageCreateRequest request) throws Exception;
    public boolean updateAzureStorage(AzureStorageUpdateRequest request) throws Exception;
    public boolean deleteAzureStorage(AzureStorageDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/ResourceBackend.java`
#### Snippet
```java

    public AzureStorageListResponse listAzureStorage(AzureStorageListRequest request) throws Exception;
    public Optional<AzureStorage> getAzureStorage(AzureStorageGetRequest request) throws Exception;
    public AzureStorage createAzureStorage(AzureStorageCreateRequest request) throws Exception;
    public boolean updateAzureStorage(AzureStorageUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/MetadataCollector.java`
#### Snippet
```java
     * @throws Exception if the resource details can not be fetched from the resource service
     */
    public Boolean isAvailable(String resourcePath) throws Exception;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/MetadataCollector.java`
#### Snippet
```java
     * @throws Exception if the resource id is not a File Resource type or the resource can't be fetched from the resource service
     */
    public ResourceMetadata getResourceMetadata(String resourcePath, boolean recursiveSearch) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/MetadataCollector.java`
#### Snippet
```java
     * @param secret
     */
    public void init(StorageWrapper storage, SecretWrapper secret);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/OutgoingChunkedConnector.java`
#### Snippet
```java

public interface OutgoingChunkedConnector extends BasicConnector {
    public void uploadChunk(int chunkId, long startByte, long endByte, String uploadFile) throws Exception;
    public void uploadChunk(int chunkId, long startByte, long endByte, InputStream inputStream) throws Exception;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/OutgoingChunkedConnector.java`
#### Snippet
```java
public interface OutgoingChunkedConnector extends BasicConnector {
    public void uploadChunk(int chunkId, long startByte, long endByte, String uploadFile) throws Exception;
    public void uploadChunk(int chunkId, long startByte, long endByte, InputStream inputStream) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/Connector.java`
#### Snippet
```java

public interface Connector {
    public void init(String resourceServiceHost, int resourceServicePort,
                     String secretServiceHost, int secretServicePort) throws Exception;
    public void destroy();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/Connector.java`
#### Snippet
```java
    public void init(String resourceServiceHost, int resourceServicePort,
                     String secretServiceHost, int secretServicePort) throws Exception;
    public void destroy();
    void startStream(AuthToken authToken, String resourceId, String credentialToken, ConnectorContext context) throws Exception;
    void startStream(AuthToken authToken, String resourceId, String childResourcePath, String credentialToken, ConnectorContext context) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/BasicConnector.java`
#### Snippet
```java
    public void init(ConnectorConfig connectorConfig) throws Exception;
    public void complete() throws Exception;
    public void failed() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/BasicConnector.java`
#### Snippet
```java
public interface BasicConnector {
    public void init(ConnectorConfig connectorConfig) throws Exception;
    public void complete() throws Exception;
    public void failed() throws Exception;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/BasicConnector.java`
#### Snippet
```java

public interface BasicConnector {
    public void init(ConnectorConfig connectorConfig) throws Exception;
    public void complete() throws Exception;
    public void failed() throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/OutgoingStreamingConnector.java`
#### Snippet
```java

public interface OutgoingStreamingConnector extends BasicConnector {
    public OutputStream fetchOutputStream() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/IncomingChunkedConnector.java`
#### Snippet
```java

public interface IncomingChunkedConnector extends BasicConnector {
    public void downloadChunk(int chunkId, long startByte, long endByte, String downloadFile) throws Exception;
    public InputStream downloadChunk(int chunkId, long startByte, long endByte) throws Exception;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/IncomingChunkedConnector.java`
#### Snippet
```java
public interface IncomingChunkedConnector extends BasicConnector {
    public void downloadChunk(int chunkId, long startByte, long endByte, String downloadFile) throws Exception;
    public InputStream downloadChunk(int chunkId, long startByte, long endByte) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/airavata/mft/core/api/IncomingStreamingConnector.java`
#### Snippet
```java

public interface IncomingStreamingConnector extends BasicConnector {
    public InputStream fetchInputStream() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java

    public Optional<SCPSecret> getSCPSecret(SCPSecretGetRequest request) throws Exception;
    public SCPSecret createSCPSecret(SCPSecretCreateRequest request);
    public boolean updateSCPSecret(SCPSecretUpdateRequest request);
    public boolean deleteSCPSecret(SCPSecretDeleteRequest request);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public Optional<GCSSecret> getGCSSecret(GCSSecretGetRequest request) throws Exception;
    public GCSSecret createGCSSecret(GCSSecretCreateRequest request) throws Exception;
    public boolean updateGCSSecret(GCSSecretUpdateRequest request) throws Exception;
    public boolean deleteGCSSecret(GCSSecretDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java

    public Optional<DropboxSecret> getDropboxSecret(DropboxSecretGetRequest request) throws Exception;
    public DropboxSecret createDropboxSecret(DropboxSecretCreateRequest request) throws Exception;
    public boolean updateDropboxSecret(DropboxSecretUpdateRequest request) throws Exception;
    public boolean deleteDropboxSecret(DropboxSecretDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java

    public Optional<BoxSecret> getBoxSecret(BoxSecretGetRequest request) throws Exception;
    public BoxSecret createBoxSecret(BoxSecretCreateRequest request) throws Exception;
    public boolean updateBoxSecret(BoxSecretUpdateRequest request) throws Exception;
    public boolean deleteBoxSecret(BoxSecretDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public S3Secret createS3Secret(S3SecretCreateRequest request) throws Exception;
    public boolean updateS3Secret(S3SecretUpdateRequest request) throws Exception;
    public boolean deleteS3Secret(S3SecretDeleteRequest request) throws Exception;

    public Optional<BoxSecret> getBoxSecret(BoxSecretGetRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java

    public void init();
    public void destroy();

    public Optional<SCPSecret> getSCPSecret(SCPSecretGetRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public Optional<S3Secret> getS3Secret(S3SecretGetRequest request) throws Exception;
    public S3Secret createS3Secret(S3SecretCreateRequest request) throws Exception;
    public boolean updateS3Secret(S3SecretUpdateRequest request) throws Exception;
    public boolean deleteS3Secret(S3SecretDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public BoxSecret createBoxSecret(BoxSecretCreateRequest request) throws Exception;
    public boolean updateBoxSecret(BoxSecretUpdateRequest request) throws Exception;
    public boolean deleteBoxSecret(BoxSecretDeleteRequest request) throws Exception;

    public Optional<AzureSecret> getAzureSecret(AzureSecretGetRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public DropboxSecret createDropboxSecret(DropboxSecretCreateRequest request) throws Exception;
    public boolean updateDropboxSecret(DropboxSecretUpdateRequest request) throws Exception;
    public boolean deleteDropboxSecret(DropboxSecretDeleteRequest request) throws Exception;

    Optional<FTPSecret> getFTPSecret(FTPSecretGetRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public boolean deleteS3Secret(S3SecretDeleteRequest request) throws Exception;

    public Optional<BoxSecret> getBoxSecret(BoxSecretGetRequest request) throws Exception;
    public BoxSecret createBoxSecret(BoxSecretCreateRequest request) throws Exception;
    public boolean updateBoxSecret(BoxSecretUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public boolean deleteGCSSecret(GCSSecretDeleteRequest request) throws Exception;

    public Optional<DropboxSecret> getDropboxSecret(DropboxSecretGetRequest request) throws Exception;
    public DropboxSecret createDropboxSecret(DropboxSecretCreateRequest request) throws Exception;
    public boolean updateDropboxSecret(DropboxSecretUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public Optional<BoxSecret> getBoxSecret(BoxSecretGetRequest request) throws Exception;
    public BoxSecret createBoxSecret(BoxSecretCreateRequest request) throws Exception;
    public boolean updateBoxSecret(BoxSecretUpdateRequest request) throws Exception;
    public boolean deleteBoxSecret(BoxSecretDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java

    public Optional<GCSSecret> getGCSSecret(GCSSecretGetRequest request) throws Exception;
    public GCSSecret createGCSSecret(GCSSecretCreateRequest request) throws Exception;
    public boolean updateGCSSecret(GCSSecretUpdateRequest request) throws Exception;
    public boolean deleteGCSSecret(GCSSecretDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public Optional<AzureSecret> getAzureSecret(AzureSecretGetRequest request) throws Exception;
    public AzureSecret createAzureSecret(AzureSecretCreateRequest request) throws Exception;
    public boolean updateAzureSecret(AzureSecretUpdateRequest request) throws Exception;
    public boolean deleteAzureSecret(AzureSecretDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public void destroy();

    public Optional<SCPSecret> getSCPSecret(SCPSecretGetRequest request) throws Exception;
    public SCPSecret createSCPSecret(SCPSecretCreateRequest request);
    public boolean updateSCPSecret(SCPSecretUpdateRequest request);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
public interface SecretBackend {

    public void init();
    public void destroy();

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java

    public Optional<S3Secret> getS3Secret(S3SecretGetRequest request) throws Exception;
    public S3Secret createS3Secret(S3SecretCreateRequest request) throws Exception;
    public boolean updateS3Secret(S3SecretUpdateRequest request) throws Exception;
    public boolean deleteS3Secret(S3SecretDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public boolean deleteSCPSecret(SCPSecretDeleteRequest request);

    public Optional<S3Secret> getS3Secret(S3SecretGetRequest request) throws Exception;
    public S3Secret createS3Secret(S3SecretCreateRequest request) throws Exception;
    public boolean updateS3Secret(S3SecretUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public boolean deleteAzureSecret(AzureSecretDeleteRequest request) throws Exception;

    public Optional<GCSSecret> getGCSSecret(GCSSecretGetRequest request) throws Exception;
    public GCSSecret createGCSSecret(GCSSecretCreateRequest request) throws Exception;
    public boolean updateGCSSecret(GCSSecretUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public boolean deleteBoxSecret(BoxSecretDeleteRequest request) throws Exception;

    public Optional<AzureSecret> getAzureSecret(AzureSecretGetRequest request) throws Exception;
    public AzureSecret createAzureSecret(AzureSecretCreateRequest request) throws Exception;
    public boolean updateAzureSecret(AzureSecretUpdateRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java

    public Optional<AzureSecret> getAzureSecret(AzureSecretGetRequest request) throws Exception;
    public AzureSecret createAzureSecret(AzureSecretCreateRequest request) throws Exception;
    public boolean updateAzureSecret(AzureSecretUpdateRequest request) throws Exception;
    public boolean deleteAzureSecret(AzureSecretDeleteRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public Optional<DropboxSecret> getDropboxSecret(DropboxSecretGetRequest request) throws Exception;
    public DropboxSecret createDropboxSecret(DropboxSecretCreateRequest request) throws Exception;
    public boolean updateDropboxSecret(DropboxSecretUpdateRequest request) throws Exception;
    public boolean deleteDropboxSecret(DropboxSecretDeleteRequest request) throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public AzureSecret createAzureSecret(AzureSecretCreateRequest request) throws Exception;
    public boolean updateAzureSecret(AzureSecretUpdateRequest request) throws Exception;
    public boolean deleteAzureSecret(AzureSecretDeleteRequest request) throws Exception;

    public Optional<GCSSecret> getGCSSecret(GCSSecretGetRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public GCSSecret createGCSSecret(GCSSecretCreateRequest request) throws Exception;
    public boolean updateGCSSecret(GCSSecretUpdateRequest request) throws Exception;
    public boolean deleteGCSSecret(GCSSecretDeleteRequest request) throws Exception;

    public Optional<DropboxSecret> getDropboxSecret(DropboxSecretGetRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public SCPSecret createSCPSecret(SCPSecretCreateRequest request);
    public boolean updateSCPSecret(SCPSecretUpdateRequest request);
    public boolean deleteSCPSecret(SCPSecretDeleteRequest request);

    public Optional<S3Secret> getS3Secret(S3SecretGetRequest request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/SecretBackend.java`
#### Snippet
```java
    public Optional<SCPSecret> getSCPSecret(SCPSecretGetRequest request) throws Exception;
    public SCPSecret createSCPSecret(SCPSecretCreateRequest request);
    public boolean updateSCPSecret(SCPSecretUpdateRequest request);
    public boolean deleteSCPSecret(SCPSecretDeleteRequest request);

```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `SPAWNER_MAX_IDLE_SECONDS` may be 'static'
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/AgentOrchestrator.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(AgentOrchestrator.class);

    private final int SPAWNER_MAX_IDLE_SECONDS = 30;

    private class TransferInfo {
```

## RuleId[ruleID=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`while` statement does not loop
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
        out.flush();

        while (true) {
            int c = checkAck(in);
            if (c != 'C') {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `GCSUtil` has only 'static' members, and lacks a 'private' constructor
in `transport/gcp-transport/src/main/java/org/apache/airavata/mft/transport/gcp/GCSUtil.java`
#### Snippet
```java
import java.util.Base64;

public class GCSUtil {
    static PrivateKey getPrivateKey(String privateKeyContent) throws Exception {
        privateKeyContent = privateKeyContent.replaceAll("\\n", "").replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "");
```

### UtilityClassWithoutPrivateConstructor
Class `AgentUtil` has only 'static' members, and lacks a 'private' constructor
in `agent/service/src/main/java/org/apache/airavata/mft/agent/AgentUtil.java`
#### Snippet
```java
import java.util.function.Consumer;

public final class AgentUtil {
    @FunctionalInterface
    public interface ThrowingBiConsumer<T, U, E extends Exception> {
```

### UtilityClassWithoutPrivateConstructor
Class `StandaloneServiceApplication` has only 'static' members, and lacks a 'private' constructor
in `standalone-service/src/main/java/org/apache/airavata/mft/standalone/server/StandaloneServiceApplication.java`
#### Snippet
```java
@PropertySource(value = "classpath:secret-service-application.properties")
@Import(org.apache.airavata.mft.api.AppConfig.class)
public class StandaloneServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(StandaloneServiceApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `MainRunner` has only 'static' members, and lacks a 'private' constructor
in `command-line/src/main/java/org/apache/airavata/mft/command/line/MainRunner.java`
#### Snippet
```java
        description = "Prints the checksum (SHA-256 by default) of a file to STDOUT.",
        subcommands = {S3SubCommand.class, TransferSubCommand.class, SwiftSubCommand.class, ODataSubCommand.class, GCSSubCommand.class})
class MainRunner {

    public static void main(String... args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ResourceServiceApplication` has only 'static' members, and lacks a 'private' constructor
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/ResourceServiceApplication.java`
#### Snippet
```java
@ComponentScan(basePackages = {"org.apache.airavata"})
@PropertySource(value = "classpath:resource-service-application.properties")
public class ResourceServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceServiceApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `FTPTransportUtil` has only 'static' members, and lacks a 'private' constructor
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPTransportUtil.java`
#### Snippet
```java
import java.io.IOException;

class FTPTransportUtil {

    private static final Logger logger = LoggerFactory.getLogger(FTPTransportUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `StorageServiceClientBuilder` has only 'static' members, and lacks a 'private' constructor
in `services/resource-service/client/src/main/java/org/apache/airavata/mft/resource/client/StorageServiceClientBuilder.java`
#### Snippet
```java
import io.grpc.ManagedChannelBuilder;

public class StorageServiceClientBuilder {

    public static StorageServiceClient buildClient(String hostName, int port) {
```

### UtilityClassWithoutPrivateConstructor
Class `ApiServiceApplication` has only 'static' members, and lacks a 'private' constructor
in `api/service/src/main/java/org/apache/airavata/mft/api/ApiServiceApplication.java`
#### Snippet
```java
@ComponentScan(basePackages = {"org.apache.airavata.mft"})
@PropertySource(value = "classpath:api-service-application.properties")
public class ApiServiceApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApiServiceApplication.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SCPTransportUtil` has only 'static' members, and lacks a 'private' constructor
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPTransportUtil.java`
#### Snippet
```java
import java.util.UUID;

public class SCPTransportUtil {

    private static final Logger logger = LoggerFactory.getLogger(SCPTransportUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ResourceTypes` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/airavata/mft/core/ResourceTypes.java`
#### Snippet
```java
package org.apache.airavata.mft.core;

public final class ResourceTypes {
    public static final String FILE = "FILE";
    public static final String DIRECTORY = "DIRECTORY";
```

### UtilityClassWithoutPrivateConstructor
Class `SecretServiceApplication` has only 'static' members, and lacks a 'private' constructor
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/SecretServiceApplication.java`
#### Snippet
```java
@EntityScan(basePackages = {"org.apache.airavata.mft.secret.server.backend.sql.entity"})
@PropertySource(value = "classpath:secret-service-application.properties")
public class SecretServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecretServiceApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `ConnectorResolver` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/airavata/mft/core/ConnectorResolver.java`
#### Snippet
```java
import java.util.Optional;

public final class ConnectorResolver {

    public static Optional<IncomingStreamingConnector> resolveIncomingStreamingConnector(String type) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SpawnerSelector` has only 'static' members, and lacks a 'private' constructor
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/SpawnerSelector.java`
#### Snippet
```java
import java.util.Optional;

public class SpawnerSelector {

    public static Optional<AgentSpawner> selectSpawner(StorageWrapper storageWrapper, SecretWrapper secretWrapper) {
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataCollectorResolver` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/airavata/mft/core/MetadataCollectorResolver.java`
#### Snippet
```java
import java.util.Optional;

public final class MetadataCollectorResolver {

    public static Optional<MetadataCollector> resolveMetadataCollector(String type) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
```

### UtilityClassWithoutPrivateConstructor
Class `SecretServiceClientBuilder` has only 'static' members, and lacks a 'private' constructor
in `services/secret-service/client/src/main/java/org/apache/airavata/mft/secret/client/SecretServiceClientBuilder.java`
#### Snippet
```java
import io.grpc.ManagedChannelBuilder;

public class SecretServiceClientBuilder {

    public static SecretServiceClient buildClient(String hostName, int port) {
```

### UtilityClassWithoutPrivateConstructor
Class `CommandLineUtil` has only 'static' members, and lacks a 'private' constructor
in `command-line/src/main/java/org/apache/airavata/mft/command/line/CommandLineUtil.java`
#### Snippet
```java
package org.apache.airavata.mft.command.line;

public final class CommandLineUtil {

    public static void printTable(int[] columnWidths, String[][] content) {
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getResourcePath` may produce `NullPointerException`
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            logger.error("Error while fetching resource metadata for resource path " + directRequest.getResourcePath(), e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Failed to fetch file resource metadata. " + e.getMessage())
```

### DataFlowIssue
Method invocation `getResourcePath` may produce `NullPointerException`
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            logger.error("Error while fetching resource metadata for resource path " + directRequest.getResourcePath(), e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Failed to fetch file resource metadata. " + e.getMessage())
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/LimitInputStream.java`
#### Snippet
```java
    public void close() throws IOException {
        if (!this.open.getAndSet(false)) {
            ;
        }
    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/sql/entity/swift/SwiftSecretEntity.java`
#### Snippet
```java

    public enum InternalSecretType {
        PASSWORD, AUTH_CREDENTIAL;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/entity/ResolveStorageEntity.java`
#### Snippet
```java

    public enum StorageType {
        S3, SCP, LOCAL, FTP, BOX, DROPBOX, GCS, AZURE, SWIFT, ODATA;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/entity/GenericResourceEntity.java`
#### Snippet
```java

    public enum ResourceType {
        FILE, DIRECTORY;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/entity/GenericResourceEntity.java`
#### Snippet
```java

    public enum StorageType {
        S3, SCP, LOCAL, FTP, BOX, DROPBOX, GCS, AZURE, SWIFT, ODATA;
    }

```

## RuleId[ruleID=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/LimitInputStream.java`
#### Snippet
```java

    public void close() throws IOException {
        if (!this.open.getAndSet(false)) {
            ;
        }
```

## RuleId[ruleID=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `byte[]`
in `controller/src/main/java/org/apache/airavata/mft/controller/MFTController.java`
#### Snippet
```java
        ConsulCache.Listener<String, Value> messageCacheListener = newValues -> newValues.forEach((key, value) -> {
            String transferId = key.substring(key.lastIndexOf("/") + 1);
            Optional<byte[]> decodedValue = value.getValueAsBytes();
            decodedValue.ifPresent(v -> {
                logger.info("Received transfer request : {} with id {}", v, transferId);
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java
        transferCacheListener = newValues -> {
            newValues.values().forEach(value -> {
                Optional<byte[]> decodedValue = value.getValueAsBytes();

                String[] partsOfKey = value.getKey().split("/");
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `args`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/MFTAgent.java`
#### Snippet
```java
    }

    public static void main(String args[]) throws Exception {
        SpringApplication.run(MFTAgent.class);
    }
```

### CStyleArrayDeclaration
C-style array declaration of parameter `args`
in `controller/src/main/java/org/apache/airavata/mft/controller/MFTController.java`
#### Snippet
```java
    }

    public static void main(String args[]) {
        SpringApplication.run(MFTController.class);
    }
```

### CStyleArrayDeclaration
C-style array declaration of local variable `parts`
in `controller/src/main/java/org/apache/airavata/mft/controller/MFTController.java`
#### Snippet
```java
                    logger.info("Received state Key {} val {}", key, valAsStr);

                    String parts[] = key.split("/");
                    if (parts.length != 5) {
                        logger.error("Invalid status key {}", key);
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (22 lines)
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxReceiver.java`
#### Snippet
```java
        logger.info("Starting Box Receiver stream for transfer {}", context.getTransferId());

        /*
        ResourceServiceClient resourceClient = ResourceServiceClientBuilder.buildClient(resourceServiceHost, resourceServicePort);
        GenericResource resource = resourceClient.get().getGenericResource(GenericResourceGetRequest.newBuilder()
```

### CommentedOutCode
Commented out code (2 lines)
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java

        } finally {
            //logger.info("Deleting key " + consulEntryKey);
            //mftConsulClient.getKvClient().deleteKey(consulEntryKey); // Due to bug in consul https://github.com/hashicorp/consul/issues/571
        }
```

### CommentedOutCode
Commented out code (28 lines)
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxSender.java`
#### Snippet
```java
    public void startStream(AuthToken authToken, String resourceId, String credentialToken, ConnectorContext context) throws Exception {

        /*
        logger.info("Starting Box Sender stream for transfer {}", context.getTransferId());
        logger.debug("Content length for transfer {} {}", context.getTransferId(), context.getMetadata().getResourceSize());
```

### CommentedOutCode
Commented out code (19 lines)
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxSender.java`
#### Snippet
```java
        logger.info("Starting Dropbox Sender stream for transfer {}", context.getTransferId());
        logger.info("Content length for transfer {} {}", context.getTransferId(), context.getMetadata().getResourceSize());
        /*
        ResourceServiceClient resourceClient = ResourceServiceClientBuilder.buildClient(resourceServiceHost, resourceServicePort);
        GenericResource resource = resourceClient.get().getGenericResource(GenericResourceGetRequest.newBuilder()
```

### CommentedOutCode
Commented out code (40 lines)
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalSender.java`
#### Snippet
```java
        checkInitialized();

        /*ResourceServiceClient resourceClient = ResourceServiceClientBuilder.buildClient(resourceServiceHost, resourceServicePort);
        GenericResource resource = resourceClient.get().getGenericResource(GenericResourceGetRequest.newBuilder()
                .setResourceId(resourceId).build());
```

### CommentedOutCode
Commented out code (49 lines)
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPSender.java`
#### Snippet
```java
        logger.info("Starting FTP sender stream for transfer {}", context.getTransferId());

        /*
        checkInitialized();

```

### CommentedOutCode
Commented out code (46 lines)
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxReceiver.java`
#### Snippet
```java

        logger.info("Starting Dropbox Receiver stream for transfer {}", context.getTransferId());
        /*
        ResourceServiceClient resourceClient = ResourceServiceClientBuilder.buildClient(resourceServiceHost, resourceServicePort);
        GenericResource resource = resourceClient.get().getGenericResource(GenericResourceGetRequest.newBuilder()
```

### CommentedOutCode
Commented out code (42 lines)
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalReceiver.java`
#### Snippet
```java
        logger.info("Starting local receiver stream for transfer {}", context.getTransferId());

        /*
        checkInitialized();

```

### CommentedOutCode
Commented out code (49 lines)
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPReceiver.java`
#### Snippet
```java
        logger.info("Starting FTP receiver stream for transfer {}", context.getTransferId());

        /*
        checkInitialized();

```

## RuleId[ruleID=EmptyFinallyBlock]
### EmptyFinallyBlock
Empty `finally` block
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java


        } finally {
            //logger.info("Deleting key " + consulEntryKey);
            //mftConsulClient.getKvClient().deleteKey(consulEntryKey); // Due to bug in consul https://github.com/hashicorp/consul/issues/571
```

### EmptyFinallyBlock
Empty `finally` block
in `controller/src/main/java/org/apache/airavata/mft/controller/MFTController.java`
#### Snippet
```java
            } catch (Exception e) {
                logger.error("Errored while processing live agent cache key {}", agentId, e);
            } finally {

            }
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `downloadRequestStore.keySet()` may be replaced with 'Map.forEach()' iteration
in `agent/service/src/main/java/org/apache/airavata/mft/agent/http/HttpTransferRequestsStore.java`
#### Snippet
```java
        monitor.scheduleWithFixedDelay(()-> {
            logger.debug("Cleaning up the request store..");
            downloadRequestStore.keySet().forEach(key -> {
                if ((System.currentTimeMillis() - downloadRequestStore.get(key).getCreatedTime()) > entryExpiryTimeMS) {
                    downloadRequestStore.remove(key);
```

### KeySetIterationMayUseEntrySet
Iteration over `uploadRequestStore.keySet()` may be replaced with 'Map.forEach()' iteration
in `agent/service/src/main/java/org/apache/airavata/mft/agent/http/HttpTransferRequestsStore.java`
#### Snippet
```java
            });

            uploadRequestStore.keySet().forEach(key -> {
                if ((System.currentTimeMillis() - uploadRequestStore.get(key).getCreatedTime()) > entryExpiryTimeMS) {
                    uploadRequestStore.remove(key);
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `agent/service/src/main/java/org/apache/airavata/mft/agent/MFTAgent.java`
#### Snippet
```java
                        break;
                    case KAFKA:
                        break;
                }
            }
```

## RuleId[ruleID=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Path.of(mftKeyDir)`
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/EC2AgentSpawner.java`
#### Snippet
```java

                List<String> localKeys = new ArrayList<>();
                if (Files.isDirectory(Path.of(mftKeyDir))) {
                    Stream<Path> keyPaths = Files.list(Path.of(mftKeyDir));
                    keyPaths.forEach(p -> localKeys.add(p.toFile().getName()));
```

### DuplicateExpressions
Multiple occurrences of `Path.of(mftKeyDir)`
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/EC2AgentSpawner.java`
#### Snippet
```java
                List<String> localKeys = new ArrayList<>();
                if (Files.isDirectory(Path.of(mftKeyDir))) {
                    Stream<Path> keyPaths = Files.list(Path.of(mftKeyDir));
                    keyPaths.forEach(p -> localKeys.add(p.toFile().getName()));
                }
```

### DuplicateExpressions
Multiple occurrences of `Path.of(mftKeyDir)`
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/EC2AgentSpawner.java`
#### Snippet
```java
                    String privateKey = keyPair.getKeyMaterial();

                    Files.createDirectories(Path.of(mftKeyDir));
                    Files.write(Path.of(mftKeyDir, keyName), privateKey.getBytes(StandardCharsets.UTF_8));
                    logger.info("Created key pair " + keyName);
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`metadata.transferInfos.size() > 0` can be replaced with '!metadata.transferInfos.isEmpty()'
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/AgentOrchestrator.java`
#### Snippet
```java
                    if ((System.currentTimeMillis() - metadata.lastScannedTime) >  SPAWNER_MAX_IDLE_SECONDS * 1000) {

                        if (metadata.transferInfos.size() > 0) {
                            return;
                        }
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/transfer/TransferStateSubCommand.java`
#### Snippet
```java
            content[0] = headers;

            content[1][0] = transferState.getUpdateTimeMils() + "";
            content[1][1] = transferState.getState();
            content[1][2] = transferState.getDescription();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/transfer/TransferStateSubCommand.java`
#### Snippet
```java
            content[1][1] = transferState.getState();
            content[1][2] = transferState.getDescription();
            content[1][3] = transferState.getPercentage() + "";

            CommandLineUtil.printTable(columnWidth, content);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/transfer/TransferStateSubCommand.java`
#### Snippet
```java
            for (int i = 1; i <= states.size(); i ++) {
                TransferStateResponse transferState = states.get(i -1);
                content[i][0] = transferState.getUpdateTimeMils() + "";
                content[i][1] = transferState.getState();
                content[i][2] = transferState.getDescription();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/transfer/TransferStateSubCommand.java`
#### Snippet
```java
                content[i][1] = transferState.getState();
                content[i][2] = transferState.getDescription();
                content[i][3] = transferState.getPercentage() + "";
            }
            CommandLineUtil.printTable(columnWidth, content);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java

        Properties overrides = new Properties();
        overrides.put(KeystoneProperties.KEYSTONE_VERSION, swiftStorage.getKeystoneVersion() + "");

        String identity = null;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java

        Properties overrides = new Properties();
        overrides.put(KeystoneProperties.KEYSTONE_VERSION, swiftStorage.getKeystoneVersion() + "");

        String identity = null;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java

        Properties overrides = new Properties();
        overrides.put(KeystoneProperties.KEYSTONE_VERSION, swiftStorage.getKeystoneVersion() + "");

        String identity = null;
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
            while (c != '\n');
            if (b == 1) { // error
                logger.error("Check Ack Failure b = 1 " + sb.toString());
            }
            if (b == 2) { // fatal error
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
            }
            if (b == 2) { // fatal error
                logger.error("Check Ack Failure b = 2 " + sb.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPOutgoingConnector.java`
#### Snippet
```java
            while (c != '\n');
            if (b == 1) { // error
                logger.error("Check Ack Failure b = 1 " + sb.toString());
            }
            if (b == 2) { // fatal error
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPOutgoingConnector.java`
#### Snippet
```java
            }
            if (b == 2) { // fatal error
                logger.error("Check Ack Failure b = 2 " + sb.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
            String asStr = mapper.writeValueAsString(transferState);
            if (agentRequestId == null) {
                kvClient.putValue(TRANSFER_STATE_PATH + transferId + "/" + UUID.randomUUID().toString(), asStr);
            } else {
                kvClient.putValue(TRANSFER_STATE_PATH + transferId + "/" + agentRequestId + "/" + UUID.randomUUID().toString(), asStr);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
                kvClient.putValue(TRANSFER_STATE_PATH + transferId + "/" + UUID.randomUUID().toString(), asStr);
            } else {
                kvClient.putValue(TRANSFER_STATE_PATH + transferId + "/" + agentRequestId + "/" + UUID.randomUUID().toString(), asStr);
            }
            logger.info("Saved transfer status " + asStr);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/EC2AgentSpawner.java`
#### Snippet
```java
                if (availableKeyPair.isEmpty()) {
                    logger.info("Creating Key pair");
                    keyName = keyNamePrefix + UUID.randomUUID().toString();
                    CreateKeyPairRequest createKeyPairRequest = new CreateKeyPairRequest();

```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `TransferInfo` may be 'static'
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/AgentOrchestrator.java`
#### Snippet
```java
    private final int SPAWNER_MAX_IDLE_SECONDS = 30;

    private class TransferInfo {
        private final String transferId;
        private final AgentTransferRequest agentTransferRequest;
```

## RuleId[ruleID=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
                Set<String> pendingFiles = processedTransferOp.get().getEndpointPathsList()
                        .stream().map(ep -> mftConsulClient.getEndpointPathHash(ep))
                        .filter(key -> !completedFiles.contains(key) && !failedFiles.contains(key)).collect(Collectors.toSet());

                stateBuilder.addAllCompleted(completedFiles);
```

### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
                Set<String> pendingFiles = processedTransferOp.get().getEndpointPathsList()
                        .stream().map(ep -> mftConsulClient.getEndpointPathHash(ep))
                        .filter(key -> !completedFiles.contains(key) && !failedFiles.contains(key)).collect(Collectors.toSet());

                stateBuilder.addAllCompleted(completedFiles);
```

## RuleId[ruleID=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `requestStr` declared in one 'switch' branch and used in another
in `agent/service/src/main/java/org/apache/airavata/mft/agent/rpc/RPCParser.java`
#### Snippet
```java
        switch (request.getMethod()) {
            case "getResourceMetadata":
                String requestStr = request.getParameters().get("request");

                GetResourceMetadataRequest.Builder directResourceMetadataReq = GetResourceMetadataRequest.newBuilder();
```

### SwitchStatementWithConfusingDeclaration
Local variable `directResourceMetadataReq` declared in one 'switch' branch and used in another
in `agent/service/src/main/java/org/apache/airavata/mft/agent/rpc/RPCParser.java`
#### Snippet
```java
                String requestStr = request.getParameters().get("request");

                GetResourceMetadataRequest.Builder directResourceMetadataReq = GetResourceMetadataRequest.newBuilder();
                JsonFormat.parser().merge(requestStr, directResourceMetadataReq);
                GetResourceMetadataRequest req = directResourceMetadataReq.build();
```

### SwitchStatementWithConfusingDeclaration
Local variable `req` declared in one 'switch' branch and used in another
in `agent/service/src/main/java/org/apache/airavata/mft/agent/rpc/RPCParser.java`
#### Snippet
```java
                GetResourceMetadataRequest.Builder directResourceMetadataReq = GetResourceMetadataRequest.newBuilder();
                JsonFormat.parser().merge(requestStr, directResourceMetadataReq);
                GetResourceMetadataRequest req = directResourceMetadataReq.build();

                Optional<MetadataCollector> metadataCollectorOptional = MetadataCollectorResolver.resolveMetadataCollector(req.getStorage().getStorageCase().name());
```

### SwitchStatementWithConfusingDeclaration
Local variable `metadataCollectorOptional` declared in one 'switch' branch and used in another
in `agent/service/src/main/java/org/apache/airavata/mft/agent/rpc/RPCParser.java`
#### Snippet
```java
                GetResourceMetadataRequest req = directResourceMetadataReq.build();

                Optional<MetadataCollector> metadataCollectorOptional = MetadataCollectorResolver.resolveMetadataCollector(req.getStorage().getStorageCase().name());
                if (metadataCollectorOptional.isPresent()) {
                    MetadataCollector metadataCollector = metadataCollectorOptional.get();
```

### SwitchStatementWithConfusingDeclaration
Local variable `storages` declared in one 'switch' branch and used in another
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/SQLResourceBackend.java`
#### Snippet
```java
                break;
            case STORAGENAME:
                List<ResolveStorageEntity> storages = resolveStorageRepository.getByStorageName(request.getStorageName());
                storages.forEach(st -> {
                    StorageListEntry.Builder entry = StorageListEntry.newBuilder();
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super T`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/AgentUtil.java`
#### Snippet
```java

    public static <T, U> BiConsumer<T, U> throwingBiConsumerWrapper(
            ThrowingBiConsumer<T, U, Exception> throwingBiConsumer) {

        return (i, j) -> {
```

### BoundedWildcard
Can generalize to `? super U`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/AgentUtil.java`
#### Snippet
```java

    public static <T, U> BiConsumer<T, U> throwingBiConsumerWrapper(
            ThrowingBiConsumer<T, U, Exception> throwingBiConsumer) {

        return (i, j) -> {
```

### BoundedWildcard
Can generalize to `? super T`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/AgentUtil.java`
#### Snippet
```java
    }
    public static <T> Consumer<T> throwingConsumerWrapper(
            ThrowingConsumer<T, Exception> throwingConsumer) {

        return i -> {
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final private`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/http/HttpTransferRequestsStore.java`
#### Snippet
```java
    final private Map<String, AgentHttpDownloadData> uploadRequestStore = new ConcurrentHashMap<>();

    final private ScheduledExecutorService monitor = Executors.newSingleThreadScheduledExecutor();
    private long entryExpiryTimeMS = 300 * 1000;

```

### MissortedModifiers
Missorted modifiers `final private`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/http/HttpTransferRequestsStore.java`
#### Snippet
```java

    final private Map<String, AgentHttpDownloadData> downloadRequestStore = new ConcurrentHashMap<>();
    final private Map<String, AgentHttpDownloadData> uploadRequestStore = new ConcurrentHashMap<>();

    final private ScheduledExecutorService monitor = Executors.newSingleThreadScheduledExecutor();
```

### MissortedModifiers
Missorted modifiers `final private`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/http/HttpTransferRequestsStore.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(HttpTransferRequestsStore.class);

    final private Map<String, AgentHttpDownloadData> downloadRequestStore = new ConcurrentHashMap<>();
    final private Map<String, AgentHttpDownloadData> uploadRequestStore = new ConcurrentHashMap<>();

```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java

        ResourceMetadata.Builder resourceBuilder = ResourceMetadata.newBuilder();
        if ("".equals(resourcePath)) {
            DirectoryMetadata.Builder rootDirBuilder = DirectoryMetadata.newBuilder();

```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java

            // read '0644 '
            in.read(buf, 0, 5);

            long filesize = 0L;
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
            String file = null;
            for (int i = 0; ; i++) {
                in.read(buf, i, 1);
                if (buf[i] == (byte) 0x0a) {
                    file = new String(buf, 0, i);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransportMediator.java`
#### Snippet
```java
                    downloader.downloadChunk(chunkIdx, startPos, endPos, tempFile);
                    uploader.uploadChunk(chunkIdx, startPos, endPos, tempFile);
                    new File(tempFile).delete();
                }
                return chunkIdx;
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/odata/ODataRemoteSubCommand.java`
#### Snippet
```java
    @CommandLine.Command(name = "list")
    void listS3Resource() {
        System.out.println("Listing S3 Resource");
        MFTApiClient mftApiClient = MFTApiClient.MFTApiClientBuilder.newBuilder().build();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/transfer/SubmitTransferSubCommand.java`
#### Snippet
```java
    @Override
    public Integer call() throws Exception {
        System.out.println("Transferring data from " + sourceStorageId + " to " + destinationStorageId);
        MFTApiClient mftApiClient = MFTApiClient.MFTApiClientBuilder.newBuilder().build();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/transfer/SubmitTransferSubCommand.java`
#### Snippet
```java

        if (sourceSecretForStorage.getError() != Error.UNRECOGNIZED) {
            System.out.println("Errored while fetching credentials for source storage " + sourceStorageId
                    + ". Error: " + sourceSecretForStorage.getError());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/transfer/SubmitTransferSubCommand.java`
#### Snippet
```java

        if (destSecretForStorage.getError() != Error.UNRECOGNIZED) {
            System.out.println("Errored while fetching credentials for destination storage " + sourceStorageId
                    + ". Error: " + destSecretForStorage.getError());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/transfer/SubmitTransferSubCommand.java`
#### Snippet
```java
                        .setDestinationPath(destinationPath).build()).build());

        System.out.println("Submitted Transfer " + transferResp.getTransferId());
        return 0;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/gcs/GCSRemoteSubCommand.java`
#### Snippet
```java
    void deleteGCSResource( @CommandLine.Parameters( index = "0" ) String resourceId )
    {
        System.out.println( "Deleting GCS Resource " + resourceId );
        MFTApiClient mftApiClient = MFTApiClient.MFTApiClientBuilder.newBuilder().build();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/gcs/GCSRemoteSubCommand.java`
#### Snippet
```java
        GCSStorageDeleteResponse gcsStorageDeleteResponse = mftApiClient.getStorageServiceClient().gcs()
                .deleteGCSStorage( GCSStorageDeleteRequest.newBuilder().setStorageId( resourceId ).build() );
        System.out.println( "Delete GCS Resource status : " + gcsStorageDeleteResponse.getStatus() );

    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/gcs/GCSRemoteSubCommand.java`
#### Snippet
```java
    void getGSCResource( @CommandLine.Parameters( index = "0" ) String resourceId )
    {
        System.out.println( "Getting GCS Resource " + resourceId );
        MFTApiClient mftApiClient = MFTApiClient.MFTApiClientBuilder.newBuilder().build();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/gcs/GCSRemoteSubCommand.java`
#### Snippet
```java
    void listS3Resource()
    {
        System.out.println( "Listing GSC Resource" );
        MFTApiClient mftApiClient = MFTApiClient.MFTApiClientBuilder.newBuilder().build();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/gcs/GCSAddSubCommand.java`
#### Snippet
```java
                        setAuthzToken( authToken ).build() );

        System.out.println( "Created the gcs secret " + gcsSecret.getSecretId() );

        GCSStorageServiceGrpc.GCSStorageServiceBlockingStub gcsStorageClient =
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/gcs/GCSAddSubCommand.java`
#### Snippet
```java
                .setBucketName( bucket )
                .setName( name ).build() );
        System.out.println( "Created gcs storage " + gcsStorage.getStorageId() );

        StorageCommonServiceGrpc.StorageCommonServiceBlockingStub commonClient = mftApiClient.getStorageServiceClient().common();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/gcs/GCSAddSubCommand.java`
#### Snippet
```java
                .setStorageType(StorageType.GCS).build());

        System.out.println( "Storage Id " + gcsStorage.getStorageId() );

        return 0;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/swift/SwiftAddSubCommand.java`
#### Snippet
```java
                        .setDomainId(domainId).build()).build());

        System.out.println("Created the swift secret " + swiftSecret.getSecretId());

        SwiftStorage swiftStorage = mftApiClient.getStorageServiceClient().swift().createSwiftStorage(SwiftStorageCreateRequest.newBuilder()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/swift/SwiftAddSubCommand.java`
#### Snippet
```java
                .setRegion(region).build());

        System.out.println("Created swift storage " + swiftStorage.getStorageId());

        StorageCommonServiceGrpc.StorageCommonServiceBlockingStub commonClient = mftApiClient.getStorageServiceClient().common();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/swift/SwiftAddSubCommand.java`
#### Snippet
```java
                .setStorageType(StorageType.SWIFT).build());

        System.out.println("Successfully added Swift remote endpoint");

        return 0;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/odata/ODataRemoteAddSubCommand.java`
#### Snippet
```java
                .setAuthzToken(authToken).setPassword(password).setUserName(userName).build());

        System.out.println("Created the OData secret " + oDataSecret.getSecretId());

        ODataStorage oDataStorage = mftApiClient.getStorageServiceClient().odata().createODataStorage(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/odata/ODataRemoteAddSubCommand.java`
#### Snippet
```java
                ODataStorageCreateRequest.newBuilder().setName(remoteName).setBaseUrl(baseURL).build());

        System.out.println("Created OData storage " + oDataStorage.getStorageId());

        StorageCommonServiceGrpc.StorageCommonServiceBlockingStub commonStorageClient = mftApiClient.getStorageServiceClient().common();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/odata/ODataRemoteAddSubCommand.java`
#### Snippet
```java
                .setStorageType(StorageType.ODATA).build());

        System.out.println("Successfully added OData remote endpoint");

        return 0;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/s3/storage/S3StorageSubCommand.java`
#### Snippet
```java
    @CommandLine.Command(name = "list")
    void listS3Resource() {
        System.out.println("Listing S3 Resource");
        MFTApiClient mftApiClient = MFTApiClient.MFTApiClientBuilder.newBuilder().build();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/s3/storage/S3StorageSubCommand.java`
#### Snippet
```java
    @CommandLine.Command(name = "delete")
    void deleteS3Resource(@CommandLine.Parameters(index = "0") String resourceId) {
        System.out.println("Deleting S3 Resource " + resourceId);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/s3/storage/S3StorageSubCommand.java`
#### Snippet
```java
    @CommandLine.Command(name = "get")
    void getS3Resource(@CommandLine.Parameters(index = "0") String resourceId) {
        System.out.println("Getting S3 Resource " + resourceId);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `transport/odata-transport/src/main/java/org/apache/airavata/mft/transport/odata/ODataMetadataCollector.java`
#### Snippet
```java
            doc.getDocumentElement().normalize();

            System.out.print("Root element: ");
            System.out.println(doc.getDocumentElement().getNodeName());
            NodeList properties = doc.getElementsByTagName("m:properties");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `transport/odata-transport/src/main/java/org/apache/airavata/mft/transport/odata/ODataMetadataCollector.java`
#### Snippet
```java

            System.out.print("Root element: ");
            System.out.println(doc.getDocumentElement().getNodeName());
            NodeList properties = doc.getElementsByTagName("m:properties");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/s3/storage/S3StorageAddSubCommand.java`
#### Snippet
```java
                .setStorageType(StorageType.S3).build());

        System.out.println("Storage Id " + s3Storage.getStorageId());
        return 0;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/CommandLineUtil.java`
#### Snippet
```java
        for (String[] row : content) {
            for (int i = 0; i < columnWidths.length; i++) {
                System.out.print("|");
                for (int loc = 0; loc < columnWidths[i]; loc++) {
                    if (row[i].length() > loc) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/CommandLineUtil.java`
#### Snippet
```java
                for (int loc = 0; loc < columnWidths[i]; loc++) {
                    if (row[i].length() > loc) {
                        System.out.print(row[i].charAt(loc));
                    } else {
                        System.out.print(" ");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/CommandLineUtil.java`
#### Snippet
```java
                        System.out.print(row[i].charAt(loc));
                    } else {
                        System.out.print(" ");
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `command-line/src/main/java/org/apache/airavata/mft/command/line/CommandLineUtil.java`
#### Snippet
```java
                }
            }
            System.out.println("|");
        }
    }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `transport/gcp-transport/src/main/java/org/apache/airavata/mft/transport/gcp/GCSUtil.java`
#### Snippet
```java
public class GCSUtil {
    static PrivateKey getPrivateKey(String privateKeyContent) throws Exception {
        privateKeyContent = privateKeyContent.replaceAll("\\n", "").replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "");
        KeyFactory kf = KeyFactory.getInstance("RSA");

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/AppConfig.java`
#### Snippet
```java
    String consulHost;

    @org.springframework.beans.factory.annotation.Value("${consul.port}")
    Integer consulPort;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/AppConfig.java`
#### Snippet
```java
public class AppConfig {

    @org.springframework.beans.factory.annotation.Value("${consul.host}")
    String consulHost;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java
    private TransportMediator mediator;

    @org.springframework.beans.factory.annotation.Value("${agent.concurrent.chunked.threads}")
    private int concurrentChunkedThreads;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java
    private boolean doChunkStream;

    @org.springframework.beans.factory.annotation.Value("${agent.temp.data.dir}")
    private String tempDataDir = "/tmp";

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java
    private int concurrentChunkedThreads;

    @org.springframework.beans.factory.annotation.Value("${agent.chunk.size}")
    private int chunkedSize;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java
    private int chunkedSize;

    @org.springframework.beans.factory.annotation.Value("${agent.chunk.streaming.enabled}")
    private boolean doChunkStream;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java
    private final AtomicLong totalPendingTransfers = new AtomicLong(0);

    @org.springframework.beans.factory.annotation.Value("${agent.concurrent.transfers}")
    private int concurrentTransfers;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/MFTAgent.java`
#### Snippet
```java
    private Integer agentHttpPort;

    @org.springframework.beans.factory.annotation.Value("${agent.https.enabled}")
    private boolean agentHttpsEnabled;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/MFTAgent.java`
#### Snippet
```java
    private String agentId;

    @org.springframework.beans.factory.annotation.Value("${agent.host}")
    private String agentHost;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/MFTAgent.java`
#### Snippet
```java
    private String agentHost;

    @org.springframework.beans.factory.annotation.Value("${agent.http.port}")
    private Integer agentHttpPort;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/MFTAgent.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(MFTAgent.class);

    @org.springframework.beans.factory.annotation.Value("${agent.id}")
    private String agentId;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
    private String secretServiceHost;

    @org.springframework.beans.factory.annotation.Value("${secret.service.port}")
    private int secretServicePort;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
    private SyncRPCClient agentRPCClient;

    @org.springframework.beans.factory.annotation.Value("${resource.service.host}")
    private String resourceServiceHost;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
    private int resourceServicePort;

    @org.springframework.beans.factory.annotation.Value("${secret.service.host}")
    private String secretServiceHost;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
    private String resourceServiceHost;

    @org.springframework.beans.factory.annotation.Value("${resource.service.port}")
    private int resourceServicePort;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPTransportUtil.java`
#### Snippet
```java
            jsch.addIdentity(UUID.randomUUID().toString(), pvtKey, pubKey, passphrase);

            Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");

```

### UnnecessaryFullyQualifiedName
Qualifier `com.dropbox.core.v2.files` is unnecessary, and can be replaced with an import
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java

            entryMetadatas.forEach(entryMetadata -> {
                if (entryMetadata instanceof com.dropbox.core.v2.files.FileMetadata) {
                    com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) entryMetadata;
                    FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.dropbox.core.v2.files` is unnecessary, and can be replaced with an import
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
            entryMetadatas.forEach(entryMetadata -> {
                if (entryMetadata instanceof com.dropbox.core.v2.files.FileMetadata) {
                    com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) entryMetadata;
                    FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
                    fileBuilder.setResourceSize(fileMetadata.getSize());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.dropbox.core.v2.files` is unnecessary, and can be replaced with an import
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
            entryMetadatas.forEach(entryMetadata -> {
                if (entryMetadata instanceof com.dropbox.core.v2.files.FileMetadata) {
                    com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) entryMetadata;
                    FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
                    fileBuilder.setResourceSize(fileMetadata.getSize());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.dropbox.core.v2.files` is unnecessary, and can be replaced with an import
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
        } else {
            Metadata entryMetadata = dbxClientV2.files().getMetadata(resourcePath);
            if (entryMetadata instanceof com.dropbox.core.v2.files.FileMetadata) {
                com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) entryMetadata;
                FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.dropbox.core.v2.files` is unnecessary, and can be replaced with an import
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
            Metadata entryMetadata = dbxClientV2.files().getMetadata(resourcePath);
            if (entryMetadata instanceof com.dropbox.core.v2.files.FileMetadata) {
                com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) entryMetadata;
                FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
                fileBuilder.setResourceSize(fileMetadata.getSize());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.dropbox.core.v2.files` is unnecessary, and can be replaced with an import
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
            Metadata entryMetadata = dbxClientV2.files().getMetadata(resourcePath);
            if (entryMetadata instanceof com.dropbox.core.v2.files.FileMetadata) {
                com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) entryMetadata;
                FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
                fileBuilder.setResourceSize(fileMetadata.getSize());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.dropbox.core.v2.files` is unnecessary, and can be replaced with an import
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java

                entryMetadatas.forEach(em -> {
                    if (em instanceof com.dropbox.core.v2.files.FileMetadata) {
                        com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) em;
                        FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.dropbox.core.v2.files` is unnecessary, and can be replaced with an import
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
                entryMetadatas.forEach(em -> {
                    if (em instanceof com.dropbox.core.v2.files.FileMetadata) {
                        com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) em;
                        FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
                        fileBuilder.setResourceSize(fileMetadata.getSize());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.dropbox.core.v2.files` is unnecessary, and can be replaced with an import
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
                entryMetadatas.forEach(em -> {
                    if (em instanceof com.dropbox.core.v2.files.FileMetadata) {
                        com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) em;
                        FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
                        fileBuilder.setResourceSize(fileMetadata.getSize());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java
        File targetFile = new File(downloadFile);

        java.nio.file.Files.copy(
                inputStream,
                targetFile.toPath(),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `api/service/src/main/java/org/apache/airavata/mft/api/AppConfig.java`
#### Snippet
```java
    public String consulHost;

    @org.springframework.beans.factory.annotation.Value("${consul.port}")
    public Integer consulPort;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `api/service/src/main/java/org/apache/airavata/mft/api/AppConfig.java`
#### Snippet
```java
public class AppConfig {

    @org.springframework.beans.factory.annotation.Value("${consul.host}")
    public String consulHost;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `api/service/src/main/java/org/apache/airavata/mft/api/AppConfig.java`
#### Snippet
```java
    public Integer consulPort;

    @org.springframework.beans.factory.annotation.Value("${api.id}")
    public String apiId;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `controller/src/main/java/org/apache/airavata/mft/controller/AppConfig.java`
#### Snippet
```java
    private int resourceServicePort;

    @org.springframework.beans.factory.annotation.Value("${secret.service.host}")
    private String secretServiceHost;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `controller/src/main/java/org/apache/airavata/mft/controller/AppConfig.java`
#### Snippet
```java
    String consulHost;

    @org.springframework.beans.factory.annotation.Value("${consul.port}")
    Integer consulPort;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `controller/src/main/java/org/apache/airavata/mft/controller/AppConfig.java`
#### Snippet
```java
    Integer consulPort;

    @org.springframework.beans.factory.annotation.Value("${resource.service.host}")
    private String resourceServiceHost;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `controller/src/main/java/org/apache/airavata/mft/controller/AppConfig.java`
#### Snippet
```java
    private String secretServiceHost;

    @org.springframework.beans.factory.annotation.Value("${secret.service.port}")
    private int secretServicePort;
    @Bean
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `controller/src/main/java/org/apache/airavata/mft/controller/AppConfig.java`
#### Snippet
```java
    private String resourceServiceHost;

    @org.springframework.beans.factory.annotation.Value("${resource.service.port}")
    private int resourceServicePort;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `controller/src/main/java/org/apache/airavata/mft/controller/AppConfig.java`
#### Snippet
```java
public class AppConfig {

    @org.springframework.beans.factory.annotation.Value("${consul.host}")
    String consulHost;

```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.function.Consumer;`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TransferOrchestrator {
```

### UNUSED_IMPORT
Unused import `import com.orbitz.consul.option.PutOptions;`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java
import com.orbitz.consul.model.session.ImmutableSession;
import com.orbitz.consul.model.session.SessionCreatedResponse;
import com.orbitz.consul.option.PutOptions;
import org.apache.airavata.mft.admin.MFTConsulClient;
import org.apache.airavata.mft.admin.MFTConsulClientException;
```

### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `api/client/src/main/java/org/apache/airavata/mft/api/client/MFTApiClient.java`
#### Snippet
```java
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `api/client/src/main/java/org/apache/airavata/mft/api/client/MFTApiClient.java`
#### Snippet
```java
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.ConcurrentHashMap;`
in `api/client/src/main/java/org/apache/airavata/mft/api/client/MFTApiClient.java`
#### Snippet
```java
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MFTApiClient implements Closeable {
```

### UNUSED_IMPORT
Unused import `import org.apache.airavata.mft.command.line.sub.swift.SwiftRemoteSubCommand;`
in `command-line/src/main/java/org/apache/airavata/mft/command/line/sub/odata/ODataSubCommand.java`
#### Snippet
```java
package org.apache.airavata.mft.command.line.sub.odata;

import org.apache.airavata.mft.command.line.sub.swift.SwiftRemoteSubCommand;
import picocli.CommandLine;

```

### UNUSED_IMPORT
Unused import `import com.google.protobuf.util.JsonFormat;`
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
import com.google.common.net.HostAndPort;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.orbitz.consul.Consul;
import com.orbitz.consul.ConsulException;
```

### UNUSED_IMPORT
Unused import `import org.apache.airavata.mft.controller.spawner.AgentSpawner;`
in `controller/src/main/java/org/apache/airavata/mft/controller/TransferDispatcher.java`
#### Snippet
```java
import org.apache.airavata.mft.api.service.TransferApiRequest;
import org.apache.airavata.mft.controller.spawner.AgentOrchestrator;
import org.apache.airavata.mft.controller.spawner.AgentSpawner;
import org.apache.airavata.mft.controller.spawner.SpawnerSelector;
import org.apache.commons.lang3.exception.ExceptionUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.airavata.mft.controller.spawner.SpawnerSelector;`
in `controller/src/main/java/org/apache/airavata/mft/controller/TransferDispatcher.java`
#### Snippet
```java
import org.apache.airavata.mft.controller.spawner.AgentOrchestrator;
import org.apache.airavata.mft.controller.spawner.AgentSpawner;
import org.apache.airavata.mft.controller.spawner.SpawnerSelector;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.tuple.Pair;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.lang3.tuple.Pair;`
in `controller/src/main/java/org/apache/airavata/mft/controller/TransferDispatcher.java`
#### Snippet
```java
import org.apache.airavata.mft.controller.spawner.SpawnerSelector;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.*;`
in `controller/src/main/java/org/apache/airavata/mft/controller/TransferDispatcher.java`
#### Snippet
```java

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

```

### UNUSED_IMPORT
Unused import `import org.springframework.context.annotation.Primary;`
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/SQLResourceBackend.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
```

### UNUSED_IMPORT
Unused import `import org.hibernate.annotations.GenericGenerator;`
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/entity/ResolveStorageEntity.java`
#### Snippet
```java
package org.apache.airavata.mft.resource.server.backend.sql.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
```

### UNUSED_IMPORT
Unused import `import javax.persistence.GeneratedValue;`
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/entity/ResolveStorageEntity.java`
#### Snippet
```java
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

```

### UNUSED_IMPORT
Unused import `import org.apache.airavata.mft.resource.server.backend.sql.entity.S3StorageEntity;`
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/repository/AzureStorageRepository.java`
#### Snippet
```java

import org.apache.airavata.mft.resource.server.backend.sql.entity.AzureStorageEntity;
import org.apache.airavata.mft.resource.server.backend.sql.entity.S3StorageEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/repository/ResolveStorageRepository.java`
#### Snippet
```java
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
```

### UNUSED_IMPORT
Unused import `import org.apache.airavata.mft.secret.server.backend.sql.entity.S3SecretEntity;`
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/sql/repository/AzureSecretRepository.java`
#### Snippet
```java

import org.apache.airavata.mft.secret.server.backend.sql.entity.AzureSecretEntity;
import org.apache.airavata.mft.secret.server.backend.sql.entity.S3SecretEntity;
import org.springframework.data.repository.CrudRepository;

```

### UNUSED_IMPORT
Unused import `import com.box.sdk.BoxFile;`
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxReceiver.java`
#### Snippet
```java

import com.box.sdk.BoxAPIConnection;
import com.box.sdk.BoxFile;
import org.apache.airavata.mft.common.AuthToken;
import org.apache.airavata.mft.core.ConnectorContext;
```

### UNUSED_IMPORT
Unused import `import java.io.OutputStream;`
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxReceiver.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.OutputStream;


```

### UNUSED_IMPORT
Unused import `import com.box.sdk.BoxFile;`
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxSender.java`
#### Snippet
```java

import com.box.sdk.BoxAPIConnection;
import com.box.sdk.BoxFile;
import org.apache.airavata.mft.common.AuthToken;
import org.apache.airavata.mft.core.ConnectorContext;
```

### UNUSED_IMPORT
Unused import `import com.dropbox.core.DbxRequestConfig;`
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxReceiver.java`
#### Snippet
```java
package org.apache.airavata.mft.transport.dropbox;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import org.apache.airavata.mft.common.AuthToken;
```

### UNUSED_IMPORT
Unused import `import java.io.*;`
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxReceiver.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.*;

public class DropboxReceiver implements Connector {
```

### UNUSED_IMPORT
Unused import `import com.dropbox.core.DbxRequestConfig;`
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxSender.java`
#### Snippet
```java
package org.apache.airavata.mft.transport.dropbox;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
```

### UNUSED_IMPORT
Unused import `import com.dropbox.core.v2.files.FileMetadata;`
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxSender.java`
#### Snippet
```java
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.WriteMode;
import org.apache.airavata.mft.common.AuthToken;
```

### UNUSED_IMPORT
Unused import `import com.dropbox.core.v2.files.WriteMode;`
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxSender.java`
#### Snippet
```java
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.WriteMode;
import org.apache.airavata.mft.common.AuthToken;
import org.apache.airavata.mft.core.ConnectorContext;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPReceiver.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.OutputStream;

```

### UNUSED_IMPORT
Unused import `import java.io.OutputStream;`
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPReceiver.java`
#### Snippet
```java

import java.io.InputStream;
import java.io.OutputStream;

public class FTPReceiver implements Connector {
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPSender.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.OutputStream;

```

### UNUSED_IMPORT
Unused import `import java.io.OutputStream;`
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPSender.java`
#### Snippet
```java

import java.io.InputStream;
import java.io.OutputStream;

public class FTPSender implements Connector {
```

### UNUSED_IMPORT
Unused import `import java.nio.channels.Channel;`
in `transport/gcp-transport/src/main/java/org/apache/airavata/mft/transport/gcp/GCSOutgoingStreamingConnector.java`
#### Snippet
```java

import java.io.OutputStream;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.security.PrivateKey;
```

### UNUSED_IMPORT
Unused import `import java.io.*;`
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalReceiver.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.*;

public class LocalReceiver implements Connector {
```

### UNUSED_IMPORT
Unused import `import java.io.*;`
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalSender.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.*;

public class LocalSender implements Connector {
```

### UNUSED_IMPORT
Unused import `import java.io.ByteArrayInputStream;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3IncomingConnector.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransportMediator.java`
#### Snippet
```java
                    int n;
                    byte[] buffer = new byte[128 * 1024];
                    for (count = 0L; -1 != (n = inputStream.read(buffer)); count += (long) n) {
                        outputStream.write(buffer, 0, n);
                        countAtomic.set(count);
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/service/src/main/java/org/apache/airavata/mft/agent/http/HttpServerHandler.java`
#### Snippet
```java
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        if (ctx.channel().isActive()) {
            sendError(ctx, INTERNAL_SERVER_ERROR);
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AgentSpawner()` of an abstract class should not be declared 'public'
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/AgentSpawner.java`
#### Snippet
```java
    protected StorageWrapper storageWrapper;
    protected SecretWrapper secretWrapper;
    public AgentSpawner(StorageWrapper storageWrapper, SecretWrapper secretWrapper) {
        this.secretWrapper = secretWrapper;
        this.storageWrapper = storageWrapper;
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/handler/BoxServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(secret);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No Box Secret with id " + request.getSecretId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/handler/S3ServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(secret);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No S3 Secret with id " + request.getSecretId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/handler/SCPServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(secret);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No SCP Secret with id " + request.getSecretId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/handler/GCSServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(secret);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No GCS Secret with id " + request.getSecretId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/handler/SwiftServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(secret);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No Swift Secret with id " + request.getSecretId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/handler/AzureServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(secret);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No Azure Secret with id " + request.getSecretId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/ODataServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(resource);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No OData storage with id " + request.getStorageId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/GCSServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(resource);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No GCS storage with id " + request.getStorageId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/S3ServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(resource);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No S3 storage with id " + request.getStorageId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/LocalServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(resource);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No Local storage with id " + request.getStorageId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/SCPServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(storage);
                responseObserver.onCompleted();
            }, () -> {

                responseObserver.onError(Status.INTERNAL
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/SwiftStorageHandler.java`
#### Snippet
```java
                responseObserver.onNext(resource);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No Swift storage with id " + request.getStorageId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/DropboxServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(resource);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No dropbox storage with id " + request.getStorageId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/BoxServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(resource);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No Box storage with id " + request.getStorageId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/SyncRPCClient.java`
#### Snippet
```java

    private void listenToResponses() {
        syncResponseCacheListener = newValues -> {
            newValues.values().forEach(value -> {
                Optional<String> decodedValue = value.getValueAsString();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/handler/DropboxServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(secret);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No Dropbox Secret with id " + request.getSecretId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/handler/ODataServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(secret);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No OData Secret with id " + request.getSecretId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/AzureServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(resource);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No Azure storage with id " + request.getStorageId())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java
    private void acceptTransferRequests() {

        transferCacheListener = newValues -> {
            newValues.values().forEach(value -> {
                Optional<byte[]> decodedValue = value.getValueAsBytes();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java

    private void acceptRPCRequests() {
        rpcCacheListener = newValues -> {
            newValues.values().forEach(value -> {
                Optional<String> decodedValue = value.getValueAsString();
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `agent/service/src/main/java/org/apache/airavata/mft/agent/MFTAgent.java`
#### Snippet
```java
    private HttpTransferRequestsStore transferRequestsStore;

    public void init() {

    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxMetadataCollector.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(BoxMetadataCollector.class);

    boolean initialized = false;

    private BoxStorage boxStorage;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPMetadataCollector.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(SCPMetadataCollector.class);

    boolean initialized = false;
    private SCPStorage scpStorage;
    private SCPSecret scpSecret;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transport/gcp-transport/src/main/java/org/apache/airavata/mft/transport/gcp/GCSMetadataCollector.java`
#### Snippet
```java
public class GCSMetadataCollector implements MetadataCollector {

    boolean initialized = false;

    private GCSStorage gcsStorage;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalMetadataCollector.java`
#### Snippet
```java
    private String secretServiceHost;
    private int secretServicePort;
    boolean initialized = false;

    private LocalStorage localStorage;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
    boolean readBuffer1 = true;
    boolean doneWrite = false;
    int readPoint = 0;

    boolean barrierPassed = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java

    boolean readBuffer1 = true;
    boolean doneWrite = false;
    int readPoint = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
     */
    private int buf1Remain = 0;
    private int buf2Remain = 0;

    private ReentrantLock buffer1Lock = new ReentrantLock();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
    increases the count for writes
     */
    private int buf1Remain = 0;
    private int buf2Remain = 0;

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
    boolean barrierPassed = false;

    private long processedBytes = 0L;

    public class DSBOutputStream extends OutputStream {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
    int readPoint = 0;

    boolean barrierPassed = false;

    private long processedBytes = 0L;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3MetadataCollector.java`
#### Snippet
```java
public class S3MetadataCollector implements MetadataCollector {

    boolean initialized = false;
    private S3Storage s3Storage;
    private S3Secret s3Secret;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transport/azure-transport/src/main/java/org/apache/airavata/mft/transport/azure/AzureMetadataCollector.java`
#### Snippet
```java
public class AzureMetadataCollector implements MetadataCollector {

    boolean initialized = false;

    private AzureStorage azureStorage;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
    private DropboxSecret dropboxSecret;

    boolean initialized = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/airavata/mft/core/CircularStreamingBuffer.java`
#### Snippet
```java
    private ArrayBlockingQueue<Byte> buffer = new ArrayBlockingQueue<>(bufferSize);

    private boolean osClosed = false;
    private Semaphore readSem = new Semaphore(0);

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java

public class SwiftMetadataCollector implements MetadataCollector {
    boolean initialized = false;
    private SwiftStorage swiftStorage;
    private SwiftSecret swiftSecret;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPMetadataCollector.java`
#### Snippet
```java

    private static final Logger logger = LoggerFactory.getLogger(FTPMetadataCollector.class);
    private boolean initialized = false;
    private FTPStorage ftpStorage;
    private FTPSecret ftpSecret;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `privateKeyContent`
in `transport/gcp-transport/src/main/java/org/apache/airavata/mft/transport/gcp/GCSUtil.java`
#### Snippet
```java
public class GCSUtil {
    static PrivateKey getPrivateKey(String privateKeyContent) throws Exception {
        privateKeyContent = privateKeyContent.replaceAll("\\n", "").replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "");
        KeyFactory kf = KeyFactory.getInstance("RSA");

```

### AssignmentToMethodParameter
Assignment to method parameter `targetAgent`
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
                throw new Exception("No agent is available to perform the operation");
            }
            targetAgent = liveAgentIds.get(0);
            logger.info("Using agent {} for processing the operation", targetAgent);
        } else {
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
            return new LimitInputStream(in, filesize);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/SSHProvider.java`
#### Snippet
```java
            @Override
            public List<String> findExistingAlgorithms(String s, int i) {
                return null;
            }
        });
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `sortedStates` is redundant
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
            allStates.add(transferState);
        }
        List<TransferState> sortedStates = allStates.stream().sorted((o1, o2) ->
                (o1.getUpdateTimeMils() - o2.getUpdateTimeMils()) < 0 ? -1 :
                        (o1.getUpdateTimeMils() - o2.getUpdateTimeMils()) == 0 ? 0 : 1).collect(Collectors.toList());
```

### UnnecessaryLocalVariable
Local variable `lastStatusOp` is redundant
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
            List<TransferState> states = getTransferStates(transferId);

            Optional<TransferState> lastStatusOp = states.stream().min((o1, o2) -> {
                if (o1.getUpdateTimeMils() == o2.getUpdateTimeMils()) {
                    return 0;
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java

        if (b == 1 || b == 2) {
            StringBuffer sb = new StringBuffer();
            int c;
            do {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPOutgoingConnector.java`
#### Snippet
```java

        if (b == 1 || b == 2) {
            StringBuffer sb = new StringBuffer();
            int c;
            do {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPMetadataCollector.java`
#### Snippet
```java
            @Override
            public char[] getResponse(String prompt, boolean echo) {
                return new char[0];
            }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/SSHProvider.java`
#### Snippet
```java
            @Override
            public char[] getResponse(String prompt, boolean echo) {
                return new char[0];
            }

```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransportMediator.java`
#### Snippet
```java
                        while (true) {
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                // Ignore
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `file` initializer `null` is redundant
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
            }

            String file = null;
            for (int i = 0; ; i++) {
                in.read(buf, i, 1);
```

### UnusedAssignment
Variable `boxFile` initializer `null` is redundant
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxMetadataCollector.java`
#### Snippet
```java
        BoxAPIConnection api = new BoxAPIConnection(boxSecret.getAccessToken());

        BoxFile boxFile = null;
        BoxFile.Info boxFileInfo = null;
        BoxFolder boxFolder = null;
```

### UnusedAssignment
The value `boxFolder.getInfo()` assigned to `boxFolderInfo` is never used
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxMetadataCollector.java`
#### Snippet
```java
            try {
                boxFolder = new BoxFolder(api, resourcePath);
                boxFolderInfo = boxFolder.getInfo();
                isFile = false;
            } catch (BoxAPIException ex) {
```

### UnusedAssignment
Variable `tempDataDir` initializer `"/tmp"` is redundant
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransportMediator.java`
#### Snippet
```java
    private final ExecutorService monitorPool;

    private String tempDataDir = "/tmp";
    private final int chunkedSize;
    private final boolean doChunkStreaming;
```

### UnusedAssignment
Variable `builder` initializer `null` is redundant
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java
                decodedValue.ifPresent(reqBytes -> {
                    mftConsulClient.getKvClient().deleteKey(value.getKey());
                    AgentTransferRequest.Builder builder = null;
                    try {
                        builder = AgentTransferRequest.newBuilder().mergeFrom(reqBytes);
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
        for (String key: keys) {
            Optional<Value> valueOp = kvClient.getValue(key);
            String stateAsStr = valueOp.get().getValueAsString().get();
            TransferState transferState = mapper.readValue(stateAsStr, TransferState.class);
            allStates.add(transferState);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
        for (String key: keys) {
            Optional<Value> valueOp = kvClient.getValue(key);
            String stateAsStr = valueOp.get().getValueAsString().get();
            TransferState transferState = mapper.readValue(stateAsStr, TransferState.class);
            allStates.add(transferState);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
        Optional<Value> value = kvClient.getValue(TRANSFER_PROCESSED_PATH + transferId);
        if (value.isPresent()) {
            return Optional.of(TransferApiRequest.newBuilder().mergeFrom(value.get().getValueAsBytes().get()).build());
        } else {
            return Optional.empty();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
    public List<AgentInfo> getLiveAgentInfos() throws MFTConsulClientException {
        List<String> liveAgentIds = getLiveAgentIds();
        return liveAgentIds.stream().map(id -> getAgentInfo(id).get()).collect(Collectors.toList());
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
            Value absVal = value.get();
            if (absVal.getValue().isPresent()) {
                String asStr = absVal.getValueAsString().get();
                try {
                    return Optional.of(mapper.readValue(asStr, AgentInfo.class));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `controller/src/main/java/org/apache/airavata/mft/controller/MFTController.java`
#### Snippet
```java
                                    logger.info("Old transfer session found. Re scheduling to agent {}", agentId);
                                    AgentTransferRequest transferRequest = AgentTransferRequest
                                            .newBuilder().mergeFrom(v.getValueAsBytes().get()).build();
                                    mftConsulClient.commandTransferToAgent(agentId, scheduledTransfer, transferRequest);

```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `session == null` is always `false`
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
                scpSecret.getPassphrase().equals("")? null : scpSecret.getPassphrase().getBytes());

        if (session == null) {
            logger.error("Session can not be null. Make sure that SCP Receiver is properly initialized");
            throw new Exception("Session can not be null. Make sure that SCP Receiver is properly initialized");
```

### ConstantValue
Condition `ptimestamp` is always `true`
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPOutgoingConnector.java`
#### Snippet
```java

        // exec 'scp -t rfile' remotely
        String command = "scp " + (ptimestamp ? "-p" : "") + " -t " + resourcePath;
        channel = session.openChannel("exec");
        ((ChannelExec) channel).setCommand(command);
```

### ConstantValue
Condition `ptimestamp` is always `true`
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPOutgoingConnector.java`
#### Snippet
```java
        }

        if (ptimestamp) {
            command = "T" + (System.currentTimeMillis() / 1000) + " 0";
            // The access time should be sent here,
```

### ConstantValue
Condition `session == null` is always `false`
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPOutgoingConnector.java`
#### Snippet
```java
                scpSecret.getPassphrase().equals("")? null : scpSecret.getPassphrase().getBytes());

        if (session == null) {
            logger.error("Session can not be null. Make sure that SCP Receiver is properly initialized");
            throw new Exception("Session can not be null. Make sure that SCP Receiver is properly initialized");
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'replaceManifest(java.lang.String, java.util.List, java.util.Map)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.features.StaticLargeObjectApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
        }

        String etag = staticLargeObjectApi.replaceManifest(resourcePath,
                segments, new HashMap<>());

```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
                .credentials(identity, credential)
                .overrides(overrides)
                .buildApi(SwiftApi.class);

        objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
```

### UnstableApiUsage
'getObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
                .buildApi(SwiftApi.class);

        objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
        staticLargeObjectApi = swiftApi.getStaticLargeObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
    }
```

### UnstableApiUsage
'getStaticLargeObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java

        objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
        staticLargeObjectApi = swiftApi.getStaticLargeObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
    }

```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.features.StaticLargeObjectApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
    private SwiftApi swiftApi;
    private ObjectApi objectApi;
    private StaticLargeObjectApi staticLargeObjectApi;
    private String resourcePath;

```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.features.ObjectApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java

    private SwiftApi swiftApi;
    private ObjectApi objectApi;
    private StaticLargeObjectApi staticLargeObjectApi;
    private String resourcePath;
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(SwiftOutgoingConnector.class);

    private SwiftApi swiftApi;
    private ObjectApi objectApi;
    private StaticLargeObjectApi staticLargeObjectApi;
```

### UnstableApiUsage
'put(java.lang.String, org.jclouds.io.Payload)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.features.ObjectApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
    @Override
    public void uploadChunk(int chunkId, long startByte, long endByte, InputStream inputStream) throws Exception {
        String etag = objectApi.put(resourcePath + chunkId, new InputStreamPayload(inputStream));
        Segment segment = Segment.builder().etag(etag)
                .path(resourcePath + chunkId)
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java

    public MFTConsulClient(String host, int port) {
        this.client = Consul.builder().withHostAndPort(HostAndPort.fromParts(host, port)).build();
        this.kvClient = client.keyValueClient();
        this.sessionClient = client.sessionClient();
```

### UnstableApiUsage
'fromParts(java.lang.String, int)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java

    public MFTConsulClient(String host, int port) {
        this.client = Consul.builder().withHostAndPort(HostAndPort.fromParts(host, port)).build();
        this.kvClient = client.keyValueClient();
        this.sessionClient = client.sessionClient();
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java

    public MFTConsulClient(Map<String, Integer> consulHostPorts) {
        List<HostAndPort> hostAndPorts = consulHostPorts.entrySet().stream()
                .map(entry -> fromParts(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
```

### UnstableApiUsage
'fromParts(java.lang.String, int)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
    public MFTConsulClient(Map<String, Integer> consulHostPorts) {
        List<HostAndPort> hostAndPorts = consulHostPorts.entrySet().stream()
                .map(entry -> fromParts(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
        this.client = Consul.builder().withMultipleHostAndPort(hostAndPorts, 100000).build();
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.features.ObjectApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java

    private SwiftApi swiftApi;
    private ObjectApi objectApi;
    private String resourcePath;

```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java
                .credentials(identity, credential)
                .overrides(overrides)
                .buildApi(SwiftApi.class);

        objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
```

### UnstableApiUsage
'getObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java
                .buildApi(SwiftApi.class);

        objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());

    }
```

### UnstableApiUsage
'get(java.lang.String, org.jclouds.http.options.GetOptions)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.features.ObjectApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java
    @Override
    public void downloadChunk(int chunkId, long startByte, long endByte, String downloadFile) throws Exception {
        SwiftObject swiftObject = objectApi.get(
                resourcePath,
                GetOptions.Builder.range(startByte, endByte));
```

### UnstableApiUsage
'get(java.lang.String, org.jclouds.http.options.GetOptions)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.features.ObjectApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java
    public InputStream downloadChunk(int chunkId, long startByte, long endByte) throws Exception {

        SwiftObject swiftObject = objectApi.get(
                resourcePath,
                GetOptions.Builder.range(startByte, endByte));
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(SwiftIncomingConnector.class);

    private SwiftApi swiftApi;
    private ObjectApi objectApi;
    private String resourcePath;
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
    }

    private SwiftApi getSwiftApi(SwiftStorage swiftStorage, SwiftSecret swiftSecret) {
        String provider = "openstack-swift";

```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
                .credentials(identity, credential)
                .overrides(overrides)
                .buildApi(SwiftApi.class);
    }

```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        checkInitialized();

        SwiftApi swiftApi = getSwiftApi(swiftStorage, swiftSecret);

        ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.features.ObjectApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        SwiftApi swiftApi = getSwiftApi(swiftStorage, swiftSecret);

        ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());

        ResourceMetadata.Builder resourceBuilder = ResourceMetadata.newBuilder();
```

### UnstableApiUsage
'getObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        SwiftApi swiftApi = getSwiftApi(swiftStorage, swiftSecret);

        ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());

        ResourceMetadata.Builder resourceBuilder = ResourceMetadata.newBuilder();
```

### UnstableApiUsage
'list()' is declared in unstable interface 'org.jclouds.openstack.swift.v1.features.ObjectApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
            DirectoryMetadata.Builder rootDirBuilder = DirectoryMetadata.newBuilder();

            ObjectList objectList = objectApi.list();
            objectList.forEach(swiftObject -> {
                FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
```

### UnstableApiUsage
'get(java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.features.ObjectApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
            resourceBuilder.setDirectory(rootDirBuilder);
        } else {
            SwiftObject swiftObject = objectApi.get(resourcePath);

            if (swiftObject == null) {
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        checkInitialized();

        SwiftApi swiftApi = getSwiftApi(swiftStorage, swiftSecret);

        ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.features.ObjectApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        SwiftApi swiftApi = getSwiftApi(swiftStorage, swiftSecret);

        ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());

        SwiftObject swiftObject = objectApi.get(resourcePath);
```

### UnstableApiUsage
'getObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        SwiftApi swiftApi = getSwiftApi(swiftStorage, swiftSecret);

        ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());

        SwiftObject swiftObject = objectApi.get(resourcePath);
```

### UnstableApiUsage
'get(java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.features.ObjectApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());

        SwiftObject swiftObject = objectApi.get(resourcePath);

        return swiftObject != null;
```

