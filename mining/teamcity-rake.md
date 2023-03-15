# teamcity-rake 
 
# Bad smells
I found 142 bad smells with 36 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 41 | false |
| UtilityClassWithoutPrivateConstructor | 16 | true |
| BoundedWildcard | 10 | false |
| UnnecessaryModifier | 9 | true |
| FieldMayBeStatic | 7 | false |
| RedundantSuppression | 6 | false |
| MissortedModifiers | 5 | false |
| UNUSED_IMPORT | 5 | false |
| AssignmentToStaticFieldFromInstanceMethod | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| StringBufferReplaceableByString | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| EnumSwitchStatementWhichMissesCases | 3 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| UnnecessaryFullyQualifiedName | 3 | false |
| RedundantFieldInitialization | 3 | false |
| DataFlowIssue | 2 | false |
| UnnecessaryBoxing | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| CommentedOutCode | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RegExpRedundantEscape | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| IgnoreResultOfCall | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| Java8MapApi | 1 | false |
| Convert2Lambda | 1 | false |
| EmptyMethod | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (configuration.getType()) { case RVM: { // sdk name if (StringUtil.isEm...` statement on enum type 'jetbrains.buildServer.feature.RubyEnvConfiguratorConfiguration.Type' misses cases: 'INTERPRETER_PATH', 'RVM_RUBY_VERSION', ...
in `rake-runner-agent/src/jetbrains/buildServer/agent/feature/RubyEnvConfiguratorService.java`
#### Snippet
```java
  private void validateConfiguratorParams(@NotNull final RubyEnvConfiguratorConfiguration configuration)
    throws RakeTasksBuildService.InvalidConfigurationException {
    switch (configuration.getType()) {
      case RVM: {
        // sdk name
        if (StringUtil.isEmpty(configuration.getRVMSdkName())) {
          throw new RakeTasksBuildService.InvalidConfigurationException(
            "RVM interpreter name cannot be empty. If you want to use system ruby interpreter please enter 'system'.", true);
        }
        break;
      }
      case RVMRC: {
        String rvmrcFilePath = StringUtil.emptyIfNull(configuration.getRVMRCFilePath());
        if (!StringUtil.isEmptyOrSpaces(rvmrcFilePath) &&
            !PathUtil.getFileName(rvmrcFilePath).equals(".rvmrc")) {
          throw new RakeTasksBuildService.InvalidConfigurationException(
            "RVMRC file name must be '.rvmrc'. RVM does not support other names", false);
        }
        break;
      }
      case RBENV: {
        if (StringUtil.isEmpty(configuration.getRbEnvVersion())) {
          throw new RakeTasksBuildService.InvalidConfigurationException(
            "rbenv interpreter name cannot be empty. If you want to use system ruby interpreter please enter 'system'.", true);
        }
        break;
      }
    }
  }

```

### EnumSwitchStatementWhichMissesCases
`switch (mode) { //case INTERPRETER_PATH: { // if (StringUtil.isEmpty(RakeRunnerUtil...` statement on enum type 'jetbrains.buildServer.rakerunner.RakeRunnerUtils.RubyConfigMode' misses cases: 'DEFAULT', and 'INTERPRETER_PATH'
in `rake-runner-server/src/jetbrains/buildServer/runner/rakerunner/RakeRunnerRunType.java`
#### Snippet
```java
      final Collection<InvalidProperty> ret = new ArrayList<InvalidProperty>(1);
      final RakeRunnerUtils.RubyConfigMode mode = RakeRunnerUtils.getRubyInterpreterConfigMode(properties);
      switch (mode) {
        //case INTERPRETER_PATH: {
        //  if (StringUtil.isEmpty(RakeRunnerUtils.getRubySdkPath(properties))) {
        //    ret.add(new InvalidProperty(RakeRunnerConstants.SERVER_UI_RUBY_INTERPRETER_PATH, "Interpeter path must be specified."));
        //  }
        //  break;
        //}
        case RVM: {
          if (StringUtil.isEmpty(RakeRunnerUtils.getRVMSdkName(properties))) {
            ret.add(new InvalidProperty(RakeRunnerConstants.SERVER_UI_RUBY_RVM_SDK_NAME, "The interpeter name must be specified."));
          }
          break;
        }
      }
      resetExtraProperties(properties);
      return ret;
```

### EnumSwitchStatementWhichMissesCases
`switch (configuration.getType()) { case RVM: { if (StringUtil.isEmptyOrSpaces(conf...` statement on enum type 'jetbrains.buildServer.feature.RubyEnvConfiguratorConfiguration.Type' misses cases: 'INTERPRETER_PATH', 'RVM_RUBY_VERSION', ...
in `rake-runner-server/src/jetbrains/buildServer/feature/RubyEnvConfiguratorBuildFeature.java`
#### Snippet
```java
      }
      final RubyEnvConfiguratorConfiguration configuration = new RubyEnvConfiguratorConfiguration(properties);
      switch (configuration.getType()) {
        case RVM: {
          if (StringUtil.isEmptyOrSpaces(configuration.getRVMSdkName())) {
            ret.add(new InvalidProperty(RubyEnvConfiguratorConstants.UI_RVM_SDK_NAME_KEY,
                                        "RVM interpreter name cannot be empty. If you want to use system ruby interpreter please enter 'system'."));
          }
          break;
        }
        case RVMRC: {
          String rvmrcFilePath = StringUtil.emptyIfNull(configuration.getRVMRCFilePath());
          if (!StringUtil.isEmptyOrSpaces(rvmrcFilePath) &&
              !StringUtil.hasParameterReferences(rvmrcFilePath) &&
              !PathUtil.getFileName(rvmrcFilePath).equals(".rvmrc")) {
            ret.add(new InvalidProperty(RubyEnvConfiguratorConstants.UI_RVM_RVMRC_PATH_KEY,
                                        "file name must be '.rvmrc'."));
          }
          break;
        }
        case RBENV: {
          if (StringUtil.isEmptyOrSpaces(configuration.getRbEnvVersion())) {
            ret.add(new InvalidProperty(RubyEnvConfiguratorConstants.UI_RBENV_VERSION_NAME_KEY,
                                        "rbenv interpreter name cannot be empty."));
          }
          break;
        }
      }

      resetExtraProperties(properties, configuration);
```

## RuleId[id=UnnecessaryModifier]
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
Modifier `static` is redundant for inner enums
in `rake-runner-common/src/jetbrains/buildServer/feature/RubyEnvConfiguratorConfiguration.java`
#### Snippet
```java
public class RubyEnvConfiguratorConfiguration {

  public static enum Type {
    INTERPRETER_PATH, // null
    RVM, // "manual"
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `CUCUMBER_RUNNER_OPTIONS_FORMAT_KEY` may be 'static'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/RakeTasksBuildService.java`
#### Snippet
```java

  private final String CUCUMBER_RUNNER_OPTIONS_EXPAND_KEY = "--expand";
  private final String CUCUMBER_RUNNER_OPTIONS_FORMAT_KEY = "--format";
  private final String CUCUMBER_RUNNER_OPTIONS_FORMAT_CLASS = "Teamcity::Cucumber::Formatter";

```

### FieldMayBeStatic
Field `RSPEC_RUNNER_OPTIONS_FORMATTER_CLASS` may be 'static'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/RakeTasksBuildService.java`
#### Snippet
```java
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_PATH = "teamcity/spec/runner/formatter/teamcity/formatter";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_KEY = "--format";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_CLASS = "Spec::Runner::Formatter::TeamcityFormatter";

  private final String CUCUMBER_RUNNER_OPTIONS_EXPAND_KEY = "--expand";
```

### FieldMayBeStatic
Field `CUCUMBER_RUNNER_OPTIONS_FORMAT_CLASS` may be 'static'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/RakeTasksBuildService.java`
#### Snippet
```java
  private final String CUCUMBER_RUNNER_OPTIONS_EXPAND_KEY = "--expand";
  private final String CUCUMBER_RUNNER_OPTIONS_FORMAT_KEY = "--format";
  private final String CUCUMBER_RUNNER_OPTIONS_FORMAT_CLASS = "Teamcity::Cucumber::Formatter";


```

### FieldMayBeStatic
Field `RSPEC_RUNNER_OPTIONS_FORMATTER_KEY` may be 'static'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/RakeTasksBuildService.java`
#### Snippet
```java
  private final String RSPEC_RUNNER_OPTIONS_REQUIRE_KEY = "--require";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_PATH = "teamcity/spec/runner/formatter/teamcity/formatter";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_KEY = "--format";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_CLASS = "Spec::Runner::Formatter::TeamcityFormatter";

```

### FieldMayBeStatic
Field `RSPEC_RUNNER_OPTIONS_REQUIRE_KEY` may be 'static'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/RakeTasksBuildService.java`
#### Snippet
```java
public class RakeTasksBuildService extends BuildServiceAdapter implements RakeRunnerConstants {
  private final Set<File> myFilesToDelete = new HashSet<File>();
  private final String RSPEC_RUNNER_OPTIONS_REQUIRE_KEY = "--require";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_PATH = "teamcity/spec/runner/formatter/teamcity/formatter";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_KEY = "--format";
```

### FieldMayBeStatic
Field `CUCUMBER_RUNNER_OPTIONS_EXPAND_KEY` may be 'static'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/RakeTasksBuildService.java`
#### Snippet
```java
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_CLASS = "Spec::Runner::Formatter::TeamcityFormatter";

  private final String CUCUMBER_RUNNER_OPTIONS_EXPAND_KEY = "--expand";
  private final String CUCUMBER_RUNNER_OPTIONS_FORMAT_KEY = "--format";
  private final String CUCUMBER_RUNNER_OPTIONS_FORMAT_CLASS = "Teamcity::Cucumber::Formatter";
```

### FieldMayBeStatic
Field `RSPEC_RUNNER_OPTIONS_FORMATTER_PATH` may be 'static'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/RakeTasksBuildService.java`
#### Snippet
```java
  private final Set<File> myFilesToDelete = new HashSet<File>();
  private final String RSPEC_RUNNER_OPTIONS_REQUIRE_KEY = "--require";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_PATH = "teamcity/spec/runner/formatter/teamcity/formatter";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_KEY = "--format";
  private final String RSPEC_RUNNER_OPTIONS_FORMATTER_CLASS = "Spec::Runner::Formatter::TeamcityFormatter";
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `RubyProjectSourcesUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RubyProjectSourcesUtil.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class RubyProjectSourcesUtil {
  private static final Logger LOG = Logger.getInstance(RubyProjectSourcesUtil.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `RunnerUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RunnerUtil.java`
#### Snippet
```java
 * @author Vladislav.Rassokhin
 */
public class RunnerUtil {
  private static final Logger LOG = Logger.getInstance(RunnerUtil.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `ShellScriptRunnerUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/ShellScriptRunnerUtil.java`
#### Snippet
```java
 * @author Vladislav.Rassokhin
 */
public class ShellScriptRunnerUtil {
  private static final Logger LOG = Logger.getInstance(ShellScriptRunnerUtil.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `FileUtil2` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/FileUtil2.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class FileUtil2 {
  /**
   * @param path Path to check
```

### UtilityClassWithoutPrivateConstructor
Class `TestUnitUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TestUnitUtil.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class TestUnitUtil {
  @NonNls
  public static final String AUTORUNNER_SCRIPT_PATH = "test/unit/autorunner.rb";
```

### UtilityClassWithoutPrivateConstructor
Class `SdkUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/SdkUtil.java`
#### Snippet
```java
 * @author Vladislav.Rassokhin
 */
public class SdkUtil {

  public static boolean isRvmSdk(@NotNull final RubySdk sdk) {
```

### UtilityClassWithoutPrivateConstructor
Class `EnvUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/EnvUtil.java`
#### Snippet
```java
 * @author Vladislav.Rassokhin
 */
public class EnvUtil {
  private static final Set<String> IGNORING_ENV_KEYS = CollectionsUtil.setOf("PWD", "OLDPWD");

```

### UtilityClassWithoutPrivateConstructor
Class `RVMUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/util/RVMUtil.java`
#### Snippet
```java
 * @since 8.1
 */
public class RVMUtil {
  @NotNull
  public static Map<Pattern, String> convertListKnownIntoResolvingMap(@NotNull final String stdout) {
```

### UtilityClassWithoutPrivateConstructor
Class `RakeRunnerUtils` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-common/src/jetbrains/buildServer/rakerunner/RakeRunnerUtils.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class RakeRunnerUtils {
  public enum RubyConfigMode {
    DEFAULT("default"),
```

### UtilityClassWithoutPrivateConstructor
Class `BundlerUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/BundlerUtil.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class BundlerUtil {
  private static final String BUNDLER_GEM_NAME = "bundler";
  static final String BUNDLE_BIN_PATH_ENV_VAR = "BUNDLE_BIN_PATH";
```

### UtilityClassWithoutPrivateConstructor
Class `RVMInfoUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/util/RVMInfoUtil.java`
#### Snippet
```java
 * @author Vladislav.Rassokhin
 */
public class RVMInfoUtil {

  public static final Pattern INFO_LINE_PATTERN = Pattern.compile("^[ \\t]*(\\w+):[ \\t]*\"(.*)\"[ \\t]*$");
```

### UtilityClassWithoutPrivateConstructor
Class `TextUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TextUtil.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class TextUtil {
  private static final Pattern EOL_SPLIT_PATTERN = Pattern.compile(" *(\r|\n|\r\n)+ *");

```

### UtilityClassWithoutPrivateConstructor
Class `RVMSupportUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/org/jetbrains/plugins/ruby/rvm/RVMSupportUtil.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class RVMSupportUtil {
  public static final String RVM_SYSTEM_INTERPRETER = "system";

```

### UtilityClassWithoutPrivateConstructor
Class `InternalRubySdkUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/InternalRubySdkUtil.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class InternalRubySdkUtil {
  public static final String RUBY_VERSION_SCRIPT = "print RUBY_VERSION";
  public static final String RUBY_PLATFORM_SCRIPT = "print RUBY_PLATFORM";
```

### UtilityClassWithoutPrivateConstructor
Class `RubySDKUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RubySDKUtil.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class RubySDKUtil {

  private static final Pattern VERSION_PATTERN = Pattern.compile("([0-9]+(\\.[0-9A-z]+)*)");
```

### UtilityClassWithoutPrivateConstructor
Class `OSUtil` has only 'static' members, and lacks a 'private' constructor
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/OSUtil.java`
#### Snippet
```java
 * @author Roman.Chernyatchik
 */
public class OSUtil {
  public static String INDEPENDENT_PATH_SEPARATOR = "/";

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

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourInstance` from instance context
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/AgentRbEnvDetector.java`
#### Snippet
```java
    dispatcher.addListener(new Listener());
    extensionHolder.registerExtension(AgentParametersSupplier.class, getClass().getName(), new Snapshot(buildAgentConfiguration));
    ourInstance = this;
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourInstance` from instance context
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/AgentRVMDetector.java`
#### Snippet
```java
    dispatcher.addListener(new Listener());
    extensionHolder.registerExtension(AgentParametersSupplier.class, getClass().getName(), new Snapshot(buildAgentConfiguration));
    ourInstance = this;
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourInstance` from instance context
in `rake-runner-agent/src/org/jetbrains/plugins/ruby/rvm/RVMPathsSettings.java`
#### Snippet
```java
  public RVMPathsSettings(@NotNull final RVMDetector detector) {
    myDetector = detector;
    ourInstance = this;
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourInstance` from instance context
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/RbEnvPathsSettings.java`
#### Snippet
```java
  public RbEnvPathsSettings(@NotNull final RbEnvDetector detector) {
    myDetector = detector;
    ourInstance = this;
  }

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

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `modified.keySet()` may be replaced with 'entrySet()' iteration
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/EnvUtil.java`
#### Snippet
```java
                                                    @NotNull final Collection<String> restricted) {
    final HashMap<String, String> map = new HashMap<String, String>();
    for (String key : modified.keySet()) {
      final String ov = original.get(key);
      if (restricted.contains(key)) {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TextUtil.java`
#### Snippet
```java
  @NotNull
  public static String removeNewLine(@NotNull String s) {
    if (s.length() == 0) return s;
    if (s.charAt(s.length() - 1) == '\n') {
      s = s.substring(0, s.length() - 1);
```

### SizeReplaceableByIsEmpty
`s.trim().length() == 0` can be replaced with 's.trim().isEmpty()'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TextUtil.java`
#### Snippet
```java

  public static boolean isEmptyOrWhitespaced(final @Nullable String s) {
    return s == null || s.trim().length() == 0;
  }

```

### SizeReplaceableByIsEmpty
`strings[i].length() > 0` can be replaced with '!strings\[i\].isEmpty()'
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TextUtil.java`
#### Snippet
```java
    final StringBuilder result = new StringBuilder(strings[0]);
    for (int i = 1; i < strings.length; i++) {
      if (strings[i] != null && strings[i].length() > 0) {
        result.append(' ');
        result.append(strings[i]);
```

## RuleId[id=ProtectedMemberInFinalClass]
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
    protected String createValue() {
      // Also in ~/.rvm/config/alias
      final String stdout = executeCommandLine(getExecutablePath(), "list", "default", "string");
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

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=UnnecessaryToStringCall]
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
      setPermissions(script, SCRIPT_PERMISSIONS); // script needs to be made executable for all (chmod a+x)
    } catch (IOException e) {
      throw new RunBuildException("Failed to create temp file, error: " + e.toString());
    }
    return script;
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/ConfigurationParamsUtil.java`
#### Snippet
```java
  }

  public static void setParameterEnabled(@NotNull final Map<String, String> runParams,
                                         @NotNull final String frameworkUIProperty,
                                         final boolean isEnabled) {
```

### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/ConfigurationParamsUtil.java`
#### Snippet
```java
  }

  public static void setParameterEnabled(@NotNull final Map<String, String> runParams,
                                         @NotNull final String frameworkUIProperty,
                                         final boolean isEnabled) {
```

### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/SharedParams.java`
#### Snippet
```java
  }

  public void applyToParameters(@NotNull final Map<String, String> params) {
    params.put(SHARED_RUBY_PARAMS_TYPE, getType().getValue());
    params.put(SHARED_RUBY_PARAMS_ARE_APPLIED, Boolean.toString(isApplied()));
```

### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/SharedParams.java`
#### Snippet
```java
  }

  public void applyToParameters(@NotNull final Map<String, String> params) {
    params.put(SHARED_RUBY_PARAMS_TYPE, getType().getValue());
    params.put(SHARED_RUBY_PARAMS_ARE_APPLIED, Boolean.toString(isApplied()));
```

### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-server/src/jetbrains/buildServer/runner/rakerunner/RakeRunnerRunType.java`
#### Snippet
```java
    }

    private void resetProperty(@NotNull final Map<String, String> properties, @NotNull final String key) {
      if (myDefaultParameters.containsKey(key)) {
        properties.put(key, myDefaultParameters.get(key));
```

### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-server/src/jetbrains/buildServer/runner/rakerunner/RakeRunnerRunType.java`
#### Snippet
```java
    }

    private void resetProperty(@NotNull final Map<String, String> properties, @NotNull final String key) {
      if (myDefaultParameters.containsKey(key)) {
        properties.put(key, myDefaultParameters.get(key));
```

### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-server/src/jetbrains/buildServer/feature/RubyEnvConfiguratorBuildFeature.java`
#### Snippet
```java
    }

    private void resetProperty(@NotNull final Map<String, String> properties, @NotNull final String key) {
      if (myDefaultParameters.containsKey(key)) {
        properties.put(key, myDefaultParameters.get(key));
```

### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-server/src/jetbrains/buildServer/feature/RubyEnvConfiguratorBuildFeature.java`
#### Snippet
```java
    }

    private void resetProperty(@NotNull final Map<String, String> properties, @NotNull final String key) {
      if (myDefaultParameters.containsKey(key)) {
        properties.put(key, myDefaultParameters.get(key));
```

### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-common/src/jetbrains/buildServer/rakerunner/RakeRunnerUtils.java`
#### Snippet
```java

  public static void setConfigMode(@NotNull final RubyConfigMode mode,
                                   @NotNull final Map<String, String> runParams) {
    runParams.put(RakeRunnerConstants.SERVER_UI_RUBY_USAGE_MODE, mode.getModeValueString());
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `rake-runner-common/src/jetbrains/buildServer/rakerunner/RakeRunnerUtils.java`
#### Snippet
```java

  public static void setConfigMode(@NotNull final RubyConfigMode mode,
                                   @NotNull final Map<String, String> runParams) {
    runParams.put(RakeRunnerConstants.SERVER_UI_RUBY_USAGE_MODE, mode.getModeValueString());
  }
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @NotNull`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/InstalledRbEnv.java`
#### Snippet
```java
  }

  public InstalledRbEnv(final @NotNull String path, final @NotNull Type type) {
    super(NAME);
    myHome = new File(path);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/InstalledRbEnv.java`
#### Snippet
```java
  }

  public InstalledRbEnv(final @NotNull String path, final @NotNull Type type) {
    super(NAME);
    myHome = new File(path);
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TextUtil.java`
#### Snippet
```java
  }

  public static boolean isEmptyOrWhitespaced(final @Nullable String s) {
    return s == null || s.trim().length() == 0;
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
  }

  public InstalledRVM(final @NotNull String path, final @NotNull Type type) {
    super(NAME);
    this.myPath = path;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
  }

  public InstalledRVM(final @NotNull String path, final @NotNull Type type) {
    super(NAME);
    this.myPath = path;
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/SharedParamsType.java`
#### Snippet
```java
              context.getWorkingDirectory().getAbsolutePath(),
              context.getBuildParameters().getEnvironmentVariables());
            //noinspection ThrowableResultOfMethodCallIgnored
            if (output.getExitCode() != 0 || output.getException() != null) {
              throw new RakeTasksBuildService.MyBuildFailureException("Failed to create gemset '" + gemset + "':" + output);
```

### RedundantSuppression
Redundant suppression
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RubySDKUtil.java`
#### Snippet
```java
      throws RakeTasksBuildService.MyBuildFailureException {
    // script wasn't found in LOAD_PATH:
    //noinspection ThrowableResultOfMethodCallIgnored
    if (result.getExitCode() != 0 || result.getException() != null) {
      throw new RakeTasksBuildService.MyBuildFailureException(result.toString());
```

### RedundantSuppression
Redundant suppression
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/impl/RubySdkImpl.java`
#### Snippet
```java
  private boolean myIsSetupCompleted = false;

  public RubySdkImpl(@SuppressWarnings("NullableProblems") @NotNull final File home,
                     @SuppressWarnings("NullableProblems") @Nullable final File executable) {
    myHome = home;
```

### RedundantSuppression
Redundant suppression
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/impl/RubySdkImpl.java`
#### Snippet
```java

  public RubySdkImpl(@SuppressWarnings("NullableProblems") @NotNull final File home,
                     @SuppressWarnings("NullableProblems") @Nullable final File executable) {
    myHome = home;
    myIsSystem = false;
```

### RedundantSuppression
Redundant suppression
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/impl/RVMRCBasedRubySdkImpl.java`
#### Snippet
```java
    final ShellScriptRunner shellScriptRunner = ScriptingRunnersProvider.getRVMDefault().getShellScriptRunner();
    final ExecResult testRun = shellScriptRunner.run(String.format(TEST_RVM_SHELL_SCRIPT, pathToRVMRCFolder), pathToRVMRCFolder, env);
    //noinspection ThrowableResultOfMethodCallIgnored
    if (testRun.getExitCode() != 0 || testRun.getException() != null) {
      StringBuilder sb = new StringBuilder();
```

### RedundantSuppression
Redundant suppression
in `rake-runner-agent/src/org/jetbrains/plugins/ruby/rvm/RVMSupportUtil.java`
#### Snippet
```java
    }
    final ExecResult env1 = RunnerUtil.run(null, env, rvm.getPath() + "/bin/rvm-shell", rvmRubyString, "-c", "env");
    //noinspection ThrowableResultOfMethodCallIgnored
    if (env1.getExitCode() != 0 || env1.getException() != null) {
      throw new RuntimeException("Cannot fetch sdk environment: rvm-shell failed with output" + env1.getStderr());
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

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/SharedParams.java`
#### Snippet
```java
  public static SharedParams fromRunParameters(@NotNull final Map<String, String> runParams) {
    SharedParams shared = new SharedParams();
    shared.setApplied(Boolean.valueOf(runParams.get(SHARED_RUBY_PARAMS_ARE_APPLIED)));
    shared.setType(getParamsType(runParams));
    shared.setInterpreterPath(StringUtil.trimAndNull(runParams.get(SHARED_RUBY_INTERPRETER_PATH)));
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/SharedParams.java`
#### Snippet
```java
    shared.setRVMGemsetName(StringUtil.trimAndNull(runParams.get(SHARED_RUBY_RVM_GEMSET_NAME)));
    shared.setRVMRCPath(StringUtil.trimAndNull(runParams.get(SHARED_RUBY_RVM_RVMRC_PATH)));
    shared.setRVMGemsetCreate(Boolean.valueOf(runParams.get(SHARED_RUBY_RVM_GEMSET_CREATE)));
    shared.setRVMRubyVersionPath(StringUtil.trimAndNull(runParams.get(SHARED_RUBY_RVM_RUBY_VERSION_PATH)));
    shared.setRbEnvVersion(StringUtil.trimAndNull(runParams.get(SHARED_RUBY_RBENV_VERSION_NAME)));
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/impl/RubySdkImpl.java`
#### Snippet
```java
  private String defineName(@NotNull final String name, boolean isThrow) {
    if (name.startsWith(RubyNames.RUBY) || name.startsWith(RubyNames.REE) || name.startsWith(RubyNames.MACRUBY) ||
        name.startsWith(RubyNames.RBX) || name.matches("^\\d.*")) {
      return RubyNames.RUBY;
    } else if (name.startsWith(RubyNames.JRUBY)) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.agent.rakerunner` is unnecessary and can be removed
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TestUnitUtil.java`
#### Snippet
```java
   * @param buildParameters Build params
   * @return Full path of given script
   * @throws jetbrains.buildServer.agent.rakerunner.RakeTasksBuildService.MyBuildFailureException
   *          If script will not be found
   * @throws jetbrains.buildServer.RunBuildException
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.agent.rakerunner` is unnecessary and can be removed
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/BundlerUtil.java`
#### Snippet
```java
   * @param buildParameters Build params
   * @return Directory full path
   * @throws jetbrains.buildServer.agent.rakerunner.RakeTasksBuildService.MyBuildFailureException If gem root wasn't found
   */
  @NotNull
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.agent.rakerunner.scripting` is unnecessary and can be removed
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/scripting/ShellBasedRubyScriptRunner.java`
#### Snippet
```java
 * @author Vladislav.Rassokhin
 */
public class ShellBasedRubyScriptRunner implements jetbrains.buildServer.agent.rakerunner.scripting.RubyScriptRunner {
  private final ShellScriptRunner myShellScriptRunner;

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

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `rake-runner-agent/src/org/jetbrains/plugins/ruby/rvm/SharedRVMUtil.java`
#### Snippet
```java
                          final String distName) {
      List<String> gemsets = myRubyDist2Gemset.get(distName);
      if (gemsets == null) {
        gemsets = new ArrayList<String>(1);
        myRubyDist2Gemset.put(distName, gemsets);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new FileFilter() can be replaced with lambda
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RubySDKUtil.java`
#### Snippet
```java

      final File gemsFolder = new File(gemsFolderPath);
      final File[] candidateGems = gemsFolder.listFiles(new FileFilter() {
        public boolean accept(@NotNull final File file) {
          // accept only versions of our given gem
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
  }

  private void determineRVMConfigData() {
    // TODO: exec rvm for data collecting
  }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/impl/RubySdkImpl.java`
#### Snippet
```java
  private ExecResult myGemPathsLog;
  private ExecResult myLoadPathsLog;
  private boolean myIsSetupCompleted = false;

  public RubySdkImpl(@SuppressWarnings("NullableProblems") @NotNull final File home,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/impl/RubySdkImpl.java`
#### Snippet
```java
  private final String myRubyName;

  private String myVersion = null;
  private boolean myIsJRuby;
  private String[] myGemPaths;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/SharedParams.java`
#### Snippet
```java
  @Nullable private String myRbEnvVersionFile;
  private boolean myRVMGemsetCreate;
  private boolean isApplied = false;
  @Nullable private String myRVMRubyVersionPath;

```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `s`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TextUtil.java`
#### Snippet
```java
    if (s.length() == 0) return s;
    if (s.charAt(s.length() - 1) == '\n') {
      s = s.substring(0, s.length() - 1);
    }
    if (s.charAt(s.length() - 1) == '\r') {
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TextUtil.java`
#### Snippet
```java
    }
    if (s.charAt(s.length() - 1) == '\r') {
      s = s.substring(0, s.length() - 1);
    }
    return s;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUnsupportedOS.java`
#### Snippet
```java
  @Override
  public InstalledRbEnv detect(@NotNull final Map<String, String> environmentParams) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/impl/RubySdkImpl.java`
#### Snippet
```java
  @Nullable
  public RubyVersionManager getVersionManager() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/impl/RubySdkImpl.java`
#### Snippet
```java
  @Nullable
  public String getGemset() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/impl/RVMDetectorForUnsupportedOS.java`
#### Snippet
```java
  @Override
  public InstalledRVM detect(@NotNull final Map<String, String> env) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `rake-runner-server/src/jetbrains/buildServer/feature/RubyEnvConfiguratorDiscoveryExtension.java`
#### Snippet
```java
  @Nullable
  public List<DiscoveredObject> discover(@NotNull final BuildTypeSettings settings) {
    if (!settings.getBuildFeaturesOfType(RubyEnvConfiguratorConstants.RUBY_ENV_CONFIGURATOR_FEATURE_TYPE).isEmpty()) return null;

    if (settings.findBuildRunnerByType(RakeRunnerConstants.RUNNER_TYPE) != null) {
```

### ReturnNull
Return of `null`
in `rake-runner-server/src/jetbrains/buildServer/feature/RubyEnvConfiguratorDiscoveryExtension.java`
#### Snippet
```java
                           new DiscoveredObject(RubyEnvConfiguratorConstants.RUBY_ENV_CONFIGURATOR_FEATURE_TYPE, rbenv));
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java

    // No special rbenv was found
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java
    // Cannot detect rbenv if $HOME directory unknowns.
    if (home == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java

    // No local rbenv was found
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java
      resolved = link.getCanonicalFile();
    } catch (IOException ignored) {
      return null;
    }
    if (!resolved.exists()) return null;
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java
      return null;
    }
    if (!resolved.exists()) return null;
    final File bin = resolved.getParentFile();
    if (bin == null) return null;
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java
    if (!resolved.exists()) return null;
    final File bin = resolved.getParentFile();
    if (bin == null) return null;
    return bin.getParentFile();
  }
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java
    } else {
      // Nothing founded
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/detector/RbEnvDetectorForUNIX.java`
#### Snippet
```java

    // No global rbenv was found
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/impl/RVMDetectorForUNIX.java`
#### Snippet
```java
    // Cannot detect rvm if $HOME directory unknowed.
    if (home == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/impl/RVMDetectorForUNIX.java`
#### Snippet
```java

    // No local rvm was found
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/impl/RVMDetectorForUNIX.java`
#### Snippet
```java
    } else {
      // Nothing founded
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/impl/RVMDetectorForUNIX.java`
#### Snippet
```java

    // No special rvm was found
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/detector/impl/RVMDetectorForUNIX.java`
#### Snippet
```java

    // No global rvm was found
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/FileUtil2.java`
#### Snippet
```java
  public static File getFirstExistChild(File directory, String... names) {
    if (!directory.isDirectory() || !directory.exists()) {
      return null;
    }
    for (String name : names) {
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/FileUtil2.java`
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
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/TestUnitUtil.java`
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
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rbenv/InstalledRbEnv.java`
#### Snippet
```java
  public File getRubiesFolder() {
    final File versions = new File(getRoot(), "versions");
    return versions.exists() && versions.isDirectory() ? versions : null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/util/RVMUtil.java`
#### Snippet
```java
        String trim = source.trim();
        final int comment = trim.indexOf('#');
        if (comment == 0) return null;
        if (comment > 0) trim = trim.substring(0, comment).trim();
        return !trim.isEmpty() && !trim.startsWith("#") && !trim.contains(" ") ? trim : null;
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/util/RVMUtil.java`
#### Snippet
```java
        if (comment == 0) return null;
        if (comment > 0) trim = trim.substring(0, comment).trim();
        return !trim.isEmpty() && !trim.startsWith("#") && !trim.contains(" ") ? trim : null;
      }
    });
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/RVMCommandLineProcessor.java`
#### Snippet
```java
      @Override
      public MapSerializerUtil.UnescapeResult unescape(@NotNull final String str, final int startPos) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/RVMCommandLineProcessor.java`
#### Snippet
```java
            return "\n";
          default:
            return null;
        }
      }
```

### ReturnNull
Return of `null`
in `rake-runner-common/src/jetbrains/buildServer/rakerunner/RakeRunnerUtils.java`
#### Snippet
```java
  public static String getRVMGemsetName(@NotNull final Map<String, String> params) {
    final String value = params.get(RakeRunnerConstants.SERVER_UI_RUBY_RVM_GEMSET_NAME);
    return StringUtil.isEmpty(value) ? null : value;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-common/src/jetbrains/buildServer/rakerunner/RakeRunnerUtils.java`
#### Snippet
```java
  public static String getRVMSdkName(@NotNull final Map<String, String> params) {
    final String value = params.get(RakeRunnerConstants.SERVER_UI_RUBY_RVM_SDK_NAME);
    return StringUtil.isEmpty(value) ? null : value;
  }
}
```

### ReturnNull
Return of `null`
in `rake-runner-common/src/jetbrains/buildServer/rakerunner/RakeRunnerUtils.java`
#### Snippet
```java
  public static String getRubySdkPath(@NotNull final Map<String, String> params) {
    final String value = params.get(RakeRunnerConstants.SERVER_UI_RUBY_INTERPRETER_PATH);
    return StringUtil.isEmpty(value) ? null : value;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/BundlerUtil.java`
#### Snippet
```java
    // file separators aren't important here
    if (!checkIfExists(configPath)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/BundlerUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/BundlerUtil.java`
#### Snippet
```java
      return path;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/BundlerUtil.java`
#### Snippet
```java

    if (!isBundleExecEmulationEnabled(context.getRunnerParameters())) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
#### Snippet
```java
      });
      if (split.isEmpty()) {
        return null;
      }
      return split.iterator().next();
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/ruby/rvm/InstalledRVM.java`
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
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RubySDKUtil.java`
#### Snippet
```java
    }
    if (gems.isEmpty()) {
      return null;
    }
    return Collections.max(gems, new GemInfoPairComparator());
```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/RubySDKUtil.java`
#### Snippet
```java
    final String customGemVersionProperty = buildParameters.get(forcedVersionProperty);

    return !StringUtil.isEmpty(customGemVersionProperty) ? customGemVersionProperty.trim() : null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/OSUtil.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `rake-runner-agent/src/jetbrains/buildServer/agent/rakerunner/utils/OSUtil.java`
#### Snippet
```java
  public static String getUserHomeFolder() {
    final String home = System.getProperty("user.home");
    return FileUtil2.checkIfDirExists(home) ? home : null;
  }
}
```

