# jimfs 
 
# Bad smells
I found 158 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 30 | false |
| DataFlowIssue | 25 | false |
| PublicFieldAccessedInSynchronizedContext | 24 | false |
| AssignmentToMethodParameter | 20 | false |
| SynchronizeOnThis | 13 | false |
| NullableProblems | 11 | false |
| BoundedWildcard | 8 | false |
| RedundantFieldInitialization | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| EqualsAndHashcode | 3 | false |
| ClassNameSameAsAncestorName | 2 | false |
| MismatchedArrayReadWrite | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| UnnecessaryModifier | 1 | true |
| ThrowFromFinallyBlock | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| RegExpSimplifiable | 1 | false |
| ReturnNull | 1 | false |
| TrivialStringConcatenation | 1 | false |
| ConstantValue | 1 | false |
| RedundantSuppression | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `jimfs/src/main/java/com/google/common/jimfs/PathNormalization.java`
#### Snippet
```java
  private final int patternFlags;

  private PathNormalization(int patternFlags) {
    this.patternFlags = patternFlags;
  }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Attributes` is the same as one of its superclass' names
in `jimfs/src/main/java/com/google/common/jimfs/DosAttributeProvider.java`
#### Snippet
```java

  /** Implementation of {@link DosFileAttributes}. */
  static class Attributes extends BasicAttributeProvider.Attributes implements DosFileAttributes {

    private final boolean readOnly;
```

### ClassNameSameAsAncestorName
Class name `Attributes` is the same as one of its superclass' names
in `jimfs/src/main/java/com/google/common/jimfs/PosixAttributeProvider.java`
#### Snippet
```java

  /** Implementation of {@link PosixFileAttributes}. */
  static class Attributes extends BasicAttributeProvider.Attributes implements PosixFileAttributes {

    private final UserPrincipal owner;
```

## RuleId[ruleID=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `ZERO_ARRAY` are read, but never written to
in `jimfs/src/main/java/com/google/common/jimfs/Util.java`
#### Snippet
```java

  private static final int ARRAY_LEN = 8192;
  private static final byte[] ZERO_ARRAY = new byte[ARRAY_LEN];
  private static final byte[][] NULL_ARRAY = new byte[ARRAY_LEN][];

```

### MismatchedArrayReadWrite
Contents of array `NULL_ARRAY` are read, but never written to
in `jimfs/src/main/java/com/google/common/jimfs/Util.java`
#### Snippet
```java
  private static final int ARRAY_LEN = 8192;
  private static final byte[] ZERO_ARRAY = new byte[ARRAY_LEN];
  private static final byte[][] NULL_ARRAY = new byte[ARRAY_LEN][];

  /** Zeroes all bytes between off (inclusive) and off + len (exclusive) in the given array. */
```

## RuleId[ruleID=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
        end(completed);
      } catch (ClosedByInterruptException e) {
        throw new FileLockInterruptionException();
      }
    }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file.attribute` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/Configuration.java`
#### Snippet
```java
     *   <tr>
     *     <td>{@code "basic"}</td>
     *     <td>{@link java.nio.file.attribute.BasicFileAttributeView BasicFileAttributeView}</td>
     *     <td>{@link java.nio.file.attribute.BasicFileAttributes BasicFileAttributes}</td>
     *   </tr>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * <h3>Overview of file system design</h3>
 *
 * {@link com.google.common.jimfs.JimfsFileSystem JimfsFileSystem} instances are created by {@link
 * com.google.common.jimfs.JimfsFileSystems JimfsFileSystems} using a user-provided {@link
 * com.google.common.jimfs.Configuration Configuration}. The configuration is used to create the
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *
 * {@link com.google.common.jimfs.JimfsFileSystem JimfsFileSystem} instances are created by {@link
 * com.google.common.jimfs.JimfsFileSystems JimfsFileSystems} using a user-provided {@link
 * com.google.common.jimfs.Configuration Configuration}. The configuration is used to create the
 * various classes that implement the file system with the correct settings and to create the file
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * {@link com.google.common.jimfs.JimfsFileSystem JimfsFileSystem} instances are created by {@link
 * com.google.common.jimfs.JimfsFileSystems JimfsFileSystems} using a user-provided {@link
 * com.google.common.jimfs.Configuration Configuration}. The configuration is used to create the
 * various classes that implement the file system with the correct settings and to create the file
 * system root directories and working directory. The file system is then used to create the {@code
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *
 * <p>Once created, the primary entry points to the file system are {@link
 * com.google.common.jimfs.JimfsFileSystemProvider JimfsFileSystemProvider}, which handles calls to
 * methods in {@link java.nio.file.Files}, and {@link
 * com.google.common.jimfs.JimfsSecureDirectoryStream JimfsSecureDirectoryStream}, which provides
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * com.google.common.jimfs.JimfsFileSystemProvider JimfsFileSystemProvider}, which handles calls to
 * methods in {@link java.nio.file.Files}, and {@link
 * com.google.common.jimfs.JimfsSecureDirectoryStream JimfsSecureDirectoryStream}, which provides
 * methods that are similar to those of the file system provider but which treat relative paths as
 * relative to the stream's directory rather than the file system's working directory.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *
 * <p>The implementation of the methods on both of those classes is handled by the {@link
 * com.google.common.jimfs.FileSystemView FileSystemView} class, which acts as a view of the file
 * system with a specific working directory. The file system provider uses the file system's default
 * view, while each secure directory stream uses a view specific to that stream.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *
 * <p>File system views make use of the file system's singleton {@link
 * com.google.common.jimfs.JimfsFileStore JimfsFileStore} which handles file creation, storage and
 * attributes. The file store delegates to several other classes to handle each of these:
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *
 * <ul>
 *   <li>{@link com.google.common.jimfs.FileFactory FileFactory} handles creation of new file
 *       objects.
 *   <li>{@link com.google.common.jimfs.HeapDisk HeapDisk} handles allocation of blocks to {@link
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *   <li>{@link com.google.common.jimfs.FileFactory FileFactory} handles creation of new file
 *       objects.
 *   <li>{@link com.google.common.jimfs.HeapDisk HeapDisk} handles allocation of blocks to {@link
 *       RegularFile RegularFile} instances.
 *   <li>{@link com.google.common.jimfs.FileTree FileTree} stores the root of the file hierarchy and
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *   <li>{@link com.google.common.jimfs.HeapDisk HeapDisk} handles allocation of blocks to {@link
 *       RegularFile RegularFile} instances.
 *   <li>{@link com.google.common.jimfs.FileTree FileTree} stores the root of the file hierarchy and
 *       handles file lookup.
 *   <li>{@link com.google.common.jimfs.AttributeService AttributeService} handles file attributes,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *   <li>{@link com.google.common.jimfs.FileTree FileTree} stores the root of the file hierarchy and
 *       handles file lookup.
 *   <li>{@link com.google.common.jimfs.AttributeService AttributeService} handles file attributes,
 *       using a set of {@link com.google.common.jimfs.AttributeProvider AttributeProvider}
 *       implementations to handle each supported file attribute view.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *       handles file lookup.
 *   <li>{@link com.google.common.jimfs.AttributeService AttributeService} handles file attributes,
 *       using a set of {@link com.google.common.jimfs.AttributeProvider AttributeProvider}
 *       implementations to handle each supported file attribute view.
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * <h3>Paths</h3>
 *
 * The implementation of {@link java.nio.file.Path} for the file system is {@link
 * com.google.common.jimfs.JimfsPath JimfsPath}. Paths are created by a {@link
 * com.google.common.jimfs.PathService PathService} with help from the file system's configured
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *
 * The implementation of {@link java.nio.file.Path} for the file system is {@link
 * com.google.common.jimfs.JimfsPath JimfsPath}. Paths are created by a {@link
 * com.google.common.jimfs.PathService PathService} with help from the file system's configured
 * {@link com.google.common.jimfs.PathType PathType}.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * The implementation of {@link java.nio.file.Path} for the file system is {@link
 * com.google.common.jimfs.JimfsPath JimfsPath}. Paths are created by a {@link
 * com.google.common.jimfs.PathService PathService} with help from the file system's configured
 * {@link com.google.common.jimfs.PathType PathType}.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * com.google.common.jimfs.JimfsPath JimfsPath}. Paths are created by a {@link
 * com.google.common.jimfs.PathService PathService} with help from the file system's configured
 * {@link com.google.common.jimfs.PathType PathType}.
 *
 * <p>Paths are made up of {@link com.google.common.jimfs.Name Name} objects, which also serve as
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * {@link com.google.common.jimfs.PathType PathType}.
 *
 * <p>Paths are made up of {@link com.google.common.jimfs.Name Name} objects, which also serve as
 * the file names in directories. A name has two forms:
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * <h3>Files</h3>
 *
 * All files in the file system are an instance of {@link com.google.common.jimfs.File File}. A file
 * object contains both the file's attributes and content.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link Directory Directory} - contains a table linking file names to {@linkplain
 *       com.google.common.jimfs.DirectoryEntry directory entries}.
 *   <li>{@link RegularFile RegularFile} - an in-memory store for raw bytes.
 *   <li>{@link com.google.common.jimfs.SymbolicLink SymbolicLink} - contains a path.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *       com.google.common.jimfs.DirectoryEntry directory entries}.
 *   <li>{@link RegularFile RegularFile} - an in-memory store for raw bytes.
 *   <li>{@link com.google.common.jimfs.SymbolicLink SymbolicLink} - contains a path.
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * </ul>
 *
 * <p>{@link com.google.common.jimfs.JimfsFileChannel JimfsFileChannel}, {@link
 * com.google.common.jimfs.JimfsInputStream JimfsInputStream} and {@link
 * com.google.common.jimfs.JimfsOutputStream JimfsOutputStream} implement the standard
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *
 * <p>{@link com.google.common.jimfs.JimfsFileChannel JimfsFileChannel}, {@link
 * com.google.common.jimfs.JimfsInputStream JimfsInputStream} and {@link
 * com.google.common.jimfs.JimfsOutputStream JimfsOutputStream} implement the standard
 * channel/stream APIs for regular files.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * <p>{@link com.google.common.jimfs.JimfsFileChannel JimfsFileChannel}, {@link
 * com.google.common.jimfs.JimfsInputStream JimfsInputStream} and {@link
 * com.google.common.jimfs.JimfsOutputStream JimfsOutputStream} implement the standard
 * channel/stream APIs for regular files.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * channel/stream APIs for regular files.
 *
 * <p>{@link com.google.common.jimfs.JimfsSecureDirectoryStream JimfsSecureDirectoryStream} handles
 * reading the entries of a directory. The secure directory stream additionally contains a {@code
 * FileSystemView} with its directory as the working directory, allowing for operations relative to
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * continue to work as expected even if the directory is moved.
 *
 * <p>A directory can be watched for changes using the {@link java.nio.file.WatchService}
 * implementation, {@link com.google.common.jimfs.PollingWatchService PollingWatchService}.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 *
 * <p>A directory can be watched for changes using the {@link java.nio.file.WatchService}
 * implementation, {@link com.google.common.jimfs.PollingWatchService PollingWatchService}.
 *
 * <h3>Regular files</h3>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.jimfs` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
 * <h3>Regular files</h3>
 *
 * {@link RegularFile RegularFile} makes use of a singleton {@link com.google.common.jimfs.HeapDisk
 * HeapDisk}. A disk is a resizable factory and cache for fixed size blocks of memory. These blocks
 * are allocated to files as needed and returned to the disk when a file is deleted or truncated.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/PathNormalization.java`
#### Snippet
```java
  },

  /** Unicode decomposed normalization (form {@linkplain java.text.Normalizer.Form#NFD NFD}). */
  NFD(Pattern.CANON_EQ) {
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `jimfs/src/main/java/com/google/common/jimfs/PathNormalization.java`
#### Snippet
```java
  },

  /** Unicode composed normalization (form {@linkplain java.text.Normalizer.Form#NFC NFC}). */
  NFC(Pattern.CANON_EQ) {
    @Override
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `path.root()` might be null
in `jimfs/src/main/java/com/google/common/jimfs/FileTree.java`
#### Snippet
```java
    if (path.isAbsolute()) {
      // look up the root directory
      DirectoryEntry entry = getRoot(path.root());
      if (entry == null) {
        // root not found; always return null as no real parent directory exists
```

### DataFlowIssue
Argument `inheritedViews.get("basic")` might be null
in `jimfs/src/main/java/com/google/common/jimfs/DosAttributeProvider.java`
#### Snippet
```java
  public DosFileAttributeView view(
      FileLookup lookup, ImmutableMap<String, FileAttributeView> inheritedViews) {
    return new View(lookup, (BasicFileAttributeView) inheritedViews.get("basic"));
  }

```

### DataFlowIssue
Unboxing of `file.getAttribute("dos", "readonly")` may produce `NullPointerException`
in `jimfs/src/main/java/com/google/common/jimfs/DosAttributeProvider.java`
#### Snippet
```java
    protected Attributes(File file) {
      super(file);
      this.readOnly = (boolean) file.getAttribute("dos", "readonly");
      this.hidden = (boolean) file.getAttribute("dos", "hidden");
      this.archive = (boolean) file.getAttribute("dos", "archive");
```

### DataFlowIssue
Unboxing of `file.getAttribute("dos", "hidden")` may produce `NullPointerException`
in `jimfs/src/main/java/com/google/common/jimfs/DosAttributeProvider.java`
#### Snippet
```java
      super(file);
      this.readOnly = (boolean) file.getAttribute("dos", "readonly");
      this.hidden = (boolean) file.getAttribute("dos", "hidden");
      this.archive = (boolean) file.getAttribute("dos", "archive");
      this.system = (boolean) file.getAttribute("dos", "system");
```

### DataFlowIssue
Unboxing of `file.getAttribute("dos", "archive")` may produce `NullPointerException`
in `jimfs/src/main/java/com/google/common/jimfs/DosAttributeProvider.java`
#### Snippet
```java
      this.readOnly = (boolean) file.getAttribute("dos", "readonly");
      this.hidden = (boolean) file.getAttribute("dos", "hidden");
      this.archive = (boolean) file.getAttribute("dos", "archive");
      this.system = (boolean) file.getAttribute("dos", "system");
    }
```

### DataFlowIssue
Unboxing of `file.getAttribute("dos", "system")` may produce `NullPointerException`
in `jimfs/src/main/java/com/google/common/jimfs/DosAttributeProvider.java`
#### Snippet
```java
      this.hidden = (boolean) file.getAttribute("dos", "hidden");
      this.archive = (boolean) file.getAttribute("dos", "archive");
      this.system = (boolean) file.getAttribute("dos", "system");
    }

```

### DataFlowIssue
Argument `inheritedViews.get("basic")` might be null
in `jimfs/src/main/java/com/google/common/jimfs/PosixAttributeProvider.java`
#### Snippet
```java
    return new View(
        lookup,
        (BasicFileAttributeView) inheritedViews.get("basic"),
        (FileOwnerAttributeView) inheritedViews.get("owner"));
  }
```

### DataFlowIssue
Argument `inheritedViews.get("owner")` might be null
in `jimfs/src/main/java/com/google/common/jimfs/PosixAttributeProvider.java`
#### Snippet
```java
        lookup,
        (BasicFileAttributeView) inheritedViews.get("basic"),
        (FileOwnerAttributeView) inheritedViews.get("owner"));
  }

```

### DataFlowIssue
Argument `user` might be null
in `jimfs/src/main/java/com/google/common/jimfs/UnixAttributeProvider.java`
#### Snippet
```java
      case "uid":
        UserPrincipal user = (UserPrincipal) file.getAttribute("owner", "owner");
        return getUniqueId(user);
      case "gid":
        GroupPrincipal group = (GroupPrincipal) file.getAttribute("posix", "group");
```

### DataFlowIssue
Argument `group` might be null
in `jimfs/src/main/java/com/google/common/jimfs/UnixAttributeProvider.java`
#### Snippet
```java
      case "gid":
        GroupPrincipal group = (GroupPrincipal) file.getAttribute("posix", "group");
        return getUniqueId(group);
      case "mode":
        Set<PosixFilePermission> permissions =
```

### DataFlowIssue
Argument `permissions` might be null
in `jimfs/src/main/java/com/google/common/jimfs/UnixAttributeProvider.java`
#### Snippet
```java
        Set<PosixFilePermission> permissions =
            (Set<PosixFilePermission>) file.getAttribute("posix", "permissions");
        return toMode(permissions);
      case "ctime":
        return file.getCreationTime();
```

### DataFlowIssue
Argument `workingDirPath.root()` might be null
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystems.java`
#### Snippet
```java
    JimfsPath workingDirPath = pathService.parsePath(config.workingDirectory);

    Directory dir = fileStore.getRoot(workingDirPath.root());
    if (dir == null) {
      throw new IllegalArgumentException("Invalid working dir path: " + workingDirPath);
```

### DataFlowIssue
Argument `rootName` might be null
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystems.java`
#### Snippet
```java
      Name rootName = path.root();

      Directory rootDir = fileFactory.createRootDirectory(rootName);
      attributeService.setInitialAttributes(rootDir);
      roots.put(rootName, rootDir);
```

### DataFlowIssue
Argument `inheritedViews.get("owner")` might be null
in `jimfs/src/main/java/com/google/common/jimfs/AclAttributeProvider.java`
#### Snippet
```java
  public AclFileAttributeView view(
      FileLookup lookup, ImmutableMap<String, FileAttributeView> inheritedViews) {
    return new View(lookup, (FileOwnerAttributeView) inheritedViews.get("owner"));
  }

```

### DataFlowIssue
Argument `linkName` might be null
in `jimfs/src/main/java/com/google/common/jimfs/FileSystemView.java`
#### Snippet
```java
          lookUp(link, Options.NOFOLLOW_LINKS).requireDoesNotExist(link).directory();

      linkParent.link(linkName, existingFile);
      linkParent.setLastModifiedTime(now());
    } finally {
```

### DataFlowIssue
Argument `path.name()` might be null
in `jimfs/src/main/java/com/google/common/jimfs/FileSystemView.java`
#### Snippet
```java
      File newFile = fileCreator.get();
      store.setInitialAttributes(newFile, attrs);
      parent.link(path.name(), newFile);
      parent.setLastModifiedTime(now());
      return newFile;
```

### DataFlowIssue
Argument `source.name()` might be null
in `jimfs/src/main/java/com/google/common/jimfs/FileSystemView.java`
#### Snippet
```java
      if (move && sameFileSystem) {
        // Real move on the same file system.
        sourceParent.unlink(source.name());
        sourceParent.setLastModifiedTime(now());

```

### DataFlowIssue
Argument `dest.name()` might be null
in `jimfs/src/main/java/com/google/common/jimfs/FileSystemView.java`
#### Snippet
```java
        sourceParent.setLastModifiedTime(now());

        destParent.link(dest.name(), sourceFile);
        destParent.setLastModifiedTime(now());
      } else {
```

### DataFlowIssue
Argument `dest.name()` might be null
in `jimfs/src/main/java/com/google/common/jimfs/FileSystemView.java`
#### Snippet
```java
        // Copy the file, but don't copy its content while we're holding the file store locks.
        copyFile = destView.store.copyWithoutContent(sourceFile, attributeCopyOption);
        destParent.link(dest.name(), copyFile);
        destParent.setLastModifiedTime(now());

```

### DataFlowIssue
Argument `provider.attributesType()` might be null
in `jimfs/src/main/java/com/google/common/jimfs/AttributeService.java`
#### Snippet
```java
      byViewTypeBuilder.put(provider.viewType(), provider);
      if (provider.attributesType() != null) {
        byAttributesTypeBuilder.put(provider.attributesType(), provider);
      }

```

### DataFlowIssue
Argument `provider` might be null
in `jimfs/src/main/java/com/google/common/jimfs/AttributeService.java`
#### Snippet
```java
      Map<String, FileAttributeView> inheritedViews) {
    AttributeProvider provider = providersByViewType.get(viewType);
    createInheritedViews(lookup, provider, inheritedViews);
    return provider.view(lookup, ImmutableMap.copyOf(inheritedViews));
  }
```

### DataFlowIssue
Method invocation `viewType` may produce `NullPointerException`
in `jimfs/src/main/java/com/google/common/jimfs/AttributeService.java`
#### Snippet
```java
        AttributeProvider inheritedProvider = providersByName.get(inherited);
        FileAttributeView inheritedView =
            getFileAttributeView(lookup, inheritedProvider.viewType(), inheritedViews);

        inheritedViews.put(inherited, inheritedView);
```

### DataFlowIssue
Argument `provider` might be null
in `jimfs/src/main/java/com/google/common/jimfs/AttributeService.java`
#### Snippet
```java
      // for 'view:*' format, get all keys for all providers for the view
      AttributeProvider provider = providersByName.get(view);
      readAll(file, provider, result);

      for (String inheritedView : provider.inherits()) {
```

### DataFlowIssue
Argument `inheritedProvider` might be null
in `jimfs/src/main/java/com/google/common/jimfs/AttributeService.java`
#### Snippet
```java
      for (String inheritedView : provider.inherits()) {
        AttributeProvider inheritedProvider = providersByName.get(inheritedView);
        readAll(file, inheritedProvider, result);
      }
    } else {
```

### DataFlowIssue
Method invocation `supports` may produce `NullPointerException`
in `jimfs/src/main/java/com/google/common/jimfs/AttributeService.java`
#### Snippet
```java
      for (String inheritedView : provider.inherits()) {
        AttributeProvider inheritedProvider = providersByName.get(inheritedView);
        if (inheritedProvider.supports(attribute)) {
          inheritedProvider.set(file, view, attribute, value, create);
          return;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`root = root + "\\"` could be simplified to 'root += "\\\\"'
in `jimfs/src/main/java/com/google/common/jimfs/WindowsPathType.java`
#### Snippet
```java

      if (!root.endsWith("\\")) {
        root = root + "\\";
      }
    }
```

## RuleId[ruleID=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `jimfs/src/main/java/com/google/common/jimfs/PathURLConnection.java`
#### Snippet
```java
   */

  private static final String HTTP_DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss \'GMT\'";
  private static final String DEFAULT_CONTENT_TYPE = "application/octet-stream";

```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `jimfs/src/main/java/com/google/common/jimfs/PathURLConnection.java`
#### Snippet
```java
   */

  private static final String HTTP_DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss \'GMT\'";
  private static final String DEFAULT_CONTENT_TYPE = "application/octet-stream";

```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `defaultThreadPool` is accessed in both synchronized and unsynchronized contexts
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  }

  @NullableDecl private ExecutorService defaultThreadPool;

  /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `size` is accessed in both synchronized and unsynchronized contexts
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
  private int blockCount;

  private long size;

  /** Creates a new regular file with the given ID and using the given disk. */
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jimfs/src/main/java/com/google/common/jimfs/Configuration.java`
#### Snippet
```java
    // Attribute configuration
    private ImmutableSet<String> attributeViews = ImmutableSet.of();
    private Set<AttributeProvider> attributeProviders = null;
    private Map<String, Object> defaultAttributeValues;
    private FileTimeSource fileTimeSource = SystemFileTimeSource.INSTANCE;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jimfs/src/main/java/com/google/common/jimfs/Configuration.java`
#### Snippet
```java
    private ImmutableSet<PathNormalization> nameDisplayNormalization = ImmutableSet.of();
    private ImmutableSet<PathNormalization> nameCanonicalNormalization = ImmutableSet.of();
    private boolean pathEqualityUsesCanonicalForm = false;

    // Disk configuration
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
  }

  private int openCount = 0;
  private boolean deleted = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java

  private int openCount = 0;
  private boolean deleted = false;

  /** Returns the read lock for this file. */
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `jimfs/src/main/java/com/google/common/jimfs/UserLookupService.java`
#### Snippet
```java

  /** {@link UserPrincipal} implementation. */
  static final class JimfsUserPrincipal extends NamedPrincipal {

    private JimfsUserPrincipal(String name) {
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `jimfs/src/main/java/com/google/common/jimfs/UserLookupService.java`
#### Snippet
```java

  /** {@link GroupPrincipal} implementation. */
  static final class JimfsGroupPrincipal extends NamedPrincipal implements GroupPrincipal {

    private JimfsGroupPrincipal(String name) {
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `jimfs/src/main/java/com/google/common/jimfs/UserLookupService.java`
#### Snippet
```java

  /** Base class for {@link UserPrincipal} and {@link GroupPrincipal} implementations. */
  private abstract static class NamedPrincipal implements UserPrincipal {

    protected final String name;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `off`
in `jimfs/src/main/java/com/google/common/jimfs/Util.java`
#### Snippet
```java
    while (remaining > ARRAY_LEN) {
      System.arraycopy(NULL_ARRAY, 0, blocks, off, ARRAY_LEN);
      off += ARRAY_LEN;
      remaining -= ARRAY_LEN;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `jimfs/src/main/java/com/google/common/jimfs/Util.java`
#### Snippet
```java
    while (remaining > ARRAY_LEN) {
      System.arraycopy(ZERO_ARRAY, 0, bytes, off, ARRAY_LEN);
      off += ARRAY_LEN;
      remaining -= ARRAY_LEN;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `dir`
in `jimfs/src/main/java/com/google/common/jimfs/FileTree.java`
#### Snippet
```java
      } else {
        // root found, more names to look up; set dir to the root directory for the path
        dir = entry.file();
      }
    } else if (isEmpty(names)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `dir`
in `jimfs/src/main/java/com/google/common/jimfs/FileTree.java`
#### Snippet
```java
        }

        dir = linkResult.fileOrNull();
      } else {
        dir = file;
```

### AssignmentToMethodParameter
Assignment to method parameter `dir`
in `jimfs/src/main/java/com/google/common/jimfs/FileTree.java`
#### Snippet
```java
        dir = linkResult.fileOrNull();
      } else {
        dir = file;
      }

```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
          file.writeLock().lockInterruptibly();
          try {
            position = file.sizeWithoutLocking();
            transferred = file.transferFrom(src, position, count);
            this.position = position + transferred;
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
          file.writeLock().lockInterruptibly();
          try {
            position = file.sizeWithoutLocking();
            written = file.write(position, src);
            this.position = position + written;
```

### AssignmentToMethodParameter
Assignment to method parameter `uriPath`
in `jimfs/src/main/java/com/google/common/jimfs/WindowsPathType.java`
#### Snippet
```java
  @Override
  public ParseResult parseUriPath(String uriPath) {
    uriPath = uriPath.replace('/', '\\');
    if (uriPath.charAt(0) == '\\' && uriPath.charAt(1) != '\\') {
      // non-UNC path, so the leading / was just there for the URI path format and isn't part
```

### AssignmentToMethodParameter
Assignment to method parameter `uriPath`
in `jimfs/src/main/java/com/google/common/jimfs/WindowsPathType.java`
#### Snippet
```java
      // non-UNC path, so the leading / was just there for the URI path format and isn't part
      // of what should be parsed
      uriPath = uriPath.substring(1);
    }
    return parsePath(uriPath);
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `jimfs/src/main/java/com/google/common/jimfs/WindowsPathType.java`
#### Snippet
```java
  public String toUriPath(String root, Iterable<String> names, boolean directory) {
    if (root.startsWith("\\\\")) {
      root = root.replace('\\', '/');
    } else {
      root = "/" + root.replace('\\', '/');
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `jimfs/src/main/java/com/google/common/jimfs/WindowsPathType.java`
#### Snippet
```java
      root = root.replace('\\', '/');
    } else {
      root = "/" + root.replace('\\', '/');
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `jimfs/src/main/java/com/google/common/jimfs/WindowsPathType.java`
#### Snippet
```java
  public ParseResult parsePath(String path) {
    String original = path;
    path = path.replace('/', '\\');

    if (WORKING_DIR_WITH_DRIVE.matcher(path).matches()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `jimfs/src/main/java/com/google/common/jimfs/WindowsPathType.java`
#### Snippet
```java

    if (root != null) {
      path = path.substring(root.length());

      if (!root.endsWith("\\")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `executor`
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystemProvider.java`
#### Snippet
```java
    if (executor == null) {
      JimfsFileSystem fileSystem = (JimfsFileSystem) path.getFileSystem();
      executor = fileSystem.getDefaultThreadPool();
    }
    return channel.asAsynchronousFileChannel(executor);
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
      int read = get(block, offsetInBlock, b, off, length(offsetInBlock, remaining));
      remaining -= read;
      off += read;

      while (remaining > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
        read = get(block, 0, b, off, length(remaining));
        remaining -= read;
        off += read;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
    long start = pos;
    for (ByteBuffer buf : bufs) {
      pos += write(pos, buf);
    }
    return pos - start;
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
        break;
      } else {
        pos += read;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
    int written = put(block, offInBlock, b, off, length(offInBlock, remaining));
    remaining -= written;
    off += written;

    while (remaining > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
      written = put(block, 0, b, off, length(remaining));
      remaining -= written;
      off += written;
    }

```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[ ]` can be simplified to ' '
in `jimfs/src/main/java/com/google/common/jimfs/WindowsPathType.java`
#### Snippet
```java

  /** Pattern for matching trailing spaces in file names. */
  private static final Pattern TRAILING_SPACES = Pattern.compile("[ ]+(\\\\|$)");

  private WindowsPathType() {
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileStore.java`
#### Snippet
```java
  public <V extends FileStoreAttributeView> V getFileStoreAttributeView(Class<V> type) {
    state.checkOpen();
    return null; // no supported views
  }

```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jimfs/src/main/java/com/google/common/jimfs/JimfsSecureDirectoryStream.java`
#### Snippet
```java
  }

  protected synchronized void checkOpen() {
    if (!open) {
      throw new ClosedDirectoryStreamException();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jimfs/src/main/java/com/google/common/jimfs/FileFactory.java`
#### Snippet
```java
    private final JimfsPath target;

    protected SymbolicLinkSupplier(JimfsPath target) {
      this.target = checkNotNull(target);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jimfs/src/main/java/com/google/common/jimfs/PathService.java`
#### Snippet
```java

  /** Returns a path with the given root (or no root, if null) and the given names. */
  protected final JimfsPath createPathInternal(@NullableDecl Name root, Iterable<Name> names) {
    return new JimfsPath(this, root, names);
  }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jimfs/src/main/java/com/google/common/jimfs/BasicAttributeProvider.java`
#### Snippet
```java
  private static final class View extends AbstractAttributeView implements BasicFileAttributeView {

    protected View(FileLookup lookup) {
      super(lookup);
    }
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
    }

    synchronized (this) {
      checkNotClosed();
      if (finished) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    long written = 0; // will definitely either be assigned or an exception will be thrown

    synchronized (this) {
      boolean completed = false;
      try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    if (append) {
      // synchronize because appending does update the channel's position
      synchronized (this) {
        boolean completed = false;
        try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    checkWritable();

    synchronized (this) {
      boolean completed = false;
      try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    long read = 0; // will definitely either be assigned or an exception will be thrown

    synchronized (this) {
      boolean completed = false;
      try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    int written = 0; // will definitely either be assigned or an exception will be thrown

    synchronized (this) {
      boolean completed = false;
      try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    checkOpen();

    synchronized (this) {
      boolean completed = false;
      try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    long pos;

    synchronized (this) {
      boolean completed = false;
      try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    if (append) {
      // synchronize because appending does update the channel's position
      synchronized (this) {
        boolean completed = false;
        try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    int read = 0; // will definitely either be assigned or an exception will be thrown

    synchronized (this) {
      boolean completed = false;
      try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/PollingWatchService.java`
#### Snippet
```java
    super.close();

    synchronized (this) {
      // synchronize to ensure no new
      for (Key key : snapshots.keySet()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/PollingWatchService.java`
#### Snippet
```java
        @Override
        public void run() {
          synchronized (PollingWatchService.this) {
            for (Map.Entry<Key, Snapshot> entry : snapshots.entrySet()) {
              Key key = entry.getKey();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jimfs/src/main/java/com/google/common/jimfs/PollingWatchService.java`
#### Snippet
```java
    Snapshot snapshot = takeSnapshot(path);

    synchronized (this) {
      snapshots.put(key, snapshot);
      if (pollingFuture == null) {
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `jimfs/src/main/java/com/google/common/jimfs/PathURLConnection.java`
#### Snippet
```java

    ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
    builder.put("content-length", "" + length);
    builder.put("content-type", contentType);
    if (lastModified != null) {
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends PathNormalization`
in `jimfs/src/main/java/com/google/common/jimfs/PathNormalization.java`
#### Snippet
```java

  /** Compiles a regex pattern using flags based on the given normalizations. */
  public static Pattern compilePattern(String regex, Iterable<PathNormalization> normalizations) {
    int flags = 0;
    for (PathNormalization normalization : normalizations) {
```

### BoundedWildcard
Can generalize to `? extends PathNormalization`
in `jimfs/src/main/java/com/google/common/jimfs/PathNormalization.java`
#### Snippet
```java
   * Applies the given normalizations to the given string in order, returning the normalized result.
   */
  public static String normalize(String string, Iterable<PathNormalization> normalizations) {
    String result = string;
    for (PathNormalization normalization : normalizations) {
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
   */
  @CanIgnoreReturnValue
  public long write(long pos, Iterable<ByteBuffer> bufs) throws IOException {
    long start = pos;
    for (ByteBuffer buf : bufs) {
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `jimfs/src/main/java/com/google/common/jimfs/RegularFile.java`
#### Snippet
```java
   * read or -1 if {@code pos} is greater than or equal to the size of this file.
   */
  public long read(long pos, Iterable<ByteBuffer> bufs) {
    if (pos >= size()) {
      return -1;
```

### BoundedWildcard
Can generalize to `? super CopyOption`
in `jimfs/src/main/java/com/google/common/jimfs/FileSystemView.java`
#### Snippet
```java
      FileSystemView destView,
      JimfsPath dest,
      Set<CopyOption> options,
      boolean move)
      throws IOException {
```

### BoundedWildcard
Can generalize to `? super String`
in `jimfs/src/main/java/com/google/common/jimfs/AttributeService.java`
#### Snippet
```java
  }

  private static void addStandardProvider(Map<String, AttributeProvider> result, String view) {
    AttributeProvider provider = StandardAttributeProviders.get(view);

```

### BoundedWildcard
Can generalize to `? super AttributeProvider`
in `jimfs/src/main/java/com/google/common/jimfs/AttributeService.java`
#### Snippet
```java
  }

  private static void addStandardProvider(Map<String, AttributeProvider> result, String view) {
    AttributeProvider provider = StandardAttributeProviders.get(view);

```

### BoundedWildcard
Can generalize to `? super String`
in `jimfs/src/main/java/com/google/common/jimfs/AttributeService.java`
#### Snippet
```java
  }

  private static void readAll(File file, AttributeProvider provider, Map<String, Object> map) {
    for (String attribute : provider.attributes(file)) {
      Object value = provider.get(file, attribute);
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/DirectoryEntry.java`
#### Snippet
```java
  private final Name name;

  @NullableDecl private final File file;

  @NullableDecl DirectoryEntry next; // for use in Directory
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/DirectoryEntry.java`
#### Snippet
```java
  @NullableDecl private final File file;

  @NullableDecl DirectoryEntry next; // for use in Directory

  DirectoryEntry(Directory directory, Name name, @NullableDecl File file) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/PathType.java`
#### Snippet
```java
  public static final class ParseResult {

    @NullableDecl private final String root;
    private final Iterable<String> names;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/File.java`
#### Snippet
```java
  private FileTime lastModifiedTime;

  @NullableDecl // null when only the basic view is used (default)
  private Table<String, String, Object> attributes;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/JimfsSecureDirectoryStream.java`
#### Snippet
```java
  private final class DirectoryIterator extends AbstractIterator<Path> {

    @NullableDecl private Iterator<Name> fileNames;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/Jimfs.java`
#### Snippet
```java
   * could not be found or loaded.
   */
  @NullableDecl static final FileSystemProvider systemProvider = getSystemJimfsProvider();

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/AbstractWatchService.java`
#### Snippet
```java
    private final int count;

    @NullableDecl private final T context;

    public Event(Kind<T> kind, int count, @NullableDecl T context) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/Directory.java`
#### Snippet
```java
    return new AbstractIterator<DirectoryEntry>() {
      int index;
      @NullableDecl DirectoryEntry entry;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/JimfsAsynchronousFileChannel.java`
#### Snippet
```java
    private final ListenableFuture<R> future;
    private final CompletionHandler<R, ? super A> completionHandler;
    @NullableDecl private final A attachment;

    private CompletionHandlerCallback(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  }

  @NullableDecl private ExecutorService defaultThreadPool;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.compatqual.NullableDecl'
in `jimfs/src/main/java/com/google/common/jimfs/JimfsPath.java`
#### Snippet
```java
final class JimfsPath implements Path {

  @NullableDecl private final Name root;
  private final ImmutableList<Name> names;
  private final PathService pathService;
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
    if (isOpen()) {
      fileSystemState.unregister(this);
      file.closed();

      // file is set to null here and only here
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java

      // file is set to null here and only here
      file = null;
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
      return 0;
    }
    long available = Math.max(file.size() - pos, 0);
    return Ints.saturatedCast(available);
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
    }

    file.readLock().lock();
    try {
      int read = file.read(pos, b, off, len);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
    file.readLock().lock();
    try {
      int read = file.read(pos, b, off, len);
      if (read == -1) {
        finished = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
      }

      file.setLastAccessTime(fileSystemState.now());
      return read;
    } finally {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
      return read;
    } finally {
      file.readLock().unlock();
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java

      // available() must be an int, so the min must be also
      int skip = (int) Math.min(Math.max(file.size() - pos, 0), n);
      pos += skip;
      return skip;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
    }

    file.readLock().lock();
    try {

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
    try {

      int b = file.read(pos++); // it's ok for pos to go beyond size()
      if (b == -1) {
        finished = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
        finished = true;
      } else {
        file.setLastAccessTime(fileSystemState.now());
      }
      return b;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsInputStream.java`
#### Snippet
```java
      return b;
    } finally {
      file.readLock().unlock();
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
    checkNotClosed();

    file.writeLock().lock();
    try {
      if (append) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
    try {
      if (append) {
        pos = file.sizeWithoutLocking();
      }
      file.write(pos++, (byte) b);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
        pos = file.sizeWithoutLocking();
      }
      file.write(pos++, (byte) b);

      file.setLastModifiedTime(fileSystemState.now());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
      file.write(pos++, (byte) b);

      file.setLastModifiedTime(fileSystemState.now());
    } finally {
      file.writeLock().unlock();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
      file.setLastModifiedTime(fileSystemState.now());
    } finally {
      file.writeLock().unlock();
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
    if (isOpen()) {
      fileSystemState.unregister(this);
      file.closed();

      // file is set to null here and only here
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java

      // file is set to null here and only here
      file = null;
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
    checkNotClosed();

    file.writeLock().lock();
    try {
      if (append) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
    try {
      if (append) {
        pos = file.sizeWithoutLocking();
      }
      pos += file.write(pos, b, off, len);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
        pos = file.sizeWithoutLocking();
      }
      pos += file.write(pos, b, off, len);

      file.setLastModifiedTime(fileSystemState.now());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
      pos += file.write(pos, b, off, len);

      file.setLastModifiedTime(fileSystemState.now());
    } finally {
      file.writeLock().unlock();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `file` accessed in synchronized context
in `jimfs/src/main/java/com/google/common/jimfs/JimfsOutputStream.java`
#### Snippet
```java
      file.setLastModifiedTime(fileSystemState.now());
    } finally {
      file.writeLock().unlock();
    }
  }
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `lastModified != null` is always `true`
in `jimfs/src/main/java/com/google/common/jimfs/PathURLConnection.java`
#### Snippet
```java
    builder.put("content-length", "" + length);
    builder.put("content-type", contentType);
    if (lastModified != null) {
      DateFormat format = new SimpleDateFormat(HTTP_DATE_FORMAT, Locale.US);
      format.setTimeZone(TimeZone.getTimeZone("GMT"));
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `jimfs/src/main/java/com/google/common/jimfs/PosixAttributeProvider.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  @Override
  public ImmutableMap<String, ?> defaultValues(Map<String, ?> userProvidedDefaults) {
    Object userProvidedGroup = userProvidedDefaults.get("posix:group");

```

