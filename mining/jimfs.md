# jimfs 
 
# Bad smells
I found 79 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 25 | false |
| NullableProblems | 19 | false |
| AutoCloseableResource | 12 | false |
| JavadocReference | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| DuplicatedCode | 3 | false |
| MismatchedArrayReadWrite | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| IgnoreResultOfCall | 2 | false |
| UnnecessaryModifier | 1 | true |
| ThrowFromFinallyBlock | 1 | false |
| FinalMethodInFinalClass | 1 | false |
| RegExpSimplifiable | 1 | false |
| TrivialStringConcatenation | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=MismatchedArrayReadWrite]
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

### MismatchedArrayReadWrite
Contents of array `ZERO_ARRAY` are read, but never written to
in `jimfs/src/main/java/com/google/common/jimfs/Util.java`
#### Snippet
```java

  private static final int ARRAY_LEN = 8192;
  private static final byte[] ZERO_ARRAY = new byte[ARRAY_LEN];
  private static final byte[][] NULL_ARRAY = new byte[ARRAY_LEN][];

```

## RuleId[id=UnnecessaryModifier]
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

## RuleId[id=ThrowFromFinallyBlock]
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileSystemState' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  @Override
  public PathMatcher getPathMatcher(String syntaxAndPattern) {
    fileStore.state().checkOpen();
    return pathService.createPathMatcher(syntaxAndPattern);
  }
```

### AutoCloseableResource
'FileSystemState' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  @Override
  public JimfsPath getPath(String first, String... more) {
    fileStore.state().checkOpen();
    return pathService.parsePath(first, more);
  }
```

### AutoCloseableResource
'FileSystemState' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
      // ensure thread pool is closed when file system is closed
      fileStore
          .state()
          .register(
              new Closeable() {
```

### AutoCloseableResource
'FileSystemState' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  /** Gets the URI of the given path in this file system. */
  public URI toUri(JimfsPath path) {
    fileStore.state().checkOpen();
    return pathService.toUri(uri, path.toAbsolutePath());
  }
```

### AutoCloseableResource
'FileSystemState' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  @Override
  public boolean isOpen() {
    return fileStore.state().isOpen();
  }

```

### AutoCloseableResource
'FileSystemState' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  @Override
  public ImmutableSet<FileStore> getFileStores() {
    fileStore.state().checkOpen();
    return ImmutableSet.<FileStore>of(fileStore);
  }
```

### AutoCloseableResource
'FileSystemState' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  @Override
  public UserPrincipalLookupService getUserPrincipalLookupService() {
    fileStore.state().checkOpen();
    return userLookupService;
  }
```

### AutoCloseableResource
'FileSystemState' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  /** Converts the given URI into a path in this file system. */
  public JimfsPath toPath(URI uri) {
    fileStore.state().checkOpen();
    return pathService.fromUri(uri);
  }
```

### AutoCloseableResource
'FileSystem' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/SystemJimfsFileSystemProvider.java`
#### Snippet
```java
      @Override
      public void run() {
        fileSystems.remove(uri);
      }
    };
```

### AutoCloseableResource
'FileChannel' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystemProvider.java`
#### Snippet
```java
      throws IOException {
    // call newFileChannel and cast so that FileChannel support is checked there
    JimfsFileChannel channel = (JimfsFileChannel) newFileChannel(path, options, attrs);
    if (executor == null) {
      JimfsFileSystem fileSystem = (JimfsFileSystem) path.getFileSystem();
```

### AutoCloseableResource
'FileSystem' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/Jimfs.java`
#### Snippet
```java
      try {
        ImmutableMap<String, ?> env = ImmutableMap.of(FILE_SYSTEM_KEY, fileSystem);
        FileSystems.newFileSystem(uri, env, SystemJimfsFileSystemProvider.class.getClassLoader());
      } catch (ProviderNotFoundException | ServiceConfigurationError ignore) {
        // See the similar catch block below for why we ignore this.
```

### AutoCloseableResource
'FileSystemState' used without 'try'-with-resources statement
in `jimfs/src/main/java/com/google/common/jimfs/FileSystemView.java`
#### Snippet
```java

  private FileTime now() {
    return state().now();
  }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `newFileSystem(URI, Map, ClassLoader)`
in `jimfs/src/main/java/com/google/common/jimfs/Jimfs.java`
#### Snippet
```java
   * it could not be found or loaded.
   *
   * <p>Like {@link FileSystems#newFileSystem(URI, Map, ClassLoader)}, this method first looks in
   * the list of {@linkplain FileSystemProvider#installedProviders() installed providers} and if not
   * found there, attempts to load it from the {@code ClassLoader} with {@link ServiceLoader}.
```

### JavadocReference
Cannot resolve symbol `Map`
in `jimfs/src/main/java/com/google/common/jimfs/Jimfs.java`
#### Snippet
```java
   * it could not be found or loaded.
   *
   * <p>Like {@link FileSystems#newFileSystem(URI, Map, ClassLoader)}, this method first looks in
   * the list of {@linkplain FileSystemProvider#installedProviders() installed providers} and if not
   * found there, attempts to load it from the {@code ClassLoader} with {@link ServiceLoader}.
```

### JavadocReference
Cannot resolve symbol `StandardOpenOption`
in `jimfs/src/main/java/com/google/common/jimfs/Options.java`
#### Snippet
```java
  /**
   * Returns an {@link ImmutableSet} copy of the given {@code options}, adding {@link
   * StandardOpenOption#WRITE} if it isn't already present.
   */
  private static ImmutableSet<OpenOption> addWrite(Collection<? extends OpenOption> options) {
```

### JavadocReference
Cannot resolve symbol `WRITE`
in `jimfs/src/main/java/com/google/common/jimfs/Options.java`
#### Snippet
```java
  /**
   * Returns an {@link ImmutableSet} copy of the given {@code options}, adding {@link
   * StandardOpenOption#WRITE} if it isn't already present.
   */
  private static ImmutableSet<OpenOption> addWrite(Collection<? extends OpenOption> options) {
```

## RuleId[id=DataFlowIssue]
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
      Map<String, FileAttributeView> inheritedViews) {
    AttributeProvider provider = providersByViewType.get(viewType);
    createInheritedViews(lookup, provider, inheritedViews);
    return provider.view(lookup, ImmutableMap.copyOf(inheritedViews));
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

## RuleId[id=UnnecessaryStringEscape]
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

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `jimfs/src/main/java/com/google/common/jimfs/PathService.java`
#### Snippet
```java

  /** Returns a path with the given root (or no root, if null) and the given names. */
  protected final JimfsPath createPathInternal(@NullableDecl Name root, Iterable<Name> names) {
    return new JimfsPath(this, root, names);
  }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    synchronized (this) {
      boolean completed = false;
      try {
        if (!beginBlocking()) {
          return 0; // AsynchronousCloseException will be thrown
        }
        file.readLock().lockInterruptibly();
        try {
          read = file.read(position, dst);
          if (read != -1) {
            position += read;
          }
          file.setLastAccessTime(fileSystemState.now());
          completed = true;
        } finally {
          file.readLock().unlock();
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      } finally {
        endBlocking(completed);
      }
    }

    return read;
```

### DuplicatedCode
Duplicated code
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileChannel.java`
#### Snippet
```java
    synchronized (this) {
      boolean completed = false;
      try {
        if (!beginBlocking()) {
          return 0; // AsynchronousCloseException will be thrown
        }
        file.writeLock().lockInterruptibly();
        try {
          if (append) {
            position = file.size();
          }
          written = file.write(position, src);
          position += written;
          file.setLastModifiedTime(fileSystemState.now());
          completed = true;
        } finally {
          file.writeLock().unlock();
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      } finally {
        endBlocking(completed);
      }
    }

    return written;
```

### DuplicatedCode
Duplicated code
in `jimfs/src/main/java/com/google/common/jimfs/Util.java`
#### Snippet
```java
    int remaining = len;
    while (remaining > ARRAY_LEN) {
      System.arraycopy(ZERO_ARRAY, 0, bytes, off, ARRAY_LEN);
      off += ARRAY_LEN;
      remaining -= ARRAY_LEN;
    }

    System.arraycopy(ZERO_ARRAY, 0, bytes, off, remaining);
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[ ]` can be simplified to ' '
in `jimfs/src/main/java/com/google/common/jimfs/WindowsPathType.java`
#### Snippet
```java

  /** Pattern for matching trailing spaces in file names. */
  private static final Pattern TRAILING_SPACES = Pattern.compile("[ ]+(\\\\|$)");

  private WindowsPathType() {
```

## RuleId[id=ProtectedMemberInFinalClass]
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

## RuleId[id=TrivialStringConcatenation]
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

## RuleId[id=NullableProblems]
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
in `jimfs/src/main/java/com/google/common/jimfs/JimfsFileSystem.java`
#### Snippet
```java
  }

  @NullableDecl private ExecutorService defaultThreadPool;

  /**
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
Not annotated method overrides method annotated with @NotNull
in `jimfs/src/main/java/com/google/common/jimfs/Directory.java`
#### Snippet
```java

  @Override
  public Iterator<DirectoryEntry> iterator() {
    return new AbstractIterator<DirectoryEntry>() {
      int index;
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
Not annotated method overrides method annotated with @NotNull
in `jimfs/src/main/java/com/google/common/jimfs/DowngradedDirectoryStream.java`
#### Snippet
```java

  @Override
  public Iterator<Path> iterator() {
    return secureDirectoryStream.iterator();
  }
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
in `jimfs/src/main/java/com/google/common/jimfs/DirectoryEntry.java`
#### Snippet
```java
  private final Name name;

  @NullableDecl private final File file;

  @NullableDecl DirectoryEntry next; // for use in Directory
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
in `jimfs/src/main/java/com/google/common/jimfs/PathType.java`
#### Snippet
```java
  public static final class ParseResult {

    @NullableDecl private final String root;
    private final Iterable<String> names;

```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `jimfs/src/main/java/com/google/common/jimfs/JimfsPath.java`
#### Snippet
```java

  @Override
  public JimfsPath resolveSibling(Path other) {
    JimfsPath otherPath = checkPath(other);
    if (otherPath == null) {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `jimfs/src/main/java/com/google/common/jimfs/JimfsPath.java`
#### Snippet
```java

  @Override
  public JimfsPath resolveSibling(String other) {
    return resolveSibling(pathService.parsePath(other));
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `jimfs/src/main/java/com/google/common/jimfs/JimfsPath.java`
#### Snippet
```java

  @Override
  public WatchKey register(
      WatchService watcher, WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers)
      throws IOException {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `jimfs/src/main/java/com/google/common/jimfs/JimfsPath.java`
#### Snippet
```java

  @Override
  public JimfsPath resolve(String other) {
    return resolve(pathService.parsePath(other));
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `jimfs/src/main/java/com/google/common/jimfs/JimfsPath.java`
#### Snippet
```java

  @Override
  public URI toUri() {
    return getJimfsFileSystem().toUri(this);
  }
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

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `jimfs/src/main/java/com/google/common/jimfs/JimfsPath.java`
#### Snippet
```java

  @Override
  public Iterator<Path> iterator() {
    return asList().iterator();
  }
```

## RuleId[id=ConstantValue]
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

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `BlockingQueue.offer()` is ignored
in `jimfs/src/main/java/com/google/common/jimfs/AbstractWatchService.java`
#### Snippet
```java
    if (key == poison) {
      // ensure other blocking threads get the poison
      queue.offer(poison);
      throw new ClosedWatchServiceException();
    }
```

### IgnoreResultOfCall
Result of `BlockingQueue.offer()` is ignored
in `jimfs/src/main/java/com/google/common/jimfs/AbstractWatchService.java`
#### Snippet
```java
    if (open.compareAndSet(true, false)) {
      queue.clear();
      queue.offer(poison);
    }
  }
```

