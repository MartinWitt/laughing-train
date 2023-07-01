# teamcity-deployer-plugin 
 
# Bad smells
I found 77 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 11 | false |
| SpringBeanConstructorArgInspection | 10 | false |
| NullableProblems | 8 | false |
| UNUSED_IMPORT | 6 | false |
| CharsetObjectCanBeUsed | 5 | false |
| FieldMayBeFinal | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| UNCHECKED_WARNING | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| RegExpRedundantEscape | 3 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| BusyWait | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| DuplicateCondition | 2 | false |
| UnnecessaryModifier | 1 | true |
| AutoCloseableResource | 1 | false |
| DataFlowIssue | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| DuplicatedCode | 1 | false |
| CatchMayIgnoreException | 1 | false |
| IOStreamConstructor | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'SMBClient' used without 'try'-with-resources statement
in `deploy-runner-agent-smb2/src/main/java/jetbrains/buildServer/deployer/agent/smb/SMBJBuildProcessAdapter.java`
#### Snippet
```java
        config = config.withSecurityProvider(new BCSecurityProvider());

      SMBClient client = new SMBClient(config.build());

      Connection connection = client.connect(host);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/smb/SmbDeployerRunner.java`
#### Snippet
```java
    final boolean dnsOnly = Boolean.valueOf(context.getRunnerParameters().get(SMBRunnerConstants.DNS_ONLY_NAME_RESOLUTION));

    final Constructor constructor = smbBuildProcessClass.getConstructor(BuildRunnerContext.class,
            String.class, String.class, String.class, String.class, List.class, boolean.class);
    return (BuildProcess) constructor.newInstance(context, username, password, domain, target, artifactsCollections, dnsOnly);
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/smb/SmbDeployerRunner.java`
#### Snippet
```java
    final ClassLoader processClassloader = loadClassesFrom("smb2Lib");
    final Class smbBuildProcessClass = processClassloader.loadClass("jetbrains.buildServer.deployer.agent.smb.SMBJBuildProcessAdapter");
    final Constructor constructor = smbBuildProcessClass.getConstructor(BuildRunnerContext.class,
            String.class, String.class, String.class, String.class, List.class);
    return (BuildProcess) constructor.newInstance(context, username, password, domain, target, artifactsCollections);
```

### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java
      ourJschConfigInitialized = true;
      Class initializer = Class.forName("jetbrains.buildServer.util.jsch.JSchConfigInitializer");
      Method initMethod = initializer.getMethod("initJSchConfig", Class.class);
      initMethod.invoke(null, JSch.class);
    } catch (ClassNotFoundException e) {
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `mySessionProvider` may be 'final'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/sftp/SftpBuildProcessAdapter.java`
#### Snippet
```java
  private static final Logger LOG = Logger.getInstance(SftpBuildProcessAdapter.class.getName());
  private final List<ArtifactsCollection> myArtifacts;
  private SSHSessionProvider mySessionProvider;

  public SftpBuildProcessAdapter(@NotNull final BuildRunnerContext context,
```

### FieldMayBeFinal
Field `mySessionProvider` may be 'final'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/scp/ScpProcessAdapter.java`
#### Snippet
```java


  private SSHSessionProvider mySessionProvider;

  public ScpProcessAdapter(@NotNull final BuildRunnerContext context,
```

### FieldMayBeFinal
Field `myEnableSshAgentForwarding` may be 'final'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHProcessAdapterOptions.java`
#### Snippet
```java
class SSHProcessAdapterOptions {
  private boolean myFailBuildOnExitCode;
  private boolean myEnableSshAgentForwarding;

  SSHProcessAdapterOptions(boolean myFailBuildOnExitCode, boolean myEnableSshAgentForwarding) {
```

### FieldMayBeFinal
Field `myFailBuildOnExitCode` may be 'final'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHProcessAdapterOptions.java`
#### Snippet
```java

class SSHProcessAdapterOptions {
  private boolean myFailBuildOnExitCode;
  private boolean myEnableSshAgentForwarding;

```

### FieldMayBeFinal
Field `myHost` may be 'final'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ssh/SSHSessionProvider.java`
#### Snippet
```java

  private Session mySession;
  private String myHost;
  private int myPort;
  private int myTimeout = 60;
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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'SSHDeployerRunner'#treeend

*** ** * ** ***

|----------------------------------------------|---|-----------|
| **SSHDeployerRunner(...):**                  |   | **Bean:** |
| ExtensionHolder extensionHolder              |   | **???**   |
| InternalPropertiesHolder holder              |   | **???**   |
| AgentRunningBuildSshKeyManager sshKeyManager |   | **???**   |
in `deploy-runner-agent/src/main/resources/META-INF/build-agent-plugin-deploy-runner.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
    <bean id="sshDeployerRunner" class="jetbrains.buildServer.deployer.agent.ssh.SSHDeployerRunner"/>
    <bean id="sshExecRunner" class="jetbrains.buildServer.deployer.agent.ssh.SSHExecRunner"/>
    <bean id="smbDeployerRunner" class="jetbrains.buildServer.deployer.agent.smb.SmbDeployerRunner"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SSHExecRunner'#treeend

*** ** * ** ***

|----------------------------------------------|---|-----------|
| **SSHExecRunner(...):**                      |   | **Bean:** |
| InternalPropertiesHolder holder              |   | **???**   |
| AgentRunningBuildSshKeyManager sshKeyManager |   | **???**   |
in `deploy-runner-agent/src/main/resources/META-INF/build-agent-plugin-deploy-runner.xml`
#### Snippet
```java
       default-autowire="constructor">
    <bean id="sshDeployerRunner" class="jetbrains.buildServer.deployer.agent.ssh.SSHDeployerRunner"/>
    <bean id="sshExecRunner" class="jetbrains.buildServer.deployer.agent.ssh.SSHExecRunner"/>
    <bean id="smbDeployerRunner" class="jetbrains.buildServer.deployer.agent.smb.SmbDeployerRunner"/>
    <bean id="ftpDeployerRunner" class="jetbrains.buildServer.deployer.agent.ftp.FtpDeployerRunner"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SmbDeployerRunner'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **SmbDeployerRunner(...):**       |   | **Bean:** |
| ExtensionHolder extensionHolder   |   | **???**   |
| PluginDescriptor pluginDescriptor |   | **???**   |
in `deploy-runner-agent/src/main/resources/META-INF/build-agent-plugin-deploy-runner.xml`
#### Snippet
```java
    <bean id="sshDeployerRunner" class="jetbrains.buildServer.deployer.agent.ssh.SSHDeployerRunner"/>
    <bean id="sshExecRunner" class="jetbrains.buildServer.deployer.agent.ssh.SSHExecRunner"/>
    <bean id="smbDeployerRunner" class="jetbrains.buildServer.deployer.agent.smb.SmbDeployerRunner"/>
    <bean id="ftpDeployerRunner" class="jetbrains.buildServer.deployer.agent.ftp.FtpDeployerRunner"/>
    <bean id="cargoDeployerRunner" class="jetbrains.buildServer.deployer.agent.cargo.CargoDeployerRunner"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FtpDeployerRunner'#treeend

*** ** * ** ***

|---------------------------------|---|-----------|
| **FtpDeployerRunner(...):**     |   | **Bean:** |
| ExtensionHolder extensionHolder |   | **???**   |
in `deploy-runner-agent/src/main/resources/META-INF/build-agent-plugin-deploy-runner.xml`
#### Snippet
```java
    <bean id="sshExecRunner" class="jetbrains.buildServer.deployer.agent.ssh.SSHExecRunner"/>
    <bean id="smbDeployerRunner" class="jetbrains.buildServer.deployer.agent.smb.SmbDeployerRunner"/>
    <bean id="ftpDeployerRunner" class="jetbrains.buildServer.deployer.agent.ftp.FtpDeployerRunner"/>
    <bean id="cargoDeployerRunner" class="jetbrains.buildServer.deployer.agent.cargo.CargoDeployerRunner"/>
</beans>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SSHDeployerRunType'#treeend

*** ** * ** ***

|------------------------------|---|-----------|
| **SSHDeployerRunType(...):** |   | **Bean:** |
| RunTypeRegistry registry     |   | **???**   |
| PluginDescriptor descriptor  |   | **???**   |
in `deploy-runner-server/src/main/resources/META-INF/build-server-plugin-deploy-runner.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
    <bean id="scpDeployerRunType" class="jetbrains.buildServer.deployer.server.SSHDeployerRunType"/>
    <bean id="smbDeployerRunType" class="jetbrains.buildServer.deployer.server.SmbDeployerRunType"/>
    <bean id="ftpDeployerRunType" class="jetbrains.buildServer.deployer.server.FtpDeployerRunType"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SmbDeployerRunType'#treeend

*** ** * ** ***

|------------------------------|---|-----------|
| **SmbDeployerRunType(...):** |   | **Bean:** |
| RunTypeRegistry registry     |   | **???**   |
| PluginDescriptor descriptor  |   | **???**   |
in `deploy-runner-server/src/main/resources/META-INF/build-server-plugin-deploy-runner.xml`
#### Snippet
```java
       default-autowire="constructor">
    <bean id="scpDeployerRunType" class="jetbrains.buildServer.deployer.server.SSHDeployerRunType"/>
    <bean id="smbDeployerRunType" class="jetbrains.buildServer.deployer.server.SmbDeployerRunType"/>
    <bean id="ftpDeployerRunType" class="jetbrains.buildServer.deployer.server.FtpDeployerRunType"/>
    <bean id="cargoDeployerRunType" class="jetbrains.buildServer.deployer.server.cargo.CargoDeployerRunType"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FtpDeployerRunType'#treeend

*** ** * ** ***

|------------------------------|---|-----------|
| **FtpDeployerRunType(...):** |   | **Bean:** |
| RunTypeRegistry registry     |   | **???**   |
| PluginDescriptor descriptor  |   | **???**   |
in `deploy-runner-server/src/main/resources/META-INF/build-server-plugin-deploy-runner.xml`
#### Snippet
```java
    <bean id="scpDeployerRunType" class="jetbrains.buildServer.deployer.server.SSHDeployerRunType"/>
    <bean id="smbDeployerRunType" class="jetbrains.buildServer.deployer.server.SmbDeployerRunType"/>
    <bean id="ftpDeployerRunType" class="jetbrains.buildServer.deployer.server.FtpDeployerRunType"/>
    <bean id="cargoDeployerRunType" class="jetbrains.buildServer.deployer.server.cargo.CargoDeployerRunType"/>
    <bean id="sshExecRunType" class="jetbrains.buildServer.deployer.server.SSHExecRunType"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'CargoDeployerRunType'#treeend

*** ** * ** ***

|--------------------------------|---|-----------|
| **CargoDeployerRunType(...):** |   | **Bean:** |
| RunTypeRegistry registry       |   | **???**   |
| PluginDescriptor descriptor    |   | **???**   |
in `deploy-runner-server/src/main/resources/META-INF/build-server-plugin-deploy-runner.xml`
#### Snippet
```java
    <bean id="smbDeployerRunType" class="jetbrains.buildServer.deployer.server.SmbDeployerRunType"/>
    <bean id="ftpDeployerRunType" class="jetbrains.buildServer.deployer.server.FtpDeployerRunType"/>
    <bean id="cargoDeployerRunType" class="jetbrains.buildServer.deployer.server.cargo.CargoDeployerRunType"/>
    <bean id="sshExecRunType" class="jetbrains.buildServer.deployer.server.SSHExecRunType"/>
    <bean id="deployerSettingsConverter"
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SSHExecRunType'#treeend

*** ** * ** ***

|-----------------------------|---|-----------|
| **SSHExecRunType(...):**    |   | **Bean:** |
| RunTypeRegistry registry    |   | **???**   |
| PluginDescriptor descriptor |   | **???**   |
in `deploy-runner-server/src/main/resources/META-INF/build-server-plugin-deploy-runner.xml`
#### Snippet
```java
    <bean id="ftpDeployerRunType" class="jetbrains.buildServer.deployer.server.FtpDeployerRunType"/>
    <bean id="cargoDeployerRunType" class="jetbrains.buildServer.deployer.server.cargo.CargoDeployerRunType"/>
    <bean id="sshExecRunType" class="jetbrains.buildServer.deployer.server.SSHExecRunType"/>
    <bean id="deployerSettingsConverter"
          class="jetbrains.buildServer.deployer.server.converter.DeployerSettingsConverter"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'DeployerSettingsConverter'#treeend

*** ** * ** ***

|-------------------------------------|---|-----------|
| **DeployerSettingsConverter(...):** |   | **Bean:** |
| SBuildServer server                 |   | **???**   |
in `deploy-runner-server/src/main/resources/META-INF/build-server-plugin-deploy-runner.xml`
#### Snippet
```java
    <bean id="sshExecRunType" class="jetbrains.buildServer.deployer.server.SSHExecRunType"/>
    <bean id="deployerSettingsConverter"
          class="jetbrains.buildServer.deployer.server.converter.DeployerSettingsConverter"/>
</beans>

```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `deploy-runner-agent/src/main/resources/META-INF/build-agent-plugin-deploy-runner.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
    <bean id="sshDeployerRunner" class="jetbrains.buildServer.deployer.agent.ssh.SSHDeployerRunner"/>
    <bean id="sshExecRunner" class="jetbrains.buildServer.deployer.agent.ssh.SSHExecRunner"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `deploy-runner-server/src/main/resources/META-INF/build-server-plugin-deploy-runner.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
    <bean id="scpDeployerRunType" class="jetbrains.buildServer.deployer.server.SSHDeployerRunType"/>
    <bean id="smbDeployerRunType" class="jetbrains.buildServer.deployer.server.SmbDeployerRunType"/>
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHDeployerRunType.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    sb.append("Target: ").append(parameters.get(DeployerRunnerConstants.PARAM_TARGET_URL));
    final String port = parameters.get(SSHRunnerConstants.PARAM_PORT);
    if (StringUtil.isNotEmpty(port)) {
      sb.append('\n').append(" Port: ").append(port);
    }
    final String timeout = parameters.get(SSHRunnerConstants.PARAM_TIMEOUT);
    if (StringUtil.isNotEmpty(timeout)) {
      sb.append('\n').append(" Timeout: ").append(timeout);
    }
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `deploy-runner-agent/src/main/java/jetbrains/buildServer/deployer/agent/ftp/InterruptibleUploadProcess.java`
#### Snippet
```java
              checkResult(myClient.setFileType(detectType(source.getName())));
            }
            inputStream = new FileInputStream(source);
            checkResult(myClient.storeFile(source.getName(), inputStream));
          } finally {
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

## RuleId[id=Deprecation]
### Deprecation
'PARAM_PLAIN_PASSWORD' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
      final Map<String, String> newRunnerParams = new HashMap<String, String>(descriptor.getParameters());

      final String plainPassword = newRunnerParams.get(DeployerRunnerConstants.PARAM_PLAIN_PASSWORD);
      if (plainPassword != null) {
        runnerUpdated = true;
```

### Deprecation
'PARAM_PLAIN_PASSWORD' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
        runnerUpdated = true;
        Loggers.SERVER.debug("Scrambling password for runner [" + runnerType + "-" + descriptor.getName() + "] in [" + buildType.getName() + "]");
        newRunnerParams.remove(DeployerRunnerConstants.PARAM_PLAIN_PASSWORD);
        newRunnerParams.put(DeployerRunnerConstants.PARAM_PASSWORD, plainPassword);
      }
```

### Deprecation
'PARAM_USERNAME' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java

        if (SSHRunnerConstants.SSH_EXEC_RUN_TYPE.equals(runnerType)) {
          final String oldUsername = newRunnerParams.get(SSHRunnerConstants.PARAM_USERNAME);
          final String oldPassword = newRunnerParams.get(SSHRunnerConstants.PARAM_PASSWORD);
          final String oldHost = newRunnerParams.get(SSHRunnerConstants.PARAM_HOST);
```

### Deprecation
'PARAM_PASSWORD' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
        if (SSHRunnerConstants.SSH_EXEC_RUN_TYPE.equals(runnerType)) {
          final String oldUsername = newRunnerParams.get(SSHRunnerConstants.PARAM_USERNAME);
          final String oldPassword = newRunnerParams.get(SSHRunnerConstants.PARAM_PASSWORD);
          final String oldHost = newRunnerParams.get(SSHRunnerConstants.PARAM_HOST);
          if (StringUtil.isNotEmpty(oldUsername)) {
```

### Deprecation
'PARAM_HOST' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
          final String oldUsername = newRunnerParams.get(SSHRunnerConstants.PARAM_USERNAME);
          final String oldPassword = newRunnerParams.get(SSHRunnerConstants.PARAM_PASSWORD);
          final String oldHost = newRunnerParams.get(SSHRunnerConstants.PARAM_HOST);
          if (StringUtil.isNotEmpty(oldUsername)) {
            runnerUpdated = true;
```

### Deprecation
'PARAM_USERNAME' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
          if (StringUtil.isNotEmpty(oldUsername)) {
            runnerUpdated = true;
            newRunnerParams.remove(SSHRunnerConstants.PARAM_USERNAME);
            newRunnerParams.put(DeployerRunnerConstants.PARAM_USERNAME, oldUsername);
          }
```

### Deprecation
'PARAM_PASSWORD' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
          if (StringUtil.isNotEmpty(oldPassword)) {
            runnerUpdated = true;
            newRunnerParams.remove(SSHRunnerConstants.PARAM_PASSWORD);
            newRunnerParams.put(DeployerRunnerConstants.PARAM_PASSWORD, oldPassword);
          }
```

### Deprecation
'PARAM_HOST' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
          if (StringUtil.isNotEmpty(oldHost)) {
            runnerUpdated = true;
            newRunnerParams.remove(SSHRunnerConstants.PARAM_HOST);
            newRunnerParams.put(DeployerRunnerConstants.PARAM_TARGET_URL, oldHost);
          }
```

### Deprecation
'PARAM_DOMAIN' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java

      if (DeployerRunnerConstants.SMB_RUN_TYPE.equals(runnerType)) {
        final String domain = newRunnerParams.get(DeployerRunnerConstants.PARAM_DOMAIN);
        if (StringUtil.isNotEmpty(domain)) {
          runnerUpdated = true;
```

### Deprecation
'PARAM_DOMAIN' is deprecated
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/converter/DeployerSettingsConverter.java`
#### Snippet
```java
        if (StringUtil.isNotEmpty(domain)) {
          runnerUpdated = true;
          newRunnerParams.remove(DeployerRunnerConstants.PARAM_DOMAIN);
          final String username = newRunnerParams.get(DeployerRunnerConstants.PARAM_USERNAME);
          newRunnerParams.put(DeployerRunnerConstants.PARAM_USERNAME, domain + "\\" + username);
```

### Deprecation
'PARAM_DOMAIN' is deprecated
in `deploy-runner-server/src/main/resources/buildServerResources/viewSmbDeployerParams.jsp`
#### Snippet
```java

<div class="parameter">
    Domain: <strong><props:displayValue name="<%=DeployerRunnerConstants.PARAM_DOMAIN%>" emptyValue="empty"/></strong>
</div>

```

## RuleId[id=BusyWait]
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

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/cargo/CargoDeployerRunType.java`
#### Snippet
```java

  @Override
  public String getDescription() {
    return "Runner able to deploy WAR apps to different containers";
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/cargo/CargoDeployerRunType.java`
#### Snippet
```java

  @Override
  public String getDisplayName() {
    return "Container Deployer";
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/FtpDeployerRunType.java`
#### Snippet
```java

  @Override
  public String getDescription() {
    return "Deploys files/directories via FTP";
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/FtpDeployerRunType.java`
#### Snippet
```java

  @Override
  public String getDisplayName() {
    return "FTP Upload";
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHDeployerRunType.java`
#### Snippet
```java

  @Override
  public String getDisplayName() {
    return "SSH Upload";
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHDeployerRunType.java`
#### Snippet
```java

  @Override
  public String getDescription() {
    return "Deploys files/directories via SSH";
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHExecRunType.java`
#### Snippet
```java

  @Override
  public String getDescription() {
    return "Runner able to execute commands over SSH";
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `deploy-runner-server/src/main/java/jetbrains/buildServer/deployer/server/SSHExecRunType.java`
#### Snippet
```java

  @Override
  public String getDisplayName() {
    return "SSH Exec";
  }
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

