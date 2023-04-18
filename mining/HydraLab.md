# HydraLab 
 
# Bad smells
I found 786 bad smells with 100 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 95 | false |
| ThrowablePrintStackTrace | 72 | false |
| NullableProblems | 62 | false |
| SizeReplaceableByIsEmpty | 42 | true |
| DynamicRegexReplaceableByCompiledPattern | 42 | false |
| RedundantFieldInitialization | 40 | false |
| UnusedAssignment | 37 | false |
| DataFlowIssue | 34 | false |
| SystemOutErr | 27 | false |
| BoundedWildcard | 26 | false |
| UtilityClassWithoutPrivateConstructor | 24 | true |
| MissortedModifiers | 23 | false |
| IgnoreResultOfCall | 20 | false |
| NestedAssignment | 20 | false |
| SynchronizeOnThis | 19 | false |
| AssignmentToMethodParameter | 14 | false |
| UnnecessaryLocalVariable | 14 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 12 | false |
| ConstantValue | 12 | false |
| StaticCallOnSubclass | 10 | false |
| DefaultAnnotationParam | 10 | false |
| UNUSED_IMPORT | 10 | false |
| PublicFieldAccessedInSynchronizedContext | 9 | false |
| KeySetIterationMayUseEntrySet | 7 | false |
| AssignmentToStaticFieldFromInstanceMethod | 6 | false |
| DoubleBraceInitialization | 5 | false |
| StringEqualsEmptyString | 5 | false |
| NonProtectedConstructorInAbstractClass | 5 | true |
| UnnecessaryStringEscape | 4 | true |
| RedundantArrayCreation | 4 | true |
| ObjectNotify | 4 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| TrivialStringConcatenation | 3 | false |
| UnnecessarySemicolon | 3 | false |
| SwitchStatementWithConfusingDeclaration | 3 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| ReplaceNullCheck | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| UnnecessaryModifier | 2 | true |
| RegExpRedundantEscape | 2 | false |
| RegExpSimplifiable | 2 | false |
| DuplicateExpressions | 2 | false |
| RedundantMethodOverride | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| CodeBlock2Expr | 2 | true |
| IOResource | 2 | false |
| FieldMayBeStatic | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| WaitNotInLoop | 2 | false |
| ThreadStartInConstruction | 2 | false |
| CommentedOutCode | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| NonFinalFieldOfException | 1 | false |
| OptionalIsPresent | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CatchMayIgnoreException | 1 | false |
| RedundantSuppression | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| Java8MapApi | 1 | false |
| Convert2Lambda | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunDeviceOrchestrator.java`
#### Snippet
```java
    public boolean isTesting(@NotNull TestRunDevice testRunDevice) {
        if (testRunDevice instanceof TestRunDeviceCombo) {
            Boolean isTesting = false;
            for (TestRunDevice testRunDevice1 : ((TestRunDeviceCombo) testRunDevice).getDevices()) {
                isTesting = isTesting || testRunDevice1.getDeviceInfo().isTesting();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunDeviceOrchestrator.java`
#### Snippet
```java
    public boolean isAlive(@NotNull TestRunDevice testRunDevice) {
        if (testRunDevice instanceof TestRunDeviceCombo) {
            Boolean isAlive = true;
            for (TestRunDevice testRunDevice1 : ((TestRunDeviceCombo) testRunDevice).getDevices()) {
                isAlive = isAlive && testRunDevice1.getDeviceInfo().isAlive();
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/main/java/com/microsoft/hydralab/common/logger/LogCollector.java`
#### Snippet
```java

public interface LogCollector {
    static final String LOGGER_PREFIX = "logger.devices.";
    String start();
    void stopAndAnalyse();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/main/java/com/microsoft/hydralab/common/logger/LogCollector.java`
#### Snippet
```java

public interface LogCollector {
    static final String LOGGER_PREFIX = "logger.devices.";
    String start();
    void stopAndAnalyse();
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `parseObject()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
            String resString = smartTestUtil.runPYFunction(smartTestParam, logger);
            Assert.notEmpty(resString, "Run Smart Test Failed!");
            res = JSONObject.parseObject(resString);
            isSuccess = res.getBoolean(Const.SmartTestConfig.SUCCESS_TAG);
            crashStack = res.getJSONArray(Const.SmartTestConfig.APP_EXP_TAG);
```

### StaticCallOnSubclass
Static method `parseObject()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
            String b64payload = pieces[1];
            String jsonString = new String(Base64.decodeBase64(b64payload), FileUtil.UTF_8);
            userInfo = JSONObject.parseObject(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
```

### StaticCallOnSubclass
Static method `parseObject()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/ActionExecutor.java`
#### Snippet
```java
                logger.info("Convert directly: failed. Try to convert by JSONObject", actionArgs.get(i));
                try {
                    methodArgs[i + 1] = JSONObject.parseObject(actionArgs.get(i), DeviceAction.class);
                } catch (Exception e1) {
                    throw new HydraLabRuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.value(),
```

### StaticCallOnSubclass
Static method `parseObject()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/local/client/LocalStorageClient.java`
#### Snippet
```java

        ResponseEntity<String> responseAsStr = restTemplateHttps.exchange(this.getUploadUrl(), HttpMethod.POST, entity, String.class);
        JSONObject responseObject = JSONObject.parseObject(responseAsStr.getBody());
        return this.endpoint + Const.LocalStorageURL.CENTER_LOCAL_STORAGE_DOWNLOAD + "/" + responseObject.getString("content");
    }
```

### StaticCallOnSubclass
Static method `toJSONString()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `common/src/main/java/com/microsoft/hydralab/common/entity/agent/SmartTestParam.java`
#### Snippet
```java

        this.apkPath = apkPath;
        this.deviceInfo = JSONObject.toJSONString(deviceInfo).replaceAll("\"", "'");
        this.modelInfo = modelInfo.toJSONString().replaceAll("\"", "'");
        this.testSteps = String.valueOf(testSteps);
```

### StaticCallOnSubclass
Static method `parseArray()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONArray'
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
                JSONArray values = null;
                try {
                    values = JSONArray.parseArray(value);
                } catch (Exception e) {
                    e.printStackTrace();
```

### StaticCallOnSubclass
Static method `parseObject()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/JsonConverter.java`
#### Snippet
```java
    @Override
    public JSONObject convertToEntityAttribute(String dbData) {
        return JSONObject.parseObject(dbData);
    }
}
```

### StaticCallOnSubclass
Static method `xpath()` declared in class 'org.openqa.selenium.By' but referenced via subclass 'io.appium.java_client.AppiumBy'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/BaseDriverController.java`
#### Snippet
```java
        try {
            elementFound = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                    .until(driver -> driver.findElement(AppiumBy.xpath("//*[@name='" + name + "']")));
        } catch (Exception e) {
            logger.info("Can not find element by name: " + name);
```

### StaticCallOnSubclass
Static method `xpath()` declared in class 'org.openqa.selenium.By' but referenced via subclass 'io.appium.java_client.AppiumBy'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/BaseDriverController.java`
#### Snippet
```java
        try {
            elementFound = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                    .until(driver -> driver.findElement(AppiumBy.xpath("//*[@text='" + text + "']")));
        } catch (Exception e) {
            logger.info("Can not find element by text: " + text);
```

### StaticCallOnSubclass
Static method `xpath()` declared in class 'org.openqa.selenium.By' but referenced via subclass 'io.appium.java_client.AppiumBy'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/BaseDriverController.java`
#### Snippet
```java
        try {
            elementFound = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                    .until(driver -> driver.findElement(AppiumBy.xpath(xpath)));
        } catch (Exception e) {
            logger.info("Can not find element by XPath: " + xpath);
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
        GENERAL_PASSWORD("\\w*(password|pwd)[=:\\\"\\s]*(\\w*)"),
        PASSWORD_CONFIRMATION("(password[_\\s-]*confirmation)[=:\"\\s]*(\\w*)"),
        EMAIL("[&,;\"\'\\s]+(mail)[=:\"\\s]*(\\w*)"),
        GENERAL_EMAIL("\\w*(mail)[=:\\\"\\s]*(\\w*)"),
        API_KEY("(api[_\\s-]*key)[=:\"\\s]*(\\w*)"),
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
    public enum MaskSensitiveData {
        CURRENT_PASSWORD("(current[_\\s-]*password)[=:\"\\s]*(\\w*)"),
        PASSWORD("[&,;\"\'\\s]+(password|pwd)[=:\"\\s]*(\\w*)"),
        GENERAL_PASSWORD("\\w*(password|pwd)[=:\\\"\\s]*(\\w*)"),
        PASSWORD_CONFIRMATION("(password[_\\s-]*confirmation)[=:\"\\s]*(\\w*)"),
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        GENERAL_PASSWORD("\\w*(password|pwd)[=:\\\"\\s]*(\\w*)"),
        PASSWORD_CONFIRMATION("(password[_\\s-]*confirmation)[=:\"\\s]*(\\w*)"),
        EMAIL("[&,;\"\'\\s]+(mail)[=:\"\\s]*(\\w*)"),
        GENERAL_EMAIL("\\w*(mail)[=:\\\"\\s]*(\\w*)"),
        API_KEY("(api[_\\s-]*key)[=:\"\\s]*(\\w*)"),
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
    public enum MaskSensitiveData {
        CURRENT_PASSWORD("(current[_\\s-]*password)[=:\"\\s]*(\\w*)"),
        PASSWORD("[&,;\"\'\\s]+(password|pwd)[=:\"\\s]*(\\w*)"),
        GENERAL_PASSWORD("\\w*(password|pwd)[=:\\\"\\s]*(\\w*)"),
        PASSWORD_CONFIRMATION("(password[_\\s-]*confirmation)[=:\"\\s]*(\\w*)"),
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/XmlTestRunListener.java`
#### Snippet
```java
    private static final String ATTR_ASSERTIOMS = "assertions";
    private static final String ATTR_TESTS = "tests";
    //private static final String ATTR_TYPE = "type";
    //private static final String ATTR_MESSAGE = "message";
    private static final String PROPERTIES = "properties";
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `folderPath` from instance context
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java
        String folderName = Const.SmartTestConfig.ZIP_FOLDER_NAME;

        folderPath = testBaseDir.getAbsolutePath() + "/" + Const.SmartTestConfig.ZIP_FOLDER_NAME + "/";
        stringFolderPath = testBaseDir.getAbsolutePath() + "/" + Const.SmartTestConfig.STRING_FOLDER_NAME
                + "/";
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `stringFolderPath` from instance context
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java

        folderPath = testBaseDir.getAbsolutePath() + "/" + Const.SmartTestConfig.ZIP_FOLDER_NAME + "/";
        stringFolderPath = testBaseDir.getAbsolutePath() + "/" + Const.SmartTestConfig.STRING_FOLDER_NAME
                + "/";

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `filePath` from instance context
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java
        }
        initStringPool();
        filePath = folderPath + Const.SmartTestConfig.PY_FILE_NAME;
        String requireFilePath = folderPath + Const.SmartTestConfig.REQUIRE_FILE_NAME;
        String[] command = new String[]{"pip3", "install", "-r", requireFilePath};
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `folderPath` from instance context
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestRunner.java`
#### Snippet
```java
    private void unzipXctestFolder(File zipFile, TestRun testRun, Logger logger) {
        logger.info("start unzipping file");
        folderPath = testRun.getResultFolder().getAbsolutePath() + "/"
                + Const.XCTestConfig.XCTEST_ZIP_FOLDER_NAME + "/";

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpringApplicationListener.applicationContext` from instance context
in `center/src/main/java/com/microsoft/hydralab/center/config/SpringApplicationListener.java`
#### Snippet
```java
    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        SpringApplicationListener.applicationContext = applicationContext;
    }
}
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `isAuthedBySAS` from instance context
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
        fileLimitDay = azureBlobProperty.getFileLimitDay();
        cdnUrl = azureBlobProperty.getCDNUrl();
        isAuthedBySAS = false;
        isConnected = true;
    }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
                entryName = new String(entry.getName());
                //separate entry names with/
                names = entryName.split("\\/");
                length = names.length;
                for (int v = 0; v < length; v++) {
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java

    private void parseCoordinates(String bounds) {
        String[] boundsArray = bounds.split("\\[|\\]|,");
        String[] validArr = Arrays.stream(boundsArray).filter(StringUtils::isNotEmpty).toArray(String[]::new);
        int x1 = Integer.parseInt(validArr[0]);
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            testJsonInfo.setTeamName(team.getTeamName());
            String newFileName = formatDate.format(testJsonInfo.getIngestTime()) + FILE_SUFFIX.JSON_FILE;
            File savedJson = attachmentService.verifyAndSaveFile(testJsonFile, parentDir, false, newFileName, new String[]{FILE_SUFFIX.JSON_FILE});
            String fileRelPath = fileRelativePath + "/" + savedJson.getName();
            testJsonInfo.setBlobPath(fileRelPath);
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        String parentDir = CENTER_FILE_BASE_DIR + fileRelativeParent;
        try {
            File savedPkg = attachmentService.verifyAndSaveFile(packageFile, parentDir, false, null, new String[]{FILE_SUFFIX.JAR_FILE});
            StorageFileInfo storageFileInfo = new StorageFileInfo(savedPkg, fileRelativeParent, StorageFileInfo.FileType.AGENT_PACKAGE);
            return Result.ok(attachmentService.saveFileInStorageAndDB(storageFileInfo, savedPkg, EntityType.AGENT_PACKAGE, logger));
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            File tempAppFile =
                    attachmentService.verifyAndSaveFile(appFile, CENTER_FILE_BASE_DIR + relativeParent, false, null,
                            new String[]{FILE_SUFFIX.APK_FILE, FILE_SUFFIX.IPA_FILE, FILE_SUFFIX.ZIP_FILE});
            StorageFileInfo appFileInfo = new StorageFileInfo(tempAppFile, relativeParent, StorageFileInfo.FileType.APP_FILE);
            //Upload app file
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            if (testAppFile != null && !testAppFile.isEmpty()) {
                File tempTestAppFile = attachmentService.verifyAndSaveFile(testAppFile, CENTER_FILE_BASE_DIR + relativeParent, false, null,
                        new String[]{FILE_SUFFIX.APK_FILE, FILE_SUFFIX.JAR_FILE, FILE_SUFFIX.JSON_FILE});

                StorageFileInfo testAppFileInfo = new StorageFileInfo(tempTestAppFile, relativeParent, StorageFileInfo.FileType.TEST_APP_FILE);
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `testAgentDevicesMap.keySet()` may be replaced with 'entrySet()' iteration
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        }
        Assert.isTrue(!isAllOffline, "All Device/Agent Offline!");
        for (String agentId : testAgentDevicesMap.keySet()) {
            AgentSessionInfo agentSessionInfoByAgentId = getAgentSessionInfoByAgentId(agentId);
            List<String> testDeviceSerials = testAgentDevicesMap.get(agentId);
```

### KeySetIterationMayUseEntrySet
Iteration over `keys` may be replaced with 'entrySet()' iteration
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        List<DeviceGroup> res = new ArrayList<>();
        Set<String> keys = deviceGroupListMap.keySet();
        for (String key : keys) {
            DeviceGroup group = deviceGroupService.getGroupByName(key);
            if (group == null) {
```

### KeySetIterationMayUseEntrySet
Iteration over `keys` may be replaced with 'values()' iteration
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        List<AgentDeviceGroup> res = new ArrayList<>();
        Set<String> keys = agentDeviceGroups.keySet();
        for (String key : keys) {
            AgentDeviceGroup agent = agentDeviceGroups.get(key);
            List<DeviceInfo> windowsDevices = agent.getDevices().stream().filter(deviceInfo -> DeviceType.WINDOWS.name().equals(deviceInfo.getType())).collect(Collectors.toList());
```

### KeySetIterationMayUseEntrySet
Iteration over `keys` may be replaced with 'values()' iteration
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        List<DeviceInfo> res = new ArrayList<>();
        Set<String> keys = deviceListMap.keySet();
        for (String key : keys) {
            DeviceInfo device = deviceListMap.get(key);
            if (device.isAlive()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `keys` may be replaced with 'values()' iteration
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        List<AgentUpdateTask> res = new ArrayList<>();
        Set<String> keys = agentUpdateMap.keySet();
        for (String key : keys) {
            res.add(agentUpdateMap.get(key));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `params.keySet()` may be replaced with 'entrySet()' iteration
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
    public static String getFileTextAsCommandParamsTemplateFromResource(String relativePath, Map<String, String> params) {
        String templateStr = getFileTextAsCommandFromResource(relativePath);
        for (String key : params.keySet()) {
            if (!templateStr.contains(key)) {
                continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `deviceDriverMap.keySet()` may be replaced with 'entrySet()' iteration
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/DeviceDriverManager.java`
#### Snippet
```java

    public void init() {
        for (DeviceType deviceType : deviceDriverMap.keySet()) {
            try {
                classLogger.info("Try to init device driver: {}", deviceType);
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `AgentWebSocketClient` on 'this' is unnecessary in this context
in `agent/src/main/java/com/microsoft/hydralab/agent/socket/AgentWebSocketClient.java`
#### Snippet
```java
            byte[] data = SerializeUtil.messageToByteArr(message);
            log.info("send, path: {}, message data len: {}", message.getPath(), data.length);
            AgentWebSocketClient.this.send(data);
        });
    }
```

## RuleId[id=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
            this.inFinish = true;
            synchronized (this) {
                notify();
            }
        }
```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestCommandReceiver.java`
#### Snippet
```java
        } finally {
            synchronized (this) {
                notify();
            }
        }
```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSDeviceWatcher.java`
#### Snippet
```java
        } finally {
            synchronized (this) {
                notify();
            }
        }
```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `common/src/main/java/com/microsoft/hydralab/common/util/CommandOutputReceiver.java`
#### Snippet
```java
        } finally {
            synchronized (this) {
                notify();
            }
        }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java

    public static String getFileTextAsCommandFromResource(String relativePath) {
        return getFileTextFromResource(relativePath).trim().replaceAll("[\n\r]", "").replaceAll("[\\s]{2,}", " ");
    }

```

### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
            templateStr = templateStr.replace(String.format("${%s}", key), params.get(key).trim());
        }
        return templateStr.replaceAll(",? ?\\$\\{\\w+},?", "").replaceAll("[\\s]{2,}", " ");
    }

```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `line.length() > rssEndOffset && line.charAt(rssEndOffset) != ' '`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java

                                // for current memory type, RSS data exists
                                if (line.length() > rssEndOffset && line.charAt(rssEndOffset) != ' ') {
                                    memoryValueArr[typeIndex * 2 + 1] = NumberUtils.toLong(values.split(" +")[2]);
                                }
```

### DuplicateExpressions
Multiple occurrences of `line.length() > rssEndOffset && line.charAt(rssEndOffset) != ' '`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                                    memoryValueArr[typeIndex * 2 + 1] = NumberUtils.toLong(values.split(" +")[2]);
                                }
                            } else if (line.length() > rssEndOffset && line.charAt(rssEndOffset) != ' ') {
                                // for current memory type PSS data doesn't exist and RSS data exists
                                memoryValueArr[typeIndex * 2 + 1] = NumberUtils.toLong(values.split(" +")[1]);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`crashStack.size() > 0` can be replaced with '!crashStack.isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
                    System.currentTimeMillis() - recordingStartTimeMillis);
            testRun.oneMoreFailure();
        } else if (crashStack != null && crashStack.size() > 0) {
            ongoingSmartTest.setStatusCode(AndroidTestUnit.StatusCodes.FAILURE);
            ongoingSmartTest.setSuccess(false);
```

### SizeReplaceableByIsEmpty
`exceptions.size() > 0` can be replaced with '!exceptions.isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunner.java`
#### Snippet
```java
            List<Exception> exceptions = testRunDeviceOrchestrator.doActions(testRunDevice, testRun.getLogger(),
                    testTask.getDeviceActions(), DeviceAction.When.TEAR_DOWN);
            if (exceptions.size() > 0) {
                testRun.getLogger().error("Execute actions failed when tearDown!", exceptions.get(0));
            }
```

### SizeReplaceableByIsEmpty
`exceptions.size() == 0` can be replaced with 'exceptions.isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunner.java`
#### Snippet
```java
            List<Exception> exceptions = testRunDeviceOrchestrator.doActions(testRunDevice, testRun.getLogger(),
                    testTask.getDeviceActions(), DeviceAction.When.SET_UP);
            Assert.isTrue(exceptions.size() == 0, () -> exceptions.get(0));
        }

```

### SizeReplaceableByIsEmpty
`testWindowsApp.length() > 0` can be replaced with '!testWindowsApp.isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/t2c/T2CRunner.java`
#### Snippet
```java
                    WindowsDriver windowsDriver;
                    String testWindowsApp = driverInfo.getLauncherApp();
                    if (testWindowsApp.length() > 0 && !"root".equalsIgnoreCase(testWindowsApp)) {
                        windowsDriver = appiumServerManager.getWindowsAppDriver(testWindowsApp, reportLogger);
                    } else {
```

### SizeReplaceableByIsEmpty
`result.getAttachments().size() > 0` can be replaced with '!result.getAttachments().isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/service/TestTaskEngineService.java`
#### Snippet
```java

    private void processAndSaveDeviceTestResultBlobUrl(TestRun result) {
        Assert.isTrue(result.getAttachments().size() > 0, "deviceTestResultBlobUrl should not null");
        String deviceTestResultBlobUrl = result.getAttachments().get(0).getCDNUrl();
        String fileName = result.getAttachments().get(0).getFileName();
```

### SizeReplaceableByIsEmpty
`chosenDevices.size() == 0` can be replaced with 'chosenDevices.isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/service/TestTaskEngineService.java`
#### Snippet
```java

        Set<TestRunDevice> chosenDevices = chooseDevices(testTask);
        if (chosenDevices.size() == 0) {
            handleNoAvaiableDevice(testTask);
            return testTask;
```

### SizeReplaceableByIsEmpty
`devices.size() == 0` can be replaced with 'devices.isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/service/TestTaskEngineService.java`
#### Snippet
```java

        Set<TestRunDevice> chosenDevices = new HashSet<>();
        if (devices.size() == 0) {
            log.error("No device found for " + targetedDevicesDescriptor);
            return chosenDevices;
```

### SizeReplaceableByIsEmpty
`authTokens.size() > 0` can be replaced with '!authTokens.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/AuthTokenService.java`
#### Snippet
```java
    public boolean checkAuthToken(String authToken) {
        List<AuthToken> authTokens = authTokenRepository.queryByToken(authToken);
        if (authTokens.size() > 0) {
            Authentication authObj = securityUserService.loadUserAuthentication(authTokens.get(0).getCreator(), null);
            if (authObj == null) {
```

### SizeReplaceableByIsEmpty
`queryParams.size() > 0` can be replaced with '!queryParams.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/AgentManageService.java`
#### Snippet
```java
    public List<AgentUser> getFilteredAgents(List<CriteriaType> queryParams) {
        Specification<AgentUser> spec = null;
        if (queryParams != null && queryParams.size() > 0) {
            spec = new CriteriaTypeUtil<AgentUser>().transferToSpecification(queryParams, true);
        }
```

### SizeReplaceableByIsEmpty
`queryParams.size() > 0` can be replaced with '!queryParams.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceGroupService.java`
#### Snippet
```java
    public List<DeviceGroup> queryFilteredGroups(List<CriteriaType> queryParams) {
        Specification<DeviceGroup> spec = null;
        if (queryParams != null && queryParams.size() > 0) {
            spec = new CriteriaTypeUtil<DeviceGroup>().transferToSpecification(queryParams, true);
        }
```

### SizeReplaceableByIsEmpty
`agentDeviceGroup.getDevices().size() > 0` can be replaced with '!agentDeviceGroup.getDevices().isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceManageController.java`
#### Snippet
```java
        }
        deviceGroupList = deviceGroupList.stream()
                .filter(agentDeviceGroup -> agentDeviceGroup.getDevices() != null && agentDeviceGroup.getDevices().size() > 0)
                .sorted((a, b) -> b.getDevices().size() - a.getDevices().size())
                .collect(Collectors.toList());
```

### SizeReplaceableByIsEmpty
`oldTestTask.agentIds.size() == 0` can be replaced with 'oldTestTask.agentIds.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/TestDataService.java`
#### Snippet
```java
        TestTask oldTestTask = testDataServiceCache.getTestTaskDetail(testTask.getId());
        //run by device
        if (oldTestTask.agentIds.size() == 0) {
            testDataServiceCache.saveTestTaskData(testTask);
            return;
```

### SizeReplaceableByIsEmpty
`oldTestTask.agentIds.size() == 0` can be replaced with 'oldTestTask.agentIds.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/TestDataService.java`
#### Snippet
```java
        oldTestTask.agentIds.remove(agentId);

        boolean isAllFinish = oldTestTask.agentIds.size() == 0;
        if (isAllFinish) {
            oldTestTask.setStatus(TestTask.TestStatus.FINISHED);
```

### SizeReplaceableByIsEmpty
`queryParams.size() > 0` can be replaced with '!queryParams.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/TestDataService.java`
#### Snippet
```java
        Root<TestTask> root = query.from(TestTask.class);

        if (queryParams != null && queryParams.size() > 0) {
            query.where(new CriteriaTypeUtil<TestTask>().transferToPredicate(root, criteriaBuilder, queryParams));
        }
```

### SizeReplaceableByIsEmpty
`queryParams.size() > 0` can be replaced with '!queryParams.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/TestDataService.java`
#### Snippet
```java
    public Page<TestTask> getTestTasks(int page, int pageSize, List<CriteriaType> queryParams) {
        Specification<TestTask> spec = null;
        if (queryParams != null && queryParams.size() > 0) {
            spec = new CriteriaTypeUtil<TestTask>().transferToSpecification(queryParams, false);
        }
```

### SizeReplaceableByIsEmpty
`array.size() > 0` can be replaced with '!array.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
                    }
                }
                if (array.size() > 0) {
                    teamIdCriteria.setValue(array.toJSONString());
                    criteriaTypes.add(teamIdCriteria);
```

### SizeReplaceableByIsEmpty
`criteriaTypes.size() == 0` can be replaced with 'criteriaTypes.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceGroupController.java`
#### Snippet
```java
            // return all DeviceGroups in TEAMs that user is in
            List<CriteriaType> criteriaTypes = userTeamManagementService.formTeamIdCriteria(requestor.getTeamAdminMap());
            if (criteriaTypes.size() == 0) {
                return Result.error(HttpStatus.UNAUTHORIZED.value(), "User belongs to no TEAM, please contact administrator for binding TEAM");
            }
```

### SizeReplaceableByIsEmpty
`criteriaTypes.size() == 0` can be replaced with 'criteriaTypes.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestTaskController.java`
#### Snippet
```java
            if (!sysUserService.checkUserAdmin(requestor)) {
                criteriaTypes = userTeamManagementService.formTeamIdCriteria(requestor.getTeamAdminMap());
                if (criteriaTypes.size() == 0) {
                    return Result.error(HttpStatus.UNAUTHORIZED.value(), "User belongs to no TEAM, please contact administrator for binding TEAM");
                }
```

### SizeReplaceableByIsEmpty
`criteriaTypeList.size() == 0` can be replaced with 'criteriaTypeList.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestTaskController.java`
#### Snippet
```java
            if (!sysUserService.checkUserAdmin(requestor)) {
                List<CriteriaType> criteriaTypeList = userTeamManagementService.formTeamIdCriteria(requestor.getTeamAdminMap());
                if (criteriaTypeList.size() == 0) {
                    return Result.error(HttpStatus.UNAUTHORIZED.value(), "User belongs to no TEAM, please contact administrator for binding TEAM");
                }
```

### SizeReplaceableByIsEmpty
`deviceSerials.size() > 0` can be replaced with '!deviceSerials.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        Set<String> deviceSerials = deviceGroupListMap.get(testTaskSpec.deviceIdentifier);
        Assert.notNull(deviceSerials, "error deviceIdentifier or there is no devices in the group!");
        Assert.isTrue(deviceSerials.size() > 0, "error deviceIdentifier or there is no devices in the group!");
        DeviceGroup deviceGroup = deviceGroupService.getGroupByName(testTaskSpec.deviceIdentifier);
        Assert.notNull(deviceGroup, "error deviceIdentifier !");
```

### SizeReplaceableByIsEmpty
`criteriaTypes.size() == 0` can be replaced with 'criteriaTypes.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        if (!sysUserService.checkUserAdmin(requestor)) {
            criteriaTypes = userTeamManagementService.formTeamIdCriteria(requestor.getTeamAdminMap());
            if (criteriaTypes.size() == 0) {
                return Result.error(HttpStatus.UNAUTHORIZED.value(), "User belongs to no TEAM, please contact administrator for binding TEAM");
            }
```

### SizeReplaceableByIsEmpty
`criteriaTypes.size() == 0` can be replaced with 'criteriaTypes.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            if (!sysUserService.checkUserAdmin(requestor)) {
                criteriaTypes = userTeamManagementService.formTeamIdCriteria(requestor.getTeamAdminMap());
                if (criteriaTypes.size() == 0) {
                    return Result.error(HttpStatus.UNAUTHORIZED.value(), "User belongs to no TEAM, please contact administrator for binding TEAM");
                }
```

### SizeReplaceableByIsEmpty
`maskedMessage.length() > 0` can be replaced with '!maskedMessage.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
            if (matcher.find()) {
                String maskedMessage = matcher.group(2);
                if (maskedMessage.length() > 0) {
                    content = content.replaceFirst(maskedMessage, "***");
                }
```

### SizeReplaceableByIsEmpty
`result[0].trim().length() > 0` can be replaced with '!result\[0\].trim().isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
                    try {
                        String[] result = lines[0].split("\\s+");
                        if (result[0].trim().length() > 0) {
                            length[0] = Long.parseLong(result[0].trim());
                        }
```

### SizeReplaceableByIsEmpty
`files.size() > 0` can be replaced with '!files.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
    public StorageFileInfo getLatestAgentPackage() {
        List<StorageFileInfo> files = storageFileInfoRepository.queryStorageFileInfoByFileTypeOrderByCreateTimeDesc(StorageFileInfo.FileType.AGENT_PACKAGE);
        if (files != null && files.size() > 0) {
            return files.get(0);
        }
```

### SizeReplaceableByIsEmpty
`queryParams.size() > 0` can be replaced with '!queryParams.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        List<TestJsonInfo> testJsonInfoList;

        if (queryParams != null && queryParams.size() > 0) {
            Specification<TestJsonInfo> spec;
            CriteriaType isLatestCriteria = new CriteriaType();
```

### SizeReplaceableByIsEmpty
`testJsonInfoList.size() == 0` can be replaced with 'testJsonInfoList.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        }

        if (testJsonInfoList.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`testJsonInfoList.size() == 0` can be replaced with 'testJsonInfoList.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
    public List<TestJsonInfo> getTestJsonHistory(String packageName, String caseName) {
        List<TestJsonInfo> testJsonInfoList = testJsonInfoRepository.findByPackageNameAndCaseName(packageName, caseName);
        if (testJsonInfoList.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`attachments.size() == 0` can be replaced with 'attachments.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java

    public void saveAttachments(String entityId, EntityType entityType, List<StorageFileInfo> attachments) {
        if (attachments == null || attachments.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`values.size() > 0` can be replaced with '!values.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
                    Assert.isTrue(false, "When querying with in, the value of criteriaType should be a JSONArray String!");
                }
                Assert.isTrue(values.size() > 0, "When querying with in, the value of criteriaType should contain 1 element at least!");

                CriteriaBuilder.In<Object> tempPredicate = criteriaBuilder.in(root.get(key).as(String.class));
```

### SizeReplaceableByIsEmpty
`testUnitList.size() == 0` can be replaced with 'testUnitList.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRun.java`
#### Snippet
```java
    @JSONField(serialize = false)
    public String getOngoingTestUnitName() {
        if (testUnitList.size() == 0) {
            return "";
        }
```

### SizeReplaceableByIsEmpty
`deviceDriverMap.size() == 0` can be replaced with 'deviceDriverMap.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/DeviceDriverManager.java`
#### Snippet
```java
            }
        }
        if (deviceDriverMap.size() == 0) {
            System.exit(500);
        }
```

### SizeReplaceableByIsEmpty
`processInfo.length() > 0` can be replaced with '!processInfo.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
        String processInfo = ShellUtils.execLocalCommandWithResult(ShellUtils.POWER_SHELL_PATH + " -Command " + "\"(Get-Process | where {$_.mainWindowTitle -and $_.mainWindowHandle -ne 0 -and $_.Name -eq '" + processName + "'} | Select mainWindowHandle).mainWindowHandle\"", logger);
        logger.info(processName + " processInfo: " + processInfo);
        if (processInfo != null && processInfo.length() > 0) {
            String handlerIdStr = processInfo.trim().split(" ")[0];
            logger.info(processName + " handlerIdStr: " + handlerIdStr);
```

### SizeReplaceableByIsEmpty
`hexAppTopLevelWindowByKeyWord.length() == 0` can be replaced with 'hexAppTopLevelWindowByKeyWord.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            caps = new DesiredCapabilities();
            String hexAppTopLevelWindowByKeyWord = getHexAppTopLevelWindowByFamilyName(appFamilyName, logger);
            if (hexAppTopLevelWindowByKeyWord.length() == 0) {
                throw new RuntimeException(appFamilyName + " is not opened or failed activate it");
            }
```

### SizeReplaceableByIsEmpty
`processInfo.length() > 0` can be replaced with '!processInfo.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
        }
        String processInfo = ShellUtils.execLocalCommandWithResult(ShellUtils.POWER_SHELL_PATH + " -Command " + scriptFile.getAbsolutePath() + " " + appFamilyName, logger);
        if (processInfo != null && processInfo.length() > 0) {
            logger.info("handlerIdStr: " + processInfo);
            int handlerIdInt = Integer.parseInt(processInfo);
```

### SizeReplaceableByIsEmpty
`deviceStateChangeList.size() == 0` can be replaced with 'deviceStateChangeList.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/DeviceStabilityMonitor.java`
#### Snippet
```java
        }

        DeviceStateChangeRecord lastStateChange = deviceStateChangeList.size() == 0 ? null : deviceStateChangeList.getLast();

        if (lastStateChange == null) {
```

### SizeReplaceableByIsEmpty
`deviceActions.size() != 0` can be replaced with '!deviceActions.isEmpty()'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/config/DeviceConfig.java`
#### Snippet
```java

    public void extractFromExistingField(){
        if (StringUtils.isBlank(this.deviceActionsStr) && deviceActions.size() != 0) {
            this.deviceActionsStr = GSON.toJson(this.deviceActions);
        }
```

### SizeReplaceableByIsEmpty
`maskedMessage.length() > 0` can be replaced with '!maskedMessage.isEmpty()'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java
            if (matcher.find()) {
                String maskedMessage = matcher.group(2);
                if (maskedMessage.length() > 0) {
                    content = content.replaceFirst(maskedMessage, "***");
                }
```

### SizeReplaceableByIsEmpty
`this.inspectionStrategies.size() != 0` can be replaced with '!this.inspectionStrategies.isEmpty()'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/config/TestConfig.java`
#### Snippet
```java

    public void extractFromExistingField(){
        if (StringUtils.isBlank(this.inspectionStrategiesStr) && this.inspectionStrategies.size() != 0) {
            this.inspectionStrategiesStr = GSON.toJson(this.inspectionStrategies);
        }
```

### SizeReplaceableByIsEmpty
`testConfig.neededPermissions.size() > 0` can be replaced with '!testConfig.neededPermissions.isEmpty()'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java

        try {
            if (testConfig.neededPermissions.size() > 0) {
                jsonElement.add("neededPermissions", GSON.toJsonTree(testConfig.neededPermissions));
            }
```

### SizeReplaceableByIsEmpty
`deviceTestResult.crashStack.length() > 0` can be replaced with '!deviceTestResult.crashStack.isEmpty()'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java

            if (deviceTestResult.failCount > 0 || deviceTestResult.totalCount == 0) {
                if (deviceTestResult.crashStack != null && deviceTestResult.crashStack.length() > 0) {
                    printlnf("##[error]Fatal error during test on device %s, stack:\n%s", deviceTestResult.deviceSerialNumber, deviceTestResult.crashStack);
                } else {
```

### SizeReplaceableByIsEmpty
`deviceTestResult.attachments.size() != 0` can be replaced with '!deviceTestResult.attachments.isEmpty()'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
            String deviceFileFolderPath = file.getAbsolutePath();

            if (deviceTestResult.attachments.size() != 0) {
                String signature = hydraLabAPIClient.getBlobSAS(apiConfig);
                for (StorageFileInfo fileInfo : deviceTestResult.attachments) {
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                break;
            case "pressKeyCode":
                String keyCode = arguments.get("keyCode") + "";
                driver.pressKeyCode(keyCode);
                break;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
            default:
                throw new IllegalStateException("action fail" +
                        "" +
                        "" +
                        "ed. action index:" + actionInfo.getId() + "/t" + "actionType:" + actionInfo.getActionType());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                throw new IllegalStateException("action fail" +
                        "" +
                        "" +
                        "ed. action index:" + actionInfo.getId() + "/t" + "actionType:" + actionInfo.getActionType());

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends TestRunDevice`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/DeviceTaskControlExecutor.java`
#### Snippet
```java
    }

    public DeviceTaskControl runForAllDeviceAsync(Collection<TestRunDevice> allDevices, DeviceTask task,
                                                  TaskCompletion taskCompletion, boolean logging,
                                                  boolean forceForTesting) {
```

### BoundedWildcard
Can generalize to `? super String`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/t2c/T2CRunner.java`
#### Snippet
```java
    }

    private DeviceInfo getDeviceByType(TestRunDevice testRunDevice, String type, Map<String, Integer> deviceCountMap) {
        if (!(testRunDevice instanceof TestRunDeviceCombo)) {
            return testRunDevice.getDeviceInfo();
```

### BoundedWildcard
Can generalize to `? extends File`
in `agent/src/main/java/com/microsoft/hydralab/agent/environment/EnvCapabilityScanner.java`
#### Snippet
```java

    @NotNull
    private List<EnvCapability> createCapabilities(ArrayList<File> files) {
        Map<String, EnvCapability.CapabilityKeyword> capabilityKeywordFiles = getCapabilityKeywordFiles();
        List<EnvCapability> capabilities = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends EnvCapability`
in `agent/src/main/java/com/microsoft/hydralab/agent/environment/EnvCapabilityScanner.java`
#### Snippet
```java
    }

    private void scanCapabilityVersion(List<EnvCapability> capabilities) throws IOException {
        for (EnvCapability capability : capabilities) {
            extractAndParseVersionOutput(capability);
```

### BoundedWildcard
Can generalize to `? extends TestTask`
in `center/src/main/java/com/microsoft/hydralab/center/service/TestDataService.java`
#### Snippet
```java
    }

    public void saveAllTestTasks(List<TestTask> testTasks) {
        testTaskRepository.saveAll(testTasks);
    }
```

### BoundedWildcard
Can generalize to `? extends DeviceInfo`
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
    }

    public void updateDeviceGroup(List<DeviceInfo> deviceInfos, String agentId) {
        for (DeviceInfo deviceInfo : deviceInfos) {
            //init agent info
```

### BoundedWildcard
Can generalize to `? extends DeviceInfo`
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java

    //delete device and group&device relation
    public void removeDevices(List<DeviceInfo> devices) {
        for (DeviceInfo device : devices) {
            Set<String> groups = device.getDeviceGroup();
```

### BoundedWildcard
Can generalize to `? extends DeviceInfo`
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
    }

    private void updateAgentDevices(List<DeviceInfo> latestDeviceInfos, AgentDeviceGroup agentDeviceGroup) {
        for (DeviceInfo newDeviceInfo : latestDeviceInfos) {
            boolean hasDevice = false;
```

### BoundedWildcard
Can generalize to `? extends File`
in `common/src/main/java/com/microsoft/hydralab/common/util/ImageUtil.java`
#### Snippet
```java
    }

    public static File joinImages(File outputFileDir, String outputFileName, @NotNull List<File> files) {
        Assert.notEmpty(files, "files should not be empty");
        if (files.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `common/src/main/java/com/microsoft/hydralab/common/util/ThreadUtils.java`
#### Snippet
```java
public class ThreadUtils {

    public static <T> void doInParallel(List<T> dataList, int threadCount, ParallelTask<T> task) {
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        int size = dataList.size();
```

### BoundedWildcard
Can generalize to `? super T`
in `common/src/main/java/com/microsoft/hydralab/common/util/ThreadUtils.java`
#### Snippet
```java
public class ThreadUtils {

    public static <T> void doInParallel(List<T> dataList, int threadCount, ParallelTask<T> task) {
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        int size = dataList.size();
```

### BoundedWildcard
Can generalize to `? extends GrantedAuthority`
in `common/src/main/java/com/microsoft/hydralab/common/entity/center/SysUser.java`
#### Snippet
```java
    private boolean teamAdmin = false;

    public void setAuthorities(List<GrantedAuthority> permissions) {
        this.authorities = permissions;
    }
```

### BoundedWildcard
Can generalize to `? extends DeviceInfo`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRunDeviceCombo.java`
#### Snippet
```java
    private List<TestRunDevice> pairedDevices = new ArrayList<>();

    public TestRunDeviceCombo(@NotNull DeviceInfo mainDeviceInfo, @NotNull List<DeviceInfo> deviceInfos) {
        super(mainDeviceInfo, mainDeviceInfo.getType() + "_" + 0);
        deviceCountMap.put(mainDeviceInfo.getType(), 1);
```

### BoundedWildcard
Can generalize to `? extends StorageFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
    }

    public List<StorageFileInfo> filterAttachments(@NotNull List<StorageFileInfo> attachments, @NotNull String fileType) {
        List<StorageFileInfo> data = new ArrayList<>();
        for (StorageFileInfo attachment : attachments) {
```

### BoundedWildcard
Can generalize to `? extends StorageFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
    }

    public StorageFileInfo filterFirstAttachment(@NotNull List<StorageFileInfo> attachments, @NotNull String fileType) {
        for (StorageFileInfo attachment : attachments) {
            if (fileType.equals(attachment.getFileType())) {
```

### BoundedWildcard
Can generalize to `? extends StorageFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
    }

    public void saveRelations(String entityId, EntityType entityType, List<StorageFileInfo> attachments) {
        if (attachments == null) {
            return;
```

### BoundedWildcard
Can generalize to `? extends CriteriaType`
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
    }

    public Predicate[] transferToPredicate(Root<T> root, CriteriaBuilder criteriaBuilder, List<CriteriaType> criteriaTypes) {
        Predicate[] predicates = new Predicate[criteriaTypes.size()];
        for (int i = 0; i < criteriaTypes.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
public class FFmpegConcatUtil {
    static final String fileName = Const.ScreenRecoderConfig.DEFAULT_FILE_NAME;
    public static File concatVideos(List<File> videos, File outputDir, Logger logger) {
        if (videos.isEmpty()) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends T`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/DeviceStatusListenerManager.java`
#### Snippet
```java
    private List<DeviceStatusListener> listeners = new ArrayList<>();

    private <T extends DeviceStatusListener> void notifyEach(List<T> recorders, Consumer<T> consumer) {
        recorders.forEach(recorder -> {
            try {
```

### BoundedWildcard
Can generalize to `? super T`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/DeviceStatusListenerManager.java`
#### Snippet
```java
    private List<DeviceStatusListener> listeners = new ArrayList<>();

    private <T extends DeviceStatusListener> void notifyEach(List<T> recorders, Consumer<T> consumer) {
        recorders.forEach(recorder -> {
            try {
```

### BoundedWildcard
Can generalize to `? extends DeviceStateChangeRecord`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/DeviceStabilityMonitor.java`
#### Snippet
```java
    }

    private void cleanOutdatedDeviceStateChange(ConcurrentLinkedDeque<DeviceStateChangeRecord> recordWindow, LocalDateTime now, DeviceInfo deviceInfo) {
        /**
         * Clean outdated state change record in window lists
```

### BoundedWildcard
Can generalize to `? extends PerformanceInspectionResult`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
    }

    private AndroidBatteryInfo getResultSummary(List<PerformanceInspectionResult> inspectionResults) {
        if (inspectionResults == null || inspectionResults.isEmpty()) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends PerformanceTestResult`
in `common/src/main/java/com/microsoft/hydralab/performance/PerformanceTestManagementService.java`
#### Snippet
```java
    }

    private void savePerformanceTestResults(List<PerformanceTestResult> resultList, TestRun testRun, TestTask testTask, Logger log) {
        if (resultList != null && !resultList.isEmpty()) {
            try {
```

### BoundedWildcard
Can generalize to `? super Long`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsMemoryResultParser.java`
#### Snippet
```java
    private void calculateTheAverage(Map<Long, Integer> metricsCountPerProcess,
                                     Map<Long, BigInteger[]> metricsSumPerProcess,
                                     Map<Long, WindowsMemoryParsedData.WindowsMemoryMetrics>
                                             processIdWindowsMemoryMetricsMap)
    {
```

### BoundedWildcard
Can generalize to `? super WindowsMemoryParsedData.WindowsMemoryMetrics`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsMemoryResultParser.java`
#### Snippet
```java
    private void calculateTheAverage(Map<Long, Integer> metricsCountPerProcess,
                                     Map<Long, BigInteger[]> metricsSumPerProcess,
                                     Map<Long, WindowsMemoryParsedData.WindowsMemoryMetrics>
                                             processIdWindowsMemoryMetricsMap)
    {
```

### BoundedWildcard
Can generalize to `? extends DriverInfo`
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
    }

    private ArrayList<ActionInfo> getActionList(JSONArray caseJsonArray, ArrayList<DriverInfo> driverList) {
        ArrayList<ActionInfo> actionListInJson = new ArrayList<>();
        PerformanceActionInitializer batteryTestInitializer = new PerformanceActionInitializer(ActionInfo.ACTION_TYPE_INSPECT_BATTERY_USAGE);
```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                         @NotNull String permissionName, @Nullable Logger logger);

    void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                               @NotNull Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                         @NotNull String permissionName, @Nullable Logger logger);

    void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                               @NotNull Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java

    void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                               @NotNull Logger logger);

    boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    File getScreenShotWithStrategy(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger, @NotNull AgentUser.BatteryStrategy batteryStrategy);

    void wakeUpDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                               @NotNull Logger logger);

    boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);

    boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                               @NotNull Logger logger);

    boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);

    boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);

    boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);

    boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                           @Nullable Logger logger);

    boolean grantProjectionAndBatteryPermission(@NotNull DeviceInfo deviceInfo,
                                                @NotNull String recordPackageName,
                                                @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java

    boolean grantProjectionAndBatteryPermission(@NotNull DeviceInfo deviceInfo,
                                                @NotNull String recordPackageName,
                                                @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    void updateAllDeviceInfo();

    LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName,
                                 @NotNull TestRun testRun, @NotNull Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    void updateAllDeviceInfo();

    LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName,
                                 @NotNull TestRun testRun, @NotNull Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java

    LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName,
                                 @NotNull TestRun testRun, @NotNull Logger logger);

    void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java

    LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName,
                                 @NotNull TestRun testRun, @NotNull Logger logger);

    void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                         @NotNull String permissionName, @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                         @NotNull String permissionName, @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java

    void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                         @NotNull String permissionName, @Nullable Logger logger);

    void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                                                @Nullable Logger logger);

    void testDeviceSetup(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void removeFileInDevice(DeviceInfo deviceInfo, String pathOnDevice, Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                                 @NotNull TestRun testRun, @NotNull Logger logger);

    void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val,
                     @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                                 @NotNull TestRun testRun, @NotNull Logger logger);

    void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val,
                     @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                               @NotNull String defaultActivity, @Nullable Logger logger);

    boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                           @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                               @NotNull String defaultActivity, @Nullable Logger logger);

    boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                           @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                            @Nullable Logger logger) throws Exception;

    ScreenRecorder getScreenRecorder(@NotNull DeviceInfo deviceInfo, @NotNull File folder,
                                     @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                            @Nullable Logger logger) throws Exception;

    ScreenRecorder getScreenRecorder(@NotNull DeviceInfo deviceInfo, @NotNull File folder,
                                     @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                     @Nullable Logger logger);

    boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                               @NotNull String defaultActivity, @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
                     @Nullable Logger logger);

    boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                               @NotNull String defaultActivity, @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java

    boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                               @NotNull String defaultActivity, @Nullable Logger logger);

    boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                      @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                      @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/DeviceDriver.java`
#### Snippet
```java
    void wakeUpDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                                                @Nullable Logger logger);

    public abstract void testDeviceSetup(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void removeFileInDevice(DeviceInfo deviceInfo, String pathOnDevice, Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    }

    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName,
                                                 @NotNull TestRun testRun, @NotNull Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    }

    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName,
                                                 @NotNull TestRun testRun, @NotNull Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java

    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName,
                                                 @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java

    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName,
                                                 @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                               @NotNull Logger logger);

    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);

    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                               @NotNull Logger logger);

    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);

    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                            @Nullable Logger logger) throws Exception;

    public abstract ScreenRecorder getScreenRecorder(@NotNull DeviceInfo deviceInfo, @NotNull File folder,
                                                     @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                            @Nullable Logger logger) throws Exception;

    public abstract ScreenRecorder getScreenRecorder(@NotNull DeviceInfo deviceInfo, @NotNull File folder,
                                                     @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                                 @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val,
                                     @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                                 @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val,
                                     @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);

    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);

    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                               @NotNull String defaultActivity, @Nullable Logger logger);

    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                           @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                               @NotNull String defaultActivity, @Nullable Logger logger);

    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                           @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                           @Nullable Logger logger);

    public abstract boolean grantProjectionAndBatteryPermission(@NotNull DeviceInfo deviceInfo,
                                                                @NotNull String recordPackageName,
                                                                @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java

    public abstract boolean grantProjectionAndBatteryPermission(@NotNull DeviceInfo deviceInfo,
                                                                @NotNull String recordPackageName,
                                                                @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                     @Nullable Logger logger);

    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                               @NotNull String defaultActivity, @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                     @Nullable Logger logger);

    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                               @NotNull String defaultActivity, @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java

    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                               @NotNull String defaultActivity, @Nullable Logger logger);

    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    public abstract void wakeUpDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                         @NotNull String permissionName, @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                         @NotNull String permissionName, @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java

    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                         @NotNull String permissionName, @Nullable Logger logger);

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    }

    public abstract void screenCapture(@NotNull DeviceInfo deviceInfo, @NotNull String path, @Nullable Logger logger) throws Exception;

    public File getScreenShot(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger) {
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    }

    public abstract void screenCapture(@NotNull DeviceInfo deviceInfo, @NotNull String path, @Nullable Logger logger) throws Exception;

    public File getScreenShot(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger) {
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                      @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                      @Nullable Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    }

    public abstract void wakeUpDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                         @NotNull String permissionName, @Nullable Logger logger);

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                               @NotNull Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
                                         @NotNull String permissionName, @Nullable Logger logger);

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                               @NotNull Logger logger);

```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
                                               @NotNull Logger logger);

    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger);
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java

public class FileUtil {
    private final static SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
    private static final Pattern paramKeyMatch = Pattern.compile("\\$\\{(\\w+)}");

```

### MissortedModifiers
Missorted modifiers `volatile static`
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSPerfTestHelper.java`
#### Snippet
```java

public class IOSPerfTestHelper {
    private volatile static IOSPerfTestHelper instance = null;

    private final Logger classLogger = LoggerFactory.getLogger(getClass());
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/common/util/MachineInfoUtils.java`
#### Snippet
```java
    protected static Logger classLogger = LoggerFactory.getLogger(MachineInfoUtils.class);

    private final static String DETECT_WINDOWS_LAPTOP_SCRIPT_NAME = "DetectWindowsLaptop.ps1";

    public static boolean isOnMacOS() {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorder.java`
#### Snippet
```java

    @Override
    abstract public String finishRecording();
}

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorder.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

abstract public class IOSAppiumScreenRecorder implements ScreenRecorder {
    static final Logger CLASS_LOGGER = LoggerFactory.getLogger(IOSAppiumScreenRecorder.class);

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorder.java`
#### Snippet
```java

    @Override
    abstract public void startRecord(int maxTimeInSecond);

    @Override
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    public abstract void testDeviceUnset(DeviceInfo deviceInfo, Logger logger);

    abstract public WebDriver getAppiumDriver(DeviceInfo deviceInfo, Logger logger);

    abstract public void quitAppiumDriver(DeviceInfo deviceInfo, Logger logger);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    abstract public void quitAppiumDriver(DeviceInfo deviceInfo, Logger logger);

    abstract public void execCommandOnDevice(DeviceInfo deviceInfo, String command, Logger logger);

    public void execCommandOnAgent(DeviceInfo deviceInfo, String command, Logger logger) {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    abstract public WebDriver getAppiumDriver(DeviceInfo deviceInfo, Logger logger);

    abstract public void quitAppiumDriver(DeviceInfo deviceInfo, Logger logger);

    abstract public void execCommandOnDevice(DeviceInfo deviceInfo, String command, Logger logger);
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/common/repository/KeyValueRepository.java`
#### Snippet
```java
@CacheConfig(cacheNames = "keyValueCache")
public class KeyValueRepository {
    public final static String UNIT_TEST_DETAIL = "UNIT_TEST_DETAIL:";
    public static final String DEVICE_RES_INFO = "Device_Res_Info:";
    public final static String CRASH_STACK_IN_DEVICE = "CRASH_STACK:";
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/common/repository/KeyValueRepository.java`
#### Snippet
```java
    public final static String UNIT_TEST_DETAIL = "UNIT_TEST_DETAIL:";
    public static final String DEVICE_RES_INFO = "Device_Res_Info:";
    public final static String CRASH_STACK_IN_DEVICE = "CRASH_STACK:";
    @Resource
    KeyValueDBRepository keyValueDBRepository;
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/entity/WindowsBatteryParsedData.java`
#### Snippet
```java
public class WindowsBatteryParsedData {

    public final static String[] METRICS_NAME = {"EnergyLoss", "CPUEnergyConsumption", "SocEnergyConsumption",
            "DisplayEnergyConsumption", "DiskEnergyConsumption", "NetworkEnergyConsumption", "MBBEnergyConsumption",
            "OtherEnergyConsumption", "EmiEnergyConsumption", "CPUEnergyConsumptionWorkOnBehalf",
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsBatteryResultParser.java`
#### Snippet
```java
public class WindowsBatteryResultParser implements PerformanceResultParser {

    private final static String APP_ID_KEYWORD = "YourPhone";
    private final static String DELIMITER = ", ";

```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsBatteryResultParser.java`
#### Snippet
```java

    private final static String APP_ID_KEYWORD = "YourPhone";
    private final static String DELIMITER = ", ";

    private final Logger classLogger = LoggerFactory.getLogger(getClass());
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsMemoryInspector.java`
#### Snippet
```java
    private final static String SCRIPT_NAME = "WindowsMemoryInspector.ps1";
    private final static File SCRIPT_FILE = new File(SCRIPT_NAME);
    private final static String PARAMETER_FORMAT = " -keyword %s -output %s";

    protected Logger classLogger = LoggerFactory.getLogger(getClass());
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsMemoryInspector.java`
#### Snippet
```java
    private final static String RAW_RESULT_FILE_NAME_FORMAT = "%s_%s_%s";
    private final static String SCRIPT_NAME = "WindowsMemoryInspector.ps1";
    private final static File SCRIPT_FILE = new File(SCRIPT_NAME);
    private final static String PARAMETER_FORMAT = " -keyword %s -output %s";

```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
    private final static String RAW_RESULT_FILE_NAME_FORMAT = "%s_%s.csv";
    private final static String SCRIPT_NAME = "WindowsBatteryInspector.ps1";
    private final static File SCRIPT_FILE = new File(SCRIPT_NAME);
    private final static String PARAMETER_FORMAT = " -output %s";

```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
    private final static String SCRIPT_NAME = "WindowsBatteryInspector.ps1";
    private final static File SCRIPT_FILE = new File(SCRIPT_NAME);
    private final static String PARAMETER_FORMAT = " -output %s";

    protected Logger classLogger = LoggerFactory.getLogger(getClass());
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
 */
public class WindowsBatteryInspector implements PerformanceInspector {
    private final static String RAW_RESULT_FILE_NAME_FORMAT = "%s_%s.csv";
    private final static String SCRIPT_NAME = "WindowsBatteryInspector.ps1";
    private final static File SCRIPT_FILE = new File(SCRIPT_NAME);
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
public class WindowsBatteryInspector implements PerformanceInspector {
    private final static String RAW_RESULT_FILE_NAME_FORMAT = "%s_%s.csv";
    private final static String SCRIPT_NAME = "WindowsBatteryInspector.ps1";
    private final static File SCRIPT_FILE = new File(SCRIPT_NAME);
    private final static String PARAMETER_FORMAT = " -output %s";
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsMemoryInspector.java`
#### Snippet
```java
    // TODO: [Extensible] Make it work with more processes of other Windows apps.
    private final static String PROCESS_NAME_KEYWORD = "Phone";
    private final static String RAW_RESULT_FILE_NAME_FORMAT = "%s_%s_%s";
    private final static String SCRIPT_NAME = "WindowsMemoryInspector.ps1";
    private final static File SCRIPT_FILE = new File(SCRIPT_NAME);
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsMemoryInspector.java`
#### Snippet
```java

    // TODO: [Extensible] Make it work with more processes of other Windows apps.
    private final static String PROCESS_NAME_KEYWORD = "Phone";
    private final static String RAW_RESULT_FILE_NAME_FORMAT = "%s_%s_%s";
    private final static String SCRIPT_NAME = "WindowsMemoryInspector.ps1";
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsMemoryInspector.java`
#### Snippet
```java
    private final static String PROCESS_NAME_KEYWORD = "Phone";
    private final static String RAW_RESULT_FILE_NAME_FORMAT = "%s_%s_%s";
    private final static String SCRIPT_NAME = "WindowsMemoryInspector.ps1";
    private final static File SCRIPT_FILE = new File(SCRIPT_NAME);
    private final static String PARAMETER_FORMAT = " -keyword %s -output %s";
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java
        if (!filename.exists()) {
            try {
                filename.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunDeviceOrchestrator.java`
#### Snippet
```java
            ((TestRunDeviceCombo) testRunDevice).getDevices().forEach(testRunDevice1 -> {
                File childFolder = new File(folder, testRunDevice1.getDeviceInfo().getSerialNum());
                childFolder.mkdirs();
                ScreenRecorder screenRecorder = deviceDriverManager.getScreenRecorder(testRunDevice1.getDeviceInfo(), childFolder, logger);
                screenRecorder.setupDevice();
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `center/src/main/java/com/microsoft/hydralab/center/controller/AuthController.java`
#### Snippet
```java
            }
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, inputStream.available());
            response.setContentType(MediaType.IMAGE_JPEG_VALUE);
            OutputStream out = response.getOutputStream();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
        } finally {
            response.flushBuffer();
            agentConfigFile.delete();
        }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
                testInfo = t2CJsonParser.parseJsonFile(testJsonFilePath);
            } finally {
                testApkFile.delete();
            }
            Assert.notNull(testInfo, "Failed to parse the json file for test automation.");
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            }
            if (zipFile.exists()) {
                zipFile.delete();
            }
        }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            unzipFile = new File(unzipDirectory + "/" + name);
            if (unzipFile.exists()) {
                unzipFile.delete();
            }
            unzipFile.mkdir();
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
                unzipFile.delete();
            }
            unzipFile.mkdir();
            //Get zip file entry enumeration object
            Enumeration<? extends ZipEntry> zipEnum = zipFile.entries();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
        //Delete extra files if necessary
        if (file.exists()) {
            file.delete();
        }
        return result;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java

        //If necessary, the decompressed files should be deleted
        plistFile.delete();
        plistFile.getParentFile().delete();

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
        //If necessary, the decompressed files should be deleted
        plistFile.delete();
        plistFile.getParentFile().delete();

        res.put(ParserKey.APP_NAME, name);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        }
        saveRelation(entityId, entityType, storageFileInfo);
        file.delete();
        return storageFileInfo;
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
        scriptFile = new File(testBaseDir, name);
        if (scriptFile.exists()) {
            scriptFile.delete();
        }
        try (InputStream resourceAsStream = FileUtils.class.getClassLoader().getResourceAsStream(name); OutputStream out = new FileOutputStream(scriptFile)) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/screen/PhoneAppScreenRecorder.java`
#### Snippet
```java
        recordApk = new File(preAppDir, name);
        if (recordApk.exists()) {
            recordApk.delete();
        }
        try (InputStream resourceAsStream = FileUtils.class.getClassLoader().getResourceAsStream(name); OutputStream out = new FileOutputStream(recordApk)) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/screen/PhoneAppScreenRecorder.java`
#### Snippet
```java
            File videoFile = new File(pathOnAgent);
            if (videoFile.exists()) {
                videoFile.delete();
            }
            try {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/screen/ADBScreenRecorder.java`
#### Snippet
```java
                if (mergedVideo != null && mergedVideo.exists()) {
                    logger.info("deleting merged old videos " + list);
                    list.forEach(File::delete);
                }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
            out.start();
            powerShellProcess.waitFor();
            new File(leftVideoPath).delete();
            new File(rightVideoPath).delete();
        } catch (IOException | InterruptedException e) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
            powerShellProcess.waitFor();
            new File(leftVideoPath).delete();
            new File(rightVideoPath).delete();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        File file = new File(reportFolderPath, testFolder);
        if (!file.exists()) {
            file.mkdirs();
        }
        String testFolderPath = file.getAbsolutePath();
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
            file = new File(testFolderPath, deviceFileFolder);
            if (!file.exists()) {
                file.mkdirs();
            }
            String deviceFileFolderPath = file.getAbsolutePath();
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `afterConcurrentHandlingStarted()` only delegates to its super method
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
```

### RedundantMethodOverride
Method `isCancelled()` is identical to its super method
in `common/src/main/java/com/microsoft/hydralab/common/logger/MultiLineNoCancelLoggingReceiver.java`
#### Snippet
```java

    @Override
    public boolean isCancelled() {
        return false;
    }
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceGroupController.java`
#### Snippet
```java
    @SuppressWarnings("IllegalCatch")
    public Result deleteRelation(@CurrentSecurityContext SysUser requestor,
                                 @RequestParam(value = "groupName", required = true) String groupName,
                                 @RequestParam(value = "deviceSerial", required = true) String deviceSerial) {
        try {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceGroupController.java`
#### Snippet
```java
    public Result deleteRelation(@CurrentSecurityContext SysUser requestor,
                                 @RequestParam(value = "groupName", required = true) String groupName,
                                 @RequestParam(value = "deviceSerial", required = true) String deviceSerial) {
        try {
            if (!deviceGroupService.checkGroupAuthorization(requestor, groupName, true)) {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/StatisticData.java`
#### Snippet
```java
@Entity
@Table(indexes = {
        @Index(name = "name_index", columnList = "name", unique = false)})
public class StatisticData {
    @Id
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/KeyValue.java`
#### Snippet
```java
    @Id
    private String keyid;
    @Column(name = "value", columnDefinition = "CLOB", nullable = true)
    private String value;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/KeyValue.java`
#### Snippet
```java
    @Lob
    @Basic(fetch = FetchType.EAGER)
    @Column(name="value", columnDefinition="CLOB", nullable=true)
    public String getValue() {
        return value;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/AndroidTestUnit.java`
#### Snippet
```java
@Entity
@Table(indexes = {
        @Index(name = "task_id_unit_index", columnList = "test_task_id", unique = false),
        @Index(name = "device_test_result_id_index", columnList = "device_test_result_id", unique = false)
})
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/AndroidTestUnit.java`
#### Snippet
```java
@Table(indexes = {
        @Index(name = "task_id_unit_index", columnList = "test_task_id", unique = false),
        @Index(name = "device_test_result_id_index", columnList = "device_test_result_id", unique = false)
})
public class AndroidTestUnit implements Serializable {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java
    private String testErrorMsg;
    private String pipelineLink;
    @Column(nullable = true)
    private Boolean requireReinstall = false;
    private Boolean requireClearData = false;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java
    private String pkgName;
    private String testPkgName;
    @Column(nullable = true)
    private String reportImagePath;
    @Transient
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java
@Entity
@Table(indexes = {
        @Index(name = "start_date_index", columnList = "start_date", unique = false),
        @Index(columnList = "team_id")})
public class TestTask implements Serializable {
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
sleepSeconds \* 1000: integer multiplication implicitly cast to long
in `common/src/main/java/com/microsoft/hydralab/common/util/FlowUtil.java`
#### Snippet
```java
                toThrow = e;
            }
            ThreadUtils.safeSleep(sleepSeconds * 1000);
            count--;
        }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRunDeviceCombo.java`
#### Snippet
```java

    public DeviceInfo getDeviceByTag(String tag) {
        if (super.getTag().equals(tag)) {
            return super.getDeviceInfo();
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRunDeviceCombo.java`
#### Snippet
```java
    public DeviceInfo getDeviceByTag(String tag) {
        if (super.getTag().equals(tag)) {
            return super.getDeviceInfo();
        }
        for (TestRunDevice device : pairedDevices) {
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/AuthTokenService.java`
#### Snippet
```java
    public AuthToken getAuthToken(Long tokenId) {
        Optional<AuthToken> authToken = authTokenRepository.findById(tokenId);
        if (!authToken.isPresent()) {
            return null;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java

        Optional<AgentUser> findUser = agentUserRepository.findById(id);
        if (!findUser.isPresent()) {
            return null;
        }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.microsoft.hydralab.common.management.device.DeviceType;`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/DeviceInfo.java`
#### Snippet
```java

import com.microsoft.hydralab.common.entity.agent.MobileDevice;
import com.microsoft.hydralab.common.management.device.DeviceType;
import com.microsoft.hydralab.common.management.listener.MobileDeviceState;
import lombok.Getter;
```

### UNUSED_IMPORT
Unused import `import lombok.AllArgsConstructor;`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/StatisticData.java`
#### Snippet
```java
package com.microsoft.hydralab.common.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;

```

### UNUSED_IMPORT
Unused import `import lombok.Data;`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobProperty.java`
#### Snippet
```java

import com.microsoft.hydralab.common.file.StorageProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
```

### UNUSED_IMPORT
Unused import `import org.springframework.stereotype.Service;`
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.hydralab.common.management.device.DeviceType;`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/PreInstallListener.java`
#### Snippet
```java
import com.microsoft.hydralab.common.entity.common.DeviceInfo;
import com.microsoft.hydralab.common.management.AgentManagementService;
import com.microsoft.hydralab.common.management.device.DeviceType;
import com.microsoft.hydralab.common.management.device.impl.DeviceDriverManager;
import com.microsoft.hydralab.common.management.listener.DeviceStatusListener;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/PreInstallListener.java`
#### Snippet
```java

import java.io.File;
import java.util.Map;
import java.util.Set;

```

### UNUSED_IMPORT
Unused import `import java.util.Set;`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/PreInstallListener.java`
#### Snippet
```java
import java.io.File;
import java.util.Map;
import java.util.Set;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/config/DeviceConfig.java`
#### Snippet
```java
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/config/HydraLabAPIConfig.java`
#### Snippet
```java
package com.microsoft.hydralab.config;

import java.util.HashMap;
import java.util.Locale;

```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`totalElement = totalElement + elementKeys.size()` could be simplified to 'totalElement += elementKeys.size()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java
            Set<String> elementKeys = activityInfo.keySet();
            elementKeys.remove(Const.SmartTestConfig.VISIT_TAG);
            totalElement = totalElement + elementKeys.size();
            for (String elementKey : elementKeys) {
                if (activityInfo.getBoolean(elementKey)) {
```

### ReplaceAssignmentWithOperatorAssignment
`likeString = likeString + "%"` could be simplified to 'likeString += "%"'
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
                        break;
                    case LikeRuleType.End:
                        likeString = likeString + "%";
                        break;
                    default:
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
            BufferedReader bufferedReader = new BufferedReader(isr);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                logger.info(line);
                if (line.startsWith("smartTestResult:")) {
```

### NestedAssignment
Result of assignment expression used
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestCommandReceiver.java`
#### Snippet
```java
            BufferedReader bufferedReader = new BufferedReader(isr);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (logger == null) {
                    System.out.println(line);
```

### NestedAssignment
Result of assignment expression used
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
            int len;
            byte[] buffer = new byte[1024 * 10];
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSDeviceWatcher.java`
#### Snippet
```java
            BufferedReader bufferedReader = new BufferedReader(isr);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (iosDeviceDriverRef.get() == null) {
                    break;
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/util/CommandOutputReceiver.java`
#### Snippet
```java
            BufferedReader bufferedReader = new BufferedReader(isr);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (logger == null) {
                    System.out.println(line);
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/util/DownloadUtils.java`
#### Snippet
```java
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
        byte[] buffer = new byte[1024];
        int count = 0;
        while ((count = bis.read(buffer, 0, 1024)) != -1) {
            fis.write(buffer, 0, count);
        }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    getNotNullLogger(logger).info(line);
                }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
                FileOutputStream fs = new FileOutputStream(zipFile);
                byte[] buffer = new byte[1444];
                while ((bytes = inStream.read(buffer)) != -1) {
                    fs.write(buffer, 0, bytes);
                }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
                        byte[] buffer = new byte[1024 * 8];
                        int readLen = 0;
                        while ((readLen = input.read(buffer, 0, 1024 * 8)) != -1) {
                            output.write(buffer, 0, readLen);
                        }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/logger/impl/IOSLogCollector.java`
#### Snippet
```java
                    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            crashLines.append(line).append("\n");
                        }
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/common/logger/impl/ADBLogcatCollector.java`
#### Snippet
```java
                boolean collectCrash = false;
                StringBuilder crashLines = new StringBuilder();
                while ((line = bufferedReader.readLine()) != null) {
                    if (collectCrash) {
                        if (!line.contains(" E ") && !line.contains(" F ")) {
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
            List<String> contents = new ArrayList<>();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                inputLine = inputLine.trim().toLowerCase();
                contents.add(inputLine);
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsBatteryResultParser.java`
#### Snippet
```java
                String line;

                while ((line = reversedReader.readLine()) != null)
                {
                    if (!baseLineFound)
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/IOSEnergyGaugeResultParser.java`
#### Snippet
```java
                    List<PerformanceInspectionResult> newPerfInspectionResults = new CopyOnWriteArrayList<>();

                    while ((line = bufferedReader.readLine()) != null) {
                        long timestampForThisLine = startTimeStamp + lineNumber * ONE_SECOND_TIMESTAMP;
                        long timestampForNextLine = startTimeStamp + (lineNumber + 1) * ONE_SECOND_TIMESTAMP;
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
        Arrays.fill(memoryValueArr, -1);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rawFile))) {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().startsWith("App Summary")) {
                    // PSS title line, used to anchor target index offset
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/IOSMemoryPerfResultParser.java`
#### Snippet
```java
                    long timestampForThisLine = 0;
                    long timestampForLastLine;
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.startsWith("memory")) {
                            String subJsonLine = null;
```

### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsMemoryResultParser.java`
#### Snippet
```java
                String line;

                while ((line = reader.readLine()) != null)
                {
                    Matcher matcher = pattern.matcher(line);
```

### NestedAssignment
Result of assignment expression used
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
            int ch = 0;
            StringBuffer stringBuffer = new StringBuffer();
            while ((ch = fileReader.read()) != -1) {
                stringBuffer.append((char) ch);
            }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `agent/src/main/java/com/microsoft/hydralab/agent/service/DeviceControlService.java`
#### Snippet
```java
    public void captureAllScreensSync(AgentUser.BatteryStrategy batteryStrategy) {
        Set<DeviceInfo> allConnectedDevices = agentManagementService.getActiveDeviceList(log);
        allConnectedDevices.forEach(deviceInfo -> {
            deviceDriverManager.getScreenShotWithStrategy(deviceInfo, log, batteryStrategy);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `common/src/main/java/com/microsoft/hydralab/performance/PerformanceTestManagementService.java`
#### Snippet
```java
            inspect(initialInspection);

            ScheduledFuture<?> scheduledFuture = ThreadPoolUtil.PERFORMANCE_TEST_TIMER_EXECUTOR.scheduleAtFixedRate(() -> {
                inspect(inspection, testRun);
            }, 0, inspectionStrategy.interval, inspectionStrategy.intervalUnit);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `commands` are queried, but never updated
in `agent/src/main/java/com/microsoft/hydralab/agent/command/DeviceScriptCommandLoader.java`
#### Snippet
```java
public class DeviceScriptCommandLoader {
    @Resource(name = "DeviceCommandProperty")
    private List<DeviceScriptCommand> commands;

    public void loadCommandAction(TestTask testTask) {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `agentManagementService` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
    private final Logger logger;
    private final String pkgName;
    AgentManagementService agentManagementService;
    private final PerformanceTestListener performanceTestListener;
    private long recordingStartTimeMillis;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordingStartTimeMillis` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
    AgentManagementService agentManagementService;
    private final PerformanceTestListener performanceTestListener;
    private long recordingStartTimeMillis;
    private boolean alreadyEnd = false;
    private AndroidTestUnit ongoingTestUnit;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `testRunDeviceOrchestrator` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
    private String currentTestName = "";
    private int currentTestIndex = 0;
    private TestRunDeviceOrchestrator testRunDeviceOrchestrator;

    public AppiumListener(AgentManagementService agentManagementService, TestRunDevice testRunDevice, TestRun testRun,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `testRunDeviceOrchestrator` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
    private String currentTestName = "";
    private int currentTestIndex = 0;
    private TestRunDeviceOrchestrator testRunDeviceOrchestrator;

    public Junit5Listener(AgentManagementService agentManagementService, TestRunDevice testRunDevice, TestRun testRun,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordingStartTimeMillis` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
    private final Logger logger;
    private final String pkgName;
    private long recordingStartTimeMillis;
    private boolean alreadyEnd = false;
    private AndroidTestUnit ongoingTestUnit;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordingStartTimeMillis` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
    private TestRunDeviceOrchestrator testRunDeviceOrchestrator;
    ADBOperateUtil adbOperateUtil;
    private long recordingStartTimeMillis;
    private int index;
    private boolean alreadyEnd = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `testRunDeviceOrchestrator` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
    private final AgentManagementService agentManagementService;
    private final PerformanceTestListener performanceTestListener;
    private TestRunDeviceOrchestrator testRunDeviceOrchestrator;
    ADBOperateUtil adbOperateUtil;
    private long recordingStartTimeMillis;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `testFileSetRepository` is accessed in both synchronized and unsynchronized contexts
in `center/src/main/java/com/microsoft/hydralab/center/service/TestFileSetService.java`
#### Snippet
```java
public class TestFileSetService {
    @Resource
    TestFileSetRepository testFileSetRepository;
    @Resource
    AttachmentService attachmentService;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordProcess` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
    private static File scriptFile;
    private final Timer timer = new Timer();
    private Process recordProcess;
    private String destPath;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scriptFile` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java

public class IOSAppiumScreenRecorderForWindows extends IOSAppiumScreenRecorder {
    private static File scriptFile;
    private final Timer timer = new Timer();
    private Process recordProcess;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `deviceTestResults` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java
    private transient Map<String, String> instrumentationArgs;
    @Transient
    private List<TestRun> deviceTestResults = new ArrayList<>();
    @Transient
    private Map<String, List<DeviceAction>> deviceActions = new HashMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `deviceStateChangeWindowTime` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/DeviceStabilityMonitor.java`
#### Snippet
```java
    private AgentManagementService agentManagementService;
    private int deviceStateChangeThreshold;
    private long deviceStateChangeWindowTime;
    private long deviceStateChangeRecoveryTime;
    private MeterRegistry meterRegistry;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `center/src/main/java/com/microsoft/hydralab/center/config/SecurityConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `sdk/src/main/java/com/microsoft/hydralab/appium/AppiumParam.java`
#### Snippet
```java
public class AppiumParam {
    String deviceId = null;
    String deviceName = null;
    String osVersion = null;
    int wdaPort = 8100;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `sdk/src/main/java/com/microsoft/hydralab/appium/AppiumParam.java`
#### Snippet
```java
    String osVersion = null;
    int wdaPort = 8100;
    String apkPath = null;
    String outputDir = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `sdk/src/main/java/com/microsoft/hydralab/appium/AppiumParam.java`
#### Snippet
```java

public class AppiumParam {
    String deviceId = null;
    String deviceName = null;
    String osVersion = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `sdk/src/main/java/com/microsoft/hydralab/appium/AppiumParam.java`
#### Snippet
```java
    String deviceId = null;
    String deviceName = null;
    String osVersion = null;
    int wdaPort = 8100;
    String apkPath = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `sdk/src/main/java/com/microsoft/hydralab/appium/AppiumParam.java`
#### Snippet
```java
    int wdaPort = 8100;
    String apkPath = null;
    String outputDir = null;

    public AppiumParam() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
    private final InputStream inputStream;
    private final Logger logger;
    private volatile boolean inFinish = false;
    private String res;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/t2c/T2CRunner.java`
#### Snippet
```java
    private String pkgName;
    String agentName;
    private int currentIndex = 0;

    public T2CRunner(AgentManagementService agentManagementService, TestTaskRunCallback testTaskRunCallback,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
    private final PerformanceTestListener performanceTestListener;
    private long recordingStartTimeMillis;
    private boolean alreadyEnd = false;
    private AndroidTestUnit ongoingTestUnit;
    private String currentTestName = "";
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
    private AndroidTestUnit ongoingTestUnit;
    private String currentTestName = "";
    private int currentTestIndex = 0;
    private TestRunDeviceOrchestrator testRunDeviceOrchestrator;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
    private final String pkgName;
    private long recordingStartTimeMillis;
    private boolean alreadyEnd = false;
    private AndroidTestUnit ongoingTestUnit;
    private String currentTestName = "";
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
    private AndroidTestUnit ongoingTestUnit;
    private String currentTestName = "";
    private int currentTestIndex = 0;
    private TestRunDeviceOrchestrator testRunDeviceOrchestrator;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
    private long recordingStartTimeMillis;
    private int index;
    private boolean alreadyEnd = false;
    private AndroidTestUnit ongoingTestUnit;
    private int numTests;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/socket/AgentWebSocketClient.java`
#### Snippet
```java
    private boolean connectionActive = false;
    private boolean shouldRetryConnection = true;
    private int reconnectTime = 0;

    public AgentWebSocketClient(URI serverUri, AgentWebSocketClientService agentWebSocketClientService) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/socket/AgentWebSocketClient.java`
#### Snippet
```java
    private final AgentWebSocketClientService agentWebSocketClientService;

    private boolean connectionActive = false;
    private boolean shouldRetryConnection = true;
    private int reconnectTime = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/XmlTestRunListener.java`
#### Snippet
```java
    private String mHostName = "localhost";

    private File mReportDir = null;

    private String mReportPath = "";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/environment/EnvCapabilityDiscoveryService.java`
#### Snippet
```java
    private EnvCapabilityScanner scanner;

    private boolean enableScan = false;

    public void setEnableScan(boolean enableScan) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/environment/EnvCapability.java`
#### Snippet
```java
        private int minimumViableMajorVersion;
        private int minimumViableMinorVersion;
        private boolean ready = false;

        private void setReady(boolean ready) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/service/AgentWebSocketClientService.java`
#### Snippet
```java
    @Resource
    private StorageServiceClientProxy storageServiceClientProxy;
    private boolean isStorageClientInit = false;
    @Resource
    private AppOptions appOptions;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/service/AgentWebSocketClientService.java`
#### Snippet
```java
    @Autowired(required = false)
    private MetricPushGateway pushGateway;
    boolean isAgentInit = false;

    public void onMessage(Message message) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
    String scope;

    Map<String, Boolean> urlMapping = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/local/LocalStorageClientAdapter.java`
#### Snippet
```java

public class LocalStorageClientAdapter extends StorageServiceClient {
    private boolean isInitiated = false;
    private LocalStorageClient localStorageClient;
    Logger classLogger = LoggerFactory.getLogger(StorageServiceClient.class);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
    Logger classLogger = LoggerFactory.getLogger(AzureBlobClientAdapter.class);
    private long SASExpiryUpdate;
    private SASData sasDataInUse = null;
    private SASData sasDataForUpdate = null;
    private boolean isConnected = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
    private SASData sasDataInUse = null;
    private SASData sasDataForUpdate = null;
    private boolean isConnected = false;

    public AzureBlobClientAdapter() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSPerfTestHelper.java`
#### Snippet
```java

public class IOSPerfTestHelper {
    private volatile static IOSPerfTestHelper instance = null;

    private final Logger classLogger = LoggerFactory.getLogger(getClass());
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
    private long SASExpiryUpdate;
    private SASData sasDataInUse = null;
    private SASData sasDataForUpdate = null;
    private boolean isConnected = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/entity/center/SysTeam.java`
#### Snippet
```java
    @Transient
    // if the team is manageable by API requestor
    private boolean manageable = false;
}

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/entity/center/SysUser.java`
#### Snippet
```java
    // flag used for frontend only, to set identity of team member (ADMIN/USER)
    @Transient
    private boolean teamAdmin = false;

    public void setAuthorities(List<GrantedAuthority> permissions) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRunDevice.java`
#### Snippet
```java
    private String logPath;
    private final AnimatedGifEncoder gifEncoder = new AnimatedGifEncoder();
    private int gifFrameCount = 0;
    private File gifFile;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTaskSpec.java`
#### Snippet
```java
    public int deviceTestCount = 1;
    public String pipelineLink;
    public int retryTime = 0;
    public String frameworkType;
    public List<String> neededPermissions;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/DeviceInfo.java`
#### Snippet
```java
    private transient File screenshotImageFile;
    private transient File pcScreenshotImageFile;
    private transient boolean adbTimeout = false;
    private String type;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorder.java`
#### Snippet
```java
    protected String recordDir;

    protected boolean isStarted = false;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/screen/PhoneAppScreenRecorder.java`
#### Snippet
```java
    public int preSleepSeconds = 30;
    protected String fileName = Const.ScreenRecoderConfig.DEFAULT_FILE_NAME;
    boolean started = false;
    ADBOperateUtil adbOperateUtil;
    private Thread keepAliveThread;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java
    private int deviceTestCount;
    @Transient
    private int retryTime = 0;
    private String frameworkType;
    @Column(name = "team_id")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/screen/ADBScreenRecorder.java`
#### Snippet
```java
    private Thread recordingThread;
    private boolean shouldStop = true;
    private boolean shouldInterrupt = false;

    public ADBScreenRecorder(ADBOperateUtil adbOperateUtil, DeviceInfo deviceInfo, Logger logger, File baseFolder) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/screen/ADBScreenRecorder.java`
#### Snippet
```java

    private File mergedVideo;
    public int preSleepSeconds = 0;
    ADBOperateUtil adbOperateUtil;
    private Process recordingProcess;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/config/TestConfig.java`
#### Snippet
```java
    public String testSuiteName = "";
    public String frameworkType = "JUnit4";
    public int runTimeOutSeconds = 0;
    public int queueTimeOutSeconds = 0;
    public String pipelineLink = "";
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/config/TestConfig.java`
#### Snippet
```java
    public String frameworkType = "JUnit4";
    public int runTimeOutSeconds = 0;
    public int queueTimeOutSeconds = 0;
    public String pipelineLink = "";
    public boolean needUninstall = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/entity/performance/PerformanceInspection.java`
#### Snippet
```java
    public String description;
    public String inspectionKey = "";
    public boolean isReset = false;
    public File resultFolder;
}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
    private static final int waitStartSec = 30;
    private static final int minWaitFinishSec = 15;
    private static boolean isTestResultFailed = false;

    public static void switchClientInstance(HydraLabAPIClient client) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
public final class T2CAppiumUtils {
    static HashMap<String, String> keyToInfoMap = new HashMap<>();
    private static boolean isSelfTesting = false;

    private T2CAppiumUtils() {
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `docs/_layouts/default.html`
#### Snippet
```java

<html
 dir="{{ site.direction | default: 'ltr' }}"
 lang="{{ site.lang | default: 'en' }}"
 {% if site.fixed_navbar %}class="has-navbar-fixed-{{ site.fixed_navbar }}"{% endif %}>
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer stringBuffer` may be declared as 'StringBuilder'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
            fileReader = new FileReader(jsonFile);
            int ch = 0;
            StringBuffer stringBuffer = new StringBuffer();
            while ((ch = fileReader.read()) != -1) {
                stringBuffer.append((char) ch);
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `code` of exception class
in `common/src/main/java/com/microsoft/hydralab/common/util/HydraLabRuntimeException.java`
#### Snippet
```java

public class HydraLabRuntimeException extends RuntimeException {
    int code;

    public HydraLabRuntimeException(String message) {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
        } finally {
            this.inFinish = true;
            synchronized (this) {
                notify();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
            this.inFinish = true;
            synchronized (this) {
                notify();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
    public String getContent() {
        if (!this.inFinish) {
            synchronized (this) {
                try {
                    wait();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException ignore) {
                    ignore.printStackTrace();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestCommandReceiver.java`
#### Snippet
```java
            e.printStackTrace();
        } finally {
            synchronized (this) {
                notify();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestCommandReceiver.java`
#### Snippet
```java
        } finally {
            synchronized (this) {
                notify();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java

        logEnter("testRunEnded", elapsedTime, Thread.currentThread().getName());
        synchronized (this) {
            if (alreadyEnd) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
        performanceTestListener.testRunFinished();
        logEnter("testRunEnded", elapsedTime, Thread.currentThread().getName());
        synchronized (this) {
            if (alreadyEnd) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
    public void testRunEnded(long elapsedTime, Map<String, String> runMetrics) {
        logEnter("testRunEnded", elapsedTime, runMetrics, Thread.currentThread().getName());
        synchronized (this) {
            if (alreadyEnd) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java

    public void requestAllAgentDeviceListUpdate() {
        synchronized (this) {
            if (System.currentTimeMillis() - lastTimeRequest < TimeUnit.SECONDS.toMillis(5)) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSDeviceWatcher.java`
#### Snippet
```java
            e.printStackTrace();
        } finally {
            synchronized (this) {
                notify();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSDeviceWatcher.java`
#### Snippet
```java
        } finally {
            synchronized (this) {
                notify();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/util/CommandOutputReceiver.java`
#### Snippet
```java
            e.printStackTrace();
        } finally {
            synchronized (this) {
                notify();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/util/CommandOutputReceiver.java`
#### Snippet
```java
        } finally {
            synchronized (this) {
                notify();
            }
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSPerfTestHelper.java`
#### Snippet
```java
    public static IOSPerfTestHelper getInstance() {
        if (instance == null) {
            synchronized (IOSPerfTestHelper.class) {
                if (instance == null) {
                    instance = new IOSPerfTestHelper();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
            ThreadUtils.safeSleep(5000);
            CLASS_LOGGER.info("Stopping recording");
            synchronized (this) {
                iosDriver.stopRecordingScreen();
                if (recordProcess != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/management/AgentManagementService.java`
#### Snippet
```java
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(deviceInfoMap.entrySet());
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/management/AgentManagementService.java`
#### Snippet
```java
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(deviceInfoMap.entrySet());
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java
            }
        }
        synchronized (this) {
            for (Map.Entry<String, DeviceInfo> infoEntry : iOSDeviceInfoMap.entrySet()) {
                String serialNum = infoEntry.getKey();
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSUtils.java`
#### Snippet
```java
    private static final Map<String, Integer> wdaPortMap = new ConcurrentHashMap<>();
    private static final Map<String, Integer> mjpegServerPortMap = new ConcurrentHashMap<>();
    private static final Set<Integer> PORT_BLACK_LIST = new HashSet<>() {{
        add(8080);  //Reserved port
        add(8100);  //for WDA
```

### DoubleBraceInitialization
Double brace initialization
in `common/src/main/java/com/microsoft/hydralab/common/util/AgentConstant.java`
#### Snippet
```java
public class AgentConstant {
    public static final String UNKNOWN_IOS_MODEL = "Unknown iOS Device";
    public static final Map<String, String> iOSProductModelMap  = new HashMap<String, String>() {{
        put("i386", "iPhone Simulator");
        put("x86_64", "iPhone Simulator");
```

### DoubleBraceInitialization
Double brace initialization
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
    private static final String SUMMARY_DESCRIPTION = "Android memory info summary";
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private static final Map<String, Integer> MEMORY_FILE_TO_DB_INDEX_MAP = new HashMap<>() {
        {
            put("Java Heap", 0);
```

### DoubleBraceInitialization
Double brace initialization
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
            for (PerfInitActionMetaData actionMetaData : mPerfInitActions) {
                String description = String.format("Init %s module for driver: %s, app: %s.", actionType, actionMetaData.getDriverId(), actionMetaData.getTargetApp());
                Map<String, Object> arguments = new HashMap<>() {
                    {
                        put("targetApp", actionMetaData.getTargetApp());
```

### DoubleBraceInitialization
Double brace initialization
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
            if (driver.getPlatform().equalsIgnoreCase("ios")) {
                if (!StringUtils.isEmpty(driver.getLauncherApp())) {
                    Map<String, Object> arguments = new HashMap<>() {
                        {
                            put("appPackageName", driver.getLauncherApp());
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `inFinish` initializer `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
    private final InputStream inputStream;
    private final Logger logger;
    private volatile boolean inFinish = false;
    private String res;

```

### UnusedAssignment
Variable `gifFile` initializer `null` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
        reportLogger.info("ThreadParam init success, AppiumParam is {} , args is {}", appiumParam,
                LogUtils.scrubSensitiveArgs(instrumentationArgs.toString()));
        File gifFile = null;
        if (TestTask.TestFrameworkType.JUNIT5.equals(testTask.getFrameworkType())) {
            reportLogger.info("Start init listener");
```

### UnusedAssignment
Variable `res` initializer `null` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java

    public String runPYFunction(SmartTestParam smartTestParam, Logger logger) throws Exception {
        String res = null;
        String[] runArgs = new String[7];
        runArgs[0] = "python";
```

### UnusedAssignment
Variable `process` initializer `null` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/service/AgentManageService.java`
#### Snippet
```java

        sendMessageToCenter(true, "Restart Agent.", "", path);
        Process process = null;
        try {
            Thread.sleep(2000);
```

### UnusedAssignment
Variable `inputStream` initializer `null` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/controller/AuthController.java`
#### Snippet
```java
                             HttpServletResponse response) {
        try {
            InputStream inputStream = null;
            if (requestor == null || requestor.getAccessToken() == null) {
                inputStream = FileUtils.class.getClassLoader().getResourceAsStream(Const.Path.DEFAULT_PHOTO);
```

### UnusedAssignment
Variable `updateMag` initializer `null` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        log.info("Session {} is saved to map as registered agent, associated agent {}", session.getId(), message.getBody());

        AgentUpdateTask.UpdateMsg updateMag = null;
        String agentMessage = "Agent Reconnected After Updating.Version is " + agentUser.getVersionName();

```

### UnusedAssignment
Variable `len` initializer `0` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/DownloadUtils.java`
#### Snippet
```java
    public static byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((len = inputStream.read(buffer)) != -1) {
```

### UnusedAssignment
Variable `shellProcess` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java

    public static void killProcessByCommandStr(String commandStr, Logger classLogger) {
        String shellProcess = "";
        String args = "";
        String command = "";
```

### UnusedAssignment
Variable `args` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
    public static void killProcessByCommandStr(String commandStr, Logger classLogger) {
        String shellProcess = "";
        String args = "";
        String command = "";
        if (isConnectedToWindowsOS) {
```

### UnusedAssignment
Variable `command` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
        String shellProcess = "";
        String args = "";
        String command = "";
        if (isConnectedToWindowsOS) {
            String processName = commandStr.split(" ")[0];
```

### UnusedAssignment
Variable `process` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
        }
        String[] fullCommand = {shellProcess, args, command};
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(fullCommand);
```

### UnusedAssignment
The value `null` assigned to `process` is never used
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
            out.start();
            process.waitFor();
            process = null;

            classLogger.info("Successfully run: " + String.join(" ", fullCommand));
```

### UnusedAssignment
Variable `count` initializer `0` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count = 0;
        while ((count = bis.read(buffer, 0, 1024)) != -1) {
            fis.write(buffer, 0, count);
```

### UnusedAssignment
Variable `resultSize` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
        int KB = 1024;
        DecimalFormat df = new DecimalFormat("0.00");
        String resultSize = "";
        if (size / GB >= 1) {
            resultSize = df.format(size / (float) GB) + "GB";
```

### UnusedAssignment
Variable `msg` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
        IDevice deviceByInfo = getDeviceByInfo(deviceInfo);
        Assert.notNull(deviceByInfo, "No such device: " + deviceInfo);
        String msg = null;
        try {
            msg = deviceByInfo.uninstallPackage(packageName);
```

### UnusedAssignment
Variable `process` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSUtils.java`
#### Snippet
```java

    public static void startIOSDeviceWatcher(Logger logger, IOSDeviceDriver deviceDriver) {
        Process process = null;
        String command = "tidevice watch";
        ShellUtils.killProcessByCommandStr(command, logger);
```

### UnusedAssignment
Variable `logProcess` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSUtils.java`
#### Snippet
```java
    @Nullable
    public static Process startIOSLog(String keyWord, String logFilePath, DeviceInfo deviceInfo, Logger logger) {
        Process logProcess = null;
        File logFile = new File(logFilePath);
        if (ShellUtils.isConnectedToWindowsOS) {
```

### UnusedAssignment
Variable `bytes` initializer `0` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
    private static File convertToZipFile(File file, String suffix) {
        try {
            int bytes = 0;
            String filename = file.getAbsolutePath().replaceAll(suffix, FILE_SUFFIX.ZIP_FILE);
            File zipFile = new File(filename);
```

### UnusedAssignment
Variable `unzipFile` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
        OutputStream output = null;
        File result = null;
        File unzipFile = null;
        ZipFile zipFile = null;
        try {
```

### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            Enumeration<? extends ZipEntry> zipEnum = zipFile.entries();
            //define object
            ZipEntry entry = null;
            String entryName = null;
            String[] names = null;
```

### UnusedAssignment
Variable `entryName` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            //define object
            ZipEntry entry = null;
            String entryName = null;
            String[] names = null;
            int length;
```

### UnusedAssignment
Variable `names` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            ZipEntry entry = null;
            String entryName = null;
            String[] names = null;
            int length;
            //loop reading entries
```

### UnusedAssignment
Variable `readLen` initializer `0` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
                        output = Files.newOutputStream(result.toPath());
                        byte[] buffer = new byte[1024 * 8];
                        int readLen = 0;
                        while ((readLen = input.read(buffer, 0, 1024 * 8)) != -1) {
                            output.write(buffer, 0, readLen);
```

### UnusedAssignment
Variable `dateValue` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
        String value = criteriaType.getValue();
        String dateFormatString = criteriaType.getDateFormatString();
        Date dateValue = null;

        Assert.isTrue(!StringUtils.isEmpty(key), "The key of criteriaType can't be empty!");
```

### UnusedAssignment
Variable `destPath` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
        SimpleDateFormat format = new SimpleDateFormat(
                "yyyy-MM-dd-HH-mm-ss");
        String destPath = "";
        try {
            // wait 5s to record more info after testing
```

### UnusedAssignment
Variable `entries` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/management/AgentManagementService.java`
#### Snippet
```java
    public Set<DeviceInfo> getActiveDeviceList(Logger log) {
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(deviceInfoMap.entrySet());
```

### UnusedAssignment
Variable `entries` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/management/AgentManagementService.java`
#### Snippet
```java
    public Set<DeviceInfo> getDeviceList(Logger log) {
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(deviceInfoMap.entrySet());
```

### UnusedAssignment
Variable `appUsage` initializer `0.0f` is redundant
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
        AndroidBatteryInfo batteryInfo = new AndroidBatteryInfo();
        float totalUsage = 0.0f;
        float appUsage = 0.0f;
        // 1. android version lower than 12   2. android version higher than or equal to 12
        int mode = 1;
```

### UnusedAssignment
Variable `app` initializer `null` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        }

        File app = null;
        File testApp = null;
        try {
```

### UnusedAssignment
Variable `lastStatus` initializer `""` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        TestTask runningTest = null;
        int hydraRetryTime = 0;
        String lastStatus = "";
        String currentStatus = "";

```

### UnusedAssignment
Variable `elementFound` initializer `null` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java

    public static WebElement findElement(BaseDriverController driver, BaseElementInfo element, Logger logger) {
        WebElement elementFound = null;
        if (element == null) {
            return null;
```

### UnusedAssignment
Variable `androidElement` initializer `null` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
        PerformanceActionInitializer memoryTestInitializer = new PerformanceActionInitializer(ActionInfo.ACTION_TYPE_INSPECT_MEM_USAGE);
        ActionInfo actionInfo = null;
        AndroidElementInfo androidElement = null;
        WindowsElementInfo windowsElement = null;
        EdgeElementInfo edgeElement = null;
```

### UnusedAssignment
Variable `windowsElement` initializer `null` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
        ActionInfo actionInfo = null;
        AndroidElementInfo androidElement = null;
        WindowsElementInfo windowsElement = null;
        EdgeElementInfo edgeElement = null;
        IOSElementInfo iosElement = null;
```

### UnusedAssignment
Variable `edgeElement` initializer `null` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
        AndroidElementInfo androidElement = null;
        WindowsElementInfo windowsElement = null;
        EdgeElementInfo edgeElement = null;
        IOSElementInfo iosElement = null;

```

### UnusedAssignment
Variable `iosElement` initializer `null` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
        WindowsElementInfo windowsElement = null;
        EdgeElementInfo edgeElement = null;
        IOSElementInfo iosElement = null;

        for (int i = 0; i < caseJsonArray.size(); i++) {
```

### UnusedAssignment
Variable `json` initializer `""` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java

    public TestInfo parseJsonFile(String path) {
        String json = "";
        File jsonFile = new File(path);
        FileReader fileReader;
```

### UnusedAssignment
Variable `ch` initializer `0` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
        try {
            fileReader = new FileReader(jsonFile);
            int ch = 0;
            StringBuffer stringBuffer = new StringBuffer();
            while ((ch = fileReader.read()) != -1) {
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
            return;
        }
        MethodSource testSource = (MethodSource) testIdentifier.getSource().get();
        String testName = testSource.getMethodName() == null ? "testInitialization" : testSource.getMethodName();
        String testClassName = testSource.getClassName();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestDetailController.java`
#### Snippet
```java

            AccessToken token = storageTokenManageService.generateReadToken(requestor.getMailAddress());
            StorageFileInfo tempFileInfo = storageFileInfoRepository.findById(fileId).get();
            String blobUrl = tempFileInfo.getBlobUrl();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        AgentSessionInfo agentSessionInfoByAgentId = getAgentSessionInfoByAgentId(agentId);
        Assert.notNull(agentSessionInfoByAgentId, "Agent Offline!");
        StorageFileInfo packageInfo = storageFileInfoRepository.findById(fileId).get();
        if (packageInfo == null || !StorageFileInfo.FileType.AGENT_PACKAGE.equals(packageInfo.getFileType())) {
            throw new Exception("Error file info!");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        List<EntityFileRelation> fileRelations = entityFileRelationRepository.queryAllByEntityIdAndEntityTypeOrderByFileOrderAsc(entityId, entityType.typeName);
        for (EntityFileRelation fileRelation : fileRelations) {
            StorageFileInfo tempFileInfo = storageFileInfoRepository.findById(fileRelation.getFileId()).get();
            if (tempFileInfo != null) {
                result.add(tempFileInfo);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `CONFIG_MAP == null` is always `false`
in `sdk/src/main/java/com/microsoft/hydralab/appium/ThreadParam.java`
#### Snippet
```java

    public static String getConfigString(String key) {
        if (CONFIG_MAP == null) {
            return null;
        }
```

### ConstantValue
Condition `APPIUM_PARAM == null` is always `false`
in `sdk/src/main/java/com/microsoft/hydralab/appium/ThreadParam.java`
#### Snippet
```java

    public static AppiumParam getAppiumParam() {
        if (APPIUM_PARAM == null) {
            return new AppiumParam();
        }
```

### ConstantValue
Condition `converter == null` is always `false`
in `agent/src/main/java/com/microsoft/hydralab/agent/command/DeviceScriptCommandLoader.java`
#### Snippet
```java
        List<DeviceAction> actionList = new ArrayList<>();
        ActionConverter converter = ActionConverter.valueOf(deviceCommand.getType());
        if (converter == null) {
            return actionList;
        }
```

### ConstantValue
Result of `testRunDevice.getDeviceInfo()` is always 'null'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestRunner.java`
#### Snippet
```java
                                        TestTask testTask, TestRun testRun) {
        if (testRunDevice.getDeviceInfo() == null) {
            throw new RuntimeException("No such device: " + testRunDevice.getDeviceInfo());
        }
        testRunDeviceOrchestrator.addGifFrameAsyncDelay(testRunDevice, agentManagementService.getScreenshotDir(), 0, logger);
```

### ConstantValue
Value `deviceInfo` is always 'null'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java
                                  int testTimeOutSec, String command) {
        if (deviceInfo == null) {
            throw new RuntimeException("No such device: " + deviceInfo);
        }
        int testTimeOut = testTimeOutSec;
```

### ConstantValue
Condition `packageInfo == null` is always `false`
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        Assert.notNull(agentSessionInfoByAgentId, "Agent Offline!");
        StorageFileInfo packageInfo = storageFileInfoRepository.findById(fileId).get();
        if (packageInfo == null || !StorageFileInfo.FileType.AGENT_PACKAGE.equals(packageInfo.getFileType())) {
            throw new Exception("Error file info!");
        }
```

### ConstantValue
Condition `tempFileInfo != null` is always `true`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        for (EntityFileRelation fileRelation : fileRelations) {
            StorageFileInfo tempFileInfo = storageFileInfoRepository.findById(fileRelation.getFileId()).get();
            if (tempFileInfo != null) {
                result.add(tempFileInfo);
            }
```

### ConstantValue
Condition `filename == null` is always `false`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        String fileSuffix = null;
        boolean isMatch = false;
        if (filename == null) {
            throw new HydraLabRuntimeException(HttpStatus.BAD_REQUEST.value(), "error file type: " + filename);
        }
```

### ConstantValue
Condition `!finished` is always `true`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        String currentStatus = "";

        while (!finished) {
            if (TestTask.TestStatus.WAITING.equals(currentStatus)) {
                if (totalWaitSecond > testConfig.queueTimeOutSeconds) {
```

### ConstantValue
Value `finished` is always 'false'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        String currentStatus = "";

        while (!finished) {
            if (TestTask.TestStatus.WAITING.equals(currentStatus)) {
                if (totalWaitSecond > testConfig.queueTimeOutSeconds) {
```

### ConstantValue
Value `finished` is always 'false'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Queue timeout!");
            printlnf("Cancelled the task as queuing timeout %d seconds is reached", testConfig.queueTimeOutSeconds);
            assertTrue(finished, "Queuing timeout after waiting for " + testConfig.queueTimeOutSeconds + " seconds! Test id", runningTest);
        } else if (TestTask.TestStatus.RUNNING.equals(currentStatus)) {
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Run timeout!");
```

### ConstantValue
Value `finished` is always 'false'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Run timeout!");
            printlnf("Cancelled the task as running timeout %d seconds is reached", testConfig.runTimeOutSeconds);
            assertTrue(finished, "Running timeout after waiting for " + testConfig.runTimeOutSeconds + " seconds! Test id", runningTest);
        }

```

## RuleId[id=IOResource]
### IOResource
'URLClassLoader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
        }
        URLClassLoader urlClassLoader =
                new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());
        Class<?> myClass;
        try {
```

### IOResource
'URLClassLoader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
        }
        URLClassLoader urlClassLoader =
                new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());
        Class<?> myClass;
        try {
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `center/src/main/java/com/microsoft/hydralab/center/service/AuthTokenService.java`
#### Snippet
```java
    public AuthToken getAuthToken(Long tokenId) {
        Optional<AuthToken> authToken = authTokenRepository.findById(tokenId);
        if (!authToken.isPresent()) {
            return null;
        }
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `messageLength` may be 'static'
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
    private final Logger logger = LoggerFactory.getLogger(PackageSetController.class);
    private final SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    private final int messageLength = 200;
    @Resource
    AttachmentService attachmentService;
```

### FieldMayBeStatic
Field `httpFailureRetryTimes` may be 'static'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            .build();

    private final int httpFailureRetryTimes = 10;

    public void checkCenterAlive(HydraLabAPIConfig apiConfig) {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AgentApplication` has only 'static' members, and lacks a 'private' constructor
in `agent/src/main/java/com/microsoft/hydralab/agent/AgentApplication.java`
#### Snippet
```java
@Slf4j
@SuppressWarnings("hideutilityclassconstructor")
public class AgentApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `RegisterCenterApplication` has only 'static' members, and lacks a 'private' constructor
in `center/src/main/java/com/microsoft/hydralab/center/RegisterCenterApplication.java`
#### Snippet
```java
@PropertySource(value = {"classpath:version.properties"}, encoding = "utf-8")
@SuppressWarnings("HideUtilityClassConstructor")
public class RegisterCenterApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `DateUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/DateUtil.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

public class DateUtil {

    public static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
```

### UtilityClassWithoutPrivateConstructor
Class `LogUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class LogUtils {

    public enum MaskSensitiveData {
```

### UtilityClassWithoutPrivateConstructor
Class `LocalStorageURL` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/Const.java`
#### Snippet
```java
    }

    final class LocalStorageURL {
        public static final String CENTER_LOCAL_STORAGE_UPLOAD = "/api/storage/local/upload";
        public static final String CENTER_LOCAL_STORAGE_DOWNLOAD = "/api/storage/local/download";
```

### UtilityClassWithoutPrivateConstructor
Class `LocalStorageConst` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/Const.java`
#### Snippet
```java
    }

    final class LocalStorageConst {
        public static final List<String> PATH_PREFIX_LIST = List.of(LocalStorageURL.CENTER_LOCAL_STORAGE_UPLOAD, LocalStorageURL.CENTER_LOCAL_STORAGE_DOWNLOAD);
    }
```

### UtilityClassWithoutPrivateConstructor
Class `DownloadUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/DownloadUtils.java`
#### Snippet
```java
import java.net.URL;

public class DownloadUtils {
    public static final int CONNECT_TIMEOUT = 5 * 1000;

```

### UtilityClassWithoutPrivateConstructor
Class `ImageUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/ImageUtil.java`
#### Snippet
```java
import java.util.List;

public class ImageUtil {
    public static BufferedImage scaleBufferedImage(BufferedImage before, double ratio) {
        int w = before.getWidth();
```

### UtilityClassWithoutPrivateConstructor
Class `FlowUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/FlowUtil.java`
#### Snippet
```java
import java.util.concurrent.Callable;

public class FlowUtil {

    public static boolean retryWhenFalse(int count, Callable<Boolean> predicate) {
```

### UtilityClassWithoutPrivateConstructor
Class `ShellUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
import java.io.*;

public class ShellUtils {
    public static final String POWER_SHELL_PATH = "C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\powershell.exe";
    public static boolean isConnectedToWindowsOS = System.getProperty("os.name").startsWith("Windows");
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class FileUtil {
    private final static SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
    private static final Pattern paramKeyMatch = Pattern.compile("\\$\\{(\\w+)}");
```

### UtilityClassWithoutPrivateConstructor
Class `TimeUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/TimeUtils.java`
#### Snippet
```java
import java.util.TimeZone;

public class TimeUtils {

    // This function is for filenames, please do not involve the following characters as returned value: \/:*?"<>|
```

### UtilityClassWithoutPrivateConstructor
Class `IOSUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSUtils.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

public class IOSUtils {
    public static final String WDA_BUNDLE_ID = "com.microsoft.wdar.xctrunner";
    private static final Map<String, Integer> wdaPortMap = new ConcurrentHashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `SerializeUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/SerializeUtil.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public class SerializeUtil {
    static {
        // add auto type support for following entities
```

### UtilityClassWithoutPrivateConstructor
Class `MachineInfoUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/MachineInfoUtils.java`
#### Snippet
```java
import java.util.Properties;

public class MachineInfoUtils {

    protected static Logger classLogger = LoggerFactory.getLogger(MachineInfoUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `RestTemplateConfig` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/RestTemplateConfig.java`
#### Snippet
```java
import java.security.NoSuchAlgorithmException;

public class RestTemplateConfig {
    public static HttpComponentsClientHttpRequestFactory generateHttpRequestFactory()
            throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException {
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadPoolUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/ThreadPoolUtil.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolUtil {
    public static final ScheduledExecutorService TIMER_EXECUTOR = Executors.newScheduledThreadPool(20);
    public static final ScheduledExecutorService PERFORMANCE_TEST_TIMER_EXECUTOR = Executors.newScheduledThreadPool(5 /* corePoolSize */);
```

### UtilityClassWithoutPrivateConstructor
Class `PkgUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
import java.util.zip.ZipFile;

public class PkgUtil {
    public static JSONObject analysisFile(File file, EntityType entityType) {
        JSONObject res = new JSONObject();
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/ThreadUtils.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ThreadUtils {

    public static <T> void doInParallel(List<T> dataList, int threadCount, ParallelTask<T> task) {
```

### UtilityClassWithoutPrivateConstructor
Class `GraphAPIUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/GraphAPIUtils.java`
#### Snippet
```java
import java.util.concurrent.ExecutionException;

public class GraphAPIUtils {


```

### UtilityClassWithoutPrivateConstructor
Class `AgentConstant` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/AgentConstant.java`
#### Snippet
```java
import java.util.Map;

public class AgentConstant {
    public static final String UNKNOWN_IOS_MODEL = "Unknown iOS Device";
    public static final Map<String, String> iOSProductModelMap  = new HashMap<String, String>() {{
```

### UtilityClassWithoutPrivateConstructor
Class `FFmpegConcatUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
import java.util.List;

public class FFmpegConcatUtil {
    static final String fileName = Const.ScreenRecoderConfig.DEFAULT_FILE_NAME;
    public static File concatVideos(List<File> videos, File outputDir, Logger logger) {
```

### UtilityClassWithoutPrivateConstructor
Class `CommonUtils` has only 'static' members, and lacks a 'private' constructor
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class CommonUtils {
    public static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(Date.class, new TypeAdapter<Date>() {
```

### UtilityClassWithoutPrivateConstructor
Class `HydraLabClientUtils` has only 'static' members, and lacks a 'private' constructor
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
import static com.microsoft.hydralab.utils.CommonUtils.*;

public class HydraLabClientUtils {
    private static HydraLabAPIClient hydraLabAPIClient = new HydraLabAPIClient();
    private static final int waitStartSec = 30;
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/local/LocalStoragePermission.java`
#### Snippet
```java

public enum LocalStoragePermission {
    WRITE, READ;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    }

    ;

    public File getScreenShotWithStrategy(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger,
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsBatteryResultParser.java`
#### Snippet
```java

            try (ReversedLinesFileReader reversedReader = new ReversedLinesFileReader(inspectionResult.rawResultFile,
                    StandardCharsets.UTF_8);) {
                WindowsBatteryParsedData windowsBatteryParsedData = new WindowsBatteryParsedData();
                inspectionResult.parsedData = windowsBatteryParsedData;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getAbsolutePath` may produce `NullPointerException`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunDeviceOrchestrator.java`
#### Snippet
```java
                }
            });
            return FFmpegConcatUtil.mergeVideosSideBySide(videoFilePaths, folder, logger).getAbsolutePath();
        } else {
            return testRunDevice.getScreenRecorder().finishRecording();
```

### DataFlowIssue
Dereference of `yearFiles` may produce `NullPointerException`
in `agent/src/main/java/com/microsoft/hydralab/agent/scheduled/ScheduledDeviceControlTasks.java`
#### Snippet
```java
        File buildSourceFile = new File(folderPath);
        File[] yearFiles = buildSourceFile.listFiles();
        for (File year : yearFiles) {
            try {
                Integer.valueOf(year.getName());
```

### DataFlowIssue
Dereference of `file.listFiles()` may produce `NullPointerException`
in `agent/src/main/java/com/microsoft/hydralab/agent/service/TestTaskEngineService.java`
#### Snippet
```java
            if (!file.isDirectory()) {
                attachments.add(saveFileToBlob(file, deviceTestResultFolder, logger));
            } else if (file.listFiles().length > 0) {
                File zipFile = FileUtil.zipFile(file.getAbsolutePath(),
                        deviceTestResultFolder + "/" + file.getName() + ".zip");
```

### DataFlowIssue
Method invocation `getInputStream` may produce `NullPointerException`
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
        ResponseEntity<Resource> result = restTemplateHttps.exchange(photoUrl, HttpMethod.GET, entity, Resource.class);
        Resource body = result.getBody();
        return body.getInputStream();
    }
}
```

### DataFlowIssue
Method invocation `getString` may produce `NullPointerException`
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java

            ResponseEntity<JSONObject> json = restTemplateHttps.exchange(tokenUrl, HttpMethod.POST, entity, JSONObject.class);
            accessToken = json.getBody().getString("access_token");
        } catch (Exception e) {
            e.printStackTrace();
```

### DataFlowIssue
Variable is already assigned to this value
in `center/src/main/java/com/microsoft/hydralab/center/service/TestTaskService.java`
#### Snippet
```java
        int[] queuedInfo = new int[2];
        queuedInfo[0] = -1;
        queuedInfo[1] = 0;
        taskQueuedInfo.setQueuedInfo(queuedInfo);

```

### DataFlowIssue
Method invocation `available` may produce `NullPointerException`
in `center/src/main/java/com/microsoft/hydralab/center/controller/AuthController.java`
#### Snippet
```java
                inputStream = authUtil.requestPhoto(requestor.getAccessToken());
            }
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, inputStream.available());
            response.setContentType(MediaType.IMAGE_JPEG_VALUE);
```

### DataFlowIssue
Method invocation `getInputStream` may produce `NullPointerException`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/local/client/LocalStorageClient.java`
#### Snippet
```java
        ResponseEntity<Resource> response = restTemplateHttps.exchange(this.getDownloadUrl(), HttpMethod.POST, entity, Resource.class);
        try {
            IOUtils.copy(response.getBody().getInputStream(), new FileOutputStream(file));
        } catch (IOException e) {
            throw new HydraLabRuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.value(), "File stream downloaded, but saved to local failed.", e);
```

### DataFlowIssue
Argument `resourceAsStream` might be null
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
        InputStream resourceAsStream = FileUtils.class.getClassLoader().getResourceAsStream(relativePath);
        try {
            return IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
```

### DataFlowIssue
Method invocation `exists` may produce `NullPointerException`
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
                }
            }
            if (zipFile.exists()) {
                zipFile.delete();
            }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
            return true;
        } else if (newFileInfo.getFileName().equals(oldFileInfo.getFileName())
                && newFileInfo.getLoadType().equals(oldFileInfo.getLoadType())
                && newFileInfo.getLoadDir().equals(oldFileInfo.getLoadDir())
                && newFileInfo.getBlobContainer().equals(oldFileInfo.getBlobContainer())) {
```

### DataFlowIssue
Argument `fileSuffix` might be null
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java

        if (StringUtils.isEmpty(newFileName)) {
            newFileName = filename.replace(fileSuffix, "") + "_" + System.currentTimeMillis() % 10000 + "_" + fileSuffix;
        }

```

### DataFlowIssue
The call to 'isTrue' always fails, according to its method contracts
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
                } catch (Exception e) {
                    e.printStackTrace();
                    Assert.isTrue(false, "When querying with in, the value of criteriaType should be a JSONArray String!");
                }
                Assert.isTrue(values.size() > 0, "When querying with in, the value of criteriaType should contain 1 element at least!");
```

### DataFlowIssue
The call to 'isTrue' always fails, according to its method contracts
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
                break;
            default:
                Assert.isTrue(false, "Unsupported op type!");
                break;
        }
```

### DataFlowIssue
The call to 'isTrue' always fails, according to its method contracts
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
            } catch (ParseException e) {
                e.printStackTrace();
                Assert.isTrue(false, "Transfer String to Date failed!");
            }
        }
```

### DataFlowIssue
Dereference of `appFiles` may produce `NullPointerException`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/PreInstallListener.java`
#### Snippet
```java
        File appDir = agentManagementService.getPreAppDir();
        File[] appFiles = appDir.listFiles();
        for (File appFile : appFiles) {
            if (!appFile.isFile()) {
                continue;
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            throw new RuntimeException("Get Blob SAS fail: " + e.getMessage(), e);
        } finally {
            response.close();
        }
    }
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            throw new RuntimeException("Add attachments fail: " + e.getMessage(), e);
        } finally {
            response.close();
        }
    }
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            throw new RuntimeException("get test status fail: " + e.getMessage(), e);
        } finally {
            response.close();
        }
    }
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            throw new RuntimeException("upload App fail: " + e.getMessage(), e);
        } finally {
            response.close();
        }
    }
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            throw new RuntimeException("trigger test running fail: " + e.getMessage(), e);
        } finally {
            response.close();
        }
    }
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            throw new RuntimeException("cancel test task fail: " + e.getMessage(), e);
        } finally {
            response.close();
        }
    }
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            throw new RuntimeException("check center alive fail: " + e.getMessage(), e);
        } finally {
            response.close();
        }
    }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
        } catch (Exception e) {
            // TODO: no blocking for now, replace after enabling the access key usage
            printlnf("##[warning]Request generateAccess failed: " + jsonObject.toString());
            return "";
//            throw new RuntimeException("generate accessKey fail: " + e.getMessage(), e);
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
//            throw new RuntimeException("generate accessKey fail: " + e.getMessage(), e);
        } finally {
            response.close();
        }
    }
```

### DataFlowIssue
The call to 'assertTrue' always fails, according to its method contracts
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Queue timeout!");
            printlnf("Cancelled the task as queuing timeout %d seconds is reached", testConfig.queueTimeOutSeconds);
            assertTrue(finished, "Queuing timeout after waiting for " + testConfig.queueTimeOutSeconds + " seconds! Test id", runningTest);
        } else if (TestTask.TestStatus.RUNNING.equals(currentStatus)) {
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Run timeout!");
```

### DataFlowIssue
The call to 'assertTrue' always fails, according to its method contracts
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Run timeout!");
            printlnf("Cancelled the task as running timeout %d seconds is reached", testConfig.runTimeOutSeconds);
            assertTrue(finished, "Running timeout after waiting for " + testConfig.runTimeOutSeconds + " seconds! Test id", runningTest);
        }

```

### DataFlowIssue
Argument `webElement` might be null
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
        switch (actionType) {
            case "click":
                driver.click(webElement);
                break;
            case "tap":
```

### DataFlowIssue
Argument `webElement` might be null
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                break;
            case "clear":
                driver.clear(webElement);
                break;
            case "activateApp":
```

### DataFlowIssue
Argument `webElement` might be null
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                            "Assert info is not defined. Please add argument 'attribute' and 'expectedValue' in the json. action index: " + actionInfo.getId());
                }
                driver.assertElementAttribute(webElement, attribute, expectedValue);
                break;
            case "sleep":
```

### DataFlowIssue
Argument `webElement` might be null
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                    throw new IllegalArgumentException("Assert info is not defined. Please add argument 'attribute' and 'id' in the json. action index: " + actionInfo.getId());
                }
                String info = driver.getInfo(webElement, attributeKey);
                keyToInfoMap.put(id, info);
                break;
```

### DataFlowIssue
Argument `webElement` might be null
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                    int xVectorIntDnd = xVectorDnd instanceof Integer ? (Integer) xVectorDnd : Integer.getInteger((String) xVectorDnd);
                    int yVectorIntDnd = yVectorDnd instanceof Integer ? (Integer) yVectorDnd : Integer.getInteger((String) yVectorDnd);
                    driver.dragAndDrop(webElement, xVectorIntDnd, yVectorIntDnd);
                } else if (toElementStr != null) {
                    BaseElementInfo toElementInfo;
```

### DataFlowIssue
Argument `webElement` might be null
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                    }
                    WebElement toElement = findElement(driver, toElementInfo, logger);
                    driver.dragAndDrop(webElement, toElement);
                } else {
                    throw new IllegalArgumentException(
```

### DataFlowIssue
Argument `toElement` might be null
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                    }
                    WebElement toElement = findElement(driver, toElementInfo, logger);
                    driver.dragAndDrop(webElement, toElement);
                } else {
                    throw new IllegalArgumentException(
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`new String()` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
                //get the current entry
                entry = zipEnum.nextElement();
                entryName = new String(entry.getName());
                //separate entry names with/
                names = entryName.split("\\/");
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'instrumentationArgs' is still used
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTaskSpec.java`
#### Snippet
```java
    // todo: remove this field when update overall center-ADO/Gradle plugins compatibility
    @Deprecated
    public Map<String, String> instrumentationArgs;
    public Map<String, String> testRunArgs;
    public Set<String> agentIds = new HashSet<>();
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestTaskController.java`
#### Snippet
```java
                index++;
                TestTaskSpec temp = taskQueueCopy.poll();
                if (!isAdmin && !requestor.getTeamAdminMap().keySet().contains(temp.teamId)) {
                    continue;
                }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
                try {
                    wait();
                } catch (InterruptedException ignore) {
                    ignore.printStackTrace();
                }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `agent/src/main/java/com/microsoft/hydralab/agent/AgentApplication.java`
#### Snippet
```java

    private static boolean decideHeadlessFromArguments(String[] args) {
        log.info("main function param: args value > %s \n {}", Arrays.asList(args).toString());
        boolean headless = false;
        for (String arg : args) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
        // classLogger.info("Dump on {}: {}", adbDeviceInfo.getSerialNum(), dump);
        if (StringUtils.isBlank(dump)) {
            logger.error("did not find element with text {} on {}", Arrays.asList(possibleTexts).toString(),
                    deviceInfo.getSerialNum());
            return false;
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `targetApp` declared in one 'switch' branch and used in another
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                break;
            case ActionInfo.ACTION_TYPE_INSPECT_BATTERY_USAGE:
                String targetApp = (String) arguments.get("targetApp");
                String description = (String) arguments.get("description");
                boolean isReset = (Boolean) arguments.getOrDefault("isReset", false);
```

### SwitchStatementWithConfusingDeclaration
Local variable `description` declared in one 'switch' branch and used in another
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
            case ActionInfo.ACTION_TYPE_INSPECT_BATTERY_USAGE:
                String targetApp = (String) arguments.get("targetApp");
                String description = (String) arguments.get("description");
                boolean isReset = (Boolean) arguments.getOrDefault("isReset", false);
                driver.inspectBatteryUsage(targetApp, description, isReset);
```

### SwitchStatementWithConfusingDeclaration
Local variable `isReset` declared in one 'switch' branch and used in another
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                String targetApp = (String) arguments.get("targetApp");
                String description = (String) arguments.get("description");
                boolean isReset = (Boolean) arguments.getOrDefault("isReset", false);
                driver.inspectBatteryUsage(targetApp, description, isReset);
                break;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/monkey/AdbMonkeyRunner.java`
#### Snippet
```java
        if (checkTime > 0) {
            String crashStack = testRun.getCrashStack();
            if (crashStack != null && !"".equals(crashStack)) {
                ongoingMonkeyTest.setStatusCode(AndroidTestUnit.StatusCodes.FAILURE);
                ongoingMonkeyTest.setSuccess(false);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceGroupService.java`
#### Snippet
```java
        }

        if (groupName == null || "".equals(groupName)) {
            throw new IllegalArgumentException("groupName is required");
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceGroupController.java`
#### Snippet
```java
                                                  @QueryParam(value = "deviceIdentifier") String deviceIdentifier) {
        try {
            if (deviceIdentifier == null || "".equals(deviceIdentifier)) {
                return Result.error(HttpStatus.BAD_REQUEST.value(), "deviceIdentifier is required");
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceGroupController.java`
#### Snippet
```java
            return Result.error(HttpStatus.BAD_REQUEST.value(), "Team doesn't exist.");
        }
        if (groupName == null || "".equals(groupName)) {
            return Result.error(HttpStatus.BAD_REQUEST.value(), "groupName is required");
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java
    public boolean isAppInstalled(DeviceInfo deviceInfo, String packageName, Logger logger) {
        String result = IOSUtils.getAppList(deviceInfo.getSerialNum(), logger);
        if (result != null && !result.equals("")) {
            for (String line : result.split("\n")) {
                if (line.startsWith(packageName + " ")) {
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `agentManagementService` accessed in synchronized context
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
            testRun.onTestEnded();
            testRunDeviceOrchestrator.setRunningTestName(testRunDevice, null);
            testRunDeviceOrchestrator.stopGitEncoder(testRunDevice, agentManagementService.getScreenshotDir(), logger);
            testRunDeviceOrchestrator.stopScreenRecorder(testRunDevice, testRun.getResultFolder(), logger);
            testRunDeviceOrchestrator.stopLogCollector(testRunDevice);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `testFileSetRepository` accessed in synchronized context
in `center/src/main/java/com/microsoft/hydralab/center/service/TestFileSetService.java`
#### Snippet
```java
            return testFileSet;
        }
        testFileSet = testFileSetRepository.findById(fileSetId).orElse(null);
        if (testFileSet != null) {
            testFileSet.setAttachments(attachmentService.getAttachments(fileSetId, EntityType.APP_FILE_SET));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `attachmentService` accessed in synchronized context
in `center/src/main/java/com/microsoft/hydralab/center/service/TestFileSetService.java`
#### Snippet
```java
        testFileSet = testFileSetRepository.findById(fileSetId).orElse(null);
        if (testFileSet != null) {
            testFileSet.setAttachments(attachmentService.getAttachments(fileSetId, EntityType.APP_FILE_SET));
            saveFileSetToMem(testFileSet);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `iosDriver` accessed in synchronized context
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
            CLASS_LOGGER.info("Stopping recording");
            synchronized (this) {
                iosDriver.stopRecordingScreen();
                if (recordProcess != null) {
                    long pid = recordProcess.pid();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `isStarted` accessed in synchronized context
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
                    recordProcess = null;
                }
                isStarted = false;
            }
        } catch (Throwable e) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `testJsonFileList` accessed in synchronized context
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java

    public synchronized void addTestJsonFile(File jsonFile) {
        testJsonFileList.add(jsonFile);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `agentManagementService` accessed in synchronized context
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java
                if (removedInfo != null) {
                    if (DeviceInfo.OFFLINE.equals(info.getStatus())) {
                        agentManagementService.getDeviceStatusListenerManager().onDeviceConnected(info);
                        info.setStatus(DeviceInfo.ONLINE);
//                        classLogger.info("Device " + serialNum + " updated");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `agentManagementService` accessed in synchronized context
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java
//                    classLogger.info("Device " + serialNum + " disconnected");
                    info.setStatus(DeviceInfo.OFFLINE);
                    agentManagementService.getDeviceStatusListenerManager().onDeviceInactive(info);
                    getAppiumServerManager().quitIOSDriver(info, classLogger);
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `agentManagementService` accessed in synchronized context
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java
                // Add new connected devices
                iOSDeviceInfoMap.put(serialNum, info);
                agentManagementService.getDeviceStatusListenerManager().onDeviceConnected(info);
            }
        }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/XmlTestRunListener.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("deprecation")
    public void testRunStopped(long elapsedTime) {
        mRunResult.testRunStopped(elapsedTime);
    }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/monkey/AppiumMonkeyRunner.java`
#### Snippet
```java
                    }
                }
                if (count <= 0) {
                    continue;
                }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
    public boolean startJunit(File appiumJarFile, String appiumCommand, AppiumListener listener, Logger logger) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.addListener(listener);
        URL url = null;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestCommandReceiver.java`
#### Snippet
```java
            while ((line = bufferedReader.readLine()) != null) {
                if (logger == null) {
                    System.out.println(line);
                } else {
                    logger.info(line);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
        }
        logger.info("TestRunListener: {}", builder);
        System.out.println("TestRunListener: " + builder);

    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
    public void dynamicTestRegistered(TestIdentifier testIdentifier) {
        super.dynamicTestRegistered(testIdentifier);
        System.out.println(testIdentifier.getDisplayName());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
        }
        logger.info("TestRunListener: {}", builder);
        System.out.println("TestRunListener: " + builder);

    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/CommandOutputReceiver.java`
#### Snippet
```java
            while ((line = bufferedReader.readLine()) != null) {
                if (logger == null) {
                    System.out.println(line);
                } else {
                    logger.info(line);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/DownloadUtils.java`
#### Snippet
```java
        fos.close();
        inputStream.close();
        System.out.println("info:" + url + " download success");
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java

        if (!file.delete()) {
            System.err.printf("Unable to delete file or directory : %s%n", file);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
            isStarted = true;
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Start recording, Ignore it to unblocking the following tests----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
            System.out.println("-------------------------------Fail to Start recording, Ignore it to unblocking the following tests----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
            }
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
            return null;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
            isStarted = false;
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
            return null;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
            isStarted = true;
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Start recording, Ignore it to unblocking the following tests----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
            System.out.println("-------------------------------Fail to Start recording, Ignore it to unblocking the following tests----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/WindowsScreenRecorder.java`
#### Snippet
```java
            Files.write(path, data);
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/WindowsScreenRecorder.java`
#### Snippet
```java
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            String version = FileUtil.getStringFromFilePath(edgeDriverVersionFile);
            version = version.replaceAll("[^\\d.]", "");
            System.out.println(version);
            downloadEdgeDriver(version);
        } catch (IOException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java

    public void startAppiumServer() {
        System.out.println("get appium service ");
        if (service == null || !service.isRunning()) {
            try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
                URL status = new URL(String.format("http://%s:%d/wd/hub/status", appiumServerHost, appiumServerPort));
                new UrlChecker().waitUntilAvailable(Duration.ofMillis(1500).toMillis(), TimeUnit.MILLISECONDS, status);
                System.out.println("Appium service is running");
            } catch (UrlChecker.TimeoutException | MalformedURLException e) {
                service = AppiumDriverLocalService.buildService(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
                );
                service.start();
                System.out.println("start appium service : " + service.isRunning());
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
                throw new RuntimeException(appFamilyName + " is not opened or failed activate it");
            }
            System.out.println("HexAppTopLevelWindowByKeyWord: " + hexAppTopLevelWindowByKeyWord);
            caps.setCapability("platformName", "Windows");
            caps.setCapability("deviceName", "WindowsPC");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java
    public static void printlnf(String format, Object... args) {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.print("[" + utc.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "] ");
        System.out.printf(format + "\n", args);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.print("[" + utc.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "] ");
        System.out.printf(format + "\n", args);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java
        assertTrue(file.exists(), filePath + " file not exist!", null);

        System.out.println("Param " + paramName + ": " + filePath + " validated.");
        return file.getAbsolutePath();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/BaseDriverController.java`
#### Snippet
```java
        assert tagName.equals(expectedValue) : "Doesn't match expectedVal: "
                + "expectedVal: " + expectedValue + "; " + "resultVal: " + tagName;
        System.out.println("Matched!" + "Value: " + tagName);
    }

```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(isr);
            String line;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
                logger.info(line);
                if (line.startsWith("smartTestResult:")) {
                    res = line.replaceFirst("smartTestResult:", "");
                }
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestRunner.java`
#### Snippet
```java
                AndroidTestUnit ongoingXctest = new AndroidTestUnit();
                String testInfo = resultLine.split("'")[1];
                ongoingXctest.setTestName(testInfo.split("\\.")[1].replaceAll("[^a-zA-Z0-9_]", ""));
                ongoingXctest.setTestedClass(testInfo.split("\\.")[0].replaceAll("[^a-zA-Z0-9_]", ""));
                ongoingXctest.setDeviceTestResultId(testRun.getId());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestRunner.java`
#### Snippet
```java
                String testInfo = resultLine.split("'")[1];
                ongoingXctest.setTestName(testInfo.split("\\.")[1].replaceAll("[^a-zA-Z0-9_]", ""));
                ongoingXctest.setTestedClass(testInfo.split("\\.")[0].replaceAll("[^a-zA-Z0-9_]", ""));
                ongoingXctest.setDeviceTestResultId(testRun.getId());
                ongoingXctest.setTestTaskId(testRun.getTestTaskId());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java
        if (instrumentationArgs != null && !instrumentationArgs.isEmpty()) {
            instrumentationArgs.forEach(
                    (k, v) -> argString.append(" -e ").append(k.replaceAll("\\s|\"", "")).append(" ")
                            .append(v.replaceAll("\\s|\"", "")));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java
            instrumentationArgs.forEach(
                    (k, v) -> argString.append(" -e ").append(k.replaceAll("\\s|\"", "")).append(" ")
                            .append(v.replaceAll("\\s|\"", "")));
        }
        String commFormat;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `center/src/main/java/com/microsoft/hydralab/center/util/SecretGenerator.java`
#### Snippet
```java

    public String generateSecret() {
        return bCryptPasswordEncoder.encode(UUID.randomUUID().toString().replace("-", "")).replaceAll("\\W", "");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `center/src/main/java/com/microsoft/hydralab/center/controller/StorageController.java`
#### Snippet
```java
        String storageToken = request.getHeader("Authorization");
        if (storageToken != null) {
            storageToken = storageToken.replaceAll("Bearer ", "");
        } else {
            return Result.error(HttpStatus.UNAUTHORIZED.value(), "Invalid visit with no auth code");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `center/src/main/java/com/microsoft/hydralab/center/controller/StorageController.java`
#### Snippet
```java
        String storageToken = request.getHeader("Authorization");
        if (storageToken != null) {
            storageToken = storageToken.replaceAll("Bearer ", "");
        } else {
            throw new HydraLabRuntimeException(HttpStatus.UNAUTHORIZED.value(), "Invalid visit with no auth code");
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/file/StorageServiceClient.java`
#### Snippet
```java
            storageFileInfo.setCDNUrl(downloadUrl);
        } else {
            String originDomain = downloadUrl.split("//")[1].split("/")[0];
            storageFileInfo.setCDNUrl(downloadUrl.replace(originDomain, this.cdnUrl));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java
        String authToken = request.getHeader("Authorization");
        if (authToken != null) {
            authToken = authToken.replaceAll("Bearer ", "");
        }
        //check is ignore
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        }
        int commitCountInt = Integer.parseInt(commitCount);
        String localCommitMessage = commitMessage.replaceAll("[\\t\\n\\r]", " ");
        if (localCommitMessage.length() > messageLength) {
            localCommitMessage = localCommitMessage.substring(0, messageLength);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java

    public static String getFileTextAsCommandFromResource(String relativePath) {
        return getFileTextFromResource(relativePath).trim().replaceAll("[\n\r]", "").replaceAll("[\\s]{2,}", " ");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java

    public static String getFileTextAsCommandFromResource(String relativePath) {
        return getFileTextFromResource(relativePath).trim().replaceAll("[\n\r]", "").replaceAll("[\\s]{2,}", " ");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
            throw new HydraLabRuntimeException(HttpStatus.BAD_REQUEST.value(), "Illegal file name!");
        }
        originalFilename = originalFilename.replaceAll(" ", "");
        String extension = FilenameUtils.getExtension(originalFilename);
        extension = extension.replaceAll("\\.", "").replaceAll("/", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
        originalFilename = originalFilename.replaceAll(" ", "");
        String extension = FilenameUtils.getExtension(originalFilename);
        extension = extension.replaceAll("\\.", "").replaceAll("/", "");
        String fileName = FilenameUtils.getBaseName(originalFilename);
        fileName = fileName.replaceAll("\\.", "").replaceAll("/", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
        originalFilename = originalFilename.replaceAll(" ", "");
        String extension = FilenameUtils.getExtension(originalFilename);
        extension = extension.replaceAll("\\.", "").replaceAll("/", "");
        String fileName = FilenameUtils.getBaseName(originalFilename);
        fileName = fileName.replaceAll("\\.", "").replaceAll("/", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
        extension = extension.replaceAll("\\.", "").replaceAll("/", "");
        String fileName = FilenameUtils.getBaseName(originalFilename);
        fileName = fileName.replaceAll("\\.", "").replaceAll("/", "");
        if (StringUtils.isEmpty(extension) || StringUtils.isEmpty(fileName)) {
            throw new HydraLabRuntimeException(HttpStatus.BAD_REQUEST.value(), "Illegal file name!");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
        extension = extension.replaceAll("\\.", "").replaceAll("/", "");
        String fileName = FilenameUtils.getBaseName(originalFilename);
        fileName = fileName.replaceAll("\\.", "").replaceAll("/", "");
        if (StringUtils.isEmpty(extension) || StringUtils.isEmpty(fileName)) {
            throw new HydraLabRuntimeException(HttpStatus.BAD_REQUEST.value(), "Illegal file name!");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
            templateStr = templateStr.replace(String.format("${%s}", key), params.get(key).trim());
        }
        return templateStr.replaceAll(",? ?\\$\\{\\w+},?", "").replaceAll("[\\s]{2,}", " ");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
            templateStr = templateStr.replace(String.format("${%s}", key), params.get(key).trim());
        }
        return templateStr.replaceAll(",? ?\\$\\{\\w+},?", "").replaceAll("[\\s]{2,}", " ");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
                    }
                    if (line.contains(pkgName) && !line.contains(pkgName + ":")) {
                        String[] args = line.split("\\s+");
                        for (String arg : args) {
                            arg = arg.trim();
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
                        for (String arg : args) {
                            arg = arg.trim();
                            if (arg.matches("\\d+")) {
                                pid[0] = Integer.parseInt(arg);
                                return;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
                public void processNewLines(@NotNull String[] lines) {
                    try {
                        String[] result = lines[0].split("\\s+");
                        if (result[0].trim().length() > 0) {
                            length[0] = Long.parseLong(result[0].trim());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/entity/agent/SmartTestParam.java`
#### Snippet
```java

        this.apkPath = apkPath;
        this.deviceInfo = JSONObject.toJSONString(deviceInfo).replaceAll("\"", "'");
        this.modelInfo = modelInfo.toJSONString().replaceAll("\"", "'");
        this.testSteps = String.valueOf(testSteps);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/entity/agent/SmartTestParam.java`
#### Snippet
```java
        this.apkPath = apkPath;
        this.deviceInfo = JSONObject.toJSONString(deviceInfo).replaceAll("\"", "'");
        this.modelInfo = modelInfo.toJSONString().replaceAll("\"", "'");
        this.testSteps = String.valueOf(testSteps);
        this.stringTextFolder = stringFolderPath;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            FileUtil.downloadFileUsingStream(EDGE_DRIVER_DOWNLOAD_URL + "/LATEST_STABLE", edgeDriverVersionFile);
            String version = FileUtil.getStringFromFilePath(edgeDriverVersionFile);
            version = version.replaceAll("[^\\d.]", "");
            System.out.println(version);
            downloadEdgeDriver(version);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
                    if (Pattern.matches("capacity:.*computed drain:.*", line)) {
                        // find total usage
                        totalUsage = parseFloat(line.split("computed drain: ")[1].split(",")[0], line);
                        if (totalUsage == 0.0) {
                            mode = 2;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
                // Parse app usage
                if (Pattern.matches("uid " + uid + ":.*", line)) {
                    appUsage = parseFloat(line.split(": ")[1].split(" ")[0], line);
                    batteryInfo.setAppUsage(appUsage);
                    batteryInfo.setRatio(appUsage / totalUsage);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsBatteryResultParser.java`
#### Snippet
```java
                    }

                    String[] fieldValues = line.split(DELIMITER);
                    WindowsBatteryParsedData.WindowsBatteryMetrics windowsBatteryMetrics = getWindowsBatteryMetrics(
                            fieldValues, columnNameToIndexMap);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsBatteryResultParser.java`
#### Snippet
```java
        try (BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String columnNamesLine = reader.readLine();
            String[] columnNamesList = columnNamesLine.split(DELIMITER);

            int index = 0;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                        if (lineStr.startsWith("TOTAL ")) {
                            if (line.contains("TOTAL PSS:")) {
                                String pssValue = line.split("TOTAL PSS:")[1].split(" +")[1];
                                memoryValueArr[16] = NumberUtils.toLong(pssValue, -1);
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                        if (lineStr.startsWith("TOTAL ")) {
                            if (line.contains("TOTAL PSS:")) {
                                String pssValue = line.split("TOTAL PSS:")[1].split(" +")[1];
                                memoryValueArr[16] = NumberUtils.toLong(pssValue, -1);
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                            }
                            if (line.contains("TOTAL RSS:")) {
                                String rssValue = line.split("TOTAL RSS:")[1].split(" +")[1];
                                memoryValueArr[17] = NumberUtils.toLong(rssValue, -1);
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                            }
                            if (line.contains("TOTAL RSS:")) {
                                String rssValue = line.split("TOTAL RSS:")[1].split(" +")[1];
                                memoryValueArr[17] = NumberUtils.toLong(rssValue, -1);
                            }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                            }
                            if (line.contains("TOTAL SWAP PSS:")) {
                                memoryValueArr[18] = NumberUtils.toLong(line.split("TOTAL SWAP PSS:")[1].split(" +")[1], -1);
                            }
                            break;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                            }
                            if (line.contains("TOTAL SWAP PSS:")) {
                                memoryValueArr[18] = NumberUtils.toLong(line.split("TOTAL SWAP PSS:")[1].split(" +")[1], -1);
                            }
                            break;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                            // for current memory type, PSS data exists
                            if (line.charAt(pssEndOffset) != ' ') {
                                memoryValueArr[typeIndex * 2] = NumberUtils.toLong(values.split(" +")[1]);

                                // for current memory type, RSS data exists
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                                // for current memory type, RSS data exists
                                if (line.length() > rssEndOffset && line.charAt(rssEndOffset) != ' ') {
                                    memoryValueArr[typeIndex * 2 + 1] = NumberUtils.toLong(values.split(" +")[2]);
                                }
                            } else if (line.length() > rssEndOffset && line.charAt(rssEndOffset) != ' ') {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
                            } else if (line.length() > rssEndOffset && line.charAt(rssEndOffset) != ' ') {
                                // for current memory type PSS data doesn't exist and RSS data exists
                                memoryValueArr[typeIndex * 2 + 1] = NumberUtils.toLong(values.split(" +")[1]);
                            }
                        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java

        // quotation marks not support
        String[] argLines = argsString.replace("\"", "").split(",");
        for (String argLine: argLines) {
            String[] kv = argLine.split("=");
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
                Element element = startNowNode.get(0);
                String bounds = element.attr("bounds");
                String[] boundsVal = bounds.split("[\\[\\],]+");
                int xStart = Integer.parseInt(boundsVal[1]);
                int yStart = Integer.parseInt(boundsVal[2]);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java

    private void parseCoordinates(String bounds) {
        String[] boundsArray = bounds.split("\\[|\\]|,");
        String[] validArr = Arrays.stream(boundsArray).filter(StringUtils::isNotEmpty).toArray(String[]::new);
        int x1 = Integer.parseInt(validArr[0]);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `agent/src/main/java/com/microsoft/hydralab/agent/environment/EnvCapabilityDiscoveryService.java`
#### Snippet
```java

public class EnvCapabilityDiscoveryService {
    Logger logger = org.slf4j.LoggerFactory.getLogger(EnvCapabilityDiscoveryService.class);
    private final EnvInfo envInfo = new EnvInfo();
    private EnvCapabilityScanner scanner;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `agent/src/main/java/com/microsoft/hydralab/agent/environment/EnvCapabilityScanner.java`
#### Snippet
```java

public abstract class EnvCapabilityScanner {
    Logger logger = org.slf4j.LoggerFactory.getLogger(EnvCapabilityScanner.class);
    protected Map<String, String> systemEnv = System.getenv();
    static Pattern versionPattern = Pattern.compile("([0-9]+\\.[0-9]+\\.[0-9]+)");
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `center/src/main/java/com/microsoft/hydralab/center/controller/StorageController.java`
#### Snippet
```java
    private final Logger logger = LoggerFactory.getLogger(StorageController.class);

    @javax.annotation.Resource
    private StorageTokenManageService storageTokenManageService;

```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java

    private void parseCoordinates(String bounds) {
        String[] boundsArray = bounds.split("\\[|\\]|,");
        String[] validArr = Arrays.stream(boundsArray).filter(StringUtils::isNotEmpty).toArray(String[]::new);
        int x1 = Integer.parseInt(validArr[0]);
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.info("Exception:" + e);
            e.printStackTrace();
        } finally {
            this.inFinish = true;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
                    wait();
                } catch (InterruptedException ignore) {
                    ignore.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        initStringPool();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java
            proc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java
                filename.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestCommandReceiver.java`
#### Snippet
```java
                logger.info("Exception:" + e);
            }
            e.printStackTrace();
        } finally {
            synchronized (this) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/monkey/AppiumMonkeyRunner.java`
#### Snippet
```java
            }
        } catch (WebDriverException e) {
            e.printStackTrace();
            logger.info("Monkey Test Exit with Error, Quit the Driver. ");
            testRunDeviceOrchestrator.quitAppiumDriver(testRunDevice, logger);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
            logger.info("{} is running test with pid {}", pkgName, pid);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        logger.info("Start gif frames collection");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/service/AgentManageService.java`
#### Snippet
```java
            sendMessageToCenter(true, "Restart Agent Success! Check The Agent Log For Detail!", "", path);
        } catch (Exception e) {
            e.printStackTrace();
            sendMessageToCenter(false, "Exec Command Failed! Check The Agent Log For Detail!", e.getMessage(),
                    path);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
            accessToken = json.getBody().getString("access_token");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accessToken;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
            userInfo = JSONObject.parseObject(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInfo;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
            url = URLEncoder.encode(url, FileUtil.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String loginUrl =
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/service/AgentManageService.java`
#### Snippet
```java
                return agentConfigFile;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/controller/AuthController.java`
#### Snippet
```java
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
    public void onError(Session session, Throwable error) {
        log.error("onError from session " + session.getId(), error);
        error.printStackTrace();
        deleteSessionAndDevice(session);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            return Result.error(e.getCode(), e);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            return Result.ok(testFileSet);
        } catch (HydraLabRuntimeException e) {
            e.printStackTrace();
            return Result.error(e.getCode(), e.getMessage());
        } catch (Exception e) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            return Result.error(e.getCode(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            return Result.error(e.getCode(), e);
        } catch (IOException e) {
            e.printStackTrace();
            return Result.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), e);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSDeviceWatcher.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.info("Exception:" + e);
            e.printStackTrace();
        } finally {
            synchronized (this) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/DateUtil.java`
#### Snippet
```java
                return appCenterFormat2.parse(timeString);
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/CommandOutputReceiver.java`
#### Snippet
```java
                logger.info("Exception:" + e);
            }
            e.printStackTrace();
        } finally {
            synchronized (this) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/ImageUtil.java`
#### Snippet
```java
            ImageIO.write(outputImage, "jpg", outputFile);
        } catch (IOException e) {
            e.printStackTrace();
            throw new HydraLabRuntimeException("Failed to join images", e);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
            fileWriter.write(report);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
            return IOUtils.toString(Files.newInputStream(new File(path).toPath()), UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
            return IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            analysisPlist(file, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            res.put(TaskConst.PARAM_VERSION_CODE, prop.getProperty(TaskConst.PROPERTY_VERSION_CODE));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (propertyStream != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
                    propertyStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            res.put(ParserKey.TARGET_SDK_VERSION, apkMeta.getTargetSdkVersion());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BufferUnderflowException e) {
            e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            e.printStackTrace();
        } catch (BufferUnderflowException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            FileUtil.deleteFile(unzippedFolder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/ThreadUtils.java`
#### Snippet
```java
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/ThreadUtils.java`
#### Snippet
```java
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
                    values = JSONArray.parseArray(value);
                } catch (Exception e) {
                    e.printStackTrace();
                    Assert.isTrue(false, "When querying with in, the value of criteriaType should be a JSONArray String!");
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
                date = format.parse(value);
            } catch (ParseException e) {
                e.printStackTrace();
                Assert.isTrue(false, "Transfer String to Date failed!");
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/logger/impl/IOSLogCollector.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (logProcess != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Start recording, Ignore it to unblocking the following tests----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
            return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
            IOUtils.copy(Objects.requireNonNull(resourceAsStream), out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
            return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Start recording, Ignore it to unblocking the following tests----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/WindowsScreenRecorder.java`
#### Snippet
```java
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/PhoneAppScreenRecorder.java`
#### Snippet
```java
            IOUtils.copy(Objects.requireNonNull(resourceAsStream), out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/logger/impl/ADBLogcatCollector.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (process != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/logger/impl/ADBLogcatCollector.java`
#### Snippet
```java

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (process != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
            new File(rightVideoPath).delete();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
            return new File(outputDir, fileName);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (process != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            downloadEdgeDriver(version);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // wait 2s to ensure that process is totally crashed
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            } catch (Exception e) {
                logger.info("Error happened when quitting driver for edge.");
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            } catch (Exception e) {
                logger.info("Error happened when quitting Windows driver for app: " + appFamilyName);
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            } catch (Exception e) {
                logger.info("Error happened when quitting driver for device: " + udid);
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            } catch (Exception e) {
                logger.info("Error happened when quitting driver for windows edge.");
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            ThreadUtils.safeSleep(TimeUnit.SECONDS.toMillis(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            } catch (Exception e) {
                logger.info("Error happened when quitting driver for device: " + udid);
                e.printStackTrace();
            } finally {
                IOSUtils.killProxyWDA(deviceInfo, logger);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
            } catch (Exception e) {
                logger.info("Error happened when quitting driver for Windows. ");
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/management/AppiumServerManager.java`
#### Snippet
```java
                edgeDriver = new EdgeDriver();
            } catch (Exception e) {
                e.printStackTrace();
                updateEdgeDriver(e.getMessage());
                edgeDriver = new EdgeDriver();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/RobotUtils.java`
#### Snippet
```java
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
            Thread.sleep(TimeUnit.SECONDS.toMillis(second));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        } catch (IOException e) {
            // no need to rethrow
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
            chooseActionType(driver, actionInfo, logger);
        } catch (Exception e) {
            e.printStackTrace();
            int index = actionInfo.getId();
            String description = actionInfo.getDescription();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
            return parseJson(json);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java

        String method = test.getTestName();
        if (method == null) {
            ongoingTestUnit.setTestName("testInitialization");
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
                Assert.isTrue(!StringUtils.isEmpty(value), "When querying with gt, the value of criteriaType can't be empty!");
                dateValue = transferValueToDate(value, dateFormatString);
                if (dateValue != null) {
                    predicate = criteriaBuilder.greaterThan(root.get(key), dateValue);
                } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `common/src/main/java/com/microsoft/hydralab/common/util/CriteriaTypeUtil.java`
#### Snippet
```java
                Assert.isTrue(!StringUtils.isEmpty(value), "When querying with lt, the value of criteriaType can't be empty!");
                dateValue = transferValueToDate(value, dateFormatString);
                if (dateValue != null) {
                    predicate = criteriaBuilder.lessThan(root.get(key), dateValue);
                } else {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `TestRunner()` of an abstract class should not be declared 'public'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunner.java`
#### Snippet
```java
    protected final XmlBuilder xmlBuilder = new XmlBuilder();

    public TestRunner(AgentManagementService agentManagementService, TestTaskRunCallback testTaskRunCallback,
                      TestRunDeviceOrchestrator testRunDeviceOrchestrator, PerformanceTestManagementService performanceTestManagementService) {
        this.agentManagementService = agentManagementService;
```

### NonProtectedConstructorInAbstractClass
Constructor `IOSAppiumScreenRecorder()` of an abstract class should not be declared 'public'
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorder.java`
#### Snippet
```java


    public IOSAppiumScreenRecorder(DeviceDriver deviceDriver, DeviceInfo info, String recordDir) {
        this.deviceDriver = deviceDriver;
        this.deviceInfo = info;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDeviceDriver()` of an abstract class should not be declared 'public'
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    protected AppiumServerManager appiumServerManager;

    public AbstractDeviceDriver(AgentManagementService agentManagementService,
                                AppiumServerManager appiumServerManager) {
        this.agentManagementService = agentManagementService;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseElementInfo()` of an abstract class should not be declared 'public'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/BaseElementInfo.java`
#### Snippet
```java
    protected final String xpath;

    public BaseElementInfo(String xpath) {
        this.xpath = xpath;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseDriverController()` of an abstract class should not be declared 'public'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/BaseDriverController.java`
#### Snippet
```java
    protected String udid;

    public BaseDriverController(WebDriver webDriver, String udid, Logger logger) {
        this.webDriver = webDriver;
        this.udid = udid;
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.merge' method call
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
            String groupDevices = String.join(",", testDeviceSerials);
            Assert.notNull(agentSessionInfoByAgentId, "Device/Agent Offline!");
            if (result.get(Const.Param.TEST_DEVICE_SN) == null) {
                result.put(Const.Param.TEST_DEVICE_SN, groupDevices);
            } else {
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/DeviceStabilityMonitor.java`
#### Snippet
```java

                // start a timer to trigger when recovery time limit is reached, to recover state from UNSTABLE to last recorded normal state
                ThreadPoolUtil.TIMER_EXECUTOR.schedule(new Runnable() {
                    @Override
                    public void run() {
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        try {
            runTestInner(reportFolderPath, apiConfig, testConfig);
        } catch (RuntimeException e) {
            throw e;
        }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `content`
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
                String maskedMessage = matcher.group(2);
                if (maskedMessage.length() > 0) {
                    content = content.replaceFirst(maskedMessage, "***");
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `common/src/main/java/com/microsoft/hydralab/common/util/FlowUtil.java`
#### Snippet
```java
                toThrow = new RuntimeException(e);
            }
            count--;
        }
        if (toThrow != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `common/src/main/java/com/microsoft/hydralab/common/util/FlowUtil.java`
#### Snippet
```java
            }
            ThreadUtils.safeSleep(sleepSeconds * 1000);
            count--;
        }
        if (toThrow != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `folderPath`
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
    public static boolean isLegalFolderPath(String folderPath) {
        if (folderPath.endsWith("/")) {
            folderPath = folderPath.substring(0, folderPath.length() - 1);
        }
        String pattern = "^((?! )(?![^\\\\/]*\\s+[\\\\/])[\\w -]+[\\\\/])*(?! )(?![^.]*\\s+\\.)[\\w -]+$";
```

### AssignmentToMethodParameter
Assignment to method parameter `originalFilename`
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
            throw new HydraLabRuntimeException(HttpStatus.BAD_REQUEST.value(), "Illegal file name!");
        }
        originalFilename = originalFilename.replaceAll(" ", "");
        String extension = FilenameUtils.getExtension(originalFilename);
        extension = extension.replaceAll("\\.", "").replaceAll("/", "");
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
        boolean isLessZero = false;
        if (size < 0) {
            size = -size;
            isLessZero = true;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `logger`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
        checkBlobClientUpdate();
        if (logger == null) {
            logger = classLogger;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `storageFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        for (StorageFileInfo tempFileInfo : tempFileInfos) {
            if (compareFileInfo(storageFileInfo, tempFileInfo)) {
                storageFileInfo = updateFileInStorageAndDB(tempFileInfo, file, entityType, logger);
                recordExists = true;
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `storageFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        }
        if (!recordExists) {
            storageFileInfo = saveFileInStorageAndDB(storageFileInfo, file, entityType, logger);
        }
        saveRelation(entityId, entityType, storageFileInfo);
```

### AssignmentToMethodParameter
Assignment to method parameter `newFileName`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java

        if (StringUtils.isEmpty(newFileName)) {
            newFileName = filename.replace(fileSuffix, "") + "_" + System.currentTimeMillis() % 10000 + "_" + fileSuffix;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `newFileName`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        }

        newFileName = FileUtil.getLegalFileName(newFileName);
        File file = new File(parentDir, newFileName);// CodeQL [java/path-injection] False Positive: Has verified the string by regular expression
        InputStream inputStream = originFile.getInputStream();
```

### AssignmentToMethodParameter
Assignment to method parameter `performanceInspection`
in `common/src/main/java/com/microsoft/hydralab/performance/PerformanceTestManagementService.java`
#### Snippet
```java
        if (performanceInspection == null) return null;

        performanceInspection = getDevicePerformanceInspection(performanceInspection);
        Map<String, PerformanceTestResult> testResultMap = testRunPerfResultMap.get(getTestRun().getId());
        Assert.notNull(testResultMap, "Found no matched test result for test run");
```

### AssignmentToMethodParameter
Assignment to method parameter `performanceInspection`
in `common/src/main/java/com/microsoft/hydralab/performance/PerformanceTestManagementService.java`
#### Snippet
```java
        if (performanceInspection == null || testRun == null) return null;

        performanceInspection = getDevicePerformanceInspection(performanceInspection);
        PerformanceInspector.PerformanceInspectorType inspectorType = performanceInspection.inspectorType;
        PerformanceInspector performanceInspector = getInspectorByType(inspectorType);
```

### AssignmentToMethodParameter
Assignment to method parameter `content`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java
                String maskedMessage = matcher.group(2);
                if (maskedMessage.length() > 0) {
                    content = content.replaceFirst(maskedMessage, "***");
                }
            }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `deviceInfo`
in `common/src/main/java/com/microsoft/hydralab/common/management/AgentManagementService.java`
#### Snippet
```java
            return;
        }
        synchronized (deviceInfo) {
            deviceInfo.reset();
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `recordWindow`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/DeviceStabilityMonitor.java`
#### Snippet
```java
            if (lastRecord.getTime().plus(deviceStateChangeRecoveryTime, ChronoUnit.MINUTES).isBefore(now)) {
                // UNSTABLE back to normal state
                synchronized (recordWindow) {
                    recordWindow.clear();
                }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `recordWindow`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/DeviceStabilityMonitor.java`
#### Snippet
```java
        } else {
            // keep window duration for data within {deviceStateChangeWindowTime} minutes;
            synchronized (recordWindow) {
                while (firstRecord.getTime().plus(deviceStateChangeWindowTime, ChronoUnit.MINUTES).isBefore(now)) {
                    recordWindow.pollFirst();
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `sdk/src/main/java/com/microsoft/hydralab/performance/PerformanceInspectionService.java`
#### Snippet
```java
        @Override
        public PerformanceInspectionResult inspect(PerformanceInspection performanceInspection) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sdk/src/main/java/com/microsoft/hydralab/performance/PerformanceInspectionService.java`
#### Snippet
```java
        @Override
        public PerformanceTestResult parse(PerformanceInspection performanceInspection) {
            return null;
        }
    };
```

### ReturnNull
Return of `null`
in `sdk/src/main/java/com/microsoft/hydralab/appium/ThreadParam.java`
#### Snippet
```java
    public static String getConfigString(String key) {
        if (CONFIG_MAP == null) {
            return null;
        }
        Map<String, String> temp = CONFIG_MAP.get();
```

### ReturnNull
Return of `null`
in `sdk/src/main/java/com/microsoft/hydralab/appium/ThreadParam.java`
#### Snippet
```java
        Map<String, String> temp = CONFIG_MAP.get();
        if (temp == null) {
            return null;
        }
        return temp.get(key);
```

### ReturnNull
Return of `null`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunner.java`
#### Snippet
```java
            loadTestRunToCurrentThread(testRun);
            run(testRunDevice, testTask, testRun);
            return null;
        });
        ThreadPoolUtil.TEST_EXECUTOR.execute(futureTask);
```

### ReturnNull
Return of `null`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/DeviceTaskControlExecutor.java`
#### Snippet
```java
        if (activeDevice <= 0) {
            log.warn("No device available for this task, forceForTesting: {}", forceForTesting);
            return null;
        }

```

### ReturnNull
Return of `null`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestRunner.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `agent/src/main/java/com/microsoft/hydralab/agent/environment/EnvCapabilityScanner.java`
#### Snippet
```java
        String path = systemEnv.get(pathVarName);
        if (path == null) {
            return null;
        }
        String[] paths = path.split(getPathVariableSeparator());
```

### ReturnNull
Return of `null`
in `agent/src/main/java/com/microsoft/hydralab/agent/environment/EnvCapabilityScanner.java`
#### Snippet
```java
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles == null) {
            return null;
        }
        ArrayList<File> files = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/AuthTokenService.java`
#### Snippet
```java
        Optional<AuthToken> authToken = authTokenRepository.findById(tokenId);
        if (!authToken.isPresent()) {
            return null;
        }
        return authToken.get();
```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/RolePermissionManagementService.java`
#### Snippet
```java
        Set<SysPermission> permissions = rolePermissionListMap.get(roleId);
        if (permissions == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/SysPermissionService.java`
#### Snippet
```java
    public SysPermission updatePermission(SysPermission sysPermission) {
        if (sysPermission == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/SysTeamService.java`
#### Snippet
```java
    public SysTeam updateTeam(SysTeam sysTeam) {
        if (sysTeam == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/SysUserService.java`
#### Snippet
```java
    public SysUser updateUser(SysUser sysUser) {
        if (sysUser == null) {
            return null;
        }
        return sysUserRepository.save(sysUser);
```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/AgentManageService.java`
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
in `center/src/main/java/com/microsoft/hydralab/center/service/SecurityUserService.java`
#### Snippet
```java
            if (enabledAuth) {
                if (StringUtils.isEmpty(accessToken)) {
                    return null;
                }
                displayName = authUtil.getLoginUserDisplayName(accessToken);
```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/SysRoleService.java`
#### Snippet
```java
    public SysRole updateRole(SysRole sysRole) {
        if (sysRole == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/SysRoleService.java`
#### Snippet
```java
    public SysRole getRequestorRole(SysUser requestor) {
        if (requestor == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/UserTeamManagementService.java`
#### Snippet
```java
        Set<SysTeam> teams = userTeamListMap.get(mailAddress);
        if (teams == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/UserTeamManagementService.java`
#### Snippet
```java
        Set<SysUser> users = teamUserListMap.get(teamId);
        if (users == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/TestDataService.java`
#### Snippet
```java
        Optional<TestTask> taskOpt = testTaskRepository.findById(testId);
        if (taskOpt.isEmpty()) {
            return null;
        }
        TestTask testTask = taskOpt.get();
```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        Object body = message.getBody();
        if (!(body instanceof AgentUser)) {
            return null;
        }
        AgentUser agentUser = (AgentUser) body;
```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        Optional<AgentUser> findUser = agentUserRepository.findById(id);
        if (!findUser.isPresent()) {
            return null;
        }
        AgentUser user = findUser.get();
```

### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        AgentUser user = findUser.get();
        if (!user.getSecret().equals(agentUser.getSecret()) || !user.getName().equals(agentUser.getName())) {
            return null;
        }
        user.setHostname(agentUser.getHostname());
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/DateUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
        IDevice device = getDeviceByInfo(deviceInfo);
        if (device == null) {
            return null;
        }
        getNotNullLogger(logger).info("getScreenshot");
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
    public String uploadFileToBlob(File uploadFile, String containerName, String blobFilePath, Logger logger) {
        if (!isConnected) {
            return null;
        }
        checkBlobClientUpdate();
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
    public BlobProperties downloadFileFromBlob(File downloadToFile, String containerName, String blobFilePath) {
        if (!isConnected) {
            return null;
        }
        checkBlobClientUpdate();
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/MachineInfoUtils.java`
#### Snippet
```java
    public static String getCountryNameFromCode(String code) {
        if (code == null) {
            return null;
        }
        for (Locale availableLocale : Locale.getAvailableLocales()) {
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/MachineInfoUtils.java`
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
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
                return file;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/entity/center/SysUser.java`
#### Snippet
```java
    @Override
    public Object getDetails() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/entity/center/SysUser.java`
#### Snippet
```java
    @Override
    public Object getCredentials() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRunDeviceCombo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
            return files.get(0);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java

        if (testJsonInfoList.size() == 0) {
            return null;
        }
        List<TestJsonInfo> testJsonInfoListCopy = new ArrayList<>(testJsonInfoList);
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        List<TestJsonInfo> testJsonInfoList = testJsonInfoRepository.findByPackageNameAndCaseName(packageName, caseName);
        if (testJsonInfoList.size() == 0) {
            return null;
        }
        List<TestJsonInfo> testJsonInfoListCopy = new ArrayList<>(testJsonInfoList);
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
    private String stopRecord() {
        if (!isStarted) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
            return null;
        }
        return destPath;
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
    public String finishRecording() {
        if (!isStarted) {
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat(
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
            return null;
        }
        return destPath;
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/WindowsScreenRecorder.java`
#### Snippet
```java

        if (PCVideoFile == null || !PCVideoFile.exists()) {
            return null;
        }
        return PCVideoFile.getAbsolutePath();
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/PhoneAppScreenRecorder.java`
#### Snippet
```java
        logger.info("finishRecording :" + started);
        if (!started) {
            return null;
        }
        boolean tag = false;
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/PhoneAppScreenRecorder.java`
#### Snippet
```java
            return pathOnAgent;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java
    public String getPullRequestId() {
        if (!TestType.PR.equals(type)) {
            return null;
        }
        if (StringUtils.isBlank(testCommitMsg)) {
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java
        }
        if (StringUtils.isBlank(testCommitMsg)) {
            return null;
        }
        String msg = testCommitMsg.toLowerCase();
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java
        String msg = testCommitMsg.toLowerCase();
        if (!msg.startsWith("merge pull request ")) {
            return null;
        }
        Matcher matcher = pIdMatch.matcher(msg);
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestTask.java`
#### Snippet
```java
        Matcher matcher = pIdMatch.matcher(msg);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group();
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/ADBScreenRecorder.java`
#### Snippet
```java
    public String finishRecording() {
        if (shouldStop) {
            return null;
        }
        shouldStop = true;
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/ADBScreenRecorder.java`
#### Snippet
```java
        } catch (Exception e) {
            logger.warn("Exception from recordingThread {} {}", e.getClass().getName(), e.getMessage());
            return null;
        }
        logger.info("Complete waiting: {}", (System.currentTimeMillis() - time) / 1000f);
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
    public static File concatVideos(List<File> videos, File outputDir, Logger logger) {
        if (videos.isEmpty()) {
            return null;
        }
        if (videos.size() == 1) {
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
    public static File mergeVideosSideBySide(List<String> videoPaths, File outputDir, Logger logger) {
        if (videoPaths.isEmpty()) {
            return null;
        }
        if (videoPaths.size() == 1) {
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRun.java`
#### Snippet
```java
    private String getBlobUrlStr(String path) {
        if (path == null) {
            return null;
        }
        String[] paths = path.split("/");
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/entity/WindowsMemoryParsedData.java`
#### Snippet
```java
    @JSONField(serialize = false)
    public LinkedHashMap<String, Double> getBaselineMetricsKeyValue() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/entity/WindowsMemoryParsedData.java`
#### Snippet
```java
    @JSONField(serialize = false)
    public SummaryType getSummaryType() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/entity/IOSMemoryPerfInfo.java`
#### Snippet
```java
    @JSONField(serialize = false)
    public SummaryType getSummaryType() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/entity/IOSMemoryPerfInfo.java`
#### Snippet
```java
    @JSONField(serialize = false)
    public LinkedHashMap<String, Double> getBaselineMetricsKeyValue() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/entity/WindowsBatteryParsedData.java`
#### Snippet
```java
        @JSONField(serialize = false)
        public SummaryType getSummaryType() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/entity/WindowsBatteryParsedData.java`
#### Snippet
```java
        @JSONField(serialize = false)
        public LinkedHashMap<String, Double> getBaselineMetricsKeyValue() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/entity/IOSEnergyGaugeInfo.java`
#### Snippet
```java
    @JSONField(serialize = false)
    public LinkedHashMap<String, Double> getBaselineMetricsKeyValue() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/entity/IOSEnergyGaugeInfo.java`
#### Snippet
```java
    @JSONField(serialize = false)
    public SummaryType getSummaryType() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
    private AndroidBatteryInfo getResultSummary(List<PerformanceInspectionResult> inspectionResults) {
        if (inspectionResults == null || inspectionResults.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
    private AndroidBatteryInfo parseRawResultFile(File rawFile, String packageName) {
        if (!rawFile.isFile()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
            if (uid == null) {
                classLogger.error(String.format("Could not parse the battery usage of %s in battery info file: %s", packageName, rawFile.getAbsolutePath()));
                return null;
            }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
        } catch (IOException e) {
            classLogger.error("Failed to parse the battery info file: " + rawFile.getAbsolutePath());
            return null;
        }
        return batteryInfo;
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java
        if (performanceTestResult == null || performanceTestResult.performanceInspectionResults == null
                || performanceTestResult.performanceInspectionResults.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsBatteryResultParser.java`
#### Snippet
```java
        if (!MachineInfoUtils.isOnWindowsLaptop()) {
            classLogger.error("Windows battery test must be run on Windows Laptop!");
            return null;
        }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/PerformanceTestManagementService.java`
#### Snippet
```java
    @Override
    public PerformanceTestResult parse(PerformanceInspection performanceInspection) {
        if (performanceInspection == null) return null;

        performanceInspection = getDevicePerformanceInspection(performanceInspection);
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/PerformanceTestManagementService.java`
#### Snippet
```java

    private PerformanceInspectionResult inspect(PerformanceInspection performanceInspection, ITestRun testRun) {
        if (performanceInspection == null || testRun == null) return null;

        performanceInspection = getDevicePerformanceInspection(performanceInspection);
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/PerformanceTestManagementService.java`
#### Snippet
```java
    private List<PerformanceTestResult> parseForTestRun(ITestRun testRun) {
        Map<String, PerformanceTestResult> testResultMap = testRunPerfResultMap.get(testRun.getId());
        if (testResultMap == null) return null;

        List<PerformanceTestResult> resultList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsMemoryInspector.java`
#### Snippet
```java
        {
            classLogger.error("TestRunThreadContext.getTestRun() return null.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsMemoryInspector.java`
#### Snippet
```java
        } catch (InterruptedException e) {
            classLogger.error("InterruptedException caught on process.waitFor().");
            return null;
        }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
        if (!MachineInfoUtils.isOnWindowsLaptop()) {
            classLogger.error("Windows battery test must be run on Windows Laptop!");
            return null;
        }
        initializeIfNeeded(performanceInspection);
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
        {
            classLogger.error("TestRunThreadContext.getTestRun() return null.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
        } catch (InterruptedException e) {
            classLogger.error("InterruptedException caught on process.waitFor().");
            return null;
        }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
            averageMemoryInfoLong[i] = Math.round(averageMemoryInfo[i]);
        }
        return isValidSummary ? buildMemoryInfo(inspectionResult.inspection.appId, description, inspectionResult.timestamp, averageMemoryInfoLong) : null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
        return memoryValueArr;
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
        if (performanceTestResult == null || performanceTestResult.performanceInspectionResults == null
                || performanceTestResult.performanceInspectionResults.isEmpty()) {
            return null;
        }
        List<PerformanceInspectionResult> inspectionResults = performanceTestResult.performanceInspectionResults;
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidMemoryInfoResultParser.java`
#### Snippet
```java
    private AndroidMemoryInfo buildMemoryInfo(String packageName, String description, long timestamp, long[] memInfos) {
        if (memInfos == null || memInfos.length != MEM_INFO_LENGTH) {
            return null;
        }
        AndroidMemoryInfo androidMemoryInfo = new AndroidMemoryInfo();
```

### ReturnNull
Return of `null`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java
                        } catch (IllegalStateException e) {
                            in.nextNull();
                            return null;
                        }
                    } else {
```

### ReturnNull
Return of `null`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java
                        }
                    } else {
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/CommonUtils.java`
#### Snippet
```java
    public static HashMap<String, String> parseArguments(String argsString){
        if (StringUtils.isBlank(argsString)) {
            return null;
        }
        HashMap<String, String> argsMap = new HashMap<>();
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
        } catch (Exception e) {
            classLogger.error(e.getMessage(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/finder/EdgeElementFinder.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/finder/IOSElementFinder.java`
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
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/finder/AndroidElementFinder.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/finder/WindowsElementFinder.java`
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
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
        WebElement elementFound = null;
        if (element == null) {
            return null;
        }
        ElementFinder<BaseElementInfo> finder = ElementFinderFactory.createElementFinder(driver);
```

### ReturnNull
Return of `null`
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `timestamp` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/XmlTestRunListener.java`
#### Snippet
```java
        dateFormat.setTimeZone(gmt);
        dateFormat.setLenient(true);
        String timestamp = dateFormat.format(new Date());
        return timestamp;
    }
```

### UnnecessaryLocalVariable
Local variable `authTokens` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/AuthTokenService.java`
#### Snippet
```java

    public List<AuthToken> queryAuthToken() {
        List<AuthToken> authTokens = authTokenRepository.findAll();

        return authTokens;
```

### UnnecessaryLocalVariable
Local variable `authTokens` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/AuthTokenService.java`
#### Snippet
```java

    public List<AuthToken> queryAuthTokenByName(String name) {
        List<AuthToken> authTokens = authTokenRepository.queryByCreator(name);

        return authTokens;
```

### UnnecessaryLocalVariable
Local variable `loginUrl` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     */
    public String getLoginUrl() {
        String loginUrl = authorizationUri + "?client_id=" + clientId + "&response_type=code&redirect_uri=" + redirectUri + "&response_mode=query&scope=" + scope;
        return loginUrl;
    }
```

### UnnecessaryLocalVariable
Local variable `loginUrl` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
            e.printStackTrace();
        }
        String loginUrl =
                authorizationUri + "?client_id=" + clientId + "&response_type=code&redirect_uri=" + redirectUri + "&response_mode=query&scope=" + scope + "&state=" + url;
        return loginUrl;
```

### UnnecessaryLocalVariable
Local variable `agents` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/AgentManageService.java`
#### Snippet
```java

    public List<AgentUser> getAgentsByUserMail(String mailAddress) {
        List<AgentUser> agents = agentUserRepository.findAllByMailAddress(mailAddress);
        return agents;
    }
```

### UnnecessaryLocalVariable
Local variable `agentUsers` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/AgentManageService.java`
#### Snippet
```java
        }

        List<AgentUser> agentUsers = agentUserRepository.findAll(spec);
        return agentUsers;
    }
```

### UnnecessaryLocalVariable
Local variable `pageObj` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/TestFileSetService.java`
#### Snippet
```java
        }
        Sort sortByDate = Sort.by(Sort.Direction.DESC, "ingestTime");
        Page<TestFileSet> pageObj = testFileSetRepository.findAll(spec, PageRequest.of(page, pageSize, sortByDate));
        return pageObj;
    }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/TestDataService.java`
#### Snippet
```java
        query.orderBy(criteriaBuilder.asc(root.get("testSuite")));

        List<TestTask> result = entityManager.createQuery(query).getResultList();
        return result;
    }
```

### UnnecessaryLocalVariable
Local variable `pageObj` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/TestDataService.java`
#### Snippet
```java
        }

        Page<TestTask> pageObj = testTaskRepository.findAll(spec, PageRequest.of(page, pageSize, sortByStartDate));
        return pageObj;
    }
```

### UnnecessaryLocalVariable
Local variable `testUnits` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/TestDataService.java`
#### Snippet
```java

    public List<StabilityData> getFailTest(int page, int size) {
        List<StabilityData> testUnits = stabilityDataRepository.findBySuccess(false, PageRequest.of(page, size, sortByStartMillis)).getContent();
        return testUnits;
    }
```

### UnnecessaryLocalVariable
Local variable `outputFile` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSPerfTestHelper.java`
#### Snippet
```java
        IOSPerfScriptProcessWrapper processInfo = iOSPerfScriptProcesses.get(key);
        if (processInfo != null) {
            File outputFile = processInfo.getResultFile();
            return outputFile;
        }
```

### UnnecessaryLocalVariable
Local variable `averagedMetrics` is redundant
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsMemoryResultParser.java`
#### Snippet
```java
                summedMetrics[i] = summedMetrics[i].divide(BigInteger.valueOf(count));
            }
            BigInteger[] averagedMetrics = summedMetrics;

            WindowsMemoryParsedData.WindowsMemoryMetrics windowsMemoryMetrics =
```

### UnnecessaryLocalVariable
Local variable `jsonObject` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            String string = body.string();
            printlnf("RunningTestJson: %s", maskCred(string));
            JsonObject jsonObject = GSON.fromJson(string, JsonObject.class);

            return jsonObject;
```

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestLog.java`
#### Snippet
```java
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException ignore) {
                    ignore.printStackTrace();
```

### WaitNotInLoop
Call to `wait()` is not in loop
in `common/src/main/java/com/microsoft/hydralab/common/screen/ADBScreenRecorder.java`
#### Snippet
```java
        try {
            synchronized (lock) {
                lock.wait(TimeUnit.MINUTES.toMillis(2));
            }
        } catch (Exception e) {
```

## RuleId[id=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java
            CommandOutputReceiver err = new CommandOutputReceiver(proc.getErrorStream(), log);
            CommandOutputReceiver out = new CommandOutputReceiver(proc.getInputStream(), log);
            err.start();
            out.start();
            proc.waitFor();
```

### ThreadStartInConstruction
Call to `start()` during object construction
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartTestUtil.java`
#### Snippet
```java
            CommandOutputReceiver out = new CommandOutputReceiver(proc.getInputStream(), log);
            err.start();
            out.start();
            proc.waitFor();
        } catch (Exception e) {
```

