# teamcity-swabra 
 
# Bad smells
I found 90 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 17 | false |
| UnnecessaryModifier | 10 | true |
| DynamicRegexReplaceableByCompiledPattern | 8 | false |
| BoundedWildcard | 7 | false |
| ProtectedMemberInFinalClass | 6 | true |
| UtilityClassWithoutPrivateConstructor | 5 | true |
| MissortedModifiers | 5 | false |
| Convert2Lambda | 4 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| ThrowablePrintStackTrace | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| DataFlowIssue | 2 | false |
| CommentedOutCode | 2 | false |
| ObsoleteCollection | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| UnnecessarySemicolon | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| RedundantSuppression | 1 | false |
| NestedAssignment | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| RedundantFieldInitialization | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| ConstantValue | 1 | false |
## RuleId[ruleID=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `processesLeft` is always empty
in `agent/src/jetbrains/buildServer/swabra/processes/LockedFileResolver.java`
#### Snippet
```java

      List<ProcessInfo> processesLeft = new ArrayList<ProcessInfo>();
      processesLeft.removeAll(ignored);

      if (processesLeft.isEmpty()) return true;
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `agent/src/jetbrains/buildServer/swabra/processes/HandleOutputReader.java`
#### Snippet
```java
  private static final String NO_ADMIN_RIGHTS = "Make sure that you are an administrator.";

  public static interface LineProcessor {
    void processLine(@NotNull String line);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `agent/src/jetbrains/buildServer/swabra/snapshots/FilesCollector.java`
#### Snippet
```java
  private static final String NOT_DELETE_SNAPSHOT = "swabra.preserve.snapshot";

  public static interface CollectionResultHandler {
    void success();
    void error();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `server/src/jetbrains/buildServer/swabra/serverHealth/SwabraCleanCheckoutWatcher.java`
#### Snippet
```java
  // returns ids of the build types which recently caused swabra clean checkout for the provided build type
  @NotNull
  public Collection<String> getRecentCleanCheckoutCauses(@NotNull SBuildType buildType);
}

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FilesTraversal.java`
#### Snippet
```java
  public FilesTraversal() {}

  public static interface SimpleProcessor {
    void process(FileInfo file) throws Exception;
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FilesTraversal.java`
#### Snippet
```java
  }

  public static interface ComparisonProcessor {
    void comparisonStarted();

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `agent/src/jetbrains/buildServer/swabra/processes/LockedFileResolver.java`
#### Snippet
```java
    Collection<ProcessInfo> getLockingProcesses(@NotNull File f) throws GetProcessesException;
  }
  public static interface LockingProcessesProviderFactory {

    @Nullable
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `agent/src/jetbrains/buildServer/swabra/processes/LockedFileResolver.java`
#### Snippet
```java
  private static final int DELETION_TRIES = 10;

  public static interface LockingProcessesProvider {
    @NotNull
    Collection<ProcessInfo> getLockingProcesses(@NotNull File f) throws GetProcessesException;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `agent/src/jetbrains/buildServer/swabra/processes/LockedFileResolver.java`
#### Snippet
```java
  }

  public static interface Listener {
    void message(String m);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `agent/src/jetbrains/buildServer/swabra/SwabraPropertiesProcessor.java`
#### Snippet
```java
  }

  static enum DirectoryState {
    UNKNOWN("unknown"),
    CLEAN("clean"),
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `agent/src/jetbrains/buildServer/swabra/SwabraPropertiesProcessor.java`
#### Snippet
```java
    private final String myName;

    private DirectoryState(@NotNull String name) {
      myName = name;
    }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SnapshotUtil` has only 'static' members, and lacks a 'private' constructor
in `agent/src/jetbrains/buildServer/swabra/snapshots/SnapshotUtil.java`
#### Snippet
```java
 * Time: 14:42:00
 */
public class SnapshotUtil {
  private static final String SEPARATOR = "\t";
  private static final String LINE_SEPARATOR = "\r\n";
```

### UtilityClassWithoutPrivateConstructor
Class `HandleOutputReader` has only 'static' members, and lacks a 'private' constructor
in `agent/src/jetbrains/buildServer/swabra/processes/HandleOutputReader.java`
#### Snippet
```java
 * Time: 13:18:51
 */
public class HandleOutputReader {
  private static final Logger LOG = Logger.getLogger(HandleOutputReader.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ProcessExecutor` has only 'static' members, and lacks a 'private' constructor
in `agent/src/jetbrains/buildServer/swabra/processes/ProcessExecutor.java`
#### Snippet
```java
 * Time: 11:35:14
 */
public class ProcessExecutor {
  private static final Logger LOG = Logger.getLogger(ProcessExecutor.class);

```

### UtilityClassWithoutPrivateConstructor
Class `FilesComparator` has only 'static' members, and lacks a 'private' constructor
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FilesComparator.java`
#### Snippet
```java
 * Time: 13:22:24
 */
class FilesComparator {
  private static final String SEPARATOR_REGEX = "/".equals(File.separator) ? "/" : "\\\\";

```

### UtilityClassWithoutPrivateConstructor
Class `SwabraUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/jetbrains/buildServer/swabra/SwabraUtil.java`
#### Snippet
```java
 * Time: 15:02:17
 */
public class SwabraUtil {

  public static final String FEATURE_TYPE = "swabra";
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `server/src/jetbrains/buildServer/swabra/serverHealth/SwabraClashingConfigurationsDetector.java`
#### Snippet
```java
          relatedGroup = group;
          break;
        };
      }
      if (relatedGroup == null) {
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `path` might be null
in `agent/src/jetbrains/buildServer/swabra/processes/HandlePathProvider.java`
#### Snippet
```java
      return null;
    }
    final File handleFile = new File(path);
    if (!handleFile.isFile()) {
      logDetectionDisabled("No executable found at " + path, logger);
```

### DataFlowIssue
Argument `myPropertiesFile.getParentFile().listFiles(new FileFilter() { public boolean accept(File pathn...` might be null
in `agent/src/jetbrains/buildServer/swabra/SwabraPropertiesProcessor.java`
#### Snippet
```java

  private List<File> getSnapshotFiles() {
    return Arrays.asList(myPropertiesFile.getParentFile().listFiles(new FileFilter() {
      public boolean accept(File pathname) {
        return pathname.getName().endsWith(SNAPSHOT_SUFFIX);
      }
    }));
  }

```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (7 lines)
in `agent/src/jetbrains/buildServer/swabra/processes/ProcessExecutor.java`
#### Snippet
```java
  }

//  public static ExecResult run(@NotNull String exePath, @NotNull String[] params, SimpleBuildLogger logger) {
//    final GeneralCommandLine commandLine = new GeneralCommandLine();
//    commandLine.setExePath(exePath);
```

### CommentedOutCode
Commented out code (13 lines)
in `agent/src/jetbrains/buildServer/swabra/processes/ProcessExecutor.java`
#### Snippet
```java
  }

//  private static void info(String message, SimpleBuildLogger logger) {
//    LOG.info(message);
//    if (logger != null) {
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack`> used
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FileSystemFilesIterator.java`
#### Snippet
```java
  private final File myRootFolder;
  @NotNull private final SwabraRules myRules;
  private Stack<Iterator<File>> myIterators;
  private final boolean myRequiresListing;
  private final boolean myVerboseLogging;
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FileSystemFilesIterator.java`
#### Snippet
```java
    while (true) {
      if (myIterators == null) {
        myIterators = new Stack<Iterator<File>>();
        return processFolder(myRootFolder, myRules.shouldInclude(myRootFolder.getPath()));
      }
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `agent/src/jetbrains/buildServer/swabra/snapshots/SwabraRules.java`
#### Snippet
```java

    @Override
    protected SwabraFileRule createNewExcludeRule(final SwabraFileRule excludeRule) {
      return createNewExcludeRule(excludeRule.getFrom());
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `agent/src/jetbrains/buildServer/swabra/snapshots/SwabraRules.java`
#### Snippet
```java

    @Override
    protected SwabraFileRule createNewExcludeRule(final String line) {
      return createRule(line, false);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `agent/src/jetbrains/buildServer/swabra/snapshots/SwabraRules.java`
#### Snippet
```java

    @Override
    protected SwabraFileRule createNewIncludeRule(final SwabraFileRule includeRule) {
      return createNewIncludeRule(includeRule.getFrom());
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `agent/src/jetbrains/buildServer/swabra/snapshots/SwabraRules.java`
#### Snippet
```java

    @Override
    protected SwabraFileRule createNewIncludeRule(final String line) {
      return createRule(line, true);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `agent/src/jetbrains/buildServer/swabra/snapshots/SwabraRules.java`
#### Snippet
```java

    @Override
    protected void doPostInitProcess(@NotNull final List<SwabraFileRule> includeRules, final List<SwabraFileRule> excludeRules) {
      sortByFrom(includeRules, false);
      sortByFrom(excludeRules, true);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `server/src/jetbrains/buildServer/swabra/SwabraBuildFeature.java`
#### Snippet
```java
    web.registerController(html, new BaseController() {
      @Override
      protected ModelAndView doHandle(@NotNull final HttpServletRequest request, @NotNull final HttpServletResponse response) throws Exception {
        final ModelAndView mv = new ModelAndView(jsp);
        mv.getModel().put("handlePresent", toolsRegistry.isToolRegistered(HANDLE_TOOL));
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`handleOutput.length() == 0` can be replaced with 'handleOutput.isEmpty()'
in `agent/src/jetbrains/buildServer/swabra/processes/HandleOutputReader.java`
#### Snippet
```java

  public static boolean noResult(@NotNull String handleOutput) {
    return handleOutput.length() == 0 || handleOutput.contains(NO_RESULT);
  }

```

### SizeReplaceableByIsEmpty
`rules.length() == 0` can be replaced with 'rules.isEmpty()'
in `common/src/jetbrains/buildServer/swabra/SwabraUtil.java`
#### Snippet
```java

  public static List<String> splitRules(@NotNull String rules) {
    return rules.length() == 0 ? Collections.<String>emptyList() : Arrays.asList(rules.split(" *[,\n\r] *"));
  }

```

### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `common/src/jetbrains/buildServer/swabra/SwabraUtil.java`
#### Snippet
```java
  @NotNull
  public static List<String> fromString(@Nullable String s) {
    if (s == null || s.length() == 0) return Collections.emptyList();
    return Arrays.asList(s.split(";"));
  }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FileSystemFilesIterator.java`
#### Snippet
```java
          builder.append("\n");
        }
        LOG.warn("Too many entries in depth (" + iteratorsCount + "). Printing the list: \n" + builder.toString());
        throw new IOException("Too many entries in depth. Is there a loop. Current folder depth is more than " + MAX_DEPTH);
      }
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends SwabraSettings`
in `server/src/jetbrains/buildServer/swabra/serverHealth/SwabraClashingConfigurationsDetector.java`
#### Snippet
```java
          res.add(CollectionsUtil
                    .convertCollection(clashed.entrySet(), new Converter<SwabraSettingsGroup, Map.Entry<SwabraSettings, List<SBuildType>>>() {
                      public SwabraSettingsGroup createFrom(@NotNull final Map.Entry<SwabraSettings, List<SBuildType>> source) {
                        return new SwabraSettingsGroup(source.getKey(), source.getValue());
                      }
```

### BoundedWildcard
Can generalize to `? extends List`
in `server/src/jetbrains/buildServer/swabra/serverHealth/SwabraClashingConfigurationsDetector.java`
#### Snippet
```java
          res.add(CollectionsUtil
                    .convertCollection(clashed.entrySet(), new Converter<SwabraSettingsGroup, Map.Entry<SwabraSettings, List<SBuildType>>>() {
                      public SwabraSettingsGroup createFrom(@NotNull final Map.Entry<SwabraSettings, List<SBuildType>> source) {
                        return new SwabraSettingsGroup(source.getKey(), source.getValue());
                      }
```

### BoundedWildcard
Can generalize to `? extends File`
in `agent/src/jetbrains/buildServer/swabra/Swabra.java`
#### Snippet
```java
  }

  private void collectFiles(@NotNull Collection<File> dirs) {
   for (File dir : dirs) {
     if (myBuildInterrupted.get()) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `agent/src/jetbrains/buildServer/swabra/Swabra.java`
#### Snippet
```java
  }

  private void processDirs(@NotNull Collection<File> dirs) {
    for (File dir : dirs) {
      if (myBuildInterrupted.get()) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `agent/src/jetbrains/buildServer/swabra/Swabra.java`
#### Snippet
```java
  }

  private void makeSnapshots(@NotNull Collection<File> dirs) {
    if (!mySettings.isCleanupEnabled()) return;
    if (mySnapshotSaved) return;
```

### BoundedWildcard
Can generalize to `? super String`
in `agent/src/jetbrains/buildServer/swabra/snapshots/SwabraRules.java`
#### Snippet
```java
  }

  private static void addAsRule(@NotNull File baseDir, @NotNull Collection<String> body) {
    body.add(baseDir.getAbsolutePath());
  }
```

### BoundedWildcard
Can generalize to `? extends ProcessInfo`
in `agent/src/jetbrains/buildServer/swabra/processes/LockedFileResolver.java`
#### Snippet
```java
  }

  private void appendProcessInfos(@NotNull Collection<ProcessInfo> processes, @NotNull StringBuilder sb) {
    for (final ProcessInfo p : processes) {
      sb.append("\n").append(getProcessString(p.getPid(), p.getName()));
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `server/src/jetbrains/buildServer/swabra/HandleToolType.java`
#### Snippet
```java
  public static final String HANDLE_TOOL_TYPE_NAME = "handleTool";

  private final static HandleToolType INSTANCE = new HandleToolType();

  public static HandleToolType getInstance() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `server/src/jetbrains/buildServer/swabra/HandleToolVersion.java`
#### Snippet
```java
public class HandleToolVersion implements ToolVersion {

  private final static HandleToolVersion INSTANCE = new HandleToolVersion();

  private HandleToolVersion() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `server/src/jetbrains/buildServer/swabra/HandleToolUsageProvider.java`
#### Snippet
```java
public class HandleToolUsageProvider implements ToolUsagesProvider {

  private final static String myKey = "teamcity.tools.provideHandleToolToAllAgents";

  private final ServerToolManager myServerToolManager;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `agent/src/jetbrains/buildServer/swabra/Swabra.java`
#### Snippet
```java


  private boolean cleanupIsDisabled(final @NotNull String reason, final @NotNull AgentRunningBuild build) {
    final String failOnCleanCheckoutProperty = build.getSharedConfigParameters().get(FAIL_ON_CLEAN_CHECKOUT);
    final boolean shouldIgnoreCleanCheckout = "ignoreAndContinue".equals(failOnCleanCheckoutProperty);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `agent/src/jetbrains/buildServer/swabra/Swabra.java`
#### Snippet
```java


  private boolean cleanupIsDisabled(final @NotNull String reason, final @NotNull AgentRunningBuild build) {
    final String failOnCleanCheckoutProperty = build.getSharedConfigParameters().get(FAIL_ON_CLEAN_CHECKOUT);
    final boolean shouldIgnoreCleanCheckout = "ignoreAndContinue".equals(failOnCleanCheckoutProperty);
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `server/src/jetbrains/buildServer/swabra/serverHealth/SwabraFrequentCleanCheckoutReport.java`
#### Snippet
```java
          if (user != null) {
            final HealthStatusItem item = getStatusItem(request);
            //noinspection unchecked
            for (SBuildType bt : getBuildTypes((List<SwabraSettingsGroup>)item.getAdditionalData().get(SWABRA_CLASHING_BUILD_TYPES)) ){
              if (user.getPermissionsGrantedForProject(bt.getProjectId()).contains(Permission.EDIT_PROJECT)) {
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/SnapshotFilesIterator.java`
#### Snippet
```java
    try {
      if (myReader == null) {
        myReader = new BufferedReader(new InputStreamReader(new FileInputStream(mySnapshot), "UTF-8"));
        myRootFolder = myReader.readLine();
        myCurrentDir = "";
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `agent/src/jetbrains/buildServer/swabra/snapshots/SnapshotGenerator.java`
#### Snippet
```java
    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(snapshot), "UTF-8"));
      writer.write(getSnapshotHeader(myRootDirParent));

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/SnapshotFilesIterator.java`
#### Snippet
```java

  private static boolean hasParentOf(String dirPath, String parentDir){
    File dir = new File(dirPath.replace("/", File.separator).replace("\\", File.separator));
    File parent = new File(parentDir.replace("/", File.separator).replace("\\", File.separator));
    while (dir != null){
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/SnapshotFilesIterator.java`
#### Snippet
```java

  private static boolean hasParentOf(String dirPath, String parentDir){
    File dir = new File(dirPath.replace("/", File.separator).replace("\\", File.separator));
    File parent = new File(parentDir.replace("/", File.separator).replace("\\", File.separator));
    while (dir != null){
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/SnapshotFilesIterator.java`
#### Snippet
```java
  private static boolean hasParentOf(String dirPath, String parentDir){
    File dir = new File(dirPath.replace("/", File.separator).replace("\\", File.separator));
    File parent = new File(parentDir.replace("/", File.separator).replace("\\", File.separator));
    while (dir != null){
      if (dir.getPath().equalsIgnoreCase(parent.getPath()))
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/SnapshotFilesIterator.java`
#### Snippet
```java
  private static boolean hasParentOf(String dirPath, String parentDir){
    File dir = new File(dirPath.replace("/", File.separator).replace("\\", File.separator));
    File parent = new File(parentDir.replace("/", File.separator).replace("\\", File.separator));
    while (dir != null){
      if (dir.getPath().equalsIgnoreCase(parent.getPath()))
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/swabra/SwabraSettings.java`
#### Snippet
```java

    final List<String> res = new ArrayList<String>();
    for (String pid : pidsStr.split(" *[,;\n\r] *")) {
      if (StringUtil.isNotEmpty(pid)) res.add(pid);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/jetbrains/buildServer/swabra/SwabraUtil.java`
#### Snippet
```java

  public static List<String> splitRules(@NotNull String rules) {
    return rules.length() == 0 ? Collections.<String>emptyList() : Arrays.asList(rules.split(" *[,\n\r] *"));
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/jetbrains/buildServer/swabra/SwabraUtil.java`
#### Snippet
```java
    }

    return normalizeSeparators ? sb.toString().replace("\\", File.separator).replace("/", File.separator) : sb.toString();
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `common/src/jetbrains/buildServer/swabra/SwabraUtil.java`
#### Snippet
```java
    }

    return normalizeSeparators ? sb.toString().replace("\\", File.separator).replace("/", File.separator) : sb.toString();
  }

```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/jetbrains/buildServer/swabra/snapshots/FilesCollectionProcessorMock.java`
#### Snippet
```java
//      myFile.writeChars(message);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/jetbrains/buildServer/swabra/snapshots/FilesCollectionProcessorMock.java`
#### Snippet
```java
      myFile.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/jetbrains/buildServer/swabra/snapshots/FilesCollectionProcessorMock.java`
#### Snippet
```java
      myFile.seek(myFile.length());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/SnapshotFilesIterator.java`
#### Snippet
```java
  private FileInfo processNextRecord() throws IOException {
    String fileRecord;
    while ((fileRecord = myReader.readLine()) != null) {
      final String path = getFilePath(fileRecord);
      final long length = getFileLength(fileRecord);
```

## RuleId[ruleID=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `agent/src/jetbrains/buildServer/swabra/snapshots/SnapshotGenerator.java`
#### Snippet
```java
      } catch (IOException e) {
        myLogger.exception(e);
        return false;
      }
    }
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `myCleanupFinishedSignal` is accessed in both synchronized and unsynchronized contexts
in `agent/src/jetbrains/buildServer/swabra/SwabraPropertiesProcessor.java`
#### Snippet
```java
  private File myPropertiesFile;

  private CountDownLatch myCleanupFinishedSignal;

  public SwabraPropertiesProcessor(@NotNull final EventDispatcher<AgentLifeCycleListener> agentDispatcher,
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `server/src/jetbrains/buildServer/swabra/serverHealth/SwabraFrequentCleanCheckoutReport.java`
#### Snippet
```java
      group = new ArrayList<SwabraSettingsGroup>(group);

      Collections.sort(group, new Comparator<SwabraSettingsGroup>() {
        public int compare(final SwabraSettingsGroup o1, final SwabraSettingsGroup o2) {
          return o1.getBuildTypes().size() - o2.getBuildTypes().size();
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FileSystemFilesIterator.java`
#### Snippet
```java
    }
    final List<File> filesList = Arrays.asList(files);
    Collections.sort(filesList, new Comparator<File>() {
      public int compare(File o1, File o2) {
        final int res = FilesComparator.compareByType(o1.isFile(), o2.isFile());
```

### Convert2Lambda
Anonymous new FileFilter() can be replaced with lambda
in `agent/src/jetbrains/buildServer/swabra/SwabraPropertiesProcessor.java`
#### Snippet
```java

  private List<File> getSnapshotFiles() {
    return Arrays.asList(myPropertiesFile.getParentFile().listFiles(new FileFilter() {
      public boolean accept(File pathname) {
        return pathname.getName().endsWith(SNAPSHOT_SUFFIX);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/src/jetbrains/buildServer/swabra/SwabraPropertiesProcessor.java`
#### Snippet
```java
      }
    });
    new Thread(new Runnable() {
      public void run() {
        cleanupPropertiesAndSnapshots(actualCheckoutDirs);
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/SnapshotFilesIterator.java`
#### Snippet
```java
  private String myRootFolder;
  private String myCurrentDir;
  private String mySkipDir = null;

  public SnapshotFilesIterator(@NotNull File snapshot) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `from`
in `agent/src/jetbrains/buildServer/swabra/snapshots/SwabraRules.java`
#### Snippet
```java
  private File getPathWithoutWildcards(@NotNull File from) {
    while(from != null && from.getPath().contains("*")){
      from = from.getParentFile();
    }
    return from == null ? new File("") : from;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `agent/src/jetbrains/buildServer/swabra/snapshots/SwabraRules.java`
#### Snippet
```java

    public List<SwabraFileRule> getRulesForPath(@NotNull String path) {
      path = preparePath(path);

      final ArrayList<SwabraFileRule> rules = new ArrayList<SwabraFileRule>();
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `agent/src/jetbrains/buildServer/swabra/snapshots/SwabraRules.java`
#### Snippet
```java

    public List<String> getForPath(@NotNull String path) {
      path = preparePath(path);

      final ArrayList<String> rules = new ArrayList<String>();
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/swabra.9baeffdd/diagnostic-2023-02-28-20-40-21.126.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/swabra/serverHealth/SwabraSettings.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/SnapshotFilesIterator.java`
#### Snippet
```java
      LOG.error("Error occurred when reading from input stream", e);
      stopIterator();
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/SnapshotFilesIterator.java`
#### Snippet
```java
    }
    myReader.close();
    return null;
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/processes/HandlePathProvider.java`
#### Snippet
```java
    if (StringUtil.isEmptyOrSpaces(path)) {
      logDetectionDisabled("Path to handle.exe tool is not defined. Use Swabra settings to install handle.exe", logger);
      return null;
    }
    if (!SwabraUtil.unifyPath(path).endsWith(HANDLE_PATH_SUFFIX)) {
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/processes/HandlePathProvider.java`
#### Snippet
```java
    if (!SwabraUtil.unifyPath(path).endsWith(HANDLE_PATH_SUFFIX)) {
      logDetectionDisabled("Path to handle.exe tool must end with: " + HANDLE_PATH_SUFFIX, logger);
      return null;
    }
    final File handleFile = new File(path);
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/processes/HandlePathProvider.java`
#### Snippet
```java
    if (!handleFile.isFile()) {
      logDetectionDisabled("No executable found at " + path, logger);
      return null;
    }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/SwabraSettings.java`
#### Snippet
```java
  @Nullable
  public String getHandlePath() {
    return myHandlePath == null ? null : myHandlePath.getPath();
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/processes/WmicProcessDetailsProvider.java`
#### Snippet
```java
      LOG.debug("wmic output:\n" + stdout);

      return noDetailsAvailable(stdout) ? null : stdout;

    } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/processes/WmicProcessDetailsProvider.java`
#### Snippet
```java
    } catch (Exception e) {
      LOG.warn(e.getMessage(), e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FileSystemFilesIterator.java`
#### Snippet
```java
      }
      if (myIterators.isEmpty()) {
        return null;
      }
      final Iterator<File> it = myIterators.peek();
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FileSystemFilesIterator.java`
#### Snippet
```java
        myIterators.pop();
        if (myIterators.isEmpty()) {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FileSystemFilesIterator.java`
#### Snippet
```java
  private FileInfo processFolder(File folder, boolean createFileInfo) throws IOException{
    if (!folder.exists()){
      return null;
    }
    final File[] files = folder.listFiles();
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/snapshots/iteration/FileSystemFilesIterator.java`
#### Snippet
```java
      return createFileInfo(folder);
    else
      return null;
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/Swabra.java`
#### Snippet
```java
      public LockedFileResolver.LockingProcessesProvider createProvider(final SwabraSettings swabraSettings) {
        if (swabraSettings.getHandlePath() == null)
          return null;
        return new HandleProcessesProvider(swabraSettings.getHandlePath());
      }
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/processes/ProcessExecutor.java`
#### Snippet
```java
      @Override
      public Integer getMaxAcceptedOutputSize() {
        return null;
      }
      @Override
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/processes/LockedFileResolver.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/swabra/SwabraPropertiesProcessor.java`
#### Snippet
```java
  public synchronized String getPreviousBuildTypeId(File dir) {
    final DirInfo info = myProperties.get(unifyPath(dir));
    return info == null ? null: info.buildTypeId;
  }

```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/src/jetbrains/buildServer/swabra/processes/ProcessExecutor.java`
#### Snippet
```java

  private static ExecResult run(final GeneralCommandLine commandLine) {
    return SimpleCommandLineProcessRunner.runCommand(commandLine, new byte[0], new SimpleCommandLineProcessRunner.ProcessRunCallback() {
      @Override
      public void onProcessStarted(Process ps) {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `processesLeft.isEmpty()` is always `true`
in `agent/src/jetbrains/buildServer/swabra/processes/LockedFileResolver.java`
#### Snippet
```java
      processesLeft.removeAll(ignored);

      if (processesLeft.isEmpty()) return true;

      final StringBuilder sb
```

