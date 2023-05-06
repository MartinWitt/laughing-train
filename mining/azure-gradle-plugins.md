# azure-gradle-plugins 
 
# Bad smells
I found 51 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 24 | false |
| Deprecation | 14 | false |
| IgnoreResultOfCall | 5 | false |
| IOStreamConstructor | 2 | false |
| NotNullFieldNotInitialized | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| DataFlowIssue | 1 | false |
| FieldMayBeFinal | 1 | false |
| Lombok | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/AzureWebappPluginExtension.java`
#### Snippet
```java
    private Boolean disableAppInsights;

    @Nonnull
    private Project project;

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition '!firstRunValue.isEmpty()' covered by subsequent condition 'firstRunValue.equalsIgnoreCase(...)'
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
#### Snippet
```java
                    prop.load(input);
                    final String firstRunValue = prop.getProperty(FIRST_RUN_KEY);
                    if (firstRunValue != null && !firstRunValue.isEmpty() && firstRunValue.equalsIgnoreCase("false")) {
                        return false;
                    }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
#### Snippet
```java

    private void updateConfigurationFile(Properties prop) {
        try (OutputStream output = new FileOutputStream(CONFIGURATION_PATH)) {
            prop.setProperty(FIRST_RUN_KEY, "false");
            prop.store(output, "Azure Gradle Plugin configurations");
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
#### Snippet
```java
            final File configurationFile = new File(CONFIGURATION_PATH);
            if (configurationFile.exists()) {
                try (InputStream input = new FileInputStream(CONFIGURATION_PATH)) {
                    prop.load(input);
                    final String firstRunValue = prop.getProperty(FIRST_RUN_KEY);
```

## RuleId[id=Deprecation]
### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/util/FunctionUtils.java`
#### Snippet
```java
    private static final String LOCAL_SETTINGS_JSON_NOT_FOUND = "File 'local.settings.json' cannot be found at staging directory.";

    public static void checkStagingDirectory(String stagingFolder) throws AzureExecutionException {
        final File file = new File(stagingFolder);
        if (!file.exists() || !file.isDirectory()) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/util/FunctionUtils.java`
#### Snippet
```java
        final File file = new File(stagingFolder);
        if (!file.exists() || !file.isDirectory()) {
            throw new AzureExecutionException(STAGE_DIR_NOT_FOUND);
        }
        AzureMessager.getMessager().info(STAGE_DIR_FOUND + stagingFolder);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/util/FunctionUtils.java`
#### Snippet
```java
        final File hostJson = new File(file, PackageHandler.HOST_JSON);
        if (!hostJson.exists() || !hostJson.isFile()) {
            throw new AzureExecutionException(HOST_JSON_NOT_FOUND);
        }

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/util/FunctionUtils.java`
#### Snippet
```java
        final File localSettingsJson = new File(file, PackageHandler.LOCAL_SETTINGS_JSON);
        if (!localSettingsJson.exists() || !localSettingsJson.isFile()) {
            throw new AzureExecutionException(LOCAL_SETTINGS_JSON_NOT_FOUND);
        }
    }
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java
    }

    protected void validateArtifactCompileVersion(RuntimeConfig runtime) throws AzureExecutionException {
        if (runtime.os() == OperatingSystem.DOCKER) {
            return;
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java

    @Nonnull
    private FunctionAppBase<?, ?, ?> createOrUpdateFunctionApp() throws AzureExecutionException {
        final FunctionApp app = getFunctionApp();
        final FunctionAppConfig functionConfig = (FunctionAppConfig) new FunctionAppConfig()
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/DeployHandler.java`
#### Snippet
```java
    }

    public void execute() throws AzureExecutionException {
        TelemetryAgent.getInstance().addDefaultProperty(FUNCTION_JAVA_VERSION_KEY, String.valueOf(javaVersion()));
        TelemetryAgent.getInstance().addDefaultProperty(DISABLE_APP_INSIGHTS_KEY, String.valueOf(ctx.isDisableAppInsights()));
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java

    private void installExtension(final FunctionCoreToolsHandler handler, Set<BindingEnum> bindingEnums)
        throws AzureExecutionException {
        AzureMessager.getMessager().info(LINE_FEED + INSTALL_EXTENSIONS);
        if (!isInstallingExtensionNeeded(bindingEnums)) {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java

    private Map<String, FunctionConfiguration> getFunctionConfigurations(final AnnotationHandler handler,
                                                                         final Set<Method> methods) throws AzureExecutionException {
        AzureMessager.getMessager().info(LINE_FEED + GENERATE_CONFIG);
        final Map<String, FunctionConfiguration> configMap = handler.generateConfigurations(methods);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
    }

    public void execute() throws AzureExecutionException, IOException {
        final AnnotationHandler annotationHandler = getAnnotationHandler();
        final Set<Method> methods = findAnnotatedMethods(annotationHandler);
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java

        if (methods.size() == 0) {
            throw new AzureExecutionException(NO_FUNCTIONS);
        }

```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
    }

    private void copyLocalSettingJsonFile() throws AzureExecutionException, IOException {
        AzureMessager.getMessager().info(LINE_FEED + SAVE_LOCAL_SETTINGS_JSON);
        final File localSettingJsonTargetFile = Paths.get(this.deploymentStagingDirectoryPath, LOCAL_SETTINGS_JSON)
```

### Deprecation
'com.microsoft.azure.toolkit.lib.common.exception.AzureExecutionException' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
        final File localSettingJsonSrcFile = new File(project.getBaseDirectory().toFile(), LOCAL_SETTINGS_JSON);
        if (localSettingJsonSrcFile.exists() && localSettingJsonSrcFile.length() == 0) {
            throw new AzureExecutionException("The " + localSettingJsonSrcFile.getAbsolutePath() +
                " file is empty, please check the document at" + DOCS_LINK);
        } else {
```

### Deprecation
'com.microsoft.azure.toolkit.lib.legacy.function.handlers.AnnotationHandlerImpl' is deprecated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java

    private AnnotationHandler getAnnotationHandler() {
        return new AnnotationHandlerImpl();
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getExitValue` may produce `NullPointerException`
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/task/LocalRunTask.java`
#### Snippet
```java
            this.setIgnoreExitValue(true);
            super.exec();
            final int code = this.getExecResult().getExitValue();
            for (final Long validCode : CommandUtils.getValidReturnCodes()) {
                if (validCode != null && validCode.intValue() == code) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `instance` may be 'final'
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
#### Snippet
```java
    private final String installationId = InstallationIdUtils.getHashMac();

    private static TelemetryAgent instance = new TelemetryAgent();

    public static TelemetryAgent getInstance() {
```

## RuleId[id=Lombok]
### Lombok
Class contains required fields, you have to force NoArgsConstructor.
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/AzureWebappPluginExtension.java`
#### Snippet
```java
import java.util.Map;

@NoArgsConstructor
public class AzureWebappPluginExtension {
    public static final String JAVA_VERSION_KEY = "javaVersion";
```

## RuleId[id=NullableProblems]
### NullableProblems
Primitive type members cannot be annotated
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsPlugin.java`
#### Snippet
```java
    }

    @Nullable
    private static void mergeCommandLineParameters(final AzureFunctionsExtension config) {
        final JavaPropsMapper mapper = new JavaPropsMapper();
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setLocalDebug(String localDebug) {
        this.localDebug = localDebug;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setAppServicePlanResourceGroup(String appServicePlanResourceGroup) {
        this.appServicePlanResourceGroup = appServicePlanResourceGroup;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public GradleAuthConfig getAuth() {
        return auth;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getPricingTier() {
        return pricingTier;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getAppServicePlanName() {
        return appServicePlanName;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getResourceGroup() {
        return resourceGroup;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getSubscription() {
        return subscription;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setAppServicePlanName(String appServicePlanName) {
        this.appServicePlanName = appServicePlanName;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public GradleRuntimeConfig getRuntime() {
        return runtime;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setPricingTier(String pricingTier) {
        this.pricingTier = pricingTier;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getLocalDebug() {
        return this.localDebug;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getAppServicePlanResourceGroup() {
        return appServicePlanResourceGroup;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public Boolean getAllowTelemetry() {
        return allowTelemetry;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public Deployment getDeployment() {
        return deployment;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setRegion(String region) {
        this.region = region;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getAppInsightsInstance() {
        return appInsightsInstance;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public GradleDeploymentSlotConfig getDeploymentSlot() {
        return deploymentSlot;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getRegion() {
        return region;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    @Input
    @Optional
    public String getAppInsightsKey() {
        return appInsightsKey;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/AzureFunctionsExtension.java`
#### Snippet
```java
    }

    public void setAllowTelemetry(Boolean allowTelemetry) {
        this.allowTelemetry = allowTelemetry;
    }
```

### NullableProblems
Primitive type members cannot be annotated
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/AzureWebappPlugin.java`
#### Snippet
```java
    }

    @Nullable
    private static void mergeCommandLineParameters(final AzureWebappPluginExtension config) {
        final JavaPropsMapper mapper = new JavaPropsMapper();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `Region.fromName(config.region()) != null` is always `true` when reached
in `azure-webapp-gradle-plugin/src/main/java/com/microsoft/azure/plugin/webapps/gradle/DeployTask.java`
#### Snippet
```java

    private void normalizeConfigValue(GradleWebAppConfig config) {
        if (StringUtils.isNotBlank(config.region()) && Region.fromName(config.region()) != null) {
            config.region(Region.fromName(config.region()).getName());
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/task/PackageTask.java`
#### Snippet
```java
                FileUtils.cleanDirectory(stagingFolder);
            } else {
                stagingFolder.mkdirs();
            }
            final PackageHandler packageHandler = new PackageHandler(ctx.getProject(), ctx.getDeploymentStagingDirectoryPath());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
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
in `azure-gradle-plugins-common/src/main/java/com/microsoft/azure/gradle/temeletry/TelemetryAgent.java`
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
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/GradleFunctionContext.java`
#### Snippet
```java
                    // If staging directory doesn't exist, create one and delete it on exit
                    if (!stagingDirectory.exists()) {
                        stagingDirectory.mkdirs();
                    }
                }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `azure-functions-gradle-plugin/src/main/java/com/microsoft/azure/plugin/functions/gradle/handler/PackageHandler.java`
#### Snippet
```java
            throw new AzureToolkitRuntimeException("Cannot create folder: " + targetFile.getParentFile().getAbsolutePath());
        }
        targetFile.createNewFile();
        objectWriter.writeValue(targetFile, object);
    }
```

