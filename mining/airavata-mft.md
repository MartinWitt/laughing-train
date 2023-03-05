# airavata-mft 
 
# Bad smells
I found 357 bad smells with 133 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 85 | true |
| UnnecessaryFullyQualifiedName | 36 | false |
| UnstableApiUsage | 33 | false |
| UNUSED_IMPORT | 32 | false |
| CodeBlock2Expr | 20 | true |
| RedundantFieldInitialization | 16 | false |
| UtilityClassWithoutPrivateConstructor | 14 | true |
| CommentedOutCode | 13 | false |
| UnusedAssignment | 9 | false |
| IgnoreResultOfCall | 7 | false |
| OptionalGetWithoutIsPresent | 7 | false |
| UnnecessaryToStringCall | 7 | true |
| RedundantFileCreation | 6 | false |
| UnnecessarySemicolon | 5 | false |
| SwitchStatementWithConfusingDeclaration | 5 | false |
| EmptyFinallyBlock | 4 | false |
| ConstantValue | 4 | false |
| CStyleArrayDeclaration | 3 | false |
| DuplicateExpressions | 3 | false |
| BoundedWildcard | 3 | false |
| MissortedModifiers | 3 | false |
| ReturnNull | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| KeySetIterationMayUseEntrySet | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| NestedAssignment | 2 | false |
| EmptyMethod | 2 | false |
| StringBufferReplaceableByStringBuilder | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| OptionalContainsCollection | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| StringEqualsEmptyString | 2 | false |
| SystemOutErr | 2 | false |
| LoopStatementsThatDontLoop | 1 | false |
| DoubleCheckedLocking | 1 | false |
| EmptyStatementBody | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| TrivialStringConcatenation | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| SynchronizeOnThis | 1 | false |
| UnstableTypeUsedInSignature | 1 | false |
| FieldMayBeStatic | 1 | false |
| DataFlowIssue | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| AssignmentToMethodParameter | 1 | false |
| BusyWait | 1 | false |
## RuleId[id=UnnecessaryModifier]
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

    public void init();
    public void destroy();
    public SecretForStorage getSecretForStorage(SecretForStorageGetRequest request) throws Exception;
    public SecretForStorage registerSecretForStorage(SecretForStorage request) throws Exception;
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
public interface SecretBackend {

    public void init();
    public void destroy();

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
    public void destroy();

    public Optional<SCPSecret> getSCPSecret(SCPSecretGetRequest request) throws Exception;
    public SCPSecret createSCPSecret(SCPSecretCreateRequest request);
    public boolean updateSCPSecret(SCPSecretUpdateRequest request);
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
in `core/src/main/java/org/apache/airavata/mft/core/api/IncomingStreamingConnector.java`
#### Snippet
```java

public interface IncomingStreamingConnector extends BasicConnector {
    public InputStream fetchInputStream() throws Exception;
}

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

## RuleId[id=DoubleCheckedLocking]
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
Commented out code (49 lines)
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPSender.java`
#### Snippet
```java
        logger.info("Starting FTP sender stream for transfer {}", context.getTransferId());

        /*
        checkInitialized();

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
Commented out code (42 lines)
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalReceiver.java`
#### Snippet
```java
        logger.info("Starting local receiver stream for transfer {}", context.getTransferId());

        /*
        checkInitialized();

```

### CommentedOutCode
Commented out code (3 lines)
in `core/src/main/java/org/apache/airavata/mft/core/ConnectorResolver.java`
#### Snippet
```java
                className = "org.apache.airavata.mft.transport.gcp.GCSIncomingStreamingConnector";
                break;
//            case "LOCAL":
//                className = "org.apache.airavata.mft.transport.local.LocalIncomingStreamingConnector";
//                break;
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
Commented out code (49 lines)
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPReceiver.java`
#### Snippet
```java
        logger.info("Starting FTP receiver stream for transfer {}", context.getTransferId());

        /*
        checkInitialized();

```

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

## RuleId[id=KeySetIterationMayUseEntrySet]
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

## RuleId[id=SizeReplaceableByIsEmpty]
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

### SizeReplaceableByIsEmpty
`candidates.size() > 0` can be replaced with '!candidates.isEmpty()'
in `controller/src/main/java/org/apache/airavata/mft/controller/TransferDispatcher.java`
#### Snippet
```java
        }

        if (candidates.size() > 0) {
            Random rand = new Random();
            selectedAgent = candidates.get(rand.nextInt(candidates.size()));
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

## RuleId[id=BoundedWildcard]
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

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final private`
in `agent/service/src/main/java/org/apache/airavata/mft/agent/http/HttpTransferRequestsStore.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(HttpTransferRequestsStore.class);

    final private Map<String, AgentHttpDownloadData> downloadRequestStore = new ConcurrentHashMap<>();
    final private Map<String, AgentHttpDownloadData> uploadRequestStore = new ConcurrentHashMap<>();

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
    final private Map<String, AgentHttpDownloadData> uploadRequestStore = new ConcurrentHashMap<>();

    final private ScheduledExecutorService monitor = Executors.newSingleThreadScheduledExecutor();
    private long entryExpiryTimeMS = 300 * 1000;

```

## RuleId[id=IgnoreResultOfCall]
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

        return from;
```

### IgnoreResultOfCall
Result of `FileInputStream.skip()` is ignored
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingChunkedConnector.java`
#### Snippet
```java
        byte[] buf = new byte[buffLen];

        from.skip(startByte);

        long fileSize = endByte - startByte + 1;
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

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalOutgoingChunkedConnector.java`
#### Snippet
```java
        int bytesRead;
        inputStream.skip(startByte);
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
```

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

## RuleId[id=CodeBlock2Expr]
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
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/handler/DropboxServiceHandler.java`
#### Snippet
```java
                responseObserver.onNext(resource);
                responseObserver.onCompleted();
            }, () -> {
                responseObserver.onError(Status.INTERNAL
                        .withDescription("No dropbox storage with id " + request.getStorageId())
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `kvClient` is accessed in both synchronized and unsynchronized contexts
in `common/common-clients/src/main/java/org/apache/airavata/mft/admin/MFTConsulClient.java`
#### Snippet
```java

    private Consul client;
    private KeyValueClient kvClient;
    private SessionClient sessionClient;
    private ObjectMapper mapper = new ObjectMapper();
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `agent/service/src/main/java/org/apache/airavata/mft/agent/MFTAgent.java`
#### Snippet
```java
    private HttpTransferRequestsStore transferRequestsStore;

    public void init() {

    }
```

### EmptyMethod
The method is empty
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
    }

    public void releaseSwiftApi(SwiftSecret swiftSecret) {

    }
```

## RuleId[id=RedundantFieldInitialization]
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
in `core/src/main/java/org/apache/airavata/mft/core/CircularStreamingBuffer.java`
#### Snippet
```java
    private ArrayBlockingQueue<Byte> buffer = new ArrayBlockingQueue<>(bufferSize);

    private boolean osClosed = false;
    private Semaphore readSem = new Semaphore(0);

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
in `transport/azure-transport/src/main/java/org/apache/airavata/mft/transport/azure/AzureMetadataCollector.java`
#### Snippet
```java
public class AzureMetadataCollector implements MetadataCollector {

    boolean initialized = false;

    private AzureStorage azureStorage;
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
Field initialization to `false` is redundant
in `transport/box-transport/src/main/java/org/apache/airavata/mft/transport/box/BoxMetadataCollector.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(BoxMetadataCollector.class);

    boolean initialized = false;

    private BoxStorage boxStorage;
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
Field initialization to `0L` is redundant
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java
    boolean barrierPassed = false;

    private long processedBytes = 0L;

    public class DSBOutputStream extends OutputStream {
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
in `core/src/main/java/org/apache/airavata/mft/core/DoubleStreamingBuffer.java`
#### Snippet
```java

    boolean readBuffer1 = true;
    boolean doneWrite = false;
    int readPoint = 0;

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
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPMetadataCollector.java`
#### Snippet
```java

    private static final Logger logger = LoggerFactory.getLogger(FTPMetadataCollector.class);
    private boolean initialized = false;
    private FTPStorage ftpStorage;
    private FTPSecret ftpSecret;
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

## RuleId[id=StringBufferReplaceableByStringBuilder]
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

## RuleId[id=ZeroLengthArrayInitialization]
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

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
    public static synchronized SwiftUtil getInstance() {
        if (instance == null) {
            synchronized (SwiftUtil.class) {
                if (instance == null) {
                    instance = new SwiftUtil();
```

## RuleId[id=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'org.jclouds.openstack.swift.v1.SwiftApi'
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
        return null;
    }
    public SwiftApi leaseSwiftApi(SwiftSecret swiftSecret) throws Exception {

        String secretKey = getSecretKey(swiftSecret);
```

## RuleId[id=UnusedAssignment]
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
Variable `bufSize` initializer `0` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalOutgoingChunkedConnector.java`
#### Snippet
```java

        while (true) {
            int bufSize = 0;

            if (buffLen < fileSize) {
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
Variable `directRequest` initializer `null` is redundant
in `api/service/src/main/java/org/apache/airavata/mft/api/handler/MFTApiHandler.java`
#### Snippet
```java
    public void resourceMetadata(FetchResourceMetadataRequest request, StreamObserver<ResourceMetadata> responseObserver) {

        GetResourceMetadataRequest directRequest = null;

        try {
```

### UnusedAssignment
Variable `bufSize` initializer `0` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingChunkedConnector.java`
#### Snippet
```java

        while (true) {
            int bufSize = 0;

            if (buffLen < fileSize) {
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
Variable `agentId` initializer `null` is redundant
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/AgentOrchestrator.java`
#### Snippet
```java

                        try {
                            String agentId = null;
                            try {
                                agentId = metadata.spawner.getLaunchState().get();
```

## RuleId[id=OptionalGetWithoutIsPresent]
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
            Value absVal = value.get();
            if (absVal.getValue().isPresent()) {
                String asStr = absVal.getValueAsString().get();
                try {
                    return Optional.of(mapper.readValue(asStr, AgentInfo.class));
```

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

## RuleId[id=ConstantValue]
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
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPIncomingConnector.java`
#### Snippet
```java
                scpSecret.getPassphrase().equals("")? null : scpSecret.getPassphrase().getBytes());

        if (session == null) {
            logger.error("Session can not be null. Make sure that SCP Receiver is properly initialized");
            throw new Exception("Session can not be null. Make sure that SCP Receiver is properly initialized");
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `SPAWNER_MAX_IDLE_SECONDS` may be 'static'
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/AgentOrchestrator.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(AgentOrchestrator.class);

    private final int SPAWNER_MAX_IDLE_SECONDS = 30; // TODO Externalize this

    private class TransferInfo {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
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
Class `SCPTransportUtil` has only 'static' members, and lacks a 'private' constructor
in `transport/scp-transport/src/main/java/org/apache/airavata/mft/transport/scp/SCPTransportUtil.java`
#### Snippet
```java
import java.util.UUID;

public class SCPTransportUtil {

    private static final Logger logger = LoggerFactory.getLogger(SCPTransportUtil.class);
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
Class `SpawnerSelector` has only 'static' members, and lacks a 'private' constructor
in `controller/src/main/java/org/apache/airavata/mft/controller/spawner/SpawnerSelector.java`
#### Snippet
```java
import java.util.Optional;

public class SpawnerSelector {

    public static Optional<AgentSpawner> selectSpawner(StorageWrapper storageWrapper, SecretWrapper secretWrapper) {
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
Class `FTPTransportUtil` has only 'static' members, and lacks a 'private' constructor
in `transport/ftp-transport/src/main/java/org/apache/airavata/mft/transport/ftp/FTPTransportUtil.java`
#### Snippet
```java
import java.io.IOException;

class FTPTransportUtil {

    private static final Logger logger = LoggerFactory.getLogger(FTPTransportUtil.class);
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
Class `StandaloneServiceApplication` has only 'static' members, and lacks a 'private' constructor
in `standalone-service/src/main/java/org/apache/airavata/mft/standalone/server/StandaloneServiceApplication.java`
#### Snippet
```java
@PropertySource(value = "classpath:controller-application.properties")
@Import(org.apache.airavata.mft.api.AppConfig.class)
public class StandaloneServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(StandaloneServiceApplication.class, args);
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
Class `SecretServiceClientBuilder` has only 'static' members, and lacks a 'private' constructor
in `services/secret-service/client/src/main/java/org/apache/airavata/mft/secret/client/SecretServiceClientBuilder.java`
#### Snippet
```java
import io.grpc.ManagedChannelBuilder;

public class SecretServiceClientBuilder {

    public static SecretServiceClient buildClient(String hostName, int port) {
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
Class `AgentUtil` has only 'static' members, and lacks a 'private' constructor
in `agent/service/src/main/java/org/apache/airavata/mft/agent/AgentUtil.java`
#### Snippet
```java
import java.util.function.Consumer;

public final class AgentUtil {
    @FunctionalInterface
    public interface ThrowingBiConsumer<T, U, E extends Exception> {
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
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/entity/GenericResourceEntity.java`
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
in `services/resource-service/server/src/main/java/org/apache/airavata/mft/resource/server/backend/sql/entity/ResolveStorageEntity.java`
#### Snippet
```java

    public enum StorageType {
        S3, SCP, LOCAL, FTP, BOX, DROPBOX, GCS, AZURE, SWIFT, ODATA;
    }

```

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

## RuleId[id=OptionalContainsCollection]
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

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        try {
            ResourceMetadata.Builder resourceBuilder = ResourceMetadata.newBuilder();
            if ("".equals(resourcePath) && "".equals(swiftStorage.getContainer())) {
                FluentIterable<Container> containers = swiftApi.getContainerApi(swiftStorage.getRegion()).list();
                DirectoryMetadata.Builder parentDir = DirectoryMetadata.newBuilder();
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
            } else {
                ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
                if ("".equals(resourcePath)) {

                    DirectoryMetadata.Builder rootDirBuilder = DirectoryMetadata.newBuilder();
```

## RuleId[id=SystemOutErr]
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
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

## RuleId[id=UnnecessaryFullyQualifiedName]
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
    private String agentHost;

    @org.springframework.beans.factory.annotation.Value("${agent.http.port}")
    private Integer agentHttpPort;

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
    String consulHost;

    @org.springframework.beans.factory.annotation.Value("${consul.port}")
    Integer consulPort;

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
public class AppConfig {

    @org.springframework.beans.factory.annotation.Value("${consul.host}")
    String consulHost;

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
    public Integer consulPort;

    @org.springframework.beans.factory.annotation.Value("${api.id}")
    public String apiId;

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
    private int resourceServicePort;

    @org.springframework.beans.factory.annotation.Value("${secret.service.host}")
    private String secretServiceHost;

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
    private String resourceServiceHost;

    @org.springframework.beans.factory.annotation.Value("${resource.service.port}")
    private int resourceServicePort;

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
    private int concurrentChunkedThreads;

    @org.springframework.beans.factory.annotation.Value("${agent.chunk.size}")
    private int chunkedSize;

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
    private final AtomicLong totalPendingTransfers = new AtomicLong(0);

    @org.springframework.beans.factory.annotation.Value("${agent.concurrent.transfers}")
    private int concurrentTransfers;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory.annotation` is unnecessary, and can be replaced with an import
in `agent/service/src/main/java/org/apache/airavata/mft/agent/TransferOrchestrator.java`
#### Snippet
```java
    private String tempDataDir = "/tmp";

    @org.springframework.beans.factory.annotation.Value("${agent.id}")
    private String agentId;

```

## RuleId[id=ThrowablePrintStackTrace]
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

## RuleId[id=NonProtectedConstructorInAbstractClass]
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

## RuleId[id=AssignmentToMethodParameter]
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
                        + v3AuthSecret.getUserDomainName() + v3AuthSecret.getUserName() + v3AuthSecret.getPassword();
        }
        return null;
    }
    public SwiftApi leaseSwiftApi(SwiftSecret swiftSecret) throws Exception {
```

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

## RuleId[id=UnnecessaryLocalVariable]
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
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingChunkedConnector.java`
#### Snippet
```java
    public void downloadChunk(int chunkId, long startByte, long endByte, String downloadFile) throws Exception {

        FileInputStream from = new FileInputStream(new File(this.resourcePath));
        FileOutputStream to = new FileOutputStream(new File(downloadFile));

```

### RedundantFileCreation
`new File` is redundant
in `transport/local-transport/src/main/java/org/apache/airavata/mft/transport/local/LocalIncomingChunkedConnector.java`
#### Snippet
```java

        FileInputStream from = new FileInputStream(new File(this.resourcePath));
        FileOutputStream to = new FileOutputStream(new File(downloadFile));

        final int buffLen = 1024;
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        checkInitialized();

        SwiftApi swiftApi = SwiftUtil.getInstance().leaseSwiftApi(swiftSecret);

        try {
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.features.ObjectApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java

        try {
            ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());

            SwiftObject swiftObject = objectApi.get(resourcePath);
```

### UnstableApiUsage
'getObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java

        try {
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

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
        checkInitialized();

        SwiftApi swiftApi = SwiftUtil.getInstance().leaseSwiftApi(swiftSecret);

        try {
```

### UnstableApiUsage
'getContainerApi(java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
            ResourceMetadata.Builder resourceBuilder = ResourceMetadata.newBuilder();
            if ("".equals(resourcePath) && "".equals(swiftStorage.getContainer())) {
                FluentIterable<Container> containers = swiftApi.getContainerApi(swiftStorage.getRegion()).list();
                DirectoryMetadata.Builder parentDir = DirectoryMetadata.newBuilder();
                parentDir.setResourcePath("");
```

### UnstableApiUsage
'list()' is declared in unstable interface 'org.jclouds.openstack.swift.v1.features.ContainerApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java
            ResourceMetadata.Builder resourceBuilder = ResourceMetadata.newBuilder();
            if ("".equals(resourcePath) && "".equals(swiftStorage.getContainer())) {
                FluentIterable<Container> containers = swiftApi.getContainerApi(swiftStorage.getRegion()).list();
                DirectoryMetadata.Builder parentDir = DirectoryMetadata.newBuilder();
                parentDir.setResourcePath("");
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.features.ObjectApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java

            } else {
                ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
                if ("".equals(resourcePath)) {

```

### UnstableApiUsage
'getObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftMetadataCollector.java`
#### Snippet
```java

            } else {
                ObjectApi objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
                if ("".equals(resourcePath)) {

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
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
// https://jclouds.apache.org/guides/openstack/
public class SwiftUtil {
    private ThreadLocal<Map<String, SwiftApi>> swiftApiCache = ThreadLocal.withInitial(() -> {
        Map<String, SwiftApi> map = new HashMap<>();
        return map;
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
public class SwiftUtil {
    private ThreadLocal<Map<String, SwiftApi>> swiftApiCache = ThreadLocal.withInitial(() -> {
        Map<String, SwiftApi> map = new HashMap<>();
        return map;
    });
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
        return null;
    }
    public SwiftApi leaseSwiftApi(SwiftSecret swiftSecret) throws Exception {

        String secretKey = getSecretKey(swiftSecret);
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
        }

        SwiftApi swiftApi;

        String provider = "openstack-swift";
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
                      v2AuthSecret.getPassword())
                  .overrides(overrides)
                  .buildApi(SwiftApi.class);
              break;
          case V3AUTHSECRET:
```

### UnstableApiUsage
'org.jclouds.openstack.swift.v1.SwiftApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftUtil.java`
#### Snippet
```java
                      v3AuthSecret.getPassword())
                  .overrides(overrides)
                  .buildApi(SwiftApi.class);
              break;
          default:
```

### UnstableApiUsage
'getObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java
        SwiftSecret swiftSecret = cc.getSecret().getSwift();
        swiftApi = SwiftUtil.getInstance().leaseSwiftApi(swiftSecret);
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
'org.jclouds.openstack.swift.v1.features.ObjectApi' is marked unstable with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftIncomingConnector.java`
#### Snippet
```java

    private SwiftApi swiftApi;
    private ObjectApi objectApi;
    private String resourcePath;

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
        this.client = Consul.builder().withMultipleHostAndPort(hostAndPorts, 100000)
```

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
'getObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
        SwiftSecret swiftSecret = cc.getSecret().getSwift();
        swiftApi = SwiftUtil.getInstance().leaseSwiftApi(swiftSecret);
        objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
        staticLargeObjectApi = swiftApi.getStaticLargeObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
    }
```

### UnstableApiUsage
'getStaticLargeObjectApi(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.swift.v1.SwiftApi' marked with @Beta
in `transport/swift-transport/src/main/java/org/apache/airavata/mft/transport/swift/SwiftOutgoingConnector.java`
#### Snippet
```java
        swiftApi = SwiftUtil.getInstance().leaseSwiftApi(swiftSecret);
        objectApi = swiftApi.getObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
        staticLargeObjectApi = swiftApi.getStaticLargeObjectApi(swiftStorage.getRegion(), swiftStorage.getContainer());
    }

```

