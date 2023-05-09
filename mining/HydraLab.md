# HydraLab 
 
# Bad smells
I found 615 bad smells with 27 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 136 | false |
| JavadocDeclaration | 74 | false |
| FieldMayBeFinal | 71 | false |
| SpringBootApplicationYaml | 43 | false |
| UnusedAssignment | 36 | false |
| DataFlowIssue | 34 | false |
| DuplicatedCode | 34 | false |
| IgnoreResultOfCall | 20 | false |
| DanglingJavadoc | 20 | false |
| UnnecessaryLocalVariable | 14 | true |
| TrivialIf | 12 | false |
| UNUSED_IMPORT | 11 | false |
| ConstantValue | 11 | false |
| FieldCanBeLocal | 10 | false |
| DefaultAnnotationParam | 9 | false |
| UnnecessaryStringEscape | 4 | true |
| RedundantArrayCreation | 4 | true |
| NonFinalFieldInEnum | 4 | false |
| Deprecation | 4 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| ArraysAsListWithZeroOrOneArgument | 4 | false |
| TrivialStringConcatenation | 3 | false |
| SimplifyOptionalCallChains | 3 | false |
| UnnecessarySemicolon | 3 | false |
| SwitchStatementWithConfusingDeclaration | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| SpringDataMethodInconsistencyInspection | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| UnnecessaryModifier | 2 | true |
| RegExpRedundantEscape | 2 | false |
| RegExpSimplifiable | 2 | false |
| DuplicateExpressions | 2 | false |
| StringConcatenationInLoops | 2 | false |
| UNCHECKED_WARNING | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| AutoCloseableResource | 2 | false |
| EmptyStatementBody | 1 | false |
| SpringDataRepositoryMethodParametersInspection | 1 | false |
| CommentedOutCode | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| RedundantMethodOverride | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| OptionalIsPresent | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| PlaceholderCountMatchesArgumentCount | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RedundantCollectionOperation | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| CatchMayIgnoreException | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| SpringJavaAutowiredFieldsWarningInspection | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java
        if (ShellUtils.isConnectedToWindowsOS) {
            IOSAppiumScreenRecorderForWindows.copyScript(agentManagementService.getTestBaseDir());
        } else {
            // Mac, unix or linux
            // do nothing
```

## RuleId[id=SpringDataRepositoryMethodParametersInspection]
### SpringDataRepositoryMethodParametersInspection
Expected parameter types: **int**
in `center/src/main/java/com/microsoft/hydralab/center/repository/AgentUserRepository.java`
#### Snippet
```java
@Repository
public interface AgentUserRepository extends JpaRepository<AgentUser, String>, JpaSpecificationExecutor<AgentUser> {
    Page<AgentUser> findByStatus(String status, Pageable pageable);

    Optional<AgentUser> findByMailAddress(String mailAddress);
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

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve configuration property 'app.appium.port'
in `agent/src/main/resources/application-docker.yml`
#### Snippet
```java
  appium:
    host: host.docker.internal
    port: 10086
  adb:
    # Official doc about this hostname: https://docs.docker.com/desktop/networking/#i-want-to-connect-from-a-container-to-a-service-on-the-host
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.adb.port'
in `agent/src/main/resources/application-docker.yml`
#### Snippet
```java
    # Official doc about this hostname: https://docs.docker.com/desktop/networking/#i-want-to-connect-from-a-container-to-a-service-on-the-host
    host: host.docker.internal
    port: 5037
```

### SpringBootApplicationYaml
Cannot resolve property 'photo-uri' in org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties.Provider
in `center/src/main/resources/application-release.yml`
#### Snippet
```java
            token-uri: https://login.microsoftonline.com/${MICROSOFT_PROVIDER_TENANT_ID}/oauth2/v2.0/token
            jwk-set-uri: https://login.microsoftonline.com/${MICROSOFT_PROVIDER_TENANT_ID}/discovery/v2.0/keys
            photo-uri: https://graph.microsoft.com/v1.0/me/photo/$value
        registration:
          azure-client:
```

### SpringBootApplicationYaml
Cannot resolve property 'ignore-uri' in org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties.Registration
in `center/src/main/resources/application-release.yml`
#### Snippet
```java
            authorization-grant-type: authorization_code
            redirect-uri: ${MICROSOFT_RERIRECT_URL}
            ignore-uri: '/api/auth,/agent/connect'
            scope: 'https://graph.microsoft.com/User.Read'
  datasource:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.jpa.hibernate.dialect'
in `center/src/main/resources/application-release.yml`
#### Snippet
```java
    show-sql: false
    hibernate:
      dialect: org.hibernate.dialect.SQLServer2012Dialect
      ddl-auto: update
    properties:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.jpa.hibernate.dialect'
in `agent/src/main/resources/application.yml`
#### Snippet
```java
    show-sql: false
    hibernate:
      dialect: org.sqlite.hibernate.dialect.SQLiteDialect
      ddl-auto: update
    properties:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands'
in `agent/src/main/resources/application.yml`
#### Snippet
```java
  location: ${user.dir}
  device-script:
    commands:
# Prometheus Configuration
management:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'management.endpoints.web.health.show-details'
in `agent/src/main/resources/application.yml`
#### Snippet
```java
        include: prometheus
      health:
        show-details: always
      metrics:
        tags:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'management.endpoints.web.metrics.tags.application'
in `agent/src/main/resources/application.yml`
#### Snippet
```java
      metrics:
        tags:
          application: ${spring.application.name}
  metrics:
    export:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
        enabled: true
  device-script:
    commands:
      - type: ADBShell
        when: setUp
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[0\].type'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
  device-script:
    commands:
      - type: ADBShell
        when: setUp
        suite-class-matcher: '.*'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[0\].when'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
    commands:
      - type: ADBShell
        when: setUp
        suite-class-matcher: '.*'
        inline: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[0\].suite-class-matcher'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
      - type: ADBShell
        when: setUp
        suite-class-matcher: '.*'
        inline: |
          test command 1
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[0\].inline'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
        when: setUp
        suite-class-matcher: '.*'
        inline: |
          test command 1
      - type: ADBShell
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[1\].type'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
        inline: |
          test command 1
      - type: ADBShell
        when: setUp
        suite-class-matcher: '.*test.*'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[1\].when'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
          test command 1
      - type: ADBShell
        when: setUp
        suite-class-matcher: '.*test.*'
        inline: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[1\].suite-class-matcher'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
      - type: ADBShell
        when: setUp
        suite-class-matcher: '.*test.*'
        inline: |
          test command 2
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[1\].inline'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
        when: setUp
        suite-class-matcher: '.*test.*'
        inline: |
          test command 2
          test command 3
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[2\].type'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
          test command 2
          test command 3
      - type: AgentShell
        when: setUp
        suite-class-matcher: '.*test.*'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[2\].when'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
          test command 3
      - type: AgentShell
        when: setUp
        suite-class-matcher: '.*test.*'
        inline: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[2\].suite-class-matcher'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
      - type: AgentShell
        when: setUp
        suite-class-matcher: '.*test.*'
        inline: |
          test command 4
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[2\].inline'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
        when: setUp
        suite-class-matcher: '.*test.*'
        inline: |
          test command 4
      - type: ADBShell
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[3\].type'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
        inline: |
          test command 4
      - type: ADBShell
        when: tearDown
        suite-class-matcher: 'com.microsoft.test'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[3\].when'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
          test command 4
      - type: ADBShell
        when: tearDown
        suite-class-matcher: 'com.microsoft.test'
        inline: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[3\].suite-class-matcher'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
      - type: ADBShell
        when: tearDown
        suite-class-matcher: 'com.microsoft.test'
        inline: |
          test command 5
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[3\].inline'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
        when: tearDown
        suite-class-matcher: 'com.microsoft.test'
        inline: |
          test command 5
      - type: AgentShell
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[4\].type'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
        inline: |
          test command 5
      - type: AgentShell
        when: tearDown
        suite-class-matcher: 'com.microsoft.test'
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[4\].when'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
          test command 5
      - type: AgentShell
        when: tearDown
        suite-class-matcher: 'com.microsoft.test'
        inline: |
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[4\].suite-class-matcher'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
      - type: AgentShell
        when: tearDown
        suite-class-matcher: 'com.microsoft.test'
        inline: |
          test command 6
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.device-script.commands\[4\].inline'
in `agent/src/test/resources/application-test.yml`
#### Snippet
```java
        when: tearDown
        suite-class-matcher: 'com.microsoft.test'
        inline: |
          test command 6
          test command 7
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.jpa.hibernate.dialect'
in `center/src/main/resources/application.yml`
#### Snippet
```java
    show-sql: false
    hibernate:
      dialect: org.sqlite.hibernate.dialect.SQLiteDialect
      ddl-auto: update
    properties:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.azure.connection'
in `center/src/main/resources/application.yml`
#### Snippet
```java
    type: ${STORAGE_TYPE:LOCAL} # current available options: LOCAL (default), AZURE
    azure:
      connection: ${BLOB_CONNECTION_STR:}
      fileExpiryDay: ${fileExpiryDay:6}
      CDNUrl: ${CDN_URL:}
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.azure.fileExpiryDay'
in `center/src/main/resources/application.yml`
#### Snippet
```java
    azure:
      connection: ${BLOB_CONNECTION_STR:}
      fileExpiryDay: ${fileExpiryDay:6}
      CDNUrl: ${CDN_URL:}
      SASExpiryTimeFront: ${BLOB_SAS_EXPIRY_FRONT:120}
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.azure.CDNUrl'
in `center/src/main/resources/application.yml`
#### Snippet
```java
      connection: ${BLOB_CONNECTION_STR:}
      fileExpiryDay: ${fileExpiryDay:6}
      CDNUrl: ${CDN_URL:}
      SASExpiryTimeFront: ${BLOB_SAS_EXPIRY_FRONT:120}
      SASExpiryTimeAgent: ${BLOB_SAS_EXPIRY_AGENT:120}
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.azure.SASExpiryTimeFront'
in `center/src/main/resources/application.yml`
#### Snippet
```java
      fileExpiryDay: ${fileExpiryDay:6}
      CDNUrl: ${CDN_URL:}
      SASExpiryTimeFront: ${BLOB_SAS_EXPIRY_FRONT:120}
      SASExpiryTimeAgent: ${BLOB_SAS_EXPIRY_AGENT:120}
      SASExpiryUpdate: ${BLOB_SAS_EXPIRY_UPDATE:10}
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.azure.SASExpiryTimeAgent'
in `center/src/main/resources/application.yml`
#### Snippet
```java
      CDNUrl: ${CDN_URL:}
      SASExpiryTimeFront: ${BLOB_SAS_EXPIRY_FRONT:120}
      SASExpiryTimeAgent: ${BLOB_SAS_EXPIRY_AGENT:120}
      SASExpiryUpdate: ${BLOB_SAS_EXPIRY_UPDATE:10}
      timeUnit: ${TIME_UNIT:MINUTES}
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.azure.SASExpiryUpdate'
in `center/src/main/resources/application.yml`
#### Snippet
```java
      SASExpiryTimeFront: ${BLOB_SAS_EXPIRY_FRONT:120}
      SASExpiryTimeAgent: ${BLOB_SAS_EXPIRY_AGENT:120}
      SASExpiryUpdate: ${BLOB_SAS_EXPIRY_UPDATE:10}
      timeUnit: ${TIME_UNIT:MINUTES}
    local:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.azure.timeUnit'
in `center/src/main/resources/application.yml`
#### Snippet
```java
      SASExpiryTimeAgent: ${BLOB_SAS_EXPIRY_AGENT:120}
      SASExpiryUpdate: ${BLOB_SAS_EXPIRY_UPDATE:10}
      timeUnit: ${TIME_UNIT:MINUTES}
    local:
      token: ${CENTER_TOKEN:token=CENTER_LOCAL_STORAGE_TOKEN}
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.local.token'
in `center/src/main/resources/application.yml`
#### Snippet
```java
      timeUnit: ${TIME_UNIT:MINUTES}
    local:
      token: ${CENTER_TOKEN:token=CENTER_LOCAL_STORAGE_TOKEN}
      endpoint: ${LOCAL_STORAGE_ENDPOINT:http://localhost:9886/}
      fileExpiryDay: ${fileExpiryDay:-1}
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.local.endpoint'
in `center/src/main/resources/application.yml`
#### Snippet
```java
    local:
      token: ${CENTER_TOKEN:token=CENTER_LOCAL_STORAGE_TOKEN}
      endpoint: ${LOCAL_STORAGE_ENDPOINT:http://localhost:9886/}
      fileExpiryDay: ${fileExpiryDay:-1}
  location: ${user.dir}
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'app.storage.local.fileExpiryDay'
in `center/src/main/resources/application.yml`
#### Snippet
```java
      token: ${CENTER_TOKEN:token=CENTER_LOCAL_STORAGE_TOKEN}
      endpoint: ${LOCAL_STORAGE_ENDPOINT:http://localhost:9886/}
      fileExpiryDay: ${fileExpiryDay:-1}
  location: ${user.dir}
management:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'management.endpoints.web.health.show-details'
in `center/src/main/resources/application.yml`
#### Snippet
```java
        include: prometheus
      health:
        show-details: always
      metrics:
        tags:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'management.endpoints.web.metrics.tags.application'
in `center/src/main/resources/application.yml`
#### Snippet
```java
      metrics:
        tags:
          application: ${spring.application.name}
  metrics:
    export:
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `regEx` in enum 'MaskSensitiveData'
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
        ACCESS_KEY("(access[_\\s-]*key)[=:\"\\s]*(\\w*)");

        private String regEx;

        MaskSensitiveData(String exp) {
```

### NonFinalFieldInEnum
Non-final field `status` in enum 'AgentLiveStatus'
in `common/src/main/java/com/microsoft/hydralab/common/util/GlobalConstant.java`
#### Snippet
```java
        }

        public String status;

        public String getStatus(){
```

### NonFinalFieldInEnum
Non-final field `typeName` in enum 'EntityType'
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/EntityType.java`
#### Snippet
```java
    TEST_JSON("TEST_JSON");

    public String typeName;
    public String storageContainer;

```

### NonFinalFieldInEnum
Non-final field `regEx` in enum 'MaskSensitiveData'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        ACCESS_KEY("(access[_\\s-]*key)[=:\"\\s]*(\\w*)");

        private String regEx;

        MaskSensitiveData(String exp) {
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

## RuleId[id=Deprecation]
### Deprecation
'create(okhttp3.MediaType, java.io.File)' is deprecated
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
                .addFormDataPart("commitCount", commitCount)
                .addFormDataPart("commitMessage", commitMsg)
                .addFormDataPart("appFile", app.getName(), RequestBody.create(contentType, app));
        if (!StringUtils.isEmpty(testConfig.teamName)) {
            multipartBodyBuilder.addFormDataPart("teamName", testConfig.teamName);
```

### Deprecation
'create(okhttp3.MediaType, java.io.File)' is deprecated
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
        }
        if (testApp != null) {
            multipartBodyBuilder.addFormDataPart("testAppFile", testApp.getName(), RequestBody.create(contentType, testApp));
        }
        if (StringUtils.isNotBlank(testConfig.appVersion)) {
```

### Deprecation
'create(okhttp3.MediaType, java.lang.String)' is deprecated
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
        String content = GSON.toJson(jsonElement);
        printlnf("triggerTestRun api post body: %s", maskCred(content));
        RequestBody jsonBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), GSON.toJson(jsonElement));

        Request req = new Request.Builder()
```

### Deprecation
'create(okhttp3.MediaType, java.io.File)' is deprecated
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabAPIClient.java`
#### Snippet
```java
                .addFormDataPart("fileSetId", testFileSetId)
                .addFormDataPart("fileType", attachmentConfig.fileType)
                .addFormDataPart("attachment", attachmentConfig.fileName, RequestBody.create(contentType, attachment));
        if (StringUtils.isNotEmpty(attachmentConfig.loadType)) {
            multipartBodyBuilder.addFormDataPart("loadType", attachmentConfig.loadType);
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/CorsInterceptor.java`
#### Snippet
```java

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/CorsInterceptor.java`
#### Snippet
```java

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/CorsInterceptor.java`
#### Snippet
```java

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/CorsInterceptor.java`
#### Snippet
```java

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/CorsInterceptor.java`
#### Snippet
```java

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/CorsInterceptor.java`
#### Snippet
```java

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/CorsInterceptor.java`
#### Snippet
```java

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String requestURI = request.getRequestURI();
        String requestMethod = request.getMethod();
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/CorsInterceptor.java`
#### Snippet
```java

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String requestURI = request.getRequestURI();
        String requestMethod = request.getMethod();
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        String remoteUser = request.getRemoteUser();
        String requestURI = request.getRequestURI();
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        String remoteUser = request.getRemoteUser();
        String requestURI = request.getRequestURI();
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) {
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) {
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) {
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `center/src/main/java/com/microsoft/hydralab/center/interceptor/BaseInterceptor.java`
#### Snippet
```java

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
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
    File getScreenShotWithStrategy(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger, @NotNull AgentUser.BatteryStrategy batteryStrategy);

    void wakeUpDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void unlockDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);
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
                                                @Nullable Logger logger);

    void testDeviceSetup(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void removeFileInDevice(DeviceInfo deviceInfo, String pathOnDevice, Logger logger);
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
    void unlockDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
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
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/WindowsDeviceDriver.java`
#### Snippet
```java

    @Override
    public void screenCapture(DeviceInfo deviceInfo, String outputFile, Logger logger) throws IOException {
        File scrFile = appiumServerManager.getWindowsRootDriver(logger).getScreenshotAs(OutputType.FILE);
        BufferedImage screenshot = ImageIO.read(scrFile);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/WindowsDeviceDriver.java`
#### Snippet
```java

    @Override
    public void screenCapture(DeviceInfo deviceInfo, String outputFile, Logger logger) throws IOException {
        File scrFile = appiumServerManager.getWindowsRootDriver(logger).getScreenshotAs(OutputType.FILE);
        BufferedImage screenshot = ImageIO.read(scrFile);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/WindowsDeviceDriver.java`
#### Snippet
```java

    @Override
    public ScreenRecorder getScreenRecorder(DeviceInfo deviceInfo, File folder, Logger logger) {
        return new WindowsScreenRecorder(this, deviceInfo, folder, logger);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/WindowsDeviceDriver.java`
#### Snippet
```java

    @Override
    public ScreenRecorder getScreenRecorder(DeviceInfo deviceInfo, File folder, Logger logger) {
        return new WindowsScreenRecorder(this, deviceInfo, folder, logger);
    }
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
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public ScreenRecorder getScreenRecorder(DeviceInfo deviceInfo, File folder, Logger logger) {
        if (ShellUtils.isConnectedToWindowsOS) {
            return new IOSAppiumScreenRecorderForWindows(this, deviceInfo, folder.getAbsolutePath());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public ScreenRecorder getScreenRecorder(DeviceInfo deviceInfo, File folder, Logger logger) {
        if (ShellUtils.isConnectedToWindowsOS) {
            return new IOSAppiumScreenRecorderForWindows(this, deviceInfo, folder.getAbsolutePath());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean installApp(DeviceInfo deviceInfo, String packagePath, Logger logger) {
        IOSUtils.installApp(deviceInfo.getSerialNum(), packagePath, logger);
        return true;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void resetPackage(DeviceInfo deviceInfo, String packageName, Logger logger) {
        // todo Nothing Implemented for iOS in resetPackage replace with uninstallApp
        uninstallApp(deviceInfo, packageName, logger);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void resetPackage(DeviceInfo deviceInfo, String packageName, Logger logger) {
        // todo Nothing Implemented for iOS in resetPackage replace with uninstallApp
        uninstallApp(deviceInfo, packageName, logger);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void testDeviceSetup(DeviceInfo deviceInfo, Logger logger) {

    }
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
    }

    public abstract void wakeUpDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void unlockDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);
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
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean grantProjectionAndBatteryPermission(DeviceInfo deviceInfo, String recordPackageName,
                                                       Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
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
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean grantProjectionAndBatteryPermission(DeviceInfo deviceInfo, String recordPackageName,
                                                       Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
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
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public LogCollector getLogCollector(DeviceInfo deviceInfo, String pkgName, TestRun testRun, Logger logger) {
        return new IOSLogCollector(deviceInfo, pkgName, testRun, logger);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public LogCollector getLogCollector(DeviceInfo deviceInfo, String pkgName, TestRun testRun, Logger logger) {
        return new IOSLogCollector(deviceInfo, pkgName, testRun, logger);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public LogCollector getLogCollector(DeviceInfo deviceInfo, String pkgName, TestRun testRun, Logger logger) {
        return new IOSLogCollector(deviceInfo, pkgName, testRun, logger);
    }
```

### NullableProblems
Overridden method parameters are not annotated
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AbstractDeviceDriver.java`
#### Snippet
```java
    public abstract void unlockDevice(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void backToHome(@NotNull DeviceInfo deviceInfo, @Nullable Logger logger);

    public abstract void grantPermission(@NotNull DeviceInfo deviceInfo, @NotNull String packageName,
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
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public LogCollector getLogCollector(DeviceInfo deviceInfo, String pkgName, TestRun testRun, Logger logger) {
        return new IOSLogCollector(deviceInfo, pkgName, testRun, logger);
    }
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
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void wakeUpDevice(DeviceInfo deviceInfo, Logger logger) {
        classLogger.info("Unlocking may not work as expected, please keep your device wake.");
        getAppiumServerManager().getIOSDriver(deviceInfo, logger).unlockDevice();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean uninstallApp(DeviceInfo deviceInfo, String packageName, Logger logger) {
        String result = IOSUtils.uninstallApp(deviceInfo.getSerialNum(), packageName, logger);
        return result != null && !isAppInstalled(deviceInfo, packageName, logger);
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
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean setDefaultLauncher(DeviceInfo deviceInfo, String packageName, String defaultActivity,
                                      Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean setDefaultLauncher(DeviceInfo deviceInfo, String packageName, String defaultActivity,
                                      Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean setDefaultLauncher(DeviceInfo deviceInfo, String packageName, String defaultActivity,
                                      Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void setProperty(DeviceInfo deviceInfo, String property, String val, Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void setProperty(DeviceInfo deviceInfo, String property, String val, Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean isAppInstalled(DeviceInfo deviceInfo, String packageName, Logger logger) {
        String result = IOSUtils.getAppList(deviceInfo.getSerialNum(), logger);
        if (result != null && !result.equals("")) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void backToHome(DeviceInfo deviceInfo, Logger logger) {
//        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
        getAppiumServerManager().getIOSDriver(deviceInfo, logger).runAppInBackground(Duration.ofSeconds(-1));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void grantPermission(DeviceInfo deviceInfo, String packageName, String permissionName, Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void grantPermission(DeviceInfo deviceInfo, String packageName, String permissionName, Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java

    @Override
    public void grantPermission(DeviceInfo deviceInfo, String packageName, String permissionName, Logger logger) {
        classLogger.info("Nothing Implemented for iOS in " + currentMethodName());
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean isAppInstalled(DeviceInfo deviceInfo, String packageName, Logger logger) {
        Assert.isTrue(deviceInfo.isAlive());
        final boolean[] locked = {false};
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void backToHome(DeviceInfo deviceInfo, Logger logger) {
        sendKeyEvent(deviceInfo, KEYCODE_HOME, logger);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void addToBatteryWhiteList(DeviceInfo deviceInfo, String packageName, Logger logger) {
        try {
            adbOperateUtil.execOnDevice(deviceInfo, String.format("dumpsys deviceidle whitelist +%s", packageName),
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void addToBatteryWhiteList(DeviceInfo deviceInfo, String packageName, Logger logger) {
        try {
            adbOperateUtil.execOnDevice(deviceInfo, String.format("dumpsys deviceidle whitelist +%s", packageName),
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void addToBatteryWhiteList(DeviceInfo deviceInfo, String packageName, Logger logger) {
        try {
            adbOperateUtil.execOnDevice(deviceInfo, String.format("dumpsys deviceidle whitelist +%s", packageName),
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean uninstallApp(DeviceInfo deviceInfo, String packageName, Logger logger) {
        return adbOperateUtil.uninstallApp(deviceInfo, packageName, logger);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean uninstallApp(DeviceInfo deviceInfo, String packageName, Logger logger) {
        return adbOperateUtil.uninstallApp(deviceInfo, packageName, logger);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public ADBLogcatCollector getLogCollector(DeviceInfo deviceInfo, String pkgName, TestRun testRun,
                                              Logger logger) {
        return new ADBLogcatCollector(this.adbOperateUtil, deviceInfo, pkgName, testRun, logger);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public ADBLogcatCollector getLogCollector(DeviceInfo deviceInfo, String pkgName, TestRun testRun,
                                              Logger logger) {
        return new ADBLogcatCollector(this.adbOperateUtil, deviceInfo, pkgName, testRun, logger);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public ADBLogcatCollector getLogCollector(DeviceInfo deviceInfo, String pkgName, TestRun testRun,
                                              Logger logger) {
        return new ADBLogcatCollector(this.adbOperateUtil, deviceInfo, pkgName, testRun, logger);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
    @Override
    public ADBLogcatCollector getLogCollector(DeviceInfo deviceInfo, String pkgName, TestRun testRun,
                                              Logger logger) {
        return new ADBLogcatCollector(this.adbOperateUtil, deviceInfo, pkgName, testRun, logger);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void resetPackage(DeviceInfo deviceInfo, String packageName, Logger logger) {
        try {
            adbOperateUtil.execOnDevice(deviceInfo, String.format("pm clear %s", packageName),
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void resetPackage(DeviceInfo deviceInfo, String packageName, Logger logger) {
        try {
            adbOperateUtil.execOnDevice(deviceInfo, String.format("pm clear %s", packageName),
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean grantProjectionAndBatteryPermission(DeviceInfo deviceInfo, String recordPackageName,
                                                       Logger logger) {
        boolean isProjectionPermissionGranted = false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean grantProjectionAndBatteryPermission(DeviceInfo deviceInfo, String recordPackageName,
                                                       Logger logger) {
        boolean isProjectionPermissionGranted = false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void screenCapture(DeviceInfo deviceInfo, String outputFile, Logger logger) throws Exception {
        RawImage image = adbOperateUtil.getScreenshot(deviceInfo, logger);
        if (image == null) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void screenCapture(DeviceInfo deviceInfo, String outputFile, Logger logger) throws Exception {
        RawImage image = adbOperateUtil.getScreenshot(deviceInfo, logger);
        if (image == null) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
     * -g: Grant all permissions listed in the app manifest.
     */
    public boolean installApp(DeviceInfo deviceInfo, String packagePath, @Nullable Logger logger) {
        File apk = new File(packagePath);
        Assert.isTrue(apk.exists(), "apk not exist!!");
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
     * -g: Grant all permissions listed in the app manifest.
     */
    public boolean installApp(DeviceInfo deviceInfo, String packagePath, @Nullable Logger logger) {
        File apk = new File(packagePath);
        Assert.isTrue(apk.exists(), "apk not exist!!");
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean setDefaultLauncher(DeviceInfo deviceInfo, String packageName, String defaultActivity,
                                      Logger logger) {
        try {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean setDefaultLauncher(DeviceInfo deviceInfo, String packageName, String defaultActivity,
                                      Logger logger) {
        try {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public boolean setDefaultLauncher(DeviceInfo deviceInfo, String packageName, String defaultActivity,
                                      Logger logger) {
        try {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void setProperty(DeviceInfo deviceInfo, String property, String val, Logger logger) {
        try {
            adbOperateUtil.execOnDevice(deviceInfo, String.format("setprop %s %s", property, val),
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void setProperty(DeviceInfo deviceInfo, String property, String val, Logger logger) {
        try {
            adbOperateUtil.execOnDevice(deviceInfo, String.format("setprop %s %s", property, val),
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public ScreenRecorder getScreenRecorder(DeviceInfo deviceInfo, File folder, Logger logger) {
        return new PhoneAppScreenRecorder(this, this.adbOperateUtil, deviceInfo, folder, logger);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public ScreenRecorder getScreenRecorder(DeviceInfo deviceInfo, File folder, Logger logger) {
        return new PhoneAppScreenRecorder(this, this.adbOperateUtil, deviceInfo, folder, logger);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    public void wakeUpDevice(DeviceInfo deviceInfo, Logger logger) {
        sendKeyEvent(deviceInfo, KEYCODE_WAKEUP, logger);
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
     * @param loggerName
     * @param filePath
     * @param logPattern http://logback.qos.ch/manual/layouts.html
     * @return
     */
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
    private AndroidTestUnit ongoingTestUnit;
    private int numTests;
    private int pid;

    public EspressoTestInfoProcessorListener(AgentManagementService agentManagementService, ADBOperateUtil adbOperateUtil,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `center/src/main/java/com/microsoft/hydralab/center/config/ContextStartup.java`
#### Snippet
```java
    @Resource
    DeviceAgentManagementService deviceAgentManagementService;
    private ServletContext servletContext;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
    private final Logger logger = LoggerFactory.getLogger(PackageSetController.class);
    private final SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    private final int messageLength = 200;
    @Resource
    AttachmentService attachmentService;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
    private final Logger instanceLogger = LoggerFactory.getLogger(ADBOperateUtil.class);
    Runtime runtime = Runtime.getRuntime();
    private String mAndroidHome;
    private File mAdbPath;
    private String adbServerHost = DdmPreferences.DEFAULT_ADBHOST_VALUE;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSPerfTestHelper.java`
#### Snippet
```java
    private volatile static IOSPerfTestHelper instance = null;

    private final Logger classLogger = LoggerFactory.getLogger(getClass());

    private static final String lowestVersion = "0.10.2";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/com/microsoft/hydralab/common/logger/impl/WindowsLogCollector.java`
#### Snippet
```java
    private final DeviceInfo connectedDevice;
    private final TestRun testRun;
    private final String pkgName;
    private final Logger infoLogger;
    private String loggerFilePath;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/com/microsoft/hydralab/common/logger/impl/WindowsLogCollector.java`
#### Snippet
```java
    private final TestRun testRun;
    private final String pkgName;
    private final Logger infoLogger;
    private String loggerFilePath;
    private boolean started;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/com/microsoft/hydralab/common/logger/impl/WindowsLogCollector.java`
#### Snippet
```java

public class WindowsLogCollector implements LogCollector {
    private final DeviceInfo connectedDevice;
    private final TestRun testRun;
    private final String pkgName;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/com/microsoft/hydralab/common/screen/WindowsScreenRecorder.java`
#### Snippet
```java

public class WindowsScreenRecorder implements ScreenRecorder {
    private final DeviceDriver deviceDriver;
    private final DeviceInfo deviceInfo;
    private final File baseFolder;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/com/microsoft/hydralab/common/screen/WindowsScreenRecorder.java`
#### Snippet
```java
public class WindowsScreenRecorder implements ScreenRecorder {
    private final DeviceDriver deviceDriver;
    private final DeviceInfo deviceInfo;
    private final File baseFolder;
    private final Logger logger;
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
            }
            if (zipFile.exists()) {
                zipFile.delete();
            }
        }
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
    private String pkgName;
    private String testPkgName;
    @Column(nullable = true)
    private String reportImagePath;
    @Transient
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

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `common/src/main/java/com/microsoft/hydralab/common/management/AgentManagementService.java`
#### Snippet
```java
            Optional<EnvCapability> envCapability =
                    envInfo.getCapabilities().stream().filter(capability -> capability.getKeyword().equals(requirement.getEnvCapability().getKeyword())).findFirst();
            if (!envCapability.isPresent()) {
                available = false;
                continue;
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
Unused import `import java.util.ArrayList;`
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/IOSDeviceDriver.java`
#### Snippet
```java
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/WindowsDeviceDriver.java`
#### Snippet
```java
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `testRunEngineMap` are queried, but never updated
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunnerManager.java`
#### Snippet
```java
public class TestRunnerManager {

    private final Map<String, TestRunEngine> testRunEngineMap = new HashMap<>();

    public TestReport runTestTask(TestTask testTask, TestRunDevice testRunDevice) {
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunDeviceOrchestrator.java`
#### Snippet
```java
            String serialNum = testRunDevice.getDeviceInfo().getSerialNum();
            for (TestRunDevice temp : ((TestRunDeviceCombo) testRunDevice).getPairedDevices()) {
                serialNum += "," + temp.getDeviceInfo().getSerialNum();
            }
            return serialNum;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRun.java`
#### Snippet
```java
                    ((TestRunDeviceCombo) device).getDevices().stream().filter(d -> type.equals(d.getDeviceInfo().getType())).collect(Collectors.toList());
            for (TestRunDevice d : mappedDevice) {
                serialNumber += d.getDeviceInfo().getSerialNum() + ",";
            }
            return serialNumber.isEmpty() ? "" : serialNumber.substring(0, serialNumber.length() - 1);
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
Variable `updateMag` initializer `null` is redundant
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        log.info("Session {} is saved to map as registered agent, associated agent {}", session.getId(), message.getBody());

        AgentUpdateTask.UpdateMsg updateMag = null;
        String agentMessage = "Agent Reconnected After Updating.Version is " + agentUser.getVersionName();

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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/config/TestConfig.java`
#### Snippet
```java
            this.queueTimeOutSeconds = this.runTimeOutSeconds;
        }
        HashMap<String, Object> explorationArgs = (HashMap<String, Object>)map.get("exploration");
        if (explorationArgs != null) {
            Object maxStepCount = explorationArgs.get("maxStepCount");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/YamlParser.java`
#### Snippet
```java

        TestConfig testConfig = objectMapper.convertValue(target, TestConfig.class);
        testConfig.constructField((HashMap<String, Object>) target);
        testConfig.extractFromExistingField();
        if (testConfig.deviceConfig != null) {
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
                && newFileInfo.getLoadDir().equals(oldFileInfo.getLoadDir())
                && newFileInfo.getBlobContainer().equals(oldFileInfo.getBlobContainer())) {
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
            throw new RuntimeException("Get Blob SAS fail: " + e.getMessage(), e);
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
            throw new RuntimeException("check center alive fail: " + e.getMessage(), e);
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
            throw new RuntimeException("Add attachments fail: " + e.getMessage(), e);
        } finally {
            response.close();
        }
    }
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

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/ActionExecutor.java`
#### Snippet
```java
                methodArgs[i + 1] = parameterTypes[i + 1].cast(actionArgs.get(i));
            } catch (Exception e) {
                logger.info("Convert directly: failed. Try to convert by JSONObject", actionArgs.get(i));
                try {
                    methodArgs[i + 1] = JSONObject.parseObject(actionArgs.get(i), DeviceAction.class);
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `common/src/main/java/com/microsoft/hydralab/common/file/StorageServiceClientProxy.java`
#### Snippet
```java
    public void initAgentStorageClient(String storageType) {
        StorageProperties storageProperties;
        switch (storageType) {
            case Const.StorageType.AZURE:
                storageServiceClient = new AzureBlobClientAdapter();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/config/AppConfiguration.java`
#### Snippet
```java
        PrometheusProperties.Pushgateway properties = prometheusProperties.getPushgateway();
        Duration pushRate = properties.getPushRate();
        String job = properties.getJob();
        Map<String, String> groupingKey = properties.getGroupingKey();
        PrometheusPushGatewayManager.ShutdownOperation shutdownOperation = properties.getShutdownOperation();

        return new PrometheusPushGatewayManager(pushGateway, registry,
                pushRate, job, groupingKey, shutdownOperation);
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
        logger.info("Start record screen");
        testRunDeviceOrchestrator.startScreenRecorder(testRunDevice, testRun.getResultFolder(), maxTime <= 0 ? 30 * 60 : maxTime, logger);
        logger.info("Start gif frames collection");
        testRunDeviceOrchestrator.startGifEncoder(testRunDevice, testRun.getResultFolder(), pkgName + ".gif");
        logger.info("Start logcat collection");
        testRunDeviceOrchestrator.startLogCollector(testRunDevice, pkgName, testRun, logger);
        testRun.setLogcatPath(agentManagementService.getTestBaseRelPathInUrl(new File(testRunDevice.getLogPath())));
        recordingStartTimeMillis = System.currentTimeMillis();
        final String initializing = "Initializing";
        testRunDeviceOrchestrator.setRunningTestName(testRunDevice, initializing);
        testRun.addNewTimeTag(initializing, 0);
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
        String testName = description.getMethodName() == null ? "testInitialization" : description.getMethodName();
        String testClassName = description.getClassName();
        String testDisplayName = description.getDisplayName();
        int testIndex;

        if (!testClassName.equals(currentTestName)) {
            currentTestName = testClassName;
        }

        testIndex = ++currentTestIndex;

        logEnter("testStarted", testDisplayName);
        ongoingTestUnit = new AndroidTestUnit();
        ongoingTestUnit.setNumtests(testIndex);

        ongoingTestUnit.setStartTimeMillis(System.currentTimeMillis());
        ongoingTestUnit.setRelStartTimeInVideo(ongoingTestUnit.getStartTimeMillis() - recordingStartTimeMillis);

        final int unitIndex = testIndex;
        ongoingTestUnit.setCurrentIndexNum(unitIndex);

//        String method = test.getTestName();
        ongoingTestUnit.setTestName(testName);

        ongoingTestUnit.setTestedClass(testClassName);

        testRun.addNewTimeTag(unitIndex + ". " + ongoingTestUnit.getTitle(),
                System.currentTimeMillis() - recordingStartTimeMillis);
        testRunDeviceOrchestrator.setRunningTestName(testRunDevice, ongoingTestUnit.getTitle());

        ongoingTestUnit.setDeviceTestResultId(testRun.getId());
        ongoingTestUnit.setTestTaskId(testRun.getTestTaskId());

        testRun.addNewTestUnit(ongoingTestUnit);

        testRunDeviceOrchestrator.addGifFrameAsyncDelay(testRunDevice, agentManagementService.getScreenshotDir(), 5, logger);
        performanceTestListener.testStarted(ongoingTestUnit.getTitle());
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
        testRun.addNewTimeTag(unitIndex + ". " + ongoingTestUnit.getTitle(), System.currentTimeMillis() - recordingStartTimeMillis);
        testRunDeviceOrchestrator.setRunningTestName(testRunDevice, ongoingTestUnit.getTitle());

        ongoingTestUnit.setDeviceTestResultId(testRun.getId());
        ongoingTestUnit.setTestTaskId(testRun.getTestTaskId());

        testRun.addNewTestUnit(ongoingTestUnit);

        testRunDeviceOrchestrator.addGifFrameAsyncDelay(testRunDevice, agentManagementService.getScreenshotDir(), 5, logger);

        performanceTestListener.testStarted(ongoingTestUnit.getTitle());
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
        if (ongoingTestUnit.getStatusCode() == 0
                || ongoingTestUnit.getStatusCode() == AndroidTestUnit.StatusCodes.ASSUMPTION_FAILURE
                || ongoingTestUnit.getStatusCode() == AndroidTestUnit.StatusCodes.IGNORED
        ) {
            ongoingTestUnit.setStatusCode(AndroidTestUnit.StatusCodes.OK);
            ongoingTestUnit.setSuccess(true);
            performanceTestListener.testSuccess(ongoingTestUnit.getTitle());
        }
        ongoingTestUnit.setEndTimeMillis(System.currentTimeMillis());
        ongoingTestUnit.setRelEndTimeInVideo(ongoingTestUnit.getEndTimeMillis() - recordingStartTimeMillis);
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
            logEnter("testRunFailed", errorMessage);
            testRun.addNewTimeTag("testRunFailed", System.currentTimeMillis() - recordingStartTimeMillis);
            testRun.setTestErrorMessage(errorMessage);
            if (errorMessage != null && errorMessage.toLowerCase(Locale.US).contains("process crash")) {
                if (testRun.getCrashStack() == null) {
                    testRun.setCrashStack(errorMessage);
                }
            }
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
        performanceTestManagementService.testRunFinished();

        testRun.addNewTimeTag("testRunEnded", System.currentTimeMillis() - recordingStartTimeMillis);
        testRun.onTestEnded();
        testRunDeviceOrchestrator.setRunningTestName(testRunDevice, null);
        testRunDeviceOrchestrator.stopGitEncoder(testRunDevice, agentManagementService.getScreenshotDir(), logger);
        testRunDeviceOrchestrator.stopScreenRecorder(testRunDevice, testRun.getResultFolder(), logger);
        testRunDeviceOrchestrator.stopLogCollector(testRunDevice);
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
            testRun.addNewTimeTag("testRunEnded", System.currentTimeMillis() - recordingStartTimeMillis);
            testRun.onTestEnded();
            testRunDeviceOrchestrator.setRunningTestName(testRunDevice, null);
            testRunDeviceOrchestrator.stopGitEncoder(testRunDevice, agentManagementService.getScreenshotDir(), logger);
            testRunDeviceOrchestrator.stopScreenRecorder(testRunDevice, testRun.getResultFolder(), logger);
            testRunDeviceOrchestrator.stopLogCollector(testRunDevice);
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
        URL url = null;
        try {
            url = new URL("file:" + appiumJarFile);
        } catch (MalformedURLException e) {
            logger.error("runAppiumTest error", e);
        }
        URLClassLoader urlClassLoader =
                new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());
        Class<?> myClass;
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
        testRunEnded(testRunDevice, testRun);
        /** set paths */
        String absoluteReportPath = testRun.getResultFolder().getAbsolutePath();
        testRun.setTestXmlReportPath(agentManagementService.getTestBaseRelPathInUrl(new File(absoluteReportPath)));
        File gifFile = getGifFile();
        if (gifFile.exists() && gifFile.length() > 0) {
            testRun.setTestGifPath(agentManagementService.getTestBaseRelPathInUrl(gifFile));
        }
```

### DuplicatedCode
Duplicated code
in `agent/src/main/java/com/microsoft/hydralab/agent/service/TestDataService.java`
#### Snippet
```java
            List<AndroidTestUnit> testUnitList = testRun.getTestUnitList();
            list.addAll(testUnitList);

            // only save failed cases
            for (AndroidTestUnit androidTestUnit : testUnitList) {
                if (androidTestUnit.isSuccess()) {
                    continue;
                }
                LOGGER.warn("one more failed cases saved: {}", androidTestUnit.getTitle());
                keyValueRepository.saveAndroidTestUnit(androidTestUnit);
            }
```

### DuplicatedCode
Duplicated code
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        String localTeamName = teamName;
        if (StringUtils.isEmpty(teamName)) {
            localTeamName = requestor.getDefaultTeamName();
        }
        SysTeam team = sysTeamService.queryTeamByName(localTeamName);
        if (team == null) {
            return Result.error(HttpStatus.BAD_REQUEST.value(), "Team doesn't exist.");
        }
        if (!sysUserService.checkUserAdmin(requestor) && !userTeamManagementService.checkRequestorTeamRelation(requestor, team.getTeamId())) {
            return Result.error(HttpStatus.UNAUTHORIZED.value(), "User doesn't belong to this Team");
        }
```

### DuplicatedCode
Duplicated code
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
            if (requestor == null) {
                return Result.error(HttpStatus.UNAUTHORIZED.value(), "unauthorized");
            }

            List<CriteriaType> criteriaTypes = new ArrayList<>();
            // filter all TestFileSets in TEAMs that user is in
            if (!sysUserService.checkUserAdmin(requestor)) {
                criteriaTypes = userTeamManagementService.formTeamIdCriteria(requestor.getTeamAdminMap());
                if (criteriaTypes.size() == 0) {
                    return Result.error(HttpStatus.UNAUTHORIZED.value(), "User belongs to no TEAM, please contact administrator for binding TEAM");
                }
            }

            int page = data.getIntValue("page");
            int pageSize = data.getIntValue("pageSize");
            if (pageSize <= 0) {
                pageSize = 30;
            }
            JSONArray queryParams = data.getJSONArray("queryParams");
            if (queryParams != null) {
                for (int i = 0; i < queryParams.size(); i++) {
                    CriteriaType temp = queryParams.getJSONObject(i).toJavaObject(CriteriaType.class);
                    criteriaTypes.add(temp);
                }
            }
```

### DuplicatedCode
Duplicated code
in `center/src/main/java/com/microsoft/hydralab/center/controller/PackageSetController.java`
#### Snippet
```java
        TestFileSet testFileSet = testFileSetService.getFileSetInfo(fileSetId);
        if (testFileSet == null) {
            return Result.error(HttpStatus.BAD_REQUEST.value(), "Error fileSetId");
        }
        if (!sysUserService.checkUserAdmin(requestor) && !userTeamManagementService.checkRequestorTeamRelation(requestor, testFileSet.getTeamId())) {
            return Result.error(HttpStatus.UNAUTHORIZED.value(), "Unauthorized, the TestFileSet doesn't belong to user's Teams");
        }
```

### DuplicatedCode
Duplicated code
in `center/src/main/java/com/microsoft/hydralab/center/controller/RolePermissionController.java`
#### Snippet
```java
        SysRole requestorRole = sysRoleService.getRequestorRole(requestor);
        if (requestorRole == null) {
            return Result.error(HttpStatus.UNAUTHORIZED.value(), "unauthorized");
        }
        SysRole sysRole = sysRoleService.queryRoleById(roleId);
        if (sysRole == null) {
            return Result.error(HttpStatus.BAD_REQUEST.value(), "Role doesn't exist.");
        }
```

### DuplicatedCode
Duplicated code
in `center/src/main/java/com/microsoft/hydralab/center/controller/RolePermissionController.java`
#### Snippet
```java
        SysRole role = sysRoleService.queryRoleById(roleId);
        if (role == null) {
            return Result.error(HttpStatus.BAD_REQUEST.value(), "Role id is wrong.");
        }
        SysPermission permission = sysPermissionService.queryPermissionById(permissionId);
        if (permission == null) {
            return Result.error(HttpStatus.BAD_REQUEST.value(), "Permission id is wrong.");
        }
        RolePermissionRelation relation = rolePermissionManagementService.queryRelation(roleId, permissionId);
```

### DuplicatedCode
Duplicated code
in `center/src/main/java/com/microsoft/hydralab/center/controller/StorageController.java`
#### Snippet
```java
        if (!LogUtils.isLegalStr(fileUri, Const.RegexString.STORAGE_FILE_REL_PATH, false)) {
            throw new HydraLabRuntimeException(HttpStatus.BAD_REQUEST.value(), "Invalid file path, file name should not include ';'!");
        }

        File file = new File(Const.LocalStorageURL.CENTER_LOCAL_STORAGE_ROOT + fileUri);
        if (!file.exists()) {
            throw new HydraLabRuntimeException(HttpStatus.BAD_REQUEST.value(), String.format("File %s not exist!", fileUri));
        }

        response.reset();
        response.setContentType("application/octet-stream");
        response.setCharacterEncoding("utf-8");
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "attachment;filename=" + file.getName());

        int resLen;
        try {
            resLen = LocalStorageIOUtil.copyDownloadedStreamToResponse(file, response.getOutputStream());
        } catch (IOException e) {
            throw new HydraLabRuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
        }
        logger.info(String.format("Output file: %s , size: %d!", fileUri, resLen));
```

### DuplicatedCode
Duplicated code
in `center/src/main/java/com/microsoft/hydralab/center/controller/UserTeamController.java`
#### Snippet
```java
        if (requestor == null) {
            return Result.error(HttpStatus.UNAUTHORIZED.value(), "unauthorized");
        }
        if (sysUserService.checkUserRole(requestor, Const.DefaultRole.TEAM_ADMIN) && !userTeamManagementService.checkRequestorTeamRelation(requestor, teamId)) {
            return Result.error(HttpStatus.UNAUTHORIZED.value(), "Unauthorized for another team");
        }
        SysTeam sysTeam = sysTeamService.queryTeamById(teamId);
```

### DuplicatedCode
Duplicated code
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
            DeviceInfo device = deviceListMap.get(tempIdentifier);
            Assert.notNull(device, "error deviceIdentifier!");
            if (agentId == null) {
                agentId = device.getAgentId();
            }
            Assert.isTrue(agentId.equals(device.getAgentId()), "Device not in the same agent");
            Assert.isTrue(device.isAlive(), "Device offline");
            if (device.isTesting()) {
                return result;
            }
```

### DuplicatedCode
Duplicated code
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
        Message message = new Message();
        message.setBody(testTaskSpec);
        message.setPath(Const.Path.TEST_TASK_RUN);

        AgentSessionInfo agentSessionInfoByAgentId = getAgentSessionInfoByAgentId(agentId);
        Assert.notNull(agentSessionInfoByAgentId, "Device/Agent Offline!");
        if (isAgentUpdating(agentSessionInfoByAgentId.agentUser.getId())) {
            return result;
        }
        for (DeviceInfo device : devices) {
            updateDeviceStatus(device.getSerialNum(), DeviceInfo.TESTING, testTaskSpec.testTaskId);
        }
        testTaskSpec.agentIds.add(agentId);
        sendMessageToSession(agentSessionInfoByAgentId.session, message);
        result.put(Const.Param.TEST_DEVICE_SN, testTaskSpec.deviceIdentifier);

        return result;
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/local/client/LocalStorageClient.java`
#### Snippet
```java
        RestTemplate restTemplateHttps = RestTemplateConfig.getRestTemplateInstance();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + token);
        headers.add("Content-Type", MediaType.MULTIPART_FORM_DATA.toString());

        String fileUri = storageFileInfo.getBlobContainer() + "/" + storageFileInfo.getBlobPath();
        LinkedMultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
                    deviceInfoUpdate(device);
                    DeviceInfo deviceInfo = adbDeviceInfoMap.get(device.getSerialNumber());
                    if (deviceInfo == null) {
                        return;
                    }
                    if (device.getState().equals(DeviceState.ONLINE)) {
                        agentManagementService.getDeviceStatusListenerManager().onDeviceConnected(deviceInfo);
                    } else {
                        agentManagementService.getDeviceStatusListenerManager().onDeviceInactive(deviceInfo);
                    }
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/microsoft/hydralab/common/screen/IOSAppiumScreenRecorderForWindows.java`
#### Snippet
```java
        scriptFile = new File(testBaseDir, name);
        if (scriptFile.exists()) {
            scriptFile.delete();
        }
        try (InputStream resourceAsStream = FileUtils.class.getClassLoader().getResourceAsStream(name); OutputStream out = new FileOutputStream(scriptFile)) {
            IOUtils.copy(Objects.requireNonNull(resourceAsStream), out);
        } catch (IOException e) {
            e.printStackTrace();
        }
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/microsoft/hydralab/common/util/ADBOperateUtil.java`
#### Snippet
```java
        Process process = executeDeviceCommandOnPC(deviceInfo, comm, logger);
        CommandOutputReceiver err = new CommandOutputReceiver(process.getErrorStream(), logger);
        CommandOutputReceiver out = new CommandOutputReceiver(process.getInputStream(), logger);
        err.start();
        out.start();
        process.waitFor(60, TimeUnit.SECONDS);
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/microsoft/hydralab/common/util/ShellUtils.java`
#### Snippet
```java
            process = Runtime.getRuntime().exec(fullCommand);
            CommandOutputReceiver err = new CommandOutputReceiver(process.getErrorStream(), classLogger);
            CommandOutputReceiver out = new CommandOutputReceiver(process.getInputStream(), classLogger);
            err.start();
            out.start();
            if (needWait) {
                process.waitFor();
                process = null;
            }
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
        if (!SCRIPT_FILE.exists()) {
            try {
                InputStream resourceAsStream = FileUtils.class.getClassLoader().getResourceAsStream(SCRIPT_NAME);
                OutputStream out = new FileOutputStream(SCRIPT_FILE);
                IOUtils.copy(Objects.requireNonNull(resourceAsStream), out);
                out.close();
            } catch (IOException e) {
                classLogger.error("Failed to find app handler script", e);
            }
        }
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/WindowsBatteryInspector.java`
#### Snippet
```java
        PerformanceInspectionResult result = new PerformanceInspectionResult(rawResultFile, performanceInspection);

        try {
            if (process != null && process.waitFor() != 0)
            {
                classLogger.error("Exit code: " + process.exitValue());
            }
        } catch (InterruptedException e) {
            classLogger.error("InterruptedException caught on process.waitFor().");
            return null;
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/IOSEnergyGaugeResultParser.java`
#### Snippet
```java
            List<PerformanceInspectionResult> oldInspectionResults = performanceTestResult.performanceInspectionResults;
            PerformanceInspectionResult firstInspectionResult = oldInspectionResults.get(0);
            PerformanceInspection firstInspection = firstInspectionResult.inspection;
            String inspectionKey = firstInspection.inspectionKey;
            String appId = firstInspection.appId;
            String deviceIdentifier = firstInspection.deviceIdentifier;
            File resultFolder = firstInspection.resultFolder;
            File rawFile = IOSPerfTestHelper.getInstance().getResultFile(inspectionKey);
            IOSPerfTestHelper.getInstance().stop(inspectionKey);
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/IOSEnergyGaugeResultParser.java`
#### Snippet
```java
                        energyInfo.setDescription(description);

                        PerformanceInspection newInspection = PerformanceInspection.createIOSEnergyInspection(appId, deviceIdentifier, description, false);
                        newInspection.resultFolder = resultFolder;
                        PerformanceInspectionResult result = new PerformanceInspectionResult(rawFile, newInspection, timestampForThisLine);
                        result.parsedData = energyInfo;
                        newPerfInspectionResults.add(result);
```

### DuplicatedCode
Duplicated code
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/AndroidDriverController.java`
#### Snippet
```java
        Point location = webElement.getLocation();
        Dimension dimension = webElement.getSize();
        int x = location.getX();
        int y = location.getY();
        int width = dimension.getWidth();
        int height = dimension.getHeight();
        int centerX = x + width / 2;
        int centerY = y + height / 2;
```

### DuplicatedCode
Duplicated code
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/AndroidDriverController.java`
#### Snippet
```java
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
```

### DuplicatedCode
Duplicated code
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/AndroidDriverController.java`
#### Snippet
```java
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), fromX, fromY));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), fromX, fromY));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), toX, toY));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
```

### DuplicatedCode
Duplicated code
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/WindowsDriverController.java`
#### Snippet
```java
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), fromX, fromY));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), fromX, fromY));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), toX, toY));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
```

### DuplicatedCode
Duplicated code
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/finder/EdgeElementFinder.java`
#### Snippet
```java
        WebElement elementFound;
        if (!Strings.isNullOrEmpty(elementInfo.getXpath())) {
            elementFound = driverController.findElementByXPath(elementInfo.getXpath());
            if (elementFound != null) {
                return elementFound;
            }
        }
        if (!Strings.isNullOrEmpty(elementInfo.getName())) {
            elementFound = driverController.findElementById(elementInfo.getName());
            if (elementFound != null) {
                return elementFound;
            }
        }
        if (!Strings.isNullOrEmpty(elementInfo.getAutomationId())) {
            elementFound = driverController.findElementByAccessibilityId(elementInfo.getAutomationId());
            if (elementFound != null) {
                return elementFound;
            }
        }

        return null;
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

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRunDeviceCombo.java`
#### Snippet
```java
    public List<TestRunDevice> getDevices() {
        List<TestRunDevice> devices = new ArrayList<>();
        devices.addAll(pairedDevices);
        devices.add(this);
        return devices;
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
        pkgName = testTask.getPkgName();

        /** start Record **/
        startTools(testRunDevice, testRun, testTask.getTimeOutSecond(), logger);

```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
        startTools(testRunDevice, testRun, testTask.getTimeOutSecond(), logger);

        /** run the test */
        logger.info("Start Smart test");
        checkTestTaskCancel(testTask);
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
        performanceTestManagementService.testRunStarted();

        /** init smart_test arg */
        //TODO choose model before starting test task
        smartTestParam = new SmartTestParam(testTask.getAppFile().getAbsolutePath(), testRunDevice.getDeviceInfo(), "0", "0",
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/smart/SmartRunner.java`
#### Snippet
```java
        }
        testRunEnded(testRunDevice, testRun);
        /** set paths */
        String absoluteReportPath = testRun.getResultFolder().getAbsolutePath();
        testRun.setTestXmlReportPath(agentManagementService.getTestBaseRelPathInUrl(new File(absoluteReportPath)));
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
                            testRunDeviceOrchestrator, performanceTestManagementService, reportLogger);

            /** run the test */
            reportLogger.info("Start appium test with junit5");
            junit5Listener.startRecording(testTask.getTimeOutSecond());
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
            gifFile = junit5Listener.getGifFile();
        } else {
            /** xml report: parse listener */
            reportLogger.info("Start init listener");
            AppiumListener listener =
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
                            testRunDeviceOrchestrator, performanceTestManagementService, reportLogger);

            /** run the test */
            reportLogger.info("Start appium test with junit4");
            listener.startRecording(testTask.getTimeOutSecond());
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
            gifFile = listener.getGifFile();
        }
        /** set paths */
        String absoluteReportPath = deviceTestResultFolder.getAbsolutePath();
        testRun.setTestXmlReportPath(agentManagementService.getTestBaseRelPathInUrl(new File(absoluteReportPath)));
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/monkey/AdbMonkeyRunner.java`
#### Snippet
```java

    public void startTools(TestRun testRun, int maxTime, Logger logger) {
        /** start Record **/
        testRunDeviceOrchestrator.startScreenRecorder(testRunDevice, testRun.getResultFolder(), maxTime, logger);
        logger.info("Start record screen");
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/monkey/AdbMonkeyRunner.java`
#### Snippet
```java
        startTools(testRun, testTask.getTimeOutSecond(), logger);

        /** run the test */
        logger.info("Start " + TEST_RUN_NAME);
        testRun.setTestStartTimeMillis(System.currentTimeMillis());
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/monkey/AdbMonkeyRunner.java`
#### Snippet
```java
        testRunEnded(testRunDevice, testRun);

        /** set paths */
        String absoluteReportPath = testRun.getResultFolder().getAbsolutePath();
        testRun.setTestXmlReportPath(agentManagementService.getTestBaseRelPathInUrl(new File(absoluteReportPath)));
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java

        try {
            /** xml report: parse listener */
            reportLogger.info("Start xml report: parse listener");
            EspressoTestInfoProcessorListener listener =
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java
                    };

            /** run the test */
            reportLogger.info("Start instrumenting the test");
            checkTestTaskCancel(testTask);
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoRunner.java`
#### Snippet
```java
            checkTestTaskCancel(testTask);

            /** set paths */
            String absoluteReportPath = listener.getAbsoluteReportPath();
            testRun.setTestXmlReportPath(
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/main/java/com/microsoft/hydralab/agent/service/AgentWebSocketClientService.java`
#### Snippet
```java
                heartbeatResponse(message);

                /** Sequence shouldn't be changed.
                 * [agentUser.setTeamName -> meterRegistry.config().commonTags -> deviceDriver.init
                 *  -> (deviceControlService.provideDeviceList + deviceStatbilityMonitor.addDeviceMetricRegistration)].
```

### DanglingJavadoc
Dangling Javadoc comment
in `common/src/main/java/com/microsoft/hydralab/common/util/DateUtil.java`
#### Snippet
```java

    @NotNull
    /**
     * provide 2021-02-04 08:16:27
     * return 2021-02-04 08:17:30
```

### DanglingJavadoc
Dangling Javadoc comment
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/DeviceStabilityMonitor.java`
#### Snippet
```java

    private void cleanOutdatedDeviceStateChange(ConcurrentLinkedDeque<DeviceStateChangeRecord> recordWindow, LocalDateTime now, DeviceInfo deviceInfo) {
        /**
         * Clean outdated state change record in window lists
         * 1. Normal recording state change: keep window duration for data within {deviceStateChangeWindowTime} minutes;
```

### DanglingJavadoc
Dangling Javadoc comment
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/DeviceStabilityMonitor.java`
#### Snippet
```java


        /**
         * deviceBehaviour != null means not checking from an incoming behaviour (for now just UNSTABLE_RESET_TIMER)
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    /**
     * https://developer.android.com/studio/command-line/adb#pm
     * This method is leveraging the pm install command to do the operation.
```

### DanglingJavadoc
Dangling Javadoc comment
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java

    @Override
    /**
     * For more details about Android Permission: https://developer.android.com/guide/topics/permissions/overview#runtime
     * From source code perspective, this method will call into:
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
    public boolean verifyToken(String token) {
        JSONObject userInfo = decodeAccessToken(token);
        if (clientId != null && userInfo != null && clientId.equals(userInfo.getString("appid"))) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
            }
        }
        if (urlMapping.get(requestUrl) == null) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `center/src/main/java/com/microsoft/hydralab/center/service/AgentManageService.java`
#### Snippet
```java
    public boolean isAgentNameRegistered(String agentName) {
        Optional<AgentUser> agentUsers = agentUserRepository.findByName(agentName);
        if (agentUsers.isPresent()) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `center/src/main/java/com/microsoft/hydralab/center/service/SysTeamService.java`
#### Snippet
```java
    public boolean checkTeamExistence(String teamId) {
        SysTeam team = queryTeamById(teamId);
        if (team == null) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceGroupService.java`
#### Snippet
```java
    public boolean checkGroupName(String groupName) {
        int i = deviceGroupRepository.countByGroupName(groupName);
        if (i == 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `center/src/main/java/com/microsoft/hydralab/center/service/UserTeamManagementService.java`
#### Snippet
```java
        if (!CollectionUtils.isEmpty(teamAdminSet)) {
            allUsers.forEach(user -> {
                if (teamAdminSet.contains(user.getMailAddress())) {
                    user.setTeamAdmin(true);
                } else {
```

### TrivialIf
`if` statement can be simplified
in `center/src/main/java/com/microsoft/hydralab/center/service/UserTeamManagementService.java`
#### Snippet
```java
            return false;
        }
        if (users.size() == 1 && users.get(0).getMailAddress().equals(requestor.getMailAddress())) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/com/microsoft/hydralab/common/util/AttachmentService.java`
#### Snippet
```java
        if (newFileInfo.getLoadType() == null && oldFileInfo.getLoadType() == null) {
            return true;
        } else if (newFileInfo.getFileName().equals(oldFileInfo.getFileName())
                && newFileInfo.getLoadType().equals(oldFileInfo.getLoadType())
                && newFileInfo.getLoadDir().equals(oldFileInfo.getLoadDir())
```

### TrivialIf
`if` statement can be simplified
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/finder/IOSElementFinder.java`
#### Snippet
```java
        if (!Strings.isNullOrEmpty(elementInfo.getXpath())) {
            elementFound = driverController.findElementByXPath(elementInfo.getXpath());
            if (elementFound != null) {
                return elementFound;
            }
```

### TrivialIf
`if` statement can be simplified
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/finder/AndroidElementFinder.java`
#### Snippet
```java
        if (!Strings.isNullOrEmpty(elementInfo.getText())) {
            elementFound = driverController.findElementByText(elementInfo.getText());
            if (elementFound != null) {
                return elementFound;
            }
```

### TrivialIf
`if` statement can be simplified
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/finder/EdgeElementFinder.java`
#### Snippet
```java
        if (!Strings.isNullOrEmpty(elementInfo.getAutomationId())) {
            elementFound = driverController.findElementByAccessibilityId(elementInfo.getAutomationId());
            if (elementFound != null) {
                return elementFound;
            }
```

### TrivialIf
`if` statement can be simplified
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/finder/WindowsElementFinder.java`
#### Snippet
```java
        if (!Strings.isNullOrEmpty(elementInfo.getAutomationId())) {
            elementFound = driverController.findElementByAccessibilityId(elementInfo.getAutomationId());
            if (elementFound != null) {
                return elementFound;
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'URLClassLoader' used without 'try'-with-resources statement
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
        }
        URLClassLoader urlClassLoader =
                new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());
        Class<?> myClass;
        try {
```

### AutoCloseableResource
'URLClassLoader' used without 'try'-with-resources statement
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumRunner.java`
#### Snippet
```java
        }
        URLClassLoader urlClassLoader =
                new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());
        Class<?> myClass;
        try {
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param testRun` tag description is missing
in `sdk/src/main/java/com/microsoft/hydralab/agent/runner/TestRunThreadContext.java`
#### Snippet
```java
     * Should be called in the TestRunner setup lifecycle
     *
     * @param testRun
     */
    static void init(ITestRun testRun) {
```

### JavadocDeclaration
Wrong tag `date`
in `agent/src/main/java/com/microsoft/hydralab/agent/config/AppOptions.java`
#### Snippet
```java
 * @author : shbu
 * @version : 1.0
 * @date : 2019/01/18
 */
@Configuration
```

### JavadocDeclaration
`@param testRun` tag description is missing
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunLifecycle.java`
#### Snippet
```java
     * to alert on an anomaly and automatically recover from an exceptional state.
     *
     * @param testRun
     * @param testResult
     */
```

### JavadocDeclaration
`@param testResult` tag description is missing
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunLifecycle.java`
#### Snippet
```java
     *
     * @param testRun
     * @param testResult
     */
    void help(TestRun testRun, TestResult testResult);
```

### JavadocDeclaration
`@param testRun` tag description is missing
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunLifecycle.java`
#### Snippet
```java
     * A common and effective solution is to automate the parsing of log files.
     *
     * @param testRun
     * @param testResult
     * @return the test report, which contains the processed test result and the test run in a more readable format.
```

### JavadocDeclaration
`@param testResult` tag description is missing
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunLifecycle.java`
#### Snippet
```java
     *
     * @param testRun
     * @param testResult
     * @return the test report, which contains the processed test result and the test run in a more readable format.
     */
```

### JavadocDeclaration
`@param testRun` tag description is missing
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunLifecycle.java`
#### Snippet
```java
     * the criteria for determining whether a test has passed or not can be complex.
     *
     * @param testRun
     * @return the test result, there are serveral types of test result, such as:
     * pass,
```

### JavadocDeclaration
`@param testRun` tag description is missing
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunLifecycle.java`
#### Snippet
```java
     * to allow for a smooth next time execution.
     *
     * @param testRun
     */
    void teardown(TestRun testRun);
```

### JavadocDeclaration
`@throws` tag description is missing
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/TestRunLifecycle.java`
#### Snippet
```java
     *
     * @param testRun contains the test task and the device info
     * @throws Exception
     */
    void execute(TestRun testRun) throws Exception;
```

### JavadocDeclaration
Wrong tag `date`
in `agent/src/main/java/com/microsoft/hydralab/agent/config/DeviceDriverConfig.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 02/23/2023
 */
@Configuration
```

### JavadocDeclaration
Wrong tag `date`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/XmlBuilder.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 10/31/2022
 */
public class XmlBuilder {
```

### JavadocDeclaration
Wrong tag `date`
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/ActionExecutor.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 12/20/2022
 */

```

### JavadocDeclaration
Wrong tag `date`
in `agent/src/main/java/com/microsoft/hydralab/agent/command/DeviceScriptCommand.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 01/31/2023
 */
@Data
```

### JavadocDeclaration
Wrong tag `date`
in `agent/src/main/java/com/microsoft/hydralab/agent/command/DeviceScriptCommandLoader.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 01/31/2023
 */
@Service
```

### JavadocDeclaration
`@throws` tag description is missing
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/XmlTestRunListener.java`
#### Snippet
```java
     * @param reportDir the root directory of the report.
     * @return a file
     * @throws IOException
     */
    protected File getResultFile(File reportDir) throws IOException {
```

### JavadocDeclaration
Wrong tag `date`
in `center/src/main/java/com/microsoft/hydralab/center/util/LocalStorageIOUtil.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 3/14/2023
 */

```

### JavadocDeclaration
`@param token` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     * check the token is gengrate by this client
     *
     * @param token
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     *
     * @param token
     * @return
     */
    public boolean verifyToken(String token) {
```

### JavadocDeclaration
`@param accessToken` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     * get accessToken by authcode
     *
     * @param accessToken
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     *
     * @param accessToken
     * @return
     */
    public InputStream requestPhoto(String accessToken) throws Exception {
```

### JavadocDeclaration
`@param code` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     * get accessToken by authcode
     *
     * @param code
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     *
     * @param code
     * @return
     */
    public String verifyCode(String code) {
```

### JavadocDeclaration
`@return` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     * generate the oauth2 login url
     *
     * @return
     */
    public String getLoginUrl() {
```

### JavadocDeclaration
`@param requestUrl` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     * check the uri is need verify auth
     *
     * @param requestUrl
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     *
     * @param requestUrl
     * @return
     */
    public boolean isIgnore(String requestUrl) {
```

### JavadocDeclaration
`@param accessToken` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     * decode accesstoken
     *
     * @param accessToken
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/util/AuthUtil.java`
#### Snippet
```java
     *
     * @param accessToken
     * @return
     */
    public JSONObject decodeAccessToken(String accessToken) {
```

### JavadocDeclaration
Wrong tag `date`
in `center/src/main/java/com/microsoft/hydralab/center/service/StorageTokenManageService.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 2/21/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `center/src/main/java/com/microsoft/hydralab/center/controller/StorageController.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 2/20/2023
 */

```

### JavadocDeclaration
`@param message` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
     * check is not agent update success
     *
     * @param message
     * @param session
     * @param agentUser
```

### JavadocDeclaration
`@param session` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
     *
     * @param message
     * @param session
     * @param agentUser
     */
```

### JavadocDeclaration
`@param agentUser` tag description is missing
in `center/src/main/java/com/microsoft/hydralab/center/service/DeviceAgentManagementService.java`
#### Snippet
```java
     * @param message
     * @param session
     * @param agentUser
     */
    private void checkAgentUpdateStatus(Message message, Session session, AgentUser agentUser) {
```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/SASData.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 10/24/2022
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobProperty.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 11/15/2022
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/file/StorageServiceClientProxy.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 3/1/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/local/LocalStorageProperty.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 3/6/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/local/LocalStorageToken.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 3/6/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/local/client/LocalStorageClient.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 3/6/2023
 */

```

### JavadocDeclaration
Tag `return` is not allowed here
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/local/client/LocalStorageClient.java`
#### Snippet
```java
     * //     * @storageFileInfo
     *
     * @return
     */
    public void download(File file, StorageFileInfo storageFileInfo) {
```

### JavadocDeclaration
`@param loggerName` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java

    /**
     * @param loggerName
     * @param filePath
     * @param logPattern http://logback.qos.ch/manual/layouts.html
```

### JavadocDeclaration
`@param filePath` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
    /**
     * @param loggerName
     * @param filePath
     * @param logPattern http://logback.qos.ch/manual/layouts.html
     * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
     * @param filePath
     * @param logPattern http://logback.qos.ch/manual/layouts.html
     * @return
     */
    public static Logger getLoggerWithRollingFileAppender(String loggerName, String filePath, String logPattern) {
```

### JavadocDeclaration
`@param downloadToFile` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
     * Download a file from the blob container. If the file already exists, overwrite it.
     *
     * @param downloadToFile
     * @param containerName
     * @param blobFilePath
```

### JavadocDeclaration
`@param containerName` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
     *
     * @param downloadToFile
     * @param containerName
     * @param blobFilePath
     * @return
```

### JavadocDeclaration
`@param blobFilePath` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
     * @param downloadToFile
     * @param containerName
     * @param blobFilePath
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
     * @param containerName
     * @param blobFilePath
     * @return
     */
    public BlobProperties downloadFileFromBlob(File downloadToFile, String containerName, String blobFilePath) {
```

### JavadocDeclaration
`@param uploadFile` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
     * Upload a file to the blob container. If the file already exists, overwrite it.
     *
     * @param uploadFile
     * @param containerName
     * @param blobFilePath
```

### JavadocDeclaration
`@param containerName` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
     *
     * @param uploadFile
     * @param containerName
     * @param blobFilePath
     * @param logger
```

### JavadocDeclaration
`@param blobFilePath` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
     * @param uploadFile
     * @param containerName
     * @param blobFilePath
     * @param logger
     * @return
```

### JavadocDeclaration
`@param logger` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
     * @param containerName
     * @param blobFilePath
     * @param logger
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/file/impl/azure/AzureBlobClientAdapter.java`
#### Snippet
```java
     * @param blobFilePath
     * @param logger
     * @return
     */
    public String uploadFileToBlob(File uploadFile, String containerName, String blobFilePath, Logger logger) {
```

### JavadocDeclaration
`@param timeString` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/util/DateUtil.java`
#### Snippet
```java
     * "2021-01-01T17:31:39Z"
     *
     * @param timeString
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/util/DateUtil.java`
#### Snippet
```java
     *
     * @param timeString
     * @return
     */
    public static Date iSO8601TimeStringToDate(String timeString) {
```

### JavadocDeclaration
`@param keyword` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/entity/agent/EnvCapabilityRequirement.java`
#### Snippet
```java

    /**
     * @param keyword
     * @param majorVersion major version of the capability, -1 means any version
     * @param minorVersion minor version of the capability, -1 means any version
```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/AgentMetadata.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 11/15/2022
 */
@Data
```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRunDeviceCombo.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 03/10/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/PerformanceTestResultEntity.java`
#### Snippet
```java
/**
 * @author taoran
 * @date 3/14/2023
 */
@Data
```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/DeviceStatusListenerManager.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 01/17/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/management/AgentManagementService.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 02/22/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/PreInstallListener.java`
#### Snippet
```java
/**
 * @author zhoule
 * @date 01/17/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/common/repository/PerformanceTestResultRepository.java`
#### Snippet
```java
/**
 * @author taoran
 * @date 3/14/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/performance/parsers/EventTimeResultParser.java`
#### Snippet
```java
/**
 * @author taoran
 * @date 4/17/2023
 */

```

### JavadocDeclaration
`@param deviceInfo` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
     * Grant all the permissions needed for a test task
     *
     * @param deviceInfo
     * @param task
     * @param logger     may be null
```

### JavadocDeclaration
`@param task` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
     *
     * @param deviceInfo
     * @param task
     * @param logger     may be null
     * @return return true if succeeded.
```

### JavadocDeclaration
`@param deviceInfo` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
     * Grant all the permissions needed for an APK
     *
     * @param deviceInfo
     * @param packageFile
     * @param targetPackage
```

### JavadocDeclaration
`@param packageFile` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
     *
     * @param deviceInfo
     * @param packageFile
     * @param targetPackage
     * @param allowCustomizedPermissions We currently assume if a permission name contains "android.", it's a system (app) defined Android permission.
```

### JavadocDeclaration
`@param targetPackage` tag description is missing
in `common/src/main/java/com/microsoft/hydralab/common/management/device/impl/AndroidDeviceDriver.java`
#### Snippet
```java
     * @param deviceInfo
     * @param packageFile
     * @param targetPackage
     * @param allowCustomizedPermissions We currently assume if a permission name contains "android.", it's a system (app) defined Android permission.
     * @param logger                     may be null
```

### JavadocDeclaration
Wrong tag `date`
in `common/src/main/java/com/microsoft/hydralab/performance/inspectors/EventTimeInspector.java`
#### Snippet
```java
/**
 * @author taoran
 * @date 4/17/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/config/DeviceConfig.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 2/8/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/config/TestConfig.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 2/8/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/YamlParser.java`
#### Snippet
```java
/**
 * @author Li Shen
 * @date 2/9/2023
 */

```

### JavadocDeclaration
Wrong tag `date`
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/RobotUtils.java`
#### Snippet
```java
/**
 * @author taoran
 * @date 3/28/2023
 */

```

### JavadocDeclaration
`@param id` tag description is missing
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/BaseDriverController.java`
#### Snippet
```java
     * In android, id refers to {@link AndroidElementInfo#getResourceId()}
     *
     * @param id
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/BaseDriverController.java`
#### Snippet
```java
     *
     * @param id
     * @return
     */
    @Nullable
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `actionTypes` may be 'final'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/ActionExecutor.java`
#### Snippet
```java
     * the implementation of supported actions should not be overload
     */
    private Set<String> actionTypes =
            Set.of("setProperty", "setDefaultLauncher", "backToHome", "changeGlobalSetting",
                    "changeSystemSetting", "execCommandOnDevice", "execCommandOnAgent", "pushFileToDevice",
```

### FieldMayBeFinal
Field `testRunDeviceOrchestrator` may be 'final'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/AppiumListener.java`
#### Snippet
```java
    private String currentTestName = "";
    private int currentTestIndex = 0;
    private TestRunDeviceOrchestrator testRunDeviceOrchestrator;

    public AppiumListener(AgentManagementService agentManagementService, TestRunDevice testRunDevice, TestRun testRun,
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestCommandReceiver.java`
#### Snippet
```java
public class XCTestCommandReceiver extends Thread {
    private InputStream inputStream;
    private Logger logger;
    private final ArrayList<String> result = new ArrayList<>();

```

### FieldMayBeFinal
Field `inputStream` may be 'final'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/xctest/XCTestCommandReceiver.java`
#### Snippet
```java

public class XCTestCommandReceiver extends Thread {
    private InputStream inputStream;
    private Logger logger;
    private final ArrayList<String> result = new ArrayList<>();
```

### FieldMayBeFinal
Field `testRunDeviceOrchestrator` may be 'final'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/appium/Junit5Listener.java`
#### Snippet
```java
    private String currentTestName = "";
    private int currentTestIndex = 0;
    private TestRunDeviceOrchestrator testRunDeviceOrchestrator;

    public Junit5Listener(AgentManagementService agentManagementService, TestRunDevice testRunDevice, TestRun testRun,
```

### FieldMayBeFinal
Field `testRunDeviceOrchestrator` may be 'final'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/EspressoTestInfoProcessorListener.java`
#### Snippet
```java
    private final AgentManagementService agentManagementService;
    private final PerformanceTestListener performanceTestListener;
    private TestRunDeviceOrchestrator testRunDeviceOrchestrator;
    ADBOperateUtil adbOperateUtil;
    private long recordingStartTimeMillis;
```

### FieldMayBeFinal
Field `mSystemError` may be 'final'
in `agent/src/main/java/com/microsoft/hydralab/agent/runner/espresso/XmlTestRunListener.java`
#### Snippet
```java
    private TestRunResult mRunResult = new TestRunResult();

    private StringBuilder mSystemError = new StringBuilder();

    /**
```

### FieldMayBeFinal
Field `testFileSetMap` may be 'final'
in `center/src/main/java/com/microsoft/hydralab/center/service/TestFileSetService.java`
#### Snippet
```java
    StorageServiceClientProxy storageServiceClientProxy;

    private Map<String, TestFileSet> testFileSetMap = new HashMap<>();

    public TestFileSet addTestFileSet(TestFileSet testFileSet) {
```

### FieldMayBeFinal
Field `isRunning` may be 'final'
in `center/src/main/java/com/microsoft/hydralab/center/service/TestTaskService.java`
#### Snippet
```java
@Component
public class TestTaskService {
    private static volatile AtomicBoolean isRunning = new AtomicBoolean(false);
    private final Logger logger = LoggerFactory.getLogger(TestTaskService.class);
    private final Queue<TestTaskSpec> taskQueue = new LinkedList<>();
```

### FieldMayBeFinal
Field `applicationContext` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/file/StorageServiceClientProxy.java`
#### Snippet
```java
    private String storageType;
    private StorageServiceClient storageServiceClient;
    private ApplicationContext applicationContext;

    public StorageServiceClientProxy(ApplicationContext applicationContext) {
```

### FieldMayBeFinal
Field `regEx` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/util/LogUtils.java`
#### Snippet
```java
        ACCESS_KEY("(access[_\\s-]*key)[=:\"\\s]*(\\w*)");

        private String regEx;

        MaskSensitiveData(String exp) {
```

### FieldMayBeFinal
Field `inputStream` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/util/CommandOutputReceiver.java`
#### Snippet
```java

public class CommandOutputReceiver extends Thread {
    private InputStream inputStream;
    private Logger logger;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/util/CommandOutputReceiver.java`
#### Snippet
```java
public class CommandOutputReceiver extends Thread {
    private InputStream inputStream;
    private Logger logger;

    public CommandOutputReceiver(InputStream inputStream, Logger logger) {
```

### FieldMayBeFinal
Field `process` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSPerfTestHelper.java`
#### Snippet
```java
    private static class IOSPerfScriptProcessWrapper {
        private File resultFile;
        private Process process;

        private long startTimestamp;
```

### FieldMayBeFinal
Field `resultFile` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSPerfTestHelper.java`
#### Snippet
```java

    private static class IOSPerfScriptProcessWrapper {
        private File resultFile;
        private Process process;

```

### FieldMayBeFinal
Field `iOSPerfScriptProcesses` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSPerfTestHelper.java`
#### Snippet
```java
    private static final String lowestVersion = "0.10.2";
    private static final String installCommand = "pip3 install -U tidevice[openssl]";
    private Map<String, IOSPerfScriptProcessWrapper> iOSPerfScriptProcesses;

    private IOSPerfTestHelper() {
```

### FieldMayBeFinal
Field `startTimestamp` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/util/IOSPerfTestHelper.java`
#### Snippet
```java
        private Process process;

        private long startTimestamp;

        IOSPerfScriptProcessWrapper(File resultFile, Process process) {
```

### FieldMayBeFinal
Field `pairedDevices` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/entity/common/TestRunDeviceCombo.java`
#### Snippet
```java
    Map<String, Integer> deviceCountMap = new HashMap<>();

    private List<TestRunDevice> pairedDevices = new ArrayList<>();

    public TestRunDeviceCombo(@NotNull DeviceInfo mainDeviceInfo, @NotNull List<DeviceInfo> deviceInfos) {
```

### FieldMayBeFinal
Field `windowsDriver` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/screen/WindowsScreenRecorder.java`
#### Snippet
```java
    private final File baseFolder;
    private final Logger logger;
    private WindowsDriver windowsDriver;

    public WindowsScreenRecorder(DeviceDriver deviceDriver, DeviceInfo deviceInfo, File baseFolder, Logger logger) {
```

### FieldMayBeFinal
Field `listeners` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/DeviceStatusListenerManager.java`
#### Snippet
```java
@Service
public class DeviceStatusListenerManager implements DeviceStatusListener {
    private List<DeviceStatusListener> listeners = new ArrayList<>();

    private <T extends DeviceStatusListener> void notifyEach(List<T> recorders, Consumer<T> consumer) {
```

### FieldMayBeFinal
Field `functionAvailabilities` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/management/AgentManagementService.java`
#### Snippet
```java
    protected String preInstallFailurePolicy;
    protected EnvInfo envInfo;
    private List<AgentFunctionAvailability> functionAvailabilities = new ArrayList<>();

    public List<AgentFunctionAvailability> getFunctionAvailabilities() {
```

### FieldMayBeFinal
Field `classLogger` may be 'final'
in `common/src/main/java/com/microsoft/hydralab/common/management/listener/impl/PreInstallListener.java`
#### Snippet
```java
    AgentManagementService agentManagementService;
    DeviceDriverManager deviceDriverManager;
    private Logger classLogger = LoggerFactory.getLogger(PreInstallListener.class);

    public PreInstallListener(AgentManagementService agentManagementService, DeviceDriverManager deviceDriverManager) {
```

### FieldMayBeFinal
Field `regEx` may be 'final'
in `gradle_plugin/src/main/groovy/com/microsoft/hydralab/utils/HydraLabClientUtils.java`
#### Snippet
```java
        ACCESS_KEY("(access[_\\s-]*key)[=:\"\\s]*(\\w*)");

        private String regEx;

        MaskSensitiveData(String exp) {
```

### FieldMayBeFinal
Field `resourceId` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private int centerY;
    @JSONField(name = "resource-id")
    private String resourceId;

    @SuppressWarnings("ParameterNumber")
```

### FieldMayBeFinal
Field `focused` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String enabled;
    private String focusable;
    private String focused;
    @JSONField(name = "long-clickable")
    private String longClickable;
```

### FieldMayBeFinal
Field `displayed` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String selected;
    private String bounds;
    private String displayed;
    private String xpath;

```

### FieldMayBeFinal
Field `enabled` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String checked;
    private String clickable;
    private String enabled;
    private String focusable;
    private String focused;
```

### FieldMayBeFinal
Field `password` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    @JSONField(name = "long-clickable")
    private String longClickable;
    private String password;
    private String scrollable;
    private String selected;
```

### FieldMayBeFinal
Field `bounds` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String scrollable;
    private String selected;
    private String bounds;
    private String displayed;
    private String xpath;
```

### FieldMayBeFinal
Field `scrollable` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String longClickable;
    private String password;
    private String scrollable;
    private String selected;
    private String bounds;
```

### FieldMayBeFinal
Field `index` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java

public class AndroidElementInfo extends BaseElementInfo {
    private String index;
    @JSONField(name = "package")
    private String packageName;
```

### FieldMayBeFinal
Field `xpath` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String bounds;
    private String displayed;
    private String xpath;

    @JSONField(serialize = false, deserialize = false)
```

### FieldMayBeFinal
Field `checked` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String contentDesc;
    private String checkable;
    private String checked;
    private String clickable;
    private String enabled;
```

### FieldMayBeFinal
Field `checkable` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    @JSONField(name = "content_desc")
    private String contentDesc;
    private String checkable;
    private String checked;
    private String clickable;
```

### FieldMayBeFinal
Field `focusable` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String clickable;
    private String enabled;
    private String focusable;
    private String focused;
    @JSONField(name = "long-clickable")
```

### FieldMayBeFinal
Field `clickable` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String checkable;
    private String checked;
    private String clickable;
    private String enabled;
    private String focusable;
```

### FieldMayBeFinal
Field `longClickable` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String focused;
    @JSONField(name = "long-clickable")
    private String longClickable;
    private String password;
    private String scrollable;
```

### FieldMayBeFinal
Field `className` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String packageName;
    @JSONField(name = "class")
    private String className;
    private String text;
    @JSONField(name = "content_desc")
```

### FieldMayBeFinal
Field `text` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    @JSONField(name = "class")
    private String className;
    private String text;
    @JSONField(name = "content_desc")
    private String contentDesc;
```

### FieldMayBeFinal
Field `contentDesc` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String text;
    @JSONField(name = "content_desc")
    private String contentDesc;
    private String checkable;
    private String checked;
```

### FieldMayBeFinal
Field `packageName` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String index;
    @JSONField(name = "package")
    private String packageName;
    @JSONField(name = "class")
    private String className;
```

### FieldMayBeFinal
Field `selected` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/AndroidElementInfo.java`
#### Snippet
```java
    private String password;
    private String scrollable;
    private String selected;
    private String bounds;
    private String displayed;
```

### FieldMayBeFinal
Field `IsPassword` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String IsOffscreen;
    @SuppressWarnings("MemberName")
    private String IsPassword;
    @SuppressWarnings("MemberName")
    private String IsRequiredForForm;
```

### FieldMayBeFinal
Field `ItemStatus` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String IsRequiredForForm;
    @SuppressWarnings("MemberName")
    private String ItemStatus;
    @SuppressWarnings("MemberName")
    private String ItemType;
```

### FieldMayBeFinal
Field `width` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String x;
    private String y;
    private String width;
    private String height;
    private String xpath;
```

### FieldMayBeFinal
Field `RuntimeId` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String ProcessId;
    @SuppressWarnings("MemberName")
    private String RuntimeId;
    private String x;
    private String y;
```

### FieldMayBeFinal
Field `AutomationId` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String AccessKey;
    @SuppressWarnings("MemberName")
    private String AutomationId;
    @SuppressWarnings("MemberName")
    private String ClassName;
```

### FieldMayBeFinal
Field `centerX` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String height;
    private String xpath;
    private Integer centerX;
    private Integer centerY;

```

### FieldMayBeFinal
Field `xpath` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String width;
    private String height;
    private String xpath;
    private Integer centerX;
    private Integer centerY;
```

### FieldMayBeFinal
Field `FrameworkId` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String ClassName;
    @SuppressWarnings("MemberName")
    private String FrameworkId;
    @SuppressWarnings("MemberName")
    private String HasKeyboardFocus;
```

### FieldMayBeFinal
Field `IsOffscreen` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String IsKeyboardFocusable;
    @SuppressWarnings("MemberName")
    private String IsOffscreen;
    @SuppressWarnings("MemberName")
    private String IsPassword;
```

### FieldMayBeFinal
Field `IsRequiredForForm` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String IsPassword;
    @SuppressWarnings("MemberName")
    private String IsRequiredForForm;
    @SuppressWarnings("MemberName")
    private String ItemStatus;
```

### FieldMayBeFinal
Field `x` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    @SuppressWarnings("MemberName")
    private String RuntimeId;
    private String x;
    private String y;
    private String width;
```

### FieldMayBeFinal
Field `centerY` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String xpath;
    private Integer centerX;
    private Integer centerY;

    @SuppressWarnings("ParameterNumber")
```

### FieldMayBeFinal
Field `LocalizedControlType` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String ItemType;
    @SuppressWarnings("MemberName")
    private String LocalizedControlType;
    @SuppressWarnings("MemberName")
    private String Name;
```

### FieldMayBeFinal
Field `IsEnabled` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String IsControlElement;
    @SuppressWarnings("MemberName")
    private String IsEnabled;
    @SuppressWarnings("MemberName")
    private String IsKeyboardFocusable;
```

### FieldMayBeFinal
Field `y` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String RuntimeId;
    private String x;
    private String y;
    private String width;
    private String height;
```

### FieldMayBeFinal
Field `IsKeyboardFocusable` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String IsEnabled;
    @SuppressWarnings("MemberName")
    private String IsKeyboardFocusable;
    @SuppressWarnings("MemberName")
    private String IsOffscreen;
```

### FieldMayBeFinal
Field `IsContentElement` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String HelpText;
    @SuppressWarnings("MemberName")
    private String IsContentElement;
    @SuppressWarnings("MemberName")
    private String IsControlElement;
```

### FieldMayBeFinal
Field `ItemType` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String ItemStatus;
    @SuppressWarnings("MemberName")
    private String ItemType;
    @SuppressWarnings("MemberName")
    private String LocalizedControlType;
```

### FieldMayBeFinal
Field `Orientation` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String Name;
    @SuppressWarnings("MemberName")
    private String Orientation;
    @SuppressWarnings("MemberName")
    private String ProcessId;
```

### FieldMayBeFinal
Field `AccessKey` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String AcceleratorKey;
    @SuppressWarnings("MemberName")
    private String AccessKey;
    @SuppressWarnings("MemberName")
    private String AutomationId;
```

### FieldMayBeFinal
Field `IsControlElement` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String IsContentElement;
    @SuppressWarnings("MemberName")
    private String IsControlElement;
    @SuppressWarnings("MemberName")
    private String IsEnabled;
```

### FieldMayBeFinal
Field `ProcessId` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String Orientation;
    @SuppressWarnings("MemberName")
    private String ProcessId;
    @SuppressWarnings("MemberName")
    private String RuntimeId;
```

### FieldMayBeFinal
Field `HasKeyboardFocus` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String FrameworkId;
    @SuppressWarnings("MemberName")
    private String HasKeyboardFocus;
    @SuppressWarnings("MemberName")
    private String HelpText;
```

### FieldMayBeFinal
Field `Name` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String LocalizedControlType;
    @SuppressWarnings("MemberName")
    private String Name;
    @SuppressWarnings("MemberName")
    private String Orientation;
```

### FieldMayBeFinal
Field `AcceleratorKey` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
public class WindowsElementInfo extends BaseElementInfo {
    @SuppressWarnings("MemberName")
    private String AcceleratorKey;
    @SuppressWarnings("MemberName")
    private String AccessKey;
```

### FieldMayBeFinal
Field `ClassName` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String AutomationId;
    @SuppressWarnings("MemberName")
    private String ClassName;
    @SuppressWarnings("MemberName")
    private String FrameworkId;
```

### FieldMayBeFinal
Field `height` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String y;
    private String width;
    private String height;
    private String xpath;
    private Integer centerX;
```

### FieldMayBeFinal
Field `HelpText` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/elements/WindowsElementInfo.java`
#### Snippet
```java
    private String HasKeyboardFocus;
    @SuppressWarnings("MemberName")
    private String HelpText;
    @SuppressWarnings("MemberName")
    private String IsContentElement;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/IOSDriverController.java`
#### Snippet
```java
    private final IOSDriver iosDriver;
    private String clipboardString;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public IOSDriverController(IOSDriver iosDriver, String udid, Logger logger) {
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

## RuleId[id=SpringJavaAutowiredFieldsWarningInspection]
### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `agent/src/main/java/com/microsoft/hydralab/agent/service/AgentWebSocketClientService.java`
#### Snippet
```java
    @Value("${management.metrics.export.prometheus.pushgateway.enabled}")
    private boolean isPrometheusEnabled;
    @Autowired(required = false)
    private MetricPushGateway pushGateway;
    @Resource
```

## RuleId[id=SpringDataMethodInconsistencyInspection]
### SpringDataMethodInconsistencyInspection
Cannot resolve property 'isTeamAdmin'
in `center/src/main/java/com/microsoft/hydralab/center/repository/UserTeamRelationRepository.java`
#### Snippet
```java
    Optional<UserTeamRelation> findByMailAddressAndTeamId(String mailAddress, String teamId);

    List<UserTeamRelation> findAllByMailAddressAndIsTeamAdmin(String mailAddress, boolean isTeamAdmin);

    List<UserTeamRelation> findAllByMailAddress(String mailAddress);
```

### SpringDataMethodInconsistencyInspection
Cannot resolve property 'isLatest'
in `common/src/main/java/com/microsoft/hydralab/common/repository/TestJsonInfoRepository.java`
#### Snippet
```java
public interface TestJsonInfoRepository extends JpaRepository<TestJsonInfo, String>, JpaSpecificationExecutor<TestJsonInfo> {
    List<TestJsonInfo> findAllByTeamId(String teamId);
    List<TestJsonInfo> findByIsLatest(boolean isLatest);

    List<TestJsonInfo> findByIsLatestAndPackageNameAndCaseName(boolean isLatest, String packageName, String caseName);
```

### SpringDataMethodInconsistencyInspection
Cannot resolve property 'isLatest'
in `common/src/main/java/com/microsoft/hydralab/common/repository/TestJsonInfoRepository.java`
#### Snippet
```java
    List<TestJsonInfo> findByIsLatest(boolean isLatest);

    List<TestJsonInfo> findByIsLatestAndPackageNameAndCaseName(boolean isLatest, String packageName, String caseName);

    List<TestJsonInfo> findByPackageNameAndCaseName(String packageName, String caseName);
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/EdgeDriverController.java`
#### Snippet
```java
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        windowsDriver.perform(Arrays.asList(tap));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/AndroidDriverController.java`
#### Snippet
```java
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        androidDriver.perform(Arrays.asList(tap));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/AndroidDriverController.java`
#### Snippet
```java
                PointerInput.Origin.viewport(), centerX + xVector, centerY + yVector));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        androidDriver.perform(Arrays.asList(dragNDrop));

        logger.info("centerX" + centerX + "centerY" + centerY);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `taps_to_cases/runner/src/main/java/com/microsoft/hydralab/t2c/runner/controller/AndroidDriverController.java`
#### Snippet
```java
                PointerInput.Origin.viewport(), toX, toY));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        androidDriver.perform(Arrays.asList(dragNDrop));
    }

```

