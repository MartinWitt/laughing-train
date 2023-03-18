# teamcity-local-cloud 
 
# Bad smells
I found 26 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UseOfPropertiesAsHashtable | 9 | false |
| ReturnNull | 6 | false |
| UNUSED_IMPORT | 2 | false |
| DoubleBraceInitialization | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| ProtectedMemberInFinalClass | 1 | true |
| UnnecessaryFullyQualifiedName | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| MismatchedCollectionQueryUpdate | 1 | false |
| Convert2Lambda | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java
          String poolIdStr = line.substring("agentPoolId:".length());
          try {
            Integer poolId = Integer.parseInt(poolIdStr);
            image.setAgentPoolId(poolId);
          } catch (NumberFormatException e) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java
  public String generateAgentName(@NotNull final AgentDescription agentDescription) {
    final LocalCloudImage image = findImage(agentDescription);
    if (image == null) return null;

    final String instanceId = findInstanceId(agentDescription);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java

    final String instanceId = findInstanceId(agentDescription);
    if (instanceId == null) return null;

    return generateAgentName(image, instanceId);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java
  private LocalCloudImage findImage(@NotNull final AgentDescription agentDescription) {
    final String imageId = agentDescription.getConfigurationParameters().get(LocalCloudConstants.IMAGE_ID_PARAM_NAME);
    return imageId == null ? null : findImageById(imageId);
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java
  public LocalCloudInstance findInstanceByAgent(@NotNull final AgentDescription agentDescription) {
    final LocalCloudImage image = findImage(agentDescription);
    if (image == null) return null;

    final String instanceId = findInstanceId(agentDescription);
```

### ReturnNull
Return of `null`
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java

    final String instanceId = findInstanceId(agentDescription);
    if (instanceId == null) return null;

    return image.findInstanceById(instanceId);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`images.trim().length() == 0` can be replaced with 'images.trim().isEmpty()'
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java
  public LocalCloudClient(@NotNull final CloudClientParameters params) {
    final String images = params.getParameter(LocalCloudConstants.IMAGES_PROFILE_SETTING);
    if (images == null || images.trim().length() == 0) {
      myErrorInfo = new CloudErrorInfo("No images specified");
      return;
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
    new WaitFor(STATUS_WAITING_TIMEOUT) {
      @Override
      protected boolean condition() {
        return myStatus == status;
      }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.clouds.local` is unnecessary and can be removed
in `src/jetbrains/buildServer/clouds/local/LocalCloudImage.java`
#### Snippet
```java
  @NotNull private final String myName;
  @NotNull private final File myAgentHomeDir;
  @NotNull private final Map<String, LocalCloudInstance> myInstances = new ConcurrentHashMap<String, jetbrains.buildServer.clouds.local.LocalCloudInstance>();
  @NotNull private final IdGenerator myInstanceIdGenerator = new IdGenerator();
  @Nullable private final CloudErrorInfo myErrorInfo;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.clouds.*;`
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java
package jetbrains.buildServer.clouds.local;

import jetbrains.buildServer.clouds.*;
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.AgentDescription;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.clouds.*;`
in `src/jetbrains/buildServer/clouds/local/LocalCloudImage.java`
#### Snippet
```java
package jetbrains.buildServer.clouds.local;

import jetbrains.buildServer.clouds.*;
import jetbrains.buildServer.serverSide.agentPools.AgentPool;
import org.jetbrains.annotations.NotNull;
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
      if (agentHomeDir.isDirectory()) {
        FileUtil.copyDir(agentHomeDir, myBaseDir, new FileFilter() {
          private final Set<String> ourDirsToNotToCopy = new HashSet<String>() {{
            Collections.addAll(this, "work", "temp", "system", "contrib");
          }};
```

### DoubleBraceInitialization
Double brace initialization
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
        ZipUtil.extract(agentHomeDir, myBaseDir, new FilenameFilter() {

          private final Set<String> ourDirsToNotToCopy = new HashSet<String>() {{
            Collections.addAll(this, "work", "temp", "system", "contrib");
          }};
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `LocalCloudInstance()` of an abstract class should not be declared 'public'
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
  private final ScheduledExecutorService myAsync;

  public LocalCloudInstance(@NotNull final LocalCloudImage image, @NotNull final String instanceId, @NotNull ScheduledExecutorService executor) {
    myImage = image;
    myBaseDir = createBaseDir(); // can set status to ERROR, so must be after "myStatus = ..." line
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `env` are updated, but never queried
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
    final File workDir = new File(myBaseDir, "bin");
    cmd.setWorkDirectory(workDir.getAbsolutePath());
    final Map<String, String> env = new HashMap<String, String>(System.getenv());
    //fix Java
    env.put("JAVA_HOME", System.getProperty("java.home"));
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new FilenameFilter() can be replaced with lambda
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
      for (String dir : new String[]{"bin", "launcher/bin"}) {
        final File basePath = new File(myImage.getAgentHomeDir(), dir);
        final File[] files = basePath.listFiles(new FilenameFilter() {
          @Override
          public boolean accept(File dir, String name) {
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
      final Properties config = PropertiesUtil.loadProperties(inConfigFile);

      config.put("serverUrl", data.getServerAddress());
      config.put("workDir", "../work");
      config.put("tempDir", "../temp");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java

      config.put("serverUrl", data.getServerAddress());
      config.put("workDir", "../work");
      config.put("tempDir", "../temp");
      config.put("systemDir", "../system");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
      config.put("serverUrl", data.getServerAddress());
      config.put("workDir", "../work");
      config.put("tempDir", "../temp");
      config.put("systemDir", "../system");

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
      config.put("workDir", "../work");
      config.put("tempDir", "../temp");
      config.put("systemDir", "../system");

      //agent name and auth-token must be patched only once
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
      //agent name and auth-token must be patched only once
      if (!myIsConfigPatched.getAndSet(true)) {
        config.put("name", data.getAgentName());
        config.put("authorizationToken", data.getAuthToken());
      }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
      if (!myIsConfigPatched.getAndSet(true)) {
        config.put("name", data.getAgentName());
        config.put("authorizationToken", data.getAuthToken());
      }
      for (final Map.Entry<String, String> param : data.getCustomAgentConfigurationParameters().entrySet()) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
      }
      for (final Map.Entry<String, String> param : data.getCustomAgentConfigurationParameters().entrySet()) {
        config.put(param.getKey(), param.getValue());
      }
      config.put(IMAGE_ID_PARAM_NAME, getImageId());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
        config.put(param.getKey(), param.getValue());
      }
      config.put(IMAGE_ID_PARAM_NAME, getImageId());
      config.put(INSTANCE_ID_PARAM_NAME, myId);
      PropertiesUtil.storeProperties(config, outConfigFile, null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
      }
      config.put(IMAGE_ID_PARAM_NAME, getImageId());
      config.put(INSTANCE_ID_PARAM_NAME, myId);
      PropertiesUtil.storeProperties(config, outConfigFile, null);
    }
```

