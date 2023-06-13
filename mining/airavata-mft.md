# airavata-mft 
 
# Bad smells
I found 353 bad smells with 100 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 85 | true |
| UNUSED_IMPORT | 53 | false |
| FieldCanBeLocal | 39 | false |
| FieldMayBeFinal | 27 | false |
| JavadocDeclaration | 15 | false |
| CommentedOutCode | 13 | false |
| DuplicatedCode | 13 | false |
| AutoCloseableResource | 11 | false |
| UnusedAssignment | 9 | false |
| UnnecessaryToStringCall | 8 | true |
| OptionalGetWithoutIsPresent | 7 | false |
| IgnoreResultOfCall | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| UnnecessarySemicolon | 5 | false |
| SwitchStatementWithConfusingDeclaration | 5 | false |
| RedundantFileCreation | 5 | false |
| EmptyFinallyBlock | 4 | false |
| ConstantValue | 4 | false |
| UnstableApiUsage | 4 | false |
| SpringBootApplicationProperties | 3 | false |
| CStyleArrayDeclaration | 3 | false |
| DuplicateExpressions | 3 | false |
| RedundantCast | 3 | false |
| JavadocReference | 2 | false |
| DoubleCheckedLocking | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| LoopStatementsThatDontLoop | 1 | false |
| DataFlowIssue | 1 | false |
| EmptyStatementBody | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| TrivialStringConcatenation | 1 | false |
| FinalStaticMethod | 1 | false |
| DanglingJavadoc | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| NullableProblems | 1 | false |
| RedundantMethodOverride | 1 | false |
| RedundantExplicitClose | 1 | false |
| BusyWait | 1 | false |
## RuleId[id=UnnecessaryModifier]
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
in `core/src/main/java/org/apache/airavata/mft/core/api/IncomingStreamingConnector.java`
#### Snippet
```java

public interface IncomingStreamingConnector extends BasicConnector {
    public InputStream fetchInputStream() throws Exception;
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
     * @param secret
     */
    public void init(StorageWrapper storage, SecretWrapper secret);

    /**
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

    public AzureStorageListResponse listAzureStorage(AzureStorageListRequest request) throws Exception;
    public Optional<AzureStorage> getAzureStorage(AzureStorageGetRequest request) throws Exception;
    public AzureStorage createAzureStorage(AzureStorageCreateRequest request) throws Exception;
    public boolean updateAzureStorage(AzureStorageUpdateRequest request) throws Exception;
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
    public boolean deleteBoxStorage(BoxStorageDeleteRequest request) throws Exception;

    public AzureStorageListResponse listAzureStorage(AzureStorageListRequest request) throws Exception;
    public Optional<AzureStorage> getAzureStorage(AzureStorageGetRequest request) throws Exception;
    public AzureStorage createAzureStorage(AzureStorageCreateRequest request) throws Exception;
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

    public void init();
    public void destroy();

    public Optional<SCPSecret> getSCPSecret(SCPSecretGetRequest request) throws Exception;
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
public interface SecretBackend {

    public void init();
    public void destroy();

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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.ConcurrentHashMap' to 'java.util.Map'
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
    private String resourcePath;

    private final Map<Integer, Segment> segmentMap = new ConcurrentHashMap();

    // Referring to https://www.mirantis.com/blog/large-objects-in-cloud-storages/
```

## RuleId[id=LoopStatementsThatDontLoop]
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `TransferApiRequest`
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java

    /**
     * Submits a {@link TransferApiRequest} to a target agent
     *
     * @param agentId Agent Id
```

### JavadocReference
Cannot resolve symbol `TransferApiRequest`
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * @param agentId Agent Id
     * @param transferRequest Target transfer request
     * @throws MFTConsulClientException If {@link TransferApiRequest} can not be delivered to consul store
     */
    public void commandTransferToAgent(String agentId, String transferId, AgentTransferRequest transferRequest)
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=UnnecessarySemicolon]
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
        V2, V3;
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

## RuleId[id=DoubleCheckedLocking]
### DoubleCheckedLocking
Double-checked locking
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3Util.java`
#### Snippet
```java

    public static synchronized S3Util getInstance() {
        if (instance == null) {
            synchronized (S3Util.class) {
                if (instance == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java

    public static synchronized SwiftUtil getInstance() {
        if (instance == null) {
            synchronized (SwiftUtil.class) {
                if (instance == null) {
```

## RuleId[id=EmptyStatementBody]
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

## RuleId[id=SpringBootApplicationProperties]
### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.allow-bean-definition-overriding'
in `standalone-service/src/main/resources/application.properties`
#### Snippet
```java
#

spring.main.allow-bean-definition-overriding=true
spring.datasource.url=jdbc:h2:~/mft_db;DB_CLOSE_ON_EXIT=FALSE;DB_CLOSE_DELAY=-1;
spring.jpa.hibernate.ddl-auto=update
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.datasource.url'
in `standalone-service/src/main/resources/application.properties`
#### Snippet
```java

spring.main.allow-bean-definition-overriding=true
spring.datasource.url=jdbc:h2:~/mft_db;DB_CLOSE_ON_EXIT=FALSE;DB_CLOSE_DELAY=-1;
spring.jpa.hibernate.ddl-auto=update

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.jpa.hibernate.ddl-auto'
in `standalone-service/src/main/resources/application.properties`
#### Snippet
```java
spring.main.allow-bean-definition-overriding=true
spring.datasource.url=jdbc:h2:~/mft_db;DB_CLOSE_ON_EXIT=FALSE;DB_CLOSE_DELAY=-1;
spring.jpa.hibernate.ddl-auto=update

consul.host=localhost
```

## RuleId[id=CStyleArrayDeclaration]
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
C-style array declaration of local variable `parts`
in `controller/src/main/java/org/apache/airavata/mft/controller/MFTController.java`
#### Snippet
```java
                    logger.info("Received state Key {} val {}", key, valAsStr);

                    String parts[] = key.split("/");
                    if (parts.length != 5) {
                        logger.error("Invalid status key {}", key);
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

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
                segments, new HashMap<>());

        //if (swiftApi != null) {
        //    swiftApi.close();
        //}
```

### CommentedOutCode
Commented out code (6 lines)
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/EC2AgentSpawner.java`
#### Snippet
```java
                        .build();

                /*logger.info("Creating AMI for MFT Agent");
                CreateImageRequest createImageRequest = new CreateImageRequest().withName("mft-agent")
                    .withDescription("AMI For MFT Agent").withInstanceId(instanceId).withNoReboot(true)
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
Commented out code (3 lines)
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java
    @Override
    public void complete() throws Exception {
        //if (swiftApi != null) {
        //    swiftApi.close();
        //}
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
Commented out code (49 lines)
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPReceiver.java`
#### Snippet
```java
        logger.info("Starting FTP receiver stream for transfer {}", context.getTransferId());

        /*
        checkInitialized();

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
Commented out code (4 lines)
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3Util.java`
#### Snippet
```java
                + s3Storage.getEndpoint() + s3Storage.getRegion();

        /*MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(longSt.getBytes());
        byte[] digest = md.digest();
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
Commented out code (28 lines)
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxSender.java`
#### Snippet
```java
    public void startStream(AuthToken authToken, String resourceId, String credentialToken, ConnectorContext context) throws Exception {

        /*
        logger.info("Starting Box Sender stream for transfer {}", context.getTransferId());
        logger.debug("Content length for transfer {} {}", context.getTransferId(), context.getMetadata().getResourceSize());
```

## RuleId[id=EmptyFinallyBlock]
### EmptyFinallyBlock
Empty `finally` block
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java

            return swiftObject != null;
        } finally {
            //swiftApi.close();
        }
```

### EmptyFinallyBlock
Empty `finally` block
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
            }
            return resourceBuilder.build();
        } finally{
            //swiftApi.close();
        }
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

### EmptyFinallyBlock
Empty `finally` block
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java


        } finally {
            //logger.info("Deleting key " + consulEntryKey);
            //mftConsulClient.getKvClient().deleteKey(consulEntryKey); // Due to bug in consul https://github.com/hashicorp/consul/issues/571
```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/SpawnerSelector.java`
#### Snippet
```java

    public static Optional<AgentSpawner> selectSpawner(StorageWrapper storageWrapper, SecretWrapper secretWrapper) {
        switch (storageWrapper.getStorageCase()) {
            case S3:
                if (storageWrapper.getS3().getEndpoint().endsWith("amazonaws.com")) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
            if (request.getRequestCase() == FetchResourceMetadataRequest.RequestCase.DIRECTREQUEST) {
                directRequest = request.getDirectRequest();
            } else {
                directRequest = deriveDirectRequest(request.getIdRequest());
            }

            String targetAgent = derriveTargetAgent(directRequest);
            SyncRPCRequest.SyncRPCRequestBuilder requestBuilder = SyncRPCRequest.SyncRPCRequestBuilder.builder()
                    .withAgentId(targetAgent)
                    .withMessageId(UUID.randomUUID().toString())
                    .withParameter("request", JsonFormat.printer().print(directRequest));
```

### DuplicatedCode
Duplicated code
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/SSHProvider.java`
#### Snippet
```java
        final List<AuthMethod> am = new LinkedList<>();
        am.add(new AuthPublickey(keyProvider));

        am.add(new AuthKeyboardInteractive(new ChallengeResponseProvider() {
            @Override
            public List<String> getSubmethods() {
                return new ArrayList<>();
            }

            @Override
            public void init(Resource resource, String name, String instruction) {
            }

            @Override
            public char[] getResponse(String prompt, boolean echo) {
                return new char[0];
            }

            @Override
            public boolean shouldRetry() {
                return false;
            }
        }));
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
            if (!barrierPassed) {
                try {
                    if (readBuffer1) {
                        buffer2Lock.lock();
                    } else {
                        buffer1Lock.lock();
                    }

                    // wait for reader to enter into read block for the first time
                    barrier.await();

                    barrierPassed = true;
                } catch (Exception e) {
                    throw new IOException(e);
                }
            }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
                if (buf2Remain < bufferSize) {
                    buffer2[buf2Remain] = (byte)b;
                    buf2Remain ++;
                } else {
                    barrier.reset();
                    buffer2Lock.unlock();
                    buffer1Lock.lock();
                    try {
                        // Wait for reader to move into next buffer
                        barrier.await();
                    } catch (Exception e) {
                        throw new IOException();
                    }
                    write(b);
                }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
                    buffer1Lock.unlock();

                    readPoint = 0;
                    try {
                        // Wait for writer to move into next buffer
                        barrier.await();
                    } catch (Exception e) {
                        throw new IOException();
                    }
                    //return read();
                    buf2Remain --;
                    processedBytes++;
                    return buffer2[readPoint++] & 0xff;
```

### DuplicatedCode
Duplicated code
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/SQLResourceBackend.java`
#### Snippet
```java
                storages.forEach(st -> {
                    StorageListEntry.Builder entry = StorageListEntry.newBuilder();
                    entry.setStorageId(st.getStorageId());
                    entry.setStorageName(st.getStorageName());
                    entry.setStorageType(StorageType.valueOf(st.getStorageType().name()));
                    resp.addStorageList(entry);
                });
```

### DuplicatedCode
Duplicated code
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
                    com.dropbox.core.v2.files.FileMetadata fileMetadata = (com.dropbox.core.v2.files.FileMetadata) entryMetadata;
                    FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
                    fileBuilder.setResourceSize(fileMetadata.getSize());
                    fileBuilder.setUpdateTime(fileMetadata.getServerModified().getTime());
                    fileBuilder.setCreatedTime(fileMetadata.getClientModified().getTime());
                    fileBuilder.setFriendlyName(fileMetadata.getName());
```

### DuplicatedCode
Duplicated code
in `transport/gcp-transport/src/main/java/org/apache/airavata/mft/transport/gcp/GCSIncomingChunkedConnector.java`
#### Snippet
```java
        this.connectorConfig = connectorConfig;
        GCSSecret gcsSecret = connectorConfig.getSecret().getGcs();

        GCSStorage gcsStorage = connectorConfig.getStorage().getGcs();

        PrivateKey privKey = GCSUtil.getPrivateKey(gcsSecret.getPrivateKey());

        try (Storage storage = StorageOptions.newBuilder().setCredentials(ServiceAccountCredentials.newBuilder()
                .setProjectId(gcsSecret.getProjectId())
                .setPrivateKey(privKey)
                .setClientEmail(gcsSecret.getClientEmail())
                .build()).build().getService()) {

            blob = storage.get(gcsStorage.getBucketName(),
                    connectorConfig.getResourcePath(), Storage.BlobGetOption.fields(Storage.BlobField.values()));
        }
```

### DuplicatedCode
Duplicated code
in `transport/gcp-transport/src/main/java/org/apache/airavata/mft/transport/gcp/GCSMetadataCollector.java`
#### Snippet
```java
        Map<String, DirectoryMetadata.Builder> subDirCache = new HashMap<>();
        Map<String, List<String>> childTree = new HashMap<>();
        childTree.put(resourcePath, new ArrayList<>());
        DirectoryMetadata.Builder dirBuilder = DirectoryMetadata.newBuilder();
        subDirCache.put(resourcePath, dirBuilder);
```

### DuplicatedCode
Duplicated code
in `transport/gcp-transport/src/main/java/org/apache/airavata/mft/transport/gcp/GCSOutgoingStreamingConnector.java`
#### Snippet
```java
        if (writer != null) {
            try {
                writer.close();
            } catch (Exception e) {
                logger.warn("Failed to close the writer", e);
            }
        }
        if (storage != null) {
            try {
                this.storage.close();
            } catch (Exception e) {
                logger.warn("Failed to close the storage", e);
            }
        }
```

### DuplicatedCode
Duplicated code
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
        SCPSecret scpSecret = cc.getSecret().getScp();

        logger.info("Creating a ssh session for {}@{}:{}", scpSecret.getUser(), scpStorage.getHost(), scpStorage.getPort());

        this.session = SCPTransportUtil.createSession(
                scpSecret.getUser(),
                scpStorage.getHost(),
                scpStorage.getPort(),
                scpSecret.getPrivateKey().getBytes(),
                scpSecret.getPublicKey().getBytes(),
                scpSecret.getPassphrase().equals("")? null : scpSecret.getPassphrase().getBytes());

        if (session == null) {
            logger.error("Session can not be null. Make sure that SCP Receiver is properly initialized");
            throw new Exception("Session can not be null. Make sure that SCP Receiver is properly initialized");
        }
```

### DuplicatedCode
Duplicated code
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
        int b = in.read();
        // b may be 0 for success,
        //          1 for error,
        //          2 for fatal error,
        //         -1
        if (b == 0) return b;
        if (b == -1) return b;

        if (b == 1 || b == 2) {
            StringBuffer sb = new StringBuffer();
            int c;
            do {
                c = in.read();
                sb.append((char) c);
            }
            while (c != '\n');
            if (b == 1) { // error
                logger.error("Check Ack Failure b = 1 " + sb.toString());
            }
            if (b == 2) { // fatal error
                logger.error("Check Ack Failure b = 2 " + sb.toString());
            }
        }
        return b;
```

### DuplicatedCode
Duplicated code
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
                        FileMetadata.Builder fileBuilder = FileMetadata.newBuilder();
                        fileBuilder.setFriendlyName(swiftObject.getName());
                        fileBuilder.setResourcePath(swiftObject.getName());
                        fileBuilder.setCreatedTime(swiftObject.getLastModified().getTime());
                        fileBuilder.setUpdateTime(swiftObject.getLastModified().getTime());
                        fileBuilder.setResourceSize(swiftObject.getPayload().getContentMetadata().getContentLength());
```

## RuleId[id=DuplicateExpressions]
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

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
    public synchronized void updateAgentPendingTransferCount(String agentId, long transferCount) {
        try {
            kvClient.putValue(AGENTS_PENDING_TRANSFER_COUNT_PATH + agentId, transferCount + "");
        } catch (Exception e) {
            logger.error("Failed update pending transfer count {} in consul for agent {}. But Continuing the execution",
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/transport/TransportClassLoader.java`
#### Snippet
```java
    }

    public static final Map<String, byte[]> unzipRecursively(final ByteArrayOutputStream baos) {
        final Map<String, byte[]> result = new HashMap<String, byte[]>();
        try(final ZipInputStream in = new ZipInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransportMediator.java`
#### Snippet
```java
                    uploader.uploadChunk(chunkIdx, startPos, endPos, inputStream);
                } else {
                    String tempFile = tempDataDir + File.separator + UUID.randomUUID().toString() + "-" + chunkIdx;
                    downloader.downloadChunk(chunkIdx, startPos, endPos, tempFile);
                    uploader.uploadChunk(chunkIdx, startPos, endPos, tempFile);
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

## RuleId[id=SuspiciousMethodCalls]
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `controller/src/main/java/org/apache/airavata/mft/controller/MFTController.java`
#### Snippet
```java
    }

    /**
    private Optional<String> selectAgent(String transferId, TransferApiRequest transferRequest,
                                         AgentTransferRequest agentTransferRequest) throws MFTConsulClientException {
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `TransferInfo` may be 'static'
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/AgentOrchestrator.java`
#### Snippet
```java
    private final int SPAWNER_MAX_IDLE_SECONDS = 30; // TODO Externalize this

    private class TransferInfo {
        private final String transferId;
        private final AgentTransferRequest agentTransferRequest;
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
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

                Optional<MetadataCollector> metadataCollectorOptional = MetadataCollectorResolver
```

### SwitchStatementWithConfusingDeclaration
Local variable `metadataCollectorOptional` declared in one 'switch' branch and used in another
in `agent/service/src/main/java/org/apache/airavata/mft/agent/rpc/RPCParser.java`
#### Snippet
```java
                GetResourceMetadataRequest req = directResourceMetadataReq.build();

                Optional<MetadataCollector> metadataCollectorOptional = MetadataCollectorResolver
                        .resolveMetadataCollector(req.getStorage().getStorageCase().name(), transportCache);
                if (metadataCollectorOptional.isPresent()) {
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/LimitInputStream.java`
#### Snippet
```java
    }

    public int read(byte[] b, int off, int len) throws IOException {
        if (!this.isOpen()) {
            throw new IOException("read(len=" + len + ") stream is closed (remaining=" + this.remaining + ")");
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingStreamingConnector.java`
#### Snippet
```java

/** NOTE: This implementation uses 3rd party buffering of output stream
 * https://github.com/CI-CMG/aws-s3-outputstream until Amazon SDK supports
 * https://github.com/aws/aws-sdk-java-v2/issues/3128 **/

```

### JavadocLinkAsPlainText
Link specified as plain text
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingStreamingConnector.java`
#### Snippet
```java
/** NOTE: This implementation uses 3rd party buffering of output stream
 * https://github.com/CI-CMG/aws-s3-outputstream until Amazon SDK supports
 * https://github.com/aws/aws-sdk-java-v2/issues/3128 **/

public class S3OutgoingStreamingConnector implements OutgoingStreamingConnector {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(SwiftOutgoingConnector.class);

    private SwiftApi swiftApi;
    private ObjectApi objectApi;
    private StaticLargeObjectApi staticLargeObjectApi;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxReceiver.java`
#### Snippet
```java

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxReceiver.java`
#### Snippet
```java
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxReceiver.java`
#### Snippet
```java
    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxReceiver.java`
#### Snippet
```java
    private DbxClientV2 dbxClientV2;

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java
    private final ScheduledExecutorService sessionRenewPool = Executors.newSingleThreadScheduledExecutor();

    private long sessionRenewSeconds = 4;
    private long sessionTTLSeconds = 10;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java

    private long sessionRenewSeconds = 4;
    private long sessionTTLSeconds = 10;

    private ObjectMapper mapper = new ObjectMapper();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxMetadataCollector.java`
#### Snippet
```java
public class DropboxMetadataCollector implements MetadataCollector {

    private DropboxStorage dropboxStorage;
    private DropboxSecret dropboxSecret;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalSender.java`
#### Snippet
```java

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalSender.java`
#### Snippet
```java
    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalSender.java`
#### Snippet
```java
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalSender.java`
#### Snippet
```java
    private boolean initialized;

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxReceiver.java`
#### Snippet
```java
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxReceiver.java`
#### Snippet
```java

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxReceiver.java`
#### Snippet
```java
    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxReceiver.java`
#### Snippet
```java
    private BoxAPIConnection boxClient;

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(SwiftIncomingConnector.class);

    private SwiftApi swiftApi;
    private ObjectApi objectApi;
    private String resourcePath;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPReceiver.java`
#### Snippet
```java

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPReceiver.java`
#### Snippet
```java
    private FTPClient ftpClient;

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPReceiver.java`
#### Snippet
```java
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPReceiver.java`
#### Snippet
```java
    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPSender.java`
#### Snippet
```java
    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPSender.java`
#### Snippet
```java
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPSender.java`
#### Snippet
```java
    private FTPClient ftpClient;

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPSender.java`
#### Snippet
```java

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxSender.java`
#### Snippet
```java
    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxSender.java`
#### Snippet
```java
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxSender.java`
#### Snippet
```java
    private DbxClientV2 dbxClientV2;

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/dropbox-transport/src/main/java/org/apache/airavata/mft/transport/dropbox/DropboxSender.java`
#### Snippet
```java

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalReceiver.java`
#### Snippet
```java
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalReceiver.java`
#### Snippet
```java
    private boolean initialized;

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalReceiver.java`
#### Snippet
```java
    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalReceiver.java`
#### Snippet
```java

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxSender.java`
#### Snippet
```java

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxSender.java`
#### Snippet
```java
    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxSender.java`
#### Snippet
```java
    private int resourceServicePort;
    private String secretServiceHost;
    private int secretServicePort;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxSender.java`
#### Snippet
```java
    private BoxAPIConnection boxClient;

    private String resourceServiceHost;
    private int resourceServicePort;
    private String secretServiceHost;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxMetadataCollector.java`
#### Snippet
```java
    boolean initialized = false;

    private BoxStorage boxStorage;
    private BoxSecret boxSecret;
    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalMetadataCollector.java`
#### Snippet
```java
    boolean initialized = false;

    private LocalStorage localStorage;
    @Override
    public void init(StorageWrapper storage, SecretWrapper secret) {
```

## RuleId[id=IgnoreResultOfCall]
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

### IgnoreResultOfCall
Result of `FileInputStream.skip()` is ignored
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalOutgoingChunkedConnector.java`
#### Snippet
```java
        byte[] buf = new byte[buffLen];

        from.skip(startByte);

        long fileSize = endByte - startByte + 1;
```

### IgnoreResultOfCall
Result of `InputStream.skip()` is ignored
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalOutgoingChunkedConnector.java`
#### Snippet
```java
        byte[] buffer = new byte[1024];
        int bytesRead;
        inputStream.skip(startByte);
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
```

### IgnoreResultOfCall
Result of `FileInputStream.skip()` is ignored
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingChunkedConnector.java`
#### Snippet
```java
        FileInputStream from = new FileInputStream(new File(this.resourcePath));

        from.skip(startByte);

        return new BufferedInputStream(from, Math.min(16 * 1024 * 1024,(int) (endByte - startByte)));
```

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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `flush()` is identical to its super method
in `core/src/main/java/org/apache/airavata/mft/core/CircularStreamingBuffer.java`
#### Snippet
```java

        @Override
        public void flush() throws IOException {
        }

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransportMediator.java`
#### Snippet
```java
                try {

                    InputStream inputStream = inConnector.fetchInputStream();
                    OutputStream outputStream = outConnector.fetchOutputStream();

```

### AutoCloseableResource
'OutputStream' used without 'try'-with-resources statement
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransportMediator.java`
#### Snippet
```java

                    InputStream inputStream = inConnector.fetchInputStream();
                    OutputStream outputStream = outConnector.fetchOutputStream();

                    long count = 0;
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/EC2AgentSpawner.java`
#### Snippet
```java
                List<String> localKeys = new ArrayList<>();
                if (Files.isDirectory(Path.of(mftKeyDir))) {
                    Stream<Path> keyPaths = Files.list(Path.of(mftKeyDir));
                    keyPaths.forEach(p -> localKeys.add(p.toFile().getName()));
                }
```

### AutoCloseableResource
'TransportClassLoader' used without 'try'-with-resources statement
in `agent/service/src/main/java/org/apache/airavata/mft/agent/transport/MetadataCollectorResolver.java`
#### Snippet
```java

        if (className != null) {
            TransportClassLoader transportClassLoader = cache.fetchClassLoader(type.toLowerCase());
            Class<?> aClass = transportClassLoader.loadClass(className, true);
            return Optional.of((MetadataCollector) aClass.getDeclaredConstructor().newInstance());
```

### AutoCloseableResource
'StorageServiceClient' used without 'try'-with-resources statement
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
    private GetResourceMetadataRequest deriveDirectRequest(GetResourceMetadataFromIDsRequest idRequest) {

        StorageServiceClient storageClient = StorageServiceClientBuilder.buildClient(resourceServiceHost, resourceServicePort);
        SecretServiceClient secretClient = SecretServiceClientBuilder.buildClient(secretServiceHost, secretServicePort);
        StorageTypeResolveResponse storageTypeResp = storageClient.common().resolveStorageType(
```

### AutoCloseableResource
'SecretServiceClient' used without 'try'-with-resources statement
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java

        StorageServiceClient storageClient = StorageServiceClientBuilder.buildClient(resourceServiceHost, resourceServicePort);
        SecretServiceClient secretClient = SecretServiceClientBuilder.buildClient(secretServiceHost, secretServicePort);
        StorageTypeResolveResponse storageTypeResp = storageClient.common().resolveStorageType(
                StorageTypeResolveRequest.newBuilder().setStorageId(idRequest.getStorageId()).build());
```

### AutoCloseableResource
'TransportClassLoader' used without 'try'-with-resources statement
in `agent/service/src/main/java/org/apache/airavata/mft/agent/transport/ConnectorResolver.java`
#### Snippet
```java

        if (className != null) {
            TransportClassLoader transportClassLoader = transportCache.fetchClassLoader(type.toLowerCase());
            Class<?> aClass = transportClassLoader.loadClass(className, true);
            return Optional.of((IncomingChunkedConnector) aClass.getDeclaredConstructor().newInstance());
```

### AutoCloseableResource
'TransportClassLoader' used without 'try'-with-resources statement
in `agent/service/src/main/java/org/apache/airavata/mft/agent/transport/ConnectorResolver.java`
#### Snippet
```java

        if (className != null) {
            TransportClassLoader transportClassLoader = transportCache.fetchClassLoader(type.toLowerCase());
            Class<?> aClass = transportClassLoader.loadClass(className, true);
            return Optional.of((IncomingStreamingConnector) aClass.getDeclaredConstructor().newInstance());
```

### AutoCloseableResource
'TransportClassLoader' used without 'try'-with-resources statement
in `agent/service/src/main/java/org/apache/airavata/mft/agent/transport/ConnectorResolver.java`
#### Snippet
```java

        if (className != null) {
            TransportClassLoader transportClassLoader = transportCache.fetchClassLoader(type.toLowerCase());
            Class<?> aClass = transportClassLoader.loadClass(className, true);
            return Optional.of((OutgoingStreamingConnector) aClass.getDeclaredConstructor().newInstance());
```

### AutoCloseableResource
'TransportClassLoader' used without 'try'-with-resources statement
in `agent/service/src/main/java/org/apache/airavata/mft/agent/transport/ConnectorResolver.java`
#### Snippet
```java

        if (className != null) {
            TransportClassLoader transportClassLoader = transportCache.fetchClassLoader(type.toLowerCase());
            Class<?> aClass = transportClassLoader.loadClass(className, true);
            return Optional.of((OutgoingChunkedConnector) aClass.getDeclaredConstructor().newInstance());
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalMetadataCollector.java`
#### Snippet
```java
                dirBuilder.setUpdateTime(basicFileAttributes.lastModifiedTime().toMillis());

                Stream<Path> fileList = Files.list(resourceFile.toPath());
                fileList.forEach(p -> {
                    try {
```

## RuleId[id=UNUSED_IMPORT]
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
Unused import `import java.util.concurrent.*;`
in `controller/src/main/java/org/apache/airavata/mft/controller/TransferDispatcher.java`
#### Snippet
```java

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

```

### UNUSED_IMPORT
Unused import `import com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest;`
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/EC2AgentSpawner.java`
#### Snippet
```java
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest;
import org.apache.airavata.mft.agent.stub.SecretWrapper;
import org.apache.airavata.mft.agent.stub.StorageWrapper;
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
Unused import `import com.amazonaws.auth.AWSCredentials;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3IncomingConnector.java`
#### Snippet
```java
package org.apache.airavata.mft.transport.s3;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.AWSStaticCredentialsProvider;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3IncomingConnector.java`
#### Snippet
```java

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.BasicAWSCredentials;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3IncomingConnector.java`
#### Snippet
```java
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.BasicSessionCredentials;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3IncomingConnector.java`
#### Snippet
```java
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.client.builder.AwsClientBuilder;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3IncomingConnector.java`
#### Snippet
```java
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.services.s3.AmazonS3ClientBuilder;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3IncomingConnector.java`
#### Snippet
```java
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
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

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.AWSCredentials;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3MetadataCollector.java`
#### Snippet
```java
package org.apache.airavata.mft.transport.s3;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.AWSStaticCredentialsProvider;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3MetadataCollector.java`
#### Snippet
```java

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.BasicAWSCredentials;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3MetadataCollector.java`
#### Snippet
```java
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.BasicSessionCredentials;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3MetadataCollector.java`
#### Snippet
```java
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.client.builder.AwsClientBuilder;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3MetadataCollector.java`
#### Snippet
```java
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.services.s3.AmazonS3ClientBuilder;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3MetadataCollector.java`
#### Snippet
```java
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.ClientConfiguration;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
package org.apache.airavata.mft.transport.s3;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.AWSCredentials;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.AWSStaticCredentialsProvider;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.BasicAWSCredentials;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.BasicSessionCredentials;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.client.builder.AwsClientBuilder;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.services.s3.AmazonS3ClientBuilder;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.Md5Utils;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.util.Md5Utils;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.Md5Utils;
import org.apache.airavata.mft.core.api.ConnectorConfig;
import org.apache.airavata.mft.core.api.OutgoingChunkedConnector;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Files;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Paths;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.security.MessageDigest;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3OutgoingConnector.java`
#### Snippet
```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
```

### UNUSED_IMPORT
Unused import `import java.security.MessageDigest;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3Util.java`
#### Snippet
```java
import org.apache.airavata.mft.resource.stubs.s3.storage.S3Storage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Properties;`
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3Util.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class S3Util {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param transferId` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * status messages and put in the final status array.
     *
     * @param transferId
     * @param agentId
     * @param transferState
```

### JavadocDeclaration
`@param agentId` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     *
     * @param transferId
     * @param agentId
     * @param transferState
     * @throws MFTConsulClientException
```

### JavadocDeclaration
`@param transferState` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * @param transferId
     * @param agentId
     * @param transferState
     * @throws MFTConsulClientException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * @param agentId
     * @param transferState
     * @throws MFTConsulClientException
     */
    public void submitFileTransferStateToProcess(String transferId, String agentRequestId,
```

### JavadocDeclaration
`@param transferId` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * state array when multiple clients are writing at the same time
     *
     * @param transferId
     * @param transferState
     * @throws MFTConsulClientException
```

### JavadocDeclaration
`@param transferState` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     *
     * @param transferId
     * @param transferState
     * @throws MFTConsulClientException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * @param transferId
     * @param transferState
     * @throws MFTConsulClientException
     */
    public void saveTransferState(String transferId, String agentRequestId, TransferState transferState) throws MFTConsulClientException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * @param transferId Transfer Id
     * @return The list of all {@link TransferState}
     * @throws IOException
     */
    public List<TransferState> getTransferStates(String transferId) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * @param transferId Transfer Id
     * @return Optional {@link TransferState } is there is any
     * @throws MFTConsulClientException
     */
    public Optional<TransferState> getLastTransferState(String transferId) throws MFTConsulClientException {
```

### JavadocDeclaration
`@param agentInfo` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * Lists all currently processing transfer id for the given agent
     *
     * @param agentInfo
     * @return
     * @throws MFTConsulClientException
```

### JavadocDeclaration
`@return` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     *
     * @param agentInfo
     * @return
     * @throws MFTConsulClientException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
     * @param agentInfo
     * @return
     * @throws MFTConsulClientException
     */
    public List<String> getAgentActiveTransfers(AgentInfo agentInfo) throws MFTConsulClientException {
```

### JavadocDeclaration
`@param recursiveSearch` tag description is missing
in `core/src/main/java/org/apache/airavata/mft/core/api/MetadataCollector.java`
#### Snippet
```java
     *
     * @param resourcePath    path of the resource
     * @param recursiveSearch
     * @return an object of {@link FileResourceMetadata}
     * @throws Exception if the resource id is not a File Resource type or the resource can't be fetched from the resource service
```

### JavadocDeclaration
`@param storage` tag description is missing
in `core/src/main/java/org/apache/airavata/mft/core/api/MetadataCollector.java`
#### Snippet
```java
     * Initializes the {@link MetadataCollector}
     *
     * @param storage
     * @param secret
     */
```

### JavadocDeclaration
`@param secret` tag description is missing
in `core/src/main/java/org/apache/airavata/mft/core/api/MetadataCollector.java`
#### Snippet
```java
     *
     * @param storage
     * @param secret
     */
    public void init(StorageWrapper storage, SecretWrapper secret);
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `n` to `long` is redundant
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransportMediator.java`
#### Snippet
```java
                    int n;
                    byte[] buffer = new byte[128 * 1024];
                    for (count = 0L; -1 != (n = inputStream.read(buffer)); count += (long) n) {
                        outputStream.write(buffer, 0, n);
                        countAtomic.set(count);
```

### RedundantCast
Casting `from.read(...)` to `int` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalOutgoingChunkedConnector.java`
#### Snippet
```java
            }

            bufSize = (int) from.read(buf, 0, bufSize);

            if (bufSize < 0) {
```

### RedundantCast
Casting `read` to `long` is redundant
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/LimitInputStream.java`
#### Snippet
```java
            if (nb > 0) {
                int read = super.read(b, off, nb);
                this.remaining -= (long)read;
                return read;
            } else {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `channel` may be 'final'
in `services/secret-service/client/src/main/java/org/apache/airavata/mft/secret/client/SecretServiceClient.java`
#### Snippet
```java
public class SecretServiceClient implements Closeable {

    private ManagedChannel channel;

    SecretServiceClient(ManagedChannel channel) {
```

### FieldMayBeFinal
Field `outputStream` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
    private final byte[] buffer2 = new byte[bufferSize];

    private OutputStream outputStream = new DoubleStreamingBuffer.DSBOutputStream();
    private InputStream inputStream = new DoubleStreamingBuffer.DSBInputStream();

```

### FieldMayBeFinal
Field `inputStream` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java

    private OutputStream outputStream = new DoubleStreamingBuffer.DSBOutputStream();
    private InputStream inputStream = new DoubleStreamingBuffer.DSBInputStream();

    private CyclicBarrier barrier = new CyclicBarrier(2);
```

### FieldMayBeFinal
Field `bufferSize` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
    Size of the internal arrays
     */
    private int bufferSize = 2048;

    /*
```

### FieldMayBeFinal
Field `barrier` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
    private InputStream inputStream = new DoubleStreamingBuffer.DSBInputStream();

    private CyclicBarrier barrier = new CyclicBarrier(2);

    /*
```

### FieldMayBeFinal
Field `buffer2Lock` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java

    private ReentrantLock buffer1Lock = new ReentrantLock();
    private ReentrantLock buffer2Lock = new ReentrantLock();

    boolean readBuffer1 = true;
```

### FieldMayBeFinal
Field `buffer1Lock` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
    private int buf2Remain = 0;

    private ReentrantLock buffer1Lock = new ReentrantLock();
    private ReentrantLock buffer2Lock = new ReentrantLock();

```

### FieldMayBeFinal
Field `parameters` may be 'final'
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/models/rpc/SyncRPCRequest.java`
#### Snippet
```java
        private String agentId;
        private String method;
        private Map<String, String> parameters = new HashMap<>();
        private String messageId;

```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java
    private long sessionTTLSeconds = 10;

    private ObjectMapper mapper = new ObjectMapper();

    @org.springframework.beans.factory.annotation.Value("${agent.id}")
```

### FieldMayBeFinal
Field `sessionRenewSeconds` may be 'final'
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java
    private final ScheduledExecutorService sessionRenewPool = Executors.newSingleThreadScheduledExecutor();

    private long sessionRenewSeconds = 4;
    private long sessionTTLSeconds = 10;

```

### FieldMayBeFinal
Field `sessionTTLSeconds` may be 'final'
in `agent/service/src/main/java/org/apache/airavata/mft/agent/ingress/ConsulIngressHandler.java`
#### Snippet
```java

    private long sessionRenewSeconds = 4;
    private long sessionTTLSeconds = 10;

    private ObjectMapper mapper = new ObjectMapper();
```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
    private KeyValueClient kvClient;
    private SessionClient sessionClient;
    private ObjectMapper mapper = new ObjectMapper();

    public static final String TRANSFER_STATE_PATH = "mft/transfer/state/";
```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `controller/src/main/java/org/apache/airavata/mft/controller/MFTController.java`
#### Snippet
```java

    private final Semaphore mainHold = new Semaphore(0);
    private ObjectMapper mapper = new ObjectMapper();

    private KVCache messageCache;
```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/SQLResourceBackend.java`
#### Snippet
```java
    private ResolveStorageRepository resolveStorageRepository;

    private DozerBeanMapper mapper = new DozerBeanMapper();

    @Override
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `services/resource-service/client/src/main/java/org/apache/airavata/mft/resource/client/StorageServiceClient.java`
#### Snippet
```java
public class StorageServiceClient implements Closeable {

    private ManagedChannel channel;

    public StorageServiceClient(ManagedChannel channel) {
```

### FieldMayBeFinal
Field `s3ClientCache` may be 'final'
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3Util.java`
#### Snippet
```java
public class S3Util {

    private ThreadLocal<Map<String, AmazonS3>> s3ClientCache = ThreadLocal.withInitial(() -> {
        Map<String, AmazonS3> map = new HashMap<>();
        return map;
```

### FieldMayBeFinal
Field `inputStream` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/CircularStreamingBuffer.java`
#### Snippet
```java

    private OutputStream outputStream = new CSBOutputStream();
    private InputStream inputStream = new CSBInputStream();

    public OutputStream getOutputStream() {
```

### FieldMayBeFinal
Field `readSem` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/CircularStreamingBuffer.java`
#### Snippet
```java

    private boolean osClosed = false;
    private Semaphore readSem = new Semaphore(0);

    private OutputStream outputStream = new CSBOutputStream();
```

### FieldMayBeFinal
Field `buffer` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/CircularStreamingBuffer.java`
#### Snippet
```java

    private int bufferSize = 18192;
    private ArrayBlockingQueue<Byte> buffer = new ArrayBlockingQueue<>(bufferSize);

    private boolean osClosed = false;
```

### FieldMayBeFinal
Field `bufferSize` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/CircularStreamingBuffer.java`
#### Snippet
```java
public class CircularStreamingBuffer {

    private int bufferSize = 18192;
    private ArrayBlockingQueue<Byte> buffer = new ArrayBlockingQueue<>(bufferSize);

```

### FieldMayBeFinal
Field `outputStream` may be 'final'
in `core/src/main/java/org/apache/airavata/mft/core/CircularStreamingBuffer.java`
#### Snippet
```java
    private Semaphore readSem = new Semaphore(0);

    private OutputStream outputStream = new CSBOutputStream();
    private InputStream inputStream = new CSBInputStream();

```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `services/secret-service/server/src/main/java/org/apache/airavata/mft/secret/server/backend/sql/SQLSecretBackend.java`
#### Snippet
```java
    private GCSSecretRepository gcsSecretRepository;

    private DozerBeanMapper mapper = new DozerBeanMapper();

    @Override
```

### FieldMayBeFinal
Field `mapper` may be 'final'
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/SyncRPCClient.java`
#### Snippet
```java
    private MFTConsulClient mftConsulClient;

    private ObjectMapper mapper = new ObjectMapper();
    private Map<String, ArrayBlockingQueue<SyncRPCResponse>> responseQueueMap = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `mftConsulClient` may be 'final'
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/SyncRPCClient.java`
#### Snippet
```java
    private ConsulCache.Listener<String, Value> syncResponseCacheListener;
    private KVCache syncResponseCache;
    private MFTConsulClient mftConsulClient;

    private ObjectMapper mapper = new ObjectMapper();
```

### FieldMayBeFinal
Field `responseQueueMap` may be 'final'
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/SyncRPCClient.java`
#### Snippet
```java

    private ObjectMapper mapper = new ObjectMapper();
    private Map<String, ArrayBlockingQueue<SyncRPCResponse>> responseQueueMap = new ConcurrentHashMap<>();

    public SyncRPCClient(String agentId, MFTConsulClient mftConsulClient) {
```

### FieldMayBeFinal
Field `baseResponsePath` may be 'final'
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/SyncRPCClient.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(MFTConsulClient.class);

    private String baseResponsePath;

    private ConsulCache.Listener<String, Value> syncResponseCacheListener;
```

### FieldMayBeFinal
Field `swiftApiCache` may be 'final'
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
// https://jclouds.apache.org/guides/openstack/
public class SwiftUtil {
    private ThreadLocal<Map<String, SwiftApi>> swiftApiCache = ThreadLocal.withInitial(() -> {
        Map<String, SwiftApi> map = new HashMap<>();
        return map;
```

## RuleId[id=RedundantExplicitClose]
### RedundantExplicitClose
Redundant 'close()'
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingChunkedConnector.java`
#### Snippet
```java
                }
                bis.close();
                bos.close();
            } catch (Exception e) {
                logger.error("Unexpected error occurred while downloading chunk {} to file {} from resource path {}",
```

## RuleId[id=UnnecessaryLocalVariable]
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

### UnnecessaryLocalVariable
Local variable `from` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingStreamingConnector.java`
#### Snippet
```java
    @Override
    public InputStream fetchInputStream() throws Exception {
        InputStream from = new FileInputStream(new File(this.resourcePath));

        return from;
```

### UnnecessaryLocalVariable
Local variable `longSt` is redundant
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3Util.java`
#### Snippet
```java

    private String getSecretKey(S3Secret s3Secret, S3Storage s3Storage) throws NoSuchAlgorithmException {
        String longSt =  s3Secret.getAccessKey()
                + s3Secret.getSecretKey()
                + s3Secret.getSessionToken()
```

### UnnecessaryLocalVariable
Local variable `map` is redundant
in `transport/s3-transport/src/main/java/org/apache/airavata/mft/transport/s3/S3Util.java`
#### Snippet
```java

    private ThreadLocal<Map<String, AmazonS3>> s3ClientCache = ThreadLocal.withInitial(() -> {
        Map<String, AmazonS3> map = new HashMap<>();
        return map;
    });
```

### UnnecessaryLocalVariable
Local variable `map` is redundant
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
public class SwiftUtil {
    private ThreadLocal<Map<String, SwiftApi>> swiftApiCache = ThreadLocal.withInitial(() -> {
        Map<String, SwiftApi> map = new HashMap<>();
        return map;
    });
```

## RuleId[id=BusyWait]
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

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalOutgoingChunkedConnector.java`
#### Snippet
```java
    public void uploadChunk(int chunkId, long startByte, long endByte, String uploadFile) throws Exception {

        FileInputStream from = new FileInputStream(new File(uploadFile));
        FileOutputStream to = new FileOutputStream(new File(this.resourcePath));

```

### RedundantFileCreation
`new File` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalOutgoingChunkedConnector.java`
#### Snippet
```java

        FileInputStream from = new FileInputStream(new File(uploadFile));
        FileOutputStream to = new FileOutputStream(new File(this.resourcePath));

        final int buffLen = 1024;
```

### RedundantFileCreation
`new File` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalOutgoingChunkedConnector.java`
#### Snippet
```java


        FileOutputStream outputStream = new FileOutputStream(new File(this.resourcePath));

        byte[] buffer = new byte[1024];
```

### RedundantFileCreation
`new File` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingChunkedConnector.java`
#### Snippet
```java
    public InputStream downloadChunk(int chunkId, long startByte, long endByte) throws Exception {

        FileInputStream from = new FileInputStream(new File(this.resourcePath));

        from.skip(startByte);
```

### RedundantFileCreation
`new File` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingStreamingConnector.java`
#### Snippet
```java
    @Override
    public InputStream fetchInputStream() throws Exception {
        InputStream from = new FileInputStream(new File(this.resourcePath));

        return from;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `agentId` initializer `null` is redundant
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/AgentOrchestrator.java`
#### Snippet
```java

                        try {
                            String agentId = null;
                            try {
                                agentId = metadata.spawner.getLaunchState().get();
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

### UnusedAssignment
Variable `bufSize` initializer `0` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalOutgoingChunkedConnector.java`
#### Snippet
```java

        while (true) {
            int bufSize = 0;

            if (buffLen < fileSize) {
```

### UnusedAssignment
Variable `read` initializer `0` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingChunkedConnector.java`
#### Snippet
```java
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(downloadFile))) {
                byte[] buffer = new byte[buffLen];
                int read = 0;
                long totalRead = bis.skip(startByte);
                while ((read = bis.read(buffer, 0, Math.min(buffLen, (int) (endByte - totalRead)))) > 0) {
```

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
Variable `directRequest` initializer `null` is redundant
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
    public void resourceMetadata(FetchResourceMetadataRequest request, StreamObserver<ResourceMetadata> responseObserver) {

        GetResourceMetadataRequest directRequest = null;

        try {
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

## RuleId[id=ConstantValue]
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

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java
                return 0;
            }
            String countAsStr = valueOp.get().getValueAsString().get();
            return Long.parseLong(countAsStr);
        } catch (ConsulException e) {
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

## RuleId[id=UnstableApiUsage]
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
        this.client = Consul.builder().withMultipleHostAndPort(hostAndPorts, 100000)
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

