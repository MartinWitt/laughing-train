# teamcity-vault-vcs 
 
# Bad smells
I found 81 bad smells with 11 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StringBufferReplaceableByString | 19 | false |
| JavadocDeclaration | 14 | false |
| UnnecessaryModifier | 8 | true |
| DuplicateBranchesInSwitch | 7 | false |
| JavadocReference | 6 | false |
| UNCHECKED_WARNING | 3 | false |
| DataFlowIssue | 3 | false |
| SpringBeanConstructorArgInspection | 3 | false |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| UnnecessaryLocalVariable | 2 | true |
| StringConcatenationInLoops | 2 | false |
| MagicConstant | 1 | false |
| UNUSED_IMPORT | 1 | false |
| CommentedOutCode | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RegExpRedundantEscape | 1 | false |
| SpringFacetInspection | 1 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SimplifiableConditionalExpression | 1 | false |
| DanglingJavadoc | 1 | false |
| RedundantTypeArguments | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/DisposableVaultConnection.java`
#### Snippet
```java
  }

  private static interface VcsConnectionCallable<T> {
    T call() throws VcsException;
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   */
  @NotNull
  public List<RepositoryInfo> getRepositories() throws VcsException ;

  /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
    }

    private RawChangeInfoType(int id, @NotNull String name) {
      myId = id;
      myName = name;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
//        public static final byte Rollback = -26;

  public static enum RawChangeInfoType {
    ADDED(10, "Added"),
    DELETED(80, "Deleted"),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
  public static interface FileContentProvider {

    public abstract File getFile(@NotNull String path, @NotNull String version)
      throws VcsException;
  }
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
  public static interface FileContentProvider {

    public abstract File getFile(@NotNull String path, @NotNull String version)
      throws VcsException;
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
 */
public class ChangesPatchBuilder {
  public static interface FileContentProvider {

    public abstract File getFile(@NotNull String path, @NotNull String version)
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
  }

  private static interface NodeVisitor {
    void visit(Node node, String fullPath);
  }
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
        final Long txId = source.get_TxID();
        final VaultDateTime txDate = source.get_TxDate();
        final Date date = new GregorianCalendar(txDate.get_Year(), txDate.get_Month() - 1, txDate.get_Day(), txDate.get_Hour(), txDate.get_Minute(), txDate.get_Second()).getTime();
        final String user = source.get_UserLogin();
        final String actionString = source.GetActionString();
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystem.java`
#### Snippet
```java

  public void toCollections(Collection newFiles, Collection modifiedFiles, Collection newDirectories) {
    myImpl.toCollections(newFiles, modifiedFiles, newDirectories);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystem.java`
#### Snippet
```java

  public void toCollections(Collection newFiles, Collection modifiedFiles, Collection newDirectories) {
    myImpl.toCollections(newFiles, modifiedFiles, newDirectories);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystem.java`
#### Snippet
```java

  public void toCollections(Collection newFiles, Collection modifiedFiles, Collection newDirectories) {
    myImpl.toCollections(newFiles, modifiedFiles, newDirectories);
  }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `VcsException`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   * @param path path to the fodler in repo
   *
   * @throws VcsException
   */
  @NotNull
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   * @param version VCS root revision
   *
   * @throws VcsException
   */
  @Nullable
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   * @param label non-empty lable text
   *
   * @throws VcsException
   */
  void labelFolder(@NotNull String path, @NotNull String version, @NotNull String label) throws VcsException;
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   *
   * @return true if the object exisits, false otherwise
   * @throws VcsException
   */
  boolean objectExists(@NotNull String path, @Nullable String version) throws VcsException;
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   *
   * @return true if the connection is alive, false otherwise
   * @throws VcsException
   */
  boolean isAlive() throws VcsException;
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   *
   * @return repo obeject or null if no object was present at the specified version
   * @throws VcsException
   */
  @Nullable
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `t instanceof VcsException` is redundant and can be replaced with a null check
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/ExceptionAwareConnection.java`
#### Snippet
```java
  @NotNull
  private VcsException toVcsException(@NotNull Throwable t) throws VcsException {
    throw (t instanceof VcsException) ? (VcsException)t : new VcsException(specifyMessage(t.getMessage()), t);
  }

```

### DataFlowIssue
Method invocation `getMessage` will produce `NullPointerException`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/ExceptionAwareConnection.java`
#### Snippet
```java
  @NotNull
  private VcsException toVcsException(@NotNull Throwable t) throws VcsException {
    throw (t instanceof VcsException) ? (VcsException)t : new VcsException(specifyMessage(t.getMessage()), t);
  }

```

### DataFlowIssue
Argument `repoIdStr` might be null
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
        if (StringUtil.isNotEmpty(repoIdStr)) {

          final int repoId = Integer.parseInt(repoIdStr);
          final String username = vcsUrl.getCredentials().getUsername();
          final String password = vcsUrl.getCredentials().getPassword();
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.vcs.*;`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
import jetbrains.buildServer.util.FileUtil;
import jetbrains.buildServer.util.StringUtil;
import jetbrains.buildServer.vcs.*;
import jetbrains.buildServer.vcs.patches.PatchBuilder;
import org.apache.log4j.Logger;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Wrong tag `User`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/FullClassLoadingVaultConnection.java`
#### Snippet
```java

/**
 * @User Victory.Bedrosova
 * 2/19/14.
 */
```

### JavadocDeclaration
Wrong tag `User`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RepositoryInfo.java`
#### Snippet
```java

/**
 * @User Victory.Bedrosova
 * 1/3/14.
 */
```

### JavadocDeclaration
Wrong tag `User`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/DelegatingVaultConnection.java`
#### Snippet
```java

/**
 * @User Victory.Bedrosova
 * 2/18/14.
 */
```

### JavadocDeclaration
Wrong tag `User`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/SmartClassLoadingVaultConnection.java`
#### Snippet
```java

/**
 * @User Victory.Bedrosova
 * 2/19/14.
 */
```

### JavadocDeclaration
Wrong tag `User`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/TeamCityVaultConnectionProxy.java`
#### Snippet
```java

/**
 * @User Victory.Bedrosova
 * 2/20/14.
 */
```

### JavadocDeclaration
Wrong tag `User`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/DisposableVaultConnection.java`
#### Snippet
```java

/**
 * @User Victory.Bedrosova
 * 2/18/14.
 */
```

### JavadocDeclaration
Wrong tag `User`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/ClassLoadingVaultConnection.java`
#### Snippet
```java

/**
 * @User Victory.Bedrosova
 * 2/18/14.
 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   * @param path path to the fodler in repo
   *
   * @throws VcsException
   */
  @NotNull
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   * @param version VCS root revision
   *
   * @throws VcsException
   */
  @Nullable
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   * @param label non-empty lable text
   *
   * @throws VcsException
   */
  void labelFolder(@NotNull String path, @NotNull String version, @NotNull String label) throws VcsException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   *
   * @return true if the object exisits, false otherwise
   * @throws VcsException
   */
  boolean objectExists(@NotNull String path, @Nullable String version) throws VcsException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   *
   * @return true if the connection is alive, false otherwise
   * @throws VcsException
   */
  boolean isAlive() throws VcsException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultConnection.java`
#### Snippet
```java
   *
   * @return repo obeject or null if no object was present at the specified version
   * @throws VcsException
   */
  @Nullable
```

### JavadocDeclaration
Wrong tag `User`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/VaultApiJarClassLoader.java`
#### Snippet
```java

/**
 * @User Victory.Bedrosova
 * 2/18/14.
 */
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (23 lines)
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
  }

//        public static final byte Added = 10;
//        public static final byte BranchedFrom = 20;
//        public static final byte BranchedFromItem = 30;
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
    final File file = new File(path);
    final String parent = file.getParent();
    return (StringUtil.isEmptyOrSpaces(parent) ? StringUtil.EMPTY : String.valueOf(parent.hashCode()) + "/") + file.getName();
  }

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/VaultApiJarClassLoader.java`
#### Snippet
```java

  private static boolean isLog4j(@NotNull String fileName) {
    return fileName.matches("log4j\\-.*\\.jar");
  }
}
```

## RuleId[id=SpringFacetInspection]
### SpringFacetInspection
Application context not configured for this file
in `vault-server/src/META-INF/build-server-plugin-vault.xml`
#### Snippet
```java
<?xml version="1.0" encoding="UTF-8"?>
<!--
  ~ Copyright 2000-2013 JetBrains s.r.o.
  ~
  ~ Licensed under the Apache License, Version 2.0 (the "License");
  ~ you may not use this file except in compliance with the License.
  ~ You may obtain a copy of the License at
  ~
  ~ http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License.
  -->
<beans     xmlns="http://www.springframework.org/schema/beans"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">
  <bean id="vaultConnectionFactory" class="jetbrains.buildServer.buildTriggers.vcs.vault.connection.TeamCityVaultConnectionProxy" />
  <bean id="vaultVcsSupport" class="jetbrains.buildServer.buildTriggers.vcs.vault.VaultVcsSupport" />
  <bean id="vaultSettingsController" class="jetbrains.buildServer.buildTriggers.vcs.vault.VaultSettingsController" />
</beans>

```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'TeamCityVaultConnectionProxy'#treeend

*** ** * ** ***

|----------------------------------------|---|-----------|
| **TeamCityVaultConnectionProxy(...):** |   | **Bean:** |
| PluginManager pluginManager            |   | **???**   |
| PluginDescriptor pluginDescriptor      |   | **???**   |
in `vault-server/src/META-INF/build-server-plugin-vault.xml`
#### Snippet
```java
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">
  <bean id="vaultConnectionFactory" class="jetbrains.buildServer.buildTriggers.vcs.vault.connection.TeamCityVaultConnectionProxy" />
  <bean id="vaultVcsSupport" class="jetbrains.buildServer.buildTriggers.vcs.vault.VaultVcsSupport" />
  <bean id="vaultSettingsController" class="jetbrains.buildServer.buildTriggers.vcs.vault.VaultSettingsController" />
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'VaultVcsSupport'#treeend

*** ** * ** ***

|------------------------------------------|---|-----------------------------------------------------------------|
| **VaultVcsSupport(...):**                |   | **Bean:**                                                       |
| CachePaths cachePaths                    |   | **???**                                                         |
| VaultConnectionFactory connectionFactory |   | Autowired: vaultConnectionFactory(TeamCityVaultConnectionProxy) |
in `vault-server/src/META-INF/build-server-plugin-vault.xml`
#### Snippet
```java
           default-autowire="constructor">
  <bean id="vaultConnectionFactory" class="jetbrains.buildServer.buildTriggers.vcs.vault.connection.TeamCityVaultConnectionProxy" />
  <bean id="vaultVcsSupport" class="jetbrains.buildServer.buildTriggers.vcs.vault.VaultVcsSupport" />
  <bean id="vaultSettingsController" class="jetbrains.buildServer.buildTriggers.vcs.vault.VaultSettingsController" />
</beans>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'VaultSettingsController'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **VaultSettingsController(...):** |   | **Bean:** |
| PluginManager pluginManager       |   | **???**   |
| PluginDescriptor descriptor       |   | **???**   |
| WebControllerManager web          |   | **???**   |
| ServerPaths serverPaths           |   | **???**   |
in `vault-server/src/META-INF/build-server-plugin-vault.xml`
#### Snippet
```java
  <bean id="vaultConnectionFactory" class="jetbrains.buildServer.buildTriggers.vcs.vault.connection.TeamCityVaultConnectionProxy" />
  <bean id="vaultVcsSupport" class="jetbrains.buildServer.buildTriggers.vcs.vault.VaultVcsSupport" />
  <bean id="vaultSettingsController" class="jetbrains.buildServer.buildTriggers.vcs.vault.VaultSettingsController" />
</beans>

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
          return getRemovedType(isFile);
        case RENAMED:
          return getAddedType(isFile);
        case RENAMED_ITEM:
          return getAddedType(isFile);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
          return getAddedType(isFile);
        case RENAMED_ITEM:
          return getAddedType(isFile);
        case MOVED_TO:
          return getAddedType(isFile);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
          return getAddedType(isFile);
        case MOVED_TO:
          return getAddedType(isFile);
        case SHARED_TO:
          return getAddedType(isFile);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
          return getAddedType(isFile);
        case SHARED_TO:
          return getAddedType(isFile);
        case CHECK_IN:
          return getChangedType(isFile);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
          return getChangedType(isFile);
        case UNDELETED:
          return getAddedType(isFile);
        case BRANCHED_FROM_ITEM:
          return getAddedType(isFile);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
          return getAddedType(isFile);
        case BRANCHED_FROM_ITEM:
          return getAddedType(isFile);
        case ROLLBACK:
          return getChangedType(isFile);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
          return getAddedType(isFile);
        case ROLLBACK:
          return getChangedType(isFile);
        default:
          return VcsChangeInfo.Type.NOT_CHANGED;
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `vault-server/src/META-INF/build-server-plugin-vault.xml`
#### Snippet
```java
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">
  <bean id="vaultConnectionFactory" class="jetbrains.buildServer.buildTriggers.vcs.vault.connection.TeamCityVaultConnectionProxy" />
  <bean id="vaultVcsSupport" class="jetbrains.buildServer.buildTriggers.vcs.vault.VaultVcsSupport" />
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `histPath` is redundant
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java
        final String histParentPath = myPathHistory.getOldPath(repoPath);

        final String histPath = misc2;
        final String currPath = myPathHistory.getNewPath(histPath);
        if (skipBranchedPath(currPath, rawChangeInfo)) return;
```

### UnnecessaryLocalVariable
Local variable `histPath` is redundant
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java

      case SHARED_TO: {
        final String histPath = misc2;
        final String currPath = myPathHistory.getNewPath(histPath);
        if (skipBranchedPath(currPath, rawChangeInfo)) return;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystem.java`
#### Snippet
```java
    LOG.debug("MemoryFileSystem create folder: " + path);
    if (containsNode(path)) {
      throw new FileSystemException((new StringBuilder()).append("Directory ").append(path).append(" already exists").toString());
    } else {
      Assert.assertFalse(myImpl.add(path, false, true), (new StringBuilder()).append("Path ").append(path).append(" already denotes a file").toString());
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystem.java`
#### Snippet
```java
      throw new FileSystemException((new StringBuilder()).append("Directory ").append(path).append(" already exists").toString());
    } else {
      Assert.assertFalse(myImpl.add(path, false, true), (new StringBuilder()).append("Path ").append(path).append(" already denotes a file").toString());
    }
  }
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystem.java`
#### Snippet
```java
  public void writeFile(String path) {
    LOG.debug("MemoryFileSystem write file: " + path);
    Assert.assertFalse(myImpl.add(path, true, false), (new StringBuilder()).append("Path ").append(path).append(" already denotes a directory").toString());
  }

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystem.java`
#### Snippet
```java
    LOG.debug("MemoryFileSystem create file: " + path);
    if (containsFile(path)) {
      throw new FileSystemException((new StringBuilder()).append("File ").append(path).append(" already exists").toString());
    } else {
      Assert.assertFalse(myImpl.add(path, true, true), (new StringBuilder()).append("Path ").append(path).append(" already denotes a directory").toString());
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystem.java`
#### Snippet
```java
      throw new FileSystemException((new StringBuilder()).append("File ").append(path).append(" already exists").toString());
    } else {
      Assert.assertFalse(myImpl.add(path, true, true), (new StringBuilder()).append("Path ").append(path).append(" already denotes a directory").toString());
    }
  }
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
      final String path = change.getFileName();
      if (!MemoryFileSystem.checkPath(path))
        throw new VcsException((new StringBuilder()).append("Incorrect path ").append(path).toString());
      final VcsChangeInfo.Type type = change.getType();

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
          case ADDED:
            if (!positive.containsAncestor(path) && negative.containsAncestor(path)) {
              fail((new StringBuilder()).append("Parent directory has been deleted, can't create a file ").append(path).append(" there").toString());
            } else {
              if (negative.containsFile(path)) {
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
          case CHANGED:
            if (!positive.containsAncestor(path) && negative.containsAncestor(path))
              fail((new StringBuilder()).append("Parent directory has been deleted, can't modify a file ").append(path).append(" there").toString());
            else if (negative.containsFile(path)) {
              fail((new StringBuilder()).append("Cannot modify a deleted file ").append(path).toString());
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
              fail((new StringBuilder()).append("Parent directory has been deleted, can't modify a file ").append(path).append(" there").toString());
            else if (negative.containsFile(path)) {
              fail((new StringBuilder()).append("Cannot modify a deleted file ").append(path).toString());
            } else {
              if (!positive.containsFile(path))
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
          case REMOVED:
            if (!positive.containsAncestor(path) && negative.containsAncestor(path)) {
              fail((new StringBuilder()).append("Parent directory for ").append(path).append(" has already been deleted").toString());
            } else {
              if (!positive.containsNewFile(path))
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
          case DIRECTORY_ADDED:
            if (!positive.containsAncestor(path) && negative.containsAncestor(path)) {
              fail((new StringBuilder()).append("Parent directory has been deleted, can't create a directory ").append(path).append(" there").toString());
            } else if (positive.containsNode(path) && !negative.containsNode(path)) {
              fail((new StringBuilder()).append("Directory ").append(path).append(" already added").toString());
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
              fail((new StringBuilder()).append("Parent directory has been deleted, can't create a directory ").append(path).append(" there").toString());
            } else if (positive.containsNode(path) && !negative.containsNode(path)) {
              fail((new StringBuilder()).append("Directory ").append(path).append(" already added").toString());
            } else {
              positive.createDirectory(path);
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
              } else {
                if (negative.containsAncestor(path))
                  fail((new StringBuilder()).append("Parent directory for ").append(path).append(" has already been deleted").toString());
                if (negative.containsDirectory(path))
                  fail((new StringBuilder()).append("Directory ").append(path).append(" has already been deleted").toString());
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
                  fail((new StringBuilder()).append("Parent directory for ").append(path).append(" has already been deleted").toString());
                if (negative.containsDirectory(path))
                  fail((new StringBuilder()).append("Directory ").append(path).append(" has already been deleted").toString());
              }
              if (negative.containsNode(path))
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java

          default:
            fail((new StringBuilder()).append("Unexpected VCS change type: ").append(type).toString());
            break;
        }
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
      LOG.debug("Create file in patch: " + path + " version: " + version);
      if (version == null)
        throw new VcsException((new StringBuilder()).append("Unexpected error: No version for ").append(path).append(" prepared").toString());
      final File content = provider.getFile(path, version);
      builder.createBinaryFile(new File(path), version, new FileInputStream(content), content.length());
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
      LOG.debug("Changed file in patch: " + path + " version: " + version);
      if (version == null)
        throw new VcsException((new StringBuilder()).append("Unexpected error: No version for ").append(path).append(" prepared").toString());
      final File content = provider.getFile(path, version);
      builder.changeOrCreateBinaryFile(new File(path), version, new FileInputStream(content), content.length());
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
  private void fail(Exception e)
    throws VcsException {
    String message = (new StringBuilder()).append("Incorrect change set: ").append(e.getMessage()).toString();
    LOG.warn(message, e);
    if (myStrict)
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
  private void fail(String message)
    throws VcsException {
    message = (new StringBuilder()).append("Incorrect change set: ").append(message).toString();
    LOG.warn(message);
    if (myStrict)
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultPathHistory.java`
#### Snippet
```java
    for (int i = components.length - 1; i > 0 ; --i) {
      if (myPathMap.containsKey(path)) {
        return getTreeNodePath(myPathMap.get(path)) + suffix.toString();
      }
      final String name = components[i];
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`vaultApiFolder == null ? false : new File(vaultApiFolder, "VaultClientOperationsLib.jar").isFile()` can be simplified to 'vaultApiFolder!=null \&\& new File(vaultApiFolder, "VaultClientOperationsLib.jar").isFile()'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultSettingsController.java`
#### Snippet
```java
  private boolean vaultApiPresent() {
    final File vaultApiFolder = TeamCityVaultConnectionProxy.getVaultApiFolder(myPluginManager);
    return vaultApiFolder == null ? false : new File(vaultApiFolder, "VaultClientOperationsLib.jar").isFile();
  }
}
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
    final File[] files = folder.listFiles();

    return files == null ? Collections.<VcsFileData>emptyList() : CollectionsUtil.convertCollection(Arrays.asList(files), new Converter<VcsFileData, File>() {
      public VcsFileData createFrom(@NotNull final File source) {
        return new VcsFileData(source.getName(), source.isDirectory());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/RawChangeInfo.java`
#### Snippet
```java
    @NotNull
    public static RawChangeInfoType getType(@NotNull final String name) {
      final RawChangeInfoType type = CollectionsUtil.findFirst(Arrays.asList(values()), new Filter<RawChangeInfoType>() {
        public boolean accept(@NotNull RawChangeInfoType data) {
          return name.equals(data.getName());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
        objectFromVersion + 1, objectToVersion, 1000);

    return CollectionsUtil.convertAndFilterNulls(Arrays.asList(vaultHistoryItems), new Converter<RawChangeInfo, VaultHistoryItem>() {
      public RawChangeInfo createFrom(@NotNull VaultHistoryItem source) {

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
  private final Node root = new Node();

  /*************************************************************************************************
   * Public API.
   ************************************************************************************************/
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
    final File[] files = folder.listFiles();

    return files == null ? Collections.<VcsFileData>emptyList() : CollectionsUtil.convertCollection(Arrays.asList(files), new Converter<VcsFileData, File>() {
      public VcsFileData createFrom(@NotNull final File source) {
        return new VcsFileData(source.getName(), source.isDirectory());
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultPathHistory.java`
#### Snippet
```java
      final String name = components[i];
      if (node == null || !node.hasChild(name)) {
        newPath += "/" + name;
        node = null;
      } else {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultPathHistory.java`
#### Snippet
```java
      if (!node.hasChild(name)) {
        if (i < (components.length - 1)) {
          np += "/" + name;
        } else {
          np = newPath;
```

