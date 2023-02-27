# teamcity-vault-vcs 
 
# Bad smells
I found 120 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StringBufferReplaceableByString | 19 | false |
| ReturnNull | 17 | false |
| AssignmentToMethodParameter | 11 | false |
| UnnecessaryModifier | 8 | true |
| DuplicateBranchesInSwitch | 7 | false |
| ObsoleteCollection | 6 | false |
| RedundantSuppression | 6 | false |
| UnnecessaryFullyQualifiedName | 6 | false |
| SizeReplaceableByIsEmpty | 5 | true |
| SystemOutErr | 5 | false |
| RedundantFieldInitialization | 4 | false |
| DataFlowIssue | 3 | false |
| BoundedWildcard | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| StringBufferReplaceableByStringBuilder | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| MagicConstant | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| CommentedOutCode | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RegExpRedundantEscape | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| AbstractClassNeverImplemented | 1 | false |
| StringEqualsEmptyString | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| UNUSED_IMPORT | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| Anonymous2MethodRef | 1 | false |
| Convert2Lambda | 1 | false |
| EmptyMethod | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
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
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
  }

  private static interface NodeVisitor {
    void visit(Node node, String fullPath);
  }
```

## RuleId[ruleID=MagicConstant]
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

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `VaultUtil` has only 'static' members, and lacks a 'private' constructor
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
 * Time: 19:32:05
 */
public final class VaultUtil {
  public static final String ROOT = "$";
  public static final String SEPARATOR = "/";
```

## RuleId[ruleID=DataFlowIssue]
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

## RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
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

## RuleId[ruleID=RegExpRedundantEscape]
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

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java
  }

  private void pushChange(Stack<ChangeInfo> changes, String actionString, ModificationInfo mi, String path, VcsChangeInfo.Type type) {
    if (ROOT.equals(path)) return;

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java

  @NotNull
  private Stack<ChangeInfo> buildChangesStack() throws VcsException {
    final Stack<ChangeInfo> changes = new Stack<ChangeInfo>();

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java
  @NotNull
  private Stack<ChangeInfo> buildChangesStack() throws VcsException {
    final Stack<ChangeInfo> changes = new Stack<ChangeInfo>();

    for (RawChangeInfo rawChangeInfo : myConnection.getFolderHistory(myTargetPath, myFromVersion, myToVersion)) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java
  @NotNull
  private Stack<ChangeInfo> buildChangesStack() throws VcsException {
    final Stack<ChangeInfo> changes = new Stack<ChangeInfo>();

    for (RawChangeInfo rawChangeInfo : myConnection.getFolderHistory(myTargetPath, myFromVersion, myToVersion)) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java
  }

  private void processRawChangeInfo(@NotNull Stack<ChangeInfo> changes, @NotNull RawChangeInfo rawChangeInfo) throws VcsException {

    final String repoPath = VaultUtil.getFullRepoPathWithCommonPart(rawChangeInfo.getPath(), myTargetPath);
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java

  private void addFolderContent(@NotNull String historyFolderPath,
                                @NotNull Stack<ChangeInfo> changes,
                                @Nullable String actionString,
                                @NotNull ModificationInfo mi) throws VcsException {
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
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

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`path.length() != 0` can be replaced with '!path.isEmpty()'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystem.java`
#### Snippet
```java

  public static boolean checkPath(String path) {
    return path.length() != 0 && !path.startsWith("/") && !path.endsWith("/") && !path.contains("//");
  }

```

### SizeReplaceableByIsEmpty
`targetPath.length() == 0` can be replaced with 'targetPath.isEmpty()'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
      targetPath = StringUtil.EMPTY;
    }
    return (targetPath.length() == 0 ? "" : targetPath + "/") + path;
  }

```

### SizeReplaceableByIsEmpty
`targetPath.length() == 0` can be replaced with 'targetPath.isEmpty()'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
      targetPath = targetPath.substring(0, targetPath.length() - 1);
    }
    return (targetPath.length() == 0 ? "" : targetPath + "/") + path;
  }

```

### SizeReplaceableByIsEmpty
`myChildren.size() > 0` can be replaced with '!myChildren.isEmpty()'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultPathHistory.java`
#### Snippet
```java

    public boolean hasChildren() {
      return myChildren.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`node.children.size() == 0` can be replaced with 'node.children.isEmpty()'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
      node.nullify();
      node = parent;
    } while (node != root && node.children.size() == 0 && !node.marker);
    return true;
  }
```

## RuleId[ruleID=StringBufferReplaceableByString]
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
  private void fail(String message)
    throws VcsException {
    message = (new StringBuilder()).append("Incorrect change set: ").append(message).toString();
    LOG.warn(message);
    if (myStrict)
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

## RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
   * @see #add(String, boolean, boolean)
   */
  public void toCollections(final Collection<String> newFiles,
                            final Collection<String> modifiedFiles,
                            final Collection<String> newDirectories) {
```

### BoundedWildcard
Can generalize to `? super String`
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
   */
  public void toCollections(final Collection<String> newFiles,
                            final Collection<String> modifiedFiles,
                            final Collection<String> newDirectories) {
    traverseAndRun(root, new StringBuilder(), new NodeVisitor() {
```

### BoundedWildcard
Can generalize to `? super String`
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
  public void toCollections(final Collection<String> newFiles,
                            final Collection<String> modifiedFiles,
                            final Collection<String> newDirectories) {
    traverseAndRun(root, new StringBuilder(), new NodeVisitor() {
      public void visit(Node node, String fullPath) {
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `Assert` has no concrete subclass
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/util/Assert.java`
#### Snippet
```java
 * Time: 15:10:20
 */
public abstract class Assert {

  public Assert() {
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
  public static String getRepoPathFromPath(@NotNull String path) {
    if (path.startsWith(ROOT)) return path;
    return ("".equals(path) || CURRENT.equals(path)) ? ROOT : ROOT + SEPARATOR + path.replace("\\", SEPARATOR);
  }

```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
    }

    @SuppressWarnings("ConstantConditions")
    final File object = getObject(path, version);
    return object != null && object.exists();
  }
```

### RedundantSuppression
Redundant suppression
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/ModificationInfo.java`
#### Snippet
```java
  @SuppressWarnings("ConstantConditions")
  @NotNull
  private String fixComment(@Nullable String comment) {
    return StringUtil.isEmpty(comment) ? "No comment" : comment;
  }
```

### RedundantSuppression
Redundant suppression
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java
    final String relativePath = VaultUtil.getRelativePath(path, myTargetPath);
    if (StringUtil.isNotEmpty(relativePath)) {
      //noinspection ConstantConditions
      changes.push(new ChangeInfo(actionString, path, relativePath, mi, type));
    }
```

### RedundantSuppression
Redundant suppression
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("deprecation")
  public String getCurrentVersion(@NotNull VcsRoot root) throws VcsException {
    return getOrCreateConnection(root).getFolderVersion(VaultUtil.ROOT);
  }
```

### RedundantSuppression
Redundant suppression
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java

          if (StringUtil.isNotEmpty(fromVersion)) {
            //noinspection ConstantConditions
            if (!fromVersion.equals(toVersion)) {
             patchBuilder.buildIncrementalPatch(fromVersion, toVersion);
```

### RedundantSuppression
Redundant suppression
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/VaultApiJarClassLoader.java`
#### Snippet
```java
  //@Override since 8.1
  @SuppressWarnings("override")
  protected void addJar(@NotNull final File jar) {
    addURL(toUrl(jar));
  }
```

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `Assert` has only 'static' members, and a 'public' constructor
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/util/Assert.java`
#### Snippet
```java
 * Time: 15:10:20
 */
public abstract class Assert {

  public Assert() {
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
        if (!verbose) {
          if (node.marker) {
            System.out.println(fullPath);
          }
        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
          }
        } else {
          System.out.print(fullPath);
          if (!node.isFile) {
            System.out.print("/");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
          System.out.print(fullPath);
          if (!node.isFile) {
            System.out.print("/");
          }
          if (node.marker) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
          }
          if (node.marker) {
            System.out.print("$");
          }
          System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
            System.out.print("$");
          }
          System.out.println();
        }
      }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/VaultApiJarClassLoader.java`
#### Snippet
```java

  private static boolean isLog4j(@NotNull String fileName) {
    return fileName.matches("log4j\\-.*\\.jar");
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
  public static String getRepoPathFromPath(@NotNull String path) {
    if (path.startsWith(ROOT)) return path;
    return ("".equals(path) || CURRENT.equals(path)) ? ROOT : ROOT + SEPARATOR + path.replace("\\", SEPARATOR);
  }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
   * A shorcut (when there is no need to distinguish files and directories).
   *
   * @see #toCollections(java.util.Collection, java.util.Collection, java.util.Collection)}
   */
  public void toCollection(final Collection<String> files) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
   * A shorcut (when there is no need to distinguish files and directories).
   *
   * @see #toCollections(java.util.Collection, java.util.Collection, java.util.Collection)}
   */
  public void toCollection(final Collection<String> files) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
   * A shorcut (when there is no need to distinguish files and directories).
   *
   * @see #toCollections(java.util.Collection, java.util.Collection, java.util.Collection)}
   */
  public void toCollection(final Collection<String> files) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
   * A shorcut (when there is no need to distinguish new files and modified files).
   *
   * @see #toCollections(java.util.Collection, java.util.Collection, java.util.Collection)}
   */
  public void toCollections(final Collection<String> files, final Collection<String> directories) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
   * A shorcut (when there is no need to distinguish new files and modified files).
   *
   * @see #toCollections(java.util.Collection, java.util.Collection, java.util.Collection)}
   */
  public void toCollections(final Collection<String> files, final Collection<String> directories) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
   * A shorcut (when there is no need to distinguish new files and modified files).
   *
   * @see #toCollections(java.util.Collection, java.util.Collection, java.util.Collection)}
   */
  public void toCollections(final Collection<String> files, final Collection<String> directories) {
```

## RuleId[ruleID=UNUSED_IMPORT]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Assert()` of an abstract class should not be declared 'public'
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/util/Assert.java`
#### Snippet
```java
public abstract class Assert {

  public Assert() {
  }

```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new VcsConnectionCallable\>() can be replaced with method reference
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/DisposableVaultConnection.java`
#### Snippet
```java
  @NotNull
  public List<RepositoryInfo> getRepositories() throws VcsException {
    return doInLoginLogout(new VcsConnectionCallable<List<RepositoryInfo>>() {
      @NotNull
      public List<RepositoryInfo> call() throws VcsException {
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new FilenameFilter() can be replaced with lambda
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
  private File getObjectFromParent(@NotNull final String name, @Nullable File parent) {
    if (parent == null) return null;
    final File[] files = parent.listFiles(new FilenameFilter() {
      public boolean accept(final File d, final String n) {
        return name.equals(n);
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
      }

      public void dispose() {
//        try to preserve caches for patch building
//        connection.resetCaches();
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java

  private static class Node {
    Edge parent = null;
    Map<String, Edge> children = new TreeMap<String, Edge>();
    boolean isFile = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
    Map<String, Edge> children = new TreeMap<String, Edge>();
    boolean isFile = false;
    boolean isNew = false;
    boolean marker = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
    Edge parent = null;
    Map<String, Edge> children = new TreeMap<String, Edge>();
    boolean isFile = false;
    boolean isNew = false;
    boolean marker = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
    boolean isFile = false;
    boolean isNew = false;
    boolean marker = false;

    Edge findEdge(String value) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `targetPath`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
  @NotNull
  public static String getFullPathWithCommonPart(@NotNull String path, @NotNull String targetPath) {
    targetPath = targetPath.replace('\\', '/');
    if (targetPath.endsWith("/")) {
      targetPath = targetPath.substring(0, targetPath.length() - 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `targetPath`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
    targetPath = targetPath.replace('\\', '/');
    if (targetPath.endsWith("/")) {
      targetPath = targetPath.substring(0, targetPath.length() - 1);
    }
    if (targetPath.contains("/")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `targetPath`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
    }
    if (targetPath.contains("/")) {
      targetPath = targetPath.substring(0, targetPath.lastIndexOf("/"));
    } else {
      targetPath = StringUtil.EMPTY;
```

### AssignmentToMethodParameter
Assignment to method parameter `targetPath`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
      targetPath = targetPath.substring(0, targetPath.lastIndexOf("/"));
    } else {
      targetPath = StringUtil.EMPTY;
    }
    return (targetPath.length() == 0 ? "" : targetPath + "/") + path;
```

### AssignmentToMethodParameter
Assignment to method parameter `targetPath`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
  @NotNull
  public static String getFullPath(@NotNull String path, @NotNull String targetPath) {
    targetPath = targetPath.replace('\\', '/');
    if (targetPath.endsWith("/")) {
      targetPath = targetPath.substring(0, targetPath.length() - 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `targetPath`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java
    targetPath = targetPath.replace('\\', '/');
    if (targetPath.endsWith("/")) {
      targetPath = targetPath.substring(0, targetPath.length() - 1);
    }
    return (targetPath.length() == 0 ? "" : targetPath + "/") + path;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultChangeCollector.java`
#### Snippet
```java

  private boolean isBranchedPath(@NotNull String path) {
    path = VaultUtil.getPathFromRepoPath(path);

    for (final String s : myBranchedPaths) {
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultPathHistory.java`
#### Snippet
```java
    final StringBuffer path = new StringBuffer(node.getName());
    do {
      node = node.getParent();
      path.insert(0, "/").insert(0, node.getName());
    } while (node != myRoot);
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultPathHistory.java`
#### Snippet
```java
    do {
      final String name = node.getName();
      node = node.getParent();
      node.removeChild(name);
      if (myPathMap.containsKey(node.getNewPath()) || node.hasChildren()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/ChangesPatchBuilder.java`
#### Snippet
```java
  private void fail(String message)
    throws VcsException {
    message = (new StringBuilder()).append("Incorrect change set: ").append(message).toString();
    LOG.warn(message);
    if (myStrict)
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
                            boolean isFile, boolean isNew) {
    for (int i = from; i < components.length; ++i) {
      node = node.addEdge(components[i]).to;
    }
    node.marker = true;
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/TeamCityVaultConnectionProxy.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/connection/DisposableVaultConnection.java`
#### Snippet
```java
      public Object call() throws VcsException {
        myConnection.labelFolder(path, version, label);
        return null;
      }
    });
```

### ReturnNull
Return of `null`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultUtil.java`
#### Snippet
```java

    if (StringUtil.isNotEmpty(targetPath)) {
      return relativePath.startsWith(targetPath) ? relativePath.substring(targetPath.length() + 1) : null;
    }

```

### ReturnNull
Return of `null`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
  @Nullable
  public Map<String, String> convertToVcsRootProperties(@NotNull final VcsUrl vcsUrl) throws VcsException {
    if (vcsUrl.getCredentials() == null) return null;

    try {
```

### ReturnNull
Return of `null`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
      throw new VcsException(t.getMessage(), t);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
      return matcher.group(1);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultVcsSupport.java`
#### Snippet
```java
      return matcher.group(1);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
        } else {
          getObject(path, fileVersion, false, cached);
          return cached.exists() ? cached : null;
        }
      } else if (isExistingFolder(path)) {
```

### ReturnNull
Return of `null`
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
        } else {
          getObject(path, folderVersion, true, cached);
          return cached.exists() ? cached : null;
        }
      } else {
```

### ReturnNull
Return of `null`
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
  @Nullable
  private File getObjectFromParent(@NotNull final String name, @Nullable File parent) {
    if (parent == null) return null;
    final File[] files = parent.listFiles(new FilenameFilter() {
      public boolean accept(final File d, final String n) {
```

### ReturnNull
Return of `null`
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
      }
    });
    return files == null ||  files.length == 0 ? null : files[0];
  }

```

### ReturnNull
Return of `null`
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
        final RawChangeInfo.RawChangeInfoType type = RawChangeInfo.RawChangeInfoType.getType(VaultHistoryType.GetHistoryTypeName(source.get_HistItemType()));

        if (type == RawChangeInfo.RawChangeInfoType.NOT_CHANGED) return null;

        final String name = source.get_Name();
```

### ReturnNull
Return of `null`
in `vault-connection/src/jetbrains/buildServer/buildTriggers/vcs/vault/impl/VaultConnectionImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultPathHistory.java`
#### Snippet
```java
        node = node.getChild(name);
      } else {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
        node = edge.to;
      } else {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `changes-patch-builder/src/jetbrains/buildServer/vcs/patches/fs/MemoryFileSystemImpl.java`
#### Snippet
```java
      }
    }
    return (node.isFile == isFile) ? node : null;
  }

```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer path` may be declared as 'StringBuilder'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultPathHistory.java`
#### Snippet
```java

  private String getTreeNodePath(@NotNull Node node) {
    final StringBuffer path = new StringBuffer(node.getName());
    do {
      node = node.getParent();
```

### StringBufferReplaceableByStringBuilder
`StringBuffer suffix` may be declared as 'StringBuilder'
in `vault-server/src/jetbrains/buildServer/buildTriggers/vcs/vault/VaultPathHistory.java`
#### Snippet
```java
    final String[] components = newPath.split("/");
    String path = newPath;
    final StringBuffer suffix = new StringBuffer();  
    for (int i = components.length - 1; i > 0 ; --i) {
      if (myPathMap.containsKey(path)) {
```

## RuleId[ruleID=UnnecessaryLocalVariable]
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

