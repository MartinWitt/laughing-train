# data-transfer-project 
 
# Bad smells
I found 746 bad smells with 26 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 134 | false |
| FieldMayBeFinal | 116 | false |
| OptionalUsedAsFieldOrParameterType | 78 | false |
| JavadocLinkAsPlainText | 51 | false |
| DuplicatedCode | 39 | false |
| UNCHECKED_WARNING | 31 | false |
| DataFlowIssue | 28 | false |
| UnstableApiUsage | 24 | false |
| OptionalIsPresent | 22 | false |
| NullableProblems | 18 | false |
| UnusedAssignment | 15 | false |
| JavadocDeclaration | 15 | false |
| UnnecessaryLocalVariable | 14 | true |
| FieldCanBeLocal | 12 | false |
| AutoCloseableResource | 10 | false |
| ConstantValue | 9 | false |
| SimplifyOptionalCallChains | 8 | false |
| RedundantCast | 8 | false |
| Deprecation | 7 | false |
| SimplifyStreamApiCallChains | 7 | false |
| RedundantStringFormatCall | 6 | false |
| FinalStaticMethod | 5 | false |
| FuseStreamOperations | 5 | false |
| RedundantLengthCheck | 5 | false |
| UnnecessarySemicolon | 5 | false |
| PlaceholderCountMatchesArgumentCount | 5 | false |
| DefaultAnnotationParam | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| UastIncorrectHttpHeaderInspection | 3 | false |
| NonFinalFieldInEnum | 3 | false |
| UnnecessaryModifier | 2 | true |
| CommentedOutCode | 2 | false |
| FinalMethodInFinalClass | 2 | false |
| FinalPrivateMethod | 2 | false |
| UnnecessaryReturn | 2 | true |
| TrivialStringConcatenation | 2 | false |
| DuplicateCondition | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| DuplicateThrows | 2 | false |
| StringConcatenationInLoops | 2 | false |
| StringConcatenationInsideStringBufferAppend | 2 | false |
| JavadocReference | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| RedundantCollectionOperation | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| ImplicitArrayToString | 2 | false |
| UnnecessaryContinue | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| WrapperTypeMayBePrimitive | 1 | false |
| EmptyStatementBody | 1 | false |
| IgnoreResultOfCall | 1 | false |
| MalformedFormatString | 1 | false |
| RedundantMethodOverride | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
| DanglingJavadoc | 1 | false |
| WrongPackageStatement | 1 | false |
| TrivialIf | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| CachedNumberConstructorCall | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| BusyWait | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Entity\[entities.size()\]'
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
              .build());
    }
    datastore.add(entities.toArray(new Entity[entities.size()]));
  }

```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
      Key key = getCountsKey(jobId, dataType);
      Entity current = datastore.get(key);
      Integer oldCount = 0;

      if (current != null && current.getNames().contains(COUNTS_FIELD)) {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
     * batch.
     */
    public long uploadToAlbum(
        UUID jobId,
        TokensAndUrlAuthData authData,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/idempotentexecutor/IdempotentImportExecutorExtension.java`
#### Snippet
```java
public interface IdempotentImportExecutorExtension extends BootExtension {
  IdempotentImportExecutor getIdempotentImportExecutor(ExtensionContext extensionContext);
  public default IdempotentImportExecutor getRetryingIdempotentImportExecutor(
      ExtensionContext extensionContext) {
    return null;
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsImporter.java`
#### Snippet
```java
              .collect(toList());

      if (!problems.isEmpty()) {
        // TODO log problems
      }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (7 lines)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/SolidUtilities.java`
#### Snippet
```java
    self.listProperties(model.createProperty("http://www.w3.org/ns/ldp#contains"))
        .forEachRemaining(s-> results.add(s.getResource()));
    /*List<Statement> containedStatements = getProperties(
        self,
        "http://www.w3.org/ns/ldp#contains");
```

### CommentedOutCode
Commented out code (4 lines)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java
    }

    // people.stream()
    //     .collect(Collectors.toMap(
    //         p -> importPerson(idempotentExecutor, p, baseUrl, personDirectory, utilities),
```

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
    Request.Builder requestBuilder = new Request.Builder().url(url);
    requestBuilder.header("Authorization", "Bearer " + credential.getAccessToken());
    requestBuilder.header("X-Koofr-Version", "2.1");
    return requestBuilder;
  }
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `extensions/data-transfer/portability-data-transfer-daybook/src/main/java/org/datatransferproject/transfer/daybook/photos/DaybookPhotosImporter.java`
#### Snippet
```java

    Request.Builder requestBuilder = new Request.Builder().url(baseUrl);
    requestBuilder.header("token", authData.getAccessToken());

    FormBody.Builder builder =
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `extensions/data-transfer/portability-data-transfer-daybook/src/main/java/org/datatransferproject/transfer/daybook/social/DaybookPostsImporter.java`
#### Snippet
```java

    Request.Builder requestBuilder = new Request.Builder().url(baseUrl);
    requestBuilder.header("token", authData.getAccessToken());

    FormBody.Builder builder =
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `libraries/security/src/main/java/org/datatransferproject/security/EncrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `libraries/security/src/main/java/org/datatransferproject/security/DecrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `value` in enum 'Level'
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
    DEBUG(0);

    int value;

    Level(int value) {
```

### NonFinalFieldInEnum
Non-final field `defaultValue` in enum 'BaseMultilingualString'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/i18n/BaseMultilingualString.java`
#### Snippet
```java

  private String key;
  private String defaultValue;

  BaseMultilingualString(String key, String defaultValue) {
```

### NonFinalFieldInEnum
Non-final field `key` in enum 'BaseMultilingualString'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/i18n/BaseMultilingualString.java`
#### Snippet
```java
  CopyOf("copyof", "Copy of {0}");

  private String key;
  private String defaultValue;

```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `libraries/security/src/main/java/org/datatransferproject/security/EncrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

### FinalPrivateMethod
'private' method declared `final`
in `libraries/security/src/main/java/org/datatransferproject/security/DecrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

## RuleId[id=Deprecation]
### Deprecation
'Long(long)' is deprecated
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
      } else if (entity.getValue(property) instanceof LongValue) {
        // This conversion is safe because of integer to long conversion above
        builder.put(property, new Long(entity.getLong(property)).intValue());
      } else if (entity.getValue(property) instanceof DoubleValue) {
        builder.put(property, (Double) entity.getDouble(property));
```

### Deprecation
'setFileName(java.lang.String)' is deprecated
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
      UploadMediaItemRequest uploadRequest =
          UploadMediaItemRequest.newBuilder()
              .setFileName(video.getName())
              .setDataFile(new RandomAccessFile(tmp, "r"))
              .build();
```

### Deprecation
'sessionSecretKey()' is deprecated
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/GenerateServiceAuthDataAction.java`
#### Snippet
```java

      // Obtain the session key for this job
      String encodedSessionKey = job.jobAuthorization().sessionSecretKey();
      SecretKey key =
          symmetricKeyGenerator.parse(BaseEncoding.base64Url().decode(encodedSessionKey));
```

### Deprecation
'setSessionSecretKey(java.lang.String)' is deprecated
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/CreateTransferJobAction.java`
#### Snippet
```java
    JobAuthorization jobAuthorization =
        JobAuthorization.builder()
            .setSessionSecretKey(encodedSessionKey)
            .setEncryptionScheme(encryptionScheme)
            .setState(JobAuthorization.State.INITIAL)
```

### Deprecation
'sessionSecretKey()' is deprecated
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/PortabilityJob.java`
#### Snippet
```java
            .put(AUTHORIZATION_STATE, jobAuthorization().state().toString())
            .put(JOB_STATE, state().toString());
    if (jobAuthorization().sessionSecretKey() != null) {
      builder.put(ENCRYPTED_SESSION_KEY, jobAuthorization().sessionSecretKey());
    }
```

### Deprecation
'sessionSecretKey()' is deprecated
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/PortabilityJob.java`
#### Snippet
```java
            .put(JOB_STATE, state().toString());
    if (jobAuthorization().sessionSecretKey() != null) {
      builder.put(ENCRYPTED_SESSION_KEY, jobAuthorization().sessionSecretKey());
    }

```

### Deprecation
'setSessionSecretKey(java.lang.String)' is deprecated
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/PortabilityJob.java`
#### Snippet
```java
                .setEncryptedAuthData(encryptedAuthData)
                .setInstanceId(instanceId)
                .setSessionSecretKey((String) properties.get(ENCRYPTED_SESSION_KEY))
                .setAuthPublicKey(encodedPublicKey)
                .setEncryptedInitialExportAuthData(encryptedExportInitialAuthData)
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java
    }

    return;
  }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java
    }

    return;
  }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `extensions/data-transfer/portability-data-transfer-twitter/src/main/java/org/datatransferproject/transfer/twitter/TwitterPhotosExporter.java`
#### Snippet
```java
    Paging paging = new Paging(pageNumber, PAGE_SIZE);
    try {
      String page = "" + pageNumber;
      long id = twitterApi.getId();
      monitor.debug(() -> format("Getting tweets for %s (page %s)", id, page));
```

### TrivialStringConcatenation
Empty string used in concatenation
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/common/RequestHelper.java`
#### Snippet
```java
    headers.put("Content-Type", "application/json");
    request.put("headers", headers);
    request.put("id", id + "");
    request.put("method", "POST");
    request.put("url", url);
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `libraries/security/src/main/java/org/datatransferproject/security/EncrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

### FinalStaticMethod
'static' method declared `final`
in `libraries/security/src/main/java/org/datatransferproject/security/DecrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

### FinalStaticMethod
'static' method declared `final`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsExport.java`
#### Snippet
```java
  }

  final static VCard parsePerson(Resource r) {
    VCard vcard = new VCard();

```

### FinalStaticMethod
'static' method declared `final`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java

  @VisibleForTesting
  final static Model getPersonModel(VCard vcard) {
    Model personModel = ModelFactory.createDefaultModel();
    Resource r = personModel.createResource("#this");
```

### FinalStaticMethod
'static' method declared `final`
in `portability-api/src/main/java/org/datatransferproject/api/ApiMain.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static final <T> TypeLiteral<Set<T>> setOf(Class<T> type) {
    return (TypeLiteral<Set<T>>) TypeLiteral.get(Types.setOf(type));
  }
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleAppCredentialStore.java`
#### Snippet
```java
                new CacheLoader<String, String>() {
                  @Override
                  public String load(String key) throws Exception {
                    return lookupSecret(key);
                  }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleAppCredentialStore.java`
#### Snippet
```java
                new CacheLoader<String, String>() {
                  @Override
                  public String load(String key) throws Exception {
                    return lookupSecret(key);
                  }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleAppCredentialStore.java`
#### Snippet
```java
                new CacheLoader<String, String>() {
                  @Override
                  public String load(String key) throws Exception {
                    return lookupKey(key);
                  }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleAppCredentialStore.java`
#### Snippet
```java
                new CacheLoader<String, String>() {
                  @Override
                  public String load(String key) throws Exception {
                    return lookupKey(key);
                  }
```

### NullableProblems
Primitive type members cannot be annotated
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/exceptions/AppleHttpException.java`
#### Snippet
```java
  private final int responseStatus;

  public AppleHttpException(@NotNull final String message, @NotNull final Throwable cause, @NotNull final int responseStatus) {
    super(message, cause);
    this.responseStatus = responseStatus;
```

### NullableProblems
Primitive type members cannot be annotated
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
   * @throws AppleContentException
   */
  @Nullable
  public void uploadBytes(@NotNull final byte[] uploadBytes) throws AppleContentException {
    try {
```

### NullableProblems
Primitive type members cannot be annotated
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
   */
  @Nullable
  public void uploadBytes(@NotNull final byte[] uploadBytes) throws AppleContentException {
    try {
      outputStream.write(uploadBytes);
```

### NullableProblems
Primitive type members cannot be annotated
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
   * @throws AppleContentException
   */
  @Nullable
  public byte[] downloadBytes(final int maxBytesToRead) throws AppleContentException {
    final byte[] buffer = new byte[maxBytesToRead];
```

### NullableProblems
Primitive type members cannot be annotated
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/AppleMediaInterface.java`
#### Snippet
```java
  }

  private String sendPostRequest(@NotNull String url, @NotNull final byte[] requestData)
      throws IOException, AppleHttpException {

```

### NullableProblems
Primitive type members cannot be annotated
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/AppleMediaInterface.java`
#### Snippet
```java

  public byte[] makePhotosServicePostRequest(
      @NotNull final String url, @NotNull final byte[] requestData)
      throws IOException, CopyExceptionWithFailureReason {
    byte[] responseData = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  @Nullable private String url;
  private Account account;
  @Nullable private String inReplyToId;
  @Nullable private String inReplyToAccountId;
  private String content;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  private String id;
  private String uri;
  @Nullable private String url;
  private Account account;
  @Nullable private String inReplyToId;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  private Account account;
  @Nullable private String inReplyToId;
  @Nullable private String inReplyToAccountId;
  private String content;
  private String createdAtTime;
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/exception/BackblazeCredentialsException.java`
#### Snippet
```java

  @Override
  public String getFailureReason() {
    return "INVALID_MANUAL_CREDENTIALS";
  }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobPollingService.java`
#### Snippet
```java

  @Override
  protected Scheduler scheduler() {
    return scheduler;
  }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobCancelWatchingService.java`
#### Snippet
```java

  @Override
  protected Scheduler scheduler() {
    return scheduler;
  }
```

### NullableProblems
Overridden methods are not annotated
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/CopyExceptionWithFailureReason.java`
#### Snippet
```java
  }

  @Nonnull
  public abstract String getFailureReason();
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/photos/PhotoModel.java`
#### Snippet
```java
  private final boolean inTempStore;
  private String dataId;
  @Nullable private String sha1;  // SHA-1 hash in Hex (base16).
  private Date uploadedTime;

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/auth/portability-auth-imgur/src/main/java/org.datatransferproject.auth.imgur/ImgurOAuthConfig.java`
#### Snippet
```java
/**
 * Class that provides Imgur-specific information for OAuth2
 * See https://apidocs.imgur.com/#authorization-and-oauth
 */
public class ImgurOAuthConfig implements OAuth2Config {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/auth/portability-auth-flickr/src/main/java/org/datatransferproject/auth/flickr/FlickrOAuthConfig.java`
#### Snippet
```java
/**
 * Class that supplies Flickr-specific OAuth1 info
 * See https://www.flickr.com/services/api/auth.oauth.html
 */
public class FlickrOAuthConfig implements OAuth1Config {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/auth/portability-auth-smugmug/src/main/java/org/datatransferproject/auth/smugmug/SmugMugOAuthConfig.java`
#### Snippet
```java
/**
 * Class that supplies SmugMug-specific OAuth1 info
 * See https://api.smugmug.com/api/v2/doc/tutorial/authorization.html
 */
public class SmugMugOAuthConfig implements OAuth1Config {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/auth/portability-auth-twitter/src/main/java/org/datatransferproject/auth/twitter/TwitterOAuthConfig.java`
#### Snippet
```java
/**
 * Class that supplies Twitter-specific OAuth1 info
 * See https://developer.twitter.com/en/docs/basics/authentication/overview/3-legged-oauth
 * and https://developer.twitter.com/en/docs/basics/authentication/api-reference
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/auth/portability-auth-twitter/src/main/java/org/datatransferproject/auth/twitter/TwitterOAuthConfig.java`
#### Snippet
```java
 * Class that supplies Twitter-specific OAuth1 info
 * See https://developer.twitter.com/en/docs/basics/authentication/overview/3-legged-oauth
 * and https://developer.twitter.com/en/docs/basics/authentication/api-reference
 */
public class TwitterOAuthConfig implements OAuth1Config {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
/**
 * Generates signatures hash based on the algorithm described:
 * https://www.rememberthemilk.com/services/api/authentication.rtm
 */
public final class RememberTheMilkSignatureGenerator {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/model/User.java`
#### Snippet
```java

/**
 * POJO of https://developers.deezer.com/api/user
 */
public class User {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/model/Artist.java`
#### Snippet
```java

/**
 * POJO of: https://developers.deezer.com/api/artist
 */
public class Artist {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/model/Track.java`
#### Snippet
```java

/**
 * POJO of track: https://developers.deezer.com/api/track
 */
public class Track {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/model/Album.java`
#### Snippet
```java

/**
 * POJO of: https://developers.deezer.com/api/album
 */
public class Album {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/model/PlaylistsResponse.java`
#### Snippet
```java
/**
 * Response format for user/me/platlists, see:
 * https://developers.deezer.com/api/explorer?url=user/me
 */
public class PlaylistsResponse {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/model/PlaylistSummary.java`
#### Snippet
```java

/**
 * POJO of: https://developers.deezer.com/api/playlist
 */
public class PlaylistSummary {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
 * A utility wrapper for interacting with the Deezer Api.
 *
 * <p>See: https://developers.deezer.com/api/explorer
 */
public class DeezerApi {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
/**
 * GoogleMusicHttpApi makes HTTP requests to read and write to the public Google Music's "Music
 * Library" APIs, following its documentation at https://musiclibrary.googleapis.com/DO NOT
 * SUBMIT/TODO(critical WIP-feature step): update the URL when available.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/model/SmugMugUserResponse.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonProperty;

/** Results from https://api.smugmug.com/api/v2!authuser */
public class SmugMugUserResponse {

```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Account.java`
#### Snippet
```java
/**
 * Partial POJO representation of
 * https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#account
 */
@JsonIgnoreProperties(ignoreUnknown = true)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
/**
 * Partial POJO representation of
 * https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#status
 */
@JsonIgnoreProperties(ignoreUnknown = true)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/MicrosoftTransmogrificationConfig.java`
#### Snippet
```java

  /**
   * OneDrive has forbidden characters for file names: https://support.office.com/en-us/article/invalid-file-names-and-file-types-in-onedrive-onedrive-for-business-and-sharepoint-64883a5d-228e-48f5-b3d2-eb39e07630fa#invalidcharacters
   */
  private static final String PHOTO_TITLE_FORBIDDEN_CHARACTERS = "~\"#%&*:<>?/\\{|}";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/driveModels/MicrosoftPhotoMetadata.java`
#### Snippet
```java
/**
 * Microsoft photo metadata resource type Ref:
 * https://docs.microsoft.com/en-us/graph/api/resources/photo?view=graph-rest-1.0
 */
public class MicrosoftPhotoMetadata {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/driveModels/MicrosoftFileMetadata.java`
#### Snippet
```java
/**
 * Microsoft file metadata resource type Ref:
 * https://docs.microsoft.com/en-us/graph/api/resources/file?view=graph-rest-1.0
 */
public class MicrosoftFileMetadata {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/driveModels/MicrosoftDriveItemsResponse.java`
#### Snippet
```java
/**
 * Response returned for Drive Item objects in Microsoft Graph API. Ref:
 * https://docs.microsoft.com/en-us/graph/api/resources/driveitem?view=graph-rest-1.0
 */
public class MicrosoftDriveItemsResponse {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/driveModels/MicrosoftVideoMetadata.java`
#### Snippet
```java
/**
 * Microsoft video metadata resource type Ref:
 * https://docs.microsoft.com/en-us/graph/api/resources/video?view=graph-rest-1.0
 */
public class MicrosoftVideoMetadata {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/driveModels/MicrosoftSpecialFolder.java`
#### Snippet
```java
/**
 * Special Folder names for access to well-known folders in OneDrive. Ref:
 * https://docs.microsoft.com/en-us/graph/api/drive-get-specialfolder?view=graph-rest-1.0&tabs=http
 */
public class MicrosoftSpecialFolder {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/driveModels/MicrosoftDriveFolder.java`
#### Snippet
```java
/**
 * Folder object in Microsoft Graph API. Ref:
 * https://docs.microsoft.com/en-us/graph/api/resources/folder?view=graph-rest-1.0
 */
public class MicrosoftDriveFolder {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsImporter.java`
#### Snippet
```java
/**
 * Performs a batch import of contacts using the Microsoft Graph API. For details see:
 * https://developer.microsoft.com/en-us/graph/docs/concepts/json_batching.
 */
public class MicrosoftContactsImporter implements Importer<TokenAuthData, ContactsModelWrapper> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/driveModels/MicrosoftDriveItem.java`
#### Snippet
```java
/**
 * Drive Item object in Microsoft Graph API. Ref:
 * https://docs.microsoft.com/en-us/graph/api/resources/driveitem?view=graph-rest-1.0
 */
public class MicrosoftDriveItem {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarModelTransformer.java`
#### Snippet
```java
/**
 * Maps from a Graph API calendar resource as defined by:
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/beta/resources/calendar.
 */
public class ToCalendarModelTransformer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarAttendeeModelTransformer.java`
#### Snippet
```java
/**
 * Maps from a Graph API calendar attendee resource as defined by
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/beta/resources/attendee
 */
public class ToCalendarAttendeeModelTransformer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToGraphCalendarTransformer.java`
#### Snippet
```java
/**
 * Maps from a transfer calendar type to a Graph API calendar resource as defined by:
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/v1.0/resources/calendar.
 */
public class ToGraphCalendarTransformer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarEventTimeTransformer.java`
#### Snippet
```java
 * Maps from a Graph API dateTimeTimeZone resource as defined by microsoft.graph.dateTimeTimeZone
 * defined at
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/v1.0/resources/dateTimeTimeZone
 */
public class ToCalendarEventTimeTransformer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarEventModelTransformer.java`
#### Snippet
```java
/**
 * Maps from a Graph API calendar event resource as defined by:
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/beta/resources/event
 */
public class ToCalendarEventModelTransformer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToVCardAddressTransformer.java`
#### Snippet
```java
/**
 * Maps from a Graph API physical address resource as defined by:
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/v1.0/resources/physicaladdress.
 */
public class ToVCardAddressTransformer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToGraphAddressTransformer.java`
#### Snippet
```java
/**
 * Maps from a VCard Address to a Graph API physical address resource as defined by:
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/v1.0/resources/physicaladdress.
 */
public class ToGraphAddressTransformer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToGraphEventTransformer.java`
#### Snippet
```java
/**
 * Maps from a transfer event type to a Graph API event resource as defined by:
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/v1.0/resources/event.
 */
public class ToGraphEventTransformer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToVCardTransformer.java`
#### Snippet
```java
/**
 * Transforms from a Microsoft Graph contacts resource to a VCard as defined by
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/v1.0/resources/contact.
 *
 * <p>TODO: Handle contact lists (folders)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/model/tasks/TaskSeries.java`
#### Snippet
```java
import java.util.Map;

/** A tasks series, see: https://www.rememberthemilk.com/services/api/tasks.rtm */
public class TaskSeries implements Serializable {

```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
/**
 * Generates signatures hash based on the algorithm described:
 * https://www.rememberthemilk.com/services/api/authentication.rtm
 */
final class RememberTheMilkSignatureGenerator {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToGraphContactTransformer.java`
#### Snippet
```java
/**
 * Maps from a VCard to a Microsoft Graph contacts resource as defined by
 * https://developer.microsoft.com/en-us/graph/docs/api-reference/v1.0/resources/contact.
 */
public class ToGraphContactTransformer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/Fileable.java`
#### Snippet
```java
   * version of this file with standard tools on their PC.
   *
   * See https://en.wikipedia.org/wiki/Media_type
   *
   * NOTE: this should match {@link MediaObject#getEncodingFormat} behavior.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/blob/DtpDigitalDocument.java`
#### Snippet
```java
/**
 * This is intended to by a sub set of schema.org's DigitalDocumentWrapper
 * (see: https://schema.org/DigitalDocument).  Additional fields from the schema.org spec should
 * be added as needed .
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/music/MusicGroup.java`
#### Snippet
```java

/**
 * POJO for https://schema.org/MusicGroup
 */
public class MusicGroup {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/music/MusicRecording.java`
#### Snippet
```java

/**
 * POJO for https://schema.org/MusicRecording
 */
public class MusicRecording {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/music/MusicRelease.java`
#### Snippet
```java

/**
 * POJO for https://schema.org/MusicRelease
 */
public class MusicRelease {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/music/MusicPlaylist.java`
#### Snippet
```java

  /**
   * The same as https://schema.org/dateCreated but of uses java.time.Instant for arbitrary granularity usage
   */
  private final Instant timeCreated;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/music/MusicPlaylist.java`
#### Snippet
```java

  /**
   * The same as https://schema.org/dateModified but of uses java.time.Instant for arbitrary granularity usage
   */
  private final Instant timeUpdated;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/music/MusicPlaylist.java`
#### Snippet
```java

/**
 * POJO for https://schema.org/MusicPlaylist
 */
public class MusicPlaylist {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/MusicRecording.java`
#### Snippet
```java

/**
 * POJO for https://schema.org/MusicRecording
 */
public class MusicRecording extends CreativeWork {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/MusicAlbum.java`
#### Snippet
```java
import org.datatransferproject.types.common.models.CreativeWork;
/**
 * POJO https://schema.org/MusicAlbum
 */
public class MusicAlbum extends CreativeWork {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/MusicGroup.java`
#### Snippet
```java

/**
 * POJO for https://schema.org/MusicGroup
 */
public class MusicGroup {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/CreativeWork.java`
#### Snippet
```java

/**
 * POJO of https://schema.org/CreativeWork
 */
public class CreativeWork {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
/**
 * Class that stores and contains utilities for calendar recurrence information. All terminology and
 * vocabulary comes from RFC 5545. See https://tools.ietf.org/html/rfc5545 for further information.
 */
public class RecurrenceRule {
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `createResponse.getError() != null`
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/playlists/DeezerPlaylistImporter.java`
#### Snippet
```java
    try {
      InsertResponse createResponse = api.createPlaylist("Imported - " + playlist.getHeadline());
      if (createResponse.getError() != null) {
        throw new IOException("problem creating playlist: " + playlist + " error: "
            + createResponse.getError());
```

### DuplicateCondition
Duplicate condition `createResponse.getError() != null`
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/playlists/DeezerPlaylistImporter.java`
#### Snippet
```java
            + createResponse.getError());
      }
      if (createResponse.getError() != null) {
        throw new IOException("Problem creating playlist: "
            + playlist + ": " + createResponse.getError());
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java
public class AuthTestDriver {

  private String clientId;
  private String secret;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java

  private String clientId;
  private String secret;

  private String callbackHost;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/AppleInterfaceFactory.java`
#### Snippet
```java
public class AppleInterfaceFactory {

  private static String errorMessage = "%s is required";
  private Map<UUID, AppleBaseInterface> interfacesByAuthData = new HashMap<>();
  public synchronized AppleMediaInterface getOrCreateMediaInterface(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java
  private final Monitor monitor;

  private int httpPort = 8080; // TODO configure

  private Server server;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/FlickrTransferExtension.java`
#### Snippet
```java
  private Importer importer;
  private Exporter exporter;
  private TemporaryPerJobDataStore jobStore;
  private boolean initialized = false;
  private AppCredentials appCredentials;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/FlickrTransferExtension.java`
#### Snippet
```java
  private TemporaryPerJobDataStore jobStore;
  private boolean initialized = false;
  private AppCredentials appCredentials;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/drive/DriveImporter.java`
#### Snippet
```java
  private final GoogleCredentialFactory credentialFactory;
  private final TemporaryPerJobDataStore jobStore;
  private final Monitor monitor;

  // Don't access this directly, instead access via getDriveInterface.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/model/SmugMugAlbumResponse.java`
#### Snippet
```java
public class SmugMugAlbumResponse {
  private final String uri;
  private final String locator;
  private final String locatorType;
  private final SmugMugAlbum album;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/model/SmugMugAlbumResponse.java`
#### Snippet
```java
  private final String uri;
  private final String locator;
  private final String locatorType;
  private final SmugMugAlbum album;
  
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/data-transfer/portability-data-transfer-spotify/src/main/java/org/datatransferproject/transfer/spotify/playlists/SpotifyPlaylistImporter.java`
#### Snippet
```java
public class SpotifyPlaylistImporter
    implements Importer<TokensAndUrlAuthData, PlaylistContainerResource> {
  private final Monitor monitor;
  private final SpotifyApi spotifyApi;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java
  private final HttpTransport httpTransport = new NetHttpTransport();
  private final Credential credential;
  private final JsonFactory jsonFactory;

  MicrosoftMediaInterface(Credential credential, JsonFactory jsonFactory) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java
  private final HttpTransport httpTransport = new NetHttpTransport();
  private final Credential credential;
  private final JsonFactory jsonFactory;

  MicrosoftPhotosInterface(Credential credential, JsonFactory jsonFactory) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalTempFileStore.java`
#### Snippet
```java
  void writeInputStream(String filename, InputStream inputStream) throws IOException {
    File file = new File(TEMP_DIR + filename);
    file.createNewFile();
    try (OutputStream outputStream = new FileOutputStream(file)) {
      byte[] buffer = new byte[1024];
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `portability-types-client/src/main/java/org/datatransferproject/types/client/transfer/ReservedWorker.java`
#### Snippet
```java

    @JsonCreator
    public ReservedWorker(@JsonProperty(value = "publicKey", required = false) String publicKey) {
        this.publicKey = publicKey;
    }
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `portability-types-client/src/main/java/org/datatransferproject/types/client/transfer/CreateTransferJob.java`
#### Snippet
```java
      @JsonProperty(value = "importCallbackUrl", required = true) String importCallbackUrl,
      @JsonProperty(value = "dataType", required = true) DataVertical dataType,
      @JsonProperty(value = "exportInformation", required = false) ExportInformation exportInformation,
      @JsonProperty(value = "encryptionScheme", required = true) String encryptionScheme) {
    this.exportService = exportService;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `portability-types-common/src/main/java/org/datatransferproject/types/common/PortableType.java`
#### Snippet
```java
 * key for de/serialization.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ptype")
public abstract class PortableType implements Serializable {}

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/retry/RetryStrategy.java`
#### Snippet
```java
 */
@JsonTypeInfo(use = Id.NAME,
    include = As.PROPERTY,
    property = "type",
    visible = true)
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too few arguments for format string (found: 2, expected: 3)
in `extensions/data-transfer/portability-data-transfer-spotify/src/main/java/org/datatransferproject/transfer/spotify/playlists/SpotifyPlaylistExporter.java`
#### Snippet
```java
      monitor.debug(
          () ->
              format(
                  "Fetching playlist's %s tracks with offset %s, next: %s",
                  playlistId, finalOffset));
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `contentLength()` is identical to its super method
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/InputStreamRequestBody.java`
#### Snippet
```java

  @Override
  public long contentLength() throws IOException {
    return -1;
  }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugPhotosImporter.java`
#### Snippet
```java
    int depth = 0;
    while (albumTempData.getPhotoCount() >= transmogrificationConfig.getAlbumMaxSize()) {
      if (albumTempData.getOverflowAlbumExportId() == null) {
        PhotoAlbum newAlbum =
            createOverflowAlbum(
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/calendar/MicrosoftCalendarImporter.java`
#### Snippet
```java
    RequestHelper.BatchResponse eventResponse =
        RequestHelper.batchRequest(authData, eventRequests, baseUrl, client, objectMapper);
    if (ImportResult.ResultType.OK != eventResponse.getResult().getType()) {
      // TODO log problems
      return eventResponse.getResult();
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    if (!exportInformation.isPresent()) {
      // Make list of photos contained in albums so they are not exported twice later on
      populateContainedMediaList(jobId, authData);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    if (!exportInformation.isPresent()) {
      // Make list of photos contained in albums so they are not exported twice later on
      populateContainedPhotosList(jobId, authData);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java
  public ExportResult<CalendarContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) {
    if (!exportInformation.isPresent()) {
      return exportCalendars(authData, Optional.empty());
    } else {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
      UploadMediaItemResponse uploadResponse = photosLibraryClient.uploadMediaItem(uploadRequest);
      String uploadToken;
      if (uploadResponse.getError().isPresent() || !uploadResponse.getUploadToken().isPresent()) {
        Error error = uploadResponse.getError().orElse(null);

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java
    Preconditions.checkNotNull(authData);

    if (!exportInformation.isPresent()) {
      // No export information if at the start of a bulk export
      // Start by getting the list of albums to export
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/photos/InstagramPhotoExporter.java`
#### Snippet
```java
    List<PhotoAlbum> albums = new ArrayList<>();

    if (!photos.isEmpty() && !pageData.isPresent()) {
      albums.add(
          new PhotoAlbum(
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  public ExportResult<MediaContainerResource> export(UUID jobId, TokensAndUrlAuthData authData,
      Optional<ExportInformation> exportInformation) throws IOException {
    if (!exportInformation.isPresent()) {
      return exportOneDrivePhotos(authData, Optional.empty(), Optional.empty(), jobId);
    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws IOException {
    if (!exportInformation.isPresent()) {
      return exportOneDrivePhotos(authData, Optional.empty(), Optional.empty(), jobId);
    }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.cloud.storage.CryptoKeyStore;`
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleAppSecretDecrypter.java`
#### Snippet
```java
import java.io.IOException;
import org.datatransferproject.cloud.google.GoogleCloudExtensionModule.ProjectId;
import org.datatransferproject.spi.cloud.storage.CryptoKeyStore;

/** Decrypts app secrets using Google Cloud KMS. */
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalAppCredentialStore.java`
#### Snippet
```java

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalAppCredentialStore.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalAppCredentialStore.java`
#### Snippet
```java
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

```

### UNUSED_IMPORT
Unused import `import java.util.Properties;`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalAppCredentialStore.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.Objects;`
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/AppleInterfaceFactory.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.datatransferproject.api.launcher.Monitor;
```

### UNUSED_IMPORT
Unused import `import java.net.URI;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.transfer.JobMetadata;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import org.datatransferproject.api.launcher.Monitor;
import org.datatransferproject.datatransfer.backblaze.exception.BackblazeCredentialsException;
import org.datatransferproject.transfer.JobMetadata;
import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
```

### UNUSED_IMPORT
Unused import `import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.backblaze.exception.BackblazeCredentialsException;
import org.datatransferproject.transfer.JobMetadata;
import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
```

### UNUSED_IMPORT
Unused import `import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import org.datatransferproject.transfer.JobMetadata;
import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;
```

### UNUSED_IMPORT
Unused import `import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.core.sync.RequestBody;
```

### UNUSED_IMPORT
Unused import `import software.amazon.awssdk.regions.Region;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;
```

### UNUSED_IMPORT
Unused import `import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java
package org.datatransferproject.datatransfer.google.common;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
```

### UNUSED_IMPORT
Unused import `import com.google.api.client.http.HttpTransport;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
```

### UNUSED_IMPORT
Unused import `import com.google.api.client.json.JsonFactory;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
```

### UNUSED_IMPORT
Unused import `import com.google.api.client.util.store.DataStoreFactory;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.FileDataStoreFactory;

```

### UNUSED_IMPORT
Unused import `import com.google.api.client.util.store.FileDataStoreFactory;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.FileDataStoreFactory;

/**
```

### UNUSED_IMPORT
Unused import `import static java.lang.String.format;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
package org.datatransferproject.datatransfer.google.common.gphotos;

import static java.lang.String.format;
import static org.datatransferproject.datatransfer.google.photos.GooglePhotosInterface.ERROR_HASH_MISMATCH;
import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadBatchOfVideos;
```

### UNUSED_IMPORT
Unused import `import static org.datatransferproject.datatransfer.google.photos.GooglePhotosInterface.ERROR_HASH_MI...`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java

import static java.lang.String.format;
import static org.datatransferproject.datatransfer.google.photos.GooglePhotosInterface.ERROR_HASH_MISMATCH;
import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadBatchOfVideos;

```

### UNUSED_IMPORT
Unused import `import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadBatchOf...`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import static java.lang.String.format;
import static org.datatransferproject.datatransfer.google.photos.GooglePhotosInterface.ERROR_HASH_MISMATCH;
import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadBatchOfVideos;

import com.google.api.gax.core.FixedCredentialsProvider;
```

### UNUSED_IMPORT
Unused import `import com.google.api.gax.core.FixedCredentialsProvider;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadBatchOfVideos;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.json.JsonFactory;
```

### UNUSED_IMPORT
Unused import `import com.google.api.client.auth.oauth2.Credential;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.json.JsonFactory;
import com.google.common.annotations.VisibleForTesting;
```

### UNUSED_IMPORT
Unused import `import com.google.api.client.json.JsonFactory;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.json.JsonFactory;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
```

### UNUSED_IMPORT
Unused import `import com.google.common.annotations.VisibleForTesting;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.json.JsonFactory;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
```

### UNUSED_IMPORT
Unused import `import com.google.common.base.Preconditions;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import com.google.api.client.json.JsonFactory;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Iterators;
```

### UNUSED_IMPORT
Unused import `import com.google.rpc.Code;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import com.google.common.collect.UnmodifiableIterator;
import com.google.photos.library.v1.PhotosLibraryClient;
import com.google.rpc.Code;
import java.io.IOException;
import java.io.InputStream;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import com.google.photos.library.v1.PhotosLibraryClient;
import com.google.rpc.Code;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import com.google.rpc.Code;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Function;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import java.util.Map.Entry;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.lang3.StringUtils;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.datatransferproject.api.launcher.Monitor;
import org.datatransferproject.datatransfer.google.common.GoogleCredentialFactory;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.api.launcher.Monitor;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.datatransferproject.api.launcher.Monitor;
import org.datatransferproject.datatransfer.google.common.GoogleCredentialFactory;
import org.datatransferproject.datatransfer.google.common.GooglePhotosImportUtils;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.datatransfer.google.common.GoogleCredentialFactory;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.apache.commons.lang3.StringUtils;
import org.datatransferproject.api.launcher.Monitor;
import org.datatransferproject.datatransfer.google.common.GoogleCredentialFactory;
import org.datatransferproject.datatransfer.google.common.GooglePhotosImportUtils;
import org.datatransferproject.datatransfer.google.mediaModels.BatchMediaItemResponse;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.datatransfer.google.common.GooglePhotosImportUtils;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.api.launcher.Monitor;
import org.datatransferproject.datatransfer.google.common.GoogleCredentialFactory;
import org.datatransferproject.datatransfer.google.common.GooglePhotosImportUtils;
import org.datatransferproject.datatransfer.google.mediaModels.BatchMediaItemResponse;
import org.datatransferproject.datatransfer.google.mediaModels.GoogleAlbum;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.datatransfer.google.mediaModels.BatchMediaItemResponse;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.google.common.GoogleCredentialFactory;
import org.datatransferproject.datatransfer.google.common.GooglePhotosImportUtils;
import org.datatransferproject.datatransfer.google.mediaModels.BatchMediaItemResponse;
import org.datatransferproject.datatransfer.google.mediaModels.GoogleAlbum;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItem;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.datatransfer.google.mediaModels.GoogleAlbum;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.google.common.GooglePhotosImportUtils;
import org.datatransferproject.datatransfer.google.mediaModels.BatchMediaItemResponse;
import org.datatransferproject.datatransfer.google.mediaModels.GoogleAlbum;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItem;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemResult;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItem;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.google.mediaModels.BatchMediaItemResponse;
import org.datatransferproject.datatransfer.google.mediaModels.GoogleAlbum;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItem;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemResult;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemUpload;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemResult;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.google.mediaModels.GoogleAlbum;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItem;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemResult;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemUpload;
import org.datatransferproject.datatransfer.google.mediaModels.Status;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemUpload;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItem;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemResult;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemUpload;
import org.datatransferproject.datatransfer.google.mediaModels.Status;
import org.datatransferproject.datatransfer.google.photos.GooglePhotosInterface;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.datatransfer.google.mediaModels.Status;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemResult;
import org.datatransferproject.datatransfer.google.mediaModels.NewMediaItemUpload;
import org.datatransferproject.datatransfer.google.mediaModels.Status;
import org.datatransferproject.datatransfer.google.photos.GooglePhotosInterface;
import org.datatransferproject.datatransfer.google.photos.PhotoResult;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.datatransfer.google.photos.PhotoResult;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.google.mediaModels.Status;
import org.datatransferproject.datatransfer.google.photos.GooglePhotosInterface;
import org.datatransferproject.datatransfer.google.photos.PhotoResult;
import org.datatransferproject.spi.cloud.connection.ConnectionProvider;
import org.datatransferproject.spi.cloud.storage.JobStore;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.cloud.connection.ConnectionProvider;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.google.photos.GooglePhotosInterface;
import org.datatransferproject.datatransfer.google.photos.PhotoResult;
import org.datatransferproject.spi.cloud.connection.ConnectionProvider;
import org.datatransferproject.spi.cloud.storage.JobStore;
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.cloud.storage.JobStore;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.google.photos.PhotoResult;
import org.datatransferproject.spi.cloud.connection.ConnectionProvider;
import org.datatransferproject.spi.cloud.storage.JobStore;
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore;
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore.InputStreamWrapper;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.cloud.connection.ConnectionProvider;
import org.datatransferproject.spi.cloud.storage.JobStore;
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore;
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore.InputStreamWrapper;
import org.datatransferproject.spi.cloud.types.PortabilityJob;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore.InputStreamWrapper;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.cloud.storage.JobStore;
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore;
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore.InputStreamWrapper;
import org.datatransferproject.spi.cloud.types.PortabilityJob;
import org.datatransferproject.spi.transfer.i18n.BaseMultilingualDictionary;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.cloud.types.PortabilityJob;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore;
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore.InputStreamWrapper;
import org.datatransferproject.spi.cloud.types.PortabilityJob;
import org.datatransferproject.spi.transfer.i18n.BaseMultilingualDictionary;
import org.datatransferproject.spi.transfer.idempotentexecutor.IdempotentImportExecutor;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.i18n.BaseMultilingualDictionary;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.cloud.storage.TemporaryPerJobDataStore.InputStreamWrapper;
import org.datatransferproject.spi.cloud.types.PortabilityJob;
import org.datatransferproject.spi.transfer.i18n.BaseMultilingualDictionary;
import org.datatransferproject.spi.transfer.idempotentexecutor.IdempotentImportExecutor;
import org.datatransferproject.spi.transfer.idempotentexecutor.ItemImportResult;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.idempotentexecutor.ItemImportResult;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.i18n.BaseMultilingualDictionary;
import org.datatransferproject.spi.transfer.idempotentexecutor.IdempotentImportExecutor;
import org.datatransferproject.spi.transfer.idempotentexecutor.ItemImportResult;
import org.datatransferproject.spi.transfer.provider.ImportResult;
import org.datatransferproject.spi.transfer.provider.Importer;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.provider.ImportResult;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.idempotentexecutor.IdempotentImportExecutor;
import org.datatransferproject.spi.transfer.idempotentexecutor.ItemImportResult;
import org.datatransferproject.spi.transfer.provider.ImportResult;
import org.datatransferproject.spi.transfer.provider.Importer;
import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.provider.Importer;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.idempotentexecutor.ItemImportResult;
import org.datatransferproject.spi.transfer.provider.ImportResult;
import org.datatransferproject.spi.transfer.provider.Importer;
import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;
import org.datatransferproject.spi.transfer.types.InvalidTokenException;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.provider.ImportResult;
import org.datatransferproject.spi.transfer.provider.Importer;
import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;
import org.datatransferproject.spi.transfer.types.InvalidTokenException;
import org.datatransferproject.spi.transfer.types.PermissionDeniedException;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.types.InvalidTokenException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.provider.Importer;
import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;
import org.datatransferproject.spi.transfer.types.InvalidTokenException;
import org.datatransferproject.spi.transfer.types.PermissionDeniedException;
import org.datatransferproject.spi.transfer.types.UploadErrorException;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.types.PermissionDeniedException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;
import org.datatransferproject.spi.transfer.types.InvalidTokenException;
import org.datatransferproject.spi.transfer.types.PermissionDeniedException;
import org.datatransferproject.spi.transfer.types.UploadErrorException;
import org.datatransferproject.types.common.DownloadableFile;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.types.UploadErrorException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.types.InvalidTokenException;
import org.datatransferproject.spi.transfer.types.PermissionDeniedException;
import org.datatransferproject.spi.transfer.types.UploadErrorException;
import org.datatransferproject.types.common.DownloadableFile;
import org.datatransferproject.types.common.ImportableItem;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.types.common.ImportableItem;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.types.UploadErrorException;
import org.datatransferproject.types.common.DownloadableFile;
import org.datatransferproject.types.common.ImportableItem;
import org.datatransferproject.types.common.models.media.MediaContainerResource;
import org.datatransferproject.types.common.models.media.MediaAlbum;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.types.common.models.media.MediaContainerResource;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.types.common.DownloadableFile;
import org.datatransferproject.types.common.ImportableItem;
import org.datatransferproject.types.common.models.media.MediaContainerResource;
import org.datatransferproject.types.common.models.media.MediaAlbum;
import org.datatransferproject.types.common.models.photos.PhotoAlbum;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.types.common.models.media.MediaAlbum;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.types.common.ImportableItem;
import org.datatransferproject.types.common.models.media.MediaContainerResource;
import org.datatransferproject.types.common.models.media.MediaAlbum;
import org.datatransferproject.types.common.models.photos.PhotoAlbum;
import org.datatransferproject.types.common.models.photos.PhotoModel;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.types.common.models.photos.PhotoAlbum;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.types.common.models.media.MediaContainerResource;
import org.datatransferproject.types.common.models.media.MediaAlbum;
import org.datatransferproject.types.common.models.photos.PhotoAlbum;
import org.datatransferproject.types.common.models.photos.PhotoModel;
import org.datatransferproject.types.common.models.videos.VideoModel;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.types.common.models.photos.PhotoModel;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.types.common.models.media.MediaAlbum;
import org.datatransferproject.types.common.models.photos.PhotoAlbum;
import org.datatransferproject.types.common.models.photos.PhotoModel;
import org.datatransferproject.types.common.models.videos.VideoModel;
import org.datatransferproject.types.transfer.auth.TokensAndUrlAuthData;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.types.common.models.videos.VideoModel;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
import org.datatransferproject.types.common.models.photos.PhotoAlbum;
import org.datatransferproject.types.common.models.photos.PhotoModel;
import org.datatransferproject.types.common.models.videos.VideoModel;
import org.datatransferproject.types.transfer.auth.TokensAndUrlAuthData;

```

### UNUSED_IMPORT
Unused import `import com.google.api.gax.core.FixedCredentialsProvider;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadBatchOfVideos;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.json.JsonFactory;
```

### UNUSED_IMPORT
Unused import `import com.google.common.base.Strings;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.Iterators;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.photos.library.v1.PhotosLibraryClient;
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.UnmodifiableIterator;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
import com.google.common.base.Strings;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.photos.library.v1.PhotosLibraryClient;
import com.google.rpc.Code;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Function;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
import java.util.Map.Entry;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.datatransferproject.api.launcher.Monitor;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.types.common.DownloadableItem;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.types.PermissionDeniedException;
import org.datatransferproject.spi.transfer.types.UploadErrorException;
import org.datatransferproject.types.common.DownloadableItem;
import org.datatransferproject.types.common.ImportableItem;
import org.datatransferproject.types.common.models.media.MediaContainerResource;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.types.common.models.photos.PhotoAlbum;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
import org.datatransferproject.types.common.models.media.MediaContainerResource;
import org.datatransferproject.types.common.models.media.MediaAlbum;
import org.datatransferproject.types.common.models.photos.PhotoAlbum;
import org.datatransferproject.types.common.models.photos.PhotoModel;
import org.datatransferproject.types.common.models.videos.VideoModel;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mediaModels/BatchMediaItemResponse.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class BatchMediaItemResponse {
```

### UNUSED_IMPORT
Unused import `import com.google.common.base.Strings;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.Iterators;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.rpc.Code;
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.UnmodifiableIterator;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
import com.google.common.base.Strings;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.rpc.Code;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
import java.util.Map.Entry;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.datatransferproject.api.launcher.Monitor;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksImporter.java`
#### Snippet
```java
import org.datatransferproject.types.transfer.auth.TokensAndUrlAuthData;

import java.io.IOException;
import java.util.UUID;

```

### UNUSED_IMPORT
Unused import `import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadVideo;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.buildPhotosLibraryClient;
import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadBatchOfVideos;
import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadVideo;

import com.google.api.gax.core.FixedCredentialsProvider;
```

### UNUSED_IMPORT
Unused import `import com.google.api.gax.core.FixedCredentialsProvider;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import static org.datatransferproject.datatransfer.google.videos.GoogleVideosInterface.uploadVideo;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.InvalidArgumentException;
```

### UNUSED_IMPORT
Unused import `import com.google.api.gax.rpc.ApiException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.UnauthenticatedException;
```

### UNUSED_IMPORT
Unused import `import com.google.api.gax.rpc.InvalidArgumentException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.UnauthenticatedException;
import com.google.auth.oauth2.AccessToken;
```

### UNUSED_IMPORT
Unused import `import com.google.api.gax.rpc.UnauthenticatedException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.UnauthenticatedException;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.UserCredentials;
```

### UNUSED_IMPORT
Unused import `import com.google.auth.oauth2.AccessToken;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.UnauthenticatedException;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.UserCredentials;
import com.google.common.annotations.VisibleForTesting;
```

### UNUSED_IMPORT
Unused import `import com.google.auth.oauth2.UserCredentials;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.api.gax.rpc.UnauthenticatedException;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.UserCredentials;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
```

### UNUSED_IMPORT
Unused import `import com.google.common.base.Preconditions;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.auth.oauth2.UserCredentials;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.ArrayListMultimap;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
```

### UNUSED_IMPORT
Unused import `import com.google.photos.library.v1.proto.BatchCreateMediaItemsResponse;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.common.collect.UnmodifiableIterator;
import com.google.photos.library.v1.PhotosLibraryClient;
import com.google.photos.library.v1.proto.BatchCreateMediaItemsResponse;
import com.google.photos.library.v1.proto.NewMediaItem;
import com.google.photos.library.v1.proto.NewMediaItemResult;
```

### UNUSED_IMPORT
Unused import `import com.google.photos.library.v1.proto.NewMediaItem;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.photos.library.v1.PhotosLibraryClient;
import com.google.photos.library.v1.proto.BatchCreateMediaItemsResponse;
import com.google.photos.library.v1.proto.NewMediaItem;
import com.google.photos.library.v1.proto.NewMediaItemResult;
import com.google.photos.library.v1.upload.UploadMediaItemRequest;
```

### UNUSED_IMPORT
Unused import `import com.google.photos.library.v1.proto.NewMediaItemResult;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.photos.library.v1.proto.BatchCreateMediaItemsResponse;
import com.google.photos.library.v1.proto.NewMediaItem;
import com.google.photos.library.v1.proto.NewMediaItemResult;
import com.google.photos.library.v1.upload.UploadMediaItemRequest;
import com.google.photos.library.v1.upload.UploadMediaItemResponse;
```

### UNUSED_IMPORT
Unused import `import com.google.photos.library.v1.upload.UploadMediaItemRequest;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.photos.library.v1.proto.NewMediaItem;
import com.google.photos.library.v1.proto.NewMediaItemResult;
import com.google.photos.library.v1.upload.UploadMediaItemRequest;
import com.google.photos.library.v1.upload.UploadMediaItemResponse;
import com.google.photos.library.v1.upload.UploadMediaItemResponse.Error;
```

### UNUSED_IMPORT
Unused import `import com.google.photos.library.v1.upload.UploadMediaItemResponse;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.photos.library.v1.proto.NewMediaItemResult;
import com.google.photos.library.v1.upload.UploadMediaItemRequest;
import com.google.photos.library.v1.upload.UploadMediaItemResponse;
import com.google.photos.library.v1.upload.UploadMediaItemResponse.Error;
import com.google.rpc.Code;
```

### UNUSED_IMPORT
Unused import `import com.google.photos.library.v1.upload.UploadMediaItemResponse.Error;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.photos.library.v1.upload.UploadMediaItemRequest;
import com.google.photos.library.v1.upload.UploadMediaItemResponse;
import com.google.photos.library.v1.upload.UploadMediaItemResponse.Error;
import com.google.rpc.Code;
import com.google.rpc.Status;
```

### UNUSED_IMPORT
Unused import `import com.google.rpc.Code;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.photos.library.v1.upload.UploadMediaItemResponse;
import com.google.photos.library.v1.upload.UploadMediaItemResponse.Error;
import com.google.rpc.Code;
import com.google.rpc.Status;
import java.io.File;
```

### UNUSED_IMPORT
Unused import `import com.google.rpc.Status;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.photos.library.v1.upload.UploadMediaItemResponse.Error;
import com.google.rpc.Code;
import com.google.rpc.Status;
import java.io.File;
import java.io.FileNotFoundException;
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.rpc.Code;
import com.google.rpc.Status;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.io.FileNotFoundException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import com.google.rpc.Status;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Collection;
```

### UNUSED_IMPORT
Unused import `import java.io.RandomAccessFile;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.Date;
```

### UNUSED_IMPORT
Unused import `import java.util.Date;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Map.Entry;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import java.util.Map.Entry;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.tuple.Pair;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.lang3.tuple.Pair;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.tuple.Pair;
import org.datatransferproject.api.launcher.Monitor;
import org.datatransferproject.datatransfer.google.common.GooglePhotosImportUtils;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.provider.ImportResult;
import org.datatransferproject.spi.transfer.provider.Importer;
import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;
import org.datatransferproject.spi.transfer.types.InvalidTokenException;
import org.datatransferproject.spi.transfer.types.UploadErrorException;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.types.InvalidTokenException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.provider.Importer;
import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;
import org.datatransferproject.spi.transfer.types.InvalidTokenException;
import org.datatransferproject.spi.transfer.types.UploadErrorException;
import org.datatransferproject.types.common.DownloadableItem;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.types.UploadErrorException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.types.DestinationMemoryFullException;
import org.datatransferproject.spi.transfer.types.InvalidTokenException;
import org.datatransferproject.spi.transfer.types.UploadErrorException;
import org.datatransferproject.types.common.DownloadableItem;
import org.datatransferproject.types.common.models.videos.VideoAlbum;
```

### UNUSED_IMPORT
Unused import `import static com.google.common.base.Preconditions.checkArgument;`
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/social/MastodonHttpUtilities.java`
#### Snippet
```java
package org.datatransferproject.transfer.mastodon.social;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.annotation.JsonIgnoreProperties;`
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/model/tasks/GetListResponse.java`
#### Snippet
```java
package org.datatransferproject.transfer.rememberthemilk.model.tasks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;
import com.google.common.base.MoreObjects;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkService.java`
#### Snippet
```java
import java.net.URL;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import javax.print.DocFlavor.STRING;`
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkService.java`
#### Snippet
```java
import java.util.LinkedHashMap;
import java.util.Map;
import javax.print.DocFlavor.STRING;
import org.datatransferproject.transfer.rememberthemilk.model.tasks.GetListResponse;
import org.datatransferproject.transfer.rememberthemilk.model.tasks.GetListsResponse;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumImageResponse;`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugInterface.java`
#### Snippet
```java
import javax.annotation.Nullable;
import org.datatransferproject.transfer.smugmug.photos.model.*;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumImageResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumsResponse;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumResponse;`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugInterface.java`
#### Snippet
```java
import org.datatransferproject.transfer.smugmug.photos.model.*;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumImageResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumsResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugImageUploadResponse;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumsResponse;`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugInterface.java`
#### Snippet
```java
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumImageResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumsResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugImageUploadResponse;
import org.datatransferproject.types.common.models.photos.PhotoModel;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.transfer.smugmug.photos.model.SmugMugImageUploadResponse;`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugInterface.java`
#### Snippet
```java
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugAlbumsResponse;
import org.datatransferproject.transfer.smugmug.photos.model.SmugMugImageUploadResponse;
import org.datatransferproject.types.common.models.photos.PhotoModel;
import org.datatransferproject.types.transfer.auth.AppCredentials;
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.annotation.JsonCreator;`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/model/SmugMugAlbum.java`
#### Snippet
```java
package org.datatransferproject.transfer.smugmug.photos.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
```

### UNUSED_IMPORT
Unused import `import java.security.PrivateKey;`
in `extensions/security/portability-security-cleartext/src/main/java/org/datatransferproject/security/cleartext/ClearTextAuthDataDecryptService.java`
#### Snippet
```java

import java.io.IOException;
import java.security.PrivateKey;

/** */
```

### UNUSED_IMPORT
Unused import `import java.security.PublicKey;`
in `extensions/security/portability-security-cleartext/src/main/java/org/datatransferproject/security/cleartext/ClearTextPublicKeySerializer.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.security.SecurityException;

import java.security.PublicKey;

/** */
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.annotation.JsonInclude;`
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth2TokenResponse.java`
#### Snippet
```java

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.config.extension.SettingsExtension;`
in `libraries/config/src/main/java/org/datatransferproject/config/FlagBindingModule.java`
#### Snippet
```java
import org.datatransferproject.api.launcher.ExtensionContext;
import org.datatransferproject.api.launcher.Flag;
import org.datatransferproject.config.extension.SettingsExtension;

/**
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.api.launcher.Monitor;`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/idempotentexecutor/IdempotentImportExecutorExtension.java`
#### Snippet
```java
import org.datatransferproject.api.launcher.BootExtension;
import org.datatransferproject.api.launcher.ExtensionContext;
import org.datatransferproject.api.launcher.Monitor;

public interface IdempotentImportExecutorExtension extends BootExtension {
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.api.launcher.Monitor;`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/idempotentexecutor/IdempotentImportExecutorLoader.java`
#### Snippet
```java
import java.util.ServiceLoader;
import org.datatransferproject.api.launcher.ExtensionContext;
import org.datatransferproject.api.launcher.Monitor;

public class IdempotentImportExecutorLoader {
```

### UNUSED_IMPORT
Unused import `import java.security.PrivateKey;`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/security/AuthDataDecryptService.java`
#### Snippet
```java
import org.datatransferproject.types.transfer.auth.AuthDataPair;

import java.security.PrivateKey;

/** Decrypts authentication data for a given scheme. */
```

### UNUSED_IMPORT
Unused import `import java.security.PublicKey;`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/security/PublicKeySerializer.java`
#### Snippet
```java
package org.datatransferproject.spi.transfer.security;

import java.security.PublicKey;

/** Serializes a public key for a given encryption scheme. */
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.cloud.types.PortabilityJob.State;`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobPollingService.java`
#### Snippet
```java
import org.datatransferproject.spi.cloud.types.JobAuthorization;
import org.datatransferproject.spi.cloud.types.PortabilityJob;
import org.datatransferproject.spi.cloud.types.PortabilityJob.State;
import org.datatransferproject.spi.transfer.security.PublicKeySerializer;
import org.datatransferproject.spi.transfer.security.TransferKeyGenerator;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.spi.transfer.idempotentexecutor.IdempotentImportExecutor;`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/WorkerMain.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.extension.TransferExtension;
import org.datatransferproject.spi.transfer.hooks.JobHooks;
import org.datatransferproject.spi.transfer.idempotentexecutor.IdempotentImportExecutor;
import org.datatransferproject.spi.transfer.idempotentexecutor.IdempotentImportExecutorExtension;
import org.datatransferproject.spi.transfer.idempotentexecutor.IdempotentImportExecutorLoader;
```

### UNUSED_IMPORT
Unused import `import static java.lang.String.format;`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityInMemoryDataCopier.java`
#### Snippet
```java
package org.datatransferproject.transfer.copier;

import static java.lang.String.format;

import com.google.inject.Provider;
```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityInMemoryDataCopier.java`
#### Snippet
```java
import com.google.inject.Provider;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;
```

### UNUSED_IMPORT
Unused import `import org.datatransferproject.types.transfer.errors.ErrorDetail;`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityInMemoryDataCopier.java`
#### Snippet
```java
import org.datatransferproject.types.common.models.ContainerResource;
import org.datatransferproject.types.transfer.auth.AuthData;
import org.datatransferproject.types.transfer.errors.ErrorDetail;
import org.datatransferproject.types.transfer.retry.RetryStrategyLibrary;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/media/MediaAlbum.java`
#### Snippet
```java
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/media/MediaAlbum.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import com.google.common.base.Strings;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/photos/PhotoAlbum.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import org.datatransferproject.types.common.ImportableItem;
import com.google.common.base.Strings;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/photos/PhotoAlbum.java`
#### Snippet
```java
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/tasks/TaskModel.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

```

### UNUSED_IMPORT
Unused import `import com.google.common.base.Throwables;`
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/errors/ErrorDetail.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableMap;

```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.ImmutableMap;`
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/errors/ErrorDetail.java`
#### Snippet
```java
import com.google.auto.value.AutoValue;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableMap;

import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/errors/ErrorDetail.java`
#### Snippet
```java
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, String albumId, IOException e) {
    monitor.info(
        () -> format("Can't find album during createPhotos call, album is likely deleted"), e);
    try {
      GoogleAlbum album = getOrCreatePhotosInterface(jobId, authData).getAlbum(albumId);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
          e);
    } catch (Exception ex) {
      monitor.info(() -> format("Can't find album during getAlbum call"), ex);
    }
  }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, String albumId, IOException e) {
    monitor.info(
        () -> format("Can't find album during createPhotos call, album is likely deleted"), e);
    try {
      GoogleAlbum album = getOrCreatePhotosInterface(jobId, authData).getAlbum(albumId);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
          e);
    } catch (Exception ex) {
      monitor.info(() -> format("Can't find album during getAlbum call"), ex);
    }
  }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
              photo));
    } else if (code != 200) {
      monitor.info(() -> String.format("Got an unexpected non-200, non-error response code"));
    }
    // make sure we have a non-null response body
```

### RedundantStringFormatCall
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
          credential.getAccessToken(), item));
    } else if (code != 200) {
      monitor.info(() -> String.format("Got an unexpected non-200, non-error response code"));
    }
    ResponseBody responseBody = response.body();
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.lang.Exception', in the throws list already.
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosImporter.java`
#### Snippet
```java
      AuthData authData,
      PhotosContainerResource data)
      throws Exception, IOException {
    Auth auth;
    try {
```

### DuplicateThrows
There is a more general exception, 'java.lang.Exception', in the throws list already.
in `extensions/data-transfer/portability-data-transfer-spotify/src/main/java/org/datatransferproject/transfer/spotify/playlists/SpotifyPlaylistImporter.java`
#### Snippet
```java
      MusicPlaylist playlist,
      String userId)
      throws Exception, SpotifyWebApiException {
    String playlistId = idempotentExecutor.executeAndSwallowIOExceptions(
        playlist.getIdentifier(),
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    modifiedParams.put("api_key", appCredentials.getKey());

    List<String> orderedKeys = modifiedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### FuseStreamOperations
Stream may be extended replacing 'sort'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java

    List<String> orderedKeys =
        updatedParams.keySet().stream().collect(toCollection(ArrayList::new));
    Collections.sort(orderedKeys);

```

### FuseStreamOperations
Stream may be extended replacing 'sort'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    updatedParams.put(ACCESS_TOKEN_KEY, Preconditions.checkNotNull(credential.getAccessToken()));

    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### FuseStreamOperations
Stream may be extended replacing 'sort'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
    updatedParams.put(ACCESS_TOKEN_KEY, Preconditions.checkNotNull(credential.getAccessToken()));

    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### FuseStreamOperations
Stream may be extended replacing 'sort'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    modifiedParams.put("auth_token", authToken);

    List<String> orderedKeys = modifiedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/blogger/GoogleBloggerImporter.java`
#### Snippet
```java
      content =
          "<a href=\""
              + attachment.getUrl()
              + "\">"
              + attachment.getName()
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/blogger/GoogleBloggerImporter.java`
#### Snippet
```java
              idempotentExecutor.executeAndSwallowIOExceptions(
                  image.toString(), "Image", () -> uploadImage(image, driveInterface, folderId));
          content += "\n<hr/><img src=\"" + newImgSrc + "\">";
        } catch (RuntimeException e) {
          throw new IOException("Couldn't import: " + imageAttachments, e);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `kpg` initializer `null` is redundant
in `extensions/security/portability-security-jwe/src/main/java/org/datatransferproject/security/jwe/JWEKeyGenerator.java`
#### Snippet
```java
  public WorkerKeyPair generate() {
    monitor.debug(() -> "JWEKeyGenerator generate");
    KeyPairGenerator kpg = null;
    try {
      kpg = KeyPairGenerator.getInstance(ALGORITHM);
```

### UnusedAssignment
Variable `kpg` initializer `null` is redundant
in `extensions/security/portability-security-cleartext/src/main/java/org/datatransferproject/security/cleartext/ClearTextKeyGenerator.java`
#### Snippet
```java
  @Override
  public WorkerKeyPair generate() {
    KeyPairGenerator kpg = null;
    try {
      kpg = KeyPairGenerator.getInstance(ALGORITHM);
```

### UnusedAssignment
Variable `obj` initializer `null` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
      } else {
        Blob blob = entity.getBlob(property);
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(blob.asInputStream())) {
          obj = in.readObject();
```

### UnusedAssignment
Variable `inputStream` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosImporter.java`
#### Snippet
```java
      PhotoModel photoModel, UUID jobId, TokensAndUrlAuthData authData, String newAlbumId)
      throws IOException {
    InputStream inputStream = null;
    String albumId = photoModel.getAlbumId();
    String imageDescription = photoModel.getDescription();
```

### UnusedAssignment
Variable `responseString` initializer `""` is redundant
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/AppleMediaInterface.java`
#### Snippet
```java

    HttpURLConnection con = null;
    String responseString = "";
    try {
      URL applePhotosUrl = new URL(url);
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailExporter.java`
#### Snippet
```java
    Gmail gmail = getOrCreateGmail(authData);

    Messages.List request = null;
    try {
      request = gmail.users().messages().list(USER).setMaxResults(PAGE_SIZE);
```

### UnusedAssignment
Variable `response` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailExporter.java`
#### Snippet
```java
    }

    ListMessagesResponse response = null;
    try {
      response = request.execute();
```

### UnusedAssignment
Variable `getResponse` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailExporter.java`
#### Snippet
```java
    // as we can't store all the mail messages in memory at once.
    for (Message listMessage : response.getMessages()) {
      Message getResponse = null;
      try {
        getResponse =
```

### UnusedAssignment
Variable `size` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-daybook/src/main/java/org/datatransferproject/transfer/daybook/social/DaybookPostsImporter.java`
#### Snippet
```java
    Map<String, String> linkMap = new HashMap<>();

    Long size = null;
    String content = activity.getContent() == null ? "" : activity.getContent();
    String title = activity.getTitle() == null ? "" : activity.getTitle();
```

### UnusedAssignment
The value `offset` assigned to `totalFileSize` is never used
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/DataChunk.java`
#### Snippet
```java
    if (offset != 0) {
      chunksToSend.add(new DataChunk(data, offset, chunksRead * CHUNK_SIZE));
      totalFileSize += offset;
      chunksRead++;
    }
```

### UnusedAssignment
The value changed at `chunksRead++` is never used
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/DataChunk.java`
#### Snippet
```java
      chunksToSend.add(new DataChunk(data, offset, chunksRead * CHUNK_SIZE));
      totalFileSize += offset;
      chunksRead++;
    }
    return chunksToSend;
```

### UnusedAssignment
Variable `inputStream` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
    UUID jobId,
    IdempotentImportExecutor idempotentImportExecutor) throws Exception {
    BufferedInputStream inputStream = null;
    if (photo.isInTempStore()) {
      inputStream = new BufferedInputStream(jobStore.getStream(jobId, photo.getFetchableUrl()).getStream());
```

### UnusedAssignment
Variable `inputStream` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
      DownloadableFile item, UUID jobId,
      IdempotentImportExecutor idempotentImportExecutor) throws Exception {
    BufferedInputStream inputStream = null;
    if (item.isInTempStore()) {
      inputStream =
```

### UnusedAssignment
Variable `oldList` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java
      RememberTheMilkService service, IdOnlyContainerResource resource) {
    String oldListId = resource.getId();
    GetListResponse oldList = null;
    try {
      oldList = service.getList(oldListId);
```

### UnusedAssignment
Variable `injector` initializer `null` is redundant
in `portability-transfer/src/main/java/org/datatransferproject/transfer/WorkerMain.java`
#### Snippet
```java
    JobHooks jobHooks = loadJobHooks();

    Injector injector = null;
    try {
      injector =
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
      throws IOException, InvalidTokenException, PermissionDeniedException {

    if (exportInformation.get().getContainerResource() instanceof IdOnlyContainerResource) {
      // if ExportInformation is an id only container, this is a request to export playlist items.
      return exportPlaylistItems(
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `description` is always 'null'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
  public static String trimDescription(String description) {
    if (description == null) {
      return description;
    }
    if (description.length() > 1000) {
```

### ConstantValue
Value `size` is always 'null'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java
                    String.format(SKIPPED_FILE_RESULT_FORMAT, photo.getDataId()));
          } else {
            return ItemImportResult.error(exception, size);
          }
        }
```

### ConstantValue
Value `size` is always 'null'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
          }

          Long finalSize = size;
          executor.importAndSwallowIOExceptions(photo, p -> ItemImportResult.error(e, finalSize));
        }
```

### ConstantValue
Value `finalSize` is always 'null'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java

          Long finalSize = size;
          executor.importAndSwallowIOExceptions(photo, p -> ItemImportResult.error(e, finalSize));
        }

```

### ConstantValue
Value `size` is always 'null'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
          }

          Long finalSize = size;
          executor.importAndSwallowIOExceptions(photo, p -> ItemImportResult.error(e, finalSize));
        }
```

### ConstantValue
Value `finalSize` is always 'null'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java

          Long finalSize = size;
          executor.importAndSwallowIOExceptions(photo, p -> ItemImportResult.error(e, finalSize));
        }

```

### ConstantValue
Condition `insertActivityResult != null` is always `true`
in `extensions/data-transfer/portability-data-transfer-daybook/src/main/java/org/datatransferproject/transfer/daybook/social/DaybookPostsImporter.java`
#### Snippet
```java
            currentActivity -> {
              ItemImportResult<String> insertActivityResult = insertActivity(activity, authData);
              if (insertActivityResult != null && insertActivityResult.hasBytes()) {
                totalImportedFilesSizes.add(insertActivityResult.getBytes());
              }
```

### ConstantValue
Condition `taskList.taskseries != null` is always `true`
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java

    for (TaskList taskList : taskLists) {
      if (taskList.taskseries != null) {
        for (TaskSeries taskSeries : taskList.taskseries) {
          // TODO: figure out what to do with notes
```

### ConstantValue
Value `transferDataType` is always 'null'
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/GetTransferServicesAction.java`
#### Snippet
```java
    // Validate incoming data type parameter
    if (!ActionUtils.isValidTransferDataType(transferDataType)) {
      throw new IllegalArgumentException("Invalid transferDataType: " + transferDataType);
    }

```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `attempts`
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/retry/RetryingCallable.java`
#### Snippet
```java
    while (true) {
      Instant start = clock.instant();
      attempts++;
      try {
        monitor.debug(
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
        rdtParamList.add(TZID + "=" + tzidparam());
      }
      builder.append(String.join(";", rdtParamList) + ":" +
          String.join(",", rdtval()));
      return builder.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
        exdtParamList.add(TZID + "=" + tzidparam());
      }
      builder.append(String.join(";", exdtParamList) + ":" +
          String.join(",", exdtval()));
      return builder.toString();
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java

    PaginationData paginationData =
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java

    PaginationData paginationData =
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java
      Tasks tasksService, Optional<PaginationData> paginationData) throws IOException {
    Tasks.Tasklists.List query = tasksService.tasklists().list().setMaxResults(PAGE_SIZE);
    if (paginationData.isPresent()) {
      query.setPageToken(((StringPaginationToken) paginationData.get()).getToken());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java

    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java

    PaginationData paginationData =
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;

    try {
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java
        tasksService.tasks().list(resource.getId()).setMaxResults(PAGE_SIZE);

    if (paginationData.isPresent()) {
      query.setPageToken(((StringPaginationToken) paginationData.get()).getToken());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
      updatedParams.putAll(params.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    Map<String, String> params = new LinkedHashMap<>();
    params.put(PAGE_SIZE_KEY, String.valueOf(PLAYLIST_PAGE_SIZE));
    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    params.put(PAGE_SIZE_KEY, String.valueOf(PLAYLIST_ITEM_PAGE_SIZE));
    params.put(PLAYLIST_ID_KEY, playlistId);
    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
      updatedParams.putAll(params.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    Map<String, String> params = new LinkedHashMap<>();
    params.put(PAGE_SIZE_KEY, String.valueOf(ALBUM_PAGE_SIZE));
    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
      params.put(FILTERS_KEY, ImmutableMap.of(INCLUDE_ARCHIVED_KEY, String.valueOf(true)));
    }
    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
            MEDIA_FILTER_KEY, ImmutableMap.of("mediaTypes", ImmutableList.of("VIDEO"))));

    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
  private String generateParamsString(Optional<Map<String, String>> params) throws IOException {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
      updatedParams.putAll(params.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugPhotosExporter.java`
#### Snippet
```java

    StringPaginationToken paginationToken =
        exportInformation.isPresent()
            ? (StringPaginationToken) exportInformation.get().getPaginationData()
            : null;
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugPhotosExporter.java`
#### Snippet
```java
            : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/photos/InstagramPhotoExporter.java`
#### Snippet
```java
  public ExportResult<PhotosContainerResource> export(UUID jobId, TokensAndUrlAuthData authData,
      Optional<ExportInformation> exportInformation) {
    if (exportInformation.isPresent()) {
      return exportPhotos(authData, Optional.ofNullable(exportInformation.get().getPaginationData()));
    } else {
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsExporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) {
    GraphPagination graphPagination =
        exportInformation.isPresent() ? (GraphPagination) exportInformation.get()
            .getPaginationData() : null;
    if (graphPagination != null && graphPagination.getNextLink() != null) {
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java

    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityInMemoryDataCopier.java`
#### Snippet
```java
                new ExportInformation(
                    continuationData.getPaginationData(),
                    exportInfo.isPresent() ? exportInfo.get().getContainerResource() : null)));
      }

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java
    ContinuationData continuationData = new ContinuationData(nextPageData);

    if (googleAlbums != null && googleAlbums.length > 0) {
      for (GoogleAlbum googleAlbum : googleAlbums) {
        // Add album info to list so album can be recreated later
```

### RedundantLengthCheck
Redundant array length check
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
    ContinuationData continuationData = new ContinuationData(nextPageData);

    if (googlePlaylists != null && googlePlaylists.length > 0) {
      for (GooglePlaylist googlePlaylist : googlePlaylists) {
        MusicPlaylist musicPlaylist =
```

### RedundantLengthCheck
Redundant array length check
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
    ContinuationData continuationData = new ContinuationData(nextPageData);

    if (googleAlbums != null && googleAlbums.length > 0) {
      for (GoogleAlbum googleAlbum : googleAlbums) {
        // Add album info to list so album can be recreated later
```

### RedundantLengthCheck
Redundant array length check
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
    List<VideoModel> videos = new ArrayList<>();

    if (driveItems != null && driveItems.length > 0) {
      for (MicrosoftDriveItem driveItem : driveItems) {
        MediaAlbum album = tryConvertDriveItemToMediaAlbum(driveItem, jobId);
```

### RedundantLengthCheck
Redundant array length check
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
    List<PhotoModel> photos = new ArrayList<>();

    if (driveItems != null && driveItems.length > 0) {
      for (MicrosoftDriveItem driveItem : driveItems) {
        PhotoAlbum album = tryConvertDriveItemToPhotoAlbum(driveItem, jobId);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.datatransferproject.types.common.models.DataModel' to 'T'
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java
      return null;
    }
    return (T) DATA_MAP.get(createFullKey(jobId, key)).get(type);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.io.Serializable' to 'T'
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleCloudIdempotentImportExecutor.java`
#### Snippet
```java
              + Joiner.on(", ").join(knownValues.keySet()));
    }
    return (T) knownValues.get(idempotentId);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.io.Serializable' to 'T'
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleCloudIdempotentImportExecutor.java`
#### Snippet
```java
              jobIdPrefix
                  + format("Using cached key %s from cache for %s", idempotentId, itemName));
      return (T) knownValues.get(idempotentId);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `extensions/config/portability-config-yaml/src/main/java/org/datatransferproject/config/yaml/YamlSettingsExtension.java`
#### Snippet
```java
  public <T> T getSetting(String setting, T defaultValue) {
    if (settings.containsKey(setting)) {
      return (T) settings.get(setting);
    }
    return defaultValue;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `extensions/config/portability-config-yaml/src/main/java/org/datatransferproject/config/yaml/YamlSettingsExtension.java`
#### Snippet
```java
      ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
      try {
        settings = mapper.readValue(in, Map.class);
      } catch (IOException e) {
        throw new RuntimeException("Could not parse extension settings", e);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Stack'
in `extensions/copier/portability-stack-copier/src/main/java/org/datatransferproject/copier/stack/PortabilityStackInMemoryDataCopier.java`
#### Snippet
```java
      }
    }
    jobStore.storeJobStack(jobId, (Stack<ExportInformation>) exportInfoStack.clone());
  }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosImporter.java`
#### Snippet
```java
    ResponseBody body = response.body();
    Preconditions.checkArgument(body != null, "Didn't get response body!");
    Map<String, Object> responseData = objectMapper.readValue(body.bytes(), Map.class);

    String newAlbumId = (String) ((Map<String, Object>) responseData.get("data")).get("id");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosImporter.java`
#### Snippet
```java
    Map<String, Object> responseData = objectMapper.readValue(body.bytes(), Map.class);

    String newAlbumId = (String) ((Map<String, Object>) responseData.get("data")).get("id");
    if (Strings.isNullOrEmpty(newAlbumId)) {
      throw new IOException("Didn't receive new album id");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'. Reason: 'contentMap' has raw type, so result of get is erased
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
      String contentBody = new String(body.bytes());
      Map contentMap = objectMapper.reader().forType(Map.class).readValue(contentBody);
      return (List<Map<String, Object>>) contentMap.get("data");
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
        CharStreams.toString(new InputStreamReader(response.getContent(), Charsets.UTF_8));
    if (clazz.isAssignableFrom(String.class)) {
      return (T) result;
    } else {
      return objectMapper.readValue(result, clazz);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
        CharStreams.toString(new InputStreamReader(response.getContent(), Charsets.UTF_8));
    if (clazz.isAssignableFrom(String.class)) {
      return (T) result;
    } else {
      return objectMapper.readValue(result, clazz);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/DataChunk.java`
#### Snippet
```java

  public static List<DataChunk> splitData(InputStream inputStream) throws IOException {
    ArrayList<DataChunk> chunksToSend = new ArrayList();
    byte[] data = new byte[CHUNK_SIZE];
    int totalFileSize = 0;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/calendar/MicrosoftCalendarImporter.java`
#### Snippet
```java
    }

    Map<String, Object> body = (Map<String, Object>) calendarResponse.getBatchResponse()
        .get(0).get("body");
    return (String) body.get("id");
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
    // get complete file response
    ResponseBody chunkResponseBody = chunkResponse.body();
    Map<String, Object> chunkResponseData = objectMapper.readValue(chunkResponseBody.bytes(), Map.class);
    return (String) chunkResponseData.get("id");
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
        responseBody != null, "Got Null Body when creating photo upload session %s", photo);
    // convert to a map
    final Map<String, Object> responseData = objectMapper.readValue(responseBody.bytes(), Map.class);
    // return the session's upload url
    Preconditions.checkState(responseData.containsKey("uploadUrl"), "No uploadUrl :(");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
    ResponseBody chunkResponseBody = chunkResponse.body();
    Map<String, Object> chunkResponseData =
        objectMapper.readValue(chunkResponseBody.bytes(), Map.class);
    return (String) chunkResponseData.get("id");
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
    // convert to a map
    final Map<String, Object> responseData =
        objectMapper.readValue(responseBody.bytes(), Map.class);
    // return the session's upload url
    Preconditions.checkState(responseData.containsKey("uploadUrl"), "No uploadUrl :(");
```

### UNCHECKED_WARNING
Unchecked call to 'ExportResult(ResultType, T, ContinuationData)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.ExportResult'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java
    subResources.forEach(continuationData::addContainerResource);
    // TODO: what do we do with pagination data?
    return new ExportResult(ResultType.CONTINUE, taskContainerResource, continuationData);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.datatransferproject.spi.transfer.provider.ExportResult' to 'org.datatransferproject.spi.transfer.provider.ExportResult'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java
            : null;
    if (resource != null) {
      return exportTask(service, resource);
    } else {
      return exportTaskList(service);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.datatransferproject.spi.transfer.provider.ExportResult' to 'org.datatransferproject.spi.transfer.provider.ExportResult'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java
      return exportTask(service, resource);
    } else {
      return exportTaskList(service);
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'ExportResult(ResultType, T, ContinuationData)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.ExportResult'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java
    TaskContainerResource taskContainerResource = new TaskContainerResource(null, tasks);
    // TODO: what do we do with pagination data?
    return new ExportResult(ResultType.CONTINUE, taskContainerResource, null);
  }

```

### UNCHECKED_WARNING
Unchecked call to 'importItem(UUID, IdempotentImportExecutor, A, T)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.Importer'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableImporter.java`
#### Snippet
```java
    try {
      idempotentImportExecutor.resetRecentErrors();
      ImportResult result = importerProvider.get()
          .importItem(jobId, idempotentImportExecutor, authData, data);

      Collection<ErrorDetail> errors = idempotentImportExecutor.getRecentErrors();
```

### UNCHECKED_WARNING
Unchecked call to 'export(UUID, A, Optional)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.Exporter'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableExporter.java`
#### Snippet
```java
    Stopwatch stopwatch = Stopwatch.createStarted();
    try {
      ExportResult result =  exporterProvider.get().export(jobId, authData, exportInformation);
      success = result.getType() != ExportResult.ResultType.ERROR;
      return result;
```

### UNCHECKED_WARNING
Unchecked call to 'AnyToAnyExporter(Exporter, Function, Function)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.converter.AnyToAnyExporter'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
        (cr instanceof VideosContainerResource) ?
            MediaContainerResource.videoToMedia((VideosContainerResource) cr) : cr;
    return new AnyToAnyExporter<>(media, MediaContainerResource::mediaToVideo, converter);
  }

```

### UNCHECKED_WARNING
Unchecked call to 'AnyToAnyExporter(Exporter, Function, Function)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.converter.AnyToAnyExporter'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
        (cr instanceof PhotosContainerResource) ?
            MediaContainerResource.photoToMedia((PhotosContainerResource) cr) : cr;
    return new AnyToAnyExporter<>(media, MediaContainerResource::mediaToPhoto, converter);
  }

```

### UNCHECKED_WARNING
Unchecked call to 'MediaExporterDecorator(Exporter, Exporter)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.converter.MediaExporterDecorator'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
      return null;
    }
    return new MediaExporterDecorator(photo, video);
  }

```

### UNCHECKED_WARNING
Unchecked call to 'AnyToAnyImporter(Importer, Function)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.converter.AnyToAnyImporter'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
      return null;
    }
    return new AnyToAnyImporter<>(media, MediaContainerResource::videoToMedia);
  }

```

### UNCHECKED_WARNING
Unchecked call to 'MediaImporterDecorator(Importer, Importer)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.converter.MediaImporterDecorator'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
      return null;
    }
    return new MediaImporterDecorator(photo, video);
  }

```

### UNCHECKED_WARNING
Unchecked call to 'AnyToAnyImporter(Importer, Function)' as a member of raw type 'org.datatransferproject.spi.transfer.provider.converter.AnyToAnyImporter'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
      return null;
    }
    return new AnyToAnyImporter<>(media, MediaContainerResource::photoToMedia);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.io.Serializable' to 'T'
in `portability-test-utilities/src/main/java/org/datatransferproject/test/types/FakeIdempotentImportExecutor.java`
#### Snippet
```java
              + Joiner.on(", ").join(knownValues.keySet()));
    }
    return (T) knownValues.get(idempotentId);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.io.Serializable' to 'T'
in `portability-test-utilities/src/main/java/org/datatransferproject/test/types/FakeIdempotentImportExecutor.java`
#### Snippet
```java
    if (knownValues.containsKey(idempotentId)) {
      System.out.println("Using cached key " + idempotentId + " from cache");
      return (T) knownValues.get(idempotentId);
    }
    try {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `MediaObject`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/Fileable.java`
#### Snippet
```java
   * See https://en.wikipedia.org/wiki/Media_type
   *
   * NOTE: this should match {@link MediaObject#getEncodingFormat} behavior.
   */
  String getMimeType();
```

### JavadocReference
Cannot resolve symbol `getEncodingFormat`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/Fileable.java`
#### Snippet
```java
   * See https://en.wikipedia.org/wiki/Media_type
   *
   * NOTE: this should match {@link MediaObject#getEncodingFormat} behavior.
   */
  String getMimeType();
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `album.getName()` might be null
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosImporter.java`
#### Snippet
```java
    requestBuilder.header("Authorization", "Bearer " + authData.getAccessToken());

    FormBody.Builder builder = new FormBody.Builder().add("title", album.getName());
    if (!Strings.isNullOrEmpty(description)) {
      builder.add("description", description);
```

### DataFlowIssue
Dereference of `items` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
    boolean hasMore = (items != null && items.size() != 0);

    for (Map<String, Object> item : items) {
      albumBuilder.add(
          new PhotoAlbum(
```

### DataFlowIssue
Dereference of `items` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java

    List<Map<String, Object>> items = requestData(authData, url);
    for (Map<String, Object> item : items) {
      PhotoModel photoModel =
          new PhotoModel(
```

### DataFlowIssue
Dereference of `items` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
    boolean hasMore = (items != null && items.size() != 0);

    for (Map<String, Object> item : items) {
      String photoId = (String) item.get("id");

```

### DataFlowIssue
Argument `album.getName()` might be null
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/videos/KoofrVideosImporter.java`
#### Snippet
```java
  private String createAlbumFolder(VideoAlbum album, KoofrClient koofrClient)
      throws IOException, InvalidTokenException {
    String albumName = KoofrTransmogrificationConfig.getAlbumName(album.getName());

    monitor.debug(() -> String.format("Create Koofr folder %s", albumName));
```

### DataFlowIssue
Method invocation `getResponseCode` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/AppleMediaInterface.java`
#### Snippet
```java
        AuditKeys.jobId, jobId.toString(),
        AuditKeys.error, e.getMessage(),
        AuditKeys.errorCode, con.getResponseCode(),
      e);

```

### DataFlowIssue
Method invocation `disconnect` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/AppleMediaInterface.java`
#### Snippet
```java
      throw new AppleHttpException(e.getMessage(), e, con.getResponseCode());
    } finally {
      con.disconnect();
    }
    return responseString;
```

### DataFlowIssue
Method invocation `bytes` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
      }

      Map<String, Object> responseData = objectMapper.readValue(body.bytes(), Map.class);

      return (String) responseData.get("link");
```

### DataFlowIssue
Method invocation `bytes` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
      }

      Map<String, Object> responseData = objectMapper.readValue(body.bytes(), Map.class);
      String newName = (String) responseData.get("name");
      Preconditions.checkState(
```

### DataFlowIssue
Method invocation `byteStream` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java

      try (final Reader bodyReader =
              new InputStreamReader(body.byteStream(), StandardCharsets.UTF_8);
          final BufferedReader bufferedBodyReader = new BufferedReader(bodyReader); ) {
        String line;
```

### DataFlowIssue
Argument `album.getName()` might be null
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java
  private String createAlbumFolder(PhotoAlbum album, KoofrClient koofrClient)
      throws IOException, InvalidTokenException {
    String albumName = KoofrTransmogrificationConfig.getAlbumName(album.getName());

    monitor.debug(() -> String.format("Create Koofr folder %s", albumName));
```

### DataFlowIssue
Method invocation `createCredential` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/gplus/GooglePlusExporter.java`
#### Snippet
```java

  private synchronized Plus makePlusService(TokensAndUrlAuthData authData) {
    Credential credential = credentialFactory.createCredential(authData);
    return new Plus.Builder(
            credentialFactory.getHttpTransport(), credentialFactory.getJsonFactory(), credential)
```

### DataFlowIssue
Method invocation `createCredential` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java

  private synchronized PeopleService makePeopleService(TokensAndUrlAuthData authData) {
    Credential credential = credentialFactory.createCredential(authData);
    return new PeopleService.Builder(
            credentialFactory.getHttpTransport(), credentialFactory.getJsonFactory(), credential)
```

### DataFlowIssue
Method invocation `createCredential` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java

  private synchronized PeopleService makePeopleService(TokensAndUrlAuthData authData) {
    Credential credential = credentialFactory.createCredential(authData);
    return new PeopleService.Builder(
        credentialFactory.getHttpTransport(), credentialFactory.getJsonFactory(), credential)
```

### DataFlowIssue
Argument `video.getName()` might be null
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
      UploadMediaItemRequest uploadRequest =
          UploadMediaItemRequest.newBuilder()
              .setFileName(video.getName())
              .setDataFile(new RandomAccessFile(tmp, "r"))
              .build();
```

### DataFlowIssue
The call to 'checkArgument' always fails, according to its method contracts
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/InstagramTransferExtension.java`
#### Snippet
```java
    Preconditions.checkArgument(
        initialized, "InstagramTransferExtension not initialized. Unable to get Importer");
    Preconditions.checkArgument(false, "Instagram does not support import");
    return null;
  }
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
                + response.message()
                + " body: "
                + response.body().string());
      } else if (body == null) {
        throw new IOException("Got null body");
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
              + chunkResponse.message()
              + " body: "
              + chunkResponse.body().string());
    } else if (chunkCode == 200 || chunkCode == 201 || chunkCode == 202) {
      monitor.info(
```

### DataFlowIssue
Method invocation `code` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
      chunkResponse = uploadChunk(chunk, photoUploadUrl, totalFileSize, photo.getMediaType());
    }
    if (chunkResponse.code() != 200 && chunkResponse.code() != 201) {
      // Once we upload the last chunk, we should have either 200 or 201.
      // This should change to a precondition check after we debug some more.
```

### DataFlowIssue
Method invocation `bytes` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
    // get complete file response
    ResponseBody chunkResponseBody = chunkResponse.body();
    Map<String, Object> chunkResponseData = objectMapper.readValue(chunkResponseBody.bytes(), Map.class);
    return (String) chunkResponseData.get("id");
  }
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
              code,
              response.message(),
              response.body().string(),
              createSessionUrl,
              credential.getAccessToken(),
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
    } else if (chunkCode < 200 || chunkCode > 299) {
      throw new IOException("Got error code: " + chunkCode + " message: " + chunkResponse.message()
          + " body: " + chunkResponse.body().string());
    } else if (chunkCode == 200 || chunkCode == 201 || chunkCode == 202) {
      monitor.info(()
```

### DataFlowIssue
Method invocation `code` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
      chunkResponse = uploadChunk(chunk, itemUploadUrl, totalFileSize, item.getMimeType());
    }
    if (chunkResponse.code() != 200 && chunkResponse.code() != 201) {
      // Once we upload the last chunk, we should have either 200 or 201.
      // This should change to a precondition check after we debug some more.
```

### DataFlowIssue
Method invocation `bytes` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
    ResponseBody chunkResponseBody = chunkResponse.body();
    Map<String, Object> chunkResponseData =
        objectMapper.readValue(chunkResponseBody.bytes(), Map.class);
    return (String) chunkResponseData.get("id");
  }
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
      } else if (code < 200 || code > 299) {
        throw new IOException("Got error code: " + code + " message: " + response.message()
            + " body: " + response.body().string());
      } else if (body == null) {
        throw new IOException("Got null body");
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
              + "bearer token: %s\n"
              + " item: %s\n", // For debugging 404s on upload
          code, response.message(), response.body().string(), reqResp.getLeft().url(),
          credential.getAccessToken(), item));
    } else if (code != 200) {
```

### DataFlowIssue
Argument `encodedSessionKey` might be null
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/GenerateServiceAuthDataAction.java`
#### Snippet
```java
      String encodedSessionKey = job.jobAuthorization().sessionSecretKey();
      SecretKey key =
          symmetricKeyGenerator.parse(BaseEncoding.base64Url().decode(encodedSessionKey));

      // Retrieve initial auth data, if it existed
```

### DataFlowIssue
Method invocation `chars` may produce `NullPointerException`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/videos/VideoModel.java`
#### Snippet
```java
  // remove all forbidden characters
  public void cleanName(String forbiddenCharacters, char replacementCharacter, int maxLength) {
    String name = getName().chars()
        .mapToObj(c -> (char) c)
        .map(c -> forbiddenCharacters.contains(Character.toString(c)) ? replacementCharacter : c)
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1Config.java`
#### Snippet
```java
    REQUEST_TOKEN,
    AUTHORIZATION,
    ACCESS_TOKEN;
  }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
    UPLOAD,
    DOWNLOAD
  };

  /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
      try (final Reader bodyReader =
              new InputStreamReader(body.byteStream(), StandardCharsets.UTF_8);
          final BufferedReader bufferedBodyReader = new BufferedReader(bodyReader); ) {
        String line;
        List<FilesListRecursiveItem> items = new ArrayList<FilesListRecursiveItem>();
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mediaModels/Video.java`
#### Snippet
```java
    PROCESSING,
    READY,
    FAILED;
  }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
    DATE,
    PERIOD,
    UNDEFINED;
  }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    modifiedParams.put("api_key", appCredentials.getKey());

    List<String> orderedKeys = modifiedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java

    for (Organization organization : vcard.getOrganizations()) {
      organization.getValues().stream().forEach(
          v -> r.addProperty(VCARD4.hasOrganizationName, v));
    }
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java

    List<String> orderedKeys =
        updatedParams.keySet().stream().collect(toCollection(ArrayList::new));
    Collections.sort(orderedKeys);

```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    updatedParams.put(ACCESS_TOKEN_KEY, Preconditions.checkNotNull(credential.getAccessToken()));

    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
    updatedParams.put(ACCESS_TOKEN_KEY, Preconditions.checkNotNull(credential.getAccessToken()));

    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    modifiedParams.put("auth_token", authToken);

    List<String> orderedKeys = modifiedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/media/MediaContainerResource.java`
#### Snippet
```java

    if (usedRootAlbum) {
      List<MediaAlbum> tempMutableAlbums = this.albums.stream().collect(Collectors.toList());
      tempMutableAlbums.add(rootAlbum);
      this.albums = ImmutableList.copyOf(tempMutableAlbums);
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/blogger/GoogleBloggerImporter.java`
#### Snippet
```java
      throws IOException {
    String url;
    url = imageObject.getUrl().toString();

    String description =
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/WorkerModule.java`
#### Snippet
```java
      return transferExtensions
          .stream()
          .filter(ext -> ext.getServiceId().toLowerCase().equals(service.toLowerCase()))
          .collect(onlyElement());
    } catch (IllegalArgumentException e) {
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/SolidUtilities.java`
#### Snippet
```java
   */
  public void explore(String url, Consumer<Resource> resourceConsumer) throws IOException {
    logger.debug("Exploring: %s", url);
    Model model = getModel(url);

```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/SolidUtilities.java`
#### Snippet
```java

      validateResponse(deleteRequest.execute(), 200);
      logger.debug("Deleted: %s", url);
    } catch (IOException e) {
      throw new IllegalStateException("Couldn't delete: " + url, e);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsExport.java`
#### Snippet
```java
      throws IOException {
    if (SolidUtilities.isType(resource, "http://www.w3.org/2006/vcard/ns#AddressBook")) {
      logger.debug("Got Address book at %s", resource.getURI());
      return parseAddressBook(resource, utilities);
    }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsExport.java`
#### Snippet
```java

  private List<List<VCard>> explore(String url, SolidUtilities utilities) throws IOException {
    logger.debug("Exploring: %s", url);

    List<List<VCard>> results = new ArrayList<>();
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (3) than placeholders specified (0)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java
          Resource r = map.get(t.toLowerCase());
          if (r == null) {
            logger.warn("%s didn't contain '%s' from %s", map, t.toLowerCase(), type);
            r = ModelFactory.createDefaultModel().getResource(VCARD4.NS + t);
          }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'setSessionSecretKey' is still used
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/JobAuthorization.java`
#### Snippet
```java
    @Deprecated
    @JsonProperty("sessionSecretKey")
    public abstract Builder setSessionSecretKey(String sessionSecretKey);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'sessionSecretKey' is still used
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/JobAuthorization.java`
#### Snippet
```java
  @Nullable
  @JsonProperty("sessionSecretKey")
  public abstract String sessionSecretKey();

  /** The PublicKey of the 'transfer worker' instance assigned to this job, encoded for storage. */
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'containsKey()' check
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/TempMediaData.java`
#### Snippet
```java
  // removes the temp photo album
  public void removeTempPhotoAlbum(String key) {
    if (tempPhotoAlbums.containsKey(key)) {
      tempPhotoAlbums.remove(key);
    }
```

### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
  public static RRule parseRRuleString(String rRuleString) {
    RRule.Builder builder = RRule.builder();
    List<String> components = Arrays.asList(rRuleString.split("[;:]"));
    Map<ByRule, String> byRuleMapInput = new HashMap<>();
    for (String property : components) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkAuthDataGenerator.java`
#### Snippet
```java
    HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();
    HttpRequest getRequest = requestFactory.buildGetRequest(new GenericUrl(signedUrl));
    HttpResponse response = getRequest.execute();
    int statusCode = response.getStatusCode();
    if (statusCode != 200) {
      throw new IOException(
          "Bad status code: " + statusCode + " error: " + response.getStatusMessage());
    }
```

### DuplicatedCode
Duplicated code
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkAuthServiceExtension.java`
#### Snippet
```java
    if (initialized) return;

    AppCredentials appCredentials;
    try {
      appCredentials =
          context.getService(AppCredentialStore.class).getAppCredentials(RTM_KEY, RTM_SECRET);
    } catch (IOException e) {
      Monitor monitor = context.getMonitor();
      monitor.info(
          () ->
              format(
                  "Unable to retrieve RememberTheMilk AppCredentials. Did you set %s and %s?",
                  RTM_KEY, RTM_SECRET),
          e);
      return;
    }

    Monitor monitor = context.getMonitor();
```

### DuplicatedCode
Duplicated code
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    List<String> orderedKeys = modifiedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

    List<String> queryParamStrings = new ArrayList<>();
    StringBuilder resultBuilder = new StringBuilder();

    resultBuilder.append(appCredentials.getSecret());
    for (String key : orderedKeys) {
      // trim all keys and values from whitespace - We don't want to escape all whitespace values,
      // because the RTM endpoint will generate the signature with the unescaped whitespace and
      // compare that to the signature generated.
      String k = key.trim();
      String v = modifiedParams.get(key).trim();

      resultBuilder.append(k).append(v);
      queryParamStrings.add(k + "=" + v);
    }

    try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] thedigest = md.digest(resultBuilder.toString().getBytes(StandardCharsets.UTF_8));
      String signature = BaseEncoding.base16().encode(thedigest).toLowerCase();
      return new URL(base + "?" + String.join("&", queryParamStrings) + "&api_sig=" + signature);
    } catch (NoSuchAlgorithmException e) {
      throw new IllegalStateException("Couldn't find MD5 hash", e);
    } catch (MalformedURLException e) {
      throw new IllegalArgumentException("Couldn't parse authUrl", e);
    }
```

### DuplicatedCode
Duplicated code
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleDtpInternalMetricRecorder.java`
#### Snippet
```java
    TagContext tctx = tagger.emptyBuilder()
        .put(KEY_DATA_TYPE, TagValue.create(dataType.getDataType()), TAG_METADATA)
        .put(KEY_EXPORT_SERVICE, TagValue.create(service), TAG_METADATA)
        .put(KEY_SUCCESS, TagValue.create(Boolean.toString(success)), TAG_METADATA)
        .build();
    try (Scope ss = tagger.withTagContext(tctx)) {
      STATS_RECORDER.newMeasureMap()
          .put(EXPORT_PAGE_ATTEMPT, 1)
          .put(EXPORT_PAGE_ATTEMPT_DURATION, duration.toMillis())
          .record();
    }
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/ApplePhotosImporter.java`
#### Snippet
```java
    if (data == null) {
      return ImportResult.OK;
    }

    AppleMediaInterface mediaInterface = factory
      .getOrCreateMediaInterface(jobId, authData, appCredentials, exportingService, monitor);

    // Uploads album metadata
    final int albumCount =
      mediaInterface.importAlbums(
            jobId,
            idempotentImportExecutor,
            data.getAlbums().stream()
                .map(MediaAlbum::photoToMediaAlbum)
                .collect(Collectors.toList()),
            DataVertical.PHOTOS.getDataType());
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
    perUserRateLimiter.acquire();
    HttpResponse response = getRequest.execute();
    int statusCode = response.getStatusCode();
    if (statusCode != 200) {
      throw new IOException(
          "Bad status code: " + statusCode + " error: " + response.getStatusMessage());
    }
    String result =
        CharStreams.toString(new InputStreamReader(response.getContent(), Charsets.UTF_8));
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
    HttpResponse response = postRequest.execute();
    int statusCode = response.getStatusCode();
    if (statusCode != 200) {
      throw new IOException(
          "Bad status code: " + statusCode + " error: " + response.getStatusMessage());
    }
    String result =
        CharStreams.toString(new InputStreamReader(response.getContent(), Charsets.UTF_8));
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
      String token = ((StringPaginationToken) paginationData.get()).getToken();
      Preconditions.checkArgument(
          token.startsWith(ALBUM_TOKEN_PREFIX), "Invalid pagination token " + token);
      paginationToken = Optional.of(token.substring(ALBUM_TOKEN_PREFIX.length()));
    }

    AlbumListResponse albumListResponse;

    albumListResponse = getOrCreatePhotosInterface(authData).listAlbums(paginationToken);

    PaginationData nextPageData;
    String token = albumListResponse.getNextPageToken();
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java
    Optional<String> albumId = Optional.empty();
    if (albumData.isPresent()) {
      albumId = Optional.of(albumData.get().getId());
    }
    Optional<String> paginationToken = getPhotosPaginationToken(paginationData);

    MediaItemSearchResponse mediaItemSearchResponse =
        getOrCreatePhotosInterface(authData).listMediaItems(albumId, paginationToken);

    PaginationData nextPageData = null;
    if (!Strings.isNullOrEmpty(mediaItemSearchResponse.getNextPageToken())) {
      nextPageData =
          new StringPaginationToken(
              MEDIA_TOKEN_PREFIX + mediaItemSearchResponse.getNextPageToken());
    }
    ContinuationData continuationData = new ContinuationData(nextPageData);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java
    TempMediaData tempMediaData = new TempMediaData(jobId);

    String albumToken = null;
    AlbumListResponse albumListResponse;
    MediaItemSearchResponse containedMediaSearchResponse;
    do {
      albumListResponse =
          getOrCreatePhotosInterface(authData).listAlbums(Optional.ofNullable(albumToken));
      if (albumListResponse.getAlbums() != null) {
        for (GoogleAlbum album : albumListResponse.getAlbums()) {
          String albumId = album.getId();
          String photoToken = null;
          do {
            containedMediaSearchResponse =
                getOrCreatePhotosInterface(authData)
                    .listMediaItems(Optional.of(albumId), Optional.ofNullable(photoToken));
            if (containedMediaSearchResponse.getMediaItems() != null) {
              for (GoogleMediaItem mediaItem : containedMediaSearchResponse.getMediaItems()) {
                tempMediaData.addContainedPhotoId(mediaItem.getId());
              }
            }
            photoToken = containedMediaSearchResponse.getNextPageToken();
          } while (photoToken != null);
        }
      }
      albumToken = albumListResponse.getNextPageToken();
    } while (albumToken != null);

    // TODO: if we see complaints about objects being too large for JobStore in other places, we
    // should consider putting logic in JobStore itself to handle it
    InputStream stream = convertJsonToInputStream(tempMediaData);
    jobStore.create(jobId, createCacheKey(), stream);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
final ArrayList<NewMediaItem> mediaItems = new ArrayList<>();
    final HashMap<String, PhotoModel> uploadTokenToDataId = new HashMap<>();
    final HashMap<String, Long> uploadTokenToLength = new HashMap<>();

    // TODO: resumable uploads https://developers.google.com/photos/library/guides/resumable-uploads
    //  Resumable uploads would allow the upload of larger media that don't fit in memory.  To do
    //  this however, seems to require knowledge of the total file size.
    for (PhotoModel photo : photos) {
      Long size = null;
      try {
        InputStreamWrapper streamWrapper = connectionProvider
            .getInputStreamForItem(jobId, photo);

        try (InputStream s = streamWrapper.getStream()) {
          String uploadToken = getOrCreatePhotosInterface(jobId, authData).uploadMediaContent(s,
              photo.getSha1());
          String description = GooglePhotosImportUtils.cleanDescription(photo.getDescription());
          mediaItems.add(new NewMediaItem(description, uploadToken));
          uploadTokenToDataId.put(uploadToken, photo);
          size = streamWrapper.getBytes();
          uploadTokenToLength.put(uploadToken, size);
        } catch (UploadErrorException e) {
          if (e.getMessage().contains(ERROR_HASH_MISMATCH)) {
            monitor.severe(
                () -> format("%s: SHA-1 (%s) mismatch during upload", jobId, photo.getSha1()));
          }

          Long finalSize = size;
          executor.importAndSwallowIOExceptions(photo, p -> ItemImportResult.error(e, finalSize));
        }

        try {
          if (photo.isInTempStore()) {
            jobStore.removeData(jobId, photo.getFetchableUrl());
          }
        } catch (Exception e) {
          // Swallow the exception caused by Remove data so that existing flows continue
          monitor.info(
              () ->
                  format(
                      "%s: Exception swallowed in removeData call for localPath %s",
                      jobId, photo.getFetchableUrl()),
              e);
        }
      } catch (IOException exception) {
        Long finalSize = size;
        executor.importAndSwallowIOExceptions(
            photo, p -> ItemImportResult.error(exception, finalSize));
      }
    }

    if (mediaItems.isEmpty()) {
      // Either we were not passed in any videos or we failed upload on all of them.
      return 0L;
    }

    long totalBytes = 0L;
    NewMediaItemUpload uploadItem = new NewMediaItemUpload(albumId, mediaItems);
    try {
      BatchMediaItemResponse photoCreationResponse =
          getOrCreatePhotosInterface(jobId, authData).createPhotos(uploadItem);
      Preconditions.checkNotNull(photoCreationResponse);
      NewMediaItemResult[] mediaItemResults = photoCreationResponse.getResults();
      Preconditions.checkNotNull(mediaItemResults);
      for (NewMediaItemResult mediaItem : mediaItemResults) {
        PhotoModel photo = uploadTokenToDataId.get(mediaItem.getUploadToken());
        totalBytes +=
            processMediaResult(
                mediaItem, photo, executor, uploadTokenToLength.get(mediaItem.getUploadToken()));
        uploadTokenToDataId.remove(mediaItem.getUploadToken());
      }

      if (!uploadTokenToDataId.isEmpty()) {
        for (Entry<String, PhotoModel> entry : uploadTokenToDataId.entrySet()) {
          PhotoModel photo = entry.getValue();
          executor.importAndSwallowIOExceptions(
              photo,
              p ->
                  ItemImportResult.error(
                      new IOException("Photo was missing from results list."),
                      uploadTokenToLength.get(entry.getKey())));
        }
      }
    } catch (IOException e) {
      if (StringUtils.contains(
          e.getMessage(), "The remaining storage in the user's account is not enough")) {
        throw new DestinationMemoryFullException("Google destination storage full", e);
      } else if (StringUtils.contains(
          e.getMessage(), "The provided ID does not match any albums")) {
        // which means the album was likely deleted by the user
        // we skip this batch and log some data to understand it better
        logMissingAlbumDetails(jobId, authData, albumId, e);
      } else {
        throw e;
      }
    }

    return totalBytes;
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
    monitor.info(
        () -> format("Can't find album during createPhotos call, album is likely deleted"), e);
    try {
      GoogleAlbum album = getOrCreatePhotosInterface(jobId, authData).getAlbum(albumId);
      monitor.debug(
          () ->
              format(
                  "Can't find album during createPhotos call, album info: isWriteable %b, mediaItemsCount %d",
                  album.getIsWriteable(), album.getMediaItemsCount()),
          e);
    } catch (Exception ex) {
      monitor.info(() -> format("Can't find album during getAlbum call"), ex);
    }
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
    Status status = mediaItem.getStatus();
    if (status.getCode() == Code.OK_VALUE) {
      PhotoResult photoResult = new PhotoResult(mediaItem.getMediaItem().getId(), bytes);
      executor.importAndSwallowIOExceptions(
          item, itemToImport -> ItemImportResult.success(photoResult, bytes));
      return bytes;
    } else {
      executor.importAndSwallowIOExceptions(
          item,
          itemToImport ->
              ItemImportResult.error(
                  new IOException(
                      String.format(
                          "Media item could not be created. Code: %d Message: %s",
                          status.getCode(), status.getMessage())),
                  bytes));
      return 0;
    }
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
    if (photosInterface != null) {
      return photosInterface;
    }

    if (photosInterfacesMap.containsKey(jobId)) {
      return photosInterfacesMap.get(jobId);
    }

    GooglePhotosInterface newInterface = makePhotosInterface(authData);
    photosInterfacesMap.put(jobId, newInterface);

    return newInterface;
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaImporter.java`
#### Snippet
```java
    if (!multilingualStrings.containsKey(jobId)) {
      PortabilityJob job = jobStore.findJob(jobId);
      String locale = job != null ? job.userLocale() : null;
      multilingualStrings.put(jobId, new BaseMultilingualDictionary(locale));
    }

    return multilingualStrings.get(jobId);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    HttpRequest getRequest =
        requestFactory.buildGetRequest(
            new GenericUrl(baseUrl + "?" + generateParamsString(parameters)));

    HttpResponse response;
    try {
      response = getRequest.execute();
    } catch (HttpResponseException e) {
      response =
          handleHttpResponseException(
              () ->
                  requestFactory.buildGetRequest(
                      new GenericUrl(baseUrl + "?" + generateParamsString(parameters))),
              e);
    }

    Preconditions.checkState(response.getStatusCode() == 200);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    Collections.sort(orderedKeys);

    List<String> paramStrings = new ArrayList<>();
    for (String key : orderedKeys) {
      String k = key.trim();
      String v = updatedParams.get(key).trim();

      paramStrings.add(k + "=" + v);
    }

    return String.join("&", paramStrings);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
    updatedParams.put(ACCESS_TOKEN_KEY, Preconditions.checkNotNull(credential.getAccessToken()));

    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

    List<String> paramStrings = new ArrayList<>();
    for (String key : orderedKeys) {
      String k = key.trim();
      String v = updatedParams.get(key).trim();

      paramStrings.add(k + "=" + v);
}
    return String.join("&", paramStrings);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

    List<String> paramStrings = new ArrayList<>();
    for (String key : orderedKeys) {
      String k = key.trim();
      String v = updatedParams.get(key).trim();

      paramStrings.add(k + "=" + v);
    }

    return String.join("&", paramStrings);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
      PhotoModel photoModel =
          new PhotoModel(
              (String) item.get("name"),
              (String) item.get("link"),
              (String) item.get("description"),
              (String) item.get("type"),
              (String) item.get("id"),
              albumId,
              true);
      photos.add(photoModel);

      InputStream inputStream = getImageAsStream(photoModel.getFetchableUrl());
      jobStore.create(jobId, photoModel.getFetchableUrl(), inputStream);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
    Request.Builder requestBuilder = getRequestBuilder(url);
    requestBuilder.post(
        RequestBody.create(
            MediaType.parse("application/json"), objectMapper.writeValueAsString(rawFolder)));

    try (Response response = getResponse(requestBuilder)) {
      int code = response.code();
      // 409 response code means that the folder already exists
      if ((code < 200 || code > 299) && code != 409) {
       throw new KoofrClientIOException(response);
      }
    }
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrMediaExport.java`
#### Snippet
```java
    String photoId = path;
    String name = getFileName(file);
    String description = getFileDescription(file);
    String contentType = file.getContentType();
    Date uploadedTime = new Date(file.getModified());
    String fullPath = rootPath + path;

    albumsWithPhotos.add(albumId);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java
    String albumName = KoofrTransmogrificationConfig.getAlbumName(album.getName());

    monitor.debug(() -> String.format("Create Koofr folder %s", albumName));

    String rootPath = koofrClient.ensureRootFolder();
    String fullPath = rootPath + "/" + albumName;

    koofrClient.ensureFolder(rootPath, albumName);

    String description = KoofrClient.trimDescription(album.getDescription());

    if (description != null && description.length() > 0) {
      koofrClient.addDescription(fullPath, description);
    }

    return fullPath;
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/calendar/MicrosoftCalendarExporter.java`
#### Snippet
```java
      ResponseBody body = graphResponse.body();
      if (body == null) {
        return new ExportResult<>(
            new Exception("Error retrieving contacts: response body was null"));
      }
      String graphBody = new String(body.bytes());
      Map graphMap = objectMapper.reader().forType(Map.class).readValue(graphBody);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/calendar/MicrosoftCalendarExporter.java`
#### Snippet
```java
        String graphBody = new String(body.bytes());
        Map graphMap = objectMapper.reader().forType(Map.class).readValue(graphBody);

        // TODO String nextLink = (String) graphMap.get(ODATA_NEXT);
        // TODO ContinuationData continuationData = nextLink == null
        // ? null : new ContinuationData(new GraphPagination(nextLink));

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> rawEvents = (List<Map<String, Object>>) graphMap.get("value");
        if (rawEvents == null) {
          return new ExportResult<>(ExportResult.ResultType.END);
        }
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
    if (!exportInformation.isPresent()) {
      return exportOneDrivePhotos(authData, Optional.empty(), Optional.empty(), jobId);
    }

    IdOnlyContainerResource idOnlyContainerResource =
        (IdOnlyContainerResource) exportInformation.get().getContainerResource();
    StringPaginationToken paginationToken =
        (StringPaginationToken) exportInformation.get().getPaginationData();

    return exportOneDrivePhotos(authData, Optional.ofNullable(idOnlyContainerResource),
        Optional.ofNullable(paginationToken), jobId);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
      String token = ((StringPaginationToken) paginationData.get()).getToken();
      Preconditions.checkArgument(
          token.startsWith(tokenPrefix), "Invalid pagination token " + token);
      if (token.length() > tokenPrefix.length()) {
        paginationToken = Optional.of(token.substring(tokenPrefix.length()));
      }
    }
    return paginationToken;
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
Map<String, Object> rawFolder = new LinkedHashMap<>();
    // clean up album name for microsoft specifically
    // Note that MediaAlbum.getName() can return an empty string or null depending
    // on the results of MediaAlbum.cleanName(), e.g. if a Google Photos album has
    // title=" ", its cleaned name will be "". See MediaAlbum.cleanName for further
    // details on what forms the name can take.
    String albumName = Strings.isNullOrEmpty(album.getName()) ? "Untitled" : album.getName();
    rawFolder.put("name", albumName);
    rawFolder.put("folder", new LinkedHashMap());
    rawFolder.put("@microsoft.graph.conflictBehavior", "rename");

    Request.Builder requestBuilder = new Request.Builder().url(createFolderUrl);
    requestBuilder.header("Authorization", "Bearer " + credential.getAccessToken());
    requestBuilder.post(RequestBody.create(
        MediaType.parse("application/json"), objectMapper.writeValueAsString(rawFolder)));
    try (Response response = client.newCall(requestBuilder.build()).execute()) {
      int code = response.code();
      ResponseBody body = response.body();
      if (code == 401) {
        // If there was an unauthorized error, then try refreshing the creds
        credentialFactory.refreshCredential(credential);
        monitor.info(() -> "Refreshed authorization token successfuly");

        requestBuilder.header("Authorization", "Bearer " + credential.getAccessToken());
        Response newResponse = client.newCall(requestBuilder.build()).execute();
        code = newResponse.code();
        body = newResponse.body();
      }

      if (code == 403 && response.message().contains("Access Denied")) {
        throw new PermissionDeniedException("User access to microsoft onedrive was denied",
            new IOException(
                String.format("Got error code %d  with message: %s", code, response.message())));
      } else if (code < 200 || code > 299) {
        throw new IOException("Got error code: " + code + " message: " + response.message()
            + " body: " + response.body().string());
      } else if (body == null) {
        throw new IOException("Got null body");
      }

      Map<String, Object> responseData = objectMapper.readValue(body.bytes(), Map.class);
      String folderId = (String) responseData.get("id");
      Preconditions.checkState(
          !Strings.isNullOrEmpty(folderId), "Expected id value to be present in %s", responseData);
      return folderId;
    }
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
    BufferedInputStream inputStream = null;
    if (item.isInTempStore()) {
      inputStream =
          new BufferedInputStream(jobStore.getStream(jobId, item.getFetchableUrl()).getStream());
    } else if (item.getFetchableUrl() != null) {
      inputStream = new BufferedInputStream(new URL(item.getFetchableUrl()).openStream());
    } else {
      throw new IllegalStateException("Don't know how to get the inputStream for " + item);
    }

    String itemUploadUrl = createUploadSession(item, idempotentImportExecutor);

    // Arrange the data to be uploaded in chunks
    List<DataChunk> chunksToSend = DataChunk.splitData(inputStream);
    inputStream.close();
    final int totalFileSize = chunksToSend.stream().map(DataChunk::getSize).reduce(0, Integer::sum);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
    if (chunkResponse.code() != 200 && chunkResponse.code() != 201) {
      // Once we upload the last chunk, we should have either 200 or 201.
      // This should change to a precondition check after we debug some more.
      monitor.debug(
          () -> "Received a bad code on completion of uploading chunks", chunkResponse.code());
    }
    // get complete file response
    ResponseBody chunkResponseBody = chunkResponse.body();
    Map<String, Object> chunkResponseData =
        objectMapper.readValue(chunkResponseBody.bytes(), Map.class);
    return (String) chunkResponseData.get("id");
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
Request.Builder uploadRequestBuilder = new Request.Builder().url(photoUploadUrl);
    uploadRequestBuilder.header("Authorization", "Bearer " + credential.getAccessToken());

    // put chunk data in
    RequestBody uploadChunkBody =
        RequestBody.create(MediaType.parse(mediaType), chunk.getData(), 0, chunk.getSize());
    uploadRequestBuilder.put(uploadChunkBody);

    // set chunk data headers, indicating size and chunk range
    final String contentRange =
        String.format("bytes %d-%d/%d", chunk.getStart(), chunk.getEnd(), totalFileSize);
    uploadRequestBuilder.header("Content-Range", contentRange);
    uploadRequestBuilder.header("Content-Length", String.format("%d", chunk.getSize()));

    // upload the chunk
    Response chunkResponse = client.newCall(uploadRequestBuilder.build()).execute();
    Preconditions.checkNotNull(chunkResponse, "chunkResponse is null");
    if (chunkResponse.code() == 401) {
      // If there was an unauthorized error, then try refreshing the creds
      credentialFactory.refreshCredential(credential);
      monitor.info(() -> "Refreshed authorization token successfuly");

      // update auth info, reupload chunk
      uploadRequestBuilder.header("Authorization", "Bearer " + credential.getAccessToken());
      chunkResponse = client.newCall(uploadRequestBuilder.build()).execute();
    }
    int chunkCode = chunkResponse.code();
    if (chunkCode == 507 && chunkResponse.message().contains("Insufficient Storage")) {
      throw new DestinationMemoryFullException("Microsoft destination storage limit reached",
          new IOException(String.format(
              "Got error code %d  with message: %s", chunkCode, chunkResponse.message())));
    } else if (chunkCode < 200 || chunkCode > 299) {
      throw new IOException("Got error code: " + chunkCode + " message: " + chunkResponse.message()
          + " body: " + chunkResponse.body().string());
    } else if (chunkCode == 200 || chunkCode == 201 || chunkCode == 202) {
      monitor.info(()
                       -> String.format("Uploaded chunk %s-%s successfuly, code %d",
                           chunk.getStart(), chunk.getEnd(), chunkCode));
    }
    return chunkResponse;
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java
    String requestUrl;
    Map<String, String> params = new LinkedHashMap<>();

    if (paginationUrl.isPresent()) {
      requestUrl = paginationUrl.get();
    } else if (folderId.isPresent()) {
      requestUrl = BASE_GRAPH_URL + "/v1.0/me/drive/items/" + folderId.get() + "/children";
      params.put(ODATA_TOP, String.valueOf(PAGE_SIZE));
    } else {
      requestUrl = BASE_GRAPH_URL + "/v1.0/me/drive/root/children";
      params.put(ODATA_TOP, String.valueOf(PAGE_SIZE));
    }

    return makeGetRequest(requestUrl, Optional.of(params), MicrosoftDriveItemsResponse.class);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
      url = url + generateODataParams(parameters.get());
    }
    HttpRequest getRequest = requestFactory.buildGetRequest(new GenericUrl(url));
    setAuthorization(getRequest);

    HttpResponse response = getRequest.execute();
    int statusCode = response.getStatusCode();
    if (statusCode != 200) {
      throw new IOException(
          "Bad status code: " + statusCode + " error: " + response.getStatusMessage());
    }
    String result = CharStreams.toString(new InputStreamReader(response.getContent(), UTF_8));
    return objectMapper.readValue(result, tClass);
```

### DuplicatedCode
Duplicated code
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java
    Preconditions.checkArgument(params != null);
    List<String> orderedKeys = new ArrayList<>(params.keySet());
    Collections.sort(orderedKeys);

    List<String> paramStrings = new ArrayList<>();
    for (String key : orderedKeys) {
      String k = key.trim();
      String v = params.get(key).trim();

      paramStrings.add("$" + k + "=" + v);
    }

    return "?" + String.join("&", paramStrings);
```

### DuplicatedCode
Duplicated code
in `extensions/security/portability-security-cleartext/src/main/java/org/datatransferproject/security/cleartext/ClearTextKeyGenerator.java`
#### Snippet
```java
    KeyPairGenerator kpg = null;
    try {
      kpg = KeyPairGenerator.getInstance(ALGORITHM);
    } catch (NoSuchAlgorithmException e) {
      monitor.severe(() -> "NoSuchAlgorithmException for: " + ALGORITHM, e);
      throw new RuntimeException("NoSuchAlgorithmException generating key", e);
    }
    kpg.initialize(1024);
    KeyPair keyPair = kpg.genKeyPair();
```

### DuplicatedCode
Duplicated code
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/idempotentexecutor/InMemoryIdempotentImportExecutor.java`
#### Snippet
```java
    if (knownValues.containsKey(idempotentId)) {
      monitor.debug(
          () ->
              jobIdPrefix
                  + format("Using cached key %s from cache for %s", idempotentId, itemName));
      return (T) knownValues.get(idempotentId);
    }
    try {
      T result = callable.call();
      knownValues.put(idempotentId, result);
      monitor.debug(
          () -> jobIdPrefix + format("Storing key %s in cache for %s", idempotentId, itemName));
      errors.remove(idempotentId);
      return result;
    } catch (Exception e) {
      ErrorDetail errorDetail =
          ErrorDetail.builder()
              .setId(idempotentId)
              .setTitle(itemName)
              .setException(Throwables.getStackTraceAsString(e))
              .build();
      errors.put(idempotentId, errorDetail);
      recentErrors.put(idempotentId, errorDetail);
      monitor.severe(() -> jobIdPrefix + "Problem with importing item: " + errorDetail);
      throw e;
    }
```

### DuplicatedCode
Duplicated code
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
    String token = stringTokenizer.nextToken();
    while (stringTokenizer.hasMoreTokens()) {
      Preconditions.checkArgument(token.contains("="), "Cannot parse " + token);
      String[] split = token.split("=");
      String key = split[0];
      String value = split[1];
      if (key.equals(VALUE)) {
        builder.value(TimeType.valueOf(value));
      } else if (key.equals(TZID)) {
        builder.tzidparam(value);
      }
      token = stringTokenizer.nextToken();
    }
```

### DuplicatedCode
Duplicated code
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
      StringBuilder builder = new StringBuilder();

      List<String> rdtParamList = new LinkedList<>();
      rdtParamList.add(RDATE);
      if (value() != null) {
        rdtParamList.add(VALUE + "=" + value());
      }
      if (tzidparam() != null) {
        rdtParamList.add(TZID + "=" + tzidparam());
      }
```

### DuplicatedCode
Duplicated code
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/media/MediaAlbum.java`
#### Snippet
```java
    if (name == null) {
      return;
    }
    name = name.chars()
        .mapToObj(c -> (char) c)
        .map(c -> forbiddenCharacters.contains(Character.toString(c)) ? replacementCharacter : c)
        .map(Object::toString)
        .collect(Collectors.joining("")).trim();
    if (maxLength <= 0 || maxLength >= name.length()) {
      return;
    }
    name = name.substring(0, maxLength).trim();
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    // Add the RTM specific query params to the map for signing
    Map<String, String> modifiedParams = new HashMap<>();
    modifiedParams.putAll(queryParams);
    modifiedParams.put("api_key", appCredentials.getKey());

```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    // Add the RTM specific query params to the map for signing
    Map<String, String> modifiedParams = new HashMap<>();
    modifiedParams.putAll(queryParams);
    modifiedParams.put("api_key", appCredentials.getKey());
    modifiedParams.put("auth_token", authToken);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsExport.java`
#### Snippet
```java
      Resource personResource = SolidUtilities.getResource(subject.getURI(), personModel);
      if (personResource == null) {
        throw new IllegalStateException(subject.getURI() + " not found in " + subject.toString());
      }
      vcards.add(parsePerson(personResource));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/blogger/GoogleBloggerImporter.java`
#### Snippet
```java
    File fileMetadata = new File();
    LocalDate localDate = LocalDate.now();
    fileMetadata.setName("(Public)Imported Images on: " + localDate.toString());
    fileMetadata.setMimeType("application/vnd.google-apps.folder");
    File folder = driveInterface.files().create(fileMetadata).setFields("id").execute();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
          ((Throwable) datum).printStackTrace(System.out);
        } else if (datum instanceof UUID) {
          System.out.println("JobId: " + ((UUID)datum).toString());
        } else if (datum instanceof EventCode) {
          System.out.println("EventCode: " + datum.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
          System.out.println("JobId: " + ((UUID)datum).toString());
        } else if (datum instanceof EventCode) {
          System.out.println("EventCode: " + datum.toString());
        } else if (datum != null) {
          System.out.println(datum);
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `portability-types-common/src/main/java/org/datatransferproject/types/common/PaginationData.java`
#### Snippet
```java
package org.datatransferproject.types.common;

/**
 * Contains pagination data for an export operation.
 *
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `JettyErrorHandler` may be 'static'
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java
  }

  private class JettyErrorHandler extends ErrorHandler {

    protected void writeErrorPage(
```

### InnerClassMayBeStatic
Inner class `TransformKey` may be 'static'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/TransformerServiceImpl.java`
#### Snippet
```java
  }

  private class TransformKey {
    private Class<?> from;
    private Class<?> to;
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'org.datatransferproject.types.transfer.models' does not correspond to the file path 'org.datatransferproject.types.common.models'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/ItemResource.java`
#### Snippet
```java
package org.datatransferproject.types.transfer.models;

import org.datatransferproject.types.common.models.DataModel;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `libraries/config/src/main/java/org/datatransferproject/config/ConfigUtils.java`
#### Snippet
```java
    }
    // in1 == null
    if (in2 != null) {
      return in2;
    }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
      throws Exception {
    long bytes = 0L;
    if (items == null || items.size() <= 0) {
      return bytes;
    }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java
  ExportResult<MediaContainerResource> exportMedia(
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java

  private MediaContainerResource convertMediaListToResource(
      Optional<String> albumId, GoogleMediaItem[] mediaItems, UUID jobId) throws IOException {
    List<PhotoModel> photos = new ArrayList<>(mediaItems.length);
    List<VideoModel> videos = new ArrayList<>(mediaItems.length);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java
  }

  private Optional<String> getPhotosPaginationToken(Optional<PaginationData> paginationData) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/media/GoogleMediaExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<MediaContainerResource> exportAlbums(
      TokensAndUrlAuthData authData, Optional<PaginationData> paginationData, UUID jobId)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Optional<String> paginationToken = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java

  private ExportResult<TaskContainerResource> getTasksList(
      Tasks tasksService, Optional<PaginationData> paginationData) throws IOException {
    Tasks.Tasklists.List query = tasksService.tasklists().list().setMaxResults(PAGE_SIZE);
    if (paginationData.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java

  private ExportResult<TaskContainerResource> getTasks(
      Tasks tasksService, IdOnlyContainerResource resource, Optional<PaginationData> paginationData)
      throws IOException {
    Tasks.TasksOperations.List query =
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String baseUrl, Optional<Map<String, String>> parameters, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'params'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  }

  PlaylistListResponse listPlaylists(Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Map<String, String> params = new LinkedHashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private <T> T makePostRequest(
      String baseUrl,
      Optional<Map<String, String>> parameters,
      HttpContent httpContent,
      Class<T> clazz)
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private <T> T makePutRequest(
      String baseUrl,
      Optional<Map<String, String>> parameters,
      HttpContent httpContent,
      Class<T> clazz)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  }

  PlaylistItemListResponse listPlaylistItems(String playlistId, Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Map<String, String> params = new LinkedHashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      IdOnlyContainerResource playlistData,
      Optional<PaginationData> paginationData)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    String playlistId = playlistData.getId();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<MusicContainerResource> exportPlaylists(
      TokensAndUrlAuthData authData, Optional<PaginationData> paginationData, UUID jobId)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Optional<String> paginationToken = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<VideosContainerResource> exportVideos(
      TokensAndUrlAuthData authData, Optional<StringPaginationToken> paginationData)
      throws IOException {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java

  private List<PhotoModel> convertPhotosList(
      Optional<String> albumId, GoogleMediaItem[] mediaItems, UUID jobId) throws IOException {
    List<PhotoModel> photos = new ArrayList<>(mediaItems.length);

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
  }

  private Optional<String> getPhotosPaginationToken(Optional<PaginationData> paginationData) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<PhotosContainerResource> exportAlbums(
      TokensAndUrlAuthData authData, Optional<PaginationData> paginationData, UUID jobId)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Optional<String> paginationToken = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
  ExportResult<PhotosContainerResource> exportPhotos(
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'params'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  public AlbumListResponse listAlbums(Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Map<String, String> params = new LinkedHashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  public <T> T makePostRequest(String url, Optional<Map<String, String>> parameters,
      Optional<Map<String, String>> extraHeaders, HttpContent httpContent, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'extraHeaders'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java

  public <T> T makePostRequest(String url, Optional<Map<String, String>> parameters,
      Optional<Map<String, String>> extraHeaders, HttpContent httpContent, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    // Wait for write permit before making request
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  private <T> T makeGetRequest(String url, Optional<Map<String, String>> parameters, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  public MediaItemSearchResponse listMediaItems(Optional<String> albumId, Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    Map<String, Object> params = new LinkedHashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  public MediaItemSearchResponse listMediaItems(Optional<String> albumId, Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    Map<String, Object> params = new LinkedHashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mediaModels/GoogleMediaItem.java`
#### Snippet
```java

  public static VideoModel convertToVideoModel(
      Optional<String> albumId, GoogleMediaItem mediaItem) {
    Preconditions.checkArgument(mediaItem.isVideo());

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mediaModels/GoogleMediaItem.java`
#### Snippet
```java

  public static PhotoModel convertToPhotoModel(
      Optional<String> albumId, GoogleMediaItem mediaItem) {
    Preconditions.checkArgument(mediaItem.isPhoto());

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pageData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java

  private ExportResult<CalendarContainerResource> getCalendarEvents(
      TokensAndUrlAuthData authData, String id, Optional<PaginationData> pageData) {
    Calendar.Events.List listRequest;
    Events listResult;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pageData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java

  private ExportResult<CalendarContainerResource> exportCalendars(
      TokensAndUrlAuthData authData, Optional<PaginationData> pageData) {
    Calendar.CalendarList.List listRequest;
    CalendarList listResult;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pageData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java

  private ExportResult<ContactsModelWrapper> exportContacts(
      TokensAndUrlAuthData authData, Optional<PaginationData> pageData) {
    try {
      // Set up connection
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
  }

  MediaItemSearchResponse listVideoItems(Optional<String> pageToken) throws IOException {
    Map<String, Object> params = new LinkedHashMap<>();
    params.put(PAGE_SIZE_KEY, String.valueOf(MEDIA_PAGE_SIZE));
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'params'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) throws IOException {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java

  <T> T makePostRequest(
      String url, Optional<Map<String, String>> parameters, HttpContent httpContent, Class<T> clazz)
      throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationToken'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosInterface.java`
#### Snippet
```java

public interface FacebookPhotosInterface {
  Connection<Album> getAlbums(Optional<String> paginationToken);

  Connection<Photo> getPhotos(String albumId, Optional<String> paginationToken);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationToken'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosInterface.java`
#### Snippet
```java
  Connection<Album> getAlbums(Optional<String> paginationToken);

  Connection<Photo> getPhotos(String albumId, Optional<String> paginationToken);
}

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationToken'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/FacebookVideosInterface.java`
#### Snippet
```java
public interface FacebookVideosInterface {

  Connection<Video> getVideos(Optional<String> paginationToken)
      throws CopyExceptionWithFailureReason;
}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/FacebookVideosExporter.java`
#### Snippet
```java

  private ExportResult<VideosContainerResource> exportVideos(
      TokensAndUrlAuthData authData, Optional<StringPaginationToken> paginationData)
      throws CopyExceptionWithFailureReason {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java

  private ExportResult<PhotosContainerResource> exportAlbums(
      TokensAndUrlAuthData authData, Optional<StringPaginationToken> paginationData)
      throws CopyExceptionWithFailureReason {
    Optional<String> paginationToken = stripTokenPrefix(paginationData, ALBUM_TOKEN_PREFIX);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java

  private Optional<String> stripTokenPrefix(
      Optional<StringPaginationToken> paginationData, String prefix) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      IdOnlyContainerResource containerResource,
      Optional<StringPaginationToken> paginationData)
      throws CopyExceptionWithFailureReason {
    Optional<String> paginationToken = stripTokenPrefix(paginationData, PHOTO_TOKEN_PREFIX);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pageData'
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/photos/InstagramPhotoExporter.java`
#### Snippet
```java

  private ExportResult<PhotosContainerResource> exportPhotos(TokensAndUrlAuthData authData,
      Optional<PaginationData> pageData) {
    Preconditions.checkNotNull(authData);
    MediaResponse response;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'folderId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java

  MicrosoftDriveItemsResponse getDriveItems(
      Optional<String> folderId, Optional<String> paginationUrl) throws IOException {
    String requestUrl;
    Map<String, String> params = new LinkedHashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationUrl'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java

  MicrosoftDriveItemsResponse getDriveItems(
      Optional<String> folderId, Optional<String> paginationUrl) throws IOException {
    String requestUrl;
    Map<String, String> params = new LinkedHashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java

  private PhotoModel tryConvertDriveItemToPhotoModel(
      Optional<String> albumId, MicrosoftDriveItem driveItem, UUID jobId) {
    if (!driveItem.isImage()) {
      return null;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java

  private Optional<String> getPaginationToken(
      Optional<PaginationData> paginationData, String tokenPrefix) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java

  private VideoModel tryConvertDriveItemToVideoModel(
      Optional<String> albumId, MicrosoftDriveItem driveItem, UUID jobId) {
    if (!driveItem.isVideo()) {
      return null;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  }

  private Optional<String> getDrivePaginationToken(Optional<PaginationData> paginationData) {
    return getPaginationToken(paginationData, DRIVE_TOKEN_PREFIX);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<MediaContainerResource> exportOneDrivePhotos(TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData, Optional<PaginationData> paginationData,
      UUID jobId) throws IOException {
    Optional<String> albumId = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<MediaContainerResource> exportOneDrivePhotos(TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData, Optional<PaginationData> paginationData,
      UUID jobId) throws IOException {
    Optional<String> albumId = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'folderId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java

  MicrosoftDriveItemsResponse getDriveItems(
      Optional<String> folderId, Optional<String> paginationUrl) throws IOException {
    String requestUrl;
    Map<String, String> params = new LinkedHashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationUrl'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java

  MicrosoftDriveItemsResponse getDriveItems(
      Optional<String> folderId, Optional<String> paginationUrl) throws IOException {
    String requestUrl;
    Map<String, String> params = new LinkedHashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java

  private Optional<String> getPaginationToken(
      Optional<PaginationData> paginationData, String tokenPrefix) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
  ExportResult<PhotosContainerResource> exportOneDrivePhotos(
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
      throws IOException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java

  private PhotoModel tryConvertDriveItemToPhotoModel(
      Optional<String> albumId, MicrosoftDriveItem driveItem, UUID jobId) {

    if (driveItem.file != null
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
  }

  private Optional<String> getDrivePaginationToken(Optional<PaginationData> paginationData) {
    return getPaginationToken(paginationData, DRIVE_TOKEN_PREFIX);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'exportInformation'
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/CreateTransferJobAction.java`
#### Snippet
```java
      String exportService,
      String importService,
      Optional<ExportInformation> exportInformation,
      String encryptionScheme) throws IOException {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'exportInformation'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableExporter.java`
#### Snippet
```java
  private UUID jobId;
  private AuthData authData;
  private Optional<ExportInformation> exportInformation;
  private final DtpInternalMetricRecorder metricRecorder;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'exportInformation'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableExporter.java`
#### Snippet
```java
      UUID jobId,
      AuthData authData,
      Optional<ExportInformation> exportInformation,
      DtpInternalMetricRecorder metricRecorder) {
    this.exporterProvider = checkNotNull(exporterProvider, "exportProvider can't be null");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'exportInfo'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/InMemoryDataCopier.java`
#### Snippet
```java
          AuthData exportAuthData,
          AuthData importAuthData,
          UUID jobId, Optional<ExportInformation> exportInfo)
      throws IOException, CopyException;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'exportInfo'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityInMemoryDataCopier.java`
#### Snippet
```java
      AuthData importAuthData,
      UUID jobId,
      Optional<ExportInformation> exportInfo)
      throws CopyException {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'exportInformation'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityAbstractInMemoryDataCopier.java`
#### Snippet
```java
      UUID jobId,
      AuthData exportAuthData,
      Optional<ExportInformation> exportInformation,
      String jobIdPrefix,
      int copyIteration)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'exportInformation'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityAbstractInMemoryDataCopier.java`
#### Snippet
```java
      AuthData exportAuthData,
      AuthData importAuthData,
      Optional<ExportInformation> exportInformation,
      String jobIdPrefix,
      int copyIteration)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'exportInformation'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/Exporter.java`
#### Snippet
```java
   */
  // We need to be able throw exceptions that can be caught by RetryingCallable.
  ExportResult<T> export(UUID jobId, A authData, Optional<ExportInformation> exportInformation)
      throws Exception;
}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'throwable'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ExportResult.java`
#### Snippet
```java
  private ContinuationData continuationData;
  // Throwable should be absent unless an error was thrown during export
  private Optional<Throwable> throwable = Optional.empty();

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'bytes'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  private Optional<Throwable> throwable = Optional.empty();
  private Optional<Map<String, Integer>> counts = Optional.empty();
  private Optional<Long> bytes = Optional.empty();

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'throwable'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  public ImportResult(
      ResultType type,
      Optional<Throwable> throwable,
      Optional<Map<String, Integer>> counts,
      Optional<Long> bytes) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'counts'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
      ResultType type,
      Optional<Throwable> throwable,
      Optional<Map<String, Integer>> counts,
      Optional<Long> bytes) {
    this.type = type;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'bytes'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
      Optional<Throwable> throwable,
      Optional<Map<String, Integer>> counts,
      Optional<Long> bytes) {
    this.type = type;
    this.throwable = throwable;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'counts'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  // Throwable should be absent unless an error was thrown during export
  private Optional<Throwable> throwable = Optional.empty();
  private Optional<Map<String, Integer>> counts = Optional.empty();
  private Optional<Long> bytes = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'throwable'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  private ResultType type;
  // Throwable should be absent unless an error was thrown during export
  private Optional<Throwable> throwable = Optional.empty();
  private Optional<Map<String, Integer>> counts = Optional.empty();
  private Optional<Long> bytes = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'exportInfo'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java

  private ExportResult<PhotosContainerResource> exportPhotos(UUID jobId, AD authData,
      Optional<ExportInformation> exportInfo)
      throws Exception {
    return photosExporter.export(jobId, authData, exportInfo.map((ei) -> {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'exportInfo'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java

  private ExportResult<VideosContainerResource> exportVideos(UUID jobId, AD authData,
      Optional<ExportInformation> exportInfo) throws Exception {
    return videosExporter.export(jobId, authData, exportInfo.map((ei) -> {
      ContainerResource cr = ei.getContainerResource();
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
            .append(entry.getKey())
            .append("=")
            .append(URLEncoder.encode(entry.getValue(), "UTF8"));
      } catch (UnsupportedEncodingException e) {
        throw new IllegalArgumentException(e);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ServerConnector' used without 'try'-with-resources statement
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java
      HttpConfiguration https = new HttpConfiguration();
      ServerConnector sslConnector =
          new ServerConnector(
              server,
              new SslConnectionFactory(sslContextFactory, "http/1.1"),
```

### AutoCloseableResource
'ServerConnector' used without 'try'-with-resources statement
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java
      server = new Server(httpPort);
      ServerConnector connector =
          new ServerConnector(server, new HttpConnectionFactory(new HttpConfiguration()));
      connector.setPort(httpPort);
      server.setConnectors(new Connector[] {connector});
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosImporter.java`
#### Snippet
```java
    requestBuilder.post(formBody);

    Response response = client.newCall(requestBuilder.build()).execute();
    int code = response.code();
    Preconditions.checkArgument(
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosImporter.java`
#### Snippet
```java
    requestBuilder.post(formBody);

    Response response = client.newCall(requestBuilder.build()).execute();
    int code = response.code();
    // Though sometimes it returns error code for success requests
```

### AutoCloseableResource
'JCardReader' used without 'try'-with-resources statement
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java
      IdempotentImportExecutor idempotentExecutor,
      TokensAndUrlAuthData authData, ContactsModelWrapper data) throws Exception{
    JCardReader reader = new JCardReader(data.getVCards());
    try {
      // TODO(olsona): address any other problems that might arise in conversion
```

### AutoCloseableResource
'JCardReader' used without 'try'-with-resources statement
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsImporter.java`
#### Snippet
```java
      TokenAuthData authData,
      ContactsModelWrapper wrapper) {
    JCardReader reader = new JCardReader(wrapper.getVCards());
    try {
      List<VCard> cards = reader.readAll();
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java

        requestBuilder.header("Authorization", "Bearer " + credential.getAccessToken());
        Response newResponse = client.newCall(requestBuilder.build()).execute();
        code = newResponse.code();
        body = newResponse.body();
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java

    // Make the call, we should get an upload url for photo data in a 200 response
    Response response = client.newCall(createSessionRequestBuilder.build()).execute();
    int code = response.code();
    ResponseBody responseBody = response.body();
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java

      createSessionRequestBuilder.header("Authorization", "Bearer " + credential.getAccessToken());
      Response newResponse = client.newCall(createSessionRequestBuilder.build()).execute();
      code = newResponse.code();
      responseBody = newResponse.body();
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java

        requestBuilder.header("Authorization", "Bearer " + credential.getAccessToken());
        Response newResponse = client.newCall(requestBuilder.build()).execute();
        code = newResponse.code();
        body = newResponse.body();
```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array `encoded`
in `extensions/security/portability-security-jwe/src/main/java/org/datatransferproject/security/jwe/JWEPublicKeySerializer.java`
#### Snippet
```java
    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
      throw new RuntimeException(
          "InvalidKeySpecException generating PublicKey, encoded: " + encoded, e);    }
  }
}
```

### ImplicitArrayToString
Implicit call to 'toString()' on array `encoded`
in `extensions/security/portability-security-jwe/src/main/java/org/datatransferproject/security/jwe/JWEAuthDataDecryptService.java`
#### Snippet
```java
    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
      throw new RuntimeException(
          "InvalidKeySpecException generating PrivateKey, encoded: " + encoded, e);
    }
  }
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `initialAuthData` to `TokenSecretAuthData` is redundant
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1DataGenerator.java`
#### Snippet
```java
    OAuthGetAccessToken accessTokenRequest = new OAuthGetAccessToken(config.getAccessTokenUrl());
    accessTokenRequest.transport = httpTransport;
    accessTokenRequest.temporaryToken = ((TokenSecretAuthData) initialAuthData).getToken();
    accessTokenRequest.consumerKey = clientId;
    accessTokenRequest.verifier = authCode;
```

### RedundantCast
Casting `datum` to `UUID` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/StackdriverMonitor.java`
#### Snippet
```java
          logMessage.append(format("\n%s", Throwables.getStackTraceAsString(((Throwable) datum))));
        } else if (datum instanceof UUID) {
          logMessage.append(format("\nJobId: %s", ((UUID) datum)));
        } else if (datum instanceof EventCode) {
          logMessage.append(format("\nEventCode: %s", (EventCode) datum));
```

### RedundantCast
Casting `datum` to `EventCode` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/StackdriverMonitor.java`
#### Snippet
```java
          logMessage.append(format("\nJobId: %s", ((UUID) datum)));
        } else if (datum instanceof EventCode) {
          logMessage.append(format("\nEventCode: %s", (EventCode) datum));
        } else if (datum != null) {
          logMessage.append(format("\n%s", datum));
```

### RedundantCast
Casting `entity.getString(...)` to `String` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
      // builder.put(property, entity.getValue(property));
      if (entity.getValue(property) instanceof StringValue) {
        builder.put(property, (String) entity.getString(property));
      } else if (entity.getValue(property) instanceof LongValue) {
        // This conversion is safe because of integer to long conversion above
```

### RedundantCast
Casting `entity.getDouble(...)` to `Double` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
        builder.put(property, new Long(entity.getLong(property)).intValue());
      } else if (entity.getValue(property) instanceof DoubleValue) {
        builder.put(property, (Double) entity.getDouble(property));
      } else if (entity.getValue(property) instanceof BooleanValue) {
        builder.put(property, (Boolean) entity.getBoolean(property));
```

### RedundantCast
Casting `entity.getBoolean(...)` to `Boolean` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
        builder.put(property, (Double) entity.getDouble(property));
      } else if (entity.getValue(property) instanceof BooleanValue) {
        builder.put(property, (Boolean) entity.getBoolean(property));
      } else if (entity.getValue(property) instanceof TimestampValue) {
        builder.put(property, (Timestamp) entity.getTimestamp(property));
```

### RedundantCast
Casting `entity.getTimestamp(...)` to `Timestamp` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
        builder.put(property, (Boolean) entity.getBoolean(property));
      } else if (entity.getValue(property) instanceof TimestampValue) {
        builder.put(property, (Timestamp) entity.getTimestamp(property));
      } else {
        Blob blob = entity.getBlob(property);
```

### RedundantCast
Casting `datum` to `UUID` is redundant
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
          ((Throwable) datum).printStackTrace(System.out);
        } else if (datum instanceof UUID) {
          System.out.println("JobId: " + ((UUID)datum).toString());
        } else if (datum instanceof EventCode) {
          System.out.println("EventCode: " + datum.toString());
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1Config.java`
#### Snippet
```java
  /**
   * Returns a list of import data types (e.g., PHOTOS, CALENDAR) this config is designed to support.
   * @return
   */
  List<DataVertical> getImportTypes();
```

### JavadocDeclaration
`@return` tag description is missing
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1Config.java`
#### Snippet
```java
  /**
   * Returns a list of export data types (e.g., PHOTOS, CALENDAR) this config is designed to support.
   * @return
   */
  List<DataVertical> getExportTypes();
```

### JavadocDeclaration
`@return` tag description is missing
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth2Config.java`
#### Snippet
```java
   * Returns a map of scopes needed for export, keyed by data type (e.g., PHOTOS, CALENDAR) as
   * defined in the auth data generator or elsewhere
   * @return
   */
  Map<DataVertical, Set<String>> getExportScopes();
```

### JavadocDeclaration
`@return` tag description is missing
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth2Config.java`
#### Snippet
```java
   * Returns a map of scopes needed for import, keyed by data type (e.g., PHOTOS, CALENDAR) as
   * defined in the auth data generator or elsewhere
   * @return
   */
  Map<DataVertical, Set<String>> getImportScopes();
```

### JavadocDeclaration
`@throws` tag description is missing
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
   * @param url the url to upload or download from
   * @param mode indicates if this is an upload or a download session
   * @throws IOException
   */
  public StreamingContentClient(
```

### JavadocDeclaration
`@param uploadBytes` tag description is missing
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
   * upload is complete and a ContentResponse is returned. Otherwise, null is returned.
   *
   * @param uploadBytes
   * @return ContentResponse
   * @throws AppleContentException
```

### JavadocDeclaration
Tag `return` is not allowed here
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
   *
   * @param uploadBytes
   * @return ContentResponse
   * @throws AppleContentException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
   * @param uploadBytes
   * @return ContentResponse
   * @throws AppleContentException
   */
  @Nullable
```

### JavadocDeclaration
`@param maxBytesToRead` tag description is missing
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
   * available, return null.
   *
   * @param maxBytesToRead
   * @return bytes read from url (or null if none can be read)
   * @throws AppleContentException
```

### JavadocDeclaration
`@throws` tag description is missing
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
   * @param maxBytesToRead
   * @return bytes read from url (or null if none can be read)
   * @throws AppleContentException
   */
  @Nullable
```

### JavadocDeclaration
`@param transferDataType` tag description is missing
in `portability-api/src/main/java/org/datatransferproject/api/action/ActionUtils.java`
#### Snippet
```java

  /** Determines whether the current service is a valid service for import.
   * @param transferDataType*/
  public static boolean isValidTransferDataType(DataVertical transferDataType) {
    return transferDataType != null;
```

### JavadocDeclaration
Wrong tag `return*/`
in `portability-spi-api/src/main/java/org/datatransferproject/spi/api/auth/AuthServiceProviderRegistry.java`
#### Snippet
```java

  /** Returns the set of data types that support both import and export.
   * @return*/
  Set<DataVertical> getTransferDataTypes();

```

### JavadocDeclaration
`@param transferDataType` tag description is missing
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/extension/TransferExtension.java`
#### Snippet
```java

  /** Returns initialized extension exporter.
   * @param transferDataType*/
  Exporter<?, ?> getExporter(DataVertical transferDataType);

```

### JavadocDeclaration
`@param transferDataType` tag description is missing
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/extension/TransferExtension.java`
#### Snippet
```java

  /** Returns initialized extension importer.
   * @param transferDataType*/
  Importer<?, ?> getImporter(DataVertical transferDataType);
}
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
   * @param throwable the exception thrown
   * @param counts mapping representing the number of imported items
   * @param bytes
   */
  public ImportResult(
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `monitor` may be 'final'
in `libraries/security/src/main/java/org/datatransferproject/security/DecrypterFactory.java`
#### Snippet
```java
 */
public class DecrypterFactory {
  private Monitor monitor;

  public DecrypterFactory(Monitor monitor) {
```

### FieldMayBeFinal
Field `monitor` may be 'final'
in `libraries/security/src/main/java/org/datatransferproject/security/EncrypterFactory.java`
#### Snippet
```java
 */
public class EncrypterFactory {
  private Monitor monitor;

  public EncrypterFactory(Monitor monitor) {
```

### FieldMayBeFinal
Field `AUTH_TOKEN_PATTERN` may be 'final'
in `extensions/auth/portability-auth-deezer/src/main/java/org/datatransferproject/auth/deezer/DeezerOAuthConfig.java`
#### Snippet
```java
 */
public class DeezerOAuthConfig implements OAuth2Config {
  private static Pattern AUTH_TOKEN_PATTERN = Pattern.compile("access_token=(\\w+)&expires=0");

  // https://developers.deezer.com/api/oauth
```

### FieldMayBeFinal
Field `TEMP_DIR` may be 'final'
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalTempFileStore.java`
#### Snippet
```java
public class LocalTempFileStore {

  private String TEMP_DIR = "/tmp/";

  void writeInputStream(String filename, InputStream inputStream) throws IOException {
```

### FieldMayBeFinal
Field `authRetrievalUrl` may be 'final'
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java
  private String callbackHost;
  private String callbackBase;
  private String authRetrievalUrl;

  public AuthTestDriver() {
```

### FieldMayBeFinal
Field `clientId` may be 'final'
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java
public class AuthTestDriver {

  private String clientId;
  private String secret;

```

### FieldMayBeFinal
Field `callbackBase` may be 'final'
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java

  private String callbackHost;
  private String callbackBase;
  private String authRetrievalUrl;

```

### FieldMayBeFinal
Field `callbackHost` may be 'final'
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java
  private String secret;

  private String callbackHost;
  private String callbackBase;
  private String authRetrievalUrl;
```

### FieldMayBeFinal
Field `secret` may be 'final'
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java

  private String clientId;
  private String secret;

  private String callbackHost;
```

### FieldMayBeFinal
Field `localTempFileStore` may be 'final'
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java
  private static ConcurrentHashMap<String, Map<Class<? extends DataModel>, DataModel>> DATA_MAP =
      new ConcurrentHashMap<>();
  private static LocalTempFileStore localTempFileStore = new LocalTempFileStore();
  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

```

### FieldMayBeFinal
Field `JOB_MAP` may be 'final'
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java
/** An in-memory {@link JobStore} implementation that uses a concurrent map as its store. */
public final class LocalJobStore extends JobStoreWithValidator {
  private static ConcurrentHashMap<UUID, Map<String, Object>> JOB_MAP = new ConcurrentHashMap<>();
  private static ConcurrentHashMap<String, Map<Class<? extends DataModel>, DataModel>> DATA_MAP =
      new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `DATA_MAP` may be 'final'
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java
public final class LocalJobStore extends JobStoreWithValidator {
  private static ConcurrentHashMap<UUID, Map<String, Object>> JOB_MAP = new ConcurrentHashMap<>();
  private static ConcurrentHashMap<String, Map<Class<? extends DataModel>, DataModel>> DATA_MAP =
      new ConcurrentHashMap<>();
  private static LocalTempFileStore localTempFileStore = new LocalTempFileStore();
```

### FieldMayBeFinal
Field `action` may be 'final'
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferServicesController.java`
#### Snippet
```java
@Path("/transfer/services")
public class TransferServicesController {
  private Action<GetTransferServices, TransferServices> action;

  public TransferServicesController(Action<GetTransferServices, TransferServices> action) {
```

### FieldMayBeFinal
Field `action` may be 'final'
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/DataTypesController.java`
#### Snippet
```java
  private static final GetDataTypes REQUEST = new GetDataTypes();

  private Action<GetDataTypes, DataTypes> action;

  public DataTypesController(Action<GetDataTypes, DataTypes> action) {
```

### FieldMayBeFinal
Field `interfacesByAuthData` may be 'final'
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/AppleInterfaceFactory.java`
#### Snippet
```java

  private static String errorMessage = "%s is required";
  private Map<UUID, AppleBaseInterface> interfacesByAuthData = new HashMap<>();
  public synchronized AppleMediaInterface getOrCreateMediaInterface(
    UUID jobId,
```

### FieldMayBeFinal
Field `errorMessage` may be 'final'
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/AppleInterfaceFactory.java`
#### Snippet
```java
public class AppleInterfaceFactory {

  private static String errorMessage = "%s is required";
  private Map<UUID, AppleBaseInterface> interfacesByAuthData = new HashMap<>();
  public synchronized AppleMediaInterface getOrCreateMediaInterface(
```

### FieldMayBeFinal
Field `handlers` may be 'final'
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java

  private Server server;
  private List<Handler> handlers = new ArrayList<>();

  public JettyTransport(KeyStore keyStore, boolean useHttps, Monitor monitor) {
```

### FieldMayBeFinal
Field `httpPort` may be 'final'
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java
  private final Monitor monitor;

  private int httpPort = 8080; // TODO configure

  private Server server;
```

### FieldMayBeFinal
Field `monitor` may be 'final'
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
  private DataOutputStream outputStream;

  private Monitor monitor;

  public enum StreamingMode {
```

### FieldMayBeFinal
Field `file` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesListRecursiveItem.java`
#### Snippet
```java
  private String type;
  private String path;
  private FilesFile file;
  private ApiErrorDetails error;

```

### FieldMayBeFinal
Field `type` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesListRecursiveItem.java`
#### Snippet
```java
  public static final String TYPE_ERROR = "error";

  private String type;
  private String path;
  private FilesFile file;
```

### FieldMayBeFinal
Field `path` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesListRecursiveItem.java`
#### Snippet
```java

  private String type;
  private String path;
  private FilesFile file;
  private ApiErrorDetails error;
```

### FieldMayBeFinal
Field `error` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesListRecursiveItem.java`
#### Snippet
```java
  private String path;
  private FilesFile file;
  private ApiErrorDetails error;

  public FilesListRecursiveItem(
```

### FieldMayBeFinal
Field `message` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/ApiErrorDetails.java`
#### Snippet
```java
public class ApiErrorDetails {
  private String code;
  private String message;

  public ApiErrorDetails(
```

### FieldMayBeFinal
Field `code` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/ApiErrorDetails.java`
#### Snippet
```java

public class ApiErrorDetails {
  private String code;
  private String message;

```

### FieldMayBeFinal
Field `size` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesFile.java`
#### Snippet
```java
  private String type;
  private Long modified;
  private Long size;
  private String contentType;
  private String hash;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesFile.java`
#### Snippet
```java
  public static final String TYPE_DIR = "dir";

  private String name;
  private String type;
  private Long modified;
```

### FieldMayBeFinal
Field `modified` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesFile.java`
#### Snippet
```java
  private String name;
  private String type;
  private Long modified;
  private Long size;
  private String contentType;
```

### FieldMayBeFinal
Field `hash` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesFile.java`
#### Snippet
```java
  private Long size;
  private String contentType;
  private String hash;
  private Map<String, List<String>> tags;

```

### FieldMayBeFinal
Field `tags` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesFile.java`
#### Snippet
```java
  private String contentType;
  private String hash;
  private Map<String, List<String>> tags;

  public FilesFile(
```

### FieldMayBeFinal
Field `contentType` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesFile.java`
#### Snippet
```java
  private Long modified;
  private Long size;
  private String contentType;
  private String hash;
  private Map<String, List<String>> tags;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/FilesFile.java`
#### Snippet
```java

  private String name;
  private String type;
  private Long modified;
  private Long size;
```

### FieldMayBeFinal
Field `albumPhotos` may be 'final'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
  public static final String DEFAULT_ALBUM_ID = "defaultAlbumId";
  private boolean containsNonAlbumPhotos = false;
  private Set<String> albumPhotos = new HashSet<>();

  private final OkHttpClient client;
```

### FieldMayBeFinal
Field `urlFactory` may be 'final'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
  private final TemporaryPerJobDataStore jobStore;

  private Function<String, URL> urlFactory;

  public ImgurPhotosExporter(
```

### FieldMayBeFinal
Field `data` may be 'final'
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/model/TrackCollection.java`
#### Snippet
```java

public class TrackCollection {
  private Track[] data;

  @JsonCreator
```

### FieldMayBeFinal
Field `titleDateFormats` may be 'final'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java
  private final SimpleDateFormat exifDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");

  private volatile HashMap<UUID, SimpleDateFormat> titleDateFormats = new HashMap<>();

  public KoofrPhotosImporter(
```

### FieldMayBeFinal
Field `gmail` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailExporter.java`
#### Snippet
```java

  private final GoogleCredentialFactory credentialFactory;
  private volatile Gmail gmail;

  public GoogleMailExporter(GoogleCredentialFactory credentialFactory) {
```

### FieldMayBeFinal
Field `credentialFactory` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailImporter.java`
#### Snippet
```java
  @VisibleForTesting static final String LABEL = "DTP-migrated";

  private GoogleCredentialFactory credentialFactory;
  private final Gmail gmail;
  private final Monitor monitor;
```

### FieldMayBeFinal
Field `plusService` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/gplus/GooglePlusExporter.java`
#### Snippet
```java

  private final GoogleCredentialFactory credentialFactory;
  private volatile Plus plusService;

  public GooglePlusExporter(GoogleCredentialFactory credentialFactory) {
```

### FieldMayBeFinal
Field `tasksClient` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksImporter.java`
#### Snippet
```java

  private final GoogleCredentialFactory credentialFactory;
  private Tasks tasksClient;

  public GoogleTasksImporter(GoogleCredentialFactory credentialFactory) {
```

### FieldMayBeFinal
Field `bytes` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/PhotoResult.java`
#### Snippet
```java
public class PhotoResult implements Serializable {
  private String id;
  private Long bytes;

  public PhotoResult(String id, Long bytes) {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/PhotoResult.java`
#### Snippet
```java

public class PhotoResult implements Serializable {
  private String id;
  private Long bytes;

```

### FieldMayBeFinal
Field `authData` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
  private UUID jobId;
  private IdempotentImportExecutor executor;
  private TokensAndUrlAuthData authData;

  // We partition into groups of 49 as 50 is the maximum number of items that can be created
```

### FieldMayBeFinal
Field `executor` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
public class GPhotosUpload {
  private UUID jobId;
  private IdempotentImportExecutor executor;
  private TokensAndUrlAuthData authData;

```

### FieldMayBeFinal
Field `jobId` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/gphotos/GPhotosUpload.java`
#### Snippet
```java
// org.datatransferproject.datatransfer.google.common.gphotos package
public class GPhotosUpload {
  private UUID jobId;
  private IdempotentImportExecutor executor;
  private TokensAndUrlAuthData authData;
```

### FieldMayBeFinal
Field `bytes` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/VideoResult.java`
#### Snippet
```java
class VideoResult implements Serializable {
  private String id;
  private Long bytes;

  public VideoResult(String id, Long bytes) {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/VideoResult.java`
#### Snippet
```java

class VideoResult implements Serializable {
  private String id;
  private Long bytes;

```

### FieldMayBeFinal
Field `musicHttpApi` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java
  private final GoogleCredentialFactory credentialFactory;
  private final JsonFactory jsonFactory;
  private volatile GoogleMusicHttpApi musicHttpApi;
  private final Map<UUID, GoogleMusicHttpApi> musicHttpApisMap;
  private final TemporaryPerJobDataStore dataStore;
```

### FieldMayBeFinal
Field `calendarInterface` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarImporter.java`
#### Snippet
```java

  private final GoogleCredentialFactory credentialFactory;
  private volatile Calendar calendarInterface;

  public GoogleCalendarImporter(GoogleCredentialFactory credentialFactory) {
```

### FieldMayBeFinal
Field `blogger` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/blogger/GoogleBloggerImporter.java`
#### Snippet
```java
  private final GoogleCredentialFactory credentialFactory;
  // Don't access this directly, instead access via getOrCreateBloggerService.
  private Blogger blogger;
  // Don't access this directly, instead access via getOrCreateDriveService.
  // Used for image upload/hosting.
```

### FieldMayBeFinal
Field `peopleService` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java

  private final GoogleCredentialFactory credentialFactory;
  private volatile PeopleService peopleService;

  public GoogleContactsImporter(GoogleCredentialFactory credentialFactory) {
```

### FieldMayBeFinal
Field `calendarInterface` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java

  private final GoogleCredentialFactory credentialFactory;
  private volatile Calendar calendarInterface;

  public GoogleCalendarExporter(GoogleCredentialFactory credentialFactory) {
```

### FieldMayBeFinal
Field `peopleService` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java

  private final GoogleCredentialFactory credentialFactory;
  private volatile PeopleService peopleService;

  public GoogleContactsExporter(GoogleCredentialFactory credentialFactory) {
```

### FieldMayBeFinal
Field `jsonFactory` may be 'final'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
  private final HttpTransport httpTransport = new NetHttpTransport();
  private final Credential credential;
  private JsonFactory jsonFactory;

  GoogleVideosInterface(Credential credential, JsonFactory jsonFactory) {
```

### FieldMayBeFinal
Field `smugMugInterface` may be 'final'
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugPhotosExporter.java`
#### Snippet
```java
  private final Monitor monitor;

  private SmugMugInterface smugMugInterface;

  public SmugMugPhotosExporter(
```

### FieldMayBeFinal
Field `client` may be 'final'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/RestFbFacebookVideos.java`
#### Snippet
```java

public class RestFbFacebookVideos implements FacebookVideosInterface {
  private DefaultFacebookClient client;

  RestFbFacebookVideos(TokensAndUrlAuthData authData, AppCredentials appCredentials) {
```

### FieldMayBeFinal
Field `client` may be 'final'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/RestFbFacebookPhotos.java`
#### Snippet
```java

public class RestFbFacebookPhotos implements FacebookPhotosInterface {
  private DefaultFacebookClient client;

  RestFbFacebookPhotos(TokensAndUrlAuthData authData, AppCredentials appCredentials) {
```

### FieldMayBeFinal
Field `appCredentials` may be 'final'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/FacebookVideosImporter.java`
#### Snippet
```java
  }

  private AppCredentials appCredentials;

  @Override
```

### FieldMayBeFinal
Field `appCredentials` may be 'final'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/FacebookVideosExporter.java`
#### Snippet
```java

  private final Monitor monitor;
  private AppCredentials appCredentials;
  private FacebookVideosInterface videosInterface;

```

### FieldMayBeFinal
Field `inReplyToId` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  @Nullable private String url;
  private Account account;
  @Nullable private String inReplyToId;
  @Nullable private String inReplyToAccountId;
  private String content;
```

### FieldMayBeFinal
Field `content` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  @Nullable private String inReplyToId;
  @Nullable private String inReplyToAccountId;
  private String content;
  private String createdAtTime;

```

### FieldMayBeFinal
Field `url` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  private String id;
  private String uri;
  @Nullable private String url;
  private Account account;
  @Nullable private String inReplyToId;
```

### FieldMayBeFinal
Field `uri` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
public class Status {
  private String id;
  private String uri;
  @Nullable private String url;
  private Account account;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {
  private String id;
  private String uri;
  @Nullable private String url;
```

### FieldMayBeFinal
Field `createdAtTime` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  @Nullable private String inReplyToAccountId;
  private String content;
  private String createdAtTime;


```

### FieldMayBeFinal
Field `moved` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Account.java`
#### Snippet
```java
  private int statusesCount;
  private String url;
  private boolean moved;

  @JsonCreator
```

### FieldMayBeFinal
Field `acct` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Account.java`
#### Snippet
```java
  private String id;
  private String username;
  private String acct;
  private String displayName;
  private int statusesCount;
```

### FieldMayBeFinal
Field `displayName` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Account.java`
#### Snippet
```java
  private String username;
  private String acct;
  private String displayName;
  private int statusesCount;
  private String url;
```

### FieldMayBeFinal
Field `url` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Account.java`
#### Snippet
```java
  private String displayName;
  private int statusesCount;
  private String url;
  private boolean moved;

```

### FieldMayBeFinal
Field `statusesCount` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Account.java`
#### Snippet
```java
  private String acct;
  private String displayName;
  private int statusesCount;
  private String url;
  private boolean moved;
```

### FieldMayBeFinal
Field `username` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Account.java`
#### Snippet
```java
public class Account {
  private String id;
  private String username;
  private String acct;
  private String displayName;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Account.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
  private String id;
  private String username;
  private String acct;
```

### FieldMayBeFinal
Field `account` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  private String uri;
  @Nullable private String url;
  private Account account;
  @Nullable private String inReplyToId;
  @Nullable private String inReplyToAccountId;
```

### FieldMayBeFinal
Field `inReplyToAccountId` may be 'final'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  private Account account;
  @Nullable private String inReplyToId;
  @Nullable private String inReplyToAccountId;
  private String content;
  private String createdAtTime;
```

### FieldMayBeFinal
Field `appCredentials` may be 'final'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java
  private final TemporaryPerJobDataStore store;

  private AppCredentials appCredentials;
  private FacebookPhotosInterface photosInterface;
  private final SimpleDateFormat exifDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
```

### FieldMayBeFinal
Field `from` may be 'final'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/TransformerServiceImpl.java`
#### Snippet
```java

  private class TransformKey {
    private Class<?> from;
    private Class<?> to;

```

### FieldMayBeFinal
Field `to` may be 'final'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/TransformerServiceImpl.java`
#### Snippet
```java
  private class TransformKey {
    private Class<?> from;
    private Class<?> to;

    public TransformKey(Class<?> from, Class<?> to) {
```

### FieldMayBeFinal
Field `service` may be 'final'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksImporter.java`
#### Snippet
```java
  private final AppCredentials appCredentials;
  private final Monitor monitor;
  private RememberTheMilkService service;

  public RememberTheMilkTasksImporter(
```

### FieldMayBeFinal
Field `service` may be 'final'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java

  private final AppCredentials appCredentials;
  private RememberTheMilkService service;

  public RememberTheMilkTasksExporter(AppCredentials appCredentials) {
```

### FieldMayBeFinal
Field `xmlMapper` may be 'final'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkService.java`
#### Snippet
```java
  private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
  private RememberTheMilkSignatureGenerator signatureGenerator;
  private XmlMapper xmlMapper = new XmlMapper();

  RememberTheMilkService(RememberTheMilkSignatureGenerator signatureGenerator) {
```

### FieldMayBeFinal
Field `signatureGenerator` may be 'final'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkService.java`
#### Snippet
```java
  private static final String BASE_URL = "https://api.rememberthemilk.com/services/rest/";
  private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
  private RememberTheMilkSignatureGenerator signatureGenerator;
  private XmlMapper xmlMapper = new XmlMapper();

```

### FieldMayBeFinal
Field `jobStore` may be 'final'
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/GetTransferJobAction.java`
#### Snippet
```java
/** Requests a transfer job. */
public class GetTransferJobAction implements Action<GetTransferJob, TransferJob> {
  private JobStore jobStore;
  private final Monitor monitor;

```

### FieldMayBeFinal
Field `decrypterFactory` may be 'final'
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/GenerateServiceAuthDataAction.java`
#### Snippet
```java
  private final SymmetricKeyGenerator symmetricKeyGenerator;
  private final ObjectMapper objectMapper;
  private DecrypterFactory decrypterFactory;
  private final Monitor monitor;

```

### FieldMayBeFinal
Field `jobStore` may be 'final'
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/GenerateServiceAuthDataAction.java`
#### Snippet
```java
public class GenerateServiceAuthDataAction
    implements Action<GenerateServiceAuthData, ServiceAuthData> {
  private JobStore jobStore;
  private final AuthServiceProviderRegistry registry;
  private final SymmetricKeyGenerator symmetricKeyGenerator;
```

### FieldMayBeFinal
Field `jobId` may be 'final'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CredsTimeoutException.java`
#### Snippet
```java

public class CredsTimeoutException extends RuntimeException {
  private UUID jobId;

  public CredsTimeoutException(String message, UUID jobId) {
```

### FieldMayBeFinal
Field `jobId` may be 'final'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableExporter.java`
#### Snippet
```java

  private Provider<Exporter> exporterProvider;
  private UUID jobId;
  private AuthData authData;
  private Optional<ExportInformation> exportInformation;
```

### FieldMayBeFinal
Field `exportInformation` may be 'final'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableExporter.java`
#### Snippet
```java
  private UUID jobId;
  private AuthData authData;
  private Optional<ExportInformation> exportInformation;
  private final DtpInternalMetricRecorder metricRecorder;

```

### FieldMayBeFinal
Field `authData` may be 'final'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableExporter.java`
#### Snippet
```java
  private Provider<Exporter> exporterProvider;
  private UUID jobId;
  private AuthData authData;
  private Optional<ExportInformation> exportInformation;
  private final DtpInternalMetricRecorder metricRecorder;
```

### FieldMayBeFinal
Field `exporterProvider` may be 'final'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableExporter.java`
#### Snippet
```java
public class CallableExporter implements Callable<ExportResult> {

  private Provider<Exporter> exporterProvider;
  private UUID jobId;
  private AuthData authData;
```

### FieldMayBeFinal
Field `delegates` may be 'final'
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/MultiplexMonitor.java`
#### Snippet
```java
/** Forwards monitor events to a set of delegates. */
public class MultiplexMonitor implements JobAwareMonitor {
  private Monitor[] delegates;

  public MultiplexMonitor(Monitor... delegates) {
```

### FieldMayBeFinal
Field `ansi` may be 'final'
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
  private static final String ANSI_BLUE = "\u001B[34m";

  private boolean ansi;

  public ConsoleMonitor(Level level) {
```

### FieldMayBeFinal
Field `level` may be 'final'
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
/** Outputs monitor events to the console. Uses ANSI color codes in shells that support them. */
public class ConsoleMonitor implements Monitor {
  private Level level;

  public enum Level {
```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/i18n/BaseMultilingualString.java`
#### Snippet
```java

  private String key;
  private String defaultValue;

  BaseMultilingualString(String key, String defaultValue) {
```

### FieldMayBeFinal
Field `key` may be 'final'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/i18n/BaseMultilingualString.java`
#### Snippet
```java
  CopyOf("copyof", "Copy of {0}");

  private String key;
  private String defaultValue;

```

### FieldMayBeFinal
Field `delegates` may be 'final'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/hooks/MultiplexJobHooks.java`
#### Snippet
```java
/** Forwards job hook events to a set of delegates. */
public class MultiplexJobHooks implements JobHooks {
  private JobHooks[] delegates;

  public MultiplexJobHooks(JobHooks... delegates) {
```

### FieldMayBeFinal
Field `bundle` may be 'final'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/i18n/AbstractMultilingualDictionary.java`
#### Snippet
```java
public class AbstractMultilingualDictionary {
  private Hashtable<MultilingualString, String> dict = new Hashtable<>();
  private String bundle;

  public AbstractMultilingualDictionary(
```

### FieldMayBeFinal
Field `dict` may be 'final'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/i18n/AbstractMultilingualDictionary.java`
#### Snippet
```java

public class AbstractMultilingualDictionary {
  private Hashtable<MultilingualString, String> dict = new Hashtable<>();
  private String bundle;

```

### FieldMayBeFinal
Field `containerResources` may be 'final'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/ContinuationData.java`
#### Snippet
```java
public class ContinuationData extends PortableType {
  private final PaginationData paginationData;
  private List<ContainerResource> containerResources = new ArrayList<>();

  @JsonCreator
```

### FieldMayBeFinal
Field `type` may be 'final'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ExportResult.java`
#### Snippet
```java
  public static final ExportResult END = new ExportResult(ResultType.CONTINUE);

  private ResultType type;
  private T exportedData;
  private ContinuationData continuationData;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  public static final ImportResult OK = new ImportResult(ResultType.OK);

  private ResultType type;
  // Throwable should be absent unless an error was thrown during export
  private Optional<Throwable> throwable = Optional.empty();
```

### FieldMayBeFinal
Field `authData` may be 'final'
in `portability-types-client/src/main/java/org/datatransferproject/types/client/transfer/ServiceAuthData.java`
#### Snippet
```java
/** Auth data for an export or import service. */
public class ServiceAuthData {
  private String authData;

  public ServiceAuthData(@JsonProperty(value = "authData", required = true) String authData) {
```

### FieldMayBeFinal
Field `byArtists` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/music/MusicRelease.java`
#### Snippet
```java
  private final String icpnCode;
  private final String title;
  private List<MusicGroup> byArtists;

  @JsonCreator
```

### FieldMayBeFinal
Field `sha1` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/photos/PhotoModel.java`
#### Snippet
```java
  private final boolean inTempStore;
  private String dataId;
  @Nullable private String sha1;  // SHA-1 hash in Hex (base16).
  private Date uploadedTime;

```

### FieldMayBeFinal
Field `uploadedTime` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/photos/PhotoModel.java`
#### Snippet
```java
  private String dataId;
  @Nullable private String sha1;  // SHA-1 hash in Hex (base16).
  private Date uploadedTime;

  @JsonCreator
```

### FieldMayBeFinal
Field `dataId` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/photos/PhotoModel.java`
#### Snippet
```java
  private String albumId;
  private final boolean inTempStore;
  private String dataId;
  @Nullable private String sha1;  // SHA-1 hash in Hex (base16).
  private Date uploadedTime;
```

### FieldMayBeFinal
Field `musicAlbum` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/MusicRecording.java`
#### Snippet
```java
  // from the spec as needed.
  private String isrcCode;
  private MusicAlbum musicAlbum;
  private MusicGroup byArtist;

```

### FieldMayBeFinal
Field `byArtist` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/MusicRecording.java`
#### Snippet
```java
  private String isrcCode;
  private MusicAlbum musicAlbum;
  private MusicGroup byArtist;

  public MusicRecording(
```

### FieldMayBeFinal
Field `isrcCode` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/MusicRecording.java`
#### Snippet
```java
  // Note this is only a partial implementation for fields needed so far, feel free to add more
  // from the spec as needed.
  private String isrcCode;
  private MusicAlbum musicAlbum;
  private MusicGroup byArtist;
```

### FieldMayBeFinal
Field `headline` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/MusicGroup.java`
#### Snippet
```java
  // NOTE: only a subset of fields are used so far, feel free to add more fields from the spec as
  // needed.
  private String headline;

  public MusicGroup(String headline) {
```

### FieldMayBeFinal
Field `track` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/MusicPlaylist.java`
#### Snippet
```java
  // NOTE: only a subset of fields are used so far, feel free to add more fields from the spec as
  // needed.
  private ImmutableList<MusicRecording> track;

  public MusicPlaylist(
```

### FieldMayBeFinal
Field `dataId` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/videos/VideoModel.java`
#### Snippet
```java
public class VideoModel extends MediaObject implements DownloadableFile {

  private String dataId;
  private String albumId;
  private boolean inTempStore;
```

### FieldMayBeFinal
Field `inTempStore` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/videos/VideoModel.java`
#### Snippet
```java
  private String dataId;
  private String albumId;
  private boolean inTempStore;
  private Date uploadedTime;

```

### FieldMayBeFinal
Field `uploadedTime` may be 'final'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/videos/VideoModel.java`
#### Snippet
```java
  private String albumId;
  private boolean inTempStore;
  private Date uploadedTime;

  @JsonCreator
```

### FieldMayBeFinal
Field `exportAuthData` may be 'final'
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/auth/AuthDataPair.java`
#### Snippet
```java
/** Encapsulates authorization tokens needed to perform a data transfer. */
public class AuthDataPair  {
  private String exportAuthData;
  private String importAuthData;

```

### FieldMayBeFinal
Field `importAuthData` may be 'final'
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/auth/AuthDataPair.java`
#### Snippet
```java
public class AuthDataPair  {
  private String exportAuthData;
  private String importAuthData;

  @JsonCreator
```

### FieldMayBeFinal
Field `knownValues` may be 'final'
in `portability-test-utilities/src/main/java/org/datatransferproject/test/types/FakeIdempotentImportExecutor.java`
#### Snippet
```java
public class FakeIdempotentImportExecutor implements IdempotentImportExecutor {

  private HashMap<String, Serializable> knownValues = new HashMap<>();

  @Override
```

## RuleId[id=CachedNumberConstructorCall]
### CachedNumberConstructorCall
Number constructor call with primitive argument
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
      } else if (entity.getValue(property) instanceof LongValue) {
        // This conversion is safe because of integer to long conversion above
        builder.put(property, new Long(entity.getLong(property)).intValue());
      } else if (entity.getValue(property) instanceof DoubleValue) {
        builder.put(property, (Double) entity.getDouble(property));
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `portability-test-utilities/src/main/java/org/datatransferproject/test/types/FakeIdempotentImportExecutor.java`
#### Snippet
```java
      System.out.println("Storing key " + idempotentId + " in cache");
      return result;
    } catch (Exception e) {
      throw e;
    }
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/AppleMediaInterface.java`
#### Snippet
```java
        dataIdToUploadResponseMap.put(dataId, singleFileUploadResponse);
      } catch (AppleContentException | IOException e) {
        continue;
      }
    }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
        if (video != null) {
          videos.add(video);
          continue;
        }
      }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `tokenData` is redundant
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java

    // get the token
    TokenAuthData tokenData = (TokenAuthData)
        authDataGenerator.generateAuthData(
            callbackBase, authCode, "1", configuration.getInitialAuthData(), null);
```

### UnnecessaryLocalVariable
Local variable `authCode` is redundant
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java
        throw new AssertionError("AUTH ERROR: " + authResponse.code() + ":" + "<empty body>");
      }
      String authCode = new String(authBody.bytes());

      // System.out.println("AUTH: " + authResponse.code() + ":" + authCode);
```

### UnnecessaryLocalVariable
Local variable `mediaInterface` is redundant
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/AppleInterfaceFactory.java`
#### Snippet
```java
    String exportingService,
    Monitor monitor) {
    AppleMediaInterface mediaInterface = (AppleMediaInterface)interfacesByAuthData
      .computeIfAbsent(jobId, key ->  makeMediaInterface(authData, appCredentials,
        exportingService, monitor));
```

### UnnecessaryLocalVariable
Local variable `truncatedBuffer` is redundant
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/streaming/StreamingContentClient.java`
#### Snippet
```java
          return null;
        } else {
          final byte[] truncatedBuffer = Arrays.copyOf(buffer, bytesRead);
          return truncatedBuffer;
        }
```

### UnnecessaryLocalVariable
Local variable `photoId` is redundant
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrMediaExport.java`
#### Snippet
```java

  protected void processPhoto(FilesFile file, String path, String albumId) {
    String photoId = path;
    String name = getFileName(file);
    String description = getFileDescription(file);
```

### UnnecessaryLocalVariable
Local variable `albumId` is redundant
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrMediaExport.java`
#### Snippet
```java

  protected void processAlbum(FilesFile file, String path) {
    String albumId = path;
    String albumName = getFileName(file);
    String description = getFileDescription(file);
```

### UnnecessaryLocalVariable
Local variable `videoId` is redundant
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrMediaExport.java`
#### Snippet
```java

  protected void processVideo(FilesFile file, String path, String albumId) {
    String videoId = path;
    String name = getFileName(file);
    String description = getFileDescription(file);
```

### UnnecessaryLocalVariable
Local variable `getUploadUrlsResponse` is redundant
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/AppleMediaInterface.java`
#### Snippet
```java
    final byte[] getUploadUrlsResponseData =
        makePhotosServicePostRequest(baseUrl + "getuploadurls", payload);
    final GetUploadUrlsResponse getUploadUrlsResponse =
        GetUploadUrlsResponse.parseFrom(getUploadUrlsResponseData);
    return getUploadUrlsResponse;
```

### UnnecessaryLocalVariable
Local variable `importResults` is redundant
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/AppleMediaInterface.java`
#### Snippet
```java
    }

    final Map<String, Long> importResults =
        new ImmutableMap.Builder<String, Long>()
            .put(ApplePhotosConstants.BYTES_KEY, successMediaSize)
```

### UnnecessaryLocalVariable
Local variable `batchImportResults` is redundant
in `extensions/data-transfer/portability-data-transfer-apple/src/main/java/org/datatransferproject/datatransfer/apple/photos/AppleMediaInterface.java`
#### Snippet
```java
        AuditKeys.bytesExported, totalBytes);

    final Map<String, Long> batchImportResults =
        new ImmutableMap.Builder<String, Long>()
            .put(ApplePhotosConstants.BYTES_KEY, totalBytes)
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
          "Bad status code: " + statusCode + " error: " + response.getStatusMessage());
    }
    String result =
        CharStreams.toString(new InputStreamReader(response.getContent(), Charsets.UTF_8));
    return result;
```

### UnnecessaryLocalVariable
Local variable `accountInfo` is redundant
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/social/MastodonHttpUtilities.java`
#### Snippet
```java
  /** Gets the account info via verify_credentials. **/
  private Account fetchAccount() throws IOException {
    Account accountInfo = request(ACCOUNT_VERIFICATION_URL, Account.class);
    return accountInfo;
  }
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugInterface.java`
#### Snippet
```java
    Preconditions.checkArgument(
        !Strings.isNullOrEmpty(url), "Album URI is required to retrieve album information");
    SmugMugAlbumImageResponse response =
        makeRequest(url, new TypeReference<SmugMugResponse<SmugMugAlbumImageResponse>>() {})
            .getResponse();
```

### UnnecessaryLocalVariable
Local variable `extension` is redundant
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/idempotentexecutor/IdempotentImportExecutorLoader.java`
#### Snippet
```java
      return new InMemoryIdempotentImportExecutorExtension();
    } else if (executors.size() == 1) {
      IdempotentImportExecutorExtension extension = executors.get(0);
      return extension;
    } else {
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/retry/RetryingCallable.java`
#### Snippet
```java
          if (nextAttemptIntervalMillis > 0L) {
            try {
              Thread.sleep(nextAttemptIntervalMillis);
              // wait is now complete, retry
            } catch (InterruptedException ie) {
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
        requestFactory.buildGetRequest(
            new GenericUrl(url + "?output=json&access_token=" + accessToken));
    perUserRateLimiter.acquire();
    HttpResponse response = getRequest.execute();
    int statusCode = response.getStatusCode();
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
                + "?output=json&request_method=post&access_token=" + accessToken
                + extraArgs));
    perUserRateLimiter.acquire();
    HttpResponse response = getRequest.execute();
    int statusCode = response.getStatusCode();
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
  private final String accessToken;
  private final HttpTransport httpTransport;
  private final RateLimiter perUserRateLimiter;

  public DeezerApi(
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosImporter.java`
#### Snippet
```java
            .setTitle(photoTitle)
            .setDescription(photoDescription);
    perUserRateLimiter.acquire();
    try (InputStream is = connectionProvider.getInputStreamForItem(jobId, photo).getStream()) {
      String uploadResult = uploader.upload(is, uploadMetaData);
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosImporter.java`
#### Snippet
```java
  private final PhotosetsInterface photosetsInterface;
  private final Monitor monitor;
  private final RateLimiter perUserRateLimiter;
  private IdempotentImportExecutor retryingIdempotentExecutor;
  private Boolean enableRetrying;
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosImporter.java`
#### Snippet
```java
          String albumDescription = cleanString(album.getDescription());

          perUserRateLimiter.acquire();
          Photoset photoset = photosetsInterface.create(albumName, albumDescription, firstPhotoId);
          monitor.debug(() -> String.format("Flickr importer created album: %s", album));
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
      if (Strings.isNullOrEmpty(photoSetId)) {
        RequestContext.getRequestContext().setExtras(EXTRAS);
        perUserRateLimiter.acquire();
        photoSetList = photosInterface.getNotInSet(PHOTO_PER_PAGE, page);
        RequestContext.getRequestContext().setExtras(ImmutableList.of());
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
        RequestContext.getRequestContext().setExtras(ImmutableList.of());
      } else {
        perUserRateLimiter.acquire();
        photoSetList =
            photosetsInterface.getPhotos(
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
  private final PhotosInterface photosInterface;
  private final Flickr flickr;
  private final RateLimiter perUserRateLimiter;

  public FlickrPhotosExporter(AppCredentials appCredentials, TransferServiceConfig serviceConfig) {
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java

    try {
      perUserRateLimiter.acquire();
      photoSetList =
          photosetsInterface.getList(
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private final Monitor monitor;
  private final GoogleCredentialFactory credentialFactory;
  private final RateLimiter writeRateLimiter;

  GoogleMusicHttpApi(
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    this.monitor = monitor;
    this.credentialFactory = credentialFactory;
    this.writeRateLimiter = RateLimiter.create(writesPerSecond);
  }

```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    this.monitor = monitor;
    this.credentialFactory = credentialFactory;
    this.writeRateLimiter = RateLimiter.create(writesPerSecond);
  }

```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
      throws IOException, InvalidTokenException, PermissionDeniedException {
    // Wait for write permit before making request
    writeRateLimiter.acquire();

    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
      throws IOException, InvalidTokenException, PermissionDeniedException {
    // Wait for write permit before making request
    writeRateLimiter.acquire();

    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    this.monitor = monitor;
    this.credentialFactory = credentialFactory;
    writeRateLimiter = RateLimiter.create(writesPerSecond);
  }

```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    this.monitor = monitor;
    this.credentialFactory = credentialFactory;
    writeRateLimiter = RateLimiter.create(writesPerSecond);
  }

```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    // Wait for write permit before making request
    writeRateLimiter.acquire();

    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  private final Monitor monitor;
  private final GoogleCredentialFactory credentialFactory;
  private final RateLimiter writeRateLimiter;

  public GooglePhotosInterface(
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java

  /**
   * A {@link RateLimiter} that enforces the per-user rate limit that is specified in
   * the config/[service].yaml config file.
   **/
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java
   * the config/[service].yaml config file.
   **/
  public RateLimiter getPerUserRateLimiter() {
    return rateLimiter;
  }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java
  private static final ObjectMapper YAML_OBJECT_MAPPER = new ObjectMapper(new YAMLFactory());

  private final RateLimiter rateLimiter;

  public static TransferServiceConfig create(InputStream s) throws IOException {
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java
  private TransferServiceConfig(TransferServiceConfigSpecification specification) {
    checkNotNull(specification, "specification can't be null");
    rateLimiter = RateLimiter.create(specification.getPerUserRateLimit());
  }

```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java
  private TransferServiceConfig(TransferServiceConfigSpecification specification) {
    checkNotNull(specification, "specification can't be null");
    rateLimiter = RateLimiter.create(specification.getPerUserRateLimit());
  }

```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'newPage' to 'IntPaginationToken'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
    if (hasMore) {
      newPage = new IntPaginationToken(page + 1);
      int start = ((IntPaginationToken) newPage).getStart();
      monitor.info(() -> format("albums size: %s, newPage: %s", items.size(), start));
    }
```

