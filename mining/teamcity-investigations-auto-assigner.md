# teamcity-investigations-auto-assigner 
 
# Bad smells
I found 49 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 13 | false |
| MissortedModifiers | 10 | false |
| StaticCallOnSubclass | 6 | false |
| RedundantFieldInitialization | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| UnnecessaryFullyQualifiedName | 2 | false |
| UNUSED_IMPORT | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| RefusedBequest | 1 | false |
| EqualsAndHashcode | 1 | false |
## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/Constants.java`
#### Snippet
```java
import jetbrains.buildServer.ArtifactsConstants;

public class Constants {
  // Plugin's ids
  public static final String BUILD_FEATURE_TYPE = "InvestigationsAutoAssigner";
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/Utils.java`
#### Snippet
```java
import jetbrains.buildServer.serverSide.STestRun;

public class Utils {
  public static String getLogPrefix(STestRun sTestRun) {
    return String.format("Build: id:%s , test: %s ::", sTestRun.getBuildId(), sTestRun.getTest().getTestNameId());
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/TargetProjectFinder.java`
#### Snippet
```java
    final String preferredProjectExtId = ((ProjectEx)baseProject).getInternalParameterValue(PREFERRED_INVESTIGATION_PROJECT, "");

    if (tryDetectPreferredProject && StringUtil.isNotEmpty(preferredProjectExtId)) {
      final SProject p = myProjectManager.findProjectByExternalId(preferredProjectExtId);
      if (p != null && !p.isRootProject() && (currentUser == null || hasModifyPermission(currentUser, p))) {
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/AutoAssignerBuildFeature.java`
#### Snippet
```java
      sb.append("On second failure strategy").append("\n");
    }
    if (StringUtil.isNotEmpty(userName)) {
      sb.append("Default assignee: ").append(userName).append("\n");
    }
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/AutoAssignerBuildFeature.java`
#### Snippet
```java
      sb.append("Default assignee: ").append(userName).append("\n");
    }
    if (StringUtil.isNotEmpty(usersToIgnore)) {
      String usersToIgnoreOneLine = StringUtil.join(", ", Arrays.asList(usersToIgnore.split("\n")));
      sb.append("Users to ignore: ").append(usersToIgnoreOneLine);
```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/CustomParameters.java`
#### Snippet
```java
    @Nullable
    String maxTestsPerBuildNumber = build.getBuildOwnParameters().get(Constants.MAX_TESTS_PER_BUILD_NUMBER);
    if (StringUtil.isNotEmpty(maxTestsPerBuildNumber)) {
      return parseThreshold(maxTestsPerBuildNumber);
    }
```

### StaticCallOnSubclass
Static method `parseInt()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/CustomParameters.java`
#### Snippet
```java

  private static int parseThreshold(@NotNull String value) {
    int parsedValue = StringUtil.parseInt(value, Constants.DEFAULT_TEST_COUNT_THRESHOLD);
    return parsedValue >= 0 ? parsedValue : Integer.MAX_VALUE;
  }
```

### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/heuristics/DefaultUserHeuristic.java`
#### Snippet
```java
    SBuild build = heuristicContext.getBuild();
    String defaultResponsible = CustomParameters.getDefaultResponsible(build);
    if (StringUtil.isEmpty(defaultResponsible)) return result;

    UserEx responsibleUser = myUserModel.findUserAccount(null, defaultResponsible);
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.openapi.diagnostic` is unnecessary, and can be replaced with an import
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/FlakyTestDetector.java`
#### Snippet
```java
   */
  private boolean instanceNotFound = false;
  private final com.intellij.openapi.diagnostic.Logger LOGGER = com.intellij.openapi.diagnostic.Logger.getInstance(FlakyTestDetector.class.getName());

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.openapi.diagnostic` is unnecessary, and can be replaced with an import
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/FlakyTestDetector.java`
#### Snippet
```java
   */
  private boolean instanceNotFound = false;
  private final com.intellij.openapi.diagnostic.Logger LOGGER = com.intellij.openapi.diagnostic.Logger.getInstance(FlakyTestDetector.class.getName());

  /**
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/ProblemTextExtractor.java`
#### Snippet
```java
package jetbrains.buildServer.investigationsAutoAssigner.utils;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import jetbrains.buildServer.BuildProblemTypes;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.serverSide.Parameter;`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/TargetProjectFinder.java`
#### Snippet
```java
package jetbrains.buildServer.investigationsAutoAssigner.utils;

import jetbrains.buildServer.serverSide.Parameter;
import jetbrains.buildServer.serverSide.ProjectManager;
import jetbrains.buildServer.serverSide.SProject;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`shownDescription = shownDescription + " with the first test failure"` could be simplified to 'shownDescription += " with the first test failure"'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/representation/AutoAssignerDetailsController.java`
#### Snippet
```java
      String shownDescription = responsibility.getDescription();
      if (firstFailedBuild != null && firstFailedBuild.getBuildId() != buildId && shownDescription.endsWith("build")) {
        shownDescription = shownDescription + " with the first test failure";
      }
      modelAndView.getModel().put("shownDescription", shownDescription);
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `myStatistics` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/persistent/StatisticsReporter.java`
#### Snippet
```java
public class StatisticsReporter {
  private final StatisticsDao myStatisticsDao;
  private Statistics myStatistics;

  public StatisticsReporter(StatisticsDaoFactory statisticsDaoFactory,
```

## RuleId[ruleID=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/persistent/Statistics.java`
#### Snippet
```java

  @Override
  protected Statistics clone() {
    return new Statistics(version, values);
  }
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `uniqueResponsibilities` may be replaced with 'entrySet()' iteration
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/BuildProblemsAssigner.java`
#### Snippet
```java

    Set<Responsibility> uniqueResponsibilities = responsibilityToBuildProblem.keySet();
    for (Responsibility responsibility : uniqueResponsibilities) {
      if (responsibility != null) {
        LOGGER.info(String.format("Automatically assigning investigation(s) to %s in %s because user %s",
```

### KeySetIterationMayUseEntrySet
Iteration over `uniqueResponsibilities` may be replaced with 'entrySet()' iteration
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/FailedTestAssigner.java`
#### Snippet
```java

    Set<Responsibility> uniqueResponsibilities = responsibilityToTestNames.keySet();
    for (Responsibility responsibility : uniqueResponsibilities) {
      if (responsibility != null) {
        List<TestName> testNameList = responsibilityToTestNames.get(responsibility);
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/FailedBuildInfo.java`
#### Snippet
```java
  private final HeuristicResult myHeuristicResult = new HeuristicResult();
  private final boolean myShouldDelayAssignments;
  private int myProcessedCount = 0;

  public FailedBuildInfo(final SBuild sBuild, final boolean shouldDelayAssignments) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/FlakyTestDetector.java`
#### Snippet
```java
   * Whether InstanceNotFoundException has been caught.
   */
  private boolean instanceNotFound = false;
  private final com.intellij.openapi.diagnostic.Logger LOGGER = com.intellij.openapi.diagnostic.Logger.getInstance(FlakyTestDetector.class.getName());

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/HeuristicContext.java`
#### Snippet
```java
  private final SBuild mySBuild;
  private final Set<String> myUsersToIgnore;
  private Set<Long> myCommitersIds = null;

  public HeuristicContext(SBuild sBuild,
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `project`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/InvestigationsManager.java`
#### Snippet
```java
    do {
      result.add(project.getProjectId());
      project = project.getParentProject();
    } while (project != null);
    return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `buildProblems`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/ResponsibleUserFinder.java`
#### Snippet
```java
      HeuristicResult heuristicResult = heuristic.findResponsibleUser(heuristicContext);

      buildProblems = heuristicContext.getBuildProblems()
                                      .stream()
                                      .filter(buildProblem -> heuristicResult.getResponsibility(buildProblem) == null)
```

### AssignmentToMethodParameter
Assignment to method parameter `testRuns`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/ResponsibleUserFinder.java`
#### Snippet
```java
                                      .collect(Collectors.toList());

      testRuns = heuristicContext.getTestRuns()
                                 .stream()
                                 .filter(sTestRun -> heuristicResult.getResponsibility(sTestRun) == null)
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/persistent/Statistics.java`
#### Snippet
```java
import jetbrains.buildServer.investigationsAutoAssigner.common.Constants;

class Statistics implements Cloneable {

  private final String version;
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`withoutExtension.length() == 0` can be replaced with 'withoutExtension.isEmpty()'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/ModificationAnalyzerFactory.java`
#### Snippet
```java
    final List<String> parts = new ArrayList<>();
    String withoutExtension = FileUtil.getNameWithoutExtension(new File(filePath));
    if (withoutExtension.length() == 0) {
      return Collections.emptyList();
    }
```

### SizeReplaceableByIsEmpty
`committers.size() == 0` can be replaced with 'committers.isEmpty()'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/ModificationAnalyzerFactory.java`
#### Snippet
```java
    public User getOnlyCommitter(Set<String> usersToIgnore) throws HeuristicNotApplicableException {
      Collection<SUser> committers = myVcsChange.getCommitters();
      if (committers.size() == 0) {
        throw new HeuristicNotApplicableException(
          "committer \"" + myVcsChange.getUserName() + "\" does not have corresponding TeamCity user");
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends BuildProblem`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/FailedBuildInfo.java`
#### Snippet
```java
  }

  public void addProcessedBuildProblems(@NotNull Collection<BuildProblem> buildProblems) {
    for (BuildProblem buildProblem : buildProblems) {
      myProcessedBuildProblems.add(buildProblem.getId());
```

### BoundedWildcard
Can generalize to `? extends STestRun`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/FailedBuildInfo.java`
#### Snippet
```java
  }

  public void addProcessedTestRuns(@NotNull Collection<STestRun> tests) {
    for (STestRun testRun : tests) {
      myProcessedTests.add(testRun.getTestRunId());
```

### BoundedWildcard
Can generalize to `? extends BuildProblem`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/BuildProblemsAssigner.java`
#### Snippet
```java
              final SProject sProject,
              final SBuild sBuild,
              final List<BuildProblem> buildProblems) {
    if (heuristicsResult.isEmpty()) return;

```

### BoundedWildcard
Can generalize to `? extends STestRun`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/FailedTestAssigner.java`
#### Snippet
```java
              final SProject sProject,
              final SBuild sBuild,
              final List<STestRun> sTestRuns) {
    if (heuristicsResult.isEmpty()) return;

```

### BoundedWildcard
Can generalize to `? extends STestRun`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/InvestigationsManager.java`
#### Snippet
```java

  @NotNull
  public HashMap<Long, User> findInAudit(@NotNull final Iterable<STestRun> sTestRuns, @NotNull SProject project) {
    AuditLogBuilder builder = myAuditLogProvider.getBuilder();
    builder.setActionTypes(ActionType.TEST_MARK_AS_FIXED, ActionType.TEST_INVESTIGATION_ASSIGN);
```

### BoundedWildcard
Can generalize to `? extends SVcsModification`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/heuristics/BrokenFileHeuristic.java`
#### Snippet
```java

  @Nullable
  private Responsibility findResponsibleUser(List<SVcsModification> vcsChanges,
                                             String problemText,
                                             HeuristicContext heuristicContext) {
```

### BoundedWildcard
Can generalize to `? extends BuildProblem`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/BuildProblemUtils.java`
#### Snippet
```java
  }

  private boolean containsBuildProblem(@Nullable List<BuildProblem> problems,
                                              @NotNull BuildProblem buildProblem) {
    if (problems == null) return false;
```

### BoundedWildcard
Can generalize to `? extends BuildProblem`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/BuildProblemsFilter.java`
#### Snippet
```java
  List<BuildProblem> getStillApplicable(final FailedBuildInfo failedBuildInfo,
                                        final SProject sProject,
                                        final List<BuildProblem> allBuildProblems) {
    SBuild sBuild = failedBuildInfo.getBuild();
    if (LOGGER.isDebugEnabled()) {
```

### BoundedWildcard
Can generalize to `? extends STestRun`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/persistent/AssignerArtifactDao.java`
#### Snippet
```java

  @NotNull
  private List<ResponsibilityPersistentInfo> getPersistentInfoList(@NotNull final List<STestRun> testRuns,
                                                                   @NotNull final HeuristicResult heuristicResult) {
    List<ResponsibilityPersistentInfo> result = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Heuristic`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/ResponsibleUserFinder.java`
#### Snippet
```java
  private final CustomParameters myCustomParameters;

  public ResponsibleUserFinder(@NotNull final List<Heuristic> orderedHeuristics,
                               @NotNull final CustomParameters customParameters) {
    myOrderedHeuristics = orderedHeuristics;
```

### BoundedWildcard
Can generalize to `? extends STestRun`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/FailedTestFilter.java`
#### Snippet
```java
  List<STestRun> getStillApplicable(@NotNull final FailedBuildInfo failedBuildInfo,
                                    @NotNull final SProject sProject,
                                    @NotNull final List<STestRun> testRuns,
                                    @NotNull final Map<Long, String> notApplicableTestDescription) {
    SBuild sBuild = failedBuildInfo.getBuild();
```

### BoundedWildcard
Can generalize to `? super Long`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/FailedTestFilter.java`
#### Snippet
```java
                               @NotNull final SBuild sBuild,
                               @NotNull final STestRun testRun,
                               @NotNull final Map<Long, String> notApplicableTestDescription) {
    String reason = null;

```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/FailedTestFilter.java`
#### Snippet
```java
                               @NotNull final SBuild sBuild,
                               @NotNull final STestRun testRun,
                               @NotNull final Map<Long, String> notApplicableTestDescription) {
    String reason = null;

```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/Constants.java`
#### Snippet
```java
  public final static String TEAMCITY_DIRECTORY = ArtifactsConstants.TEAMCITY_ARTIFACTS_DIR;
  public final static String TEST_RUN_IN_REQUEST = "loadedTestRun";
  public final static int DEFAULT_TEST_COUNT_THRESHOLD = 100;
  public final static String ARTIFACT_DIRECTORY = "investigationsAutoAssigner";
  public static final String PLUGIN_DATA_DIR = ARTIFACT_DIRECTORY;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/Constants.java`
#### Snippet
```java

  //Constants
  public final static String TEAMCITY_DIRECTORY = ArtifactsConstants.TEAMCITY_ARTIFACTS_DIR;
  public final static String TEST_RUN_IN_REQUEST = "loadedTestRun";
  public final static int DEFAULT_TEST_COUNT_THRESHOLD = 100;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/Constants.java`
#### Snippet
```java
  public final static String TEST_RUN_IN_REQUEST = "loadedTestRun";
  public final static int DEFAULT_TEST_COUNT_THRESHOLD = 100;
  public final static String ARTIFACT_DIRECTORY = "investigationsAutoAssigner";
  public static final String PLUGIN_DATA_DIR = ARTIFACT_DIRECTORY;
  public static final String ARTIFACT_FILENAME = "suggestions.json";
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/Constants.java`
#### Snippet
```java
  //Constants
  public final static String TEAMCITY_DIRECTORY = ArtifactsConstants.TEAMCITY_ARTIFACTS_DIR;
  public final static String TEST_RUN_IN_REQUEST = "loadedTestRun";
  public final static int DEFAULT_TEST_COUNT_THRESHOLD = 100;
  public final static String ARTIFACT_DIRECTORY = "investigationsAutoAssigner";
```

### MissortedModifiers
Missorted modifiers `private final @NotNull`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/TargetProjectFinder.java`
#### Snippet
```java
public class TargetProjectFinder {

  private final @NotNull ProjectManager myProjectManager;

  public TargetProjectFinder(@NotNull final ProjectManager projectManager) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/TargetProjectFinder.java`
#### Snippet
```java
  }

  private static boolean hasModifyPermission(final @NotNull SUser user, final SProject project) {
    return user.isPermissionGrantedForProject(project.getProjectId(), Permission.ASSIGN_INVESTIGATION) ||
           user.isPermissionGrantedForProject(project.getProjectId(), Permission.MANAGE_BUILD_PROBLEMS);
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/CustomParameters.java`
#### Snippet
```java
public class CustomParameters {
  private final static Integer MINIMAL_PROCESSING_DELAY = 5;
  private final static Integer DEFAULT_PROCESSING_DELAY_IN_SECONDS = 30;

  @Nullable
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/utils/CustomParameters.java`
#### Snippet
```java

public class CustomParameters {
  private final static Integer MINIMAL_PROCESSING_DELAY = 5;
  private final static Integer DEFAULT_PROCESSING_DELAY_IN_SECONDS = 30;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/BuildProblemsFilter.java`
#### Snippet
```java
  public final static Set<String> supportedEverywhereTypes = Collections.unmodifiableSet(
    new HashSet<>(Arrays.asList(BuildProblemTypes.TC_COMPILATION_ERROR_TYPE, BuildProblemTypes.TC_EXIT_CODE_TYPE)));
  public final static Set<String> notSupportedEverywhereTypes = Collections.unmodifiableSet(
    new HashSet<>(Arrays.asList(ErrorData.SNAPSHOT_DEPENDENCY_ERROR_BUILD_PROCEEDS_TYPE,
                                ErrorData.SNAPSHOT_DEPENDENCY_ERROR_TYPE)));
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/processing/BuildProblemsFilter.java`
#### Snippet
```java

  private static final Logger LOGGER = Constants.LOGGER;
  public final static Set<String> supportedEverywhereTypes = Collections.unmodifiableSet(
    new HashSet<>(Arrays.asList(BuildProblemTypes.TC_COMPILATION_ERROR_TYPE, BuildProblemTypes.TC_EXIT_CODE_TYPE)));
  public final static Set<String> notSupportedEverywhereTypes = Collections.unmodifiableSet(
```

