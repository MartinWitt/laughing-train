# teamcity-deployer-plugin 
 
# Bad smells
I found 124 bad smells with 23 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StaticCallOnSubclass | 26 | false |
| SizeReplaceableByIsEmpty | 8 | true |
| UtilityClassWithoutPrivateConstructor | 7 | true |
| BoundedWildcard | 6 | false |
| MissortedModifiers | 6 | false |
| DynamicRegexReplaceableByCompiledPattern | 6 | false |
| UNUSED_IMPORT | 6 | false |
| CharsetObjectCanBeUsed | 5 | false |
| UnnecessaryFullyQualifiedName | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| DeprecatedIsStillUsed | 3 | false |
| RegExpRedundantEscape | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| RedundantFieldInitialization | 3 | false |
| ObsoleteCollection | 2 | false |
| RedundantSuppression | 2 | false |
| DuplicateCondition | 2 | false |
| UnnecessaryBoxing | 2 | false |
| NestedAssignment | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| BusyWait | 2 | false |
| IOResource | 1 | false |
| UnnecessaryModifier | 1 | true |
| DataFlowIssue | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| CatchMayIgnoreException | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| StringEqualsEmptyString | 1 | false |
| Convert2Lambda | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=IOResource]
### IOResource
'SMBClient' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
              .withSigningRequired(true).build();

      SMBClient client = new SMBClient(config);

      Connection connection = client.connect(host);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/DataChannelProtection.java`
#### Snippet
```java
  private final char code;

  private DataChannelProtection(char code) {
    this.code = code;
  }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SMBRunnerConstants` has only 'static' members, and lacks a 'private' constructor
in `deploy-runner-common/src/main/java/jetbrains/buildServer/deployer/common/SMBRunnerConstants.java`
#### Snippet
```java
 * date: 16.10.2014.
 */
public class SMBRunnerConstants {
  public static final String DNS_ONLY_NAME_RESOLUTION = "jetbrains.buildServer.deployer.smb.dns_only";
  public static final String SHOULD_ENFORCE_SMB1 = "teamcity.deployer.smb.enforceSMBv1";
```

### UtilityClassWithoutPrivateConstructor
Class `CargoRunnerConstants` has only 'static' members, and lacks a 'private' constructor
in `deploy-runner-common/src/main/java/jetbrains/buildServer/deployer/common/CargoRunnerConstants.java`
#### Snippet
```java
 * date: 27.05.2016.
 */
public class CargoRunnerConstants {
  public static final String USE_HTTPS = "jetbrains.buildServer.deployer.cargo.https";
}
```

### UtilityClassWithoutPrivateConstructor
Class `ScpExecUtil` has only 'static' members, and lacks a 'private' constructor
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpExecUtil.java`
#### Snippet
```java
import java.io.InputStream;

public class ScpExecUtil {

  public static int checkScpAck(InputStream in) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `DeployerRunnerConstants` has only 'static' members, and lacks a 'private' constructor
in `deploy-runner-common/src/main/java/jetbrains/buildServer/deployer/common/DeployerRunnerConstants.java`
#### Snippet
```java
 * Date: 24.03.12 - 17:09
 */
public class DeployerRunnerConstants {
  public static final String SSH_RUN_TYPE = "ssh-deploy-runner";
  public static final String SMB_RUN_TYPE = "smb-deploy-runner";
```

### UtilityClassWithoutPrivateConstructor
Class `FTPRunnerConstants` has only 'static' members, and lacks a 'private' constructor
in `deploy-runner-common/src/main/java/jetbrains/buildServer/deployer/common/FTPRunnerConstants.java`
#### Snippet
```java
 * date 27.07.13.
 */
public class FTPRunnerConstants {
  public static final String PARAM_AUTH_METHOD = "jetbrains.buildServer.deployer.ftp.authMethod";
  public static final String PARAM_TRANSFER_MODE = "jetbrains.buildServer.deployer.ftp.transferMethod";
```

### UtilityClassWithoutPrivateConstructor
Class `DeployerAgentUtils` has only 'static' members, and lacks a 'private' constructor
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/DeployerAgentUtils.java`
#### Snippet
```java
import jetbrains.buildServer.deployer.common.DeployerRunnerConstants;

public class DeployerAgentUtils {
  public static void logBuildProblem(BuildProgressLogger logger, String message) {
    logger.logBuildProblem(BuildProblemData
```

### UtilityClassWithoutPrivateConstructor
Class `ScpOperationBuilder` has only 'static' members, and lacks a 'private' constructor
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpOperationBuilder.java`
#### Snippet
```java
import java.io.IOException;

public class ScpOperationBuilder {

  /**
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `notNullize()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHExecRunner.java`
#### Snippet
```java
    final SSHSessionProvider provider = new SSHSessionProvider(context, myInternalProperties, mySshKeyManager);
    final Map<String, String> parameters = context.getRunnerParameters();
    final String command = StringUtil.notNullize(parameters.get(SSHRunnerConstants.PARAM_COMMAND));
    final String pty = parameters.get(SSHRunnerConstants.PARAM_PTY);
    boolean enableSshAgentForwarding =
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/cargo/CargoPropertiesProcessor.java`
#### Snippet
```java
    Collection<InvalidProperty> result = super.process(properties);

    if (StringUtil.isEmptyOrSpaces(properties.get(DeployerRunnerConstants.PARAM_USERNAME))) {
      result.add(new InvalidProperty(DeployerRunnerConstants.PARAM_USERNAME, "Username must be specified."));
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/cargo/CargoPropertiesProcessor.java`
#### Snippet
```java
    }

    if (StringUtil.isEmptyOrSpaces(properties.get(DeployerRunnerConstants.PARAM_PASSWORD))) {
      result.add(new InvalidProperty(DeployerRunnerConstants.PARAM_PASSWORD, "Password must be specified"));
    }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
    } else if (SSHRunnerConstants.AUTH_METHOD_CUSTOM_KEY.equals(authMethod)) {
      String keyFilePath = context.getRunnerParameters().get(SSHRunnerConstants.PARAM_KEYFILE);
      if (StringUtil.isEmpty(keyFilePath)) {
        keyFilePath = myDefaultKeyPath;
      }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java

      final String keyId = context.getRunnerParameters().get("teamcitySshKey");
      if (StringUtil.isEmptyOrSpaces(keyId)) {
        throw new JSchException("SSH key is not specified");
      }
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java

  public String getSessionString() {
    return (StringUtil.isNotEmpty(myRemotePath) ? "[" + myRemotePath + "] on " : "") + "host [" + myHost + ":" + myPort + "]";
  }

```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java

    try {
      jsch.addIdentity(key.getName(), key.getPrivateKey(), null, StringUtil.isNotEmpty(password) ? password.getBytes("UTF-8") : new byte[0]);
    } catch (UnsupportedEncodingException e) {
      myLog.error("Wrong encoding name", e);
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
  private Session initSessionKeyFile(String username, String password, File keyFile, JSch jsch) throws JSchException {
    try {
      if (StringUtil.isNotEmpty(password)) {
        myLog.debug("Adding password");
        jsch.addIdentity(keyFile.getCanonicalPath(), password);
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/DeployerPropertiesProcessor.java`
#### Snippet
```java
  public Collection<InvalidProperty> process(Map<String, String> properties) {
    Collection<InvalidProperty> result = new HashSet<InvalidProperty>();
    if (StringUtil.isEmptyOrSpaces(properties.get(DeployerRunnerConstants.PARAM_TARGET_URL))) {
      result.add(new InvalidProperty(DeployerRunnerConstants.PARAM_TARGET_URL, "The target must be specified."));
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/DeployerPropertiesProcessor.java`
#### Snippet
```java
    }

    if (StringUtil.isEmptyOrSpaces(properties.get(DeployerRunnerConstants.PARAM_SOURCE_PATH))) {
      result.add(new InvalidProperty(DeployerRunnerConstants.PARAM_SOURCE_PATH, "Artifact to deploy must be specified"));
    }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/cargo/CargoBuildProcessAdapter.java`
#### Snippet
```java
      }

      if (!StringUtil.isEmpty(myPort)) {
        configuration.setProperty(ServletPropertySet.PORT, myPort);
      }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHDeployerPropertiesProcessor.java`
#### Snippet
```java
  public Collection<InvalidProperty> process(Map<String, String> properties) {
    Collection<InvalidProperty> result = super.process(properties);
    if (StringUtil.isEmptyOrSpaces(properties.get(DeployerRunnerConstants.PARAM_USERNAME)) &&
        !SSHRunnerConstants.AUTH_METHOD_DEFAULT_KEY.equals(properties.get(SSHRunnerConstants.PARAM_AUTH_METHOD))) {
      result.add(new InvalidProperty(DeployerRunnerConstants.PARAM_USERNAME, "Username must be specified."));
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
          SSHRunnerConstants.SSH_EXEC_RUN_TYPE.equals(runnerType)) {
        final String sshAuthMethod = newRunnerParams.get(SSHRunnerConstants.PARAM_AUTH_METHOD);
        if (StringUtil.isEmpty(sshAuthMethod)) {
          runnerUpdated = true;
          Loggers.SERVER.debug("Setting default (username password) ssh authentication method for runner [" + runnerType + "-" + descriptor.getName() + "] in [" + buildType.getName() + "]");
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
          final String oldPassword = newRunnerParams.get(SSHRunnerConstants.PARAM_PASSWORD);
          final String oldHost = newRunnerParams.get(SSHRunnerConstants.PARAM_HOST);
          if (StringUtil.isNotEmpty(oldUsername)) {
            runnerUpdated = true;
            newRunnerParams.remove(SSHRunnerConstants.PARAM_USERNAME);
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
            newRunnerParams.put(DeployerRunnerConstants.PARAM_USERNAME, oldUsername);
          }
          if (StringUtil.isNotEmpty(oldPassword)) {
            runnerUpdated = true;
            newRunnerParams.remove(SSHRunnerConstants.PARAM_PASSWORD);
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
            newRunnerParams.put(DeployerRunnerConstants.PARAM_PASSWORD, oldPassword);
          }
          if (StringUtil.isNotEmpty(oldHost)) {
            runnerUpdated = true;
            newRunnerParams.remove(SSHRunnerConstants.PARAM_HOST);
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
      if (DeployerRunnerConstants.FTP_RUN_TYPE.equals(runnerType)) {
        final String ftpAuthMethod = newRunnerParams.get(FTPRunnerConstants.PARAM_AUTH_METHOD);
        if (StringUtil.isEmpty(ftpAuthMethod)) {
          runnerUpdated = true;
          Loggers.SERVER.debug("Setting ftp auth authentication method for runner [" + runnerType + "-" + descriptor.getName() + "] in [" + buildType.getName() + "]");
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
          Loggers.SERVER.debug("Setting ftp auth authentication method for runner [" + runnerType + "-" + descriptor.getName() + "] in [" + buildType.getName() + "]");
          final String username = newRunnerParams.get(DeployerRunnerConstants.PARAM_USERNAME);
          if (StringUtil.isEmpty(username)) {
            newRunnerParams.put(FTPRunnerConstants.PARAM_AUTH_METHOD, FTPRunnerConstants.AUTH_METHOD_ANONYMOUS);
          } else {
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
      if (DeployerRunnerConstants.SMB_RUN_TYPE.equals(runnerType)) {
        final String domain = newRunnerParams.get(DeployerRunnerConstants.PARAM_DOMAIN);
        if (StringUtil.isNotEmpty(domain)) {
          runnerUpdated = true;
          newRunnerParams.remove(DeployerRunnerConstants.PARAM_DOMAIN);
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHExecRunType.java`
#### Snippet
```java
      public Collection<InvalidProperty> process(Map<String, String> properties) {
        final Collection<InvalidProperty> invalidProperties = new HashSet<InvalidProperty>();
        if (jetbrains.buildServer.util.StringUtil.isEmptyOrSpaces(properties.get(DeployerRunnerConstants.PARAM_USERNAME)) &&
            !SSHRunnerConstants.AUTH_METHOD_DEFAULT_KEY.equals(properties.get(SSHRunnerConstants.PARAM_AUTH_METHOD))) {
          invalidProperties.add(new InvalidProperty(DeployerRunnerConstants.PARAM_USERNAME, "Username must be specified."));
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHExecRunType.java`
#### Snippet
```java
        }

        if (jetbrains.buildServer.util.StringUtil.isEmptyOrSpaces(properties.get(DeployerRunnerConstants.PARAM_TARGET_URL))) {
          invalidProperties.add(new InvalidProperty(DeployerRunnerConstants.PARAM_TARGET_URL, "The target must be specified."));
        }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHExecRunType.java`
#### Snippet
```java
        }

        if (jetbrains.buildServer.util.StringUtil.isEmptyOrSpaces(properties.get(SSHRunnerConstants.PARAM_COMMAND))) {
          invalidProperties.add(new InvalidProperty(SSHRunnerConstants.PARAM_COMMAND, "Remote command must be specified"));
        }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java

    // exec 'scp -rt <remoteBase>' remotely
    final String command = "scp -rt " + (StringUtil.isEmptyOrSpaces(escapedRemoteBase) ? "." : escapedRemoteBase);
    final ChannelExec execChannel = (ChannelExec) session.openChannel("exec");
    execChannel.setCommand(command);
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/InterruptibleUploadProcess.java`
#### Snippet
```java
    myRetryCount++;
    try {
      if (!StringUtil.isEmpty(myPath)) {
        createPath(myPath);
        checkResult(myClient.changeWorkingDirectory(myPath));
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/InterruptibleUploadProcess.java`
#### Snippet
```java
          final String destinationDir = fileStringEntry.getValue();

          if (StringUtil.isNotEmpty(destinationDir)) {
            createPath(destinationDir);
            checkResult(myClient.changeWorkingDirectory(destinationDir));
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/FtpBuildProcessAdapter.java`
#### Snippet
```java

  private boolean isNone(String secureMode) {
    return StringUtil.isEmpty(secureMode) || "0".equals(secureMode);
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `files` might be null
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/smb/SmbDeployerRunner.java`
#### Snippet
```java
  private ClassLoader loadClassesFrom(String libDirectory) {
    final File[] files = new File(root, libDirectory).listFiles();
    final URL[] urls = CollectionsUtil.convertCollection(Arrays.asList(files), new Converter<URL, File>() {
      @Override
      public URL createFrom(@NotNull File file) {
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `parts`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpOperationBuilder.java`
#### Snippet
```java
  static ScpOperation doCreatePathOperation(@NotNull final String remotePath,
                                                    @Nullable final ScpOperation chainTailOperation) {
    String parts[] = remotePath.replace('\\', '/').split("\\/");
    ScpOperation rootOperation = null;
    DirScpOperation currentOperation = null;
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourJschConfigInitialized` from instance context
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java

    try {
      ourJschConfigInitialized = true;
      Class initializer = Class.forName("jetbrains.buildServer.util.jsch.JSchConfigInitializer");
      Method initMethod = initializer.getMethod("initJSchConfig", Class.class);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'PARAM_PLAIN_PASSWORD' is still used
in `deploy-runner-common/src/main/java/jetbrains/buildServer/deployer/common/DeployerRunnerConstants.java`
#### Snippet
```java
  public static final String PARAM_PASSWORD = "secure:jetbrains.buildServer.deployer.password";
  @Deprecated
  public static final String PARAM_PLAIN_PASSWORD = "jetbrains.buildServer.deployer.password";
  @Deprecated
  public static final String PARAM_DOMAIN = "jetbrains.buildServer.deployer.domain";
```

### DeprecatedIsStillUsed
Deprecated member 'PARAM_DOMAIN' is still used
in `deploy-runner-common/src/main/java/jetbrains/buildServer/deployer/common/DeployerRunnerConstants.java`
#### Snippet
```java
  public static final String PARAM_PLAIN_PASSWORD = "jetbrains.buildServer.deployer.password";
  @Deprecated
  public static final String PARAM_DOMAIN = "jetbrains.buildServer.deployer.domain";
  public static final String PARAM_TARGET_URL = "jetbrains.buildServer.deployer.targetUrl";
  public static final String PARAM_SOURCE_PATH = "jetbrains.buildServer.deployer.sourcePath";
```

### DeprecatedIsStillUsed
Deprecated member 'PARAM_HOST' is still used
in `deploy-runner-common/src/main/java/jetbrains/buildServer/deployer/common/SSHRunnerConstants.java`
#### Snippet
```java

  @Deprecated
  public static final String PARAM_HOST = "jetbrains.buildServer.sshexec.host";
  public static final String PARAM_PORT = "jetbrains.buildServer.sshexec.port";
  public static final String PARAM_TIMEOUT = "jetbrains.buildServer.sshexec.timeout.seconds";
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpOperationBuilder.java`
#### Snippet
```java
  static ScpOperation doCreatePathOperation(@NotNull final String remotePath,
                                                    @Nullable final ScpOperation chainTailOperation) {
    String parts[] = remotePath.replace('\\', '/').split("\\/");
    ScpOperation rootOperation = null;
    DirScpOperation currentOperation = null;
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java

      String escapedRemotePathFromDrive = escapedRemotePath;
      List<String> filePath = Stream.of(escapedRemotePath.replace('\\', '/').split("\\/"))
              .filter(it -> !it.isEmpty()).collect(Collectors.toList());
      String escapedRemoteBase = isRemoteBaseAbsolute ? "/" : ".";
```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java
              .filter(it -> !it.isEmpty()).collect(Collectors.toList());
      String escapedRemoteBase = isRemoteBaseAbsolute ? "/" : ".";
      if (filePath.size() > 0 && filePath.get(0).matches("\\w\\:")) {
        // cases to of specific windows drive, like C:
        escapedRemoteBase = "/" + filePath.get(0);
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
  private void maybeCreate(@NotNull final DiskShare diskShare, @NotNull final String pathInShare) {
    String existingPrefix = FileUtil.normalizeRelativePath(pathInShare).replace('/', '\\');
    final Stack<String> toCreate = new Stack<>();

    while (existingPrefix.length() > 0 && !diskShare.folderExists(existingPrefix)) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
  private void maybeCreate(@NotNull final DiskShare diskShare, @NotNull final String pathInShare) {
    String existingPrefix = FileUtil.normalizeRelativePath(pathInShare).replace('/', '\\');
    final Stack<String> toCreate = new Stack<>();

    while (existingPrefix.length() > 0 && !diskShare.folderExists(existingPrefix)) {
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
    try {
      myTimeout = Integer.parseInt(timeoutStr);
    } catch (NumberFormatException e) {
    }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`prefixPath.length() > 0` can be replaced with '!prefixPath.isEmpty()'
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
    Map<File, String> fileFullPathMap = new HashMap<>();

    if (prefixPath.length() > 0) {
      for (Map.Entry<File, String> entry : filePathMap.entrySet()) {
        fileFullPathMap.put(entry.getKey(), prefixPath + "\\" + entry.getValue());
```

### SizeReplaceableByIsEmpty
`targetPath.length() > 0` can be replaced with '!targetPath.isEmpty()'
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
      maybeCreate(share, targetPath);

      final String targetName = (targetPath.length() > 0 ? targetPath + "\\" : "") + source.getName();
      final com.hierynomus.smbj.share.File targetFile = share.openFile(targetName,
              EnumSet.of(AccessMask.GENERIC_WRITE),
```

### SizeReplaceableByIsEmpty
`existingPrefix.length() > 0` can be replaced with '!existingPrefix.isEmpty()'
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
    final Stack<String> toCreate = new Stack<>();

    while (existingPrefix.length() > 0 && !diskShare.folderExists(existingPrefix)) {
      final int endIndex = existingPrefix.lastIndexOf('\\');
      if (endIndex > -1) {
```

### SizeReplaceableByIsEmpty
`existingPrefix.length() > 0` can be replaced with '!existingPrefix.isEmpty()'
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java

    while (!toCreate.empty()) {
      existingPrefix = (existingPrefix.length() > 0 ? existingPrefix + "\\" : "") + toCreate.pop();
      diskShare.mkdir(existingPrefix);
    }
```

### SizeReplaceableByIsEmpty
`components.size() > 0` can be replaced with '!components.isEmpty()'
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
    final List<String> components = StringUtil.split(target, "\\");
    final String host = components.remove(0);
    final String shareName = components.size() > 0 ? components.remove(0) : "";
    final String pathInShare = StringUtil.join(components, "\\");

```

### SizeReplaceableByIsEmpty
`filePath.size() > 0` can be replaced with '!filePath.isEmpty()'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java
              .filter(it -> !it.isEmpty()).collect(Collectors.toList());
      String escapedRemoteBase = isRemoteBaseAbsolute ? "/" : ".";
      if (filePath.size() > 0 && filePath.get(0).matches("\\w\\:")) {
        // cases to of specific windows drive, like C:
        escapedRemoteBase = "/" + filePath.get(0);
```

### SizeReplaceableByIsEmpty
`artifacts.size() == 0` can be replaced with 'artifacts.isEmpty()'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java

    // skip empty collections
    if (artifacts.size() == 0) {
      return;
    }
```

### SizeReplaceableByIsEmpty
`encodedPath.length() > 0` can be replaced with '!encodedPath.isEmpty()'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/FtpBuildProcessAdapter.java`
#### Snippet
```java

      final String path;
      if (encodedPath.length() > 0) {
        path = URLDecoder.decode(encodedPath.substring(1), "UTF-8");
      } else {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/FtpDeployerRunType.java`
#### Snippet
```java
  @Override
  public String describeParameters(@NotNull Map<String, String> parameters) {
    StringBuilder sb = new StringBuilder();
    sb.append("Target FTP server: ").append(parameters.get(DeployerRunnerConstants.PARAM_TARGET_URL));
    return sb.toString();
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/DataChannelProtection.java`
#### Snippet
```java

  public String getCodeAsString() {
    return "" + code;
  }

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpExecUtil.java`
#### Snippet
```java
        sb.append((char) c);
      } while (c != '\n');
      throw new IOException("Remote system responded with error: " + sb.toString());
    } else {
      final int available = in.available();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
      myLog.warn("Could not find 'jetbrains.buildServer.util.jsch.JSchConfigInitializer' class in the classpath, skip JSch config initialization");
    } catch (NoSuchMethodException e) {
      myLog.warn("Could not find initJSchConfig method in 'jetbrains.buildServer.util.jsch.JSchConfigInitializer' class, skip JSch config initialization, error: " + e.toString());
    } catch (Throwable e) {
      myLog.warn("Failed to perform JSch config initialization, error: " + e.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
      myLog.warn("Could not find initJSchConfig method in 'jetbrains.buildServer.util.jsch.JSchConfigInitializer' class, skip JSch config initialization, error: " + e.toString());
    } catch (Throwable e) {
      myLog.warn("Failed to perform JSch config initialization, error: " + e.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/cargo/CargoBuildProcessAdapter.java`
#### Snippet
```java
    }
    if (cause != e) {
      sb.append("\n, root cause is ").append(cause.toString());
    }
    return sb.toString();
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/FileScpOperation.java`
#### Snippet
```java
    } catch (UnsupportedOperationException e) {
      logger.warn("Filesystem doesn't support POSIX file attributes, rolling back to generics.");
      permission = new HashSet<>();
      if (Files.isExecutable(file.toPath())) {
        permission.add(OWNER_EXECUTE);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ArtifactsCollection`
in `deploy-runner-agent-smb/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBBuildProcessAdapter.java`
#### Snippet
```java
                                @Nullable final String domain,
                                @NotNull final String target,
                                @NotNull final List<ArtifactsCollection> artifactsCollections,
                                final boolean dnsOnlyNameResolution) {
    super(context.getBuild().getBuildLogger());
```

### BoundedWildcard
Can generalize to `? extends ArtifactsCollection`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/sftp/SftpBuildProcessAdapter.java`
#### Snippet
```java

  public SftpBuildProcessAdapter(@NotNull final BuildRunnerContext context,
                                 @NotNull final List<ArtifactsCollection> artifactsCollections,
                                 @NotNull final SSHSessionProvider sessionProvider) {
    super(context.getBuild().getBuildLogger());
```

### BoundedWildcard
Can generalize to `? extends ArtifactsCollection`
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
                                 @Nullable final String domain,
                                 @NotNull final String target,
                                 @NotNull final List<ArtifactsCollection> artifactsCollections) {
    super(context.getBuild().getBuildLogger());
    myTarget = target;
```

### BoundedWildcard
Can generalize to `? extends ArtifactsCollection`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java

  public ScpProcessAdapter(@NotNull final BuildRunnerContext context,
                           @NotNull final List<ArtifactsCollection> artifactsCollections,
                           @NotNull final SSHSessionProvider sessionProvider) {
    super(context.getBuild().getBuildLogger());
```

### BoundedWildcard
Can generalize to `? extends ArtifactsCollection`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java
  private void upload(final @NotNull Session session,
                      final @NotNull String escapedRemoteBase,
                      final @NotNull List<ArtifactsCollection> artifacts) throws IOException, JSchException {

    assert session.isConnected();
```

### BoundedWildcard
Can generalize to `? extends ArtifactsCollection`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/InterruptibleUploadProcess.java`
#### Snippet
```java
  public InterruptibleUploadProcess(@NotNull final FTPClient client,
                                    @NotNull final BuildProgressLogger logger,
                                    @NotNull final List<ArtifactsCollection> artifacts,
                                    final boolean isAutoType,
                                    @NotNull final String path,
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/FileScpOperation.java`
#### Snippet
```java
class FileScpOperation implements ScpOperation {
  private static final Logger logger = Logger.getInstance(FileScpOperation.class.getCanonicalName());
  private final static String ZEROES = "000";
  final File myFile;
  final int myPermission;
```

### MissortedModifiers
Missorted modifiers `final private`
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SmbDeployerRunType.java`
#### Snippet
```java
public class SmbDeployerRunType extends RunType {

  final private Pattern SIMPLE_UNC_REGEX = Pattern.compile("^(?:(\\\\\\\\)?%[^\\\\%\\s]+%)|(?:\\\\\\\\[^\\\\]+\\\\[^\\\\]+(\\\\[^\\\\]+)*)$");

  private final PluginDescriptor myDescriptor;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java
  }

  private void upload(final @NotNull Session session,
                      final @NotNull String escapedRemoteBase,
                      final @NotNull List<ArtifactsCollection> artifacts) throws IOException, JSchException {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java

  private void upload(final @NotNull Session session,
                      final @NotNull String escapedRemoteBase,
                      final @NotNull List<ArtifactsCollection> artifacts) throws IOException, JSchException {

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java
  private void upload(final @NotNull Session session,
                      final @NotNull String escapedRemoteBase,
                      final @NotNull List<ArtifactsCollection> artifacts) throws IOException, JSchException {

    assert session.isConnected();
```

### MissortedModifiers
Missorted modifiers `final static`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/InterruptibleUploadProcess.java`
#### Snippet
```java
  private final AtomicReference<BuildFinishedStatus> myFinishStatus;

  private final static Set<String> ourKnownAsciiExts = new HashSet<String>();
  private int myRetryCount = 0;

```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/sftp/SftpBuildProcessAdapter.java`
#### Snippet
```java
          final File source = fileStringEntry.getKey();
          final String value = fileStringEntry.getValue();
          final String destinationPath = "".equals(value) ? "." : value;
          createRemotePath(channel, destinationPath);
          LOG.debug("Transferring [" + source.getAbsolutePath() + "] to [" + destinationPath + "] under [" + baseDir + "]");
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
    if (SSHRunnerConstants.AUTH_METHOD_DEFAULT_KEY.equals(authMethod)) {
      final String configPath = holder.getInternalProperty(TEAMCITY_DEPLOYER_SSH_CONFIG_PATH, System.getProperty("user.home") + File.separator + ".ssh" + File.separator + "config");
      //noinspection ConstantConditions
      final File config = new File(configPath);
      if (config.exists()) {
```

### RedundantSuppression
Redundant suppression
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
      } else {
        final String keyPath = holder.getInternalProperty(TEAMCITY_DEPLOYER_SSH_DEFAULT_KEY, myDefaultKeyPath);
        //noinspection ConstantConditions
        final File keyFile = new File(keyPath);
        myLog.debug("Using keyfile at [" + keyFile.getAbsolutePath() + "], load.");
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `s.length() < ZEROES.length()`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/FileScpOperation.java`
#### Snippet
```java
  String getPermission() {
    String s = Integer.toOctalString(myPermission);
    if (s.length() < ZEROES.length()) {
      s = ZEROES.substring(s.length()) + s;
    } else if (s.length() < ZEROES.length()) {
```

### DuplicateCondition
Duplicate condition `s.length() < ZEROES.length()`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/FileScpOperation.java`
#### Snippet
```java
    if (s.length() < ZEROES.length()) {
      s = ZEROES.substring(s.length()) + s;
    } else if (s.length() < ZEROES.length()) {
      logger.warn("Permissions for file " + myFile.getAbsolutePath() + " calculated as " + s + ". Rolling back permissions to 644");
      s = "644";
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/cargo/CargoBuildProcessAdapter.java`
#### Snippet
```java
    mySourcePath = sourcePath;
    myContainerType = context.getRunnerParameters().get(DeployerRunnerConstants.PARAM_CONTAINER_TYPE);
    myUseHttps = Boolean.valueOf(context.getRunnerParameters().get(CargoRunnerConstants.USE_HTTPS));
  }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/smb/SmbDeployerRunner.java`
#### Snippet
```java
    final Class smbBuildProcessClass = processClassloader.loadClass("jetbrains.buildServer.deployer.agent.smb.SMBBuildProcessAdapter");

    final boolean dnsOnly = Boolean.valueOf(context.getRunnerParameters().get(SMBRunnerConstants.DNS_ONLY_NAME_RESOLUTION));

    final Constructor constructor = smbBuildProcessClass.getConstructor(BuildRunnerContext.class,
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpExecUtil.java`
#### Snippet
```java
      content[0] = (byte) b;
      final int read = in.read(content, 1, available);
      final String message = new String(content, 0, read + 1, "UTF-8");
      throw new IOException("Unexpected response from remote system: " + message);
    }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java

    try {
      jsch.addIdentity(key.getName(), key.getPrivateKey(), null, StringUtil.isNotEmpty(password) ? password.getBytes("UTF-8") : new byte[0]);
    } catch (UnsupportedEncodingException e) {
      myLog.error("Wrong encoding name", e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHExecProcessAdapter.java`
#### Snippet
```java
        }
      };
      final LineAwareByteArrayOutputStream outputStream = new LineAwareByteArrayOutputStream(Charset.forName("UTF-8"), lineListener);
      final StreamGobbler outputGobbler = new StreamGobbler(channel.getInputStream(), null, "SSH session to [" + session.getHost() + "]", outputStream);
      final LineAwareByteArrayOutputStream errStream = new LineAwareByteArrayOutputStream(Charset.forName("UTF-8"), lineListener);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHExecProcessAdapter.java`
#### Snippet
```java
      final LineAwareByteArrayOutputStream outputStream = new LineAwareByteArrayOutputStream(Charset.forName("UTF-8"), lineListener);
      final StreamGobbler outputGobbler = new StreamGobbler(channel.getInputStream(), null, "SSH session to [" + session.getHost() + "]", outputStream);
      final LineAwareByteArrayOutputStream errStream = new LineAwareByteArrayOutputStream(Charset.forName("UTF-8"), lineListener);
      final StreamGobbler errGobbler = new StreamGobbler(channel.getErrStream(), null, "Unknown", errStream);

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHExecProcessAdapter.java`
#### Snippet
```java
          if (waitingForTooLong && hasSomePendingOutput) {
            // force dump of current pending output
            outputStream.write("\n".getBytes(Charset.forName("UTF-8")));
          }
        } catch (InterruptedException e) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deploy-runner-agent-smb/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBBuildProcessAdapter.java`
#### Snippet
```java
    }

    targetWithProtocol = targetWithProtocol.replaceAll("\\\\", "/");

    NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(myDomain == null ? "" : myDomain,
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
      final String remotePath = target.substring(delimiterIndex + 1);

      myRemotePath = remotePath.trim().replaceAll("\\\\", "/");
      if (new File(myRemotePath).isAbsolute() && !myRemotePath.startsWith("/")) {
        myRemotePath = "/" + myRemotePath;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
    }

    target = target.replaceAll("/", java.util.regex.Matcher.quoteReplacement("\\"));
    if (!target.endsWith("\\")) {
      target = target + "\\";
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHExecRunType.java`
#### Snippet
```java
    final String commands = parameters.get(SSHRunnerConstants.PARAM_COMMAND);
    if (commands != null) {
      final List<String> commandsList = Arrays.asList(commands.split("\\\\n"));
      final int size = commandsList.size();
      if (size > 0) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java
              .filter(it -> !it.isEmpty()).collect(Collectors.toList());
      String escapedRemoteBase = isRemoteBaseAbsolute ? "/" : ".";
      if (filePath.size() > 0 && filePath.get(0).matches("\\w\\:")) {
        // cases to of specific windows drive, like C:
        escapedRemoteBase = "/" + filePath.get(0);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/InterruptibleUploadProcess.java`
#### Snippet
```java
  private void createPath(@NotNull final String path) throws IOException, FailureDetectedException {
    final String root = myClient.printWorkingDirectory();
    final String normalisedPath = path.trim().replaceAll("\\\\", "/");
    final StringTokenizer pathTokenizer = new StringTokenizer(normalisedPath, "/");
    if (path.startsWith("/")) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jcifs` is unnecessary, and can be replaced with an import
in `deploy-runner-agent-smb/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBBuildProcessAdapter.java`
#### Snippet
```java
    myArtifactsCollections = artifactsCollections;

    jcifs.Config.setProperty("jcifs.smb.client.disablePlainTextPasswords", "false");
    if (dnsOnlyNameResolution) {
      jcifs.Config.setProperty("jcifs.resolveOrder", "DNS");
```

### UnnecessaryFullyQualifiedName
Qualifier `jcifs` is unnecessary, and can be replaced with an import
in `deploy-runner-agent-smb/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBBuildProcessAdapter.java`
#### Snippet
```java
    jcifs.Config.setProperty("jcifs.smb.client.disablePlainTextPasswords", "false");
    if (dnsOnlyNameResolution) {
      jcifs.Config.setProperty("jcifs.resolveOrder", "DNS");
      jcifs.Config.setProperty("jcifs.smb.client.dfs.disabled", "true");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `jcifs` is unnecessary, and can be replaced with an import
in `deploy-runner-agent-smb/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBBuildProcessAdapter.java`
#### Snippet
```java
    if (dnsOnlyNameResolution) {
      jcifs.Config.setProperty("jcifs.resolveOrder", "DNS");
      jcifs.Config.setProperty("jcifs.smb.client.dfs.disabled", "true");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.jcraft.jsch` is unnecessary and can be removed
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
      jsch.setIdentityRepository(irepo);
      return session;
    } catch (com.jcraft.jsch.AgentProxyException e) {
      throw new JSchException("Failed to connect to ssh agent.", e);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary, and can be replaced with an import
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
    }

    target = target.replaceAll("/", java.util.regex.Matcher.quoteReplacement("\\"));
    if (!target.endsWith("\\")) {
      target = target + "\\";
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.util.Hash;`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/FileScpOperation.java`
#### Snippet
```java
import com.intellij.openapi.diagnostic.Logger;
import jetbrains.buildServer.util.FileUtil;
import jetbrains.buildServer.util.Hash;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import java.nio.file.attribute.BasicFileAttributes;`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/FileScpOperation.java`
#### Snippet
```java
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/FileScpOperation.java`
#### Snippet
```java
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/FileScpOperation.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.attribute.PosixFilePermission.*;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.attribute.PosixFileAttributes;`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.Files;
import java.util.*;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Files;`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java
import java.io.OutputStream;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `deploy-runner-agent-smb/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBBuildProcessAdapter.java`
#### Snippet
```java
    byte[] buf = new byte[STREAM_BUFFER_SIZE];
    int read;
    while ((read = inputStream.read(buf)) > -1) {
      checkIsInterrupted();
      outputStream.write(buf, 0, read);
```

### NestedAssignment
Result of assignment expression used
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
    byte[] buf = new byte[STREAM_BUFFER_SIZE];
    int read;
    while ((read = inputStream.read(buf)) > -1) {
      checkIsInterrupted();
      outputStream.write(buf, 0, read);
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`targetWithProtocol = targetWithProtocol + "/"` could be simplified to 'targetWithProtocol += "/"'
in `deploy-runner-agent-smb/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBBuildProcessAdapter.java`
#### Snippet
```java
    // Share and directories names require trailing /
    if (!targetWithProtocol.endsWith("/")) {
      targetWithProtocol = targetWithProtocol + "/";
    }

```

### ReplaceAssignmentWithOperatorAssignment
`target = target + "\\"` could be simplified to 'target += "\\\\"'
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
    target = target.replaceAll("/", java.util.regex.Matcher.quoteReplacement("\\"));
    if (!target.endsWith("\\")) {
      target = target + "\\";
    }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SyncBuildProcessAdapter()` of an abstract class should not be declared 'public'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/SyncBuildProcessAdapter.java`
#### Snippet
```java


  public SyncBuildProcessAdapter(@NotNull final BuildProgressLogger logger) {
    myLogger = logger;
    hasFinished = false;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseDeployerRunner()` of an abstract class should not be declared 'public'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/base/BaseDeployerRunner.java`
#### Snippet
```java
  protected final ExtensionHolder myExtensionHolder;

  public BaseDeployerRunner(@NotNull final ExtensionHolder extensionHolder) {
    myExtensionHolder = extensionHolder;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `InterruptibleUploadProcess()` of an abstract class should not be declared 'public'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/InterruptibleUploadProcess.java`
#### Snippet
```java


  public InterruptibleUploadProcess(@NotNull final FTPClient client,
                                    @NotNull final BuildProgressLogger logger,
                                    @NotNull final List<ArtifactsCollection> artifacts,
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/cargo/CargoContainersBean.java`
#### Snippet
```java
      }
    }
    Collections.sort(containerIds, new Comparator<ContainerBean>() {
      @Override
      public int compare(ContainerBean o1, ContainerBean o2) {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
  private String myRemotePath;
  private final String myDefaultKeyPath = System.getProperty("user.home") + "/.ssh/id_rsa";
  private static volatile boolean ourJschConfigInitialized = false;

  public SSHSessionProvider(@NotNull final BuildRunnerContext context,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/cargo/CargoBuildProcessAdapter.java`
#### Snippet
```java
  private final String mySourcePath;
  private final String myContainerType;
  private boolean myUseHttps = false;

  public CargoBuildProcessAdapter(@NotNull String target,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/InterruptibleUploadProcess.java`
#### Snippet
```java

  private final static Set<String> ourKnownAsciiExts = new HashSet<String>();
  private int myRetryCount = 0;

  static {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `target`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/FtpBuildProcessAdapter.java`
#### Snippet
```java
    // strip protocols
    if (target.toLowerCase().startsWith(FTP_PROTOCOL))
      target = target.substring(FTP_PROTOCOL.length());
    // ftps protocol doesn't exist but for user's convenience
    if (target.toLowerCase().startsWith(FTPS_PROTOCOL)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/FtpBuildProcessAdapter.java`
#### Snippet
```java
      context.getRunnerParameters().putIfAbsent(FTPRunnerConstants.PARAM_SSL_MODE, FTPS_SECURITY_MODE_DEFAULT);
      context.getRunnerParameters().putIfAbsent(FTPRunnerConstants.DATA_CHANNEL_PROTECTION, DataChannelProtection.DISABLE.getCodeAsString());
      target = target.substring(FTPS_PROTOCOL.length());
    }
    return FTP_PROTOCOL + target;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-22-22-05-14.710.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java

    try {
      jsch.addIdentity(key.getName(), key.getPrivateKey(), null, StringUtil.isNotEmpty(password) ? password.getBytes("UTF-8") : new byte[0]);
    } catch (UnsupportedEncodingException e) {
      myLog.error("Wrong encoding name", e);
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(\\\\\\\\)?%[^\\\\%\\s]+%)`
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SmbDeployerRunType.java`
#### Snippet
```java
public class SmbDeployerRunType extends RunType {

  final private Pattern SIMPLE_UNC_REGEX = Pattern.compile("^(?:(\\\\\\\\)?%[^\\\\%\\s]+%)|(?:\\\\\\\\[^\\\\]+\\\\[^\\\\]+(\\\\[^\\\\]+)*)$");

  private final PluginDescriptor myDescriptor;
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\\\\\\\[^\\\\]+\\\\[^\\\\]+(\\\\[^\\\\]+)*)`
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SmbDeployerRunType.java`
#### Snippet
```java
public class SmbDeployerRunType extends RunType {

  final private Pattern SIMPLE_UNC_REGEX = Pattern.compile("^(?:(\\\\\\\\)?%[^\\\\%\\s]+%)|(?:\\\\\\\\[^\\\\]+\\\\[^\\\\]+(\\\\[^\\\\]+)*)$");

  private final PluginDescriptor myDescriptor;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/SyncBuildProcessAdapter.java`
#### Snippet
```java
    while (!isInterrupted() && !hasFinished) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RunBuildException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHExecProcessAdapter.java`
#### Snippet
```java

        try {
          Thread.sleep(500);
          // sometimes no newline chars are present, but still some output may be pending
          final boolean hasSomePendingOutput = outputGobbler.getLastActivityTimestamp() > lastOutputTimeStamp.get();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `myUseHttps` initializer `false` is redundant
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/cargo/CargoBuildProcessAdapter.java`
#### Snippet
```java
  private final String mySourcePath;
  private final String myContainerType;
  private boolean myUseHttps = false;

  public CargoBuildProcessAdapter(@NotNull String target,
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `s.length() < ZEROES.length()` is always `false`
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/FileScpOperation.java`
#### Snippet
```java
    if (s.length() < ZEROES.length()) {
      s = ZEROES.substring(s.length()) + s;
    } else if (s.length() < ZEROES.length()) {
      logger.warn("Permissions for file " + myFile.getAbsolutePath() + " calculated as " + s + ". Rolling back permissions to 644");
      s = "644";
```

