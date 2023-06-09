# azure-maven-plugins 
 
# Bad smells
I found 486 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 120 | false |
| DataFlowIssue | 96 | false |
| UNUSED_IMPORT | 43 | false |
| DuplicatedCode | 43 | false |
| UNCHECKED_WARNING | 33 | false |
| FieldMayBeFinal | 15 | false |
| IgnoreResultOfCall | 10 | false |
| UnresolvedPropertyKey | 10 | false |
| UnnecessaryModifier | 6 | true |
| RedundantMethodOverride | 6 | false |
| IOStreamConstructor | 6 | false |
| JavadocDeclaration | 6 | false |
| RegExpRedundantEscape | 5 | false |
| NonFinalFieldInEnum | 5 | false |
| UnnecessaryReturn | 5 | true |
| DeprecatedIsStillUsed | 5 | false |
| CommentedOutCode | 4 | false |
| BlockingMethodInNonBlockingContext | 4 | false |
| RedundantStringFormatCall | 4 | false |
| UnnecessarySemicolon | 4 | false |
| CopyConstructorMissesField | 4 | false |
| ArraysAsListWithZeroOrOneArgument | 4 | false |
| NullableProblems | 3 | false |
| UnusedAssignment | 3 | false |
| CatchMayIgnoreException | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| MissingAspectjAutoproxyInspection | 3 | false |
| JavadocLinkAsPlainText | 2 | false |
| DefaultAnnotationParam | 2 | false |
| Lombok | 2 | false |
| NullArgumentToVariableArgMethod | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| ReactiveStreamsUnusedPublisher | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| DoubleCheckedLocking | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| RedundantUnmodifiable | 1 | false |
| ConstantValue | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| PlaceholderCountMatchesArgumentCount | 1 | false |
| CallingSubscribeInNonBlockingScope | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| ReactiveStreamsThrowInOperator | 1 | false |
| TrivialIf | 1 | false |
| AutoCloseableResource | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| RedundantCast | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/message/ISenderReceiver.java`
#### Snippet
```java
    public void stopReceivingMessage();
    public void sendMessage(String message);
    public boolean isListening();
    public boolean isSendEnabled();
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/message/ISenderReceiver.java`
#### Snippet
```java
    public void startReceivingMessage();
    public void stopReceivingMessage();
    public void sendMessage(String message);
    public boolean isListening();
    public boolean isSendEnabled();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/message/ISenderReceiver.java`
#### Snippet
```java
public interface ISenderReceiver extends AzResource {
    public void startReceivingMessage();
    public void stopReceivingMessage();
    public void sendMessage(String message);
    public boolean isListening();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/message/ISenderReceiver.java`
#### Snippet
```java

public interface ISenderReceiver extends AzResource {
    public void startReceivingMessage();
    public void stopReceivingMessage();
    public void sendMessage(String message);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/message/ISenderReceiver.java`
#### Snippet
```java
    public void sendMessage(String message);
    public boolean isListening();
    public boolean isSendEnabled();
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/TelemetryEventType.java`
#### Snippet
```java
    private final String value;

    private TelemetryEventType(String value) {
        this.value = value;
    }
```

## RuleId[id=DoubleCheckedLocking]
### DoubleCheckedLocking
Double-checked locking
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
    @Override
    public String getDeploymentStagingDirectoryPath() {
        if (stagingDirectory == null) {
            synchronized (this) {
                if (stagingDirectory == null) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (5 lines)
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/Account.java`
#### Snippet
```java
        public Mono<AccessToken> getToken(TokenRequestContext request) {
            request.setTenantId(StringUtils.firstNonBlank(request.getTenantId(), this.tenantId));
            // final String resource = ScopeUtil.scopesToResource(request.getScopes());
            // final Function<String, SimpleTokenCache> func = (ignore) -> new SimpleTokenCache(() -> defaultCredential.getToken(request));
            // return resourceTokenCache.computeIfAbsent(resource, func).getToken();
```

### CommentedOutCode
Commented out code (6 lines)
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/AzureOperationAspect.java`
#### Snippet
```java
    }

    //    @Around("operation()")
    //    public Object around(ProceedingJoinPoint point) throws Throwable {
    //        final IAzureOperation current = toOperation(point);
```

### CommentedOutCode
Commented out code (5 lines)
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/VirtualMachine.java`
#### Snippet
```java
    public boolean isSshEnabled() {
        // TODO: @wangmi check if ssh is enabled, possible solution: INBOUND/TCP/22
        // return remote().getPrimaryNetworkInterface().getNetworkSecurityGroup().securityRules().entrySet().stream()
        //    .anyMatch(e -> SecurityRuleProtocol.TCP.equals(e.getValue().protocol()) &&
        //        SecurityRuleDirection.INBOUND.equals(e.getValue().direction()) &&
```

### CommentedOutCode
Commented out code (2 lines)
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/Utils.java`
#### Snippet
```java
    private static final int POLLING_INTERVAL = 5;

//    protected static final List<String> DEPLOYMENT_PROCESSING_STATUS =
//            Arrays.asList(DeploymentResourceStatus.COMPILING.toString(), DeploymentResourceStatus.ALLOCATING.toString(), DeploymentResourceStatus.UPGRADING.toString());

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/resources/schema/common/ResourceGroupName.json`
#### Snippet
```java
  "description": "Name for Azure Resource Group",
  "type": "string",
  "pattern": "^[a-zA-Z0-9\\.\\_\\-\\(\\)]+$",
  "minLength": 2,
  "maxLength": 90
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/resources/schema/common/ResourceGroupName.json`
#### Snippet
```java
  "description": "Name for Azure Resource Group",
  "type": "string",
  "pattern": "^[a-zA-Z0-9\\.\\_\\-\\(\\)]+$",
  "minLength": 2,
  "maxLength": 90
```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/resources/schema/common/ResourceGroupName.json`
#### Snippet
```java
  "description": "Name for Azure Resource Group",
  "type": "string",
  "pattern": "^[a-zA-Z0-9\\.\\_\\-\\(\\)]+$",
  "minLength": 2,
  "maxLength": 90
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/resources/schema/common/ResourceGroupName.json`
#### Snippet
```java
  "description": "Name for Azure Resource Group",
  "type": "string",
  "pattern": "^[a-zA-Z0-9\\.\\_\\-\\(\\)]+$",
  "minLength": 2,
  "maxLength": 90
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/TemplateResources.java`
#### Snippet
```java
public class TemplateResources {
    private static final String VARIABLES_PREFIX = "variables_";
    private static final Pattern PATTERN = Pattern.compile("\\[variables\\('(.*)'\\)\\]");
    private static Map<String, String> map;

```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `value` in enum 'Protocol'
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/network/networksecuritygroup/SecurityRule.java`
#### Snippet
```java
        ALL("all");

        private String value;
    }
}
```

### NonFinalFieldInEnum
Non-final field `type` in enum 'BindingEnum'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/BindingEnum.java`
#### Snippet
```java
    }

    private String type;
    private Direction direction;
    private boolean isStorage;
```

### NonFinalFieldInEnum
Non-final field `direction` in enum 'BindingEnum'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/BindingEnum.java`
#### Snippet
```java

    private String type;
    private Direction direction;
    private boolean isStorage;

```

### NonFinalFieldInEnum
Non-final field `value` in enum 'FunctionExtensionVersion'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/configurations/FunctionExtensionVersion.java`
#### Snippet
```java
    UNKNOWN(Integer.MIN_VALUE, "unknown");

    private int value;
    private String version;

```

### NonFinalFieldInEnum
Non-final field `version` in enum 'FunctionExtensionVersion'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/configurations/FunctionExtensionVersion.java`
#### Snippet
```java

    private int value;
    private String version;

    FunctionExtensionVersion(int value, String version) {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/Binding.java`
#### Snippet
```java
    @Override
    public String toString() {
        return new StringBuilder()
                .append("[ name: ")
                .append(getName())
```

## RuleId[id=Deprecation]
### Deprecation
'put(java.lang.String, java.lang.String)' is deprecated
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureCloud.java`
#### Snippet
```java
        // https://github.com/Azure/azure-sdk-for-java/blob/32f8f7ca8b44035b2e5520c5e10455f42500a778/sdk/identity/azure-identity/
        // src/main/java/com/azure/identity/implementation/IdentityClientOptions.java#L42
        Configuration.getGlobalConfiguration().put(Configuration.PROPERTY_AZURE_AUTHORITY_HOST, environment.getActiveDirectoryEndpoint());
        final com.microsoft.azure.toolkit.lib.AzureConfiguration az = com.microsoft.azure.toolkit.lib.Azure.az().config();
        if (StringUtils.isNotBlank(az.getProxySource())) {
```

### Deprecation
'put(java.lang.String, java.lang.String)' is deprecated
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureCloud.java`
#### Snippet
```java
            }
            final String proxy = String.format("http://%s%s:%d", proxyAuthPrefix, az.getHttpProxyHost(), az.getHttpProxyPort());
            Configuration.getGlobalConfiguration().put(Configuration.PROPERTY_HTTP_PROXY, proxy);
            Configuration.getGlobalConfiguration().put(Configuration.PROPERTY_HTTPS_PROXY, proxy);
        }
```

### Deprecation
'put(java.lang.String, java.lang.String)' is deprecated
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureCloud.java`
#### Snippet
```java
            final String proxy = String.format("http://%s%s:%d", proxyAuthPrefix, az.getHttpProxyHost(), az.getHttpProxyPort());
            Configuration.getGlobalConfiguration().put(Configuration.PROPERTY_HTTP_PROXY, proxy);
            Configuration.getGlobalConfiguration().put(Configuration.PROPERTY_HTTPS_PROXY, proxy);
        }
        final String cloud = AzureEnvironmentUtils.getCloudName(environment);
```

### Deprecation
'AZURE_GERMANY' is deprecated
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureEnvironmentUtils.java`
#### Snippet
```java
        putAliasMap(AzureEnvironment.AZURE_CHINA, "AzureChinaCloud", "azure_china", "AzureChina", "azure_china_cloud", "CHINA");
        // the TYPO:azure_german comes from azure cli: https://docs.microsoft.com/en-us/azure/germany/germany-get-started-connect-with-cli
        putAliasMap(AzureEnvironment.AZURE_GERMANY, "AzureGermanCloud", "azure_germany", "azure_german",
            "azure_germany_cloud", "azure_german_cloud", "AzureGerman", "AzureGermany", "GERMAN");
        putAliasMap(AzureEnvironment.AZURE_US_GOVERNMENT, "AzureUSGovernment", "azure_us_government", "US_GOVERNMENT");
```

### Deprecation
'AZURE_GERMANY' is deprecated
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureEnvironmentUtils.java`
#### Snippet
```java
        } else if (AzureEnvironment.AZURE_CHINA.equals(env)) {
            return CHINA_PORTAL;
        } else if (AzureEnvironment.AZURE_GERMANY.equals(env)) {
            return AzureEnvironment.AZURE_GERMANY.getPortal();
        } else if (AzureEnvironment.AZURE_US_GOVERNMENT.equals(env)) {
```

### Deprecation
'AZURE_GERMANY' is deprecated
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureEnvironmentUtils.java`
#### Snippet
```java
            return CHINA_PORTAL;
        } else if (AzureEnvironment.AZURE_GERMANY.equals(env)) {
            return AzureEnvironment.AZURE_GERMANY.getPortal();
        } else if (AzureEnvironment.AZURE_US_GOVERNMENT.equals(env)) {
            return AzureEnvironment.AZURE_US_GOVERNMENT.getPortal();
```

### Deprecation
'JdkSslContext(javax.net.ssl.SSLContext, boolean, io.netty.handler.ssl.ClientAuth)' is deprecated
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzServiceSubscription.java`
#### Snippet
```java
                        .resolver(resolverGroup);
            if (Objects.nonNull(config.getSslContext())) {
                nettyHttpClient = nettyHttpClient.secure(sslConfig -> sslConfig.sslContext(new JdkSslContext(config.getSslContext(), true, ClientAuth.NONE)));
            }
            NettyAsyncHttpClientBuilder builder = new NettyAsyncHttpClientBuilder(nettyHttpClient);
```

### Deprecation
'disable(com.fasterxml.jackson.databind.MapperFeature...)' is deprecated
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/validator/SchemaValidator.java`
#### Snippet
```java
    private final JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
    private final ObjectMapper objectMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
            .disable(AUTO_DETECT_CREATORS, AUTO_DETECT_GETTERS, AUTO_DETECT_IS_GETTERS);

    static {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/docker/IDockerCredentialProvider.java`
#### Snippet
```java
    String getUsername() throws AzureExecutionException;

    String getPassword() throws AzureExecutionException;

    void validate() throws AzureExecutionException;
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/docker/IDockerCredentialProvider.java`
#### Snippet
```java
    String getPassword() throws AzureExecutionException;

    void validate() throws AzureExecutionException;
}

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/docker/IDockerCredentialProvider.java`
#### Snippet
```java

public interface IDockerCredentialProvider {
    String getUsername() throws AzureExecutionException;

    String getPassword() throws AzureExecutionException;
```

### Deprecation
'Binding(com.microsoft.azure.toolkit.lib.legacy.function.bindings.BindingEnum, java.lang.annotation.Annotation)' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/ExtendedCustomBinding.java`
#### Snippet
```java
                                 Annotation customBindingAnnotation,
                                 Annotation annotation) {
        super(bindingEnum, annotation);
        this.customBindingAnnotation = DefaultFunctionProject.create(customBindingAnnotation);
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/CommandHandler.java`
#### Snippet
```java
    String runCommandAndGetOutput(final String command,
                                  final boolean showStdout,
                                  final String workingDirectory) throws AzureExecutionException;
}

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/CommandHandler.java`
#### Snippet
```java
                                       final String workingDirectory,
                                       final List<Long> validReturnCodes,
                                       final String errorMessage) throws AzureExecutionException;

    String runCommandAndGetOutput(final String command,
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/AzureStorageHelper.java`
#### Snippet
```java

    public static void deleteBlob(final CloudStorageAccount storageAccount, final String containerName,
            final String blobName) throws AzureExecutionException {
        try {
            final CloudBlobContainer blobContainer = getBlobContainer(storageAccount, containerName);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/AzureStorageHelper.java`
#### Snippet
```java
            }
        } catch (URISyntaxException | StorageException e) {
            throw new AzureExecutionException(FAIL_TO_DELETE_BLOB, e);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/AzureStorageHelper.java`
#### Snippet
```java

    public static CloudBlockBlob uploadFileAsBlob(final File fileToUpload, final CloudStorageAccount storageAccount,
            final String containerName, final String blobName, final BlobContainerPublicAccessType accessType) throws AzureExecutionException {
        try {
            final CloudBlobContainer blobContainer = getBlobContainer(storageAccount, containerName);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/AzureStorageHelper.java`
#### Snippet
```java
            return blob;
        } catch (URISyntaxException | StorageException | IOException e) {
            throw new AzureExecutionException(FAIL_TO_UPLOAD_BLOB, e);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/AzureStorageHelper.java`
#### Snippet
```java
    }

    public static String getSASToken(final CloudBlob blob, Period period) throws AzureExecutionException {
        final SharedAccessBlobPolicy policy = new SharedAccessBlobPolicy();
        policy.setPermissions(EnumSet.of(SharedAccessBlobPermissions.READ));
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/AzureStorageHelper.java`
#### Snippet
```java
            return String.format("%s?%s", url, sas);
        } catch (InvalidKeyException | StorageException e) {
            throw new AzureExecutionException(FAIL_TO_GENERATE_BLOB_SAS_TOKEN, e);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/FunctionCoreToolsHandler.java`
#### Snippet
```java

public interface FunctionCoreToolsHandler {
    void installExtension(File stagingDirectory, File basedir) throws AzureExecutionException;
}

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandler.java`
#### Snippet
```java
    Set<Method> findFunctions(final List<URL> urls);

    Map<String, FunctionConfiguration> generateConfigurations(final Set<Method> methods) throws AzureExecutionException;

    FunctionConfiguration generateConfiguration(final Method method) throws AzureExecutionException;
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandler.java`
#### Snippet
```java
    Map<String, FunctionConfiguration> generateConfigurations(final Set<Method> methods) throws AzureExecutionException;

    FunctionConfiguration generateConfiguration(final Method method) throws AzureExecutionException;
}

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/CommandHandlerImpl.java`
#### Snippet
```java
                                              final String workingDirectory,
                                              final List<Long> validReturnCodes,
                                              final String errorMessage) throws AzureExecutionException {
        try {
            final Process process = runCommand(command, showStdout, workingDirectory);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/CommandHandlerImpl.java`
#### Snippet
```java
            handleExitValue(process.exitValue(), validReturnCodes, errorMessage, process.getInputStream());
        } catch (IOException | InterruptedException ex) {
            throw new AzureExecutionException("Cannot execute '" + command + "'", ex);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/CommandHandlerImpl.java`
#### Snippet
```java
    public String runCommandAndGetOutput(final String command,
                                         final boolean showStdout,
                                         final String workingDirectory) throws AzureExecutionException {
        try {
            final Process process = runCommand(command, showStdout, workingDirectory);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/CommandHandlerImpl.java`
#### Snippet
```java
            return getOutputFromProcess(process);
        } catch (IOException | InterruptedException ex) {
            throw new AzureExecutionException("Cannot execute '" + command + "'", ex);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/CommandHandlerImpl.java`
#### Snippet
```java
                                   final List<Long> validReturnCodes,
                                   final String errorMessage,
                                   final InputStream inputStream) throws AzureExecutionException, IOException {
        log.debug("Process exit value: " + exitValue);
        if (!validReturnCodes.contains(Integer.toUnsignedLong(exitValue))) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/CommandHandlerImpl.java`
#### Snippet
```java
            showErrorIfAny(inputStream);
            AzureMessager.getMessager().error(errorMessage);
            throw new AzureExecutionException(errorMessage);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/FunctionCoreToolsHandlerImpl.java`
#### Snippet
```java
    }

    protected void assureRequirementAddressed() throws AzureExecutionException {
        final String localVersion = getLocalFunctionCoreToolsVersion();
        final String latestCoreVersion = getLatestFunctionCoreToolsVersion();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/FunctionCoreToolsHandlerImpl.java`
#### Snippet
```java
        // Ensure azure function core tools has been installed and support extension auto-install
        if (localVersion == null || LEAST_SUPPORTED_VERSION.greaterThan(Version.valueOf(localVersion))) {
            throw new AzureExecutionException(CANNOT_AUTO_INSTALL);
        }
        final IAzureMessager messager = AzureMessager.getMessager();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/FunctionCoreToolsHandlerImpl.java`
#### Snippet
```java

    @Override
    public void installExtension(File stagingDirectory, File basedir) throws AzureExecutionException {
        assureRequirementAddressed();
        installFunctionExtension(stagingDirectory, basedir);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/FunctionCoreToolsHandlerImpl.java`
#### Snippet
```java
    }

    protected void installFunctionExtension(File stagingDirector, File basedir) throws AzureExecutionException {
        commandHandler.runCommandWithReturnCodeCheck(
                String.format(FUNC_EXTENSIONS_INSTALL_TEMPLATE, basedir.getAbsolutePath()),
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/appservice/DeploymentType.java`
#### Snippet
```java
    public static final String UNKNOWN_DEPLOYMENT_TYPE = "The value of <deploymentType> is unknown.";

    public static DeploymentType fromString(final String input) throws AzureExecutionException {
        if (StringUtils.isEmpty(input)) {
            return EMPTY;
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/appservice/DeploymentType.java`
#### Snippet
```java
                return RUN_FROM_BLOB;
            default:
                throw new AzureExecutionException(UNKNOWN_DEPLOYMENT_TYPE);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/appservice/handlers/artifact/FTPUploader.java`
#### Snippet
```java
    public void uploadDirectoryWithRetries(final String ftpServer, final String username, final String password,
                                           final String sourceDirectory, final String targetDirectory,
                                           final int maxRetryCount) throws AzureExecutionException {
        int retryCount = 0;
        while (retryCount < maxRetryCount) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/appservice/handlers/artifact/FTPUploader.java`
#### Snippet
```java
        }
        // Reaching here means all retries failed.
        throw new AzureExecutionException(String.format(UPLOAD_RETRY_FAILURE, maxRetryCount));
    }

```

### Deprecation
'id()' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/model/AppServiceFile.java`
#### Snippet
```java

    public String getId() {
        return String.format("<%s>/%s", this.getApp().id(), this.getPath());
    }

```

### Deprecation
'name()' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/model/AppServiceFile.java`
#### Snippet
```java

    public String getFullName() {
        return String.format("<%s>/%s", this.getApp().name(), this.getName());
    }

```

### Deprecation
'name()' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceConfigUtils.java`
#### Snippet
```java
        config.runtime(runtimeConfig);
        config.pricingTier(servicePlan.getPricingTier());
        config.servicePlanName(servicePlan.name());
        config.servicePlanResourceGroup(servicePlan.getResourceGroupName());
        return config;
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/deploy/FTPFunctionDeployHandler.java`
#### Snippet
```java
            uploader.uploadDirectoryWithRetries(serverUrl, profile.ftpUsername(), profile.ftpPassword(),
                    file.getAbsolutePath(), DEFAULT_WEBAPP_ROOT, DEFAULT_MAX_RETRY_TIMES);
        } catch (AzureExecutionException e) {
            throw new AzureToolkitRuntimeException("Failed to upload artifact to azure", e);
        }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/deploy/MSFunctionDeployHandler.java`
#### Snippet
```java
            AzureMessager.getMessager().info(UPLOAD_PACKAGE_DONE + blob.getUri().toString());
            return packageUri;
        } catch (AzureExecutionException e) {
            throw new AzureToolkitRuntimeException("Failed to upload package to azure storage", e);
        }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/deploy/RunFromBlobFunctionDeployHandler.java`
#### Snippet
```java

    private CloudBlockBlob deployArtifactToAzureStorage(WebAppBase deployTarget, File zipPackage, CloudStorageAccount storageAccount)
            throws AzureExecutionException {
        AzureMessager.getMessager().info(String.format(DEPLOY_START, deployTarget.name()));
        final CloudBlobContainer container = getOrCreateArtifactContainer(storageAccount);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/deploy/RunFromBlobFunctionDeployHandler.java`
#### Snippet
```java
            final String sasToken = AzureStorageHelper.getSASToken(blob, Period.ofYears(SAS_EXPIRE_DATE_BY_YEAR));
            DeployUtils.updateFunctionAppSetting(target, APP_SETTING_WEBSITE_RUN_FROM_PACKAGE, sasToken);
        } catch (AzureExecutionException e) {
            throw new AzureToolkitRuntimeException("Failed to upload package to azure storage", e);
        }
```

### Deprecation
'AZURE_GERMANY' is deprecated
in `azure-toolkit-libs/azure-toolkit-containerregistry-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerregistry/RepositoryModule.java`
#### Snippet
```java
        if (env.getPortal().equalsIgnoreCase(AzureEnvironment.AZURE_CHINA.getPortal())) {
            return ContainerRegistryAudience.AZURE_RESOURCE_MANAGER_CHINA;
        } else if (env.getPortal().equalsIgnoreCase(AzureEnvironment.AZURE_GERMANY.getPortal())) {
            return ContainerRegistryAudience.AZURE_RESOURCE_MANAGER_GERMANY;
        } else if (env.getPortal().equalsIgnoreCase(AzureEnvironment.AZURE_US_GOVERNMENT.getPortal())) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenAuthUtils.java`
#### Snippet
```java

    public static AuthConfiguration buildAuthConfiguration(MavenSession session, SettingsDecrypter settingsDecrypter, @Nonnull MavenAuthConfiguration auth)
            throws AzureExecutionException, MavenDecryptException {
        final String serverId = auth.getServerId();
        final AuthConfiguration authConfiguration;
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenAuthUtils.java`
#### Snippet
```java
                    buildAuthConfigurationByServerId(session, settingsDecrypter, serverId) : auth);
        } catch (InvalidConfigurationException ex) {
            throw new AzureExecutionException(ex.getMessage());
        }
        return authConfiguration;
```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java
            return Collections.emptyList();
        }
        final DirectoryScanner directoryScanner = new DirectoryScanner();
        directoryScanner.setBasedir(resource.getDirectory());
        directoryScanner.setIncludes(resource.getIncludes().toArray(new String[0]));
```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java
            return Collections.emptyList();
        }
        final DirectoryScanner directoryScanner = new DirectoryScanner();
        directoryScanner.setBasedir(resource.getDirectory());
        directoryScanner.setIncludes(resource.getIncludes().toArray(new String[0]));
```

### Deprecation
'getIncludedFiles()' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java
        directoryScanner.setExcludes(exclude);
        directoryScanner.scan();
        return Arrays.stream(directoryScanner.getIncludedFiles())
                .map(path -> new File(resource.getDirectory(), path))
                .collect(Collectors.toList());
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    protected String getTargetSubscriptionId(String defaultSubscriptionId,
                                             List<Subscription> subscriptions,
                                             List<Subscription> selectedSubscriptions) throws IOException, AzureExecutionException {
        String targetSubscriptionId = defaultSubscriptionId;

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    }

    protected Account loginAzure(MavenAuthConfiguration auth) throws MavenDecryptException, AzureExecutionException {
        if (Azure.az(AzureAccount.class).isLoggedIn()) {
            return Azure.az(AzureAccount.class).account();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    }

    protected void executeWithTimeRecorder(RunnableWithException operation, String name) throws AzureExecutionException {
        final long startTime = System.currentTimeMillis();
        try {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
            operation.run();
        } catch (Exception e) {
            throw new AzureExecutionException(e.getMessage(), e);
        } finally {
            final long endTime = System.currentTimeMillis();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    }

    protected String selectSubscription(Subscription[] subscriptions) throws AzureExecutionException {
        if (subscriptions.length == 0) {
            throw new AzureExecutionException("Cannot find any subscriptions in current account.");
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    protected String selectSubscription(Subscription[] subscriptions) throws AzureExecutionException {
        if (subscriptions.length == 0) {
            throw new AzureExecutionException("Cannot find any subscriptions in current account.");
        }
        if (subscriptions.length == 1) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
            .withNumberedPossibleValues(wrapSubs).withDefaultValue(defaultValue).read("Available subscriptions:");
        if (subscriptionOptionSelected == null) {
            throw new AzureExecutionException("You must select a subscription.");
        }
        return subscriptionOptionSelected.getSubscription().getId();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    }

    protected Account loginAzure() throws AzureExecutionException, MavenDecryptException {
        return this.loginAzure(auth);
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    }

    private AuthConfiguration toAuthConfiguration(MavenAuthConfiguration auth) throws AzureExecutionException, MavenDecryptException {
        final MavenAuthConfiguration mavenAuthConfiguration = auth == null ? new MavenAuthConfiguration() : auth;
        mavenAuthConfiguration.setType(StringUtils.firstNonBlank(mavenAuthConfiguration.getType(), authType));
```

### Deprecation
'name()' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java
    @Override
    public String toString() {
        return webappInner != null ? String.format("%s (%s)", webappInner.name(), getDescription()) : null;
    }

```

### Deprecation
'id()' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java

    public String getId() {
        return this.webappInner == null ? null : webappInner.id();
    }

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
    public static void prepareResources(final MavenProject project, final MavenSession session,
            final MavenResourcesFiltering filtering, final List<Resource> resources, final String stagingDirectoryPath)
            throws IOException, AzureExecutionException {
        if (resources == null || resources.isEmpty()) {
            throw new AzureExecutionException(NO_RESOURCES_CONFIG);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
            throws IOException, AzureExecutionException {
        if (resources == null || resources.isEmpty()) {
            throw new AzureExecutionException(NO_RESOURCES_CONFIG);
        }

```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
    public static List<File> getArtifacts(Resource resource) {
        final List<File> result = new ArrayList<>();
        final DirectoryScanner directoryScanner = new DirectoryScanner();
        if (resource.getIncludes() != null && !resource.getIncludes().isEmpty()) {
            directoryScanner.setBasedir(resource.getDirectory());
```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
    public static List<File> getArtifacts(Resource resource) {
        final List<File> result = new ArrayList<>();
        final DirectoryScanner directoryScanner = new DirectoryScanner();
        if (resource.getIncludes() != null && !resource.getIncludes().isEmpty()) {
            directoryScanner.setBasedir(resource.getDirectory());
```

### Deprecation
'getIncludedFiles()' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
            directoryScanner.setExcludes(exclude);
            directoryScanner.scan();
            final List<File> resourceFiles = Arrays.stream(directoryScanner.getIncludedFiles())
                    .map(path -> new File(resource.getDirectory(), path))
                    .collect(Collectors.toList());
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/configuration/SchemaVersion.java`
#### Snippet
```java
    public static final String UNKNOWN_SCHEMA_VERSION = "Unknown value of <schemaVersion> in pom.xml.";

    public static SchemaVersion fromString(final String input) throws AzureExecutionException {
        final String schemaVersion = StringUtils.isEmpty(input) ? "v1" : input;

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/configuration/SchemaVersion.java`
#### Snippet
```java
                return V2;
            default:
                throw new AzureExecutionException(UNKNOWN_SCHEMA_VERSION);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/DeployMojo.java`
#### Snippet
```java
    }

    private WebAppBase<?, ?, ?> createOrUpdateResource(WebAppBase<?, ?, ?> app) throws AzureExecutionException {
        final boolean skipCreate = skipAzureResourceCreate || BooleanUtils.isTrue(skipCreateAzureResource);
        final AppServiceConfig appServiceConfig = getConfigParser().getAppServiceConfig();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/DeployMojo.java`
#### Snippet
```java
    }

    private void validateArtifactCompileVersion() throws AzureExecutionException {
        final Runtime runtime = getConfigParser().getRuntime();
        final List<WebAppArtifact> artifacts = Optional.ofNullable(getConfigParser().getArtifacts())
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/DeployMojo.java`
#### Snippet
```java
    }

    private void doValidate() throws AzureExecutionException {
        validateConfiguration(message -> AzureMessager.getMessager().error(message.getMessage()), true);
        validateArtifactCompileVersion();
```

### Deprecation
'com.microsoft.azure.maven.webapp.task.DeployExternalResourcesTask' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/DeployMojo.java`
#### Snippet
```java

    private void deployExternalResources(final WebAppBase<?, ?, ?> target, final List<DeploymentResource> resources) {
        new DeployExternalResourcesTask(target, resources).doExecute();
    }
}
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/DeployMojo.java`
#### Snippet
```java
    @Override
    @AzureOperation(name = "user/webapp.deploy_app")
    protected void doExecute() throws AzureExecutionException {
        mergeCommandLineConfig();
        doValidate();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/ListMojo.java`
#### Snippet
```java
    @Override
    @AzureOperation("user/functionapp.list")
    protected void doExecute() throws AzureExecutionException {
        try {
            log.info(TEMPLATES_START);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/ListMojo.java`
#### Snippet
```java
            log.info(RESOURCES_END);
        } catch (IOException e) {
            throw new AzureExecutionException("IO error when printing templates:" + e.getMessage(), e);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/RunMojo.java`
#### Snippet
```java
    }

    protected void checkRuntimeExistence(final CommandHandler handler) throws AzureExecutionException {
        handler.runCommandWithReturnCodeCheck(
                getCheckRuntimeCommand(),
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/RunMojo.java`
#### Snippet
```java
    @Override
    @AzureOperation("user/functionapp.run")
    protected void doExecute() throws AzureExecutionException {
        validateAppName();

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/RunMojo.java`
#### Snippet
```java
    }

    protected void runFunctions(final CommandHandler handler) throws AzureExecutionException {
        handler.runCommandWithReturnCodeCheck(
                getStartFunctionHostCommand(),
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/RunMojo.java`
#### Snippet
```java
    }

    private void checkRuntimeCompatibility(final CommandHandler handler) throws AzureExecutionException {
        // Maven will always refer JAVA_HOME, which is also adopted by function core tools
        // So we could get function core tools runtime by java.version
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/RunMojo.java`
#### Snippet
```java
                MINIMUM_JAVA_9_SUPPORTED_VERSION_V2;
        if (funcVersion.compareTo(minimumVersion) < 0) {
            throw new AzureExecutionException(FUNCTION_CORE_TOOLS_OUT_OF_DATE);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/RunMojo.java`
#### Snippet
```java
    }

    protected void checkStageDirectoryExistence() throws AzureExecutionException {
        final File file = new File(getDeploymentStagingDirectoryPath());
        if (!file.exists() || !file.isDirectory()) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/RunMojo.java`
#### Snippet
```java
        final File file = new File(getDeploymentStagingDirectoryPath());
        if (!file.exists() || !file.isDirectory()) {
            throw new AzureExecutionException(STAGE_DIR_NOT_FOUND);
        }
        log.info(STAGE_DIR_FOUND + getDeploymentStagingDirectoryPath());
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/ConfigParser.java`
#### Snippet
```java
    }

    public FunctionAppConfig parseConfig() throws AzureExecutionException {
        return (FunctionAppConfig) new FunctionAppConfig()
                .disableAppInsights(mojo.isDisableAppInsights())
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/ConfigParser.java`
#### Snippet
```java
    }

    public RuntimeConfig getRuntimeConfig() throws AzureExecutionException {
        final RuntimeConfiguration runtime = mojo.getRuntimeConfiguration();
        if (runtime == null) {
```

### Deprecation
'schemaVersion' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java

    private boolean isV2Configuration(WebAppConfiguration configuration) {
        return configuration == null || schemaVersion.equalsIgnoreCase(SchemaVersion.V2.toString());
    }

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
    }

    protected static List<WebAppArtifact> convertResourceToArtifacts(List<DeploymentResource> resources) throws AzureExecutionException {
        try {
            return CollectionUtils.isEmpty(resources) ? Collections.emptyList() :
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
                            .flatMap(resource -> convertResourceToArtifacts(resource).stream()).collect(Collectors.toList());
        } catch (Throwable ex) {
            throw new AzureExecutionException(String.format("Cannot parse deployment resources due to error: %s.", ex.getMessage()), ex);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
    }

    private RuntimeConfig getRuntimeConfig() throws AzureExecutionException {
        final MavenRuntimeConfig runtime = mojo.getRuntime();
        if (runtime == null || runtime.isEmpty()) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
    }

    public List<WebAppArtifact> getArtifacts() throws AzureExecutionException {
        if (mojo.getDeployment() == null || mojo.getDeployment().getResources() == null) {
            return Collections.emptyList();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
    }

    public AppServiceConfig getAppServiceConfig() throws AzureExecutionException {
        return new AppServiceConfig()
                .subscriptionId(getSubscriptionId())
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
    }

    private void validateApplicationInsightsConfiguration() throws AzureExecutionException {
        if (isDisableAppInsights() && (StringUtils.isNotEmpty(getAppInsightsKey()) || StringUtils.isNotEmpty(getAppInsightsInstance()))) {
            throw new AzureExecutionException(APPLICATION_INSIGHTS_CONFIGURATION_CONFLICT);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
    private void validateApplicationInsightsConfiguration() throws AzureExecutionException {
        if (isDisableAppInsights() && (StringUtils.isNotEmpty(getAppInsightsKey()) || StringUtils.isNotEmpty(getAppInsightsInstance()))) {
            throw new AzureExecutionException(APPLICATION_INSIGHTS_CONFIGURATION_CONFLICT);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
    }

    private void validateArtifactCompileVersion() throws AzureExecutionException {
        final RuntimeConfig runtimeConfig = getParser().getRuntimeConfig();
        final String javaVersion = Optional.ofNullable(runtimeConfig).map(RuntimeConfig::javaVersion).map(JavaVersion::getValue).orElse(StringUtils.EMPTY);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
    }

    protected void doValidate() throws AzureExecutionException {
        validateParameters();
        validateFunctionCompatibility();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/MavenDockerCredentialProvider.java`
#### Snippet
```java
    }

    private void initializeServer() throws AzureExecutionException {
        if (StringUtils.isNotBlank(serverId)) {
            server = settings.getServer(serverId);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/MavenDockerCredentialProvider.java`
#### Snippet
```java
            server = settings.getServer(serverId);
            if (server == null) {
                throw new AzureExecutionException(String.format("Server not found in settings.xml. ServerId=%s", serverId));
            }
        }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/MavenDockerCredentialProvider.java`
#### Snippet
```java
    }

    public void validate() throws AzureExecutionException {
        if (server == null) {
            initializeServer();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/MavenDockerCredentialProvider.java`
#### Snippet
```java
    }

    public String getPassword() throws AzureExecutionException {
        if (server == null) {
            initializeServer();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/MavenDockerCredentialProvider.java`
#### Snippet
```java
    }

    public String getUsername() throws AzureExecutionException {
        if (server == null) {
            initializeServer();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/AbstractAppServiceMojo.java`
#### Snippet
```java
                printCurrentSubscription(appServiceClient);
                this.subscriptionId = targetSubscriptionId;
            } catch (AzureExecutionException | IOException | MavenDecryptException e) {
                throw new AzureToolkitRuntimeException("Cannot authenticate", e);
            }
```

### Deprecation
'name()' is deprecated
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/DeployMojo.java`
#### Snippet
```java
            return;
        }
        log.info("Getting public url of app({})...", TextUtils.cyan(app.name()));
        String publicUrl = app.getApplicationUrl();
        if (!BooleanUtils.isTrue(noWait) && StringUtils.isEmpty(publicUrl)) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java

    //region Load templates
    protected List<FunctionTemplate> loadAllFunctionTemplates(FunctionExtensionVersion bundleVersion) throws AzureExecutionException {
        log.info("");
        log.info(LOAD_TEMPLATES);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
    @Override
    @AzureOperation("user/functionapp.add")
    protected void doExecute() throws AzureExecutionException {
        try {
            final FunctionExtensionVersion bundleVersion = getBundleVersion();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
            saveNewFunctionToFile(newFunctionClass);
        } catch (MojoFailureException | IOException e) {
            throw new AzureExecutionException("Cannot add new java functions.", e);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
    }

    protected File getTargetFile(final File packageDir) throws AzureExecutionException {
        final String javaFileName = getClassName() + ".java";
        final File targetFile = new File(packageDir, javaFileName);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        final File targetFile = new File(packageDir, javaFileName);
        if (targetFile.exists()) {
            throw new AzureExecutionException(format(FILE_EXIST, targetFile.getAbsolutePath()));
        }
        return targetFile;
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java

    protected FunctionTemplate findTemplateByName(final List<FunctionTemplate> templates, final String templateName)
            throws AzureExecutionException {
        log.info("Selected function template: " + templateName);
        final Optional<FunctionTemplate> template = templates.stream()
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        }

        throw new AzureExecutionException(FIND_TEMPLATE_FAIL + templateName);
    }

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
    //region Save function to file

    protected void saveNewFunctionToFile(final String newFunctionClass) throws IOException, AzureExecutionException {
        log.info("");
        log.info(SAVE_FILE);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java

    //region Get function template
    protected FunctionTemplate getFunctionTemplate(final List<FunctionTemplate> templates) throws IOException, AzureExecutionException, MojoFailureException {
        log.info("");
        log.info(FIND_TEMPLATE);
```

### Deprecation
'name()' is deprecated
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/ConfigMojo.java`
#### Snippet
```java
            this.appSettings.setResourceGroup(targetAppCluster.getResourceGroupName());
            this.appSettings.setClusterName(targetAppCluster.getName());
            log.info(String.format("Using Azure Spring Apps: %s", TextUtils.blue(targetAppCluster.name())));
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/ConfigMojo.java`
#### Snippet
```java
    @Override
    @AzureOperation("user/springcloud.config_mojo")
    protected void doExecute() throws AzureExecutionException {
        if (!settings.isInteractiveMode()) {
            throw new UnsupportedOperationException("The goal 'config' must be run at interactive mode.");
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/ConfigMojo.java`
#### Snippet
```java
            confirmAndSave();
        } catch (IOException | InvalidConfigurationException | UnsupportedOperationException | MavenDecryptException | AzureToolkitAuthenticationException e) {
            throw new AzureExecutionException(e.getMessage());
        } finally {
            if (this.wrapper != null) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java

    protected void installExtension(final FunctionCoreToolsHandler handler,
                                    Set<BindingEnum> bindingEnums) throws AzureExecutionException {
        log.info(INSTALL_EXTENSIONS);
        if (!isInstallingExtensionNeeded(bindingEnums)) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
    @Override
    @AzureOperation("user/functionapp.package")
    protected void doExecute() throws AzureExecutionException {
        validateAppName();
        validateFunctionCompatibility();
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
            methods = findAnnotatedMethods(annotationHandler);
        } catch (MalformedURLException e) {
            throw new AzureExecutionException("Invalid URL when resolving class path:" + e.getMessage(), e);
        }

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
            copyJarsToStageDirectory();
        } catch (IOException | MojoExecutionException e) {
            throw new AzureExecutionException("Cannot perform IO operations due to error:" + e.getMessage(), e);
        }

```

### Deprecation
'com.microsoft.azure.toolkit.lib.legacy.function.handlers.AnnotationHandlerImpl' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java

    protected AnnotationHandler getAnnotationHandler() {
        return new AnnotationHandlerImpl();
    }

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java

    protected Map<String, FunctionConfiguration> getFunctionConfigurations(final AnnotationHandler handler,
                                                                           final Set<Method> methods) throws AzureExecutionException {
        log.info("");
        log.info(GENERATE_CONFIG);
```

### Deprecation
'SimpleFilter(java.util.Set, java.util.Set, java.util.Set)' is deprecated
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java

    private static Filter getExcludeSignFilesFilter(final Set<File> jars) {
        return new SimpleFilter(jars, Collections.emptySet(), SetUtils.unmodifiableSet("META-INF/*.SF", "META-INF/*.DSA", "META-INF/*.RSA"));
    }

```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDraft.java`
#### Snippet
```java
                .withWebContainer(AppServiceUtils.toWebContainer(newRuntime));
        } else if (operatingSystem == OperatingSystem.DOCKER) {
            return; // skip for docker, as docker configuration will be handled in `updateDockerConfiguration`
        } else {
            throw new AzureToolkitRuntimeException(String.format(UNSUPPORTED_OPERATING_SYSTEM, newRuntime.getOperatingSystem()));
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotDraft.java`
#### Snippet
```java
                    .withWebContainer(AppServiceUtils.toWebContainer(newRuntime));
        } else if (operatingSystem == OperatingSystem.DOCKER) {
            return; // skip for docker, as docker configuration will be handled in `updateDockerConfiguration`
        } else {
            throw new AzureToolkitRuntimeException(String.format(UNSUPPORTED_OPERATING_SYSTEM, newRuntime.getOperatingSystem()));
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
                    .withWebContainer(AppServiceUtils.toWebContainer(newRuntime));
        } else if (operatingSystem == OperatingSystem.DOCKER) {
            return; // skip for docker, as docker configuration will be handled in `updateDockerConfiguration`
        } else {
            throw new AzureToolkitRuntimeException(String.format(UNSUPPORTED_OPERATING_SYSTEM, newRuntime.getOperatingSystem()));
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
            }
        } else if (newRuntime.getOperatingSystem() == OperatingSystem.DOCKER) {
            return; // skip for docker, as docker configuration will be handled in `updateDockerConfiguration`
        } else {
            throw new AzureToolkitRuntimeException(String.format(UNSUPPORTED_OPERATING_SYSTEM, newRuntime.getOperatingSystem()));
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/serializer/ConfigurationSerializer.java`
#### Snippet
```java
        // if value is not changed, just return , in case overwrite ${} properties
        if (value == null || StringUtils.equals(value, oldValue)) {
            return;
        } else {
            XMLUtils.setChildValue(attribute, value, element);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/CustomTextIoStringListReader.java`
#### Snippet
```java
                    String optionText = valueFormatter.apply(option);
                    if (numberedPossibleValues) {
                        final int digits = ("" + optionCount).length();
                        optionId = String.format("%" + digits + "d: ", i + 1);
                        final String[] textLines = optionText.split("\\R", -1);
```

## RuleId[id=NullableProblems]
### NullableProblems
@Nullable field is always initialized not-null
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationContext.java`
#### Snippet
```java
    private static final OperationContext NULL = new OperationContext(null);
    @Nullable
    private final Operation operation;
    @Setter
    private IAzureMessager messager = null;
```

### NullableProblems
Parameter annotated @Nonnull must not override @Nullable parameter
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceGroupModule.java`
#### Snippet
```java
    @Nonnull
    @Override
    protected ResourceGroupDraft newDraftForCreate(@Nonnull String name, @Nonnull String resourceGroupName) {
        return new ResourceGroupDraft(name, resourceGroupName, this);
    }
```

### NullableProblems
Constructor parameter for @Nonnull field might be annotated @Nonnull itself
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/VmImage.java`
#### Snippet
```java
    }

    public VmImage(final OperatingSystem operatingSystem, final ImageReference imageReference) {
        this.operatingSystem = operatingSystem;
        this.id = imageReference.id();
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/CommandUtils.java`
#### Snippet
```java

/**
 * copied from: https://github.com/microsoft/azure-tools-for-java/blob/
 * 0efe5e430305369e17dadc214c256cbb4a906372/Utils/azuretools-core/src/com/microsoft/azuretools/utils/CommandUtils.java
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/configurations/FunctionConfiguration.java`
#### Snippet
```java

/**
 * Schema of function.json is at https://github.com/Azure/azure-webjobs-sdk-script/blob/dev/schemas/json/function.json
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/StreamingLogSupport.java`
#### Snippet
```java

            final HttpURLConnection connection = createLogStreamConnection(params);
            connection.connect();
            return Flux.create((fluxSink) -> {
                try {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/StreamingLogSupport.java`
#### Snippet
```java
            return Flux.create((fluxSink) -> {
                try {
                    final InputStream is = connection.getInputStream();
                    final BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                    String line;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/StreamingLogSupport.java`
#### Snippet
```java
                    final BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                    String line;
                    while ((line = rd.readLine()) != null) {
                        fluxSink.next(line);
                    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/StreamingLogSupport.java`
#### Snippet
```java
                        fluxSink.next(line);
                    }
                    rd.close();
                } catch (final FileNotFoundException e) {
                    AzureMessager.getMessager().error("app/instance may be deactivated, please refresh and try again later.");
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.skip()` is ignored
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/Utils.java`
#### Snippet
```java
        try (final InputStream stream = jarFile.getInputStream(jarEntry)) {
            final byte[] version = new byte[2];
            stream.skip(6);
            stream.read(version);
            stream.close();
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/Utils.java`
#### Snippet
```java
            final byte[] version = new byte[2];
            stream.skip(6);
            stream.read(version);
            stream.close();
            return new BigInteger(version).intValueExact() - 44;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java
    private void writeObjectToFile(final ObjectWriter objectWriter, final Object object, final File targetFile)
        throws IOException {
        targetFile.getParentFile().mkdirs();
        targetFile.createNewFile();
        objectWriter.writeValue(targetFile, object);
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java
        throws IOException {
        targetFile.getParentFile().mkdirs();
        targetFile.createNewFile();
        objectWriter.writeValue(targetFile, object);
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
                }
            } else {
                configurationFile.getParentFile().mkdirs();
                configurationFile.createNewFile();
            }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
            } else {
                configurationFile.getParentFile().mkdirs();
                configurationFile.createNewFile();
            }
        } catch (Exception e) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
                    // If staging directory doesn't exist, create one and delete it on exit
                    if (!stagingDirectory.exists()) {
                        stagingDirectory.mkdirs();
                    }
                }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
    protected void createPackageDirIfNotExist(final File packageDir) {
        if (!packageDir.exists()) {
            packageDir.mkdirs();
        }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
    protected void writeObjectToFile(final ObjectWriter objectWriter, final Object object, final File targetFile)
            throws IOException {
        targetFile.getParentFile().mkdirs();
        targetFile.createNewFile();
        objectWriter.writeValue(targetFile, object);
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
            throws IOException {
        targetFile.getParentFile().mkdirs();
        targetFile.createNewFile();
        objectWriter.writeValue(targetFile, object);
    }
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Lambda can be replaced with call qualifier
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
    protected void validateConfiguration(Consumer<ValidationMessage> validationMessageConsumer, boolean failOnError) {
        final List<ValidationMessage> validate = SchemaValidator.getInstance().validate("WebAppConfiguration", this, "configuration");
        validate.forEach(message -> validationMessageConsumer.accept(message));
        if (CollectionUtils.isNotEmpty(validate) && failOnError) {
            final String errorDetails = validate.stream().map(message -> message.getMessage().toString()).collect(Collectors.joining(StringUtils.LF));
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/AbstractAppServiceMojo.java`
#### Snippet
```java
     */
    @JsonProperty
    @Parameter(property = "appName", required = false)
    protected String appName;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/AbstractAppServiceMojo.java`
#### Snippet
```java
     */
    @JsonProperty
    @Parameter(property = "resourceGroup", required = false)
    protected String resourceGroup;

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `newDraftForUpdate()` is identical to its super method
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlContainerModule.java`
#### Snippet
```java
    @Nonnull
    @Override
    protected AzResource.Draft<SqlContainer, SqlContainerGetResultsInner> newDraftForUpdate(@Nonnull SqlContainer sqlContainer) {
        throw new AzureToolkitRuntimeException("not supported");
    }
```

### RedundantMethodOverride
Method `newDraftForUpdate()` is identical to its super method
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoCollectionModule.java`
#### Snippet
```java
    @Nonnull
    @Override
    protected AzResource.Draft<MongoCollection, MongoDBCollectionGetResultsInner> newDraftForUpdate(@Nonnull MongoCollection mongoCollection) {
        throw new AzureToolkitRuntimeException("not supported");
    }
```

### RedundantMethodOverride
Method `newDraftForUpdate()` is identical to its super method
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraTableModule.java`
#### Snippet
```java
    @Nonnull
    @Override
    protected AzResource.Draft<CassandraTable, CassandraTableGetResultsInner> newDraftForUpdate(@Nonnull CassandraTable cassandraTable) {
        throw new AzureToolkitRuntimeException("not supported");
    }
```

### RedundantMethodOverride
Method `getResourceGroup()` is identical to its super method
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java

    @Override
    public String getResourceGroup() {
        return resourceGroup;
    }
```

### RedundantMethodOverride
Method `getAppServicePlanResourceGroup()` is identical to its super method
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java

    @Override
    public String getAppServicePlanResourceGroup() {
        return appServicePlanResourceGroup;
    }
```

### RedundantMethodOverride
Method `getAppServicePlanName()` is identical to its super method
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java

    @Override
    public String getAppServicePlanName() {
        return appServicePlanName;
    }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
        final boolean defaultSelected = TemplateUtils.evalBoolean("default_selected", variables);
        if (options.size() == 1) {
            if (autoSelect) {
                log.info(TemplateUtils.evalText("message.auto_select", variables));
                return options;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/AzureFunctions.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.appservice.model.OperatingSystem;
import com.microsoft.azure.toolkit.lib.appservice.model.Runtime;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotModule.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.appservice.IDeploymentSlotModule;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import lombok.AccessLevel;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/model/LogLevel.java`
#### Snippet
```java
package com.microsoft.azure.toolkit.lib.appservice.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
```

### UNUSED_IMPORT
Unused import `import lombok.RequiredArgsConstructor;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/model/LogLevel.java`
#### Snippet
```java
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/plan/AppServicePlanModule.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.appservice.AppServiceServiceSubscription;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import com.azure.core.management.exception.ManagementException;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
package com.microsoft.azure.toolkit.lib.appservice.utils;

import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.appservice.fluent.models.SiteLogsConfigInner;
import com.azure.resourcemanager.appservice.models.ApplicationLogsConfig;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.appservice.function.FunctionApp;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import com.microsoft.azure.toolkit.lib.appservice.entity.FunctionEntity;
import com.microsoft.azure.toolkit.lib.appservice.function.FunctionApp;
import com.microsoft.azure.toolkit.lib.appservice.model.CsmDeploymentStatus;
import com.microsoft.azure.toolkit.lib.appservice.model.DeployOptions;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.bundle.AzureString;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.appservice.model.Runtime;
import com.microsoft.azure.toolkit.lib.appservice.model.WebContainer;
import com.microsoft.azure.toolkit.lib.common.bundle.AzureString;
import com.microsoft.azure.toolkit.lib.common.exception.AzureToolkitRuntimeException;
import com.microsoft.azure.toolkit.lib.common.messager.AzureMessager;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.messager.AzureMessager;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.bundle.AzureString;
import com.microsoft.azure.toolkit.lib.common.exception.AzureToolkitRuntimeException;
import com.microsoft.azure.toolkit.lib.common.messager.AzureMessager;
import com.microsoft.azure.toolkit.lib.common.messager.IAzureMessager;
import org.apache.commons.collections4.CollectionUtils;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.messager.IAzureMessager;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.exception.AzureToolkitRuntimeException;
import com.microsoft.azure.toolkit.lib.common.messager.AzureMessager;
import com.microsoft.azure.toolkit.lib.common.messager.IAzureMessager;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.collections4.CollectionUtils;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.messager.AzureMessager;
import com.microsoft.azure.toolkit.lib.common.messager.IAzureMessager;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
```

### UNUSED_IMPORT
Unused import `import reactor.core.publisher.Mono;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.util.retry.Retry;
```

### UNUSED_IMPORT
Unused import `import reactor.core.scheduler.Schedulers;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import org.apache.commons.lang3.StringUtils;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.util.retry.Retry;

```

### UNUSED_IMPORT
Unused import `import reactor.util.retry.Retry;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.util.retry.Retry;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import java.time.Duration;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java

import javax.annotation.Nonnull;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.azure.toolkit.lib.appservice.function.core.AzureFunctionsAnnotationConst...`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import java.util.stream.Collectors;

import static com.microsoft.azure.toolkit.lib.appservice.function.core.AzureFunctionsAnnotationConstants.ANONYMOUS;

public class AppServiceUtils {
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/AzureWebApp.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.appservice.model.OperatingSystem;
import com.microsoft.azure.toolkit.lib.appservice.model.Runtime;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.appservice.function.FunctionApp;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotModule.java`
#### Snippet
```java
import com.azure.resourcemanager.appservice.models.WebSiteBase;
import com.microsoft.azure.toolkit.lib.appservice.IDeploymentSlotModule;
import com.microsoft.azure.toolkit.lib.appservice.function.FunctionApp;
import com.microsoft.azure.toolkit.lib.appservice.function.FunctionAppDeploymentSlot;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.appservice.function.FunctionAppDeploymentSlot;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotModule.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.appservice.IDeploymentSlotModule;
import com.microsoft.azure.toolkit.lib.appservice.function.FunctionApp;
import com.microsoft.azure.toolkit.lib.appservice.function.FunctionAppDeploymentSlot;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotModule.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.appservice.function.FunctionApp;
import com.microsoft.azure.toolkit.lib.appservice.function.FunctionAppDeploymentSlot;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotModule.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotModule.java`
#### Snippet
```java
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource;`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.bundle.AzureString;
import com.microsoft.azure.toolkit.lib.common.exception.AzureToolkitRuntimeException;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.model.AzResource;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.exception.AzureToolkitRuntimeException;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.model.AzResource;
import com.microsoft.azure.toolkit.lib.common.model.AzResourceModule;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceGroupModule.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.model.Region;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/task/CreateResourceGroupTask.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.Azure;
import com.microsoft.azure.toolkit.lib.common.model.Region;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
import com.microsoft.azure.toolkit.lib.common.task.AzureTask;
import com.microsoft.azure.toolkit.lib.resource.AzureResources;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/VirtualMachineModule.java`
#### Snippet
```java
import com.azure.resourcemanager.compute.models.VirtualMachines;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
import com.microsoft.azure.toolkit.lib.compute.ComputeServiceSubscription;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/network/networksecuritygroup/NetworkSecurityGroupModule.java`
#### Snippet
```java
import com.azure.resourcemanager.network.models.NetworkSecurityGroups;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
import com.microsoft.azure.toolkit.lib.network.NetworkServiceSubscription;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/network/publicipaddress/PublicIpAddressModule.java`
#### Snippet
```java
import com.azure.resourcemanager.network.models.PublicIpAddresses;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
import com.microsoft.azure.toolkit.lib.network.NetworkServiceSubscription;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/network/virtualnetwork/NetworkModule.java`
#### Snippet
```java
import com.azure.resourcemanager.network.models.Networks;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
import com.microsoft.azure.toolkit.lib.network.NetworkServiceSubscription;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.model.Availability;`
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/environment/ContainerAppsEnvironmentDraft.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.messager.AzureMessager;
import com.microsoft.azure.toolkit.lib.common.messager.IAzureMessager;
import com.microsoft.azure.toolkit.lib.common.model.Availability;
import com.microsoft.azure.toolkit.lib.common.model.AzResource;
import com.microsoft.azure.toolkit.lib.common.model.Region;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.containerapps.containerapp.ContainerApp;`
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/environment/ContainerAppsEnvironmentDraft.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
import com.microsoft.azure.toolkit.lib.monitor.LogAnalyticsWorkspace;
import com.microsoft.azure.toolkit.lib.containerapps.containerapp.ContainerApp;
import com.microsoft.azure.toolkit.lib.resource.ResourceGroup;
import com.microsoft.azure.toolkit.lib.monitor.LogAnalyticsWorkspaceDraft;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/environment/ContainerAppsEnvironmentDraft.java`
#### Snippet
```java
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlDatabaseModule.java`
#### Snippet
```java
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class PostgreSqlDatabaseModule extends AbstractAzResourceModule<PostgreSqlDatabase, PostgreSqlServer, Database> {
```

### UNUSED_IMPORT
Unused import `import com.azure.resourcemanager.postgresqlflexibleserver.models.AuthConfig;`
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServerDraft.java`
#### Snippet
```java

import com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager;
import com.azure.resourcemanager.postgresqlflexibleserver.models.AuthConfig;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PasswordAuthEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Server;
```

### UNUSED_IMPORT
Unused import `import com.azure.resourcemanager.postgresqlflexibleserver.models.PasswordAuthEnum;`
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServerDraft.java`
#### Snippet
```java
import com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager;
import com.azure.resourcemanager.postgresqlflexibleserver.models.AuthConfig;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PasswordAuthEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Server;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerVersion;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-redis-lib/src/main/java/com/microsoft/azure/toolkit/redis/RedisCacheModule.java`
#### Snippet
```java
import com.azure.resourcemanager.redis.models.RedisCaches;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import com.azure.resourcemanager.appplatform.models.ProvisioningState;`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudCluster.java`
#### Snippet
```java
import com.azure.resourcemanager.appplatform.fluent.models.ServiceResourceInner;
import com.azure.resourcemanager.appplatform.models.ClusterResourceProperties;
import com.azure.resourcemanager.appplatform.models.ProvisioningState;
import com.azure.resourcemanager.appplatform.models.Sku;
import com.azure.resourcemanager.appplatform.models.SkuName;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentModule.java`
#### Snippet
```java
import com.azure.resourcemanager.appplatform.models.SpringAppDeployments;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import com.azure.data.tables.TableClient;`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/AzuriteStorageAccount.java`
#### Snippet
```java
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.util.paging.ContinuablePage;
import com.azure.data.tables.TableClient;
import com.azure.data.tables.TableClientBuilder;
import com.azure.data.tables.TableServiceClient;
```

### UNUSED_IMPORT
Unused import `import com.azure.data.tables.TableClientBuilder;`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/AzuriteStorageAccount.java`
#### Snippet
```java
import com.azure.core.util.paging.ContinuablePage;
import com.azure.data.tables.TableClient;
import com.azure.data.tables.TableClientBuilder;
import com.azure.data.tables.TableServiceClient;
import com.azure.data.tables.TableServiceClientBuilder;
```

### UNUSED_IMPORT
Unused import `import com.azure.storage.blob.BlobClient;`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/AzuriteStorageAccount.java`
#### Snippet
```java
import com.azure.data.tables.TableServiceClient;
import com.azure.data.tables.TableServiceClientBuilder;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobClientBuilder;
import com.azure.storage.blob.BlobServiceClient;
```

### UNUSED_IMPORT
Unused import `import com.azure.storage.blob.BlobClientBuilder;`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/AzuriteStorageAccount.java`
#### Snippet
```java
import com.azure.data.tables.TableServiceClientBuilder;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobClientBuilder;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
```

## RuleId[id=Lombok]
### Lombok
Class contains required fields, you have to force NoArgsConstructor.
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/Subscription.java`
#### Snippet
```java
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
```

### Lombok
Class contains required fields, you have to force NoArgsConstructor.
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/Region.java`
#### Snippet
```java
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/DeployToClusterMojo.java`
#### Snippet
```java
            Utils.connectToUnSecureCluster(logger, clusterEndpoint);
            Utils.executeCommand(logger, "sfctl mesh deployment create --input-yaml-files " + inputYamlFiles);
            TelemetryHelper.sendEvent(TelemetryEventType.DEPLOYLOCAL, String.format("Deployed " +
                "application locally"), logger);
        } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/DeployToClusterMojo.java`
#### Snippet
```java
            Utils.connectToSecureCluster(logger, clusterEndpoint, pemFilePath);
            Utils.executeCommand(logger, "sfctl mesh deployment create --input-yaml-files " + inputYamlFiles);
            TelemetryHelper.sendEvent(TelemetryEventType.DEPLOYSFRP, String.format("Deployed " +
                "application to SFRP"), logger);
        }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/DeployMojo.java`
#### Snippet
```java
            "--input-yaml-files %s  --parameters \"{'location': {'value': '%s'}}\"", resourceGroup,
            inputYamlFiles, location));
        TelemetryHelper.sendEvent(TelemetryEventType.DEPLOYMESH, String.format("Deployed application on mesh"), logger);
    }
}
```

### RedundantStringFormatCall
Redundant call to `format()`
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.error(e);
            throw new MojoFailureException(String.format("string to yaml conversion failed"));
        }
    }
```

## RuleId[id=RedundantUnmodifiable]
### RedundantUnmodifiable
Redundant usage of the 'unmodifiableSet' wrapper
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/model/PricingTier.java`
#### Snippet
```java
            STANDARD_S3, PREMIUM_P1, PREMIUM_P2, PREMIUM_P3, PREMIUM_P1V2, PREMIUM_P2V2, PREMIUM_P3V2, PREMIUM_P1V3, PREMIUM_P2V3, PREMIUM_P3V3,
            FREE_F1, SHARED_D1));
    public static final Set<PricingTier> WEB_APP_PRICING = Collections.unmodifiableSet(SHARED_PRICING);
    public static final Set<PricingTier> FUNCTION_PRICING = Collections.unmodifiableSet(SetUtils.union(SHARED_PRICING,
            Sets.newHashSet(CONSUMPTION, ELASTIC_PREMIUM_EP1, ELASTIC_PREMIUM_EP2, ELASTIC_PREMIUM_EP3)));
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java
    protected static void register(AzureActionManager manager) {
        if (instance != null) {
            AzureMessager.getDefaultMessager().warning("ActionManager is already registered", null);
            return;
        }
```

### NullArgumentToVariableArgMethod
Confusing argument `(String[]) args`, unclear if a varargs or non-varargs call is desired
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/validator/ValidationMessage.java`
#### Snippet
```java
        final String[] path = new String[]{validationMessage.getPath()};
        final String[] args = ArrayUtils.isEmpty(validationMessage.getArguments()) ? path : ArrayUtils.addAll(path, validationMessage.getArguments());
        return AzureString.format(validatorTypeCode.getMessageFormat().toPattern(), (String[]) args);
    }
}
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `direction` initializer `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/Binding.java`
#### Snippet
```java
    protected String type = null;

    protected BindingEnum.Direction direction = null;

    protected Map<String, Object> bindingAttributes = new HashMap<>();
```

### UnusedAssignment
Variable `bindingEnum` initializer `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/Binding.java`
#### Snippet
```java
public class Binding {

    protected BindingEnum bindingEnum = null;

    protected String type = null;
```

### UnusedAssignment
Variable `type` initializer `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/Binding.java`
#### Snippet
```java
    protected BindingEnum bindingEnum = null;

    protected String type = null;

    protected BindingEnum.Direction direction = null;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `OperatingSystem.DOCKER == runtime.os()` is always `true` when reached
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/CreateOrUpdateWebAppTask.java`
#### Snippet
```java
                runtime.webContainer(),
                runtime.javaVersion());
        } else if (runtime != null && OperatingSystem.DOCKER == runtime.os()) {
            return Runtime.getRuntime(OperatingSystem.DOCKER, WebContainer.JAVA_OFF, JavaVersion.OFF);
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'call(T)' as a member of raw type 'rx.functions.Action1'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/task/AzureRxTaskManager.java`
#### Snippet
```java
        RxJavaHooks.setOnObservableStart((observable, onStart) -> {
            final OperationThreadContext context = OperationThreadContext.current().derive();
            final Observable.OnSubscribe<?> withClosure = (subscriber) -> context.run(() -> onStart.call(subscriber));
            if (Objects.isNull(oldObservableStartHooks)) {
                return withClosure;
```

### UNCHECKED_WARNING
Unchecked call to 'call(T)' as a member of raw type 'rx.functions.Action1'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/task/AzureRxTaskManager.java`
#### Snippet
```java
        RxJavaHooks.setOnSingleStart((single, onStart) -> {
            final OperationThreadContext context = OperationThreadContext.current().derive();
            final Single.OnSubscribe<?> withClosure = (subscriber) -> context.run(() -> onStart.call(subscriber));
            if (Objects.isNull(oldSingleStartHooks)) {
                return withClosure;
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource,capture,capture\>' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzService.java`
#### Snippet
```java
                .map(m -> m.getOrInit(resourceTypeName.getRight(), resourceGroup)).orElse(null);
        }
        return (E) resource;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.common.model.AbstractAzResource,capture,capture\>' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzService.java`
#### Snippet
```java
                .map(m -> m.getOrTemp(resourceTypeName.getRight(), resourceGroup)).orElse(null);
        }
        return (E) resource;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/AzureOperationAspect.java`
#### Snippet
```java
        try {
            AzureOperationAspect.beforeEnter(operation, source);
            final T result = (T) body.call();
            AzureOperationAspect.afterReturning(operation, source);
            return result;
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.resource.ResourcesServiceSubscription' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
        final ResourcesServiceSubscription subscription = Objects.requireNonNull(this.get(resourceId.subscriptionId(), resourceGroup));
        if (type.equals("subscriptions")) {
            return (E) subscription;
        }
        final ResourceGroup group = subscription.resourceGroups().get(resourceGroup, resourceGroup);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.resource.ResourceGroup' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
        final ResourceGroup group = subscription.resourceGroups().get(resourceGroup, resourceGroup);
        if (type.equals(ResourceGroupModule.NAME)) {
            return (E) group;
        } else if (type.equals(ResourceDeploymentModule.NAME)) {
            return (E) group.deployments().getOrInit(resourceId.name(), resourceGroup);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.resource.ResourceDeployment' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
            return (E) group;
        } else if (type.equals(ResourceDeploymentModule.NAME)) {
            return (E) group.deployments().getOrInit(resourceId.name(), resourceGroup);
        } else {
            return (E) group.genericResources().getOrInit(id, resourceGroup);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.resource.GenericResource' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
            return (E) group.deployments().getOrInit(resourceId.name(), resourceGroup);
        } else {
            return (E) group.genericResources().getOrInit(id, resourceGroup);
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.resource.ResourcesServiceSubscription' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
        final ResourcesServiceSubscription subscription = Objects.requireNonNull(this.getOrDraft(resourceId.subscriptionId(), resourceGroup));
        if (type.equalsIgnoreCase("subscriptions")) {
            return (E) subscription;
        }
        final ResourceGroup group = subscription.resourceGroups().getOrDraft(resourceGroup, resourceGroup);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.resource.ResourceGroup' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
        final ResourceGroup group = subscription.resourceGroups().getOrDraft(resourceGroup, resourceGroup);
        if (type.equalsIgnoreCase(ResourceGroupModule.NAME)) {
            return (E) group;
        } else if (type.equalsIgnoreCase(ResourceDeploymentModule.NAME)) {
            return (E) group.deployments().getOrDraft(resourceId.name(), resourceGroup);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.resource.ResourceDeployment' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
            return (E) group;
        } else if (type.equalsIgnoreCase(ResourceDeploymentModule.NAME)) {
            return (E) group.deployments().getOrDraft(resourceId.name(), resourceGroup);
        } else {
            return (E) group.genericResources().get(id, resourceGroup);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.resource.GenericResource' to 'E'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
            return (E) group.deployments().getOrDraft(resourceId.name(), resourceGroup);
        } else {
            return (E) group.genericResources().get(id, resourceGroup);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'convert(T)' as a member of raw type 'com.microsoft.azure.toolkit.lib.common.telemetry.AzureTelemetry.Properties.Converter'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/telemetry/AzureTelemeter.java`
#### Snippet
```java
                .map(Properties::value)
                .map(AzureTelemeter::instantiate)
                .map(converter -> converter.convert(value))
                .ifPresent(properties::putAll);
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeployment.java`
#### Snippet
```java
    @Nonnull
    public List<String> getResources() {
        return this.remoteOptional().map(r -> ((Map<String, Object>) r.exportTemplate().template()))
            .map(t -> ((List<Map<String, String>>) t.get("resources")))
            .map(Collection::stream).orElseGet(Stream::empty).map(r -> String.format("%s(%s)", r.get("name"), r.get("type")))
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeployment.java`
#### Snippet
```java
    public List<String> getResources() {
        return this.remoteOptional().map(r -> ((Map<String, Object>) r.exportTemplate().template()))
            .map(t -> ((List<Map<String, String>>) t.get("resources")))
            .map(Collection::stream).orElseGet(Stream::empty).map(r -> String.format("%s(%s)", r.get("name"), r.get("type")))
            .collect(Collectors.toList());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeployment.java`
#### Snippet
```java
    @Nonnull
    public List<String> getParameters() {
        return this.remoteOptional().map(r -> ((Map<String, Object>) r.exportTemplate().template()))
            .map(t -> ((Map<String, Map<String, String>>) t.get("parameters")))
            .map(m -> m.entrySet().stream()).orElseGet(Stream::empty)
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map\>'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeployment.java`
#### Snippet
```java
    public List<String> getParameters() {
        return this.remoteOptional().map(r -> ((Map<String, Object>) r.exportTemplate().template()))
            .map(t -> ((Map<String, Map<String, String>>) t.get("parameters")))
            .map(m -> m.entrySet().stream()).orElseGet(Stream::empty)
            .map(p -> String.format("%s(%s)", p.getKey(), p.getValue().get("type")))
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeployment.java`
#### Snippet
```java
    @Nonnull
    public List<String> getVariables() {
        return this.remoteOptional().map(r -> ((Map<String, Object>) r.exportTemplate().template()))
            .map(t -> ((Map<String, Map<String, String>>) t.get("variables")))
            .map(m -> m.keySet().stream()).orElseGet(Stream::empty)
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map\>'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeployment.java`
#### Snippet
```java
    public List<String> getVariables() {
        return this.remoteOptional().map(r -> ((Map<String, Object>) r.exportTemplate().template()))
            .map(t -> ((Map<String, Map<String, String>>) t.get("variables")))
            .map(m -> m.keySet().stream()).orElseGet(Stream::empty)
            .collect(Collectors.toList());
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.azure.toolkit.lib.storage.AzuriteStorageAccount' to 'E'
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/AzureStorageAccount.java`
#### Snippet
```java
    public <E> E getById(@NotNull String id) {
        if (StringUtils.equalsIgnoreCase(id, AzuriteStorageAccount.AZURITE_RESOURCE_ID)) {
            return (E) AzuriteStorageAccount.AZURITE_STORAGE_ACCOUNT;
        }
        return super.getById(id);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/TemplateResources.java`
#### Snippet
```java
            final String resourceJsonStr = IOUtils.toString(is, "utf8");
            final JsonNode node = mapper.readTree(resourceJsonStr);
            map = mapper.convertValue(node.get("en"), Map.class);
        } catch (Exception e) {
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'java.util.Map'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
                Optional.ofNullable(bindingListObject instanceof List<?> ? (List<?>) bindingListObject : null)
                        .map(list -> list.stream().filter(item -> item instanceof Map)
                                .map(map -> fromJsonBinding((Map<String, String>) map))
                                .collect(Collectors.toList()))
                        .orElse(Collections.emptyList());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandlerImpl.java`
#### Snippet
```java
            final Class<?> functionNameAnnotation = ClassUtils.getClass(classLoader, FUNCTION_NAME);
            final ConfigurationBuilder builder = new ConfigurationBuilder().addUrls(urls).setScanners(Scanners.MethodsAnnotated).addClassLoaders(classLoader);
            return new Reflections(builder).getMethodsAnnotatedWith((Class<? extends Annotation>) functionNameAnnotation);
        } catch (ClassNotFoundException e) {
            throw new AzureToolkitRuntimeException(e);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/impl/DefaultFunctionProject.java`
#### Snippet
```java
            final Class<?> functionNameAnnotation = ClassUtils.getClass(classLoader, FUNCTION_NAME);
            final ConfigurationBuilder builder = new ConfigurationBuilder().addUrls(urls).setScanners(Scanners.MethodsAnnotated).addClassLoaders(classLoader);
            return new Reflections(builder).getMethodsAnnotatedWith((Class<? extends Annotation>) functionNameAnnotation);
        } catch (ClassNotFoundException e) {
            throw new AzureToolkitRuntimeException(e);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java
        final Map<String, Object> hostJson = readHostJson(project);
        final String extensionBundleId = Optional.ofNullable(hostJson)
            .map(host -> ((Map<String, Object>) host.get(EXTENSION_BUNDLE)))
            .map(extensionBundle -> ((String) extensionBundle.get("id")))
            .orElse(null);
```

### UNCHECKED_WARNING
Unchecked call to 'getDeclaredConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/SystemPropertyUtils.java`
#### Snippet
```java
            if (result == null) {
                try {
                    result = cls.getDeclaredConstructor().newInstance();
                } catch (InstantiationException | InvocationTargetException | NoSuchMethodException e) {
                    throw new AzureException(String.format("Class %s should have a default constructor for inject properties", cls.getName()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/SchemaValidator.java`
#### Snippet
```java

        schemas.put(combineToKey(resource, property), schema);
        schemaMap.put(combineToKey(resource, property), mapper.treeToValue(schema, Map.class));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/ConfigParser.java`
#### Snippet
```java
                .region(getParsedRegion())
                .runtime(getRuntimeConfig())
                .appSettings(mojo.getAppSettings());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
                .name(getDeploymentSlotName())
                .configurationSource(getDeploymentSlotConfigurationSource())
                .appSettings(mojo.getAppSettings())
                .build();
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
                .region(getRegion())
                .runtime(getRuntimeConfig())
                .appSettings(mojo.getAppSettings());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
            final Map params = prepareRequiredParameters(template, bindingTemplate);

            final String newFunctionClass = substituteParametersInTemplate(template, params);

            saveNewFunctionToFile(newFunctionClass);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java

            for (final Object rule : rules) {
                final Map<String, Object> map = (Map<String, Object>) rule;
                templates.put((String) map.get("id"), map);
                if (map.containsKey("resource")) {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/model/SpotConfig.java`
#### Snippet
```java
    public enum EvictionPolicy {
        StopAndDeallocate,
        Delete;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/model/SpotConfig.java`
#### Snippet
```java
    public enum EvictionType {
        CapacityOnly,
        PriceOrCapacity;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/SystemPropertyUtils.java`
#### Snippet
```java
                        final String objValue = (String) FieldUtils.readField(result, field.getName(), true);
                        if (StringUtils.isBlank(objValue)) {
                            FieldUtils.writeField(result, field.getName(), propertyValue, true);;
                        }
                    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java

    enum ResourceType {
        application, volume, network;
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `this.getParent().getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlDatabase.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.mysql(this.getParent().getFullyQualifiedDomainName(), this.getName());
    }
}
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServer.java`
#### Snippet
```java
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection(JdbcUrl.mysql(this.getFullyQualifiedDomainName()).toString(), username, null);
        } catch (SQLException e) {
            String ip = NetUtils.parseIpAddressFromMessage(e.getMessage());
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServer.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.mysql(this.getFullyQualifiedDomainName());
    }

```

### DataFlowIssue
Argument `remote` might be null
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServerDraft.java`
#### Snippet
```java
        final Server remote = this.doModify(() -> create.create(), Status.CREATING);
        messager.success(AzureString.format("MySQL server({0}) is successfully created.", this.getName()));
        return this.updateResourceInAzure(remote);
    }

```

### DataFlowIssue
Expression `this.validateValueAsync().block()` might evaluate to null but is returned by the method declared as @Nonnull
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java
    @Nonnull
    default AzureValidationInfo validateValue() {
        return this.validateValueAsync().block();
    }

```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/AzureMessager.java`
#### Snippet
```java
    @Nonnull
    public static IAzureMessager getMessager() {
        return Optional.ofNullable(OperationContext.current()).map(OperationContext::getMessager)
            .orElseGet(AzureMessager::getDefaultMessager);
    }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationContext.java`
#### Snippet
```java
@Slf4j
public class OperationContext {
    private static final OperationContext NULL = new OperationContext(null);
    @Nullable
    private final Operation operation;
```

### DataFlowIssue
Argument `this.getRemote()` might be null
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java

    public void reloadStatus() {
        this.setStatus(this.loadStatus(this.getRemote()));
    }

```

### DataFlowIssue
Method invocation `deployments` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
            return (E) group;
        } else if (type.equals(ResourceDeploymentModule.NAME)) {
            return (E) group.deployments().getOrInit(resourceId.name(), resourceGroup);
        } else {
            return (E) group.genericResources().getOrInit(id, resourceGroup);
```

### DataFlowIssue
Method invocation `genericResources` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/AzureResources.java`
#### Snippet
```java
            return (E) group.deployments().getOrInit(resourceId.name(), resourceGroup);
        } else {
            return (E) group.genericResources().getOrInit(id, resourceGroup);
        }
    }
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentDraft.java`
#### Snippet
```java
        final Deployment.DefinitionStages.WithTemplate withTemplate = group.exists() ?
            define.withExistingResourceGroup(group.getName()) :
            define.withNewResourceGroup(group.getName(), com.azure.core.management.Region.fromName(group.getRegion().getName()));
        final Deployment.DefinitionStages.WithCreate definition = withTemplate
            .withTemplate(template)
```

### DataFlowIssue
Argument `mongo.getPassword()` might be null
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/model/MongoDatabaseAccountConnectionString.java`
#### Snippet
```java
        result.setPort(CollectionUtils.isEmpty(mongo.getHosts()) ? null : Integer.valueOf(StringUtils.substringAfter(mongo.getHosts().get(0), ":")));
        result.setUsername(mongo.getUsername());
        result.setPassword(String.valueOf(mongo.getPassword()));
        result.setSslEnabled(mongo.getSslEnabled());
        result.setConnectionString(connectionString);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoDocument.java`
#### Snippet
```java
        final String sharedKey = getParent().getSharedKey();
        final ObjectNode document = getDocument();
        return ObjectUtils.allNotNull(sharedKey, document) ? document.get(sharedKey).asText() : null;
    }

```

### DataFlowIssue
Argument `mongoConnectionString.getConnectionString()` might be null
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoCosmosDBAccount.java`
#### Snippet
```java
        try {
            final MongoDatabaseAccountConnectionString mongoConnectionString = Objects.requireNonNull(this.getMongoConnectionString());
            return new MongoClient(new MongoClientURI(mongoConnectionString.getConnectionString()));
        } catch (Throwable e) {
            // swallow exception to load data client
```

### DataFlowIssue
Argument `connectionString.getHost()` might be null
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraTableDraft.java`
#### Snippet
```java
                .withConfigLoader(configLoader)
                .withSslContext(sc)
                .addContactPoint(new InetSocketAddress(connectionString.getHost(), connectionString.getPort()))
                .withAuthCredentials(connectionString.getUsername(), connectionString.getPassword()).build();
    }
```

### DataFlowIssue
Unboxing of `connectionString.getPort()` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraTableDraft.java`
#### Snippet
```java
                .withConfigLoader(configLoader)
                .withSslContext(sc)
                .addContactPoint(new InetSocketAddress(connectionString.getHost(), connectionString.getPort()))
                .withAuthCredentials(connectionString.getUsername(), connectionString.getPassword()).build();
    }
```

### DataFlowIssue
Argument `connectionString.getUsername()` might be null
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraTableDraft.java`
#### Snippet
```java
                .withSslContext(sc)
                .addContactPoint(new InetSocketAddress(connectionString.getHost(), connectionString.getPort()))
                .withAuthCredentials(connectionString.getUsername(), connectionString.getPassword()).build();
    }

```

### DataFlowIssue
Argument `connectionString.getPassword()` might be null
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraTableDraft.java`
#### Snippet
```java
                .withSslContext(sc)
                .addContactPoint(new InetSocketAddress(connectionString.getHost(), connectionString.getPort()))
                .withAuthCredentials(connectionString.getUsername(), connectionString.getPassword()).build();
    }

```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-monitor-lib/src/main/java/com/microsoft/azure/toolkit/lib/monitor/LogAnalyticsWorkspaceDraft.java`
#### Snippet
```java
        messager.info(AzureString.format(START_CREATING_LOG_ANALYTICS_WORKSPACE, getName()));
        final Workspace workspace = manager.workspaces().define(getName())
                .withRegion(region.getName())
                .withExistingResourceGroup(getResourceGroupName())
                .create();
```

### DataFlowIssue
Method invocation `getRegion` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-monitor-lib/src/main/java/com/microsoft/azure/toolkit/lib/monitor/LogAnalyticsWorkspaceDraft.java`
#### Snippet
```java
    @Override
    public boolean isModified() {
        return this.region != null && !Objects.equals(this.region, this.origin.getRegion());
    }

```

### DataFlowIssue
Argument `this.getParent().getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlDatabase.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.postgre(this.getParent().getFullyQualifiedDomainName(), this.getName());
    }
}
```

### DataFlowIssue
Method invocation `getOperatingSystem` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/VirtualMachineDraft.java`
#### Snippet
```java
        final String sshKey = this.getSshKey();

        if (image.getOperatingSystem() == OperatingSystem.Windows) {
            return withCreate.withSpecificWindowsImageVersion(image.getImageReference())
                .withAdminUsername(userName).withAdminPassword(password).withSize(size.getName());
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/VirtualMachineDraft.java`
#### Snippet
```java
        if (image.getOperatingSystem() == OperatingSystem.Windows) {
            return withCreate.withSpecificWindowsImageVersion(image.getImageReference())
                .withAdminUsername(userName).withAdminPassword(password).withSize(size.getName());
        } else {
            final DefinitionStages.WithLinuxRootPasswordOrPublicKeyManagedOrUnmanaged withLinuxImage =
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/VirtualMachineDraft.java`
#### Snippet
```java
            final DefinitionStages.WithLinuxCreateManagedOrUnmanaged withLinuxAuthentication = authenticationType == AuthenticationType.Password ?
                withLinuxImage.withRootPassword(password) : withLinuxImage.withSsh(sshKey);
            return withLinuxAuthentication.withSize(size.getName());
        }
    }
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServer.java`
#### Snippet
```java
        try {
            Class.forName("org.postgresql.Driver");
            DriverManager.getConnection(JdbcUrl.postgre(this.getFullyQualifiedDomainName(), "postgres").toString(), username, null);
        } catch (SQLException e) {
            String ip = NetUtils.parseIpAddressFromMessage(e.getMessage());
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServer.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.postgre(this.getFullyQualifiedDomainName(), "postgres");
    }

```

### DataFlowIssue
Argument `remote` might be null
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServerDraft.java`
#### Snippet
```java
        final Server remote = this.doModify(() -> create.create(), Status.CREATING);
        messager.success(AzureString.format("PostgreSQL flexible server({0}) is successfully created.", this.getName()));
        return this.updateResourceInAzure(remote);
    }

```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/StorageAccountDraft.java`
#### Snippet
```java
        com.azure.resourcemanager.storage.models.StorageAccount.DefinitionStages.WithCreate withCreate =
            manager.storageAccounts().define(name)
                .withRegion(this.getRegion().getName())
                .withExistingResourceGroup(this.getResourceGroupName())
                .withSku(StorageAccountSkuType.fromSkuName(SkuName.fromString(this.getRedundancy().getName())));
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/StorageAccountDraft.java`
#### Snippet
```java
                .withRegion(this.getRegion().getName())
                .withExistingResourceGroup(this.getResourceGroupName())
                .withSku(StorageAccountSkuType.fromSkuName(SkuName.fromString(this.getRedundancy().getName())));
        final Kind kind = this.getKind();
        if (Objects.equals(Kind.STORAGE, kind)) {
```

### DataFlowIssue
Method invocation `createQueue` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/queue/QueueDraft.java`
#### Snippet
```java
        final IAzureMessager messager = AzureMessager.getMessager();
        messager.info(AzureString.format("Start creating Queue ({0}).", this.getName()));
        final QueueClient queue = client.createQueue(this.getName());
        messager.success(AzureString.format("Queue ({0}) is successfully created.", this.getName()));
        return queue;
```

### DataFlowIssue
Method invocation `createTable` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/table/TableDraft.java`
#### Snippet
```java
        final IAzureMessager messager = AzureMessager.getMessager();
        messager.info(AzureString.format("Start creating Table ({0}).", this.getName()));
        final TableClient table = client.createTable(this.getName());
        messager.success(AzureString.format("Table ({0}) is successfully created.", this.getName()));
        return table;
```

### DataFlowIssue
Method invocation `namespaceAuthorizationRules` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-eventhubs-lib/src/main/java/com/microsoft/azure/toolkit/lib/eventhubs/EventHubsNamespace.java`
#### Snippet
```java
        final EventHubsManager manager = getParent().getRemote();
        final String accessRightsStr = StringUtils.join(accessRights, "-");
        final EventHubNamespaceAuthorizationRule.DefinitionStages.WithAccessPolicy policy = manager.namespaceAuthorizationRules()
                .define(String.format("policy-%s-AzureToolkitForIntelliJ-%s", accessRightsStr, Utils.getTimestamp()))
                .withExistingNamespace(getResourceGroupName(), getName());
```

### DataFlowIssue
Argument `this.getParent().getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-sqlserver-lib/src/main/java/com/microsoft/azure/toolkit/lib/sqlserver/MicrosoftSqlDatabase.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.sqlserver(this.getParent().getFullyQualifiedDomainName(), this.getName());
    }
}
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-sqlserver-lib/src/main/java/com/microsoft/azure/toolkit/lib/sqlserver/MicrosoftSqlServer.java`
#### Snippet
```java
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            DriverManager.getConnection(JdbcUrl.sqlserver(this.getFullyQualifiedDomainName()).toString(), username, null);
        } catch (SQLException e) {
            ip = StringUtils.trim(NetUtils.parseIpAddressFromMessage(e.getMessage()));
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-sqlserver-lib/src/main/java/com/microsoft/azure/toolkit/lib/sqlserver/MicrosoftSqlServer.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.sqlserver(this.getFullyQualifiedDomainName());
    }

```

### DataFlowIssue
Method invocation `info` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-eventhubs-lib/src/main/java/com/microsoft/azure/toolkit/lib/eventhubs/EventHubsInstance.java`
#### Snippet
```java
        messager = AzureMessager.getMessager();
        messager.info(AzureString.format("Start listening to event hub ({0}) for consumerGroup ({1})...\n", getName(), consumerGroupName));
        messager.info("You can change default consumer group in Azure Settings\n");
        remoteOptional().ifPresent(remote -> remote.partitionIds().forEach(partitionId -> {
            this.consumerAsyncClient = new EventHubClientBuilder()
```

### DataFlowIssue
Argument `template.getBindingConfiguration()` might be null
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/utils/FunctionUtils.java`
#### Snippet
```java
                    .map(FunctionTemplates::getTemplates).orElse(Collections.emptyList());
            result.forEach(template -> Optional.ofNullable(bindings).map(binding ->
                    binding.getBindingTemplate(template.getBindingConfiguration())).ifPresent(template::setBinding));
            return result;
        } catch (Exception e) {
```

### DataFlowIssue
Argument `is` might be null
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/TemplateResources.java`
#### Snippet
```java
        try (final InputStream is = TemplateResources.class.getResourceAsStream("/resources.json")) {
            final ObjectMapper mapper = new ObjectMapper();
            final String resourceJsonStr = IOUtils.toString(is, "utf8");
            final JsonNode node = mapper.readTree(resourceJsonStr);
            map = mapper.convertValue(node.get("en"), Map.class);
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AppServiceKuduClient.java`
#### Snippet
```java

    public List<ProcessInfo> listProcess() {
        return this.kuduService.listProcess(host).block().getValue();
    }

```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AppServiceKuduClient.java`
#### Snippet
```java

    public TunnelStatus getAppServiceTunnelStatus() {
        return this.kuduService.getAppServiceTunnelStatus(host).block().getValue();
    }

```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AppServiceKuduClient.java`
#### Snippet
```java
        // this file is generated by kudu itself, should not be visible to user.
        final String fixedDir = StringUtils.removeStart(dir, HOME_PREFIX);
        return this.kuduService.getFilesInDirectory(host, fixedDir).block().getValue().stream()
                .filter(file -> !"text/xml".equals(file.getMime()) || !file.getName().contains("LogFiles-kudu-trace_pending.xml"))
                .map(file -> file.withApp(app).withPath(Paths.get(fixedDir, file.getName()).toString()))
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AppServiceKuduClient.java`
#### Snippet
```java
    public CommandOutput execute(final String command, final String dir) {
        final CommandRequest commandRequest = CommandRequest.builder().command(command).dir(dir).build();
        return kuduService.execute(host, JsonUtils.toJson(commandRequest)).block().getValue();
    }

```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AzureFunctionsAdminClient.java`
#### Snippet
```java
    public List<? extends AppServiceFile> getFilesInDirectory(String dir) {
        // this file is generated by kudu itself, should not be visible to user.
        return this.functionsService.getFilesInDirectory(host, getFixedPath(dir)).block().getValue().stream()
                .filter(file -> !"text/xml".equals(file.getMime()) || !file.getName().contains("LogFiles-kudu-trace_pending.xml"))
                .map(file -> file.withApp(app).withPath(Paths.get(dir, file.getName()).toString()))
```

### DataFlowIssue
Method invocation `getOperatingSystem` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AzureFunctionsAdminClient.java`
#### Snippet
```java

    private String getFixedPath(String originPath) {
        return app.getRuntime().getOperatingSystem() == OperatingSystem.WINDOWS || StringUtils.startsWithIgnoreCase(originPath, LINUX_ROOT) ?
                originPath : Paths.get(LINUX_ROOT, originPath).toString();
    }
```

### DataFlowIssue
Method invocation `isDocker` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
    @AzureOperation(name = "internal/webapp.deploy_app.app", params = {"this.webApp.getName()"})
    public WebAppBase<?, ?, ?> doExecute() {
        if (webApp.getRuntime().isDocker()) {
            this.messager.info(AzureString.format(SKIP_DEPLOYMENT_FOR_DOCKER_APP_SERVICE, "https://" + webApp.getHostName()));
            return webApp;
```

### DataFlowIssue
Method invocation `isWindows` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
            return false;
        }
        if (BooleanUtils.isTrue(this.waitDeploymentComplete) && webApp.getRuntime().isWindows()) {
            messager.warning("`waitDeploymentComplete` is not supported in Windows runtime, skip waiting for deployment status.");
            return false;
```

### DataFlowIssue
Method invocation `isLinux` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
            return false;
        }
        return Optional.ofNullable(this.waitDeploymentComplete).orElse(webApp.getRuntime().isLinux());
    }

```

### DataFlowIssue
Method invocation `getStatus` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
                .takeUntil(csmDeploymentStatus -> !csmDeploymentStatus.getStatus().isRunning())
                .blockLast();
        final DeploymentBuildStatus buildStatus = status.getStatus();
        if (buildStatus.isSucceed()) {
            return true;
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceConfigUtils.java`
#### Snippet
```java
            final Map<String, String> settings = app.getAppSettings();

            final String imageSetting = settings.get(SETTING_DOCKER_IMAGE);
            if (StringUtils.isNotBlank(imageSetting)) {
                runtimeConfig.image(imageSetting);
```

### DataFlowIssue
Argument `app.getLinuxFxVersion()` might be null
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceConfigUtils.java`
#### Snippet
```java
                runtimeConfig.image(imageSetting);
            } else {
                runtimeConfig.image(Utils.getDockerImageNameFromLinuxFxVersion(app.getLinuxFxVersion()));
            }
            final String registryServerSetting = settings.get(SETTING_REGISTRY_SERVER);
```

### DataFlowIssue
Method invocation `getOperatingSystem` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceConfigUtils.java`
#### Snippet
```java
            }
        } else {
            runtimeConfig.os(runtime.getOperatingSystem());
            runtimeConfig.webContainer(runtime.getWebContainer());
            runtimeConfig.javaVersion(runtime.getJavaVersion());
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppBase.java`
#### Snippet
```java
                    deployOptions == null ? null : AppServiceUtils.toDeployOptions(deployOptions);
            AzureMessager.getMessager().info(AzureString.format("Deploying (%s)[%s] %s ...", targetFile.toString(),
                    (deployType.toString()), StringUtils.isBlank(deployOptions.getPath()) ? "" : (" to " + (deployOptions.getPath()))));
            final com.azure.resourcemanager.appservice.models.DeployType type =
                    com.azure.resourcemanager.appservice.models.DeployType.fromString(deployType.getValue());
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppBase.java`
#### Snippet
```java
                    deployOptions == null ? null : AppServiceUtils.toDeployOptions(deployOptions);
            AzureMessager.getMessager().info(AzureString.format("Deploying (%s)[%s] %s ...", targetFile.toString(),
                    (deployType.toString()), StringUtils.isBlank(deployOptions.getPath()) ? "" : (" to " + (deployOptions.getPath()))));
            final com.azure.resourcemanager.appservice.models.DeployType type =
                    com.azure.resourcemanager.appservice.models.DeployType.fromString(deployType.getValue());
```

### DataFlowIssue
Method invocation `manager` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
    public String getMasterKey() {
        final String name = String.format("%s/slots/%s", getParent().getName(), this.getName());
        return getFullRemote().manager().serviceClient().getWebApps().listHostKeysAsync(this.getResourceGroupName(), name).map(HostKeysInner::masterKey).block();
    }

```

### DataFlowIssue
Method invocation `getOrDefault` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
    public void enableRemoteDebug() {
        final Map<String, String> appSettings = this.getAppSettings();
        final String debugPort = appSettings.getOrDefault(HTTP_PLATFORM_DEBUG_PORT, getRemoteDebugPort());
        doModify(() -> getFullRemote().update()
                .withWebSocketsEnabled(true)
```

### DataFlowIssue
Method invocation `update` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
        final Map<String, String> appSettings = this.getAppSettings();
        final String debugPort = appSettings.getOrDefault(HTTP_PLATFORM_DEBUG_PORT, getRemoteDebugPort());
        doModify(() -> getFullRemote().update()
                .withWebSocketsEnabled(true)
                .withPlatformArchitecture(PlatformArchitecture.X64)
```

### DataFlowIssue
Argument `appSettings` might be null
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
    public void disableRemoteDebug() {
        final Map<String, String> appSettings = this.getAppSettings();
        final String javaOpts = this.getJavaOptsWithRemoteDebugDisabled(appSettings);
        doModify(() -> {
            if (StringUtils.isEmpty(javaOpts)) {
```

### DataFlowIssue
Method invocation `update` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
        doModify(() -> {
            if (StringUtils.isEmpty(javaOpts)) {
                getFullRemote().update().withoutAppSetting(HTTP_PLATFORM_DEBUG_PORT).withoutAppSetting(JAVA_OPTS).apply();
            } else {
                getFullRemote().update().withoutAppSetting(HTTP_PLATFORM_DEBUG_PORT).withAppSetting(JAVA_OPTS, javaOpts).apply();
```

### DataFlowIssue
Method invocation `update` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
                getFullRemote().update().withoutAppSetting(HTTP_PLATFORM_DEBUG_PORT).withoutAppSetting(JAVA_OPTS).apply();
            } else {
                getFullRemote().update().withoutAppSetting(HTTP_PLATFORM_DEBUG_PORT).withAppSetting(JAVA_OPTS, javaOpts).apply();
            }
        }, Status.UPDATING);
```

### DataFlowIssue
Method invocation `keySet` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
    protected String getRemoteDebugPort() {
        final List<FunctionAppDeploymentSlot> list = getParent().slots().list();
        final List<Integer> collect = list.stream().filter(slot -> slot.getAppSettings().keySet().contains(HTTP_PLATFORM_DEBUG_PORT))
                .map(slot -> slot.getAppSettings().get(HTTP_PLATFORM_DEBUG_PORT))
                .map(portValue -> NumberUtils.toInt(portValue))
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotDraft.java`
#### Snippet
```java
            final DeploymentSlotBase.Update<DeploymentSlot> update = remote.update();
            Optional.ofNullable(settingsToAdd).ifPresent(update::withAppSettings);
            Optional.ofNullable(settingsToRemove).ifPresent(s -> s.forEach(update::withoutAppSetting));
            Optional.ofNullable(newRuntime).ifPresent(r -> updateRuntime(update, r));
            Optional.ofNullable(newDockerConfig)
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
            final DeploymentSlotBase.Update<FunctionDeploymentSlot> update = remote.update();
            Optional.ofNullable(settingsToAdd).ifPresent(update::withAppSettings);
            Optional.ofNullable(settingsToRemove).ifPresent(s -> s.forEach(update::withoutAppSetting));
            Optional.ofNullable(newRuntime).ifPresent(r -> updateRuntime(update, r));
            Optional.ofNullable(newDockerConfig)
```

### DataFlowIssue
Method invocation `serviceClient` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-servicebus-lib/src/main/java/com/microsoft/azure/toolkit/lib/servicebus/ServiceBusNamespace.java`
#### Snippet
```java
        final String accessRightsStr = StringUtils.join(accessRights, "-");
        final String authorizationRuleName = String.format("policy-%s-AzureToolkitForIntelliJ-%s", accessRightsStr, Utils.getTimestamp());
        manager.serviceClient().getNamespaces().createOrUpdateAuthorizationRule(getResourceGroupName(),
                getName(), authorizationRuleName, new SBAuthorizationRuleInner().withRights(accessRights));
        return manager.serviceClient().getNamespaces().listKeys(getResourceGroupName(),
```

### DataFlowIssue
Argument `this.getParent().getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlDatabase.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.mysql(this.getParent().getFullyQualifiedDomainName(), this.getName());
    }
}
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlServer.java`
#### Snippet
```java
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection(JdbcUrl.mysql(this.getFullyQualifiedDomainName()).toString(), username, null);
        } catch (SQLException e) {
            String ip = NetUtils.parseIpAddressFromMessage(e.getMessage());
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlServer.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.mysql(this.getFullyQualifiedDomainName());
    }

```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlServerDraft.java`
#### Snippet
```java
            .withVersion(validateServerVersion(this.getVersion()));
        final List<PerformanceTierProperties> tiers = manager.locationBasedPerformanceTiers()
            .list(this.getRegion().getName()).stream().collect(Collectors.toList());
        final PerformanceTierProperties tier = tiers.stream().filter(e -> CollectionUtils.isNotEmpty(e.serviceLevelObjectives()))
            .min(Comparator.comparingInt(this::getTierPriority))
```

### DataFlowIssue
Argument `remote` might be null
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlServerDraft.java`
#### Snippet
```java
        final Server remote = this.doModify(() -> create.create(), Status.CREATING);
        messager.success(AzureString.format("MySQL server({0}) is successfully created.", this.getName()));
        return this.updateResourceInAzure(remote);
    }

```

### DataFlowIssue
`null` is returned by the method declared as @Nonnull
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/RevisionDraft.java`
#### Snippet
```java
    @Override
    public com.azure.resourcemanager.appcontainers.models.Revision updateResourceInAzure(@Nonnull com.azure.resourcemanager.appcontainers.models.Revision origin) {
        return null;
    }

```

### DataFlowIssue
`null` is returned by the method declared as @Nonnull
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/RevisionDraft.java`
#### Snippet
```java
    @Override
    public com.azure.resourcemanager.appcontainers.models.Revision createResourceInAzure() {
        return null;
    }

```

### DataFlowIssue
Method invocation `getRevision` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/RevisionModule.java`
#### Snippet
```java
    protected com.azure.resourcemanager.appcontainers.models.Revision loadResourceFromAzure(@Nonnull String name, @Nullable String resourceGroup) {
        final ContainerApp parent = this.getParent();
        return getClient().getRevision(parent.getResourceGroupName(), parent.getName(), name);
    }

```

### DataFlowIssue
Argument `this.getParent().getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-postgre-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/single/PostgreSqlDatabase.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.postgre(this.getParent().getFullyQualifiedDomainName(), this.getName());
    }
}
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-postgre-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/single/PostgreSqlServer.java`
#### Snippet
```java
        try {
            Class.forName("org.postgresql.Driver");
            DriverManager.getConnection(JdbcUrl.postgre(this.getFullyQualifiedDomainName(), "postgres").toString(), username, null);
        } catch (SQLException e) {
            String ip = NetUtils.parseIpAddressFromMessage(e.getMessage());
```

### DataFlowIssue
Argument `this.getFullyQualifiedDomainName()` might be null
in `azure-toolkit-libs/azure-toolkit-postgre-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/single/PostgreSqlServer.java`
#### Snippet
```java
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.postgre(this.getFullyQualifiedDomainName(), "postgres");
    }

```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-postgre-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/single/PostgreSqlServerDraft.java`
#### Snippet
```java
            .withVersion(validateServerVersion(this.getVersion()));
        final List<PerformanceTierProperties> tiers = manager.locationBasedPerformanceTiers()
            .list(this.getRegion().getName()).stream().collect(Collectors.toList());
        final PerformanceTierProperties tier = tiers.stream().filter(e -> CollectionUtils.isNotEmpty(e.serviceLevelObjectives()))
            .min(Comparator.comparingInt(this::getTierPriority))
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-containerregistry-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerregistry/ContainerRegistryDraft.java`
#### Snippet
```java
        final Registries registries = Objects.requireNonNull(this.getParent().getAzureContainerRegistryModule().getClient());
        final Registry.DefinitionStages.WithSku withSku = registries.define(this.getName())
                .withRegion(region.getName())
                .withExistingResourceGroup(this.getResourceGroupName());
        final Registry.DefinitionStages.WithCreate withCreate;
```

### DataFlowIssue
Method invocation `getAbbreviation` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-applicationinsights-lib/src/main/java/com/microsoft/azure/toolkit/lib/applicationinsights/ApplicationInsightDraft.java`
#### Snippet
```java
        String workspaceResourceId;
        if (this.workspaceConfig.isNewCreate()) {
            final String resourceGroupName = String.format("DefaultResourceGroup-%s", region.getAbbreviation());
            final ResourceGroup resourceGroup =
                    Azure.az(AzureResources.class).groups(getSubscriptionId()).getOrDraft(resourceGroupName, resourceGroupName);
```

### DataFlowIssue
Method invocation `getRegion` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-applicationinsights-lib/src/main/java/com/microsoft/azure/toolkit/lib/applicationinsights/ApplicationInsightDraft.java`
#### Snippet
```java
    @Override
    public boolean isModified() {
        return this.region != null && !Objects.equals(this.region, this.origin.getRegion());
    }

```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-applicationinsights-lib/src/main/java/com/microsoft/azure/toolkit/lib/applicationinsights/ApplicationInsightDraft.java`
#### Snippet
```java
        messager.info(AzureString.format(START_CREATING_APPLICATION_INSIGHT, getName()));
        final ApplicationInsightsComponent result = applicationInsightsManager.components().define(getName())
            .withRegion(region.getName())
            .withExistingResourceGroup(getResourceGroupName())
            .withKind("web")
```

### DataFlowIssue
Argument `inputStream` might be null
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/YamlContent.java`
#### Snippet
```java
            try {
                final InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resourceName);
                final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                while (reader.ready()){
                    final String line = reader.readLine().replace("\n", "");
```

### DataFlowIssue
Argument `compileLevel` might be null
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
        try {
            final String compileLevel = getCompileLevel();
            final Integer level = Integer.valueOf(compileLevel);
            final List<T> result = runtimes.stream()
                    .filter(t -> levelGetter.apply(t) >= level)
```

### DataFlowIssue
Method invocation `getFtpUrl` may produce `NullPointerException`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/task/DeployExternalResourcesTask.java`
#### Snippet
```java
        AzureMessager.getMessager().info(AzureString.format("Uploading resources to %s", target.name()));
        final PublishingProfile publishingProfile = target.getPublishingProfile();
        final String serverUrl = publishingProfile.getFtpUrl().split("/", 2)[0];
        try {
            final FTPClient ftpClient = FTPUtils.getFTPClient(serverUrl, publishingProfile.getFtpUsername(), publishingProfile.getFtpPassword());
```

### DataFlowIssue
Method invocation `getOperatingSystem` may produce `NullPointerException`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java
            return null;
        }
        return webappInner.getRuntime().getOperatingSystem();
    }

```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java
            return null;
        }
        return webappInner.getAppServicePlan().getId();
    }

```

### DataFlowIssue
Method invocation `getWebContainer` may produce `NullPointerException`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java
        }

        return Objects.equals(webappInner.getRuntime().getWebContainer(), WebContainer.JAVA_SE);
    }

```

### DataFlowIssue
Method invocation `isDocker` may produce `NullPointerException`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java

    public boolean isDockerWebapp() {
        return webappInner != null && webappInner.getRuntime().isDocker();
    }

```

### DataFlowIssue
Method invocation `getImage` may produce `NullPointerException`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
        map.put(OS_KEY, os);
        if (StringUtils.equalsIgnoreCase(os, OperatingSystem.DOCKER.getValue())) {
            final String imageType = AppServiceUtils.getDockerImageType(runtimeConfig.getImage(), StringUtils.isEmpty(runtimeConfig.getServerId()),
                    runtimeConfig.getRegistryUrl()).name();
            map.put(DOCKER_IMAGE_TYPE_KEY, imageType);
```

### DataFlowIssue
Argument `is` might be null
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/ListMojo.java`
#### Snippet
```java
    protected void printToSystemOut(String file) throws IOException {
        try (final InputStream is = ListMojo.class.getResourceAsStream(file)) {
            IOUtils.copy(is, System.out);
        }
    }
```

### DataFlowIssue
Argument `webapp.getAppServicePlan()` might be null
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
    private WebAppConfiguration getConfigurationFromExisting(WebApp webapp,
                                                             WebAppConfiguration.WebAppConfigurationBuilder<?, ?> builder) {
        final AppServiceConfig appServiceConfig = fromAppService(webapp, webapp.getAppServicePlan());
        // common configuration
        builder.appName(appServiceConfig.appName())
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            builder.image(appServiceConfig.runtime().image());
            builder.registryUrl(appServiceConfig.runtime().registryUrl());
            final String dockerUsernameSetting = settings.get(SETTING_REGISTRY_USERNAME);
            if (StringUtils.isNotBlank(dockerUsernameSetting)) {
                builder.serverId(String.format(SERVER_ID_TEMPLATE, dockerUsernameSetting));
```

### DataFlowIssue
Argument `app.getAppServicePlan()` might be null
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
        final FunctionAppConfig config = parser.parseConfig();
        final boolean newFunctionApp = !app.exists();
        final AppServiceConfig defaultConfig = !newFunctionApp ? fromAppService(app, app.getAppServicePlan()) : buildDefaultConfig(config.subscriptionId(),
            config.resourceGroup(), config.appName());
        mergeAppServiceConfig(config, defaultConfig);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
        if (!newFunctionApp && !config.disableAppInsights() && StringUtils.isEmpty(config.appInsightsKey())) {
            // fill ai key from existing app settings
            config.appInsightsKey(app.getAppSettings().get(CreateOrUpdateFunctionAppTask.APPINSIGHTS_INSTRUMENTATION_KEY));
        }
        return new CreateOrUpdateFunctionAppTask(config).doExecute();
```

### DataFlowIssue
Method invocation `reason` may produce `NullPointerException`
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/DeployMojo.java`
#### Snippet
```java
        deployment.getInstances().forEach(instance ->
                log.info(String.format("  InstanceName:%-10s  Status:%-10s Reason:%-10s DiscoverStatus:%-10s",
                        instance.getName(), color(instance.getStatus()), instance.getRemote().reason(), instance.getDiscoveryStatus())));
    }

```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/DeployMojo.java`
#### Snippet
```java
        final File file = Optional.ofNullable(deploymentConfig).map(SpringCloudDeploymentConfig::getArtifact).map(IArtifact::getFile)
                .orElseThrow(() -> new AzureToolkitRuntimeException("No artifact is specified to deploy."));
        final String javaVersion = Optional.ofNullable(deploymentConfig).map(SpringCloudDeploymentConfig::getJavaVersion)
                .map(version -> StringUtils.removeStart(version, "Java_")).orElse(StringUtils.EMPTY);
        final SpringCloudCluster springCloudCluster = Azure.az(AzureSpringCloud.class).clusters(appConfig.getSubscriptionId()).get(appConfig.getClusterName(), appConfig.getResourceGroup());
```

### DataFlowIssue
Argument `template.getBindingConfiguration()` might be null
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
            final FunctionTemplate template = getFunctionTemplate(templates);

            final BindingTemplate bindingTemplate = FunctionUtils.loadBindingTemplate(template.getBindingConfiguration());
            final Map params = prepareRequiredParameters(template, bindingTemplate);

```

### DataFlowIssue
Argument `Optional.ofNullable(result.getBindingConfiguration()).map(BindingConfiguration::getType).orElse(null...` might be null
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        }
        final FunctionTemplate result = findTemplateByName(templates, getFunctionTemplate());
        getTelemetryProxy().addDefaultProperty(TRIGGER_TYPE, Optional.ofNullable(result.getBindingConfiguration()).map(BindingConfiguration::getType).orElse(null));
        return result;
    }
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/CustomTextIoStringListReader.java`
#### Snippet
```java
                        if (textLines.length > 1) {
                            final String delimiter = String.format("\n%" + (digits + 4) + "s", "");
                            optionText = Arrays.stream(textLines).collect(Collectors.joining(delimiter));
                        }
                    }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        log.info("Summary of parameters for function template:");

        params.entrySet().stream().forEach(e -> log.info(format("%s: %s", e.getKey(), e.getValue())));
    }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/exception/AzureExecutionException.java`
#### Snippet
```java
public class AzureExecutionException extends Exception {
    public AzureExecutionException(String errorMessage, Throwable err) {
        super(errorMessage.toString(), err);
    }

```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/CommandUtils.java`
#### Snippet
```java
        if (StringUtils.isEmpty(workingDirectory)) {
            final IllegalStateException exception = new IllegalStateException("A Safe Working directory could not be found to execute command from.");
            log.error(CommandUtils.class.getName(), "exec", exception);
            throw exception;
        }
```

## RuleId[id=CallingSubscribeInNonBlockingScope]
### CallingSubscribeInNonBlockingScope
Calling 'subscribe' in non-blocking context is not recommended
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java
            }).share();
        validating.setMiddle(flux);
        validating.setRight(flux.subscribe(info -> {
            if (Objects.equals(value, this.getValue())) {
                this.setValidationInfo(info);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'doValidate' is still used
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java
    @Nonnull
    @Deprecated
    default AzureValidationInfo doValidate(T value) {
        return AzureValidationInfo.none(this);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'AnnotationHandlerImpl' is still used
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandlerImpl.java`
#### Snippet
```java
@Slf4j
@Deprecated
public class AnnotationHandlerImpl implements AnnotationHandler {

    private static final String MULTI_RETRY_ANNOTATION = "Fixed delay retry and exponential backoff retry are not compatible, " +
```

### DeprecatedIsStillUsed
Deprecated member 'authType' is still used
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    @Deprecated
    @Parameter(property = "authType")
    protected String authType;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'DeployExternalResourcesTask' is still used
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/task/DeployExternalResourcesTask.java`
#### Snippet
```java

@Deprecated
public class DeployExternalResourcesTask extends AzureTask<WebAppBase<?, ?, ?>> {
    private static final String DEPLOY_START = "Trying to deploy external resources to %s...";
    private static final String DEPLOY_FINISH = "Successfully deployed the resources to %s";
```

### DeprecatedIsStillUsed
Deprecated member 'validateParameters' is still used
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
    // todo: Extract validator for all maven toolkits
    @Deprecated
    protected void validateParameters() {
        // app name
        if (StringUtils.isBlank(appName)) {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Objects.toString()` call
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/serializer/V2ConfigurationSerializer.java`
#### Snippet
```java
        if (newConfigs.getWebContainer() != null) {
            final String oldWebContainer = Objects.toString(oldConfigs.getWebContainer());
            createOrUpdateAttribute("webContainer", Objects.toString(newConfigs.getWebContainer()), oldWebContainer,
                    configurationElement);
        }
```

## RuleId[id=ReactiveStreamsUnusedPublisher]
### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java
            final Field<Consumer<T>> TRACKING = Field.of(FIELD_TRACKING);
            if (Objects.isNull(this.get(TRACKING))) {
                final Consumer<T> tracking = v -> this.validateValueAsync();
                this.addValueChangedListener(tracking::accept);
                this.set(TRACKING, tracking);
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java
            final AzureValidationInfo info = this.getValidationInfo();
            if (revalidateIfNone && Objects.isNull(info)) {
                this.validateValueAsync();
            }
            return this.getValidationInfo();
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
    protected String getRemoteDebugPort() {
        final List<FunctionAppDeploymentSlot> list = getParent().slots().list();
        final List<Integer> collect = list.stream().filter(slot -> slot.getAppSettings().keySet().contains(HTTP_PLATFORM_DEBUG_PORT))
                .map(slot -> slot.getAppSettings().get(HTTP_PLATFORM_DEBUG_PORT))
                .map(portValue -> NumberUtils.toInt(portValue))
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
        try {
            final JavaPropsMapper mapper = new JavaPropsMapper();
            mapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
            final DeployMojo commandLineConfig = mapper.readSystemPropertiesAs(JavaPropsSchema.emptySchema(), DeployMojo.class);
            Utils.copyProperties(this, commandLineConfig, false);
        } catch (IOException | IllegalAccessException e) {
            throw new AzureToolkitRuntimeException("failed to merge command line configuration", e);
        }
```

### DuplicatedCode
Duplicated code
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java
        directoryScanner.setBasedir(resource.getDirectory());
        directoryScanner.setIncludes(resource.getIncludes().toArray(new String[0]));
        final String[] exclude = resource.getExcludes() == null ? new String[0] :
                resource.getExcludes().toArray(new String[0]);
        directoryScanner.setExcludes(exclude);
        directoryScanner.scan();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-applicationinsights-lib/src/main/java/com/microsoft/azure/toolkit/lib/applicationinsights/AzureApplicationInsights.java`
#### Snippet
```java
        final Account account = Azure.az(AzureAccount.class).account();
        final String tenantId = account.getSubscription(subscriptionId).getTenantId();
        final AzureConfiguration config = Azure.az().config();
        final String userAgent = config.getUserAgent();
        final HttpLogOptions logOptions = new HttpLogOptions();
        logOptions.setLogLevel(Optional.ofNullable(config.getLogLevel()).map(HttpLogDetailLevel::valueOf).orElse(HttpLogDetailLevel.NONE));
        final AzureProfile azureProfile = new AzureProfile(tenantId, subscriptionId, account.getEnvironment());
        // todo: migrate resource provider related codes to common library
        final Providers providers = ResourceManager.configure()
            .withHttpClient(AbstractAzServiceSubscription.getDefaultHttpClient())
            .withPolicy(AbstractAzServiceSubscription.getUserAgentPolicy(userAgent))
                .authenticate(account.getTokenCredential(subscriptionId), azureProfile)
                .withSubscription(subscriptionId).providers();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/AzureAppService.java`
#### Snippet
```java
        final Account account = Azure.az(AzureAccount.class).account();
        final AzureConfiguration config = Azure.az().config();
        final String userAgent = config.getUserAgent();
        final HttpLogDetailLevel logLevel = Optional.ofNullable(config.getLogLevel()).map(HttpLogDetailLevel::valueOf).orElse(HttpLogDetailLevel.NONE);
        final AzureProfile azureProfile = new AzureProfile(null, subscriptionId, account.getEnvironment());
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/AzureAppService.java`
#### Snippet
```java
            boolean isFunctionRelated = false;
            try {
                final GenericResource resource = Azure.az(AzureResources.class).getGenericResource(id);
                isFunctionRelated = Optional.ofNullable(resource)
                    .filter(r -> StringUtils.containsIgnoreCase(r.getKind(), "function")).isPresent();
            } catch (ManagementException e) {
                if (e.getResponse().getStatusCode() != 404) { // Java SDK throw exception with 200 response, swallow exception in this case
                    throw e;
                }
            }
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
        OperationContext.action().setTelemetryProperty(CREATE_NEW_DEPLOYMENT_SLOT, String.valueOf(true));
        final String name = getName();
        final Map<String, String> newAppSettings = this.getAppSettings();
        final DiagnosticConfig newDiagnosticConfig = this.getDiagnosticConfig();
        final String newConfigurationSource = this.getConfigurationSource();
        // Using configuration from parent by default
        final String source = StringUtils.isBlank(newConfigurationSource) ? CONFIGURATION_SOURCE_PARENT : StringUtils.lowerCase(newConfigurationSource);
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
        final Runtime newRuntime = this.ensureConfig().getRuntime();
        final DockerConfiguration newDockerConfig = this.ensureConfig().getDockerConfiguration();
        final DiagnosticConfig oldDiagnosticConfig = super.getDiagnosticConfig();
        final DiagnosticConfig newDiagnosticConfig = this.ensureConfig().getDiagnosticConfig();

        final Runtime oldRuntime = AppServiceUtils.getRuntimeFromAppService(remote);
        boolean isRuntimeModified =  !oldRuntime.isDocker() && Objects.nonNull(newRuntime) && !Objects.equals(newRuntime, oldRuntime);
        boolean isDockerConfigurationModified = oldRuntime.isDocker() && Objects.nonNull(newDockerConfig);
        boolean isAppSettingsModified = MapUtils.isNotEmpty(settingsToAdd) || CollectionUtils.isNotEmpty(settingsToRemove);
        boolean isDiagnosticConfigModified = Objects.nonNull(newDiagnosticConfig) && !Objects.equals(newDiagnosticConfig, oldDiagnosticConfig);
        boolean modified = isDiagnosticConfigModified || isAppSettingsModified || isRuntimeModified || isDockerConfigurationModified;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
            Optional.ofNullable(settingsToAdd).ifPresent(update::withAppSettings);
            Optional.ofNullable(settingsToRemove).ifPresent(s -> s.forEach(update::withoutAppSetting));
            Optional.ofNullable(newRuntime).ifPresent(r -> updateRuntime(update, r));
            Optional.ofNullable(newDockerConfig)
                    .ifPresent(dockerConfiguration -> updateDockerConfiguration(update, dockerConfiguration));
            Optional.ofNullable(newDiagnosticConfig)
                    .ifPresent(diagnosticConfig -> AppServiceUtils.updateDiagnosticConfigurationForWebAppBase(update, diagnosticConfig));
            final IAzureMessager messager = AzureMessager.getMessager();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
        final Runtime oldRuntime = Objects.requireNonNull(super.getRuntime());
        if (newRuntime.getOperatingSystem() != null && Objects.requireNonNull(oldRuntime).getOperatingSystem() != newRuntime.getOperatingSystem()) {
            throw new AzureToolkitRuntimeException(CAN_NOT_UPDATE_EXISTING_APP_SERVICE_OS);
        }
        final OperatingSystem operatingSystem =
                ObjectUtils.firstNonNull(newRuntime.getOperatingSystem(), Objects.requireNonNull(oldRuntime).getOperatingSystem());
        if (operatingSystem == OperatingSystem.LINUX) {
            AzureMessager.getMessager().warning("Update runtime is not supported for Linux app service");
        } else if (operatingSystem == OperatingSystem.WINDOWS) {
            update.withJavaVersion(AppServiceUtils.toJavaVersion(newRuntime.getJavaVersion()))
                    .withWebContainer(AppServiceUtils.toWebContainer(newRuntime));
        } else if (operatingSystem == OperatingSystem.DOCKER) {
            return; // skip for docker, as docker configuration will be handled in `updateDockerConfiguration`
        } else {
            throw new AzureToolkitRuntimeException(String.format(UNSUPPORTED_OPERATING_SYSTEM, newRuntime.getOperatingSystem()));
        }
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
        final DeploymentSlotBase.UpdateStages.WithStartUpCommand<?> draft;
        if (StringUtils.isAllEmpty(newConfig.getUserName(), newConfig.getPassword())) {
            draft = update.withPublicDockerHubImage(newConfig.getImage());
        } else if (StringUtils.isEmpty(newConfig.getRegistryUrl())) {
            draft = update.withPrivateDockerHubImage(newConfig.getImage())
                    .withCredentials(newConfig.getUserName(), newConfig.getPassword());
        } else {
            draft = update.withPrivateRegistryImage(newConfig.getImage(), newConfig.getRegistryUrl())
                    .withCredentials(newConfig.getUserName(), newConfig.getPassword());
        }
        draft.withStartUpCommand(newConfig.getStartUpCommand());
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
        if (StringUtils.isAllEmpty(config.getUserName(), config.getPassword())) {
            draft = withLinuxAppFramework
                .withPublicDockerHubImage(config.getImage());
        } else if (StringUtils.isEmpty(config.getRegistryUrl())) {
            draft = withLinuxAppFramework
                .withPrivateDockerHubImage(config.getImage())
                .withCredentials(config.getUserName(), config.getPassword());
        } else {
            draft = withLinuxAppFramework
                .withPrivateRegistryImage(config.getImage(), config.getRegistryUrl())
                .withCredentials(config.getUserName(), config.getPassword());
        }
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
        final boolean notModified = Objects.isNull(this.config) || (StringUtils.isBlank(this.config.getConfigurationSource()) &&
                CollectionUtils.isEmpty(this.config.getAppSettingsToRemove()) &&
                Objects.isNull(this.getDockerConfiguration()) &&
                Objects.equals(this.getDiagnosticConfig(), super.getDiagnosticConfig()) &&
                Objects.equals(this.getAppSettings(), super.getAppSettings()) &&
                Objects.equals(this.getRuntime(), super.getRuntime()));
        return !notModified;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
        final OperatingSystem os = newRuntime.isDocker() ? OperatingSystem.LINUX : newRuntime.getOperatingSystem();
        if (!Objects.equals(os, newPlan.getOperatingSystem())) {
            throw new AzureToolkitRuntimeException(String.format("Could not create %s app service in %s service plan", newRuntime.getOperatingSystem(), newPlan.getOperatingSystem()));
        }
        final Map<String, String> newAppSettings = getAppSettings();
        final DiagnosticConfig newDiagnosticConfig = getDiagnosticConfig();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
        assert origin != null : "updating target is not specified.";
        final Map<String, String> oldAppSettings = Objects.requireNonNull(origin.getAppSettings());
        final Map<String, String> settingsToAdd = this.ensureConfig().getAppSettings();
        if (ObjectUtils.allNotNull(oldAppSettings, settingsToAdd)) {
            settingsToAdd.entrySet().removeAll(oldAppSettings.entrySet());
        }
        final Set<String> settingsToRemove = Optional.ofNullable(this.ensureConfig().getAppSettingsToRemove())
                .map(set -> set.stream().filter(key -> oldAppSettings.containsKey(key)).collect(Collectors.toSet()))
                .orElse(Collections.emptySet());
        final DiagnosticConfig newDiagnosticConfig = this.ensureConfig().getDiagnosticConfig();
        final Runtime newRuntime = this.ensureConfig().getRuntime();
        final AppServicePlan newPlan = this.ensureConfig().getPlan();
        final DockerConfiguration newDockerConfig = this.ensureConfig().getDockerConfiguration();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
            Optional.ofNullable(settingsToAdd).ifPresent(update::withAppSettings);
            Optional.of(settingsToRemove).filter(CollectionUtils::isNotEmpty).ifPresent(s -> s.forEach(update::withoutAppSetting));
            Optional.ofNullable(newDockerConfig).ifPresent(p -> updateDockerConfiguration(update, p));
            Optional.ofNullable(newDiagnosticConfig).ifPresent(c -> AppServiceUtils.updateDiagnosticConfigurationForWebAppBase(update, c));

            final IAzureMessager messager = AzureMessager.getMessager();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
        Objects.requireNonNull(newPlan.getRemote(), "Target app service plan doesn't exist");
        final OperatingSystem os = Objects.requireNonNull(getRuntime()).isDocker() ? OperatingSystem.LINUX : getRuntime().getOperatingSystem();
        if (!Objects.equals(os, newPlan.getOperatingSystem())) {
            throw new AzureToolkitRuntimeException(String.format("Could not migrate %s app service to %s service plan", getRuntime().getOperatingSystem(), newPlan.getOperatingSystem()));
        }
        update.withExistingAppServicePlan(newPlan.getRemote());
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
        final boolean notModified = Objects.isNull(this.config) ||
            Objects.isNull(this.config.getRuntime()) || Objects.equals(this.config.getRuntime(), super.getRuntime()) ||
            Objects.isNull(this.config.getPlan()) || Objects.equals(this.config.getPlan(), super.getAppServicePlan()) ||
            Objects.isNull(this.config.getDiagnosticConfig()) ||
            CollectionUtils.isEmpty(this.config.getAppSettingsToRemove()) ||
            Objects.isNull(this.config.getAppSettings()) || Objects.equals(this.config.getAppSettings(), super.getAppSettings()) ||
            Objects.isNull(this.config.getDockerConfiguration());
        return !notModified;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppModule.java`
#### Snippet
```java
        if (Objects.nonNull(resource) && Objects.nonNull(resource.getRemote())) {
            log.debug("[{}]:update->doModify(draft.updateResourceInAzure({}))", this.getName(), resource.getRemote());
            resource.doModify(() -> draft.updateResourceInAzure(Objects.requireNonNull(resource.getFullRemote())), AzResource.Status.UPDATING);
            return resource;
        }
        throw new AzureToolkitRuntimeException(String.format("resource \"%s\" doesn't exist", draft.getName()));
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/impl/DefaultFunctionProject.java`
#### Snippet
```java
        try {
            final ClassLoader classLoader = getClassLoader(urls);
            final Class<?> functionNameAnnotation = ClassUtils.getClass(classLoader, FUNCTION_NAME);
            final ConfigurationBuilder builder = new ConfigurationBuilder().addUrls(urls).setScanners(Scanners.MethodsAnnotated).addClassLoaders(classLoader);
            return new Reflections(builder).getMethodsAnnotatedWith((Class<? extends Annotation>) functionNameAnnotation);
        } catch (ClassNotFoundException e) {
            throw new AzureToolkitRuntimeException(e);
        }
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppBase.java`
#### Snippet
```java
            final com.azure.resourcemanager.appservice.models.DeployOptions options =
                    deployOptions == null ? null : AppServiceUtils.toDeployOptions(deployOptions);
            AzureMessager.getMessager().info(AzureString.format("Deploying (%s)[%s] %s ...", targetFile.toString(),
                    (deployType.toString()), StringUtils.isBlank(deployOptions.getPath()) ? "" : (" to " + (deployOptions.getPath()))));
            final com.azure.resourcemanager.appservice.models.DeployType type =
                    com.azure.resourcemanager.appservice.models.DeployType.fromString(deployType.getValue());
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzService.java`
#### Snippet
```java
        ResourceId resourceId = ResourceId.fromString(id);
        final String resourceGroup = resourceId.resourceGroupName();
        AbstractAzResource<?, ?, ?> resource = Objects.requireNonNull(this.get(resourceId.subscriptionId(), resourceGroup));
        final LinkedList<Pair<String, String>> resourceTypeNames = new LinkedList<>();
        while (resourceId != null) {
            resourceTypeNames.push(Pair.of(resourceId.resourceType(), URLDecoder.decode(resourceId.name(), "UTF-8")));
            resourceId = resourceId.parent();
        }
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/ContainerAppDraft.java`
#### Snippet
```java
            final List<Secret> secrets = origin.listSecrets().value().stream().map(s -> new Secret().withName(s.name()).withValue(s.value())).collect(Collectors.toList());
            final List<RegistryCredentials> registries = Optional.ofNullable(origin.configuration().registries()).map(ArrayList::new).orElseGet(ArrayList::new);
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-eventhubs-lib/src/main/java/com/microsoft/azure/toolkit/lib/eventhubs/EventHubsInstance.java`
#### Snippet
```java
        if (accessRights.contains(AccessRights.MANAGE)) {
            withCreate = policy.withManageAccess();
        } else if (accessRights.contains(AccessRights.SEND) && accessRights.contains(AccessRights.LISTEN)) {
            withCreate = policy.withSendAndListenAccess();
        } else if (accessRights.contains(AccessRights.SEND)) {
            withCreate = policy.withSendAccess();
        }
        return withCreate.create().getKeys().primaryConnectionString();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlFirewallRuleDraft.java`
#### Snippet
```java
        final FirewallRule.DefinitionStages.WithCreate withCreate = manager.firewallRules().define(this.getName())
            .withExistingFlexibleServer(this.getResourceGroupName(), server.getName())
            .withStartIpAddress(this.getStartIpAddress())
            .withEndIpAddress(this.getEndIpAddress());
        final IAzureMessager messager = AzureMessager.getMessager();
        messager.info(AzureString.format("Start creating firewall rule \"{0}\"...", this.getName()));
        final FirewallRule rule = withCreate.create();
        messager.success(AzureString.format("Firewall rule \"{0}\" is successfully created.", this.getName()));
        return rule;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlFirewallRuleDraft.java`
#### Snippet
```java
        final Optional<String> modifiedStartIp = Optional.ofNullable(this.getStartIpAddress()).filter(n -> !Objects.equals(n, super.getStartIpAddress()));
        final Optional<String> modifiedEndIp = Optional.ofNullable(this.getEndIpAddress()).filter(n -> !Objects.equals(n, super.getEndIpAddress()));
        if (modifiedStartIp.isPresent() || modifiedEndIp.isPresent()) {
            final MySqlServer server = this.getParent();
            final MySqlManager manager = Objects.requireNonNull(server.getParent().getRemote());
            final FirewallRule.Update update = manager.firewallRules().get(this.getResourceGroupName(), server.getName(), this.getName()).update();
            modifiedStartIp.ifPresent(update::withStartIpAddress);
            modifiedEndIp.ifPresent(update::withEndIpAddress);
            final IAzureMessager messager = AzureMessager.getMessager();
            messager.info(AzureString.format("Start updating firewall rule \"{0}\"...", this.getName()));
            final FirewallRule rule = update.apply();
            messager.success(AzureString.format("Firewall rule \"{0}\" is successfully updated.", this.getName()));
            return rule;
        }
        return origin;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlFirewallRuleModule.java`
#### Snippet
```java
        final String ruleName = IFirewallRule.AZURE_SERVICES_ACCESS_FIREWALL_RULE_NAME;
        final String rgName = this.getParent().getResourceGroupName();
        final boolean exists = this.exists(ruleName, rgName);
        if (!allowed && exists) {
            this.delete(ruleName, rgName);
        }
        if (allowed && !exists) {
            final MySqlFirewallRuleDraft draft = this.create(ruleName, rgName);
            draft.setStartIpAddress(IFirewallRule.IP_ALLOW_ACCESS_TO_AZURE_SERVICES);
            draft.setEndIpAddress(IFirewallRule.IP_ALLOW_ACCESS_TO_AZURE_SERVICES);
            draft.commit();
        }
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlFirewallRuleModule.java`
#### Snippet
```java
        final String ruleName = IFirewallRule.getLocalMachineAccessRuleName();
        final String rgName = this.getParent().getResourceGroupName();
        final boolean exists = this.exists(ruleName, rgName);
        if (!allowed && exists) {
            this.delete(ruleName, rgName);
        }
        if (allowed && !exists) {
            final String publicIp = this.getParent().getLocalMachinePublicIp();
            Preconditions.checkArgument(StringUtils.isNotBlank(publicIp),
                "Cannot enable local machine access to MySQL server due to error: cannot get public ip.");
            final MySqlFirewallRuleDraft draft = this.updateOrCreate(ruleName, rgName);
            draft.setStartIpAddress(publicIp);
            draft.setEndIpAddress(publicIp);
            draft.commit();
        }
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServer.java`
#### Snippet
```java
        String username = this.getAdminName() + "@" + this.getName();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection(JdbcUrl.mysql(this.getFullyQualifiedDomainName()).toString(), username, null);
        } catch (SQLException e) {
            String ip = NetUtils.parseIpAddressFromMessage(e.getMessage());
            if (StringUtils.isNotBlank(ip)) {
                return ip;
            }
        } catch (ClassNotFoundException ignored) {
        }
        // Alternatively, get public IP by ping public URL
        return NetUtils.getPublicIp();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServerDraft.java`
#### Snippet
```java
        this.setAdminName(config.getAdminName());
        this.setAdminPassword(config.getAdminPassword());
        this.setRegion(config.getRegion());
        this.setVersion(config.getVersion());
        this.setFullyQualifiedDomainName(config.getFullyQualifiedDomainName());
        this.setAzureServiceAccessAllowed(config.isAzureServiceAccessAllowed());
        this.setLocalMachineAccessAllowed(config.isLocalMachineAccessAllowed());
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServerDraft.java`
#### Snippet
```java
        final IAzureMessager messager = AzureMessager.getMessager();
        messager.info(AzureString.format("Start creating MySQL server ({0})...", this.getName()));
        final Server remote = this.doModify(() -> create.create(), Status.CREATING);
        messager.success(AzureString.format("MySQL server({0}) is successfully created.", this.getName()));
        return this.updateResourceInAzure(remote);
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServerDraft.java`
#### Snippet
```java
        if (this.isAzureServiceAccessAllowed() != super.isAzureServiceAccessAllowed() ||
            this.isLocalMachineAccessAllowed() != super.isLocalMachineAccessAllowed()) {
            final IAzureMessager messager = AzureMessager.getMessager();
            messager.info(AzureString.format("Start updating firewall rules of MySQL server ({0})...", this.getName()));
            this.firewallRules().toggleAzureServiceAccess(this.isAzureServiceAccessAllowed());
            this.firewallRules().toggleLocalMachineAccess(this.isLocalMachineAccessAllowed());
            messager.success(AzureString.format("Firewall rules of MySQL server({0}) is successfully updated.", this.getName()));
        }
        return origin;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServerDraft.java`
#### Snippet
```java
        final boolean notModified = Objects.isNull(this.config) ||
            Objects.equals(this.config.isLocalMachineAccessAllowed(), super.isLocalMachineAccessAllowed()) ||
            Objects.equals(this.config.isAzureServiceAccessAllowed(), super.isAzureServiceAccessAllowed()) ||
            Objects.isNull(this.config.getAdminPassword()) ||
            Objects.isNull(this.config.getAdminName()) || Objects.equals(this.config.getAdminName(), super.getAdminName()) ||
            Objects.isNull(this.config.getRegion()) || Objects.equals(this.config.getRegion(), super.getRegion()) ||
            Objects.isNull(this.config.getVersion()) || Objects.equals(this.config.getVersion(), super.getVersion()) ||
            Objects.isNull(this.config.getFullyQualifiedDomainName()) ||
            Objects.equals(this.config.getFullyQualifiedDomainName(), super.getFullyQualifiedDomainName());
        return !notModified;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlFirewallRuleDraft.java`
#### Snippet
```java
        final FirewallRule.DefinitionStages.WithCreate withCreate = manager.firewallRules().define(this.getName())
            .withExistingServer(this.getResourceGroupName(), server.getName())
            .withStartIpAddress(this.getStartIpAddress())
            .withEndIpAddress(this.getEndIpAddress());
        final IAzureMessager messager = AzureMessager.getMessager();
        messager.info(AzureString.format("Start creating firewall rule \"{0}\"...", this.getName()));
        final FirewallRule rule = withCreate.create();
        messager.success(AzureString.format("Firewall rule \"{0}\" is successfully created.", this.getName()));
        return rule;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlServerDraft.java`
#### Snippet
```java
        final Sku sku = new Sku().withName(tier.serviceLevelObjectives().get(0).id());
        // create server
        final Server.DefinitionStages.WithCreate create = manager.servers().define(this.getName())
            .withRegion(this.getRegion().getName())
            .withExistingResourceGroup(this.getResourceGroupName())
            .withProperties(parameters)
            .withSku(sku);
        final IAzureMessager messager = AzureMessager.getMessager();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlDatabaseModule.java`
#### Snippet
```java
        final PostgreSqlServer server = this.getParent();
        return Optional.ofNullable(this.getClient())
            .map(c -> c.listByServer(server.getResourceGroupName(), server.getName())
                .streamByPage(getPageSize())
                .map(p -> new ItemPage<>(p.getValue().stream().filter(d -> !"azure_maintenance".equals(d.name()))))
                .iterator())
            .orElse(Collections.emptyIterator());
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlFirewallRuleDraft.java`
#### Snippet
```java
        final Optional<String> modifiedStartIp = Optional.ofNullable(this.getStartIpAddress()).filter(n -> !Objects.equals(n, super.getStartIpAddress()));
        final Optional<String> modifiedEndIp = Optional.ofNullable(this.getEndIpAddress()).filter(n -> !Objects.equals(n, super.getEndIpAddress()));
        if (modifiedStartIp.isPresent() || modifiedEndIp.isPresent()) {
            final PostgreSqlServer server = this.getParent();
            final PostgreSqlManager manager = Objects.requireNonNull(server.getParent().getRemote());
            final FirewallRule.Update update = manager.firewallRules().get(this.getResourceGroupName(), server.getName(), this.getName()).update();
            modifiedStartIp.ifPresent(update::withStartIpAddress);
            modifiedEndIp.ifPresent(update::withEndIpAddress);
            final IAzureMessager messager = AzureMessager.getMessager();
            messager.info(AzureString.format("Start updating firewall rule \"{0}\"...", this.getName()));
            final FirewallRule rule = update.apply();
            messager.success(AzureString.format("Firewall rule \"{0}\" is successfully updated.", this.getName()));
            return rule;
        }
        return origin;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlFirewallRuleModule.java`
#### Snippet
```java
        final String ruleName = IFirewallRule.AZURE_SERVICES_ACCESS_FIREWALL_RULE_NAME;
        final String rgName = this.getParent().getResourceGroupName();
        final boolean exists = this.exists(ruleName, rgName);
        if (!allowed && exists) {
            this.delete(ruleName, rgName);
        }
        if (allowed && !exists) {
            final PostgreSqlFirewallRuleDraft draft = this.create(ruleName, rgName);
            draft.setStartIpAddress(IFirewallRule.IP_ALLOW_ACCESS_TO_AZURE_SERVICES);
            draft.setEndIpAddress(IFirewallRule.IP_ALLOW_ACCESS_TO_AZURE_SERVICES);
            draft.commit();
        }
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlFirewallRuleModule.java`
#### Snippet
```java
        final String ruleName = IFirewallRule.getLocalMachineAccessRuleName();
        final String rgName = this.getParent().getResourceGroupName();
        final boolean exists = this.exists(ruleName, rgName);
        if (!allowed && exists) {
            this.delete(ruleName, rgName);
        }
        if (allowed && !exists) {
            final String publicIp = this.getParent().getLocalMachinePublicIp();
            Preconditions.checkArgument(StringUtils.isNotBlank(publicIp),
                "Cannot enable local machine access to PostgreSql server due to error: cannot get public ip.");
            final PostgreSqlFirewallRuleDraft draft = this.updateOrCreate(ruleName, rgName);
            draft.setStartIpAddress(publicIp);
            draft.setEndIpAddress(publicIp);
            draft.commit();
        }
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServer.java`
#### Snippet
```java
        String username = this.getAdminName() + "@" + this.getName();
        try {
            Class.forName("org.postgresql.Driver");
            DriverManager.getConnection(JdbcUrl.postgre(this.getFullyQualifiedDomainName(), "postgres").toString(), username, null);
        } catch (SQLException e) {
            String ip = NetUtils.parseIpAddressFromMessage(e.getMessage());
            if (StringUtils.isNotBlank(ip)) {
                return ip;
            }
        } catch (ClassNotFoundException ignored) {
        }
        // Alternatively, get public IP by ping public URL
        return NetUtils.getPublicIp();
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServerDraft.java`
#### Snippet
```java
        if (this.isAzureServiceAccessAllowed() != super.isAzureServiceAccessAllowed() ||
            this.isLocalMachineAccessAllowed() != super.isLocalMachineAccessAllowed()) {
            final IAzureMessager messager = AzureMessager.getMessager();
            messager.info(AzureString.format("Start updating firewall rules of PostgreSQL server ({0})...", this.getName()));
            this.firewallRules().toggleAzureServiceAccess(this.isAzureServiceAccessAllowed());
            this.firewallRules().toggleLocalMachineAccess(this.isLocalMachineAccessAllowed());
            messager.success(AzureString.format("Firewall rules of PostgreSQL server({0}) is successfully updated.", this.getName()));
        }
        return origin;
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-servicebus-lib/src/main/java/com/microsoft/azure/toolkit/lib/servicebus/queue/ServiceBusQueue.java`
#### Snippet
```java
        if (connectionStrings.size() > 0) {
            return connectionStrings.get(0).getKeys().primaryConnectionString();
        }
        final ServiceBusManager manager = getParent().getParent().getRemote();
        if (Objects.isNull(manager)) {
            throw new AzureToolkitRuntimeException(AzureString.format("resource ({0}) not found", getName()).toString());
        }
        final String accessRightsStr = StringUtils.join(accessRights, "-");
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java
            final Map<String, String> newEnv = Utils.emptyToNull(this.getEnvironmentVariables());
            final String newJvmOptions = Utils.emptyToNull(this.getJvmOptions());
            final String newVersion = Utils.emptyToNull(this.getRuntimeVersion());
            final File newArtifact = Optional.ofNullable(config).map(c -> c.artifact).map(IArtifact::getFile).orElse(null);

            final Map<String, String> oldEnv = Utils.emptyToNull(super.getEnvironmentVariables());
```

### DuplicatedCode
Duplicated code
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/AzuriteStorageAccount.java`
#### Snippet
```java
            if (this.canHaveBlobs()) {
                this.subModules.add(this.blobContainerModule);
            }
            if (this.canHaveShares()) {
                this.subModules.add(this.shareModule);
            }
            if (this.canHaveQueues()) {
                this.subModules.add(this.queueModule);
            }
            if (this.canHaveTables()) {
                this.subModules.add(this.tableModule);
            }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/NetUtils.java`
#### Snippet
```java
                }
            }
        } catch (IOException e) {
        }
        return ip;
```

### CatchMayIgnoreException
Empty `catch` block
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/NetUtils.java`
#### Snippet
```java
        try {
            hostname = InetAddress.getLocalHost().getHostName();
        } catch (Throwable e) {
        }
        return hostname;
```

### CatchMayIgnoreException
Empty `catch` block
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/TemplateResources.java`
#### Snippet
```java
            final JsonNode node = mapper.readTree(resourceJsonStr);
            map = mapper.convertValue(node.get("en"), Map.class);
        } catch (Exception e) {
        }
    }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/AzureStorageHelper.java`
#### Snippet
```java

            final CloudBlockBlob blob = blobContainer.getBlockBlobReference(blobName);
            blob.upload(new FileInputStream(fileToUpload), fileToUpload.length());
            return blob;
        } catch (URISyntaxException | StorageException | IOException e) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/appservice/handlers/artifact/FTPUploader.java`
#### Snippet
```java
        messager.info(String.format(UPLOAD_FILE, logPrefix, sourceFilePath, targetFilePath));
        final File sourceFile = new File(sourceFilePath);
        try (final InputStream is = new FileInputStream(sourceFile)) {
            ftpClient.changeWorkingDirectory(targetFilePath);
            ftpClient.storeFile(sourceFile.getName(), is);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/PomUtils.java`
#### Snippet
```java
        final SAXReader reader = new CustomSAXReader();
        reader.setDocumentFactory(new LocatorAwareDocumentFactory());
        final Document doc = reader.read(new InputStreamReader(new FileInputStream(pom)));
        final Element pluginsNode = getOrCreateNode(doc.getRootElement(), "build", "plugins");
        Element pluginConfigNode = null;
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
            final File configurationFile = new File(CONFIGURATION_PATH);
            if (configurationFile.exists()) {
                try (InputStream input = new FileInputStream(CONFIGURATION_PATH)) {
                    prop.load(input);
                    final String firstRunValue = prop.getProperty(FIRST_RUN_KEY);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java

    private void updateConfigurationFile(Properties prop) {
        try (OutputStream output = new FileOutputStream(CONFIGURATION_PATH)) {
            prop.setProperty(FIRST_RUN_KEY, "false");
            prop.store(output, "Azure Maven Plugin configurations");
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java

    protected void saveToTargetFile(final File targetFile, final String newFunctionClass) throws IOException {
        try (final OutputStream os = new FileOutputStream(targetFile)) {
            IOUtil.copy(newFunctionClass, os);
        }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            return null;
        }
        options.addAll(javaOrDockerWebapps);
        return new CustomTextIoStringListReader<WebAppOption>(TextIOUtils::getTextTerminal, null)
                .withCustomPrompt(String.format("Please choose a %sWeb App: ", webAppType))
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `azure-toolkit-libs/azure-toolkit-database-lib/src/main/java/com/microsoft/azure/toolkit/lib/database/JdbcUrl.java`
#### Snippet
```java
    @Override
    public String toString() {
        String url = "jdbc:" + uri.toString();
        return decode(url);
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
                    final String outputFolder = this.getPluginName().replaceAll(MAVEN_PLUGIN_POSTFIX, "");
                    final String stagingDirectoryPath = Paths.get(this.getBuildDirectoryAbsolutePath(),
                            outputFolder, String.format("%s-%s", this.getAppName(), UUID.randomUUID().toString())
                    ).toString();
                    stagingDirectory = new File(stagingDirectoryPath);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            System.out.println(CONFIGURATION_NO_RUNTIME);
        } else {
            System.out.println("OS : " + configuration.getOs().toString());
            switch (configuration.getOs()) {
                case WINDOWS:
```

## RuleId[id=ReactiveStreamsThrowInOperator]
### ReactiveStreamsThrowInOperator
Throw statement in Reactor create factory
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/StreamingLogSupport.java`
#### Snippet
```java
                    AzureMessager.getMessager().error("app/instance may be deactivated, please refresh and try again later.");
                } catch (final IOException e) {
                    throw new AzureToolkitRuntimeException(e);
                }
            });
```

## RuleId[id=UnresolvedPropertyKey]
### UnresolvedPropertyKey
'account.try_azure' doesn't appear to be a valid property key
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/IAccountActions.java`
#### Snippet
```java

public interface IAccountActions {
    Action.Id<Object> TRY_AZURE = Action.Id.of("account.try_azure");
    Action.Id<Object> SELECT_SUBS = Action.Id.of("account.select_subs");
    Action.Id<Object> AUTHENTICATE = Action.AUTHENTICATE;
```

### UnresolvedPropertyKey
'account.select_subs' doesn't appear to be a valid property key
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/IAccountActions.java`
#### Snippet
```java
public interface IAccountActions {
    Action.Id<Object> TRY_AZURE = Action.Id.of("account.try_azure");
    Action.Id<Object> SELECT_SUBS = Action.Id.of("account.select_subs");
    Action.Id<Object> AUTHENTICATE = Action.AUTHENTICATE;
}
```

### UnresolvedPropertyKey
Invalid resource bundle reference 'bundles.com.microsoft.azure.toolkit.message'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/AzureMessageBundle.java`
#### Snippet
```java
    private static final AzureBundle bundle = new AzureBundle(BUNDLE);

    public static AzureString message(@Nonnull @PropertyKey(resourceBundle = BUNDLE) String name, @Nonnull Object... params) {
        return AzureString.format(bundle, name, params);
    }
```

### UnresolvedPropertyKey
Invalid resource bundle reference 'bundles.com.microsoft.azure.toolkit.operation'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationBundle.java`
#### Snippet
```java
    private static final AzureBundle bundle = new AzureBundle(BUNDLE);

    public static AzureString description(@Nonnull @PropertyKey(resourceBundle = BUNDLE) String name, @Nonnull Object... params) {
        return AzureString.format(bundle, name, params);
    }
```

### UnresolvedPropertyKey
Invalid resource bundle reference 'bundles.com.microsoft.azure.toolkit.operation'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
        }

        public static <D> Id<D> of(@PropertyKey(resourceBundle = OperationBundle.BUNDLE) @Nonnull String id) {
            assert StringUtils.isNotBlank(id) : "action id can not be blank";
            return new Id<>(id);
```

### UnresolvedPropertyKey
'user/account.disable_auth_cache' doesn't appear to be a valid property key
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
    public static final Id<Object> AUTHENTICATE = Id.of("account.authenticate");
    public static final Action.Id<Object> OPEN_AZURE_SETTINGS = Action.Id.of("user/common.open_azure_settings");
    public static final Action.Id<Object> DISABLE_AUTH_CACHE = Action.Id.of("user/account.disable_auth_cache");

    @Nonnull
```

### UnresolvedPropertyKey
'common.retry' doesn't appear to be a valid property key
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java

    public static Action<Void> retryFromFailure(@Nonnull Runnable handler) {
        return new Action<>(Id.<Void>of("common.retry"))
            .withHandler((v) -> handler.run())
            .withLabel("Retry");
```

### UnresolvedPropertyKey
'common.requireAuth' doesn't appear to be a valid property key
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
    public static final String SOURCE = "ACTION_SOURCE";
    public static final String RESOURCE_TYPE = "resourceType";
    public static final Id<Runnable> REQUIRE_AUTH = Id.of("common.requireAuth");
    public static final Id<Object> AUTHENTICATE = Id.of("account.authenticate");
    public static final Action.Id<Object> OPEN_AZURE_SETTINGS = Action.Id.of("user/common.open_azure_settings");
```

### UnresolvedPropertyKey
'account.authenticate' doesn't appear to be a valid property key
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
    public static final String RESOURCE_TYPE = "resourceType";
    public static final Id<Runnable> REQUIRE_AUTH = Id.of("common.requireAuth");
    public static final Id<Object> AUTHENTICATE = Id.of("account.authenticate");
    public static final Action.Id<Object> OPEN_AZURE_SETTINGS = Action.Id.of("user/common.open_azure_settings");
    public static final Action.Id<Object> DISABLE_AUTH_CACHE = Action.Id.of("user/account.disable_auth_cache");
```

### UnresolvedPropertyKey
'user/common.open_azure_settings' doesn't appear to be a valid property key
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
    public static final Id<Runnable> REQUIRE_AUTH = Id.of("common.requireAuth");
    public static final Id<Object> AUTHENTICATE = Id.of("account.authenticate");
    public static final Action.Id<Object> OPEN_AZURE_SETTINGS = Action.Id.of("user/common.open_azure_settings");
    public static final Action.Id<Object> DISABLE_AUTH_CACHE = Action.Id.of("user/account.disable_auth_cache");

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java

    public static boolean checkIfExists(String path){
        if (Files.exists(Paths.get(path))){
            return true;
        }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/TemplateResources.java`
#### Snippet
```java
        try (final InputStream is = TemplateResources.class.getResourceAsStream("/resources.json")) {
            final ObjectMapper mapper = new ObjectMapper();
            final String resourceJsonStr = IOUtils.toString(is, "utf8");
            final JsonNode node = mapper.readTree(resourceJsonStr);
            map = mapper.convertValue(node.get("en"), Map.class);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java
        String content) throws MojoFailureException {
        final ObjectMapper oMapper = new ObjectMapper(new YAMLFactory());
        final InputStream stream = new ByteArrayInputStream(content.getBytes(Charset.forName("UTF-8")));
        try {
            return oMapper.readValue(stream, Map.class);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'MongoCursor' used without 'try'-with-resources statement
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoDocumentModule.java`
#### Snippet
```java
            return Collections.emptyIterator();
        }
        final MongoCursor<Document> itemsIterator = client.find().batchSize(getPageSize()).iterator();
        return new Iterator<Page<Document>>() {
            @Override
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition '!firstRunValue.isEmpty()' covered by subsequent condition 'firstRunValue.equalsIgnoreCase(...)'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
                    prop.load(input);
                    final String firstRunValue = prop.getProperty(FIRST_RUN_KEY);
                    if (firstRunValue != null && !firstRunValue.isEmpty() && firstRunValue.equalsIgnoreCase("false")) {
                        return false;
                    }
```

## RuleId[id=MissingAspectjAutoproxyInspection]
### MissingAspectjAutoproxyInspection
@AspectJ support isn't enabled
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/cache/CacheManager.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

@Aspect
@Slf4j
public class CacheManager {
```

### MissingAspectjAutoproxyInspection
@AspectJ support isn't enabled
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/ExceptionNotificationAspect.java`
#### Snippet
```java
import java.util.stream.Stream;

@Aspect
@Slf4j
public final class ExceptionNotificationAspect {
```

### MissingAspectjAutoproxyInspection
@AspectJ support isn't enabled
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/AzureOperationAspect.java`
#### Snippet
```java
import java.util.concurrent.Callable;

@Aspect
@Slf4j
public final class AzureOperationAspect {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param project` tag description is missing
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
     * order to disable filtering, the "filtering" property is force set to False.
     *
     * @param project
     * @param session
     * @param filtering
```

### JavadocDeclaration
`@param session` tag description is missing
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
     *
     * @param project
     * @param session
     * @param filtering
     * @param resources
```

### JavadocDeclaration
`@param filtering` tag description is missing
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
     * @param project
     * @param session
     * @param filtering
     * @param resources
     * @param targetDirectory
```

### JavadocDeclaration
`@param resources` tag description is missing
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
     * @param session
     * @param filtering
     * @param resources
     * @param targetDirectory
     * @throws IOException
```

### JavadocDeclaration
`@param targetDirectory` tag description is missing
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
     * @param filtering
     * @param resources
     * @param targetDirectory
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
     * @param resources
     * @param targetDirectory
     * @throws IOException
     */
    private static void copyResources(final MavenProject project, final MavenSession session,
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `new boolean[]{true}` to `Object` is redundant
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/cache/Preloader.java`
#### Snippet
```java
                    m.invoke(instance, (Object) new Boolean[]{true});
                } else if (varargType.equals(boolean.class)) {
                    m.invoke(instance, (Object) new boolean[]{true});
                } else {
                    m.invoke(instance, Array.newInstance(varargType, 0));
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `type` may be 'final'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/BindingEnum.java`
#### Snippet
```java
    }

    private String type;
    private Direction direction;
    private boolean isStorage;
```

### FieldMayBeFinal
Field `direction` may be 'final'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/BindingEnum.java`
#### Snippet
```java

    private String type;
    private Direction direction;
    private boolean isStorage;

```

### FieldMayBeFinal
Field `customBindingAnnotation` may be 'final'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/ExtendedCustomBinding.java`
#### Snippet
```java
public class ExtendedCustomBinding extends Binding {

    private FunctionAnnotation customBindingAnnotation;

    public ExtendedCustomBinding(BindingEnum bindingEnum,
```

### FieldMayBeFinal
Field `value` may be 'final'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/configurations/FunctionExtensionVersion.java`
#### Snippet
```java
    UNKNOWN(Integer.MIN_VALUE, "unknown");

    private int value;
    private String version;

```

### FieldMayBeFinal
Field `version` may be 'final'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/configurations/FunctionExtensionVersion.java`
#### Snippet
```java

    private int value;
    private String version;

    FunctionExtensionVersion(int value, String version) {
```

### FieldMayBeFinal
Field `deploymentResultAtomicReference` may be 'final'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
    private final Boolean waitDeploymentComplete;
    private final IAzureMessager messager;
    private AtomicReference<KuduDeploymentResult> deploymentResultAtomicReference = new AtomicReference<>();
    @Setter
    private long deploymentStatusRefreshInterval = DEFAULT_DEPLOYMENT_STATUS_REFRESH_INTERVAL;
```

### FieldMayBeFinal
Field `inner` may be 'final'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/model/SubscriptionOption.java`
#### Snippet
```java
public class SubscriptionOption implements Comparable<SubscriptionOption> {

    private Subscription inner;

    public SubscriptionOption(Subscription inner) {
```

### FieldMayBeFinal
Field `inner` may be 'final'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/model/SubscriptionOption2.java`
#### Snippet
```java
public class SubscriptionOption2 implements Comparable<SubscriptionOption2> {

    private Subscription inner;

    public SubscriptionOption2(Subscription inner) {
```

### FieldMayBeFinal
Field `terminalSupplierList` may be 'final'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/TextIOUtils.java`
#### Snippet
```java
public class TextIOUtils {
    private static TextTerminal textTerminal;
    private static List<Supplier<TextTerminal>> terminalSupplierList = Arrays.asList(
            () -> (new JLineTextTerminalProvider()).getTextTerminal(),
            () -> (new ConsoleTextTerminalProvider()).getTextTerminal(),
```

### FieldMayBeFinal
Field `schemas` may be 'final'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/SchemaValidator.java`
#### Snippet
```java
    private Map<String, Map<String, Object>> schemaMap = new HashMap<>();

    private Map<String, JsonNode> schemas = new HashMap<>();

    private final JsonValidator validator;
```

### FieldMayBeFinal
Field `schemaMap` may be 'final'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/SchemaValidator.java`
#### Snippet
```java
public class SchemaValidator {

    private Map<String, Map<String, Object>> schemaMap = new HashMap<>();

    private Map<String, JsonNode> schemas = new HashMap<>();
```

### FieldMayBeFinal
Field `documentFactory` may be 'final'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/PomUtils.java`
#### Snippet
```java
    static class CustomSAXContentHandler extends SAXContentHandler {
        // this is already in SAXContentHandler, but private
        private DocumentFactory documentFactory;

        public CustomSAXContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/InitMojo.java`
#### Snippet
```java
    String applicationDescription;

    private Log logger  = getLog();

    @Override
```

### FieldMayBeFinal
Field `reader` may be 'final'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
    private static final Pattern REGEX_NEXT_INTEGER_RANGE = Pattern.compile("([0-9]+)(?:-([0-9]+))?(?:,|$)", Pattern.COMMENTS);

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String promoteString(String message, String defaultValue, Function<String, InputValidateResult<String>> verify, boolean isRequired)
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/AddServiceMojo.java`
#### Snippet
```java
    String environmentalVariables;

    private Log logger  = getLog();

    @Override
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `matches` is redundant
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/proxy/ProxyManager.java`
#### Snippet
```java
            return false;
        }
        boolean matches = pattern.matcher(urlhost).matches();
        return matches;
    }
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'concrete'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/GenericResource.java`
#### Snippet
```java
     * copy constructor
     */
    protected GenericResource(@Nonnull GenericResource origin) {
        super(origin);
        this.resourceId = origin.resourceId;
```

### CopyConstructorMissesField
Copy constructor does not copy field 'targetServiceId'
in `azure-toolkit-libs/azure-toolkit-servicelinker-lib/src/main/java/com/microsoft/azure/toolkit/lib/servicelinker/ServiceLinker.java`
#### Snippet
```java
    }

    protected ServiceLinker(@Nonnull ServiceLinker origin) {
        super(origin);
    }
```

### CopyConstructorMissesField
Copy constructor does not copy field 'artifact'
in `azure-toolkit-libs/azure-toolkit-containerregistry-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerregistry/Artifact.java`
#### Snippet
```java
    }

    protected Artifact(@Nonnull Artifact artifact) {
        super(artifact);
        this.tagModule = artifact.tagModule;
```

### CopyConstructorMissesField
Copy constructor does not copy field 'properties'
in `azure-toolkit-libs/azure-toolkit-containerregistry-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerregistry/Repository.java`
#### Snippet
```java
    }

    protected Repository(@Nonnull Repository registry) {
        super(registry);
        this.artifactModule = registry.artifactModule;
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java
    @Deprecated
    default void setValidator(@Nonnull Validator validator) {
        this.set(FIELD_VALIDATORS, Arrays.asList(validator));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/AzuriteStorageAccount.java`
#### Snippet
```java
        @Override
        public List<StorageAccount> list() {
            return Arrays.asList(AZURITE_STORAGE_ACCOUNT);
        }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/utils/CommandUtils.java`
#### Snippet
```java

    public static List<Long> getDefaultValidReturnCodes() {
        return Arrays.asList(0L);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/model/IngressConfig.java`
#### Snippet
```java
    private TransportMethod transport = TransportMethod.AUTO;
    @Builder.Default
    private List<Traffic> traffic = Arrays.asList(DEFAULT_TRAFFIC);

    @Data
```

