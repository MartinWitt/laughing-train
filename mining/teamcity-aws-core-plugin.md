# teamcity-aws-core-plugin 
 
# Bad smells
I found 114 bad smells with 23 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 19 | false |
| UtilityClassWithoutPrivateConstructor | 17 | true |
| UNUSED_IMPORT | 11 | false |
| BoundedWildcard | 7 | false |
| NonExceptionNameEndsWithException | 7 | false |
| MissortedModifiers | 6 | false |
| RedundantFieldInitialization | 5 | false |
| DeprecatedIsStillUsed | 4 | false |
| InstanceofCatchParameter | 4 | false |
| NonFinalFieldOfException | 4 | false |
| Convert2MethodRef | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| AssignmentToMethodParameter | 3 | false |
| StringBufferReplaceableByString | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| CodeBlock2Expr | 2 | true |
| EmptyMethod | 2 | false |
| FieldMayBeStatic | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RedundantCollectionOperation | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| ManualMinMaxCalculation | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| IgnoreResultOfCall | 1 | false |
| RedundantStringFormatCall | 1 | false |
| DoubleBraceInitialization | 1 | false |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `availableAwsConnsBeanName` may be 'static'
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AvailableAwsConnsController.java`
#### Snippet
```java
public class AvailableAwsConnsController extends BaseAwsConnectionController {
  public static final String PATH = AVAIL_AWS_CONNECTIONS_CONTROLLER_URL;
  private final String availableAwsConnsBeanName = "awsConnections";

  private final OAuthConnectionsManager myConnectionsManager;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AwsConnectionCredentialsConstants` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/AwsConnectionCredentialsConstants.java`
#### Snippet
```java
package jetbrains.buildServer.clouds.amazon.connector.utils.parameters;

public class AwsConnectionCredentialsConstants {
  public static final String ACCESS_KEY_ID = "awsAccessKeyId";
  public static final String SECRET_ACCESS_KEY = "awsSecretAccessKey";
```

### UtilityClassWithoutPrivateConstructor
Class `AwsAssumeIamRoleParams` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/AwsAssumeIamRoleParams.java`
#### Snippet
```java
import static jetbrains.buildServer.clouds.amazon.connector.utils.parameters.AwsCloudConnectorConstants.AVAIL_AWS_CONNS_JSP_FILE_NAME;

public final class AwsAssumeIamRoleParams {

  public static final String IAM_ROLE_LABEL = "IAM Role";
```

### UtilityClassWithoutPrivateConstructor
Class `StsClientBuilder` has only 'static' members, and lacks a 'private' constructor
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/clients/StsClientBuilder.java`
#### Snippet
```java
import static jetbrains.buildServer.clouds.amazon.connector.utils.parameters.AwsCloudConnectorConstants.REGION_NAME_PARAM;

public class StsClientBuilder {
  public static void addConfiguration(@NotNull AWSSecurityTokenServiceClientBuilder stsBuilder, @NotNull final Map<String, String> properties) {
    String stsEndpoint = properties.get(STS_ENDPOINT_PARAM);
```

### UtilityClassWithoutPrivateConstructor
Class `AwsCloudConnectorConstants` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/AwsCloudConnectorConstants.java`
#### Snippet
```java
package jetbrains.buildServer.clouds.amazon.connector.utils.parameters;

public final class AwsCloudConnectorConstants {

  public static final String FEATURE_PROPERTY_NAME = "teamcity.internal.awsConnectorEnabled";
```

### UtilityClassWithoutPrivateConstructor
Class `AmiConstants` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/ami/AmiConstants.java`
#### Snippet
```java


public class AmiConstants {
  public static final String ARTIFACT_TYPE = "AWS_AMI";
  public static final String PARAM_CONNECTION_ID = "connectionId";
```

### UtilityClassWithoutPrivateConstructor
Class `StsEndpointParamValidator` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/StsEndpointParamValidator.java`
#### Snippet
```java
import static jetbrains.buildServer.clouds.amazon.connector.utils.parameters.regions.AWSRegions.isChinaRegion;

public class StsEndpointParamValidator {
  public static final String STS_ENDPOINTS_ALLOWLIST_PROPERTY_NAME = "teamcity.aws.connection.stsEndpointsAllowlist";
  public static final String REGION_TO_STS_ENDPOINT_FORMAT = "https://sts.%s.amazonaws.com";
```

### UtilityClassWithoutPrivateConstructor
Class `ClientConfigurationBuilder` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/clients/ClientConfigurationBuilder.java`
#### Snippet
```java
import static jetbrains.buildServer.serverSide.TeamCityProperties.getPropertyOrNull;

public class ClientConfigurationBuilder {
  public static ClientConfiguration createClientConfigurationEx(@Nullable String suffix){
    if (StringUtil.isEmpty(suffix)){
```

### UtilityClassWithoutPrivateConstructor
Class `AwsConnBuildFeatureParams` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/AwsConnBuildFeatureParams.java`
#### Snippet
```java
package jetbrains.buildServer.clouds.amazon.connector.utils.parameters;

public final class AwsConnBuildFeatureParams {
  public static final String AWS_CONN_TO_ENV_VARS_BUILD_FEATURE_TYPE = "PROVIDE_AWS_CREDS";

```

### UtilityClassWithoutPrivateConstructor
Class `AWSRegions` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSRegions.java`
#### Snippet
```java
 */
@Deprecated
public final class AWSRegions {
  private static final Map<String, String> REGION_NAMES_FOR_WEB;

```

### UtilityClassWithoutPrivateConstructor
Class `ParamUtil` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/ParamUtil.java`
#### Snippet
```java
import static jetbrains.buildServer.clouds.amazon.connector.utils.parameters.AwsSessionCredentialsParams.*;

public class ParamUtil {

  private final static Pattern validAwsSessionNamePattern = Pattern.compile(VALID_ROLE_SESSION_NAME_REGEX);
```

### UtilityClassWithoutPrivateConstructor
Class `AwsSessionCredentialsParams` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/AwsSessionCredentialsParams.java`
#### Snippet
```java
package jetbrains.buildServer.clouds.amazon.connector.utils.parameters;

public final class AwsSessionCredentialsParams {
  public static final String SESSION_DURATION_PARAM = "awsSessionDuration";
  public static final String SESSION_DURATION_LABEL = "Session duration:";
```

### UtilityClassWithoutPrivateConstructor
Class `AwsExceptionUtils` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/AwsExceptionUtils.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public final class AwsExceptionUtils {
  @Nullable
  public static String getAwsErrorMessage(@NotNull final Throwable exception){
```

### UtilityClassWithoutPrivateConstructor
Class `AwsAccessKeysParams` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/AwsAccessKeysParams.java`
#### Snippet
```java
package jetbrains.buildServer.clouds.amazon.connector.utils.parameters;

public final class AwsAccessKeysParams {
  public static final String ACCESS_KEY_ID_PARAM = "awsAccessKeyId";
  public static final String ACCESS_KEY_ID_LABEL = "Access key ID";
```

### UtilityClassWithoutPrivateConstructor
Class `AWSRegions` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/regions/AWSRegions.java`
#### Snippet
```java
 * @author vbedrosova
 */
public final class AWSRegions {
  private static final Map<String, String> REGION_NAMES_FOR_WEB;
  private static final Map<String, String> CHINA_REGION_NAMES_FOR_WEB;
```

### UtilityClassWithoutPrivateConstructor
Class `AwsConnectionUtils` has only 'static' members, and lacks a 'private' constructor
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/AwsConnectionUtils.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class AwsConnectionUtils {

  @NotNull
```

### UtilityClassWithoutPrivateConstructor
Class `S3Util` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/S3Util.java`
#### Snippet
```java
 * @author vbedrosova
 */
public final class S3Util {
  public static final int DEFAULT_S3_THREAD_POOL_SIZE = 10;
  @NotNull
```

### UtilityClassWithoutPrivateConstructor
Class `AWSCommonParams` has only 'static' members, and lacks a 'private' constructor
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
 */
@Deprecated
public final class AWSCommonParams {

  // "codedeploy_" prefix is for backward compatibility
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'AWSClients' is still used
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSClients.java`
#### Snippet
```java
 */
@Deprecated
public class AWSClients {

  @Nullable private final AWSCredentials myCredentials;
```

### DeprecatedIsStillUsed
Deprecated member 'getLinkedAwsConnection' is still used
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/AwsConnectionsManager.java`
#### Snippet
```java
  @NotNull
  @Deprecated
  AwsConnectionBean getLinkedAwsConnection(@NotNull final Map<String, String> properties, @NotNull final SProject project) throws LinkedAwsConnNotFoundException;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'AwsConnectionBean' is still used
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/dataBeans/AwsConnectionBean.java`
#### Snippet
```java

@Deprecated
public class AwsConnectionBean {
  private final String myConnectionId;
  private final String myDescription;
```

### DeprecatedIsStillUsed
Deprecated member 'AWSCommonParams' is still used
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
 */
@Deprecated
public final class AWSCommonParams {

  // "codedeploy_" prefix is for backward compatibility
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/ami/cleanup/EC2AmiCleanupExtension.java`
#### Snippet
```java
                                @NotNull HashMap<String, AmazonEC2> clientsCache,
                                @NotNull BuildCleanupContext cleanupContext) {
    final List<String> amiIds = artifacts.stream().map(a -> a.getAmiId()).collect(Collectors.toList());

    final AmazonEC2 client = getEC2Client(build, buildType.getProject(), connectionId, artifacts, cleanupContext, clientsCache);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/ami/cleanup/EC2AmiCleanupExtension.java`
#### Snippet
```java
      client.deregisterImage(new DeregisterImageRequest().withImageId(image.getImageId()));
      final List<String> snapshots = image.getBlockDeviceMappings().stream()
                                          .map(b -> b.getEbs())
                                          .filter(Objects::nonNull).map(ebs -> ebs.getSnapshotId())
                                          .collect(Collectors.toList());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/ami/cleanup/EC2AmiCleanupExtension.java`
#### Snippet
```java
      final List<String> snapshots = image.getBlockDeviceMappings().stream()
                                          .map(b -> b.getEbs())
                                          .filter(Objects::nonNull).map(ebs -> ebs.getSnapshotId())
                                          .collect(Collectors.toList());
      for (String snapshot : snapshots) {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/connectionId/AwsConnectionIdGenerator.java`
#### Snippet
```java

  public static String formatId(@NotNull final String connectionId, int newIdNumber) {
    return String.format("%s_%s", connectionId, String.valueOf(newIdNumber));
  }

```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/regions/AWSRegions.java`
#### Snippet
```java
      return false;

    return CHINA_REGION_NAMES_FOR_WEB.keySet().contains(regionName);
  }
}
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`baseDir.length() > 0` can be replaced with '!baseDir.isEmpty()'
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java

      p = FileUtil.toSystemIndependentName(p);
      if (baseDir.length() > 0) {
        p = p.replace(baseDir, "");
      }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder mergedIdsBuilder` can be replaced with 'String'
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/keyRotation/impl/OldKeysCleaner.java`
#### Snippet
```java

    public Pair<String, String> toTaskArgs() {
      StringBuilder mergedIdsBuilder = new StringBuilder();
      mergedIdsBuilder.append(oldAccessKeyId); // the acces key ID will never have <TASK_ARG_DIVIDER> characters inside it
      mergedIdsBuilder.append(TASK_ARG_DIVIDER);
```

### StringBufferReplaceableByString
`StringBuilder mergedArgsBuilder` can be replaced with 'String'
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/keyRotation/impl/OldKeysCleaner.java`
#### Snippet
```java
      mergedIdsBuilder.append(connectionId); // is user-configurable and can potentially have <TASK_ARG_DIVIDER> characters inside it

      StringBuilder mergedArgsBuilder = new StringBuilder();
      mergedArgsBuilder.append(keyDeletionTime); // the ZonedDateTime will never have <TASK_ARG_DIVIDER> characters inside it
      mergedArgsBuilder.append(TASK_ARG_DIVIDER);
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
  static int patchSessionDuration(int sessionDuration) {
    if (sessionDuration < 900) return 900;
    if (sessionDuration > 3600) return 3600;
    return sessionDuration;
  }
```

## RuleId[id=MismatchedStringBuilderQueryUpdate]
### MismatchedStringBuilderQueryUpdate
Contents of `StringBuilder errorMessageBuilder` are updated, but never queried
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/AwsConnectorFactoryImpl.java`
#### Snippet
```java

    try {
      StringBuilder errorMessageBuilder = new StringBuilder();
      errorMessageBuilder.append("This ID is invalid, please, dont use these symbols: ");
      errorMessageBuilder.append(IdGeneratorRegistry.PROHIBITED_CHARS);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/StsEndpointParamValidator.java`
#### Snippet
```java
  }

  private static void addAllDefaultAwsStsEndpoints(@NotNull List<String> res) {
    for (String regionName : AWSRegions.getAllRegions().keySet()) {
      if (isChinaRegion(regionName)) {
```

### BoundedWildcard
Can generalize to `? super T`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/retry/Retrier.java`
#### Snippet
```java

  @NotNull
  default <T, R> Function<T, R> retryableMapper(@NotNull final Function<T, R> function) {
    return (t) -> execute(() -> function.apply(t));
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/retry/Retrier.java`
#### Snippet
```java

  @NotNull
  default <T, R> Function<T, R> retryableMapper(@NotNull final Function<T, R> function) {
    return (t) -> execute(() -> function.apply(t));
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/AwsConnectorFactoryImpl.java`
#### Snippet
```java
  }

  private void putIgnoredDefaultSessionDurationValue(@NotNull Map<String, String> defaultProperties) {
    defaultProperties.put(AwsSessionCredentialsParams.SESSION_DURATION_PARAM, AwsSessionCredentialsParams.SESSION_DURATION_DEFAULT);
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/AwsConnectorFactoryImpl.java`
#### Snippet
```java
  }

  private void putIgnoredDefaultSessionDurationValue(@NotNull Map<String, String> defaultProperties) {
    defaultProperties.put(AwsSessionCredentialsParams.SESSION_DURATION_PARAM, AwsSessionCredentialsParams.SESSION_DURATION_DEFAULT);
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/credsToAgent/InjectAwsCredentialsToTheBuildContext.java`
#### Snippet
```java
  }

  private void addSecureParameters(@NotNull final Map<String, String> parameters, @NotNull final AwsCredentialsData credentials) {
    parameters.put(AwsConnBuildFeatureParams.AWS_SECRET_KEY_ENV_PARAM_DEFAULT, credentials.getSecretAccessKey());

```

### BoundedWildcard
Can generalize to `? super String`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/credsToAgent/InjectAwsCredentialsToTheBuildContext.java`
#### Snippet
```java
  }

  private void addSecureParameters(@NotNull final Map<String, String> parameters, @NotNull final AwsCredentialsData credentials) {
    parameters.put(AwsConnBuildFeatureParams.AWS_SECRET_KEY_ENV_PARAM_DEFAULT, credentials.getSecretAccessKey());

```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/connectionId/AwsConnectionIdGenerator.java`
#### Snippet
```java
public class AwsConnectionIdGenerator extends BaseExternalIdGenerator implements CachingTypedIdGenerator {
  public final static String ID_GENERATOR_TYPE = AwsConnectionProvider.TYPE;
  public final static String AWS_CONNECTION_ID_PREFIX = "awsConnection";
  public final static int INITIAL_AWS_CONNECTION_ID = 0;

```

### MissortedModifiers
Missorted modifiers `final static`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/connectionId/AwsConnectionIdGenerator.java`
#### Snippet
```java
  public final static String ID_GENERATOR_TYPE = AwsConnectionProvider.TYPE;
  public final static String AWS_CONNECTION_ID_PREFIX = "awsConnection";
  public final static int INITIAL_AWS_CONNECTION_ID = 0;

  private final static Logger LOG = Logger.getInstance(AwsConnectionIdGenerator.class.getName());
```

### MissortedModifiers
Missorted modifiers `final static`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/connectionId/AwsConnectionIdGenerator.java`
#### Snippet
```java
  public final static int INITIAL_AWS_CONNECTION_ID = 0;

  private final static Logger LOG = Logger.getInstance(AwsConnectionIdGenerator.class.getName());


```

### MissortedModifiers
Missorted modifiers `final static`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/connectionId/AwsConnectionIdGenerator.java`
#### Snippet
```java

public class AwsConnectionIdGenerator extends BaseExternalIdGenerator implements CachingTypedIdGenerator {
  public final static String ID_GENERATOR_TYPE = AwsConnectionProvider.TYPE;
  public final static String AWS_CONNECTION_ID_PREFIX = "awsConnection";
  public final static int INITIAL_AWS_CONNECTION_ID = 0;
```

### MissortedModifiers
Missorted modifiers `final static`
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/ParamUtil.java`
#### Snippet
```java
public class ParamUtil {

  private final static Pattern validAwsSessionNamePattern = Pattern.compile(VALID_ROLE_SESSION_NAME_REGEX);

  public static boolean useSessionCredentials(@NotNull final Map<String, String> properties){
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java

  // must implement AWSSessionCredentials as AWS SDK may use "instanceof"
  static abstract class LazyCredentials implements AWSSessionCredentials {
    @Nullable
    private AWSSessionCredentials myDelegate = null;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `aws-core-agent/src/main/java/jetbrains/buildServer/clouds/amazon/connector/AwsCredentialsHandler.java`
#### Snippet
```java

      //We need directory to create temp file name
      tempDirectory.mkdirs();

      File file = new File(tempDirectory, AWS_CREDENTIALS_FILE_NAME);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
  @NotNull
  static String patchSessionName(@NotNull String sessionName) {
    return StringUtil.truncateStringValue(sessionName.replaceAll(UNSUPPORTED_SESSION_NAME_CHARS, "_"), MAX_SESSION_NAME_LENGTH);
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
    }

    return sb.toString().replace(" ", "").toLowerCase().hashCode();
  }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.clouds.amazon.connector` is unnecessary and can be removed
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/AwsCredentialsBuilder.java`
#### Snippet
```java
   * <p>
   * <b>Do not use this method directly</b>,
   * instead, call the {@link jetbrains.buildServer.clouds.amazon.connector.AwsConnectorFactory#buildAwsCredentialsProvider(Map) AwsConnectorFactory#buildAwsCredentialsProvider(connectionProperties)}
   * method, to ensure that the correct AwsCredentialsBuilder will be used to provide AWS credentials.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.clouds.amazon.connector` is unnecessary and can be removed
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/AwsCredentialsBuilder.java`
#### Snippet
```java
   * @param  featureDescriptor  Connection descriptor with properties Map of concrete AWS Connection.
   * @return AwsCredentialsHolder object with specified credentials type.
   * @see    jetbrains.buildServer.clouds.amazon.connector.AwsConnectorFactory#buildAwsCredentialsProvider(Map) buildAwsCredentialsProvider(connectionProperties).
   */
  @NotNull
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.amazonaws.PredefinedClientConfigurations;`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSClients.java`
#### Snippet
```java
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.PredefinedClientConfigurations;
import com.amazonaws.auth.*;
import com.amazonaws.client.builder.AwsClientBuilder;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSClients.java`
#### Snippet
```java
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.Credentials;
import java.net.MalformedURLException;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.services.securitytoken.model.Credentials;`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.Credentials;
import java.net.MalformedURLException;
import java.net.URL;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.atomic.AtomicReference;`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import jetbrains.buildServer.parameters.ReferencesResolverUtil;
import jetbrains.buildServer.serverSide.TeamCityProperties;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.*;`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/common/impl/AwsConnectionsHolderImpl.java`
#### Snippet
```java
import jetbrains.buildServer.clouds.amazon.connector.errors.DuplicatedAwsConnectionIdException;
import jetbrains.buildServer.clouds.amazon.connector.utils.parameters.AwsCloudConnectorConstants;
import jetbrains.buildServer.serverSide.*;
import jetbrains.buildServer.serverSide.oauth.OAuthConstants;
import jetbrains.buildServer.serverSide.oauth.aws.AwsConnectionProvider;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.*;`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/credsToAgent/AwsConnToAgentBuildFeature.java`
#### Snippet
```java
import jetbrains.buildServer.clouds.amazon.connector.utils.parameters.ParamUtil;
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.*;
import jetbrains.buildServer.serverSide.oauth.OAuthConstants;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.*;`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/keyRotation/impl/AwsKeyRotatorImpl.java`
#### Snippet
```java
import jetbrains.buildServer.clouds.amazon.connector.utils.parameters.ParamUtil;
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.*;
import jetbrains.buildServer.serverSide.oauth.OAuthConnectionDescriptor;
import jetbrains.buildServer.serverSide.oauth.OAuthConnectionsManager;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.*;`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/keyRotation/impl/OldKeysCleaner.java`
#### Snippet
```java
import jetbrains.buildServer.clouds.amazon.connector.utils.parameters.ParamUtil;
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.*;
import jetbrains.buildServer.serverSide.oauth.OAuthConnectionDescriptor;
import jetbrains.buildServer.serverSide.oauth.OAuthConnectionsManager;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.*;`
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AwsRotateKeysController.java`
#### Snippet
```java
import jetbrains.buildServer.controllers.*;
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.*;
import jetbrains.buildServer.web.openapi.WebControllerManager;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.*;`
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AwsTestConnectionController.java`
#### Snippet
```java
import jetbrains.buildServer.controllers.admin.projects.PluginPropertiesUtil;
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.*;
import jetbrains.buildServer.serverSide.connections.credentials.ConnectionCredentialsException;
import jetbrains.buildServer.serverSide.impl.ProjectFeatureDescriptorImpl;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AvailableAwsConnsController.java`
#### Snippet
```java
    if(StringUtil.nullIfEmpty(principalAwsConnId) != null){
      return awsConnections.stream().filter(connectionDescriptor -> {
        return !connectionDescriptor.getId().equals(principalAwsConnId);
      }).collect(Collectors.toList());
    }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/AwsConnectorFactoryImpl.java`
#### Snippet
```java
    putIgnoredDefaultSessionDurationValue(defaultProperties);

    myCredentialBuilders.forEach((type, builder) -> {
      defaultProperties.putAll(builder.getDefaultProperties());
    });
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `RecoverableException()` of an abstract class should not be declared 'public'
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/retry/RecoverableException.java`
#### Snippet
```java

public abstract class RecoverableException extends RuntimeException {
  public RecoverableException(@NotNull String message) {
    super(message);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `RecoverableException()` of an abstract class should not be declared 'public'
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/retry/RecoverableException.java`
#### Snippet
```java
  }

  public RecoverableException(@NotNull String message, @NotNull Throwable cause) {
    super(message, cause);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseAwsConnectionController()` of an abstract class should not be declared 'public'
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/BaseAwsConnectionController.java`
#### Snippet
```java
  private final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  public BaseAwsConnectionController(@NotNull final String controllerPath,
                                     @NotNull final SBuildServer server,
                                     @NotNull final ProjectManager projectManager,
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/AwsCredentialsHolder.java`
#### Snippet
```java
  AwsCredentialsData getAwsCredentials() throws ConnectionCredentialsException;

  void refreshCredentials();

  @Nullable
```

### EmptyMethod
The method is empty
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/connectionId/AwsConnectionIdGenerator.java`
#### Snippet
```java

  @Override
  public void addGeneratedId(@NotNull final String id, @NotNull final Map<String, String> props) {
    //ignored, all AWS Connections IDs are handled by AwsConnectionsHandler via AwsConnectionsEventListener
  }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSClients.java`
#### Snippet
```java
  @NotNull private final String myRegion;
  @NotNull private final ClientConfiguration myClientConfiguration;
  private boolean myDisablePathStyleAccess = false;

  private boolean myAccelerateModeEnabled = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSClients.java`
#### Snippet
```java
  private boolean myDisablePathStyleAccess = false;

  private boolean myAccelerateModeEnabled = false;

  private AWSClients(@Nullable AWSCredentials credentials, @NotNull String region) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/S3Util.java`
#### Snippet
```java
    private int connectionTimeout;
    private boolean myShutdownClient = false;
    private boolean myPresignedMultipartUploadEnabled = false;
    private int myPresignedUrlMaxChunkSize = DEFAULT_PRESIGNED_URL_MAX_CHUNK_SIZE;
    private int myNumberOfRetriesOnError = DEFAULT_NUMBER_OF_RETRIES_ON_ERROR;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/S3Util.java`
#### Snippet
```java
    private long myMultipartUploadThreshold = FIVE_MB;
    private int connectionTimeout;
    private boolean myShutdownClient = false;
    private boolean myPresignedMultipartUploadEnabled = false;
    private int myPresignedUrlMaxChunkSize = DEFAULT_PRESIGNED_URL_MAX_CHUNK_SIZE;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
  static abstract class LazyCredentials implements AWSSessionCredentials {
    @Nullable
    private AWSSessionCredentials myDelegate = null;

    @Override
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `suffix`
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/clients/ClientConfigurationBuilder.java`
#### Snippet
```java
  public static ClientConfiguration createClientConfigurationEx(@Nullable String suffix){
    if (StringUtil.isEmpty(suffix)){
      suffix = AwsCloudConnectorConstants.DEFAULT_SUFFIX;
    }
    final ClientConfiguration config = new ClientConfiguration();
```

### AssignmentToMethodParameter
Assignment to method parameter `suffix`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
  public static ClientConfiguration createClientConfigurationEx(@Nullable String suffix){
    if (StringUtil.isEmpty(suffix)){
      suffix = "aws";
    }
    final ClientConfiguration config = new ClientConfiguration();
```

### AssignmentToMethodParameter
Assignment to method parameter `baseDir`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
    Collections.sort(allParts);

    baseDir = FileUtil.toSystemIndependentName(baseDir);
    final StringBuilder sb = new StringBuilder();
    for (String p : allParts) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AwsRotateKeysController.java`
#### Snippet
```java

    writeAsJson(errors, response);
    return null;
  }

```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AwsExternalIdsController.java`
#### Snippet
```java
    }

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AwsTestConnectionController.java`
#### Snippet
```java
  @Override
  protected ModelAndView doGet(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AvailableAwsConnsController.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/common/impl/AwsConnectionsHolderImpl.java`
#### Snippet
```java
    Map<String, String> dataStorageValues = dataStorage.getValues();
    if (dataStorageValues == null || !dataStorageValues.containsKey(key)) {
      return null;
    }
    return dataStorageValues.get(key);
```

### ReturnNull
Return of `null`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/retry/Retrier.java`
#### Snippet
```java
    execute(() -> {
      runnable.run();
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/defaultProviderType/DefaultProviderCredentialsHolder.java`
#### Snippet
```java
          return ((AWSSessionCredentials)credentials).getSessionToken();
        } else {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/defaultProviderType/DefaultProviderCredentialsHolder.java`
#### Snippet
```java
  @Override
  public Date getSessionExpirationDate() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/staticType/StaticCredentialsHolder.java`
#### Snippet
```java
      @Override
      public String getSessionToken() {
        return null;
      }
    };
```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/staticType/StaticCredentialsHolder.java`
#### Snippet
```java
  @Override
  public Date getSessionExpirationDate() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/PathMappings.java`
#### Snippet
```java
    String relativePath = FileUtil.getRelativePath(myBaseDir, f);

    if (relativePath == null) return null;

    relativePath = FileUtil.toSystemIndependentName(relativePath);
```

### ReturnNull
Return of `null`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSException.java`
#### Snippet
```java
        "Request ID:          " + ase.getRequestId();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSException.java`
#### Snippet
```java
      return ase.getServiceName() + ase.getErrorType().name() + ase.getStatusCode() + ase.getErrorCode();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/staticType/StaticSessionCredentialsHolder.java`
#### Snippet
```java
  public Date getSessionExpirationDate() {
    //TODO: TW-78235 refactor other parts of AWS Core plugin not to use refreshing logic
    return null;
  }

```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/iamRoleType/IamRoleSessionCredentialsHolder.java`
#### Snippet
```java
  public Date getSessionExpirationDate() {
    //TODO: TW-78235 refactor other parts of AWS Core plugin not to use refreshing logic
    return null;
  }

```

### ReturnNull
Return of `null`
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/ParamUtil.java`
#### Snippet
```java
    try {
      Arn.fromString(resourceArnString);
      return null;
    } catch (IllegalArgumentException e) {
      return e.getMessage();
```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/AwsConnectionsManagerImpl.java`
#### Snippet
```java
    } catch (AwsConnectorException e) {
      Loggers.CLOUD.warnAndDebugDetails(String.format("Cannot resolve AWS connection with ID '%s' in project '%s'", awsConnectionId, project.getExternalId()), e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/AwsConnectionsManagerImpl.java`
#### Snippet
```java
    Collection<SBuildFeatureDescriptor> awsConnectionsToExpose = AwsConnToAgentBuildFeature.getAwsConnectionsToExpose(build);
    if (awsConnectionsToExpose.isEmpty()) {
      return null;
    }
    return awsConnectionsToExpose.iterator().next();
```

### ReturnNull
Return of `null`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/AwsConnectionsManagerImpl.java`
#### Snippet
```java
    Collection<SBuildFeatureDescriptor> awsConnectionsToExpose = AwsConnToAgentBuildFeature.getAwsConnectionsToExpose(build);
    if (awsConnectionsToExpose.isEmpty()) {
      return null;
    }
    SBuildFeatureDescriptor configuredAwsConnBuildFeature = awsConnectionsToExpose.iterator().next();
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/retry/impl/NoRetryRetrierImpl.java`
#### Snippet
```java
      return callable.call();
    } catch (Exception e) {
      throw e instanceof RuntimeException ? (RuntimeException)e : new RuntimeException(e.getMessage(), e);
    }
  }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `exception`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/retry/impl/RetrierImpl.java`
#### Snippet
```java
        if (!thrownExceptions.compareAndSet(null, exception) && !thrownExceptions.compareAndSet(exception, exception)) {
          thrownExceptions.get().addSuppressed(exception);
          if (exception instanceof AbortRetriesException) {
            retriesAborted.set(true);
          }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/retry/impl/RetrierImpl.java`
#### Snippet
```java
      } catch (Exception e) {
        if (exception == null) {
          if (e instanceof RuntimeException) {
            exception = (RuntimeException)e;
          } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/retry/impl/RetrierImpl.java`
#### Snippet
```java
            exception = (RuntimeException)e;
          } else {
            if (e instanceof InterruptedException) {
              exception = new AbortRetriesException(e);
            } else {
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/credsToAgent/InjectAwsCredentialsToTheBuildContext.java`
#### Snippet
```java
        String awsConnectionId = connectionBuildFeatureProps.get(CHOSEN_AWS_CONN_ID_PARAM);
        if (awsConnectionId == null) {
          String message = String.format("Chosen AWS Connection ID is null in the BuildFeature, will not add AWS Connection to the Build");
          context.getBuild().getBuildLog()
                 .messageAsync(
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `SERVICE_PROBLEM_TYPE` of exception class
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSException.java`
#### Snippet
```java
  @Used("CodeDeploy")
  @NotNull
  public static String SERVICE_PROBLEM_TYPE = "AWS_SERVICE";
  @Used("CodeDeploy")
  @NotNull
```

### NonFinalFieldOfException
Non-final field `CLIENT_PROBLEM_TYPE` of exception class
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSException.java`
#### Snippet
```java
  @Used("CodeDeploy")
  @NotNull
  public static String CLIENT_PROBLEM_TYPE = "AWS_CLIENT";
  @Used("CodeDeploy")
  @NotNull
```

### NonFinalFieldOfException
Non-final field `PROBLEM_TYPES` of exception class
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSException.java`
#### Snippet
```java
  @NotNull
  @Used("CodeDeploy")
  public static Map<String, String> PROBLEM_TYPES = CollectionsUtil.asMap(
    SERVICE_PROBLEM_TYPE, "Amazon service exception",
    CLIENT_PROBLEM_TYPE, "Amazon client exception",
```

### NonFinalFieldOfException
Non-final field `EXCEPTION_BUILD_PROBLEM_TYPE` of exception class
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSException.java`
#### Snippet
```java
  @Used("CodeDeploy")
  @NotNull
  public static String EXCEPTION_BUILD_PROBLEM_TYPE = "AWS_EXCEPTION";
  @NotNull
  @Used("CodeDeploy")
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `aws-core-agent/src/main/java/jetbrains/buildServer/clouds/amazon/connector/AwsCredentialsHandler.java`
#### Snippet
```java
    } catch (final IOException e) {
      LOG.warn(e.getMessage(), e);
      throw new IOException(e.getMessage()) {{
        initCause(e);
      }};
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `AwsConnectionNotFoundException` ends with 'Exception'
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/errors/AwsConnectionNotFoundException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class AwsConnectionNotFoundException extends AwsBuildFeatureException {
  public AwsConnectionNotFoundException(@NotNull final String connectionId) {
    super(String.format("Please, check that the AWS Connection with ID: <%s> exists and ensure that it is working", connectionId));
```

### NonExceptionNameEndsWithException
Non-exception class name `AwsBuildFeatureException` ends with 'Exception'
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/errors/features/AwsBuildFeatureException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class AwsBuildFeatureException extends AwsConnectorException {
  public AwsBuildFeatureException(@NotNull final String message) {
    super(message);
```

### NonExceptionNameEndsWithException
Non-exception class name `NoSuchAwsCredentialsBuilderException` ends with 'Exception'
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/errors/NoSuchAwsCredentialsBuilderException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class NoSuchAwsCredentialsBuilderException extends AwsConnectorException {
  public NoSuchAwsCredentialsBuilderException(@NotNull final String message) {
    super(message);
```

### NonExceptionNameEndsWithException
Non-exception class name `LinkedAwsConnNotFoundException` ends with 'Exception'
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/errors/features/LinkedAwsConnNotFoundException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class LinkedAwsConnNotFoundException extends AwsBuildFeatureException {
  public LinkedAwsConnNotFoundException(@NotNull final String message) {
    super(message);
```

### NonExceptionNameEndsWithException
Non-exception class name `KeyRotationException` ends with 'Exception'
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/errors/KeyRotationException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class KeyRotationException extends AwsConnectorException {
  public KeyRotationException(@NotNull final String message) {
    super(message);
```

### NonExceptionNameEndsWithException
Non-exception class name `AwsConnectorException` ends with 'Exception'
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/errors/AwsConnectorException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class AwsConnectorException extends ConnectionCredentialsException {

  private final String myParameterName;
```

### NonExceptionNameEndsWithException
Non-exception class name `DuplicatedAwsConnectionIdException` ends with 'Exception'
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/errors/DuplicatedAwsConnectionIdException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class DuplicatedAwsConnectionIdException extends AwsBuildFeatureException {
  public DuplicatedAwsConnectionIdException(@NotNull final String message) {
    super(message);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `message` initializer `String.format(EC2_CLIENT_ERROR, e.getMessage())` is redundant
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/ami/cleanup/EC2AmiCleanupExtension.java`
#### Snippet
```java
          return myClientCreator.createClient(awsConnection);
        } catch (ConnectionCredentialsException e) {
          final String message = String.format(EC2_CLIENT_ERROR, e.getMessage());
          CLEANUP.warn(message);
          cleanupContext.onBuildCleanupError(this, build, message);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `Boolean.parseBoolean(USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD)` is always `false` when reached
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
      return false;
    }
    return Boolean.parseBoolean(params.get(USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM)) || Boolean.parseBoolean(USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD);
  }

```

