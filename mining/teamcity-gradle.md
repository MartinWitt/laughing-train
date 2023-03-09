# teamcity-gradle 
 
# Bad smells
I found 29 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StaticCallOnSubclass | 6 | false |
| MissortedModifiers | 6 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| UNUSED_IMPORT | 3 | false |
| GroovyUnusedAssignment | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| BoundedWildcard | 2 | false |
| RedundantFieldInitialization | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| Convert2MethodRef | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `gradle-runner-agent/src/main/scripts/init.gradle`
#### Snippet
```java

  private StringBuilder appendAttribute(StringBuilder msg, String key, Object value) {
    String strValue = null
    if (value instanceof String) {
      strValue = value
```

### GroovyUnusedAssignment
Assignment is not used
in `gradle-runner-agent/src/main/scripts/init.gradle`
#### Snippet
```java

  synchronized private File createBigStacktracesDir() {
    String path = null;
    if ((path = project["teamcity.build.stacktraceLogDir"]) != null) {
      return new File(path)
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleLoggingListener.java`
#### Snippet
```java
  private final BuildProgressLogger myBuildLogger;
  private final List<String> myErrorMessages = new ArrayList<>();
  volatile private boolean myCollectErrors = false;
  private String myWrapperDistPath;

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`gradleHomePath.length() > 0` can be replaced with '!gradleHomePath.isEmpty()'
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleToolProvider.java`
#### Snippet
```java
        // try to get locally installed gradle
        String gradleHomePath = System.getenv(GRADLE_HOME);
        if (null != gradleHomePath && gradleHomePath.length() > 0) {
          return gradleHomePath;
        } else {
```

### SizeReplaceableByIsEmpty
`gradleTasks.length() > 0` can be replaced with '!gradleTasks.isEmpty()'
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java

    String gradleTasks = ConfigurationParamsUtil.getGradleTasks(getRunnerParameters());
    if (gradleTasks.length() > 0) {
      final List<String> tasks = StringUtil.splitHonorQuotes(gradleTasks, ' ');
      for (String task: tasks) {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `GradleRunnerConstants` has only 'static' members, and lacks a 'private' constructor
in `gradle-runner-common/src/main/java/jetbrains/buildServer/gradle/GradleRunnerConstants.java`
#### Snippet
```java
package jetbrains.buildServer.gradle;

public class GradleRunnerConstants
{
  public static final String RUNNER_TYPE = "gradle-runner";
```

### UtilityClassWithoutPrivateConstructor
Class `GradleToolProvider` has only 'static' members, and lacks a 'private' constructor
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleToolProvider.java`
#### Snippet
```java
 * Date: Sep 24, 2010
 */
public class GradleToolProvider {

  public static final String GRADLE_TOOL = "gradle";
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigurationParamsUtil` has only 'static' members, and lacks a 'private' constructor
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/ConfigurationParamsUtil.java`
#### Snippet
```java
import static jetbrains.buildServer.util.StringUtil.emptyIfNull;

public class ConfigurationParamsUtil
{
  public static @NotNull String getGradleHome(Map<String, String> runParameters)
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `gradle-runner-server/src/main/java/jetbrains/buildServer/gradle/server/GradleRunType.java`
#### Snippet
```java
  public List<Requirement> getRunnerSpecificRequirements(@NotNull final Map<String, String> runParameters) {
    if(!Boolean.parseBoolean(runParameters.get(GradleRunnerConstants.GRADLE_WRAPPER_FLAG))
       && StringUtil.isEmptyOrSpaces(runParameters.get(GradleRunnerConstants.GRADLE_HOME))) {
      return Collections.singletonList(new Requirement("env.GRADLE_HOME", null, RequirementType.EXISTS));
    } else {
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `gradle-runner-server/src/main/java/jetbrains/buildServer/gradle/server/GradleRunType.java`
#### Snippet
```java
      result.append("Gradle tasks: ");
      String gradleTasks = parameters.get(GradleRunnerConstants.GRADLE_TASKS);
      if (StringUtil.isEmpty(gradleTasks)) {
        result.append("Default");
      } else {
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleLoggingListener.java`
#### Snippet
```java
      }

      if (StringUtil.isEmptyOrSpaces(text)) {
        myLastLineState = LastLine.EMPTY_ERROR;
      }
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java

    String path = getRunnerParameters().get(GradleRunnerConstants.PATH_TO_BUILD_FILE);
    if (StringUtil.isNotEmpty(path)) {
      params.add("-b");
      params.add(path);
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
    final String runnerJavaArguments = getJavaArgs();

    if (StringUtil.isNotEmpty(runnerJavaArguments)) {
      return runnerJavaArguments;
    } else if (StringUtil.isNotEmpty(runnerGradleOpts)) {
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
    if (StringUtil.isNotEmpty(runnerJavaArguments)) {
      return runnerJavaArguments;
    } else if (StringUtil.isNotEmpty(runnerGradleOpts)) {
      return runnerGradleOpts;
    } else {
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `into &= mapper.test(dir, child)`
in `gradle-runner-server/src/main/java/jetbrains/buildServer/gradle/server/GradleRunnerDiscoveryExtension.java`
#### Snippet
```java
    boolean into = true;
    for (Element child : children) {
      into &= mapper.test(dir, child);
    }
    if (into && depth < DEFAULT_DEPTH_LIMIT) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
      return s + " \"-Djava.io.tmpdir=" + tempDir.getCanonicalPath() +"\"";
    } catch (IOException e) {
      Loggers.AGENT.warnAndDebugDetails("Failed patch temp dir for Gradle runtime environment: " + e.toString(), e);
      return s;
    }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.ComparisonFailureUtil;`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
import java.io.IOException;
import java.util.*;
import jetbrains.buildServer.ComparisonFailureUtil;
import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.AgentRuntimeProperties;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.agent.ClasspathUtil;`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.AgentRuntimeProperties;
import jetbrains.buildServer.agent.ClasspathUtil;
import jetbrains.buildServer.agent.IncrementalBuild;
import jetbrains.buildServer.agent.ToolCannotBeFoundException;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.messages.serviceMessages.ServiceMessage;`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.messages.ErrorData;
import jetbrains.buildServer.messages.serviceMessages.ServiceMessage;
import jetbrains.buildServer.runner.JavaRunnerConstants;
import jetbrains.buildServer.serverSide.BuildTypeOptions;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Element`
in `gradle-runner-server/src/main/java/jetbrains/buildServer/gradle/server/GradleRunnerDiscoveryExtension.java`
#### Snippet
```java
  private void traverse(@NotNull final Element dir,
                        int depth,
                        @NotNull final BiPredicate<Element, Element> mapper) {
    final Iterable<Element> children = dir.getChildren();
    if (children == null) return;
```

### BoundedWildcard
Can generalize to `? super Element`
in `gradle-runner-server/src/main/java/jetbrains/buildServer/gradle/server/GradleRunnerDiscoveryExtension.java`
#### Snippet
```java
  private void traverse(@NotNull final Element dir,
                        int depth,
                        @NotNull final BiPredicate<Element, Element> mapper) {
    final Iterable<Element> children = dir.getChildren();
    if (children == null) return;
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `volatile private`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleLoggingListener.java`
#### Snippet
```java
  private final BuildProgressLogger myBuildLogger;
  private final List<String> myErrorMessages = new ArrayList<>();
  volatile private boolean myCollectErrors = false;
  private String myWrapperDistPath;

```

### MissortedModifiers
Missorted modifiers `public static @NotNull`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/ConfigurationParamsUtil.java`
#### Snippet
```java
  }

  public static @NotNull String getGradleTasks(Map<String, String> runParameters)
  {
    return emptyIfNull(runParameters.get(GradleRunnerConstants.GRADLE_TASKS));
```

### MissortedModifiers
Missorted modifiers `public static @NotNull`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/ConfigurationParamsUtil.java`
#### Snippet
```java
  }

  public static @NotNull String getJavaArgs(Map<String, String> runParameters)
  {
    return StringUtil.newLineToSpaceDelimited(emptyIfNull(runParameters.get(JavaRunnerConstants.JVM_ARGS_KEY)));
```

### MissortedModifiers
Missorted modifiers `public static @NotNull`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/ConfigurationParamsUtil.java`
#### Snippet
```java
  }

  public static @NotNull List<String> getGradleParams(Map<String, String> runParameters)
  {
    return CommandLineArgumentsUtil.extractArguments(emptyIfNull(runParameters.get(GradleRunnerConstants.GRADLE_PARAMS)));
```

### MissortedModifiers
Missorted modifiers `public static @NotNull`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/ConfigurationParamsUtil.java`
#### Snippet
```java
public class ConfigurationParamsUtil
{
  public static @NotNull String getGradleHome(Map<String, String> runParameters)
  {
    return emptyIfNull(runParameters.get(GradleRunnerConstants.GRADLE_HOME));
```

### MissortedModifiers
Missorted modifiers `public static @NotNull`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/ConfigurationParamsUtil.java`
#### Snippet
```java
  }

  public static @NotNull String getGradleInitScript(Map<String, String> runParameters)
  {
    return emptyIfNull(runParameters.get(GradleRunnerConstants.GRADLE_INIT_SCRIPT));
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleLoggingListener.java`
#### Snippet
```java

  private void flushErrorMessages() {
    myErrorMessages.forEach(msg -> myBuildLogger.warning(msg));
    myErrorMessages.clear();
  }
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `GradleToolProvider` has only 'static' members, and a 'public' constructor
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleToolProvider.java`
#### Snippet
```java
 * Date: Sep 24, 2010
 */
public class GradleToolProvider {

  public static final String GRADLE_TOOL = "gradle";
```

