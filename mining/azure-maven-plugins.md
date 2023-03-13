# azure-maven-plugins 
 
# Bad smells
I found 808 bad smells with 75 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 132 | false |
| DataFlowIssue | 95 | false |
| BoundedWildcard | 60 | false |
| SystemOutErr | 52 | false |
| UtilityClassWithoutPrivateConstructor | 46 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 38 | false |
| DynamicRegexReplaceableByCompiledPattern | 35 | false |
| UNUSED_IMPORT | 29 | false |
| RedundantFieldInitialization | 27 | false |
| PublicFieldAccessedInSynchronizedContext | 20 | false |
| ZeroLengthArrayInitialization | 19 | false |
| Convert2MethodRef | 19 | false |
| AssignmentToMethodParameter | 19 | false |
| UnnecessaryFullyQualifiedName | 17 | false |
| SizeReplaceableByIsEmpty | 15 | true |
| UnnecessarySuperQualifier | 15 | false |
| EmptyMethod | 12 | false |
| IgnoreResultOfCall | 10 | false |
| SynchronizeOnThis | 10 | false |
| InstanceofCatchParameter | 9 | false |
| UnresolvedPropertyKey | 8 | false |
| RegExpRedundantEscape | 5 | false |
| UnnecessaryReturn | 5 | true |
| RedundantMethodOverride | 5 | false |
| NestedAssignment | 5 | false |
| IndexOfReplaceableByContains | 5 | false |
| DeprecatedIsStillUsed | 5 | false |
| UnnecessaryToStringCall | 5 | true |
| CommentedOutCode | 4 | false |
| NullableProblems | 4 | false |
| RedundantStringFormatCall | 4 | false |
| FieldMayBeStatic | 4 | false |
| UnnecessarySemicolon | 4 | false |
| NonSerializableFieldInSerializableClass | 4 | false |
| AbstractClassNeverImplemented | 3 | false |
| UnusedAssignment | 3 | false |
| SimplifyStreamApiCallChains | 3 | false |
| CatchMayIgnoreException | 3 | false |
| ObsoleteCollection | 2 | false |
| UnnecessaryQualifierForThis | 2 | false |
| MissortedModifiers | 2 | false |
| DefaultAnnotationParam | 2 | false |
| RedundantImplements | 2 | false |
| CallToStringConcatCanBeReplacedByOperator | 2 | false |
| DoubleBraceInitialization | 2 | false |
| SetReplaceableByEnumSet | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| AssignmentToLambdaParameter | 2 | false |
| UnnecessaryModifier | 1 | true |
| DoubleCheckedLocking | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| InstanceofIncompatibleInterface | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
| Lombok | 1 | false |
| RedundantUnmodifiable | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| ConstantValue | 1 | false |
| Java8MapForEach | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RedundantCollectionOperation | 1 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| RedundantSuppression | 1 | false |
| UnnecessaryBoxing | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| CopyConstructorMissesField | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=UnnecessaryModifier]
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
Commented out code (2 lines)
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/Utils.java`
#### Snippet
```java
    private static final int POLLING_INTERVAL = 5;

//    protected static final List<String> DEPLOYMENT_PROCESSING_STATUS =
//            Arrays.asList(DeploymentResourceStatus.COMPILING.toString(), DeploymentResourceStatus.ALLOCATING.toString(), DeploymentResourceStatus.UPGRADING.toString());

```

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

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/FTPUtils.java`
#### Snippet
```java

    private static void changeDirectoryWithCreate(final FTPClient ftpClient, String targetPath) throws IOException {
        final Stack<Path> pathStacks = new Stack<>();
        Path path = Paths.get(targetPath);
        while (!ftpClient.changeWorkingDirectory(path.toString())) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/FTPUtils.java`
#### Snippet
```java

    private static void changeDirectoryWithCreate(final FTPClient ftpClient, String targetPath) throws IOException {
        final Stack<Path> pathStacks = new Stack<>();
        Path path = Paths.get(targetPath);
        while (!ftpClient.changeWorkingDirectory(path.toString())) {
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `PATTERN_MAP.keySet()` may be replaced with 'entrySet()' iteration
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/telemetry/AzureTelemetryClient.java`
#### Snippet
```java
            return Arrays.stream(value.split("\\r?\\n")).map(line -> {
                final String input = FILE_PATH_PATTERN.matcher(line).replaceAll("<REDACTED: user-file-path>");
                for (final Pattern pattern : PATTERN_MAP.keySet()) {
                    if (pattern.matcher(input).find()) {
                        return PATTERN_MAP.get(pattern);
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `CreateVirtualMachineTask` on 'this' is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/task/CreateVirtualMachineTask.java`
#### Snippet
```java
        final AzureString title = AzureString.format("Create Virtual machine ({0})", vmDraft.getName());
        tasks.add(new AzureTask<>(title, () -> {
            CreateVirtualMachineTask.this.result = vmDraft.createIfNotExist();
            return CreateVirtualMachineTask.this.result;
        }));
```

### UnnecessaryQualifierForThis
Qualifier `CreateVirtualMachineTask` on 'this' is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/compute/virtualmachine/task/CreateVirtualMachineTask.java`
#### Snippet
```java
        tasks.add(new AzureTask<>(title, () -> {
            CreateVirtualMachineTask.this.result = vmDraft.createIfNotExist();
            return CreateVirtualMachineTask.this.result;
        }));
        return tasks;
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`values.size() > 0` can be replaced with '!values.isEmpty()'
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/XMLUtils.java`
#### Snippet
```java
    public static void addNotEmptyListElement(Element element, String attribute, String subAttribute,
                                              List<String> values) {
        if (values != null && values.size() > 0) {
            final DOMElement resultNode = new DOMElement(attribute);
            for (final String value : values) {
```

### SizeReplaceableByIsEmpty
`configMap.size() == 0` can be replaced with 'configMap.isEmpty()'
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
        Log.info(GENERATE_CONFIG);
        final Map<String, FunctionConfiguration> configMap = handler.generateConfigurations(methods);
        if (configMap.size() == 0) {
            Log.info(GENERATE_SKIP);
        } else {
```

### SizeReplaceableByIsEmpty
`configMap.size() == 0` can be replaced with 'configMap.isEmpty()'
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
        Log.info("");
        Log.info(VALIDATE_CONFIG);
        if (configMap.size() == 0) {
            Log.info(VALIDATE_SKIP);
        } else {
```

### SizeReplaceableByIsEmpty
`configMap.size() == 0` can be replaced with 'configMap.isEmpty()'
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
        Log.info("");
        Log.info(SAVE_FUNCTION_JSONS);
        if (configMap.size() == 0) {
            Log.info(SAVE_SKIP);
        } else {
```

### SizeReplaceableByIsEmpty
`methods.size() == 0` can be replaced with 'methods.isEmpty()'
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
        }

        if (methods.size() == 0) {
            Log.info(NO_FUNCTIONS);
            return;
```

### SizeReplaceableByIsEmpty
`this.publicProjects.size() > 0` can be replaced with '!this.publicProjects.isEmpty()'
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/ConfigMojo.java`
#### Snippet
```java
            changesToConfirm.put("App " + English.plural("name", this.appNameByProject.size()),
                String.join(",", appNameByProject.values()));
            if (this.publicProjects != null && this.publicProjects.size() > 0) {
                changesToConfirm.put("Public " + English.plural("app", this.publicProjects.size()),
                        publicProjects.stream().map(p -> appNameByProject.get(p)).collect(Collectors.joining(",")));
```

### SizeReplaceableByIsEmpty
`options.size() > 0` can be replaced with '!options.isEmpty()'
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
                    TemplateResources.getResource(helpMessage)));
            if (settings != null && !settings.isInteractiveMode()) {
                if (options != null && options.size() > 0) {
                    final String foundElement = findElementInOptions(options, initValue);
                    initValue = foundElement == null ? options.get(0) : foundElement;
```

### SizeReplaceableByIsEmpty
`options.size() == 0` can be replaced with 'options.isEmpty()'
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
        final Map<String, Object> variables = createVariableTables(templateId);
        final boolean isRequired = TemplateUtils.evalBoolean("required", variables);
        if (options.size() == 0) {
            if (isRequired) {
                throw new InvalidConfigurationException(TemplateUtils.evalText("message.empty_options", variables));
```

### SizeReplaceableByIsEmpty
`options.size() == 0` can be replaced with 'options.isEmpty()'
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
        final Map<String, Object> variables = createVariableTables(templateId);
        final boolean allowEmpty = TemplateUtils.evalBoolean("allow_empty", variables);
        if (options.size() == 0) {
            if (!allowEmpty) {
                throw new InvalidConfigurationException(TemplateUtils.evalText("message.empty_options", variables));
```

### SizeReplaceableByIsEmpty
`stderr.length() > 0` can be replaced with '!stderr.isEmpty()'
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java
            final String stdout = IOUtil.toString(p.getInputStream(), "UTF-8");
            logger.debug(String.format("STDOUT: %s", stdout));
            if (stderr != null && stderr.length() > 0){
                if (exitCode != 0){
                    logger.error(String.format("Process exited with exit code %d", exitCode));
```

### SizeReplaceableByIsEmpty
`defaultValue.size() > 0` can be replaced with '!defaultValue.isEmpty()'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
    public <T> List<T> promoteMultipleEntities(String header, String promotePrefix, String selectNoneMessage, List<T> entities,
            Function<T, String> getNameFunc, boolean allowEmpty, String enterPromote, List<T> defaultValue) throws IOException {
        final boolean hasDefaultValue = defaultValue != null && defaultValue.size() > 0;
        final List<T> res = new ArrayList<>();

```

### SizeReplaceableByIsEmpty
`res.size() > 0` can be replaced with '!res.isEmpty()'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
                        res.add(entities.get(i - 1));
                    }
                    if (res.size() > 0 || allowEmpty) {
                        return res;
                    }
```

### SizeReplaceableByIsEmpty
`connectionStrings.size() > 0` can be replaced with '!connectionStrings.isEmpty()'
in `azure-toolkit-libs/azure-toolkit-eventhubs-lib/src/main/java/com/microsoft/azure/toolkit/lib/eventhubs/EventHubsInstance.java`
#### Snippet
```java
                        .collect(Collectors.toList()))
                .orElse(new ArrayList<>());
        if (connectionStrings.size() > 0) {
            return connectionStrings.get(0).getKeys().primaryConnectionString();
        }
```

### SizeReplaceableByIsEmpty
`configMap.size() == 0` can be replaced with 'configMap.isEmpty()'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java
        AzureMessager.getMessager().info(LINE_FEED + GENERATE_CONFIG);
        final Map<String, FunctionConfiguration> configMap = generateConfigurationsInner(project, methods);
        if (configMap.size() == 0) {
            AzureMessager.getMessager().info(GENERATE_SKIP);
        }
```

### SizeReplaceableByIsEmpty
`configMap.size() == 0` can be replaced with 'configMap.isEmpty()'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java
                                        final Map<String, FunctionConfiguration> configMap) throws IOException {
        AzureMessager.getMessager().info(LINE_FEED + SAVE_FUNCTION_JSONS);
        if (configMap.size() == 0) {
            AzureMessager.getMessager().info(SAVE_SKIP);
        } else {
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

## RuleId[id=UnnecessaryReturn]
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
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
            }
        } else if (newRuntime.getOperatingSystem() == OperatingSystem.DOCKER) {
            return; // skip for docker, as docker configuration will be handled in `updateDockerConfiguration`
        } else {
            throw new AzureToolkitRuntimeException(String.format(UNSUPPORTED_OPERATING_SYSTEM, newRuntime.getOperatingSystem()));
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super ValidationMessage`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
    }

    protected void validateConfiguration(Consumer<ValidationMessage> validationMessageConsumer, boolean failOnError) {
        final List<ValidationMessage> validate = SchemaValidator.getInstance().validate("WebAppConfiguration", this, "configuration");
        validate.forEach(message -> validationMessageConsumer.accept(message));
```

### BoundedWildcard
Can generalize to `? extends DeploymentResource`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/task/DeployExternalResourcesTask.java`
#### Snippet
```java
    }

    private void deployExternalResources(final AppServiceAppBase<?, ?, ?> target, final List<DeploymentResource> resources) {
        if (resources.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends DeploymentResource`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/serializer/ConfigurationSerializer.java`
#### Snippet
```java
        throws MojoFailureException;

    protected DOMElement createResourcesNode(List<DeploymentResource> resources) {
        final DOMElement resourceRootNode = new DOMElement("resources");
        for (final DeploymentResource resource : resources) {
```

### BoundedWildcard
Can generalize to `? extends FunctionConfiguration`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
    //region Validate function configurations

    protected void validateFunctionConfigurations(final Map<String, FunctionConfiguration> configMap) {
        Log.info("");
        Log.info(VALIDATE_CONFIG);
```

### BoundedWildcard
Can generalize to `? extends FunctionConfiguration`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
    }

    protected Set<BindingEnum> getFunctionBindingEnums(Map<String, FunctionConfiguration> configMap) {
        final Set<BindingEnum> result = new HashSet<>();
        configMap.values().forEach(configuration -> configuration.getBindings().
```

### BoundedWildcard
Can generalize to `? extends FunctionConfiguration`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
    }

    protected void trackFunctionProperties(Map<String, FunctionConfiguration> configMap) {
        final List<String> bindingTypeSet = configMap.values().stream().flatMap(configuration -> configuration.getBindings().stream())
                .map(Binding::getType)
```

### BoundedWildcard
Can generalize to `? extends WebAppOption`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
    }

    private static WebAppOption selectAzureWebApp(List<WebAppOption> javaOrDockerWebapps, String webAppType, Subscription targetSubscription) {
        final List<WebAppOption> options = new ArrayList<>();
        // check empty: second time
```

### BoundedWildcard
Can generalize to `? extends DeploymentResource`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
    }

    protected static List<WebAppArtifact> convertResourceToArtifacts(List<DeploymentResource> resources) throws AzureExecutionException {
        try {
            return CollectionUtils.isEmpty(resources) ? Collections.emptyList() :
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
    }

    private static <T extends ExpandableParameter> T parseExpandableParameter(Function<String, T> parser, String input, String prompt) {
        final T result = parser.apply(input);
        if (StringUtils.isNotEmpty(input) && result.isExpandedValue()) {
```

### BoundedWildcard
Can generalize to `? extends AzureTask`
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/DeployMojo.java`
#### Snippet
```java
    }

    protected boolean confirm(List<AzureTask<?>> tasks) throws MojoFailureException {
        try (final IPrompter prompter = new DefaultPrompter()) {
            System.out.println(CONFIRM_PROMPT_START);
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
    }

    protected void assureInputInBatchMode(final String input, final Function<String, Boolean> validator,
                                          final Consumer<String> setter, final boolean required)
            throws MojoFailureException {
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java

    protected void assureInputInBatchMode(final String input, final Function<String, Boolean> validator,
                                          final Consumer<String> setter, final boolean required)
            throws MojoFailureException {
        if (validator.apply(input)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java

    protected void assureInputFromUser(final String prompt, final String initValue,
                                       final Function<String, Boolean> validator, final String errorMessage,
                                       final Consumer<String> setter) {
        if (validator.apply(initValue)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
    protected void assureInputFromUser(final String prompt, final String initValue,
                                       final Function<String, Boolean> validator, final String errorMessage,
                                       final Consumer<String> setter) {
        if (validator.apply(initValue)) {
            Log.info(FOUND_VALID_VALUE);
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
    // todo: Support default values for list variables input
    protected void assureInputFromUser(final String prompt, final String initValue, final List<String> options,
                                       final Consumer<String> setter) {
        final String option = findElementInOptions(options, initValue);
        if (option != null) {
```

### BoundedWildcard
Can generalize to `? extends FunctionTemplate`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
    }

    protected List<String> getTemplateNames(final List<FunctionTemplate> templates) {
        return templates.stream().map(t -> t.getMetadata().getName()).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends SecurityRule`
in `azure-toolkit-libs/azure-toolkit-compute-lib/src/main/java/com/microsoft/azure/toolkit/lib/network/networksecuritygroup/NetworkSecurityGroupDraft.java`
#### Snippet
```java
    }

    private static void applySecurityRule(DefinitionStages.WithCreate withCreate, List<SecurityRule> securityRuleList) {
        for (int priority = BASE_PRIORITY, count = 0; count < securityRuleList.size(); count++, priority += PRIORITY_STEP) {
            final SecurityRule securityRule = securityRuleList.get(count);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/ProjectUtils.java`
#### Snippet
```java
    }

    private static List<Path> collectDependencyPaths(Set<Artifact> dependencies) {
        final List<Path> results = new ArrayList<>();
        for (final Artifact artifact : dependencies) {
```

### BoundedWildcard
Can generalize to `? extends Resource`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenConfigUtils.java`
#### Snippet
```java
    }

    public static void addResourcesConfig(Element root, List<Resource> resources) {
        final DOMElement resourceRootNode = new DOMElement("resources");
        for (final Resource resource : resources) {
```

### BoundedWildcard
Can generalize to `? extends Resource`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java
    }

    public static List<File> getArtifacts(@Nullable List<Resource> resources) {
        if (resources != null) {
            return resources.stream().flatMap(r -> getArtifacts(r).stream()).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends File`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java

    @Nullable
    public static File getExecutableJarFiles(Collection<File> files) throws MojoExecutionException {
        if (files.isEmpty()) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends Subscription`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    protected String getTargetSubscriptionId(String defaultSubscriptionId,
                                             List<Subscription> subscriptions,
                                             List<Subscription> selectedSubscriptions) throws IOException, AzureExecutionException {
        String targetSubscriptionId = defaultSubscriptionId;

```

### BoundedWildcard
Can generalize to `? extends T`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/Azure.java`
#### Snippet
```java

    @Nonnull
    public static <T extends AzService> List<T> getServices(Class<T> clazz) {
        return ServiceManager.getServices().stream().filter(clazz::isInstance).map(clazz::cast).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String promoteString(String message, String defaultValue, Function<String, InputValidateResult<String>> verify, boolean isRequired)
            throws IOException {
        final boolean hasDefaultValue = StringUtils.isNotBlank(defaultValue);
```

### BoundedWildcard
Can generalize to `? extends InputValidateResult`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String promoteString(String message, String defaultValue, Function<String, InputValidateResult<String>> verify, boolean isRequired)
            throws IOException {
        final boolean hasDefaultValue = StringUtils.isNotBlank(defaultValue);
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java

    private <T> T loopInput(T defaultValue, boolean hasDefaultValue, boolean isRequired, String emptyPromoteMessage, String promoteMessage,
            Function<String, InputValidateResult<T>> handleInput) throws IOException {
        while (true) {
            final String input = reader.readLine();
```

### BoundedWildcard
Can generalize to `? extends InputValidateResult`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java

    private <T> T loopInput(T defaultValue, boolean hasDefaultValue, boolean isRequired, String emptyPromoteMessage, String promoteMessage,
            Function<String, InputValidateResult<T>> handleInput) throws IOException {
        while (true) {
            final String input = reader.readLine();
```

### BoundedWildcard
Can generalize to `? extends T`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
    }

    private static <T> void printOptionList(String message, List<T> entities, T defaultEntity, Function<T, String> getNameFunc) {
        int index = 1;
        System.out.println(message);
```

### BoundedWildcard
Can generalize to `? super T`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
    }

    private static <T> void printOptionList(String message, List<T> entities, T defaultEntity, Function<T, String> getNameFunc) {
        int index = 1;
        System.out.println(message);
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/aspect/ExpressionUtils.java`
#### Snippet
```java
    }

    private static void bindPredefinedFunctions(@Nonnull Map<String, Object> bindings) {
        bindings.put("nameFromResourceId", new MethodClosure(ResourceUtils.class, "nameFromResourceId"));
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/Utils.java`
#### Snippet
```java
    }

    public static <K, V> Map<K, V> groupByIgnoreDuplicate(Collection<V> list, Function<? super V, ? extends K> keyMapper) {
        return list.stream().collect(Collectors.toMap(keyMapper, item -> item, (item1, item2) -> item1));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/Utils.java`
#### Snippet
```java
    }

    public static <T> T selectFirstOptionIfCurrentInvalid(String name, List<T> options, T value) {
        if (options.isEmpty()) {
            throw new AzureToolkitRuntimeException(String.format("No %s is available.", name));
```

### BoundedWildcard
Can generalize to `? extends R`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
    }

    private void addResources(Map<String, R> loadedResources) {
        final Set<String> added = loadedResources.keySet();
        log.debug("[{}]:reload().added={}", this.name, added);
```

### BoundedWildcard
Can generalize to `? extends R`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
    }

    private void setResources(Map<String, R> loadedResources) {
        final Set<String> localResources = this.resources.values().stream().filter(Optional::isPresent).map(Optional::get)
            .map(AbstractAzResource::getId).map(String::toLowerCase).collect(Collectors.toSet());
```

### BoundedWildcard
Can generalize to `? super D`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
    }

    public Action<D> enableWhen(@Nonnull Predicate<D> enableWhen) {
        this.enableWhen = enableWhen;
        return this;
```

### BoundedWildcard
Can generalize to `? extends R`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java

    @Nullable
    public R doModify(@Nonnull Callable<R> body, @Nullable String status) {
        if (!this.lock.tryLock()) {
            AzureMessager.getMessager().warning(AzureString.format("%s (%s) is %s, waiting until it's finished.", this.getResourceTypeName(), this.getName(), this.getStatus()));
```

### BoundedWildcard
Can generalize to `? extends T`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/Utils.java`
#### Snippet
```java
     * @return the first resource which fit the predicate or the last result before timeout
     */
    public static <T> T pollUntil(Callable<T> callable, @Nonnull Predicate<T> predicate, int timeOutInSeconds, int pollingInterval) {
        final long timeout = System.currentTimeMillis() + timeOutInSeconds * 1000L;
        return Observable.interval(pollingInterval, TimeUnit.SECONDS)
```

### BoundedWildcard
Can generalize to `? super T`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/Utils.java`
#### Snippet
```java
     * @return the first resource which fit the predicate or the last result before timeout
     */
    public static <T> T pollUntil(Callable<T> callable, @Nonnull Predicate<T> predicate, int timeOutInSeconds, int pollingInterval) {
        final long timeout = System.currentTimeMillis() + timeOutInSeconds * 1000L;
        return Observable.interval(pollingInterval, TimeUnit.SECONDS)
```

### BoundedWildcard
Can generalize to `? extends Document`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoDocumentModule.java`
#### Snippet
```java
    }

    private Stream<Document> readDocuments(final MongoCursor<Document> iterator) {
        if (iterator == null || !iterator.hasNext()) {
            if (Objects.nonNull(iterator)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/CreateOrUpdateFunctionAppTask.java`
#### Snippet
```java
    }

    private void setDefaultAppSetting(Map<String, String> result, String settingName, String settingIsEmptyMessage,
                                      String defaultValue, String warningMessage) {
        final String setting = result.get(settingName);
```

### BoundedWildcard
Can generalize to `? extends T`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/CreateOrUpdateFunctionAppTask.java`
#### Snippet
```java
    }

    private <T> void registerSubTask(AzureTask<T> task, Consumer<T> consumer) {
        if (task != null) {
            tasks.add(new AzureTask<>(() -> {
```

### BoundedWildcard
Can generalize to `? super T`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/CreateOrUpdateFunctionAppTask.java`
#### Snippet
```java
    }

    private <T> void registerSubTask(AzureTask<T> task, Consumer<T> consumer) {
        if (task != null) {
            tasks.add(new AzureTask<>(() -> {
```

### BoundedWildcard
Can generalize to `? extends KuduDeploymentResult`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
    }

    private void trackDeployment(final WebAppBase<?, ?, ?> target, final AtomicReference<KuduDeploymentResult> resultReference) {
        final KuduDeploymentResult kuduDeploymentResult = resultReference.get();
        if (kuduDeploymentResult == null) {
```

### BoundedWildcard
Can generalize to `? extends WebAppArtifact`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
    }

    public DeployWebAppTask(WebAppBase<?, ?, ?> webApp, List<WebAppArtifact> artifacts, boolean restartSite, Boolean waitDeploymentComplete) {
        this.webApp = webApp;
        this.artifacts = artifacts;
```

### BoundedWildcard
Can generalize to `? extends T`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/Utils.java`
#### Snippet
```java

    @Deprecated
    public static <T> T selectFirstOptionIfCurrentInvalid(String name, List<T> options, T value) {
        if (options.isEmpty()) {
            throw new AzureToolkitRuntimeException(String.format("No %s is available.", name));
```

### BoundedWildcard
Can generalize to `? extends AppSetting`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/Utils.java`
#### Snippet
```java
public class Utils {

    public static Map<String, String> normalizeAppSettings(Map<String, AppSetting> input) {
        return input.entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().value()));
```

### BoundedWildcard
Can generalize to `? super HttpPipelinePolicy`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/Utils.java`
#### Snippet
```java

    public static List<HttpPipelinePolicy> getPolicyFromPipeline(@Nonnull final HttpPipeline httpPipeline,
                                                                 @Nullable final Predicate<HttpPipelinePolicy> filter) {
        final List<HttpPipelinePolicy> policies = new ArrayList<>();
        for (int i = 0, count = httpPipeline.getPolicyCount(); i < count; ++i) {
```

### BoundedWildcard
Can generalize to `? extends FunctionAnnotation`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackagerBase.java`
#### Snippet
```java
    }

    private List<Binding> parseAnnotations(List<FunctionAnnotation> annotationBindings,
                                           Function<FunctionAnnotation, Binding> annotationParser) {
        final List<Binding> bindings = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super FunctionAnnotation`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackagerBase.java`
#### Snippet
```java

    private List<Binding> parseAnnotations(List<FunctionAnnotation> annotationBindings,
                                           Function<FunctionAnnotation, Binding> annotationParser) {
        final List<Binding> bindings = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends Binding`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackagerBase.java`
#### Snippet
```java

    private List<Binding> parseAnnotations(List<FunctionAnnotation> annotationBindings,
                                           Function<FunctionAnnotation, Binding> annotationParser) {
        final List<Binding> bindings = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends FunctionMethod`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackagerBase.java`
#### Snippet
```java
    }

    protected Map<String, FunctionConfiguration> generateConfigurationsInner(FunctionProject project, List<FunctionMethod> methods) {
        final Map<String, FunctionConfiguration> configMap = new HashMap<>();
        for (final FunctionMethod method : methods) {
```

### BoundedWildcard
Can generalize to `? super Binding`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackagerBase.java`
#### Snippet
```java
    }

    private void processParameterAnnotations(final FunctionMethod method, final List<Binding> bindings) {
        for (final FunctionAnnotation[] paramAnnotations : method.getParameterAnnotations()) {
            bindings.addAll(parseAnnotations(Arrays.asList(paramAnnotations), this::parseParameterAnnotation));
```

### BoundedWildcard
Can generalize to `? extends Binding`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackagerBase.java`
#### Snippet
```java
    }

    private void patchStorageBinding(final FunctionMethod method, final List<Binding> bindings) {
        final Optional<FunctionAnnotation> storageAccount = method.getAnnotations().stream()
            .filter(annotation -> annotation.isAnnotationType(STORAGE_ACCOUNT))
```

### BoundedWildcard
Can generalize to `? extends FunctionConfiguration`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java
    }

    private List<String> getFunctionBindingList(Map<String, FunctionConfiguration> configMap) {
        return configMap.values().stream().flatMap(configuration -> configuration.getBindings().stream())
            .map(Binding::getType)
```

### BoundedWildcard
Can generalize to `? extends FunctionConfiguration`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java
    }

    private Set<BindingEnum> getFunctionBindingEnums(Map<String, FunctionConfiguration> configMap) {
        final Set<BindingEnum> result = new HashSet<>();
        configMap.values().forEach(configuration -> configuration.getBindings().
```

### BoundedWildcard
Can generalize to `? extends FunctionConfiguration`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java
    }

    private void validateFunctionConfigurations(final Map<String, FunctionConfiguration> configMap) {
        AzureMessager.getMessager().info(LINE_FEED + VALIDATE_CONFIG);
        if (configMap.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super Binding`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandlerImpl.java`
#### Snippet
```java
    }

    protected void processParameterAnnotations(final Method method, final List<Binding> bindings) {
        for (final Parameter param : method.getParameters()) {
            bindings.addAll(parseAnnotations(param::getAnnotations, this::parseParameterAnnotation));
```

### BoundedWildcard
Can generalize to `? extends Binding`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandlerImpl.java`
#### Snippet
```java
    }

    protected void patchStorageBinding(final Method method, final List<Binding> bindings) {
        final FunctionMethod functionMethod = DefaultFunctionProject.create(method);
        final FunctionAnnotation storageAccount = functionMethod.getAnnotation(STORAGE_ACCOUNT);
```

### BoundedWildcard
Can generalize to `? super Annotation`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandlerImpl.java`
#### Snippet
```java

    protected List<Binding> parseAnnotations(Supplier<Annotation[]> annotationProvider,
                                             Function<Annotation, Binding> annotationParser) {
        final List<Binding> bindings = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends Binding`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandlerImpl.java`
#### Snippet
```java

    protected List<Binding> parseAnnotations(Supplier<Annotation[]> annotationProvider,
                                             Function<Annotation, Binding> annotationParser) {
        final List<Binding> bindings = new ArrayList<>();

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `WebAppConfigurationBuilder` has no concrete subclass
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/WebAppConfiguration.java`
#### Snippet
```java
    }

    public abstract static class WebAppConfigurationBuilder<
        C extends WebAppConfiguration,
        B extends WebAppConfiguration.WebAppConfigurationBuilder<C, B>
```

### AbstractClassNeverImplemented
Abstract class `AzureMessager` has no concrete subclass
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/AzureMessager.java`
#### Snippet
```java
import java.util.Optional;

public abstract class AzureMessager implements IAzureMessager {
    private static IAzureMessager defaultMessager;

```

### AbstractClassNeverImplemented
Abstract class `FunctionCliResolver` has no concrete subclass
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/FunctionCliResolver.java`
#### Snippet
```java
import static com.microsoft.azure.toolkit.lib.common.utils.CommandUtils.resolveCommandPath;

public abstract class FunctionCliResolver {
    private static final boolean isWindows = CommandUtils.isWindows();

```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `public @Nullable`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoCollectionDraft.java`
#### Snippet
```java

    @Override
    public @Nullable String getSharedKey() {
        return Optional.ofNullable(config).map(MongoCollectionConfig::getShardKey).orElseGet(super::getSharedKey);
    }
```

### MissortedModifiers
Missorted modifiers `public @Nonnull`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraCosmosDBAccount.java`
#### Snippet
```java

    @Override
    public @Nonnull List<AbstractAzResourceModule<?, ?, ?>> getSubModules() {
        return Collections.singletonList(this.keyspaceModule);
    }
```

## RuleId[id=NullableProblems]
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

### NullableProblems
Overridden methods are not annotated
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
    }

    @Nonnull
    @AzureOperation(name = "azure/resource.load_resources_by_page.type", params = {"this.getResourceTypeName()"})
    protected Iterator<? extends ContinuablePage<String, R>> loadResourcePagesFromAzure() {
```

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

## RuleId[id=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `CustomDecoratable`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/IAzureMessage.java`
#### Snippet
```java
    default String decorateText(@Nonnull AzureString text, @Nullable Supplier<String> dft) {
        String result = null;
        if (text instanceof CustomDecoratable) {
            result = ((CustomDecoratable) text).decorate(this);
        }
```

## RuleId[id=IgnoreResultOfCall]
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
Result of `InputStream.skip()` is ignored
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/Utils.java`
#### Snippet
```java
            final InputStream stream = jarFile.getInputStream(jarEntry);
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
            final int majorVersion = new BigInteger(version).intValueExact() - 44;
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Draft` is the same as one of its superclass' names
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/model/StorageFile.java`
#### Snippet
```java
    }

    interface Draft<T extends StorageFile, R> extends AzResource.Draft<T, R> {
        void setDirectory(Boolean directory);

```

## RuleId[id=RedundantMethodOverride]
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
Method `setDocumentFactory()` only delegates to its super method
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/PomUtils.java`
#### Snippet
```java

        @Override
        public void setDocumentFactory(DocumentFactory documentFactory) {
            super.setDocumentFactory(documentFactory);
        }
```

### RedundantMethodOverride
Method `hashCode()` only delegates to its super method
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzService.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
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

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
'map()' can be replaced with 'flatMap()'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/AppServiceAppBase.java`
#### Snippet
```java
    public String getKuduHostName() {
        return this.remoteOptional()
                .map(siteBase -> siteBase.hostnameSslStates().values().stream()
                        .filter(sslState -> sslState.hostType() == HostType.REPOSITORY)
                        .map(HostnameSslState::name)
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-sqlserver-lib/src/main/java/com/microsoft/azure/toolkit/lib/sqlserver/MicrosoftSqlServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.serverModule.getName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.serverModule.getName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourcesServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.groupModule.getName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.serverModule.getName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/StorageServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.storageModule.getName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.clusterModule.getName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.serverModule.getName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/CosmosServiceSubscription.java`
#### Snippet
```java

    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.cosmosDBAccountModule.getResourceTypeName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlDocumentModule.java`
#### Snippet
```java
    @Nullable
    public SqlDocument get(@Nonnull String id, @Nonnull String partitionKey, @Nullable String resourceGroup) {
        return super.get(getSqlDocumentResourceName(id, partitionKey), resourceGroup);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-applicationinsights-lib/src/main/java/com/microsoft/azure/toolkit/lib/applicationinsights/ApplicationInsightsServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.applicationInsightsModule.getName());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/AppServiceServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.webAppModule.getName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/AzureAppService.java`
#### Snippet
```java
        final ResourceId resourceId = ResourceId.fromString(id);
        if (resourceId.resourceType().equals(AppServicePlanModule.NAME)) {
            return super.doGetById(id);
        } else {
            boolean isFunctionRelated = false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/AzureAppService.java`
#### Snippet
```java
        final ResourceId resourceId = ResourceId.fromString(id);
        if (resourceId.resourceType().equals(AppServicePlanModule.NAME)) {
            return super.doGetOrInitById(id);
        } else {
            boolean isFunctionRelated = false;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/AppServiceAppBase.java`
#### Snippet
```java
    @Override
    protected WebSiteBase refreshRemoteFromAzure(@Nonnull WebSiteBase remote) {
        return super.loadRemote();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `azure-toolkit-libs/azure-toolkit-redis-lib/src/main/java/com/microsoft/azure/toolkit/redis/RedisServiceSubscription.java`
#### Snippet
```java
    @Nonnull
    public List<Region> listSupportedRegions() {
        return super.listSupportedRegions(this.cacheModule.getName());
    }

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
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppModule.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.model.AzResource;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
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
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppModule.java`
#### Snippet
```java
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.model.AzResource;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import com.azure.core.util.Configuration;`
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureEnvironmentUtils.java`
#### Snippet
```java

import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.Configuration;
import com.microsoft.azure.toolkit.lib.common.utils.Utils;
import org.apache.commons.lang3.StringUtils;
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
Unused import `import com.azure.cosmos.models.FeedResponse;`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlDocumentModule.java`
#### Snippet
```java
import com.azure.cosmos.models.CosmosItemRequestOptions;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.PartitionKey;
import com.azure.resourcemanager.resources.fluentcore.arm.ResourceId;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlDocumentModule.java`
#### Snippet
```java
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class SqlDocumentModule extends AbstractAzResourceModule<SqlDocument, SqlContainer, ObjectNode> {
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
Unused import `import com.microsoft.azure.toolkit.lib.springcloud.SpringCloudAppInstance;`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/config/SpringCloudDeploymentConfig.java`
#### Snippet
```java

import com.microsoft.azure.toolkit.lib.common.model.IArtifact;
import com.microsoft.azure.toolkit.lib.springcloud.SpringCloudAppInstance;
import com.microsoft.azure.toolkit.lib.springcloud.SpringCloudDeployment;
import com.microsoft.azure.toolkit.lib.springcloud.SpringCloudDeploymentDraft;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/StorageAccountModule.java`
#### Snippet
```java
import com.azure.resourcemanager.storage.models.StorageAccounts;
import com.microsoft.azure.toolkit.lib.common.model.AbstractAzResourceModule;
import com.microsoft.azure.toolkit.lib.common.operation.AzureOperation;

import javax.annotation.Nonnull;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/cache/Preloader.java`
#### Snippet
```java
            Object instance = null;
            // TODO: maybe support predefined variables, e.g. selected subscriptions
            if ((m.getParameterCount() == 0 || m.isVarArgs()) && (Modifier.isStatic(m.getModifiers()) || Objects.nonNull(instance = getSingleton(m)))) {
                log.fine(String.format("preloading [%s]", m.getName()));
                invoke(m, instance);
```

### NestedAssignment
Result of assignment expression used
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/NetUtils.java`
#### Snippet
```java
                 final BufferedReader br = new BufferedReader(inputStreamReader)) {
                String tmp;
                while ((tmp = br.readLine()) != null) {
                    ret.append(tmp);
                }
```

### NestedAssignment
Result of assignment expression used
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/NetUtils.java`
#### Snippet
```java
            final HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8));
            while ((ip = in.readLine()) != null) {
                if (StringUtils.isNotBlank(ip)) {
                    final String trimIp = StringUtils.trim(ip);
```

### NestedAssignment
Result of assignment expression used
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeployment.java`
#### Snippet
```java
                BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                String line;
                while ((line = rd.readLine()) != null) {
                    fluxSink.next(line);
                }
```

### NestedAssignment
Result of assignment expression used
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/CommandHandlerImpl.java`
#### Snippet
```java
            final StringBuilder stdout = new StringBuilder();
            String s;
            while ((s = stdInput.readLine()) != null) {
                stdout.append(s);
            }
```

## RuleId[id=Lombok]
### Lombok
Not generated 'getOrigin'(): A method with similar name 'getOrigin' already exists
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/RevisionDraft.java`
#### Snippet
```java

public class RevisionDraft extends Revision implements AzResource.Draft<Revision, com.azure.resourcemanager.appcontainers.models.Revision>{
    @Getter
    @Nullable
    private Revision origin;
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-sqlserver-lib/src/main/java/com/microsoft/azure/toolkit/lib/sqlserver/MicrosoftSqlFirewallRuleDraft.java`
#### Snippet
```java
    private final MicrosoftSqlFirewallRule origin;
    @Nullable
    private Config config;

    MicrosoftSqlFirewallRuleDraft(@Nonnull String name, @Nonnull MicrosoftSqlFirewallRuleModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-sqlserver-lib/src/main/java/com/microsoft/azure/toolkit/lib/sqlserver/MicrosoftSqlServerDraft.java`
#### Snippet
```java
    private final MicrosoftSqlServer origin;
    @Nullable
    private Config config;

    MicrosoftSqlServerDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull MicrosoftSqlServerModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `stagingDirectory` is accessed in both synchronized and unsynchronized contexts
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java

    @JsonIgnore
    protected File stagingDirectory;

    @JsonIgnore
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlFirewallRuleDraft.java`
#### Snippet
```java
    private final MySqlFirewallRule origin;
    @Nullable
    private Config config;

    MySqlFirewallRuleDraft(@Nonnull String name, @Nonnull MySqlFirewallRuleModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-mysql-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/MySqlServerDraft.java`
#### Snippet
```java
    private final MySqlServer origin;
    @Nullable
    private Config config;

    MySqlServerDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull MySqlServerModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `parent` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
    @Getter
    @Nullable
    protected OperationThreadContext parent;

    private OperationThreadContext(@Nullable final OperationThreadContext parent) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `threadId` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
    private static final ThreadLocal<OperationThreadContext> context = new ThreadLocal<>();

    protected long threadId;
    @Nullable
    protected Operation operation;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `operation` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
    protected long threadId;
    @Nullable
    protected Operation operation;
    @Getter
    @Nullable
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentDraft.java`
#### Snippet
```java
    private final ResourceDeployment origin;
    @Nullable
    private Config config;

    ResourceDeploymentDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull ResourceDeploymentModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `concrete` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/GenericResource.java`
#### Snippet
```java
    private final ResourceId resourceId;
    @Nullable
    private AbstractAzResource<?, ?, ?> concrete;

    protected GenericResource(@Nonnull String resourceId, @Nonnull GenericResourceModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceGroupDraft.java`
#### Snippet
```java
    private final ResourceGroup origin;
    @Nullable
    private Config config;

    ResourceGroupDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull ResourceGroupModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlFirewallRuleDraft.java`
#### Snippet
```java
    private final PostgreSqlFirewallRule origin;
    @Nullable
    private Config config;

    PostgreSqlFirewallRuleDraft(@Nonnull String name, @Nonnull PostgreSqlFirewallRuleModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServerDraft.java`
#### Snippet
```java
    private final PostgreSqlServer origin;
    @Nullable
    private Config config;

    PostgreSqlServerDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull PostgreSqlServerModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `client` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/blob/BlobContainerModule.java`
#### Snippet
```java

    public static final String NAME = "Azure.BlobContainer";
    private BlobServiceClient client;

    public BlobContainerModule(@Nonnull StorageAccount parent) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/StorageAccountDraft.java`
#### Snippet
```java
    private final StorageAccount origin;
    @Nullable
    private Config config;

    StorageAccountDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull StorageAccountModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `client` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/queue/QueueModule.java`
#### Snippet
```java

    public static final String NAME = "Azure.Queue";
    private QueueServiceClient client;

    public QueueModule(@Nonnull StorageAccount parent) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `client` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/share/ShareModule.java`
#### Snippet
```java

    public static final String NAME = "Azure.FileShare";
    private ShareServiceClient client;

    public ShareModule(@Nonnull StorageAccount parent) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `client` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/table/TableModule.java`
#### Snippet
```java

    public static final String NAME = "Azure.Table";
    private TableServiceClient client;

    public TableModule(@Nonnull StorageAccount parent) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlFirewallRuleDraft.java`
#### Snippet
```java
    private final MySqlFirewallRule origin;
    @Nullable
    private Config config;

    MySqlFirewallRuleDraft(@Nonnull String name, @Nonnull MySqlFirewallRuleModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudAppDraft.java`
#### Snippet
```java
    private SpringCloudDeployment activeDeployment;
    @Nullable
    private Config config;

    SpringCloudAppDraft(@Nonnull String name, @Nonnull SpringCloudAppModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java
    private final SpringCloudDeployment origin;
    @Nullable
    private Config config;

    protected SpringCloudDeploymentDraft(@Nonnull String name, @Nonnull SpringCloudDeploymentModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-mysql-single-lib/src/main/java/com/microsoft/azure/toolkit/lib/mysql/single/MySqlServerDraft.java`
#### Snippet
```java
    private final MySqlServer origin;
    @Nullable
    private Config config;

    MySqlServerDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull MySqlServerModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/environment/ContainerAppsEnvironmentDraft.java`
#### Snippet
```java
    @Setter
    @Getter
    private Config config;

    protected ContainerAppsEnvironmentDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull ContainerAppsEnvironmentModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesClusterDraft.java`
#### Snippet
```java
    @Getter
    @Setter
    private Config config;

    protected KubernetesClusterDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull KubernetesClusterModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `container` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlContainer.java`
#### Snippet
```java
public class SqlContainer extends AbstractAzResource<SqlContainer, SqlDatabase, SqlContainerGetResultsInner>
        implements Deletable, ICosmosCollection, ICosmosDocumentContainer<SqlDocument> {
    private CosmosContainer container;
    private CosmosContainerResponse containerResponse;
    @Getter
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `containerResponse` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlContainer.java`
#### Snippet
```java
        implements Deletable, ICosmosCollection, ICosmosDocumentContainer<SqlDocument> {
    private CosmosContainer container;
    private CosmosContainerResponse containerResponse;
    @Getter
    private final SqlDocumentModule documentModule;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/ContainerAppDraft.java`
#### Snippet
```java
    @Getter
    @Setter
    private Config config;

    protected ContainerAppDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull ContainerAppModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `collection` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoCollection.java`
#### Snippet
```java

    @Getter
    private com.mongodb.client.MongoCollection<Document> collection;
    @Getter
    private final MongoDocumentModule documentModule;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `accountRef` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureAccount.java`
#### Snippet
```java
public class AzureAccount implements IAzureAccount {
    @Nullable
    private AtomicReference<Account> accountRef;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `messager` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-eventhubs-lib/src/main/java/com/microsoft/azure/toolkit/lib/eventhubs/EventHubsInstance.java`
#### Snippet
```java
    private final List<Disposable> receivers = new ArrayList<>();
    @Nullable
    private IAzureMessager messager;
    protected EventHubsInstance(@Nonnull String name, @Nonnull EventHubsInstanceModule module) {
        super(name, module);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `consumerAsyncClient` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-eventhubs-lib/src/main/java/com/microsoft/azure/toolkit/lib/eventhubs/EventHubsInstance.java`
#### Snippet
```java
    private EntityStatus status;
    @Nullable
    private EventHubConsumerAsyncClient consumerAsyncClient;
    private final List<Disposable> receivers = new ArrayList<>();
    @Nullable
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/plan/AppServicePlanDraft.java`
#### Snippet
```java
    private final AppServicePlan origin;
    @Nullable
    private Config config;

    AppServicePlanDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull AppServicePlanModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDraft.java`
#### Snippet
```java
    private final WebApp origin;
    @Nullable
    private Config config;

    WebAppDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull WebAppModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
    private final FunctionAppDeploymentSlot origin;
    @Nullable
    private Config config;

    protected FunctionAppDeploymentSlotDraft(@Nonnull String name, @Nonnull FunctionAppDeploymentSlotModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotDraft.java`
#### Snippet
```java
    private final WebAppDeploymentSlot origin;
    @Nullable
    private Config config;

    protected WebAppDeploymentSlotDraft(@Nonnull String name, @Nonnull WebAppDeploymentSlotModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
    private final FunctionApp origin;
    @Nullable
    private Config config;

    FunctionAppDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull FunctionAppModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jedisPool` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-redis-lib/src/main/java/com/microsoft/azure/toolkit/redis/RedisCache.java`
#### Snippet
```java
    private static final int JEDIS_TIMEOUT = 500;

    private JedisPool jedisPool;

    protected RedisCache(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull RedisCacheModule module) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `azure-toolkit-libs/azure-toolkit-redis-lib/src/main/java/com/microsoft/azure/toolkit/redis/RedisCacheDraft.java`
#### Snippet
```java
    private final RedisCache origin;
    @Nullable
    private Config config;

    RedisCacheDraft(@Nonnull String name, @Nonnull String resourceGroupName, @Nonnull RedisCacheModule module) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/queryer/MavenPluginQueryer.java`
#### Snippet
```java
                                               String regex, String prompt, String errorMessage);

    public abstract void close();

    public String assureInputFromUser(String attribute, Enum defaultValue, String prompt) {
```

### EmptyMethod
All implementations of this method are empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/AzService.java`
#### Snippet
```java
    String getName();

    void refresh();

    @Nullable
```

### EmptyMethod
All implementations of this method are empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java
    }

    public abstract <D> void registerAction(Action<D> action);

    public <D> void registerAction(Action.Id<D> id, Consumer<D> action) {
```

### EmptyMethod
All implementations of this method are empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java
    public abstract <D> Action<D> getAction(Action.Id<D> id);

    public abstract void registerGroup(String id, ActionGroup group);

    public abstract IActionGroup getGroup(String id);
```

### EmptyMethod
The method is empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/cache/CacheManager.java`
#### Snippet
```java

    @Pointcut("execution(@com.microsoft.azure.toolkit.lib.common.cache.Cacheable * *..*.*(..))")
    public void cacheable() {
    }

```

### EmptyMethod
The method is empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/cache/CacheManager.java`
#### Snippet
```java

    @Pointcut("execution(@com.microsoft.azure.toolkit.lib.common.cache.CacheEvict * *..*.*(..))")
    public void cacheEvict() {
    }

```

### EmptyMethod
The method is empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/ExceptionNotificationAspect.java`
#### Snippet
```java

    @Pointcut("execution(@com.microsoft.azure.toolkit.lib.common.messager.ExceptionNotification * *..*.*(..))")
    public void onException() {
    }

```

### EmptyMethod
Method only calls its super
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzService.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
    }
```

### EmptyMethod
All implementations of this method are empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResourceBase.java`
#### Snippet
```java

    @Nonnull
    String getName();

    @Nonnull
```

### EmptyMethod
The method is empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/AzureOperationAspect.java`
#### Snippet
```java

    @Pointcut("execution(@com.microsoft.azure.toolkit.lib.common.operation.AzureOperation * *..*.*(..))")
    public void operation() {
    }

```

### EmptyMethod
All implementations of this method are empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/view/IView.java`
#### Snippet
```java
public interface IView {

    void dispose();

    void refresh();
```

### EmptyMethod
All implementations of this method are empty
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/view/IView.java`
#### Snippet
```java
    void dispose();

    void refresh();

    interface Label extends IView {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java

    @JsonIgnore
    private boolean isRuntimeInjected = false;

    @JsonIgnore
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java
    @Getter
    private WebApp webappInner;
    private boolean createNewPlaceHolder = false;

    public WebAppOption(@Nonnull WebApp webapp) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/task/AzureRxTaskManager.java`
#### Snippet
```java

public class AzureRxTaskManager {
    private static boolean registered = false;

    @SuppressWarnings("rawtypes")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    @Parameter
    @Getter
    protected String subscriptionId = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzServiceSubscription.java`
#### Snippet
```java

    public static class HttpClientHolder {
        private static HttpClient defaultHttpClient = null;

        @Nonnull
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationContext.java`
#### Snippet
```java
    private final Operation operation;
    @Setter
    private IAzureMessager messager = null;
    @Getter
    private final Map<String, Object> messageProperties = new ConcurrentHashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudApp.java`
#### Snippet
```java
    private final SpringCloudDeploymentModule deploymentModule;
    @Nullable
    private SpringCloudDeployment activeDeployment = null;

    protected SpringCloudApp(@Nonnull String name, @Nonnull SpringCloudAppModule module) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/model/IngressConfig.java`
#### Snippet
```java
    private boolean external;
    @Builder.Default
    private boolean allowInsecure = false;
    @Builder.Default
    private TransportMethod transport = TransportMethod.AUTO;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/task/AzureTask.java`
#### Snippet
```java
    private boolean backgroundable = true;
    @Nullable
    private Boolean backgrounded = null;
    @Nonnull
    @Builder.Default
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/task/AzureTask.java`
#### Snippet
```java

    public static class DefaultMonitor implements Monitor {
        private boolean cancelled = false;

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/Binding.java`
#### Snippet
```java
    protected String type = null;

    protected BindingEnum.Direction direction = null;

    protected Map<String, Object> bindingAttributes = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/Binding.java`
#### Snippet
```java
    protected BindingEnum bindingEnum = null;

    protected String type = null;

    protected BindingEnum.Direction direction = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/Binding.java`
#### Snippet
```java
public class Binding {

    protected BindingEnum bindingEnum = null;

    protected String type = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/model/DiagnosticConfig.java`
#### Snippet
```java
    boolean enableDetailedErrorMessage = false;
    @Builder.Default
    boolean enableFailedRequestTracing = false;
    // application log
    @Builder.Default
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/model/DiagnosticConfig.java`
#### Snippet
```java
    Integer webServerRetentionPeriod = 0;
    @Builder.Default
    boolean enableDetailedErrorMessage = false;
    @Builder.Default
    boolean enableFailedRequestTracing = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDraft.java`
#### Snippet
```java
        private DiagnosticConfig diagnosticConfig = null;
        private Set<String> appSettingsToRemove = new HashSet<>();
        private Map<String, String> appSettings = null;
        private DockerConfiguration dockerConfiguration = null;
    }
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDraft.java`
#### Snippet
```java
    private static class Config {
        private Runtime runtime;
        private AppServicePlan plan = null;
        private DiagnosticConfig diagnosticConfig = null;
        private Set<String> appSettingsToRemove = new HashSet<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDraft.java`
#### Snippet
```java
        private Runtime runtime;
        private AppServicePlan plan = null;
        private DiagnosticConfig diagnosticConfig = null;
        private Set<String> appSettingsToRemove = new HashSet<>();
        private Map<String, String> appSettings = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDraft.java`
#### Snippet
```java
        private Set<String> appSettingsToRemove = new HashSet<>();
        private Map<String, String> appSettings = null;
        private DockerConfiguration dockerConfiguration = null;
    }
}
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
        private DockerConfiguration dockerConfiguration;
        private String configurationSource;
        private DiagnosticConfig diagnosticConfig = null;
        private Set<String> appSettingsToRemove = new HashSet<>();
        private Map<String, String> appSettings = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
        private DiagnosticConfig diagnosticConfig = null;
        private Set<String> appSettingsToRemove = new HashSet<>();
        private Map<String, String> appSettings = null;
    }
}
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotDraft.java`
#### Snippet
```java
        private DiagnosticConfig diagnosticConfig = null;
        private Set<String> appSettingsToRemove = new HashSet<>();
        private Map<String, String> appSettings = null;
    }
}
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotDraft.java`
#### Snippet
```java
        private DockerConfiguration dockerConfiguration;
        private String configurationSource;
        private DiagnosticConfig diagnosticConfig = null;
        private Set<String> appSettingsToRemove = new HashSet<>();
        private Map<String, String> appSettings = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppBase.java`
#### Snippet
```java
    public static final String DEFAULT_REMOTE_DEBUG_JAVA_OPTS = "-Djava.net.preferIPv4Stack=true -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=127.0.0.1:%s";

    private Boolean isEnableRemoteDebugging = null;
    private AzureFunctionsAdminClient fileClient;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
        private Runtime runtime;
        private AppServicePlan plan = null;
        private DiagnosticConfig diagnosticConfig = null;
        private Set<String> appSettingsToRemove = new HashSet<>();
        private Map<String, String> appSettings = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
        private Set<String> appSettingsToRemove = new HashSet<>();
        private Map<String, String> appSettings = new HashMap<>();
        private DockerConfiguration dockerConfiguration = null;
    }
}
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
    private static class Config {
        private Runtime runtime;
        private AppServicePlan plan = null;
        private DiagnosticConfig diagnosticConfig = null;
        private Set<String> appSettingsToRemove = new HashSet<>();
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Deletable`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebApp.java`
#### Snippet
```java
@Getter
public class WebApp extends WebAppBase<WebApp, AppServiceServiceSubscription, com.azure.resourcemanager.appservice.models.WebApp>
    implements Deletable {

    @Nonnull
```

### RedundantImplements
Redundant interface declaration `Deletable`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionApp.java`
#### Snippet
```java
@Getter
public class FunctionApp extends FunctionAppBase<FunctionApp, AppServiceServiceSubscription, com.azure.resourcemanager.appservice.models.FunctionApp>
    implements Deletable {

    @Nonnull
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/deploy/MSFunctionDeployHandler.java`
#### Snippet
```java
    private String getBlobName(final WebAppBase functionApp) {
        return functionApp.name()
                .concat(new SimpleDateFormat(".yyyyMMddHHmmssSSS").format(new Date()))
                .concat(Constants.ZIP_EXT);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/deploy/MSFunctionDeployHandler.java`
#### Snippet
```java
        return functionApp.name()
                .concat(new SimpleDateFormat(".yyyyMMddHHmmssSSS").format(new Date()))
                .concat(Constants.ZIP_EXT);
    }

```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
        } catch (Exception e) {
            log.debug("[{}]:reloadResources->setResources([])", this.name);
            final Throwable cause = e instanceof HttpResponseException ? e : ExceptionUtils.getRootCause(e);
            if (cause instanceof HttpResponseException && HttpStatus.SC_NOT_FOUND == ((HttpResponseException) cause).getResponse().getStatusCode()) {
                log.debug("[{}]:reloadResources->loadResourceFromAzure()=SC_NOT_FOUND", this.name, e);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
            } catch (Exception e) {
                log.debug("[{}]:get({}, {})->loadResourceFromAzure()=EXCEPTION", this.name, name, resourceGroup, e);
                final Throwable cause = e instanceof HttpResponseException ? e : ExceptionUtils.getRootCause(e);
                if (cause instanceof HttpResponseException) {
                    if (HttpStatus.SC_NOT_FOUND != ((HttpResponseException) cause).getResponse().getStatusCode()) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceGroup.java`
#### Snippet
```java
        } catch (Throwable t) {
            localResources.forEach(r -> r.setStatus(Status.UNKNOWN));
            throw t instanceof AzureToolkitRuntimeException ? (AzureToolkitRuntimeException) t : new AzureToolkitRuntimeException(t);
        }
        localResources.parallelStream().forEach(AbstractAzResource::delete);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java
            return remote;
        } catch (Throwable t) {
            final Throwable cause = t instanceof HttpResponseException ? t : ExceptionUtils.getRootCause(t);
            if (cause instanceof HttpResponseException && HttpStatus.SC_NOT_FOUND == ((HttpResponseException) cause).getResponse().getStatusCode()) {
                this.setRemote(null);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java
                this.syncTimeRef.compareAndSet(0, System.currentTimeMillis());
                this.setStatus(Status.UNKNOWN);
                throw t instanceof AzureToolkitRuntimeException ? (AzureToolkitRuntimeException) t : new AzureToolkitRuntimeException(t);
            }
        } finally {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java
                this.setRemote(refreshed);
            } catch (Throwable t) {
                final Throwable cause = t instanceof HttpResponseException ? t : ExceptionUtils.getRootCause(t);
                if (cause instanceof HttpResponseException && HttpStatus.SC_NOT_FOUND == ((HttpResponseException) cause).getResponse().getStatusCode()) {
                    this.setRemote(null);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java
        } catch (Exception e) {
            log.debug("[{}:{}]:refreshRemoteFromAzure()=EXCEPTION", this.module.getName(), this.getName(), e);
            final Throwable cause = e instanceof HttpResponseException ? e : ExceptionUtils.getRootCause(e);
            if (cause instanceof HttpResponseException && HttpStatus.SC_NOT_FOUND == ((HttpResponseException) cause).getResponse().getStatusCode()) {
                return null;
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java
            this.getModule().deleteResourceFromAzure(this.getId());
        } catch (Exception e) {
            final Throwable cause = e instanceof HttpResponseException ? e : ExceptionUtils.getRootCause(e);
            if (cause instanceof HttpResponseException && HttpStatus.SC_NOT_FOUND == ((HttpResponseException) cause).getResponse().getStatusCode()) {
                log.debug("[{}]:delete()->deleteResourceFromAzure()=SC_NOT_FOUND", this.name, e);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java
        } catch (Exception e) {
            log.debug("[{}:{}]:loadRemote()=EXCEPTION", this.module.getName(), this.getName(), e);
            final Throwable cause = e instanceof HttpResponseException ? e : ExceptionUtils.getRootCause(e);
            if (cause instanceof HttpResponseException && HttpStatus.SC_NOT_FOUND == ((HttpResponseException) cause).getResponse().getStatusCode()) {
                return null;
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
    private File getArtifactToDeploy() throws AzureExecutionException {
        final File stagingFolder = new File(getDeploymentStagingDirectoryPath());
        return Arrays.stream(Optional.ofNullable(stagingFolder.listFiles()).orElse(new File[0]))
                .filter(jar -> StringUtils.equals(FilenameUtils.getBaseName(jar.getName()), this.getFinalName()))
                .findFirst()
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
        if (resource.getIncludes() != null && !resource.getIncludes().isEmpty()) {
            directoryScanner.setBasedir(resource.getDirectory());
            directoryScanner.setIncludes(resource.getIncludes().toArray(new String[0]));
            final String[] exclude = resource.getExcludes() == null ? new String[0] :
                    resource.getExcludes().toArray(new String[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
            directoryScanner.setBasedir(resource.getDirectory());
            directoryScanner.setIncludes(resource.getIncludes().toArray(new String[0]));
            final String[] exclude = resource.getExcludes() == null ? new String[0] :
                    resource.getExcludes().toArray(new String[0]);
            directoryScanner.setExcludes(exclude);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
            directoryScanner.setIncludes(resource.getIncludes().toArray(new String[0]));
            final String[] exclude = resource.getExcludes() == null ? new String[0] :
                    resource.getExcludes().toArray(new String[0]);
            directoryScanner.setExcludes(exclude);
            directoryScanner.scan();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java
        final DirectoryScanner directoryScanner = new DirectoryScanner();
        directoryScanner.setBasedir(resource.getDirectory());
        directoryScanner.setIncludes(resource.getIncludes().toArray(new String[0]));
        final String[] exclude = resource.getExcludes() == null ? new String[0] :
                resource.getExcludes().toArray(new String[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java
        directoryScanner.setBasedir(resource.getDirectory());
        directoryScanner.setIncludes(resource.getIncludes().toArray(new String[0]));
        final String[] exclude = resource.getExcludes() == null ? new String[0] :
                resource.getExcludes().toArray(new String[0]);
        directoryScanner.setExcludes(exclude);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java
        directoryScanner.setIncludes(resource.getIncludes().toArray(new String[0]));
        final String[] exclude = resource.getExcludes() == null ? new String[0] :
                resource.getExcludes().toArray(new String[0]);
        directoryScanner.setExcludes(exclude);
        directoryScanner.scan();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java

        if (StringUtils.isBlank(targetSubscriptionId)) {
            return selectSubscription(subscriptions.toArray(new Subscription[0]));
        }
        telemetryProxy.addDefaultProperty(SUBSCRIPTION_ID_KEY, targetSubscriptionId);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/bundle/AzureString.java`
#### Snippet
```java
    @Nonnull
    public static AzureString format(@Nonnull AzureBundle bundle, @Nonnull String key, Object... params) {
        return new AzureString(bundle, key, ObjectUtils.firstNonNull(params, new Object[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/AzureMessage.java`
#### Snippet
```java
                final Object[] actions = o instanceof AzureToolkitRuntimeException ?
                    ((AzureToolkitRuntimeException) o).getActions() : ((AzureToolkitException) o).getActions();
                return Arrays.stream(ObjectUtils.firstNonNull(actions, new Object[0]));
            }).collect(Collectors.toList());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/AzureMessage.java`
#### Snippet
```java
    public Action<?>[] getActions() {
        final Object payload = this.getPayload();
        final List<Object> actions = new ArrayList<>(Arrays.asList(ObjectUtils.firstNonNull(this.actions, new Object[0])));
        if (payload instanceof Throwable) {
            actions.addAll(getExceptionActions((Throwable) payload));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/IAzureMessage.java`
#### Snippet
```java
        }
        if (Objects.isNull(result)) {
            final Object[] params = Arrays.stream(text.getParams() != null ? text.getParams() : new Object[0])
                    .map((p) -> this.decorateValue(p, p::toString))
                    .toArray();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java
    @Override
    public synchronized Object invoke(Object proxy, @Nonnull Method method, Object[] args) throws Throwable {
        args = ObjectUtils.firstNonNull(args, new Object[0]);
        if (method.getName().startsWith("set")) {
            synchronized (this) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java

    private Object invokeSuper(@Nonnull Method method, @Nonnull Object[] args) throws Throwable {
        final Class<?>[] classes = Arrays.stream(args).map(Object::getClass).toArray(value -> new Class<?>[0]);
        final MethodType type = MethodType.methodType(method.getReturnType(), classes);
        final MethodHandle handle = MethodHandles.lookup().findSpecial(SpringCloudDeployment.class, method.getName(), type, this.getClass()).bindTo(this);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AzureFunctionsAdminClient.java`
#### Snippet
```java

        final HttpPipeline httpPipeline = new HttpPipelineBuilder()
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .httpClient(functionApp.manager().httpPipeline().getHttpClient())
                .build();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AppServiceKuduClient.java`
#### Snippet
```java

        final HttpPipeline httpPipeline = new HttpPipelineBuilder()
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .httpClient(webAppBase.manager().httpPipeline().getHttpClient())
                .build();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/impl/DefaultFunctionProject.java`
#### Snippet
```java

    private static ClassLoader getClassLoader(final List<URL> urlList) {
        final URL[] urlArray = urlList.toArray(new URL[0]);
        return new URLClassLoader(urlArray, DefaultFunctionProject.class.getClassLoader());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/impl/DefaultFunctionProject.java`
#### Snippet
```java
            .map(a -> Arrays.stream(a)
                .map(DefaultFunctionProject::create)
                .collect(Collectors.toList()).toArray(new FunctionAnnotation[0])).collect(Collectors.toList());

        functionMethod.setParameterAnnotations(parameterAnnotations);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandlerImpl.java`
#### Snippet
```java

    protected ClassLoader getClassLoader(final List<URL> urlList) {
        final URL[] urlArray = urlList.toArray(new URL[0]);
        return new URLClassLoader(urlArray, this.getClass().getClassLoader());
    }
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
    public String getDeploymentStagingDirectoryPath() {
        if (stagingDirectory == null) {
            synchronized (this) {
                if (stagingDirectory == null) {
                    final String outputFolder = this.getPluginName().replaceAll(MAVEN_PLUGIN_POSTFIX, "");
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java
     */
    default AzureValidationInfo getValidationInfo(final boolean revalidateIfNone) {
        synchronized (this) {
            final AzureValidationInfo info = this.getValidationInfo();
            if (revalidateIfNone && Objects.isNull(info)) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java
     */
    default AzureValidationInfo getValidationInfo() {
        synchronized (this) {
            return this.get(FIELD_VALIDATION_INFO);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java

    default void setValidationInfo(@Nullable AzureValidationInfo info) {
        synchronized (this) {
            this.set(FIELD_VALIDATION_INFO, info);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java
     */
    default Mono<AzureValidationInfo> validateValueAsync() {
        synchronized (this) {
            final Field<MutableTriple<T, Mono<AzureValidationInfo>, Disposable>> VALIDATING = Field.of(FIELD_VALIDATING);
            final MutableTriple<T, Mono<AzureValidationInfo>, Disposable> validating = this.get(VALIDATING);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/form/AzureFormInput.java`
#### Snippet
```java

    default void trackValidation() {
        synchronized (this) {
            final Field<Consumer<T>> TRACKING = Field.of(FIELD_TRACKING);
            if (Objects.isNull(this.get(TRACKING))) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResource.java`
#### Snippet
```java
        @Nonnull
        default T createIfNotExist() {
            synchronized (this) {
                final T origin = this.getModule().get(this.getName(), this.getResourceGroupName());
                if (Objects.isNull(origin) || !origin.exists()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResource.java`
#### Snippet
```java

        default T commit() {
            synchronized (this) {
                final boolean existing = this.getModule().exists(this.getName(), this.getResourceGroupName());
                final T result = existing ? this.getModule().update(this) : this.getModule().create(this);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResource.java`
#### Snippet
```java
        @Nullable
        default T updateIfExist() {
            synchronized (this) {
                final T origin = this.getModule().get(this.getName(), this.getResourceGroupName());
                if (Objects.nonNull(origin) && origin.exists()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java
        args = ObjectUtils.firstNonNull(args, new Object[0]);
        if (method.getName().startsWith("set")) {
            synchronized (this) {
                this.config = ObjectUtils.firstNonNull(this.config, new Config());
                return method.invoke(config, args);
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AbstractFunctionMojo.java`
#### Snippet
```java
    protected static final String TRIGGER_TYPE = "triggerType";
    protected static final String AZURE_FUNCTIONS_JAVA_LIBRARY = "azure-functions-java-library";
    protected static final Map<FunctionExtensionVersion, Set<Integer>> FUNCTION_EXTENSION_LIBRARY_MAP = new HashMap<FunctionExtensionVersion, Set<Integer>>() {
        {
            put(FunctionExtensionVersion.VERSION_2, Sets.newHashSet(1, 2));
```

### DoubleBraceInitialization
Double brace initialization
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/telemetry/AzureTelemetryClient.java`
#### Snippet
```java
    private static final Pattern TOKEN_REGEX = Pattern.compile("xox[pbaors]-[a-zA-Z0-9]+-[a-zA-Z0-9-]+?", Pattern.CASE_INSENSITIVE);

    private static final Map<Pattern, String> PATTERN_MAP = new HashMap<Pattern, String>() {{
        put(EMAIL_PATTERN, "<REDACTED: email>");
        put(SECRET_PATTERN, "<REDACTED: secret>");
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

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'SpringCloudDeploymentDraft' type conflicts with preceding 'instanceof Draft' check
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudAppDraft.java`
#### Snippet
```java
            Objects.equals(this.isPublicEndpointEnabled(), super.isPublicEndpointEnabled()) ||
            Objects.equals(this.isPersistentDiskEnabled(), super.isPersistentDiskEnabled()) ||
            !(this.activeDeployment instanceof Draft) || !((SpringCloudDeploymentDraft) this.activeDeployment).isModified();
        return !notModified;
    }
```

## RuleId[id=NullArgumentToVariableArgMethod]
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
Variable `type` initializer `null` is redundant
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/Binding.java`
#### Snippet
```java
    protected BindingEnum bindingEnum = null;

    protected String type = null;

    protected BindingEnum.Direction direction = null;
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

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `RunnableWithException` ends with 'Exception'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
    }

    protected interface RunnableWithException {
        void run() throws Exception;
    }
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

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`os.indexOf("nix") >= 0` can be replaced with 'os.contains("nix")'
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java
    public static boolean isLinux(){
        final String os = getOS();
        return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 ||
            os.indexOf("aix") >= 0 || os.indexOf("mac") >= 0);
    }
```

### IndexOfReplaceableByContains
`os.indexOf("nux") >= 0` can be replaced with 'os.contains("nux")'
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java
    public static boolean isLinux(){
        final String os = getOS();
        return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 ||
            os.indexOf("aix") >= 0 || os.indexOf("mac") >= 0);
    }
```

### IndexOfReplaceableByContains
`os.indexOf("aix") >= 0` can be replaced with 'os.contains("aix")'
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java
        final String os = getOS();
        return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 ||
            os.indexOf("aix") >= 0 || os.indexOf("mac") >= 0);
    }

```

### IndexOfReplaceableByContains
`os.indexOf("mac") >= 0` can be replaced with 'os.contains("mac")'
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java
        final String os = getOS();
        return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 ||
            os.indexOf("aix") >= 0 || os.indexOf("mac") >= 0);
    }

```

### IndexOfReplaceableByContains
`getOS().indexOf("win") >= 0` can be replaced with 'getOS().contains("win")'
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java

    public static boolean isWindows(){
        return (getOS().indexOf("win") >= 0);
    }

```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `id` may be 'static'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResource.java`
#### Snippet
```java
    final class None extends AbstractAzResource<None, None, Void> {
        public static final String NONE = "$NONE$";
        private final String id = NONE;
        private final String name = NONE;
        private final String status = NONE;
```

### FieldMayBeStatic
Field `status` may be 'static'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResource.java`
#### Snippet
```java
        private final String id = NONE;
        private final String name = NONE;
        private final String status = NONE;
        private final String subscriptionId = NONE;

```

### FieldMayBeStatic
Field `subscriptionId` may be 'static'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResource.java`
#### Snippet
```java
        private final String name = NONE;
        private final String status = NONE;
        private final String subscriptionId = NONE;

        private None() {
```

### FieldMayBeStatic
Field `name` may be 'static'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResource.java`
#### Snippet
```java
        public static final String NONE = "$NONE$";
        private final String id = NONE;
        private final String name = NONE;
        private final String status = NONE;
        private final String subscriptionId = NONE;
```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/TemplateUtils.java`
#### Snippet
```java
        final JtwigTemplate template = JtwigTemplate.inlineTemplate(expr);
        final JtwigModel model = JtwigModel.newModel();
        variableMap.entrySet().forEach((t) -> model.with(t.getKey(), t.getValue()));

        return template.render(model);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `XMLUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/XMLUtils.java`
#### Snippet
```java
import java.util.List;

public class XMLUtils {

    public static void setNamespace(Element element, Namespace nameSpace) {
```

### UtilityClassWithoutPrivateConstructor
Class `FTPUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/FTPUtils.java`
#### Snippet
```java

// Todo: Merge this class with FTPUploader in lib to reduce duplicate
public class FTPUtils {

    public static final String REPLY_MESSAGE = "Reply Message : %s";
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigurationUpdater` has only 'static' members, and lacks a 'private' constructor
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationUpdater.java`
#### Snippet
```java
import java.util.Objects;

public class ConfigurationUpdater {
    public static void updateAppConfigToPom(AppRawConfig config, MavenProject project, PluginDescriptor plugin) throws DocumentException, IOException {
        final File pom = project.getFile();
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Constants.java`
#### Snippet
```java
package com.microsoft.azure.maven.servicefabric;

public class Constants{

    public static final String DEFAULT_SCHEMA_VERSION = "1.0.0-preview2";
```

### UtilityClassWithoutPrivateConstructor
Class `TelemetryHelper` has only 'static' members, and lacks a 'private' constructor
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/TelemetryHelper.java`
#### Snippet
```java
import java.util.Map;

public class TelemetryHelper {
    private static final TelemetryClient client = new TelemetryClient();

```

### UtilityClassWithoutPrivateConstructor
Class `ProjectUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/ProjectUtils.java`
#### Snippet
```java
import java.util.Set;

public class ProjectUtils {
    public static IProject convertCommonProject(MavenProject project) {
        if (project == null) {
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java
import java.util.Map;

public class Utils {

    enum ResourceType {
```

### UtilityClassWithoutPrivateConstructor
Class `QueryFactory` has only 'static' members, and lacks a 'private' constructor
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/queryer/QueryFactory.java`
#### Snippet
```java
import org.apache.maven.settings.Settings;

public class QueryFactory {
    public static MavenPluginQueryer getQueryer(Settings settings) {
        return (settings != null && !settings.isInteractiveMode()) ?
```

### UtilityClassWithoutPrivateConstructor
Class `MavenAuthUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenAuthUtils.java`
#### Snippet
```java
import static com.microsoft.azure.maven.auth.MavenSettingHelper.buildAuthConfigurationByServerId;

public class MavenAuthUtils {
    private static final String INVALID_AZURE_ENVIRONMENT = "Invalid environment string '%s', please replace it with one of " +
            "\"Azure\", \"AzureChina\", \"AzureGermany\", \"AzureUSGovernment\",.";
```

### UtilityClassWithoutPrivateConstructor
Class `TextIOUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/TextIOUtils.java`
#### Snippet
```java
import java.util.function.Supplier;

public class TextIOUtils {
    private static TextTerminal textTerminal;
    private static List<Supplier<TextTerminal>> terminalSupplierList = Arrays.asList(
```

### UtilityClassWithoutPrivateConstructor
Class `MavenConfigUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenConfigUtils.java`
#### Snippet
```java
import java.util.List;

public class MavenConfigUtils {
    private static final String POM = "pom";
    private static final String JAR = "jar";
```

### UtilityClassWithoutPrivateConstructor
Class `MavenArtifactUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenArtifactUtils.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class MavenArtifactUtils {
    private static final String[] ARTIFACT_EXTENSIONS = {"jar"};
    private static final String ARTIFACT_NOT_SUPPORTED = "Target file does not exist or is not executable, please " +
```

### UtilityClassWithoutPrivateConstructor
Class `SystemPropertyUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/SystemPropertyUtils.java`
#### Snippet
```java
import java.util.List;

public class SystemPropertyUtils {
    public static Object injectCommandLineParameter(String prefix, Object obj, @Nonnull Class cls) {
        Object result = obj;
```

### UtilityClassWithoutPrivateConstructor
Class `PomUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/PomUtils.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class PomUtils {
    public static Element getPluginNode(PluginDescriptor plugin, File pom) throws FileNotFoundException, DocumentException {
        final SAXReader reader = new CustomSAXReader();
```

### UtilityClassWithoutPrivateConstructor
Class `AzureRxTaskManager` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/task/AzureRxTaskManager.java`
#### Snippet
```java
import java.util.Objects;

public class AzureRxTaskManager {
    private static boolean registered = false;

```

### UtilityClassWithoutPrivateConstructor
Class `Preloader` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/cache/Preloader.java`
#### Snippet
```java

@Log
public class Preloader {

    private static final String INVALID_PRELOAD_METHOD = "@Preload annotated method(%s.%s) should have (no args or only varargs) " +
```

### UtilityClassWithoutPrivateConstructor
Class `AzureEventBus` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/event/AzureEventBus.java`
#### Snippet
```java

@SuppressWarnings("UnstableApiUsage")
public class AzureEventBus {
    @NonNls
    private static final Map<String, EventBus> buses = new ConcurrentHashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `Impl` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/DataStore.java`
#### Snippet
```java
    }

    final class Impl {
        static final WeakHashMap<Object, Map<Object, Object>> STORE = new WeakHashMap<>();
    }
```

### UtilityClassWithoutPrivateConstructor
Class `InstallationIdUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/InstallationIdUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class InstallationIdUtils {

    private static final Pattern HASHED_MAC_PATTERN = Pattern.compile("[0-9a-f]{64}");
```

### UtilityClassWithoutPrivateConstructor
Class `NetUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/NetUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class NetUtils {

    public static final Pattern INTACT_IPADDRESS_PATTERN = Pattern.compile("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$");
```

### UtilityClassWithoutPrivateConstructor
Class `JsonUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/JsonUtils.java`
#### Snippet
```java
import java.io.Writer;

public class JsonUtils {
    private static final ObjectMapper MAPPER = new ObjectMapper();

```

### UtilityClassWithoutPrivateConstructor
Class `ExpressionUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/aspect/ExpressionUtils.java`
#### Snippet
```java

@Slf4j
public class ExpressionUtils {
    private static final ImmutableMap<String, Boolean> valueMap = ImmutableMap.of("true", true, "false", false);
    private static final SimpleTemplateEngine engine = new SimpleTemplateEngine();
```

### UtilityClassWithoutPrivateConstructor
Class `Log` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/logging/Log.java`
#### Snippet
```java

@Slf4j
public final class Log {
    public static void error(String message) {
        log.error(message);
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/Utils.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class Utils {
    private static final boolean isWindows = System.getProperty("os.name").contains("Windows");
    private static final String POM = "pom";
```

### UtilityClassWithoutPrivateConstructor
Class `AzureMessageBundle` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/AzureMessageBundle.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class AzureMessageBundle {
    private static final String BUNDLE = "bundles.com.microsoft.azure.toolkit.message";

```

### UtilityClassWithoutPrivateConstructor
Class `OperationBundle` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationBundle.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class OperationBundle {
    public static final String BUNDLE = "bundles.com.microsoft.azure.toolkit.operation";

```

### UtilityClassWithoutPrivateConstructor
Class `AzureTelemetry` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/telemetry/AzureTelemetry.java`
#### Snippet
```java
import java.util.Optional;

public class AzureTelemetry {
    public static final String OP_CREATE_AT = "op_create_at";
    public static final String OP_ENTER_AT = "op_enter_at";
```

### UtilityClassWithoutPrivateConstructor
Class `AzureTelemeter` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/telemetry/AzureTelemeter.java`
#### Snippet
```java
import java.util.Optional;

public class AzureTelemeter {
    public static final String SERVICE_NAME = "serviceName";
    public static final String OPERATION_NAME = "operationName";
```

### UtilityClassWithoutPrivateConstructor
Class `CommandUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/CommandUtils.java`
#### Snippet
```java
 */
@Slf4j
public class CommandUtils {
    private static final String WINDOWS_STARTER = "cmd.exe";
    private static final String LINUX_MAC_STARTER = "/bin/sh";
```

### UtilityClassWithoutPrivateConstructor
Class `DatabaseTemplateUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-database-lib/src/main/java/com/microsoft/azure/toolkit/lib/database/utils/DatabaseTemplateUtils.java`
#### Snippet
```java

@Builder
public class DatabaseTemplateUtils {

    private static final String DEFAULT_MYSQL_DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/Utils.java`
#### Snippet
```java
import java.util.function.Predicate;

public class Utils {
    private static final int POLLING_INTERVAL = 5;

```

### UtilityClassWithoutPrivateConstructor
Class `AzureEnvironmentUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureEnvironmentUtils.java`
#### Snippet
```java
import java.util.Map;

public class AzureEnvironmentUtils {
    private static final Map<AzureEnvironment, String[]> AZURE_CLOUD_ALIAS_MAP = new HashMap<>();
    private static final String CHINA_PORTAL = "https://portal.azure.cn";
```

### UtilityClassWithoutPrivateConstructor
Class `AzureCliUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/cli/AzureCliUtils.java`
#### Snippet
```java
import static com.microsoft.azure.toolkit.lib.common.utils.Utils.distinctByKey;

public class AzureCliUtils {
    private static final String MIN_VERSION = "2.11.0";

```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/Constants.java`
#### Snippet
```java
package com.microsoft.azure.toolkit.lib.legacy.function;

public class Constants {
    public static final String APP_SETTING_WEBSITE_RUN_FROM_PACKAGE = "WEBSITE_RUN_FROM_PACKAGE";
    public static final String APP_SETTING_MACHINEKEY_DECRYPTION_KEY = "MACHINEKEY_DecryptionKey";
```

### UtilityClassWithoutPrivateConstructor
Class `CommandUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/utils/CommandUtils.java`
#### Snippet
```java
import java.util.List;

public class CommandUtils {

    public static boolean isWindows() {
```

### UtilityClassWithoutPrivateConstructor
Class `DateUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/utils/DateUtils.java`
#### Snippet
```java
import java.util.Date;

public class DateUtils {

    public static Date convertLocalDateTimeToDate(LocalDateTime localDateTime) {
```

### UtilityClassWithoutPrivateConstructor
Class `FunctionUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/utils/FunctionUtils.java`
#### Snippet
```java


public class FunctionUtils {
    private static final String LOAD_TEMPLATES_FAIL = "Failed to load all function templates.";
    private static final String LOAD_BINDING_TEMPLATES_FAIL = "Failed to load function binding template.";
```

### UtilityClassWithoutPrivateConstructor
Class `AzureStorageHelper` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/AzureStorageHelper.java`
#### Snippet
```java
import java.util.EnumSet;

public class AzureStorageHelper {
    private static final int SAS_START_RESERVE_MINUTE = 5;
    private static final String FAIL_TO_DELETE_BLOB = "Fail to delete blob";
```

### UtilityClassWithoutPrivateConstructor
Class `BindingFactory` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/BindingFactory.java`
#### Snippet
```java

@Deprecated
public class BindingFactory {
    private static final String HTTP_OUTPUT_DEFAULT_NAME = "$return";

```

### UtilityClassWithoutPrivateConstructor
Class `TemplateResources` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/TemplateResources.java`
#### Snippet
```java

// Correspond to resources.json, translate attribute name to its real value
public class TemplateResources {
    private static final String VARIABLES_PREFIX = "variables_";
    private static final Pattern PATTERN = Pattern.compile("\\[variables\\('(.*)'\\)\\]");
```

### UtilityClassWithoutPrivateConstructor
Class `AppServiceUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/appservice/AppServiceUtils.java`
#### Snippet
```java
import java.util.List;

public class AppServiceUtils {
    public static List<PricingTier> getAvailablePricingTiers(OperatingSystem operatingSystem) {
        // This is a workaround for https://github.com/Azure/azure-libraries-for-java/issues/660
```

### UtilityClassWithoutPrivateConstructor
Class `AppServiceConfigUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceConfigUtils.java`
#### Snippet
```java
import static com.microsoft.azure.toolkit.lib.common.utils.Utils.selectFirstOptionIfCurrentInvalid;

public class AppServiceConfigUtils {
    private static final String SETTING_DOCKER_IMAGE = "DOCKER_CUSTOM_IMAGE_NAME";
    private static final String SETTING_REGISTRY_SERVER = "DOCKER_REGISTRY_SERVER_URL";
```

### UtilityClassWithoutPrivateConstructor
Class `DeployUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/deploy/DeployUtils.java`
#### Snippet
```java
import java.util.Optional;

class DeployUtils {
    private static final String INTERNAL_STORAGE_NOT_FOUND = "Application setting 'AzureWebJobsStorage' is not found, " +
            "please check the application setting and try again later.";
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/Utils.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class Utils {

    public static Map<String, String> normalizeAppSettings(Map<String, AppSetting> input) {
```

### UtilityClassWithoutPrivateConstructor
Class `AppServiceUtils` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class AppServiceUtils {
    private static final String SCRIPT_FILE = "scriptFile";
    private static final String ENTRY_POINT = "entryPoint";
```

### UtilityClassWithoutPrivateConstructor
Class `AzureFunctionsAnnotationConstants` has only 'static' members, and lacks a 'private' constructor
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionsAnnotationConstants.java`
#### Snippet
```java
package com.microsoft.azure.toolkit.lib.appservice.function.core;

public class AzureFunctionsAnnotationConstants {
    // com.microsoft.azure.functions.annotation
    public static final String FUNCTION_NAME = "com.microsoft.azure.functions.annotation.FunctionName";
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
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/Utils.java`
#### Snippet
```java

    enum ResourceType {
        application, volume, network;
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

## RuleId[id=DataFlowIssue]
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
Argument `app.getAppServicePlan()` might be null
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
        FunctionApp app = Azure.az(AzureFunctions.class).functionApps(config.subscriptionId()).updateOrCreate(config.appName(), config.resourceGroup());
        final boolean newFunctionApp = !app.exists();
        AppServiceConfig defaultConfig = !newFunctionApp ? fromAppService(app, app.getAppServicePlan()) : buildDefaultConfig(config.subscriptionId(),
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
Method invocation `isDocker` may produce `NullPointerException`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java

    public boolean isDockerWebapp() {
        return webappInner != null && webappInner.getRuntime().isDocker();
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
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.mysql(this.getFullyQualifiedDomainName());
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
Method invocation `getName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-postgre-lib/src/main/java/com/microsoft/azure/toolkit/lib/postgre/PostgreSqlServerDraft.java`
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
Argument `this.getRemote()` might be null
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java

    public void reloadStatus() {
        this.setStatus(this.loadStatus(this.getRemote()));
    }

```

### DataFlowIssue
Method invocation `parent` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudApp.java`
#### Snippet
```java
    public String getLogStreamingEndpoint(String instanceName) {
        return Optional.ofNullable(this.getRemote()).map(SpringApp::activeDeploymentName).map(d -> {
            final String endpoint = this.getRemote().parent().listTestKeys().primaryTestEndpoint();
            return String.format("%s/api/logstream/apps/%s/instances/%s", endpoint.replace(".test", ""), this.getName(), instanceName);
        }).orElse(null);
```

### DataFlowIssue
Method invocation `isPublic` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudApp.java`
#### Snippet
```java
    public boolean isPublicEndpointEnabled() {
        if (Objects.nonNull(this.getRemote())) {
            return this.getRemote().isPublic();
        }
        return false;
```

### DataFlowIssue
Method invocation `parent` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudApp.java`
#### Snippet
```java
    public String getTestUrl() {
        return Optional.ofNullable(this.getRemote()).map(SpringApp::activeDeploymentName).map(d -> {
            final String endpoint = this.getRemote().parent().listTestKeys().primaryTestEndpoint();
            return String.format("%s/%s/%s", endpoint, this.getName(), d);
        }).orElse(null);
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
    @Nonnull
    public JdbcUrl getJdbcUrl() {
        return JdbcUrl.mysql(this.getFullyQualifiedDomainName());
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
Method invocation `getActiveDeploymentName` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudAppDraft.java`
#### Snippet
```java
        final boolean notModified = Objects.isNull(this.config) ||
            Objects.isNull(this.config.getName()) || Objects.equals(this.config.getName(), super.getName()) ||
            Objects.isNull(this.config.getActiveDeploymentName()) || Objects.equals(this.config.getActiveDeploymentName(), super.getActiveDeploymentName()) ||
            Objects.equals(this.isPublicEndpointEnabled(), super.isPublicEndpointEnabled()) ||
            Objects.equals(this.isPersistentDiskEnabled(), super.isPersistentDiskEnabled()) ||
```

### DataFlowIssue
Dereference of `config` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java
        final String newJvmOptions = this.getJvmOptions();
        final String newVersion = this.getRuntimeVersion();
        final File newArtifact = Optional.ofNullable(config.artifact).map(IArtifact::getFile).orElse(null);

        final Map<String, String> oldEnv = super.getEnvironmentVariables();
```

### DataFlowIssue
Argument `deployment` might be null
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java
        SpringAppDeployment deployment = this.doModify(() -> create.create(), Status.CREATING);
        messager.success(AzureString.format("Deployment({0}) is successfully created", name));
        deployment = this.scaleDeploymentInAzure(deployment);
        return deployment;
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
Argument `rgName` might be null
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/RevisionModule.java`
#### Snippet
```java
    @Override
    protected AzResource.Draft<Revision, com.azure.resourcemanager.appcontainers.models.Revision> newDraftForCreate(@Nonnull String name, @Nullable String rgName) {
        return new RevisionDraft(name, rgName, this);
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
Argument `resourceGroupName` might be null
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/RevisionModule.java`
#### Snippet
```java
    @Override
    protected Revision newResource(@Nonnull String name, @Nullable String resourceGroupName) {
        return new Revision(name, resourceGroupName, this);
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

    public TunnelStatus getAppServiceTunnelStatus() {
        return this.kuduService.getAppServiceTunnelStatus(host).block().getValue();
    }

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
Method invocation `isWindows` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
            return false;
        }
        if (webApp.getRuntime().isWindows() && BooleanUtils.isTrue(this.waitDeploymentComplete)) {
            messager.warning("`waitDeploymentComplete` is not supported in Windows runtime, skip waiting for deployment status.");
            return false;
```

### DataFlowIssue
Method invocation `getStatus` may produce `NullPointerException`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
                .takeUntil(csmDeploymentStatus -> !csmDeploymentStatus.getStatus().isRunning())
                .blockLast();
        final DeploymentBuildStatus buildStatus = status.getStatus();
        if (buildStatus.isTimeout()) {
            this.messager.warning("Resource deployed, but failed to get the deployment status as timeout");
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

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
        final String libraryToExclude = artifacts.stream()
                .filter(artifact -> StringUtils.equalsAnyIgnoreCase(artifact.getArtifactId(), AZURE_FUNCTIONS_JAVA_CORE_LIBRARY))
                .map(Artifact::getArtifactId).findFirst().orElse(AZURE_FUNCTIONS_JAVA_LIBRARY);
        for (final Artifact artifact : artifacts) {
            if (!StringUtils.equalsIgnoreCase(artifact.getArtifactId(), libraryToExclude)) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        Log.info("Summary of parameters for function template:");

        params.entrySet().stream().forEach(e -> Log.info(format("%s: %s", e.getKey(), e.getValue())));
    }

```

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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AbstractFunctionMojo.java`
#### Snippet
```java
                .filter(artifact -> StringUtils.equals(artifact.getArtifactId(), AZURE_FUNCTIONS_JAVA_LIBRARY))
                .findFirst()
                .map(artifact -> artifact.getVersion())
                .orElse(null);
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
    protected void validateConfiguration(Consumer<ValidationMessage> validationMessageConsumer, boolean failOnError) {
        final List<ValidationMessage> validate = SchemaValidator.getInstance().validate("WebAppConfiguration", this, "configuration");
        validate.forEach(message -> validationMessageConsumer.accept(message));
        if (CollectionUtils.isNotEmpty(validate) && failOnError) {
            final String errorDetails = validate.stream().map(message -> message.getMessage().toString()).collect(Collectors.joining(StringUtils.LF));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesClusterAgentPool.java`
#### Snippet
```java
    @Nullable
    public AgentPoolMode getAgentPoolMode() {
        return Optional.ofNullable(getRemote()).map(pool -> pool.mode()).map(mode -> AgentPoolMode.fromString(mode.toString())).orElse(null);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesClusterAgentPool.java`
#### Snippet
```java
    @Nullable
    public OsType getOsType() {
        return Optional.ofNullable(getRemote()).map(pool -> pool.osType()).map(os -> OsType.fromString(os.toString())).orElse(null);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesClusterAgentPool.java`
#### Snippet
```java
    @Nullable
    public VirtualMachineSize getVirtualMachineSize() {
        return Optional.ofNullable(getRemote()).map(pool -> pool.vmSize()).map(size -> VirtualMachineSize.fromString(size.toString())).orElse(null);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesClusterAgentPool.java`
#### Snippet
```java

    public int getNodeCount() {
        return Optional.ofNullable(getRemote()).map(pool -> pool.count()).orElse(0);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesClusterModule.java`
#### Snippet
```java
        return Objects.requireNonNull(getClient()).listOrchestrators(com.azure.core.management.Region.fromName(region.getName()),
                        ContainerServiceResourceTypes.MANAGED_CLUSTERS)
                .stream().map(profile -> profile.orchestratorVersion())
                .collect(Collectors.toList());
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesCluster.java`
#### Snippet
```java
    @Nullable
    public Region getRegion() {
        return Optional.ofNullable(getRemote()).map(cluster -> cluster.region()).map(region -> Region.fromName(region.name())).orElse(null);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesCluster.java`
#### Snippet
```java
    @Nullable
    public String getKubernetesVersion() {
        return Optional.ofNullable(getRemote()).map(cluster -> cluster.version()).orElse(null);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesCluster.java`
#### Snippet
```java

    public ContainerServiceNetworkProfile getContainerServiceNetworkProfile() {
        return Optional.ofNullable(getRemote()).map(cluster -> cluster.networkProfile())
                .map(profile -> ContainerServiceNetworkProfile.fromNetworkProfile(profile)).orElse(null);
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-containerservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerservice/KubernetesCluster.java`
#### Snippet
```java
    public ContainerServiceNetworkProfile getContainerServiceNetworkProfile() {
        return Optional.ofNullable(getRemote()).map(cluster -> cluster.networkProfile())
                .map(profile -> ContainerServiceNetworkProfile.fromNetworkProfile(profile)).orElse(null);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/CosmosDBAccount.java`
#### Snippet
```java
    @Nullable
    public String getDocumentEndpoint() {
        return Optional.ofNullable(getRemote()).map(remote -> remote.documentEndpoint()).orElse(null);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoDocumentDraft.java`
#### Snippet
```java
                .map(Document::toJson)
                .map(json -> JsonUtils.fromJson(json, ObjectNode.class))
                .orElseGet(() -> super.getDocument());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
        final List<Integer> collect = list.stream().filter(slot -> slot.getAppSettings().keySet().contains(HTTP_PLATFORM_DEBUG_PORT))
                .map(slot -> slot.getAppSettings().get(HTTP_PLATFORM_DEBUG_PORT))
                .map(portValue -> NumberUtils.toInt(portValue))
                .filter(value -> value != 0)
                .collect(Collectors.toList());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDraft.java`
#### Snippet
```java
        }
        final Set<String> settingsToRemove = Optional.ofNullable(this.ensureConfig().getAppSettingsToRemove())
                .map(set -> set.stream().filter(key -> oldAppSettings.containsKey(key)).collect(Collectors.toSet()))
                .orElse(Collections.emptySet());
        final DiagnosticConfig newDiagnosticConfig = this.ensureConfig().getDiagnosticConfig();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlotDraft.java`
#### Snippet
```java
        // workaround to resolve slot creation exception could not be caught by azure operation
        // todo: add unified error handling for reactor
        final Consumer<Throwable> throwableConsumer = error -> messager.error(error);
        final Context context = new Context("reactor.onErrorDropped.local", throwableConsumer);
        FunctionDeploymentSlot slot = (FunctionDeploymentSlot) Objects.requireNonNull(this.doModify(() -> withCreate.create(context), Status.CREATING));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotDraft.java`
#### Snippet
```java
        // workaround to resolve slot creation exception could not be caught by azure operation
        // todo: add unified error handling for reactor
        final Consumer<Throwable> throwableConsumer = error -> messager.error(error);
        final Context context = new Context("reactor.onErrorDropped.local", throwableConsumer);
        DeploymentSlot slot = (DeploymentSlot) Objects.requireNonNull(this.doModify(() -> withCreate.create(context), Status.CREATING));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/webapp/WebAppDeploymentSlotDraft.java`
#### Snippet
```java
        }
        final Set<String> settingsToRemove = Optional.ofNullable(this.ensureConfig().getAppSettingsToRemove())
                .map(set -> set.stream().filter(key -> oldAppSettings.containsKey(key)).collect(Collectors.toSet()))
                .orElse(Collections.emptySet());
        final Runtime newRuntime = this.ensureConfig().getRuntime();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDraft.java`
#### Snippet
```java
        }
        final Set<String> settingsToRemove = Optional.ofNullable(this.ensureConfig().getAppSettingsToRemove())
                .map(set -> set.stream().filter(key -> oldAppSettings.containsKey(key)).collect(Collectors.toSet()))
                .orElse(Collections.emptySet());
        final DiagnosticConfig newDiagnosticConfig = this.ensureConfig().getDiagnosticConfig();
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

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getActiveDeploymentName()` overrides synchronized method
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudAppDraft.java`
#### Snippet
```java
    @Nullable
    @Override
    public String getActiveDeploymentName() {
        return Optional.ofNullable(config).map(Config::getActiveDeploymentName).orElseGet(super::getActiveDeploymentName);
    }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'actions' in a Serializable class
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/exception/AzureToolkitRuntimeException.java`
#### Snippet
```java
     * {@link com.microsoft.azure.toolkit.lib.common.action.Action.Id}
     */
    private final Object[] actions;
    @Nullable
    private final String tips;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'actions' in a Serializable class
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/exception/AzureToolkitException.java`
#### Snippet
```java
     * {@link com.microsoft.azure.toolkit.lib.common.action.Action.Id}
     */
    private final Object[] actions;
    @Nullable
    private final String tips;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'actions' in a Serializable class
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/exception/SystemException.java`
#### Snippet
```java
     * {@link com.microsoft.azure.toolkit.lib.common.action.Action.Id}
     */
    private final Object[] actions;

    public SystemException(@Nonnull Throwable cause) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'actions' in a Serializable class
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/exception/UserException.java`
#### Snippet
```java
     * {@link com.microsoft.azure.toolkit.lib.common.action.Action.Id}
     */
    private final Object[] actions;

    public UserException(@Nonnull Throwable cause) {
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

## RuleId[id=UnnecessaryToStringCall]
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
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java
                urlList.add(f.toURI().toURL());
            } catch (MalformedURLException e) {
                Log.debug("Failed to get URL for file: " + f.toString());
            }
        }
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

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
            }
            System.out.println(
                    TextUtils.yellow(String.format("Validation failure for %s[%s]: %s", propertyName, cliParameter.toString(), errorMessage)));
        }

```

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

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/PackageMojo.java`
#### Snippet
```java

    protected Set<BindingEnum> getFunctionBindingEnums(Map<String, FunctionConfiguration> configMap) {
        final Set<BindingEnum> result = new HashSet<>();
        configMap.values().forEach(configuration -> configuration.getBindings().
                forEach(binding -> result.add(binding.getBindingEnum())));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java

    private Set<BindingEnum> getFunctionBindingEnums(Map<String, FunctionConfiguration> configMap) {
        final Set<BindingEnum> result = new HashSet<>();
        configMap.values().forEach(configuration -> configuration.getBindings().
            forEach(binding -> result.add(binding.getBindingEnum())));
```

## RuleId[id=UnresolvedPropertyKey]
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
    @Nonnull
```

### UnresolvedPropertyKey
'account.authenticate' doesn't appear to be a valid property key
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
    public static final String RESOURCE_TYPE = "resourceType";
    public static final Id<Runnable> REQUIRE_AUTH = Id.of("common.requireAuth");
    public static final Id<Object> AUTHENTICATE = Id.of("account.authenticate");
    @Nonnull
    private final Id<D> id;
```

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

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `stagingDirectory` accessed in synchronized context
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
        if (stagingDirectory == null) {
            synchronized (this) {
                if (stagingDirectory == null) {
                    final String outputFolder = this.getPluginName().replaceAll(MAVEN_PLUGIN_POSTFIX, "");
                    final String stagingDirectoryPath = Paths.get(this.getBuildDirectoryAbsolutePath(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stagingDirectory` accessed in synchronized context
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
                            outputFolder, String.format("%s-%s", this.getAppName(), UUID.randomUUID().toString())
                    ).toString();
                    stagingDirectory = new File(stagingDirectoryPath);
                    // If staging directory doesn't exist, create one and delete it on exit
                    if (!stagingDirectory.exists()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stagingDirectory` accessed in synchronized context
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
                    stagingDirectory = new File(stagingDirectoryPath);
                    // If staging directory doesn't exist, create one and delete it on exit
                    if (!stagingDirectory.exists()) {
                        stagingDirectory.mkdirs();
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stagingDirectory` accessed in synchronized context
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
                    // If staging directory doesn't exist, create one and delete it on exit
                    if (!stagingDirectory.exists()) {
                        stagingDirectory.mkdirs();
                    }
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.threadId` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        final long threadId = Thread.currentThread().getId();
        assert current.threadId == -1 || current.threadId == threadId : String.format("[threadId:%s] illegal thread context[%s]", threadId, current);
        this.threadId = threadId; // we can not decide in which thread this task will run until here.
        if (current.threadId != -1) {
            this.setParent(current);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.parent` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java

    private synchronized void setParent(@Nullable OperationThreadContext parent) {
        if (!Objects.equals(this.parent, parent)) {
            this.parent = parent;
            this.operation = Optional.ofNullable(parent).map(p -> p.operation).orElse(null);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.parent` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
    private synchronized void setParent(@Nullable OperationThreadContext parent) {
        if (!Objects.equals(this.parent, parent)) {
            this.parent = parent;
            this.operation = Optional.ofNullable(parent).map(p -> p.operation).orElse(null);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.operation` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        if (!Objects.equals(this.parent, parent)) {
            this.parent = parent;
            this.operation = Optional.ofNullable(parent).map(p -> p.operation).orElse(null);
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.threadId` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        final OperationThreadContext current = OperationThreadContext.current();
        final long threadId = Thread.currentThread().getId();
        assert this == current && this.threadId == threadId : String.format("[threadId:%s] disposing context[%s] in context[%s].", threadId, this, current);
        final OperationThreadContext ancestorContext = getAliveAncestor(current);
        if (this.parent == null || this.threadId != this.parent.threadId || Objects.isNull(ancestorContext)) { // this is the root task of current thread.
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.parent` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        assert this == current && this.threadId == threadId : String.format("[threadId:%s] disposing context[%s] in context[%s].", threadId, this, current);
        final OperationThreadContext ancestorContext = getAliveAncestor(current);
        if (this.parent == null || this.threadId != this.parent.threadId || Objects.isNull(ancestorContext)) { // this is the root task of current thread.
            OperationThreadContext.context.get().resetThreadId();
            OperationThreadContext.context.remove();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.threadId` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        assert this == current && this.threadId == threadId : String.format("[threadId:%s] disposing context[%s] in context[%s].", threadId, this, current);
        final OperationThreadContext ancestorContext = getAliveAncestor(current);
        if (this.parent == null || this.threadId != this.parent.threadId || Objects.isNull(ancestorContext)) { // this is the root task of current thread.
            OperationThreadContext.context.get().resetThreadId();
            OperationThreadContext.context.remove();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.parent` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        assert this == current && this.threadId == threadId : String.format("[threadId:%s] disposing context[%s] in context[%s].", threadId, this, current);
        final OperationThreadContext ancestorContext = getAliveAncestor(current);
        if (this.parent == null || this.threadId != this.parent.threadId || Objects.isNull(ancestorContext)) { // this is the root task of current thread.
            OperationThreadContext.context.get().resetThreadId();
            OperationThreadContext.context.remove();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.operation` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
    @Nullable
    synchronized Operation popOperation() {
        final Operation popped = this.operation;
        assert popped != null : "popped operation is null";
        this.operation = popped.getParent();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.operation` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        final Operation popped = this.operation;
        assert popped != null : "popped operation is null";
        this.operation = popped.getParent();
        if (Objects.isNull(this.parent) && Objects.isNull(this.operation)) {
            OperationThreadContext.context.remove();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.parent` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        assert popped != null : "popped operation is null";
        this.operation = popped.getParent();
        if (Objects.isNull(this.parent) && Objects.isNull(this.operation)) {
            OperationThreadContext.context.remove();
            log.fine(String.format("orphan context[%s] is disposed", this));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.operation` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        assert popped != null : "popped operation is null";
        this.operation = popped.getParent();
        if (Objects.isNull(this.parent) && Objects.isNull(this.operation)) {
            OperationThreadContext.context.remove();
            log.fine(String.format("orphan context[%s] is disposed", this));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.parent` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java

    synchronized void pushOperation(final Operation operation) {
        if (Objects.isNull(this.parent) && Objects.isNull(this.operation)) {
            log.fine(String.format("orphan context[%s] is setup", this));
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.operation` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java

    synchronized void pushOperation(final Operation operation) {
        if (Objects.isNull(this.parent) && Objects.isNull(this.operation)) {
            log.fine(String.format("orphan context[%s] is setup", this));
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.operation` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
            log.fine(String.format("orphan context[%s] is setup", this));
        }
        operation.setParent(this.operation);
        this.operation = operation;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.operation` accessed in synchronized context
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
        }
        operation.setParent(this.operation);
        this.operation = operation;
    }

```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/event/AzureEventBus.java`
#### Snippet
```java

@SuppressWarnings("UnstableApiUsage")
public class AzureEventBus {
    @NonNls
    private static final Map<String, EventBus> buses = new ConcurrentHashMap<>();
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/FunctionAppDeploymentSlot.java`
#### Snippet
```java
                .filter(value -> value != 0)
                .collect(Collectors.toList());
        for (int i = Integer.valueOf(DEFAULT_REMOTE_DEBUG_PORT) + 1; i < MAX_PORT; i++) {
            if (!collect.contains(i)) {
                return String.valueOf(i);
```

## RuleId[id=CharsetObjectCanBeUsed]
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/ListMojo.java`
#### Snippet
```java
    protected void printToSystemOut(String file) throws IOException {
        try (final InputStream is = ListMojo.class.getResourceAsStream(file)) {
            IOUtils.copy(is, System.out);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java

    protected boolean confirmConfiguration(WebAppConfiguration configuration) {
        System.out.println("Please confirm webapp properties");
        if (StringUtils.isNotBlank(configuration.getSubscriptionId())) {
            System.out.println("Subscription Id : " + configuration.getSubscriptionId());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
        System.out.println("Please confirm webapp properties");
        if (StringUtils.isNotBlank(configuration.getSubscriptionId())) {
            System.out.println("Subscription Id : " + configuration.getSubscriptionId());
        }
        System.out.println("AppName : " + configuration.getAppName());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            System.out.println("Subscription Id : " + configuration.getSubscriptionId());
        }
        System.out.println("AppName : " + configuration.getAppName());
        System.out.println("ResourceGroup : " + configuration.getResourceGroup());
        System.out.println("Region : " + configuration.getRegion());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
        }
        System.out.println("AppName : " + configuration.getAppName());
        System.out.println("ResourceGroup : " + configuration.getResourceGroup());
        System.out.println("Region : " + configuration.getRegion());
        if (configuration.getPricingTier() != null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
        System.out.println("AppName : " + configuration.getAppName());
        System.out.println("ResourceGroup : " + configuration.getResourceGroup());
        System.out.println("Region : " + configuration.getRegion());
        if (configuration.getPricingTier() != null) {
            System.out.println("PricingTier : " + configuration.getPricingTier());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
        System.out.println("Region : " + configuration.getRegion());
        if (configuration.getPricingTier() != null) {
            System.out.println("PricingTier : " + configuration.getPricingTier());
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java

        if (configuration.getOs() == null) {
            System.out.println(CONFIGURATION_NO_RUNTIME);
        } else {
            System.out.println("OS : " + configuration.getOs().toString());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            System.out.println(CONFIGURATION_NO_RUNTIME);
        } else {
            System.out.println("OS : " + configuration.getOs().toString());
            switch (configuration.getOs()) {
                case WINDOWS:
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
                case WINDOWS:
                case LINUX:
                    System.out.println("Java Version: " + configuration.getJavaVersion());
                    System.out.println("Web server stack: " + configuration.getWebContainer());
                    break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
                case LINUX:
                    System.out.println("Java Version: " + configuration.getJavaVersion());
                    System.out.println("Web server stack: " + configuration.getWebContainer());
                    break;
                case DOCKER:
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
                    break;
                case DOCKER:
                    System.out.println("Image : " + configuration.getImage());
                    if (StringUtils.isNotBlank(configuration.getServerId())) {
                        System.out.println("ServerId : " + configuration.getServerId());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
                    System.out.println("Image : " + configuration.getImage());
                    if (StringUtils.isNotBlank(configuration.getServerId())) {
                        System.out.println("ServerId : " + configuration.getServerId());
                    }
                    if (StringUtils.isNotBlank(configuration.getRegistryUrl())) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
                    }
                    if (StringUtils.isNotBlank(configuration.getRegistryUrl())) {
                        System.out.println("RegistryUrl : " + configuration.getRegistryUrl());
                    }
                    break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            }
        }
        System.out.println("Deploy to slot : " + (configuration.getDeploymentSlotSetting() != null));
        if (configuration.getDeploymentSlotSetting() != null) {
            final DeploymentSlotSetting slotSetting = configuration.getDeploymentSlotSetting();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
        if (configuration.getDeploymentSlotSetting() != null) {
            final DeploymentSlotSetting slotSetting = configuration.getDeploymentSlotSetting();
            System.out.println("Slot name : " + slotSetting.getName());
            System.out.println("ConfigurationSource : " + slotSetting.getConfigurationSource());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            final DeploymentSlotSetting slotSetting = configuration.getDeploymentSlotSetting();
            System.out.println("Slot name : " + slotSetting.getName());
            System.out.println("ConfigurationSource : " + slotSetting.getConfigurationSource());
        }
        final String result = queryer.assureInputFromUser("confirm", "Y", BOOLEAN_REGEX, "Confirm (Y/N)", null);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/ConfigMojo.java`
#### Snippet
```java
                        configuredProjects.size() > 1 ? "are" : "is"));
                for (final MavenProject proj : configuredProjects) {
                    System.out.println("    " + TextUtils.yellow(proj.getName()));
                }
            } else if (targetProjects.isEmpty()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/DeployMojo.java`
#### Snippet
```java
    protected boolean confirm(List<AzureTask<?>> tasks) throws MojoFailureException {
        try (final IPrompter prompter = new DefaultPrompter()) {
            System.out.println(CONFIRM_PROMPT_START);
            tasks.stream().map(AzureTask::getDescription).filter(t -> Objects.nonNull(t) && StringUtils.isNotBlank(t.toString()))
                .forEach((t) -> System.out.printf("\t- %s%n", t));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/DeployMojo.java`
#### Snippet
```java
            System.out.println(CONFIRM_PROMPT_START);
            tasks.stream().map(AzureTask::getDescription).filter(t -> Objects.nonNull(t) && StringUtils.isNotBlank(t.toString()))
                .forEach((t) -> System.out.printf("\t- %s%n", t));
            return prompter.promoteYesNo(CONFIRM_PROMPT_CONFIRM, true, true);
        } catch (IOException e) {
```

### SystemOutErr
Uses of `out` should probably be replaced with more robust logging
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
            throw new MojoFailureException(String.format("invalid input: %s", input));
        } else {
            out.printf("The input is invalid. Use empty string.%n");
            setter.accept("");
        }
```

### SystemOutErr
Uses of `out` should probably be replaced with more robust logging
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        final Scanner scanner = getScanner();
        while (true) {
            out.printf(getStringInputPromptString(attributeName, defaultValue));
            out.flush();
            final String input = scanner.nextLine();
```

### SystemOutErr
Uses of `out` should probably be replaced with more robust logging
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        while (true) {
            out.printf(getStringInputPromptString(attributeName, defaultValue));
            out.flush();
            final String input = scanner.nextLine();
            if (validator.apply(input)) {
```

### SystemOutErr
Uses of `out` should probably be replaced with more robust logging
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java

        while (true) {
            out.printf(prompt);
            out.flush();
            try {
```

### SystemOutErr
Uses of `out` should probably be replaced with more robust logging
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        while (true) {
            out.printf(prompt);
            out.flush();
            try {
                final String input = scanner.nextLine();
```

### SystemOutErr
Uses of `out` should probably be replaced with more robust logging
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        }

        out.printf("Choose from below options as %s %n", prompt);
        for (int i = 0; i < options.size(); i++) {
            out.printf("%d. %s%n", i, options.get(i));
```

### SystemOutErr
Uses of `out` should probably be replaced with more robust logging
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
        out.printf("Choose from below options as %s %n", prompt);
        for (int i = 0; i < options.size(); i++) {
            out.printf("%d. %s%n", i, options.get(i));
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java

    private static void printConfirmation(String key, Object value) {
        System.out.printf("%-17s : %s%n", key, TextUtils.cyan(Objects.toString(value)));
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
                return cliParameter.toString();
            }
            System.out.println(
                    TextUtils.yellow(String.format("Validation failure for %s[%s]: %s", propertyName, cliParameter.toString(), errorMessage)));
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
    public void confirmChanges(Map<String, String> changesToConfirm, Supplier<Integer> confirmedAction) throws IOException {
        final Map<String, Object> variables = createVariableTables("confirm");
        System.out.println(TemplateUtils.evalText("promote.header", variables));
        for (final Map.Entry<String, String> entry : changesToConfirm.entrySet()) {
            if (StringUtils.isNotBlank(entry.getValue())) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/toolkit/maven/common/messager/MavenAzureMessager.java`
#### Snippet
```java
                return true;
            case DEBUG:
                System.out.println(message.getContent());
                return true;
            case INFO:
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java
            authConfig.setDeviceCodeConsumer(info -> {
                final String message = StringUtils.replace(info.getMessage(), info.getUserCode(), TextUtils.cyan(info.getUserCode()));
                System.out.println(message);
            });
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
            throws IOException {
        final boolean hasDefaultValue = StringUtils.isNotBlank(defaultValue);
        System.out.print(message);
        System.out.flush();
        return loopInput(defaultValue, hasDefaultValue, isRequired, "", message, input -> {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
        final boolean hasDefaultValue = StringUtils.isNotBlank(defaultValue);
        System.out.print(message);
        System.out.flush();
        return loopInput(defaultValue, hasDefaultValue, isRequired, "", message, input -> {
            if (!isRequired && StringUtils.equals(EMPTY_REPLACEMENT, input.trim())) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
                    return defaultValue;
                }
                System.out.print(emptyPromoteMessage);
            } else {
                final InputValidateResult<T> res = handleInput.apply(input);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
                final InputValidateResult<T> res = handleInput.apply(input);
                if (res.getErrorMessage() != null) {
                    System.out.println(TextUtils.yellow(res.getErrorMessage()));
                } else {
                    return res.getObj();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
                }
            }
            System.out.print(promoteMessage);
            System.out.flush();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
            }
            System.out.print(promoteMessage);
            System.out.flush();
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java

        for (;;) {
            System.out.print(promoteMessage);
            System.out.flush();
            final String input = reader.readLine();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
        for (;;) {
            System.out.print(promoteMessage);
            System.out.flush();
            final String input = reader.readLine();
            if (StringUtils.isBlank(input)) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
                    return res;
                }
                System.out.println(selectNoneMessage);
            }
            if (isValidIntRangeInput(input)) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
                        return res;
                    }
                    System.out.print(selectNoneMessage);
                } catch (NumberFormatException ex) {
                    System.out.println(TextUtils.yellow(String.format("The input value('%s') is invalid.", input)));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
                    System.out.print(selectNoneMessage);
                } catch (NumberFormatException ex) {
                    System.out.println(TextUtils.yellow(String.format("The input value('%s') is invalid.", input)));
                }
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
                }
            } else {
                System.out.println(TextUtils.yellow(String.format("The input value('%s') is invalid.", input)));
            }
            System.out.flush();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
                System.out.println(TextUtils.yellow(String.format("The input value('%s') is invalid.", input)));
            }
            System.out.flush();
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
    public Boolean promoteYesNo(String message, Boolean defaultValue, boolean isRequired) throws IOException {
        final boolean hasDefaultValue = defaultValue != null;
        System.out.print(message);
        System.out.flush();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
        final boolean hasDefaultValue = defaultValue != null;
        System.out.print(message);
        System.out.flush();

        return loopInput(defaultValue, hasDefaultValue, isRequired, "", message, input -> {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
    private static <T> void printOptionList(String message, List<T> entities, T defaultEntity, Function<T, String> getNameFunc) {
        int index = 1;
        System.out.println(message);
        for (final T entity : entities) {
            final String displayLine = String.format("%2d. %s", index++, getNameFunc.apply(entity));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
        for (final T entity : entities) {
            final String displayLine = String.format("%2d. %s", index++, getNameFunc.apply(entity));
            System.out.println(defaultEntity == entity ? TextUtils.blue(displayLine + "*") : displayLine);
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
        final String hintMessage = String.format("[1-%d]%s", entities.size(), defaultValueMessage);
        final String promoteMessage = String.format("%s %s: ", message, hintMessage);
        System.out.print(promoteMessage);
        System.out.flush();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/DefaultPrompter.java`
#### Snippet
```java
        final String promoteMessage = String.format("%s %s: ", message, hintMessage);
        System.out.print(promoteMessage);
        System.out.flush();

        return loopInput(defaultEntity, hasDefaultValue, isRequired, null, promoteMessage, input -> {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/logging/Log.java`
#### Snippet
```java
            log.info(message);
        } else {
            System.out.println(message);
        }
    }
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/AbstractWebAppMojo.java`
#### Snippet
```java
            synchronized (this) {
                if (stagingDirectory == null) {
                    final String outputFolder = this.getPluginName().replaceAll(MAVEN_PLUGIN_POSTFIX, "");
                    final String stagingDirectoryPath = Paths.get(this.getBuildDirectoryAbsolutePath(),
                            outputFolder, String.format("%s-%s", this.getAppName(), UUID.randomUUID().toString())
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
            throw new AzureToolkitRuntimeException(EMPTY_APP_NAME);
        }
        if (appName.startsWith("-") || !appName.matches(APP_NAME_PATTERN)) {
            throw new AzureToolkitRuntimeException(INVALID_APP_NAME);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
            throw new AzureToolkitRuntimeException(EMPTY_RESOURCE_GROUP);
        }
        if (resourceGroup.endsWith(".") || !resourceGroup.matches(RESOURCE_GROUP_PATTERN)) {
            throw new AzureToolkitRuntimeException(INVALID_RESOURCE_GROUP_NAME);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
        }
        // asp name & resource group
        if (StringUtils.isNotEmpty(appServicePlanName) && !appServicePlanName.matches(APP_SERVICE_PLAN_NAME_PATTERN)) {
            throw new AzureToolkitRuntimeException(String.format(INVALID_SERVICE_PLAN_NAME, APP_SERVICE_PLAN_NAME_PATTERN));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
        }
        if (StringUtils.isNotEmpty(appServicePlanResourceGroup) &&
                (appServicePlanResourceGroup.endsWith(".") || !appServicePlanResourceGroup.matches(RESOURCE_GROUP_PATTERN))) {
            throw new AzureToolkitRuntimeException(INVALID_SERVICE_PLAN_RESOURCE_GROUP_NAME);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/DeployMojo.java`
#### Snippet
```java
            throw new AzureToolkitRuntimeException(EMPTY_SLOT_NAME);
        }
        if (deploymentSlotSetting != null && !deploymentSlotSetting.getName().matches(SLOT_NAME_PATTERN)) {
            throw new AzureToolkitRuntimeException(String.format(INVALID_SLOT_NAME, SLOT_NAME_PATTERN));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
            return path;
        }
        return StringUtils.removeEnd(path.replaceAll("([\\\\/])+", Matcher.quoteReplacement("/")), "/");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java

        if (settings != null && !settings.isInteractiveMode()) {
            assureInputInBatchMode(getFunctionName(), str -> StringUtils.isNotEmpty(str) && str.matches(FUNCTION_NAME_REGEXP), this::setFunctionName, true);
        } else {
            assureInputFromUser("Enter value for Function Name: ", getFunctionName(), str -> StringUtils.isNotEmpty(str) && str.matches(FUNCTION_NAME_REGEXP),
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/AddMojo.java`
#### Snippet
```java
            assureInputInBatchMode(getFunctionName(), str -> StringUtils.isNotEmpty(str) && str.matches(FUNCTION_NAME_REGEXP), this::setFunctionName, true);
        } else {
            assureInputFromUser("Enter value for Function Name: ", getFunctionName(), str -> StringUtils.isNotEmpty(str) && str.matches(FUNCTION_NAME_REGEXP),
                    "Function name must start with a letter and can contain letters, digits, '_' and '-'", this::setFunctionName);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-sfmesh-maven-plugin/src/main/java/com/microsoft/azure/maven/servicefabric/YamlContent.java`
#### Snippet
```java
                final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                while (reader.ready()){
                    final String line = reader.readLine().replace("\n", "");
                    final String wordToReplace = line.substring(line.lastIndexOf(" ") + 1);
                    if (properties.containsKey(wordToReplace)){
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/CustomTextIoStringListReader.java`
#### Snippet
```java
                        final int digits = ("" + optionCount).length();
                        optionId = String.format("%" + digits + "d: ", i + 1);
                        final String[] textLines = optionText.split("\\R", -1);
                        if (textLines.length > 1) {
                            final String delimiter = String.format("\n%" + (digits + 4) + "s", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/TemplateUtils.java`
#### Snippet
```java
    public static String evalText(String expr, Map<String, Object> variableMap) {
        // convert *** to blue color
        return evalPlainText(expr, variableMap).replaceAll("\\*\\*\\*(.*?)\\*\\*\\*", TextUtils.blue("$1"));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/AbstractAzureMojo.java`
#### Snippet
```java

    public void infoWithMultipleLines(final String messages) {
        final String[] messageArray = messages.split("\\n");
        for (final String line : messageArray) {
            Log.info(line);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/TextUtils.java`
#### Snippet
```java
    public static String[] splitLines(String text) {
        Objects.requireNonNull(text, "The parameter 'text' cannot be null");
        return text.split("\\r?\\n");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/NetUtils.java`
#### Snippet
```java
            return false;
        }
        final String fixedMac = mac.replaceAll("-", ":");
        return !StringUtils.equalsAnyIgnoreCase(fixedMac, INVALID_MAC_ADDRESS);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/aspect/ExpressionUtils.java`
#### Snippet
```java
        }
        final Map<String, Object> bindings = initBindings(invocation);
        final String fixed = template.replaceAll("(\\W)this(\\.)", "$1_this_$2"); // resolve `this`
        try {
            final Template tpl = engine.createTemplate(fixed);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
    public String toResourceId(@Nonnull String resourceName, @Nullable String resourceGroup) {
        resourceGroup = StringUtils.firstNonBlank(resourceGroup, this.getParent().getResourceGroupName(), RESOURCE_GROUP_PLACEHOLDER);
        return String.format("%s/%s/%s", this.parent.getId(), this.getName(), resourceName).replace(RESOURCE_GROUP_PLACEHOLDER, resourceGroup);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/telemetry/AzureTelemeter.java`
#### Snippet
```java
        final Optional<Operation> parent = Optional.ofNullable(op.getEffectiveParent());
        final Map<String, String> properties = new HashMap<>();
        final String name = op.getId().replaceAll("\\(.+\\)", "(***)"); // e.g. `internal/appservice.list_file.dir`
        final String[] parts = name.split("\\."); // ["internal/appservice", "list_file", "dir"]
        properties.put(OP_ID, op.getExecutionId());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentModule.java`
#### Snippet
```java
        return String.format("/subscriptions/%s/resourceGroups/%s/providers/Microsoft.Resources/%s/%s",
                this.getSubscriptionId(), this.parent.getResourceGroupName(), this.getName(), resourceName)
            .replace(AzResource.RESOURCE_GROUP_PLACEHOLDER, resourceGroup);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/CommandUtils.java`
#### Snippet
```java
            }

            for (final String outputLine : output.split("[\\r\\n]")) {
                final File file = new File(StringUtils.trim(outputLine));
                if (!file.exists() || !file.isFile()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-database-lib/src/main/java/com/microsoft/azure/toolkit/lib/database/entity/IFirewallRule.java`
#### Snippet
```java
        final String suffix = "_" + NetUtils.getMac();
        final int maxHostnameLength = MAX_FIREWALL_NAME_LENGTH - prefix.length() - suffix.length();
        String hostname = NetUtils.getHostName().replaceAll("[^a-zA-Z0-9_-]", StringUtils.EMPTY);
        if (StringUtils.length(hostname) > maxHostnameLength) {
            hostname = StringUtils.substring(hostname, 0, maxHostnameLength);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-database-lib/src/main/java/com/microsoft/azure/toolkit/lib/database/JdbcUrl.java`
#### Snippet
```java

        private SQLServerJdbcUrl(String url) {
            super(StringUtils.replaceOnce(url, ";", "?").replaceAll(";", "&"));
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-database-lib/src/main/java/com/microsoft/azure/toolkit/lib/database/JdbcUrl.java`
#### Snippet
```java
        @Override
        public String toString() {
            String url = "jdbc:" + StringUtils.replaceOnce(uri.toString(), "?", ";").replaceAll("&", ";");
            return JdbcUrl.decode(url);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/telemetry/AzureTelemetryClient.java`
#### Snippet
```java
                return value;
            }
            return Arrays.stream(value.split("\\r?\\n")).map(line -> {
                final String input = FILE_PATH_PATTERN.matcher(line).replaceAll("<REDACTED: user-file-path>");
                for (final Pattern pattern : PATTERN_MAP.keySet()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudApp.java`
#### Snippet
```java
        return Optional.ofNullable(this.getRemote()).map(SpringApp::activeDeploymentName).map(d -> {
            final String endpoint = this.getRemote().parent().listTestKeys().primaryTestEndpoint();
            return String.format("%s/api/logstream/apps/%s/instances/%s", endpoint.replace(".test", ""), this.getName(), instanceName);
        }).orElse(null);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/ContainerAppDraft.java`
#### Snippet
```java

    private static String getContainerNameForImage(String containerImageName) {
        return containerImageName.substring(containerImageName.lastIndexOf('/') + 1).replaceAll("[^0-9a-zA-Z-]", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureEnvironmentUtils.java`
#### Snippet
```java

    public static String getAuthority(AzureEnvironment environment) {
        return environment.getActiveDirectoryEndpoint().replaceAll("/+$", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AppServiceKuduClient.java`
#### Snippet
```java
        }
        String host = webAppBase.defaultHostname().toLowerCase(Locale.ROOT)
            .replace("http://", "")
            .replace("https://", "");
        String[] parts = host.split("\\.", 2);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/file/AppServiceKuduClient.java`
#### Snippet
```java
        String host = webAppBase.defaultHostname().toLowerCase(Locale.ROOT)
            .replace("http://", "")
            .replace("https://", "");
        String[] parts = host.split("\\.", 2);
        host = parts[0] + ".scm." + parts[1];
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/model/JavaVersion.java`
#### Snippet
```java
        }
        // remove java, jre prefix
        final String version = StringUtils.lowerCase(input).replaceFirst("java|jre", "").trim();
        // handle java 7/ java 8 cases
        if (StringUtils.equalsIgnoreCase(version, JAVA_7_VALUE)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/deploy/RunFromBlobFunctionDeployHandler.java`
#### Snippet
```java
    private String getBlobName(final WebAppBase deployTarget, final File zipPackage) {
        // replace '/' in resource id to '-' in case create multi-level blob
        final String fixedResourceId = StringUtils.replace(deployTarget.id(), "/", "-").replaceFirst("-", "");
        return String.format("%s-%s", fixedResourceId, zipPackage.getName());
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java

    private static Runtime getRuntimeFromLinuxFunctionApp(String linuxFxVersion) {
        final JavaVersion javaVersion = JavaVersion.fromString(linuxFxVersion.replace("|", " "));
        return StringUtils.containsIgnoreCase(linuxFxVersion, "java") ?
                Runtime.getRuntime(OperatingSystem.LINUX, WebContainer.JAVA_OFF, javaVersion) : Runtime.getRuntime(OperatingSystem.LINUX, WebContainer.JAVA_OFF, JavaVersion.OFF);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
    public static com.azure.resourcemanager.appservice.models.JavaVersion toJavaVersion(JavaVersion javaVersion) {
        // remove the java/jre prefix for user input
        final String value = javaVersion.getValue().replaceFirst("(?i)java|jre", "");
        return com.azure.resourcemanager.appservice.models.JavaVersion.fromString(value);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
    static String getJavaVersionValueForJavaSERuntimeStack(@Nonnull JavaVersion javaVersion) {
        // Java SE with minor version runtime stack follow pattern JAVA|VERSION, like JAVA|11.0.9, JAVA|8u25
        return javaVersion.getValue().replaceAll("(?i)java|jre", "").trim();
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/AbstractAppServiceMojo.java`
#### Snippet
```java

    public String getDeploymentStagingDirectoryPath() {
        final String outputFolder = this.getPluginName().replaceAll(MAVEN_PLUGIN_POSTFIX, "");
        return Paths.get(
                this.getBuildDirectoryAbsolutePath(),
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.azure.toolkit.lib` is unnecessary and can be removed
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/ConfigMojo.java`
#### Snippet
```java
            CollectionUtils.isNotEmpty(selectedSubscriptions) ? selectedSubscriptions.get(0) : null,
            t -> String.format("%s (%s)", t.getName(), t.getId()));
        com.microsoft.azure.toolkit.lib.Azure.az(AzureAccount.class).account().setSelectedSubscriptions(Collections.singletonList(select.getId()));
        return select.getId();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/proxy/ProxyManager.java`
#### Snippet
```java
     * refer to sun.net.spi.DefaultProxySelector
     * @param mask non-null mask
     * @return {@link java.util.regex.Pattern} corresponding to this mask
     *         or {@code null} in case mask should not match anything
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.azure.resourcemanager.resources.models` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentDraft.java`
#### Snippet
```java
    @Override
    @AzureOperation(name = "azure/arm.create_deployment.deployment", params = {"this.getName()"})
    public com.azure.resourcemanager.resources.models.Deployment createResourceInAzure() {
        final ResourceGroup group = this.getParent();
        final String name = this.getName();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.azure.core.management` is unnecessary, and can be replaced with an import
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentDraft.java`
#### Snippet
```java
        final Deployment.DefinitionStages.WithTemplate withTemplate = group.exists() ?
            define.withExistingResourceGroup(group.getName()) :
            define.withNewResourceGroup(group.getName(), com.azure.core.management.Region.fromName(group.getRegion().getName()));
        final Deployment.DefinitionStages.WithCreate definition = withTemplate
            .withTemplate(template)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.azure.resourcemanager.resources.models` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentDraft.java`
#### Snippet
```java
        final IAzureMessager messager = AzureMessager.getMessager();
        messager.info(AzureString.format("Start creating Deployment({0})...", name));
        final com.azure.resourcemanager.resources.models.Deployment deployment = definition.create();
        messager.success(AzureString.format("Deployment({0}) is successfully created.", name));
        return deployment;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.azure.resourcemanager.resources.models` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentDraft.java`
#### Snippet
```java

public class ResourceDeploymentDraft extends ResourceDeployment
    implements AzResource.Draft<ResourceDeployment, com.azure.resourcemanager.resources.models.Deployment> {

    @Getter
```

### UnnecessaryFullyQualifiedName
Qualifier `com.azure.resourcemanager.resources.models` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentDraft.java`
#### Snippet
```java
    @Override
    @AzureOperation(name = "azure/arm.update_deployment.deployment", params = {"this.getName()"})
    public com.azure.resourcemanager.resources.models.Deployment updateResourceInAzure(@Nonnull com.azure.resourcemanager.resources.models.Deployment origin) {
        final String name = this.getName();
        final String oldTemplate = super.getTemplateAsJson();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.azure.resourcemanager.resources.models` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentDraft.java`
#### Snippet
```java
    @Override
    @AzureOperation(name = "azure/arm.update_deployment.deployment", params = {"this.getName()"})
    public com.azure.resourcemanager.resources.models.Deployment updateResourceInAzure(@Nonnull com.azure.resourcemanager.resources.models.Deployment origin) {
        final String name = this.getName();
        final String oldTemplate = super.getTemplateAsJson();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.azure.toolkit.lib.resource` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceGroupModule.java`
#### Snippet
```java
    @Nonnull
    public ResourceGroup createResourceGroupIfNotExist(@Nonnull String name, @Nonnull Region region) {
        final com.microsoft.azure.toolkit.lib.resource.ResourceGroup group = this.getOrDraft(name, name);
        if (group instanceof ResourceGroupDraft && !group.exists()) {
            ((ResourceGroupDraft) group).setRegion(region);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.azure.resourcemanager.appcontainers.models` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/environment/ContainerAppsEnvironment.java`
#### Snippet
```java
    }

    protected ContainerAppsEnvironment(@Nonnull com.azure.resourcemanager.appcontainers.models.ManagedEnvironment remote, @Nonnull ContainerAppsEnvironmentModule module) {
        super(remote.name(), ResourceId.fromString(remote.id()).resourceGroupName(), module);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraTableDraft.java`
#### Snippet
```java
    private CqlSession createSession(final CassandraCosmosDBAccount account) throws NoSuchAlgorithmException, KeyManagementException {
        final SSLContext sc = SSLContext.getInstance("TLSv1.2");
        sc.init(null, null, new java.security.SecureRandom());
        final DriverConfigLoader configLoader =
                DriverConfigLoader.programmaticBuilder().withDuration(DefaultDriverOption.REQUEST_TIMEOUT, Duration.ofSeconds(10)).build();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.azure.toolkit.lib` is unnecessary, and can be replaced with an import
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureCloud.java`
#### Snippet
```java
        // src/main/java/com/azure/identity/implementation/IdentityClientOptions.java#L42
        Configuration.getGlobalConfiguration().put(Configuration.PROPERTY_AZURE_AUTHORITY_HOST, environment.getActiveDirectoryEndpoint());
        final com.microsoft.azure.toolkit.lib.AzureConfiguration az = com.microsoft.azure.toolkit.lib.Azure.az().config();
        if (StringUtils.isNotBlank(az.getProxySource())) {
            String proxyAuthPrefix = StringUtils.EMPTY;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.azure.toolkit.lib` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureCloud.java`
#### Snippet
```java
        // src/main/java/com/azure/identity/implementation/IdentityClientOptions.java#L42
        Configuration.getGlobalConfiguration().put(Configuration.PROPERTY_AZURE_AUTHORITY_HOST, environment.getActiveDirectoryEndpoint());
        final com.microsoft.azure.toolkit.lib.AzureConfiguration az = com.microsoft.azure.toolkit.lib.Azure.az().config();
        if (StringUtils.isNotBlank(az.getProxySource())) {
            String proxyAuthPrefix = StringUtils.EMPTY;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.azure.resourcemanager.resources.models` is unnecessary, and can be replaced with an import
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureAccount.java`
#### Snippet
```java
    // todo: share codes with other library which leverage track2 mgmt sdk
    @Cacheable(cacheName = "subscriptions/{}", key = "$subscriptionId")
    private com.azure.resourcemanager.resources.models.Subscription getSubscription(String subscriptionId) {
        return getResourceManager(subscriptionId).subscriptions().getById(subscriptionId);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.azure.toolkit.lib.common.model` is unnecessary, and can be replaced with an import
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureAccount.java`
#### Snippet
```java
    public List<Region> listRegions() {
        return Flux.fromIterable(Azure.az(IAzureAccount.class).account().getSelectedSubscriptions())
            .parallel().map(com.microsoft.azure.toolkit.lib.common.model.Subscription::getId)
            .map(this::listRegions)
            .sequential().collectList()
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.azure.toolkit.lib` is unnecessary and can be removed
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/AbstractAppServiceMojo.java`
#### Snippet
```java
                final String targetSubscriptionId = getTargetSubscriptionId(getSubscriptionId(), subscriptions, account.getSelectedSubscriptions());
                AbstractAzureMojo.checkSubscription(subscriptions, targetSubscriptionId);
                com.microsoft.azure.toolkit.lib.Azure.az(AzureAccount.class).account().setSelectedSubscriptions(Collections.singletonList(targetSubscriptionId));
                appServiceClient = Azure.az(AzureAppService.class);
                printCurrentSubscription(appServiceClient);
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary and can be removed
in `azure-toolkit-libs/azure-toolkit-monitor-lib/src/main/java/com/microsoft/azure/toolkit/lib/monitor/LogAnalyticsWorkspaceDraft.java`
#### Snippet
```java
    }

    @javax.annotation.Nullable
    @Override
    public Region getRegion() {
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/Action.java`
#### Snippet
```java
            return View.INVISIBLE;
        } catch (final Exception e) {
            e.printStackTrace();
            return View.INVISIBLE;
        }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ConfigurationSerializer()` of an abstract class should not be declared 'public'
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/serializer/ConfigurationSerializer.java`
#### Snippet
```java
    final WebAppConfiguration oldConfigs;

    public ConfigurationSerializer(WebAppConfiguration newConfigs, WebAppConfiguration oldConfigs) {
        this.newConfigs = newConfigs;
        // when there is no old configuration, just compare to an empty one
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractAzService()` of an abstract class should not be declared 'public'
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzService.java`
#### Snippet
```java
    implements AzService {

    public AbstractAzService(@Nonnull String name) {
        super(name, AzResource.NONE);
        AzureEventBus.on("account.logged_out.account", new AzureEventBus.EventListener((e) -> this.clear()));
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `defaultEntity`
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
        }
        if (defaultEntity == null && variables.containsKey("default_index")) {
            defaultEntity = options.get((Integer) variables.get("default_index"));
        }
        return prompt.promoteSingleEntity(TemplateUtils.evalText("promote.header", variables), TemplateUtils.evalText("promote.many", variables),
```

### AssignmentToMethodParameter
Assignment to method parameter `prompt`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/queryer/TextIOMavenPluginQueryer.java`
#### Snippet
```java
            return initValue;
        }
        prompt = StringUtils.isEmpty(prompt) ? getPromptString(attribute) : prompt;
        return new GenericInputReader<String>(TextIOUtils::getTextTerminal, null)
                .withNumberedPossibleValues(options).withDefaultValue(defaultValue).withEqualsFunc(StringUtils::equalsIgnoreCase).read(prompt);
```

### AssignmentToMethodParameter
Assignment to method parameter `prompt`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/queryer/TextIOMavenPluginQueryer.java`
#### Snippet
```java
        }

        prompt = StringUtils.isEmpty(prompt) ? getPromptString(attribute) : prompt;
        return new StringInputReader(TextIOUtils::getTextTerminal).withPattern(regex).withDefaultValue(defaultValue).withMinLength(0).read(prompt);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/PomUtils.java`
#### Snippet
```java
                node.add(newNode);
            }
            node = newNode;
        }
        return node;
```

### AssignmentToMethodParameter
Assignment to method parameter `status`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResourceBase.java`
#### Snippet
```java

        public static FormalStatus dummyFormalize(String status) {
            status = status.toLowerCase();
            if (runningStatus.contains(status)) {
                return FormalStatus.RUNNING;
```

### AssignmentToMethodParameter
Assignment to method parameter `resourceGroup`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
        log.debug("[{}]:loadResourceFromAzure({}, {})", this.getName(), name, resourceGroup);
        final Object client = this.getClient();
        resourceGroup = StringUtils.firstNonBlank(resourceGroup, this.getParent().getResourceGroupName());
        resourceGroup = StringUtils.equals(resourceGroup, RESOURCE_GROUP_PLACEHOLDER) ? null : resourceGroup;
        if (client instanceof SupportsGettingById && StringUtils.isNotEmpty(resourceGroup)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `resourceGroup`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
        final Object client = this.getClient();
        resourceGroup = StringUtils.firstNonBlank(resourceGroup, this.getParent().getResourceGroupName());
        resourceGroup = StringUtils.equals(resourceGroup, RESOURCE_GROUP_PLACEHOLDER) ? null : resourceGroup;
        if (client instanceof SupportsGettingById && StringUtils.isNotEmpty(resourceGroup)) {
            log.debug("[{}]:loadResourceFromAzure->client.getById({}, {})", this.name, resourceGroup, name);
```

### AssignmentToMethodParameter
Assignment to method parameter `rgName`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java

    private String normalizeResourceGroupName(String name, @Nullable String rgName) {
        rgName = StringUtils.firstNonBlank(rgName, this.getParent().getResourceGroupName());
        if (StringUtils.isBlank(rgName) || StringUtils.equalsIgnoreCase(rgName, RESOURCE_GROUP_PLACEHOLDER)) {
            if (this instanceof ResourceGroupModule) {
```

### AssignmentToMethodParameter
Assignment to method parameter `resourceGroup`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
    @Nonnull
    public String toResourceId(@Nonnull String resourceName, @Nullable String resourceGroup) {
        resourceGroup = StringUtils.firstNonBlank(resourceGroup, this.getParent().getResourceGroupName(), RESOURCE_GROUP_PLACEHOLDER);
        return String.format("%s/%s/%s", this.parent.getId(), this.getName(), resourceName).replace(RESOURCE_GROUP_PLACEHOLDER, resourceGroup);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
    protected void addResourceToLocal(@Nonnull String id, @Nullable T resource, boolean... silent) {
        log.debug("[{}]:addResourceToLocal({}, {})", this.name, id, resource);
        id = id.toLowerCase();
        final Optional<T> oldResource = this.resources.getOrDefault(id, Optional.empty());
        final Optional<T> newResource = Optional.ofNullable(resource);
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResourceModule.java`
#### Snippet
```java
        log.debug("[{}]:deleteResourceFromLocal({})", this.name, id);
        log.debug("[{}]:deleteResourceFromLocal->this.resources.remove({})", this.name, id);
        id = id.toLowerCase();
        final Optional<T> removed = this.resources.remove(id);
        if (Objects.nonNull(removed) && removed.isPresent()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `current`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/AzureMessage.java`
#### Snippet
```java
                break;
            }
            current = current.getParent();
        }
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `origin`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentDraft.java`
#### Snippet
```java
            messager.info(AzureString.format("Start updating Deployment({0})...", name));
            update.withMode(DeploymentMode.INCREMENTAL);
            origin = update.apply();
            messager.success(AzureString.format("Deployment({0}) is successfully updated.", name));
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `resourceGroup`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeploymentModule.java`
#### Snippet
```java
    @Override
    public String toResourceId(@Nonnull String resourceName, @Nullable String resourceGroup) {
        resourceGroup = StringUtils.firstNonBlank(resourceGroup, this.getParent().getResourceGroupName(), AzResource.RESOURCE_GROUP_PLACEHOLDER);
        return String.format("/subscriptions/%s/resourceGroups/%s/providers/Microsoft.Resources/%s/%s",
                this.getSubscriptionId(), this.parent.getResourceGroupName(), this.getName(), resourceName)
```

### AssignmentToMethodParameter
Assignment to method parameter `resourceGroup`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudClusterModule.java`
#### Snippet
```java
    @Override
    public SpringCloudCluster get(@Nonnull String name, @Nullable String resourceGroup) {
        resourceGroup = StringUtils.firstNonBlank(resourceGroup, this.getParent().getResourceGroupName());
        if (StringUtils.isBlank(resourceGroup) || StringUtils.equalsIgnoreCase(resourceGroup, RESOURCE_GROUP_PLACEHOLDER)) {
            return this.list().stream().filter(c -> StringUtils.equalsIgnoreCase(name, c.getName())).findAny().orElse(null);
```

### AssignmentToMethodParameter
Assignment to method parameter `origin`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudAppDraft.java`
#### Snippet
```java
            final IAzureMessager messager = AzureMessager.getMessager();
            messager.info(AzureString.format("Start updating app({0})...", origin.name()));
            origin = update.apply();
            messager.success(AzureString.format("App({0}) is successfully updated.", origin.name()));
            messager.warning(UPDATE_APP_WARNING);
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java
    @Override
    public synchronized Object invoke(Object proxy, @Nonnull Method method, Object[] args) throws Throwable {
        args = ObjectUtils.firstNonNull(args, new Object[0]);
        if (method.getName().startsWith("set")) {
            synchronized (this) {
```

### AssignmentToMethodParameter
Assignment to method parameter `deployment`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java
            final IAzureMessager messager = AzureMessager.getMessager();
            messager.info(AzureString.format("Start updating deployment({0})...", deployment.name()));
            deployment = update.apply();
            messager.success(AzureString.format("Deployment({0}) is successfully updated.", deployment.name()));
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `deployment`
in `azure-toolkit-libs/azure-toolkit-springcloud-lib/src/main/java/com/microsoft/azure/toolkit/lib/springcloud/SpringCloudDeploymentDraft.java`
#### Snippet
```java
            messager.success(AzureString.format("Deployment({0}) is successfully updated.", deployment.name()));
        }
        deployment = this.scaleDeploymentInAzure(deployment);
        return deployment;
    }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/ConfigParser.java`
#### Snippet
```java
        final RuntimeConfiguration runtime = mojo.getRuntimeConfiguration();
        if (runtime == null) {
            return null;
        }
        final OperatingSystem os = Optional.ofNullable(runtime.getOs()).map(OperatingSystem::fromString)
```

### ReturnNull
Return of `null`
in `azure-functions-maven-plugin/src/main/java/com/microsoft/azure/maven/function/ConfigParser.java`
#### Snippet
```java
        final String servicePlan = mojo.getAppServicePlanName();
        final String servicePlanGroup = StringUtils.firstNonBlank(mojo.getAppServicePlanResourceGroup(), mojo.getResourceGroup());
        return StringUtils.isAnyBlank(subscriptionId, servicePlan, servicePlanGroup) ? null :
                Azure.az(AzureAppService.class).plans(subscriptionId).get(servicePlan, servicePlanGroup);
    }
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/XMLUtils.java`
#### Snippet
```java
    public static String getChildValue(String attribute, Element element) {
        final Element child = element.element(attribute);
        return child == null ? null : child.getText();
    }

```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java
    @Override
    public String toString() {
        return webappInner != null ? String.format("%s (%s)", webappInner.name(), getDescription()) : null;
    }

```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java
    public OperatingSystem getOperatingSystem() {
        if (webappInner == null) {
            return null;
        }
        return webappInner.getRuntime().getOperatingSystem();
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java
    public String getServicePlanId() {
        if (webappInner == null) {
            return null;
        }
        return webappInner.getAppServicePlan().getId();
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/models/WebAppOption.java`
#### Snippet
```java

    public String getId() {
        return this.webappInner == null ? null : webappInner.id();
    }

```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/utils/Utils.java`
#### Snippet
```java
    public static String findStringInCollectionIgnoreCase(Collection<String> strs, String find) {
        if (Objects.isNull(strs) || Objects.isNull(find)) {
            return null;
        }
        return strs.stream().filter(str -> StringUtils.equalsIgnoreCase(str, find)).findFirst().orElse(null);
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/handlers/WebAppPomHandler.java`
#### Snippet
```java
    public Element getConfiguration() {
        final Element mavenPlugin = getMavenPluginElement();
        return mavenPlugin == null ? null : mavenPlugin.element("configuration");
    }

```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/handlers/WebAppPomHandler.java`
#### Snippet
```java
            }
        } catch (NullPointerException e) {
            return null;
        }
        return null;
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/handlers/WebAppPomHandler.java`
#### Snippet
```java
            return null;
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/configuration/ContainerSetting.java`
#### Snippet
```java

    public String getRegistryUrl() {
        return registryUrl == null ? null : registryUrl.toString();
    }

```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
        if (javaOrDockerWebapps.isEmpty()) {
            Log.warn(NO_JAVA_WEB_APPS);
            return null;
        }
        options.addAll(javaOrDockerWebapps);
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            final AzureAppService az = initAzureAppServiceClient();
            if (Objects.isNull(az)) {
                return null;
            }
            final List<Subscription> subscriptions = Azure.az(IAzureAccount.class).account().getSelectedSubscriptions();
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            if (webAppOptionList.isEmpty()) {
                Log.warn(NO_JAVA_WEB_APPS);
                return null;
            }
            final boolean isContainer = !Utils.isJarPackagingProject(this.project.getPackaging());
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            final WebAppOption selectedApp = selectAzureWebApp(javaOrDockerWebapps, getWebAppTypeByPackaging(this.project.getPackaging()), defaultSubs);
            if (selectedApp == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/ConfigMojo.java`
#### Snippet
```java
            // if is valid for config goal to have error in authentication
            getLog().warn(String.format("Cannot authenticate due to error: %s, select existing webapp is skipped.", ex.getMessage()));
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
        final MavenRuntimeConfig runtime = mojo.getRuntime();
        if (runtime == null || runtime.isEmpty()) {
            return null;
        }
        final OperatingSystem os = getOs(runtime);
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
    public Region getRegion() {
        if (StringUtils.isEmpty(mojo.getRegion())) {
            return null;
        }
        return parseExpandableParameter(Region::fromName, mojo.getRegion(), EXPANDABLE_REGION_WARNING);
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
    private static String getRemotePath(@Nonnull DeployType type, Resource resource, File file) {
        if (type.ignorePath()) {
            return null;
        }
        if (StringUtils.isNotBlank(resource.getTargetPath()) || type.requirePath()) {
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
            return normalizePath(Paths.get(StringUtils.defaultString(toDir), file.getName()).toString());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java

    public String getDeploymentSlotName() {
        return mojo.getDeploymentSlotSetting() == null ? null : mojo.getDeploymentSlotSetting().getName();
    }

```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java

    public String getDeploymentSlotConfigurationSource() {
        return mojo.getDeploymentSlotSetting() == null ? null : mojo.getDeploymentSlotSetting().getConfigurationSource();
    }

```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
        final MavenRuntimeConfig runtime = mojo.getRuntime();
        if (runtime == null || runtime.isEmpty()) {
            return null;
        }
        final OperatingSystem os = getOs(runtime);
```

### ReturnNull
Return of `null`
in `azure-webapp-maven-plugin/src/main/java/com/microsoft/azure/maven/webapp/parser/ConfigParser.java`
#### Snippet
```java
    public PricingTier getPricingTier() {
        if (StringUtils.isEmpty(mojo.getPricingTier())) {
            return null;
        }
        return parseExpandableParameter(input -> {
```

### ReturnNull
Return of `null`
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
                log.warn(warningMessage);
            }
            return null;
        }
        final boolean autoSelect = TemplateUtils.evalBoolean("auto_select", variables);
```

### ReturnNull
Return of `null`
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
                    throw new InvalidConfigurationException(TemplateUtils.evalText("message.select_none", variables));
                }
                return null;
            }
            return options.get(0);
```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/model/SubscriptionOption.java`
#### Snippet
```java

    public String getSubscriptionName() {
        return inner != null ? inner.getName() : null;
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/model/SubscriptionOption.java`
#### Snippet
```java
    @Override
    public String toString() {
        return inner != null ? getSubscriptionName(this.inner) : null;
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/ProjectUtils.java`
#### Snippet
```java
    public static IProject convertCommonProject(MavenProject project) {
        if (project == null) {
            return null;
        }
        final JavaProject proj = new JavaProject();
```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/model/SubscriptionOption2.java`
#### Snippet
```java
    @Override
    public String toString() {
        return inner != null ? getSubscriptionName(this.inner) : null;
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/model/SubscriptionOption2.java`
#### Snippet
```java

    public String getSubscriptionName() {
        return inner != null ? inner.displayName() : null;
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/model/SubscriptionOption2.java`
#### Snippet
```java

    public String getSubscriptionId() {
        return inner != null ? inner.subscriptionId() : null;
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/toolkit/maven/common/action/MavenActionManager.java`
#### Snippet
```java
    @Override
    public <D> Action<D> getAction(Action.Id<D> id) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/toolkit/maven/common/action/MavenActionManager.java`
#### Snippet
```java
    @Override
    public ActionGroup getGroup(String id) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenUtils.java`
#### Snippet
```java
    private static Plugin getPluginFromMavenModel(Model model, String pluginKey) {
        if (model.getBuild() == null) {
            return null;
        }
        for (final Plugin plugin: model.getBuild().getPlugins()) {
```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenUtils.java`
#### Snippet
```java

        if (model.getBuild().getPluginManagement() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/MavenUtils.java`
#### Snippet
```java
    public static Xpp3Dom getPluginConfiguration(MavenProject mavenProject, String pluginKey) {
        final Plugin plugin = getPluginFromMavenModel(mavenProject.getModel(), pluginKey);
        return plugin == null ? null : (Xpp3Dom) plugin.getConfiguration();
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/auth/MavenSettingHelper.java`
#### Snippet
```java
    private static String getPropertyValue(final Xpp3Dom configuration, final String property) {
        final Xpp3Dom node = configuration.getChild(property);
        return Objects.isNull(node) ? null : node.getValue();
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/utils/XmlUtils.java`
#### Snippet
```java
    public static String getChildValue(Element element, String attribute) {
        final Element child = element.element(attribute);
        return child == null ? null : child.getText();
    }

```

### ReturnNull
Return of `null`
in `azure-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/prompt/SchemaValidator.java`
#### Snippet
```java
    private String formatValidationResults(final ProcessingReport reports) {
        if (reports.isSuccess()) {
            return null;
        }
        final List<String> errors = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/cache/LRUStack.java`
#### Snippet
```java
    public T peek() {
        if (this.data.isEmpty()) {
            return null;
        }
        return new LinkedList<>(this.data.values()).getLast();
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/page/ItemPage.java`
#### Snippet
```java
    @Override
    public String getContinuationToken() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/InstallationIdUtils.java`
#### Snippet
```java
    public static String hash(String mac) {
        if (StringUtils.isEmpty(mac)) {
            return null;
        }
        String ret;
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/InstallationIdUtils.java`
#### Snippet
```java
            ret = sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
        return ret;
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/proxy/ProxyManager.java`
#### Snippet
```java
    private static Proxy createHttpProxy(String httpProxyHost, Integer httpProxyPort) {
        return StringUtils.isNotBlank(httpProxyHost) ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress(httpProxyHost,
            httpProxyPort)) : null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/proxy/ProxyManager.java`
#### Snippet
```java
                .build();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/proxy/ProxyManager.java`
#### Snippet
```java
            joiner.add(regex);
        }
        return disjunctionEmpty ? null : Pattern.compile(joiner.toString());
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/proxy/ProxyManager.java`
#### Snippet
```java
            return ProxyInfo.builder().source("system").host(address.getHostName()).port(address.getPort()).build();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/proxy/ProxyManager.java`
#### Snippet
```java
                                    }
                                }
                                return null;
                            }
                        }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/aspect/MethodInvocation.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/JsonUtils.java`
#### Snippet
```java
            return MAPPER.readValue(isr, clazz);
        } catch (IOException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/Utils.java`
#### Snippet
```java
    public static String getSegment(String id, String segment) {
        if (StringUtils.isEmpty(id)) {
            return null;
        }
        final String[] attributes = StringUtils.lowerCase(id).split("/");
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/Utils.java`
#### Snippet
```java
            return attributes[pos + 1];
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/messager/AzureMessage.java`
#### Snippet
```java
            return (Action<?>) action;
        } catch (Throwable t) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/Operation.java`
#### Snippet
```java
        final Operation parent = this.getParent();
        if (parent == null) {
            return null;
        } else if (!parent.getId().equals(UNKNOWN_NAME)) {
            return parent;
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/Operation.java`
#### Snippet
```java
        final SimpleOperation operation = new SimpleOperation(title, () -> {
            body.run();
            return null;
        }, type);
        AzureOperationAspect.execute(operation, source);
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/operation/OperationThreadContext.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java

        default Object deploy() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java

        default Object restart() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java

        default Object edit() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java

        default Object delete() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java

        default Object start() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java

        default Object refresh() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java
    public interface Shortcuts {
        default Object add() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java

        default Object stop() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/action/AzureActionManager.java`
#### Snippet
```java

        default Object view() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/validator/SchemaValidator.java`
#### Snippet
```java
                        return reflections.getResources(".*\\.json");
                    } catch (Exception exception) {
                        return null;
                    }
                })
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceGroupConfig.java`
#### Snippet
```java
    public static ResourceGroupConfig fromResource(@Nullable ResourceGroup group) {
        if (Objects.isNull(group)) {
            return null;
        }
        return ResourceGroupConfig.builder()
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/resource/ResourceDeployment.java`
#### Snippet
```java
                return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(t);
            } catch (JsonProcessingException e) {
                return null;
            }
        }).orElse(null);
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/utils/CommandUtils.java`
#### Snippet
```java
        if (isWindows()) {
            if (StringUtils.isEmpty(DEFAULT_WINDOWS_SYSTEM_ROOT)) {
                return null;
            }
            return DEFAULT_WINDOWS_SYSTEM_ROOT + "\\system32";
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-storage-lib/src/main/java/com/microsoft/azure/toolkit/lib/storage/StorageAccount.java`
#### Snippet
```java
        return remoteOptional().map(remote -> {
            String[] replicationArr = remote.skuType().name().toString().split("_");
            return replicationArr.length == 2 ? Performance.fromName(replicationArr[0]) : null;
        }).orElse(null);
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AbstractAzResource.java`
#### Snippet
```java
                this.deleteFromAzure();
            }
            return null;
        }, Status.DELETING);
        this.deleteFromCache();
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/task/AzureTask.java`
#### Snippet
```java
        this(project, title, cancellable, () -> {
            runnable.run();
            return null;
        }, modality);
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/RevisionDraft.java`
#### Snippet
```java
    @Override
    public com.azure.resourcemanager.appcontainers.models.Revision createResourceInAzure() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/RevisionDraft.java`
#### Snippet
```java
    @Override
    public com.azure.resourcemanager.appcontainers.models.Revision updateResourceInAzure(@Nonnull com.azure.resourcemanager.appcontainers.models.Revision origin) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlCosmosDBAccount.java`
#### Snippet
```java
        } catch (Throwable e) {
            // swallow exception to load data client
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlContainer.java`
#### Snippet
```java
        } catch (Throwable e) {
            // swallow exception to load data client
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/ContainerAppDraft.java`
#### Snippet
```java
            return new Secret().withName(passwordName).withValue(password);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-containerapps-lib/src/main/java/com/microsoft/azure/toolkit/lib/containerapps/containerapp/ContainerAppDraft.java`
#### Snippet
```java
            return new RegistryCredentials().withServer(registry.getLoginServerUrl()).withUsername(username).withPasswordSecretRef(passwordName);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/model/ThroughputConfig.java`
#### Snippet
```java
        assert ObjectUtils.anyNull(throughput, maxThroughput);
        if (ObjectUtils.allNull(throughput, maxThroughput)) {
            return null;
        }
        final CreateUpdateOptions options = new CreateUpdateOptions();
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlDatabaseModule.java`
#### Snippet
```java
                    return client.getSqlDatabase(parent.getResourceGroupName(), parent.getName(), name);
                } catch (RuntimeException e) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlDatabaseModule.java`
#### Snippet
```java
                return client.listSqlDatabases(parent.getResourceGroupName(), parent.getName()).iterableByPage(getPageSize()).iterator();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Collections.emptyIterator());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlDatabaseModule.java`
#### Snippet
```java
                return client.listSqlDatabases(parent.getResourceGroupName(), parent.getName()).stream();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Stream.empty());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlContainerDraft.java`
#### Snippet
```java
        final List<String> uniqueKeys = ensureConfig().getUniqueKeys();
        if (CollectionUtils.isEmpty(uniqueKeys)) {
            return null;
        }
        final List<UniqueKey> uniqueKeyList = uniqueKeys.stream().map(path -> Arrays.asList(path.split(",")))
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlContainerModule.java`
#### Snippet
```java
                return client.getSqlContainer(parent.getResourceGroupName(), parent.getParent().getName(), parent.getName(), name);
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(null);
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlContainerModule.java`
#### Snippet
```java
                return client.listSqlContainers(parent.getResourceGroupName(), parent.getParent().getName(), parent.getName()).stream();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Stream.empty());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/sql/SqlContainerModule.java`
#### Snippet
```java
                return client.listSqlContainers(parent.getResourceGroupName(), parent.getParent().getName(), parent.getName()).iterableByPage(getPageSize()).iterator();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Collections.emptyIterator());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoDatabaseModule.java`
#### Snippet
```java
                return client.listMongoDBDatabases(parent.getResourceGroupName(), parent.getName()).iterableByPage(getPageSize()).iterator();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Collections.emptyIterator());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoDatabaseModule.java`
#### Snippet
```java
                return client.listMongoDBDatabases(parent.getResourceGroupName(), parent.getName()).stream();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Stream.empty());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoDatabaseModule.java`
#### Snippet
```java
                return client.getMongoDBDatabase(parent.getResourceGroupName(), parent.getName(), name);
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(null);
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoCosmosDBAccount.java`
#### Snippet
```java
        } catch (Throwable e) {
            // swallow exception to load data client
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoCollection.java`
#### Snippet
```java
        } catch (Throwable e) {
            // swallow exception to load data client
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoCollectionModule.java`
#### Snippet
```java
                return client.listMongoDBCollections(parent.getResourceGroupName(), parent.getParent().getName(), parent.getName()).stream();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Stream.empty());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoCollectionModule.java`
#### Snippet
```java
                return client.getMongoDBCollection(parent.getResourceGroupName(), parent.getParent().getName(), parent.getName(), name);
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(null);
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoCollectionModule.java`
#### Snippet
```java
                return client.listMongoDBCollections(parent.getResourceGroupName(), parent.getParent().getName(), parent.getName()).iterableByPage(getPageSize()).iterator();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Collections.emptyIterator());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraKeyspaceModule.java`
#### Snippet
```java
                return client.listCassandraKeyspaces(parent.getResourceGroupName(), parent.getName()).iterableByPage(getPageSize()).iterator();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Collections.emptyIterator());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraKeyspaceModule.java`
#### Snippet
```java
                return client.getCassandraKeyspace(parent.getResourceGroupName(), parent.getName(), name);
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(null);
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraKeyspaceModule.java`
#### Snippet
```java
                return client.listCassandraKeyspaces(parent.getResourceGroupName(), parent.getName()).stream();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Stream.empty());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraTableModule.java`
#### Snippet
```java
                return client.listCassandraTables(parent.getResourceGroupName(), parent.getParent().getName(), parent.getName()).stream();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Stream.empty());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraTableModule.java`
#### Snippet
```java
                return client.listCassandraTables(parent.getResourceGroupName(), parent.getParent().getName(), parent.getName()).iterableByPage(getPageSize()).iterator();
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(Collections.emptyIterator());
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/cassandra/CassandraTableModule.java`
#### Snippet
```java
                return client.getCassandraTable(parent.getResourceGroupName(), parent.getParent().getName(), parent.getName(), name);
            } catch (final RuntimeException e) {
                return null;
            }
        }).orElse(null);
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-cosmos-lib/src/main/java/com/microsoft/azure/toolkit/lib/cosmos/mongo/MongoDocument.java`
#### Snippet
```java
        final String sharedKey = getParent().getSharedKey();
        final ObjectNode document = getDocument();
        return ObjectUtils.allNotNull(sharedKey, document) ? document.get(sharedKey).asText() : null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureCloud.java`
#### Snippet
```java
    public String getName() {
        final AzureEnvironment env = get();
        return env == null ? null : AzureEnvironmentUtils.getCloudName(env);
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-auth-lib/src/main/java/com/microsoft/azure/toolkit/lib/auth/AzureCloud.java`
#### Snippet
```java
    public AzureEnvironment get() {
        final String cloud = Azure.az().config().getCloud();
        return StringUtils.isNotBlank(cloud) ? AzureEnvironmentUtils.stringToAzureEnvironment(cloud) : null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/utils/FunctionUtils.java`
#### Snippet
```java
    public static FunctionExtensionVersion parseFunctionExtensionVersionFromHostJson(String version) {
        final Matcher matcher = VERSION_PATTERN.matcher(version);
        return matcher.find() ? parseFunctionExtensionVersion(matcher.group(1)) : null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/bindings/BindingFactory.java`
#### Snippet
```java
                .filter(declaredAnnotation -> StringUtils.equals(declaredAnnotation.annotationType().getCanonicalName(), CUSTOM_BINDING))
                .findFirst().orElse(null);
        return customBindingAnnotation == null ? null : new ExtendedCustomBinding(BindingEnum.ExtendedCustomBinding,
                customBindingAnnotation, annotation);
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/TemplateResources.java`
#### Snippet
```java

    public static String getResourceByNameWithDollar(String name) {
        return map == null ? null : map.get(name.substring(1));
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/FunctionCoreToolsHandlerImpl.java`
#### Snippet
```java
        } catch (Exception e) {
            AzureMessager.getMessager().warning(GET_LATEST_VERSION_FAIL);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/FunctionCoreToolsHandlerImpl.java`
#### Snippet
```java
        } catch (Exception e) {
            AzureMessager.getMessager().warning(GET_LOCAL_VERSION_FAIL);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/FunctionSettingTemplate.java`
#### Snippet
```java

    public String getSettingRegex() {
        return (validators != null && validators.length > 0) ? validators[0].getExpression() : null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/FunctionSettingTemplate.java`
#### Snippet
```java

    public String getErrorText() {
        return (validators != null && validators.length > 0) ? validators[0].getErrorText() : null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/template/FunctionTemplate.java`
#### Snippet
```java

    public Set<FunctionExtensionVersion> getSupportedExtensionVersions() {
        return CollectionUtils.isEmpty(this.bundle) ? null : bundle.stream().map(FunctionUtils::parseFunctionExtensionVersion).collect(Collectors.toSet());
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/CreateOrUpdateWebAppTask.java`
#### Snippet
```java
                .build();
        }
        return null;

    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/CreateOrUpdateWebAppTask.java`
#### Snippet
```java
            return Runtime.getRuntime(OperatingSystem.DOCKER, WebContainer.JAVA_OFF, JavaVersion.OFF);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/CreateOrUpdateFunctionAppTask.java`
#### Snippet
```java
        if (StringUtils.isNotEmpty(functionAppConfig.deploymentSlotName())) {
            AzureMessager.getMessager().info("Skip update app service plan for deployment slot");
            return null;
        }
        return new AzureTask<>(() -> {
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/CreateOrUpdateFunctionAppTask.java`
#### Snippet
```java
                final String errorMessage = Optional.ofNullable(ExceptionUtils.getRootCause(e)).orElse(e).getMessage();
                AzureMessager.getMessager().warning(String.format(APPLICATION_INSIGHTS_CREATE_FAILED, errorMessage));
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/CreateOrUpdateFunctionAppTask.java`
#### Snippet
```java
                    .build();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/task/DeployWebAppTask.java`
#### Snippet
```java
        final CsmDeploymentStatus deploymentStatus = target.getDeploymentStatus(result.getDeploymentId());
        if (Objects.isNull(deploymentStatus)) {
            return null;
        }
        final String statusMessage = String.format("Deployment Status: %s; Successful Instance Count: %s; In-progress Instance Count: %s; Failed Instance Count: %s",
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/config/AppServicePlanConfig.java`
#### Snippet
```java
    public static AppServicePlanConfig fromResource(@Nullable AppServicePlan plan) {
        if (Objects.isNull(plan)) {
            return null;
        }
        return AppServicePlanConfig.builder()
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/Utils.java`
#### Snippet
```java
        String[] segments = linuxFxVersion.split(Pattern.quote("|"));
        if (segments.length != 2) {
            return null;
        }
        final String image = segments[1];
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
        final WebContainer webContainer = runtime.getWebContainer();
        if (webContainer == null || Objects.equals(webContainer, WebContainer.JAVA_OFF)) {
            return null;
        }
        if (Objects.equals(webContainer, WebContainer.JAVA_SE)) {
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/utils/AppServiceUtils.java`
#### Snippet
```java
        final Object config = functionEnvelope.config();
        if (!(config instanceof Map)) {
            return null;
        }
        final Map<?, ?> envelopeConfigMap = (Map<?, ?>) config;
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/FunctionAnnotation.java`
#### Snippet
```java
            throw new AzureToolkitRuntimeException(String.format("Unexpected key '%s' with type '%s'", key, value.getClass().getSimpleName()));
        }
        return value == null ? null : (String) value;
    }

```

### ReturnNull
Return of `null`
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/MavenDockerCredentialProvider.java`
#### Snippet
```java
            initializeServer();
        }
        return server != null ? server.getPassword() : null;
    }

```

### ReturnNull
Return of `null`
in `azure-appservice-maven-plugin-lib/src/main/java/com/microsoft/azure/maven/appservice/MavenDockerCredentialProvider.java`
#### Snippet
```java
            initializeServer();
        }
        return server != null ? server.getUsername() : null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackagerBase.java`
#### Snippet
```java
            return createRetryFromMap(exponentialBackoffRetry.getAllAnnotationProperties());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackagerBase.java`
#### Snippet
```java
            return createBinding(annotationEnum, annotation);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/appservice/function/core/AzureFunctionPackager.java`
#### Snippet
```java
            return JsonUtils.fromJson(jsonRaw, new TypeReference<HashMap<String, Object>>(){});
        } catch (IOException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `azure-toolkit-libs/azure-toolkit-appservice-lib/src/main/java/com/microsoft/azure/toolkit/lib/legacy/function/handlers/AnnotationHandlerImpl.java`
#### Snippet
```java
            return Retry.createExponentialBackoffRetryFromAnnotation(exponentialBackoffRetry);
        }
        return null;
    }

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `input`
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
                // convert user input from y to true and N to false
                if (input.equalsIgnoreCase("Y")) {
                    input = "true";
                }
                if (input.equalsIgnoreCase("N")) {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `input`
in `azure-spring-apps-maven-plugin/src/main/java/com/microsoft/azure/maven/springcloud/config/ConfigurationPrompter.java`
#### Snippet
```java
                }
                if (input.equalsIgnoreCase("N")) {
                    input = "false";
                }
            }
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

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `azure-toolkit-libs/azure-toolkit-common-lib/src/main/java/com/microsoft/azure/toolkit/lib/common/model/AzResource.java`
#### Snippet
```java

        @Override
        public boolean equals(Object o) {
            return AzResource.NONE == o;
        }
```

