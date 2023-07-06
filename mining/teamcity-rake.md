# teamcity-rake 
 
# Bad smells
I found 57 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 9 | true |
| UNUSED_IMPORT | 5 | false |
| SpringBeanConstructorArgInspection | 5 | false |
| JavadocReference | 4 | false |
| DuplicatedCode | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| StringBufferReplaceableByString | 4 | false |
| PointlessNullCheck | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| DataFlowIssue | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| SpringBeanAttributesInspection | 2 | false |
| JavadocDeclaration | 1 | false |
| CommentedOutCode | 1 | false |
| RegExpRedundantEscape | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| RedundantTypeArguments | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/Constants.java`
#### Snippet
```java
  static final String CONF_RBENV_RUBIES_LIST = CONF_PARAMETER_PREFIX + "versions.list";
  static final String RBENV_ROOT_ENV_VARIABLE = "RBENV_ROOT";
  static final String RBENV_VERSION_ENV_VARIABLE = "RBENV_VERSION";
}

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/Constants.java`
#### Snippet
```java
  static final String CONF_RBENV_RUBIES_LIST = CONF_PARAMETER_PREFIX + "versions.list";
  static final String RBENV_ROOT_ENV_VARIABLE = "RBENV_ROOT";
  static final String RBENV_VERSION_ENV_VARIABLE = "RBENV_VERSION";
}

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/Constants.java`
#### Snippet
```java
public interface Constants {
  static final String CONF_PARAMETER_PREFIX = "rbenv.";
  static final String CONF_RBENV_RUBIES_LIST = CONF_PARAMETER_PREFIX + "versions.list";
  static final String RBENV_ROOT_ENV_VARIABLE = "RBENV_ROOT";
  static final String RBENV_VERSION_ENV_VARIABLE = "RBENV_VERSION";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/Constants.java`
#### Snippet
```java
public interface Constants {
  static final String CONF_PARAMETER_PREFIX = "rbenv.";
  static final String CONF_RBENV_RUBIES_LIST = CONF_PARAMETER_PREFIX + "versions.list";
  static final String RBENV_ROOT_ENV_VARIABLE = "RBENV_ROOT";
  static final String RBENV_VERSION_ENV_VARIABLE = "RBENV_VERSION";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/Constants.java`
#### Snippet
```java
 */
public interface Constants {
  static final String CONF_PARAMETER_PREFIX = "rbenv.";
  static final String CONF_RBENV_RUBIES_LIST = CONF_PARAMETER_PREFIX + "versions.list";
  static final String RBENV_ROOT_ENV_VARIABLE = "RBENV_ROOT";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/Constants.java`
#### Snippet
```java
 */
public interface Constants {
  static final String CONF_PARAMETER_PREFIX = "rbenv.";
  static final String CONF_RBENV_RUBIES_LIST = CONF_PARAMETER_PREFIX + "versions.list";
  static final String RBENV_ROOT_ENV_VARIABLE = "RBENV_ROOT";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/Constants.java`
#### Snippet
```java
  static final String CONF_PARAMETER_PREFIX = "rbenv.";
  static final String CONF_RBENV_RUBIES_LIST = CONF_PARAMETER_PREFIX + "versions.list";
  static final String RBENV_ROOT_ENV_VARIABLE = "RBENV_ROOT";
  static final String RBENV_VERSION_ENV_VARIABLE = "RBENV_VERSION";
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/Constants.java`
#### Snippet
```java
  static final String CONF_PARAMETER_PREFIX = "rbenv.";
  static final String CONF_RBENV_RUBIES_LIST = CONF_PARAMETER_PREFIX + "versions.list";
  static final String RBENV_ROOT_ENV_VARIABLE = "RBENV_ROOT";
  static final String RBENV_VERSION_ENV_VARIABLE = "RBENV_VERSION";
}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `rake-runner-common/src/jetbrains/buildServer/feature/RubyEnvConfiguratorConfiguration.java`
#### Snippet
```java
public class RubyEnvConfiguratorConfiguration {

  public static enum Type {
    INTERPRETER_PATH, // null
    RVM, // "manual"
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `executablePath`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RunnerUtil.java`
#### Snippet
```java
   * @param workingDir     Process working dir
   * @param environment    additional environment for process
   * @param executablePath Path to executable file
   * @param arguments      Process commandLine
   * @return process builder
```

### JavadocReference
Cannot resolve symbol `arguments`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RunnerUtil.java`
#### Snippet
```java
   * @param environment    additional environment for process
   * @param executablePath Path to executable file
   * @param arguments      Process commandLine
   * @return process builder
   */
```

### JavadocReference
Cannot resolve symbol `buildParameters`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TestUnitUtil.java`
#### Snippet
```java
   *
   * @param scriptPath      Path of given script
   * @param buildParameters Build params
   * @return Full path of given script
   * @throws jetbrains.buildServer.agent.rakerunner.RakeTasksBuildService.MyBuildFailureException
```

### JavadocReference
Cannot resolve symbol `jetbrains.buildServer.RunBuildException`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TestUnitUtil.java`
#### Snippet
```java
   * @throws jetbrains.buildServer.agent.rakerunner.RakeTasksBuildService.MyBuildFailureException
   *          If script will not be found
   * @throws jetbrains.buildServer.RunBuildException
   *          Other error
   */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `rubySdksRoot.list()` might be null
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
    final File rubySdksRoot = new File(rubySdksRootPath);

    final HashSet<String> distSet = new HashSet<String>(Arrays.asList(rubySdksRoot.list()));
    if (distSet.isEmpty()) {
      return SharedRVMUtil.RubyDistToGemsetTable.emptyTable();
```

### DataFlowIssue
Dereference of `candidateGems` may produce `NullPointerException`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RubySDKUtil.java`
#### Snippet
```java

      // find gem with highest version or our forced version
      for (File gem : candidateGems) {
        final String dirtyVersion = gem.getName().substring(gemNamePrefix.length());
        // TODO: will not work with bundler git gems!
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.agent.*;`
in `rake-runner-agent/src/jetbrains/buildServer/agent/feature/RubyEnvConfiguratorService.java`
#### Snippet
```java
import java.util.Map;
import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.*;
import jetbrains.buildServer.agent.rakerunner.ModifiableRunnerContext;
import jetbrains.buildServer.agent.rakerunner.RakeTasksBuildService;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.agent.*;`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/AgentRbEnvDetector.java`
#### Snippet
```java
import java.util.Map;
import jetbrains.buildServer.ExtensionHolder;
import jetbrains.buildServer.agent.*;
import jetbrains.buildServer.agent.config.AgentParametersSupplier;
import jetbrains.buildServer.agent.ruby.ConfigurationApplier;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.agent.*;`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/AgentRVMDetector.java`
#### Snippet
```java
import java.util.Map;
import jetbrains.buildServer.ExtensionHolder;
import jetbrains.buildServer.agent.*;
import jetbrains.buildServer.agent.config.AgentParametersSupplier;
import jetbrains.buildServer.agent.ruby.ConfigurationApplier;
```

### UNUSED_IMPORT
Unused import `import java.util.LinkedList;`
in `rake-runner-server/src/jetbrains/buildServer/feature/RubyEnvConfiguratorBuildFeature.java`
#### Snippet
```java
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `rake-runner-server/src/jetbrains/buildServer/feature/RubyEnvConfiguratorBuildFeature.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jetbrains.buildServer.requirements.Requirement;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param name` tag description is missing
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java

  /**
   * @param name
   * @return null when cannot convert to properly name
   */
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (6 lines)
in `rake-runner-server/src/jetbrains/buildServer/runner/rakerunner/RakeRunnerRunType.java`
#### Snippet
```java
      final RakeRunnerUtils.RubyConfigMode mode = RakeRunnerUtils.getRubyInterpreterConfigMode(properties);
      switch (mode) {
        //case INTERPRETER_PATH: {
        //  if (StringUtil.isEmpty(RakeRunnerUtils.getRubySdkPath(properties))) {
        //    ret.add(new InvalidProperty(RakeRunnerConstants.SERVER_UI_RUBY_INTERPRETER_PATH, "Interpeter path must be specified."));
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `rake-runner-agent/src/org/jetbrains/plugins/ruby/rvm/SharedRVMUtil.java`
#### Snippet
```java

    // Ignore patchversion (match ruby-2.1.0-p0 to ruby-2.1.0)
    final Matcher matcher = Pattern.compile("(.*)\\-p([0-9]+)").matcher(sdkRef);
    if (matcher.matches()) {
      // sdkRef have patchversion
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/InternalRubySdkUtil.java`
#### Snippet
```java
    throws RakeTasksBuildService.MyBuildFailureException {
    final String msg = "Ruby interpreter '"
                       + String.valueOf(rubyInterpreterPath)
                       + "' doesn't exist or isn't a file or isn't a valid RVM interpreter name.";
    throw new RakeTasksBuildService.MyBuildFailureException(msg);
```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'RakeRunnerRunType'#treeend

*** ** * ** ***

|---------------------------------|---|-----------|
| **RakeRunnerRunType(...):**     |   | **Bean:** |
| PluginDescriptor descriptor     |   | **???**   |
| RunTypeRegistry runTypeRegistry |   | **???**   |
in `rake-runner-server/src/META-INF/build-server-plugin-rakerunner.xml`
#### Snippet
```java
           default-autowire="constructor">

  <bean id="rakeRunnerRunType" class="jetbrains.buildServer.runner.rakerunner.RakeRunnerRunType"/>
  <bean class="jetbrains.buildServer.feature.RubyEnvConfiguratorBuildFeature"/>
  <bean class="jetbrains.buildServer.runner.rakerunner.RakeRunnerDiscoveryExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RubyEnvConfiguratorBuildFeature'#treeend

*** ** * ** ***

|-------------------------------------------|---|-----------|
| **RubyEnvConfiguratorBuildFeature(...):** |   | **Bean:** |
| PluginDescriptor descriptor               |   | **???**   |
in `rake-runner-server/src/META-INF/build-server-plugin-rakerunner.xml`
#### Snippet
```java

  <bean id="rakeRunnerRunType" class="jetbrains.buildServer.runner.rakerunner.RakeRunnerRunType"/>
  <bean class="jetbrains.buildServer.feature.RubyEnvConfiguratorBuildFeature"/>
  <bean class="jetbrains.buildServer.runner.rakerunner.RakeRunnerDiscoveryExtension"/>
  <bean class="jetbrains.buildServer.feature.RubyEnvConfiguratorDiscoveryExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AgentRVMDetector'#treeend

*** ** * ** ***

|------------------------------------------------------|---|-------------------------------------|
| **AgentRVMDetector(...):**                           |   | **Bean:**                           |
| RVMDetector detector                                 |   | Autowired: rvmDetector(RVMDetector) |
| EventDispatcher\<AgentLifeCycleListener\> dispatcher |   | **???**                             |
| BuildAgentConfiguration buildAgentConfiguration      |   | **???**                             |
| ExtensionHolder extensionHolder                      |   | **???**                             |
in `rake-runner-agent/src/META-INF/build-agent-plugin-rakerunner.xml`
#### Snippet
```java
        factory-method="createRVMDetector"/>
  <bean id="agentRVMDetector"
        class="jetbrains.buildServer.agent.ruby.rvm.detector.AgentRVMDetector"/>
  <bean id="rvmPathSettings"
        class="org.jetbrains.plugins.ruby.rvm.RVMPathsSettings"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AgentRbEnvDetector'#treeend

*** ** * ** ***

|------------------------------------------------------|---|-----------------------------------------|
| **AgentRbEnvDetector(...):**                         |   | **Bean:**                               |
| RbEnvDetector detector                               |   | Autowired: rbenvDetector(RbEnvDetector) |
| EventDispatcher\<AgentLifeCycleListener\> dispatcher |   | **???**                                 |
| BuildAgentConfiguration buildAgentConfiguration      |   | **???**                                 |
| ExtensionHolder extensionHolder                      |   | **???**                                 |
in `rake-runner-agent/src/META-INF/build-agent-plugin-rakerunner.xml`
#### Snippet
```java
        factory-method="createDetector"/>
  <bean id="agentRbenvDetector"
        class="jetbrains.buildServer.agent.ruby.rbenv.detector.AgentRbEnvDetector"/>
  <bean id="rbenvPathSettings"
        class="jetbrains.buildServer.agent.ruby.rbenv.RbEnvPathsSettings"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RubyEnvConfiguratorService'#treeend

*** ** * ** ***

|------------------------------------------------------|---|-----------|
| **RubyEnvConfiguratorService(...):**                 |   | **Bean:** |
| EventDispatcher\<AgentLifeCycleListener\> dispatcher |   | **???**   |
in `rake-runner-agent/src/META-INF/build-agent-plugin-rakerunner.xml`
#### Snippet
```java
  <!-- Ruby Environment Configurator  feature -->
  <bean id="rubyRuntimeContextFeature"
        class="jetbrains.buildServer.agent.feature.RubyEnvConfiguratorService"/>

  <!-- Path patcher -->
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/RakeTasksBuildService.java`
#### Snippet
```java
      final StringBuilder buff = new StringBuilder();

      final String userSpecOpts = runParams.get(SERVER_UI_RAKE_RSPEC_OPTS_PROPERTY);
      if (!StringUtil.isEmpty(userSpecOpts)) {
        buff.append(userSpecOpts.trim()).append(' ');
      }
      buff.append(RSPEC_RUNNER_OPTIONS_REQUIRE_KEY).append(' ');
      buff.append(RSPEC_RUNNER_OPTIONS_FORMATTER_PATH).append(' ');
```

### DuplicatedCode
Duplicated code
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/SharedParamsType.java`
#### Snippet
```java
      if ("system".equals(version)) {
        final EnvironmentPatchableMap env = new EnvironmentPatchableMap(context.getBuildParameters().getEnvironmentVariables());
        env.put(RBENV_VERSION_ENV_VARIABLE, version);
        final File executable = findSystemInterpreterExecutable(env);
        return new RubySdkImpl(executable, true);
      } else {
        if (!rbEnv.isVersionInstalled(version)) {
          throw new RakeTasksBuildService.MyBuildFailureException(
            "Specified Ruby interpreter version '" + version + "' isn't installed in rbenv");
        }
        return new RbEnvRubySdk(rbEnv.getInterpreterHome(version), version, rbEnv);
      }
```

### DuplicatedCode
Duplicated code
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/AgentRbEnvDetector.java`
#### Snippet
```java
      myDetector.patchBuildAgentConfiguration(new ConfigurationApplier() {
        @Override
        public void addEnvironmentVariable(String key, String value) {
          parameters.put(Constants.ENV_PREFIX + key, value);
        }

        @Override
        public void addConfigurationParameter(String key, String value) {
          parameters.put(key, value);
        }
      }, installedRbEnv);

      return parameters;
```

### DuplicatedCode
Duplicated code
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
      List<String> split = StringUtil.split(stdout, true, '\n', '\r');
      split = CollectionsUtil.convertCollection(split, new Converter<String, String>() {
        public String createFrom(@NotNull final String source) {
          return source.trim();
        }
      });
      split = CollectionsUtil.filterCollection(split, new Filter<String>() {
        public boolean accept(@NotNull final String data) {
          return !data.contains(" ");
        }
      });
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `rake-runner-server/src/jetbrains/buildServer/runner/rakerunner/RakeRunnerRunType.java`
#### Snippet
```java
      final Collection<InvalidProperty> ret = new ArrayList<InvalidProperty>(1);
      final RakeRunnerUtils.RubyConfigMode mode = RakeRunnerUtils.getRubyInterpreterConfigMode(properties);
      switch (mode) {
        //case INTERPRETER_PATH: {
        //  if (StringUtil.isEmpty(RakeRunnerUtils.getRubySdkPath(properties))) {
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `rake-runner-server/src/META-INF/build-server-plugin-rakerunner.xml`
#### Snippet
```java
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">

  <bean id="rakeRunnerRunType" class="jetbrains.buildServer.runner.rakerunner.RakeRunnerRunType"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `rake-runner-agent/src/META-INF/build-agent-plugin-rakerunner.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <!-- Rake Runner -->
  <bean id="rakeBuildServiceFactory"
```

## RuleId[id=SpringBeanAttributesInspection]
### SpringBeanAttributesInspection
Exactly one of 'class' or 'factory-bean' is required
in `rake-runner-agent/src/META-INF/build-agent-plugin-rakerunner.xml`
#### Snippet
```java
  <bean id="rvmDetectorFactory"
        class="jetbrains.buildServer.agent.ruby.rvm.detector.RVMDetectorFactory"/>
  <bean id="rvmDetector"
        class="jetbrains.buildServer.agent.ruby.rvm.detector.RVMDetector"
        factory-bean="rvmDetectorFactory"
```

### SpringBeanAttributesInspection
Exactly one of 'class' or 'factory-bean' is required
in `rake-runner-agent/src/META-INF/build-agent-plugin-rakerunner.xml`
#### Snippet
```java
  <bean id="rbenvDetectorFactory"
        class="jetbrains.buildServer.agent.ruby.rbenv.detector.RbEnvDetectorFactory"/>
  <bean id="rbenvDetector"
        class="jetbrains.buildServer.agent.ruby.rbenv.detector.RbEnvDetector"
        factory-bean="rbenvDetectorFactory"
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
    @Nullable
    @Override
    protected Map<Pattern, String> createValue() {
      final Map<Pattern, String> map = new LinkedHashMap<Pattern, String>();
      // References from all known repositories ('rvm list known')
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
    @Nullable
    @Override
    protected SortedSet<String> createValue() {
      final String stdout = executeCommandLine(getExecutablePath(), "list", "strings");
      List<String> split = StringUtil.split(stdout, true, '\n', '\r');
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
    @Nullable
    @Override
    protected String createValue() {
      // Also in ~/.rvm/config/alias
      final String stdout = executeCommandLine(getExecutablePath(), "list", "default", "string");
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/InstalledRbEnv.java`
#### Snippet
```java
    @Nullable
    @Override
    protected File createValue() {
      final String root = executeCommandLine(getExecutablePath(), "root");
      final List<String> split = StringUtil.split(root, true, '\n', '\r');
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/impl/RVMRCBasedRubySdkImpl.java`
#### Snippet
```java
                          @NotNull final String workingDirectory,
                          @Nullable final Map<String, String> environment) {
      StringBuilder sb = new StringBuilder();
      sb.append("cd ").append(workingDirectory).append('\n');
      sb.append(script);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/impl/RVMRCBasedRubySdkImpl.java`
#### Snippet
```java

      if (LOG.isDebugEnabled()) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t").append("Configuring system interpreter with .rvmrc");
        sb.append("\n\t").append("PathToRVMRCFolder = ").append(pathToRVMRCFolder);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/impl/RVMRCBasedRubySdkImpl.java`
#### Snippet
```java

      if (LOG.isDebugEnabled()) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t").append("Configuring rvm interpreter with .rvmrc");
        sb.append("\n\t").append("PathToRVMRCFolder = ").append(pathToRVMRCFolder);
```

### StringBufferReplaceableByString
`StringBuilder buff` can be replaced with 'String'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/BundlerUtil.java`
#### Snippet
```java
  private static String findGemFolderForSdk(@NotNull final RubySdk sdk,
                                            @NotNull final String bundlePath) {
    final StringBuilder buff = new StringBuilder(bundlePath);
    buff.append(File.separator).append(sdk.isJRuby() ? "jruby" : "ruby");
    buff.append(File.separator).append(sdk.isRuby19() ? "1.9" : "1.8");
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/impl/RVMDetectorForUNIX.java`
#### Snippet
```java

    if (specialPath != null) {
      if (localPath != null && specialPath.equals(localPath)) {
        return new InstalledRVM(localPath, InstalledRVM.Type.Local);
      } else if (globalPath != null && specialPath.equals(globalPath)) {
```

### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/impl/RVMDetectorForUNIX.java`
#### Snippet
```java
      if (localPath != null && specialPath.equals(localPath)) {
        return new InstalledRVM(localPath, InstalledRVM.Type.Local);
      } else if (globalPath != null && specialPath.equals(globalPath)) {
        return new InstalledRVM(globalPath, InstalledRVM.Type.Global);
      } else {
```

### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java

    if (special != null) {
      if (local != null && special.equals(local)) {
        return new InstalledRbEnv(local, InstalledRbEnv.Type.Local);
      } else if (global != null && special.equals(global)) {
```

### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java
      if (local != null && special.equals(local)) {
        return new InstalledRbEnv(local, InstalledRbEnv.Type.Local);
      } else if (global != null && special.equals(global)) {
        return new InstalledRbEnv(global, InstalledRbEnv.Type.Global);
      } else {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/ShellScriptRunnerUtil.java`
#### Snippet
```java
      process.waitFor();
    } catch (InterruptedException e) {
      LOG.error("Failed to execute chmod " + perms + " " + script.getAbsolutePath() + ", error: " + e.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/RVMCommandLineProcessor.java`
#### Snippet
```java
      process.waitFor();
    } catch (InterruptedException e) {
      Loggers.AGENT.warn("Failed to execute chmod " + perms + " " + script.getAbsolutePath() + ", error: " + e.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/RVMCommandLineProcessor.java`
#### Snippet
```java
      setPermissions(script, SCRIPT_PERMISSIONS); // script needs to be made executable for all (chmod a+x)
    } catch (IOException e) {
      throw new RunBuildException("Failed to create temp file, error: " + e.toString());
    }
    return script;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/impl/RubySdkImpl.java`
#### Snippet
```java
        executableName.append(".exe");
      }
      myExecutablePath = new File(myHome, "bin" + File.separator + executableName.toString());
    }
  }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/util/RVMUtil.java`
#### Snippet
```java
  @NotNull
  public static Map<Pattern, String> convertListKnownIntoResolvingMap(@NotNull final String stdout) {
    final List<String> list = CollectionsUtil.convertAndFilterNulls(Arrays.asList(stdout.split("\n")), new Converter<String, String>() {
      public String createFrom(@NotNull final String source) {
        String trim = source.trim();
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `rake-runner-agent/src/org/jetbrains/plugins/ruby/rvm/SharedRVMUtil.java`
#### Snippet
```java

    public static RubyDistToGemsetTable emptyTable() {
      return new RubyDistToGemsetTable(Collections.<String, List<String>>emptyMap());
    }

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/scripting/ProcessBasedRubyScriptRunner.java`
#### Snippet
```java
    } finally {
      if (scriptFile != null && scriptFile.exists()) {
        scriptFile.delete();
      }
    }
```

