# shenyu 
 
# Bad smells
I found 762 bad smells with 33 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 176 | false |
| RuleId[ruleID=ReturnNull] | 111 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 60 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 53 | false |
| RuleId[ruleID=UseOfPropertiesAsHashtable] | 48 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 38 | false |
| RuleId[ruleID=DataFlowIssue] | 26 | false |
| RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod] | 20 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 14 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 12 | false |
| RuleId[ruleID=RedundantImplements] | 12 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 10 | true |
| RuleId[ruleID=EmptyMethod] | 10 | false |
| RuleId[ruleID=ConstantValue] | 10 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 10 | true |
| RuleId[ruleID=RedundantMethodOverride] | 9 | false |
| RuleId[ruleID=CodeBlock2Expr] | 9 | false |
| RuleId[ruleID=NullableProblems] | 8 | false |
| RuleId[ruleID=SynchronizeOnThis] | 8 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 8 | true |
| RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator] | 7 | false |
| RuleId[ruleID=RedundantLengthCheck] | 7 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 7 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 7 | false |
| RuleId[ruleID=RedundantSuppression] | 7 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 6 | false |
| RuleId[ruleID=NestedAssignment] | 6 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 4 | false |
| RuleId[ruleID=InstanceofCatchParameter] | 4 | false |
| RuleId[ruleID=AssignmentToLambdaParameter] | 4 | false |
| RuleId[ruleID=MissortedModifiers] | 3 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 3 | false |
| RuleId[ruleID=ExcessiveLambdaUsage] | 3 | false |
| RuleId[ruleID=DoubleBraceInitialization] | 3 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 3 | false |
| RuleId[ruleID=Convert2MethodRef] | 3 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 3 | true |
| RuleId[ruleID=UnstableApiUsage] | 3 | false |
| RuleId[ruleID=UnnecessaryStringEscape] | 2 | false |
| RuleId[ruleID=UnnecessaryReturn] | 2 | true |
| RuleId[ruleID=UnusedAssignment] | 2 | false |
| RuleId[ruleID=MismatchedJavadocCode] | 2 | false |
| RuleId[ruleID=UtilityClassWithPublicConstructor] | 2 | false |
| RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter] | 2 | false |
| RuleId[ruleID=StaticCallOnSubclass] | 1 | false |
| RuleId[ruleID=RedundantClassCall] | 1 | false |
| RuleId[ruleID=Java8ListReplaceAll] | 1 | false |
| RuleId[ruleID=DuplicateBranchesInSwitch] | 1 | false |
| RuleId[ruleID=ThrowablePrintedToSystemOut] | 1 | false |
| RuleId[ruleID=InfiniteLoopStatement] | 1 | false |
| RuleId[ruleID=StringBufferReplaceableByStringBuilder] | 1 | false |
| RuleId[ruleID=CastConflictsWithInstanceof] | 1 | false |
| RuleId[ruleID=StringConcatenationInsideStringBufferAppend] | 1 | false |
| RuleId[ruleID=IOResource] | 1 | false |
| RuleId[ruleID=SocketResource] | 1 | false |
| RuleId[ruleID=FieldMayBeStatic] | 1 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 1 | false |
| RuleId[ruleID=ThreadRun] | 1 | false |
| RuleId[ruleID=SystemOutErr] | 1 | false |
## RuleId[ruleID=StaticCallOnSubclass]
### RuleId[ruleID=StaticCallOnSubclass]
Static method `startPage()` declared in class 'com.github.pagehelper.page.PageMethod' but referenced via subclass 'com.github.pagehelper.PageHelper'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/PageService.java`
#### Snippet
```java
    default PageInfo<R> searchByPage(final PageCondition<Q> pageCondition) {
        doConditionPreProcessing(pageCondition.getCondition());
        PageHelper.startPage(pageCondition.getPageNum(), pageCondition.getPageSize());
        return new PageInfo<>(searchByCondition(pageCondition.getCondition()));
    }
```

## RuleId[ruleID=RedundantClassCall]
### RuleId[ruleID=RedundantClassCall]
Redundant call to `isInstance()`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/support/SpringMvcContract.java`
#### Snippet
```java
    protected void processAnnotationOnMethod(final RequestTemplate requestTemplate, final Annotation methodAnnotation, final Method method) {

        if (!RequestMapping.class.isInstance(methodAnnotation)
                && !methodAnnotation.annotationType().isAnnotationPresent(RequestMapping.class)) {
            return;
```

## RuleId[ruleID=UnnecessaryStringEscape]
### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
        String replaceSql = boundSql.getSql().toLowerCase()
                .replace("`desc`", "\"desc\"")
                .replace("true", "\'true\'");
        // replace`
        replaceSql = replaceSql.replace("`", "");
```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
        String replaceSql = boundSql.getSql().toLowerCase()
                .replace("`desc`", "\"desc\"")
                .replace("true", "\'true\'");
        // replace`
        replaceSql = replaceSql.replace("`", "");
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `ShenyuClientShutdownHook.props` from instance context
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
        Runtime.getRuntime().addShutdownHook(new Thread(repository::close, name));
        LOG.info("Add hook {}", name);
        ShenyuClientShutdownHook.props = config.getProps();
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `hookNamePrefix` from instance context
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
            }

            hookNamePrefix = null;
            hookId = new AtomicInteger(0);
            props = null;
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `hookId` from instance context
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java

            hookNamePrefix = null;
            hookId = new AtomicInteger(0);
            props = null;
            delayHooks = null;
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `props` from instance context
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
            hookNamePrefix = null;
            hookId = new AtomicInteger(0);
            props = null;
            delayHooks = null;
            delayedHooks = null;
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `delayHooks` from instance context
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
            hookId = new AtomicInteger(0);
            props = null;
            delayHooks = null;
            delayedHooks = null;
        }
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `delayedHooks` from instance context
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
            props = null;
            delayHooks = null;
            delayedHooks = null;
        }
    }
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `uriRegisterDTO` from instance context
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/HttpClientRegisterRepository.java`
#### Snippet
```java
        }
        doRegister(registerDTO, Constants.URI_PATH, Constants.URI);
        uriRegisterDTO = registerDTO;
    }
    
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `dataMaskAlg` from instance context
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/AbstractLoggingPlugin.java`
#### Snippet
```java
            if (masked) {
                Collections.addAll(keywordSets, keywords.split(";"));
                dataMaskAlg = Optional.ofNullable(commonLoggingRuleHandle.getMaskType()).orElse(DataMaskEnums.MD5_ENCRYPT.getDataMaskAlg());
                LOG.info("current plugin:{}, keyword:{}, dataMaskAlg:{}", pluginEnum().getName(), keywords, dataMaskAlg);
            }
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `zombieRemovalTimes` from instance context
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/UpstreamCheckService.java`
#### Snippet
```java
        this.scheduledTime = Integer.parseInt(props.getProperty(Constants.SCHEDULED_TIME, Constants.SCHEDULED_TIME_VALUE));
        this.registerType = shenyuRegisterCenterConfig.getRegisterType();
        zombieRemovalTimes = Integer.parseInt(props.getProperty(Constants.ZOMBIE_REMOVAL_TIMES, Constants.ZOMBIE_REMOVAL_TIMES_VALUE));
        if (REGISTER_TYPE_HTTP.equalsIgnoreCase(registerType)) {
            setup();
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `supportSwaggerPluginMap` from instance context
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/LoadServiceDocEntryImpl.java`
#### Snippet
```java
            return Collections.emptyList();
        }
        supportSwaggerPluginMap = pluginDOList.stream().filter(Objects::nonNull)
            .collect(Collectors.toMap(PluginDO::getId, PluginDO::getName, (value1, value2) -> value1));

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `maskFlag` from instance context
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-console/src/main/java/org/apache/shenyu/plugin/logging/console/LoggingConsolePlugin.java`
#### Snippet
```java
        if (Objects.nonNull(commonLoggingRuleHandle)) {
            String keywords = commonLoggingRuleHandle.getKeyword();
            maskFlag = StringUtils.isNotBlank(keywords) && commonLoggingRuleHandle.getMaskStatus();
            if (maskFlag) {
                Collections.addAll(keywordSets, keywords.split(";"));
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `dataMaskAlg` from instance context
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-console/src/main/java/org/apache/shenyu/plugin/logging/console/LoggingConsolePlugin.java`
#### Snippet
```java
            if (maskFlag) {
                Collections.addAll(keywordSets, keywords.split(";"));
                dataMaskAlg = Optional.ofNullable(commonLoggingRuleHandle.getMaskType()).orElse(DataMaskEnums.MD5_ENCRYPT.getDataMaskAlg());
                keyWordMatch = new KeyWordMatch(keywordSets);
                LOG.info("current plugin:{}, keyword:{}, dataMaskAlg:{}", this.named(), keywords, dataMaskAlg);
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `keyWordMatch` from instance context
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-console/src/main/java/org/apache/shenyu/plugin/logging/console/LoggingConsolePlugin.java`
#### Snippet
```java
                Collections.addAll(keywordSets, keywords.split(";"));
                dataMaskAlg = Optional.ofNullable(commonLoggingRuleHandle.getMaskType()).orElse(DataMaskEnums.MD5_ENCRYPT.getDataMaskAlg());
                keyWordMatch = new KeyWordMatch(keywordSets);
                LOG.info("current plugin:{}, keyword:{}, dataMaskAlg:{}", this.named(), keywords, dataMaskAlg);
            }
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `MqttContext.leakDetectorLevel` from instance context
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/MqttContext.java`
#### Snippet
```java
     */
    public void setLeakDetectorLevel(final String leakDetectorLevel) {
        MqttContext.leakDetectorLevel = leakDetectorLevel;
    }
}
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `MqttContext.workerGroupThreadCount` from instance context
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/MqttContext.java`
#### Snippet
```java
     */
    public void setWorkerGroupThreadCount(final int workerGroupThreadCount) {
        MqttContext.workerGroupThreadCount = workerGroupThreadCount;
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `MqttContext.password` from instance context
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/MqttContext.java`
#### Snippet
```java
     */
    public void setPassword(final String password) {
        MqttContext.password = password;
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `MqttContext.port` from instance context
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/MqttContext.java`
#### Snippet
```java
     */
    public void setPort(final int port) {
        MqttContext.port = port;
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `MqttContext.userName` from instance context
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/MqttContext.java`
#### Snippet
```java
     */
    public void setUserName(final String userName) {
        MqttContext.userName = userName;
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `MqttContext.maxPayloadSize` from instance context
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/MqttContext.java`
#### Snippet
```java
     */
    public void setMaxPayloadSize(final int maxPayloadSize) {
        MqttContext.maxPayloadSize = maxPayloadSize;
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `MqttContext.bossGroupThreadCount` from instance context
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/MqttContext.java`
#### Snippet
```java
     */
    public void setBossGroupThreadCount(final int bossGroupThreadCount) {
        MqttContext.bossGroupThreadCount = bossGroupThreadCount;
    }

```

## RuleId[ruleID=Java8ListReplaceAll]
### RuleId[ruleID=Java8ListReplaceAll]
The loop can be replaced with 'List.replaceAll'
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-mask-api/src/main/java/org/apache/shenyu/plugin/logging/mask/api/utils/DataMaskUtils.java`
#### Snippet
```java
                                   final KeyWordMatch keyWordMatch, final String dataMaskAlg) {
        if (masked && keyWordMatch.matches(keyword)) {
            for (int i = 0; i < source.size(); i++) {
                String ret = DataMaskFactory.selectMask(source.get(i), dataMaskAlg);
                source.set(i, ret);
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `paramMap.keySet()` may be replaced with 'entrySet()' iteration
in `shenyu-plugin/shenyu-plugin-api/src/main/java/org/apache/shenyu/plugin/api/utils/BodyParamUtils.java`
#### Snippet
```java
    public static Pair<String[], Object[]> buildSingleParameter(final String body, final String parameterTypes) {
        final Map<String, Object> paramMap = GsonUtils.getInstance().toObjectMap(body);
        for (String key : paramMap.keySet()) {
            Object obj = paramMap.get(key);
            if (obj instanceof JsonObject) {
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `this.consulIndexes.keySet()` may be replaced with 'entrySet()' iteration
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-consul/src/main/java/org/apache/shenyu/register/client/server/consul/ShenyuConsulConfigWatch.java`
#### Snippet
```java
    private void watchConfigKeyValues() {
        if (this.running.get()) {
            for (String context : this.consulIndexes.keySet()) {
                try {
                    Long currentIndex = this.consulIndexes.get(context);
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `headers.keySet()` may be replaced with 'entrySet()' iteration
in `shenyu-sdk/shenyu-sdk-httpclient/src/main/java/org/apache/shenyu/sdk/httpclient/HttpShenyuSdkClient.java`
#### Snippet
```java

        Map<String, Collection<String>> headers = request.getHeaders();
        for (String name : headers.keySet()) {
            for (String value : headers.get(name)) {
                requestBuilder.addHeader(name, value);
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `this.consulIndexes.keySet()` may be replaced with 'entrySet()' iteration
in `shenyu-sync-data-center/shenyu-sync-data-consul/src/main/java/org/apache/shenyu/sync/data/consul/ConsulSyncDataService.java`
#### Snippet
```java
    private void watchConfigKeyValues() {
        if (this.running.get()) {
            for (String context : this.consulIndexes.keySet()) {
                try {
                    Long currentIndex = this.consulIndexes.get(context);
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `headers.keySet()` may be replaced with 'entrySet()' iteration
in `shenyu-sdk/shenyu-sdk-okhttp/src/main/java/org/apache/shenyu/sdk/okhttp/OkHttpShenyuSdkClient.java`
#### Snippet
```java
        Map<String, Collection<String>> headers = request.getHeaders();
        Request.Builder builder = new Request.Builder().url(url);
        for (String name : headers.keySet()) {
            for (String value : headers.get(name)) {
                builder.addHeader(name, value);
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `allDataMap.keySet()` may be replaced with 'Map.forEach()' iteration
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java
        allDataMap.put(update.getId(), update);
        Map<String, List<String>> relationMap = new ConcurrentHashMap<>();
        allDataMap.keySet().forEach(tagId -> {
            TagDO tagDO = allDataMap.get(tagId);
            if (CollectionUtils.isEmpty(relationMap.get(tagDO.getParentTagId()))) {
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### RuleId[ruleID=DuplicateBranchesInSwitch]
Branch in 'switch' is a duplicate of the default branch
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/Publish.java`
#### Snippet
```java
        switch (mqttQoS.value()) {
            case 0:
                break;

            case 1:
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`groupJson.size() > 0` can be replaced with '!groupJson.isEmpty()'
in `shenyu-sync-data-center/shenyu-sync-data-http/src/main/java/org/apache/shenyu/sync/data/http/HttpSyncDataService.java`
#### Snippet
```java
        }

        if (Objects.nonNull(groupJson) && groupJson.size() > 0) {
            // fetch group configuration async.
            ConfigGroupEnum[] changedGroups = GsonUtils.getGson().fromJson(groupJson, ConfigGroupEnum[].class);
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`shenyuValidation.length() > 0` can be replaced with '!shenyuValidation.isEmpty()'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        String shenyuValidation = url.getParameter("shenyuValidation");
        ValidatorFactory factory;
        if (shenyuValidation != null && shenyuValidation.length() > 0) {
            factory = Validation.byProvider((Class) ReflectUtils.forName(shenyuValidation)).configure().buildValidatorFactory();
        } else {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`files.size() > 0` can be replaced with '!files.isEmpty()'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
    public Response requestCall(final String url, final Map<String, ?> form, final Map<String, String> header,
        final HTTPMethod method, final List<UploadFile> files) throws IOException {
        if (Objects.nonNull(files) && files.size() > 0) {
            return requestFile(url, form, header, files);
        } else {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`tags.size() > 0` can be replaced with '!tags.isEmpty()'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/SwaggerDocParser.java`
#### Snippet
```java
    protected String buildModuleName(final JsonObject docInfo, final JsonObject docRoot, final String basePath) {
        JsonArray tags = docInfo.getAsJsonArray("tags");
        if (Objects.nonNull(tags) && tags.size() > 0) {
            return tags.get(0).getAsString();
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`PENDING_SYNC.size() == 0` can be replaced with 'PENDING_SYNC.isEmpty()'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/UpstreamCheckService.java`
#### Snippet
```java
    private void updateHandler(final String selectorId, final List<CommonUpstream> upstreamList, final List<CommonUpstream> successList) {
        //No node changes, including zombie node resurrection and live node death
        if (successList.size() == upstreamList.size() && PENDING_SYNC.size() == 0) {
            return;
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`successList.size() > 0` can be replaced with '!successList.isEmpty()'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/UpstreamCheckService.java`
#### Snippet
```java
        }
        removePendingSync(successList);
        if (successList.size() > 0) {
            UPSTREAM_MAP.put(selectorId, successList);
            updateSelectorHandler(selectorId, successList);
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`ZOMBIE_SET.size() > 0` can be replaced with '!ZOMBIE_SET.isEmpty()'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/UpstreamCheckService.java`
#### Snippet
```java
    private void scheduled() {
        try {
            if (ZOMBIE_SET.size() > 0) {
                ZOMBIE_SET.parallelStream().forEach(this::checkZombie);
            }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`UPSTREAM_MAP.size() > 0` can be replaced with '!UPSTREAM_MAP.isEmpty()'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/UpstreamCheckService.java`
#### Snippet
```java
                ZOMBIE_SET.parallelStream().forEach(this::checkZombie);
            }
            if (UPSTREAM_MAP.size() > 0) {
                UPSTREAM_MAP.forEach(this::check);
            }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`file.length() > 0` can be replaced with '!file.isEmpty()'
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/VersionUtils.java`
#### Snippet
```java
                file = file.substring(i + 1);
            }
            while (file.length() > 0 && !Character.isDigit(file.charAt(0))) {
                i = file.indexOf("-");
                if (i < 0) {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`shenyuValidation.length() > 0` can be replaced with '!shenyuValidation.isEmpty()'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        String shenyuValidation = url.getParameter("shenyuValidation");
        ValidatorFactory factory;
        if (shenyuValidation != null && shenyuValidation.length() > 0) {
            factory = Validation.byProvider((Class) ReflectUtils.forName(shenyuValidation)).configure().buildValidatorFactory();
        } else {
```

## RuleId[ruleID=UnnecessaryReturn]
### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/cache/ApplicationConfigCache.java`
#### Snippet
```java
                return;
            default:
                return;
        }
    }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `shenyu-plugin/shenyu-plugin-tars/src/main/java/org/apache/shenyu/plugin/tars/cache/ApplicationConfigCache.java`
#### Snippet
```java
                return;
            default:
                return;
        }
    }
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SofaParamResolveService`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-sofa/src/main/java/org/apache/shenyu/springboot/starter/plugin/sofa/SofaPluginConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public ShenyuPlugin sofaPlugin(final ObjectProvider<SofaParamResolveService> sofaParamResolveService) {
        return new SofaPlugin(new SofaProxyService(sofaParamResolveService.getIfAvailable()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RuleData`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/cache/BaseDataCache.java`
#### Snippet
```java
     * @param ruleDataList the rule data list
     */
    public void cleanRuleDataSelf(final List<RuleData> ruleDataList) {
        ruleDataList.forEach(this::removeRuleData);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorData`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/cache/BaseDataCache.java`
#### Snippet
```java
     * @param selectorDataList the selector data list
     */
    public void cleanSelectorDataSelf(final List<SelectorData> selectorDataList) {
        selectorDataList.forEach(this::removeSelectData);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginData`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/cache/BaseDataCache.java`
#### Snippet
```java
     * @param pluginDataList the plugin data list
     */
    public void cleanPluginDataSelf(final List<PluginData> pluginDataList) {
        pluginDataList.forEach(this::removePluginData);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends O`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/utils/BeanHolder.java`
#### Snippet
```java
    private volatile O o;

    public BeanHolder(final Supplier<O> supplier) {
        this.supplier = supplier;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MultiValueMap`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/utils/HttpParamConverter.java`
#### Snippet
```java
     * @return String string
     */
    public static <K, V> String toMap(final Supplier<MultiValueMap<K, V>> supplier) {
        return GsonUtils.getInstance().toJson(supplier.get().toSingleValueMap());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RuleData`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/AbstractShenyuPlugin.java`
#### Snippet
```java
    }

    private Pair<Boolean, RuleData> matchRule(final ServerWebExchange exchange, final Collection<RuleData> rules) {
        // RuleData ruleDataList = rules.stream().filter(rule -> filterRule(rule, exchange)).findFirst().orElse(null);
        List<RuleData> filterRuleData = rules.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorData`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/AbstractShenyuPlugin.java`
#### Snippet
```java
    }

    private Pair<Boolean, SelectorData> matchSelector(final ServerWebExchange exchange, final Collection<SelectorData> selectors) {
        List<SelectorData> filterCollectors = selectors.stream()
                .filter(selector -> selector.getEnabled() && filterSelector(selector, exchange))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginDataHandler`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/cache/CommonPluginDataSubscriber.java`
#### Snippet
```java
     * @param handlers the handlers
     */
    public void putExtendPluginDataHandler(final List<PluginDataHandler> handlers) {
        if (CollectionUtils.isEmpty(handlers)) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConditionData`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/condition/strategy/AndMatchStrategy.java`
#### Snippet
```java

    @Override
    public Boolean match(final List<ConditionData> conditionDataList, final ServerWebExchange exchange) {
        return conditionDataList
                .stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-plugin/shenyu-plugin-request/src/main/java/org/apache/shenyu/plugin/request/RequestPlugin.java`
#### Snippet
```java
    }

    private void replaceCookieKey(final Map.Entry<String, String> shenyuCookie, final MultiValueMap<String, HttpCookie> cookies) {
        List<HttpCookie> httpCookies = cookies.get(shenyuCookie.getKey());
        if (Objects.nonNull(httpCookies)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-plugin/shenyu-plugin-request/src/main/java/org/apache/shenyu/plugin/request/RequestPlugin.java`
#### Snippet
```java
    }

    private void fillCookie(final Map.Entry<String, String> shenyuCookie, final MultiValueMap<String, HttpCookie> cookies) {
        cookies.set(shenyuCookie.getKey(), new HttpCookie(shenyuCookie.getKey(), shenyuCookie.getValue()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super HttpCookie`
in `shenyu-plugin/shenyu-plugin-request/src/main/java/org/apache/shenyu/plugin/request/RequestPlugin.java`
#### Snippet
```java
    }

    private void fillCookie(final Map.Entry<String, String> shenyuCookie, final MultiValueMap<String, HttpCookie> cookies) {
        cookies.set(shenyuCookie.getKey(), new HttpCookie(shenyuCookie.getKey(), shenyuCookie.getValue()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-plugin/shenyu-plugin-request/src/main/java/org/apache/shenyu/plugin/request/RequestPlugin.java`
#### Snippet
```java
    }

    private void replaceParameterKey(final Map.Entry<String, String> shenyuParam, final MultiValueMap<String, String> queryParams) {
        List<String> values = queryParams.get(shenyuParam.getKey());
        if (Objects.nonNull(values)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-plugin/shenyu-plugin-request/src/main/java/org/apache/shenyu/plugin/request/RequestPlugin.java`
#### Snippet
```java
    }

    private void fillParameter(final Map.Entry<String, String> shenyuParam, final MultiValueMap<String, String> queryParams) {
        queryParams.set(shenyuParam.getKey(), shenyuParam.getValue());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-plugin/shenyu-plugin-request/src/main/java/org/apache/shenyu/plugin/request/RequestPlugin.java`
#### Snippet
```java
    }

    private void fillParameter(final Map.Entry<String, String> shenyuParam, final MultiValueMap<String, String> queryParams) {
        queryParams.set(shenyuParam.getKey(), shenyuParam.getValue());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConditionData`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/condition/strategy/OrMatchStrategy.java`
#### Snippet
```java

    @Override
    public Boolean match(final List<ConditionData> conditionDataList, final ServerWebExchange exchange) {
        return conditionDataList
                .stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `shenyu-plugin/shenyu-plugin-resilience4j/src/main/java/org/apache/shenyu/plugin/resilience4j/executor/RateLimiterExecutor.java`
#### Snippet
```java

    @Override
    public <T> Mono<T> run(final Mono<T> toRun, final Function<Throwable, Mono<T>> fallback, final Resilience4JConf conf) {
        RateLimiter rateLimiter = Resilience4JRegistryFactory.rateLimiter(conf.getId(), conf.getRateLimiterConfig());
        Mono<T> to = toRun.transformDeferred(RateLimiterOperator.of(rateLimiter));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Mono`
in `shenyu-plugin/shenyu-plugin-resilience4j/src/main/java/org/apache/shenyu/plugin/resilience4j/executor/RateLimiterExecutor.java`
#### Snippet
```java

    @Override
    public <T> Mono<T> run(final Mono<T> toRun, final Function<Throwable, Mono<T>> fallback, final Resilience4JConf conf) {
        RateLimiter rateLimiter = Resilience4JRegistryFactory.rateLimiter(conf.getId(), conf.getRateLimiterConfig());
        Mono<T> to = toRun.transformDeferred(RateLimiterOperator.of(rateLimiter));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConsulClient`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-consul/src/main/java/org/apache/shenyu/springboot/sync/data/consul/ConsulSyncDataConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SyncDataService syncDataService(final ObjectProvider<ConsulClient> consulClient,
                                           final ObjectProvider<ConsulConfig> consulConfig,
                                           final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConsulConfig`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-consul/src/main/java/org/apache/shenyu/springboot/sync/data/consul/ConsulSyncDataConfiguration.java`
#### Snippet
```java
    @Bean
    public SyncDataService syncDataService(final ObjectProvider<ConsulClient> consulClient,
                                           final ObjectProvider<ConsulConfig> consulConfig,
                                           final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                           final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginDataSubscriber`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-consul/src/main/java/org/apache/shenyu/springboot/sync/data/consul/ConsulSyncDataConfiguration.java`
#### Snippet
```java
    public SyncDataService syncDataService(final ObjectProvider<ConsulClient> consulClient,
                                           final ObjectProvider<ConsulConfig> consulConfig,
                                           final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                           final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers,
                                           final ObjectProvider<List<AuthDataSubscriber>> authSubscribers) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DivideUpstream`
in `shenyu-plugin/shenyu-plugin-divide/src/main/java/org/apache/shenyu/plugin/divide/handler/DividePluginDataHandler.java`
#### Snippet
```java
    }
    
    private List<Upstream> convertUpstreamList(final List<DivideUpstream> upstreamList) {
        return upstreamList.stream().map(u -> Upstream.builder()
                .protocol(u.getProtocol())
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `shenyu-plugin/shenyu-plugin-resilience4j/src/main/java/org/apache/shenyu/plugin/resilience4j/executor/CombinedExecutor.java`
#### Snippet
```java

    @Override
    public <T> Mono<T> run(final Mono<T> run, final Function<Throwable, Mono<T>> fallback, final Resilience4JConf resilience4JConf) {
        RateLimiter rateLimiter = Resilience4JRegistryFactory.rateLimiter(resilience4JConf.getId(), resilience4JConf.getRateLimiterConfig());
        CircuitBreaker circuitBreaker = Resilience4JRegistryFactory.circuitBreaker(resilience4JConf.getId(), resilience4JConf.getCircuitBreakerConfig());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Mono`
in `shenyu-plugin/shenyu-plugin-resilience4j/src/main/java/org/apache/shenyu/plugin/resilience4j/executor/CombinedExecutor.java`
#### Snippet
```java

    @Override
    public <T> Mono<T> run(final Mono<T> run, final Function<Throwable, Mono<T>> fallback, final Resilience4JConf resilience4JConf) {
        RateLimiter rateLimiter = Resilience4JRegistryFactory.rateLimiter(resilience4JConf.getId(), resilience4JConf.getRateLimiterConfig());
        CircuitBreaker circuitBreaker = Resilience4JRegistryFactory.circuitBreaker(resilience4JConf.getId(), resilience4JConf.getCircuitBreakerConfig());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuRequestLog`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-pulsar/src/main/java/org/apache/shenyu/plugin/logging/pulsar/client/PulsarLogCollectClient.java`
#### Snippet
```java

    @Override
    public void consume0(@NonNull final List<ShenyuRequestLog> logs) {
        logs.forEach(log -> producer.sendAsync(toBytes(log)));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StreamObserver`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/proto/CompositeStreamObserver.java`
#### Snippet
```java
    private final ImmutableList<StreamObserver<T>> observers;

    private CompositeStreamObserver(final ImmutableList<StreamObserver<T>> observers) {
        this.observers = observers;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuServiceInstance`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/resolver/ShenyuServiceInstanceLists.java`
#### Snippet
```java
     * @param shenyuServiceInstances the shenyu service instances
     */
    public void addShenyuServiceInstances(final List<ShenyuServiceInstance> shenyuServiceInstances) {
        this.shenyuServiceInstances.addAll(shenyuServiceInstances);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SubChannelCopy`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/loadbalance/picker/RoundRobinPicker.java`
#### Snippet
```java

    @Override
    protected SubChannelCopy pick(final List<SubChannelCopy> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SubChannelCopy`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/loadbalance/picker/RandomPicker.java`
#### Snippet
```java
    }

    private int getRandomIndexByWeight(final List<SubChannelCopy> list) {
        final int sumWeight = list.stream().mapToInt(SubChannelCopy::getWeight).sum();
        if (sumWeight <= 0) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuServiceInstance`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/resolver/ShenyuNameResolver.java`
#### Snippet
```java
        }

        private boolean needsToUpdateConnections(final List<ShenyuServiceInstance> newInstanceList) {
            if (!Objects.equals(this.savedInstanceList.size(), newInstanceList.size())) {
                return true;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DubboParamResolveService`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-dubbo/shenyu-spring-boot-starter-plugin-apache-dubbo/src/main/java/org/apache/shenyu/springboot/starter/plugin/apache/dubbo/ApacheDubboPluginConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public ShenyuPlugin apacheDubboPlugin(final ObjectProvider<DubboParamResolveService> dubboParamResolveServices) {
        return new ApacheDubboPlugin(new ApacheDubboProxyService(dubboParamResolveServices.getIfAvailable()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotatedParameterProcessor`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientMethodHandler.java`
#### Snippet
```java
                                     final RequestTemplate requestTemplate,
                                     final ShenyuSdkClient shenyuHttpClient,
                                     final Map<Class<? extends Annotation>, AnnotatedParameterProcessor> annotatedArgumentProcessors) {
        this.shenyuClient = shenyuClient;
        this.requestTemplate = requestTemplate;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotatedParameterProcessor`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientInvocationHandler.java`
#### Snippet
```java

    private Map<Class<? extends Annotation>, AnnotatedParameterProcessor> toAnnotatedArgumentProcessorMap(
            final Collection<AnnotatedParameterProcessor> processors) {
        Map<Class<? extends Annotation>, AnnotatedParameterProcessor> result = new HashMap<>();
        for (AnnotatedParameterProcessor processor : processors) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/loadbalance/AbstractLoadBalancer.java`
#### Snippet
```java
    }
    
    private <T> Set<T> setsDifference(final Set<T> a, final Set<T> b) {
        Set<T> aCopy = new HashSet<>(a);
        aCopy.removeAll(b);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DubboParamResolveService`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-dubbo/shenyu-spring-boot-starter-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/springboot/starter/plugin/alibaba/dubbo/AlibabaDubboPluginConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public ShenyuPlugin alibabaDubboPlugin(final ObjectProvider<DubboParamResolveService> dubboParamResolveServices) {
        return new AlibabaDubboPlugin(new AlibabaDubboProxyService(dubboParamResolveServices.getIfAvailable()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sdk/src/main/java/org/apache/shenyu/springboot/starter/sdk/ShenyuSdkAutoConfiguration.java`
#### Snippet
```java
    @Bean
    public ShenyuSdkClient shenyuSdkClient(final RegisterConfig config,
                                           final ObjectProvider<List<ShenyuSdkRequestInterceptor>> requestInterceptorsProvider,
                                           final ObjectProvider<ShenyuInstanceRegisterRepository> instanceRegisterRepositoryProvider) {
        Properties props = config.getProps();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuInstanceRegisterRepository`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sdk/src/main/java/org/apache/shenyu/springboot/starter/sdk/ShenyuSdkAutoConfiguration.java`
#### Snippet
```java
    public ShenyuSdkClient shenyuSdkClient(final RegisterConfig config,
                                           final ObjectProvider<List<ShenyuSdkRequestInterceptor>> requestInterceptorsProvider,
                                           final ObjectProvider<ShenyuInstanceRegisterRepository> instanceRegisterRepositoryProvider) {
        Properties props = config.getProps();
        String clientType = props.getProperty("clientType", "httpclient");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuRequestLog`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-tencent-cls/src/main/java/org/apache/shenyu/plugin/tencent/cls/client/TencentClsLogCollectClient.java`
#### Snippet
```java
     */
    @Override
    public void consume0(@NonNull final List<ShenyuRequestLog> logs) {
        logs.forEach(this::sendLog);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaDataRegisterDTO`
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/disruptor/subcriber/ShenyuClientMetadataExecutorSubscriber.java`
#### Snippet
```java
    
    @Override
    public void executor(final Collection<MetaDataRegisterDTO> metaDataRegisterDTOList) {
        for (MetaDataRegisterDTO metaDataRegisterDTO : metaDataRegisterDTOList) {
            shenyuClientRegisterRepository.persistInterface(metaDataRegisterDTO);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/disruptor/subcriber/ShenyuClientURIExecutorSubscriber.java`
#### Snippet
```java
    
    @Override
    public void executor(final Collection<URIRegisterDTO> dataList) {
        for (URIRegisterDTO uriRegisterDTO : dataList) {
            Stopwatch stopwatch = Stopwatch.createStarted();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ServerWebExchangeMatcher`
in `shenyu-plugin/shenyu-plugin-oauth2/src/main/java/org/apache/shenyu/plugin/oauth2/filter/OAuth2PreFilter.java`
#### Snippet
```java
    private final List<ServerWebExchangeMatcher> matchers;

    public OAuth2PreFilter(final List<ServerWebExchangeMatcher> matchers) {
        this.matchers = matchers;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DivideUpstream`
in `shenyu-plugin/shenyu-plugin-springcloud/src/main/java/org/apache/shenyu/plugin/springcloud/handler/SpringCloudPluginDataHandler.java`
#### Snippet
```java
    }

    private List<Upstream> convertUpstreamList(final List<DivideUpstream> upstreamList) {
        return upstreamList.stream().map(u -> Upstream.builder()
                .protocol(u.getProtocol())
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-nacos/src/main/java/org/apache/shenyu/register/client/server/nacos/NacosClientServerRegisterRepository.java`
#### Snippet
```java
    }

    private void publishRegisterURI(final List<URIRegisterDTO> registerDTOList) {
        LOGGER.info("publish uri: {}", registerDTOList);
        publisher.publish(registerDTOList);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuContextDecorator`
in `shenyu-plugin/shenyu-plugin-global/src/main/java/org/apache/shenyu/plugin/global/DefaultShenyuContextBuilder.java`
#### Snippet
```java
     * @param decoratorMap the decorator map
     */
    public DefaultShenyuContextBuilder(final Map<String, ShenyuContextDecorator> decoratorMap) {
        this.decoratorMap = decoratorMap;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DefaultJwtRuleHandle.Convert`
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/strategy/DefaultJwtConvertStrategy.java`
#### Snippet
```java
    private void addHeader(final HttpHeaders headers,
                           final Map<String, Object> body,
                           final List<DefaultJwtRuleHandle.Convert> converters) {
        for (DefaultJwtRuleHandle.Convert converter : converters) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Operator`
in `shenyu-plugin/shenyu-plugin-param-mapping/src/main/java/org/apache/shenyu/plugin/param/mapping/ParamMappingPlugin.java`
#### Snippet
```java
    private final Map<String, Operator> operatorMap;

    public ParamMappingPlugin(final Map<String, Operator> operatorMap) {
        this.operatorMap = operatorMap;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/EtcdClientServerRegisterRepository.java`
#### Snippet
```java
    }

    private void publishURI(final List<URIRegisterDTO> registerDTOList) {
        publisher.publish(registerDTOList);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-zookeeper/src/main/java/org/apache/shenyu/sync/data/zookeeper/ZookeeperSyncDataService.java`
#### Snippet
```java
    public ZookeeperSyncDataService(final ZookeeperClient zkClient,
                                    final PluginDataSubscriber pluginDataSubscriber,
                                    final List<MetaDataSubscriber> metaDataSubscribers,
                                    final List<AuthDataSubscriber> authDataSubscribers) {
        this.zkClient = zkClient;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuthDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-zookeeper/src/main/java/org/apache/shenyu/sync/data/zookeeper/ZookeeperSyncDataService.java`
#### Snippet
```java
                                    final PluginDataSubscriber pluginDataSubscriber,
                                    final List<MetaDataSubscriber> metaDataSubscribers,
                                    final List<AuthDataSubscriber> authDataSubscribers) {
        this.zkClient = zkClient;
        this.pluginDataSubscriber = pluginDataSubscriber;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Event`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/client/EtcdClient.java`
#### Snippet
```java

    private Watch.Listener watch(final Supplier<Boolean> exitSignSupplier, final ByteSequence storeKey,
                                 final BiConsumer<Event, Node> consumer) {
        return Watch.listener(response -> {
            while (!exitSignSupplier.get()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Node`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/client/EtcdClient.java`
#### Snippet
```java

    private Watch.Listener watch(final Supplier<Boolean> exitSignSupplier, final ByteSequence storeKey,
                                 final BiConsumer<Event, Node> consumer) {
        return Watch.listener(response -> {
            while (!exitSignSupplier.get()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuRequestLog`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-kafka/src/main/java/org/apache/shenyu/plugin/logging/kafka/client/KafkaLogCollectClient.java`
#### Snippet
```java
     */
    @Override
    public void consume0(@NonNull final List<ShenyuRequestLog> logs) {
        logs.forEach(log -> {
            String logTopic = StringUtils.defaultIfBlank(LogCollectConfigUtils.getTopic(log.getPath(), apiTopicMap), topic);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends HttpClient`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-httpclient/src/main/java/org/apache/shenyu/springboot/starter/plugin/httpclient/HttpClientPluginConfiguration.java`
#### Snippet
```java
        public ShenyuPlugin webClientPlugin(
                final HttpClientProperties properties,
                final ObjectProvider<HttpClient> httpClient) {
            WebClient webClient = WebClient.builder()
                    // fix Exceeded limit on max bytes to buffer
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LoopResources`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-httpclient/src/main/java/org/apache/shenyu/springboot/starter/plugin/httpclient/HttpClientPluginConfiguration.java`
#### Snippet
```java
    @Bean
    public HttpClient httpClient(final HttpClientProperties properties,
                                 final ObjectProvider<LoopResources> provider) {
        // configure pool resources.
        HttpClientProperties.Pool pool = properties.getPool();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends HttpClient`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-httpclient/src/main/java/org/apache/shenyu/springboot/starter/plugin/httpclient/HttpClientPluginConfiguration.java`
#### Snippet
```java
         */
        @Bean
        public ShenyuPlugin nettyHttpClientPlugin(final ObjectProvider<HttpClient> httpClient) {
            return new NettyHttpClientPlugin(httpClient.getIfAvailable());
        }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-consul/src/main/java/org/apache/shenyu/register/client/server/consul/ShenyuConsulConfigWatch.java`
#### Snippet
```java
    }

    private Map<String, GetValue> extractGetValue(final Response<List<GetValue>> response) {
        Map<String, GetValue> valueMap = new HashMap<>();
        List<GetValue> values = response.getValue();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super L`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/body/LoggingServerHttpResponse.java`
#### Snippet
```java
     */
    public LoggingServerHttpResponse(final ServerHttpResponse delegate, final L logInfo,
                                     final LogCollector<L> logCollector, final boolean maskFlag,
                                     final Set<String> keyWordSet, final String dataMaskAlg) {
        super(delegate);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MessageWriter`
in `shenyu-plugin/shenyu-plugin-response/src/main/java/org/apache/shenyu/plugin/response/ResponsePlugin.java`
#### Snippet
```java
     * @param writerMap the writer map
     */
    public ResponsePlugin(final Map<String, MessageWriter> writerMap) {
        this.writerMap = writerMap;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DiscoveryClient`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-springcloud/src/main/java/org/apache/shenyu/springboot/starter/plugin/springcloud/SpringCloudPluginConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public ShenyuSpringCloudServiceChooser shenyuSpringCloudLoadBalancerClient(final ObjectProvider<DiscoveryClient> discoveryClient) {
        return new ShenyuSpringCloudServiceChooser(discoveryClient.getIfAvailable());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-consul/src/main/java/org/apache/shenyu/sync/data/consul/handler/ConsulCacheHandler.java`
#### Snippet
```java

    public ConsulCacheHandler(final PluginDataSubscriber pluginDataSubscriber,
                              final List<MetaDataSubscriber> metaDataSubscribers,
                              final List<AuthDataSubscriber> authDataSubscribers) {
        this.pluginDataSubscriber = pluginDataSubscriber;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuthDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-consul/src/main/java/org/apache/shenyu/sync/data/consul/handler/ConsulCacheHandler.java`
#### Snippet
```java
    public ConsulCacheHandler(final PluginDataSubscriber pluginDataSubscriber,
                              final List<MetaDataSubscriber> metaDataSubscribers,
                              final List<AuthDataSubscriber> authDataSubscribers) {
        this.pluginDataSubscriber = pluginDataSubscriber;
        this.metaDataSubscribers = metaDataSubscribers;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginData`
in `shenyu-sync-data-center/shenyu-sync-data-http/src/main/java/org/apache/shenyu/sync/data/http/refresh/PluginDataRefresh.java`
#### Snippet
```java

    @Override
    protected void refresh(final List<PluginData> data) {
        pluginDataSubscriber.refreshPluginDataAll();
        if (CollectionUtils.isEmpty(data)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RuleData`
in `shenyu-sync-data-center/shenyu-sync-data-http/src/main/java/org/apache/shenyu/sync/data/http/refresh/RuleDataRefresh.java`
#### Snippet
```java

    @Override
    protected void refresh(final List<RuleData> data) {
        if (CollectionUtils.isEmpty(data)) {
            LOG.info("clear all rule cache, old cache");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaData`
in `shenyu-sync-data-center/shenyu-sync-data-http/src/main/java/org/apache/shenyu/sync/data/http/refresh/MetaDataRefresh.java`
#### Snippet
```java

    @Override
    protected void refresh(final List<MetaData> data) {
        if (CollectionUtils.isEmpty(data)) {
            LOG.info("clear all metaData cache");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-http/src/main/java/org/apache/shenyu/sync/data/http/refresh/MetaDataRefresh.java`
#### Snippet
```java
    private final List<MetaDataSubscriber> metaDataSubscribers;

    public MetaDataRefresh(final List<MetaDataSubscriber> metaDataSubscribers) {
        this.metaDataSubscribers = metaDataSubscribers;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuthDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-http/src/main/java/org/apache/shenyu/sync/data/http/refresh/AppAuthDataRefresh.java`
#### Snippet
```java
    private final List<AuthDataSubscriber> authDataSubscribers;

    public AppAuthDataRefresh(final List<AuthDataSubscriber> authDataSubscribers) {
        this.authDataSubscribers = authDataSubscribers;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AppAuthData`
in `shenyu-sync-data-center/shenyu-sync-data-http/src/main/java/org/apache/shenyu/sync/data/http/refresh/AppAuthDataRefresh.java`
#### Snippet
```java

    @Override
    protected void refresh(final List<AppAuthData> data) {
        if (CollectionUtils.isEmpty(data)) {
            LOG.info("clear all appAuth data cache");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorData`
in `shenyu-sync-data-center/shenyu-sync-data-http/src/main/java/org/apache/shenyu/sync/data/http/refresh/SelectorDataRefresh.java`
#### Snippet
```java

    @Override
    protected void refresh(final List<SelectorData> data) {
        if (CollectionUtils.isEmpty(data)) {
            LOG.info("clear all selector cache, old cache");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConfigService`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SyncDataService nacosSyncDataService(final ObjectProvider<ConfigService> configService, final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                           final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers, final ObjectProvider<List<AuthDataSubscriber>> authSubscribers) {
        LOGGER.info("you use nacos sync shenyu data.......");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginDataSubscriber`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SyncDataService nacosSyncDataService(final ObjectProvider<ConfigService> configService, final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                           final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers, final ObjectProvider<List<AuthDataSubscriber>> authSubscribers) {
        LOGGER.info("you use nacos sync shenyu data.......");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ServiceBean`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/ApacheDubboServiceBeanListener.java`
#### Snippet
```java
    @Override
    protected URIRegisterDTO buildURIRegisterDTO(final ApplicationContext context,
                                                 final Map<String, ServiceBean> beans) {
        return beans.entrySet().stream().findFirst().map(entry -> {
            final ServiceBean<?> bean = entry.getValue();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginDataSubscriber`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-websocket/src/main/java/org/apache/shenyu/springboot/starter/sync/data/websocket/WebsocketSyncDataConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SyncDataService websocketSyncDataService(final ObjectProvider<WebsocketConfig> websocketConfig, final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                           final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers, final ObjectProvider<List<AuthDataSubscriber>> authSubscribers) {
        LOGGER.info("you use websocket sync shenyu data.......");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuthDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/AuthDataHandler.java`
#### Snippet
```java
    private final List<AuthDataSubscriber> authDataSubscribers;

    public AuthDataHandler(final List<AuthDataSubscriber> authDataSubscribers) {
        this.authDataSubscribers = authDataSubscribers;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/SelectorDataHandler.java`
#### Snippet
```java

    @Override
    protected void doUpdate(final List<SelectorData> dataList) {
        dataList.forEach(pluginDataSubscriber::onSelectorSubscribe);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AppAuthData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/AuthDataHandler.java`
#### Snippet
```java

    @Override
    protected void doUpdate(final List<AppAuthData> dataList) {
        dataList.forEach(appAuthData -> authDataSubscribers.forEach(authDataSubscriber -> authDataSubscriber.onSubscribe(appAuthData)));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/SelectorDataHandler.java`
#### Snippet
```java

    @Override
    protected void doDelete(final List<SelectorData> dataList) {
        dataList.forEach(pluginDataSubscriber::unSelectorSubscribe);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AppAuthData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/AuthDataHandler.java`
#### Snippet
```java

    @Override
    protected void doRefresh(final List<AppAuthData> dataList) {
        authDataSubscribers.forEach(AuthDataSubscriber::refresh);
        dataList.forEach(appAuthData -> authDataSubscribers.forEach(authDataSubscriber -> authDataSubscriber.onSubscribe(appAuthData)));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AppAuthData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/AuthDataHandler.java`
#### Snippet
```java

    @Override
    protected void doDelete(final List<AppAuthData> dataList) {
        dataList.forEach(appAuthData -> authDataSubscribers.forEach(authDataSubscriber -> authDataSubscriber.unSubscribe(appAuthData)));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RuleData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/RuleDataHandler.java`
#### Snippet
```java

    @Override
    protected void doUpdate(final List<RuleData> dataList) {
        dataList.forEach(pluginDataSubscriber::onRuleSubscribe);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RuleData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/RuleDataHandler.java`
#### Snippet
```java

    @Override
    protected void doDelete(final List<RuleData> dataList) {
        dataList.forEach(pluginDataSubscriber::unRuleSubscribe);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/PluginDataHandler.java`
#### Snippet
```java

    @Override
    protected void doUpdate(final List<PluginData> dataList) {
        dataList.forEach(pluginDataSubscriber::onSubscribe);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/PluginDataHandler.java`
#### Snippet
```java

    @Override
    protected void doDelete(final List<PluginData> dataList) {
        dataList.forEach(pluginDataSubscriber::unSubscribe);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/MetaDataHandler.java`
#### Snippet
```java
    private final List<MetaDataSubscriber> metaDataSubscribers;

    public MetaDataHandler(final List<MetaDataSubscriber> metaDataSubscribers) {
        this.metaDataSubscribers = metaDataSubscribers;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/MetaDataHandler.java`
#### Snippet
```java

    @Override
    protected void doUpdate(final List<MetaData> dataList) {
        dataList.forEach(metaData -> metaDataSubscribers.forEach(metaDataSubscriber -> metaDataSubscriber.onSubscribe(metaData)));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/MetaDataHandler.java`
#### Snippet
```java

    @Override
    protected void doDelete(final List<MetaData> dataList) {
        dataList.forEach(metaData -> metaDataSubscribers.forEach(metaDataSubscriber -> metaDataSubscriber.unSubscribe(metaData)));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaData`
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/handler/MetaDataHandler.java`
#### Snippet
```java

    @Override
    protected void doRefresh(final List<MetaData> dataList) {
        metaDataSubscribers.forEach(MetaDataSubscriber::refresh);
        dataList.forEach(metaData -> metaDataSubscribers.forEach(metaDataSubscriber -> metaDataSubscriber.onSubscribe(metaData)));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ConstraintViolation`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
    }

    private void validate(final Set<ConstraintViolation<?>> violations, final Object arg, final Class<?>... groups) {
        if (arg != null && !ReflectUtils.isPrimitives(arg.getClass())) {
            if (arg instanceof Object[]) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/page/PageResultUtils.java`
#### Snippet
```java
     * @return the common pager
     */
    public static <T> CommonPager<T> result(final PageParameter pageParameter, final Supplier<Integer> countSupplier, final Supplier<List<T>> listSupplier) {
        Integer count = countSupplier.get();
        if (Objects.nonNull(count) && count > 0) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/page/PageResultUtils.java`
#### Snippet
```java
     * @return the common pager
     */
    public static <T> CommonPager<T> result(final PageParameter pageParameter, final Supplier<List<T>> listSupplier) {
        return new CommonPager<>(pageParameter, listSupplier.get());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuClientRegisterService`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/RegisterCenterConfiguration.java`
#### Snippet
```java
    @Bean(destroyMethod = "close")
    public ShenyuClientServerRegisterRepository shenyuClientServerRegisterRepository(final ShenyuRegisterCenterConfig shenyuRegisterCenterConfig,
                                                                               final List<ShenyuClientRegisterService> shenyuClientRegisterService) {
        String registerType = shenyuRegisterCenterConfig.getRegisterType();
        ShenyuClientServerRegisterRepository registerRepository = ExtensionLoader.getExtensionLoader(ShenyuClientServerRegisterRepository.class).getJoin(registerType);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorHandleConverter`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/ShenyuAdminConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SelectorHandleConverterFactor selectorHandleConverterFactor(final List<SelectorHandleConverter> converterList) {
        Map<String, SelectorHandleConverter> converterMap = converterList.stream().collect(Collectors.toMap(SelectorHandleConverter::pluginName, e -> e));
        return new SelectorHandleConverterFactor(converterMap);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ListUtil.java`
#### Snippet
```java
     * @return list
     */
    public static <R> R findFirst(final List<R> list, final Function<R, Boolean> function) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super R`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ListUtil.java`
#### Snippet
```java
     * @return list
     */
    public static <R> R findFirst(final List<R> list, final Function<R, Boolean> function) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends U`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ListUtil.java`
#### Snippet
```java
     * @return list
     */
    public static <K, U> Map<K, U> toMap(final Collection<U> list, final Function<? super U, ? extends K> function) {
        return toMap(list, function, Function.identity());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ListUtil.java`
#### Snippet
```java
     * @return list1
     */
    public static <T> List<T> merge(final List<T> list1, final List<T> list2) {
        list1.addAll(list2);
        return list1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends U`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ListUtil.java`
#### Snippet
```java
     * @return list
     */
    public static <K, U> Map<K, List<U>> groupBy(final Collection<U> list, final Function<? super U, ? extends K> function) {
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyMap();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ListUtil.java`
#### Snippet
```java
     * @return collection1
     */
    public static <T> Set<T> mergeSet(final Set<T> set1, final Set<T> set2) {
        set1.addAll(set2);
        return set1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Q`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/PageService.java`
#### Snippet
```java
     * @return list
     */
    default PageInfo<R> searchByPage(final PageCondition<Q> pageCondition) {
        doConditionPreProcessing(pageCondition.getCondition());
        PageHelper.startPage(pageCondition.getPageNum(), pageCondition.getPageSize());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ResourceVO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ResourceUtil.java`
#### Snippet
```java
     * @return {@linkplain List} menu infos.
     */
    public static List<PermissionMenuVO.MenuInfo> buildMenu(final List<ResourceVO> metaList) {
        
        List<PermissionMenuVO.MenuInfo> retList = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java
     * @param id id
     */
    private void recurseUpdateTag(final Map<String, TagDO> allData, final Map<String, List<String>> relationMap, final String id) {
        if (CollectionUtils.isEmpty(relationMap.get(id))) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorConditionDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/SelectorServiceImpl.java`
#### Snippet
```java
    }
    
    private void publishEvent(final SelectorDO selectorDO, final List<SelectorConditionDTO> selectorConditions) {
        PluginDO pluginDO = pluginMapper.selectById(selectorDO.getPluginId());
        List<ConditionData> conditionDataList = ListUtil.map(selectorConditions, ConditionTransfer.INSTANCE::mapToSelectorDTO);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorConditionDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/SelectorServiceImpl.java`
#### Snippet
```java
    }
    
    private void createCondition(final String selectorId, final List<SelectorConditionDTO> selectorConditions) {
        for (SelectorConditionDTO condition : selectorConditions) {
            condition.setSelectorId(selectorId);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ResourceVO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/PermissionServiceImpl.java`
#### Snippet
```java
     * @return {@linkplain List} Auth perms
     */
    private List<AuthPerm> getAuthPerm(final List<ResourceVO> resourceVOList) {
        return resourceVOList.stream()
                .filter(item -> item.getResourceType().equals(ResourceTypeConstants.MENU_TYPE_2))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UpstreamInstance`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/ServiceDocManagerImpl.java`
#### Snippet
```java

    @Override
    public void pullApiDocument(final Set<UpstreamInstance> currentServices) {
        currentServices.forEach(this::pullApiDocument);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ResourceVO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/RoleServiceImpl.java`
#### Snippet
```java
     * @return list of {@linkplain ResourceInfo}
     */
    private List<ResourceInfo> getTreeModelList(final List<ResourceVO> metaList) {
        final List<ResourceInfo> retList = new ArrayList<>();
        if (CollectionUtils.isEmpty(metaList)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
     * @param cookieStore cookieStore
     */
    public void setCookieStore(final Map<String, List<Cookie>> cookieStore) {
        this.cookieStore = cookieStore;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UploadFile`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
     */
    public Response requestFile(final String url, final Map<String, ?> form, final Map<String, String> header,
        final List<UploadFile> files)
        throws IOException {
        MultipartBody.Builder bodyBuilder = new MultipartBody.Builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super DocInfo`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/DocManagerImpl.java`
#### Snippet
```java
     */
    @Override
    public void addDocInfo(final String clusterName, final String docInfoJson, final Consumer<DocInfo> callback) {
        if (StringUtils.isEmpty(docInfoJson)) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DocItem`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/SwaggerDocParser.java`
#### Snippet
```java
    }

    private int getMuduleOrder(final List<DocItem> items) {
        if (CollectionUtils.isEmpty(items)) {
            return Integer.MAX_VALUE;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/LoadServiceDocEntryImpl.java`
#### Snippet
```java
    }

    private List<UpstreamInstance> getLastUpdateInstanceList(final List<SelectorData> changedList) {
        if (CollectionUtils.isEmpty(changedList)) {
            LOG.info("getLastUpdateInstanceList, changedList is empty.");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UpstreamInstance`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/LoadServiceDocEntryImpl.java`
#### Snippet
```java
    }

    private UpstreamInstance getClusterLastUpdateInstance(final List<UpstreamInstance> allInstances) {
        if (CollectionUtils.isEmpty(allInstances)) {
            return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterDubboServiceImpl.java`
#### Snippet
```java
    }

    private List<DubboUpstream> buildDubboUpstreamList(final List<URIRegisterDTO> uriList) {
        return uriList.stream()
                .map(dto -> CommonUpstreamUtils.buildDefaultDubboUpstream(dto.getHost(), dto.getPort()))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterTarsServiceImpl.java`
#### Snippet
```java
    }

    private List<TarsUpstream> buildTarsUpstreamList(final List<URIRegisterDTO> uriList) {
        return uriList.stream().map(dto -> CommonUpstreamUtils.buildDefaultTarsUpstream(dto.getHost(), dto.getPort()))
                .collect(Collectors.toCollection(CopyOnWriteArrayList::new));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterGrpcServiceImpl.java`
#### Snippet
```java
    }

    private List<GrpcUpstream> buildGrpcUpstreamList(final List<URIRegisterDTO> uriList) {
        return uriList.stream()
                .map(dto -> CommonUpstreamUtils.buildDefaultGrpcUpstream(dto.getHost(), dto.getPort()))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/AbstractShenyuClientRegisterServiceImpl.java`
#### Snippet
```java
     */
    @Override
    public String doRegisterURI(final String selectorName, final List<URIRegisterDTO> uriList) {
        if (CollectionUtils.isEmpty(uriList)) {
            return "";
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CommonUpstream`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/SpringCloudSelectorHandleConverter.java`
#### Snippet
```java
    
    @Override
    protected Object doHandle(final String handle, final List<CommonUpstream> aliveList) {
        SpringCloudSelectorHandle selectorHandle = convert(handle);
        List<DivideUpstream> existList = updateStatusAndFilter(selectorHandle.getDivideUpstreams(), aliveList);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CommonUpstream`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/DubboSelectorHandleConverter.java`
#### Snippet
```java
    
    @Override
    protected Object doHandle(final String handle, final List<CommonUpstream> aliveList) {
        List<DubboUpstream> existList = updateStatusAndFilter(convert(handle), aliveList);
        aliveList.stream().filter(alive -> existList.stream().noneMatch(valid -> valid.getUpstreamUrl().equals(alive.getUpstreamUrl())))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterWebSocketServiceImpl.java`
#### Snippet
```java
    }

    private List<WebSocketUpstream> buildWebSocketUpstreamList(final List<URIRegisterDTO> uriList) {
        return uriList.stream()
            .map(dto -> CommonUpstreamUtils.buildWebSocketUpstream(dto.getProtocol(), dto.getHost(), dto.getPort()))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorHandleConverter`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/SelectorHandleConverterFactor.java`
#### Snippet
```java
     * @param maps the maps
     */
    public SelectorHandleConverterFactor(final Map<String, SelectorHandleConverter> maps) {
        this.maps = maps;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterDivideServiceImpl.java`
#### Snippet
```java
    }

    private List<DivideUpstream> buildDivideUpstreamList(final List<URIRegisterDTO> uriList) {
        return uriList.stream()
                .map(dto -> CommonUpstreamUtils.buildDivideUpstream(dto.getProtocol(), dto.getHost(), dto.getPort()))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterSpringCloudServiceImpl.java`
#### Snippet
```java
    }

    private List<DivideUpstream> buildDivideUpstreamList(final List<URIRegisterDTO> uriList) {
        return uriList.stream()
                .map(dto -> CommonUpstreamUtils.buildDefaultDivideUpstream(dto.getHost(), dto.getPort()))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CommonUpstream`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/TarsSelectorHandleConverter.java`
#### Snippet
```java
     */
    @Override
    protected Object doHandle(final String handle, final List<CommonUpstream> aliveList) {
        List<TarsUpstream> existList = updateStatusAndFilter(convert(handle), aliveList);
        aliveList.stream().filter(alive -> existList.stream().noneMatch(valid -> valid.getUpstreamUrl().equals(alive.getUpstreamUrl())))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/AbstractSelectorHandleConverter.java`
#### Snippet
```java
     */
    @Override
    public <T extends CommonUpstream> List<T> updateStatusAndFilter(final List<T> existList, final List<? extends CommonUpstream> aliveList) {
        if (CollectionUtils.isEmpty(aliveList) || CollectionUtils.isEmpty(existList)) {
            return Lists.newArrayList();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CommonUpstream`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/GrpcSelectorHandleConverter.java`
#### Snippet
```java
    
    @Override
    protected Object doHandle(final String handle, final List<CommonUpstream> aliveList) {
        List<GrpcUpstream> existList = updateStatusAndFilter(convert(handle), aliveList);
        aliveList.stream().filter(alive -> existList.stream().noneMatch(valid -> valid.getUpstreamUrl().equals(alive.getUpstreamUrl())))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CommonUpstream`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/DivideSelectorHandleConverter.java`
#### Snippet
```java
     */
    @Override
    protected Object doHandle(final String handle, final List<CommonUpstream> aliveList) {
        List<DivideUpstream> existList = updateStatusAndFilter(convert(handle), aliveList);
        aliveList.stream().filter(alive -> existList.stream().noneMatch(valid -> valid.getUpstreamUrl().equals(alive.getUpstreamUrl())))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractNodeDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onPluginChanged(final List<PluginData> changed, final DataEventTypeEnum eventType) {
        for (PluginData data : changed) {
            String pluginPath = DefaultPathConstants.buildPluginPath(data.getName());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RuleData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractNodeDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onRuleChanged(final List<RuleData> changed, final DataEventTypeEnum eventType) {
        if (eventType == DataEventTypeEnum.REFRESH && !changed.isEmpty()) {
            String selectorParentPath = DefaultPathConstants.buildRuleParentPath(changed.get(0).getPluginName());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AppAuthData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractNodeDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onAppAuthChanged(final List<AppAuthData> changed, final DataEventTypeEnum eventType) {
        for (AppAuthData data : changed) {
            String appAuthPath = DefaultPathConstants.buildAppAuthPath(data.getAppKey());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractNodeDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onSelectorChanged(final List<SelectorData> changed, final DataEventTypeEnum eventType) {
        if (eventType == DataEventTypeEnum.REFRESH && !changed.isEmpty()) {
            String selectorParentPath = DefaultPathConstants.buildSelectorParentPath(changed.get(0).getPluginName());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractNodeDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onMetaDataChanged(final List<MetaData> changed, final DataEventTypeEnum eventType) {
        for (MetaData data : changed) {
            try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaDataRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/subscriber/MetadataExecutorSubscriber.java`
#### Snippet
```java

    @Override
    public void executor(final Collection<MetaDataRegisterDTO> metaDataRegisterDTOList) {
        metaDataRegisterDTOList.forEach(meta -> {
            Optional.ofNullable(this.shenyuClientRegisterService.get(meta.getRpcType()))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuClientRegisterService`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/subscriber/MetadataExecutorSubscriber.java`
#### Snippet
```java
    private final Map<String, ShenyuClientRegisterService> shenyuClientRegisterService;

    public MetadataExecutorSubscriber(final Map<String, ShenyuClientRegisterService> shenyuClientRegisterService) {
        this.shenyuClientRegisterService = shenyuClientRegisterService;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuClientRegisterService`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/subscriber/URIRegisterExecutorSubscriber.java`
#### Snippet
```java
     * @param shenyuClientRegisterService the shenyu client register service
     */
    public URIRegisterExecutorSubscriber(final Map<String, ShenyuClientRegisterService> shenyuClientRegisterService) {
        this.shenyuClientRegisterService = shenyuClientRegisterService;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/subscriber/URIRegisterExecutorSubscriber.java`
#### Snippet
```java
    
    @Override
    public void executor(final Collection<URIRegisterDTO> dataList) {
        if (CollectionUtils.isEmpty(dataList)) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/subscriber/URIRegisterExecutorSubscriber.java`
#### Snippet
```java
    }
    
    private Map<String, List<URIRegisterDTO>> buildData(final Collection<URIRegisterDTO> dataList) {
        Map<String, List<URIRegisterDTO>> resultMap = new HashMap<>(8);
        for (URIRegisterDTO dto : dataList) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AppAuthData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractListDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onAppAuthChanged(final List<AppAuthData> changed, final DataEventTypeEnum eventType) {
        updateAuthMap(getConfig(changeData.getAuthDataId()));
        switch (eventType) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RuleData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractListDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onRuleChanged(final List<RuleData> changed, final DataEventTypeEnum eventType) {
        updateRuleMap(getConfig(changeData.getRuleDataId()));
        switch (eventType) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractListDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onSelectorChanged(final List<SelectorData> changed, final DataEventTypeEnum eventType) {
        updateSelectorMap(getConfig(changeData.getSelectorDataId()));
        switch (eventType) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractListDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onMetaDataChanged(final List<MetaData> changed, final DataEventTypeEnum eventType) {
        updateMetaDataMap(getConfig(changeData.getMetaDataId()));
        switch (eventType) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginData`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractListDataChangedListener.java`
#### Snippet
```java

    @Override
    public void onPluginChanged(final List<PluginData> changed, final DataEventTypeEnum eventType) {
        updatePluginMap(getConfig(changeData.getPluginDataId()));
        switch (eventType) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ReactiveOAuth2AuthorizedClientService`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-plugin/shenyu-spring-boot-starter-plugin-oauth2/src/main/java/org/apache/shenyu/springboot/starter/plugin/oauth2/OAuth2PluginConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public ShenyuPlugin oAuth2Plugin(final ObjectProvider<ReactiveOAuth2AuthorizedClientService> authorizedClientServiceProvider) {
        return new OAuth2Plugin(authorizedClientServiceProvider.getObject());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ZookeeperClient`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-zookeeper/src/main/java/org/apache/shenyu/springboot/sync/data/zookeeper/ZookeeperSyncDataConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SyncDataService syncDataService(final ObjectProvider<ZookeeperClient> zookeeperClient, final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                           final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers, final ObjectProvider<List<AuthDataSubscriber>> authSubscribers) {
        LOGGER.info("you use zookeeper sync shenyu data.......");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginDataSubscriber`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-zookeeper/src/main/java/org/apache/shenyu/springboot/sync/data/zookeeper/ZookeeperSyncDataConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SyncDataService syncDataService(final ObjectProvider<ZookeeperClient> zookeeperClient, final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                           final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers, final ObjectProvider<List<AuthDataSubscriber>> authSubscribers) {
        LOGGER.info("you use zookeeper sync shenyu data.......");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TarsInvokePrx`
in `shenyu-plugin/shenyu-plugin-tars/src/main/java/org/apache/shenyu/plugin/tars/proxy/TarsInvokePrxList.java`
#### Snippet
```java
     * @param tarsInvokePrxList the tars invoke prx list
     */
    public void addTarsInvokePrxList(final List<TarsInvokePrx> tarsInvokePrxList) {
        this.tarsInvokePrxList.addAll(tarsInvokePrxList);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdSyncDataService.java`
#### Snippet
```java
    public EtcdSyncDataService(final EtcdClient etcdClient,
                               final PluginDataSubscriber pluginDataSubscriber,
                               final List<MetaDataSubscriber> metaDataSubscribers,
                               final List<AuthDataSubscriber> authDataSubscribers) {
        this.etcdClient = etcdClient;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuthDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdSyncDataService.java`
#### Snippet
```java
                               final PluginDataSubscriber pluginDataSubscriber,
                               final List<MetaDataSubscriber> metaDataSubscribers,
                               final List<AuthDataSubscriber> authDataSubscribers) {
        this.etcdClient = etcdClient;
        this.pluginDataSubscriber = pluginDataSubscriber;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
    }

    private Watch.Listener watch(final BiConsumer<String, String> updateHandler,
                                 final Consumer<String> deleteHandler) {
        return Watch.listener(response -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
    }

    private Watch.Listener watch(final BiConsumer<String, String> updateHandler,
                                 final Consumer<String> deleteHandler) {
        return Watch.listener(response -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java

    private Watch.Listener watch(final BiConsumer<String, String> updateHandler,
                                 final Consumer<String> deleteHandler) {
        return Watch.listener(response -> {
            for (WatchEvent event : response.getEvents()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/cache/UpstreamCheckTask.java`
#### Snippet
```java
    }

    private void removeFromMap(final Map<String, List<Upstream>> map, final String selectorId, final Upstream upstream) {
        synchronized (lock) {
            List<Upstream> list = map.get(selectorId);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/cache/UpstreamCheckTask.java`
#### Snippet
```java
    }

    private void putToMap(final Map<String, List<Upstream>> map, final String selectorId, final Upstream upstream) {
        synchronized (lock) {
            List<Upstream> list = map.computeIfAbsent(selectorId, k -> Lists.newArrayList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends URIRegisterDTO`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClientServerRegisterRepository.java`
#### Snippet
```java
    }

    private void publishRegisterURI(final List<URIRegisterDTO> registerDTOList) {
        publisher.publish(registerDTOList);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TimerTask`
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimerTaskList.java`
#### Snippet
```java
     * @param consumer the consumer
     */
    public synchronized void foreach(final Consumer<TimerTask> consumer) {
        TimerTaskEntry entry = root.next;
        while (entry != root) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TimerTaskEntry`
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimerTaskList.java`
#### Snippet
```java
     * @param consumer the consumer
     */
    synchronized void flush(final Consumer<TimerTaskEntry> consumer) {
        TimerTaskEntry head = root.next;
        while (head != root) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/FreshBeanHolder.java`
#### Snippet
```java
    private volatile O o;

    public FreshBeanHolder(final Function<E, O> function) {
        this.function = function;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends O`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/FreshBeanHolder.java`
#### Snippet
```java
    private volatile O o;

    public FreshBeanHolder(final Function<E, O> function) {
        this.function = function;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ReflectiveOperationException`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ReflectUtils.java`
#### Snippet
```java
     */
    public static Object invokeMethod(final Object object, final String method,
        final Consumer<ReflectiveOperationException> errorCallBack, final Object... args) {
        try {
            return MethodUtils.invokeMethod(object, method, args);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/DiscardOldestPolicy.java`
#### Snippet
```java

    @Override
    public void reject(final E e, final Queue<E> queue) {
        queue.poll();
        queue.offer(e);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ServiceBean`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/AlibabaDubboServiceBeanListener.java`
#### Snippet
```java
    @Override
    protected URIRegisterDTO buildURIRegisterDTO(final ApplicationContext context,
                                                 final Map<String, ServiceBean> beans) {
        return beans.entrySet().stream().findFirst().map(entry -> {
            final ServiceBean<?> bean = entry.getValue();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ConstraintViolation`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
    }

    private void validate(final Set<ConstraintViolation<?>> violations, final Object arg, final Class<?>... groups) {
        if (arg != null && !isPrimitives(arg.getClass())) {
            if (arg instanceof Object[]) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ApplicationEventPublisher`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-gateway/src/main/java/org/apache/shenyu/springboot/starter/gateway/ShenyuConfiguration.java`
#### Snippet
```java
    @Bean
    public PluginDataSubscriber pluginDataSubscriber(final ObjectProvider<List<PluginDataHandler>> pluginDataHandlerList,
                                                     final ObjectProvider<ApplicationEventPublisher> eventPublisher) {
        return new CommonPluginDataSubscriber(pluginDataHandlerList.getIfAvailable(Collections::emptyList), eventPublisher.getIfAvailable());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends EtcdClient`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-etcd/src/main/java/org/apache/shenyu/springboot/sync/data/etcd/EtcdSyncDataConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SyncDataService syncDataService(final ObjectProvider<EtcdClient> etcdClients,
                                           final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                           final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginDataSubscriber`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-etcd/src/main/java/org/apache/shenyu/springboot/sync/data/etcd/EtcdSyncDataConfiguration.java`
#### Snippet
```java
    @Bean
    public SyncDataService syncDataService(final ObjectProvider<EtcdClient> etcdClients,
                                           final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                           final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers,
                                           final ObjectProvider<List<AuthDataSubscriber>> authSubscribers) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends HttpConfig`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-http/src/main/java/org/apache/shenyu/springboot/starter/sync/data/http/HttpSyncDataConfiguration.java`
#### Snippet
```java
     */
    @Bean
    public SyncDataService httpSyncDataService(final ObjectProvider<HttpConfig> httpConfig,
                                               final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                               final ObjectProvider<RestTemplate> restTemplate,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginDataSubscriber`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-http/src/main/java/org/apache/shenyu/springboot/starter/sync/data/http/HttpSyncDataConfiguration.java`
#### Snippet
```java
    @Bean
    public SyncDataService httpSyncDataService(final ObjectProvider<HttpConfig> httpConfig,
                                               final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                               final ObjectProvider<RestTemplate> restTemplate,
                                               final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RestTemplate`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-http/src/main/java/org/apache/shenyu/springboot/starter/sync/data/http/HttpSyncDataConfiguration.java`
#### Snippet
```java
    public SyncDataService httpSyncDataService(final ObjectProvider<HttpConfig> httpConfig,
                                               final ObjectProvider<PluginDataSubscriber> pluginSubscriber,
                                               final ObjectProvider<RestTemplate> restTemplate,
                                               final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers,
                                               final ObjectProvider<List<AuthDataSubscriber>> authSubscribers,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AccessTokenManager`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-http/src/main/java/org/apache/shenyu/springboot/starter/sync/data/http/HttpSyncDataConfiguration.java`
#### Snippet
```java
                                               final ObjectProvider<List<MetaDataSubscriber>> metaSubscribers,
                                               final ObjectProvider<List<AuthDataSubscriber>> authSubscribers,
                                               final ObjectProvider<AccessTokenManager> accessTokenManager) {
        LOGGER.info("you use http long pull sync shenyu data");
        return new HttpSyncDataService(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuSdkRequestInterceptor`
in `shenyu-sdk/shenyu-sdk-core/src/main/java/org/apache/shenyu/sdk/core/client/AbstractShenyuSdkClient.java`
#### Snippet
```java

    @Override
    public void init(final RegisterConfig registerConfig, final List<ShenyuSdkRequestInterceptor> requestInterceptors, final ShenyuInstanceRegisterRepository instanceRegisterRepository) {
        this.registerConfig = registerConfig;
        this.registerRepository = instanceRegisterRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuRequestLog`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-rocketmq/src/main/java/org/apache/shenyu/plugin/logging/rocketmq/client/RocketMQLogCollectClient.java`
#### Snippet
```java
     */
    @Override
    public void consume0(@NonNull final List<ShenyuRequestLog> logs) {
        logs.forEach(log -> {
            String logTopic = StringUtils.defaultIfBlank(LogCollectConfigUtils.getTopic(log.getPath(), apiTopicMap), topic);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MetaDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-nacos/src/main/java/org/apache/shenyu/sync/data/nacos/handler/NacosCacheHandler.java`
#### Snippet
```java

    public NacosCacheHandler(final ConfigService configService, final PluginDataSubscriber pluginDataSubscriber,
                             final List<MetaDataSubscriber> metaDataSubscribers,
                             final List<AuthDataSubscriber> authDataSubscribers) {
        this.configService = configService;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuthDataSubscriber`
in `shenyu-sync-data-center/shenyu-sync-data-nacos/src/main/java/org/apache/shenyu/sync/data/nacos/handler/NacosCacheHandler.java`
#### Snippet
```java
    public NacosCacheHandler(final ConfigService configService, final PluginDataSubscriber pluginDataSubscriber,
                             final List<MetaDataSubscriber> metaDataSubscribers,
                             final List<AuthDataSubscriber> authDataSubscribers) {
        this.configService = configService;
        this.pluginDataSubscriber = pluginDataSubscriber;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuPlugin`
in `shenyu-web/src/main/java/org/apache/shenyu/web/handler/ShenyuWebHandler.java`
#### Snippet
```java
         * @param plugins the plugins
         */
        DefaultShenyuPluginChain(final List<ShenyuPlugin> plugins) {
            this.plugins = plugins;
        }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuPlugin`
in `shenyu-web/src/main/java/org/apache/shenyu/web/handler/ShenyuWebHandler.java`
#### Snippet
```java
     * @param extPlugins the ext plugins
     */
    public void putExtPlugins(final List<ShenyuPlugin> extPlugins) {
        if (CollectionUtils.isEmpty(extPlugins)) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuRequestLog`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-aliyun-sls/src/main/java/org/apache/shenyu/plugin/aliyun/sls/client/AliyunSlsLogCollectClient.java`
#### Snippet
```java
     */
    @Override
    public void consume0(@NonNull final List<ShenyuRequestLog> logs) {
        logs.forEach(this::sendLog);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ShenyuRequestLog`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-clickhouse/src/main/java/org/apache/shenyu/plugin/logging/clickhouse/client/ClickHouseLogCollectClient.java`
#### Snippet
```java

    @Override
    public void consume0(@NonNull final List<ShenyuRequestLog> logs) throws Exception {
        if (CollectionUtils.isNotEmpty(logs)) {
            Object[][] datas = new Object[logs.size()][];
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final @Nullable`
in `shenyu-plugin/shenyu-plugin-cache/shenyu-plugin-cache-redis/src/main/java/org/apache/shenyu/plugin/cache/redis/serializer/ByteArrayRedisSerializer.java`
#### Snippet
```java
    @Override
    @Nullable
    public byte[] serialize(final @Nullable byte[] bytes) throws SerializationException {
        return bytes;
    }
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final @Nullable`
in `shenyu-plugin/shenyu-plugin-cache/shenyu-plugin-cache-redis/src/main/java/org/apache/shenyu/plugin/cache/redis/serializer/ByteArrayRedisSerializer.java`
#### Snippet
```java
    @Override
    @Nullable
    public byte[] deserialize(final @Nullable byte[] bytes) throws SerializationException {
        return bytes;
    }
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final @NonNull`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
    @Override
    protected MetaDataRegisterDTO buildMetaDataDTO(final Object bean,
                                                   final @NonNull ShenyuSpringCloudClient shenyuClient,
                                                   final String path, final Class<?> clazz, final Method method) {
        return MetaDataRegisterDTO.builder()
```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/client/AbstractContextRefreshedEventListener.java`
#### Snippet
```java
    protected void handleClass(final Class<?> clazz,
                               final T bean,
                               @NonNull final A beanShenyuClient,
                               final String superPath) {
        publisher.publishEvent(buildMetaDataDTO(bean, beanShenyuClient, pathJoin(contextPath, superPath), clazz, null));
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/client/AbstractContextRefreshedEventListener.java`
#### Snippet
```java
    
    @Override
    public void onApplicationEvent(@NonNull final ContextRefreshedEvent event) {
        final ApplicationContext context = event.getApplicationContext();
        Map<String, T> beans = getBeans(context);
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/client/AbstractContextRefreshedEventListener.java`
#### Snippet
```java
    
    protected abstract MetaDataRegisterDTO buildMetaDataDTO(T bean,
                                                            @NonNull A shenyuClient,
                                                            String path,
                                                            Class<?> clazz,
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/client/AbstractContextRefreshedEventListener.java`
#### Snippet
```java
    protected abstract String buildApiPath(Method method,
                                           String superPath,
                                           @NonNull A methodShenyuClient);
    
    protected String pathJoin(@NonNull final String... path) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.springframework.lang.Nullable'
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/ShenyuServerEndpointerExporter.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(ShenyuServerEndpointerExporter.class);

    @Nullable
    private ServerContainer serverContainer;

```

### RuleId[ruleID=NullableProblems]
Parameter annotated @NonNull must not override @Nullable parameter
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java

    @Override
    protected String buildApiSuperPath(final Class<?> clazz, @NonNull final ShenyuSpringWebSocketClient webSocketClient) {
        if (Objects.nonNull(webSocketClient) && StringUtils.isNotBlank(webSocketClient.path())) {
            return webSocketClient.path();
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DashboardUserServiceImpl.java`
#### Snippet
```java
    private final RoleMapper roleMapper;
    
    @Nullable
    private final LdapProperties ldapProperties;
    
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DashboardUserServiceImpl.java`
#### Snippet
```java
    private final LdapProperties ldapProperties;
    
    @Nullable
    private final LdapTemplate ldapTemplate;
    
```

## RuleId[ruleID=ThrowablePrintedToSystemOut]
### RuleId[ruleID=ThrowablePrintedToSystemOut]
'Throwable' argument `ioe` to 'System.err.println()' call
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
                    }
                } catch (IOException ioe) {
                    System.err.println(ioe);
                }
            }
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `onComplete()` only delegates to its super method
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerCallListener.java`
#### Snippet
```java

    @Override
    public void onComplete() {
        super.onComplete();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `onCancel()` only delegates to its super method
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerCallListener.java`
#### Snippet
```java

    @Override
    public void onCancel() {
        super.onCancel();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `onReady()` only delegates to its super method
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerCallListener.java`
#### Snippet
```java

    @Override
    public void onReady() {
        super.onReady();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `onHalfClose()` only delegates to its super method
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerCallListener.java`
#### Snippet
```java

    @Override
    public void onHalfClose() {
        super.onHalfClose();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getSource()` only delegates to its super method
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-consul/src/main/java/org/apache/shenyu/register/client/server/consul/ConsulConfigChangedEvent.java`
#### Snippet
```java

    @Override
    public Object getSource() {
        return super.getSource();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `eventName()` is identical to its super method
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/event/plugin/BatchPluginChangedEvent.java`
#### Snippet
```java
    
    @Override
    public String eventName() {
        return "plugin";
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `buildContext()` is identical to its super method
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/event/plugin/BatchPluginDeletedEvent.java`
#### Snippet
```java
    
    @Override
    public String buildContext() {
        final String plugins = ((Collection<?>) getSource())
                .stream()
```

### RuleId[ruleID=RedundantMethodOverride]
Method `skip()` is identical to its super method
in `shenyu-plugin/shenyu-plugin-general-context/src/main/java/org/apache/shenyu/plugin/general/context/GeneralContextPlugin.java`
#### Snippet
```java

    @Override
    public boolean skip(final ServerWebExchange exchange) {
        return false;
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `skip()` is identical to its super method
in `shenyu-plugin/shenyu-plugin-casdoor/src/main/java/org/apache/shenyu/plugin/casdoor/CasdoorPlugin.java`
#### Snippet
```java

    @Override
    public boolean skip(final ServerWebExchange exchange) {
        return false;
    }
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemorySafeTaskQueue.java`
#### Snippet
```java
    @Override
    public boolean doOffer(final Runnable runnable) {
        return super.offer(runnable);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/ShenyuThreadPoolExecutor.java`
#### Snippet
```java
        } catch (RejectedExecutionException e) {
            // retry to offer the task into queue.
            final TaskQueue<Runnable> queue = (TaskQueue<Runnable>) super.getQueue();
            try {
                if (!queue.retryOffer(command, 0, TimeUnit.MILLISECONDS)) {
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitedTaskQueue.java`
#### Snippet
```java
    @Override
    public boolean doOffer(final Runnable runnable) {
        return super.offer(runnable);
    }
}
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `shenyu-plugin/shenyu-plugin-ratelimiter/src/main/java/org/apache/shenyu/plugin/ratelimiter/handler/ShenyuReactiveScriptExecutor.java`
#### Snippet
```java
            ByteBuffer[] keysAndArgs = keysAndArgs(argsWriter, keys, args);
            int keySize = keys.size();
            return super.eval(connection, script, returnType, keySize, keysAndArgs, resultReader);
        });
    }
```

## RuleId[ruleID=InfiniteLoopStatement]
### RuleId[ruleID=InfiniteLoopStatement]
`while` statement cannot complete without throwing an exception
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/HierarchicalWheelTimer.java`
#### Snippet
```java
        @Override
        public void run() {
            while (true) {
                try {
                    timer.advanceClock(100L);
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/RuntimeUtils.java`
#### Snippet
```java
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.contains("LISTEN") || !line.contains(":" + port + " ")) {
                    continue;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `shenyu-sync-data-center/shenyu-sync-data-websocket/src/main/java/org/apache/shenyu/plugin/sync/data/websocket/client/ShenyuWebsocketClient.java`
#### Snippet
```java
    private void connection() {
        this.connectBlocking();
        this.timer.add(timerTask = new AbstractRoundTask(null, TimeUnit.SECONDS.toMillis(10)) {
            @Override
            public void doRun(final String key, final TimerTask timerTask) {
                healthCheck();
            }
        });
    }
    
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
            byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];

            while (EOF != (n = input.read(buffer))) {
                output.write(buffer, 0, n);
            }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `shenyu-common/src/main/java/org/apache/shenyu/common/config/ShenyuConfig.java`
#### Snippet
```java
         */
        public String getAllowedHeaders() {
            return allowedHeaders = wrapperHeaders(allowedHeaders);
        }
    
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `shenyu-plugin/shenyu-plugin-modify-response/src/main/java/org/apache/shenyu/plugin/modify/response/ModifyResponsePlugin.java`
#### Snippet
```java
            HttpStatus statusCode = clientResponse.statusCode();
            if (this.ruleHandle.getStatusCode() > 0) {
                this.setStatusCode(statusCode = HttpStatus.valueOf(this.ruleHandle.getStatusCode()));
            }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `shenyu-web/src/main/java/org/apache/shenyu/web/filter/CrossFilter.java`
#### Snippet
```java
                // if the origin is not allow check match origin again
                String originRegex;
                if (!allowCors && StringUtils.isNotBlank(originRegex = this.filterConfig.getAllowedOrigin().getOriginRegex())) {
                    allowCors = Pattern.matches(originRegex.trim(), origin);
                }
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`serviceName = serviceName + GrpcConstants.GRPC_JSON_SERVICE` could be simplified to 'serviceName += GrpcConstants.GRPC_JSON_SERVICE'
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerServiceInterceptor.java`
#### Snippet
```java
                serviceNameField.setAccessible(true);
                String serviceName = (String) serviceNameField.get(md);
                serviceName = serviceName + GrpcConstants.GRPC_JSON_SERVICE;
                serviceNameField.set(md, serviceName);
            }
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`path = path + rewriteUri` could be simplified to 'path += rewriteUri'
in `shenyu-plugin/shenyu-plugin-api/src/main/java/org/apache/shenyu/plugin/api/utils/RequestUrlUtils.java`
#### Snippet
```java
        final String rewriteUri = (String) exchange.getAttributes().get(Constants.REWRITE_URI);
        if (StringUtils.isNoneBlank(rewriteUri)) {
            path = path + rewriteUri;
        } else {
            ShenyuContext shenyuContext = exchange.getAttribute(Constants.CONTEXT);
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`path = path + realUrl` could be simplified to 'path += realUrl'
in `shenyu-plugin/shenyu-plugin-api/src/main/java/org/apache/shenyu/plugin/api/utils/RequestUrlUtils.java`
#### Snippet
```java
            String realUrl = shenyuContext.getRealUrl();
            if (StringUtils.isNoneBlank(realUrl)) {
                path = path + realUrl;
            }
        }
```

## RuleId[ruleID=ExcessiveLambdaUsage]
### RuleId[ruleID=ExcessiveLambdaUsage]
Excessive lambda usage
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
        try {
            final String host = IpUtils.isCompleteHost(getHost()) ? getHost() : IpUtils.getHost(getHost());
            final int port = Integer.parseInt(Optional.ofNullable(getPort()).orElseGet(() -> "-1"));
            final int mergedPort = port <= 0 ? PortUtils.findPort(context.getAutowireCapableBeanFactory()) : port;
            return URIRegisterDTO.builder()
```

### RuleId[ruleID=ExcessiveLambdaUsage]
Excessive lambda usage
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
        try {
            final String host = getHost();
            final int port = Integer.parseInt(Optional.ofNullable(getPort()).orElseGet(() -> "-1"));
            final int mergedPort = port <= 0 ? PortUtils.findPort(context.getAutowireCapableBeanFactory()) : port;
            return URIRegisterDTO.builder()
```

### RuleId[ruleID=ExcessiveLambdaUsage]
Excessive lambda usage
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/init/SpringMvcClientEventListener.java`
#### Snippet
```java
        try {
            final String host = getHost();
            final int port = Integer.parseInt(Optional.ofNullable(getPort()).orElseGet(() -> "-1"));
            final int mergedPort = port <= 0 ? PortUtils.findPort(context.getAutowireCapableBeanFactory()) : port;
            return URIRegisterDTO.builder()
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/intercept/ContextClientInterceptor.java`
#### Snippet
```java
            @Override
            public void start(final Listener<P> responseListener, final Metadata headers) {
                Optional.ofNullable(GrpcPlugin.RPC_CONTEXT_KEY.get()).ifPresent(map -> map.forEach((k, v) -> {
                    headers.put(Metadata.Key.of(k, Metadata.ASCII_STRING_MARSHALLER), v);
                }));
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/annotation/RequestParamParameterProcessor.java`
#### Snippet
```java
            pathResult.append(name).append("=").append(arg);
        } else if (arg instanceof Map) {
            ((Map<?, ?>) arg).forEach((key, value) -> {
                pathResult.append(key).append("=").append(value);
            });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/EtcdClientServerRegisterRepository.java`
#### Snippet
```java
        String rpcPath = RegisterPathConstants.buildURIContextPathParent(rpcType);
        Set<String> contextList = new HashSet<>();
        client.getChildren(rpcPath).forEach(dataPath -> {
            contextList.add(getContext(dataPath));
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java
        List<TagDO> tagDOList = tagMapper.selectByParentTagIds(rootIds);
        Map<String, Boolean> map = new ConcurrentHashMap<>();
        tagDOList.forEach(tagDO -> {
            map.put(tagDO.getParentTagId(), true);
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/DocManagerImpl.java`
#### Snippet
```java
        List<DocModule> docModules = docInfo.getDocModuleList();
        DOC_DEFINITION_MAP.put(docInfo.getTitle(), docInfo);
        docModules.forEach(docModule -> {
            docModule.getDocItems().forEach(docItem -> {
                ITEM_DOC_MAP.put(docItem.getId(), docItem);
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/DocManagerImpl.java`
#### Snippet
```java
        DOC_DEFINITION_MAP.put(docInfo.getTitle(), docInfo);
        docModules.forEach(docModule -> {
            docModule.getDocItems().forEach(docItem -> {
                ITEM_DOC_MAP.put(docItem.getId(), docItem);
            });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/subscriber/MetadataExecutorSubscriber.java`
#### Snippet
```java
    @Override
    public void executor(final Collection<MetaDataRegisterDTO> metaDataRegisterDTOList) {
        metaDataRegisterDTOList.forEach(meta -> {
            Optional.ofNullable(this.shenyuClientRegisterService.get(meta.getRpcType()))
                    .ifPresent(shenyuClientRegisterService -> {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdSyncDataService.java`
#### Snippet
```java
    private void watchAllKeys() {
        keysMap = etcdClient.getKeysMapByPrefix(PRE_FIX);
        etcdClient.watchDataChange(PRE_FIX, (updateKey, updateValue) -> {
            keysMap.put(updateKey, updateValue);
        }, deleteKey -> {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdSyncDataService.java`
#### Snippet
```java
        etcdClient.watchDataChange(PRE_FIX, (updateKey, updateValue) -> {
            keysMap.put(updateKey, updateValue);
        }, deleteKey -> {
                keysMap.remove(deleteKey);
            });
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `client` is accessed in both synchronized and unsynchronized contexts
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-zookeeper/src/main/java/org/apache/shenyu/register/client/zookeeper/ZookeeperClientRegisterRepository.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(ZookeeperClientRegisterRepository.class);

    private ZookeeperClient client;

    private final Map<String, String> nodeDataMap = new HashMap<>();
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `supportSwaggerPluginMap` is accessed in both synchronized and unsynchronized contexts
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/LoadServiceDocEntryImpl.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private static Map<String, String> supportSwaggerPluginMap = Collections.EMPTY_MAP;

    private final SelectorService selectorService;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `namingService` is accessed in both synchronized and unsynchronized contexts
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-nacos/src/main/java/org/apache/shenyu/register/client/nacos/NacosClientRegisterRepository.java`
#### Snippet
```java
    private ConfigService configService;
    
    private NamingService namingService;

    private final ConcurrentLinkedQueue<String> metadataCache = new ConcurrentLinkedQueue<>();
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `configService` is accessed in both synchronized and unsynchronized contexts
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-nacos/src/main/java/org/apache/shenyu/register/client/nacos/NacosClientRegisterRepository.java`
#### Snippet
```java
    private static final String URI_META_DATA = "uriMetadata";
    
    private ConfigService configService;
    
    private NamingService namingService;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `healthyThreshold` is accessed in both synchronized and unsynchronized contexts
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/cache/UpstreamCheckTask.java`
#### Snippet
```java
    private int checkTimeout = 3000;

    private int healthyThreshold = 1;

    private int unhealthyThreshold = 1;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `unhealthyThreshold` is accessed in both synchronized and unsynchronized contexts
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/cache/UpstreamCheckTask.java`
#### Snippet
```java
    private int healthyThreshold = 1;

    private int unhealthyThreshold = 1;
    
    /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `executor` is accessed in both synchronized and unsynchronized contexts
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/cache/UpstreamCheckTask.java`
#### Snippet
```java
    private final int checkInterval;

    private ExecutorService executor;

    private int checkTimeout = 3000;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `checkTimeout` is accessed in both synchronized and unsynchronized contexts
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/cache/UpstreamCheckTask.java`
#### Snippet
```java
    private ExecutorService executor;

    private int checkTimeout = 3000;

    private int healthyThreshold = 1;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `timerTaskEntry` is accessed in both synchronized and unsynchronized contexts
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimerTask.java`
#### Snippet
```java
    private final long delayMs;
    
    private TimerTaskList.TimerTaskEntry timerTaskEntry;
    
    /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `overflowWheel` is accessed in both synchronized and unsynchronized contexts
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimingWheel.java`
#### Snippet
```java
    private Long currentTime;
    
    private TimingWheel overflowWheel;
    
    /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `currentTime` is accessed in both synchronized and unsynchronized contexts
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimingWheel.java`
#### Snippet
```java
    private final TimerTaskList[] buckets;
    
    private Long currentTime;
    
    private TimingWheel overflowWheel;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `eurekaClient` is accessed in both synchronized and unsynchronized contexts
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-eureka/src/main/java/org/apache/shenyu/register/instance/eureka/EurekaInstanceRegisterRepository.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaInstanceRegisterRepository.class);

    private EurekaClient eurekaClient;

    private EurekaHttpClient eurekaHttpClient;
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-nacos/src/main/java/org/apache/shenyu/register/instance/nacos/NacosInstanceRegisterRepository.java`
#### Snippet
```java
        this.groupName = properties.getProperty("groupName", "DEFAULT_GROUP");
        String serverAddr = config.getServerLists();
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, serverAddr);
        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty(NAMESPACE, ""));
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-nacos/src/main/java/org/apache/shenyu/register/instance/nacos/NacosInstanceRegisterRepository.java`
#### Snippet
```java
        String serverAddr = config.getServerLists();
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, serverAddr);
        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty(NAMESPACE, ""));
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-nacos/src/main/java/org/apache/shenyu/register/instance/nacos/NacosInstanceRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, serverAddr);
        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty(NAMESPACE, ""));
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-nacos/src/main/java/org/apache/shenyu/register/instance/nacos/NacosInstanceRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty(NAMESPACE, ""));
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
        nacosProperties.put(PropertyKeyConst.SECRET_KEY, properties.getProperty(PropertyKeyConst.SECRET_KEY, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-nacos/src/main/java/org/apache/shenyu/register/instance/nacos/NacosInstanceRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
        nacosProperties.put(PropertyKeyConst.SECRET_KEY, properties.getProperty(PropertyKeyConst.SECRET_KEY, ""));
        try {
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-nacos/src/main/java/org/apache/shenyu/register/instance/nacos/NacosInstanceRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
        nacosProperties.put(PropertyKeyConst.SECRET_KEY, properties.getProperty(PropertyKeyConst.SECRET_KEY, ""));
        try {
            this.namingService = NamingFactory.createNamingService(nacosProperties);
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-nacos/src/main/java/org/apache/shenyu/register/client/server/nacos/NacosClientServerRegisterRepository.java`
#### Snippet
```java
        Properties properties = config.getProps();
        Properties nacosProperties = new Properties();
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, serverAddr);
        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty("nacosNameSpace"));
        // the nacos authentication username
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-nacos/src/main/java/org/apache/shenyu/register/client/server/nacos/NacosClientServerRegisterRepository.java`
#### Snippet
```java
        Properties nacosProperties = new Properties();
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, serverAddr);
        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty("nacosNameSpace"));
        // the nacos authentication username
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-nacos/src/main/java/org/apache/shenyu/register/client/server/nacos/NacosClientServerRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty("nacosNameSpace"));
        // the nacos authentication username
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
        // the nacos authentication password
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-nacos/src/main/java/org/apache/shenyu/register/client/server/nacos/NacosClientServerRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
        // the nacos authentication password
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
        // access key for namespace
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-nacos/src/main/java/org/apache/shenyu/register/client/server/nacos/NacosClientServerRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
        // access key for namespace
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
        // secret key for namespace
        nacosProperties.put(PropertyKeyConst.SECRET_KEY, properties.getProperty(PropertyKeyConst.SECRET_KEY, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-nacos/src/main/java/org/apache/shenyu/register/client/server/nacos/NacosClientServerRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
        // secret key for namespace
        nacosProperties.put(PropertyKeyConst.SECRET_KEY, properties.getProperty(PropertyKeyConst.SECRET_KEY, ""));

        try {
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-kafka/src/main/java/org/apache/shenyu/plugin/logging/kafka/client/KafkaLogCollectClient.java`
#### Snippet
```java

        Properties props = new Properties();
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG, config.getNamesrvAddr());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-kafka/src/main/java/org/apache/shenyu/plugin/logging/kafka/client/KafkaLogCollectClient.java`
#### Snippet
```java
        Properties props = new Properties();
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG, config.getNamesrvAddr());
        if (!StringUtils.isBlank(config.getSecurityProtocol())
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-kafka/src/main/java/org/apache/shenyu/plugin/logging/kafka/client/KafkaLogCollectClient.java`
#### Snippet
```java
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG, config.getNamesrvAddr());
        if (!StringUtils.isBlank(config.getSecurityProtocol())
                && !StringUtils.isBlank(config.getSaslMechanism())) {
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-kafka/src/main/java/org/apache/shenyu/plugin/logging/kafka/client/KafkaLogCollectClient.java`
#### Snippet
```java
        if (!StringUtils.isBlank(config.getSecurityProtocol())
                && !StringUtils.isBlank(config.getSaslMechanism())) {
            props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, config.getSecurityProtocol());
            props.put(SaslConfigs.SASL_MECHANISM, config.getSaslMechanism());
            props.put(SaslConfigs.SASL_JAAS_CONFIG,
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-kafka/src/main/java/org/apache/shenyu/plugin/logging/kafka/client/KafkaLogCollectClient.java`
#### Snippet
```java
                && !StringUtils.isBlank(config.getSaslMechanism())) {
            props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, config.getSecurityProtocol());
            props.put(SaslConfigs.SASL_MECHANISM, config.getSaslMechanism());
            props.put(SaslConfigs.SASL_JAAS_CONFIG,
                    MessageFormat
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-kafka/src/main/java/org/apache/shenyu/plugin/logging/kafka/client/KafkaLogCollectClient.java`
#### Snippet
```java
            props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, config.getSecurityProtocol());
            props.put(SaslConfigs.SASL_MECHANISM, config.getSaslMechanism());
            props.put(SaslConfigs.SASL_JAAS_CONFIG,
                    MessageFormat
                            .format("org.apache.kafka.common.security.scram.ScramLoginModule required username=\"{0}\" password=\"{1}\";",
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
        Properties properties = new Properties();
        if (nacosConfig.getAcm() != null && nacosConfig.getAcm().isEnabled()) {
            properties.put(PropertyKeyConst.ENDPOINT, nacosConfig.getAcm().getEndpoint());
            properties.put(PropertyKeyConst.NAMESPACE, nacosConfig.getAcm().getNamespace());
            properties.put(PropertyKeyConst.ACCESS_KEY, nacosConfig.getAcm().getAccessKey());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
        if (nacosConfig.getAcm() != null && nacosConfig.getAcm().isEnabled()) {
            properties.put(PropertyKeyConst.ENDPOINT, nacosConfig.getAcm().getEndpoint());
            properties.put(PropertyKeyConst.NAMESPACE, nacosConfig.getAcm().getNamespace());
            properties.put(PropertyKeyConst.ACCESS_KEY, nacosConfig.getAcm().getAccessKey());
            properties.put(PropertyKeyConst.SECRET_KEY, nacosConfig.getAcm().getSecretKey());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
            properties.put(PropertyKeyConst.ENDPOINT, nacosConfig.getAcm().getEndpoint());
            properties.put(PropertyKeyConst.NAMESPACE, nacosConfig.getAcm().getNamespace());
            properties.put(PropertyKeyConst.ACCESS_KEY, nacosConfig.getAcm().getAccessKey());
            properties.put(PropertyKeyConst.SECRET_KEY, nacosConfig.getAcm().getSecretKey());
        } else {
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
            properties.put(PropertyKeyConst.NAMESPACE, nacosConfig.getAcm().getNamespace());
            properties.put(PropertyKeyConst.ACCESS_KEY, nacosConfig.getAcm().getAccessKey());
            properties.put(PropertyKeyConst.SECRET_KEY, nacosConfig.getAcm().getSecretKey());
        } else {
            properties.put(PropertyKeyConst.SERVER_ADDR, nacosConfig.getUrl());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
            properties.put(PropertyKeyConst.SECRET_KEY, nacosConfig.getAcm().getSecretKey());
        } else {
            properties.put(PropertyKeyConst.SERVER_ADDR, nacosConfig.getUrl());
            if (StringUtils.isNotBlank(nacosConfig.getNamespace())) {
                properties.put(PropertyKeyConst.NAMESPACE, nacosConfig.getNamespace());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
            properties.put(PropertyKeyConst.SERVER_ADDR, nacosConfig.getUrl());
            if (StringUtils.isNotBlank(nacosConfig.getNamespace())) {
                properties.put(PropertyKeyConst.NAMESPACE, nacosConfig.getNamespace());
            }
            if (nacosConfig.getUsername() != null) {
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
            }
            if (nacosConfig.getUsername() != null) {
                properties.put(PropertyKeyConst.USERNAME, nacosConfig.getUsername());
            }
            if (nacosConfig.getPassword() != null) {
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sync-data-center/shenyu-spring-boot-starter-sync-data-nacos/src/main/java/org/apache/shenyu/springboot/starter/sync/data/nacos/NacosSyncDataConfiguration.java`
#### Snippet
```java
            }
            if (nacosConfig.getPassword() != null) {
                properties.put(PropertyKeyConst.PASSWORD, nacosConfig.getPassword());
            }
        }
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-alert/src/main/java/org/apache/shenyu/alert/strategy/EmailStrategy.java`
#### Snippet
```java
    private Properties props(final EmailProp emailProp) {
        Properties props = new Properties();
        props.put("mail.smtp.host", emailProp.getHost());
        props.put("mail.smtp.port", emailProp.getPort());
        props.put("mail.smtp.auth", emailProp.getAuth());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-alert/src/main/java/org/apache/shenyu/alert/strategy/EmailStrategy.java`
#### Snippet
```java
        Properties props = new Properties();
        props.put("mail.smtp.host", emailProp.getHost());
        props.put("mail.smtp.port", emailProp.getPort());
        props.put("mail.smtp.auth", emailProp.getAuth());
        props.put("mail.smtp.starttls.enable", emailProp.getEnableTls());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-alert/src/main/java/org/apache/shenyu/alert/strategy/EmailStrategy.java`
#### Snippet
```java
        props.put("mail.smtp.host", emailProp.getHost());
        props.put("mail.smtp.port", emailProp.getPort());
        props.put("mail.smtp.auth", emailProp.getAuth());
        props.put("mail.smtp.starttls.enable", emailProp.getEnableTls());

```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-alert/src/main/java/org/apache/shenyu/alert/strategy/EmailStrategy.java`
#### Snippet
```java
        props.put("mail.smtp.port", emailProp.getPort());
        props.put("mail.smtp.auth", emailProp.getAuth());
        props.put("mail.smtp.starttls.enable", emailProp.getEnableTls());

        return props;
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataSyncConfiguration.java`
#### Snippet
```java
            if (Objects.nonNull(nacosProp.getAcm()) && nacosProp.getAcm().isEnabled()) {
                // Use aliyun ACM service
                properties.put(PropertyKeyConst.ENDPOINT, nacosProp.getAcm().getEndpoint());
                properties.put(PropertyKeyConst.NAMESPACE, nacosProp.getAcm().getNamespace());
                // Use subaccount ACM administrative authority
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataSyncConfiguration.java`
#### Snippet
```java
                // Use aliyun ACM service
                properties.put(PropertyKeyConst.ENDPOINT, nacosProp.getAcm().getEndpoint());
                properties.put(PropertyKeyConst.NAMESPACE, nacosProp.getAcm().getNamespace());
                // Use subaccount ACM administrative authority
                properties.put(PropertyKeyConst.ACCESS_KEY, nacosProp.getAcm().getAccessKey());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataSyncConfiguration.java`
#### Snippet
```java
                properties.put(PropertyKeyConst.NAMESPACE, nacosProp.getAcm().getNamespace());
                // Use subaccount ACM administrative authority
                properties.put(PropertyKeyConst.ACCESS_KEY, nacosProp.getAcm().getAccessKey());
                properties.put(PropertyKeyConst.SECRET_KEY, nacosProp.getAcm().getSecretKey());
            } else {
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataSyncConfiguration.java`
#### Snippet
```java
                // Use subaccount ACM administrative authority
                properties.put(PropertyKeyConst.ACCESS_KEY, nacosProp.getAcm().getAccessKey());
                properties.put(PropertyKeyConst.SECRET_KEY, nacosProp.getAcm().getSecretKey());
            } else {
                properties.put(PropertyKeyConst.SERVER_ADDR, nacosProp.getUrl());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataSyncConfiguration.java`
#### Snippet
```java
                properties.put(PropertyKeyConst.SECRET_KEY, nacosProp.getAcm().getSecretKey());
            } else {
                properties.put(PropertyKeyConst.SERVER_ADDR, nacosProp.getUrl());
                if (StringUtils.isNotBlank(nacosProp.getNamespace())) {
                    properties.put(PropertyKeyConst.NAMESPACE, nacosProp.getNamespace());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataSyncConfiguration.java`
#### Snippet
```java
                properties.put(PropertyKeyConst.SERVER_ADDR, nacosProp.getUrl());
                if (StringUtils.isNotBlank(nacosProp.getNamespace())) {
                    properties.put(PropertyKeyConst.NAMESPACE, nacosProp.getNamespace());
                }
                if (StringUtils.isNotBlank(nacosProp.getUsername())) {
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataSyncConfiguration.java`
#### Snippet
```java
                }
                if (StringUtils.isNotBlank(nacosProp.getUsername())) {
                    properties.put(PropertyKeyConst.USERNAME, nacosProp.getUsername());
                }
                if (StringUtils.isNotBlank(nacosProp.getPassword())) {
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/DataSyncConfiguration.java`
#### Snippet
```java
                }
                if (StringUtils.isNotBlank(nacosProp.getPassword())) {
                    properties.put(PropertyKeyConst.PASSWORD, nacosProp.getPassword());
                }
            }
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-nacos/src/main/java/org/apache/shenyu/register/client/nacos/NacosClientRegisterRepository.java`
#### Snippet
```java
        Properties properties = config.getProps();
        Properties nacosProperties = new Properties();
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, serverAddr);

        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty(NAMESPACE));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-nacos/src/main/java/org/apache/shenyu/register/client/nacos/NacosClientRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, serverAddr);

        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty(NAMESPACE));
        // the nacos authentication username
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-nacos/src/main/java/org/apache/shenyu/register/client/nacos/NacosClientRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty(NAMESPACE));
        // the nacos authentication username
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
        // the nacos authentication password
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-nacos/src/main/java/org/apache/shenyu/register/client/nacos/NacosClientRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty(PropertyKeyConst.USERNAME, ""));
        // the nacos authentication password
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
        // access key for namespace
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-nacos/src/main/java/org/apache/shenyu/register/client/nacos/NacosClientRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty(PropertyKeyConst.PASSWORD, ""));
        // access key for namespace
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
        // secret key for namespace
        nacosProperties.put(PropertyKeyConst.SECRET_KEY, properties.getProperty(PropertyKeyConst.SECRET_KEY, ""));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-nacos/src/main/java/org/apache/shenyu/register/client/nacos/NacosClientRegisterRepository.java`
#### Snippet
```java
        nacosProperties.put(PropertyKeyConst.ACCESS_KEY, properties.getProperty(PropertyKeyConst.ACCESS_KEY, ""));
        // secret key for namespace
        nacosProperties.put(PropertyKeyConst.SECRET_KEY, properties.getProperty(PropertyKeyConst.SECRET_KEY, ""));
        try {
            this.configService = ConfigFactory.createConfigService(nacosProperties);
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `shenyu-sdk/shenyu-sdk-core/src/main/java/org/apache/shenyu/sdk/core/client/AbstractShenyuSdkClient.java`
#### Snippet
```java
        this.requestInterceptors = requestInterceptors;
        Properties props = registerConfig.getProps();
        Boolean retryEnable = Optional.ofNullable(props.get("retry.enable")).map(e -> Boolean.parseBoolean(e.toString())).orElse(false);
        Long period = Optional.ofNullable(props.get("retry.period")).map(l -> Long.parseLong(l.toString())).orElse(100L);
        long maxPeriod = Optional.ofNullable(props.get("retry.maxPeriod")).map(l -> Long.parseLong(l.toString())).orElse(SECONDS.toMillis(1));
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `shenyu-sdk/shenyu-sdk-core/src/main/java/org/apache/shenyu/sdk/core/client/AbstractShenyuSdkClient.java`
#### Snippet
```java
        Properties props = registerConfig.getProps();
        Boolean retryEnable = Optional.ofNullable(props.get("retry.enable")).map(e -> Boolean.parseBoolean(e.toString())).orElse(false);
        Long period = Optional.ofNullable(props.get("retry.period")).map(l -> Long.parseLong(l.toString())).orElse(100L);
        long maxPeriod = Optional.ofNullable(props.get("retry.maxPeriod")).map(l -> Long.parseLong(l.toString())).orElse(SECONDS.toMillis(1));
        int maxAttempts = Optional.ofNullable(props.get("retry.maxAttempts")).map(l -> Integer.parseInt(l.toString())).orElse(5);
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `shenyu-sdk/shenyu-sdk-core/src/main/java/org/apache/shenyu/sdk/core/client/AbstractShenyuSdkClient.java`
#### Snippet
```java
        Boolean retryEnable = Optional.ofNullable(props.get("retry.enable")).map(e -> Boolean.parseBoolean(e.toString())).orElse(false);
        Long period = Optional.ofNullable(props.get("retry.period")).map(l -> Long.parseLong(l.toString())).orElse(100L);
        long maxPeriod = Optional.ofNullable(props.get("retry.maxPeriod")).map(l -> Long.parseLong(l.toString())).orElse(SECONDS.toMillis(1));
        int maxAttempts = Optional.ofNullable(props.get("retry.maxAttempts")).map(l -> Integer.parseInt(l.toString())).orElse(5);
        this.algorithm = props.getProperty("algorithm", "roundRobin");
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `shenyu-sdk/shenyu-sdk-core/src/main/java/org/apache/shenyu/sdk/core/client/AbstractShenyuSdkClient.java`
#### Snippet
```java
        Long period = Optional.ofNullable(props.get("retry.period")).map(l -> Long.parseLong(l.toString())).orElse(100L);
        long maxPeriod = Optional.ofNullable(props.get("retry.maxPeriod")).map(l -> Long.parseLong(l.toString())).orElse(SECONDS.toMillis(1));
        int maxAttempts = Optional.ofNullable(props.get("retry.maxAttempts")).map(l -> Integer.parseInt(l.toString())).orElse(5);
        this.algorithm = props.getProperty("algorithm", "roundRobin");
        this.scheme = props.getProperty("scheme", "http");
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/aspect/DataPermissionAspect.java`
#### Snippet
```java
     */
    @Pointcut("@annotation(org.apache.shenyu.admin.aspect.annotation.DataPermission)")
    public void dataPermissionCut() { }


```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/aspect/PageableAspect.java`
#### Snippet
```java
     */
    @Pointcut("@annotation(org.apache.shenyu.admin.aspect.annotation.Pageable)")
    public void pageableCut() {
    }
    
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/aspect/PrintApiLogAspect.java`
#### Snippet
```java
     */
    @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
    public void pointCut() {
    }
    
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerCallListener.java`
#### Snippet
```java

    @Override
    public void onHalfClose() {
        super.onHalfClose();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerCallListener.java`
#### Snippet
```java

    @Override
    public void onCancel() {
        super.onCancel();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerCallListener.java`
#### Snippet
```java

    @Override
    public void onComplete() {
        super.onComplete();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerCallListener.java`
#### Snippet
```java

    @Override
    public void onReady() {
        super.onReady();
    }
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/collector/AbstractLogCollector.java`
#### Snippet
```java
     * @param dataMaskAlg data mask algorithm
     */
    protected abstract void maskLog(L log, KeyWordMatch keyWordMatch, String dataMaskAlg);

    @Override
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/Publish.java`
#### Snippet
```java
     * todo qos0.
     */
    private void qos0() {

    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-consul/src/main/java/org/apache/shenyu/register/client/server/consul/ConsulConfigChangedEvent.java`
#### Snippet
```java

    @Override
    public Object getSource() {
        return super.getSource();
    }
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SearchCondition`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/query/PluginQueryCondition.java`
#### Snippet
```java
 * this is plugin query condition.
 */
public class PluginQueryCondition extends BaseExcludedSearchCondition implements SearchCondition, SwitchCondition {
    
    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SearchCondition`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/query/RecordLogQueryCondition.java`
#### Snippet
```java
 * RecordLogQueryCondition.
 */
public class RecordLogQueryCondition extends BaseExcludedSearchCondition implements SearchCondition {
    
    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SearchCondition`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/query/SelectorQueryCondition.java`
#### Snippet
```java
 * this is rule query condition.
 */
public class SelectorQueryCondition extends BaseExcludedSearchCondition implements SearchCondition, SwitchCondition {
    
    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SearchCondition`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/query/RuleQueryCondition.java`
#### Snippet
```java
 * this is rule query condition.
 */
public class RuleQueryCondition extends BaseExcludedSearchCondition implements SearchCondition, SwitchCondition {
    
    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/entity/MetaDataDO.java`
#### Snippet
```java
 * The type Meta data do.
 */
public final class MetaDataDO extends BaseDO implements Serializable {

    private static final long serialVersionUID = 3566656950011853160L;
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/result/ShenyuAdminResult.java`
#### Snippet
```java
 * ShenyuAdminResult.
 */
public class ShenyuAdminResult extends AdminResult<Object> implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SelectorHandleConverter`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/SpringCloudSelectorHandleConverter.java`
#### Snippet
```java
 */
@Component
public class SpringCloudSelectorHandleConverter extends AbstractSelectorHandleConverter implements SelectorHandleConverter {
    
    @Override
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `ShenyuClientRegisterService`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/AbstractShenyuClientRegisterServiceImpl.java`
#### Snippet
```java
 * Abstract strategy.
 */
public abstract class AbstractShenyuClientRegisterServiceImpl extends FallbackShenyuClientRegisterService implements ShenyuClientRegisterService {
    
    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SelectorHandleConverter`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/DubboSelectorHandleConverter.java`
#### Snippet
```java
 */
@Component
public class DubboSelectorHandleConverter extends AbstractSelectorHandleConverter implements SelectorHandleConverter {
    
    @Override
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SelectorHandleConverter`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/TarsSelectorHandleConverter.java`
#### Snippet
```java
 */
@Component
public class TarsSelectorHandleConverter extends AbstractSelectorHandleConverter implements SelectorHandleConverter {
    
    @Override
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SelectorHandleConverter`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/GrpcSelectorHandleConverter.java`
#### Snippet
```java
 */
@Component
public class GrpcSelectorHandleConverter extends AbstractSelectorHandleConverter implements SelectorHandleConverter {
    
    @Override
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SelectorHandleConverter`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/converter/DivideSelectorHandleConverter.java`
#### Snippet
```java
 */
@Component
public class DivideSelectorHandleConverter extends AbstractSelectorHandleConverter implements SelectorHandleConverter {
    
    @Override
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/HttpClientRegisterRepository.java`
#### Snippet
```java
        for (String server : serverList) {
            try {
                Optional<?> login = RegisterUtils.doLogin(username, password, server.concat(Constants.LOGIN_PATH));
                login.ifPresent(v -> this.accessToken = String.valueOf(v));
            } catch (Exception e) {
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/HttpClientRegisterRepository.java`
#### Snippet
```java
        for (String server : serverList) {
            i++;
            String concat = server.concat(path);
            try {
                if (StringUtils.isBlank(accessToken)) {
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ShenyuSignatureUtils.java`
#### Snippet
```java
            .map(key -> String.join("", key, map.get(key)))
            .collect(Collectors.joining()).trim()
            .concat(secureKey);
        return signContent;
    }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/exception/ExceptionHandlers.java`
#### Snippet
```java
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
        return ShenyuAdminResult.error(violations.stream()
                .map(v -> v.getPropertyPath().toString().concat(": ").concat(v.getMessage()))
                .collect(Collectors.joining("| ")));
    }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/exception/ExceptionHandlers.java`
#### Snippet
```java
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
        return ShenyuAdminResult.error(violations.stream()
                .map(v -> v.getPropertyPath().toString().concat(": ").concat(v.getMessage()))
                .collect(Collectors.joining("| ")));
    }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/exception/ExceptionHandlers.java`
#### Snippet
```java
        BindingResult bindingResult = e.getBindingResult();
        String errorMsg = bindingResult.getFieldErrors().stream()
                .map(f -> f.getField().concat(": ").concat(Optional.ofNullable(f.getDefaultMessage()).orElse("")))
                .collect(Collectors.joining("| "));
        return ShenyuAdminResult.error(String.format("Request error! invalid argument [%s]", errorMsg));
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/exception/ExceptionHandlers.java`
#### Snippet
```java
        BindingResult bindingResult = e.getBindingResult();
        String errorMsg = bindingResult.getFieldErrors().stream()
                .map(f -> f.getField().concat(": ").concat(Optional.ofNullable(f.getDefaultMessage()).orElse("")))
                .collect(Collectors.joining("| "));
        return ShenyuAdminResult.error(String.format("Request error! invalid argument [%s]", errorMsg));
```

## RuleId[ruleID=InstanceofCatchParameter]
### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `e`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-tencent-cls/src/main/java/org/apache/shenyu/plugin/tencent/cls/client/TencentClsLogCollectClient.java`
#### Snippet
```java
            LOG.warn("The current thread has been interrupted during send logs.");
        } catch (Exception e) {
            if (e instanceof MaxBatchCountExceedException) {
                LOG.error("The logs exceeds the maximum batch count, e={}", e.getMessage());
            } else if (e instanceof LogSizeTooLargeException) {
```

### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `e`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-tencent-cls/src/main/java/org/apache/shenyu/plugin/tencent/cls/client/TencentClsLogCollectClient.java`
#### Snippet
```java
            if (e instanceof MaxBatchCountExceedException) {
                LOG.error("The logs exceeds the maximum batch count, e={}", e.getMessage());
            } else if (e instanceof LogSizeTooLargeException) {
                LOG.error("The size of log is larger than the maximum allowable size, e={}", e.getMessage());
            } else {
```

### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `e`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-aliyun-sls/src/main/java/org/apache/shenyu/plugin/aliyun/sls/client/AliyunSlsLogCollectClient.java`
#### Snippet
```java
            LOG.warn("The current thread has been interrupted during send logs.");
        } catch (Exception e) {
            if (e instanceof MaxBatchCountExceedException) {
                LOG.error("The logs exceeds the maximum batch count, e={}", e.getMessage());
            } else if (e instanceof LogSizeTooLargeException) {
```

### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `e`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-aliyun-sls/src/main/java/org/apache/shenyu/plugin/aliyun/sls/client/AliyunSlsLogCollectClient.java`
#### Snippet
```java
            if (e instanceof MaxBatchCountExceedException) {
                LOG.error("The logs exceeds the maximum batch count, e={}", e.getMessage());
            } else if (e instanceof LogSizeTooLargeException) {
                LOG.error("The size of log is larger than the maximum allowable size, e={}", e.getMessage());
            } else {
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### RuleId[ruleID=StringBufferReplaceableByStringBuilder]
`StringBuffer strHexString` may be declared as 'StringBuilder'
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ShaUtils.java`
#### Snippet
```java
                messageDigest.update(item.getBytes());
                byte[] byteBuffer = messageDigest.digest();
                StringBuffer strHexString = new StringBuffer();
                for (byte b:byteBuffer) {
                    String hex = Integer.toHexString(0xff & b);
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-plugin/shenyu-plugin-api/src/main/java/org/apache/shenyu/plugin/api/utils/BodyParamUtils.java`
#### Snippet
```java
            }
        }).toArray();
        String[] paramTypes = paramTypeList.toArray(new String[0]);
        return new ImmutablePair<>(paramTypes, objects);
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
            qualifierList = Collections.singletonList(getQualifier(client));
        }
        return !qualifierList.isEmpty() ? qualifierList.toArray(new String[0]) : null;
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/param/SofaParamResolveServiceImpl.java`
#### Snippet
```java
            values.add(convertToParameterValue(params.get(paramIndex), parameter));
        }
        return new ImmutablePair<>(parameterTypeArr.toArray(new String[0]), values.toArray());
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/proxy/SofaProxyService.java`
#### Snippet
```java
        Pair<String[], Object[]> pair;
        if (StringUtils.isBlank(metaData.getParameterTypes()) || ParamCheckUtils.bodyIsEmpty(body)) {
            pair = new ImmutablePair<>(new String[]{}, new Object[]{});
        } else {
            pair = sofaParamResolveService.buildParameter(body, metaData.getParameterTypes());
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/proxy/SofaProxyService.java`
#### Snippet
```java
        Pair<String[], Object[]> pair;
        if (StringUtils.isBlank(metaData.getParameterTypes()) || ParamCheckUtils.bodyIsEmpty(body)) {
            pair = new ImmutablePair<>(new String[]{}, new Object[]{});
        } else {
            pair = sofaParamResolveService.buildParameter(body, metaData.getParameterTypes());
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-protocol/shenyu-protocol-grpc/src/main/java/org/apache/shenyu/protocol/grpc/message/JsonMessage.java`
#### Snippet
```java
        try {
            Descriptors.FileDescriptor fileDescriptor = Descriptors.FileDescriptor
                    .buildFrom(fileDescriptorProto, new Descriptors.FileDescriptor[0]);
            return fileDescriptor.findMessageTypeByName(GrpcConstants.JSON_DESCRIPTOR_PROTO_NAME);
        } catch (Descriptors.DescriptorValidationException e) {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-plugin/shenyu-plugin-metrics/src/main/java/org/apache/shenyu/plugin/metrics/reporter/MetricsReporter.java`
#### Snippet
```java
    
    private static String[] getLabelNames(final List<String> labels) {
        return labels.toArray(new String[0]);
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ShenyuSignatureUtils.java`
#### Snippet
```java

        List<String> storedKeys = Arrays.stream(map.keySet()
                .toArray(new String[] {}))
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/proxy/AlibabaDubboProxyService.java`
#### Snippet
```java
            Pair<String[], Object[]> pair;
            if (StringUtils.isBlank(metaData.getParameterTypes()) || ParamCheckUtils.bodyIsEmpty(body)) {
                pair = new ImmutablePair<>(new String[]{}, new Object[]{});
            } else {
                pair = dubboParamResolveService.buildParameter(body, metaData.getParameterTypes());
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/proxy/AlibabaDubboProxyService.java`
#### Snippet
```java
            Pair<String[], Object[]> pair;
            if (StringUtils.isBlank(metaData.getParameterTypes()) || ParamCheckUtils.bodyIsEmpty(body)) {
                pair = new ImmutablePair<>(new String[]{}, new Object[]{});
            } else {
                pair = dubboParamResolveService.buildParameter(body, metaData.getParameterTypes());
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/Md5Utils.java`
#### Snippet
```java
            throw new ShenyuException("MD5 not supported", e);
        }
        byte[] byteArray = new byte[0];
        try {
            byteArray = src.getBytes(charset);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java

        // convert list to array
        Class<?>[] classGroups = groups.toArray(new Class<?>[0]);

        Object parameterBean = getMethodParameterBean(clazz, method, arguments);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/proxy/ApacheDubboProxyService.java`
#### Snippet
```java
        Pair<String[], Object[]> pair;
        if (StringUtils.isBlank(metaData.getParameterTypes()) || ParamCheckUtils.bodyIsEmpty(body)) {
            pair = new ImmutablePair<>(new String[]{}, new Object[]{});
        } else {
            pair = dubboParamResolveService.buildParameter(body, metaData.getParameterTypes());
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/proxy/ApacheDubboProxyService.java`
#### Snippet
```java
        Pair<String[], Object[]> pair;
        if (StringUtils.isBlank(metaData.getParameterTypes()) || ParamCheckUtils.bodyIsEmpty(body)) {
            pair = new ImmutablePair<>(new String[]{}, new Object[]{});
        } else {
            pair = dubboParamResolveService.buildParameter(body, metaData.getParameterTypes());
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on a class may have unforeseen side-effects
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientProxyFactory.java`
#### Snippet
```java
        }

        synchronized (apiClass) {
            Object proxy = Proxy.newProxyInstance(apiClass.getClassLoader(),
                    new Class<?>[]{apiClass},
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimerTaskList.java`
#### Snippet
```java
        while (!done) {
            timerTaskEntry.remove();
            synchronized (this) {
                if (timerTaskEntry.list == null) {
                    TimerTaskEntry tail = root.prev;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimerTaskList.java`
#### Snippet
```java
     */
    public void remove(final TimerTaskEntry timerTaskEntry) {
        synchronized (this) {
            if (timerTaskEntry.list == this) {
                timerTaskEntry.next.prev = timerTaskEntry.prev;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimingWheel.java`
#### Snippet
```java
        TimerTaskList bucket = buckets[index];
        if (bucket == null) {
            synchronized (this) {
                bucket = buckets[index];
                if (bucket == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/FreshBeanHolder.java`
#### Snippet
```java
        O fresh = function.apply(e);
        if (fresh != null) {
            synchronized (this) {
                this.o = fresh;
            }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-eureka/src/main/java/org/apache/shenyu/register/instance/eureka/EurekaInstanceRegisterRepository.java`
#### Snippet
```java
    public List<InstanceEntity> selectInstancesAndWatcher(final String selectKey, final WatcherListener watcherListener) {
        if (!watcher.contains(selectKey)) {
            synchronized (this) {
                if (!watcher.contains(selectKey)) {
                    watcher.add(selectKey);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginLoader.java`
#### Snippet
```java
            return clazz;
        }
        synchronized (this) {
            clazz = classCache.get(name);
            if (clazz == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on a class may have unforeseen side-effects
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginLoader.java`
#### Snippet
```java
    public static ShenyuPluginLoader getInstance() {
        if (null == pluginLoader) {
            synchronized (ShenyuPluginLoader.class) {
                if (null == pluginLoader) {
                    pluginLoader = new ShenyuPluginLoader();
```

## RuleId[ruleID=DoubleBraceInitialization]
### RuleId[ruleID=DoubleBraceInitialization]
Double brace initialization
in `shenyu-plugin/shenyu-plugin-response/src/main/java/org/apache/shenyu/plugin/response/strategy/WebClientMessageWriter.java`
#### Snippet
```java
        // octet-stream => octet-stream
        // force-download => force-download
        Set<String> commonBinaryTypes = new HashSet<String>() {
            {
                add("image");
```

### RuleId[ruleID=DoubleBraceInitialization]
Double brace initialization
in `shenyu-plugin/shenyu-plugin-response/src/main/java/org/apache/shenyu/plugin/response/strategy/WebClientMessageWriter.java`
#### Snippet
```java
     * the cross headers.
     */
    private static final Set<String> CORS_HEADERS = new HashSet<String>() {
        {
            add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS);
```

### RuleId[ruleID=DoubleBraceInitialization]
Double brace initialization
in `shenyu-common/src/main/java/org/apache/shenyu/common/config/ShenyuConfig.java`
#### Snippet
```java

        static {
            DEFAULT_ALLOWED_HEADERS = new HashSet<String>() {
                {
                    add("x-requested-with");
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'TagRelationQuery' type conflicts with preceding 'instanceof TagQuery' check
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/query/TagRelationQuery.java`
#### Snippet
```java
            return false;
        }
        TagRelationQuery that = (TagRelationQuery) o;
        return Objects.equals(apiId, that.apiId)
                && Objects.equals(tagId, that.tagId);
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `ext` initializer `""` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java
     */
    private String buildExtParamByParentTag(final TagDO parentTagDO) {
        String ext = "";
        if (parentTagDO.getId().equals(AdminConstants.TAG_ROOT_PARENT_ID)) {
            final TagDO.TagExt parent = new TagDO.TagExt();
```

### RuleId[ruleID=UnusedAssignment]
Variable `n` initializer `0` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
        public static byte[] toBytes(final InputStream input) throws IOException {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            int n = 0;
            byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];

```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `Objects.isNull(reference)` is always `false`
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/proxy/SofaProxyService.java`
#### Snippet
```java
    public Mono<Object> genericInvoker(final String body, final MetaData metaData, final ServerWebExchange exchange) throws ShenyuException {
        ConsumerConfig<GenericService> reference = ApplicationConfigCache.getInstance().get(metaData.getPath());
        if (Objects.isNull(reference) || StringUtils.isEmpty(reference.getInterfaceId())) {
            ApplicationConfigCache.getInstance().invalidate(metaData.getPath());
            reference = ApplicationConfigCache.getInstance().initRef(metaData);
```

### RuleId[ruleID=ConstantValue]
Condition `Objects.isNull(config)` is always `false`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-kafka/src/main/java/org/apache/shenyu/plugin/logging/kafka/client/KafkaLogCollectClient.java`
#### Snippet
```java
    @Override
    public void initClient0(@NonNull final KafkaLogCollectConfig.KafkaLogConfig config) {
        if (Objects.isNull(config)
                || StringUtils.isBlank(config.getNamesrvAddr())
                || StringUtils.isBlank(config.getTopic())) {
```

### RuleId[ruleID=ConstantValue]
Condition `Objects.nonNull(webSocketClient)` is always `true`
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
    @Override
    protected String buildApiSuperPath(final Class<?> clazz, @NonNull final ShenyuSpringWebSocketClient webSocketClient) {
        if (Objects.nonNull(webSocketClient) && StringUtils.isNotBlank(webSocketClient.path())) {
            return webSocketClient.path();
        }
```

### RuleId[ruleID=ConstantValue]
Condition `Objects.nonNull(beanShenyuClient)` is always `true`
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
        final String superPath = buildApiSuperPath(clazz, beanShenyuClient);
        // Compatible with previous versions
        if (Objects.nonNull(beanShenyuClient)) {
            handleClass(clazz, bean, beanShenyuClient, superPath);
            return;
```

### RuleId[ruleID=ConstantValue]
Condition `Objects.nonNull(methodShenyuClient)` is always `true`
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
    @Override
    protected String buildApiPath(final Method method, final String superPath, @NonNull final ShenyuSpringWebSocketClient methodShenyuClient) {
        if (Objects.nonNull(methodShenyuClient) && StringUtils.isNotBlank(methodShenyuClient.path())) {
            return pathJoin(getContextPath(), superPath, methodShenyuClient.path());
        }
```

### RuleId[ruleID=ConstantValue]
Condition `Objects.isNull(reference)` is always `false`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/proxy/AlibabaDubboProxyService.java`
#### Snippet
```java
    public ResponseFuture genericInvoker(final String body, final MetaData metaData) throws ShenyuException {
        ReferenceConfig<GenericService> reference = AlibabaDubboConfigCache.getInstance().get(metaData.getPath());
        if (Objects.isNull(reference) || StringUtils.isEmpty(reference.getInterface())) {
            AlibabaDubboConfigCache.getInstance().invalidate(metaData.getPath());
            reference = AlibabaDubboConfigCache.getInstance().initRef(metaData);
```

### RuleId[ruleID=ConstantValue]
Result of `Objects.nonNull(AlibabaDubboConfigCache.getInstance().get(metaData.getPath()))` is always 'true'
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-alibaba-dubbo/src/main/java/org/apache/shenyu/plugin/alibaba/dubbo/handler/AlibabaDubboMetaDataHandler.java`
#### Snippet
```java
    @Override
    protected boolean isInitialized(final MetaData metaData) {
        return Objects.nonNull(AlibabaDubboConfigCache.getInstance().get(metaData.getPath()));
    }

```

### RuleId[ruleID=ConstantValue]
Condition `Objects.isNull(ApplicationConfigCache.getInstance().get(exist.getPath()))` is always `false`
in `shenyu-plugin/shenyu-plugin-motan/src/main/java/org/apache/shenyu/plugin/motan/handler/MotanMetaDataHandler.java`
#### Snippet
```java
        try {
            MetaData exist = META_DATA.get(metaData.getPath());
            if (Objects.isNull(exist) || Objects.isNull(ApplicationConfigCache.getInstance().get(exist.getPath()))
                    || Objects.isNull(ApplicationConfigCache.getInstance().get(exist.getPath()).getRef())) {
                // The first initialization
```

### RuleId[ruleID=ConstantValue]
Condition `Objects.isNull(reference)` is always `false`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/proxy/ApacheDubboProxyService.java`
#### Snippet
```java
    public Mono<Object> genericInvoker(final String body, final MetaData metaData, final ServerWebExchange exchange) throws ShenyuException {
        ReferenceConfig<GenericService> reference = ApacheDubboConfigCache.getInstance().get(metaData.getPath());
        if (Objects.isNull(reference) || StringUtils.isEmpty(reference.getInterface())) {
            ApacheDubboConfigCache.getInstance().invalidate(metaData.getPath());
            reference = ApacheDubboConfigCache.getInstance().initRef(metaData);
```

### RuleId[ruleID=ConstantValue]
Result of `Objects.nonNull(ApacheDubboConfigCache.getInstance().get(metaData.getPath()))` is always 'true'
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/handler/ApacheDubboMetaDataHandler.java`
#### Snippet
```java
    @Override
    protected boolean isInitialized(final MetaData metaData) {
        return Objects.nonNull(ApacheDubboConfigCache.getInstance().get(metaData.getPath()));
    }

```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-mask-api/src/main/java/org/apache/shenyu/plugin/logging/mask/api/matcher/KeyWordMatch.java`
#### Snippet
```java
                sb.append(tempKeyWord);
            } else {
                sb.append("^" + tempKeyWord.substring(0, 3) + "(.*?)" + tempKeyWord.substring(tempKeyWord.length() - 3) + "$");
            }
            sb.append("||");
```

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'Socket' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `shenyu-plugin/shenyu-plugin-mqtt/src/main/java/org/apache/shenyu/plugin/mqtt/handler/MqttPluginDataHandler.java`
#### Snippet
```java
        try {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            new Socket(address, port);
            flag = true;
        } catch (Exception ignored) {
```

## RuleId[ruleID=SocketResource]
### RuleId[ruleID=SocketResource]
'Socket' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `shenyu-plugin/shenyu-plugin-mqtt/src/main/java/org/apache/shenyu/plugin/mqtt/handler/MqttPluginDataHandler.java`
#### Snippet
```java
        try {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            new Socket(address, port);
            flag = true;
        } catch (Exception ignored) {
```

## RuleId[ruleID=FieldMayBeStatic]
### RuleId[ruleID=FieldMayBeStatic]
Field `recyclePeriod` may be 'static'
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/spi/RoundRobinLoadBalancer.java`
#### Snippet
```java
public class RoundRobinLoadBalancer extends AbstractLoadBalancer {

    private final int recyclePeriod = 60000;

    private final ConcurrentMap<String, ConcurrentMap<String, WeightedRoundRobin>> methodWeightMap = new ConcurrentHashMap<>(16);
```

## RuleId[ruleID=RedundantLengthCheck]
### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/support/SpringMvcContract.java`
#### Snippet
```java

    private void parseHeaders(final RequestTemplate requestTemplate, final RequestMapping annotation) {
        if (annotation.headers().length > 0) {
            for (String header : annotation.headers()) {
                int index = header.indexOf('=');
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-zookeeper/src/main/java/org/apache/shenyu/register/instance/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = TreeCache.newBuilder(client, path).build();
        caches.put(path, cache);
        if (listeners != null && listeners.length > 0) {
            for (TreeCacheListener listener : listeners) {
                cache.getListenable().addListener(listener);
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-zookeeper/src/main/java/org/apache/shenyu/register/client/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = TreeCache.newBuilder(client, path).build();
        caches.put(path, cache);
        if (listeners != null && listeners.length > 0) {
            for (TreeCacheListener listener : listeners) {
                cache.getListenable().addListener(listener);
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `shenyu-sync-data-center/shenyu-sync-data-zookeeper/src/main/java/org/apache/shenyu/sync/data/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = TreeCache.newBuilder(client, path).build();
        caches.put(path, cache);
        if (listeners != null && listeners.length > 0) {
            for (TreeCacheListener listener : listeners) {
                cache.getListenable().addListener(listener);
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
    private static boolean hasConstraintParameter(final Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (parameterAnnotations.length > 0) {
            for (Annotation[] annotations : parameterAnnotations) {
                for (Annotation annotation : annotations) {
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        TreeCache cache = TreeCache.newBuilder(client, path).build();
        caches.put(path, cache);
        if (listeners != null && listeners.length > 0) {
            for (TreeCacheListener listener : listeners) {
                cache.getListenable().addListener(listener);
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
    private static boolean hasConstraintParameter(final Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (parameterAnnotations.length > 0) {
            for (Annotation[] annotations : parameterAnnotations) {
                for (Annotation annotation : annotations) {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PathMatchUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/utils/PathMatchUtils.java`
#### Snippet
```java
 * The type Path match utils.
 */
public class PathMatchUtils {

    private static final AntPathMatcher MATCHER = new AntPathMatcher();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `HttpParamConverter` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/utils/HttpParamConverter.java`
#### Snippet
```java
 * The type Http param converter.
 */
public final class HttpParamConverter {

    private static final Pattern PATTERN = Pattern.compile("([^&=]+)(=?)([^&]+)?");
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JsonServerServiceInterceptor` has only 'static' members, and lacks a 'private' constructor
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerServiceInterceptor.java`
#### Snippet
```java
 * Support json invoke.
 */
public class JsonServerServiceInterceptor {

    private static final Map<String, Class<?>> REQUEST_CLAZZ_MAP = Maps.newConcurrentMap();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JwtConvertStrategyFactory` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/strategy/JwtConvertStrategyFactory.java`
#### Snippet
```java
import org.apache.shenyu.spi.ExtensionLoader;

public class JwtConvertStrategyFactory {

    private static final String DEFAULT_JWT_CONVERTER = "default";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuClientProxyFactory` has only 'static' members, and lacks a 'private' constructor
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientProxyFactory.java`
#### Snippet
```java
 *
 */
public final class ShenyuClientProxyFactory {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuClientConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/constant/ShenyuClientConstants.java`
#### Snippet
```java
 * ShenyuClientConstants.
 */
public final class ShenyuClientConstants {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RegisterInfo` has only 'static' members, and lacks a 'private' constructor
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/model/bean/RegisterInfo.java`
#### Snippet
```java
 * RegisterInfo.
 */
public class RegisterInfo {

    private static String registerType;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuClientRegisterRepositoryFactory` has only 'static' members, and lacks a 'private' constructor
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/register/ShenyuClientRegisterRepositoryFactory.java`
#### Snippet
```java
 * The type shenyu client register repository factory.
 */
public final class ShenyuClientRegisterRepositoryFactory {
    
    private static final Map<String, ShenyuClientRegisterRepository> REPOSITORY_MAP = new ConcurrentHashMap<>();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PortUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/utils/PortUtils.java`
#### Snippet
```java
 * get the port number exposed by the current tomcat.
 */
public class PortUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuClientShutdownHook` has only 'static' members, and lacks a 'private' constructor
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
 * Shenyu client shutdown hook.
 */
public class ShenyuClientShutdownHook {

    private static final Logger LOG = LoggerFactory.getLogger(ShenyuClientShutdownHook.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuInstanceRegisterRepositoryFactory` has only 'static' members, and lacks a 'private' constructor
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-core/src/main/java/org/apache/shenyu/register/instance/core/ShenyuInstanceRegisterRepositoryFactory.java`
#### Snippet
```java
 * The type Shenyu instance register repository factory.
 */
public final class ShenyuInstanceRegisterRepositoryFactory {
    
    private static final Map<String, ShenyuInstanceRegisterRepository> REPOSITORY_MAP = new ConcurrentHashMap<>();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LogCollectUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/utils/LogCollectUtils.java`
#### Snippet
```java
 * log collect utils.
 */
public class LogCollectUtils {

    private static final List<String> BINARY_TYPE_LIST = Arrays.asList("image", "multipart", "cbor",
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GenericLoggingConstant` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-common/src/main/java/org/apache/shenyu/plugin/logging/common/constant/GenericLoggingConstant.java`
#### Snippet
```java
 * generic logging constant.
 */
public class GenericLoggingConstant {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GrpcConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-protocol/shenyu-protocol-grpc/src/main/java/org/apache/shenyu/protocol/grpc/constant/GrpcConstants.java`
#### Snippet
```java
 * Grpc constants.
 */
public class GrpcConstants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RegisterPathConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-register-center/shenyu-register-common/src/main/java/org/apache/shenyu/register/common/path/RegisterPathConstants.java`
#### Snippet
```java
 * zookeeper register center.
 */
public class RegisterPathConstants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LabelNames` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-metrics/src/main/java/org/apache/shenyu/plugin/metrics/constant/LabelNames.java`
#### Snippet
```java
 * The Label names.
 */
public final class LabelNames {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JsonMessage` has only 'static' members, and lacks a 'private' constructor
in `shenyu-protocol/shenyu-protocol-grpc/src/main/java/org/apache/shenyu/protocol/grpc/message/JsonMessage.java`
#### Snippet
```java
 * JsonMessage.
 */
public class JsonMessage {

    private static final Logger LOG = LoggerFactory.getLogger(JsonMessage.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `AlertStrategyFactory` has only 'static' members, and lacks a 'private' constructor
in `shenyu-alert/src/main/java/org/apache/shenyu/alert/AlertStrategyFactory.java`
#### Snippet
```java
 * The type alert strategy factory.
 */
public class AlertStrategyFactory {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MetricsReporter` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-metrics/src/main/java/org/apache/shenyu/plugin/metrics/reporter/MetricsReporter.java`
#### Snippet
```java
 * Metrics reporter.
 */
public final class MetricsReporter {
    
    private static MetricsRegister metricsRegister;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuAdminBootstrap` has only 'static' members, and lacks a 'private' constructor
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/ShenyuAdminBootstrap.java`
#### Snippet
```java
 */
@SpringBootApplication(exclude = {LdapAutoConfiguration.class})
public class ShenyuAdminBootstrap {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PageResultUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/page/PageResultUtils.java`
#### Snippet
```java
 * The type Page result utils.
 */
public class PageResultUtils {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `BaseTrigger` has only 'static' members, and lacks a 'private' constructor
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/BaseTrigger.java`
#### Snippet
```java
 * Trigger Base Utils.
 */
public class BaseTrigger {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `UploadUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/UploadUtils.java`
#### Snippet
```java
 * File upload tool.
 */
public class UploadUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuResultMessage` has only 'static' members, and lacks a 'private' constructor
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ShenyuResultMessage.java`
#### Snippet
```java
 *  result message.
 */
public final class ShenyuResultMessage {

    public static final String SUCCESS = "success";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ThreadLocalUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ThreadLocalUtils.java`
#### Snippet
```java
 * The type Thread local util.
 */
public class ThreadLocalUtils {
    
    private static final ThreadLocal<Map<String, Object>> THREAD_CONTEXT = ThreadLocal.withInitial(HashMap::new);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuSignatureUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ShenyuSignatureUtils.java`
#### Snippet
```java
 * Shenyu Signature tool.
 */
public class ShenyuSignatureUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CommonUpstreamUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/CommonUpstreamUtils.java`
#### Snippet
```java
 * Build upstream for rpc plugin.
 */
public class CommonUpstreamUtils {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
    }

    public static class FileUtils {

        /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuBootstrapApplication` has only 'static' members, and lacks a 'private' constructor
in `shenyu-bootstrap/src/main/java/org/apache/shenyu/bootstrap/ShenyuBootstrapApplication.java`
#### Snippet
```java
 */
@SpringBootApplication
public class ShenyuBootstrapApplication {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RandomUtil` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/util/RandomUtil.java`
#### Snippet
```java
 * Random Util.
 */
public class RandomUtil {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `WheelTimerFactory` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/WheelTimerFactory.java`
#### Snippet
```java
 * shared wheel time.
 */
public class WheelTimerFactory {
    
    private static final String NAME = "shared_wheel_timer";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Md5Utils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/Md5Utils.java`
#### Snippet
```java
 * The type Md5 utils.
 */
public class Md5Utils {
    /**
     * logger.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `UriUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/UriUtils.java`
#### Snippet
```java
 * uri util.
 */
public class UriUtils {
    
    private static final String PRE_FIX = "/";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PluginNameAdapter` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/PluginNameAdapter.java`
#### Snippet
```java
 * The type Plugin name adapter.
 */
public class PluginNameAdapter {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `UpstreamCheckUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/UpstreamCheckUtils.java`
#### Snippet
```java
 * The type Uri utils.
 */
public class UpstreamCheckUtils {

    private static final String HTTP = "http";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShaUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ShaUtils.java`
#### Snippet
```java
 * The type SHA utils.
 */
public class ShaUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PathUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/PathUtils.java`
#### Snippet
```java
 * The type Path utils.
 */
public final class PathUtils {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ParamCheckUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ParamCheckUtils.java`
#### Snippet
```java
 * The type Param check utils.
 */
public class ParamCheckUtils {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ObjectTypeUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ObjectTypeUtils.java`
#### Snippet
```java
 * ObjectTypeUtils.
 */
public final class ObjectTypeUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ThreadUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ThreadUtils.java`
#### Snippet
```java
 * thread utils.
 */
public class ThreadUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ContextPathUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ContextPathUtils.java`
#### Snippet
```java
 * The type Context path utils.
 */
public class ContextPathUtils {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LogUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/LogUtils.java`
#### Snippet
```java
 * LogUtils.
 */
public final class LogUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SpiLoadFactory` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/SpiLoadFactory.java`
#### Snippet
```java
 * SpiLoadFactory.
 */
public class SpiLoadFactory {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RuleHandleConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/constant/RuleHandleConstants.java`
#### Snippet
```java
 * The Constants for RuleHandles.
 */
public final class RuleHandleConstants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ResourceTypeConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/constant/ResourceTypeConstants.java`
#### Snippet
```java
 * The Constants for Resource Type.
 */
public final class ResourceTypeConstants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NacosPathConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/constant/NacosPathConstants.java`
#### Snippet
```java
 * Nacos path constants.
 */
public final class NacosPathConstants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DubboParamConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/constant/DubboParamConstants.java`
#### Snippet
```java
 * DubboParamConstants.
 */
public final class DubboParamConstants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConsulConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/constant/ConsulConstants.java`
#### Snippet
```java
 * Consul constants.
 */
public final class ConsulConstants {

    public static final String SYNC_PRE_FIX = "shenyu/sync";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `HttpConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/constant/HttpConstants.java`
#### Snippet
```java
 * @since 2.0.0
 */
public final class HttpConstants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `AdminConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/constant/AdminConstants.java`
#### Snippet
```java
 * The type Admin constants.
 */
public final class AdminConstants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CommonErrorCode` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/exception/CommonErrorCode.java`
#### Snippet
```java
 * CommonErrorCode.
 */
public class CommonErrorCode {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MemoryLimitCalculator` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitCalculator.java`
#### Snippet
```java
 * @see org.apache.shenyu.common.concurrent.MemoryLimiter
 */
public class MemoryLimitCalculator {

    private static volatile long maxAvailable;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JsonUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/JsonUtils.java`
#### Snippet
```java
 * JsonUtils.
 */
public final class JsonUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DataMaskFactory` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-mask-api/src/main/java/org/apache/shenyu/plugin/logging/mask/api/factory/DataMaskFactory.java`
#### Snippet
```java
 * shenyu logging mask factory.
 */
public final class DataMaskFactory {

    public DataMaskFactory() {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DataMaskUtils` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-mask-api/src/main/java/org/apache/shenyu/plugin/logging/mask/api/utils/DataMaskUtils.java`
#### Snippet
```java
 * data mask utils.
 */
public final class DataMaskUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `EncryptUtil` has only 'static' members, and lacks a 'private' constructor
in `shenyu-protocol/shenyu-protocol-mqtt/src/main/java/org/apache/shenyu/protocol/mqtt/utils/EncryptUtil.java`
#### Snippet
```java
 * encrypt util.
 */
public class EncryptUtil {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InstancePathConstants` has only 'static' members, and lacks a 'private' constructor
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-api/src/main/java/org/apache/shenyu/register/instance/api/path/InstancePathConstants.java`
#### Snippet
```java
 * zookeeper register center.
 */
public class InstancePathConstants {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `shenyu-sdk/shenyu-sdk-core/src/main/java/org/apache/shenyu/sdk/core/util/Util.java`
#### Snippet
```java
 * Utilities, typically copied in from guava, so as to avoid dependency conflicts.
 */
public final class Util {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ShenyuSdkClientFactory` has only 'static' members, and lacks a 'private' constructor
in `shenyu-sdk/shenyu-sdk-core/src/main/java/org/apache/shenyu/sdk/core/client/ShenyuSdkClientFactory.java`
#### Snippet
```java
 * The type Shenyu sdk client factory.
 */
public class ShenyuSdkClientFactory {

    private static final Map<String, ShenyuSdkClient> SDK_CLIENT_MAP = new ConcurrentHashMap<>();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClickHouseLoggingConstant` has only 'static' members, and lacks a 'private' constructor
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-clickhouse/src/main/java/org/apache/shenyu/plugin/logging/clickhouse/constant/ClickHouseLoggingConstant.java`
#### Snippet
```java
 * clickHouse logging Constant.
 */
public class ClickHouseLoggingConstant {

    /**
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `shenyu-common/src/main/java/org/apache/shenyu/common/enums/PluginHandlerEventEnum.java`
#### Snippet
```java
     * plugin sorted.
     */
    SORTED;
}

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `interfaceClass` may produce `NullPointerException`
in `shenyu-client/shenyu-client-motan/src/main/java/org/apache/shenyu/client/motan/MotanServiceEventListener.java`
#### Snippet
```java
                .collect(Collectors.joining(","));
        String serviceName;
        if (void.class.equals(service.interfaceClass())) {
            if (clazz.getInterfaces().length > 0) {
                serviceName = clazz.getInterfaces()[0].getName();
```

### RuleId[ruleID=DataFlowIssue]
Argument `values` might be null
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/support/SpringMvcContract.java`
#### Snippet
```java
        Assert.state(values != null && (values.length == 0 || values.length == 1),
                String.format("Method %s can only contain at most 1 %s field. Found: %s",
                        method.getName(), fieldName, Arrays.asList(values)));
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `method` may produce `NullPointerException`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/support/SpringMvcContract.java`
#### Snippet
```java
        RequestMapping methodMapping = findMergedAnnotation(method, RequestMapping.class);
        // HTTP Method
        RequestMethod[] methods = methodMapping.method();
        if (methods.length == 0) {
            methods = new RequestMethod[] {RequestMethod.GET};
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `newBuilder` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
    public String get(final String url, final Map<String, Object> query) throws IOException {
        Request.Builder reqBuild = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        query.forEach((K, V) -> urlBuilder.addQueryParameter(K, String.valueOf(V)));
        reqBuild.url(urlBuilder.build());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
        reqBuild.url(urlBuilder.build());
        Request request = reqBuild.build();
        return client.newCall(request).execute().body().string();
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
                .post(body)
                .build();
        return client.newCall(request).execute().body().string();
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
                .post(body)
                .build();
        return client.newCall(request).execute().body().string();
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `newBuilder` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
    public String get(final String url, final String userName, final String passWord) throws IOException {
        Request.Builder reqBuild = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        urlBuilder.addQueryParameter(Constants.USER_NAME, userName);
        urlBuilder.addQueryParameter(Constants.PASS_WORD, passWord);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-http/src/main/java/org/apache/shenyu/register/client/http/utils/OkHttpTools.java`
#### Snippet
```java
        reqBuild.url(urlBuilder.build());
        Request request = reqBuild.build();
        return client.newCall(request).execute().body().string();
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java

        Set<String> basePackages = new HashSet<>();
        for (String pkg : (String[]) attributes.get("value")) {
            if (StringUtils.hasText(pkg)) {
                basePackages.add(pkg);
```

### RuleId[ruleID=DataFlowIssue]
Argument `beanFactory` might be null
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
        String name = getName(attributes);
        ShenyuClientFactoryBean factoryBean = new ShenyuClientFactoryBean();
        factoryBean.setBeanFactory(beanFactory);
        factoryBean.setName(name);
        factoryBean.setContextId(contextId);
```

### RuleId[ruleID=DataFlowIssue]
Argument `field` might be null
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/cache/ApplicationConfigCache.java`
#### Snippet
```java
    private void setAsyncRuntimeThreadPool(final ThreadPoolExecutor threadPool) {
        Field field = ReflectionUtils.findField(AsyncRuntime.class, "asyncThreadPool");
        ReflectionUtils.makeAccessible(field);
        ReflectionUtils.setField(field, AsyncRuntime.class, threadPool);
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `beanShenyuClient` might be null
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
        Class<?> clazz = getCorrectedClass(bean);
        final ShenyuSpringWebSocketClient beanShenyuClient = AnnotatedElementUtils.findMergedAnnotation(clazz, getAnnotationType());
        final String superPath = buildApiSuperPath(clazz, beanShenyuClient);
        // Compatible with previous versions
        if (Objects.nonNull(beanShenyuClient)) {
```

### RuleId[ruleID=DataFlowIssue]
Passing `null` argument to parameter annotated as @NotNull
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/ApacheDubboServiceBeanListener.java`
#### Snippet
```java
        Method[] methods = ReflectionUtils.getDeclaredMethods(clazz);
        for (Method method : methods) {
            getPublisher().publishEvent(buildMetaDataDTO(bean, beanShenyuClient, buildApiPath(method, superPath, null), clazz, method));
        }
    }
```

### RuleId[ruleID=DataFlowIssue]
Casting `o` to `TagRelationQuery` will produce `ClassCastException` for any non-null value
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/query/TagRelationQuery.java`
#### Snippet
```java
            return false;
        }
        TagRelationQuery that = (TagRelationQuery) o;
        return Objects.equals(apiId, that.apiId)
                && Objects.equals(tagId, that.tagId);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setAccessible` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/config/SwaggerConfiguration.java`
#### Snippet
```java
                try {
                    Field field = ReflectionUtils.findField(bean.getClass(), "handlerMappings");
                    field.setAccessible(true);
                    return (List<RequestMappingInfoHandlerMapping>) field.get(bean);
                } catch (IllegalArgumentException | IllegalAccessException e) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getLoginField` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DashboardUserServiceImpl.java`
#### Snippet
```java
    private DashboardUserVO loginByLdap(final String userName, final String password) {
        Assert.notNull(ldapProperties, "ldap config is not enable");
        String searchBase = String.format("%s=%s,%s", ldapProperties.getLoginField(), LdapEncoder.nameEncode(userName), ldapProperties.getBaseDn());
        String filter = String.format("(objectClass=%s)", ldapProperties.getObjectClass());
        try {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
    public String requestFileString(final String url, final Map<String, ?> form, final Map<String, String> header,
        final List<UploadFile> files) throws IOException {
        return requestFile(url, form, header, files).body().string();
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
            .execute();
        try {
            return response.body().string();
        } finally {
            response.close();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
            .execute();
        try {
            return response.body().string();
        } finally {
            response.close();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `newBuilder` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
     */
    public static HttpUrl buildHttpUrl(final String url, final Map<String, ?> form) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        if (Objects.nonNull(form) && !form.isEmpty()) {
            for (Map.Entry<String, ?> entry : form.entrySet()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
        Request request = builder.build();
        Response response = httpClient.newCall(request).execute();
        return response.body().string();
    }

```

### RuleId[ruleID=DataFlowIssue]
Argument `signContent` might be null
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/controller/SandboxController.java`
#### Snippet
```java
        }
        if (StringUtils.isNotEmpty(appKey)) {
            response.addHeader("sandbox-beforesign", UriUtils.encode(signContent, StandardCharsets.UTF_8));
            response.addHeader("sandbox-sign", UriUtils.encode(sign, StandardCharsets.UTF_8));
        }
```

### RuleId[ruleID=DataFlowIssue]
Argument `sign` might be null
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/controller/SandboxController.java`
#### Snippet
```java
        if (StringUtils.isNotEmpty(appKey)) {
            response.addHeader("sandbox-beforesign", UriUtils.encode(signContent, StandardCharsets.UTF_8));
            response.addHeader("sandbox-sign", UriUtils.encode(sign, StandardCharsets.UTF_8));
        }
        IOUtils.copy(body.byteStream(), response.getOutputStream());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getParameterTypes` may produce `NullPointerException`
in `shenyu-plugin/shenyu-plugin-tars/src/main/java/org/apache/shenyu/plugin/tars/TarsPlugin.java`
#### Snippet
```java
            return WebFluxResultUtils.result(exchange, error);
        }
        if (StringUtils.isNoneBlank(metaData.getParameterTypes()) && StringUtils.isBlank(body)) {
            exchange.getResponse().setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
            Object error = ShenyuResultWrap.error(exchange, ShenyuResultEnum.TARS_HAVE_BODY_PARAM);
```

### RuleId[ruleID=DataFlowIssue]
Argument `field` might be null
in `shenyu-plugin/shenyu-plugin-tars/src/main/java/org/apache/shenyu/plugin/tars/cache/ApplicationConfigCache.java`
#### Snippet
```java
    private void setCommunicatorThreadPool(final ThreadPoolExecutor threadPool) {
        Field field = ReflectionUtils.findField(Communicator.class, "threadPoolExecutor");
        ReflectionUtils.makeAccessible(field);
        ReflectionUtils.setField(field, communicator, threadPool);
    }
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java
        List<TagDO> allData = tagMapper.selectByQuery(new TagQuery());
        Map<String, TagDO> allDataMap = new ConcurrentHashMap<>();
        allData.stream().forEach(tagDO -> allDataMap.put(tagDO.getId(), tagDO));
        TagDO update = TagDO.buildTagDO(tagDTO);
        allDataMap.put(update.getId(), update);
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java
        }
        List<String> subTagIds = relationMap.get(id);
        subTagIds.stream().forEach(tagId -> {
            TagDO tagDO = allData.get(tagId);
            tagDO.setExt(buildExtParamByParentTag(allData.get(id)));
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with '.keySet().stream()'
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
        return map.entrySet().stream()
                .filter(e -> e.getKey().contains(prefix))
                .map(e -> getSubNodeKeyName(prefix, e.getKey(), separator))
                .distinct()
                .filter(e -> Objects.nonNull(e))
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
                .map(e -> getSubNodeKeyName(prefix, e.getKey(), separator))
                .distinct()
                .filter(e -> Objects.nonNull(e))
                .collect(Collectors.toList());
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
                .map(e -> getSubNodeKeyName(prefix, e.getKey().toString(UTF_8), separator))
                .distinct()
                .filter(e -> Objects.nonNull(e))
                .collect(Collectors.toList());
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/cache/UpstreamCacheManager.java`
#### Snippet
```java
     */
    public void submit(final String selectorId, final List<Upstream> upstreamList) {
        List<Upstream> validUpstreamList = upstreamList.stream().filter(upstream -> upstream.isStatus()).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(validUpstreamList)) {
            List<Upstream> existUpstream = UPSTREAM_MAP.computeIfAbsent(selectorId, k -> Lists.newArrayList());
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'data' in a Serializable class
in `shenyu-plugin/shenyu-plugin-api/src/main/java/org/apache/shenyu/plugin/api/result/DefaultShenyuEntity.java`
#### Snippet
```java

    @JsonBackReference
    private Object data;

    /**
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'code' in a Serializable class
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/vo/EnumVO.java`
#### Snippet
```java
     * enum code.
     */
    private Object code;

    /**
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'after' in a Serializable class
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/event/AdminDataModelChangedEvent.java`
#### Snippet
```java
     * after data.
     */
    private final Object after;
    
    /**
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'before' in a Serializable class
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/event/AdminDataModelChangedEvent.java`
#### Snippet
```java
     * before data.
     */
    private final Object before;
    
    /**
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'allPermissionInfo' in a Serializable class
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/vo/RoleEditVO.java`
#### Snippet
```java
     *  all permission info.
     */
    private PermissionInfo allPermissionInfo;

    public RoleEditVO() {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'memoryLimiter' in a Serializable class
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitedLinkedBlockingQueue.java`
#### Snippet
```java
    private static final long serialVersionUID = -6106022470621447542L;

    private final MemoryLimiter memoryLimiter;

    public MemoryLimitedLinkedBlockingQueue(final Instrumentation inst) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'requestTemplate' in a Serializable class
in `shenyu-sdk/shenyu-sdk-core/src/main/java/org/apache/shenyu/sdk/core/ShenyuRequest.java`
#### Snippet
```java
    private final String body;

    private final RequestTemplate requestTemplate;

    /**
```

## RuleId[ruleID=MismatchedJavadocCode]
### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return count but the return type is list
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mapper/PluginHandleMapper.java`
#### Snippet
```java
     *
     * @param ids a list of ids
     * @return the count of deleted
     */
    List<PluginHandleDO> selectByIdList(@Param("ids") List<String> ids);
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return count but the return type is list
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mapper/PluginHandleMapper.java`
#### Snippet
```java
     *
     * @param pluginId a list of ids
     * @return the count of deleted
     */
    List<PluginHandleDO> selectByPluginIdList(@Param("pluginIds") List<String> pluginId);
```

## RuleId[ruleID=ThreadRun]
### RuleId[ruleID=ThreadRun]
Calls to `run()` should probably be replaced with 'start()'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
                        } catch (InterruptedException ignore) {
                        }
                        hook.run();
                    }, hook.getName());
                    delayHooks.put(delayHook, delayHook);
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ShenyuRequestHeader` may be 'static'
in `shenyu-common/src/main/java/org/apache/shenyu/common/dto/convert/rule/RequestHandle.java`
#### Snippet
```java
    }

    public class ShenyuRequestHeader {
        /**
         * need to be appended new header value.
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ShenyuRequestParameter` may be 'static'
in `shenyu-common/src/main/java/org/apache/shenyu/common/dto/convert/rule/RequestHandle.java`
#### Snippet
```java
    }

    public class ShenyuRequestParameter {

        private Map<String, String> addParameters;
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ShenyuCookie` may be 'static'
in `shenyu-common/src/main/java/org/apache/shenyu/common/dto/convert/rule/RequestHandle.java`
#### Snippet
```java
    }

    public class ShenyuCookie {
        private Map<String, String> addCookies;

```

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `shenyu-client/shenyu-client-motan/src/main/java/org/apache/shenyu/client/motan/MotanServiceEventListener.java`
#### Snippet
```java
        int port = StringUtils.isBlank(this.getPort()) ? -1 : Integer.parseInt(this.getPort());
        String configRuleName = shenyuMotanClient.ruleName();
        String ruleName = ("".equals(configRuleName)) ? path : configRuleName;
        String methodName = method.getName();
        Class<?>[] parameterTypesClazz = method.getParameterTypes();
```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/ApacheDubboServiceBeanListener.java`
#### Snippet
```java
        String serviceName = bean.getInterface();
        String configRuleName = shenyuClient.ruleName();
        String ruleName = ("".equals(configRuleName)) ? path : configRuleName;
        String methodName = Optional.ofNullable(method).map(Method::getName).orElseThrow(() -> new ShenyuException("unexpected error"));
        Class<?>[] parameterTypesClazz = method.getParameterTypes();
```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `shenyu-client/shenyu-client-tars/src/main/java/org/apache/shenyu/client/tars/TarsServiceBeanEventListener.java`
#### Snippet
```java
        String host = IpUtils.isCompleteHost(this.getHost()) ? this.getHost() : IpUtils.getHost(this.getHost());
        String configRuleName = shenyuTarsClient.ruleName();
        String ruleName = ("".equals(configRuleName)) ? path : configRuleName;
        String methodName = method.getName();
        Class<?>[] parameterTypesClazz = method.getParameterTypes();
```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ParamCheckUtils.java`
#### Snippet
```java
     */
    public static boolean bodyIsEmpty(final String body) {
        return null == body || "".equals(body) || "null".equals(body);
    }

```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/IpUtils.java`
#### Snippet
```java
        String pattern = filterHost;
        // filter matching ip
        if ("*".equals(filterHost) || "".equals(filterHost)) {
            pattern = null;
        } else if (filterHost != null && !filterHost.contains("*") && !isCompleteHost(filterHost)) {
```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/IpUtils.java`
#### Snippet
```java
        // return the host ip about this docker located from environment value
        String dockerHostIp = System.getenv(SYSTEM_ENV_DOCKER_HOST_IP);
        if (dockerHostIp != null && !"".equals(dockerHostIp)) {
            return dockerHostIp;
        }
```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/AlibabaDubboServiceBeanListener.java`
#### Snippet
```java
        String serviceName = bean.getInterface();
        String configRuleName = shenyuClient.ruleName();
        String ruleName = ("".equals(configRuleName)) ? path : configRuleName;
        String methodName = Optional.ofNullable(method).map(Method::getName).orElseThrow(() -> new ShenyuException("unexpected error"));
        Class<?>[] parameterTypesClazz = method.getParameterTypes();
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/support/BodyInserterContext.java`
#### Snippet
```java
    @SuppressWarnings("NullableProblems")
    @Override
    public List<HttpMessageWriter<?>> messageWriters() {
        return exchangeStrategies.messageWriters();
    }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/support/BodyInserterContext.java`
#### Snippet
```java
    @SuppressWarnings("NullableProblems")
    @Override
    public Optional<ServerHttpRequest> serverRequest() {
        return Optional.empty();
    }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/support/BodyInserterContext.java`
#### Snippet
```java
    @SuppressWarnings("NullableProblems")
    @Override
    public Map<String, Object> hints() {
        return Collections.emptyMap();
    }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `shenyu-plugin/shenyu-plugin-param-mapping/src/main/java/org/apache/shenyu/plugin/param/mapping/strategy/FormDataOperator.java`
#### Snippet
```java
        @SuppressWarnings("NullableProblems")
        @Override
        public HttpHeaders getHeaders() {
            long contentLength = headers.getContentLength();
            if (contentLength == 0) {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `shenyu-plugin/shenyu-plugin-param-mapping/src/main/java/org/apache/shenyu/plugin/param/mapping/strategy/FormDataOperator.java`
#### Snippet
```java
        @SuppressWarnings("NullableProblems")
        @Override
        public Flux<DataBuffer> getBody() {
            return cachedBodyOutputMessage.getBody();
        }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `shenyu-plugin/shenyu-plugin-param-mapping/src/main/java/org/apache/shenyu/plugin/param/mapping/strategy/JsonOperator.java`
#### Snippet
```java
        @SuppressWarnings("NullableProblems")
        @Override
        public HttpHeaders getHeaders() {
            long contentLength = headers.getContentLength();
            HttpHeaders httpHeaders = new HttpHeaders();
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `shenyu-plugin/shenyu-plugin-param-mapping/src/main/java/org/apache/shenyu/plugin/param/mapping/strategy/JsonOperator.java`
#### Snippet
```java
        @SuppressWarnings("NullableProblems")
        @Override
        public Flux<DataBuffer> getBody() {
            return cachedBodyOutputMessage.getBody();
        }
```

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `ShenyuClientShutdownHook` has only 'static' members, and a 'public' constructor
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/shutdown/ShenyuClientShutdownHook.java`
#### Snippet
```java
 * Shenyu client shutdown hook.
 */
public class ShenyuClientShutdownHook {

    private static final Logger LOG = LoggerFactory.getLogger(ShenyuClientShutdownHook.class);
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `DataMaskFactory` has only 'static' members, and a 'public' constructor
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-mask-api/src/main/java/org/apache/shenyu/plugin/logging/mask/api/factory/DataMaskFactory.java`
#### Snippet
```java
 * shenyu logging mask factory.
 */
public final class DataMaskFactory {

    public DataMaskFactory() {
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
                    }
                } catch (IOException ioe) {
                    System.err.println(ioe);
                }
            }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/GrpcClientEventListener.java`
#### Snippet
```java
    protected String buildApiPath(final Method method, final String superPath, @NonNull final ShenyuGrpcClient methodShenyuClient) {
        final String contextPath = getContextPath();
        return superPath.contains("*") ? pathJoin(contextPath, superPath.replace("*", ""), method.getName())
                : pathJoin(contextPath, superPath, methodShenyuClient.path());
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-client/shenyu-client-motan/src/main/java/org/apache/shenyu/client/motan/MotanServiceEventListener.java`
#### Snippet
```java
    protected String buildApiPath(final Method method, final String superPath, final ShenyuMotanClient methodShenyuClient) {
        return superPath.contains("*")
                ? pathJoin(this.getContextPath(), superPath.replace("*", ""), method.getName())
                : pathJoin(this.getContextPath(), superPath, methodShenyuClient.path());
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-client/shenyu-client-motan/src/main/java/org/apache/shenyu/client/motan/MotanServiceEventListener.java`
#### Snippet
```java
        Integer timeout = Optional.ofNullable(((BasicServiceConfigBean) applicationContext.getBean(BASE_SERVICE_CONFIG)).getRequestTimeout()).orElse(1000);
        MotanService service = AnnotatedElementUtils.findMergedAnnotation(clazz, MotanService.class);
        String path = superPath.contains("*") ? pathJoin(getContextPath(), superPath.replace("*", ""), method.getName()) : pathJoin(getContextPath(), superPath, shenyuMotanClient.path());
        String desc = shenyuMotanClient.desc();
        String host = IpUtils.isCompleteHost(this.getHost()) ? this.getHost() : IpUtils.getHost(this.getHost());
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/client/AbstractContextRefreshedEventListener.java`
#### Snippet
```java
                result.append(PATH_SEPARATOR);
            }
            result.append(p.startsWith(PATH_SEPARATOR) ? p.replaceFirst(PATH_SEPARATOR, "") : p);
        }
        return result.toString();
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-zookeeper/src/main/java/org/apache/shenyu/register/client/zookeeper/ZookeeperClientRegisterRepository.java`
#### Snippet
```java
            nodeName = String.join(DefaultPathConstants.SELECTOR_JOIN_RULE,
                    metadata.getContextPath(),
                    metadata.getRuleName().replace(PATH_SEPARATOR, DefaultPathConstants.SELECTOR_JOIN_RULE));
        } else {
            nodeName = RegisterPathConstants.buildNodeName(metadata.getServiceName(), metadata.getMethodName());
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-register-center/shenyu-register-common/src/main/java/org/apache/shenyu/register/common/path/RegisterPathConstants.java`
#### Snippet
```java
    public static String buildServiceInstancePath(final String rpcType) {
        return String.join(SEPARATOR, ROOT_PATH, "service", rpcType)
                .replace("/", DOT_SEPARATOR).substring(1);
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-register-center/shenyu-register-common/src/main/java/org/apache/shenyu/register/common/path/RegisterPathConstants.java`
#### Snippet
```java
    public static String buildServiceConfigPath(final String rpcType, final String contextPath) {
        final String serviceConfigPathOrigin = String.join(SEPARATOR, ROOT_PATH, "service", rpcType, contextPath)
                .replace("/", DOT_SEPARATOR).replace("*", "");
        final String serviceConfigPathAfterSubstring = serviceConfigPathOrigin.substring(1);
        if (serviceConfigPathAfterSubstring.endsWith(".")) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-register-center/shenyu-register-common/src/main/java/org/apache/shenyu/register/common/path/RegisterPathConstants.java`
#### Snippet
```java
    public static String buildServiceConfigPath(final String rpcType, final String contextPath) {
        final String serviceConfigPathOrigin = String.join(SEPARATOR, ROOT_PATH, "service", rpcType, contextPath)
                .replace("/", DOT_SEPARATOR).replace("*", "");
        final String serviceConfigPathAfterSubstring = serviceConfigPathOrigin.substring(1);
        if (serviceConfigPathAfterSubstring.endsWith(".")) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/ApacheDubboServiceBeanListener.java`
#### Snippet
```java
                                  @NonNull final ShenyuDubboClient methodShenyuClient) {
        final String contextPath = this.getContextPath();
        return superPath.contains("*") ? pathJoin(contextPath, superPath.replace("*", ""), method.getName())
                : pathJoin(contextPath, superPath, methodShenyuClient.path());
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-consul/src/main/java/org/apache/shenyu/register/client/consul/ConsulClientRegisterRepository.java`
#### Snippet
```java
            nodeName = String.join(SELECTOR_JOIN_RULE,
                    metadata.getContextPath(),
                    metadata.getRuleName().replace(PATH_SEPARATOR, SELECTOR_JOIN_RULE));
        } else {
            nodeName = RegisterPathConstants.buildNodeName(metadata.getServiceName(), metadata.getMethodName());
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/pg/interceptor/PostgreSQLPrepareInterceptor.java`
#### Snippet
```java
        Field field = boundSql.getClass().getDeclaredField("sql");
        field.setAccessible(true);
        field.set(boundSql, boundSql.getSql().replace("`", "\"").toLowerCase());

        return invocation.proceed();
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
        // replace desc and true
        String replaceSql = boundSql.getSql().toLowerCase()
                .replace("`desc`", "\"desc\"")
                .replace("true", "\'true\'");
        // replace`
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
        String replaceSql = boundSql.getSql().toLowerCase()
                .replace("`desc`", "\"desc\"")
                .replace("true", "\'true\'");
        // replace`
        replaceSql = replaceSql.replace("`", "");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
                .replace("true", "\'true\'");
        // replace`
        replaceSql = replaceSql.replace("`", "");
        // replace resource
        if (replaceSql.contains("resource")) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
        // replace resource
        if (replaceSql.contains("resource")) {
            replaceSql = replaceSql.replace("into resource", "into \"resource\"")
                    .replace("from resource", "from \"resource\"")
                    .replace("update resource", "update \"resource\"");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
        if (replaceSql.contains("resource")) {
            replaceSql = replaceSql.replace("into resource", "into \"resource\"")
                    .replace("from resource", "from \"resource\"")
                    .replace("update resource", "update \"resource\"");
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
            replaceSql = replaceSql.replace("into resource", "into \"resource\"")
                    .replace("from resource", "from \"resource\"")
                    .replace("update resource", "update \"resource\"");
        }
        // replace batch insert into
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
        // replace batch insert into
        if (replaceSql.contains("insert into") && replaceSql.split("\\(").length > 3) {
            replaceSql = replaceSql.replaceAll("\r|\n|\\s", "")
                    .replace("insertinto", "insert into ")
                    .replace("values", " SELECT * FROM (")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
        if (replaceSql.contains("insert into") && replaceSql.split("\\(").length > 3) {
            replaceSql = replaceSql.replaceAll("\r|\n|\\s", "")
                    .replace("insertinto", "insert into ")
                    .replace("values", " SELECT * FROM (")
                    .replace("(?", " SELECT ?")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
            replaceSql = replaceSql.replaceAll("\r|\n|\\s", "")
                    .replace("insertinto", "insert into ")
                    .replace("values", " SELECT * FROM (")
                    .replace("(?", " SELECT ?")
                    .replace("),", " FROM dual UNION ALL")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
                    .replace("insertinto", "insert into ")
                    .replace("values", " SELECT * FROM (")
                    .replace("(?", " SELECT ?")
                    .replace("),", " FROM dual UNION ALL")
                    .replace("?)", " ? FROM dual)");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
                    .replace("values", " SELECT * FROM (")
                    .replace("(?", " SELECT ?")
                    .replace("),", " FROM dual UNION ALL")
                    .replace("?)", " ? FROM dual)");
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
                    .replace("(?", " SELECT ?")
                    .replace("),", " FROM dual UNION ALL")
                    .replace("?)", " ? FROM dual)");
        }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
        if (replaceSql.contains("select")) {
            if (replaceSql.contains("where")) {
                replaceSql = replaceSql.replace("limit 1", "and rownum = 1");
            } else {
                replaceSql = replaceSql.replace("limit 1", "where rownum = 1");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mybatis/oracle/OracleSQLPrepareInterceptor.java`
#### Snippet
```java
                replaceSql = replaceSql.replace("limit 1", "and rownum = 1");
            } else {
                replaceSql = replaceSql.replace("limit 1", "where rownum = 1");
            }
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/AbstractShenyuClientRegisterServiceImpl.java`
#### Snippet
```java
    private String rewritePath(final String path) {
        if (path.contains(AdminConstants.URI_VARIABLE_SUFFIX)) {
            return path.replaceAll("(/\\{.*?})+", "/**");
        }
        return path;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-etcd/src/main/java/org/apache/shenyu/register/client/etcd/EtcdClientRegisterRepository.java`
#### Snippet
```java
                || Objects.equals(RpcTypeEnum.SPRING_CLOUD.getName(), rpcType)) {
            nodeName = String.join(SELECTOR_JOIN_RULE, metadata.getContextPath(),
                    metadata.getRuleName().replace(PATH_SEPARATOR, SELECTOR_JOIN_RULE));
        } else {
            nodeName = RegisterPathConstants.buildNodeName(metadata.getServiceName(), metadata.getMethodName());
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-tars/src/main/java/org/apache/shenyu/plugin/tars/util/PrxInfoUtil.java`
#### Snippet
```java
     */
    public static String getPrxName(final MetaData metaData) {
        return metaData.getPath().replace("/", "") + metaData.getMethodName() + "Prx";
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-client/shenyu-client-tars/src/main/java/org/apache/shenyu/client/tars/TarsServiceBeanEventListener.java`
#### Snippet
```java
    protected String buildApiPath(final Method method, final String superPath, final ShenyuTarsClient shenyuTarsClient) {
        return superPath.contains("*")
                ? pathJoin(contextPath, superPath.replace("*", ""), method.getName())
                : pathJoin(contextPath, superPath, shenyuTarsClient.path());
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-client/shenyu-client-sofa/src/main/java/org/apache/shenyu/client/sofa/SofaServiceEventListener.java`
#### Snippet
```java
                                  @NonNull final ShenyuSofaClient shenyuSofaClient) {
        final String contextPath = this.getContextPath();
        return superPath.contains("*") ? pathJoin(contextPath, superPath.replace("*", ""), method.getName())
                : pathJoin(contextPath, superPath, shenyuSofaClient.path());
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/PhoneGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        return rule.matches("^phone$");
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/RandomIntGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        return rule.matches("^int\\|\\d+-\\d+$");
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/EmailGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        return rule.matches("^email$");
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/ArrayGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        return rule.matches("^array\\|.+\\|\\d+$");
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/CurrentTimeGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        return rule.matches("^current(\\|.+)?");
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/RandomDoubleGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        return rule.matches("^double\\|\\d+(?:\\.\\d+)?-\\d+(?:\\.\\d+)?.*");
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/Generator.java`
#### Snippet
```java
    default void parseRule(final String rule) {
        List<String> params = new ArrayList<>();
        String[] split = rule.split("(?<!\\\\)\\|");
        if (split.length >= getParamSize() + 1) {
            params.addAll(Arrays.stream(split)
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/Generator.java`
#### Snippet
```java
        if (split.length >= getParamSize() + 1) {
            params.addAll(Arrays.stream(split)
                    .map(p -> p.replaceAll("\\\\\\|", "|"))
                    .skip(1)
                    .collect(Collectors.toList()));
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/ZhStringGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        return rule.matches("^zh\\|\\d+-\\d+$");
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/BoolGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        return rule.matches("^bool$");
    }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/EnStringGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        return rule.matches("^en\\|\\d+-\\d+$");
    }
    
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/GeneratorFactory.java`
#### Snippet
```java
            }
            String toString = String.valueOf(generateData);
            placeHolder = placeHolder.replaceAll("([$|{}\\]\\[])", "\\\\$1");
            afterDeal = afterDeal.replaceFirst(placeHolder, toString);
            placeHolder = getPlaceholder(afterDeal);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/RangeDataGenerator.java`
#### Snippet
```java
    @Override
    public void initParam(final List<String> params, final String rule) {
        String rangeData = params.get(0).replaceAll("\\[(.+)]", "$1");
        data = Arrays.stream(rangeData.split("(?<!\\\\),"))
                .map(data -> data.replace("\\,", ","))
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/RangeDataGenerator.java`
#### Snippet
```java
    public void initParam(final List<String> params, final String rule) {
        String rangeData = params.get(0).replaceAll("\\[(.+)]", "$1");
        data = Arrays.stream(rangeData.split("(?<!\\\\),"))
                .map(data -> data.replace("\\,", ","))
                .collect(Collectors.toList());
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/RangeDataGenerator.java`
#### Snippet
```java
        String rangeData = params.get(0).replaceAll("\\[(.+)]", "$1");
        data = Arrays.stream(rangeData.split("(?<!\\\\),"))
                .map(data -> data.replace("\\,", ","))
                .collect(Collectors.toList());
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/RangeDataGenerator.java`
#### Snippet
```java
    @Override
    public boolean match(final String rule) {
        boolean matches = rule.matches("^list\\|\\[.+]$");
        if (matches) {
            String candidateData = rule.substring(6, rule.length() - 1);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/RangeDataGenerator.java`
#### Snippet
```java
        if (matches) {
            String candidateData = rule.substring(6, rule.length() - 1);
            return !candidateData.matches("^\\s+$");
        }
        return false;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/SignUtils.java`
#### Snippet
```java
     */
    public String generateKey() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/AlibabaDubboServiceBeanListener.java`
#### Snippet
```java
                                  final ShenyuDubboClient methodShenyuClient) {
        final String contextPath = this.getContextPath();
        return superPath.contains("*") ? pathJoin(contextPath, superPath.replace("*", ""), method.getName())
                : pathJoin(contextPath, superPath, methodShenyuClient.path());
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-plugin/shenyu-plugin-casdoor/src/main/java/org/apache/shenyu/plugin/casdoor/handle/CasdoorPluginDateHandler.java`
#### Snippet
```java
        final String clientId = Optional.ofNullable(configMap.get("client_id")).orElse("");
        String certificate = Optional.ofNullable(configMap.get("certificate")).orElse("");
        certificate = certificate.replace("\\n", "\n");
        String organization = Optional.ofNullable(configMap.get("organization-name")).orElse("");
        String application = Optional.ofNullable(configMap.get("application-name")).orElse("");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-web/src/main/java/org/apache/shenyu/web/forward/ForwardedRemoteAddressResolver.java`
#### Snippet
```java
            return Collections.emptyList();
        }
        List<String> values = Arrays.asList(xForwardedValues.get(0).split(", "));
        if (values.size() == 1 && !StringUtils.hasText(values.get(0))) {
            return Collections.emptyList();
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginLoader.java`
#### Snippet
```java
                String entryName = jarEntry.getName();
                if (entryName.endsWith(".class") && !entryName.contains("$")) {
                    String className = entryName.substring(0, entryName.length() - 6).replaceAll("/", ".");
                    names.add(className);
                }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginLoader.java`
#### Snippet
```java
    
    private String classNameToPath(final String className) {
        return String.join("", className.replace(".", "/"), ".class");
    }
    
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.grpc.protobuf` is unnecessary, and can be replaced with an import
in `shenyu-client/shenyu-client-grpc/src/main/java/org/apache/shenyu/client/grpc/json/JsonServerServiceInterceptor.java`
#### Snippet
```java
            throws IllegalArgumentException, IllegalAccessException {
        return useMarshalledMessages(serviceDef,
                io.grpc.protobuf.ProtoUtils.marshaller(JsonMessage.buildJsonMessage()));
    }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.model.query` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mapper/TagRelationMapper.java`
#### Snippet
```java
     * select tag relation by query.
     *
     * @param tagRelationQuery {@linkplain org.apache.shenyu.admin.model.query.TagRelationQuery}
     * @return {@linkplain List}
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.model.query` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/mapper/TagMapper.java`
#### Snippet
```java
     * select tag by query.
     *
     * @param tagQuery {@linkplain org.apache.shenyu.admin.model.query.TagQuery}
     * @return {@linkplain List}
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/SyncDataServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.SyncDataService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagRelationServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.TagRelationService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/ApiServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.ApiService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/TagServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.TagService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/ResourceServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.ResourceService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/MetaDataServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.MetaDataService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/PluginServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.PluginService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DashboardUserServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.DashboardUserService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/PluginHandleServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.PluginHandleService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/SelectorServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.SelectorService}.
 * Maintain {@link SelectorDO} and {@link SelectorConditionDO} related data.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/PermissionServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.PermissionService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DataPermissionServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.DataPermissionService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/ShenyuDictServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.ShenyuDictService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/RoleServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.RoleService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/EnumServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.EnumService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/AppAuthServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.AppAuthService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.admin.service` is unnecessary and can be removed
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/RuleServiceImpl.java`
#### Snippet
```java

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.RuleService}.
 */
@Service
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.collections4.map` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/cache/MemorySafeLRUMap.java`
#### Snippet
```java

/**
 * The only difference between this class and {@link org.apache.commons.collections4.map.LRUMap}
 * is that it handles memory issues via {@link org.apache.shenyu.common.concurrent.MemoryLimitCalculator}.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/cache/MemorySafeLRUMap.java`
#### Snippet
```java
/**
 * The only difference between this class and {@link org.apache.commons.collections4.map.LRUMap}
 * is that it handles memory issues via {@link org.apache.shenyu.common.concurrent.MemoryLimitCalculator}.
 *
 * <p>Note: this class is not thread safe! see https://github.com/apache/shenyu/issues/3929
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/Rejector.java`
#### Snippet
```java
/**
 * RejectHandler, it works when you need to custom reject action in
 * {@link org.apache.shenyu.common.concurrent.MemorySafeLinkedBlockingQueue}.
 *
 * @see AbortPolicy
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemorySafeTaskQueue.java`
#### Snippet
```java

/**
 * MemorySafeTaskQueue in the {@link org.apache.shenyu.common.concurrent.ShenyuThreadPoolExecutor}.
 * It offer a task if the executor's submittedTaskCount less than currentPoolThreadSize
 * or the currentPoolThreadSize more than executor's maximumPoolSize.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemorySafeLinkedBlockingQueue.java`
#### Snippet
```java

/**
 * Can completely solve the OOM problem caused by {@link java.util.concurrent.LinkedBlockingQueue},
 * does not depend on {@link java.lang.instrument.Instrumentation} and is easier to use than
 * {@link org.apache.shenyu.common.concurrent.MemoryLimitedLinkedBlockingQueue}.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemorySafeLinkedBlockingQueue.java`
#### Snippet
```java
 * Can completely solve the OOM problem caused by {@link java.util.concurrent.LinkedBlockingQueue},
 * does not depend on {@link java.lang.instrument.Instrumentation} and is easier to use than
 * {@link org.apache.shenyu.common.concurrent.MemoryLimitedLinkedBlockingQueue}.
 */
public class MemorySafeLinkedBlockingQueue<E> extends LinkedBlockingQueue<E> {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitCalculator.java`
#### Snippet
```java

/**
 * {@link java.lang.Runtime#freeMemory()} technology is used to calculate the
 * memory limit by using the percentage of the current maximum available memory,
 * which can be used with {@link org.apache.shenyu.common.concurrent.MemoryLimiter}.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitCalculator.java`
#### Snippet
```java
 * {@link java.lang.Runtime#freeMemory()} technology is used to calculate the
 * memory limit by using the percentage of the current maximum available memory,
 * which can be used with {@link org.apache.shenyu.common.concurrent.MemoryLimiter}.
 *
 * @see org.apache.shenyu.common.concurrent.MemoryLimiter
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitCalculator.java`
#### Snippet
```java
 * which can be used with {@link org.apache.shenyu.common.concurrent.MemoryLimiter}.
 *
 * @see org.apache.shenyu.common.concurrent.MemoryLimiter
 */
public class MemoryLimitCalculator {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/TaskQueue.java`
#### Snippet
```java
     * @param unit    timeout unit
     * @return offer success or not
     * @throws java.util.concurrent.RejectedExecutionException if executor is terminated.
     * @throws java.lang.InterruptedException                  if the current thread is interrupted.
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/TaskQueue.java`
#### Snippet
```java
     * @return offer success or not
     * @throws java.util.concurrent.RejectedExecutionException if executor is terminated.
     * @throws java.lang.InterruptedException                  if the current thread is interrupted.
     */
    default boolean retryOffer(final E o, final long timeout, final TimeUnit unit) throws InterruptedException {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitedLinkedBlockingQueue.java`
#### Snippet
```java

/**
 * Can completely solve the OOM problem caused by {@link java.util.concurrent.LinkedBlockingQueue}.
 *
 * @see org.apache.shenyu.common.concurrent.MemoryLimiter
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitedLinkedBlockingQueue.java`
#### Snippet
```java
 * Can completely solve the OOM problem caused by {@link java.util.concurrent.LinkedBlockingQueue}.
 *
 * @see org.apache.shenyu.common.concurrent.MemoryLimiter
 * @see org.apache.shenyu.common.concurrent.MemoryLimitCalculator
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitedLinkedBlockingQueue.java`
#### Snippet
```java
 *
 * @see org.apache.shenyu.common.concurrent.MemoryLimiter
 * @see org.apache.shenyu.common.concurrent.MemoryLimitCalculator
 */
public class MemoryLimitedLinkedBlockingQueue<E> extends LinkedBlockingQueue<E> {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimitedTaskQueue.java`
#### Snippet
```java

/**
 * MemoryLimitedTaskQueue in the {@link org.apache.shenyu.common.concurrent.ShenyuThreadPoolExecutor}.
 * It offer a task if the executor's submittedTaskCount less than currentPoolThreadSize
 * or the currentPoolThreadSize more than executor's maximumPoolSize.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/GsonUtils.java`
#### Snippet
```java
     * translate JsonArray in covertToMap of Method.
     *
     * @param jsonArray the Gson's Object {@link com.google.gson.JsonArray}
     * @return list about translating jsonArray
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.common.concurrent` is unnecessary and can be removed
in `shenyu-common/src/main/java/org/apache/shenyu/common/concurrent/MemoryLimiter.java`
#### Snippet
```java
 * memory limiter.
 *
 * @see org.apache.shenyu.common.concurrent.MemoryLimitCalculator
 */
public class MemoryLimiter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.shenyu.sdk.core` is unnecessary and can be removed
in `shenyu-sdk/shenyu-sdk-core/src/main/java/org/apache/shenyu/sdk/core/retry/RetryableException.java`
#### Snippet
```java

/**
 * This exception is raised when the {@link org.apache.shenyu.sdk.core.ShenyuResponse} is deemed to be retryable, typically via an
 * {@link org.apache.shenyu.common.exception.CommonErrorCode} when the {@link ShenyuResponse#getStatus() status} is 503.
 * Reference to feign.RetryableException.
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractContextRefreshedEventListener()` of an abstract class should not be declared 'public'
in `shenyu-client/shenyu-client-core/src/main/java/org/apache/shenyu/client/core/client/AbstractContextRefreshedEventListener.java`
#### Snippet
```java
     * @param shenyuClientRegisterRepository the shenyuClientRegisterRepository
     */
    public AbstractContextRefreshedEventListener(final PropertiesConfig clientConfig,
                                                 final ShenyuClientRegisterRepository shenyuClientRegisterRepository) {
        Properties props = clientConfig.getProps();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `FailbackRegistryRepository()` of an abstract class should not be declared 'public'
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-api/src/main/java/org/apache/shenyu/register/client/api/FailbackRegistryRepository.java`
#### Snippet
```java
     * Instantiates a new Failback registry repository.
     */
    public FailbackRegistryRepository() {
        this.timer = WheelTimerFactory.getSharedTimer();
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `FallbackShenyuClientRegisterService()` of an abstract class should not be declared 'public'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/FallbackShenyuClientRegisterService.java`
#### Snippet
```java
     * Instantiates a new Fallback shenyu client register service.
     */
    public FallbackShenyuClientRegisterService() {
        timer = WheelTimerFactory.getSharedTimer();
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractListDataChangedListener()` of an abstract class should not be declared 'public'
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/listener/AbstractListDataChangedListener.java`
#### Snippet
```java
     * @param changeData changeData
     */
    public AbstractListDataChangedListener(final ChangeData changeData) {
        this.changeData = changeData;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractRoundTask()` of an abstract class should not be declared 'public'
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/AbstractRoundTask.java`
#### Snippet
```java
     * @param delayMs the delay ms
     */
    public AbstractRoundTask(final String key, final long delayMs) {
        super(key, delayMs, -1);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractRetryTask()` of an abstract class should not be declared 'public'
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/AbstractRetryTask.java`
#### Snippet
```java
     * @param retryLimit the retry limit
     */
    public AbstractRetryTask(final String key,
                             final long delayMs,
                             final Integer retryCount,
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractRetryTask()` of an abstract class should not be declared 'public'
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/AbstractRetryTask.java`
#### Snippet
```java
     * @param delayMs the delay ms
     */
    public AbstractRetryTask(final String key,
                             final long delayMs) {
        this(key, delayMs, 1);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractRetryTask()` of an abstract class should not be declared 'public'
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/AbstractRetryTask.java`
#### Snippet
```java
     * @param retryCount the retry count
     */
    public AbstractRetryTask(final String key,
                             final long delayMs,
                             final Integer retryCount) {
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `TimerTask()` of an abstract class should not be declared 'public'
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimerTask.java`
#### Snippet
```java
     * @param delayMs the delay ms
     */
    public TimerTask(final long delayMs) {
        this(delayMs, TimeUnit.MILLISECONDS);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `TimerTask()` of an abstract class should not be declared 'public'
in `shenyu-common/src/main/java/org/apache/shenyu/common/timer/TimerTask.java`
#### Snippet
```java
     * @param unit  the unit
     */
    public TimerTask(final long delay, final TimeUnit unit) {
        delayMs = unit.toMillis(delay);
    }
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `apiClass`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientProxyFactory.java`
#### Snippet
```java
        }

        synchronized (apiClass) {
            Object proxy = Proxy.newProxyInstance(apiClass.getClassLoader(),
                    new Class<?>[]{apiClass},
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on local variable `shenyuClientRegisterService`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/disruptor/subscriber/MetadataExecutorSubscriber.java`
#### Snippet
```java
            Optional.ofNullable(this.shenyuClientRegisterService.get(meta.getRpcType()))
                    .ifPresent(shenyuClientRegisterService -> {
                        synchronized (shenyuClientRegisterService) {
                            shenyuClientRegisterService.register(meta);
                        }
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/cache/MetaDataCache.java`
#### Snippet
```java
                    return value;
                });
        return NULL.equals(metaData) ? null : metaData;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/AbstractShenyuPlugin.java`
#### Snippet
```java

    private SelectorData obtainSelectorDataCacheIfEnabled(final String path) {
        return matchCacheConfig.getSelectorEnabled() ? MatchDataCache.getInstance().obtainSelectorData(named(), path) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-base/src/main/java/org/apache/shenyu/plugin/base/AbstractShenyuPlugin.java`
#### Snippet
```java

    private RuleData obtainRuleDataCacheIfEnabled(final String path) {
        return matchCacheConfig.getRuleEnabled() ? MatchDataCache.getInstance().obtainRuleData(named(), path) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/rule/JwtRuleHandle.java`
#### Snippet
```java
    public static JwtRuleHandle newInstance(final String handleJson) {
        if (Objects.isNull(handleJson)) {
            return null;
        }
        Map<String, Object> handleMap = GsonUtils.getInstance().convertToMap(handleJson);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/exception/ThrowingFunction.java`
#### Snippet
```java
            return function.apply();
        } catch (Exception e) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/JwtPlugin.java`
#### Snippet
```java
            finalAuthorization = authorization;
        } else {
            return null;
        }
        return isAuth2(finalAuthorization) ? finalAuthorization.split(" ")[1] : finalAuthorization;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/JwtPlugin.java`
#### Snippet
```java

        if (StringUtils.isEmpty(authorization)) {
            return null;
        }
        JwtParserBuilder jwtParserBuilder = Jwts.parserBuilder();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/JwtPlugin.java`
#### Snippet
```java
            Jwt jwt = ThrowingFunction.wrap(() -> jwtParserExec.parse(authorization));
            if (jwt == null) {
                return null;
            }
            return (Map<String, Object>) jwt.getBody();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/JwtPlugin.java`
#### Snippet
```java
            return (Map<String, Object>) jwt.getBody();
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/client/GrpcClientBuilder.java`
#### Snippet
```java
        GrpcRegisterConfig config = Singleton.INST.get(GrpcRegisterConfig.class);
        if (null == config) {
            return null;
        }
        final String threadpool = Optional.ofNullable(config.getThreadpool()).orElse(Constants.CACHED);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/client/GrpcClientBuilder.java`
#### Snippet
```java
            case Constants.CACHED:
            default:
                return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/client/ShenyuGrpcClient.java`
#### Snippet
```java
            default:
                LOG.info("Unknown methodType:{}", methodType);
                return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/loadbalance/picker/RoundRobinPicker.java`
#### Snippet
```java
    protected SubChannelCopy pick(final List<SubChannelCopy> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        final int size = list.size();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-grpc/src/main/java/org/apache/shenyu/plugin/grpc/loadbalance/picker/RandomPicker.java`
#### Snippet
```java
    protected SubChannelCopy pick(final List<SubChannelCopy> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        if (list.size() == 1) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientMethodHandler.java`
#### Snippet
```java
    private Object handlerResponse(final ShenyuResponse shenyuResponse, final Class<?> returnType) {
        if (shenyuResponse == null || void.class == returnType) {
            return null;
        } else if (ShenyuResponse.class == returnType) {
            return shenyuResponse;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/proxy/ShenyuClientMethodHandler.java`
#### Snippet
```java
            return JsonUtils.jsonToObject(shenyuResponse.getBody(), returnType);
        } else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-cache/shenyu-plugin-cache-memory/src/main/java/org/apache/shenyu/plugin/cache/memory/MemoryCache.java`
#### Snippet
```java
                return this.mainCache.get(key).asMap().get(key);
            }
            return null;
        });
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-spring-boot-starter/shenyu-spring-boot-starter-sdk/src/main/java/org/apache/shenyu/springboot/starter/sdk/ShenyuSdkAutoConfiguration.java`
#### Snippet
```java
        final String registerType = config.getRegisterType();
        if ("local".equals(registerType)) {
            return null;
        }
        return ShenyuInstanceRegisterRepositoryFactory.newAndInitInstance(config);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-zookeeper/src/main/java/org/apache/shenyu/register/instance/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        try {
            byte[] ret = client.getData().forPath(key);
            return Objects.isNull(ret) ? null : new String(ret, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new ShenyuException(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-zookeeper/src/main/java/org/apache/shenyu/register/instance/zookeeper/ZookeeperClient.java`
#### Snippet
```java
            return getDirectly(key);
        }
        return Objects.isNull(data.getData()) ? null : new String(data.getData(), StandardCharsets.UTF_8);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-instance/shenyu-register-instance-zookeeper/src/main/java/org/apache/shenyu/register/instance/zookeeper/ZookeeperClient.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-api/src/main/java/org/apache/shenyu/plugin/api/result/ShenyuResult.java`
#### Snippet
```java
     */
    default T error(int code, String message, Object object) {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-cryptor/src/main/java/org/apache/shenyu/plugin/cryptor/strategy/CryptorStrategyFactory.java`
#### Snippet
```java
                return encrypt(ruleHandle.getStrategyName(), ruleHandle.getEncryptKey(), data);
            default:
                return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-cryptor/src/main/java/org/apache/shenyu/plugin/cryptor/strategy/CryptorStrategyFactory.java`
#### Snippet
```java
        } catch (Exception e) {
            LOG.error("decrypt data error: ", e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-cryptor/src/main/java/org/apache/shenyu/plugin/cryptor/strategy/CryptorStrategyFactory.java`
#### Snippet
```java
        } catch (Exception e) {
            LOG.error("encrypt data error: ", e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-nacos/src/main/java/org/apache/shenyu/register/client/server/nacos/NacosClientServerRegisterRepository.java`
#### Snippet
```java
                @Override
                public Executor getExecutor() {
                    return null;
                }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-springcloud/src/main/java/org/apache/shenyu/plugin/springcloud/loadbalance/ShenyuSpringCloudServiceChooser.java`
#### Snippet
```java
        List<ServiceInstance> available = this.getServiceInstance(serviceId);
        if (CollectionUtils.isEmpty(available)) {
            return null;
        }
        final SpringCloudSelectorHandle springCloudSelectorHandle = SpringCloudPluginDataHandler.SELECTOR_CACHED.get().obtainHandle(selectorId);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-cryptor/src/main/java/org/apache/shenyu/plugin/cryptor/utils/JsonUtil.java`
#### Snippet
```java
            }
        } else {
            return map.get(fieldNames) == null ? null : map.get(fieldNames).toString();
        }
        return str;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
                return String.valueOf(evaluateValue);
            }
            return null;
        }
        return value;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
    private String getQualifier(final Map<String, Object> client) {
        if (client == null) {
            return null;
        }
        String qualifier = (String) client.get("qualifier");
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
            return qualifier;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
    private String[] getQualifiers(final Map<String, Object> client) {
        if (client == null) {
            return null;
        }
        List<String> qualifierList = new ArrayList<>(Arrays.asList((String[]) client.get("qualifiers")));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sdk/shenyu-sdk-spring/src/main/java/org/apache/shenyu/sdk/spring/ShenyuClientsRegistrar.java`
#### Snippet
```java
            qualifierList = Collections.singletonList(getQualifier(client));
        }
        return !qualifierList.isEmpty() ? qualifierList.toArray(new String[0]) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-jwt/src/main/java/org/apache/shenyu/plugin/jwt/strategy/DefaultJwtConvertStrategy.java`
#### Snippet
```java
        } catch (Exception exception) {
            LOG.error("Failed to parse json , please check json format", exception);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-zookeeper/src/main/java/org/apache/shenyu/register/client/zookeeper/ZookeeperClient.java`
#### Snippet
```java
            return getDirectly(key);
        }
        return Objects.isNull(data.getData()) ? null : new String(data.getData(), StandardCharsets.UTF_8);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-zookeeper/src/main/java/org/apache/shenyu/register/client/zookeeper/ZookeeperClient.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-client/shenyu-register-client-zookeeper/src/main/java/org/apache/shenyu/register/client/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        try {
            byte[] ret = client.getData().forPath(key);
            return Objects.isNull(ret) ? null : new String(ret, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new ShenyuException(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sync-data-center/shenyu-sync-data-zookeeper/src/main/java/org/apache/shenyu/sync/data/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        try {
            byte[] ret = client.getData().forPath(key);
            return Objects.isNull(ret) ? null : new String(ret, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new ShenyuException(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sync-data-center/shenyu-sync-data-zookeeper/src/main/java/org/apache/shenyu/sync/data/zookeeper/ZookeeperClient.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sync-data-center/shenyu-sync-data-zookeeper/src/main/java/org/apache/shenyu/sync/data/zookeeper/ZookeeperClient.java`
#### Snippet
```java
            return getDirectly(key);
        }
        return Objects.isNull(data.getData()) ? null : new String(data.getData(), StandardCharsets.UTF_8);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/client/EtcdClient.java`
#### Snippet
```java

        if (Objects.isNull(response)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-etcd/src/main/java/org/apache/shenyu/register/client/server/etcd/client/EtcdClient.java`
#### Snippet
```java
            LOGGER.error("getChildren(path:{}) error.", path, e);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
                                       @NonNull final String... pathAttributeName) {
        if (Objects.isNull(annotation)) {
            return null;
        }
        for (String s : pathAttributeName) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
                    .ruleName(getContextPath())
                    .build());
            return null;
        }
        return context.getBeansWithAnnotation(Controller.class);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
            }
        }
        return null;
    }
    
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
    private String getPathByAnnotation(@Nullable final Annotation annotation) {
        if (Objects.isNull(annotation)) {
            return null;
        }
        final Object value = AnnotationUtils.getValue(annotation, "value");
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-http/shenyu-client-springcloud/src/main/java/org/apache/shenyu/client/springcloud/init/SpringCloudClientEventListener.java`
#### Snippet
```java
            return ((String[]) value)[0];
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        Class<?> cached = methodClassMap.get(methodClassName);
        if (cached != null) {
            return cached == clazz ? null : cached;
        }
        try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
    private static Object getMethodParameterBean(final Class<?> clazz, final Method method, final Object[] args) {
        if (!hasConstraintParameter(method)) {
            return null;
        }
        try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-apache-dubbo/src/main/java/org/apache/shenyu/client/apache/dubbo/validation/ApacheDubboClientValidator.java`
#### Snippet
```java
        } catch (Exception e) {
            LOG.warn(e.getMessage(), e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/bean/UpstreamInstance.java`
#### Snippet
```java
            return contextPath.substring(1);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/config/ShiroRealm.java`
#### Snippet
```java
        String token = (String) authenticationToken.getCredentials();
        if (StringUtils.isEmpty(token)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/shiro/config/ShiroRealm.java`
#### Snippet
```java
        Set<String> permissions = permissionService.getAuthPermByUserName(userInfo.getUserName());
        if (CollectionUtils.isEmpty(permissions)) {
            return null;
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ListUtil.java`
#### Snippet
```java
    public static <R> R findFirst(final List<R> list, final Function<R, Boolean> function) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        for (R r : list) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ListUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }
    
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/ResourceServiceImpl.java`
#### Snippet
```java
                .map(ResourceVO::buildResourceVO)
                .collect(Collectors.toList());
        return CollectionUtils.isEmpty(resourceVOList) ? null : ResourceUtil.buildMenu(resourceVOList);
    }
    
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DashboardUserServiceImpl.java`
#### Snippet
```java
            return dashboardUserVO;
        } catch (NameNotFoundException e) {
            return null;
        } catch (Exception e) {
            LOG.error("ldap verify error.", e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/DashboardUserServiceImpl.java`
#### Snippet
```java
        } catch (Exception e) {
            LOG.error("ldap verify error.", e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/SelectorServiceImpl.java`
#### Snippet
```java
                    PluginDO pluginDO = pluginDOMap.get(pluginId);
                    if (Objects.isNull(pluginDO)) {
                        return null;
                    }
                    List<ConditionData> conditionDataList = ConditionTransfer.INSTANCE.mapToSelectorDOS(selectorConditionMap.get(id));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/SelectorServiceImpl.java`
#### Snippet
```java
        PluginDO pluginDO = pluginMapper.selectById(selectorDO.getPluginId());
        if (Objects.isNull(pluginDO)) {
            return null;
        }
        return SelectorDO.transFrom(selectorDO, pluginDO.getName(), conditionDataList);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/PermissionServiceImpl.java`
#### Snippet
```java
        UserInfo userInfo = JwtUtils.getUserInfo();
        if (Objects.isNull(userInfo)) {
            return null;
        }
        
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/PermissionServiceImpl.java`
#### Snippet
```java
        List<ResourceVO> resourceVOList = getResourceListByUserName(userInfo.getUserName());
        if (CollectionUtils.isEmpty(resourceVOList)) {
            return null;
        }
        return new PermissionMenuVO(ResourceUtil.buildMenu(resourceVOList), getAuthPerm(resourceVOList), getAllAuthPerms());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/PermissionServiceImpl.java`
#### Snippet
```java
    private List<String> getListDiff(final List<String> preList, final List<String> lastList) {
        if (CollectionUtils.isEmpty(lastList)) {
            return null;
        }
        
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
        if (response.isSuccessful()) {
            ResponseBody body = response.body();
            return body == null ? null : body.byteStream();
        }
        return null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/HttpUtils.java`
#### Snippet
```java
            return body == null ? null : body.byteStream();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/DocManagerImpl.java`
#### Snippet
```java
        } catch (Exception e) {
            LOG.error("getDocInfo error={}", e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/impl/RuleServiceImpl.java`
#### Snippet
```java
                        }
                    }
                    return null;
                })
                .filter(Objects::nonNull)
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/SwaggerDocParser.java`
#### Snippet
```java
        }
        if (Objects.isNull(refElement)) {
            return null;
        }
        String ref = refElement.getAsString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/LoadServiceDocEntryImpl.java`
#### Snippet
```java
            } catch (Exception e) {
                LOG.error("Error getting cluster instance list. contextPath={} error={}", contextPath, e);
                return null;
            }
        }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/LoadServiceDocEntryImpl.java`
#### Snippet
```java
        List<UpstreamInstance> allInstances = getInstances(selectorVO.getPluginId(), selectorVO.getHandle(), selectorVO.getName(), selectorVO.getEnabled());
        if (CollectionUtils.isEmpty(allInstances)) {
            return null;
        }
        return getClusterLastUpdateInstance(allInstances);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/LoadServiceDocEntryImpl.java`
#### Snippet
```java
        if (!supportSwaggerPluginMap.containsKey(selectorData.getPluginId())) {
            LOG.info("getClusterLastUpdateInstance. pluginNae={} does not support pulling API documents.", selectorData.getPluginName());
            return null;
        }
        List<UpstreamInstance> allInstances = getInstances(selectorData.getPluginId(), selectorData.getHandle(), selectorData.getName(), selectorData.getEnabled());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/LoadServiceDocEntryImpl.java`
#### Snippet
```java
        List<UpstreamInstance> allInstances = getInstances(selectorData.getPluginId(), selectorData.getHandle(), selectorData.getName(), selectorData.getEnabled());
        if (Objects.isNull(allInstances)) {
            return null;
        }
        return getClusterLastUpdateInstance(allInstances);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/manager/impl/LoadServiceDocEntryImpl.java`
#### Snippet
```java
    private UpstreamInstance getClusterLastUpdateInstance(final List<UpstreamInstance> allInstances) {
        if (CollectionUtils.isEmpty(allInstances)) {
            return null;
        }
        return allInstances.stream()
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterDubboServiceImpl.java`
#### Snippet
```java

        if (doSubmit(selectorDO.getId(), canAddList)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterTarsServiceImpl.java`
#### Snippet
```java

        if (doSubmit(selectorDO.getId(), canAddList)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterGrpcServiceImpl.java`
#### Snippet
```java

        if (doSubmit(selectorDO.getId(), canAddList)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterDivideServiceImpl.java`
#### Snippet
```java

        if (doSubmit(selectorDO.getId(), canAddList)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/service/register/ShenyuClientRegisterSpringCloudServiceImpl.java`
#### Snippet
```java

        if (doSubmit(selectorDO.getId(), canAddList)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/controller/SandboxController.java`
#### Snippet
```java
                } catch (IOException e) {
                    LOG.error("upload file fail", e);
                    return null;
                }
            })
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/controller/SandboxController.java`
#### Snippet
```java
    private String getSecureKey(final String appKey) {
        AppAuthDO appAuthDO = appAuthService.findByAppKey(appKey);
        return Objects.nonNull(appAuthDO) ? appAuthDO.getAppSecret() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java
    private String getSubNodeKeyName(final String prefix, final String fullPath, final String separator) {
        if (prefix.length() > fullPath.length()) {
            return null;
        }
        String pathWithoutPrefix = fullPath.substring(prefix.length());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sync-data-center/shenyu-sync-data-etcd/src/main/java/org/apache/shenyu/sync/data/etcd/EtcdClient.java`
#### Snippet
```java

        if (CollectionUtils.isEmpty(keyValues)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-loadbalancer/src/main/java/org/apache/shenyu/loadbalancer/spi/AbstractLoadBalancer.java`
#### Snippet
```java
    public Upstream select(final List<Upstream> upstreamList, final String ip) {
        if (CollectionUtils.isEmpty(upstreamList)) {
            return null;
        }
        if (upstreamList.size() == 1) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/GeneratorFactory.java`
#### Snippet
```java
        int start = rule.indexOf("${");
        if (start < 0) {
            return null;
        }
        int counter = 1;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/GeneratorFactory.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-mock/src/main/java/org/apache/shenyu/plugin/mock/generator/GeneratorFactory.java`
#### Snippet
```java
            LOG.warn("{} can not parse,please check", rule);
        }
        return null;
    }
    
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClient.java`
#### Snippet
```java
            return getDirectly(key);
        }
        return Objects.isNull(data.getData()) ? null : new String(data.getData(), StandardCharsets.UTF_8);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClient.java`
#### Snippet
```java
        try {
            byte[] ret = client.getData().forPath(key);
            return Objects.isNull(ret) ? null : new String(ret, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new ShenyuException(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-register-center/shenyu-register-client-server/shenyu-register-client-server-zookeeper/src/main/java/org/apache/shenyu/register/client/server/zookeeper/ZookeeperClient.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/UriUtils.java`
#### Snippet
```java
            return URI.create(uri);
        }
        return null;
    }
    
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ShaUtils.java`
#### Snippet
```java
        return Optional.ofNullable(src).map(item -> {
            if (StringUtils.isEmpty(src)) {
                return null;
            }
            try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ReflectUtils.java`
#### Snippet
```java
            LOG.error("", e);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ReflectUtils.java`
#### Snippet
```java
    public static Object getFieldValue(final Object obj, final Field field) {
        if (Objects.isNull(obj) || Objects.isNull(field)) {
            return null;
        }
        field.setAccessible(true);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ReflectUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ReflectUtils.java`
#### Snippet
```java
    public static Object getFieldValue(final Object obj, final String fieldName) {
        if (Objects.isNull(obj) || StringUtils.isBlank(fieldName)) {
            return null;
        }
        return getFieldValue(obj, getField(obj.getClass(), fieldName));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/ReflectUtils.java`
#### Snippet
```java
            errorCallBack.accept(e);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/JsonUtils.java`
#### Snippet
```java
        } catch (IOException e) {
            LOG.warn("write to Object error: " + json, e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/GsonUtils.java`
#### Snippet
```java
                if (reader.peek() == JsonToken.NULL) {
                    reader.nextNull();
                    return null;
                }
                return Duration.parse(reader.nextString());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-common/src/main/java/org/apache/shenyu/common/utils/GsonUtils.java`
#### Snippet
```java
        public Map<T, U> deserialize(final JsonElement json, final Type type, final JsonDeserializationContext context) {
            if (!json.isJsonObject()) {
                return null;
            }
            String className = ((ParameterizedType) type).getRawType().getTypeName();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
    private static Object getMethodParameterBean(final Class<?> clazz, final Method method, final Object[] args) {
        if (!hasConstraintParameter(method)) {
            return null;
        }
        try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-dubbo/shenyu-client-alibaba-dubbo/src/main/java/org/apache/shenyu/client/alibaba/dubbo/validation/AlibabaDubboClientValidator.java`
#### Snippet
```java
        } catch (Exception e) {
            LOG.warn(e.getMessage(), e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-httpclient/src/main/java/org/apache/shenyu/plugin/httpclient/config/HttpClientProperties.java`
#### Snippet
```java
                    return keyManagerFactory;
                }
                return null;
            } catch (Exception e) {
                throw new ShenyuException(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-rocketmq/src/main/java/org/apache/shenyu/plugin/logging/rocketmq/client/RocketMQLogCollectClient.java`
#### Snippet
```java
    private RPCHook getAclRPCHook(final RocketMQLogCollectConfig.RocketMQLogConfig config) {
        if (StringUtils.isBlank(config.getAccessKey()) || StringUtils.isBlank(config.getSecretKey())) {
            return null;
        }
        return new AclClientRPCHook(new SessionCredentials(config.getAccessKey(), config.getSecretKey()));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-sync-data-center/shenyu-sync-data-nacos/src/main/java/org/apache/shenyu/sync/data/nacos/handler/NacosCacheHandler.java`
#### Snippet
```java
            @Override
            public Executor getExecutor() {
                return null;
            }
        };
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/init/SpringMvcClientEventListener.java`
#### Snippet
```java
                    .ruleName(getContextPath())
                    .build());
            return null;
        }
        return context.getBeansWithAnnotation(Controller.class);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/init/SpringMvcClientEventListener.java`
#### Snippet
```java
    private String getPathByAnnotation(@Nullable final Annotation annotation) {
        if (Objects.isNull(annotation)) {
            return null;
        }
        final Object value = AnnotationUtils.getValue(annotation, "value");
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/init/SpringMvcClientEventListener.java`
#### Snippet
```java
            return ((String[]) value)[0];
        }
        return null;
    }
    
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-client/shenyu-client-http/shenyu-client-springmvc/src/main/java/org/apache/shenyu/client/springmvc/init/SpringMvcClientEventListener.java`
#### Snippet
```java
            }
        }
        return null;
    }
    
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `shenyu-web/src/main/java/org/apache/shenyu/web/loader/ShenyuPluginLoader.java`
#### Snippet
```java
            }
        }
        return null;
    }
    
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `ret`
in `shenyu-plugin/shenyu-plugin-sofa/src/main/java/org/apache/shenyu/plugin/sofa/proxy/SofaProxyService.java`
#### Snippet
```java
        return Mono.fromFuture(future.thenApply(ret -> {
            if (Objects.isNull(ret)) {
                ret = Constants.SOFA_RPC_RESULT_EMPTY;
            }
            
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `ret`
in `shenyu-plugin/shenyu-plugin-tars/src/main/java/org/apache/shenyu/plugin/tars/TarsPlugin.java`
#### Snippet
```java
        return Mono.fromFuture(future.thenApply(ret -> {
            if (Objects.isNull(ret)) {
                ret = Constants.TARS_RPC_RESULT_EMPTY;
            }
            exchange.getAttributes().put(Constants.RPC_RESULT, ret);
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `value`
in `shenyu-plugin/shenyu-plugin-logging/shenyu-plugin-logging-console/src/main/java/org/apache/shenyu/plugin/logging/console/LoggingConsolePlugin.java`
#### Snippet
```java
            params.forEach((key, value) -> {
                // mask query parameters
                value = Lists.newArrayList(value);
                DataMaskUtils.maskList(maskFlag, key, value, keyWordMatch, dataMaskAlg);
                logInfo.append(key).append(": ")
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `ret`
in `shenyu-plugin/shenyu-plugin-dubbo/shenyu-plugin-apache-dubbo/src/main/java/org/apache/shenyu/plugin/apache/dubbo/proxy/ApacheDubboProxyService.java`
#### Snippet
```java
        return Mono.fromFuture(invokeAsync(genericService, metaData.getMethodName(), pair.getLeft(), pair.getRight()).thenApply(ret -> {
            if (Objects.isNull(ret)) {
                ret = Constants.DUBBO_RPC_RESULT_EMPTY;
            }
            exchange.getAttributes().put(Constants.RPC_RESULT, ret);
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `clientBeans` is redundant
in `shenyu-client/shenyu-client-websocket/shenyu-client-spring-websocket/src/main/java/org/apache/shenyu/client/spring/websocket/init/SpringWebSocketClientEventListener.java`
#### Snippet
```java
        registerEndpointsBeans(context, endpointBeans);

        Map<String, Object> clientBeans = context.getBeansWithAnnotation(ShenyuSpringWebSocketClient.class);
        return clientBeans;
    }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `permissionInfo` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/vo/RoleEditVO.java`
#### Snippet
```java
             */
            public PermissionInfo build() {
                PermissionInfo permissionInfo = new PermissionInfo(treeList, permissionIds);
                return permissionInfo;
            }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `resourceInfo` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/vo/RoleEditVO.java`
#### Snippet
```java
             */
            public ResourceInfo build() {
                ResourceInfo resourceInfo = new ResourceInfo(id, title, name, children, isLeaf, parentId);
                return resourceInfo;
            }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `menuInfo` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/vo/PermissionMenuVO.java`
#### Snippet
```java
             */
            public MenuInfo build() {
                MenuInfo menuInfo = new MenuInfo(id, name, url, component, meta, children, sort);
                return menuInfo;
            }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `resourceDO` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/entity/ResourceDO.java`
#### Snippet
```java
        return Optional.ofNullable(createResourceDTO).map(item -> {
            Timestamp currentTime = new Timestamp(System.currentTimeMillis());
            ResourceDO resourceDO = ResourceDO.builder()
                .parentId(item.getParentId())
                .title(item.getTitle())
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `dashboardUserDO` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/model/entity/DashboardUserDO.java`
#### Snippet
```java
        return Optional.ofNullable(dashboardUserModifyPasswordDTO).map(item -> {
            Timestamp currentTime = new Timestamp(System.currentTimeMillis());
            DashboardUserDO dashboardUserDO = DashboardUserDO.builder()
                    .password(item.getPassword())
                    .dateUpdated(currentTime)
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `signContent` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/utils/ShenyuSignatureUtils.java`
#### Snippet
```java
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
        final String signContent = storedKeys.stream()
            .map(key -> String.join("", key, map.get(key)))
            .collect(Collectors.joining()).trim()
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `files` is redundant
in `shenyu-admin/src/main/java/org/apache/shenyu/admin/controller/SandboxController.java`
#### Snippet
```java
    private List<HttpUtils.UploadFile> uploadFiles(final HttpServletRequest request) {
        Collection<MultipartFile> uploadFiles = UploadUtils.getUploadFiles(request);
        List<HttpUtils.UploadFile> files = uploadFiles.stream()
            .map(multipartFile -> {
                try {
```

## RuleId[ruleID=UnstableApiUsage]
### RuleId[ruleID=UnstableApiUsage]
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `shenyu-disruptor/src/main/java/org/apache/shenyu/disruptor/thread/OrderlyExecutor.java`
#### Snippet
```java
            return Hashing
                    .sha256()
                    .newHasher()
                    .putBytes(bytes)
                    .hash().asBytes();
```

### RuleId[ruleID=UnstableApiUsage]
'putBytes(byte\[\])' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `shenyu-disruptor/src/main/java/org/apache/shenyu/disruptor/thread/OrderlyExecutor.java`
#### Snippet
```java
                    .sha256()
                    .newHasher()
                    .putBytes(bytes)
                    .hash().asBytes();
        }
```

### RuleId[ruleID=UnstableApiUsage]
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `shenyu-disruptor/src/main/java/org/apache/shenyu/disruptor/thread/OrderlyExecutor.java`
#### Snippet
```java
                    .newHasher()
                    .putBytes(bytes)
                    .hash().asBytes();
        }
    }
```

