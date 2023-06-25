# teamcity-investigations-auto-assigner 
 
# Bad smells
I found 26 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 18 | false |
| FieldMayBeFinal | 3 | false |
| UNUSED_IMPORT | 2 | false |
| CloneDeclaresCloneNotSupported | 1 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
| RefusedBequest | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'FailedTestAndBuildProblemsDispatcher'#treeend

*** ** * ** ***

|-----------------------------------------------------------------------|---|------------------------------------------------------|
| **FailedTestAndBuildProblemsDispatcher(...):**                        |   | **Bean:**                                            |
| BuildServerListenerEventDispatcher buildServerListenerEventDispatcher |   | **???**                                              |
| FailedTestAndBuildProblemsProcessor processor                         |   | Autowired: null(FailedTestAndBuildProblemsProcessor) |
| DelayedAssignmentsProcessor delayedAssignmentsProcessor               |   | Autowired: null(DelayedAssignmentsProcessor)         |
| AggregationLogger aggregationLogger                                   |   | Autowired: null(AggregationLogger)                   |
| StatisticsReporter statisticsReporter                                 |   | Autowired: null(StatisticsReporter)                  |
| CustomParameters customParameters                                     |   | Autowired: customParameters(CustomParameters)        |
| ServerResponsibility serverResponsibility                             |   | **???**                                              |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <!-- see http://static.springsource.org/spring/docs/3.0.x/spring-framework-reference/html/beans.html -->

  <bean class="jetbrains.buildServer.investigationsAutoAssigner.FailedTestAndBuildProblemsDispatcher"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.AutoAssignerBuildFeatureController"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.StatisticsReporter"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AutoAssignerBuildFeatureController'#treeend

*** ** * ** ***

|----------------------------------------------|---|-----------|
| **AutoAssignerBuildFeatureController(...):** |   | **Bean:** |
| SBuildServer server                          |   | **???**   |
| WebControllerManager controllerManager       |   | **???**   |
| PluginDescriptor descriptor                  |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java

  <bean class="jetbrains.buildServer.investigationsAutoAssigner.FailedTestAndBuildProblemsDispatcher"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.AutoAssignerBuildFeatureController"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.StatisticsReporter"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.StatisticsDaoFactory"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'StatisticsReporter'#treeend

*** ** * ** ***

|-------------------------------------------|---|---------------------------------------|
| **StatisticsReporter(...):**              |   | **Bean:**                             |
| StatisticsDaoFactory statisticsDaoFactory |   | Autowired: null(StatisticsDaoFactory) |
| ExecutorServices executorServices         |   | **???**                               |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.FailedTestAndBuildProblemsDispatcher"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.AutoAssignerBuildFeatureController"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.StatisticsReporter"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.StatisticsDaoFactory"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.AutoAssignerBuildFeature"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'StatisticsDaoFactory'#treeend

*** ** * ** ***

|--------------------------------|---|-----------|
| **StatisticsDaoFactory(...):** |   | **Bean:** |
| ServerPaths serverPaths        |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.AutoAssignerBuildFeatureController"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.StatisticsReporter"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.StatisticsDaoFactory"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.AutoAssignerBuildFeature"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.FailedTestAndBuildProblemsProcessor"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AutoAssignerBuildFeature'#treeend

*** ** * ** ***

|------------------------------------|---|-----------|
| **AutoAssignerBuildFeature(...):** |   | **Bean:** |
| PluginDescriptor descriptor        |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.StatisticsReporter"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.StatisticsDaoFactory"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.AutoAssignerBuildFeature"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.FailedTestAndBuildProblemsProcessor"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.DelayedAssignmentsProcessor"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FailedTestAssigner'#treeend

*** ** * ** ***

|-----------------------------------------------------------|---|--------------------------------------|
| **FailedTestAssigner(...):**                              |   | **Bean:**                            |
| TestNameResponsibilityFacade testNameResponsibilityFacade |   | **???**                              |
| WebLinks webLinks                                         |   | **???**                              |
| StatisticsReporter statisticsReporter                     |   | Autowired: null(StatisticsReporter)  |
| TargetProjectFinder targetProjectFinder                   |   | Autowired: null(TargetProjectFinder) |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.BuildProblemsFilter"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.BuildProblemUtils"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.FailedTestAssigner"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.BuildProblemsAssigner"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.TargetProjectFinder"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'BuildProblemsAssigner'#treeend

*** ** * ** ***

|-------------------------------------------------------------------|---|--------------------------------------|
| **BuildProblemsAssigner(...):**                                   |   | **Bean:**                            |
| BuildProblemResponsibilityFacade buildProblemResponsibilityFacade |   | **???**                              |
| WebLinks webLinks                                                 |   | **???**                              |
| StatisticsReporter statisticsReporter                             |   | Autowired: null(StatisticsReporter)  |
| TargetProjectFinder targetProjectFinder                           |   | Autowired: null(TargetProjectFinder) |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.BuildProblemUtils"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.FailedTestAssigner"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.BuildProblemsAssigner"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.TargetProjectFinder"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.InvestigationsManager"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TargetProjectFinder'#treeend

*** ** * ** ***

|-------------------------------|---|-----------|
| **TargetProjectFinder(...):** |   | **Bean:** |
| ProjectManager projectManager |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.FailedTestAssigner"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.BuildProblemsAssigner"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.TargetProjectFinder"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.InvestigationsManager"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.FlakyTestDetector"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'InvestigationsManager'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------|
| **InvestigationsManager(...):**             |   | **Bean:** |
| AuditLogProvider auditLogProvider           |   | **???**   |
| ResponsibilityFacadeEx responsibilityFacade |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.BuildProblemsAssigner"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.TargetProjectFinder"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.InvestigationsManager"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.FlakyTestDetector"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.ProblemTextExtractor"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'DefaultUserHeuristic'#treeend

*** ** * ** ***

|--------------------------------|---|-----------|
| **DefaultUserHeuristic(...):** |   | **Bean:** |
| UserModelEx userModel          |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean id="customParameters" class="jetbrains.buildServer.investigationsAutoAssigner.utils.CustomParameters"/>
  <bean id="brokenFileHeuristic" class="jetbrains.buildServer.investigationsAutoAssigner.heuristics.BrokenFileHeuristic"/>
  <bean id="defaultUserHeuristic" class="jetbrains.buildServer.investigationsAutoAssigner.heuristics.DefaultUserHeuristic"/>
  <bean id="previousResponsibleHeuristic" class="jetbrains.buildServer.investigationsAutoAssigner.heuristics.PreviousResponsibleHeuristic"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.AssignerArtifactDao"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AssignerArtifactDao'#treeend

*** ** * ** ***

|-------------------------------------------------|---|------------------------------------------|
| **AssignerArtifactDao(...):**                   |   | **Bean:**                                |
| UserModelEx userModel                           |   | **???**                                  |
| SuggestionsDao suggestionsDao                   |   | Autowired: null(SuggestionsDao)          |
| AssignerResultsFilePath assignerResultsFilePath |   | Autowired: null(AssignerResultsFilePath) |
| StatisticsReporter statisticsReporter           |   | Autowired: null(StatisticsReporter)      |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean id="defaultUserHeuristic" class="jetbrains.buildServer.investigationsAutoAssigner.heuristics.DefaultUserHeuristic"/>
  <bean id="previousResponsibleHeuristic" class="jetbrains.buildServer.investigationsAutoAssigner.heuristics.PreviousResponsibleHeuristic"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.AssignerArtifactDao"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.AggregationLogger"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.ClickAssignButtonReportController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AggregationLogger'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------------------------------------------|
| **AggregationLogger(...):**       |   | **Bean:**                                     |
| WebLinks webLinks                 |   | **???**                                       |
| CustomParameters customParameters |   | Autowired: customParameters(CustomParameters) |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean id="previousResponsibleHeuristic" class="jetbrains.buildServer.investigationsAutoAssigner.heuristics.PreviousResponsibleHeuristic"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.AssignerArtifactDao"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.AggregationLogger"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.ClickAssignButtonReportController"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.AssignInvestigationController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'ClickAssignButtonReportController'#treeend

*** ** * ** ***

|---------------------------------------------|---|-------------------------------------|
| **ClickAssignButtonReportController(...):** |   | **Bean:**                           |
| SBuildServer server                         |   | **???**                             |
| WebControllerManager controllerManager      |   | **???**                             |
| StatisticsReporter statisticsReporter       |   | Autowired: null(StatisticsReporter) |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.AssignerArtifactDao"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.AggregationLogger"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.ClickAssignButtonReportController"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.AssignInvestigationController"/>
  <bean id="autoAssignerDetailsController"
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AssignInvestigationController'#treeend

*** ** * ** ***

|-----------------------------------------------------------|---|--------------------------------------|
| **AssignInvestigationController(...):**                   |   | **Bean:**                            |
| SBuildServer server                                       |   | **???**                              |
| WebControllerManager controllerManager                    |   | **???**                              |
| TestNameResponsibilityFacade testNameResponsibilityFacade |   | **???**                              |
| UserModelEx userModelEx                                   |   | **???**                              |
| STestManager sTestManager                                 |   | **???**                              |
| SecurityContext securityContext                           |   | **???**                              |
| ProjectManager projectManager                             |   | **???**                              |
| TargetProjectFinder targetProjectFinder                   |   | Autowired: null(TargetProjectFinder) |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.utils.AggregationLogger"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.ClickAssignButtonReportController"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.AssignInvestigationController"/>
  <bean id="autoAssignerDetailsController"
        class="jetbrains.buildServer.investigationsAutoAssigner.representation.AutoAssignerDetailsController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AutoAssignerDetailsController'#treeend

*** ** * ** ***

|---------------------------------------------------|---|-----------------------------------------------|
| **AutoAssignerDetailsController(...):**           |   | **Bean:**                                     |
| SBuildServer server                               |   | **???**                                       |
| FirstFailedInFixedInCalculator statisticsProvider |   | **???**                                       |
| AssignerArtifactDao assignerArtifactDao           |   | Autowired: null(AssignerArtifactDao)          |
| WebControllerManager controllerManager            |   | **???**                                       |
| PluginDescriptor descriptor                       |   | **???**                                       |
| FlakyTestDetector flakyTestDetector               |   | Autowired: null(FlakyTestDetector)            |
| InvestigationsManager investigationsManager       |   | Autowired: null(InvestigationsManager)        |
| StatisticsReporter statisticsReporter             |   | Autowired: null(StatisticsReporter)           |
| CustomParameters customParameters                 |   | Autowired: customParameters(CustomParameters) |
| SecurityContextEx securityContext                 |   | **???**                                       |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.AssignInvestigationController"/>
  <bean id="autoAssignerDetailsController"
        class="jetbrains.buildServer.investigationsAutoAssigner.representation.AutoAssignerDetailsController"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.TestDetailsExtension"
        init-method="register"
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TestDetailsExtension'#treeend

*** ** * ** ***

|--------------------------------|---|-----------|
| **TestDetailsExtension(...):** |   | **Bean:** |
| PagePlaces pagePlaces          |   | **???**   |
| PluginDescriptor descriptor    |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
  <bean id="autoAssignerDetailsController"
        class="jetbrains.buildServer.investigationsAutoAssigner.representation.AutoAssignerDetailsController"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.TestDetailsExtension"
        init-method="register"
        destroy-method="unregister"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SakuraTestDetailsController'#treeend

*** ** * ** ***

|----------------------------------------|---|-----------|
| **SakuraTestDetailsController(...):**  |   | **Bean:** |
| PagePlaces pagePlaces                  |   | **???**   |
| PluginDescriptor descriptor            |   | **???**   |
| WebControllerManager controllerManager |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
        init-method="register"
        destroy-method="unregister"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.representation.SakuraTestDetailsController"
        init-method="register"
        destroy-method="unregister"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SuggestionsDao'#treeend

*** ** * ** ***

|--------------------------|---|-----------|
| **SuggestionsDao(...):** |   | **Bean:** |
| ServerSettings settings  |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
        init-method="register"
        destroy-method="unregister"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.SuggestionsDao"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.persistent.AssignerResultsFilePath"/>
  <bean class="jetbrains.buildServer.investigationsAutoAssigner.processing.ModificationAnalyzerFactory"/>
```

## RuleId[id=CloneDeclaresCloneNotSupported]
### CloneDeclaresCloneNotSupported
`clone()` does not declare 'CloneNotSupportedException'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/persistent/Statistics.java`
#### Snippet
```java

  @Override
  protected Statistics clone() {
    return new Statistics(version, values);
  }
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `src/main/resources/META-INF/build-server-plugin-investigations-auto-assigner.xml`
#### Snippet
```java
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
    default-autowire="constructor"
>
  <!-- declare all beans you like Spring Dependency Injection to create -->
```

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `myStatistics` may be 'final'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/persistent/StatisticsReporter.java`
#### Snippet
```java
public class StatisticsReporter {
  private final StatisticsDao myStatisticsDao;
  private Statistics myStatistics;

  public StatisticsReporter(StatisticsDaoFactory statisticsDaoFactory,
```

### FieldMayBeFinal
Field `buildProblem2Responsibility` may be 'final'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/HeuristicResult.java`
#### Snippet
```java

  private HashMap<Integer, Responsibility> testRun2Responsibility;
  private HashMap<Integer, Responsibility> buildProblem2Responsibility;

  public HeuristicResult() {
```

### FieldMayBeFinal
Field `testRun2Responsibility` may be 'final'
in `src/main/java/jetbrains/buildServer/investigationsAutoAssigner/common/HeuristicResult.java`
#### Snippet
```java
public class HeuristicResult {

  private HashMap<Integer, Responsibility> testRun2Responsibility;
  private HashMap<Integer, Responsibility> buildProblem2Responsibility;

```

## RuleId[id=RefusedBequest]
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

