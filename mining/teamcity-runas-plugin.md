# teamcity-runas-plugin 
 
# Bad smells
I found 100 bad smells with 19 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StaticCallOnSubclass | 26 | false |
| BoundedWildcard | 12 | false |
| UNUSED_IMPORT | 9 | false |
| SizeReplaceableByIsEmpty | 9 | true |
| UtilityClassWithoutPrivateConstructor | 5 | true |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| MissortedModifiers | 5 | false |
| UnnecessaryModifier | 4 | true |
| DoubleBraceInitialization | 4 | false |
| ConstantValue | 3 | false |
| EnumSwitchStatementWhichMissesCases | 2 | false |
| ReturnNull | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| DataFlowIssue | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| RegExpRedundantEscape | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| UnusedAssignment | 1 | false |
| NullableProblems | 1 | false |
| UseBulkOperation | 1 | false |
| RedundantSuppression | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (myEnvironment.getOperationSystem()) { case Windows: setupBuilder = myRunAsWind...` statement on enum type 'jetbrains.buildServer.runAs.agent.OperationSystem' misses case 'Other'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsSetupBuilder.java`
#### Snippet
```java
  public Iterable<CommandLineSetup> build(@NotNull final CommandLineSetup commandLineSetup) {
    CommandLineSetupBuilder setupBuilder = myRunAsUnixSetupBuilder;
    switch (myEnvironment.getOperationSystem()) {
      case Windows:
        setupBuilder = myRunAsWindowsSetupBuilder;
        break;

      case Mac:
        setupBuilder = myRunAsMacSetupBuilder;
        break;
    }

    return setupBuilder.build(commandLineSetup);
```

### EnumSwitchStatementWhichMissesCases
`switch (ace.getScope()) { case Global: if (!myGlobalFileAccessCache.tryAddEntry(ac...` statement on enum type 'jetbrains.buildServer.runAs.agent.AccessControlScope' misses case 'Step'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ScopedFileAccessService.java`
#### Snippet
```java
    final List<AccessControlEntry> newAcl = new ArrayList<AccessControlEntry>();
    for (AccessControlEntry ace : accessControlList) {
      switch (ace.getScope()) {
        case Global:
          if (!myGlobalFileAccessCache.tryAddEntry(ace)) {
            LOG.info("Skipping setting an access for " + ace + ", because it has being done previously");
            continue;
          }

          break;

        case Build:
          if (!myBuildFileAccessCache.tryAddEntry(ace)) {
            LOG.info("Skipping setting an access for " + ace + ", because it has being done on the previous step");
            continue;
          }

          break;
      }

      newAcl.add(ace);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlResource.java`
#### Snippet
```java

public interface AccessControlResource extends CommandLineResource {
  public void setAcl(@NotNull final AccessControlList accessControlList);
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `runAs-common/src/main/java/jetbrains/buildServer/runAs/common/LoggingLevel.java`
#### Snippet
```java
  private final String myDescription;

  private LoggingLevel(String value, final String description) {
    myValue = value;
    myDescription = description;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `runAs-common/src/main/java/jetbrains/buildServer/runAs/common/WindowsIntegrityLevel.java`
#### Snippet
```java
  private final String myDescription;

  private WindowsIntegrityLevel(String value, final String description) {
    myValue = value;
    myDescription = description;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/FileAccessService.java`
#### Snippet
```java

public interface FileAccessService {
  public Iterable<Result<AccessControlEntry, Boolean>> setAccess(@NotNull final AccessControlList accessControlList);
}

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `RunAsToolProvider` has only 'static' members, and lacks a 'private' constructor
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsToolProvider.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class RunAsToolProvider {
  static final String BIN_PATH = "bin";

```

### UtilityClassWithoutPrivateConstructor
Class `ParameterUtils` has only 'static' members, and lacks a 'private' constructor
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ParameterUtils.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class ParameterUtils {
  public static boolean parseBoolean(@Nullable final String boolStr, final boolean defaultValue) {
    if(StringUtil.isEmptyOrSpaces(boolStr)) {
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/Constants.java`
#### Snippet
```java
package jetbrains.buildServer.runAs.agent;

public class Constants {
    @SuppressWarnings("SpellCheckingInspection")
    public static final String ICACLS_TOOL_NAME = "ICACLS";
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `runAs-common/src/main/java/jetbrains/buildServer/runAs/common/Constants.java`
#### Snippet
```java
package jetbrains.buildServer.runAs.common;

public class Constants {
    // Plugin's ids
    public static final String BUILD_FEATURE_TYPE = "runAs-build-feature";
```

### UtilityClassWithoutPrivateConstructor
Class `LogUtils` has only 'static' members, and lacks a 'private' constructor
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LogUtils.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class LogUtils {
  private static final String Nothing = "null";

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsArgumentConverter.java`
#### Snippet
```java
  @Override
  public String convert(@NotNull final String arg) {
    return "\"" + StringUtil.unquoteString(arg).replace("\"", "\"\"") + "\"";
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxArgumentConverter.java`
#### Snippet
```java
  @Override
  public String convert(@NotNull final String arg) {
    return "$'" + arg.replace("\\", "\\\\").replace("'", "\\'") + "'";
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxArgumentConverter.java`
#### Snippet
```java
  @Override
  public String convert(@NotNull final String arg) {
    return "$'" + arg.replace("\\", "\\\\").replace("'", "\\'") + "'";
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/FileAccessParser.java`
#### Snippet
```java
    }

    final String[] entries = aclString.split(";");
    for (String aclEntryStr: entries) {
      final Matcher aclMatch = OutAccessPattern.matcher(aclEntryStr);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/FileAccessParser.java`
#### Snippet
```java
      }

      for (String pathItem: antPatternsStr.split(",")) {
          final File path = new File(pathItem.trim());
          accessControlEntries.add(new AccessControlEntry(path, account, permissions, scope));
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ParametersServiceImpl.java`
#### Snippet
```java
  public String tryGetParameter(@NotNull final String paramName) {
    final String isRunAsUiEnabledStr = myRunnerParametersService.tryGetConfigParameter(Constants.RUN_AS_UI_ENABLED);
    final boolean isRunAsUiEnabled = StringUtil.isEmpty(isRunAsUiEnabledStr) || !Boolean.toString(false).equalsIgnoreCase(isRunAsUiEnabledStr);
    if(isRunAsUiEnabled) {
      String paramValue = myRunnerParametersService.tryGetRunnerParameter(paramName);
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ParametersServiceImpl.java`
#### Snippet
```java
    if(isRunAsUiEnabled) {
      String paramValue = myRunnerParametersService.tryGetRunnerParameter(paramName);
      if (!StringUtil.isEmptyOrSpaces(paramValue)) {
        return paramValue;
      }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ParametersServiceImpl.java`
#### Snippet
```java

      paramValue = myBuildFeatureParametersService.tryGetBuildFeatureParameter(Constants.BUILD_FEATURE_TYPE, paramName);
      if (!StringUtil.isEmptyOrSpaces(paramValue)) {
        return paramValue;
      }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsPasswordsProvider.java`
#### Snippet
```java
        for (SBuildRunnerDescriptor runner : buildType.getBuildRunners()) {
          final String password = runner.getParameters().get(Constants.PASSWORD);
          if (!StringUtil.isEmpty(password)) {
            passwords.add(new SimpleParameter(Constants.PASSWORD + "_" + runner.getId(), password));
          }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsPasswordsProvider.java`
#### Snippet
```java

        final String password = params.get(Constants.PASSWORD);
        if (!StringUtil.isEmpty(password)) {
          passwords.add(new SimpleParameter(Constants.PASSWORD + "_" + buildFeature.getId(), password));
        }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsPasswordsProvider.java`
#### Snippet
```java
      final SBuildAgent agent = build.getAgent();
      final String password = agent.getConfigurationParameters().get(Constants.PASSWORD);
      if (!StringUtil.isEmpty(password)) {
        passwords.add(new SimpleParameter(Constants.PASSWORD + "_" + agent.getId(), password));
      }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsPasswordsProvider.java`
#### Snippet
```java
    final Map<String, String> buildParams = build.getBuildOwnParameters();
    final String password = buildParams.get(Constants.PASSWORD);
    if(!StringUtil.isEmpty(password)) {
      passwords.add(new SimpleParameter(Constants.PASSWORD, password));
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/CryptographicServiceImpl.java`
#### Snippet
```java
  @Nullable
  public String unscramble(@Nullable String str){
    if(StringUtil.isEmptyOrSpaces(str)) {
      return str;
    }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/CommandLineExecutorImpl.java`
#### Snippet
```java
            resultStr.append("out: ");
            for (String line : outLines) {
              if (!StringUtil.isEmpty(line)) {
                resultStr.append(line);
              }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ProfileParametersServiceImpl.java`
#### Snippet
```java
    myProfiles.clear();
    final String credentialsDirectoryStr = myAgentParametersService.tryGetConfigParameter(jetbrains.buildServer.runAs.common.Constants.CREDENTIALS_DIRECTORY);
    if(StringUtil.isEmptyOrSpaces(credentialsDirectoryStr)) {
      LOG.error("Configuration parameter \"" + Constants.CREDENTIALS_DIRECTORY + "\" was not defined");
      return;
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/UserCredentialsServiceImpl.java`
#### Snippet
```java
    if(allowCustomCredentials && allowProfileIdFromServer) {
      String profileRef = myParametersService.tryGetParameter(Constants.CREDENTIALS_PROFILE_ID);
      final boolean profileWasDefined = !StringUtil.isEmptyOrSpaces(profileRef);
      UserCredentials profileCredentials = null;
      if(!profileWasDefined) {
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/UserCredentialsServiceImpl.java`
#### Snippet
```java
    if(allowProfileIdFromServer) {
      String credentialsRef = myParametersService.tryGetConfigParameter(Constants.CREDENTIALS_PROFILE_ID);
      if (StringUtil.isEmptyOrSpaces(credentialsRef)) {
        credentialsRef = DEFAULT_PROFILE;
      }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/UserCredentialsServiceImpl.java`
#### Snippet
```java

    String additionalArgs = tryGetFirstNotEmpty(getParam(profileName, Constants.ADDITIONAL_ARGS, isPredefined));
    if(StringUtil.isEmptyOrSpaces(additionalArgs)) {
      additionalArgs = "";
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/UserCredentialsServiceImpl.java`
#### Snippet
```java

    userName = tryGetFirstNotEmpty(myProfileParametersService.tryGetProperty(profileName, Constants.USER));
    if(StringUtil.isEmptyOrSpaces(userName)) {
      if(trowException) {
        throw new BuildStartException("RunAs user must be defined for \"" + profileName + "\"");
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/UserCredentialsServiceImpl.java`
#### Snippet
```java

    password = tryGetFirstNotEmpty(myProfileParametersService.tryGetProperty(profileName, Constants.PASSWORD), myProfileParametersService.tryGetProperty(profileName, Constants.CONFIG_PASSWORD));
    if(StringUtil.isEmptyOrSpaces(password)) {
      if(trowException) {
        throw new BuildStartException("RunAs password must be defined for \"" + profileName + "\"");
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/UserCredentialsServiceImpl.java`
#### Snippet
```java
    final String password = tryGetFirstNotEmpty(myParametersService.tryGetParameter(Constants.PASSWORD), myParametersService.tryGetParameter(Constants.CONFIG_PASSWORD));

    if(StringUtil.isEmptyOrSpaces(userName) || StringUtil.isEmptyOrSpaces(password)) {
      return null;
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/UserCredentialsServiceImpl.java`
#### Snippet
```java
    final String password = tryGetFirstNotEmpty(myParametersService.tryGetParameter(Constants.PASSWORD), myParametersService.tryGetParameter(Constants.CONFIG_PASSWORD));

    if(StringUtil.isEmptyOrSpaces(userName) || StringUtil.isEmptyOrSpaces(password)) {
      return null;
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/UserCredentialsServiceImpl.java`
#### Snippet
```java
  private String tryGetFirstNotEmpty(String ... values) {
    for(String value: values) {
      if(!StringUtil.isEmptyOrSpaces(value)) {
        return value;
      }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxFileAccessService.java`
#### Snippet
```java
  {
    final String chmodPermissionsStr = StringUtil.join("", chmodPermissions);
    if(StringUtil.isEmptyOrSpaces(chmodPermissionsStr)) {
      return null;
    }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
      for (String propertySet : propertySets) {
        final String propertyValue = myProfileParametersService.tryGetProperty(propertySet, protectedPropertyName);
        if (StringUtil.isEmptyOrSpaces(propertyValue)) {
          continue;
        }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ParameterUtils.java`
#### Snippet
```java
public class ParameterUtils {
  public static boolean parseBoolean(@Nullable final String boolStr, final boolean defaultValue) {
    if(StringUtil.isEmptyOrSpaces(boolStr)) {
      return defaultValue;
    }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsRunTypeExtension.java`
#### Snippet
```java
        final String password = properties.get(RunAsBean.Shared.getRunAsPasswordKey());

        if(!(StringUtil.isEmpty(user) && StringUtil.isEmpty(password))) {
          if (StringUtil.isEmptyOrSpaces(user)) {
            result.add(new InvalidProperty(RunAsBean.Shared.getRunAsUserKey(), "The user must be specified."));
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsRunTypeExtension.java`
#### Snippet
```java
        final String password = properties.get(RunAsBean.Shared.getRunAsPasswordKey());

        if(!(StringUtil.isEmpty(user) && StringUtil.isEmpty(password))) {
          if (StringUtil.isEmptyOrSpaces(user)) {
            result.add(new InvalidProperty(RunAsBean.Shared.getRunAsUserKey(), "The user must be specified."));
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsRunTypeExtension.java`
#### Snippet
```java

        if(!(StringUtil.isEmpty(user) && StringUtil.isEmpty(password))) {
          if (StringUtil.isEmptyOrSpaces(user)) {
            result.add(new InvalidProperty(RunAsBean.Shared.getRunAsUserKey(), "The user must be specified."));
          }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsRunTypeExtension.java`
#### Snippet
```java
          }

          if (StringUtil.isEmpty(password)) {
            result.add(new InvalidProperty(RunAsBean.Shared.getRunAsPasswordKey(), "The password must be specified."));
          }
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlListProviderImpl.java`
#### Snippet
```java

  private void appendAcl(final List<AccessControlEntry> aceList, final String agentAclStr) {
    if (!StringUtil.isEmptyOrSpaces(agentAclStr)) {
      for (AccessControlEntry ace : myFileAccessParser.parse(agentAclStr)) {
        aceList.add(ace);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.agent` is unnecessary, and can be replaced with an import
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsToolProvider.java`
#### Snippet
```java
    @NotNull final ToolProvidersRegistry toolProvidersRegistry) {

    toolProvidersRegistry.registerToolProvider(new jetbrains.buildServer.agent.ToolProvider() {
      @Override
      public boolean supports(@NotNull final String toolName) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getExitCode` may produce `NullPointerException`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
      try {
        final ExecResult res = myCommandLineExecutor.runProcess(scriptCmd, 600);
        if (res.getExitCode() != 0) {
          LOG.warn("RunAs is not supported");
          return;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlList.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
```

### UNUSED_IMPORT
Unused import `import java.util.LinkedHashSet;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlList.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class AccessControlList implements Iterable<AccessControlEntry> {
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.Nullable;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlListProvider.java`
#### Snippet
```java

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface AccessControlListProvider {
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlResourceImpl.java`
#### Snippet
```java
package jetbrains.buildServer.runAs.agent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlResourceImpl.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jetbrains.buildServer.dotNet.buildRunner.agent.CommandLineExecutionContext;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlResourceImpl.java`
#### Snippet
```java
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jetbrains.buildServer.dotNet.buildRunner.agent.CommandLineExecutionContext;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.ExecResult;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/FileAccessService.java`
#### Snippet
```java
package jetbrains.buildServer.runAs.agent;

import jetbrains.buildServer.ExecResult;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.dotNet.buildRunner.agent.RunnerParametersService;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsSetupBuilder.java`
#### Snippet
```java
import jetbrains.buildServer.dotNet.buildRunner.agent.CommandLineSetup;
import jetbrains.buildServer.dotNet.buildRunner.agent.CommandLineSetupBuilder;
import jetbrains.buildServer.dotNet.buildRunner.agent.RunnerParametersService;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsBean.java`
#### Snippet
```java

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import jetbrains.buildServer.runAs.common.Constants;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ConfigurationImpl.java`
#### Snippet
```java

          String key = line.substring(0, index).trim();
          String value = line.substring(index + 1, line.length()).trim();
          myMap.put(key, value);
      }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/FileAccessParser.java`
#### Snippet
```java
public class FileAccessParser implements TextParser<AccessControlList> {
  private static final Logger LOG = Logger.getInstance(FileAccessParser.class.getName());
  private static final Pattern OutAccessPattern = Pattern.compile("\\s*([gbsrcua\\s]+)\\s*([\\+\\-rwx\\s]+)\\s*,(.+)", Pattern.CASE_INSENSITIVE);

  @NotNull
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxFileAccessService.java`
#### Snippet
```java

        case All:
          permissionsList.add(0, "a+");
          break;

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsFileAccessService.java`
#### Snippet
```java
    final EnumSet<AccessPermissions> permissions = entry.getPermissions();
    if(permissions.size() == 0) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsFileAccessService.java`
#### Snippet
```java
      final ExecResult result = myCommandLineExecutor.runProcess(icaclsCommandLineSetup, EXECUTION_TIMEOUT_SECONDS);
      if(result == null ) {
        return null;
      }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`newAcl.size() == 0` can be replaced with 'newAcl.isEmpty()'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ScopedFileAccessService.java`
#### Snippet
```java
    }

    if(newAcl.size() == 0) {
      return Collections.emptyList();
    }
```

### SizeReplaceableByIsEmpty
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ConfigurationImpl.java`
#### Snippet
```java

          line = line.trim();
          if(line.length() == 0) {
            continue;
          }
```

### SizeReplaceableByIsEmpty
`permissions.size() == 0` can be replaced with 'permissions.isEmpty()'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsFileAccessService.java`
#### Snippet
```java
  private Result<AccessControlEntry, Boolean> tryApplyAccess(@NotNull final AccessControlEntry entry) {
    final EnumSet<AccessPermissions> permissions = entry.getPermissions();
    if(permissions.size() == 0) {
      return null;
    }
```

### SizeReplaceableByIsEmpty
`grantedPermissionList.size() > 0` can be replaced with '!grantedPermissionList.isEmpty()'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsFileAccessService.java`
#### Snippet
```java
    }

    if(grantedPermissionList.size() > 0) {
      args.add(new CommandLineArgument("/grant", CommandLineArgument.Type.PARAMETER));
      final boolean recursive = permissions.contains(AccessPermissions.Recursive);
```

### SizeReplaceableByIsEmpty
`deniedPermissionList.size() > 0` can be replaced with '!deniedPermissionList.isEmpty()'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsFileAccessService.java`
#### Snippet
```java
    }

    if(deniedPermissionList.size() > 0) {
      args.add(new CommandLineArgument("/deny", CommandLineArgument.Type.PARAMETER));
      final boolean recursive = permissions.contains(AccessPermissions.Recursive);
```

### SizeReplaceableByIsEmpty
`permissions.size() == 0` can be replaced with 'permissions.isEmpty()'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxFileAccessService.java`
#### Snippet
```java
    List<Result<AccessControlEntry, Boolean>> results = new ArrayList<Result<AccessControlEntry, Boolean>>();
    final EnumSet<AccessPermissions> permissions = entry.getPermissions();
    if(permissions.size() == 0) {
      return results;
    }
```

### SizeReplaceableByIsEmpty
`permissionsList.size() > 0` can be replaced with '!permissionsList.isEmpty()'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxFileAccessService.java`
#### Snippet
```java
    }

    if(permissionsList.size() > 0)
    {
      switch (account.getTargetType()) {
```

### SizeReplaceableByIsEmpty
`permissionsList.size() > 0` can be replaced with '!permissionsList.isEmpty()'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxFileAccessService.java`
#### Snippet
```java
    }

    if(permissionsList.size() > 0)
    {
      switch (account.getTargetType()) {
```

### SizeReplaceableByIsEmpty
`userCredentials.getAdditionalArgs().size() > 0` can be replaced with '!userCredentials.getAdditionalArgs().isEmpty()'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsSettingsGenerator.java`
#### Snippet
```java
    }

    if(sb.length() > 0 && userCredentials.getAdditionalArgs().size() > 0) {
      sb.append(LINE_SEPARATOR);
    }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsRunTypeExtension.java`
#### Snippet
```java
      @Override
      public Object[] toArray() {
        return new Object[0];
      }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsRunTypeExtension.java`
#### Snippet
```java
      public <T> T[] toArray(@NotNull final T[] a) {
        //noinspection unchecked
        return (T[])new String[0];
      }

```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasError |= !result.isSuccessful() || (result.getValue() != null && !result.getValue())`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ScopedFileAccessService.java`
#### Snippet
```java
    for (Result<AccessControlEntry, Boolean> result: myFileAccessService.setAccess(new AccessControlList(newAcl))) {
      results.add(result);
      hasError |= !result.isSuccessful() || (result.getValue() != null && !result.getValue());
    }

```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlAccount.java`
#### Snippet
```java
    return LogUtils.toString(
      "Account",
      new LinkedHashMap<String, Object>() {{
      this.put("Type", myTargetType);
      this.put("UserName", myUserName);
```

### DoubleBraceInitialization
Double brace initialization
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/Result.java`
#### Snippet
```java
    return LogUtils.toString(
      "Result",
      new LinkedHashMap<String, Object>() {{
        this.put("Context", myContext);
        this.put("IsSuccessful", myIsSuccessful);
```

### DoubleBraceInitialization
Double brace initialization
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/UserCredentials.java`
#### Snippet
```java
    return LogUtils.toString(
      "UserCredentials",
      new HashMap<String, Object>() {{
        this.put("Profile", myProfile);
        this.put("User", myUser);
```

### DoubleBraceInitialization
Double brace initialization
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlEntry.java`
#### Snippet
```java
    return LogUtils.toString(
      "ACE",
      new LinkedHashMap<String, Object>() {{
        this.put("File", myFile);
        this.put("Account", myAccount);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LogUtils.java`
#### Snippet
```java
    }

    return name + "{ " + value.toString() + " }";
  }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/CmdGenerator.java`
#### Snippet
```java

  public CmdGenerator(
    @NotNull final Converter<String, String> argumentConverter) {
    myArgumentConverter = argumentConverter;
  }
```

### BoundedWildcard
Can generalize to `? extends AccessControlEntry`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlList.java`
#### Snippet
```java
  private final ArrayList<AccessControlEntry> myAccessControlEntries = new ArrayList<AccessControlEntry>();

  AccessControlList(final Iterable<AccessControlEntry> accessControlEntries) {
    for (AccessControlEntry entry: accessControlEntries) {
      myAccessControlEntries.add(entry);
```

### BoundedWildcard
Can generalize to `? super String`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    }

    private void onWindows(final @NotNull Map<String, String> parameters, final ToolProvider toolProvider) {
      try {
        myCommandLineExecutor.runProcess(OurIcaclsCmdLineSetup, 600);
```

### BoundedWildcard
Can generalize to `? super String`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    }

    private void onWindows(final @NotNull Map<String, String> parameters, final ToolProvider toolProvider) {
      try {
        myCommandLineExecutor.runProcess(OurIcaclsCmdLineSetup, 600);
```

### BoundedWildcard
Can generalize to `? super String`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    }

    private void onLinuxBased(final @NotNull Map<String, String> parameters, final ToolProvider toolProvider, final String script) {
      try {
        myCommandLineExecutor.runProcess(OurChmodHelpCmdLineSetup, 600);
```

### BoundedWildcard
Can generalize to `? super String`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    }

    private void onLinuxBased(final @NotNull Map<String, String> parameters, final ToolProvider toolProvider, final String script) {
      try {
        myCommandLineExecutor.runProcess(OurChmodHelpCmdLineSetup, 600);
```

### BoundedWildcard
Can generalize to `? super String`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ShGenerator.java`
#### Snippet
```java

  public ShGenerator(
    @NotNull final Converter<String, String> argumentConverter) {
    myArgumentConverter = argumentConverter;
  }
```

### BoundedWildcard
Can generalize to `? extends AccessControlList`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlListProviderImpl.java`
#### Snippet
```java
  public AccessControlListProviderImpl(
    @NotNull final PathsService pathsService,
    @NotNull final TextParser<AccessControlList> fileAccessParser,
    @NotNull final AgentParametersService agentParametersService,
    @NotNull final ProfileParametersService profileParametersService) {
```

### BoundedWildcard
Can generalize to `? super AccessControlEntry`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlListProviderImpl.java`
#### Snippet
```java
  }

  private void appendAcl(final List<AccessControlEntry> aceList, final String agentAclStr) {
    if (!StringUtil.isEmptyOrSpaces(agentAclStr)) {
      for (AccessControlEntry ace : myFileAccessParser.parse(agentAclStr)) {
```

### BoundedWildcard
Can generalize to `? super UserCredentials`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPlatformSpecificSetupBuilder.java`
#### Snippet
```java
    @NotNull final ResourcePublisher beforeBuildPublisher,
    @NotNull final AccessControlResource accessControlResource,
    @NotNull final ResourceGenerator<UserCredentials> userCredentialsGenerator,
    @NotNull final ResourceGenerator<RunAsParams> runAsCmdGenerator,
    @NotNull final FileAccessService fileAccessService,
```

### BoundedWildcard
Can generalize to `? super RunAsParams`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPlatformSpecificSetupBuilder.java`
#### Snippet
```java
    @NotNull final AccessControlResource accessControlResource,
    @NotNull final ResourceGenerator<UserCredentials> userCredentialsGenerator,
    @NotNull final ResourceGenerator<RunAsParams> runAsCmdGenerator,
    @NotNull final FileAccessService fileAccessService,
    @NotNull final RunAsLogger runAsLogger,
```

### BoundedWildcard
Can generalize to `? super String`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPlatformSpecificSetupBuilder.java`
#### Snippet
```java
    @NotNull final RunAsLogger runAsLogger,
    @NotNull final RunAsAccessService runAsAccessService,
    @NotNull final Converter<String, String> argumentConverter,
    @NotNull final String commandFileExtension) {
    myUserCredentialsService = userCredentialsService;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `username` initializer `null` is redundant
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsFileAccessService.java`
#### Snippet
```java

    final AccessControlAccount account = entry.getAccount();
    String username = null;
    switch (account.getTargetType()) {
      case User:
```

## RuleId[id=NullableProblems]
### NullableProblems
Primitive type members cannot be annotated
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/Result.java`
#### Snippet
```java

public class Result<TContext, TValue> {
  @NotNull private final boolean myIsSuccessful;
  @NotNull private TContext myContext;
  @Nullable private TValue myValue;
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @NotNull`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/Converter.java`
#### Snippet
```java

public interface Converter<TSource, TDestination> {
  @NotNull TDestination convert(final @NotNull TSource source);
}

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
  }

  private void protectProperties(final @NotNull AgentRunningBuild runningBuild) {
    myProfileParametersService.load();
    final Set<String> propertySets = myProfileParametersService.getProfiles();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    }

    private void onWindows(final @NotNull Map<String, String> parameters, final ToolProvider toolProvider) {
      try {
        myCommandLineExecutor.runProcess(OurIcaclsCmdLineSetup, 600);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    }

    private void onLinuxBased(final @NotNull Map<String, String> parameters, final ToolProvider toolProvider, final String script) {
      try {
        myCommandLineExecutor.runProcess(OurChmodHelpCmdLineSetup, 600);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java

  private void protectProperty(
    final @NotNull AgentRunningBuild runningBuild,
    final String propertyValue) {
    if (myIsHidingOfPropertyIsNotSupported) {
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlListProviderImpl.java`
#### Snippet
```java
    if(isAclDefaultsEnabled) {
      for (AccessControlEntry ace : getDefaultAcl(userCredentials.getUser())) {
        aceList.add(ace);
      }
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `getPasswordReplacerMethod == null` is always `false`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    try {
      final Method getPasswordReplacerMethod = AgentRunningBuild.class.getMethod("getPasswordReplacer");
      if (getPasswordReplacerMethod == null) {
        onHidingOfPropertyIsNotSupportedMessage();
        return;
```

### ConstantValue
Condition `passwordReplacerClass == null` is always `false`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java

      final Class<?> passwordReplacerClass = Class.forName("jetbrains.buildServer.util.PasswordReplacer");
      if (passwordReplacerClass == null) {
        onHidingOfPropertyIsNotSupportedMessage();
        return;
```

### ConstantValue
Condition `addPasswordMethod == null` is always `false`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java

      final Method addPasswordMethod = passwordReplacerClass.getMethod("addPassword", String.class);
      if (addPasswordMethod == null) {
        onHidingOfPropertyIsNotSupportedMessage();
        return;
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/Constants.java`
#### Snippet
```java
public class Constants {
    @SuppressWarnings("SpellCheckingInspection")
    public static final String ICACLS_TOOL_NAME = "ICACLS";
    public static final String CHMOD_TOOL_NAME = "chmod";
    public static final String SU_TOOL_NAME = "su";
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `RunAsToolProvider` has only 'static' members, and a 'public' constructor
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsToolProvider.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class RunAsToolProvider {
  static final String BIN_PATH = "bin";

```

