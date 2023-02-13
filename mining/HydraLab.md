# HydraLab 
 
# Bad smells
I found 663 bad smells with 94 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ThrowablePrintStackTrace | 79 | false |
| ReturnNull | 58 | false |
| SizeReplaceableByIsEmpty | 43 | true |
| UnusedAssignment | 41 | false |
| NullableProblems | 34 | false |
| DataFlowIssue | 33 | false |
| RedundantFieldInitialization | 31 | false |
| DynamicRegexReplaceableByCompiledPattern | 27 | false |
| SystemOutErr | 26 | false |
| UtilityClassWithoutPrivateConstructor | 25 | true |
| AssignmentToMethodParameter | 25 | false |
| SynchronizeOnThis | 18 | false |
| IgnoreResultOfCall | 17 | false |
| BoundedWildcard | 16 | false |
| MissortedModifiers | 16 | false |
| NestedAssignment | 13 | false |
| ConstantValue | 13 | false |
| UnnecessaryLocalVariable | 12 | true |
| DefaultAnnotationParam | 10 | false |
| StaticCallOnSubclass | 9 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 8 | false |
| PublicFieldAccessedInSynchronizedContext | 8 | false |
| StringEqualsEmptyString | 7 | false |
| KeySetIterationMayUseEntrySet | 6 | false |
| ReplaceAssignmentWithOperatorAssignment | 6 | false |
| AssignmentToStaticFieldFromInstanceMethod | 5 | false |
| UnnecessaryStringEscape | 4 | true |
| RedundantArrayCreation | 4 | true |
| RedundantMethodOverride | 4 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 4 | false |
| CommentedOutCode | 3 | false |
| ObjectNotify | 3 | false |
| TrivialStringConcatenation | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| ReplaceNullCheck | 3 | false |
| Convert2Lambda | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| RegExpRedundantEscape | 2 | false |
| RegExpSimplifiable | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| UNUSED_IMPORT | 2 | false |
| EmptyMethod | 2 | false |
| DoubleBraceInitialization | 2 | false |
| IOResource | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| NonStrictComparisonCanBeEquality | 2 | true |
| NonProtectedConstructorInAbstractClass | 2 | true |
| WaitNotInLoop | 2 | false |
| ThreadStartInConstruction | 2 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| NonFinalFieldOfException | 1 | false |
| OptionalIsPresent | 1 | false |
| FieldMayBeStatic | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CatchMayIgnoreException | 1 | false |
| RedundantSuppression | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| Java8MapApi | 1 | false |
## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (testResult.getStatus()) { case FAILURE: printFailedTest(serializ...` statement on enum type 'com.android.ddmlib.testrunner.TestResult.TestStatus' misses cases: 'PASSED', and 'INCOMPLETE'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/XmlTestRunListener.java`
#### Snippet
```java
        serializer.attribute(ns, ATTR_TIME, Double.toString((double) elapsedTimeMs / 1000.f));

        switch (testResult.getStatus()) {
            case FAILURE:
                printFailedTest(serializer, FAILURE, testResult.getStackTrace());
                break;
            case ASSUMPTION_FAILURE:
                printFailedTest(serializer, SKIPPED_TAG, testResult.getStackTrace());
                break;
            case IGNORED:
                serializer.startTag(ns, SKIPPED_TAG);
                serializer.endTag(ns, SKIPPED_TAG);
                break;
        }

        serializer.endTag(ns, TESTCASE);
```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
        String[] boundsArray = bounds.split("\\[|\\]|,");
        String[] validArr = Arrays.stream(boundsArray).filter(StringUtils::isNotEmpty).toArray(String[]::new);
        Integer x1 = Integer.parseInt(validArr[0]);
        Integer x2 = Integer.parseInt(validArr[2]);
        Integer y1 = Integer.parseInt(validArr[1]);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
        Integer x1 = Integer.parseInt(validArr[0]);
        Integer x2 = Integer.parseInt(validArr[2]);
        Integer y1 = Integer.parseInt(validArr[1]);
        Integer y2 = Integer.parseInt(validArr[3]);
        top = y1;
```

## RuleId[ruleID=StaticCallOnSubclass]
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
Static method `xpath()` declared in class 'org.openqa.selenium.By' but referenced via subclass 'io.appium.java_client.AppiumBy'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/AndroidDriverController.java`
#### Snippet
```java
        try {
            elementFound = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                    .until(driver -> driver.findElement(AppiumBy.xpath("//*[@text='" + name + "']")));
        } catch (Exception e) {
            logger.info("Can not find element by text: " + name);
```

### StaticCallOnSubclass
Static method `parseObject()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                    BaseElementInfo toElementInfo;
                    if (driver instanceof AndroidDriverController) {
                        toElementInfo = AndroidElementInfo.getAndroidElementFromJson(JSONObject.parseObject(toElementStr));
                    } else if (driver instanceof WindowsDriverController) {
                        toElementInfo = JSON.parseObject(toElementStr, WindowsElementInfo.class);
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
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/ActionExecutor.java`
#### Snippet
```java
                logger.info("Convert directly: failed. Try to convert by JSONObject", actionArgs.get(i));
                try {
                    methodArgs[i + 1] = JSONObject.parseObject(actionArgs.get(i), DeviceAction.class);
                } catch (Exception e1) {
                    throw new HydraLabRuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Convert arg failed!", e1);
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

## RuleId[ruleID=UnnecessaryStringEscape]
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

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `common/src/main/java/com/microsoft/hydralab/common/screen/AppiumE2ETestRecorder.java`
#### Snippet
```java
        String mergeDestinationPath = new File(baseFolder.getAbsolutePath(), Const.ScreenRecoderConfig.DEFAULT_FILE_NAME).getAbsolutePath();
        FFmpegConcatUtil.mergeVideosSideBySide(phoneVideoFile.getAbsolutePath(), PCVideoFile.getAbsolutePath(), mergeDestinationPath, logger);
        // PCVideoFile.delete();
        // phoneVideoFile.delete();
        return true;
```

### CommentedOutCode
Commented out code (6 lines)
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java

    private void startTools() {
//        try {
//            pid = adbDeviceManager.getPackagePid(deviceInfo, pkgName, logger);
//            logger.info("{} is running test with pid {}", pkgName, pid);
```

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

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `isAuthedBySAS` from instance context
in `common/src/main/java/com/microsoft/hydralab/common/util/blob/BlobStorageClient.java`
#### Snippet
```java
        cdnUrl = blobProperty.getCDNUrl();
        initContainer();
        isAuthedBySAS = false;
        isConnected = true;
    }
```

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

## RuleId[ruleID=RegExpRedundantEscape]
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

    public void parseCoordinates(String bounds){
        String[] boundsArray = bounds.split("\\[|\\]|,");
        String[] validArr = Arrays.stream(boundsArray).filter(StringUtils::isNotEmpty).toArray(String[]::new);
        Integer x1 = Integer.parseInt(validArr[0]);
```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        String parentDir = CENTER_FILE_BASE_DIR + fileRelativePath;
        try {
            File savedPkg = attachmentService.verifyAndSaveFile(packageFile, parentDir, false, null, new String[]{FILE_SUFFIX.JAR_FILE});
            BlobFileInfo blobFileInfo = new BlobFileInfo(savedPkg, fileRelativePath, BlobFileInfo.FileType.AGENT_PACKAGE);
            return Result.ok(attachmentService.addFileInfo(blobFileInfo, savedPkg, EntityFileRelation.EntityType.AGENT_PACKAGE, logger));
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java

            //Save app file to server
            File tempAppFile = attachmentService.verifyAndSaveFile(appFile, CENTER_FILE_BASE_DIR + relativePath, false, null, new String[]{FILE_SUFFIX.APK_FILE, FILE_SUFFIX.IPA_FILE});
            BlobFileInfo appBlobFile = new BlobFileInfo(tempAppFile, relativePath, BlobFileInfo.FileType.APP_FILE);
            //Upload app file
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            //Save test app file to server if exist
            if (testAppFile != null && !testAppFile.isEmpty()) {
                File tempTestAppFile = attachmentService.verifyAndSaveFile(testAppFile, CENTER_FILE_BASE_DIR + relativePath, false, null, new String[]{FILE_SUFFIX.APK_FILE, FILE_SUFFIX.JAR_FILE, FILE_SUFFIX.JSON_FILE});

                BlobFileInfo testAppBlobFile = new BlobFileInfo(tempTestAppFile, relativePath, BlobFileInfo.FileType.TEST_APP_FILE);
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            testJsonInfo.setTeamName(team.getTeamName());
            String newFileName = formatDate.format(testJsonInfo.getIngestTime()) + FILE_SUFFIX.JSON_FILE;
            File savedJson = attachmentService.verifyAndSaveFile(testJsonFile, parentDir, false, newFileName, new String[]{FILE_SUFFIX.JSON_FILE});
            String blobPath = fileRelativePath + "/" + savedJson.getName();
            testJsonInfo.setBlobPath(blobPath);
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
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
Iteration over `agents.keySet()` may be replaced with 'entrySet()' iteration
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        }
        Assert.isTrue(!isAllOffline, "All Device/Agent Offline!");
        for (String agentId : agents.keySet()) {
            AgentSessionInfo agentSessionInfoByAgentId = getAgentSessionInfoByAgentId(agentId);
            String groupDevices = String.join(",", agents.get(agentId));
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
Iteration over `keys` may be replaced with 'values()' iteration
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        List<AgentDeviceGroup> res = new ArrayList<>();
        Set<String> keys = agentDeviceGroups.keySet();
        for (String key : keys) {
            AgentDeviceGroup agent = agentDeviceGroups.get(key);
            if (agent.getAgentDeviceType() != AgentUser.DeviceType.WINDOWS) {
```

## RuleId[ruleID=ObjectNotify]
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
in `common/src/main/java/com/microsoft/hydralab/common/util/CommandOutputReceiver.java`
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

## RuleId[ruleID=UnnecessaryQualifierForThis]
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

## RuleId[ruleID=RegExpSimplifiable]
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

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`keyToVal.get("accessibilityId").length() != 0` can be replaced with '!keyToVal.get("accessibilityId").isEmpty()'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
        if (element == null) return null;
        Map<String, String> keyToVal = element.getBasisSearchedBy();
        if (keyToVal.get("accessibilityId") != null && keyToVal.get("accessibilityId").length() != 0) {
            elementFinded = driver.findElementByAccessibilityId(keyToVal.get("accessibilityId"));
            if (elementFinded != null) {
```

### SizeReplaceableByIsEmpty
`keyToVal.get("text").length() != 0` can be replaced with '!keyToVal.get("text").isEmpty()'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
            }
        }
        if (keyToVal.get("text") != null && keyToVal.get("text").length() != 0) {
            elementFinded = driver.findElementByName(keyToVal.get("text"));
            if (elementFinded != null) {
```

### SizeReplaceableByIsEmpty
`keyToVal.get("xpath").length() != 0` can be replaced with '!keyToVal.get("xpath").isEmpty()'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
            }
        }
        if (keyToVal.get("xpath") != null && keyToVal.get("xpath").length() != 0) {
            elementFinded = driver.findElementByXPath(keyToVal.get("xpath"));
            if (elementFinded != null) {
```

### SizeReplaceableByIsEmpty
`criteriaTypes.size() > 0` can be replaced with '!criteriaTypes.isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/service/TestFileSetService.java`
#### Snippet
```java
    public Page<TestFileSet> queryFileSets(int page, int pageSize, List<CriteriaType> criteriaTypes) {
        Specification<TestFileSet> spec = null;
        if (criteriaTypes != null && criteriaTypes.size() > 0) {
            spec = new CriteriaTypeUtil<TestFileSet>().transferToSpecification(criteriaTypes, false);
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
`files.size() > 0` can be replaced with '!files.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
    public BlobFileInfo getLatestAgentPackage() {
        List<BlobFileInfo> files = blobFileInfoRepository.queryBlobFileInfoByFileTypeOrderByCreateTimeDesc(BlobFileInfo.FileType.AGENT_PACKAGE);
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
`attachments.size() == 0` can be replaced with 'attachments.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java

    public void saveAttachments(String entityId, EntityFileRelation.EntityType entityType, List<BlobFileInfo> attachments) {
        if (attachments == null || attachments.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`result.getAttachments().size() > 0` can be replaced with '!result.getAttachments().isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/service/TestTaskEngineService.java`
#### Snippet
```java

    private void processAndSaveDeviceTestResultBlobUrl(TestRun result) {
        Assert.isTrue(result.getAttachments().size() > 0, "deviceTestResultBlobUrl should not null");
        String deviceTestResultBlobUrl = result.getAttachments().get(0).getBlobUrl();
        String fileName = result.getAttachments().get(0).getFileName();
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
`crashStack.size() > 0` can be replaced with '!crashStack.isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
            testRun.addNewTimeTag(ongoingSmartTest.getTitle() + ".fail", System.currentTimeMillis() - recordingStartTimeMillis);
            testRun.oneMoreFailure();
        } else if (crashStack != null && crashStack.size() > 0) {
            ongoingSmartTest.setStatusCode(AndroidTestUnit.StatusCodes.FAILURE);
            ongoingSmartTest.setSuccess(false);
```

### SizeReplaceableByIsEmpty
`agentDeviceGroup.getDevices().size() > 0` can be replaced with '!agentDeviceGroup.getDevices().isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceManageController.java`
#### Snippet
```java
        }
        deviceGroupList = deviceGroupList.stream()
                .filter(agentDeviceGroup -> agentDeviceGroup.getDevices() != null && agentDeviceGroup.getDevices().size() > 0)
                .sorted(Comparator.comparing(AgentDeviceGroup::getAgentDeviceType)
                        .thenComparing((a, b) -> b.getDevices().size() - a.getDevices().size()))
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
`exceptions.size() > 0` can be replaced with '!exceptions.isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunner.java`
#### Snippet
```java
            testRun.getLogger().info("Start executing tearDown actions.");
            List<Exception> exceptions = actionExecutor.doActions(deviceManager, deviceInfo, testRun.getLogger(), testTask.getDeviceActions(), DeviceAction.When.TEAR_DOWN);
            if (exceptions.size() > 0) {
                testRun.getLogger().error("Execute actions failed when tearDown!", exceptions.get(0));
            }
```

### SizeReplaceableByIsEmpty
`exceptions.size() == 0` can be replaced with 'exceptions.isEmpty()'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunner.java`
#### Snippet
```java
            testRun.getLogger().info("Start executing setUp actions.");
            List<Exception> exceptions = actionExecutor.doActions(deviceManager, deviceInfo, testRun.getLogger(), testTask.getDeviceActions(), DeviceAction.When.SET_UP);
            Assert.isTrue(exceptions.size() == 0, () -> exceptions.get(0));
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
`testInfo.getAttachments().size() > 0` can be replaced with '!testInfo.getAttachments().isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestDetailController.java`
#### Snippet
```java

            //use CDN url to access video
            if (testInfo.getAttachments() != null && testInfo.getAttachments().size() > 0) {
                String CDNUrl = testInfo.getAttachments().get(0).getCDNUrl();
                if (CDNUrl != null && !"".equals(CDNUrl)) {
```

### SizeReplaceableByIsEmpty
`testInfo.getAttachments().size() > 0` can be replaced with '!testInfo.getAttachments().isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestDetailController.java`
#### Snippet
```java

            //use CDN url to access video
            if (testInfo.getAttachments() != null && testInfo.getAttachments().size() > 0) {
                String CDNUrl = testInfo.getAttachments().get(0).getCDNUrl();
                if (CDNUrl != null && !"".equals(CDNUrl)) {
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
    public Page<TestTask> getTestTasks(int page, int pageSize, List<CriteriaType> queryParams) {
        Specification<TestTask> spec = null;
        if (queryParams != null && queryParams.size() > 0) {
            spec = new CriteriaTypeUtil<TestTask>().transferToSpecification(queryParams, false);
        }
```

### SizeReplaceableByIsEmpty
`apiConfig.neededPermissions.size() > 0` can be replaced with '!apiConfig.neededPermissions.isEmpty()'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java

        try {
            if (apiConfig.neededPermissions.size() > 0) {
                jsonElement.add("neededPermissions", GSON.toJsonTree(apiConfig.neededPermissions));
            }
```

### SizeReplaceableByIsEmpty
`testWindowsApp.length() > 0` can be replaced with '!testWindowsApp.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/WindowsDeviceManager.java`
#### Snippet
```java
                    WindowsDriver windowsDriver;
                    testWindowsApp = driverInfo.getLauncherApp();
                    if (testWindowsApp.length() > 0 && !testWindowsApp.equalsIgnoreCase("root")) {
                        windowsDriver = appiumServerManager.getWindowsAppDriver(testWindowsApp, reportLogger);
                    } else {
```

### SizeReplaceableByIsEmpty
`testWindowsApp.length() > 0` can be replaced with '!testWindowsApp.isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/WindowsDeviceManager.java`
#### Snippet
```java
        } finally {
            appiumServerManager.quitAndroidDriver(deviceInfo, reportLogger);
            if (testWindowsApp.length() > 0) {
                appiumServerManager.quitWindowsAppDriver(testWindowsApp, reportLogger);
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
                for (BlobFileInfo fileInfo : deviceTestResult.attachments) {
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

## RuleId[ruleID=TrivialStringConcatenation]
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
                        "ed. actionId:" + actionInfo.getId() + "/t" + "actionType:" + actionInfo.getActionType());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
                throw new IllegalStateException("action fail" +
                        "" +
                        "" +
                        "ed. actionId:" + actionInfo.getId() + "/t" + "actionType:" + actionInfo.getActionType());

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends BlobFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
    }

    public List<BlobFileInfo> filterAttachments(@NotNull List<BlobFileInfo> attachments, @NotNull String fileType) {
        List<BlobFileInfo> data = new ArrayList<>();
        for (BlobFileInfo attachment : attachments) {
```

### BoundedWildcard
Can generalize to `? extends BlobFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
    }

    public BlobFileInfo filterFirstAttachment(@NotNull List<BlobFileInfo> attachments, @NotNull String fileType) {
        for (BlobFileInfo attachment : attachments) {
            if (fileType.equals(attachment.getFileType())) {
```

### BoundedWildcard
Can generalize to `? extends BlobFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
    }

    public void saveRelations(String entityId, EntityFileRelation.EntityType entityType, List<BlobFileInfo> attachments) {
        if (attachments == null) {
            return;
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
Can generalize to `? extends DeviceInfo`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/DeviceTaskControlExecutor.java`
#### Snippet
```java
    }

    public DeviceTaskControl runForAllDeviceAsync(Collection<DeviceInfo> allDevices, DeviceTask task, TaskCompletion taskCompletion, boolean logging, boolean forceForTesting) {
        int activeDevice = 0;
        log.warn("All device count {}", allDevices.size());
```

### BoundedWildcard
Can generalize to `? extends File`
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
public class FFmpegConcatUtil {

    public static File concatVideos(List<File> videos, File outputDir, Logger logger) {
        if (videos.isEmpty()) {
            return null;
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

## RuleId[ruleID=NullableProblems]
### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String permissionName, @Nullable Logger logger);

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull Logger logger);

    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger) throws InstallException;
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String permissionName, @Nullable Logger logger);

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull Logger logger);

    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger) throws InstallException;
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String permissionName, @Nullable Logger logger);

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull Logger logger);

    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger) throws InstallException;
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void wakeUpDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String permissionName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract boolean grantProjectionAndBatteryPermission(@NotNull DeviceInfo deviceInfo, @NotNull String recordPackageName, @Nullable Logger logger);

    public abstract void testDeviceSetup(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger) throws IOException;

    public abstract void removeFileInDevice(DeviceInfo deviceInfo, String pathOnDevice, Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    }

    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName, @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    }

    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName, @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    }

    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName, @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    }

    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName, @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract Set<DeviceInfo> getActiveDeviceList(@Nullable Logger logger);

    public abstract File getScreenShot(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger) throws Exception;

    public File getScreenShotWithStrategy(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger, @NotNull AgentUser.BatteryStrategy batteryStrategy) throws Exception {
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val, @Nullable Logger logger);

    public abstract void updateIsPrivateByDeviceSerial(@NotNull String deviceSerial, @NotNull Boolean isPrivate);

    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String defaultActivity, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val, @Nullable Logger logger);

    public abstract void updateIsPrivateByDeviceSerial(@NotNull String deviceSerial, @NotNull Boolean isPrivate);

    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String defaultActivity, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName, @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val, @Nullable Logger logger);

    public abstract void updateIsPrivateByDeviceSerial(@NotNull String deviceSerial, @NotNull Boolean isPrivate);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract LogCollector getLogCollector(@NotNull DeviceInfo deviceInfo, @NotNull String pkgName, @NotNull TestRun testRun, @NotNull Logger logger);

    public abstract void setProperty(@NotNull DeviceInfo deviceInfo, @NotNull String property, String val, @Nullable Logger logger);

    public abstract void updateIsPrivateByDeviceSerial(@NotNull String deviceSerial, @NotNull Boolean isPrivate);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract boolean grantProjectionAndBatteryPermission(@NotNull DeviceInfo deviceInfo, @NotNull String recordPackageName, @Nullable Logger logger);

    public abstract void testDeviceSetup(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger) throws IOException;
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract boolean grantProjectionAndBatteryPermission(@NotNull DeviceInfo deviceInfo, @NotNull String recordPackageName, @Nullable Logger logger);

    public abstract void testDeviceSetup(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger) throws IOException;
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String defaultActivity, @Nullable Logger logger);

    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract boolean grantProjectionAndBatteryPermission(@NotNull DeviceInfo deviceInfo, @NotNull String recordPackageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String defaultActivity, @Nullable Logger logger);

    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract boolean grantProjectionAndBatteryPermission(@NotNull DeviceInfo deviceInfo, @NotNull String recordPackageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    }

    public abstract void resetDeviceByTestId(@NotNull String testId, @Nullable Logger logger);

    public abstract void wakeUpDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void pullFileFromDevice(@NotNull DeviceInfo deviceInfo, @NotNull String pathOnDevice, @Nullable Logger logger) throws Exception;

    public abstract ScreenRecorder getScreenRecorder(@NotNull DeviceInfo deviceInfo, @NotNull File folder, @Nullable Logger logger);

    public boolean grantAllTaskNeededPermissions(@NotNull DeviceInfo deviceInfo, @NotNull TestTask task, @Nullable Logger logger) {
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void pullFileFromDevice(@NotNull DeviceInfo deviceInfo, @NotNull String pathOnDevice, @Nullable Logger logger) throws Exception;

    public abstract ScreenRecorder getScreenRecorder(@NotNull DeviceInfo deviceInfo, @NotNull File folder, @Nullable Logger logger);

    public boolean grantAllTaskNeededPermissions(@NotNull DeviceInfo deviceInfo, @NotNull TestTask task, @Nullable Logger logger) {
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void resetDeviceByTestId(@NotNull String testId, @Nullable Logger logger);

    public abstract void wakeUpDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull Logger logger);

    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger) throws InstallException;

    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger) throws InstallException;
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull Logger logger);

    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger) throws InstallException;

    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger) throws InstallException;
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger) throws InstallException;

    public abstract void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract void pushFileToDevice(@NotNull DeviceInfo deviceInfo, @NotNull String pathOnAgent, @NotNull String pathOnDevice, @Nullable Logger logger) throws Exception;
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger) throws InstallException;

    public abstract void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);

    public abstract void pushFileToDevice(@NotNull DeviceInfo deviceInfo, @NotNull String pathOnAgent, @NotNull String pathOnDevice, @Nullable Logger logger) throws Exception;
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger) throws InstallException;

    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger) throws InstallException;

    public abstract void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract boolean installApp(@NotNull DeviceInfo deviceInfo, @NotNull String packagePath, @Nullable Logger logger) throws InstallException;

    public abstract boolean uninstallApp(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger) throws InstallException;

    public abstract void resetPackage(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void updateIsPrivateByDeviceSerial(@NotNull String deviceSerial, @NotNull Boolean isPrivate);

    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String defaultActivity, @Nullable Logger logger);

    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void updateIsPrivateByDeviceSerial(@NotNull String deviceSerial, @NotNull Boolean isPrivate);

    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String defaultActivity, @Nullable Logger logger);

    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void updateIsPrivateByDeviceSerial(@NotNull String deviceSerial, @NotNull Boolean isPrivate);

    public abstract boolean setDefaultLauncher(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String defaultActivity, @Nullable Logger logger);

    public abstract boolean isAppInstalled(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @Nullable Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String permissionName, @Nullable Logger logger);

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String permissionName, @Nullable Logger logger);

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull Logger logger);
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull String permissionName, @Nullable Logger logger);

    public abstract void addToBatteryWhiteList(@NotNull DeviceInfo deviceInfo, @NotNull String packageName, @NotNull Logger logger);
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java

public class FileUtil {
    private final static SimpleDateFormat format = new SimpleDateFormat("yyyy" + File.separator + "MM" + File.separator + "dd");
    private static final Pattern paramKeyMatch = Pattern.compile("\\$\\{(\\w+)}");

```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
public class WindowsBatteryInspector implements PerformanceInspector {
    private final static String RAW_RESULT_FILE_NAME_FORMAT = "%s_%s.csv";
    private final static String COMMAND_FORMAT = "Start-Process -FilePath Powershell.exe -Verb RunAs -ArgumentList " +
            "'-command \"powercfg /srumutil /OUTPUT %s /CSV \"'";

```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
 */
public class WindowsBatteryInspector implements PerformanceInspector {
    private final static String RAW_RESULT_FILE_NAME_FORMAT = "%s_%s.csv";
    private final static String COMMAND_FORMAT = "Start-Process -FilePath Powershell.exe -Verb RunAs -ArgumentList " +
            "'-command \"powercfg /srumutil /OUTPUT %s /CSV \"'";
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
Missorted modifiers `abstract public`
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    abstract public void quitMobileAppiumDriver(DeviceInfo deviceInfo, Logger logger);

    abstract public void execCommandOnDevice(DeviceInfo deviceInfo, String command, Logger logger);
    
    protected boolean isAppRunningForeground(DeviceInfo deviceInfo, String packageName, Logger logger) {
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    public abstract void testDeviceUnset(DeviceInfo deviceInfo, Logger logger);

    abstract public WebDriver getMobileAppiumDriver(DeviceInfo deviceInfo, Logger logger);

    abstract public void quitMobileAppiumDriver(DeviceInfo deviceInfo, Logger logger);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
    abstract public WebDriver getMobileAppiumDriver(DeviceInfo deviceInfo, Logger logger);

    abstract public void quitMobileAppiumDriver(DeviceInfo deviceInfo, Logger logger);

    abstract public void execCommandOnDevice(DeviceInfo deviceInfo, String command, Logger logger);
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
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorder.java`
#### Snippet
```java

    @Override
    abstract public boolean finishRecording();
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

## RuleId[ruleID=IgnoreResultOfCall]
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

            //If necessary, the decompressed files should be deleted
            file.delete();
            file.getParentFile().delete();

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
            //If necessary, the decompressed files should be deleted
            file.delete();
            file.getParentFile().delete();

            res.put(ParserKey.APP_NAME, name);
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
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        }
        saveRelation(entityId, entityType, blobFileInfo);
        file.delete();
        return blobFileInfo;
    }
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
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
                out.close();
                in.close();
                agentConfigFile.delete();
            } catch (Exception e) {
                e.printStackTrace();
```

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

## RuleId[ruleID=DefaultAnnotationParam]
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
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceGroupController.java`
#### Snippet
```java
    @PostMapping(value = {"/api/deviceGroup/deleteRelation"}, produces = MediaType.APPLICATION_JSON_VALUE)
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

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `getElementInfo()` is identical to its super method
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    }

    public String getElementInfo(){
        return ToStringBuilder.reflectionToString(this);
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

### RedundantMethodOverride
Method `setupDevice()` only delegates to its super method
in `common/src/main/java/com/microsoft/hydralab/common/screen/AppiumE2ETestRecorder.java`
#### Snippet
```java

    @Override
    public void setupDevice() {
        super.setupDevice();
    }
```

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

## RuleId[ruleID=SimplifyOptionalCallChains]
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

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `common/src/main/java/com/microsoft/hydralab/common/screen/AppiumE2ETestRecorder.java`
#### Snippet
```java
    @Override
    public void startRecord(int maxTime) {
        super.fileName = Const.ScreenRecoderConfig.PHONE_FILE_NAME;
        logger.info("Start phone record screen");
        super.startRecord(maxTime);
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceManageController.java`
#### Snippet
```java
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
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

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
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

### ReplaceAssignmentWithOperatorAssignment
`output = output + String.format("\n##[section]\ttestApkPath: %s, testSuiteName: %s", testAppPath, te...` could be simplified to 'output += String.format("\\n##\[section\]\\ttestApkPath: %s, testSuiteName: %s", testAppPath, testSuiteName)'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
            case "APPIUM":
            case "APPIUM_CROSS":
                output = output + String.format("\n##[section]\ttestApkPath: %s, testSuiteName: %s", testAppPath, testSuiteName);
                break;
            case "T2C_JSON":
```

### ReplaceAssignmentWithOperatorAssignment
`output = output + String.format("\n##[section]\ttestApkPath: %s", testAppPath)` could be simplified to 'output += String.format("\\n##\[section\]\\ttestApkPath: %s", testAppPath)'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
                break;
            case "T2C_JSON":
                output = output + String.format("\n##[section]\ttestApkPath: %s", testAppPath);
                break;
            case "SMART":
```

### ReplaceAssignmentWithOperatorAssignment
`output = output + String.format("\n##[section]\tattachmentConfigPath: %s", attachmentConfigPath)` could be simplified to 'output += String.format("\\n##\[section\]\\tattachmentConfigPath: %s", attachmentConfigPath)'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        }
        if (StringUtils.isNotEmpty(attachmentConfigPath)) {
            output = output + String.format("\n##[section]\tattachmentConfigPath: %s", attachmentConfigPath);
        }
        if (StringUtils.isNotEmpty(tag)) {
```

### ReplaceAssignmentWithOperatorAssignment
`output = output + String.format("\n##[section]\ttag: %s", tag)` could be simplified to 'output += String.format("\\n##\[section\]\\ttag: %s", tag)'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        }
        if (StringUtils.isNotEmpty(tag)) {
            output = output + String.format("\n##[section]\ttag: %s", tag);
        }

```

## RuleId[ruleID=NestedAssignment]
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
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
            int len = 0;
            byte[] buffer = new byte[1024 * 10];
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
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
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSDeviceWatcher.java`
#### Snippet
```java
            BufferedReader bufferedReader = new BufferedReader(isr);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (iosDeviceManagerRef.get() == null) break;
                if (line.contains("MessageType")) {
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
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

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
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
Field `recordProcess` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
    private static File scriptFile;
    private final Timer timer = new Timer();
    private Process recordProcess;

    public IOSAppiumScreenRecorderForWindows(DeviceManager deviceManager, DeviceInfo info, String recordDir) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordingStartTimeMillis` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
    private final AnimatedGifEncoder e = new AnimatedGifEncoder();
    private final String pkgName;
    private long recordingStartTimeMillis;
    private int index;
    private File gifFile;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `deviceStateChangeWindowTime` is accessed in both synchronized and unsynchronized contexts
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/DeviceStabilityMonitor.java`
#### Snippet
```java
    private DeviceManager deviceManager;
    private int deviceStateChangeThreshold;
    private long deviceStateChangeWindowTime;
    private long deviceStateChangeRecoveryTime;
    private MeterRegistry meterRegistry;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordingStartTimeMillis` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
    private final DeviceManager deviceManager;
    ADBOperateUtil adbOperateUtil;
    private long recordingStartTimeMillis;
    private int index;
    private File gifFile;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordingStartTimeMillis` is accessed in both synchronized and unsynchronized contexts
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
    private final String pkgName;
    DeviceManager deviceManager;
    private long recordingStartTimeMillis;
    private int index;
    private File gifFile;
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

## RuleId[ruleID=EmptyMethod]
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

### EmptyMethod
Method only calls its super
in `common/src/main/java/com/microsoft/hydralab/common/screen/AppiumE2ETestRecorder.java`
#### Snippet
```java

    @Override
    public void setupDevice() {
        super.setupDevice();
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/entity/center/TestTaskSpec.java`
#### Snippet
```java
    public int deviceTestCount = 1;
    public String pipelineLink;
    public int retryTime = 0;
    public String frameworkType;
    public List<String> neededPermissions;
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
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
public class T2CAppiumUtils {
    static HashMap<String, String> keyToInfoMap = new HashMap<>();
    private static boolean isSelfTesting = false;

    public static WebElement findElement(BaseDriverController driver, BaseElementInfo element, Logger logger) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/DeviceInfo.java`
#### Snippet
```java
    private transient File screenshotImageFile;
    private transient File pcScreenshotImageFile;
    private transient boolean adbTimeout = false;

    public void setStatus(String status) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/blob/BlobStorageClient.java`
#### Snippet
```java
    public int fileLimitDay;
    public String cdnUrl;
    private boolean isConnected = false;

    public BlobStorageClient() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/blob/BlobStorageClient.java`
#### Snippet
```java
    Logger classLogger = LoggerFactory.getLogger(BlobStorageClient.class);
    private long SASExpiryUpdate;
    private SASData sasDataInUse = null;
    private SASData sasDataForUpdate = null;
    public int fileLimitDay;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/blob/BlobStorageClient.java`
#### Snippet
```java
    private long SASExpiryUpdate;
    private SASData sasDataInUse = null;
    private SASData sasDataForUpdate = null;
    public int fileLimitDay;
    public String cdnUrl;
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
in `common/src/main/java/com/microsoft/hydralab/common/screen/ADBScreenRecorder.java`
#### Snippet
```java
    private final Logger logger;
    private final File baseFolder;
    public int preSleepSeconds = 0;
    ADBOperateUtil adbOperateUtil;
    private Process recordingProcess;
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
Field initialization to `false` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/entity/center/SysTeam.java`
#### Snippet
```java
    private Date updateTime;
    @Transient
    private boolean manageable = false;
}

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
    private int addedFrameCount;
    private String currentTestName = "";
    private int currentTestIndex = 0;

    public Junit5Listener(DeviceManager deviceManager, DeviceInfo deviceInfo, TestRun testRun, String pkgName, Logger logger) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
    private int index;
    private File gifFile;
    private boolean alreadyEnd = false;
    private AndroidTestUnit ongoingTestUnit;
    private int pid;
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
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
    private int index;
    private File gifFile;
    private boolean alreadyEnd = false;
    private AndroidTestUnit ongoingTestUnit;
    private int numTests;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
    private int addedFrameCount;
    private String currentTestName = "";
    private int currentTestIndex = 0;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
    private int index;
    private File gifFile;
    private boolean alreadyEnd = false;
    private AndroidTestUnit ongoingTestUnit;
    private int numTests;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/t2c/T2CRunner.java`
#### Snippet
```java
    private String pkgName;
    String agentName;
    private int currentIndex = 0;

    public T2CRunner(DeviceManager deviceManager, TestTaskRunCallback testTaskRunCallback, String agentName) {
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
public class AppiumParam {
    String deviceId = null;
    String deviceName = null;
    String osVersion = null;
    int wdaPort = 8100;
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
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
    private static final int minWaitFinishSec = 15;

    private static boolean isTestRunningFailed = false;
    private static boolean isTestResultFailed = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java

    private static boolean isTestRunningFailed = false;
    private static boolean isTestResultFailed = false;

    public static void switchClientInstance(HydraLabAPIClient client) {
```

## RuleId[ruleID=HtmlWrongAttributeValue]
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

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
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

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `code` of exception class
in `common/src/main/java/com/microsoft/hydralab/common/util/HydraLabRuntimeException.java`
#### Snippet
```java

public class HydraLabRuntimeException extends RuntimeException {
    int code;

    public HydraLabRuntimeException(int code, String message) {
```

## RuleId[ruleID=SynchronizeOnThis]
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
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
#### Snippet
```java
            }
        }
        synchronized (this) {
            for (Map.Entry<String, DeviceInfo> infoEntry : iOSDeviceInfoMap.entrySet()) {
                String serialNum = infoEntry.getKey();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
#### Snippet
```java
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(iOSDeviceInfoMap.entrySet());
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
#### Snippet
```java
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(iOSDeviceInfoMap.entrySet());
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java

        logEnter("testRunEnded", elapsedTime, Thread.currentThread().getName());
        synchronized (this) {
            if (alreadyEnd) {
                return;
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
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/AndroidDeviceManager.java`
#### Snippet
```java
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(adbDeviceInfoMap.entrySet());
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/AndroidDeviceManager.java`
#### Snippet
```java
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(adbDeviceInfoMap.entrySet());
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
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java

    public void requestAllAgentDeviceListUpdate() {
        synchronized (this) {
            if (System.currentTimeMillis() - lastTimeRequest < TimeUnit.SECONDS.toMillis(5)) {
                return;
```

## RuleId[ruleID=DoubleBraceInitialization]
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
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSUtils.java`
#### Snippet
```java
    private static final Map<String, Integer> wdaPortMap = new ConcurrentHashMap<>();
    private static final Map<String, Integer> mjpegServerPortMap = new ConcurrentHashMap<>();
    private static final Set<Integer> PORT_BLACK_LIST = new HashSet<>() {{
        add(8080);  //Reserved port
        add(8100);  //for WDA
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `androidElement` initializer `null` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
        ArrayList<ActionInfo> caseList = new ArrayList<>();
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

```

### UnusedAssignment
Variable `edgeElement` initializer `null` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
        AndroidElementInfo androidElement = null;
        WindowsElementInfo windowsElement = null;
        EdgeElementInfo edgeElement = null;

        for (Iterator iterator = caseJsonArray.iterator(); iterator.hasNext(); ) {
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

### UnusedAssignment
Variable `elementFinded` initializer `null` is redundant
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java

    public static WebElement findElement(BaseDriverController driver, BaseElementInfo element, Logger logger) {
        WebElement elementFinded = null;
        if (element == null) return null;
        Map<String, String> keyToVal = element.getBasisSearchedBy();
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
Variable `len` initializer `0` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
            response.setHeader("Content-Disposition","attachment;filename=" + agentConfigFile.getName());
            out = response.getOutputStream();
            int len = 0;
            byte[] buffer = new byte[1024 * 10];
            while ((len = in.read(buffer)) != -1) {
```

### UnusedAssignment
Variable `entries` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
#### Snippet
```java
    public Set<DeviceInfo> getActiveDeviceList(Logger logger) {
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(iOSDeviceInfoMap.entrySet());
```

### UnusedAssignment
Variable `entries` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
#### Snippet
```java
    public Set<DeviceInfo> getDeviceList(Logger logger) {
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(iOSDeviceInfoMap.entrySet());
```

### UnusedAssignment
Variable `phoneVideoFile` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/screen/AppiumE2ETestRecorder.java`
#### Snippet
```java
    public boolean finishRecording() {
        File PCVideoFile = null;
        File phoneVideoFile = null;
        super.finishRecording();
        try {
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
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSUtils.java`
#### Snippet
```java

    public static void startIOSDeviceWatcher(Logger logger, IOSDeviceManager deviceManager) {
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
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/AndroidDeviceManager.java`
#### Snippet
```java
    public Set<DeviceInfo> getDeviceList(Logger logger) {
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(adbDeviceInfoMap.entrySet());
```

### UnusedAssignment
Variable `entries` initializer `null` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/AndroidDeviceManager.java`
#### Snippet
```java
    public Set<DeviceInfo> getActiveDeviceList(Logger logger) {
        Set<DeviceInfo> set = new HashSet<>();
        Set<Map.Entry<String, DeviceInfo>> entries = null;
        synchronized (this) {
            entries = new HashSet<>(adbDeviceInfoMap.entrySet());
```

### UnusedAssignment
Variable `shellProcess` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java

    public static void killProcessByCommandStr(String commandStr, Logger classLogger) {
        String shellProcess = "";
        String argName = "";
        String command = "";
```

### UnusedAssignment
Variable `argName` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
    public static void killProcessByCommandStr(String commandStr, Logger classLogger) {
        String shellProcess = "";
        String argName = "";
        String command = "";
        if (isConnectedToWindowsOS) {
```

### UnusedAssignment
Variable `command` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
        String shellProcess = "";
        String argName = "";
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
        String[] fullCommand = {shellProcess, argName, command};
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
Variable `shellProcess` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
    private static String[] getFullCommand(String command)
    {
        String shellProcess = "";
        String argName = "";

```

### UnusedAssignment
Variable `argName` initializer `""` is redundant
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
    {
        String shellProcess = "";
        String argName = "";

        if (isConnectedToWindowsOS) {
```

### UnusedAssignment
Variable `gifFile` initializer `null` is redundant
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
        ThreadParam.init(appiumParam, instrumentationArgs);
        reportLogger.info("ThreadParam init success, AppiumParam is {} , args is {}", appiumParam, LogUtils.scrubSensitiveArgs(instrumentationArgs.toString()));
        File gifFile = null;
        if (TestTask.TestFrameworkType.JUNIT5.equals(testTask.getFrameworkType())) {
            reportLogger.info("Start init listener");
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
Variable `app` initializer `null` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        }

        File app = null;
        File testApp = null;
        JsonArray attachmentInfos = new JsonArray();
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
Variable `updateMag` initializer `null` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
                    log.info("Session {} is saved to map as registered agent, associated agent {}", session.getId(), message.getBody());

                    AgentUpdateTask.UpdateMsg updateMag = null;
                    String agentMessage = "Agent Reconnected After Updating.Version is " + agentUser.getVersionName();
                    if (agentUser.getVersionName() == null || !agentUser.getVersionName().equals(tempTask.getTargetVersionName())) {
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        List<EntityFileRelation> fileRelations = entityFileRelationRepository.queryAllByEntityIdAndAndEntityType(entityId, entityType.typeName);
        for (EntityFileRelation fileRelation : fileRelations) {
            BlobFileInfo tempFileInfo = blobFileInfoRepository.findById(fileRelation.getFileId()).get();
            if (tempFileInfo != null) {
                result.add(tempFileInfo);
```

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
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        AgentSessionInfo agentSessionInfoByAgentId = getAgentSessionInfoByAgentId(agentId);
        Assert.notNull(agentSessionInfoByAgentId, "Agent Offline!");
        BlobFileInfo packageInfo = blobFileInfoRepository.findById(fileId).get();
        if (packageInfo == null || !BlobFileInfo.FileType.AGENT_PACKAGE.equals(packageInfo.getFileType())) {
            throw new Exception("Error file info!");
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `configMap == null` is always `false`
in `sdk/src/main/java/com/microsoft/hydralab/appium/ThreadParam.java`
#### Snippet
```java

    public static String getConfigString(String key) {
        if (configMap == null) {
            return null;
        }
```

### ConstantValue
Condition `appiumParam == null` is always `false`
in `sdk/src/main/java/com/microsoft/hydralab/appium/ThreadParam.java`
#### Snippet
```java

    public static AppiumParam getAppiumParam() {
        if (appiumParam == null) {
            return new AppiumParam();
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
Condition `tempFileInfo != null` is always `true`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        for (EntityFileRelation fileRelation : fileRelations) {
            BlobFileInfo tempFileInfo = blobFileInfoRepository.findById(fileRelation.getFileId()).get();
            if (tempFileInfo != null) {
                result.add(tempFileInfo);
            }
```

### ConstantValue
Condition `fileAvailableCallback != null` is always `true`
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
                    ThreadUtils.safeSleep(delayMillis);
                    File imageFile = getScreenShot(deviceInfo, logger);
                    if (fileAvailableCallback != null) {
                        fileAvailableCallback.onFileReady(imageFile);
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
Value `deviceInfo` is always 'null'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java
                                  int testTimeOutSec, Map<String, String> instrumentationArgs) {
        if (deviceInfo == null) {
            throw new RuntimeException("No such device: " + deviceInfo);
        }
        if (testTimeOutSec <= 0) {
```

### ConstantValue
Condition `fileAvailableCallback != null` is always `true`
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/WindowsDeviceManager.java`
#### Snippet
```java
                    ThreadUtils.safeSleep(delayMillis);
                    File imageFile = getPairScreenShot(deviceInfo, logger);
                    if (fileAvailableCallback != null) {
                        fileAvailableCallback.onFileReady(imageFile);
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
                if (totalWaitSecond > queueTimeoutSec) {
```

### ConstantValue
Value `finished` is always 'false'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        String currentStatus = "";

        while (!finished) {
            if (TestTask.TestStatus.WAITING.equals(currentStatus)) {
                if (totalWaitSecond > queueTimeoutSec) {
```

### ConstantValue
Value `finished` is always 'false'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java

        if (TestTask.TestStatus.WAITING.equals(currentStatus)) {
            assertTrue(finished, "Queuing timeout after waiting for " + queueTimeoutSec + " seconds! Test id", runningTest);
        } else if (TestTask.TestStatus.RUNNING.equals(currentStatus)) {
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Run timeout!");
```

### ConstantValue
Value `finished` is always 'false'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        } else if (TestTask.TestStatus.RUNNING.equals(currentStatus)) {
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Run timeout!");
            assertTrue(finished, "Running timeout after waiting for " + runTimeoutSec + " seconds! Test id", runningTest);
        }

```

### ConstantValue
Condition `packageInfo == null` is always `false`
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        Assert.notNull(agentSessionInfoByAgentId, "Agent Offline!");
        BlobFileInfo packageInfo = blobFileInfoRepository.findById(fileId).get();
        if (packageInfo == null || !BlobFileInfo.FileType.AGENT_PACKAGE.equals(packageInfo.getFileType())) {
            throw new Exception("Error file info!");
        }
```

## RuleId[ruleID=IOResource]
### IOResource
'URLClassLoader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
            logger.error("runAppiumTest error", e);
        }
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());
        Class<?> myClass;
        try {
```

### IOResource
'URLClassLoader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
            logger.error("runAppiumTest error", e);
        }
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());
        Class<?> myClass;
        try {
```

## RuleId[ruleID=OptionalIsPresent]
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

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `httpFailureRetryTimes` may be 'static'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            .build();

    private final int httpFailureRetryTimes = 10;

    public void checkCenterAlive(HydraLabAPIConfig apiConfig) {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CenterConstant` has only 'static' members, and lacks a 'private' constructor
in `center/src/main/java/com/microsoft/hydralab/center/util/CenterConstant.java`
#### Snippet
```java
package com.microsoft.hydralab.center.util;

public class CenterConstant {
    public static final String CENTER_FILE_BASE_DIR = "storage/test/package/";
    public static final String CENTER_TEMP_FILE_DIR = "storage/temp/";
```

### UtilityClassWithoutPrivateConstructor
Class `RegisterCenterApplication` has only 'static' members, and lacks a 'private' constructor
in `center/src/main/java/com/microsoft/hydralab/center/RegisterCenterApplication.java`
#### Snippet
```java
@EntityScan(basePackages = {"com.microsoft.hydralab.common.entity.center", "com.microsoft.hydralab.common.entity.common"})
@PropertySource(value = {"classpath:version.properties"}, encoding = "utf-8")
public class RegisterCenterApplication {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MachineInfoUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/MachineInfoUtils.java`
#### Snippet
```java
import java.util.Properties;

public class MachineInfoUtils {

    public static boolean isOnMacOS() {
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadPoolUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/ThreadPoolUtil.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolUtil {
    public static final ScheduledExecutorService TIMER_EXECUTOR = Executors.newScheduledThreadPool(20);
    private static final AtomicInteger SCREENSHOT_THREAD_NUMBER = new AtomicInteger(1);
```

### UtilityClassWithoutPrivateConstructor
Class `T2CAppiumUtils` has only 'static' members, and lacks a 'private' constructor
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
import java.util.Map;

public class T2CAppiumUtils {
    static HashMap<String, String> keyToInfoMap = new HashMap<>();
    private static boolean isSelfTesting = false;
```

### UtilityClassWithoutPrivateConstructor
Class `ImageUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/ImageUtil.java`
#### Snippet
```java
import java.io.IOException;

public class ImageUtil {
    public static BufferedImage scaleBufferedImage(BufferedImage before, double ratio) {
        int w = before.getWidth();
```

### UtilityClassWithoutPrivateConstructor
Class `TestRunThreadContext` has only 'static' members, and lacks a 'private' constructor
in `sdk/src/main/java/com/microsoft/hydralab/agent/runner/TestRunThreadContext.java`
#### Snippet
```java
 *
 */
public class TestRunThreadContext {
    private static final InheritableThreadLocal<ITestRun> testRunThreadLocal = new InheritableThreadLocal<>();

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
Class `ThreadParam` has only 'static' members, and lacks a 'private' constructor
in `sdk/src/main/java/com/microsoft/hydralab/appium/ThreadParam.java`
#### Snippet
```java
 * TODO: rename this to TestRunThreadContext and move this above to package com.microsoft.hydralab
 */
public class ThreadParam {
    private static final InheritableThreadLocal<AppiumParam> appiumParam = new InheritableThreadLocal<>();
    private static final InheritableThreadLocal<Map<String, String>> configMap = new InheritableThreadLocal<>();
```

### UtilityClassWithoutPrivateConstructor
Class `PkgUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/PkgUtil.java`
#### Snippet
```java
import java.util.zip.ZipFile;

public class PkgUtil {
    public static JSONObject analysisFile(File file, EntityFileRelation.EntityType entityType) {
        JSONObject res = new JSONObject();
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
Class `FlowUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/FlowUtil.java`
#### Snippet
```java
import java.util.concurrent.Callable;

public class FlowUtil {

    public static boolean retryWhenFalse(int count, Callable<Boolean> predicate) {
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
Class `FileUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/FileUtil.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class FileUtil {
    private final static SimpleDateFormat format = new SimpleDateFormat("yyyy" + File.separator + "MM" + File.separator + "dd");
    private static final Pattern paramKeyMatch = Pattern.compile("\\$\\{(\\w+)}");
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
Class `AgentApplication` has only 'static' members, and lacks a 'private' constructor
in `agent/src/main/java/com/microsoft/hydralab/agent/AgentApplication.java`
#### Snippet
```java
@PropertySource(value = {"classpath:version.properties"}, encoding = "utf-8")
@Slf4j
public class AgentApplication {

    public static void main(String[] args) {
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
Class `GraphAPIUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/GraphAPIUtils.java`
#### Snippet
```java
import java.util.concurrent.ExecutionException;

public class GraphAPIUtils {


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
Class `SerializeUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/util/SerializeUtil.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public class SerializeUtil {
    public static byte[] messageToByteArr(Message message) {
        return ZipUtil.gzip(JSON.toJSONString(message), StandardCharsets.UTF_8.toString());
```

### UtilityClassWithoutPrivateConstructor
Class `FFmpegConcatUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
import java.util.List;

public class FFmpegConcatUtil {

    public static File concatVideos(List<File> videos, File outputDir, Logger logger) {
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
Class `HydraLabClientUtils` has only 'static' members, and lacks a 'private' constructor
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
import static com.microsoft.hydralab.utils.CommonUtils.*;

public class HydraLabClientUtils {
    private static HydraLabAPIClient hydraLabAPIClient = new HydraLabAPIClient();
    private static final int waitStartSec = 30;
```

## RuleId[ruleID=DataFlowIssue]
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
Argument `webElement` might be null
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
        switch (ActionType) {
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
                    throw new IllegalArgumentException("Assert info is not defined. Please add argument 'attribute' and 'expectedValue' in the json. actionId: " + actionInfo.getId());
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
                    throw new IllegalArgumentException("Assert info is not defined. Please add argument 'attribute' and 'id' in the json. actionId: " + actionInfo.getId());
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
                    throw new IllegalArgumentException("Destination is not defined. Please add argument 'xVector' & 'yVector' or 'toElement' in the json. actionId: " + actionInfo.getId());
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
                    throw new IllegalArgumentException("Destination is not defined. Please add argument 'xVector' & 'yVector' or 'toElement' in the json. actionId: " + actionInfo.getId());
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
Argument `fileSuffix` might be null
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java

        if (StringUtils.isEmpty(newFileName)) {
            newFileName = filename.replace(fileSuffix, "") + "_" + System.currentTimeMillis() % 10000 + "_" + fileSuffix;
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
                && newFileInfo.getLoadDir().equals(oldFileInfo.getLoadDir())) {
            return true;
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
Method invocation `close` may produce `NullPointerException`
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
            response.flushBuffer();
            try {
                out.close();
                in.close();
                agentConfigFile.delete();
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
            try {
                out.close();
                in.close();
                agentConfigFile.delete();
            } catch (Exception e) {
```

### DataFlowIssue
Dereference of `appFiles` may produce `NullPointerException`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/PreInstallListener.java`
#### Snippet
```java
        File appDir = deviceManager.getPreAppDir();
        File[] appFiles = appDir.listFiles();
        for (File appFile : appFiles) {
            if (!appFile.isFile()) {
                continue;
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
The call to 'assertTrue' always fails, according to its method contracts
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java

        if (TestTask.TestStatus.WAITING.equals(currentStatus)) {
            assertTrue(finished, "Queuing timeout after waiting for " + queueTimeoutSec + " seconds! Test id", runningTest);
        } else if (TestTask.TestStatus.RUNNING.equals(currentStatus)) {
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Run timeout!");
```

### DataFlowIssue
The call to 'assertTrue' always fails, according to its method contracts
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        } else if (TestTask.TestStatus.RUNNING.equals(currentStatus)) {
            hydraLabAPIClient.cancelTestTask(apiConfig, testTaskId, "Run timeout!");
            assertTrue(finished, "Running timeout after waiting for " + runTimeoutSec + " seconds! Test id", runningTest);
        }

```

## RuleId[ruleID=StringOperationCanBeSimplified]
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

## RuleId[ruleID=RedundantCollectionOperation]
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

## RuleId[ruleID=CatchMayIgnoreException]
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

## RuleId[ruleID=UnnecessaryToStringCall]
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
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/AndroidDeviceManager.java`
#### Snippet
```java
        // classLogger.info("Dump on {}: {}", adbDeviceInfo.getSerialNum(), dump);
        if (StringUtils.isBlank(dump)) {
            logger.error("did not find element with text {} on {}", Arrays.asList(possibleTexts).toString(), deviceInfo.getSerialNum());
            return false;
        }
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `testFileSetRepository` accessed in synchronized context
in `center/src/main/java/com/microsoft/hydralab/center/service/TestFileSetService.java`
#### Snippet
```java
            return testFileSet;
        }
        testFileSet = testFileSetRepository.findById(fileSetId).orElse(null);
        if (testFileSet != null) {
            testFileSet.setAttachments(attachmentService.getAttachments(fileSetId, EntityFileRelation.EntityType.APP_FILE_SET));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `attachmentService` accessed in synchronized context
in `center/src/main/java/com/microsoft/hydralab/center/service/TestFileSetService.java`
#### Snippet
```java
        testFileSet = testFileSetRepository.findById(fileSetId).orElse(null);
        if (testFileSet != null) {
            testFileSet.setAttachments(attachmentService.getAttachments(fileSetId, EntityFileRelation.EntityType.APP_FILE_SET));
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
Non-private field `deviceStatusListenerManager` accessed in synchronized context
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
#### Snippet
```java
                if (removedInfo != null) {
                    if (DeviceInfo.OFFLINE.equals(info.getStatus())) {
                        deviceStatusListenerManager.onDeviceConnected(info);
                        info.setStatus(DeviceInfo.ONLINE);
//                        classLogger.info("Device " + serialNum + " updated");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `deviceStatusListenerManager` accessed in synchronized context
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
#### Snippet
```java
//                    classLogger.info("Device " + serialNum + " disconnected");
                    info.setStatus(DeviceInfo.OFFLINE);
                    deviceStatusListenerManager.onDeviceInactive(info);
                    getAppiumServerManager().quitIOSDriver(info, classLogger);
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `deviceStatusListenerManager` accessed in synchronized context
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
#### Snippet
```java
                // Add new connected devices
                iOSDeviceInfoMap.put(serialNum, info);
                deviceStatusListenerManager.onDeviceConnected(info);
            }
        }
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

## RuleId[ruleID=StringEqualsEmptyString]
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
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
#### Snippet
```java
    public boolean isAppInstalled(DeviceInfo deviceInfo, String packageName, Logger logger) {
        String result = IOSUtils.getAppList(deviceInfo.getSerialNum(), logger);
        if (result != null && !result.equals("")) {
            for (String line : result.split("\n")) {
                if (line.startsWith(packageName + " ")) {
```

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
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestDetailController.java`
#### Snippet
```java
            if (testInfo.getAttachments() != null && testInfo.getAttachments().size() > 0) {
                String CDNUrl = testInfo.getAttachments().get(0).getCDNUrl();
                if (CDNUrl != null && !"".equals(CDNUrl)) {
                    String originDomain = testInfo.getVideoBlobUrl().split("//")[1].split("/")[0];
                    videoRedirectUrl = videoRedirectUrl.replace(originDomain, CDNUrl);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestDetailController.java`
#### Snippet
```java
            if (testInfo.getAttachments() != null && testInfo.getAttachments().size() > 0) {
                String CDNUrl = testInfo.getAttachments().get(0).getCDNUrl();
                if (CDNUrl != null && !"".equals(CDNUrl)) {
                    String originDomain = testInfo.getVideoBlobUrl().split("//")[1].split("/")[0];
                    String videoRedirectUrl = testInfo.getVideoBlobUrl().replace(originDomain, CDNUrl);
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
in `center/src/main/java/com/microsoft/hydralab/center/controller/DeviceGroupController.java`
#### Snippet
```java
                                                  @QueryParam(value = "deviceIdentifier") String deviceIdentifier) {
        try {
            if (deviceIdentifier == null || "".equals(deviceIdentifier)) {
                return Result.error(HttpStatus.BAD_REQUEST.value(), "deviceIdentifier is required");
            }
```

## RuleId[ruleID=RedundantSuppression]
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

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
                    }
                }
                if (count <= 0) {
                    continue;
                }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
        }
        final String fileName = Const.ScreenRecoderConfig.DEFAULT_FILE_NAME;
        if (videos.size() <= 1) {
            File file = videos.get(0);
            Assert.isTrue(file.renameTo(new File(file.getParentFile(), fileName)), "rename fail");
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
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

## RuleId[ruleID=SystemOutErr]
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
            return false;
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
in `common/src/main/java/com/microsoft/hydralab/common/screen/AppiumE2ETestRecorder.java`
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
in `common/src/main/java/com/microsoft/hydralab/common/screen/AppiumE2ETestRecorder.java`
#### Snippet
```java
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/microsoft/hydralab/common/screen/AppiumE2ETestRecorder.java`
#### Snippet
```java
        }
        // Merge two videos side-by-side if exist
        System.out.println("-------------Merge two videos side-by-side-------------");
        String mergeDestinationPath = new File(baseFolder.getAbsolutePath(), Const.ScreenRecoderConfig.DEFAULT_FILE_NAME).getAbsolutePath();
        FFmpegConcatUtil.mergeVideosSideBySide(phoneVideoFile.getAbsolutePath(), PCVideoFile.getAbsolutePath(), mergeDestinationPath, logger);
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
                throw new RuntimeException(appFamilyName + " is not opened or failed activate it");
            }
            System.out.println("HexAppTopLevelWindowByKeyWord: " + hexAppTopLevelWindowByKeyWord);
            caps.setCapability("platformName", "Windows");
            caps.setCapability("deviceName", "WindowsPC");
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
            return false;
        }
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
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
    public boolean startJunit(File appiumJarFile, String appiumCommand, AppiumListener listener, Logger logger) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.addListener(listener);
        URL url = null;
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java

    public void parseCoordinates(String bounds){
        String[] boundsArray = bounds.split("\\[|\\]|,");
        String[] validArr = Arrays.stream(boundsArray).filter(StringUtils::isNotEmpty).toArray(String[]::new);
        Integer x1 = Integer.parseInt(validArr[0]);
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
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java
        String authCode = request.getHeader("Authorization");
        if (authCode != null) {
            authCode = authCode.replaceAll("Bearer ", "");
        }
        //check is ignore
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
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/AndroidDeviceManager.java`
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
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestDetailController.java`
#### Snippet
```java
                String CDNUrl = testInfo.getAttachments().get(0).getCDNUrl();
                if (CDNUrl != null && !"".equals(CDNUrl)) {
                    String originDomain = testInfo.getVideoBlobUrl().split("//")[1].split("/")[0];
                    videoRedirectUrl = videoRedirectUrl.replace(originDomain, CDNUrl);
                }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestDetailController.java`
#### Snippet
```java
                String CDNUrl = testInfo.getAttachments().get(0).getCDNUrl();
                if (CDNUrl != null && !"".equals(CDNUrl)) {
                    String originDomain = testInfo.getVideoBlobUrl().split("//")[1].split("/")[0];
                    String videoRedirectUrl = testInfo.getVideoBlobUrl().replace(originDomain, CDNUrl);
                    testInfo.setVideoBlobUrl(videoRedirectUrl);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        }
        int commitCountInt = Integer.parseInt(commitCount);
        commitMessage = commitMessage.replaceAll("[\\t\\n\\r]", " ");
        if (commitMessage.length() > message_length) {
            commitMessage = commitMessage.substring(0, message_length);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java
        StringBuilder argString = new StringBuilder();
        if (instrumentationArgs != null && !instrumentationArgs.isEmpty()) {
            instrumentationArgs.forEach((k, v) -> argString.append(" -e ").append(k.replaceAll("\\s|\"", "")).append(" ").append(v.replaceAll("\\s|\"", "")));
        }
        String commFormat;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java
        StringBuilder argString = new StringBuilder();
        if (instrumentationArgs != null && !instrumentationArgs.isEmpty()) {
            instrumentationArgs.forEach((k, v) -> argString.append(" -e ").append(k.replaceAll("\\s|\"", "")).append(" ").append(v.replaceAll("\\s|\"", "")));
        }
        String commFormat;
```

## RuleId[ruleID=ThrowablePrintStackTrace]
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
            originUrl = URLEncoder.encode(originUrl, FileUtil.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String loginUrl = authorizationUri + "?client_id=" + clientId + "&response_type=code&redirect_uri=" + redirectUri + "&response_mode=query&scope=" + scope + "&state=" + originUrl;
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
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
            return parseJson(json);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
            chooseActionType(driver, actionInfo, logger);
        } catch (Exception e) {
            e.printStackTrace();
            int index = actionInfo.getId();
            logger.error("doAction at step " + index + "with exception: " + e.getMessage());
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/BaseDriverController.java`
#### Snippet
```java
        } catch (Exception e) {
            logger.info("Can not find element by AccessibilityId: " + accessibilityId);
            e.printStackTrace();
        }
        return elementFound;
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
            res.put(ParserKey.VERSION, version);
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
in `agent/src/main/java/com/microsoft/hydralab/agent/service/AgentManageService.java`
#### Snippet
```java
            sendMessageToCenter(true, "Restart Agent Success! Check The Agent Log For Detail!", "", path);
        } catch (Exception e) {
            e.printStackTrace();
            sendMessageToCenter(false, "Exec Command Failed! Check The Agent Log For Detail!", e.getMessage(), path);
        }
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
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
            return false;
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
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal server error");
        } finally {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `center/src/main/java/com/microsoft/hydralab/center/controller/AgentManageController.java`
#### Snippet
```java
                agentConfigFile.delete();
            } catch (Exception e) {
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
in `common/src/main/java/com/microsoft/hydralab/common/screen/AppiumE2ETestRecorder.java`
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
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
                e.addFrame(ImgUtil.toBufferedImage(ImgUtil.scale(ImageIO.read(imagePNGFile), 0.3f)));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }), logger);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
                addedFrameCount++;
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }), logger);
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
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java
            }
        } catch (WebDriverException e) {
            e.printStackTrace();
            logger.info("Monkey Test Exit with Error, Quit the Driver. ");
            quitMobileAppiumDriver(deviceInfo, logger);
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
                edgeDriver = new EdgeDriver();
            } catch (Exception e) {
                e.printStackTrace();
                updateEdgeDriver(e.getMessage());
                edgeDriver = new EdgeDriver();
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
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
                addedFrameCount++;
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }), logger);
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
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForMac.java`
#### Snippet
```java
        } catch (Throwable e) {
            System.out.println("-------------------------------Fail to Stop recording, Ignore it to unblocking the following tests-----------------------------");
            e.printStackTrace();
            System.out.println("-------------------------------------------------------Ignore End--------------------------------------------------------------");
            return false;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
                addedFrameCount++;
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }), logger);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/monkey/AppiumMonkeyRunner.java`
#### Snippet
```java
                e.addFrame(ImgUtil.toBufferedImage(ImgUtil.scale(ImageIO.read(imagePNGFile), 0.3f)));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }), reportLogger);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/t2c/T2CRunner.java`
#### Snippet
```java
                e.addFrame(ImgUtil.toBufferedImage(ImgUtil.scale(ImageIO.read(imagePNGFile), 0.3f)));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }), reportLogger);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/monkey/AdbMonkeyRunner.java`
#### Snippet
```java
                e.addFrame(ImgUtil.toBufferedImage(ImgUtil.scale(ImageIO.read(imagePNGFile), 0.3f)));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }), logger);
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
in `common/src/main/java/com/microsoft/hydralab/common/screen/FFmpegConcatUtil.java`
#### Snippet
```java
            powerShellProcess.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
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
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/WindowsDeviceManager.java`
#### Snippet
```java
            ImageIO.write(imageNew, "jpg", outFile);
        } catch (Exception e) {
            e.printStackTrace();
            return PCFile;
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
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
    public void onError(Session session, Throwable error) {
        log.error("onError from session " + session.getId(), error);
        error.printStackTrace();
        deleteSessionAndDevice(session);
    }
```

## RuleId[ruleID=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
            }
            caseList.add(actionInfo);
            Comparator<ActionInfo> comparator = (o1, o2) -> {
                if (Objects.equals(o1.getId(), o2.getId())) {
                    throw new RuntimeException("Same Index Found In The Action Info");
```

## RuleId[ruleID=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java

    public void parseCoordinates(String bounds){
        String[] boundsArray = bounds.split("\\[|\\]|,");
        String[] validArr = Arrays.stream(boundsArray).filter(StringUtils::isNotEmpty).toArray(String[]::new);
        Integer x1 = Integer.parseInt(validArr[0]);
```

## RuleId[ruleID=ReplaceNullCheck]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `TestRunner()` of an abstract class should not be declared 'public'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunner.java`
#### Snippet
```java
    protected final ActionExecutor actionExecutor = new ActionExecutor();

    public TestRunner(DeviceManager deviceManager, TestTaskRunCallback testTaskRunCallback) {
        this.deviceManager = deviceManager;
        this.testTaskRunCallback = testTaskRunCallback;
```

### NonProtectedConstructorInAbstractClass
Constructor `IOSAppiumScreenRecorder()` of an abstract class should not be declared 'public'
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorder.java`
#### Snippet
```java


    public IOSAppiumScreenRecorder(DeviceManager deviceManager, DeviceInfo info, String recordDir) {
        this.deviceManager = deviceManager;
        this.deviceInfo = info;
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.merge' method call
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
            String groupDevices = String.join(",", agents.get(agentId));
            Assert.notNull(agentSessionInfoByAgentId, "Device/Agent Offline!");
            if (result.get(Const.Param.TEST_DEVICE_SN) == null) {
                result.put(Const.Param.TEST_DEVICE_SN, groupDevices);
            } else {
```

## RuleId[ruleID=Convert2Lambda]
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

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `common/src/main/java/com/microsoft/hydralab/common/management/DeviceManager.java`
#### Snippet
```java

    public void updateScreenshotImageAsyncDelay(@NotNull DeviceInfo deviceInfo, long delayMillis, @NotNull FileAvailableCallback fileAvailableCallback, @NotNull Logger logger) {
        ThreadPoolUtil.SCREENSHOT_EXECUTOR.execute(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/WindowsDeviceManager.java`
#### Snippet
```java
    @Override
    public void updateScreenshotImageAsyncDelay(@NotNull DeviceInfo deviceInfo, long delayMillis, @NotNull FileAvailableCallback fileAvailableCallback, @NotNull Logger logger) {
        ThreadPoolUtil.SCREENSHOT_EXECUTOR.execute(new Runnable() {
            @Override
            public void run() {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `originUrl`
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
        }
        if (queryString != null) {
            originUrl = originUrl + "?" + queryString;
        }
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `originUrl`
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
        }
        try {
            originUrl = URLEncoder.encode(originUrl, FileUtil.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
```

### AssignmentToMethodParameter
Assignment to method parameter `logger`
in `common/src/main/java/com/microsoft/hydralab/common/util/blob/BlobStorageClient.java`
#### Snippet
```java
        checkBlobStorageClientUpdate();
        if (logger == null) {
            logger = classLogger;
        }
        BlobContainerClient blobContainerClient = blobServiceClient.getBlobContainerClient(containerName);
```

### AssignmentToMethodParameter
Assignment to method parameter `packageFileName`
in `agent/src/main/java/com/microsoft/hydralab/agent/service/AgentManageService.java`
#### Snippet
```java
        sendMessageToCenter(true, "Init command Arr and check restart script exists or not.", "", path);

        packageFileName = packageFileName == null ? "" : packageFileName;
        if (deviceManager instanceof IOSDeviceManager && !((IOSDeviceManager) deviceManager).isDeviceConnectedToWindows()) {
            scriptPath = appOptions.getLocation() + File.separator + Const.AgentConfig.RESTART_FILE_MAC;
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
Assignment to method parameter `blobFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        for (BlobFileInfo tempFileInfo : tempFileInfos) {
            if (compareFileInfo(blobFileInfo, tempFileInfo)) {
                blobFileInfo = updateFileInfo(tempFileInfo, file, entityType, logger);
                flag = true;
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `blobFileInfo`
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        }
        if (!flag) {
            blobFileInfo = addFileInfo(blobFileInfo, file, entityType, logger);
        }
        saveRelation(entityId, entityType, blobFileInfo);
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

### AssignmentToMethodParameter
Assignment to method parameter `criteriaTypes`
in `center/src/main/java/com/microsoft/hydralab/center/controller/TestTaskController.java`
#### Snippet
```java
            // filter all Task Suite in TEAMs that user is in
            if (!sysUserService.checkUserAdmin(requestor)) {
                criteriaTypes = userTeamManagementService.formTeamIdCriteria(requestor.getTeamAdminMap());
                if (criteriaTypes.size() == 0) {
                    return Result.error(HttpStatus.UNAUTHORIZED.value(), "User belongs to no TEAM, please contact administrator for binding TEAM");
```

### AssignmentToMethodParameter
Assignment to method parameter `mailAddress`
in `center/src/main/java/com/microsoft/hydralab/center/controller/UserTeamController.java`
#### Snippet
```java
        if (StringUtils.isEmpty(mailAddress)) {
            // [All USERs] request for self default TEAM update
            mailAddress = requestor.getMailAddress();
            user = requestor;
        } else {
```

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
Assignment to method parameter `authToken`
in `center/src/main/java/com/microsoft/hydralab/center/service/AuthTokenService.java`
#### Snippet
```java

    public AuthToken saveAuthToken(AuthToken authToken) {
        authToken = authTokenRepository.save(authToken);
        return authToken;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `teamName`
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        }
        if (StringUtils.isEmpty(teamName)){
            teamName = requestor.getDefaultTeamName();
        }
        SysTeam team = sysTeamService.queryTeamByName(teamName);
```

### AssignmentToMethodParameter
Assignment to method parameter `commitId`
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        }
        if (!LogUtils.isLegalStr(commitId, Const.RegexString.COMMON_STR, true)) {
            commitId = "commitId";
        }
        if (!LogUtils.isLegalStr(buildType, Const.RegexString.COMMON_STR, false)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buildType`
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        }
        if (!LogUtils.isLegalStr(buildType, Const.RegexString.COMMON_STR, false)) {
            buildType = "debug";
        }
        int commitCountInt = Integer.parseInt(commitCount);
```

### AssignmentToMethodParameter
Assignment to method parameter `commitMessage`
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        }
        int commitCountInt = Integer.parseInt(commitCount);
        commitMessage = commitMessage.replaceAll("[\\t\\n\\r]", " ");
        if (commitMessage.length() > message_length) {
            commitMessage = commitMessage.substring(0, message_length);
```

### AssignmentToMethodParameter
Assignment to method parameter `commitMessage`
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        commitMessage = commitMessage.replaceAll("[\\t\\n\\r]", " ");
        if (commitMessage.length() > message_length) {
            commitMessage = commitMessage.substring(0, message_length);
        }
        logger.info("commitId: {}, commitMessage: {}, buildType: {}, commitCount: {}", commitId, commitMessage, buildType, commitCountInt);// CodeQL [java/log-injection] False Positive: Has verified the string by regular expression
```

### AssignmentToMethodParameter
Assignment to method parameter `teamName`
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        }
        if (StringUtils.isEmpty(teamName)){
            teamName = requestor.getDefaultTeamName();
        }
        SysTeam team = sysTeamService.queryTeamByName(teamName);
```

### AssignmentToMethodParameter
Assignment to method parameter `testTimeOutSec`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java
        if (testTimeOutSec <= 0) {
            // the test should not last longer than
            testTimeOutSec = 45 * 60;
        }
        StringBuilder argString = new StringBuilder();
```

### AssignmentToMethodParameter
Assignment to method parameter `apiConfig`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java

        if (apiConfig == null) {
            apiConfig = new HydraLabAPIConfig();
        }

```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `deviceInfo`
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/IOSDeviceManager.java`
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

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `deviceInfo`
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/AndroidDeviceManager.java`
#### Snippet
```java
            return;
        }
        synchronized (deviceInfo) {
            deviceInfo.reset();
        }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `center/src/main/java/com/microsoft/hydralab/center/service/RolePermissionManagementService.java`
#### Snippet
```java
        Set<SysPermission> permissions = rolePermissionListMap.get(roleId);
        if (permissions == null){
            return null;
        }

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
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CJsonParser.java`
#### Snippet
```java
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/T2CAppiumUtils.java`
#### Snippet
```java
    public static WebElement findElement(BaseDriverController driver, BaseElementInfo element, Logger logger) {
        WebElement elementFinded = null;
        if (element == null) return null;
        Map<String, String> keyToVal = element.getBasisSearchedBy();
        if (keyToVal.get("accessibilityId") != null && keyToVal.get("accessibilityId").length() != 0) {
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/blob/BlobStorageClient.java`
#### Snippet
```java
    public BlobProperties downloadFileFromBlob(File downloadToFile, String containerName, String blobFilePath) {
        if (!isConnected) {
            return null;
        }
        checkBlobStorageClientUpdate();
```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/common/util/blob/BlobStorageClient.java`
#### Snippet
```java
    public String uploadBlobFromFile(File uploadFile, String containerName, String blobFilePath, Logger logger) {
        if (!isConnected) {
            return null;
        }
        checkBlobStorageClientUpdate();
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
in `sdk/src/main/java/com/microsoft/hydralab/appium/ThreadParam.java`
#### Snippet
```java
    public static String getConfigString(String key) {
        if (configMap == null) {
            return null;
        }
        Map<String, String> temp = configMap.get();
```

### ReturnNull
Return of `null`
in `sdk/src/main/java/com/microsoft/hydralab/appium/ThreadParam.java`
#### Snippet
```java
        Map<String, String> temp = configMap.get();
        if (temp == null) {
            return null;
        }
        return temp.get(key);
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
            }
        }
        return null;
    }

```

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
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/AndroidBatteryInfoResultParser.java`
#### Snippet
```java

    private AndroidBatteryInfo parseRawResultFile(File rawFile, String packageName) {
        if (!rawFile.isFile() || !rawFile.exists()) return null;

        AndroidBatteryInfo batteryInfo = new AndroidBatteryInfo();
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
in `common/src/main/java/com/microsoft/hydralab/common/management/impl/AndroidDeviceManager.java`
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
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunner.java`
#### Snippet
```java
            loadTestRunToCurrentThread(testRun);
            run(deviceInfo, testTask, testRun);
            return null;
        });
        ThreadPoolUtil.TEST_EXECUTOR.execute(futureTask);
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
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsMemoryResultParser.java`
#### Snippet
```java
    @Override
    public PerformanceTestResult parse(PerformanceTestResult performanceTestResult) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/WindowsBatteryResultParser.java`
#### Snippet
```java
    @Override
    public PerformanceTestResult parse(PerformanceTestResult performanceTestResult) {
        return null;
    }

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
        final String fileName = Const.ScreenRecoderConfig.DEFAULT_FILE_NAME;
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
        user.setDeviceType(agentUser.getDeviceType());
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `loginUrl` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
            e.printStackTrace();
        }
        String loginUrl = authorizationUri + "?client_id=" + clientId + "&response_type=code&redirect_uri=" + redirectUri + "&response_mode=query&scope=" + scope + "&state=" + originUrl;
        return loginUrl;
    }
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
Local variable `authTokens` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/AuthTokenService.java`
#### Snippet
```java

    public List<AuthToken> queryAuthTokenByName(String name) {
        List<AuthToken> authTokens = authTokenRepository.queryByCreator(name);

        return authTokens;
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
Local variable `jsonObject` is redundant
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
            String string = body.string();
            printlnf("RunningTestJson: %s", maskCred(string));
            JsonObject jsonObject = GSON.fromJson(string, JsonObject.class);

            return jsonObject;
```

## RuleId[ruleID=WaitNotInLoop]
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

## RuleId[ruleID=ThreadStartInConstruction]
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

