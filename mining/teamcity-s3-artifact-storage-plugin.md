# teamcity-s3-artifact-storage-plugin 
 
# Bad smells
I found 107 bad smells with 12 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StaticCallOnSubclass | 26 | false |
| ReturnNull | 14 | false |
| ConstantValue | 12 | false |
| BoundedWildcard | 7 | false |
| UnusedAssignment | 7 | false |
| UnnecessaryModifier | 6 | true |
| DataFlowIssue | 5 | false |
| Convert2MethodRef | 5 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| MissortedModifiers | 3 | false |
| NonExceptionNameEndsWithException | 3 | false |
| CodeBlock2Expr | 2 | true |
| DeprecatedIsStillUsed | 2 | false |
| EmptyMethod | 2 | false |
| RedundantFieldInitialization | 2 | false |
| IOResource | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UNUSED_IMPORT | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
| FuseStreamOperations | 1 | false |
| RedundantSuppression | 1 | false |
## RuleId[id=IOResource]
### IOResource
'PemWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3CloudFrontDistributionCreationController.java`
#### Snippet
```java
    PemObject pemObject = new PemObject(header, key);
    StringWriter writer = new StringWriter();
    PemWriter pemWriter = new PemWriter(writer);
    pemWriter.writeObject(pemObject);
    pemWriter.flush();
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/PresignedUrlsProviderClient.java`
#### Snippet
```java
  void startMultipartUpload(@NotNull MultipartUploadStartRequestDto multipartUploadStart);

  static class MisconfigurationException extends RuntimeException {
    public MisconfigurationException(@NotNull final Throwable cause) {
      super(cause);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/errors/HttpResponseErrorHandler.java`
#### Snippet
```java
  static final HashSet<Integer> OUR_RECOVERABLE_STATUS_CODES = new HashSet<>(Arrays.asList(500, 502, 503, 504));

  public boolean canHandle(@NotNull ResponseAdapter responseWrapper);

  @NotNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/errors/HttpResponseErrorHandler.java`
#### Snippet
```java

  @NotNull
  public default String name() {
    return getClass().getName();
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/errors/HttpResponseErrorHandler.java`
#### Snippet
```java
public interface HttpResponseErrorHandler {
  @NotNull
  static final HashSet<Integer> OUR_RECOVERABLE_STATUS_CODES = new HashSet<>(Arrays.asList(500, 502, 503, 504));

  public boolean canHandle(@NotNull ResponseAdapter responseWrapper);
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/errors/HttpResponseErrorHandler.java`
#### Snippet
```java
public interface HttpResponseErrorHandler {
  @NotNull
  static final HashSet<Integer> OUR_RECOVERABLE_STATUS_CODES = new HashSet<>(Arrays.asList(500, 502, 503, 504));

  public boolean canHandle(@NotNull ResponseAdapter responseWrapper);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/errors/HttpResponseErrorHandler.java`
#### Snippet
```java

  @NotNull
  public HttpClientUtil.HttpErrorCodeException handle(@NotNull ResponseAdapter responseWrapper);

  @NotNull
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CloudFrontConstants` has only 'static' members, and lacks a 'private' constructor
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/cloudfront/CloudFrontConstants.java`
#### Snippet
```java
import jetbrains.buildServer.serverSide.TeamCityProperties;

public class CloudFrontConstants {
  private static final String S3_ENABLE_CLOUDFRONT_INTEGRATION = "teamcity.s3.use.cloudfront.enabled";

```

### UtilityClassWithoutPrivateConstructor
Class `S3Constants` has only 'static' members, and lacks a 'private' constructor
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Constants.java`
#### Snippet
```java
 * date: 08.02.2016.
 */
public class S3Constants {

  public static final String S3_ADDRESS = "s3.amazonaws.com";
```

### UtilityClassWithoutPrivateConstructor
Class `PresignedUrlRequestSerializer` has only 'static' members, and lacks a 'private' constructor
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/transport/PresignedUrlRequestSerializer.java`
#### Snippet
```java
 * Created by Evgeniy Koshkin (evgeniy.koshkin@jetbrains.com) on 21.07.17.
 */
public class PresignedUrlRequestSerializer {
  @NotNull
  public static final String UPLOAD_SUCCESSFUL = "s3-multipart-upload-successful";
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3StoragePropertiesUtil.java`
#### Snippet
```java
      return null;
    }
    return str.replace("\r", "");
  }

```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/cloudfront/CloudFrontPresignedUrlProviderImpl.java`
#### Snippet
```java

      String encodedObjectKey = SdkHttpUtils.urlEncode(objectKey, true);
      if (jetbrains.buildServer.util.StringUtil.isNotEmpty(domain) && StringUtil.isNotEmpty(publicKeyId)) {
        String resourcePath = SignerUtils.generateResourcePath(SignerUtils.Protocol.https, domain, encodedObjectKey);

```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/util/LowLevelS3Client.java`
#### Snippet
```java
  private String parseEtags(@NotNull final HttpResponseAdapter response) {
    final String eTags = response.getHeader("ETag");
    if (!StringUtil.isEmpty(eTags)) {
      return StringUtil.unquoteString(eTags);
    } else {
```

### StaticCallOnSubclass
Static method `unquoteString()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/util/LowLevelS3Client.java`
#### Snippet
```java
    final String eTags = response.getHeader("ETag");
    if (!StringUtil.isEmpty(eTags)) {
      return StringUtil.unquoteString(eTags);
    } else {
      throw new FileUploadFailedException("Response does not contain etags", true);
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/settings/CloudFrontPropertiesProcessor.java`
#### Snippet
```java
    final ArrayList<InvalidProperty> invalids = new ArrayList<>();

    if (StringUtil.isEmptyOrSpaces(S3Util.getCloudFrontUploadDistribution(params))) {
      invalids.add(new InvalidProperty(S3_CLOUDFRONT_UPLOAD_DISTRIBUTION, "CloudFront distribution for upload should not be empty"));
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/settings/CloudFrontPropertiesProcessor.java`
#### Snippet
```java
    }

    if (StringUtil.isEmptyOrSpaces(S3Util.getCloudFrontDownloadDistribution(params))) {
      invalids.add(new InvalidProperty(S3_CLOUDFRONT_DOWNLOAD_DISTRIBUTION, "CloudFront distribution for download should not be empty"));
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-agent/src/main/java/jetbrains/buildServer/artifacts/s3/publish/S3ArtifactsPublisher.java`
#### Snippet
```java
    final List<String> pathSegments = new ArrayList<>();
    final String prefix = build.getArtifactStorageSettings().getOrDefault(S3Constants.S3_PATH_PREFIX_SETTING, "");
    if (!StringUtil.isEmptyOrSpaces(prefix)) {
      pathSegments.add(prefix);
    }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/errors/HttpResponseAdapter.java`
#### Snippet
```java
  public String getHeader(@NotNull final String header) {
    final String responseHeader = myDelegate.getHeader(header);
    if (StringUtil.isEmpty(responseHeader)) {
      return null;
    } else {
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3StoragePropertiesUtil.java`
#### Snippet
```java

  private static boolean useDefaultEnvironment(@NotNull final Map<String, String> properties) {
    return StringUtil.isEmpty(properties.get(AWSCommonParams.ENVIRONMENT_NAME_PARAM));
  }

```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/S3ArtifactContentProvider.java`
#### Snippet
```java
      final AWSException awsException = new AWSException(t);
      final String details = awsException.getDetails();
      if (StringUtil.isNotEmpty(details)) {
        final String message = awsException.getMessage() + details;
        LOG.warn(message);
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/TeamCityServerPresignedUrlsProviderClient.java`
#### Snippet
```java

      final String responseBody = HttpClientUtil.executeAndReleaseConnection(post, myErrorHandler).get().getResponse();
      if (StringUtil.isEmpty(responseBody)) {
        throw new FetchFailedException("Response returned with empty body");
      }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/TeamCityServerPresignedUrlsProviderClient.java`
#### Snippet
```java

    final String response = HttpClientUtil.executeAndReleaseConnection(post, myErrorHandler).get().getResponse();
    if (StringUtil.isEmpty(response)) {
      throw new IllegalStateException("Response body is empty");
    }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
  @NotNull
  private static Pair<Long, String> parseMultipartUploadByteSetting(@Nullable String value) {
    if (StringUtil.isEmpty(value)) {
      return Pair.create(null, null);
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
    }
    final Map<String, String> invalids = new HashMap<>();
    if (StringUtil.isEmptyOrSpaces(getBucketName(params))) {
      invalids.put(beanPropertyNameForBucketName(), "S3 bucket name must not be empty");
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
    }
    final String pathPrefix = params.getOrDefault(S3_PATH_PREFIX_SETTING, "");
    if (!StringUtil.isEmptyOrSpaces(pathPrefix)) {
      if (pathPrefix.length() > OUT_MAX_PREFIX_LENGTH) {
        invalids.put(S3_PATH_PREFIX_SETTING, "Should be less than " + OUT_MAX_PREFIX_LENGTH + " characters");
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java

  public static String normalizeArtifactPath(final String path, final File file) {
    if (StringUtil.isEmpty(path)) {
      return file.getName();
    } else {
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
    final String strValue = configurationParameters.get(parameterName);
    try {
      if (StringUtil.isNotEmpty(strValue)) {
        final int intValue = Integer.parseInt(strValue);
        if (intValue >= 0) {
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
    }
    String contentType = URLConnection.guessContentTypeFromName(file.getName());
    if (StringUtil.isNotEmpty(contentType)) {
      return contentType;
    } else {
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
      try {
        contentType = Files.probeContentType(file.toPath());
        if (StringUtil.isNotEmpty(contentType)) {
          return contentType;
        }
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/S3RegularFileUploader.java`
#### Snippet
```java
      final String details = awsException.getDetails();

      if (StringUtil.isNotEmpty(details)) {
        final String message = awsException.getMessage() + details;
        LOG.warn(message);
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
    @NotNull
    public static RequestType fromRequest(@NotNull final HttpServletRequest request) {
      return StringUtil.isNotEmpty(request.getParameter(FINISH_UPLOAD)) ? FINISH_MULTIPART_UPLOAD : GENERATE_PRESIGNED_URLS;
    }
  }
```

### StaticCallOnSubclass
Static method `patchThreadName()` declared in class 'jetbrains.buildServer.util.NamedThreadFactory' but referenced via subclass 'jetbrains.buildServer.util.NamedDaemonThreadFactory'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
        }
        RunningBuildEx runningBuild = getRunningBuild(httpServletRequest);
        Disposable threadName = NamedDaemonThreadFactory.patchThreadName("Generating " + urlsRequest.getPresignedUrlRequests().size() + " pre-signed URLs"
                                                                         + (runningBuild != null ? " for a running build with id: " + runningBuild.getBuildId() : ""));
        final String response;
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
                                     @NotNull final CloudFrontSettings settings) throws Exception {
    final String objectKeyBase64 = new String(getDecoder().decode(StringUtil.emptyIfNull(httpServletRequest.getParameter(OBJECT_KEY + "_BASE64"))), StandardCharsets.UTF_8);
    final String objectKey = StringUtil.isNotEmpty(objectKeyBase64) ? objectKeyBase64 : httpServletRequest.getParameter(OBJECT_KEY);
    if (StringUtil.isEmpty(objectKey)) {
      throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, OBJECT_KEY + " should be present");
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
    final String objectKeyBase64 = new String(getDecoder().decode(StringUtil.emptyIfNull(httpServletRequest.getParameter(OBJECT_KEY + "_BASE64"))), StandardCharsets.UTF_8);
    final String objectKey = StringUtil.isNotEmpty(objectKeyBase64) ? objectKeyBase64 : httpServletRequest.getParameter(OBJECT_KEY);
    if (StringUtil.isEmpty(objectKey)) {
      throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, OBJECT_KEY + " should be present");
    }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
    }
    final String uploadId = httpServletRequest.getParameter(FINISH_UPLOAD);
    if (StringUtil.isEmpty(uploadId)) {
      throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, FINISH_UPLOAD + " should be present");
    }
```

### StaticCallOnSubclass
Static method `pluralize()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/cleanup/S3CleanupExtension.java`
#### Snippet
```java

      if (errorNum.get() > 0) {
        CLEANUP.warn("Failed to remove [" + errorNum + "] S3 " + StringUtil.pluralize("object", errorNum.get()) + suffix);
        cleanupContext.onBuildCleanupError(this, build, "Failed to remove some S3 objects.");
      }
```

### StaticCallOnSubclass
Static method `pluralize()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/cleanup/S3CleanupExtension.java`
#### Snippet
```java
      }

      CLEANUP.info(() -> "Removed [" + succeededNum + "] S3 " + StringUtil.pluralize("object", succeededNum.get()) + suffix);

      myHelper.removeFromArtifactList(build, pathsToDelete);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `S3Util.getBucketName(sslSettings)` might be null
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/filestorage/GuardedS3PresignedUrlProvider.java`
#### Snippet
```java
  public S3Settings settings(@NotNull final Map<String, String> rawSettings, @NotNull Map<String, String> projectSettings) {
    final Map<String, String> sslSettings = ParamUtil.putSslValues(myServerPaths, rawSettings);
    final Map<String, String> correctedSettings = S3RegionCorrector.correctRegion(S3Util.getBucketName(sslSettings), sslSettings);
    return myDelegate.settings(correctedSettings, projectSettings);
  }
```

### DataFlowIssue
`null` is assigned to a variable that is annotated with @NotNull
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/ListBucketsResourceFetcher.java`
#### Snippet
```java
    @Used("xml-serialization")
    public BucketDto() {
      this.name = null;
    }

```

### DataFlowIssue
`null` is assigned to a variable that is annotated with @NotNull
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/ListBucketsResourceFetcher.java`
#### Snippet
```java
    @Used("xml-serialization")
    public ListBucketsDto() {
      this.buckets = null;
    }

```

### DataFlowIssue
Condition `e instanceof AmazonServiceException` is redundant and can be replaced with a null check
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
  private void setErrorHeader(HttpServletResponse httpServletResponse, Exception e) {
    final String header;
    if (e instanceof AmazonServiceException) {
      header = S3Constants.ErrorSource.S3.name();
    } else if (e instanceof SdkBaseException) {
```

### DataFlowIssue
`null` is assigned to a variable that is annotated with @NotNull
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/ListCloudFrontPublicKeysFetcher.java`
#### Snippet
```java
    @Used("xml-serialization")
    public ListPublicKeysDto() {
      this.publicKeys = null;
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.File;`
in `s3-artifact-storage-agent/src/main/java/jetbrains/buildServer/artifacts/s3/publish/SettingsProcessor.java`
#### Snippet
```java
package jetbrains.buildServer.artifacts.s3.publish;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.util.concurrent.CompletableFuture\[\]' found
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3PresignedMultipartUpload.java`
#### Snippet
```java
                                                     });
                                   })
                                   .toArray(CompletableFuture[]::new);

      allOfTerminateOnFailure(myEtags).get();
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `S3FileUploader()` of an abstract class should not be declared 'public'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/S3FileUploader.java`
#### Snippet
```java
  protected final S3Configuration myS3Configuration;

  public S3FileUploader(@NotNull final S3Configuration s3Configuration,
                        @NotNull final S3UploadLogger logger) {
    myS3Configuration = s3Configuration;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/util/LowLevelS3Client.java`
#### Snippet
```java
      .executeAndReleaseConnection(requestBuilder, myErrorHandler, myExecutorService)
      .thenApply(response -> {
        return parseEtags(response);
      });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/TeamCityServerPresignedUrlsProviderClient.java`
#### Snippet
```java
    if (isRetryEnabled) {

      myRetrier.execute(() -> {
        finishMultipartUploadImpl(objectKey, etags, uploadId, isSuccessful);
      });
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'S3_CLOUDFRONT_DISTRIBUTION' is still used
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/cloudfront/CloudFrontConstants.java`
#### Snippet
```java

  @Deprecated
  public static final String S3_CLOUDFRONT_DISTRIBUTION = "storage.s3.cloudfront.distribution";

  public static final String S3_CLOUDFRONT_UPLOAD_DISTRIBUTION = "storage.s3.cloudfront.upload.distribution";
```

### DeprecatedIsStillUsed
Deprecated member 'getCloudFrontDistribution' is still used
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/cloudfront/CloudFrontSettings.java`
#### Snippet
```java
  @Deprecated
  @NotNull
  String getCloudFrontDistribution();

  @Nullable
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/util/LowLevelS3Client.java`
#### Snippet
```java
      .executeAndReleaseConnection(requestBuilder, myErrorHandler, myExecutorService)
      .thenApply(response -> {
        return parseEtags(response);
      });
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/util/FilePart.java`
#### Snippet
```java
      throw new IOException("Could not find MD5 algorithm", e);
    }
    stream((buf, start, length) -> digestCalculator.update(buf, start, length));
    digest = Base64.getEncoder().encodeToString(digestCalculator.digest());
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/util/FilePart.java`
#### Snippet
```java

  public void write(OutputStream out) throws IOException {
    stream((buf, start, length) -> out.write(buf, start, length));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3SignedUrlFileUploader.java`
#### Snippet
```java


      LOGGER.debug("Publishing [" + filesToUpload.keySet().stream().map(f -> f.getName()).collect(Collectors.joining(",")) + "] to S3");
      normalizedObjectPaths.entrySet()
                           .stream()
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/transport/PresignedUrlListRequestDto.java`
#### Snippet
```java
  @NotNull
  public static PresignedUrlListRequestDto forObjectKeys(@NotNull final Collection<String> objectKeys) {
    return new PresignedUrlListRequestDto(objectKeys.stream().map(objectKey -> PresignedUrlRequestDto.from(objectKey)).collect(Collectors.toSet()), false);
  }

```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/cleanup/CleanupListener.java`
#### Snippet
```java
public interface CleanupListener {
  void onError(Exception exception, boolean isRecoverable);
  void onSuccess(String objectKey);
}

```

### EmptyMethod
All implementations of this method are empty
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/PresignedUrlsProviderClient.java`
#### Snippet
```java
  void abortMultipartUpload(@NotNull MultipartUploadAbortRequestDto multipartUploadAbort);

  void startMultipartUpload(@NotNull MultipartUploadStartRequestDto multipartUploadStart);

  static class MisconfigurationException extends RuntimeException {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `s3-artifact-storage-agent/src/main/java/jetbrains/buildServer/artifacts/s3/S3AdditionalHeadersProvider.java`
#### Snippet
```java

  private static final String AMAZON_METADATA_ADDRESS = "http://169.254.169.254/";
  private volatile boolean isAmazonAvailable = false;

  public S3AdditionalHeadersProvider() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/S3RegularFileUploader.java`
#### Snippet
```java
  @NotNull
  private static final Logger LOG = Logger.getInstance(S3RegularFileUploader.class.getName());
  private boolean isDestinationPrepared = false;

  public S3RegularFileUploader(@NotNull final S3Configuration s3Configuration, @NotNull final S3UploadLogger logger) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `s3-artifact-storage-agent/src/main/java/jetbrains/buildServer/artifacts/s3/publish/S3ArtifactsPublisher.java`
#### Snippet
```java
            return build.getInterruptReason().getUserDescription();
          } else {
            return null;
          }
        }, fileUploadInfo -> {
```

### ReturnNull
Return of `null`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3StoragePropertiesUtil.java`
#### Snippet
```java
  private static String toUnixLineFeeds(@Nullable final String str) {
    if (str == null) {
      return null;
    }
    return str.replace("\r", "");
```

### ReturnNull
Return of `null`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3PresignedMultipartUpload.java`
#### Snippet
```java
        failure.completeExceptionally(ex);
        cancelAll(futures);
        return null;
      });
    }
```

### ReturnNull
Return of `null`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3PresignedUpload.java`
#### Snippet
```java
      if (!myFile.exists()) {
        myProgressListener.onFileUploadFailed("File does not exist", false);
        return null;
      }
      myRemainingBytes.set(myFile.length());
```

### ReturnNull
Return of `null`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3SettingsController.java`
#### Snippet
```java
  protected ModelAndView doGet(@NotNull final HttpServletRequest request,
                               @NotNull final HttpServletResponse response) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3SignedUrlFileUploader.java`
#### Snippet
```java
                                 LOGGER.warnAndDebugDetails("Artifact publishing rejected by pool", e);
                               }
                               return null;
                             }
                           })
```

### ReturnNull
Return of `null`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3SignedUploadManager.java`
#### Snippet
```java
      LOGGER.info("Fetching presigned urls for manager " + this + " failed.", e);
      ExceptionUtil.rethrowAsRuntimeException(e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/cleanup/S3CleanupExtension.java`
#### Snippet
```java
        ArtifactListData artifactsInfo = myHelper.getArtifactList(build);
        if (artifactsInfo == null) {
          return null;
        }
        String pathPrefix = S3Util.getPathPrefix(artifactsInfo);
```

### ReturnNull
Return of `null`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/cleanup/S3CleanupExtension.java`
#### Snippet
```java
        String pathPrefix = S3Util.getPathPrefix(artifactsInfo);
        if (pathPrefix == null) {
          return null;
        }
        List<String> pathsToDelete = ArtifactPathsEvaluator.getPathsToDelete((BuildCleanupContextEx)cleanupContext, build, artifactsInfo);
```

### ReturnNull
Return of `null`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/cleanup/S3CleanupExtension.java`
#### Snippet
```java
        List<String> pathsToDelete = ArtifactPathsEvaluator.getPathsToDelete((BuildCleanupContextEx)cleanupContext, build, artifactsInfo);
        if (pathsToDelete.isEmpty()) {
          return null;
        }
        Map<String, String> storageSettings = mySettingsProvider.getStorageSettings(build);
```

### ReturnNull
Return of `null`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/cleanup/S3CleanupExtension.java`
#### Snippet
```java
          CLEANUP.warn("Failed to remove S3 artifacts in build " + LogUtil.describe(build) + ":\n" + StringUtil.join("\n", invalids.values()));
          cleanupContext.onBuildCleanupError(this, build, "Failed to remove S3 artifacts due to incorrect storage settings configuration.");
          return null;
        }
        return new BuildStorageInfo(build, pathPrefix, pathsToDelete, storageSettings);
```

### ReturnNull
Return of `null`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/cleanup/S3CleanupExtension.java`
#### Snippet
```java
        CLEANUP.warn("Failed to get S3 artifacts list in build " + LogUtil.describe(build) + ": " + e.getMessage());
        cleanupContext.onBuildCleanupError(this, build, "Failed to get S3 artifacts list due to IO error.");
        return null;
      } catch (RuntimeException e) {
        CLEANUP.warn("Failed to remove S3 artifacts " + LogUtil.describe(build) + ": " + e.getMessage());
```

### ReturnNull
Return of `null`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/cleanup/S3CleanupExtension.java`
#### Snippet
```java
        CLEANUP.warn("Failed to remove S3 artifacts " + LogUtil.describe(build) + ": " + e.getMessage());
        cleanupContext.onBuildCleanupError(this, build, "Failed to remove S3 artifacts due to unexpected error.");
        return null;
      }
    }).filter(Objects::nonNull).collect(Collectors.toList());
```

### ReturnNull
Return of `null`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3PresignedUrlProviderImpl.java`
#### Snippet
```java
        client.abortMultipartUpload(new AbortMultipartUploadRequest(settings.getBucketName(), objectKey, uploadId));
      }
      return null;
    }, settings);
  }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/TeamCityServerPresignedUrlsProviderClient.java`
#### Snippet
```java
          Part[] parts = parameters.stream()
                                   .map(entry -> new StringPart(entry.getFirst(), entry.getSecond()))
                                   .collect(Collectors.toList()).toArray(new Part[0]);
          return new MultipartRequestEntity(parts, new HttpMethodParams());
        }
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/TeamCityServerPresignedUrlsProviderClient.java`
#### Snippet
```java
          Part[] parts = parameters.stream()
                                   .map(entry -> new StringPart(entry.getFirst(), entry.getSecond()))
                                   .collect(Collectors.toList()).toArray(new Part[0]);
          return new MultipartRequestEntity(parts, new HttpMethodParams());
        }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends UploadStatistics`
in `s3-artifact-storage-agent/src/main/java/jetbrains/buildServer/artifacts/s3/publish/S3ArtifactsPublisher.java`
#### Snippet
```java
  }

  private void logStatisticsForEach(@NotNull FlowLogger logger, @NotNull Collection<UploadStatistics> statistics) {
    for (UploadStatistics stat : statistics) {
      final Map<String, Duration> timings = stat.getAdditionalTimings();
```

### BoundedWildcard
Can generalize to `? extends UploadStatistics`
in `s3-artifact-storage-agent/src/main/java/jetbrains/buildServer/artifacts/s3/publish/S3ArtifactsPublisher.java`
#### Snippet
```java

  @NotNull
  public StatisticsLogger.SummaryStatistics getSummaryStatistics(@NotNull Collection<UploadStatistics> statistics) {
    Duration totalDuration = Duration.ofMillis(0);
    int fileCount = 0;
```

### BoundedWildcard
Can generalize to `? extends FileUploadInfo`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3SignedUrlFileUploader.java`
#### Snippet
```java

  @Nullable
  private FileUploadInfo waitForCompletion(@NotNull final ForkJoinTask<FileUploadInfo> future, @NotNull final Consumer<Throwable> onError) {
    try {
      return future.get();
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3SignedUrlFileUploader.java`
#### Snippet
```java

  @Nullable
  private FileUploadInfo waitForCompletion(@NotNull final ForkJoinTask<FileUploadInfo> future, @NotNull final Consumer<Throwable> onError) {
    try {
      return future.get();
```

### BoundedWildcard
Can generalize to `? extends FileWithArtifactPath`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3SignedUrlFileUploader.java`
#### Snippet
```java
                                         LowLevelS3Client lowLevelS3Client,
                                         S3SignedUploadManager uploadManager,
                                         Map.Entry<String, FileWithArtifactPath> objectKeyToFileWithArtifactPath) throws IOException {
    if (isMultipartUpload(objectKeyToFileWithArtifactPath.getValue().getFile())) {
      return new S3PresignedMultipartUpload(objectKeyToFileWithArtifactPath.getValue().getArtifactPath(),
```

### BoundedWildcard
Can generalize to `? extends S3UploadLogger`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/logger/CompositeS3UploadLogger.java`
#### Snippet
```java
  private final List<S3UploadLogger> myLoggers;

  private CompositeS3UploadLogger(@NotNull final List<S3UploadLogger> loggers) {
    myLoggers = loggers;
  }
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/transport/PresignedUrlListRequestDto.java`
#### Snippet
```java

  @NotNull
  public static PresignedUrlListRequestDto forObjectKeysWithDigests(@NotNull final Collection<Pair<String, String>> keysWithDigests) {
    return new PresignedUrlListRequestDto(keysWithDigests.stream()
                                                         .map(pair -> PresignedUrlRequestDto.from(pair.getFirst(), pair.getSecond()))
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `publicKeyId` initializer `null` is redundant
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3CloudFrontDistributionCreationController.java`
#### Snippet
```java

              String name = "generated_" + UUID.randomUUID().toString().substring(0, 8);
              String publicKeyId = null;
              String keyGroupId = null;
              try {
```

### UnusedAssignment
Variable `correctRegion` initializer `extractCorrectedRegion(awsException)` is redundant
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
      return withCorrectedClient.run(s3Client);
    } catch (AmazonS3Exception awsException) {
      final String correctRegion = extractCorrectedRegion(awsException);
      if (correctRegion != null) {
        LOGGER.debug("Running operation with corrected S3 region [" + correctRegion + "]", awsException);
```

### UnusedAssignment
Variable `correctedSettings` initializer `new HashMap<>(settings)` is redundant
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
      if (correctRegion != null) {
        LOGGER.debug("Running operation with corrected S3 region [" + correctRegion + "]", awsException);
        final HashMap<String, String> correctedSettings = new HashMap<>(settings);
        correctedSettings.put(REGION_NAME_PARAM, correctRegion);
        return withS3ClientShuttingDownImmediately(correctedSettings, withCorrectedClient);
```

### UnusedAssignment
Variable `correctedRegion` initializer `extractCorrectedRegion(s3Exception)` is redundant
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
      return withS3ClientShuttingDownImmediately(settings, action);
    } catch (AmazonS3Exception s3Exception) {
      final String correctedRegion = extractCorrectedRegion(s3Exception);
      final boolean isTAException = TRANSFER_ACC_ERROR_PATTERN.matcher(s3Exception.getErrorMessage()).matches();
      final boolean isRegionException = correctedRegion != null;
```

### UnusedAssignment
Variable `isTAException` initializer `TRANSFER_ACC_ERROR_PATTERN.matcher(s3Exception.getErrorMessage()).matches()` is redundant
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
    } catch (AmazonS3Exception s3Exception) {
      final String correctedRegion = extractCorrectedRegion(s3Exception);
      final boolean isTAException = TRANSFER_ACC_ERROR_PATTERN.matcher(s3Exception.getErrorMessage()).matches();
      final boolean isRegionException = correctedRegion != null;

```

### UnusedAssignment
Variable `isRegionException` initializer `correctedRegion != null` is redundant
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
      final String correctedRegion = extractCorrectedRegion(s3Exception);
      final boolean isTAException = TRANSFER_ACC_ERROR_PATTERN.matcher(s3Exception.getErrorMessage()).matches();
      final boolean isRegionException = correctedRegion != null;

      final HashMap<String, String> correctedSettings = new HashMap<>(settings);
```

### UnusedAssignment
Variable `correctedSettings` initializer `new HashMap<>(settings)` is redundant
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
      final boolean isRegionException = correctedRegion != null;

      final HashMap<String, String> correctedSettings = new HashMap<>(settings);

      if (isTAException) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3ArtifactDownloadProcessor.java`
#### Snippet
```java
public class S3ArtifactDownloadProcessor implements ArtifactDownloadProcessor {

  private final static Logger LOG = Logger.getInstance(S3ArtifactDownloadProcessor.class.getName());

  private final CloudFrontEnabledPresignedUrlProvider myPreSignedUrlProvider;
```

### MissortedModifiers
Missorted modifiers `final static`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/S3ArtifactContentProvider.java`
#### Snippet
```java
public class S3ArtifactContentProvider implements ArtifactContentProvider {

  private final static Logger LOG = Logger.getInstance(S3ArtifactContentProvider.class.getName());
  private final ServerPaths myServerPaths;

```

### MissortedModifiers
Missorted modifiers `final static`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3SettingsController.java`
#### Snippet
```java
public class S3SettingsController extends BaseFormXmlController {

  private final static Logger LOG = Logger.getInstance(S3SettingsController.class.getName());
  private static final String FAILED_TO_PROCESS_REQUEST_FORMAT = "Failed to process '%s' request: ";
  private final Map<String, S3ClientResourceFetcher> myHandlers = new HashMap<>();
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `FileUploadFailedException` ends with 'Exception'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/exceptions/FileUploadFailedException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class FileUploadFailedException extends RecoverableException {
  private final boolean myRecoverable;

```

### NonExceptionNameEndsWithException
Non-exception class name `FetchFailedException` ends with 'Exception'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/PresignedUrlsProviderClient.java`
#### Snippet
```java
  }

  class FetchFailedException extends RecoverableException {
    private final boolean myIsRecoverable;

```

### NonExceptionNameEndsWithException
Non-exception class name `HttpErrorCodeException` ends with 'Exception'
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/util/HttpClientUtil.java`
#### Snippet
```java
  }

  public static class HttpErrorCodeException extends RecoverableException {
    private final int myResponseCode;
    @Nullable
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `e instanceof HttpClientUtil.HttpErrorCodeException` is always `false`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3PresignedUpload.java`
#### Snippet
```java
                               throw new AbortRetriesException(e);
                             }
                             if (e instanceof HttpClientUtil.HttpErrorCodeException) {
                               if (!isRecoverable(e)) {
                                 return;
```

### ConstantValue
Condition `(e instanceof HttpClientUtil.HttpErrorCodeException) && (((HttpClientUtil.HttpErrorCodeException)e)....` is always `false`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3PresignedUpload.java`
#### Snippet
```java

  protected boolean isRecoverable(Exception e) {
    return (e instanceof HttpClientUtil.HttpErrorCodeException) && (((HttpClientUtil.HttpErrorCodeException)e).isRecoverable());
  }
}
```

### ConstantValue
Condition `e instanceof HttpClientUtil.HttpErrorCodeException` is always `false`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3PresignedUpload.java`
#### Snippet
```java

  protected boolean isRecoverable(Exception e) {
    return (e instanceof HttpClientUtil.HttpErrorCodeException) && (((HttpClientUtil.HttpErrorCodeException)e).isRecoverable());
  }
}
```

### ConstantValue
Condition `e instanceof AmazonClientException` is always `true`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3SettingsController.java`
#### Snippet
```java
        } catch (Throwable e) {
          final StringBuilder messageBuilder = new StringBuilder(String.format(FAILED_TO_PROCESS_REQUEST_FORMAT, resource));
          if (e instanceof AmazonClientException && e.getMessage().startsWith("Failed to parse XML document with handler class")) {
            messageBuilder.append(" invalid response. Ensure that the credentials in S3 storage profile are correct.");
          } else {
```

### ConstantValue
Condition `errorCodeException != null` is always `false`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3SignedUrlFileUploader.java`
#### Snippet
```java
  public static boolean isPublishingInterruptedException(@NotNull Throwable e) {
    final HttpClientUtil.HttpErrorCodeException errorCodeException = ExceptionUtil.getCause(e, HttpClientUtil.HttpErrorCodeException.class);
    if (errorCodeException != null && errorCodeException.isUploadInterrupted()) {
      return true;
    }
```

### ConstantValue
Condition `errorCodeException != null && errorCodeException.isUploadInterrupted()` is always `false`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3SignedUrlFileUploader.java`
#### Snippet
```java
  public static boolean isPublishingInterruptedException(@NotNull Throwable e) {
    final HttpClientUtil.HttpErrorCodeException errorCodeException = ExceptionUtil.getCause(e, HttpClientUtil.HttpErrorCodeException.class);
    if (errorCodeException != null && errorCodeException.isUploadInterrupted()) {
      return true;
    }
```

### ConstantValue
Condition `th instanceof FileUploadFailedException` is always `false`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/publish/presigned/upload/S3SignedUrlFileUploader.java`
#### Snippet
```java
        LOGGER.info("Publishing is interrupted " + th.getMessage(), th);
      } else {
        if (th instanceof FileUploadFailedException) {
          throw th;
        }
```

### ConstantValue
Condition `e instanceof AmazonS3Exception` is always `true`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
  @Nullable
  private static String extractCorrectedRegion(@NotNull final Throwable e) {
    @Nullable final AmazonS3Exception awsException = e instanceof AmazonS3Exception ? (AmazonS3Exception)e : ExceptionUtil.getCause(e, AmazonS3Exception.class);
    if (awsException != null && TeamCityProperties.getBooleanOrTrue("teamcity.internal.storage.s3.autoCorrectRegion") && awsException.getAdditionalDetails() != null) {
      final String correctRegion = awsException.getAdditionalDetails().get("Region");
```

### ConstantValue
Condition `awsException != null` is always `true`
in `teamcity-s3-sdk/src/main/java/jetbrains/buildServer/artifacts/s3/S3Util.java`
#### Snippet
```java
  private static String extractCorrectedRegion(@NotNull final Throwable e) {
    @Nullable final AmazonS3Exception awsException = e instanceof AmazonS3Exception ? (AmazonS3Exception)e : ExceptionUtil.getCause(e, AmazonS3Exception.class);
    if (awsException != null && TeamCityProperties.getBooleanOrTrue("teamcity.internal.storage.s3.autoCorrectRegion") && awsException.getAdditionalDetails() != null) {
      final String correctRegion = awsException.getAdditionalDetails().get("Region");
      if (correctRegion != null) {
```

### ConstantValue
Condition `cause instanceof AmazonServiceException` is always `true`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
    final Exception cause = getMostInformativeRootException(e);
    setErrorHeader(httpServletResponse, cause);
    if (cause instanceof AmazonServiceException) {
      handleAmazonException(httpServletResponse, (AmazonServiceException)cause);
    } else {
```

### ConstantValue
Condition `e instanceof SdkBaseException` is always `false`
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
    if (e instanceof AmazonServiceException) {
      header = S3Constants.ErrorSource.S3.name();
    } else if (e instanceof SdkBaseException) {
      header = S3Constants.ErrorSource.SDK.name();
    } else {
```

### ConstantValue
Value `e` is always 'null'
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
    if (e instanceof AmazonServiceException) {
      header = S3Constants.ErrorSource.S3.name();
    } else if (e instanceof SdkBaseException) {
      header = S3Constants.ErrorSource.SDK.name();
    } else {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `s3-artifact-storage-server/src/main/java/jetbrains/buildServer/artifacts/s3/web/S3PreSignedUrlController.java`
#### Snippet
```java
  @Nullable
  @Override
  protected ModelAndView doHandle(@NotNull HttpServletRequest httpServletRequest, @NotNull HttpServletResponse httpServletResponse) throws Exception {
    try {
      final Pair<RequestType, CloudFrontSettings> request = parseRequest(httpServletRequest);
```

