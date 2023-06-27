# teamcity-usage-statistics 
 
# Bad smells
I found 299 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringXmlModelInspection | 298 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">

  <!-- Web -->
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Web -->

  <bean id="usageStatisticsController" class="jetbrains.buildServer.controllers.UsageStatisticsController"/>
  <bean id="downloadUsageStatisticsController" class="jetbrains.buildServer.controllers.DownloadUsageStatisticsController"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Web -->

  <bean id="usageStatisticsController" class="jetbrains.buildServer.controllers.UsageStatisticsController"/>
  <bean id="downloadUsageStatisticsController" class="jetbrains.buildServer.controllers.DownloadUsageStatisticsController"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'controllers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Web -->

  <bean id="usageStatisticsController" class="jetbrains.buildServer.controllers.UsageStatisticsController"/>
  <bean id="downloadUsageStatisticsController" class="jetbrains.buildServer.controllers.DownloadUsageStatisticsController"/>

```

### SpringXmlModelInspection
Cannot resolve class 'UsageStatisticsController'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Web -->

  <bean id="usageStatisticsController" class="jetbrains.buildServer.controllers.UsageStatisticsController"/>
  <bean id="downloadUsageStatisticsController" class="jetbrains.buildServer.controllers.DownloadUsageStatisticsController"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="usageStatisticsController" class="jetbrains.buildServer.controllers.UsageStatisticsController"/>
  <bean id="downloadUsageStatisticsController" class="jetbrains.buildServer.controllers.DownloadUsageStatisticsController"/>

  <!-- Core -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="usageStatisticsController" class="jetbrains.buildServer.controllers.UsageStatisticsController"/>
  <bean id="downloadUsageStatisticsController" class="jetbrains.buildServer.controllers.DownloadUsageStatisticsController"/>

  <!-- Core -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'controllers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="usageStatisticsController" class="jetbrains.buildServer.controllers.UsageStatisticsController"/>
  <bean id="downloadUsageStatisticsController" class="jetbrains.buildServer.controllers.DownloadUsageStatisticsController"/>

  <!-- Core -->
```

### SpringXmlModelInspection
Cannot resolve class 'DownloadUsageStatisticsController'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="usageStatisticsController" class="jetbrains.buildServer.controllers.UsageStatisticsController"/>
  <bean id="downloadUsageStatisticsController" class="jetbrains.buildServer.controllers.DownloadUsageStatisticsController"/>

  <!-- Core -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Core -->

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Core -->

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Core -->

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Core -->

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
```

### SpringXmlModelInspection
Cannot resolve class 'UsageStatisticsCollectorImpl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Core -->

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class 'UsageStatisticsReporterImpl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class 'UsageStatisticsReportingScheduler'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsManager" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCollectorImpl"/>
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
```

### SpringXmlModelInspection
Cannot resolve class 'UsageStatisticsSettingsPersistor'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReporter" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReporterImpl"/>
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
```

### SpringXmlModelInspection
Cannot resolve class 'UsageStatisticsCommonDataPersistor'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsReportingScheduler" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingScheduler"/>
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'presentation'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
```

### SpringXmlModelInspection
Cannot resolve class 'UsageStatisticsPresentationManagerImpl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsSettingsPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsSettingsPersistor"/>
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve class 'UsageStatisticsLicenseAgreementListener'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsCommonDataPersistor" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsCommonDataPersistor"/>
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
```

### SpringXmlModelInspection
Cannot find constructor with argument index 3
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
  <bean id="usageStatisticsReportingSuggestion" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingSuggestion"/>
```

### SpringXmlModelInspection
Cannot resolve bean 'licenseAgreementDispatcher'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="usageStatisticsPresentationManger" class="jetbrains.buildServer.usageStatistics.presentation.impl.UsageStatisticsPresentationManagerImpl"/>
  <bean id="usageStatisticsLicenseAgreementListener" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsLicenseAgreementListener">
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
  <bean id="usageStatisticsReportingSuggestion" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingSuggestion"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
  <bean id="usageStatisticsReportingSuggestion" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingSuggestion"/>

  <!-- Renderers -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
  <bean id="usageStatisticsReportingSuggestion" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingSuggestion"/>

  <!-- Renderers -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
  <bean id="usageStatisticsReportingSuggestion" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingSuggestion"/>

  <!-- Renderers -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
  <bean id="usageStatisticsReportingSuggestion" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingSuggestion"/>

  <!-- Renderers -->
```

### SpringXmlModelInspection
Cannot resolve class 'UsageStatisticsReportingSuggestion'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <constructor-arg index="3" ref="licenseAgreementDispatcher"/>
  </bean>
  <bean id="usageStatisticsReportingSuggestion" class="jetbrains.buildServer.usageStatistics.impl.UsageStatisticsReportingSuggestion"/>

  <!-- Renderers -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Renderers -->

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Renderers -->

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Renderers -->

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'presentation'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Renderers -->

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'renderers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Renderers -->

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>
```

### SpringXmlModelInspection
Cannot resolve class 'DefaultUsageStatisticsGroupType'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Renderers -->

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'presentation'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'renderers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

```

### SpringXmlModelInspection
Cannot resolve class 'DynamicUsageStatisticsGroupType'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

  <!-- Providers -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

  <!-- Providers -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

  <!-- Providers -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'presentation'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

  <!-- Providers -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'renderers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

  <!-- Providers -->
```

### SpringXmlModelInspection
Cannot resolve class 'ListUsageStatisticsGroupType'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="defaultUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DefaultUsageStatisticsGroupType"/>
  <bean id="dynamicUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.DynamicUsageStatisticsGroupType"/>
  <bean id="listUsageStatisticsGroupType" class="jetbrains.buildServer.usageStatistics.presentation.renderers.ListUsageStatisticsGroupType"/>

  <!-- Providers -->
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Providers -->

  <bean id="serverLoadUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerLoadUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Server Load"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Providers -->

  <bean id="serverLoadUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerLoadUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Server Load"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Providers -->

  <bean id="serverLoadUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerLoadUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Server Load"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Providers -->

  <bean id="serverLoadUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerLoadUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Server Load"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Providers -->

  <bean id="serverLoadUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerLoadUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Server Load"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ServerLoadUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Providers -->

  <bean id="serverLoadUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerLoadUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Server Load"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="serverLoadUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerLoadUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Server Load"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="serverLoadUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerLoadUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Server Load"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="staticServerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s"/>
    <property name="groupName" value="General"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="staticServerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s"/>
    <property name="groupName" value="General"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="staticServerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s"/>
    <property name="groupName" value="General"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="staticServerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s"/>
    <property name="groupName" value="General"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="staticServerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s"/>
    <property name="groupName" value="General"/>
```

### SpringXmlModelInspection
Cannot resolve class 'StaticServerUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="staticServerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s"/>
    <property name="groupName" value="General"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="staticServerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s"/>
    <property name="groupName" value="General"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="staticServerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.StaticServerUsageStatisticsProvider">
    <property name="idFormat" value="jb.%s"/>
    <property name="groupName" value="General"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEUsageStatisticsProvider">
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEUsageStatisticsProvider">
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEUsageStatisticsProvider">
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEUsageStatisticsProvider">
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEUsageStatisticsProvider">
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IDEUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEUsageStatisticsProvider">
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot find constructor with argument index 3
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="ideUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEUsageStatisticsProvider">
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
    <property name="groupName" value="IDE Plugins"/>
```

### SpringXmlModelInspection
Cannot resolve bean 'xmlRpcDispatcher'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="ideUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEUsageStatisticsProvider">
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
    <property name="groupName" value="IDE Plugins"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="ideUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEUsageStatisticsProvider">
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
    <property name="groupName" value="IDE Plugins"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <constructor-arg index="3" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ide.%s[%s]"/>
    <property name="groupName" value="IDE Plugins"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideFeaturesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEFeaturesUsageStatisticsProvider">
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideFeaturesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEFeaturesUsageStatisticsProvider">
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideFeaturesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEFeaturesUsageStatisticsProvider">
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideFeaturesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEFeaturesUsageStatisticsProvider">
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideFeaturesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEFeaturesUsageStatisticsProvider">
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IDEFeaturesUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="ideFeaturesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEFeaturesUsageStatisticsProvider">
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot find constructor with argument index 4
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="ideFeaturesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEFeaturesUsageStatisticsProvider">
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
    <property name="groupName" value="IDE Features"/>
```

### SpringXmlModelInspection
Cannot resolve bean 'xmlRpcDispatcher'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="ideFeaturesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEFeaturesUsageStatisticsProvider">
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
    <property name="groupName" value="IDE Features"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="ideFeaturesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IDEFeaturesUsageStatisticsProvider">
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
    <property name="groupName" value="IDE Features"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <constructor-arg index="4" ref="xmlRpcDispatcher"/>
    <property name="idFormat" value="jb.ideFeature.%s[%s]"/>
    <property name="groupName" value="IDE Features"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="webPagesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.WebPagesUsageStatisticsProvider">
    <property name="configFilePath" value="config/webPagePatterns.txt"/>
    <property name="idFormat" value="jb.web.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="webPagesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.WebPagesUsageStatisticsProvider">
    <property name="configFilePath" value="config/webPagePatterns.txt"/>
    <property name="idFormat" value="jb.web.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="webPagesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.WebPagesUsageStatisticsProvider">
    <property name="configFilePath" value="config/webPagePatterns.txt"/>
    <property name="idFormat" value="jb.web.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="webPagesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.WebPagesUsageStatisticsProvider">
    <property name="configFilePath" value="config/webPagePatterns.txt"/>
    <property name="idFormat" value="jb.web.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="webPagesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.WebPagesUsageStatisticsProvider">
    <property name="configFilePath" value="config/webPagePatterns.txt"/>
    <property name="idFormat" value="jb.web.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class 'WebPagesUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="webPagesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.WebPagesUsageStatisticsProvider">
    <property name="configFilePath" value="config/webPagePatterns.txt"/>
    <property name="idFormat" value="jb.web.%s[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve property 'configFilePath'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="webPagesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.WebPagesUsageStatisticsProvider">
    <property name="configFilePath" value="config/webPagePatterns.txt"/>
    <property name="idFormat" value="jb.web.%s[%s]"/>
    <property name="groupName" value="Web Pages Usage"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="webPagesUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.WebPagesUsageStatisticsProvider">
    <property name="configFilePath" value="config/webPagePatterns.txt"/>
    <property name="idFormat" value="jb.web.%s[%s]"/>
    <property name="groupName" value="Web Pages Usage"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <property name="configFilePath" value="config/webPagePatterns.txt"/>
    <property name="idFormat" value="jb.web.%s[%s]"/>
    <property name="groupName" value="Web Pages Usage"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="browserUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BrowserUsageStatisticsProvider">
    <property name="idFormat" value="jb.browser.%s[%s]"/>
    <property name="groupName" value="Web Browsers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="browserUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BrowserUsageStatisticsProvider">
    <property name="idFormat" value="jb.browser.%s[%s]"/>
    <property name="groupName" value="Web Browsers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="browserUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BrowserUsageStatisticsProvider">
    <property name="idFormat" value="jb.browser.%s[%s]"/>
    <property name="groupName" value="Web Browsers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="browserUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BrowserUsageStatisticsProvider">
    <property name="idFormat" value="jb.browser.%s[%s]"/>
    <property name="groupName" value="Web Browsers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="browserUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BrowserUsageStatisticsProvider">
    <property name="idFormat" value="jb.browser.%s[%s]"/>
    <property name="groupName" value="Web Browsers"/>
```

### SpringXmlModelInspection
Cannot resolve class 'BrowserUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="browserUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BrowserUsageStatisticsProvider">
    <property name="idFormat" value="jb.browser.%s[%s]"/>
    <property name="groupName" value="Web Browsers"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="browserUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BrowserUsageStatisticsProvider">
    <property name="idFormat" value="jb.browser.%s[%s]"/>
    <property name="groupName" value="Web Browsers"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="browserUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BrowserUsageStatisticsProvider">
    <property name="idFormat" value="jb.browser.%s[%s]"/>
    <property name="groupName" value="Web Browsers"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="authModuleUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AuthModuleUsageStatisticsProvider">
    <property name="idFormat" value="jb.authModule.%s[%s]"/>
    <property name="groupName" value="Authentication Modules"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="authModuleUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AuthModuleUsageStatisticsProvider">
    <property name="idFormat" value="jb.authModule.%s[%s]"/>
    <property name="groupName" value="Authentication Modules"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="authModuleUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AuthModuleUsageStatisticsProvider">
    <property name="idFormat" value="jb.authModule.%s[%s]"/>
    <property name="groupName" value="Authentication Modules"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="authModuleUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AuthModuleUsageStatisticsProvider">
    <property name="idFormat" value="jb.authModule.%s[%s]"/>
    <property name="groupName" value="Authentication Modules"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="authModuleUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AuthModuleUsageStatisticsProvider">
    <property name="idFormat" value="jb.authModule.%s[%s]"/>
    <property name="groupName" value="Authentication Modules"/>
```

### SpringXmlModelInspection
Cannot resolve class 'AuthModuleUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="authModuleUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AuthModuleUsageStatisticsProvider">
    <property name="idFormat" value="jb.authModule.%s[%s]"/>
    <property name="groupName" value="Authentication Modules"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="authModuleUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AuthModuleUsageStatisticsProvider">
    <property name="idFormat" value="jb.authModule.%s[%s]"/>
    <property name="groupName" value="Authentication Modules"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="authModuleUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AuthModuleUsageStatisticsProvider">
    <property name="idFormat" value="jb.authModule.%s[%s]"/>
    <property name="groupName" value="Authentication Modules"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="muteUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.MuteUsageStatisticsProvider">
    <property name="idFormat" value="jb.mute.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="muteUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.MuteUsageStatisticsProvider">
    <property name="idFormat" value="jb.mute.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="muteUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.MuteUsageStatisticsProvider">
    <property name="idFormat" value="jb.mute.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="muteUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.MuteUsageStatisticsProvider">
    <property name="idFormat" value="jb.mute.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="muteUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.MuteUsageStatisticsProvider">
    <property name="idFormat" value="jb.mute.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class 'MuteUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="muteUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.MuteUsageStatisticsProvider">
    <property name="idFormat" value="jb.mute.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="muteUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.MuteUsageStatisticsProvider">
    <property name="idFormat" value="jb.mute.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="muteUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.MuteUsageStatisticsProvider">
    <property name="idFormat" value="jb.mute.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="investigationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.InvestigationUsageStatisticsProvider">
    <property name="idFormat" value="jb.investigation.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="investigationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.InvestigationUsageStatisticsProvider">
    <property name="idFormat" value="jb.investigation.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="investigationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.InvestigationUsageStatisticsProvider">
    <property name="idFormat" value="jb.investigation.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="investigationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.InvestigationUsageStatisticsProvider">
    <property name="idFormat" value="jb.investigation.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="investigationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.InvestigationUsageStatisticsProvider">
    <property name="idFormat" value="jb.investigation.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve class 'InvestigationUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="investigationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.InvestigationUsageStatisticsProvider">
    <property name="idFormat" value="jb.investigation.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="investigationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.InvestigationUsageStatisticsProvider">
    <property name="idFormat" value="jb.investigation.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="investigationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.InvestigationUsageStatisticsProvider">
    <property name="idFormat" value="jb.investigation.%s.%s"/>
    <property name="groupName" value="Investigation / Mute"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="serverConfigurationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerConfigurationUsageStatisticsProvider">
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="serverConfigurationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerConfigurationUsageStatisticsProvider">
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="serverConfigurationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerConfigurationUsageStatisticsProvider">
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="serverConfigurationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerConfigurationUsageStatisticsProvider">
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="serverConfigurationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerConfigurationUsageStatisticsProvider">
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ServerConfigurationUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="serverConfigurationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerConfigurationUsageStatisticsProvider">
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
```

### SpringXmlModelInspection
Cannot find constructor with argument index 0
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="serverConfigurationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerConfigurationUsageStatisticsProvider">
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
    <property name="groupName" value="Server Configuration"/>
```

### SpringXmlModelInspection
Cannot resolve bean 'dbManager'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="serverConfigurationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerConfigurationUsageStatisticsProvider">
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
    <property name="groupName" value="Server Configuration"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="serverConfigurationUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ServerConfigurationUsageStatisticsProvider">
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
    <property name="groupName" value="Server Configuration"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <constructor-arg index="0" ref="dbManager"/>
    <property name="idFormat" value="jb.server.%s"/>
    <property name="groupName" value="Server Configuration"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="clusterStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ClusterStatisticsProvider">
    <property name="idFormat" value="jb.cluster.%s"/>
    <property name="groupName" value="Nodes and Responsibilities"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="clusterStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ClusterStatisticsProvider">
    <property name="idFormat" value="jb.cluster.%s"/>
    <property name="groupName" value="Nodes and Responsibilities"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="clusterStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ClusterStatisticsProvider">
    <property name="idFormat" value="jb.cluster.%s"/>
    <property name="groupName" value="Nodes and Responsibilities"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="clusterStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ClusterStatisticsProvider">
    <property name="idFormat" value="jb.cluster.%s"/>
    <property name="groupName" value="Nodes and Responsibilities"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="clusterStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ClusterStatisticsProvider">
    <property name="idFormat" value="jb.cluster.%s"/>
    <property name="groupName" value="Nodes and Responsibilities"/>
```

### SpringXmlModelInspection
Cannot resolve class 'ClusterStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="clusterStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ClusterStatisticsProvider">
    <property name="idFormat" value="jb.cluster.%s"/>
    <property name="groupName" value="Nodes and Responsibilities"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="clusterStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ClusterStatisticsProvider">
    <property name="idFormat" value="jb.cluster.%s"/>
    <property name="groupName" value="Nodes and Responsibilities"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="clusterStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.ClusterStatisticsProvider">
    <property name="idFormat" value="jb.cluster.%s"/>
    <property name="groupName" value="Nodes and Responsibilities"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="vcsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VCSUsageStatisticsProvider">
    <property name="idFormat" value="jb.vcs[%s]"/>
    <property name="groupName" value="VCS Root Types"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="vcsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VCSUsageStatisticsProvider">
    <property name="idFormat" value="jb.vcs[%s]"/>
    <property name="groupName" value="VCS Root Types"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="vcsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VCSUsageStatisticsProvider">
    <property name="idFormat" value="jb.vcs[%s]"/>
    <property name="groupName" value="VCS Root Types"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="vcsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VCSUsageStatisticsProvider">
    <property name="idFormat" value="jb.vcs[%s]"/>
    <property name="groupName" value="VCS Root Types"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="vcsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VCSUsageStatisticsProvider">
    <property name="idFormat" value="jb.vcs[%s]"/>
    <property name="groupName" value="VCS Root Types"/>
```

### SpringXmlModelInspection
Cannot resolve class 'VCSUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="vcsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VCSUsageStatisticsProvider">
    <property name="idFormat" value="jb.vcs[%s]"/>
    <property name="groupName" value="VCS Root Types"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="vcsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VCSUsageStatisticsProvider">
    <property name="idFormat" value="jb.vcs[%s]"/>
    <property name="groupName" value="VCS Root Types"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="vcsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VCSUsageStatisticsProvider">
    <property name="idFormat" value="jb.vcs[%s]"/>
    <property name="groupName" value="VCS Root Types"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="issueTrackerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IssueTrackerUsageStatisticsProvider">
    <property name="idFormat" value="jb.issueTracker[%s]"/>
    <property name="groupName" value="Issue Trackers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="issueTrackerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IssueTrackerUsageStatisticsProvider">
    <property name="idFormat" value="jb.issueTracker[%s]"/>
    <property name="groupName" value="Issue Trackers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="issueTrackerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IssueTrackerUsageStatisticsProvider">
    <property name="idFormat" value="jb.issueTracker[%s]"/>
    <property name="groupName" value="Issue Trackers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="issueTrackerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IssueTrackerUsageStatisticsProvider">
    <property name="idFormat" value="jb.issueTracker[%s]"/>
    <property name="groupName" value="Issue Trackers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="issueTrackerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IssueTrackerUsageStatisticsProvider">
    <property name="idFormat" value="jb.issueTracker[%s]"/>
    <property name="groupName" value="Issue Trackers"/>
```

### SpringXmlModelInspection
Cannot resolve class 'IssueTrackerUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="issueTrackerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IssueTrackerUsageStatisticsProvider">
    <property name="idFormat" value="jb.issueTracker[%s]"/>
    <property name="groupName" value="Issue Trackers"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="issueTrackerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IssueTrackerUsageStatisticsProvider">
    <property name="idFormat" value="jb.issueTracker[%s]"/>
    <property name="groupName" value="Issue Trackers"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="issueTrackerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.IssueTrackerUsageStatisticsProvider">
    <property name="idFormat" value="jb.issueTracker[%s]"/>
    <property name="groupName" value="Issue Trackers"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="notificatorUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.NotificatorUsageStatisticsProvider">
    <property name="idFormat" value="jb.notificator[%s]"/>
    <property name="groupName" value="Notifiers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="notificatorUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.NotificatorUsageStatisticsProvider">
    <property name="idFormat" value="jb.notificator[%s]"/>
    <property name="groupName" value="Notifiers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="notificatorUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.NotificatorUsageStatisticsProvider">
    <property name="idFormat" value="jb.notificator[%s]"/>
    <property name="groupName" value="Notifiers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="notificatorUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.NotificatorUsageStatisticsProvider">
    <property name="idFormat" value="jb.notificator[%s]"/>
    <property name="groupName" value="Notifiers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="notificatorUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.NotificatorUsageStatisticsProvider">
    <property name="idFormat" value="jb.notificator[%s]"/>
    <property name="groupName" value="Notifiers"/>
```

### SpringXmlModelInspection
Cannot resolve class 'NotificatorUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="notificatorUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.NotificatorUsageStatisticsProvider">
    <property name="idFormat" value="jb.notificator[%s]"/>
    <property name="groupName" value="Notifiers"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="notificatorUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.NotificatorUsageStatisticsProvider">
    <property name="idFormat" value="jb.notificator[%s]"/>
    <property name="groupName" value="Notifiers"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="notificatorUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.NotificatorUsageStatisticsProvider">
    <property name="idFormat" value="jb.notificator[%s]"/>
    <property name="groupName" value="Notifiers"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="runnerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.RunnerUsageStatisticsProvider">
    <property name="idFormat" value="jb.runner[%s]"/>
    <property name="groupName" value="Runners"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="runnerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.RunnerUsageStatisticsProvider">
    <property name="idFormat" value="jb.runner[%s]"/>
    <property name="groupName" value="Runners"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="runnerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.RunnerUsageStatisticsProvider">
    <property name="idFormat" value="jb.runner[%s]"/>
    <property name="groupName" value="Runners"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="runnerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.RunnerUsageStatisticsProvider">
    <property name="idFormat" value="jb.runner[%s]"/>
    <property name="groupName" value="Runners"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="runnerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.RunnerUsageStatisticsProvider">
    <property name="idFormat" value="jb.runner[%s]"/>
    <property name="groupName" value="Runners"/>
```

### SpringXmlModelInspection
Cannot resolve class 'RunnerUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="runnerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.RunnerUsageStatisticsProvider">
    <property name="idFormat" value="jb.runner[%s]"/>
    <property name="groupName" value="Runners"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="runnerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.RunnerUsageStatisticsProvider">
    <property name="idFormat" value="jb.runner[%s]"/>
    <property name="groupName" value="Runners"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="runnerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.RunnerUsageStatisticsProvider">
    <property name="idFormat" value="jb.runner[%s]"/>
    <property name="groupName" value="Runners"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFeatureUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFeatureUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFeature[%s]"/>
    <property name="groupName" value="Build Features"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFeatureUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFeatureUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFeature[%s]"/>
    <property name="groupName" value="Build Features"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFeatureUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFeatureUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFeature[%s]"/>
    <property name="groupName" value="Build Features"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFeatureUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFeatureUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFeature[%s]"/>
    <property name="groupName" value="Build Features"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFeatureUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFeatureUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFeature[%s]"/>
    <property name="groupName" value="Build Features"/>
```

### SpringXmlModelInspection
Cannot resolve class 'BuildFeatureUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFeatureUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFeatureUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFeature[%s]"/>
    <property name="groupName" value="Build Features"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="buildFeatureUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFeatureUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFeature[%s]"/>
    <property name="groupName" value="Build Features"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="buildFeatureUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFeatureUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFeature[%s]"/>
    <property name="groupName" value="Build Features"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFailureConditionUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFailureConditionUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFailureCondition[%s]"/>
    <property name="groupName" value="Build Failure Conditions"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFailureConditionUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFailureConditionUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFailureCondition[%s]"/>
    <property name="groupName" value="Build Failure Conditions"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFailureConditionUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFailureConditionUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFailureCondition[%s]"/>
    <property name="groupName" value="Build Failure Conditions"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFailureConditionUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFailureConditionUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFailureCondition[%s]"/>
    <property name="groupName" value="Build Failure Conditions"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFailureConditionUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFailureConditionUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFailureCondition[%s]"/>
    <property name="groupName" value="Build Failure Conditions"/>
```

### SpringXmlModelInspection
Cannot resolve class 'BuildFailureConditionUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="buildFailureConditionUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFailureConditionUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFailureCondition[%s]"/>
    <property name="groupName" value="Build Failure Conditions"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="buildFailureConditionUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFailureConditionUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFailureCondition[%s]"/>
    <property name="groupName" value="Build Failure Conditions"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="buildFailureConditionUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.BuildFailureConditionUsageStatisticsProvider">
    <property name="idFormat" value="jb.buildFailureCondition[%s]"/>
    <property name="groupName" value="Build Failure Conditions"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="triggerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.TriggerUsageStatisticsProvider">
    <property name="idFormat" value="jb.trigger[%s]"/>
    <property name="groupName" value="Triggers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="triggerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.TriggerUsageStatisticsProvider">
    <property name="idFormat" value="jb.trigger[%s]"/>
    <property name="groupName" value="Triggers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="triggerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.TriggerUsageStatisticsProvider">
    <property name="idFormat" value="jb.trigger[%s]"/>
    <property name="groupName" value="Triggers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="triggerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.TriggerUsageStatisticsProvider">
    <property name="idFormat" value="jb.trigger[%s]"/>
    <property name="groupName" value="Triggers"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="triggerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.TriggerUsageStatisticsProvider">
    <property name="idFormat" value="jb.trigger[%s]"/>
    <property name="groupName" value="Triggers"/>
```

### SpringXmlModelInspection
Cannot resolve class 'TriggerUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="triggerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.TriggerUsageStatisticsProvider">
    <property name="idFormat" value="jb.trigger[%s]"/>
    <property name="groupName" value="Triggers"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="triggerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.TriggerUsageStatisticsProvider">
    <property name="idFormat" value="jb.trigger[%s]"/>
    <property name="groupName" value="Triggers"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="triggerUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.TriggerUsageStatisticsProvider">
    <property name="idFormat" value="jb.trigger[%s]"/>
    <property name="groupName" value="Triggers"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsJavaUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsJavaUsageStatisticsProvider">
    <property name="parameterName" value="teamcity.agent.jvm.version"/>
    <property name="idFormat" value="jb.agent.java[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsJavaUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsJavaUsageStatisticsProvider">
    <property name="parameterName" value="teamcity.agent.jvm.version"/>
    <property name="idFormat" value="jb.agent.java[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsJavaUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsJavaUsageStatisticsProvider">
    <property name="parameterName" value="teamcity.agent.jvm.version"/>
    <property name="idFormat" value="jb.agent.java[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsJavaUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsJavaUsageStatisticsProvider">
    <property name="parameterName" value="teamcity.agent.jvm.version"/>
    <property name="idFormat" value="jb.agent.java[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsJavaUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsJavaUsageStatisticsProvider">
    <property name="parameterName" value="teamcity.agent.jvm.version"/>
    <property name="idFormat" value="jb.agent.java[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve class 'AgentsJavaUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsJavaUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsJavaUsageStatisticsProvider">
    <property name="parameterName" value="teamcity.agent.jvm.version"/>
    <property name="idFormat" value="jb.agent.java[%s]"/>
```

### SpringXmlModelInspection
Cannot resolve property 'parameterName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="agentsJavaUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsJavaUsageStatisticsProvider">
    <property name="parameterName" value="teamcity.agent.jvm.version"/>
    <property name="idFormat" value="jb.agent.java[%s]"/>
    <property name="groupName" value="Agent Java Versions"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="agentsJavaUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsJavaUsageStatisticsProvider">
    <property name="parameterName" value="teamcity.agent.jvm.version"/>
    <property name="idFormat" value="jb.agent.java[%s]"/>
    <property name="groupName" value="Agent Java Versions"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
    <property name="parameterName" value="teamcity.agent.jvm.version"/>
    <property name="idFormat" value="jb.agent.java[%s]"/>
    <property name="groupName" value="Agent Java Versions"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsPlatformUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsPlatformUsageStatisticsProvider">
    <property name="idFormat" value="jb.agent.platform[%s]"/>
    <property name="groupName" value="Agent Platforms"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsPlatformUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsPlatformUsageStatisticsProvider">
    <property name="idFormat" value="jb.agent.platform[%s]"/>
    <property name="groupName" value="Agent Platforms"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsPlatformUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsPlatformUsageStatisticsProvider">
    <property name="idFormat" value="jb.agent.platform[%s]"/>
    <property name="groupName" value="Agent Platforms"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsPlatformUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsPlatformUsageStatisticsProvider">
    <property name="idFormat" value="jb.agent.platform[%s]"/>
    <property name="groupName" value="Agent Platforms"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsPlatformUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsPlatformUsageStatisticsProvider">
    <property name="idFormat" value="jb.agent.platform[%s]"/>
    <property name="groupName" value="Agent Platforms"/>
```

### SpringXmlModelInspection
Cannot resolve class 'AgentsPlatformUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="agentsPlatformUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsPlatformUsageStatisticsProvider">
    <property name="idFormat" value="jb.agent.platform[%s]"/>
    <property name="groupName" value="Agent Platforms"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="agentsPlatformUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsPlatformUsageStatisticsProvider">
    <property name="idFormat" value="jb.agent.platform[%s]"/>
    <property name="groupName" value="Agent Platforms"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="agentsPlatformUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.AgentsPlatformUsageStatisticsProvider">
    <property name="idFormat" value="jb.agent.platform[%s]"/>
    <property name="groupName" value="Agent Platforms"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="cloudUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.CloudUsageStatisticsProvider">
    <property name="idFormat" value="jb.cloud.%s.%s"/>
    <property name="groupName" value="Clouds"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="cloudUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.CloudUsageStatisticsProvider">
    <property name="idFormat" value="jb.cloud.%s.%s"/>
    <property name="groupName" value="Clouds"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="cloudUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.CloudUsageStatisticsProvider">
    <property name="idFormat" value="jb.cloud.%s.%s"/>
    <property name="groupName" value="Clouds"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="cloudUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.CloudUsageStatisticsProvider">
    <property name="idFormat" value="jb.cloud.%s.%s"/>
    <property name="groupName" value="Clouds"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="cloudUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.CloudUsageStatisticsProvider">
    <property name="idFormat" value="jb.cloud.%s.%s"/>
    <property name="groupName" value="Clouds"/>
```

### SpringXmlModelInspection
Cannot resolve class 'CloudUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="cloudUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.CloudUsageStatisticsProvider">
    <property name="idFormat" value="jb.cloud.%s.%s"/>
    <property name="groupName" value="Clouds"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="cloudUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.CloudUsageStatisticsProvider">
    <property name="idFormat" value="jb.cloud.%s.%s"/>
    <property name="groupName" value="Clouds"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="cloudUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.CloudUsageStatisticsProvider">
    <property name="idFormat" value="jb.cloud.%s.%s"/>
    <property name="groupName" value="Clouds"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettings[%s]"/>
    <property name="groupName" value="Projects with Versioned Settings"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettings[%s]"/>
    <property name="groupName" value="Projects with Versioned Settings"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettings[%s]"/>
    <property name="groupName" value="Projects with Versioned Settings"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettings[%s]"/>
    <property name="groupName" value="Projects with Versioned Settings"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettings[%s]"/>
    <property name="groupName" value="Projects with Versioned Settings"/>
```

### SpringXmlModelInspection
Cannot resolve class 'VersionedSettingsUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettings[%s]"/>
    <property name="groupName" value="Projects with Versioned Settings"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="versionedSettingsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettings[%s]"/>
    <property name="groupName" value="Projects with Versioned Settings"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="versionedSettingsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettings[%s]"/>
    <property name="groupName" value="Projects with Versioned Settings"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsFormatUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsFormatUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettingsFormat[%s]"/>
    <property name="groupName" value="Versioned Settings Format"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsFormatUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsFormatUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettingsFormat[%s]"/>
    <property name="groupName" value="Versioned Settings Format"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsFormatUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsFormatUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettingsFormat[%s]"/>
    <property name="groupName" value="Versioned Settings Format"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsFormatUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsFormatUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettingsFormat[%s]"/>
    <property name="groupName" value="Versioned Settings Format"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsFormatUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsFormatUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettingsFormat[%s]"/>
    <property name="groupName" value="Versioned Settings Format"/>
```

### SpringXmlModelInspection
Cannot resolve class 'VersionedSettingsFormatUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsFormatUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsFormatUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettingsFormat[%s]"/>
    <property name="groupName" value="Versioned Settings Format"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="versionedSettingsFormatUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsFormatUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettingsFormat[%s]"/>
    <property name="groupName" value="Versioned Settings Format"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="versionedSettingsFormatUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsFormatUsageStatisticsProvider">
    <property name="idFormat" value="jb.versionedSettingsFormat[%s]"/>
    <property name="groupName" value="Versioned Settings Format"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsBuildsUsagesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsBuildsUsagesStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Builds with settings from VCS"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsBuildsUsagesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsBuildsUsagesStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Builds with settings from VCS"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsBuildsUsagesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsBuildsUsagesStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Builds with settings from VCS"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsBuildsUsagesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsBuildsUsagesStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Builds with settings from VCS"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsBuildsUsagesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsBuildsUsagesStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Builds with settings from VCS"/>
```

### SpringXmlModelInspection
Cannot resolve class 'VersionedSettingsBuildsUsagesStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="versionedSettingsBuildsUsagesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsBuildsUsagesStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Builds with settings from VCS"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="versionedSettingsBuildsUsagesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsBuildsUsagesStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Builds with settings from VCS"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="versionedSettingsBuildsUsagesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.VersionedSettingsBuildsUsagesStatisticsProvider">
    <property name="idFormat" value="jb.%s.%s"/>
    <property name="groupName" value="Builds with settings from VCS"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="uiFeaturesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.UIFeaturesStatisticsProvider">
    <property name="idFormat" value="jb.ui.%s.%s[%s]"/>
    <property name="groupName" value="UI Features"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="uiFeaturesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.UIFeaturesStatisticsProvider">
    <property name="idFormat" value="jb.ui.%s.%s[%s]"/>
    <property name="groupName" value="UI Features"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="uiFeaturesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.UIFeaturesStatisticsProvider">
    <property name="idFormat" value="jb.ui.%s.%s[%s]"/>
    <property name="groupName" value="UI Features"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="uiFeaturesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.UIFeaturesStatisticsProvider">
    <property name="idFormat" value="jb.ui.%s.%s[%s]"/>
    <property name="groupName" value="UI Features"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="uiFeaturesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.UIFeaturesStatisticsProvider">
    <property name="idFormat" value="jb.ui.%s.%s[%s]"/>
    <property name="groupName" value="UI Features"/>
```

### SpringXmlModelInspection
Cannot resolve class 'UIFeaturesStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="uiFeaturesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.UIFeaturesStatisticsProvider">
    <property name="idFormat" value="jb.ui.%s.%s[%s]"/>
    <property name="groupName" value="UI Features"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="uiFeaturesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.UIFeaturesStatisticsProvider">
    <property name="idFormat" value="jb.ui.%s.%s[%s]"/>
    <property name="groupName" value="UI Features"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="uiFeaturesStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.UIFeaturesStatisticsProvider">
    <property name="idFormat" value="jb.ui.%s.%s[%s]"/>
    <property name="groupName" value="UI Features"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="oauthConnectionsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.OAuthConnectionsUsageStatisticsProvider">
    <property name="idFormat" value="jb.oauthConnection[%s]"/>
    <property name="groupName" value="OAuth Connections"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="oauthConnectionsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.OAuthConnectionsUsageStatisticsProvider">
    <property name="idFormat" value="jb.oauthConnection[%s]"/>
    <property name="groupName" value="OAuth Connections"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="oauthConnectionsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.OAuthConnectionsUsageStatisticsProvider">
    <property name="idFormat" value="jb.oauthConnection[%s]"/>
    <property name="groupName" value="OAuth Connections"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="oauthConnectionsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.OAuthConnectionsUsageStatisticsProvider">
    <property name="idFormat" value="jb.oauthConnection[%s]"/>
    <property name="groupName" value="OAuth Connections"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="oauthConnectionsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.OAuthConnectionsUsageStatisticsProvider">
    <property name="idFormat" value="jb.oauthConnection[%s]"/>
    <property name="groupName" value="OAuth Connections"/>
```

### SpringXmlModelInspection
Cannot resolve class 'OAuthConnectionsUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="oauthConnectionsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.OAuthConnectionsUsageStatisticsProvider">
    <property name="idFormat" value="jb.oauthConnection[%s]"/>
    <property name="groupName" value="OAuth Connections"/>
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="oauthConnectionsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.OAuthConnectionsUsageStatisticsProvider">
    <property name="idFormat" value="jb.oauthConnection[%s]"/>
    <property name="groupName" value="OAuth Connections"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="oauthConnectionsUsageStatisticsProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.OAuthConnectionsUsageStatisticsProvider">
    <property name="idFormat" value="jb.oauthConnection[%s]"/>
    <property name="groupName" value="OAuth Connections"/>
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="httpsConnectorUsageStatisticProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.HttpsConnectorUsageStatisticsProvider">
    <property name="idFormat" value="jb.httpsConnector.%s" />
    <property name="groupName" value="HTTPS Connector" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="httpsConnectorUsageStatisticProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.HttpsConnectorUsageStatisticsProvider">
    <property name="idFormat" value="jb.httpsConnector.%s" />
    <property name="groupName" value="HTTPS Connector" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="httpsConnectorUsageStatisticProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.HttpsConnectorUsageStatisticsProvider">
    <property name="idFormat" value="jb.httpsConnector.%s" />
    <property name="groupName" value="HTTPS Connector" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="httpsConnectorUsageStatisticProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.HttpsConnectorUsageStatisticsProvider">
    <property name="idFormat" value="jb.httpsConnector.%s" />
    <property name="groupName" value="HTTPS Connector" />
```

### SpringXmlModelInspection
Cannot resolve class or package 'providers'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="httpsConnectorUsageStatisticProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.HttpsConnectorUsageStatisticsProvider">
    <property name="idFormat" value="jb.httpsConnector.%s" />
    <property name="groupName" value="HTTPS Connector" />
```

### SpringXmlModelInspection
Cannot resolve class 'HttpsConnectorUsageStatisticsProvider'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  </bean>

  <bean id="httpsConnectorUsageStatisticProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.HttpsConnectorUsageStatisticsProvider">
    <property name="idFormat" value="jb.httpsConnector.%s" />
    <property name="groupName" value="HTTPS Connector" />
```

### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java

  <bean id="httpsConnectorUsageStatisticProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.HttpsConnectorUsageStatisticsProvider">
    <property name="idFormat" value="jb.httpsConnector.%s" />
    <property name="groupName" value="HTTPS Connector" />
  </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <bean id="httpsConnectorUsageStatisticProvider" class="jetbrains.buildServer.usageStatistics.impl.providers.HttpsConnectorUsageStatisticsProvider">
    <property name="idFormat" value="jb.httpsConnector.%s" />
    <property name="groupName" value="HTTPS Connector" />
  </bean>

```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Helpers -->

  <bean id="getRequestDetector" class="jetbrains.buildServer.usageStatistics.impl.GetRequestDetector"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Helpers -->

  <bean id="getRequestDetector" class="jetbrains.buildServer.usageStatistics.impl.GetRequestDetector"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'usageStatistics'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Helpers -->

  <bean id="getRequestDetector" class="jetbrains.buildServer.usageStatistics.impl.GetRequestDetector"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'impl'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Helpers -->

  <bean id="getRequestDetector" class="jetbrains.buildServer.usageStatistics.impl.GetRequestDetector"/>

</beans>
```

### SpringXmlModelInspection
Cannot resolve class 'GetRequestDetector'
in `usage-statistics-impl/src/META-INF/build-server-plugin-usage-statistics.xml`
#### Snippet
```java
  <!-- Helpers -->

  <bean id="getRequestDetector" class="jetbrains.buildServer.usageStatistics.impl.GetRequestDetector"/>

</beans>
```

