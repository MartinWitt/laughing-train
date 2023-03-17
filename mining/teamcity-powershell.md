# teamcity-powershell 
 
# Bad smells
I found 33 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StaticCallOnSubclass | 13 | false |
| BoundedWildcard | 13 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| ReturnNull | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UNUSED_IMPORT | 1 | false |
| CommentedOutCode | 1 | false |
## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/CommandLinePowerShellDetector.java`
#### Snippet
```java
    } catch (IOException e) {
      LOG.warnAndDebugDetails("Failed to write PowerShell detection script to file [" + result.getAbsolutePath() + "]", e);
      return null;
    }
    return result;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `LegacyKeys` has only 'static' members, and lacks a 'private' constructor
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/LegacyKeys.java`
#### Snippet
```java
 * @author Oleg Rybak (oleg.rybak@jetbrains.com)
 */
class LegacyKeys {

  private static String getVersionKey(@NotNull final PowerShellBitness bitness) {
```

### UtilityClassWithoutPrivateConstructor
Class `Loggers` has only 'static' members, and lacks a 'private' constructor
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/Loggers.java`
#### Snippet
```java
import com.intellij.openapi.diagnostic.Logger;

public class Loggers {

    public static final Logger DETECTION_LOGGER = Logger.getInstance("jetbrains.buildServer.powershell.agent.DETECT");
```

### UtilityClassWithoutPrivateConstructor
Class `PowerShellConstants` has only 'static' members, and lacks a 'private' constructor
in `powershell-common/src/main/java/jetbrains/buildServer/powershell/common/PowerShellConstants.java`
#### Snippet
```java
 *         03.12.10 15:53
 */
public class PowerShellConstants {

  public static final String PLUGIN_NAME = "powershell-runner";
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/system/PowerShellCommands.java`
#### Snippet
```java
      if (info.getBitness() == PowerShellBitness.x64) {
        if (mySystemBitness.is32bit()) {
          return info.getExecutablePath().replace(SYSTEM32, NATIVE);
        }
      }
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/system/PowerShellCommands.java`
#### Snippet
```java
  public String getCMDWrappedCommand(@NotNull final PowerShellInfo info, @NotNull final Map<String, String> env) {
    final String windir = env.get("windir");
    if (StringUtil.isEmptyOrSpaces(windir)) {
      LOG.warn("Failed to find %windir%");
      return "cmd.exe";
```

### StaticCallOnSubclass
Static method `join()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/DetectionPaths.java`
#### Snippet
```java
      if (!propertyPaths.isEmpty()) {
        LOG.debug("Adding PowerShell detection paths from [teamcity.powershell.detector.search.paths] property.");
        LOG.debug(StringUtil.join(propertyPaths, "\n"));
      }
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-common/src/main/java/jetbrains/buildServer/powershell/common/PowerShellExecutionMode.java`
#### Snippet
```java
  @Nullable
  public static PowerShellExecutionMode fromString(@Nullable String sMode) {
    if (StringUtil.isEmptyOrSpaces(sMode)) return STDIN;

    for (PowerShellExecutionMode mode : values()) {
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-server/src/main/java/jetbrains/buildServer/powershell/server/PowerShellRunType.java`
#### Snippet
```java
          case FILE:
            final String script = properties.get(RUNNER_SCRIPT_FILE);
            if (StringUtil.isEmptyOrSpaces(script)) {
              col.add(new InvalidProperty(RUNNER_SCRIPT_FILE, "Script file is not defined"));
            } else if (!ReferencesResolverUtil.containsReference(script) && !script.toLowerCase().endsWith(".ps1")) {
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-server/src/main/java/jetbrains/buildServer/powershell/server/PowerShellRunType.java`
#### Snippet
```java
            break;
          case CODE:
            if (StringUtil.isEmptyOrSpaces(properties.get(RUNNER_SCRIPT_CODE))) {
              col.add(new InvalidProperty(RUNNER_SCRIPT_CODE, "Code should not be empty"));
            }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellCommandLineProvider.java`
#### Snippet
```java
    final List<String> result = new ArrayList<>();
    final String custom = runnerParams.get(key);
    if (!StringUtil.isEmptyOrSpaces(custom)) {
      List<String> lines;
      if (Boolean.parseBoolean(sharedConfigParams.get(PARAM_ARGS_MULTILINE))) {
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellCommandLineProvider.java`
#### Snippet
```java
      }
      lines.stream().map(String::trim)
              .filter(it -> !StringUtil.isEmptyOrSpaces(it))
              .map(StringUtil::splitHonorQuotes)
              .forEach(result::addAll);
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellCommandLineProvider.java`
#### Snippet
```java
    }
    addVersion(result, runnerParams, info); // version must be the 1st arg after executable path
    if (!StringUtil.isEmptyOrSpaces(runnerParams.get(RUNNER_NO_PROFILE))) {
      result.add("-NoProfile");
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellCommandLineProvider.java`
#### Snippet
```java
    if (isExplicitVersionSupported(info)) {
      final String minVersion = runnerParams.get(RUNNER_MIN_VERSION);
      if (!StringUtil.isEmptyOrSpaces(minVersion)) {
        list.add("-Version");
        list.add(minVersion);
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/service/PowerShellServiceWindows.java`
#### Snippet
```java
  private boolean isInternalPropertySetExecutionPolicy(@NotNull final String name, boolean def) {
    final String prop = getConfigParameters().get("teamcity.powershell." + name);
    if (StringUtil.isEmptyOrSpaces(prop)) {
      return def;
    } else {
```

### StaticCallOnSubclass
Static method `join()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/service/PowerShellServiceWindows.java`
#### Snippet
```java
    final String command = myCommands.getNativeCommand(info, getRunnerContext());
    buildLogger.message("Command: " + command);
    buildLogger.message("PowerShell arguments: " + StringUtil.join(args, ", "));
    return new SimpleProgramCommandLine(env, workDir, command, args);
  }
```

### StaticCallOnSubclass
Static method `join()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/CommandLinePowerShellDetector.java`
#### Snippet
```java
        final List<String> outputLines = myRunner.runDetectionScript(executablePath, scriptPath, additionalParameters);
        if (LOG.isDebugEnabled()) {
          LOG.debug("Detection script output at " + executablePath + "\n" + StringUtil.join(outputLines, "\n"));
        }
        if (outputLines.size() == 3) {
```

### StaticCallOnSubclass
Static method `join()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/CommandLinePowerShellDetector.java`
#### Snippet
```java
    final List<String> pathsToCheck = myDetectionPaths.getPaths(detectionContext);
    if (LOG.isDebugEnabled()) {
      LOG.debug("Will be detecting PowerShell in the following locations: [\n" + StringUtil.join(pathsToCheck, "\n") + "\n");
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.intellij.execution.configurations.ParametersList;`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellCommandLineProvider.java`
#### Snippet
```java
package jetbrains.buildServer.powershell.agent;

import com.intellij.execution.configurations.ParametersList;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.SystemInfo;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/LegacyKeys.java`
#### Snippet
```java
  }

  static void fillLegacyKeys(@NotNull final Map<String, String> parameters,
                             @NotNull final PowerShellBitness bit,
                             @NotNull final PowerShellInfo info) {
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/LegacyKeys.java`
#### Snippet
```java
  }

  static void fillLegacyKeys(@NotNull final Map<String, String> parameters,
                             @NotNull final PowerShellBitness bit,
                             @NotNull final PowerShellInfo info) {
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/DetectionPaths.java`
#### Snippet
```java
  }

  private void checkPathAndAdd(@NotNull final Set<String> paths, String path) {
    if (!isEmptyOrSpaces(path)) {
      File base = new File(path, "PowerShell");
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/DetectionPaths.java`
#### Snippet
```java
  }

  private void addGlobalToolsPath(@NotNull final List<String> result) {
    File toolsPath;
    if (SystemInfo.isWindows) {
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/PowerShellInfo.java`
#### Snippet
```java
  }

  public void saveInfo(@NotNull final Map<String, String> agentParameters) {
    if (!myVirtual) {
      Map<String, String> parameters = toConfigurationParameters();
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/PowerShellInfo.java`
#### Snippet
```java
  }

  public void saveInfo(@NotNull final Map<String, String> agentParameters) {
    if (!myVirtual) {
      Map<String, String> parameters = toConfigurationParameters();
```

### BoundedWildcard
Can generalize to `? extends PowerShellDetector`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellInfoProvider.java`
#### Snippet
```java
  }

  private void registerDetectedPowerShells(@NotNull final List<PowerShellDetector> detectors,
                                           @NotNull final DetectionContext detectionContext,
                                           Map<String, String> parameters) {
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellInfoProvider.java`
#### Snippet
```java
   * Helps with agent requirements
   */
  private void provideMaxVersions(Map<String, String> parameters) {
    for (PowerShellBitness bitness : PowerShellBitness.values()) {
      for (PowerShellEdition edition : PowerShellEdition.values()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellInfoProvider.java`
#### Snippet
```java
   * Helps with agent requirements
   */
  private void provideMaxVersions(Map<String, String> parameters) {
    for (PowerShellBitness bitness : PowerShellBitness.values()) {
      for (PowerShellEdition edition : PowerShellEdition.values()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellCommandLineProvider.java`
#### Snippet
```java
   * @param key runner parameter key
   */
  private void addCustomArguments(@NotNull final List<String> args,
                                  @NotNull final Map<String, String> runnerParams,
                                  Map<String, String> sharedConfigParams,
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellCommandLineProvider.java`
#### Snippet
```java
  }

  private void addVersion(@NotNull final List<String> list,
                          @NotNull final Map<String, String> runnerParams,
                          @NotNull final PowerShellInfo info) {
```

### BoundedWildcard
Can generalize to `? super String`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/CommandLinePowerShellDetector.java`
#### Snippet
```java
  }

  private void doDetectionCycle(Map<String, PowerShellInfo> shells,
                                List<String> pathsToCheck,
                                List<String> executablesToCheck,
```

### BoundedWildcard
Can generalize to `? super PowerShellInfo`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/CommandLinePowerShellDetector.java`
#### Snippet
```java
  }

  private void doDetectionCycle(Map<String, PowerShellInfo> shells,
                                List<String> pathsToCheck,
                                List<String> executablesToCheck,
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/ScriptGenerator.java`
#### Snippet
```java
      }
      sourceScript = convertLineSeparators(sourceScript, "\r\n");
      /*if (PowerShellExecutionMode.STDIN.equals(PowerShellExecutionMode.fromString(runnerParameters.get(RUNNER_EXECUTION_MODE)))) {
        //some newlines are necessary to workaround -Command - issues, like TW-19771
        sourceScript = "  \r\n  \r\n  \r\n" + sourceScript + "\r\n  \r\n   \r\n   ";
```

